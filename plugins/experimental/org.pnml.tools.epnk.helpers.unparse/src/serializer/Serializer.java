package serializer;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import parserrules.Atom;
import parserrules.Choice;
import parserrules.ClassRef;
import parserrules.Conditional;
import parserrules.Element;
import parserrules.Feature;
import parserrules.Iterator;
import parserrules.Op;
import parserrules.OpType;
import parserrules.Rule;
import parserrules.Rules;
import parserrules.Sequence;
import parserrules.Symbol;
import parserrules.Token;

public class Serializer {
	
	@SuppressWarnings("unused")
	private List<EPackage> packages;
	
	private Rules rules;

	public Serializer(List<EPackage> packages, Rules rules) {
		super();
		this.packages = packages;
		this.rules = rules;
	}
	
	public String unparse(EObject object, String rulename) {
		Rule rule = lookupRule(rulename);
		if (rule != null) {
			TokenSequence result = unparse(new WrappedObject(object),rule);
			if (result != null) {
				return result.serialize();
			} else {
				return null;
			}
		} else {
			return null;
		}
	}
	
	private TokenSequence unparse(WrappedObject obj, Rule rule) {
		if (rule instanceof Iterator) {
			return unparse(obj, (Iterator) rule);
		} else if (rule instanceof Choice) {
			return unparse(obj, (Choice) rule);
		} else if (rule instanceof Op)  {
			return unparse(obj, (Op) rule);
		} else if (rule instanceof Atom)  {
			return unparse(obj, (Atom) rule);
		} else if (rule instanceof Sequence)  {
			return unparse(obj, (Sequence) rule);
		} else if (rule instanceof Element)  {
			return unparse(obj, (Element) rule);
		} else if (rule instanceof Symbol)  {
			return unparse(obj, (Symbol) rule);
		} else if (rule instanceof Conditional)  {
			return unparse(obj, (Conditional) rule);
		}
	
		return null;
	}
	
	private TokenSequence unparse(WrappedObject obj, Iterator rule) {
		TokenSequence result = new TokenSequence(rules.getMaxprio());
		
		ClassRef classRef = rule.getType();
		Rule subrule = rule.getRule();
		Feature feature = rule.getFeature();
		String  featureName = null;
		if (feature != null) {
			featureName = feature.getName();
		}
				
		if (classRef != null && !isInstanceOf(obj,classRef) ) {
			return null;
		}
		
		if (rule.getFirst() != null) {
			result.append(rule.getFirst());
		}
		
		int i = 0;
		while (i != rule.getUpper()) {
			WrappedObject subobj = obj;
			if (featureName != null) {
				EObject object = obj.getNextElementOfFeature(featureName);
				if (object == null) {
					break;
				}
				subobj = new WrappedObject(object);
			}
			TokenSequence res = unparse (subobj, subrule);
			if (res != null) {
				if (i > 0 && rule.getSep() != null ) {
					result.append(rule.getSep());
				}
				result.append(res);
			}  else {
				// eki: Test
				if (featureName != null) {
					obj.revert();
				}
				break;
			}
			i++;
		}
		
		if (i >= rule.getLower()) {
			if (rule.getLast() != null) {
				result.append(rule.getLast());
			}
		} else {
			return null;
		}
		
		return result;		
	}
	
	private TokenSequence unparse(WrappedObject obj, Choice rule) {
		for (Rule subrule : rule.getAlternative()) {
			TokenSequence result = unparse(obj,subrule);
			if (result != null) {
				return result;
			}
		}
		
		return null;
	}
	
	private TokenSequence unparse(WrappedObject obj, Op rule) {
		
		if (isInstanceOf(obj,rule.getType())) {
			EList<Feature> features = rule.getFeature();
			int upper = rule.getUpper();
			EObject parent = rule.eContainer();
			Choice choice = null;
			if (parent instanceof Choice) {
				choice = (Choice) parent;
			} else {
				return null;
			}
	
			if (upper == 1) {
				if (features.size() == 1) {
					EObject object = obj.getNextElementOfFeature(features.get(0).getName());
					TokenSequence result = unparse(new WrappedObject(object), choice);
					if (result != null) {
						if (result.getPriority() <= rule.getPrio()) {
							result = makeAtom(result,choice);
						}
						
						TokenSequence tmp = (new TokenSequence(rule.getPrio()));
						tmp.append(rule.getSymbol());
						tmp.append(result);
						return tmp;
					} else {
						return null;
					}
				} 
				
				return null;
				
			}
			
			if (upper > 1 || upper < 0) {
				if (features.size() >= 1) {
					int i = 0;
					TokenSequence result = new TokenSequence(rule.getPrio());
					while (i < upper || upper < 0) {
						int index = Math.min(i, features.size()-1);
						EObject object = obj.getNextElementOfFeature(features.get(index).getName());
						if (object == null) {
							obj.revert();
							return result;
						}
						TokenSequence tmp = unparse(new WrappedObject(object), choice);
						if (tmp != null) {
							if (rule.getAssoc().equals(OpType.LEFT) && i == 0) {
								if (tmp.getPriority() < rule.getPrio()) {
									tmp = makeAtom(tmp,choice);
								}
							} else {
								if (tmp.getPriority() <= rule.getPrio()) {
									tmp = makeAtom(tmp,choice);
								}}
						} else {
							return null;
						}
						
						if (i > 0) {
						result.append(rule.getSymbol());	
						}
						
						result.append(tmp);
						
						i++;
					}
					
					return result;
				}
			}
		}

		return null;
	}
	
	private TokenSequence unparse(WrappedObject obj, Atom rule) {
		if (rule.getDef() == rule.eContainer()) {
			return null;
		}
		TokenSequence result = new TokenSequence(rule.getPrio());
		
		if (rule.getFirst() != null) {
			result.append(rule.getFirst());
		}
		
		TokenSequence tmp = unparse(obj,rule.getDef());
		
		if (tmp != null) {
			result.append(tmp);
		} else {
			return null;
		}
		
		if (rule.getLast() != null) {
			result.append(rule.getLast());
		}
		
		return result;
	}
	
	private TokenSequence unparse(WrappedObject obj, Sequence rule) {
		ClassRef classRef = rule.getContext();
		if (classRef != null) {
			if (!this.isInstanceOf(obj, classRef) ) {
				obj.revert();
				return null;
			}
		}
		
		TokenSequence result = new TokenSequence(0);		
		for (Rule r : rule.getSequence()) {
			TokenSequence tmp = unparse(obj,r);
			if (tmp != null) {
				result.append(tmp);
			} else {
				return null;
			}
		}
		
		return result;
	}
	
	private TokenSequence unparse(WrappedObject obj, Element rule) {
		ClassRef classRef = rule.getType();
		if (classRef == null || isInstanceOf(obj, classRef)) {
			Feature feature = rule.getFeature();
			if (feature != null) {
				TokenSequence result = new TokenSequence(0);
				Token token = obj.getElementOfFeature(feature.getName());
				if (token != null) {
					result.append(token);
					return result;
				}
			}
		}
		
		return null;
		
	}
	
	private TokenSequence unparse(WrappedObject obj, Symbol rule) {
		Token token = rule.getToken();
		if (token != null) {
			TokenSequence result = new TokenSequence(0);
			result.append(token);
			return result;
		}
		return null;
	}
	
	private TokenSequence unparse(WrappedObject obj, Conditional rule) {
		String className = rule.getClass_();
		Class<?> clazz = null;
		try {
			clazz = Class.forName(className);
		} catch (ClassNotFoundException e) {
		}
		if (clazz != null) {
			Constructor<?> constructor = null;
			try {
				constructor = clazz.getConstructor(new Class<?>[]{});
			} catch (SecurityException e) {
			} catch (NoSuchMethodException e) {
			}
			if (constructor != null) {
				Object object = null;
				try {
					object = constructor.newInstance(new Object[]{});
				} catch (IllegalArgumentException e) {
				} catch (InstantiationException e) {
				} catch (IllegalAccessException e) {
				} catch (InvocationTargetException e) {
				}
				if (object != null && object instanceof Condition) {
					Rule nextRule = null;
					if (((Condition) object).evaluate(rule, obj.object)) {
						nextRule = rule.getThenCase();						
					} else {
						nextRule = rule.getElseCase();
					}
					if (nextRule != null) {
						return unparse(obj,nextRule);
					} else {
						return new TokenSequence(0);
					}
				}
			}
		}

		return null;
	}
	
	private TokenSequence makeAtom(TokenSequence sequence, Choice rule) {
		TokenSequence result = sequence;
		for (Rule r : rule.getAlternative()) {
			if (r instanceof Atom) {
				Atom atom = (Atom) r;
				if (atom.getDef() == rule) {
					Token first = atom.getFirst();
					Token last = atom.getLast();
					
					
					if (first != null) {
						result = new TokenSequence(atom.getPrio());
						result.append(first);
						result.append(sequence);
					}
					
					if (last != null) {
						result.append(last);
					}
					
					result.setPriority(atom.getPrio());
					return result;
				}
			}
		}
		
		return result;
	}
	
	private Rule lookupRule(String name) {
		for (Rule rule : rules.getRule()) {
			if (rule.getName().equals(name)) {
				return rule;
			}
		}
		return null;
	}
	
	private boolean isInstanceOf(EObject object, ClassRef classRef) {
		String name = object.eClass().getName();
		String name2 = classRef.getName();
		
		String packageName = object.eClass().getEPackage().getName();
		String packageName2 = classRef.getPackage();

		return name.equals(name2) && ( packageName2 == null || packageName2.equals("") || packageName.equals(packageName2));
	}
	
	private boolean isInstanceOf(WrappedObject obj, ClassRef classRef) {
		return isInstanceOf(obj.object, classRef);
	}
	
	
}

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package parserrules.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import parserrules.*;
import parserrules.Atom;
import parserrules.Choice;
import parserrules.ClassRef;
import parserrules.Element;
import parserrules.Feature;
import parserrules.Iterator;
import parserrules.Op;
import parserrules.OpType;
import parserrules.ParserrulesFactory;
import parserrules.ParserrulesPackage;
import parserrules.Rules;
import parserrules.Sequence;
import parserrules.Symbol;
import parserrules.Token;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParserrulesFactoryImpl extends EFactoryImpl implements ParserrulesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParserrulesFactory init() {
		try {
			ParserrulesFactory theParserrulesFactory = (ParserrulesFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.pnml.tools/epnk/helpers/parserrules/1.0"); 
			if (theParserrulesFactory != null) {
				return theParserrulesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ParserrulesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParserrulesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ParserrulesPackage.RULES: return createRules();
			case ParserrulesPackage.ITERATOR: return createIterator();
			case ParserrulesPackage.CLASS_REF: return createClassRef();
			case ParserrulesPackage.FEATURE: return createFeature();
			case ParserrulesPackage.CHOICE: return createChoice();
			case ParserrulesPackage.OP: return createOp();
			case ParserrulesPackage.ATOM: return createAtom();
			case ParserrulesPackage.TOKEN: return createToken();
			case ParserrulesPackage.SEQUENCE: return createSequence();
			case ParserrulesPackage.ELEMENT: return createElement();
			case ParserrulesPackage.SYMBOL: return createSymbol();
			case ParserrulesPackage.OPEN: return createOpen();
			case ParserrulesPackage.CLOSE: return createClose();
			case ParserrulesPackage.SEPARATOR: return createSeparator();
			case ParserrulesPackage.CONDITIONAL: return createConditional();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ParserrulesPackage.OP_TYPE:
				return createOpTypeFromString(eDataType, initialValue);
			case ParserrulesPackage.LINEBREAK_CATEGORY:
				return createLinebreakCategoryFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ParserrulesPackage.OP_TYPE:
				return convertOpTypeToString(eDataType, instanceValue);
			case ParserrulesPackage.LINEBREAK_CATEGORY:
				return convertLinebreakCategoryToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rules createRules() {
		RulesImpl rules = new RulesImpl();
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iterator createIterator() {
		IteratorImpl iterator = new IteratorImpl();
		return iterator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassRef createClassRef() {
		ClassRefImpl classRef = new ClassRefImpl();
		return classRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choice createChoice() {
		ChoiceImpl choice = new ChoiceImpl();
		return choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Op createOp() {
		OpImpl op = new OpImpl();
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atom createAtom() {
		AtomImpl atom = new AtomImpl();
		return atom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token createToken() {
		TokenImpl token = new TokenImpl();
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence createSequence() {
		SequenceImpl sequence = new SequenceImpl();
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symbol createSymbol() {
		SymbolImpl symbol = new SymbolImpl();
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Open createOpen() {
		OpenImpl open = new OpenImpl();
		return open;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Close createClose() {
		CloseImpl close = new CloseImpl();
		return close;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Separator createSeparator() {
		SeparatorImpl separator = new SeparatorImpl();
		return separator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conditional createConditional() {
		ConditionalImpl conditional = new ConditionalImpl();
		return conditional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpType createOpTypeFromString(EDataType eDataType, String initialValue) {
		OpType result = OpType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOpTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinebreakCategory createLinebreakCategoryFromString(EDataType eDataType, String initialValue) {
		LinebreakCategory result = LinebreakCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinebreakCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParserrulesPackage getParserrulesPackage() {
		return (ParserrulesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ParserrulesPackage getPackage() {
		return ParserrulesPackage.eINSTANCE;
	}

} //ParserrulesFactoryImpl

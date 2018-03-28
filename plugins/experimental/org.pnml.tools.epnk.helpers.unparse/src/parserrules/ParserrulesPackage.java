/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package parserrules;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see parserrules.ParserrulesFactory
 * @model kind="package"
 * @generated
 */
public interface ParserrulesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "parserrules";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.pnml.tools/epnk/helpers/parserrules/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "parserrules";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ParserrulesPackage eINSTANCE = parserrules.impl.ParserrulesPackageImpl.init();

	/**
	 * The meta object id for the '{@link parserrules.impl.RulesImpl <em>Rules</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see parserrules.impl.RulesImpl
	 * @see parserrules.impl.ParserrulesPackageImpl#getRules()
	 * @generated
	 */
	int RULES = 0;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES__RULE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES__FEATURE = 2;

	/**
	 * The feature id for the '<em><b>Maxprio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES__MAXPRIO = 3;

	/**
	 * The feature id for the '<em><b>Token</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES__TOKEN = 4;

	/**
	 * The number of structural features of the '<em>Rules</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link parserrules.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see parserrules.impl.RuleImpl
	 * @see parserrules.impl.ParserrulesPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__CONTEXT = 1;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link parserrules.impl.IteratorImpl <em>Iterator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see parserrules.impl.IteratorImpl
	 * @see parserrules.impl.ParserrulesPackageImpl#getIterator()
	 * @generated
	 */
	int ITERATOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__NAME = RULE__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__CONTEXT = RULE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__LOWER = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__UPPER = RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__TYPE = RULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__RULE = RULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__FIRST = RULE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sep</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__SEP = RULE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__LAST = RULE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR__FEATURE = RULE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Iterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_FEATURE_COUNT = RULE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link parserrules.impl.ClassRefImpl <em>Class Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see parserrules.impl.ClassRefImpl
	 * @see parserrules.impl.ParserrulesPackageImpl#getClassRef()
	 * @generated
	 */
	int CLASS_REF = 3;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_REF__PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_REF__NAME = 1;

	/**
	 * The number of structural features of the '<em>Class Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_REF_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link parserrules.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see parserrules.impl.FeatureImpl
	 * @see parserrules.impl.ParserrulesPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link parserrules.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see parserrules.impl.ChoiceImpl
	 * @see parserrules.impl.ParserrulesPackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__NAME = RULE__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__CONTEXT = RULE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Alternative</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__ALTERNATIVE = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__TYPE = RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = RULE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link parserrules.impl.OpImpl <em>Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see parserrules.impl.OpImpl
	 * @see parserrules.impl.ParserrulesPackageImpl#getOp()
	 * @generated
	 */
	int OP = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP__NAME = RULE__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP__CONTEXT = RULE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP__LOWER = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP__UPPER = RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Prio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP__PRIO = RULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP__TYPE = RULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP__FEATURE = RULE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Assoc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP__ASSOC = RULE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP__SYMBOL = RULE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_FEATURE_COUNT = RULE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link parserrules.impl.AtomImpl <em>Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see parserrules.impl.AtomImpl
	 * @see parserrules.impl.ParserrulesPackageImpl#getAtom()
	 * @generated
	 */
	int ATOM = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__NAME = RULE__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__CONTEXT = RULE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Prio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__PRIO = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__DEF = RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>First</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__FIRST = RULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__LAST = RULE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM_FEATURE_COUNT = RULE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link parserrules.impl.TokenImpl <em>Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see parserrules.impl.TokenImpl
	 * @see parserrules.impl.ParserrulesPackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 8;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Separator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__SEPARATOR = 1;

	/**
	 * The feature id for the '<em><b>Parenthesis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__PARENTHESIS = 2;

	/**
	 * The feature id for the '<em><b>Breakafter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__BREAKAFTER = 3;

	/**
	 * The feature id for the '<em><b>Breakbefore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__BREAKBEFORE = 4;

	/**
	 * The feature id for the '<em><b>Seperatorblanks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__SEPERATORBLANKS = 5;

	/**
	 * The number of structural features of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link parserrules.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see parserrules.impl.SequenceImpl
	 * @see parserrules.impl.ParserrulesPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__NAME = RULE__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__CONTEXT = RULE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__SEQUENCE = RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = RULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link parserrules.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see parserrules.impl.ElementImpl
	 * @see parserrules.impl.ParserrulesPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = RULE__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__CONTEXT = RULE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__FEATURE = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TYPE = RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = RULE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link parserrules.impl.SymbolImpl <em>Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see parserrules.impl.SymbolImpl
	 * @see parserrules.impl.ParserrulesPackageImpl#getSymbol()
	 * @generated
	 */
	int SYMBOL = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__NAME = RULE__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__CONTEXT = RULE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__TOKEN = RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_FEATURE_COUNT = RULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link parserrules.impl.ParenthesisImpl <em>Parenthesis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see parserrules.impl.ParenthesisImpl
	 * @see parserrules.impl.ParserrulesPackageImpl#getParenthesis()
	 * @generated
	 */
	int PARENTHESIS = 12;

	/**
	 * The number of structural features of the '<em>Parenthesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARENTHESIS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link parserrules.impl.OpenImpl <em>Open</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see parserrules.impl.OpenImpl
	 * @see parserrules.impl.ParserrulesPackageImpl#getOpen()
	 * @generated
	 */
	int OPEN = 13;

	/**
	 * The feature id for the '<em><b>Tabulate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN__TABULATE = PARENTHESIS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Absolute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN__ABSOLUTE = PARENTHESIS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN__OFFSET = PARENTHESIS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Open</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FEATURE_COUNT = PARENTHESIS_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link parserrules.impl.CloseImpl <em>Close</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see parserrules.impl.CloseImpl
	 * @see parserrules.impl.ParserrulesPackageImpl#getClose()
	 * @generated
	 */
	int CLOSE = 14;

	/**
	 * The number of structural features of the '<em>Close</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_FEATURE_COUNT = PARENTHESIS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link parserrules.impl.SeparatorImpl <em>Separator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see parserrules.impl.SeparatorImpl
	 * @see parserrules.impl.ParserrulesPackageImpl#getSeparator()
	 * @generated
	 */
	int SEPARATOR = 15;

	/**
	 * The feature id for the '<em><b>Blankbefore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATOR__BLANKBEFORE = 0;

	/**
	 * The feature id for the '<em><b>Blankafter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATOR__BLANKAFTER = 1;

	/**
	 * The number of structural features of the '<em>Separator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link parserrules.impl.ConditionalImpl <em>Conditional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see parserrules.impl.ConditionalImpl
	 * @see parserrules.impl.ParserrulesPackageImpl#getConditional()
	 * @generated
	 */
	int CONDITIONAL = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__NAME = RULE__NAME;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__CONTEXT = RULE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__CLASS = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__THEN_CASE = RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__ELSE_CASE = RULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conditional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_FEATURE_COUNT = RULE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link parserrules.OpType <em>Op Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see parserrules.OpType
	 * @see parserrules.impl.ParserrulesPackageImpl#getOpType()
	 * @generated
	 */
	int OP_TYPE = 17;


	/**
	 * The meta object id for the '{@link parserrules.LinebreakCategory <em>Linebreak Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see parserrules.LinebreakCategory
	 * @see parserrules.impl.ParserrulesPackageImpl#getLinebreakCategory()
	 * @generated
	 */
	int LINEBREAK_CATEGORY = 18;


	/**
	 * Returns the meta object for class '{@link parserrules.Rules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rules</em>'.
	 * @see parserrules.Rules
	 * @generated
	 */
	EClass getRules();

	/**
	 * Returns the meta object for the containment reference list '{@link parserrules.Rules#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule</em>'.
	 * @see parserrules.Rules#getRule()
	 * @see #getRules()
	 * @generated
	 */
	EReference getRules_Rule();

	/**
	 * Returns the meta object for the containment reference list '{@link parserrules.Rules#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type</em>'.
	 * @see parserrules.Rules#getType()
	 * @see #getRules()
	 * @generated
	 */
	EReference getRules_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link parserrules.Rules#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature</em>'.
	 * @see parserrules.Rules#getFeature()
	 * @see #getRules()
	 * @generated
	 */
	EReference getRules_Feature();

	/**
	 * Returns the meta object for the attribute '{@link parserrules.Rules#getMaxprio <em>Maxprio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maxprio</em>'.
	 * @see parserrules.Rules#getMaxprio()
	 * @see #getRules()
	 * @generated
	 */
	EAttribute getRules_Maxprio();

	/**
	 * Returns the meta object for the containment reference list '{@link parserrules.Rules#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Token</em>'.
	 * @see parserrules.Rules#getToken()
	 * @see #getRules()
	 * @generated
	 */
	EReference getRules_Token();

	/**
	 * Returns the meta object for class '{@link parserrules.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see parserrules.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link parserrules.Rule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see parserrules.Rule#getName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Name();

	/**
	 * Returns the meta object for the reference '{@link parserrules.Rule#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context</em>'.
	 * @see parserrules.Rule#getContext()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Context();

	/**
	 * Returns the meta object for class '{@link parserrules.Iterator <em>Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterator</em>'.
	 * @see parserrules.Iterator
	 * @generated
	 */
	EClass getIterator();

	/**
	 * Returns the meta object for the attribute '{@link parserrules.Iterator#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see parserrules.Iterator#getLower()
	 * @see #getIterator()
	 * @generated
	 */
	EAttribute getIterator_Lower();

	/**
	 * Returns the meta object for the attribute '{@link parserrules.Iterator#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see parserrules.Iterator#getUpper()
	 * @see #getIterator()
	 * @generated
	 */
	EAttribute getIterator_Upper();

	/**
	 * Returns the meta object for the reference '{@link parserrules.Iterator#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see parserrules.Iterator#getType()
	 * @see #getIterator()
	 * @generated
	 */
	EReference getIterator_Type();

	/**
	 * Returns the meta object for the reference '{@link parserrules.Iterator#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rule</em>'.
	 * @see parserrules.Iterator#getRule()
	 * @see #getIterator()
	 * @generated
	 */
	EReference getIterator_Rule();

	/**
	 * Returns the meta object for the reference '{@link parserrules.Iterator#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First</em>'.
	 * @see parserrules.Iterator#getFirst()
	 * @see #getIterator()
	 * @generated
	 */
	EReference getIterator_First();

	/**
	 * Returns the meta object for the reference '{@link parserrules.Iterator#getSep <em>Sep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sep</em>'.
	 * @see parserrules.Iterator#getSep()
	 * @see #getIterator()
	 * @generated
	 */
	EReference getIterator_Sep();

	/**
	 * Returns the meta object for the reference '{@link parserrules.Iterator#getLast <em>Last</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last</em>'.
	 * @see parserrules.Iterator#getLast()
	 * @see #getIterator()
	 * @generated
	 */
	EReference getIterator_Last();

	/**
	 * Returns the meta object for the reference '{@link parserrules.Iterator#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see parserrules.Iterator#getFeature()
	 * @see #getIterator()
	 * @generated
	 */
	EReference getIterator_Feature();

	/**
	 * Returns the meta object for class '{@link parserrules.ClassRef <em>Class Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Ref</em>'.
	 * @see parserrules.ClassRef
	 * @generated
	 */
	EClass getClassRef();

	/**
	 * Returns the meta object for the attribute '{@link parserrules.ClassRef#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see parserrules.ClassRef#getPackage()
	 * @see #getClassRef()
	 * @generated
	 */
	EAttribute getClassRef_Package();

	/**
	 * Returns the meta object for the attribute '{@link parserrules.ClassRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see parserrules.ClassRef#getName()
	 * @see #getClassRef()
	 * @generated
	 */
	EAttribute getClassRef_Name();

	/**
	 * Returns the meta object for class '{@link parserrules.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see parserrules.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link parserrules.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see parserrules.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the meta object for class '{@link parserrules.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see parserrules.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for the containment reference list '{@link parserrules.Choice#getAlternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alternative</em>'.
	 * @see parserrules.Choice#getAlternative()
	 * @see #getChoice()
	 * @generated
	 */
	EReference getChoice_Alternative();

	/**
	 * Returns the meta object for the reference '{@link parserrules.Choice#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see parserrules.Choice#getType()
	 * @see #getChoice()
	 * @generated
	 */
	EReference getChoice_Type();

	/**
	 * Returns the meta object for class '{@link parserrules.Op <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Op</em>'.
	 * @see parserrules.Op
	 * @generated
	 */
	EClass getOp();

	/**
	 * Returns the meta object for the attribute '{@link parserrules.Op#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see parserrules.Op#getLower()
	 * @see #getOp()
	 * @generated
	 */
	EAttribute getOp_Lower();

	/**
	 * Returns the meta object for the attribute '{@link parserrules.Op#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see parserrules.Op#getUpper()
	 * @see #getOp()
	 * @generated
	 */
	EAttribute getOp_Upper();

	/**
	 * Returns the meta object for the attribute '{@link parserrules.Op#getPrio <em>Prio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prio</em>'.
	 * @see parserrules.Op#getPrio()
	 * @see #getOp()
	 * @generated
	 */
	EAttribute getOp_Prio();

	/**
	 * Returns the meta object for the reference '{@link parserrules.Op#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see parserrules.Op#getType()
	 * @see #getOp()
	 * @generated
	 */
	EReference getOp_Type();

	/**
	 * Returns the meta object for the reference list '{@link parserrules.Op#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feature</em>'.
	 * @see parserrules.Op#getFeature()
	 * @see #getOp()
	 * @generated
	 */
	EReference getOp_Feature();

	/**
	 * Returns the meta object for the attribute '{@link parserrules.Op#getAssoc <em>Assoc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assoc</em>'.
	 * @see parserrules.Op#getAssoc()
	 * @see #getOp()
	 * @generated
	 */
	EAttribute getOp_Assoc();

	/**
	 * Returns the meta object for the reference '{@link parserrules.Op#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Symbol</em>'.
	 * @see parserrules.Op#getSymbol()
	 * @see #getOp()
	 * @generated
	 */
	EReference getOp_Symbol();

	/**
	 * Returns the meta object for class '{@link parserrules.Atom <em>Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atom</em>'.
	 * @see parserrules.Atom
	 * @generated
	 */
	EClass getAtom();

	/**
	 * Returns the meta object for the attribute '{@link parserrules.Atom#getPrio <em>Prio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prio</em>'.
	 * @see parserrules.Atom#getPrio()
	 * @see #getAtom()
	 * @generated
	 */
	EAttribute getAtom_Prio();

	/**
	 * Returns the meta object for the reference '{@link parserrules.Atom#getDef <em>Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Def</em>'.
	 * @see parserrules.Atom#getDef()
	 * @see #getAtom()
	 * @generated
	 */
	EReference getAtom_Def();

	/**
	 * Returns the meta object for the reference '{@link parserrules.Atom#getFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First</em>'.
	 * @see parserrules.Atom#getFirst()
	 * @see #getAtom()
	 * @generated
	 */
	EReference getAtom_First();

	/**
	 * Returns the meta object for the reference '{@link parserrules.Atom#getLast <em>Last</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last</em>'.
	 * @see parserrules.Atom#getLast()
	 * @see #getAtom()
	 * @generated
	 */
	EReference getAtom_Last();

	/**
	 * Returns the meta object for class '{@link parserrules.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token</em>'.
	 * @see parserrules.Token
	 * @generated
	 */
	EClass getToken();

	/**
	 * Returns the meta object for the attribute '{@link parserrules.Token#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see parserrules.Token#getText()
	 * @see #getToken()
	 * @generated
	 */
	EAttribute getToken_Text();

	/**
	 * Returns the meta object for the attribute '{@link parserrules.Token#isSeparator <em>Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Separator</em>'.
	 * @see parserrules.Token#isSeparator()
	 * @see #getToken()
	 * @generated
	 */
	EAttribute getToken_Separator();

	/**
	 * Returns the meta object for the containment reference '{@link parserrules.Token#getParenthesis <em>Parenthesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parenthesis</em>'.
	 * @see parserrules.Token#getParenthesis()
	 * @see #getToken()
	 * @generated
	 */
	EReference getToken_Parenthesis();

	/**
	 * Returns the meta object for the attribute '{@link parserrules.Token#getBreakafter <em>Breakafter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Breakafter</em>'.
	 * @see parserrules.Token#getBreakafter()
	 * @see #getToken()
	 * @generated
	 */
	EAttribute getToken_Breakafter();

	/**
	 * Returns the meta object for the attribute '{@link parserrules.Token#getBreakbefore <em>Breakbefore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Breakbefore</em>'.
	 * @see parserrules.Token#getBreakbefore()
	 * @see #getToken()
	 * @generated
	 */
	EAttribute getToken_Breakbefore();

	/**
	 * Returns the meta object for the containment reference '{@link parserrules.Token#getSeperatorblanks <em>Seperatorblanks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Seperatorblanks</em>'.
	 * @see parserrules.Token#getSeperatorblanks()
	 * @see #getToken()
	 * @generated
	 */
	EReference getToken_Seperatorblanks();

	/**
	 * Returns the meta object for class '{@link parserrules.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see parserrules.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the reference list '{@link parserrules.Sequence#getSequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sequence</em>'.
	 * @see parserrules.Sequence#getSequence()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Sequence();

	/**
	 * Returns the meta object for class '{@link parserrules.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see parserrules.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the reference '{@link parserrules.Element#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see parserrules.Element#getFeature()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Feature();

	/**
	 * Returns the meta object for the reference '{@link parserrules.Element#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see parserrules.Element#getType()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Type();

	/**
	 * Returns the meta object for class '{@link parserrules.Symbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbol</em>'.
	 * @see parserrules.Symbol
	 * @generated
	 */
	EClass getSymbol();

	/**
	 * Returns the meta object for the reference '{@link parserrules.Symbol#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Token</em>'.
	 * @see parserrules.Symbol#getToken()
	 * @see #getSymbol()
	 * @generated
	 */
	EReference getSymbol_Token();

	/**
	 * Returns the meta object for class '{@link parserrules.Parenthesis <em>Parenthesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parenthesis</em>'.
	 * @see parserrules.Parenthesis
	 * @generated
	 */
	EClass getParenthesis();

	/**
	 * Returns the meta object for class '{@link parserrules.Open <em>Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open</em>'.
	 * @see parserrules.Open
	 * @generated
	 */
	EClass getOpen();

	/**
	 * Returns the meta object for the attribute '{@link parserrules.Open#isTabulate <em>Tabulate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tabulate</em>'.
	 * @see parserrules.Open#isTabulate()
	 * @see #getOpen()
	 * @generated
	 */
	EAttribute getOpen_Tabulate();

	/**
	 * Returns the meta object for the attribute '{@link parserrules.Open#isAbsolute <em>Absolute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Absolute</em>'.
	 * @see parserrules.Open#isAbsolute()
	 * @see #getOpen()
	 * @generated
	 */
	EAttribute getOpen_Absolute();

	/**
	 * Returns the meta object for the attribute '{@link parserrules.Open#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see parserrules.Open#getOffset()
	 * @see #getOpen()
	 * @generated
	 */
	EAttribute getOpen_Offset();

	/**
	 * Returns the meta object for class '{@link parserrules.Close <em>Close</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Close</em>'.
	 * @see parserrules.Close
	 * @generated
	 */
	EClass getClose();

	/**
	 * Returns the meta object for class '{@link parserrules.Separator <em>Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Separator</em>'.
	 * @see parserrules.Separator
	 * @generated
	 */
	EClass getSeparator();

	/**
	 * Returns the meta object for the attribute '{@link parserrules.Separator#isBlankbefore <em>Blankbefore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blankbefore</em>'.
	 * @see parserrules.Separator#isBlankbefore()
	 * @see #getSeparator()
	 * @generated
	 */
	EAttribute getSeparator_Blankbefore();

	/**
	 * Returns the meta object for the attribute '{@link parserrules.Separator#isBlankafter <em>Blankafter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blankafter</em>'.
	 * @see parserrules.Separator#isBlankafter()
	 * @see #getSeparator()
	 * @generated
	 */
	EAttribute getSeparator_Blankafter();

	/**
	 * Returns the meta object for class '{@link parserrules.Conditional <em>Conditional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional</em>'.
	 * @see parserrules.Conditional
	 * @generated
	 */
	EClass getConditional();

	/**
	 * Returns the meta object for the attribute '{@link parserrules.Conditional#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see parserrules.Conditional#getClass_()
	 * @see #getConditional()
	 * @generated
	 */
	EAttribute getConditional_Class();

	/**
	 * Returns the meta object for the reference '{@link parserrules.Conditional#getThenCase <em>Then Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Then Case</em>'.
	 * @see parserrules.Conditional#getThenCase()
	 * @see #getConditional()
	 * @generated
	 */
	EReference getConditional_ThenCase();

	/**
	 * Returns the meta object for the reference '{@link parserrules.Conditional#getElseCase <em>Else Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Else Case</em>'.
	 * @see parserrules.Conditional#getElseCase()
	 * @see #getConditional()
	 * @generated
	 */
	EReference getConditional_ElseCase();

	/**
	 * Returns the meta object for enum '{@link parserrules.OpType <em>Op Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Op Type</em>'.
	 * @see parserrules.OpType
	 * @generated
	 */
	EEnum getOpType();

	/**
	 * Returns the meta object for enum '{@link parserrules.LinebreakCategory <em>Linebreak Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Linebreak Category</em>'.
	 * @see parserrules.LinebreakCategory
	 * @generated
	 */
	EEnum getLinebreakCategory();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ParserrulesFactory getParserrulesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link parserrules.impl.RulesImpl <em>Rules</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see parserrules.impl.RulesImpl
		 * @see parserrules.impl.ParserrulesPackageImpl#getRules()
		 * @generated
		 */
		EClass RULES = eINSTANCE.getRules();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULES__RULE = eINSTANCE.getRules_Rule();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULES__TYPE = eINSTANCE.getRules_Type();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULES__FEATURE = eINSTANCE.getRules_Feature();

		/**
		 * The meta object literal for the '<em><b>Maxprio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULES__MAXPRIO = eINSTANCE.getRules_Maxprio();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULES__TOKEN = eINSTANCE.getRules_Token();

		/**
		 * The meta object literal for the '{@link parserrules.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see parserrules.impl.RuleImpl
		 * @see parserrules.impl.ParserrulesPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__NAME = eINSTANCE.getRule_Name();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__CONTEXT = eINSTANCE.getRule_Context();

		/**
		 * The meta object literal for the '{@link parserrules.impl.IteratorImpl <em>Iterator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see parserrules.impl.IteratorImpl
		 * @see parserrules.impl.ParserrulesPackageImpl#getIterator()
		 * @generated
		 */
		EClass ITERATOR = eINSTANCE.getIterator();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATOR__LOWER = eINSTANCE.getIterator_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATOR__UPPER = eINSTANCE.getIterator_Upper();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATOR__TYPE = eINSTANCE.getIterator_Type();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATOR__RULE = eINSTANCE.getIterator_Rule();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATOR__FIRST = eINSTANCE.getIterator_First();

		/**
		 * The meta object literal for the '<em><b>Sep</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATOR__SEP = eINSTANCE.getIterator_Sep();

		/**
		 * The meta object literal for the '<em><b>Last</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATOR__LAST = eINSTANCE.getIterator_Last();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITERATOR__FEATURE = eINSTANCE.getIterator_Feature();

		/**
		 * The meta object literal for the '{@link parserrules.impl.ClassRefImpl <em>Class Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see parserrules.impl.ClassRefImpl
		 * @see parserrules.impl.ParserrulesPackageImpl#getClassRef()
		 * @generated
		 */
		EClass CLASS_REF = eINSTANCE.getClassRef();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_REF__PACKAGE = eINSTANCE.getClassRef_Package();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_REF__NAME = eINSTANCE.getClassRef_Name();

		/**
		 * The meta object literal for the '{@link parserrules.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see parserrules.impl.FeatureImpl
		 * @see parserrules.impl.ParserrulesPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

		/**
		 * The meta object literal for the '{@link parserrules.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see parserrules.impl.ChoiceImpl
		 * @see parserrules.impl.ParserrulesPackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '<em><b>Alternative</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOICE__ALTERNATIVE = eINSTANCE.getChoice_Alternative();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOICE__TYPE = eINSTANCE.getChoice_Type();

		/**
		 * The meta object literal for the '{@link parserrules.impl.OpImpl <em>Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see parserrules.impl.OpImpl
		 * @see parserrules.impl.ParserrulesPackageImpl#getOp()
		 * @generated
		 */
		EClass OP = eINSTANCE.getOp();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP__LOWER = eINSTANCE.getOp_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP__UPPER = eINSTANCE.getOp_Upper();

		/**
		 * The meta object literal for the '<em><b>Prio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP__PRIO = eINSTANCE.getOp_Prio();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OP__TYPE = eINSTANCE.getOp_Type();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OP__FEATURE = eINSTANCE.getOp_Feature();

		/**
		 * The meta object literal for the '<em><b>Assoc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP__ASSOC = eINSTANCE.getOp_Assoc();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OP__SYMBOL = eINSTANCE.getOp_Symbol();

		/**
		 * The meta object literal for the '{@link parserrules.impl.AtomImpl <em>Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see parserrules.impl.AtomImpl
		 * @see parserrules.impl.ParserrulesPackageImpl#getAtom()
		 * @generated
		 */
		EClass ATOM = eINSTANCE.getAtom();

		/**
		 * The meta object literal for the '<em><b>Prio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOM__PRIO = eINSTANCE.getAtom_Prio();

		/**
		 * The meta object literal for the '<em><b>Def</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOM__DEF = eINSTANCE.getAtom_Def();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOM__FIRST = eINSTANCE.getAtom_First();

		/**
		 * The meta object literal for the '<em><b>Last</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOM__LAST = eINSTANCE.getAtom_Last();

		/**
		 * The meta object literal for the '{@link parserrules.impl.TokenImpl <em>Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see parserrules.impl.TokenImpl
		 * @see parserrules.impl.ParserrulesPackageImpl#getToken()
		 * @generated
		 */
		EClass TOKEN = eINSTANCE.getToken();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN__TEXT = eINSTANCE.getToken_Text();

		/**
		 * The meta object literal for the '<em><b>Separator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN__SEPARATOR = eINSTANCE.getToken_Separator();

		/**
		 * The meta object literal for the '<em><b>Parenthesis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN__PARENTHESIS = eINSTANCE.getToken_Parenthesis();

		/**
		 * The meta object literal for the '<em><b>Breakafter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN__BREAKAFTER = eINSTANCE.getToken_Breakafter();

		/**
		 * The meta object literal for the '<em><b>Breakbefore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN__BREAKBEFORE = eINSTANCE.getToken_Breakbefore();

		/**
		 * The meta object literal for the '<em><b>Seperatorblanks</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN__SEPERATORBLANKS = eINSTANCE.getToken_Seperatorblanks();

		/**
		 * The meta object literal for the '{@link parserrules.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see parserrules.impl.SequenceImpl
		 * @see parserrules.impl.ParserrulesPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__SEQUENCE = eINSTANCE.getSequence_Sequence();

		/**
		 * The meta object literal for the '{@link parserrules.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see parserrules.impl.ElementImpl
		 * @see parserrules.impl.ParserrulesPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__FEATURE = eINSTANCE.getElement_Feature();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__TYPE = eINSTANCE.getElement_Type();

		/**
		 * The meta object literal for the '{@link parserrules.impl.SymbolImpl <em>Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see parserrules.impl.SymbolImpl
		 * @see parserrules.impl.ParserrulesPackageImpl#getSymbol()
		 * @generated
		 */
		EClass SYMBOL = eINSTANCE.getSymbol();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOL__TOKEN = eINSTANCE.getSymbol_Token();

		/**
		 * The meta object literal for the '{@link parserrules.impl.ParenthesisImpl <em>Parenthesis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see parserrules.impl.ParenthesisImpl
		 * @see parserrules.impl.ParserrulesPackageImpl#getParenthesis()
		 * @generated
		 */
		EClass PARENTHESIS = eINSTANCE.getParenthesis();

		/**
		 * The meta object literal for the '{@link parserrules.impl.OpenImpl <em>Open</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see parserrules.impl.OpenImpl
		 * @see parserrules.impl.ParserrulesPackageImpl#getOpen()
		 * @generated
		 */
		EClass OPEN = eINSTANCE.getOpen();

		/**
		 * The meta object literal for the '<em><b>Tabulate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN__TABULATE = eINSTANCE.getOpen_Tabulate();

		/**
		 * The meta object literal for the '<em><b>Absolute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN__ABSOLUTE = eINSTANCE.getOpen_Absolute();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN__OFFSET = eINSTANCE.getOpen_Offset();

		/**
		 * The meta object literal for the '{@link parserrules.impl.CloseImpl <em>Close</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see parserrules.impl.CloseImpl
		 * @see parserrules.impl.ParserrulesPackageImpl#getClose()
		 * @generated
		 */
		EClass CLOSE = eINSTANCE.getClose();

		/**
		 * The meta object literal for the '{@link parserrules.impl.SeparatorImpl <em>Separator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see parserrules.impl.SeparatorImpl
		 * @see parserrules.impl.ParserrulesPackageImpl#getSeparator()
		 * @generated
		 */
		EClass SEPARATOR = eINSTANCE.getSeparator();

		/**
		 * The meta object literal for the '<em><b>Blankbefore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEPARATOR__BLANKBEFORE = eINSTANCE.getSeparator_Blankbefore();

		/**
		 * The meta object literal for the '<em><b>Blankafter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEPARATOR__BLANKAFTER = eINSTANCE.getSeparator_Blankafter();

		/**
		 * The meta object literal for the '{@link parserrules.impl.ConditionalImpl <em>Conditional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see parserrules.impl.ConditionalImpl
		 * @see parserrules.impl.ParserrulesPackageImpl#getConditional()
		 * @generated
		 */
		EClass CONDITIONAL = eINSTANCE.getConditional();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL__CLASS = eINSTANCE.getConditional_Class();

		/**
		 * The meta object literal for the '<em><b>Then Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL__THEN_CASE = eINSTANCE.getConditional_ThenCase();

		/**
		 * The meta object literal for the '<em><b>Else Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL__ELSE_CASE = eINSTANCE.getConditional_ElseCase();

		/**
		 * The meta object literal for the '{@link parserrules.OpType <em>Op Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see parserrules.OpType
		 * @see parserrules.impl.ParserrulesPackageImpl#getOpType()
		 * @generated
		 */
		EEnum OP_TYPE = eINSTANCE.getOpType();

		/**
		 * The meta object literal for the '{@link parserrules.LinebreakCategory <em>Linebreak Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see parserrules.LinebreakCategory
		 * @see parserrules.impl.ParserrulesPackageImpl#getLinebreakCategory()
		 * @generated
		 */
		EEnum LINEBREAK_CATEGORY = eINSTANCE.getLinebreakCategory();

	}

} //ParserrulesPackage

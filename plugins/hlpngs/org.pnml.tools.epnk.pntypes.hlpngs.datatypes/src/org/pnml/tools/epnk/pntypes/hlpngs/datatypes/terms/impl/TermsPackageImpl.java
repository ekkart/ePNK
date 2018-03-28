/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.BooleansPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.booleans.impl.BooleansPackageImpl;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.DotsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.dots.impl.DotsPackageImpl;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.IntegersPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.integers.impl.IntegersPackageImpl;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.MultisetsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.multisets.impl.MultisetsPackageImpl;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.BuiltInConst;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.BuiltInOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.BuiltInSort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Declaration;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Declarations;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.MultiSetOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.MultiSetSort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.NamedSort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Operator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.OperatorDecl;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.ProductSort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Sort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.SortDecl;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Term;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsFactory;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Tuple;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.UserOperator;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.UserSort;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.Variable;
import org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.VariableDecl;
import org.pnml.tools.epnk.structuredpntypemodel.StructuredpntypemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TermsPackageImpl extends EPackageImpl implements TermsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedSortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass builtInSortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiSetSortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productSortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userSortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass builtInOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass builtInConstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiSetOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tupleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedOperatorEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.pnml.tools.epnk.pntypes.hlpngs.datatypes.terms.TermsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TermsPackageImpl() {
		super(eNS_URI, TermsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TermsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TermsPackage init() {
		if (isInited) return (TermsPackage)EPackage.Registry.INSTANCE.getEPackage(TermsPackage.eNS_URI);

		// Obtain or create and register package
		TermsPackageImpl theTermsPackage = (TermsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TermsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TermsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		StructuredpntypemodelPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DotsPackageImpl theDotsPackage = (DotsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DotsPackage.eNS_URI) instanceof DotsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DotsPackage.eNS_URI) : DotsPackage.eINSTANCE);
		MultisetsPackageImpl theMultisetsPackage = (MultisetsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MultisetsPackage.eNS_URI) instanceof MultisetsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MultisetsPackage.eNS_URI) : MultisetsPackage.eINSTANCE);
		BooleansPackageImpl theBooleansPackage = (BooleansPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BooleansPackage.eNS_URI) instanceof BooleansPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BooleansPackage.eNS_URI) : BooleansPackage.eINSTANCE);
		IntegersPackageImpl theIntegersPackage = (IntegersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IntegersPackage.eNS_URI) instanceof IntegersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IntegersPackage.eNS_URI) : IntegersPackage.eINSTANCE);

		// Create package meta-data objects
		theTermsPackage.createPackageContents();
		theDotsPackage.createPackageContents();
		theMultisetsPackage.createPackageContents();
		theBooleansPackage.createPackageContents();
		theIntegersPackage.createPackageContents();

		// Initialize created meta-data
		theTermsPackage.initializePackageContents();
		theDotsPackage.initializePackageContents();
		theMultisetsPackage.initializePackageContents();
		theBooleansPackage.initializePackageContents();
		theIntegersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTermsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TermsPackage.eNS_URI, theTermsPackage);
		return theTermsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclarations() {
		return declarationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeclarations_Declaration() {
		return (EReference)declarationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclaration() {
		return declarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSortDecl() {
		return sortDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDecl() {
		return variableDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableDecl_Sort() {
		return (EReference)variableDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_Refvariable() {
		return (EReference)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerm() {
		return termEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSort() {
		return sortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperator() {
		return operatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperator_Subterm() {
		return (EReference)operatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedSort() {
		return namedSortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedSort_Def() {
		return (EReference)namedSortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuiltInSort() {
		return builtInSortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiSetSort() {
		return multiSetSortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiSetSort_Basis() {
		return (EReference)multiSetSortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductSort() {
		return productSortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductSort_ElementSort() {
		return (EReference)productSortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserSort() {
		return userSortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserSort_Declaration() {
		return (EReference)userSortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuiltInOperator() {
		return builtInOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuiltInConst() {
		return builtInConstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiSetOperator() {
		return multiSetOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuple() {
		return tupleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserOperator() {
		return userOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserOperator_Declaration() {
		return (EReference)userOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperatorDecl() {
		return operatorDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedOperator() {
		return namedOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedOperator_Parameters() {
		return (EReference)namedOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedOperator_Def() {
		return (EReference)namedOperatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermsFactory getTermsFactory() {
		return (TermsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		declarationsEClass = createEClass(DECLARATIONS);
		createEReference(declarationsEClass, DECLARATIONS__DECLARATION);

		declarationEClass = createEClass(DECLARATION);

		sortDeclEClass = createEClass(SORT_DECL);

		variableDeclEClass = createEClass(VARIABLE_DECL);
		createEReference(variableDeclEClass, VARIABLE_DECL__SORT);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__REFVARIABLE);

		termEClass = createEClass(TERM);

		sortEClass = createEClass(SORT);

		operatorEClass = createEClass(OPERATOR);
		createEReference(operatorEClass, OPERATOR__SUBTERM);

		namedSortEClass = createEClass(NAMED_SORT);
		createEReference(namedSortEClass, NAMED_SORT__DEF);

		builtInSortEClass = createEClass(BUILT_IN_SORT);

		multiSetSortEClass = createEClass(MULTI_SET_SORT);
		createEReference(multiSetSortEClass, MULTI_SET_SORT__BASIS);

		productSortEClass = createEClass(PRODUCT_SORT);
		createEReference(productSortEClass, PRODUCT_SORT__ELEMENT_SORT);

		userSortEClass = createEClass(USER_SORT);
		createEReference(userSortEClass, USER_SORT__DECLARATION);

		builtInOperatorEClass = createEClass(BUILT_IN_OPERATOR);

		builtInConstEClass = createEClass(BUILT_IN_CONST);

		multiSetOperatorEClass = createEClass(MULTI_SET_OPERATOR);

		tupleEClass = createEClass(TUPLE);

		userOperatorEClass = createEClass(USER_OPERATOR);
		createEReference(userOperatorEClass, USER_OPERATOR__DECLARATION);

		operatorDeclEClass = createEClass(OPERATOR_DECL);

		namedOperatorEClass = createEClass(NAMED_OPERATOR);
		createEReference(namedOperatorEClass, NAMED_OPERATOR__PARAMETERS);
		createEReference(namedOperatorEClass, NAMED_OPERATOR__DEF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		StructuredpntypemodelPackage theStructuredpntypemodelPackage = (StructuredpntypemodelPackage)EPackage.Registry.INSTANCE.getEPackage(StructuredpntypemodelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		declarationEClass.getESuperTypes().add(theStructuredpntypemodelPackage.getSymbolDef());
		sortDeclEClass.getESuperTypes().add(this.getDeclaration());
		variableDeclEClass.getESuperTypes().add(this.getDeclaration());
		variableEClass.getESuperTypes().add(this.getTerm());
		variableEClass.getESuperTypes().add(theStructuredpntypemodelPackage.getSymbolUse());
		operatorEClass.getESuperTypes().add(this.getTerm());
		namedSortEClass.getESuperTypes().add(this.getSortDecl());
		builtInSortEClass.getESuperTypes().add(this.getSort());
		multiSetSortEClass.getESuperTypes().add(this.getSort());
		productSortEClass.getESuperTypes().add(this.getSort());
		userSortEClass.getESuperTypes().add(this.getSort());
		userSortEClass.getESuperTypes().add(theStructuredpntypemodelPackage.getSymbolUse());
		builtInOperatorEClass.getESuperTypes().add(this.getOperator());
		builtInConstEClass.getESuperTypes().add(this.getOperator());
		multiSetOperatorEClass.getESuperTypes().add(this.getOperator());
		tupleEClass.getESuperTypes().add(this.getOperator());
		userOperatorEClass.getESuperTypes().add(this.getOperator());
		userOperatorEClass.getESuperTypes().add(theStructuredpntypemodelPackage.getSymbolUse());
		operatorDeclEClass.getESuperTypes().add(this.getDeclaration());
		namedOperatorEClass.getESuperTypes().add(this.getOperatorDecl());

		// Initialize classes and features; add operations and parameters
		initEClass(declarationsEClass, Declarations.class, "Declarations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeclarations_Declaration(), this.getDeclaration(), null, "declaration", null, 0, -1, Declarations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(declarationEClass, Declaration.class, "Declaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sortDeclEClass, SortDecl.class, "SortDecl", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableDeclEClass, VariableDecl.class, "VariableDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableDecl_Sort(), this.getSort(), null, "sort", null, 1, 1, VariableDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_Refvariable(), this.getVariableDecl(), null, "refvariable", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(variableEClass, this.getSort(), "getSort", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(termEClass, Term.class, "Term", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(termEClass, this.getSort(), "getSort", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sortEClass, Sort.class, "Sort", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(sortEClass, ecorePackage.getEBoolean(), "equals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSort(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sortEClass, ecorePackage.getEBoolean(), "isSuperSortOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSort(), "sort", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(sortEClass, this.getSort(), "leastCommonSuper", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSort(), "sort", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(operatorEClass, Operator.class, "Operator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperator_Subterm(), this.getTerm(), null, "subterm", null, 0, -1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(operatorEClass, this.getSort(), "getInputSorts", 0, -1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(operatorEClass, this.getSort(), "getOutputSort", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(namedSortEClass, NamedSort.class, "NamedSort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamedSort_Def(), this.getSort(), null, "def", null, 1, 1, NamedSort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(builtInSortEClass, BuiltInSort.class, "BuiltInSort", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiSetSortEClass, MultiSetSort.class, "MultiSetSort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiSetSort_Basis(), this.getSort(), null, "basis", null, 1, 1, MultiSetSort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productSortEClass, ProductSort.class, "ProductSort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductSort_ElementSort(), this.getSort(), null, "elementSort", null, 0, -1, ProductSort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userSortEClass, UserSort.class, "UserSort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserSort_Declaration(), this.getSortDecl(), null, "declaration", null, 1, 1, UserSort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(builtInOperatorEClass, BuiltInOperator.class, "BuiltInOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(builtInConstEClass, BuiltInConst.class, "BuiltInConst", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiSetOperatorEClass, MultiSetOperator.class, "MultiSetOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tupleEClass, Tuple.class, "Tuple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(userOperatorEClass, UserOperator.class, "UserOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserOperator_Declaration(), this.getOperatorDecl(), null, "declaration", null, 1, 1, UserOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operatorDeclEClass, OperatorDecl.class, "OperatorDecl", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(operatorDeclEClass, this.getSort(), "getInputSorts", 0, -1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(operatorDeclEClass, this.getSort(), "getOutPutSort", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(namedOperatorEClass, NamedOperator.class, "NamedOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamedOperator_Parameters(), this.getVariableDecl(), null, "parameters", null, 0, -1, NamedOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamedOperator_Def(), this.getTerm(), null, "def", null, 1, 1, NamedOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TermsPackageImpl

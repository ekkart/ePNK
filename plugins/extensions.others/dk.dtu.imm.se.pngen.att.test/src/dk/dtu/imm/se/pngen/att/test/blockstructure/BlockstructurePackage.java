/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.pngen.att.test.blockstructure;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.BlockstructureFactory
 * @model kind="package"
 * @generated
 */
public interface BlockstructurePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "blockstructure";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://se.imm.dtu.dk/pngen/blockstructure";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pnbs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BlockstructurePackage eINSTANCE = dk.dtu.imm.se.pngen.att.test.blockstructure.impl.BlockstructurePackageImpl.init();

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.pngen.att.test.blockstructure.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.impl.BlockImpl
	 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.impl.BlockstructurePackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__START = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__END = 1;

	/**
	 * The feature id for the '<em><b>Startsafe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__STARTSAFE = 2;

	/**
	 * The feature id for the '<em><b>Endsafe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ENDSAFE = 3;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__COVERED = 4;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.pngen.att.test.blockstructure.impl.AtomicImpl <em>Atomic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.impl.AtomicImpl
	 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.impl.BlockstructurePackageImpl#getAtomic()
	 * @generated
	 */
	int ATOMIC = 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC__START = BLOCK__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC__END = BLOCK__END;

	/**
	 * The feature id for the '<em><b>Startsafe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC__STARTSAFE = BLOCK__STARTSAFE;

	/**
	 * The feature id for the '<em><b>Endsafe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC__ENDSAFE = BLOCK__ENDSAFE;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC__COVERED = BLOCK__COVERED;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC__TRANSITION = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atomic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.pngen.att.test.blockstructure.impl.CompositeImpl <em>Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.impl.CompositeImpl
	 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.impl.BlockstructurePackageImpl#getComposite()
	 * @generated
	 */
	int COMPOSITE = 2;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__START = BLOCK__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__END = BLOCK__END;

	/**
	 * The feature id for the '<em><b>Startsafe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__STARTSAFE = BLOCK__STARTSAFE;

	/**
	 * The feature id for the '<em><b>Endsafe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__ENDSAFE = BLOCK__ENDSAFE;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__COVERED = BLOCK__COVERED;

	/**
	 * The feature id for the '<em><b>Subblocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE__SUBBLOCKS = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.pngen.att.test.blockstructure.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.impl.ChoiceImpl
	 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.impl.BlockstructurePackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 3;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__START = COMPOSITE__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__END = COMPOSITE__END;

	/**
	 * The feature id for the '<em><b>Startsafe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__STARTSAFE = COMPOSITE__STARTSAFE;

	/**
	 * The feature id for the '<em><b>Endsafe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__ENDSAFE = COMPOSITE__ENDSAFE;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__COVERED = COMPOSITE__COVERED;

	/**
	 * The feature id for the '<em><b>Subblocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__SUBBLOCKS = COMPOSITE__SUBBLOCKS;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = COMPOSITE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.pngen.att.test.blockstructure.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.impl.SequenceImpl
	 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.impl.BlockstructurePackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 4;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__START = COMPOSITE__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__END = COMPOSITE__END;

	/**
	 * The feature id for the '<em><b>Startsafe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__STARTSAFE = COMPOSITE__STARTSAFE;

	/**
	 * The feature id for the '<em><b>Endsafe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ENDSAFE = COMPOSITE__ENDSAFE;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__COVERED = COMPOSITE__COVERED;

	/**
	 * The feature id for the '<em><b>Subblocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__SUBBLOCKS = COMPOSITE__SUBBLOCKS;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = COMPOSITE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.pngen.att.test.blockstructure.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.impl.LoopImpl
	 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.impl.BlockstructurePackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 5;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__START = BLOCK__START;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__END = BLOCK__END;

	/**
	 * The feature id for the '<em><b>Startsafe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__STARTSAFE = BLOCK__STARTSAFE;

	/**
	 * The feature id for the '<em><b>Endsafe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__ENDSAFE = BLOCK__ENDSAFE;

	/**
	 * The feature id for the '<em><b>Covered</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__COVERED = BLOCK__COVERED;

	/**
	 * The feature id for the '<em><b>Back</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__BACK = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__BODY = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.pngen.att.test.blockstructure.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the reference '{@link dk.dtu.imm.se.pngen.att.test.blockstructure.Block#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.Block#getStart()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Start();

	/**
	 * Returns the meta object for the reference '{@link dk.dtu.imm.se.pngen.att.test.blockstructure.Block#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.Block#getEnd()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_End();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.imm.se.pngen.att.test.blockstructure.Block#isStartsafe <em>Startsafe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Startsafe</em>'.
	 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.Block#isStartsafe()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Startsafe();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.imm.se.pngen.att.test.blockstructure.Block#isEndsafe <em>Endsafe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endsafe</em>'.
	 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.Block#isEndsafe()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Endsafe();

	/**
	 * Returns the meta object for the reference list '{@link dk.dtu.imm.se.pngen.att.test.blockstructure.Block#getCovered <em>Covered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Covered</em>'.
	 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.Block#getCovered()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Covered();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.pngen.att.test.blockstructure.Atomic <em>Atomic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic</em>'.
	 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.Atomic
	 * @generated
	 */
	EClass getAtomic();

	/**
	 * Returns the meta object for the reference '{@link dk.dtu.imm.se.pngen.att.test.blockstructure.Atomic#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transition</em>'.
	 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.Atomic#getTransition()
	 * @see #getAtomic()
	 * @generated
	 */
	EReference getAtomic_Transition();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.pngen.att.test.blockstructure.Composite <em>Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite</em>'.
	 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.Composite
	 * @generated
	 */
	EClass getComposite();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.dtu.imm.se.pngen.att.test.blockstructure.Composite#getSubblocks <em>Subblocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subblocks</em>'.
	 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.Composite#getSubblocks()
	 * @see #getComposite()
	 * @generated
	 */
	EReference getComposite_Subblocks();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.pngen.att.test.blockstructure.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.pngen.att.test.blockstructure.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.pngen.att.test.blockstructure.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for the reference '{@link dk.dtu.imm.se.pngen.att.test.blockstructure.Loop#getBack <em>Back</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Back</em>'.
	 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.Loop#getBack()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Back();

	/**
	 * Returns the meta object for the containment reference '{@link dk.dtu.imm.se.pngen.att.test.blockstructure.Loop#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.Loop#getBody()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Body();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BlockstructureFactory getBlockstructureFactory();

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
		 * The meta object literal for the '{@link dk.dtu.imm.se.pngen.att.test.blockstructure.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.impl.BlockImpl
		 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.impl.BlockstructurePackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__START = eINSTANCE.getBlock_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__END = eINSTANCE.getBlock_End();

		/**
		 * The meta object literal for the '<em><b>Startsafe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__STARTSAFE = eINSTANCE.getBlock_Startsafe();

		/**
		 * The meta object literal for the '<em><b>Endsafe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__ENDSAFE = eINSTANCE.getBlock_Endsafe();

		/**
		 * The meta object literal for the '<em><b>Covered</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__COVERED = eINSTANCE.getBlock_Covered();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.pngen.att.test.blockstructure.impl.AtomicImpl <em>Atomic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.impl.AtomicImpl
		 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.impl.BlockstructurePackageImpl#getAtomic()
		 * @generated
		 */
		EClass ATOMIC = eINSTANCE.getAtomic();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC__TRANSITION = eINSTANCE.getAtomic_Transition();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.pngen.att.test.blockstructure.impl.CompositeImpl <em>Composite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.impl.CompositeImpl
		 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.impl.BlockstructurePackageImpl#getComposite()
		 * @generated
		 */
		EClass COMPOSITE = eINSTANCE.getComposite();

		/**
		 * The meta object literal for the '<em><b>Subblocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE__SUBBLOCKS = eINSTANCE.getComposite_Subblocks();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.pngen.att.test.blockstructure.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.impl.ChoiceImpl
		 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.impl.BlockstructurePackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.pngen.att.test.blockstructure.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.impl.SequenceImpl
		 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.impl.BlockstructurePackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.pngen.att.test.blockstructure.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.impl.LoopImpl
		 * @see dk.dtu.imm.se.pngen.att.test.blockstructure.impl.BlockstructurePackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '<em><b>Back</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__BACK = eINSTANCE.getLoop_Back();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__BODY = eINSTANCE.getLoop_Body();

	}

} //BlockstructurePackage

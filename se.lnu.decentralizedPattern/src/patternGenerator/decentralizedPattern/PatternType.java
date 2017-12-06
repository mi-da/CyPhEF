/**
 */
package patternGenerator.decentralizedPattern;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Pattern Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see patternGenerator.decentralizedPattern.DecentralizedPatternPackage#getPatternType()
 * @model
 * @generated
 */
public enum PatternType implements Enumerator {
	/**
	 * The '<em><b>No Pattern</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_PATTERN_VALUE
	 * @generated
	 * @ordered
	 */
	NO_PATTERN(0, "NoPattern", "NoPattern"),

	/**
	 * The '<em><b>Info Sharing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFO_SHARING_VALUE
	 * @generated
	 * @ordered
	 */
	INFO_SHARING(1, "InfoSharing", "InfoSharing"),

	/**
	 * The '<em><b>Custom Pattern</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_PATTERN_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM_PATTERN(2, "CustomPattern", "CustomPattern"),

	/**
	 * The '<em><b>Coord Control</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COORD_CONTROL_VALUE
	 * @generated
	 * @ordered
	 */
	COORD_CONTROL(3, "CoordControl", "CoordControl"),

	/**
	 * The '<em><b>Hier Control</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIER_CONTROL_VALUE
	 * @generated
	 * @ordered
	 */
	HIER_CONTROL(4, "HierControl", "HierControl"),

	/**
	 * The '<em><b>Reg Planning</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REG_PLANNING_VALUE
	 * @generated
	 * @ordered
	 */
	REG_PLANNING(5, "RegPlanning", "RegPlanning"),

	/**
	 * The '<em><b>Master Slave</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER_SLAVE_VALUE
	 * @generated
	 * @ordered
	 */
	MASTER_SLAVE(6, "MasterSlave", "MasterSlave");

	/**
	 * The '<em><b>No Pattern</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Pattern</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_PATTERN
	 * @model name="NoPattern"
	 * @generated
	 * @ordered
	 */
	public static final int NO_PATTERN_VALUE = 0;

	/**
	 * The '<em><b>Info Sharing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Info Sharing</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INFO_SHARING
	 * @model name="InfoSharing"
	 * @generated
	 * @ordered
	 */
	public static final int INFO_SHARING_VALUE = 1;

	/**
	 * The '<em><b>Custom Pattern</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Custom Pattern</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_PATTERN
	 * @model name="CustomPattern"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM_PATTERN_VALUE = 2;

	/**
	 * The '<em><b>Coord Control</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Coord Control</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COORD_CONTROL
	 * @model name="CoordControl"
	 * @generated
	 * @ordered
	 */
	public static final int COORD_CONTROL_VALUE = 3;

	/**
	 * The '<em><b>Hier Control</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hier Control</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIER_CONTROL
	 * @model name="HierControl"
	 * @generated
	 * @ordered
	 */
	public static final int HIER_CONTROL_VALUE = 4;

	/**
	 * The '<em><b>Reg Planning</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reg Planning</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REG_PLANNING
	 * @model name="RegPlanning"
	 * @generated
	 * @ordered
	 */
	public static final int REG_PLANNING_VALUE = 5;

	/**
	 * The '<em><b>Master Slave</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Master Slave</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MASTER_SLAVE
	 * @model name="MasterSlave"
	 * @generated
	 * @ordered
	 */
	public static final int MASTER_SLAVE_VALUE = 6;

	/**
	 * An array of all the '<em><b>Pattern Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PatternType[] VALUES_ARRAY =
		new PatternType[] {
			NO_PATTERN,
			INFO_SHARING,
			CUSTOM_PATTERN,
			COORD_CONTROL,
			HIER_CONTROL,
			REG_PLANNING,
			MASTER_SLAVE,
		};

	/**
	 * A public read-only list of all the '<em><b>Pattern Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PatternType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Pattern Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PatternType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PatternType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pattern Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PatternType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PatternType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pattern Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PatternType get(int value) {
		switch (value) {
			case NO_PATTERN_VALUE: return NO_PATTERN;
			case INFO_SHARING_VALUE: return INFO_SHARING;
			case CUSTOM_PATTERN_VALUE: return CUSTOM_PATTERN;
			case COORD_CONTROL_VALUE: return COORD_CONTROL;
			case HIER_CONTROL_VALUE: return HIER_CONTROL;
			case REG_PLANNING_VALUE: return REG_PLANNING;
			case MASTER_SLAVE_VALUE: return MASTER_SLAVE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PatternType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //PatternType

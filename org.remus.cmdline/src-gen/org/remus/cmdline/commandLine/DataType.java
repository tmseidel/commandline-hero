/**
 */
package org.remus.cmdline.commandLine;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.remus.cmdline.commandLine.CommandLinePackage#getDataType()
 * @model
 * @generated
 */
public enum DataType implements Enumerator
{
  /**
   * The '<em><b>STRING</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STRING_VALUE
   * @generated
   * @ordered
   */
  STRING(0, "STRING", "STRING"),

  /**
   * The '<em><b>URL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #URL_VALUE
   * @generated
   * @ordered
   */
  URL(1, "URL", "URL"),

  /**
   * The '<em><b>DATA</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DATA_VALUE
   * @generated
   * @ordered
   */
  DATA(2, "DATA", "DATA"),

  /**
   * The '<em><b>PATH</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PATH_VALUE
   * @generated
   * @ordered
   */
  PATH(3, "PATH", "PATH"),

  /**
   * The '<em><b>FOLDERPATH</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FOLDERPATH_VALUE
   * @generated
   * @ordered
   */
  FOLDERPATH(4, "FOLDERPATH", "FOLDERPATH");

  /**
   * The '<em><b>STRING</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>STRING</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STRING
   * @model
   * @generated
   * @ordered
   */
  public static final int STRING_VALUE = 0;

  /**
   * The '<em><b>URL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>URL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #URL
   * @model
   * @generated
   * @ordered
   */
  public static final int URL_VALUE = 1;

  /**
   * The '<em><b>DATA</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DATA</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DATA
   * @model
   * @generated
   * @ordered
   */
  public static final int DATA_VALUE = 2;

  /**
   * The '<em><b>PATH</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PATH</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PATH
   * @model
   * @generated
   * @ordered
   */
  public static final int PATH_VALUE = 3;

  /**
   * The '<em><b>FOLDERPATH</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FOLDERPATH</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FOLDERPATH
   * @model
   * @generated
   * @ordered
   */
  public static final int FOLDERPATH_VALUE = 4;

  /**
   * An array of all the '<em><b>Data Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final DataType[] VALUES_ARRAY =
    new DataType[]
    {
      STRING,
      URL,
      DATA,
      PATH,
      FOLDERPATH,
    };

  /**
   * A public read-only list of all the '<em><b>Data Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<DataType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Data Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DataType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DataType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Data Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DataType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DataType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Data Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DataType get(int value)
  {
    switch (value)
    {
      case STRING_VALUE: return STRING;
      case URL_VALUE: return URL;
      case DATA_VALUE: return DATA;
      case PATH_VALUE: return PATH;
      case FOLDERPATH_VALUE: return FOLDERPATH;
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
  private DataType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //DataType

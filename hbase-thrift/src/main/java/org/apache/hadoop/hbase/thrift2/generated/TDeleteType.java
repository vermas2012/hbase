/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hbase.thrift2.generated;


/**
 * Specify type of delete:
 *  - DELETE_COLUMN means exactly one version will be removed,
 *  - DELETE_COLUMNS means previous versions will also be removed.
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-11-26")
public enum TDeleteType implements org.apache.thrift.TEnum {
  DELETE_COLUMN(0),
  DELETE_COLUMNS(1),
  DELETE_FAMILY(2),
  DELETE_FAMILY_VERSION(3);

  private final int value;

  private TDeleteType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  @org.apache.thrift.annotation.Nullable
  public static TDeleteType findByValue(int value) { 
    switch (value) {
      case 0:
        return DELETE_COLUMN;
      case 1:
        return DELETE_COLUMNS;
      case 2:
        return DELETE_FAMILY;
      case 3:
        return DELETE_FAMILY_VERSION;
      default:
        return null;
    }
  }
}

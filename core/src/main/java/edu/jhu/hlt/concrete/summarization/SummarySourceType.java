/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.jhu.hlt.concrete.summarization;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum SummarySourceType implements org.apache.thrift.TEnum {
  /**
   * Specifies that sourceIds is a list of Communication.UUIDs.
   * This can be used for single or multi-document summarization.
   */
  DOCUMENT(0),
  /**
   * Specifies that sourceIds is a list of Tokenization.UUIDs.
   */
  TOKENIZATION(1),
  /**
   * Specifies that sourceIds is a list of Entity.UUIDs
   */
  ENTITY(2);

  private final int value;

  private SummarySourceType(int value) {
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
  public static SummarySourceType findByValue(int value) { 
    switch (value) {
      case 0:
        return DOCUMENT;
      case 1:
        return TOKENIZATION;
      case 2:
        return ENTITY;
      default:
        return null;
    }
  }
}

/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.jhu.hlt.concrete;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * A list of pointers to tokens that all belong to the same
 * tokenization.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-01-10")
public class TokenRefSequence implements org.apache.thrift.TBase<TokenRefSequence, TokenRefSequence._Fields>, java.io.Serializable, Cloneable, Comparable<TokenRefSequence> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TokenRefSequence");

  private static final org.apache.thrift.protocol.TField TOKEN_INDEX_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("tokenIndexList", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField ANCHOR_TOKEN_INDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("anchorTokenIndex", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField TOKENIZATION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("tokenizationId", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField TEXT_SPAN_FIELD_DESC = new org.apache.thrift.protocol.TField("textSpan", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField RAW_TEXT_SPAN_FIELD_DESC = new org.apache.thrift.protocol.TField("rawTextSpan", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField AUDIO_SPAN_FIELD_DESC = new org.apache.thrift.protocol.TField("audioSpan", org.apache.thrift.protocol.TType.STRUCT, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TokenRefSequenceStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TokenRefSequenceTupleSchemeFactory());
  }

  private List<Integer> tokenIndexList; // required
  private int anchorTokenIndex; // optional
  private edu.jhu.hlt.concrete.UUID tokenizationId; // required
  private edu.jhu.hlt.concrete.TextSpan textSpan; // optional
  private edu.jhu.hlt.concrete.TextSpan rawTextSpan; // optional
  private edu.jhu.hlt.concrete.AudioSpan audioSpan; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * The tokenization-relative identifiers for each token that is
     * included in this sequence.
     */
    TOKEN_INDEX_LIST((short)1, "tokenIndexList"),
    /**
     * An optional field that can be used to describe
     * the root of a sentence (if this sequence is a full sentence),
     * the head of a constituent (if this sequence is a constituent),
     * or some other form of "canonical" token in this sequence if,
     * for instance, it is not easy to map this sequence to a another
     * annotation that has a head.
     * 
     * This field is defined with respect to the Tokenization given
     * by tokenizationId, and not to this object's tokenIndexList.
     */
    ANCHOR_TOKEN_INDEX((short)2, "anchorTokenIndex"),
    /**
     * The UUID of the tokenization that contains the tokens.
     */
    TOKENIZATION_ID((short)3, "tokenizationId"),
    /**
     * The text span in the main text (.text field) associated with this
     * TokenRefSequence.
     * 
     * NOTE: This span represents a best guess, or 'provenance': it
     * cannot be guaranteed that this text span matches the _exact_ text
     * of the original document, but is the annotation's best effort at
     * such a representation.
     */
    TEXT_SPAN((short)4, "textSpan"),
    /**
     * The text span in the original text (.originalText field)
     * associated with this TokenRefSequence.
     * 
     * NOTE: This span represents a best guess, or 'provenance': it
     * cannot be guaranteed that this text span matches the _exact_ text
     * of the original raw document, but is the annotation's best effort
     * at such a representation.
     */
    RAW_TEXT_SPAN((short)5, "rawTextSpan"),
    /**
     * The audio span associated with this TokenRefSequence.
     * 
     * NOTE: This span represents a best guess, or 'provenance':
     * it cannot be guaranteed that this text span matches the _exact_
     * text of the original document, but is the annotation's best
     * effort at such a representation.
     */
    AUDIO_SPAN((short)6, "audioSpan");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TOKEN_INDEX_LIST
          return TOKEN_INDEX_LIST;
        case 2: // ANCHOR_TOKEN_INDEX
          return ANCHOR_TOKEN_INDEX;
        case 3: // TOKENIZATION_ID
          return TOKENIZATION_ID;
        case 4: // TEXT_SPAN
          return TEXT_SPAN;
        case 5: // RAW_TEXT_SPAN
          return RAW_TEXT_SPAN;
        case 6: // AUDIO_SPAN
          return AUDIO_SPAN;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ANCHORTOKENINDEX_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ANCHOR_TOKEN_INDEX,_Fields.TEXT_SPAN,_Fields.RAW_TEXT_SPAN,_Fields.AUDIO_SPAN};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOKEN_INDEX_LIST, new org.apache.thrift.meta_data.FieldMetaData("tokenIndexList", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    tmpMap.put(_Fields.ANCHOR_TOKEN_INDEX, new org.apache.thrift.meta_data.FieldMetaData("anchorTokenIndex", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TOKENIZATION_ID, new org.apache.thrift.meta_data.FieldMetaData("tokenizationId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.jhu.hlt.concrete.UUID.class)));
    tmpMap.put(_Fields.TEXT_SPAN, new org.apache.thrift.meta_data.FieldMetaData("textSpan", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.jhu.hlt.concrete.TextSpan.class)));
    tmpMap.put(_Fields.RAW_TEXT_SPAN, new org.apache.thrift.meta_data.FieldMetaData("rawTextSpan", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.jhu.hlt.concrete.TextSpan.class)));
    tmpMap.put(_Fields.AUDIO_SPAN, new org.apache.thrift.meta_data.FieldMetaData("audioSpan", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.jhu.hlt.concrete.AudioSpan.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TokenRefSequence.class, metaDataMap);
  }

  public TokenRefSequence() {
    this.anchorTokenIndex = -1;

  }

  public TokenRefSequence(
    List<Integer> tokenIndexList,
    edu.jhu.hlt.concrete.UUID tokenizationId)
  {
    this();
    this.tokenIndexList = tokenIndexList;
    this.tokenizationId = tokenizationId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TokenRefSequence(TokenRefSequence other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTokenIndexList()) {
      List<Integer> __this__tokenIndexList = new ArrayList<Integer>(other.tokenIndexList);
      this.tokenIndexList = __this__tokenIndexList;
    }
    this.anchorTokenIndex = other.anchorTokenIndex;
    if (other.isSetTokenizationId()) {
      this.tokenizationId = new edu.jhu.hlt.concrete.UUID(other.tokenizationId);
    }
    if (other.isSetTextSpan()) {
      this.textSpan = new edu.jhu.hlt.concrete.TextSpan(other.textSpan);
    }
    if (other.isSetRawTextSpan()) {
      this.rawTextSpan = new edu.jhu.hlt.concrete.TextSpan(other.rawTextSpan);
    }
    if (other.isSetAudioSpan()) {
      this.audioSpan = new edu.jhu.hlt.concrete.AudioSpan(other.audioSpan);
    }
  }

  public TokenRefSequence deepCopy() {
    return new TokenRefSequence(this);
  }

  @Override
  public void clear() {
    this.tokenIndexList = null;
    this.anchorTokenIndex = -1;

    this.tokenizationId = null;
    this.textSpan = null;
    this.rawTextSpan = null;
    this.audioSpan = null;
  }

  public int getTokenIndexListSize() {
    return (this.tokenIndexList == null) ? 0 : this.tokenIndexList.size();
  }

  public java.util.Iterator<Integer> getTokenIndexListIterator() {
    return (this.tokenIndexList == null) ? null : this.tokenIndexList.iterator();
  }

  public void addToTokenIndexList(int elem) {
    if (this.tokenIndexList == null) {
      this.tokenIndexList = new ArrayList<Integer>();
    }
    this.tokenIndexList.add(elem);
  }

  /**
   * The tokenization-relative identifiers for each token that is
   * included in this sequence.
   */
  public List<Integer> getTokenIndexList() {
    return this.tokenIndexList;
  }

  /**
   * The tokenization-relative identifiers for each token that is
   * included in this sequence.
   */
  public TokenRefSequence setTokenIndexList(List<Integer> tokenIndexList) {
    this.tokenIndexList = tokenIndexList;
    return this;
  }

  public void unsetTokenIndexList() {
    this.tokenIndexList = null;
  }

  /** Returns true if field tokenIndexList is set (has been assigned a value) and false otherwise */
  public boolean isSetTokenIndexList() {
    return this.tokenIndexList != null;
  }

  public void setTokenIndexListIsSet(boolean value) {
    if (!value) {
      this.tokenIndexList = null;
    }
  }

  /**
   * An optional field that can be used to describe
   * the root of a sentence (if this sequence is a full sentence),
   * the head of a constituent (if this sequence is a constituent),
   * or some other form of "canonical" token in this sequence if,
   * for instance, it is not easy to map this sequence to a another
   * annotation that has a head.
   * 
   * This field is defined with respect to the Tokenization given
   * by tokenizationId, and not to this object's tokenIndexList.
   */
  public int getAnchorTokenIndex() {
    return this.anchorTokenIndex;
  }

  /**
   * An optional field that can be used to describe
   * the root of a sentence (if this sequence is a full sentence),
   * the head of a constituent (if this sequence is a constituent),
   * or some other form of "canonical" token in this sequence if,
   * for instance, it is not easy to map this sequence to a another
   * annotation that has a head.
   * 
   * This field is defined with respect to the Tokenization given
   * by tokenizationId, and not to this object's tokenIndexList.
   */
  public TokenRefSequence setAnchorTokenIndex(int anchorTokenIndex) {
    this.anchorTokenIndex = anchorTokenIndex;
    setAnchorTokenIndexIsSet(true);
    return this;
  }

  public void unsetAnchorTokenIndex() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ANCHORTOKENINDEX_ISSET_ID);
  }

  /** Returns true if field anchorTokenIndex is set (has been assigned a value) and false otherwise */
  public boolean isSetAnchorTokenIndex() {
    return EncodingUtils.testBit(__isset_bitfield, __ANCHORTOKENINDEX_ISSET_ID);
  }

  public void setAnchorTokenIndexIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ANCHORTOKENINDEX_ISSET_ID, value);
  }

  /**
   * The UUID of the tokenization that contains the tokens.
   */
  public edu.jhu.hlt.concrete.UUID getTokenizationId() {
    return this.tokenizationId;
  }

  /**
   * The UUID of the tokenization that contains the tokens.
   */
  public TokenRefSequence setTokenizationId(edu.jhu.hlt.concrete.UUID tokenizationId) {
    this.tokenizationId = tokenizationId;
    return this;
  }

  public void unsetTokenizationId() {
    this.tokenizationId = null;
  }

  /** Returns true if field tokenizationId is set (has been assigned a value) and false otherwise */
  public boolean isSetTokenizationId() {
    return this.tokenizationId != null;
  }

  public void setTokenizationIdIsSet(boolean value) {
    if (!value) {
      this.tokenizationId = null;
    }
  }

  /**
   * The text span in the main text (.text field) associated with this
   * TokenRefSequence.
   * 
   * NOTE: This span represents a best guess, or 'provenance': it
   * cannot be guaranteed that this text span matches the _exact_ text
   * of the original document, but is the annotation's best effort at
   * such a representation.
   */
  public edu.jhu.hlt.concrete.TextSpan getTextSpan() {
    return this.textSpan;
  }

  /**
   * The text span in the main text (.text field) associated with this
   * TokenRefSequence.
   * 
   * NOTE: This span represents a best guess, or 'provenance': it
   * cannot be guaranteed that this text span matches the _exact_ text
   * of the original document, but is the annotation's best effort at
   * such a representation.
   */
  public TokenRefSequence setTextSpan(edu.jhu.hlt.concrete.TextSpan textSpan) {
    this.textSpan = textSpan;
    return this;
  }

  public void unsetTextSpan() {
    this.textSpan = null;
  }

  /** Returns true if field textSpan is set (has been assigned a value) and false otherwise */
  public boolean isSetTextSpan() {
    return this.textSpan != null;
  }

  public void setTextSpanIsSet(boolean value) {
    if (!value) {
      this.textSpan = null;
    }
  }

  /**
   * The text span in the original text (.originalText field)
   * associated with this TokenRefSequence.
   * 
   * NOTE: This span represents a best guess, or 'provenance': it
   * cannot be guaranteed that this text span matches the _exact_ text
   * of the original raw document, but is the annotation's best effort
   * at such a representation.
   */
  public edu.jhu.hlt.concrete.TextSpan getRawTextSpan() {
    return this.rawTextSpan;
  }

  /**
   * The text span in the original text (.originalText field)
   * associated with this TokenRefSequence.
   * 
   * NOTE: This span represents a best guess, or 'provenance': it
   * cannot be guaranteed that this text span matches the _exact_ text
   * of the original raw document, but is the annotation's best effort
   * at such a representation.
   */
  public TokenRefSequence setRawTextSpan(edu.jhu.hlt.concrete.TextSpan rawTextSpan) {
    this.rawTextSpan = rawTextSpan;
    return this;
  }

  public void unsetRawTextSpan() {
    this.rawTextSpan = null;
  }

  /** Returns true if field rawTextSpan is set (has been assigned a value) and false otherwise */
  public boolean isSetRawTextSpan() {
    return this.rawTextSpan != null;
  }

  public void setRawTextSpanIsSet(boolean value) {
    if (!value) {
      this.rawTextSpan = null;
    }
  }

  /**
   * The audio span associated with this TokenRefSequence.
   * 
   * NOTE: This span represents a best guess, or 'provenance':
   * it cannot be guaranteed that this text span matches the _exact_
   * text of the original document, but is the annotation's best
   * effort at such a representation.
   */
  public edu.jhu.hlt.concrete.AudioSpan getAudioSpan() {
    return this.audioSpan;
  }

  /**
   * The audio span associated with this TokenRefSequence.
   * 
   * NOTE: This span represents a best guess, or 'provenance':
   * it cannot be guaranteed that this text span matches the _exact_
   * text of the original document, but is the annotation's best
   * effort at such a representation.
   */
  public TokenRefSequence setAudioSpan(edu.jhu.hlt.concrete.AudioSpan audioSpan) {
    this.audioSpan = audioSpan;
    return this;
  }

  public void unsetAudioSpan() {
    this.audioSpan = null;
  }

  /** Returns true if field audioSpan is set (has been assigned a value) and false otherwise */
  public boolean isSetAudioSpan() {
    return this.audioSpan != null;
  }

  public void setAudioSpanIsSet(boolean value) {
    if (!value) {
      this.audioSpan = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOKEN_INDEX_LIST:
      if (value == null) {
        unsetTokenIndexList();
      } else {
        setTokenIndexList((List<Integer>)value);
      }
      break;

    case ANCHOR_TOKEN_INDEX:
      if (value == null) {
        unsetAnchorTokenIndex();
      } else {
        setAnchorTokenIndex((Integer)value);
      }
      break;

    case TOKENIZATION_ID:
      if (value == null) {
        unsetTokenizationId();
      } else {
        setTokenizationId((edu.jhu.hlt.concrete.UUID)value);
      }
      break;

    case TEXT_SPAN:
      if (value == null) {
        unsetTextSpan();
      } else {
        setTextSpan((edu.jhu.hlt.concrete.TextSpan)value);
      }
      break;

    case RAW_TEXT_SPAN:
      if (value == null) {
        unsetRawTextSpan();
      } else {
        setRawTextSpan((edu.jhu.hlt.concrete.TextSpan)value);
      }
      break;

    case AUDIO_SPAN:
      if (value == null) {
        unsetAudioSpan();
      } else {
        setAudioSpan((edu.jhu.hlt.concrete.AudioSpan)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOKEN_INDEX_LIST:
      return getTokenIndexList();

    case ANCHOR_TOKEN_INDEX:
      return getAnchorTokenIndex();

    case TOKENIZATION_ID:
      return getTokenizationId();

    case TEXT_SPAN:
      return getTextSpan();

    case RAW_TEXT_SPAN:
      return getRawTextSpan();

    case AUDIO_SPAN:
      return getAudioSpan();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOKEN_INDEX_LIST:
      return isSetTokenIndexList();
    case ANCHOR_TOKEN_INDEX:
      return isSetAnchorTokenIndex();
    case TOKENIZATION_ID:
      return isSetTokenizationId();
    case TEXT_SPAN:
      return isSetTextSpan();
    case RAW_TEXT_SPAN:
      return isSetRawTextSpan();
    case AUDIO_SPAN:
      return isSetAudioSpan();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TokenRefSequence)
      return this.equals((TokenRefSequence)that);
    return false;
  }

  public boolean equals(TokenRefSequence that) {
    if (that == null)
      return false;

    boolean this_present_tokenIndexList = true && this.isSetTokenIndexList();
    boolean that_present_tokenIndexList = true && that.isSetTokenIndexList();
    if (this_present_tokenIndexList || that_present_tokenIndexList) {
      if (!(this_present_tokenIndexList && that_present_tokenIndexList))
        return false;
      if (!this.tokenIndexList.equals(that.tokenIndexList))
        return false;
    }

    boolean this_present_anchorTokenIndex = true && this.isSetAnchorTokenIndex();
    boolean that_present_anchorTokenIndex = true && that.isSetAnchorTokenIndex();
    if (this_present_anchorTokenIndex || that_present_anchorTokenIndex) {
      if (!(this_present_anchorTokenIndex && that_present_anchorTokenIndex))
        return false;
      if (this.anchorTokenIndex != that.anchorTokenIndex)
        return false;
    }

    boolean this_present_tokenizationId = true && this.isSetTokenizationId();
    boolean that_present_tokenizationId = true && that.isSetTokenizationId();
    if (this_present_tokenizationId || that_present_tokenizationId) {
      if (!(this_present_tokenizationId && that_present_tokenizationId))
        return false;
      if (!this.tokenizationId.equals(that.tokenizationId))
        return false;
    }

    boolean this_present_textSpan = true && this.isSetTextSpan();
    boolean that_present_textSpan = true && that.isSetTextSpan();
    if (this_present_textSpan || that_present_textSpan) {
      if (!(this_present_textSpan && that_present_textSpan))
        return false;
      if (!this.textSpan.equals(that.textSpan))
        return false;
    }

    boolean this_present_rawTextSpan = true && this.isSetRawTextSpan();
    boolean that_present_rawTextSpan = true && that.isSetRawTextSpan();
    if (this_present_rawTextSpan || that_present_rawTextSpan) {
      if (!(this_present_rawTextSpan && that_present_rawTextSpan))
        return false;
      if (!this.rawTextSpan.equals(that.rawTextSpan))
        return false;
    }

    boolean this_present_audioSpan = true && this.isSetAudioSpan();
    boolean that_present_audioSpan = true && that.isSetAudioSpan();
    if (this_present_audioSpan || that_present_audioSpan) {
      if (!(this_present_audioSpan && that_present_audioSpan))
        return false;
      if (!this.audioSpan.equals(that.audioSpan))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_tokenIndexList = true && (isSetTokenIndexList());
    list.add(present_tokenIndexList);
    if (present_tokenIndexList)
      list.add(tokenIndexList);

    boolean present_anchorTokenIndex = true && (isSetAnchorTokenIndex());
    list.add(present_anchorTokenIndex);
    if (present_anchorTokenIndex)
      list.add(anchorTokenIndex);

    boolean present_tokenizationId = true && (isSetTokenizationId());
    list.add(present_tokenizationId);
    if (present_tokenizationId)
      list.add(tokenizationId);

    boolean present_textSpan = true && (isSetTextSpan());
    list.add(present_textSpan);
    if (present_textSpan)
      list.add(textSpan);

    boolean present_rawTextSpan = true && (isSetRawTextSpan());
    list.add(present_rawTextSpan);
    if (present_rawTextSpan)
      list.add(rawTextSpan);

    boolean present_audioSpan = true && (isSetAudioSpan());
    list.add(present_audioSpan);
    if (present_audioSpan)
      list.add(audioSpan);

    return list.hashCode();
  }

  @Override
  public int compareTo(TokenRefSequence other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTokenIndexList()).compareTo(other.isSetTokenIndexList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTokenIndexList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tokenIndexList, other.tokenIndexList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAnchorTokenIndex()).compareTo(other.isSetAnchorTokenIndex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAnchorTokenIndex()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.anchorTokenIndex, other.anchorTokenIndex);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTokenizationId()).compareTo(other.isSetTokenizationId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTokenizationId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tokenizationId, other.tokenizationId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTextSpan()).compareTo(other.isSetTextSpan());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTextSpan()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.textSpan, other.textSpan);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRawTextSpan()).compareTo(other.isSetRawTextSpan());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRawTextSpan()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rawTextSpan, other.rawTextSpan);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAudioSpan()).compareTo(other.isSetAudioSpan());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAudioSpan()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.audioSpan, other.audioSpan);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TokenRefSequence(");
    boolean first = true;

    sb.append("tokenIndexList:");
    if (this.tokenIndexList == null) {
      sb.append("null");
    } else {
      sb.append(this.tokenIndexList);
    }
    first = false;
    if (isSetAnchorTokenIndex()) {
      if (!first) sb.append(", ");
      sb.append("anchorTokenIndex:");
      sb.append(this.anchorTokenIndex);
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("tokenizationId:");
    if (this.tokenizationId == null) {
      sb.append("null");
    } else {
      sb.append(this.tokenizationId);
    }
    first = false;
    if (isSetTextSpan()) {
      if (!first) sb.append(", ");
      sb.append("textSpan:");
      if (this.textSpan == null) {
        sb.append("null");
      } else {
        sb.append(this.textSpan);
      }
      first = false;
    }
    if (isSetRawTextSpan()) {
      if (!first) sb.append(", ");
      sb.append("rawTextSpan:");
      if (this.rawTextSpan == null) {
        sb.append("null");
      } else {
        sb.append(this.rawTextSpan);
      }
      first = false;
    }
    if (isSetAudioSpan()) {
      if (!first) sb.append(", ");
      sb.append("audioSpan:");
      if (this.audioSpan == null) {
        sb.append("null");
      } else {
        sb.append(this.audioSpan);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (tokenIndexList == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tokenIndexList' was not present! Struct: " + toString());
    }
    if (tokenizationId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tokenizationId' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (tokenizationId != null) {
      tokenizationId.validate();
    }
    if (textSpan != null) {
      textSpan.validate();
    }
    if (rawTextSpan != null) {
      rawTextSpan.validate();
    }
    if (audioSpan != null) {
      audioSpan.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TokenRefSequenceStandardSchemeFactory implements SchemeFactory {
    public TokenRefSequenceStandardScheme getScheme() {
      return new TokenRefSequenceStandardScheme();
    }
  }

  private static class TokenRefSequenceStandardScheme extends StandardScheme<TokenRefSequence> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TokenRefSequence struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOKEN_INDEX_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.tokenIndexList = new ArrayList<Integer>(_list0.size);
                int _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readI32();
                  struct.tokenIndexList.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setTokenIndexListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ANCHOR_TOKEN_INDEX
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.anchorTokenIndex = iprot.readI32();
              struct.setAnchorTokenIndexIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TOKENIZATION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.tokenizationId = new edu.jhu.hlt.concrete.UUID();
              struct.tokenizationId.read(iprot);
              struct.setTokenizationIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TEXT_SPAN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.textSpan = new edu.jhu.hlt.concrete.TextSpan();
              struct.textSpan.read(iprot);
              struct.setTextSpanIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // RAW_TEXT_SPAN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.rawTextSpan = new edu.jhu.hlt.concrete.TextSpan();
              struct.rawTextSpan.read(iprot);
              struct.setRawTextSpanIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // AUDIO_SPAN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.audioSpan = new edu.jhu.hlt.concrete.AudioSpan();
              struct.audioSpan.read(iprot);
              struct.setAudioSpanIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TokenRefSequence struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tokenIndexList != null) {
        oprot.writeFieldBegin(TOKEN_INDEX_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.tokenIndexList.size()));
          for (int _iter3 : struct.tokenIndexList)
          {
            oprot.writeI32(_iter3);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.isSetAnchorTokenIndex()) {
        oprot.writeFieldBegin(ANCHOR_TOKEN_INDEX_FIELD_DESC);
        oprot.writeI32(struct.anchorTokenIndex);
        oprot.writeFieldEnd();
      }
      if (struct.tokenizationId != null) {
        oprot.writeFieldBegin(TOKENIZATION_ID_FIELD_DESC);
        struct.tokenizationId.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.textSpan != null) {
        if (struct.isSetTextSpan()) {
          oprot.writeFieldBegin(TEXT_SPAN_FIELD_DESC);
          struct.textSpan.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.rawTextSpan != null) {
        if (struct.isSetRawTextSpan()) {
          oprot.writeFieldBegin(RAW_TEXT_SPAN_FIELD_DESC);
          struct.rawTextSpan.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.audioSpan != null) {
        if (struct.isSetAudioSpan()) {
          oprot.writeFieldBegin(AUDIO_SPAN_FIELD_DESC);
          struct.audioSpan.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TokenRefSequenceTupleSchemeFactory implements SchemeFactory {
    public TokenRefSequenceTupleScheme getScheme() {
      return new TokenRefSequenceTupleScheme();
    }
  }

  private static class TokenRefSequenceTupleScheme extends TupleScheme<TokenRefSequence> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TokenRefSequence struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.tokenIndexList.size());
        for (int _iter4 : struct.tokenIndexList)
        {
          oprot.writeI32(_iter4);
        }
      }
      struct.tokenizationId.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetAnchorTokenIndex()) {
        optionals.set(0);
      }
      if (struct.isSetTextSpan()) {
        optionals.set(1);
      }
      if (struct.isSetRawTextSpan()) {
        optionals.set(2);
      }
      if (struct.isSetAudioSpan()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetAnchorTokenIndex()) {
        oprot.writeI32(struct.anchorTokenIndex);
      }
      if (struct.isSetTextSpan()) {
        struct.textSpan.write(oprot);
      }
      if (struct.isSetRawTextSpan()) {
        struct.rawTextSpan.write(oprot);
      }
      if (struct.isSetAudioSpan()) {
        struct.audioSpan.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TokenRefSequence struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
        struct.tokenIndexList = new ArrayList<Integer>(_list5.size);
        int _elem6;
        for (int _i7 = 0; _i7 < _list5.size; ++_i7)
        {
          _elem6 = iprot.readI32();
          struct.tokenIndexList.add(_elem6);
        }
      }
      struct.setTokenIndexListIsSet(true);
      struct.tokenizationId = new edu.jhu.hlt.concrete.UUID();
      struct.tokenizationId.read(iprot);
      struct.setTokenizationIdIsSet(true);
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.anchorTokenIndex = iprot.readI32();
        struct.setAnchorTokenIndexIsSet(true);
      }
      if (incoming.get(1)) {
        struct.textSpan = new edu.jhu.hlt.concrete.TextSpan();
        struct.textSpan.read(iprot);
        struct.setTextSpanIsSet(true);
      }
      if (incoming.get(2)) {
        struct.rawTextSpan = new edu.jhu.hlt.concrete.TextSpan();
        struct.rawTextSpan.read(iprot);
        struct.setRawTextSpanIsSet(true);
      }
      if (incoming.get(3)) {
        struct.audioSpan = new edu.jhu.hlt.concrete.AudioSpan();
        struct.audioSpan.read(iprot);
        struct.setAudioSpanIsSet(true);
      }
    }
  }

}


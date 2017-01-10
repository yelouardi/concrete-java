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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-01-04")
public class TaggedToken implements org.apache.thrift.TBase<TaggedToken, TaggedToken._Fields>, java.io.Serializable, Cloneable, Comparable<TaggedToken> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TaggedToken");

  private static final org.apache.thrift.protocol.TField TOKEN_INDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("tokenIndex", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TAG_FIELD_DESC = new org.apache.thrift.protocol.TField("tag", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CONFIDENCE_FIELD_DESC = new org.apache.thrift.protocol.TField("confidence", org.apache.thrift.protocol.TType.DOUBLE, (short)3);
  private static final org.apache.thrift.protocol.TField TAG_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("tagList", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField CONFIDENCE_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("confidenceList", org.apache.thrift.protocol.TType.LIST, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TaggedTokenStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TaggedTokenTupleSchemeFactory());
  }

  private int tokenIndex; // optional
  private String tag; // optional
  private double confidence; // optional
  private List<String> tagList; // optional
  private List<Double> confidenceList; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * A pointer to the token being tagged.
     * 
     * Token indices are 0-based. These indices are also 0-based.
     */
    TOKEN_INDEX((short)1, "tokenIndex"),
    /**
     * A string containing the annotation.
     * If the tag set you are using is not case sensitive,
     * then all part of speech tags should be normalized to upper case.
     */
    TAG((short)2, "tag"),
    /**
     * Confidence of the annotation.
     */
    CONFIDENCE((short)3, "confidence"),
    /**
     * A list of strings that represent a distribution of possible
     * tags for this token.
     * 
     * If populated, the 'tag' field should also be populated
     * with the "best" value from this list.
     */
    TAG_LIST((short)4, "tagList"),
    /**
     * A list of doubles that represent confidences associated with
     * the tags in the 'tagList' field.
     * 
     * If populated, the 'confidence' field should also be populated
     * with the confidence associated with the "best" tag in 'tagList'.
     */
    CONFIDENCE_LIST((short)5, "confidenceList");

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
        case 1: // TOKEN_INDEX
          return TOKEN_INDEX;
        case 2: // TAG
          return TAG;
        case 3: // CONFIDENCE
          return CONFIDENCE;
        case 4: // TAG_LIST
          return TAG_LIST;
        case 5: // CONFIDENCE_LIST
          return CONFIDENCE_LIST;
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
  private static final int __TOKENINDEX_ISSET_ID = 0;
  private static final int __CONFIDENCE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TOKEN_INDEX,_Fields.TAG,_Fields.CONFIDENCE,_Fields.TAG_LIST,_Fields.CONFIDENCE_LIST};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOKEN_INDEX, new org.apache.thrift.meta_data.FieldMetaData("tokenIndex", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TAG, new org.apache.thrift.meta_data.FieldMetaData("tag", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CONFIDENCE, new org.apache.thrift.meta_data.FieldMetaData("confidence", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.TAG_LIST, new org.apache.thrift.meta_data.FieldMetaData("tagList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.CONFIDENCE_LIST, new org.apache.thrift.meta_data.FieldMetaData("confidenceList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TaggedToken.class, metaDataMap);
  }

  public TaggedToken() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TaggedToken(TaggedToken other) {
    __isset_bitfield = other.__isset_bitfield;
    this.tokenIndex = other.tokenIndex;
    if (other.isSetTag()) {
      this.tag = other.tag;
    }
    this.confidence = other.confidence;
    if (other.isSetTagList()) {
      List<String> __this__tagList = new ArrayList<String>(other.tagList);
      this.tagList = __this__tagList;
    }
    if (other.isSetConfidenceList()) {
      List<Double> __this__confidenceList = new ArrayList<Double>(other.confidenceList);
      this.confidenceList = __this__confidenceList;
    }
  }

  public TaggedToken deepCopy() {
    return new TaggedToken(this);
  }

  @Override
  public void clear() {
    setTokenIndexIsSet(false);
    this.tokenIndex = 0;
    this.tag = null;
    setConfidenceIsSet(false);
    this.confidence = 0.0;
    this.tagList = null;
    this.confidenceList = null;
  }

  /**
   * A pointer to the token being tagged.
   * 
   * Token indices are 0-based. These indices are also 0-based.
   */
  public int getTokenIndex() {
    return this.tokenIndex;
  }

  /**
   * A pointer to the token being tagged.
   * 
   * Token indices are 0-based. These indices are also 0-based.
   */
  public TaggedToken setTokenIndex(int tokenIndex) {
    this.tokenIndex = tokenIndex;
    setTokenIndexIsSet(true);
    return this;
  }

  public void unsetTokenIndex() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TOKENINDEX_ISSET_ID);
  }

  /** Returns true if field tokenIndex is set (has been assigned a value) and false otherwise */
  public boolean isSetTokenIndex() {
    return EncodingUtils.testBit(__isset_bitfield, __TOKENINDEX_ISSET_ID);
  }

  public void setTokenIndexIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TOKENINDEX_ISSET_ID, value);
  }

  /**
   * A string containing the annotation.
   * If the tag set you are using is not case sensitive,
   * then all part of speech tags should be normalized to upper case.
   */
  public String getTag() {
    return this.tag;
  }

  /**
   * A string containing the annotation.
   * If the tag set you are using is not case sensitive,
   * then all part of speech tags should be normalized to upper case.
   */
  public TaggedToken setTag(String tag) {
    this.tag = tag;
    return this;
  }

  public void unsetTag() {
    this.tag = null;
  }

  /** Returns true if field tag is set (has been assigned a value) and false otherwise */
  public boolean isSetTag() {
    return this.tag != null;
  }

  public void setTagIsSet(boolean value) {
    if (!value) {
      this.tag = null;
    }
  }

  /**
   * Confidence of the annotation.
   */
  public double getConfidence() {
    return this.confidence;
  }

  /**
   * Confidence of the annotation.
   */
  public TaggedToken setConfidence(double confidence) {
    this.confidence = confidence;
    setConfidenceIsSet(true);
    return this;
  }

  public void unsetConfidence() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CONFIDENCE_ISSET_ID);
  }

  /** Returns true if field confidence is set (has been assigned a value) and false otherwise */
  public boolean isSetConfidence() {
    return EncodingUtils.testBit(__isset_bitfield, __CONFIDENCE_ISSET_ID);
  }

  public void setConfidenceIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CONFIDENCE_ISSET_ID, value);
  }

  public int getTagListSize() {
    return (this.tagList == null) ? 0 : this.tagList.size();
  }

  public java.util.Iterator<String> getTagListIterator() {
    return (this.tagList == null) ? null : this.tagList.iterator();
  }

  public void addToTagList(String elem) {
    if (this.tagList == null) {
      this.tagList = new ArrayList<String>();
    }
    this.tagList.add(elem);
  }

  /**
   * A list of strings that represent a distribution of possible
   * tags for this token.
   * 
   * If populated, the 'tag' field should also be populated
   * with the "best" value from this list.
   */
  public List<String> getTagList() {
    return this.tagList;
  }

  /**
   * A list of strings that represent a distribution of possible
   * tags for this token.
   * 
   * If populated, the 'tag' field should also be populated
   * with the "best" value from this list.
   */
  public TaggedToken setTagList(List<String> tagList) {
    this.tagList = tagList;
    return this;
  }

  public void unsetTagList() {
    this.tagList = null;
  }

  /** Returns true if field tagList is set (has been assigned a value) and false otherwise */
  public boolean isSetTagList() {
    return this.tagList != null;
  }

  public void setTagListIsSet(boolean value) {
    if (!value) {
      this.tagList = null;
    }
  }

  public int getConfidenceListSize() {
    return (this.confidenceList == null) ? 0 : this.confidenceList.size();
  }

  public java.util.Iterator<Double> getConfidenceListIterator() {
    return (this.confidenceList == null) ? null : this.confidenceList.iterator();
  }

  public void addToConfidenceList(double elem) {
    if (this.confidenceList == null) {
      this.confidenceList = new ArrayList<Double>();
    }
    this.confidenceList.add(elem);
  }

  /**
   * A list of doubles that represent confidences associated with
   * the tags in the 'tagList' field.
   * 
   * If populated, the 'confidence' field should also be populated
   * with the confidence associated with the "best" tag in 'tagList'.
   */
  public List<Double> getConfidenceList() {
    return this.confidenceList;
  }

  /**
   * A list of doubles that represent confidences associated with
   * the tags in the 'tagList' field.
   * 
   * If populated, the 'confidence' field should also be populated
   * with the confidence associated with the "best" tag in 'tagList'.
   */
  public TaggedToken setConfidenceList(List<Double> confidenceList) {
    this.confidenceList = confidenceList;
    return this;
  }

  public void unsetConfidenceList() {
    this.confidenceList = null;
  }

  /** Returns true if field confidenceList is set (has been assigned a value) and false otherwise */
  public boolean isSetConfidenceList() {
    return this.confidenceList != null;
  }

  public void setConfidenceListIsSet(boolean value) {
    if (!value) {
      this.confidenceList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOKEN_INDEX:
      if (value == null) {
        unsetTokenIndex();
      } else {
        setTokenIndex((Integer)value);
      }
      break;

    case TAG:
      if (value == null) {
        unsetTag();
      } else {
        setTag((String)value);
      }
      break;

    case CONFIDENCE:
      if (value == null) {
        unsetConfidence();
      } else {
        setConfidence((Double)value);
      }
      break;

    case TAG_LIST:
      if (value == null) {
        unsetTagList();
      } else {
        setTagList((List<String>)value);
      }
      break;

    case CONFIDENCE_LIST:
      if (value == null) {
        unsetConfidenceList();
      } else {
        setConfidenceList((List<Double>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOKEN_INDEX:
      return getTokenIndex();

    case TAG:
      return getTag();

    case CONFIDENCE:
      return getConfidence();

    case TAG_LIST:
      return getTagList();

    case CONFIDENCE_LIST:
      return getConfidenceList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOKEN_INDEX:
      return isSetTokenIndex();
    case TAG:
      return isSetTag();
    case CONFIDENCE:
      return isSetConfidence();
    case TAG_LIST:
      return isSetTagList();
    case CONFIDENCE_LIST:
      return isSetConfidenceList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TaggedToken)
      return this.equals((TaggedToken)that);
    return false;
  }

  public boolean equals(TaggedToken that) {
    if (that == null)
      return false;

    boolean this_present_tokenIndex = true && this.isSetTokenIndex();
    boolean that_present_tokenIndex = true && that.isSetTokenIndex();
    if (this_present_tokenIndex || that_present_tokenIndex) {
      if (!(this_present_tokenIndex && that_present_tokenIndex))
        return false;
      if (this.tokenIndex != that.tokenIndex)
        return false;
    }

    boolean this_present_tag = true && this.isSetTag();
    boolean that_present_tag = true && that.isSetTag();
    if (this_present_tag || that_present_tag) {
      if (!(this_present_tag && that_present_tag))
        return false;
      if (!this.tag.equals(that.tag))
        return false;
    }

    boolean this_present_confidence = true && this.isSetConfidence();
    boolean that_present_confidence = true && that.isSetConfidence();
    if (this_present_confidence || that_present_confidence) {
      if (!(this_present_confidence && that_present_confidence))
        return false;
      if (this.confidence != that.confidence)
        return false;
    }

    boolean this_present_tagList = true && this.isSetTagList();
    boolean that_present_tagList = true && that.isSetTagList();
    if (this_present_tagList || that_present_tagList) {
      if (!(this_present_tagList && that_present_tagList))
        return false;
      if (!this.tagList.equals(that.tagList))
        return false;
    }

    boolean this_present_confidenceList = true && this.isSetConfidenceList();
    boolean that_present_confidenceList = true && that.isSetConfidenceList();
    if (this_present_confidenceList || that_present_confidenceList) {
      if (!(this_present_confidenceList && that_present_confidenceList))
        return false;
      if (!this.confidenceList.equals(that.confidenceList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_tokenIndex = true && (isSetTokenIndex());
    list.add(present_tokenIndex);
    if (present_tokenIndex)
      list.add(tokenIndex);

    boolean present_tag = true && (isSetTag());
    list.add(present_tag);
    if (present_tag)
      list.add(tag);

    boolean present_confidence = true && (isSetConfidence());
    list.add(present_confidence);
    if (present_confidence)
      list.add(confidence);

    boolean present_tagList = true && (isSetTagList());
    list.add(present_tagList);
    if (present_tagList)
      list.add(tagList);

    boolean present_confidenceList = true && (isSetConfidenceList());
    list.add(present_confidenceList);
    if (present_confidenceList)
      list.add(confidenceList);

    return list.hashCode();
  }

  @Override
  public int compareTo(TaggedToken other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTokenIndex()).compareTo(other.isSetTokenIndex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTokenIndex()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tokenIndex, other.tokenIndex);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTag()).compareTo(other.isSetTag());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTag()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tag, other.tag);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetConfidence()).compareTo(other.isSetConfidence());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConfidence()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.confidence, other.confidence);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTagList()).compareTo(other.isSetTagList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTagList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tagList, other.tagList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetConfidenceList()).compareTo(other.isSetConfidenceList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetConfidenceList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.confidenceList, other.confidenceList);
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
    StringBuilder sb = new StringBuilder("TaggedToken(");
    boolean first = true;

    if (isSetTokenIndex()) {
      sb.append("tokenIndex:");
      sb.append(this.tokenIndex);
      first = false;
    }
    if (isSetTag()) {
      if (!first) sb.append(", ");
      sb.append("tag:");
      if (this.tag == null) {
        sb.append("null");
      } else {
        sb.append(this.tag);
      }
      first = false;
    }
    if (isSetConfidence()) {
      if (!first) sb.append(", ");
      sb.append("confidence:");
      sb.append(this.confidence);
      first = false;
    }
    if (isSetTagList()) {
      if (!first) sb.append(", ");
      sb.append("tagList:");
      if (this.tagList == null) {
        sb.append("null");
      } else {
        sb.append(this.tagList);
      }
      first = false;
    }
    if (isSetConfidenceList()) {
      if (!first) sb.append(", ");
      sb.append("confidenceList:");
      if (this.confidenceList == null) {
        sb.append("null");
      } else {
        sb.append(this.confidenceList);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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

  private static class TaggedTokenStandardSchemeFactory implements SchemeFactory {
    public TaggedTokenStandardScheme getScheme() {
      return new TaggedTokenStandardScheme();
    }
  }

  private static class TaggedTokenStandardScheme extends StandardScheme<TaggedToken> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TaggedToken struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOKEN_INDEX
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.tokenIndex = iprot.readI32();
              struct.setTokenIndexIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TAG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tag = iprot.readString();
              struct.setTagIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CONFIDENCE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.confidence = iprot.readDouble();
              struct.setConfidenceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TAG_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.tagList = new ArrayList<String>(_list8.size);
                String _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = iprot.readString();
                  struct.tagList.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setTagListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CONFIDENCE_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list11 = iprot.readListBegin();
                struct.confidenceList = new ArrayList<Double>(_list11.size);
                double _elem12;
                for (int _i13 = 0; _i13 < _list11.size; ++_i13)
                {
                  _elem12 = iprot.readDouble();
                  struct.confidenceList.add(_elem12);
                }
                iprot.readListEnd();
              }
              struct.setConfidenceListIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TaggedToken struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetTokenIndex()) {
        oprot.writeFieldBegin(TOKEN_INDEX_FIELD_DESC);
        oprot.writeI32(struct.tokenIndex);
        oprot.writeFieldEnd();
      }
      if (struct.tag != null) {
        if (struct.isSetTag()) {
          oprot.writeFieldBegin(TAG_FIELD_DESC);
          oprot.writeString(struct.tag);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetConfidence()) {
        oprot.writeFieldBegin(CONFIDENCE_FIELD_DESC);
        oprot.writeDouble(struct.confidence);
        oprot.writeFieldEnd();
      }
      if (struct.tagList != null) {
        if (struct.isSetTagList()) {
          oprot.writeFieldBegin(TAG_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.tagList.size()));
            for (String _iter14 : struct.tagList)
            {
              oprot.writeString(_iter14);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.confidenceList != null) {
        if (struct.isSetConfidenceList()) {
          oprot.writeFieldBegin(CONFIDENCE_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, struct.confidenceList.size()));
            for (double _iter15 : struct.confidenceList)
            {
              oprot.writeDouble(_iter15);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TaggedTokenTupleSchemeFactory implements SchemeFactory {
    public TaggedTokenTupleScheme getScheme() {
      return new TaggedTokenTupleScheme();
    }
  }

  private static class TaggedTokenTupleScheme extends TupleScheme<TaggedToken> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TaggedToken struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTokenIndex()) {
        optionals.set(0);
      }
      if (struct.isSetTag()) {
        optionals.set(1);
      }
      if (struct.isSetConfidence()) {
        optionals.set(2);
      }
      if (struct.isSetTagList()) {
        optionals.set(3);
      }
      if (struct.isSetConfidenceList()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetTokenIndex()) {
        oprot.writeI32(struct.tokenIndex);
      }
      if (struct.isSetTag()) {
        oprot.writeString(struct.tag);
      }
      if (struct.isSetConfidence()) {
        oprot.writeDouble(struct.confidence);
      }
      if (struct.isSetTagList()) {
        {
          oprot.writeI32(struct.tagList.size());
          for (String _iter16 : struct.tagList)
          {
            oprot.writeString(_iter16);
          }
        }
      }
      if (struct.isSetConfidenceList()) {
        {
          oprot.writeI32(struct.confidenceList.size());
          for (double _iter17 : struct.confidenceList)
          {
            oprot.writeDouble(_iter17);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TaggedToken struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.tokenIndex = iprot.readI32();
        struct.setTokenIndexIsSet(true);
      }
      if (incoming.get(1)) {
        struct.tag = iprot.readString();
        struct.setTagIsSet(true);
      }
      if (incoming.get(2)) {
        struct.confidence = iprot.readDouble();
        struct.setConfidenceIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list18 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.tagList = new ArrayList<String>(_list18.size);
          String _elem19;
          for (int _i20 = 0; _i20 < _list18.size; ++_i20)
          {
            _elem19 = iprot.readString();
            struct.tagList.add(_elem19);
          }
        }
        struct.setTagListIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.DOUBLE, iprot.readI32());
          struct.confidenceList = new ArrayList<Double>(_list21.size);
          double _elem22;
          for (int _i23 = 0; _i23 < _list21.size; ++_i23)
          {
            _elem22 = iprot.readDouble();
            struct.confidenceList.add(_elem22);
          }
        }
        struct.setConfidenceListIsSet(true);
      }
    }
  }

}


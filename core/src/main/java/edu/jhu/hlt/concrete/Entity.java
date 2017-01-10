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
 * A single referent (or "entity") that is referred to at least once
 * in a given communication, along with pointers to all of the
 * references to that referent. The referent's type (e.g., is it a
 * person, or a location, or an organization, etc) is also recorded.
 * 
 * Because each Entity contains pointers to all references to a
 * referent with a given communication, an Entity can be
 * thought of as a coreference set.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-01-10")
public class Entity implements org.apache.thrift.TBase<Entity, Entity._Fields>, java.io.Serializable, Cloneable, Comparable<Entity> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Entity");

  private static final org.apache.thrift.protocol.TField UUID_FIELD_DESC = new org.apache.thrift.protocol.TField("uuid", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField MENTION_ID_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("mentionIdList", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField CONFIDENCE_FIELD_DESC = new org.apache.thrift.protocol.TField("confidence", org.apache.thrift.protocol.TType.DOUBLE, (short)4);
  private static final org.apache.thrift.protocol.TField CANONICAL_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("canonicalName", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new EntityStandardSchemeFactory());
    schemes.put(TupleScheme.class, new EntityTupleSchemeFactory());
  }

  private edu.jhu.hlt.concrete.UUID uuid; // required
  private List<edu.jhu.hlt.concrete.UUID> mentionIdList; // required
  private String type; // optional
  private double confidence; // optional
  private String canonicalName; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * Unique identifier for this entity.
     */
    UUID((short)1, "uuid"),
    /**
     * An list of pointers to all of the mentions of this Entity's
     * referent.  (type=EntityMention)
     */
    MENTION_ID_LIST((short)2, "mentionIdList"),
    /**
     * The basic type of this entity's referent.
     */
    TYPE((short)3, "type"),
    /**
     * Confidence score for this individual entity.  You can also set a
     * confidence score for an entire EntitySet using the EntitySet's
     * metadata.
     */
    CONFIDENCE((short)4, "confidence"),
    /**
     * A string containing a representative, canonical, or "best" name
     * for this entity's referent.  This string may match one of the
     * mentions' text strings, but it is not required to.
     */
    CANONICAL_NAME((short)5, "canonicalName");

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
        case 1: // UUID
          return UUID;
        case 2: // MENTION_ID_LIST
          return MENTION_ID_LIST;
        case 3: // TYPE
          return TYPE;
        case 4: // CONFIDENCE
          return CONFIDENCE;
        case 5: // CANONICAL_NAME
          return CANONICAL_NAME;
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
  private static final int __CONFIDENCE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TYPE,_Fields.CONFIDENCE,_Fields.CANONICAL_NAME};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.UUID, new org.apache.thrift.meta_data.FieldMetaData("uuid", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.jhu.hlt.concrete.UUID.class)));
    tmpMap.put(_Fields.MENTION_ID_LIST, new org.apache.thrift.meta_data.FieldMetaData("mentionIdList", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.jhu.hlt.concrete.UUID.class))));
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CONFIDENCE, new org.apache.thrift.meta_data.FieldMetaData("confidence", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.CANONICAL_NAME, new org.apache.thrift.meta_data.FieldMetaData("canonicalName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Entity.class, metaDataMap);
  }

  public Entity() {
  }

  public Entity(
    edu.jhu.hlt.concrete.UUID uuid,
    List<edu.jhu.hlt.concrete.UUID> mentionIdList)
  {
    this();
    this.uuid = uuid;
    this.mentionIdList = mentionIdList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Entity(Entity other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetUuid()) {
      this.uuid = new edu.jhu.hlt.concrete.UUID(other.uuid);
    }
    if (other.isSetMentionIdList()) {
      List<edu.jhu.hlt.concrete.UUID> __this__mentionIdList = new ArrayList<edu.jhu.hlt.concrete.UUID>(other.mentionIdList.size());
      for (edu.jhu.hlt.concrete.UUID other_element : other.mentionIdList) {
        __this__mentionIdList.add(new edu.jhu.hlt.concrete.UUID(other_element));
      }
      this.mentionIdList = __this__mentionIdList;
    }
    if (other.isSetType()) {
      this.type = other.type;
    }
    this.confidence = other.confidence;
    if (other.isSetCanonicalName()) {
      this.canonicalName = other.canonicalName;
    }
  }

  public Entity deepCopy() {
    return new Entity(this);
  }

  @Override
  public void clear() {
    this.uuid = null;
    this.mentionIdList = null;
    this.type = null;
    setConfidenceIsSet(false);
    this.confidence = 0.0;
    this.canonicalName = null;
  }

  /**
   * Unique identifier for this entity.
   */
  public edu.jhu.hlt.concrete.UUID getUuid() {
    return this.uuid;
  }

  /**
   * Unique identifier for this entity.
   */
  public Entity setUuid(edu.jhu.hlt.concrete.UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  public void unsetUuid() {
    this.uuid = null;
  }

  /** Returns true if field uuid is set (has been assigned a value) and false otherwise */
  public boolean isSetUuid() {
    return this.uuid != null;
  }

  public void setUuidIsSet(boolean value) {
    if (!value) {
      this.uuid = null;
    }
  }

  public int getMentionIdListSize() {
    return (this.mentionIdList == null) ? 0 : this.mentionIdList.size();
  }

  public java.util.Iterator<edu.jhu.hlt.concrete.UUID> getMentionIdListIterator() {
    return (this.mentionIdList == null) ? null : this.mentionIdList.iterator();
  }

  public void addToMentionIdList(edu.jhu.hlt.concrete.UUID elem) {
    if (this.mentionIdList == null) {
      this.mentionIdList = new ArrayList<edu.jhu.hlt.concrete.UUID>();
    }
    this.mentionIdList.add(elem);
  }

  /**
   * An list of pointers to all of the mentions of this Entity's
   * referent.  (type=EntityMention)
   */
  public List<edu.jhu.hlt.concrete.UUID> getMentionIdList() {
    return this.mentionIdList;
  }

  /**
   * An list of pointers to all of the mentions of this Entity's
   * referent.  (type=EntityMention)
   */
  public Entity setMentionIdList(List<edu.jhu.hlt.concrete.UUID> mentionIdList) {
    this.mentionIdList = mentionIdList;
    return this;
  }

  public void unsetMentionIdList() {
    this.mentionIdList = null;
  }

  /** Returns true if field mentionIdList is set (has been assigned a value) and false otherwise */
  public boolean isSetMentionIdList() {
    return this.mentionIdList != null;
  }

  public void setMentionIdListIsSet(boolean value) {
    if (!value) {
      this.mentionIdList = null;
    }
  }

  /**
   * The basic type of this entity's referent.
   */
  public String getType() {
    return this.type;
  }

  /**
   * The basic type of this entity's referent.
   */
  public Entity setType(String type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  /**
   * Confidence score for this individual entity.  You can also set a
   * confidence score for an entire EntitySet using the EntitySet's
   * metadata.
   */
  public double getConfidence() {
    return this.confidence;
  }

  /**
   * Confidence score for this individual entity.  You can also set a
   * confidence score for an entire EntitySet using the EntitySet's
   * metadata.
   */
  public Entity setConfidence(double confidence) {
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

  /**
   * A string containing a representative, canonical, or "best" name
   * for this entity's referent.  This string may match one of the
   * mentions' text strings, but it is not required to.
   */
  public String getCanonicalName() {
    return this.canonicalName;
  }

  /**
   * A string containing a representative, canonical, or "best" name
   * for this entity's referent.  This string may match one of the
   * mentions' text strings, but it is not required to.
   */
  public Entity setCanonicalName(String canonicalName) {
    this.canonicalName = canonicalName;
    return this;
  }

  public void unsetCanonicalName() {
    this.canonicalName = null;
  }

  /** Returns true if field canonicalName is set (has been assigned a value) and false otherwise */
  public boolean isSetCanonicalName() {
    return this.canonicalName != null;
  }

  public void setCanonicalNameIsSet(boolean value) {
    if (!value) {
      this.canonicalName = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case UUID:
      if (value == null) {
        unsetUuid();
      } else {
        setUuid((edu.jhu.hlt.concrete.UUID)value);
      }
      break;

    case MENTION_ID_LIST:
      if (value == null) {
        unsetMentionIdList();
      } else {
        setMentionIdList((List<edu.jhu.hlt.concrete.UUID>)value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((String)value);
      }
      break;

    case CONFIDENCE:
      if (value == null) {
        unsetConfidence();
      } else {
        setConfidence((Double)value);
      }
      break;

    case CANONICAL_NAME:
      if (value == null) {
        unsetCanonicalName();
      } else {
        setCanonicalName((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case UUID:
      return getUuid();

    case MENTION_ID_LIST:
      return getMentionIdList();

    case TYPE:
      return getType();

    case CONFIDENCE:
      return getConfidence();

    case CANONICAL_NAME:
      return getCanonicalName();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case UUID:
      return isSetUuid();
    case MENTION_ID_LIST:
      return isSetMentionIdList();
    case TYPE:
      return isSetType();
    case CONFIDENCE:
      return isSetConfidence();
    case CANONICAL_NAME:
      return isSetCanonicalName();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Entity)
      return this.equals((Entity)that);
    return false;
  }

  public boolean equals(Entity that) {
    if (that == null)
      return false;

    boolean this_present_uuid = true && this.isSetUuid();
    boolean that_present_uuid = true && that.isSetUuid();
    if (this_present_uuid || that_present_uuid) {
      if (!(this_present_uuid && that_present_uuid))
        return false;
      if (!this.uuid.equals(that.uuid))
        return false;
    }

    boolean this_present_mentionIdList = true && this.isSetMentionIdList();
    boolean that_present_mentionIdList = true && that.isSetMentionIdList();
    if (this_present_mentionIdList || that_present_mentionIdList) {
      if (!(this_present_mentionIdList && that_present_mentionIdList))
        return false;
      if (!this.mentionIdList.equals(that.mentionIdList))
        return false;
    }

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
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

    boolean this_present_canonicalName = true && this.isSetCanonicalName();
    boolean that_present_canonicalName = true && that.isSetCanonicalName();
    if (this_present_canonicalName || that_present_canonicalName) {
      if (!(this_present_canonicalName && that_present_canonicalName))
        return false;
      if (!this.canonicalName.equals(that.canonicalName))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_uuid = true && (isSetUuid());
    list.add(present_uuid);
    if (present_uuid)
      list.add(uuid);

    boolean present_mentionIdList = true && (isSetMentionIdList());
    list.add(present_mentionIdList);
    if (present_mentionIdList)
      list.add(mentionIdList);

    boolean present_type = true && (isSetType());
    list.add(present_type);
    if (present_type)
      list.add(type);

    boolean present_confidence = true && (isSetConfidence());
    list.add(present_confidence);
    if (present_confidence)
      list.add(confidence);

    boolean present_canonicalName = true && (isSetCanonicalName());
    list.add(present_canonicalName);
    if (present_canonicalName)
      list.add(canonicalName);

    return list.hashCode();
  }

  @Override
  public int compareTo(Entity other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUuid()).compareTo(other.isSetUuid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUuid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.uuid, other.uuid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMentionIdList()).compareTo(other.isSetMentionIdList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMentionIdList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mentionIdList, other.mentionIdList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
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
    lastComparison = Boolean.valueOf(isSetCanonicalName()).compareTo(other.isSetCanonicalName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCanonicalName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.canonicalName, other.canonicalName);
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
    StringBuilder sb = new StringBuilder("Entity(");
    boolean first = true;

    sb.append("uuid:");
    if (this.uuid == null) {
      sb.append("null");
    } else {
      sb.append(this.uuid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("mentionIdList:");
    if (this.mentionIdList == null) {
      sb.append("null");
    } else {
      sb.append(this.mentionIdList);
    }
    first = false;
    if (isSetType()) {
      if (!first) sb.append(", ");
      sb.append("type:");
      if (this.type == null) {
        sb.append("null");
      } else {
        sb.append(this.type);
      }
      first = false;
    }
    if (isSetConfidence()) {
      if (!first) sb.append(", ");
      sb.append("confidence:");
      sb.append(this.confidence);
      first = false;
    }
    if (isSetCanonicalName()) {
      if (!first) sb.append(", ");
      sb.append("canonicalName:");
      if (this.canonicalName == null) {
        sb.append("null");
      } else {
        sb.append(this.canonicalName);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (uuid == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'uuid' was not present! Struct: " + toString());
    }
    if (mentionIdList == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'mentionIdList' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (uuid != null) {
      uuid.validate();
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

  private static class EntityStandardSchemeFactory implements SchemeFactory {
    public EntityStandardScheme getScheme() {
      return new EntityStandardScheme();
    }
  }

  private static class EntityStandardScheme extends StandardScheme<Entity> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Entity struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // UUID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.uuid = new edu.jhu.hlt.concrete.UUID();
              struct.uuid.read(iprot);
              struct.setUuidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MENTION_ID_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.mentionIdList = new ArrayList<edu.jhu.hlt.concrete.UUID>(_list0.size);
                edu.jhu.hlt.concrete.UUID _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new edu.jhu.hlt.concrete.UUID();
                  _elem1.read(iprot);
                  struct.mentionIdList.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setMentionIdListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.type = iprot.readString();
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CONFIDENCE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.confidence = iprot.readDouble();
              struct.setConfidenceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CANONICAL_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.canonicalName = iprot.readString();
              struct.setCanonicalNameIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Entity struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.uuid != null) {
        oprot.writeFieldBegin(UUID_FIELD_DESC);
        struct.uuid.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.mentionIdList != null) {
        oprot.writeFieldBegin(MENTION_ID_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.mentionIdList.size()));
          for (edu.jhu.hlt.concrete.UUID _iter3 : struct.mentionIdList)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.type != null) {
        if (struct.isSetType()) {
          oprot.writeFieldBegin(TYPE_FIELD_DESC);
          oprot.writeString(struct.type);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetConfidence()) {
        oprot.writeFieldBegin(CONFIDENCE_FIELD_DESC);
        oprot.writeDouble(struct.confidence);
        oprot.writeFieldEnd();
      }
      if (struct.canonicalName != null) {
        if (struct.isSetCanonicalName()) {
          oprot.writeFieldBegin(CANONICAL_NAME_FIELD_DESC);
          oprot.writeString(struct.canonicalName);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EntityTupleSchemeFactory implements SchemeFactory {
    public EntityTupleScheme getScheme() {
      return new EntityTupleScheme();
    }
  }

  private static class EntityTupleScheme extends TupleScheme<Entity> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Entity struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.uuid.write(oprot);
      {
        oprot.writeI32(struct.mentionIdList.size());
        for (edu.jhu.hlt.concrete.UUID _iter4 : struct.mentionIdList)
        {
          _iter4.write(oprot);
        }
      }
      BitSet optionals = new BitSet();
      if (struct.isSetType()) {
        optionals.set(0);
      }
      if (struct.isSetConfidence()) {
        optionals.set(1);
      }
      if (struct.isSetCanonicalName()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetType()) {
        oprot.writeString(struct.type);
      }
      if (struct.isSetConfidence()) {
        oprot.writeDouble(struct.confidence);
      }
      if (struct.isSetCanonicalName()) {
        oprot.writeString(struct.canonicalName);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Entity struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.uuid = new edu.jhu.hlt.concrete.UUID();
      struct.uuid.read(iprot);
      struct.setUuidIsSet(true);
      {
        org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.mentionIdList = new ArrayList<edu.jhu.hlt.concrete.UUID>(_list5.size);
        edu.jhu.hlt.concrete.UUID _elem6;
        for (int _i7 = 0; _i7 < _list5.size; ++_i7)
        {
          _elem6 = new edu.jhu.hlt.concrete.UUID();
          _elem6.read(iprot);
          struct.mentionIdList.add(_elem6);
        }
      }
      struct.setMentionIdListIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.type = iprot.readString();
        struct.setTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.confidence = iprot.readDouble();
        struct.setConfidenceIsSet(true);
      }
      if (incoming.get(2)) {
        struct.canonicalName = iprot.readString();
        struct.setCanonicalNameIsSet(true);
      }
    }
  }

}


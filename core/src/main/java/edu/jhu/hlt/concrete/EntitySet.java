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
 * A theory about the set of entities that are present in a
 * message. See also: Entity.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-01-10")
public class EntitySet implements org.apache.thrift.TBase<EntitySet, EntitySet._Fields>, java.io.Serializable, Cloneable, Comparable<EntitySet> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("EntitySet");

  private static final org.apache.thrift.protocol.TField UUID_FIELD_DESC = new org.apache.thrift.protocol.TField("uuid", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField METADATA_FIELD_DESC = new org.apache.thrift.protocol.TField("metadata", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField ENTITY_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("entityList", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField LINKING_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("linkingList", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField MENTION_SET_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("mentionSetId", org.apache.thrift.protocol.TType.STRUCT, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new EntitySetStandardSchemeFactory());
    schemes.put(TupleScheme.class, new EntitySetTupleSchemeFactory());
  }

  private edu.jhu.hlt.concrete.UUID uuid; // required
  private edu.jhu.hlt.concrete.AnnotationMetadata metadata; // required
  private List<Entity> entityList; // required
  private List<edu.jhu.hlt.concrete.Linking> linkingList; // optional
  private edu.jhu.hlt.concrete.UUID mentionSetId; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * Unique identifier for this set.
     */
    UUID((short)1, "uuid"),
    /**
     * Information about where this set came from.
     */
    METADATA((short)2, "metadata"),
    /**
     * List of entities in this set.
     */
    ENTITY_LIST((short)3, "entityList"),
    /**
     * Entity linking annotations associated with this EntitySet.
     */
    LINKING_LIST((short)4, "linkingList"),
    /**
     * An optional UUID pointer to an EntityMentionSet.
     * 
     * If this field is present, consumers can assume that all
     * Entity objects in this EntitySet have EntityMentions that are included
     * in the named EntityMentionSet.
     */
    MENTION_SET_ID((short)5, "mentionSetId");

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
        case 2: // METADATA
          return METADATA;
        case 3: // ENTITY_LIST
          return ENTITY_LIST;
        case 4: // LINKING_LIST
          return LINKING_LIST;
        case 5: // MENTION_SET_ID
          return MENTION_SET_ID;
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
  private static final _Fields optionals[] = {_Fields.LINKING_LIST,_Fields.MENTION_SET_ID};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.UUID, new org.apache.thrift.meta_data.FieldMetaData("uuid", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.jhu.hlt.concrete.UUID.class)));
    tmpMap.put(_Fields.METADATA, new org.apache.thrift.meta_data.FieldMetaData("metadata", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.jhu.hlt.concrete.AnnotationMetadata.class)));
    tmpMap.put(_Fields.ENTITY_LIST, new org.apache.thrift.meta_data.FieldMetaData("entityList", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Entity.class))));
    tmpMap.put(_Fields.LINKING_LIST, new org.apache.thrift.meta_data.FieldMetaData("linkingList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.jhu.hlt.concrete.Linking.class))));
    tmpMap.put(_Fields.MENTION_SET_ID, new org.apache.thrift.meta_data.FieldMetaData("mentionSetId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.jhu.hlt.concrete.UUID.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(EntitySet.class, metaDataMap);
  }

  public EntitySet() {
  }

  public EntitySet(
    edu.jhu.hlt.concrete.UUID uuid,
    edu.jhu.hlt.concrete.AnnotationMetadata metadata,
    List<Entity> entityList)
  {
    this();
    this.uuid = uuid;
    this.metadata = metadata;
    this.entityList = entityList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public EntitySet(EntitySet other) {
    if (other.isSetUuid()) {
      this.uuid = new edu.jhu.hlt.concrete.UUID(other.uuid);
    }
    if (other.isSetMetadata()) {
      this.metadata = new edu.jhu.hlt.concrete.AnnotationMetadata(other.metadata);
    }
    if (other.isSetEntityList()) {
      List<Entity> __this__entityList = new ArrayList<Entity>(other.entityList.size());
      for (Entity other_element : other.entityList) {
        __this__entityList.add(new Entity(other_element));
      }
      this.entityList = __this__entityList;
    }
    if (other.isSetLinkingList()) {
      List<edu.jhu.hlt.concrete.Linking> __this__linkingList = new ArrayList<edu.jhu.hlt.concrete.Linking>(other.linkingList.size());
      for (edu.jhu.hlt.concrete.Linking other_element : other.linkingList) {
        __this__linkingList.add(new edu.jhu.hlt.concrete.Linking(other_element));
      }
      this.linkingList = __this__linkingList;
    }
    if (other.isSetMentionSetId()) {
      this.mentionSetId = new edu.jhu.hlt.concrete.UUID(other.mentionSetId);
    }
  }

  public EntitySet deepCopy() {
    return new EntitySet(this);
  }

  @Override
  public void clear() {
    this.uuid = null;
    this.metadata = null;
    this.entityList = null;
    this.linkingList = null;
    this.mentionSetId = null;
  }

  /**
   * Unique identifier for this set.
   */
  public edu.jhu.hlt.concrete.UUID getUuid() {
    return this.uuid;
  }

  /**
   * Unique identifier for this set.
   */
  public EntitySet setUuid(edu.jhu.hlt.concrete.UUID uuid) {
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

  /**
   * Information about where this set came from.
   */
  public edu.jhu.hlt.concrete.AnnotationMetadata getMetadata() {
    return this.metadata;
  }

  /**
   * Information about where this set came from.
   */
  public EntitySet setMetadata(edu.jhu.hlt.concrete.AnnotationMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  public void unsetMetadata() {
    this.metadata = null;
  }

  /** Returns true if field metadata is set (has been assigned a value) and false otherwise */
  public boolean isSetMetadata() {
    return this.metadata != null;
  }

  public void setMetadataIsSet(boolean value) {
    if (!value) {
      this.metadata = null;
    }
  }

  public int getEntityListSize() {
    return (this.entityList == null) ? 0 : this.entityList.size();
  }

  public java.util.Iterator<Entity> getEntityListIterator() {
    return (this.entityList == null) ? null : this.entityList.iterator();
  }

  public void addToEntityList(Entity elem) {
    if (this.entityList == null) {
      this.entityList = new ArrayList<Entity>();
    }
    this.entityList.add(elem);
  }

  /**
   * List of entities in this set.
   */
  public List<Entity> getEntityList() {
    return this.entityList;
  }

  /**
   * List of entities in this set.
   */
  public EntitySet setEntityList(List<Entity> entityList) {
    this.entityList = entityList;
    return this;
  }

  public void unsetEntityList() {
    this.entityList = null;
  }

  /** Returns true if field entityList is set (has been assigned a value) and false otherwise */
  public boolean isSetEntityList() {
    return this.entityList != null;
  }

  public void setEntityListIsSet(boolean value) {
    if (!value) {
      this.entityList = null;
    }
  }

  public int getLinkingListSize() {
    return (this.linkingList == null) ? 0 : this.linkingList.size();
  }

  public java.util.Iterator<edu.jhu.hlt.concrete.Linking> getLinkingListIterator() {
    return (this.linkingList == null) ? null : this.linkingList.iterator();
  }

  public void addToLinkingList(edu.jhu.hlt.concrete.Linking elem) {
    if (this.linkingList == null) {
      this.linkingList = new ArrayList<edu.jhu.hlt.concrete.Linking>();
    }
    this.linkingList.add(elem);
  }

  /**
   * Entity linking annotations associated with this EntitySet.
   */
  public List<edu.jhu.hlt.concrete.Linking> getLinkingList() {
    return this.linkingList;
  }

  /**
   * Entity linking annotations associated with this EntitySet.
   */
  public EntitySet setLinkingList(List<edu.jhu.hlt.concrete.Linking> linkingList) {
    this.linkingList = linkingList;
    return this;
  }

  public void unsetLinkingList() {
    this.linkingList = null;
  }

  /** Returns true if field linkingList is set (has been assigned a value) and false otherwise */
  public boolean isSetLinkingList() {
    return this.linkingList != null;
  }

  public void setLinkingListIsSet(boolean value) {
    if (!value) {
      this.linkingList = null;
    }
  }

  /**
   * An optional UUID pointer to an EntityMentionSet.
   * 
   * If this field is present, consumers can assume that all
   * Entity objects in this EntitySet have EntityMentions that are included
   * in the named EntityMentionSet.
   */
  public edu.jhu.hlt.concrete.UUID getMentionSetId() {
    return this.mentionSetId;
  }

  /**
   * An optional UUID pointer to an EntityMentionSet.
   * 
   * If this field is present, consumers can assume that all
   * Entity objects in this EntitySet have EntityMentions that are included
   * in the named EntityMentionSet.
   */
  public EntitySet setMentionSetId(edu.jhu.hlt.concrete.UUID mentionSetId) {
    this.mentionSetId = mentionSetId;
    return this;
  }

  public void unsetMentionSetId() {
    this.mentionSetId = null;
  }

  /** Returns true if field mentionSetId is set (has been assigned a value) and false otherwise */
  public boolean isSetMentionSetId() {
    return this.mentionSetId != null;
  }

  public void setMentionSetIdIsSet(boolean value) {
    if (!value) {
      this.mentionSetId = null;
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

    case METADATA:
      if (value == null) {
        unsetMetadata();
      } else {
        setMetadata((edu.jhu.hlt.concrete.AnnotationMetadata)value);
      }
      break;

    case ENTITY_LIST:
      if (value == null) {
        unsetEntityList();
      } else {
        setEntityList((List<Entity>)value);
      }
      break;

    case LINKING_LIST:
      if (value == null) {
        unsetLinkingList();
      } else {
        setLinkingList((List<edu.jhu.hlt.concrete.Linking>)value);
      }
      break;

    case MENTION_SET_ID:
      if (value == null) {
        unsetMentionSetId();
      } else {
        setMentionSetId((edu.jhu.hlt.concrete.UUID)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case UUID:
      return getUuid();

    case METADATA:
      return getMetadata();

    case ENTITY_LIST:
      return getEntityList();

    case LINKING_LIST:
      return getLinkingList();

    case MENTION_SET_ID:
      return getMentionSetId();

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
    case METADATA:
      return isSetMetadata();
    case ENTITY_LIST:
      return isSetEntityList();
    case LINKING_LIST:
      return isSetLinkingList();
    case MENTION_SET_ID:
      return isSetMentionSetId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof EntitySet)
      return this.equals((EntitySet)that);
    return false;
  }

  public boolean equals(EntitySet that) {
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

    boolean this_present_metadata = true && this.isSetMetadata();
    boolean that_present_metadata = true && that.isSetMetadata();
    if (this_present_metadata || that_present_metadata) {
      if (!(this_present_metadata && that_present_metadata))
        return false;
      if (!this.metadata.equals(that.metadata))
        return false;
    }

    boolean this_present_entityList = true && this.isSetEntityList();
    boolean that_present_entityList = true && that.isSetEntityList();
    if (this_present_entityList || that_present_entityList) {
      if (!(this_present_entityList && that_present_entityList))
        return false;
      if (!this.entityList.equals(that.entityList))
        return false;
    }

    boolean this_present_linkingList = true && this.isSetLinkingList();
    boolean that_present_linkingList = true && that.isSetLinkingList();
    if (this_present_linkingList || that_present_linkingList) {
      if (!(this_present_linkingList && that_present_linkingList))
        return false;
      if (!this.linkingList.equals(that.linkingList))
        return false;
    }

    boolean this_present_mentionSetId = true && this.isSetMentionSetId();
    boolean that_present_mentionSetId = true && that.isSetMentionSetId();
    if (this_present_mentionSetId || that_present_mentionSetId) {
      if (!(this_present_mentionSetId && that_present_mentionSetId))
        return false;
      if (!this.mentionSetId.equals(that.mentionSetId))
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

    boolean present_metadata = true && (isSetMetadata());
    list.add(present_metadata);
    if (present_metadata)
      list.add(metadata);

    boolean present_entityList = true && (isSetEntityList());
    list.add(present_entityList);
    if (present_entityList)
      list.add(entityList);

    boolean present_linkingList = true && (isSetLinkingList());
    list.add(present_linkingList);
    if (present_linkingList)
      list.add(linkingList);

    boolean present_mentionSetId = true && (isSetMentionSetId());
    list.add(present_mentionSetId);
    if (present_mentionSetId)
      list.add(mentionSetId);

    return list.hashCode();
  }

  @Override
  public int compareTo(EntitySet other) {
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
    lastComparison = Boolean.valueOf(isSetMetadata()).compareTo(other.isSetMetadata());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetadata()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.metadata, other.metadata);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEntityList()).compareTo(other.isSetEntityList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEntityList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.entityList, other.entityList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLinkingList()).compareTo(other.isSetLinkingList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLinkingList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.linkingList, other.linkingList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMentionSetId()).compareTo(other.isSetMentionSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMentionSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mentionSetId, other.mentionSetId);
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
    StringBuilder sb = new StringBuilder("EntitySet(");
    boolean first = true;

    sb.append("uuid:");
    if (this.uuid == null) {
      sb.append("null");
    } else {
      sb.append(this.uuid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("metadata:");
    if (this.metadata == null) {
      sb.append("null");
    } else {
      sb.append(this.metadata);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("entityList:");
    if (this.entityList == null) {
      sb.append("null");
    } else {
      sb.append(this.entityList);
    }
    first = false;
    if (isSetLinkingList()) {
      if (!first) sb.append(", ");
      sb.append("linkingList:");
      if (this.linkingList == null) {
        sb.append("null");
      } else {
        sb.append(this.linkingList);
      }
      first = false;
    }
    if (isSetMentionSetId()) {
      if (!first) sb.append(", ");
      sb.append("mentionSetId:");
      if (this.mentionSetId == null) {
        sb.append("null");
      } else {
        sb.append(this.mentionSetId);
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
    if (metadata == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'metadata' was not present! Struct: " + toString());
    }
    if (entityList == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'entityList' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (uuid != null) {
      uuid.validate();
    }
    if (metadata != null) {
      metadata.validate();
    }
    if (mentionSetId != null) {
      mentionSetId.validate();
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class EntitySetStandardSchemeFactory implements SchemeFactory {
    public EntitySetStandardScheme getScheme() {
      return new EntitySetStandardScheme();
    }
  }

  private static class EntitySetStandardScheme extends StandardScheme<EntitySet> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, EntitySet struct) throws org.apache.thrift.TException {
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
          case 2: // METADATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.metadata = new edu.jhu.hlt.concrete.AnnotationMetadata();
              struct.metadata.read(iprot);
              struct.setMetadataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ENTITY_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.entityList = new ArrayList<Entity>(_list8.size);
                Entity _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = new Entity();
                  _elem9.read(iprot);
                  struct.entityList.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setEntityListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // LINKING_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list11 = iprot.readListBegin();
                struct.linkingList = new ArrayList<edu.jhu.hlt.concrete.Linking>(_list11.size);
                edu.jhu.hlt.concrete.Linking _elem12;
                for (int _i13 = 0; _i13 < _list11.size; ++_i13)
                {
                  _elem12 = new edu.jhu.hlt.concrete.Linking();
                  _elem12.read(iprot);
                  struct.linkingList.add(_elem12);
                }
                iprot.readListEnd();
              }
              struct.setLinkingListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // MENTION_SET_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.mentionSetId = new edu.jhu.hlt.concrete.UUID();
              struct.mentionSetId.read(iprot);
              struct.setMentionSetIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, EntitySet struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.uuid != null) {
        oprot.writeFieldBegin(UUID_FIELD_DESC);
        struct.uuid.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.metadata != null) {
        oprot.writeFieldBegin(METADATA_FIELD_DESC);
        struct.metadata.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.entityList != null) {
        oprot.writeFieldBegin(ENTITY_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.entityList.size()));
          for (Entity _iter14 : struct.entityList)
          {
            _iter14.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.linkingList != null) {
        if (struct.isSetLinkingList()) {
          oprot.writeFieldBegin(LINKING_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.linkingList.size()));
            for (edu.jhu.hlt.concrete.Linking _iter15 : struct.linkingList)
            {
              _iter15.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.mentionSetId != null) {
        if (struct.isSetMentionSetId()) {
          oprot.writeFieldBegin(MENTION_SET_ID_FIELD_DESC);
          struct.mentionSetId.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EntitySetTupleSchemeFactory implements SchemeFactory {
    public EntitySetTupleScheme getScheme() {
      return new EntitySetTupleScheme();
    }
  }

  private static class EntitySetTupleScheme extends TupleScheme<EntitySet> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, EntitySet struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.uuid.write(oprot);
      struct.metadata.write(oprot);
      {
        oprot.writeI32(struct.entityList.size());
        for (Entity _iter16 : struct.entityList)
        {
          _iter16.write(oprot);
        }
      }
      BitSet optionals = new BitSet();
      if (struct.isSetLinkingList()) {
        optionals.set(0);
      }
      if (struct.isSetMentionSetId()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetLinkingList()) {
        {
          oprot.writeI32(struct.linkingList.size());
          for (edu.jhu.hlt.concrete.Linking _iter17 : struct.linkingList)
          {
            _iter17.write(oprot);
          }
        }
      }
      if (struct.isSetMentionSetId()) {
        struct.mentionSetId.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, EntitySet struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.uuid = new edu.jhu.hlt.concrete.UUID();
      struct.uuid.read(iprot);
      struct.setUuidIsSet(true);
      struct.metadata = new edu.jhu.hlt.concrete.AnnotationMetadata();
      struct.metadata.read(iprot);
      struct.setMetadataIsSet(true);
      {
        org.apache.thrift.protocol.TList _list18 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.entityList = new ArrayList<Entity>(_list18.size);
        Entity _elem19;
        for (int _i20 = 0; _i20 < _list18.size; ++_i20)
        {
          _elem19 = new Entity();
          _elem19.read(iprot);
          struct.entityList.add(_elem19);
        }
      }
      struct.setEntityListIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.linkingList = new ArrayList<edu.jhu.hlt.concrete.Linking>(_list21.size);
          edu.jhu.hlt.concrete.Linking _elem22;
          for (int _i23 = 0; _i23 < _list21.size; ++_i23)
          {
            _elem22 = new edu.jhu.hlt.concrete.Linking();
            _elem22.read(iprot);
            struct.linkingList.add(_elem22);
          }
        }
        struct.setLinkingListIsSet(true);
      }
      if (incoming.get(1)) {
        struct.mentionSetId = new edu.jhu.hlt.concrete.UUID();
        struct.mentionSetId.read(iprot);
        struct.setMentionSetIdIsSet(true);
      }
    }
  }

}


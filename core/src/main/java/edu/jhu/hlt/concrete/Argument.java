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
 * A situation argument, consisting of an argument role and a value.
 * Argument values may be Entities or Situations.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-01-10")
public class Argument implements org.apache.thrift.TBase<Argument, Argument._Fields>, java.io.Serializable, Cloneable, Comparable<Argument> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Argument");

  private static final org.apache.thrift.protocol.TField ROLE_FIELD_DESC = new org.apache.thrift.protocol.TField("role", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ENTITY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("entityId", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField SITUATION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("situationId", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField PROPERTY_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("propertyList", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ArgumentStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ArgumentTupleSchemeFactory());
  }

  private String role; // optional
  private edu.jhu.hlt.concrete.UUID entityId; // optional
  private edu.jhu.hlt.concrete.UUID situationId; // optional
  private List<Property> propertyList; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * The relationship between this argument and the situation that
     * owns it. The roles that a situation's arguments can take
     * depend on the type of the situation (including subtype
     * information, such as event_type).
     */
    ROLE((short)1, "role"),
    /**
     * A pointer to the value of this argument, if it is explicitly
     * encoded as an Entity.
     */
    ENTITY_ID((short)2, "entityId"),
    /**
     * A pointer to the value of this argument, if it is a situation.
     */
    SITUATION_ID((short)3, "situationId"),
    /**
     * For the BinarySRL task, there may be situations
     * where more than one property is attached to a single
     * participant. A list of these properties can be stored in this field.
     */
    PROPERTY_LIST((short)4, "propertyList");

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
        case 1: // ROLE
          return ROLE;
        case 2: // ENTITY_ID
          return ENTITY_ID;
        case 3: // SITUATION_ID
          return SITUATION_ID;
        case 4: // PROPERTY_LIST
          return PROPERTY_LIST;
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
  private static final _Fields optionals[] = {_Fields.ROLE,_Fields.ENTITY_ID,_Fields.SITUATION_ID,_Fields.PROPERTY_LIST};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ROLE, new org.apache.thrift.meta_data.FieldMetaData("role", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ENTITY_ID, new org.apache.thrift.meta_data.FieldMetaData("entityId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.jhu.hlt.concrete.UUID.class)));
    tmpMap.put(_Fields.SITUATION_ID, new org.apache.thrift.meta_data.FieldMetaData("situationId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.jhu.hlt.concrete.UUID.class)));
    tmpMap.put(_Fields.PROPERTY_LIST, new org.apache.thrift.meta_data.FieldMetaData("propertyList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Property.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Argument.class, metaDataMap);
  }

  public Argument() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Argument(Argument other) {
    if (other.isSetRole()) {
      this.role = other.role;
    }
    if (other.isSetEntityId()) {
      this.entityId = new edu.jhu.hlt.concrete.UUID(other.entityId);
    }
    if (other.isSetSituationId()) {
      this.situationId = new edu.jhu.hlt.concrete.UUID(other.situationId);
    }
    if (other.isSetPropertyList()) {
      List<Property> __this__propertyList = new ArrayList<Property>(other.propertyList.size());
      for (Property other_element : other.propertyList) {
        __this__propertyList.add(new Property(other_element));
      }
      this.propertyList = __this__propertyList;
    }
  }

  public Argument deepCopy() {
    return new Argument(this);
  }

  @Override
  public void clear() {
    this.role = null;
    this.entityId = null;
    this.situationId = null;
    this.propertyList = null;
  }

  /**
   * The relationship between this argument and the situation that
   * owns it. The roles that a situation's arguments can take
   * depend on the type of the situation (including subtype
   * information, such as event_type).
   */
  public String getRole() {
    return this.role;
  }

  /**
   * The relationship between this argument and the situation that
   * owns it. The roles that a situation's arguments can take
   * depend on the type of the situation (including subtype
   * information, such as event_type).
   */
  public Argument setRole(String role) {
    this.role = role;
    return this;
  }

  public void unsetRole() {
    this.role = null;
  }

  /** Returns true if field role is set (has been assigned a value) and false otherwise */
  public boolean isSetRole() {
    return this.role != null;
  }

  public void setRoleIsSet(boolean value) {
    if (!value) {
      this.role = null;
    }
  }

  /**
   * A pointer to the value of this argument, if it is explicitly
   * encoded as an Entity.
   */
  public edu.jhu.hlt.concrete.UUID getEntityId() {
    return this.entityId;
  }

  /**
   * A pointer to the value of this argument, if it is explicitly
   * encoded as an Entity.
   */
  public Argument setEntityId(edu.jhu.hlt.concrete.UUID entityId) {
    this.entityId = entityId;
    return this;
  }

  public void unsetEntityId() {
    this.entityId = null;
  }

  /** Returns true if field entityId is set (has been assigned a value) and false otherwise */
  public boolean isSetEntityId() {
    return this.entityId != null;
  }

  public void setEntityIdIsSet(boolean value) {
    if (!value) {
      this.entityId = null;
    }
  }

  /**
   * A pointer to the value of this argument, if it is a situation.
   */
  public edu.jhu.hlt.concrete.UUID getSituationId() {
    return this.situationId;
  }

  /**
   * A pointer to the value of this argument, if it is a situation.
   */
  public Argument setSituationId(edu.jhu.hlt.concrete.UUID situationId) {
    this.situationId = situationId;
    return this;
  }

  public void unsetSituationId() {
    this.situationId = null;
  }

  /** Returns true if field situationId is set (has been assigned a value) and false otherwise */
  public boolean isSetSituationId() {
    return this.situationId != null;
  }

  public void setSituationIdIsSet(boolean value) {
    if (!value) {
      this.situationId = null;
    }
  }

  public int getPropertyListSize() {
    return (this.propertyList == null) ? 0 : this.propertyList.size();
  }

  public java.util.Iterator<Property> getPropertyListIterator() {
    return (this.propertyList == null) ? null : this.propertyList.iterator();
  }

  public void addToPropertyList(Property elem) {
    if (this.propertyList == null) {
      this.propertyList = new ArrayList<Property>();
    }
    this.propertyList.add(elem);
  }

  /**
   * For the BinarySRL task, there may be situations
   * where more than one property is attached to a single
   * participant. A list of these properties can be stored in this field.
   */
  public List<Property> getPropertyList() {
    return this.propertyList;
  }

  /**
   * For the BinarySRL task, there may be situations
   * where more than one property is attached to a single
   * participant. A list of these properties can be stored in this field.
   */
  public Argument setPropertyList(List<Property> propertyList) {
    this.propertyList = propertyList;
    return this;
  }

  public void unsetPropertyList() {
    this.propertyList = null;
  }

  /** Returns true if field propertyList is set (has been assigned a value) and false otherwise */
  public boolean isSetPropertyList() {
    return this.propertyList != null;
  }

  public void setPropertyListIsSet(boolean value) {
    if (!value) {
      this.propertyList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ROLE:
      if (value == null) {
        unsetRole();
      } else {
        setRole((String)value);
      }
      break;

    case ENTITY_ID:
      if (value == null) {
        unsetEntityId();
      } else {
        setEntityId((edu.jhu.hlt.concrete.UUID)value);
      }
      break;

    case SITUATION_ID:
      if (value == null) {
        unsetSituationId();
      } else {
        setSituationId((edu.jhu.hlt.concrete.UUID)value);
      }
      break;

    case PROPERTY_LIST:
      if (value == null) {
        unsetPropertyList();
      } else {
        setPropertyList((List<Property>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ROLE:
      return getRole();

    case ENTITY_ID:
      return getEntityId();

    case SITUATION_ID:
      return getSituationId();

    case PROPERTY_LIST:
      return getPropertyList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ROLE:
      return isSetRole();
    case ENTITY_ID:
      return isSetEntityId();
    case SITUATION_ID:
      return isSetSituationId();
    case PROPERTY_LIST:
      return isSetPropertyList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Argument)
      return this.equals((Argument)that);
    return false;
  }

  public boolean equals(Argument that) {
    if (that == null)
      return false;

    boolean this_present_role = true && this.isSetRole();
    boolean that_present_role = true && that.isSetRole();
    if (this_present_role || that_present_role) {
      if (!(this_present_role && that_present_role))
        return false;
      if (!this.role.equals(that.role))
        return false;
    }

    boolean this_present_entityId = true && this.isSetEntityId();
    boolean that_present_entityId = true && that.isSetEntityId();
    if (this_present_entityId || that_present_entityId) {
      if (!(this_present_entityId && that_present_entityId))
        return false;
      if (!this.entityId.equals(that.entityId))
        return false;
    }

    boolean this_present_situationId = true && this.isSetSituationId();
    boolean that_present_situationId = true && that.isSetSituationId();
    if (this_present_situationId || that_present_situationId) {
      if (!(this_present_situationId && that_present_situationId))
        return false;
      if (!this.situationId.equals(that.situationId))
        return false;
    }

    boolean this_present_propertyList = true && this.isSetPropertyList();
    boolean that_present_propertyList = true && that.isSetPropertyList();
    if (this_present_propertyList || that_present_propertyList) {
      if (!(this_present_propertyList && that_present_propertyList))
        return false;
      if (!this.propertyList.equals(that.propertyList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_role = true && (isSetRole());
    list.add(present_role);
    if (present_role)
      list.add(role);

    boolean present_entityId = true && (isSetEntityId());
    list.add(present_entityId);
    if (present_entityId)
      list.add(entityId);

    boolean present_situationId = true && (isSetSituationId());
    list.add(present_situationId);
    if (present_situationId)
      list.add(situationId);

    boolean present_propertyList = true && (isSetPropertyList());
    list.add(present_propertyList);
    if (present_propertyList)
      list.add(propertyList);

    return list.hashCode();
  }

  @Override
  public int compareTo(Argument other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetRole()).compareTo(other.isSetRole());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRole()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.role, other.role);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEntityId()).compareTo(other.isSetEntityId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEntityId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.entityId, other.entityId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSituationId()).compareTo(other.isSetSituationId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSituationId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.situationId, other.situationId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPropertyList()).compareTo(other.isSetPropertyList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPropertyList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.propertyList, other.propertyList);
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
    StringBuilder sb = new StringBuilder("Argument(");
    boolean first = true;

    if (isSetRole()) {
      sb.append("role:");
      if (this.role == null) {
        sb.append("null");
      } else {
        sb.append(this.role);
      }
      first = false;
    }
    if (isSetEntityId()) {
      if (!first) sb.append(", ");
      sb.append("entityId:");
      if (this.entityId == null) {
        sb.append("null");
      } else {
        sb.append(this.entityId);
      }
      first = false;
    }
    if (isSetSituationId()) {
      if (!first) sb.append(", ");
      sb.append("situationId:");
      if (this.situationId == null) {
        sb.append("null");
      } else {
        sb.append(this.situationId);
      }
      first = false;
    }
    if (isSetPropertyList()) {
      if (!first) sb.append(", ");
      sb.append("propertyList:");
      if (this.propertyList == null) {
        sb.append("null");
      } else {
        sb.append(this.propertyList);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (entityId != null) {
      entityId.validate();
    }
    if (situationId != null) {
      situationId.validate();
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

  private static class ArgumentStandardSchemeFactory implements SchemeFactory {
    public ArgumentStandardScheme getScheme() {
      return new ArgumentStandardScheme();
    }
  }

  private static class ArgumentStandardScheme extends StandardScheme<Argument> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Argument struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ROLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.role = iprot.readString();
              struct.setRoleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ENTITY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.entityId = new edu.jhu.hlt.concrete.UUID();
              struct.entityId.read(iprot);
              struct.setEntityIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SITUATION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.situationId = new edu.jhu.hlt.concrete.UUID();
              struct.situationId.read(iprot);
              struct.setSituationIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PROPERTY_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.propertyList = new ArrayList<Property>(_list0.size);
                Property _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new Property();
                  _elem1.read(iprot);
                  struct.propertyList.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setPropertyListIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Argument struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.role != null) {
        if (struct.isSetRole()) {
          oprot.writeFieldBegin(ROLE_FIELD_DESC);
          oprot.writeString(struct.role);
          oprot.writeFieldEnd();
        }
      }
      if (struct.entityId != null) {
        if (struct.isSetEntityId()) {
          oprot.writeFieldBegin(ENTITY_ID_FIELD_DESC);
          struct.entityId.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.situationId != null) {
        if (struct.isSetSituationId()) {
          oprot.writeFieldBegin(SITUATION_ID_FIELD_DESC);
          struct.situationId.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.propertyList != null) {
        if (struct.isSetPropertyList()) {
          oprot.writeFieldBegin(PROPERTY_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.propertyList.size()));
            for (Property _iter3 : struct.propertyList)
            {
              _iter3.write(oprot);
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

  private static class ArgumentTupleSchemeFactory implements SchemeFactory {
    public ArgumentTupleScheme getScheme() {
      return new ArgumentTupleScheme();
    }
  }

  private static class ArgumentTupleScheme extends TupleScheme<Argument> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Argument struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetRole()) {
        optionals.set(0);
      }
      if (struct.isSetEntityId()) {
        optionals.set(1);
      }
      if (struct.isSetSituationId()) {
        optionals.set(2);
      }
      if (struct.isSetPropertyList()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetRole()) {
        oprot.writeString(struct.role);
      }
      if (struct.isSetEntityId()) {
        struct.entityId.write(oprot);
      }
      if (struct.isSetSituationId()) {
        struct.situationId.write(oprot);
      }
      if (struct.isSetPropertyList()) {
        {
          oprot.writeI32(struct.propertyList.size());
          for (Property _iter4 : struct.propertyList)
          {
            _iter4.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Argument struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.role = iprot.readString();
        struct.setRoleIsSet(true);
      }
      if (incoming.get(1)) {
        struct.entityId = new edu.jhu.hlt.concrete.UUID();
        struct.entityId.read(iprot);
        struct.setEntityIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.situationId = new edu.jhu.hlt.concrete.UUID();
        struct.situationId.read(iprot);
        struct.setSituationIdIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.propertyList = new ArrayList<Property>(_list5.size);
          Property _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = new Property();
            _elem6.read(iprot);
            struct.propertyList.add(_elem6);
          }
        }
        struct.setPropertyListIsSet(true);
      }
    }
  }

}


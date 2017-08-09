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
 * Represents a dependency parse with typed edges.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)")
public class DependencyParse implements org.apache.thrift.TBase<DependencyParse, DependencyParse._Fields>, java.io.Serializable, Cloneable, Comparable<DependencyParse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DependencyParse");

  private static final org.apache.thrift.protocol.TField UUID_FIELD_DESC = new org.apache.thrift.protocol.TField("uuid", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField METADATA_FIELD_DESC = new org.apache.thrift.protocol.TField("metadata", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField DEPENDENCY_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("dependencyList", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField STRUCTURE_INFORMATION_FIELD_DESC = new org.apache.thrift.protocol.TField("structureInformation", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DependencyParseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DependencyParseTupleSchemeFactory());
  }

  private edu.jhu.hlt.concrete.UUID uuid; // required
  private edu.jhu.hlt.concrete.AnnotationMetadata metadata; // required
  private List<Dependency> dependencyList; // required
  private DependencyParseStructure structureInformation; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    UUID((short)1, "uuid"),
    METADATA((short)2, "metadata"),
    DEPENDENCY_LIST((short)3, "dependencyList"),
    STRUCTURE_INFORMATION((short)4, "structureInformation");

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
        case 3: // DEPENDENCY_LIST
          return DEPENDENCY_LIST;
        case 4: // STRUCTURE_INFORMATION
          return STRUCTURE_INFORMATION;
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
  private static final _Fields optionals[] = {_Fields.STRUCTURE_INFORMATION};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.UUID, new org.apache.thrift.meta_data.FieldMetaData("uuid", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.jhu.hlt.concrete.UUID.class)));
    tmpMap.put(_Fields.METADATA, new org.apache.thrift.meta_data.FieldMetaData("metadata", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.jhu.hlt.concrete.AnnotationMetadata.class)));
    tmpMap.put(_Fields.DEPENDENCY_LIST, new org.apache.thrift.meta_data.FieldMetaData("dependencyList", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Dependency.class))));
    tmpMap.put(_Fields.STRUCTURE_INFORMATION, new org.apache.thrift.meta_data.FieldMetaData("structureInformation", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, DependencyParseStructure.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DependencyParse.class, metaDataMap);
  }

  public DependencyParse() {
  }

  public DependencyParse(
    edu.jhu.hlt.concrete.UUID uuid,
    edu.jhu.hlt.concrete.AnnotationMetadata metadata,
    List<Dependency> dependencyList)
  {
    this();
    this.uuid = uuid;
    this.metadata = metadata;
    this.dependencyList = dependencyList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DependencyParse(DependencyParse other) {
    if (other.isSetUuid()) {
      this.uuid = new edu.jhu.hlt.concrete.UUID(other.uuid);
    }
    if (other.isSetMetadata()) {
      this.metadata = new edu.jhu.hlt.concrete.AnnotationMetadata(other.metadata);
    }
    if (other.isSetDependencyList()) {
      List<Dependency> __this__dependencyList = new ArrayList<Dependency>(other.dependencyList.size());
      for (Dependency other_element : other.dependencyList) {
        __this__dependencyList.add(new Dependency(other_element));
      }
      this.dependencyList = __this__dependencyList;
    }
    if (other.isSetStructureInformation()) {
      this.structureInformation = new DependencyParseStructure(other.structureInformation);
    }
  }

  public DependencyParse deepCopy() {
    return new DependencyParse(this);
  }

  @Override
  public void clear() {
    this.uuid = null;
    this.metadata = null;
    this.dependencyList = null;
    this.structureInformation = null;
  }

  public edu.jhu.hlt.concrete.UUID getUuid() {
    return this.uuid;
  }

  public DependencyParse setUuid(edu.jhu.hlt.concrete.UUID uuid) {
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

  public edu.jhu.hlt.concrete.AnnotationMetadata getMetadata() {
    return this.metadata;
  }

  public DependencyParse setMetadata(edu.jhu.hlt.concrete.AnnotationMetadata metadata) {
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

  public int getDependencyListSize() {
    return (this.dependencyList == null) ? 0 : this.dependencyList.size();
  }

  public java.util.Iterator<Dependency> getDependencyListIterator() {
    return (this.dependencyList == null) ? null : this.dependencyList.iterator();
  }

  public void addToDependencyList(Dependency elem) {
    if (this.dependencyList == null) {
      this.dependencyList = new ArrayList<Dependency>();
    }
    this.dependencyList.add(elem);
  }

  public List<Dependency> getDependencyList() {
    return this.dependencyList;
  }

  public DependencyParse setDependencyList(List<Dependency> dependencyList) {
    this.dependencyList = dependencyList;
    return this;
  }

  public void unsetDependencyList() {
    this.dependencyList = null;
  }

  /** Returns true if field dependencyList is set (has been assigned a value) and false otherwise */
  public boolean isSetDependencyList() {
    return this.dependencyList != null;
  }

  public void setDependencyListIsSet(boolean value) {
    if (!value) {
      this.dependencyList = null;
    }
  }

  public DependencyParseStructure getStructureInformation() {
    return this.structureInformation;
  }

  public DependencyParse setStructureInformation(DependencyParseStructure structureInformation) {
    this.structureInformation = structureInformation;
    return this;
  }

  public void unsetStructureInformation() {
    this.structureInformation = null;
  }

  /** Returns true if field structureInformation is set (has been assigned a value) and false otherwise */
  public boolean isSetStructureInformation() {
    return this.structureInformation != null;
  }

  public void setStructureInformationIsSet(boolean value) {
    if (!value) {
      this.structureInformation = null;
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

    case DEPENDENCY_LIST:
      if (value == null) {
        unsetDependencyList();
      } else {
        setDependencyList((List<Dependency>)value);
      }
      break;

    case STRUCTURE_INFORMATION:
      if (value == null) {
        unsetStructureInformation();
      } else {
        setStructureInformation((DependencyParseStructure)value);
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

    case DEPENDENCY_LIST:
      return getDependencyList();

    case STRUCTURE_INFORMATION:
      return getStructureInformation();

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
    case DEPENDENCY_LIST:
      return isSetDependencyList();
    case STRUCTURE_INFORMATION:
      return isSetStructureInformation();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DependencyParse)
      return this.equals((DependencyParse)that);
    return false;
  }

  public boolean equals(DependencyParse that) {
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

    boolean this_present_dependencyList = true && this.isSetDependencyList();
    boolean that_present_dependencyList = true && that.isSetDependencyList();
    if (this_present_dependencyList || that_present_dependencyList) {
      if (!(this_present_dependencyList && that_present_dependencyList))
        return false;
      if (!this.dependencyList.equals(that.dependencyList))
        return false;
    }

    boolean this_present_structureInformation = true && this.isSetStructureInformation();
    boolean that_present_structureInformation = true && that.isSetStructureInformation();
    if (this_present_structureInformation || that_present_structureInformation) {
      if (!(this_present_structureInformation && that_present_structureInformation))
        return false;
      if (!this.structureInformation.equals(that.structureInformation))
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

    boolean present_dependencyList = true && (isSetDependencyList());
    list.add(present_dependencyList);
    if (present_dependencyList)
      list.add(dependencyList);

    boolean present_structureInformation = true && (isSetStructureInformation());
    list.add(present_structureInformation);
    if (present_structureInformation)
      list.add(structureInformation);

    return list.hashCode();
  }

  @Override
  public int compareTo(DependencyParse other) {
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
    lastComparison = Boolean.valueOf(isSetDependencyList()).compareTo(other.isSetDependencyList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDependencyList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dependencyList, other.dependencyList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStructureInformation()).compareTo(other.isSetStructureInformation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStructureInformation()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.structureInformation, other.structureInformation);
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
    StringBuilder sb = new StringBuilder("DependencyParse(");
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
    sb.append("dependencyList:");
    if (this.dependencyList == null) {
      sb.append("null");
    } else {
      sb.append(this.dependencyList);
    }
    first = false;
    if (isSetStructureInformation()) {
      if (!first) sb.append(", ");
      sb.append("structureInformation:");
      if (this.structureInformation == null) {
        sb.append("null");
      } else {
        sb.append(this.structureInformation);
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
    if (dependencyList == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'dependencyList' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (uuid != null) {
      uuid.validate();
    }
    if (metadata != null) {
      metadata.validate();
    }
    if (structureInformation != null) {
      structureInformation.validate();
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

  private static class DependencyParseStandardSchemeFactory implements SchemeFactory {
    public DependencyParseStandardScheme getScheme() {
      return new DependencyParseStandardScheme();
    }
  }

  private static class DependencyParseStandardScheme extends StandardScheme<DependencyParse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DependencyParse struct) throws org.apache.thrift.TException {
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
          case 3: // DEPENDENCY_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                struct.dependencyList = new ArrayList<Dependency>(_list16.size);
                Dependency _elem17;
                for (int _i18 = 0; _i18 < _list16.size; ++_i18)
                {
                  _elem17 = new Dependency();
                  _elem17.read(iprot);
                  struct.dependencyList.add(_elem17);
                }
                iprot.readListEnd();
              }
              struct.setDependencyListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // STRUCTURE_INFORMATION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.structureInformation = new DependencyParseStructure();
              struct.structureInformation.read(iprot);
              struct.setStructureInformationIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DependencyParse struct) throws org.apache.thrift.TException {
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
      if (struct.dependencyList != null) {
        oprot.writeFieldBegin(DEPENDENCY_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.dependencyList.size()));
          for (Dependency _iter19 : struct.dependencyList)
          {
            _iter19.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.structureInformation != null) {
        if (struct.isSetStructureInformation()) {
          oprot.writeFieldBegin(STRUCTURE_INFORMATION_FIELD_DESC);
          struct.structureInformation.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DependencyParseTupleSchemeFactory implements SchemeFactory {
    public DependencyParseTupleScheme getScheme() {
      return new DependencyParseTupleScheme();
    }
  }

  private static class DependencyParseTupleScheme extends TupleScheme<DependencyParse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DependencyParse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.uuid.write(oprot);
      struct.metadata.write(oprot);
      {
        oprot.writeI32(struct.dependencyList.size());
        for (Dependency _iter20 : struct.dependencyList)
        {
          _iter20.write(oprot);
        }
      }
      BitSet optionals = new BitSet();
      if (struct.isSetStructureInformation()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetStructureInformation()) {
        struct.structureInformation.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DependencyParse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.uuid = new edu.jhu.hlt.concrete.UUID();
      struct.uuid.read(iprot);
      struct.setUuidIsSet(true);
      struct.metadata = new edu.jhu.hlt.concrete.AnnotationMetadata();
      struct.metadata.read(iprot);
      struct.setMetadataIsSet(true);
      {
        org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.dependencyList = new ArrayList<Dependency>(_list21.size);
        Dependency _elem22;
        for (int _i23 = 0; _i23 < _list21.size; ++_i23)
        {
          _elem22 = new Dependency();
          _elem22.read(iprot);
          struct.dependencyList.add(_elem22);
        }
      }
      struct.setDependencyListIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.structureInformation = new DependencyParseStructure();
        struct.structureInformation.read(iprot);
        struct.setStructureInformationIsSet(true);
      }
    }
  }

}


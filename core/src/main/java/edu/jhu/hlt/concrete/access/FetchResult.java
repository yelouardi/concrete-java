/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.jhu.hlt.concrete.access;

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
 * Struct containing Communications from the FetchCommunicationService service.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-01-10")
public class FetchResult implements org.apache.thrift.TBase<FetchResult, FetchResult._Fields>, java.io.Serializable, Cloneable, Comparable<FetchResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("FetchResult");

  private static final org.apache.thrift.protocol.TField COMMUNICATIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("communications", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new FetchResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new FetchResultTupleSchemeFactory());
  }

  private List<edu.jhu.hlt.concrete.Communication> communications; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * a list of Communication objects that represent the results of the request
     */
    COMMUNICATIONS((short)1, "communications");

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
        case 1: // COMMUNICATIONS
          return COMMUNICATIONS;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COMMUNICATIONS, new org.apache.thrift.meta_data.FieldMetaData("communications", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.jhu.hlt.concrete.Communication.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(FetchResult.class, metaDataMap);
  }

  public FetchResult() {
  }

  public FetchResult(
    List<edu.jhu.hlt.concrete.Communication> communications)
  {
    this();
    this.communications = communications;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public FetchResult(FetchResult other) {
    if (other.isSetCommunications()) {
      List<edu.jhu.hlt.concrete.Communication> __this__communications = new ArrayList<edu.jhu.hlt.concrete.Communication>(other.communications.size());
      for (edu.jhu.hlt.concrete.Communication other_element : other.communications) {
        __this__communications.add(new edu.jhu.hlt.concrete.Communication(other_element));
      }
      this.communications = __this__communications;
    }
  }

  public FetchResult deepCopy() {
    return new FetchResult(this);
  }

  @Override
  public void clear() {
    this.communications = null;
  }

  public int getCommunicationsSize() {
    return (this.communications == null) ? 0 : this.communications.size();
  }

  public java.util.Iterator<edu.jhu.hlt.concrete.Communication> getCommunicationsIterator() {
    return (this.communications == null) ? null : this.communications.iterator();
  }

  public void addToCommunications(edu.jhu.hlt.concrete.Communication elem) {
    if (this.communications == null) {
      this.communications = new ArrayList<edu.jhu.hlt.concrete.Communication>();
    }
    this.communications.add(elem);
  }

  /**
   * a list of Communication objects that represent the results of the request
   */
  public List<edu.jhu.hlt.concrete.Communication> getCommunications() {
    return this.communications;
  }

  /**
   * a list of Communication objects that represent the results of the request
   */
  public FetchResult setCommunications(List<edu.jhu.hlt.concrete.Communication> communications) {
    this.communications = communications;
    return this;
  }

  public void unsetCommunications() {
    this.communications = null;
  }

  /** Returns true if field communications is set (has been assigned a value) and false otherwise */
  public boolean isSetCommunications() {
    return this.communications != null;
  }

  public void setCommunicationsIsSet(boolean value) {
    if (!value) {
      this.communications = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case COMMUNICATIONS:
      if (value == null) {
        unsetCommunications();
      } else {
        setCommunications((List<edu.jhu.hlt.concrete.Communication>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case COMMUNICATIONS:
      return getCommunications();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case COMMUNICATIONS:
      return isSetCommunications();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof FetchResult)
      return this.equals((FetchResult)that);
    return false;
  }

  public boolean equals(FetchResult that) {
    if (that == null)
      return false;

    boolean this_present_communications = true && this.isSetCommunications();
    boolean that_present_communications = true && that.isSetCommunications();
    if (this_present_communications || that_present_communications) {
      if (!(this_present_communications && that_present_communications))
        return false;
      if (!this.communications.equals(that.communications))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_communications = true && (isSetCommunications());
    list.add(present_communications);
    if (present_communications)
      list.add(communications);

    return list.hashCode();
  }

  @Override
  public int compareTo(FetchResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCommunications()).compareTo(other.isSetCommunications());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCommunications()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.communications, other.communications);
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
    StringBuilder sb = new StringBuilder("FetchResult(");
    boolean first = true;

    sb.append("communications:");
    if (this.communications == null) {
      sb.append("null");
    } else {
      sb.append(this.communications);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (communications == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'communications' was not present! Struct: " + toString());
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class FetchResultStandardSchemeFactory implements SchemeFactory {
    public FetchResultStandardScheme getScheme() {
      return new FetchResultStandardScheme();
    }
  }

  private static class FetchResultStandardScheme extends StandardScheme<FetchResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, FetchResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COMMUNICATIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.communications = new ArrayList<edu.jhu.hlt.concrete.Communication>(_list0.size);
                edu.jhu.hlt.concrete.Communication _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new edu.jhu.hlt.concrete.Communication();
                  _elem1.read(iprot);
                  struct.communications.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setCommunicationsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, FetchResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.communications != null) {
        oprot.writeFieldBegin(COMMUNICATIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.communications.size()));
          for (edu.jhu.hlt.concrete.Communication _iter3 : struct.communications)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class FetchResultTupleSchemeFactory implements SchemeFactory {
    public FetchResultTupleScheme getScheme() {
      return new FetchResultTupleScheme();
    }
  }

  private static class FetchResultTupleScheme extends TupleScheme<FetchResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, FetchResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.communications.size());
        for (edu.jhu.hlt.concrete.Communication _iter4 : struct.communications)
        {
          _iter4.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, FetchResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.communications = new ArrayList<edu.jhu.hlt.concrete.Communication>(_list5.size);
        edu.jhu.hlt.concrete.Communication _elem6;
        for (int _i7 = 0; _i7 < _list5.size; ++_i7)
        {
          _elem6 = new edu.jhu.hlt.concrete.Communication();
          _elem6.read(iprot);
          struct.communications.add(_elem6);
        }
      }
      struct.setCommunicationsIsSet(true);
    }
  }

}


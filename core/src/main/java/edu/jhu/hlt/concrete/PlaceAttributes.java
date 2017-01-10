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
public class PlaceAttributes implements org.apache.thrift.TBase<PlaceAttributes, PlaceAttributes._Fields>, java.io.Serializable, Cloneable, Comparable<PlaceAttributes> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PlaceAttributes");

  private static final org.apache.thrift.protocol.TField STREET_ADDRESS_FIELD_DESC = new org.apache.thrift.protocol.TField("streetAddress", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField REGION_FIELD_DESC = new org.apache.thrift.protocol.TField("region", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField LOCALITY_FIELD_DESC = new org.apache.thrift.protocol.TField("locality", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PlaceAttributesStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PlaceAttributesTupleSchemeFactory());
  }

  private String streetAddress; // optional
  private String region; // optional
  private String locality; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STREET_ADDRESS((short)1, "streetAddress"),
    REGION((short)2, "region"),
    LOCALITY((short)3, "locality");

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
        case 1: // STREET_ADDRESS
          return STREET_ADDRESS;
        case 2: // REGION
          return REGION;
        case 3: // LOCALITY
          return LOCALITY;
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
  private static final _Fields optionals[] = {_Fields.STREET_ADDRESS,_Fields.REGION,_Fields.LOCALITY};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STREET_ADDRESS, new org.apache.thrift.meta_data.FieldMetaData("streetAddress", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REGION, new org.apache.thrift.meta_data.FieldMetaData("region", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LOCALITY, new org.apache.thrift.meta_data.FieldMetaData("locality", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PlaceAttributes.class, metaDataMap);
  }

  public PlaceAttributes() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PlaceAttributes(PlaceAttributes other) {
    if (other.isSetStreetAddress()) {
      this.streetAddress = other.streetAddress;
    }
    if (other.isSetRegion()) {
      this.region = other.region;
    }
    if (other.isSetLocality()) {
      this.locality = other.locality;
    }
  }

  public PlaceAttributes deepCopy() {
    return new PlaceAttributes(this);
  }

  @Override
  public void clear() {
    this.streetAddress = null;
    this.region = null;
    this.locality = null;
  }

  public String getStreetAddress() {
    return this.streetAddress;
  }

  public PlaceAttributes setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

  public void unsetStreetAddress() {
    this.streetAddress = null;
  }

  /** Returns true if field streetAddress is set (has been assigned a value) and false otherwise */
  public boolean isSetStreetAddress() {
    return this.streetAddress != null;
  }

  public void setStreetAddressIsSet(boolean value) {
    if (!value) {
      this.streetAddress = null;
    }
  }

  public String getRegion() {
    return this.region;
  }

  public PlaceAttributes setRegion(String region) {
    this.region = region;
    return this;
  }

  public void unsetRegion() {
    this.region = null;
  }

  /** Returns true if field region is set (has been assigned a value) and false otherwise */
  public boolean isSetRegion() {
    return this.region != null;
  }

  public void setRegionIsSet(boolean value) {
    if (!value) {
      this.region = null;
    }
  }

  public String getLocality() {
    return this.locality;
  }

  public PlaceAttributes setLocality(String locality) {
    this.locality = locality;
    return this;
  }

  public void unsetLocality() {
    this.locality = null;
  }

  /** Returns true if field locality is set (has been assigned a value) and false otherwise */
  public boolean isSetLocality() {
    return this.locality != null;
  }

  public void setLocalityIsSet(boolean value) {
    if (!value) {
      this.locality = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STREET_ADDRESS:
      if (value == null) {
        unsetStreetAddress();
      } else {
        setStreetAddress((String)value);
      }
      break;

    case REGION:
      if (value == null) {
        unsetRegion();
      } else {
        setRegion((String)value);
      }
      break;

    case LOCALITY:
      if (value == null) {
        unsetLocality();
      } else {
        setLocality((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STREET_ADDRESS:
      return getStreetAddress();

    case REGION:
      return getRegion();

    case LOCALITY:
      return getLocality();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STREET_ADDRESS:
      return isSetStreetAddress();
    case REGION:
      return isSetRegion();
    case LOCALITY:
      return isSetLocality();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PlaceAttributes)
      return this.equals((PlaceAttributes)that);
    return false;
  }

  public boolean equals(PlaceAttributes that) {
    if (that == null)
      return false;

    boolean this_present_streetAddress = true && this.isSetStreetAddress();
    boolean that_present_streetAddress = true && that.isSetStreetAddress();
    if (this_present_streetAddress || that_present_streetAddress) {
      if (!(this_present_streetAddress && that_present_streetAddress))
        return false;
      if (!this.streetAddress.equals(that.streetAddress))
        return false;
    }

    boolean this_present_region = true && this.isSetRegion();
    boolean that_present_region = true && that.isSetRegion();
    if (this_present_region || that_present_region) {
      if (!(this_present_region && that_present_region))
        return false;
      if (!this.region.equals(that.region))
        return false;
    }

    boolean this_present_locality = true && this.isSetLocality();
    boolean that_present_locality = true && that.isSetLocality();
    if (this_present_locality || that_present_locality) {
      if (!(this_present_locality && that_present_locality))
        return false;
      if (!this.locality.equals(that.locality))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_streetAddress = true && (isSetStreetAddress());
    list.add(present_streetAddress);
    if (present_streetAddress)
      list.add(streetAddress);

    boolean present_region = true && (isSetRegion());
    list.add(present_region);
    if (present_region)
      list.add(region);

    boolean present_locality = true && (isSetLocality());
    list.add(present_locality);
    if (present_locality)
      list.add(locality);

    return list.hashCode();
  }

  @Override
  public int compareTo(PlaceAttributes other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStreetAddress()).compareTo(other.isSetStreetAddress());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStreetAddress()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.streetAddress, other.streetAddress);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRegion()).compareTo(other.isSetRegion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRegion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.region, other.region);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLocality()).compareTo(other.isSetLocality());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLocality()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.locality, other.locality);
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
    StringBuilder sb = new StringBuilder("PlaceAttributes(");
    boolean first = true;

    if (isSetStreetAddress()) {
      sb.append("streetAddress:");
      if (this.streetAddress == null) {
        sb.append("null");
      } else {
        sb.append(this.streetAddress);
      }
      first = false;
    }
    if (isSetRegion()) {
      if (!first) sb.append(", ");
      sb.append("region:");
      if (this.region == null) {
        sb.append("null");
      } else {
        sb.append(this.region);
      }
      first = false;
    }
    if (isSetLocality()) {
      if (!first) sb.append(", ");
      sb.append("locality:");
      if (this.locality == null) {
        sb.append("null");
      } else {
        sb.append(this.locality);
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PlaceAttributesStandardSchemeFactory implements SchemeFactory {
    public PlaceAttributesStandardScheme getScheme() {
      return new PlaceAttributesStandardScheme();
    }
  }

  private static class PlaceAttributesStandardScheme extends StandardScheme<PlaceAttributes> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PlaceAttributes struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STREET_ADDRESS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.streetAddress = iprot.readString();
              struct.setStreetAddressIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // REGION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.region = iprot.readString();
              struct.setRegionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LOCALITY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.locality = iprot.readString();
              struct.setLocalityIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, PlaceAttributes struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.streetAddress != null) {
        if (struct.isSetStreetAddress()) {
          oprot.writeFieldBegin(STREET_ADDRESS_FIELD_DESC);
          oprot.writeString(struct.streetAddress);
          oprot.writeFieldEnd();
        }
      }
      if (struct.region != null) {
        if (struct.isSetRegion()) {
          oprot.writeFieldBegin(REGION_FIELD_DESC);
          oprot.writeString(struct.region);
          oprot.writeFieldEnd();
        }
      }
      if (struct.locality != null) {
        if (struct.isSetLocality()) {
          oprot.writeFieldBegin(LOCALITY_FIELD_DESC);
          oprot.writeString(struct.locality);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PlaceAttributesTupleSchemeFactory implements SchemeFactory {
    public PlaceAttributesTupleScheme getScheme() {
      return new PlaceAttributesTupleScheme();
    }
  }

  private static class PlaceAttributesTupleScheme extends TupleScheme<PlaceAttributes> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PlaceAttributes struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetStreetAddress()) {
        optionals.set(0);
      }
      if (struct.isSetRegion()) {
        optionals.set(1);
      }
      if (struct.isSetLocality()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetStreetAddress()) {
        oprot.writeString(struct.streetAddress);
      }
      if (struct.isSetRegion()) {
        oprot.writeString(struct.region);
      }
      if (struct.isSetLocality()) {
        oprot.writeString(struct.locality);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PlaceAttributes struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.streetAddress = iprot.readString();
        struct.setStreetAddressIsSet(true);
      }
      if (incoming.get(1)) {
        struct.region = iprot.readString();
        struct.setRegionIsSet(true);
      }
      if (incoming.get(2)) {
        struct.locality = iprot.readString();
        struct.setLocalityIsSet(true);
      }
    }
  }

}


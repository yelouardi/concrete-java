/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.jhu.hlt.concrete;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)")
public class TwitterPlace implements org.apache.thrift.TBase<TwitterPlace, TwitterPlace._Fields>, java.io.Serializable, Cloneable, Comparable<TwitterPlace> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TwitterPlace");

  private static final org.apache.thrift.protocol.TField PLACE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("placeType", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField COUNTRY_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("countryCode", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField COUNTRY_FIELD_DESC = new org.apache.thrift.protocol.TField("country", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField FULL_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("fullName", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField URL_FIELD_DESC = new org.apache.thrift.protocol.TField("url", org.apache.thrift.protocol.TType.STRING, (short)7);
  private static final org.apache.thrift.protocol.TField BOUNDING_BOX_FIELD_DESC = new org.apache.thrift.protocol.TField("boundingBox", org.apache.thrift.protocol.TType.STRUCT, (short)8);
  private static final org.apache.thrift.protocol.TField ATTRIBUTES_FIELD_DESC = new org.apache.thrift.protocol.TField("attributes", org.apache.thrift.protocol.TType.STRUCT, (short)9);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TwitterPlaceStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TwitterPlaceTupleSchemeFactory();

  private java.lang.String placeType; // optional
  private java.lang.String countryCode; // optional
  private java.lang.String country; // optional
  private java.lang.String fullName; // optional
  private java.lang.String name; // optional
  private java.lang.String id; // optional
  private java.lang.String url; // optional
  private BoundingBox boundingBox; // optional
  private PlaceAttributes attributes; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PLACE_TYPE((short)1, "placeType"),
    COUNTRY_CODE((short)2, "countryCode"),
    COUNTRY((short)3, "country"),
    FULL_NAME((short)4, "fullName"),
    NAME((short)5, "name"),
    ID((short)6, "id"),
    URL((short)7, "url"),
    BOUNDING_BOX((short)8, "boundingBox"),
    ATTRIBUTES((short)9, "attributes");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PLACE_TYPE
          return PLACE_TYPE;
        case 2: // COUNTRY_CODE
          return COUNTRY_CODE;
        case 3: // COUNTRY
          return COUNTRY;
        case 4: // FULL_NAME
          return FULL_NAME;
        case 5: // NAME
          return NAME;
        case 6: // ID
          return ID;
        case 7: // URL
          return URL;
        case 8: // BOUNDING_BOX
          return BOUNDING_BOX;
        case 9: // ATTRIBUTES
          return ATTRIBUTES;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.PLACE_TYPE,_Fields.COUNTRY_CODE,_Fields.COUNTRY,_Fields.FULL_NAME,_Fields.NAME,_Fields.ID,_Fields.URL,_Fields.BOUNDING_BOX,_Fields.ATTRIBUTES};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PLACE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("placeType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COUNTRY_CODE, new org.apache.thrift.meta_data.FieldMetaData("countryCode", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COUNTRY, new org.apache.thrift.meta_data.FieldMetaData("country", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FULL_NAME, new org.apache.thrift.meta_data.FieldMetaData("fullName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.URL, new org.apache.thrift.meta_data.FieldMetaData("url", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.BOUNDING_BOX, new org.apache.thrift.meta_data.FieldMetaData("boundingBox", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BoundingBox.class)));
    tmpMap.put(_Fields.ATTRIBUTES, new org.apache.thrift.meta_data.FieldMetaData("attributes", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PlaceAttributes.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TwitterPlace.class, metaDataMap);
  }

  public TwitterPlace() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TwitterPlace(TwitterPlace other) {
    if (other.isSetPlaceType()) {
      this.placeType = other.placeType;
    }
    if (other.isSetCountryCode()) {
      this.countryCode = other.countryCode;
    }
    if (other.isSetCountry()) {
      this.country = other.country;
    }
    if (other.isSetFullName()) {
      this.fullName = other.fullName;
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetId()) {
      this.id = other.id;
    }
    if (other.isSetUrl()) {
      this.url = other.url;
    }
    if (other.isSetBoundingBox()) {
      this.boundingBox = new BoundingBox(other.boundingBox);
    }
    if (other.isSetAttributes()) {
      this.attributes = new PlaceAttributes(other.attributes);
    }
  }

  public TwitterPlace deepCopy() {
    return new TwitterPlace(this);
  }

  @Override
  public void clear() {
    this.placeType = null;
    this.countryCode = null;
    this.country = null;
    this.fullName = null;
    this.name = null;
    this.id = null;
    this.url = null;
    this.boundingBox = null;
    this.attributes = null;
  }

  public java.lang.String getPlaceType() {
    return this.placeType;
  }

  public TwitterPlace setPlaceType(java.lang.String placeType) {
    this.placeType = placeType;
    return this;
  }

  public void unsetPlaceType() {
    this.placeType = null;
  }

  /** Returns true if field placeType is set (has been assigned a value) and false otherwise */
  public boolean isSetPlaceType() {
    return this.placeType != null;
  }

  public void setPlaceTypeIsSet(boolean value) {
    if (!value) {
      this.placeType = null;
    }
  }

  public java.lang.String getCountryCode() {
    return this.countryCode;
  }

  public TwitterPlace setCountryCode(java.lang.String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  public void unsetCountryCode() {
    this.countryCode = null;
  }

  /** Returns true if field countryCode is set (has been assigned a value) and false otherwise */
  public boolean isSetCountryCode() {
    return this.countryCode != null;
  }

  public void setCountryCodeIsSet(boolean value) {
    if (!value) {
      this.countryCode = null;
    }
  }

  public java.lang.String getCountry() {
    return this.country;
  }

  public TwitterPlace setCountry(java.lang.String country) {
    this.country = country;
    return this;
  }

  public void unsetCountry() {
    this.country = null;
  }

  /** Returns true if field country is set (has been assigned a value) and false otherwise */
  public boolean isSetCountry() {
    return this.country != null;
  }

  public void setCountryIsSet(boolean value) {
    if (!value) {
      this.country = null;
    }
  }

  public java.lang.String getFullName() {
    return this.fullName;
  }

  public TwitterPlace setFullName(java.lang.String fullName) {
    this.fullName = fullName;
    return this;
  }

  public void unsetFullName() {
    this.fullName = null;
  }

  /** Returns true if field fullName is set (has been assigned a value) and false otherwise */
  public boolean isSetFullName() {
    return this.fullName != null;
  }

  public void setFullNameIsSet(boolean value) {
    if (!value) {
      this.fullName = null;
    }
  }

  public java.lang.String getName() {
    return this.name;
  }

  public TwitterPlace setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public java.lang.String getId() {
    return this.id;
  }

  public TwitterPlace setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  public void unsetId() {
    this.id = null;
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return this.id != null;
  }

  public void setIdIsSet(boolean value) {
    if (!value) {
      this.id = null;
    }
  }

  public java.lang.String getUrl() {
    return this.url;
  }

  public TwitterPlace setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  public void unsetUrl() {
    this.url = null;
  }

  /** Returns true if field url is set (has been assigned a value) and false otherwise */
  public boolean isSetUrl() {
    return this.url != null;
  }

  public void setUrlIsSet(boolean value) {
    if (!value) {
      this.url = null;
    }
  }

  public BoundingBox getBoundingBox() {
    return this.boundingBox;
  }

  public TwitterPlace setBoundingBox(BoundingBox boundingBox) {
    this.boundingBox = boundingBox;
    return this;
  }

  public void unsetBoundingBox() {
    this.boundingBox = null;
  }

  /** Returns true if field boundingBox is set (has been assigned a value) and false otherwise */
  public boolean isSetBoundingBox() {
    return this.boundingBox != null;
  }

  public void setBoundingBoxIsSet(boolean value) {
    if (!value) {
      this.boundingBox = null;
    }
  }

  public PlaceAttributes getAttributes() {
    return this.attributes;
  }

  public TwitterPlace setAttributes(PlaceAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

  public void unsetAttributes() {
    this.attributes = null;
  }

  /** Returns true if field attributes is set (has been assigned a value) and false otherwise */
  public boolean isSetAttributes() {
    return this.attributes != null;
  }

  public void setAttributesIsSet(boolean value) {
    if (!value) {
      this.attributes = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case PLACE_TYPE:
      if (value == null) {
        unsetPlaceType();
      } else {
        setPlaceType((java.lang.String)value);
      }
      break;

    case COUNTRY_CODE:
      if (value == null) {
        unsetCountryCode();
      } else {
        setCountryCode((java.lang.String)value);
      }
      break;

    case COUNTRY:
      if (value == null) {
        unsetCountry();
      } else {
        setCountry((java.lang.String)value);
      }
      break;

    case FULL_NAME:
      if (value == null) {
        unsetFullName();
      } else {
        setFullName((java.lang.String)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((java.lang.String)value);
      }
      break;

    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.String)value);
      }
      break;

    case URL:
      if (value == null) {
        unsetUrl();
      } else {
        setUrl((java.lang.String)value);
      }
      break;

    case BOUNDING_BOX:
      if (value == null) {
        unsetBoundingBox();
      } else {
        setBoundingBox((BoundingBox)value);
      }
      break;

    case ATTRIBUTES:
      if (value == null) {
        unsetAttributes();
      } else {
        setAttributes((PlaceAttributes)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PLACE_TYPE:
      return getPlaceType();

    case COUNTRY_CODE:
      return getCountryCode();

    case COUNTRY:
      return getCountry();

    case FULL_NAME:
      return getFullName();

    case NAME:
      return getName();

    case ID:
      return getId();

    case URL:
      return getUrl();

    case BOUNDING_BOX:
      return getBoundingBox();

    case ATTRIBUTES:
      return getAttributes();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case PLACE_TYPE:
      return isSetPlaceType();
    case COUNTRY_CODE:
      return isSetCountryCode();
    case COUNTRY:
      return isSetCountry();
    case FULL_NAME:
      return isSetFullName();
    case NAME:
      return isSetName();
    case ID:
      return isSetId();
    case URL:
      return isSetUrl();
    case BOUNDING_BOX:
      return isSetBoundingBox();
    case ATTRIBUTES:
      return isSetAttributes();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TwitterPlace)
      return this.equals((TwitterPlace)that);
    return false;
  }

  public boolean equals(TwitterPlace that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_placeType = true && this.isSetPlaceType();
    boolean that_present_placeType = true && that.isSetPlaceType();
    if (this_present_placeType || that_present_placeType) {
      if (!(this_present_placeType && that_present_placeType))
        return false;
      if (!this.placeType.equals(that.placeType))
        return false;
    }

    boolean this_present_countryCode = true && this.isSetCountryCode();
    boolean that_present_countryCode = true && that.isSetCountryCode();
    if (this_present_countryCode || that_present_countryCode) {
      if (!(this_present_countryCode && that_present_countryCode))
        return false;
      if (!this.countryCode.equals(that.countryCode))
        return false;
    }

    boolean this_present_country = true && this.isSetCountry();
    boolean that_present_country = true && that.isSetCountry();
    if (this_present_country || that_present_country) {
      if (!(this_present_country && that_present_country))
        return false;
      if (!this.country.equals(that.country))
        return false;
    }

    boolean this_present_fullName = true && this.isSetFullName();
    boolean that_present_fullName = true && that.isSetFullName();
    if (this_present_fullName || that_present_fullName) {
      if (!(this_present_fullName && that_present_fullName))
        return false;
      if (!this.fullName.equals(that.fullName))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    boolean this_present_url = true && this.isSetUrl();
    boolean that_present_url = true && that.isSetUrl();
    if (this_present_url || that_present_url) {
      if (!(this_present_url && that_present_url))
        return false;
      if (!this.url.equals(that.url))
        return false;
    }

    boolean this_present_boundingBox = true && this.isSetBoundingBox();
    boolean that_present_boundingBox = true && that.isSetBoundingBox();
    if (this_present_boundingBox || that_present_boundingBox) {
      if (!(this_present_boundingBox && that_present_boundingBox))
        return false;
      if (!this.boundingBox.equals(that.boundingBox))
        return false;
    }

    boolean this_present_attributes = true && this.isSetAttributes();
    boolean that_present_attributes = true && that.isSetAttributes();
    if (this_present_attributes || that_present_attributes) {
      if (!(this_present_attributes && that_present_attributes))
        return false;
      if (!this.attributes.equals(that.attributes))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetPlaceType()) ? 131071 : 524287);
    if (isSetPlaceType())
      hashCode = hashCode * 8191 + placeType.hashCode();

    hashCode = hashCode * 8191 + ((isSetCountryCode()) ? 131071 : 524287);
    if (isSetCountryCode())
      hashCode = hashCode * 8191 + countryCode.hashCode();

    hashCode = hashCode * 8191 + ((isSetCountry()) ? 131071 : 524287);
    if (isSetCountry())
      hashCode = hashCode * 8191 + country.hashCode();

    hashCode = hashCode * 8191 + ((isSetFullName()) ? 131071 : 524287);
    if (isSetFullName())
      hashCode = hashCode * 8191 + fullName.hashCode();

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + ((isSetId()) ? 131071 : 524287);
    if (isSetId())
      hashCode = hashCode * 8191 + id.hashCode();

    hashCode = hashCode * 8191 + ((isSetUrl()) ? 131071 : 524287);
    if (isSetUrl())
      hashCode = hashCode * 8191 + url.hashCode();

    hashCode = hashCode * 8191 + ((isSetBoundingBox()) ? 131071 : 524287);
    if (isSetBoundingBox())
      hashCode = hashCode * 8191 + boundingBox.hashCode();

    hashCode = hashCode * 8191 + ((isSetAttributes()) ? 131071 : 524287);
    if (isSetAttributes())
      hashCode = hashCode * 8191 + attributes.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TwitterPlace other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetPlaceType()).compareTo(other.isSetPlaceType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPlaceType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.placeType, other.placeType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCountryCode()).compareTo(other.isSetCountryCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCountryCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.countryCode, other.countryCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCountry()).compareTo(other.isSetCountry());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCountry()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.country, other.country);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetFullName()).compareTo(other.isSetFullName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFullName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.fullName, other.fullName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUrl()).compareTo(other.isSetUrl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUrl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.url, other.url);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetBoundingBox()).compareTo(other.isSetBoundingBox());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBoundingBox()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.boundingBox, other.boundingBox);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAttributes()).compareTo(other.isSetAttributes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAttributes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.attributes, other.attributes);
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
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TwitterPlace(");
    boolean first = true;

    if (isSetPlaceType()) {
      sb.append("placeType:");
      if (this.placeType == null) {
        sb.append("null");
      } else {
        sb.append(this.placeType);
      }
      first = false;
    }
    if (isSetCountryCode()) {
      if (!first) sb.append(", ");
      sb.append("countryCode:");
      if (this.countryCode == null) {
        sb.append("null");
      } else {
        sb.append(this.countryCode);
      }
      first = false;
    }
    if (isSetCountry()) {
      if (!first) sb.append(", ");
      sb.append("country:");
      if (this.country == null) {
        sb.append("null");
      } else {
        sb.append(this.country);
      }
      first = false;
    }
    if (isSetFullName()) {
      if (!first) sb.append(", ");
      sb.append("fullName:");
      if (this.fullName == null) {
        sb.append("null");
      } else {
        sb.append(this.fullName);
      }
      first = false;
    }
    if (isSetName()) {
      if (!first) sb.append(", ");
      sb.append("name:");
      if (this.name == null) {
        sb.append("null");
      } else {
        sb.append(this.name);
      }
      first = false;
    }
    if (isSetId()) {
      if (!first) sb.append(", ");
      sb.append("id:");
      if (this.id == null) {
        sb.append("null");
      } else {
        sb.append(this.id);
      }
      first = false;
    }
    if (isSetUrl()) {
      if (!first) sb.append(", ");
      sb.append("url:");
      if (this.url == null) {
        sb.append("null");
      } else {
        sb.append(this.url);
      }
      first = false;
    }
    if (isSetBoundingBox()) {
      if (!first) sb.append(", ");
      sb.append("boundingBox:");
      if (this.boundingBox == null) {
        sb.append("null");
      } else {
        sb.append(this.boundingBox);
      }
      first = false;
    }
    if (isSetAttributes()) {
      if (!first) sb.append(", ");
      sb.append("attributes:");
      if (this.attributes == null) {
        sb.append("null");
      } else {
        sb.append(this.attributes);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (boundingBox != null) {
      boundingBox.validate();
    }
    if (attributes != null) {
      attributes.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TwitterPlaceStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TwitterPlaceStandardScheme getScheme() {
      return new TwitterPlaceStandardScheme();
    }
  }

  private static class TwitterPlaceStandardScheme extends org.apache.thrift.scheme.StandardScheme<TwitterPlace> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TwitterPlace struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PLACE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.placeType = iprot.readString();
              struct.setPlaceTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COUNTRY_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.countryCode = iprot.readString();
              struct.setCountryCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COUNTRY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.country = iprot.readString();
              struct.setCountryIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // FULL_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.fullName = iprot.readString();
              struct.setFullNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.id = iprot.readString();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // URL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.url = iprot.readString();
              struct.setUrlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // BOUNDING_BOX
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.boundingBox = new BoundingBox();
              struct.boundingBox.read(iprot);
              struct.setBoundingBoxIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 9: // ATTRIBUTES
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.attributes = new PlaceAttributes();
              struct.attributes.read(iprot);
              struct.setAttributesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TwitterPlace struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.placeType != null) {
        if (struct.isSetPlaceType()) {
          oprot.writeFieldBegin(PLACE_TYPE_FIELD_DESC);
          oprot.writeString(struct.placeType);
          oprot.writeFieldEnd();
        }
      }
      if (struct.countryCode != null) {
        if (struct.isSetCountryCode()) {
          oprot.writeFieldBegin(COUNTRY_CODE_FIELD_DESC);
          oprot.writeString(struct.countryCode);
          oprot.writeFieldEnd();
        }
      }
      if (struct.country != null) {
        if (struct.isSetCountry()) {
          oprot.writeFieldBegin(COUNTRY_FIELD_DESC);
          oprot.writeString(struct.country);
          oprot.writeFieldEnd();
        }
      }
      if (struct.fullName != null) {
        if (struct.isSetFullName()) {
          oprot.writeFieldBegin(FULL_NAME_FIELD_DESC);
          oprot.writeString(struct.fullName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.name != null) {
        if (struct.isSetName()) {
          oprot.writeFieldBegin(NAME_FIELD_DESC);
          oprot.writeString(struct.name);
          oprot.writeFieldEnd();
        }
      }
      if (struct.id != null) {
        if (struct.isSetId()) {
          oprot.writeFieldBegin(ID_FIELD_DESC);
          oprot.writeString(struct.id);
          oprot.writeFieldEnd();
        }
      }
      if (struct.url != null) {
        if (struct.isSetUrl()) {
          oprot.writeFieldBegin(URL_FIELD_DESC);
          oprot.writeString(struct.url);
          oprot.writeFieldEnd();
        }
      }
      if (struct.boundingBox != null) {
        if (struct.isSetBoundingBox()) {
          oprot.writeFieldBegin(BOUNDING_BOX_FIELD_DESC);
          struct.boundingBox.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.attributes != null) {
        if (struct.isSetAttributes()) {
          oprot.writeFieldBegin(ATTRIBUTES_FIELD_DESC);
          struct.attributes.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TwitterPlaceTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TwitterPlaceTupleScheme getScheme() {
      return new TwitterPlaceTupleScheme();
    }
  }

  private static class TwitterPlaceTupleScheme extends org.apache.thrift.scheme.TupleScheme<TwitterPlace> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TwitterPlace struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetPlaceType()) {
        optionals.set(0);
      }
      if (struct.isSetCountryCode()) {
        optionals.set(1);
      }
      if (struct.isSetCountry()) {
        optionals.set(2);
      }
      if (struct.isSetFullName()) {
        optionals.set(3);
      }
      if (struct.isSetName()) {
        optionals.set(4);
      }
      if (struct.isSetId()) {
        optionals.set(5);
      }
      if (struct.isSetUrl()) {
        optionals.set(6);
      }
      if (struct.isSetBoundingBox()) {
        optionals.set(7);
      }
      if (struct.isSetAttributes()) {
        optionals.set(8);
      }
      oprot.writeBitSet(optionals, 9);
      if (struct.isSetPlaceType()) {
        oprot.writeString(struct.placeType);
      }
      if (struct.isSetCountryCode()) {
        oprot.writeString(struct.countryCode);
      }
      if (struct.isSetCountry()) {
        oprot.writeString(struct.country);
      }
      if (struct.isSetFullName()) {
        oprot.writeString(struct.fullName);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetId()) {
        oprot.writeString(struct.id);
      }
      if (struct.isSetUrl()) {
        oprot.writeString(struct.url);
      }
      if (struct.isSetBoundingBox()) {
        struct.boundingBox.write(oprot);
      }
      if (struct.isSetAttributes()) {
        struct.attributes.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TwitterPlace struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(9);
      if (incoming.get(0)) {
        struct.placeType = iprot.readString();
        struct.setPlaceTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.countryCode = iprot.readString();
        struct.setCountryCodeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.country = iprot.readString();
        struct.setCountryIsSet(true);
      }
      if (incoming.get(3)) {
        struct.fullName = iprot.readString();
        struct.setFullNameIsSet(true);
      }
      if (incoming.get(4)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(5)) {
        struct.id = iprot.readString();
        struct.setIdIsSet(true);
      }
      if (incoming.get(6)) {
        struct.url = iprot.readString();
        struct.setUrlIsSet(true);
      }
      if (incoming.get(7)) {
        struct.boundingBox = new BoundingBox();
        struct.boundingBox.read(iprot);
        struct.setBoundingBoxIsSet(true);
      }
      if (incoming.get(8)) {
        struct.attributes = new PlaceAttributes();
        struct.attributes.read(iprot);
        struct.setAttributesIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}


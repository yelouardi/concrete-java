/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.jhu.hlt.concrete;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
/**
 * An (optionally) hierarchical clustering of items appearing across a set of
 * Communications (intra-Communication clusterings are encoded by Entities and
 * Situations).  An item may be a Entity, EntityMention, Situation,
 * SituationMention, or technically anything with a UUID.
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)")
public class Clustering implements org.apache.thrift.TBase<Clustering, Clustering._Fields>, java.io.Serializable, Cloneable, Comparable<Clustering> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Clustering");

  private static final org.apache.thrift.protocol.TField UUID_FIELD_DESC = new org.apache.thrift.protocol.TField("uuid", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField METADATA_FIELD_DESC = new org.apache.thrift.protocol.TField("metadata", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField CLUSTER_MEMBER_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("clusterMemberList", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField CLUSTER_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("clusterList", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField ROOT_CLUSTER_INDEX_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("rootClusterIndexList", org.apache.thrift.protocol.TType.LIST, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ClusteringStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ClusteringTupleSchemeFactory();

  private edu.jhu.hlt.concrete.UUID uuid; // required
  private edu.jhu.hlt.concrete.AnnotationMetadata metadata; // required
  private java.util.List<ClusterMember> clusterMemberList; // optional
  private java.util.List<Cluster> clusterList; // optional
  private java.util.List<java.lang.Integer> rootClusterIndexList; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * UUID for this Clustering object.
     */
    UUID((short)1, "uuid"),
    /**
     * Metadata for this Clustering object.
     */
    METADATA((short)2, "metadata"),
    /**
     * The set of items being clustered.
     */
    CLUSTER_MEMBER_LIST((short)3, "clusterMemberList"),
    /**
     * Clusters of items. If this is a hierarchical clustering, this may contain
     * clusters which are the set of smaller clusters.
     * Clusters may not "overlap", meaning (for all clusters X,Y):
     *   X \cap Y \neq \emptyset \implies X \subset Y \vee Y \subset X
     */
    CLUSTER_LIST((short)4, "clusterList"),
    /**
     * A set of disjoint clusters (indices in 'clusterList') which cover all
     * items in 'clusterMemberList'. This list must be specified for hierarchical
     * clusterings and should not be specified for flat clusterings.
     */
    ROOT_CLUSTER_INDEX_LIST((short)5, "rootClusterIndexList");

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
        case 1: // UUID
          return UUID;
        case 2: // METADATA
          return METADATA;
        case 3: // CLUSTER_MEMBER_LIST
          return CLUSTER_MEMBER_LIST;
        case 4: // CLUSTER_LIST
          return CLUSTER_LIST;
        case 5: // ROOT_CLUSTER_INDEX_LIST
          return ROOT_CLUSTER_INDEX_LIST;
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
  private static final _Fields optionals[] = {_Fields.CLUSTER_MEMBER_LIST,_Fields.CLUSTER_LIST,_Fields.ROOT_CLUSTER_INDEX_LIST};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.UUID, new org.apache.thrift.meta_data.FieldMetaData("uuid", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.jhu.hlt.concrete.UUID.class)));
    tmpMap.put(_Fields.METADATA, new org.apache.thrift.meta_data.FieldMetaData("metadata", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.jhu.hlt.concrete.AnnotationMetadata.class)));
    tmpMap.put(_Fields.CLUSTER_MEMBER_LIST, new org.apache.thrift.meta_data.FieldMetaData("clusterMemberList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ClusterMember.class))));
    tmpMap.put(_Fields.CLUSTER_LIST, new org.apache.thrift.meta_data.FieldMetaData("clusterList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Cluster.class))));
    tmpMap.put(_Fields.ROOT_CLUSTER_INDEX_LIST, new org.apache.thrift.meta_data.FieldMetaData("rootClusterIndexList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Clustering.class, metaDataMap);
  }

  public Clustering() {
  }

  public Clustering(
    edu.jhu.hlt.concrete.UUID uuid,
    edu.jhu.hlt.concrete.AnnotationMetadata metadata)
  {
    this();
    this.uuid = uuid;
    this.metadata = metadata;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Clustering(Clustering other) {
    if (other.isSetUuid()) {
      this.uuid = new edu.jhu.hlt.concrete.UUID(other.uuid);
    }
    if (other.isSetMetadata()) {
      this.metadata = new edu.jhu.hlt.concrete.AnnotationMetadata(other.metadata);
    }
    if (other.isSetClusterMemberList()) {
      java.util.List<ClusterMember> __this__clusterMemberList = new java.util.ArrayList<ClusterMember>(other.clusterMemberList.size());
      for (ClusterMember other_element : other.clusterMemberList) {
        __this__clusterMemberList.add(new ClusterMember(other_element));
      }
      this.clusterMemberList = __this__clusterMemberList;
    }
    if (other.isSetClusterList()) {
      java.util.List<Cluster> __this__clusterList = new java.util.ArrayList<Cluster>(other.clusterList.size());
      for (Cluster other_element : other.clusterList) {
        __this__clusterList.add(new Cluster(other_element));
      }
      this.clusterList = __this__clusterList;
    }
    if (other.isSetRootClusterIndexList()) {
      java.util.List<java.lang.Integer> __this__rootClusterIndexList = new java.util.ArrayList<java.lang.Integer>(other.rootClusterIndexList);
      this.rootClusterIndexList = __this__rootClusterIndexList;
    }
  }

  public Clustering deepCopy() {
    return new Clustering(this);
  }

  @Override
  public void clear() {
    this.uuid = null;
    this.metadata = null;
    this.clusterMemberList = null;
    this.clusterList = null;
    this.rootClusterIndexList = null;
  }

  /**
   * UUID for this Clustering object.
   */
  public edu.jhu.hlt.concrete.UUID getUuid() {
    return this.uuid;
  }

  /**
   * UUID for this Clustering object.
   */
  public Clustering setUuid(edu.jhu.hlt.concrete.UUID uuid) {
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
   * Metadata for this Clustering object.
   */
  public edu.jhu.hlt.concrete.AnnotationMetadata getMetadata() {
    return this.metadata;
  }

  /**
   * Metadata for this Clustering object.
   */
  public Clustering setMetadata(edu.jhu.hlt.concrete.AnnotationMetadata metadata) {
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

  public int getClusterMemberListSize() {
    return (this.clusterMemberList == null) ? 0 : this.clusterMemberList.size();
  }

  public java.util.Iterator<ClusterMember> getClusterMemberListIterator() {
    return (this.clusterMemberList == null) ? null : this.clusterMemberList.iterator();
  }

  public void addToClusterMemberList(ClusterMember elem) {
    if (this.clusterMemberList == null) {
      this.clusterMemberList = new java.util.ArrayList<ClusterMember>();
    }
    this.clusterMemberList.add(elem);
  }

  /**
   * The set of items being clustered.
   */
  public java.util.List<ClusterMember> getClusterMemberList() {
    return this.clusterMemberList;
  }

  /**
   * The set of items being clustered.
   */
  public Clustering setClusterMemberList(java.util.List<ClusterMember> clusterMemberList) {
    this.clusterMemberList = clusterMemberList;
    return this;
  }

  public void unsetClusterMemberList() {
    this.clusterMemberList = null;
  }

  /** Returns true if field clusterMemberList is set (has been assigned a value) and false otherwise */
  public boolean isSetClusterMemberList() {
    return this.clusterMemberList != null;
  }

  public void setClusterMemberListIsSet(boolean value) {
    if (!value) {
      this.clusterMemberList = null;
    }
  }

  public int getClusterListSize() {
    return (this.clusterList == null) ? 0 : this.clusterList.size();
  }

  public java.util.Iterator<Cluster> getClusterListIterator() {
    return (this.clusterList == null) ? null : this.clusterList.iterator();
  }

  public void addToClusterList(Cluster elem) {
    if (this.clusterList == null) {
      this.clusterList = new java.util.ArrayList<Cluster>();
    }
    this.clusterList.add(elem);
  }

  /**
   * Clusters of items. If this is a hierarchical clustering, this may contain
   * clusters which are the set of smaller clusters.
   * Clusters may not "overlap", meaning (for all clusters X,Y):
   *   X \cap Y \neq \emptyset \implies X \subset Y \vee Y \subset X
   */
  public java.util.List<Cluster> getClusterList() {
    return this.clusterList;
  }

  /**
   * Clusters of items. If this is a hierarchical clustering, this may contain
   * clusters which are the set of smaller clusters.
   * Clusters may not "overlap", meaning (for all clusters X,Y):
   *   X \cap Y \neq \emptyset \implies X \subset Y \vee Y \subset X
   */
  public Clustering setClusterList(java.util.List<Cluster> clusterList) {
    this.clusterList = clusterList;
    return this;
  }

  public void unsetClusterList() {
    this.clusterList = null;
  }

  /** Returns true if field clusterList is set (has been assigned a value) and false otherwise */
  public boolean isSetClusterList() {
    return this.clusterList != null;
  }

  public void setClusterListIsSet(boolean value) {
    if (!value) {
      this.clusterList = null;
    }
  }

  public int getRootClusterIndexListSize() {
    return (this.rootClusterIndexList == null) ? 0 : this.rootClusterIndexList.size();
  }

  public java.util.Iterator<java.lang.Integer> getRootClusterIndexListIterator() {
    return (this.rootClusterIndexList == null) ? null : this.rootClusterIndexList.iterator();
  }

  public void addToRootClusterIndexList(int elem) {
    if (this.rootClusterIndexList == null) {
      this.rootClusterIndexList = new java.util.ArrayList<java.lang.Integer>();
    }
    this.rootClusterIndexList.add(elem);
  }

  /**
   * A set of disjoint clusters (indices in 'clusterList') which cover all
   * items in 'clusterMemberList'. This list must be specified for hierarchical
   * clusterings and should not be specified for flat clusterings.
   */
  public java.util.List<java.lang.Integer> getRootClusterIndexList() {
    return this.rootClusterIndexList;
  }

  /**
   * A set of disjoint clusters (indices in 'clusterList') which cover all
   * items in 'clusterMemberList'. This list must be specified for hierarchical
   * clusterings and should not be specified for flat clusterings.
   */
  public Clustering setRootClusterIndexList(java.util.List<java.lang.Integer> rootClusterIndexList) {
    this.rootClusterIndexList = rootClusterIndexList;
    return this;
  }

  public void unsetRootClusterIndexList() {
    this.rootClusterIndexList = null;
  }

  /** Returns true if field rootClusterIndexList is set (has been assigned a value) and false otherwise */
  public boolean isSetRootClusterIndexList() {
    return this.rootClusterIndexList != null;
  }

  public void setRootClusterIndexListIsSet(boolean value) {
    if (!value) {
      this.rootClusterIndexList = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
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

    case CLUSTER_MEMBER_LIST:
      if (value == null) {
        unsetClusterMemberList();
      } else {
        setClusterMemberList((java.util.List<ClusterMember>)value);
      }
      break;

    case CLUSTER_LIST:
      if (value == null) {
        unsetClusterList();
      } else {
        setClusterList((java.util.List<Cluster>)value);
      }
      break;

    case ROOT_CLUSTER_INDEX_LIST:
      if (value == null) {
        unsetRootClusterIndexList();
      } else {
        setRootClusterIndexList((java.util.List<java.lang.Integer>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case UUID:
      return getUuid();

    case METADATA:
      return getMetadata();

    case CLUSTER_MEMBER_LIST:
      return getClusterMemberList();

    case CLUSTER_LIST:
      return getClusterList();

    case ROOT_CLUSTER_INDEX_LIST:
      return getRootClusterIndexList();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case UUID:
      return isSetUuid();
    case METADATA:
      return isSetMetadata();
    case CLUSTER_MEMBER_LIST:
      return isSetClusterMemberList();
    case CLUSTER_LIST:
      return isSetClusterList();
    case ROOT_CLUSTER_INDEX_LIST:
      return isSetRootClusterIndexList();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Clustering)
      return this.equals((Clustering)that);
    return false;
  }

  public boolean equals(Clustering that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

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

    boolean this_present_clusterMemberList = true && this.isSetClusterMemberList();
    boolean that_present_clusterMemberList = true && that.isSetClusterMemberList();
    if (this_present_clusterMemberList || that_present_clusterMemberList) {
      if (!(this_present_clusterMemberList && that_present_clusterMemberList))
        return false;
      if (!this.clusterMemberList.equals(that.clusterMemberList))
        return false;
    }

    boolean this_present_clusterList = true && this.isSetClusterList();
    boolean that_present_clusterList = true && that.isSetClusterList();
    if (this_present_clusterList || that_present_clusterList) {
      if (!(this_present_clusterList && that_present_clusterList))
        return false;
      if (!this.clusterList.equals(that.clusterList))
        return false;
    }

    boolean this_present_rootClusterIndexList = true && this.isSetRootClusterIndexList();
    boolean that_present_rootClusterIndexList = true && that.isSetRootClusterIndexList();
    if (this_present_rootClusterIndexList || that_present_rootClusterIndexList) {
      if (!(this_present_rootClusterIndexList && that_present_rootClusterIndexList))
        return false;
      if (!this.rootClusterIndexList.equals(that.rootClusterIndexList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUuid()) ? 131071 : 524287);
    if (isSetUuid())
      hashCode = hashCode * 8191 + uuid.hashCode();

    hashCode = hashCode * 8191 + ((isSetMetadata()) ? 131071 : 524287);
    if (isSetMetadata())
      hashCode = hashCode * 8191 + metadata.hashCode();

    hashCode = hashCode * 8191 + ((isSetClusterMemberList()) ? 131071 : 524287);
    if (isSetClusterMemberList())
      hashCode = hashCode * 8191 + clusterMemberList.hashCode();

    hashCode = hashCode * 8191 + ((isSetClusterList()) ? 131071 : 524287);
    if (isSetClusterList())
      hashCode = hashCode * 8191 + clusterList.hashCode();

    hashCode = hashCode * 8191 + ((isSetRootClusterIndexList()) ? 131071 : 524287);
    if (isSetRootClusterIndexList())
      hashCode = hashCode * 8191 + rootClusterIndexList.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Clustering other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUuid()).compareTo(other.isSetUuid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUuid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.uuid, other.uuid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMetadata()).compareTo(other.isSetMetadata());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetadata()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.metadata, other.metadata);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetClusterMemberList()).compareTo(other.isSetClusterMemberList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClusterMemberList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.clusterMemberList, other.clusterMemberList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetClusterList()).compareTo(other.isSetClusterList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClusterList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.clusterList, other.clusterList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRootClusterIndexList()).compareTo(other.isSetRootClusterIndexList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRootClusterIndexList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rootClusterIndexList, other.rootClusterIndexList);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Clustering(");
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
    if (isSetClusterMemberList()) {
      if (!first) sb.append(", ");
      sb.append("clusterMemberList:");
      if (this.clusterMemberList == null) {
        sb.append("null");
      } else {
        sb.append(this.clusterMemberList);
      }
      first = false;
    }
    if (isSetClusterList()) {
      if (!first) sb.append(", ");
      sb.append("clusterList:");
      if (this.clusterList == null) {
        sb.append("null");
      } else {
        sb.append(this.clusterList);
      }
      first = false;
    }
    if (isSetRootClusterIndexList()) {
      if (!first) sb.append(", ");
      sb.append("rootClusterIndexList:");
      if (this.rootClusterIndexList == null) {
        sb.append("null");
      } else {
        sb.append(this.rootClusterIndexList);
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
    // check for sub-struct validity
    if (uuid != null) {
      uuid.validate();
    }
    if (metadata != null) {
      metadata.validate();
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

  private static class ClusteringStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ClusteringStandardScheme getScheme() {
      return new ClusteringStandardScheme();
    }
  }

  private static class ClusteringStandardScheme extends org.apache.thrift.scheme.StandardScheme<Clustering> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Clustering struct) throws org.apache.thrift.TException {
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
          case 3: // CLUSTER_MEMBER_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list24 = iprot.readListBegin();
                struct.clusterMemberList = new java.util.ArrayList<ClusterMember>(_list24.size);
                ClusterMember _elem25;
                for (int _i26 = 0; _i26 < _list24.size; ++_i26)
                {
                  _elem25 = new ClusterMember();
                  _elem25.read(iprot);
                  struct.clusterMemberList.add(_elem25);
                }
                iprot.readListEnd();
              }
              struct.setClusterMemberListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CLUSTER_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list27 = iprot.readListBegin();
                struct.clusterList = new java.util.ArrayList<Cluster>(_list27.size);
                Cluster _elem28;
                for (int _i29 = 0; _i29 < _list27.size; ++_i29)
                {
                  _elem28 = new Cluster();
                  _elem28.read(iprot);
                  struct.clusterList.add(_elem28);
                }
                iprot.readListEnd();
              }
              struct.setClusterListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ROOT_CLUSTER_INDEX_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list30 = iprot.readListBegin();
                struct.rootClusterIndexList = new java.util.ArrayList<java.lang.Integer>(_list30.size);
                int _elem31;
                for (int _i32 = 0; _i32 < _list30.size; ++_i32)
                {
                  _elem31 = iprot.readI32();
                  struct.rootClusterIndexList.add(_elem31);
                }
                iprot.readListEnd();
              }
              struct.setRootClusterIndexListIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Clustering struct) throws org.apache.thrift.TException {
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
      if (struct.clusterMemberList != null) {
        if (struct.isSetClusterMemberList()) {
          oprot.writeFieldBegin(CLUSTER_MEMBER_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.clusterMemberList.size()));
            for (ClusterMember _iter33 : struct.clusterMemberList)
            {
              _iter33.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.clusterList != null) {
        if (struct.isSetClusterList()) {
          oprot.writeFieldBegin(CLUSTER_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.clusterList.size()));
            for (Cluster _iter34 : struct.clusterList)
            {
              _iter34.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.rootClusterIndexList != null) {
        if (struct.isSetRootClusterIndexList()) {
          oprot.writeFieldBegin(ROOT_CLUSTER_INDEX_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.rootClusterIndexList.size()));
            for (int _iter35 : struct.rootClusterIndexList)
            {
              oprot.writeI32(_iter35);
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

  private static class ClusteringTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ClusteringTupleScheme getScheme() {
      return new ClusteringTupleScheme();
    }
  }

  private static class ClusteringTupleScheme extends org.apache.thrift.scheme.TupleScheme<Clustering> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Clustering struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.uuid.write(oprot);
      struct.metadata.write(oprot);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetClusterMemberList()) {
        optionals.set(0);
      }
      if (struct.isSetClusterList()) {
        optionals.set(1);
      }
      if (struct.isSetRootClusterIndexList()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetClusterMemberList()) {
        {
          oprot.writeI32(struct.clusterMemberList.size());
          for (ClusterMember _iter36 : struct.clusterMemberList)
          {
            _iter36.write(oprot);
          }
        }
      }
      if (struct.isSetClusterList()) {
        {
          oprot.writeI32(struct.clusterList.size());
          for (Cluster _iter37 : struct.clusterList)
          {
            _iter37.write(oprot);
          }
        }
      }
      if (struct.isSetRootClusterIndexList()) {
        {
          oprot.writeI32(struct.rootClusterIndexList.size());
          for (int _iter38 : struct.rootClusterIndexList)
          {
            oprot.writeI32(_iter38);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Clustering struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.uuid = new edu.jhu.hlt.concrete.UUID();
      struct.uuid.read(iprot);
      struct.setUuidIsSet(true);
      struct.metadata = new edu.jhu.hlt.concrete.AnnotationMetadata();
      struct.metadata.read(iprot);
      struct.setMetadataIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list39 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.clusterMemberList = new java.util.ArrayList<ClusterMember>(_list39.size);
          ClusterMember _elem40;
          for (int _i41 = 0; _i41 < _list39.size; ++_i41)
          {
            _elem40 = new ClusterMember();
            _elem40.read(iprot);
            struct.clusterMemberList.add(_elem40);
          }
        }
        struct.setClusterMemberListIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list42 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.clusterList = new java.util.ArrayList<Cluster>(_list42.size);
          Cluster _elem43;
          for (int _i44 = 0; _i44 < _list42.size; ++_i44)
          {
            _elem43 = new Cluster();
            _elem43.read(iprot);
            struct.clusterList.add(_elem43);
          }
        }
        struct.setClusterListIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list45 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.rootClusterIndexList = new java.util.ArrayList<java.lang.Integer>(_list45.size);
          int _elem46;
          for (int _i47 = 0; _i47 < _list45.size; ++_i47)
          {
            _elem46 = iprot.readI32();
            struct.rootClusterIndexList.add(_elem46);
          }
        }
        struct.setRootClusterIndexListIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}


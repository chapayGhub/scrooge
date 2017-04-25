/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.twitter.scrooge.test.gold.thriftjava;

import org.apache.commons.lang.builder.HashCodeBuilder;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

// No additional import required for struct/union.

public class Request implements TBase<Request, Request._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("Request");

  private static final TField A_LIST_FIELD_DESC = new TField("aList", TType.LIST, (short)1);
  private static final TField A_SET_FIELD_DESC = new TField("aSet", TType.SET, (short)2);
  private static final TField A_MAP_FIELD_DESC = new TField("aMap", TType.MAP, (short)3);
  private static final TField A_REQUEST_FIELD_DESC = new TField("aRequest", TType.STRUCT, (short)4);
  private static final TField SUB_REQUESTS_FIELD_DESC = new TField("subRequests", TType.LIST, (short)5);
  private static final TField HAS_DEFAULT_FIELD_DESC = new TField("hasDefault", TType.STRING, (short)6);


  public List<String> aList;
  public Set<Integer> aSet;
  public Map<Long,Long> aMap;
  public Request aRequest;
  public List<Request> subRequests;
  public String hasDefault;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    A_LIST((short)1, "aList"),
    A_SET((short)2, "aSet"),
    A_MAP((short)3, "aMap"),
    A_REQUEST((short)4, "aRequest"),
    SUB_REQUESTS((short)5, "subRequests"),
    HAS_DEFAULT((short)6, "hasDefault");

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
        case 1: // A_LIST
          return A_LIST;
        case 2: // A_SET
          return A_SET;
        case 3: // A_MAP
          return A_MAP;
        case 4: // A_REQUEST
          return A_REQUEST;
        case 5: // SUB_REQUESTS
          return SUB_REQUESTS;
        case 6: // HAS_DEFAULT
          return HAS_DEFAULT;
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

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.A_LIST, new FieldMetaData("aList", TFieldRequirementType.DEFAULT,
      new ListMetaData(TType.LIST,
                new FieldValueMetaData(TType.STRING))));
    tmpMap.put(_Fields.A_SET, new FieldMetaData("aSet", TFieldRequirementType.DEFAULT,
      new SetMetaData(TType.SET,
                new FieldValueMetaData(TType.I32))));
    tmpMap.put(_Fields.A_MAP, new FieldMetaData("aMap", TFieldRequirementType.DEFAULT,
      new MapMetaData(TType.MAP,
            new FieldValueMetaData(TType.I64),
            new FieldValueMetaData(TType.I64))));
    tmpMap.put(_Fields.A_REQUEST, new FieldMetaData("aRequest", TFieldRequirementType.OPTIONAL,
      new StructMetaData(TType.STRUCT, Request.class)));
    tmpMap.put(_Fields.SUB_REQUESTS, new FieldMetaData("subRequests", TFieldRequirementType.DEFAULT,
      new ListMetaData(TType.LIST,
                new StructMetaData(TType.STRUCT, Request.class))));
    tmpMap.put(_Fields.HAS_DEFAULT, new FieldMetaData("hasDefault", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(Request.class, metaDataMap);
  }


  public Request() {
    this.hasDefault = "the_default";
  }

  public Request(
    List<String> aList,
    Set<Integer> aSet,
    Map<Long,Long> aMap,
    List<Request> subRequests,
    String hasDefault)
  {
    this();
    this.aList = aList;
    this.aSet = aSet;
    this.aMap = aMap;
    this.subRequests = subRequests;
    this.hasDefault = hasDefault;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Request(Request other) {
    if (other.isSetAList()) {
      List<String> __this__aList = new ArrayList<String>();
      for (String other_element : other.aList) {
        __this__aList.add(other_element);
      }
      this.aList = __this__aList;
    }
    if (other.isSetASet()) {
      Set<Integer> __this__aSet = new HashSet<Integer>();
      for (Integer other_element : other.aSet) {
        __this__aSet.add(other_element);
      }
      this.aSet = __this__aSet;
    }
    if (other.isSetAMap()) {
      Map<Long,Long> __this__aMap = new HashMap<Long,Long>();
      for (Map.Entry<Long, Long> other_element : other.aMap.entrySet()) {
        Long other_element_key = other_element.getKey();
        Long other_element_value = other_element.getValue();
        Long __this__aMap_copy_key = other_element_key;
        Long __this__aMap_copy_value = other_element_value;
        __this__aMap.put(__this__aMap_copy_key, __this__aMap_copy_value);
      }
      this.aMap = __this__aMap;
    }
    if (other.isSetARequest()) {
      this.aRequest = new Request(other.aRequest);
    }
    if (other.isSetSubRequests()) {
      List<Request> __this__subRequests = new ArrayList<Request>();
      for (Request other_element : other.subRequests) {
        __this__subRequests.add(new Request(other_element));
      }
      this.subRequests = __this__subRequests;
    }
    if (other.isSetHasDefault()) {
      this.hasDefault = other.hasDefault;
    }
  }

  public Request deepCopy() {
    return new Request(this);
  }

  @java.lang.Override
  public void clear() {
    this.aList = null;
    this.aSet = null;
    this.aMap = null;
    this.aRequest = null;
    this.subRequests = null;
    this.hasDefault = "the_default";
  }

  public int getAListSize() {
    return (this.aList == null) ? 0 : this.aList.size();
  }

  public java.util.Iterator<String> getAListIterator() {
    return (this.aList == null) ? null : this.aList.iterator();
  }

  public void addToAList(String elem) {
    if (this.aList == null) {
      this.aList = new ArrayList<String>();
    }
    this.aList.add(elem);
  }

  public List<String> getAList() {
    return this.aList;
  }

  public Request setAList(List<String> aList) {
    this.aList = aList;

    return this;
  }

  public void unsetAList() {
    this.aList = null;
  }

  /** Returns true if field aList is set (has been asigned a value) and false otherwise */
  public boolean isSetAList() {
    return this.aList != null;
  }

  public void setAListIsSet(boolean value) {
    if (!value) {
      this.aList = null;
    }
  }

  public int getASetSize() {
    return (this.aSet == null) ? 0 : this.aSet.size();
  }

  public java.util.Iterator<Integer> getASetIterator() {
    return (this.aSet == null) ? null : this.aSet.iterator();
  }

  public void addToASet(int elem) {
    if (this.aSet == null) {
      this.aSet = new HashSet<Integer>();
    }
    this.aSet.add(elem);
  }

  public Set<Integer> getASet() {
    return this.aSet;
  }

  public Request setASet(Set<Integer> aSet) {
    this.aSet = aSet;

    return this;
  }

  public void unsetASet() {
    this.aSet = null;
  }

  /** Returns true if field aSet is set (has been asigned a value) and false otherwise */
  public boolean isSetASet() {
    return this.aSet != null;
  }

  public void setASetIsSet(boolean value) {
    if (!value) {
      this.aSet = null;
    }
  }

  public int getAMapSize() {
    return (this.aMap == null) ? 0 : this.aMap.size();
  }

  public void putToAMap(long key, long val) {
    if (this.aMap == null) {
      this.aMap = new HashMap<Long,Long>();
    }
    this.aMap.put(key, val);
  }

  public Map<Long,Long> getAMap() {
    return this.aMap;
  }

  public Request setAMap(Map<Long,Long> aMap) {
    this.aMap = aMap;

    return this;
  }

  public void unsetAMap() {
    this.aMap = null;
  }

  /** Returns true if field aMap is set (has been asigned a value) and false otherwise */
  public boolean isSetAMap() {
    return this.aMap != null;
  }

  public void setAMapIsSet(boolean value) {
    if (!value) {
      this.aMap = null;
    }
  }

  public Request getARequest() {
    return this.aRequest;
  }

  public Request setARequest(Request aRequest) {
    this.aRequest = aRequest;

    return this;
  }

  public void unsetARequest() {
    this.aRequest = null;
  }

  /** Returns true if field aRequest is set (has been asigned a value) and false otherwise */
  public boolean isSetARequest() {
    return this.aRequest != null;
  }

  public void setARequestIsSet(boolean value) {
    if (!value) {
      this.aRequest = null;
    }
  }

  public int getSubRequestsSize() {
    return (this.subRequests == null) ? 0 : this.subRequests.size();
  }

  public java.util.Iterator<Request> getSubRequestsIterator() {
    return (this.subRequests == null) ? null : this.subRequests.iterator();
  }

  public void addToSubRequests(Request elem) {
    if (this.subRequests == null) {
      this.subRequests = new ArrayList<Request>();
    }
    this.subRequests.add(elem);
  }

  public List<Request> getSubRequests() {
    return this.subRequests;
  }

  public Request setSubRequests(List<Request> subRequests) {
    this.subRequests = subRequests;

    return this;
  }

  public void unsetSubRequests() {
    this.subRequests = null;
  }

  /** Returns true if field subRequests is set (has been asigned a value) and false otherwise */
  public boolean isSetSubRequests() {
    return this.subRequests != null;
  }

  public void setSubRequestsIsSet(boolean value) {
    if (!value) {
      this.subRequests = null;
    }
  }

  public String getHasDefault() {
    return this.hasDefault;
  }

  public Request setHasDefault(String hasDefault) {
    this.hasDefault = hasDefault;

    return this;
  }

  public void unsetHasDefault() {
    this.hasDefault = null;
  }

  /** Returns true if field hasDefault is set (has been asigned a value) and false otherwise */
  public boolean isSetHasDefault() {
    return this.hasDefault != null;
  }

  public void setHasDefaultIsSet(boolean value) {
    if (!value) {
      this.hasDefault = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case A_LIST:
      if (value == null) {
        unsetAList();
      } else {
        setAList((List<String>)value);
      }
      break;
    case A_SET:
      if (value == null) {
        unsetASet();
      } else {
        setASet((Set<Integer>)value);
      }
      break;
    case A_MAP:
      if (value == null) {
        unsetAMap();
      } else {
        setAMap((Map<Long,Long>)value);
      }
      break;
    case A_REQUEST:
      if (value == null) {
        unsetARequest();
      } else {
        setARequest((Request)value);
      }
      break;
    case SUB_REQUESTS:
      if (value == null) {
        unsetSubRequests();
      } else {
        setSubRequests((List<Request>)value);
      }
      break;
    case HAS_DEFAULT:
      if (value == null) {
        unsetHasDefault();
      } else {
        setHasDefault((String)value);
      }
      break;
    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case A_LIST:
      return getAList();
    case A_SET:
      return getASet();
    case A_MAP:
      return getAMap();
    case A_REQUEST:
      return getARequest();
    case SUB_REQUESTS:
      return getSubRequests();
    case HAS_DEFAULT:
      return getHasDefault();
    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case A_LIST:
      return isSetAList();
    case A_SET:
      return isSetASet();
    case A_MAP:
      return isSetAMap();
    case A_REQUEST:
      return isSetARequest();
    case SUB_REQUESTS:
      return isSetSubRequests();
    case HAS_DEFAULT:
      return isSetHasDefault();
    }
    throw new IllegalStateException();
  }

  @java.lang.Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Request)
      return this.equals((Request)that);
    return false;
  }

  public boolean equals(Request that) {
    if (that == null)
      return false;
    boolean this_present_aList = true && this.isSetAList();
    boolean that_present_aList = true && that.isSetAList();
    if (this_present_aList || that_present_aList) {
      if (!(this_present_aList && that_present_aList))
        return false;
      if (!this.aList.equals(that.aList))
        return false;
    }
    boolean this_present_aSet = true && this.isSetASet();
    boolean that_present_aSet = true && that.isSetASet();
    if (this_present_aSet || that_present_aSet) {
      if (!(this_present_aSet && that_present_aSet))
        return false;
      if (!this.aSet.equals(that.aSet))
        return false;
    }
    boolean this_present_aMap = true && this.isSetAMap();
    boolean that_present_aMap = true && that.isSetAMap();
    if (this_present_aMap || that_present_aMap) {
      if (!(this_present_aMap && that_present_aMap))
        return false;
      if (!this.aMap.equals(that.aMap))
        return false;
    }
    boolean this_present_aRequest = true && this.isSetARequest();
    boolean that_present_aRequest = true && that.isSetARequest();
    if (this_present_aRequest || that_present_aRequest) {
      if (!(this_present_aRequest && that_present_aRequest))
        return false;
      if (!this.aRequest.equals(that.aRequest))
        return false;
    }
    boolean this_present_subRequests = true && this.isSetSubRequests();
    boolean that_present_subRequests = true && that.isSetSubRequests();
    if (this_present_subRequests || that_present_subRequests) {
      if (!(this_present_subRequests && that_present_subRequests))
        return false;
      if (!this.subRequests.equals(that.subRequests))
        return false;
    }
    boolean this_present_hasDefault = true && this.isSetHasDefault();
    boolean that_present_hasDefault = true && that.isSetHasDefault();
    if (this_present_hasDefault || that_present_hasDefault) {
      if (!(this_present_hasDefault && that_present_hasDefault))
        return false;
      if (!this.hasDefault.equals(that.hasDefault))
        return false;
    }

    return true;
  }

  @java.lang.Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();
    boolean present_aList = true && (isSetAList());
    builder.append(present_aList);
    if (present_aList)
      builder.append(aList);
    boolean present_aSet = true && (isSetASet());
    builder.append(present_aSet);
    if (present_aSet)
      builder.append(aSet);
    boolean present_aMap = true && (isSetAMap());
    builder.append(present_aMap);
    if (present_aMap)
      builder.append(aMap);
    boolean present_aRequest = true && (isSetARequest());
    builder.append(present_aRequest);
    if (present_aRequest)
      builder.append(aRequest);
    boolean present_subRequests = true && (isSetSubRequests());
    builder.append(present_subRequests);
    if (present_subRequests)
      builder.append(subRequests);
    boolean present_hasDefault = true && (isSetHasDefault());
    builder.append(present_hasDefault);
    if (present_hasDefault)
      builder.append(hasDefault);
    return builder.toHashCode();
  }

  public int compareTo(Request other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Request typedOther = (Request)other;

    lastComparison = Boolean.valueOf(isSetAList()).compareTo(typedOther.isSetAList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAList()) {
      lastComparison = TBaseHelper.compareTo(this.aList, typedOther.aList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetASet()).compareTo(typedOther.isSetASet());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetASet()) {
      lastComparison = TBaseHelper.compareTo(this.aSet, typedOther.aSet);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAMap()).compareTo(typedOther.isSetAMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAMap()) {
      lastComparison = TBaseHelper.compareTo(this.aMap, typedOther.aMap);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetARequest()).compareTo(typedOther.isSetARequest());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetARequest()) {
      lastComparison = TBaseHelper.compareTo(this.aRequest, typedOther.aRequest);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSubRequests()).compareTo(typedOther.isSetSubRequests());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSubRequests()) {
      lastComparison = TBaseHelper.compareTo(this.subRequests, typedOther.subRequests);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHasDefault()).compareTo(typedOther.isSetHasDefault());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHasDefault()) {
      lastComparison = TBaseHelper.compareTo(this.hasDefault, typedOther.hasDefault);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) {
        break;
      }
      switch (field.id) {
        case 1: // A_LIST
          if (field.type == TType.LIST) {
            {
            TList _list0 = iprot.readListBegin();
            this.aList = new ArrayList<String>(_list0.size);
            for (int _i1 = 0; _i1 < _list0.size; ++_i1)
            {
              String _elem2;
              _elem2 = iprot.readString();
              this.aList.add(_elem2);
            }
            iprot.readListEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // A_SET
          if (field.type == TType.SET) {
            {
            TSet _set3 = iprot.readSetBegin();
            this.aSet = new HashSet<Integer>(2*_set3.size);
            for (int _i4 = 0; _i4 < _set3.size; ++_i4)
            {
              int _elem5;
              _elem5 = iprot.readI32();
              this.aSet.add(_elem5);
            }
            iprot.readSetEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // A_MAP
          if (field.type == TType.MAP) {
            {
            TMap _map6 = iprot.readMapBegin();
            this.aMap = new HashMap<Long,Long>(2*_map6.size);
            for (int _i7 = 0; _i7 < _map6.size; ++_i7)
            {
              long _key8;
              long _val9;
              _key8 = iprot.readI64();
              _val9 = iprot.readI64();
              this.aMap.put(_key8, _val9);
            }
            iprot.readMapEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // A_REQUEST
          if (field.type == TType.STRUCT) {
            this.aRequest = new Request();
            this.aRequest.read(iprot);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // SUB_REQUESTS
          if (field.type == TType.LIST) {
            {
            TList _list10 = iprot.readListBegin();
            this.subRequests = new ArrayList<Request>(_list10.size);
            for (int _i11 = 0; _i11 < _list10.size; ++_i11)
            {
              Request _elem12;
              _elem12 = new Request();
              _elem12.read(iprot);
              this.subRequests.add(_elem12);
            }
            iprot.readListEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // HAS_DEFAULT
          if (field.type == TType.STRING) {
            this.hasDefault = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.aList != null) {
      oprot.writeFieldBegin(A_LIST_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRING, this.aList.size()));
        for (String _iter13 : this.aList)
        {
          oprot.writeString(_iter13);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.aSet != null) {
      oprot.writeFieldBegin(A_SET_FIELD_DESC);
      {
        oprot.writeSetBegin(new TSet(TType.I32, this.aSet.size()));
        for (int _iter14 : this.aSet)
        {
          oprot.writeI32(_iter14);
        }
        oprot.writeSetEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.aMap != null) {
      oprot.writeFieldBegin(A_MAP_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.I64, TType.I64, this.aMap.size()));
        for (Map.Entry<Long, Long> _iter15 : this.aMap.entrySet())
        {
          oprot.writeI64(_iter15.getKey());
          oprot.writeI64(_iter15.getValue());
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.aRequest != null) {
      if (isSetARequest()) {
        oprot.writeFieldBegin(A_REQUEST_FIELD_DESC);
        this.aRequest.write(oprot);
        oprot.writeFieldEnd();
      }
    }
    if (this.subRequests != null) {
      oprot.writeFieldBegin(SUB_REQUESTS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.subRequests.size()));
        for (Request _iter16 : this.subRequests)
        {
          _iter16.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.hasDefault != null) {
      oprot.writeFieldBegin(HAS_DEFAULT_FIELD_DESC);
      oprot.writeString(this.hasDefault);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @java.lang.Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Request(");
    boolean first = true;
    sb.append("aList:");
    if (this.aList == null) {
      sb.append("null");
    } else {
      sb.append(this.aList);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("aSet:");
    if (this.aSet == null) {
      sb.append("null");
    } else {
      sb.append(this.aSet);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("aMap:");
    if (this.aMap == null) {
      sb.append("null");
    } else {
      sb.append(this.aMap);
    }
    first = false;
    if (isSetARequest()) {
      if (!first) sb.append(", ");
      sb.append("aRequest:");
      if (this.aRequest == null) {
        sb.append("null");
      } else {
        sb.append(this.aRequest);
      }
      first = false;
      }
    if (!first) sb.append(", ");
    sb.append("subRequests:");
    if (this.subRequests == null) {
      sb.append("null");
    } else {
      sb.append(this.subRequests);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("hasDefault:");
    if (this.hasDefault == null) {
      sb.append("null");
    } else {
      sb.append(this.hasDefault);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }
}


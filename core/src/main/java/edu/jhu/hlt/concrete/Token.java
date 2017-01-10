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
 * A single token (typically a word) in a communication. The exact
 * definition of what counts as a token is left up to the tools that
 * generate token sequences.
 * 
 * Usually, each token will include at least a text string.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-01-10")
public class Token implements org.apache.thrift.TBase<Token, Token._Fields>, java.io.Serializable, Cloneable, Comparable<Token> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Token");

  private static final org.apache.thrift.protocol.TField TOKEN_INDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("tokenIndex", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TEXT_FIELD_DESC = new org.apache.thrift.protocol.TField("text", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TEXT_SPAN_FIELD_DESC = new org.apache.thrift.protocol.TField("textSpan", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField RAW_TEXT_SPAN_FIELD_DESC = new org.apache.thrift.protocol.TField("rawTextSpan", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField AUDIO_SPAN_FIELD_DESC = new org.apache.thrift.protocol.TField("audioSpan", org.apache.thrift.protocol.TType.STRUCT, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TokenStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TokenTupleSchemeFactory());
  }

  private int tokenIndex; // required
  private String text; // optional
  private edu.jhu.hlt.concrete.TextSpan textSpan; // optional
  private edu.jhu.hlt.concrete.TextSpan rawTextSpan; // optional
  private edu.jhu.hlt.concrete.AudioSpan audioSpan; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * A 0-based tokenization-relative identifier for this token that
     * represents the order that this token appears in the
     * sentence. Together with the UUID for a Tokenization, this can be
     * used to define pointers to specific tokens. If a Tokenization
     * object contains multiple Token objects with the same id (e.g., in
     * different n-best lists), then all of their other fields *must* be
     * identical as well.
     */
    TOKEN_INDEX((short)1, "tokenIndex"),
    /**
     * The text associated with this token.
     * Note - we may have a destructive tokenizer (e.g., Stanford rewriting)
     * and as a result, we want to maintain this field.
     */
    TEXT((short)2, "text"),
    /**
     * Location of this token in this perspective's text (.text field).
     * In cases where this token does not correspond directly with any
     * text span in the text (such as word insertion during MT),
     * this field may be given a value indicating "approximately" where
     * the token comes from. A span covering the entire sentence may be
     * used if no more precise value seems appropriate.
     * 
     * NOTE: This span represents a best guess, or 'provenance':
     * it cannot be guaranteed that this text span matches the _exact_
     * text of the document, but is the annotation's best
     * effort at such a representation.
     */
    TEXT_SPAN((short)3, "textSpan"),
    /**
     * Location of this token in the original, raw text (.originalText
     * field).  In cases where this token does not correspond directly
     * with any text span in the original text (such as word insertion
     * during MT), this field may be given a value indicating
     * "approximately" where the token comes from. A span covering the
     * entire sentence may be used if no more precise value seems
     * appropriate.
     * 
     * NOTE: This span represents a best guess, or 'provenance':
     * it cannot be guaranteed that this text span matches the _exact_
     * text of the original raw document, but is the annotation's best
     * effort at such a representation.
     */
    RAW_TEXT_SPAN((short)4, "rawTextSpan"),
    /**
     * Location of this token in the original audio.
     * 
     * NOTE: This span represents a best guess, or 'provenance':
     * it cannot be guaranteed that this text span matches the _exact_
     * text of the original document, but is the annotation's best
     * effort at such a representation.
     */
    AUDIO_SPAN((short)5, "audioSpan");

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
        case 2: // TEXT
          return TEXT;
        case 3: // TEXT_SPAN
          return TEXT_SPAN;
        case 4: // RAW_TEXT_SPAN
          return RAW_TEXT_SPAN;
        case 5: // AUDIO_SPAN
          return AUDIO_SPAN;
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
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TEXT,_Fields.TEXT_SPAN,_Fields.RAW_TEXT_SPAN,_Fields.AUDIO_SPAN};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOKEN_INDEX, new org.apache.thrift.meta_data.FieldMetaData("tokenIndex", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TEXT, new org.apache.thrift.meta_data.FieldMetaData("text", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TEXT_SPAN, new org.apache.thrift.meta_data.FieldMetaData("textSpan", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.jhu.hlt.concrete.TextSpan.class)));
    tmpMap.put(_Fields.RAW_TEXT_SPAN, new org.apache.thrift.meta_data.FieldMetaData("rawTextSpan", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.jhu.hlt.concrete.TextSpan.class)));
    tmpMap.put(_Fields.AUDIO_SPAN, new org.apache.thrift.meta_data.FieldMetaData("audioSpan", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, edu.jhu.hlt.concrete.AudioSpan.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Token.class, metaDataMap);
  }

  public Token() {
  }

  public Token(
    int tokenIndex)
  {
    this();
    this.tokenIndex = tokenIndex;
    setTokenIndexIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Token(Token other) {
    __isset_bitfield = other.__isset_bitfield;
    this.tokenIndex = other.tokenIndex;
    if (other.isSetText()) {
      this.text = other.text;
    }
    if (other.isSetTextSpan()) {
      this.textSpan = new edu.jhu.hlt.concrete.TextSpan(other.textSpan);
    }
    if (other.isSetRawTextSpan()) {
      this.rawTextSpan = new edu.jhu.hlt.concrete.TextSpan(other.rawTextSpan);
    }
    if (other.isSetAudioSpan()) {
      this.audioSpan = new edu.jhu.hlt.concrete.AudioSpan(other.audioSpan);
    }
  }

  public Token deepCopy() {
    return new Token(this);
  }

  @Override
  public void clear() {
    setTokenIndexIsSet(false);
    this.tokenIndex = 0;
    this.text = null;
    this.textSpan = null;
    this.rawTextSpan = null;
    this.audioSpan = null;
  }

  /**
   * A 0-based tokenization-relative identifier for this token that
   * represents the order that this token appears in the
   * sentence. Together with the UUID for a Tokenization, this can be
   * used to define pointers to specific tokens. If a Tokenization
   * object contains multiple Token objects with the same id (e.g., in
   * different n-best lists), then all of their other fields *must* be
   * identical as well.
   */
  public int getTokenIndex() {
    return this.tokenIndex;
  }

  /**
   * A 0-based tokenization-relative identifier for this token that
   * represents the order that this token appears in the
   * sentence. Together with the UUID for a Tokenization, this can be
   * used to define pointers to specific tokens. If a Tokenization
   * object contains multiple Token objects with the same id (e.g., in
   * different n-best lists), then all of their other fields *must* be
   * identical as well.
   */
  public Token setTokenIndex(int tokenIndex) {
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
   * The text associated with this token.
   * Note - we may have a destructive tokenizer (e.g., Stanford rewriting)
   * and as a result, we want to maintain this field.
   */
  public String getText() {
    return this.text;
  }

  /**
   * The text associated with this token.
   * Note - we may have a destructive tokenizer (e.g., Stanford rewriting)
   * and as a result, we want to maintain this field.
   */
  public Token setText(String text) {
    this.text = text;
    return this;
  }

  public void unsetText() {
    this.text = null;
  }

  /** Returns true if field text is set (has been assigned a value) and false otherwise */
  public boolean isSetText() {
    return this.text != null;
  }

  public void setTextIsSet(boolean value) {
    if (!value) {
      this.text = null;
    }
  }

  /**
   * Location of this token in this perspective's text (.text field).
   * In cases where this token does not correspond directly with any
   * text span in the text (such as word insertion during MT),
   * this field may be given a value indicating "approximately" where
   * the token comes from. A span covering the entire sentence may be
   * used if no more precise value seems appropriate.
   * 
   * NOTE: This span represents a best guess, or 'provenance':
   * it cannot be guaranteed that this text span matches the _exact_
   * text of the document, but is the annotation's best
   * effort at such a representation.
   */
  public edu.jhu.hlt.concrete.TextSpan getTextSpan() {
    return this.textSpan;
  }

  /**
   * Location of this token in this perspective's text (.text field).
   * In cases where this token does not correspond directly with any
   * text span in the text (such as word insertion during MT),
   * this field may be given a value indicating "approximately" where
   * the token comes from. A span covering the entire sentence may be
   * used if no more precise value seems appropriate.
   * 
   * NOTE: This span represents a best guess, or 'provenance':
   * it cannot be guaranteed that this text span matches the _exact_
   * text of the document, but is the annotation's best
   * effort at such a representation.
   */
  public Token setTextSpan(edu.jhu.hlt.concrete.TextSpan textSpan) {
    this.textSpan = textSpan;
    return this;
  }

  public void unsetTextSpan() {
    this.textSpan = null;
  }

  /** Returns true if field textSpan is set (has been assigned a value) and false otherwise */
  public boolean isSetTextSpan() {
    return this.textSpan != null;
  }

  public void setTextSpanIsSet(boolean value) {
    if (!value) {
      this.textSpan = null;
    }
  }

  /**
   * Location of this token in the original, raw text (.originalText
   * field).  In cases where this token does not correspond directly
   * with any text span in the original text (such as word insertion
   * during MT), this field may be given a value indicating
   * "approximately" where the token comes from. A span covering the
   * entire sentence may be used if no more precise value seems
   * appropriate.
   * 
   * NOTE: This span represents a best guess, or 'provenance':
   * it cannot be guaranteed that this text span matches the _exact_
   * text of the original raw document, but is the annotation's best
   * effort at such a representation.
   */
  public edu.jhu.hlt.concrete.TextSpan getRawTextSpan() {
    return this.rawTextSpan;
  }

  /**
   * Location of this token in the original, raw text (.originalText
   * field).  In cases where this token does not correspond directly
   * with any text span in the original text (such as word insertion
   * during MT), this field may be given a value indicating
   * "approximately" where the token comes from. A span covering the
   * entire sentence may be used if no more precise value seems
   * appropriate.
   * 
   * NOTE: This span represents a best guess, or 'provenance':
   * it cannot be guaranteed that this text span matches the _exact_
   * text of the original raw document, but is the annotation's best
   * effort at such a representation.
   */
  public Token setRawTextSpan(edu.jhu.hlt.concrete.TextSpan rawTextSpan) {
    this.rawTextSpan = rawTextSpan;
    return this;
  }

  public void unsetRawTextSpan() {
    this.rawTextSpan = null;
  }

  /** Returns true if field rawTextSpan is set (has been assigned a value) and false otherwise */
  public boolean isSetRawTextSpan() {
    return this.rawTextSpan != null;
  }

  public void setRawTextSpanIsSet(boolean value) {
    if (!value) {
      this.rawTextSpan = null;
    }
  }

  /**
   * Location of this token in the original audio.
   * 
   * NOTE: This span represents a best guess, or 'provenance':
   * it cannot be guaranteed that this text span matches the _exact_
   * text of the original document, but is the annotation's best
   * effort at such a representation.
   */
  public edu.jhu.hlt.concrete.AudioSpan getAudioSpan() {
    return this.audioSpan;
  }

  /**
   * Location of this token in the original audio.
   * 
   * NOTE: This span represents a best guess, or 'provenance':
   * it cannot be guaranteed that this text span matches the _exact_
   * text of the original document, but is the annotation's best
   * effort at such a representation.
   */
  public Token setAudioSpan(edu.jhu.hlt.concrete.AudioSpan audioSpan) {
    this.audioSpan = audioSpan;
    return this;
  }

  public void unsetAudioSpan() {
    this.audioSpan = null;
  }

  /** Returns true if field audioSpan is set (has been assigned a value) and false otherwise */
  public boolean isSetAudioSpan() {
    return this.audioSpan != null;
  }

  public void setAudioSpanIsSet(boolean value) {
    if (!value) {
      this.audioSpan = null;
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

    case TEXT:
      if (value == null) {
        unsetText();
      } else {
        setText((String)value);
      }
      break;

    case TEXT_SPAN:
      if (value == null) {
        unsetTextSpan();
      } else {
        setTextSpan((edu.jhu.hlt.concrete.TextSpan)value);
      }
      break;

    case RAW_TEXT_SPAN:
      if (value == null) {
        unsetRawTextSpan();
      } else {
        setRawTextSpan((edu.jhu.hlt.concrete.TextSpan)value);
      }
      break;

    case AUDIO_SPAN:
      if (value == null) {
        unsetAudioSpan();
      } else {
        setAudioSpan((edu.jhu.hlt.concrete.AudioSpan)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOKEN_INDEX:
      return getTokenIndex();

    case TEXT:
      return getText();

    case TEXT_SPAN:
      return getTextSpan();

    case RAW_TEXT_SPAN:
      return getRawTextSpan();

    case AUDIO_SPAN:
      return getAudioSpan();

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
    case TEXT:
      return isSetText();
    case TEXT_SPAN:
      return isSetTextSpan();
    case RAW_TEXT_SPAN:
      return isSetRawTextSpan();
    case AUDIO_SPAN:
      return isSetAudioSpan();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Token)
      return this.equals((Token)that);
    return false;
  }

  public boolean equals(Token that) {
    if (that == null)
      return false;

    boolean this_present_tokenIndex = true;
    boolean that_present_tokenIndex = true;
    if (this_present_tokenIndex || that_present_tokenIndex) {
      if (!(this_present_tokenIndex && that_present_tokenIndex))
        return false;
      if (this.tokenIndex != that.tokenIndex)
        return false;
    }

    boolean this_present_text = true && this.isSetText();
    boolean that_present_text = true && that.isSetText();
    if (this_present_text || that_present_text) {
      if (!(this_present_text && that_present_text))
        return false;
      if (!this.text.equals(that.text))
        return false;
    }

    boolean this_present_textSpan = true && this.isSetTextSpan();
    boolean that_present_textSpan = true && that.isSetTextSpan();
    if (this_present_textSpan || that_present_textSpan) {
      if (!(this_present_textSpan && that_present_textSpan))
        return false;
      if (!this.textSpan.equals(that.textSpan))
        return false;
    }

    boolean this_present_rawTextSpan = true && this.isSetRawTextSpan();
    boolean that_present_rawTextSpan = true && that.isSetRawTextSpan();
    if (this_present_rawTextSpan || that_present_rawTextSpan) {
      if (!(this_present_rawTextSpan && that_present_rawTextSpan))
        return false;
      if (!this.rawTextSpan.equals(that.rawTextSpan))
        return false;
    }

    boolean this_present_audioSpan = true && this.isSetAudioSpan();
    boolean that_present_audioSpan = true && that.isSetAudioSpan();
    if (this_present_audioSpan || that_present_audioSpan) {
      if (!(this_present_audioSpan && that_present_audioSpan))
        return false;
      if (!this.audioSpan.equals(that.audioSpan))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_tokenIndex = true;
    list.add(present_tokenIndex);
    if (present_tokenIndex)
      list.add(tokenIndex);

    boolean present_text = true && (isSetText());
    list.add(present_text);
    if (present_text)
      list.add(text);

    boolean present_textSpan = true && (isSetTextSpan());
    list.add(present_textSpan);
    if (present_textSpan)
      list.add(textSpan);

    boolean present_rawTextSpan = true && (isSetRawTextSpan());
    list.add(present_rawTextSpan);
    if (present_rawTextSpan)
      list.add(rawTextSpan);

    boolean present_audioSpan = true && (isSetAudioSpan());
    list.add(present_audioSpan);
    if (present_audioSpan)
      list.add(audioSpan);

    return list.hashCode();
  }

  @Override
  public int compareTo(Token other) {
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
    lastComparison = Boolean.valueOf(isSetText()).compareTo(other.isSetText());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetText()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.text, other.text);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTextSpan()).compareTo(other.isSetTextSpan());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTextSpan()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.textSpan, other.textSpan);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRawTextSpan()).compareTo(other.isSetRawTextSpan());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRawTextSpan()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rawTextSpan, other.rawTextSpan);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAudioSpan()).compareTo(other.isSetAudioSpan());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAudioSpan()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.audioSpan, other.audioSpan);
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
    StringBuilder sb = new StringBuilder("Token(");
    boolean first = true;

    sb.append("tokenIndex:");
    sb.append(this.tokenIndex);
    first = false;
    if (isSetText()) {
      if (!first) sb.append(", ");
      sb.append("text:");
      if (this.text == null) {
        sb.append("null");
      } else {
        sb.append(this.text);
      }
      first = false;
    }
    if (isSetTextSpan()) {
      if (!first) sb.append(", ");
      sb.append("textSpan:");
      if (this.textSpan == null) {
        sb.append("null");
      } else {
        sb.append(this.textSpan);
      }
      first = false;
    }
    if (isSetRawTextSpan()) {
      if (!first) sb.append(", ");
      sb.append("rawTextSpan:");
      if (this.rawTextSpan == null) {
        sb.append("null");
      } else {
        sb.append(this.rawTextSpan);
      }
      first = false;
    }
    if (isSetAudioSpan()) {
      if (!first) sb.append(", ");
      sb.append("audioSpan:");
      if (this.audioSpan == null) {
        sb.append("null");
      } else {
        sb.append(this.audioSpan);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'tokenIndex' because it's a primitive and you chose the non-beans generator.
    // check for sub-struct validity
    if (textSpan != null) {
      textSpan.validate();
    }
    if (rawTextSpan != null) {
      rawTextSpan.validate();
    }
    if (audioSpan != null) {
      audioSpan.validate();
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

  private static class TokenStandardSchemeFactory implements SchemeFactory {
    public TokenStandardScheme getScheme() {
      return new TokenStandardScheme();
    }
  }

  private static class TokenStandardScheme extends StandardScheme<Token> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Token struct) throws org.apache.thrift.TException {
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
          case 2: // TEXT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.text = iprot.readString();
              struct.setTextIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TEXT_SPAN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.textSpan = new edu.jhu.hlt.concrete.TextSpan();
              struct.textSpan.read(iprot);
              struct.setTextSpanIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // RAW_TEXT_SPAN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.rawTextSpan = new edu.jhu.hlt.concrete.TextSpan();
              struct.rawTextSpan.read(iprot);
              struct.setRawTextSpanIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // AUDIO_SPAN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.audioSpan = new edu.jhu.hlt.concrete.AudioSpan();
              struct.audioSpan.read(iprot);
              struct.setAudioSpanIsSet(true);
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
      if (!struct.isSetTokenIndex()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'tokenIndex' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Token struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TOKEN_INDEX_FIELD_DESC);
      oprot.writeI32(struct.tokenIndex);
      oprot.writeFieldEnd();
      if (struct.text != null) {
        if (struct.isSetText()) {
          oprot.writeFieldBegin(TEXT_FIELD_DESC);
          oprot.writeString(struct.text);
          oprot.writeFieldEnd();
        }
      }
      if (struct.textSpan != null) {
        if (struct.isSetTextSpan()) {
          oprot.writeFieldBegin(TEXT_SPAN_FIELD_DESC);
          struct.textSpan.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.rawTextSpan != null) {
        if (struct.isSetRawTextSpan()) {
          oprot.writeFieldBegin(RAW_TEXT_SPAN_FIELD_DESC);
          struct.rawTextSpan.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.audioSpan != null) {
        if (struct.isSetAudioSpan()) {
          oprot.writeFieldBegin(AUDIO_SPAN_FIELD_DESC);
          struct.audioSpan.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TokenTupleSchemeFactory implements SchemeFactory {
    public TokenTupleScheme getScheme() {
      return new TokenTupleScheme();
    }
  }

  private static class TokenTupleScheme extends TupleScheme<Token> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Token struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.tokenIndex);
      BitSet optionals = new BitSet();
      if (struct.isSetText()) {
        optionals.set(0);
      }
      if (struct.isSetTextSpan()) {
        optionals.set(1);
      }
      if (struct.isSetRawTextSpan()) {
        optionals.set(2);
      }
      if (struct.isSetAudioSpan()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetText()) {
        oprot.writeString(struct.text);
      }
      if (struct.isSetTextSpan()) {
        struct.textSpan.write(oprot);
      }
      if (struct.isSetRawTextSpan()) {
        struct.rawTextSpan.write(oprot);
      }
      if (struct.isSetAudioSpan()) {
        struct.audioSpan.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Token struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.tokenIndex = iprot.readI32();
      struct.setTokenIndexIsSet(true);
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.text = iprot.readString();
        struct.setTextIsSet(true);
      }
      if (incoming.get(1)) {
        struct.textSpan = new edu.jhu.hlt.concrete.TextSpan();
        struct.textSpan.read(iprot);
        struct.setTextSpanIsSet(true);
      }
      if (incoming.get(2)) {
        struct.rawTextSpan = new edu.jhu.hlt.concrete.TextSpan();
        struct.rawTextSpan.read(iprot);
        struct.setRawTextSpanIsSet(true);
      }
      if (incoming.get(3)) {
        struct.audioSpan = new edu.jhu.hlt.concrete.AudioSpan();
        struct.audioSpan.read(iprot);
        struct.setAudioSpanIsSet(true);
      }
    }
  }

}


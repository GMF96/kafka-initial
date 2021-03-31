/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.example;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class User extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7329678538305737121L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"User\",\"namespace\":\"com.example\",\"fields\":[{\"name\":\"first_name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"First Name of User\"},{\"name\":\"last_name\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Last Name of User\",\"default\":null},{\"name\":\"zipcode\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Zipcode of User\"}],\"version\":\"1\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<User> ENCODER =
      new BinaryMessageEncoder<User>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<User> DECODER =
      new BinaryMessageDecoder<User>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<User> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<User> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<User>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this User to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a User from a ByteBuffer. */
  public static User fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** First Name of User */
   private java.lang.String first_name;
  /** Last Name of User */
   private java.lang.String last_name;
  /** Zipcode of User */
   private java.lang.String zipcode;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public User() {}

  /**
   * All-args constructor.
   * @param first_name First Name of User
   * @param last_name Last Name of User
   * @param zipcode Zipcode of User
   */
  public User(java.lang.String first_name, java.lang.String last_name, java.lang.String zipcode) {
    this.first_name = first_name;
    this.last_name = last_name;
    this.zipcode = zipcode;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return first_name;
    case 1: return last_name;
    case 2: return zipcode;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: first_name = (java.lang.String)value$; break;
    case 1: last_name = (java.lang.String)value$; break;
    case 2: zipcode = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'first_name' field.
   * @return First Name of User
   */
  public java.lang.String getFirstName() {
    return first_name;
  }


  /**
   * Gets the value of the 'last_name' field.
   * @return Last Name of User
   */
  public java.lang.String getLastName() {
    return last_name;
  }


  /**
   * Gets the value of the 'zipcode' field.
   * @return Zipcode of User
   */
  public java.lang.String getZipcode() {
    return zipcode;
  }


  /**
   * Creates a new User RecordBuilder.
   * @return A new User RecordBuilder
   */
  public static com.example.User.Builder newBuilder() {
    return new com.example.User.Builder();
  }

  /**
   * Creates a new User RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new User RecordBuilder
   */
  public static com.example.User.Builder newBuilder(com.example.User.Builder other) {
    return new com.example.User.Builder(other);
  }

  /**
   * Creates a new User RecordBuilder by copying an existing User instance.
   * @param other The existing instance to copy.
   * @return A new User RecordBuilder
   */
  public static com.example.User.Builder newBuilder(com.example.User other) {
    return new com.example.User.Builder(other);
  }

  /**
   * RecordBuilder for User instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<User>
    implements org.apache.avro.data.RecordBuilder<User> {

    /** First Name of User */
    private java.lang.String first_name;
    /** Last Name of User */
    private java.lang.String last_name;
    /** Zipcode of User */
    private java.lang.String zipcode;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.example.User.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.first_name)) {
        this.first_name = data().deepCopy(fields()[0].schema(), other.first_name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.last_name)) {
        this.last_name = data().deepCopy(fields()[1].schema(), other.last_name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.zipcode)) {
        this.zipcode = data().deepCopy(fields()[2].schema(), other.zipcode);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing User instance
     * @param other The existing instance to copy.
     */
    private Builder(com.example.User other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.first_name)) {
        this.first_name = data().deepCopy(fields()[0].schema(), other.first_name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.last_name)) {
        this.last_name = data().deepCopy(fields()[1].schema(), other.last_name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.zipcode)) {
        this.zipcode = data().deepCopy(fields()[2].schema(), other.zipcode);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'first_name' field.
      * First Name of User
      * @return The value.
      */
    public java.lang.String getFirstName() {
      return first_name;
    }

    /**
      * Sets the value of the 'first_name' field.
      * First Name of User
      * @param value The value of 'first_name'.
      * @return This builder.
      */
    public com.example.User.Builder setFirstName(java.lang.String value) {
      validate(fields()[0], value);
      this.first_name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'first_name' field has been set.
      * First Name of User
      * @return True if the 'first_name' field has been set, false otherwise.
      */
    public boolean hasFirstName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'first_name' field.
      * First Name of User
      * @return This builder.
      */
    public com.example.User.Builder clearFirstName() {
      first_name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'last_name' field.
      * Last Name of User
      * @return The value.
      */
    public java.lang.String getLastName() {
      return last_name;
    }

    /**
      * Sets the value of the 'last_name' field.
      * Last Name of User
      * @param value The value of 'last_name'.
      * @return This builder.
      */
    public com.example.User.Builder setLastName(java.lang.String value) {
      validate(fields()[1], value);
      this.last_name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'last_name' field has been set.
      * Last Name of User
      * @return True if the 'last_name' field has been set, false otherwise.
      */
    public boolean hasLastName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'last_name' field.
      * Last Name of User
      * @return This builder.
      */
    public com.example.User.Builder clearLastName() {
      last_name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'zipcode' field.
      * Zipcode of User
      * @return The value.
      */
    public java.lang.String getZipcode() {
      return zipcode;
    }

    /**
      * Sets the value of the 'zipcode' field.
      * Zipcode of User
      * @param value The value of 'zipcode'.
      * @return This builder.
      */
    public com.example.User.Builder setZipcode(java.lang.String value) {
      validate(fields()[2], value);
      this.zipcode = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'zipcode' field has been set.
      * Zipcode of User
      * @return True if the 'zipcode' field has been set, false otherwise.
      */
    public boolean hasZipcode() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'zipcode' field.
      * Zipcode of User
      * @return This builder.
      */
    public com.example.User.Builder clearZipcode() {
      zipcode = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public User build() {
      try {
        User record = new User();
        record.first_name = fieldSetFlags()[0] ? this.first_name : (java.lang.String) defaultValue(fields()[0]);
        record.last_name = fieldSetFlags()[1] ? this.last_name : (java.lang.String) defaultValue(fields()[1]);
        record.zipcode = fieldSetFlags()[2] ? this.zipcode : (java.lang.String) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<User>
    WRITER$ = (org.apache.avro.io.DatumWriter<User>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<User>
    READER$ = (org.apache.avro.io.DatumReader<User>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
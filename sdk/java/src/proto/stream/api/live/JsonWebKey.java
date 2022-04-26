/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

/**
 * Protobuf type {@code live.v21.JsonWebKey}
 */
public final class JsonWebKey extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:live.v21.JsonWebKey)
    JsonWebKeyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JsonWebKey.newBuilder() to construct.
  private JsonWebKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JsonWebKey() {
    alg_ = "";
    kty_ = "";
    use_ = "";
    kid_ = "";
    e_ = "";
    n_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JsonWebKey();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JsonWebKey(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            alg_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            kty_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            use_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            kid_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            e_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            n_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return stream.api.live.Api.internal_static_live_v21_JsonWebKey_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return stream.api.live.Api.internal_static_live_v21_JsonWebKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            stream.api.live.JsonWebKey.class, stream.api.live.JsonWebKey.Builder.class);
  }

  public static final int ALG_FIELD_NUMBER = 1;
  private volatile java.lang.Object alg_;
  /**
   * <code>string alg = 1 [json_name = "alg"];</code>
   * @return The alg.
   */
  @java.lang.Override
  public java.lang.String getAlg() {
    java.lang.Object ref = alg_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      alg_ = s;
      return s;
    }
  }
  /**
   * <code>string alg = 1 [json_name = "alg"];</code>
   * @return The bytes for alg.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAlgBytes() {
    java.lang.Object ref = alg_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      alg_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KTY_FIELD_NUMBER = 2;
  private volatile java.lang.Object kty_;
  /**
   * <code>string kty = 2 [json_name = "kty"];</code>
   * @return The kty.
   */
  @java.lang.Override
  public java.lang.String getKty() {
    java.lang.Object ref = kty_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      kty_ = s;
      return s;
    }
  }
  /**
   * <code>string kty = 2 [json_name = "kty"];</code>
   * @return The bytes for kty.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKtyBytes() {
    java.lang.Object ref = kty_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      kty_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USE_FIELD_NUMBER = 3;
  private volatile java.lang.Object use_;
  /**
   * <code>string use = 3 [json_name = "use"];</code>
   * @return The use.
   */
  @java.lang.Override
  public java.lang.String getUse() {
    java.lang.Object ref = use_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      use_ = s;
      return s;
    }
  }
  /**
   * <code>string use = 3 [json_name = "use"];</code>
   * @return The bytes for use.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUseBytes() {
    java.lang.Object ref = use_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      use_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KID_FIELD_NUMBER = 4;
  private volatile java.lang.Object kid_;
  /**
   * <code>string kid = 4 [json_name = "kid"];</code>
   * @return The kid.
   */
  @java.lang.Override
  public java.lang.String getKid() {
    java.lang.Object ref = kid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      kid_ = s;
      return s;
    }
  }
  /**
   * <code>string kid = 4 [json_name = "kid"];</code>
   * @return The bytes for kid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKidBytes() {
    java.lang.Object ref = kid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      kid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int E_FIELD_NUMBER = 5;
  private volatile java.lang.Object e_;
  /**
   * <code>string e = 5 [json_name = "e"];</code>
   * @return The e.
   */
  @java.lang.Override
  public java.lang.String getE() {
    java.lang.Object ref = e_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      e_ = s;
      return s;
    }
  }
  /**
   * <code>string e = 5 [json_name = "e"];</code>
   * @return The bytes for e.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEBytes() {
    java.lang.Object ref = e_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      e_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int N_FIELD_NUMBER = 6;
  private volatile java.lang.Object n_;
  /**
   * <code>string n = 6 [json_name = "n"];</code>
   * @return The n.
   */
  @java.lang.Override
  public java.lang.String getN() {
    java.lang.Object ref = n_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      n_ = s;
      return s;
    }
  }
  /**
   * <code>string n = 6 [json_name = "n"];</code>
   * @return The bytes for n.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNBytes() {
    java.lang.Object ref = n_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      n_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(alg_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, alg_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(kty_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, kty_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(use_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, use_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(kid_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, kid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(e_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, e_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(n_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, n_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(alg_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, alg_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(kty_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, kty_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(use_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, use_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(kid_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, kid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(e_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, e_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(n_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, n_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof stream.api.live.JsonWebKey)) {
      return super.equals(obj);
    }
    stream.api.live.JsonWebKey other = (stream.api.live.JsonWebKey) obj;

    if (!getAlg()
        .equals(other.getAlg())) return false;
    if (!getKty()
        .equals(other.getKty())) return false;
    if (!getUse()
        .equals(other.getUse())) return false;
    if (!getKid()
        .equals(other.getKid())) return false;
    if (!getE()
        .equals(other.getE())) return false;
    if (!getN()
        .equals(other.getN())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ALG_FIELD_NUMBER;
    hash = (53 * hash) + getAlg().hashCode();
    hash = (37 * hash) + KTY_FIELD_NUMBER;
    hash = (53 * hash) + getKty().hashCode();
    hash = (37 * hash) + USE_FIELD_NUMBER;
    hash = (53 * hash) + getUse().hashCode();
    hash = (37 * hash) + KID_FIELD_NUMBER;
    hash = (53 * hash) + getKid().hashCode();
    hash = (37 * hash) + E_FIELD_NUMBER;
    hash = (53 * hash) + getE().hashCode();
    hash = (37 * hash) + N_FIELD_NUMBER;
    hash = (53 * hash) + getN().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static stream.api.live.JsonWebKey parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.JsonWebKey parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.JsonWebKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.JsonWebKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.JsonWebKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.JsonWebKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.JsonWebKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.live.JsonWebKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.live.JsonWebKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static stream.api.live.JsonWebKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.live.JsonWebKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.live.JsonWebKey parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(stream.api.live.JsonWebKey prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code live.v21.JsonWebKey}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:live.v21.JsonWebKey)
      stream.api.live.JsonWebKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return stream.api.live.Api.internal_static_live_v21_JsonWebKey_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return stream.api.live.Api.internal_static_live_v21_JsonWebKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              stream.api.live.JsonWebKey.class, stream.api.live.JsonWebKey.Builder.class);
    }

    // Construct using stream.api.live.JsonWebKey.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      alg_ = "";

      kty_ = "";

      use_ = "";

      kid_ = "";

      e_ = "";

      n_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return stream.api.live.Api.internal_static_live_v21_JsonWebKey_descriptor;
    }

    @java.lang.Override
    public stream.api.live.JsonWebKey getDefaultInstanceForType() {
      return stream.api.live.JsonWebKey.getDefaultInstance();
    }

    @java.lang.Override
    public stream.api.live.JsonWebKey build() {
      stream.api.live.JsonWebKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public stream.api.live.JsonWebKey buildPartial() {
      stream.api.live.JsonWebKey result = new stream.api.live.JsonWebKey(this);
      result.alg_ = alg_;
      result.kty_ = kty_;
      result.use_ = use_;
      result.kid_ = kid_;
      result.e_ = e_;
      result.n_ = n_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof stream.api.live.JsonWebKey) {
        return mergeFrom((stream.api.live.JsonWebKey)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(stream.api.live.JsonWebKey other) {
      if (other == stream.api.live.JsonWebKey.getDefaultInstance()) return this;
      if (!other.getAlg().isEmpty()) {
        alg_ = other.alg_;
        onChanged();
      }
      if (!other.getKty().isEmpty()) {
        kty_ = other.kty_;
        onChanged();
      }
      if (!other.getUse().isEmpty()) {
        use_ = other.use_;
        onChanged();
      }
      if (!other.getKid().isEmpty()) {
        kid_ = other.kid_;
        onChanged();
      }
      if (!other.getE().isEmpty()) {
        e_ = other.e_;
        onChanged();
      }
      if (!other.getN().isEmpty()) {
        n_ = other.n_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      stream.api.live.JsonWebKey parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (stream.api.live.JsonWebKey) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object alg_ = "";
    /**
     * <code>string alg = 1 [json_name = "alg"];</code>
     * @return The alg.
     */
    public java.lang.String getAlg() {
      java.lang.Object ref = alg_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        alg_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string alg = 1 [json_name = "alg"];</code>
     * @return The bytes for alg.
     */
    public com.google.protobuf.ByteString
        getAlgBytes() {
      java.lang.Object ref = alg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        alg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string alg = 1 [json_name = "alg"];</code>
     * @param value The alg to set.
     * @return This builder for chaining.
     */
    public Builder setAlg(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      alg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string alg = 1 [json_name = "alg"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAlg() {
      
      alg_ = getDefaultInstance().getAlg();
      onChanged();
      return this;
    }
    /**
     * <code>string alg = 1 [json_name = "alg"];</code>
     * @param value The bytes for alg to set.
     * @return This builder for chaining.
     */
    public Builder setAlgBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      alg_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object kty_ = "";
    /**
     * <code>string kty = 2 [json_name = "kty"];</code>
     * @return The kty.
     */
    public java.lang.String getKty() {
      java.lang.Object ref = kty_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        kty_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string kty = 2 [json_name = "kty"];</code>
     * @return The bytes for kty.
     */
    public com.google.protobuf.ByteString
        getKtyBytes() {
      java.lang.Object ref = kty_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        kty_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string kty = 2 [json_name = "kty"];</code>
     * @param value The kty to set.
     * @return This builder for chaining.
     */
    public Builder setKty(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      kty_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string kty = 2 [json_name = "kty"];</code>
     * @return This builder for chaining.
     */
    public Builder clearKty() {
      
      kty_ = getDefaultInstance().getKty();
      onChanged();
      return this;
    }
    /**
     * <code>string kty = 2 [json_name = "kty"];</code>
     * @param value The bytes for kty to set.
     * @return This builder for chaining.
     */
    public Builder setKtyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      kty_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object use_ = "";
    /**
     * <code>string use = 3 [json_name = "use"];</code>
     * @return The use.
     */
    public java.lang.String getUse() {
      java.lang.Object ref = use_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        use_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string use = 3 [json_name = "use"];</code>
     * @return The bytes for use.
     */
    public com.google.protobuf.ByteString
        getUseBytes() {
      java.lang.Object ref = use_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        use_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string use = 3 [json_name = "use"];</code>
     * @param value The use to set.
     * @return This builder for chaining.
     */
    public Builder setUse(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      use_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string use = 3 [json_name = "use"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUse() {
      
      use_ = getDefaultInstance().getUse();
      onChanged();
      return this;
    }
    /**
     * <code>string use = 3 [json_name = "use"];</code>
     * @param value The bytes for use to set.
     * @return This builder for chaining.
     */
    public Builder setUseBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      use_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object kid_ = "";
    /**
     * <code>string kid = 4 [json_name = "kid"];</code>
     * @return The kid.
     */
    public java.lang.String getKid() {
      java.lang.Object ref = kid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        kid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string kid = 4 [json_name = "kid"];</code>
     * @return The bytes for kid.
     */
    public com.google.protobuf.ByteString
        getKidBytes() {
      java.lang.Object ref = kid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        kid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string kid = 4 [json_name = "kid"];</code>
     * @param value The kid to set.
     * @return This builder for chaining.
     */
    public Builder setKid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      kid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string kid = 4 [json_name = "kid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearKid() {
      
      kid_ = getDefaultInstance().getKid();
      onChanged();
      return this;
    }
    /**
     * <code>string kid = 4 [json_name = "kid"];</code>
     * @param value The bytes for kid to set.
     * @return This builder for chaining.
     */
    public Builder setKidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      kid_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object e_ = "";
    /**
     * <code>string e = 5 [json_name = "e"];</code>
     * @return The e.
     */
    public java.lang.String getE() {
      java.lang.Object ref = e_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        e_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string e = 5 [json_name = "e"];</code>
     * @return The bytes for e.
     */
    public com.google.protobuf.ByteString
        getEBytes() {
      java.lang.Object ref = e_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        e_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string e = 5 [json_name = "e"];</code>
     * @param value The e to set.
     * @return This builder for chaining.
     */
    public Builder setE(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      e_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string e = 5 [json_name = "e"];</code>
     * @return This builder for chaining.
     */
    public Builder clearE() {
      
      e_ = getDefaultInstance().getE();
      onChanged();
      return this;
    }
    /**
     * <code>string e = 5 [json_name = "e"];</code>
     * @param value The bytes for e to set.
     * @return This builder for chaining.
     */
    public Builder setEBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      e_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object n_ = "";
    /**
     * <code>string n = 6 [json_name = "n"];</code>
     * @return The n.
     */
    public java.lang.String getN() {
      java.lang.Object ref = n_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        n_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string n = 6 [json_name = "n"];</code>
     * @return The bytes for n.
     */
    public com.google.protobuf.ByteString
        getNBytes() {
      java.lang.Object ref = n_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        n_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string n = 6 [json_name = "n"];</code>
     * @param value The n to set.
     * @return This builder for chaining.
     */
    public Builder setN(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      n_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string n = 6 [json_name = "n"];</code>
     * @return This builder for chaining.
     */
    public Builder clearN() {
      
      n_ = getDefaultInstance().getN();
      onChanged();
      return this;
    }
    /**
     * <code>string n = 6 [json_name = "n"];</code>
     * @param value The bytes for n to set.
     * @return This builder for chaining.
     */
    public Builder setNBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      n_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:live.v21.JsonWebKey)
  }

  // @@protoc_insertion_point(class_scope:live.v21.JsonWebKey)
  private static final stream.api.live.JsonWebKey DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new stream.api.live.JsonWebKey();
  }

  public static stream.api.live.JsonWebKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JsonWebKey>
      PARSER = new com.google.protobuf.AbstractParser<JsonWebKey>() {
    @java.lang.Override
    public JsonWebKey parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JsonWebKey(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JsonWebKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JsonWebKey> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public stream.api.live.JsonWebKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


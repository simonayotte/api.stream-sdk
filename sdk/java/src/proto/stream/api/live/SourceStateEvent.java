/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

/**
 * <pre>
 * the state of a destination changed
 * </pre>
 *
 * Protobuf type {@code live.v21.SourceStateEvent}
 */
public final class SourceStateEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:live.v21.SourceStateEvent)
    SourceStateEventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SourceStateEvent.newBuilder() to construct.
  private SourceStateEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SourceStateEvent() {
    collectionId_ = "";
    projectId_ = "";
    sourceId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SourceStateEvent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SourceStateEvent(
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

            collectionId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            projectId_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            sourceId_ = s;
            break;
          }
          case 32: {
            int rawValue = input.readEnum();
            typeCase_ = 4;
            type_ = rawValue;
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
    return stream.api.live.Api.internal_static_live_v21_SourceStateEvent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return stream.api.live.Api.internal_static_live_v21_SourceStateEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            stream.api.live.SourceStateEvent.class, stream.api.live.SourceStateEvent.Builder.class);
  }

  private int typeCase_ = 0;
  private java.lang.Object type_;
  public enum TypeCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    CONNECT(4),
    TYPE_NOT_SET(0);
    private final int value;
    private TypeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static TypeCase forNumber(int value) {
      switch (value) {
        case 4: return CONNECT;
        case 0: return TYPE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public TypeCase
  getTypeCase() {
    return TypeCase.forNumber(
        typeCase_);
  }

  public static final int COLLECTION_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object collectionId_;
  /**
   * <pre>
   * collection which owns the project which owns the source
   * </pre>
   *
   * <code>string collection_id = 1 [json_name = "collectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The collectionId.
   */
  @java.lang.Override
  public java.lang.String getCollectionId() {
    java.lang.Object ref = collectionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      collectionId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * collection which owns the project which owns the source
   * </pre>
   *
   * <code>string collection_id = 1 [json_name = "collectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for collectionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCollectionIdBytes() {
    java.lang.Object ref = collectionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      collectionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROJECT_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object projectId_;
  /**
   * <pre>
   * project id
   * </pre>
   *
   * <code>string project_id = 2 [json_name = "projectId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The projectId.
   */
  @java.lang.Override
  public java.lang.String getProjectId() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * project id
   * </pre>
   *
   * <code>string project_id = 2 [json_name = "projectId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for projectId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProjectIdBytes() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      projectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SOURCE_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object sourceId_;
  /**
   * <pre>
   * destination id
   * </pre>
   *
   * <code>string source_id = 3 [json_name = "sourceId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The sourceId.
   */
  @java.lang.Override
  public java.lang.String getSourceId() {
    java.lang.Object ref = sourceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sourceId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * destination id
   * </pre>
   *
   * <code>string source_id = 3 [json_name = "sourceId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for sourceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSourceIdBytes() {
    java.lang.Object ref = sourceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sourceId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONNECT_FIELD_NUMBER = 4;
  /**
   * <pre>
   * the state of the connection changed
   * </pre>
   *
   * <code>.live.v21.ConnectState connect = 4 [json_name = "connect"];</code>
   * @return Whether the connect field is set.
   */
  public boolean hasConnect() {
    return typeCase_ == 4;
  }
  /**
   * <pre>
   * the state of the connection changed
   * </pre>
   *
   * <code>.live.v21.ConnectState connect = 4 [json_name = "connect"];</code>
   * @return The enum numeric value on the wire for connect.
   */
  public int getConnectValue() {
    if (typeCase_ == 4) {
      return (java.lang.Integer) type_;
    }
    return 0;
  }
  /**
   * <pre>
   * the state of the connection changed
   * </pre>
   *
   * <code>.live.v21.ConnectState connect = 4 [json_name = "connect"];</code>
   * @return The connect.
   */
  public stream.api.live.ConnectState getConnect() {
    if (typeCase_ == 4) {
      @SuppressWarnings("deprecation")
      stream.api.live.ConnectState result = stream.api.live.ConnectState.valueOf(
          (java.lang.Integer) type_);
      return result == null ? stream.api.live.ConnectState.UNRECOGNIZED : result;
    }
    return stream.api.live.ConnectState.CONNECT_STATE_UNSPECIFIED;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(collectionId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, collectionId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, projectId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sourceId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, sourceId_);
    }
    if (typeCase_ == 4) {
      output.writeEnum(4, ((java.lang.Integer) type_));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(collectionId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, collectionId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, projectId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sourceId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, sourceId_);
    }
    if (typeCase_ == 4) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, ((java.lang.Integer) type_));
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
    if (!(obj instanceof stream.api.live.SourceStateEvent)) {
      return super.equals(obj);
    }
    stream.api.live.SourceStateEvent other = (stream.api.live.SourceStateEvent) obj;

    if (!getCollectionId()
        .equals(other.getCollectionId())) return false;
    if (!getProjectId()
        .equals(other.getProjectId())) return false;
    if (!getSourceId()
        .equals(other.getSourceId())) return false;
    if (!getTypeCase().equals(other.getTypeCase())) return false;
    switch (typeCase_) {
      case 4:
        if (getConnectValue()
            != other.getConnectValue()) return false;
        break;
      case 0:
      default:
    }
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
    hash = (37 * hash) + COLLECTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCollectionId().hashCode();
    hash = (37 * hash) + PROJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProjectId().hashCode();
    hash = (37 * hash) + SOURCE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSourceId().hashCode();
    switch (typeCase_) {
      case 4:
        hash = (37 * hash) + CONNECT_FIELD_NUMBER;
        hash = (53 * hash) + getConnectValue();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static stream.api.live.SourceStateEvent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.SourceStateEvent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.SourceStateEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.SourceStateEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.SourceStateEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.SourceStateEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.SourceStateEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.live.SourceStateEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.live.SourceStateEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static stream.api.live.SourceStateEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.live.SourceStateEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.live.SourceStateEvent parseFrom(
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
  public static Builder newBuilder(stream.api.live.SourceStateEvent prototype) {
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
   * <pre>
   * the state of a destination changed
   * </pre>
   *
   * Protobuf type {@code live.v21.SourceStateEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:live.v21.SourceStateEvent)
      stream.api.live.SourceStateEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return stream.api.live.Api.internal_static_live_v21_SourceStateEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return stream.api.live.Api.internal_static_live_v21_SourceStateEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              stream.api.live.SourceStateEvent.class, stream.api.live.SourceStateEvent.Builder.class);
    }

    // Construct using stream.api.live.SourceStateEvent.newBuilder()
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
      collectionId_ = "";

      projectId_ = "";

      sourceId_ = "";

      typeCase_ = 0;
      type_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return stream.api.live.Api.internal_static_live_v21_SourceStateEvent_descriptor;
    }

    @java.lang.Override
    public stream.api.live.SourceStateEvent getDefaultInstanceForType() {
      return stream.api.live.SourceStateEvent.getDefaultInstance();
    }

    @java.lang.Override
    public stream.api.live.SourceStateEvent build() {
      stream.api.live.SourceStateEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public stream.api.live.SourceStateEvent buildPartial() {
      stream.api.live.SourceStateEvent result = new stream.api.live.SourceStateEvent(this);
      result.collectionId_ = collectionId_;
      result.projectId_ = projectId_;
      result.sourceId_ = sourceId_;
      if (typeCase_ == 4) {
        result.type_ = type_;
      }
      result.typeCase_ = typeCase_;
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
      if (other instanceof stream.api.live.SourceStateEvent) {
        return mergeFrom((stream.api.live.SourceStateEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(stream.api.live.SourceStateEvent other) {
      if (other == stream.api.live.SourceStateEvent.getDefaultInstance()) return this;
      if (!other.getCollectionId().isEmpty()) {
        collectionId_ = other.collectionId_;
        onChanged();
      }
      if (!other.getProjectId().isEmpty()) {
        projectId_ = other.projectId_;
        onChanged();
      }
      if (!other.getSourceId().isEmpty()) {
        sourceId_ = other.sourceId_;
        onChanged();
      }
      switch (other.getTypeCase()) {
        case CONNECT: {
          setConnectValue(other.getConnectValue());
          break;
        }
        case TYPE_NOT_SET: {
          break;
        }
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
      stream.api.live.SourceStateEvent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (stream.api.live.SourceStateEvent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int typeCase_ = 0;
    private java.lang.Object type_;
    public TypeCase
        getTypeCase() {
      return TypeCase.forNumber(
          typeCase_);
    }

    public Builder clearType() {
      typeCase_ = 0;
      type_ = null;
      onChanged();
      return this;
    }


    private java.lang.Object collectionId_ = "";
    /**
     * <pre>
     * collection which owns the project which owns the source
     * </pre>
     *
     * <code>string collection_id = 1 [json_name = "collectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The collectionId.
     */
    public java.lang.String getCollectionId() {
      java.lang.Object ref = collectionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        collectionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * collection which owns the project which owns the source
     * </pre>
     *
     * <code>string collection_id = 1 [json_name = "collectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The bytes for collectionId.
     */
    public com.google.protobuf.ByteString
        getCollectionIdBytes() {
      java.lang.Object ref = collectionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        collectionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * collection which owns the project which owns the source
     * </pre>
     *
     * <code>string collection_id = 1 [json_name = "collectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The collectionId to set.
     * @return This builder for chaining.
     */
    public Builder setCollectionId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      collectionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * collection which owns the project which owns the source
     * </pre>
     *
     * <code>string collection_id = 1 [json_name = "collectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearCollectionId() {
      
      collectionId_ = getDefaultInstance().getCollectionId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * collection which owns the project which owns the source
     * </pre>
     *
     * <code>string collection_id = 1 [json_name = "collectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The bytes for collectionId to set.
     * @return This builder for chaining.
     */
    public Builder setCollectionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      collectionId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object projectId_ = "";
    /**
     * <pre>
     * project id
     * </pre>
     *
     * <code>string project_id = 2 [json_name = "projectId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The projectId.
     */
    public java.lang.String getProjectId() {
      java.lang.Object ref = projectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * project id
     * </pre>
     *
     * <code>string project_id = 2 [json_name = "projectId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The bytes for projectId.
     */
    public com.google.protobuf.ByteString
        getProjectIdBytes() {
      java.lang.Object ref = projectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        projectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * project id
     * </pre>
     *
     * <code>string project_id = 2 [json_name = "projectId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The projectId to set.
     * @return This builder for chaining.
     */
    public Builder setProjectId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      projectId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * project id
     * </pre>
     *
     * <code>string project_id = 2 [json_name = "projectId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearProjectId() {
      
      projectId_ = getDefaultInstance().getProjectId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * project id
     * </pre>
     *
     * <code>string project_id = 2 [json_name = "projectId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The bytes for projectId to set.
     * @return This builder for chaining.
     */
    public Builder setProjectIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      projectId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object sourceId_ = "";
    /**
     * <pre>
     * destination id
     * </pre>
     *
     * <code>string source_id = 3 [json_name = "sourceId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The sourceId.
     */
    public java.lang.String getSourceId() {
      java.lang.Object ref = sourceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sourceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * destination id
     * </pre>
     *
     * <code>string source_id = 3 [json_name = "sourceId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The bytes for sourceId.
     */
    public com.google.protobuf.ByteString
        getSourceIdBytes() {
      java.lang.Object ref = sourceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sourceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * destination id
     * </pre>
     *
     * <code>string source_id = 3 [json_name = "sourceId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The sourceId to set.
     * @return This builder for chaining.
     */
    public Builder setSourceId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sourceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * destination id
     * </pre>
     *
     * <code>string source_id = 3 [json_name = "sourceId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearSourceId() {
      
      sourceId_ = getDefaultInstance().getSourceId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * destination id
     * </pre>
     *
     * <code>string source_id = 3 [json_name = "sourceId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The bytes for sourceId to set.
     * @return This builder for chaining.
     */
    public Builder setSourceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sourceId_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * the state of the connection changed
     * </pre>
     *
     * <code>.live.v21.ConnectState connect = 4 [json_name = "connect"];</code>
     * @return Whether the connect field is set.
     */
    @java.lang.Override
    public boolean hasConnect() {
      return typeCase_ == 4;
    }
    /**
     * <pre>
     * the state of the connection changed
     * </pre>
     *
     * <code>.live.v21.ConnectState connect = 4 [json_name = "connect"];</code>
     * @return The enum numeric value on the wire for connect.
     */
    @java.lang.Override
    public int getConnectValue() {
      if (typeCase_ == 4) {
        return ((java.lang.Integer) type_).intValue();
      }
      return 0;
    }
    /**
     * <pre>
     * the state of the connection changed
     * </pre>
     *
     * <code>.live.v21.ConnectState connect = 4 [json_name = "connect"];</code>
     * @param value The enum numeric value on the wire for connect to set.
     * @return This builder for chaining.
     */
    public Builder setConnectValue(int value) {
      typeCase_ = 4;
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the state of the connection changed
     * </pre>
     *
     * <code>.live.v21.ConnectState connect = 4 [json_name = "connect"];</code>
     * @return The connect.
     */
    @java.lang.Override
    public stream.api.live.ConnectState getConnect() {
      if (typeCase_ == 4) {
        @SuppressWarnings("deprecation")
        stream.api.live.ConnectState result = stream.api.live.ConnectState.valueOf(
            (java.lang.Integer) type_);
        return result == null ? stream.api.live.ConnectState.UNRECOGNIZED : result;
      }
      return stream.api.live.ConnectState.CONNECT_STATE_UNSPECIFIED;
    }
    /**
     * <pre>
     * the state of the connection changed
     * </pre>
     *
     * <code>.live.v21.ConnectState connect = 4 [json_name = "connect"];</code>
     * @param value The connect to set.
     * @return This builder for chaining.
     */
    public Builder setConnect(stream.api.live.ConnectState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      typeCase_ = 4;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the state of the connection changed
     * </pre>
     *
     * <code>.live.v21.ConnectState connect = 4 [json_name = "connect"];</code>
     * @return This builder for chaining.
     */
    public Builder clearConnect() {
      if (typeCase_ == 4) {
        typeCase_ = 0;
        type_ = null;
        onChanged();
      }
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


    // @@protoc_insertion_point(builder_scope:live.v21.SourceStateEvent)
  }

  // @@protoc_insertion_point(class_scope:live.v21.SourceStateEvent)
  private static final stream.api.live.SourceStateEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new stream.api.live.SourceStateEvent();
  }

  public static stream.api.live.SourceStateEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SourceStateEvent>
      PARSER = new com.google.protobuf.AbstractParser<SourceStateEvent>() {
    @java.lang.Override
    public SourceStateEvent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SourceStateEvent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SourceStateEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SourceStateEvent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public stream.api.live.SourceStateEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


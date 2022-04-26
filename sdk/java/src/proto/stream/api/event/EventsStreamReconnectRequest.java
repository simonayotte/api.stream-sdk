/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apis/event/v2/api.proto

package stream.api.event;

/**
 * <pre>
 * Indicate to the client that they should re-open their connection
 * </pre>
 *
 * Protobuf type {@code apis.event.v2.EventsStreamReconnectRequest}
 */
public final class EventsStreamReconnectRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:apis.event.v2.EventsStreamReconnectRequest)
    EventsStreamReconnectRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EventsStreamReconnectRequest.newBuilder() to construct.
  private EventsStreamReconnectRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EventsStreamReconnectRequest() {
    beforeTimestamp_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EventsStreamReconnectRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EventsStreamReconnectRequest(
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
          case 8: {

            reauthenticate_ = input.readBool();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            beforeTimestamp_ = s;
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
    return stream.api.event.Api.internal_static_apis_event_v2_EventsStreamReconnectRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return stream.api.event.Api.internal_static_apis_event_v2_EventsStreamReconnectRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            stream.api.event.EventsStreamReconnectRequest.class, stream.api.event.EventsStreamReconnectRequest.Builder.class);
  }

  public static final int REAUTHENTICATE_FIELD_NUMBER = 1;
  private boolean reauthenticate_;
  /**
   * <pre>
   * Whether the access token needs to be refreshed before reconnecting.
   * </pre>
   *
   * <code>bool reauthenticate = 1 [json_name = "reauthenticate", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The reauthenticate.
   */
  @java.lang.Override
  public boolean getReauthenticate() {
    return reauthenticate_;
  }

  public static final int BEFORE_TIMESTAMP_FIELD_NUMBER = 2;
  private volatile java.lang.Object beforeTimestamp_;
  /**
   * <pre>
   * A timestamp indicating when the connection should be reconnected by.
   * If you're maintaining multiple connections, you should reconnect at a random interval within this time range.
   * </pre>
   *
   * <code>string before_timestamp = 2 [json_name = "beforeTimestamp", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The beforeTimestamp.
   */
  @java.lang.Override
  public java.lang.String getBeforeTimestamp() {
    java.lang.Object ref = beforeTimestamp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      beforeTimestamp_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A timestamp indicating when the connection should be reconnected by.
   * If you're maintaining multiple connections, you should reconnect at a random interval within this time range.
   * </pre>
   *
   * <code>string before_timestamp = 2 [json_name = "beforeTimestamp", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for beforeTimestamp.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBeforeTimestampBytes() {
    java.lang.Object ref = beforeTimestamp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      beforeTimestamp_ = b;
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
    if (reauthenticate_ != false) {
      output.writeBool(1, reauthenticate_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(beforeTimestamp_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, beforeTimestamp_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (reauthenticate_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, reauthenticate_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(beforeTimestamp_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, beforeTimestamp_);
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
    if (!(obj instanceof stream.api.event.EventsStreamReconnectRequest)) {
      return super.equals(obj);
    }
    stream.api.event.EventsStreamReconnectRequest other = (stream.api.event.EventsStreamReconnectRequest) obj;

    if (getReauthenticate()
        != other.getReauthenticate()) return false;
    if (!getBeforeTimestamp()
        .equals(other.getBeforeTimestamp())) return false;
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
    hash = (37 * hash) + REAUTHENTICATE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getReauthenticate());
    hash = (37 * hash) + BEFORE_TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + getBeforeTimestamp().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static stream.api.event.EventsStreamReconnectRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.event.EventsStreamReconnectRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.event.EventsStreamReconnectRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.event.EventsStreamReconnectRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.event.EventsStreamReconnectRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.event.EventsStreamReconnectRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.event.EventsStreamReconnectRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.event.EventsStreamReconnectRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.event.EventsStreamReconnectRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static stream.api.event.EventsStreamReconnectRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.event.EventsStreamReconnectRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.event.EventsStreamReconnectRequest parseFrom(
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
  public static Builder newBuilder(stream.api.event.EventsStreamReconnectRequest prototype) {
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
   * Indicate to the client that they should re-open their connection
   * </pre>
   *
   * Protobuf type {@code apis.event.v2.EventsStreamReconnectRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:apis.event.v2.EventsStreamReconnectRequest)
      stream.api.event.EventsStreamReconnectRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return stream.api.event.Api.internal_static_apis_event_v2_EventsStreamReconnectRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return stream.api.event.Api.internal_static_apis_event_v2_EventsStreamReconnectRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              stream.api.event.EventsStreamReconnectRequest.class, stream.api.event.EventsStreamReconnectRequest.Builder.class);
    }

    // Construct using stream.api.event.EventsStreamReconnectRequest.newBuilder()
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
      reauthenticate_ = false;

      beforeTimestamp_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return stream.api.event.Api.internal_static_apis_event_v2_EventsStreamReconnectRequest_descriptor;
    }

    @java.lang.Override
    public stream.api.event.EventsStreamReconnectRequest getDefaultInstanceForType() {
      return stream.api.event.EventsStreamReconnectRequest.getDefaultInstance();
    }

    @java.lang.Override
    public stream.api.event.EventsStreamReconnectRequest build() {
      stream.api.event.EventsStreamReconnectRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public stream.api.event.EventsStreamReconnectRequest buildPartial() {
      stream.api.event.EventsStreamReconnectRequest result = new stream.api.event.EventsStreamReconnectRequest(this);
      result.reauthenticate_ = reauthenticate_;
      result.beforeTimestamp_ = beforeTimestamp_;
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
      if (other instanceof stream.api.event.EventsStreamReconnectRequest) {
        return mergeFrom((stream.api.event.EventsStreamReconnectRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(stream.api.event.EventsStreamReconnectRequest other) {
      if (other == stream.api.event.EventsStreamReconnectRequest.getDefaultInstance()) return this;
      if (other.getReauthenticate() != false) {
        setReauthenticate(other.getReauthenticate());
      }
      if (!other.getBeforeTimestamp().isEmpty()) {
        beforeTimestamp_ = other.beforeTimestamp_;
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
      stream.api.event.EventsStreamReconnectRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (stream.api.event.EventsStreamReconnectRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean reauthenticate_ ;
    /**
     * <pre>
     * Whether the access token needs to be refreshed before reconnecting.
     * </pre>
     *
     * <code>bool reauthenticate = 1 [json_name = "reauthenticate", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The reauthenticate.
     */
    @java.lang.Override
    public boolean getReauthenticate() {
      return reauthenticate_;
    }
    /**
     * <pre>
     * Whether the access token needs to be refreshed before reconnecting.
     * </pre>
     *
     * <code>bool reauthenticate = 1 [json_name = "reauthenticate", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The reauthenticate to set.
     * @return This builder for chaining.
     */
    public Builder setReauthenticate(boolean value) {
      
      reauthenticate_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether the access token needs to be refreshed before reconnecting.
     * </pre>
     *
     * <code>bool reauthenticate = 1 [json_name = "reauthenticate", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearReauthenticate() {
      
      reauthenticate_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object beforeTimestamp_ = "";
    /**
     * <pre>
     * A timestamp indicating when the connection should be reconnected by.
     * If you're maintaining multiple connections, you should reconnect at a random interval within this time range.
     * </pre>
     *
     * <code>string before_timestamp = 2 [json_name = "beforeTimestamp", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The beforeTimestamp.
     */
    public java.lang.String getBeforeTimestamp() {
      java.lang.Object ref = beforeTimestamp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        beforeTimestamp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A timestamp indicating when the connection should be reconnected by.
     * If you're maintaining multiple connections, you should reconnect at a random interval within this time range.
     * </pre>
     *
     * <code>string before_timestamp = 2 [json_name = "beforeTimestamp", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The bytes for beforeTimestamp.
     */
    public com.google.protobuf.ByteString
        getBeforeTimestampBytes() {
      java.lang.Object ref = beforeTimestamp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        beforeTimestamp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A timestamp indicating when the connection should be reconnected by.
     * If you're maintaining multiple connections, you should reconnect at a random interval within this time range.
     * </pre>
     *
     * <code>string before_timestamp = 2 [json_name = "beforeTimestamp", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The beforeTimestamp to set.
     * @return This builder for chaining.
     */
    public Builder setBeforeTimestamp(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      beforeTimestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A timestamp indicating when the connection should be reconnected by.
     * If you're maintaining multiple connections, you should reconnect at a random interval within this time range.
     * </pre>
     *
     * <code>string before_timestamp = 2 [json_name = "beforeTimestamp", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearBeforeTimestamp() {
      
      beforeTimestamp_ = getDefaultInstance().getBeforeTimestamp();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A timestamp indicating when the connection should be reconnected by.
     * If you're maintaining multiple connections, you should reconnect at a random interval within this time range.
     * </pre>
     *
     * <code>string before_timestamp = 2 [json_name = "beforeTimestamp", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The bytes for beforeTimestamp to set.
     * @return This builder for chaining.
     */
    public Builder setBeforeTimestampBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      beforeTimestamp_ = value;
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


    // @@protoc_insertion_point(builder_scope:apis.event.v2.EventsStreamReconnectRequest)
  }

  // @@protoc_insertion_point(class_scope:apis.event.v2.EventsStreamReconnectRequest)
  private static final stream.api.event.EventsStreamReconnectRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new stream.api.event.EventsStreamReconnectRequest();
  }

  public static stream.api.event.EventsStreamReconnectRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventsStreamReconnectRequest>
      PARSER = new com.google.protobuf.AbstractParser<EventsStreamReconnectRequest>() {
    @java.lang.Override
    public EventsStreamReconnectRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EventsStreamReconnectRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EventsStreamReconnectRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventsStreamReconnectRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public stream.api.event.EventsStreamReconnectRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


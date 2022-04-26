/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

/**
 * Protobuf type {@code live.v21.GetProjectBroadcastStatusResponse}
 */
public final class GetProjectBroadcastStatusResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:live.v21.GetProjectBroadcastStatusResponse)
    GetProjectBroadcastStatusResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetProjectBroadcastStatusResponse.newBuilder() to construct.
  private GetProjectBroadcastStatusResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetProjectBroadcastStatusResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetProjectBroadcastStatusResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetProjectBroadcastStatusResponse(
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
            stream.api.live.ProjectBroadcastStatus.Builder subBuilder = null;
            if (status_ != null) {
              subBuilder = status_.toBuilder();
            }
            status_ = input.readMessage(stream.api.live.ProjectBroadcastStatus.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(status_);
              status_ = subBuilder.buildPartial();
            }

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
    return stream.api.live.Api.internal_static_live_v21_GetProjectBroadcastStatusResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return stream.api.live.Api.internal_static_live_v21_GetProjectBroadcastStatusResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            stream.api.live.GetProjectBroadcastStatusResponse.class, stream.api.live.GetProjectBroadcastStatusResponse.Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private stream.api.live.ProjectBroadcastStatus status_;
  /**
   * <pre>
   * the status of the project broadcast
   * </pre>
   *
   * <code>.live.v21.ProjectBroadcastStatus status = 1 [json_name = "status"];</code>
   * @return Whether the status field is set.
   */
  @java.lang.Override
  public boolean hasStatus() {
    return status_ != null;
  }
  /**
   * <pre>
   * the status of the project broadcast
   * </pre>
   *
   * <code>.live.v21.ProjectBroadcastStatus status = 1 [json_name = "status"];</code>
   * @return The status.
   */
  @java.lang.Override
  public stream.api.live.ProjectBroadcastStatus getStatus() {
    return status_ == null ? stream.api.live.ProjectBroadcastStatus.getDefaultInstance() : status_;
  }
  /**
   * <pre>
   * the status of the project broadcast
   * </pre>
   *
   * <code>.live.v21.ProjectBroadcastStatus status = 1 [json_name = "status"];</code>
   */
  @java.lang.Override
  public stream.api.live.ProjectBroadcastStatusOrBuilder getStatusOrBuilder() {
    return getStatus();
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
    if (status_ != null) {
      output.writeMessage(1, getStatus());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getStatus());
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
    if (!(obj instanceof stream.api.live.GetProjectBroadcastStatusResponse)) {
      return super.equals(obj);
    }
    stream.api.live.GetProjectBroadcastStatusResponse other = (stream.api.live.GetProjectBroadcastStatusResponse) obj;

    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (!getStatus()
          .equals(other.getStatus())) return false;
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
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static stream.api.live.GetProjectBroadcastStatusResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.GetProjectBroadcastStatusResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.GetProjectBroadcastStatusResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.GetProjectBroadcastStatusResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.GetProjectBroadcastStatusResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.GetProjectBroadcastStatusResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.GetProjectBroadcastStatusResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.live.GetProjectBroadcastStatusResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.live.GetProjectBroadcastStatusResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static stream.api.live.GetProjectBroadcastStatusResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.live.GetProjectBroadcastStatusResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.live.GetProjectBroadcastStatusResponse parseFrom(
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
  public static Builder newBuilder(stream.api.live.GetProjectBroadcastStatusResponse prototype) {
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
   * Protobuf type {@code live.v21.GetProjectBroadcastStatusResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:live.v21.GetProjectBroadcastStatusResponse)
      stream.api.live.GetProjectBroadcastStatusResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return stream.api.live.Api.internal_static_live_v21_GetProjectBroadcastStatusResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return stream.api.live.Api.internal_static_live_v21_GetProjectBroadcastStatusResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              stream.api.live.GetProjectBroadcastStatusResponse.class, stream.api.live.GetProjectBroadcastStatusResponse.Builder.class);
    }

    // Construct using stream.api.live.GetProjectBroadcastStatusResponse.newBuilder()
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
      if (statusBuilder_ == null) {
        status_ = null;
      } else {
        status_ = null;
        statusBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return stream.api.live.Api.internal_static_live_v21_GetProjectBroadcastStatusResponse_descriptor;
    }

    @java.lang.Override
    public stream.api.live.GetProjectBroadcastStatusResponse getDefaultInstanceForType() {
      return stream.api.live.GetProjectBroadcastStatusResponse.getDefaultInstance();
    }

    @java.lang.Override
    public stream.api.live.GetProjectBroadcastStatusResponse build() {
      stream.api.live.GetProjectBroadcastStatusResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public stream.api.live.GetProjectBroadcastStatusResponse buildPartial() {
      stream.api.live.GetProjectBroadcastStatusResponse result = new stream.api.live.GetProjectBroadcastStatusResponse(this);
      if (statusBuilder_ == null) {
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
      }
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
      if (other instanceof stream.api.live.GetProjectBroadcastStatusResponse) {
        return mergeFrom((stream.api.live.GetProjectBroadcastStatusResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(stream.api.live.GetProjectBroadcastStatusResponse other) {
      if (other == stream.api.live.GetProjectBroadcastStatusResponse.getDefaultInstance()) return this;
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
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
      stream.api.live.GetProjectBroadcastStatusResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (stream.api.live.GetProjectBroadcastStatusResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private stream.api.live.ProjectBroadcastStatus status_;
    private com.google.protobuf.SingleFieldBuilderV3<
        stream.api.live.ProjectBroadcastStatus, stream.api.live.ProjectBroadcastStatus.Builder, stream.api.live.ProjectBroadcastStatusOrBuilder> statusBuilder_;
    /**
     * <pre>
     * the status of the project broadcast
     * </pre>
     *
     * <code>.live.v21.ProjectBroadcastStatus status = 1 [json_name = "status"];</code>
     * @return Whether the status field is set.
     */
    public boolean hasStatus() {
      return statusBuilder_ != null || status_ != null;
    }
    /**
     * <pre>
     * the status of the project broadcast
     * </pre>
     *
     * <code>.live.v21.ProjectBroadcastStatus status = 1 [json_name = "status"];</code>
     * @return The status.
     */
    public stream.api.live.ProjectBroadcastStatus getStatus() {
      if (statusBuilder_ == null) {
        return status_ == null ? stream.api.live.ProjectBroadcastStatus.getDefaultInstance() : status_;
      } else {
        return statusBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * the status of the project broadcast
     * </pre>
     *
     * <code>.live.v21.ProjectBroadcastStatus status = 1 [json_name = "status"];</code>
     */
    public Builder setStatus(stream.api.live.ProjectBroadcastStatus value) {
      if (statusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        status_ = value;
        onChanged();
      } else {
        statusBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * the status of the project broadcast
     * </pre>
     *
     * <code>.live.v21.ProjectBroadcastStatus status = 1 [json_name = "status"];</code>
     */
    public Builder setStatus(
        stream.api.live.ProjectBroadcastStatus.Builder builderForValue) {
      if (statusBuilder_ == null) {
        status_ = builderForValue.build();
        onChanged();
      } else {
        statusBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * the status of the project broadcast
     * </pre>
     *
     * <code>.live.v21.ProjectBroadcastStatus status = 1 [json_name = "status"];</code>
     */
    public Builder mergeStatus(stream.api.live.ProjectBroadcastStatus value) {
      if (statusBuilder_ == null) {
        if (status_ != null) {
          status_ =
            stream.api.live.ProjectBroadcastStatus.newBuilder(status_).mergeFrom(value).buildPartial();
        } else {
          status_ = value;
        }
        onChanged();
      } else {
        statusBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * the status of the project broadcast
     * </pre>
     *
     * <code>.live.v21.ProjectBroadcastStatus status = 1 [json_name = "status"];</code>
     */
    public Builder clearStatus() {
      if (statusBuilder_ == null) {
        status_ = null;
        onChanged();
      } else {
        status_ = null;
        statusBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * the status of the project broadcast
     * </pre>
     *
     * <code>.live.v21.ProjectBroadcastStatus status = 1 [json_name = "status"];</code>
     */
    public stream.api.live.ProjectBroadcastStatus.Builder getStatusBuilder() {
      
      onChanged();
      return getStatusFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * the status of the project broadcast
     * </pre>
     *
     * <code>.live.v21.ProjectBroadcastStatus status = 1 [json_name = "status"];</code>
     */
    public stream.api.live.ProjectBroadcastStatusOrBuilder getStatusOrBuilder() {
      if (statusBuilder_ != null) {
        return statusBuilder_.getMessageOrBuilder();
      } else {
        return status_ == null ?
            stream.api.live.ProjectBroadcastStatus.getDefaultInstance() : status_;
      }
    }
    /**
     * <pre>
     * the status of the project broadcast
     * </pre>
     *
     * <code>.live.v21.ProjectBroadcastStatus status = 1 [json_name = "status"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        stream.api.live.ProjectBroadcastStatus, stream.api.live.ProjectBroadcastStatus.Builder, stream.api.live.ProjectBroadcastStatusOrBuilder> 
        getStatusFieldBuilder() {
      if (statusBuilder_ == null) {
        statusBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            stream.api.live.ProjectBroadcastStatus, stream.api.live.ProjectBroadcastStatus.Builder, stream.api.live.ProjectBroadcastStatusOrBuilder>(
                getStatus(),
                getParentForChildren(),
                isClean());
        status_ = null;
      }
      return statusBuilder_;
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


    // @@protoc_insertion_point(builder_scope:live.v21.GetProjectBroadcastStatusResponse)
  }

  // @@protoc_insertion_point(class_scope:live.v21.GetProjectBroadcastStatusResponse)
  private static final stream.api.live.GetProjectBroadcastStatusResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new stream.api.live.GetProjectBroadcastStatusResponse();
  }

  public static stream.api.live.GetProjectBroadcastStatusResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetProjectBroadcastStatusResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetProjectBroadcastStatusResponse>() {
    @java.lang.Override
    public GetProjectBroadcastStatusResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetProjectBroadcastStatusResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetProjectBroadcastStatusResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetProjectBroadcastStatusResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public stream.api.live.GetProjectBroadcastStatusResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


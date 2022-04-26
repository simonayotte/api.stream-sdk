/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

/**
 * Protobuf type {@code live.v21.UpdateProjectResponse}
 */
public final class UpdateProjectResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:live.v21.UpdateProjectResponse)
    UpdateProjectResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateProjectResponse.newBuilder() to construct.
  private UpdateProjectResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateProjectResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateProjectResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateProjectResponse(
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
            stream.api.live.Project.Builder subBuilder = null;
            if (project_ != null) {
              subBuilder = project_.toBuilder();
            }
            project_ = input.readMessage(stream.api.live.Project.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(project_);
              project_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            broadcastUpdated_ = input.readBool();
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
    return stream.api.live.Api.internal_static_live_v21_UpdateProjectResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return stream.api.live.Api.internal_static_live_v21_UpdateProjectResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            stream.api.live.UpdateProjectResponse.class, stream.api.live.UpdateProjectResponse.Builder.class);
  }

  public static final int PROJECT_FIELD_NUMBER = 1;
  private stream.api.live.Project project_;
  /**
   * <pre>
   * updated project
   * </pre>
   *
   * <code>.live.v21.Project project = 1 [json_name = "project"];</code>
   * @return Whether the project field is set.
   */
  @java.lang.Override
  public boolean hasProject() {
    return project_ != null;
  }
  /**
   * <pre>
   * updated project
   * </pre>
   *
   * <code>.live.v21.Project project = 1 [json_name = "project"];</code>
   * @return The project.
   */
  @java.lang.Override
  public stream.api.live.Project getProject() {
    return project_ == null ? stream.api.live.Project.getDefaultInstance() : project_;
  }
  /**
   * <pre>
   * updated project
   * </pre>
   *
   * <code>.live.v21.Project project = 1 [json_name = "project"];</code>
   */
  @java.lang.Override
  public stream.api.live.ProjectOrBuilder getProjectOrBuilder() {
    return getProject();
  }

  public static final int BROADCAST_UPDATED_FIELD_NUMBER = 2;
  private boolean broadcastUpdated_;
  /**
   * <pre>
   * indicates whether the broadcast was updated as a function of this request
   * </pre>
   *
   * <code>bool broadcast_updated = 2 [json_name = "broadcastUpdated", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The broadcastUpdated.
   */
  @java.lang.Override
  public boolean getBroadcastUpdated() {
    return broadcastUpdated_;
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
    if (project_ != null) {
      output.writeMessage(1, getProject());
    }
    if (broadcastUpdated_ != false) {
      output.writeBool(2, broadcastUpdated_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (project_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getProject());
    }
    if (broadcastUpdated_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, broadcastUpdated_);
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
    if (!(obj instanceof stream.api.live.UpdateProjectResponse)) {
      return super.equals(obj);
    }
    stream.api.live.UpdateProjectResponse other = (stream.api.live.UpdateProjectResponse) obj;

    if (hasProject() != other.hasProject()) return false;
    if (hasProject()) {
      if (!getProject()
          .equals(other.getProject())) return false;
    }
    if (getBroadcastUpdated()
        != other.getBroadcastUpdated()) return false;
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
    if (hasProject()) {
      hash = (37 * hash) + PROJECT_FIELD_NUMBER;
      hash = (53 * hash) + getProject().hashCode();
    }
    hash = (37 * hash) + BROADCAST_UPDATED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getBroadcastUpdated());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static stream.api.live.UpdateProjectResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.UpdateProjectResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.UpdateProjectResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.UpdateProjectResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.UpdateProjectResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static stream.api.live.UpdateProjectResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static stream.api.live.UpdateProjectResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.live.UpdateProjectResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.live.UpdateProjectResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static stream.api.live.UpdateProjectResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static stream.api.live.UpdateProjectResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static stream.api.live.UpdateProjectResponse parseFrom(
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
  public static Builder newBuilder(stream.api.live.UpdateProjectResponse prototype) {
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
   * Protobuf type {@code live.v21.UpdateProjectResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:live.v21.UpdateProjectResponse)
      stream.api.live.UpdateProjectResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return stream.api.live.Api.internal_static_live_v21_UpdateProjectResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return stream.api.live.Api.internal_static_live_v21_UpdateProjectResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              stream.api.live.UpdateProjectResponse.class, stream.api.live.UpdateProjectResponse.Builder.class);
    }

    // Construct using stream.api.live.UpdateProjectResponse.newBuilder()
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
      if (projectBuilder_ == null) {
        project_ = null;
      } else {
        project_ = null;
        projectBuilder_ = null;
      }
      broadcastUpdated_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return stream.api.live.Api.internal_static_live_v21_UpdateProjectResponse_descriptor;
    }

    @java.lang.Override
    public stream.api.live.UpdateProjectResponse getDefaultInstanceForType() {
      return stream.api.live.UpdateProjectResponse.getDefaultInstance();
    }

    @java.lang.Override
    public stream.api.live.UpdateProjectResponse build() {
      stream.api.live.UpdateProjectResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public stream.api.live.UpdateProjectResponse buildPartial() {
      stream.api.live.UpdateProjectResponse result = new stream.api.live.UpdateProjectResponse(this);
      if (projectBuilder_ == null) {
        result.project_ = project_;
      } else {
        result.project_ = projectBuilder_.build();
      }
      result.broadcastUpdated_ = broadcastUpdated_;
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
      if (other instanceof stream.api.live.UpdateProjectResponse) {
        return mergeFrom((stream.api.live.UpdateProjectResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(stream.api.live.UpdateProjectResponse other) {
      if (other == stream.api.live.UpdateProjectResponse.getDefaultInstance()) return this;
      if (other.hasProject()) {
        mergeProject(other.getProject());
      }
      if (other.getBroadcastUpdated() != false) {
        setBroadcastUpdated(other.getBroadcastUpdated());
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
      stream.api.live.UpdateProjectResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (stream.api.live.UpdateProjectResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private stream.api.live.Project project_;
    private com.google.protobuf.SingleFieldBuilderV3<
        stream.api.live.Project, stream.api.live.Project.Builder, stream.api.live.ProjectOrBuilder> projectBuilder_;
    /**
     * <pre>
     * updated project
     * </pre>
     *
     * <code>.live.v21.Project project = 1 [json_name = "project"];</code>
     * @return Whether the project field is set.
     */
    public boolean hasProject() {
      return projectBuilder_ != null || project_ != null;
    }
    /**
     * <pre>
     * updated project
     * </pre>
     *
     * <code>.live.v21.Project project = 1 [json_name = "project"];</code>
     * @return The project.
     */
    public stream.api.live.Project getProject() {
      if (projectBuilder_ == null) {
        return project_ == null ? stream.api.live.Project.getDefaultInstance() : project_;
      } else {
        return projectBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * updated project
     * </pre>
     *
     * <code>.live.v21.Project project = 1 [json_name = "project"];</code>
     */
    public Builder setProject(stream.api.live.Project value) {
      if (projectBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        project_ = value;
        onChanged();
      } else {
        projectBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * updated project
     * </pre>
     *
     * <code>.live.v21.Project project = 1 [json_name = "project"];</code>
     */
    public Builder setProject(
        stream.api.live.Project.Builder builderForValue) {
      if (projectBuilder_ == null) {
        project_ = builderForValue.build();
        onChanged();
      } else {
        projectBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * updated project
     * </pre>
     *
     * <code>.live.v21.Project project = 1 [json_name = "project"];</code>
     */
    public Builder mergeProject(stream.api.live.Project value) {
      if (projectBuilder_ == null) {
        if (project_ != null) {
          project_ =
            stream.api.live.Project.newBuilder(project_).mergeFrom(value).buildPartial();
        } else {
          project_ = value;
        }
        onChanged();
      } else {
        projectBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * updated project
     * </pre>
     *
     * <code>.live.v21.Project project = 1 [json_name = "project"];</code>
     */
    public Builder clearProject() {
      if (projectBuilder_ == null) {
        project_ = null;
        onChanged();
      } else {
        project_ = null;
        projectBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * updated project
     * </pre>
     *
     * <code>.live.v21.Project project = 1 [json_name = "project"];</code>
     */
    public stream.api.live.Project.Builder getProjectBuilder() {
      
      onChanged();
      return getProjectFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * updated project
     * </pre>
     *
     * <code>.live.v21.Project project = 1 [json_name = "project"];</code>
     */
    public stream.api.live.ProjectOrBuilder getProjectOrBuilder() {
      if (projectBuilder_ != null) {
        return projectBuilder_.getMessageOrBuilder();
      } else {
        return project_ == null ?
            stream.api.live.Project.getDefaultInstance() : project_;
      }
    }
    /**
     * <pre>
     * updated project
     * </pre>
     *
     * <code>.live.v21.Project project = 1 [json_name = "project"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        stream.api.live.Project, stream.api.live.Project.Builder, stream.api.live.ProjectOrBuilder> 
        getProjectFieldBuilder() {
      if (projectBuilder_ == null) {
        projectBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            stream.api.live.Project, stream.api.live.Project.Builder, stream.api.live.ProjectOrBuilder>(
                getProject(),
                getParentForChildren(),
                isClean());
        project_ = null;
      }
      return projectBuilder_;
    }

    private boolean broadcastUpdated_ ;
    /**
     * <pre>
     * indicates whether the broadcast was updated as a function of this request
     * </pre>
     *
     * <code>bool broadcast_updated = 2 [json_name = "broadcastUpdated", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The broadcastUpdated.
     */
    @java.lang.Override
    public boolean getBroadcastUpdated() {
      return broadcastUpdated_;
    }
    /**
     * <pre>
     * indicates whether the broadcast was updated as a function of this request
     * </pre>
     *
     * <code>bool broadcast_updated = 2 [json_name = "broadcastUpdated", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The broadcastUpdated to set.
     * @return This builder for chaining.
     */
    public Builder setBroadcastUpdated(boolean value) {
      
      broadcastUpdated_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * indicates whether the broadcast was updated as a function of this request
     * </pre>
     *
     * <code>bool broadcast_updated = 2 [json_name = "broadcastUpdated", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearBroadcastUpdated() {
      
      broadcastUpdated_ = false;
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


    // @@protoc_insertion_point(builder_scope:live.v21.UpdateProjectResponse)
  }

  // @@protoc_insertion_point(class_scope:live.v21.UpdateProjectResponse)
  private static final stream.api.live.UpdateProjectResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new stream.api.live.UpdateProjectResponse();
  }

  public static stream.api.live.UpdateProjectResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateProjectResponse>
      PARSER = new com.google.protobuf.AbstractParser<UpdateProjectResponse>() {
    @java.lang.Override
    public UpdateProjectResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateProjectResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateProjectResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateProjectResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public stream.api.live.UpdateProjectResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

public interface DestinationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:live.v21.Destination)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * collection which owns the project which owns the destination
   * </pre>
   *
   * <code>string collection_id = 1 [json_name = "collectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The collectionId.
   */
  java.lang.String getCollectionId();
  /**
   * <pre>
   * collection which owns the project which owns the destination
   * </pre>
   *
   * <code>string collection_id = 1 [json_name = "collectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for collectionId.
   */
  com.google.protobuf.ByteString
      getCollectionIdBytes();

  /**
   * <pre>
   * project which owns the destination
   * </pre>
   *
   * <code>string project_id = 2 [json_name = "projectId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <pre>
   * project which owns the destination
   * </pre>
   *
   * <code>string project_id = 2 [json_name = "projectId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * destination id
   * </pre>
   *
   * <code>string destination_id = 3 [json_name = "destinationId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The destinationId.
   */
  java.lang.String getDestinationId();
  /**
   * <pre>
   * destination id
   * </pre>
   *
   * <code>string destination_id = 3 [json_name = "destinationId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for destinationId.
   */
  com.google.protobuf.ByteString
      getDestinationIdBytes();

  /**
   * <pre>
   * arbitrary metadata associated with this destination
   * </pre>
   *
   * <code>optional .google.protobuf.Value metadata = 4 [json_name = "metadata", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <pre>
   * arbitrary metadata associated with this destination
   * </pre>
   *
   * <code>optional .google.protobuf.Value metadata = 4 [json_name = "metadata", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The metadata.
   */
  com.google.protobuf.Value getMetadata();
  /**
   * <pre>
   * arbitrary metadata associated with this destination
   * </pre>
   *
   * <code>optional .google.protobuf.Value metadata = 4 [json_name = "metadata", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   */
  com.google.protobuf.ValueOrBuilder getMetadataOrBuilder();

  /**
   * <pre>
   * is output stream enabled?
   * </pre>
   *
   * <code>optional bool enabled = 5 [json_name = "enabled", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the enabled field is set.
   */
  boolean hasEnabled();
  /**
   * <pre>
   * is output stream enabled?
   * </pre>
   *
   * <code>optional bool enabled = 5 [json_name = "enabled", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The enabled.
   */
  boolean getEnabled();

  /**
   * <pre>
   * address of the destination
   * </pre>
   *
   * <code>.live.v21.DestinationAddress address = 6 [json_name = "address"];</code>
   * @return Whether the address field is set.
   */
  boolean hasAddress();
  /**
   * <pre>
   * address of the destination
   * </pre>
   *
   * <code>.live.v21.DestinationAddress address = 6 [json_name = "address"];</code>
   * @return The address.
   */
  stream.api.live.DestinationAddress getAddress();
  /**
   * <pre>
   * address of the destination
   * </pre>
   *
   * <code>.live.v21.DestinationAddress address = 6 [json_name = "address"];</code>
   */
  stream.api.live.DestinationAddressOrBuilder getAddressOrBuilder();

  /**
   * <pre>
   * timeout (ms) to wait before resetting a connection
   * </pre>
   *
   * <code>optional uint32 timeout = 7 [json_name = "timeout", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the timeout field is set.
   */
  boolean hasTimeout();
  /**
   * <pre>
   * timeout (ms) to wait before resetting a connection
   * </pre>
   *
   * <code>optional uint32 timeout = 7 [json_name = "timeout", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The timeout.
   */
  int getTimeout();
}

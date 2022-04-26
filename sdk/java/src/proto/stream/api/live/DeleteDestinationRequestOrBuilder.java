/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

public interface DeleteDestinationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:live.v21.DeleteDestinationRequest)
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
   * forcibly remove destination if enabled
   * </pre>
   *
   * <code>optional bool force = 4 [json_name = "force", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the force field is set.
   */
  boolean hasForce();
  /**
   * <pre>
   * forcibly remove destination if enabled
   * </pre>
   *
   * <code>optional bool force = 4 [json_name = "force", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The force.
   */
  boolean getForce();
}

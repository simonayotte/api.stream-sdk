/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

public interface StopProjectBroadcastRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:live.v21.StopProjectBroadcastRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * collection which owns the project
   * </pre>
   *
   * <code>string collection_id = 1 [json_name = "collectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The collectionId.
   */
  java.lang.String getCollectionId();
  /**
   * <pre>
   * collection which owns the project
   * </pre>
   *
   * <code>string collection_id = 1 [json_name = "collectionId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for collectionId.
   */
  com.google.protobuf.ByteString
      getCollectionIdBytes();

  /**
   * <pre>
   * project id
   * </pre>
   *
   * <code>string project_id = 2 [json_name = "projectId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <pre>
   * project id
   * </pre>
   *
   * <code>string project_id = 2 [json_name = "projectId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * stop the associated webrtc room,
   * </pre>
   *
   * <code>optional bool webrtc_stop = 3 [json_name = "webrtcStop", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the webrtcStop field is set.
   */
  boolean hasWebrtcStop();
  /**
   * <pre>
   * stop the associated webrtc room,
   * </pre>
   *
   * <code>optional bool webrtc_stop = 3 [json_name = "webrtcStop", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The webrtcStop.
   */
  boolean getWebrtcStop();
}

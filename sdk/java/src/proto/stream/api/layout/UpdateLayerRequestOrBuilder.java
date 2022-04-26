/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apis/layout/v2/api.proto

package stream.api.layout;

public interface UpdateLayerRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:apis.layout.v2.UpdateLayerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the id of the Layout
   * </pre>
   *
   * <code>string layout_id = 1 [json_name = "layoutId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The layoutId.
   */
  java.lang.String getLayoutId();
  /**
   * <pre>
   * the id of the Layout
   * </pre>
   *
   * <code>string layout_id = 1 [json_name = "layoutId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for layoutId.
   */
  com.google.protobuf.ByteString
      getLayoutIdBytes();

  /**
   * <pre>
   * the id of the Layer
   * </pre>
   *
   * <code>string layer_id = 2 [json_name = "layerId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The layerId.
   */
  java.lang.String getLayerId();
  /**
   * <pre>
   * the id of the Layer
   * </pre>
   *
   * <code>string layer_id = 2 [json_name = "layerId", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for layerId.
   */
  com.google.protobuf.ByteString
      getLayerIdBytes();

  /**
   * <pre>
   * layer data to update with.
   * </pre>
   *
   * <code>.apis.layout.v2.PartialLayer layer = 3 [json_name = "layer", (.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the layer field is set.
   */
  boolean hasLayer();
  /**
   * <pre>
   * layer data to update with.
   * </pre>
   *
   * <code>.apis.layout.v2.PartialLayer layer = 3 [json_name = "layer", (.google.api.field_behavior) = REQUIRED];</code>
   * @return The layer.
   */
  stream.api.layout.PartialLayer getLayer();
  /**
   * <pre>
   * layer data to update with.
   * </pre>
   *
   * <code>.apis.layout.v2.PartialLayer layer = 3 [json_name = "layer", (.google.api.field_behavior) = REQUIRED];</code>
   */
  stream.api.layout.PartialLayerOrBuilder getLayerOrBuilder();
}

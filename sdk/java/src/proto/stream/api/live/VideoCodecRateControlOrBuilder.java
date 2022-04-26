/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

public interface VideoCodecRateControlOrBuilder extends
    // @@protoc_insertion_point(interface_extends:live.v21.VideoCodecRateControl)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .live.v21.VideoCodecRateControlMode mode = 1 [json_name = "mode", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the mode field is set.
   */
  boolean hasMode();
  /**
   * <code>optional .live.v21.VideoCodecRateControlMode mode = 1 [json_name = "mode", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The enum numeric value on the wire for mode.
   */
  int getModeValue();
  /**
   * <code>optional .live.v21.VideoCodecRateControlMode mode = 1 [json_name = "mode", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The mode.
   */
  stream.api.live.VideoCodecRateControlMode getMode();

  /**
   * <pre>
   * video encoding target bitrate (bits/s)
   * </pre>
   *
   * <code>optional uint32 target_bitrate = 2 [json_name = "targetBitrate", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the targetBitrate field is set.
   */
  boolean hasTargetBitrate();
  /**
   * <pre>
   * video encoding target bitrate (bits/s)
   * </pre>
   *
   * <code>optional uint32 target_bitrate = 2 [json_name = "targetBitrate", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The targetBitrate.
   */
  int getTargetBitrate();

  /**
   * <pre>
   * maximum video encoding key frame interval (frames)
   * </pre>
   *
   * <code>optional uint32 max_key_frame_interval = 3 [json_name = "maxKeyFrameInterval", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return Whether the maxKeyFrameInterval field is set.
   */
  boolean hasMaxKeyFrameInterval();
  /**
   * <pre>
   * maximum video encoding key frame interval (frames)
   * </pre>
   *
   * <code>optional uint32 max_key_frame_interval = 3 [json_name = "maxKeyFrameInterval", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The maxKeyFrameInterval.
   */
  int getMaxKeyFrameInterval();
}

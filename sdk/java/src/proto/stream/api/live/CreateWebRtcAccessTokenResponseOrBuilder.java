/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

public interface CreateWebRtcAccessTokenResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:live.v21.CreateWebRtcAccessTokenResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the webrtc token parameters
   * </pre>
   *
   * <code>.live.v21.WebRtcAccess webrtc_access = 2 [json_name = "webrtcAccess"];</code>
   * @return Whether the webrtcAccess field is set.
   */
  boolean hasWebrtcAccess();
  /**
   * <pre>
   * the webrtc token parameters
   * </pre>
   *
   * <code>.live.v21.WebRtcAccess webrtc_access = 2 [json_name = "webrtcAccess"];</code>
   * @return The webrtcAccess.
   */
  stream.api.live.WebRtcAccess getWebrtcAccess();
  /**
   * <pre>
   * the webrtc token parameters
   * </pre>
   *
   * <code>.live.v21.WebRtcAccess webrtc_access = 2 [json_name = "webrtcAccess"];</code>
   */
  stream.api.live.WebRtcAccessOrBuilder getWebrtcAccessOrBuilder();
}

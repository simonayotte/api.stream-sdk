/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

public interface DestinationEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:live.v21.DestinationEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.live.v21.DestinationCreateEvent create = 1 [json_name = "create"];</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <code>.live.v21.DestinationCreateEvent create = 1 [json_name = "create"];</code>
   * @return The create.
   */
  stream.api.live.DestinationCreateEvent getCreate();
  /**
   * <code>.live.v21.DestinationCreateEvent create = 1 [json_name = "create"];</code>
   */
  stream.api.live.DestinationCreateEventOrBuilder getCreateOrBuilder();

  /**
   * <code>.live.v21.DestinationUpdateEvent update = 2 [json_name = "update"];</code>
   * @return Whether the update field is set.
   */
  boolean hasUpdate();
  /**
   * <code>.live.v21.DestinationUpdateEvent update = 2 [json_name = "update"];</code>
   * @return The update.
   */
  stream.api.live.DestinationUpdateEvent getUpdate();
  /**
   * <code>.live.v21.DestinationUpdateEvent update = 2 [json_name = "update"];</code>
   */
  stream.api.live.DestinationUpdateEventOrBuilder getUpdateOrBuilder();

  /**
   * <code>.live.v21.DestinationDeleteEvent delete = 3 [json_name = "delete"];</code>
   * @return Whether the delete field is set.
   */
  boolean hasDelete();
  /**
   * <code>.live.v21.DestinationDeleteEvent delete = 3 [json_name = "delete"];</code>
   * @return The delete.
   */
  stream.api.live.DestinationDeleteEvent getDelete();
  /**
   * <code>.live.v21.DestinationDeleteEvent delete = 3 [json_name = "delete"];</code>
   */
  stream.api.live.DestinationDeleteEventOrBuilder getDeleteOrBuilder();

  /**
   * <code>.live.v21.DestinationStateEvent state = 4 [json_name = "state"];</code>
   * @return Whether the state field is set.
   */
  boolean hasState();
  /**
   * <code>.live.v21.DestinationStateEvent state = 4 [json_name = "state"];</code>
   * @return The state.
   */
  stream.api.live.DestinationStateEvent getState();
  /**
   * <code>.live.v21.DestinationStateEvent state = 4 [json_name = "state"];</code>
   */
  stream.api.live.DestinationStateEventOrBuilder getStateOrBuilder();

  public stream.api.live.DestinationEvent.TypeCase getTypeCase();
}

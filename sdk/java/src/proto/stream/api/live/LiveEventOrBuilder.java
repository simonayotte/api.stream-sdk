/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

public interface LiveEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:live.v21.LiveEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.live.v21.CollectionEvent collection = 1 [json_name = "collection"];</code>
   * @return Whether the collection field is set.
   */
  boolean hasCollection();
  /**
   * <code>.live.v21.CollectionEvent collection = 1 [json_name = "collection"];</code>
   * @return The collection.
   */
  stream.api.live.CollectionEvent getCollection();
  /**
   * <code>.live.v21.CollectionEvent collection = 1 [json_name = "collection"];</code>
   */
  stream.api.live.CollectionEventOrBuilder getCollectionOrBuilder();

  /**
   * <code>.live.v21.DestinationEvent destination = 2 [json_name = "destination"];</code>
   * @return Whether the destination field is set.
   */
  boolean hasDestination();
  /**
   * <code>.live.v21.DestinationEvent destination = 2 [json_name = "destination"];</code>
   * @return The destination.
   */
  stream.api.live.DestinationEvent getDestination();
  /**
   * <code>.live.v21.DestinationEvent destination = 2 [json_name = "destination"];</code>
   */
  stream.api.live.DestinationEventOrBuilder getDestinationOrBuilder();

  /**
   * <code>.live.v21.ProjectEvent project = 3 [json_name = "project"];</code>
   * @return Whether the project field is set.
   */
  boolean hasProject();
  /**
   * <code>.live.v21.ProjectEvent project = 3 [json_name = "project"];</code>
   * @return The project.
   */
  stream.api.live.ProjectEvent getProject();
  /**
   * <code>.live.v21.ProjectEvent project = 3 [json_name = "project"];</code>
   */
  stream.api.live.ProjectEventOrBuilder getProjectOrBuilder();

  /**
   * <code>.live.v21.SourceEvent source = 4 [json_name = "source"];</code>
   * @return Whether the source field is set.
   */
  boolean hasSource();
  /**
   * <code>.live.v21.SourceEvent source = 4 [json_name = "source"];</code>
   * @return The source.
   */
  stream.api.live.SourceEvent getSource();
  /**
   * <code>.live.v21.SourceEvent source = 4 [json_name = "source"];</code>
   */
  stream.api.live.SourceEventOrBuilder getSourceOrBuilder();

  /**
   * <code>.google.protobuf.NullValue unspecified = 5 [json_name = "unspecified"];</code>
   * @return Whether the unspecified field is set.
   */
  boolean hasUnspecified();
  /**
   * <code>.google.protobuf.NullValue unspecified = 5 [json_name = "unspecified"];</code>
   * @return The enum numeric value on the wire for unspecified.
   */
  int getUnspecifiedValue();
  /**
   * <code>.google.protobuf.NullValue unspecified = 5 [json_name = "unspecified"];</code>
   * @return The unspecified.
   */
  com.google.protobuf.NullValue getUnspecified();

  public stream.api.live.LiveEvent.TypeCase getTypeCase();
}

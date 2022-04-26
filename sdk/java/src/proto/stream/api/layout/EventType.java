/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: apis/layout/v2/api.proto

package stream.api.layout;

/**
 * Protobuf enum {@code apis.layout.v2.EventType}
 */
public enum EventType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>EVENT_TYPE_UNSPECIFIED = 0;</code>
   */
  EVENT_TYPE_UNSPECIFIED(0),
  /**
   * <code>EVENT_TYPE_LAYOUT = 1;</code>
   */
  EVENT_TYPE_LAYOUT(1),
  /**
   * <code>EVENT_TYPE_LAYER = 2;</code>
   */
  EVENT_TYPE_LAYER(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>EVENT_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int EVENT_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <code>EVENT_TYPE_LAYOUT = 1;</code>
   */
  public static final int EVENT_TYPE_LAYOUT_VALUE = 1;
  /**
   * <code>EVENT_TYPE_LAYER = 2;</code>
   */
  public static final int EVENT_TYPE_LAYER_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static EventType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static EventType forNumber(int value) {
    switch (value) {
      case 0: return EVENT_TYPE_UNSPECIFIED;
      case 1: return EVENT_TYPE_LAYOUT;
      case 2: return EVENT_TYPE_LAYER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EventType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      EventType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EventType>() {
          public EventType findValueByNumber(int number) {
            return EventType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return stream.api.layout.Api.getDescriptor().getEnumTypes().get(3);
  }

  private static final EventType[] VALUES = values();

  public static EventType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private EventType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:apis.layout.v2.EventType)
}


/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/v21/api.proto

package stream.api.live;

/**
 * <pre>
 * rendering quality
 * </pre>
 *
 * Protobuf enum {@code live.v21.RenderingQuality}
 */
public enum RenderingQuality
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>RENDERING_QUALITY_UNSPECIFIED = 0;</code>
   */
  RENDERING_QUALITY_UNSPECIFIED(0),
  /**
   * <code>RENDERING_QUALITY_STANDARD = 1;</code>
   */
  RENDERING_QUALITY_STANDARD(1),
  /**
   * <code>RENDERING_QUALITY_HIGH = 2;</code>
   */
  RENDERING_QUALITY_HIGH(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>RENDERING_QUALITY_UNSPECIFIED = 0;</code>
   */
  public static final int RENDERING_QUALITY_UNSPECIFIED_VALUE = 0;
  /**
   * <code>RENDERING_QUALITY_STANDARD = 1;</code>
   */
  public static final int RENDERING_QUALITY_STANDARD_VALUE = 1;
  /**
   * <code>RENDERING_QUALITY_HIGH = 2;</code>
   */
  public static final int RENDERING_QUALITY_HIGH_VALUE = 2;


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
  public static RenderingQuality valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static RenderingQuality forNumber(int value) {
    switch (value) {
      case 0: return RENDERING_QUALITY_UNSPECIFIED;
      case 1: return RENDERING_QUALITY_STANDARD;
      case 2: return RENDERING_QUALITY_HIGH;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RenderingQuality>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      RenderingQuality> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<RenderingQuality>() {
          public RenderingQuality findValueByNumber(int number) {
            return RenderingQuality.forNumber(number);
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
    return stream.api.live.Api.getDescriptor().getEnumTypes().get(3);
  }

  private static final RenderingQuality[] VALUES = values();

  public static RenderingQuality valueOf(
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

  private RenderingQuality(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:live.v21.RenderingQuality)
}


/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
/* eslint-disable */

export const protobufPackage = "google.api";

/**
 * An indicator of the behavior of a given field (for example, that a field
 * is required in requests, or given as output but ignored as input).
 * This **does not** change the behavior in protocol buffers itself; it only
 * denotes the behavior and may affect how API tooling handles the field.
 *
 * Note: This enum **may** receive new values in the future.
 */
export enum FieldBehavior {
  /** FIELD_BEHAVIOR_UNSPECIFIED - Conventional default for enums. Do not use this. */
  FIELD_BEHAVIOR_UNSPECIFIED = "FIELD_BEHAVIOR_UNSPECIFIED",
  /**
   * OPTIONAL - Specifically denotes a field as optional.
   * While all fields in protocol buffers are optional, this may be specified
   * for emphasis if appropriate.
   */
  OPTIONAL = "OPTIONAL",
  /**
   * REQUIRED - Denotes a field as required.
   * This indicates that the field **must** be provided as part of the request,
   * and failure to do so will cause an error (usually `INVALID_ARGUMENT`).
   */
  REQUIRED = "REQUIRED",
  /**
   * OUTPUT_ONLY - Denotes a field as output only.
   * This indicates that the field is provided in responses, but including the
   * field in a request does nothing (the server *must* ignore it and
   * *must not* throw an error as a result of the field's presence).
   */
  OUTPUT_ONLY = "OUTPUT_ONLY",
  /**
   * INPUT_ONLY - Denotes a field as input only.
   * This indicates that the field is provided in requests, and the
   * corresponding field is not included in output.
   */
  INPUT_ONLY = "INPUT_ONLY",
  /**
   * IMMUTABLE - Denotes a field as immutable.
   * This indicates that the field may be set once in a request to create a
   * resource, but may not be changed thereafter.
   */
  IMMUTABLE = "IMMUTABLE",
  /**
   * UNORDERED_LIST - Denotes that a (repeated) field is an unordered list.
   * This indicates that the service may provide the elements of the list
   * in any arbitrary  order, rather than the order the user originally
   * provided. Additionally, the list's order may or may not be stable.
   */
  UNORDERED_LIST = "UNORDERED_LIST",
  /**
   * NON_EMPTY_DEFAULT - Denotes that this field returns a non-empty default value if not set.
   * This indicates that if the user provides the empty value in a request,
   * a non-empty value will be returned. The user will not be aware of what
   * non-empty value to expect.
   */
  NON_EMPTY_DEFAULT = "NON_EMPTY_DEFAULT",
}

export function fieldBehaviorFromJSON(object: any): FieldBehavior {
  switch (object) {
    case 0:
    case "FIELD_BEHAVIOR_UNSPECIFIED":
      return FieldBehavior.FIELD_BEHAVIOR_UNSPECIFIED;
    case 1:
    case "OPTIONAL":
      return FieldBehavior.OPTIONAL;
    case 2:
    case "REQUIRED":
      return FieldBehavior.REQUIRED;
    case 3:
    case "OUTPUT_ONLY":
      return FieldBehavior.OUTPUT_ONLY;
    case 4:
    case "INPUT_ONLY":
      return FieldBehavior.INPUT_ONLY;
    case 5:
    case "IMMUTABLE":
      return FieldBehavior.IMMUTABLE;
    case 6:
    case "UNORDERED_LIST":
      return FieldBehavior.UNORDERED_LIST;
    case 7:
    case "NON_EMPTY_DEFAULT":
      return FieldBehavior.NON_EMPTY_DEFAULT;
    default:
      throw new globalThis.Error("Unrecognized enum value " + object + " for enum FieldBehavior");
  }
}

export function fieldBehaviorToJSON(object: FieldBehavior): string {
  switch (object) {
    case FieldBehavior.FIELD_BEHAVIOR_UNSPECIFIED:
      return "FIELD_BEHAVIOR_UNSPECIFIED";
    case FieldBehavior.OPTIONAL:
      return "OPTIONAL";
    case FieldBehavior.REQUIRED:
      return "REQUIRED";
    case FieldBehavior.OUTPUT_ONLY:
      return "OUTPUT_ONLY";
    case FieldBehavior.INPUT_ONLY:
      return "INPUT_ONLY";
    case FieldBehavior.IMMUTABLE:
      return "IMMUTABLE";
    case FieldBehavior.UNORDERED_LIST:
      return "UNORDERED_LIST";
    case FieldBehavior.NON_EMPTY_DEFAULT:
      return "NON_EMPTY_DEFAULT";
    default:
      throw new globalThis.Error("Unrecognized enum value " + object + " for enum FieldBehavior");
  }
}

export function fieldBehaviorToNumber(object: FieldBehavior): number {
  switch (object) {
    case FieldBehavior.FIELD_BEHAVIOR_UNSPECIFIED:
      return 0;
    case FieldBehavior.OPTIONAL:
      return 1;
    case FieldBehavior.REQUIRED:
      return 2;
    case FieldBehavior.OUTPUT_ONLY:
      return 3;
    case FieldBehavior.INPUT_ONLY:
      return 4;
    case FieldBehavior.IMMUTABLE:
      return 5;
    case FieldBehavior.UNORDERED_LIST:
      return 6;
    case FieldBehavior.NON_EMPTY_DEFAULT:
      return 7;
    default:
      throw new globalThis.Error("Unrecognized enum value " + object + " for enum FieldBehavior");
  }
}

declare var self: any | undefined;
declare var window: any | undefined;
declare var global: any | undefined;
var globalThis: any = (() => {
  if (typeof globalThis !== "undefined") {
    return globalThis;
  }
  if (typeof self !== "undefined") {
    return self;
  }
  if (typeof window !== "undefined") {
    return window;
  }
  if (typeof global !== "undefined") {
    return global;
  }
  throw "Unable to locate global object";
})();

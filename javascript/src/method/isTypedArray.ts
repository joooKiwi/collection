/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {TypedArray} from "../CollectionHolder.types"

/**
 * Tell that the value is a {@link TypedArray}
 * ({@link Int8Array byte}, {@link Uint8Array ubyte}, {@link Uint8ClampedArray ubyte-clamped},
 * {@link Int16Array short}, {@link Uint16Array ushort},
 * {@link Int32Array long}, {@link Uint32Array ulong},
 * {@link Float32Array float}, {@link Float64Array double},
 * {@link BigInt64Array bigint} or {@link BigUint64Array ubigint} array)
 *
 * @param value The value to identify
 * @note Giving a type to the method is only here to help the implementation, but it will not change the behaviour in JavaScript
 */
export function isTypedArray<const INSTANCE extends TypedArray, >(value: unknown,): value is INSTANCE {
    if (value == null)
        return false
    if (value instanceof Int8Array)
        return true
    if (value instanceof Uint8Array)
        return true
    if (value instanceof Uint8ClampedArray)
        return true
    if (value instanceof Int16Array)
        return true
    if (value instanceof Uint16Array)
        return true
    if (value instanceof Int32Array)
        return true
    if (value instanceof Uint32Array)
        return true
    if (value instanceof BigInt64Array)
        return true
    if (value instanceof BigUint64Array)
        return true
    if (value instanceof Float32Array)
        return true
    if (value instanceof Float64Array)
        return true
    return false
}

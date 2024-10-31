/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

/**
 * Tell that the value is an {@link Int8Array}
 *
 * @param value The value to identify
 * @see isTypedArray
 * @see isUint8Array
 * @see isUint8ClampedArray
 */
export function isInt8Array(value: unknown,): value is Int8Array {
    if (value == null)
        return false
    if (value instanceof Int8Array)
        return true
    return false
}

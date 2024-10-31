/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

/**
 * Tell that the value is an {@link Uint8ClampedArray}
 *
 * @param value The value to identify
 * @see isTypedArray
 * @see isInt8Array
 * @see isUint8Array
 */
export function isUint8ClampedArray(value: unknown,): value is Uint8ClampedArray {
    if (value == null)
        return false
    if (value instanceof Uint8ClampedArray)
        return true
    return false
}

/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

/**
 * Tell that the value is an {@link Float32Array}
 *
 * @param value The value to identify
 * @see isTypedArray
 */
export function isFloat32Array(value: unknown,): value is Float32Array {
    if (value == null)
        return false
    if (value instanceof Float32Array)
        return true
    return false
}

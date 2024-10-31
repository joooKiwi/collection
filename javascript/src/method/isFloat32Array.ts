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
 * @note Giving a type to the method is only here to help the implementation, but it will not change the behaviour in JavaScript
 */
export function isFloat32Array<const INSTANCE extends Float32Array, >(value: unknown,): value is INSTANCE {
    if (value == null)
        return false
    if (value instanceof Float32Array)
        return true
    return false
}

/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

/**
 * Tell that the value is an {@link Uint32Array}
 *
 * @param value The value to identify
 * @see isTypedArray
 * @see isInt32Array
 * @note Giving a type to the method is only here to help the implementation, but it will not change the behaviour in JavaScript
 */
export function isUint32Array<const INSTANCE extends Uint32Array, >(value: unknown,): value is INSTANCE {
    if (value == null)
        return false
    if (value instanceof Uint32Array)
        return true
    return false
}

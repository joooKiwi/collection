/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

/**
 * Tell that the value is an {@link Float64Array}
 *
 * @param value The value to identify
 * @see isTypedArray
 * @note Giving a type to the method is only here to help the implementation, but it will not change the behaviour in JavaScript
 */
export function isFloat64Array<const INSTANCE extends Float64Array, >(value: unknown,): value is INSTANCE {
    return value instanceof Float64Array
}

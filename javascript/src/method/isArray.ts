/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

/**
 * Tell that the value is an {@link ReadonlyArray Array}
 *
 * @param value The value to identify
 * @see isArrayByStructure
 * @note Giving a type to the method is only here to help the implementation, but it will not change the behaviour in JavaScript
 */
export function isArray<const T, const INSTANCE extends ReadonlyArray<T> = ReadonlyArray<T>, >(value: unknown,): value is INSTANCE {
    if (value == null)
        return false
    if (value instanceof Array)
        return true
    return false
}

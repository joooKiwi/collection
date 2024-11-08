/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

/**
 * Tell that the value is an {@link ReadonlySet Set}
 *
 * @param value The value to identify
 * @see isSetByStructure
 * @note Giving a type to the method is only here to help the implementation, but it will not change the behaviour in JavaScript
 */
export function isSet<const T, const INSTANCE extends ReadonlySet<T> = ReadonlySet<T>, >(value: unknown,): value is INSTANCE {
    if (value == null)
        return false
    if (value instanceof Set)
        return true
    return false
}

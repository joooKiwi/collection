/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

/**
 * Tell that the value is a {@link Iterator}
 *
 * @param value The value to identify
 * @note Giving a type to the method is only here to help the implementation, but it will not change the behaviour in JavaScript
 */
export function isIterator<const T, const INSTANCE extends Iterator<T> = Iterator<T>, >(value: unknown,): value is INSTANCE {
    if (value == null)
        return false
    if (value instanceof Iterator)
        return true
    return false
}

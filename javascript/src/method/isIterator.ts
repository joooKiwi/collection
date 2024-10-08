/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

/**
 * Tell that the value is a {@link Iterator}
 *
 * @param value The value to identify
 */
export function isIterator<const T, >(value: unknown,): value is Iterator<T>
export function isIterator(value: unknown,) {
    if (value == null)
        return false
    if (value instanceof Iterator)
        return true
    return false
}

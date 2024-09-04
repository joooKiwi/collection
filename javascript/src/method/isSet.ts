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
 */
export function isSet<const T, >(value: unknown,): value is ReadonlySet<T>
export function isSet(value: unknown,) {
    if (value == null)
        return false
    if (value instanceof Set)
        return true
    return false
}

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
 */
export function isArray<const T, >(value: unknown,): value is ReadonlyArray<T> {
    if (value == null)
        return false
    if (value instanceof Array)
        return true
    return false
}

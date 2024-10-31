/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

/**
 * Tell that the value is a {@link WeakSet}
 *
 * @param value The value to identify
 * @see isWeakSetByStructure
 */
export function isWeakSet<T extends WeakKey, >(value: unknown,): value is Readonly<WeakSet<T>> {
    if (value == null)
        return false
    if (value instanceof WeakSet)
        return true
    return false
}

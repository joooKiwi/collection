/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

/**
 * Tell that the value is a {@link WeakMap}
 *
 * @param value The value to identify
 * @see isWeakMapByStructure
 * @note Giving a type to the method is only here to help the implementation, but it will not change the behaviour in JavaScript
 */
export function isWeakMap<const K extends WeakKey, const V, const INSTANCE extends WeakMap<K, V> = WeakMap<K, V>, >(value: unknown,): value is INSTANCE {
    return value instanceof WeakMap
}

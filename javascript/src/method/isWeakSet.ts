//··························································
// Copyright (c) 2023-2025. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

/**
 * Tell that the value is a {@link WeakSet}
 *
 * @param value The value to identify
 * @see isWeakSetByStructure
 * @note Giving a type to the method is only here to help the implementation, but it will not change the behaviour in JavaScript
 */
export function isWeakSet<T extends WeakKey, const INSTANCE extends Readonly<WeakSet<T>> = Readonly<WeakSet<T>>, >(value: unknown,): value is  INSTANCE {
    return value instanceof WeakSet
}

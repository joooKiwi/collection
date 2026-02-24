//··························································
// Copyright (c) 2023-2026. Jonathan Bédard ~ JóôòKiwi
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
 * Tell that the value is a {@link Iterator}
 *
 * @param value The value to identify
 * @see isIteratorByStructure
 * @note Giving a type to the method is only here to help the implementation, but it will not change the behaviour in JavaScript
 */
export function isIterator<const T, const INSTANCE extends Iterator<T, unknown, unknown> = Iterator<T, unknown, unknown>, >(value: unknown,): value is INSTANCE {
    return value instanceof Iterator
}

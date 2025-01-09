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

//TODO move in a separate project

import type {NullableNumber} from "@joookiwi/type"

/**
 * The possible {@link Iterable} with a possible {@link IterableWithSize size},
 * {@link IterableWithLength length} or {@link IterableWithCount count} instance
 *
 * @see Iterable
 * @see IterableWithSize
 * @see IterableWithLength
 * @see IterableWithCount
 */
export interface IterableWithPossibleSize<out T, >
    extends Iterable<T> {

    /** The value equivalent to the amount of iteration to do */
    readonly size?: NullableNumber

    /**
     * The value equivalent to the amount of iteration to do
     *
     * @note Useless if {@link IterableWithPossibleSize.size} is a {@link Number}
     */
    readonly length?: NullableNumber

    /**
     * The value equivalent to the amount of iteration to do
     *
     * @note Useless if {@link IterableWithPossibleSize.length} is a {@link Number}
     */
    readonly count?: NullableNumber

}

/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

//TODO move in a separate project

import type {Nullable} from "../general type"

/**
 * The possible {@link Iterable} with a possible {@link IterableWithSize size},
 * {@link IterableWithLength length} or {@link IterableWithCount count} instance
 *
 * @see Iterable
 * @see IterableWithSize
 * @see IterableWithLength
 * @see IterableWithCount
 */
export interface IterableWithPossibleSize<T, >
    extends Iterable<T> {

    /** The value equivalent to the amount of iteration to do */
    readonly size?: Nullable<number>

    /**
     * The value equivalent to the amount of iteration to do
     *
     * @note Useless if {@link IterableWithPossibleSize.size} is a {@link Number}
     */
    readonly length?: Nullable<number>

    /**
     * The value equivalent to the amount of iteration to do
     *
     * @note Useless if {@link IterableWithPossibleSize.length} is a {@link Number}
     */
    readonly count?: Nullable<number>

}

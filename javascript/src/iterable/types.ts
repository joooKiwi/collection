/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

//TODO move in a separate project

import type {IterableWithCount}        from "./IterableWithCount"
import type {IterableWithLength}       from "./IterableWithLength"
import type {IterableWithPossibleSize} from "./IterableWithPossibleSize"
import type {IterableWithSize}         from "./IterableWithSize"

/**
 * Every possible type of {@link Iterable} with the size field (size, length or count)
 *
 * @see PossibleIterableWithSize
 */
export type PossibleIterable<T, > = | Iterable<T>
                                    | PossibleIterableWithSize<T>

/**
 * Every possible type of {@link Iterable} with a required (or close to it)
 * size field (size, length or count)
 *
 * @see PossibleIterable
 */
export type PossibleIterableWithSize<T, > = | IterableWithPossibleSize<T>
                                            | IterableWithSize<T>
                                            | IterableWithLength<T>
                                            | IterableWithCount<T>

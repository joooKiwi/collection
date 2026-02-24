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

import type {CollectionHolder}                  from "../CollectionHolder"
import type {GenericCollectionHolder}           from "../GenericCollectionHolder"
import type {GenericMinimalistCollectionHolder} from "../GenericMinimalistCollectionHolder"
import type {LazyGenericCollectionHolder}       from "../LazyGenericCollectionHolder"
import type {MinimalistCollectionHolder}        from "../MinimalistCollectionHolder"
import type {IterableWithCount}                 from "../iterable/IterableWithCount"
import type {IterableWithLength}                from "../iterable/IterableWithLength"
import type {IterableWithPossibleSize}          from "../iterable/IterableWithPossibleSize"
import type {IterableWithSize}                  from "../iterable/IterableWithSize"
import type {CollectionIterator}                from "../iterator/CollectionIterator"

/**
 * The possible {@link Object.constructor constructor} types that are inherited
 * from a {@link MinimalistCollectionHolder} or a {@link CollectionHolder}
 */
export type PossibleCollectionHolderConstructor = | typeof GenericMinimalistCollectionHolder
                                                  | typeof GenericCollectionHolder
                                                  | typeof LazyGenericCollectionHolder

/**
 * A type-alias for the possible {@link ReadonlyArray Array}, {@link ReadonlySet Set},
 * {@link MinimalistCollectionHolder} (with inheritor),
 * {@link Iterator}, {@link CollectionIterator},
 * and {@link Iterable} (with inheritor)
 *
 *
 * @see ReadonlyArray
 * @see ReadonlySet
 * @see CollectionHolder
 * @see MinimalistCollectionHolder
 * @see CollectionIterator
 * @see Iterator
 * @see Iterable
 * @see IterableWithSize
 * @see IterableWithLength
 * @see IterableWithCount
 * @see IterableWithPossibleSize
 */
export type PossibleIterableIteratorArraySetOrCollectionHolder<T, > = | readonly T[] | ReadonlySet<T>
                                                                      | MinimalistCollectionHolder<T> | CollectionHolder<T>
                                                                      | CollectionIterator<T> | Iterator<T, unknown, unknown>
                                                                      | Iterable<T, unknown, unknown> | IterableWithSize<T> | IterableWithLength<T> | IterableWithCount<T> | IterableWithPossibleSize<T>

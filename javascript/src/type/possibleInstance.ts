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
import type {IterableWithPossibleSize}          from "../iterable/IterableWithPossibleSize"
import type {CollectionIterator}                from "../iterator/CollectionIterator"

/**
 * The possible {@link Object.constructor constructor} types that are inherited
 * from a {@link MinimalistCollectionHolder} or a {@link CollectionHolder}
 */
export type PossibleCollectionHolderConstructor = | typeof GenericMinimalistCollectionHolder
                                                  | typeof GenericCollectionHolder
                                                  | typeof LazyGenericCollectionHolder

/**
 * A type-alias for the possible type of {@link Iterable} with the size field
 * (size, length or count) or the {@link MinimalistCollectionHolder}.
 *
 * @deprecated Replace to {@link PossibleIterableIteratorArraySetOrCollectionHolder}. It will be removed in version 1.14
 */
export type PossibleIterableOrCollection<T, > = | MinimalistCollectionHolder<T> | IterableWithPossibleSize<T>

/**
 * A type-alias for the possible {@link ReadonlyArray Array}, {@link ReadonlySet Set},
 * {@link MinimalistCollectionHolder} (with inheritor)
 * and {@link Iterable} (with inheritor)
 *
 * @deprecated Replace to {@link PossibleIterableIteratorArraySetOrCollectionHolder}. It will be removed in version 1.14
 */
export type PossibleIterableArraySetOrCollectionHolder<T, > = | readonly T[] | ReadonlySet<T>
                                                              | MinimalistCollectionHolder<T> | CollectionHolder<T>
                                                              | CollectionIterator<T> | Iterable<T> | IterableWithPossibleSize<T>

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
 * @see IterableWithPossibleSize
 */
export type PossibleIterableIteratorArraySetOrCollectionHolder<T, > = | readonly T[] | ReadonlySet<T>
                                                                      | MinimalistCollectionHolder<T> | CollectionHolder<T>
                                                                      | CollectionIterator<T> | Iterator<T, unknown, unknown>
                                                                      | Iterable<T, unknown, unknown> | IterableWithPossibleSize<T>

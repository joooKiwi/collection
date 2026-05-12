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

import type {Array, Set} from "@joookiwi/type"

import type {CollectionHolder}                  from "../CollectionHolder"
import type {GenericCollectionHolder}           from "../GenericCollectionHolder"
import type {GenericMinimalistCollectionHolder} from "../GenericMinimalistCollectionHolder"
import type {LazyCollectionHolder}              from "../LazyCollectionHolder"
import type {MinimalistCollectionHolder}        from "../MinimalistCollectionHolder"
import type {IterableWithCount}                 from "../iterable/IterableWithCount"
import type {IterableWithLength}                from "../iterable/IterableWithLength"
import type {IterableWithPossibleSize}          from "../iterable/IterableWithPossibleSize"
import type {IterableWithSize}                  from "../iterable/IterableWithSize"
import type {CollectionIterator}                from "../iterator/CollectionIterator"

/**
 * The possible {@link Object.constructor constructor} types that are inherited
 * from a {@link MinimalistCollectionHolder} or a {@link CollectionHolder}
 *
 * @deprecated This feature is no longer useful and would give too many possibilities with the new instances. Use the `typeof xx` directly. This will be removed in version 2.1
 */
export type PossibleCollectionHolderConstructor = | typeof GenericMinimalistCollectionHolder
                                                  | typeof GenericCollectionHolder
                                                  | typeof LazyCollectionHolder

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
 * @see IteratorObject
 * @see Iterable
 * @see IterableWithSize
 * @see IterableWithLength
 * @see IterableWithCount
 * @see IterableWithPossibleSize
 */
export type PossibleIterableIteratorArraySetOrCollectionHolder<T, > = | Array<T> | Set<T>
                                                                      | MinimalistCollectionHolder<T> | CollectionHolder<T>
                                                                      | CollectionIterator<T> | Iterator<T, unknown, unknown> | IteratorObject<T, unknown, unknown>
                                                                      | Iterable<T, unknown, unknown> | IterableWithSize<T> | IterableWithLength<T> | IterableWithCount<T> | IterableWithPossibleSize<T>

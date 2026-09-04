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

import type {CollectionIteratorOf1}   from "../iterator/CollectionIteratorOf1"
import type {CollectionIteratorOf2}   from "../iterator/CollectionIteratorOf2"
import type {EmptyCollectionIterator} from "../iterator/EmptyCollectionIterator"

/** The possible values as either {@link EmptyCollectionIterator} or {@link CollectionIteratorOf1}<T> */
export type CollectionIteratorOf0Or1<T, > = | EmptyCollectionIterator | CollectionIteratorOf1<T>


/**
 * The possible values as either {@link EmptyCollectionIterator}, {@link CollectionIteratorOf1}<T1> or {@link CollectionIteratorOf2}<T1, T2>
 *
 * @see CollectionIteratorOfSame0Or1Or2
 * @see CollectionIteratorOfLast0Or1Or2
 * @see CollectionIteratorOfAny0Or1Or2
 */
export type CollectionIteratorOf0Or1Or2<T1, T2, > = | EmptyCollectionIterator | CollectionIteratorOf1<T1> | CollectionIteratorOf2<T1, T2>
/**
 * The possible values as either {@link EmptyCollectionIterator}, {@link CollectionIteratorOf1}<T> or {@link CollectionIteratorOf2}<T, T>
 *
 * @see CollectionIteratorOf0Or1Or2
 * @see CollectionIteratorOfLast0Or1Or2
 * @see CollectionIteratorOfAny0Or1Or2
 */
export type CollectionIteratorOfSame0Or1Or2<T, > = | EmptyCollectionIterator | CollectionIteratorOf1<T> | CollectionIteratorOf2<T, T>
/**
 * The possible values as either {@link EmptyCollectionIterator}, {@link CollectionIteratorOf1}<T2> or {@link CollectionIteratorOf2}<T1, T2>
 *
 * @see CollectionIteratorOf0Or1Or2
 * @see CollectionIteratorOfSame0Or1Or2
 * @see CollectionIteratorOfAny0Or1Or2
 */
export type CollectionIteratorOfLast0Or1Or2<T1, T2, > = | EmptyCollectionIterator | CollectionIteratorOf1<T2> | CollectionIteratorOf2<T1, T2>
/**
 * The possible values as either {@link EmptyCollectionIterator}, {@link CollectionIteratorOf1}<T1|T2> or {@link CollectionIteratorOf2}<T1, T2>
 *
 * @see CollectionIteratorOf0Or1Or2
 * @see CollectionIteratorOfSame0Or1Or2
 * @see CollectionIteratorOfLast0Or1Or2
 */
export type CollectionIteratorOfAny0Or1Or2<T1, T2, > = | EmptyCollectionIterator | CollectionIteratorOf1<| T1 | T2> | CollectionIteratorOf2<T1, T2>


/**
 * The possible values as either {@link CollectionIteratorOf1}<T1> or {@link CollectionIteratorOf2}<T1, T2>
 *
 * @see CollectionIteratorOfSame1Or2
 * @see CollectionIteratorOfLast1Or2
 * @see CollectionIteratorOfAny1Or2
 */
export type CollectionIteratorOf1Or2<T1, T2, > = | CollectionIteratorOf1<T1> | CollectionIteratorOf2<T1, T2>
/**
 * The possible values as either {@link CollectionIteratorOf1}<T> or {@link CollectionIteratorOf2}<T, T>
 *
 * @see CollectionIteratorOf1Or2
 * @see CollectionIteratorOfLast1Or2
 * @see CollectionIteratorOfAny1Or2
 */
export type CollectionIteratorOfSame1Or2<T, > = | CollectionIteratorOf1<T> | CollectionIteratorOf2<T, T>
/**
 * The possible values as either {@link CollectionIteratorOf1}<T2> or {@link CollectionIteratorOf2}<T1, T2>
 *
 * @see CollectionIteratorOf1Or2
 * @see CollectionIteratorOfSame1Or2
 * @see CollectionIteratorOfAny1Or2
 */
export type CollectionIteratorOfLast1Or2<T1, T2, > = | CollectionIteratorOf1<T2> | CollectionIteratorOf2<T1, T2>
/**
 * The possible values as either {@link CollectionIteratorOf1}<T1|T2> or {@link CollectionIteratorOf2}<T1, T2>
 *
 * @see CollectionIteratorOf1Or2
 * @see CollectionIteratorOfSame1Or2
 * @see CollectionIteratorOfLast1Or2
 */
export type CollectionIteratorOfAny1Or2<T1, T2, > = | CollectionIteratorOf1<| T1 | T2> | CollectionIteratorOf2<T1, T2>

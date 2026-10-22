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

import type {CollectionHolderOf1}   from "../CollectionHolderOf1"
import type {CollectionHolderOf2}   from "../CollectionHolderOf2"
import type {EmptyCollectionHolder} from "../EmptyCollectionHolder"

/** The possible values as either {@link EmptyCollectionHolder} or {@link CollectionHolderOf1}<T> */
export type CollectionHolderOf0Or1<T, > = | EmptyCollectionHolder | CollectionHolderOf1<T>


/**
 * The possible values as either {@link EmptyCollectionHolder}, {@link CollectionHolderOf1}<T1> or {@link CollectionHolderOf2}<T1, T2>
 *
 * @see CollectionHolderOfSame0Or1Or2
 * @see CollectionHolderOfLast0Or1Or2
 * @see CollectionHolderOfAny0Or1Or2
 */
export type CollectionHolderOf0Or1Or2<T1, T2, > = | EmptyCollectionHolder | CollectionHolderOf1<T1> | CollectionHolderOf2<T1, T2>
/**
 * The possible values as either {@link EmptyCollectionHolder}, {@link CollectionHolderOf1}<T> or {@link CollectionHolderOf2}<T, T>
 *
 * @see CollectionHolderOf0Or1Or2
 * @see CollectionHolderOfLast0Or1Or2
 * @see CollectionHolderOfAny0Or1Or2
 */
export type CollectionHolderOfSame0Or1Or2<T, > = | EmptyCollectionHolder | CollectionHolderOf1<T> | CollectionHolderOf2<T, T>
/**
 * The possible values as either {@link EmptyCollectionHolder}, {@link CollectionHolderOf1}<T2> or {@link CollectionHolderOf2}<T1, T2>
 *
 * @see CollectionHolderOf0Or1Or2
 * @see CollectionHolderOfSame0Or1Or2
 * @see CollectionHolderOfAny0Or1Or2
 */
export type CollectionHolderOfLast0Or1Or2<T1, T2, > = | EmptyCollectionHolder | CollectionHolderOf1<T2> | CollectionHolderOf2<T1, T2>
/**
 * The possible values as either {@link EmptyCollectionHolder}, {@link CollectionHolderOf1}<T1|T2> or {@link CollectionHolderOf2}<T1, T2>
 *
 * @see CollectionHolderOf0Or1Or2
 * @see CollectionHolderOfSame0Or1Or2
 * @see CollectionHolderOfLast0Or1Or2
 */
export type CollectionHolderOfAny0Or1Or2<T1, T2, > = | EmptyCollectionHolder | CollectionHolderOf1<| T1 | T2> | CollectionHolderOf2<T1, T2>


/**
 * The possible values as either {@link CollectionHolderOf1}<T1> or {@link CollectionHolderOf2}<T1, T2>
 *
 * @see CollectionHolderOfSame1Or2
 * @see CollectionHolderOfLast1Or2
 * @see CollectionHolderOfAny1Or2
 */
export type CollectionHolderOf1Or2<T1, T2, > = | CollectionHolderOf1<T1> | CollectionHolderOf2<T1, T2>
/**
 * The possible values as either {@link CollectionHolderOf1}<T> or {@link CollectionHolderOf2}<T, T>
 *
 * @see CollectionHolderOf1Or2
 * @see CollectionHolderOfLast1Or2
 * @see CollectionHolderOfAny1Or2
 */
export type CollectionHolderOfSame1Or2<T, > = | CollectionHolderOf1<T> | CollectionHolderOf2<T, T>
/**
 * The possible values as either {@link CollectionHolderOf1}<T2> or {@link CollectionHolderOf2}<T1, T2>
 *
 * @see CollectionHolderOf1Or2
 * @see CollectionHolderOfSame1Or2
 * @see CollectionHolderOfAny1Or2
 */
export type CollectionHolderOfLast1Or2<T1, T2, > = | CollectionHolderOf1<T2> | CollectionHolderOf2<T1, T2>
/**
 * The possible values as either {@link CollectionHolderOf1}<T1|T2> or {@link CollectionHolderOf2}<T1, T2>
 *
 * @see CollectionHolderOf1Or2
 * @see CollectionHolderOfSame1Or2
 * @see CollectionHolderOfLast1Or2
 */
export type CollectionHolderOfAny1Or2<T1, T2, > = | CollectionHolderOf1<| T1 | T2> | CollectionHolderOf2<T1, T2>

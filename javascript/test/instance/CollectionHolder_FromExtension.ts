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

import type {Nullable} from "@joookiwi/type"

import type {CollectionHolder}                                   from "../../src/CollectionHolder"
import type {MinimalistCollectionHolder}                         from "../../src/MinimalistCollectionHolder"
import type {CollectionIterator}                                 from "../../src/iterator/CollectionIterator"
import type {PossibleIterableIteratorArraySetOrCollectionHolder} from "../../src/type/possibleInstance"

export interface CollectionHolder_FromExtension<out T,>
    extends CollectionHolder<T> {

    /** The never possible amount of call {@link CollectionHolder.get} has been called */
    get amountOfCall(): never

    /**
     * Never modify the amount of call of {@link CollectionHolder.get}
     *
     * @param _ The never used value
     * @throws Error (<i>always</i>) The never possible change of the {@link amountOfCall}
     */
    set amountOfCall(_: unknown,)

    hasOneWithArray(values: Nullable<readonly T[]>,): boolean
    hasOneWithSet(values: Nullable<ReadonlySet<T>>,): boolean
    hasOneWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean
    hasOneWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    hasOneWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean
    hasOneWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    hasOneWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    hasOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean

    hasNotOneWithArray(values: Nullable<readonly T[]>,): boolean
    hasNotOneWithSet(values: Nullable<ReadonlySet<T>>,): boolean
    hasNotOneWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean
    hasNotOneWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    hasNotOneWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean
    hasNotOneWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    hasNotOneWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    hasNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean

    hasAllWithArray(values: Nullable<readonly T[]>,): boolean
    hasAllWithSet(values: Nullable<ReadonlySet<T>>,): boolean
    hasAllWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean
    hasAllWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    hasAllWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean
    hasAllWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    hasAllWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    hasAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean

    hasNotAllWithArray(values: Nullable<readonly T[]>,): boolean
    hasNotAllWithSet(values: Nullable<ReadonlySet<T>>,): boolean
    hasNotAllWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean
    hasNotAllWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    hasNotAllWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean
    hasNotAllWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    hasNotAllWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    hasNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean

}

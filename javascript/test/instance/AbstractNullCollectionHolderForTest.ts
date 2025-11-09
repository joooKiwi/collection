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
import type {CollectionHolder_FromExtension}                     from "./CollectionHolder_FromExtension"

import {AbstractCollectionHolderForTest} from "./AbstractCollectionHolderForTest"

/**
 * A base-bone implementation of a {@link CollectionHolderForTest} with `null` or `undefined` being the value
 *
 * @typeParam The type
 */
export abstract class AbstractNullCollectionHolderForTest<const T, >
    extends AbstractCollectionHolderForTest<T>
    implements CollectionHolder_FromExtension<T> {

    public constructor() { super() }

    public override get amountOfCall(): never {
        throw new Error("The getter method “amountOfCall” was not expected to be called on an extension function only test instance.")
    }

    public override set amountOfCall(_: unknown,) {
        throw new Error("The setter method “amountOfCall” was not expected to be called on an extension function only test instance.")
    }

    public override get size(): never {
        throw new Error("The method “size” was not expected to be called directly.")
    }

    public abstract override get isEmpty(): true
    public abstract override get isNotEmpty(): false

    public override get(..._: readonly unknown[]): never {
        throw new Error("The method “get” was not expected to be called directly.")
    }

    public abstract hasOneWithArray(values: Nullable<readonly T[]>,): boolean
    public abstract hasOneWithSet(values: Nullable<ReadonlySet<T>>,): boolean
    public abstract hasOneWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean
    public abstract hasOneWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public abstract hasOneWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean
    public abstract hasOneWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public abstract hasOneWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public abstract override hasOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean

    public abstract hasNotOneWithArray(values: Nullable<readonly T[]>,): boolean
    public abstract hasNotOneWithSet(values: Nullable<ReadonlySet<T>>,): boolean
    public abstract hasNotOneWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean
    public abstract hasNotOneWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public abstract hasNotOneWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean
    public abstract hasNotOneWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public abstract hasNotOneWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public abstract override hasNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean

    public abstract hasAllWithArray(values: Nullable<readonly T[]>,): boolean
    public abstract hasAllWithSet(values: Nullable<ReadonlySet<T>>,): boolean
    public abstract hasAllWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean
    public abstract hasAllWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public abstract hasAllWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean
    public abstract hasAllWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public abstract hasAllWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public abstract override hasAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean

    public abstract hasNotAllWithArray(values: Nullable<readonly T[]>,): boolean
    public abstract hasNotAllWithSet(values: Nullable<ReadonlySet<T>>,): boolean
    public abstract hasNotAllWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean
    public abstract hasNotAllWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public abstract hasNotAllWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean
    public abstract hasNotAllWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public abstract hasNotAllWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public abstract override hasNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean

}

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

import type {Array, Nullable, NullableNumber, NumberArray, NumberSet, Set} from "@joookiwi/type"

import type {CollectionHolder}               from "../../src/CollectionHolder"
import type {MinimalistCollectionHolder}     from "../../src/MinimalistCollectionHolder"
import type {CollectionIterator}             from "../../src/iterator/CollectionIterator"
import type {CollectionHolder_FromExtension} from "./CollectionHolder_FromExtension"

import {hasAllWithArrayByCollectionHolder}                         from "../../src/method/hasAll.withArray"
import {hasAllWithSetByCollectionHolder}                           from "../../src/method/hasAll.withSet"
import {hasAllWithCollectionHolderByCollectionHolder}              from "../../src/method/hasAll.withCollectionHolder"
import {hasAllWithMinimalistCollectionHolderByCollectionHolder}    from "../../src/method/hasAll.withMinimalistCollectionHolder"
import {hasAllWithCollectionIteratorByCollectionHolder}            from "../../src/method/hasAll.withCollectionIterator"
import {hasAllWithIteratorByCollectionHolder}                      from "../../src/method/hasAll.withIterator"
import {hasAllWithIterableByCollectionHolder}                      from "../../src/method/hasAll.withIterable"
import {hasNotAllWithArrayByCollectionHolder}                      from "../../src/method/hasNotAll.withArray"
import {hasNotAllWithSetByCollectionHolder}                        from "../../src/method/hasNotAll.withSet"
import {hasNotAllWithCollectionHolderByCollectionHolder}           from "../../src/method/hasNotAll.withCollectionHolder"
import {hasNotAllWithMinimalistCollectionHolderByCollectionHolder} from "../../src/method/hasNotAll.withMinimalistCollectionHolder"
import {hasNotAllWithCollectionIteratorByCollectionHolder}         from "../../src/method/hasNotAll.withCollectionIterator"
import {hasNotAllWithIteratorByCollectionHolder}                   from "../../src/method/hasNotAll.withIterator"
import {hasNotAllWithIterableByCollectionHolder}                   from "../../src/method/hasNotAll.withIterable"
import {hasNotOneWithArrayByCollectionHolder}                      from "../../src/method/hasNotOne.withArray"
import {hasNotOneWithSetByCollectionHolder}                        from "../../src/method/hasNotOne.withSet"
import {hasNotOneWithCollectionHolderByCollectionHolder}           from "../../src/method/hasNotOne.withCollectionHolder"
import {hasNotOneWithMinimalistCollectionHolderByCollectionHolder} from "../../src/method/hasNotOne.withMinimalistCollectionHolder"
import {hasNotOneWithCollectionIteratorByCollectionHolder}         from "../../src/method/hasNotOne.withCollectionIterator"
import {hasNotOneWithIteratorByCollectionHolder}                   from "../../src/method/hasNotOne.withIterator"
import {hasNotOneWithIterableByCollectionHolder}                   from "../../src/method/hasNotOne.withIterable"
import {hasOneWithArrayByCollectionHolder}                         from "../../src/method/hasOne.withArray"
import {hasOneWithSetByCollectionHolder}                           from "../../src/method/hasOne.withSet"
import {hasOneWithCollectionHolderByCollectionHolder}              from "../../src/method/hasOne.withCollectionHolder"
import {hasOneWithMinimalistCollectionHolderByCollectionHolder}    from "../../src/method/hasOne.withMinimalistCollectionHolder"
import {hasOneWithCollectionIteratorByCollectionHolder}            from "../../src/method/hasOne.withCollectionIterator"
import {hasOneWithIteratorByCollectionHolder}                      from "../../src/method/hasOne.withIterator"
import {hasOneWithIterableByCollectionHolder}                      from "../../src/method/hasOne.withIterable"
import {sliceWithARangeByCollectionHolder}                         from "../../src/method/slice.withARange"
import {sliceWithArrayByCollectionHolder}                          from "../../src/method/slice.withArray"
import {sliceWithCollectionHolderByCollectionHolder}               from "../../src/method/slice.withCollectionHolder"
import {sliceWithCollectionIteratorByCollectionHolder}             from "../../src/method/slice.withCollectionIterator"
import {sliceWithIterableByCollectionHolder}                       from "../../src/method/slice.withIterable"
import {sliceWithIteratorByCollectionHolder}                       from "../../src/method/slice.withIterator"
import {sliceWithMinimalistCollectionHolderByCollectionHolder}     from "../../src/method/slice.withMinimalistCollectionHolder"
import {sliceWithSetByCollectionHolder}                            from "../../src/method/slice.withSet"
import {AbstractCollectionHolderForTest}                           from "./AbstractCollectionHolderForTest"

/**
 * A test instance to exclusively test the extension methods for
 * a {@link CollectionHolder}
 *
 * @typeParam T The type
 */
export class CollectionHolder_FromExtensionFunction<const T, >
    extends AbstractCollectionHolderForTest<T>
    implements CollectionHolder_FromExtension<T> {

    public constructor(/** The array received in the constructor */ public readonly array: Array<T>,) { super() }

    public get size(): number {
        return this.array.length
    }

    public override get(index: number,): T {
        if (index < 0)
            throw new Error("The method “get” was not expected to be called with a negative index",)

		const array = this.array
        if (index >= array.length)
            throw new Error("The method “get” was not expected to be called with an index equal or over the size",)
        return array[index] as T
    }

    public hasOneWithArray(values: Nullable<Array<T>>,): boolean {
        return hasOneWithArrayByCollectionHolder(this, values,)
    }
    public hasOneWithSet(values: Nullable<Set<T>>,): boolean {
        return hasOneWithSetByCollectionHolder(this, values,)
    }
    public hasOneWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean {
        return hasOneWithCollectionHolderByCollectionHolder(this, values,)
    }
    public hasOneWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
        return hasOneWithMinimalistCollectionHolderByCollectionHolder(this, values,)
    }
    public hasOneWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean {
        return hasOneWithCollectionIteratorByCollectionHolder(this, values,)
    }
    public hasOneWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean {
        return hasOneWithIteratorByCollectionHolder(this, values,)
    }
    public hasOneWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean {
        return hasOneWithIterableByCollectionHolder(this, values,)
    }

    public hasNotOneWithArray(values: Nullable<Array<T>>,): boolean {
        return hasNotOneWithArrayByCollectionHolder(this, values,)
    }
    public hasNotOneWithSet(values: Nullable<Set<T>>,): boolean {
        return hasNotOneWithSetByCollectionHolder(this, values,)
    }
    public hasNotOneWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean {
        return hasNotOneWithCollectionHolderByCollectionHolder(this, values,)
    }
    public hasNotOneWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
        return hasNotOneWithMinimalistCollectionHolderByCollectionHolder(this, values,)
    }
    public hasNotOneWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean {
        return hasNotOneWithCollectionIteratorByCollectionHolder(this, values,)
    }
    public hasNotOneWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean {
        return hasNotOneWithIteratorByCollectionHolder(this, values,)
    }
    public hasNotOneWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean {
        return hasNotOneWithIterableByCollectionHolder(this, values,)
    }

    public hasAllWithArray(values: Nullable<Array<T>>,): boolean {
        return hasAllWithArrayByCollectionHolder(this, values,)
    }
    public hasAllWithSet(values: Nullable<Set<T>>,): boolean {
        return hasAllWithSetByCollectionHolder(this, values,)
    }
    public hasAllWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean {
        return hasAllWithCollectionHolderByCollectionHolder(this, values,)
    }
    public hasAllWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
        return hasAllWithMinimalistCollectionHolderByCollectionHolder(this, values,)
    }
    public hasAllWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean {
        return hasAllWithCollectionIteratorByCollectionHolder(this, values,)
    }
    public hasAllWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean {
        return hasAllWithIteratorByCollectionHolder(this, values,)
    }
    public hasAllWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean {
        return hasAllWithIterableByCollectionHolder(this, values,)
    }

    public hasNotAllWithArray(values: Nullable<Array<T>>,): boolean {
        return hasNotAllWithArrayByCollectionHolder(this, values,)
    }
    public hasNotAllWithSet(values: Nullable<Set<T>>,): boolean {
        return hasNotAllWithSetByCollectionHolder(this, values,)
    }
    public hasNotAllWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean {
        return hasNotAllWithCollectionHolderByCollectionHolder(this, values,)
    }
    public hasNotAllWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
        return hasNotAllWithMinimalistCollectionHolderByCollectionHolder(this, values,)
    }
    public hasNotAllWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean {
        return hasNotAllWithCollectionIteratorByCollectionHolder(this, values,)
    }
    public hasNotAllWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean {
        return hasNotAllWithIteratorByCollectionHolder(this, values,)
    }
    public hasNotAllWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean {
        return hasNotAllWithIterableByCollectionHolder(this, values,)
    }

    public sliceWithARange(from?: NullableNumber, to?: NullableNumber,): CollectionHolder<T> {
        return sliceWithARangeByCollectionHolder<T>(this, from, to,)
    }
    public sliceWithArray(indices: NumberArray,): CollectionHolder<T> {
        return sliceWithArrayByCollectionHolder<T>(this, indices,)
    }
    public sliceWithSet(indices: NumberSet,): CollectionHolder<T> {
        return sliceWithSetByCollectionHolder<T>(this, indices,)
    }
    public sliceWithCollectionHolder(indices: CollectionHolder<number>,): CollectionHolder<T> {
        return sliceWithCollectionHolderByCollectionHolder<T>(this, indices,)
    }
    public sliceWithMinimalistCollectionHolder(indices: MinimalistCollectionHolder<number>,): CollectionHolder<T> {
        return sliceWithMinimalistCollectionHolderByCollectionHolder<T>(this, indices,)
    }
    public sliceWithCollectionIterator(indices: CollectionIterator<number>,): CollectionHolder<T> {
        return sliceWithCollectionIteratorByCollectionHolder<T>(this, indices,)
    }
    public sliceWithIterator(indices: Iterator<number, unknown, unknown>,): CollectionHolder<T> {
        return sliceWithIteratorByCollectionHolder<T>(this, indices,)
    }
    public sliceWithIterable(indices: Iterable<number, unknown, unknown>,): CollectionHolder<T> {
        return sliceWithIterableByCollectionHolder<T>(this, indices,)
    }

}

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

import type {CollectionHolder}               from "../../src/CollectionHolder"
import type {MinimalistCollectionHolder}     from "../../src/MinimalistCollectionHolder"
import type {CollectionIterator}             from "../../src/iterator/CollectionIterator"
import type {CollectionHolder_FromExtension} from "./CollectionHolder_FromExtension"

import {hasAllWithArrayByMinimalistCollectionHolder}                         from "../../src/method/hasAll.withArray"
import {hasAllWithSetByMinimalistCollectionHolder}                           from "../../src/method/hasAll.withSet"
import {hasAllWithCollectionHolderByMinimalistCollectionHolder}              from "../../src/method/hasAll.withCollectionHolder"
import {hasAllWithMinimalistCollectionHolderByMinimalistCollectionHolder}    from "../../src/method/hasAll.withMinimalistCollectionHolder"
import {hasAllWithCollectionIteratorByMinimalistCollectionHolder}            from "../../src/method/hasAll.withCollectionIterator"
import {hasAllWithIteratorByMinimalistCollectionHolder}                      from "../../src/method/hasAll.withIterator"
import {hasAllWithIterableByMinimalistCollectionHolder}                      from "../../src/method/hasAll.withIterable"
import {hasNotAllWithArrayByMinimalistCollectionHolder}                      from "../../src/method/hasNotAll.withArray"
import {hasNotAllWithSetByMinimalistCollectionHolder}                        from "../../src/method/hasNotAll.withSet"
import {hasNotAllWithCollectionHolderByMinimalistCollectionHolder}           from "../../src/method/hasNotAll.withCollectionHolder"
import {hasNotAllWithMinimalistCollectionHolderByMinimalistCollectionHolder} from "../../src/method/hasNotAll.withMinimalistCollectionHolder"
import {hasNotAllWithCollectionIteratorByMinimalistCollectionHolder}         from "../../src/method/hasNotAll.withCollectionIterator"
import {hasNotAllWithIteratorByMinimalistCollectionHolder}                   from "../../src/method/hasNotAll.withIterator"
import {hasNotAllWithIterableByMinimalistCollectionHolder}                   from "../../src/method/hasNotAll.withIterable"
import {hasNotOneWithArrayByMinimalistCollectionHolder}                      from "../../src/method/hasNotOne.withArray"
import {hasNotOneWithSetByMinimalistCollectionHolder}                        from "../../src/method/hasNotOne.withSet"
import {hasNotOneWithCollectionHolderByMinimalistCollectionHolder}           from "../../src/method/hasNotOne.withCollectionHolder"
import {hasNotOneWithMinimalistCollectionHolderByMinimalistCollectionHolder} from "../../src/method/hasNotOne.withMinimalistCollectionHolder"
import {hasNotOneWithCollectionIteratorByMinimalistCollectionHolder}         from "../../src/method/hasNotOne.withCollectionIterator"
import {hasNotOneWithIteratorByMinimalistCollectionHolder}                   from "../../src/method/hasNotOne.withIterator"
import {hasNotOneWithIterableByMinimalistCollectionHolder}                   from "../../src/method/hasNotOne.withIterable"
import {hasOneWithArrayByMinimalistCollectionHolder}                         from "../../src/method/hasOne.withArray"
import {hasOneWithSetByMinimalistCollectionHolder}                           from "../../src/method/hasOne.withSet"
import {hasOneWithCollectionHolderByMinimalistCollectionHolder}              from "../../src/method/hasOne.withCollectionHolder"
import {hasOneWithMinimalistCollectionHolderByMinimalistCollectionHolder}    from "../../src/method/hasOne.withMinimalistCollectionHolder"
import {hasOneWithCollectionIteratorByMinimalistCollectionHolder}            from "../../src/method/hasOne.withCollectionIterator"
import {hasOneWithIteratorByMinimalistCollectionHolder}                      from "../../src/method/hasOne.withIterator"
import {hasOneWithIterableByMinimalistCollectionHolder}                      from "../../src/method/hasOne.withIterable"
import {AbstractMinimalistCollectionHolderForTest}                           from "./AbstractMinimalistCollectionHolderForTest"

/** A test instance to exclusively test the extension methods for a {@link MinimalistCollectionHolder} */
export class CollectionHolder_FromMinimalistExtensionFunction<const T, >
    extends AbstractMinimalistCollectionHolderForTest<T, readonly T[]>
    implements CollectionHolder_FromExtension<T> {

    public override get amountOfCall(): never {
        throw new Error("The getter method “amountOfCall” was not expected to be called on an extension function only test instance.",)
    }

    public override set amountOfCall(_: unknown,) {
        throw new Error("The setter method “amountOfCall” was not expected to be called on an extension function only test instance.",)
    }

    public override get size(): number {
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

    public hasOneWithArray(values: Nullable<readonly T[]>,): boolean {
        return hasOneWithArrayByMinimalistCollectionHolder(this, values,)
    }
    public hasOneWithSet(values: Nullable<ReadonlySet<T>>,): boolean {
        return hasOneWithSetByMinimalistCollectionHolder(this, values,)
    }
    public hasOneWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean {
        return hasOneWithCollectionHolderByMinimalistCollectionHolder(this, values,)
    }
    public hasOneWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
        return hasOneWithMinimalistCollectionHolderByMinimalistCollectionHolder(this, values,)
    }
    public hasOneWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean {
        return hasOneWithCollectionIteratorByMinimalistCollectionHolder(this, values,)
    }
    public hasOneWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean {
        return hasOneWithIteratorByMinimalistCollectionHolder(this, values,)
    }
    public hasOneWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean {
        return hasOneWithIterableByMinimalistCollectionHolder(this, values,)
    }

    public hasNotOneWithArray(values: Nullable<readonly T[]>,): boolean {
        return hasNotOneWithArrayByMinimalistCollectionHolder(this, values,)
    }
    public hasNotOneWithSet(values: Nullable<ReadonlySet<T>>,): boolean {
        return hasNotOneWithSetByMinimalistCollectionHolder(this, values,)
    }
    public hasNotOneWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean {
        return hasNotOneWithCollectionHolderByMinimalistCollectionHolder(this, values,)
    }
    public hasNotOneWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
        return hasNotOneWithMinimalistCollectionHolderByMinimalistCollectionHolder(this, values,)
    }
    public hasNotOneWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean {
        return hasNotOneWithCollectionIteratorByMinimalistCollectionHolder(this, values,)
    }
    public hasNotOneWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean {
        return hasNotOneWithIteratorByMinimalistCollectionHolder(this, values,)
    }
    public hasNotOneWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean {
        return hasNotOneWithIterableByMinimalistCollectionHolder(this, values,)
    }

    public hasAllWithArray(values: Nullable<readonly T[]>,): boolean {
        return hasAllWithArrayByMinimalistCollectionHolder(this, values,)
    }
    public hasAllWithSet(values: Nullable<ReadonlySet<T>>,): boolean {
        return hasAllWithSetByMinimalistCollectionHolder(this, values,)
    }
    public hasAllWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean {
        return hasAllWithCollectionHolderByMinimalistCollectionHolder(this, values,)
    }
    public hasAllWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
        return hasAllWithMinimalistCollectionHolderByMinimalistCollectionHolder(this, values,)
    }
    public hasAllWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean {
        return hasAllWithCollectionIteratorByMinimalistCollectionHolder(this, values,)
    }
    public hasAllWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean {
        return hasAllWithIteratorByMinimalistCollectionHolder(this, values,)
    }
    public hasAllWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean {
        return hasAllWithIterableByMinimalistCollectionHolder(this, values,)
    }

    public hasNotAllWithArray(values: Nullable<readonly T[]>,): boolean {
        return hasNotAllWithArrayByMinimalistCollectionHolder(this, values,)
    }
    public hasNotAllWithSet(values: Nullable<ReadonlySet<T>>,): boolean {
        return hasNotAllWithSetByMinimalistCollectionHolder(this, values,)
    }
    public hasNotAllWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean {
        return hasNotAllWithCollectionHolderByMinimalistCollectionHolder(this, values,)
    }
    public hasNotAllWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
        return hasNotAllWithMinimalistCollectionHolderByMinimalistCollectionHolder(this, values,)
    }
    public hasNotAllWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean {
        return hasNotAllWithCollectionIteratorByMinimalistCollectionHolder(this, values,)
    }
    public hasNotAllWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean {
        return hasNotAllWithIteratorByMinimalistCollectionHolder(this, values,)
    }
    public hasNotAllWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean {
        return hasNotAllWithIterableByMinimalistCollectionHolder(this, values,)
    }

}

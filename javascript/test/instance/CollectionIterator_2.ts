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

import type {NullOrNumber} from "@joookiwi/type"

import type {IndexValueCallback, ValueIndexCallback}                                               from "../../src/type/callback"
import type {PossibleIteratorValue}                                                                from "../../src/type/iteratorValue"
import type {AfterLastValueInCollectionIteratorSymbol, BeforeFirstValueInCollectionIteratorSymbol} from "../../src/type/symbol"

import {AbstractCollectionIteratorForTest} from "./AbstractCollectionIteratorForTest"
import {CollectionIteratorOf2}             from "../../src/iterator/CollectionIteratorOf2"

/**
 * A class to test the functionality of a {@link CollectionIteratorOf2}
 *
 * @typeParam T The type
 */
export class CollectionIterator_2<const T,
    const T1 extends T = T,
    const T2 extends T = T, >
    extends AbstractCollectionIteratorForTest<T> {

    /** The internal instance that is tested */
    public readonly instance: CollectionIteratorOf2<T, T1, T2>

    public constructor(public readonly value1: T1, public readonly value2: T2,) {
        super()
        this.instance = new CollectionIteratorOf2(value1, value2,)
    }

    //#region -------------------- Size methods --------------------

    public override get size(): 2 { return this.instance.size }

    public override get isEmpty(): false { return this.instance.isEmpty }
    public override get isNotEmpty(): true { return this.instance.isNotEmpty }

    public override get hasExactly1Element(): false { return this.instance.hasExactly1Element }
    public override get hasAtMost1Element(): false { return this.instance.hasAtMost1Element }

    public override get hasAtLeast2Elements(): true { return this.instance.hasAtLeast2Elements }
    public override get hasExactly2Elements(): true { return this.instance.hasExactly2Elements }
    public override get hasAtMost2Elements(): true { return this.instance.hasAtMost2Elements }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- End-point index methods --------------------

    public get firstIndex(): 0 { return this.instance.firstIndex }

    public get lastIndex(): 1 { return this.instance.lastIndex }

    //#endregion -------------------- End-point index methods --------------------
    //#region -------------------- Current methods --------------------

    public get currentIndex(): NullOrNumber<| 0 | 1> { return this.instance.currentIndex }

    //#endregion -------------------- Current methods --------------------
    //#region -------------------- Next methods --------------------

    public get hasNext(): boolean { return this.instance.hasNext }

    public get nextIndex(): NullOrNumber<| 0 | 1> { return this.instance.nextIndex }

    public get nextValue(): T { return this.instance.nextValue }

    public next(): PossibleIteratorValue<T, AfterLastValueInCollectionIteratorSymbol> { return this.instance.next() }

    //#endregion -------------------- Next methods --------------------
    //#region -------------------- Previous methods --------------------

    public get hasPrevious(): boolean { return this.instance.hasPrevious }

    public get previousIndex(): NullOrNumber<| 0 | 1> { return this.instance.previousIndex }

    public get previousValue(): T { return this.instance.previousValue }

    public previous(): PossibleIteratorValue<T, BeforeFirstValueInCollectionIteratorSymbol> { return this.instance.previous() }

    //#endregion -------------------- Previous methods --------------------
    //#region -------------------- Reset methods --------------------

    public override reset() { this.instance.reset() }

    //#endregion -------------------- Reset methods --------------------
    //#region -------------------- Loop methods --------------------

    public override forEach(operation: ValueIndexCallback<T>,): this {
        const instance = this.instance
        if (instance.forEach(operation,) !== instance)
            throw new Error("The expected return type for the method “forEach” was supposed to be the same instance",)
        return this
    }

    public override forEachIndexed(operation: IndexValueCallback<T>,): this {
        const instance = this.instance
        if (instance.forEachIndexed(operation,) !== instance)
            throw new Error("The expected return type for the method “forEachIndexed” was supposed to be the same instance",)
        return this
    }

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- JavaScript methods --------------------

    public [Symbol.iterator](): CollectionIteratorOf2<T, T1, T2> { return this.instance[Symbol.iterator]() }

    //#endregion -------------------- JavaScript methods --------------------


}

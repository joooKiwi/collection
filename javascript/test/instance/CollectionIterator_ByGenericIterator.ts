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

import type {Array, NullOrNumber, NullOrZeroNumber} from "@joookiwi/type"

import type {IndexValueCallback, ValueIndexCallback}                                               from "../../src/type/callback"
import type {PossibleIteratorValue}                                                                from "../../src/type/iteratorValue"
import type {AfterLastValueInCollectionIteratorSymbol, BeforeFirstValueInCollectionIteratorSymbol} from "../../src/type/symbol"

import {AbstractCollectionIteratorForTest} from "./AbstractCollectionIteratorForTest"
import {GenericCollectionIterator}         from "../../src/iterator/GenericCollectionIterator"
import {CollectionHolderFromArray}         from "./CollectionHolderFromArray"

/**
 * A class to test the functionality of a {@link GenericCollectionIterator}
 *
 * @typeParam T The type
 */
export class CollectionIterator_ByGenericIterator<const T, >
    extends AbstractCollectionIteratorForTest<T> {

    /** The internal instance that is tested */
    public readonly instance: GenericCollectionIterator<T>

    public constructor(/** The array received in the constructor */ public readonly array: Array<T>,) {
        super()
        this.instance = new GenericCollectionIterator(new CollectionHolderFromArray(array,),)
    }

    //#region -------------------- Size methods --------------------

    public override get size(): number { return this.instance.size }

    public override get isEmpty(): boolean { return this.instance.isEmpty }
    public override get isNotEmpty(): boolean { return this.instance.isNotEmpty }

    public override get hasExactly1Element(): boolean { return this.instance.hasExactly1Element }
    public override get hasAtMost1Element(): boolean { return this.instance.hasAtMost1Element }

    public override get hasAtLeast2Elements(): boolean { return this.instance.hasAtLeast2Elements }
    public override get hasExactly2Elements(): boolean { return this.instance.hasExactly2Elements }
    public override get hasAtMost2Elements(): boolean { return this.instance.hasAtMost2Elements }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- End-point index methods --------------------

    public get firstIndex(): NullOrZeroNumber { return this.instance.firstIndex }

    public get lastIndex(): NullOrNumber { return this.instance.lastIndex }

    //#endregion -------------------- End-point index methods --------------------
    //#region -------------------- Current methods --------------------

    public get currentIndex(): NullOrNumber { return this.instance.currentIndex }

    //#endregion -------------------- Current methods --------------------
    //#region -------------------- Next methods --------------------

    public get hasNext(): boolean { return this.instance.hasNext }

    public get nextIndex(): NullOrNumber { return this.instance.nextIndex }

    public get nextValue(): T { return this.instance.nextValue }

    public next(): PossibleIteratorValue<T, AfterLastValueInCollectionIteratorSymbol> { return this.instance.next() }

    //#endregion -------------------- Next methods --------------------
    //#region -------------------- Previous methods --------------------

    public get hasPrevious(): boolean { return this.instance.hasPrevious }

    public get previousIndex(): NullOrNumber { return this.instance.previousIndex }

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

    public [Symbol.iterator](): GenericCollectionIterator<T> { return this.instance[Symbol.iterator]() }

    //#endregion -------------------- JavaScript methods --------------------


}

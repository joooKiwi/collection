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

import type {Array} from "@joookiwi/type"

import type {CollectionIterator}                                                                   from "./CollectionIterator"
import type {OutsideIteratorValue}                                                                 from "./value/OutsideIteratorValue"
import type {AfterLastValueInCollectionIteratorSymbol, BeforeFirstValueInCollectionIteratorSymbol} from "../type/symbol"
import type {CollectionIteratorName}                                                               from "../type/toStringTag"

import {NoElementFoundInCollectionException} from "../exception/NoElementFoundInCollectionException"
import {GenericAfterLastIteratorValue}       from "./value/GenericAfterLastIteratorValue"
import {GenericBeforeFirstIteratorValue}     from "./value/GenericBeforeFirstIteratorValue"

export class EmptyCollectionIterator
    implements CollectionIterator<never> {

    //#region -------------------- Singleton usage --------------------

    static #instance?: EmptyCollectionIterator

    protected constructor() {}

    public static get get(): EmptyCollectionIterator { return EmptyCollectionIterator.#instance ??= new EmptyCollectionIterator() }

    //#endregion -------------------- Singleton usage --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Size methods --------------------

    public get size(): 0 { return 0 }
    public get length(): this["size"] { return this.size }
    public get count(): this["size"] { return this.size }

    public get isEmpty(): true { return true }
    public get isNotEmpty(): false { return false }

    public get hasAtLeast1Element(): this["isNotEmpty"] { return this.isNotEmpty }
    public get includesAtLeast1Element(): this["isNotEmpty"] { return this.isNotEmpty }
    public get containsAtLeast1Element(): this["isNotEmpty"] { return this.isNotEmpty }

    public get hasExactly1Element(): false { return false }
    public get includesExactly1Element(): this["hasExactly1Element"] { return this.hasExactly1Element }
    public get containsExactly1Element(): this["hasExactly1Element"] { return this.hasExactly1Element }

    public get hasAtMost1Element(): true { return true }
    public get includesAtMost1Element(): this["hasAtMost1Element"] { return this.hasAtMost1Element }
    public get containsAtMost1Element(): this["hasAtMost1Element"] { return this.hasAtMost1Element }

    public get hasAtLeast2Elements(): false { return false }
    public get includesAtLeast2Elements(): this["hasAtLeast2Elements"] { return this.hasAtLeast2Elements }
    public get containsAtLeast2Elements(): this["hasAtLeast2Elements"] { return this.hasAtLeast2Elements }

    public get hasExactly2Elements(): false { return false }
    public get includesExactly2Elements(): this["hasExactly2Elements"] { return this.hasExactly2Elements }
    public get containsExactly2Elements(): this["hasExactly2Elements"] { return this.hasExactly2Elements }

    public get hasAtMost2Elements(): true { return true }
    public get includesAtMost2Elements(): this["hasAtMost2Elements"] { return this.hasAtMost2Elements }
    public get containsAtMost2Elements(): this["hasAtMost2Elements"] { return this.hasAtMost2Elements }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- End-point index methods --------------------

    public get firstIndex(): null { return null }

    public get lastIndex(): null { return null }

    //#endregion -------------------- End-point index methods --------------------

    //#region -------------------- Current methods --------------------

    public get index(): this["currentIndex"] { return this.currentIndex }
    public get currentIndex(): null { return null }

    //#endregion -------------------- Current methods --------------------
    //#region -------------------- Next methods --------------------

    public get hasNext(): false { return false }

    public get nextIndex(): null { return null }
    public get nextValue(): never { throw new NoElementFoundInCollectionException("An empty collection iterator has no value to retrieve",) }

    public next(... _: Array<unknown>): OutsideIteratorValue<AfterLastValueInCollectionIteratorSymbol>
    public next() { return GenericAfterLastIteratorValue.get }

    //#endregion -------------------- Next methods --------------------
    //#region -------------------- Previous methods --------------------

    public get hasPrevious(): false { return false }

    public get previousIndex(): null { return null }
    public get previousValue(): never { throw new NoElementFoundInCollectionException("An empty collection iterator has no value to retrieve",) }

    public previous(... _: Array<unknown>): OutsideIteratorValue<BeforeFirstValueInCollectionIteratorSymbol>
    public previous() { return GenericBeforeFirstIteratorValue.get }

    //#endregion -------------------- Previous methods --------------------
    //#region -------------------- Reset methods --------------------

    public reset(... _: Array<unknown>): void
    public reset() {}

    //#endregion -------------------- Reset methods --------------------

    //#region -------------------- Loop methods --------------------

    public forEach(... _: Array<unknown>): this
    public forEach() { return this }

    public forEachIndexed(... _: Array<unknown>): this
    public forEachIndexed() { return this }

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- JavaScript methods --------------------

    public [Symbol.iterator](): this { return this }

    public get [Symbol.toStringTag](): CollectionIteratorName { return "CollectionIterator" }

    //#endregion -------------------- JavaScript methods --------------------

    //#endregion -------------------- Methods --------------------

}

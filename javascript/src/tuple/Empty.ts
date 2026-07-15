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

import type {EmptyArray, EmptySet} from "@joookiwi/type"

import type {Tuple}     from "./Tuple"
import type {TupleName} from "../type/toStringTag"

import {CollectionConstants}     from "../CollectionConstants"
import {EmptyCollectionHolder}   from "../EmptyCollectionHolder"
import {EmptyCollectionIterator} from "../iterator/EmptyCollectionIterator"

export class Empty
    implements Tuple<never> {

    //#region -------------------- Singleton usage --------------------

    static #instance?: Empty

    protected constructor() {}

    public static get get(): Empty {
        return Empty.#instance ??= new Empty()
    }

    //#endregion -------------------- Singleton usage --------------------

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
    //#region -------------------- Has ‥ --------------------

    public get hasNull(): false { return false }
    public get includesNull(): this["hasNull"] { return this.hasNull }
    public get containsNull(): this["hasNull"] { return this.hasNull }

    public get hasNoNulls(): true { return true }
    public get includesNoNulls(): this["hasNoNulls"] { return this.hasNoNulls }
    public get containsNoNulls(): this["hasNoNulls"] { return this.hasNoNulls }

    public get hasDuplicate(): false { return false }
    public get includesDuplicate(): this["hasDuplicate"] { return this.hasDuplicate }
    public get containsDuplicate(): this["hasDuplicate"] { return this.hasDuplicate }

    public get hasNoDuplicates(): true { return true }
    public get includesNoDuplicates(): this["hasNoDuplicates"] { return this.hasNoDuplicates }
    public get containsNoDuplicates(): this["hasNoDuplicates"] { return this.hasNoDuplicates }

    //#endregion -------------------- Has ‥ --------------------
    //#region -------------------- JavaScript methods --------------------

    public get [Symbol.toStringTag](): TupleName { return "Tuple" }

    //#endregion -------------------- JavaScript methods --------------------
    //#region -------------------- Conversion methods --------------------

    public toIterator(): EmptyCollectionIterator { return EmptyCollectionIterator.get }

    public toArray(): EmptyArray { return CollectionConstants.EMPTY_ARRAY }

    public toSet(): EmptySet { return CollectionConstants.EMPTY_SET }

    public toCollection(): EmptyCollectionHolder { return EmptyCollectionHolder.get }

    public toString(): string { return "Empty ()" }

    //#endregion -------------------- Conversion methods --------------------

}

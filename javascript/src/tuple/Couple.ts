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

import type {Set} from "@joookiwi/type"

import type {CollectionHolderOf2} from "../CollectionHolderOf2"

import {LateRetriever} from "../LateRetriever"
import {AbstractTuple} from "./AbstractTuple"

export class Couple<const T = unknown,
    const T1 extends T = T,
    const T2 extends T = T, >
    extends AbstractTuple<T> {

    //#region -------------------- Fields --------------------

    public readonly 0: T1
    public readonly 1: T2
    readonly #value1: T1
    readonly #value2: T2
    #array?: readonly [T1, T2,]
    #set?: Set<| T1 | T2>
    #collection?: CollectionHolderOf2<T, T1, T2>
    readonly #hasNull: boolean
    readonly #hasNoNulls: boolean
    readonly #hasDuplicate: boolean
    readonly #hasNoDuplicates: boolean

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor(value1: T1, value2: T2,) {
        super()
        this[0] = this.#value1 = value1
        this[1] = this.#value2 = value2
        this.#hasNoNulls = !(this.#hasNull = value1 == null || value2 == null)
        this.#hasNoDuplicates = !(this.#hasDuplicate = value1 as T === value2 as T)
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    /** The 1st value passed through the {@link constructor} held by this instance */
    public get value1(): T1 { return this.#value1 }

    /** The 2nd value passed through the {@link constructor} held by this instance */
    public get value2(): T2 { return this.#value2 }


    public override get size(): 2 { return 2 }

    public override get isEmpty(): false { return false }
    public override get isNotEmpty(): true { return true }

    public override get hasExactly1Element(): false { return false }
    public override get hasAtMost1Element(): false { return false }

    public override get hasAtLeast2Elements(): true { return true }
    public override get hasExactly2Elements(): true { return true }
    public override get hasAtMost2Elements(): true { return true }


    public override get hasNull(): boolean { return this.#hasNull }
    public override get hasNoNulls(): boolean { return this.#hasNoNulls }

    public override get hasDuplicate(): boolean { return this.#hasDuplicate }
    public override get hasNoDuplicates(): boolean { return this.#hasNoDuplicates }


    public override toArray(): readonly [T1, T2,] { return this.#array ??= Object.freeze([this.value1, this.value2,],) }

    public override toSet(): Set<| T1 | T2> { return this.#set ??= Object.freeze(new Set([this.value1, this.value2,],),) }

    public override toCollection(): CollectionHolderOf2<T, T1, T2> { return this.#collection ??= new LateRetriever.CollectionHolderOf2(this.value1, this.value2,) }

    public override toString(): string {
        const value1 = this.value1
        const value2 = this.value2
        return `(${value1 == null ? '' : value1}, ${value2 == null ? '' : value2})`
    }

    //#endregion -------------------- Methods --------------------

}

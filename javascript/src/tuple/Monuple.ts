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

import {AbstractTuple}       from "./AbstractTuple"
import {CollectionHolderOf1} from "../CollectionHolderOf1"

export class Monuple<const T = unknown, >
    extends AbstractTuple<T> {

    //#region -------------------- Fields --------------------

    public readonly 0: T
    readonly #value1: T
    #array?: readonly [T,]
    #set?: Set<T>
    #collection?: CollectionHolderOf1<T>
    readonly #hasNull: boolean
    readonly #hasNoNulls: boolean

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor(value: T,) {
        super()
        this.#hasNoNulls = !(this.#hasNull = (this[0] = this.#value1 = value) == null)
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    /** The value passed through the {@link constructor} held by this instance */
    public get value1(): T { return this.#value1 }


    public override get size(): 1 { return 1 }

    public override get isEmpty(): false { return false }
    public override get isNotEmpty(): true { return true }

    public override get hasExactly1Element(): true { return true }
    public override get hasAtMost1Element(): true { return true }

    public override get hasAtLeast2Elements(): false { return false }
    public override get hasExactly2Elements(): false { return false }
    public override get hasAtMost2Elements(): true { return true }


    public override get hasNull(): boolean { return this.#hasNull }
    public override get hasNoNulls(): boolean { return this.#hasNoNulls }

    public override get hasDuplicate(): false { return false }
    public override get hasNoDuplicates(): true { return true }


    public override toArray(): readonly [T,] { return this.#array ??= Object.freeze([this.value1,],) }

    public override toSet(): Set<T> { return this.#set ??= Object.freeze(new Set([this.value1,],),) }

    public override toCollection(): CollectionHolderOf1<T> { return this.#collection ??= new CollectionHolderOf1(this.value1,) }

    public override toString(): string {
        const value1 = this.value1
        return `Monuple (${value1 == null ? '' : value1})`
    }

    //#endregion -------------------- Methods --------------------

}

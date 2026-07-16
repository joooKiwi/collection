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

import type {CollectionHolderOf2}  from "../../src/CollectionHolderOf2"

import {Couple}               from "../../src/tuple/Couple"
import {AbstractTupleForTest} from "./AbstractTupleForTest"

/**
 * A class to test the functionality of a {@link Couple}
 *
 * @typeParam T The type
 */
export class Tuple_2<const T,
    const T1 extends T = T,
    const T2 extends T = T, >
    extends AbstractTupleForTest<T> {

    /** The internal instance that is tested */
    public readonly instance: Couple<T, T1, T2>

    public constructor(public readonly value1: T1, public readonly value2: T2,) {
        super()
        this.instance = new Couple(value1, value2,)
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
    //#region -------------------- Has ‥ --------------------

    public override get hasNull(): boolean { return this.instance.hasNull }
    public override get hasNoNulls(): boolean { return this.instance.hasNoNulls }

    public override get hasDuplicate(): boolean { return this.instance.hasDuplicate }
    public override get hasNoDuplicates(): boolean { return this.instance.hasNoDuplicates }

    //#endregion -------------------- Has ‥ --------------------
    //#region -------------------- Conversion methods --------------------

    public override toArray(): readonly [T1, T2,] { return this.instance.toArray() }

    public override toSet(): Set<| T1 | T2> { return this.instance.toSet() }

    public override toCollection(): CollectionHolderOf2<T, T1, T2> { return this.instance.toCollection() }

    public override toString(): string { return this.instance.toString() }

    //#endregion -------------------- Conversion methods --------------------

}

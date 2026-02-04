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

import type {Array, MutableSet} from "@joookiwi/type"

import type {MutableValueCallback} from "../set.types"

/**
 * An {@link globalThis.Set MutableSet} made for the tests
 * with all the methods that makes it not modifiable.
 *
 * @see SetByStructureForTest
 */
export class SetForTest<const T, >
    extends Set<T> {

    //#region -------------------- Fields --------------------

    public override readonly size: number
    public readonly array: Array<T>
    public readonly set: MutableSet<T>

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor(array: Array<T>,) {
        super()
        this.size = (this.array = array).length
        this.set = new Set(array,)
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Unsupported methods --------------------

    public override clear(..._: Array<unknown>): never { throw new Error("The method “clear” was not expected to be called in a test.") }

    public override add(..._: Array<unknown>): never { throw new Error("The method “add” was not expected to be called in a test.") }

    public override delete(..._: Array<unknown>): never { throw new Error("The method “delete” was not expected to be called in a test.") }

    //#endregion -------------------- Unsupported methods --------------------
    //#region -------------------- Supported methods --------------------

    public override has(value: T,): boolean { return this.set.has(value,) }

    public override forEach(callback: MutableValueCallback<T>,) { return this.set.forEach(callback,) }

    public override keys(): SetIterator<T> { return this.set.keys() }

    public override values(): SetIterator<T> { return this.set.values() }

    public override entries(): SetIterator<[T, T]> { return this.set.entries() }

    public override union<const U, >(other: ReadonlySetLike<U>,): MutableSet<| T | U> { return this.set.union(other,) }

    public override intersection<const U, >(other: ReadonlySetLike<U>,): MutableSet<& T & U> { return this.set.intersection(other,) }

    public override difference<const U, >(other: ReadonlySetLike<U>,): MutableSet<T> { return this.set.difference(other,) }

    public override symmetricDifference<const U, >(other: ReadonlySetLike<U>,): MutableSet<| T | U> { return this.set.symmetricDifference(other,) }

    public override isSubsetOf(other: ReadonlySetLike<unknown>,): boolean { return this.set.isSubsetOf(other,) }

    public override isSupersetOf(other: ReadonlySetLike<unknown>,): boolean { return this.set.isSupersetOf(other,) }

    public override isDisjointFrom(other: ReadonlySetLike<unknown>,): boolean { return this.set.isDisjointFrom(other,) }

    public override [Symbol.iterator](): ArrayIterator<T> { return this.set[Symbol.iterator]() }

    public override get [Symbol.toStringTag](): "Set" { return "Set" }

    public override toString(): string { return this.set.toString() }

    public override toLocaleString(): string { return this.set.toLocaleString() }

    //#endregion -------------------- Supported methods --------------------

    //#endregion -------------------- Methods --------------------

}

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

import type {Array, MutableSet, Set} from "@joookiwi/type"

import type {ValueCallback} from "../set.types"

/**
 * An {@link globalThis.ReadonlySet Set} made for the tests
 * with all the methods that makes it not modifiable.
 *
 * @see SetForTest
 */
export class SetByStructureForTest<const T, >
    implements ReadonlySet<T> {

    //#region -------------------- Fields --------------------

    public readonly size: number
    public readonly array: Array<T>
    public readonly set: Set<T>

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor(array: Array<T>,) {
        this.size = (this.array = array).length
        this.set = new Set(array,)
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    public has(value: T,): boolean { return this.set.has(value,) }

    public forEach(callback: ValueCallback<T>,) { return this.set.forEach(callback,) }

    public keys(): SetIterator<T> { return this.set.keys() }

    public values(): SetIterator<T> { return this.set.values() }

    public entries(): SetIterator<[T, T]> { return this.set.entries() }

    public union<const U, >(other: ReadonlySetLike<U>,): MutableSet<| T | U> { return this.set.union(other,) }

    public intersection<const U, >(other: ReadonlySetLike<U>,): MutableSet<& T & U> { return this.set.intersection(other,) }

    public difference<const U, >(other: ReadonlySetLike<U>,): MutableSet<T> { return this.set.difference(other,) }

    public symmetricDifference<const U, >(other: ReadonlySetLike<U>,): MutableSet<| T | U> { return this.set.symmetricDifference(other,) }

    public isSubsetOf(other: ReadonlySetLike<unknown>,): boolean { return this.set.isSubsetOf(other,) }

    public isSupersetOf(other: ReadonlySetLike<unknown>,): boolean { return this.set.isSupersetOf(other,) }

    public isDisjointFrom(other: ReadonlySetLike<unknown>,): boolean { return this.set.isDisjointFrom(other,) }

    public [Symbol.iterator](): ArrayIterator<T> { return this.set[Symbol.iterator]() }

    public get [Symbol.toStringTag](): "Set" { return "Set" }

    //#endregion -------------------- Methods --------------------

}

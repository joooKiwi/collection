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

import type {Array, Set} from "@joookiwi/type"

import type {CollectionHolder} from "../CollectionHolder"
import type {Tuple}            from "./Tuple"
import type {TupleName}        from "../type/toStringTag"

/**
 * A definition of a {@link Tuple} to have a common ancestor.
 * No state or reference is held in this instance.
 * Only the aliases methods have implementation.
 *
 * @apiNote This class is used when not specifically requiring an optimization on the methods, just the non-aliased methods calls
 * @note This class should be inherited if new classes are being made to be more usable by the tools
 * @typeParam T The type (by default `unknown`)
 * @see Empty
 * @see Monuple
 * @see Couple
 */
export abstract class AbstractTuple<const T, >
    implements Tuple<T> {

    protected constructor() {}

    //#region -------------------- Size methods --------------------

    public abstract readonly size: number
    public get length(): this["size"] { return this.size }
    public get count(): this["size"] { return this.size }

    public abstract readonly isEmpty: boolean
    public abstract readonly isNotEmpty: boolean

    public get hasAtLeast1Element(): this["isNotEmpty"] { return this.isNotEmpty }
    public get containsAtLeast1Element(): this["isNotEmpty"] { return this.isNotEmpty }
    public get includesAtLeast1Element(): this["isNotEmpty"] { return this.isNotEmpty }

    public abstract readonly hasExactly1Element: boolean
    public get containsExactly1Element(): this["hasExactly1Element"] { return this.hasExactly1Element }
    public get includesExactly1Element(): this["hasExactly1Element"] { return this.hasExactly1Element }

    public abstract readonly hasAtMost1Element: boolean
    public get containsAtMost1Element(): this["hasAtMost1Element"] { return this.hasAtMost1Element }
    public get includesAtMost1Element(): this["hasAtMost1Element"] { return this.hasAtMost1Element }

    public abstract readonly hasAtLeast2Elements: boolean
    public get containsAtLeast2Elements(): this["hasAtLeast2Elements"] { return this.hasAtLeast2Elements }
    public get includesAtLeast2Elements(): this["hasAtLeast2Elements"] { return this.hasAtLeast2Elements }

    public abstract readonly hasExactly2Elements: boolean
    public get containsExactly2Elements(): this["hasExactly2Elements"] { return this.hasExactly2Elements }
    public get includesExactly2Elements(): this["hasExactly2Elements"] { return this.hasExactly2Elements }

    public abstract readonly hasAtMost2Elements: boolean
    public get containsAtMost2Elements(): this["hasAtMost2Elements"] { return this.hasAtMost2Elements }
    public get includesAtMost2Elements(): this["hasAtMost2Elements"] { return this.hasAtMost2Elements }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Has ‥ --------------------

    public abstract readonly hasNull: boolean
    public get containsNull(): this["hasNull"] { return this.hasNull }
    public get includesNull(): this["hasNull"] { return this.hasNull }

    public abstract readonly hasNoNulls: boolean
    public get containsNoNulls(): this["hasNoNulls"] { return this.hasNoNulls }
    public get includesNoNulls(): this["hasNoNulls"] { return this.hasNoNulls }

    public abstract readonly hasDuplicate: boolean
    public get containsDuplicate(): this["hasDuplicate"] { return this.hasDuplicate }
    public get includesDuplicate(): this["hasDuplicate"] { return this.hasDuplicate }

    public abstract readonly hasNoDuplicates: boolean
    public get containsNoDuplicates(): this["hasNoDuplicates"] { return this.hasNoDuplicates }
    public get includesNoDuplicates(): this["hasNoDuplicates"] { return this.hasNoDuplicates }

    //#endregion -------------------- Has ‥ --------------------
    //#region -------------------- JavaScript methods --------------------

    public get [Symbol.toStringTag](): TupleName { return "Tuple" }

    //#endregion -------------------- JavaScript methods --------------------
    //#region -------------------- Conversion methods --------------------

    public abstract toArray(): Array<T>

    public abstract toSet(): Set<T>

    public abstract toCollection(): CollectionHolder<T>

    public abstract toString(): string

    //#endregion -------------------- Conversion methods --------------------

}

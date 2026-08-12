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

import type {NullOrNumber, NullOrZeroNumber} from "@joookiwi/type"

import type {CollectionIterator}                                                                   from "./CollectionIterator"
import type {IndexValueCallback, ValueIndexCallback}                                               from "../type/callback"
import type {PossibleIteratorValue}                                                                from "../type/iteratorValue"
import type {AfterLastValueInCollectionIteratorSymbol, BeforeFirstValueInCollectionIteratorSymbol} from "../type/symbol"
import type {CollectionIteratorName}                                                               from "../type/toStringTag"

/**
 * A definition of a {@link CollectionIterator} to have a common ancestor.
 * But requiring nothing out of the instance in comparison to the direct implementors.
 *
 * @note This class should be inherited if new classes are being made to be more usable by the tools
 * @typeParam T The element type
 * @see AbstractCollectionIterator
 * @see AbstractCollectionIteratorOf1
 * @see AbstractCollectionIteratorOf2
 */
export abstract class AbstractUnimplementedCollectionIterator<const T, >
    implements CollectionIterator<T> {

    //#region -------------------- Constructor --------------------

    protected constructor() {}

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Size methods --------------------

    public abstract readonly size: number
    public get length(): this["size"] { return this.size }
    public get count(): this["size"] { return this.size }


    public get isEmpty(): boolean { return this.size === 0 }
    public get isNotEmpty(): boolean { return this.size !== 0 }


    public get hasAtLeast1Element(): this["isNotEmpty"] { return this.isNotEmpty }
    public get includesAtLeast1Element(): this["isNotEmpty"] { return this.isNotEmpty }
    public get containsAtLeast1Element(): this["isNotEmpty"] { return this.isNotEmpty }


    public get hasExactly1Element(): boolean { return this.size === 1 }
    public get includesExactly1Element(): this["hasExactly1Element"] { return this.hasExactly1Element }
    public get containsExactly1Element(): this["hasExactly1Element"] { return this.hasExactly1Element }


    public get hasAtMost1Element(): boolean {
        const size = this.size

        return size === 0 || size === 1
    }
    public get includesAtMost1Element(): this["hasAtMost1Element"] { return this.hasAtMost1Element }
    public get containsAtMost1Element(): this["hasAtMost1Element"] { return this.hasAtMost1Element }


    public get hasAtLeast2Elements(): boolean { return this.size >= 2 }
    public get includesAtLeast2Elements(): this["hasAtLeast2Elements"] { return this.hasAtLeast2Elements }
    public get containsAtLeast2Elements(): this["hasAtLeast2Elements"] { return this.hasAtLeast2Elements }


    public get hasExactly2Elements(): boolean { return this.size === 2 }
    public get includesExactly2Elements(): this["hasExactly2Elements"] { return this.hasExactly2Elements }
    public get containsExactly2Elements(): this["hasExactly2Elements"] { return this.hasExactly2Elements }


    public get hasAtMost2Elements(): boolean {
        const size = this.size

        return size === 0 || size === 1 || size === 2
    }
    public get includesAtMost2Elements(): this["hasAtMost2Elements"] { return this.hasAtMost2Elements }
    public get containsAtMost2Elements(): this["hasAtMost2Elements"] { return this.hasAtMost2Elements }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- End-point index methods --------------------

    public abstract readonly firstIndex: NullOrZeroNumber

    public abstract readonly lastIndex: NullOrNumber

    //#endregion -------------------- End-point index methods --------------------
    //#region -------------------- Current methods --------------------

    public abstract readonly currentIndex: NullOrNumber

    public get index(): this["currentIndex"] { return this.currentIndex }

    //#endregion -------------------- Current methods --------------------
    //#region -------------------- Next methods --------------------

    public abstract readonly hasNext: boolean

    public abstract readonly nextIndex: NullOrNumber

    public abstract readonly nextValue: T

    public abstract next(): PossibleIteratorValue<T, AfterLastValueInCollectionIteratorSymbol>

    //#endregion -------------------- Next methods --------------------
    //#region -------------------- Previous methods --------------------

    public abstract readonly hasPrevious: boolean

    public abstract readonly previousIndex: NullOrNumber

    public abstract readonly previousValue: T

    public abstract previous(): PossibleIteratorValue<T, BeforeFirstValueInCollectionIteratorSymbol>

    //#endregion -------------------- Previous methods --------------------
    //#region -------------------- Reset methods --------------------

    public abstract reset(): void

    //#endregion -------------------- Reset methods --------------------

    //#region -------------------- Loop methods --------------------

    public abstract forEach(operation: ValueIndexCallback<T>,): this

    public abstract forEachIndexed(operation: IndexValueCallback<T>,): this

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- JavaScript methods --------------------

    public abstract [Symbol.iterator](): AbstractUnimplementedCollectionIterator<T>

    public get [Symbol.toStringTag](): CollectionIteratorName { return "CollectionIterator" }

    //#endregion -------------------- JavaScript methods --------------------

    //#endregion -------------------- Methods --------------------

}

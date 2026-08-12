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

import type {CollectionIterator}                                                                   from "../../src/iterator/CollectionIterator"
import type {IndexValueCallback, ValueIndexCallback}                                               from "../../src/type/callback"
import type {PossibleIteratorValue}                                                                from "../../src/type/iteratorValue"
import type {CollectionIteratorName}                                                               from "../../src/type/toStringTag"
import type {AfterLastValueInCollectionIteratorSymbol, BeforeFirstValueInCollectionIteratorSymbol} from "../../src/type/symbol"
import type {CollectionIteratorForTest}                                                            from "./CollectionIteratorForTest"

/**
 * A bare-bone implementation of a {@link CollectionIteratorForTest} with nothing implemented
 *
 * @typeParam T The type
 */
export abstract class AbstractCollectionIteratorForTest<const T, >
    implements CollectionIteratorForTest<T> {

    protected constructor() {}

    //#region -------------------- Test utility methods --------------------

    public execute(action: (instance: this,) => void,): this {
        action(this,)
        return this
    }


    public do1Next(): this {
        this.next()
        return this
    }

    public do2Next(): this {
        this.next()
        this.next()
        return this
    }

    public do1Previous(): this {
        this.previous()
        return this
    }

    public do2Previous(): this {
        this.previous()
        this.previous()
        return this
    }


    public do1PreviousAnd1Next(): this {
        this.previous()
        this.next()
        return this
    }

    public do1PreviousAnd2Next(): this {
        this.previous()
        this.next()
        this.next()
        return this
    }

    public do2PreviousAnd1Next(): this {
        this.previous()
        this.previous()
        this.next()
        return this
    }

    public do2PreviousAnd2Next(): this {
        this.previous()
        this.previous()
        this.next()
        this.next()
        return this
    }


    public do1NextAnd1Previous(): this {
        this.next()
        this.previous()
        return this
    }

    public do1NextAnd2Previous(): this {
        this.next()
        this.previous()
        this.previous()
        return this
    }

    public do2NextAnd1Previous(): this {
        this.next()
        this.next()
        this.previous()
        return this
    }

    public do2NextAnd2Previous(): this {
        this.next()
        this.next()
        this.previous()
        this.previous()
        return this
    }

    //#endregion -------------------- Test utility methods --------------------
    //#region -------------------- Size methods --------------------

    public abstract readonly size: number

    public get length(): never {
        throw new Error("The getter method “length” was not expected to be called.",)
    }

    public get count(): never {
        throw new Error("The getter method “count” was not expected to be called.",)
    }


    public abstract readonly isEmpty: boolean

    public abstract readonly isNotEmpty: boolean


    public get hasAtLeast1Element(): never {
        throw new Error("The getter method “hasAtLeast1Element” was not expected to be called.",)
    }

    public get containsAtLeast1Element(): never {
        throw new Error("The getter method “containsAtLeast1Element” was not expected to be called.",)
    }

    public get includesAtLeast1Element(): never {
        throw new Error("The getter method “includesAtLeast1Element” was not expected to be called.",)
    }


    public abstract readonly hasExactly1Element: boolean

    public get containsExactly1Element(): never {
        throw new Error("The getter method “containsExactly1Element” was not expected to be called.",)
    }

    public get includesExactly1Element(): never {
        throw new Error("The getter method “includesExactly1Element” was not expected to be called.",)
    }


    public abstract readonly hasAtMost1Element: boolean

    public get containsAtMost1Element(): never {
        throw new Error("The getter method “containsAtMost1Element” was not expected to be called.",)
    }

    public get includesAtMost1Element(): never {
        throw new Error("The getter method “includesAtMost1Element” was not expected to be called.",)
    }


    public abstract readonly hasAtLeast2Elements: boolean

    public get containsAtLeast2Elements(): never {
        throw new Error("The getter method “containsAtLeast2Elements” was not expected to be called.",)
    }

    public get includesAtLeast2Elements(): never {
        throw new Error("The getter method “includesAtLeast2Elements” was not expected to be called.",)
    }


    public abstract readonly hasExactly2Elements: boolean

    public get containsExactly2Elements(): never {
        throw new Error("The getter method “containsExactly2Elements” was not expected to be called.",)
    }

    public get includesExactly2Elements(): never {
        throw new Error("The getter method “includesExactly2Elements” was not expected to be called.",)
    }


    public abstract readonly hasAtMost2Elements: boolean

    public get containsAtMost2Elements(): never {
        throw new Error("The getter method “containsAtMost2Elements” was not expected to be called.",)
    }

    public get includesAtMost2Elements(): never {
        throw new Error("The getter method “includesAtMost2Elements” was not expected to be called.",)
    }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- End-point index methods --------------------

    public abstract readonly firstIndex: NullOrZeroNumber

    public abstract readonly lastIndex: NullOrNumber

    //#endregion -------------------- End-point index methods --------------------
    //#region -------------------- Current methods --------------------

    public abstract readonly currentIndex: NullOrNumber

    public get index(): never {
        throw new Error("The getter method “index” was not expected to be called.",)
    }

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

    public abstract [Symbol.iterator](): CollectionIterator<T>

    public get [Symbol.toStringTag](): CollectionIteratorName { return "CollectionIterator" }

    //#endregion -------------------- JavaScript methods --------------------

}

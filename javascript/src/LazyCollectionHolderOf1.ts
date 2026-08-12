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

import {AbstractCollectionHolderOf1} from "./AbstractCollectionHolderOf1"

const FAIL_CALLBACK: () => never = () => { throw new ReferenceError("This callback is never supposed to be called normally.",) }

/**
 * An instance of [CollectionHolder] with only a single value but lazily retrieved.
 *
 * It does retrieve the value only once from the callback received in its `constructor`.
 *
 * @typeParam T The type (by default `unknown`)
 * @see CollectionHolderOf1
 * @see ArrayOf1AsCollectionHolder
 */
export class LazyCollectionHolderOf1<const T = unknown, >
    extends AbstractCollectionHolderOf1<T> {

    //#region -------------------- Field --------------------

    #lateValue: () => T
    #value?: T
    #isValueInitialized: boolean
    #hasNull?: boolean
    #hasNoNulls?: boolean

    //#endregion -------------------- Field --------------------
    //#region -------------------- Constructor --------------------

    public constructor(lateValue: () => T,) {
        super()
        this.#lateValue = lateValue
        this.#isValueInitialized = false
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    /** The internal value passed through the {@link constructor} */
    public override get 0() { return this.value }

    /** The internal value passed through the {@link constructor} */
    public override get value(): T {
        if (this.#isValueInitialized)
            return this.#value as T

        const value = this.#value = this.#lateValue()
        this.#lateValue = FAIL_CALLBACK // We do not need the callback anymore once the value has been retrieved
        this.#isValueInitialized = true
        return value
    }

    public override get hasNull(): boolean { return this.#hasNull ?? super.hasNull }

    public override get hasNoNulls(): boolean { return this.#hasNoNulls ?? super.hasNoNulls }

    //#endregion -------------------- Methods --------------------

}

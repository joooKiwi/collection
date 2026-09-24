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

import type {Nullable, NullOr} from "@joookiwi/type"

import type {CollectionHolder}    from "./CollectionHolder"
import type {CollectionHolderOf2} from "./CollectionHolderOf2"
import type {Optional}            from "./optional/Optional"

import {AbstractCollectionHolderOf2}   from "./AbstractCollectionHolderOf2"
import {DualValueCollectionHolder}     from "./DualValueCollectionHolder"
import {LazyCollectionHolderOf0Or1Or2} from "./LazyCollectionHolderOf0Or1Or2"
import {Couple}                        from "./tuple/Couple"

const FAIL_CALLBACK: () => never = () => { throw new ReferenceError("This callback is never supposed to be called normally.",) }

/**
 * An instance of [CollectionHolder] with 2 values but lazily retrieved.
 *
 * It does retrieve the value only once from the callback received in its `constructor`.
 *
 * @typeParam T1 The 1st type (`unknown` by default)
 * @typeParam T2 The 2nd type (`unknown` by default)
 * @see DualValueCollectionHolder
 * @see ArrayOf2AsCollectionHolder
 * @see SetOf2AsCollectionHolder
 */
export class LazyCollectionHolderOf2<const T1 = unknown,
    const T2 = unknown, >
    extends AbstractCollectionHolderOf2<T1, T2> {

    //#region -------------------- Field --------------------

    #lateValues: () => Couple<T1, T2>
    #values?: NullOr<Couple<T1, T2>>
    #value1?: T1
    #isValue1Initialized: boolean
    #value2?: T2
    #isValue2Initialized: boolean

    #hasNull?: boolean
    #hasNoNulls?: boolean
    #hasDuplicate?: boolean
    #hasNoDuplicates?: boolean

    //#endregion -------------------- Field --------------------
    //#region -------------------- Constructor --------------------

    public constructor(lateValues: () => Couple<T1, T2>,) {
        super()
        this.#lateValues = lateValues
        this.#isValue1Initialized = this.#isValue2Initialized = false
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    protected override _createCouple<const U1, const U2, >(value1: U1, value2: U2,): Couple<U1, U2> {
        return new Couple(value1, value2,)
    }

    protected override _create2(value2: T2, value1: T1,): CollectionHolderOf2<T2, T1> {
        return new DualValueCollectionHolder(value2, value1,)
    }

    protected _createLazy2<const U1, const U2, >(lateValue: () => Couple<U1, U2>,): CollectionHolderOf2<U1, U2> {
        return new LazyCollectionHolderOf2(lateValue,)
    }

    protected override _create0Or1Or2<const U1, const U2, >(latePossibleValue: () => Nullable<Couple<Optional<| U1 | U2>, Optional<U2>>>,): CollectionHolder<| U1 | U2> {
        return new LazyCollectionHolderOf0Or1Or2(latePossibleValue,)
    }


    /** The internal 1st value (out of 2) passed through the {@link constructor} */
    public get 0(): T1 { return this.value1 }

    /** The internal 2nd value (out of 2) passed through the {@link constructor} */
    public get 1(): T2 { return this.value2 }

    /** The internal 1st value (out of 2) passed through the {@link constructor} */
    public override get value1(): T1 {
        if (this.#isValue1Initialized)
            return this.#value1 as T1

        // The second value can never initialize the "values" since it does set the "value1" by setting its "value2
        const value = this.#value1 = (this.#values = this.#lateValues()).value1
        this.#isValue1Initialized = true
        return value
    }

    /** The internal 2nd value (out of 2) passed through the {@link constructor} */
    public override get value2(): T2 {
        if (this.#isValue2Initialized)
            return this.#value2 as T2

        if (this.#isValue1Initialized) {
            // We just initialize the "value2" and unset everything else.
            // And the "values" are expected to be initialized
            const value = this.#value2 = this.#values!.value2
            this.#lateValues = FAIL_CALLBACK // We do not need the callback anymore once the value has been retrieved
            this.#values = null
            this.#isValue2Initialized = true
            return value
        }

        // We initialize "value1" and "value2" and then unset everything else
        const values = this.#lateValues()
        this.#value1 = values.value1
        const value = this.#value2 = values.value2
        this.#isValue1Initialized = this.#isValue2Initialized = true
        this.#lateValues = FAIL_CALLBACK // We do not need the callback anymore once the value has been retrieved
        return value
    }

    public override get hasNull(): boolean { return this.#hasNull ?? super.hasNull }

    public override get hasNoNulls(): boolean { return this.#hasNoNulls ?? super.hasNoNulls }

    public override get hasDuplicate(): boolean { return this.#hasDuplicate ?? super.hasDuplicate }

    public override get hasNoDuplicates(): boolean { return this.#hasNoDuplicates ?? super.hasNoDuplicates }

    //#endregion -------------------- Methods --------------------

}

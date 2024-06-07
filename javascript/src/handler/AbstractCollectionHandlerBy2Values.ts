/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {PossibleIterableOrCollection} from "../CollectionHolder.types"
import type {CollectionHolder}             from "../CollectionHolder"
import type {ValueHolder}                  from "./value/ValueHolder"

import {AbstractCollectionHandler}               from "./AbstractCollectionHandler"
import {NaNIndexValueHolder}                     from "./value/NaNIndexValueHolder"
import {NegativeInfinityIndexValueHolder}        from "./value/NegativeInfinityIndexValueHolder"
import {Not0Or1IndexValueHolder}                 from "./value/Not0Or1IndexValueHolder"
import {Not0Or1IndexAfterCalculationValueHolder} from "./value/Not0Or1IndexAfterCalculationValueHolder"
import {PositiveInfinityIndexValueHolder}        from "./value/PositiveInfinityIndexValueHolder"
import {ValidValueHolder}                        from "./value/ValidValueHolder"

/** @beta */
export abstract class AbstractCollectionHandlerBy2Values<const out T = unknown,
    const out REFERENCE extends PossibleIterableOrCollection<T> = PossibleIterableOrCollection<T>,
    const out COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends AbstractCollectionHandler<T, REFERENCE, COLLECTION> {

    //#region -------------------- Fields --------------------

    #hasNull?: boolean
    #hasDuplicate?: boolean

    #hasFirstValueRetrieved: boolean
    #hasSecondValueRetrieved: boolean

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    protected constructor(collection: COLLECTION, reference: REFERENCE,) {
        super(collection, reference,)
        this.#hasFirstValueRetrieved = this.#hasSecondValueRetrieved = false
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    public override get size(): 2 { return 2 }

    public override get isEmpty(): false { return false }

    public override get hasNull(): boolean { return this.#hasNull ??= this._first == null || this._second == null }

    public override get hasDuplicate(): boolean { return this.#hasDuplicate ??= this._first === this._second }


    /** The first value of the {@link _reference reference} */
    protected abstract get _first(): T

    /**
     * Tell that the {@link _first first value} has been retrieved and set
     *
     * @note This is independent of the {@link _second second value}
     */
    protected get _hasFirstValueRetrieved(): boolean { return this.#hasFirstValueRetrieved }

    /** Set trigger to the {@link _first first value} being handle to the {@link value} received */
    protected set _hasFirstValueRetrieved(value: boolean,) { this.#hasFirstValueRetrieved = value }


    /** The second value of the {@link _reference reference} */
    protected abstract get _second(): T

    /**
     * Tell that the {@link _second second value} has been retrieved and set
     *
     * @note This is independent of the {@link _first first value}
     */
    protected get _hasSecondValueRetrieved(): boolean { return this.#hasSecondValueRetrieved }

    /** Set trigger to the {@link _second second value} being handle to the {@link value} received */
    protected set _hasSecondValueRetrieved(value: boolean,) { this.#hasSecondValueRetrieved = value }

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    public override get(index: number,): ValueHolder<T> {
        if (Number.isNaN(index,))
            return new NaNIndexValueHolder(index,)
        if (index == Number.NEGATIVE_INFINITY)
            return new NegativeInfinityIndexValueHolder(index,)
        if (index == Number.POSITIVE_INFINITY)
            return new PositiveInfinityIndexValueHolder(index,)

        if (index > 1)
            return new Not0Or1IndexValueHolder(index,)
        if (index < -2)
            return new Not0Or1IndexAfterCalculationValueHolder(index,)

        let indexToRetrieve = index
        if (index < 0)
            indexToRetrieve += 2

        if (indexToRetrieve == 0) {
            const collection = this._collection
            if (0 in collection)
                return new ValidValueHolder(collection[0] as T,)

            const value = collection[0] = this._first
            if (this._hasSecondValueRetrieved)
                this._hasFinished = true
            this._hasFirstValueRetrieved = true
            return new ValidValueHolder(value,)
        }

        const collection = this._collection
        if (1 in collection)
            return new ValidValueHolder(collection[1] as T,)

        const value = collection[1] = this._second
        if (this._hasFirstValueRetrieved)
            this._hasFinished = true
        this._hasSecondValueRetrieved = true
        return new ValidValueHolder(value,)
    }

    //#endregion -------------------- Methods --------------------

}

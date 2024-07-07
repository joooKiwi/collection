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

export abstract class AbstractCollectionHandlerBy2Values<const out T = unknown,
    const out REFERENCE extends PossibleIterableOrCollection<T> = PossibleIterableOrCollection<T>,
    const out COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends AbstractCollectionHandler<T, REFERENCE, COLLECTION> {

    //#region -------------------- Fields --------------------

    #hasNull?: boolean
    #hasDuplicate?: boolean
    #hasFinished: boolean

    #hasFirstValueRetrieved: boolean
    #first?: T
    #hasSecondValueRetrieved: boolean
    #second?: T

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    protected constructor(collection: COLLECTION, reference: REFERENCE,) {
        super(collection, reference,)
        this.#hasFinished = this.#hasFirstValueRetrieved = this.#hasSecondValueRetrieved = false
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter & setter methods --------------------

    public override get size(): 2 { return 2 }
    public override get isEmpty(): false { return false }

    public override get hasNull(): boolean {
        const value = this.#hasNull
        if (value != null)
            return value

        if (this.hasFinished)
            return this.#hasNull = this.#__first == null || this.#__second == null

        const collection = this._collection
        const firstValue = collection[0] = this.#__first
        this._hasFirstValueRetrieved = true
        if (firstValue == null)
            return this.#hasNull = true

        const secondValue = collection[1] = this.#__second
        this._hasSecondValueRetrieved = true
        this._hasFinished = true
        if (secondValue == null)
            return this.#hasNull = true
        return this.#hasNull = false
    }

    public override get hasDuplicate(): boolean {
        const value = this.#hasDuplicate
        if (value != null)
            return value

        if (this.hasFinished)
            return this.#hasDuplicate = this.#__first === this.#__second

        const collection = this._collection
        const firstValue = collection[0] = this.#__first
        const secondValue = collection[1] = this.#__second
        this._hasFinished = this._hasFirstValueRetrieved = this._hasSecondValueRetrieved = true
        return this.#hasDuplicate = firstValue === secondValue
    }

    public override get hasFinished(): boolean { return this._hasFinished }
    /** Tell if the {@link AbstractCollectionHandlerBy2Values handler} has finished processing both values */
    protected get _hasFinished(): boolean { return this.#hasFinished }
    /** The {@link AbstractCollectionHandlerBy2Values handler} has finished processing both values */
    protected set _hasFinished(value: true,) { this.#hasFinished = value }


    /** The first value of the {@link _reference reference} */
    protected abstract get _first(): T

    get #__first(): T {
        if (this._hasFirstValueRetrieved)
            return this.#first as T

        this._hasFirstValueRetrieved = true
        return this.#first = this._first
    }

    /**
     * Tell that the {@link _first first value} has been retrieved and set
     *
     * @note This is independent of the {@link _second second value}
     */
    protected get _hasFirstValueRetrieved(): boolean { return this.#hasFirstValueRetrieved }

    /** The {@link _first first value} has been retrieved */
    protected set _hasFirstValueRetrieved(value: true,) { this.#hasFirstValueRetrieved = value }


    /** The second value of the {@link _reference reference} */
    protected abstract get _second(): T

    get #__second(): T {
        if (this._hasSecondValueRetrieved)
            return this.#second as T

        this._hasSecondValueRetrieved = true
        return this.#second = this._second
    }

    /**
     * Tell that the {@link _second second value} has been retrieved and set
     *
     * @note This is independent of the {@link _first first value}
     */
    protected get _hasSecondValueRetrieved(): boolean { return this.#hasSecondValueRetrieved }

    /** The {@link _second second value} has been retrieved */
    protected set _hasSecondValueRetrieved(value: true,) { this.#hasSecondValueRetrieved = value }

    //#endregion -------------------- Getter & setter methods --------------------
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

            const value = collection[0] = this.#__first
            if (this._hasSecondValueRetrieved)
                this._hasFinished = true
            this._hasFirstValueRetrieved = true
            return new ValidValueHolder(value,)
        }

        const collection = this._collection
        if (1 in collection)
            return new ValidValueHolder(collection[1] as T,)

        const value = collection[1] = this.#__second
        if (this._hasFirstValueRetrieved)
            this._hasFinished = true
        this._hasSecondValueRetrieved = true
        return new ValidValueHolder(value,)
    }

    //#endregion -------------------- Methods --------------------

}

/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}             from "../CollectionHolder"
import type {ValueHolder}                  from "./value/ValueHolder"
import type {PossibleIterableOrCollection} from "../type/possibleInstance"

import {AbstractCollectionHandler}                 from "./AbstractCollectionHandler"
import {NaNIndexValueHolder}                       from "./value/NaNIndexValueHolder"
import {NegativeInfinityIndexValueHolder}          from "./value/NegativeInfinityIndexValueHolder"
import {Not0IndexValueHolder}                      from "./value/Not0IndexValueHolder"
import {Not0IndexAfterCalculationValueHolder}      from "./value/Not0IndexAfterCalculationValueHolder"
import {PositiveInfinityIndexValueHolder}          from "./value/PositiveInfinityIndexValueHolder"
import {ValidValueHolder}                          from "./value/ValidValueHolder"

export abstract class AbstractCollectionHandlerBy1Value<const T = unknown,
    const REFERENCE extends PossibleIterableOrCollection<T> = PossibleIterableOrCollection<T>,
    const COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends AbstractCollectionHandler<T, REFERENCE, COLLECTION> {

    //#region -------------------- Fields --------------------


    #hasNull?: boolean
    #hasFinished: boolean

    #hasFirstValueRetrieved: boolean
    #first?: T

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    protected constructor(collection: COLLECTION, reference: REFERENCE,) {
        super(collection,reference,)
        this.#hasFirstValueRetrieved = this.#hasFinished = false
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter & setter methods --------------------

    public override get size(): 1 { return 1 }
    public override get isEmpty(): false { return false }

    public override get hasNull(): boolean {
        const value = this.#hasNull
        if (value != null)
            return value

        if (this.hasFinished)
            return this.#hasNull = this._first == null

        const firstValue = this._collection[0] = this._first
        this._hasFinished = true
        return this.#hasNull = firstValue == null
    }

    public override get hasDuplicate(): false { return false }

    public override get hasFinished(): boolean { return this._hasFinished }
    /** Tell if the {@link AbstractCollectionHandlerBy1Value handler} has finished processing the single value */
    protected get _hasFinished(): boolean { return this.#hasFinished }
    /** The {@link AbstractCollectionHandlerBy1Value handler} has finished processing the single value */
    protected set _hasFinished(value: true,) { this.#hasFinished = value }


    get #__first(): T {
        if (this._hasFirstValueRetrieved)
            return this.#first as T

        this._hasFirstValueRetrieved = true
        return this.#first = this._retrieveFirst()
    }

    protected get _first(): T { return this.#__first }

    /** Retrieve the first value of the {@link _reference reference} */
    protected abstract _retrieveFirst(): T

    /** Tell that the {@link _retrieveFirst first value} has been retrieved and set */
    protected get _hasFirstValueRetrieved(): boolean { return this.#hasFirstValueRetrieved }

    /** The {@link _retrieveFirst first value} has been retrieved */
    protected set _hasFirstValueRetrieved(value: true,) { this.#hasFirstValueRetrieved = value }


    //#region -------------------- Getter & setter methods --------------------
    //#region -------------------- Methods --------------------

    public override get(index: number,): ValueHolder<T> {
        if (Number.isNaN(index,))
            return new NaNIndexValueHolder(index,)
        if (index == Number.NEGATIVE_INFINITY)
            return new NegativeInfinityIndexValueHolder(index,)
        if (index == Number.POSITIVE_INFINITY)
            return new PositiveInfinityIndexValueHolder(index,)

        if (index > 0)
            return new Not0IndexValueHolder(index,)
        if (index < -1)
            return new Not0IndexAfterCalculationValueHolder(index,)

        const collection = this._collection
        if (0 in collection)
            return new ValidValueHolder(collection[0] as T,)

        const value = collection[0] = this._first
        this._hasFinished = true
        return new ValidValueHolder(value,)
    }


    //#endregion -------------------- Methods --------------------

}

/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {PossibleIterableOrCollection} from "../CollectionHolder.types"
import type {CollectionHolder}             from "../CollectionHolder"
import type {ValueHolder}                  from "./value/ValueHolder"

import {AbstractCollectionHandler}                 from "./AbstractCollectionHandler"
import {NaNIndexValueHolder}                       from "./value/NaNIndexValueHolder"
import {NegativeInfinityIndexValueHolder}          from "./value/NegativeInfinityIndexValueHolder"
import {Not0IndexValueHolder}                      from "./value/Not0IndexValueHolder"
import {Not0IndexAfterCalculationValueHolder}      from "./value/Not0IndexAfterCalculationValueHolder"
import {PositiveInfinityIndexValueHolder}          from "./value/PositiveInfinityIndexValueHolder"
import {ValidValueHolder}                          from "./value/ValidValueHolder"

/** @beta */
export abstract class AbstractCollectionHandlerBy1Value<const out T = unknown,
    const out REFERENCE extends PossibleIterableOrCollection<T> = PossibleIterableOrCollection<T>,
    const out COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends AbstractCollectionHandler<T, REFERENCE, COLLECTION> {

    //#region -------------------- Fields --------------------

    #hasNull?: boolean

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Getter methods --------------------

    public override get size(): 1 { return 1 }
    public override get isEmpty(): false { return false }
    public override get hasNull(): boolean { return this.#hasNull ??= this._first == null }
    public override get hasDuplicate(): false { return false }

    /** The first value of the {@link _reference reference} */
    protected abstract get _first(): T

    //#region -------------------- Getter methods --------------------
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

/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder} from "../CollectionHolder"
import type {ValueHolder}      from "./value/ValueHolder"

import {AbstractCollectionHandler}                 from "./AbstractCollectionHandler"
import {EmptyCollectionValueHolder}                from "./value/EmptyCollectionValueHolder"
import {NaNIndexValueHolder}                       from "./value/NaNIndexValueHolder"
import {NegativeInfinityIndexValueHolder}          from "./value/NegativeInfinityIndexValueHolder"
import {OverSizeIndexValueHolder}                  from "./value/OverSizeIndexValueHolder"
import {OverSizeIndexAfterCalculationValueHolder}  from "./value/OverSizeIndexAfterCalculationValueHolder"
import {PositiveInfinityIndexValueHolder}          from "./value/PositiveInfinityIndexValueHolder"
import {ValidValueHolder}                          from "./value/ValidValueHolder"
import {UnderZeroIndexAfterCalculationValueHolder} from "./value/UnderZeroIndexAfterCalculationValueHolder"

/**
 * An implementation of a {@link CollectionHolder} for an {@link ReadonlySet set}
 *
 * @beta
 * @see CollectionHandlerBySetOf1
 * @see CollectionHandlerBySetOf2
 */
export class CollectionHandlerBySet<const out T = unknown,
    const out REFERENCE extends ReadonlySet<T> = ReadonlySet<T>,
    const out COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    extends AbstractCollectionHandler<T, REFERENCE, COLLECTION> {

    //#region -------------------- Fields --------------------

    #iterator?: IterableIterator<T>
    readonly #size: REFERENCE["size"]
    readonly #isEmpty: boolean
    #lastIndex?: number

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor(collection: COLLECTION, reference: REFERENCE,) {
        super(collection, reference,)
        this.#isEmpty = (this.#size = reference.size) == 0
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter & setter methods --------------------

    public get size(): REFERENCE["size"] { return this.#size }

    public override get isEmpty(): boolean { return this.#isEmpty }

    public override get hasDuplicate(): false { return false }

    protected get _iterator(): IterableIterator<T> { return this.#iterator ??= this._reference[Symbol.iterator]() }

    /** The last index retrieved from the value */
    protected get _lastIndex(): number { return this.#lastIndex ?? 0 }

    /** Set the last index retrieved from the value */
    protected set _lastIndex(value: number,) { this.#lastIndex = value }

    //#endregion -------------------- Getter & setter methods --------------------

    public override get(index: number,): ValueHolder<T> {
        if (this.isEmpty)
            return new EmptyCollectionValueHolder(index,)

        if (Number.isNaN(index,))
            return new NaNIndexValueHolder(index,)
        if (index == Number.NEGATIVE_INFINITY)
            return new NegativeInfinityIndexValueHolder(index,)
        if (index == Number.POSITIVE_INFINITY)
            return new PositiveInfinityIndexValueHolder(index,)

        const collection = this._collection
        if (index in collection)
            return new ValidValueHolder(collection[index] as T,)

        const size = this.size
        if (index > size)
            return new OverSizeIndexValueHolder(index, size,)

        if (index >= 0) {
            if (this.hasFinished)
                return new ValidValueHolder(collection[index] as T,)

            const iterator = this._iterator
            const indexPlus1 = index + 1
            let indexToFind = this._lastIndex - 1
            while (++indexToFind < indexPlus1)
                collection[indexToFind] = iterator.next().value

            if (indexToFind == size)
                this._hasFinished = true

            return new ValidValueHolder(collection[(this._lastIndex = indexToFind) - 1] as T,)
        }

        const indexToRetrieve = index < 0 ? size + index : index
        if (indexToRetrieve < 0)
            return new UnderZeroIndexAfterCalculationValueHolder(index, indexToRetrieve,)
        if (indexToRetrieve > size)
            return new OverSizeIndexAfterCalculationValueHolder(index, indexToRetrieve, size,)

        if (this.hasFinished)
            return new ValidValueHolder(collection[this._lastIndex - 1] as T,)

        const iterator = this._iterator
        const indexToRetrievePlus1 = indexToRetrieve + 1
        let indexToFind = this._lastIndex - 1
        while (++indexToFind < indexToRetrievePlus1)
            collection[indexToFind] = iterator.next().value

        if (indexToFind == size)
            this._hasFinished = true

        return new ValidValueHolder(collection[(this._lastIndex = indexToFind) - 1] as T,)
    }

}

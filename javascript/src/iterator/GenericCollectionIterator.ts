/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {IndexValueCallback, ValueIndexCallback}                                                                       from "../CollectionHolder.types"
import type {MinimalistCollectionHolder}                                                                                   from "../MinimalistCollectionHolder"
import type {CollectionIterator}                                                                                           from "./CollectionIterator"
import type {AfterLastValueInCollectionIteratorSymbol, BeforeFirstValueInCollectionIteratorSymbol, CollectionIteratorName} from "./CollectionIterator.types"

import {CollectionConstants}                       from "../CollectionConstants"
import {NoElementFoundInCollectionHolderException} from "../exception/NoElementFoundInCollectionHolderException"
import {GenericAfterLastIteratorValue}             from "./value/GenericAfterLastIteratorValue"
import {GenericBeforeFirstIteratorValue}           from "./value/GenericBeforeFirstIteratorValue"
import {GenericIteratorValue}                      from "./value/GenericIteratorValue"

export class GenericCollectionIterator<const out T = unknown, const out COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >
    implements CollectionIterator<T> {//TODO add reverse loop on first call

    //#region -------------------- Fields --------------------

    readonly #collection: COLLECTION
    #currentIndex: NullOrNumber

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor(collection: COLLECTION,) {
        this.#collection = collection
        this.#currentIndex = null
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter & setter methods --------------------

    public get collection(): COLLECTION {
        return this.#collection
    }


    public get size(): COLLECTION["size"] { return this.#size ??= this.collection.size }
    public get length(): this["size"] { return this.size }
    public get count(): this["size"] { return this.size }


    public get currentIndex(): NullOrNumber { return this._currentIndex }

    /** Get the index that the {@link GenericCollectionIterator} is at */
    protected get _currentIndex(): NullOrNumber { return this.#currentIndex }

    /**
     * Set the index that the {@link GenericCollectionIterator} is at
     *
     * @param value The value to set
     */
    protected set _currentIndex(value: NullOrNumber,) { this.#currentIndex = value }


    public get nextIndex(): number {
        return this._index + 1
    }
    public get index(): NullOrNumber { return this.currentIndex }

    public get previousIndex(): number {
        return this._index - 1
    }


    public get hasPrevious(): boolean {
        return this._index > 0
    }

    public get hasNext(): boolean {
        return this._index < this.size
    }

    //#endregion -------------------- Getter & setter methods --------------------
    //#region -------------------- Methods --------------------

    public next(): IteratorResult<T, AfterLastValueInCollectionIteratorSymbol> {
        if (this.hasNext)
            return new GenericIteratorValue(this.collection, this._index++,)
        return GenericAfterLastIteratorValue.get
    }

    public get nextValue(): T {
        const nextValue = this.next().value
        if (nextValue === CollectionConstants.AFTER_LAST_VALUE_IN_ITERATOR_SYMBOL)
            throw new NoElementFoundInCollectionHolderException("The collection iterator is at or after the end of the line.",)
        return nextValue
    }


    public previous(): IteratorResult<T, BeforeFirstValueInCollectionIteratorSymbol> {
        if (this.hasPrevious)
            return new GenericIteratorValue(this.collection, --this._index,)
        return GenericBeforeFirstIteratorValue.get
    }

    public get previousValue(): T {
        const nextValue = this.previous().value
        if (nextValue === CollectionConstants.BEFORE_FIRST_VALUE_IN_ITERATOR_SYMBOL)
            throw new NoElementFoundInCollectionHolderException("The collection iterator is at or before the start of the line.",)
        return nextValue
    }


    public reset(): this {
        this._currentIndex = null
        return this
    }

    //#region -------------------- Loop methods --------------------

    public forEach(operation: ValueIndexCallback<T>,): this {
        const collection = this.collection
        const size = this.size

        let index = this._index - 1
        while (++index < size)
            operation(collection.get(index,), index,)
        this._index = index
        return this
    }

    public forEachIndexed(operation: IndexValueCallback<T>,): this {
        const collection = this.collection
        const size = this.size

        let index = this._index - 1
        while (++index < size)
            operation(index, collection.get(index,),)
        this._index = index
        return this
    }

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Javascript methods --------------------

    public [Symbol.iterator](): CollectionIterator<T> {
        return new GenericCollectionIterator(this.collection,)
    }

    public get [Symbol.toStringTag](): CollectionIteratorName {
        return "CollectionIterator"
    }

    //#endregion -------------------- Javascript methods --------------------

    //#endregion -------------------- Methods --------------------

}

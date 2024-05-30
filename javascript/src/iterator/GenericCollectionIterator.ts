/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {NullOrNumber} from "@joookiwi/type"

import type {IndexValueCallback, ValueIndexCallback}                                                                       from "../CollectionHolder.types"
import type {MinimalistCollectionHolder}                                                                                   from "../MinimalistCollectionHolder"
import type {CollectionIterator}                                                                                           from "./CollectionIterator"
import type {AfterLastValueInCollectionIteratorSymbol, BeforeFirstValueInCollectionIteratorSymbol, CollectionIteratorName} from "./CollectionIterator.types"

import {NoElementFoundInCollectionHolderException} from "../exception/NoElementFoundInCollectionHolderException"
import {GenericAfterLastIteratorValue}             from "./value/GenericAfterLastIteratorValue"
import {GenericBeforeFirstIteratorValue}           from "./value/GenericBeforeFirstIteratorValue"
import {GenericIteratorValue}                      from "./value/GenericIteratorValue"

export class GenericCollectionIterator<const out T = unknown,
    const out COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >
    implements CollectionIterator<T> {

    //#region -------------------- Fields --------------------

    readonly #collection: COLLECTION
    #size?: COLLECTION["size"]
    #currentIndex: NullOrNumber

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor(collection: COLLECTION,) {
        this.#collection = collection
        this.#currentIndex = null
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter & setter methods --------------------

    public get collection(): COLLECTION { return this.#collection }

    //#region -------------------- Size methods --------------------

    public get size(): COLLECTION["size"] { return this.#size ??= this.collection.size }
    public get length(): this["size"] { return this.size }
    public get count(): this["size"] { return this.size }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Current index methods --------------------

    public get currentIndex(): NullOrNumber { return this._currentIndex }

    /** Get the index that the {@link GenericCollectionIterator} is at */
    protected get _currentIndex(): NullOrNumber { return this.#currentIndex }

    /**
     * Set the index that the {@link GenericCollectionIterator} is at
     *
     * @param value The value to set
     */
    protected set _currentIndex(value: NullOrNumber,) { this.#currentIndex = value }


    public get index(): NullOrNumber { return this.currentIndex }

    //#endregion -------------------- Current index methods --------------------
    //#region -------------------- Current index or default methods --------------------

    protected get _currentIndexFromStart(): number { return this._currentIndex ?? 0 }

    protected set _currentIndexFromStart(value: number,) { this._currentIndex = value }

    protected get _indexFromEnd(): number { return this._currentIndex ?? this.size - 1 }

    protected set _indexFromEnd(value: number,) { this._currentIndex = value }

    //#endregion -------------------- Current index or default methods --------------------
    //#region -------------------- Sibling index methods --------------------

    public get nextIndex(): number { return this._currentIndexFromStart + 1 }

    public get previousIndex(): number { return this._indexFromEnd - 1 }

    //#endregion -------------------- Sibling index methods --------------------
    //#region -------------------- Preview methods --------------------

    public get hasNext(): boolean { return this._currentIndexFromStart < this.size }

    public get hasPrevious(): boolean { return this._indexFromEnd > 0 }

    //#endregion -------------------- Preview methods --------------------

    //#endregion -------------------- Getter & setter methods --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Next methods --------------------

    public next(): IteratorResult<T, AfterLastValueInCollectionIteratorSymbol> {
        if (this.hasNext)
            return new GenericIteratorValue(this.collection, this._currentIndexFromStart++,)
        return GenericAfterLastIteratorValue.get
    }

    public get nextValue(): T {
        if (this.hasNext)
            return this.collection.get(this._currentIndexFromStart++,)
        throw new NoElementFoundInCollectionHolderException("The collection iterator is at or after the end of the line.",)
    }

    //#endregion -------------------- Next methods --------------------
    //#region -------------------- Previous methods --------------------

    public previous(): IteratorResult<T, BeforeFirstValueInCollectionIteratorSymbol> {
        if (this.hasPrevious)
            return new GenericIteratorValue(this.collection, --this._indexFromEnd,)
        return GenericBeforeFirstIteratorValue.get
    }

    public get previousValue(): T {
        if (this.hasPrevious)
            return this.collection.get(--this._indexFromEnd,)
        throw new NoElementFoundInCollectionHolderException("The collection iterator is at or before the start of the line.",)
    }

    //#endregion -------------------- Previous methods --------------------

    public reset(): this {
        this._currentIndex = null
        return this
    }

    //#region -------------------- Loop methods --------------------

    public forEach(operation: ValueIndexCallback<T>,): this {
        const collection = this.collection
        const size = this.size

        let index = this._currentIndexFromStart - 1
        while (++index < size)
            operation(collection.get(index,), index,)
        this._currentIndex = index
        return this
    }

    public forEachIndexed(operation: IndexValueCallback<T>,): this {
        const collection = this.collection
        const size = this.size

        let index = this._currentIndexFromStart - 1
        while (++index < size)
            operation(index, collection.get(index,),)
        this._currentIndex = index
        return this
    }

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Javascript methods --------------------

    public [Symbol.iterator](): CollectionIterator<T> { return new GenericCollectionIterator(this.collection,) }

    public get [Symbol.toStringTag](): CollectionIteratorName { return "CollectionIterator" }

    //#endregion -------------------- Javascript methods --------------------

    //#endregion -------------------- Methods --------------------

}

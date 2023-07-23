/******************************************************************************
 * Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi                             *
 *                                                                            *
 * This project is free to use.                                               *
 * All the right is reserved to the author of this project.                   *
 ******************************************************************************/

import type {CollectionHolder}                       from "../CollectionHolder"
import type {IndexValueCallback, ValueIndexCallback} from "../CollectionHolder.types"
import type {CollectionIterator}                     from "./CollectionIterator"
import type {CollectionIteratorName}                 from "./CollectionIterator.types"

import {CollectionConstants} from "../CollectionConstants"

export class GenericCollectionIterator<const out T = unknown, const out COLLECTION extends CollectionHolder<T> = CollectionHolder<T>, >
    implements CollectionIterator<T> {

    //#region -------------------- Fields --------------------

    readonly #collection: COLLECTION
    #index: number

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor(collection: COLLECTION,) {
        this.#collection = collection
        this.#index = 0
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    public get collection(): COLLECTION {
        return this.#collection
    }

    public get size(): this["collection"]["size"] {
        return this.collection.size
    }

    public get length(): this["collection"]["size"] {
        return this.size
    }

    public get count(): this["collection"]["size"] {
        return this.size
    }


    public get index(): number {
        return this.#index
    }

    public get nextIndex(): number {
        return this.index + 1
    }

    public get previousIndex(): number {
        return this.index - 1
    }


    public get hasPrevious(): boolean {
        const index = this.index
        return index > 0 && index <= this.size
    }

    public get hasNext(): boolean {
        return this.index < this.size
    }

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    public next(): IteratorResult<T, never> {
        const $this = this

        if (!this.hasNext) {
            return {
                done: true,
                get value(): never {
                    throw new ReferenceError(`No value exist after the last element (after the index ${$this.size - 1}).`,)
                },
            } satisfies IteratorReturnResult<never>
        }

        const indexToRetrieve = this.#index++
        return {
            done: false,
            get value() {
                return $this.collection.get(indexToRetrieve,)
            },
        } satisfies IteratorYieldResult<T>
    }

    public previous(): IteratorResult<T, never> {
        const $this = this

        if (!this.hasPrevious) {
            return {
                done: true,
                get value(): never {
                    throw new ReferenceError(`No value exist before the first element`,)
                },
            } satisfies IteratorReturnResult<never>
        }

        const indexToRetrieve = --this.#index
        return {
            done: false,
            get value() {
                return $this.collection.get(indexToRetrieve,)
            },
        } satisfies IteratorYieldResult<T>
    }

    //#region -------------------- Loop methods --------------------

    public forEach(operation: ValueIndexCallback<T>,): this {
        const collection = this.collection,
            size = this.size

        let index = this.index - 1
        while (++index < size)
            operation(collection.get(index,), index,)
        this.#index = index
        return this
    }

    public forEachIndexed(operation: IndexValueCallback<T>,): this {
        const collection = this.collection,
            size = this.size

        let index = this.index - 1
        while (++index < size)
            operation(index, collection.get(index,),)
        this.#index = index
        return this
    }

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Javascript methods --------------------

    public [Symbol.iterator](): CollectionIterator<T> {
        return new GenericCollectionIterator(this.collection,)
    }

    public get [Symbol.toStringTag](): CollectionIteratorName {
        return CollectionConstants.COLLECTION_ITERATOR_TO_STRING_TAG
    }

    //#endregion -------------------- Javascript methods --------------------

    //#endregion -------------------- Methods --------------------

}

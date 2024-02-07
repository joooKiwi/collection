/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {PossibleIterableOrCollection} from "./CollectionHolder.types"
import type {Nullable}                     from "./general type"
import type {IterableWithCount}            from "./iterable/IterableWithCount"
import type {IterableWithLength}           from "./iterable/IterableWithLength"
import type {IterableWithPossibleSize}     from "./iterable/IterableWithPossibleSize"
import type {IterableWithSize}             from "./iterable/IterableWithSize"
import type {CollectionIterator}           from "./iterator/CollectionIterator"

import {AbstractMinimalistCollectionHolder}        from "./AbstractMinimalistCollectionHolder"
import {CollectionConstants}                       from "./CollectionConstants"
import {MinimalistCollectionHolder}                from "./MinimalistCollectionHolder"
import {CollectionHolderIndexOutOfBoundsException} from "./exception/CollectionHolderIndexOutOfBoundsException"
import {EmptyCollectionHolderException}            from "./exception/EmptyCollectionHolderException"
import {isCollectionIterator}                      from "./method/isCollectionIterator"
import {isMinimalistCollectionHolder}              from "./method/isMinimalistCollectionHolder"


export class GenericMinimalistCollectionHolder<const out T = unknown, const out REFERENCE extends PossibleIterableOrCollection<T> = PossibleIterableOrCollection<T>, >
    extends AbstractMinimalistCollectionHolder<T> {

    //#region -------------------- Fields --------------------

    readonly #size: number
    readonly #isEmpty: boolean

    readonly #reference: REFERENCE
    readonly #array: readonly T[]

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor(array: readonly T[],)
    public constructor(lateArray: () => readonly T[],)
    public constructor(set: ReadonlySet<T>,)
    public constructor(lateSet: () => ReadonlySet<T>,)
    public constructor(collectionHolder: MinimalistCollectionHolder<T>,)
    public constructor(lateCollectionHolder: () => MinimalistCollectionHolder<T>,)
    public constructor(collectionIterable: CollectionIterator<T>,)
    public constructor(lateCollectionIterable: () => CollectionIterator<T>,)
    public constructor(iterableWithSize: IterableWithSize<T>,)
    public constructor(lateIterableWithSize: () => IterableWithSize<T>,)
    public constructor(iterableWithLength: IterableWithLength<T>,)
    public constructor(lateIterableWithLength: () => IterableWithLength<T>,)
    public constructor(iterableWithCount: IterableWithCount<T>,)
    public constructor(lateIterableWithCount: () => IterableWithCount<T>,)
    public constructor(iterableWithPossibleSize: IterableWithPossibleSize<T>,)
    public constructor(lateIterableWithPossibleSize: () => IterableWithPossibleSize<T>,)
    public constructor(iterable: Iterable<T>,)
    public constructor(lateIterable: () => Iterable<T>,)
    public constructor(reference: REFERENCE,)
    public constructor(lateReference: () => REFERENCE,)
    public constructor(reference: | REFERENCE | (() => REFERENCE),)
    public constructor(reference: | REFERENCE | (() => REFERENCE),) {
        super()
        // README: The code is based on the GenericCollectionHolder constructor, but with less things handled
        //         Also, the eager instantiation has some weird shenanigan to keep its nature pure.
        //         And, to be efficient, there is some duplicate code in the constructor.

        reference = this.#reference = reference instanceof Function ? reference() : reference

        if (reference instanceof Array) {
            const size = this.#size = reference.length
            //#region -------------------- Initialization (empty) --------------------

            if (size == 0) {
                this.#isEmpty = true
                this.#array = CollectionConstants.EMPTY_ARRAY
                return
            }

            //#endregion -------------------- Initialization (empty) --------------------
            //#region -------------------- Initialization (non-empty) --------------------

            this.#isEmpty = false

            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                this.#array = Object.freeze([reference[0],],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = over 1) --------------------

            const array = new Array<T>(size,)
            let index = size
            while (index-- > 0)
                array[index] = reference[index]
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 1) --------------------

            //#endregion -------------------- Initialization (non-empty) --------------------
        }

        if (reference instanceof Set) {
            const size = this.#size = reference.size
            //#region -------------------- Initialization (empty) --------------------

            if (size == 0) {
                this.#isEmpty = true
                this.#array = CollectionConstants.EMPTY_ARRAY
                return
            }

            //#endregion -------------------- Initialization (empty) --------------------
            //#region -------------------- Initialization (non-empty) --------------------

            this.#isEmpty = false

            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                this.#array = Object.freeze([reference[Symbol.iterator]().next().value,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = over 1) --------------------

            const array = new Array<T>(size,)
            const iterator = reference[Symbol.iterator]() as IterableIterator<T>
            let index = -1
            while (++index < size)
                array[index] = iterator.next().value
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 1) --------------------

            //#endregion -------------------- Initialization (non-empty) --------------------
        }

        if (isMinimalistCollectionHolder<T>(reference)) {
            const size = this.#size = reference.size
            //#region -------------------- Initialization (empty) --------------------

            if (this.#isEmpty = reference.isEmpty) {
                this.#array = CollectionConstants.EMPTY_ARRAY
                return
            }

            //#endregion -------------------- Initialization (empty) --------------------
            //#region -------------------- Initialization (non-empty) --------------------

            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                this.#array = Object.freeze([reference.get(0,),],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = over 1) --------------------

            const array = [] as T[]
            let index = size
            while (index-- > 0)
                array[index] = reference.get(index,)
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 1) --------------------

            //#endregion -------------------- Initialization (non-empty) --------------------
        }

        if (isCollectionIterator<T>(reference,)) {
            const size = this.#size = reference.size
            //#region -------------------- Initialization (empty) --------------------

            if (this.#isEmpty = size == 0) {
                this.#array = CollectionConstants.EMPTY_ARRAY
                return
            }

            //#endregion -------------------- Initialization (empty) --------------------
            //#region -------------------- Initialization (non-empty) --------------------

            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                this.#array = Object.freeze([reference.nextValue,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = over 1) --------------------

            const array = [] as T[]
            let index = -1
            while (++index < size)
                array[index] = reference.nextValue
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 1) --------------------

            //#endregion -------------------- Initialization (non-empty) --------------------
        }

        sizeIf:if ("size" in reference || "length" in reference || "count" in reference) {
            // @ts-ignore: We only retrieve the nullable number
            const size = (reference?.size ?? reference?.length ?? reference?.count) as Nullable<number>
            if (size == null) // No size is present, we continue as a normal iterable
                break sizeIf
            this.#size = size

            //#region -------------------- Initialization (empty) --------------------

            if (this.#isEmpty = size == 0) {
                this.#array = CollectionConstants.EMPTY_ARRAY
                return
            }

            //#endregion -------------------- Initialization (empty) --------------------
            //#region -------------------- Initialization (non-empty) --------------------

            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1)
                this.#array = Object.freeze([reference[Symbol.iterator]().next().value,],)

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = over 1) --------------------

            const array = [] as T[],
                iterator = reference[Symbol.iterator]() as IterableIterator<T>
            let index = -1,
                iteratorResult: IteratorResult<T, T>
            while (++index, !(iteratorResult = iterator.next()).done)
                array[index] = iteratorResult.value
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 1) --------------------

            //#endregion -------------------- Initialization (non-empty) --------------------
        }

        const iterator = reference[Symbol.iterator]() as IterableIterator<T>
        let iteratorResult = iterator.next() as IteratorResult<T, T>
        //#region -------------------- Initialization (empty) --------------------

        if (iteratorResult.done) {
            this.#size = 0
            this.#isEmpty = true
            this.#array = CollectionConstants.EMPTY_ARRAY
            return
        }

        //#endregion -------------------- Initialization (empty) --------------------
        //#region -------------------- Initialization (non-empty) --------------------

        const array = [] as T[]
        this.#isEmpty = false
        array[0] = iteratorResult.value
        let size = 0
        while (++size, !(iteratorResult = iterator.next()).done)
            array[size] = iteratorResult.value
        this.#size = size
        this.#array = Object.freeze(array,)

        //#endregion -------------------- Initialization (non-empty) --------------------
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods & getter methods --------------------

    /** The iterable received in the constructor */
    protected get _reference(): REFERENCE {
        return this.#reference
    }

    /** The {@link Array} stored (from the construction) for the current {@link GenericCollectionHolder collection} */
    protected get _array(): readonly T[] {
        return this.#array
    }

    public override get size(): number {
        return this.#size
    }

    public override get isEmpty(): boolean {
        return this.#isEmpty
    }

    public override get(index: number,): T {
        if (this.isEmpty)
            throw new EmptyCollectionHolderException("No element at any index could be found since it it empty.", index,)

        const array = this._array
        if (index in array)
            return array[index] as T

        const size = this.size
        if (index > size)
            throw new CollectionHolderIndexOutOfBoundsException(`The index "${index}" is over the size of the collection (${size}).`, index,)
        if (index >= 0)
            return array[index] as T

        const indexToRetrieve = size + index
        if (indexToRetrieve < 0)
            throw new CollectionHolderIndexOutOfBoundsException(`The index "${index}" (${indexToRetrieve} after calculation) is under 0.`, index,)
        if (indexToRetrieve > size)
            throw new CollectionHolderIndexOutOfBoundsException(`The index "${index}" (${indexToRetrieve} after calculation) is over the size of the collection (${size}).`, index,)
        return array[indexToRetrieve] as T
    }

    //#endregion -------------------- Methods & getter methods --------------------

}

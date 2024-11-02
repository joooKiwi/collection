/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}                                                         from "./CollectionHolder"
import type {IterableWithCount}                                                        from "./iterable/IterableWithCount"
import type {IterableWithLength}                                                       from "./iterable/IterableWithLength"
import type {IterableWithPossibleSize}                                                 from "./iterable/IterableWithPossibleSize"
import type {IterableWithSize}                                                         from "./iterable/IterableWithSize"
import type {CollectionIterator}                                                       from "./iterator/CollectionIterator"
import type {PossibleIterableArraySetOrCollectionHolder, PossibleIterableOrCollection} from "./type/possibleInstance"

import {AbstractMinimalistCollectionHolder}        from "./AbstractMinimalistCollectionHolder"
import {CollectionConstants}                       from "./CollectionConstants"
import {MinimalistCollectionHolder}                from "./MinimalistCollectionHolder"
import {CollectionHolderIndexOutOfBoundsException} from "./exception/CollectionHolderIndexOutOfBoundsException"
import {EmptyCollectionHolderException}            from "./exception/EmptyCollectionHolderException"
import {ForbiddenIndexException}                   from "./exception/ForbiddenIndexException"
import {isArray}                                   from "./method/isArray"
import {isArrayByStructure}                        from "./method/isArrayByStructure"
import {isCollectionHolder}                        from "./method/isCollectionHolder"
import {isCollectionHolderByStructure}             from "./method/isCollectionHolderByStructure"
import {isCollectionIterator}                      from "./method/isCollectionIterator"
import {isCollectionIteratorByStructure}           from "./method/isCollectionIteratorByStructure"
import {isMinimalistCollectionHolder}              from "./method/isMinimalistCollectionHolder"
import {isMinimalistCollectionHolderByStructure}   from "./method/isMinimalistCollectionHolderByStructure"
import {isSet}                                     from "./method/isSet"
import {isSetByStructure}                          from "./method/isSetByStructure"

export class GenericMinimalistCollectionHolder<const T = unknown,
    const REFERENCE extends PossibleIterableOrCollection<T> = PossibleIterableArraySetOrCollectionHolder<T>, >
    extends AbstractMinimalistCollectionHolder<T> {

    //#region -------------------- Fields --------------------

    readonly #size: number

    readonly #reference: REFERENCE
    readonly #array: readonly T[]

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor(array: readonly T[],)
    public constructor(lateArray: () => readonly T[],)
    public constructor(set: ReadonlySet<T>,)
    public constructor(lateSet: () => ReadonlySet<T>,)
    public constructor(collectionHolder: CollectionHolder<T>,)
    public constructor(lateCollectionHolder: () => CollectionHolder<T>,)
    public constructor(minimalistCollectionHolder: MinimalistCollectionHolder<T>,)
    public constructor(lateMinimalistCollectionHolder: () => MinimalistCollectionHolder<T>,)
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

        if (reference instanceof Function)
            reference = reference()
        this.#reference = reference

        //#region -------------------- initialization by a known instance --------------------

        if (isArray(reference,)) {
            const size = this.#size = reference.length
            //#region -------------------- Initialization (empty) --------------------

            if (size == 0) {
                this.#array = CollectionConstants.EMPTY_ARRAY
                return
            }

            //#endregion -------------------- Initialization (empty) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                this.#array = Object.freeze([reference[0] as T,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                this.#array = Object.freeze([reference[0] as T, reference[1] as T,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array = new Array<T>(size,)
            let index = size
            while (index-- > 0)
                array[index] = reference[index] as T
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 2) --------------------
        }

        if (isSet<T>(reference,)) {
            const size = this.#size = reference.size
            //#region -------------------- Initialization (empty) --------------------

            if (size == 0) {
                this.#array = CollectionConstants.EMPTY_ARRAY
                return
            }

            //#endregion -------------------- Initialization (empty) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                this.#array = Object.freeze([reference[Symbol.iterator]().next().value as T,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                const iterator = reference[Symbol.iterator]()
                this.#array = Object.freeze([iterator.next().value as T, iterator.next().value as T,],)
                return
            }

            //#endregion -------------------- Initialization (size = 2) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array = new Array<T>(size,)
            const iterator = reference[Symbol.iterator]()
            let index = -1
            while (++index < size)
                array[index] = iterator.next().value as T
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 2) --------------------
        }

        if (isCollectionHolder<T>(reference,)) {
            const size = this.#size = reference.size
            //#region -------------------- Initialization (empty) --------------------

            if (reference.isEmpty) {
                this.#array = CollectionConstants.EMPTY_ARRAY
                return
            }

            //#endregion -------------------- Initialization (empty) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                this.#array = Object.freeze([reference.getFirst(),],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                this.#array = Object.freeze([reference.getFirst(), reference.getLast(),],)
                return
            }

            //#endregion -------------------- Initialization (size = 2) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array: T[] = []
            let index = size
            while (index-- > 0)
                array[index] = reference.get(index,)
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 2) --------------------
        }

        if (isMinimalistCollectionHolder<T>(reference,)) {
            const size = this.#size = reference.size
            //#region -------------------- Initialization (empty) --------------------

            if (size == 0) {
                this.#array = CollectionConstants.EMPTY_ARRAY
                return
            }

            //#endregion -------------------- Initialization (empty) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                this.#array = Object.freeze([reference.get(0,),],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                this.#array = Object.freeze([reference.get(0,), reference.get(1,),],)
                return
            }

            //#endregion -------------------- Initialization (size = 2) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array: T[] = []
            let index = size
            while (index-- > 0)
                array[index] = reference.get(index,)
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 2) --------------------
        }

        if (isCollectionIterator<T>(reference,)) {
            const size = this.#size = reference.size
            //#region -------------------- Initialization (empty) --------------------

            if (size == 0) {
                this.#array = CollectionConstants.EMPTY_ARRAY
                return
            }

            //#endregion -------------------- Initialization (empty) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                this.#array = Object.freeze([reference.nextValue,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                this.#array = Object.freeze([reference.nextValue, reference.nextValue,],)
                return
            }

            //#endregion -------------------- Initialization (size = 2) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array: T[] = []
            let index = size
            while (index-- > 0)
                array[index] = reference.previousValue
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 2) --------------------
        }

        //#endregion -------------------- initialization by a known instance --------------------
        //#region -------------------- initialization by a structure --------------------

        if (isArrayByStructure<T>(reference,)) {
            const size = this.#size = reference.length
            //#region -------------------- Initialization (empty) --------------------

            if (size == 0) {
                this.#array = CollectionConstants.EMPTY_ARRAY
                return
            }

            //#endregion -------------------- Initialization (empty) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                this.#array = Object.freeze([reference[0] as T,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                this.#array = Object.freeze([reference[0] as T, reference[1] as T,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array = new Array<T>(size,)
            let index = size
            while (index-- > 0)
                array[index] = reference[index] as T
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 2) --------------------
        }

        if (isSetByStructure<T>(reference,)) {
            const size = this.#size = reference.size
            //#region -------------------- Initialization (empty) --------------------

            if (size == 0) {
                this.#array = CollectionConstants.EMPTY_ARRAY
                return
            }

            //#endregion -------------------- Initialization (empty) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                this.#array = Object.freeze([reference[Symbol.iterator]().next().value as T,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                const iterator = reference[Symbol.iterator]()
                this.#array = Object.freeze([iterator.next().value as T, iterator.next().value as T,],)
                return
            }

            //#endregion -------------------- Initialization (size = 2) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array = new Array<T>(size,)
            const iterator = reference[Symbol.iterator]()
            let index = -1
            while (++index < size)
                array[index] = iterator.next().value as T
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 2) --------------------
        }

        if (isCollectionHolderByStructure<T>(reference,)) {
            const size = this.#size = reference.size
            //#region -------------------- Initialization (empty) --------------------

            if (reference.isEmpty) {
                this.#array = CollectionConstants.EMPTY_ARRAY
                return
            }

            //#endregion -------------------- Initialization (empty) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                this.#array = Object.freeze([reference.getFirst(),],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                this.#array = Object.freeze([reference.getFirst(), reference.getLast(),],)
                return
            }

            //#endregion -------------------- Initialization (size = 2) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array: T[] = []
            let index = size
            while (index-- > 0)
                array[index] = reference.get(index,)
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 2) --------------------
        }

        if (isMinimalistCollectionHolderByStructure<T>(reference,)) {
            const size = this.#size = reference.size
            //#region -------------------- Initialization (empty) --------------------

            if (size == 0) {
                this.#array = CollectionConstants.EMPTY_ARRAY
                return
            }

            //#endregion -------------------- Initialization (empty) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                this.#array = Object.freeze([reference.get(0,),],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                this.#array = Object.freeze([reference.get(0,), reference.get(1,),],)
                return
            }

            //#endregion -------------------- Initialization (size = 2) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array: T[] = []
            let index = size
            while (index-- > 0)
                array[index] = reference.get(index,)
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 2) --------------------
        }

        if (isCollectionIteratorByStructure<T>(reference,)) {
            const size = this.#size = reference.size
            //#region -------------------- Initialization (empty) --------------------

            if (size == 0) {
                this.#array = CollectionConstants.EMPTY_ARRAY
                return
            }

            //#endregion -------------------- Initialization (empty) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                this.#array = Object.freeze([reference.nextValue,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                this.#array = Object.freeze([reference.nextValue, reference.nextValue,],)
                return
            }

            //#endregion -------------------- Initialization (size = 2) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array: T[] = []
            let index = size
            while (index-- > 0)
                array[index] = reference.previousValue
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 2) --------------------
        }

        //#endregion -------------------- initialization by a structure --------------------

        sizeIf: if ("size" in reference) {
            const size = reference.size
            if (size == null) // No size is present, we continue as a normal iterable
                break sizeIf
            this.#size = size

            //#region -------------------- Initialization (empty) --------------------

            if (size == 0) {
                this.#array = CollectionConstants.EMPTY_ARRAY
                return
            }

            //#endregion -------------------- Initialization (empty) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1)
                this.#array = Object.freeze([reference[Symbol.iterator]().next().value,],)

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                const iterator: Iterator<T, unknown, unknown> = reference[Symbol.iterator]()
                this.#array = Object.freeze([iterator.next().value as T, iterator.next().value as T,],)
            }

            //#endregion -------------------- Initialization (size = 2) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array: T[] = []
            const iterator: Iterator<T, unknown, unknown> = reference[Symbol.iterator]()
            let index = -1
            let iteratorResult: IteratorResult<T, unknown>
            while (++index, !(iteratorResult = iterator.next()).done)
                array[index] = iteratorResult.value
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 2) --------------------
        }

        sizeIf: if ("length" in reference) {
            const size = reference.length
            if (size == null) // No size is present, we continue as a normal iterable
                break sizeIf
            this.#size = size

            //#region -------------------- Initialization (empty) --------------------

            if (size == 0) {
                this.#array = CollectionConstants.EMPTY_ARRAY
                return
            }

            //#endregion -------------------- Initialization (empty) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1)
                this.#array = Object.freeze([reference[Symbol.iterator]().next().value,],)

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                const iterator: Iterator<T, unknown, unknown> = reference[Symbol.iterator]()
                this.#array = Object.freeze([iterator.next().value as T, iterator.next().value as T,],)
            }

            //#endregion -------------------- Initialization (size = 2) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array: T[] = []
            const iterator: Iterator<T, unknown, unknown> = reference[Symbol.iterator]()
            let index = -1
            let iteratorResult: IteratorResult<T, unknown>
            while (++index, !(iteratorResult = iterator.next()).done)
                array[index] = iteratorResult.value
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 2) --------------------
        }

        countIf: if ("count" in reference) {
            const size = reference.count
            if (size == null) // No size is present, we continue as a normal iterable
                break countIf
            this.#size = size

            //#region -------------------- Initialization (empty) --------------------

            if (size == 0) {
                this.#array = CollectionConstants.EMPTY_ARRAY
                return
            }

            //#endregion -------------------- Initialization (empty) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1)
                this.#array = Object.freeze([reference[Symbol.iterator]().next().value,],)

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                const iterator: Iterator<T, unknown, unknown> = reference[Symbol.iterator]()
                this.#array = Object.freeze([iterator.next().value as T, iterator.next().value as T,],)
            }

            //#endregion -------------------- Initialization (size = 2) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array: T[] = []
            const iterator: Iterator<T, unknown, unknown> = reference[Symbol.iterator]()
            let index = -1
            let iteratorResult: IteratorResult<T, unknown>
            while (++index, !(iteratorResult = iterator.next()).done)
                array[index] = iteratorResult.value
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 2) --------------------
        }

        const iterator: Iterator<T, unknown, unknown> = reference[Symbol.iterator]()
        let iteratorResult = iterator.next()
        //#region -------------------- Initialization (empty) --------------------

        if (iteratorResult.done) {
            this.#size = 0
            this.#array = CollectionConstants.EMPTY_ARRAY
            return
        }

        //#endregion -------------------- Initialization (empty) --------------------
        //#region -------------------- Initialization (non-empty) --------------------

        const array: T[] = []
        array[0] = iteratorResult.value
        let size = 0
        while (++size, !(iteratorResult = iterator.next()).done)
            array[size] = iteratorResult.value
        this.#size = size
        this.#array = Object.freeze(array,)

        //#endregion -------------------- Initialization (non-empty) --------------------
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

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

    public override get(index: number,): T {
        const size = this.size
        if (size == 0)
            throw new EmptyCollectionHolderException(null, index,)

        if (Number.isNaN(index,))
            throw new ForbiddenIndexException("Forbidden index. The index cannot be NaN.", index,)
        if (index == Number.NEGATIVE_INFINITY)
            throw new ForbiddenIndexException("Forbidden index. The index cannot be -∞.", index,)
        if (index == Number.POSITIVE_INFINITY)
            throw new ForbiddenIndexException("Forbidden index. The index cannot be +∞.", index,)

        const array = this._array
        if (index in array)
            return array[index] as T

        if (index > size)
            throw new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The index "${index}" is over the size of the collection (${size}).`, index,)
        if (index == size)
            throw new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The index "${index}" is the size of the collection (${size}).`, index,)
        if (index >= 0)
            return array[index] as T

        const indexToRetrieve = size + index
        if (indexToRetrieve < 0)
            throw new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The index "${index}" (${indexToRetrieve} after calculation) is under 0.`, index,)
        if (indexToRetrieve > size)
            throw new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The index "${index}" (${indexToRetrieve} after calculation) is over the size of the collection (${size}).`, index,)
        return array[indexToRetrieve] as T
    }

    //#endregion -------------------- Methods --------------------

}

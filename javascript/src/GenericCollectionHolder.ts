/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {NullOr} from "@joookiwi/type"

import type {CollectionHolder}                                                                                            from "./CollectionHolder"
import type {IndexWithReturnCallback, ObjectOf, PossibleIterableArraySetOrCollectionHolder, PossibleIterableOrCollection} from "./CollectionHolder.types"
import type {MinimalistCollectionHolder}                                                                                  from "./MinimalistCollectionHolder"
import type {IterableWithCount}                                                                                           from "./iterable/IterableWithCount"
import type {IterableWithLength}                                                                                          from "./iterable/IterableWithLength"
import type {IterableWithPossibleSize}                                                                                    from "./iterable/IterableWithPossibleSize"
import type {IterableWithSize}                                                                                            from "./iterable/IterableWithSize"
import type {CollectionIterator}                                                                                          from "./iterator/CollectionIterator"

import {AbstractCollectionHolder}                  from "./AbstractCollectionHolder"
import {CollectionConstants}                       from "./CollectionConstants"
import {CollectionHolderIndexOutOfBoundsException} from "./exception/CollectionHolderIndexOutOfBoundsException"
import {EmptyCollectionHolderException}            from "./exception/EmptyCollectionHolderException"
import {ForbiddenIndexException}                   from "./exception/ForbiddenIndexException"
import {isArrayByStructure}                        from "./method/isArrayByStructure"
import {isCollectionIterator}                      from "./method/isCollectionIterator"
import {isCollectionIteratorByStructure}           from "./method/isCollectionIteratorByStructure"
import {isCollectionHolder}                        from "./method/isCollectionHolder"
import {isCollectionHolderByStructure}             from "./method/isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}              from "./method/isMinimalistCollectionHolder"
import {isMinimalistCollectionHolderByStructure}   from "./method/isMinimalistCollectionHolderByStructure"
import {isSetByStructure}                          from "./method/isSetByStructure"

/**
 * A {@link CollectionHolder} having the values eagerly retrieved.
 *
 * Meaning that every value is retrieved during the construction,
 * and it will never change after the initialization.
 *
 * But it is not {@link Object.isFrozen frozen} to ensure
 * the children can do their initialization.
 *
 * @see LazyGenericCollectionHolder
 * @see EmptyCollectionHolder
 */
export class GenericCollectionHolder<const T = unknown,
    const REFERENCE extends PossibleIterableOrCollection<T> = PossibleIterableArraySetOrCollectionHolder<T>, >
    extends AbstractCollectionHolder<T> {

    //#region -------------------- Fields --------------------

    readonly #size: number
    readonly #isEmpty: boolean

    readonly #reference: REFERENCE
    #objectValuesMap?: ReadonlyMap<T, ObjectOf<T>>
    readonly #array: readonly T[]
    #set?: ReadonlySet<T>
    #weakSet?: Readonly<WeakSet<ObjectOf<T>>>
    #map?: ReadonlyMap<number, T>

    #hasNull?: boolean
    #hasDuplicate?: boolean

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
        // README: The eager instantiation has some weird shenanigan to keep its nature pure.
        //         Also, to be efficient, there is some duplicate code in the constructor.

        if (reference instanceof Function)
            reference = reference()
        this.#reference = reference

        //#region -------------------- initialization by a known instance --------------------

        if (reference instanceof Array) {
            const size = this.#size = reference.length

            //#region -------------------- Initialization (size = 0) --------------------

            if (this.#isEmpty = size == 0) {
                this.#hasNull = this.#hasDuplicate = false
                this.#array = CollectionConstants.EMPTY_ARRAY
                this.#set = CollectionConstants.EMPTY_SET
                this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                return
            }

            //#endregion -------------------- Initialization (size = 0) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                const value = this[0] = reference[0] as T
                this.#hasNull = value == null
                this.#hasDuplicate = false
                this.#array = Object.freeze([value,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                const firstValue = this[0] = reference[0] as T
                const secondValue = this[1] = reference[1] as T
                this.#hasNull = firstValue == null || secondValue == null
                this.#hasDuplicate = firstValue === secondValue
                this.#array = Object.freeze([firstValue, secondValue,],)
                return
            }

            //#endregion -------------------- Initialization (size = 2) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array = new Array<T>(size,)
            let index = size
            while (index-- > 0)
                this[index] = array[index] = reference[index] as T
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 2) --------------------
        }

        if (reference instanceof Set) {
            this.#hasDuplicate = false
            const size = this.#size = reference.size

            //#region -------------------- Initialization (size = 0) --------------------

            if (this.#isEmpty = size == 0) {
                this.#hasNull = false
                this.#array = CollectionConstants.EMPTY_ARRAY
                this.#set = CollectionConstants.EMPTY_SET
                this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                return
            }

            //#endregion -------------------- Initialization (size = 0) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                const value = this[0] = (reference[Symbol.iterator]() as Iterator<T, unknown>).next().value as T
                this.#hasNull = value == null
                this.#array = Object.freeze([value,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                const iterator = reference[Symbol.iterator]() as Iterator<T, unknown>
                const firstValue = this[0] = iterator.next().value as T
                const secondValue = this[1] = iterator.next().value as T
                this.#hasNull = firstValue == null || secondValue == null
                this.#array = Object.freeze([firstValue, secondValue,],)
                return
            }

            //#endregion -------------------- Initialization (size = 2) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array = new Array<T>(size,)
            const iterator = reference[Symbol.iterator]() as Iterator<T, unknown>
            let index = -1
            while (++index < size)
                this[index] = array[index] = iterator.next().value as T
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 2) --------------------
        }

        if (isCollectionHolder<T>(reference,)) {
            //#region -------------------- Initialization (size = 0) --------------------

            if (this.#isEmpty = reference.isEmpty) {
                this.#size = 0
                this.#hasNull = this.#hasDuplicate = false
                this.#array = CollectionConstants.EMPTY_ARRAY
                this.#set = CollectionConstants.EMPTY_SET
                this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                return
            }

            //#endregion -------------------- Initialization (size = 0) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            const size = this.#size = reference.size
            if (size == 1) {
                const value = this[0] = reference.first()
                this.#hasNull = value == null
                this.#hasDuplicate = false
                this.#array = Object.freeze([value,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                const firstValue = this[0] = reference.first()
                const secondValue = this[1] = reference.last()
                this.#hasNull = firstValue == null || secondValue == null
                this.#hasDuplicate = firstValue === secondValue
                this.#array = Object.freeze([firstValue, secondValue,],)
                return
            }

            //#endregion -------------------- Initialization (size = 2) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array = new Array<T>(size,)
            let index = size
            while (index-- > 0)
                this[index] = array[index] = reference.get(index,)
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 2) --------------------
        }

        if (isMinimalistCollectionHolder<T>(reference,)) {
            const size = this.#size = reference.size

            //#region -------------------- Initialization (size = 0) --------------------

            if (this.#isEmpty = size == 0) {
                this.#hasNull = this.#hasDuplicate = false
                this.#array = CollectionConstants.EMPTY_ARRAY
                this.#set = CollectionConstants.EMPTY_SET
                this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                return
            }

            //#endregion -------------------- Initialization (size = 0) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                const value = this[0] = reference.get(0,)
                this.#hasNull = value == null
                this.#hasDuplicate = false
                this.#array = Object.freeze([value,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                const firstValue = this[0] = reference.get(0,)
                const secondValue = this[1] = reference.get(1,)
                this.#hasNull = firstValue == null || secondValue == null
                this.#hasDuplicate = firstValue === secondValue
                this.#array = Object.freeze([firstValue, secondValue,],)
                return
            }

            //#endregion -------------------- Initialization (size = 2) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array = new Array<T>(size,)
            let index = size
            while (index-- > 0)
                this[index] = array[index] = reference.get(index,)
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 2) --------------------
        }

        if (isCollectionIterator<T>(reference,)) {
            //#region -------------------- Initialization (size = 0) --------------------

            if (this.#isEmpty = !reference.hasNext) {
                this.#size = 0
                this.#hasNull = this.#hasDuplicate = false
                this.#array = CollectionConstants.EMPTY_ARRAY
                this.#set = CollectionConstants.EMPTY_SET
                this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                return
            }

            //#endregion -------------------- Initialization (size = 0) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            const size = this.#size = reference.size
            if (size == 1) {
                const value = this[0] = reference.nextValue
                this.#hasNull = value == null
                this.#hasDuplicate = false
                this.#array = Object.freeze([value,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                const firstValue = this[0] = reference.nextValue
                const secondValue = this[1] = reference.nextValue
                this.#hasNull = firstValue == null || secondValue == null
                this.#hasDuplicate = firstValue === secondValue
                this.#array = Object.freeze([firstValue, secondValue,],)
                return
            }

            //#endregion -------------------- Initialization (size = 2) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array = new Array<T>(size,)
            let index = size
            while (index-- > 0)
                this[index] = array[index] = reference.previousValue
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 2) --------------------
        }

        //#endregion -------------------- initialization by a known instance --------------------
        //#region -------------------- initialization by a structure --------------------

        if (isArrayByStructure<T>(reference,)) {
            const size = this.#size = reference.length

            //#region -------------------- Initialization (size = 0) --------------------

            if (this.#isEmpty = size == 0) {
                this.#hasNull = this.#hasDuplicate = false
                this.#array = CollectionConstants.EMPTY_ARRAY
                this.#set = CollectionConstants.EMPTY_SET
                this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                return
            }

            //#endregion -------------------- Initialization (size = 0) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                const value = this[0] = reference[0] as T
                this.#hasNull = value == null
                this.#hasDuplicate = false
                this.#array = Object.freeze([value,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                const firstValue = this[0] = reference[0] as T
                const secondValue = this[1] = reference[1] as T
                this.#hasNull = firstValue == null || secondValue == null
                this.#hasDuplicate = firstValue === secondValue
                this.#array = Object.freeze([firstValue, secondValue,],)
                return
            }

            //#endregion -------------------- Initialization (size = 2) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array = new Array<T>(size,)
            let index = size
            while (index-- > 0)
                this[index] = array[index] = reference[index] as T
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 2) --------------------
        }

        if (isSetByStructure<T>(reference,)) {
            this.#hasDuplicate = false
            const size = this.#size = reference.size

            //#region -------------------- Initialization (size = 0) --------------------

            if (this.#isEmpty = size == 0) {
                this.#hasNull = false
                this.#array = CollectionConstants.EMPTY_ARRAY
                this.#set = CollectionConstants.EMPTY_SET
                this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                return
            }

            //#endregion -------------------- Initialization (size = 0) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                const value = this[0] = (reference[Symbol.iterator]() as Iterator<T, unknown>).next().value as T
                this.#hasNull = value == null
                this.#array = Object.freeze([value,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                const iterator = reference[Symbol.iterator]() as Iterator<T, unknown>
                const firstValue = this[0] = iterator.next().value as T
                const secondValue = this[1] = iterator.next().value as T
                this.#hasNull = firstValue == null || secondValue == null
                this.#array = Object.freeze([firstValue, secondValue,],)
                return
            }

            //#endregion -------------------- Initialization (size = 2) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array = new Array<T>(size,)
            const iterator = reference[Symbol.iterator]() as Iterator<T, unknown>
            let index = -1
            while (++index < size)
                this[index] = array[index] = iterator.next().value as T
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 2) --------------------
        }

        if (isCollectionHolderByStructure<T>(reference,)) {
            //#region -------------------- Initialization (size = 0) --------------------

            if (this.#isEmpty = reference.isEmpty) {
                this.#size = 0
                this.#hasNull = this.#hasDuplicate = false
                this.#array = CollectionConstants.EMPTY_ARRAY
                this.#set = CollectionConstants.EMPTY_SET
                this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                return
            }

            //#endregion -------------------- Initialization (size = 0) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            const size = this.#size = reference.size
            if (size == 1) {
                const value = this[0] = reference.first()
                this.#hasNull = value == null
                this.#hasDuplicate = false
                this.#array = Object.freeze([value,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                const firstValue = this[0] = reference.first()
                const secondValue = this[1] = reference.last()
                this.#hasNull = firstValue == null || secondValue == null
                this.#hasDuplicate = firstValue === secondValue
                this.#array = Object.freeze([firstValue, secondValue,],)
                return
            }

            //#endregion -------------------- Initialization (size = 2) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array = new Array<T>(size,)
            let index = size
            while (index-- > 0)
                this[index] = array[index] = reference.get(index,)
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 2) --------------------
        }

        if (isMinimalistCollectionHolderByStructure<T>(reference,)) {
            const size = this.#size = reference.size

            //#region -------------------- Initialization (size = 0) --------------------

            if (this.#isEmpty = size == 0) {
                this.#hasNull = this.#hasDuplicate = false
                this.#array = CollectionConstants.EMPTY_ARRAY
                this.#set = CollectionConstants.EMPTY_SET
                this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                return
            }

            //#endregion -------------------- Initialization (size = 0) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                const value = this[0] = reference.get(0,)
                this.#hasNull = value == null
                this.#hasDuplicate = false
                this.#array = Object.freeze([value,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                const firstValue = this[0] = reference.get(0,)
                const secondValue = this[1] = reference.get(1,)
                this.#hasNull = firstValue == null || secondValue == null
                this.#hasDuplicate = firstValue === secondValue
                this.#array = Object.freeze([firstValue, secondValue,],)
                return
            }

            //#endregion -------------------- Initialization (size = 2) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array = new Array<T>(size,)
            let index = size
            while (index-- > 0)
                this[index] = array[index] = reference.get(index,)
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 2) --------------------
        }

        if (isCollectionIteratorByStructure<T>(reference,)) {
            //#region -------------------- Initialization (size = 0) --------------------

            if (this.#isEmpty = !reference.hasNext) {
                this.#size = 0
                this.#hasNull = this.#hasDuplicate = false
                this.#array = CollectionConstants.EMPTY_ARRAY
                this.#set = CollectionConstants.EMPTY_SET
                this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                return
            }

            //#endregion -------------------- Initialization (size = 0) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            const size = this.#size = reference.size
            if (size == 1) {
                const value = this[0] = reference.nextValue
                this.#hasNull = value == null
                this.#hasDuplicate = false
                this.#array = Object.freeze([value,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                const firstValue = this[0] = reference.nextValue
                const secondValue = this[1] = reference.nextValue
                this.#hasNull = firstValue == null || secondValue == null
                this.#hasDuplicate = firstValue === secondValue
                this.#array = Object.freeze([firstValue, secondValue,],)
                return
            }

            //#endregion -------------------- Initialization (size = 2) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array = new Array<T>(size,)
            let index = size
            while (index-- > 0)
                this[index] = array[index] = reference.previousValue
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 2) --------------------
        }

        //#endregion -------------------- initialization by a structure --------------------
        //#region -------------------- initialization by an iterator --------------------

        sizeIf: if ("size" in reference) {
            const size = reference.size
            if (size == null) // No size is present, we continue as a normal iterable
                break sizeIf
            this.#size = size

            //#region -------------------- Initialization (size = 0) --------------------

            if (this.#isEmpty = size == 0) {
                this.#hasNull = this.#hasDuplicate = false
                this.#array = CollectionConstants.EMPTY_ARRAY
                this.#set = CollectionConstants.EMPTY_SET
                this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                return
            }

            //#endregion -------------------- Initialization (size = 0) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                const value = this[0] = (reference[Symbol.iterator]() as Iterator<T, unknown>).next().value as T
                this.#hasNull = value == null
                this.#hasDuplicate = false
                this.#array = Object.freeze([value,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                const iterator = reference[Symbol.iterator]() as Iterator<T, unknown>
                const firstValue = this[0] = iterator.next().value as T
                const secondValue = this[1] = iterator.next().value as T
                this.#hasNull = firstValue == null || secondValue == null
                this.#hasDuplicate = firstValue === secondValue
                this.#array = Object.freeze([firstValue, secondValue,],)
                return
            }

            //#endregion -------------------- Initialization (size = 2) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array = new Array<T>(size,)
            const iterator = reference[Symbol.iterator]() as Iterator<T, unknown>
            let index = -1
            while (++index < size)
                this[index] = array[index] = iterator.next().value as T
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 2) --------------------
        }

        lengthIf: if ("length" in reference) {
            const size = reference.length
            if (size == null) // No size is present, we continue as a normal iterable
                break lengthIf
            this.#size = size

            //#region -------------------- Initialization (size = 0) --------------------

            if (this.#isEmpty = size == 0) {
                this.#hasNull = this.#hasDuplicate = false
                this.#array = CollectionConstants.EMPTY_ARRAY
                this.#set = CollectionConstants.EMPTY_SET
                this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                return
            }

            //#endregion -------------------- Initialization (size = 0) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                const value = this[0] = (reference[Symbol.iterator]() as Iterator<T, unknown>).next().value as T
                this.#hasNull = value == null
                this.#hasDuplicate = false
                this.#array = Object.freeze([value,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                const iterator = reference[Symbol.iterator]() as Iterator<T, unknown>
                const firstValue = this[0] = iterator.next().value as T
                const secondValue = this[1] = iterator.next().value as T
                this.#hasNull = firstValue == null || secondValue == null
                this.#hasDuplicate = firstValue === secondValue
                this.#array = Object.freeze([firstValue, secondValue,],)
                return
            }

            //#endregion -------------------- Initialization (size = 2) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array = new Array<T>(size,)
            const iterator = reference[Symbol.iterator]() as Iterator<T, unknown>
            let index = -1
            while (++index < size)
                this[index] = array[index] = iterator.next().value as T
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 2) --------------------
        }

        countIf: if ("count" in reference) {
            const size = reference.count
            if (size == null) // No size is present, we continue as a normal iterable
                break countIf
            this.#size = size

            //#region -------------------- Initialization (size = 0) --------------------

            if (this.#isEmpty = size == 0) {
                this.#hasNull = this.#hasDuplicate = false
                this.#array = CollectionConstants.EMPTY_ARRAY
                this.#set = CollectionConstants.EMPTY_SET
                this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                return
            }

            //#endregion -------------------- Initialization (size = 0) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                const value = this[0] = (reference[Symbol.iterator]() as Iterator<T, unknown>).next().value as T
                this.#hasNull = value == null
                this.#hasDuplicate = false
                this.#array = Object.freeze([value,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                const iterator = reference[Symbol.iterator]() as Iterator<T, unknown>
                const firstValue = this[0] = iterator.next().value as T
                const secondValue = this[1] = iterator.next().value as T
                this.#hasNull = firstValue == null || secondValue == null
                this.#hasDuplicate = firstValue === secondValue
                this.#array = Object.freeze([firstValue, secondValue,],)
                return
            }

            //#endregion -------------------- Initialization (size = 2) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array = new Array<T>(size,)
            const iterator = reference[Symbol.iterator]() as Iterator<T, unknown>
            let index = -1
            while (++index < size)
                this[index] = array[index] = iterator.next().value as T
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 2) --------------------
        }

        const iterator = reference[Symbol.iterator]() as Iterator<T, unknown>
        let iteratorResult = iterator.next()

        //#region -------------------- Initialization (size = 0) --------------------

        if (this.#isEmpty = iteratorResult.done === true) {
            this.#size = 0
            this.#hasNull = this.#hasDuplicate = false
            this.#array = CollectionConstants.EMPTY_ARRAY
            this.#set = CollectionConstants.EMPTY_SET
            this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
            this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
            return
        }
        //#endregion -------------------- Initialization (size = 0) --------------------
        //#region -------------------- Initialization (size = over 0) --------------------

        const array = [] as T[]
        this[0] = array[0] = iteratorResult.value
        let size = 0
        while (++size, !(iteratorResult = iterator.next()).done)
            this[size] = array[size] = iteratorResult.value
        this.#size = size
        this.#array = Object.freeze(array,)

        //#endregion -------------------- Initialization (size = over 0) --------------------

        //#endregion -------------------- initialization by an iterator --------------------
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    public override get size(): number { return this.#size }
    public override get isEmpty(): boolean { return this.#isEmpty }
    public override get hasNull(): boolean { return this.#hasNull ??= super.hasNull }
    public override get hasDuplicate(): boolean { return this.#hasDuplicate ??= super.hasDuplicate }

    /** The iterable received in the constructor */
    protected get _reference(): REFERENCE { return this.#reference }

    /** The {@link Array} stored (from the construction) for the current {@link GenericCollectionHolder collection} */
    protected get _array(): readonly T[] { return this.#array }

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    public override get(index: number,): T {
        if (this.isEmpty)
            throw new EmptyCollectionHolderException(null, index,)

        if (Number.isNaN(index,))
            throw new ForbiddenIndexException("Forbidden index. The index cannot be NaN.", index,)
        if (index == Number.NEGATIVE_INFINITY)
            throw new ForbiddenIndexException("Forbidden index. The index cannot be -∞.", index,)
        if (index == Number.POSITIVE_INFINITY)
            throw new ForbiddenIndexException("Forbidden index. The index cannot be +∞.", index,)

        if (index in this)
            return this[index] as T

        const size = this.size
        if (index > size)
            throw new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The index "${index}" is over the size of the collection (${size}).`, index,)
        if (index >= 0)
            return this[index] as T

        const indexToRetrieve = size + index
        if (indexToRetrieve < 0)
            throw new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The index "${index}" (${indexToRetrieve} after calculation) is under 0.`, index,)
        if (indexToRetrieve > size)
            throw new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The index "${index}" (${indexToRetrieve} after calculation) is over the size of the collection (${size}).`, index,)
        return this[indexToRetrieve] as T
    }

    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) {
        if (Number.isNaN(index,))
            return defaultValue(index,)
        if (index == Number.NEGATIVE_INFINITY)
            return defaultValue(index,)
        if (index == Number.POSITIVE_INFINITY)
            return defaultValue(index,)
        if (this.isEmpty)
            return defaultValue(index,)

        const size = this.size
        if (index > size)
            return defaultValue(index,)
        if (index >= 0)
            return this[index] as T

        const indexToRetrieve = size + index
        if (indexToRetrieve < 0)
            return defaultValue(index,)
        if (indexToRetrieve > size)
            return defaultValue(index,)
        return this[indexToRetrieve] as T
    }

    public override getOrNull(index: number,): NullOr<T> {
        if (Number.isNaN(index,))
            return null
        if (index == Number.NEGATIVE_INFINITY)
            return null
        if (index == Number.POSITIVE_INFINITY)
            return null
        if (this.isEmpty)
            return null

        const size = this.size
        if (index > size)
            return null
        if (index >= 0)
            return this[index] as T

        const indexToRetrieve = size + index
        if (indexToRetrieve < 0)
            return null
        if (indexToRetrieve > size)
            return null
        return this[indexToRetrieve] as T
    }

    public override get objectValuesMap(): ReadonlyMap<T, ObjectOf<T>> { return this.#objectValuesMap ??= super.objectValuesMap }
    public override toArray(): readonly T[] { return this.#array }
    public override toSet(): ReadonlySet<T> { return this.#set ??= super.toSet() }
    public override toWeakSet(): Readonly<WeakSet<ObjectOf<T>>> { return this.#weakSet ??= super.toWeakSet() }
    public override toMap(): ReadonlyMap<number, T> { return this.#map ??= super.toMap() }


    //#endregion -------------------- Methods --------------------

}

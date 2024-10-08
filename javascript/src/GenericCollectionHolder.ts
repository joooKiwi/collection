/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullableNumber, NullableString, NullOr, NullOrNumber} from "@joookiwi/type"

import type {CollectionHolder}                                                                                                                                                                                                                                                                                                            from "./CollectionHolder"
import type {BooleanCallback, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, PossibleIterableArraySetOrCollectionHolder, PossibleIterableOrCollection, RestrainedBooleanCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, StringCallback, ValueIndexCallback, ValueIndexWithReturnCallback} from "./CollectionHolder.types"
import type {MinimalistCollectionHolder}                                                                                                                                                                                                                                                                                                  from "./MinimalistCollectionHolder"
import type {IterableWithCount}                                                                                                                                                                                                                                                                                                           from "./iterable/IterableWithCount"
import type {IterableWithLength}                                                                                                                                                                                                                                                                                                          from "./iterable/IterableWithLength"
import type {IterableWithPossibleSize}                                                                                                                                                                                                                                                                                                    from "./iterable/IterableWithPossibleSize"
import type {IterableWithSize}                                                                                                                                                                                                                                                                                                            from "./iterable/IterableWithSize"
import type {CollectionIterator}                                                                                                                                                                                                                                                                                                          from "./iterator/CollectionIterator"

import {AbstractCollectionHolder}                  from "./AbstractCollectionHolder"
import {CollectionConstants}                       from "./CollectionConstants"
import {CollectionHolderIndexOutOfBoundsException} from "./exception/CollectionHolderIndexOutOfBoundsException"
import {EmptyCollectionHolderException}            from "./exception/EmptyCollectionHolderException"
import {ForbiddenIndexException}                   from "./exception/ForbiddenIndexException"
import {allByArray}                                from "./method/all"
import {anyByArray}                                from "./method/any"
import {dropByArray}                               from "./method/drop"
import {dropLastByArray}                           from "./method/dropLast"
import {dropLastWhileByArray}                      from "./method/dropLastWhile"
import {dropLastWhileIndexedByArray}               from "./method/dropLastWhileIndexed"
import {dropWhileByArray}                          from "./method/dropWhile"
import {dropWhileIndexedByArray}                   from "./method/dropWhileIndexed"
import {filterByArray}                             from "./method/filter"
import {filterIndexedByArray}                      from "./method/filterIndexed"
import {filterNotByArray}                          from "./method/filterNot"
import {filterNotIndexedByArray}                   from "./method/filterNotIndexed"
import {findByArray}                               from "./method/find"
import {findIndexedByArray}                        from "./method/findIndexed"
import {findLastByArray}                           from "./method/findLast"
import {findLastIndexedByArray}                    from "./method/findLastIndexed"
import {firstByArray}                              from "./method/first"
import {firstOrNullByArray}                        from "./method/firstOrNull"
import {forEachByArray}                            from "./method/forEach"
import {forEachIndexedByArray}                     from "./method/forEachIndexed"
import {getOrElseByArray}                          from "./method/getOrElse"
import {getOrNullByArray}                          from "./method/getOrNull"
import {hasByArray}                                from "./method/has"
import {hasAllByArray}                             from "./method/hasAll"
import {hasNullByArray}                            from "./method/hasNull"
import {hasDuplicateByArray}                       from "./method/hasDuplicate"
import {hasOneByArray}                             from "./method/hasOne"
import {indexOfByArray}                            from "./method/indexOf"
import {indexOfFirstByArray}                       from "./method/indexOfFirst"
import {indexOfFirstIndexedByArray}                from "./method/indexOfFirstIndexed"
import {indexOfLastByArray}                        from "./method/indexOfLast"
import {indexOfLastIndexedByArray}                 from "./method/indexOfLastIndexed"
import {isArray}                                   from "./method/isArray"
import {isArrayByStructure}                        from "./method/isArrayByStructure"
import {isCollectionIterator}                      from "./method/isCollectionIterator"
import {isCollectionIteratorByStructure}           from "./method/isCollectionIteratorByStructure"
import {isCollectionHolder}                        from "./method/isCollectionHolder"
import {isCollectionHolderByStructure}             from "./method/isCollectionHolderByStructure"
import {isMinimalistCollectionHolder}              from "./method/isMinimalistCollectionHolder"
import {isMinimalistCollectionHolderByStructure}   from "./method/isMinimalistCollectionHolderByStructure"
import {isSet}                                     from "./method/isSet"
import {isSetByStructure}                          from "./method/isSetByStructure"
import {joinToStringByArray}                       from "./method/joinToString"
import {lastByArray}                               from "./method/last"
import {lastIndexOfByArray}                        from "./method/lastIndexOf"
import {lastOrNullByArray}                         from "./method/lastOrNull"
import {noneByArray}                               from "./method/none"
import {mapByArray}                                from "./method/map"
import {mapIndexedByArray}                         from "./method/mapIndexed"
import {mapNotNullByArray}                         from "./method/mapNotNull"
import {mapNotNullIndexedByArray}                  from "./method/mapNotNullIndexed"
import {onEachByArray}                             from "./method/onEach"
import {onEachIndexedByArray}                      from "./method/onEachIndexed"
import {sliceByArray}                              from "./method/slice"
import {sliceWithARangeByArray}                    from "./method/slice.withARange"
import {takeByArray}                               from "./method/take"
import {takeLastByArray}                           from "./method/takeLast"
import {takeLastWhileByArray}                      from "./method/takeLastWhile"
import {takeLastWhileIndexedByArray}               from "./method/takeLastWhileIndexed"
import {takeWhileByArray}                          from "./method/takeWhile"
import {takeWhileIndexedByArray}                   from "./method/takeWhileIndexed"
import {toIteratorByArray}                         from "./method/toIterator"
import {toLocaleLowerCaseStringByArray}            from "./method/toLocaleLowerCaseString"
import {toLocaleStringByArray}                     from "./method/toLocaleString"
import {toLocaleUpperCaseStringByArray}            from "./method/toLocaleUpperCaseString"
import {toLowerCaseStringByArray}                  from "./method/toLowerCaseString"
import {toMapByArray}                              from "./method/toMap"
import {toMutableArrayByArray}                     from "./method/toMutableArray"
import {toMutableMapByArray}                       from "./method/toMutableMap"
import {toMutableSetByArray}                       from "./method/toMutableSet"
import {toReverseByArray}                          from "./method/toReverse"
import {toSetByArray}                              from "./method/toSet"
import {toStringByArray}                           from "./method/toString"
import {toUpperCaseStringByArray}                  from "./method/toUpperCaseString"

/**
 * A {@link CollectionHolder} having the values eagerly retrieved.
 *
 * Meaning that every value is retrieved during the construction,
 * and it will never change after the initialization.
 *
 * But it is not {@link Object.isFrozen frozen} to ensure
 * the children can do their initialization.
 *
 * @see GenericMinimalistCollectionHolder
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
    readonly #array: readonly T[]
    #set?: ReadonlySet<T>
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

        if (isArray(reference,)) {
            const size = this.#size = reference.length

            //#region -------------------- Initialization (size = 0) --------------------

            if (this.#isEmpty = size == 0) {
                this.#hasNull = this.#hasDuplicate = false
                this.#array = CollectionConstants.EMPTY_ARRAY
                this.#set = CollectionConstants.EMPTY_SET
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

        if (isSet<T>(reference,)) {
            this.#hasDuplicate = false
            const size = this.#size = reference.size

            //#region -------------------- Initialization (size = 0) --------------------

            if (this.#isEmpty = size == 0) {
                this.#hasNull = false
                this.#array = CollectionConstants.EMPTY_ARRAY
                this.#set = CollectionConstants.EMPTY_SET
                return
            }

            //#endregion -------------------- Initialization (size = 0) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                const value = this[0] = reference[Symbol.iterator]().next().value as T
                this.#hasNull = value == null
                this.#array = Object.freeze([value,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                const iterator = reference[Symbol.iterator]()
                const firstValue = this[0] = iterator.next().value as T
                const secondValue = this[1] = iterator.next().value as T
                this.#hasNull = firstValue == null || secondValue == null
                this.#array = Object.freeze([firstValue, secondValue,],)
                return
            }

            //#endregion -------------------- Initialization (size = 2) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array = new Array<T>(size,)
            const iterator = reference[Symbol.iterator]()
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
                return
            }

            //#endregion -------------------- Initialization (size = 0) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                const value = this[0] = reference[Symbol.iterator]().next().value as T
                this.#hasNull = value == null
                this.#array = Object.freeze([value,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                const iterator = reference[Symbol.iterator]()
                const firstValue = this[0] = iterator.next().value as T
                const secondValue = this[1] = iterator.next().value as T
                this.#hasNull = firstValue == null || secondValue == null
                this.#array = Object.freeze([firstValue, secondValue,],)
                return
            }

            //#endregion -------------------- Initialization (size = 2) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array = new Array<T>(size,)
            const iterator = reference[Symbol.iterator]()
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
                return
            }

            //#endregion -------------------- Initialization (size = 0) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                const value = this[0] = (reference[Symbol.iterator]() as Iterator<T, unknown, unknown>).next().value as T
                this.#hasNull = value == null
                this.#hasDuplicate = false
                this.#array = Object.freeze([value,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                const iterator: Iterator<T, unknown, unknown> = reference[Symbol.iterator]()
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
            const iterator: Iterator<T, unknown, unknown> = reference[Symbol.iterator]()
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
                return
            }

            //#endregion -------------------- Initialization (size = 0) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                const value = this[0] = (reference[Symbol.iterator]() as Iterator<T, unknown, unknown>).next().value as T
                this.#hasNull = value == null
                this.#hasDuplicate = false
                this.#array = Object.freeze([value,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                const iterator = reference[Symbol.iterator]() as Iterator<T, unknown, unknown>
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
            const iterator = reference[Symbol.iterator]() as Iterator<T, unknown, unknown>
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
                return
            }

            //#endregion -------------------- Initialization (size = 0) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                const value = this[0] = (reference[Symbol.iterator]() as Iterator<T, unknown, unknown>).next().value as T
                this.#hasNull = value == null
                this.#hasDuplicate = false
                this.#array = Object.freeze([value,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                const iterator = reference[Symbol.iterator]() as Iterator<T, unknown, unknown>
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
            const iterator = reference[Symbol.iterator]() as Iterator<T, unknown, unknown>
            let index = -1
            while (++index < size)
                this[index] = array[index] = iterator.next().value as T
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 2) --------------------
        }

        const iterator = reference[Symbol.iterator]() as Iterator<T, unknown, unknown>
        let iteratorResult = iterator.next()

        //#region -------------------- Initialization (size = 0) --------------------

        if (this.#isEmpty = iteratorResult.done === true) {
            this.#size = 0
            this.#hasNull = this.#hasDuplicate = false
            this.#array = CollectionConstants.EMPTY_ARRAY
            this.#set = CollectionConstants.EMPTY_SET
            return
        }

        //#endregion -------------------- Initialization (size = 0) --------------------
        //#region -------------------- Initialization (size = over 0) --------------------

        const array: T[] = []
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
    //#region -------------------- Methods --------------------

    //#region -------------------- Reference methods --------------------

    /** The iterable received in the constructor */
    protected get _reference(): REFERENCE { return this.#reference }

    /** The {@link Array} stored (from the construction) for the current {@link GenericCollectionHolder collection} */
    protected get _array(): readonly T[] { return this.#array }

    //#endregion -------------------- Reference methods --------------------
    //#region -------------------- Size methods --------------------

    public override get size(): number { return this.#size }
    public override get isEmpty(): boolean { return this.#isEmpty }
    public override get isNotEmpty(): boolean { return !this.isEmpty }

    //#endregion -------------------- Size methods --------------------

    //#region -------------------- Research methods --------------------

    //#region -------------------- Get methods --------------------

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
            return this._array[index] as T

        const size = this.size
        if (index > size)
            throw new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The index "${index}" is over the size of the collection (${size}).`, index,)
        if (index == size)
            throw new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The index "${index}" is the size of the collection (${size}).`, index,)
        if (index >= 0)
            return this._array[index] as T

        const indexToRetrieve = size + index
        if (indexToRetrieve < 0)
            throw new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The index "${index}" (${indexToRetrieve} after calculation) is under 0.`, index,)
        if (indexToRetrieve > size)
            throw new CollectionHolderIndexOutOfBoundsException(`Index out of bound. The index "${index}" (${indexToRetrieve} after calculation) is over the size of the collection (${size}).`, index,)
        return this._array[indexToRetrieve] as T
    }

    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) {
        return getOrElseByArray(this._array, index, defaultValue,)
    }

    public override getOrNull(index: number,): NullOr<T> {
        return getOrNullByArray(this._array, index,)
    }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- First --------------------

    public override first(): T
    public override first<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): S
    public override first(predicate: Nullable<BooleanCallback<T>>,): T
    public override first(predicate?: Nullable<BooleanCallback<T>>,) {
        if (arguments.length === 0)
            return firstByArray(this._array,)
        return firstByArray(this._array, predicate,)
    }

    public override firstOrNull(): NullOr<T>
    public override firstOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public override firstOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
    public override firstOrNull(predicate?: Nullable<BooleanCallback<T>>,) {
        if (arguments.length === 0)
            return firstOrNullByArray(this._array,)
        return firstOrNullByArray(this._array, predicate,)
    }

    //#endregion -------------------- First --------------------
    //#region -------------------- Last --------------------

    public override last(): T
    public override last<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): S
    public override last(predicate: Nullable<BooleanCallback<T>>,): T
    public override last(predicate?: Nullable<BooleanCallback<T>>,) {
        return lastByArray(this._array, predicate,)
    }

    public override lastOrNull(): NullOr<T>
    public override lastOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public override lastOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
    public override lastOrNull(predicate?: Nullable<BooleanCallback<T>>,) {
        return lastOrNullByArray(this._array, predicate,)
    }

    //#endregion -------------------- Last --------------------
    //#region -------------------- Find --------------------

    public override find<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override find(predicate: BooleanCallback<T>,): NullOr<T>
    public override find(predicate: BooleanCallback<T>,) {
        return findByArray(this._array, predicate,)
    }

    public override findIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findIndexed(predicate: ReverseBooleanCallback<T>,)  {
        return findIndexedByArray(this._array, predicate,)
    }

    public override findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLast(predicate: BooleanCallback<T>,): NullOr<T>
    public override findLast(predicate: BooleanCallback<T>,)  {
        return findLastByArray(this._array, predicate,)
    }

    public override findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,)  {
        return findLastIndexedByArray(this._array, predicate,)
    }

    //#endregion -------------------- Find --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    public override indexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber
    /** @deprecated Remove the {@link limit} or use {@link CollectionHolder.dropLast} or {@link CollectionHolder.take} instead. This will be removed in version 1.11 */
    public override indexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
    /** @deprecated Use a value present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public override indexOf(element: unknown, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
    public override indexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber,) {
        return indexOfByArray(this._array, element, fromIndex, toIndex,)
    }

    public override lastIndexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber
    /** @deprecated Remove the {@link limit} or use {@link CollectionHolder.drop} or {@link CollectionHolder.takeLast} instead. This will be removed in version 1.11 */
    public override lastIndexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
    /** @deprecated Use a value present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public override lastIndexOf(element: unknown, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
    public override lastIndexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber,) {
        return lastIndexOfByArray(this._array, element, fromIndex, toIndex,)
    }


    public override indexOfFirst(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber
    /** @deprecated Remove the {@link limit} or use {@link CollectionHolder.dropLast} or {@link CollectionHolder.take} instead. This will be removed in version 1.11 */
    public override indexOfFirst(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
    public override indexOfFirst(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,) {
        return indexOfFirstByArray(this._array, predicate, fromIndex, toIndex,)
    }

    public override indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber
    /** @deprecated Remove the {@link limit} or use {@link CollectionHolder.dropLast} or {@link CollectionHolder.take} instead. This will be removed in version 1.11 */
    public override indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
    public override indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,) {
        return indexOfFirstIndexedByArray(this._array, predicate, fromIndex, toIndex,)
    }


    public override indexOfLast(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber
    /** @deprecated Remove the {@link limit} or use {@link CollectionHolder.drop} or {@link CollectionHolder.takeLast} instead. This will be removed in version 1.11 */
    public override indexOfLast(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
    public override indexOfLast(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,) {
        return indexOfLastByArray(this._array, predicate, fromIndex, toIndex,)
    }

    public override indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber
    /** @deprecated Remove the {@link limit} or use {@link CollectionHolder.drop} or {@link CollectionHolder.takeLast} instead. This will be removed in version 1.11 */
    public override indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
    public override indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,) {
        return indexOfLastIndexedByArray(this._array, predicate, fromIndex, toIndex,)
    }

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    //#region -------------------- All --------------------

    public override all<S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolder<S>
    public override all(predicate: BooleanCallback<T>,): boolean
    public override all(predicate: BooleanCallback<T>,) {
        return allByArray(this._array, predicate,)
    }

    //#endregion -------------------- All --------------------
    //#region -------------------- Any --------------------

    public override any(): this["isNotEmpty"]
    public override any(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override any(predicate?: Nullable<BooleanCallback<T>>,) {
        if (arguments.length === 0)
            return this.isNotEmpty
        return anyByArray(this._array, predicate,)
    }

    //#endregion -------------------- Any --------------------
    //#region -------------------- None --------------------

    public override none(): this["isEmpty"]
    public override none(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override none(predicate?: Nullable<BooleanCallback<T>>,) {
        if (arguments.length === 0)
            return this.isEmpty
        return noneByArray(this._array, predicate,)
    }

    //#endregion -------------------- None --------------------

    //#region -------------------- Has null --------------------

    public override get hasNull(): boolean { return this.#hasNull ??= hasNullByArray(this._array,) }

    //#endregion -------------------- Has null --------------------
    //#region -------------------- Has duplicate --------------------

    public override get hasDuplicate(): boolean { return this.#hasDuplicate ??= hasDuplicateByArray(this._array,) }

    //#endregion -------------------- Has duplicate --------------------

    //#region -------------------- Has --------------------

    public override has(value: T,): boolean
    /** @deprecated Use a value present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public override has(value: unknown,): boolean
    public override has(value: T,) {
        return hasByArray(this._array, value,)
    }

    //#endregion -------------------- Has --------------------
    //#region -------------------- Has one --------------------

    public override hasOne(values: readonly T[],): boolean
    public override hasOne(values: ReadonlySet<T>,): boolean
    public override hasOne(values: CollectionHolder<T>,): boolean
    public override hasOne(values: MinimalistCollectionHolder<T>,): boolean
    public override hasOne(values: CollectionIterator<T>,): boolean
    public override hasOne(values: Iterable<T>,): boolean
    public override hasOne(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
    /** @deprecated Use a value present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public override hasOne(values: readonly unknown[],): boolean
    /** @deprecated Use a value present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public override hasOne(values: ReadonlySet<unknown>,): boolean
    /** @deprecated Use a value present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public override hasOne(values: CollectionHolder,): boolean
    /** @deprecated Use a value present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public override hasOne(values: MinimalistCollectionHolder,): boolean
    /** @deprecated Use a value present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public override hasOne(values: CollectionIterator,): boolean
    /** @deprecated Use a value present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public override hasOne(values: Iterable<unknown>,): boolean
    /** @deprecated Use a value present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public override hasOne(values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean
    public override hasOne(values: PossibleIterableArraySetOrCollectionHolder<unknown>,) {
        return hasOneByArray(this._array, values,)
    }

    //#endregion -------------------- Has one --------------------
    //#region -------------------- Has all --------------------

    public override hasAll(values: readonly T[],): boolean
    public override hasAll(values: ReadonlySet<T>,): boolean
    public override hasAll(values: CollectionHolder<T>,): boolean
    public override hasAll(values: MinimalistCollectionHolder<T>,): boolean
    public override hasAll(values: CollectionIterator<T>,): boolean
    public override hasAll(values: Iterable<T>,): boolean
    public override hasAll(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
    /** @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public override hasAll(values: readonly unknown[],): boolean
    /** @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public override hasAll(values: ReadonlySet<unknown>,): boolean
    /** @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public override hasAll(values: CollectionHolder,): boolean
    /** @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public override hasAll(values: MinimalistCollectionHolder,): boolean
    /** @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public override hasAll(values: CollectionIterator,): boolean
    /** @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public override hasAll(values: Iterable<unknown>,): boolean
    /** @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public override hasAll(values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean
    public override hasAll(values: PossibleIterableArraySetOrCollectionHolder<unknown>,) {
        return hasAllByArray(this._array, values,)
    }

    //#endregion -------------------- Has all --------------------

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    public override filter<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filter(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filter(predicate: BooleanCallback<T>,) {
        return filterByArray(this._array, predicate,)
    }

    public override filterIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,) {
        return filterIndexedByArray(this._array, predicate,)
    }


    public override filterNot<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filterNot(predicate: BooleanCallback<T>,) {
        return filterNotByArray(this._array, predicate,)
    }

    public override filterNotIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,) {
        return filterNotIndexedByArray(this._array, predicate,)
    }


    public override filterNotNull(): CollectionHolder<NonNullable<T>> {
        if (this.isEmpty)
            return CollectionConstants.EMPTY_COLLECTION_HOLDER
        if (this.hasNull)
            return new CollectionConstants.LazyGenericCollectionHolder(() => {
                const array = this._array
                const newArray: NonNullable<T>[] = []
                const size = this.size
                let index = -1
                while (++index < size) {
                    const value = array[index] as T
                    if (value != null)
                        newArray.push(value,)
                }
                return newArray
            },)
        return this as CollectionHolder<NonNullable<T>>
    }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Slice --------------------

    public override slice(indices: readonly number[],): CollectionHolder<T>
    public override slice(indices: ReadonlySet<number>,): CollectionHolder<T>
    public override slice(indices: CollectionHolder<number>,): CollectionHolder<T>
    public override slice(indices: MinimalistCollectionHolder<number>,): CollectionHolder<T>
    public override slice(indices: CollectionIterator<number>,): CollectionHolder<T>
    public override slice(indices: Iterable<number>,): CollectionHolder<T>
    public override slice(indices: PossibleIterableArraySetOrCollectionHolder<number>,): CollectionHolder<T>
    public override slice(fromIndex?: NullableNumber, toIndex?: NullableNumber,): CollectionHolder<T>
    /** @deprecated Remove the {@link limit} or use {@link CollectionHolder.dropLast} or {@link CollectionHolder.take} instead. This will be removed in version 1.11 */
    public override slice(fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T>
    public override slice(indicesOrFromIndex?: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number>, toIndex?: NullableNumber,): CollectionHolder<T>
    /** @deprecated Remove the {@link limit} or use {@link CollectionHolder.dropLast} or {@link CollectionHolder.take} instead. This will be removed in version 1.11 */
    public override slice(indicesOrFromIndex?: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number>, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T>
    public override slice(indicesOrFromIndex?: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number>, toIndex?: NullableNumber,): CollectionHolder<T> {
        if (arguments.length === 0)
            return sliceWithARangeByArray<T>(this._array,)
        if (arguments.length === 1)
            if (indicesOrFromIndex == null)
                return sliceWithARangeByArray<T>(this._array, indicesOrFromIndex,)
            else if (typeof indicesOrFromIndex == "number")
                return sliceWithARangeByArray<T>(this._array, indicesOrFromIndex,)
            else
                return sliceByArray<T>(this._array, indicesOrFromIndex,)
        return sliceWithARangeByArray<T>(this._array, indicesOrFromIndex as NullableNumber, toIndex,)
    }

    //#endregion -------------------- Slice --------------------
    //#region -------------------- Take --------------------

    public override take(n: number,): CollectionHolder<T> {
        return takeByArray(this._array, n,)
    }

    public override takeWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override takeWhile(predicate: BooleanCallback<T>,) {
        return takeWhileByArray(this._array, predicate,)
    }

    public override takeWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return takeWhileIndexedByArray(this._array, predicate,)
    }


    public override takeLast(n: number,): CollectionHolder<T> {
        return takeLastByArray(this._array, n,)
    }


    public override takeLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override takeLastWhile(predicate: BooleanCallback<T>,) {
        return takeLastWhileByArray(this._array, predicate,)
    }

    public override takeLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return takeLastWhileIndexedByArray(this._array, predicate,)
    }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Drop --------------------

    public override drop(n: number,): CollectionHolder<T> {
        return dropByArray(this._array, n,)
    }

    public override dropWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override dropWhile(predicate: BooleanCallback<T>,) {
        return dropWhileByArray(this._array, predicate,)
    }

    public override dropWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return dropWhileIndexedByArray(this._array, predicate,)
    }


    public override dropLast(n: number,): CollectionHolder<T> {
        return dropLastByArray(this._array, n,)
    }

    public override dropLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override dropLastWhile(predicate: BooleanCallback<T>,) {
        return dropLastWhileByArray(this._array, predicate,)
    }

    public override dropLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return dropLastWhileIndexedByArray(this._array, predicate,)
    }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Map --------------------

    public override map<const U, >(transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U> {
        return mapByArray(this._array, transform,)
    }

    public override mapIndexed<const U, >(transform: IndexValueWithReturnCallback<T, U>,): CollectionHolder<U> {
        return mapIndexedByArray(this._array, transform,)
    }


    public override mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNullByArray(this._array, transform,)
    }

    public override mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNullIndexedByArray(this._array, transform,)
    }

    //#endregion -------------------- Map --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- For each --------------------

    public override forEach(action: ValueIndexCallback<T>,): void {
        forEachByArray(this._array, action,)
    }

    public override forEachIndexed(action: IndexValueCallback<T>,): void {
        forEachIndexedByArray(this._array, action,)
    }

    //#endregion -------------------- For each --------------------
    //#region -------------------- On each --------------------

    public override onEach(action: ValueIndexCallback<T>,): this {
        onEachByArray(this._array, action,)
        return this
    }

    public override onEachIndexed(action: IndexValueCallback<T>,): this {
        onEachIndexedByArray(this._array, action,)
        return this
    }

    //#endregion -------------------- On each --------------------

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    //#region -------------------- To reverse --------------------

    public override toReverse(fromIndex?: NullableNumber, toIndex?: NullableNumber,): CollectionHolder<T>
    /** @deprecated Remove the {@link limit} or use {@link CollectionHolder.dropLast} or {@link CollectionHolder.take} instead. This will be removed in version 1.11 */
    public override toReverse(fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T>
    public override toReverse(fromIndex?: NullableNumber, toIndex?: NullableNumber,) {
        return toReverseByArray(this._array, fromIndex, toIndex,)
    }

    //#endregion -------------------- To reverse --------------------

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- Javascript methods --------------------

    public override [Symbol.iterator](): CollectionIterator<T> { return toIteratorByArray(this._array,) }

    //#endregion -------------------- Javascript methods --------------------
    //#region -------------------- Conversion methods --------------------

    //#region -------------------- To other structure --------------------

    public override toArray(): readonly T[] { return this.#array }
    public override toMutableArray(): T[] { return toMutableArrayByArray(this._array,) }

    public override toSet(): ReadonlySet<T> { return this.#set ??= toSetByArray(this._array,) }
    public override toMutableSet(): Set<T> { return toMutableSetByArray(this._array,) }

    public override toMap(): ReadonlyMap<number, T> { return this.#map ??= toMapByArray(this._array,) }
    public override toMutableMap(): Map<number, T> { return toMutableMapByArray(this._array,) }

    //#endregion -------------------- To other structure --------------------
    //#region -------------------- To string --------------------

    public override toString(): string {
        return toStringByArray(this._array,)
    }

    public override toLocaleString(locale?: NullableString,): string {
        if (arguments.length === 0)
            return toLocaleStringByArray(this._array,)
        return toLocaleStringByArray(this._array, locale,)
    }


    public override toLowerCaseString(): string {
        return toLowerCaseStringByArray(this._array,)
    }

    public override toLocaleLowerCaseString(locale?: NullableString,): string {
        if (arguments.length === 0)
            return toLocaleLowerCaseStringByArray(this._array,)
        return toLocaleLowerCaseStringByArray(this._array, locale,)
    }


    public override toUpperCaseString(): string {
        return toUpperCaseStringByArray(this._array,)
    }

    public override toLocaleUpperCaseString(locale?: NullableString,): string {
        if (arguments.length === 0)
            return toLocaleUpperCaseStringByArray(this._array,)
        return toLocaleUpperCaseStringByArray(this._array, locale,)
    }

    //#endregion -------------------- To string --------------------
    //#region -------------------- Join to string --------------------

    public override joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string {
        return joinToStringByArray(this._array, separator, prefix, postfix, limit, truncated, transform,)
    }

    //#endregion -------------------- Join to string --------------------

    //#endregion -------------------- Conversion methods --------------------

    //#endregion -------------------- Methods --------------------

}

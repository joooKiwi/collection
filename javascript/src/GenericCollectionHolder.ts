//··························································
// Copyright (c) 2023-2026. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import type {Nullable, NullableNumber, NullableString, NullOr, NullOrNumber, NullOrUndefined} from "@joookiwi/type"

import type {CollectionHolder}                                                                                                                                                                                                                                                  from "./CollectionHolder"
import type {MinimalistCollectionHolder}                                                                                                                                                                                                                                        from "./MinimalistCollectionHolder"
import type {IterableWithCount}                                                                                                                                                                                                                                                 from "./iterable/IterableWithCount"
import type {IterableWithLength}                                                                                                                                                                                                                                                from "./iterable/IterableWithLength"
import type {IterableWithPossibleSize}                                                                                                                                                                                                                                          from "./iterable/IterableWithPossibleSize"
import type {IterableWithSize}                                                                                                                                                                                                                                                  from "./iterable/IterableWithSize"
import type {CollectionIterator}                                                                                                                                                                                                                                                from "./iterator/CollectionIterator"
import type {BooleanCallback, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, RestrainedBooleanCallback, ReturnCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, StringCallback, ValueIndexCallback, ValueIndexWithReturnCallback} from "./type/callback"
import type {PossibleIterableIteratorArraySetOrCollectionHolder}                                                                                                                                                                                                                from "./type/possibleInstance"

import {AbstractCollectionHolder}                       from "./AbstractCollectionHolder"
import {CollectionConstants}                            from "./CollectionConstants"
import {EmptyCollectionException}                       from "./exception/EmptyCollectionException"
import {ForbiddenIndexException}                        from "./exception/ForbiddenIndexException"
import {IndexOutOfBoundsException}                      from "./exception/IndexOutOfBoundsException"
import {__reduceTo}                                     from "./method/_array utility"
import {allByArray}                                     from "./method/all"
import {anyByArray}                                     from "./method/any"
import {dropByArray}                                    from "./method/drop"
import {dropLastByArray}                                from "./method/dropLast"
import {dropLastWhileByArray}                           from "./method/dropLastWhile"
import {dropLastWhileIndexedByArray}                    from "./method/dropLastWhileIndexed"
import {dropWhileByArray}                               from "./method/dropWhile"
import {dropWhileIndexedByArray}                        from "./method/dropWhileIndexed"
import {filterByArray}                                  from "./method/filter"
import {filterIndexedByArray}                           from "./method/filterIndexed"
import {filterNotByArray}                               from "./method/filterNot"
import {filterNotIndexedByArray}                        from "./method/filterNotIndexed"
import {findFirstByArray}                               from "./method/findFirst"
import {findFirstIndexedByArray}                        from "./method/findFirstIndexed"
import {findFirstIndexedOrNullByArray}                  from "./method/findFirstIndexedOrNull"
import {findFirstOrNullByArray}                         from "./method/findFirstOrNull"
import {findLastByArray}                                from "./method/findLast"
import {findLastIndexedByArray}                         from "./method/findLastIndexed"
import {findLastIndexedOrNullByArray}                   from "./method/findLastIndexedOrNull"
import {findLastOrNullByArray}                          from "./method/findLastOrNull"
import {firstIndexOfByArray}                            from "./method/firstIndexOf"
import {firstIndexOfOrNullByArray}                      from "./method/firstIndexOfOrNull"
import {forEachByArray}                                 from "./method/forEach"
import {forEachIndexedByArray}                          from "./method/forEachIndexed"
import {getFirstByArray}                                from "./method/getFirst"
import {getFirstOrElseByArray}                          from "./method/getFirstOrElse"
import {getFirstOrNullByArray}                          from "./method/getFirstOrNull"
import {getLastByArray}                                 from "./method/getLast"
import {getLastOrElseByArray}                           from "./method/getLastOrElse"
import {getLastOrNullByArray}                           from "./method/getLastOrNull"
import {getOrElseByArray}                               from "./method/getOrElse"
import {getOrNullByArray}                               from "./method/getOrNull"
import {hasByArray}                                     from "./method/has"
import {hasAllWithArrayByArray}                         from "./method/hasAll.withArray"
import {hasAllWithCollectionHolderByArray}              from "./method/hasAll.withCollectionHolder"
import {hasAllWithCollectionIteratorByArray}            from "./method/hasAll.withCollectionIterator"
import {hasAllWithIterableByArray}                      from "./method/hasAll.withIterable"
import {hasAllWithIteratorByArray}                      from "./method/hasAll.withIterator"
import {hasAllWithMinimalistCollectionHolderByArray}    from "./method/hasAll.withMinimalistCollectionHolder"
import {hasAllWithSetByArray}                           from "./method/hasAll.withSet"
import {hasDuplicateByArray}                            from "./method/hasDuplicate"
import {hasNoDuplicatesByArray}                         from "./method/hasNoDuplicates"
import {hasNoNullsByArray}                              from "./method/hasNoNulls"
import {hasNotByArray}                                  from "./method/hasNot"
import {hasNotAllWithArrayByArray}                      from "./method/hasNotAll.withArray"
import {hasNotAllWithCollectionHolderByArray}           from "./method/hasNotAll.withCollectionHolder"
import {hasNotAllWithCollectionIteratorByArray}         from "./method/hasNotAll.withCollectionIterator"
import {hasNotAllWithIterableByArray}                   from "./method/hasNotAll.withIterable"
import {hasNotAllWithIteratorByArray}                   from "./method/hasNotAll.withIterator"
import {hasNotAllWithMinimalistCollectionHolderByArray} from "./method/hasNotAll.withMinimalistCollectionHolder"
import {hasNotAllWithSetByArray}                        from "./method/hasNotAll.withSet"
import {hasNotOneWithArrayByArray}                      from "./method/hasNotOne.withArray"
import {hasNotOneWithCollectionHolderByArray}           from "./method/hasNotOne.withCollectionHolder"
import {hasNotOneWithCollectionIteratorByArray}         from "./method/hasNotOne.withCollectionIterator"
import {hasNotOneWithIterableByArray}                   from "./method/hasNotOne.withIterable"
import {hasNotOneWithIteratorByArray}                   from "./method/hasNotOne.withIterator"
import {hasNotOneWithMinimalistCollectionHolderByArray} from "./method/hasNotOne.withMinimalistCollectionHolder"
import {hasNotOneWithSetByArray}                        from "./method/hasNotOne.withSet"
import {hasNullByArray}                                 from "./method/hasNull"
import {hasOneWithArrayByArray}                         from "./method/hasOne.withArray"
import {hasOneWithCollectionHolderByArray}              from "./method/hasOne.withCollectionHolder"
import {hasOneWithCollectionIteratorByArray}            from "./method/hasOne.withCollectionIterator"
import {hasOneWithIterableByArray}                      from "./method/hasOne.withIterable"
import {hasOneWithIteratorByArray}                      from "./method/hasOne.withIterator"
import {hasOneWithMinimalistCollectionHolderByArray}    from "./method/hasOne.withMinimalistCollectionHolder"
import {hasOneWithSetByArray}                           from "./method/hasOne.withSet"
import {indexOfFirstByArray}                            from "./method/indexOfFirst"
import {indexOfFirstIndexedByArray}                     from "./method/indexOfFirstIndexed"
import {indexOfFirstIndexedOrNullByArray}               from "./method/indexOfFirstIndexedOrNull"
import {indexOfFirstOrNullByArray}                      from "./method/indexOfFirstOrNull"
import {indexOfLastByArray}                             from "./method/indexOfLast"
import {indexOfLastIndexedByArray}                      from "./method/indexOfLastIndexed"
import {indexOfLastIndexedOrNullByArray}                from "./method/indexOfLastIndexedOrNull"
import {indexOfLastOrNullByArray}                       from "./method/indexOfLastOrNull"
import {isArray}                                        from "./method/isArray"
import {isArrayByStructure}                             from "./method/isArrayByStructure"
import {isCollectionIterator}                           from "./method/isCollectionIterator"
import {isCollectionIteratorByStructure}                from "./method/isCollectionIteratorByStructure"
import {isCollectionHolder}                             from "./method/isCollectionHolder"
import {isCollectionHolderByStructure}                  from "./method/isCollectionHolderByStructure"
import {isIterator}                                     from "./method/isIterator"
import {isIteratorByStructure}                          from "./method/isIteratorByStructure"
import {isMinimalistCollectionHolder}                   from "./method/isMinimalistCollectionHolder"
import {isMinimalistCollectionHolderByStructure}        from "./method/isMinimalistCollectionHolderByStructure"
import {isSet}                                          from "./method/isSet"
import {isSetByStructure}                               from "./method/isSetByStructure"
import {joinToStringByArray}                            from "./method/joinToString"
import {lastIndexOfByArray}                             from "./method/lastIndexOf"
import {lastIndexOfOrNullByArray}                       from "./method/lastIndexOfOrNull"
import {noneByArray}                                    from "./method/none"
import {mapByArray}                                     from "./method/map"
import {mapIndexedByArray}                              from "./method/mapIndexed"
import {mapNotNullByArray}                              from "./method/mapNotNull"
import {mapNotNullIndexedByArray}                       from "./method/mapNotNullIndexed"
import {onEachByArray}                                  from "./method/onEach"
import {onEachIndexedByArray}                           from "./method/onEachIndexed"
import {sliceWithARangeByArray}                         from "./method/slice.withARange"
import {sliceWithArrayByArray}                          from "./method/slice.withArray"
import {sliceWithCollectionHolderByArray}               from "./method/slice.withCollectionHolder"
import {sliceWithCollectionIteratorByArray}             from "./method/slice.withCollectionIterator"
import {sliceWithIterableByArray}                       from "./method/slice.withIterable"
import {sliceWithIteratorByArray}                       from "./method/slice.withIterator"
import {sliceWithMinimalistCollectionHolderByArray}     from "./method/slice.withMinimalistCollectionHolder"
import {sliceWithSetByArray}                            from "./method/slice.withSet"
import {takeByArray}                                    from "./method/take"
import {takeLastByArray}                                from "./method/takeLast"
import {takeLastWhileByArray}                           from "./method/takeLastWhile"
import {takeLastWhileIndexedByArray}                    from "./method/takeLastWhileIndexed"
import {takeWhileByArray}                               from "./method/takeWhile"
import {takeWhileIndexedByArray}                        from "./method/takeWhileIndexed"
import {toIteratorByArray}                              from "./method/toIterator"
import {toLocaleLowerCaseStringByArray}                 from "./method/toLocaleLowerCaseString"
import {toLocaleStringByArray}                          from "./method/toLocaleString"
import {toLocaleUpperCaseStringByArray}                 from "./method/toLocaleUpperCaseString"
import {toLowerCaseStringByArray}                       from "./method/toLowerCaseString"
import {toMapByArray}                                   from "./method/toMap"
import {toMutableArrayByArray}                          from "./method/toMutableArray"
import {toMutableMapByArray}                            from "./method/toMutableMap"
import {toMutableSetByArray}                            from "./method/toMutableSet"
import {toReverseByArray}                               from "./method/toReverse"
import {toSetByArray}                                   from "./method/toSet"
import {toStringByArray}                                from "./method/toString"
import {toUpperCaseStringByArray}                       from "./method/toUpperCaseString"

/**
 * A {@link CollectionHolder} having the values eagerly retrieved.
 *
 * Meaning that every value is retrieved during the construction,
 * and it will never change after the initialization.
 *
 * But it is not {@link Object.isFrozen frozen} to ensure
 * the children can do their initialization.
 *
 * @typeParam T         The element type
 * @typeParam REFERENCE (deprecated, it will be removed in version 1.14) The reference passed in the constructor
 * @see GenericMinimalistCollectionHolder
 * @see LazyGenericCollectionHolder
 * @see EmptyCollectionHolder
 */
export class GenericCollectionHolder<const T = unknown, >
    extends AbstractCollectionHolder<T> {

    //#region -------------------- Fields --------------------

    readonly #size: number
    readonly #isEmpty: boolean

    readonly #reference: PossibleIterableIteratorArraySetOrCollectionHolder<T>
    readonly #array: readonly T[]
    #set?: ReadonlySet<T>
    #map?: ReadonlyMap<number, T>

    #hasNull?: boolean
    #hasDuplicate?: boolean

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor(array:                                readonly T[],)
    public constructor(lateArray:                      () => readonly T[],)
    public constructor(set:                                  ReadonlySet<T>,)
    public constructor(lateSet:                        () => ReadonlySet<T>,)
    public constructor(collectionHolder:                     CollectionHolder<T>,)
    public constructor(lateCollectionHolder:           () => CollectionHolder<T>,)
    public constructor(minimalistCollectionHolder:           MinimalistCollectionHolder<T>,)
    public constructor(lateMinimalistCollectionHolder: () => MinimalistCollectionHolder<T>,)
    public constructor(collectionIterator:                   CollectionIterator<T>,)
    public constructor(lateCollectionIterator:         () => CollectionIterator<T>,)
    public constructor(iterator:                             Iterator<T, unknown, unknown>,)
    public constructor(lateIterator:                   () => Iterator<T, unknown, unknown>,)
    public constructor(iterableWithSize:                     IterableWithSize<T>,)
    public constructor(lateIterableWithSize:           () => IterableWithSize<T>,)
    public constructor(iterableWithLength:                   IterableWithLength<T>,)
    public constructor(lateIterableWithLength:         () => IterableWithLength<T>,)
    public constructor(iterableWithCount:                    IterableWithCount<T>,)
    public constructor(lateIterableWithCount:          () => IterableWithCount<T>,)
    public constructor(iterableWithPossibleSize:             IterableWithPossibleSize<T>,)
    public constructor(lateIterableWithPossibleSize:   () => IterableWithPossibleSize<T>,)
    public constructor(iterable:                             Iterable<T, unknown, unknown>,)
    public constructor(lateIterable:                   () => Iterable<T, unknown, unknown>,)
    public constructor(reference:                            PossibleIterableIteratorArraySetOrCollectionHolder<T>,)
    public constructor(lateReference:                  () => PossibleIterableIteratorArraySetOrCollectionHolder<T>,)
    public constructor(reference: | PossibleIterableIteratorArraySetOrCollectionHolder<T> | (() => PossibleIterableIteratorArraySetOrCollectionHolder<T>),)
    public constructor(reference: | PossibleIterableIteratorArraySetOrCollectionHolder<T> | (() => PossibleIterableIteratorArraySetOrCollectionHolder<T>),) {
        super()
        // README: The eager instantiation has some weird shenanigan to keep its nature pure.
        //         Also, to be efficient, there is some duplicate code in the constructor.

        if (reference instanceof Function)
            reference = reference()
        this.#reference = reference

        //#region -------------------- Initialization from Array --------------------

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

        //#endregion -------------------- Initialization from Array --------------------
        //#region -------------------- Initialization from Set --------------------

        if (isSet(reference,)) {
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

        //#endregion -------------------- Initialization from Set --------------------
        //#region -------------------- Initialization from CollectionHolder --------------------

        if (isCollectionHolder(reference,)) {
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
                const value = this[0] = reference.getFirst()
                this.#hasNull = value == null
                this.#hasDuplicate = false
                this.#array = Object.freeze([value,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                const firstValue = this[0] = reference.getFirst()
                const secondValue = this[1] = reference.getLast()
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

        //#endregion -------------------- Initialization from CollectionHolder --------------------
        //#region -------------------- Initialization from MinimalistCollectionHolder --------------------

        if (isMinimalistCollectionHolder(reference,)) {
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

        //#endregion -------------------- Initialization from MinimalistCollectionHolder --------------------
        //#region -------------------- Initialization from CollectionIterator --------------------

        if (isCollectionIterator(reference,)) {
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

        //#endregion -------------------- Initialization from CollectionIterator --------------------
        //#region -------------------- Initialization from Iterator --------------------

        if (isIterator(reference,)) {
            let iteratorResult = reference.next()

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
            while (++size, !(iteratorResult = reference.next()).done)
                this[size] = array[size] = iteratorResult.value
            this.#size = size
            this.#array = Object.freeze(array,)

            //#endregion -------------------- Initialization (size = over 0) --------------------

            return
        }

        //#endregion -------------------- Initialization from Iterator --------------------

        //#region -------------------- Initialization from Array by structure --------------------

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

        //#endregion -------------------- Initialization from Array by structure --------------------
        //#region -------------------- Initialization from Set by structure --------------------

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

        //#endregion -------------------- Initialization from Set by structure --------------------
        //#region -------------------- Initialization from CollectionHolder by structure --------------------

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
                const value = this[0] = reference.getFirst()
                this.#hasNull = value == null
                this.#hasDuplicate = false
                this.#array = Object.freeze([value,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                const firstValue = this[0] = reference.getFirst()
                const secondValue = this[1] = reference.getLast()
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

        //#endregion -------------------- Initialization from CollectionHolder by structure --------------------
        //#region -------------------- Initialization from MinimalistCollectionHolder by structure --------------------

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

        //#endregion -------------------- Initialization from MinimalistCollectionHolder by structure --------------------
        //#region -------------------- Initialization from CollectionIterator by structure --------------------

        if (isCollectionIteratorByStructure<T>(reference,)) {
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

        //#endregion -------------------- Initialization from CollectionIterator by structure --------------------
        //#region -------------------- Initialization from Iterator by structure --------------------

        if (isIteratorByStructure<T>(reference,)) {
            let iteratorResult = reference.next()

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
            while (++size, !(iteratorResult = reference.next()).done)
                this[size] = array[size] = iteratorResult.value
            this.#size = size
            this.#array = Object.freeze(array,)

            //#endregion -------------------- Initialization (size = over 0) --------------------

            return
        }

        //#endregion -------------------- Initialization from Iterator by structure --------------------

        //#region -------------------- Initialization from Iterable with size --------------------

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
                const value = this[0] = reference[Symbol.iterator]().next().value as T
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

        //#endregion -------------------- Initialization from Iterable with size --------------------
        //#region -------------------- Initialization from Iterable with length --------------------

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

        //#endregion -------------------- Initialization from Iterable with length --------------------
        //#region -------------------- Initialization from Iterable with count --------------------

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

        //#endregion -------------------- Initialization from Iterable with count --------------------
        //#region -------------------- Initialization from Iterable --------------------

        const iterator = reference[Symbol.iterator]()
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

        //#endregion -------------------- Initialization from Iterable --------------------

    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Reference methods --------------------

    /** The raw value received in the constructor */
    protected get _reference(): PossibleIterableIteratorArraySetOrCollectionHolder<T> { return this.#reference }

    /** The {@link Array} stored (from the construction) for the current {@link GenericCollectionHolder instance} */
    protected get _array(): readonly T[] { return this.#array }

    //#endregion -------------------- Reference methods --------------------

    //#region -------------------- Size methods --------------------

    public override get size(): number { return this.#size }
    public override get isEmpty(): boolean { return this.#isEmpty }
    public override get isNotEmpty(): boolean { return !this.isEmpty }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    public override get(index: number,): T {
        if (this.isEmpty)
            throw new EmptyCollectionException(null, index,)

        if (Number.isNaN(index,))
            throw new ForbiddenIndexException("Forbidden index. The index cannot be NaN.", index,)
        if (index == Number.NEGATIVE_INFINITY)
            throw new ForbiddenIndexException("Forbidden index. The index cannot be -∞.", index,)
        if (index == Number.POSITIVE_INFINITY)
            throw new ForbiddenIndexException("Forbidden index. The index cannot be +∞.", index,)

        const array = this._array
        if (index in array)
            return array[index] as T

        const size = this.size
        if (index > size)
            throw new IndexOutOfBoundsException(`Index out of bound. The index “${index}” is over the size of the collection (${size}).`, index,)
        if (index == size)
            throw new IndexOutOfBoundsException(`Index out of bound. The index “${index}” is the size of the collection (${size}).`, index,)
        if (index >= 0)
            return array[index] as T

        const indexToRetrieve = index + size
        if (indexToRetrieve < 0)
            throw new IndexOutOfBoundsException(`Index out of bound. The index “${index}” (${indexToRetrieve} after calculation) is under 0.`, index,)
        return array[indexToRetrieve] as T
    }

    public override getFirst(): T {
        return getFirstByArray(this._array,)
    }

    public override getLast(): T {
        return getLastByArray(this._array,)
    }


    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) {
        return getOrElseByArray(this._array, index, defaultValue,)
    }


    public override getFirstOrElse<const U, >(defaultValue: ReturnCallback<U>,): | T | U
    public override getFirstOrElse(defaultValue: ReturnCallback<T>,): T
    public override getFirstOrElse(defaultValue: ReturnCallback<unknown>,) {
        return getFirstOrElseByArray(this._array, defaultValue,)
    }


    public override getLastOrElse<const U, >(defaultValue: ReturnCallback<U>,): | T | U
    public override getLastOrElse(defaultValue: ReturnCallback<T>,): T
    public override getLastOrElse(defaultValue: ReturnCallback<unknown>,) {
        return getLastOrElseByArray(this._array, defaultValue,)
    }


    public override getOrNull(index: number,): NullOr<T> {
        return getOrNullByArray(this._array, index,)
    }

    public override getFirstOrNull(): NullOr<T> {
        return getFirstOrNullByArray(this._array,)
    }

    public override getLastOrNull(): NullOr<T> {
        return getLastOrNullByArray(this._array,)
    }

    //#endregion -------------------- Get --------------------
    //#region -------------------- Find first --------------------

    public override findFirst<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public override findFirst(predicate: BooleanCallback<T>,): T
    public override findFirst(predicate: BooleanCallback<T>,) {
        return findFirstByArray(this._array, predicate,)
    }

    public override findFirstOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findFirstOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public override findFirstOrNull(predicate: BooleanCallback<T>,) {
        return findFirstOrNullByArray(this._array, predicate,)
    }

    public override findFirstIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public override findFirstIndexed(predicate: ReverseBooleanCallback<T>,): T
    public override findFirstIndexed(predicate: ReverseBooleanCallback<T>,) {
        return findFirstIndexedByArray(this._array, predicate,)
    }

    public override findFirstIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,) {
        return findFirstIndexedOrNullByArray(this._array, predicate,)
    }

    //#endregion -------------------- Find first --------------------
    //#region -------------------- Find last --------------------

    public override findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public override findLast(predicate: BooleanCallback<T>,): T
    public override findLast(predicate: BooleanCallback<T>,) {
        return findLastByArray(this._array, predicate,)
    }

    public override findLastOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public override findLastOrNull(predicate: BooleanCallback<T>,) {
        return findLastOrNullByArray(this._array, predicate,)
    }

    public override findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,): T
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,) {
        return findLastIndexedByArray(this._array, predicate,)
    }

    public override findLastIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,) {
        return findLastIndexedOrNullByArray(this._array, predicate,)
    }

    //#endregion -------------------- Find last --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    public override firstIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,): number {
        return firstIndexOfByArray(this._array, element, from, to,)
    }

    public override firstIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return firstIndexOfOrNullByArray(this._array, element, from, to,)
    }


    public override lastIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,): number {
        return lastIndexOfByArray(this._array, element, from, to,)
    }

    public override lastIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return lastIndexOfOrNullByArray(this._array, element, from, to,)
    }


    public override indexOfFirst(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return indexOfFirstByArray(this._array, predicate, from, to,)
    }

    public override indexOfFirstOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return indexOfFirstOrNullByArray(this._array, predicate, from, to,)
    }

    public override indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return indexOfFirstIndexedByArray(this._array, predicate, from, to,)
    }

    public override indexOfFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return indexOfFirstIndexedOrNullByArray(this._array, predicate, from, to,)
    }


    public override indexOfLast(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return indexOfLastByArray(this._array, predicate, from, to,)
    }

    public override indexOfLastOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return indexOfLastOrNullByArray(this._array, predicate, from, to,)
    }

    public override indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return indexOfLastIndexedByArray(this._array, predicate, from, to,)
    }

    public override indexOfLastIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return indexOfLastIndexedOrNullByArray(this._array, predicate, from, to,)
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

    protected override _any(predicate: BooleanCallback<T>,): boolean {
        return anyByArray(this._array, predicate,)
    }

    //#endregion -------------------- Any --------------------
    //#region -------------------- None --------------------

    protected override _none(predicate: BooleanCallback<T>,): boolean {
        return noneByArray(this._array, predicate,)
    }

    //#endregion -------------------- None --------------------

    //#region -------------------- Has null --------------------

    public override get hasNull(): boolean { return this.#hasNull ??= hasNullByArray(this._array,) }

    public override get hasNoNulls(): boolean { return !(this.#hasNull ??= !hasNoNullsByArray(this._array,)) }

    //#endregion -------------------- Has null --------------------
    //#region -------------------- Has duplicate --------------------

    public override get hasDuplicate(): boolean { return this.#hasDuplicate ??= hasDuplicateByArray(this._array,) }

    public override get hasNoDuplicates(): boolean { return !(this.#hasDuplicate ??= !hasNoDuplicatesByArray(this._array,)) }

    //#endregion -------------------- Has duplicate --------------------

    //#region -------------------- Has --------------------

    public override has(value: T,): boolean {
        return hasByArray(this._array, value,)
    }

    public override hasNot(value: T,): boolean {
        return hasNotByArray(this._array, value,)
    }

    //#endregion -------------------- Has --------------------
    //#region -------------------- Has one --------------------

    protected override _hasOneByArray(values: readonly T[],): boolean {
        return hasOneWithArrayByArray(this._array, values,)
    }

    protected override _hasOneBySet(values: ReadonlySet<T>,): boolean {
        return hasOneWithSetByArray(this._array, values,)
    }

    protected override _hasOneByMinimalistCollectionHolder(values: MinimalistCollectionHolder<T>,): boolean {
        return hasOneWithMinimalistCollectionHolderByArray(this._array, values,)
    }

    protected override _hasOneByCollectionHolder(values: CollectionHolder<T>,): boolean {
        return hasOneWithCollectionHolderByArray(this._array, values,)
    }

    protected override _hasOneByCollectionIterator(values: CollectionIterator<T>,): boolean {
        return hasOneWithCollectionIteratorByArray(this._array, values,)
    }

    protected override _hasOneByIterator(values: Iterator<T, unknown, unknown>,): boolean {
        return hasOneWithIteratorByArray(this._array, values,)
    }

    protected override _hasOneByIterable(values: Iterable<T, unknown, unknown>,): boolean {
        return hasOneWithIterableByArray(this._array, values,)
    }

    //#endregion -------------------- Has one --------------------
    //#region -------------------- Has not one --------------------

    protected override _hasNotOneByArray(values: readonly T[],): boolean {
        return hasNotOneWithArrayByArray(this._array, values,)
    }

    protected override _hasNotOneBySet(values: ReadonlySet<T>,): boolean {
        return hasNotOneWithSetByArray(this._array, values,)
    }

    protected override _hasNotOneByMinimalistCollectionHolder(values: MinimalistCollectionHolder<T>,): boolean {
        return hasNotOneWithMinimalistCollectionHolderByArray(this._array, values,)
    }

    protected override _hasNotOneByCollectionHolder(values: CollectionHolder<T>,): boolean {
        return hasNotOneWithCollectionHolderByArray(this._array, values,)
    }

    protected override _hasNotOneByCollectionIterator(values: CollectionIterator<T>,): boolean {
        return hasNotOneWithCollectionIteratorByArray(this._array, values,)
    }

    protected override _hasNotOneByIterator(values: Iterator<T, unknown, unknown>,): boolean {
        return hasNotOneWithIteratorByArray(this._array, values,)
    }

    protected override _hasNotOneByIterable(values: Iterable<T, unknown, unknown>,): boolean {
        return hasNotOneWithIterableByArray(this._array, values,)
    }

    //#endregion -------------------- Has not one --------------------
    //#region -------------------- Has all --------------------

    protected override _hasAllByArray(values: readonly T[],): boolean {
        return hasAllWithArrayByArray(this._array, values,)
    }

    protected override _hasAllBySet(values: ReadonlySet<T>,): boolean {
        return hasAllWithSetByArray(this._array, values,)
    }

    protected override _hasAllByMinimalistCollectionHolder(values: MinimalistCollectionHolder<T>,): boolean {
        return hasAllWithMinimalistCollectionHolderByArray(this._array, values,)
    }

    protected override _hasAllByCollectionHolder(values: CollectionHolder<T>,): boolean {
        return hasAllWithCollectionHolderByArray(this._array, values,)
    }

    protected override _hasAllByCollectionIterator(values: CollectionIterator<T>,): boolean {
        return hasAllWithCollectionIteratorByArray(this._array, values,)
    }

    protected override _hasAllByIterator(values: Iterator<T, unknown, unknown>,): boolean {
        return hasAllWithIteratorByArray(this._array, values,)
    }

    protected override _hasAllByIterable(values: Iterable<T, unknown, unknown>,): boolean {
        return hasAllWithIterableByArray(this._array, values,)
    }

    //#endregion -------------------- Has all --------------------
    //#region -------------------- Has not all --------------------

    protected override _hasNotAllByArray(values: readonly T[],): boolean {
        return hasNotAllWithArrayByArray(this._array, values,)
    }

    protected override _hasNotAllBySet(values: ReadonlySet<T>,): boolean {
        return hasNotAllWithSetByArray(this._array, values,)
    }

    protected override _hasNotAllByMinimalistCollectionHolder(values: MinimalistCollectionHolder<T>,): boolean {
        return hasNotAllWithMinimalistCollectionHolderByArray(this._array, values,)
    }

    protected override _hasNotAllByCollectionHolder(values: CollectionHolder<T>,): boolean {
        return hasNotAllWithCollectionHolderByArray(this._array, values,)
    }

    protected override _hasNotAllByCollectionIterator(values: CollectionIterator<T>,): boolean {
        return hasNotAllWithCollectionIteratorByArray(this._array, values,)
    }

    protected override _hasNotAllByIterator(values: Iterator<T, unknown, unknown>,): boolean {
        return hasNotAllWithIteratorByArray(this._array, values,)
    }

    protected override _hasNotAllByIterable(values: Iterable<T, unknown, unknown>,): boolean {
        return hasNotAllWithIterableByArray(this._array, values,)
    }

    //#endregion -------------------- Has not all --------------------

    //#region -------------------- Require no nulls --------------------

    public override requireNoNulls(): CollectionHolder<NonNullable<T>> {
        if (this.isEmpty)
            return this as CollectionHolder<NonNullable<T>>
        if (this.hasNull)
            throw new TypeError("Forbidden null value. The current collection contains null values.",)
        return this as CollectionHolder<NonNullable<T>>
    }

    //#endregion -------------------- Require no nulls --------------------

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
                const size = array.length
                const tempArray = new Array<NonNullable<T>>(size,)
                let amountOfItemsAdded = -1
                let index = -1
                while (++index < size) {
                    const value = array[index] as T
                    if (value != null)
                        tempArray[++amountOfItemsAdded] = value
                }
                return __reduceTo(tempArray, amountOfItemsAdded + 1,)
            },)
        return this as CollectionHolder<NonNullable<T>>
    }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Slice --------------------

    protected override _sliceWith0Argument(): CollectionHolder<T> {
        return sliceWithARangeByArray(this._array,)
    }

    protected override _sliceWith1Argument(from: number,): CollectionHolder<T> {
        return sliceWithARangeByArray(this._array, from,)
    }

    protected override _sliceWith2Argument(from: number, to: number,): CollectionHolder<T> {
        return sliceWithARangeByArray(this._array, from, to,)
    }

    protected override _sliceWith2ArgumentWhere1stIsNull(from: NullOrUndefined, to: number,): CollectionHolder<T> {
        return sliceWithARangeByArray(this._array, from, to,)
    }

    protected override _sliceByArray(indices: readonly number[],): CollectionHolder<T> {
        return sliceWithArrayByArray(this._array, indices,)
    }

    protected override _sliceBySet(indices: ReadonlySet<number>,): CollectionHolder<T> {
        return sliceWithSetByArray(this._array, indices,)
    }

    protected override _sliceByMinimalistCollectionHolder(indices: MinimalistCollectionHolder<number>,): CollectionHolder<T> {
        return sliceWithMinimalistCollectionHolderByArray(this._array, indices,)
    }

    protected override _sliceByCollectionHolder(indices: CollectionHolder<number>,): CollectionHolder<T> {
        return sliceWithCollectionHolderByArray(this._array, indices,)
    }

    protected override _sliceByCollectionIterator(indices: CollectionIterator<number>,): CollectionHolder<T> {
        return sliceWithCollectionIteratorByArray(this._array, indices,)
    }

    protected override _sliceByIterator(indices: Iterator<number, unknown, unknown>,): CollectionHolder<T> {
        return sliceWithIteratorByArray(this._array, indices,)
    }

    protected override _sliceByIterable(indices: Iterable<number, unknown, unknown>,): CollectionHolder<T> {
        return sliceWithIterableByArray(this._array, indices,)
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

    public override toReverse(from?: NullableNumber, to?: NullableNumber,): CollectionHolder<T> {
        return toReverseByArray(this._array, from, to,)
    }

    //#endregion -------------------- To reverse --------------------

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- JavaScript methods --------------------

    public override [Symbol.iterator](): CollectionIterator<T> { return toIteratorByArray(this._array,) }

    //#endregion -------------------- JavaScript methods --------------------
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

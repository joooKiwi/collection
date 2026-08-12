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

import type {Array, MutableNumberKeyMap, MutableSet, Nullable, NullableNumber, NullableString, NullOr, NullOrNumber, NullOrOneNumber, NullOrUndefined, NullOrZeroNumber, NumberArray, NumberKeyMap, NumberSet, Set} from "@joookiwi/type"

import type {CollectionHolder}                                                                                                                                                                                                                                                  from "./CollectionHolder"
import type {MinimalistCollectionHolder}                                                                                                                                                                                                                                        from "./MinimalistCollectionHolder"
import type {CollectionIterator}                                                                                                                                                                                                                                                from "./iterator/CollectionIterator"
import type {BooleanCallback, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, RestrainedBooleanCallback, ReturnCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, StringCallback, ValueIndexCallback, ValueIndexWithReturnCallback} from "./type/callback"
import type {PossibleIterableIteratorArraySetOrCollectionHolder}                                                                                                                                                                                                                from "./type/possibleInstance"

import {AbstractUnimplementedCollectionHolder}                                                                            from "./AbstractUnimplementedCollectionHolder"
import {EmptyCollectionHolder}                                                                                            from "./EmptyCollectionHolder"
import {LateRetriever}                                                                                                    from "./LateRetriever"
import {LazyCollectionHolder}                                                                                             from "./LazyCollectionHolder"
import {LazyCollectionHolderOf0Or1Or2}                                                                                    from "./LazyCollectionHolderOf0Or1Or2"
import {CollectionHolderOf1}                                                                                              from "./CollectionHolderOf1"
import type {CollectionHolderOf2}                                                                                         from "./CollectionHolderOf2"
import {CollectionIteratorOf2}                                                                                            from "./iterator/CollectionIteratorOf2"
import {ForbiddenIndexException}                                                                                          from "./exception/ForbiddenIndexException"
import {IndexOutOfBoundsException}                                                                                        from "./exception/IndexOutOfBoundsException"
import {IndexNotFoundException}                                                                                           from "./exception/IndexNotFoundException"
import {InvalidIndexRangeException}                                                                                       from "./exception/InvalidIndexRangeException"
import {asLocaleLowerCaseString, asLocaleString, asLocaleUpperCaseString, asLowerCaseString, asString, asUpperCaseString} from "./method/asString"
import {isArrayByStructure}                                                                                               from "./method/isArrayByStructure"
import {isCollectionHolder}                                                                                               from "./method/isCollectionHolder"
import {isCollectionHolderByStructure}                                                                                    from "./method/isCollectionHolderByStructure"
import {isCollectionIterator}                                                                                             from "./method/isCollectionIterator"
import {isCollectionIteratorByStructure}                                                                                  from "./method/isCollectionIteratorByStructure"
import {isIteratorByStructure}                                                                                            from "./method/isIteratorByStructure"
import {isMinimalistCollectionHolder}                                                                                     from "./method/isMinimalistCollectionHolder"
import {isMinimalistCollectionHolderByStructure}                                                                          from "./method/isMinimalistCollectionHolderByStructure"
import {isSetByStructure}                                                                                                 from "./method/isSetByStructure"
import {EmptyOptional}                                                                                                    from "./optional/EmptyOptional"
import {Optional}                                                                                                         from "./optional/Optional"
import {Couple}                                                                                                           from "./tuple/Couple"

/**
 * A {@link CollectionHolder} having 2 values.
 * No state or reference is held in this instance.
 *
 * Most of the methods are being optimized for two value comparison
 * instead of using the extension function.
 *
 * @see AbstractCollectionHolder
 * @see AbstractCollectionHolderOf1
 * @see CollectionHolderOf2
 * @see LazyCollectionHolderOf2
 * @see ArrayOf2AsCollectionHolder
 * @see SetOf2AsCollectionHolder
 */
export abstract class AbstractCollectionHolderOf2<const T = unknown,
    const T1 extends T = T,
    const T2 extends T = T, >
    extends AbstractUnimplementedCollectionHolder<T> {

    //#region -------------------- Fields --------------------

    /** The first value (out of 2) of the current instance */
    public abstract readonly 0: T1

    /** The second value (out of 2) of the current instance */
    public abstract readonly 1: T2

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    protected constructor() { super() }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Reference methods --------------------

    /** The first value (out of 2) of the current instance */
    public abstract get value1(): T1

    /** The second value (out of 2) of the current instance */
    public abstract get value2(): T2

    //#endregion -------------------- Reference methods --------------------
    //#region -------------------- Size methods --------------------

    public override get size(): 2 { return 2 }

    public override get isEmpty(): false { return false }
    public override get isNotEmpty(): true { return true }

    public override get hasExactly1Element(): false { return false }
    public override get hasAtMost1Element(): false { return false }

    public override get hasAtLeast2Elements(): true { return true }
    public override get hasExactly2Elements(): true { return true }
    public override get hasAtMost2Elements(): true { return true }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    public override get<const I extends number, >(index: I,): I extends | 0 | -1 ? T1 : I extends | 1 | -2 ? T2 : never
    public override get(index: number,) {
        if (Number.isNaN(index,))
            throw new ForbiddenIndexException("Forbidden index. The index cannot be NaN.", index,)
        if (index === Number.NEGATIVE_INFINITY)
            throw new ForbiddenIndexException("Forbidden index. The index cannot be -∞.", index,)
        if (index === Number.POSITIVE_INFINITY)
            throw new ForbiddenIndexException("Forbidden index. The index cannot be +∞.", index,)

        if (index in this)
            if (index === 0)
                return this.value1
            else
                return this.value2

        if (index === 0)
            return this.value1
        if (index === 1)
            return this.value2
        if (index === -1)
            return this.value2
        if (index === -2)
            return this.value1
        if (index > 2)
            throw new IndexOutOfBoundsException(`Index out of bound. The index “${index}” is over the size of the collection (2).`, index,)
        if (index === 2)
            throw new IndexOutOfBoundsException(`Index out of bound. The index “${index}” is the size of the collection (2).`, index,)
        throw new IndexOutOfBoundsException(`Index out of bound. The index “${index}” (${index + 1} after calculation) is under 0.`, index,)
    }

    public override getFirst(): T1 { return this.value1 }

    public override getLast(): T2 { return this.value2 }


    public override getOrElse<const U, const I extends number,>(index: I, defaultValue: IndexWithReturnCallback<U>,): I extends | 0 | -1 ? T1 : I extends | 1 | -2 ? T2 : U
    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public override getOrElse<const I extends number, >(index: I, defaultValue: IndexWithReturnCallback<T>,): I extends | 0 | -1 ? T1 : I extends | 1 | -2 ? T2 : T
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) {
        if (index === 0)
            return this.value1
        if (index === 1)
            return this.value2
        if (index === -1)
            return this.value2
        if (index === -2)
            return this.value1
        return defaultValue(index,)
    }


    public override getFirstOrElse<const U, >(defaultValue: ReturnCallback<U>,): T1
    public override getFirstOrElse(defaultValue: ReturnCallback<T>,): T1
    public override getFirstOrElse() { return this.value1 }

    public override getLastOrElse<const U, >(defaultValue: ReturnCallback<U>,): T2
    public override getLastOrElse(defaultValue: ReturnCallback<T>,): T2
    public override getLastOrElse() { return this.value2 }


    public override getOrNull<const I extends number, >(index: I,): I extends | 0 | -1 ? T1 : I extends | 1 | -2 ? T2 : null
    public override getOrNull(index: number,) {
        if (index === 0)
            return this.value1
        if (index === 1)
            return this.value2
        if (index === -1)
            return this.value2
        if (index === -2)
            return this.value1
        return null
    }

    public override getFirstOrNull(): T1 { return this.value1 }

    public override getLastOrNull(): T2 { return this.value2 }

    //#endregion -------------------- Get --------------------
    //#region -------------------- Find first --------------------

    public override findFirst<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public override findFirst(predicate: BooleanCallback<T>,): T
    public override findFirst(predicate: BooleanCallback<T>,) {
        if (predicate.length === 1) {
            const value1 = this.value1
            if ((predicate as (value: T,) => boolean)(value1,))
                return value1

            const value2 = this.value2
            if ((predicate as (value: T,) => boolean)(value2,))
                return value2
            throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findFirst” predicate received in the collection.", 2,)
        }
        if (predicate.length >= 2) {
            const value1 = this.value1
            if (predicate(value1, 0,))
                return value1

            const value2 = this.value2
            if (predicate(value2, 1,))
                return value2
            throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findFirst” predicate received in the collection.", 2,)
        }

        if ((predicate as () => boolean)())
            return this.value1
        if ((predicate as () => boolean)())
            return this.value2
        throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findFirst” predicate received in the collection.", 2,)
    }

    public override findFirstOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findFirstOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public override findFirstOrNull(predicate: BooleanCallback<T>,) {
        if (predicate.length === 1) {
            const value1 = this.value1
            if ((predicate as (value: T,) => boolean)(value1,))
                return value1

            const value2 = this.value2
            if ((predicate as (value: T,) => boolean)(value2,))
                return value2
            return null
        }
        if (predicate.length >= 2) {
            const value1 = this.value1
            if (predicate(value1, 0,))
                return value1

            const value2 = this.value2
            if (predicate(value2, 1,))
                return value2
            return null
        }

        if ((predicate as () => boolean)())
            return this.value1
        if ((predicate as () => boolean)())
            return this.value2
        return null
    }

    public override findFirstIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public override findFirstIndexed(predicate: ReverseBooleanCallback<T>,): T
    public override findFirstIndexed(predicate: ReverseBooleanCallback<T>,) {
        if (predicate.length === 1)
            if ((predicate as (index: number,) => boolean)(0,))
                return this.value1
            else if ((predicate as (index: number,) => boolean)(1,))
                return this.value2
            else
                throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findFirstIndexed” predicate received in the collection.", 2,)
        if (predicate.length >= 2) {
            const value1 = this.value1
            if (predicate(0, value1,))
                return value1

            const value2 = this.value2
            if (predicate(1, value2,))
                return value2
            throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findFirstIndexed” predicate received in the collection.", 2,)
        }

        if ((predicate as () => boolean)())
            return this.value1
        if ((predicate as () => boolean)())
            return this.value2
        throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findFirstIndexed” predicate received in the collection.", 2,)
    }

    public override findFirstIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,) {
        if (predicate.length === 1)
            if ((predicate as (index: number,) => boolean)(0,))
                return this.value1
            else if ((predicate as (index: number,) => boolean)(1,))
                return this.value2
            else
                return null
        if (predicate.length >= 2) {
            const value1 = this.value1
            if (predicate(0, value1,))
                return value1

            const value2 = this.value2
            if (predicate(1, value2,))
                return value2
            return null
        }

        if ((predicate as () => boolean)())
            return this.value1
        if ((predicate as () => boolean)())
            return this.value2
        return null
    }

    //#endregion -------------------- Find first --------------------
    //#region -------------------- Find last --------------------

    public override findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public override findLast(predicate: BooleanCallback<T>,): T
    public override findLast(predicate: BooleanCallback<T>,) {
        if (predicate.length === 1) {
            const value2 = this.value2
            if ((predicate as (value: T,) => boolean)(value2,))
                return value2

            const value1 = this.value1
            if ((predicate as (value: T,) => boolean)(value1,))
                return value1
            throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findLast” predicate received in the collection.", 2,)
        }
        if (predicate.length >= 2) {
            const value2 = this.value2
            if (predicate(value2, 1,))
                return value2

            const value1 = this.value1
            if (predicate(value1, 0,))
                return value1
            throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findLast” predicate received in the collection.", 2,)
        }

        if ((predicate as () => boolean)())
            return this.value2
        if ((predicate as () => boolean)())
            return this.value1
        throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findLast” predicate received in the collection.", 2,)
    }

    public override findLastOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public override findLastOrNull(predicate: BooleanCallback<T>,) {
        if (predicate.length === 1) {
            const value2 = this.value2
            if ((predicate as (value: T,) => boolean)(value2,))
                return value2

            const value1 = this.value1
            if ((predicate as (value: T,) => boolean)(value1,))
                return value1
            return null
        }
        if (predicate.length >= 2) {
            const value2 = this.value2
            if (predicate(value2, 1,))
                return value2

            const value1 = this.value1
            if (predicate(value1, 0,))
                return value1
            return null
        }

        if ((predicate as () => boolean)())
            return this.value2
        if ((predicate as () => boolean)())
            return this.value1
        return null
    }

    public override findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,): T
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,) {
        if (predicate.length === 1)
            if ((predicate as (index: number,) => boolean)(1,))
                return this.value2
            else if ((predicate as (index: number,) => boolean)(0,))
                return this.value1
            else
                throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findLastIndexed” predicate received in the collection.", 2,)
        if (predicate.length >= 2) {
            const value2 = this.value2
            if (predicate(1, value2,))
                return value2

            const value1 = this.value1
            if (predicate(0, value1,))
                return value1
            throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findLastIndexed” predicate received in the collection.", 2,)
        }

        if ((predicate as () => boolean)())
            return this.value2
        if ((predicate as () => boolean)())
            return this.value1
        throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findLastIndexed” predicate received in the collection.", 2,)
    }

    public override findLastIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,) {
        if (predicate.length === 1)
            if ((predicate as (index: number,) => boolean)(1,))
                return this.value2
            else if ((predicate as (index: number,) => boolean)(0,))
                return this.value1
            else
                return null
        if (predicate.length >= 2) {
            const value2 = this.value2
            if (predicate(1, value2,))
                return value2

            const value1 = this.value1
            if (predicate(0, value1,))
                return value1
            return null
        }

        if ((predicate as () => boolean)())
            return this.value2
        if ((predicate as () => boolean)())
            return this.value1
        return null
    }

    //#endregion -------------------- Find last --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    //#region -------------------- First index of --------------------

    protected _firstIndexOf_core0(element: T,): | 0 | 1 { return this.#firstIndexOf_findInRange(element,) }

    protected _firstIndexOf_core1(element: T, from: number,): | 0 | 1 {
        if (__getStartingIndex(from,) === 0)
            return this.#firstIndexOf_findInRange(element,)
        return this.#firstIndexOf_find2(element,)
    }

    protected _firstIndexOf_core2(element: T, from: number, to: number,): | 0 | 1 {
        const startingIndex = __getStartingIndex(from,)
        const endingIndex = __getEndingIndex(to,)
        __validateInRange(from, startingIndex, to, endingIndex,)
        if (startingIndex === endingIndex)
            if (startingIndex === 0)
                return this.#firstIndexOf_find1(element,)
            else
                return this.#firstIndexOf_find2(element,)
        return this.#firstIndexOf_findInRange(element,)
    }

    protected _firstIndexOf_withNoFrom(element: T, to: number,): | 0 | 1 {
        if (__getEndingIndex(to,) === 0)
            return this.#firstIndexOf_find1(element,)
        return this.#firstIndexOf_findInRange(element,)
    }


    #firstIndexOf_find1(element: T,): 0 {
        if (this.value1 === element)
            return 0
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“0”) to the ending (“0”) indexes in the collection.`, 1,)
    }

    #firstIndexOf_find2(element: T,): 1 {
        if (this.value2 === element)
            return 1
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“1”) to the ending (“1”) indexes in the collection.`, 1,)
    }

    #firstIndexOf_findInRange(element: T,): | 0 | 1 {
        if (this.value1 === element)
            return 0
        if (this.value2 === element)
            return 1
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“0”) to the ending (“1”) indexes in the collection.`, 2,)
    }


    public override firstIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,): | 0 | 1 {
        if (to == null)
            if (from == null)
                return this._firstIndexOf_core0(element,)
            else
                return this._firstIndexOf_core1(element, from,)
        if (from == null)
            return this._firstIndexOf_withNoFrom(element, to,)
        return this._firstIndexOf_core2(element, from, to,)
    }

    //#endregion -------------------- First index of --------------------
    //#region -------------------- First index of or null --------------------

    protected _firstIndexOfOrNull_core0(element: T,): NullOrNumber<| 0 | 1> { return this.#firstIndexOfOrNull_findInRange(element,) }

    protected _firstIndexOfOrNull_core1(element: T, from: number,): NullOrNumber<| 0 | 1> {
        const startingIndex = __getIndexOrNull(from,)
        if (startingIndex == null)
            return null
        if (startingIndex === 0)
            return this.#firstIndexOfOrNull_findInRange(element,)
        return this.#firstIndexOfOrNull_find2(element,)
    }

    protected _firstIndexOfOrNull_core2(element: T, from: number, to: number,): NullOrNumber<| 0 | 1> {
        const startingIndex = __getIndexOrNull(from,)
        if (startingIndex == null)
            return null

        const endingIndex = __getIndexOrNull(to,)
        if (endingIndex == null)
            return null
        if (endingIndex < startingIndex)
            return null
        if (endingIndex === startingIndex)
            if (startingIndex === 0)
                return this.#firstIndexOfOrNull_find1(element,)
            else
                return this.#firstIndexOfOrNull_find2(element,)
        return this.#firstIndexOfOrNull_findInRange(element,)
    }

    protected _firstIndexOfOrNull_withNoFrom(element: T, to: number,): NullOrNumber<| 0 | 1> {
        const endingIndex = __getIndexOrNull(to,)
        if (endingIndex == null)
            return null
        if (endingIndex === 0)
            return this.#firstIndexOfOrNull_find1(element,)
        return this.#firstIndexOfOrNull_findInRange(element,)
    }


    #firstIndexOfOrNull_find1(element: T,): NullOrZeroNumber {
        if (this.value1 === element)
            return 0
        return null
    }

    #firstIndexOfOrNull_find2(element: T,): NullOrOneNumber {
        if (this.value2 === element)
            return 1
        return null
    }

    #firstIndexOfOrNull_findInRange(element: T,): NullOrNumber<| 0 | 1> {
        if (this.value1 === element)
            return 0
        if (this.value2 === element)
            return 1
        return null
    }


    public override firstIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1> {
        if (to == null)
            if (from == null)
                return this._firstIndexOfOrNull_core0(element,)
            else
                return this._firstIndexOfOrNull_core1(element, from,)
        if (from == null)
            return this._firstIndexOfOrNull_withNoFrom(element, to,)
        return this._firstIndexOfOrNull_core2(element, from, to,)
    }

    //#endregion -------------------- First index of or null --------------------

    //#region -------------------- Last index of --------------------

    protected _lastIndexOf_core0(element: T,): | 0 | 1 { return this.#lastIndexOf_findInRange(element,) }

    protected _lastIndexOf_core1(element: T, from: number,): | 0 | 1 {
        if (__getStartingIndex(from,) === 1)
            return this.#lastIndexOf_find2(element,)
        return this.#lastIndexOf_findInRange(element,)
    }

    protected _lastIndexOf_core2(element: T, from: number, to: number,): | 0 | 1 {
        const startingIndex = __getStartingIndex(from,)
        const endingIndex = __getEndingIndex(to,)
        __validateInRange(from, startingIndex, to, endingIndex,)
        if (startingIndex === endingIndex)
            if (startingIndex === 1)
                return this.#lastIndexOf_find2(element,)
            else
                return this.#lastIndexOf_find1(element,)
        return this.#lastIndexOf_findInRange(element,)
    }

    protected _lastIndexOf_withNoFrom(element: T, to: number,): | 0 | 1 {
        if (__getEndingIndex(to,) === 1)
            return this.#lastIndexOf_findInRange(element,)
        return this.#lastIndexOf_find1(element,)
    }


    #lastIndexOf_find1(element: T,): 0 {
        if (this.value1 === element)
            return 0
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“0”) to the ending (“0”) indexes in the collection.`, 1,)
    }

    #lastIndexOf_find2(element: T,): 1 {
        if (this.value2 === element)
            return 1
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“1”) to the ending (“1”) indexes in the collection.`, 1,)
    }

    #lastIndexOf_findInRange(element: T,): | 0 | 1 {
        if (this.value2 === element)
            return 1
        if (this.value1 === element)
            return 0
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“0”) to the ending (“1”) indexes in the collection.`, -1,)
    }


    public override lastIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,): | 0 | 1 {
        if (to == null)
            if (from == null)
                return this._lastIndexOf_core0(element,)
            else
                return this._lastIndexOf_core1(element, from,)
        if (from == null)
            return this._lastIndexOf_withNoFrom(element, to,)
        return this._lastIndexOf_core2(element, from, to,)
    }

    //#endregion -------------------- Last index of --------------------
    //#region -------------------- last index of or null --------------------

    protected _lastIndexOfOrNull_core0(element: T,): NullOrNumber<| 0 | 1> { return this.#lastIndexOfOrNull_findInRange(element,) }

    protected _lastIndexOfOrNull_core1(element: T, from: number,): NullOrNumber<| 0 | 1> {
        const startingIndex = __getIndexOrNull(from,)
        if (startingIndex == null)
            return null
        if (startingIndex === 1)
            return this.#lastIndexOfOrNull_find2(element,)
        return this.#lastIndexOfOrNull_findInRange(element,)
    }

    protected _lastIndexOfOrNull_core2(element: T, from: number, to: number,): NullOrNumber<| 0 | 1> {
        const startingIndex = __getIndexOrNull(from,)
        if (startingIndex == null)
            return null

        const endingIndex = __getIndexOrNull(to,)
        if (endingIndex == null)
            return null
        if (endingIndex < startingIndex)
            return null
        if (endingIndex === startingIndex)
            if (startingIndex === 1)
                return this.#lastIndexOfOrNull_find2(element,)
            else
                return this.#lastIndexOfOrNull_find1(element,)
        return this.#lastIndexOfOrNull_findInRange(element,)
    }

    protected _lastIndexOfOrNull_withNoFrom(element: T, to: number,): NullOrNumber<| 0 | 1> {
        const endingIndex = __getIndexOrNull(to,)
        if (endingIndex == null)
            return null
        if (endingIndex === 1)
            return this.#lastIndexOfOrNull_findInRange(element,)
        return this.#lastIndexOfOrNull_find1(element,)
    }


    #lastIndexOfOrNull_find1(element: T,): NullOrZeroNumber {
        if (this.value1 === element)
            return 0
        return null
    }

    #lastIndexOfOrNull_find2(element: T,): NullOrOneNumber {
        if (this.value2 === element)
            return 1
        return null
    }

    #lastIndexOfOrNull_findInRange(element: T,): NullOrNumber<| 0 | 1> {
        if (this.value2 === element)
            return 1
        if (this.value1 === element)
            return 0
        return null
    }


    public override lastIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1> {
        if (to == null)
            if (from == null)
                return this._lastIndexOfOrNull_core0(element,)
            else
                return this._lastIndexOfOrNull_core1(element, from,)
        if (from == null)
            return this._lastIndexOfOrNull_withNoFrom(element, to,)
        return this._lastIndexOfOrNull_core2(element, from, to,)
    }

    //#endregion -------------------- last index of or null --------------------

    //#region -------------------- Index of first --------------------

    protected _indexOfFirst_core0(predicate: BooleanCallback<T>,): | 0 | 1 {
        if (predicate.length === 1)
            return this.#indexOfFirst_with1Argument_findInRange(predicate as (value: T,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfFirst_with2Argument_findInRange(predicate as (value: T,) => boolean,)
        return this.#indexOfFirst_with0Argument_findInRange(predicate as () => boolean,)
    }

    protected _indexOfFirst_core1(predicate: BooleanCallback<T>, from: number,): | 0 | 1 {
        if (__getStartingIndex(from,) === 0)
            if (predicate.length === 1)
                return this.#indexOfFirst_with1Argument_findInRange(predicate as (value: T,) => boolean,)
            else if (predicate.length >= 2)
                return this.#indexOfFirst_with2Argument_findInRange(predicate as (value: T,) => boolean,)
            else
                return this.#indexOfFirst_with0Argument_findInRange(predicate as () => boolean,)
        if (predicate.length === 1)
            return this.#indexOfFirst_with1Argument_find2(predicate as (value: T,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfFirst_with2Argument_find2(predicate as (value: T,) => boolean,)
        return this.#indexOfFirst_with0Argument_find2(predicate as () => boolean,)
    }

    protected _indexOfFirst_core2(predicate: BooleanCallback<T>, from: number, to: number,): | 0 | 1 {
        const startingIndex = __getStartingIndex(from,)
        const endingIndex = __getEndingIndex(to,)
        __validateInRange(from, startingIndex, to, endingIndex,)
        if (startingIndex === endingIndex)
            if (startingIndex === 0)
                if (predicate.length === 1)
                    return this.#indexOfFirst_with1Argument_find1(predicate as (value: T,) => boolean,)
                else if (predicate.length >= 2)
                    return this.#indexOfFirst_with2Argument_find1(predicate as (value: T,) => boolean,)
                else
                    return this.#indexOfFirst_with0Argument_find1(predicate as () => boolean,)
            else if (predicate.length === 1)
                return this.#indexOfFirst_with1Argument_find2(predicate as (value: T,) => boolean,)
            else if (predicate.length >= 2)
                return this.#indexOfFirst_with2Argument_find2(predicate as (value: T,) => boolean,)
            else
                return this.#indexOfFirst_with0Argument_find2(predicate as () => boolean,)
        if (predicate.length === 1)
            return this.#indexOfFirst_with1Argument_findInRange(predicate as (value: T,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfFirst_with2Argument_findInRange(predicate as (value: T,) => boolean,)
        return this.#indexOfFirst_with0Argument_findInRange(predicate as () => boolean,)
    }

    protected _indexOfFirst_coreWithNoFrom(predicate: BooleanCallback<T>, to: number,): | 0 | 1 {
        if (__getEndingIndex(to,) === 0)
            if (predicate.length === 1)
                return this.#indexOfFirst_with1Argument_find1(predicate as (value: T,) => boolean,)
            else if (predicate.length >= 2)
                return this.#indexOfFirst_with2Argument_find1(predicate as (value: T,) => boolean,)
            else
                return this.#indexOfFirst_with0Argument_find1(predicate as () => boolean,)
        if (predicate.length === 1)
            return this.#indexOfFirst_with1Argument_findInRange(predicate as (value: T,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfFirst_with2Argument_findInRange(predicate as (value: T,) => boolean,)
        return this.#indexOfFirst_with0Argument_findInRange(predicate as () => boolean,)
    }


    #indexOfFirst_with0Argument_find1(predicate: () => boolean,): 0 {
        if (predicate())
            return 0
        throw new IndexNotFoundException("Index not found. No index could be found from the starting (“0”) to the ending (“0”) indexes in the collection.", 1,)
    }

    #indexOfFirst_with1Argument_find1(predicate: (value: T1,) => boolean,): 0 {
        if (predicate(this.value1,))
            return 0
        throw new IndexNotFoundException("Index not found. No index could be found from the starting (“0”) to the ending (“0”) indexes in the collection.", 1,)
    }

    #indexOfFirst_with2Argument_find1(predicate: (value: T1, index: 0,) => boolean,): 0 {
        if (predicate(this.value1, 0,))
            return 0
        throw new IndexNotFoundException("Index not found. No index could be found from the starting (“0”) to the ending (“0”) indexes in the collection.", 1,)
    }

    #indexOfFirst_with0Argument_find2(predicate: () => boolean,): 1 {
        if (predicate())
            return 1
        throw new IndexNotFoundException("Index not found. No index could be found from the starting (“1”) to the ending (“1”) indexes in the collection.", 2,)
    }

    #indexOfFirst_with1Argument_find2(predicate: (value: T2,) => boolean,): 1 {
        if (predicate(this.value2,))
            return 1
        throw new IndexNotFoundException("Index not found. No index could be found from the starting (“1”) to the ending (“1”) indexes in the collection.", 2,)
    }

    #indexOfFirst_with2Argument_find2(predicate: (value: T2, index: 1,) => boolean,): 1 {
        if (predicate(this.value2, 1,))
            return 1
        throw new IndexNotFoundException("Index not found. No index could be found from the starting (“1”) to the ending (“1”) indexes in the collection.", 2,)
    }

    #indexOfFirst_with0Argument_findInRange(predicate: () => boolean,): | 0 | 1 {
        if (predicate())
            return 0
        if (predicate())
            return 1
        throw new IndexNotFoundException("Index not found. No index could be found from the starting (“0”) to the ending (“1”) indexes in the collection.", 2,)
    }

    #indexOfFirst_with1Argument_findInRange(predicate: (value: | T1 | T2,) => boolean,): | 0 | 1 {
        if (predicate(this.value1,))
            return 0
        if (predicate(this.value2,))
            return 1
        throw new IndexNotFoundException("Index not found. No index could be found from the starting (“0”) to the ending (“1”) indexes in the collection.", 2,)
    }

    #indexOfFirst_with2Argument_findInRange(predicate: (value: | T1 | T2, index: | 0 | 1,) => boolean,): | 0 | 1 {
        if (predicate(this.value1, 0,))
            return 0
        if (predicate(this.value2, 1,))
            return 1
        throw new IndexNotFoundException("Index not found. No index could be found from the starting (“0”) to the ending (“1”) indexes in the collection.", 2,)
    }


    public override indexOfFirst(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): | 0 | 1 {
        if (to == null)
            if (from == null)
                return this._indexOfFirst_core0(predicate,)
            else
                return this._indexOfFirst_core1(predicate, from,)
        if (from == null)
            return this._indexOfFirst_coreWithNoFrom(predicate, to,)
        return this._indexOfFirst_core2(predicate, from, to,)
    }

    //#endregion -------------------- Index of first --------------------
    //#region -------------------- Index of first or null --------------------

    protected _indexOfFirstOrNull_core0(predicate: BooleanCallback<T>,): NullOrNumber<| 0 | 1> {
        if (predicate.length === 1)
            return this.#indexOfFirstOrNull_with1Argument_findInRange(predicate as (value: T,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfFirstOrNull_with2Argument_findInRange(predicate as (value: T,) => boolean,)
        return this.#indexOfFirstOrNull_with0Argument_findInRange(predicate as () => boolean,)
    }

    protected _indexOfFirstOrNull_core1(predicate: BooleanCallback<T>, from: number,): NullOrNumber<| 0 | 1> {
        const startingIndex = __getIndexOrNull(from,)
        if (startingIndex == null)
            return null
        if (startingIndex === 0)
            if (predicate.length === 1)
                return this.#indexOfFirstOrNull_with1Argument_findInRange(predicate as (value: T,) => boolean,)
            else if (predicate.length >= 2)
                return this.#indexOfFirstOrNull_with2Argument_findInRange(predicate as (value: T,) => boolean,)
            else
                return this.#indexOfFirstOrNull_with0Argument_findInRange(predicate as () => boolean,)
        if (predicate.length === 1)
            return this.#indexOfFirstOrNull_with1Argument_find2(predicate as (value: T,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfFirstOrNull_with2Argument_find2(predicate as (value: T,) => boolean,)
        return this.#indexOfFirstOrNull_with0Argument_find2(predicate as () => boolean,)
    }

    protected _indexOfFirstOrNull_core2(predicate: BooleanCallback<T>, from: number, to: number,): NullOrNumber<| 0 | 1> {
        const startingIndex = __getIndexOrNull(from,)
        if (startingIndex == null)
            return null

        const endingIndex = __getIndexOrNull(to,)
        if (endingIndex == null)
            return null
        if (endingIndex < startingIndex)
            return null
        if (startingIndex === endingIndex)
            if (startingIndex === 0)
                if (predicate.length === 1)
                    return this.#indexOfFirstOrNull_with1Argument_find1(predicate as (value: T,) => boolean,)
                else if (predicate.length >= 2)
                    return this.#indexOfFirstOrNull_with2Argument_find1(predicate as (value: T,) => boolean,)
                else
                    return this.#indexOfFirstOrNull_with0Argument_find1(predicate as () => boolean,)
            else if (predicate.length === 1)
                return this.#indexOfFirstOrNull_with1Argument_find2(predicate as (value: T,) => boolean,)
            else if (predicate.length >= 2)
                return this.#indexOfFirstOrNull_with2Argument_find2(predicate as (value: T,) => boolean,)
            else
                return this.#indexOfFirstOrNull_with0Argument_find2(predicate as () => boolean,)
        if (predicate.length === 1)
            return this.#indexOfFirstOrNull_with1Argument_findInRange(predicate as (value: T,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfFirstOrNull_with2Argument_findInRange(predicate as (value: T,) => boolean,)
        return this.#indexOfFirstOrNull_with0Argument_findInRange(predicate as () => boolean,)
    }

    protected _indexOfFirstOrNull_coreWithNoFrom(predicate: BooleanCallback<T>, to: number,): NullOrNumber<| 0 | 1> {
        const endingIndex = __getIndexOrNull(to,)
        if (endingIndex == null)
            return null
        if (endingIndex === 0)
            if (predicate.length === 1)
                return this.#indexOfFirstOrNull_with1Argument_find1(predicate as (value: T,) => boolean,)
            else if (predicate.length >= 2)
                return this.#indexOfFirstOrNull_with2Argument_find1(predicate as (value: T,) => boolean,)
            else
                return this.#indexOfFirstOrNull_with0Argument_find1(predicate as () => boolean,)
        if (predicate.length === 1)
            return this.#indexOfFirstOrNull_with1Argument_findInRange(predicate as (value: T,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfFirstOrNull_with2Argument_findInRange(predicate as (value: T,) => boolean,)
        return this.#indexOfFirstOrNull_with0Argument_findInRange(predicate as () => boolean,)
    }


    #indexOfFirstOrNull_with0Argument_find1(predicate: () => boolean,): NullOrZeroNumber {
        if (predicate())
            return 0
        return null
    }

    #indexOfFirstOrNull_with0Argument_find2(predicate: () => boolean,): NullOrOneNumber {
        if (predicate())
            return 1
        return null
    }

    #indexOfFirstOrNull_with0Argument_findInRange(predicate: () => boolean,): NullOrNumber<| 0 | 1> {
        if (predicate())
            return 0
        if (predicate())
            return 1
        return null
    }

    #indexOfFirstOrNull_with1Argument_find1(predicate: (value: T1,) => boolean,): NullOrZeroNumber {
        if (predicate(this.value1,))
            return 0
        return null
    }

    #indexOfFirstOrNull_with1Argument_find2(predicate: (value: T2,) => boolean,): NullOrOneNumber {
        if (predicate(this.value2,))
            return 1
        return null
    }

    #indexOfFirstOrNull_with1Argument_findInRange(predicate: (value: | T1 | T2,) => boolean,): NullOrNumber<| 0 | 1> {
        if (predicate(this.value1,))
            return 0
        if (predicate(this.value2,))
            return 1
        return null
    }

    #indexOfFirstOrNull_with2Argument_find1(predicate: (value: T1, index: 0,) => boolean,): NullOrZeroNumber {
        if (predicate(this.value1, 0,))
            return 0
        return null
    }

    #indexOfFirstOrNull_with2Argument_find2(predicate: (value: T2, index: 1,) => boolean,): NullOrOneNumber {
        if (predicate(this.value2, 1,))
            return 1
        return null
    }

    #indexOfFirstOrNull_with2Argument_findInRange(predicate: (value: | T1 | T2, index: | 0 | 1,) => boolean,): NullOrNumber<| 0 | 1> {
        if (predicate(this.value1, 0,))
            return 0
        if (predicate(this.value2, 1,))
            return 1
        return null
    }


    public override indexOfFirstOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1> {
        if (to == null)
            if (from == null)
                return this._indexOfFirstOrNull_core0(predicate,)
            else
                return this._indexOfFirstOrNull_core1(predicate, from,)
        if (from == null)
            return this._indexOfFirstOrNull_coreWithNoFrom(predicate, to,)
        return this._indexOfFirstOrNull_core2(predicate, from, to,)
    }

    //#endregion -------------------- Index of first or null --------------------
    //#region -------------------- Index of first indexed --------------------

    protected _indexOfFirstIndexed_core0(predicate: ReverseBooleanCallback<T>,): | 0 | 1 {
        if (predicate.length === 1)
            return this.#indexOfFirstIndexed_with1Argument_findInRange(predicate as (index: number,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfFirstIndexed_with2Argument_findInRange(predicate as (index: number,) => boolean,)
        return this.#indexOfFirstIndexed_with0Argument_findInRange(predicate as () => boolean,)
    }

    protected _indexOfFirstIndexed_core1(predicate: ReverseBooleanCallback<T>, from: number,): | 0 | 1 {
        if (__getStartingIndex(from,) === 0)
            if (predicate.length === 1)
                return this.#indexOfFirstIndexed_with1Argument_findInRange(predicate as (index: number,) => boolean,)
            else if (predicate.length >= 2)
                return this.#indexOfFirstIndexed_with2Argument_findInRange(predicate as (index: number,) => boolean,)
            else
                return this.#indexOfFirstIndexed_with0Argument_findInRange(predicate as () => boolean,)
        if (predicate.length === 1)
            return this.#indexOfFirstIndexed_with1Argument_find2(predicate as (index: number,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfFirstIndexed_with2Argument_find2(predicate as (index: number,) => boolean,)
        return this.#indexOfFirstIndexed_with0Argument_find2(predicate as () => boolean,)
    }

    protected _indexOfFirstIndexed_core2(predicate: ReverseBooleanCallback<T>, from: number, to: number,): | 0 | 1 {
        const startingIndex = __getStartingIndex(from,)
        const endingIndex = __getEndingIndex(to,)
        __validateInRange(from, startingIndex, to, endingIndex,)
        if (startingIndex === endingIndex)
            if (startingIndex === 0)
                if (predicate.length === 1)
                    return this.#indexOfFirstIndexed_with1Argument_find1(predicate as (index: number,) => boolean,)
                else if (predicate.length >= 2)
                    return this.#indexOfFirstIndexed_with2Argument_find1(predicate as (index: number,) => boolean,)
                else
                    return this.#indexOfFirstIndexed_with0Argument_find1(predicate as () => boolean,)
            else if (predicate.length === 1)
                return this.#indexOfFirstIndexed_with1Argument_find2(predicate as (index: number,) => boolean,)
            else if (predicate.length >= 2)
                return this.#indexOfFirstIndexed_with2Argument_find2(predicate as (index: number,) => boolean,)
            else
                return this.#indexOfFirstIndexed_with0Argument_find2(predicate as () => boolean,)
        if (predicate.length === 1)
            return this.#indexOfFirstIndexed_with1Argument_findInRange(predicate as (index: number,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfFirstIndexed_with2Argument_findInRange(predicate as (index: number,) => boolean,)
        return this.#indexOfFirstIndexed_with0Argument_findInRange(predicate as () => boolean,)
    }

    protected _indexOfFirstIndexed_coreWithNoFrom(predicate: ReverseBooleanCallback<T>, to: number,): | 0 | 1 {
        if (__getEndingIndex(to,) === 0)
            if (predicate.length === 1)
                return this.#indexOfFirstIndexed_with1Argument_find1(predicate as (index: number,) => boolean,)
            else if (predicate.length >= 2)
                return this.#indexOfFirstIndexed_with2Argument_find1(predicate as (index: number,) => boolean,)
            else
                return this.#indexOfFirstIndexed_with0Argument_find1(predicate as () => boolean,)
        if (predicate.length === 1)
            return this.#indexOfFirstIndexed_with1Argument_findInRange(predicate as (index: number,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfFirstIndexed_with2Argument_findInRange(predicate as (index: number,) => boolean,)
        return this.#indexOfFirstIndexed_with0Argument_findInRange(predicate as () => boolean,)
    }


    #indexOfFirstIndexed_with0Argument_find1(predicate: () => boolean,): 0 {
        if (predicate())
            return 0
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“0”) to the ending (“0”) indexes in the collection.`, 1,)
    }

    #indexOfFirstIndexed_with0Argument_find2(predicate: () => boolean,): 1 {
        if (predicate())
            return 1
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“1”) to the ending (“1”) indexes in the collection.`, 2,)
    }

    #indexOfFirstIndexed_with0Argument_findInRange(predicate: () => boolean,): | 0 | 1 {
        if (predicate())
            return 0
        if (predicate())
            return 1
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“0”) to the ending (“1”) indexes in the collection.`, 2,)
    }

    #indexOfFirstIndexed_with1Argument_find1(predicate: (index: 0,) => boolean,): 0 {
        if (predicate(0,))
            return 0
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“0”) to the ending (“0”) indexes in the collection.`, 1,)
    }

    #indexOfFirstIndexed_with1Argument_find2(predicate: (index: 1,) => boolean,): 1 {
        if (predicate(1,))
            return 1
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“1”) to the ending (“1”) indexes in the collection.`, 2,)
    }

    #indexOfFirstIndexed_with1Argument_findInRange(predicate: (index: | 0 | 1,) => boolean,): | 0 | 1 {
        if (predicate(0,))
            return 0
        if (predicate(1,))
            return 1
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“0”) to the ending (“1”) indexes in the collection.`, 2,)
    }

    #indexOfFirstIndexed_with2Argument_find1(predicate: (index: 0, value: T1,) => boolean,): 0 {
        if (predicate(0, this.value1,))
            return 0
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“0”) to the ending (“0”) indexes in the collection.`, 1,)
    }

    #indexOfFirstIndexed_with2Argument_find2(predicate: (index: 1, value: T2,) => boolean,): 1 {
        if (predicate(1, this.value2,))
            return 1
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“1”) to the ending (“1”) indexes in the collection.`, 2,)
    }

    #indexOfFirstIndexed_with2Argument_findInRange(predicate: (index: | 0 | 1, value: | T1 | T2,) => boolean,): | 0 | 1 {
        if (predicate(0, this.value1,))
            return 0
        if (predicate(1, this.value2,))
            return 1
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“0”) to the ending (“1”) indexes in the collection.`, 2,)
    }


    public override indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): | 0 | 1 {
        if (to == null)
            if (from == null)
                return this._indexOfFirstIndexed_core0(predicate,)
            else
                return this._indexOfFirstIndexed_core1(predicate, from,)
        if (from == null)
            return this._indexOfFirstIndexed_coreWithNoFrom(predicate, to,)
        return this._indexOfFirstIndexed_core2(predicate, from, to,)
    }

    //#endregion -------------------- Index of first indexed --------------------
    //#region -------------------- Index of first indexed or null --------------------

    protected _indexOfFirstIndexedOrNull_core0(predicate: ReverseBooleanCallback<T>,): NullOrNumber<| 0 | 1> {
        if (predicate.length === 1)
            return this.#indexOfFirstIndexedOrNull_with1Argument_findInRange(predicate as (index: number,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfFirstIndexedOrNull_with2Argument_findInRange(predicate as (index: number,) => boolean,)
        return this.#indexOfFirstIndexedOrNull_with0Argument_findInRange(predicate as () => boolean,)
    }

    protected _indexOfFirstIndexedOrNull_core1(predicate: ReverseBooleanCallback<T>, from: number,): NullOrNumber<| 0 | 1> {
        const startingIndex = __getIndexOrNull(from,)
        if (startingIndex == null)
            return null
        if (startingIndex === 0)
            if (predicate.length === 1)
                return this.#indexOfFirstIndexedOrNull_with1Argument_findInRange(predicate as (index: number,) => boolean,)
            else if (predicate.length >= 2)
                return this.#indexOfFirstIndexedOrNull_with2Argument_findInRange(predicate as (index: number,) => boolean,)
            else
                return this.#indexOfFirstIndexedOrNull_with0Argument_findInRange(predicate as () => boolean,)
        if (predicate.length === 1)
            return this.#indexOfFirstIndexedOrNull_with1Argument_find2(predicate as (index: number,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfFirstIndexedOrNull_with2Argument_find2(predicate as (index: number,) => boolean,)
        return this.#indexOfFirstIndexedOrNull_with0Argument_find2(predicate as () => boolean,)
    }

    protected _indexOfFirstIndexedOrNull_core2(predicate: ReverseBooleanCallback<T>, from: number, to: number,): NullOrNumber<| 0 | 1> {
        const startingIndex = __getIndexOrNull(from,)
        if (startingIndex == null)
            return null

        const endingIndex = __getIndexOrNull(to,)
        if (endingIndex == null)
            return null
        if (endingIndex < startingIndex)
            return null
        if (startingIndex === endingIndex)
            if (startingIndex === 0)
                if (predicate.length === 1)
                    return this.#indexOfFirstIndexedOrNull_with1Argument_find1(predicate as (index: number,) => boolean,)
                else if (predicate.length >= 2)
                    return this.#indexOfFirstIndexedOrNull_with2Argument_find1(predicate as (index: number,) => boolean,)
                else
                    return this.#indexOfFirstIndexedOrNull_with0Argument_find1(predicate as () => boolean,)
            else if (predicate.length === 1)
                return this.#indexOfFirstIndexedOrNull_with1Argument_find2(predicate as (index: number,) => boolean,)
            else if (predicate.length >= 2)
                return this.#indexOfFirstIndexedOrNull_with2Argument_find2(predicate as (index: number,) => boolean,)
            else
                return this.#indexOfFirstIndexedOrNull_with0Argument_find2(predicate as () => boolean,)
        if (predicate.length === 1)
            return this.#indexOfFirstIndexedOrNull_with1Argument_findInRange(predicate as (index: number,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfFirstIndexedOrNull_with2Argument_findInRange(predicate as (index: number,) => boolean,)
        return this.#indexOfFirstIndexedOrNull_with0Argument_findInRange(predicate as () => boolean,)
    }

    protected _indexOfFirstIndexedOrNull_coreWithNoFrom(predicate: ReverseBooleanCallback<T>, to: number,): NullOrNumber<| 0 | 1> {
        const endingIndex = __getIndexOrNull(to,)
        if (endingIndex == null)
            return null
        if (endingIndex === 0)
            if (predicate.length === 1)
                return this.#indexOfFirstIndexedOrNull_with1Argument_find1(predicate as (index: number,) => boolean,)
            else if (predicate.length >= 2)
                return this.#indexOfFirstIndexedOrNull_with2Argument_find1(predicate as (index: number,) => boolean,)
            else
                return this.#indexOfFirstIndexedOrNull_with0Argument_find1(predicate as () => boolean,)
        if (predicate.length === 1)
            return this.#indexOfFirstIndexedOrNull_with1Argument_findInRange(predicate as (index: number,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfFirstIndexedOrNull_with2Argument_findInRange(predicate as (index: number,) => boolean,)
        return this.#indexOfFirstIndexedOrNull_with0Argument_findInRange(predicate as () => boolean,)
    }


    #indexOfFirstIndexedOrNull_with0Argument_find1(predicate: () => boolean,): NullOrZeroNumber {
        if (predicate())
            return 0
        return null
    }

    #indexOfFirstIndexedOrNull_with0Argument_find2(predicate: () => boolean,): NullOrOneNumber {
        if (predicate())
            return 1
        return null
    }

    #indexOfFirstIndexedOrNull_with0Argument_findInRange(predicate: () => boolean,): NullOrNumber<| 0 | 1> {
        if (predicate())
            return 0
        if (predicate())
            return 1
        return null
    }

    #indexOfFirstIndexedOrNull_with1Argument_find1(predicate: (index: 0,) => boolean,): NullOrZeroNumber {
        if (predicate(0,))
            return 0
        return null
    }

    #indexOfFirstIndexedOrNull_with1Argument_find2(predicate: (index: 1,) => boolean,): NullOrOneNumber {
        if (predicate(1,))
            return 1
        return null
    }

    #indexOfFirstIndexedOrNull_with1Argument_findInRange(predicate: (index: | 0 | 1,) => boolean,): NullOrNumber<| 0 | 1> {
        if (predicate(0,))
            return 0
        if (predicate(1,))
            return 1
        return null
    }

    #indexOfFirstIndexedOrNull_with2Argument_find1(predicate: (index: 0, value: T1,) => boolean,): NullOrZeroNumber {
        if (predicate(0, this.value1,))
            return 0
        return null
    }

    #indexOfFirstIndexedOrNull_with2Argument_find2(predicate: (index: 1, value: T2,) => boolean,): NullOrOneNumber {
        if (predicate(1, this.value2,))
            return 1
        return null
    }

    #indexOfFirstIndexedOrNull_with2Argument_findInRange(predicate: (index: | 0 | 1, value: | T1 | T2,) => boolean,): NullOrNumber<| 0 | 1> {
        if (predicate(1, this.value1,))
            return 0
        if (predicate(0, this.value2,))
            return 1
        return null
    }


    public override indexOfFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1> {
        if (to == null)
            if (from == null)
                return this._indexOfFirstIndexedOrNull_core0(predicate,)
            else
                return this._indexOfFirstIndexedOrNull_core1(predicate, from,)
        if (from == null)
            return this._indexOfFirstIndexedOrNull_coreWithNoFrom(predicate, to,)
        return this._indexOfFirstIndexedOrNull_core2(predicate, from, to,)
    }

    //#endregion -------------------- Index of first indexed or null --------------------

    //#region -------------------- Index of last --------------------

    protected _indexOfLast_core0(predicate: BooleanCallback<T>,): | 0 | 1 {
        if (predicate.length === 1)
            return this.#indexOfLast_with1Argument_findInRange(predicate as (value: T,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfLast_with2Argument_findInRange(predicate as (value: T,) => boolean,)
        return this.#indexOfLast_with0Argument_findInRange(predicate as () => boolean,)
    }

    protected _indexOfLast_core1(predicate: BooleanCallback<T>, from: number,): | 0 | 1 {
        if (__getStartingIndex(from,) === 1)
            if (predicate.length === 1)
                return this.#indexOfLast_with1Argument_find2(predicate as (value: T,) => boolean,)
            else if (predicate.length >= 2)
                return this.#indexOfLast_with2Argument_find2(predicate as (value: T,) => boolean,)
            else
                return this.#indexOfLast_with0Argument_find2(predicate as () => boolean,)
        if (predicate.length === 1)
            return this.#indexOfLast_with1Argument_findInRange(predicate as (value: T,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfLast_with2Argument_findInRange(predicate as (value: T,) => boolean,)
        return this.#indexOfLast_with0Argument_findInRange(predicate as () => boolean,)
    }

    protected _indexOfLast_core2(predicate: BooleanCallback<T>, from: number, to: number,): | 0 | 1 {
        const startingIndex = __getStartingIndex(from,)
        const endingIndex = __getEndingIndex(to,)
        __validateInRange(from, startingIndex, to, endingIndex,)
        if (startingIndex === endingIndex)
            if (startingIndex === 1)
                if (predicate.length === 1)
                    return this.#indexOfLast_with1Argument_find2(predicate as (value: T,) => boolean,)
                else if (predicate.length >= 2)
                    return this.#indexOfLast_with2Argument_find2(predicate as (value: T,) => boolean,)
                else
                    return this.#indexOfLast_with0Argument_find2(predicate as () => boolean,)
            else if (predicate.length === 1)
                return this.#indexOfLast_with1Argument_find1(predicate as (value: T,) => boolean,)
            else if (predicate.length >= 2)
                return this.#indexOfLast_with2Argument_find1(predicate as (value: T,) => boolean,)
            else
                return this.#indexOfLast_with0Argument_find1(predicate as () => boolean,)
        if (predicate.length === 1)
            return this.#indexOfLast_with1Argument_findInRange(predicate as (value: T,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfLast_with2Argument_findInRange(predicate as (value: T,) => boolean,)
        return this.#indexOfLast_with0Argument_findInRange(predicate as () => boolean,)
    }

    protected _indexOfLast_coreWithNoFrom(predicate: BooleanCallback<T>, to: number,): | 0 | 1 {
        if (__getEndingIndex(to,) === 1)
            if (predicate.length === 1)
                return this.#indexOfLast_with1Argument_findInRange(predicate as (value: T,) => boolean,)
            else if (predicate.length >= 2)
                return this.#indexOfLast_with2Argument_findInRange(predicate as (value: T,) => boolean,)
            else
                return this.#indexOfLast_with0Argument_findInRange(predicate as () => boolean,)
        if (predicate.length === 1)
            return this.#indexOfLast_with1Argument_find1(predicate as (value: T,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfLast_with2Argument_find1(predicate as (value: T,) => boolean,)
        return this.#indexOfLast_with0Argument_find1(predicate as () => boolean,)
    }


    public override indexOfLast(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): | 0 | 1 {
        if (to == null)
            if (from == null)
                return this._indexOfLast_core0(predicate,)
            else
                return this._indexOfLast_core1(predicate, from,)
        if (from == null)
            return this._indexOfLast_coreWithNoFrom(predicate, to,)
        return this._indexOfLast_core2(predicate, from, to,)
    }


    #indexOfLast_with0Argument_find1(predicate: () => boolean,): 0 {
        if (predicate())
            return 0
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“0”) to the ending (“0”) indexes in the collection.`, 1,)
    }

    #indexOfLast_with0Argument_find2(predicate: () => boolean,): 1 {
        if (predicate())
            return 1
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“1”) to the ending (“1”) indexes in the collection.`, 2,)
    }

    #indexOfLast_with0Argument_findInRange(predicate: () => boolean,): | 0 | 1 {
        if (predicate())
            return 1
        if (predicate())
            return 0
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“0”) to the ending (“1”) indexes in the collection.`, 2,)
    }

    #indexOfLast_with1Argument_find1(predicate: (value: T1,) => boolean,): 0 {
        if (predicate(this.value1,))
            return 0
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“0”) to the ending (“0”) indexes in the collection.`, 1,)
    }

    #indexOfLast_with1Argument_find2(predicate: (value: T2,) => boolean,): 1 {
        if (predicate(this.value2,))
            return 1
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“1”) to the ending (“1”) indexes in the collection.`, 2,)
    }

    #indexOfLast_with1Argument_findInRange(predicate: (value: | T1 | T2,) => boolean,): | 0 | 1 {
        if (predicate(this.value2,))
            return 1
        if (predicate(this.value1,))
            return 0
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“0”) to the ending (“1”) indexes in the collection.`, 2,)
    }

    #indexOfLast_with2Argument_find1(predicate: (value: T1, index: 0,) => boolean,): 0 {
        if (predicate(this.value1, 0,))
            return 0
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“0”) to the ending (“0”) indexes in the collection.`, 1,)
    }

    #indexOfLast_with2Argument_find2(predicate: (value: T2, index: 1,) => boolean,): 1 {
        if (predicate(this.value2, 1,))
            return 1
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“1”) to the ending (“1”) indexes in the collection.`, 2,)
    }

    #indexOfLast_with2Argument_findInRange(predicate: (value: | T1 | T2, index: | 0 | 1,) => boolean,): | 0 | 1 {
        if (predicate(this.value2, 1,))
            return 1
        if (predicate(this.value1, 0,))
            return 0
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“0”) to the ending (“1”) indexes in the collection.`, 2,)
    }

    //#endregion -------------------- Index of last --------------------
    //#region -------------------- Index of last or null --------------------

    protected _indexOfLastOrNull_core0(predicate: BooleanCallback<T>,): NullOrNumber<| 0 | 1> {
        if (predicate.length === 1)
            return this.#indexOfLastOrNull_with1Argument_findInRange(predicate as (value: T,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfLastOrNull_with2Argument_findInRange(predicate as (value: T,) => boolean,)
        return this.#indexOfLastOrNull_with0Argument_findInRange(predicate as () => boolean,)
    }

    protected _indexOfLastOrNull_core1(predicate: BooleanCallback<T>, from: number,): NullOrNumber<| 0 | 1> {
        const startingIndex = __getIndexOrNull(from,)
        if (startingIndex == null)
            return null
        if (startingIndex === 1)
            if (predicate.length === 1)
                return this.#indexOfLastOrNull_with1Argument_find2(predicate as (value: T,) => boolean,)
            else if (predicate.length >= 2)
                return this.#indexOfLastOrNull_with2Argument_find2(predicate as (value: T,) => boolean,)
            else
                return this.#indexOfLastOrNull_with0Argument_find2(predicate as () => boolean,)
        if (predicate.length === 1)
            return this.#indexOfLastOrNull_with1Argument_findInRange(predicate as (value: T,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfLastOrNull_with2Argument_findInRange(predicate as (value: T,) => boolean,)
        return this.#indexOfLastOrNull_with0Argument_findInRange(predicate as () => boolean,)
    }

    protected _indexOfLastOrNull_core2(predicate: BooleanCallback<T>, from: number, to: number,): NullOrNumber<| 0 | 1> {
        const startingIndex = __getIndexOrNull(from,)
        if (startingIndex == null)
            return null

        const endingIndex = __getIndexOrNull(to,)
        if (endingIndex == null)
            return null
        if (endingIndex < startingIndex)
            return null
        if (startingIndex === endingIndex)
            if (startingIndex === 1)
                if (predicate.length === 1)
                    return this.#indexOfLastOrNull_with1Argument_find2(predicate as (value: T,) => boolean,)
                else if (predicate.length >= 2)
                    return this.#indexOfLastOrNull_with2Argument_find2(predicate as (value: T,) => boolean,)
                else
                    return this.#indexOfLastOrNull_with0Argument_find2(predicate as () => boolean,)
            else if (predicate.length === 1)
                return this.#indexOfLastOrNull_with1Argument_find1(predicate as (value: T,) => boolean,)
            else if (predicate.length >= 2)
                return this.#indexOfLastOrNull_with2Argument_find1(predicate as (value: T,) => boolean,)
            else
                return this.#indexOfLastOrNull_with0Argument_find1(predicate as () => boolean,)
        if (predicate.length === 1)
            return this.#indexOfLastOrNull_with1Argument_findInRange(predicate as (value: T,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfLastOrNull_with2Argument_findInRange(predicate as (value: T,) => boolean,)
        return this.#indexOfLastOrNull_with0Argument_findInRange(predicate as () => boolean,)
    }

    protected _indexOfLastOrNull_coreWithNoFrom(predicate: BooleanCallback<T>, to: number,): NullOrNumber<| 0 | 1> {
        const endingIndex = __getIndexOrNull(to,)
        if (endingIndex == null)
            return null
        if (endingIndex === 1)
            if (predicate.length === 1)
                return this.#indexOfLastOrNull_with1Argument_findInRange(predicate as (value: T,) => boolean,)
            else if (predicate.length >= 2)
                return this.#indexOfLastOrNull_with2Argument_findInRange(predicate as (value: T,) => boolean,)
            else
                return this.#indexOfLastOrNull_with0Argument_findInRange(predicate as () => boolean,)
        if (predicate.length === 1)
            return this.#indexOfLastOrNull_with1Argument_find1(predicate as (value: T,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfLastOrNull_with2Argument_find1(predicate as (value: T,) => boolean,)
        return this.#indexOfLastOrNull_with0Argument_find1(predicate as () => boolean,)
    }


    public override indexOfLastOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1> {
        if (to == null)
            if (from == null)
                return this._indexOfLastOrNull_core0(predicate,)
            else
                return this._indexOfLastOrNull_core1(predicate, from,)
        if (from == null)
            return this._indexOfLastOrNull_coreWithNoFrom(predicate, to,)
        return this._indexOfLastOrNull_core2(predicate, from, to,)
    }


    #indexOfLastOrNull_with0Argument_find1(predicate: () => boolean,): NullOrZeroNumber {
        if (predicate())
            return 0
        return null
    }

    #indexOfLastOrNull_with0Argument_find2(predicate: () => boolean,): NullOrOneNumber {
        if (predicate())
            return 1
        return null
    }

    #indexOfLastOrNull_with0Argument_findInRange(predicate: () => boolean,): NullOrNumber<| 0 | 1> {
        if (predicate())
            return 1
        if (predicate())
            return 0
        return null
    }

    #indexOfLastOrNull_with1Argument_find1(predicate: (value: T1,) => boolean,): NullOrZeroNumber {
        if (predicate(this.value1,))
            return 0
        return null
    }

    #indexOfLastOrNull_with1Argument_find2(predicate: (value: T2,) => boolean,): NullOrOneNumber {
        if (predicate(this.value2,))
            return 1
        return null
    }

    #indexOfLastOrNull_with1Argument_findInRange(predicate: (value: T,) => boolean,): NullOrNumber<| 0 | 1> {
        if (predicate(this.value2,))
            return 1
        if (predicate(this.value1,))
            return 0
        return null
    }

    #indexOfLastOrNull_with2Argument_find1(predicate: (value: T1, index: 0,) => boolean,): NullOrZeroNumber {
        if (predicate(this.value1, 0,))
            return 0
        return null
    }

    #indexOfLastOrNull_with2Argument_find2(predicate: (value: T2, index: 1,) => boolean,): NullOrOneNumber {
        if (predicate(this.value2, 1,))
            return 1
        return null
    }

    #indexOfLastOrNull_with2Argument_findInRange(predicate: (value: | T1 | T2, index: | 0 | 1,) => boolean,): NullOrNumber<| 0 | 1> {
        if (predicate(this.value2, 1,))
            return 1
        if (predicate(this.value1, 0,))
            return 0
        return null
    }

    //#endregion -------------------- Index of last or null --------------------
    //#region -------------------- Index of last indexed --------------------

    protected _indexOfLastIndexed_core0(predicate: ReverseBooleanCallback<T>,): | 0 | 1 {
        if (predicate.length === 1)
            return this.#indexOfLastIndexed_with1Argument_findInRange(predicate as (index: number,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfLastIndexed_with2Argument_findInRange(predicate as (index: number,) => boolean,)
        return this.#indexOfLastIndexed_with0Argument_findInRange(predicate as () => boolean,)
    }

    protected _indexOfLastIndexed_core1(predicate: ReverseBooleanCallback<T>, from: number,): | 0 | 1 {
        if (__getStartingIndex(from,) === 1)
            if (predicate.length === 1)
                return this.#indexOfLastIndexed_with1Argument_find2(predicate as (index: number,) => boolean,)
            else if (predicate.length >= 2)
                return this.#indexOfLastIndexed_with2Argument_find2(predicate as (index: number,) => boolean,)
            else
                return this.#indexOfLastIndexed_with0Argument_find2(predicate as () => boolean,)
        if (predicate.length === 1)
            return this.#indexOfLastIndexed_with1Argument_findInRange(predicate as (index: number,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfLastIndexed_with2Argument_findInRange(predicate as (index: number,) => boolean,)
        return this.#indexOfLastIndexed_with0Argument_findInRange(predicate as () => boolean,)
    }

    protected _indexOfLastIndexed_core2(predicate: ReverseBooleanCallback<T>, from: number, to: number,): | 0 | 1 {
        const startingIndex = __getStartingIndex(from,)
        const endingIndex = __getEndingIndex(to,)
        __validateInRange(from, startingIndex, to, endingIndex,)
        if (startingIndex === endingIndex)
            if (startingIndex === 1)
                if (predicate.length === 1)
                    return this.#indexOfLastIndexed_with1Argument_find2(predicate as (index: number,) => boolean,)
                else if (predicate.length >= 2)
                    return this.#indexOfLastIndexed_with2Argument_find2(predicate as (index: number,) => boolean,)
                else
                    return this.#indexOfLastIndexed_with0Argument_find2(predicate as () => boolean,)
            else if (predicate.length === 1)
                return this.#indexOfLastIndexed_with1Argument_find1(predicate as (index: number,) => boolean,)
            else if (predicate.length >= 2)
                return this.#indexOfLastIndexed_with2Argument_find1(predicate as (index: number,) => boolean,)
            else
                return this.#indexOfLastIndexed_with0Argument_find1(predicate as () => boolean,)
        if (predicate.length === 1)
            return this.#indexOfLastIndexed_with1Argument_findInRange(predicate as (index: number,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfLastIndexed_with2Argument_findInRange(predicate as (index: number,) => boolean,)
        return this.#indexOfLastIndexed_with0Argument_findInRange(predicate as () => boolean,)
    }

    protected _indexOfLastIndexed_coreWithNoFrom(predicate: ReverseBooleanCallback<T>, to: number,): | 0 | 1 {
        if (__getEndingIndex(to,) === 1)
            if (predicate.length === 1)
                return this.#indexOfLastIndexed_with1Argument_findInRange(predicate as (index: number,) => boolean,)
            else if (predicate.length >= 2)
                return this.#indexOfLastIndexed_with2Argument_findInRange(predicate as (index: number,) => boolean,)
            else
                return this.#indexOfLastIndexed_with0Argument_findInRange(predicate as () => boolean,)
        if (predicate.length === 1)
            return this.#indexOfLastIndexed_with1Argument_find1(predicate as (index: number,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfLastIndexed_with2Argument_find1(predicate as (index: number,) => boolean,)
        return this.#indexOfLastIndexed_with0Argument_find1(predicate as () => boolean,)
    }


    public override indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): | 0 | 1 {
        if (to == null)
            if (from == null)
                return this._indexOfLastIndexed_core0(predicate,)
            else
                return this._indexOfLastIndexed_core1(predicate, from,)
        if (from == null)
            return this._indexOfLastIndexed_coreWithNoFrom(predicate, to,)
        return this._indexOfLastIndexed_core2(predicate, from, to,)
    }


    #indexOfLastIndexed_with0Argument_find1(predicate: () => boolean,): 0 {
        if (predicate())
            return 0
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“0”) to the ending (“0”) indexes in the collection.`, 1,)
    }

    #indexOfLastIndexed_with0Argument_find2(predicate: () => boolean,): 1 {
        if (predicate())
            return 1
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“1”) to the ending (“1”) indexes in the collection.`, 2,)
    }

    #indexOfLastIndexed_with0Argument_findInRange(predicate: () => boolean,): | 0 | 1 {
        if (predicate())
            return 1
        if (predicate())
            return 0
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“0”) to the ending (“1”) indexes in the collection.`, 2,)
    }

    #indexOfLastIndexed_with1Argument_find1(predicate: (index: 0,) => boolean,): 0 {
        if (predicate(0,))
            return 0
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“0”) to the ending (“0”) indexes in the collection.`, 1,)
    }

    #indexOfLastIndexed_with1Argument_find2(predicate: (index: 1,) => boolean,): 1 {
        if (predicate(1,))
            return 1
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“1”) to the ending (“1”) indexes in the collection.`, 2,)
    }

    #indexOfLastIndexed_with1Argument_findInRange(predicate: (index: | 0 | 1) => boolean,): | 0 | 1 {
        if (predicate(1,))
            return 1
        if (predicate(0,))
            return 0
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“0”) to the ending (“1”) indexes in the collection.`, 2,)
    }

    #indexOfLastIndexed_with2Argument_find1(predicate: (index: 0, value: T1,) => boolean,): 0 {
        if (predicate(0, this.value1,))
            return 0
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“0”) to the ending (“0”) indexes in the collection.`, 1,)
    }

    #indexOfLastIndexed_with2Argument_find2(predicate: (index: 1, value: T2,) => boolean,): 1 {
        if (predicate(1, this.value2,))
            return 1
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“1”) to the ending (“1”) indexes in the collection.`, 2,)
    }

    #indexOfLastIndexed_with2Argument_findInRange(predicate: (index: | 0 | 1, value: | T1 | T2,) => boolean,): | 0 | 1 {
        if (predicate(1, this.value2,))
            return 1
        if (predicate(0, this.value1,))
            return 0
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“0”) to the ending (“1”) indexes in the collection.`, 1,)
    }

    //#endregion -------------------- Index of last indexed --------------------
    //#region -------------------- Index of last indexed or null --------------------

    protected _indexOfLastIndexedOrNull_core0(predicate: ReverseBooleanCallback<T>,): NullOrNumber<| 0 | 1> {
        if (predicate.length === 1)
            return this.#indexOfLastIndexedOrNull_with1Argument_findInRange(predicate as (index: number,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfLastIndexedOrNull_with2Argument_findInRange(predicate as (index: number,) => boolean,)
        return this.#indexOfLastIndexedOrNull_with0Argument_findInRange(predicate as () => boolean,)
    }

    protected _indexOfLastIndexedOrNull_core1(predicate: ReverseBooleanCallback<T>, from: number,): NullOrNumber<| 0 | 1> {
        const startingIndex = __getIndexOrNull(from,)
        if (startingIndex == null)
            return null
        if (startingIndex === 1)
            if (predicate.length === 1)
                return this.#indexOfLastIndexedOrNull_with1Argument_find2(predicate as (index: number,) => boolean,)
            else if (predicate.length >= 2)
                return this.#indexOfLastIndexedOrNull_with2Argument_find2(predicate as (index: number,) => boolean,)
            else
                return this.#indexOfLastIndexedOrNull_with0Argument_find2(predicate as () => boolean,)
        if (predicate.length === 1)
            return this.#indexOfLastIndexedOrNull_with1Argument_findInRange(predicate as (index: number,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfLastIndexedOrNull_with2Argument_findInRange(predicate as (index: number,) => boolean,)
        return this.#indexOfLastIndexedOrNull_with0Argument_findInRange(predicate as () => boolean,)
    }

    protected _indexOfLastIndexedOrNull_core2(predicate: ReverseBooleanCallback<T>, from: number, to: number,): NullOrNumber<| 0 | 1> {
        const startingIndex = __getIndexOrNull(from,)
        if (startingIndex == null)
            return null

        const endingIndex = __getIndexOrNull(to,)
        if (endingIndex == null)
            return null
        if (endingIndex < startingIndex)
            return null
        if (startingIndex === endingIndex)
            if (startingIndex === 1)
                if (predicate.length === 1)
                    return this.#indexOfLastIndexedOrNull_with1Argument_find2(predicate as (index: number,) => boolean,)
                else if (predicate.length >= 2)
                    return this.#indexOfLastIndexedOrNull_with2Argument_find2(predicate as (index: number,) => boolean,)
                else
                    return this.#indexOfLastIndexedOrNull_with0Argument_find2(predicate as () => boolean,)
            else if (predicate.length === 1)
                return this.#indexOfLastIndexedOrNull_with1Argument_find1(predicate as (index: number,) => boolean,)
            else if (predicate.length >= 2)
                return this.#indexOfLastIndexedOrNull_with2Argument_find1(predicate as (index: number,) => boolean,)
            else
                return this.#indexOfLastIndexedOrNull_with0Argument_find1(predicate as () => boolean,)
        if (predicate.length === 1)
            return this.#indexOfLastIndexedOrNull_with1Argument_findInRange(predicate as (index: number,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfLastIndexedOrNull_with2Argument_findInRange(predicate as (index: number,) => boolean,)
        return this.#indexOfLastIndexedOrNull_with0Argument_findInRange(predicate as () => boolean,)
    }

    protected _indexOfLastIndexedOrNull_coreWithNoFrom(predicate: ReverseBooleanCallback<T>, to: number,): NullOrNumber<| 0 | 1> {
        const endingIndex = __getIndexOrNull(to,)
        if (endingIndex == null)
            return null
        if (endingIndex === 1)
            if (predicate.length === 1)
                return this.#indexOfLastIndexedOrNull_with1Argument_findInRange(predicate as (index: number,) => boolean,)
            else if (predicate.length >= 2)
                return this.#indexOfLastIndexedOrNull_with2Argument_findInRange(predicate as (index: number,) => boolean,)
            else
                return this.#indexOfLastIndexedOrNull_with0Argument_findInRange(predicate as () => boolean,)
        if (predicate.length === 1)
            return this.#indexOfLastIndexedOrNull_with1Argument_find1(predicate as (index: number,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfLastIndexedOrNull_with2Argument_find1(predicate as (index: number,) => boolean,)
        return this.#indexOfLastIndexedOrNull_with0Argument_find1(predicate as () => boolean,)
    }


    public override indexOfLastIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1> {
        if (to == null)
            if (from == null)
                return this._indexOfLastIndexedOrNull_core0(predicate,)
            else
                return this._indexOfLastIndexedOrNull_core1(predicate, from,)
        if (from == null)
            return this._indexOfLastIndexedOrNull_coreWithNoFrom(predicate, to,)
        return this._indexOfLastIndexedOrNull_core2(predicate, from, to,)
    }


    #indexOfLastIndexedOrNull_with0Argument_find1(predicate: () => boolean,): NullOrZeroNumber {
        if (predicate())
            return 0
        return null
    }

    #indexOfLastIndexedOrNull_with0Argument_find2(predicate: () => boolean,): NullOrOneNumber {
        if (predicate())
            return 1
        return null
    }

    #indexOfLastIndexedOrNull_with0Argument_findInRange(predicate: () => boolean,): NullOrNumber<| 0 | 1> {
        if (predicate())
            return 1
        if (predicate())
            return 0
        return null
    }

    #indexOfLastIndexedOrNull_with1Argument_find1(predicate: (index: 0,) => boolean,): NullOrZeroNumber {
        if (predicate(0,))
            return 0
        return null
    }

    #indexOfLastIndexedOrNull_with1Argument_find2(predicate: (index: 1,) => boolean,): NullOrOneNumber {
        if (predicate(1,))
            return 1
        return null
    }

    #indexOfLastIndexedOrNull_with1Argument_findInRange(predicate: (index: | 0 | 1,) => boolean,): NullOrNumber<| 0 | 1> {
        if (predicate(1,))
            return 1
        if (predicate(0,))
            return 0
        return null
    }

    #indexOfLastIndexedOrNull_with2Argument_find1(predicate: (index: 0, value: T1,) => boolean,): NullOrZeroNumber {
        if (predicate(0, this.value1,))
            return 0
        return null
    }

    #indexOfLastIndexedOrNull_with2Argument_find2(predicate: (index: 1, value: T2,) => boolean,): NullOrOneNumber {
        if (predicate(1, this.value2,))
            return 1
        return null
    }

    #indexOfLastIndexedOrNull_with2Argument_findInRange(predicate: (index: | 0 | 1, value: T,) => boolean,): NullOrNumber<| 0 | 1> {
        if (predicate(1, this.value2,))
            return 1
        if (predicate(0, this.value1,))
            return 0
        return null
    }

    //#endregion -------------------- Index of last indexed or null --------------------

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    //#region -------------------- All --------------------

    public override all<S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolder<S>
    public override all(predicate: BooleanCallback<T>,): boolean
    public override all(predicate: BooleanCallback<T>,) {
        if (predicate.length === 1)
            return (predicate as (value: T,) => boolean)(this.value1,) && (predicate as (value: T,) => boolean)(this.value2,)
        if (predicate.length >= 2)
            return predicate(this.value1, 0,) && predicate(this.value2, 1,)
        return (predicate as () => boolean)() && (predicate as () => boolean)()
    }

    //#endregion -------------------- All --------------------
    //#region -------------------- Any --------------------

    public override any(): true
    public override any(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override any(predicate?: Nullable<BooleanCallback<T>>,) {
        if (predicate == null)
            return true
        return this._any(predicate,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.any CollectionHolder.any(predicate)} */
    protected _any(predicate: BooleanCallback<T>,): boolean {
        if (predicate.length === 1)
            return (predicate as (value: T,) => boolean)(this.value1,) || (predicate as (value: T,) => boolean)(this.value2,)
        if (predicate.length >= 2)
            return predicate(this.value1, 0,) || predicate(this.value2, 1,)
        return (predicate as () => boolean)() || (predicate as () => boolean)()
    }

    //#endregion -------------------- Any --------------------
    //#region -------------------- None --------------------

    public override none(): false
    public override none(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override none(predicate?: Nullable<BooleanCallback<T>>,) {
        if (predicate == null)
            return false
        return this._none(predicate,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.none CollectionHolder.none(predicate)} */
    protected _none(predicate: BooleanCallback<T>,): boolean {
        if (predicate.length === 1)
            return !(predicate as (value: T,) => boolean)(this.value1,) && !(predicate as (value: T,) => boolean)(this.value2,)
        if (predicate.length >= 2)
            return !predicate(this.value1, 0,) && !predicate(this.value2, 1,)
        return !(predicate as () => boolean)() && !(predicate as () => boolean)()
    }

    //#endregion -------------------- None --------------------

    //#region -------------------- Has ‥ --------------------

    public override get hasNull(): boolean {
        return this.value1 == null || this.value2 == null
    }

    public override get hasNoNulls(): boolean {
        return this.value1 != null && this.value2 != null
    }


    public override get hasDuplicate(): boolean {
        return this.value1 as T === this.value2 as T
    }

    public override get hasNoDuplicates(): boolean {
        return this.value1 as T !== this.value2 as T
    }

    //#endregion -------------------- Has ‥ --------------------
    //#region -------------------- Has --------------------

    public override has(value: T,): boolean {
        return this.value1 === value || this.value2 === value
    }

    public override hasNot(value: T,): boolean {
        return this.value1 !== value && this.value2 !== value
    }

    //#endregion -------------------- Has --------------------
    //#region -------------------- Has one --------------------

    public override hasOne(values: Nullable<Array<T>>,): boolean
    public override hasOne(values: Nullable<Set<T>>,): boolean
    public override hasOne(values: Nullable<CollectionHolder<T>>,): boolean
    public override hasOne(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public override hasOne(values: Nullable<CollectionIterator<T>>,): boolean
    public override hasOne(values: Nullable<IteratorObject<T, unknown, unknown>>,): boolean
    public override hasOne(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public override hasOne(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public override hasOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
    public override hasOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
        if (values == null)
            return this._hasOneByNull(values,)

        if (values instanceof Array)
            return this._hasOneByArray(values,)
        if (values instanceof Set)
            return this._hasOneBySet(values,)
        if (isCollectionHolder(values,))
            return this._hasOneByCollectionHolder(values,)
        if (isMinimalistCollectionHolder(values,))
            return this._hasOneByMinimalistCollectionHolder(values,)
        if (isCollectionIterator(values,))
            return this._hasOneByCollectionIterator(values,)
        if (values instanceof Iterator)
            return this._hasOneByIterator(values,)

        if (isArrayByStructure<T>(values,))
            return this._hasOneByArray(values,)
        if (isSetByStructure<T>(values,))
            return this._hasOneBySet(values,)
        if (isCollectionHolderByStructure<T>(values,))
            return this._hasOneByCollectionHolder(values,)
        if (isMinimalistCollectionHolderByStructure<T>(values,))
            return this._hasOneByMinimalistCollectionHolder(values,)
        if (isCollectionIteratorByStructure<T>(values,))
            return this._hasOneByCollectionIterator(values,)
        if (isIteratorByStructure<T>(values,))
            return this._hasOneByIterator(values,)
        return this._hasOneByIterable(values,)
    }


    /** An additional method to be the equivalent of {@link CollectionHolder.hasOne CollectionHolder.hasOne(values: NullOrUndefined)} */
    protected _hasOneByNull(_values: NullOrUndefined): true { return true }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasOne CollectionHolder.hasOne(values: Array<T>)} */
    protected _hasOneByArray(values: Array<T>,): boolean {
        const size = values.length
        if (size === 0)
            return true

        const value1 = this.value1
        const value2 = this.value2
        let index = -1
        while (++index < size)
            if (value1 === values[index])
                return true
            else if (value2 === values[index])
                return true
        return false
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasOne CollectionHolder.hasOne(values: Set<T>)} */
    protected _hasOneBySet(values: Set<T>,): boolean {
        const size = values.size
        if (size === 0)
            return true

        const value1 = this.value1
        const value2 = this.value2
        const iterator = values[Symbol.iterator]()
        let index = -1
        while (++index < size)
            if (value1 === iterator.next().value)
                return true
            else if (value2 === iterator.next().value)
                return true
        return false
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasOne CollectionHolder.hasOne(values: MinimalistCollectionHolder<T>)} */
    protected _hasOneByMinimalistCollectionHolder(values: MinimalistCollectionHolder<T>,): boolean {
        const size = values.size
        if (size === 0)
            return true

        const value1 = this.value1
        const value2 = this.value2
        let index = -1
        while (++index < size)
            if (value1 === values.get(index,))
                return true
            else if (value2 === values.get(index,))
                return true
        return false
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasOne CollectionHolder.hasOne(values: CollectionHolder<T>)} */
    protected _hasOneByCollectionHolder(values: CollectionHolder<T>,): boolean {
        if (values.isEmpty)
            return true

        const value1 = this.value1
        const value2 = this.value2
        const size = values.size
        let index = -1
        while (++index < size)
            if (value1 === values.get(index,))
                return true
            else if (value2 === values.get(index,))
                return true
        return false
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasOne CollectionHolder.hasOne(values: CollectionIterator<T>)} */
    protected _hasOneByCollectionIterator(values: CollectionIterator<T>,): boolean {
        if (values.isEmpty)
            return true

        const value1 = this.value1
        const value2 = this.value2
        const size = values.size
        let index = -1
        while (++index < size) {
            const value = values.nextValue
            if (value1 === value)
                return true
            if (value2 === value)
                return true
        }
        return false
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasOne CollectionHolder.hasOne(values: Iterator<T>)} */
    protected _hasOneByIterator(values: Iterator<T, unknown, unknown>,): boolean {
        let iteratorResult = values.next()
        if (iteratorResult.done)
            return true

        const value1 = this.value1
        const value2 = this.value2
        const firstValue = iteratorResult.value
        if (value1 === firstValue)
            return true
        if (value2 === firstValue)
            return true
        while (!(iteratorResult = values.next()).done) {
            const value = iteratorResult.value
            if (value1 === value)
                return true
            if (value2 === value)
                return true
        }
        return false
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasOne CollectionHolder.hasOne(values: Iterable<T>)} */
    protected _hasOneByIterable(values: Iterable<T, unknown, unknown>,): boolean {
        const iterator = values[Symbol.iterator]()
        let iteratorResult = iterator.next()
        if (iteratorResult.done)
            return true

        const value1 = this.value1
        const value2 = this.value2
        const firstValue = iteratorResult.value
        if (value1 === firstValue)
            return true
        if (value2 === firstValue)
            return true
        while (!(iteratorResult = iterator.next()).done) {
            const value = iteratorResult.value
            if (value1 === value)
                return true
            if (value2 === value)
                return true
        }
        return false
    }

    //#endregion -------------------- Has one --------------------
    //#region -------------------- Has not one --------------------

    public override hasNotOne(values: Nullable<Array<T>>,): boolean
    public override hasNotOne(values: Nullable<Set<T>>,): boolean
    public override hasNotOne(values: Nullable<CollectionHolder<T>>,): boolean
    public override hasNotOne(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public override hasNotOne(values: Nullable<CollectionIterator<T>>,): boolean
    public override hasNotOne(values: Nullable<IteratorObject<T, unknown, unknown>>,): boolean
    public override hasNotOne(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public override hasNotOne(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public override hasNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
    public override hasNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
        if (values == null)
            return this._hasNotOneByNull(values,)

        if (values instanceof Array)
            return this._hasNotOneByArray(values,)
        if (values instanceof Set)
            return this._hasNotOneBySet(values,)
        if (isCollectionHolder(values,))
            return this._hasNotOneByCollectionHolder(values,)
        if (isMinimalistCollectionHolder(values,))
            return this._hasNotOneByMinimalistCollectionHolder(values,)
        if (isCollectionIterator(values,))
            return this._hasNotOneByCollectionIterator(values,)
        if (values instanceof Iterator)
            return this._hasNotOneByIterator(values,)

        if (isArrayByStructure<T>(values,))
            return this._hasNotOneByArray(values,)
        if (isSetByStructure<T>(values,))
            return this._hasNotOneBySet(values,)
        if (isCollectionHolderByStructure<T>(values,))
            return this._hasNotOneByCollectionHolder(values,)
        if (isMinimalistCollectionHolderByStructure<T>(values,))
            return this._hasNotOneByMinimalistCollectionHolder(values,)
        if (isCollectionIteratorByStructure<T>(values,))
            return this._hasNotOneByCollectionIterator(values,)
        if (isIteratorByStructure<T>(values,))
            return this._hasNotOneByIterator(values,)
        return this._hasNotOneByIterable(values,)
    }


    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotOne CollectionHolder.hasNotOne(values: NullOrUndefined)} */
    protected _hasNotOneByNull(_values: NullOrUndefined,): false { return false }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotOne CollectionHolder.hasNotOne(values: Array<T>)} */
    protected _hasNotOneByArray(values: Array<T>,): boolean {
        const size = values.length
        if (size === 0)
            return false

        const value1 = this.value1
        const value2 = this.value2
        let index = -1
        while (++index < size) {
            const value = values[index] as T
            if (value1 === value)
                return false
            if (value2 === value)
                return false
        }
        return true
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotOne CollectionHolder.hasNotOne(values: Set<T>)} */
    protected _hasNotOneBySet(values: Set<T>,): boolean {
        const size = values.size
        if (size === 0)
            return false

        const value1 = this.value1
        const value2 = this.value2
        const iterator = values[Symbol.iterator]()
        let index = -1
        while (++index < size) {
            const value = iterator.next().value as T
            if (value1 === value)
                return false
            if (value2 === value)
                return false
        }
        return true
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotOne CollectionHolder.hasNotOne(values: MinimalistCollectionHolder<T>)} */
    protected _hasNotOneByMinimalistCollectionHolder(values: MinimalistCollectionHolder<T>,): boolean {
        const size = values.size
        if (size === 0)
            return false

        const value1 = this.value1
        const value2 = this.value2
        let index = -1
        while (++index < size) {
            const value = values.get(index,)
            if (value1 === value)
                return false
            if (value2 === value)
                return false
        }
        return true
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotOne CollectionHolder.hasNotOne(values: CollectionHolder<T>)} */
    protected _hasNotOneByCollectionHolder(values: CollectionHolder<T>,): boolean {
        if (values.isEmpty)
            return false

        const value1 = this.value1
        const value2 = this.value2
        const size = values.size
        let index = -1
        while (++index < size) {
            const value = values.get(index,)
            if (value1 === value)
                return false
            if (value2 === value)
                return false
        }
        return true
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotOne CollectionHolder.hasNotOne(values: CollectionIterator<T>)} */
    protected _hasNotOneByCollectionIterator(values: CollectionIterator<T>,): boolean {
        if (values.isEmpty)
            return false

        const value1 = this.value1
        const value2 = this.value2
        const size = values.size
        let index = -1
        while (++index < size) {
            const value = values.nextValue
            if (value1 === value)
                return false
            if (value2 === value)
                return false
        }
        return true
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotOne CollectionHolder.hasNotOne(values: Iterator<T>)} */
    protected _hasNotOneByIterator(values: Iterator<T, unknown, unknown>,): boolean {
        let iteratorResult = values.next()
        if (iteratorResult.done)
            return false

        const firstValue = iteratorResult.value
        const value1 = this.value1
        const value2 = this.value2
        if (value1 === firstValue)
            return false
        if (value2 === firstValue)
            return false
        while (!(iteratorResult = values.next()).done) {
            const value = iteratorResult.value
            if (value1 === value)
                return false
            if (value2 === value)
                return false
        }
        return true
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotOne CollectionHolder.hasNotOne(values: Iterable<T>)} */
    protected _hasNotOneByIterable(values: Iterable<T, unknown, unknown>,): boolean {
        const iterator = values[Symbol.iterator]()
        let iteratorResult = iterator.next()
        if (iteratorResult.done)
            return false

        const firstValue = iteratorResult.value
        const value1 = this.value1
        const value2 = this.value2
        if (value1 === firstValue)
            return false
        if (value2 === firstValue)
            return false
        while (!(iteratorResult = iterator.next()).done) {
            const value = iteratorResult.value
            if (value1 === value)
                return false
            if (value2 === value)
                return false
        }
        return true
    }

    //#endregion -------------------- Has not one --------------------
    //#region -------------------- Has all --------------------

    public override hasAll(values: Nullable<Array<T>>,): boolean
    public override hasAll(values: Nullable<Set<T>>,): boolean
    public override hasAll(values: Nullable<CollectionHolder<T>>,): boolean
    public override hasAll(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public override hasAll(values: Nullable<CollectionIterator<T>>,): boolean
    public override hasAll(values: Nullable<IteratorObject<T, unknown, unknown>>,): boolean
    public override hasAll(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public override hasAll(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public override hasAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
    public override hasAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
        if (values == null)
            return this._hasAllByNull(values,)

        if (values instanceof Array)
            return this._hasAllByArray(values,)
        if (values instanceof Set)
            return this._hasAllBySet(values,)
        if (isCollectionHolder(values,))
            return this._hasAllByCollectionHolder(values,)
        if (isMinimalistCollectionHolder(values,))
            return this._hasAllByMinimalistCollectionHolder(values,)
        if (isCollectionIterator(values,))
            return this._hasAllByCollectionIterator(values,)
        if (values instanceof Iterator)
            return this._hasAllByIterator(values,)

        if (isArrayByStructure<T>(values))
            return this._hasAllByArray(values,)
        if (isSetByStructure<T>(values))
            return this._hasAllBySet(values,)
        if (isCollectionHolderByStructure<T>(values))
            return this._hasAllByCollectionHolder(values,)
        if (isMinimalistCollectionHolderByStructure<T>(values,))
            return this._hasAllByMinimalistCollectionHolder(values,)
        if (isCollectionIteratorByStructure<T>(values,))
            return this._hasAllByCollectionIterator(values,)
        if (isIteratorByStructure<T>(values,))
            return this._hasAllByIterator(values,)
        return this._hasAllByIterable(values,)
    }


    /** An additional method to be the equivalent of {@link CollectionHolder.hasAll CollectionHolder.hasAll(values: NullOrUndefined)} */
    protected _hasAllByNull(_values: NullOrUndefined,): true {
        return true
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasAll CollectionHolder.hasAll(values: Array<T>)} */
    protected _hasAllByArray(values: Array<T>,): boolean {
        const size = values.length
        if (size === 0)
            return true

        const value1 = this.value1
        const value2 = this.value2
        let index = -1
        while (++index < size) {
            const value = values[index] as T
            if (value1 === value)
                continue
            if (value2 === value)
                continue
            return false
        }
        return true
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasAll CollectionHolder.hasAll(values: Set<T>)} */
    protected _hasAllBySet(values: Set<T>,): boolean {
        const size = values.size
        if (size === 0)
            return true

        const value1 = this.value1
        const value2 = this.value2
        const iterator = values[Symbol.iterator]()
        let index = -1
        while (++index < size) {
            const value = iterator.next().value as T
            if (value1 === value)
                continue
            if (value2 === value)
                continue
            return false
        }
        return true
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasAll CollectionHolder.hasAll(values: MinimalistCollectionHolder<T>)} */
    protected _hasAllByMinimalistCollectionHolder(values: MinimalistCollectionHolder<T>,): boolean {
        const size = values.size
        if (size === 0)
            return true

        const value1 = this.value1
        const value2 = this.value2
        let index = -1
        while (++index < size) {
            const value = values.get(index,)
            if (value1 === value)
                continue
            if (value2 === value)
                continue
            return false
        }
        return true
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasAll CollectionHolder.hasAll(values: CollectionHolder<T>)} */
    protected _hasAllByCollectionHolder(values: CollectionHolder<T>,): boolean {
        if (values.isEmpty)
            return true

        const value1 = this.value1
        const value2 = this.value2
        const size = values.size
        let index = -1
        while (++index < size) {
            const value = values.get(index,)
            if (value1 === value)
                continue
            if (value2 === value)
                continue
            return false
        }
        return true
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasAll CollectionHolder.hasAll(values: CollectionIterator<T>)} */
    protected _hasAllByCollectionIterator(values: CollectionIterator<T>,): boolean {
        if (values.isEmpty)
            return true

        const value1 = this.value1
        const value2 = this.value2
        const size = values.size
        let index = -1
        while (++index < size) {
            const value = values.nextValue
            if (value1 === value)
                continue
            if (value2 === value)
                continue
            return false
        }
        return true
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasAll CollectionHolder.hasAll(values: Iterator<T>)} */
    protected _hasAllByIterator(values: Iterator<T, unknown, unknown>,): boolean {
        let iteratorResult = values.next()
        if (iteratorResult.done)
            return true

        const value1 = this.value1
        const value2 = this.value2
        firstValueIf: {
            const firstValue = iteratorResult.value
            if (value1 === firstValue)
                break firstValueIf
            if (value2 === firstValue)
                break firstValueIf
            return false
        }

        while (!(iteratorResult = values.next()).done) {
            const value = iteratorResult.value
            if (value1 === value)
                continue
            if (value2 === value)
                continue
            return false
        }
        return true
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasAll CollectionHolder.hasAll(values: Iterable<T>)} */
    protected _hasAllByIterable(values: Iterable<T, unknown, unknown>,): boolean {
        const iterator = values[Symbol.iterator]()
        let iteratorResult = iterator.next()
        if (iteratorResult.done)
            return true

        const value1 = this.value1
        const value2 = this.value2
        firstValueIf: {
            const firstValue = iteratorResult.value
            if (value1 === firstValue)
                break firstValueIf
            if (value2 === firstValue)
                break firstValueIf
            return false
        }

        while (!(iteratorResult = iterator.next()).done) {
            const value = iteratorResult.value
            if (value1 === value)
                continue
            if (value2 === value)
                continue
            return false
        }
        return true
    }

    //#endregion -------------------- Has all --------------------
    //#region -------------------- Has not all --------------------

    public override hasNotAll(values: Nullable<Array<T>>,): boolean
    public override hasNotAll(values: Nullable<Set<T>>,): boolean
    public override hasNotAll(values: Nullable<CollectionHolder<T>>,): boolean
    public override hasNotAll(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public override hasNotAll(values: Nullable<CollectionIterator<T>>,): boolean
    public override hasNotAll(values: Nullable<IteratorObject<T, unknown, unknown>>,): boolean
    public override hasNotAll(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public override hasNotAll(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public override hasNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
    public override hasNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
        if (values == null)
            return this._hasNotAllByNull(values,)

        if (values instanceof Array)
            return this._hasNotAllByArray(values,)
        if (values instanceof Set)
            return this._hasNotAllBySet(values,)
        if (isCollectionHolder(values,))
            return this._hasNotAllByCollectionHolder(values,)
        if (isMinimalistCollectionHolder(values,))
            return this._hasNotAllByMinimalistCollectionHolder(values,)
        if (isCollectionIterator(values,))
            return this._hasNotAllByCollectionIterator(values,)
        if (values instanceof Iterator)
            return this._hasNotAllByIterator(values,)

        if (isArrayByStructure<T>(values,))
            return this._hasNotAllByArray(values,)
        if (isSetByStructure<T>(values,))
            return this._hasNotAllBySet(values,)
        if (isCollectionHolderByStructure<T>(values,))
            return this._hasNotAllByCollectionHolder(values,)
        if (isMinimalistCollectionHolderByStructure<T>(values,))
            return this._hasNotAllByMinimalistCollectionHolder(values,)
        if (isCollectionIteratorByStructure<T>(values,))
            return this._hasNotAllByCollectionIterator(values,)
        if (isIteratorByStructure<T>(values,))
            return this._hasNotAllByIterator(values,)
        return this._hasNotAllByIterable(values,)
    }


    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotAll CollectionHolder.hasNotAll(values: NullOrUndefined)} */
    protected _hasNotAllByNull(_values: NullOrUndefined,): false {
        return false
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotAll CollectionHolder.hasNotAll(values: Array<T>)} */
    protected _hasNotAllByArray(values: Array<T>,): boolean {
        const size = values.length
        if (size === 0)
            return false

        const value1 = this.value1
        const value2 = this.value2
        let index = -1
        while (++index < size) {
            const value = values[index] as T
            if (value1 === value)
                continue
            if (value2 === value)
                continue
            return true
        }
        return false
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotAll CollectionHolder.hasNotAll(values: Set<T>)} */
    protected _hasNotAllBySet(values: Set<T>,): boolean {
        const size = values.size
        if (size === 0)
            return false

        const value1 = this.value1
        const value2 = this.value2
        const iterator = values[Symbol.iterator]()
        let index = -1
        while (++index < size) {
            const value = iterator.next().value as T
            if (value1 === value)
                continue
            if (value2 === value)
                continue
            return true
        }
        return false
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotAll CollectionHolder.hasNotAll(values: MinimalistCollectionHolder<T>)} */
    protected _hasNotAllByMinimalistCollectionHolder(values: MinimalistCollectionHolder<T>,): boolean {
        const size = values.size
        if (size === 0)
            return false

        const value1 = this.value1
        const value2 = this.value2
        let index = -1
        while (++index < size) {
            const value = values.get(index,)
            if (value1 === value)
                continue
            if (value2 === value)
                continue
            return true
        }
        return false
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotAll CollectionHolder.hasNotAll(values: CollectionHolder<T>)} */
    protected _hasNotAllByCollectionHolder(values: CollectionHolder<T>,): boolean {
        if (values.isEmpty)
            return false

        const value1 = this.value1
        const value2 = this.value2
        const size = values.size
        let index = -1
        while (++index < size) {
            const value = values.get(index,)
            if (value1 === value)
                continue
            if (value2 === value)
                continue
            return true
        }
        return false
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotAll CollectionHolder.hasNotAll(values: CollectionIterator<T>)} */
    protected _hasNotAllByCollectionIterator(values: CollectionIterator<T>,): boolean {
        if (values.isEmpty)
            return false

        const value1 = this.value1
        const value2 = this.value2
        const size = values.size
        let index = -1
        while (++index < size) {
            const value = values.nextValue
            if (value1 === value)
                continue
            if (value2 === value)
                continue
            return true
        }
        return false
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotAll CollectionHolder.hasNotAll(values: Iterator<T>)} */
    protected _hasNotAllByIterator(values: Iterator<T, unknown, unknown>,): boolean {
        let iteratorResult = values.next()
        if (iteratorResult.done)
            return false

        const value1 = this.value1
        const value2 = this.value2
        firstValueIf: {
            const firstValue = iteratorResult.value
            if (value1 === firstValue)
                break firstValueIf
            if (value2 === firstValue)
                break firstValueIf
            return true
        }

        while (!(iteratorResult = values.next()).done) {
            const value = iteratorResult.value
            if (value1 === value)
                continue
            if (value2 === value)
                continue
            return true
        }
        return false
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotAll CollectionHolder.hasNotAll(values: Iterable<T>)} */
    protected _hasNotAllByIterable(values: Iterable<T, unknown, unknown>,): boolean {
        const iterator = values[Symbol.iterator]()
        let iteratorResult = iterator.next()
        if (iteratorResult.done)
            return false

        const value1 = this.value1
        const value2 = this.value2
        firstValueIf: {
            const firstValue = iteratorResult.value
            if (value1 === firstValue)
                break firstValueIf
            if (value2 === firstValue)
                break firstValueIf
            return true
        }

        while (!(iteratorResult = iterator.next()).done) {
            const value = iteratorResult.value
            if (value1 === value)
                continue
            if (value2 === value)
                continue
            return true
        }
        return false
    }

    //#endregion -------------------- Has not all --------------------

    //#region -------------------- Require no nulls --------------------

    public override requireNoNulls(): CollectionHolder<NonNullable<T>> {
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
        if (predicate.length === 1)
            return new LazyCollectionHolderOf0Or1Or2<T>(() => {
                const value1 = this.value1
                const value2 = this.value2
                if ((predicate as (value: T,) => boolean)(value1,))
                    if ((predicate as (value: T,) => boolean)(value2,))
                        return new Couple(new Optional(value1,), new Optional(value2,),)
                    else
                        return new Couple(new Optional(value1,), EmptyOptional.get,)
                if ((predicate as (value: T,) => boolean)(value2,))
                    return new Couple(new Optional(value2,), EmptyOptional.get,)
                return null
            },)
        if (predicate.length >= 2)
            return new LazyCollectionHolderOf0Or1Or2<T>(() => {
                const value1 = this.value1
                const value2 = this.value2
                if (predicate(value1, 0,))
                    if (predicate(value2, 1,))
                        return new Couple(new Optional(value1,), new Optional(value2,),)
                    else
                        return new Couple(new Optional(value1,), EmptyOptional.get,)
                if (predicate(value2, 1,))
                    return new Couple(new Optional(value2,), EmptyOptional.get,)
                return null
            },)
        return new LazyCollectionHolderOf0Or1Or2<T>(() => (predicate as () => boolean)()
            ? (predicate as () => boolean)()
                ? new Couple(new Optional(this.value1,), new Optional(this.value2,),)
                : new Couple(new Optional(this.value1,), EmptyOptional.get,)
            : (predicate as () => boolean)()
                ? new Couple(new Optional(this.value2,), EmptyOptional.get,)
                : null,)
    }

    public override filterIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,) {
        if (predicate.length === 1)
            return new LazyCollectionHolderOf0Or1Or2<T>(() => (predicate as (index: number,) => boolean)(0,)
                ? (predicate as (index: number,) => boolean)(1,)
                    ? new Couple(new Optional(this.value1,), new Optional(this.value2,),)
                    : new Couple(new Optional(this.value1,), EmptyOptional.get,)
                : (predicate as (index: number,) => boolean)(1,)
                    ? new Couple(new Optional(this.value2,), EmptyOptional.get,)
                    : null,)
        if (predicate.length >= 2)
            return new LazyCollectionHolderOf0Or1Or2<T>(() => {
                const value1 = this.value1
                const value2 = this.value2
                if (predicate(0, value1,))
                    if (predicate(1, value2,))
                        return new Couple(new Optional(value1,), new Optional(value2,),)
                    else
                        return new Couple(new Optional(value1,), EmptyOptional.get,)
                if (predicate(1, value2,))
                    return new Couple(new Optional(value2,), EmptyOptional.get,)
                return null
            },)
        return new LazyCollectionHolderOf0Or1Or2<T>(() => (predicate as () => boolean)()
            ? (predicate as () => boolean)()
                ? new Couple(new Optional(this.value1,), new Optional(this.value2,),)
                : new Couple(new Optional(this.value1,), EmptyOptional.get,)
            : (predicate as () => boolean)()
                ? new Couple(new Optional(this.value2,), EmptyOptional.get,)
                : null,)
    }


    public override filterNot<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T> {
        if (predicate.length === 1)
            return new LazyCollectionHolderOf0Or1Or2<T>(() => {
                const value1 = this.value1
                const value2 = this.value2
                if ((predicate as (value: T,) => boolean)(value1,))
                    if ((predicate as (value: T,) => boolean)(value2,))
                        return null
                    else
                        return new Couple(new Optional(value2,), EmptyOptional.get,)
                if ((predicate as (value: T,) => boolean)(value2,))
                    return new Couple(new Optional(value1,), EmptyOptional.get,)
                return new Couple(new Optional(value1,), new Optional(value2,),)
            },)
        if (predicate.length >= 2)
            return new LazyCollectionHolderOf0Or1Or2<T>(() => {
                const value1 = this.value1
                const value2 = this.value2
                if (predicate(value1, 0,))
                    if (predicate(value2, 1,))
                        return null
                    else
                        return new Couple(new Optional(value2,), EmptyOptional.get,)
                if (predicate(value2, 1,))
                    return new Couple(new Optional(value1,), EmptyOptional.get,)
                return new Couple(new Optional(value1,), new Optional(value2,),)
            },)
        return new LazyCollectionHolderOf0Or1Or2<T>(() => (predicate as () => boolean)()
            ? (predicate as () => boolean)()
                ? null
                : new Couple(new Optional(this.value2,), EmptyOptional.get,)
            : (predicate as () => boolean)()
                ? new Couple(new Optional(this.value1,), EmptyOptional.get,)
                : new Couple(new Optional(this.value1,), new Optional(this.value2,),),)
    }

    public override filterNotIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T> {
        if (predicate.length === 1)
            return new LazyCollectionHolderOf0Or1Or2<T>(() => (predicate as (index: number,) => boolean)(0,)
                ? (predicate as (index: number,) => boolean)(1,)
                    ? null
                    : new Couple(new Optional(this.value2,), EmptyOptional.get,)
                : (predicate as (index: number,) => boolean)(1,)
                    ? new Couple(new Optional(this.value1,), EmptyOptional.get,)
                    : new Couple(new Optional(this.value1,), new Optional(this.value2,),),)
        if (predicate.length >= 2)
            return new LazyCollectionHolderOf0Or1Or2<T>(() => {
                const value1 = this.value1
                const value2 = this.value2
                if (predicate(0, value1,))
                    if (predicate(1, value2,))
                        return null
                    else
                        return new Couple(new Optional(value2,), EmptyOptional.get,)
                if (predicate(1, value2,))
                    return new Couple(new Optional(value1,), EmptyOptional.get,)
                return new Couple(new Optional(value1,), new Optional(value2,),)
            },)
        return new LazyCollectionHolderOf0Or1Or2<T>(() => (predicate as () => boolean)()
            ? (predicate as () => boolean)()
                ? null
                : new Couple(new Optional(this.value2,), EmptyOptional.get,)
            : (predicate as () => boolean)()
                ? new Couple(new Optional(this.value1,), EmptyOptional.get,)
                : new Couple(new Optional(this.value1,), new Optional(this.value2,),),)
    }


    public override filterNotNull(): CollectionHolder<NonNullable<T>> {
        const value1 = this.value1
        const value2 = this.value2
        if (value1 == null)
            if (value2 == null)
                return EmptyCollectionHolder.get
            else
                return new CollectionHolderOf1(value2,)
        if (value2 == null)
            return new CollectionHolderOf1(value1,)
        return this as CollectionHolder<NonNullable<T>>
    }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Slice --------------------

    public override slice(from?: NullableNumber, to?: NullableNumber,): CollectionHolder<T>
    public override slice(indices: NumberArray,): CollectionHolder<T>
    public override slice(indices: NumberSet,): CollectionHolder<T>
    public override slice(indices: CollectionHolder<number>,): CollectionHolder<T>
    public override slice(indices: MinimalistCollectionHolder<number>,): CollectionHolder<T>
    public override slice(indices: CollectionIterator<number>,): CollectionHolder<T>
    public override slice(indices: Iterator<number, unknown, unknown>,): CollectionHolder<T>
    public override slice(indices: Iterable<number, unknown, unknown>,): CollectionHolder<T>
    public override slice(indices: PossibleIterableIteratorArraySetOrCollectionHolder<number>,): CollectionHolder<T>
    public override slice(indicesOrFrom?: Nullable<| PossibleIterableIteratorArraySetOrCollectionHolder<number> | number>, to?: NullableNumber,): CollectionHolder<T>
    public override slice(indicesOrFrom?: Nullable<| PossibleIterableIteratorArraySetOrCollectionHolder<number> | number>, to?: NullableNumber,) {
        //#region -------------------- 0 arguments --------------------

        if (arguments.length === 0)
            return this._sliceWith0Argument()

        //#endregion -------------------- 0 arguments --------------------
        //#region -------------------- 1 argument --------------------

        if (arguments.length === 1)
            if (indicesOrFrom == null)
                return this._sliceWith0Argument()
            else if (typeof indicesOrFrom == "number")
                return this._sliceWith1Argument(indicesOrFrom,)
            else if (indicesOrFrom instanceof Array)
                return this._sliceByArray(indicesOrFrom,)
            else if (indicesOrFrom instanceof Set)
                return this._sliceBySet(indicesOrFrom,)
            else if (isCollectionHolder(indicesOrFrom,))
                return this._sliceByCollectionHolder(indicesOrFrom,)
            else if (isMinimalistCollectionHolder(indicesOrFrom,))
                return this._sliceByMinimalistCollectionHolder(indicesOrFrom,)
            else if (isCollectionIterator(indicesOrFrom,))
                return this._sliceByCollectionIterator(indicesOrFrom,)
            else if (indicesOrFrom instanceof Iterator)
                return this._sliceByIterator(indicesOrFrom,)

            else if (isArrayByStructure<number>(indicesOrFrom,))
                return this._sliceByArray(indicesOrFrom,)
            else if (isSetByStructure<number>(indicesOrFrom,))
                return this._sliceBySet(indicesOrFrom,)
            else if (isCollectionHolderByStructure<number>(indicesOrFrom,))
                return this._sliceByCollectionHolder(indicesOrFrom,)
            else if (isMinimalistCollectionHolderByStructure<number>(indicesOrFrom,))
                return this._sliceByMinimalistCollectionHolder(indicesOrFrom,)
            else if (isCollectionIteratorByStructure<number>(indicesOrFrom,))
                return this._sliceByCollectionIterator(indicesOrFrom,)
            else if (isIteratorByStructure<number>(indicesOrFrom,))
                return this._sliceByIterator(indicesOrFrom,)
            else
                return this._sliceByIterable(indicesOrFrom,)

        //#endregion -------------------- 1 argument --------------------
        //#region -------------------- 2 arguments --------------------

        if (indicesOrFrom == null)
            if (to == null)
                return this._sliceWith0Argument()
            else
                return this._sliceWith2ArgumentWhere1stIsNull(indicesOrFrom, to,)


        if (to == null)
            if (typeof indicesOrFrom == "number")
                return this._sliceWith1Argument(indicesOrFrom,)
            else if (indicesOrFrom instanceof Array)
                return this._sliceByArray(indicesOrFrom,)
            else if (indicesOrFrom instanceof Set)
                return this._sliceBySet(indicesOrFrom,)
            else if (isCollectionHolder(indicesOrFrom,))
                return this._sliceByCollectionHolder(indicesOrFrom,)
            else if (isMinimalistCollectionHolder(indicesOrFrom,))
                return this._sliceByMinimalistCollectionHolder(indicesOrFrom,)
            else if (isCollectionIterator(indicesOrFrom,))
                return this._sliceByCollectionIterator(indicesOrFrom,)
            else if (indicesOrFrom instanceof Iterator)
                return this._sliceByIterator(indicesOrFrom,)

            else if (isArrayByStructure<number>(indicesOrFrom,))
                return this._sliceByArray(indicesOrFrom,)
            else if (isSetByStructure<number>(indicesOrFrom,))
                return this._sliceBySet(indicesOrFrom,)
            else if (isCollectionHolderByStructure<number>(indicesOrFrom,))
                return this._sliceByCollectionHolder(indicesOrFrom,)
            else if (isMinimalistCollectionHolderByStructure<number>(indicesOrFrom,))
                return this._sliceByMinimalistCollectionHolder(indicesOrFrom,)
            else if (isCollectionIteratorByStructure<number>(indicesOrFrom,))
                return this._sliceByCollectionIterator(indicesOrFrom,)
            else if (isIteratorByStructure<number>(indicesOrFrom,))
                return this._sliceByIterator(indicesOrFrom,)
            else
                return this._sliceByIterable(indicesOrFrom,)


        if (typeof indicesOrFrom == "number")
            return this._sliceWith2Argument(indicesOrFrom, to,)
        if (indicesOrFrom instanceof Array)
            return this._sliceByArray(indicesOrFrom,)
        if (indicesOrFrom instanceof Set)
            return this._sliceBySet(indicesOrFrom,)
        if (isCollectionHolder(indicesOrFrom,))
            return this._sliceByCollectionHolder(indicesOrFrom,)
        if (isMinimalistCollectionHolder(indicesOrFrom,))
            return this._sliceByMinimalistCollectionHolder(indicesOrFrom,)
        if (isCollectionIterator(indicesOrFrom,))
            return this._sliceByCollectionIterator(indicesOrFrom,)
        if (indicesOrFrom instanceof Iterator)
            return this._sliceByIterator(indicesOrFrom,)

        if (isArrayByStructure<number>(indicesOrFrom,))
            return this._sliceByArray(indicesOrFrom,)
        if (isSetByStructure<number>(indicesOrFrom,))
            return this._sliceBySet(indicesOrFrom,)
        if (isCollectionHolderByStructure<number>(indicesOrFrom,))
            return this._sliceByCollectionHolder(indicesOrFrom,)
        if (isMinimalistCollectionHolderByStructure<number>(indicesOrFrom,))
            return this._sliceByMinimalistCollectionHolder(indicesOrFrom,)
        if (isCollectionIteratorByStructure<number>(indicesOrFrom,))
            return this._sliceByCollectionIterator(indicesOrFrom,)
        if (isIteratorByStructure<number>(indicesOrFrom,))
            return this._sliceByIterator(indicesOrFrom,)
        return this._sliceByIterable(indicesOrFrom,)

        //#endregion -------------------- 2 arguments --------------------
    }


    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice()} */
    protected _sliceWith0Argument(): this {
        return this
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice(from)} */
    protected _sliceWith1Argument(from: number,): | this | CollectionHolderOf1<T> {
        const startingIndex = __getStartingIndex(from,)
        if (startingIndex == 0)
            return this
        return new CollectionHolderOf1<T>(this.value2,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice(from, to)} */
    protected _sliceWith2Argument(from: number, to: number,): | this | CollectionHolderOf1<T> {
        const startingIndex = __getStartingIndex(from,)
        const endingIndex = __getEndingIndex(to,)
        __validateInRange(from, startingIndex, to, endingIndex,)
        if (startingIndex === endingIndex)
            if (startingIndex === 0)
                return new CollectionHolderOf1(this.value1,)
            else
                return new CollectionHolderOf1(this.value2,)
        return this
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice(null, to)} */
    protected _sliceWith2ArgumentWhere1stIsNull(_: NullOrUndefined, to: number,): | this | CollectionHolderOf1<T> {
        const endingIndex = __getEndingIndex(to,)
        if (endingIndex == 0)
            return new CollectionHolderOf1(this.value1,)
        return this
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice(indices: NumberArray)} */
    protected _sliceByArray(indices: NumberArray,): CollectionHolder<T> {
        const indicesSize = indices.length
        if (indicesSize === 0)
            return EmptyCollectionHolder.get
        return new LazyCollectionHolder(() => {
            const value1 = this.value1
            const value2 = this.value2
            const newArray = new Array<T>(indicesSize,)
            let index = indicesSize
            while (index-- > 0)
                if (__getIndex(indices[index]!,) === 0)
                    newArray[index] = value1
                else
                    newArray[index] = value2
            return Object.freeze(newArray,)
        },)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice(indices: NumberSet)} */
    protected _sliceBySet(indices: NumberSet,): CollectionHolder<T> {
        const indicesSize = indices.size
        if (indicesSize === 0)
            return EmptyCollectionHolder.get
        return new LazyCollectionHolder(() => {
            const value1 = this.value1
            const value2 = this.value2
            const newArray = new Array<T>(indicesSize,)
            const iterator = indices[Symbol.iterator]()
            let index = -1
            while (++index < indicesSize)
                if (__getIndex(iterator.next().value!,) === 0)
                    newArray[index] = value1
                else
                    newArray[index] = value2
            return Object.freeze(newArray,)
        },)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice(indices: MinimalistCollectionHolder<number>)} */
    protected _sliceByMinimalistCollectionHolder(indices: MinimalistCollectionHolder<number>,): CollectionHolder<T> {
        const indicesSize = indices.size
        if (indicesSize === 0)
            return EmptyCollectionHolder.get
        return new LazyCollectionHolder(() => {
            const value1 = this.value1
            const value2 = this.value2
            const newArray = new Array<T>(indicesSize,)
            let index = indicesSize
            while (index-- > 0)
                if (__getIndex(indices.get(index,),) === 0)
                    newArray[index] = value1
                else
                    newArray[index] = value2
            return Object.freeze(newArray,)
        },)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice(indices: CollectionHolder<number>)} */
    protected _sliceByCollectionHolder(indices: CollectionHolder<number>,): CollectionHolder<T> {
        if (indices.isEmpty)
            return EmptyCollectionHolder.get
        return new LazyCollectionHolder(() => {
            const value1 = this.value1
            const value2 = this.value2
            const indicesSize = indices.size
            const newArray = new Array<T>(indicesSize,)
            let index = indicesSize
            while (index-- > 0)
                if (__getIndex(indices.get(index,),) === 0)
                    newArray[index] = value1
                else
                    newArray[index] = value2
            return Object.freeze(newArray,)
        },)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice(indices: CollectionIterator<number>)} */
    protected _sliceByCollectionIterator(indices: CollectionIterator<number>,): CollectionHolder<T> {
        if (indices.isEmpty)
            return EmptyCollectionHolder.get
        return new LazyCollectionHolder(() => {
            const value1 = this.value1
            const value2 = this.value2
            const indicesSize = indices.size
            const newArray = new Array<T>(indicesSize,)
            let index = indicesSize
            while (index-- > 0)
                if (__getIndex(indices.previousValue,) === 0)
                    newArray[index] = value1
                else
                    newArray[index] = value2
            return Object.freeze(newArray,)
        },)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice(indices: Iterator<number>)} */
    protected _sliceByIterator(indices: Iterator<number, unknown, unknown>,): CollectionHolder<T> {
        let iteratorResult = indices.next()
        if (iteratorResult.done)
            return EmptyCollectionHolder.get
        return new LazyCollectionHolder(() => {
            const value1 = this.value1
            const value2 = this.value2
            const newArray = [__getIndex(iteratorResult.value as number,) === 0 ? value1 : value2,]
            while (!(iteratorResult = indices.next()).done)
                if (__getIndex(iteratorResult.value!,) === 0)
                    newArray.push(value1,)
                else
                    newArray.push(value2,)
            return Object.freeze(newArray,)
        },)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice(indices: Iterable<number>)} */
    protected _sliceByIterable(indices: Iterable<number, unknown, unknown>,): CollectionHolder<T> {
        const iterator = indices[Symbol.iterator]()
        let iteratorResult = iterator.next()
        if (iteratorResult.done)
            return EmptyCollectionHolder.get
        return new LazyCollectionHolder(() => {
            const value1 = this.value1
            const value2 = this.value2
            const newArray = [__getIndex(iteratorResult.value as number,) === 0 ? value1 : value2,]
            while (!(iteratorResult = iterator.next()).done)
                if (__getIndex(iteratorResult.value!,) === 0)
                    newArray.push(value1,)
                else
                    newArray.push(value2,)
            return Object.freeze(newArray,)
        },)
    }

    //#endregion -------------------- Slice --------------------
    //#region -------------------- Take --------------------

    //#region -------------------- Take --------------------

    public override take(n: number,): | this | CollectionHolderOf1<T1> | EmptyCollectionHolder {
        if (Number.isNaN(n,))
            throw new ForbiddenIndexException("Forbidden index. The number cannot be determined with NaN.", n,)
        if (n === Number.NEGATIVE_INFINITY)
            return EmptyCollectionHolder.get
        if (n === Number.POSITIVE_INFINITY)
            return this
        if (n === 0)
            return EmptyCollectionHolder.get
        if (n === 1)
            return new CollectionHolderOf1(this.value1,)
        if (n === 2)
            return this
        if (n > 2)
            return this
        if (n === -1)
            return new CollectionHolderOf1(this.value1,)
        return EmptyCollectionHolder.get
    }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Take while --------------------

    public override takeWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override takeWhile(predicate: BooleanCallback<T>,) {
        if (predicate.length === 1)
            return new LazyCollectionHolderOf0Or1Or2(() => this.#takeWhile1(predicate as (value: T,) => boolean,),)
        if (predicate.length >= 2)
            return new LazyCollectionHolderOf0Or1Or2(() => this.#takeWhile2(predicate,),)
        return new LazyCollectionHolderOf0Or1Or2(() => this.#takeWhile0(predicate as () => boolean,),)
    }

    #takeWhile0(predicate: () => boolean,): NullOr<Couple<Optional<T>, Optional<T1>, Optional<T2>>> {
        if (predicate())
            if (predicate())
                return new Couple(new Optional(this.value1,), new Optional(this.value2,),)
            else
                return new Couple(new Optional(this.value1,), EmptyOptional.get,)
        return null
    }

    #takeWhile1(predicate: (value: | T1 | T2,) => boolean,): NullOr<Couple<Optional<T>, Optional<T1>, Optional<T2>>> {
        const value1 = this.value1
        if (!predicate(value1,))
            return null

        const value2 = this.value2
        if (predicate(value2,))
            return new Couple(new Optional(value1,), new Optional(value2,),)
        return new Couple(new Optional(value1,), EmptyOptional.get,)
    }

    #takeWhile2(predicate: (value: | T1 | T2, index: | 0 | 1,) => boolean,): NullOr<Couple<Optional<T>, Optional<T1>, Optional<T2>>> {
        const value1 = this.value1
        if (!predicate(value1, 0,))
            return null

        const value2 = this.value2
        if (predicate(value2, 1,))
            return new Couple(new Optional(value1,), new Optional(value2,),)
        return new Couple(new Optional(value1,), EmptyOptional.get,)
    }

    //#endregion -------------------- Take while --------------------
    //#region -------------------- Take while indexed --------------------

    public override takeWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        if (predicate.length === 1)
            return new LazyCollectionHolderOf0Or1Or2(() => this.#takeWhileIndexed1(predicate as (index: number,) => boolean,),)
        if (predicate.length >= 2)
            return new LazyCollectionHolderOf0Or1Or2(() => this.#takeWhileIndexed2(predicate,),)
        return new LazyCollectionHolderOf0Or1Or2(() => this.#takeWhileIndexed0(predicate as () => boolean,),)
    }

    #takeWhileIndexed0(predicate: () => boolean,): NullOr<Couple<Optional<T>, Optional<T1>, Optional<T2>>> {
        if (predicate())
            if (predicate())
                return new Couple(new Optional(this.value1,), new Optional(this.value2,),)
            else
                return new Couple(new Optional(this.value1,), EmptyOptional.get,)
        return null
    }

    #takeWhileIndexed1(predicate: (index: | 0 | 1,) => boolean,): NullOr<Couple<Optional<T>, Optional<T1>, Optional<T2>>> {
        if (predicate(0,))
            if (predicate(1,))
                return new Couple(new Optional(this.value1,), new Optional(this.value2,),)
            else
                return new Couple(new Optional(this.value1,), EmptyOptional.get,)
        return null
    }

    #takeWhileIndexed2(predicate: (index: | 0 | 1, value: | T1 | T2,) => boolean,): NullOr<Couple<Optional<T>, Optional<T1>, Optional<T2>>> {
        const value1 = this.value1
        if (!predicate(0, value1,))
            return null

        const value2 = this.value2
        if (predicate(1, value2,))
            return new Couple(new Optional(value1,), new Optional(value2,),)
        return new Couple(new Optional(value1,), EmptyOptional.get,)
    }

    //#endregion -------------------- Take while indexed --------------------

    //#region -------------------- Take last --------------------

    public override takeLast(n: number,): | this | CollectionHolderOf1<T2> | EmptyCollectionHolder {
        if (Number.isNaN(n,))
            throw new ForbiddenIndexException("Forbidden index. The number cannot be determined with NaN.", n,)
        if (n === Number.NEGATIVE_INFINITY)
            return EmptyCollectionHolder.get
        if (n === Number.POSITIVE_INFINITY)
            return this
        if (n === 0)
            return EmptyCollectionHolder.get
        if (n === 1)
            return new CollectionHolderOf1(this.value2,)
        if (n === 2)
            return this
        if (n > 2)
            return this
        if (n === -1)
            return new CollectionHolderOf1(this.value2,)
        return EmptyCollectionHolder.get
    }

    //#endregion -------------------- Take last --------------------
    //#region -------------------- Take last while --------------------

    public override takeLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override takeLastWhile(predicate: BooleanCallback<T>,) {
        if (predicate.length === 1)
            return new LazyCollectionHolderOf0Or1Or2(() => this.#takeLastWhile1(predicate as (value: T,) => boolean,),)
        if (predicate.length >= 2)
            return new LazyCollectionHolderOf0Or1Or2(() => this.#takeLastWhile2(predicate,),)
        return new LazyCollectionHolderOf0Or1Or2(() => this.#takeLastWhile0(predicate as () => boolean,),)
    }

    #takeLastWhile0(predicate: () => boolean,): NullOr<Couple<Optional<T>, Optional<| T1 | T2>, Optional<T2>>> {
        if (predicate())
            if (predicate())
                return new Couple(new Optional(this.value1,), new Optional(this.value2,),)
            else
                return new Couple(new Optional(this.value2,), EmptyOptional.get,)
        return null
    }

    #takeLastWhile1(predicate: (value: | T1 | T2,) => boolean,): NullOr<Couple<Optional<T>, Optional<| T1 | T2>, Optional<T2>>> {
        const value2 = this.value2
        if (!predicate(value2,))
            return null

        const value1 = this.value1
        if (predicate(value1,))
            return new Couple(new Optional(value1,), new Optional(value2,),)
        return new Couple(new Optional(value2,), EmptyOptional.get,)
    }

    #takeLastWhile2(predicate: (value: | T1 | T2, index: | 0 | 1,) => boolean,): NullOr<Couple<Optional<T>, Optional<| T1 | T2>, Optional<T2>>> {
        const value2 = this.value2
        if (!predicate(value2, 1,))
            return null

        const value1 = this.value1
        if (predicate(value1, 0,))
            return new Couple(new Optional(value1,), new Optional(value2,),)
        return new Couple(new Optional(value2,), EmptyOptional.get,)
    }

    //#endregion -------------------- Take last while --------------------
    //#region -------------------- Take last while indexed --------------------

    public override takeLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        if (predicate.length === 1)
            return new LazyCollectionHolderOf0Or1Or2(() => this.#takeLastWhileIndexed1(predicate as (index: number,) => boolean,),)
        if (predicate.length >= 2)
            return new LazyCollectionHolderOf0Or1Or2(() => this.#takeLastWhileIndexed2(predicate,),)
        return new LazyCollectionHolderOf0Or1Or2(() => this.#takeLastWhileIndexed0(predicate as () => boolean,),)
    }

    #takeLastWhileIndexed0(predicate: () => boolean,): NullOr<Couple<Optional<T>, Optional<| T1 | T2>, Optional<T2>>> {
        if (predicate())
            if (predicate())
                return new Couple(new Optional(this.value1,), new Optional(this.value2,),)
            else
                return new Couple(new Optional(this.value2,), EmptyOptional.get,)
        return null
    }

    #takeLastWhileIndexed1(predicate: (index: | 0 | 1,) => boolean,): NullOr<Couple<Optional<T>, Optional<| T1 | T2>, Optional<T2>>> {
        if (predicate(1,))
            if (predicate(0,))
                return new Couple(new Optional(this.value1,), new Optional(this.value2,),)
            else
                return new Couple(new Optional(this.value2,), EmptyOptional.get,)
        return null
    }

    #takeLastWhileIndexed2(predicate: (index: | 0 | 1, value: | T1 | T2,) => boolean,): NullOr<Couple<Optional<T>, Optional<| T1 | T2>, Optional<T2>>> {
        const value2 = this.value2
        if (!predicate(1, value2,))
            return null

        const value1 = this.value1
        if (predicate(0, value1,))
            return new Couple(new Optional(value1,), new Optional(value2,),)
        return new Couple(new Optional(value2,), EmptyOptional.get,)
    }

    //#endregion -------------------- Take last while indexed --------------------

    //#endregion -------------------- Take --------------------
    //#region -------------------- Drop --------------------

    //#region -------------------- Drop --------------------

    public override drop(n: number,): | this | CollectionHolderOf1<T2> | EmptyCollectionHolder {
        if (Number.isNaN(n,))
            throw new ForbiddenIndexException("Forbidden index. The number cannot be determined with NaN.", n,)
        if (n === Number.NEGATIVE_INFINITY)
            return this
        if (n === Number.POSITIVE_INFINITY)
            return EmptyCollectionHolder.get
        if (n === 0)
            return this
        if (n === 1)
            return new CollectionHolderOf1(this.value2,)
        if (n === 2)
            return EmptyCollectionHolder.get
        if (n > 2)
            return EmptyCollectionHolder.get
        if (n === -1)
            return new CollectionHolderOf1(this.value2,)
        return this
    }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Drop while --------------------

    public override dropWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override dropWhile(predicate: BooleanCallback<T>,) {
        if (predicate.length === 1)
            return new LazyCollectionHolderOf0Or1Or2(() => this.#dropWhile1(predicate as (value: T,) => boolean,),)
        if (predicate.length >= 2)
            return new LazyCollectionHolderOf0Or1Or2(() => this.#dropWhile2(predicate,),)
        return new LazyCollectionHolderOf0Or1Or2(() => this.#dropWhile0(predicate as () => boolean,),)
    }

    #dropWhile0(predicate: () => boolean,): NullOr<Couple<Optional<T>, Optional<| T1 | T2>, Optional<T2>>> {
        if (predicate())
            if (predicate())
                return null
            else
                return new Couple(new Optional(this.value2,), EmptyOptional.get,)
        return new Couple(new Optional(this.value1,), new Optional(this.value2,),)
    }

    #dropWhile1(predicate: (value: | T1 | T2,) => boolean,): NullOr<Couple<Optional<T>, Optional<| T1 | T2>, Optional<T2>>> {
        const value1 = this.value1
        if (!predicate(value1,))
            return new Couple(new Optional(value1,), new Optional(this.value2,),)

        const value2 = this.value2
        if (predicate(value2,))
            return null
        return new Couple(new Optional(value2,), EmptyOptional.get,)
    }

    #dropWhile2(predicate: (value: | T1 | T2, index: | 0 | 1,) => boolean,): NullOr<Couple<Optional<T>, Optional<| T1 | T2>, Optional<T2>>> {
        const value1 = this.value1
        if (!predicate(value1, 0,))
            return new Couple(new Optional(value1,), new Optional(this.value2,),)

        const value2 = this.value2
        if (predicate(value2, 1,))
            return null
        return new Couple(new Optional(value2,), EmptyOptional.get,)
    }

    //#endregion -------------------- Drop while --------------------
    //#region -------------------- Drop while indexed --------------------

    public override dropWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        if (predicate.length === 1)
            return new LazyCollectionHolderOf0Or1Or2(() => this.#dropWhileIndexed1(predicate as (index: number,) => boolean,),)
        if (predicate.length >= 2)
            return new LazyCollectionHolderOf0Or1Or2(() => this.#dropWhileIndexed2(predicate,),)
        return new LazyCollectionHolderOf0Or1Or2(() => this.#dropWhileIndexed0(predicate as () => boolean,),)
    }

    #dropWhileIndexed0(predicate: () => boolean,): NullOr<Couple<Optional<T>, Optional<| T1 | T2>, Optional<T2>>> {
        if (predicate())
            if (predicate())
                return null
            else
                return new Couple(new Optional(this.value2,), EmptyOptional.get,)
        return new Couple(new Optional(this.value1,), new Optional(this.value2,),)
    }

    #dropWhileIndexed1(predicate: (index: | 0 | 1,) => boolean,): NullOr<Couple<Optional<T>, Optional<| T1 | T2>, Optional<T2>>> {
        if (predicate(0,))
            if (predicate(1,))
                return null
            else
                return new Couple(new Optional(this.value2,), EmptyOptional.get,)
        return new Couple(new Optional(this.value1,), new Optional(this.value2,),)
    }

    #dropWhileIndexed2(predicate: (index: | 0 | 1, value: | T1 | T2,) => boolean,): NullOr<Couple<Optional<T>, Optional<| T1 | T2>, Optional<T2>>> {
        const value1 = this.value1
        if (!predicate(0, value1,))
            return new Couple(new Optional(value1,), new Optional(this.value2,),)

        const value2 = this.value2
        if (predicate(1, value2,))
            return null
        return new Couple(new Optional(value2,), EmptyOptional.get,)
    }

    //#endregion -------------------- Drop while indexed --------------------

    //#region -------------------- Drop last --------------------

    public override dropLast(n: number,): | this | CollectionHolderOf1<T1> | EmptyCollectionHolder {
        if (Number.isNaN(n,))
            throw new ForbiddenIndexException("Forbidden index. The number cannot be determined with NaN.", n,)
        if (n === Number.NEGATIVE_INFINITY)
            return this
        if (n === Number.POSITIVE_INFINITY)
            return EmptyCollectionHolder.get
        if (n === 0)
            return this
        if (n === 1)
            return new CollectionHolderOf1(this.value1,)
        if (n === 2)
            return EmptyCollectionHolder.get
        if (n > 2)
            return EmptyCollectionHolder.get
        if (n === -1)
            return new CollectionHolderOf1(this.value1,)
        return EmptyCollectionHolder.get
    }

    //#endregion -------------------- Drop last --------------------
    //#region -------------------- Drop last while --------------------

    public override dropLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override dropLastWhile(predicate: BooleanCallback<T>,) {
        if (predicate.length === 1)
            return new LazyCollectionHolderOf0Or1Or2(() => this.#dropLastWhile1(predicate as (value: T,) => boolean,),)
        if (predicate.length >= 2)
            return new LazyCollectionHolderOf0Or1Or2(() => this.#dropLastWhile2(predicate,),)
        return new LazyCollectionHolderOf0Or1Or2(() => this.#dropLastWhile0(predicate as () => boolean,),)
    }

    #dropLastWhile0(predicate: () => boolean,): NullOr<Couple<Optional<T>, Optional<T1>, Optional<T2>>> {
        if (predicate())
            if (predicate())
                return null
            else
                return new Couple(new Optional(this.value1,), EmptyOptional.get,)
        return new Couple(new Optional(this.value1,), new Optional(this.value2,),)
    }

    #dropLastWhile1(predicate: (value: | T1 | T2,) => boolean,): NullOr<Couple<Optional<T>, Optional<T1>, Optional<T2>>> {
        const value1 = this.value1
        const value2 = this.value2
        if (predicate(value2,))
            if (predicate(value1,))
                return null
            else
                return new Couple(new Optional(value1,), EmptyOptional.get,)
        return new Couple(new Optional(value1,), new Optional(value2,),)
    }

    #dropLastWhile2(predicate: (value: | T1 | T2, index: | 0 | 1,) => boolean,): NullOr<Couple<Optional<T>, Optional<T1>, Optional<T2>>> {
        const value1 = this.value1
        const value2 = this.value2
        if (predicate(value2, 1,))
            if (predicate(value1, 0,))
                return null
            else
                return new Couple(new Optional(value1,), EmptyOptional.get,)
        return new Couple(new Optional(value1,), new Optional(value2,),)
    }

    //#endregion -------------------- Drop last while --------------------
    //#region -------------------- Drop last while indexed --------------------

    public override dropLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        if (predicate.length === 1)
            return new LazyCollectionHolderOf0Or1Or2(() => this.#dropLastWhileIndexed1(predicate as (index: number,) => boolean,),)
        if (predicate.length >= 2)
            return new LazyCollectionHolderOf0Or1Or2(() => this.#dropLastWhileIndexed2(predicate,),)
        return new LazyCollectionHolderOf0Or1Or2(() => this.#dropLastWhileIndexed0(predicate as () => boolean,),)
    }

    #dropLastWhileIndexed0(predicate: () => boolean,): NullOr<Couple<Optional<T>, Optional<T1>, Optional<T2>>> {
        if (predicate())
            if (predicate())
                return null
            else
                return new Couple(new Optional(this.value1,), EmptyOptional.get,)
        return new Couple(new Optional(this.value1,), new Optional(this.value2,),)
    }

    #dropLastWhileIndexed1(predicate: (index: | 0 | 1,) => boolean,): NullOr<Couple<Optional<T>, Optional<T1>, Optional<T2>>> {
        if (predicate(1,))
            if (predicate(0,))
                return null
            else
                return new Couple(new Optional(this.value1,), EmptyOptional.get,)
        return new Couple(new Optional(this.value1,), new Optional(this.value2,),)
    }

    #dropLastWhileIndexed2(predicate: (index: | 0 | 1, value: | T1 | T2,) => boolean,): NullOr<Couple<Optional<T>, Optional<T1>, Optional<T2>>> {
        const value1 = this.value1
        const value2 = this.value2
        if (predicate(1, value2,))
            if (predicate(0, value1,))
                return null
            else
                return new Couple(new Optional(value1,), EmptyOptional.get,)
        return new Couple(new Optional(value1,), new Optional(value2,),)
    }

    //#endregion -------------------- Drop last while indexed --------------------

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Map --------------------

    public override map<const U, >(transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U> {
        if (transform.length === 1)
            return new LateRetriever.LazyCollectionHolderOf2<U>(() => new Couple((transform as (value: T,) => U)(this.value1,), (transform as (value: T,) => U)(this.value2,),),)
        if (transform.length >= 2)
            return new LateRetriever.LazyCollectionHolderOf2<U>(() => new Couple(transform(this.value1, 0,), transform(this.value2, 1,),),)
        return new LateRetriever.LazyCollectionHolderOf2<U>(() => new Couple((transform as () => U)(), (transform as () => U)(),),)
    }

    public override mapIndexed<const U, >(transform: IndexValueWithReturnCallback<T, U>,): CollectionHolder<U> {
        if (transform.length === 1)
            return new LateRetriever.LazyCollectionHolderOf2<U>(() => new Couple((transform as (index: number,) => U)(0,), (transform as (index: number,) => U)(1,),),)
        if (transform.length >= 2)
            return new LateRetriever.LazyCollectionHolderOf2<U>(() => new Couple(transform(0, this.value1,),transform(1, this.value2,),),)
        return new LateRetriever.LazyCollectionHolderOf2<U>(() => new Couple((transform as () => U)(), (transform as () => U)(),),)
    }


    public override mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        if (transform.length === 1)
            return new LazyCollectionHolderOf0Or1Or2<U>(() => {
                const newValue1 = (transform as (value: T,) => Nullable<U>)(this.value1,)
                const newValue2 = (transform as (value: T,) => Nullable<U>)(this.value2,)
                if (newValue1 == null)
                    if (newValue2 == null)
                        return null
                    else
                        return new Couple(new Optional(newValue2,), EmptyOptional.get,)
                if (newValue2 == null)
                    return new Couple(new Optional(newValue1,), EmptyOptional.get,)
                return new Couple(new Optional(newValue1,), new Optional(newValue2,),)
            },)
        if (transform.length >= 2)
            return new LazyCollectionHolderOf0Or1Or2<U>(() => {
                const newValue1 = transform(this.value1, 0,)
                const newValue2 = transform(this.value2, 1,)
                if (newValue1 == null)
                    if (newValue2 == null)
                        return null
                    else
                        return new Couple(new Optional(newValue2,), EmptyOptional.get,)
                if (newValue2 == null)
                    return new Couple(new Optional(newValue1,), EmptyOptional.get,)
                return new Couple(new Optional(newValue1,), new Optional(newValue2,),)
            },)
        return new LazyCollectionHolderOf0Or1Or2<U>(() => {
            const newValue1 = (transform as () => Nullable<U>)()
            const newValue2 = (transform as () => Nullable<U>)()
            if (newValue1 == null)
                if (newValue2 == null)
                    return null
                else
                    return new Couple(new Optional(newValue2,), EmptyOptional.get,)
            if (newValue2 == null)
                return new Couple(new Optional(newValue1,), EmptyOptional.get,)
            return new Couple(new Optional(newValue1,), new Optional(newValue2,),)
        },)
    }

    public override mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        if (transform.length === 1)
            return new LazyCollectionHolderOf0Or1Or2<U>(() => {
                const newValue1 = (transform as (index: number,) => Nullable<U>)(0,)
                const newValue2 = (transform as (index: number,) => Nullable<U>)(1,)
                if (newValue1 == null)
                    if (newValue2 == null)
                        return null
                    else
                        return new Couple(new Optional(newValue2,), EmptyOptional.get,)
                if (newValue2 == null)
                    return new Couple(new Optional(newValue1,), EmptyOptional.get,)
                return new Couple(new Optional(newValue1,), new Optional(newValue2,),)
            },)
        if (transform.length >= 2)
            return new LazyCollectionHolderOf0Or1Or2<U>(() => {
                const newValue1 = transform(0, this.value1,)
                const newValue2 = transform(1, this.value2,)
                if (newValue1 == null)
                    if (newValue2 == null)
                        return null
                    else
                        return new Couple(new Optional(newValue2,), EmptyOptional.get,)
                if (newValue2 == null)
                    return new Couple(new Optional(newValue1,), EmptyOptional.get,)
                return new Couple(new Optional(newValue1,), new Optional(newValue2,),)
            },)
        return new LazyCollectionHolderOf0Or1Or2<U>(() => {
            const newValue1 = (transform as () => Nullable<U>)()
            const newValue2 = (transform as () => Nullable<U>)()
            if (newValue1 == null)
                if (newValue2 == null)
                    return null
                else
                    return new Couple(new Optional(newValue2,), EmptyOptional.get,)
            if (newValue2 == null)
                return new Couple(new Optional(newValue1,), EmptyOptional.get,)
            return new Couple(new Optional(newValue1,), new Optional(newValue2,),)
        },)
    }

    //#endregion -------------------- Map --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- For each --------------------

    public override forEach(action: ValueIndexCallback<T>,): void {
        if (action.length === 1) {
            (action as (value: T,) => void)(this.value1,);
            (action as (value: T,) => void)(this.value2,)
            return
        }
        if (action.length >= 2) {
            action(this.value1, 0,)
            action(this.value2, 0,)
            return
        }
        (action as () => void)();
        (action as () => void)()
    }

    public override forEachIndexed(action: IndexValueCallback<T>,): void {
        if (action.length === 1) {
            (action as (index: number,) => void)(0,);
            (action as (index: number,) => void)(1,)
            return
        }
        if (action.length >= 2) {
            action(0, this.value1,)
            action(1, this.value2,)
            return
        }
        (action as () => void)();
        (action as () => void)()
    }

    //#endregion -------------------- For each --------------------
    //#region -------------------- On each --------------------

    public override onEach(action: ValueIndexCallback<T>,): this {
        if (action.length === 1) {
            (action as (value: T,) => void)(this.value1,);
            (action as (value: T,) => void)(this.value2,)
            return this
        }
        if (action.length >= 2) {
            action(this.value1, 0,)
            action(this.value2, 1,)
            return this
        }
        (action as () => void)();
        (action as () => void)()
        return this
    }

    public override onEachIndexed(action: IndexValueCallback<T>,): this {
        if (action.length === 1) {
            (action as (index: number,) => void)(0,);
            (action as (index: number,) => void)(1,)
            return this
        }
        if (action.length >= 2) {
            action(0, this.value1,)
            action(1, this.value2,)
            return this
        }
        (action as () => void)();
        (action as () => void)()
        return this
    }

    //#endregion -------------------- On each --------------------

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    //#region -------------------- To reverse --------------------

    public override toReverse(from?: NullableNumber, to?: NullableNumber,): | CollectionHolderOf2<T, T2, T1> | CollectionHolderOf1<T1> | CollectionHolderOf1<T2> {
        if (to == null)
            if (from == null)
                return this._toReverse_core0()
            else
                return this._toReverse_core1(from,)
        if (from == null)
            return this._toReverse_coreWithNoFrom(to,)
        return this._toReverse_core2(from, to,)
    }


    protected _toReverse_core0(): CollectionHolderOf2<T, T2, T1> { return new LateRetriever.CollectionHolderOf2(this.value2, this.value1,) }

    protected _toReverse_core1(from: number,): | CollectionHolderOf2<T, T2, T1> | CollectionHolderOf1<T2> {
        if (__getStartingIndex(from,) === 0)
            return new LateRetriever.CollectionHolderOf2(this.value2, this.value1,)
        return new CollectionHolderOf1(this.value2,)
    }

    protected _toReverse_core2(from: number, to: number,): | CollectionHolderOf2<T, T2, T1> | CollectionHolderOf1<T1> | CollectionHolderOf1<T2> {
        const startingIndex = __getStartingIndex(from,)
        const endingIndex = __getEndingIndex(to,)
        __validateInRange(from, startingIndex, to, endingIndex,)
        if (startingIndex === endingIndex)
            if (startingIndex === 0)
                return new CollectionHolderOf1(this.value1,)
            else
                return new CollectionHolderOf1(this.value2,)
        return new LateRetriever.CollectionHolderOf2(this.value2, this.value1,)
    }

    protected _toReverse_coreWithNoFrom(to: number,): | CollectionHolderOf2<T, T2, T1> | CollectionHolderOf1<T1> {
        if (__getEndingIndex(to,) === 0)
            return new CollectionHolderOf1(this.value1,)
        return new LateRetriever.CollectionHolderOf2(this.value2, this.value1,)
    }

    //#endregion -------------------- To reverse --------------------

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- JavaScript methods --------------------

    public override [Symbol.iterator](): CollectionIteratorOf2<T> {
        return this.toIterator()
    }

    //#endregion -------------------- JavaScript methods --------------------
    //#region -------------------- Conversion methods --------------------

    //#region -------------------- To other structure --------------------

    public override toIterator(): CollectionIteratorOf2<T, T1, T2> {
        return new CollectionIteratorOf2(this.value1, this.value2,)
    }

    public override toArray(): readonly [T1, T2,] {
        return Object.freeze([this.value1, this.value2,],)
    }

    public override toMutableArray(): [T1, T2,] {
        return [this.value1, this.value2,]
    }

    public override toSet(): Set<| T1 | T2> {
        return Object.freeze(new Set([this.value1, this.value2,],),)
    }

    public override toMutableSet(): MutableSet<| T1 | T2> {
        return new Set([this.value1, this.value2,],)
    }

    public override toMap(): NumberKeyMap<| T1 | T2, | 0 | 1> {
        return Object.freeze(new Map<| 0 | 1, | T1 | T2>([[0, this.value1,], [1, this.value2,],],),)
    }

    public override toMutableMap(): MutableNumberKeyMap<| T1 | T2, | 0 | 1> {
        return new Map<| 0 | 1, | T1 | T2>([[0, this.value1,], [1, this.value2,],],)
    }

    //#endregion -------------------- To other structure --------------------
    //#region -------------------- To string --------------------

    public override toString(): string {
        return `[${asString(this.value1,)}, ${asString(this.value2,)}]`
    }

    public override toLocaleString(locale?: NullableString,): string {
        return `[${asLocaleString(this.value1, locale,)}, ${asLocaleString(this.value2, locale,)}]`
    }


    public override toLowerCaseString(): string {
        return `[${asLowerCaseString(this.value1,)}, ${asLowerCaseString(this.value2,)}]`
    }

    public override toLocaleLowerCaseString(locale?: NullableString,): string {
        return `[${asLocaleLowerCaseString(this.value1, locale,)}, ${asLocaleLowerCaseString(this.value2, locale,)}]`
    }


    public override toUpperCaseString(): string {
        return `[${asUpperCaseString(this.value1,)}, ${asUpperCaseString(this.value2,)}]`
    }

    public override toLocaleUpperCaseString(locale?: NullableString,): string {
        return `[${asLocaleUpperCaseString(this.value1, locale,)}, ${asLocaleUpperCaseString(this.value2, locale,)}]`
    }

    //#endregion -------------------- To string --------------------
    //#region -------------------- Join to string --------------------

    protected _joinToString_core(separator: string, prefix: string, postfix: string) {
        return `${prefix}${this.value1}${separator}${this.value2}${postfix}`
    }

    protected _joinToString_truncated0(prefix: string, postfix: string, truncated: string,) {
        return `${prefix}${truncated}${postfix}`
    }

    protected _joinToString_truncated1(separator: string, prefix: string, postfix: string, truncated: string,) {
        return `${prefix}${this.value1}${separator}${truncated}${postfix}`
    }

    protected _joinToString_truncatedTransform(separator: string, prefix: string, postfix: string, truncated: string, transform: StringCallback<T>,) {
        if (transform.length === 1)
            return `${prefix}${(transform as (value: T,) => string)(this.value1,)}${separator}${truncated}${postfix}`
        if (transform.length >= 2)
            return `${prefix}${transform(this.value1, 0,)}${separator}${truncated}${postfix}`
        return `${prefix}${(transform as () => string)()}${separator}${truncated}${postfix}`
    }

    protected _joinToString_transform(separator: string, prefix: string, postfix: string, transform: StringCallback<T>,) {
        if (transform.length === 1)
            return `${prefix}${(transform as (value: T,) => string)(this.value1,)}${separator}${(transform as (value: T,) => string)(this.value2,)}${postfix}`
        if (transform.length >= 2)
            return `${prefix}${transform(this.value1, 0,)}${separator}${transform(this.value2, 1,)}${postfix}`
        return `${prefix}${(transform as () => string)()}${separator}${(transform as () => string)()}${postfix}`
    }


    public override joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string {
        if (transform == null)
            if (limit == null)
                return this._joinToString_core(prefix ?? '[', separator ?? ", ", postfix ?? ']',)
            else {
                const lastIndex = __getLastIndex(limit,)
                if (lastIndex === 0)
                    return this._joinToString_truncated0(prefix ?? '[', postfix ?? ']', truncated ?? '…',)
                if (lastIndex === 1)
                    return this._joinToString_truncated1(separator ?? ", ", prefix ?? '[', postfix ?? ']', truncated ?? '…',)
                return this._joinToString_core(prefix ?? '[', separator ?? ", ", postfix ?? ']',)
            }
        if (limit == null)
            return this._joinToString_transform(separator ?? ", ", prefix ?? '[', postfix ?? ']', transform,)

        const lastIndex = __getLastIndex(limit,)
        if (lastIndex === 0)
            return this._joinToString_truncated0(prefix ?? '[', postfix ?? ']', truncated ?? '…',)
        if (lastIndex === 1)
            return this._joinToString_truncatedTransform(separator ?? ", ", prefix ?? '[', postfix ?? ']', truncated ?? '…', transform,)
        return this._joinToString_transform(separator ?? ", ", prefix ?? '[', postfix ?? ']', transform,)
    }

    //#endregion -------------------- Join to string --------------------

    //#endregion -------------------- Conversion methods --------------------

    //#endregion -------------------- Methods --------------------

}

//#region -------------------- Validate methods --------------------

/**
 * Give the starting index as 0 or 1
 *
 * @param from The value to validate
 * @throws IndexOutOfBoundsException The value is equal or over 2 (before or after calculation)
 * @throws ForbiddenIndexException   The value is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 */
function __getStartingIndex(from: NullableNumber,): | 0 | 1 {
    if (from == null)
        return 0

    if (Number.isNaN(from,))
        throw new ForbiddenIndexException("Forbidden index. The starting index cannot be an index with NaN.", from,)
    if (from === Number.NEGATIVE_INFINITY)
        throw new ForbiddenIndexException("Forbidden index. The starting index cannot be an index with -∞.", from,)
    if (from === Number.POSITIVE_INFINITY)
        throw new ForbiddenIndexException("Forbidden index. The starting index cannot be an index with +∞.", from,)

    if (from === 0)
        return 0
    if (from === 1)
        return 1
    if (from === -1)
        return 1
    if (from === -2)
        return 0

    if (from > 2)
        throw new IndexOutOfBoundsException(`Index out of bound. The starting index “${from}” is over the collection size “2”.`, from,)
    if (from === 2)
        throw new IndexOutOfBoundsException(`Index out of bound. The starting index “${from}” is the collection size “2”.`, from,)
    throw new IndexOutOfBoundsException(`Index out of bound. The starting index “${from}” (“${from + 1}” after calculation) is under 0.`, from,)
}

/**
 * Give the ending index as 0 or 1
 *
 * @param to The value to validate
 * @throws IndexOutOfBoundsException The value is equal or over 2 (before or after calculation)
 * @throws ForbiddenIndexException   The value is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 */
function __getEndingIndex(to: NullableNumber,): | 0 | 1 {
    if (to == null)
        return 1

    if (Number.isNaN(to,))
        throw new ForbiddenIndexException("Forbidden index. The ending index cannot be an index with NaN.", to,)
    if (to === Number.NEGATIVE_INFINITY)
        throw new ForbiddenIndexException("Forbidden index. The ending index cannot be an index with -∞.", to,)
    if (to === Number.POSITIVE_INFINITY)
        throw new ForbiddenIndexException("Forbidden index. The ending index cannot be an index with +∞.", to,)

    if (to === 0)
        return 0
    if (to === 1)
        return 1
    if (to === -1)
        return 1
    if (to === -2)
        return 0

    if (to > 2)
        throw new IndexOutOfBoundsException(`Index out of bound. The ending index “${to}” is over the collection size “2”.`, to,)
    if (to === 2)
        throw new IndexOutOfBoundsException(`Index out of bound. The ending index “${to}” is the collection size “2”.`, to,)
    throw new IndexOutOfBoundsException(`Index out of bound. The ending index “${to}” (“${to + 1}” after calculation) is under 0.`, to,)
}

/**
 * Give the starting index as 0 or 1
 * and throw a {@link ForbiddenIndexException} if invalid
 * or throw a {@link IndexOutOfBoundsException} if out of bound
 *
 * @param value The value to validate
 * @throws IndexOutOfBoundsException An indice is not in the current instance
 * @throws ForbiddenIndexException   The value is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 */
function __getIndex(value: NullableNumber,): | 0 | 1 {
    if (value == null)
        return 0
    if (Number.isNaN(value,))
        throw new ForbiddenIndexException("Forbidden index. The index cannot be NaN.", value,)
    if (value === Number.NEGATIVE_INFINITY)
        throw new ForbiddenIndexException("Forbidden index. The index cannot be -∞.", value,)
    if (value === Number.POSITIVE_INFINITY)
        throw new ForbiddenIndexException("Forbidden index. The index cannot be -∞.", value,)
    if (value === 0)
        return 0
    if (value === 1)
        return 1
    if (value === -1)
        return 1
    if (value === -2)
        return 0
    if (value > 2)
        throw new IndexOutOfBoundsException(`Index out of bound. The index “${value}” is over the size of the collection (2).`, value,)
    if (value === 2)
        throw new IndexOutOfBoundsException(`Index out of bound. The index “${value}” is the size of the collection (2).`, value,)
    throw new IndexOutOfBoundsException(`Index out of bound. The index “${value}” (${value + 1} after calculation) is under 0.`, value,)
}

/**
 * Give the starting index as 0 or 1
 * and gives `null` if invalid or out of bound
 *
 * @param from The value to validate
 */
function __getIndexOrNull(from: NullableNumber,): NullOrNumber<| 0 | 1> {
    if (from == null)
return 0
if (Number.isNaN(from,))
    return null
if (from === Number.NEGATIVE_INFINITY)
    return null
if (from === Number.POSITIVE_INFINITY)
    return null
if (from === 0)
    return 0
if (from === 1)
    return 1
if (from === -1)
    return 1
if (from === -2)
    return 0
return null
}

/**
 * Validate that the {@link endingIndex} is not under the {@link startingIndex}
 *
 * @param from          The initial starting index
 * @param startingIndex The computed starting index
 * @param to            The initial ending index
 * @param endingIndex   The computed ending index
 * @throws InvalidIndexRangeException The {@link endingIndex} is under the {@link startingIndex}
 */
function __validateInRange(from: number, startingIndex: | 0 | 1, to: number, endingIndex: | 0 | 1,): void {
    if (endingIndex >= startingIndex)
return

if (to === endingIndex)
    if (from === startingIndex)
        throw new InvalidIndexRangeException(`Invalid index range. The ending index “${from}” is over the starting index “${to}”.`, from, to,)
    else
        throw new InvalidIndexRangeException(`Invalid index range. The ending index “${from}” is over the starting index “${to}” (“${endingIndex}” after calculation).`, from, to,)
if (from === startingIndex)
    throw new InvalidIndexRangeException(`Invalid index range. The ending index “${from}” (“${startingIndex}” after calculation) is over the starting index “${to}”.`, from, to,)
throw new InvalidIndexRangeException(`Invalid index range. The ending index “${from}” (“${startingIndex}” after calculation) is over the starting index “${to}” (“${endingIndex}” after calculation).`, from, to,)
}

/**
 * Get the last possible index as either 0, 1 or 2
 *
 * @param limit The limit to trimmed (if applicable)
 * @throws ForbiddenIndexException The {@link limit} is {@link Number.NaN NaN}
 */
function __getLastIndex(limit: number,): | 0 | 1 | 2 {
    if (Number.isNaN(limit,))
        throw new ForbiddenIndexException("Forbidden index. The value cannot be determined with NaN.", limit,)
    if (limit === Number.NEGATIVE_INFINITY)
        return 0
    if (limit === Number.POSITIVE_INFINITY)
        return 2
    if (limit === 2)
        return 2
    if (limit === 1)
        return 1
    if (limit === 0)
        return 0
    if (limit > 2)
        return 2
    if (limit === -2)
        return 0
    if (limit === -1)
        return 1
    return 0
}

//#endregion -------------------- Validate methods --------------------

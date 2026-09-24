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
import type {CollectionHolderOf1}                                                                                                                                                                                                                                               from "./CollectionHolderOf1"
import type {CollectionHolderOf2}                                                                                                                                                                                                                                               from "./CollectionHolderOf2"
import type {MinimalistCollectionHolder}                                                                                                                                                                                                                                        from "./MinimalistCollectionHolder"
import type {CollectionIterator}                                                                                                                                                                                                                                                from "./iterator/CollectionIterator"
import type {CollectionIteratorOf2}                                                                                                                                                                                                                                             from "./iterator/CollectionIteratorOf2"
import type {Couple}                                                                                                                                                                                                                                                            from "./tuple/Couple"
import type {BooleanCallback, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, RestrainedBooleanCallback, ReturnCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, StringCallback, ValueIndexCallback, ValueIndexWithReturnCallback} from "./type/callback"
import type {CollectionHolderOf0Or1Or2, CollectionHolderOf1Or2, CollectionHolderOfAny0Or1Or2, CollectionHolderOfAny1Or2, CollectionHolderOfLast0Or1Or2, CollectionHolderOfLast1Or2}                                                                                             from "./type/collection"
import type {IndexOf2, IndexOf2Of1, IndexOf2Of2}                                                                                                                                                                                                                                from "./type/indexOf"
import type {ToReverse_from, ToReverse_fromTo, ToReverse_to}                                                                                                                                                                                                                    from "./type/toReverse"
import type {DoubleValueFromIndex, DoubleValueFromIndexOrElse, DoubleValueFromIndexOrNull}                                                                                                                                                                                      from "./type/value"

import {AbstractPartiallyUnimplementedCollectionHolderOf2}                                                                from "./AbstractPartiallyUnimplementedCollectionHolderOf2"
import {EmptyCollectionHolder}                                                                                            from "./EmptyCollectionHolder"
import {LazyArrayAsCollectionHolder}                                                                                      from "./LazyArrayAsCollectionHolder"
import {SingleValueCollectionHolder}                                                                                      from "./SingleValueCollectionHolder"
import {DualValueCollectionIterator}                                                                                      from "./iterator/DualValueCollectionIterator"
import {ForbiddenIndexException}                                                                                          from "./exception/ForbiddenIndexException"
import {IndexOutOfBoundsException}                                                                                        from "./exception/IndexOutOfBoundsException"
import {IndexNotFoundException}                                                                                           from "./exception/IndexNotFoundException"
import {InvalidIndexRangeException}                                                                                       from "./exception/InvalidIndexRangeException"
import {asLocaleLowerCaseString, asLocaleString, asLocaleUpperCaseString, asLowerCaseString, asString, asUpperCaseString} from "./method/asString"
import {EmptyOptional}                                                                                                    from "./optional/EmptyOptional"
import {Optional}                                                                                                         from "./optional/Optional"

/**
 * A {@link CollectionHolder} having 2 values.
 * No state or reference is held in this instance.
 *
 * Most of the methods are being optimized for two value comparison
 * instead of using the extension function.
 *
 * @typeParam T1 The 1st type (**mandatory**)
 * @typeParam T2 The 2nd type (**mandatory**)
 * @see AbstractCollectionHolder
 * @see AbstractCollectionHolderOf1
 * @see DualValueCollectionHolder
 * @see LazyCollectionHolderOf2
 * @see ArrayOf2AsCollectionHolder
 * @see SetOf2AsCollectionHolder
 */
export abstract class AbstractCollectionHolderOf2<const T1,
    const T2, >
    extends AbstractPartiallyUnimplementedCollectionHolderOf2<T1, T2> {

    //#region -------------------- Constructor --------------------

    protected constructor() { super() }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Create methods --------------------

    /**
     * Create a new {@link Couple} from 2 values
     *
     * Note that this should usually be:
     * ```typescript
     * protected override _createCouple<const U1, const U2>(value1: U1, value2: U2): Couple<U1, U2> {
     *     return new Couple(value1, value2)
     * }
     * ```
     * or in JavaScript:
     * ```javascript
     * _createCouple(value1, value2) {
     *     return new Couple(value1, value2)
     * }
     * ```
     *
     * @param value1 The 1st value
     * @param value2 The 2nd value
     */
    protected abstract _createCouple<const U1, const U2, >(value1: U1, value2: U2,): Couple<U1, U2>

    /**
     * Create a new instance from 1 value
     *
     * Note that this should usually be:
     * ```typescript
     * protected override _create1<const U>(value: U): CollectionHolderOf1<U> {
     *     return new SingleValueCollectionHolder(value)
     * }
     * ```
     * or in JavaScript:
     * ```javascript
     * _create1(value) {
     *     return new SingleValueCollectionHolder(value)
     * }
     * ```
     *
     * @param value The value
     */
    protected _create1<const U, >(value: U,): CollectionHolderOf1<U> {
        return new SingleValueCollectionHolder(value,)
    }

    /**
     * Create a new instance from 2 values
     *
     * Note that this should usually be:
     * ```typescript
     * protected override _create2(value1: T2, value2: T1): CollectionHolderOf2<T2, T1> {
     *     return new DualValueCollectionHolder(value1, value2)
     * }
     * ```
     * or in JavaScript:
     * ```javascript
     * _create2(value1, value2) {
     *     return new DualValueCollectionHolder(value1, value2)
     * }
     * ```
     *
     * @param value1 The 1st value
     * @param value2 The 2nd value
     */
    protected abstract _create2(value2: T2, value1: T1,): CollectionHolderOf2<T2, T1>

    /**
     * Create a new instance from a late dual value
     *
     * Note that this should usually be:
     * ```typescript
     * protected override _createLazy2(lateValue: () => Couple<U1, U2>): CollectionHolderOf2<U1, U2> {
     *     return new LazyCollectionHolderOf2(lateValue)
     * }
     * ```
     * or in JavaScript:
     * ```javascript
     * _createLazy2(lateValue) {
     *     return new LazyCollectionHolderOf2(lateValue)
     * }
     * ```
     *
     * @param lateValue The late couple
     */
    protected abstract _createLazy2<const U1, const U2, >(lateValue: () => Couple<U1, U2>,): CollectionHolderOf2<U1, U2>

    /**
     * Create a new instance that has possibly 0, 1 or 2 values.
     *
     * Note that this should usually be:
     * ```typescript
     * protected override _create0Or1Or2<const U1, const U2>(latePossibleValue: () => Couple<Optional<U1|U2>, Optional<U2>>): CollectionHolder<U1|U2> {
     *     return new LazyCollectionHolderOf0Or1Or2(latePossibleValue)
     * }
     * ```
     * or in JavaScript:
     * ```javascript
     * _create0Or1Or2(latePossibleValue) {
     *     return new LazyCollectionHolderOf0Or1Or2(latePossibleValue)
     * }
     * ```
     *
     * @param latePossibleValue The possible value that is late
     */
    protected abstract _create0Or1Or2<const U1, const U2, >(latePossibleValue: () => Nullable<Couple<Optional<| U1 | U2>, Optional<U2>>>,): CollectionHolder<| U1 | U2>

    /**
     * Create a new instance from a late {@link ReadonlyArray Array}
     *
     * Note that this should usually be:
     * ```typescript
     * protected override _createLazyArray(lateArray: () => Array<T1 | T2>): CollectionHolder<T1 | T2> {
     *     return new LazyArrayAsCollectionHolder(lateArray)
     * }
     * ```
     * or in JavaScript:
     * ```javascript
     * _createLazyArray(lateArray) {
     *     return new LazyArrayAsCollectionHolder(lateArray)
     * }
     * ```
     *
     * @param lateArray The late array
     */
    protected _createLazyArray(lateArray: () => Array<| T1 | T2>,): CollectionHolder<| T1 | T2> {
        return new LazyArrayAsCollectionHolder(lateArray,)
    }

    //#endregion -------------------- Create methods --------------------
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

    public override get<const I extends number, >(index: I,): DoubleValueFromIndex<I, T1, T2>
    public override get(index: number,): | T1 | T2
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


    public override getOrElse<const U, const I extends number,>(index: I, defaultValue: IndexWithReturnCallback<U>,): DoubleValueFromIndexOrElse<I, T1, T2, U>
    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T1 | T2 | U
    public override getOrElse<const I extends number, >(index: I, defaultValue: IndexWithReturnCallback<| T1 | T2>,): DoubleValueFromIndexOrElse<I, T1, T2, | T1 | T2>
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<| T1 | T2>,): | T1 | T2
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
    public override getFirstOrElse(defaultValue: ReturnCallback<| T1 | T2>,): T1
    public override getFirstOrElse() { return this.value1 }

    public override getLastOrElse<const U, >(defaultValue: ReturnCallback<U>,): T2
    public override getLastOrElse(defaultValue: ReturnCallback<| T1 | T2>,): T2
    public override getLastOrElse() { return this.value2 }


    public override getOrNull<const I extends number, >(index: I,): DoubleValueFromIndexOrNull<I, T1, T2>
    public override getOrNull(index: number,): NullOr<| T1 | T2>
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

    public override findFirst<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): S
    public override findFirst(predicate: BooleanCallback<| T1 | T2>,): | T1 | T2
    public override findFirst(predicate: BooleanCallback<| T1 | T2>,) {
        if (predicate.length === 1) {
            const value1 = this.value1
            if ((predicate as (value: | T1 | T2,) => boolean)(value1,))
                return value1

            const value2 = this.value2
            if ((predicate as (value: | T1 | T2,) => boolean)(value2,))
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

    public override findFirstOrNull<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): NullOr<S>
    public override findFirstOrNull(predicate: BooleanCallback<| T1 | T2>,): NullOr<| T1 | T2>
    public override findFirstOrNull(predicate: BooleanCallback<| T1 | T2>,) {
        if (predicate.length === 1) {
            const value1 = this.value1
            if ((predicate as (value: | T1 | T2,) => boolean)(value1,))
                return value1

            const value2 = this.value2
            if ((predicate as (value: | T1 | T2,) => boolean)(value2,))
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

    public override findFirstIndexed<const S extends | T1 | T2, >(predicate: ReverseRestrainedBooleanCallback<| T1 | T2, S>,): S
    public override findFirstIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,): | T1 | T2
    public override findFirstIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,) {
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

    public override findFirstIndexedOrNull<const S extends | T1 | T2, >(predicate: ReverseRestrainedBooleanCallback<| T1 | T2, S>,): NullOr<S>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<| T1 | T2>,): NullOr<| T1 | T2>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<| T1 | T2>,) {
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

    public override findLast<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): S
    public override findLast(predicate: BooleanCallback<| T1 | T2>,): | T1 | T2
    public override findLast(predicate: BooleanCallback<| T1 | T2>,) {
        if (predicate.length === 1) {
            const value2 = this.value2
            if ((predicate as (value: | T1 | T2,) => boolean)(value2,))
                return value2

            const value1 = this.value1
            if ((predicate as (value: | T1 | T2,) => boolean)(value1,))
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

    public override findLastOrNull<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): NullOr<S>
    public override findLastOrNull(predicate: BooleanCallback<| T1 | T2>,): NullOr<| T1 | T2>
    public override findLastOrNull(predicate: BooleanCallback<| T1 | T2>,) {
        if (predicate.length === 1) {
            const value2 = this.value2
            if ((predicate as (value: | T1 | T2,) => boolean)(value2,))
                return value2

            const value1 = this.value1
            if ((predicate as (value: | T1 | T2,) => boolean)(value1,))
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

    public override findLastIndexed<const S extends | T1 | T2, >(predicate: ReverseRestrainedBooleanCallback<| T1 | T2, S>,): S
    public override findLastIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,): | T1 | T2
    public override findLastIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,) {
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

    public override findLastIndexedOrNull<const S extends | T1 | T2, >(predicate: ReverseRestrainedBooleanCallback<| T1 | T2, S>,): NullOr<S>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<| T1 | T2>,): NullOr<| T1 | T2>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<| T1 | T2>,) {
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

    //#region -------------------- First --------------------

    public override firstOrNull(): T1
    public override firstOrNull<const S extends | T1 | T2, >(predicate: Nullable<RestrainedBooleanCallback<| T1 | T2, S>>,): NullOr<S>
    public override firstOrNull(predicate: Nullable<BooleanCallback<| T1 | T2>>,): NullOr<| T1 | T2>
    public override firstOrNull(predicate?: Nullable<BooleanCallback<| T1 | T2>>,) {
        if (predicate == null)
            return this.getFirst()
        return this.findFirstOrNull(predicate,)
    }

    public override firstIndexedOrNull(): T1
    public override firstIndexedOrNull<const S extends | T1 | T2, >(predicate: Nullable<ReverseRestrainedBooleanCallback<| T1 | T2, S>>,): NullOr<S>
    public override firstIndexedOrNull(predicate: Nullable<ReverseBooleanCallback<| T1 | T2>>,): NullOr<| T1 | T2>
    public override firstIndexedOrNull(predicate?: Nullable<ReverseBooleanCallback<| T1 | T2>>,) {
        if (predicate == null)
            return this.getFirst()
        return this.findFirstIndexedOrNull(predicate,)
    }

    //#endregion -------------------- First --------------------
    //#region -------------------- Last --------------------

    public override lastOrNull(): T2
    public override lastOrNull<const S extends | T1 | T2, >(predicate: Nullable<RestrainedBooleanCallback<| T1 | T2, S>>,): NullOr<S>
    public override lastOrNull(predicate: Nullable<BooleanCallback<| T1 | T2>>,): NullOr<| T1 | T2>
    public override lastOrNull(predicate?: Nullable<BooleanCallback<| T1 | T2>>,) {
        if (predicate == null)
            return this.getLast()
        return this.findLastOrNull(predicate,)
    }

    public override lastIndexedOrNull(): T2
    public override lastIndexedOrNull<const S extends | T1 | T2, >(predicate: Nullable<ReverseRestrainedBooleanCallback<| T1 | T2, S>>,): NullOr<S>
    public override lastIndexedOrNull(predicate: Nullable<ReverseBooleanCallback<| T1 | T2>>,): NullOr<| T1 | T2>
    public override lastIndexedOrNull(predicate?: Nullable<ReverseBooleanCallback<| T1 | T2>>,) {
        if (predicate == null)
            return this.getLast()
        return this.findLastIndexedOrNull(predicate,)
    }

    //#endregion -------------------- Last --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    //#region -------------------- First index of --------------------

    protected _firstIndexOf_core0(element: | T1 | T2,): | 0 | 1 { return this.#firstIndexOf_findInRange(element,) }

    protected _firstIndexOf_core1(element: | T1 | T2, from: number,): | 0 | 1 {
        if (__getStartingIndex(from,) === 0)
            return this.#firstIndexOf_findInRange(element,)
        return this.#firstIndexOf_find2(element,)
    }

    protected _firstIndexOf_core2(element: | T1 | T2, from: number, to: number,): | 0 | 1 {
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

    protected _firstIndexOf_withNoFrom(element: | T1 | T2, to: number,): | 0 | 1 {
        if (__getEndingIndex(to,) === 0)
            return this.#firstIndexOf_find1(element,)
        return this.#firstIndexOf_findInRange(element,)
    }


    #firstIndexOf_find1(element: | T1 | T2,): 0 {
        if (this.value1 === element)
            return 0
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“0”) to the ending (“0”) indexes in the collection.`, 1,)
    }

    #firstIndexOf_find2(element: | T1 | T2,): 1 {
        if (this.value2 === element)
            return 1
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“1”) to the ending (“1”) indexes in the collection.`, 1,)
    }

    #firstIndexOf_findInRange(element: | T1 | T2,): | 0 | 1 {
        if (this.value1 === element)
            return 0
        if (this.value2 === element)
            return 1
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“0”) to the ending (“1”) indexes in the collection.`, 2,)
    }


    public override firstIndexOf<const I1 extends NullableNumber, const I2 extends NullableNumber, >(element: T1,        from?: I1,             to?: I2,):             IndexOf2Of1<I1, I2>
    public override firstIndexOf                                                                    (element: T1,        from?: NullableNumber, to?: NullableNumber,): 0
    public override firstIndexOf<const I1 extends NullableNumber, const I2 extends NullableNumber, >(element: T2,        from?: I1,             to?: I2,):             IndexOf2Of2<I1, I2>
    public override firstIndexOf                                                                    (element: T2,        from?: NullableNumber, to?: NullableNumber,): 1
    public override firstIndexOf<const I1 extends NullableNumber, const I2 extends NullableNumber, >(element: | T1 | T2, from?: I1,             to?: I2,):             IndexOf2<I1, I2>
    public override firstIndexOf                                                                    (element: | T1 | T2, from?: NullableNumber, to?: NullableNumber,): | 0 | 1
    public override firstIndexOf(element: | T1 | T2, from?: NullableNumber, to?: NullableNumber,) {
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

    protected _firstIndexOfOrNull_core0(element: | T1 | T2,): NullOrNumber<| 0 | 1> { return this.#firstIndexOfOrNull_findInRange(element,) }

    protected _firstIndexOfOrNull_core1(element: | T1 | T2, from: number,): NullOrNumber<| 0 | 1> {
        const startingIndex = __getIndexOrNull(from,)
        if (startingIndex == null)
            return null
        if (startingIndex === 0)
            return this.#firstIndexOfOrNull_findInRange(element,)
        return this.#firstIndexOfOrNull_find2(element,)
    }

    protected _firstIndexOfOrNull_core2(element: | T1 | T2, from: number, to: number,): NullOrNumber<| 0 | 1> {
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

    protected _firstIndexOfOrNull_withNoFrom(element: | T1 | T2, to: number,): NullOrNumber<| 0 | 1> {
        const endingIndex = __getIndexOrNull(to,)
        if (endingIndex == null)
            return null
        if (endingIndex === 0)
            return this.#firstIndexOfOrNull_find1(element,)
        return this.#firstIndexOfOrNull_findInRange(element,)
    }


    #firstIndexOfOrNull_find1(element: | T1 | T2,): NullOrZeroNumber {
        if (this.value1 === element)
            return 0
        return null
    }

    #firstIndexOfOrNull_find2(element: | T1 | T2,): NullOrOneNumber {
        if (this.value2 === element)
            return 1
        return null
    }

    #firstIndexOfOrNull_findInRange(element: | T1 | T2,): NullOrNumber<| 0 | 1> {
        if (this.value1 === element)
            return 0
        if (this.value2 === element)
            return 1
        return null
    }


    public override firstIndexOfOrNull(element: T1,        from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber
    public override firstIndexOfOrNull(element: T2,        from?: NullableNumber, to?: NullableNumber,): NullOrOneNumber
    public override firstIndexOfOrNull(element: | T1 | T2, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1>
    public override firstIndexOfOrNull(element: | T1 | T2, from?: NullableNumber, to?: NullableNumber,) {
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

    protected _lastIndexOf_core0(element: | T1 | T2,): | 0 | 1 { return this.#lastIndexOf_findInRange(element,) }

    protected _lastIndexOf_core1(element: | T1 | T2, from: number,): | 0 | 1 {
        if (__getStartingIndex(from,) === 1)
            return this.#lastIndexOf_find2(element,)
        return this.#lastIndexOf_findInRange(element,)
    }

    protected _lastIndexOf_core2(element: | T1 | T2, from: number, to: number,): | 0 | 1 {
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

    protected _lastIndexOf_withNoFrom(element: | T1 | T2, to: number,): | 0 | 1 {
        if (__getEndingIndex(to,) === 1)
            return this.#lastIndexOf_findInRange(element,)
        return this.#lastIndexOf_find1(element,)
    }


    #lastIndexOf_find1(element: | T1 | T2,): 0 {
        if (this.value1 === element)
            return 0
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“0”) to the ending (“0”) indexes in the collection.`, 1,)
    }

    #lastIndexOf_find2(element: | T1 | T2,): 1 {
        if (this.value2 === element)
            return 1
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“1”) to the ending (“1”) indexes in the collection.`, 1,)
    }

    #lastIndexOf_findInRange(element: | T1 | T2,): | 0 | 1 {
        if (this.value2 === element)
            return 1
        if (this.value1 === element)
            return 0
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“0”) to the ending (“1”) indexes in the collection.`, -1,)
    }


    public override lastIndexOf<const I1 extends NullableNumber, const I2 extends NullableNumber, >(element: T1,        from?: I1,             to?: I2,):             IndexOf2Of1<I1, I2>
    public override lastIndexOf                                                                    (element: T1,        from?: NullableNumber, to?: NullableNumber,): 0
    public override lastIndexOf<const I1 extends NullableNumber, const I2 extends NullableNumber, >(element: T2,        from?: I1,             to?: I2,):             IndexOf2Of2<I1, I2>
    public override lastIndexOf                                                                    (element: T2,        from?: NullableNumber, to?: NullableNumber,): 1
    public override lastIndexOf<const I1 extends NullableNumber, const I2 extends NullableNumber, >(element: | T1 | T2, from?: I1,             to?: I2,):             IndexOf2<I1, I2>
    public override lastIndexOf                                                                    (element: | T1 | T2, from?: NullableNumber, to?: NullableNumber,): | 0 | 1
    public override lastIndexOf(element: | T1 | T2, from?: NullableNumber, to?: NullableNumber,) {
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

    protected _lastIndexOfOrNull_core0(element: | T1 | T2,): NullOrNumber<| 0 | 1> { return this.#lastIndexOfOrNull_findInRange(element,) }

    protected _lastIndexOfOrNull_core1(element: | T1 | T2, from: number,): NullOrNumber<| 0 | 1> {
        const startingIndex = __getIndexOrNull(from,)
        if (startingIndex == null)
            return null
        if (startingIndex === 1)
            return this.#lastIndexOfOrNull_find2(element,)
        return this.#lastIndexOfOrNull_findInRange(element,)
    }

    protected _lastIndexOfOrNull_core2(element: | T1 | T2, from: number, to: number,): NullOrNumber<| 0 | 1> {
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

    protected _lastIndexOfOrNull_withNoFrom(element: | T1 | T2, to: number,): NullOrNumber<| 0 | 1> {
        const endingIndex = __getIndexOrNull(to,)
        if (endingIndex == null)
            return null
        if (endingIndex === 1)
            return this.#lastIndexOfOrNull_findInRange(element,)
        return this.#lastIndexOfOrNull_find1(element,)
    }


    #lastIndexOfOrNull_find1(element: | T1 | T2,): NullOrZeroNumber {
        if (this.value1 === element)
            return 0
        return null
    }

    #lastIndexOfOrNull_find2(element: | T1 | T2,): NullOrOneNumber {
        if (this.value2 === element)
            return 1
        return null
    }

    #lastIndexOfOrNull_findInRange(element: | T1 | T2,): NullOrNumber<| 0 | 1> {
        if (this.value2 === element)
            return 1
        if (this.value1 === element)
            return 0
        return null
    }


    public override lastIndexOfOrNull(element: T1,        from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber
    public override lastIndexOfOrNull(element: T2,        from?: NullableNumber, to?: NullableNumber,): NullOrOneNumber
    public override lastIndexOfOrNull(element: | T1 | T2, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1>
    public override lastIndexOfOrNull(element: | T1 | T2, from?: NullableNumber, to?: NullableNumber,) {
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

    protected _indexOfFirst_core0(predicate: BooleanCallback<| T1 | T2>,): | 0 | 1 {
        if (predicate.length === 1)
            return this.#indexOfFirst_with1Argument_findInRange(predicate as (value: | T1 | T2,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfFirst_with2Argument_findInRange(predicate as (value: | T1 | T2,) => boolean,)
        return this.#indexOfFirst_with0Argument_findInRange(predicate as () => boolean,)
    }

    protected _indexOfFirst_core1(predicate: BooleanCallback<| T1 | T2>, from: number,): | 0 | 1 {
        if (__getStartingIndex(from,) === 0)
            if (predicate.length === 1)
                return this.#indexOfFirst_with1Argument_findInRange(predicate as (value: | T1 | T2,) => boolean,)
            else if (predicate.length >= 2)
                return this.#indexOfFirst_with2Argument_findInRange(predicate as (value: | T1 | T2,) => boolean,)
            else
                return this.#indexOfFirst_with0Argument_findInRange(predicate as () => boolean,)
        if (predicate.length === 1)
            return this.#indexOfFirst_with1Argument_find2(predicate as (value: | T1 | T2,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfFirst_with2Argument_find2(predicate as (value: | T1 | T2,) => boolean,)
        return this.#indexOfFirst_with0Argument_find2(predicate as () => boolean,)
    }

    protected _indexOfFirst_core2(predicate: BooleanCallback<| T1 | T2>, from: number, to: number,): | 0 | 1 {
        const startingIndex = __getStartingIndex(from,)
        const endingIndex = __getEndingIndex(to,)
        __validateInRange(from, startingIndex, to, endingIndex,)
        if (startingIndex === endingIndex)
            if (startingIndex === 0)
                if (predicate.length === 1)
                    return this.#indexOfFirst_with1Argument_find1(predicate as (value: | T1 | T2,) => boolean,)
                else if (predicate.length >= 2)
                    return this.#indexOfFirst_with2Argument_find1(predicate as (value: | T1 | T2,) => boolean,)
                else
                    return this.#indexOfFirst_with0Argument_find1(predicate as () => boolean,)
            else if (predicate.length === 1)
                return this.#indexOfFirst_with1Argument_find2(predicate as (value: | T1 | T2,) => boolean,)
            else if (predicate.length >= 2)
                return this.#indexOfFirst_with2Argument_find2(predicate as (value: | T1 | T2,) => boolean,)
            else
                return this.#indexOfFirst_with0Argument_find2(predicate as () => boolean,)
        if (predicate.length === 1)
            return this.#indexOfFirst_with1Argument_findInRange(predicate as (value: | T1 | T2,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfFirst_with2Argument_findInRange(predicate as (value: | T1 | T2,) => boolean,)
        return this.#indexOfFirst_with0Argument_findInRange(predicate as () => boolean,)
    }

    protected _indexOfFirst_coreWithNoFrom(predicate: BooleanCallback<| T1 | T2>, to: number,): | 0 | 1 {
        if (__getEndingIndex(to,) === 0)
            if (predicate.length === 1)
                return this.#indexOfFirst_with1Argument_find1(predicate as (value: | T1 | T2,) => boolean,)
            else if (predicate.length >= 2)
                return this.#indexOfFirst_with2Argument_find1(predicate as (value: | T1 | T2,) => boolean,)
            else
                return this.#indexOfFirst_with0Argument_find1(predicate as () => boolean,)
        if (predicate.length === 1)
            return this.#indexOfFirst_with1Argument_findInRange(predicate as (value: | T1 | T2,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfFirst_with2Argument_findInRange(predicate as (value: | T1 | T2,) => boolean,)
        return this.#indexOfFirst_with0Argument_findInRange(predicate as () => boolean,)
    }


    public override indexOfFirst<const I1 extends NullableNumber, const I2 extends NullableNumber, >(predicate: BooleanCallback<| T1 | T2>, from?: I1,             to?: I2,):             IndexOf2<I1, I2>
    public override indexOfFirst                                                                    (predicate: BooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): | 0 | 1
    public override indexOfFirst(predicate: BooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,) {
        if (to == null)
            if (from == null)
                return this._indexOfFirst_core0(predicate,)
            else
                return this._indexOfFirst_core1(predicate, from,)
        if (from == null)
            return this._indexOfFirst_coreWithNoFrom(predicate, to,)
        return this._indexOfFirst_core2(predicate, from, to,)
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

    //#endregion -------------------- Index of first --------------------
    //#region -------------------- Index of first or null --------------------

    protected _indexOfFirstOrNull_core0(predicate: BooleanCallback<| T1 | T2>,): NullOrNumber<| 0 | 1> {
        if (predicate.length === 1)
            return this.#indexOfFirstOrNull_with1Argument_findInRange(predicate as (value: | T1 | T2,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfFirstOrNull_with2Argument_findInRange(predicate as (value: | T1 | T2,) => boolean,)
        return this.#indexOfFirstOrNull_with0Argument_findInRange(predicate as () => boolean,)
    }

    protected _indexOfFirstOrNull_core1(predicate: BooleanCallback<| T1 | T2>, from: number,): NullOrNumber<| 0 | 1> {
        const startingIndex = __getIndexOrNull(from,)
        if (startingIndex == null)
            return null
        if (startingIndex === 0)
            if (predicate.length === 1)
                return this.#indexOfFirstOrNull_with1Argument_findInRange(predicate as (value: | T1 | T2,) => boolean,)
            else if (predicate.length >= 2)
                return this.#indexOfFirstOrNull_with2Argument_findInRange(predicate as (value: | T1 | T2,) => boolean,)
            else
                return this.#indexOfFirstOrNull_with0Argument_findInRange(predicate as () => boolean,)
        if (predicate.length === 1)
            return this.#indexOfFirstOrNull_with1Argument_find2(predicate as (value: | T1 | T2,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfFirstOrNull_with2Argument_find2(predicate as (value: | T1 | T2,) => boolean,)
        return this.#indexOfFirstOrNull_with0Argument_find2(predicate as () => boolean,)
    }

    protected _indexOfFirstOrNull_core2(predicate: BooleanCallback<| T1 | T2>, from: number, to: number,): NullOrNumber<| 0 | 1> {
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
                    return this.#indexOfFirstOrNull_with1Argument_find1(predicate as (value: | T1 | T2,) => boolean,)
                else if (predicate.length >= 2)
                    return this.#indexOfFirstOrNull_with2Argument_find1(predicate as (value: | T1 | T2,) => boolean,)
                else
                    return this.#indexOfFirstOrNull_with0Argument_find1(predicate as () => boolean,)
            else if (predicate.length === 1)
                return this.#indexOfFirstOrNull_with1Argument_find2(predicate as (value: | T1 | T2,) => boolean,)
            else if (predicate.length >= 2)
                return this.#indexOfFirstOrNull_with2Argument_find2(predicate as (value: | T1 | T2,) => boolean,)
            else
                return this.#indexOfFirstOrNull_with0Argument_find2(predicate as () => boolean,)
        if (predicate.length === 1)
            return this.#indexOfFirstOrNull_with1Argument_findInRange(predicate as (value: | T1 | T2,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfFirstOrNull_with2Argument_findInRange(predicate as (value: | T1 | T2,) => boolean,)
        return this.#indexOfFirstOrNull_with0Argument_findInRange(predicate as () => boolean,)
    }

    protected _indexOfFirstOrNull_coreWithNoFrom(predicate: BooleanCallback<| T1 | T2>, to: number,): NullOrNumber<| 0 | 1> {
        const endingIndex = __getIndexOrNull(to,)
        if (endingIndex == null)
            return null
        if (endingIndex === 0)
            if (predicate.length === 1)
                return this.#indexOfFirstOrNull_with1Argument_find1(predicate as (value: | T1 | T2,) => boolean,)
            else if (predicate.length >= 2)
                return this.#indexOfFirstOrNull_with2Argument_find1(predicate as (value: | T1 | T2,) => boolean,)
            else
                return this.#indexOfFirstOrNull_with0Argument_find1(predicate as () => boolean,)
        if (predicate.length === 1)
            return this.#indexOfFirstOrNull_with1Argument_findInRange(predicate as (value: | T1 | T2,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfFirstOrNull_with2Argument_findInRange(predicate as (value: | T1 | T2,) => boolean,)
        return this.#indexOfFirstOrNull_with0Argument_findInRange(predicate as () => boolean,)
    }


    public override indexOfFirstOrNull(predicate: BooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1> {
        if (to == null)
            if (from == null)
                return this._indexOfFirstOrNull_core0(predicate,)
            else
                return this._indexOfFirstOrNull_core1(predicate, from,)
        if (from == null)
            return this._indexOfFirstOrNull_coreWithNoFrom(predicate, to,)
        return this._indexOfFirstOrNull_core2(predicate, from, to,)
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

    //#endregion -------------------- Index of first or null --------------------
    //#region -------------------- Index of first indexed --------------------

    protected _indexOfFirstIndexed_core0(predicate: ReverseBooleanCallback<| T1 | T2>,): | 0 | 1 {
        if (predicate.length === 1)
            return this.#indexOfFirstIndexed_with1Argument_findInRange(predicate as (index: number,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfFirstIndexed_with2Argument_findInRange(predicate as (index: number,) => boolean,)
        return this.#indexOfFirstIndexed_with0Argument_findInRange(predicate as () => boolean,)
    }

    protected _indexOfFirstIndexed_core1(predicate: ReverseBooleanCallback<| T1 | T2>, from: number,): | 0 | 1 {
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

    protected _indexOfFirstIndexed_core2(predicate: ReverseBooleanCallback<| T1 | T2>, from: number, to: number,): | 0 | 1 {
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

    protected _indexOfFirstIndexed_coreWithNoFrom(predicate: ReverseBooleanCallback<| T1 | T2>, to: number,): | 0 | 1 {
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


    public override indexOfFirstIndexed<const I1 extends NullableNumber, const I2 extends NullableNumber, >(predicate: ReverseBooleanCallback<| T1 | T2>, from?: I1,             to?: I2,):             IndexOf2<I1, I2>
    public override indexOfFirstIndexed                                                                    (predicate: ReverseBooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): | 0 | 1
    public override indexOfFirstIndexed(predicate: ReverseBooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,) {
        if (to == null)
            if (from == null)
                return this._indexOfFirstIndexed_core0(predicate,)
            else
                return this._indexOfFirstIndexed_core1(predicate, from,)
        if (from == null)
            return this._indexOfFirstIndexed_coreWithNoFrom(predicate, to,)
        return this._indexOfFirstIndexed_core2(predicate, from, to,)
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

    //#endregion -------------------- Index of first indexed --------------------
    //#region -------------------- Index of first indexed or null --------------------

    protected _indexOfFirstIndexedOrNull_core0(predicate: ReverseBooleanCallback<| T1 | T2>,): NullOrNumber<| 0 | 1> {
        if (predicate.length === 1)
            return this.#indexOfFirstIndexedOrNull_with1Argument_findInRange(predicate as (index: number,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfFirstIndexedOrNull_with2Argument_findInRange(predicate as (index: number,) => boolean,)
        return this.#indexOfFirstIndexedOrNull_with0Argument_findInRange(predicate as () => boolean,)
    }

    protected _indexOfFirstIndexedOrNull_core1(predicate: ReverseBooleanCallback<| T1 | T2>, from: number,): NullOrNumber<| 0 | 1> {
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

    protected _indexOfFirstIndexedOrNull_core2(predicate: ReverseBooleanCallback<| T1 | T2>, from: number, to: number,): NullOrNumber<| 0 | 1> {
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

    protected _indexOfFirstIndexedOrNull_coreWithNoFrom(predicate: ReverseBooleanCallback<| T1 | T2>, to: number,): NullOrNumber<| 0 | 1> {
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


    public override indexOfFirstIndexedOrNull(predicate: ReverseBooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1> {
        if (to == null)
            if (from == null)
                return this._indexOfFirstIndexedOrNull_core0(predicate,)
            else
                return this._indexOfFirstIndexedOrNull_core1(predicate, from,)
        if (from == null)
            return this._indexOfFirstIndexedOrNull_coreWithNoFrom(predicate, to,)
        return this._indexOfFirstIndexedOrNull_core2(predicate, from, to,)
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

    //#endregion -------------------- Index of first indexed or null --------------------

    //#region -------------------- Index of last --------------------

    protected _indexOfLast_core0(predicate: BooleanCallback<| T1 | T2>,): | 0 | 1 {
        if (predicate.length === 1)
            return this.#indexOfLast_with1Argument_findInRange(predicate as (value: | T1 | T2,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfLast_with2Argument_findInRange(predicate as (value: | T1 | T2,) => boolean,)
        return this.#indexOfLast_with0Argument_findInRange(predicate as () => boolean,)
    }

    protected _indexOfLast_core1(predicate: BooleanCallback<| T1 | T2>, from: number,): | 0 | 1 {
        if (__getStartingIndex(from,) === 1)
            if (predicate.length === 1)
                return this.#indexOfLast_with1Argument_find2(predicate as (value: | T1 | T2,) => boolean,)
            else if (predicate.length >= 2)
                return this.#indexOfLast_with2Argument_find2(predicate as (value: | T1 | T2,) => boolean,)
            else
                return this.#indexOfLast_with0Argument_find2(predicate as () => boolean,)
        if (predicate.length === 1)
            return this.#indexOfLast_with1Argument_findInRange(predicate as (value: | T1 | T2,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfLast_with2Argument_findInRange(predicate as (value: | T1 | T2,) => boolean,)
        return this.#indexOfLast_with0Argument_findInRange(predicate as () => boolean,)
    }

    protected _indexOfLast_core2(predicate: BooleanCallback<| T1 | T2>, from: number, to: number,): | 0 | 1 {
        const startingIndex = __getStartingIndex(from,)
        const endingIndex = __getEndingIndex(to,)
        __validateInRange(from, startingIndex, to, endingIndex,)
        if (startingIndex === endingIndex)
            if (startingIndex === 1)
                if (predicate.length === 1)
                    return this.#indexOfLast_with1Argument_find2(predicate as (value: | T1 | T2,) => boolean,)
                else if (predicate.length >= 2)
                    return this.#indexOfLast_with2Argument_find2(predicate as (value: | T1 | T2,) => boolean,)
                else
                    return this.#indexOfLast_with0Argument_find2(predicate as () => boolean,)
            else if (predicate.length === 1)
                return this.#indexOfLast_with1Argument_find1(predicate as (value: | T1 | T2,) => boolean,)
            else if (predicate.length >= 2)
                return this.#indexOfLast_with2Argument_find1(predicate as (value: | T1 | T2,) => boolean,)
            else
                return this.#indexOfLast_with0Argument_find1(predicate as () => boolean,)
        if (predicate.length === 1)
            return this.#indexOfLast_with1Argument_findInRange(predicate as (value: | T1 | T2,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfLast_with2Argument_findInRange(predicate as (value: | T1 | T2,) => boolean,)
        return this.#indexOfLast_with0Argument_findInRange(predicate as () => boolean,)
    }

    protected _indexOfLast_coreWithNoFrom(predicate: BooleanCallback<| T1 | T2>, to: number,): | 0 | 1 {
        if (__getEndingIndex(to,) === 1)
            if (predicate.length === 1)
                return this.#indexOfLast_with1Argument_findInRange(predicate as (value: | T1 | T2,) => boolean,)
            else if (predicate.length >= 2)
                return this.#indexOfLast_with2Argument_findInRange(predicate as (value: | T1 | T2,) => boolean,)
            else
                return this.#indexOfLast_with0Argument_findInRange(predicate as () => boolean,)
        if (predicate.length === 1)
            return this.#indexOfLast_with1Argument_find1(predicate as (value: | T1 | T2,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfLast_with2Argument_find1(predicate as (value: | T1 | T2,) => boolean,)
        return this.#indexOfLast_with0Argument_find1(predicate as () => boolean,)
    }

    public override indexOfLast<const I1 extends NullableNumber, const I2 extends NullableNumber, >(predicate: BooleanCallback<| T1 | T2>, from?: I1,             to?: I2,):             IndexOf2<I1, I2>
    public override indexOfLast                                                                    (predicate: BooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): | 0 | 1
    public override indexOfLast(predicate: BooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,) {
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

    protected _indexOfLastOrNull_core0(predicate: BooleanCallback<| T1 | T2>,): NullOrNumber<| 0 | 1> {
        if (predicate.length === 1)
            return this.#indexOfLastOrNull_with1Argument_findInRange(predicate as (value: | T1 | T2,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfLastOrNull_with2Argument_findInRange(predicate as (value: | T1 | T2,) => boolean,)
        return this.#indexOfLastOrNull_with0Argument_findInRange(predicate as () => boolean,)
    }

    protected _indexOfLastOrNull_core1(predicate: BooleanCallback<| T1 | T2>, from: number,): NullOrNumber<| 0 | 1> {
        const startingIndex = __getIndexOrNull(from,)
        if (startingIndex == null)
            return null
        if (startingIndex === 1)
            if (predicate.length === 1)
                return this.#indexOfLastOrNull_with1Argument_find2(predicate as (value: | T1 | T2,) => boolean,)
            else if (predicate.length >= 2)
                return this.#indexOfLastOrNull_with2Argument_find2(predicate as (value: | T1 | T2,) => boolean,)
            else
                return this.#indexOfLastOrNull_with0Argument_find2(predicate as () => boolean,)
        if (predicate.length === 1)
            return this.#indexOfLastOrNull_with1Argument_findInRange(predicate as (value: | T1 | T2,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfLastOrNull_with2Argument_findInRange(predicate as (value: | T1 | T2,) => boolean,)
        return this.#indexOfLastOrNull_with0Argument_findInRange(predicate as () => boolean,)
    }

    protected _indexOfLastOrNull_core2(predicate: BooleanCallback<| T1 | T2>, from: number, to: number,): NullOrNumber<| 0 | 1> {
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
                    return this.#indexOfLastOrNull_with1Argument_find2(predicate as (value: | T1 | T2,) => boolean,)
                else if (predicate.length >= 2)
                    return this.#indexOfLastOrNull_with2Argument_find2(predicate as (value: | T1 | T2,) => boolean,)
                else
                    return this.#indexOfLastOrNull_with0Argument_find2(predicate as () => boolean,)
            else if (predicate.length === 1)
                return this.#indexOfLastOrNull_with1Argument_find1(predicate as (value: | T1 | T2,) => boolean,)
            else if (predicate.length >= 2)
                return this.#indexOfLastOrNull_with2Argument_find1(predicate as (value: | T1 | T2,) => boolean,)
            else
                return this.#indexOfLastOrNull_with0Argument_find1(predicate as () => boolean,)
        if (predicate.length === 1)
            return this.#indexOfLastOrNull_with1Argument_findInRange(predicate as (value: | T1 | T2,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfLastOrNull_with2Argument_findInRange(predicate as (value: | T1 | T2,) => boolean,)
        return this.#indexOfLastOrNull_with0Argument_findInRange(predicate as () => boolean,)
    }

    protected _indexOfLastOrNull_coreWithNoFrom(predicate: BooleanCallback<| T1 | T2>, to: number,): NullOrNumber<| 0 | 1> {
        const endingIndex = __getIndexOrNull(to,)
        if (endingIndex == null)
            return null
        if (endingIndex === 1)
            if (predicate.length === 1)
                return this.#indexOfLastOrNull_with1Argument_findInRange(predicate as (value: | T1 | T2,) => boolean,)
            else if (predicate.length >= 2)
                return this.#indexOfLastOrNull_with2Argument_findInRange(predicate as (value: | T1 | T2,) => boolean,)
            else
                return this.#indexOfLastOrNull_with0Argument_findInRange(predicate as () => boolean,)
        if (predicate.length === 1)
            return this.#indexOfLastOrNull_with1Argument_find1(predicate as (value: | T1 | T2,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfLastOrNull_with2Argument_find1(predicate as (value: | T1 | T2,) => boolean,)
        return this.#indexOfLastOrNull_with0Argument_find1(predicate as () => boolean,)
    }


    public override indexOfLastOrNull(predicate: BooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1> {
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

    #indexOfLastOrNull_with1Argument_findInRange(predicate: (value: | T1 | T2,) => boolean,): NullOrNumber<| 0 | 1> {
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

    protected _indexOfLastIndexed_core0(predicate: ReverseBooleanCallback<| T1 | T2>,): | 0 | 1 {
        if (predicate.length === 1)
            return this.#indexOfLastIndexed_with1Argument_findInRange(predicate as (index: number,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfLastIndexed_with2Argument_findInRange(predicate as (index: number,) => boolean,)
        return this.#indexOfLastIndexed_with0Argument_findInRange(predicate as () => boolean,)
    }

    protected _indexOfLastIndexed_core1(predicate: ReverseBooleanCallback<| T1 | T2>, from: number,): | 0 | 1 {
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

    protected _indexOfLastIndexed_core2(predicate: ReverseBooleanCallback<| T1 | T2>, from: number, to: number,): | 0 | 1 {
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

    protected _indexOfLastIndexed_coreWithNoFrom(predicate: ReverseBooleanCallback<| T1 | T2>, to: number,): | 0 | 1 {
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

    public override indexOfLastIndexed<const I1 extends NullableNumber, const I2 extends NullableNumber, >(predicate: ReverseBooleanCallback<| T1 | T2>, from?: I1,             to?: I2,):             IndexOf2<I1, I2>
    public override indexOfLastIndexed                                                                    (predicate: ReverseBooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): | 0 | 1
    public override indexOfLastIndexed(predicate: ReverseBooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,) {
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

    protected _indexOfLastIndexedOrNull_core0(predicate: ReverseBooleanCallback<| T1 | T2>,): NullOrNumber<| 0 | 1> {
        if (predicate.length === 1)
            return this.#indexOfLastIndexedOrNull_with1Argument_findInRange(predicate as (index: number,) => boolean,)
        if (predicate.length >= 2)
            return this.#indexOfLastIndexedOrNull_with2Argument_findInRange(predicate as (index: number,) => boolean,)
        return this.#indexOfLastIndexedOrNull_with0Argument_findInRange(predicate as () => boolean,)
    }

    protected _indexOfLastIndexedOrNull_core1(predicate: ReverseBooleanCallback<| T1 | T2>, from: number,): NullOrNumber<| 0 | 1> {
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

    protected _indexOfLastIndexedOrNull_core2(predicate: ReverseBooleanCallback<| T1 | T2>, from: number, to: number,): NullOrNumber<| 0 | 1> {
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

    protected _indexOfLastIndexedOrNull_coreWithNoFrom(predicate: ReverseBooleanCallback<| T1 | T2>, to: number,): NullOrNumber<| 0 | 1> {
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


    public override indexOfLastIndexedOrNull(predicate: ReverseBooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1> {
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

    #indexOfLastIndexedOrNull_with2Argument_findInRange(predicate: (index: | 0 | 1, value: | T1 | T2,) => boolean,): NullOrNumber<| 0 | 1> {
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

    public override _all(predicate: BooleanCallback<| T1 | T2>,) {
        if (predicate.length === 1)
            return (predicate as (value: | T1 | T2,) => boolean)(this.value1,) && (predicate as (value: | T1 | T2,) => boolean)(this.value2,)
        if (predicate.length >= 2)
            return predicate(this.value1, 0,) && predicate(this.value2, 1,)
        return (predicate as () => boolean)() && (predicate as () => boolean)()
    }

    //#endregion -------------------- All --------------------
    //#region -------------------- Any --------------------

    protected _any(predicate: BooleanCallback<| T1 | T2>,): boolean {
        if (predicate.length === 1)
            return (predicate as (value: | T1 | T2,) => boolean)(this.value1,) || (predicate as (value: | T1 | T2,) => boolean)(this.value2,)
        if (predicate.length >= 2)
            return predicate(this.value1, 0,) || predicate(this.value2, 1,)
        return (predicate as () => boolean)() || (predicate as () => boolean)()
    }

    //#endregion -------------------- Any --------------------
    //#region -------------------- None --------------------

    protected _none(predicate: BooleanCallback<| T1 | T2>,): boolean {
        if (predicate.length === 1)
            return !(predicate as (value: | T1 | T2,) => boolean)(this.value1,) && !(predicate as (value: | T1 | T2,) => boolean)(this.value2,)
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
        return (this.value1 as | T1 | T2) === this.value2
    }

    public override get hasNoDuplicates(): boolean {
        return (this.value1 as | T1 | T2) !== this.value2
    }

    //#endregion -------------------- Has ‥ --------------------
    //#region -------------------- Has --------------------

    public override has(value: | T1 | T2,): boolean {
        return this.value1 === value || this.value2 === value
    }

    public override hasNot(value: | T1 | T2,): boolean {
        return this.value1 !== value && this.value2 !== value
    }

    //#endregion -------------------- Has --------------------
    //#region -------------------- Has one --------------------

    protected override _hasOneByArray(values: Array<| T1 | T2>,): boolean {
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

    protected override _hasOneBySet(values: Set<| T1 | T2>,): boolean {
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

    protected override _hasOneByMinimalistCollectionHolder(values: MinimalistCollectionHolder<| T1 | T2>,): boolean {
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

    protected override _hasOneByCollectionHolder(values: CollectionHolder<| T1 | T2>,): boolean {
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

    protected override _hasOneByCollectionIterator(values: CollectionIterator<| T1 | T2>,): boolean {
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

    protected override _hasOneByIterator(values: Iterator<| T1 | T2, unknown, unknown>,): boolean {
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

    protected override _hasOneByIterable(values: Iterable<| T1 | T2, unknown, unknown>,): boolean {
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

    protected override _hasNotOneByArray(values: Array<| T1 | T2>,): boolean {
        const size = values.length
        if (size === 0)
            return false

        const value1 = this.value1
        const value2 = this.value2
        let index = -1
        while (++index < size) {
            const value = values[index] as | T1 | T2
            if (value1 === value)
                return false
            if (value2 === value)
                return false
        }
        return true
    }

    protected override _hasNotOneBySet(values: Set<| T1 | T2>,): boolean {
        const size = values.size
        if (size === 0)
            return false

        const value1 = this.value1
        const value2 = this.value2
        const iterator = values[Symbol.iterator]()
        let index = -1
        while (++index < size) {
            const value = iterator.next().value as | T1 | T2
            if (value1 === value)
                return false
            if (value2 === value)
                return false
        }
        return true
    }

    protected override _hasNotOneByMinimalistCollectionHolder(values: MinimalistCollectionHolder<| T1 | T2>,): boolean {
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

    protected override _hasNotOneByCollectionHolder(values: CollectionHolder<| T1 | T2>,): boolean {
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

    protected override _hasNotOneByCollectionIterator(values: CollectionIterator<| T1 | T2>,): boolean {
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

    protected override _hasNotOneByIterator(values: Iterator<| T1 | T2, unknown, unknown>,): boolean {
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

    protected override _hasNotOneByIterable(values: Iterable<| T1 | T2, unknown, unknown>,): boolean {
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

    protected override _hasAllByArray(values: Array<| T1 | T2>,): boolean {
        const size = values.length
        if (size === 0)
            return true

        const value1 = this.value1
        const value2 = this.value2
        let index = -1
        while (++index < size) {
            const value = values[index] as | T1 | T2
            if (value1 === value)
                continue
            if (value2 === value)
                continue
            return false
        }
        return true
    }

    protected override _hasAllBySet(values: Set<| T1 | T2>,): boolean {
        const size = values.size
        if (size === 0)
            return true

        const value1 = this.value1
        const value2 = this.value2
        const iterator = values[Symbol.iterator]()
        let index = -1
        while (++index < size) {
            const value = iterator.next().value as | T1 | T2
            if (value1 === value)
                continue
            if (value2 === value)
                continue
            return false
        }
        return true
    }

    protected override _hasAllByMinimalistCollectionHolder(values: MinimalistCollectionHolder<| T1 | T2>,): boolean {
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

    protected override _hasAllByCollectionHolder(values: CollectionHolder<| T1 | T2>,): boolean {
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

    protected override _hasAllByCollectionIterator(values: CollectionIterator<| T1 | T2>,): boolean {
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

    protected override _hasAllByIterator(values: Iterator<| T1 | T2, unknown, unknown>,): boolean {
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

    protected override _hasAllByIterable(values: Iterable<| T1 | T2, unknown, unknown>,): boolean {
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

    protected override _hasNotAllByArray(values: Array<| T1 | T2>,): boolean {
        const size = values.length
        if (size === 0)
            return false

        const value1 = this.value1
        const value2 = this.value2
        let index = -1
        while (++index < size) {
            const value = values[index] as | T1 | T2
            if (value1 === value)
                continue
            if (value2 === value)
                continue
            return true
        }
        return false
    }

    protected override _hasNotAllBySet(values: Set<| T1 | T2>,): boolean {
        const size = values.size
        if (size === 0)
            return false

        const value1 = this.value1
        const value2 = this.value2
        const iterator = values[Symbol.iterator]()
        let index = -1
        while (++index < size) {
            const value = iterator.next().value as | T1 | T2
            if (value1 === value)
                continue
            if (value2 === value)
                continue
            return true
        }
        return false
    }

    protected override _hasNotAllByMinimalistCollectionHolder(values: MinimalistCollectionHolder<| T1 | T2>,): boolean {
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

    protected override _hasNotAllByCollectionHolder(values: CollectionHolder<| T1 | T2>,): boolean {
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

    protected override _hasNotAllByCollectionIterator(values: CollectionIterator<| T1 | T2>,): boolean {
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

    protected override _hasNotAllByIterator(values: Iterator<| T1 | T2, unknown, unknown>,): boolean {
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

    protected override _hasNotAllByIterable(values: Iterable<| T1 | T2, unknown, unknown>,): boolean {
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

    public override requireNoNulls(): CollectionHolderOf2<NonNullable<T1>, NonNullable<T2>> {
        if (this.hasNull)
            throw new TypeError("Forbidden null value. The current collection contains null values.",)
        return this as CollectionHolderOf2<NonNullable<T1>, NonNullable<T2>>
    }

    //#endregion -------------------- Require no nulls --------------------

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    public override filter<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<S>
    public override filter(predicate: BooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>
    public override filter(predicate: BooleanCallback<| T1 | T2>,) {
        if (predicate.length === 1)
            return this._create0Or1Or2(() => {
                const value1 = this.value1
                const value2 = this.value2
                if ((predicate as (value: | T1 | T2,) => boolean)(value1,))
                    if ((predicate as (value: | T1 | T2,) => boolean)(value2,))
                        return this._createCouple(new Optional(value1,), new Optional(value2,),)
                    else
                        return this._createCouple(new Optional(value1,), EmptyOptional.get,)
                if ((predicate as (value: | T1 | T2,) => boolean)(value2,))
                    return this._createCouple(new Optional(value2,), EmptyOptional.get,)
                return null
            },)
        if (predicate.length >= 2)
            return this._create0Or1Or2(() => {
                const value1 = this.value1
                const value2 = this.value2
                if (predicate(value1, 0,))
                    if (predicate(value2, 1,))
                        return this._createCouple(new Optional(value1,), new Optional(value2,),)
                    else
                        return this._createCouple(new Optional(value1,), EmptyOptional.get,)
                if (predicate(value2, 1,))
                    return this._createCouple(new Optional(value2,), EmptyOptional.get,)
                return null
            },)
        return this._create0Or1Or2(() => (predicate as () => boolean)()
            ? (predicate as () => boolean)()
                ? this._createCouple(new Optional(this.value1,), new Optional(this.value2,),)
                : this._createCouple(new Optional(this.value1,), EmptyOptional.get,)
            : (predicate as () => boolean)()
                ? this._createCouple(new Optional(this.value2,), EmptyOptional.get,)
                : null,)
    }

    public override filterIndexed<const S extends | T1 | T2, >(predicate: ReverseRestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<S>
    public override filterIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>
    public override filterIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,) {
        if (predicate.length === 1)
            return this._create0Or1Or2(() => (predicate as (index: number,) => boolean)(0,)
                ? (predicate as (index: number,) => boolean)(1,)
                    ? this._createCouple(new Optional(this.value1,), new Optional(this.value2,),)
                    : this._createCouple(new Optional(this.value1,), EmptyOptional.get,)
                : (predicate as (index: number,) => boolean)(1,)
                    ? this._createCouple(new Optional(this.value2,), EmptyOptional.get,)
                    : null,)
        if (predicate.length >= 2)
            return this._create0Or1Or2(() => {
                const value1 = this.value1
                const value2 = this.value2
                if (predicate(0, value1,))
                    if (predicate(1, value2,))
                        return this._createCouple(new Optional(value1,), new Optional(value2,),)
                    else
                        return this._createCouple(new Optional(value1,), EmptyOptional.get,)
                if (predicate(1, value2,))
                    return this._createCouple(new Optional(value2,), EmptyOptional.get,)
                return null
            },)
        return this._create0Or1Or2(() => (predicate as () => boolean)()
            ? (predicate as () => boolean)()
                ? this._createCouple(new Optional(this.value1,), new Optional(this.value2,),)
                : this._createCouple(new Optional(this.value1,), EmptyOptional.get,)
            : (predicate as () => boolean)()
                ? this._createCouple(new Optional(this.value2,), EmptyOptional.get,)
                : null,)
    }


    public override filterNot<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<Exclude<| T1 | T2, S>>
    public override filterNot(predicate: BooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>
    public override filterNot(predicate: BooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2> {
        if (predicate.length === 1)
            return this._create0Or1Or2(() => {
                const value1 = this.value1
                const value2 = this.value2
                if ((predicate as (value: | T1 | T2,) => boolean)(value1,))
                    if ((predicate as (value: | T1 | T2,) => boolean)(value2,))
                        return null
                    else
                        return this._createCouple(new Optional(value2,), EmptyOptional.get,)
                if ((predicate as (value: | T1 | T2,) => boolean)(value2,))
                    return this._createCouple(new Optional(value1,), EmptyOptional.get,)
                return this._createCouple(new Optional(value1,), new Optional(value2,),)
            },)
        if (predicate.length >= 2)
            return this._create0Or1Or2(() => {
                const value1 = this.value1
                const value2 = this.value2
                if (predicate(value1, 0,))
                    if (predicate(value2, 1,))
                        return null
                    else
                        return this._createCouple(new Optional(value2,), EmptyOptional.get,)
                if (predicate(value2, 1,))
                    return this._createCouple(new Optional(value1,), EmptyOptional.get,)
                return this._createCouple(new Optional(value1,), new Optional(value2,),)
            },)
        return this._create0Or1Or2(() => (predicate as () => boolean)()
            ? (predicate as () => boolean)()
                ? null
                : this._createCouple(new Optional(this.value2,), EmptyOptional.get,)
            : (predicate as () => boolean)()
                ? this._createCouple(new Optional(this.value1,), EmptyOptional.get,)
                : this._createCouple(new Optional(this.value1,), new Optional(this.value2,),),)
    }

    public override filterNotIndexed<const S extends | T1 | T2, >(predicate: ReverseRestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<Exclude<| T1 | T2, S>>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2> {
        if (predicate.length === 1)
            return this._create0Or1Or2(() => (predicate as (index: number,) => boolean)(0,)
                ? (predicate as (index: number,) => boolean)(1,)
                    ? null
                    : this._createCouple(new Optional(this.value2,), EmptyOptional.get,)
                : (predicate as (index: number,) => boolean)(1,)
                    ? this._createCouple(new Optional(this.value1,), EmptyOptional.get,)
                    : this._createCouple(new Optional(this.value1,), new Optional(this.value2,),),)
        if (predicate.length >= 2)
            return this._create0Or1Or2(() => {
                const value1 = this.value1
                const value2 = this.value2
                if (predicate(0, value1,))
                    if (predicate(1, value2,))
                        return null
                    else
                        return this._createCouple(new Optional(value2,), EmptyOptional.get,)
                if (predicate(1, value2,))
                    return this._createCouple(new Optional(value1,), EmptyOptional.get,)
                return this._createCouple(new Optional(value1,), new Optional(value2,),)
            },)
        return this._create0Or1Or2(() => (predicate as () => boolean)()
            ? (predicate as () => boolean)()
                ? null
                : this._createCouple(new Optional(this.value2,), EmptyOptional.get,)
            : (predicate as () => boolean)()
                ? this._createCouple(new Optional(this.value1,), EmptyOptional.get,)
                : this._createCouple(new Optional(this.value1,), new Optional(this.value2,),),)
    }


    public override filterNotNull(): CollectionHolderOfAny0Or1Or2<NonNullable<T1>, NonNullable<T2>>
    public override filterNotNull() {
        const value1 = this.value1
        const value2 = this.value2
        if (value1 == null)
            if (value2 == null)
                return EmptyCollectionHolder.get
            else
                return this._create1(value2,)
        if (value2 == null)
            return this._create1(value1,)
        return this as CollectionHolderOf2<NonNullable<T1>, NonNullable<T2>>
    }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Slice --------------------

    protected override _sliceWith0Argument(): CollectionHolderOf2<T1, T2> {
        return this
    }

    protected override _sliceWith1Argument(from: number,): CollectionHolderOfLast1Or2<T1, T2> {
        const startingIndex = __getStartingIndex(from,)
        if (startingIndex == 0)
            return this
        return this._create1(this.value2,)
    }

    protected override _sliceWith2Argument(from: number, to: number,): CollectionHolderOfAny1Or2<T1, T2> {
        const startingIndex = __getStartingIndex(from,)
        const endingIndex = __getEndingIndex(to,)
        __validateInRange(from, startingIndex, to, endingIndex,)
        if (startingIndex === endingIndex)
            if (startingIndex === 0)
                return this._create1(this.value1,)
            else
                return this._create1(this.value2,)
        return this
    }

    protected override _sliceWith2ArgumentWhere1stIsNull(_: NullOrUndefined, to: number,): CollectionHolderOf1Or2<T1, T2> {
        const endingIndex = __getEndingIndex(to,)
        if (endingIndex == 0)
            return this._create1(this.value1,)
        return this
    }

    protected override _sliceByArray(indices: NumberArray,): CollectionHolder<| T1 | T2> {
        const indicesSize = indices.length
        if (indicesSize === 0)
            return EmptyCollectionHolder.get
        return this._createLazyArray(() => {
            const value1 = this.value1
            const value2 = this.value2
            const newArray = new Array<| T1 | T2>(indicesSize,)
            let index = indicesSize
            while (index-- > 0)
                if (__getIndex(indices[index]!,) === 0)
                    newArray[index] = value1
                else
                    newArray[index] = value2
            return Object.freeze(newArray,)
        },)
    }

    protected override _sliceBySet(indices: NumberSet,): CollectionHolder<| T1 | T2> {
        const indicesSize = indices.size
        if (indicesSize === 0)
            return EmptyCollectionHolder.get
        return this._createLazyArray(() => {
            const value1 = this.value1
            const value2 = this.value2
            const newArray = new Array<| T1 | T2>(indicesSize,)
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

    protected override _sliceByMinimalistCollectionHolder(indices: MinimalistCollectionHolder<number>,): CollectionHolder<| T1 | T2> {
        const indicesSize = indices.size
        if (indicesSize === 0)
            return EmptyCollectionHolder.get
        return this._createLazyArray(() => {
            const value1 = this.value1
            const value2 = this.value2
            const newArray = new Array<| T1 | T2>(indicesSize,)
            let index = indicesSize
            while (index-- > 0)
                if (__getIndex(indices.get(index,),) === 0)
                    newArray[index] = value1
                else
                    newArray[index] = value2
            return Object.freeze(newArray,)
        },)
    }

    protected override _sliceByCollectionHolder(indices: CollectionHolder<number>,): CollectionHolder<| T1 | T2> {
        if (indices.isEmpty)
            return EmptyCollectionHolder.get
        return this._createLazyArray(() => {
            const value1 = this.value1
            const value2 = this.value2
            const indicesSize = indices.size
            const newArray = new Array<| T1 | T2>(indicesSize,)
            let index = indicesSize
            while (index-- > 0)
                if (__getIndex(indices.get(index,),) === 0)
                    newArray[index] = value1
                else
                    newArray[index] = value2
            return Object.freeze(newArray,)
        },)
    }

    protected override _sliceByCollectionIterator(indices: CollectionIterator<number>,): CollectionHolder<| T1 | T2> {
        if (indices.isEmpty)
            return EmptyCollectionHolder.get
        return this._createLazyArray(() => {
            const value1 = this.value1
            const value2 = this.value2
            const indicesSize = indices.size
            const newArray = new Array<| T1 | T2>(indicesSize,)
            let index = indicesSize
            while (index-- > 0)
                if (__getIndex(indices.previousValue,) === 0)
                    newArray[index] = value1
                else
                    newArray[index] = value2
            return Object.freeze(newArray,)
        },)
    }

    protected override _sliceByIterator(indices: Iterator<number, unknown, unknown>,): CollectionHolder<| T1 | T2> {
        let iteratorResult = indices.next()
        if (iteratorResult.done)
            return EmptyCollectionHolder.get
        return this._createLazyArray(() => {
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

    protected override _sliceByIterable(indices: Iterable<number, unknown, unknown>,): CollectionHolder<| T1 | T2> {
        const iterator = indices[Symbol.iterator]()
        let iteratorResult = iterator.next()
        if (iteratorResult.done)
            return EmptyCollectionHolder.get
        return this._createLazyArray(() => {
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

    public override take(n: number,): CollectionHolderOf0Or1Or2<T1, T2> {
        if (Number.isNaN(n,))
            throw new ForbiddenIndexException("Forbidden index. The number cannot be determined with NaN.", n,)
        if (n === Number.NEGATIVE_INFINITY)
            return EmptyCollectionHolder.get
        if (n === Number.POSITIVE_INFINITY)
            return this
        if (n === 0)
            return EmptyCollectionHolder.get
        if (n === 1)
            return this._create1(this.value1,)
        if (n === 2)
            return this
        if (n > 2)
            return this
        if (n === -1)
            return this._create1(this.value1,)
        return EmptyCollectionHolder.get
    }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Take while --------------------

    public override takeWhile<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<S>
    public override takeWhile(predicate: BooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>
    public override takeWhile(predicate: BooleanCallback<| T1 | T2>,) {
        if (predicate.length === 1)
            return this._create0Or1Or2(() => this.#takeWhile1(predicate as (value: | T1 | T2,) => boolean,),)
        if (predicate.length >= 2)
            return this._create0Or1Or2(() => this.#takeWhile2(predicate,),)
        return this._create0Or1Or2(() => this.#takeWhile0(predicate as () => boolean,),)
    }

    #takeWhile0(predicate: () => boolean,): NullOr<Couple<Optional<T1>, Optional<T2>>> {
        if (predicate())
            if (predicate())
                return this._createCouple(new Optional(this.value1,), new Optional(this.value2,),)
            else
                return this._createCouple(new Optional(this.value1,), EmptyOptional.get,)
        return null
    }

    #takeWhile1(predicate: (value: | T1 | T2,) => boolean,): NullOr<Couple<Optional<T1>, Optional<T2>>> {
        const value1 = this.value1
        if (!predicate(value1,))
            return null

        const value2 = this.value2
        if (predicate(value2,))
            return this._createCouple(new Optional(value1,), new Optional(value2,),)
        return this._createCouple(new Optional(value1,), EmptyOptional.get,)
    }

    #takeWhile2(predicate: (value: | T1 | T2, index: | 0 | 1,) => boolean,): NullOr<Couple<Optional<T1>, Optional<T2>>> {
        const value1 = this.value1
        if (!predicate(value1, 0,))
            return null

        const value2 = this.value2
        if (predicate(value2, 1,))
            return this._createCouple(new Optional(value1,), new Optional(value2,),)
        return this._createCouple(new Optional(value1,), EmptyOptional.get,)
    }

    //#endregion -------------------- Take while --------------------
    //#region -------------------- Take while indexed --------------------

    public override takeWhileIndexed<const S extends | T1 | T2, >(predicate: ReverseRestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<S>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,) {
        if (predicate.length === 1)
            return this._create0Or1Or2(() => this.#takeWhileIndexed1(predicate as (index: number,) => boolean,),)
        if (predicate.length >= 2)
            return this._create0Or1Or2(() => this.#takeWhileIndexed2(predicate,),)
        return this._create0Or1Or2(() => this.#takeWhileIndexed0(predicate as () => boolean,),)
    }

    #takeWhileIndexed0(predicate: () => boolean,): NullOr<Couple<Optional<T1>, Optional<T2>>> {
        if (predicate())
            if (predicate())
                return this._createCouple(new Optional(this.value1,), new Optional(this.value2,),)
            else
                return this._createCouple(new Optional(this.value1,), EmptyOptional.get,)
        return null
    }

    #takeWhileIndexed1(predicate: (index: | 0 | 1,) => boolean,): NullOr<Couple<Optional<T1>, Optional<T2>>> {
        if (predicate(0,))
            if (predicate(1,))
                return this._createCouple(new Optional(this.value1,), new Optional(this.value2,),)
            else
                return this._createCouple(new Optional(this.value1,), EmptyOptional.get,)
        return null
    }

    #takeWhileIndexed2(predicate: (index: | 0 | 1, value: | T1 | T2,) => boolean,): NullOr<Couple<Optional<T1>, Optional<T2>>> {
        const value1 = this.value1
        if (!predicate(0, value1,))
            return null

        const value2 = this.value2
        if (predicate(1, value2,))
            return this._createCouple(new Optional(value1,), new Optional(value2,),)
        return this._createCouple(new Optional(value1,), EmptyOptional.get,)
    }

    //#endregion -------------------- Take while indexed --------------------

    //#region -------------------- Take last --------------------

    public override takeLast(n: number,): CollectionHolderOfLast0Or1Or2<T1, T2> {
        if (Number.isNaN(n,))
            throw new ForbiddenIndexException("Forbidden index. The number cannot be determined with NaN.", n,)
        if (n === Number.NEGATIVE_INFINITY)
            return EmptyCollectionHolder.get
        if (n === Number.POSITIVE_INFINITY)
            return this
        if (n === 0)
            return EmptyCollectionHolder.get
        if (n === 1)
            return this._create1(this.value2,)
        if (n === 2)
            return this
        if (n > 2)
            return this
        if (n === -1)
            return this._create1(this.value2,)
        return EmptyCollectionHolder.get
    }

    //#endregion -------------------- Take last --------------------
    //#region -------------------- Take last while --------------------

    public override takeLastWhile<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<S>
    public override takeLastWhile(predicate: BooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>
    public override takeLastWhile(predicate: BooleanCallback<| T1 | T2>,) {
        if (predicate.length === 1)
            return this._create0Or1Or2(() => this.#takeLastWhile1(predicate as (value: | T1 | T2,) => boolean,),)
        if (predicate.length >= 2)
            return this._create0Or1Or2(() => this.#takeLastWhile2(predicate,),)
        return this._create0Or1Or2(() => this.#takeLastWhile0(predicate as () => boolean,),)
    }

    #takeLastWhile0(predicate: () => boolean,): NullOr<Couple<Optional<| T1 | T2>, Optional<T2>>> {
        if (predicate())
            if (predicate())
                return this._createCouple(new Optional(this.value1,), new Optional(this.value2,),)
            else
                return this._createCouple(new Optional(this.value2,), EmptyOptional.get,)
        return null
    }

    #takeLastWhile1(predicate: (value: | T1 | T2,) => boolean,): NullOr<Couple<Optional<| T1 | T2>, Optional<T2>>> {
        const value2 = this.value2
        if (!predicate(value2,))
            return null

        const value1 = this.value1
        if (predicate(value1,))
            return this._createCouple(new Optional(value1,), new Optional(value2,),)
        return this._createCouple(new Optional(value2,), EmptyOptional.get,)
    }

    #takeLastWhile2(predicate: (value: | T1 | T2, index: | 0 | 1,) => boolean,): NullOr<Couple<Optional<| T1 | T2>, Optional<T2>>> {
        const value2 = this.value2
        if (!predicate(value2, 1,))
            return null

        const value1 = this.value1
        if (predicate(value1, 0,))
            return this._createCouple(new Optional(value1,), new Optional(value2,),)
        return this._createCouple(new Optional(value2,), EmptyOptional.get,)
    }

    //#endregion -------------------- Take last while --------------------
    //#region -------------------- Take last while indexed --------------------

    public override takeLastWhileIndexed<const S extends | T1 | T2, >(predicate: ReverseRestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<S>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,) {
        if (predicate.length === 1)
            return this._create0Or1Or2(() => this.#takeLastWhileIndexed1(predicate as (index: number,) => boolean,),)
        if (predicate.length >= 2)
            return this._create0Or1Or2(() => this.#takeLastWhileIndexed2(predicate,),)
        return this._create0Or1Or2(() => this.#takeLastWhileIndexed0(predicate as () => boolean,),)
    }

    #takeLastWhileIndexed0(predicate: () => boolean,): NullOr<Couple<Optional<| T1 | T2>, Optional<T2>>> {
        if (predicate())
            if (predicate())
                return this._createCouple(new Optional(this.value1,), new Optional(this.value2,),)
            else
                return this._createCouple(new Optional(this.value2,), EmptyOptional.get,)
        return null
    }

    #takeLastWhileIndexed1(predicate: (index: | 0 | 1,) => boolean,): NullOr<Couple<Optional<| T1 | T2>, Optional<T2>>> {
        if (predicate(1,))
            if (predicate(0,))
                return this._createCouple(new Optional(this.value1,), new Optional(this.value2,),)
            else
                return this._createCouple(new Optional(this.value2,), EmptyOptional.get,)
        return null
    }

    #takeLastWhileIndexed2(predicate: (index: | 0 | 1, value: | T1 | T2,) => boolean,): NullOr<Couple<Optional<| T1 | T2>, Optional<T2>>> {
        const value2 = this.value2
        if (!predicate(1, value2,))
            return null

        const value1 = this.value1
        if (predicate(0, value1,))
            return this._createCouple(new Optional(value1,), new Optional(value2,),)
        return this._createCouple(new Optional(value2,), EmptyOptional.get,)
    }

    //#endregion -------------------- Take last while indexed --------------------

    //#endregion -------------------- Take --------------------
    //#region -------------------- Drop --------------------

    //#region -------------------- Drop --------------------

    public override drop(n: number,): CollectionHolderOfLast0Or1Or2<T1, T2> {
        if (Number.isNaN(n,))
            throw new ForbiddenIndexException("Forbidden index. The number cannot be determined with NaN.", n,)
        if (n === Number.NEGATIVE_INFINITY)
            return this
        if (n === Number.POSITIVE_INFINITY)
            return EmptyCollectionHolder.get
        if (n === 0)
            return this
        if (n === 1)
            return this._create1(this.value2,)
        if (n === 2)
            return EmptyCollectionHolder.get
        if (n > 2)
            return EmptyCollectionHolder.get
        if (n === -1)
            return this._create1(this.value2,)
        return this
    }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Drop while --------------------

    public override dropWhile<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<S>
    public override dropWhile(predicate: BooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>
    public override dropWhile(predicate: BooleanCallback<| T1 | T2>,) {
        if (predicate.length === 1)
            return this._create0Or1Or2(() => this.#dropWhile1(predicate as (value: | T1 | T2,) => boolean,),)
        if (predicate.length >= 2)
            return this._create0Or1Or2(() => this.#dropWhile2(predicate,),)
        return this._create0Or1Or2(() => this.#dropWhile0(predicate as () => boolean,),)
    }

    #dropWhile0(predicate: () => boolean,): NullOr<Couple<Optional<| T1 | T2>, Optional<T2>>> {
        if (predicate())
            if (predicate())
                return null
            else
                return this._createCouple(new Optional(this.value2,), EmptyOptional.get,)
        return this._createCouple(new Optional(this.value1,), new Optional(this.value2,),)
    }

    #dropWhile1(predicate: (value: | T1 | T2,) => boolean,): NullOr<Couple<Optional<| T1 | T2>, Optional<T2>>> {
        const value1 = this.value1
        if (!predicate(value1,))
            return this._createCouple(new Optional(value1,), new Optional(this.value2,),)

        const value2 = this.value2
        if (predicate(value2,))
            return null
        return this._createCouple(new Optional(value2,), EmptyOptional.get,)
    }

    #dropWhile2(predicate: (value: | T1 | T2, index: | 0 | 1,) => boolean,): NullOr<Couple<Optional<| T1 | T2>, Optional<T2>>> {
        const value1 = this.value1
        if (!predicate(value1, 0,))
            return this._createCouple(new Optional(value1,), new Optional(this.value2,),)

        const value2 = this.value2
        if (predicate(value2, 1,))
            return null
        return this._createCouple(new Optional(value2,), EmptyOptional.get,)
    }

    //#endregion -------------------- Drop while --------------------
    //#region -------------------- Drop while indexed --------------------

    public override dropWhileIndexed<const S extends | T1 | T2, >(predicate: ReverseRestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<S>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,) {
        if (predicate.length === 1)
            return this._create0Or1Or2(() => this.#dropWhileIndexed1(predicate as (index: number,) => boolean,),)
        if (predicate.length >= 2)
            return this._create0Or1Or2(() => this.#dropWhileIndexed2(predicate,),)
        return this._create0Or1Or2(() => this.#dropWhileIndexed0(predicate as () => boolean,),)
    }

    #dropWhileIndexed0(predicate: () => boolean,): NullOr<Couple<Optional<| T1 | T2>, Optional<T2>>> {
        if (predicate())
            if (predicate())
                return null
            else
                return this._createCouple(new Optional(this.value2,), EmptyOptional.get,)
        return this._createCouple(new Optional(this.value1,), new Optional(this.value2,),)
    }

    #dropWhileIndexed1(predicate: (index: | 0 | 1,) => boolean,): NullOr<Couple<Optional<| T1 | T2>, Optional<T2>>> {
        if (predicate(0,))
            if (predicate(1,))
                return null
            else
                return this._createCouple(new Optional(this.value2,), EmptyOptional.get,)
        return this._createCouple(new Optional(this.value1,), new Optional(this.value2,),)
    }

    #dropWhileIndexed2(predicate: (index: | 0 | 1, value: | T1 | T2,) => boolean,): NullOr<Couple<Optional<| T1 | T2>, Optional<T2>>> {
        const value1 = this.value1
        if (!predicate(0, value1,))
            return this._createCouple(new Optional(value1,), new Optional(this.value2,),)

        const value2 = this.value2
        if (predicate(1, value2,))
            return null
        return this._createCouple(new Optional(value2,), EmptyOptional.get,)
    }

    //#endregion -------------------- Drop while indexed --------------------

    //#region -------------------- Drop last --------------------

    public override dropLast(n: number,): CollectionHolderOf0Or1Or2<T1, T2> {
        if (Number.isNaN(n,))
            throw new ForbiddenIndexException("Forbidden index. The number cannot be determined with NaN.", n,)
        if (n === Number.NEGATIVE_INFINITY)
            return this
        if (n === Number.POSITIVE_INFINITY)
            return EmptyCollectionHolder.get
        if (n === 0)
            return this
        if (n === 1)
            return this._create1(this.value1,)
        if (n === 2)
            return EmptyCollectionHolder.get
        if (n > 2)
            return EmptyCollectionHolder.get
        if (n === -1)
            return this._create1(this.value1,)
        return this
    }

    //#endregion -------------------- Drop last --------------------
    //#region -------------------- Drop last while --------------------

    public override dropLastWhile<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<S>
    public override dropLastWhile(predicate: BooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>
    public override dropLastWhile(predicate: BooleanCallback<| T1 | T2>,) {
        if (predicate.length === 1)
            return this._create0Or1Or2(() => this.#dropLastWhile1(predicate as (value: | T1 | T2,) => boolean,),)
        if (predicate.length >= 2)
            return this._create0Or1Or2(() => this.#dropLastWhile2(predicate,),)
        return this._create0Or1Or2(() => this.#dropLastWhile0(predicate as () => boolean,),)
    }

    #dropLastWhile0(predicate: () => boolean,): NullOr<Couple<Optional<T1>, Optional<T2>>> {
        if (predicate())
            if (predicate())
                return null
            else
                return this._createCouple(new Optional(this.value1,), EmptyOptional.get,)
        return this._createCouple(new Optional(this.value1,), new Optional(this.value2,),)
    }

    #dropLastWhile1(predicate: (value: | T1 | T2,) => boolean,): NullOr<Couple<Optional<T1>, Optional<T2>>> {
        const value1 = this.value1
        const value2 = this.value2
        if (predicate(value2,))
            if (predicate(value1,))
                return null
            else
                return this._createCouple(new Optional(value1,), EmptyOptional.get,)
        return this._createCouple(new Optional(value1,), new Optional(value2,),)
    }

    #dropLastWhile2(predicate: (value: | T1 | T2, index: | 0 | 1,) => boolean,): NullOr<Couple<Optional<T1>, Optional<T2>>> {
        const value1 = this.value1
        const value2 = this.value2
        if (predicate(value2, 1,))
            if (predicate(value1, 0,))
                return null
            else
                return this._createCouple(new Optional(value1,), EmptyOptional.get,)
        return this._createCouple(new Optional(value1,), new Optional(value2,),)
    }

    //#endregion -------------------- Drop last while --------------------
    //#region -------------------- Drop last while indexed --------------------

    public override dropLastWhileIndexed<const S extends | T1 | T2, >(predicate: ReverseRestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<S>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,) {
        if (predicate.length === 1)
            return this._create0Or1Or2(() => this.#dropLastWhileIndexed1(predicate as (index: number,) => boolean,),)
        if (predicate.length >= 2)
            return this._create0Or1Or2(() => this.#dropLastWhileIndexed2(predicate,),)
        return this._create0Or1Or2(() => this.#dropLastWhileIndexed0(predicate as () => boolean,),)
    }

    #dropLastWhileIndexed0(predicate: () => boolean,): NullOr<Couple<Optional<T1>, Optional<T2>>> {
        if (predicate())
            if (predicate())
                return null
            else
                return this._createCouple(new Optional(this.value1,), EmptyOptional.get,)
        return this._createCouple(new Optional(this.value1,), new Optional(this.value2,),)
    }

    #dropLastWhileIndexed1(predicate: (index: | 0 | 1,) => boolean,): NullOr<Couple<Optional<T1>, Optional<T2>>> {
        if (predicate(1,))
            if (predicate(0,))
                return null
            else
                return this._createCouple(new Optional(this.value1,), EmptyOptional.get,)
        return this._createCouple(new Optional(this.value1,), new Optional(this.value2,),)
    }

    #dropLastWhileIndexed2(predicate: (index: | 0 | 1, value: | T1 | T2,) => boolean,): NullOr<Couple<Optional<T1>, Optional<T2>>> {
        const value1 = this.value1
        const value2 = this.value2
        if (predicate(1, value2,))
            if (predicate(0, value1,))
                return null
            else
                return this._createCouple(new Optional(value1,), EmptyOptional.get,)
        return this._createCouple(new Optional(value1,), new Optional(value2,),)
    }

    //#endregion -------------------- Drop last while indexed --------------------

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Map --------------------

    public override map<const U, >(transform: ValueIndexWithReturnCallback<| T1 | T2, U>,): CollectionHolderOf2<U, U> {
        if (transform.length === 1)
            return this._createLazy2(() => this._createCouple((transform as (value: | T1 | T2,) => U)(this.value1,), (transform as (value: | T1 | T2,) => U)(this.value2,),),)
        if (transform.length >= 2)
            return this._createLazy2(() => this._createCouple(transform(this.value1, 0,), transform(this.value2, 1,),),)
        return this._createLazy2(() => this._createCouple((transform as () => U)(), (transform as () => U)(),),)
    }

    public override mapIndexed<const U, >(transform: IndexValueWithReturnCallback<| T1 | T2, U>,): CollectionHolderOf2<U, U> {
        if (transform.length === 1)
            return this._createLazy2(() => this._createCouple((transform as (index: number,) => U)(0,), (transform as (index: number,) => U)(1,),),)
        if (transform.length >= 2)
            return this._createLazy2(() => this._createCouple(transform(0, this.value1,),transform(1, this.value2,),),)
        return this._createLazy2(() => this._createCouple((transform as () => U)(), (transform as () => U)(),),)
    }


    public override mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<| T1 | T2, Nullable<U>>,): CollectionHolder<U> {
        if (transform.length === 1)
            return this._create0Or1Or2(() => {
                const newValue1 = (transform as (value: | T1 | T2,) => Nullable<U>)(this.value1,)
                const newValue2 = (transform as (value: | T1 | T2,) => Nullable<U>)(this.value2,)
                if (newValue1 == null)
                    if (newValue2 == null)
                        return null
                    else
                        return this._createCouple(new Optional(newValue2,), EmptyOptional.get,)
                if (newValue2 == null)
                    return this._createCouple(new Optional(newValue1,), EmptyOptional.get,)
                return this._createCouple(new Optional(newValue1,), new Optional(newValue2,),)
            },)
        if (transform.length >= 2)
            return this._create0Or1Or2(() => {
                const newValue1 = transform(this.value1, 0,)
                const newValue2 = transform(this.value2, 1,)
                if (newValue1 == null)
                    if (newValue2 == null)
                        return null
                    else
                        return this._createCouple(new Optional(newValue2,), EmptyOptional.get,)
                if (newValue2 == null)
                    return this._createCouple(new Optional(newValue1,), EmptyOptional.get,)
                return this._createCouple(new Optional(newValue1,), new Optional(newValue2,),)
            },)
        return this._create0Or1Or2(() => {
            const newValue1 = (transform as () => Nullable<U>)()
            const newValue2 = (transform as () => Nullable<U>)()
            if (newValue1 == null)
                if (newValue2 == null)
                    return null
                else
                    return this._createCouple(new Optional(newValue2,), EmptyOptional.get,)
            if (newValue2 == null)
                return this._createCouple(new Optional(newValue1,), EmptyOptional.get,)
            return this._createCouple(new Optional(newValue1,), new Optional(newValue2,),)
        },)
    }

    public override mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<| T1 | T2, Nullable<U>>,): CollectionHolder<U> {
        if (transform.length === 1)
            return this._create0Or1Or2(() => {
                const newValue1 = (transform as (index: number,) => Nullable<U>)(0,)
                const newValue2 = (transform as (index: number,) => Nullable<U>)(1,)
                if (newValue1 == null)
                    if (newValue2 == null)
                        return null
                    else
                        return this._createCouple(new Optional(newValue2,), EmptyOptional.get,)
                if (newValue2 == null)
                    return this._createCouple(new Optional(newValue1,), EmptyOptional.get,)
                return this._createCouple(new Optional(newValue1,), new Optional(newValue2,),)
            },)
        if (transform.length >= 2)
            return this._create0Or1Or2(() => {
                const newValue1 = transform(0, this.value1,)
                const newValue2 = transform(1, this.value2,)
                if (newValue1 == null)
                    if (newValue2 == null)
                        return null
                    else
                        return this._createCouple(new Optional(newValue2,), EmptyOptional.get,)
                if (newValue2 == null)
                    return this._createCouple(new Optional(newValue1,), EmptyOptional.get,)
                return this._createCouple(new Optional(newValue1,), new Optional(newValue2,),)
            },)
        return this._create0Or1Or2(() => {
            const newValue1 = (transform as () => Nullable<U>)()
            const newValue2 = (transform as () => Nullable<U>)()
            if (newValue1 == null)
                if (newValue2 == null)
                    return null
                else
                    return this._createCouple(new Optional(newValue2,), EmptyOptional.get,)
            if (newValue2 == null)
                return this._createCouple(new Optional(newValue1,), EmptyOptional.get,)
            return this._createCouple(new Optional(newValue1,), new Optional(newValue2,),)
        },)
    }

    //#endregion -------------------- Map --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- For each --------------------

    public override forEach(action: ValueIndexCallback<| T1 | T2>,): void {
        if (action.length === 1) {
            (action as (value: | T1 | T2,) => void)(this.value1,);
            (action as (value: | T1 | T2,) => void)(this.value2,)
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

    public override forEachIndexed(action: IndexValueCallback<| T1 | T2>,): void {
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

    public override onEach(action: ValueIndexCallback<| T1 | T2>,): this {
        if (action.length === 1) {
            (action as (value: | T1 | T2,) => void)(this.value1,);
            (action as (value: | T1 | T2,) => void)(this.value2,)
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

    public override onEachIndexed(action: IndexValueCallback<| T1 | T2>,): this {
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

    public override toReverse                                                                    (                                          ): CollectionHolderOf2<T2, T1>
    public override toReverse<const I1 extends NullableNumber, >                                 (from: I1,                                 ): ToReverse_from<T1, T2, I1>
    public override toReverse                                                                    (from: NullableNumber,                     ): CollectionHolderOf1Or2<T2, T1>
    public override toReverse<                                 const I2 extends NullableNumber, >(from: NullOrUndefined, to: I2,            ): ToReverse_to<T1, T2, I2>
    public override toReverse                                                                    (from: NullOrUndefined, to: NullableNumber,): CollectionHolderOf1Or2<T2, T1>
    public override toReverse<const I1 extends NullableNumber, const I2 extends NullableNumber, >(from: I1,              to: I2,            ): ToReverse_fromTo<T1, T2, I1, I2>
    public override toReverse                                                                    (from: NullableNumber,  to: NullableNumber,): CollectionHolderOfAny1Or2<T2, T1>
    public override toReverse(from?: NullableNumber, to?: NullableNumber,) {
        if (to == null)
            if (from == null)
                return this._toReverse_core0()
            else
                return this._toReverse_core1(from,)
        if (from == null)
            return this._toReverse_coreWithNoFrom(to,)
        return this._toReverse_core2(from, to,)
    }


    protected _toReverse_core0(): CollectionHolderOf2<T2, T1> { return this._create2(this.value2, this.value1,) }

    protected _toReverse_core1(from: number,): CollectionHolderOf1Or2<T2, T1> {
        if (__getStartingIndex(from,) === 0)
            return this._create2(this.value2, this.value1,)
        return this._create1(this.value2,)
    }

    protected _toReverse_core2(from: number, to: number,): CollectionHolderOfAny1Or2<T2, T1> {
        const startingIndex = __getStartingIndex(from,)
        const endingIndex = __getEndingIndex(to,)
        __validateInRange(from, startingIndex, to, endingIndex,)
        if (startingIndex === endingIndex)
            if (startingIndex === 0)
                return this._create1(this.value1,)
            else
                return this._create1(this.value2,)
        return this._create2(this.value2, this.value1,)
    }

    protected _toReverse_coreWithNoFrom(to: number,): CollectionHolderOfLast1Or2<T2, T1> {
        if (__getEndingIndex(to,) === 0)
            return this._create1(this.value1,)
        return this._create2(this.value2, this.value1,)
    }

    //#endregion -------------------- To reverse --------------------

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- Conversion methods --------------------

    //#region -------------------- To other structure --------------------

    public override toIterator(): CollectionIteratorOf2<T1, T2> {
        return new DualValueCollectionIterator(this.value1, this.value2,)
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

    protected _joinToString_truncatedTransform(separator: string, prefix: string, postfix: string, truncated: string, transform: StringCallback<| T1 | T2>,) {
        if (transform.length === 1)
            return `${prefix}${(transform as (value: | T1 | T2,) => string)(this.value1,)}${separator}${truncated}${postfix}`
        if (transform.length >= 2)
            return `${prefix}${transform(this.value1, 0,)}${separator}${truncated}${postfix}`
        return `${prefix}${(transform as () => string)()}${separator}${truncated}${postfix}`
    }

    protected _joinToString_transform(separator: string, prefix: string, postfix: string, transform: StringCallback<| T1 | T2>,) {
        if (transform.length === 1)
            return `${prefix}${(transform as (value: | T1 | T2,) => string)(this.value1,)}${separator}${(transform as (value: | T1 | T2,) => string)(this.value2,)}${postfix}`
        if (transform.length >= 2)
            return `${prefix}${transform(this.value1, 0,)}${separator}${transform(this.value2, 1,)}${postfix}`
        return `${prefix}${(transform as () => string)()}${separator}${(transform as () => string)()}${postfix}`
    }


    public override joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<| T1 | T2>>,): string {
        if (transform == null)
            if (limit == null)
                return this._joinToString_core(separator ?? ", ", prefix ?? '[', postfix ?? ']',)
            else {
                const lastIndex = __getLastIndex(limit,)
                if (lastIndex === 0)
                    return this._joinToString_truncated0(prefix ?? '[', postfix ?? ']', truncated ?? '…',)
                if (lastIndex === 1)
                    return this._joinToString_truncated1(separator ?? ", ", prefix ?? '[', postfix ?? ']', truncated ?? '…',)
                return this._joinToString_core(separator ?? ", ", prefix ?? '[', postfix ?? ']',)
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

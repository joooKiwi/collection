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

import type {Array, MutableNumberKeyMap, MutableSet, Nullable, NullableNumber, NullableString, NullOr, NullOrUndefined, NullOrZeroNumber, NumberArray, NumberKeyMap, NumberSet, Set} from "@joookiwi/type"

import type {CollectionHolder}                                                                                                                                                                                                                                                  from "./CollectionHolder"
import type {MinimalistCollectionHolder}                                                                                                                                                                                                                                        from "./MinimalistCollectionHolder"
import type {CollectionIterator}                                                                                                                                                                                                                                                from "./iterator/CollectionIterator"
import type {BooleanCallback, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, RestrainedBooleanCallback, ReturnCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, StringCallback, ValueIndexCallback, ValueIndexWithReturnCallback} from "./type/callback"
import type {PossibleIterableIteratorArraySetOrCollectionHolder}                                                                                                                                                                                                                from "./type/possibleInstance"

import {AbstractUnimplementedCollectionHolder}                                                                            from "./AbstractUnimplementedCollectionHolder"
import {EmptyCollectionHolder}                                                                                            from "./EmptyCollectionHolder"
import {LateRetriever}                                                                                                    from "./LateRetriever"
import {LazyCollectionHolder}                                                                                             from "./LazyCollectionHolder"
import {LazyCollectionHolderOf0Or1}                                                                                       from "./LazyCollectionHolderOf0Or1"
import {CollectionIteratorOf1}                                                                                            from "./iterator/CollectionIteratorOf1"
import {ForbiddenIndexException}                                                                                          from "./exception/ForbiddenIndexException"
import {IndexOutOfBoundsException}                                                                                        from "./exception/IndexOutOfBoundsException"
import {IndexNotFoundException}                                                                                           from "./exception/IndexNotFoundException"
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

/**
 * A {@link CollectionHolder} having a single value.
 * No state or reference is held in this instance.
 *
 * Most of the methods are being optimized for a single value comparison
 * instead of using the extension function.
 *
 * @see AbstractCollectionHolder
 * @see AbstractCollectionHolderOf2
 * @see CollectionHolderOf1
 * @see LazyCollectionHolderOf1
 * @see ArrayOf1AsCollectionHolder
 * @see SetOf1AsCollectionHolder
 */
export abstract class AbstractCollectionHolderOf1<const T = unknown, >
    extends AbstractUnimplementedCollectionHolder<T> {

    //#region -------------------- Fields --------------------

    /** The only value of the current instance */
    public abstract readonly 0: T

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    protected constructor() { super() }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Validate methods (private) --------------------

    /**
     * Validate if the value is either `null`, 0 or -1
     *
     * @param from The value to validate
     * @throws IndexOutOfBoundsException The value is equal or over 1 (before or after calculation)
     * @throws ForbiddenIndexException   The value is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     */
    #validateStartingIndex(from: NullableNumber,): void {
        if (from == null)
            return

        if (Number.isNaN(from,))
            throw new ForbiddenIndexException("Forbidden index. The starting index cannot be an index with NaN.", from,)
        if (from === Number.NEGATIVE_INFINITY)
            throw new ForbiddenIndexException("Forbidden index. The starting index cannot be an index with -∞.", from,)
        if (from === Number.POSITIVE_INFINITY)
            throw new ForbiddenIndexException("Forbidden index. The starting index cannot be an index with +∞.", from,)

        if (from === 0)
            return
        if (from === -1)
            return

        if (from > 1)
            throw new IndexOutOfBoundsException(`Index out of bound. The starting index “${from}” is over the collection size “1”.`, from,)
        if (from === 1)
            throw new IndexOutOfBoundsException(`Index out of bound. The starting index “${from}” is the collection size “1”.`, from,)
        throw new IndexOutOfBoundsException(`Index out of bound. The starting index “${from}” (“${from + 1}” after calculation) is under 0.`, from,)
    }

    /**
     * Validate if the value is either `null`, 0 or -1
     *
     * @param to The value to validate
     * @throws IndexOutOfBoundsException The value is equal or over 1 (before or after calculation)
     * @throws ForbiddenIndexException   The value is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     */
    #validateEndingIndex(to: NullableNumber,): void {
        if (to == null)
            return

        if (Number.isNaN(to,))
            throw new ForbiddenIndexException("Forbidden index. The ending index cannot be an index with NaN.", to,)
        if (to === Number.NEGATIVE_INFINITY)
            throw new ForbiddenIndexException("Forbidden index. The ending index cannot be an index with -∞.", to,)
        if (to === Number.POSITIVE_INFINITY)
            throw new ForbiddenIndexException("Forbidden index. The ending index cannot be an index with +∞.", to,)

        if (to === 0)
            return
        if (to === -1)
            return

        if (to > 1)
            throw new IndexOutOfBoundsException(`Index out of bound. The ending index “${to}” is over the collection size “1”.`, to,)
        if (to === 1)
            throw new IndexOutOfBoundsException(`Index out of bound. The ending index “${to}” is the collection size “1”.`, to,)
        throw new IndexOutOfBoundsException(`Index out of bound. The ending index “${to}” (“${to + 1}” after calculation) is under 0.`, to,)
    }

    /**
     * Get the last possible index as either 0 or 1
     *
     * @param limit The limit to trimmed (if applicable)
     * @throws ForbiddenIndexException The {@link limit} is {@link Number.NaN NaN}
     */
    #getLastIndex(limit: number,): | 0 | 1 {
        if (Number.isNaN(limit,))
            throw new ForbiddenIndexException("Forbidden index. The value cannot be determined with NaN.", limit,)
        if (limit === Number.NEGATIVE_INFINITY)
            return 0
        if (limit === Number.POSITIVE_INFINITY)
            return 1
        if (limit >= 1)
            return 1
        return 0
    }

    /**
     * Tell if the value is either `null`, 0 or -1
     *
     * @param value The value to compare
     */
    #isIndexValid(value: NullableNumber,): value is Nullable<| -1 | 0> {
        if (value == null)
            return true
        if (value === 0)
            return true
        return value === -1
    }

    //#endregion -------------------- Validate methods (private) --------------------

    //#region -------------------- Reference methods --------------------

    /** The only value of the current instance */
    public abstract get value(): T

    //#endregion -------------------- Reference methods --------------------
    //#region -------------------- Size methods --------------------

    public override get size(): 1 { return 1 }

    public override get isEmpty(): false { return false }
    public override get isNotEmpty(): true { return true }

    public override get hasExactly1Element(): true { return true }
    public override get hasAtMost1Element(): true { return true }

    public override get hasAtLeast2Elements(): false { return false }
    public override get hasExactly2Elements(): false { return false }
    public override get hasAtMost2Elements(): true { return true }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    public override get<const I extends number, >(index: I,): I extends | 0 | -1 ? T : never
    public override get(index: number,) {
        if (Number.isNaN(index,))
            throw new ForbiddenIndexException("Forbidden index. The index cannot be NaN.", index,)
        if (index === Number.NEGATIVE_INFINITY)
            throw new ForbiddenIndexException("Forbidden index. The index cannot be -∞.", index,)
        if (index === Number.POSITIVE_INFINITY)
            throw new ForbiddenIndexException("Forbidden index. The index cannot be +∞.", index,)

        if (index in this)
            return this.value

        if (index === 0)
            return this.value
        if (index === -1)
            return this.value
        if (index > 1)
            throw new IndexOutOfBoundsException(`Index out of bound. The index “${index}” is over the size of the collection (1).`, index,)
        if (index === 1)
            throw new IndexOutOfBoundsException(`Index out of bound. The index “${index}” is the size of the collection (1).`, index,)
        throw new IndexOutOfBoundsException(`Index out of bound. The index “${index}” (${index + 1} after calculation) is under 0.`, index,)
    }

    public override getFirst(): T { return this.value }

    public override getLast(): T { return this.value }


    public override getOrElse<const U, const I extends number, >(index: I, defaultValue: IndexWithReturnCallback<U>,): I extends | 0 | -1 ? T : U
    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public override getOrElse<const I extends number, >(index: I, defaultValue: IndexWithReturnCallback<T>,): T
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) {
        if (index === 0)
            return this.value
        if (index === -1)
            return this.value
        return defaultValue(index,)
    }

    public override getFirstOrElse<const U, >(defaultValue: ReturnCallback<U>,): T
    public override getFirstOrElse(defaultValue: ReturnCallback<T>,): T
    public override getFirstOrElse() { return this.value }

    public override getLastOrElse<const U, >(defaultValue: ReturnCallback<U>,): T
    public override getLastOrElse(defaultValue: ReturnCallback<T>,): T
    public override getLastOrElse() { return this.value }


    public override getOrNull<const I extends number, >(index: I,): I extends | 0 | -1 ? T : null
    public override getOrNull(index: number,) {
        if (index === 0)
            return this.value
        if (index === -1)
            return this.value
        return null
    }

    public override getFirstOrNull(): T { return this.value }

    public override getLastOrNull(): T { return this.value }

    //#endregion -------------------- Get --------------------
    //#region -------------------- Find first --------------------

    public override findFirst<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public override findFirst(predicate: BooleanCallback<T>,): T
    public override findFirst(predicate: BooleanCallback<T>,) {
        if (predicate.length === 1) {
            const value = this.value
            if ((predicate as (value: T,) => boolean)(value,))
                return value
            throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findFirst” predicate received in the collection.", 0,)
        }
        if (predicate.length >= 2) {
            const value = this.value
            if (predicate(value, 0,))
                return value
            throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findFirst” predicate received in the collection.", 0,)
        }

        if ((predicate as () => boolean)())
            return this.value
        throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findFirst” predicate received in the collection.", 0,)
    }

    public override findFirstOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findFirstOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public override findFirstOrNull(predicate: BooleanCallback<T>,) {
        if (predicate.length === 1) {
            const value = this.value
            if ((predicate as (value: T,) => boolean)(value,))
                return value
            return null
        }
        if (predicate.length >= 2) {
            const value = this.value
            if (predicate(value, 0,))
                return value
            return null
        }

        if ((predicate as () => boolean)())
            return this.value
        return null
    }

    public override findFirstIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public override findFirstIndexed(predicate: ReverseBooleanCallback<T>,): T
    public override findFirstIndexed(predicate: ReverseBooleanCallback<T>,) {
        if (predicate.length === 1)
            if ((predicate as (index: number,) => boolean)(0,))
                return this.value
            else
                throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findFirstIndexed” predicate received in the collection.", 0,)
        if (predicate.length >= 2) {
            const value = this.value
            if (predicate(0, value,))
                return value
            throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findFirstIndexed” predicate received in the collection.", 0,)
        }

        if ((predicate as () => boolean)())
            return this.value
        throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findFirstIndexed” predicate received in the collection.", 0,)
    }

    public override findFirstIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,) {
        if (predicate.length === 1)
            if ((predicate as (index: number,) => boolean)(0,))
                return this.value
            else
                return null
        if (predicate.length >= 2) {
            const value = this.value
            if (predicate(0, value,))
                return value
            return null
        }

        if ((predicate as () => boolean)())
            return this.value
        return null
    }

    //#endregion -------------------- Find first --------------------
    //#region -------------------- Find last --------------------

    public override findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public override findLast(predicate: BooleanCallback<T>,): T
    public override findLast(predicate: BooleanCallback<T>,) {
        if (predicate.length === 1) {
            const value = this.value
            if ((predicate as (value: T,) => boolean)(value,))
                return value
            throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findLast” predicate received in the collection.", 0,)
        }
        if (predicate.length >= 2) {
            const value = this.value
            if (predicate(value, 0,))
                return value
            throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findLast” predicate received in the collection.", 0,)
        }

        if ((predicate as () => boolean)())
            return this.value
        throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findLast” predicate received in the collection.", 0,)
    }

    public override findLastOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public override findLastOrNull(predicate: BooleanCallback<T>,) {
        if (predicate.length === 1) {
            const value = this.value
            if ((predicate as (value: T,) => boolean)(value,))
                return value
            return null
        }
        if (predicate.length >= 2) {
            const value = this.value
            if (predicate(value, 0,))
                return value
            return null
        }

        if ((predicate as () => boolean)())
            return this.value
        return null
    }

    public override findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,): T
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,) {
        if (predicate.length === 1)
            if ((predicate as (index: number,) => boolean)(0,))
                return this.value
            else
                throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findLastIndexed” predicate received in the collection.", 0,)
        if (predicate.length >= 2) {
            const value = this.value
            if (predicate(0, value,))
                return value
            throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findLastIndexed” predicate received in the collection.", 0,)
        }

        if ((predicate as () => boolean)())
            return this.value
        throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findLastIndexed” predicate received in the collection.", 0,)
    }

    public override findLastIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,) {
        if (predicate.length === 1)
            if ((predicate as (index: number,) => boolean)(0,))
                return this.value
            else
                return null
        if (predicate.length >= 2) {
            const value = this.value
            if (predicate(0, value,))
                return value
            return null
        }

        if ((predicate as () => boolean)())
            return this.value
        return null
    }

    //#endregion -------------------- Find last --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    public override firstIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,): 0 {
        this.#validateStartingIndex(from,)
        this.#validateEndingIndex(to,)
        if (this.value === element)
            return 0
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“0”) to the ending (“0”) indexes in the collection.`, 1,)
    }

    public override firstIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber {
        if (!this.#isIndexValid(from,))
            return null
        if (!this.#isIndexValid(to,))
            return null
        if (this.value === element)
            return 0
        return null
    }


    public override lastIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,): 0 {
        return this.firstIndexOf(element, from, to,)
    }

    public override lastIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber {
        return this.firstIndexOfOrNull(element, from, to,)
    }


    public override indexOfFirst(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): 0 {
        this.#validateStartingIndex(from,)
        this.#validateEndingIndex(to,)

        if (predicate.length === 1)
            if ((predicate as (value: T,) => boolean)(this.value,))
                return 0
            else
                throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“0”) to the ending (“0”) indexes in the collection.`, 1,)
        if (predicate.length >= 2)
            if (predicate(this.value, 0,))
                return 0
            else
                throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“0”) to the ending (“0”) indexes in the collection.`, 1,)
        if ((predicate as () => boolean)())
            return 0
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“0”) to the ending (“0”) indexes in the collection.`, 1,)
    }

    public override indexOfFirstOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber {
        if (!this.#isIndexValid(from,))
            return null
        if (!this.#isIndexValid(to,))
            return null

        if (predicate.length === 1)
            if ((predicate as (value: T,) => boolean)(this.value,))
                return 0
            else
                return null
        if (predicate.length >= 2)
            if (predicate(this.value, 0,))
                return 0
            else
                return null
        if ((predicate as () => boolean)())
            return 0
        return null
    }

    public override indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): 0 {
        this.#validateStartingIndex(from,)
        this.#validateEndingIndex(to,)

        if (predicate.length === 1)
            if ((predicate as (index: number,) => boolean)(0,))
                return 0
            else
                throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“0”) to the ending (“0”) indexes in the collection.`, 1,)
        if (predicate.length >= 2)
            if (predicate(0, this.value,))
                return 0
            else
                throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“0”) to the ending (“0”) indexes in the collection.`, 1,)
        if ((predicate as () => boolean)())
            return 0
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“0”) to the ending (“0”) indexes in the collection.`, 1,)
    }

    public override indexOfFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber {
        if (!this.#isIndexValid(from,))
            return null
        if (!this.#isIndexValid(to,))
            return null

        if (predicate.length === 1)
            if ((predicate as (index: number,) => boolean)(0,))
                return 0
            else
                return null
        if (predicate.length >= 2)
            if (predicate(0, this.value,))
                return 0
            else
                return null
        if ((predicate as () => boolean)())
            return 0
        return null
    }


    public override indexOfLast(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): 0 {
        return this.indexOfFirst(predicate, from, to,)
    }

    public override indexOfLastOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber {
        return this.indexOfFirstOrNull(predicate, from, to,)
    }

    public override indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): 0 {
        return this.indexOfFirstIndexed(predicate, from, to,)
    }

    public override indexOfLastIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber {
        return this.indexOfFirstIndexedOrNull(predicate, from, to,)
    }

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    //#region -------------------- All --------------------

    public override all<S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolder<S>
    public override all(predicate: BooleanCallback<T>,): boolean
    public override all(predicate: BooleanCallback<T>,) {
        if (predicate.length === 1)
            return (predicate as (value: T,) => boolean)(this.value,)
        if (predicate.length >= 2)
            return predicate(this.value, 0,)
        return (predicate as () => boolean)()
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
            return (predicate as (value: T,) => boolean)(this.value,)
        if (predicate.length >= 2)
            return predicate(this.value, 0,)
        return (predicate as () => boolean)()
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
            return !(predicate as (value: T,) => boolean)(this.value,)
        if (predicate.length >= 2)
            return !predicate(this.value, 0,)
        return !(predicate as () => boolean)()
    }

    //#endregion -------------------- None --------------------

    //#region -------------------- Has ‥ --------------------

    public override get hasNull(): boolean {
        return this.value == null
    }

    public override get hasNoNulls(): boolean {
        return this.value != null
    }


    public override get hasDuplicate(): false {
        return false
    }

    public override get hasNoDuplicates(): true {
        return true
    }

    //#endregion -------------------- Has ‥ --------------------
    //#region -------------------- Has --------------------

    public override has(value: T,): boolean {
        return this.value === value
    }

    public override hasNot(value: T,): boolean {
        return this.value !== value
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

        const value = this.value
        let index = -1
        while (++index < size)
            if (value === values[index])
                return true
        return false
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasOne CollectionHolder.hasOne(values: Set<T>)} */
    protected _hasOneBySet(values: Set<T>,): boolean {
        const size = values.size
        if (size === 0)
            return true

        const value = this.value
        const iterator = values[Symbol.iterator]()
        let index = -1
        while (++index < size)
            if (value === iterator.next().value)
                return true
        return false
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasOne CollectionHolder.hasOne(values: MinimalistCollectionHolder<T>)} */
    protected _hasOneByMinimalistCollectionHolder(values: MinimalistCollectionHolder<T>,): boolean {
        const size = values.size
        if (size === 0)
            return true

        const value = this.value
        let index = -1
        while (++index < size)
            if (value === values.get(index,))
                return true
        return false
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasOne CollectionHolder.hasOne(values: CollectionHolder<T>)} */
    protected _hasOneByCollectionHolder(values: CollectionHolder<T>,): boolean {
        if (values.isEmpty)
            return true

        const value = this.value
        const size = values.size
        let index = -1
        while (++index < size)
            if (value === values.get(index,))
                return true
        return false
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasOne CollectionHolder.hasOne(values: CollectionIterator<T>)} */
    protected _hasOneByCollectionIterator(values: CollectionIterator<T>,): boolean {
        if (values.isEmpty)
            return true

        const value = this.value
        const size = values.size
        let index = -1
        while (++index < size)
            if (value === values.nextValue)
                return true
        return false
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasOne CollectionHolder.hasOne(values: Iterator<T>)} */
    protected _hasOneByIterator(values: Iterator<T, unknown, unknown>,): boolean {
        let iteratorResult = values.next()
        if (iteratorResult.done)
            return true

        const value = this.value
        if (value === iteratorResult.value)
            return true
        while (!(iteratorResult = values.next()).done)
            if (value === iteratorResult.value)
                return true
        return false
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasOne CollectionHolder.hasOne(values: Iterable<T>)} */
    protected _hasOneByIterable(values: Iterable<T, unknown, unknown>,): boolean {
        const iterator = values[Symbol.iterator]()
        let iteratorResult = iterator.next()
        if (iteratorResult.done)
            return true

        const value = this.value
        if (value === iteratorResult.value)
            return true
        while (!(iteratorResult = iterator.next()).done)
            if (value === iteratorResult.value)
                return true
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
        if (isCollectionHolderByStructure<T>(values))
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

        const value = this.value
        let index = -1
        while (++index < size)
            if (value === values[index])
                return false
        return true
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotOne CollectionHolder.hasNotOne(values: Set<T>)} */
    protected _hasNotOneBySet(values: Set<T>,): boolean {
        const size = values.size
        if (size === 0)
            return false

        const value = this.value
        const iterator = values[Symbol.iterator]()
        let index = -1
        while (++index < size)
            if (value === iterator.next().value)
                return false
        return true
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotOne CollectionHolder.hasNotOne(values: MinimalistCollectionHolder<T>)} */
    protected _hasNotOneByMinimalistCollectionHolder(values: MinimalistCollectionHolder<T>,): boolean {
        const size = values.size
        if (size === 0)
            return false

        const value = this.value
        let index = -1
        while (++index < size)
            if (value === values.get(index,))
                return false
        return true
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotOne CollectionHolder.hasNotOne(values: CollectionHolder<T>)} */
    protected _hasNotOneByCollectionHolder(values: CollectionHolder<T>,): boolean {
        if (values.isEmpty)
            return false

        const value = this.value
        const size = values.size
        let index = -1
        while (++index < size)
            if (value === values.get(index,))
                return false
        return true
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotOne CollectionHolder.hasNotOne(values: CollectionIterator<T>)} */
    protected _hasNotOneByCollectionIterator(values: CollectionIterator<T>,): boolean {
        if (values.isEmpty)
            return false

        const value = this.value
        const size = values.size
        let index = -1
        while (++index < size)
            if (value === values.nextValue)
                return false
        return true
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotOne CollectionHolder.hasNotOne(values: Iterator<T>)} */
    protected _hasNotOneByIterator(values: Iterator<T, unknown, unknown>,): boolean {
        let iteratorResult = values.next()
        if (iteratorResult.done)
            return false

        const value = this.value
        if (value === iteratorResult.value)
            return false
        while (!(iteratorResult = values.next()).done)
            if (value === iteratorResult.value)
                return false
        return true
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotOne CollectionHolder.hasNotOne(values: Iterable<T>)} */
    protected _hasNotOneByIterable(values: Iterable<T, unknown, unknown>,): boolean {
        const iterator = values[Symbol.iterator]()
        let iteratorResult = iterator.next()
        if (iteratorResult.done)
            return false

        const value = this.value
        if (value === iteratorResult.value)
            return false
        while (!(iteratorResult = iterator.next()).done)
            if (value === iteratorResult.value)
                return false
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

        if (isArrayByStructure<T>(values,))
            return this._hasAllByArray(values,)
        if (isSetByStructure<T>(values,))
            return this._hasAllBySet(values,)
        if (isCollectionHolderByStructure<T>(values,))
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

        const value = this.value
        let index = -1
        while (++index < size)
            if (value !== values[index])
                return false
        return true
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasAll CollectionHolder.hasAll(values: Set<T>)} */
    protected _hasAllBySet(values: Set<T>,): boolean {
        const size = values.size
        if (size === 0)
            return true

        const value = this.value
        const iterator = values[Symbol.iterator]()
        let index = -1
        while (++index < size)
            if (value !== iterator.next().value)
                return false
        return true
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasAll CollectionHolder.hasAll(values: MinimalistCollectionHolder<T>)} */
    protected _hasAllByMinimalistCollectionHolder(values: MinimalistCollectionHolder<T>,): boolean {
        const size = values.size
        if (size === 0)
            return true

        const value = this.value
        let index = -1
        while (++index < size)
            if (value !== values.get(index,))
                return false
        return true
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasAll CollectionHolder.hasAll(values: CollectionHolder<T>)} */
    protected _hasAllByCollectionHolder(values: CollectionHolder<T>,): boolean {
        if (values.isEmpty)
            return true

        const value = this.value
        const size = values.size
        let index = -1
        while (++index < size)
            if (value !== values.get(index,))
                return false
        return true
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasAll CollectionHolder.hasAll(values: CollectionIterator<T>)} */
    protected _hasAllByCollectionIterator(values: CollectionIterator<T>,): boolean {
        if (values.isEmpty)
            return true

        const value = this.value
        const size = values.size
        let index = -1
        while (++index < size)
            if (value !== values.nextValue)
                return false
        return true
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasAll CollectionHolder.hasAll(values: Iterator<T>)} */
    protected _hasAllByIterator(values: Iterator<T, unknown, unknown>,): boolean {
        let iteratorResult = values.next()
        if (iteratorResult.done)
            return true

        const value = this.value
        if (value !== iteratorResult.value)
            return false

        while (!(iteratorResult = values.next()).done)
            if (value !== iteratorResult.value)
                return false
        return true
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasAll CollectionHolder.hasAll(values: Iterable<T>)} */
    protected _hasAllByIterable(values: Iterable<T, unknown, unknown>,): boolean {
        const iterator = values[Symbol.iterator]()
        let iteratorResult = iterator.next()
        if (iteratorResult.done)
            return true

        const value = this.value
        if (value !== iteratorResult.value)
            return false

        while (!(iteratorResult = iterator.next()).done)
            if (value !== iteratorResult.value)
                return false
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

        const value = this.value
        let index = -1
        while (++index < size)
            if (value !== values[index])
                return true
        return false
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotAll CollectionHolder.hasNotAll(values: Set<T>)} */
    protected _hasNotAllBySet(values: Set<T>,): boolean {
        const size = values.size
        if (size === 0)
            return false

        const value = this.value
        const iterator = values[Symbol.iterator]()
        let index = -1
        while (++index < size)
            if (value !== iterator.next().value)
                return true
        return false
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotAll CollectionHolder.hasNotAll(values: MinimalistCollectionHolder<T>)} */
    protected _hasNotAllByMinimalistCollectionHolder(values: MinimalistCollectionHolder<T>,): boolean {
        const size = values.size
        if (size === 0)
            return false

        const value = this.value
        let index = -1
        while (++index < size)
            if (value !== values.get(index,))
                return true
        return false
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotAll CollectionHolder.hasNotAll(values: CollectionHolder<T>)} */
    protected _hasNotAllByCollectionHolder(values: CollectionHolder<T>,): boolean {
        if (values.isEmpty)
            return false

        const value = this.value
        const size = values.size
        let index = -1
        while (++index < size)
            if (value !== values.get(index,))
                return true
        return false
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotAll CollectionHolder.hasNotAll(values: CollectionIterator<T>)} */
    protected _hasNotAllByCollectionIterator(values: CollectionIterator<T>,): boolean {
        if (values.isEmpty)
            return false

        const value = this.value
        const size = values.size
        let index = -1
        while (++index < size)
            if (value !== values.nextValue)
                return true
        return false
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotAll CollectionHolder.hasNotAll(values: Iterator<T>)} */
    protected _hasNotAllByIterator(values: Iterator<T, unknown, unknown>,): boolean {
        let iteratorResult = values.next()
        if (iteratorResult.done)
            return false

        const value = this.value
        if (value !== iteratorResult.value)
            return true

        while (!(iteratorResult = values.next()).done)
            if (value !== iteratorResult.value)
                return true
        return false
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotAll CollectionHolder.hasNotAll(values: Iterable<T>)} */
    protected _hasNotAllByIterable(values: Iterable<T, unknown, unknown>,): boolean {
        const iterator = values[Symbol.iterator]()
        let iteratorResult = iterator.next()
        if (iteratorResult.done)
            return false

        const value = this.value
        if (value !== iteratorResult.value)
            return true

        while (!(iteratorResult = iterator.next()).done)
            if (value !== iteratorResult.value)
                return true
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
            return new LazyCollectionHolderOf0Or1(() => {
                const value = this.value
                if ((predicate as (value: T,) => boolean)(value,))
                    return new Optional(value,)
                return EmptyOptional.get
            },)
        if (predicate.length >= 2)
            return new LazyCollectionHolderOf0Or1(() => {
                const value = this.value
                if (predicate(value, 0,))
                    return new Optional(value,)
                return EmptyOptional.get
            },)
        return new LazyCollectionHolderOf0Or1(() => (predicate as () => boolean)() ? new Optional(this.value,) : EmptyOptional.get,)
    }

    public override filterIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,) {
        if (predicate.length === 1)
            return new LazyCollectionHolderOf0Or1(() => (predicate as (index: number,) => boolean)(0,) ? new Optional(this.value,) : EmptyOptional.get,)
        if (predicate.length >= 2)
            return new LazyCollectionHolderOf0Or1(() => {
                const value = this.value
                if (predicate(0, value,))
                    return new Optional(value,)
                return EmptyOptional.get
            },)
        return new LazyCollectionHolderOf0Or1(() => (predicate as () => boolean)() ? new Optional(this.value,) : EmptyOptional.get,)
    }


    public override filterNot<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T> {
        if (predicate.length === 1)
            return new LazyCollectionHolderOf0Or1(() => {
                const value = this.value
                if ((predicate as (value: T,) => boolean)(value,))
                    return EmptyOptional.get
                return new Optional(value,)
            },)
        if (predicate.length >= 2)
            return new LazyCollectionHolderOf0Or1(() => {
                const value = this.value
                if (predicate(value, 0,))
                    return EmptyOptional.get
                return new Optional(value,)
            },)
        return new LazyCollectionHolderOf0Or1(() => (predicate as () => boolean)() ? EmptyOptional.get : new Optional(this.value,),)
    }

    public override filterNotIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T> {
        if (predicate.length === 1)
            return new LazyCollectionHolderOf0Or1(() => (predicate as (index: number,) => boolean)(0,) ? EmptyOptional.get : new Optional(this.value,),)
        if (predicate.length >= 2)
            return new LazyCollectionHolderOf0Or1(() => {
                const value = this.value
                if (predicate(0, value,))
                    return EmptyOptional.get
                return new Optional(value,)
            },)
        return new LazyCollectionHolderOf0Or1(() => (predicate as () => boolean)() ? EmptyOptional.get : new Optional(this.value,),)
    }


    public override filterNotNull(): CollectionHolder<NonNullable<T>> {
        if (this.value == null)
            return EmptyCollectionHolder.get
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
    public override slice(indices: IteratorObject<number, unknown, unknown>,): CollectionHolder<T>
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
    protected _sliceWith0Argument(): CollectionHolder<T> {
        return new LateRetriever.LazyCollectionHolderOf1(() => this.value,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice(from)} */
    protected _sliceWith1Argument(from: number,): CollectionHolder<T> {
        this.#validateStartingIndex(from,)
        return new LateRetriever.LazyCollectionHolderOf1(() => this.value,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice(from, to)} */
    protected _sliceWith2Argument(from: number, to: number,): CollectionHolder<T> {
        this.#validateStartingIndex(from,)
        this.#validateEndingIndex(to,)
        return new LateRetriever.LazyCollectionHolderOf1(() => this.value,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice(null, to)} */
    protected _sliceWith2ArgumentWhere1stIsNull(_: NullOrUndefined, to: number,): CollectionHolder<T> {
        this.#validateEndingIndex(to,)
        return new LateRetriever.LazyCollectionHolderOf1(() => this.value,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice(indices: NumberArray)} */
    protected _sliceByArray(indices: NumberArray,): CollectionHolder<T> {
        const indicesSize = indices.length
        if (indicesSize === 0)
            return EmptyCollectionHolder.get
        return new LazyCollectionHolder(() => {
            const newArray = new Array<T>(indicesSize,)
            let index = indicesSize
            while (index-- > 0)
                newArray[index] = this.get(indices[index]!,)
            return Object.freeze(newArray,)
        },)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice(indices: NumberSet)} */
    protected _sliceBySet(indices: NumberSet,): CollectionHolder<T> {
        const indicesSize = indices.size
        if (indicesSize === 0)
            return EmptyCollectionHolder.get
        return new LazyCollectionHolder(() => {
            const newArray = new Array<T>(indicesSize,)
            const iterator = indices[Symbol.iterator]()
            let index = -1
            while (++index < indicesSize)
                newArray[index] = this.get(iterator.next().value!,)
            return Object.freeze(newArray,)
        },)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice(indices: MinimalistCollectionHolder<number>)} */
    protected _sliceByMinimalistCollectionHolder(indices: MinimalistCollectionHolder<number>,): CollectionHolder<T> {
        const indicesSize = indices.size
        if (indicesSize === 0)
            return EmptyCollectionHolder.get
        return new LazyCollectionHolder(() => {
            const newArray = new Array<T>(indicesSize,)
            let index = indicesSize
            while (index-- > 0)
                newArray[index] = this.get(indices.get(index,),)
            return Object.freeze(newArray,)
        },)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice(indices: CollectionHolder<number>)} */
    protected _sliceByCollectionHolder(indices: CollectionHolder<number>,): CollectionHolder<T> {
        if (indices.isEmpty)
            return EmptyCollectionHolder.get
        return new LazyCollectionHolder(() => {
            const indicesSize = indices.size
            const newArray = new Array<T>(indicesSize,)
            let index = indicesSize
            while (index-- > 0)
                newArray[index] = this.get(indices.get(index,),)
            return Object.freeze(newArray,)
        },)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice(indices: CollectionIterator<number>)} */
    protected _sliceByCollectionIterator(indices: CollectionIterator<number>,): CollectionHolder<T> {
        if (indices.isEmpty)
            return EmptyCollectionHolder.get
        return new LazyCollectionHolder(() => {
            const indicesSize = indices.size
            const newArray = new Array<T>(indicesSize,)
            let index = indicesSize
            while (index-- > 0)
                newArray[index] = this.get(indices.previousValue,)
            return Object.freeze(newArray,)
        },)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice(indices: Iterator<number>)} */
    protected _sliceByIterator(indices: Iterator<number, unknown, unknown>,): CollectionHolder<T> {
        let iteratorResult = indices.next()
        if (iteratorResult.done)
            return EmptyCollectionHolder.get
        return new LazyCollectionHolder(() => {
            const newArray = [this.get(iteratorResult.value as number,),]
            while (!(iteratorResult = indices.next()).done)
                newArray.push(this.get(iteratorResult.value!,),)
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
            const newArray = [this.get(iteratorResult.value as number,),]
            while (!(iteratorResult = iterator.next()).done)
                newArray.push(this.get(iteratorResult.value!,),)
            return Object.freeze(newArray,)
        },)
    }

    //#endregion -------------------- Slice --------------------
    //#region -------------------- Take --------------------

    public override take(n: number,): | this | EmptyCollectionHolder {
        if (Number.isNaN(n,))
            throw new ForbiddenIndexException("Forbidden index. The number cannot be determined with NaN.", n,)
        if (n === Number.NEGATIVE_INFINITY)
            return EmptyCollectionHolder.get
        if (n === Number.POSITIVE_INFINITY)
            return this
        if (n === 0)
            return EmptyCollectionHolder.get
        if (n === 1)
            return this
        if (n > 0)
            return this
        if (n <= -1)
            return EmptyCollectionHolder.get
        return this
    }

    public override takeWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override takeWhile(predicate: BooleanCallback<T>,) {
        if (predicate.length === 1)
            return new LazyCollectionHolderOf0Or1(() => {
                const value = this.value
                if ((predicate as (value: T,) => boolean)(value,))
                    return new Optional(value,)
                return EmptyOptional.get
            },)
        if (predicate.length >= 2)
            return new LazyCollectionHolderOf0Or1(() => {
                const value = this.value
                if (predicate(value, 0,))
                    return new Optional(value,)
                return EmptyOptional.get
            },)
        return new LazyCollectionHolderOf0Or1(() => (predicate as () => boolean)() ? new Optional(this.value,) : EmptyOptional.get,)
    }

    public override takeWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        if (predicate.length === 1)
            return new LazyCollectionHolderOf0Or1(() => (predicate as (index: number,) => boolean)(0,) ? new Optional(this.value,) : EmptyOptional.get,)
        if (predicate.length >= 2)
            return new LazyCollectionHolderOf0Or1(() => {
                const value = this.value
                if (predicate(0, value,))
                    return new Optional(value,)
                return EmptyOptional.get
            },)
        return new LazyCollectionHolderOf0Or1(() => (predicate as () => boolean)() ? new Optional(this.value,) : EmptyOptional.get,)
    }


    public override takeLast(n: number,): | this | EmptyCollectionHolder {
        return this.take(n,)
    }

    public override takeLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override takeLastWhile(predicate: BooleanCallback<T>,) {
        return this.takeWhile(predicate,)
    }

    public override takeLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return this.takeWhileIndexed(predicate,)
    }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Drop --------------------

    public override drop(n: number,): | this | EmptyCollectionHolder {
        if (Number.isNaN(n,))
            throw new ForbiddenIndexException("Forbidden index. The number cannot be determined with NaN.", n,)
        if (n === Number.NEGATIVE_INFINITY)
            return this
        if (n === Number.POSITIVE_INFINITY)
            return EmptyCollectionHolder.get
        if (n === 0)
            return this
        if (n === 1)
            return EmptyCollectionHolder.get
        if (n > 0)
            return EmptyCollectionHolder.get
        if (n <= -1)
            return this
        return EmptyCollectionHolder.get
    }

    public override dropWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override dropWhile(predicate: BooleanCallback<T>,) {
        if (predicate.length === 1)
            return new LazyCollectionHolderOf0Or1(() => {
                const value = this.value
                if ((predicate as (value: T,) => boolean)(value,))
                    return EmptyOptional.get
                return new Optional(value,)
            },)
        if (predicate.length >= 2)
            return new LazyCollectionHolderOf0Or1(() => {
                const value = this.value
                if (predicate(value, 0,))
                    return EmptyOptional.get
                return new Optional(value,)
            },)
        return new LazyCollectionHolderOf0Or1(() => (predicate as () => boolean)() ? EmptyOptional.get : new Optional(this.value,),)
    }

    public override dropWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        if (predicate.length === 1)
            return new LazyCollectionHolderOf0Or1(() => {
                const value = this.value
                if ((predicate as (index: number,) => boolean)(0,))
                    return EmptyOptional.get
                return new Optional(value,)
            },)
        if (predicate.length >= 2)
            return new LazyCollectionHolderOf0Or1(() => {
                const value = this.value
                if (predicate(0, value,))
                    return EmptyOptional.get
                return new Optional(value,)
            },)
        return new LazyCollectionHolderOf0Or1(() => (predicate as () => boolean)() ? EmptyOptional.get : new Optional(this.value,),)
    }


    public override dropLast(n: number,): | this | EmptyCollectionHolder {
        return this.drop(n,)
    }

    public override dropLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override dropLastWhile(predicate: BooleanCallback<T>,) {
        return this.dropWhile(predicate,)
    }

    public override dropLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return this.dropWhileIndexed(predicate,)
    }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Map --------------------

    public override map<const U, >(transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U> {
        if (transform.length === 1)
            return new LateRetriever.LazyCollectionHolderOf1(() => (transform as (value: T,) => U)(this.value,),)
        if (transform.length >= 2)
            return new LateRetriever.LazyCollectionHolderOf1(() => transform(this.value, 0,),)
        return new LateRetriever.LazyCollectionHolderOf1(() => (transform as () => U)(),)
    }

    public override mapIndexed<const U, >(transform: IndexValueWithReturnCallback<T, U>,): CollectionHolder<U> {
        if (transform.length === 1)
            return new LateRetriever.LazyCollectionHolderOf1(() => (transform as (index: number,) => U)(0,),)
        if (transform.length >= 2)
            return new LateRetriever.LazyCollectionHolderOf1(() => transform(0, this.value,),)
        return new LateRetriever.LazyCollectionHolderOf1(() => (transform as () => U)(),)
    }


    public override mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        if (transform.length === 1)
            return new LazyCollectionHolderOf0Or1(() => {
                const newValue = (transform as (value: T,) => Nullable<U>)(this.value,)
                if (newValue == null)
                    return EmptyOptional.get
                return new Optional(newValue,)
            },)
        if (transform.length >= 2)
            return new LazyCollectionHolderOf0Or1(() => {
                const newValue = transform(this.value, 0,)
                if (newValue == null)
                    return EmptyOptional.get
                return new Optional(newValue,)
            },)
        return new LazyCollectionHolderOf0Or1(() => {
            const newValue = (transform as () => Nullable<U>)()
            if (newValue == null)
                return EmptyOptional.get
            return new Optional(newValue,)
        },)
    }

    public override mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        if (transform.length === 1)
            return new LazyCollectionHolderOf0Or1(() => {
                const newValue = (transform as (index: number,) => Nullable<U>)(0,)
                if (newValue == null)
                    return EmptyOptional.get
                return new Optional(newValue,)
            },)
        if (transform.length >= 2)
            return new LazyCollectionHolderOf0Or1(() => {
                const newValue = transform(0, this.value,)
                if (newValue == null)
                    return EmptyOptional.get
                return new Optional(newValue,)
            },)
        return new LazyCollectionHolderOf0Or1(() => {
            const newValue = (transform as () => Nullable<U>)()
            if (newValue == null)
                return EmptyOptional.get
            return new Optional(newValue,)
        },)
    }

    //#endregion -------------------- Map --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- For each --------------------

    public override forEach(action: ValueIndexCallback<T>,): void {
        if (action.length === 1)
            (action as (value: T,) => void)(this.value,)
        else if (action.length >= 2)
            action(this.value, 0,)
        else
            (action as () => void)()
    }

    public override forEachIndexed(action: IndexValueCallback<T>,): void {
        if (action.length === 1)
            (action as (index: number,) => void)(0,)
        else if (action.length >= 2)
            action(0, this.value,)
        else
            (action as () => void)()
    }

    //#endregion -------------------- For each --------------------
    //#region -------------------- On each --------------------

    public override onEach(action: ValueIndexCallback<T>,): this {
        if (action.length === 1)
            (action as (value: T,) => void)(this.value,)
        else if (action.length >= 2)
            action(this.value, 0,)
        else
            (action as () => void)()
        return this
    }

    public override onEachIndexed(action: IndexValueCallback<T>,): this {
        if (action.length === 1)
            (action as (index: number,) => void)(0,)
        else if (action.length >= 2)
            action(0, this.value,)
        else
            (action as () => void)()
        return this
    }

    //#endregion -------------------- On each --------------------

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    //#region -------------------- To reverse --------------------

    public override toReverse(from?: NullableNumber, to?: NullableNumber,): this {
        this.#validateStartingIndex(from,)
        this.#validateEndingIndex(to,)
        return this
    }

    //#endregion -------------------- To reverse --------------------

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- JavaScript methods --------------------

    public override [Symbol.iterator](): CollectionIteratorOf1<T> {
        return this.toIterator()
    }

    //#endregion -------------------- JavaScript methods --------------------
    //#region -------------------- Conversion methods --------------------

    //#region -------------------- To other structure --------------------

    public override toIterator(): CollectionIteratorOf1<T> { return new CollectionIteratorOf1(this.value,) }

    public override toArray(): readonly [T,] {
        return Object.freeze([this.value,],)
    }

    public override toMutableArray(): [T,] {
        return [this.value,]
    }

    public override toSet(): Set<T> {
        return Object.freeze(new Set([this.value,],),)
    }

    public override toMutableSet(): MutableSet<T> {
        return new Set([this.value,],)
    }

    public override toMap(): NumberKeyMap<T, 0> {
        return Object.freeze(new Map<0, T>([[0, this.value,],],),)
    }

    public override toMutableMap(): MutableNumberKeyMap<T, 0> {
        return new Map([[0, this.value,],],)
    }

    //#endregion -------------------- To other structure --------------------
    //#region -------------------- To string --------------------

    public override toString(): string {
        return `[${asString(this.value,)}]`
    }

    public override toLocaleString(locale?: NullableString,): string {
        return `[${asLocaleString(this.value, locale,)}]`
    }


    public override toLowerCaseString(): string {
        return `[${asLowerCaseString(this.value,)}]`
    }

    public override toLocaleLowerCaseString(locale?: NullableString,): string {
        return `[${asLocaleLowerCaseString(this.value, locale,)}]`
    }


    public override toUpperCaseString(): string {
        return `[${asUpperCaseString(this.value,)}]`
    }

    public override toLocaleUpperCaseString(locale?: NullableString,): string {
        return `[${asLocaleUpperCaseString(this.value, locale,)}]`
    }

    //#endregion -------------------- To string --------------------
    //#region -------------------- Join to string --------------------

    public override joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string
    public override joinToString(_?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,) {
        if (transform == null)
            if (limit == null)
                return `${prefix ?? '['}${this.value}${postfix ?? ']'}`
            else {
                const lastIndex = this.#getLastIndex(limit,)
                if (lastIndex === 0)
                    return `${prefix ?? '['}${truncated ?? '…'}${postfix ?? ']'}`
                return `${prefix ?? '['}${this.value}${postfix ?? ']'}`
            }
        if (limit == null)
            if (transform.length === 1)
                return `${prefix ?? '['}${(transform as (value: T,) => string)(this.value,)}${postfix ?? ']'}`
            else if (transform.length >= 2)
                return `${prefix ?? '['}${transform(this.value, 0,)}${postfix ?? ']'}`
            else
                return `${prefix ?? '['}${(transform as () => string)()}${postfix ?? ']'}`

        const lastIndex = this.#getLastIndex(limit,)
        if (lastIndex === 0)
            return `${prefix ?? '['}${truncated ?? '…'}${postfix ?? ']'}`
        if (transform.length === 1)
            return `${prefix ?? '['}${(transform as (value: T,) => string)(this.value,)}${postfix ?? ']'}`
        else if (transform.length >= 2)
            return `${prefix ?? '['}${transform(this.value, 0,)}${postfix ?? ']'}`
        else
            return `${prefix ?? '['}${(transform as () => string)()}${postfix ?? ']'}`
    }

    //#endregion -------------------- Join to string --------------------

    //#endregion -------------------- Conversion methods --------------------

    //#endregion -------------------- Methods --------------------

}

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

import type {CollectionHolder}                                                                                                                                                                                                                                  from "./CollectionHolder"
import type {CollectionHolderOf1}                                                                                                                                                                                                                               from "./CollectionHolderOf1"
import type {MinimalistCollectionHolder}                                                                                                                                                                                                                        from "./MinimalistCollectionHolder"
import type {CollectionIterator}                                                                                                                                                                                                                                from "./iterator/CollectionIterator"
import type {BooleanCallback, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, RestrainedBooleanCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, StringCallback, ValueIndexCallback, ValueIndexWithReturnCallback} from "./type/callback"
import type {CollectionHolderOf0Or1}                                                                                                                                                                                                                            from "./type/collection"
import type {IndexOf1}                                                                                                                                                                                                                                          from "./type/indexOf"
import type {SingleValueFromIndex, SingleValueFromIndexOrElse, SingleValueFromIndexOrNull}                                                                                                                                                                      from "./type/value"

import {AbstractPartiallyUnimplementedCollectionHolderOf1}                                                                from "./AbstractPartiallyUnimplementedCollectionHolderOf1"
import {EmptyCollectionHolder}                                                                                            from "./EmptyCollectionHolder"
import {CollectionIteratorOf1}                                                                                            from "./iterator/CollectionIteratorOf1"
import {ForbiddenIndexException}                                                                                          from "./exception/ForbiddenIndexException"
import {IndexOutOfBoundsException}                                                                                        from "./exception/IndexOutOfBoundsException"
import {IndexNotFoundException}                                                                                           from "./exception/IndexNotFoundException"
import {asLocaleLowerCaseString, asLocaleString, asLocaleUpperCaseString, asLowerCaseString, asString, asUpperCaseString} from "./method/asString"
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
 * @see SingleValueCollectionHolder
 * @see LazyCollectionHolderOf1
 * @see ArrayOf1AsCollectionHolder
 * @see SetOf1AsCollectionHolder
 */
export abstract class AbstractCollectionHolderOf1<const T = unknown, >
    extends AbstractPartiallyUnimplementedCollectionHolderOf1<T> {

    //#region -------------------- Constructor --------------------

    protected constructor() { super() }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Create methods --------------------

    /**
     * Create a new instance that has only a single value.
     *
     * Note that this should usually be:
     * ```typescript
     * protected override _create<const U>(lateValue: () => U): CollectionHolderOf1<U> {
     *     return new LazyCollectionHolderOf1(lateValue)
     * }
     * ```
     * or in JavaScript:
     * ```javascript
     * _create(lateValue) {
     *     return new LazyCollectionHolderOf1(lateValue)
     * }
     * ```
     *
     * @param lateValue The value that is late
     */
    protected abstract _create<const U, >(lateValue: () => U,): CollectionHolderOf1<U>

    /**
     * Create a new instance that has possibly 0 or 1 value.
     *
     * Note that this should usually be:
     * ```typescript
     * protected override _create0Or1<const U>(latePossibleValue: () => Optional<U>): CollectionHolder<U> {
     *     return new LazyCollectionHolderOf0Or1(latePossibleValue)
     * }
     * ```
     * or in JavaScript:
     * ```javascript
     * _create0Or1(latePossibleValue) {
     *     return new LazyCollectionHolderOf0Or1(latePossibleValue)
     * }
     * ```
     *
     * @param latePossibleValue The possible value that is late
     */
    protected abstract _create0Or1<const U, >(latePossibleValue: () => Optional<U>,): CollectionHolder<U>

    /**
     * Create a new instance from a late {@link ReadonlyArray Array}
     *
     * Note that this should usually be:
     * ```typescript
     * protected override _createLazyArray(lateArray: () => Array<T>): CollectionHolder<T> {
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
    protected abstract _createLazyArray(lateArray: () => Array<T>,): CollectionHolder<T>

    //#endregion -------------------- Create methods --------------------
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

    public override get<const I extends number, >(index: I,): SingleValueFromIndex<I, T>
    public override get(index: number,): T
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


    public override getOrElse<const U, const I extends number, >(index: I, defaultValue: IndexWithReturnCallback<U>,): SingleValueFromIndexOrElse<I, T, U>
    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) {
        if (index === 0)
            return this.value
        if (index === -1)
            return this.value
        return defaultValue(index,)
    }


    public override getOrNull<const I extends number, >(index: I,): SingleValueFromIndexOrNull<I, T>
    public override getOrNull(index: number,): NullOr<T>
    public override getOrNull(index: number,) {
        if (index === 0)
            return this.value
        if (index === -1)
            return this.value
        return null
    }

    //#endregion -------------------- Get --------------------
    //#region -------------------- Find --------------------

    public override findFirst<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public override findFirst(predicate: BooleanCallback<T>,): T
    public override findFirst(predicate: BooleanCallback<T>,) {
        if (predicate.length === 1) {
            const value = this.value
            if ((predicate as (value: T,) => boolean)(value,))
                return value
            throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findFirst”|“findLast” predicate received in the collection.", 1,)
        }
        if (predicate.length >= 2) {
            const value = this.value
            if (predicate(value, 0,))
                return value
            throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findFirst”|“findLast” predicate received in the collection.", 1,)
        }

        if ((predicate as () => boolean)())
            return this.value
        throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findFirst”|“findLast” predicate received in the collection.", 1,)
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
                throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findFirstIndexed”|“findLastIndexed” predicate received in the collection.", 1,)
        if (predicate.length >= 2) {
            const value = this.value
            if (predicate(0, value,))
                return value
            throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findFirstIndexed”|“findLastIndexed” predicate received in the collection.", 1,)
        }

        if ((predicate as () => boolean)())
            return this.value
        throw new IndexOutOfBoundsException("Index out of bound. No element could be found from the “findFirstIndexed”|“findLastIndexed” predicate received in the collection.", 1,)
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

    //#endregion -------------------- Find --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    public override firstIndexOf<const I1 extends NullableNumber, const I2 extends NullableNumber, >(element: T, from?: I1, to?: I2,): IndexOf1<I1, I2>
    public override firstIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,): 0
    public override firstIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,) {
        __validateStartingIndex(from,)
        __validateEndingIndex(to,)
        if (this.value === element)
            return 0
        throw new IndexNotFoundException(`Index not found. No index could be found from the starting (“0”) to the ending (“0”) indexes in the collection.`, 1,)
    }

    public override firstIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber {
        if (!__isIndexValid(from,))
            return null
        if (!__isIndexValid(to,))
            return null
        if (this.value === element)
            return 0
        return null
    }


    public override indexOfFirst(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): 0 {
        __validateStartingIndex(from,)
        __validateEndingIndex(to,)

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
        if (!__isIndexValid(from,))
            return null
        if (!__isIndexValid(to,))
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
        __validateStartingIndex(from,)
        __validateEndingIndex(to,)

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
        if (!__isIndexValid(from,))
            return null
        if (!__isIndexValid(to,))
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

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    //#region -------------------- All --------------------

    public override all<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolderOf1<S>
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

    protected override _any(predicate: BooleanCallback<T>,): boolean {
        if (predicate.length === 1)
            return (predicate as (value: T,) => boolean)(this.value,)
        if (predicate.length >= 2)
            return predicate(this.value, 0,)
        return (predicate as () => boolean)()
    }

    //#endregion -------------------- Any --------------------
    //#region -------------------- None --------------------

    protected override _none(predicate: BooleanCallback<T>,): boolean {
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

    protected override _hasOneByArray(values: Array<T>,): boolean {
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

    protected override _hasOneBySet(values: Set<T>,): boolean {
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

    protected override _hasOneByMinimalistCollectionHolder(values: MinimalistCollectionHolder<T>,): boolean {
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

    protected override _hasOneByCollectionHolder(values: CollectionHolder<T>,): boolean {
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

    protected override _hasOneByCollectionIterator(values: CollectionIterator<T>,): boolean {
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

    protected override _hasOneByIterator(values: Iterator<T, unknown, unknown>,): boolean {
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

    protected override _hasOneByIterable(values: Iterable<T, unknown, unknown>,): boolean {
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

    protected override _hasNotOneByArray(values: Array<T>,): boolean {
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

    protected override _hasNotOneBySet(values: Set<T>,): boolean {
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

    protected override _hasNotOneByMinimalistCollectionHolder(values: MinimalistCollectionHolder<T>,): boolean {
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

    protected override _hasNotOneByCollectionHolder(values: CollectionHolder<T>,): boolean {
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

    protected override _hasNotOneByCollectionIterator(values: CollectionIterator<T>,): boolean {
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

    protected override _hasNotOneByIterator(values: Iterator<T, unknown, unknown>,): boolean {
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

    protected override _hasNotOneByIterable(values: Iterable<T, unknown, unknown>,): boolean {
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

    protected override _hasAllByArray(values: Array<T>,): boolean {
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

    protected override _hasAllBySet(values: Set<T>,): boolean {
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

    protected override _hasAllByMinimalistCollectionHolder(values: MinimalistCollectionHolder<T>,): boolean {
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

    protected override _hasAllByCollectionHolder(values: CollectionHolder<T>,): boolean {
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

    protected override _hasAllByCollectionIterator(values: CollectionIterator<T>,): boolean {
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

    protected override _hasAllByIterator(values: Iterator<T, unknown, unknown>,): boolean {
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

    protected override _hasAllByIterable(values: Iterable<T, unknown, unknown>,): boolean {
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

    protected override _hasNotAllByArray(values: Array<T>,): boolean {
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

    protected override _hasNotAllBySet(values: Set<T>,): boolean {
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

    protected override _hasNotAllByMinimalistCollectionHolder(values: MinimalistCollectionHolder<T>,): boolean {
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

    protected override _hasNotAllByCollectionHolder(values: CollectionHolder<T>,): boolean {
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

    protected override _hasNotAllByCollectionIterator(values: CollectionIterator<T>,): boolean {
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

    protected override _hasNotAllByIterator(values: Iterator<T, unknown, unknown>,): boolean {
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

    protected override _hasNotAllByIterable(values: Iterable<T, unknown, unknown>,): boolean {
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

    public override requireNoNulls(): CollectionHolderOf1<NonNullable<T>> {
        if (this.hasNull)
            throw new TypeError("Forbidden null value. The current collection contains null values.",)
        return this as CollectionHolderOf1<NonNullable<T>>
    }

    //#endregion -------------------- Require no nulls --------------------

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    public override filter<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filter(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filter(predicate: BooleanCallback<T>,) {
        if (predicate.length === 1)
            return this._create0Or1(() => {
                const value = this.value
                if ((predicate as (value: T,) => boolean)(value,))
                    return new Optional(value,)
                return EmptyOptional.get
            },)
        if (predicate.length >= 2)
            return this._create0Or1(() => {
                const value = this.value
                if (predicate(value, 0,))
                    return new Optional(value,)
                return EmptyOptional.get
            },)
        return this._create0Or1(() => (predicate as () => boolean)() ? new Optional(this.value,) : EmptyOptional.get,)
    }

    public override filterIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,) {
        if (predicate.length === 1)
            return this._create0Or1(() => (predicate as (index: number,) => boolean)(0,) ? new Optional(this.value,) : EmptyOptional.get,)
        if (predicate.length >= 2)
            return this._create0Or1(() => {
                const value = this.value
                if (predicate(0, value,))
                    return new Optional(value,)
                return EmptyOptional.get
            },)
        return this._create0Or1(() => (predicate as () => boolean)() ? new Optional(this.value,) : EmptyOptional.get,)
    }


    public override filterNot<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filterNot(predicate: BooleanCallback<T>,) {
        if (predicate.length === 1)
            return this._create0Or1(() => {
                const value = this.value
                if ((predicate as (value: T,) => boolean)(value,))
                    return EmptyOptional.get
                return new Optional(value,)
            },)
        if (predicate.length >= 2)
            return this._create0Or1(() => {
                const value = this.value
                if (predicate(value, 0,))
                    return EmptyOptional.get
                return new Optional(value,)
            },)
        return this._create0Or1(() => (predicate as () => boolean)() ? EmptyOptional.get : new Optional(this.value,),)
    }

    public override filterNotIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,) {
        if (predicate.length === 1)
            return this._create0Or1(() => (predicate as (index: number,) => boolean)(0,) ? EmptyOptional.get : new Optional(this.value,),)
        if (predicate.length >= 2)
            return this._create0Or1(() => {
                const value = this.value
                if (predicate(0, value,))
                    return EmptyOptional.get
                return new Optional(value,)
            },)
        return this._create0Or1(() => (predicate as () => boolean)() ? EmptyOptional.get : new Optional(this.value,),)
    }


    public override filterNotNull(): CollectionHolderOf0Or1<NonNullable<T>> {
        if (this.value == null)
            return EmptyCollectionHolder.get
        return this as CollectionHolderOf1<NonNullable<T>>
    }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Slice --------------------

    protected override _sliceWith0Argument(): CollectionHolderOf1<T> {
        return this
    }

    protected override _sliceWith1Argument(from: number,): CollectionHolderOf1<T> {
        __validateStartingIndex(from,)
        return this
    }

    protected override _sliceWith2Argument(from: number, to: number,): CollectionHolderOf1<T> {
        __validateStartingIndex(from,)
        __validateEndingIndex(to,)
        return this
    }

    protected override _sliceWith2ArgumentWhere1stIsNull(_: NullOrUndefined, to: number,): CollectionHolderOf1<T> {
        __validateEndingIndex(to,)
        return this
    }

    protected override _sliceByArray(indices: NumberArray,): CollectionHolder<T> {
        const indicesSize = indices.length
        if (indicesSize === 0)
            return EmptyCollectionHolder.get

        return this._createLazyArray(() => {
            const value = this.value
            let index1 = indicesSize
            while (index1-- > 0)
                __validateIndex(indices[index1] as number,)

            const newArray = new Array<T>(indicesSize,)
            let index2 = indicesSize
            while (index2-- > 0)
                newArray[index2] = value
            return Object.freeze(newArray,)
        },)
    }

    protected override _sliceBySet(indices: NumberSet,): CollectionHolder<T> {
        const indicesSize = indices.size
        if (indicesSize === 0)
            return EmptyCollectionHolder.get

        return this._createLazyArray(() => {
            const value = this.value
            const iterator = indices[Symbol.iterator]()
            let index1 = indicesSize
            while (index1-- > 0)
                __validateIndex(iterator.next().value as number,)

            const newArray = new Array<T>(indicesSize,)
            let index2 = -1
            while (++index2 < indicesSize)
                newArray[index2] = value
            return Object.freeze(newArray,)
        },)
    }

    protected override _sliceByMinimalistCollectionHolder(indices: MinimalistCollectionHolder<number>,): CollectionHolder<T> {
        const indicesSize = indices.size
        if (indicesSize === 0)
            return EmptyCollectionHolder.get

        return this._createLazyArray(() => {
            const value = this.value
            let index1 = indicesSize
            while (index1-- > 0)
                __validateIndex(indices.get(index1,),)

            const newArray = new Array<T>(indicesSize,)
            let index2 = indicesSize
            while (index2-- > 0)
                newArray[index2] = value
            return Object.freeze(newArray,)
        },)
    }

    protected override _sliceByCollectionHolder(indices: CollectionHolder<number>,): CollectionHolder<T> {
        if (indices.isEmpty)
            return EmptyCollectionHolder.get

        return this._createLazyArray(() => {
            const value = this.value
            const indicesSize = indices.size
            let index1 = indicesSize
            while (index1-- > 0)
                __validateIndex(indices.get(index1,),)

            const newArray = new Array<T>(indicesSize,)
            let index2 = indicesSize
            while (index2-- > 0)
                newArray[index2] = value
            return Object.freeze(newArray,)
        },)
    }

    protected override _sliceByCollectionIterator(indices: CollectionIterator<number>,): CollectionHolder<T> {
        if (indices.isEmpty)
            return EmptyCollectionHolder.get

        return this._createLazyArray(() => {
            const value = this.value
            const indicesSize = indices.size
            let index1 = indicesSize
            while (index1-- > 0)
                __validateIndex(indices.previousValue,)

            const newArray = new Array<T>(indicesSize,)
            let index2 = indicesSize
            while (index2-- > 0)
                newArray[index2] = value
            return Object.freeze(newArray,)
        },)
    }

    protected override _sliceByIterator(indices: Iterator<number, unknown, unknown>,): CollectionHolder<T> {
        let iteratorResult = indices.next()
        if (iteratorResult.done)
            return EmptyCollectionHolder.get

        return this._createLazyArray(() => {
            const value = this.value
            __validateIndex(iteratorResult.value as number,)
            let newSize = 1
            while (!(iteratorResult = indices.next()).done) {
                __validateIndex(iteratorResult.value as number,)
                newSize++
            }

            const newArray = new Array<T>(newSize,)
            let index = newSize
            while (index-- > 0)
                newArray[index] = value
            return Object.freeze(newArray,)
        },)
    }

    protected override _sliceByIterable(indices: Iterable<number, unknown, unknown>,): CollectionHolder<T> {
        const iterator = indices[Symbol.iterator]()
        let iteratorResult = iterator.next()
        if (iteratorResult.done)
            return EmptyCollectionHolder.get

        return this._createLazyArray(() => {
            const value = this.value
            __validateIndex(iteratorResult.value as number,)
            let newSize = 1
            while (!(iteratorResult = iterator.next()).done) {
                __validateIndex(iteratorResult.value as number,)
                newSize++
            }

            const newArray = new Array<T>(newSize,)
            let index = newSize
            while (index-- > 0)
                newArray[index] = value
            return Object.freeze(newArray,)
        },)
    }

    //#endregion -------------------- Slice --------------------
    //#region -------------------- Take --------------------

    public override take(n: number,): CollectionHolderOf0Or1<T> {
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
            return this._create0Or1(() => {
                const value = this.value
                if ((predicate as (value: T,) => boolean)(value,))
                    return new Optional(value,)
                return EmptyOptional.get
            },)
        if (predicate.length >= 2)
            return this._create0Or1(() => {
                const value = this.value
                if (predicate(value, 0,))
                    return new Optional(value,)
                return EmptyOptional.get
            },)
        return this._create0Or1(() => (predicate as () => boolean)() ? new Optional(this.value,) : EmptyOptional.get,)
    }

    public override takeWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        if (predicate.length === 1)
            return this._create0Or1(() => (predicate as (index: number,) => boolean)(0,) ? new Optional(this.value,) : EmptyOptional.get,)
        if (predicate.length >= 2)
            return this._create0Or1(() => {
                const value = this.value
                if (predicate(0, value,))
                    return new Optional(value,)
                return EmptyOptional.get
            },)
        return this._create0Or1(() => (predicate as () => boolean)() ? new Optional(this.value,) : EmptyOptional.get,)
    }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Drop --------------------

    public override drop(n: number,): CollectionHolderOf0Or1<T> {
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
            return this._create0Or1(() => {
                const value = this.value
                if ((predicate as (value: T,) => boolean)(value,))
                    return EmptyOptional.get
                return new Optional(value,)
            },)
        if (predicate.length >= 2)
            return this._create0Or1(() => {
                const value = this.value
                if (predicate(value, 0,))
                    return EmptyOptional.get
                return new Optional(value,)
            },)
        return this._create0Or1(() => (predicate as () => boolean)() ? EmptyOptional.get : new Optional(this.value,),)
    }

    public override dropWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        if (predicate.length === 1)
            return this._create0Or1(() => {
                const value = this.value
                if ((predicate as (index: number,) => boolean)(0,))
                    return EmptyOptional.get
                return new Optional(value,)
            },)
        if (predicate.length >= 2)
            return this._create0Or1(() => {
                const value = this.value
                if (predicate(0, value,))
                    return EmptyOptional.get
                return new Optional(value,)
            },)
        return this._create0Or1(() => (predicate as () => boolean)() ? EmptyOptional.get : new Optional(this.value,),)
    }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Map --------------------

    public override map<const U, >(transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolderOf1<U> {
        if (transform.length === 1)
            return this._create(() => (transform as (value: T,) => U)(this.value,),)
        if (transform.length >= 2)
            return this._create(() => transform(this.value, 0,),)
        return this._create(() => (transform as () => U)(),)
    }

    public override mapIndexed<const U, >(transform: IndexValueWithReturnCallback<T, U>,): CollectionHolderOf1<U> {
        if (transform.length === 1)
            return this._create(() => (transform as (index: number,) => U)(0,),)
        if (transform.length >= 2)
            return this._create(() => transform(0, this.value,),)
        return this._create(() => (transform as () => U)(),)
    }


    public override mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        if (transform.length === 1)
            return this._create0Or1(() => {
                const newValue = (transform as (value: T,) => Nullable<U>)(this.value,)
                if (newValue == null)
                    return EmptyOptional.get
                return new Optional(newValue,)
            },)
        if (transform.length >= 2)
            return this._create0Or1(() => {
                const newValue = transform(this.value, 0,)
                if (newValue == null)
                    return EmptyOptional.get
                return new Optional(newValue,)
            },)
        return this._create0Or1(() => {
            const newValue = (transform as () => Nullable<U>)()
            if (newValue == null)
                return EmptyOptional.get
            return new Optional(newValue,)
        },)
    }

    public override mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        if (transform.length === 1)
            return this._create0Or1(() => {
                const newValue = (transform as (index: number,) => Nullable<U>)(0,)
                if (newValue == null)
                    return EmptyOptional.get
                return new Optional(newValue,)
            },)
        if (transform.length >= 2)
            return this._create0Or1(() => {
                const newValue = transform(0, this.value,)
                if (newValue == null)
                    return EmptyOptional.get
                return new Optional(newValue,)
            },)
        return this._create0Or1(() => {
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

    public override toReverse(from?: NullableNumber, to?: NullableNumber,): CollectionHolderOf1<T> {
        __validateStartingIndex(from,)
        __validateEndingIndex(to,)
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

    protected _joinToString_core(prefix: string, postfix: string,): string {
        return `${prefix}${this.value}${postfix}`
    }

    protected _joinToString_truncated(prefix: string, postfix: string, truncated: string,): string {
        return `${prefix}${truncated}${postfix}`
    }

    protected _joinToString_transform(prefix: string, postfix: string, transform: StringCallback<T>,): string {
        if (transform.length === 1)
            return `${prefix}${(transform as (value: T,) => string)(this.value,)}${postfix}`
        if (transform.length >= 2)
            return `${prefix}${transform(this.value, 0,)}${postfix}`
        return `${prefix}${(transform as () => string)()}${postfix}`
    }


    public override joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string
    public override joinToString(_?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,) {
        if (transform == null)
            if (limit == null)
                return this._joinToString_core(prefix ?? '[', postfix ?? ']',)
            else if (__getLastIndex(limit,) === 0)
                return this._joinToString_truncated(prefix ?? '[', postfix ?? ']', truncated ?? '…',)
            else
                return this._joinToString_core(prefix ?? '[', postfix ?? ']',)
        if (limit == null)
            return this._joinToString_transform(prefix ?? '[', postfix ?? ']', transform,)
        if (__getLastIndex(limit,) === 0)
            return this._joinToString_truncated(prefix ?? '[', postfix ?? ']', truncated ?? '…',)
        return this._joinToString_transform(prefix ?? '[', postfix ?? ']', transform,)
    }

    //#endregion -------------------- Join to string --------------------

    //#endregion -------------------- Conversion methods --------------------

    //#endregion -------------------- Methods --------------------

}

//#region -------------------- Validate methods --------------------

/**
 * Validate that the value is either `null`, 0 or -1
 *
 * @param index The value to compare
 * @throws IndexOutOfBoundsException The value is equal or over 1 (before or after calculation)
 * @throws ForbiddenIndexException   The value is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 */
function __validateIndex(index: number,): void {
    if (index === 0)
        return
    if (index === -1)
        return
    if (Number.isNaN(index,))
        throw new ForbiddenIndexException("Forbidden index. The index cannot be NaN.", index,)
    if (index === Number.NEGATIVE_INFINITY)
        throw new ForbiddenIndexException("Forbidden index. The index cannot be -∞.", index,)
    if (index === Number.POSITIVE_INFINITY)
        throw new ForbiddenIndexException("Forbidden index. The index cannot be +∞.", index,)
    if (index > 1)
        throw new IndexOutOfBoundsException(`Index out of bound. The index “${index}” is over the size of the collection (1).`, index,)
    if (index === 1)
        throw new IndexOutOfBoundsException(`Index out of bound. The index “${index}” is the size of the collection (1).`, index,)
    throw new IndexOutOfBoundsException(`"Index out of bound. The index “${index}” (“${index + 1}” after calculation) is under 0."`, index,)
}

/**
 * Validate if the value is either `null`, 0 or -1
 *
 * @param from The value to validate
 * @throws IndexOutOfBoundsException The value is equal or over 1 (before or after calculation)
 * @throws ForbiddenIndexException   The value is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
 */
function __validateStartingIndex(from: NullableNumber,): void {
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
function __validateEndingIndex(to: NullableNumber,): void {
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
function __getLastIndex(limit: number,): | 0 | 1 {
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
function __isIndexValid(value: NullableNumber,): value is Nullable<| -1 | 0> {
    if (value == null)
        return true
    if (value === 0)
        return true
    return value === -1
}

//#endregion -------------------- Validate methods --------------------

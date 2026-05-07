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

import type {Lazy}                                                                                                                                                                                                                                       from "@joookiwi/lazy"
import type {Array, EmptyArray, EmptyMap, EmptyMutableArray, EmptyMutableMap, EmptyMutableSet, EmptySet, MutableNumberKeyMap, MutableSet, Nullable, NullableNumber, NullableString, NullOr, NullOrZeroNumber, NumberArray, NumberKeyMap, NumberSet, Set} from "@joookiwi/type"
import {lazy}                                                                                                                                                                                                                                            from "@joookiwi/lazy"

import type {CollectionHolder}                                                                                                                                                                                                                                                  from "./CollectionHolder"
import type {MinimalistCollectionHolder}                                                                                                                                                                                                                                        from "./MinimalistCollectionHolder"
import type {CollectionIterator}                                                                                                                                                                                                                                                from "./iterator/CollectionIterator"
import type {CollectionIteratorOf1}                                                                                                                                                                                                                                             from "./iterator/CollectionIteratorOf1"
import type {EmptyCollectionIterator}                                                                                                                                                                                                                                           from "./iterator/EmptyCollectionIterator"
import type {Optional}                                                                                                                                                                                                                                                          from "./optional/Optional"
import type {BooleanCallback, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, RestrainedBooleanCallback, ReturnCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, StringCallback, ValueIndexCallback, ValueIndexWithReturnCallback} from "./type/callback"
import type {PossibleIterableIteratorArraySetOrCollectionHolder}                                                                                                                                                                                                                from "./type/possibleInstance"

import {AbstractUnimplementedCollectionHolder} from "./AbstractUnimplementedCollectionHolder"
import type {CollectionHolderOf1}              from "./CollectionHolderOf1"
import {LateRetriever}                         from "./LateRetriever"
import {EmptyCollectionHolder}                 from "./EmptyCollectionHolder"

/**
 * An instance of {@link CollectionHolder} with only 2 possible inner-collection.
 * The first as {@link EmptyCollectionHolder} and the second as {@link CollectionHolderOf1}.
 * Plus, the inner-collection is lazily retrieved.
 *
 * @typeParam T The type
 */
export class LazyCollectionHolderOf0Or1<const T = unknown, >
    extends AbstractUnimplementedCollectionHolder<T> {

    //#region -------------------- Field --------------------

    #firstValue?: Lazy<T>
    readonly #innerCollection: Lazy<| CollectionHolderOf1<T> | EmptyCollectionHolder>

    //#endregion -------------------- Field --------------------
    //#region -------------------- Constructor --------------------

    public constructor(latePossibleValue: () => Optional<T>,) {
        super()
        this.#innerCollection = lazy(() => {
            const value = latePossibleValue()
            if (value.isPresent)
                return new LateRetriever.CollectionHolderOf1(value.get,)
            return EmptyCollectionHolder.get
        },)
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    /** The internal value processed through the {@link constructor} in a {@link Lazy} instance */
    protected get _innerCollection(): | CollectionHolderOf1<T> | EmptyCollectionHolder {
        return this.#innerCollection.value
    }

    public get 0(): T { return this.value }

    public get value(): T {
        return (this.#firstValue ??= lazy(() => {
            const innerCollection = this._innerCollection
            if (innerCollection.size === 0)
                throw new TypeError(`The inner collection received in the “${this.constructor.name}” does not have an existing second value.`,)
            return innerCollection[0]
        },)).value
    }

    //#region -------------------- Size methods --------------------

    public override get size(): | 0 | 1 { return this._innerCollection.size }

    public override get isEmpty(): boolean { return this._innerCollection.isEmpty }
    public override get isNotEmpty():  boolean { return this._innerCollection.isNotEmpty }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    public override get(index: number,): T { return this._innerCollection.get(index,) }

    public override getFirst(): T { return this._innerCollection.getFirst() }

    public override getLast(): T { return this._innerCollection.getLast() }


    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) { return this._innerCollection.getOrElse(index, defaultValue as IndexWithReturnCallback<never>,) }

    public override getFirstOrElse<const U, >(defaultValue: ReturnCallback<U>,): | T | U
    public override getFirstOrElse(defaultValue: ReturnCallback<T>,): T
    public override getFirstOrElse(defaultValue: ReturnCallback<unknown>,) { return this._innerCollection.getFirstOrElse(defaultValue as ReturnCallback<never>,) }

    public override getLastOrElse<const U, >(defaultValue: ReturnCallback<U>,): | T | U
    public override getLastOrElse(defaultValue: ReturnCallback<T>,): T
    public override getLastOrElse(defaultValue: ReturnCallback<unknown>,) { return this._innerCollection.getLastOrElse(defaultValue as ReturnCallback<never>,) }


    public override getOrNull(index: number,): NullOr<T> { return this._innerCollection.getOrNull(index,) }

    public override getFirstOrNull(): NullOr<T> { return this._innerCollection.getFirstOrNull() }

    public override getLastOrNull(): NullOr<T> { return this._innerCollection.getLastOrNull() }

    //#endregion -------------------- Get --------------------
    //#region -------------------- Find --------------------

    public override findFirst<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public override findFirst(predicate: BooleanCallback<T>,): T
    public override findFirst(predicate: BooleanCallback<T>,) { return this._innerCollection.findFirst(predicate,) }

    public override findFirstOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findFirstOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public override findFirstOrNull(predicate: BooleanCallback<T>,) { return this._innerCollection.findFirstOrNull(predicate,) }

    public override findFirstIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public override findFirstIndexed(predicate: ReverseBooleanCallback<T>,): T
    public override findFirstIndexed(predicate: ReverseBooleanCallback<T>,) { return this._innerCollection.findFirstIndexed(predicate,) }

    public override findFirstIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,) { return this._innerCollection.findFirstIndexedOrNull(predicate,) }


    public override findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public override findLast(predicate: BooleanCallback<T>,): T
    public override findLast(predicate: BooleanCallback<T>,) { return this._innerCollection.findLast(predicate,) }

    public override findLastOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public override findLastOrNull(predicate: BooleanCallback<T>,) { return this._innerCollection.findLastOrNull(predicate,) }

    public override findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,): T
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,) { return this._innerCollection.findLastIndexed(predicate,) }

    public override findLastIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,) { return this._innerCollection.findLastIndexedOrNull(predicate,) }

    //#endregion -------------------- Find --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    public override firstIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,): 0 { return this._innerCollection.firstIndexOf(element, from, to,) }

    public override firstIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber { return this._innerCollection.firstIndexOfOrNull(element, from, to,) }


    public override lastIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,): 0 { return this._innerCollection.lastIndexOf(element, from, to,) }

    public override lastIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber { return this._innerCollection.lastIndexOfOrNull(element, from, to,) }


    public override indexOfFirst(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): 0 { return this._innerCollection.indexOfFirst(predicate, from, to,) }

    public override indexOfFirstOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber { return this._innerCollection.indexOfFirstOrNull(predicate, from, to,) }

    public override indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): 0 { return this._innerCollection.indexOfFirstIndexed(predicate, from, to,) }

    public override indexOfFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber { return this._innerCollection.indexOfFirstIndexedOrNull(predicate, from, to,) }


    public override indexOfLast(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): 0 { return this._innerCollection.indexOfLast(predicate, from, to,) }

    public override indexOfLastOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber { return this._innerCollection.indexOfLastOrNull(predicate, from, to,) }

    public override indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): 0 { return this._innerCollection.indexOfLastIndexed(predicate, from, to,) }

    public override indexOfLastIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber { return this._innerCollection.indexOfLastIndexedOrNull(predicate, from, to,) }

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    //#region -------------------- All --------------------

    public override all<S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolder<S>
    public override all(predicate: BooleanCallback<T>,): boolean
    public override all(predicate: BooleanCallback<T>,) { return this._innerCollection.all(predicate,) }

    //#endregion -------------------- All --------------------
    //#region -------------------- Any --------------------

    public override any(): true
    public override any(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override any(predicate?: Nullable<BooleanCallback<T>>,) { return this._innerCollection.any(predicate,) }

    //#endregion -------------------- Any --------------------
    //#region -------------------- None --------------------

    public override none(): false
    public override none(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override none(predicate?: Nullable<BooleanCallback<T>>,) { return this._innerCollection.none(predicate,) }

    //#endregion -------------------- None --------------------

    //#region -------------------- Has ‥ --------------------

    public override get hasNull(): boolean { return this._innerCollection.hasNull }

    public override get hasNoNulls(): boolean { return this._innerCollection.hasNoNulls }


    public override get hasDuplicate(): false { return this._innerCollection.hasDuplicate }

    public override get hasNoDuplicates(): true { return this._innerCollection.hasNoDuplicates }

    //#endregion -------------------- Has ‥ --------------------

    //#region -------------------- Has --------------------

    public override has(value: T,): boolean { return this._innerCollection.has(value,) }

    public override hasNot(value: T,): boolean { return this._innerCollection.hasNot(value,) }

    //#endregion -------------------- Has --------------------
    //#region -------------------- Has one --------------------

    public override hasOne(values: Nullable<Array<T>>,): boolean
    public override hasOne(values: Nullable<Set<T>>,): boolean
    public override hasOne(values: Nullable<CollectionHolder<T>>,): boolean
    public override hasOne(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public override hasOne(values: Nullable<CollectionIterator<T>>,): boolean
    public override hasOne(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public override hasOne(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public override hasOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
    public override hasOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) { return this._innerCollection.hasOne(values,) }

    //#endregion -------------------- Has one --------------------
    //#region -------------------- Has not one --------------------

    public override hasNotOne(values: Nullable<Array<T>>,): boolean
    public override hasNotOne(values: Nullable<Set<T>>,): boolean
    public override hasNotOne(values: Nullable<CollectionHolder<T>>,): boolean
    public override hasNotOne(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public override hasNotOne(values: Nullable<CollectionIterator<T>>,): boolean
    public override hasNotOne(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public override hasNotOne(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public override hasNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
    public override hasNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) { return this._innerCollection.hasNotOne(values,) }

    //#endregion -------------------- Has not one --------------------
    //#region -------------------- Has all --------------------

    public override hasAll(values: Nullable<Array<T>>,): boolean
    public override hasAll(values: Nullable<Set<T>>,): boolean
    public override hasAll(values: Nullable<CollectionHolder<T>>,): boolean
    public override hasAll(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public override hasAll(values: Nullable<CollectionIterator<T>>,): boolean
    public override hasAll(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public override hasAll(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public override hasAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
    public override hasAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) { return this._innerCollection.hasAll(values,) }

    //#endregion -------------------- Has all --------------------
    //#region -------------------- Has not all --------------------

    public override hasNotAll(values: Nullable<Array<T>>,): boolean
    public override hasNotAll(values: Nullable<Set<T>>,): boolean
    public override hasNotAll(values: Nullable<CollectionHolder<T>>,): boolean
    public override hasNotAll(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public override hasNotAll(values: Nullable<CollectionIterator<T>>,): boolean
    public override hasNotAll(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public override hasNotAll(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public override hasNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
    public override hasNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) { return this._innerCollection.hasNotAll(values,) }

    //#endregion -------------------- Has not all --------------------

    //#region -------------------- Require no nulls --------------------

    public override requireNoNulls(): CollectionHolder<NonNullable<T>> {
        if (this._innerCollection.hasNull)
            throw new TypeError("Forbidden null value. The current collection contains null values.",)
        return this as CollectionHolder<NonNullable<T>>
    }

    //#endregion -------------------- Require no nulls --------------------

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    public override filter<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filter(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filter(predicate: BooleanCallback<T>,) { return this._innerCollection.filter(predicate,) }

    public override filterIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,) { return this._innerCollection.filterIndexed(predicate,) }


    public override filterNot<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T> { return this._innerCollection.filterNot(predicate,) }

    public override filterNotIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T> { return this._innerCollection.filterNotIndexed(predicate,) }


    public override filterNotNull(): CollectionHolder<NonNullable<T>> { return this._innerCollection.filterNotNull() }

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
    public override slice(indicesOrFrom?: Nullable<| PossibleIterableIteratorArraySetOrCollectionHolder<number> | number>, to?: NullableNumber,) { return this._innerCollection.slice(indicesOrFrom, to,) }

    //#endregion -------------------- Slice --------------------
    //#region -------------------- Take --------------------

    public override take(n: number,): CollectionHolder<T> { return this._innerCollection.take(n,) }

    public override takeWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override takeWhile(predicate: BooleanCallback<T>,) { return this._innerCollection.takeWhile(predicate,) }

    public override takeWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<T>,) { return this._innerCollection.takeWhileIndexed(predicate,) }


    public override takeLast(n: number,): CollectionHolder<T> { return this._innerCollection.take(n,) }

    public override takeLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override takeLastWhile(predicate: BooleanCallback<T>,) { return this._innerCollection.takeLastWhile(predicate,) }

    public override takeLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) { return this._innerCollection.takeLastWhileIndexed(predicate,) }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Drop --------------------

    public override drop(n: number,): CollectionHolder<T> { return this._innerCollection.drop(n,) }

    public override dropWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override dropWhile(predicate: BooleanCallback<T>,) { return this._innerCollection.dropWhile(predicate,) }

    public override dropWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<T>,) { return this._innerCollection.dropWhileIndexed(predicate,) }


    public override dropLast(n: number,): CollectionHolder<T> { return this._innerCollection.drop(n,) }

    public override dropLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override dropLastWhile(predicate: BooleanCallback<T>,) { return this._innerCollection.dropLastWhile(predicate,) }

    public override dropLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) { return this._innerCollection.dropLastWhileIndexed(predicate,) }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Map --------------------

    public override map<const U, >(transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U> { return this._innerCollection.map(transform,) }

    public override mapIndexed<const U, >(transform: IndexValueWithReturnCallback<T, U>,): CollectionHolder<U> { return this._innerCollection.mapIndexed(transform,) }


    public override mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> { return this._innerCollection.mapNotNull(transform,) }

    public override mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> { return this._innerCollection.mapNotNullIndexed(transform,) }

    //#endregion -------------------- Map --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    public override forEach(action: ValueIndexCallback<T>,): void { this._innerCollection.forEach(action,) }

    public override forEachIndexed(action: IndexValueCallback<T>,): void { this._innerCollection.forEachIndexed(action,) }


    public override onEach(action: ValueIndexCallback<T>,): this {
        this._innerCollection.forEach(action,)
        return this
    }

    public override onEachIndexed(action: IndexValueCallback<T>,): this {
        this._innerCollection.forEachIndexed(action,)
        return this
    }

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    //#region -------------------- To reverse --------------------

    public override toReverse(from?: NullableNumber, to?: NullableNumber,): | CollectionHolderOf1<T> | EmptyCollectionHolder { return this._innerCollection.toReverse(from, to,) }

    //#endregion -------------------- To reverse --------------------

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- JavaScript methods --------------------

    public override [Symbol.iterator](): | CollectionIteratorOf1<T> | EmptyCollectionIterator {
        return this.toIterator()
    }

    //#endregion -------------------- JavaScript methods --------------------
    //#region -------------------- Conversion methods --------------------

    //#region -------------------- To other structure --------------------

    public override toIterator(): | CollectionIteratorOf1<T> | EmptyCollectionIterator { return this._innerCollection.toIterator() }

    public override toArray(): | readonly [T,] | EmptyArray { return this._innerCollection.toArray() }

    public override toMutableArray(): | [T,] | EmptyMutableArray { return this._innerCollection.toMutableArray() }

    public override toSet(): | Set<T> | EmptySet { return this._innerCollection.toSet() }

    public override toMutableSet(): | MutableSet<T> | EmptyMutableSet { return this._innerCollection.toMutableSet() }

    public override toMap(): | NumberKeyMap<T, 0> | EmptyMap { return this._innerCollection.toMap() }

    public override toMutableMap(): | MutableNumberKeyMap<T, 0> | EmptyMutableMap { return this._innerCollection.toMutableMap() }

    //#endregion -------------------- To other structure --------------------
    //#region -------------------- To string --------------------

    public override toString(): string { return this._innerCollection.toString() }

    public override toLocaleString(locale?: NullableString,): string { return this._innerCollection.toLocaleString(locale,) }


    public override toLowerCaseString(): string { return this._innerCollection.toLowerCaseString() }

    public override toLocaleLowerCaseString(locale?: NullableString,): string { return this._innerCollection.toLocaleLowerCaseString(locale,) }


    public override toUpperCaseString(): string { return this._innerCollection.toUpperCaseString() }

    public override toLocaleUpperCaseString(locale?: NullableString,): string { return this._innerCollection.toLocaleUpperCaseString(locale,) }

    //#endregion -------------------- To string --------------------
    //#region -------------------- Join to string --------------------

    public override joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string
    public override joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,) { return this._innerCollection.joinToString(separator, prefix, postfix, limit, truncated, transform,) }

    //#endregion -------------------- Join to string --------------------

    //#endregion -------------------- Conversion methods --------------------

    //#endregion -------------------- Methods --------------------

}

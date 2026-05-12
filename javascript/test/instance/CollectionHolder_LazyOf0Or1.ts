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

import type {EmptyArray, EmptyMap, EmptyMutableArray, EmptyMutableMap, EmptyMutableSet, EmptySet, MutableNumberKeyMap, MutableSet, Nullable, NullableNumber, NullableString, NullOr, NullOrZeroNumber, NumberKeyMap, Set} from "@joookiwi/type"

import type {CollectionHolder}                                                                                                                                                                                                                                                  from "../../src/CollectionHolder"
import type {CollectionHolderOf1}                                                                                                                                                                                                                                               from "../../src/CollectionHolderOf1"
import type {EmptyCollectionHolder}                                                                                                                                                                                                                                             from "../../src/EmptyCollectionHolder"
import type {CollectionIteratorOf1}                                                                                                                                                                                                                                             from "../../src/iterator/CollectionIteratorOf1"
import type {EmptyCollectionIterator}                                                                                                                                                                                                                                           from "../../src/iterator/EmptyCollectionIterator"
import type {BooleanCallback, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, RestrainedBooleanCallback, ReturnCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, StringCallback, ValueIndexCallback, ValueIndexWithReturnCallback} from "../../src/type/callback"
import type {PossibleIterableIteratorArraySetOrCollectionHolder}                                                                                                                                                                                                                from "../../src/type/possibleInstance"

import {AbstractCollectionHolderForTest} from "./AbstractCollectionHolderForTest"
import {LazyCollectionHolderOf0Or1}      from "../../src/LazyCollectionHolderOf0Or1"
import {EmptyOptional}                   from "../../src/optional/EmptyOptional"
import {Optional}                        from "../../src/optional/Optional"

/**
 * A class to test the functionality of a {@link LazyCollectionHolderOf0Or1}
 *
 * @typeParam T The type
 */
export class CollectionHolder_LazyOf0Or1<const T, >
    extends AbstractCollectionHolderForTest<T> {

    /** The internal instance that is tested */
    public readonly instance: LazyCollectionHolderOf0Or1ForTest<T>

    public readonly value: Optional<T>

    public constructor()
    public constructor(value: T,)
    public constructor(value?: T,) {
        super()
        const optional = this.value = arguments.length === 0 ? EmptyOptional.get : new Optional(value as T,)
        const $this = this
        this.instance = new class CollectionHolder_CountingGetOnLazyOf0Or1
            extends LazyCollectionHolderOf0Or1<T>
            implements LazyCollectionHolderOf0Or1ForTest<T> {

            public override get(index: number,): T {
                $this.amountOfCall++
                return super.get(index,)
            }

            public get innerCollection(): | CollectionHolderOf1<T> | EmptyCollectionHolder { return this._innerCollection }

        }(() => optional,)
    }

    //#region -------------------- Size methods --------------------

    public override get size(): | 0 | 1 { return this.instance.size }

    public override get isEmpty(): boolean { return this.instance.isEmpty }
    public override get isNotEmpty(): boolean { return this.instance.isNotEmpty }

    public override get hasExactly1Element(): boolean { return this.instance.hasExactly1Element }
    public override get hasAtMost1Element(): true { return this.instance.hasAtMost1Element }

    public override get hasAtLeast2Elements(): false { return this.instance.hasAtLeast2Elements }
    public override get hasExactly2Elements(): false { return this.instance.hasExactly2Elements }
    public override get hasAtMost2Elements(): true { return this.instance.hasAtMost2Elements }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    public override get(index: number,): T { return this.instance.get(index,) }

    public override getFirst(): T { return this.instance.getFirst() }

    public override getLast(): T { return this.instance.getLast() }


    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) { return this.instance.getOrElse(index, defaultValue,) }

    public override getFirstOrElse<const U, >(defaultValue: ReturnCallback<U>,): | T | U
    public override getFirstOrElse(defaultValue: ReturnCallback<T>,): T
    public override getFirstOrElse(defaultValue: ReturnCallback<unknown>,) { return this.instance.getFirstOrElse(defaultValue,) }

    public override getLastOrElse<const U, >(defaultValue: ReturnCallback<U>,): | T | U
    public override getLastOrElse(defaultValue: ReturnCallback<T>,): T
    public override getLastOrElse(defaultValue: ReturnCallback<unknown>,) { return this.instance.getLastOrElse(defaultValue,) }


    public override getOrNull(index: number,): NullOr<T> { return this.instance.getOrNull(index,) }

    public override getFirstOrNull(): NullOr<T> { return this.instance.getFirstOrNull() }

    public override getLastOrNull(): NullOr<T> { return this.instance.getLastOrNull() }

    //#endregion -------------------- Get --------------------
    //#region -------------------- Find --------------------

    public override findFirst<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public override findFirst(predicate: BooleanCallback<T>,): T
    public override findFirst(predicate: BooleanCallback<T>,) { return this.instance.findFirst(predicate,) }

    public override findFirstOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findFirstOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public override findFirstOrNull(predicate: BooleanCallback<T>,) { return this.instance.findFirstOrNull(predicate,) }

    public override findFirstIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public override findFirstIndexed(predicate: ReverseBooleanCallback<T>,): T
    public override findFirstIndexed(predicate: ReverseBooleanCallback<T>,) { return this.instance.findFirstIndexed(predicate,) }

    public override findFirstIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,) { return this.instance.findFirstIndexedOrNull(predicate,) }


    public override findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public override findLast(predicate: BooleanCallback<T>,): T
    public override findLast(predicate: BooleanCallback<T>,) { return this.instance.findLast(predicate,) }

    public override findLastOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public override findLastOrNull(predicate: BooleanCallback<T>,) { return this.instance.findLastOrNull(predicate,) }

    public override findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,): T
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,) { return this.instance.findLastIndexed(predicate,) }

    public override findLastIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,) { return this.instance.findLastIndexedOrNull(predicate,) }

    //#endregion -------------------- Find --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    public override firstIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,): 0 { return this.instance.firstIndexOf(element, from, to,) }
    public override firstIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber { return this.instance.firstIndexOfOrNull(element, from, to,) }

    public override lastIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,): 0 { return this.instance.lastIndexOf(element, from, to,) }
    public override lastIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber { return this.instance.lastIndexOfOrNull(element, from, to,) }

    public override indexOfFirst(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): 0 { return this.instance.indexOfFirst(predicate, from, to,) }
    public override indexOfFirstOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber { return this.instance.indexOfFirstOrNull(predicate, from, to,) }
    public override indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): 0 { return this.instance.indexOfFirstIndexed(predicate, from, to,) }
    public override indexOfFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber { return this.instance.indexOfFirstIndexedOrNull(predicate, from, to,) }

    public override indexOfLast(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): 0 { return this.instance.indexOfLast(predicate, from, to,) }
    public override indexOfLastOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber { return this.instance.indexOfLastOrNull(predicate, from, to,) }
    public override indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): 0 { return this.instance.indexOfLastIndexed(predicate, from, to,) }
    public override indexOfLastIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber { return this.instance.indexOfLastIndexedOrNull(predicate, from, to,) }

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    public override all<S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolder<S>
    public override all(predicate: BooleanCallback<T>,): boolean
    public override all(predicate: BooleanCallback<T>,) { return this.instance.all(predicate,) }

    public override any(): this["isNotEmpty"]
    public override any(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override any(predicate?: Nullable<BooleanCallback<T>>,) {
        if (arguments.length === 0)
            return this.instance.any()
        return this.instance.any(predicate,)
    }

    public override none(): this["isEmpty"]
    public override none(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override none(predicate?: Nullable<BooleanCallback<T>>,) {
        if (arguments.length === 0)
            return this.instance.none()
        return this.instance.none(predicate,)
    }


    public override get hasNull(): boolean { return this.instance.hasNull }

    public override get hasNoNulls(): boolean { return this.instance.hasNoNulls }


    public override get hasDuplicate(): false { return this.instance.hasDuplicate }

    public override get hasNoDuplicates(): true { return this.instance.hasNoDuplicates }


    public override has(value: T,): boolean { return this.instance.has(value,) }

    public override hasNot(value: T,): boolean { return this.instance.hasNot(value,) }

    public override hasOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean { return this.instance.hasOne(values,) }

    public override hasNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean { return this.instance.hasNotOne(values,) }

    public override hasAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean { return this.instance.hasAll(values,) }

    public override hasNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean { return this.instance.hasNotAll(values,) }


    public override requireNoNulls(): CollectionHolder<NonNullable<T>> {
        if (this.instance.requireNoNulls() !== this.instance)
            throw new Error("The expected return type for the method “requireNoNulls” was supposed to be the same instance",)
        return this as CollectionHolder<NonNullable<T>>
    }

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    public override filter<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filter(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filter(predicate: BooleanCallback<T>,) { return this.instance.filter(predicate,) }

    public override filterIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,) { return this.instance.filterIndexed(predicate,) }

    public override filterNot<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filterNot(predicate: BooleanCallback<T>,) { return this.instance.filterNot(predicate,) }

    public override filterNotIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,) { return this.instance.filterNotIndexed(predicate,) }

    public override filterNotNull(): CollectionHolder<NonNullable<T>> {
        const instance = this.instance
        const newInstance = instance.filterNotNull()
        if (newInstance === instance)
            return this as CollectionHolder<NonNullable<T>>
        return newInstance
    }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Slice --------------------

    public override slice(from?: NullableNumber, to?: NullableNumber,): CollectionHolder<T>
    public override slice(indices: PossibleIterableIteratorArraySetOrCollectionHolder<number>,): CollectionHolder<T>
    public override slice(indicesOrFrom?: Nullable<| PossibleIterableIteratorArraySetOrCollectionHolder<number> | number>, to?: NullableNumber,) {
        if (arguments.length === 0)
            return this.instance.slice()
        if (arguments.length === 1)
            return this.instance.slice(indicesOrFrom,)
        return this.instance.slice(indicesOrFrom, to,)
    }

    //#endregion -------------------- Slice --------------------
    //#region -------------------- Take --------------------

    public override take(n: number,): CollectionHolder<T> {
        return this.instance.take(n,)
    }

    public override takeWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override takeWhile(predicate: BooleanCallback<T>,) {
        return this.instance.takeWhile(predicate,)
    }

    public override takeWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return this.instance.takeWhileIndexed(predicate,)
    }


    public override takeLast(n: number,): CollectionHolder<T> {
        return this.instance.takeLast(n,)
    }

    public override takeLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override takeLastWhile(predicate: BooleanCallback<T>,) {
        return this.instance.takeLastWhile(predicate,)
    }

    public override takeLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return this.instance.takeLastWhileIndexed(predicate,)
    }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Drop --------------------

    public override drop(n: number,): CollectionHolder<T> {
        return this.instance.drop(n,)
    }

    public override dropWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override dropWhile(predicate: BooleanCallback<T>,) {
        return this.instance.dropWhile(predicate,)
    }

    public override dropWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return this.instance.dropWhileIndexed(predicate,)
    }


    public override dropLast(n: number,): CollectionHolder<T> {
        return this.instance.dropLast(n,)
    }

    public override dropLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override dropLastWhile(predicate: BooleanCallback<T>,) {
        return this.instance.dropLastWhile(predicate,)
    }

    public override dropLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return this.instance.dropLastWhileIndexed(predicate,)
    }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Map --------------------

    public override map<const U, >(transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U> { return this.instance.map(transform,) }
    public override mapIndexed<const U, >(transform: IndexValueWithReturnCallback<T, U>,): CollectionHolder<U> { return this.instance.mapIndexed(transform,) }

    public override mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> { return this.instance.mapNotNull(transform,) }
    public override mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> { return this.instance.mapNotNullIndexed(transform,) }

    //#endregion -------------------- Map --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    public override forEach(action: ValueIndexCallback<T>,): void { this.instance.forEach(action,) }
    public override forEachIndexed(action: IndexValueCallback<T>,): void { this.instance.forEachIndexed(action,) }


    public override onEach(action: ValueIndexCallback<T>,): this {
        if (this.instance.onEach(action,) !== this.instance)
            throw new Error("The expected return type for the method “onEach” was supposed to be the same instance",)
        return this
    }

    public override onEachIndexed(action: IndexValueCallback<T>,): this {
        if (this.instance.onEachIndexed(action,) !== this.instance)
            throw new Error("The expected return type for the method “onEach” was supposed to be the same instance",)
        return this
    }

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    public override toReverse(from?: NullableNumber, to?: NullableNumber,): | CollectionHolderOf1<T> | EmptyCollectionHolder { return this.instance.toReverse(from, to,) }

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- Conversion methods --------------------

    public override toIterator(): | CollectionIteratorOf1<T> | EmptyCollectionIterator { return this.instance.toIterator() }

    public override toArray(): | readonly [T,] | EmptyArray { return this.instance.toArray() }
    public override toMutableArray(): | [T,] | EmptyMutableArray { return this.instance.toMutableArray() }
    public override toSet(): | Set<T> | EmptySet { return this.instance.toSet() }
    public override toMutableSet(): | MutableSet<T> | EmptyMutableSet { return this.instance.toMutableSet() }
    public override toMap(): | NumberKeyMap<T, 0> | EmptyMap { return this.instance.toMap() }
    public override toMutableMap(): | MutableNumberKeyMap<T, 0> | EmptyMutableMap { return this.instance.toMutableMap() }


    public override toString(): string { return this.instance.toString() }
    public override toLocaleString(locale?: NullableString,): string {
        if (arguments.length === 0)
            return this.instance.toLocaleString()
        return this.instance.toLocaleString(locale,)
    }

    public override toLowerCaseString(): string { return this.instance.toLowerCaseString() }
    public override toLocaleLowerCaseString(locale?: NullableString,): string {
        if (arguments.length === 0)
            return this.instance.toLocaleLowerCaseString()
        return this.instance.toLocaleLowerCaseString(locale,)
    }

    public override toUpperCaseString(): string { return this.instance.toUpperCaseString() }
    public override toLocaleUpperCaseString(locale?: NullableString,): string {
        if (arguments.length === 0)
            return this.instance.toLocaleUpperCaseString()
        return this.instance.toLocaleUpperCaseString(locale,)
    }


    public override joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string { return this.instance.joinToString(separator, prefix, postfix, limit, truncated, transform,) }

    //#endregion -------------------- Conversion methods --------------------

}

interface LazyCollectionHolderOf0Or1ForTest<T,>
    extends LazyCollectionHolderOf0Or1<T> {

    readonly innerCollection: | CollectionHolderOf1<T> | EmptyCollectionHolder

}

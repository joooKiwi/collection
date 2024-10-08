/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullableNumber, NullableString, NullOr, NullOrNumber, TemplateOrNumber} from "@joookiwi/type"

import type {CollectionHolder}                                                                                                                                                                                                                                                                                                    from "../../src/CollectionHolder"
import type {BooleanCallback, CollectionHolderName, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, PossibleIterableArraySetOrCollectionHolder, RestrainedBooleanCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, StringCallback, ValueIndexCallback, ValueIndexWithReturnCallback} from "../../src/CollectionHolder.types"
import type {CollectionIterator}                                                                                                                                                                                                                                                                                                  from "../../src/iterator/CollectionIterator"
import type {MinimalistCollectionHolder}                                                                                                                                                                                                                                                                                          from "../../src/MinimalistCollectionHolder"

import {CollectionHolderFromArray} from "./CollectionHolderFromArray"

/**
 * A {@link CollectionHolder} having the structure of it,
 * but without inheriting the {@link AbstractCollectionHolder}.
 *
 * Internally, it is using a {@link CollectionHolderFromArray} for every method
 */
export class CollectionHolder_ByStructure<const T, >
    implements CollectionHolder<T> {

    [index: TemplateOrNumber]: undefined
    public readonly reference

    public constructor(array: readonly T[],) { this.reference = new CollectionHolderFromArray(array,) }

    //#region -------------------- Size methods --------------------

    public get size(): number { return this.reference.size }
    public get length(): this["size"] { return this.reference.length }
    public get count(): this["size"] { return this.reference.count }

    public get isEmpty(): boolean { return this.reference.isEmpty }
    public get isNotEmpty(): boolean { return this.reference.isNotEmpty }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    public get(index: number,): T { return this.reference.get(index,) }

    public at(index: number,): T { return this.reference.at(index,) }

    public elementAt(index: number,): T { return this.reference.elementAt(index,) }


    public getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public getOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) { return this.reference.getOrElse(index, defaultValue,) }

    public atOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public atOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public atOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) { return this.reference.atOrElse(index, defaultValue,) }

    public elementAtOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public elementAtOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public elementAtOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) { return this.reference.elementAtOrElse(index, defaultValue,) }


    public getOrNull(index: number,): NullOr<T> { return this.reference.getOrNull(index,) }

    public atOrNull(index: number,): NullOr<T> { return this.reference.atOrNull(index,) }

    public elementAtOrNull(index: number,): NullOr<T> { return this.reference.elementAtOrNull(index,) }

    //#endregion -------------------- Get --------------------
    //#region -------------------- First --------------------

    public first(): T
    public first<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): S
    public first(predicate: Nullable<BooleanCallback<T>>,): T
    public first(predicate?: Nullable<BooleanCallback<T>>,) { return this.reference.first(predicate,) }

    public firstOrNull(): NullOr<T>
    public firstOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public firstOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
    public firstOrNull(predicate?: Nullable<BooleanCallback<T>>,) { return this.reference.firstOrNull(predicate,) }

    //#endregion -------------------- Firs --------------------
    //#region -------------------- Last --------------------

    public last(): T
    public last<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): S
    public last(predicate: Nullable<BooleanCallback<T>>,): T
    public last(predicate?: Nullable<BooleanCallback<T>>,) { return this.reference.last(predicate,) }

    public lastOrNull(): NullOr<T>
    public lastOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public lastOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
    public lastOrNull(predicate?: Nullable<BooleanCallback<T>>,) { return this.reference.lastOrNull(predicate,) }

    //#endregion -------------------- Last --------------------
    //#region -------------------- Find --------------------

    public find<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public find(predicate: BooleanCallback<T>,): NullOr<T>
    public find(predicate: BooleanCallback<T>,) { return this.reference.find(predicate,) }

    public findIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public findIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public findIndexed(predicate: ReverseBooleanCallback<T>,) { return this.reference.findIndexed(predicate,) }


    public findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public findLast(predicate: BooleanCallback<T>,): NullOr<T>
    public findLast(predicate: BooleanCallback<T>,) { return this.reference.findLast(predicate,) }

    public findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public findLastIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public findLastIndexed(predicate: ReverseBooleanCallback<T>,) { return this.reference.findLastIndexed(predicate,) }

    //#endregion -------------------- Find --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    public indexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber
    public indexOf(element: unknown, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber
    public indexOf(element: unknown, fromIndex?: NullableNumber, toIndex?: NullableNumber,) { return this.reference.indexOf(element, fromIndex, toIndex,) }


    public lastIndexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber
    public lastIndexOf(element: unknown, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber
    public lastIndexOf(element: unknown, fromIndex?: NullableNumber, toIndex?: NullableNumber,) { return this.reference.lastIndexOf(element, fromIndex, toIndex,) }


    public indexOfFirst(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber { return this.reference.indexOfFirst(predicate, fromIndex, toIndex,) }

    public indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber { return this.reference.indexOfFirstIndexed(predicate, fromIndex, toIndex,) }


    public indexOfLast(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber { return this.reference.indexOfLast(predicate, fromIndex, toIndex,) }

    public indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber { return this.reference.indexOfLastIndexed(predicate, fromIndex, toIndex,) }

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    //#region -------------------- All --------------------

    public all<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolder<S>
    public all(predicate: BooleanCallback<T>,): boolean
    public all(predicate: BooleanCallback<T>,) { return this.reference.all(predicate,) }

    public every<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolder<S>
    public every(predicate: BooleanCallback<T>,): boolean
    public every(predicate: BooleanCallback<T>,) { return this.reference.every(predicate,) }

    //#endregion -------------------- All --------------------
    //#region -------------------- Any --------------------

    public any(): this["isEmpty"]
    public any(predicate: Nullable<BooleanCallback<T>>,): boolean
    public any(predicate?: Nullable<BooleanCallback<T>>,) { return this.reference.any(predicate,) }

    public some(): this["isEmpty"]
    public some(predicate: Nullable<BooleanCallback<T>>,): boolean
    public some(predicate?: Nullable<BooleanCallback<T>>,) { return this.reference.some(predicate,) }

    //#endregion -------------------- Any --------------------
    //#region -------------------- None --------------------

    public none(): this["isNotEmpty"]
    public none(predicate: Nullable<BooleanCallback<T>>,): boolean
    public none(predicate?: Nullable<BooleanCallback<T>>,) { return this.reference.none(predicate,) }

    //#endregion -------------------- None --------------------

    //#region -------------------- Has null --------------------

    public get hasNull(): boolean { return this.reference.hasNull }
    public get includesNull(): this["hasNull"] { return this.reference.includesNull }
    public get containsNull(): this["hasNull"] { return this.reference.containsNull }

    //#endregion -------------------- Has null --------------------
    //#region -------------------- Has duplicate --------------------

    public get hasDuplicate(): boolean { return this.reference.hasDuplicate }
    public get includesDuplicate(): this["hasDuplicate"] { return this.reference.includesDuplicate }
    public get containsDuplicate(): this["hasDuplicate"] { return this.reference.containsDuplicate }

    //#endregion -------------------- Has duplicate --------------------

    //#region -------------------- Has --------------------

    public has(value: T,): boolean { return this.reference.has(value,) }

    public includes(value: T,): boolean { return this.reference.includes(value,) }

    public contains(value: T,): boolean { return this.reference.contains(value,) }

    //#endregion -------------------- Has --------------------
    //#region -------------------- Has one --------------------

    public hasOne(values: readonly T[],): boolean
    public hasOne(values: ReadonlySet<T>,): boolean
    public hasOne(values: CollectionHolder<T>,): boolean
    public hasOne(values: MinimalistCollectionHolder<T>,): boolean
    public hasOne(values: CollectionIterator<T>,): boolean
    public hasOne(values: Iterable<T>,): boolean
    public hasOne(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
    public hasOne(values: readonly unknown[],): boolean
    public hasOne(values: ReadonlySet<unknown>,): boolean
    public hasOne(values: CollectionHolder,): boolean
    public hasOne(values: MinimalistCollectionHolder,): boolean
    public hasOne(values: CollectionIterator,): boolean
    public hasOne(values: Iterable<unknown>,): boolean
    public hasOne(values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean
    public hasOne(values: PossibleIterableArraySetOrCollectionHolder<unknown>,) { return this.reference.hasOne(values,) }

    public includesOne(values: readonly T[],): boolean
    public includesOne(values: ReadonlySet<T>,): boolean
    public includesOne(values: CollectionHolder<T>,): boolean
    public includesOne(values: MinimalistCollectionHolder<T>,): boolean
    public includesOne(values: CollectionIterator<T>,): boolean
    public includesOne(values: Iterable<T>,): boolean
    public includesOne(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
    public includesOne(values: readonly unknown[],): boolean
    public includesOne(values: ReadonlySet<unknown>,): boolean
    public includesOne(values: CollectionHolder,): boolean
    public includesOne(values: MinimalistCollectionHolder,): boolean
    public includesOne(values: CollectionIterator,): boolean
    public includesOne(values: Iterable<unknown>,): boolean
    public includesOne(values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean
    public includesOne(values: PossibleIterableArraySetOrCollectionHolder<unknown>,) { return this.reference.includesOne(values,) }

    public containsOne(values: readonly T[],): boolean
    public containsOne(values: ReadonlySet<T>,): boolean
    public containsOne(values: CollectionHolder<T>,): boolean
    public containsOne(values: MinimalistCollectionHolder<T>,): boolean
    public containsOne(values: CollectionIterator<T>,): boolean
    public containsOne(values: Iterable<T>,): boolean
    public containsOne(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
    public containsOne(values: readonly unknown[],): boolean
    public containsOne(values: ReadonlySet<unknown>,): boolean
    public containsOne(values: CollectionHolder,): boolean
    public containsOne(values: MinimalistCollectionHolder,): boolean
    public containsOne(values: CollectionIterator,): boolean
    public containsOne(values: Iterable<unknown>,): boolean
    public containsOne(values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean
    public containsOne(values: PossibleIterableArraySetOrCollectionHolder<unknown>,) { return this.reference.containsOne(values,) }

    //#endregion -------------------- Has one --------------------
    //#region -------------------- Has all --------------------

    public hasAll(values: readonly T[],): boolean
    public hasAll(values: ReadonlySet<T>,): boolean
    public hasAll(values: CollectionHolder<T>,): boolean
    public hasAll(values: MinimalistCollectionHolder<T>,): boolean
    public hasAll(values: CollectionIterator<T>,): boolean
    public hasAll(values: Iterable<T>,): boolean
    public hasAll(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
    public hasAll(values: readonly unknown[],): boolean
    public hasAll(values: ReadonlySet<unknown>,): boolean
    public hasAll(values: CollectionHolder,): boolean
    public hasAll(values: MinimalistCollectionHolder,): boolean
    public hasAll(values: CollectionIterator,): boolean
    public hasAll(values: Iterable<unknown>,): boolean
    public hasAll(values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean
    public hasAll(values: PossibleIterableArraySetOrCollectionHolder<unknown>,) { return this.reference.hasAll(values,) }

    public includesAll(values: readonly T[],): boolean
    public includesAll(values: ReadonlySet<T>,): boolean
    public includesAll(values: CollectionHolder<T>,): boolean
    public includesAll(values: MinimalistCollectionHolder<T>,): boolean
    public includesAll(values: CollectionIterator<T>,): boolean
    public includesAll(values: Iterable<T>,): boolean
    public includesAll(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
    public includesAll(values: readonly unknown[],): boolean
    public includesAll(values: ReadonlySet<unknown>,): boolean
    public includesAll(values: CollectionHolder,): boolean
    public includesAll(values: MinimalistCollectionHolder,): boolean
    public includesAll(values: CollectionIterator,): boolean
    public includesAll(values: Iterable<unknown>,): boolean
    public includesAll(values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean
    public includesAll(values: PossibleIterableArraySetOrCollectionHolder<unknown>,) { return this.reference.includesAll(values,) }

    public containsAll(values: readonly T[],): boolean
    public containsAll(values: ReadonlySet<T>,): boolean
    public containsAll(values: CollectionHolder<T>,): boolean
    public containsAll(values: MinimalistCollectionHolder<T>,): boolean
    public containsAll(values: CollectionIterator<T>,): boolean
    public containsAll(values: Iterable<T>,): boolean
    public containsAll(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
    public containsAll(values: readonly unknown[],): boolean
    public containsAll(values: ReadonlySet<unknown>,): boolean
    public containsAll(values: CollectionHolder,): boolean
    public containsAll(values: MinimalistCollectionHolder,): boolean
    public containsAll(values: CollectionIterator,): boolean
    public containsAll(values: Iterable<unknown>,): boolean
    public containsAll(values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean
    public containsAll(values: PossibleIterableArraySetOrCollectionHolder<unknown>,) { return this.reference.containsAll(values,) }

    //#endregion -------------------- Has all --------------------

    //#region -------------------- Require no nulls --------------------

    public requireNoNulls(): CollectionHolder<NonNullable<T>> { return this.reference.requireNoNulls() }

    //#endregion -------------------- Require no nulls --------------------

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    public filter<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public filter(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public filter(predicate: BooleanCallback<T>,) { return this.reference.filter(predicate,) }

    public filterIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public filterIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public filterIndexed(predicate: ReverseBooleanCallback<T>,) { return this.reference.filterIndexed(predicate,) }

    public filterNot<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public filterNot(predicate: BooleanCallback<T>,) { return this.reference.filterNot(predicate,) }

    public filterNotIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public filterNotIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public filterNotIndexed(predicate: ReverseBooleanCallback<T>,) { return this.reference.filterNotIndexed(predicate,) }


    public filterNotNull(): CollectionHolder<NonNullable<T>> { return this.reference.filterNotNull() }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Slice --------------------

    public slice(indices: readonly number[],): CollectionHolder<T>
    public slice(indices: ReadonlySet<number>,): CollectionHolder<T>
    public slice(indices: CollectionHolder<number>,): CollectionHolder<T>
    public slice(indices: MinimalistCollectionHolder<number>,): CollectionHolder<T>
    public slice(indices: CollectionIterator<number>,): CollectionHolder<T>
    public slice(indices: Iterable<number>,): CollectionHolder<T>
    public slice(indices: PossibleIterableArraySetOrCollectionHolder<number>,): CollectionHolder<T>
    public slice(fromIndex?: NullableNumber, toIndex?: NullableNumber,): CollectionHolder<T>
    public slice(indicesOrFromIndex?: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number>, toIndex?: NullableNumber,): CollectionHolder<T>
    public slice(indicesOrFromIndex?: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number>, toIndex?: NullableNumber,) { return this.reference.slice(indicesOrFromIndex, toIndex,) }

    //#endregion -------------------- Slice --------------------
    //#region -------------------- Take --------------------

    public take(n: number,): CollectionHolder<T> { return this.reference.take(n,) }


    public takeWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public takeWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public takeWhile(predicate: BooleanCallback<T>,) { return this.reference.takeWhile(predicate,) }


    public takeWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public takeWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public takeWhileIndexed(predicate: ReverseBooleanCallback<T>,) { return this.reference.takeWhileIndexed(predicate,) }


    public takeLast(n: number,): CollectionHolder<T> { return this.reference.takeLast(n,) }

    public takeLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public takeLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public takeLastWhile(predicate: BooleanCallback<T>,) { return this.reference.takeLastWhile(predicate,) }

    public takeLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) { return this.reference.takeLastWhileIndexed(predicate,) }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Drop --------------------

    public drop(n: number,): CollectionHolder<T> { return this.reference.drop(n,) }

    public dropWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public dropWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public dropWhile(predicate: BooleanCallback<T>,) { return this.reference.dropWhile(predicate,) }

    public dropWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public dropWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public dropWhileIndexed(predicate: ReverseBooleanCallback<T>,) { return this.reference.dropWhileIndexed(predicate,) }


    public dropLast(n: number,): CollectionHolder<T> { return this.reference.dropLast(n,) }

    public dropLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public dropLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public dropLastWhile(predicate: BooleanCallback<T>,) { return this.reference.dropLastWhile(predicate,) }

    public dropLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) { return this.reference.dropLastWhileIndexed(predicate,) }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Map --------------------

    public map<const U, >(transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U> { return this.reference.map(transform,) }

    public mapIndexed<const U, >(transform: IndexValueWithReturnCallback<T, U>,): CollectionHolder<U> { return this.reference.mapIndexed(transform,) }


    public mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> { return this.reference.mapNotNull(transform,) }

    public mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> { return this.reference.mapNotNullIndexed(transform,) }

    //#endregion -------------------- Map --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- For each --------------------

    public forEach(action: ValueIndexCallback<T>,): void { this.reference.forEach(action,) }

    public forEachIndexed(action: IndexValueCallback<T>,): void { this.reference.forEachIndexed(action,) }

    //#endregion -------------------- For each --------------------
    //#region -------------------- On each --------------------

    public onEach(action: ValueIndexCallback<T>,): this {
        this.reference.onEach(action,)
        return this
    }

    public onEachIndexed(action: IndexValueCallback<T>,): this {
        this.reference.onEachIndexed(action,)
        return this
    }

    //#endregion -------------------- On each --------------------

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    //#region -------------------- To reverse --------------------

    public toReverse(fromIndex?: NullableNumber, toIndex?: NullableNumber,): CollectionHolder<T> { return this.reference.toReverse(fromIndex, toIndex,) }

    public toReversed(fromIndex?: NullableNumber, toIndex?: NullableNumber,): CollectionHolder<T> { return this.reference.toReversed(fromIndex, toIndex,) }

    public reversed(fromIndex?: NullableNumber, toIndex?: NullableNumber,): CollectionHolder<T> { return this.reference.reversed(fromIndex, toIndex,) }

    //#endregion -------------------- To reverse --------------------

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- Javascript methods --------------------

    public [Symbol.iterator](): CollectionIterator<T> { return this.reference[Symbol.iterator]() }

    public get [Symbol.toStringTag](): CollectionHolderName { return this.reference[Symbol.toStringTag] }

    //#endregion -------------------- Javascript methods --------------------
    //#region -------------------- Conversion methods --------------------

    //#region -------------------- To other structure --------------------

    public toIterator(): CollectionIterator<T> { return this.reference.toIterator() }

    public toArray(): readonly T[] { return this.reference.toArray() }
    public toMutableArray(): T[] { return this.reference.toMutableArray() }

    public toSet(): ReadonlySet<T> { return this.reference.toSet() }
    public toMutableSet(): Set<T> { return this.reference.toMutableSet() }

    public toMap(): ReadonlyMap<number, T> { return this.reference.toMap() }
    public toMutableMap(): Map<number, T> { return this.reference.toMutableMap() }

    //#endregion -------------------- To other structure --------------------
    //#region -------------------- To string --------------------

    public toString(): string { return this.reference.toString() }

    public toLocaleString(locale?: NullableString,): string { return this.reference.toLocaleString(locale,) }


    public toLowerCaseString(): string { return this.reference.toLowerCaseString() }

    public toLocaleLowerCaseString(locale?: NullableString,): string { return this.reference.toLocaleLowerCaseString(locale,) }


    public toUpperCaseString(): string { return this.reference.toUpperCaseString() }

    public toLocaleUpperCaseString(locale?: NullableString,): string { return this.reference.toLocaleUpperCaseString(locale,) }

    //#endregion -------------------- To string --------------------
    //#region -------------------- Join to string --------------------

    public join(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string { return this.reference.join(separator, prefix, postfix, limit, truncated, transform,) }

    public joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string { return this.reference.joinToString(separator, prefix, postfix, limit, truncated, transform,) }

    //#endregion -------------------- Join to string --------------------

    //#endregion -------------------- Conversion methods --------------------

}

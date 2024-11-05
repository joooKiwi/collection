/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullableNumber, NullableString, NullOr, NullOrNumber, TemplateOrNumber} from "@joookiwi/type"

import type {CollectionHolder}                                                                                                                                                                                                                                  from "../../src/CollectionHolder"
import type {CollectionIterator}                                                                                                                                                                                                                                from "../../src/iterator/CollectionIterator"
import type {MinimalistCollectionHolder}                                                                                                                                                                                                                        from "../../src/MinimalistCollectionHolder"
import type {BooleanCallback, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, RestrainedBooleanCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, StringCallback, ValueIndexCallback, ValueIndexWithReturnCallback} from "../../src/type/callback"
import type {PossibleIterableArraySetOrCollectionHolder}                                                                                                                                                                                                        from "../../src/type/possibleInstance"
import type {CollectionHolderName}                                                                                                                                                                                                                              from "../../src/type/toStringTag"

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
    public getFirst(): T { return this.reference.getFirst() }
    public getLast(): T { return this.reference.getLast() }

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
    public getFirstOrNull(): NullOr<T> { return this.reference.getFirstOrNull() }
    public getLastOrNull(): NullOr<T> { return this.reference.getLastOrNull() }

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

    public firstIndexed(): T
    public firstIndexed<const S extends T, >(predicate: Nullable<ReverseRestrainedBooleanCallback<T, S>>,): S
    public firstIndexed(predicate: Nullable<ReverseBooleanCallback<T>>,): T
    public firstIndexed(predicate?: Nullable<ReverseBooleanCallback<T>>,) { return this.reference.firstIndexed(predicate,) }

    public firstIndexedOrNull(): NullOr<T>
    public firstIndexedOrNull<const S extends T, >(predicate: Nullable<ReverseRestrainedBooleanCallback<T, S>>,): NullOr<S>
    public firstIndexedOrNull(predicate: Nullable<ReverseBooleanCallback<T>>,): NullOr<T>
    public firstIndexedOrNull(predicate?: Nullable<ReverseBooleanCallback<T>>,) { return this.reference.firstIndexedOrNull(predicate,) }

    //#endregion -------------------- First --------------------
    //#region -------------------- Last --------------------

    public last(): T
    public last<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): S
    public last(predicate: Nullable<BooleanCallback<T>>,): T
    public last(predicate?: Nullable<BooleanCallback<T>>,) { return this.reference.last(predicate,) }

    public lastOrNull(): NullOr<T>
    public lastOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public lastOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
    public lastOrNull(predicate?: Nullable<BooleanCallback<T>>,) { return this.reference.lastOrNull(predicate,) }

    public lastIndexed(): T
    public lastIndexed<const S extends T, >(predicate: Nullable<ReverseRestrainedBooleanCallback<T, S>>,): S
    public lastIndexed(predicate: Nullable<ReverseBooleanCallback<T>>,): T
    public lastIndexed(predicate?: Nullable<ReverseBooleanCallback<T>>,) { return this.reference.lastIndexed(predicate,) }

    public lastIndexedOrNull(): NullOr<T>
    public lastIndexedOrNull<const S extends T, >(predicate: Nullable<ReverseRestrainedBooleanCallback<T, S>>,): NullOr<S>
    public lastIndexedOrNull(predicate: Nullable<ReverseBooleanCallback<T>>,): NullOr<T>
    public lastIndexedOrNull(predicate?: Nullable<ReverseBooleanCallback<T>>,) { return this.reference.lastIndexedOrNull(predicate,) }

    //#endregion -------------------- Last --------------------
    //#region -------------------- Find first --------------------

    public findFirst<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public findFirst(predicate: BooleanCallback<T>,): T
    public findFirst(predicate: BooleanCallback<T>,) { return this.reference.findFirst(predicate,) }

    public find<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public find(predicate: BooleanCallback<T>,): T
    public find(predicate: BooleanCallback<T>,) { return this.reference.find(predicate,) }


    public findFirstOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public findFirstOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public findFirstOrNull(predicate: BooleanCallback<T>,) { return this.reference.findFirstOrNull(predicate,) }

    public findOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public findOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public findOrNull(predicate: BooleanCallback<T>,) { return this.reference.findOrNull(predicate,) }


    public findFirstIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public findFirstIndexed(predicate: ReverseBooleanCallback<T>,): T
    public findFirstIndexed(predicate: ReverseBooleanCallback<T>,) { return this.reference.findFirstIndexed(predicate,) }

    public findIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public findIndexed(predicate: ReverseBooleanCallback<T>,): T
    public findIndexed(predicate: ReverseBooleanCallback<T>,) { return this.reference.findIndexed(predicate,) }


    public findFirstIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,) { return this.reference.findFirstIndexedOrNull(predicate,) }

    public findIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public findIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public findIndexedOrNull(predicate: ReverseBooleanCallback<T>,) { return this.reference.findIndexedOrNull(predicate,) }

    //#endregion -------------------- Find first --------------------
    //#region -------------------- Find last --------------------

    public findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public findLast(predicate: BooleanCallback<T>,): T
    public findLast(predicate: BooleanCallback<T>,) { return this.reference.findLast(predicate,) }

    public findLastOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public findLastOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public findLastOrNull(predicate: BooleanCallback<T>,) { return this.reference.findLastOrNull(predicate,) }

    public findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public findLastIndexed(predicate: ReverseBooleanCallback<T>,): T
    public findLastIndexed(predicate: ReverseBooleanCallback<T>,) { return this.reference.findLastIndexed(predicate,) }

    public findLastIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,) { return this.reference.findLastIndexedOrNull(predicate,) }

    //#endregion -------------------- Find last --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    public firstIndexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber,): number { return this.reference.firstIndexOf(element, fromIndex, toIndex,) }
    public indexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber,): number { return this.reference.indexOf(element, fromIndex, toIndex,) }
    public firstIndexOfOrNull(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber { return this.reference.firstIndexOfOrNull(element, fromIndex, toIndex,) }
    public indexOfOrNull(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber { return this.reference.indexOfOrNull(element, fromIndex, toIndex,) }

    public lastIndexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber,): number { return this.reference.lastIndexOf(element, fromIndex, toIndex,) }
    public lastIndexOfOrNull(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber { return this.reference.lastIndexOfOrNull(element, fromIndex, toIndex,) }

    public indexOfFirst(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): number { return this.reference.indexOfFirst(predicate, fromIndex, toIndex,) }
    public findFirstIndex(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): number { return this.reference.findFirstIndex(predicate, fromIndex, toIndex,) }
    public findIndex(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): number { return this.reference.findIndex(predicate, fromIndex, toIndex,) }
    public indexOfFirstOrNull(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber { return this.reference.indexOfFirstOrNull(predicate, fromIndex, toIndex,) }
    public findFirstIndexOrNull(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber { return this.reference.findFirstIndexOrNull(predicate, fromIndex, toIndex,) }
    public findIndexOrNull(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber { return this.reference.findIndexOrNull(predicate, fromIndex, toIndex,) }

    public indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): number { return this.reference.indexOfFirstIndexed(predicate, fromIndex, toIndex,) }
    public findFirstIndexIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): number { return this.reference.findFirstIndexIndexed(predicate, fromIndex, toIndex,) }
    public findIndexIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): number { return this.reference.findIndexIndexed(predicate, fromIndex, toIndex,) }
    public indexOfFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber { return this.reference.indexOfFirstIndexedOrNull(predicate, fromIndex, toIndex,) }
    public findFirstIndexIndexedOrNull(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber { return this.reference.findFirstIndexIndexedOrNull(predicate, fromIndex, toIndex,) }
    public findIndexIndexedOrNull(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber { return this.reference.findIndexIndexedOrNull(predicate, fromIndex, toIndex,) }

    public indexOfLast(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): number { return this.reference.indexOfLast(predicate, fromIndex, toIndex,) }
    public findLastIndex(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): number { return this.reference.findLastIndex(predicate, fromIndex, toIndex,) }
    public indexOfLastOrNull(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber { return this.reference.indexOfLastOrNull(predicate, fromIndex, toIndex,) }
    public findLastIndexOrNull(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber { return this.reference.findLastIndexOrNull(predicate, fromIndex, toIndex,) }

    public indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): number { return this.reference.indexOfLastIndexed(predicate, fromIndex, toIndex,) }
    public findLastIndexIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): number { return this.reference.findLastIndexIndexed(predicate, fromIndex, toIndex,) }
    public indexOfLastIndexedOrNull(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber { return this.reference.indexOfLastIndexedOrNull(predicate, fromIndex, toIndex,) }
    public findLastIndexIndexedOrNull(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber { return this.reference.findLastIndexIndexedOrNull(predicate, fromIndex, toIndex,) }

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
    public hasOne(values: PossibleIterableArraySetOrCollectionHolder<T>,) { return this.reference.hasOne(values,) }

    public includesOne(values: readonly T[],): boolean
    public includesOne(values: ReadonlySet<T>,): boolean
    public includesOne(values: CollectionHolder<T>,): boolean
    public includesOne(values: MinimalistCollectionHolder<T>,): boolean
    public includesOne(values: CollectionIterator<T>,): boolean
    public includesOne(values: Iterable<T>,): boolean
    public includesOne(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
    public includesOne(values: PossibleIterableArraySetOrCollectionHolder<T>,) { return this.reference.includesOne(values,) }

    public containsOne(values: readonly T[],): boolean
    public containsOne(values: ReadonlySet<T>,): boolean
    public containsOne(values: CollectionHolder<T>,): boolean
    public containsOne(values: MinimalistCollectionHolder<T>,): boolean
    public containsOne(values: CollectionIterator<T>,): boolean
    public containsOne(values: Iterable<T>,): boolean
    public containsOne(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
    public containsOne(values: PossibleIterableArraySetOrCollectionHolder<T>,) { return this.reference.containsOne(values,) }

    //#endregion -------------------- Has one --------------------
    //#region -------------------- Has all --------------------

    public hasAll(values: readonly T[],): boolean
    public hasAll(values: ReadonlySet<T>,): boolean
    public hasAll(values: CollectionHolder<T>,): boolean
    public hasAll(values: MinimalistCollectionHolder<T>,): boolean
    public hasAll(values: CollectionIterator<T>,): boolean
    public hasAll(values: Iterable<T>,): boolean
    public hasAll(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
    public hasAll(values: PossibleIterableArraySetOrCollectionHolder<T>,) { return this.reference.hasAll(values,) }

    public includesAll(values: readonly T[],): boolean
    public includesAll(values: ReadonlySet<T>,): boolean
    public includesAll(values: CollectionHolder<T>,): boolean
    public includesAll(values: MinimalistCollectionHolder<T>,): boolean
    public includesAll(values: CollectionIterator<T>,): boolean
    public includesAll(values: Iterable<T>,): boolean
    public includesAll(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
    public includesAll(values: PossibleIterableArraySetOrCollectionHolder<T>,) { return this.reference.includesAll(values,) }

    public containsAll(values: readonly T[],): boolean
    public containsAll(values: ReadonlySet<T>,): boolean
    public containsAll(values: CollectionHolder<T>,): boolean
    public containsAll(values: MinimalistCollectionHolder<T>,): boolean
    public containsAll(values: CollectionIterator<T>,): boolean
    public containsAll(values: Iterable<T>,): boolean
    public containsAll(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
    public containsAll(values: PossibleIterableArraySetOrCollectionHolder<T>,) { return this.reference.containsAll(values,) }

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

    public limit(n: number,): CollectionHolder<T> { return this.reference.limit(n,) }


    public takeWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public takeWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public takeWhile(predicate: BooleanCallback<T>,) { return this.reference.takeWhile(predicate,) }

    public limitWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public limitWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public limitWhile(predicate: BooleanCallback<T>,) { return this.reference.limitWhile(predicate,) }


    public takeWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public takeWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public takeWhileIndexed(predicate: ReverseBooleanCallback<T>,) { return this.reference.takeWhileIndexed(predicate,) }

    public limitWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public limitWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public limitWhileIndexed(predicate: ReverseBooleanCallback<T>,) { return this.reference.limitWhileIndexed(predicate,) }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Take last --------------------

    public takeLast(n: number,): CollectionHolder<T> { return this.reference.takeLast(n,) }

    public limitLast(n: number,): CollectionHolder<T> { return this.reference.limitLast(n,) }


    public takeLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public takeLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public takeLastWhile(predicate: BooleanCallback<T>,) { return this.reference.takeLastWhile(predicate,) }

    public limitLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public limitLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public limitLastWhile(predicate: BooleanCallback<T>,) { return this.reference.limitLastWhile(predicate,) }


    public takeLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) { return this.reference.takeLastWhileIndexed(predicate,) }

    public limitLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public limitLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public limitLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) { return this.reference.limitLastWhileIndexed(predicate,) }

    //#endregion -------------------- Take end --------------------
    //#region -------------------- Drop --------------------

    public drop(n: number,): CollectionHolder<T> { return this.reference.drop(n,) }

    public skip(n: number,): CollectionHolder<T> { return this.reference.skip(n,) }


    public dropWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public dropWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public dropWhile(predicate: BooleanCallback<T>,) { return this.reference.dropWhile(predicate,) }

    public skipWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public skipWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public skipWhile(predicate: BooleanCallback<T>,) { return this.reference.skipWhile(predicate,) }


    public dropWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public dropWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public dropWhileIndexed(predicate: ReverseBooleanCallback<T>,) { return this.reference.dropWhileIndexed(predicate,) }

    public skipWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public skipWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public skipWhileIndexed(predicate: ReverseBooleanCallback<T>,) { return this.reference.skipWhileIndexed(predicate,) }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Drop last --------------------

    public dropLast(n: number,): CollectionHolder<T> { return this.reference.dropLast(n,) }

    public skipLast(n: number,): CollectionHolder<T> { return this.reference.skipLast(n,) }


    public dropLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public dropLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public dropLastWhile(predicate: BooleanCallback<T>,) { return this.reference.dropLastWhile(predicate,) }

    public skipLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public skipLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public skipLastWhile(predicate: BooleanCallback<T>,) { return this.reference.skipLastWhile(predicate,) }


    public dropLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) { return this.reference.dropLastWhileIndexed(predicate,) }

    public skipLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public skipLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public skipLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) { return this.reference.skipLastWhileIndexed(predicate,) }

    //#endregion -------------------- Drop last --------------------

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
    //#region -------------------- JavaScript methods --------------------

    public [Symbol.iterator](): CollectionIterator<T> { return this.reference[Symbol.iterator]() }

    public get [Symbol.toStringTag](): CollectionHolderName { return this.reference[Symbol.toStringTag] }

    //#endregion -------------------- JavaScript methods --------------------
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

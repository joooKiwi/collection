/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullableNumber, NullableString, NullOr, NullOrNumber, TemplateOrNumber} from "@joookiwi/type"

import type {CollectionHolder}                                                                                                                                                                                                                                                                                                              from "../../src/CollectionHolder"
import type {BooleanCallback, CollectionHolderName, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, ObjectOf, PossibleIterableArraySetOrCollectionHolder, RestrainedBooleanCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, StringCallback, ValueIndexCallback, ValueIndexWithReturnCallback} from "../../src/CollectionHolder.types"
import type {CollectionIterator}                                                                                                                                                                                                                                                                                                            from "../../src/iterator/CollectionIterator"
import type {MinimalistCollectionHolder}                                                                                                                                                                                                                                                                                                    from "../../src/MinimalistCollectionHolder"

import {GenericCollectionHolder} from "../../src/GenericCollectionHolder"

export class CollectionHolder_ByStructure<const out T, >
    implements CollectionHolder<T> {

    [index: TemplateOrNumber]: undefined
    readonly #internalReference: GenericCollectionHolder<T>

    public constructor(reference: PossibleIterableArraySetOrCollectionHolder<T> | (() => PossibleIterableArraySetOrCollectionHolder<T>),) { this.#internalReference = new GenericCollectionHolder(reference,) }

    //#region -------------------- Getter methods --------------------

    public get size(): number { return this.#internalReference.size }
    public get length(): this["size"] { return this.#internalReference.length }
    public get count(): this["size"] { return this.#internalReference.count }

    public get isEmpty(): boolean { return this.#internalReference.isEmpty }
    public get isNotEmpty(): boolean { return this.#internalReference.isNotEmpty }

    public get hasNull(): boolean { return this.#internalReference.hasNull }
    public get includesNull(): this["hasNull"] { return this.#internalReference.includesNull }
    public get containsNull(): this["hasNull"] { return this.#internalReference.containsNull }

    public get hasDuplicate(): boolean { return this.#internalReference.hasDuplicate }
    public get includesDuplicate(): this["hasDuplicate"] { return this.#internalReference.includesDuplicate }
    public get containsDuplicate(): this["hasDuplicate"] { return this.#internalReference.containsDuplicate }

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Value methods (get) --------------------

    public get(index: number,): T { return this.#internalReference.get(index,) }

    public at(index: number,): T { return this.#internalReference.at(index,) }

    public elementAt(index: number,): T { return this.#internalReference.elementAt(index,) }


    public getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,) { return this.#internalReference.getOrElse(index, defaultValue,) }

    public atOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public atOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public atOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,) { return this.#internalReference.atOrElse(index, defaultValue,) }

    public elementAtOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public elementAtOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public elementAtOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,) { return this.#internalReference.elementAtOrElse(index, defaultValue,) }


    public getOrNull(index: number,): NullOr<T> { return this.#internalReference.getOrNull(index,) }

    public atOrNull(index: number,): NullOr<T> { return this.#internalReference.atOrNull(index,) }

    public elementAtOrNull(index: number,): NullOr<T> { return this.#internalReference.elementAtOrNull(index,) }

    //#endregion -------------------- Value methods (get) --------------------
    //#region -------------------- Value methods (index) --------------------

    public indexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
    public indexOf(element: unknown, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
    public indexOf(element: unknown, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,) { return this.#internalReference.indexOf(element, fromIndex, toIndex, limit,) }

    public lastIndexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
    public lastIndexOf(element: unknown, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
    public lastIndexOf(element: unknown, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,) { return this.#internalReference.lastIndexOf(element, fromIndex, toIndex, limit,) }

    public indexOfFirst(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber { return this.#internalReference.indexOfFirst(predicate, fromIndex, toIndex, limit,) }

    public indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber { return this.#internalReference.indexOfFirstIndexed(predicate, fromIndex, toIndex, limit,) }

    public indexOfLast(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber { return this.#internalReference.indexOfLast(predicate, fromIndex, toIndex, limit,) }

    public indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber { return this.#internalReference.indexOfLastIndexed(predicate, fromIndex, toIndex, limit,) }

    //#endregion -------------------- Value methods (index) --------------------
    //#region -------------------- Value methods (first) --------------------

    public first(): T
    public first<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): S
    public first(predicate: Nullable<BooleanCallback<T>>,): T
    public first(predicate?: Nullable<BooleanCallback<T>>,) { return this.#internalReference.first(predicate,) }

    public firstOrNull(): NullOr<T>
    public firstOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public firstOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
    public firstOrNull(predicate?: Nullable<BooleanCallback<T>>,) { return this.#internalReference.firstOrNull(predicate,) }

    //#endregion -------------------- Value methods (first) --------------------
    //#region -------------------- Value methods (last) --------------------

    public last(): T
    public last<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): S
    public last(predicate: Nullable<BooleanCallback<T>>,): T
    public last(predicate?: Nullable<BooleanCallback<T>>,) { return this.#internalReference.last(predicate,) }

    public lastOrNull(): NullOr<T>
    public lastOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public lastOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
    public lastOrNull(predicate?: Nullable<BooleanCallback<T>>,) { return this.#internalReference.lastOrNull(predicate,) }

    //#endregion -------------------- Value methods (last) --------------------

    //#region -------------------- Loop methods (all/any/none) --------------------

    public all(predicate: BooleanCallback<T>,): boolean { return this.#internalReference.all(predicate,) }

    public any(): this["isEmpty"]
    public any(predicate: Nullable<BooleanCallback<T>>,): boolean
    public any(predicate?: Nullable<BooleanCallback<T>>,) { return this.#internalReference.any(predicate,) }

    public none(): this["isNotEmpty"]
    public none(predicate: Nullable<BooleanCallback<T>>,): boolean
    public none(predicate?: Nullable<BooleanCallback<T>>,) { return this.#internalReference.none(predicate,) }

    //#endregion -------------------- Loop methods (all/any/none) --------------------
    //#region -------------------- Loop methods (has) --------------------

    public has(value: T,): boolean
    public has(...values: readonly T[]): boolean
    public has(value: unknown,): boolean
    public has(...values: readonly unknown[]): boolean
    public has() { return this.#internalReference.has(...arguments,) }

    public includes(value: T,): boolean
    public includes(...values: readonly T[]): boolean
    public includes(value: unknown,): boolean
    public includes(...values: readonly unknown[]): boolean
    public includes() { return this.#internalReference.includes(...arguments,) }

    public contains(value: T,): boolean
    public contains(...values: readonly T[]): boolean
    public contains(value: unknown,): boolean
    public contains(...values: readonly unknown[]): boolean
    public contains() { return this.#internalReference.contains(...arguments,) }


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
    public hasOne(...values: readonly T[]): boolean
    public hasOne(...values: readonly unknown[]): boolean
    public hasOne() { return this.#internalReference.hasOne(...arguments,) }

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
    public includesOne(...values: readonly T[]): boolean
    public includesOne(...values: readonly unknown[]): boolean
    public includesOne() { return this.#internalReference.includesOne(...arguments,) }

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
    public containsOne(...values: readonly T[]): boolean
    public containsOne(...values: readonly unknown[]): boolean
    public containsOne() { return this.#internalReference.containsOne(...arguments,) }


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
    public hasAll(...values: readonly T[]): boolean
    public hasAll(...values: readonly unknown[]): boolean
    public hasAll() { return this.#internalReference.hasAll(...arguments,) }

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
    public includesAll(...values: readonly T[]): boolean
    public includesAll(...values: readonly unknown[]): boolean
    public includesAll() { return this.#internalReference.includesAll(...arguments,) }

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
    public containsAll(...values: readonly T[]): boolean
    public containsAll(...values: readonly unknown[]): boolean
    public containsAll() { return this.#internalReference.containsAll(...arguments,) }

    //#endregion -------------------- Loop methods (has) --------------------
    //#region -------------------- Loop methods (join to string) --------------------

    public join(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string { return this.#internalReference.join(separator, prefix, postfix, limit, truncated, transform,) }

    public joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string { return this.#internalReference.joinToString(separator, prefix, postfix, limit, truncated, transform,) }

    //#endregion -------------------- Loop methods (join to string) --------------------
    //#region -------------------- Loop methods (filter) --------------------

    public filter<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public filter(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public filter(predicate: BooleanCallback<T>,) { return this.#internalReference.filter(predicate,) }

    public filterIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public filterIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public filterIndexed(predicate: ReverseBooleanCallback<T>,) { return this.#internalReference.filterIndexed(predicate,) }

    public filterNot<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public filterNot(predicate: BooleanCallback<T>,) { return this.#internalReference.filterNot(predicate,) }

    public filterIndexedNot<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public filterIndexedNot(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public filterIndexedNot(predicate: ReverseBooleanCallback<T>,) { return this.#internalReference.filterIndexedNot(predicate,) }

    public filterNotIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public filterNotIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public filterNotIndexed(predicate: ReverseBooleanCallback<T>,) { return this.#internalReference.filterNotIndexed(predicate,) }


    public filterNotNull(): CollectionHolder<NonNullable<T>> { return this.#internalReference.filterNotNull() }

    public requireNoNulls(): CollectionHolder<NonNullable<T>> { return this.#internalReference.requireNoNulls() }

    //#endregion -------------------- Loop methods (filter) --------------------
    //#region -------------------- Loop methods (find) --------------------

    public find<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public find(predicate: BooleanCallback<T>,): NullOr<T>
    public find(predicate: BooleanCallback<T>,) { return this.#internalReference.find(predicate,) }

    public findIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public findIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public findIndexed(predicate: ReverseBooleanCallback<T>,) { return this.#internalReference.findIndexed(predicate,) }

    public findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public findLast(predicate: BooleanCallback<T>,): NullOr<T>
    public findLast(predicate: BooleanCallback<T>,) { return this.#internalReference.findLast(predicate,) }

    public findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public findLastIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public findLastIndexed(predicate: ReverseBooleanCallback<T>,) { return this.#internalReference.findLastIndexed(predicate,) }

    //#endregion -------------------- Loop methods (find) --------------------
    //#region -------------------- Loop methods (slice) --------------------

    public slice(indices: readonly number[],): CollectionHolder<T>
    public slice(indices: ReadonlySet<number>,): CollectionHolder<T>
    public slice(indices: CollectionHolder<number>,): CollectionHolder<T>
    public slice(indices: MinimalistCollectionHolder<number>,): CollectionHolder<T>
    public slice(indices: CollectionIterator<number>,): CollectionHolder<T>
    public slice(indices: Iterable<number>,): CollectionHolder<T>
    public slice(indices: PossibleIterableArraySetOrCollectionHolder<number>,): CollectionHolder<T>
    public slice(fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T>
    public slice(indicesOrFromIndex?: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number>, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T>
    public slice(indicesOrFromIndex?: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number>, toIndex?: NullableNumber, limit?: NullableNumber,) { return this.#internalReference.slice(indicesOrFromIndex, toIndex, limit,) }

    //#endregion -------------------- Loop methods (slice) --------------------
    //#region -------------------- Loop methods (map) --------------------

    public map<const U, >(transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U> { return this.#internalReference.map(transform,) }

    public mapIndexed<const U, >(transform: IndexValueWithReturnCallback<T, U>,): CollectionHolder<U> { return this.#internalReference.mapIndexed(transform,) }


    public mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> { return this.#internalReference.mapNotNull(transform,) }

    public mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> { return this.#internalReference.mapNotNullIndexed(transform,) }

    //#endregion -------------------- Loop methods (map) --------------------
    //#region -------------------- Loop methods (for each) --------------------

    public forEach(action: ValueIndexCallback<T>,): this {
        this.#internalReference.forEach(action,)
        return this
    }

    public forEachIndexed(action: IndexValueCallback<T>,): this {
        this.#internalReference.forEachIndexed(action,)
        return this
    }


    //#endregion -------------------- Loop methods (for each) --------------------

    //#region -------------------- Javascript methods --------------------

    public [Symbol.iterator](): CollectionIterator<T> { return this.#internalReference[Symbol.iterator]() }

    public get [Symbol.toStringTag](): CollectionHolderName { return this.#internalReference[Symbol.toStringTag] }

    //#endregion -------------------- Javascript methods --------------------

    //#region -------------------- Conversion methods (other kind) --------------------

    public get objectValuesMap(): ReadonlyMap<T, ObjectOf<T>> { return this.#internalReference.objectValuesMap }

    public toIterator(): CollectionIterator<T> { return this.#internalReference.toIterator() }

    public toArray(): readonly T[] { return this.#internalReference.toArray() }
    public toMutableArray(): T[] { return this.#internalReference.toMutableArray() }

    public toSet(): ReadonlySet<T> { return this.#internalReference.toSet() }
    public toMutableSet(): Set<T> { return this.#internalReference.toMutableSet() }

    public toWeakSet(): Readonly<WeakSet<ObjectOf<T>>> { return this.#internalReference.toWeakSet() }
    public toMutableWeakSet(): WeakSet<ObjectOf<T>> { return this.#internalReference.toMutableWeakSet() }

    public toMap(): ReadonlyMap<number, T> { return this.#internalReference.toMap() }
    public toMutableMap(): Map<number, T> { return this.#internalReference.toMutableMap() }

    //#endregion -------------------- Conversion methods (other kind) --------------------
    //#region -------------------- Conversion methods (reverse) --------------------

    public toReverse(fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T> { return this.#internalReference.toReverse(fromIndex, toIndex, limit,) }

    public toReversed(fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T> { return this.#internalReference.toReversed(fromIndex, toIndex, limit,) }

    public reversed(fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T> { return this.#internalReference.reversed(fromIndex, toIndex, limit,) }

    //#endregion -------------------- Conversion methods (reverse) --------------------
    //#region -------------------- Conversion methods (string) --------------------

    public toString(): string { return this.#internalReference.toString() }

    public toLocaleString(locale?: NullableString,): string { return this.#internalReference.toLocaleString(locale,) }


    public toLowerCaseString(): string { return this.#internalReference.toLowerCaseString() }

    public toLocaleLowerCaseString(locale?: NullableString,): string { return this.#internalReference.toLocaleLowerCaseString(locale,) }


    public toUpperCaseString(): string { return this.#internalReference.toUpperCaseString() }

    public toLocaleUpperCaseString(locale?: NullableString,): string { return this.#internalReference.toLocaleUpperCaseString(locale,) }

    //#endregion -------------------- Conversion methods (string) --------------------

    //#endregion -------------------- Methods --------------------

}

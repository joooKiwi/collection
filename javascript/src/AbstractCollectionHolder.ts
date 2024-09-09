/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullableNumber, NullableString, NullOr, NullOrNumber, TemplateOrNumber, UndefinedOr} from "@joookiwi/type"

import type {BooleanCallback, CollectionHolderName, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, PossibleIterableArraySetOrCollectionHolder, RestrainedBooleanCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, StringCallback, ValueIndexCallback, ValueIndexWithReturnCallback} from "./CollectionHolder.types"
import type {CollectionHolder}                                                                                                                                                                                                                                                                                                    from "./CollectionHolder"
import type {MinimalistCollectionHolder}                                                                                                                                                                                                                                                                                          from "./MinimalistCollectionHolder"
import type {CollectionIterator}                                                                                                                                                                                                                                                                                                  from "./iterator/CollectionIterator"

import {AbstractMinimalistCollectionHolder}        from "./AbstractMinimalistCollectionHolder"
import {all}                                       from "./method/collectionHolder/all"
import {any}                                       from "./method/collectionHolder/any"
import {filter}                                    from "./method/collectionHolder/filter"
import {filterIndexed}                             from "./method/collectionHolder/filterIndexed"
import {filterNot}                                 from "./method/collectionHolder/filterNot"
import {filterNotIndexed}                          from "./method/collectionHolder/filterNotIndexed"
import {filterNotNullByCollectionHolder}           from "./method/filterNotNull"
import {findByCollectionHolder}                    from "./method/find"
import {findIndexedByCollectionHolder}             from "./method/findIndexed"
import {findLastByCollectionHolder}                from "./method/findLast"
import {findLastIndexedByCollectionHolder}         from "./method/findLastIndexed"
import {firstByCollectionHolder}                   from "./method/first"
import {firstOrNullByCollectionHolder}             from "./method/firstOrNull"
import {forEach}                                   from "./method/collectionHolder/forEach"
import {forEachIndexed}                            from "./method/collectionHolder/forEachIndexed"
import {getOrElse}                                 from "./method/collectionHolder/getOrElse"
import {getOrNull}                                 from "./method/collectionHolder/getOrNull"
import {hasByCollectionHolder}                     from "./method/has"
import {hasAllByCollectionHolder}                  from "./method/hasAll"
import {hasNullByCollectionHolder}                 from "./method/hasNull"
import {hasDuplicateByCollectionHolder}            from "./method/hasDuplicate"
import {hasOneByCollectionHolder}                  from "./method/hasOne"
import {indexOfByCollectionHolder}                 from "./method/indexOf"
import {indexOfFirstByCollectionHolder}            from "./method/indexOfFirst"
import {indexOfFirstIndexedByCollectionHolder}     from "./method/indexOfFirstIndexed"
import {indexOfLastByCollectionHolder}             from "./method/indexOfLast"
import {indexOfLastIndexedByCollectionHolder}      from "./method/indexOfLastIndexed"
import {joinToStringByCollectionHolder}            from "./method/joinToString"
import {lastByCollectionHolder}                    from "./method/last"
import {lastIndexOfByCollectionHolder}             from "./method/lastIndexOf"
import {lastOrNullByCollectionHolder}              from "./method/lastOrNull"
import {none}                                      from "./method/collectionHolder/none"
import {mapByCollectionHolder}                     from "./method/map"
import {mapIndexedByCollectionHolder}              from "./method/mapIndexed"
import {mapNotNullByCollectionHolder}              from "./method/mapNotNull"
import {mapNotNullIndexedByCollectionHolder}       from "./method/mapNotNullIndexed"
import {onEach}                                    from "./method/collectionHolder/onEach"
import {onEachIndexed}                             from "./method/collectionHolder/onEachIndexed"
import {requireNoNullsByCollectionHolder}          from "./method/requireNoNulls"
import {sliceByCollectionHolder}                   from "./method/slice"
import {toArrayByCollectionHolder}                 from "./method/toArray"
import {toIteratorByCollectionHolder}              from "./method/toIterator"
import {toLocaleLowerCaseStringByCollectionHolder} from "./method/toLocaleLowerCaseString"
import {toLocaleStringByCollectionHolder}          from "./method/toLocaleString"
import {toLocaleUpperCaseStringByCollectionHolder} from "./method/toLocaleUpperCaseString"
import {toLowerCaseStringByCollectionHolder}       from "./method/toLowerCaseString"
import {toMapByCollectionHolder}                   from "./method/toMap"
import {toMutableArrayByCollectionHolder}          from "./method/toMutableArray"
import {toMutableSetByCollectionHolder}            from "./method/toMutableSet"
import {toMutableMapByCollectionHolder}            from "./method/toMutableMap"
import {toReverseByCollectionHolder}               from "./method/toReverse"
import {toSetByCollectionHolder}                   from "./method/toSet"
import {toStringByCollectionHolder}                from "./method/toString"
import {toUpperCaseStringByCollectionHolder}       from "./method/toUpperCaseString"

/**
 * A definition of a {@link CollectionHolder} to have a common ancestor.
 * No state or reference is held in this instance.
 * It only uses the extension function for the methods implementation
 *
 * @note This class should be inherited if new classes are being made to be more usable by the tools
 * @see EmptyCollectionHolder
 * @see GenericCollectionHolder
 * @see LazyGenericCollectionHolder
 */
export abstract class AbstractCollectionHolder<const T = unknown, >
    extends AbstractMinimalistCollectionHolder<T>
    implements CollectionHolder<T> {

    //#region -------------------- Fields --------------------

    [index: TemplateOrNumber]: UndefinedOr<T>

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    protected constructor() { super() }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    //#region -------------------- Size methods --------------------

    public get length(): this["size"] { return this.size }
    public get count(): this["size"] { return this.size }

    public get isEmpty(): boolean { return this.size == 0 }

    public get isNotEmpty(): boolean { return !this.isEmpty }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Has null methods --------------------

    public get hasNull(): boolean { return hasNullByCollectionHolder(this,) }
    public get includesNull(): this["hasNull"] { return this.hasNull }
    public get containsNull(): this["hasNull"] { return this.hasNull }

    //#endregion -------------------- Has null methods --------------------
    //#region -------------------- Has duplicate methods --------------------

    public get hasDuplicate(): boolean { return hasDuplicateByCollectionHolder(this,) }
    public get includesDuplicate(): this["hasDuplicate"] { return this.hasDuplicate }
    public get containsDuplicate(): this["hasDuplicate"] { return this.hasDuplicate }

    //#endregion -------------------- Has duplicate methods --------------------

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Value methods --------------------

    //#region -------------------- Get methods --------------------

    public at(index: number,): T {
        return this.get(index,)
    }

    public elementAt(index: number,): T {
        return this.get(index,)
    }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Get or else methods --------------------

    public getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public getOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) {
        return getOrElse(this, index, defaultValue,)
    }

    public atOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public atOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public atOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) {
        return this.getOrElse(index, defaultValue,)
    }

    public elementAtOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public elementAtOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public elementAtOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) {
        return this.getOrElse(index, defaultValue,)
    }

    //#endregion -------------------- Get or else methods --------------------
    //#region -------------------- Get or null methods --------------------

    public getOrNull(index: number,): NullOr<T> {
        return getOrNull<T>(this, index,)
    }

    public atOrNull(index: number,): NullOr<T> {
        return this.getOrNull(index,)
    }

    public elementAtOrNull(index: number,): NullOr<T> {
        return this.getOrNull(index,)
    }

    //#endregion -------------------- Get or null methods --------------------

    //#region -------------------- Index of methods --------------------

    public indexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
    public indexOf(element: unknown, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
    public indexOf(element: unknown, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,) {
        return indexOfByCollectionHolder(this, element, fromIndex, toIndex, limit,)
    }

    //#endregion -------------------- Index of methods --------------------
    //#region -------------------- Last index of methods --------------------

    public lastIndexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
    public lastIndexOf(element: unknown, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
    public lastIndexOf(element: unknown, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,) {
        return lastIndexOfByCollectionHolder(this, element, fromIndex, toIndex, limit,)
    }

    //#endregion -------------------- Last index of methods --------------------
    //#region -------------------- Index of first methods --------------------

    public indexOfFirst(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber {
        return indexOfFirstByCollectionHolder(this, predicate, fromIndex, toIndex, limit,)
    }

    //#endregion -------------------- Index of first methods --------------------
    //#region -------------------- Index of first indexed methods --------------------

    public indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber {
        return indexOfFirstIndexedByCollectionHolder(this, predicate, fromIndex, toIndex, limit,)
    }

    //#endregion -------------------- Index of first indexed methods --------------------
    //#region -------------------- Index of last methods --------------------

    public indexOfLast(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber {
        return indexOfLastByCollectionHolder(this, predicate, fromIndex, toIndex, limit,)
    }

    //#endregion -------------------- Index of last methods --------------------
    //#region -------------------- Index of last indexed methods --------------------

    public indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber {
        return indexOfLastIndexedByCollectionHolder(this, predicate, fromIndex, toIndex, limit,)
    }

    //#endregion -------------------- Index of last indexed methods --------------------

    //#region -------------------- First methods --------------------

    public first(): T
    public first<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): S
    public first(predicate: Nullable<BooleanCallback<T>>,): T
    public first(predicate?: Nullable<BooleanCallback<T>>,) {
        return firstByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- First methods --------------------
    //#region -------------------- First or null methods --------------------

    public firstOrNull(): NullOr<T>
    public firstOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public firstOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
    public firstOrNull(predicate?: Nullable<BooleanCallback<T>>,) {
        return firstOrNullByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- First or null methods --------------------

    //#region -------------------- Last methods --------------------

    public last(): T
    public last<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): S
    public last(predicate: Nullable<BooleanCallback<T>>,): T
    public last(predicate?: Nullable<BooleanCallback<T>>,) {
        return lastByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Last methods --------------------
    //#region -------------------- Last or null methods --------------------

    public lastOrNull(): NullOr<T>
    public lastOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public lastOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
    public lastOrNull(predicate?: Nullable<BooleanCallback<T>>,) {
        return lastOrNullByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Last or null methods --------------------

    //#endregion -------------------- Value methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- All methods --------------------

    public all(predicate: BooleanCallback<T>,): boolean {
        return all(this, predicate,)
    }

    //#endregion -------------------- All methods --------------------
    //#region -------------------- Any methods --------------------

    public any(): this["isNotEmpty"]
    public any(predicate: Nullable<BooleanCallback<T>>,): boolean
    public any(predicate?: Nullable<BooleanCallback<T>>,) {
        return any(this, predicate,)
    }

    //#endregion -------------------- Any methods --------------------
    //#region -------------------- None methods --------------------

    public none(): this["isEmpty"]
    public none(predicate: Nullable<BooleanCallback<T>>,): boolean
    public none(predicate?: Nullable<BooleanCallback<T>>,) {
        return none(this, predicate,)
    }

    //#endregion -------------------- None methods --------------------

    //#region -------------------- Has methods --------------------

    public has(value: T,): boolean
    public has(value: unknown,): boolean
    public has(value: unknown,) {
        return hasByCollectionHolder(this, value,)
    }

    public includes(value: T,): boolean
    public includes(value: unknown,): boolean
    public includes(value: unknown,) {
        return this.has(value,)
    }

    public contains(value: T,): boolean
    public contains(value: unknown,): boolean
    public contains(value: unknown,) {
        return this.has(value,)
    }

    //#endregion -------------------- Has methods --------------------
    //#region -------------------- Has one methods --------------------

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
    public hasOne(values: PossibleIterableArraySetOrCollectionHolder<unknown>,) {
        return hasOneByCollectionHolder(this, values,)
    }

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
    public includesOne(values: PossibleIterableArraySetOrCollectionHolder<unknown>,) {
        return this.hasOne(values,)
    }

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
    public containsOne(values: PossibleIterableArraySetOrCollectionHolder<unknown>,) {
        return this.hasOne(values,)
    }

    //#endregion -------------------- Has one methods --------------------
    //#region -------------------- Has all methods --------------------

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
    public hasAll(values: PossibleIterableArraySetOrCollectionHolder<unknown>,) {
        return hasAllByCollectionHolder(this, values,)
    }

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
    public includesAll(values: PossibleIterableArraySetOrCollectionHolder<unknown>,) {
        return this.hasAll(values,)
    }

    public containsAll(values: readonly T[],): boolean
    public containsAll(values: ReadonlySet<T>,): boolean
    public containsAll(values: CollectionHolder<T>,): boolean
    public containsAll(values: CollectionHolder<T>,): boolean
    public containsAll(values: MinimalistCollectionHolder<T>,): boolean
    public containsAll(values: CollectionIterator<T>,): boolean
    public containsAll(values: Iterable<T>,): boolean
    public containsAll(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
    public containsAll(values: readonly unknown[],): boolean
    public containsAll(values: ReadonlySet<unknown>,): boolean
    public containsAll(values: CollectionHolder,): boolean
    public containsAll(values: CollectionHolder,): boolean
    public containsAll(values: MinimalistCollectionHolder,): boolean
    public containsAll(values: CollectionIterator,): boolean
    public containsAll(values: Iterable<unknown>,): boolean
    public containsAll(values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean
    public containsAll(values: PossibleIterableArraySetOrCollectionHolder<unknown>,) {
        return this.hasAll(values,)
    }

    //#endregion -------------------- Has all methods --------------------

    //#region -------------------- Join to string methods --------------------

    public join(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string {
        return joinToStringByCollectionHolder(this, separator, prefix, postfix, limit, truncated, transform,)
    }

    public joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string {
        return joinToStringByCollectionHolder(this, separator, prefix, postfix, limit, truncated, transform,)
    }

    //#endregion -------------------- Join to string methods --------------------

    //#region -------------------- Filter methods --------------------

    public filter<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public filter(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public filter(predicate: BooleanCallback<T>,) {
        return filter(this, predicate,)
    }

    //#endregion -------------------- Filter methods --------------------
    //#region -------------------- Filter indexed methods --------------------

    public filterIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public filterIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public filterIndexed(predicate: ReverseBooleanCallback<T>,) {
        return filterIndexed(this, predicate,)
    }

    //#endregion -------------------- Filter indexed methods --------------------
    //#region -------------------- Filter not methods --------------------

    public filterNot<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public filterNot(predicate: BooleanCallback<T>,) {
        return filterNot(this, predicate,)
    }

    //#endregion -------------------- Filter not methods --------------------
    //#region -------------------- Filter not indexed methods --------------------

    public filterNotIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public filterNotIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public filterNotIndexed(predicate: ReverseBooleanCallback<T>,) {
        return filterNotIndexed(this, predicate,)
    }

    //#endregion -------------------- Filter not indexed methods --------------------
    //#region -------------------- Filter not null methods --------------------

    public filterNotNull(): CollectionHolder<NonNullable<T>> {
        return filterNotNullByCollectionHolder<T>(this,)
    }

    //#endregion -------------------- Filter not null methods --------------------
    //#region -------------------- Require no nulls methods --------------------

    public requireNoNulls(): CollectionHolder<NonNullable<T>> {
        return requireNoNullsByCollectionHolder<T>(this,)
    }

    //#endregion -------------------- Require no nulls methods --------------------

    //#region -------------------- Find methods --------------------

    public find<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public find(predicate: BooleanCallback<T>,): NullOr<T>
    public find(predicate: BooleanCallback<T>,) {
        return findByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Find methods --------------------
    //#region -------------------- Find indexed methods --------------------

    public findIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public findIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public findIndexed(predicate: ReverseBooleanCallback<T>,) {
        return findIndexedByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Find indexed methods --------------------
    //#region -------------------- Find last methods --------------------

    public findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public findLast(predicate: BooleanCallback<T>,): NullOr<T>
    public findLast(predicate: BooleanCallback<T>,) {
        return findLastByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Find last methods --------------------
    //#region -------------------- Find last indexed methods --------------------

    public findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public findLastIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public findLastIndexed(predicate: ReverseBooleanCallback<T>,) {
        return findLastIndexedByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Find last indexed methods --------------------

    //#region -------------------- Slice methods --------------------

    public slice(indices: readonly number[],): CollectionHolder<T>
    public slice(indices: ReadonlySet<number>,): CollectionHolder<T>
    public slice(indices: CollectionHolder<number>,): CollectionHolder<T>
    public slice(indices: MinimalistCollectionHolder<number>,): CollectionHolder<T>
    public slice(indices: CollectionIterator<number>,): CollectionHolder<T>
    public slice(indices: Iterable<number>,): CollectionHolder<T>
    public slice(indices: PossibleIterableArraySetOrCollectionHolder<number>,): CollectionHolder<T>
    public slice(fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T>
    public slice(indicesOrFromIndex?: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number>, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T>
    public slice(indicesOrFromIndex?: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number>, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T> {
        return sliceByCollectionHolder<T>(this, indicesOrFromIndex, toIndex, limit,)
    }

    //#endregion -------------------- Slice methods --------------------

    //#region -------------------- Map methods --------------------

    public map<const U, >(transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U> {
        return mapByCollectionHolder(this, transform,)
    }

    //#endregion -------------------- Map methods --------------------
    //#region -------------------- Map indexed methods --------------------

    public mapIndexed<const U, >(transform: IndexValueWithReturnCallback<T, U>,): CollectionHolder<U> {
        return mapIndexedByCollectionHolder(this, transform,)
    }

    //#endregion -------------------- Map indexed methods --------------------
    //#region -------------------- Map not null methods --------------------

    public mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNullByCollectionHolder(this, transform,)
    }

    //#endregion -------------------- Map not null methods --------------------
    //#region -------------------- Map not null indexed methods --------------------

    public mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNullIndexedByCollectionHolder(this, transform,)
    }

    //#endregion -------------------- Map not null indexed methods --------------------

    //#region -------------------- For each methods --------------------

    public forEach(action: ValueIndexCallback<T>,): void {
        forEach(this, action,)
    }

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- For each indexed methods --------------------

    public forEachIndexed(action: IndexValueCallback<T>,): void {
        forEachIndexed(this, action,)
    }

    //#endregion -------------------- For each indexed methods --------------------

    //#region -------------------- On each methods --------------------

    public onEach(action: ValueIndexCallback<T>,): this {
        return onEach(this, action,)
    }

    //#endregion -------------------- On each methods --------------------
    //#region -------------------- On each indexed methods --------------------

    public onEachIndexed(action: IndexValueCallback<T>,): this {
        return onEachIndexed(this, action,)
    }

    //#endregion -------------------- On each indexed methods --------------------

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Javascript methods --------------------

    public [Symbol.iterator](): CollectionIterator<T> {
        return toIteratorByCollectionHolder<T>(this,)
    }

    public get [Symbol.toStringTag](): CollectionHolderName {
        return "CollectionHolder"
    }

    //#endregion -------------------- Javascript methods --------------------
    //#region -------------------- Conversion methods --------------------

    //#region -------------------- Conversion methods (iterator) --------------------

    public toIterator(): CollectionIterator<T> {
        return this[Symbol.iterator]()
    }

    //#endregion -------------------- Conversion methods (iterator) --------------------
    //#region -------------------- Conversion methods (array) --------------------

    public toArray(): readonly T[] {
        return toArrayByCollectionHolder<T>(this,)
    }

    public toMutableArray(): T[] {
        return toMutableArrayByCollectionHolder<T>(this,)
    }

    //#endregion -------------------- Conversion methods (array) --------------------
    //#region -------------------- Conversion methods (set) --------------------

    public toSet(): ReadonlySet<T> {
        return toSetByCollectionHolder<T>(this,)
    }

    public toMutableSet(): Set<T> {
        return toMutableSetByCollectionHolder<T>(this,)
    }

    //#endregion -------------------- Conversion methods (set) --------------------
    //#region -------------------- Conversion methods (map) --------------------

    public toMap(): ReadonlyMap<number, T> {
        return toMapByCollectionHolder<T>(this,)
    }

    public toMutableMap(): Map<number, T> {
        return toMutableMapByCollectionHolder<T>(this,)
    }

    //#endregion -------------------- Conversion methods (map) --------------------
    //#region -------------------- Conversion methods (reverse) --------------------

    public toReverse(fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T> {
        return toReverseByCollectionHolder<T>(this, fromIndex, toIndex, limit,)
    }

    public toReversed(fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T> {
        return this.toReverse(fromIndex, toIndex, limit,)
    }

    public reversed(fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T> {
        return this.toReverse(fromIndex, toIndex, limit,)
    }

    //#endregion -------------------- Conversion methods (reverse) --------------------
    //#region -------------------- Conversion methods (string) --------------------

    public override toString(): string {
        return toStringByCollectionHolder(this,)
    }

    public override toLocaleString(locale?: NullableString,): string {
        return toLocaleStringByCollectionHolder(this, locale,)
    }


    public toLowerCaseString(): string {
        return toLowerCaseStringByCollectionHolder(this,)
    }

    public toLocaleLowerCaseString(locale?: NullableString,): string {
        return toLocaleLowerCaseStringByCollectionHolder(this, locale,)
    }


    public toUpperCaseString(): string {
        return toUpperCaseStringByCollectionHolder(this,)
    }

    public toLocaleUpperCaseString(locale?: NullableString,): string {
        return toLocaleUpperCaseStringByCollectionHolder(this, locale,)
    }

    //#endregion -------------------- Conversion methods (string) --------------------

    //#endregion -------------------- Conversion methods --------------------

    //#endregion -------------------- Methods --------------------

}

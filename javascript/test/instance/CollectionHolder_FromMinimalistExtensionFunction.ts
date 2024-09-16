/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullableNumber, NullableString, NullOr, NullOrNumber, TemplateOrNumber} from "@joookiwi/type"

import type {CollectionHolder}                                                                                                                                                                                                                                                                                                    from "../../src/CollectionHolder"
import type {BooleanCallback, CollectionHolderName, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, PossibleIterableArraySetOrCollectionHolder, RestrainedBooleanCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, StringCallback, ValueIndexCallback, ValueIndexWithReturnCallback} from "../../src/CollectionHolder.types"
import type {MinimalistCollectionHolder}                                                                                                                                                                                                                                                                                          from "../../src/MinimalistCollectionHolder"
import type {CollectionIterator}                                                                                                                                                                                                                                                                                                  from "../../src/iterator/CollectionIterator"

import {AbstractMinimalistCollectionHolder}                  from "../../src/AbstractMinimalistCollectionHolder"
import {allByMinimalistCollectionHolder}                     from "../../src/method/all"
import {anyByMinimalistCollectionHolder}                     from "../../src/method/any"
import {filterByMinimalistCollectionHolder}                  from "../../src/method/filter"
import {filterIndexedByMinimalistCollectionHolder}           from "../../src/method/filterIndexed"
import {filterNotByMinimalistCollectionHolder}               from "../../src/method/filterNot"
import {filterNotIndexedByMinimalistCollectionHolder}        from "../../src/method/filterNotIndexed"
import {filterNotNullByMinimalistCollectionHolder}           from "../../src/method/filterNotNull"
import {findByMinimalistCollectionHolder}                    from "../../src/method/find"
import {findIndexedByMinimalistCollectionHolder}             from "../../src/method/findIndexed"
import {findLastByMinimalistCollectionHolder}                from "../../src/method/findLast"
import {findLastIndexedByMinimalistCollectionHolder}         from "../../src/method/findLastIndexed"
import {firstByMinimalistCollectionHolder}                   from "../../src/method/first"
import {firstOrNullByMinimalistCollectionHolder}             from "../../src/method/firstOrNull"
import {forEachByMinimalistCollectionHolder}                 from "../../src/method/forEach"
import {forEachIndexedByMinimalistCollectionHolder}          from "../../src/method/forEachIndexed"
import {getOrElseByMinimalistCollectionHolder}               from "../../src/method/getOrElse"
import {getOrNullByMinimalistCollectionHolder}               from "../../src/method/getOrNull"
import {hasByMinimalistCollectionHolder}                     from "../../src/method/has"
import {hasAllByMinimalistCollectionHolder}                  from "../../src/method/hasAll"
import {hasDuplicateByMinimalistCollectionHolder}            from "../../src/method/hasDuplicate"
import {hasNullByMinimalistCollectionHolder}                 from "../../src/method/hasNull"
import {hasOneByMinimalistCollectionHolder}                  from "../../src/method/hasOne"
import {indexOfByMinimalistCollectionHolder}                 from "../../src/method/indexOf"
import {indexOfFirstByMinimalistCollectionHolder}            from "../../src/method/indexOfFirst"
import {indexOfFirstIndexedByMinimalistCollectionHolder}     from "../../src/method/indexOfFirstIndexed"
import {indexOfLastByMinimalistCollectionHolder}             from "../../src/method/indexOfLast"
import {indexOfLastIndexedByMinimalistCollectionHolder}      from "../../src/method/indexOfLastIndexed"
import {joinToStringByMinimalistCollectionHolder}            from "../../src/method/joinToString"
import {lastByMinimalistCollectionHolder}                    from "../../src/method/last"
import {lastIndexOfByMinimalistCollectionHolder}             from "../../src/method/lastIndexOf"
import {lastOrNullByMinimalistCollectionHolder}              from "../../src/method/lastOrNull"
import {noneByMinimalistCollectionHolder}                    from "../../src/method/none"
import {mapByMinimalistCollectionHolder}                     from "../../src/method/map"
import {mapIndexedByMinimalistCollectionHolder}              from "../../src/method/mapIndexed"
import {mapNotNullByMinimalistCollectionHolder}              from "../../src/method/mapNotNull"
import {mapNotNullIndexedByMinimalistCollectionHolder}       from "../../src/method/mapNotNullIndexed"
import {onEachByMinimalistCollectionHolder}                  from "../../src/method/onEach"
import {onEachIndexedByMinimalistCollectionHolder}           from "../../src/method/onEachIndexed"
import {requireNoNullsByMinimalistCollectionHolder}          from "../../src/method/requireNoNulls"
import {sliceByMinimalistCollectionHolder}                   from "../../src/method/slice"
import {toArrayByMinimalistCollectionHolder}                 from "../../src/method/toArray"
import {toIteratorByMinimalistCollectionHolder}              from "../../src/method/toIterator"
import {toLocaleLowerCaseStringByMinimalistCollectionHolder} from "../../src/method/toLocaleLowerCaseString"
import {toLocaleStringByMinimalistCollectionHolder}          from "../../src/method/toLocaleString"
import {toLocaleUpperCaseStringByMinimalistCollectionHolder} from "../../src/method/toLocaleUpperCaseString"
import {toLowerCaseStringByMinimalistCollectionHolder}       from "../../src/method/toLowerCaseString"
import {toMapByMinimalistCollectionHolder}                   from "../../src/method/toMap"
import {toMutableArrayByMinimalistCollectionHolder}          from "../../src/method/toMutableArray"
import {toMutableMapByMinimalistCollectionHolder}            from "../../src/method/toMutableMap"
import {toMutableSetByMinimalistCollectionHolder}            from "../../src/method/toMutableSet"
import {toReverseByMinimalistCollectionHolder}               from "../../src/method/toReverse"
import {toSetByMinimalistCollectionHolder}                   from "../../src/method/toSet"
import {toString}                                            from "../../src/method/minimalistCollectionHolder/toString"
import {toUpperCaseString}                                   from "../../src/method/minimalistCollectionHolder/toUpperCaseString"

export class CollectionHolder_FromMinimalistExtensionFunction<const out T, >
    extends AbstractMinimalistCollectionHolder<T>
    implements CollectionHolder<T> {

    [index: TemplateOrNumber]: undefined

    readonly #array

    public constructor(array: readonly unknown[],) {
        super()
        this.#array = array
    }

    //#region -------------------- Getter methods --------------------

    public get length(): never {
        throw new Error("The getter method \"length\" was not expected to be called.",)
    }

    public get count(): never {
        throw new Error("The getter method \"count\" was not expected to be called.",)
    }

    public override get size(): number {
        return this.#array.length
    }


    public get isEmpty(): never {
        throw new Error("The method \"isEmpty\" was not expected to be called in a test.",)
    }

    public get isNotEmpty(): never {
        throw new Error("The method \"isNotEmpty\" was not expected to be called in a test.",)
    }


    public get hasNull(): boolean {
        return hasNullByMinimalistCollectionHolder(this,)
    }

    public get includesNull(): never {
        throw new Error("The getter method \"includesNull\" was not expected to be called.",)
    }

    public get containsNull(): never {
        throw new Error("The getter method \"containsNull\" was not expected to be called.",)
    }


    public get hasDuplicate(): boolean {
        return hasDuplicateByMinimalistCollectionHolder(this,)
    }

    public get includesDuplicate(): never {
        throw new Error("The getter method \"includesDuplicate\" was not expected to be called.",)
    }

    public get containsDuplicate(): never {
        throw new Error("The getter method \"containsDuplicate\" was not expected to be called.",)
    }

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Value methods --------------------

    //#region -------------------- Get methods --------------------

    public get(index: number,): T {
        return this.#array[index] as T
    }

    public at(index?: number,): never
    public at() {
        throw new Error("The method \"at\" was not expected to be called in a test.",)
    }

    public elementAt(index?: number,): never
    public elementAt() {
        throw new Error("The method \"elementAt\" was not expected to be called in a test.",)
    }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Get or else methods --------------------

    public getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,) {
        return getOrElseByMinimalistCollectionHolder(this, index, defaultValue,)
    }

    public atOrElse<const U, >(index?: number, defaultValue?: IndexWithReturnCallback<U>,): never
    public atOrElse(index?: number, defaultValue?: IndexWithReturnCallback<T>,): never
    public atOrElse() {
        throw new Error("The method \"atOrElse\" was not expected to be called in a test.",)
    }

    public elementAtOrElse<const U, >(index?: number, defaultValue?: IndexWithReturnCallback<U>,): never
    public elementAtOrElse(index?: number, defaultValue?: IndexWithReturnCallback<T>,): never
    public elementAtOrElse() {
        throw new Error("The method \"elementAtOrElse\" was not expected to be called in a test.",)
    }

    //#endregion -------------------- Get or else methods --------------------
    //#region -------------------- Get or null methods --------------------

    public getOrNull(index: number,): NullOr<T> {
        return getOrNullByMinimalistCollectionHolder(this, index,)
    }

    public atOrNull(index?: number,): never
    public atOrNull() {
        throw new Error("The method \"atOrNull\" was not expected to be called in a test.",)
    }

    public elementAtOrNull(index?: number,): never
    public elementAtOrNull() {
        throw new Error("The method \"elementAtOrNull\" was not expected to be called in a test.",)
    }

    //#endregion -------------------- Get or null methods --------------------

    //#region -------------------- Index of methods --------------------

    public indexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
    public indexOf(element: unknown, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
    public indexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,) {
        return indexOfByMinimalistCollectionHolder(this, element, fromIndex, toIndex, limit,)
    }

    //#endregion -------------------- Index of methods --------------------
    //#region -------------------- Last index of methods --------------------

    public lastIndexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
    public lastIndexOf(element: unknown, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
    public lastIndexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,) {
        return lastIndexOfByMinimalistCollectionHolder(this, element, fromIndex, toIndex, limit,)
    }

    //#endregion -------------------- Last index of methods --------------------
    //#region -------------------- Index of first methods --------------------

    public indexOfFirst(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber {
        return indexOfFirstByMinimalistCollectionHolder(this, predicate, fromIndex, toIndex, limit,)
    }

    //#endregion -------------------- Index of first methods --------------------
    //#region -------------------- Index of first indexed methods --------------------

    public indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber {
        return indexOfFirstIndexedByMinimalistCollectionHolder(this, predicate, fromIndex, toIndex, limit,)
    }

    //#endregion -------------------- Index of first indexed methods --------------------
    //#region -------------------- Index of last methods --------------------

    public indexOfLast(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber {
        return indexOfLastByMinimalistCollectionHolder(this, predicate, fromIndex, toIndex, limit,)
    }

    //#endregion -------------------- Index of last methods --------------------
    //#region -------------------- Index of last indexed methods --------------------

    public indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber {
        return indexOfLastIndexedByMinimalistCollectionHolder(this, predicate, fromIndex, toIndex, limit,)
    }

    //#endregion -------------------- Index of last indexed methods --------------------

    //#region -------------------- First methods --------------------

    public first(): NonNullable<T>
    public first<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NonNullable<S>
    public first(predicate: Nullable<BooleanCallback<T>>,): NonNullable<T>
    public first(predicate?: Nullable<BooleanCallback<T>>,) {
        return firstByMinimalistCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- First methods --------------------
    //#region -------------------- First or null methods --------------------

    public firstOrNull(): NullOr<T>
    public firstOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public firstOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
    public firstOrNull(predicate?: Nullable<BooleanCallback<T>>,) {
        return firstOrNullByMinimalistCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- First or null methods --------------------

    //#region -------------------- Last methods --------------------

    public last(): NonNullable<T>
    public last<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NonNullable<S>
    public last(predicate: Nullable<BooleanCallback<T>>,): NonNullable<T>
    public last(predicate?: Nullable<BooleanCallback<T>>,) {
        return lastByMinimalistCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Last methods --------------------
    //#region -------------------- Last or null methods --------------------

    public lastOrNull(): NullOr<T>
    public lastOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public lastOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
    public lastOrNull(predicate?: Nullable<BooleanCallback<T>>,) {
        return lastOrNullByMinimalistCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Last or null methods --------------------

    //#endregion -------------------- Value methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- All methods --------------------

    public all(predicate: BooleanCallback<T>,): boolean {
        return allByMinimalistCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- All methods --------------------
    //#region -------------------- Any methods --------------------

    public any(): this["isNotEmpty"]
    public any(predicate: Nullable<BooleanCallback<T>>,): boolean
    public any(predicate?: Nullable<BooleanCallback<T>>,) {
        return anyByMinimalistCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Any methods --------------------
    //#region -------------------- None methods --------------------

    public none(): this["isEmpty"]
    public none(predicate: Nullable<BooleanCallback<T>>,): boolean
    public none(predicate?: Nullable<BooleanCallback<T>>,) {
        return noneByMinimalistCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- None methods --------------------

    //#region -------------------- Has methods --------------------

    public has(value: T,): boolean
    public has(value: unknown,): boolean
    public has(value: unknown,) {
        return hasByMinimalistCollectionHolder(this, value,)
    }

    public includes(value?: T,): never
    public includes(value?: unknown,): never
    public includes() {
        throw new Error("The method \"includes\" was not expected to be called.",)
    }

    public contains(value?: T,): never
    public contains(value?: unknown,): never
    public contains() {
        throw new Error("The method \"contains\" was not expected to be called.",)
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
        return hasOneByMinimalistCollectionHolder(this, values,)
    }

    public includesOne(values?: readonly T[],): never
    public includesOne(values?: ReadonlySet<T>,): never
    public includesOne(values?: CollectionHolder<T>,): never
    public includesOne(values?: MinimalistCollectionHolder<T>,): never
    public includesOne(values?: CollectionIterator<T>,): never
    public includesOne(values?: Iterable<T>,): never
    public includesOne(values?: PossibleIterableArraySetOrCollectionHolder<T>,): never
    public includesOne(values?: readonly unknown[],): never
    public includesOne(values?: ReadonlySet<unknown>,): never
    public includesOne(values?: CollectionHolder,): never
    public includesOne(values?: MinimalistCollectionHolder,): never
    public includesOne(values?: CollectionIterator,): never
    public includesOne(values?: Iterable<unknown>,): never
    public includesOne(values?: PossibleIterableArraySetOrCollectionHolder<unknown>,): never
    public includesOne() {
        throw new Error("The method \"includesOne\" was not expected to be called.",)
    }

    public containsOne(values?: readonly T[],): never
    public containsOne(values?: ReadonlySet<T>,): never
    public containsOne(values?: CollectionHolder<T>,): never
    public containsOne(values?: MinimalistCollectionHolder<T>,): never
    public containsOne(values?: CollectionIterator<T>,): never
    public containsOne(values?: Iterable<T>,): never
    public containsOne(values?: PossibleIterableArraySetOrCollectionHolder<T>,): never
    public containsOne(values?: readonly unknown[],): never
    public containsOne(values?: ReadonlySet<unknown>,): never
    public containsOne(values?: CollectionHolder,): never
    public containsOne(values?: MinimalistCollectionHolder,): never
    public containsOne(values?: CollectionIterator,): never
    public containsOne(values?: Iterable<unknown>,): never
    public containsOne(values?: PossibleIterableArraySetOrCollectionHolder<unknown>,): never
    public containsOne() {
        throw new Error("The method \"containsOne\" was not expected to be called.",)
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
        return hasAllByMinimalistCollectionHolder(this, values,)
    }

    public includesAll(values?: readonly T[],): never
    public includesAll(values?: ReadonlySet<T>,): never
    public includesAll(values?: CollectionHolder<T>,): never
    public includesAll(values?: MinimalistCollectionHolder<T>,): never
    public includesAll(values?: CollectionIterator<T>,): never
    public includesAll(values?: Iterable<T>,): never
    public includesAll(values?: PossibleIterableArraySetOrCollectionHolder<T>,): never
    public includesAll(values?: readonly unknown[],): never
    public includesAll(values?: ReadonlySet<unknown>,): never
    public includesAll(values?: CollectionHolder,): never
    public includesAll(values?: MinimalistCollectionHolder,): never
    public includesAll(values?: CollectionIterator,): never
    public includesAll(values?: Iterable<unknown>,): never
    public includesAll(values?: PossibleIterableArraySetOrCollectionHolder<unknown>,): never
    public includesAll() {
        throw new Error("The method \"includesAll\" was not expected to be called.",)
    }

    public containsAll(values?: readonly T[],): never
    public containsAll(values?: ReadonlySet<T>,): never
    public containsAll(values?: CollectionHolder<T>,): never
    public containsAll(values?: MinimalistCollectionHolder<T>,): never
    public containsAll(values?: CollectionIterator<T>,): never
    public containsAll(values?: Iterable<T>,): never
    public containsAll(values?: PossibleIterableArraySetOrCollectionHolder<T>,): never
    public containsAll(values?: readonly unknown[],): never
    public containsAll(values?: ReadonlySet<unknown>,): never
    public containsAll(values?: CollectionHolder,): never
    public containsAll(values?: MinimalistCollectionHolder,): never
    public containsAll(values?: CollectionIterator,): never
    public containsAll(values?: Iterable<unknown>,): never
    public containsAll(values?: PossibleIterableArraySetOrCollectionHolder<unknown>,): never
    public containsAll() {
        throw new Error("The \"containsAll\" was not expected to be called.",)
    }

    //#endregion -------------------- Has all methods --------------------

    //#region -------------------- Join to string methods --------------------

    public join(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): never
    public join() {
        throw new Error("The method \"join\" was not expected to be called.",)
    }

    public joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string {
        return joinToStringByMinimalistCollectionHolder(this, separator, prefix, postfix, limit, truncated, transform,)
    }

    //#endregion -------------------- Join to string methods --------------------

    //#region -------------------- Filter methods --------------------

    public filter<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public filter(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public filter(predicate: BooleanCallback<T>,) {
        return filterByMinimalistCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Filter methods --------------------
    //#region -------------------- Filter indexed methods --------------------

    public filterIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public filterIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public filterIndexed(predicate: ReverseBooleanCallback<T>,) {
        return filterIndexedByMinimalistCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Filter indexed methods --------------------
    //#region -------------------- Filter not methods --------------------

    public filterNot<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public filterNot(predicate: BooleanCallback<T>,) {
        return filterNotByMinimalistCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Filter not methods --------------------
    //#region -------------------- Filter not indexed methods --------------------

    public filterNotIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public filterNotIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public filterNotIndexed(predicate: ReverseBooleanCallback<T>,) {
        return filterNotIndexedByMinimalistCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Filter not indexed methods --------------------
    //#region -------------------- Filter not null methods --------------------

    public filterNotNull(): CollectionHolder<NonNullable<T>> {
        return filterNotNullByMinimalistCollectionHolder(this,)
    }

    //#endregion -------------------- Filter not null methods --------------------
    //#region -------------------- Require not nulls methods --------------------

    public requireNoNulls(): CollectionHolder<NonNullable<T>> {
        return requireNoNullsByMinimalistCollectionHolder(this,)
    }

    //#endregion -------------------- Require not nulls methods --------------------

    //#region -------------------- Find methods --------------------

    public find<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public find(predicate: BooleanCallback<T>,): NullOr<T>
    public find(predicate: BooleanCallback<T>,) {
        return findByMinimalistCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Find methods --------------------
    //#region -------------------- Find indexed methods --------------------

    public findIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public findIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public findIndexed(predicate: ReverseBooleanCallback<T>,) {
        return findIndexedByMinimalistCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Find indexed methods --------------------
    //#region -------------------- Find last methods --------------------

    public findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public findLast(predicate: BooleanCallback<T>,): NullOr<T>
    public findLast(predicate: BooleanCallback<T>,) {
        return findLastByMinimalistCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Find last methods --------------------
    //#region -------------------- Find last indexed methods --------------------

    public findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public findLastIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public findLastIndexed(predicate: ReverseBooleanCallback<T>,) {
        return findLastIndexedByMinimalistCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Find last indexed methods --------------------

    //#region -------------------- Slice methods --------------------

    public slice(indices: readonly number[],): CollectionHolder<T>
    public slice(indices: ReadonlySet<number>,): CollectionHolder<T>
    public slice(indices: CollectionHolder<number>,): CollectionHolder<T>
    public slice(indices: MinimalistCollectionHolder<number>,): CollectionHolder<T>
    public slice(indices: CollectionIterator<number>,): CollectionHolder<T>
    public slice(indices: Iterable<number>,): CollectionHolder<T>
    public slice(fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T>
    public slice(indicesOrFromIndex?: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number>, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T>
    public slice(indicesOrFromIndex?: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number>, toIndex?: NullableNumber, limit?: NullableNumber,) {
        return sliceByMinimalistCollectionHolder(this, indicesOrFromIndex, toIndex, limit,)
    }

    //#endregion -------------------- Slice methods --------------------

    //#region -------------------- Map methods --------------------

    public map<const U, >(transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U> {
        return mapByMinimalistCollectionHolder(this, transform,)
    }

    //#endregion -------------------- Map methods --------------------
    //#region -------------------- Map indexed methods --------------------

    public mapIndexed<const U, >(transform: IndexValueWithReturnCallback<T, U>,): CollectionHolder<U> {
        return mapIndexedByMinimalistCollectionHolder(this, transform,)
    }

    //#endregion -------------------- Map indexed methods --------------------
    //#region -------------------- Map not null methods --------------------

    public mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNullByMinimalistCollectionHolder(this, transform,)
    }

    //#endregion -------------------- Map not null methods --------------------
    //#region -------------------- Map not null indexed methods --------------------

    public mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNullIndexedByMinimalistCollectionHolder(this, transform,)
    }

    //#endregion -------------------- Map not null indexed methods --------------------

    //#region -------------------- For each methods --------------------

    public forEach(action: ValueIndexCallback<T>,): void {
        forEachByMinimalistCollectionHolder(this, action,)
    }

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- For each indexed methods --------------------

    public forEachIndexed(action: IndexValueCallback<T>,): void {
        forEachIndexedByMinimalistCollectionHolder(this, action,)
    }

    //#endregion -------------------- For each indexed methods --------------------

    //#region -------------------- On each methods --------------------

    public onEach(action: ValueIndexCallback<T>,): this {
        return onEachByMinimalistCollectionHolder(this, action,)
    }

    //#endregion -------------------- On each methods --------------------
    //#region -------------------- On each indexed methods --------------------

    public onEachIndexed(action: IndexValueCallback<T>,): this {
        return onEachIndexedByMinimalistCollectionHolder(this, action,)
    }

    //#endregion -------------------- On each indexed methods --------------------

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Javascript methods --------------------

    public [Symbol.iterator](): CollectionIterator<T> {
        return toIteratorByMinimalistCollectionHolder(this,)
    }

    public get [Symbol.toStringTag](): CollectionHolderName {
        return "CollectionHolder"
    }

    //#endregion -------------------- Javascript methods --------------------
    //#region -------------------- Conversion methods --------------------

    public toIterator(): CollectionIterator<T> {
        return this[Symbol.iterator]()
    }


    public toArray(): readonly T[] {
        return toArrayByMinimalistCollectionHolder(this,)
    }

    public toMutableArray(): T[] {
        return toMutableArrayByMinimalistCollectionHolder(this,)
    }


    public toSet(): ReadonlySet<T> {
        return toSetByMinimalistCollectionHolder(this,)
    }

    public toMutableSet(): Set<T> {
        return toMutableSetByMinimalistCollectionHolder(this,)
    }


    public toMap(): ReadonlyMap<number, T> {
        return toMapByMinimalistCollectionHolder(this,)
    }

    public toMutableMap(): Map<number, T> {
        return toMutableMapByMinimalistCollectionHolder(this,)
    }


    public toReverse(fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T> {
        return toReverseByMinimalistCollectionHolder(this, fromIndex, toIndex, limit,)
    }

    public toReversed(fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): never
    public toReversed() {
        throw new Error("The method \"toReversed\" was not expected to be called.",)
    }

    public reversed(fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): never
    public reversed() {
        throw new Error("The method \"reversed\" was not expected to be called.",)
    }

    //#region -------------------- Conversion methods (string) --------------------

    public override toString(): string {
        return toString(this,)
    }

    public override toLocaleString(locale?: NullableString,): string {
        return toLocaleStringByMinimalistCollectionHolder(this, locale,)
    }

    public toLowerCaseString(): string {
        return toLowerCaseStringByMinimalistCollectionHolder(this,)
    }

    public toLocaleLowerCaseString(locale?: NullableString,): string {
        return toLocaleLowerCaseStringByMinimalistCollectionHolder(this, locale,)
    }

    public toUpperCaseString(): string {
        return toUpperCaseString(this,)
    }

    public toLocaleUpperCaseString(locale?: NullableString,): string {
        return toLocaleUpperCaseStringByMinimalistCollectionHolder(this, locale,)
    }

    //#endregion -------------------- Conversion methods (string) --------------------

    //#endregion -------------------- Conversion methods --------------------

    //#endregion -------------------- Methods --------------------


}

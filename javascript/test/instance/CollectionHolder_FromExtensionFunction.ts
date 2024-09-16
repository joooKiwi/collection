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

import {AbstractCollectionHolder}                  from "../../src/AbstractCollectionHolder"
import {allByCollectionHolder}                     from "../../src/method/all"
import {anyByCollectionHolder}                     from "../../src/method/any"
import {filterByCollectionHolder}                  from "../../src/method/filter"
import {filterIndexedByCollectionHolder}           from "../../src/method/filterIndexed"
import {filterNotByCollectionHolder}               from "../../src/method/filterNot"
import {filterNotIndexedByCollectionHolder}        from "../../src/method/filterNotIndexed"
import {filterNotNullByCollectionHolder}           from "../../src/method/filterNotNull"
import {findByCollectionHolder}                    from "../../src/method/find"
import {findIndexedByCollectionHolder}             from "../../src/method/findIndexed"
import {findLastByCollectionHolder}                from "../../src/method/findLast"
import {findLastIndexedByCollectionHolder}         from "../../src/method/findLastIndexed"
import {firstByCollectionHolder}                   from "../../src/method/first"
import {firstOrNullByCollectionHolder}             from "../../src/method/firstOrNull"
import {forEachByCollectionHolder}                 from "../../src/method/forEach"
import {forEachIndexedByCollectionHolder}          from "../../src/method/forEachIndexed"
import {hasByCollectionHolder}                     from "../../src/method/has"
import {hasAllByCollectionHolder}                  from "../../src/method/hasAll"
import {hasDuplicateByCollectionHolder}            from "../../src/method/hasDuplicate"
import {hasNullByCollectionHolder}                 from "../../src/method/hasNull"
import {hasOneByCollectionHolder}                  from "../../src/method/hasOne"
import {indexOfByCollectionHolder}                 from "../../src/method/indexOf"
import {indexOfFirstByCollectionHolder}            from "../../src/method/indexOfFirst"
import {indexOfFirstIndexedByCollectionHolder}     from "../../src/method/indexOfFirstIndexed"
import {indexOfLastByCollectionHolder}             from "../../src/method/indexOfLast"
import {indexOfLastIndexedByCollectionHolder}      from "../../src/method/indexOfLastIndexed"
import {isEmptyByCollectionHolder}                 from "../../src/method/isEmpty"
import {isNotEmptyByCollectionHolder}              from "../../src/method/isNotEmpty"
import {joinToStringByCollectionHolder}            from "../../src/method/joinToString"
import {lastByCollectionHolder}                    from "../../src/method/last"
import {lastIndexOfByCollectionHolder}             from "../../src/method/lastIndexOf"
import {lastOrNullByCollectionHolder}              from "../../src/method/lastOrNull"
import {noneByCollectionHolder}                    from "../../src/method/none"
import {mapByCollectionHolder}                     from "../../src/method/map"
import {mapIndexedByCollectionHolder}              from "../../src/method/mapIndexed"
import {mapNotNullByCollectionHolder}              from "../../src/method/mapNotNull"
import {mapNotNullIndexedByCollectionHolder}       from "../../src/method/mapNotNullIndexed"
import {onEachByCollectionHolder}                  from "../../src/method/onEach"
import {onEachIndexedByCollectionHolder}           from "../../src/method/onEachIndexed"
import {requireNoNullsByCollectionHolder}          from "../../src/method/requireNoNulls"
import {sliceByCollectionHolder}                   from "../../src/method/slice"
import {toArrayByCollectionHolder}                 from "../../src/method/toArray"
import {toIteratorByCollectionHolder}              from "../../src/method/toIterator"
import {toLocaleLowerCaseStringByCollectionHolder} from "../../src/method/toLocaleLowerCaseString"
import {toLocaleStringByCollectionHolder}          from "../../src/method/toLocaleString"
import {toLocaleUpperCaseStringByCollectionHolder} from "../../src/method/toLocaleUpperCaseString"
import {toLowerCaseStringByCollectionHolder}       from "../../src/method/toLowerCaseString"
import {toMapByCollectionHolder}                   from "../../src/method/toMap"
import {toMutableArrayByCollectionHolder}          from "../../src/method/toMutableArray"
import {toMutableSetByCollectionHolder}            from "../../src/method/toMutableSet"
import {toMutableMapByCollectionHolder}            from "../../src/method/toMutableMap"
import {toReverseByCollectionHolder}               from "../../src/method/toReverse"
import {toSetByCollectionHolder}                   from "../../src/method/toSet"
import {toStringByCollectionHolder}                from "../../src/method/toString"
import {toUpperCaseStringByCollectionHolder}       from "../../src/method/toUpperCaseString"

export class CollectionHolder_FromExtensionFunction<const out T, >
    extends AbstractCollectionHolder<T>
    implements CollectionHolder<T> {

    [index: TemplateOrNumber]: undefined

    readonly #array

    public constructor(array: readonly T[],) {
        super()
        this.#array = array
    }

    //#region -------------------- Getter methods --------------------

    public override get length(): never {
        throw new Error("The getter method \"length\" was not expected to be called.",)
    }

    public override get count(): never {
        throw new Error("The getter method \"count\" was not expected to be called.",)
    }

    public override get size(): number {
        return this.#array.length
    }


    public override get isEmpty(): boolean {
        return isEmptyByCollectionHolder(this,)
    }

    public override get isNotEmpty(): boolean {
        return isNotEmptyByCollectionHolder(this,)
    }


    public override get hasNull(): boolean {
        return hasNullByCollectionHolder(this,)
    }

    public override get includesNull(): never {
        throw new Error("The getter method \"includesNull\" was not expected to be called.",)
    }

    public override get containsNull(): never {
        throw new Error("The getter method \"containsNull\" was not expected to be called.",)
    }


    public override get hasDuplicate(): boolean {
        return hasDuplicateByCollectionHolder(this,)
    }

    public override get includesDuplicate(): never {
        throw new Error("The getter method \"includesDuplicate\" was not expected to be called.",)
    }

    public override get containsDuplicate(): never {
        throw new Error("The getter method \"containsDuplicate\" was not expected to be called.",)
    }

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Value methods --------------------

    //#region -------------------- Get methods --------------------

    public override get(index: number,): T {
        return this.#array[index] as T
    }

    public override at(index?: number,): never
    public override at() {
        throw new Error("The method \"at\" was not expected to be called in a test.",)
    }

    public override elementAt(index?: number,): never
    public override elementAt() {
        throw new Error("The method \"elementAt\" was not expected to be called in a test.",)
    }


    public override getOrElse<const U, >(index?: number, defaultValue?: IndexWithReturnCallback<U>,): never
    public override getOrElse(index?: number, defaultValue?: IndexWithReturnCallback<T>,): never
    public override getOrElse() {
        throw new Error("The method \"getOrElse\" was not expected to be called in a test.",)
    }

    public override atOrElse<const U, >(index?: number, defaultValue?: IndexWithReturnCallback<U>,): never
    public override atOrElse(index?: number, defaultValue?: IndexWithReturnCallback<T>,): never
    public override atOrElse() {
        throw new Error("The method \"atOrElse\" was not expected to be called in a test.",)
    }

    public override elementAtOrElse<const U, >(index?: number, defaultValue?: IndexWithReturnCallback<U>,): never
    public override elementAtOrElse(index?: number, defaultValue?: IndexWithReturnCallback<T>,): never
    public override elementAtOrElse() {
        throw new Error("The method \"elementAtOrElse\" was not expected to be called in a test.",)
    }


    public override getOrNull(index?: number,): never
    public override getOrNull() {
        throw new Error("The method \"getOrNull\" was not expected to be called in a test.",)
    }

    public override atOrNull(index?: number,): never
    public override atOrNull() {
        throw new Error("The method \"atOrNull\" was not expected to be called in a test.",)
    }

    public override elementAtOrNull(index?: number,): never
    public override elementAtOrNull() {
        throw new Error("The method \"elementAtOrNull\" was not expected to be called in a test.",)
    }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Index methods --------------------

    public override indexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
    public override indexOf(element: unknown, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
    public override indexOf(element: unknown, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,) {
        return indexOfByCollectionHolder(this, element, fromIndex, toIndex, limit,)
    }


    public override lastIndexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
    public override lastIndexOf(element: unknown, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
    public override lastIndexOf(element: unknown, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,) {
        return lastIndexOfByCollectionHolder(this, element, fromIndex, toIndex, limit,)
    }


    public override indexOfFirst(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber {
        return indexOfFirstByCollectionHolder(this, predicate, fromIndex, toIndex, limit,)
    }

    public override indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber {
        return indexOfFirstIndexedByCollectionHolder(this, predicate, fromIndex, toIndex, limit,)
    }


    public override indexOfLast(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber {
        return indexOfLastByCollectionHolder(this, predicate, fromIndex, toIndex, limit,)
    }

    public override indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber {
        return indexOfLastIndexedByCollectionHolder(this, predicate, fromIndex, toIndex, limit,)
    }

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- First methods --------------------

    public override first(): NonNullable<T>
    public override first<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NonNullable<S>
    public override first(predicate: Nullable<BooleanCallback<T>>,): NonNullable<T>
    public override first(predicate?: Nullable<BooleanCallback<T>>,) {
        return firstByCollectionHolder(this, predicate,)
    }

    public override firstOrNull(): NullOr<T>
    public override firstOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public override firstOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
    public override firstOrNull(predicate?: Nullable<BooleanCallback<T>>,) {
        return firstOrNullByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- First methods --------------------
    //#region -------------------- Last methods --------------------

    public override last(): NonNullable<T>
    public override last<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NonNullable<S>
    public override last(predicate: Nullable<BooleanCallback<T>>,): NonNullable<T>
    public override last(predicate?: Nullable<BooleanCallback<T>>,) {
        return lastByCollectionHolder(this, predicate,)
    }

    public override lastOrNull(): NullOr<T>
    public override lastOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public override lastOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
    public override lastOrNull(predicate?: Nullable<BooleanCallback<T>>,) {
        return lastOrNullByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Last methods --------------------

    //#endregion -------------------- Value methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- All methods --------------------

    public override all(predicate: BooleanCallback<T>,): boolean {
        return allByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- All methods --------------------
    //#region -------------------- Any methods --------------------

    public override any(): this["isNotEmpty"]
    public override any(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override any(predicate?: Nullable<BooleanCallback<T>>,) {
        return anyByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Any methods --------------------
    //#region -------------------- None methods --------------------

    public override none(): this["isEmpty"]
    public override none(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override none(predicate?: Nullable<BooleanCallback<T>>,) {
        return noneByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- None methods --------------------

    //#region -------------------- Has methods --------------------

    public override has(value: T,): boolean
    public override has(value: unknown,): boolean
    public override has(value: unknown,) {
        return hasByCollectionHolder(this, value,)
    }

    public override includes(value?: T,): never
    public override includes(value?: unknown,): never
    public override includes() {
        throw new Error("The method \"includes\" was not expected to be called.",)
    }

    public override contains(value?: T,): never
    public override contains(value?: unknown,): never
    public override contains() {
        throw new Error("The method \"contains\" was not expected to be called.",)
    }

    //#endregion -------------------- Has methods --------------------
    //#region -------------------- Has one methods --------------------

    public override hasOne(values: readonly T[],): boolean
    public override hasOne(values: ReadonlySet<T>,): boolean
    public override hasOne(values: CollectionHolder<T>,): boolean
    public override hasOne(values: MinimalistCollectionHolder<T>,): boolean
    public override hasOne(values: CollectionIterator<T>,): boolean
    public override hasOne(values: Iterable<T>,): boolean
    public override hasOne(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
    public override hasOne(values: readonly unknown[],): boolean
    public override hasOne(values: ReadonlySet<unknown>,): boolean
    public override hasOne(values: CollectionHolder,): boolean
    public override hasOne(values: MinimalistCollectionHolder,): boolean
    public override hasOne(values: CollectionIterator,): boolean
    public override hasOne(values: Iterable<unknown>,): boolean
    public override hasOne(values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean
    public override hasOne(values: PossibleIterableArraySetOrCollectionHolder<unknown>,) {
        return hasOneByCollectionHolder(this, values,)
    }

    public override includesOne(values?: readonly T[],): never
    public override includesOne(values?: ReadonlySet<T>,): never
    public override includesOne(values?: CollectionHolder<T>,): never
    public override includesOne(values?: MinimalistCollectionHolder<T>,): never
    public override includesOne(values?: CollectionIterator<T>,): never
    public override includesOne(values?: Iterable<T>,): never
    public override includesOne(values?: PossibleIterableArraySetOrCollectionHolder<T>,): never
    public override includesOne(values?: readonly unknown[],): never
    public override includesOne(values?: ReadonlySet<unknown>,): never
    public override includesOne(values?: CollectionHolder,): never
    public override includesOne(values?: MinimalistCollectionHolder,): never
    public override includesOne(values?: CollectionIterator,): never
    public override includesOne(values?: Iterable<unknown>,): never
    public override includesOne(values?: PossibleIterableArraySetOrCollectionHolder<unknown>,): never
    public override includesOne() {
        throw new Error("The method \"includesOne\" was not expected to be called.",)
    }

    public override containsOne(values?: readonly T[],): never
    public override containsOne(values?: ReadonlySet<T>,): never
    public override containsOne(values?: MinimalistCollectionHolder<T>,): never
    public override containsOne(values?: MinimalistCollectionHolder<T>,): never
    public override containsOne(values?: MinimalistCollectionHolder<T>,): never
    public override containsOne(values?: Iterable<T>,): never
    public override containsOne(values?: PossibleIterableArraySetOrCollectionHolder<T>,): never
    public override containsOne(values?: readonly unknown[],): never
    public override containsOne(values?: ReadonlySet<unknown>,): never
    public override containsOne(values?: CollectionHolder,): never
    public override containsOne(values?: MinimalistCollectionHolder,): never
    public override containsOne(values?: CollectionIterator,): never
    public override containsOne(values?: Iterable<unknown>,): never
    public override containsOne(values?: PossibleIterableArraySetOrCollectionHolder<unknown>,): never
    public override containsOne() {
        throw new Error("The method \"containsOne\" was not expected to be called.",)
    }

    //#endregion -------------------- Has one methods --------------------
    //#region -------------------- Has all methods --------------------

    public override hasAll(values: readonly T[],): boolean
    public override hasAll(values: ReadonlySet<T>,): boolean
    public override hasAll(values: CollectionHolder<T>,): boolean
    public override hasAll(values: MinimalistCollectionHolder<T>,): boolean
    public override hasAll(values: CollectionIterator<T>,): boolean
    public override hasAll(values: Iterable<T>,): boolean
    public override hasAll(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
    public override hasAll(values: readonly unknown[],): boolean
    public override hasAll(values: ReadonlySet<unknown>,): boolean
    public override hasAll(values: CollectionHolder,): boolean
    public override hasAll(values: MinimalistCollectionHolder,): boolean
    public override hasAll(values: CollectionIterator,): boolean
    public override hasAll(values: Iterable<unknown>,): boolean
    public override hasAll(values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean
    public override hasAll(values: PossibleIterableArraySetOrCollectionHolder<unknown>,) {
        return hasAllByCollectionHolder(this, values,)
    }

    public override includesAll(values?: readonly T[],): never
    public override includesAll(values?: ReadonlySet<T>,): never
    public override includesAll(values?: CollectionHolder<T>,): never
    public override includesAll(values?: MinimalistCollectionHolder<T>,): never
    public override includesAll(values?: CollectionIterator<T>,): never
    public override includesAll(values?: Iterable<T>,): never
    public override includesAll(values?: PossibleIterableArraySetOrCollectionHolder<T>,): never
    public override includesAll(values?: readonly unknown[],): never
    public override includesAll(values?: ReadonlySet<unknown>,): never
    public override includesAll(values?: CollectionHolder,): never
    public override includesAll(values?: MinimalistCollectionHolder,): never
    public override includesAll(values?: CollectionIterator,): never
    public override includesAll(values?: Iterable<unknown>,): never
    public override includesAll(values?: PossibleIterableArraySetOrCollectionHolder<unknown>,): never
    public override includesAll() {
        throw new Error("The method \"includesAll\" was not expected to be called.",)
    }

    public override containsAll(values?: readonly T[],): never
    public override containsAll(values?: ReadonlySet<T>,): never
    public override containsAll(values?: CollectionHolder<T>,): never
    public override containsAll(values?: MinimalistCollectionHolder<T>,): never
    public override containsAll(values?: CollectionIterator<T>,): never
    public override containsAll(values?: Iterable<T>,): never
    public override containsAll(values?: PossibleIterableArraySetOrCollectionHolder<T>,): never
    public override containsAll(values?: readonly unknown[],): never
    public override containsAll(values?: ReadonlySet<unknown>,): never
    public override containsAll(values?: CollectionHolder,): never
    public override containsAll(values?: MinimalistCollectionHolder,): never
    public override containsAll(values?: CollectionIterator,): never
    public override containsAll(values?: Iterable<unknown>,): never
    public override containsAll(values?: PossibleIterableArraySetOrCollectionHolder<unknown>,): never
    public override containsAll() {
        throw new Error("The \"containsAll\" was not expected to be called.",)
    }

    //#endregion -------------------- Has all methods --------------------

    //#region -------------------- Join to string methods --------------------

    public override join(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): never
    public override join() {
        throw new Error("The method \"join\" was not expected to be called.",)
    }

    public override joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string {
        return joinToStringByCollectionHolder(this, separator, prefix, postfix, limit, truncated, transform,)
    }

    //#endregion -------------------- Join to string methods --------------------

    //#region -------------------- Filter methods --------------------

    public override filter<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filter(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filter(predicate: BooleanCallback<T>,) {
        return filterByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Filter methods --------------------
    //#region -------------------- Filter indexed methods --------------------

    public override filterIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,) {
        return filterIndexedByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Filter indexed methods --------------------
    //#region -------------------- Filter not methods --------------------

    public override filterNot<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filterNot(predicate: BooleanCallback<T>,) {
        return filterNotByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Filter not methods --------------------
    //#region -------------------- Filter not indexed methods --------------------

    public override filterNotIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,) {
        return filterNotIndexedByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Filter not indexed methods --------------------
    //#region -------------------- Filter not null methods --------------------

    public override filterNotNull(): CollectionHolder<NonNullable<T>> {
        return filterNotNullByCollectionHolder(this,)
    }

    //#endregion -------------------- Filter not null methods --------------------
    //#region -------------------- Require no nulls methods --------------------

    public override requireNoNulls(): CollectionHolder<NonNullable<T>> {
        return requireNoNullsByCollectionHolder(this,)
    }

    //#endregion -------------------- Require no nulls methods --------------------

    //#region -------------------- Find methods --------------------

    public override find<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override find(predicate: BooleanCallback<T>,): NullOr<T>
    public override find(predicate: BooleanCallback<T>,) {
        return findByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Find methods --------------------
    //#region -------------------- Find indexed methods --------------------

    public override findIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findIndexed(predicate: ReverseBooleanCallback<T>,) {
        return findIndexedByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Find indexed methods --------------------
    //#region -------------------- Find last methods --------------------

    public override findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLast(predicate: BooleanCallback<T>,): NullOr<T>
    public override findLast(predicate: BooleanCallback<T>,) {
        return findLastByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Find last methods --------------------
    //#region -------------------- Find last indexed methods --------------------

    public override findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,) {
        return findLastIndexedByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Find last indexed methods --------------------

    //#region -------------------- Slice methods --------------------

    public override slice(indices: readonly number[],): CollectionHolder<T>
    public override slice(indices: ReadonlySet<number>,): CollectionHolder<T>
    public override slice(indices: CollectionHolder<number>,): CollectionHolder<T>
    public override slice(indices: MinimalistCollectionHolder<number>,): CollectionHolder<T>
    public override slice(indices: CollectionIterator<number>,): CollectionHolder<T>
    public override slice(indices: Iterable<number>,): CollectionHolder<T>
    public override slice(indices: PossibleIterableArraySetOrCollectionHolder<number>,): CollectionHolder<T>
    public override slice(fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T>
    public override slice(indicesOrFromIndex?: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number>, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T>
    public override slice(indicesOrFromIndex?: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number>, toIndex?: NullableNumber, limit?: NullableNumber,) {
        return sliceByCollectionHolder(this, indicesOrFromIndex, toIndex, limit,)
    }

    //#endregion -------------------- Slice methods --------------------

    //#region -------------------- Map methods --------------------

    public override map<const U, >(transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U> {
        return mapByCollectionHolder(this, transform,)
    }

    //#endregion -------------------- Map methods --------------------
    //#region -------------------- Map indexed methods --------------------

    public override mapIndexed<const U, >(transform: IndexValueWithReturnCallback<T, U>,): CollectionHolder<U> {
        return mapIndexedByCollectionHolder(this, transform,)
    }

    //#endregion -------------------- Map indexed methods --------------------
    //#region -------------------- Map not null methods --------------------

    public override mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNullByCollectionHolder(this, transform,)
    }

    //#endregion -------------------- Map not null methods --------------------
    //#region -------------------- Map not null indexed methods --------------------

    public override mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNullIndexedByCollectionHolder(this, transform,)
    }

    //#endregion -------------------- Map not null indexed methods --------------------

    //#region -------------------- For each methods --------------------

    public override forEach(action: ValueIndexCallback<T>,): void {
        forEachByCollectionHolder(this, action,)
    }

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- For each indexed methods --------------------

    public override forEachIndexed(action: IndexValueCallback<T>,): void {
        forEachIndexedByCollectionHolder(this, action,)
    }

    //#endregion -------------------- For each indexed methods --------------------

    //#region -------------------- On each methods --------------------

    public override onEach(action: ValueIndexCallback<T>,): this {
        return onEachByCollectionHolder(this, action,)
    }

    //#endregion -------------------- On each methods --------------------
    //#region -------------------- On each indexed methods --------------------

    public override onEachIndexed(action: IndexValueCallback<T>,): this {
        return onEachIndexedByCollectionHolder(this, action,)
    }

    //#endregion -------------------- On each indexed methods --------------------

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Javascript methods --------------------

    // public override get [Symbol.isConcatSpreadable](): false {
    //     return false
    // }

    public override [Symbol.iterator](): CollectionIterator<T> {
        return toIteratorByCollectionHolder<T>(this,)
    }

    public override get [Symbol.toStringTag](): CollectionHolderName {
        return "CollectionHolder"
    }

    //#endregion -------------------- Javascript methods --------------------
    //#region -------------------- Conversion methods --------------------

    public override toIterator(): CollectionIterator<T> {
        return this[Symbol.iterator]()
    }


    public override toArray(): readonly T[] {
        return toArrayByCollectionHolder<T>(this,)
    }

    public override toMutableArray(): T[] {
        return toMutableArrayByCollectionHolder<T>(this,)
    }


    public override toSet(): ReadonlySet<T> {
        return toSetByCollectionHolder<T>(this,)
    }

    public override toMutableSet(): Set<T> {
        return toMutableSetByCollectionHolder<T>(this,)
    }


    public override toMap(): ReadonlyMap<number, T> {
        return toMapByCollectionHolder<T>(this,)
    }

    public override toMutableMap(): Map<number, T> {
        return toMutableMapByCollectionHolder<T>(this,)
    }


    public override toReverse(fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T> {
        return toReverseByCollectionHolder<T>(this, fromIndex, toIndex, limit,)
    }

    public override toReversed(fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): never
    public override toReversed() {
        throw new Error("The method \"toReversed\" was not expected to be called.",)
    }

    public override reversed(fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): never
    public override reversed() {
        throw new Error("The method \"reversed\" was not expected to be called.",)
    }

    //#region -------------------- Conversion methods (toString) --------------------

    public override toString(): string {
        return toStringByCollectionHolder(this,)
    }

    public override toLocaleString(locale?: NullableString,): string {
        return toLocaleStringByCollectionHolder(this, locale,)
    }

    public override toLowerCaseString(): string {
        return toLowerCaseStringByCollectionHolder(this,)
    }

    public override toLocaleLowerCaseString(locale?: NullableString,): string {
        return toLocaleLowerCaseStringByCollectionHolder(this, locale,)
    }

    public override toUpperCaseString(): string {
        return toUpperCaseStringByCollectionHolder(this,)
    }

    public override toLocaleUpperCaseString(locale?: NullableString,): string {
        return toLocaleUpperCaseStringByCollectionHolder(this, locale,)
    }

    //#endregion -------------------- Conversion methods (toString) --------------------

    //#endregion -------------------- Conversion methods --------------------

    //#endregion -------------------- Methods --------------------

}

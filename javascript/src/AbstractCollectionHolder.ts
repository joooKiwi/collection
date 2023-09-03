/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {BooleanCallback, CollectionHolderName, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, ObjectOf, RestrainedBooleanCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, ValueIndexCallback, ValueIndexWithReturnCallback, ValueWithStringReturnCallback} from "./CollectionHolder.types"
import type {CollectionHolder}                                                                                                                                                                                                                                                                                 from "./CollectionHolder"
import type {Nullable, NullOr, NumberOrNumberInString, UndefinedOr}                                                                                                                                                                                                                                            from "./general type"
import type {CollectionIterator}                                                                                                                                                                                                                                                                               from "./iterator/CollectionIterator"

import {CollectionConstants} from "./CollectionConstants"
import {all}                 from "./method/all"
import {any}                 from "./method/any"
import {filter}              from "./method/filter"
import {filterIndexed}       from "./method/filterIndexed"
import {filterIndexedNot}    from "./method/filterIndexedNot"
import {filterNot}           from "./method/filterNot"
import {filterNotNull}       from "./method/filterNotNull"
import {find}                from "./method/find"
import {findIndexed}         from "./method/findIndexed"
import {findLast}            from "./method/findLast"
import {findLastIndexed}     from "./method/findLastIndexed"
import {first}               from "./method/first"
import {firstOrNull}         from "./method/firstOrNull"
import {forEach}             from "./method/forEach"
import {forEachIndexed}      from "./method/forEachIndexed"
import {hasAll}              from "./method/hasAll"
import {hasNull}             from "./method/hasNull"
import {hasOne}              from "./method/hasOne"
import {indexOf}             from "./method/indexOf"
import {indexOfFirst}        from "./method/indexOfFirst"
import {indexOfFirstIndexed} from "./method/indexOfFirstIndexed"
import {indexOfLast}         from "./method/indexOfLast"
import {indexOfLastIndexed}  from "./method/indexOfLastIndexed"
import {join}                from "./method/join"
import {last}                from "./method/last"
import {lastIndexOf}         from "./method/lastIndexOf"
import {lastOrNull}          from "./method/lastOrNull"
import {none}                from "./method/none"
import {map}                 from "./method/map"
import {mapIndexed}          from "./method/mapIndexed"
import {mapNotNull}          from "./method/mapNotNull"
import {mapNotNullIndexed}   from "./method/mapNotNullIndexed"
import {objectValuesMap}     from "./method/objectValuesMap"
import {requireNoNulls}      from "./method/requireNoNulls"
import {slice}               from "./method/slice"
import {toArray}             from "./method/toArray"
import {toIterator}          from "./method/toIterator"
import {toMutableArray}      from "./method/toMutableArray"
import {toMutableSet}        from "./method/toMutableSet"
import {toMutableMap}        from "./method/toMutableMap"
import {toMutableWeakSet}    from "./method/toMutableWeakSet"
import {toSet}               from "./method/toSet"
import {toMap}               from "./method/toMap"
import {toReverse}           from "./method/toReverse"
import {toWeakSet}           from "./method/toWeakSet"

export abstract class AbstractCollectionHolder<const out T = unknown, >
    implements CollectionHolder<T> {

    //#region -------------------- Fields --------------------

    [index: NumberOrNumberInString]: UndefinedOr<T>

    #objectValuesMap?: ReadonlyMap<T, ObjectOf<T>>
    #array?: readonly T[]
    #set?: ReadonlySet<T>
    #weakSet?: Readonly<WeakSet<ObjectOf<T>>>
    #map?: ReadonlyMap<number, T>

    #hasNull?: boolean

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    protected constructor() {
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    //#region -------------------- Size methods --------------------

    public abstract get size(): number

    public get length(): this["size"] {
        return this.size
    }

    public get count(): this["size"] {
        return this.size
    }


    public abstract get isEmpty(): boolean

    public get isNotEmpty(): boolean {
        return !this.isEmpty
    }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Has X methods --------------------

    public get hasNull(): boolean {
        return this.#hasNull ??= hasNull(this,)
    }

    public get includesNull(): this["hasNull"] {
        return this.hasNull
    }

    public get containsNull(): this["hasNull"] {
        return this.hasNull
    }

    //#endregion -------------------- Has X methods --------------------

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Value methods --------------------

    //#region -------------------- Get / at methods --------------------

    public abstract get(index: number,): T

    public at(index: number,): T {
        return this.get(index,)
    }

    public elementAt(index: number,): T {
        return this.get(index,)
    }


    public abstract getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public abstract getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T

    public atOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public atOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public atOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<| T | U>,) {
        return this.getOrElse(index, defaultValue,)
    }

    public elementAtOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public elementAtOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public elementAtOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<| T | U>,) {
        return this.getOrElse(index, defaultValue,)
    }


    public abstract getOrNull(index: number,): NullOr<T>

    public atOrNull(index: number,): NullOr<T> {
        return this.getOrNull(index,)
    }

    public elementAtOrNull(index: number,): NullOr<T> {
        return this.getOrNull(index,)
    }

    //#endregion -------------------- Get / at methods --------------------
    //#region -------------------- Index of methods --------------------

    public indexOf(element: T, fromIndex?: Nullable<number>, toIndex?: Nullable<number>,): NullOr<number>
    public indexOf(element: unknown, fromIndex?: Nullable<number>, toIndex?: Nullable<number>,): NullOr<number>
    public indexOf(element: unknown, fromIndex?: Nullable<number>, toIndex?: Nullable<number>,): NullOr<number> {
        return indexOf(this, element, fromIndex, toIndex,)
    }


    public lastIndexOf(element: T, fromIndex?: Nullable<number>, toIndex?: Nullable<number>,): NullOr<number>
    public lastIndexOf(element: unknown, fromIndex?: Nullable<number>, toIndex?: Nullable<number>,): NullOr<number>
    public lastIndexOf(element: unknown, fromIndex?: Nullable<number>, toIndex?: Nullable<number>,): NullOr<number> {
        return lastIndexOf(this, element, fromIndex, toIndex,)
    }


    public indexOfFirst(predicate: BooleanCallback<T>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>,): NullOr<number> {
        return indexOfFirst(this, predicate, fromIndex, toIndex,)
    }

    public indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>,): NullOr<number> {
        return indexOfFirstIndexed(this, predicate, fromIndex, toIndex,)
    }


    public indexOfLast(predicate: BooleanCallback<T>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>,): NullOr<number> {
        return indexOfLast(this, predicate, fromIndex, toIndex,)
    }

    public indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>,): NullOr<number> {
        return indexOfLastIndexed(this, predicate, fromIndex, toIndex,)
    }

    //#endregion -------------------- Index of methods --------------------
    //#region -------------------- First methods --------------------

    public first(): NonNullable<T>
    public first<const S extends T, >(callback: Nullable<RestrainedBooleanCallback<T, S>>,): NonNullable<S>
    public first(callback: Nullable<BooleanCallback<T>>,): NonNullable<T>
    public first<const S extends T, >(callback?: Nullable<| BooleanCallback<T> | RestrainedBooleanCallback<T, S>>,) {
        return first(this, callback,)
    }

    public firstOrNull(): NullOr<T>
    public firstOrNull<const S extends T, >(callback: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public firstOrNull(callback: Nullable<BooleanCallback<T>>,): NullOr<T>
    public firstOrNull<const S extends T, >(callback?: Nullable<| BooleanCallback<T> | RestrainedBooleanCallback<T, S>>,) {
        return firstOrNull(this, callback,)
    }

    //#endregion -------------------- First methods --------------------
    //#region -------------------- Last methods --------------------

    public last(): NonNullable<T>
    public last<const S extends T, >(callback: Nullable<RestrainedBooleanCallback<T, S>>,): NonNullable<S>
    public last(callback: Nullable<BooleanCallback<T>>,): NonNullable<T>
    public last<const S extends T, >(callback?: Nullable<| BooleanCallback<T> | RestrainedBooleanCallback<T, S>>,) {
        return last(this, callback,)
    }

    public lastOrNull(): NullOr<T>
    public lastOrNull<const S extends T, >(callback: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public lastOrNull(callback: Nullable<BooleanCallback<T>>,): NullOr<T>
    public lastOrNull<const S extends T, >(callback?: Nullable<| BooleanCallback<T> | RestrainedBooleanCallback<T, S>>,) {
        return lastOrNull(this, callback,)
    }

    //#endregion -------------------- Last methods --------------------

    //#endregion -------------------- Value methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- All / any / none methods --------------------

    public all(callback: BooleanCallback<T>,): boolean {
        return all(this, callback,)
    }

    public any(): this["isNotEmpty"]
    public any(callback: Nullable<BooleanCallback<T>>,): boolean
    public any(callback?: Nullable<BooleanCallback<T>>,): boolean {
        return any(this, callback,)
    }

    public none(): this["isEmpty"]
    public none(callback: Nullable<BooleanCallback<T>>,): boolean
    public none(callback?: Nullable<BooleanCallback<T>>,): boolean {
        return none(this, callback,)
    }

    //#endregion -------------------- All / any / none methods --------------------
    //#region -------------------- Has / includes / contains methods --------------------

    public hasOne(...values: readonly T[]): boolean
    public hasOne(...values: readonly unknown[]): boolean
    public hasOne(...values: readonly unknown[]): boolean {
        return hasOne(this, ...values,)
    }

    public includesOne(...values: readonly T[]): boolean
    public includesOne(...values: readonly unknown[]): boolean
    public includesOne(...values: readonly unknown[]): boolean {
        return this.hasOne(...values,)
    }

    public containsOne(...values: readonly T[]): boolean
    public containsOne(...values: readonly unknown[]): boolean
    public containsOne(...values: readonly unknown[]): boolean {
        return this.hasOne(...values,)
    }


    public hasAll(...values: readonly T[]): boolean
    public hasAll(...values: readonly unknown[]): boolean
    public hasAll(...values: readonly unknown[]): boolean {
        return hasAll(this, ...values,)
    }

    public includesAll(...values: readonly T[]): boolean
    public includesAll(...values: readonly unknown[]): boolean
    public includesAll(...values: readonly unknown[]): boolean {
        return this.hasAll(...values,)
    }

    public containsAll(...values: readonly T[]): boolean
    public containsAll(...values: readonly unknown[]): boolean
    public containsAll(...values: readonly unknown[]): boolean {
        return this.hasAll(...values,)
    }

    //#endregion -------------------- Has / includes / contains methods --------------------
    //#region -------------------- Join methods --------------------

    public join(separator?: Nullable<string>, prefix?: Nullable<string>, postfix?: Nullable<string>, limit?: Nullable<number>, truncated?: Nullable<string>, transform?: Nullable<ValueWithStringReturnCallback<T>>,): string {
        return join(this, separator, prefix, postfix, limit, truncated, transform,)
    }

    //#endregion -------------------- Join methods --------------------
    //#region -------------------- Filter methods --------------------

    public filter<const S extends T, >(callback: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public filter(callback: BooleanCallback<T>,): CollectionHolder<T>
    public filter<const S extends T, >(callback: | RestrainedBooleanCallback<T, S> | BooleanCallback<T>,) {
        return filter(this, callback,)
    }

    public filterIndexed<const S extends T, >(callback: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public filterIndexed(callback: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public filterIndexed<const S extends T, >(callback: | ReverseRestrainedBooleanCallback<T, S> | ReverseBooleanCallback<T>,) {
        return filterIndexed(this, callback,)
    }


    public filterNot<const S extends T, >(callback: RestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public filterNot(callback: BooleanCallback<T>,): CollectionHolder<T>
    public filterNot<const S extends T, >(callback: | RestrainedBooleanCallback<T, S> | BooleanCallback<T>,) {
        return filterNot(this, callback,)
    }

    public filterIndexedNot<const S extends T, >(callback: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public filterIndexedNot(callback: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public filterIndexedNot<const S extends T, >(callback: | ReverseRestrainedBooleanCallback<T, S> | ReverseBooleanCallback<T>,) {
        return filterIndexedNot(this, callback,)
    }


    public filterNotNull(): CollectionHolder<NonNullable<T>> {
        return filterNotNull(this,)
    }

    public requireNoNulls(): CollectionHolder<NonNullable<T>> {
        return requireNoNulls(this,)
    }

    //#endregion -------------------- Filter methods --------------------
    //#region -------------------- Find methods --------------------

    public find<const S extends T, >(callback: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public find(callback: BooleanCallback<T>,): NullOr<T>
    public find<const S extends T, >(callback: | RestrainedBooleanCallback<T, S> | BooleanCallback<T>,) {
        return find(this, callback,)
    }

    public findIndexed<const S extends T, >(callback: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public findIndexed(callback: ReverseBooleanCallback<T>,): NullOr<T>
    public findIndexed<const S extends T, >(callback: | ReverseRestrainedBooleanCallback<T, S> | ReverseBooleanCallback<T>,) {
        return findIndexed(this, callback,)
    }


    public findLast<const S extends T, >(callback: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public findLast(callback: BooleanCallback<T>,): NullOr<T>
    public findLast<const S extends T, >(callback: | RestrainedBooleanCallback<T, S> | BooleanCallback<T>,) {
        return findLast(this, callback,)
    }

    public findLastIndexed(callback: ReverseBooleanCallback<T>,): NullOr<T> {
        return findLastIndexed(this, callback,)
    }

    //#endregion -------------------- Find methods --------------------
    //#region -------------------- Slice methods --------------------

    public slice(indices: readonly number[],): CollectionHolder<T>
    public slice(indices: ReadonlySet<number>,): CollectionHolder<T>
    public slice(indices: CollectionHolder<number>,): CollectionHolder<T>
    public slice(indices: CollectionIterator<number>,): CollectionHolder<T>
    public slice(indices: Iterable<number>,): CollectionHolder<T>
    public slice(fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): CollectionHolder<T>
    public slice(indicesOrFromIndex?: Nullable<| readonly number[] | ReadonlySet<number> | CollectionHolder<number> | CollectionIterator<number> | Iterable<number> | number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): CollectionHolder<T>
    public slice(indicesOrFromIndex?: Nullable<| readonly number[] | ReadonlySet<number> | CollectionHolder<number> | CollectionIterator<number> | Iterable<number> | number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): CollectionHolder<T> {
        return slice(this, indicesOrFromIndex, toIndex, limit,)
    }

    //#endregion -------------------- Slice methods --------------------
    //#region -------------------- Map methods --------------------

    public map<const U, >(callback: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U> {
        return map(this, callback,)
    }

    public mapIndexed<const U, >(callback: IndexValueWithReturnCallback<T, U>,): CollectionHolder<U> {
        return mapIndexed(this, callback,)
    }

    public mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNull(this, transform,)
    }

    public mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNullIndexed(this, transform,)
    }

    //#endregion -------------------- Map methods --------------------
    //#region -------------------- ForEach methods --------------------

    public forEach(callback: ValueIndexCallback<T>,): this {
        return forEach(this, callback,)
    }

    public forEachIndexed(callback: IndexValueCallback<T>,): this {
        return forEachIndexed(this, callback,)
    }

    //#endregion -------------------- ForEach methods --------------------

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Javascript methods --------------------

    public [Symbol.iterator](): CollectionIterator<T> {
        return toIterator(this,)
    }

    public get [Symbol.toStringTag](): CollectionHolderName {
        return CollectionConstants.COLLECTION_HOLDER_TO_STRING_TAG
    }

    //#endregion -------------------- Javascript methods --------------------
    //#region -------------------- Conversion methods --------------------

    public get objectValuesMap(): ReadonlyMap<T, ObjectOf<T>> {
        return this.#objectValuesMap ??= objectValuesMap(this,)
    }


    public toIterator(): CollectionIterator<T> {
        return this[Symbol.iterator]()
    }


    public toArray(): readonly T[] {
        return this.#array ??= toArray(this,)
    }

    public toMutableArray(): T[] {
        return toMutableArray(this,)
    }


    public toSet(): ReadonlySet<T> {
        return this.#set ??= toSet(this,)
    }

    public toMutableSet(): Set<T> {
        return toMutableSet(this,)
    }


    public toWeakSet(): Readonly<WeakSet<ObjectOf<T>>> {
        return this.#weakSet ??= toWeakSet(this,)
    }

    public toMutableWeakSet(): WeakSet<ObjectOf<T>> {
        return toMutableWeakSet(this,)
    }


    public toMap(): ReadonlyMap<number, T> {
        return this.#map ??= toMap(this,)
    }

    public toMutableMap(): Map<number, T> {
        return toMutableMap(this,)
    }


    public toReversed(fromIndex?: Nullable<number>, toIndex?: Nullable<number>,): CollectionHolder<T> {
        return toReverse(this, fromIndex, toIndex,)
    }


    public toString(): string {
        return this.join()
    }

    public toLocaleString(): string {
        return this.join(null, null, null, null, null, it => it?.toLocaleString() ?? `${it}`,)
    }

    //#endregion -------------------- Conversion methods --------------------

    //#endregion -------------------- Methods --------------------

}

/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {BooleanCallback, CollectionHolderName, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, ObjectOf, RestrainedBooleanCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, StringCallback, ValueIndexCallback, ValueIndexWithReturnCallback} from "./CollectionHolder.types"
import type {CollectionHolder}                                                                                                                                                                                                                                                                  from "./CollectionHolder"
import type {Nullable, NullOr, NumberOrNumberInString, UndefinedOr}                                                                                                                                                                                                                             from "./general type"
import type {MinimalistCollectionHolder}                                                                                                                                                                                                                                                        from "./MinimalistCollectionHolder"
import type {CollectionIterator}                                                                                                                                                                                                                                                                from "./iterator/CollectionIterator"

import {AbstractMinimalistCollectionHolder} from "./AbstractMinimalistCollectionHolder"
import {CollectionConstants}                from "./CollectionConstants"
import {all}                                from "./method/all"
import {any}                                from "./method/any"
import {filter}                             from "./method/filter"
import {filterIndexed}                      from "./method/filterIndexed"
import {filterIndexedNot}                   from "./method/filterIndexedNot"
import {filterNot}                          from "./method/filterNot"
import {filterNotNull}                      from "./method/filterNotNull"
import {find}                               from "./method/find"
import {findIndexed}                        from "./method/findIndexed"
import {findLast}                           from "./method/findLast"
import {findLastIndexed}                    from "./method/findLastIndexed"
import {first}                              from "./method/first"
import {firstOrNull}                        from "./method/firstOrNull"
import {forEach}                            from "./method/forEach"
import {forEachIndexed}                     from "./method/forEachIndexed"
import {hasAll}                             from "./method/hasAll"
import {hasNull}                            from "./method/hasNull"
import {hasOne}                             from "./method/hasOne"
import {indexOf}                            from "./method/indexOf"
import {indexOfFirst}                       from "./method/indexOfFirst"
import {indexOfFirstIndexed}                from "./method/indexOfFirstIndexed"
import {indexOfLast}                        from "./method/indexOfLast"
import {indexOfLastIndexed}                 from "./method/indexOfLastIndexed"
import {join}                               from "./method/join"
import {last}                               from "./method/last"
import {lastIndexOf}                        from "./method/lastIndexOf"
import {lastOrNull}                         from "./method/lastOrNull"
import {none}                               from "./method/none"
import {map}                                from "./method/map"
import {mapIndexed}                         from "./method/mapIndexed"
import {mapNotNull}                         from "./method/mapNotNull"
import {mapNotNullIndexed}                  from "./method/mapNotNullIndexed"
import {objectValuesMap}                    from "./method/objectValuesMap"
import {requireNoNulls}                     from "./method/requireNoNulls"
import {slice}                              from "./method/slice"
import {toArray}                            from "./method/toArray"
import {toIterator}                         from "./method/toIterator"
import {toLocaleLowerCaseString}            from "./method/toLocaleLowerCaseString"
import {toLocaleString}                     from "./method/toLocaleString"
import {toLocaleUpperCaseString}            from "./method/toLocaleUpperCaseString"
import {toLowerCaseString}                  from "./method/toLowerCaseString"
import {toMap}                              from "./method/toMap"
import {toMutableArray}                     from "./method/toMutableArray"
import {toMutableSet}                       from "./method/toMutableSet"
import {toMutableMap}                       from "./method/toMutableMap"
import {toMutableWeakSet}                   from "./method/toMutableWeakSet"
import {toReverse}                          from "./method/toReverse"
import {toSet}                              from "./method/toSet"
import {toString}                           from "./method/toString"
import {toUpperCaseString}                  from "./method/toUpperCaseString"
import {toWeakSet}                          from "./method/toWeakSet"

/**
 * A definition of a {@link CollectionHolder} to have a common ancestor.
 *
 * @note This class should be inherited if new classes are being made to be more usable by the tools
 * @see EmptyCollectionHolder
 * @see GenericCollectionHolder
 * @see LazyGenericCollectionHolder
 */
export abstract class AbstractCollectionHolder<const out T = unknown, >
    extends AbstractMinimalistCollectionHolder<T>
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

    protected constructor() { super() }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    //#region -------------------- Size methods --------------------

    public get length(): this["size"] {
        return this.size
    }

    public get count(): this["size"] {
        return this.size
    }


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

    public indexOf(element: T, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number>
    public indexOf(element: unknown, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number>
    public indexOf(element: unknown, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number> {
        return indexOf(this, element, fromIndex, toIndex, limit,)
    }


    public lastIndexOf(element: T, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number>
    public lastIndexOf(element: unknown, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number>
    public lastIndexOf(element: unknown, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number> {
        return lastIndexOf(this, element, fromIndex, toIndex, limit,)
    }


    public indexOfFirst(predicate: BooleanCallback<T>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number> {
        return indexOfFirst(this, predicate, fromIndex, toIndex, limit,)
    }

    public indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number> {
        return indexOfFirstIndexed(this, predicate, fromIndex, toIndex, limit,)
    }


    public indexOfLast(predicate: BooleanCallback<T>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number> {
        return indexOfLast(this, predicate, fromIndex, toIndex, limit,)
    }

    public indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number> {
        return indexOfLastIndexed(this, predicate, fromIndex, toIndex, limit,)
    }

    //#endregion -------------------- Index of methods --------------------
    //#region -------------------- First methods --------------------

    public first(): NonNullable<T>
    public first<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NonNullable<S>
    public first(predicate: Nullable<BooleanCallback<T>>,): NonNullable<T>
    public first<const S extends T, >(predicate?: Nullable<| BooleanCallback<T> | RestrainedBooleanCallback<T, S>>,) {
        return first(this, predicate,)
    }

    public firstOrNull(): NullOr<T>
    public firstOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public firstOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
    public firstOrNull<const S extends T, >(predicate?: Nullable<| BooleanCallback<T> | RestrainedBooleanCallback<T, S>>,) {
        return firstOrNull(this, predicate,)
    }

    //#endregion -------------------- First methods --------------------
    //#region -------------------- Last methods --------------------

    public last(): NonNullable<T>
    public last<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NonNullable<S>
    public last(predicate: Nullable<BooleanCallback<T>>,): NonNullable<T>
    public last<const S extends T, >(predicate?: Nullable<| BooleanCallback<T> | RestrainedBooleanCallback<T, S>>,) {
        return last(this, predicate,)
    }

    public lastOrNull(): NullOr<T>
    public lastOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public lastOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
    public lastOrNull<const S extends T, >(predicate?: Nullable<| BooleanCallback<T> | RestrainedBooleanCallback<T, S>>,) {
        return lastOrNull(this, predicate,)
    }

    //#endregion -------------------- Last methods --------------------

    //#endregion -------------------- Value methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- All / any / none methods --------------------

    //#region -------------------- All methods --------------------

    public all(predicate: BooleanCallback<T>,): boolean {
        return all(this, predicate,)
    }

    //#endregion -------------------- All methods --------------------
    //#region -------------------- Any methods --------------------

    public any(): this["isNotEmpty"]
    public any(predicate: Nullable<BooleanCallback<T>>,): boolean
    public any(predicate?: Nullable<BooleanCallback<T>>,): boolean {
        return any(this, predicate,)
    }

    //#endregion -------------------- Any methods --------------------
    //#region -------------------- None methods --------------------

    public none(): this["isEmpty"]
    public none(predicate: Nullable<BooleanCallback<T>>,): boolean
    public none(predicate?: Nullable<BooleanCallback<T>>,): boolean {
        return none(this, predicate,)
    }

    //#endregion -------------------- None methods --------------------

    //#endregion -------------------- All / any / none methods --------------------
    //#region -------------------- Has methods --------------------

    //#region -------------------- Has one methods --------------------

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

    //#endregion -------------------- Has one methods --------------------
    //#region -------------------- Has all methods --------------------

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

    //#endregion -------------------- Has all methods --------------------

    //#endregion -------------------- Has methods --------------------
    //#region -------------------- Join methods --------------------

    public join(separator?: Nullable<string>, prefix?: Nullable<string>, postfix?: Nullable<string>, limit?: Nullable<number>, truncated?: Nullable<string>, transform?: Nullable<StringCallback<T>>,): string {
        return join(this, separator, prefix, postfix, limit, truncated, transform,)
    }

    //#endregion -------------------- Join methods --------------------
    //#region -------------------- Filter methods --------------------

    //#region -------------------- Filter methods --------------------

    public filter<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public filter(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public filter<const S extends T, >(predicate: | RestrainedBooleanCallback<T, S> | BooleanCallback<T>,) {
        return filter(this, predicate,)
    }

    //#endregion -------------------- Filter methods --------------------
    //#region -------------------- Filter indexed methods --------------------

    public filterIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public filterIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public filterIndexed<const S extends T, >(predicate: | ReverseRestrainedBooleanCallback<T, S> | ReverseBooleanCallback<T>,) {
        return filterIndexed(this, predicate,)
    }

    //#endregion -------------------- Filter indexed methods --------------------
    //#region -------------------- Filter not methods --------------------

    public filterNot<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public filterNot<const S extends T, >(predicate: | RestrainedBooleanCallback<T, S> | BooleanCallback<T>,) {
        return filterNot(this, predicate,)
    }

    //#endregion -------------------- Filter not methods --------------------
    //#region -------------------- Filter indexed not methods --------------------

    public filterIndexedNot<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public filterIndexedNot(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public filterIndexedNot<const S extends T, >(predicate: | ReverseRestrainedBooleanCallback<T, S> | ReverseBooleanCallback<T>,) {
        return filterIndexedNot(this, predicate,)
    }

    //#endregion -------------------- Filter indexed not methods --------------------
    //#region -------------------- Filter not null methods --------------------

    public filterNotNull(): CollectionHolder<NonNullable<T>> {
        return filterNotNull(this,)
    }

    //#endregion -------------------- Filter not null methods --------------------
    //#region -------------------- Require not nulls methods --------------------

    public requireNoNulls(): CollectionHolder<NonNullable<T>> {
        return requireNoNulls(this,)
    }

    //#endregion -------------------- Require not nulls methods --------------------

    //#endregion -------------------- Filter methods --------------------
    //#region -------------------- Find methods --------------------

    //#region -------------------- Find methods --------------------

    public find<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public find(predicate: BooleanCallback<T>,): NullOr<T>
    public find<const S extends T, >(predicate: | RestrainedBooleanCallback<T, S> | BooleanCallback<T>,) {
        return find(this, predicate,)
    }

    //#endregion -------------------- Find methods --------------------
    //#region -------------------- Find indexed methods --------------------

    public findIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public findIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public findIndexed<const S extends T, >(predicate: | ReverseRestrainedBooleanCallback<T, S> | ReverseBooleanCallback<T>,) {
        return findIndexed(this, predicate,)
    }

    //#endregion -------------------- Find indexed methods --------------------
    //#region -------------------- Find last methods --------------------

    public findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public findLast(predicate: BooleanCallback<T>,): NullOr<T>
    public findLast<const S extends T, >(predicate: | RestrainedBooleanCallback<T, S> | BooleanCallback<T>,) {
        return findLast(this, predicate,)
    }

    //#endregion -------------------- Find last methods --------------------
    //#region -------------------- Find last indexed methods --------------------

    public findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public findLastIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public findLastIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T> {
        return findLastIndexed(this, predicate,)
    }

    //#endregion -------------------- Find last indexed methods --------------------

    //#endregion -------------------- Find methods --------------------
    //#region -------------------- Slice methods --------------------

    public slice(indices: readonly number[],): CollectionHolder<T>
    public slice(indices: ReadonlySet<number>,): CollectionHolder<T>
    public slice(indices: MinimalistCollectionHolder<number>,): CollectionHolder<T>
    public slice(indices: CollectionIterator<number>,): CollectionHolder<T>
    public slice(indices: Iterable<number>,): CollectionHolder<T>
    public slice(fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): CollectionHolder<T>
    public slice(indicesOrFromIndex?: Nullable<| readonly number[] | ReadonlySet<number> | MinimalistCollectionHolder<number> | CollectionIterator<number> | Iterable<number> | number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): CollectionHolder<T>
    public slice(indicesOrFromIndex?: Nullable<| readonly number[] | ReadonlySet<number> | MinimalistCollectionHolder<number> | CollectionIterator<number> | Iterable<number> | number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): CollectionHolder<T> {
        return slice(this, indicesOrFromIndex, toIndex, limit,)
    }

    //#endregion -------------------- Slice methods --------------------
    //#region -------------------- Map methods --------------------

    //#region -------------------- Map methods --------------------

    public map<const U, >(transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U> {
        return map(this, transform,)
    }

    //#endregion -------------------- Map methods --------------------
    //#region -------------------- Map indexed methods --------------------

    public mapIndexed<const U, >(transform: IndexValueWithReturnCallback<T, U>,): CollectionHolder<U> {
        return mapIndexed(this, transform,)
    }

    //#endregion -------------------- Map indexed methods --------------------
    //#region -------------------- Map not null methods --------------------

    public mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNull(this, transform,)
    }

    //#endregion -------------------- Map not null methods --------------------
    //#region -------------------- Map not null indexed methods --------------------

    public mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNullIndexed(this, transform,)
    }

    //#endregion -------------------- Map not null indexed methods --------------------

    //#endregion -------------------- Map methods --------------------
    //#region -------------------- For each methods --------------------

    //#region -------------------- For each methods --------------------

    public forEach(action: ValueIndexCallback<T>,): this {
        return forEach(this, action,)
    }

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- For each indexed methods --------------------

    public forEachIndexed(action: IndexValueCallback<T>,): this {
        return forEachIndexed(this, action,)
    }

    //#endregion -------------------- For each indexed methods --------------------

    //#endregion -------------------- For each methods --------------------

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


    public toReverse(fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): CollectionHolder<T> {
        return toReverse(this, fromIndex, toIndex, limit,)
    }

    public toReversed(fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): CollectionHolder<T> {
        return this.toReverse(fromIndex, toIndex, limit,)
    }

    public reversed(fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): CollectionHolder<T> {
        return this.toReverse(fromIndex, toIndex, limit,)
    }


    //#region -------------------- Conversion methods (toString) --------------------

    public override toString(): string {
        return toString(this,)
    }

    public override toLocaleString(locale?: Nullable<string>,): string {
        return toLocaleString(this, locale,)
    }

    public toLowerCaseString(): string {
        return toLowerCaseString(this,)
    }

    public toLocaleLowerCaseString(locale?: Nullable<string>,): string {
        return toLocaleLowerCaseString(this, locale,)
    }

    public toUpperCaseString(): string {
        return toUpperCaseString(this,)
    }

    public toLocaleUpperCaseString(locale?: Nullable<string>,): string {
        return toLocaleUpperCaseString(this, locale,)
    }

    //#endregion -------------------- Conversion methods (toString) --------------------

    //#endregion -------------------- Conversion methods --------------------

    //#endregion -------------------- Methods --------------------

}

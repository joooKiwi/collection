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
import {allByCollectionHolder}                     from "./method/all"
import {anyByCollectionHolder}                     from "./method/any"
import {filterByCollectionHolder}                  from "./method/filter"
import {filterIndexedByCollectionHolder}           from "./method/filterIndexed"
import {filterNotByCollectionHolder}               from "./method/filterNot"
import {filterNotIndexedByCollectionHolder}        from "./method/filterNotIndexed"
import {filterNotNullByCollectionHolder}           from "./method/filterNotNull"
import {findByCollectionHolder}                    from "./method/find"
import {findIndexedByCollectionHolder}             from "./method/findIndexed"
import {findLastByCollectionHolder}                from "./method/findLast"
import {findLastIndexedByCollectionHolder}         from "./method/findLastIndexed"
import {firstByCollectionHolder}                   from "./method/first"
import {firstOrNullByCollectionHolder}             from "./method/firstOrNull"
import {forEachByCollectionHolder}                 from "./method/forEach"
import {forEachIndexedByCollectionHolder}          from "./method/forEachIndexed"
import {getOrElseByCollectionHolder}               from "./method/getOrElse"
import {getOrNullByCollectionHolder}               from "./method/getOrNull"
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
import {isEmptyByCollectionHolder}                 from "./method/isEmpty"
import {isNotEmptyByCollectionHolder}              from "./method/isNotEmpty"
import {joinToStringByCollectionHolder}            from "./method/joinToString"
import {lastByCollectionHolder}                    from "./method/last"
import {lastIndexOfByCollectionHolder}             from "./method/lastIndexOf"
import {lastOrNullByCollectionHolder}              from "./method/lastOrNull"
import {noneByCollectionHolder}                    from "./method/none"
import {mapByCollectionHolder}                     from "./method/map"
import {mapIndexedByCollectionHolder}              from "./method/mapIndexed"
import {mapNotNullByCollectionHolder}              from "./method/mapNotNull"
import {mapNotNullIndexedByCollectionHolder}       from "./method/mapNotNullIndexed"
import {onEachByCollectionHolder}                  from "./method/onEach"
import {onEachIndexedByCollectionHolder}           from "./method/onEachIndexed"
import {requireNoNullsByCollectionHolder}          from "./method/requireNoNulls"
import {sliceByCollectionHolder}                   from "./method/slice"
import {sliceWithARangeByCollectionHolder}         from "./method/slice.withARange"
import {toArrayByCollectionHolder}                 from "./method/toArray"
import {toIteratorByCollectionHolder}              from "./method/toIterator"
import {toLocaleLowerCaseStringByCollectionHolder} from "./method/toLocaleLowerCaseString"
import {toLocaleStringByCollectionHolder}          from "./method/toLocaleString"
import {toLocaleUpperCaseStringByCollectionHolder} from "./method/toLocaleUpperCaseString"
import {toLowerCaseStringByCollectionHolder}       from "./method/toLowerCaseString"
import {toMapByCollectionHolder}                   from "./method/toMap"
import {toMutableArrayByCollectionHolder}          from "./method/toMutableArray"
import {toMutableMapByCollectionHolder}            from "./method/toMutableMap"
import {toMutableSetByCollectionHolder}            from "./method/toMutableSet"
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
    //#region -------------------- Methods --------------------

    //#region -------------------- Size methods --------------------

    public get length(): this["size"] { return this.size }
    public get count(): this["size"] { return this.size }

    public get isEmpty(): boolean { return isEmptyByCollectionHolder(this,) }

    public get isNotEmpty(): boolean { return isNotEmptyByCollectionHolder(this,) }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    public at(index: number,): T {
        return this.get(index,)
    }

    public elementAt(index: number,): T {
        return this.get(index,)
    }

    //#endregion -------------------- Get --------------------
    //#region -------------------- Get or else --------------------

    public getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public getOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) {
        return getOrElseByCollectionHolder(this, index, defaultValue,)
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

    //#endregion -------------------- Get or else --------------------
    //#region -------------------- Get or null --------------------

    public getOrNull(index: number,): NullOr<T> {
        return getOrNullByCollectionHolder<T>(this, index,)
    }

    public atOrNull(index: number,): NullOr<T> {
        return this.getOrNull(index,)
    }

    public elementAtOrNull(index: number,): NullOr<T> {
        return this.getOrNull(index,)
    }

    //#endregion -------------------- Get or null --------------------

    //#region -------------------- First --------------------

    public first(): T
    public first<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): S
    public first(predicate: Nullable<BooleanCallback<T>>,): T
    public first(predicate?: Nullable<BooleanCallback<T>>,) {
        if (arguments.length === 0)
            return firstByCollectionHolder(this,)
        return firstByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- First --------------------
    //#region -------------------- First or null --------------------

    public firstOrNull(): NullOr<T>
    public firstOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public firstOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
    public firstOrNull(predicate?: Nullable<BooleanCallback<T>>,) {
        if (arguments.length === 0)
            return firstOrNullByCollectionHolder(this, predicate,)
        return firstOrNullByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- First or null --------------------

    //#region -------------------- Last --------------------

    public last(): T
    public last<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): S
    public last(predicate: Nullable<BooleanCallback<T>>,): T
    public last(predicate?: Nullable<BooleanCallback<T>>,) {
        if (arguments.length === 0)
        return lastByCollectionHolder(this,)
        return lastByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Last --------------------
    //#region -------------------- Last or null --------------------

    public lastOrNull(): NullOr<T>
    public lastOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public lastOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
    public lastOrNull(predicate?: Nullable<BooleanCallback<T>>,) {
        if (arguments.length === 0)
            return lastOrNullByCollectionHolder(this,)
        return lastOrNullByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Last or null --------------------

    //#region -------------------- Find --------------------

    public find<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public find(predicate: BooleanCallback<T>,): NullOr<T>
    public find(predicate: BooleanCallback<T>,) {
        return findByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Find --------------------
    //#region -------------------- Find indexed --------------------

    public findIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public findIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public findIndexed(predicate: ReverseBooleanCallback<T>,) {
        return findIndexedByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Find indexed --------------------

    //#region -------------------- Find last --------------------

    public findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public findLast(predicate: BooleanCallback<T>,): NullOr<T>
    public findLast(predicate: BooleanCallback<T>,) {
        return findLastByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Find last --------------------
    //#region -------------------- Find last indexed --------------------

    public findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public findLastIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public findLastIndexed(predicate: ReverseBooleanCallback<T>,) {
        return findLastIndexedByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Find last indexed --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    //#region -------------------- Index of --------------------

    public indexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber
    /** @deprecated Remove the {@link limit} or use {@link CollectionHolder.dropLast} or {@link CollectionHolder.take} instead. This will be removed in version 1.11 */
    public indexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
    /** @deprecated Use a value present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public indexOf(element: unknown, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
    public indexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber,) {
        return indexOfByCollectionHolder(this, element, fromIndex, toIndex,)
    }

    //#endregion -------------------- Index of --------------------

    //#region -------------------- Last index of --------------------

    public lastIndexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber
    /** @deprecated Remove the {@link limit} or use {@link CollectionHolder.drop} or {@link CollectionHolder.takeLast} instead. This will be removed in version 1.11 */
    public lastIndexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
    /** @deprecated Use a value present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public lastIndexOf(element: unknown, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
    public lastIndexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber,) {
        return lastIndexOfByCollectionHolder(this, element, fromIndex, toIndex,)
    }

    //#endregion -------------------- Last index of --------------------

    //#region -------------------- Index of first --------------------

    public indexOfFirst(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber
    /** @deprecated Remove the {@link limit} or use {@link CollectionHolder.dropLast} or {@link CollectionHolder.take} instead. This will be removed in version 1.11 */
    public indexOfFirst(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
    public indexOfFirst(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,) {
        return indexOfFirstByCollectionHolder(this, predicate, fromIndex, toIndex,)
    }

    //#endregion -------------------- Index of first --------------------
    //#region -------------------- Index of first indexed --------------------

    public indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber
    /** @deprecated Remove the {@link limit} or use {@link CollectionHolder.dropLast} or {@link CollectionHolder.take} instead. This will be removed in version 1.11 */
    public indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
    public indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,) {
        return indexOfFirstIndexedByCollectionHolder(this, predicate, fromIndex, toIndex,)
    }

    //#endregion -------------------- Index of first indexed --------------------

    //#region -------------------- Index of last --------------------

    public indexOfLast(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber
    /** @deprecated Remove the {@link limit} or use {@link CollectionHolder.drop} or {@link CollectionHolder.takeLast} instead. This will be removed in version 1.11 */
    public indexOfLast(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
    public indexOfLast(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,) {
        return indexOfLastByCollectionHolder(this, predicate, fromIndex, toIndex,)
    }

    //#endregion -------------------- Index of last --------------------
    //#region -------------------- Index of last indexed --------------------

    public indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber
    /** @deprecated Remove the {@link limit} or use {@link CollectionHolder.drop} or {@link CollectionHolder.takeLast} instead. This will be removed in version 1.11 */
    public indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
    public indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,) {
        return indexOfLastIndexedByCollectionHolder(this, predicate, fromIndex, toIndex,)
    }

    //#endregion -------------------- Index of last indexed --------------------

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    //#region -------------------- All --------------------

    public all<S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolder<S>
    public all(predicate: BooleanCallback<T>,): boolean
    public all(predicate: BooleanCallback<T>,) {
        return allByCollectionHolder(this, predicate,)
    }

    public every<S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolder<S>
    public every(predicate: BooleanCallback<T>,): boolean
    public every(predicate: BooleanCallback<T>,) {
        return this.all(predicate,)
    }

    //#endregion -------------------- All --------------------
    //#region -------------------- Any --------------------

    public any(): this["isNotEmpty"]
    public any(predicate: Nullable<BooleanCallback<T>>,): boolean
    public any(predicate?: Nullable<BooleanCallback<T>>,) {
        if (arguments.length === 0)
            return anyByCollectionHolder(this,)
        return anyByCollectionHolder(this, predicate,)
    }

    public some(): this["isNotEmpty"]
    public some(predicate: Nullable<BooleanCallback<T>>,): boolean
    public some(predicate?: Nullable<BooleanCallback<T>>,) {
        if (arguments.length === 0)
            return this.any()
        return this.any(predicate,)
    }

    //#endregion -------------------- Any --------------------
    //#region -------------------- None --------------------

    public none(): this["isEmpty"]
    public none(predicate: Nullable<BooleanCallback<T>>,): boolean
    public none(predicate?: Nullable<BooleanCallback<T>>,) {
        if (arguments.length === 0)
            return noneByCollectionHolder(this,)
        return noneByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- None --------------------

    //#region -------------------- Has null --------------------

    public get hasNull(): boolean { return hasNullByCollectionHolder(this,) }
    public get includesNull(): this["hasNull"] { return this.hasNull }
    public get containsNull(): this["hasNull"] { return this.hasNull }

    //#endregion -------------------- Has null --------------------
    //#region -------------------- Has duplicate --------------------

    public get hasDuplicate(): boolean { return hasDuplicateByCollectionHolder(this,) }
    public get includesDuplicate(): this["hasDuplicate"] { return this.hasDuplicate }
    public get containsDuplicate(): this["hasDuplicate"] { return this.hasDuplicate }

    //#endregion -------------------- Has duplicate --------------------

    //#region -------------------- Has --------------------

    public has(value: T,): boolean
    /** @deprecated Use a value present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public has(value: unknown,): boolean
    public has(value: T,) {
        return hasByCollectionHolder(this, value,)
    }

    public includes(value: T,): boolean
    /** @deprecated Use a value present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public includes(value: unknown,): boolean
    public includes(value: T,) {
        return this.has(value,)
    }

    public contains(value: T,): boolean
    /** @deprecated Use a value present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public contains(value: unknown,): boolean
    public contains(value: T,) {
        return this.has(value,)
    }

    //#endregion -------------------- Has --------------------
    //#region -------------------- Has one --------------------

    public hasOne(values: readonly T[],): boolean
    public hasOne(values: ReadonlySet<T>,): boolean
    public hasOne(values: CollectionHolder<T>,): boolean
    public hasOne(values: MinimalistCollectionHolder<T>,): boolean
    public hasOne(values: CollectionIterator<T>,): boolean
    public hasOne(values: Iterable<T>,): boolean
    public hasOne(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
    /** @deprecated Use a value present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public hasOne(values: readonly unknown[],): boolean
    /** @deprecated Use a value present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public hasOne(values: ReadonlySet<unknown>,): boolean
    /** @deprecated Use a value present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public hasOne(values: CollectionHolder,): boolean
    /** @deprecated Use a value present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public hasOne(values: MinimalistCollectionHolder,): boolean
    /** @deprecated Use a value present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public hasOne(values: CollectionIterator,): boolean
    /** @deprecated Use a value present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public hasOne(values: Iterable<unknown>,): boolean
    /** @deprecated Use a value present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
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
    /** @deprecated Use a value present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public includesOne(values: readonly unknown[],): boolean
    /** @deprecated Use a value present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public includesOne(values: ReadonlySet<unknown>,): boolean
    /** @deprecated Use a value present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public includesOne(values: CollectionHolder,): boolean
    /** @deprecated Use a value present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public includesOne(values: MinimalistCollectionHolder,): boolean
    /** @deprecated Use a value present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public includesOne(values: CollectionIterator,): boolean
    /** @deprecated Use a value present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public includesOne(values: Iterable<unknown>,): boolean
    /** @deprecated Use a value present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
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
    /** @deprecated Use a value present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public containsOne(values: readonly unknown[],): boolean
    /** @deprecated Use a value present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public containsOne(values: ReadonlySet<unknown>,): boolean
    /** @deprecated Use a value present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public containsOne(values: CollectionHolder,): boolean
    /** @deprecated Use a value present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public containsOne(values: MinimalistCollectionHolder,): boolean
    /** @deprecated Use a value present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public containsOne(values: CollectionIterator,): boolean
    /** @deprecated Use a value present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public containsOne(values: Iterable<unknown>,): boolean
    /** @deprecated Use a value present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public containsOne(values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean
    public containsOne(values: PossibleIterableArraySetOrCollectionHolder<unknown>,) {
        return this.hasOne(values,)
    }

    //#endregion -------------------- Has one --------------------
    //#region -------------------- Has all --------------------

    public hasAll(values: readonly T[],): boolean
    public hasAll(values: ReadonlySet<T>,): boolean
    public hasAll(values: CollectionHolder<T>,): boolean
    public hasAll(values: MinimalistCollectionHolder<T>,): boolean
    public hasAll(values: CollectionIterator<T>,): boolean
    public hasAll(values: Iterable<T>,): boolean
    public hasAll(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
    /** @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public hasAll(values: readonly unknown[],): boolean
    /** @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public hasAll(values: ReadonlySet<unknown>,): boolean
    /** @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public hasAll(values: CollectionHolder,): boolean
    /** @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public hasAll(values: MinimalistCollectionHolder,): boolean
    /** @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public hasAll(values: CollectionIterator,): boolean
    /** @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public hasAll(values: Iterable<unknown>,): boolean
    /** @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
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
    /** @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public includesAll(values: readonly unknown[],): boolean
    /** @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public includesAll(values: ReadonlySet<unknown>,): boolean
    /** @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public includesAll(values: CollectionHolder,): boolean
    /** @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public includesAll(values: MinimalistCollectionHolder,): boolean
    /** @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public includesAll(values: CollectionIterator,): boolean
    /** @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public includesAll(values: Iterable<unknown>,): boolean
    /** @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
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
    /** @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public containsAll(values: readonly unknown[],): boolean
    /** @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public containsAll(values: ReadonlySet<unknown>,): boolean
    /** @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public containsAll(values: CollectionHolder,): boolean
    /** @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public containsAll(values: CollectionHolder,): boolean
    /** @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public containsAll(values: MinimalistCollectionHolder,): boolean
    /** @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public containsAll(values: CollectionIterator,): boolean
    /** @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public containsAll(values: Iterable<unknown>,): boolean
    /** @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11 */
    public containsAll(values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean
    public containsAll(values: PossibleIterableArraySetOrCollectionHolder<unknown>,) {
        return this.hasAll(values,)
    }

    //#endregion -------------------- Has all --------------------

    //#region -------------------- Require no nulls --------------------

    public requireNoNulls(): CollectionHolder<NonNullable<T>> {
        return requireNoNullsByCollectionHolder<T>(this,)
    }

    //#endregion -------------------- Require no nulls --------------------

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    public filter<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public filter(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public filter(predicate: BooleanCallback<T>,) {
        return filterByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Filter indexed --------------------

    public filterIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public filterIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public filterIndexed(predicate: ReverseBooleanCallback<T>,) {
        return filterIndexedByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Filter indexed --------------------

    //#region -------------------- Filter not --------------------

    public filterNot<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public filterNot(predicate: BooleanCallback<T>,) {
        return filterNotByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Filter not --------------------
    //#region -------------------- Filter not indexed --------------------

    public filterNotIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public filterNotIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public filterNotIndexed(predicate: ReverseBooleanCallback<T>,) {
        return filterNotIndexedByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Filter not indexed --------------------

    //#region -------------------- Filter not null --------------------

    public filterNotNull(): CollectionHolder<NonNullable<T>> {
        return filterNotNullByCollectionHolder<T>(this,)
    }

    //#endregion -------------------- Filter not null --------------------

    //#region -------------------- Slice --------------------

    public slice(indices: readonly number[],): CollectionHolder<T>
    public slice(indices: ReadonlySet<number>,): CollectionHolder<T>
    public slice(indices: CollectionHolder<number>,): CollectionHolder<T>
    public slice(indices: MinimalistCollectionHolder<number>,): CollectionHolder<T>
    public slice(indices: CollectionIterator<number>,): CollectionHolder<T>
    public slice(indices: Iterable<number>,): CollectionHolder<T>
    public slice(indices: PossibleIterableArraySetOrCollectionHolder<number>,): CollectionHolder<T>
    public slice(fromIndex?: NullableNumber, toIndex?: NullableNumber,): CollectionHolder<T>
    /** @deprecated Remove the {@link limit} or use {@link CollectionHolder.dropLast} or {@link CollectionHolder.take} instead. This will be removed in version 1.11 */
    public slice(fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T>
    public slice(indicesOrFromIndex?: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number>, toIndex?: NullableNumber,): CollectionHolder<T>
    /** @deprecated Remove the {@link limit} or use {@link CollectionHolder.dropLast} or {@link CollectionHolder.take} instead. This will be removed in version 1.11 */
    public slice(indicesOrFromIndex?: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number>, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T>
    public slice(indicesOrFromIndex?: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number>, toIndex?: NullableNumber,): CollectionHolder<T> {
        if (arguments.length === 0)
            return sliceWithARangeByCollectionHolder<T>(this,)
        if (arguments.length === 1)
            if (indicesOrFromIndex == null)
                return sliceWithARangeByCollectionHolder<T>(this, indicesOrFromIndex,)
            else if (typeof indicesOrFromIndex == "number")
                return sliceWithARangeByCollectionHolder<T>(this, indicesOrFromIndex,)
            else
                return sliceByCollectionHolder<T>(this, indicesOrFromIndex,)
        return sliceWithARangeByCollectionHolder<T>(this, indicesOrFromIndex as NullableNumber, toIndex,)
    }

    //#endregion -------------------- Slice --------------------

    //#region -------------------- Map --------------------

    public map<const U, >(transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U> {
        return mapByCollectionHolder(this, transform,)
    }

    //#endregion -------------------- Map --------------------
    //#region -------------------- Map indexed --------------------

    public mapIndexed<const U, >(transform: IndexValueWithReturnCallback<T, U>,): CollectionHolder<U> {
        return mapIndexedByCollectionHolder(this, transform,)
    }

    //#endregion -------------------- Map indexed --------------------

    //#region -------------------- Map not null --------------------

    public mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNullByCollectionHolder(this, transform,)
    }

    //#endregion -------------------- Map not null --------------------
    //#region -------------------- Map not null indexed --------------------

    public mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNullIndexedByCollectionHolder(this, transform,)
    }

    //#endregion -------------------- Map not null indexed --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- For each --------------------

    public forEach(action: ValueIndexCallback<T>,): void {
        forEachByCollectionHolder(this, action,)
    }

    //#endregion -------------------- For each --------------------
    //#region -------------------- For each indexed --------------------

    public forEachIndexed(action: IndexValueCallback<T>,): void {
        forEachIndexedByCollectionHolder(this, action,)
    }

    //#endregion -------------------- For each indexed --------------------

    //#region -------------------- On each --------------------

    public onEach(action: ValueIndexCallback<T>,): this {
        return onEachByCollectionHolder(this, action,)
    }

    //#endregion -------------------- On each --------------------
    //#region -------------------- On each indexed --------------------

    public onEachIndexed(action: IndexValueCallback<T>,): this {
        return onEachIndexedByCollectionHolder(this, action,)
    }

    //#endregion -------------------- On each indexed --------------------

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    //#region -------------------- To reverse --------------------

    public toReverse(fromIndex?: NullableNumber, toIndex?: NullableNumber,): CollectionHolder<T>
    /** @deprecated Remove the {@link limit} or use {@link CollectionHolder.dropLast} or {@link CollectionHolder.take} instead. This will be removed in version 1.11 */
    public toReverse(fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T>
    public toReverse(fromIndex?: NullableNumber, toIndex?: NullableNumber,) {
        return toReverseByCollectionHolder<T>(this, fromIndex, toIndex,)
    }

    public toReversed(fromIndex?: NullableNumber, toIndex?: NullableNumber,): CollectionHolder<T>
    /** @deprecated Remove the {@link limit} or use {@link CollectionHolder.dropLast} or {@link CollectionHolder.take} instead. This will be removed in version 1.11 */
    public toReversed(fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T>
    public toReversed(fromIndex?: NullableNumber, toIndex?: NullableNumber,) {
        return this.toReverse(fromIndex, toIndex,)
    }

    public reversed(fromIndex?: NullableNumber, toIndex?: NullableNumber,): CollectionHolder<T>
    /** @deprecated Remove the {@link limit} or use {@link CollectionHolder.dropLast} or {@link CollectionHolder.take} instead. This will be removed in version 1.11 */
    public reversed(fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T>
    public reversed(fromIndex?: NullableNumber, toIndex?: NullableNumber,) {
        return this.toReverse(fromIndex, toIndex,)
    }

    //#endregion -------------------- To reverse --------------------

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- Javascript methods --------------------

    public [Symbol.iterator](): CollectionIterator<T> {
        return toIteratorByCollectionHolder<T>(this,)
    }

    public get [Symbol.toStringTag](): CollectionHolderName {
        return "CollectionHolder"
    }

    //#endregion -------------------- Javascript methods --------------------
    //#region -------------------- Conversion methods --------------------

    //#region -------------------- To iterator --------------------

    public toIterator(): CollectionIterator<T> {
        return this[Symbol.iterator]()
    }

    //#endregion -------------------- To iterator --------------------
    //#region -------------------- To array --------------------

    public toArray(): readonly T[] {
        return toArrayByCollectionHolder<T>(this,)
    }

    public toMutableArray(): T[] {
        return toMutableArrayByCollectionHolder<T>(this,)
    }

    //#endregion -------------------- To array --------------------
    //#region -------------------- To set --------------------

    public toSet(): ReadonlySet<T> {
        return toSetByCollectionHolder<T>(this,)
    }

    public toMutableSet(): Set<T> {
        return toMutableSetByCollectionHolder<T>(this,)
    }

    //#endregion -------------------- To set --------------------
    //#region -------------------- To map --------------------

    public toMap(): ReadonlyMap<number, T> {
        return toMapByCollectionHolder<T>(this,)
    }

    public toMutableMap(): Map<number, T> {
        return toMutableMapByCollectionHolder<T>(this,)
    }

    //#endregion -------------------- To map --------------------

    //#region -------------------- To string --------------------

    public override toString(): string {
        return toStringByCollectionHolder(this,)
    }

    public override toLocaleString(locale?: NullableString,): string {
        if (arguments.length === 0)
            return toLocaleStringByCollectionHolder(this,)
        return toLocaleStringByCollectionHolder(this, locale,)
    }


    public toLowerCaseString(): string {
        return toLowerCaseStringByCollectionHolder(this,)
    }

    public toLocaleLowerCaseString(locale?: NullableString,): string {
        if (arguments.length === 0)
            return toLocaleLowerCaseStringByCollectionHolder(this,)
        return toLocaleLowerCaseStringByCollectionHolder(this, locale,)
    }


    public toUpperCaseString(): string {
        return toUpperCaseStringByCollectionHolder(this,)
    }

    public toLocaleUpperCaseString(locale?: NullableString,): string {
        if (arguments.length === 0)
            return toLocaleUpperCaseStringByCollectionHolder(this,)
        return toLocaleUpperCaseStringByCollectionHolder(this, locale,)
    }

    //#endregion -------------------- To string --------------------
    //#region -------------------- Join to string --------------------

    public join(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string {
        return this.joinToString(separator, prefix, postfix, limit, truncated, transform,)
    }

    public joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string {
        return joinToStringByCollectionHolder(this, separator, prefix, postfix, limit, truncated, transform,)
    }

    //#endregion -------------------- Join to string --------------------

    //#endregion -------------------- Conversion methods --------------------

    //#endregion -------------------- Methods --------------------

}

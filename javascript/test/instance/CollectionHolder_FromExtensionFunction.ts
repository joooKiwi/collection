/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullableNumber, NullableString, NullOr, NullOrNumber, TemplateOrNumber} from "@joookiwi/type"

import type {CollectionHolder}                                                                                                                                                                                                                                                                                                              from "../../src/CollectionHolder"
import type {BooleanCallback, CollectionHolderName, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, ObjectOf, PossibleIterableArraySetOrCollectionHolder, RestrainedBooleanCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, StringCallback, ValueIndexCallback, ValueIndexWithReturnCallback} from "../../src/CollectionHolder.types"
import type {MinimalistCollectionHolder}                                                                                                                                                                                                                                                                                                    from "../../src/MinimalistCollectionHolder"
import type {CollectionIterator}                                                                                                                                                                                                                                                                                                            from "../../src/iterator/CollectionIterator"

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
import {forEach}                                   from "../../src/method/forEach"
import {forEachIndexed}                            from "../../src/method/forEachIndexed"
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
import {joinByCollectionHolder}                    from "../../src/method/join"
import {lastByCollectionHolder}                    from "../../src/method/last"
import {lastIndexOfByCollectionHolder}             from "../../src/method/lastIndexOf"
import {lastOrNullByCollectionHolder}              from "../../src/method/lastOrNull"
import {noneByCollectionHolder}                    from "../../src/method/none"
import {mapByCollectionHolder}                     from "../../src/method/map"
import {mapIndexedByCollectionHolder}              from "../../src/method/mapIndexed"
import {mapNotNullByCollectionHolder}              from "../../src/method/mapNotNull"
import {mapNotNullIndexedByCollectionHolder}       from "../../src/method/mapNotNullIndexed"
import {objectValuesMapByCollectionHolder}         from "../../src/method/objectValuesMap"
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
import {toMutableWeakSet}                          from "../../src/method/toMutableWeakSet"
import {toReverseByCollectionHolder}               from "../../src/method/toReverse"
import {toSetByCollectionHolder}                   from "../../src/method/toSet"
import {toStringByCollectionHolder}                from "../../src/method/toString"
import {toUpperCaseStringByCollectionHolder}       from "../../src/method/toUpperCaseString"
import {toWeakSet}                                 from "../../src/method/toWeakSet"

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


    public override get isNotEmpty(): never {
        throw new Error("The getter method \"isNotEmpty\" was not expected to be called.",)
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

    public override at(index: number,): T
    public override at(): never {
        throw new Error("The method \"at\" was not expected to be called in a test.",)
    }

    public override elementAt(index: number,): T
    public override elementAt(): never {
        throw new Error("The method \"elementAt\" was not expected to be called in a test.",)
    }


    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public override getOrElse(): never {
        throw new Error("The method \"getOrElse\" was not expected to be called in a test.",)
    }

    public override atOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public override atOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public override atOrElse(): never {
        throw new Error("The method \"atOrElse\" was not expected to be called in a test.",)
    }

    public override elementAtOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public override elementAtOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public override elementAtOrElse(): never {
        throw new Error("The method \"elementAtOrElse\" was not expected to be called in a test.",)
    }


    public override getOrNull(index: number,): NullOr<T>
    public override getOrNull(): never {
        throw new Error("The method \"getOrNull\" was not expected to be called in a test.",)
    }

    public override atOrNull(index: number,): NullOr<T>
    public override atOrNull(): never {
        throw new Error("The method \"atOrNull\" was not expected to be called in a test.",)
    }

    public override elementAtOrNull(index: number,): NullOr<T>
    public override elementAtOrNull(): never {
        throw new Error("The method \"elementAtOrNull\" was not expected to be called in a test.",)
    }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Index methods --------------------

    public override indexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
    public override indexOf(element: unknown, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
    public override indexOf(element: unknown, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber {
        return indexOfByCollectionHolder(this, element, fromIndex, toIndex, limit,)
    }


    public override lastIndexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
    public override lastIndexOf(element: unknown, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber
    public override lastIndexOf(element: unknown, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber {
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
    public override first<const S extends T, >(predicate?: Nullable<| BooleanCallback<T> | RestrainedBooleanCallback<T, S>>,) {
        return firstByCollectionHolder(this, predicate,)
    }

    public override firstOrNull(): NullOr<T>
    public override firstOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public override firstOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
    public override firstOrNull<const S extends T, >(predicate?: Nullable<| BooleanCallback<T> | RestrainedBooleanCallback<T, S>>,) {
        return firstOrNullByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- First methods --------------------
    //#region -------------------- Last methods --------------------

    public override last(): NonNullable<T>
    public override last<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NonNullable<S>
    public override last(predicate: Nullable<BooleanCallback<T>>,): NonNullable<T>
    public override last<const S extends T, >(predicate?: Nullable<| BooleanCallback<T> | RestrainedBooleanCallback<T, S>>,) {
        return lastByCollectionHolder(this, predicate,)
    }

    public override lastOrNull(): NullOr<T>
    public override lastOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public override lastOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
    public override lastOrNull<const S extends T, >(predicate?: Nullable<| BooleanCallback<T> | RestrainedBooleanCallback<T, S>>,) {
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
    public override any(predicate?: Nullable<BooleanCallback<T>>,): boolean {
        return anyByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Any methods --------------------
    //#region -------------------- None methods --------------------

    public override none(): this["isEmpty"]
    public override none(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override none(predicate?: Nullable<BooleanCallback<T>>,): boolean {
        return noneByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- None methods --------------------

    //#region -------------------- Has methods --------------------

    public override has(value: T,): boolean
    public override has(...values: readonly T[]): boolean
    public override has(value: unknown,): boolean
    public override has(...values: readonly unknown[]): boolean
    public override has(): boolean {
        if (arguments.length == 1)
            return hasByCollectionHolder(this, arguments[0] as unknown,)
        throw new Error("The method \"has\" was not expected to be called with a variadic parameter.",) // TODO Remove once the version 1.10 is in progress
    }

    public override includes(value: T,): boolean
    public override includes(...values: readonly T[]): boolean
    public override includes(value: unknown,): boolean
    public override includes(...values: readonly unknown[]): boolean
    public override includes(): never {
        throw new Error("The method \"includes\" was not expected to be called.",)
    }

    public override contains(value: T,): boolean
    public override contains(...values: readonly T[]): boolean
    public override contains(value: unknown,): boolean
    public override contains(...values: readonly unknown[]): boolean
    public override contains(): never {
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
    public override hasOne(...values: readonly T[]): boolean
    public override hasOne(...values: readonly unknown[]): boolean
    public override hasOne(): boolean {
        if (arguments.length == 1)
            return hasOneByCollectionHolder(this, arguments[0] as PossibleIterableArraySetOrCollectionHolder<unknown>,)
        throw new Error("The method \"hasOne\" was not expected to be called with a variadic parameter.",) // TODO Remove once the version 1.10 is in progress
    }

    public override includesOne(values: readonly T[],): boolean
    public override includesOne(values: ReadonlySet<T>,): boolean
    public override includesOne(values: CollectionHolder<T>,): boolean
    public override includesOne(values: MinimalistCollectionHolder<T>,): boolean
    public override includesOne(values: CollectionIterator<T>,): boolean
    public override includesOne(values: Iterable<T>,): boolean
    public override includesOne(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
    public override includesOne(values: readonly unknown[],): boolean
    public override includesOne(values: ReadonlySet<unknown>,): boolean
    public override includesOne(values: CollectionHolder,): boolean
    public override includesOne(values: MinimalistCollectionHolder,): boolean
    public override includesOne(values: CollectionIterator,): boolean
    public override includesOne(values: Iterable<unknown>,): boolean
    public override includesOne(values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean
    public override includesOne(...values: readonly T[]): boolean
    public override includesOne(...values: readonly unknown[]): boolean
    public override includesOne(): never {
        throw new Error("The method \"includesOne\" was not expected to be called.",)
    }

    public override containsOne(values: readonly T[],): boolean
    public override containsOne(values: ReadonlySet<T>,): boolean
    public override containsOne(values: MinimalistCollectionHolder<T>,): boolean
    public override containsOne(values: MinimalistCollectionHolder<T>,): boolean
    public override containsOne(values: MinimalistCollectionHolder<T>,): boolean
    public override containsOne(values: Iterable<T>,): boolean
    public override containsOne(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
    public override containsOne(values: readonly unknown[],): boolean
    public override containsOne(values: ReadonlySet<unknown>,): boolean
    public override containsOne(values: CollectionHolder,): boolean
    public override containsOne(values: MinimalistCollectionHolder,): boolean
    public override containsOne(values: CollectionIterator,): boolean
    public override containsOne(values: Iterable<unknown>,): boolean
    public override containsOne(values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean
    public override containsOne(...values: readonly T[]): boolean
    public override containsOne(...values: readonly unknown[]): boolean
    public override containsOne(): never {
        throw new Error("The method \"containsOne\" was not expected to be called.",)
    }

    //#region -------------------- Has one methods --------------------

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
    public override hasAll(...values: readonly T[]): boolean
    public override hasAll(...values: readonly unknown[]): boolean
    public override hasAll(): boolean {
        if (arguments.length == 1)
            return hasAllByCollectionHolder(this, arguments[0] as PossibleIterableArraySetOrCollectionHolder<unknown>,)
        throw new Error("The method \"hasAll\" was not expected to be called with a variadic parameter.",) // TODO Remove once the version 1.10 is in progress
    }

    public override includesAll(values: readonly T[],): boolean
    public override includesAll(values: ReadonlySet<T>,): boolean
    public override includesAll(values: CollectionHolder<T>,): boolean
    public override includesAll(values: MinimalistCollectionHolder<T>,): boolean
    public override includesAll(values: CollectionIterator<T>,): boolean
    public override includesAll(values: Iterable<T>,): boolean
    public override includesAll(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
    public override includesAll(values: readonly unknown[],): boolean
    public override includesAll(values: ReadonlySet<unknown>,): boolean
    public override includesAll(values: CollectionHolder,): boolean
    public override includesAll(values: MinimalistCollectionHolder,): boolean
    public override includesAll(values: CollectionIterator,): boolean
    public override includesAll(values: Iterable<unknown>,): boolean
    public override includesAll(values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean
    public override includesAll(...values: readonly T[]): boolean
    public override includesAll(...values: readonly unknown[]): boolean
    public override includesAll(): never {
        throw new Error("The method \"includesAll\" was not expected to be called.",)
    }

    public override containsAll(values: readonly T[],): boolean
    public override containsAll(values: ReadonlySet<T>,): boolean
    public override containsAll(values: CollectionHolder<T>,): boolean
    public override containsAll(values: MinimalistCollectionHolder<T>,): boolean
    public override containsAll(values: CollectionIterator<T>,): boolean
    public override containsAll(values: Iterable<T>,): boolean
    public override containsAll(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
    public override containsAll(values: readonly unknown[],): boolean
    public override containsAll(values: ReadonlySet<unknown>,): boolean
    public override containsAll(values: CollectionHolder,): boolean
    public override containsAll(values: MinimalistCollectionHolder,): boolean
    public override containsAll(values: CollectionIterator,): boolean
    public override containsAll(values: Iterable<unknown>,): boolean
    public override containsAll(values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean
    public override containsAll(...values: readonly T[]): boolean
    public override containsAll(...values: readonly unknown[]): boolean
    public override containsAll(): never {
        throw new Error("The \"containsAll\" was not expected to be called.",)
    }

    //#endregion -------------------- Has all methods --------------------

    //#region -------------------- Join to string methods --------------------

    public override join(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string
    public override join(): never {
        throw new Error("The method \"join\" was not expected to be called.",)
    }

    public override joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string {
        return joinByCollectionHolder(this, separator, prefix, postfix, limit, truncated, transform,)
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

    public override filterIndexedNot<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filterIndexedNot(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterIndexedNot(): never {
        throw new Error("The method \"filterIndexedNot\" was not expected to be called.",)
    }

    public override filterNotIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,) {
        return filterNotIndexedByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Filter not indexed methods --------------------
    //#region -------------------- Filter not null methods --------------------

    public override filterNotNull(): CollectionHolder<NonNullable<T>> {
        return filterNotNullByCollectionHolder<T>(this,)
    }

    //#endregion -------------------- Filter not null methods --------------------
    //#region -------------------- Require no nulls methods --------------------

    public override requireNoNulls(): CollectionHolder<NonNullable<T>> {
        return requireNoNullsByCollectionHolder<T>(this,)
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
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T> {
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
    public override slice(indicesOrFromIndex?: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number>, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T> {
        return sliceByCollectionHolder<T>(this, indicesOrFromIndex, toIndex, limit,)
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

    public override forEach(action: ValueIndexCallback<T>,): this {
        return forEach(this, action,)
    }

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- For each indexed methods --------------------

    public override forEachIndexed(action: IndexValueCallback<T>,): this {
        return forEachIndexed(this, action,)
    }

    //#endregion -------------------- For each indexed methods --------------------

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

    public override get objectValuesMap(): ReadonlyMap<T, ObjectOf<T>> {
        return objectValuesMapByCollectionHolder<T>(this,)
    }


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


    public override toWeakSet(): Readonly<WeakSet<ObjectOf<T>>> {
        return toWeakSet(this,)
    }

    public override toMutableWeakSet(): WeakSet<ObjectOf<T>> {
        return toMutableWeakSet(this,)
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

    public override toReversed(fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T>
    public override toReversed(): never {
        throw new Error("The method \"toReversed\" was not expected to be called.",)
    }

    public override reversed(fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T>
    public override reversed(): never {
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

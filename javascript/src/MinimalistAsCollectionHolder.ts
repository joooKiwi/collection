//··························································
// Copyright (c) 2023-2026. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import type {Array, MutableArray, MutableNumberKeyMap, MutableSet, Nullable, NullableNumber, NullableString, NullOr, NullOrNumber, NumberArray, NumberKeyMap, NumberSet, Set} from "@joookiwi/type"

import type {CollectionHolder}                                                                                                                                                                                                                                                  from "./CollectionHolder"
import type {MinimalistCollectionHolder}                                                                                                                                                                                                                                        from "./MinimalistCollectionHolder"
import type {CollectionIterator}                                                                                                                                                                                                                                                from "./iterator/CollectionIterator"
import type {BooleanCallback, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, RestrainedBooleanCallback, ReturnCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, StringCallback, ValueIndexCallback, ValueIndexWithReturnCallback} from "./type/callback"
import type {HasAtMost1ElementOnMinimalistCollectionHolder}                                                                                                                                                                                                                     from "./type/hasAtMost1Element"
import type {HasAtMost2ElementsOnMinimalistCollectionHolder}                                                                                                                                                                                                                    from "./type/hasAtMost2Elements"
import type {HasExactly1ElementOnMinimalistCollectionHolder}                                                                                                                                                                                                                    from "./type/hasExactly1Element"
import type {HasExactly2ElementsOnMinimalistCollectionHolder}                                                                                                                                                                                                                   from "./type/hasExactly2Elements"
import type {IsEmptyOnMinimalistCollectionHolder}                                                                                                                                                                                                                               from "./type/isEmpty"
import type {IsNotEmptyOnMinimalistCollectionHolder}                                                                                                                                                                                                                            from "./type/isNotEmpty"
import type {PossibleIterableIteratorArraySetOrCollectionHolder}                                                                                                                                                                                                                from "./type/possibleInstance"

import {AbstractUnimplementedCollectionHolder}                 from "./AbstractUnimplementedCollectionHolder"
import {allByMinimalistCollectionHolder}                       from "./method/all"
import {anyByMinimalistCollectionHolder}                       from "./method/any"
import {dropByMinimalistCollectionHolder}                      from "./method/drop"
import {dropLastByMinimalistCollectionHolder}                  from "./method/dropLast"
import {dropLastWhileByMinimalistCollectionHolder}             from "./method/dropLastWhile"
import {dropLastWhileIndexedByMinimalistCollectionHolder}      from "./method/dropLastWhileIndexed"
import {dropWhileByMinimalistCollectionHolder}                 from "./method/dropWhile"
import {dropWhileIndexedByMinimalistCollectionHolder}          from "./method/dropWhileIndexed"
import {filterByMinimalistCollectionHolder}                    from "./method/filter"
import {filterIndexedByMinimalistCollectionHolder}             from "./method/filterIndexed"
import {filterNotByMinimalistCollectionHolder}                 from "./method/filterNot"
import {filterNotIndexedByMinimalistCollectionHolder}          from "./method/filterNotIndexed"
import {filterNotNullByMinimalistCollectionHolder}             from "./method/filterNotNull"
import {findFirstByMinimalistCollectionHolder}                 from "./method/findFirst"
import {findFirstIndexedByMinimalistCollectionHolder}          from "./method/findFirstIndexed"
import {findFirstIndexedOrNullByMinimalistCollectionHolder}    from "./method/findFirstIndexedOrNull"
import {findFirstOrNullByMinimalistCollectionHolder}           from "./method/findFirstOrNull"
import {findLastByMinimalistCollectionHolder}                  from "./method/findLast"
import {findLastIndexedByMinimalistCollectionHolder}           from "./method/findLastIndexed"
import {findLastIndexedOrNullByMinimalistCollectionHolder}     from "./method/findLastIndexedOrNull"
import {findLastOrNullByMinimalistCollectionHolder}            from "./method/findLastOrNull"
import {firstIndexOfByMinimalistCollectionHolder}              from "./method/firstIndexOf"
import {firstIndexOfOrNullByMinimalistCollectionHolder}        from "./method/firstIndexOfOrNull"
import {forEachByMinimalistCollectionHolder}                   from "./method/forEach"
import {forEachIndexedByMinimalistCollectionHolder}            from "./method/forEachIndexed"
import {getFirstByMinimalistCollectionHolder}                  from "./method/getFirst"
import {getFirstOrElseByMinimalistCollectionHolder}            from "./method/getFirstOrElse"
import {getFirstOrNullByMinimalistCollectionHolder}            from "./method/getFirstOrNull"
import {getLastByMinimalistCollectionHolder}                   from "./method/getLast"
import {getLastOrNullByMinimalistCollectionHolder}             from "./method/getLastOrNull"
import {getLastOrElseByMinimalistCollectionHolder}             from "./method/getLastOrElse"
import {getOrElseByMinimalistCollectionHolder}                 from "./method/getOrElse"
import {getOrNullByMinimalistCollectionHolder}                 from "./method/getOrNull"
import {hasByMinimalistCollectionHolder}                       from "./method/has"
import {hasAllByMinimalistCollectionHolder}                    from "./method/hasAll"
import {hasAtLeast2ElementsByMinimalistCollectionHolder}       from "./method/hasAtLeast2Elements"
import {hasAtMost1ElementByMinimalistCollectionHolder}         from "./method/hasAtMost1Element"
import {hasAtMost2ElementsByMinimalistCollectionHolder}        from "./method/hasAtMost2Elements"
import {hasDuplicateByMinimalistCollectionHolder}              from "./method/hasDuplicate"
import {hasExactly1ElementByMinimalistCollectionHolder}        from "./method/hasExactly1Element"
import {hasExactly2ElementsByMinimalistCollectionHolder}       from "./method/hasExactly2Elements"
import {hasNoDuplicatesByMinimalistCollectionHolder}           from "./method/hasNoDuplicates"
import {hasNoNullsByMinimalistCollectionHolder}                from "./method/hasNoNulls"
import {hasNotByMinimalistCollectionHolder}                    from "./method/hasNot"
import {hasNotAllByMinimalistCollectionHolder}                 from "./method/hasNotAll"
import {hasNotOneByMinimalistCollectionHolder}                 from "./method/hasNotOne"
import {hasNullByMinimalistCollectionHolder}                   from "./method/hasNull"
import {hasOneByMinimalistCollectionHolder}                    from "./method/hasOne"
import {indexOfFirstByMinimalistCollectionHolder}              from "./method/indexOfFirst"
import {indexOfFirstOrNullByMinimalistCollectionHolder}        from "./method/indexOfFirstOrNull"
import {indexOfFirstIndexedByMinimalistCollectionHolder}       from "./method/indexOfFirstIndexed"
import {indexOfFirstIndexedOrNullByMinimalistCollectionHolder} from "./method/indexOfFirstIndexedOrNull"
import {indexOfLastByMinimalistCollectionHolder}               from "./method/indexOfLast"
import {indexOfLastOrNullByMinimalistCollectionHolder}         from "./method/indexOfLastOrNull"
import {indexOfLastIndexedByMinimalistCollectionHolder}        from "./method/indexOfLastIndexed"
import {indexOfLastIndexedOrNullByMinimalistCollectionHolder}  from "./method/indexOfLastIndexedOrNull"
import {isEmptyByMinimalistCollectionHolder}                   from "./method/isEmpty"
import {isNotEmptyByMinimalistCollectionHolder}                from "./method/isNotEmpty"
import {joinToStringByMinimalistCollectionHolder}              from "./method/joinToString"
import {lastIndexOfByMinimalistCollectionHolder}               from "./method/lastIndexOf"
import {lastIndexOfOrNullByMinimalistCollectionHolder}         from "./method/lastIndexOfOrNull"
import {noneByMinimalistCollectionHolder}                      from "./method/none"
import {mapByMinimalistCollectionHolder}                       from "./method/map"
import {mapIndexedByMinimalistCollectionHolder}                from "./method/mapIndexed"
import {mapNotNullByMinimalistCollectionHolder}                from "./method/mapNotNull"
import {mapNotNullIndexedByMinimalistCollectionHolder}         from "./method/mapNotNullIndexed"
import {requireNoNullsByMinimalistCollectionHolder}            from "./method/requireNoNulls"
import {sliceByMinimalistCollectionHolder}                     from "./method/slice"
import {takeByMinimalistCollectionHolder}                      from "./method/take"
import {takeLastByMinimalistCollectionHolder}                  from "./method/takeLast"
import {takeLastWhileByMinimalistCollectionHolder}             from "./method/takeLastWhile"
import {takeLastWhileIndexedByMinimalistCollectionHolder}      from "./method/takeLastWhileIndexed"
import {takeWhileByMinimalistCollectionHolder}                 from "./method/takeWhile"
import {takeWhileIndexedByMinimalistCollectionHolder}          from "./method/takeWhileIndexed"
import {toArrayByMinimalistCollectionHolder}                   from "./method/toArray"
import {toIteratorByMinimalistCollectionHolder}                from "./method/toIterator"
import {toLocaleLowerCaseStringByMinimalistCollectionHolder}   from "./method/toLocaleLowerCaseString"
import {toLocaleStringByMinimalistCollectionHolder}            from "./method/toLocaleString"
import {toLocaleUpperCaseStringByMinimalistCollectionHolder}   from "./method/toLocaleUpperCaseString"
import {toLowerCaseStringByMinimalistCollectionHolder}         from "./method/toLowerCaseString"
import {toMapByMinimalistCollectionHolder}                     from "./method/toMap"
import {toMutableArrayByMinimalistCollectionHolder}            from "./method/toMutableArray"
import {toMutableMapByMinimalistCollectionHolder}              from "./method/toMutableMap"
import {toMutableSetByMinimalistCollectionHolder}              from "./method/toMutableSet"
import {toReverseByMinimalistCollectionHolder}                 from "./method/toReverse"
import {toSetByMinimalistCollectionHolder}                     from "./method/toSet"
import {toStringByMinimalistCollectionHolder}                  from "./method/toString"
import {toUpperCaseStringByMinimalistCollectionHolder}      from "./method/toUpperCaseString"

/**
 *
 * @typeParam T         The type (`unknown` by default)
 * @typeParam REFERENCE The reference passed in the constructor (`MinimalistCollectionHolder<T>` by default)
 * @adaptor
 * @see LazyMinimalistAsCollectionHolder
 */
export class MinimalistAsCollectionHolder<const T,
    const REFERENCE extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >
    extends AbstractUnimplementedCollectionHolder<T> {

    //#region -------------------- Field --------------------

    readonly #reference: REFERENCE

    //#endregion -------------------- Field --------------------
    //#region -------------------- Constructor --------------------

    public constructor(reference: & MinimalistCollectionHolder<T> & REFERENCE,)
    public constructor(reference: REFERENCE,) {
        super()
        this.#reference = reference
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Reference methods --------------------

    /** The internal reference passed through the {@link constructor} */
    protected get _reference(): REFERENCE {
        return this.#reference
    }

    //#endregion -------------------- Reference methods --------------------

    //#region -------------------- Size methods --------------------

    public override get size(): REFERENCE["size"] {
        return this._reference.size
    }


    public override get isEmpty(): IsEmptyOnMinimalistCollectionHolder<REFERENCE> { return isEmptyByMinimalistCollectionHolder(this._reference,) }

    public override get isNotEmpty(): IsNotEmptyOnMinimalistCollectionHolder<REFERENCE> { return isNotEmptyByMinimalistCollectionHolder(this._reference,) }


    public override get hasExactly1Element(): HasExactly1ElementOnMinimalistCollectionHolder<REFERENCE> { return hasExactly1ElementByMinimalistCollectionHolder(this._reference,) }

    public override get hasAtMost1Element(): HasAtMost1ElementOnMinimalistCollectionHolder<REFERENCE> { return hasAtMost1ElementByMinimalistCollectionHolder(this._reference,) }


    public override get hasAtLeast2Elements(): boolean { return hasAtLeast2ElementsByMinimalistCollectionHolder(this._reference,) }

    public override get hasExactly2Elements(): HasExactly2ElementsOnMinimalistCollectionHolder<REFERENCE> { return hasExactly2ElementsByMinimalistCollectionHolder(this._reference,) }

    public override get hasAtMost2Elements(): HasAtMost2ElementsOnMinimalistCollectionHolder<REFERENCE> { return hasAtMost2ElementsByMinimalistCollectionHolder(this._reference,) }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    public override get(index: number,): T {
        return this._reference.get(index,)
    }

    public override getFirst(): T {
        return getFirstByMinimalistCollectionHolder(this._reference,)
    }

    public override getLast(): T {
        return getLastByMinimalistCollectionHolder(this._reference,)
    }


    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) {
        return getOrElseByMinimalistCollectionHolder(this._reference, index, defaultValue,)
    }

    public override getFirstOrElse<const U, >(defaultValue: ReturnCallback<U>,): | T | U
    public override getFirstOrElse(defaultValue: ReturnCallback<T>,): T
    public override getFirstOrElse(defaultValue: ReturnCallback<unknown>,) {
        return getFirstOrElseByMinimalistCollectionHolder(this._reference, defaultValue,)
    }

    public override getLastOrElse<const U, >(defaultValue: ReturnCallback<U>,): | T | U
    public override getLastOrElse(defaultValue: ReturnCallback<T>,): T
    public override getLastOrElse(defaultValue: ReturnCallback<unknown>,) {
        return getLastOrElseByMinimalistCollectionHolder(this._reference, defaultValue,)
    }


    public override getOrNull(index: number,): NullOr<T> {
        return getOrNullByMinimalistCollectionHolder(this._reference, index,)
    }

    public override getFirstOrNull(): NullOr<T> {
        return getFirstOrNullByMinimalistCollectionHolder(this._reference,)
    }

    public override getLastOrNull(): NullOr<T> {
        return getLastOrNullByMinimalistCollectionHolder(this._reference,)
    }

    //#endregion -------------------- Get --------------------
    //#region -------------------- Find --------------------

    public override findFirst<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public override findFirst(predicate: BooleanCallback<T>,): T
    public override findFirst(predicate: BooleanCallback<T>,) {
        return findFirstByMinimalistCollectionHolder(this._reference, predicate,)
    }

    public override findFirstOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findFirstOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public override findFirstOrNull(predicate: BooleanCallback<T>,) {
        return findFirstOrNullByMinimalistCollectionHolder(this._reference, predicate,)
    }

    public override findFirstIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public override findFirstIndexed(predicate: ReverseBooleanCallback<T>,): T
    public override findFirstIndexed(predicate: ReverseBooleanCallback<T>,) {
        return findFirstIndexedByMinimalistCollectionHolder(this._reference, predicate,)
    }

    public override findFirstIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,) {
        return findFirstIndexedOrNullByMinimalistCollectionHolder(this._reference, predicate,)
    }


    public override findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public override findLast(predicate: BooleanCallback<T>,): T
    public override findLast(predicate: BooleanCallback<T>,) {
        return findLastByMinimalistCollectionHolder(this._reference, predicate,)
    }

    public override findLastOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public override findLastOrNull(predicate: BooleanCallback<T>,) {
        return findLastOrNullByMinimalistCollectionHolder(this._reference, predicate,)
    }

    public override findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,): T
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,) {
        return findLastIndexedByMinimalistCollectionHolder(this._reference, predicate,)
    }

    public override findLastIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,) {
        return findLastIndexedOrNullByMinimalistCollectionHolder(this._reference, predicate,)
    }

    //#endregion -------------------- Find --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    public override firstIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,): number {
        return firstIndexOfByMinimalistCollectionHolder(this._reference, element, from, to,)
    }

    public override firstIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return firstIndexOfOrNullByMinimalistCollectionHolder(this._reference, element, from, to,)
    }


    public override lastIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,): number {
        return lastIndexOfByMinimalistCollectionHolder(this._reference, element, from, to,)
    }

    public override lastIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return lastIndexOfOrNullByMinimalistCollectionHolder(this._reference, element, from, to,)
    }


    public override indexOfFirst(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return indexOfFirstByMinimalistCollectionHolder(this._reference, predicate, from, to,)
    }

    public override indexOfFirstOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return indexOfFirstOrNullByMinimalistCollectionHolder(this._reference, predicate, from, to,)
    }

    public override indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return indexOfFirstIndexedByMinimalistCollectionHolder(this._reference, predicate, from, to,)
    }

    public override indexOfFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return indexOfFirstIndexedOrNullByMinimalistCollectionHolder(this._reference, predicate, from, to,)
    }


    public override indexOfLast(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return indexOfLastByMinimalistCollectionHolder(this._reference, predicate, from, to,)
    }

    public override indexOfLastOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return indexOfLastOrNullByMinimalistCollectionHolder(this._reference, predicate, from, to,)
    }

    public override indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return indexOfLastIndexedByMinimalistCollectionHolder(this._reference, predicate, from, to,)
    }

    public override indexOfLastIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return indexOfLastIndexedOrNullByMinimalistCollectionHolder(this._reference, predicate, from, to,)
    }

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    public override all<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolder<S>
    public override all(predicate: BooleanCallback<T>,): boolean
    public override all(predicate: BooleanCallback<T>,) {
        return allByMinimalistCollectionHolder(this._reference, predicate,)
    }

    public override any(): this["isNotEmpty"]
    public override any(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override any(predicate?: Nullable<BooleanCallback<T>>,) {
        return anyByMinimalistCollectionHolder(this._reference, predicate,)
    }

    public override none(): this["isEmpty"]
    public override none(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override none(predicate?: Nullable<BooleanCallback<T>>,) {
        return noneByMinimalistCollectionHolder(this._reference, predicate,)
    }


    public override get hasNull(): boolean {
        return hasNullByMinimalistCollectionHolder(this._reference,)
    }

    public override get hasNoNulls(): boolean {
        return hasNoNullsByMinimalistCollectionHolder(this._reference,)
    }


    public override get hasDuplicate(): boolean {
        return hasDuplicateByMinimalistCollectionHolder(this._reference,)
    }

    public override get hasNoDuplicates(): boolean {
        return hasNoDuplicatesByMinimalistCollectionHolder(this._reference,)
    }


    public override has(value: T,): boolean {
        return hasByMinimalistCollectionHolder(this._reference, value,)
    }

    public override hasNot(value: T,): boolean {
        return hasNotByMinimalistCollectionHolder(this._reference, value,)
    }

    public override hasOne(values: Nullable<Array<T>>,): boolean
    public override hasOne(values: Nullable<Set<T>>,): boolean
    public override hasOne(values: Nullable<CollectionHolder<T>>,): boolean
    public override hasOne(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public override hasOne(values: Nullable<CollectionIterator<T>>,): boolean
    public override hasOne(values: Nullable<IteratorObject<T, unknown, unknown>>,): boolean
    public override hasOne(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public override hasOne(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public override hasOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
    public override hasOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
        return hasOneByMinimalistCollectionHolder(this._reference, values,)
    }

    public override hasNotOne(values: Nullable<Array<T>>,): boolean
    public override hasNotOne(values: Nullable<Set<T>>,): boolean
    public override hasNotOne(values: Nullable<CollectionHolder<T>>,): boolean
    public override hasNotOne(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public override hasNotOne(values: Nullable<CollectionIterator<T>>,): boolean
    public override hasNotOne(values: Nullable<IteratorObject<T, unknown, unknown>>,): boolean
    public override hasNotOne(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public override hasNotOne(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public override hasNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
    public override hasNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
        return hasNotOneByMinimalistCollectionHolder(this._reference, values,)
    }

    public override hasAll(values: Nullable<Array<T>>,): boolean
    public override hasAll(values: Nullable<Set<T>>,): boolean
    public override hasAll(values: Nullable<CollectionHolder<T>>,): boolean
    public override hasAll(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public override hasAll(values: Nullable<CollectionIterator<T>>,): boolean
    public override hasAll(values: Nullable<IteratorObject<T, unknown, unknown>>,): boolean
    public override hasAll(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public override hasAll(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public override hasAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
    public override hasAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
        return hasAllByMinimalistCollectionHolder(this._reference, values,)
    }

    public override hasNotAll(values: Nullable<Array<T>>,): boolean
    public override hasNotAll(values: Nullable<Set<T>>,): boolean
    public override hasNotAll(values: Nullable<CollectionHolder<T>>,): boolean
    public override hasNotAll(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public override hasNotAll(values: Nullable<CollectionIterator<T>>,): boolean
    public override hasNotAll(values: Nullable<IteratorObject<T, unknown, unknown>>,): boolean
    public override hasNotAll(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public override hasNotAll(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public override hasNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
    public override hasNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
        return hasNotAllByMinimalistCollectionHolder(this._reference, values,)
    }


    public override requireNoNulls(): CollectionHolder<NonNullable<T>> {
        requireNoNullsByMinimalistCollectionHolder(this._reference,)
        return this as CollectionHolder<NonNullable<T>>
    }

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    public override filter<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filter(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filter(predicate: BooleanCallback<T>,) {
        return filterByMinimalistCollectionHolder(this._reference, predicate,)
    }

    public override filterIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,) {
        return filterIndexedByMinimalistCollectionHolder(this._reference, predicate,)
    }


    public override filterNot<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filterNot(predicate: BooleanCallback<T>,) {
        return filterNotByMinimalistCollectionHolder(this._reference, predicate,)
    }

    public override filterNotIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,) {
        return filterNotIndexedByMinimalistCollectionHolder(this._reference, predicate,)
    }


    public override filterNotNull(): CollectionHolder<NonNullable<T>> {
        return filterNotNullByMinimalistCollectionHolder(this._reference,)
    }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Slice --------------------

    public override slice(from?: NullableNumber, to?: NullableNumber,): CollectionHolder<T>
    public override slice(indices: NumberArray,): CollectionHolder<T>
    public override slice(indices: NumberSet,): CollectionHolder<T>
    public override slice(indices: CollectionHolder<number>,): CollectionHolder<T>
    public override slice(indices: MinimalistCollectionHolder<number>,): CollectionHolder<T>
    public override slice(indices: CollectionIterator<number>,): CollectionHolder<T>
    public override slice(indices: IteratorObject<number, unknown, unknown>,): CollectionHolder<T>
    public override slice(indices: Iterator<number, unknown, unknown>,): CollectionHolder<T>
    public override slice(indices: Iterable<number, unknown, unknown>,): CollectionHolder<T>
    public override slice(indices: PossibleIterableIteratorArraySetOrCollectionHolder<number>,): CollectionHolder<T>
    public override slice(indicesOrFrom?: Nullable<| PossibleIterableIteratorArraySetOrCollectionHolder<number> | number>, to?: NullableNumber,): CollectionHolder<T>
    public override slice(indicesOrFrom?: Nullable<| PossibleIterableIteratorArraySetOrCollectionHolder<number> | number>, to?: NullableNumber,) {
        return sliceByMinimalistCollectionHolder(this._reference, indicesOrFrom, to,)
    }

    //#endregion -------------------- Slice --------------------
    //#region -------------------- Take --------------------

    public override take(n: number,): CollectionHolder<T> {
        return takeByMinimalistCollectionHolder(this._reference, n,)
    }

    public override takeWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override takeWhile(predicate: BooleanCallback<T>,) {
        return takeWhileByMinimalistCollectionHolder(this._reference, predicate,)
    }

    public override takeWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return takeWhileIndexedByMinimalistCollectionHolder(this._reference, predicate,)
    }


    public override takeLast(n: number,): CollectionHolder<T> {
        return takeLastByMinimalistCollectionHolder(this._reference, n,)
    }

    public override takeLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override takeLastWhile(predicate: BooleanCallback<T>,) {
        return takeLastWhileByMinimalistCollectionHolder(this._reference, predicate,)
    }

    public override takeLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return takeLastWhileIndexedByMinimalistCollectionHolder(this._reference, predicate,)
    }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Drop --------------------

    public override drop(n: number,): CollectionHolder<T> {
        return dropByMinimalistCollectionHolder(this._reference, n,)
    }

    public override dropWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override dropWhile(predicate: BooleanCallback<T>,) {
        return dropWhileByMinimalistCollectionHolder(this._reference, predicate,)
    }

    public override dropWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return dropWhileIndexedByMinimalistCollectionHolder(this._reference, predicate,)
    }


    public override dropLast(n: number,): CollectionHolder<T> {
        return dropLastByMinimalistCollectionHolder(this._reference, n,)
    }

    public override dropLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override dropLastWhile(predicate: BooleanCallback<T>,) {
        return dropLastWhileByMinimalistCollectionHolder(this._reference, predicate,)
    }

    public override dropLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return dropLastWhileIndexedByMinimalistCollectionHolder(this._reference, predicate,)
    }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Map --------------------

    public override map<const U, >(transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U> {
        return mapByMinimalistCollectionHolder(this._reference, transform,)
    }

    public override mapIndexed<const U, >(transform: IndexValueWithReturnCallback<T, U>,): CollectionHolder<U> {
        return mapIndexedByMinimalistCollectionHolder(this._reference, transform,)
    }


    public override mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNullByMinimalistCollectionHolder(this._reference, transform,)
    }

    public override mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNullIndexedByMinimalistCollectionHolder(this._reference, transform,)
    }

    //#endregion -------------------- Map --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- For each --------------------

    public override forEach(action: ValueIndexCallback<T>,): void {
        forEachByMinimalistCollectionHolder(this._reference, action,)
    }

    public override forEachIndexed(action: IndexValueCallback<T>,): void {
        forEachIndexedByMinimalistCollectionHolder(this._reference, action,)
    }

    //#endregion -------------------- For each --------------------
    //#region -------------------- On each --------------------

    public override onEach(action: ValueIndexCallback<T>,): this {
        forEachByMinimalistCollectionHolder(this._reference, action,)
        return this
    }

    public override onEachIndexed(action: IndexValueCallback<T>,): this {
        forEachIndexedByMinimalistCollectionHolder(this._reference, action,)
        return this
    }

    //#endregion -------------------- On each --------------------

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    public override toReverse(from?: NullableNumber, to?: NullableNumber,): CollectionHolder<T> {
        return toReverseByMinimalistCollectionHolder(this._reference, from, to,)
    }

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- Conversion methods --------------------

    public override toIterator(): CollectionIterator<T> {
        return toIteratorByMinimalistCollectionHolder(this._reference,)
    }


    public override toArray(): Array<T> {
        return toArrayByMinimalistCollectionHolder(this._reference,)
    }

    public override toMutableArray(): MutableArray<T> {
        return toMutableArrayByMinimalistCollectionHolder(this._reference,)
    }


    public override toSet(): Set<T> {
        return toSetByMinimalistCollectionHolder(this._reference,)
    }

    public override toMutableSet(): MutableSet<T> {
        return toMutableSetByMinimalistCollectionHolder(this._reference,)
    }


    public override toMap(): NumberKeyMap<T> {
        return toMapByMinimalistCollectionHolder(this._reference,)
    }

    public override toMutableMap(): MutableNumberKeyMap<T> {
        return toMutableMapByMinimalistCollectionHolder(this._reference,)
    }


    public override toString(): string {
        return toStringByMinimalistCollectionHolder(this._reference,)
    }

    public override toLocaleString(locale?: NullableString,): string {
        return toLocaleStringByMinimalistCollectionHolder(this._reference, locale,)
    }

    public override toLowerCaseString(): string {
        return toLowerCaseStringByMinimalistCollectionHolder(this._reference,)
    }

    public override toLocaleLowerCaseString(locale?: NullableString,): string {
        return toLocaleLowerCaseStringByMinimalistCollectionHolder(this._reference, locale,)
    }

    public override toUpperCaseString(): string {
        return toUpperCaseStringByMinimalistCollectionHolder(this._reference,)
    }

    public override toLocaleUpperCaseString(locale?: NullableString,): string {
        return toLocaleUpperCaseStringByMinimalistCollectionHolder(this._reference, locale,)
    }


    public override joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string {
        return joinToStringByMinimalistCollectionHolder(this._reference, separator, prefix, postfix, limit, truncated, transform,)
    }

    //#endregion -------------------- Conversion methods --------------------

    //#endregion -------------------- Methods --------------------

}

//··························································
// Copyright (c) 2023-2025. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import type {Nullable, NullableNumber, NullableString, NullOr, NullOrNumber} from "@joookiwi/type"

import type {CollectionHolder}                                                                                                                                                                                                                                                  from "../../src/CollectionHolder"
import type {MinimalistCollectionHolder}                                                                                                                                                                                                                                        from "../../src/MinimalistCollectionHolder"
import type {CollectionIterator}                                                                                                                                                                                                                                                from "../../src/iterator/CollectionIterator"
import type {BooleanCallback, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, RestrainedBooleanCallback, ReturnCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, StringCallback, ValueIndexCallback, ValueIndexWithReturnCallback} from "../../src/type/callback"
import type {PossibleIterableIteratorArraySetOrCollectionHolder}                                                                                                                                                                                                                from "../../src/type/possibleInstance"

import {allByCollectionHolder}                                     from "../../src/method/all"
import {anyByCollectionHolder}                                     from "../../src/method/any"
import {dropByCollectionHolder}                                    from "../../src/method/drop"
import {dropLastByCollectionHolder}                                from "../../src/method/dropLast"
import {dropLastWhileByCollectionHolder}                           from "../../src/method/dropLastWhile"
import {dropLastWhileIndexedByCollectionHolder}                    from "../../src/method/dropLastWhileIndexed"
import {dropWhileByCollectionHolder}                               from "../../src/method/dropWhile"
import {dropWhileIndexedByCollectionHolder}                        from "../../src/method/dropWhileIndexed"
import {filterByCollectionHolder}                                  from "../../src/method/filter"
import {filterIndexedByCollectionHolder}                           from "../../src/method/filterIndexed"
import {filterNotByCollectionHolder}                               from "../../src/method/filterNot"
import {filterNotIndexedByCollectionHolder}                        from "../../src/method/filterNotIndexed"
import {filterNotNullByCollectionHolder}                           from "../../src/method/filterNotNull"
import {findFirstByCollectionHolder}                               from "../../src/method/findFirst"
import {findFirstIndexedByCollectionHolder}                        from "../../src/method/findFirstIndexed"
import {findFirstIndexedOrNullByCollectionHolder}                  from "../../src/method/findFirstIndexedOrNull"
import {findFirstOrNullByCollectionHolder}                         from "../../src/method/findFirstOrNull"
import {findLastByCollectionHolder}                                from "../../src/method/findLast"
import {findLastIndexedByCollectionHolder}                         from "../../src/method/findLastIndexed"
import {findLastIndexedOrNullByCollectionHolder}                   from "../../src/method/findLastIndexedOrNull"
import {findLastOrNullByCollectionHolder}                          from "../../src/method/findLastOrNull"
import {forEachByCollectionHolder}                                 from "../../src/method/forEach"
import {forEachIndexedByCollectionHolder}                          from "../../src/method/forEachIndexed"
import {firstIndexOfByCollectionHolder}                            from "../../src/method/firstIndexOf"
import {firstIndexOfOrNullByCollectionHolder}                      from "../../src/method/firstIndexOfOrNull"
import {getFirstByCollectionHolder}                                from "../../src/method/getFirst"
import {getFirstOrElseByCollectionHolder}                          from "../../src/method/getFirstOrElse"
import {getFirstOrNullByCollectionHolder}                          from "../../src/method/getFirstOrNull"
import {getLastByCollectionHolder}                                 from "../../src/method/getLast"
import {getLastOrElseByCollectionHolder}                           from "../../src/method/getLastOrElse"
import {getLastOrNullByCollectionHolder}                           from "../../src/method/getLastOrNull"
import {getOrElseByCollectionHolder}                               from "../../src/method/getOrElse"
import {getOrNullByCollectionHolder}                               from "../../src/method/getOrNull"
import {hasByCollectionHolder}                                     from "../../src/method/has"
import {hasAllByCollectionHolder}                                  from "../../src/method/hasAll"
import {hasAllWithArrayByCollectionHolder}                         from "../../src/method/hasAll.withArray"
import {hasAllWithCollectionHolderByCollectionHolder}              from "../../src/method/hasAll.withCollectionHolder"
import {hasAllWithCollectionIteratorByCollectionHolder}            from "../../src/method/hasAll.withCollectionIterator"
import {hasAllWithIterableByCollectionHolder}                      from "../../src/method/hasAll.withIterable"
import {hasAllWithIteratorByCollectionHolder}                      from "../../src/method/hasAll.withIterator"
import {hasAllWithMinimalistCollectionHolderByCollectionHolder}    from "../../src/method/hasAll.withMinimalistCollectionHolder"
import {hasAllWithSetByCollectionHolder}                           from "../../src/method/hasAll.withSet"
import {hasDuplicateByCollectionHolder}                            from "../../src/method/hasDuplicate"
import {hasNoDuplicatesByCollectionHolder}                         from "../../src/method/hasNoDuplicates"
import {hasNoNullsByCollectionHolder}                              from "../../src/method/hasNoNulls"
import {hasNotByCollectionHolder}                                  from "../../src/method/hasNot"
import {hasNotAllByCollectionHolder}                               from "../../src/method/hasNotAll"
import {hasNotAllWithArrayByCollectionHolder}                      from "../../src/method/hasNotAll.withArray"
import {hasNotAllWithCollectionHolderByCollectionHolder}           from "../../src/method/hasNotAll.withCollectionHolder"
import {hasNotAllWithCollectionIteratorByCollectionHolder}         from "../../src/method/hasNotAll.withCollectionIterator"
import {hasNotAllWithIterableByCollectionHolder}                   from "../../src/method/hasNotAll.withIterable"
import {hasNotAllWithIteratorByCollectionHolder}                   from "../../src/method/hasNotAll.withIterator"
import {hasNotAllWithMinimalistCollectionHolderByCollectionHolder} from "../../src/method/hasNotAll.withMinimalistCollectionHolder"
import {hasNotAllWithSetByCollectionHolder}                        from "../../src/method/hasNotAll.withSet"
import {hasNotOneByCollectionHolder}                               from "../../src/method/hasNotOne"
import {hasNotOneWithArrayByCollectionHolder}                      from "../../src/method/hasNotOne.withArray"
import {hasNotOneWithCollectionHolderByCollectionHolder}           from "../../src/method/hasNotOne.withCollectionHolder"
import {hasNotOneWithCollectionIteratorByCollectionHolder}         from "../../src/method/hasNotOne.withCollectionIterator"
import {hasNotOneWithIterableByCollectionHolder}                   from "../../src/method/hasNotOne.withIterable"
import {hasNotOneWithIteratorByCollectionHolder}                   from "../../src/method/hasNotOne.withIterator"
import {hasNotOneWithMinimalistCollectionHolderByCollectionHolder} from "../../src/method/hasNotOne.withMinimalistCollectionHolder"
import {hasNotOneWithSetByCollectionHolder}                        from "../../src/method/hasNotOne.withSet"
import {hasNullByCollectionHolder}                                 from "../../src/method/hasNull"
import {hasOneByCollectionHolder}                                  from "../../src/method/hasOne"
import {hasOneWithArrayByCollectionHolder}                         from "../../src/method/hasOne.withArray"
import {hasOneWithCollectionHolderByCollectionHolder}              from "../../src/method/hasOne.withCollectionHolder"
import {hasOneWithCollectionIteratorByCollectionHolder}            from "../../src/method/hasOne.withCollectionIterator"
import {hasOneWithIterableByCollectionHolder}                      from "../../src/method/hasOne.withIterable"
import {hasOneWithIteratorByCollectionHolder}                      from "../../src/method/hasOne.withIterator"
import {hasOneWithMinimalistCollectionHolderByCollectionHolder}    from "../../src/method/hasOne.withMinimalistCollectionHolder"
import {hasOneWithSetByCollectionHolder}                           from "../../src/method/hasOne.withSet"
import {indexOfFirstByCollectionHolder}                            from "../../src/method/indexOfFirst"
import {indexOfFirstIndexedByCollectionHolder}                     from "../../src/method/indexOfFirstIndexed"
import {indexOfFirstIndexedOrNullByCollectionHolder}               from "../../src/method/indexOfFirstIndexedOrNull"
import {indexOfFirstOrNullByCollectionHolder}                      from "../../src/method/indexOfFirstOrNull"
import {indexOfLastByCollectionHolder}                             from "../../src/method/indexOfLast"
import {indexOfLastIndexedByCollectionHolder}                      from "../../src/method/indexOfLastIndexed"
import {indexOfLastIndexedOrNullByCollectionHolder}                from "../../src/method/indexOfLastIndexedOrNull"
import {indexOfLastOrNullByCollectionHolder}                       from "../../src/method/indexOfLastOrNull"
import {isEmptyByCollectionHolder}                                 from "../../src/method/isEmpty"
import {isNotEmptyByCollectionHolder}                              from "../../src/method/isNotEmpty"
import {joinToStringByCollectionHolder}                            from "../../src/method/joinToString"
import {lastIndexOfByCollectionHolder}                             from "../../src/method/lastIndexOf"
import {lastIndexOfOrNullByCollectionHolder}                       from "../../src/method/lastIndexOfOrNull"
import {noneByCollectionHolder}                                    from "../../src/method/none"
import {mapByCollectionHolder}                                     from "../../src/method/map"
import {mapIndexedByCollectionHolder}                              from "../../src/method/mapIndexed"
import {mapNotNullByCollectionHolder}                              from "../../src/method/mapNotNull"
import {mapNotNullIndexedByCollectionHolder}                       from "../../src/method/mapNotNullIndexed"
import {onEachByCollectionHolder}                                  from "../../src/method/onEach"
import {onEachIndexedByCollectionHolder}                           from "../../src/method/onEachIndexed"
import {requireNoNullsByCollectionHolder}                          from "../../src/method/requireNoNulls"
import {sliceByCollectionHolder}                                   from "../../src/method/slice"
import {takeByCollectionHolder}                                    from "../../src/method/take"
import {takeLastByCollectionHolder}                                from "../../src/method/takeLast"
import {takeLastWhileByCollectionHolder}                           from "../../src/method/takeLastWhile"
import {takeLastWhileIndexedByCollectionHolder}                    from "../../src/method/takeLastWhileIndexed"
import {takeWhileByCollectionHolder}                               from "../../src/method/takeWhile"
import {takeWhileIndexedByCollectionHolder}                        from "../../src/method/takeWhileIndexed"
import {toArrayByCollectionHolder}                                 from "../../src/method/toArray"
import {toIteratorByCollectionHolder}                              from "../../src/method/toIterator"
import {toLocaleLowerCaseStringByCollectionHolder}                 from "../../src/method/toLocaleLowerCaseString"
import {toLocaleStringByCollectionHolder}                          from "../../src/method/toLocaleString"
import {toLocaleUpperCaseStringByCollectionHolder}                 from "../../src/method/toLocaleUpperCaseString"
import {toLowerCaseStringByCollectionHolder}                       from "../../src/method/toLowerCaseString"
import {toMapByCollectionHolder}                                   from "../../src/method/toMap"
import {toMutableArrayByCollectionHolder}                          from "../../src/method/toMutableArray"
import {toMutableMapByCollectionHolder}                            from "../../src/method/toMutableMap"
import {toMutableSetByCollectionHolder}                            from "../../src/method/toMutableSet"
import {toReverseByCollectionHolder}                               from "../../src/method/toReverse"
import {toSetByCollectionHolder}                                   from "../../src/method/toSet"
import {toStringByCollectionHolder}                                from "../../src/method/toString"
import {toUpperCaseStringByCollectionHolder}                       from "../../src/method/toUpperCaseString"
import {AbstractNullCollectionHolderForTest}                       from "./AbstractNullCollectionHolderForTest"

/** A test instance to exclusively test the extension methods for an `undefined` {@link CollectionHolder} */
export class CollectionHolder_FromUndefinedExtensionFunction<const T, >
    extends AbstractNullCollectionHolderForTest<T> {

    //#region -------------------- Size methods --------------------

    public get isEmpty(): true {
        return isEmptyByCollectionHolder(undefined,)
    }

    public get isNotEmpty(): false {
        return isNotEmptyByCollectionHolder(undefined,)
    }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    public override getFirst(): T {
        return getFirstByCollectionHolder(undefined,)
    }

    public override getLast(): T {
        return getLastByCollectionHolder(undefined,)
    }

    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) {
        return getOrElseByCollectionHolder(undefined, index, defaultValue,)
    }

    public override getFirstOrElse<const U, >(defaultValue: ReturnCallback<U>,): | T | U
    public override getFirstOrElse(defaultValue: ReturnCallback<T>,): T
    public override getFirstOrElse(defaultValue: ReturnCallback<unknown>,) { return getFirstOrElseByCollectionHolder(undefined, defaultValue,) }

    public override getLastOrElse<const U, >(defaultValue: ReturnCallback<U>,): | T | U
    public override getLastOrElse(defaultValue: ReturnCallback<T>,): T
    public override getLastOrElse(defaultValue: ReturnCallback<unknown>,) { return getLastOrElseByCollectionHolder(undefined, defaultValue,) }

    public override getOrNull(index: number,): NullOr<T> {
        return getOrNullByCollectionHolder(undefined, index,)
    }

    public override getFirstOrNull(): NullOr<T> {
        return getFirstOrNullByCollectionHolder(undefined,)
    }

    public override getLastOrNull(): NullOr<T> {
        return getLastOrNullByCollectionHolder(undefined,)
    }

    //#endregion -------------------- Get --------------------
    //#region -------------------- Find --------------------

    public override findFirst<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public override findFirst(predicate: BooleanCallback<T>,): T
    public override findFirst(predicate: BooleanCallback<T>,) {
        return findFirstByCollectionHolder(undefined, predicate,)
    }

    public override findFirstOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findFirstOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public override findFirstOrNull(predicate: BooleanCallback<T>,) {
        return findFirstOrNullByCollectionHolder(undefined, predicate,)
    }

    public override findFirstIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public override findFirstIndexed(predicate: ReverseBooleanCallback<T>,): T
    public override findFirstIndexed(predicate: ReverseBooleanCallback<T>,) {
        return findFirstIndexedByCollectionHolder(undefined, predicate,)
    }

    public override findFirstIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,) {
        return findFirstIndexedOrNullByCollectionHolder(undefined, predicate,)
    }


    public override findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public override findLast(predicate: BooleanCallback<T>,): T
    public override findLast(predicate: BooleanCallback<T>,) {
        return findLastByCollectionHolder(undefined, predicate,)
    }

    public override findLastOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public override findLastOrNull(predicate: BooleanCallback<T>,) {
        return findLastOrNullByCollectionHolder(undefined, predicate,)
    }

    public override findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,): T
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,) {
        return findLastIndexedByCollectionHolder(undefined, predicate,)
    }

    public override findLastIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,) {
        return findLastIndexedOrNullByCollectionHolder(undefined, predicate,)
    }

    //#endregion -------------------- Find --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    public override firstIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,): number {
        return firstIndexOfByCollectionHolder(undefined, element, from, to,)
    }

    public override firstIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return firstIndexOfOrNullByCollectionHolder(undefined, element, from, to,)
    }



    public override lastIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,): number {
        return lastIndexOfByCollectionHolder(undefined, element, from, to,)
    }

    public override lastIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return lastIndexOfOrNullByCollectionHolder(undefined, element, from, to,)
    }


    public override indexOfFirst(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return indexOfFirstByCollectionHolder(undefined, predicate, from, to,)
    }

    public override indexOfFirstOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return indexOfFirstOrNullByCollectionHolder(undefined, predicate, from, to,)
    }

    public override indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return indexOfFirstIndexedByCollectionHolder(undefined, predicate, from, to,)
    }

    public override indexOfFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return indexOfFirstIndexedOrNullByCollectionHolder(undefined, predicate, from, to,)
    }


    public override indexOfLast(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return indexOfLastByCollectionHolder(undefined, predicate, from, to,)
    }

    public override indexOfLastOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return indexOfLastOrNullByCollectionHolder(undefined, predicate, from, to,)
    }

    public override indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return indexOfLastIndexedByCollectionHolder(undefined, predicate, from, to,)
    }

    public override indexOfLastIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return indexOfLastIndexedOrNullByCollectionHolder(undefined, predicate, from, to,)
    }

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    public override all<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolder<S>
    public override all(predicate: BooleanCallback<T>,): boolean
    public override all(predicate: BooleanCallback<T>,) {
        return allByCollectionHolder(undefined, predicate,)
    }

    public override any(): this["isNotEmpty"]
    public override any(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override any(predicate?: Nullable<BooleanCallback<T>>,) {
        return anyByCollectionHolder(undefined, predicate,)
    }

    public override none(): this["isEmpty"]
    public override none(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override none(predicate?: Nullable<BooleanCallback<T>>,) {
        return noneByCollectionHolder(undefined, predicate,)
    }


    public override get hasNull(): boolean {
        return hasNullByCollectionHolder(undefined,)
    }

    public override get hasNoNulls(): boolean {
        return hasNoNullsByCollectionHolder(undefined,)
    }


    public override get hasDuplicate(): boolean {
        return hasDuplicateByCollectionHolder(undefined,)
    }

    public override get hasNoDuplicates(): boolean {
        return hasNoDuplicatesByCollectionHolder(undefined,)
    }


    public override has(value: T,): boolean {
        return hasByCollectionHolder(undefined, value,)
    }

    public override hasNot(value: T,): boolean {
        return hasNotByCollectionHolder(undefined, value,)
    }

    public override hasOneWithArray(values: Nullable<readonly T[]>,): boolean {
        return hasOneWithArrayByCollectionHolder(undefined, values,)
    }
    public override hasOneWithSet(values: Nullable<ReadonlySet<T>>,): boolean {
        return hasOneWithSetByCollectionHolder(undefined, values,)
    }
    public override hasOneWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean {
        return hasOneWithCollectionHolderByCollectionHolder(undefined, values,)
    }
    public override hasOneWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
        return hasOneWithMinimalistCollectionHolderByCollectionHolder(undefined, values,)
    }
    public override hasOneWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean {
        return hasOneWithCollectionIteratorByCollectionHolder(undefined, values,)
    }
    public override hasOneWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean {
        return hasOneWithIteratorByCollectionHolder(undefined, values,)
    }
    public override hasOneWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean {
        return hasOneWithIterableByCollectionHolder(undefined, values,)
    }
    public override hasOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
        return hasOneByCollectionHolder(undefined, values,)
    }

    public override hasNotOneWithArray(values: Nullable<readonly T[]>,): boolean {
        return hasNotOneWithArrayByCollectionHolder(undefined, values,)
    }
    public override hasNotOneWithSet(values: Nullable<ReadonlySet<T>>,): boolean {
        return hasNotOneWithSetByCollectionHolder(undefined, values,)
    }
    public override hasNotOneWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean {
        return hasNotOneWithCollectionHolderByCollectionHolder(undefined, values,)
    }
    public override hasNotOneWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
        return hasNotOneWithMinimalistCollectionHolderByCollectionHolder(undefined, values,)
    }
    public override hasNotOneWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean {
        return hasNotOneWithCollectionIteratorByCollectionHolder(undefined, values,)
    }
    public override hasNotOneWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean {
        return hasNotOneWithIteratorByCollectionHolder(undefined, values,)
    }
    public override hasNotOneWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean {
        return hasNotOneWithIterableByCollectionHolder(undefined, values,)
    }
    public override hasNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
        return hasNotOneByCollectionHolder(undefined, values,)
    }

    public override hasAllWithArray(values: Nullable<readonly T[]>,): boolean {
        return hasAllWithArrayByCollectionHolder(undefined, values,)
    }
    public override hasAllWithSet(values: Nullable<ReadonlySet<T>>,): boolean {
        return hasAllWithSetByCollectionHolder(undefined, values,)
    }
    public override hasAllWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean {
        return hasAllWithCollectionHolderByCollectionHolder(undefined, values,)
    }
    public override hasAllWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
        return hasAllWithMinimalistCollectionHolderByCollectionHolder(undefined, values,)
    }
    public override hasAllWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean {
        return hasAllWithCollectionIteratorByCollectionHolder(undefined, values,)
    }
    public override hasAllWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean {
        return hasAllWithIteratorByCollectionHolder(undefined, values,)
    }
    public override hasAllWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean {
        return hasAllWithIterableByCollectionHolder(undefined, values,)
    }
    public override hasAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
        return hasAllByCollectionHolder(undefined, values,)
    }

    public override hasNotAllWithArray(values: Nullable<readonly T[]>,): boolean {
        return hasNotAllWithArrayByCollectionHolder(undefined, values,)
    }
    public override hasNotAllWithSet(values: Nullable<ReadonlySet<T>>,): boolean {
        return hasNotAllWithSetByCollectionHolder(undefined, values,)
    }
    public override hasNotAllWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean {
        return hasNotAllWithCollectionHolderByCollectionHolder(undefined, values,)
    }
    public override hasNotAllWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
        return hasNotAllWithMinimalistCollectionHolderByCollectionHolder(undefined, values,)
    }
    public override hasNotAllWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean {
        return hasNotAllWithCollectionIteratorByCollectionHolder(undefined, values,)
    }
    public override hasNotAllWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean {
        return hasNotAllWithIteratorByCollectionHolder(undefined, values,)
    }
    public override hasNotAllWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean {
        return hasNotAllWithIterableByCollectionHolder(undefined, values,)
    }
    public override hasNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
        return hasNotAllByCollectionHolder(undefined, values,)
    }


    public override requireNoNulls(): CollectionHolder<NonNullable<T>> {
        if (requireNoNullsByCollectionHolder(undefined,) === undefined)
            return this as CollectionHolder<NonNullable<T>>
        throw new Error("The method “requireNoNulls” was not expected to be non-empty.",)
    }

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    public override filter<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filter(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filter(predicate: BooleanCallback<T>,) {
        return filterByCollectionHolder(undefined, predicate,)
    }

    public override filterIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,) {
        return filterIndexedByCollectionHolder(undefined, predicate,)
    }


    public override filterNot<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filterNot(predicate: BooleanCallback<T>,) {
        return filterNotByCollectionHolder(undefined, predicate,)
    }

    public override filterNotIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,) {
        return filterNotIndexedByCollectionHolder(undefined, predicate,)
    }


    public override filterNotNull(): CollectionHolder<NonNullable<T>> {
        return filterNotNullByCollectionHolder(undefined,)
    }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Slice --------------------

    public override slice(from?: NullableNumber, to?: NullableNumber,): CollectionHolder<T>
    public override slice(indices: readonly number[],): CollectionHolder<T>
    public override slice(indices: ReadonlySet<number>,): CollectionHolder<T>
    public override slice(indices: CollectionHolder<number>,): CollectionHolder<T>
    public override slice(indices: MinimalistCollectionHolder<number>,): CollectionHolder<T>
    public override slice(indices: CollectionIterator<number>,): CollectionHolder<T>
    public override slice(indices: Iterator<number, unknown, unknown>,): CollectionHolder<T>
    public override slice(indices: Iterable<number, unknown, unknown>,): CollectionHolder<T>
    public override slice(indices: PossibleIterableIteratorArraySetOrCollectionHolder<number>,): CollectionHolder<T>
    public override slice(indicesOrFrom?: Nullable<| PossibleIterableIteratorArraySetOrCollectionHolder<number> | number>, to?: NullableNumber,): CollectionHolder<T>
    public override slice(indicesOrFrom?: Nullable<| PossibleIterableIteratorArraySetOrCollectionHolder<number> | number>, to?: NullableNumber,) {
        return sliceByCollectionHolder(undefined, indicesOrFrom, to,)
    }

    //#endregion -------------------- Slice --------------------
    //#region -------------------- Take --------------------

    public override take(n: number,): CollectionHolder<T> {
        return takeByCollectionHolder(undefined, n,)
    }

    public override takeWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override takeWhile(predicate: BooleanCallback<T>,) {
        return takeWhileByCollectionHolder(undefined, predicate,)
    }

    public override takeWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return takeWhileIndexedByCollectionHolder(undefined, predicate,)
    }


    public override takeLast(n: number,): CollectionHolder<T> {
        return takeLastByCollectionHolder(undefined, n,)
    }

    public override takeLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override takeLastWhile(predicate: BooleanCallback<T>,) {
        return takeLastWhileByCollectionHolder(undefined, predicate,)
    }

    public override takeLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return takeLastWhileIndexedByCollectionHolder(undefined, predicate,)
    }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Drop --------------------

    public override drop(n: number,): CollectionHolder<T> {
        return dropByCollectionHolder(undefined, n,)
    }

    public override dropWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override dropWhile(predicate: BooleanCallback<T>,) {
        return dropWhileByCollectionHolder(undefined, predicate,)
    }

    public override dropWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return dropWhileIndexedByCollectionHolder(undefined, predicate,)
    }


    public override dropLast(n: number,): CollectionHolder<T> {
        return dropLastByCollectionHolder(undefined, n,)
    }

    public override dropLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override dropLastWhile(predicate: BooleanCallback<T>,) {
        return dropLastWhileByCollectionHolder(undefined, predicate,)
    }

    public override dropLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return dropLastWhileIndexedByCollectionHolder(undefined, predicate,)
    }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Map --------------------

    public override map<const U, >(transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U> {
        return mapByCollectionHolder(undefined, transform,)
    }

    public override mapIndexed<const U, >(transform: IndexValueWithReturnCallback<T, U>,): CollectionHolder<U> {
        return mapIndexedByCollectionHolder(undefined, transform,)
    }


    public override mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNullByCollectionHolder(undefined, transform,)
    }

    public override mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNullIndexedByCollectionHolder(undefined, transform,)
    }

    //#endregion -------------------- Map --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    public override forEach(action: ValueIndexCallback<T>,): void {
        forEachByCollectionHolder(undefined, action,)
    }

    public override forEachIndexed(action: IndexValueCallback<T>,): void {
        forEachIndexedByCollectionHolder(undefined, action,)
    }

    public override onEach(action: ValueIndexCallback<T>,): this {
        onEachByCollectionHolder(undefined, action,)
        return this
    }

    public override onEachIndexed(action: IndexValueCallback<T>,): this {
        onEachIndexedByCollectionHolder(undefined, action,)
        return this
    }

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    public override toReverse(from?: NullableNumber, to?: NullableNumber,): CollectionHolder<T> {
        return toReverseByCollectionHolder(undefined, from, to,)
    }

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- JavaScript methods --------------------

    public override [Symbol.iterator](): CollectionIterator<T> {
        return toIteratorByCollectionHolder(undefined,)
    }

    //#endregion -------------------- JavaScript methods --------------------
    //#region -------------------- Conversion methods --------------------

    public override toArray(): readonly T[] {
        return toArrayByCollectionHolder(undefined,)
    }
    public override toMutableArray(): T[] {
        return toMutableArrayByCollectionHolder(undefined,)
    }

    public override toSet(): ReadonlySet<T> {
        return toSetByCollectionHolder(undefined,)
    }
    public override toMutableSet(): Set<T> {
        return toMutableSetByCollectionHolder(undefined,)
    }

    public override toMap(): ReadonlyMap<number, T> {
        return toMapByCollectionHolder(undefined,)
    }
    public override toMutableMap(): Map<number, T> {
        return toMutableMapByCollectionHolder(undefined,)
    }

    public override toString(): string {
        return toStringByCollectionHolder(undefined,)
    }
    public override toLocaleString(locale?: NullableString,): string {
        return toLocaleStringByCollectionHolder(undefined, locale,)
    }
    public override toLowerCaseString(): string {
        return toLowerCaseStringByCollectionHolder(undefined,)
    }
    public override toLocaleLowerCaseString(locale?: NullableString,): string {
        return toLocaleLowerCaseStringByCollectionHolder(undefined, locale,)
    }
    public override toUpperCaseString(): string {
        return toUpperCaseStringByCollectionHolder(undefined,)
    }
    public override toLocaleUpperCaseString(locale?: NullableString,): string {
        return toLocaleUpperCaseStringByCollectionHolder(undefined, locale,)
    }

    public override joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string {
        return joinToStringByCollectionHolder(undefined, separator, prefix, postfix, limit, truncated, transform,)
    }

    //#endregion -------------------- Conversion methods --------------------

}

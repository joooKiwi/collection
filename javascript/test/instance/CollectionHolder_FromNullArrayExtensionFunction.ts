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

import {allByArray}                                     from "../../src/method/all"
import {anyByArray}                                     from "../../src/method/any"
import {dropByArray}                                    from "../../src/method/drop"
import {dropLastByArray}                                from "../../src/method/dropLast"
import {dropLastWhileByArray}                           from "../../src/method/dropLastWhile"
import {dropLastWhileIndexedByArray}                    from "../../src/method/dropLastWhileIndexed"
import {dropWhileByArray}                               from "../../src/method/dropWhile"
import {dropWhileIndexedByArray}                        from "../../src/method/dropWhileIndexed"
import {filterByArray}                                  from "../../src/method/filter"
import {filterIndexedByArray}                           from "../../src/method/filterIndexed"
import {filterNotByArray}                               from "../../src/method/filterNot"
import {filterNotIndexedByArray}                        from "../../src/method/filterNotIndexed"
import {filterNotNullByArray}                           from "../../src/method/filterNotNull"
import {findFirstByArray}                               from "../../src/method/findFirst"
import {findFirstIndexedByArray}                        from "../../src/method/findFirstIndexed"
import {findFirstIndexedOrNullByArray}                  from "../../src/method/findFirstIndexedOrNull"
import {findFirstOrNullByArray}                         from "../../src/method/findFirstOrNull"
import {findLastByArray}                                from "../../src/method/findLast"
import {findLastIndexedByArray}                         from "../../src/method/findLastIndexed"
import {findLastIndexedOrNullByArray}                   from "../../src/method/findLastIndexedOrNull"
import {findLastOrNullByArray}                          from "../../src/method/findLastOrNull"
import {firstIndexOfByArray}                            from "../../src/method/firstIndexOf"
import {firstIndexOfOrNullByArray}                      from "../../src/method/firstIndexOfOrNull"
import {forEachByArray}                                 from "../../src/method/forEach"
import {forEachIndexedByArray}                          from "../../src/method/forEachIndexed"
import {getFirstByArray}                                from "../../src/method/getFirst"
import {getFirstOrElseByArray}                          from "../../src/method/getFirstOrElse"
import {getFirstOrNullByArray}                          from "../../src/method/getFirstOrNull"
import {getLastByArray}                                 from "../../src/method/getLast"
import {getLastOrElseByArray}                           from "../../src/method/getLastOrElse"
import {getLastOrNullByArray}                           from "../../src/method/getLastOrNull"
import {getOrElseByArray}                               from "../../src/method/getOrElse"
import {getOrNullByArray}                               from "../../src/method/getOrNull"
import {hasByArray}                                     from "../../src/method/has"
import {hasAllByArray}                                  from "../../src/method/hasAll"
import {hasAllWithArrayByArray}                         from "../../src/method/hasAll.withArray"
import {hasAllWithCollectionHolderByArray}              from "../../src/method/hasAll.withCollectionHolder"
import {hasAllWithCollectionIteratorByArray}            from "../../src/method/hasAll.withCollectionIterator"
import {hasAllWithIterableByArray}                      from "../../src/method/hasAll.withIterable"
import {hasAllWithIteratorByArray}                      from "../../src/method/hasAll.withIterator"
import {hasAllWithMinimalistCollectionHolderByArray}    from "../../src/method/hasAll.withMinimalistCollectionHolder"
import {hasAllWithSetByArray}                           from "../../src/method/hasAll.withSet"
import {hasDuplicateByArray}                            from "../../src/method/hasDuplicate"
import {hasNoDuplicatesByArray}                         from "../../src/method/hasNoDuplicates"
import {hasNoNullsByArray}                              from "../../src/method/hasNoNulls"
import {hasNotByArray}                                  from "../../src/method/hasNot"
import {hasNotAllByArray}                               from "../../src/method/hasNotAll"
import {hasNotAllWithArrayByArray}                      from "../../src/method/hasNotAll.withArray"
import {hasNotAllWithCollectionHolderByArray}           from "../../src/method/hasNotAll.withCollectionHolder"
import {hasNotAllWithCollectionIteratorByArray}         from "../../src/method/hasNotAll.withCollectionIterator"
import {hasNotAllWithIterableByArray}                   from "../../src/method/hasNotAll.withIterable"
import {hasNotAllWithIteratorByArray}                   from "../../src/method/hasNotAll.withIterator"
import {hasNotAllWithMinimalistCollectionHolderByArray} from "../../src/method/hasNotAll.withMinimalistCollectionHolder"
import {hasNotAllWithSetByArray}                        from "../../src/method/hasNotAll.withSet"
import {hasNotOneByArray}                               from "../../src/method/hasNotOne"
import {hasNotOneWithArrayByArray}                      from "../../src/method/hasNotOne.withArray"
import {hasNotOneWithCollectionHolderByArray}           from "../../src/method/hasNotOne.withCollectionHolder"
import {hasNotOneWithCollectionIteratorByArray}         from "../../src/method/hasNotOne.withCollectionIterator"
import {hasNotOneWithIterableByArray}                   from "../../src/method/hasNotOne.withIterable"
import {hasNotOneWithIteratorByArray}                   from "../../src/method/hasNotOne.withIterator"
import {hasNotOneWithMinimalistCollectionHolderByArray} from "../../src/method/hasNotOne.withMinimalistCollectionHolder"
import {hasNotOneWithSetByArray}                        from "../../src/method/hasNotOne.withSet"
import {hasNullByArray}                                 from "../../src/method/hasNull"
import {hasOneByArray}                                  from "../../src/method/hasOne"
import {hasOneWithArrayByArray}                         from "../../src/method/hasOne.withArray"
import {hasOneWithCollectionHolderByArray}              from "../../src/method/hasOne.withCollectionHolder"
import {hasOneWithCollectionIteratorByArray}            from "../../src/method/hasOne.withCollectionIterator"
import {hasOneWithIterableByArray}                      from "../../src/method/hasOne.withIterable"
import {hasOneWithIteratorByArray}                      from "../../src/method/hasOne.withIterator"
import {hasOneWithMinimalistCollectionHolderByArray}    from "../../src/method/hasOne.withMinimalistCollectionHolder"
import {hasOneWithSetByArray}                           from "../../src/method/hasOne.withSet"
import {indexOfFirstByArray}                            from "../../src/method/indexOfFirst"
import {indexOfFirstIndexedByArray}                     from "../../src/method/indexOfFirstIndexed"
import {indexOfFirstIndexedOrNullByArray}               from "../../src/method/indexOfFirstIndexedOrNull"
import {indexOfFirstOrNullByArray}                      from "../../src/method/indexOfFirstOrNull"
import {indexOfLastByArray}                             from "../../src/method/indexOfLast"
import {indexOfLastIndexedByArray}                      from "../../src/method/indexOfLastIndexed"
import {indexOfLastIndexedOrNullByArray}                from "../../src/method/indexOfLastIndexedOrNull"
import {indexOfLastOrNullByArray}                       from "../../src/method/indexOfLastOrNull"
import {isEmptyByArray}                                 from "../../src/method/isEmpty"
import {isNotEmptyByArray}                              from "../../src/method/isNotEmpty"
import {joinToStringByArray}                            from "../../src/method/joinToString"
import {lastIndexOfByArray}                             from "../../src/method/lastIndexOf"
import {lastIndexOfOrNullByArray}                       from "../../src/method/lastIndexOfOrNull"
import {noneByArray}                                    from "../../src/method/none"
import {mapByArray}                                     from "../../src/method/map"
import {mapIndexedByArray}                              from "../../src/method/mapIndexed"
import {mapNotNullByArray}                              from "../../src/method/mapNotNull"
import {mapNotNullIndexedByArray}                       from "../../src/method/mapNotNullIndexed"
import {onEachByArray}                                  from "../../src/method/onEach"
import {onEachIndexedByArray}                           from "../../src/method/onEachIndexed"
import {requireNoNullsByArray}                          from "../../src/method/requireNoNulls"
import {sliceByArray}                                   from "../../src/method/slice"
import {takeByArray}                                    from "../../src/method/take"
import {takeLastByArray}                                from "../../src/method/takeLast"
import {takeLastWhileByArray}                           from "../../src/method/takeLastWhile"
import {takeLastWhileIndexedByArray}                    from "../../src/method/takeLastWhileIndexed"
import {takeWhileByArray}                               from "../../src/method/takeWhile"
import {takeWhileIndexedByArray}                        from "../../src/method/takeWhileIndexed"
import {toArrayByArray}                                 from "../../src/method/toArray"
import {toIteratorByArray}                              from "../../src/method/toIterator"
import {toLocaleLowerCaseStringByArray}                 from "../../src/method/toLocaleLowerCaseString"
import {toLocaleStringByArray}                          from "../../src/method/toLocaleString"
import {toLocaleUpperCaseStringByArray}                 from "../../src/method/toLocaleUpperCaseString"
import {toLowerCaseStringByArray}                       from "../../src/method/toLowerCaseString"
import {toMapByArray}                                   from "../../src/method/toMap"
import {toMutableArrayByArray}                          from "../../src/method/toMutableArray"
import {toMutableMapByArray}                            from "../../src/method/toMutableMap"
import {toMutableSetByArray}                            from "../../src/method/toMutableSet"
import {toReverseByArray}                               from "../../src/method/toReverse"
import {toSetByArray}                                   from "../../src/method/toSet"
import {toStringByArray}                                from "../../src/method/toString"
import {toUpperCaseStringByArray}                       from "../../src/method/toUpperCaseString"
import {AbstractNullCollectionHolderForTest}            from "./AbstractNullCollectionHolderForTest"

/** A test instance to exclusively test the extension methods for a `null` {@link ReadonlyArray Array} */
export class CollectionHolder_FromNullArrayExtensionFunction<const T, >
    extends AbstractNullCollectionHolderForTest<T> {

    //#region -------------------- Size methods --------------------

    public override get isEmpty(): boolean {
        return isEmptyByArray(null,)
    }

    public override get isNotEmpty(): boolean {
        return isNotEmptyByArray(null,)
    }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    public override getFirst(): T {
        return getFirstByArray(null,)
    }

    public override getLast(): T {
        return getLastByArray(null,)
    }


    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) {
        return getOrElseByArray(null, index, defaultValue,)
    }

    public override getFirstOrElse<const U, >(defaultValue: ReturnCallback<U>,): | T | U
    public override getFirstOrElse(defaultValue: ReturnCallback<T>,): T
    public override getFirstOrElse(defaultValue: ReturnCallback<unknown>,) { return getFirstOrElseByArray(null, defaultValue,) }

    public override getLastOrElse<const U, >(defaultValue: ReturnCallback<U>,): | T | U
    public override getLastOrElse(defaultValue: ReturnCallback<T>,): T
    public override getLastOrElse(defaultValue: ReturnCallback<unknown>,) { return getLastOrElseByArray(null, defaultValue,) }


    public override getOrNull(index: number,): NullOr<T> {
        return getOrNullByArray(null, index,)
    }

    public override getFirstOrNull(): NullOr<T> {
        return getFirstOrNullByArray(null,)
    }

    public override getLastOrNull(): NullOr<T> {
        return getLastOrNullByArray(null,)
    }

    //#endregion -------------------- Get --------------------
    //#region -------------------- Find --------------------

    public override findFirst<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public override findFirst(predicate: BooleanCallback<T>,): T
    public override findFirst(predicate: BooleanCallback<T>,) {
        return findFirstByArray(null, predicate,)
    }

    public override findFirstOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findFirstOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public override findFirstOrNull(predicate: BooleanCallback<T>,) {
        return findFirstOrNullByArray(null, predicate,)
    }

    public override findFirstIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public override findFirstIndexed(predicate: ReverseBooleanCallback<T>,): T
    public override findFirstIndexed(predicate: ReverseBooleanCallback<T>,) {
        return findFirstIndexedByArray(null, predicate,)
    }

    public override findFirstIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,) {
        return findFirstIndexedOrNullByArray(null, predicate,)
    }


    public override findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public override findLast(predicate: BooleanCallback<T>,): T
    public override findLast(predicate: BooleanCallback<T>,) {
        return findLastByArray(null, predicate,)
    }

    public override findLastOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public override findLastOrNull(predicate: BooleanCallback<T>,) {
        return findLastOrNullByArray(null, predicate,)
    }

    public override findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,): T
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,) {
        return findLastIndexedByArray(null, predicate,)
    }

    public override findLastIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,) {
        return findLastIndexedOrNullByArray(null, predicate,)
    }

    //#endregion -------------------- Find --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    public override firstIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,): number {
        return firstIndexOfByArray(null, element, from, to,)
    }

    public override firstIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return firstIndexOfOrNullByArray(null, element, from, to,)
    }


    public override lastIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,): number {
        return lastIndexOfByArray(null, element, from, to,)
    }

    public override lastIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return lastIndexOfOrNullByArray(null, element, from, to,)
    }


    public override indexOfFirst(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return indexOfFirstByArray(null, predicate, from, to,)
    }

    public override indexOfFirstOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return indexOfFirstOrNullByArray(null, predicate, from, to,)
    }

    public override indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return indexOfFirstIndexedByArray(null, predicate, from, to,)
    }

    public override indexOfFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return indexOfFirstIndexedOrNullByArray(null, predicate, from, to,)
    }


    public override indexOfLast(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return indexOfLastByArray(null, predicate, from, to,)
    }

    public override indexOfLastOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return indexOfLastOrNullByArray(null, predicate, from, to,)
    }

    public override indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return indexOfLastIndexedByArray(null, predicate, from, to,)
    }

    public override indexOfLastIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return indexOfLastIndexedOrNullByArray(null, predicate, from, to,)
    }

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    public override all<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolder<S>
    public override all(predicate: BooleanCallback<T>,): boolean
    public override all(predicate: BooleanCallback<T>,) {
        return allByArray(null, predicate,)
    }

    public override any(): this["isNotEmpty"]
    public override any(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override any(predicate?: Nullable<BooleanCallback<T>>,) {
        return anyByArray(null, predicate,)
    }

    public override none(): this["isEmpty"]
    public override none(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override none(predicate?: Nullable<BooleanCallback<T>>,) {
        return noneByArray(null, predicate,)
    }


    public override get hasNull(): boolean {
        return hasNullByArray(null,)
    }

    public override get hasNoNulls(): boolean {
        return hasNoNullsByArray(null,)
    }


    public override get hasDuplicate(): boolean {
        return hasDuplicateByArray(null,)
    }

    public override get hasNoDuplicates(): boolean {
        return hasNoDuplicatesByArray(null,)
    }


    public override has(value: T,): boolean {
        return hasByArray(null, value,)
    }

    public override hasNot(value: T,): boolean {
        return hasNotByArray(null, value,)
    }

    public override hasOneWithArray(values: Nullable<readonly T[]>,): boolean {
        return hasOneWithArrayByArray(null, values,)
    }
    public override hasOneWithSet(values: Nullable<ReadonlySet<T>>,): boolean {
        return hasOneWithSetByArray(null, values,)
    }
    public override hasOneWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean {
        return hasOneWithCollectionHolderByArray(null, values,)
    }
    public override hasOneWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
        return hasOneWithMinimalistCollectionHolderByArray(null, values,)
    }
    public override hasOneWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean {
        return hasOneWithCollectionIteratorByArray(null, values,)
    }
    public override hasOneWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean {
        return hasOneWithIteratorByArray(null, values,)
    }
    public override hasOneWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean {
        return hasOneWithIterableByArray(null, values,)
    }
    public override hasOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
        return hasOneByArray(null, values,)
    }

    public override hasNotOneWithArray(values: Nullable<readonly T[]>,): boolean {
        return hasNotOneWithArrayByArray(null, values,)
    }
    public override hasNotOneWithSet(values: Nullable<ReadonlySet<T>>,): boolean {
        return hasNotOneWithSetByArray(null, values,)
    }
    public override hasNotOneWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean {
        return hasNotOneWithCollectionHolderByArray(null, values,)
    }
    public override hasNotOneWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
        return hasNotOneWithMinimalistCollectionHolderByArray(null, values,)
    }
    public override hasNotOneWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean {
        return hasNotOneWithCollectionIteratorByArray(null, values,)
    }
    public override hasNotOneWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean {
        return hasNotOneWithIteratorByArray(null, values,)
    }
    public override hasNotOneWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean {
        return hasNotOneWithIterableByArray(null, values,)
    }
    public override hasNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
        return hasNotOneByArray(null, values,)
    }

    public override hasAllWithArray(values: Nullable<readonly T[]>,): boolean {
        return hasAllWithArrayByArray(null, values,)
    }
    public override hasAllWithSet(values: Nullable<ReadonlySet<T>>,): boolean {
        return hasAllWithSetByArray(null, values,)
    }
    public override hasAllWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean {
        return hasAllWithCollectionHolderByArray(null, values,)
    }
    public override hasAllWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
        return hasAllWithMinimalistCollectionHolderByArray(null, values,)
    }
    public override hasAllWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean {
        return hasAllWithCollectionIteratorByArray(null, values,)
    }
    public override hasAllWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean {
        return hasAllWithIteratorByArray(null, values,)
    }
    public override hasAllWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean {
        return hasAllWithIterableByArray(null, values,)
    }
    public override hasAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
        return hasAllByArray(null, values,)
    }

    public override hasNotAllWithArray(values: Nullable<readonly T[]>,): boolean {
        return hasNotAllWithArrayByArray(null, values,)
    }
    public override hasNotAllWithSet(values: Nullable<ReadonlySet<T>>,): boolean {
        return hasNotAllWithSetByArray(null, values,)
    }
    public override hasNotAllWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean {
        return hasNotAllWithCollectionHolderByArray(null, values,)
    }
    public override hasNotAllWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
        return hasNotAllWithMinimalistCollectionHolderByArray(null, values,)
    }
    public override hasNotAllWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean {
        return hasNotAllWithCollectionIteratorByArray(null, values,)
    }
    public override hasNotAllWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean {
        return hasNotAllWithIteratorByArray(null, values,)
    }
    public override hasNotAllWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean {
        return hasNotAllWithIterableByArray(null, values,)
    }
    public override hasNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
        return hasNotAllByArray(null, values,)
    }


    public override requireNoNulls(): CollectionHolder<NonNullable<T>> {
        if (requireNoNullsByArray(null,) === null)
            return this as CollectionHolder<NonNullable<T>>
        throw new Error("The method “requireNoNulls” was not expected to be non-empty.",)
    }

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    public override filter<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filter(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filter(predicate: BooleanCallback<T>,) {
        return filterByArray(null, predicate,)
    }

    public override filterIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,) {
        return filterIndexedByArray(null, predicate,)
    }


    public override filterNot<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filterNot(predicate: BooleanCallback<T>,) {
        return filterNotByArray(null, predicate,)
    }

    public override filterNotIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,) {
        return filterNotIndexedByArray(null, predicate,)
    }


    public override filterNotNull(): CollectionHolder<NonNullable<T>> {
        return filterNotNullByArray(null,)
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
        return sliceByArray(null, indicesOrFrom, to,)
    }

    //#endregion -------------------- Slice --------------------
    //#region -------------------- Take --------------------

    public override take(n: number,): CollectionHolder<T> {
        return takeByArray(null, n,)
    }

    public override takeWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override takeWhile(predicate: BooleanCallback<T>,) {
        return takeWhileByArray(null, predicate,)
    }

    public override takeWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return takeWhileIndexedByArray(null, predicate,)
    }


    public override takeLast(n: number,): CollectionHolder<T> {
        return takeLastByArray(null, n,)
    }

    public override takeLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override takeLastWhile(predicate: BooleanCallback<T>,) {
        return takeLastWhileByArray(null, predicate,)
    }

    public override takeLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return takeLastWhileIndexedByArray(null, predicate,)
    }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Drop --------------------

    public override drop(n: number,): CollectionHolder<T> {
        return dropByArray(null, n,)
    }

    public override dropWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override dropWhile(predicate: BooleanCallback<T>,) {
        return dropWhileByArray(null, predicate,)
    }

    public override dropWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return dropWhileIndexedByArray(null, predicate,)
    }


    public override dropLast(n: number,): CollectionHolder<T> {
        return dropLastByArray(null, n,)
    }

    public override dropLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override dropLastWhile(predicate: BooleanCallback<T>,) {
        return dropLastWhileByArray(null, predicate,)
    }

    public override dropLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return dropLastWhileIndexedByArray(null, predicate,)
    }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Map --------------------

    public override map<const U, >(transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U> {
        return mapByArray(null, transform,)
    }

    public override mapIndexed<const U, >(transform: IndexValueWithReturnCallback<T, U>,): CollectionHolder<U> {
        return mapIndexedByArray(null, transform,)
    }


    public override mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNullByArray(null, transform,)
    }

    public override mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNullIndexedByArray(null, transform,)
    }

    //#endregion -------------------- Map --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    public override forEach(action: ValueIndexCallback<T>,): void {
        forEachByArray(null, action,)
    }

    public override forEachIndexed(action: IndexValueCallback<T>,): void {
        forEachIndexedByArray(null, action,)
    }


    public override onEach(action: ValueIndexCallback<T>,): this {
        onEachByArray(null, action,)
        return this
    }

    public override onEachIndexed(action: IndexValueCallback<T>,): this {
        onEachIndexedByArray(null, action,)
        return this
    }

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    public override toReverse(from?: NullableNumber, to?: NullableNumber,): CollectionHolder<T> {
        return toReverseByArray(null, from, to,)
    }

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- JavaScript methods --------------------

    public override [Symbol.iterator](): CollectionIterator<T> {
        return toIteratorByArray(null,)
    }

    //#endregion -------------------- JavaScript methods --------------------
    //#region -------------------- Conversion methods --------------------

    public override toArray(): readonly T[] {
        return toArrayByArray(null,)
    }
    public override toMutableArray(): T[] {
        return toMutableArrayByArray(null,)
    }

    public override toSet(): ReadonlySet<T> {
        return toSetByArray(null,)
    }
    public override toMutableSet(): Set<T> {
        return toMutableSetByArray(null,)
    }

    public override toMap(): ReadonlyMap<number, T> {
        return toMapByArray(null,)
    }
    public override toMutableMap(): Map<number, T> {
        return toMutableMapByArray(null,)
    }

    public override toString(): string {
        return toStringByArray(null,)
    }
    public override toLocaleString(locale?: NullableString,): string {
        return toLocaleStringByArray(null, locale,)
    }
    public override toLowerCaseString(): string {
        return toLowerCaseStringByArray(null,)
    }
    public override toLocaleLowerCaseString(locale?: NullableString,): string {
        return toLocaleLowerCaseStringByArray(null, locale,)
    }
    public override toUpperCaseString(): string {
        return toUpperCaseStringByArray(null,)
    }
    public override toLocaleUpperCaseString(locale?: NullableString,): string {
        return toLocaleUpperCaseStringByArray(null, locale,)
    }

    public override joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string {
        return joinToStringByArray(null, separator, prefix, postfix, limit, truncated, transform,)
    }

    //#endregion -------------------- Conversion methods --------------------

}

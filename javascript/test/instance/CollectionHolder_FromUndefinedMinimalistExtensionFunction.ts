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

import {allByMinimalistCollectionHolder}                                     from "../../src/method/all"
import {anyByMinimalistCollectionHolder}                                     from "../../src/method/any"
import {dropByMinimalistCollectionHolder}                                    from "../../src/method/drop"
import {dropLastByMinimalistCollectionHolder}                                from "../../src/method/dropLast"
import {dropLastWhileByMinimalistCollectionHolder}                           from "../../src/method/dropLastWhile"
import {dropLastWhileIndexedByMinimalistCollectionHolder}                    from "../../src/method/dropLastWhileIndexed"
import {dropWhileByMinimalistCollectionHolder}                               from "../../src/method/dropWhile"
import {dropWhileIndexedByMinimalistCollectionHolder}                        from "../../src/method/dropWhileIndexed"
import {filterByMinimalistCollectionHolder}                                  from "../../src/method/filter"
import {filterIndexedByMinimalistCollectionHolder}                           from "../../src/method/filterIndexed"
import {filterNotByMinimalistCollectionHolder}                               from "../../src/method/filterNot"
import {filterNotIndexedByMinimalistCollectionHolder}                        from "../../src/method/filterNotIndexed"
import {filterNotNullByMinimalistCollectionHolder}                           from "../../src/method/filterNotNull"
import {findFirstByMinimalistCollectionHolder}                               from "../../src/method/findFirst"
import {findFirstIndexedByMinimalistCollectionHolder}                        from "../../src/method/findFirstIndexed"
import {findFirstIndexedOrNullByMinimalistCollectionHolder}                  from "../../src/method/findFirstIndexedOrNull"
import {findFirstOrNullByMinimalistCollectionHolder}                         from "../../src/method/findFirstOrNull"
import {findLastByMinimalistCollectionHolder}                                from "../../src/method/findLast"
import {findLastIndexedByMinimalistCollectionHolder}                         from "../../src/method/findLastIndexed"
import {findLastIndexedOrNullByMinimalistCollectionHolder}                   from "../../src/method/findLastIndexedOrNull"
import {findLastOrNullByMinimalistCollectionHolder}                          from "../../src/method/findLastOrNull"
import {firstIndexOfByMinimalistCollectionHolder}                            from "../../src/method/firstIndexOf"
import {firstIndexOfOrNullByMinimalistCollectionHolder}                      from "../../src/method/firstIndexOfOrNull"
import {forEachByMinimalistCollectionHolder}                                 from "../../src/method/forEach"
import {forEachIndexedByMinimalistCollectionHolder}                          from "../../src/method/forEachIndexed"
import {getFirstByMinimalistCollectionHolder}                                from "../../src/method/getFirst"
import {getFirstOrElseByMinimalistCollectionHolder}                          from "../../src/method/getFirstOrElse"
import {getFirstOrNullByMinimalistCollectionHolder}                          from "../../src/method/getFirstOrNull"
import {getLastByMinimalistCollectionHolder}                                 from "../../src/method/getLast"
import {getLastOrElseByMinimalistCollectionHolder}                           from "../../src/method/getLastOrElse"
import {getLastOrNullByMinimalistCollectionHolder}                           from "../../src/method/getLastOrNull"
import {getOrElseByMinimalistCollectionHolder}                               from "../../src/method/getOrElse"
import {getOrNullByMinimalistCollectionHolder}                               from "../../src/method/getOrNull"
import {hasByMinimalistCollectionHolder}                                     from "../../src/method/has"
import {hasAllByMinimalistCollectionHolder}                                  from "../../src/method/hasAll"
import {hasAllWithArrayByMinimalistCollectionHolder}                         from "../../src/method/hasAll.withArray"
import {hasAllWithSetByMinimalistCollectionHolder}                           from "../../src/method/hasAll.withSet"
import {hasAllWithCollectionHolderByMinimalistCollectionHolder}              from "../../src/method/hasAll.withCollectionHolder"
import {hasAllWithMinimalistCollectionHolderByMinimalistCollectionHolder}    from "../../src/method/hasAll.withMinimalistCollectionHolder"
import {hasAllWithCollectionIteratorByMinimalistCollectionHolder}            from "../../src/method/hasAll.withCollectionIterator"
import {hasAllWithIteratorByMinimalistCollectionHolder}                      from "../../src/method/hasAll.withIterator"
import {hasAllWithIterableByMinimalistCollectionHolder}                      from "../../src/method/hasAll.withIterable"
import {hasDuplicateByMinimalistCollectionHolder}                            from "../../src/method/hasDuplicate"
import {hasNoDuplicatesByMinimalistCollectionHolder}                         from "../../src/method/hasNoDuplicates"
import {hasNoNullsByMinimalistCollectionHolder}                              from "../../src/method/hasNoNulls"
import {hasNotByMinimalistCollectionHolder}                                  from "../../src/method/hasNot"
import {hasNotAllByMinimalistCollectionHolder}                               from "../../src/method/hasNotAll"
import {hasNotAllWithArrayByMinimalistCollectionHolder}                      from "../../src/method/hasNotAll.withArray"
import {hasNotAllWithSetByMinimalistCollectionHolder}                        from "../../src/method/hasNotAll.withSet"
import {hasNotAllWithCollectionHolderByMinimalistCollectionHolder}           from "../../src/method/hasNotAll.withCollectionHolder"
import {hasNotAllWithMinimalistCollectionHolderByMinimalistCollectionHolder} from "../../src/method/hasNotAll.withMinimalistCollectionHolder"
import {hasNotAllWithCollectionIteratorByMinimalistCollectionHolder}         from "../../src/method/hasNotAll.withCollectionIterator"
import {hasNotAllWithIteratorByMinimalistCollectionHolder}                   from "../../src/method/hasNotAll.withIterator"
import {hasNotAllWithIterableByMinimalistCollectionHolder}                   from "../../src/method/hasNotAll.withIterable"
import {hasNotOneByMinimalistCollectionHolder}                               from "../../src/method/hasNotOne"
import {hasNotOneWithArrayByMinimalistCollectionHolder}                      from "../../src/method/hasNotOne.withArray"
import {hasNotOneWithSetByMinimalistCollectionHolder}                        from "../../src/method/hasNotOne.withSet"
import {hasNotOneWithCollectionHolderByMinimalistCollectionHolder}           from "../../src/method/hasNotOne.withCollectionHolder"
import {hasNotOneWithMinimalistCollectionHolderByMinimalistCollectionHolder} from "../../src/method/hasNotOne.withMinimalistCollectionHolder"
import {hasNotOneWithCollectionIteratorByMinimalistCollectionHolder}         from "../../src/method/hasNotOne.withCollectionIterator"
import {hasNotOneWithIteratorByMinimalistCollectionHolder}                   from "../../src/method/hasNotOne.withIterator"
import {hasNotOneWithIterableByMinimalistCollectionHolder}                   from "../../src/method/hasNotOne.withIterable"
import {hasNullByMinimalistCollectionHolder}                                 from "../../src/method/hasNull"
import {hasOneByMinimalistCollectionHolder}                                  from "../../src/method/hasOne"
import {hasOneWithArrayByMinimalistCollectionHolder}                         from "../../src/method/hasOne.withArray"
import {hasOneWithSetByMinimalistCollectionHolder}                           from "../../src/method/hasOne.withSet"
import {hasOneWithCollectionHolderByMinimalistCollectionHolder}              from "../../src/method/hasOne.withCollectionHolder"
import {hasOneWithMinimalistCollectionHolderByMinimalistCollectionHolder}    from "../../src/method/hasOne.withMinimalistCollectionHolder"
import {hasOneWithCollectionIteratorByMinimalistCollectionHolder}            from "../../src/method/hasOne.withCollectionIterator"
import {hasOneWithIteratorByMinimalistCollectionHolder}                      from "../../src/method/hasOne.withIterator"
import {hasOneWithIterableByMinimalistCollectionHolder}                      from "../../src/method/hasOne.withIterable"
import {indexOfFirstByMinimalistCollectionHolder}                            from "../../src/method/indexOfFirst"
import {indexOfFirstIndexedByMinimalistCollectionHolder}                     from "../../src/method/indexOfFirstIndexed"
import {indexOfFirstIndexedOrNullByMinimalistCollectionHolder}               from "../../src/method/indexOfFirstIndexedOrNull"
import {indexOfFirstOrNullByMinimalistCollectionHolder}                      from "../../src/method/indexOfFirstOrNull"
import {indexOfLastByMinimalistCollectionHolder}                             from "../../src/method/indexOfLast"
import {indexOfLastIndexedByMinimalistCollectionHolder}                      from "../../src/method/indexOfLastIndexed"
import {indexOfLastIndexedOrNullByMinimalistCollectionHolder}                from "../../src/method/indexOfLastIndexedOrNull"
import {indexOfLastOrNullByMinimalistCollectionHolder}                       from "../../src/method/indexOfLastOrNull"
import {isEmptyByMinimalistCollectionHolder}                                 from "../../src/method/isEmpty"
import {isNotEmptyByMinimalistCollectionHolder}                              from "../../src/method/isNotEmpty"
import {joinToStringByMinimalistCollectionHolder}                            from "../../src/method/joinToString"
import {lastIndexOfByMinimalistCollectionHolder}                             from "../../src/method/lastIndexOf"
import {lastIndexOfOrNullByMinimalistCollectionHolder}                       from "../../src/method/lastIndexOfOrNull"
import {noneByMinimalistCollectionHolder}                                    from "../../src/method/none"
import {mapByMinimalistCollectionHolder}                                     from "../../src/method/map"
import {mapIndexedByMinimalistCollectionHolder}                              from "../../src/method/mapIndexed"
import {mapNotNullByMinimalistCollectionHolder}                              from "../../src/method/mapNotNull"
import {mapNotNullIndexedByMinimalistCollectionHolder}                       from "../../src/method/mapNotNullIndexed"
import {onEachByMinimalistCollectionHolder}                                  from "../../src/method/onEach"
import {onEachIndexedByMinimalistCollectionHolder}                           from "../../src/method/onEachIndexed"
import {requireNoNullsByMinimalistCollectionHolder}                          from "../../src/method/requireNoNulls"
import {sliceByMinimalistCollectionHolder}                                   from "../../src/method/slice"
import {takeByMinimalistCollectionHolder}                                    from "../../src/method/take"
import {takeLastByMinimalistCollectionHolder}                                from "../../src/method/takeLast"
import {takeLastWhileByMinimalistCollectionHolder}                           from "../../src/method/takeLastWhile"
import {takeLastWhileIndexedByMinimalistCollectionHolder}                    from "../../src/method/takeLastWhileIndexed"
import {takeWhileByMinimalistCollectionHolder}                               from "../../src/method/takeWhile"
import {takeWhileIndexedByMinimalistCollectionHolder}                        from "../../src/method/takeWhileIndexed"
import {toArrayByMinimalistCollectionHolder}                                 from "../../src/method/toArray"
import {toIteratorByMinimalistCollectionHolder}                              from "../../src/method/toIterator"
import {toLocaleLowerCaseStringByMinimalistCollectionHolder}                 from "../../src/method/toLocaleLowerCaseString"
import {toLocaleStringByMinimalistCollectionHolder}                          from "../../src/method/toLocaleString"
import {toLocaleUpperCaseStringByMinimalistCollectionHolder}                 from "../../src/method/toLocaleUpperCaseString"
import {toLowerCaseStringByMinimalistCollectionHolder}                       from "../../src/method/toLowerCaseString"
import {toMapByMinimalistCollectionHolder}                                   from "../../src/method/toMap"
import {toMutableArrayByMinimalistCollectionHolder}                          from "../../src/method/toMutableArray"
import {toMutableMapByMinimalistCollectionHolder}                            from "../../src/method/toMutableMap"
import {toMutableSetByMinimalistCollectionHolder}                            from "../../src/method/toMutableSet"
import {toReverseByMinimalistCollectionHolder}                               from "../../src/method/toReverse"
import {toSetByMinimalistCollectionHolder}                                   from "../../src/method/toSet"
import {toStringByMinimalistCollectionHolder}                                from "../../src/method/toString"
import {toUpperCaseStringByMinimalistCollectionHolder}                       from "../../src/method/toUpperCaseString"
import {AbstractNullCollectionHolderForTest}                                 from "./AbstractNullCollectionHolderForTest"

/** A test instance to exclusively test the extension methods for an `undefined` {@link MinimalistCollectionHolder} */
export class CollectionHolder_FromUndefinedMinimalistExtensionFunction<const T, >
    extends AbstractNullCollectionHolderForTest<T> {

    //#region -------------------- Size methods --------------------

    public override get isEmpty(): boolean {
        return isEmptyByMinimalistCollectionHolder(undefined,)
    }

    public override get isNotEmpty(): boolean {
        return isNotEmptyByMinimalistCollectionHolder(undefined,)
    }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    public override getFirst(): T {
        return getFirstByMinimalistCollectionHolder(undefined,)
    }

    public override getLast(): T {
        return getLastByMinimalistCollectionHolder(undefined,)
    }


    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) {
        return getOrElseByMinimalistCollectionHolder(undefined, index, defaultValue,)
    }

    public override getFirstOrElse<const U, >(defaultValue: ReturnCallback<U>,): | T | U
    public override getFirstOrElse(defaultValue: ReturnCallback<T>,): T
    public override getFirstOrElse(defaultValue: ReturnCallback<unknown>,) { return getFirstOrElseByMinimalistCollectionHolder(undefined, defaultValue,) }

    public override getLastOrElse<const U, >(defaultValue: ReturnCallback<U>,): | T | U
    public override getLastOrElse(defaultValue: ReturnCallback<T>,): T
    public override getLastOrElse(defaultValue: ReturnCallback<unknown>,) { return getLastOrElseByMinimalistCollectionHolder(undefined, defaultValue,) }


    public override getOrNull(index: number,): NullOr<T> {
        return getOrNullByMinimalistCollectionHolder(undefined, index,)
    }

    public override getFirstOrNull(): NullOr<T> {
        return getFirstOrNullByMinimalistCollectionHolder(undefined,)
    }

    public override getLastOrNull(): NullOr<T> {
        return getLastOrNullByMinimalistCollectionHolder(undefined,)
    }

    //#endregion -------------------- Get --------------------
    //#region -------------------- Find --------------------

    public override findFirst<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public override findFirst(predicate: BooleanCallback<T>,): T
    public override findFirst(predicate: BooleanCallback<T>,) {
        return findFirstByMinimalistCollectionHolder(undefined, predicate,)
    }

    public override findFirstOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findFirstOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public override findFirstOrNull(predicate: BooleanCallback<T>,) {
        return findFirstOrNullByMinimalistCollectionHolder(undefined, predicate,)
    }

    public override findFirstIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public override findFirstIndexed(predicate: ReverseBooleanCallback<T>,): T
    public override findFirstIndexed(predicate: ReverseBooleanCallback<T>,) {
        return findFirstIndexedByMinimalistCollectionHolder(undefined, predicate,)
    }

    public override findFirstIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,) {
        return findFirstIndexedOrNullByMinimalistCollectionHolder(undefined, predicate,)
    }


    public override findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public override findLast(predicate: BooleanCallback<T>,): T
    public override findLast(predicate: BooleanCallback<T>,) {
        return findLastByMinimalistCollectionHolder(undefined, predicate,)
    }

    public override findLastOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public override findLastOrNull(predicate: BooleanCallback<T>,) {
        return findLastOrNullByMinimalistCollectionHolder(undefined, predicate,)
    }

    public override findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,): T
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,) {
        return findLastIndexedByMinimalistCollectionHolder(undefined, predicate,)
    }

    public override findLastIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,) {
        return findLastIndexedOrNullByMinimalistCollectionHolder(undefined, predicate,)
    }

    //#endregion -------------------- Find --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    public override firstIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,): number {
        return firstIndexOfByMinimalistCollectionHolder(undefined, element, from, to,)
    }

    public override firstIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return firstIndexOfOrNullByMinimalistCollectionHolder(undefined, element, from, to,)
    }


    public override lastIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,): number {
        return lastIndexOfByMinimalistCollectionHolder(undefined, element, from, to,)
    }

    public override lastIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return lastIndexOfOrNullByMinimalistCollectionHolder(undefined, element, from, to,)
    }


    public override indexOfFirst(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return indexOfFirstByMinimalistCollectionHolder(undefined, predicate, from, to,)
    }

    public override indexOfFirstOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return indexOfFirstOrNullByMinimalistCollectionHolder(undefined, predicate, from, to,)
    }

    public override indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return indexOfFirstIndexedByMinimalistCollectionHolder(undefined, predicate, from, to,)
    }

    public override indexOfFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return indexOfFirstIndexedOrNullByMinimalistCollectionHolder(undefined, predicate, from, to,)
    }


    public override indexOfLast(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return indexOfLastByMinimalistCollectionHolder(undefined, predicate, from, to,)
    }

    public override indexOfLastOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return indexOfLastOrNullByMinimalistCollectionHolder(undefined, predicate, from, to,)
    }

    public override indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return indexOfLastIndexedByMinimalistCollectionHolder(undefined, predicate, from, to,)
    }

    public override indexOfLastIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return indexOfLastIndexedOrNullByMinimalistCollectionHolder(undefined, predicate, from, to,)
    }

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    public override all<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolder<S>
    public override all(predicate: BooleanCallback<T>,): boolean
    public override all(predicate: BooleanCallback<T>,) {
        return allByMinimalistCollectionHolder(undefined, predicate,)
    }

    public override any(): this["isNotEmpty"]
    public override any(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override any(predicate?: Nullable<BooleanCallback<T>>,) {
        return anyByMinimalistCollectionHolder(undefined, predicate,)
    }

    public override none(): this["isEmpty"]
    public override none(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override none(predicate?: Nullable<BooleanCallback<T>>,) {
        return noneByMinimalistCollectionHolder(undefined, predicate,)
    }


    public override get hasNull(): boolean {
        return hasNullByMinimalistCollectionHolder(undefined,)
    }

    public override get hasNoNulls(): boolean {
        return hasNoNullsByMinimalistCollectionHolder(undefined,)
    }


    public override get hasDuplicate(): boolean {
        return hasDuplicateByMinimalistCollectionHolder(undefined,)
    }

    public override get hasNoDuplicates(): boolean {
        return hasNoDuplicatesByMinimalistCollectionHolder(undefined,)
    }


    public override has(value: T,): boolean {
        return hasByMinimalistCollectionHolder(undefined, value,)
    }

    public override hasNot(value: T,): boolean {
        return hasNotByMinimalistCollectionHolder(undefined, value,)
    }

    public override hasOneWithArray(values: Nullable<readonly T[]>,): boolean {
        return hasOneWithArrayByMinimalistCollectionHolder(undefined, values,)
    }
    public override hasOneWithSet(values: Nullable<ReadonlySet<T>>,): boolean {
        return hasOneWithSetByMinimalistCollectionHolder(undefined, values,)
    }
    public override hasOneWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean {
        return hasOneWithCollectionHolderByMinimalistCollectionHolder(undefined, values,)
    }
    public override hasOneWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
        return hasOneWithMinimalistCollectionHolderByMinimalistCollectionHolder(undefined, values,)
    }
    public override hasOneWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean {
        return hasOneWithCollectionIteratorByMinimalistCollectionHolder(undefined, values,)
    }
    public override hasOneWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean {
        return hasOneWithIteratorByMinimalistCollectionHolder(undefined, values,)
    }
    public override hasOneWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean {
        return hasOneWithIterableByMinimalistCollectionHolder(undefined, values,)
    }
    public override hasOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
        return hasOneByMinimalistCollectionHolder(undefined, values,)
    }

    public override hasNotOneWithArray(values: Nullable<readonly T[]>,): boolean {
        return hasNotOneWithArrayByMinimalistCollectionHolder(undefined, values,)
    }
    public override hasNotOneWithSet(values: Nullable<ReadonlySet<T>>,): boolean {
        return hasNotOneWithSetByMinimalistCollectionHolder(undefined, values,)
    }
    public override hasNotOneWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean {
        return hasNotOneWithCollectionHolderByMinimalistCollectionHolder(undefined, values,)
    }
    public override hasNotOneWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
        return hasNotOneWithMinimalistCollectionHolderByMinimalistCollectionHolder(undefined, values,)
    }
    public override hasNotOneWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean {
        return hasNotOneWithCollectionIteratorByMinimalistCollectionHolder(undefined, values,)
    }
    public override hasNotOneWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean {
        return hasNotOneWithIteratorByMinimalistCollectionHolder(undefined, values,)
    }
    public override hasNotOneWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean {
        return hasNotOneWithIterableByMinimalistCollectionHolder(undefined, values,)
    }
    public override hasNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
        return hasNotOneByMinimalistCollectionHolder(undefined, values,)
    }

    public override hasAllWithArray(values: Nullable<readonly T[]>,): boolean {
        return hasAllWithArrayByMinimalistCollectionHolder(undefined, values,)
    }
    public override hasAllWithSet(values: Nullable<ReadonlySet<T>>,): boolean {
        return hasAllWithSetByMinimalistCollectionHolder(undefined, values,)
    }
    public override hasAllWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean {
        return hasAllWithCollectionHolderByMinimalistCollectionHolder(undefined, values,)
    }
    public override hasAllWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
        return hasAllWithMinimalistCollectionHolderByMinimalistCollectionHolder(undefined, values,)
    }
    public override hasAllWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean {
        return hasAllWithCollectionIteratorByMinimalistCollectionHolder(undefined, values,)
    }
    public override hasAllWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean {
        return hasAllWithIteratorByMinimalistCollectionHolder(undefined, values,)
    }
    public override hasAllWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean {
        return hasAllWithIterableByMinimalistCollectionHolder(undefined, values,)
    }
    public override hasAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
        return hasAllByMinimalistCollectionHolder(undefined, values,)
    }

    public override hasNotAllWithArray(values: Nullable<readonly T[]>,): boolean {
        return hasNotAllWithArrayByMinimalistCollectionHolder(undefined, values,)
    }
    public override hasNotAllWithSet(values: Nullable<ReadonlySet<T>>,): boolean {
        return hasNotAllWithSetByMinimalistCollectionHolder(undefined, values,)
    }
    public override hasNotAllWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean {
        return hasNotAllWithCollectionHolderByMinimalistCollectionHolder(undefined, values,)
    }
    public override hasNotAllWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
        return hasNotAllWithMinimalistCollectionHolderByMinimalistCollectionHolder(undefined, values,)
    }
    public override hasNotAllWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean {
        return hasNotAllWithCollectionIteratorByMinimalistCollectionHolder(undefined, values,)
    }
    public override hasNotAllWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean {
        return hasNotAllWithIteratorByMinimalistCollectionHolder(undefined, values,)
    }
    public override hasNotAllWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean {
        return hasNotAllWithIterableByMinimalistCollectionHolder(undefined, values,)
    }
    public override hasNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
        return hasNotAllByMinimalistCollectionHolder(undefined, values,)
    }


    public override requireNoNulls(): CollectionHolder<NonNullable<T>> {
        if (requireNoNullsByMinimalistCollectionHolder(undefined,) === undefined)
            return this as CollectionHolder<NonNullable<T>>
        throw new Error("The method “requireNoNulls” was not expected to be non-empty.",)
    }

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    public override filter<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filter(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filter(predicate: BooleanCallback<T>,) {
        return filterByMinimalistCollectionHolder(undefined, predicate,)
    }

    public override filterIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,) {
        return filterIndexedByMinimalistCollectionHolder(undefined, predicate,)
    }


    public override filterNot<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filterNot(predicate: BooleanCallback<T>,) {
        return filterNotByMinimalistCollectionHolder(undefined, predicate,)
    }

    public override filterNotIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,) {
        return filterNotIndexedByMinimalistCollectionHolder(undefined, predicate,)
    }


    public override filterNotNull(): CollectionHolder<NonNullable<T>> {
        return filterNotNullByMinimalistCollectionHolder(undefined,)
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
        return sliceByMinimalistCollectionHolder(undefined, indicesOrFrom, to,)
    }

    //#endregion -------------------- Slice --------------------
    //#region -------------------- Take --------------------

    public override take(n: number,): CollectionHolder<T> {
        return takeByMinimalistCollectionHolder(undefined, n,)
    }

    public override takeWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override takeWhile(predicate: BooleanCallback<T>,) {
        return takeWhileByMinimalistCollectionHolder(undefined, predicate,)
    }

    public override takeWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return takeWhileIndexedByMinimalistCollectionHolder(undefined, predicate,)
    }


    public override takeLast(n: number,): CollectionHolder<T> {
        return takeLastByMinimalistCollectionHolder(undefined, n,)
    }

    public override takeLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override takeLastWhile(predicate: BooleanCallback<T>,) {
        return takeLastWhileByMinimalistCollectionHolder(undefined, predicate,)
    }

    public override takeLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return takeLastWhileIndexedByMinimalistCollectionHolder(undefined, predicate,)
    }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Drop --------------------

    public override drop(n: number,): CollectionHolder<T> {
        return dropByMinimalistCollectionHolder(undefined, n,)
    }

    public override dropWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override dropWhile(predicate: BooleanCallback<T>,) {
        return dropWhileByMinimalistCollectionHolder(undefined, predicate,)
    }

    public override dropWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return dropWhileIndexedByMinimalistCollectionHolder(undefined, predicate,)
    }


    public override dropLast(n: number,): CollectionHolder<T> {
        return dropLastByMinimalistCollectionHolder(undefined, n,)
    }

    public override dropLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override dropLastWhile(predicate: BooleanCallback<T>,) {
        return dropLastWhileByMinimalistCollectionHolder(undefined, predicate,)
    }

    public override dropLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return dropLastWhileIndexedByMinimalistCollectionHolder(undefined, predicate,)
    }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Map --------------------

    public override map<const U, >(transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U> {
        return mapByMinimalistCollectionHolder(undefined, transform,)
    }

    public override mapIndexed<const U, >(transform: IndexValueWithReturnCallback<T, U>,): CollectionHolder<U> {
        return mapIndexedByMinimalistCollectionHolder(undefined, transform,)
    }


    public override mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNullByMinimalistCollectionHolder(undefined, transform,)
    }

    public override mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNullIndexedByMinimalistCollectionHolder(undefined, transform,)
    }

    //#endregion -------------------- Map --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    public override forEach(action: ValueIndexCallback<T>,): void {
        forEachByMinimalistCollectionHolder(undefined, action,)
    }

    public override forEachIndexed(action: IndexValueCallback<T>,): void {
        forEachIndexedByMinimalistCollectionHolder(undefined, action,)
    }


    public override onEach(action: ValueIndexCallback<T>,): this {
        onEachByMinimalistCollectionHolder(undefined, action,)
        return this
    }

    public override onEachIndexed(action: IndexValueCallback<T>,): this {
        onEachIndexedByMinimalistCollectionHolder(undefined, action,)
        return this
    }

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    public override toReverse(from?: NullableNumber, to?: NullableNumber,): CollectionHolder<T> {
        return toReverseByMinimalistCollectionHolder(undefined, from, to,)
    }

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- JavaScript methods --------------------

    public override [Symbol.iterator](): CollectionIterator<T> {
        return toIteratorByMinimalistCollectionHolder(undefined,)
    }

    //#endregion -------------------- JavaScript methods --------------------
    //#region -------------------- Conversion methods --------------------

    public override toArray(): readonly T[] {
        return toArrayByMinimalistCollectionHolder(undefined,)
    }
    public override toMutableArray(): T[] {
        return toMutableArrayByMinimalistCollectionHolder(undefined,)
    }

    public override toSet(): ReadonlySet<T> {
        return toSetByMinimalistCollectionHolder(undefined,)
    }
    public override toMutableSet(): Set<T> {
        return toMutableSetByMinimalistCollectionHolder(undefined,)
    }

    public override toMap(): ReadonlyMap<number, T> {
        return toMapByMinimalistCollectionHolder(undefined,)
    }
    public override toMutableMap(): Map<number, T> {
        return toMutableMapByMinimalistCollectionHolder(undefined,)
    }

    public override toString(): string {
        return toStringByMinimalistCollectionHolder(undefined,)
    }
    public override toLocaleString(locale?: NullableString,): string {
        return toLocaleStringByMinimalistCollectionHolder(undefined, locale,)
    }
    public override toLowerCaseString(): string {
        return toLowerCaseStringByMinimalistCollectionHolder(undefined,)
    }
    public override toLocaleLowerCaseString(locale?: NullableString,): string {
        return toLocaleLowerCaseStringByMinimalistCollectionHolder(undefined, locale,)
    }
    public override toUpperCaseString(): string {
        return toUpperCaseStringByMinimalistCollectionHolder(undefined,)
    }
    public override toLocaleUpperCaseString(locale?: NullableString,): string {
        return toLocaleUpperCaseStringByMinimalistCollectionHolder(undefined, locale,)
    }

    public override joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string {
        return joinToStringByMinimalistCollectionHolder(undefined, separator, prefix, postfix, limit, truncated, transform,)
    }

    //#endregion -------------------- Conversion methods --------------------

}

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

/** A test instance to exclusively test the extension methods for a `null` {@link MinimalistCollectionHolder} */
export class CollectionHolder_FromNullMinimalistExtensionFunction<const T, >
    extends AbstractNullCollectionHolderForTest<T> {

    //#region -------------------- Size methods --------------------

    public override get isEmpty(): boolean {
        return isEmptyByMinimalistCollectionHolder(null,)
    }

    public override get isNotEmpty(): boolean {
        return isNotEmptyByMinimalistCollectionHolder(null,)
    }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    public override getFirst(): T {
        return getFirstByMinimalistCollectionHolder(null,)
    }

    public override getLast(): T {
        return getLastByMinimalistCollectionHolder(null,)
    }


    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) {
        return getOrElseByMinimalistCollectionHolder(null, index, defaultValue,)
    }

    public override getFirstOrElse<const U, >(defaultValue: ReturnCallback<U>,): | T | U
    public override getFirstOrElse(defaultValue: ReturnCallback<T>,): T
    public override getFirstOrElse(defaultValue: ReturnCallback<unknown>,) { return getFirstOrElseByMinimalistCollectionHolder(null, defaultValue,) }

    public override getLastOrElse<const U, >(defaultValue: ReturnCallback<U>,): | T | U
    public override getLastOrElse(defaultValue: ReturnCallback<T>,): T
    public override getLastOrElse(defaultValue: ReturnCallback<unknown>,) { return getLastOrElseByMinimalistCollectionHolder(null, defaultValue,) }


    public override getOrNull(index: number,): NullOr<T> {
        return getOrNullByMinimalistCollectionHolder(null, index,)
    }

    public override getFirstOrNull(): NullOr<T> {
        return getFirstOrNullByMinimalistCollectionHolder(null,)
    }

    public override getLastOrNull(): NullOr<T> {
        return getLastOrNullByMinimalistCollectionHolder(null,)
    }

    //#endregion -------------------- Get --------------------
    //#region -------------------- Find --------------------

    public override findFirst<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public override findFirst(predicate: BooleanCallback<T>,): T
    public override findFirst(predicate: BooleanCallback<T>,) {
        return findFirstByMinimalistCollectionHolder(null, predicate,)
    }

    public override findFirstOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findFirstOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public override findFirstOrNull(predicate: BooleanCallback<T>,) {
        return findFirstOrNullByMinimalistCollectionHolder(null, predicate,)
    }

    public override findFirstIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public override findFirstIndexed(predicate: ReverseBooleanCallback<T>,): T
    public override findFirstIndexed(predicate: ReverseBooleanCallback<T>,) {
        return findFirstIndexedByMinimalistCollectionHolder(null, predicate,)
    }

    public override findFirstIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,) {
        return findFirstIndexedOrNullByMinimalistCollectionHolder(null, predicate,)
    }


    public override findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public override findLast(predicate: BooleanCallback<T>,): T
    public override findLast(predicate: BooleanCallback<T>,) {
        return findLastByMinimalistCollectionHolder(null, predicate,)
    }

    public override findLastOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public override findLastOrNull(predicate: BooleanCallback<T>,) {
        return findLastOrNullByMinimalistCollectionHolder(null, predicate,)
    }

    public override findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,): T
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,) {
        return findLastIndexedByMinimalistCollectionHolder(null, predicate,)
    }

    public override findLastIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,) {
        return findLastIndexedOrNullByMinimalistCollectionHolder(null, predicate,)
    }

    //#endregion -------------------- Find --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    public override firstIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,): number {
        return firstIndexOfByMinimalistCollectionHolder(null, element, from, to,)
    }

    public override firstIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return firstIndexOfOrNullByMinimalistCollectionHolder(null, element, from, to,)
    }


    public override lastIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,): number {
        return lastIndexOfByMinimalistCollectionHolder(null, element, from, to,)
    }

    public override lastIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return lastIndexOfOrNullByMinimalistCollectionHolder(null, element, from, to,)
    }


    public override indexOfFirst(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return indexOfFirstByMinimalistCollectionHolder(null, predicate, from, to,)
    }

    public override indexOfFirstOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return indexOfFirstOrNullByMinimalistCollectionHolder(null, predicate, from, to,)
    }

    public override indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return indexOfFirstIndexedByMinimalistCollectionHolder(null, predicate, from, to,)
    }

    public override indexOfFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return indexOfFirstIndexedOrNullByMinimalistCollectionHolder(null, predicate, from, to,)
    }


    public override indexOfLast(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return indexOfLastByMinimalistCollectionHolder(null, predicate, from, to,)
    }

    public override indexOfLastOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return indexOfLastOrNullByMinimalistCollectionHolder(null, predicate, from, to,)
    }

    public override indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return indexOfLastIndexedByMinimalistCollectionHolder(null, predicate, from, to,)
    }

    public override indexOfLastIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return indexOfLastIndexedOrNullByMinimalistCollectionHolder(null, predicate, from, to,)
    }

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    public override all<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolder<S>
    public override all(predicate: BooleanCallback<T>,): boolean
    public override all(predicate: BooleanCallback<T>,) {
        return allByMinimalistCollectionHolder(null, predicate,)
    }

    public override any(): this["isNotEmpty"]
    public override any(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override any(predicate?: Nullable<BooleanCallback<T>>,) {
        return anyByMinimalistCollectionHolder(null, predicate,)
    }

    public override none(): this["isEmpty"]
    public override none(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override none(predicate?: Nullable<BooleanCallback<T>>,) {
        return noneByMinimalistCollectionHolder(null, predicate,)
    }


    public override get hasNull(): boolean {
        return hasNullByMinimalistCollectionHolder(null,)
    }

    public override get hasNoNulls(): boolean {
        return hasNoNullsByMinimalistCollectionHolder(null,)
    }


    public override get hasDuplicate(): boolean {
        return hasDuplicateByMinimalistCollectionHolder(null,)
    }

    public override get hasNoDuplicates(): boolean {
        return hasNoDuplicatesByMinimalistCollectionHolder(null,)
    }


    public override has(value: T,): boolean {
        return hasByMinimalistCollectionHolder(null, value,)
    }

    public override hasNot(value: T,): boolean {
        return hasNotByMinimalistCollectionHolder(null, value,)
    }

    public override hasOneWithArray(values: Nullable<readonly T[]>,): boolean {
        return hasOneWithArrayByMinimalistCollectionHolder(null, values,)
    }
    public override hasOneWithSet(values: Nullable<ReadonlySet<T>>,): boolean {
        return hasOneWithSetByMinimalistCollectionHolder(null, values,)
    }
    public override hasOneWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean {
        return hasOneWithCollectionHolderByMinimalistCollectionHolder(null, values,)
    }
    public override hasOneWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
        return hasOneWithMinimalistCollectionHolderByMinimalistCollectionHolder(null, values,)
    }
    public override hasOneWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean {
        return hasOneWithCollectionIteratorByMinimalistCollectionHolder(null, values,)
    }
    public override hasOneWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean {
        return hasOneWithIteratorByMinimalistCollectionHolder(null, values,)
    }
    public override hasOneWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean {
        return hasOneWithIterableByMinimalistCollectionHolder(null, values,)
    }
    public override hasOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
        return hasOneByMinimalistCollectionHolder(null, values,)
    }

    public override hasNotOneWithArray(values: Nullable<readonly T[]>,): boolean {
        return hasNotOneWithArrayByMinimalistCollectionHolder(null, values,)
    }
    public override hasNotOneWithSet(values: Nullable<ReadonlySet<T>>,): boolean {
        return hasNotOneWithSetByMinimalistCollectionHolder(null, values,)
    }
    public override hasNotOneWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean {
        return hasNotOneWithCollectionHolderByMinimalistCollectionHolder(null, values,)
    }
    public override hasNotOneWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
        return hasNotOneWithMinimalistCollectionHolderByMinimalistCollectionHolder(null, values,)
    }
    public override hasNotOneWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean {
        return hasNotOneWithCollectionIteratorByMinimalistCollectionHolder(null, values,)
    }
    public override hasNotOneWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean {
        return hasNotOneWithIteratorByMinimalistCollectionHolder(null, values,)
    }
    public override hasNotOneWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean {
        return hasNotOneWithIterableByMinimalistCollectionHolder(null, values,)
    }
    public override hasNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
        return hasNotOneByMinimalistCollectionHolder(null, values,)
    }

    public override hasAllWithArray(values: Nullable<readonly T[]>,): boolean {
        return hasAllWithArrayByMinimalistCollectionHolder(null, values,)
    }
    public override hasAllWithSet(values: Nullable<ReadonlySet<T>>,): boolean {
        return hasAllWithSetByMinimalistCollectionHolder(null, values,)
    }
    public override hasAllWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean {
        return hasAllWithCollectionHolderByMinimalistCollectionHolder(null, values,)
    }
    public override hasAllWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
        return hasAllWithMinimalistCollectionHolderByMinimalistCollectionHolder(null, values,)
    }
    public override hasAllWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean {
        return hasAllWithCollectionIteratorByMinimalistCollectionHolder(null, values,)
    }
    public override hasAllWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean {
        return hasAllWithIteratorByMinimalistCollectionHolder(null, values,)
    }
    public override hasAllWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean {
        return hasAllWithIterableByMinimalistCollectionHolder(null, values,)
    }
    public override hasAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
        return hasAllByMinimalistCollectionHolder(null, values,)
    }

    public override hasNotAllWithArray(values: Nullable<readonly T[]>,): boolean {
        return hasNotAllWithArrayByMinimalistCollectionHolder(null, values,)
    }
    public override hasNotAllWithSet(values: Nullable<ReadonlySet<T>>,): boolean {
        return hasNotAllWithSetByMinimalistCollectionHolder(null, values,)
    }
    public override hasNotAllWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean {
        return hasNotAllWithCollectionHolderByMinimalistCollectionHolder(null, values,)
    }
    public override hasNotAllWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
        return hasNotAllWithMinimalistCollectionHolderByMinimalistCollectionHolder(null, values,)
    }
    public override hasNotAllWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean {
        return hasNotAllWithCollectionIteratorByMinimalistCollectionHolder(null, values,)
    }
    public override hasNotAllWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean {
        return hasNotAllWithIteratorByMinimalistCollectionHolder(null, values,)
    }
    public override hasNotAllWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean {
        return hasNotAllWithIterableByMinimalistCollectionHolder(null, values,)
    }
    public override hasNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
        return hasNotAllByMinimalistCollectionHolder(null, values,)
    }


    public override requireNoNulls(): CollectionHolder<NonNullable<T>> {
        if (requireNoNullsByMinimalistCollectionHolder(null,) === null)
            return this as CollectionHolder<NonNullable<T>>
        throw new Error("The method “requireNoNulls” was not expected to be non-empty.",)
    }

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    public override filter<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filter(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filter(predicate: BooleanCallback<T>,) {
        return filterByMinimalistCollectionHolder(null, predicate,)
    }

    public override filterIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,) {
        return filterIndexedByMinimalistCollectionHolder(null, predicate,)
    }


    public override filterNot<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filterNot(predicate: BooleanCallback<T>,) {
        return filterNotByMinimalistCollectionHolder(null, predicate,)
    }

    public override filterNotIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,) {
        return filterNotIndexedByMinimalistCollectionHolder(null, predicate,)
    }


    public override filterNotNull(): CollectionHolder<NonNullable<T>> {
        return filterNotNullByMinimalistCollectionHolder(null,)
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
        return sliceByMinimalistCollectionHolder(null, indicesOrFrom, to,)
    }

    //#endregion -------------------- Slice --------------------
    //#region -------------------- Take --------------------

    public override take(n: number,): CollectionHolder<T> {
        return takeByMinimalistCollectionHolder(null, n,)
    }

    public override takeWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override takeWhile(predicate: BooleanCallback<T>,) {
        return takeWhileByMinimalistCollectionHolder(null, predicate,)
    }

    public override takeWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return takeWhileIndexedByMinimalistCollectionHolder(null, predicate,)
    }


    public override takeLast(n: number,): CollectionHolder<T> {
        return takeLastByMinimalistCollectionHolder(null, n,)
    }

    public override takeLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override takeLastWhile(predicate: BooleanCallback<T>,) {
        return takeLastWhileByMinimalistCollectionHolder(null, predicate,)
    }

    public override takeLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return takeLastWhileIndexedByMinimalistCollectionHolder(null, predicate,)
    }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Drop --------------------

    public override drop(n: number,): CollectionHolder<T> {
        return dropByMinimalistCollectionHolder(null, n,)
    }

    public override dropWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override dropWhile(predicate: BooleanCallback<T>,) {
        return dropWhileByMinimalistCollectionHolder(null, predicate,)
    }

    public override dropWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return dropWhileIndexedByMinimalistCollectionHolder(null, predicate,)
    }


    public override dropLast(n: number,): CollectionHolder<T> {
        return dropLastByMinimalistCollectionHolder(null, n,)
    }

    public override dropLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override dropLastWhile(predicate: BooleanCallback<T>,) {
        return dropLastWhileByMinimalistCollectionHolder(null, predicate,)
    }

    public override dropLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return dropLastWhileIndexedByMinimalistCollectionHolder(null, predicate,)
    }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Map --------------------

    public override map<const U, >(transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U> {
        return mapByMinimalistCollectionHolder(null, transform,)
    }

    public override mapIndexed<const U, >(transform: IndexValueWithReturnCallback<T, U>,): CollectionHolder<U> {
        return mapIndexedByMinimalistCollectionHolder(null, transform,)
    }


    public override mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNullByMinimalistCollectionHolder(null, transform,)
    }

    public override mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNullIndexedByMinimalistCollectionHolder(null, transform,)
    }

    //#endregion -------------------- Map --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    public override forEach(action: ValueIndexCallback<T>,): void {
        forEachByMinimalistCollectionHolder(null, action,)
    }

    public override forEachIndexed(action: IndexValueCallback<T>,): void {
        forEachIndexedByMinimalistCollectionHolder(null, action,)
    }


    public override onEach(action: ValueIndexCallback<T>,): this {
        onEachByMinimalistCollectionHolder(null, action,)
        return this
    }

    public override onEachIndexed(action: IndexValueCallback<T>,): this {
        onEachIndexedByMinimalistCollectionHolder(null, action,)
        return this
    }

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    public override toReverse(from?: NullableNumber, to?: NullableNumber,): CollectionHolder<T> {
        return toReverseByMinimalistCollectionHolder(null, from, to,)
    }

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- JavaScript methods --------------------

    public override [Symbol.iterator](): CollectionIterator<T> {
        return toIteratorByMinimalistCollectionHolder(null,)
    }

    //#endregion -------------------- JavaScript methods --------------------
    //#region -------------------- Conversion methods --------------------

    public override toArray(): readonly T[] {
        return toArrayByMinimalistCollectionHolder(null,)
    }
    public override toMutableArray(): T[] {
        return toMutableArrayByMinimalistCollectionHolder(null,)
    }

    public override toSet(): ReadonlySet<T> {
        return toSetByMinimalistCollectionHolder(null,)
    }
    public override toMutableSet(): Set<T> {
        return toMutableSetByMinimalistCollectionHolder(null,)
    }

    public override toMap(): ReadonlyMap<number, T> {
        return toMapByMinimalistCollectionHolder(null,)
    }
    public override toMutableMap(): Map<number, T> {
        return toMutableMapByMinimalistCollectionHolder(null,)
    }

    public override toString(): string {
        return toStringByMinimalistCollectionHolder(null,)
    }
    public override toLocaleString(locale?: NullableString,): string {
        return toLocaleStringByMinimalistCollectionHolder(null, locale,)
    }
    public override toLowerCaseString(): string {
        return toLowerCaseStringByMinimalistCollectionHolder(null,)
    }
    public override toLocaleLowerCaseString(locale?: NullableString,): string {
        return toLocaleLowerCaseStringByMinimalistCollectionHolder(null, locale,)
    }
    public override toUpperCaseString(): string {
        return toUpperCaseStringByMinimalistCollectionHolder(null,)
    }
    public override toLocaleUpperCaseString(locale?: NullableString,): string {
        return toLocaleUpperCaseStringByMinimalistCollectionHolder(null, locale,)
    }

    public override joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string {
        return joinToStringByMinimalistCollectionHolder(null, separator, prefix, postfix, limit, truncated, transform,)
    }

    //#endregion -------------------- Conversion methods --------------------

}

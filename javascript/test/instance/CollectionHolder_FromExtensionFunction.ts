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

import type {Nullable, NullableNumber, NullableString, NullOr, NullOrNumber} from "@joookiwi/type"

import type {CollectionHolder}                                                                                                                                                                                                                                                  from "../../src/CollectionHolder"
import type {MinimalistCollectionHolder}                                                                                                                                                                                                                                        from "../../src/MinimalistCollectionHolder"
import type {CollectionIterator}                                                                                                                                                                                                                                                from "../../src/iterator/CollectionIterator"
import type {BooleanCallback, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, RestrainedBooleanCallback, ReturnCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, StringCallback, ValueIndexCallback, ValueIndexWithReturnCallback} from "../../src/type/callback"
import type {PossibleIterableIteratorArraySetOrCollectionHolder}                                                                                                                                                                                                                from "../../src/type/possibleInstance"
import type {CollectionHolder_FromExtension}                                                                                                                                                                                                                                    from "./CollectionHolder_FromExtension"

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
import {hasAllWithSetByCollectionHolder}                           from "../../src/method/hasAll.withSet"
import {hasAllWithCollectionHolderByCollectionHolder}              from "../../src/method/hasAll.withCollectionHolder"
import {hasAllWithMinimalistCollectionHolderByCollectionHolder}    from "../../src/method/hasAll.withMinimalistCollectionHolder"
import {hasAllWithCollectionIteratorByCollectionHolder}            from "../../src/method/hasAll.withCollectionIterator"
import {hasAllWithIteratorByCollectionHolder}                      from "../../src/method/hasAll.withIterator"
import {hasAllWithIterableByCollectionHolder}                      from "../../src/method/hasAll.withIterable"
import {hasDuplicateByCollectionHolder}                            from "../../src/method/hasDuplicate"
import {hasNoDuplicatesByCollectionHolder}                         from "../../src/method/hasNoDuplicates"
import {hasNoNullsByCollectionHolder}                              from "../../src/method/hasNoNulls"
import {hasNotByCollectionHolder}                                  from "../../src/method/hasNot"
import {hasNotAllByCollectionHolder}                               from "../../src/method/hasNotAll"
import {hasNotAllWithArrayByCollectionHolder}                      from "../../src/method/hasNotAll.withArray"
import {hasNotAllWithSetByCollectionHolder}                        from "../../src/method/hasNotAll.withSet"
import {hasNotAllWithCollectionHolderByCollectionHolder}           from "../../src/method/hasNotAll.withCollectionHolder"
import {hasNotAllWithMinimalistCollectionHolderByCollectionHolder} from "../../src/method/hasNotAll.withMinimalistCollectionHolder"
import {hasNotAllWithCollectionIteratorByCollectionHolder}         from "../../src/method/hasNotAll.withCollectionIterator"
import {hasNotAllWithIteratorByCollectionHolder}                   from "../../src/method/hasNotAll.withIterator"
import {hasNotAllWithIterableByCollectionHolder}                   from "../../src/method/hasNotAll.withIterable"
import {hasNotOneByCollectionHolder}                               from "../../src/method/hasNotOne"
import {hasNotOneWithArrayByCollectionHolder}                      from "../../src/method/hasNotOne.withArray"
import {hasNotOneWithSetByCollectionHolder}                        from "../../src/method/hasNotOne.withSet"
import {hasNotOneWithCollectionHolderByCollectionHolder}           from "../../src/method/hasNotOne.withCollectionHolder"
import {hasNotOneWithMinimalistCollectionHolderByCollectionHolder} from "../../src/method/hasNotOne.withMinimalistCollectionHolder"
import {hasNotOneWithCollectionIteratorByCollectionHolder}         from "../../src/method/hasNotOne.withCollectionIterator"
import {hasNotOneWithIteratorByCollectionHolder}                   from "../../src/method/hasNotOne.withIterator"
import {hasNotOneWithIterableByCollectionHolder}                   from "../../src/method/hasNotOne.withIterable"
import {hasNullByCollectionHolder}                                 from "../../src/method/hasNull"
import {hasOneByCollectionHolder}                                  from "../../src/method/hasOne"
import {hasOneWithArrayByCollectionHolder}                         from "../../src/method/hasOne.withArray"
import {hasOneWithSetByCollectionHolder}                           from "../../src/method/hasOne.withSet"
import {hasOneWithCollectionHolderByCollectionHolder}              from "../../src/method/hasOne.withCollectionHolder"
import {hasOneWithMinimalistCollectionHolderByCollectionHolder}    from "../../src/method/hasOne.withMinimalistCollectionHolder"
import {hasOneWithCollectionIteratorByCollectionHolder}            from "../../src/method/hasOne.withCollectionIterator"
import {hasOneWithIteratorByCollectionHolder}                      from "../../src/method/hasOne.withIterator"
import {hasOneWithIterableByCollectionHolder}                      from "../../src/method/hasOne.withIterable"
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
import {sliceWithARangeByCollectionHolder}                         from "../../src/method/slice.withARange"
import {sliceWithArrayByCollectionHolder}                          from "../../src/method/slice.withArray"
import {sliceWithCollectionHolderByCollectionHolder}               from "../../src/method/slice.withCollectionHolder"
import {sliceWithCollectionIteratorByCollectionHolder}             from "../../src/method/slice.withCollectionIterator"
import {sliceWithIterableByCollectionHolder}                       from "../../src/method/slice.withIterable"
import {sliceWithIteratorByCollectionHolder}                       from "../../src/method/slice.withIterator"
import {sliceWithMinimalistCollectionHolderByCollectionHolder}     from "../../src/method/slice.withMinimalistCollectionHolder"
import {sliceWithSetByCollectionHolder}                            from "../../src/method/slice.withSet"
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
import {AbstractCollectionHolderForTest}                           from "./AbstractCollectionHolderForTest"

/** A test instance to exclusively test the extension methods for a {@link CollectionHolder} */
export class CollectionHolder_FromExtensionFunction<const T, >
    extends AbstractCollectionHolderForTest<T>
    implements CollectionHolder_FromExtension<T> {

    public constructor(/** The array received in the constructor */ public readonly array: readonly T[],) { super() }

    //#region -------------------- Test utility methods --------------------

    public override get amountOfCall(): never {
        throw new Error("The getter method “amountOfCall” was not expected to be called on an extension function only test instance.",)
    }

    public override set amountOfCall(_: unknown,) {
        throw new Error("The setter method “amountOfCall” was not expected to be called on an extension function only test instance.",)
    }

    //#endregion -------------------- Test utility methods --------------------
    //#region -------------------- Size methods --------------------

    public get size(): number {
        return this.array.length
    }

    public get isEmpty(): boolean {
        return isEmptyByCollectionHolder(this,)
    }

    public get isNotEmpty(): boolean {
        return isNotEmptyByCollectionHolder(this,)
    }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    public override get(index: number,): T {
        if (index < 0)
            throw new Error("The method “get” was not expected to be called with a negative index",)

		const array = this.array
        if (index >= array.length)
            throw new Error("The method “get” was not expected to be called with an index equal or over the size",)
        return array[index] as T
    }

    public override getFirst(): T {
        return getFirstByCollectionHolder<T>(this,)
    }

    public override getLast(): T {
        return getLastByCollectionHolder<T>(this,)
    }

    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) {
        return getOrElseByCollectionHolder(this, index, defaultValue,)
    }

    public override getFirstOrElse<const U, >(defaultValue: ReturnCallback<U>,): | T | U
    public override getFirstOrElse(defaultValue: ReturnCallback<T>,): T
    public override getFirstOrElse(defaultValue: ReturnCallback<unknown>,) { return getFirstOrElseByCollectionHolder(this, defaultValue,) }

    public override getLastOrElse<const U, >(defaultValue: ReturnCallback<U>,): | T | U
    public override getLastOrElse(defaultValue: ReturnCallback<T>,): T
    public override getLastOrElse(defaultValue: ReturnCallback<unknown>,) { return getLastOrElseByCollectionHolder(this, defaultValue,) }

    public override getOrNull(index: number,): NullOr<T> {
        return getOrNullByCollectionHolder<T>(this, index,)
    }

    public override getFirstOrNull(): NullOr<T> {
        return getFirstOrNullByCollectionHolder<T>(this,)
    }

    public override getLastOrNull(): NullOr<T> {
        return getLastOrNullByCollectionHolder<T>(this,)
    }

    //#endregion -------------------- Get --------------------
    //#region -------------------- Find --------------------

    public override findFirst<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public override findFirst(predicate: BooleanCallback<T>,): T
    public override findFirst(predicate: BooleanCallback<T>,) {
        return findFirstByCollectionHolder(this, predicate,)
    }

    public override findFirstOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findFirstOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public override findFirstOrNull(predicate: BooleanCallback<T>,) {
        return findFirstOrNullByCollectionHolder(this, predicate,)
    }

    public override findFirstIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public override findFirstIndexed(predicate: ReverseBooleanCallback<T>,): T
    public override findFirstIndexed(predicate: ReverseBooleanCallback<T>,) {
        return findFirstIndexedByCollectionHolder(this, predicate,)
    }

    public override findFirstIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,) {
        return findFirstIndexedOrNullByCollectionHolder(this, predicate,)
    }


    public override findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public override findLast(predicate: BooleanCallback<T>,): T
    public override findLast(predicate: BooleanCallback<T>,) {
        return findLastByCollectionHolder(this, predicate,)
    }

    public override findLastOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public override findLastOrNull(predicate: BooleanCallback<T>,) {
        return findLastOrNullByCollectionHolder(this, predicate,)
    }

    public override findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,): T
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,) {
        return findLastIndexedByCollectionHolder(this, predicate,)
    }

    public override findLastIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,) {
        return findLastIndexedOrNullByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Find --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    public override firstIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,): number {
        return firstIndexOfByCollectionHolder<T>(this, element, from, to,)
    }

    public override firstIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return firstIndexOfOrNullByCollectionHolder<T>(this, element, from, to,)
    }



    public override lastIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,): number {
        return lastIndexOfByCollectionHolder<T>(this, element, from, to,)
    }

    public override lastIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return lastIndexOfOrNullByCollectionHolder<T>(this, element, from, to,)
    }


    public override indexOfFirst(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return indexOfFirstByCollectionHolder(this, predicate, from, to,)
    }

    public override indexOfFirstOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return indexOfFirstOrNullByCollectionHolder(this, predicate, from, to,)
    }

    public override indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return indexOfFirstIndexedByCollectionHolder(this, predicate, from, to,)
    }

    public override indexOfFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return indexOfFirstIndexedOrNullByCollectionHolder(this, predicate, from, to,)
    }


    public override indexOfLast(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return indexOfLastByCollectionHolder(this, predicate, from, to,)
    }

    public override indexOfLastOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return indexOfLastOrNullByCollectionHolder(this, predicate, from, to,)
    }

    public override indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return indexOfLastIndexedByCollectionHolder(this, predicate, from, to,)
    }

    public override indexOfLastIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return indexOfLastIndexedOrNullByCollectionHolder(this, predicate, from, to,)
    }

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    public override all<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolder<S>
    public override all(predicate: BooleanCallback<T>,): boolean
    public override all(predicate: BooleanCallback<T>,) {
        return allByCollectionHolder(this, predicate,)
    }

    public override any(): this["isNotEmpty"]
    public override any(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override any(predicate?: Nullable<BooleanCallback<T>>,) {
        return anyByCollectionHolder(this, predicate,)
    }

    public override none(): this["isEmpty"]
    public override none(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override none(predicate?: Nullable<BooleanCallback<T>>,) {
        return noneByCollectionHolder(this, predicate,)
    }


    public override get hasNull(): boolean {
        return hasNullByCollectionHolder<T>(this,)
    }

    public override get hasNoNulls(): boolean {
        return hasNoNullsByCollectionHolder<T>(this,)
    }


    public override get hasDuplicate(): boolean {
        return hasDuplicateByCollectionHolder<T>(this,)
    }

    public override get hasNoDuplicates(): boolean {
        return hasNoDuplicatesByCollectionHolder<T>(this,)
    }


    public override has(value: T,): boolean {
        return hasByCollectionHolder<T>(this, value,)
    }

    public override hasNot(value: T,): boolean {
        return hasNotByCollectionHolder<T>(this, value,)
    }

    public hasOneWithArray(values: Nullable<readonly T[]>,): boolean {
        return hasOneWithArrayByCollectionHolder(this, values,)
    }
    public hasOneWithSet(values: Nullable<ReadonlySet<T>>,): boolean {
        return hasOneWithSetByCollectionHolder(this, values,)
    }
    public hasOneWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean {
        return hasOneWithCollectionHolderByCollectionHolder(this, values,)
    }
    public hasOneWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
        return hasOneWithMinimalistCollectionHolderByCollectionHolder(this, values,)
    }
    public hasOneWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean {
        return hasOneWithCollectionIteratorByCollectionHolder(this, values,)
    }
    public hasOneWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean {
        return hasOneWithIteratorByCollectionHolder(this, values,)
    }
    public hasOneWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean {
        return hasOneWithIterableByCollectionHolder(this, values,)
    }
    public override hasOne(values: Nullable<readonly T[]>,): boolean
    public override hasOne(values: Nullable<ReadonlySet<T>>,): boolean
    public override hasOne(values: Nullable<CollectionHolder<T>>,): boolean
    public override hasOne(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public override hasOne(values: Nullable<CollectionIterator<T>>,): boolean
    public override hasOne(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public override hasOne(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public override hasOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
    public override hasOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
        return hasOneByCollectionHolder(this, values,)
    }

    public hasNotOneWithArray(values: Nullable<readonly T[]>,): boolean {
        return hasNotOneWithArrayByCollectionHolder(this, values,)
    }
    public hasNotOneWithSet(values: Nullable<ReadonlySet<T>>,): boolean {
        return hasNotOneWithSetByCollectionHolder(this, values,)
    }
    public hasNotOneWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean {
        return hasNotOneWithCollectionHolderByCollectionHolder(this, values,)
    }
    public hasNotOneWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
        return hasNotOneWithMinimalistCollectionHolderByCollectionHolder(this, values,)
    }
    public hasNotOneWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean {
        return hasNotOneWithCollectionIteratorByCollectionHolder(this, values,)
    }
    public hasNotOneWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean {
        return hasNotOneWithIteratorByCollectionHolder(this, values,)
    }
    public hasNotOneWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean {
        return hasNotOneWithIterableByCollectionHolder(this, values,)
    }
    public override hasNotOne(values: Nullable<readonly T[]>,): boolean
    public override hasNotOne(values: Nullable<ReadonlySet<T>>,): boolean
    public override hasNotOne(values: Nullable<CollectionHolder<T>>,): boolean
    public override hasNotOne(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public override hasNotOne(values: Nullable<CollectionIterator<T>>,): boolean
    public override hasNotOne(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public override hasNotOne(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public override hasNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
    public override hasNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
        return hasNotOneByCollectionHolder(this, values,)
    }

    public hasAllWithArray(values: Nullable<readonly T[]>,): boolean {
        return hasAllWithArrayByCollectionHolder(this, values,)
    }
    public hasAllWithSet(values: Nullable<ReadonlySet<T>>,): boolean {
        return hasAllWithSetByCollectionHolder(this, values,)
    }
    public hasAllWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean {
        return hasAllWithCollectionHolderByCollectionHolder(this, values,)
    }
    public hasAllWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
        return hasAllWithMinimalistCollectionHolderByCollectionHolder(this, values,)
    }
    public hasAllWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean {
        return hasAllWithCollectionIteratorByCollectionHolder(this, values,)
    }
    public hasAllWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean {
        return hasAllWithIteratorByCollectionHolder(this, values,)
    }
    public hasAllWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean {
        return hasAllWithIterableByCollectionHolder(this, values,)
    }
    public override hasAll(values: Nullable<readonly T[]>,): boolean
    public override hasAll(values: Nullable<ReadonlySet<T>>,): boolean
    public override hasAll(values: Nullable<CollectionHolder<T>>,): boolean
    public override hasAll(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public override hasAll(values: Nullable<CollectionIterator<T>>,): boolean
    public override hasAll(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public override hasAll(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public override hasAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
    public override hasAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
        return hasAllByCollectionHolder(this, values,)
    }

    public hasNotAllWithArray(values: Nullable<readonly T[]>,): boolean {
        return hasNotAllWithArrayByCollectionHolder(this, values,)
    }
    public hasNotAllWithSet(values: Nullable<ReadonlySet<T>>,): boolean {
        return hasNotAllWithSetByCollectionHolder(this, values,)
    }
    public hasNotAllWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean {
        return hasNotAllWithCollectionHolderByCollectionHolder(this, values,)
    }
    public hasNotAllWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
        return hasNotAllWithMinimalistCollectionHolderByCollectionHolder(this, values,)
    }
    public hasNotAllWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean {
        return hasNotAllWithCollectionIteratorByCollectionHolder(this, values,)
    }
    public hasNotAllWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean {
        return hasNotAllWithIteratorByCollectionHolder(this, values,)
    }
    public hasNotAllWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean {
        return hasNotAllWithIterableByCollectionHolder(this, values,)
    }
    public override hasNotAll(values: Nullable<readonly T[]>,): boolean
    public override hasNotAll(values: Nullable<ReadonlySet<T>>,): boolean
    public override hasNotAll(values: Nullable<CollectionHolder<T>>,): boolean
    public override hasNotAll(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public override hasNotAll(values: Nullable<CollectionIterator<T>>,): boolean
    public override hasNotAll(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public override hasNotAll(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public override hasNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
    public override hasNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
        return hasNotAllByCollectionHolder(this, values,)
    }


    public override requireNoNulls(): CollectionHolder<NonNullable<T>> {
        return requireNoNullsByCollectionHolder<T>(this,)
    }

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    public override filter<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filter(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filter(predicate: BooleanCallback<T>,) {
        return filterByCollectionHolder(this, predicate,)
    }

    public override filterIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,) {
        return filterIndexedByCollectionHolder(this, predicate,)
    }


    public override filterNot<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filterNot(predicate: BooleanCallback<T>,) {
        return filterNotByCollectionHolder(this, predicate,)
    }

    public override filterNotIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,) {
        return filterNotIndexedByCollectionHolder(this, predicate,)
    }


    public override filterNotNull(): CollectionHolder<NonNullable<T>> {
        return filterNotNullByCollectionHolder<T>(this,)
    }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Slice --------------------

    public sliceWithARange(from?: NullableNumber, to?: NullableNumber,): CollectionHolder<T> {
        return sliceWithARangeByCollectionHolder<T>(this, from, to,)
    }
    public sliceWithArray(indices: readonly number[],): CollectionHolder<T> {
        return sliceWithArrayByCollectionHolder<T>(this, indices,)
    }
    public sliceWithSet(indices: ReadonlySet<number>,): CollectionHolder<T> {
        return sliceWithSetByCollectionHolder<T>(this, indices,)
    }
    public sliceWithCollectionHolder(indices: CollectionHolder<number>,): CollectionHolder<T> {
        return sliceWithCollectionHolderByCollectionHolder<T>(this, indices,)
    }
    public sliceWithMinimalistCollectionHolder(indices: MinimalistCollectionHolder<number>,): CollectionHolder<T> {
        return sliceWithMinimalistCollectionHolderByCollectionHolder<T>(this, indices,)
    }
    public sliceWithCollectionIterator(indices: CollectionIterator<number>,): CollectionHolder<T> {
        return sliceWithCollectionIteratorByCollectionHolder<T>(this, indices,)
    }
    public sliceWithIterator(indices: Iterator<number, unknown, unknown>,): CollectionHolder<T> {
        return sliceWithIteratorByCollectionHolder<T>(this, indices,)
    }
    public sliceWithIterable(indices: Iterable<number, unknown, unknown>,): CollectionHolder<T> {
        return sliceWithIterableByCollectionHolder<T>(this, indices,)
    }
    public override slice(from?: NullableNumber, to?: NullableNumber,): CollectionHolder<T>
    public override slice(indices: PossibleIterableIteratorArraySetOrCollectionHolder<number>,): CollectionHolder<T>
    public override slice(indicesOrFrom?: Nullable<| PossibleIterableIteratorArraySetOrCollectionHolder<number> | number>, to?: NullableNumber,) {
        return sliceByCollectionHolder<T>(this, indicesOrFrom, to,)
    }

    //#endregion -------------------- Slice --------------------
    //#region -------------------- Take --------------------

    public override take(n: number,): CollectionHolder<T> {
        return takeByCollectionHolder<T>(this, n,)
    }

    public override takeWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override takeWhile(predicate: BooleanCallback<T>,) {
        return takeWhileByCollectionHolder(this, predicate,)
    }

    public override takeWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return takeWhileIndexedByCollectionHolder(this, predicate,)
    }


    public override takeLast(n: number,): CollectionHolder<T> {
        return takeLastByCollectionHolder<T>(this, n,)
    }

    public override takeLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override takeLastWhile(predicate: BooleanCallback<T>,) {
        return takeLastWhileByCollectionHolder(this, predicate,)
    }

    public override takeLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return takeLastWhileIndexedByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Drop --------------------

    public override drop(n: number,): CollectionHolder<T> {
        return dropByCollectionHolder<T>(this, n,)
    }

    public override dropWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override dropWhile(predicate: BooleanCallback<T>,) {
        return dropWhileByCollectionHolder(this, predicate,)
    }

    public override dropWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return dropWhileIndexedByCollectionHolder(this, predicate,)
    }


    public override dropLast(n: number,): CollectionHolder<T> {
        return dropLastByCollectionHolder<T>(this, n,)
    }

    public override dropLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override dropLastWhile(predicate: BooleanCallback<T>,) {
        return dropLastWhileByCollectionHolder(this, predicate,)
    }

    public override dropLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return dropLastWhileIndexedByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Map --------------------

    public override map<const U, >(transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U> {
        return mapByCollectionHolder(this, transform,)
    }

    public override mapIndexed<const U, >(transform: IndexValueWithReturnCallback<T, U>,): CollectionHolder<U> {
        return mapIndexedByCollectionHolder(this, transform,)
    }


    public override mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNullByCollectionHolder(this, transform,)
    }

    public override mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNullIndexedByCollectionHolder(this, transform,)
    }

    //#endregion -------------------- Map --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    public override forEach(action: ValueIndexCallback<T>,): void {
        forEachByCollectionHolder(this, action,)
    }

    public override forEachIndexed(action: IndexValueCallback<T>,): void {
        forEachIndexedByCollectionHolder(this, action,)
    }

    public override onEach(action: ValueIndexCallback<T>,): this {
        return onEachByCollectionHolder(this, action,)
    }

    public override onEachIndexed(action: IndexValueCallback<T>,): this {
        return onEachIndexedByCollectionHolder(this, action,)
    }

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    public override toReverse(from?: NullableNumber, to?: NullableNumber,): CollectionHolder<T> {
        return toReverseByCollectionHolder<T>(this, from, to,)
    }

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- JavaScript methods --------------------

    public override [Symbol.iterator](): CollectionIterator<T> {
        return toIteratorByCollectionHolder<T>(this,)
    }

    //#endregion -------------------- JavaScript methods --------------------
    //#region -------------------- Conversion methods --------------------

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

    public override toString(): string {
        return toStringByCollectionHolder<T>(this,)
    }
    public override toLocaleString(locale?: NullableString,): string {
        return toLocaleStringByCollectionHolder<T>(this, locale,)
    }
    public override toLowerCaseString(): string {
        return toLowerCaseStringByCollectionHolder<T>(this,)
    }
    public override toLocaleLowerCaseString(locale?: NullableString,): string {
        return toLocaleLowerCaseStringByCollectionHolder<T>(this, locale,)
    }
    public override toUpperCaseString(): string {
        return toUpperCaseStringByCollectionHolder<T>(this,)
    }
    public override toLocaleUpperCaseString(locale?: NullableString,): string {
        return toLocaleUpperCaseStringByCollectionHolder<T>(this, locale,)
    }

    public override joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string {
        return joinToStringByCollectionHolder(this, separator, prefix, postfix, limit, truncated, transform,)
    }

    //#endregion -------------------- Conversion methods --------------------

}

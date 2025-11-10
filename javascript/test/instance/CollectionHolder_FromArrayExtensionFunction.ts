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
import type {CollectionHolder_FromExtension}                                                                                                                                                                                                                                    from "./CollectionHolder_FromExtension"

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
import {hasAllWithSetByArray}                           from "../../src/method/hasAll.withSet"
import {hasAllWithCollectionHolderByArray}              from "../../src/method/hasAll.withCollectionHolder"
import {hasAllWithMinimalistCollectionHolderByArray}    from "../../src/method/hasAll.withMinimalistCollectionHolder"
import {hasAllWithCollectionIteratorByArray}            from "../../src/method/hasAll.withCollectionIterator"
import {hasAllWithIteratorByArray}                      from "../../src/method/hasAll.withIterator"
import {hasAllWithIterableByArray}                      from "../../src/method/hasAll.withIterable"
import {hasDuplicateByArray}                            from "../../src/method/hasDuplicate"
import {hasNoDuplicatesByArray}                         from "../../src/method/hasNoDuplicates"
import {hasNoNullsByArray}                              from "../../src/method/hasNoNulls"
import {hasNotByArray}                                  from "../../src/method/hasNot"
import {hasNotAllByArray}                               from "../../src/method/hasNotAll"
import {hasNotAllWithArrayByArray}                      from "../../src/method/hasNotAll.withArray"
import {hasNotAllWithSetByArray}                        from "../../src/method/hasNotAll.withSet"
import {hasNotAllWithCollectionHolderByArray}           from "../../src/method/hasNotAll.withCollectionHolder"
import {hasNotAllWithMinimalistCollectionHolderByArray} from "../../src/method/hasNotAll.withMinimalistCollectionHolder"
import {hasNotAllWithCollectionIteratorByArray}         from "../../src/method/hasNotAll.withCollectionIterator"
import {hasNotAllWithIteratorByArray}                   from "../../src/method/hasNotAll.withIterator"
import {hasNotAllWithIterableByArray}                   from "../../src/method/hasNotAll.withIterable"
import {hasNotOneByArray}                               from "../../src/method/hasNotOne"
import {hasNotOneWithArrayByArray}                      from "../../src/method/hasNotOne.withArray"
import {hasNotOneWithSetByArray}                        from "../../src/method/hasNotOne.withSet"
import {hasNotOneWithCollectionHolderByArray}           from "../../src/method/hasNotOne.withCollectionHolder"
import {hasNotOneWithMinimalistCollectionHolderByArray} from "../../src/method/hasNotOne.withMinimalistCollectionHolder"
import {hasNotOneWithCollectionIteratorByArray}         from "../../src/method/hasNotOne.withCollectionIterator"
import {hasNotOneWithIteratorByArray}                   from "../../src/method/hasNotOne.withIterator"
import {hasNotOneWithIterableByArray}                   from "../../src/method/hasNotOne.withIterable"
import {hasNullByArray}                                 from "../../src/method/hasNull"
import {hasOneByArray}                                  from "../../src/method/hasOne"
import {hasOneWithArrayByArray}                         from "../../src/method/hasOne.withArray"
import {hasOneWithSetByArray}                           from "../../src/method/hasOne.withSet"
import {hasOneWithCollectionHolderByArray}              from "../../src/method/hasOne.withCollectionHolder"
import {hasOneWithMinimalistCollectionHolderByArray}    from "../../src/method/hasOne.withMinimalistCollectionHolder"
import {hasOneWithCollectionIteratorByArray}            from "../../src/method/hasOne.withCollectionIterator"
import {hasOneWithIteratorByArray}                      from "../../src/method/hasOne.withIterator"
import {hasOneWithIterableByArray}                      from "../../src/method/hasOne.withIterable"
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
import {sliceWithARangeByArray}                         from "../../src/method/slice.withARange"
import {sliceWithArrayByArray}                          from "../../src/method/slice.withArray"
import {sliceWithCollectionHolderByArray}               from "../../src/method/slice.withCollectionHolder"
import {sliceWithCollectionIteratorByArray}             from "../../src/method/slice.withCollectionIterator"
import {sliceWithIterableByArray}                       from "../../src/method/slice.withIterable"
import {sliceWithIteratorByArray}                       from "../../src/method/slice.withIterator"
import {sliceWithMinimalistCollectionHolderByArray}     from "../../src/method/slice.withMinimalistCollectionHolder"
import {sliceWithSetByArray}                            from "../../src/method/slice.withSet"
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
import {AbstractCollectionHolderForTest}                from "./AbstractCollectionHolderForTest"

/** A test instance to exclusively test the extension methods for an {@link ReadonlyArray Array} */
export class CollectionHolder_FromArrayExtensionFunction<const T, >
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

    public override get size(): number {
        return this.array.length
    }

    public override get isEmpty(): boolean {
        return isEmptyByArray(this.array,)
    }

    public override get isNotEmpty(): boolean {
        return isNotEmptyByArray(this.array,)
    }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    public override get(index?: number,): never
    public override get() {
        throw new Error("The method “get” was not expected to be called directly",)
    }

    public override getFirst(): T {
        return getFirstByArray(this.array,)
    }

    public override getLast(): T {
        return getLastByArray(this.array,)
    }


    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) {
        return getOrElseByArray(this.array, index, defaultValue,)
    }

    public override getFirstOrElse<const U, >(defaultValue: ReturnCallback<U>,): | T | U
    public override getFirstOrElse(defaultValue: ReturnCallback<T>,): T
    public override getFirstOrElse(defaultValue: ReturnCallback<unknown>,) { return getFirstOrElseByArray(this.array, defaultValue,) }

    public override getLastOrElse<const U, >(defaultValue: ReturnCallback<U>,): | T | U
    public override getLastOrElse(defaultValue: ReturnCallback<T>,): T
    public override getLastOrElse(defaultValue: ReturnCallback<unknown>,) { return getLastOrElseByArray(this.array, defaultValue,) }


    public override getOrNull(index: number,): NullOr<T> {
        return getOrNullByArray(this.array, index,)
    }

    public override getFirstOrNull(): NullOr<T> {
        return getFirstOrNullByArray(this.array,)
    }

    public override getLastOrNull(): NullOr<T> {
        return getLastOrNullByArray(this.array,)
    }

    //#endregion -------------------- Get --------------------
    //#region -------------------- Find --------------------

    public override findFirst<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public override findFirst(predicate: BooleanCallback<T>,): T
    public override findFirst(predicate: BooleanCallback<T>,) {
        return findFirstByArray(this.array, predicate,)
    }

    public override findFirstOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findFirstOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public override findFirstOrNull(predicate: BooleanCallback<T>,) {
        return findFirstOrNullByArray(this.array, predicate,)
    }

    public override findFirstIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public override findFirstIndexed(predicate: ReverseBooleanCallback<T>,): T
    public override findFirstIndexed(predicate: ReverseBooleanCallback<T>,) {
        return findFirstIndexedByArray(this.array, predicate,)
    }

    public override findFirstIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,) {
        return findFirstIndexedOrNullByArray(this.array, predicate,)
    }


    public override findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public override findLast(predicate: BooleanCallback<T>,): T
    public override findLast(predicate: BooleanCallback<T>,) {
        return findLastByArray(this.array, predicate,)
    }

    public override findLastOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public override findLastOrNull(predicate: BooleanCallback<T>,) {
        return findLastOrNullByArray(this.array, predicate,)
    }

    public override findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,): T
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,) {
        return findLastIndexedByArray(this.array, predicate,)
    }

    public override findLastIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,) {
        return findLastIndexedOrNullByArray(this.array, predicate,)
    }

    //#endregion -------------------- Find --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    public override firstIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,): number {
        return firstIndexOfByArray(this.array, element, from, to,)
    }

    public override firstIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return firstIndexOfOrNullByArray(this.array, element, from, to,)
    }


    public override lastIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,): number {
        return lastIndexOfByArray(this.array, element, from, to,)
    }

    public override lastIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return lastIndexOfOrNullByArray(this.array, element, from, to,)
    }


    public override indexOfFirst(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return indexOfFirstByArray(this.array, predicate, from, to,)
    }

    public override indexOfFirstOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return indexOfFirstOrNullByArray(this.array, predicate, from, to,)
    }

    public override indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return indexOfFirstIndexedByArray(this.array, predicate, from, to,)
    }

    public override indexOfFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return indexOfFirstIndexedOrNullByArray(this.array, predicate, from, to,)
    }


    public override indexOfLast(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return indexOfLastByArray(this.array, predicate, from, to,)
    }

    public override indexOfLastOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return indexOfLastOrNullByArray(this.array, predicate, from, to,)
    }

    public override indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return indexOfLastIndexedByArray(this.array, predicate, from, to,)
    }

    public override indexOfLastIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return indexOfLastIndexedOrNullByArray(this.array, predicate, from, to,)
    }

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    public override all<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolder<S>
    public override all(predicate: BooleanCallback<T>,): boolean
    public override all(predicate: BooleanCallback<T>,) {
        return allByArray(this.array, predicate,)
    }

    public override any(): this["isNotEmpty"]
    public override any(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override any(predicate?: Nullable<BooleanCallback<T>>,) {
        return anyByArray(this.array, predicate,)
    }

    public override none(): this["isEmpty"]
    public override none(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override none(predicate?: Nullable<BooleanCallback<T>>,) {
        return noneByArray(this.array, predicate,)
    }


    public override get hasNull(): boolean {
        return hasNullByArray(this.array,)
    }

    public override get hasNoNulls(): boolean {
        return hasNoNullsByArray(this.array,)
    }


    public override get hasDuplicate(): boolean {
        return hasDuplicateByArray(this.array,)
    }

    public override get hasNoDuplicates(): boolean {
        return hasNoDuplicatesByArray(this.array,)
    }


    public override has(value: T,): boolean {
        return hasByArray(this.array, value,)
    }

    public override hasNot(value: T,): boolean {
        return hasNotByArray(this.array, value,)
    }

    public hasOneWithArray(values: Nullable<readonly T[]>,): boolean {
        return hasOneWithArrayByArray(this.array, values,)
    }
    public hasOneWithSet(values: Nullable<ReadonlySet<T>>,): boolean {
        return hasOneWithSetByArray(this.array, values,)
    }
    public hasOneWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean {
        return hasOneWithCollectionHolderByArray(this.array, values,)
    }
    public hasOneWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
        return hasOneWithMinimalistCollectionHolderByArray(this.array, values,)
    }
    public hasOneWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean {
        return hasOneWithCollectionIteratorByArray(this.array, values,)
    }
    public hasOneWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean {
        return hasOneWithIteratorByArray(this.array, values,)
    }
    public hasOneWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean {
        return hasOneWithIterableByArray(this.array, values,)
    }
    public override hasOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
        return hasOneByArray(this.array, values,)
    }

    public hasNotOneWithArray(values: Nullable<readonly T[]>,): boolean {
        return hasNotOneWithArrayByArray(this.array, values,)
    }
    public hasNotOneWithSet(values: Nullable<ReadonlySet<T>>,): boolean {
        return hasNotOneWithSetByArray(this.array, values,)
    }
    public hasNotOneWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean {
        return hasNotOneWithCollectionHolderByArray(this.array, values,)
    }
    public hasNotOneWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
        return hasNotOneWithMinimalistCollectionHolderByArray(this.array, values,)
    }
    public hasNotOneWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean {
        return hasNotOneWithCollectionIteratorByArray(this.array, values,)
    }
    public hasNotOneWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean {
        return hasNotOneWithIteratorByArray(this.array, values,)
    }
    public hasNotOneWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean {
        return hasNotOneWithIterableByArray(this.array, values,)
    }
    public override hasNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
        return hasNotOneByArray(this.array, values,)
    }

    public hasAllWithArray(values: Nullable<readonly T[]>,): boolean {
        return hasAllWithArrayByArray(this.array, values,)
    }
    public hasAllWithSet(values: Nullable<ReadonlySet<T>>,): boolean {
        return hasAllWithSetByArray(this.array, values,)
    }
    public hasAllWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean {
        return hasAllWithCollectionHolderByArray(this.array, values,)
    }
    public hasAllWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
        return hasAllWithMinimalistCollectionHolderByArray(this.array, values,)
    }
    public hasAllWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean {
        return hasAllWithCollectionIteratorByArray(this.array, values,)
    }
    public hasAllWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean {
        return hasAllWithIteratorByArray(this.array, values,)
    }
    public hasAllWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean {
        return hasAllWithIterableByArray(this.array, values,)
    }
    public override hasAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
        return hasAllByArray(this.array, values,)
    }

    public hasNotAllWithArray(values: Nullable<readonly T[]>,): boolean {
        return hasNotAllWithArrayByArray(this.array, values,)
    }
    public hasNotAllWithSet(values: Nullable<ReadonlySet<T>>,): boolean {
        return hasNotAllWithSetByArray(this.array, values,)
    }
    public hasNotAllWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean {
        return hasNotAllWithCollectionHolderByArray(this.array, values,)
    }
    public hasNotAllWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
        return hasNotAllWithMinimalistCollectionHolderByArray(this.array, values,)
    }
    public hasNotAllWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean {
        return hasNotAllWithCollectionIteratorByArray(this.array, values,)
    }
    public hasNotAllWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean {
        return hasNotAllWithIteratorByArray(this.array, values,)
    }
    public hasNotAllWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean {
        return hasNotAllWithIterableByArray(this.array, values,)
    }
    public override hasNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
        return hasNotAllByArray(this.array, values,)
    }


    public override requireNoNulls(): CollectionHolder<NonNullable<T>> {
        const array = this.array
        if (requireNoNullsByArray(array,) === array)
            return this as CollectionHolder<NonNullable<T>>
        throw new Error("The method “requireNoNulls” was not expected to be non-empty.")
    }

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    public override filter<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filter(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filter(predicate: BooleanCallback<T>,) {
        return filterByArray(this.array, predicate,)
    }

    public override filterIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,) {
        return filterIndexedByArray(this.array, predicate,)
    }


    public override filterNot<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filterNot(predicate: BooleanCallback<T>,) {
        return filterNotByArray(this.array, predicate,)
    }

    public override filterNotIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,) {
        return filterNotIndexedByArray(this.array, predicate,)
    }


    public override filterNotNull(): CollectionHolder<NonNullable<T>> {
        return filterNotNullByArray(this.array,)
    }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Slice --------------------

    public sliceWithARange(from?: NullableNumber, to?: NullableNumber,): CollectionHolder<T> {
        return sliceWithARangeByArray(this.array, from, to,)
    }
    public sliceWithArray(indices: readonly number[],): CollectionHolder<T> {
        return sliceWithArrayByArray(this.array, indices,)
    }
    public sliceWithSet(indices: ReadonlySet<number>,): CollectionHolder<T> {
        return sliceWithSetByArray(this.array, indices,)
    }
    public sliceWithCollectionHolder(indices: CollectionHolder<number>,): CollectionHolder<T> {
        return sliceWithCollectionHolderByArray(this.array, indices,)
    }
    public sliceWithMinimalistCollectionHolder(indices: MinimalistCollectionHolder<number>,): CollectionHolder<T> {
        return sliceWithMinimalistCollectionHolderByArray(this.array, indices,)
    }
    public sliceWithCollectionIterator(indices: CollectionIterator<number>,): CollectionHolder<T> {
        return sliceWithCollectionIteratorByArray(this.array, indices,)
    }
    public sliceWithIterator(indices: Iterator<number, unknown, unknown>,): CollectionHolder<T> {
        return sliceWithIteratorByArray(this.array, indices,)
    }
    public sliceWithIterable(indices: Iterable<number, unknown, unknown>,): CollectionHolder<T> {
        return sliceWithIterableByArray(this.array, indices,)
    }
    public override slice(from?: NullableNumber, to?: NullableNumber,): CollectionHolder<T>
    public override slice(indices: PossibleIterableIteratorArraySetOrCollectionHolder<number>,): CollectionHolder<T>
    public override slice(indicesOrFrom?: Nullable<| PossibleIterableIteratorArraySetOrCollectionHolder<number> | number>, to?: NullableNumber,) {
        return sliceByArray(this.array, indicesOrFrom, to,)
    }

    //#endregion -------------------- Slice --------------------
    //#region -------------------- Take --------------------

    public override take(n: number,): CollectionHolder<T> {
        return takeByArray(this.array, n,)
    }

    public override takeWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override takeWhile(predicate: BooleanCallback<T>,) {
        return takeWhileByArray(this.array, predicate,)
    }

    public override takeWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return takeWhileIndexedByArray(this.array, predicate,)
    }


    public override takeLast(n: number,): CollectionHolder<T> {
        return takeLastByArray(this.array, n,)
    }

    public override takeLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override takeLastWhile(predicate: BooleanCallback<T>,) {
        return takeLastWhileByArray(this.array, predicate,)
    }

    public override takeLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return takeLastWhileIndexedByArray(this.array, predicate,)
    }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Drop --------------------

    public override drop(n: number,): CollectionHolder<T> {
        return dropByArray(this.array, n,)
    }

    public override dropWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override dropWhile(predicate: BooleanCallback<T>,) {
        return dropWhileByArray(this.array, predicate,)
    }

    public override dropWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return dropWhileIndexedByArray(this.array, predicate,)
    }


    public override dropLast(n: number,): CollectionHolder<T> {
        return dropLastByArray(this.array, n,)
    }

    public override dropLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override dropLastWhile(predicate: BooleanCallback<T>,) {
        return dropLastWhileByArray(this.array, predicate,)
    }

    public override dropLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return dropLastWhileIndexedByArray(this.array, predicate,)
    }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Map --------------------

    public override map<const U, >(transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U> {
        return mapByArray(this.array, transform,)
    }

    public override mapIndexed<const U, >(transform: IndexValueWithReturnCallback<T, U>,): CollectionHolder<U> {
        return mapIndexedByArray(this.array, transform,)
    }


    public override mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNullByArray(this.array, transform,)
    }

    public override mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNullIndexedByArray(this.array, transform,)
    }

    //#endregion -------------------- Map --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    public override forEach(action: ValueIndexCallback<T>,): void {
        forEachByArray(this.array, action,)
    }

    public override forEachIndexed(action: IndexValueCallback<T>,): void {
        forEachIndexedByArray(this.array, action,)
    }


    public override onEach(action: ValueIndexCallback<T>,): this {
        onEachByArray(this.array, action,)
        return this
    }

    public override onEachIndexed(action: IndexValueCallback<T>,): this {
        onEachIndexedByArray(this.array, action,)
        return this
    }

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    public override toReverse(from?: NullableNumber, to?: NullableNumber,): CollectionHolder<T> {
        return toReverseByArray(this.array, from, to,)
    }

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- JavaScript methods --------------------

    public override [Symbol.iterator](): CollectionIterator<T> {
        return toIteratorByArray(this.array,)
    }

    //#endregion -------------------- JavaScript methods --------------------
    //#region -------------------- Conversion methods --------------------

    public override toArray(): readonly T[] {
        return toArrayByArray(this.array,)
    }
    public override toMutableArray(): T[] {
        return toMutableArrayByArray(this.array,)
    }

    public override toSet(): ReadonlySet<T> {
        return toSetByArray(this.array,)
    }
    public override toMutableSet(): Set<T> {
        return toMutableSetByArray(this.array,)
    }

    public override toMap(): ReadonlyMap<number, T> {
        return toMapByArray(this.array,)
    }
    public override toMutableMap(): Map<number, T> {
        return toMutableMapByArray(this.array,)
    }

    public override toString(): string {
        return toStringByArray(this.array,)
    }
    public override toLocaleString(locale?: NullableString,): string {
        return toLocaleStringByArray(this.array, locale,)
    }
    public override toLowerCaseString(): string {
        return toLowerCaseStringByArray(this.array,)
    }
    public override toLocaleLowerCaseString(locale?: NullableString,): string {
        return toLocaleLowerCaseStringByArray(this.array, locale,)
    }
    public override toUpperCaseString(): string {
        return toUpperCaseStringByArray(this.array,)
    }
    public override toLocaleUpperCaseString(locale?: NullableString,): string {
        return toLocaleUpperCaseStringByArray(this.array, locale,)
    }

    public override joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string {
        return joinToStringByArray(this.array, separator, prefix, postfix, limit, truncated, transform,)
    }

    //#endregion -------------------- Conversion methods --------------------

}

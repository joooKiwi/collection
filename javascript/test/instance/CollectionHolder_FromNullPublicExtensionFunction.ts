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

import {all}                                     from "../../src/method/all"
import {any}                                     from "../../src/method/any"
import {drop}                                    from "../../src/method/drop"
import {dropLast}                                from "../../src/method/dropLast"
import {dropLastWhile}                           from "../../src/method/dropLastWhile"
import {dropLastWhileIndexed}                    from "../../src/method/dropLastWhileIndexed"
import {dropWhile}                               from "../../src/method/dropWhile"
import {dropWhileIndexed}                        from "../../src/method/dropWhileIndexed"
import {filter}                                  from "../../src/method/filter"
import {filterIndexed}                           from "../../src/method/filterIndexed"
import {filterNot}                               from "../../src/method/filterNot"
import {filterNotIndexed}                        from "../../src/method/filterNotIndexed"
import {filterNotNull}                           from "../../src/method/filterNotNull"
import {findFirst}                               from "../../src/method/findFirst"
import {findFirstIndexed}                        from "../../src/method/findFirstIndexed"
import {findFirstIndexedOrNull}                  from "../../src/method/findFirstIndexedOrNull"
import {findFirstOrNull}                         from "../../src/method/findFirstOrNull"
import {findLast}                                from "../../src/method/findLast"
import {findLastIndexed}                         from "../../src/method/findLastIndexed"
import {findLastIndexedOrNull}                   from "../../src/method/findLastIndexedOrNull"
import {findLastOrNull}                          from "../../src/method/findLastOrNull"
import {forEach}                                 from "../../src/method/forEach"
import {forEachIndexed}                          from "../../src/method/forEachIndexed"
import {firstIndexOf}                            from "../../src/method/firstIndexOf"
import {firstIndexOfOrNull}                      from "../../src/method/firstIndexOfOrNull"
import {getFirst}                                from "../../src/method/getFirst"
import {getFirstOrElse}                          from "../../src/method/getFirstOrElse"
import {getFirstOrNull}                          from "../../src/method/getFirstOrNull"
import {getLast}                                 from "../../src/method/getLast"
import {getLastOrElse}                           from "../../src/method/getLastOrElse"
import {getLastOrNull}                           from "../../src/method/getLastOrNull"
import {getOrElse}                               from "../../src/method/getOrElse"
import {getOrNull}                               from "../../src/method/getOrNull"
import {has}                                     from "../../src/method/has"
import {hasAll}                                  from "../../src/method/hasAll"
import {hasAllWithArray}                         from "../../src/method/hasAll.withArray"
import {hasAllWithCollectionHolder}              from "../../src/method/hasAll.withCollectionHolder"
import {hasAllWithCollectionIterator}            from "../../src/method/hasAll.withCollectionIterator"
import {hasAllWithIterable}                      from "../../src/method/hasAll.withIterable"
import {hasAllWithIterator}                      from "../../src/method/hasAll.withIterator"
import {hasAllWithMinimalistCollectionHolder}    from "../../src/method/hasAll.withMinimalistCollectionHolder"
import {hasAllWithSet}                           from "../../src/method/hasAll.withSet"
import {hasDuplicate}                            from "../../src/method/hasDuplicate"
import {hasNoDuplicates}                         from "../../src/method/hasNoDuplicates"
import {hasNoNulls}                              from "../../src/method/hasNoNulls"
import {hasNot}                                  from "../../src/method/hasNot"
import {hasNotAll}                               from "../../src/method/hasNotAll"
import {hasNotAllWithArray}                      from "../../src/method/hasNotAll.withArray"
import {hasNotAllWithCollectionHolder}           from "../../src/method/hasNotAll.withCollectionHolder"
import {hasNotAllWithCollectionIterator}         from "../../src/method/hasNotAll.withCollectionIterator"
import {hasNotAllWithIterable}                   from "../../src/method/hasNotAll.withIterable"
import {hasNotAllWithIterator}                   from "../../src/method/hasNotAll.withIterator"
import {hasNotAllWithMinimalistCollectionHolder} from "../../src/method/hasNotAll.withMinimalistCollectionHolder"
import {hasNotAllWithSet}                        from "../../src/method/hasNotAll.withSet"
import {hasNotOne}                               from "../../src/method/hasNotOne"
import {hasNotOneWithArray}                      from "../../src/method/hasNotOne.withArray"
import {hasNotOneWithCollectionHolder}           from "../../src/method/hasNotOne.withCollectionHolder"
import {hasNotOneWithCollectionIterator}         from "../../src/method/hasNotOne.withCollectionIterator"
import {hasNotOneWithIterable}                   from "../../src/method/hasNotOne.withIterable"
import {hasNotOneWithIterator}                   from "../../src/method/hasNotOne.withIterator"
import {hasNotOneWithMinimalistCollectionHolder} from "../../src/method/hasNotOne.withMinimalistCollectionHolder"
import {hasNotOneWithSet}                        from "../../src/method/hasNotOne.withSet"
import {hasNull}                                 from "../../src/method/hasNull"
import {hasOne}                                  from "../../src/method/hasOne"
import {hasOneWithArray}                         from "../../src/method/hasOne.withArray"
import {hasOneWithCollectionHolder}              from "../../src/method/hasOne.withCollectionHolder"
import {hasOneWithCollectionIterator}            from "../../src/method/hasOne.withCollectionIterator"
import {hasOneWithIterable}                      from "../../src/method/hasOne.withIterable"
import {hasOneWithIterator}                      from "../../src/method/hasOne.withIterator"
import {hasOneWithMinimalistCollectionHolder}    from "../../src/method/hasOne.withMinimalistCollectionHolder"
import {hasOneWithSet}                           from "../../src/method/hasOne.withSet"
import {indexOfFirst}                            from "../../src/method/indexOfFirst"
import {indexOfFirstIndexed}                     from "../../src/method/indexOfFirstIndexed"
import {indexOfFirstIndexedOrNull}               from "../../src/method/indexOfFirstIndexedOrNull"
import {indexOfFirstOrNull}                      from "../../src/method/indexOfFirstOrNull"
import {indexOfLast}                             from "../../src/method/indexOfLast"
import {indexOfLastIndexed}                      from "../../src/method/indexOfLastIndexed"
import {indexOfLastIndexedOrNull}                from "../../src/method/indexOfLastIndexedOrNull"
import {indexOfLastOrNull}                       from "../../src/method/indexOfLastOrNull"
import {isEmpty}                                 from "../../src/method/isEmpty"
import {isNotEmpty}                              from "../../src/method/isNotEmpty"
import {joinToString}                            from "../../src/method/joinToString"
import {lastIndexOf}                             from "../../src/method/lastIndexOf"
import {lastIndexOfOrNull}                       from "../../src/method/lastIndexOfOrNull"
import {none}                                    from "../../src/method/none"
import {map}                                     from "../../src/method/map"
import {mapIndexed}                              from "../../src/method/mapIndexed"
import {mapNotNull}                              from "../../src/method/mapNotNull"
import {mapNotNullIndexed}                       from "../../src/method/mapNotNullIndexed"
import {onEach}                                  from "../../src/method/onEach"
import {onEachIndexed}                           from "../../src/method/onEachIndexed"
import {requireNoNulls}                          from "../../src/method/requireNoNulls"
import {slice}                                   from "../../src/method/slice"
import {take}                                    from "../../src/method/take"
import {takeLast}                                from "../../src/method/takeLast"
import {takeLastWhile}                           from "../../src/method/takeLastWhile"
import {takeLastWhileIndexed}                    from "../../src/method/takeLastWhileIndexed"
import {takeWhile}                               from "../../src/method/takeWhile"
import {takeWhileIndexed}                        from "../../src/method/takeWhileIndexed"
import {toArray}                                 from "../../src/method/toArray"
import {toIterator}                              from "../../src/method/toIterator"
import {toLocaleLowerCaseString}                 from "../../src/method/toLocaleLowerCaseString"
import {toLocaleString}                          from "../../src/method/toLocaleString"
import {toLocaleUpperCaseString}                 from "../../src/method/toLocaleUpperCaseString"
import {toLowerCaseString}                       from "../../src/method/toLowerCaseString"
import {toMap}                                   from "../../src/method/toMap"
import {toMutableArray}                          from "../../src/method/toMutableArray"
import {toMutableMap}                            from "../../src/method/toMutableMap"
import {toMutableSet}                            from "../../src/method/toMutableSet"
import {toReverse}                               from "../../src/method/toReverse"
import {toSet}                                   from "../../src/method/toSet"
import {toString}                                from "../../src/method/toString"
import {toUpperCaseString}                       from "../../src/method/toUpperCaseString"
import {AbstractNullCollectionHolderForTest}     from "./AbstractNullCollectionHolderForTest"

/** A test instance to exclusively test the extension methods for a `null` {@link CollectionHolder}|{@link MinimalistCollectionHolder}|{@link ReadonlyArray Array} */
export class CollectionHolder_FromNullPublicExtensionFunction<const T, >
    extends AbstractNullCollectionHolderForTest<T> {

    //#region -------------------- Size methods --------------------

    public get isEmpty(): boolean {
        return isEmpty(null,)
    }

    public get isNotEmpty(): boolean {
        return isNotEmpty(null,)
    }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    public override getFirst(): T {
        return getFirst(null,)
    }

    public override getLast(): T {
        return getLast(null,)
    }

    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) {
        return getOrElse(null, index, defaultValue,)
    }

    public override getFirstOrElse<const U, >(defaultValue: ReturnCallback<U>,): | T | U
    public override getFirstOrElse(defaultValue: ReturnCallback<T>,): T
    public override getFirstOrElse(defaultValue: ReturnCallback<unknown>,) { return getFirstOrElse(null, defaultValue,) }

    public override getLastOrElse<const U, >(defaultValue: ReturnCallback<U>,): | T | U
    public override getLastOrElse(defaultValue: ReturnCallback<T>,): T
    public override getLastOrElse(defaultValue: ReturnCallback<unknown>,) { return getLastOrElse(null, defaultValue,) }

    public override getOrNull(index: number,): NullOr<T> {
        return getOrNull(null, index,)
    }

    public override getFirstOrNull(): NullOr<T> {
        return getFirstOrNull(null,)
    }

    public override getLastOrNull(): NullOr<T> {
        return getLastOrNull(null,)
    }

    //#endregion -------------------- Get --------------------
    //#region -------------------- Find --------------------

    public override findFirst<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public override findFirst(predicate: BooleanCallback<T>,): T
    public override findFirst(predicate: BooleanCallback<T>,) {
        return findFirst(null, predicate,)
    }

    public override findFirstOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findFirstOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public override findFirstOrNull(predicate: BooleanCallback<T>,) {
        return findFirstOrNull(null, predicate,)
    }

    public override findFirstIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public override findFirstIndexed(predicate: ReverseBooleanCallback<T>,): T
    public override findFirstIndexed(predicate: ReverseBooleanCallback<T>,) {
        return findFirstIndexed(null, predicate,)
    }

    public override findFirstIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,) {
        return findFirstIndexedOrNull(null, predicate,)
    }


    public override findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public override findLast(predicate: BooleanCallback<T>,): T
    public override findLast(predicate: BooleanCallback<T>,) {
        return findLast(null, predicate,)
    }

    public override findLastOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public override findLastOrNull(predicate: BooleanCallback<T>,) {
        return findLastOrNull(null, predicate,)
    }

    public override findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,): T
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,) {
        return findLastIndexed(null, predicate,)
    }

    public override findLastIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,) {
        return findLastIndexedOrNull(null, predicate,)
    }

    //#endregion -------------------- Find --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    public override firstIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,): number {
        return firstIndexOf(null, element, from, to,)
    }

    public override firstIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return firstIndexOfOrNull(null, element, from, to,)
    }



    public override lastIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,): number {
        return lastIndexOf(null, element, from, to,)
    }

    public override lastIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return lastIndexOfOrNull(null, element, from, to,)
    }


    public override indexOfFirst(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return indexOfFirst(null, predicate, from, to,)
    }

    public override indexOfFirstOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return indexOfFirstOrNull(null, predicate, from, to,)
    }

    public override indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return indexOfFirstIndexed(null, predicate, from, to,)
    }

    public override indexOfFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return indexOfFirstIndexedOrNull(null, predicate, from, to,)
    }


    public override indexOfLast(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return indexOfLast(null, predicate, from, to,)
    }

    public override indexOfLastOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return indexOfLastOrNull(null, predicate, from, to,)
    }

    public override indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return indexOfLastIndexed(null, predicate, from, to,)
    }

    public override indexOfLastIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return indexOfLastIndexedOrNull(null, predicate, from, to,)
    }

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    public override all<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolder<S>
    public override all(predicate: BooleanCallback<T>,): boolean
    public override all(predicate: BooleanCallback<T>,) {
        return all(null, predicate,)
    }

    public override any(): this["isNotEmpty"]
    public override any(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override any(predicate?: Nullable<BooleanCallback<T>>,) {
        return any(null, predicate,)
    }

    public override none(): this["isEmpty"]
    public override none(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override none(predicate?: Nullable<BooleanCallback<T>>,) {
        return none(null, predicate,)
    }


    public override get hasNull(): boolean {
        return hasNull(null,)
    }

    public override get hasNoNulls(): boolean {
        return hasNoNulls(null,)
    }


    public override get hasDuplicate(): boolean {
        return hasDuplicate(null,)
    }

    public override get hasNoDuplicates(): boolean {
        return hasNoDuplicates(null,)
    }


    public override has(value: T,): boolean {
        return has(null, value,)
    }

    public override hasNot(value: T,): boolean {
        return hasNot(null, value,)
    }

    public override hasOneWithArray(values: Nullable<readonly T[]>,): boolean {
        return hasOneWithArray(null, values,)
    }
    public override hasOneWithSet(values: Nullable<ReadonlySet<T>>,): boolean {
        return hasOneWithSet(null, values,)
    }
    public override hasOneWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean {
        return hasOneWithCollectionHolder(null, values,)
    }
    public override hasOneWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
        return hasOneWithMinimalistCollectionHolder(null, values,)
    }
    public override hasOneWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean {
        return hasOneWithCollectionIterator(null, values,)
    }
    public override hasOneWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean {
        return hasOneWithIterator(null, values,)
    }
    public override hasOneWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean {
        return hasOneWithIterable(null, values,)
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
        return hasOne(null, values,)
    }

    public override hasNotOneWithArray(values: Nullable<readonly T[]>,): boolean {
        return hasNotOneWithArray(null, values,)
    }
    public override hasNotOneWithSet(values: Nullable<ReadonlySet<T>>,): boolean {
        return hasNotOneWithSet(null, values,)
    }
    public override hasNotOneWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean {
        return hasNotOneWithCollectionHolder(null, values,)
    }
    public override hasNotOneWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
        return hasNotOneWithMinimalistCollectionHolder(null, values,)
    }
    public override hasNotOneWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean {
        return hasNotOneWithCollectionIterator(null, values,)
    }
    public override hasNotOneWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean {
        return hasNotOneWithIterator(null, values,)
    }
    public override hasNotOneWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean {
        return hasNotOneWithIterable(null, values,)
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
        return hasNotOne(null, values,)
    }

    public override hasAllWithArray(values: Nullable<readonly T[]>,): boolean {
        return hasAllWithArray(null, values,)
    }
    public override hasAllWithSet(values: Nullable<ReadonlySet<T>>,): boolean {
        return hasAllWithSet(null, values,)
    }
    public override hasAllWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean {
        return hasAllWithCollectionHolder(null, values,)
    }
    public override hasAllWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
        return hasAllWithMinimalistCollectionHolder(null, values,)
    }
    public override hasAllWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean {
        return hasAllWithCollectionIterator(null, values,)
    }
    public override hasAllWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean {
        return hasAllWithIterator(null, values,)
    }
    public override hasAllWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean {
        return hasAllWithIterable(null, values,)
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
        return hasAll(null, values,)
    }

    public override hasNotAllWithArray(values: Nullable<readonly T[]>,): boolean {
        return hasNotAllWithArray(null, values,)
    }
    public override hasNotAllWithSet(values: Nullable<ReadonlySet<T>>,): boolean {
        return hasNotAllWithSet(null, values,)
    }
    public override hasNotAllWithCollectionHolder(values: Nullable<CollectionHolder<T>>,): boolean {
        return hasNotAllWithCollectionHolder(null, values,)
    }
    public override hasNotAllWithMinimalistCollectionHolder(values: Nullable<MinimalistCollectionHolder<T>>,): boolean {
        return hasNotAllWithMinimalistCollectionHolder(null, values,)
    }
    public override hasNotAllWithCollectionIterator(values: Nullable<CollectionIterator<T>>,): boolean {
        return hasNotAllWithCollectionIterator(null, values,)
    }
    public override hasNotAllWithIterator(values: Nullable<Iterator<T, unknown, unknown>>,): boolean {
        return hasNotAllWithIterator(null, values,)
    }
    public override hasNotAllWithIterable(values: Nullable<Iterable<T, unknown, unknown>>,): boolean {
        return hasNotAllWithIterable(null, values,)
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
        return hasNotAll(null, values,)
    }


    public override requireNoNulls(): CollectionHolder<NonNullable<T>> {
        if (requireNoNulls(null,) === null)
            return this as CollectionHolder<NonNullable<T>>
        throw new Error("The method “requireNoNulls” was not expected to be non-empty.",)
    }

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    public override filter<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filter(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filter(predicate: BooleanCallback<T>,) {
        return filter(null, predicate,)
    }

    public override filterIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,) {
        return filterIndexed(null, predicate,)
    }


    public override filterNot<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filterNot(predicate: BooleanCallback<T>,) {
        return filterNot(null, predicate,)
    }

    public override filterNotIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,) {
        return filterNotIndexed(null, predicate,)
    }


    public override filterNotNull(): CollectionHolder<NonNullable<T>> {
        return filterNotNull(null,)
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
        return slice(null, indicesOrFrom, to,)
    }

    //#endregion -------------------- Slice --------------------
    //#region -------------------- Take --------------------

    public override take(n: number,): CollectionHolder<T> {
        return take(null, n,)
    }

    public override takeWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override takeWhile(predicate: BooleanCallback<T>,) {
        return takeWhile(null, predicate,)
    }

    public override takeWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return takeWhileIndexed(null, predicate,)
    }


    public override takeLast(n: number,): CollectionHolder<T> {
        return takeLast(null, n,)
    }

    public override takeLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override takeLastWhile(predicate: BooleanCallback<T>,) {
        return takeLastWhile(null, predicate,)
    }

    public override takeLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return takeLastWhileIndexed(null, predicate,)
    }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Drop --------------------

    public override drop(n: number,): CollectionHolder<T> {
        return drop(null, n,)
    }

    public override dropWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override dropWhile(predicate: BooleanCallback<T>,) {
        return dropWhile(null, predicate,)
    }

    public override dropWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return dropWhileIndexed(null, predicate,)
    }


    public override dropLast(n: number,): CollectionHolder<T> {
        return dropLast(null, n,)
    }

    public override dropLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override dropLastWhile(predicate: BooleanCallback<T>,) {
        return dropLastWhile(null, predicate,)
    }

    public override dropLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return dropLastWhileIndexed(null, predicate,)
    }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Map --------------------

    public override map<const U, >(transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U> {
        return map(null, transform,)
    }

    public override mapIndexed<const U, >(transform: IndexValueWithReturnCallback<T, U>,): CollectionHolder<U> {
        return mapIndexed(null, transform,)
    }


    public override mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNull(null, transform,)
    }

    public override mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNullIndexed(null, transform,)
    }

    //#endregion -------------------- Map --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    public override forEach(action: ValueIndexCallback<T>,): void {
        forEach(null, action,)
    }

    public override forEachIndexed(action: IndexValueCallback<T>,): void {
        forEachIndexed(null, action,)
    }

    public override onEach(action: ValueIndexCallback<T>,): this {
        onEach(null, action,)
        return this
    }

    public override onEachIndexed(action: IndexValueCallback<T>,): this {
        onEachIndexed(null, action,)
        return this
    }

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    public override toReverse(from?: NullableNumber, to?: NullableNumber,): CollectionHolder<T> {
        return toReverse(null, from, to,)
    }

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- JavaScript methods --------------------

    public override [Symbol.iterator](): CollectionIterator<T> {
        return toIterator(null,)
    }

    //#endregion -------------------- JavaScript methods --------------------
    //#region -------------------- Conversion methods --------------------

    public override toArray(): readonly T[] {
        return toArray(null,)
    }
    public override toMutableArray(): T[] {
        return toMutableArray(null,)
    }

    public override toSet(): ReadonlySet<T> {
        return toSet(null,)
    }
    public override toMutableSet(): Set<T> {
        return toMutableSet(null,)
    }

    public override toMap(): ReadonlyMap<number, T> {
        return toMap(null,)
    }
    public override toMutableMap(): Map<number, T> {
        return toMutableMap(null,)
    }

    public override toString(): string {
        return toString(null,)
    }
    public override toLocaleString(locale?: NullableString,): string {
        return toLocaleString(null, locale,)
    }
    public override toLowerCaseString(): string {
        return toLowerCaseString(null,)
    }
    public override toLocaleLowerCaseString(locale?: NullableString,): string {
        return toLocaleLowerCaseString(null, locale,)
    }
    public override toUpperCaseString(): string {
        return toUpperCaseString(null,)
    }
    public override toLocaleUpperCaseString(locale?: NullableString,): string {
        return toLocaleUpperCaseString(null, locale,)
    }

    public override joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string {
        return joinToString(null, separator, prefix, postfix, limit, truncated, transform,)
    }

    //#endregion -------------------- Conversion methods --------------------

}

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

import type {Array, MutableArray, MutableNumberKeyMap, MutableSet, Nullable, NullableNumber, NullableString, NullOr, NullOrNumber, NullOrUndefined, NumberArray, NumberKeyMap, NumberSet, Set} from "@joookiwi/type"

import type {CollectionHolder}                                                                                                                                                                                                                                                  from "./CollectionHolder"
import type {MinimalistCollectionHolder}                                                                                                                                                                                                                                        from "./MinimalistCollectionHolder"
import type {CollectionIterator}                                                                                                                                                                                                                                                from "./iterator/CollectionIterator"
import type {BooleanCallback, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, RestrainedBooleanCallback, ReturnCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, StringCallback, ValueIndexCallback, ValueIndexWithReturnCallback} from "./type/callback"
import type {PossibleIterableIteratorArraySetOrCollectionHolder}                                                                                                                                                                                                                from "./type/possibleInstance"

import {AbstractUnimplementedCollectionHolder}                     from "./AbstractUnimplementedCollectionHolder"
import {allByCollectionHolder}                                     from "./method/all"
import {anyByCollectionHolder}                                     from "./method/any"
import {dropByCollectionHolder}                                    from "./method/drop"
import {dropLastByCollectionHolder}                                from "./method/dropLast"
import {dropLastWhileByCollectionHolder}                           from "./method/dropLastWhile"
import {dropLastWhileIndexedByCollectionHolder}                    from "./method/dropLastWhileIndexed"
import {dropWhileByCollectionHolder}                               from "./method/dropWhile"
import {dropWhileIndexedByCollectionHolder}                        from "./method/dropWhileIndexed"
import {filterByCollectionHolder}                                  from "./method/filter"
import {filterIndexedByCollectionHolder}                           from "./method/filterIndexed"
import {filterNotByCollectionHolder}                               from "./method/filterNot"
import {filterNotIndexedByCollectionHolder}                        from "./method/filterNotIndexed"
import {filterNotNullByCollectionHolder}                           from "./method/filterNotNull"
import {findFirstByCollectionHolder}                               from "./method/findFirst"
import {findFirstIndexedByCollectionHolder}                        from "./method/findFirstIndexed"
import {findFirstIndexedOrNullByCollectionHolder}                  from "./method/findFirstIndexedOrNull"
import {findFirstOrNullByCollectionHolder}                         from "./method/findFirstOrNull"
import {findLastByCollectionHolder}                                from "./method/findLast"
import {findLastIndexedByCollectionHolder}                         from "./method/findLastIndexed"
import {findLastIndexedOrNullByCollectionHolder}                   from "./method/findLastIndexedOrNull"
import {findLastOrNullByCollectionHolder}                          from "./method/findLastOrNull"
import {firstIndexOfByCollectionHolder}                            from "./method/firstIndexOf"
import {firstIndexOfOrNullByCollectionHolder}                      from "./method/firstIndexOfOrNull"
import {forEachByCollectionHolder}                                 from "./method/forEach"
import {forEachIndexedByCollectionHolder}                          from "./method/forEachIndexed"
import {getFirstByCollectionHolder}                                from "./method/getFirst"
import {getFirstOrElseByCollectionHolder}                          from "./method/getFirstOrElse"
import {getFirstOrNullByCollectionHolder}                          from "./method/getFirstOrNull"
import {getLastByCollectionHolder}                                 from "./method/getLast"
import {getLastOrNullByCollectionHolder}                           from "./method/getLastOrNull"
import {getLastOrElseByCollectionHolder}                           from "./method/getLastOrElse"
import {getOrElseByCollectionHolder}                               from "./method/getOrElse"
import {getOrNullByCollectionHolder}                               from "./method/getOrNull"
import {hasByCollectionHolder}                                     from "./method/has"
import {hasAllWithArrayByCollectionHolder}                         from "./method/hasAll.withArray"
import {hasAllWithCollectionHolderByCollectionHolder}              from "./method/hasAll.withCollectionHolder"
import {hasAllWithCollectionIteratorByCollectionHolder}            from "./method/hasAll.withCollectionIterator"
import {hasAllWithIterableByCollectionHolder}                      from "./method/hasAll.withIterable"
import {hasAllWithIteratorByCollectionHolder}                      from "./method/hasAll.withIterator"
import {hasAllWithMinimalistCollectionHolderByCollectionHolder}    from "./method/hasAll.withMinimalistCollectionHolder"
import {hasAllWithSetByCollectionHolder}                           from "./method/hasAll.withSet"
import {hasAtLeast2ElementsByCollectionHolder}                     from "./method/hasAtLeast2Elements"
import {hasAtMost1ElementByCollectionHolder}                       from "./method/hasAtMost1Element"
import {hasAtMost2ElementsByCollectionHolder}                      from "./method/hasAtMost2Elements"
import {hasDuplicateByCollectionHolder}                            from "./method/hasDuplicate"
import {hasExactly1ElementByCollectionHolder}                      from "./method/hasExactly1Element"
import {hasExactly2ElementsByCollectionHolder}                     from "./method/hasExactly2Elements"
import {hasNoDuplicatesByCollectionHolder}                         from "./method/hasNoDuplicates"
import {hasNoNullsByCollectionHolder}                              from "./method/hasNoNulls"
import {hasNotByCollectionHolder}                                  from "./method/hasNot"
import {hasNotAllWithArrayByCollectionHolder}                      from "./method/hasNotAll.withArray"
import {hasNotAllWithCollectionHolderByCollectionHolder}           from "./method/hasNotAll.withCollectionHolder"
import {hasNotAllWithCollectionIteratorByCollectionHolder}         from "./method/hasNotAll.withCollectionIterator"
import {hasNotAllWithIterableByCollectionHolder}                   from "./method/hasNotAll.withIterable"
import {hasNotAllWithIteratorByCollectionHolder}                   from "./method/hasNotAll.withIterator"
import {hasNotAllWithMinimalistCollectionHolderByCollectionHolder} from "./method/hasNotAll.withMinimalistCollectionHolder"
import {hasNotAllWithSetByCollectionHolder}                        from "./method/hasNotAll.withSet"
import {hasNotOneWithArrayByCollectionHolder}                      from "./method/hasNotOne.withArray"
import {hasNotOneWithCollectionHolderByCollectionHolder}           from "./method/hasNotOne.withCollectionHolder"
import {hasNotOneWithCollectionIteratorByCollectionHolder}         from "./method/hasNotOne.withCollectionIterator"
import {hasNotOneWithIterableByCollectionHolder}                   from "./method/hasNotOne.withIterable"
import {hasNotOneWithIteratorByCollectionHolder}                   from "./method/hasNotOne.withIterator"
import {hasNotOneWithMinimalistCollectionHolderByCollectionHolder} from "./method/hasNotOne.withMinimalistCollectionHolder"
import {hasNotOneWithSetByCollectionHolder}                        from "./method/hasNotOne.withSet"
import {hasNullByCollectionHolder}                                 from "./method/hasNull"
import {hasOneWithArrayByCollectionHolder}                         from "./method/hasOne.withArray"
import {hasOneWithCollectionHolderByCollectionHolder}              from "./method/hasOne.withCollectionHolder"
import {hasOneWithCollectionIteratorByCollectionHolder}            from "./method/hasOne.withCollectionIterator"
import {hasOneWithIterableByCollectionHolder}                      from "./method/hasOne.withIterable"
import {hasOneWithIteratorByCollectionHolder}                      from "./method/hasOne.withIterator"
import {hasOneWithMinimalistCollectionHolderByCollectionHolder}    from "./method/hasOne.withMinimalistCollectionHolder"
import {hasOneWithSetByCollectionHolder}                           from "./method/hasOne.withSet"
import {indexOfFirstByCollectionHolder}                            from "./method/indexOfFirst"
import {indexOfFirstOrNullByCollectionHolder}                      from "./method/indexOfFirstOrNull"
import {indexOfFirstIndexedByCollectionHolder}                     from "./method/indexOfFirstIndexed"
import {indexOfFirstIndexedOrNullByCollectionHolder}               from "./method/indexOfFirstIndexedOrNull"
import {indexOfLastByCollectionHolder}                             from "./method/indexOfLast"
import {indexOfLastOrNullByCollectionHolder}                       from "./method/indexOfLastOrNull"
import {indexOfLastIndexedByCollectionHolder}                      from "./method/indexOfLastIndexed"
import {indexOfLastIndexedOrNullByCollectionHolder}                from "./method/indexOfLastIndexedOrNull"
import {isArrayByStructure}                                        from "./method/isArrayByStructure"
import {isCollectionHolder}                                        from "./method/isCollectionHolder"
import {isCollectionHolderByStructure}                             from "./method/isCollectionHolderByStructure"
import {isCollectionIterator}                                      from "./method/isCollectionIterator"
import {isCollectionIteratorByStructure}                           from "./method/isCollectionIteratorByStructure"
import {isIteratorByStructure}                                     from "./method/isIteratorByStructure"
import {isMinimalistCollectionHolder}                              from "./method/isMinimalistCollectionHolder"
import {isMinimalistCollectionHolderByStructure}                   from "./method/isMinimalistCollectionHolderByStructure"
import {isEmptyByCollectionHolder}                                 from "./method/isEmpty"
import {isNotEmptyByCollectionHolder}                              from "./method/isNotEmpty"
import {isSetByStructure}                                          from "./method/isSetByStructure"
import {joinToStringByCollectionHolder}                            from "./method/joinToString"
import {lastIndexOfByCollectionHolder}                             from "./method/lastIndexOf"
import {lastIndexOfOrNullByCollectionHolder}                       from "./method/lastIndexOfOrNull"
import {noneByCollectionHolder}                                    from "./method/none"
import {mapByCollectionHolder}                                     from "./method/map"
import {mapIndexedByCollectionHolder}                              from "./method/mapIndexed"
import {mapNotNullByCollectionHolder}                              from "./method/mapNotNull"
import {mapNotNullIndexedByCollectionHolder}                       from "./method/mapNotNullIndexed"
import {onEachByCollectionHolder}                                  from "./method/onEach"
import {onEachIndexedByCollectionHolder}                           from "./method/onEachIndexed"
import {requireNoNullsByCollectionHolder}                          from "./method/requireNoNulls"
import {sliceWithARangeByCollectionHolder}                         from "./method/slice.withARange"
import {sliceWithArrayByCollectionHolder}                          from "./method/slice.withArray"
import {sliceWithCollectionHolderByCollectionHolder}               from "./method/slice.withCollectionHolder"
import {sliceWithCollectionIteratorByCollectionHolder}             from "./method/slice.withCollectionIterator"
import {sliceWithIterableByCollectionHolder}                       from "./method/slice.withIterable"
import {sliceWithIteratorByCollectionHolder}                       from "./method/slice.withIterator"
import {sliceWithMinimalistCollectionHolderByCollectionHolder}     from "./method/slice.withMinimalistCollectionHolder"
import {sliceWithSetByCollectionHolder}                            from "./method/slice.withSet"
import {takeByCollectionHolder}                                    from "./method/take"
import {takeLastByCollectionHolder}                                from "./method/takeLast"
import {takeLastWhileByCollectionHolder}                           from "./method/takeLastWhile"
import {takeLastWhileIndexedByCollectionHolder}                    from "./method/takeLastWhileIndexed"
import {takeWhileByCollectionHolder}                               from "./method/takeWhile"
import {takeWhileIndexedByCollectionHolder}                        from "./method/takeWhileIndexed"
import {toArrayByCollectionHolder}                                 from "./method/toArray"
import {toIteratorByCollectionHolder}                              from "./method/toIterator"
import {toLocaleLowerCaseStringByCollectionHolder}                 from "./method/toLocaleLowerCaseString"
import {toLocaleStringByCollectionHolder}                          from "./method/toLocaleString"
import {toLocaleUpperCaseStringByCollectionHolder}                 from "./method/toLocaleUpperCaseString"
import {toLowerCaseStringByCollectionHolder}                       from "./method/toLowerCaseString"
import {toMapByCollectionHolder}                                   from "./method/toMap"
import {toMutableArrayByCollectionHolder}                          from "./method/toMutableArray"
import {toMutableMapByCollectionHolder}                            from "./method/toMutableMap"
import {toMutableSetByCollectionHolder}                            from "./method/toMutableSet"
import {toReverseByCollectionHolder}                               from "./method/toReverse"
import {toSetByCollectionHolder}                                   from "./method/toSet"
import {toStringByCollectionHolder}                                from "./method/toString"
import {toUpperCaseStringByCollectionHolder}                       from "./method/toUpperCaseString"

/**
 * A definition of a {@link CollectionHolder} to have a common ancestor.
 * No state or reference is held in this instance.
 * It only uses the extension function for the method implementations.
 *
 * @apiNote This class is used to help reduce the complexity when needed and calling its generic {@link CollectionHolder} extension method if applicable
 * @typeParam T The type
 * @see AbstractCollectionHolderOf1
 * @see AbstractCollectionHolderOf2
 * @see EmptyCollectionHolder
 * @see ArrayAsCollectionHolder
 * @see SetAsCollectionHolder
 * @see GenericCollectionHolder
 * @see LazyCollectionHolder
 */
export abstract class AbstractCollectionHolder<const T = unknown, >
    extends AbstractUnimplementedCollectionHolder<T> {

    //#region -------------------- Constructor --------------------

    protected constructor() { super() }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Size methods --------------------

    public override get isEmpty(): boolean { return isEmptyByCollectionHolder(this,) }

    public override get isNotEmpty(): boolean { return isNotEmptyByCollectionHolder(this,) }

    public override get hasExactly1Element(): boolean { return hasExactly1ElementByCollectionHolder(this,) }
    public override get hasAtMost1Element(): boolean { return hasAtMost1ElementByCollectionHolder(this,) }

    public override get hasAtLeast2Elements(): boolean { return hasAtLeast2ElementsByCollectionHolder(this,) }
    public override get hasExactly2Elements(): boolean { return hasExactly2ElementsByCollectionHolder(this,) }
    public override get hasAtMost2Elements(): boolean { return hasAtMost2ElementsByCollectionHolder(this,) }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    public override getFirst(): T {
        return getFirstByCollectionHolder(this,)
    }

    public override getLast(): T {
        return getLastByCollectionHolder(this,)
    }


    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) {
        return getOrElseByCollectionHolder(this, index, defaultValue,)
    }

    public override getFirstOrElse<const U, >(defaultValue: ReturnCallback<U>,): | T | U
    public override getFirstOrElse(defaultValue: ReturnCallback<T>,): T
    public override getFirstOrElse(defaultValue: ReturnCallback<unknown>,) {
        return getFirstOrElseByCollectionHolder(this, defaultValue,)
    }

    public override getLastOrElse<const U, >(defaultValue: ReturnCallback<U>,): | T | U
    public override getLastOrElse(defaultValue: ReturnCallback<T>,): T
    public override getLastOrElse(defaultValue: ReturnCallback<unknown>,) {
        return getLastOrElseByCollectionHolder(this, defaultValue,)
    }


    public override getOrNull(index: number,): NullOr<T> {
        return getOrNullByCollectionHolder(this, index,)
    }

    public override getFirstOrNull(): NullOr<T> {
        return getFirstOrNullByCollectionHolder(this,)
    }

    public override getLastOrNull(): NullOr<T> {
        return getLastOrNullByCollectionHolder(this,)
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

    public override findFirstIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findFirstIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>
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
        return firstIndexOfByCollectionHolder(this, element, from, to,)
    }

    public override firstIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return firstIndexOfOrNullByCollectionHolder(this, element, from, to,)
    }


    public override lastIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,): number {
        return lastIndexOfByCollectionHolder(this, element, from, to,)
    }

    public override lastIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return lastIndexOfOrNullByCollectionHolder(this, element, from, to,)
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

    //#region -------------------- All --------------------

    public override all<S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolder<S>
    public override all(predicate: BooleanCallback<T>,): boolean
    public override all(predicate: BooleanCallback<T>,) {
        return allByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- All --------------------
    //#region -------------------- Any --------------------

    public override any(): this["isNotEmpty"]
    public override any(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override any(predicate?: Nullable<BooleanCallback<T>>,) {
        if (predicate == null)
            return this.isNotEmpty
        return this._any(predicate,)
    }

    public override some(): this["isNotEmpty"]
    public override some(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override some(predicate?: Nullable<BooleanCallback<T>>,) {
        if (predicate == null)
            return this.isNotEmpty
        return this._any(predicate,)
    }


    /** An additional method to be the equivalent of {@link CollectionHolder.any CollectionHolder.any(predicate)} */
    protected _any(predicate: BooleanCallback<T>,): boolean { return anyByCollectionHolder(this, predicate,) }

    //#endregion -------------------- Any --------------------
    //#region -------------------- None --------------------

    public override none(): this["isEmpty"]
    public override none(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override none(predicate?: Nullable<BooleanCallback<T>>,) {
        if (predicate == null)
            return this.isEmpty
        return this._none(predicate,)
    }


    /** An additional method to be the equivalent of {@link CollectionHolder.none CollectionHolder.none(predicate)} */
    protected _none(predicate: BooleanCallback<T>,): boolean { return noneByCollectionHolder(this, predicate,) }

    //#endregion -------------------- None --------------------

    //#region -------------------- Has ‥ --------------------

    public override get hasNull(): boolean { return hasNullByCollectionHolder(this,) }

    public override get hasNoNulls(): boolean { return hasNoNullsByCollectionHolder(this,) }


    public override get hasDuplicate(): boolean { return hasDuplicateByCollectionHolder(this,) }

    public override get hasNoDuplicates(): boolean { return hasNoDuplicatesByCollectionHolder(this,) }

    //#endregion -------------------- Has ‥ --------------------

    //#region -------------------- Has --------------------

    public override has(value: T,): boolean {
        return hasByCollectionHolder(this, value,)
    }

    //#endregion -------------------- Has --------------------
    //#region -------------------- Has not --------------------

    public override hasNot(value: T,): boolean {
        return hasNotByCollectionHolder(this, value,)
    }

    //#endregion -------------------- Has not --------------------
    //#region -------------------- Has one --------------------

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
        if (values == null)
            return this._hasOneByNull(values,)

        if (values instanceof Array)
            return this._hasOneByArray(values,)
        if (values instanceof Set)
            return this._hasOneBySet(values,)
        if (isCollectionHolder(values))
            return this._hasOneByCollectionHolder(values,)
        if (isMinimalistCollectionHolder(values,))
            return this._hasOneByMinimalistCollectionHolder(values,)
        if (isCollectionIterator(values,))
            return this._hasOneByCollectionIterator(values,)
        if (values instanceof Iterator)
            return this._hasOneByIterator(values,)

        if (isArrayByStructure<T>(values))
            return this._hasOneByArray(values,)
        if (isSetByStructure<T>(values))
            return this._hasOneBySet(values,)
        if (isCollectionHolderByStructure<T>(values))
            return this._hasOneByCollectionHolder(values,)
        if (isMinimalistCollectionHolderByStructure<T>(values,))
            return this._hasOneByMinimalistCollectionHolder(values,)
        if (isCollectionIteratorByStructure<T>(values,))
            return this._hasOneByCollectionIterator(values,)
        if (isIteratorByStructure<T>(values,))
            return this._hasOneByIterator(values,)
        return this._hasOneByIterable(values,)
    }


    /** An additional method to be the equivalent of {@link CollectionHolder.hasOne CollectionHolder.hasOne(values: NullOrUndefined)} */
    protected _hasOneByNull(_values: NullOrUndefined,): boolean {
        return this.isNotEmpty
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasOne CollectionHolder.hasOne(values: Array<T>)} */
    protected _hasOneByArray(values: Array<T>,): boolean {
        return hasOneWithArrayByCollectionHolder(this, values,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasOne CollectionHolder.hasOne(values: Set<T>)} */
    protected _hasOneBySet(values: Set<T>,): boolean {
        return hasOneWithSetByCollectionHolder(this, values,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasOne CollectionHolder.hasOne(values: MinimalistCollectionHolder<T>)} */
    protected _hasOneByMinimalistCollectionHolder(values: MinimalistCollectionHolder<T>,): boolean {
        return hasOneWithMinimalistCollectionHolderByCollectionHolder(this, values,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasOne CollectionHolder.hasOne(values: CollectionHolder<T>)} */
    protected _hasOneByCollectionHolder(values: CollectionHolder<T>,): boolean {
        return hasOneWithCollectionHolderByCollectionHolder(this, values,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasOne CollectionHolder.hasOne(values: CollectionIterator<T>)} */
    protected _hasOneByCollectionIterator(values: CollectionIterator<T>,): boolean {
        return hasOneWithCollectionIteratorByCollectionHolder(this, values,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasOne CollectionHolder.hasOne(values: Iterator<T>)} */
    protected _hasOneByIterator(values: Iterator<T, unknown, unknown>,): boolean {
        return hasOneWithIteratorByCollectionHolder(this, values,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasOne CollectionHolder.hasOne(values: Iterable<T>)} */
    protected _hasOneByIterable(values: Iterable<T, unknown, unknown>,): boolean {
        return hasOneWithIterableByCollectionHolder(this, values,)
    }

    //#endregion -------------------- Has one --------------------
    //#region -------------------- Has not one --------------------

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
        if (values == null)
            return this._hasNotOneByNull(values,)

        if (values instanceof Array)
            return this._hasNotOneByArray(values,)
        if (values instanceof Set)
            return this._hasNotOneBySet(values,)
        if (isCollectionHolder(values,))
            return this._hasNotOneByCollectionHolder(values,)
        if (isMinimalistCollectionHolder(values,))
            return this._hasNotOneByMinimalistCollectionHolder(values,)
        if (isCollectionIterator(values,))
            return this._hasNotOneByCollectionIterator(values,)
        if (values instanceof Iterator)
            return this._hasNotOneByIterator(values,)

        if (isArrayByStructure<T>(values))
            return this._hasNotOneByArray(values,)
        if (isSetByStructure<T>(values))
            return this._hasNotOneBySet(values,)
        if (isCollectionHolderByStructure<T>(values))
            return this._hasNotOneByCollectionHolder(values,)
        if (isMinimalistCollectionHolderByStructure<T>(values,))
            return this._hasNotOneByMinimalistCollectionHolder(values,)
        if (isCollectionIteratorByStructure<T>(values,))
            return this._hasNotOneByCollectionIterator(values,)
        if (isIteratorByStructure<T>(values,))
            return this._hasNotOneByIterator(values,)
        return this._hasNotOneByIterable(values,)
    }


    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotOne CollectionHolder.hasNotOne(values: NullOrUndefined)} */
    protected _hasNotOneByNull(_values: NullOrUndefined,): boolean {
        return this.isEmpty
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotOne CollectionHolder.hasNotOne(values: Array<T>)} */
    protected _hasNotOneByArray(values: Array<T>,): boolean {
        return hasNotOneWithArrayByCollectionHolder(this, values,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotOne CollectionHolder.hasNotOne(values: Set<T>)} */
    protected _hasNotOneBySet(values: Set<T>,): boolean {
        return hasNotOneWithSetByCollectionHolder(this, values,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotOne CollectionHolder.hasNotOne(values: MinimalistCollectionHolder<T>)} */
    protected _hasNotOneByMinimalistCollectionHolder(values: MinimalistCollectionHolder<T>,): boolean {
        return hasNotOneWithMinimalistCollectionHolderByCollectionHolder(this, values,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotOne CollectionHolder.hasNotOne(values: CollectionHolder<T>)} */
    protected _hasNotOneByCollectionHolder(values: CollectionHolder<T>,): boolean {
        return hasNotOneWithCollectionHolderByCollectionHolder(this, values,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotOne CollectionHolder.hasNotOne(values: CollectionIterator<T>)} */
    protected _hasNotOneByCollectionIterator(values: CollectionIterator<T>,): boolean {
        return hasNotOneWithCollectionIteratorByCollectionHolder(this, values,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotOne CollectionHolder.hasNotOne(values: Iterator<T>)} */
    protected _hasNotOneByIterator(values: Iterator<T, unknown, unknown>,): boolean {
        return hasNotOneWithIteratorByCollectionHolder(this, values,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotOne CollectionHolder.hasNotOne(values: Iterable<T>)} */
    protected _hasNotOneByIterable(values: Iterable<T, unknown, unknown>,): boolean {
        return hasNotOneWithIterableByCollectionHolder(this, values,)
    }

    //#endregion -------------------- Has not one --------------------
    //#region -------------------- Has all --------------------

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
        if (values == null)
            return this._hasAllByNull(values,)

        if (values instanceof Array)
            return this._hasAllByArray(values,)
        if (values instanceof Set)
            return this._hasAllBySet(values,)
        if (isCollectionHolder(values))
            return this._hasAllByCollectionHolder(values,)
        if (isMinimalistCollectionHolder(values,))
            return this._hasAllByMinimalistCollectionHolder(values,)
        if (isCollectionIterator(values,))
            return this._hasAllByCollectionIterator(values,)
        if (values instanceof Iterator)
            return this._hasAllByIterator(values,)

        if (isArrayByStructure<T>(values))
            return this._hasAllByArray(values,)
        if (isSetByStructure<T>(values))
            return this._hasAllBySet(values,)
        if (isCollectionHolderByStructure<T>(values))
            return this._hasAllByCollectionHolder(values,)
        if (isMinimalistCollectionHolderByStructure<T>(values,))
            return this._hasAllByMinimalistCollectionHolder(values,)
        if (isCollectionIteratorByStructure<T>(values,))
            return this._hasAllByCollectionIterator(values,)
        if (isIteratorByStructure<T>(values,))
            return this._hasAllByIterator(values,)
        return this._hasAllByIterable(values,)
    }


    /** An additional method to be the equivalent of {@link CollectionHolder.hasAll CollectionHolder.hasAll(values: NullOrUndefined)} */
    protected _hasAllByNull(_values: NullOrUndefined,): true {
        return true
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasAll CollectionHolder.hasAll(values: Array<T>)} */
    protected _hasAllByArray(values: Array<T>,): boolean {
        return hasAllWithArrayByCollectionHolder(this, values,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasAll CollectionHolder.hasAll(values: Set<T>)} */
    protected _hasAllBySet(values: Set<T>,): boolean {
        return hasAllWithSetByCollectionHolder(this, values,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasAll CollectionHolder.hasAll(values: MinimalistCollectionHolder<T>)} */
    protected _hasAllByMinimalistCollectionHolder(values: MinimalistCollectionHolder<T>,): boolean {
        return hasAllWithMinimalistCollectionHolderByCollectionHolder(this, values,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasAll CollectionHolder.hasAll(values: CollectionHolder<T>)} */
    protected _hasAllByCollectionHolder(values: CollectionHolder<T>,): boolean {
        return hasAllWithCollectionHolderByCollectionHolder(this, values,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasAll CollectionHolder.hasAll(values: CollectionIterator<T>)} */
    protected _hasAllByCollectionIterator(values: CollectionIterator<T>,): boolean {
        return hasAllWithCollectionIteratorByCollectionHolder(this, values,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasAll CollectionHolder.hasAll(values: Iterator<T>)} */
    protected _hasAllByIterator(values: Iterator<T, unknown, unknown>,): boolean {
        return hasAllWithIteratorByCollectionHolder(this, values,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasAll CollectionHolder.hasAll(values: Iterable<T>)} */
    protected _hasAllByIterable(values: Iterable<T, unknown, unknown>,): boolean {
        return hasAllWithIterableByCollectionHolder(this, values,)
    }

    //#endregion -------------------- Has all --------------------
    //#region -------------------- Has not all --------------------

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
        if (values == null)
            return this._hasNotAllByNull(values,)

        if (values instanceof Array)
            return this._hasNotAllByArray(values,)
        if (values instanceof Set)
            return this._hasNotAllBySet(values,)
        if (isCollectionHolder(values,))
            return this._hasNotAllByCollectionHolder(values,)
        if (isMinimalistCollectionHolder(values,))
            return this._hasNotAllByMinimalistCollectionHolder(values,)
        if (isCollectionIterator(values,))
            return this._hasNotAllByCollectionIterator(values,)
        if (values instanceof Iterator)
            return this._hasNotAllByIterator(values,)

        if (isArrayByStructure<T>(values,))
            return this._hasNotAllByArray(values,)
        if (isSetByStructure<T>(values,))
            return this._hasNotAllBySet(values,)
        if (isCollectionHolderByStructure<T>(values,))
            return this._hasNotAllByCollectionHolder(values,)
        if (isMinimalistCollectionHolderByStructure<T>(values,))
            return this._hasNotAllByMinimalistCollectionHolder(values,)
        if (isCollectionIteratorByStructure<T>(values,))
            return this._hasNotAllByCollectionIterator(values,)
        if (isIteratorByStructure<T>(values,))
            return this._hasNotAllByIterator(values,)
        return this._hasNotAllByIterable(values,)
    }


    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotAll CollectionHolder.hasNotAll(values: NullOrUndefined)} */
    protected _hasNotAllByNull(_values: NullOrUndefined,): false {
        return false
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotAll CollectionHolder.hasNotAll(values: Array<T>)} */
    protected _hasNotAllByArray(values: Array<T>,): boolean {
        return hasNotAllWithArrayByCollectionHolder(this, values,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotAll CollectionHolder.hasNotAll(values: Set<T>)} */
    protected _hasNotAllBySet(values: Set<T>,): boolean {
        return hasNotAllWithSetByCollectionHolder(this, values,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotAll CollectionHolder.hasNotAll(values: MinimalistCollectionHolder<T>)} */
    protected _hasNotAllByMinimalistCollectionHolder(values: MinimalistCollectionHolder<T>,): boolean {
        return hasNotAllWithMinimalistCollectionHolderByCollectionHolder(this, values,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotAll CollectionHolder.hasNotAll(values: CollectionHolder<T>)} */
    protected _hasNotAllByCollectionHolder(values: CollectionHolder<T>,): boolean {
        return hasNotAllWithCollectionHolderByCollectionHolder(this, values,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotAll CollectionHolder.hasNotAll(values: CollectionIterator<T>)} */
    protected _hasNotAllByCollectionIterator(values: CollectionIterator<T>,): boolean {
        return hasNotAllWithCollectionIteratorByCollectionHolder(this, values,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotAll CollectionHolder.hasNotAll(values: Iterator<T>)} */
    protected _hasNotAllByIterator(values: Iterator<T, unknown, unknown>,): boolean {
        return hasNotAllWithIteratorByCollectionHolder(this, values,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasNotAll CollectionHolder.hasNotAll(values: Iterable<T>)} */
    protected _hasNotAllByIterable(values: Iterable<T, unknown, unknown>,): boolean {
        return hasNotAllWithIterableByCollectionHolder(this, values,)
    }

    //#endregion -------------------- Has not all --------------------

    //#region -------------------- Require no nulls --------------------

    public override requireNoNulls(): CollectionHolder<NonNullable<T>> {
        return requireNoNullsByCollectionHolder(this,)
    }

    //#endregion -------------------- Require no nulls --------------------

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
        return filterNotNullByCollectionHolder(this,)
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
        //#region -------------------- 0 arguments --------------------

        if (arguments.length === 0)
            return this._sliceWith0Argument()

        //#endregion -------------------- 0 arguments --------------------
        //#region -------------------- 1 argument --------------------

        if (arguments.length === 1)
            if (indicesOrFrom == null)
                return this._sliceWith0Argument()
            else if (typeof indicesOrFrom == "number")
                return this._sliceWith1Argument(indicesOrFrom,)
            else if (indicesOrFrom instanceof Array)
                return this._sliceByArray(indicesOrFrom,)
            else if (indicesOrFrom instanceof Set)
                return this._sliceBySet(indicesOrFrom,)
            else if (isCollectionHolder(indicesOrFrom,))
                return this._sliceByCollectionHolder(indicesOrFrom,)
            else if (isMinimalistCollectionHolder(indicesOrFrom,))
                return this._sliceByMinimalistCollectionHolder(indicesOrFrom,)
            else if (isCollectionIterator(indicesOrFrom,))
                return this._sliceByCollectionIterator(indicesOrFrom,)
            else if (indicesOrFrom instanceof Iterator)
                return this._sliceByIterator(indicesOrFrom,)

            else if (isArrayByStructure<number>(indicesOrFrom,))
                return this._sliceByArray(indicesOrFrom,)
            else if (isSetByStructure<number>(indicesOrFrom,))
                return this._sliceBySet(indicesOrFrom,)
            else if (isCollectionHolderByStructure<number>(indicesOrFrom,))
                return this._sliceByCollectionHolder(indicesOrFrom,)
            else if (isMinimalistCollectionHolderByStructure<number>(indicesOrFrom,))
                return this._sliceByMinimalistCollectionHolder(indicesOrFrom,)
            else if (isCollectionIteratorByStructure<number>(indicesOrFrom,))
                return this._sliceByCollectionIterator(indicesOrFrom,)
            else if (isIteratorByStructure<number>(indicesOrFrom,))
                return this._sliceByIterator(indicesOrFrom,)
            else
                return this._sliceByIterable(indicesOrFrom,)

        //#endregion -------------------- 1 argument --------------------
        //#region -------------------- 2 arguments --------------------

        if (indicesOrFrom == null)
            if (to == null)
                return this._sliceWith0Argument()
            else
                return this._sliceWith2ArgumentWhere1stIsNull(indicesOrFrom, to,)


        if (to == null)
            if (typeof indicesOrFrom == "number")
                return this._sliceWith1Argument(indicesOrFrom,)
            else if (indicesOrFrom instanceof Array)
                return this._sliceByArray(indicesOrFrom,)
            else if (indicesOrFrom instanceof Set)
                return this._sliceBySet(indicesOrFrom,)
            else if (isCollectionHolder(indicesOrFrom,))
                return this._sliceByCollectionHolder(indicesOrFrom,)
            else if (isMinimalistCollectionHolder(indicesOrFrom,))
                return this._sliceByMinimalistCollectionHolder(indicesOrFrom,)
            else if (isCollectionIterator(indicesOrFrom,))
                return this._sliceByCollectionIterator(indicesOrFrom,)
            else if (indicesOrFrom instanceof Iterator)
                return this._sliceByIterator(indicesOrFrom,)

            else if (isArrayByStructure<number>(indicesOrFrom,))
                return this._sliceByArray(indicesOrFrom,)
            else if (isSetByStructure<number>(indicesOrFrom,))
                return this._sliceBySet(indicesOrFrom,)
            else if (isCollectionHolderByStructure<number>(indicesOrFrom,))
                return this._sliceByCollectionHolder(indicesOrFrom,)
            else if (isMinimalistCollectionHolderByStructure<number>(indicesOrFrom,))
                return this._sliceByMinimalistCollectionHolder(indicesOrFrom,)
            else if (isCollectionIteratorByStructure<number>(indicesOrFrom,))
                return this._sliceByCollectionIterator(indicesOrFrom,)
            else if (isIteratorByStructure<number>(indicesOrFrom,))
                return this._sliceByIterator(indicesOrFrom,)
            else
                return this._sliceByIterable(indicesOrFrom,)


        if (typeof indicesOrFrom == "number")
            return this._sliceWith2Argument(indicesOrFrom, to,)
        if (indicesOrFrom instanceof Array)
            return this._sliceByArray(indicesOrFrom,)
        if (indicesOrFrom instanceof Set)
            return this._sliceBySet(indicesOrFrom,)
        if (isCollectionHolder(indicesOrFrom,))
            return this._sliceByCollectionHolder(indicesOrFrom,)
        if (isMinimalistCollectionHolder(indicesOrFrom,))
            return this._sliceByMinimalistCollectionHolder(indicesOrFrom,)
        if (isCollectionIterator(indicesOrFrom,))
            return this._sliceByCollectionIterator(indicesOrFrom,)
        if (indicesOrFrom instanceof Iterator)
            return this._sliceByIterator(indicesOrFrom,)

        if (isArrayByStructure<number>(indicesOrFrom,))
            return this._sliceByArray(indicesOrFrom,)
        if (isSetByStructure<number>(indicesOrFrom,))
            return this._sliceBySet(indicesOrFrom,)
        if (isCollectionHolderByStructure<number>(indicesOrFrom,))
            return this._sliceByCollectionHolder(indicesOrFrom,)
        if (isMinimalistCollectionHolderByStructure<number>(indicesOrFrom,))
            return this._sliceByMinimalistCollectionHolder(indicesOrFrom,)
        if (isCollectionIteratorByStructure<number>(indicesOrFrom,))
            return this._sliceByCollectionIterator(indicesOrFrom,)
        if (isIteratorByStructure<number>(indicesOrFrom,))
            return this._sliceByIterator(indicesOrFrom,)
        return this._sliceByIterable(indicesOrFrom,)

        //#endregion -------------------- 2 arguments --------------------
    }


    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice()} */
    protected _sliceWith0Argument(): CollectionHolder<T> {
        return sliceWithARangeByCollectionHolder(this,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice(from)} */
    protected _sliceWith1Argument(from: number,): CollectionHolder<T> {
        return sliceWithARangeByCollectionHolder(this, from,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice(from, to)} */
    protected _sliceWith2Argument(from: number, to: number,): CollectionHolder<T> {
        return sliceWithARangeByCollectionHolder(this, from, to,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice(null, to)} */
    protected _sliceWith2ArgumentWhere1stIsNull(from: NullOrUndefined, to: number,): CollectionHolder<T> {
        return sliceWithARangeByCollectionHolder(this, from, to,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice(indices: NumberArray)} */
    protected _sliceByArray(indices: NumberArray,): CollectionHolder<T> {
        return sliceWithArrayByCollectionHolder(this, indices,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice(indices: NumberSet)} */
    protected _sliceBySet(indices: NumberSet,): CollectionHolder<T> {
        return sliceWithSetByCollectionHolder(this, indices,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice(indices: MinimalistCollectionHolder<number>)} */
    protected _sliceByMinimalistCollectionHolder(indices: MinimalistCollectionHolder<number>,): CollectionHolder<T> {
        return sliceWithMinimalistCollectionHolderByCollectionHolder(this, indices,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice(indices: CollectionHolder<number>)} */
    protected _sliceByCollectionHolder(indices: CollectionHolder<number>,): CollectionHolder<T> {
        return sliceWithCollectionHolderByCollectionHolder(this, indices,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice(indices: CollectionIterator<number>)} */
    protected _sliceByCollectionIterator(indices: CollectionIterator<number>,): CollectionHolder<T> {
        return sliceWithCollectionIteratorByCollectionHolder(this, indices,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice(indices: Iterator<number>)} */
    protected _sliceByIterator(indices: Iterator<number, unknown, unknown>,): CollectionHolder<T> {
        return sliceWithIteratorByCollectionHolder(this, indices,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice(indices: Iterable<number>)} */
    protected _sliceByIterable(indices: Iterable<number, unknown, unknown>,): CollectionHolder<T> {
        return sliceWithIterableByCollectionHolder(this, indices,)
    }

    //#endregion -------------------- Slice --------------------
    //#region -------------------- Take --------------------

    public override take(n: number,): CollectionHolder<T> {
        return takeByCollectionHolder(this, n,)
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
        return takeLastByCollectionHolder(this, n,)
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
        return dropByCollectionHolder(this, n,)
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
        return dropLastByCollectionHolder(this, n,)
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

    //#region -------------------- To reverse --------------------

    public override toReverse(from?: NullableNumber, to?: NullableNumber,): CollectionHolder<T> {
        return toReverseByCollectionHolder(this, from, to,)
    }

    //#endregion -------------------- To reverse --------------------

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- Conversion methods --------------------

    //#region -------------------- To iterator --------------------

    public override toIterator(): CollectionIterator<T> {
        return toIteratorByCollectionHolder(this,)
    }

    //#endregion -------------------- To iterator --------------------
    //#region -------------------- To array --------------------

    public override toArray(): Array<T> {
        return toArrayByCollectionHolder(this,)
    }

    public override toMutableArray(): MutableArray<T> {
        return toMutableArrayByCollectionHolder(this,)
    }

    //#endregion -------------------- To array --------------------
    //#region -------------------- To set --------------------

    public override toSet(): Set<T> {
        return toSetByCollectionHolder(this,)
    }

    public override toMutableSet(): MutableSet<T> {
        return toMutableSetByCollectionHolder(this,)
    }

    //#endregion -------------------- To set --------------------
    //#region -------------------- To map --------------------

    public override toMap(): NumberKeyMap<T> {
        return toMapByCollectionHolder(this,)
    }

    public override toMutableMap(): MutableNumberKeyMap<T> {
        return toMutableMapByCollectionHolder(this,)
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


    public override toLowerCaseString(): string {
        return toLowerCaseStringByCollectionHolder(this,)
    }

    public override toLocaleLowerCaseString(locale?: NullableString,): string {
        if (arguments.length === 0)
            return toLocaleLowerCaseStringByCollectionHolder(this,)
        return toLocaleLowerCaseStringByCollectionHolder(this, locale,)
    }


    public override toUpperCaseString(): string {
        return toUpperCaseStringByCollectionHolder(this,)
    }

    public override toLocaleUpperCaseString(locale?: NullableString,): string {
        if (arguments.length === 0)
            return toLocaleUpperCaseStringByCollectionHolder(this,)
        return toLocaleUpperCaseStringByCollectionHolder(this, locale,)
    }

    //#endregion -------------------- To string --------------------
    //#region -------------------- Join to string --------------------

    public override joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string {
        return joinToStringByCollectionHolder(this, separator, prefix, postfix, limit, truncated, transform,)
    }

    //#endregion -------------------- Join to string --------------------

    //#endregion -------------------- Conversion methods --------------------

    //#endregion -------------------- Methods --------------------

}

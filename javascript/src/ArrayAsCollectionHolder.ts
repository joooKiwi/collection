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

import type {Array, MutableArray, MutableNumberKeyMap, MutableSet, Nullable, NullableNumber, NullableString, NullOr, NullOrNumber, NullOrUndefined, NumberArray, NumberKeyMap, NumberSet, Set, UndefinedOr} from "@joookiwi/type"

import type {CollectionHolder}                                                                                                                                                                                                                                                  from "./CollectionHolder"
import type {MinimalistCollectionHolder}                                                                                                                                                                                                                                        from "./MinimalistCollectionHolder"
import type {CollectionIterator}                                                                                                                                                                                                                                                from "./iterator/CollectionIterator"
import type {BooleanCallback, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, RestrainedBooleanCallback, ReturnCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, StringCallback, ValueIndexCallback, ValueIndexWithReturnCallback} from "./type/callback"
import type {HasAtMost1ElementOnArray}                                                                                                                                                                                                                                          from "./type/hasAtMost1Element"
import type {HasAtMost2ElementsOnArray}                                                                                                                                                                                                                                         from "./type/hasAtMost2Elements"
import type {HasExactly1ElementOnArray}                                                                                                                                                                                                                                         from "./type/hasExactly1Element"
import type {HasExactly2ElementsOnArray}                                                                                                                                                                                                                                        from "./type/hasExactly2Elements"
import type {IsEmptyOnArray}                                                                                                                                                                                                                                                    from "./type/isEmpty"
import type {IsNotEmptyOnArray}                                                                                                                                                                                                                                                 from "./type/isNotEmpty"

import {AbstractCollectionHolder}                       from "./AbstractCollectionHolder"
import {EmptyCollectionException}                       from "./exception/EmptyCollectionException"
import {ForbiddenIndexException}                        from "./exception/ForbiddenIndexException"
import {IndexOutOfBoundsException}                      from "./exception/IndexOutOfBoundsException"
import {allByArray}                                     from "./method/all"
import {anyByArray}                                     from "./method/any"
import {dropByArray}                                    from "./method/drop"
import {dropLastByArray}                                from "./method/dropLast"
import {dropLastWhileByArray}                           from "./method/dropLastWhile"
import {dropLastWhileIndexedByArray}                    from "./method/dropLastWhileIndexed"
import {dropWhileByArray}                               from "./method/dropWhile"
import {dropWhileIndexedByArray}                        from "./method/dropWhileIndexed"
import {filterByArray}                                  from "./method/filter"
import {filterIndexedByArray}                           from "./method/filterIndexed"
import {filterNotByArray}                               from "./method/filterNot"
import {filterNotIndexedByArray}                        from "./method/filterNotIndexed"
import {filterNotNullByArray}                           from "./method/filterNotNull"
import {findFirstByArray}                               from "./method/findFirst"
import {findFirstIndexedByArray}                        from "./method/findFirstIndexed"
import {findFirstIndexedOrNullByArray}                  from "./method/findFirstIndexedOrNull"
import {findFirstOrNullByArray}                         from "./method/findFirstOrNull"
import {findLastByArray}                                from "./method/findLast"
import {findLastIndexedByArray}                         from "./method/findLastIndexed"
import {findLastIndexedOrNullByArray}                   from "./method/findLastIndexedOrNull"
import {findLastOrNullByArray}                          from "./method/findLastOrNull"
import {firstIndexOfByArray}                            from "./method/firstIndexOf"
import {firstIndexOfOrNullByArray}                      from "./method/firstIndexOfOrNull"
import {forEachByArray}                                 from "./method/forEach"
import {forEachIndexedByArray}                          from "./method/forEachIndexed"
import {getFirstByArray}                                from "./method/getFirst"
import {getFirstOrElseByArray}                          from "./method/getFirstOrElse"
import {getFirstOrNullByArray}                          from "./method/getFirstOrNull"
import {getLastByArray}                                 from "./method/getLast"
import {getLastOrElseByArray}                           from "./method/getLastOrElse"
import {getLastOrNullByArray}                           from "./method/getLastOrNull"
import {getOrElseByArray}                               from "./method/getOrElse"
import {getOrNullByArray}                               from "./method/getOrNull"
import {hasByArray}                                     from "./method/has"
import {hasAllWithArrayByArray}                         from "./method/hasAll.withArray"
import {hasAllWithCollectionHolderByArray}              from "./method/hasAll.withCollectionHolder"
import {hasAllWithCollectionIteratorByArray}            from "./method/hasAll.withCollectionIterator"
import {hasAllWithIterableByArray}                      from "./method/hasAll.withIterable"
import {hasAllWithIteratorByArray}                      from "./method/hasAll.withIterator"
import {hasAllWithMinimalistCollectionHolderByArray}    from "./method/hasAll.withMinimalistCollectionHolder"
import {hasAllWithSetByArray}                           from "./method/hasAll.withSet"
import {hasDuplicateByArray}                            from "./method/hasDuplicate"
import {hasNullByArray}                                 from "./method/hasNull"
import {hasNoDuplicatesByArray}                         from "./method/hasNoDuplicates"
import {hasNoNullsByArray}                              from "./method/hasNoNulls"
import {hasNotByArray}                                  from "./method/hasNot"
import {hasNotAllWithArrayByArray}                      from "./method/hasNotAll.withArray"
import {hasNotAllWithCollectionHolderByArray}           from "./method/hasNotAll.withCollectionHolder"
import {hasNotAllWithCollectionIteratorByArray}         from "./method/hasNotAll.withCollectionIterator"
import {hasNotAllWithIterableByArray}                   from "./method/hasNotAll.withIterable"
import {hasNotAllWithIteratorByArray}                   from "./method/hasNotAll.withIterator"
import {hasNotAllWithMinimalistCollectionHolderByArray} from "./method/hasNotAll.withMinimalistCollectionHolder"
import {hasNotAllWithSetByArray}                        from "./method/hasNotAll.withSet"
import {hasNotOneWithArrayByArray}                      from "./method/hasNotOne.withArray"
import {hasNotOneWithCollectionHolderByArray}           from "./method/hasNotOne.withCollectionHolder"
import {hasNotOneWithCollectionIteratorByArray}         from "./method/hasNotOne.withCollectionIterator"
import {hasNotOneWithIterableByArray}                   from "./method/hasNotOne.withIterable"
import {hasNotOneWithIteratorByArray}                   from "./method/hasNotOne.withIterator"
import {hasNotOneWithMinimalistCollectionHolderByArray} from "./method/hasNotOne.withMinimalistCollectionHolder"
import {hasNotOneWithSetByArray}                        from "./method/hasNotOne.withSet"
import {hasOneWithArrayByArray}                         from "./method/hasOne.withArray"
import {hasOneWithCollectionHolderByArray}              from "./method/hasOne.withCollectionHolder"
import {hasOneWithCollectionIteratorByArray}            from "./method/hasOne.withCollectionIterator"
import {hasOneWithIterableByArray}                      from "./method/hasOne.withIterable"
import {hasOneWithIteratorByArray}                      from "./method/hasOne.withIterator"
import {hasOneWithMinimalistCollectionHolderByArray}    from "./method/hasOne.withMinimalistCollectionHolder"
import {hasOneWithSetByArray}                           from "./method/hasOne.withSet"
import {indexOfFirstByArray}                            from "./method/indexOfFirst"
import {indexOfFirstIndexedByArray}                     from "./method/indexOfFirstIndexed"
import {indexOfFirstIndexedOrNullByArray}               from "./method/indexOfFirstIndexedOrNull"
import {indexOfFirstOrNullByArray}                      from "./method/indexOfFirstOrNull"
import {indexOfLastByArray}                             from "./method/indexOfLast"
import {indexOfLastIndexedByArray}                      from "./method/indexOfLastIndexed"
import {indexOfLastIndexedOrNullByArray}                from "./method/indexOfLastIndexedOrNull"
import {indexOfLastOrNullByArray}                       from "./method/indexOfLastOrNull"
import {joinToStringByArray}                            from "./method/joinToString"
import {lastIndexOfByArray}                             from "./method/lastIndexOf"
import {lastIndexOfOrNullByArray}                       from "./method/lastIndexOfOrNull"
import {noneByArray}                                    from "./method/none"
import {mapByArray}                                     from "./method/map"
import {mapIndexedByArray}                              from "./method/mapIndexed"
import {mapNotNullByArray}                              from "./method/mapNotNull"
import {mapNotNullIndexedByArray}                       from "./method/mapNotNullIndexed"
import {requireNoNullsByArray}                          from "./method/requireNoNulls"
import {sliceWithARangeByArray}                         from "./method/slice.withARange"
import {sliceWithArrayByArray}                          from "./method/slice.withArray"
import {sliceWithCollectionHolderByArray}               from "./method/slice.withCollectionHolder"
import {sliceWithCollectionIteratorByArray}             from "./method/slice.withCollectionIterator"
import {sliceWithIterableByArray}                       from "./method/slice.withIterable"
import {sliceWithIteratorByArray}                       from "./method/slice.withIterator"
import {sliceWithMinimalistCollectionHolderByArray}     from "./method/slice.withMinimalistCollectionHolder"
import {sliceWithSetByArray}                            from "./method/slice.withSet"
import {takeByArray}                                    from "./method/take"
import {takeLastByArray}                                from "./method/takeLast"
import {takeLastWhileByArray}                           from "./method/takeLastWhile"
import {takeLastWhileIndexedByArray}                    from "./method/takeLastWhileIndexed"
import {takeWhileByArray}                               from "./method/takeWhile"
import {takeWhileIndexedByArray}                        from "./method/takeWhileIndexed"
import {toArrayByArray}                                 from "./method/toArray"
import {toIteratorByArray}                              from "./method/toIterator"
import {toLocaleLowerCaseStringByArray}                 from "./method/toLocaleLowerCaseString"
import {toLocaleStringByArray}                          from "./method/toLocaleString"
import {toLocaleUpperCaseStringByArray}                 from "./method/toLocaleUpperCaseString"
import {toLowerCaseStringByArray}                       from "./method/toLowerCaseString"
import {toMapByArray}                                   from "./method/toMap"
import {toMutableArrayByArray}                          from "./method/toMutableArray"
import {toMutableMapByArray}                            from "./method/toMutableMap"
import {toMutableSetByArray}                            from "./method/toMutableSet"
import {toReverseByArray}                               from "./method/toReverse"
import {toSetByArray}                                   from "./method/toSet"
import {toStringByArray}                                from "./method/toString"
import {toUpperCaseStringByArray}                       from "./method/toUpperCaseString"

/**
 * An {@link ReadonlyArray Array} adaptor class that provide all the features of a {@link CollectionHolder}.
 *
 * Note that nothing excepting the {@link ReadonlyArray Array} received
 * are kept in the instance.
 *
 * @typeParam T         The element type
 * @typeParam REFERENCE The reference passed in the constructor
 * @adaptor
 */
export class ArrayAsCollectionHolder<const T = unknown,
    const REFERENCE extends Array<T> = Array<T>, >
    extends AbstractCollectionHolder<T> {

    //#region -------------------- Fields --------------------

    readonly #reference: WeakRef<REFERENCE>
    readonly #size: REFERENCE["length"]
    readonly #isEmpty: boolean

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor(reference: REFERENCE,) {
        super()
        this.#reference = new WeakRef(reference,)
        const size = this.#size = reference.length
        if (this.#isEmpty = size === 0)
            return

        let index = size
        while (index-- > 0)
            this[index] = reference[index] as T
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Reference methods --------------------

    /**
     * The internal referenced passed through the {@link constructor}
     *
     * It returns `undefined` if the reference has been garbed-collected.
     */
    protected get _reference(): UndefinedOr<REFERENCE> {
        return this.#reference.deref()
    }

    //#endregion -------------------- Reference methods --------------------

    //#region -------------------- Size methods --------------------

    public override get size(): REFERENCE["length"] { return this.#size }

    public override get isEmpty(): IsEmptyOnArray<REFERENCE> { return this.#isEmpty as IsEmptyOnArray<REFERENCE> }

    public override get isNotEmpty(): IsNotEmptyOnArray<REFERENCE> { return !this.isEmpty as IsNotEmptyOnArray<REFERENCE> }

    public override get hasExactly1Element(): HasExactly1ElementOnArray<REFERENCE> { return (this.size === 1) as HasExactly1ElementOnArray<REFERENCE> }

    public override get hasAtMost1Element(): HasAtMost1ElementOnArray<REFERENCE> { return (this.isEmpty || this.size === 1) as HasAtMost1ElementOnArray<REFERENCE> }

    public override get hasAtLeast2Elements(): boolean { return this.size >= 2 }

    public override get hasExactly2Elements(): HasExactly2ElementsOnArray<REFERENCE> { return (this.size === 2) as HasExactly2ElementsOnArray<REFERENCE> }

    public override get hasAtMost2Elements(): HasAtMost2ElementsOnArray<REFERENCE> {
        if (this.isEmpty)
            return true as HasAtMost2ElementsOnArray<REFERENCE>

        const size = this.size
        return (size === 1 || size === 2) as HasAtMost2ElementsOnArray<REFERENCE>
    }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    public override get<const I extends number, > (index: I,): REFERENCE[I] //TODO add better array value reflection type
    public override get(index: number,) {
        if (this.isEmpty)
            throw new EmptyCollectionException(null, index,)

        if (Number.isNaN(index,))
            throw new ForbiddenIndexException("Forbidden index. The index cannot be NaN.", index,)
        if (index == Number.NEGATIVE_INFINITY)
            throw new ForbiddenIndexException("Forbidden index. The index cannot be -∞.", index,)
        if (index == Number.POSITIVE_INFINITY)
            throw new ForbiddenIndexException("Forbidden index. The index cannot be +∞.", index,)

        if (index in this)
            return this[index] as T

        const size = this.size
        if (index > size)
            throw new IndexOutOfBoundsException(`Index out of bound. The index “${index}” is over the size of the collection (${size}).`, index,)
        if (index == size)
            throw new IndexOutOfBoundsException(`Index out of bound. The index “${index}” is the size of the collection (${size}).`, index,)
        if (index >= 0)
            return this[index] as T

        const indexToRetrieve = index + size
        if (indexToRetrieve in this)
            return this[indexToRetrieve] as T
        if (indexToRetrieve < 0)
            throw new IndexOutOfBoundsException(`Index out of bound. The index “${index}” (${indexToRetrieve} after calculation) is under 0.`, index,)
        return this[indexToRetrieve] as T
    }

    public override getFirst(): T {
        return getFirstByArray(this._reference,)
    }

    public override getLast(): T {
        return getLastByArray(this._reference,)
    }


    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) {
        return getOrElseByArray(this._reference, index, defaultValue,)
    }


    public override getFirstOrElse<const U, >(defaultValue: ReturnCallback<U>,): | T | U
    public override getFirstOrElse(defaultValue: ReturnCallback<T>,): T
    public override getFirstOrElse(defaultValue: ReturnCallback<unknown>,) {
        return getFirstOrElseByArray(this._reference, defaultValue,)
    }


    public override getLastOrElse<const U, >(defaultValue: ReturnCallback<U>,): | T | U
    public override getLastOrElse(defaultValue: ReturnCallback<T>,): T
    public override getLastOrElse(defaultValue: ReturnCallback<unknown>,) {
        return getLastOrElseByArray(this._reference, defaultValue,)
    }


    public override getOrNull(index: number,): NullOr<T> {
        return getOrNullByArray(this._reference, index,)
    }

    public override getFirstOrNull(): NullOr<T> {
        return getFirstOrNullByArray(this._reference,)
    }

    public override getLastOrNull(): NullOr<T> {
        return getLastOrNullByArray(this._reference,)
    }

    //#endregion -------------------- Get --------------------
    //#region -------------------- Find first --------------------

    public override findFirst<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public override findFirst(predicate: BooleanCallback<T>,): T
    public override findFirst(predicate: BooleanCallback<T>,) {
        return findFirstByArray(this._reference, predicate,)
    }

    public override findFirstOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findFirstOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public override findFirstOrNull(predicate: BooleanCallback<T>,) {
        return findFirstOrNullByArray(this._reference, predicate,)
    }

    public override findFirstIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public override findFirstIndexed(predicate: ReverseBooleanCallback<T>,): T
    public override findFirstIndexed(predicate: ReverseBooleanCallback<T>,) {
        return findFirstIndexedByArray(this._reference, predicate,)
    }

    public override findFirstIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,) {
        return findFirstIndexedOrNullByArray(this._reference, predicate,)
    }

    //#endregion -------------------- Find first --------------------
    //#region -------------------- Find last --------------------

    public override findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public override findLast(predicate: BooleanCallback<T>,): T
    public override findLast(predicate: BooleanCallback<T>,) {
        return findLastByArray(this._reference, predicate,)
    }

    public override findLastOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public override findLastOrNull(predicate: BooleanCallback<T>,) {
        return findLastOrNullByArray(this._reference, predicate,)
    }

    public override findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,): T
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,) {
        return findLastIndexedByArray(this._reference, predicate,)
    }

    public override findLastIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,) {
        return findLastIndexedOrNullByArray(this._reference, predicate,)
    }

    //#endregion -------------------- Find last --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    public override firstIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,): number {
        return firstIndexOfByArray(this._reference, element, from, to,)
    }

    public override firstIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return firstIndexOfOrNullByArray(this._reference, element, from, to,)
    }


    public override lastIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,): number {
        return lastIndexOfByArray(this._reference, element, from, to,)
    }

    public override lastIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return lastIndexOfOrNullByArray(this._reference, element, from, to,)
    }


    public override indexOfFirst(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return indexOfFirstByArray(this._reference, predicate, from, to,)
    }

    public override indexOfFirstOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return indexOfFirstOrNullByArray(this._reference, predicate, from, to,)
    }

    public override indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return indexOfFirstIndexedByArray(this._reference, predicate, from, to,)
    }

    public override indexOfFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return indexOfFirstIndexedOrNullByArray(this._reference, predicate, from, to,)
    }


    public override indexOfLast(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return indexOfLastByArray(this._reference, predicate, from, to,)
    }

    public override indexOfLastOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return indexOfLastOrNullByArray(this._reference, predicate, from, to,)
    }

    public override indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return indexOfLastIndexedByArray(this._reference, predicate, from, to,)
    }

    public override indexOfLastIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return indexOfLastIndexedOrNullByArray(this._reference, predicate, from, to,)
    }

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    //#region -------------------- All --------------------

    public override all<S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolder<S>
    public override all(predicate: BooleanCallback<T>,): boolean
    public override all(predicate: BooleanCallback<T>,) {
        return allByArray(this._reference, predicate,)
    }

    //#endregion -------------------- All --------------------
    //#region -------------------- Any --------------------

    protected override _any(predicate: BooleanCallback<T>,): boolean {
        return anyByArray(this._reference, predicate,)
    }

    //#endregion -------------------- Any --------------------
    //#region -------------------- None --------------------

    protected override _none(predicate: BooleanCallback<T>,): boolean {
        return noneByArray(this._reference, predicate,)
    }

    //#endregion -------------------- None --------------------

    //#region -------------------- Has null --------------------

    public override get hasNull(): boolean {
        return hasNullByArray(this._reference,)
    }

    public override get hasNoNulls(): boolean {
        return hasNoNullsByArray(this._reference,)
    }

    //#endregion -------------------- Has null --------------------
    //#region -------------------- Has duplicate --------------------

    public override get hasDuplicate(): boolean {
        return hasDuplicateByArray(this._reference,)
    }

    public override get hasNoDuplicates(): boolean {
        return hasNoDuplicatesByArray(this._reference,)
    }

    //#endregion -------------------- Has duplicate --------------------

    //#region -------------------- Has --------------------

    public override has(value: T,): boolean {
        return hasByArray(this._reference, value,)
    }

    public override hasNot(value: T,): boolean {
        return hasNotByArray(this._reference, value,)
    }

    //#endregion -------------------- Has --------------------
    //#region -------------------- Has one --------------------

    protected override _hasOneByArray(values: Array<T>,): boolean {
        return hasOneWithArrayByArray(this._reference, values,)
    }

    protected override _hasOneBySet(values: Set<T>,): boolean {
        return hasOneWithSetByArray(this._reference, values,)
    }

    protected override _hasOneByMinimalistCollectionHolder(values: MinimalistCollectionHolder<T>,): boolean {
        return hasOneWithMinimalistCollectionHolderByArray(this._reference, values,)
    }

    protected override _hasOneByCollectionHolder(values: CollectionHolder<T>,): boolean {
        return hasOneWithCollectionHolderByArray(this._reference, values,)
    }

    protected override _hasOneByCollectionIterator(values: CollectionIterator<T>,): boolean {
        return hasOneWithCollectionIteratorByArray(this._reference, values,)
    }

    protected override _hasOneByIterator(values: Iterator<T, unknown, unknown>,): boolean {
        return hasOneWithIteratorByArray(this._reference, values,)
    }

    protected override _hasOneByIterable(values: Iterable<T, unknown, unknown>,): boolean {
        return hasOneWithIterableByArray(this._reference, values,)
    }

    //#endregion -------------------- Has one --------------------
    //#region -------------------- Has not one --------------------

    protected override _hasNotOneByArray(values: Array<T>,): boolean {
        return hasNotOneWithArrayByArray(this._reference, values,)
    }

    protected override _hasNotOneBySet(values: Set<T>,): boolean {
        return hasNotOneWithSetByArray(this._reference, values,)
    }

    protected override _hasNotOneByMinimalistCollectionHolder(values: MinimalistCollectionHolder<T>,): boolean {
        return hasNotOneWithMinimalistCollectionHolderByArray(this._reference, values,)
    }

    protected override _hasNotOneByCollectionHolder(values: CollectionHolder<T>,): boolean {
        return hasNotOneWithCollectionHolderByArray(this._reference, values,)
    }

    protected override _hasNotOneByCollectionIterator(values: CollectionIterator<T>,): boolean {
        return hasNotOneWithCollectionIteratorByArray(this._reference, values,)
    }

    protected override _hasNotOneByIterator(values: Iterator<T, unknown, unknown>,): boolean {
        return hasNotOneWithIteratorByArray(this._reference, values,)
    }

    protected override _hasNotOneByIterable(values: Iterable<T, unknown, unknown>,): boolean {
        return hasNotOneWithIterableByArray(this._reference, values,)
    }

    //#endregion -------------------- Has not one --------------------
    //#region -------------------- Has all --------------------

    protected override _hasAllByArray(values: Array<T>,): boolean {
        return hasAllWithArrayByArray(this._reference, values,)
    }

    protected override _hasAllBySet(values: Set<T>,): boolean {
        return hasAllWithSetByArray(this._reference, values,)
    }

    protected override _hasAllByMinimalistCollectionHolder(values: MinimalistCollectionHolder<T>,): boolean {
        return hasAllWithMinimalistCollectionHolderByArray(this._reference, values,)
    }

    protected override _hasAllByCollectionHolder(values: CollectionHolder<T>,): boolean {
        return hasAllWithCollectionHolderByArray(this._reference, values,)
    }

    protected override _hasAllByCollectionIterator(values: CollectionIterator<T>,): boolean {
        return hasAllWithCollectionIteratorByArray(this._reference, values,)
    }

    protected override _hasAllByIterator(values: Iterator<T, unknown, unknown>,): boolean {
        return hasAllWithIteratorByArray(this._reference, values,)
    }

    protected override _hasAllByIterable(values: Iterable<T, unknown, unknown>,): boolean {
        return hasAllWithIterableByArray(this._reference, values,)
    }

    //#endregion -------------------- Has all --------------------
    //#region -------------------- Has not all --------------------

    protected override _hasNotAllByArray(values: Array<T>,): boolean {
        return hasNotAllWithArrayByArray(this._reference, values,)
    }

    protected override _hasNotAllBySet(values: Set<T>,): boolean {
        return hasNotAllWithSetByArray(this._reference, values,)
    }

    protected override _hasNotAllByMinimalistCollectionHolder(values: MinimalistCollectionHolder<T>,): boolean {
        return hasNotAllWithMinimalistCollectionHolderByArray(this._reference, values,)
    }

    protected override _hasNotAllByCollectionHolder(values: CollectionHolder<T>,): boolean {
        return hasNotAllWithCollectionHolderByArray(this._reference, values,)
    }

    protected override _hasNotAllByCollectionIterator(values: CollectionIterator<T>,): boolean {
        return hasNotAllWithCollectionIteratorByArray(this._reference, values,)
    }

    protected override _hasNotAllByIterator(values: Iterator<T, unknown, unknown>,): boolean {
        return hasNotAllWithIteratorByArray(this._reference, values,)
    }

    protected override _hasNotAllByIterable(values: Iterable<T, unknown, unknown>,): boolean {
        return hasNotAllWithIterableByArray(this._reference, values,)
    }

    //#endregion -------------------- Has not all --------------------

    //#region -------------------- Require no nulls --------------------

    public override requireNoNulls(): CollectionHolder<NonNullable<T>> {
        requireNoNullsByArray(this._reference,)
        return this as CollectionHolder<NonNullable<T>>
    }

    //#endregion -------------------- Require no nulls --------------------

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    public override filter<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filter(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filter(predicate: BooleanCallback<T>,) {
        return filterByArray(this._reference, predicate,)
    }

    public override filterIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,) {
        return filterIndexedByArray(this._reference, predicate,)
    }


    public override filterNot<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filterNot(predicate: BooleanCallback<T>,) {
        return filterNotByArray(this._reference, predicate,)
    }

    public override filterNotIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,) {
        return filterNotIndexedByArray(this._reference, predicate,)
    }


    public override filterNotNull(): CollectionHolder<NonNullable<T>> {
        return filterNotNullByArray(this._reference,)
    }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Slice --------------------

    protected override _sliceWith0Argument(): CollectionHolder<T> {
        return sliceWithARangeByArray(this._reference,)
    }

    protected override _sliceWith1Argument(from: number,): CollectionHolder<T> {
        return sliceWithARangeByArray(this._reference, from,)
    }

    protected override _sliceWith2Argument(from: number, to: number,): CollectionHolder<T> {
        return sliceWithARangeByArray(this._reference, from, to,)
    }

    protected override _sliceWith2ArgumentWhere1stIsNull(from: NullOrUndefined, to: number,): CollectionHolder<T> {
        return sliceWithARangeByArray(this._reference, from, to,)
    }

    protected override _sliceByArray(indices: NumberArray,): CollectionHolder<T> {
        return sliceWithArrayByArray(this._reference, indices,)
    }

    protected override _sliceBySet(indices: NumberSet,): CollectionHolder<T> {
        return sliceWithSetByArray(this._reference, indices,)
    }

    protected override _sliceByMinimalistCollectionHolder(indices: MinimalistCollectionHolder<number>,): CollectionHolder<T> {
        return sliceWithMinimalistCollectionHolderByArray(this._reference, indices,)
    }

    protected override _sliceByCollectionHolder(indices: CollectionHolder<number>,): CollectionHolder<T> {
        return sliceWithCollectionHolderByArray(this._reference, indices,)
    }

    protected override _sliceByCollectionIterator(indices: CollectionIterator<number>,): CollectionHolder<T> {
        return sliceWithCollectionIteratorByArray(this._reference, indices,)
    }

    protected override _sliceByIterator(indices: Iterator<number, unknown, unknown>,): CollectionHolder<T> {
        return sliceWithIteratorByArray(this._reference, indices,)
    }

    protected override _sliceByIterable(indices: Iterable<number, unknown, unknown>,): CollectionHolder<T> {
        return sliceWithIterableByArray(this._reference, indices,)
    }

    //#endregion -------------------- Slice --------------------
    //#region -------------------- Take --------------------

    public override take(n: number,): CollectionHolder<T> {
        return takeByArray(this._reference, n,)
    }

    public override takeWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override takeWhile(predicate: BooleanCallback<T>,) {
        return takeWhileByArray(this._reference, predicate,)
    }

    public override takeWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return takeWhileIndexedByArray(this._reference, predicate,)
    }


    public override takeLast(n: number,): CollectionHolder<T> {
        return takeLastByArray(this._reference, n,)
    }

    public override takeLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override takeLastWhile(predicate: BooleanCallback<T>,) {
        return takeLastWhileByArray(this._reference, predicate,)
    }

    public override takeLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return takeLastWhileIndexedByArray(this._reference, predicate,)
    }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Drop --------------------

    public override drop(n: number,): CollectionHolder<T> {
        return dropByArray(this._reference, n,)
    }

    public override dropWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override dropWhile(predicate: BooleanCallback<T>,) {
        return dropWhileByArray(this._reference, predicate,)
    }

    public override dropWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return dropWhileIndexedByArray(this._reference, predicate,)
    }


    public override dropLast(n: number,): CollectionHolder<T> {
        return dropLastByArray(this._reference, n,)
    }

    public override dropLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override dropLastWhile(predicate: BooleanCallback<T>,) {
        return dropLastWhileByArray(this._reference, predicate,)
    }

    public override dropLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return dropLastWhileIndexedByArray(this._reference, predicate,)
    }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Map --------------------

    public override map<const U, >(transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U> {
        return mapByArray(this._reference, transform,)
    }

    public override mapIndexed<const U, >(transform: IndexValueWithReturnCallback<T, U>,): CollectionHolder<U> {
        return mapIndexedByArray(this._reference, transform,)
    }


    public override mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNullByArray(this._reference, transform,)
    }

    public override mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNullIndexedByArray(this._reference, transform,)
    }

    //#endregion -------------------- Map --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- For each --------------------

    public override forEach(action: ValueIndexCallback<T>,): void {
        forEachByArray(this._reference, action,)
    }

    public override forEachIndexed(action: IndexValueCallback<T>,): void {
        forEachIndexedByArray(this._reference, action,)
    }

    //#endregion -------------------- For each --------------------
    //#region -------------------- On each --------------------

    public override onEach(action: ValueIndexCallback<T>,): this {
        forEachByArray(this._reference, action,)
        return this
    }

    public override onEachIndexed(action: IndexValueCallback<T>,): this {
        forEachIndexedByArray(this._reference, action,)
        return this
    }

    //#endregion -------------------- On each --------------------

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    //#region -------------------- To reverse --------------------

    public override toReverse(from?: NullableNumber, to?: NullableNumber,): CollectionHolder<T> {
        return toReverseByArray(this._reference, from, to,)
    }

    //#endregion -------------------- To reverse --------------------

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- Conversion methods --------------------

    //#region -------------------- To other structure --------------------

    public override toIterator(): CollectionIterator<T> {
        return toIteratorByArray(this._reference,)
    }

    public override toArray(): Array<T> {
        return toArrayByArray(this._reference,)
    }

    public override toMutableArray(): MutableArray<T> {
        return toMutableArrayByArray(this._reference,)
    }

    public override toSet(): Set<T> {
        return toSetByArray(this._reference,)
    }

    public override toMutableSet(): MutableSet<T> {
        return toMutableSetByArray(this._reference,)
    }

    public override toMap(): NumberKeyMap<T> {
        return toMapByArray(this._reference,)
    }

    public override toMutableMap(): MutableNumberKeyMap<T> {
        return toMutableMapByArray(this._reference,)
    }

    //#endregion -------------------- To other structure --------------------
    //#region -------------------- To string --------------------

    public override toString(): string {
        return toStringByArray(this._reference,)
    }

    public override toLocaleString(locale?: NullableString,): string {
        if (arguments.length === 0)
            return toLocaleStringByArray(this._reference,)
        return toLocaleStringByArray(this._reference, locale,)
    }


    public override toLowerCaseString(): string {
        return toLowerCaseStringByArray(this._reference,)
    }

    public override toLocaleLowerCaseString(locale?: NullableString,): string {
        if (arguments.length === 0)
            return toLocaleLowerCaseStringByArray(this._reference,)
        return toLocaleLowerCaseStringByArray(this._reference, locale,)
    }


    public override toUpperCaseString(): string {
        return toUpperCaseStringByArray(this._reference,)
    }

    public override toLocaleUpperCaseString(locale?: NullableString,): string {
        if (arguments.length === 0)
            return toLocaleUpperCaseStringByArray(this._reference,)
        return toLocaleUpperCaseStringByArray(this._reference, locale,)
    }

    //#endregion -------------------- To string --------------------
    //#region -------------------- Join to string --------------------

    public override joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string {
        return joinToStringByArray(this._reference, separator, prefix, postfix, limit, truncated, transform,)
    }

    //#endregion -------------------- Join to string --------------------

    //#endregion -------------------- Conversion methods --------------------

    //#endregion -------------------- Methods --------------------

}

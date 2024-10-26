/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullableNumber, NullableString, NullOr, NullOrNumber, NullOrUndefined, TemplateOrNumber, UndefinedOr} from "@joookiwi/type"

import type {BooleanCallback, CollectionHolderName, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, PossibleIterableArraySetOrCollectionHolder, RestrainedBooleanCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, StringCallback, ValueIndexCallback, ValueIndexWithReturnCallback} from "./CollectionHolder.types"
import type {CollectionHolder}                                                                                                                                                                                                                                                                                                    from "./CollectionHolder"
import type {MinimalistCollectionHolder}                                                                                                                                                                                                                                                                                          from "./MinimalistCollectionHolder"
import type {CollectionIterator}                                                                                                                                                                                                                                                                                                  from "./iterator/CollectionIterator"

import {AbstractMinimalistCollectionHolder}                     from "./AbstractMinimalistCollectionHolder"
import {allByCollectionHolder}                                  from "./method/all"
import {anyByCollectionHolder}                                  from "./method/any"
import {dropByCollectionHolder}                                 from "./method/drop"
import {dropLastByCollectionHolder}                             from "./method/dropLast"
import {dropLastWhileByCollectionHolder}                        from "./method/dropLastWhile"
import {dropLastWhileIndexedByCollectionHolder}                 from "./method/dropLastWhileIndexed"
import {dropWhileByCollectionHolder}                            from "./method/dropWhile"
import {dropWhileIndexedByCollectionHolder}                     from "./method/dropWhileIndexed"
import {filterByCollectionHolder}                               from "./method/filter"
import {filterIndexedByCollectionHolder}                        from "./method/filterIndexed"
import {filterNotByCollectionHolder}                            from "./method/filterNot"
import {filterNotIndexedByCollectionHolder}                     from "./method/filterNotIndexed"
import {filterNotNullByCollectionHolder}                        from "./method/filterNotNull"
import {findFirstByCollectionHolder}                            from "./method/findFirst"
import {findFirstIndexedByCollectionHolder}                     from "./method/findFirstIndexed"
import {findFirstIndexedOrNullByCollectionHolder}               from "./method/findFirstIndexedOrNull"
import {findFirstOrNullByCollectionHolder}                      from "./method/findFirstOrNull"
import {findLastByCollectionHolder}                             from "./method/findLast"
import {findLastIndexedByCollectionHolder}                      from "./method/findLastIndexed"
import {findLastIndexedOrNullByCollectionHolder}                from "./method/findLastIndexedOrNull"
import {findLastOrNullByCollectionHolder}                       from "./method/findLastOrNull"
import {forEachByCollectionHolder}                              from "./method/forEach"
import {forEachIndexedByCollectionHolder}                       from "./method/forEachIndexed"
import {getFirstByCollectionHolder}                             from "./method/getFirst"
import {getFirstOrNullByCollectionHolder}                       from "./method/getFirstOrNull"
import {getLastByCollectionHolder}                              from "./method/getLast"
import {getLastOrNullByCollectionHolder}                        from "./method/getLastOrNull"
import {getOrElseByCollectionHolder}                            from "./method/getOrElse"
import {getOrNullByCollectionHolder}                            from "./method/getOrNull"
import {hasByCollectionHolder}                                  from "./method/has"
import {hasAllWithArrayByCollectionHolder}                      from "./method/hasAll.withArray"
import {hasAllWithCollectionHolderByCollectionHolder}           from "./method/hasAll.withCollectionHolder"
import {hasAllWithCollectionIteratorByCollectionHolder}         from "./method/hasAll.withCollectionIterator"
import {hasAllWithIterableByCollectionHolder}                   from "./method/hasAll.withIterable"
import {hasAllWithMinimalistCollectionHolderByCollectionHolder} from "./method/hasAll.withMinimalistCollectionHolder"
import {hasAllWithSetByCollectionHolder}                        from "./method/hasAll.withSet"
import {hasNullByCollectionHolder}                              from "./method/hasNull"
import {hasDuplicateByCollectionHolder}                         from "./method/hasDuplicate"
import {hasOneWithArrayByCollectionHolder}                      from "./method/hasOne.withArray"
import {hasOneWithCollectionHolderByCollectionHolder}           from "./method/hasOne.withCollectionHolder"
import {hasOneWithCollectionIteratorByCollectionHolder}         from "./method/hasOne.withCollectionIterator"
import {hasOneWithIterableByCollectionHolder}                   from "./method/hasOne.withIterable"
import {hasOneWithMinimalistCollectionHolderByCollectionHolder} from "./method/hasOne.withMinimalistCollectionHolder"
import {hasOneWithSetByCollectionHolder}                        from "./method/hasOne.withSet"
import {indexOfByCollectionHolder}                              from "./method/indexOf"
import {indexOfFirstByCollectionHolder}                         from "./method/indexOfFirst"
import {indexOfFirstIndexedByCollectionHolder}                  from "./method/indexOfFirstIndexed"
import {indexOfLastByCollectionHolder}                          from "./method/indexOfLast"
import {indexOfLastIndexedByCollectionHolder}                   from "./method/indexOfLastIndexed"
import {isArray}                                                from "./method/isArray"
import {isArrayByStructure}                                     from "./method/isArrayByStructure"
import {isCollectionHolder}                                     from "./method/isCollectionHolder"
import {isCollectionHolderByStructure}                          from "./method/isCollectionHolderByStructure"
import {isCollectionIterator}                                   from "./method/isCollectionIterator"
import {isCollectionIteratorByStructure}                        from "./method/isCollectionIteratorByStructure"
import {isMinimalistCollectionHolder}                           from "./method/isMinimalistCollectionHolder"
import {isMinimalistCollectionHolderByStructure}                from "./method/isMinimalistCollectionHolderByStructure"
import {isEmptyByCollectionHolder}                              from "./method/isEmpty"
import {isNotEmptyByCollectionHolder}                           from "./method/isNotEmpty"
import {isSet}                                                  from "./method/isSet"
import {isSetByStructure}                                       from "./method/isSetByStructure"
import {joinToStringByCollectionHolder}                         from "./method/joinToString"
import {lastIndexOfByCollectionHolder}                          from "./method/lastIndexOf"
import {noneByCollectionHolder}                                 from "./method/none"
import {mapByCollectionHolder}                                  from "./method/map"
import {mapIndexedByCollectionHolder}                           from "./method/mapIndexed"
import {mapNotNullByCollectionHolder}                           from "./method/mapNotNull"
import {mapNotNullIndexedByCollectionHolder}                    from "./method/mapNotNullIndexed"
import {onEachByCollectionHolder}                               from "./method/onEach"
import {onEachIndexedByCollectionHolder}                        from "./method/onEachIndexed"
import {requireNoNullsByCollectionHolder}                       from "./method/requireNoNulls"
import {sliceWithARangeByCollectionHolder}                      from "./method/slice.withARange"
import {sliceWithArrayByCollectionHolder}                       from "./method/slice.withArray"
import {sliceWithCollectionHolderByCollectionHolder}            from "./method/slice.withCollectionHolder"
import {sliceWithCollectionIteratorByCollectionHolder}          from "./method/slice.withCollectionIterator"
import {sliceWithIterableByCollectionHolder}                    from "./method/slice.withIterable"
import {sliceWithMinimalistCollectionHolderByCollectionHolder}  from "./method/slice.withMinimalistCollectionHolder"
import {sliceWithSetByCollectionHolder}                         from "./method/slice.withSet"
import {takeByCollectionHolder}                                 from "./method/take"
import {takeLastByCollectionHolder}                             from "./method/takeLast"
import {takeLastWhileByCollectionHolder}                        from "./method/takeLastWhile"
import {takeLastWhileIndexedByCollectionHolder}                 from "./method/takeLastWhileIndexed"
import {takeWhileByCollectionHolder}                            from "./method/takeWhile"
import {takeWhileIndexedByCollectionHolder}                     from "./method/takeWhileIndexed"
import {toArrayByCollectionHolder}                              from "./method/toArray"
import {toIteratorByCollectionHolder}                           from "./method/toIterator"
import {toLocaleLowerCaseStringByCollectionHolder}              from "./method/toLocaleLowerCaseString"
import {toLocaleStringByCollectionHolder}                       from "./method/toLocaleString"
import {toLocaleUpperCaseStringByCollectionHolder}              from "./method/toLocaleUpperCaseString"
import {toLowerCaseStringByCollectionHolder}                    from "./method/toLowerCaseString"
import {toMapByCollectionHolder}                                from "./method/toMap"
import {toMutableArrayByCollectionHolder}                       from "./method/toMutableArray"
import {toMutableMapByCollectionHolder}                         from "./method/toMutableMap"
import {toMutableSetByCollectionHolder}                         from "./method/toMutableSet"
import {toReverseByCollectionHolder}                            from "./method/toReverse"
import {toSetByCollectionHolder}                                from "./method/toSet"
import {toStringByCollectionHolder}                             from "./method/toString"
import {toUpperCaseStringByCollectionHolder}                    from "./method/toUpperCaseString"

/**
 * A definition of a {@link CollectionHolder} to have a common ancestor.
 * No state or reference is held in this instance.
 * It only uses the extension function for the method implementations.
 *
 * @note The non-aliased described by the {@link CollectionHolder} are called when possible
 * @note This class should be inherited if new classes are being made to be more usable by the tools
 * @see EmptyCollectionHolder
 * @see GenericCollectionHolder
 * @see LazyGenericCollectionHolder
 */
export abstract class AbstractCollectionHolder<const T = unknown, >
    extends AbstractMinimalistCollectionHolder<T>
    implements CollectionHolder<T> {

    //#region -------------------- Fields --------------------

    [index: TemplateOrNumber]: UndefinedOr<T>

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    protected constructor() { super() }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Size methods --------------------

    public get length(): this["size"] { return this.size }
    public get count(): this["size"] { return this.size }

    public get isEmpty(): boolean { return isEmptyByCollectionHolder(this,) }

    public get isNotEmpty(): boolean { return isNotEmptyByCollectionHolder(this,) }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    public at(index: number,): T {
        return this.get(index,)
    }

    public elementAt(index: number,): T {
        return this.get(index,)
    }

    //#endregion -------------------- Get --------------------
    //#region -------------------- Get first --------------------

    public getFirst(): T {
        return getFirstByCollectionHolder<T>(this,)
    }

    //#endregion -------------------- Get first --------------------
    //#region -------------------- Get last --------------------

    public getLast(): T {
        return getLastByCollectionHolder<T>(this,)
    }

    //#endregion -------------------- Get last --------------------

    //#region -------------------- Get or else --------------------

    public getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public getOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) {
        return getOrElseByCollectionHolder(this, index, defaultValue,)
    }

    public atOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public atOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public atOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) {
        return this.getOrElse(index, defaultValue,)
    }

    public elementAtOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public elementAtOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public elementAtOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) {
        return this.getOrElse(index, defaultValue,)
    }

    //#endregion -------------------- Get or else --------------------

    //#region -------------------- Get or null --------------------

    public getOrNull(index: number,): NullOr<T> {
        return getOrNullByCollectionHolder<T>(this, index,)
    }

    public atOrNull(index: number,): NullOr<T> {
        return this.getOrNull(index,)
    }

    public elementAtOrNull(index: number,): NullOr<T> {
        return this.getOrNull(index,)
    }

    //#endregion -------------------- Get or null --------------------
    //#region -------------------- Get first or null --------------------

    public getFirstOrNull(): NullOr<T> {
        return getFirstOrNullByCollectionHolder(this,)
    }

    //#endregion -------------------- Get first or null --------------------
    //#region -------------------- Get last or null --------------------

    public getLastOrNull(): NullOr<T> {
        return getLastOrNullByCollectionHolder(this,)
    }

    //#endregion -------------------- Get last or null --------------------

    //#region -------------------- First --------------------

    public first(): T
    public first<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): S
    public first(predicate: Nullable<BooleanCallback<T>>,): T
    public first(predicate?: Nullable<BooleanCallback<T>>,) {
        if (predicate == null)
            return this.getFirst()
        return this.findFirst(predicate,)
    }

    //#endregion -------------------- First --------------------
    //#region -------------------- First or null --------------------

    public firstOrNull(): NullOr<T>
    public firstOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public firstOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
    public firstOrNull(predicate?: Nullable<BooleanCallback<T>>,) {
        if (predicate == null)
            return this.getFirstOrNull()
        return this.findFirstOrNull(predicate,)
    }

    //#endregion -------------------- First or null --------------------
    //#region -------------------- First indexed --------------------

    public firstIndexed(): T
    public firstIndexed<const S extends T, >(predicate: Nullable<ReverseRestrainedBooleanCallback<T, S>>,): S
    public firstIndexed(predicate: Nullable<ReverseBooleanCallback<T>>,): T
    public firstIndexed(predicate?: Nullable<ReverseBooleanCallback<T>>,) {
        if (predicate == null)
            return this.getFirst()
        return this.findFirstIndexed(predicate,)
    }

    //#endregion -------------------- First indexed --------------------
    //#region -------------------- First indexed or null --------------------

    public firstIndexedOrNull(): NullOr<T>
    public firstIndexedOrNull<const S extends T, >(predicate: Nullable<ReverseRestrainedBooleanCallback<T, S>>,): NullOr<S>
    public firstIndexedOrNull(predicate: Nullable<ReverseBooleanCallback<T>>,): NullOr<T>
    public firstIndexedOrNull(predicate?: Nullable<ReverseBooleanCallback<T>>,) {
        if (predicate == null)
            return this.getFirstOrNull()
        return this.findFirstIndexedOrNull(predicate,)
    }

    //#endregion -------------------- First indexed or null --------------------

    //#region -------------------- Last --------------------

    public last(): T
    public last<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): S
    public last(predicate: Nullable<BooleanCallback<T>>,): T
    public last(predicate?: Nullable<BooleanCallback<T>>,) {
        if (predicate == null)
            return this.getLast()
        return this.findLast(predicate,)
    }

    //#endregion -------------------- Last --------------------
    //#region -------------------- Last or null --------------------

    public lastOrNull(): NullOr<T>
    public lastOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public lastOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
    public lastOrNull(predicate?: Nullable<BooleanCallback<T>>,) {
        if (predicate == null)
            return this.getLastOrNull()
        return this.findLastOrNull(predicate,)
    }

    //#endregion -------------------- Last or null --------------------
    //#region -------------------- Last indexed --------------------

    public lastIndexed(): T
    public lastIndexed<const S extends T, >(predicate: Nullable<ReverseRestrainedBooleanCallback<T, S>>,): S
    public lastIndexed(predicate: Nullable<ReverseBooleanCallback<T>>,): T
    public lastIndexed(predicate?: Nullable<ReverseBooleanCallback<T>>,) {
        if (predicate == null)
            return this.getLast()
        return this.findLastIndexed(predicate,)
    }

    //#endregion -------------------- Last indexed --------------------
    //#region -------------------- Last indexed or null --------------------

    public lastIndexedOrNull(): NullOr<T>
    public lastIndexedOrNull<const S extends T, >(predicate: Nullable<ReverseRestrainedBooleanCallback<T, S>>,): NullOr<S>
    public lastIndexedOrNull(predicate: Nullable<ReverseBooleanCallback<T>>,): NullOr<T>
    public lastIndexedOrNull(predicate?: Nullable<ReverseBooleanCallback<T>>,) {
        if (predicate == null)
            return this.getLastOrNull()
        return this.findLastIndexedOrNull(predicate,)
    }

    //#endregion -------------------- Last indexed or null --------------------

    //#region -------------------- Find first --------------------

    public findFirst<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public findFirst(predicate: BooleanCallback<T>,): T
    public findFirst(predicate: BooleanCallback<T>,) {
        return findFirstByCollectionHolder(this, predicate,)
    }

    public find<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public find(predicate: BooleanCallback<T>,): T
    public find(predicate: BooleanCallback<T>,) {
        return this.findFirst(predicate,)
    }

    //#endregion -------------------- Find first --------------------
    //#region -------------------- Find first or null --------------------

    public findFirstOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public findFirstOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public findFirstOrNull(predicate: BooleanCallback<T>,) {
        return findFirstOrNullByCollectionHolder(this, predicate,)
    }

    public findOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public findOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public findOrNull(predicate: BooleanCallback<T>,) {
        return this.findFirstOrNull(predicate,)
    }

    //#endregion -------------------- Find first or null --------------------
    //#region -------------------- Find first indexed --------------------

    public findFirstIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public findFirstIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public findFirstIndexed(predicate: ReverseBooleanCallback<T>,) {
        return findFirstIndexedByCollectionHolder(this, predicate,)
    }

    public findIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public findIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public findIndexed(predicate: ReverseBooleanCallback<T>,) {
        return this.findFirstIndexed(predicate,)
    }

    //#endregion -------------------- Find first indexed --------------------
    //#region -------------------- Find first indexed or null --------------------

    public findFirstIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,) {
        return findFirstIndexedOrNullByCollectionHolder(this, predicate,)
    }

    public findIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public findIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public findIndexedOrNull(predicate: ReverseBooleanCallback<T>,) {
        return this.findFirstIndexedOrNull(predicate,)
    }

    //#endregion -------------------- Find first indexed or null --------------------

    //#region -------------------- Find last --------------------

    public findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public findLast(predicate: BooleanCallback<T>,): T
    public findLast(predicate: BooleanCallback<T>,) {
        return findLastByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Find last --------------------
    //#region -------------------- Find last or null --------------------

    public findLastOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public findLastOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public findLastOrNull(predicate: BooleanCallback<T>,) {
        return findLastOrNullByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Find last or null --------------------
    //#region -------------------- Find last indexed --------------------

    public findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public findLastIndexed(predicate: ReverseBooleanCallback<T>,): T
    public findLastIndexed(predicate: ReverseBooleanCallback<T>,) {
        return findLastIndexedByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Find last indexed --------------------
    //#region -------------------- Find last indexed or null --------------------

    public findLastIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,) {
        return findLastIndexedOrNullByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Find last indexed or null --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    //#region -------------------- Index of --------------------

    public indexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber {
        return indexOfByCollectionHolder(this, element, fromIndex, toIndex,)
    }

    //#endregion -------------------- Index of --------------------

    //#region -------------------- Last index of --------------------

    public lastIndexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber {
        return lastIndexOfByCollectionHolder(this, element, fromIndex, toIndex,)
    }

    //#endregion -------------------- Last index of --------------------

    //#region -------------------- Index of first --------------------

    public indexOfFirst(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber {
        return indexOfFirstByCollectionHolder(this, predicate, fromIndex, toIndex,)
    }

    public findIndex(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber {
        return this.indexOfFirst(predicate, fromIndex, toIndex,)
    }

    //#endregion -------------------- Index of first --------------------
    //#region -------------------- Index of first indexed --------------------

    public indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber {
        return indexOfFirstIndexedByCollectionHolder(this, predicate, fromIndex, toIndex,)
    }

    public findIndexIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber {
        return this.indexOfFirstIndexed(predicate, fromIndex, toIndex,)
    }

    //#endregion -------------------- Index of first indexed --------------------

    //#region -------------------- Index of last --------------------

    public indexOfLast(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber {
        return indexOfLastByCollectionHolder(this, predicate, fromIndex, toIndex,)
    }

    public findLastIndex(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber {
        return this.indexOfLast(predicate, fromIndex, toIndex,)
    }

    //#endregion -------------------- Index of last --------------------
    //#region -------------------- Index of last indexed --------------------

    public indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber {
        return indexOfLastIndexedByCollectionHolder(this, predicate, fromIndex, toIndex,)
    }

    public findLastIndexIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber {
        return this.indexOfLastIndexed(predicate, fromIndex, toIndex,)
    }

    //#endregion -------------------- Index of last indexed --------------------

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    //#region -------------------- All --------------------

    public all<S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolder<S>
    public all(predicate: BooleanCallback<T>,): boolean
    public all(predicate: BooleanCallback<T>,) {
        return allByCollectionHolder(this, predicate,)
    }

    public every<S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolder<S>
    public every(predicate: BooleanCallback<T>,): boolean
    public every(predicate: BooleanCallback<T>,) {
        return this.all(predicate,)
    }

    //#endregion -------------------- All --------------------
    //#region -------------------- Any --------------------

    public any(): this["isNotEmpty"]
    public any(predicate: Nullable<BooleanCallback<T>>,): boolean
    public any(predicate?: Nullable<BooleanCallback<T>>,) {
        if (predicate == null)
            return this.isNotEmpty
        return this._any(predicate,)
    }

    public some(): this["isNotEmpty"]
    public some(predicate: Nullable<BooleanCallback<T>>,): boolean
    public some(predicate?: Nullable<BooleanCallback<T>>,) {
        if (arguments.length === 0)
            return this.any()
        return this.any(predicate,)
    }


    /** An additional method to be the equivalent of {@link CollectionHolder.any CollectionHolder.any(predicate)} */
    protected _any(predicate: BooleanCallback<T>,): boolean { return anyByCollectionHolder(this, predicate,) }

    //#endregion -------------------- Any --------------------
    //#region -------------------- None --------------------

    public none(): this["isEmpty"]
    public none(predicate: Nullable<BooleanCallback<T>>,): boolean
    public none(predicate?: Nullable<BooleanCallback<T>>,) {
        if (predicate == null)
            return this.isEmpty
        return this._none(predicate,)
    }


    /** An additional method to be the equivalent of {@link CollectionHolder.none CollectionHolder.none(predicate)} */
    protected _none(predicate: BooleanCallback<T>,): boolean { return noneByCollectionHolder(this, predicate,) }

    //#endregion -------------------- None --------------------

    //#region -------------------- Has null --------------------

    public get hasNull(): boolean { return hasNullByCollectionHolder(this,) }
    public get includesNull(): this["hasNull"] { return this.hasNull }
    public get containsNull(): this["hasNull"] { return this.hasNull }

    //#endregion -------------------- Has null --------------------
    //#region -------------------- Has duplicate --------------------

    public get hasDuplicate(): boolean { return hasDuplicateByCollectionHolder(this,) }
    public get includesDuplicate(): this["hasDuplicate"] { return this.hasDuplicate }
    public get containsDuplicate(): this["hasDuplicate"] { return this.hasDuplicate }

    //#endregion -------------------- Has duplicate --------------------

    //#region -------------------- Has --------------------

    public has(value: T,): boolean {
        return hasByCollectionHolder(this, value,)
    }

    public includes(value: T,): boolean {
        return this.has(value,)
    }

    public contains(value: T,): boolean {
        return this.has(value,)
    }

    //#endregion -------------------- Has --------------------
    //#region -------------------- Has one --------------------

    public hasOne(values: readonly T[],): boolean
    public hasOne(values: ReadonlySet<T>,): boolean
    public hasOne(values: CollectionHolder<T>,): boolean
    public hasOne(values: MinimalistCollectionHolder<T>,): boolean
    public hasOne(values: CollectionIterator<T>,): boolean
    public hasOne(values: Iterable<T>,): boolean
    public hasOne(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
    public hasOne(values: PossibleIterableArraySetOrCollectionHolder<T>,) {
        if (isArray(values))
            return this._hasOneByArray(values,)
        if (isSet(values))
            return this._hasOneBySet(values,)
        if (isCollectionHolder(values))
            return this._hasOneByCollectionHolder(values,)
        if (isMinimalistCollectionHolder(values,))
            return this._hasOneByMinimalistCollectionHolder(values,)
        if (isCollectionIterator(values,))
            return this._hasOneByCollectionIterator(values,)
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
        return this._hasOneByIterable(values,)
    }

    public includesOne(values: readonly T[],): boolean
    public includesOne(values: ReadonlySet<T>,): boolean
    public includesOne(values: CollectionHolder<T>,): boolean
    public includesOne(values: MinimalistCollectionHolder<T>,): boolean
    public includesOne(values: CollectionIterator<T>,): boolean
    public includesOne(values: Iterable<T>,): boolean
    public includesOne(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
    public includesOne(values: PossibleIterableArraySetOrCollectionHolder<T>,) {
        return this.hasOne(values,)
    }

    public containsOne(values: readonly T[],): boolean
    public containsOne(values: ReadonlySet<T>,): boolean
    public containsOne(values: CollectionHolder<T>,): boolean
    public containsOne(values: MinimalistCollectionHolder<T>,): boolean
    public containsOne(values: CollectionIterator<T>,): boolean
    public containsOne(values: Iterable<T>,): boolean
    public containsOne(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
    public containsOne(values: PossibleIterableArraySetOrCollectionHolder<T>,) {
        return this.hasOne(values,)
    }


    /** An additional method to be the equivalent of {@link CollectionHolder.hasOne CollectionHolder.hasOne(values)} */
    protected _hasOneByArray(values: readonly T[],): boolean {
        return hasOneWithArrayByCollectionHolder(this, values,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasOne CollectionHolder.hasOne(values)} */
    protected _hasOneBySet(values: ReadonlySet<T>,): boolean {
        return hasOneWithSetByCollectionHolder(this, values,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasOne CollectionHolder.hasOne(values)} */
    protected _hasOneByMinimalistCollectionHolder(values: MinimalistCollectionHolder<T>,): boolean {
        return hasOneWithMinimalistCollectionHolderByCollectionHolder(this, values,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasOne CollectionHolder.hasOne(values)} */
    protected _hasOneByCollectionHolder(values: CollectionHolder<T>,): boolean {
        return hasOneWithCollectionHolderByCollectionHolder(this, values,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasOne CollectionHolder.hasOne(values)} */
    protected _hasOneByCollectionIterator(values: CollectionIterator<T>,): boolean {
        return hasOneWithCollectionIteratorByCollectionHolder(this, values,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasOne CollectionHolder.hasOne(values)} */
    protected _hasOneByIterable(values: Iterable<T>,): boolean {
        return hasOneWithIterableByCollectionHolder(this, values,)
    }

    //#endregion -------------------- Has one --------------------
    //#region -------------------- Has all --------------------

    public hasAll(values: readonly T[],): boolean
    public hasAll(values: ReadonlySet<T>,): boolean
    public hasAll(values: CollectionHolder<T>,): boolean
    public hasAll(values: MinimalistCollectionHolder<T>,): boolean
    public hasAll(values: CollectionIterator<T>,): boolean
    public hasAll(values: Iterable<T>,): boolean
    public hasAll(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
    public hasAll(values: PossibleIterableArraySetOrCollectionHolder<T>,) {
        if (isArray(values))
            return this._hasAllByArray(values,)
        if (isSet(values))
            return this._hasAllBySet(values,)
        if (isCollectionHolder(values))
            return this._hasAllByCollectionHolder(values,)
        if (isMinimalistCollectionHolder(values,))
            return this._hasAllByMinimalistCollectionHolder(values,)
        if (isCollectionIterator(values,))
            return this._hasAllByCollectionIterator(values,)
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
        return this._hasAllByIterable(values,)
    }

    public includesAll(values: readonly T[],): boolean
    public includesAll(values: ReadonlySet<T>,): boolean
    public includesAll(values: CollectionHolder<T>,): boolean
    public includesAll(values: MinimalistCollectionHolder<T>,): boolean
    public includesAll(values: CollectionIterator<T>,): boolean
    public includesAll(values: Iterable<T>,): boolean
    public includesAll(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
    public includesAll(values: PossibleIterableArraySetOrCollectionHolder<T>,) {
        return this.hasAll(values,)
    }

    public containsAll(values: readonly T[],): boolean
    public containsAll(values: ReadonlySet<T>,): boolean
    public containsAll(values: CollectionHolder<T>,): boolean
    public containsAll(values: CollectionHolder<T>,): boolean
    public containsAll(values: MinimalistCollectionHolder<T>,): boolean
    public containsAll(values: CollectionIterator<T>,): boolean
    public containsAll(values: Iterable<T>,): boolean
    public containsAll(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
    public containsAll(values: PossibleIterableArraySetOrCollectionHolder<T>,) {
        return this.hasAll(values,)
    }


    /** An additional method to be the equivalent of {@link CollectionHolder.hasAll CollectionHolder.hasAll(values)} */
    protected _hasAllByArray(values: readonly T[],): boolean {
        return hasAllWithArrayByCollectionHolder(this, values,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasAll CollectionHolder.hasAll(values)} */
    protected _hasAllBySet(values: ReadonlySet<T>,): boolean {
        return hasAllWithSetByCollectionHolder(this, values,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasAll CollectionHolder.hasAll(values)} */
    protected _hasAllByMinimalistCollectionHolder(values: MinimalistCollectionHolder<T>,): boolean {
        return hasAllWithMinimalistCollectionHolderByCollectionHolder(this, values,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasAll CollectionHolder.hasAll(values)} */
    protected _hasAllByCollectionHolder(values: CollectionHolder<T>,): boolean {
        return hasAllWithCollectionHolderByCollectionHolder(this, values,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasAll CollectionHolder.hasAll(values)} */
    protected _hasAllByCollectionIterator(values: CollectionIterator<T>,): boolean {
        return hasAllWithCollectionIteratorByCollectionHolder(this, values,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.hasAll CollectionHolder.hasAll(values)} */
    protected _hasAllByIterable(values: Iterable<T>,): boolean {
        return hasAllWithIterableByCollectionHolder(this, values,)
    }

    //#endregion -------------------- Has all --------------------

    //#region -------------------- Require no nulls --------------------

    public requireNoNulls(): CollectionHolder<NonNullable<T>> {
        return requireNoNullsByCollectionHolder<T>(this,)
    }

    //#endregion -------------------- Require no nulls --------------------

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    public filter<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public filter(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public filter(predicate: BooleanCallback<T>,) {
        return filterByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Filter indexed --------------------

    public filterIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public filterIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public filterIndexed(predicate: ReverseBooleanCallback<T>,) {
        return filterIndexedByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Filter indexed --------------------

    //#region -------------------- Filter not --------------------

    public filterNot<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public filterNot(predicate: BooleanCallback<T>,) {
        return filterNotByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Filter not --------------------
    //#region -------------------- Filter not indexed --------------------

    public filterNotIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public filterNotIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public filterNotIndexed(predicate: ReverseBooleanCallback<T>,) {
        return filterNotIndexedByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Filter not indexed --------------------

    //#region -------------------- Filter not null --------------------

    public filterNotNull(): CollectionHolder<NonNullable<T>> {
        return filterNotNullByCollectionHolder<T>(this,)
    }

    //#endregion -------------------- Filter not null --------------------

    //#region -------------------- Slice --------------------

    public slice(indices: readonly number[],): CollectionHolder<T>
    public slice(indices: ReadonlySet<number>,): CollectionHolder<T>
    public slice(indices: CollectionHolder<number>,): CollectionHolder<T>
    public slice(indices: MinimalistCollectionHolder<number>,): CollectionHolder<T>
    public slice(indices: CollectionIterator<number>,): CollectionHolder<T>
    public slice(indices: Iterable<number>,): CollectionHolder<T>
    public slice(indices: PossibleIterableArraySetOrCollectionHolder<number>,): CollectionHolder<T>
    public slice(fromIndex?: NullableNumber, toIndex?: NullableNumber,): CollectionHolder<T>
    public slice(indicesOrFromIndex?: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number>, toIndex?: NullableNumber,): CollectionHolder<T>
    public slice(indicesOrFromIndex?: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number>, toIndex?: NullableNumber,): CollectionHolder<T> {
        //#region -------------------- 0 arguments --------------------

        if (arguments.length === 0)
            return this._sliceWith0Argument()

        //#endregion -------------------- 0 arguments --------------------
        //#region -------------------- 1 argument --------------------

        if (arguments.length === 1)
            if (indicesOrFromIndex == null)
                return this._sliceWith0Argument()
            else if (typeof indicesOrFromIndex == "number")
                return this._sliceWith1Argument(indicesOrFromIndex,)
            else if (isArray(indicesOrFromIndex,))
                return this._sliceByArray(indicesOrFromIndex,)
            else if (isSet(indicesOrFromIndex))
                return this._sliceBySet(indicesOrFromIndex,)
            else if (isCollectionHolder(indicesOrFromIndex))
                return this._sliceByCollectionHolder(indicesOrFromIndex,)
            else if (isMinimalistCollectionHolder(indicesOrFromIndex))
                return this._sliceByMinimalistCollectionHolder(indicesOrFromIndex,)
            else if (isCollectionIterator(indicesOrFromIndex))
                return this._sliceByCollectionIterator(indicesOrFromIndex,)
            else if (isArrayByStructure<number>(indicesOrFromIndex,))
                return this._sliceByArray(indicesOrFromIndex,)
            else if (isSetByStructure<number>(indicesOrFromIndex))
                return this._sliceBySet(indicesOrFromIndex,)
            else if (isCollectionHolderByStructure<number>(indicesOrFromIndex))
                return this._sliceByCollectionHolder(indicesOrFromIndex,)
            else if (isMinimalistCollectionHolderByStructure<number>(indicesOrFromIndex))
                return this._sliceByMinimalistCollectionHolder(indicesOrFromIndex,)
            else if (isCollectionIteratorByStructure<number>(indicesOrFromIndex))
                return this._sliceByCollectionIterator(indicesOrFromIndex,)
            else
                return this._sliceByIterable(indicesOrFromIndex,)

        //#endregion -------------------- 1 argument --------------------
        //#region -------------------- 2 arguments --------------------

        if (indicesOrFromIndex == null)
            if (toIndex == null)
                return this._sliceWith0Argument()
            else
                return this._sliceWith2ArgumentWhere1stIsNull(indicesOrFromIndex, toIndex,)

        if (toIndex == null)
            if (typeof indicesOrFromIndex == "number")
                return this._sliceWith1Argument(indicesOrFromIndex,)
            else if (isArray(indicesOrFromIndex,))
                return this._sliceByArray(indicesOrFromIndex,)
            else if (isSet(indicesOrFromIndex))
                return this._sliceBySet(indicesOrFromIndex,)
            else if (isCollectionHolder(indicesOrFromIndex))
                return this._sliceByCollectionHolder(indicesOrFromIndex,)
            else if (isMinimalistCollectionHolder(indicesOrFromIndex))
                return this._sliceByMinimalistCollectionHolder(indicesOrFromIndex,)
            else if (isCollectionIterator(indicesOrFromIndex))
                return this._sliceByCollectionIterator(indicesOrFromIndex,)
            else if (isArrayByStructure<number>(indicesOrFromIndex,))
                return this._sliceByArray(indicesOrFromIndex,)
            else if (isSetByStructure<number>(indicesOrFromIndex))
                return this._sliceBySet(indicesOrFromIndex,)
            else if (isCollectionHolderByStructure<number>(indicesOrFromIndex))
                return this._sliceByCollectionHolder(indicesOrFromIndex,)
            else if (isMinimalistCollectionHolderByStructure<number>(indicesOrFromIndex))
                return this._sliceByMinimalistCollectionHolder(indicesOrFromIndex,)
            else if (isCollectionIteratorByStructure<number>(indicesOrFromIndex))
                return this._sliceByCollectionIterator(indicesOrFromIndex,)
            else
                return this._sliceByIterable(indicesOrFromIndex,)

        if (typeof indicesOrFromIndex == "number")
            return this._sliceWith2Argument(indicesOrFromIndex, toIndex,)
        if (isArray(indicesOrFromIndex,))
            return this._sliceByArray(indicesOrFromIndex,)
        if (isSet(indicesOrFromIndex))
            return this._sliceBySet(indicesOrFromIndex,)
        if (isCollectionHolder(indicesOrFromIndex))
            return this._sliceByCollectionHolder(indicesOrFromIndex,)
        if (isMinimalistCollectionHolder(indicesOrFromIndex))
            return this._sliceByMinimalistCollectionHolder(indicesOrFromIndex,)
        if (isCollectionIterator(indicesOrFromIndex))
            return this._sliceByCollectionIterator(indicesOrFromIndex,)
        if (isArrayByStructure<number>(indicesOrFromIndex,))
            return this._sliceByArray(indicesOrFromIndex,)
        if (isSetByStructure<number>(indicesOrFromIndex))
            return this._sliceBySet(indicesOrFromIndex,)
        if (isCollectionHolderByStructure<number>(indicesOrFromIndex))
            return this._sliceByCollectionHolder(indicesOrFromIndex,)
        if (isMinimalistCollectionHolderByStructure<number>(indicesOrFromIndex))
            return this._sliceByMinimalistCollectionHolder(indicesOrFromIndex,)
        if (isCollectionIteratorByStructure<number>(indicesOrFromIndex))
            return this._sliceByCollectionIterator(indicesOrFromIndex,)
        return this._sliceByIterable(indicesOrFromIndex,)

        //#endregion -------------------- 2 arguments --------------------
    }


    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice()} */
    protected _sliceWith0Argument(): CollectionHolder<T> {
        return sliceWithARangeByCollectionHolder<T>(this,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice(fromIndex)} */
    protected _sliceWith1Argument(fromIndex: number,): CollectionHolder<T> {
        return sliceWithARangeByCollectionHolder<T>(this, fromIndex,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice(fromIndex, toIndex)} */
    protected _sliceWith2Argument(fromIndex: number, toIndex: number,): CollectionHolder<T> {
        return sliceWithARangeByCollectionHolder<T>(this, fromIndex, toIndex,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice(null, toIndex)} */
    protected _sliceWith2ArgumentWhere1stIsNull(fromIndex: NullOrUndefined, toIndex: number,): CollectionHolder<T> {
        return sliceWithARangeByCollectionHolder<T>(this, fromIndex, toIndex,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice(indices)} */
    protected _sliceByArray(indices: readonly number[],): CollectionHolder<T> {
        return sliceWithArrayByCollectionHolder<T>(this, indices,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice(indices)} */
    protected _sliceBySet(indices: ReadonlySet<number>,): CollectionHolder<T> {
        return sliceWithSetByCollectionHolder<T>(this, indices,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice(indices)} */
    protected _sliceByMinimalistCollectionHolder(indices: MinimalistCollectionHolder<number>,): CollectionHolder<T> {
        return sliceWithMinimalistCollectionHolderByCollectionHolder<T>(this, indices,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice(indices)} */
    protected _sliceByCollectionHolder(indices: CollectionHolder<number>,): CollectionHolder<T> {
        return sliceWithCollectionHolderByCollectionHolder<T>(this, indices,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice(indices)} */
    protected _sliceByCollectionIterator(indices: CollectionIterator<number>,): CollectionHolder<T> {
        return sliceWithCollectionIteratorByCollectionHolder<T>(this, indices,)
    }

    /** An additional method to be the equivalent of {@link CollectionHolder.slice CollectionHolder.slice(indices)} */
    protected _sliceByIterable(indices: Iterable<number>,): CollectionHolder<T> {
        return sliceWithIterableByCollectionHolder<T>(this, indices,)
    }

    //#endregion -------------------- Slice --------------------

    //#region -------------------- Take --------------------

    public take(n: number,): CollectionHolder<T> {
        return takeByCollectionHolder<T>(this, n,)
    }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Take while --------------------

    public takeWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public takeWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public takeWhile(predicate: BooleanCallback<T>,) {
        return takeWhileByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Take while --------------------
    //#region -------------------- Take while indexed --------------------

    public takeWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public takeWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public takeWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return takeWhileIndexedByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Take while indexed --------------------
    //#region -------------------- Take last --------------------

    public takeLast(n: number,): CollectionHolder<T> {
        return takeLastByCollectionHolder<T>(this, n,)
    }

    //#endregion -------------------- Take last --------------------
    //#region -------------------- Take last while --------------------

    public takeLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public takeLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public takeLastWhile(predicate: BooleanCallback<T>,) {
        return takeLastWhileByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Take last while --------------------
    //#region -------------------- Take last while indexed --------------------

    public takeLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return takeLastWhileIndexedByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Take last while indexed --------------------

    //#region -------------------- Drop --------------------

    public drop(n: number,): CollectionHolder<T> {
        return dropByCollectionHolder<T>(this, n,)
    }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Drop while --------------------

    public dropWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public dropWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public dropWhile(predicate: BooleanCallback<T>,) {
        return dropWhileByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Drop while --------------------
    //#region -------------------- Drop while indexed --------------------

    public dropWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public dropWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public dropWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return dropWhileIndexedByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Drop while indexed --------------------
    //#region -------------------- Drop last --------------------

    public dropLast(n: number,): CollectionHolder<T> {
        return dropLastByCollectionHolder<T>(this, n,)
    }

    //#endregion -------------------- Drop last --------------------
    //#region -------------------- Drop last while --------------------

    public dropLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public dropLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public dropLastWhile(predicate: BooleanCallback<T>,) {
        return dropLastWhileByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Drop last while --------------------
    //#region -------------------- Drop last while indexed --------------------

    public dropLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return dropLastWhileIndexedByCollectionHolder(this, predicate,)
    }

    //#endregion -------------------- Drop last while indexed --------------------

    //#region -------------------- Map --------------------

    public map<const U, >(transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U> {
        return mapByCollectionHolder(this, transform,)
    }

    //#endregion -------------------- Map --------------------
    //#region -------------------- Map indexed --------------------

    public mapIndexed<const U, >(transform: IndexValueWithReturnCallback<T, U>,): CollectionHolder<U> {
        return mapIndexedByCollectionHolder(this, transform,)
    }

    //#endregion -------------------- Map indexed --------------------

    //#region -------------------- Map not null --------------------

    public mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNullByCollectionHolder(this, transform,)
    }

    //#endregion -------------------- Map not null --------------------
    //#region -------------------- Map not null indexed --------------------

    public mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> {
        return mapNotNullIndexedByCollectionHolder(this, transform,)
    }

    //#endregion -------------------- Map not null indexed --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- For each --------------------

    public forEach(action: ValueIndexCallback<T>,): void {
        forEachByCollectionHolder(this, action,)
    }

    //#endregion -------------------- For each --------------------
    //#region -------------------- For each indexed --------------------

    public forEachIndexed(action: IndexValueCallback<T>,): void {
        forEachIndexedByCollectionHolder(this, action,)
    }

    //#endregion -------------------- For each indexed --------------------

    //#region -------------------- On each --------------------

    public onEach(action: ValueIndexCallback<T>,): this {
        return onEachByCollectionHolder(this, action,)
    }

    //#endregion -------------------- On each --------------------
    //#region -------------------- On each indexed --------------------

    public onEachIndexed(action: IndexValueCallback<T>,): this {
        return onEachIndexedByCollectionHolder(this, action,)
    }

    //#endregion -------------------- On each indexed --------------------

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    //#region -------------------- To reverse --------------------

    public toReverse(fromIndex?: NullableNumber, toIndex?: NullableNumber,): CollectionHolder<T> {
        return toReverseByCollectionHolder<T>(this, fromIndex, toIndex,)
    }

    public toReversed(fromIndex?: NullableNumber, toIndex?: NullableNumber,): CollectionHolder<T> {
        return this.toReverse(fromIndex, toIndex,)
    }

    public reversed(fromIndex?: NullableNumber, toIndex?: NullableNumber,): CollectionHolder<T> {
        return this.toReverse(fromIndex, toIndex,)
    }

    //#endregion -------------------- To reverse --------------------

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- Javascript methods --------------------

    public [Symbol.iterator](): CollectionIterator<T> {
        return toIteratorByCollectionHolder<T>(this,)
    }

    public get [Symbol.toStringTag](): CollectionHolderName {
        return "CollectionHolder"
    }

    //#endregion -------------------- Javascript methods --------------------
    //#region -------------------- Conversion methods --------------------

    //#region -------------------- To iterator --------------------

    public toIterator(): CollectionIterator<T> {
        return this[Symbol.iterator]()
    }

    //#endregion -------------------- To iterator --------------------
    //#region -------------------- To array --------------------

    public toArray(): readonly T[] {
        return toArrayByCollectionHolder<T>(this,)
    }

    public toMutableArray(): T[] {
        return toMutableArrayByCollectionHolder<T>(this,)
    }

    //#endregion -------------------- To array --------------------
    //#region -------------------- To set --------------------

    public toSet(): ReadonlySet<T> {
        return toSetByCollectionHolder<T>(this,)
    }

    public toMutableSet(): Set<T> {
        return toMutableSetByCollectionHolder<T>(this,)
    }

    //#endregion -------------------- To set --------------------
    //#region -------------------- To map --------------------

    public toMap(): ReadonlyMap<number, T> {
        return toMapByCollectionHolder<T>(this,)
    }

    public toMutableMap(): Map<number, T> {
        return toMutableMapByCollectionHolder<T>(this,)
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


    public toLowerCaseString(): string {
        return toLowerCaseStringByCollectionHolder(this,)
    }

    public toLocaleLowerCaseString(locale?: NullableString,): string {
        if (arguments.length === 0)
            return toLocaleLowerCaseStringByCollectionHolder(this,)
        return toLocaleLowerCaseStringByCollectionHolder(this, locale,)
    }


    public toUpperCaseString(): string {
        return toUpperCaseStringByCollectionHolder(this,)
    }

    public toLocaleUpperCaseString(locale?: NullableString,): string {
        if (arguments.length === 0)
            return toLocaleUpperCaseStringByCollectionHolder(this,)
        return toLocaleUpperCaseStringByCollectionHolder(this, locale,)
    }

    //#endregion -------------------- To string --------------------
    //#region -------------------- Join to string --------------------

    public join(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string {
        return this.joinToString(separator, prefix, postfix, limit, truncated, transform,)
    }

    public joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string {
        return joinToStringByCollectionHolder(this, separator, prefix, postfix, limit, truncated, transform,)
    }

    //#endregion -------------------- Join to string --------------------

    //#endregion -------------------- Conversion methods --------------------

    //#endregion -------------------- Methods --------------------

}

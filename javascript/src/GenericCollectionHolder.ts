/******************************************************************************
 * Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi                             *
 *                                                                            *
 * This project is free to use.                                               *
 * All the right is reserved to the author of this project.                   *
 ******************************************************************************/

import type {Nullable, NullOr, NumberOrNumberInString, UndefinedOr}                                                                                                                                                                                                                                            from "./general type"
import type {CollectionHolder}                                                                                                                                                                                                                                                                                 from "./CollectionHolder"
import type {BooleanCallback, CollectionHolderName, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, ObjectOf, RestrainedBooleanCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, ValueIndexCallback, ValueIndexWithReturnCallback, ValueWithStringReturnCallback} from "./CollectionHolder.types"
import type {IterableWithCount}                                                                                                                                                                                                                                                                                from "./iterable/IterableWithCount"
import type {IterableWithLength}                                                                                                                                                                                                                                                                               from "./iterable/IterableWithLength"
import type {IterableWithPossibleSize}                                                                                                                                                                                                                                                                         from "./iterable/IterableWithPossibleSize"
import type {IterableWithSize}                                                                                                                                                                                                                                                                                 from "./iterable/IterableWithSize"
import type {CollectionIterator}                                                                                                                                                                                                                                                                               from "./iterator/CollectionIterator"

import {CollectionConstants} from "./CollectionConstants"
import {all}                 from "./method/all"
import {any}                 from "./method/any"
import {filter}              from "./method/filter"
import {filterIndexed}       from "./method/filterIndexed"
import {filterIndexedNot}    from "./method/filterIndexedNot"
import {filterNot}           from "./method/filterNot"
import {filterNotNull}       from "./method/filterNotNull"
import {find}                from "./method/find"
import {findIndexed}         from "./method/findIndexed"
import {findLast}            from "./method/findLast"
import {findLastIndexed}     from "./method/findLastIndexed"
import {first}               from "./method/first"
import {firstOrNull}         from "./method/firstOrNull"
import {forEach}             from "./method/forEach"
import {forEachIndexed}      from "./method/forEachIndexed"
import {hasAll}              from "./method/hasAll"
import {hasNull}             from "./method/hasNull"
import {hasOne}              from "./method/hasOne"
import {indexOf}             from "./method/indexOf"
import {indexOfFirst}        from "./method/indexOfFirst"
import {indexOfFirstIndexed} from "./method/indexOfFirstIndexed"
import {indexOfLast}         from "./method/indexOfLast"
import {indexOfLastIndexed}  from "./method/indexOfLastIndexed"
import {isCollectionHolder}  from "./method/isCollectionHolder"
import {join}                from "./method/join"
import {last}                from "./method/last"
import {lastIndexOf}         from "./method/lastIndexOf"
import {lastOrNull}          from "./method/lastOrNull"
import {none}                from "./method/none"
import {map}                 from "./method/map"
import {mapIndexed}          from "./method/mapIndexed"
import {objectValuesMap}     from "./method/objectValuesMap"
import {requireNoNulls}      from "./method/requireNoNulls"
import {toIterator}          from "./method/toIterator"
import {toMutableArray}      from "./method/toMutableArray"
import {toMutableSet}        from "./method/toMutableSet"
import {toMutableMap}        from "./method/toMutableMap"
import {toMutableWeakSet}    from "./method/toMutableWeakSet"
import {toSet}               from "./method/toSet"
import {toMap}               from "./method/toMap"
import {toReverse}           from "./method/toReverse"
import {toWeakSet}           from "./method/toWeakSet"

/**
 * A simple {@link CollectionHolder} having the values eagerly retrieved.
 *
 * Meaning that every value is retrieved during the construction,
 * and it will never change after the initialization.
 *
 * But it does not make it {@link Object.isFrozen frozen}
 *
 * @see LazyGenericCollectionHolder
 * @see EmptyCollectionHolder
 */
export class GenericCollectionHolder<const T = unknown, const REFERENCE extends Iterable<T> = Iterable<T>, >
    implements CollectionHolder<T> {

    //#region -------------------- Fields --------------------

    [index: NumberOrNumberInString]: UndefinedOr<T>

    readonly #size: number
    readonly #isEmpty: boolean

    readonly #reference: REFERENCE
    #objectValuesMap?: ReadonlyMap<T, ObjectOf<T>>
    readonly #array: readonly T[]
    #set?: ReadonlySet<T>
    #weakSet?: Readonly<WeakSet<ObjectOf<T>>>
    #map?: ReadonlyMap<number, T>

    #hasNull?: boolean

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor(array: readonly T[],)
    public constructor(lateArray: () => readonly T[],)
    public constructor(set: ReadonlySet<T>,)
    public constructor(lateSet: () => ReadonlySet<T>,)
    public constructor(collectionIterable: CollectionIterator<T>,)
    public constructor(lateCollectionIterable: () => CollectionIterator<T>,)
    public constructor(iterableWithSize: IterableWithSize<T>,)
    public constructor(lateIterableWithSize: () => IterableWithSize<T>,)
    public constructor(iterableWithLength: IterableWithLength<T>,)
    public constructor(lateIterableWithLength: () => IterableWithLength<T>,)
    public constructor(iterableWithCount: IterableWithCount<T>,)
    public constructor(lateIterableWithCount: () => IterableWithCount<T>,)
    public constructor(iterableWithPossibleSize: IterableWithPossibleSize<T>,)
    public constructor(lateIterableWithPossibleSize: () => IterableWithPossibleSize<T>,)
    public constructor(iterable: Iterable<T>,)
    public constructor(lateIterable: () => Iterable<T>,)
    public constructor(collectionHolder: CollectionHolder<T>,)
    public constructor(lateCollectionHolder: () => CollectionHolder<T>,)
    public constructor(reference: REFERENCE,)
    public constructor(lateReference: () => REFERENCE,)
    public constructor(reference: | REFERENCE | (() => REFERENCE),)
    public constructor(reference: | REFERENCE | (() => REFERENCE),) {
        // README: The eager instantiation has some weird shenanigan in order to keep its nature pure.
        //         Also, in order to be efficient, there is some duplicate code in the constructor.

        reference = this.#reference = reference instanceof Function ? reference() : reference

        if (reference instanceof Array) {
            const size = this.#size = reference.length
            if (size == 0) {
                this.#isEmpty = true
                this.#hasNull = false
                this.#array = Object.freeze(CollectionConstants.EMPTY_ARRAY,)
                return
            }

            this.#isEmpty = false
            if (size == 1) {
                const value = this[0] = reference[0]
                this.#hasNull = value == null
                this.#array = Object.freeze([value,],)
                return
            }

            const array = new Array(size,)
            let index = size
            while (index-- > 0)
                this[index] = array[index] = reference[index]
            this.#array = Object.freeze(array,)
            return
        }

        if (reference instanceof Set) {
            const size = this.#size = reference.size
            if (size == 0) {
                this.#isEmpty = true
                this.#hasNull = false
                this.#array = Object.freeze(CollectionConstants.EMPTY_ARRAY,)
                return
            }

            this.#isEmpty = false
            if (size == 1) {
                const value = this[0] = reference[Symbol.iterator]().next().value
                this.#hasNull = value == null
                this.#array = Object.freeze([value,],)
                return
            }

            const array = new Array(size,)
            const iterator = reference[Symbol.iterator]() as IterableIterator<T>
            let index = -1
            while (++index < size)
                this[index] = array[index] = iterator.next().value
            this.#array = Object.freeze(array,)
            return
        }

        if (isCollectionHolder<T>(reference)) {
            const size = this.#size = reference.size
            this.#isEmpty = reference.isEmpty
            this.#array = reference.toArray()
            let index = size
            while (index-- > 0)
                this[index] = reference[index]
            return
        }

        const iterator = reference[Symbol.iterator]() as IterableIterator<T>
        let value = iterator.next()
        if (value.done) {
            this.#size = 0
            this.#isEmpty = true
            this.#hasNull = false
            this.#array = Object.freeze(CollectionConstants.EMPTY_ARRAY,)
            return
        }

        const array = []
        this.#isEmpty = false
        let size = 0
        while (!value.done) {
            this[size] = array[size] = value.value
            value = iterator.next()
            size++
        }
        this.#size = size
        this.#array = Object.freeze(array,)
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    //#region -------------------- Size methods --------------------

    public get size(): number {
        return this.#size
    }

    public get length(): this["size"] {
        return this.size
    }

    public get count(): this["size"] {
        return this.size
    }


    public get isEmpty(): boolean {
        return this.#isEmpty
    }

    public get isNotEmpty(): boolean {
        return !this.isEmpty
    }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Has X methods --------------------

    public get hasNull(): boolean {
        return this.#hasNull ??= hasNull(this,)
    }

    public get includesNull(): this["hasNull"] {
        return this.hasNull
    }

    public get containsNull(): this["hasNull"] {
        return this.hasNull
    }

    //#endregion -------------------- Has X methods --------------------

    /** The iterable received in the constructor */
    protected get _reference(): REFERENCE {
        return this.#reference
    }

    /** The {@link Array} stored (from the construction) for the current {@link GenericCollectionHolder collection} */
    protected get _array(): readonly T[] {
        return this.#array
    }

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Value methods --------------------

    //#region -------------------- Get / at methods --------------------

    public get(index: number,): T {
        if (this.isEmpty)
            throw new ReferenceError("No element at any index could be found since it it empty.",)
        const size = this.size,
            indexToRetrieve = index < 0 ? size + index : index
        if (indexToRetrieve < 0)
            throw new ReferenceError(`The index ${index}${index === indexToRetrieve ? '' : ` (${indexToRetrieve} after calculation)`} is under 0.`,)
        if (indexToRetrieve > size)
            throw new ReferenceError(`The index ${index}${index === indexToRetrieve ? '' : ` (${indexToRetrieve} after calculation)`} is over the size of the collection (${size}).`,)
        return this[indexToRetrieve] as T
    }

    public at(index: number,): T {
        return this.get(index,)
    }


    public getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<| T | U>,) {
        if (this.isEmpty)
            return defaultValue(index < 0 ? this.size + index : index,)

        const size = this.size,
            indexToRetrieve = index < 0 ? size + index : index
        if (indexToRetrieve < 0)
            return defaultValue(indexToRetrieve,)
        if (indexToRetrieve > size)
            return defaultValue(indexToRetrieve,)
        return this.get(indexToRetrieve,)
    }

    public atOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public atOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public atOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<| T | U>,) {
        return this.getOrElse(index, defaultValue,)
    }


    public getOrNull(index: number,): NullOr<T> {
        if (this.isEmpty)
            return null
        const size = this.size,
            indexToRetrieve = index < 0 ? size + index : index
        if (indexToRetrieve < 0)
            return null
        if (indexToRetrieve > size)
            return null
        return this[indexToRetrieve] as T
    }

    public atOrNull(index: number,): NullOr<T> {
        return this.getOrNull(index,)
    }

    //#endregion -------------------- Get / at methods --------------------
    //#region -------------------- Index of methods --------------------

    public indexOf(element: T, fromIndex?: Nullable<number>, toIndex?: Nullable<number>,): NullOr<number>
    public indexOf(element: unknown, fromIndex?: Nullable<number>, toIndex?: Nullable<number>,): NullOr<number>
    public indexOf(element: unknown, fromIndex?: Nullable<number>, toIndex?: Nullable<number>,): NullOr<number> {
        return indexOf(this, element, fromIndex, toIndex,)
    }


    public lastIndexOf(element: T, fromIndex?: Nullable<number>, toIndex?: Nullable<number>,): NullOr<number>
    public lastIndexOf(element: unknown, fromIndex?: Nullable<number>, toIndex?: Nullable<number>,): NullOr<number>
    public lastIndexOf(element: unknown, fromIndex?: Nullable<number>, toIndex?: Nullable<number>,): NullOr<number> {
        return lastIndexOf(this, element, fromIndex, toIndex,)
    }


    public indexOfFirst(predicate: BooleanCallback<T>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>,): NullOr<number> {
        return indexOfFirst(this, predicate, fromIndex, toIndex,)
    }

    public indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>,): NullOr<number> {
        return indexOfFirstIndexed(this, predicate, fromIndex, toIndex,)
    }


    public indexOfLast(predicate: BooleanCallback<T>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>,): NullOr<number> {
        return indexOfLast(this, predicate, fromIndex, toIndex,)
    }

    public indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>,): NullOr<number> {
        return indexOfLastIndexed(this, predicate, fromIndex, toIndex,)
    }

    //#endregion -------------------- Index of methods --------------------
    //#region -------------------- First methods --------------------

    public first(): NonNullable<T>
    public first<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NonNullable<S>
    public first(predicate: Nullable<BooleanCallback<T>>,): NonNullable<T>
    public first<const S extends T, >(predicate?: Nullable<| BooleanCallback<T> | RestrainedBooleanCallback<T, S>>,) {
        return first(this, predicate,)
    }

    public firstOrNull(): NullOr<T>
    public firstOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): S
    public firstOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
    public firstOrNull<const S extends T, >(predicate?: Nullable<| BooleanCallback<T> | RestrainedBooleanCallback<T, S>>,) {
        return firstOrNull(this, predicate,)
    }

    //#endregion -------------------- First methods --------------------
    //#region -------------------- Last methods --------------------

    public last(): NonNullable<T>
    public last<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NonNullable<S>
    public last(predicate: Nullable<BooleanCallback<T>>,): NonNullable<T>
    public last<const S extends T, >(predicate?: Nullable<| BooleanCallback<T> | RestrainedBooleanCallback<T, S>>,) {
        return last(this, predicate,)
    }

    public lastOrNull(): NullOr<T>
    public lastOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public lastOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
    public lastOrNull<const S extends T, >(predicate?: Nullable<| BooleanCallback<T> | RestrainedBooleanCallback<T, S>>,) {
        return lastOrNull(this, predicate,)
    }

    //#endregion -------------------- Last methods --------------------

    //#endregion -------------------- Value methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- All / any / none methods --------------------

    public all(predicate: BooleanCallback<T>,): boolean {
        return all(this, predicate,)
    }

    public any(): this["isNotEmpty"]
    public any(predicate: Nullable<BooleanCallback<T>>,): boolean
    public any(predicate?: Nullable<BooleanCallback<T>>,): boolean {
        return any(this, predicate,)
    }

    public none(): this["isEmpty"]
    public none(predicate: Nullable<BooleanCallback<T>>,): boolean
    public none(predicate?: Nullable<BooleanCallback<T>>,): boolean {
        return none(this, predicate,)
    }

    //#endregion -------------------- All / any / none methods --------------------
    //#region -------------------- Has / includes / contains methods --------------------

    public hasOne(...values: readonly T[]): boolean
    public hasOne(...values: readonly unknown[]): boolean
    public hasOne(...values: readonly unknown[]): boolean {
        return hasOne(this, ...values,)
    }

    public includesOne(...values: readonly T[]): boolean
    public includesOne(...values: readonly unknown[]): boolean
    public includesOne(...values: readonly unknown[]): boolean {
        return this.hasOne(...values,)
    }

    public containsOne(...values: readonly T[]): boolean
    public containsOne(...values: readonly unknown[]): boolean
    public containsOne(...values: readonly unknown[]): boolean {
        return this.hasOne(...values,)
    }


    public hasAll(...values: readonly T[]): boolean
    public hasAll(...values: readonly unknown[]): boolean
    public hasAll(...values: readonly unknown[]): boolean {
        return hasAll(this, ...values,)
    }

    public includesAll(...values: readonly T[]): boolean
    public includesAll(...values: readonly unknown[]): boolean
    public includesAll(...values: readonly unknown[]): boolean {
        return this.hasAll(...values,)
    }

    public containsAll(...values: readonly T[]): boolean
    public containsAll(...values: readonly unknown[]): boolean
    public containsAll(...values: readonly unknown[]): boolean {
        return this.hasAll(...values,)
    }

    //#endregion -------------------- Has / includes / contains methods --------------------
    //#region -------------------- Join methods --------------------

    public join(separator?: Nullable<string>, prefix?: Nullable<string>, postfix?: Nullable<string>, limit?: Nullable<number>, truncated?: Nullable<string>, transform?: Nullable<ValueWithStringReturnCallback<T>>,): string {
        return join(this, separator, prefix, postfix, limit, truncated, transform,)
    }

    //#endregion -------------------- Join methods --------------------
    //#region -------------------- Filter methods --------------------

    public filter<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public filter(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public filter<const S extends T, >(predicate: | RestrainedBooleanCallback<T, S> | BooleanCallback<T>,) {
        return filter(this, predicate,)
    }

    public filterIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public filterIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public filterIndexed<const S extends T, >(predicate: | ReverseRestrainedBooleanCallback<T, S> | ReverseBooleanCallback<T>,) {
        return filterIndexed(this, predicate,)
    }


    public filterNot<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public filterNot<const S extends T, >(predicate: | RestrainedBooleanCallback<T, S> | BooleanCallback<T>,) {
        return filterNot(this, predicate,)
    }

    public filterIndexedNot<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public filterIndexedNot(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public filterIndexedNot<const S extends T, >(predicate: | ReverseRestrainedBooleanCallback<T, S> | ReverseBooleanCallback<T>,) {
        return filterIndexedNot(this, predicate,)
    }


    public filterNotNull(): CollectionHolder<NonNullable<T>> {
        return filterNotNull(this,)
    }

    public requireNoNulls(): CollectionHolder<NonNullable<T>> {
        return requireNoNulls(this,)
    }

    //#endregion -------------------- Filter methods --------------------
    //#region -------------------- Find methods --------------------

    public find<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public find(predicate: BooleanCallback<T>,): NullOr<T>
    public find<const S extends T, >(predicate: | RestrainedBooleanCallback<T, S> | BooleanCallback<T>,) {
        return find(this, predicate,)
    }

    public findIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public findIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public findIndexed<const S extends T, >(predicate: | ReverseRestrainedBooleanCallback<T, S> | ReverseBooleanCallback<T>,) {
        return findIndexed(this, predicate,)
    }


    public findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public findLast(predicate: BooleanCallback<T>,): NullOr<T>
    public findLast<const S extends T, >(predicate: | RestrainedBooleanCallback<T, S> | BooleanCallback<T>,) {
        return findLast(this, predicate,)
    }

    public findLastIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T> {
        return findLastIndexed(this, predicate,)
    }

    //#endregion -------------------- Find methods --------------------
    //#region -------------------- Map methods --------------------

    public map<const U, >(transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U> {
        return map(this, transform,)
    }

    public mapIndexed<const U, >(transform: IndexValueWithReturnCallback<T, U>,): CollectionHolder<U> {
        return mapIndexed(this, transform,)
    }

    //#endregion -------------------- Map methods --------------------
    //#region -------------------- ForEach methods --------------------

    public forEach(action: ValueIndexCallback<T>,): this {
        return forEach(this, action,)
    }

    public forEachIndexed(action: IndexValueCallback<T>,): this {
        return forEachIndexed(this, action,)
    }

    //#endregion -------------------- ForEach methods --------------------

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Javascript methods --------------------

    public [Symbol.iterator](): IterableIterator<T> {
        return toIterator(this,)
    }

    public get [Symbol.toStringTag](): CollectionHolderName {
        return CollectionConstants.COLLECTION_HOLDER_TO_STRING_TAG
    }

    //#endregion -------------------- Javascript methods --------------------
    //#region -------------------- Conversion methods --------------------

    public get objectValuesMap(): ReadonlyMap<T, ObjectOf<T>> {
        return this.#objectValuesMap ??= objectValuesMap(this,)
    }


    public toIterator(): IterableIterator<T> {
        return this[Symbol.iterator]()
    }


    public toArray(): readonly T[] {
        return this.#array
    }

    public toMutableArray(): T[] {
        return toMutableArray(this,)
    }


    public toSet(): ReadonlySet<T> {
        return this.#set ??= toSet(this,)
    }

    public toMutableSet(): Set<T> {
        return toMutableSet(this,)
    }


    public toWeakSet(): Readonly<WeakSet<ObjectOf<T>>> {
        return this.#weakSet ??= toWeakSet(this,)
    }

    public toMutableWeakSet(): WeakSet<ObjectOf<T>> {
        return toMutableWeakSet(this,)
    }


    public toMap(): ReadonlyMap<number, T> {
        return this.#map ??= toMap(this,)
    }

    public toMutableMap(): Map<number, T> {
        return toMutableMap(this,)
    }


    public toReversed(fromIndex?: Nullable<number>, toIndex?: Nullable<number>,): CollectionHolder<T> {
        return toReverse(this, fromIndex, toIndex,)
    }


    public toString(): string {
        return this.join()
    }

    public toLocaleString(): string {
        return this.join(null, null, null, null, null, it => it?.toLocaleString() ?? `${it}`,)
    }

    //#endregion -------------------- Conversion methods --------------------

    //#endregion -------------------- Methods --------------------

}

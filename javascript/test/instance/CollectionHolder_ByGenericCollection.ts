/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullableNumber, NullableString, NullOr, NullOrNumber, StringOrSymbol} from "@joookiwi/type"

import type {CollectionHolder}                                                                                                                                                                                                                                                                              from "../../src/CollectionHolder"
import type {BooleanCallback, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, PossibleIterableArraySetOrCollectionHolder, RestrainedBooleanCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, StringCallback, ValueIndexCallback, ValueIndexWithReturnCallback} from "../../src/CollectionHolder.types"
import type {MinimalistCollectionHolder}                                                                                                                                                                                                                                                                    from "../../src/MinimalistCollectionHolder"
import type {CollectionIterator}      from "../../src/iterator/CollectionIterator"

import {GenericCollectionHolder}                   from "../../src/GenericCollectionHolder"
import {AbstractCollectionHolderForTest}           from "./AbstractCollectionHolderForTest"

const NUMBER_REGEX = /\d+/

/** A class to test the functionality of a {@link GenericCollectionHolder} */
export class CollectionHolder_ByGenericCollection<const T, >
    extends AbstractCollectionHolderForTest<T> {

    /** The internal instance that is tested */
    public readonly instance

    /** The {@link CollectionHolder_FromExtensionFunction.array array} encapsulated in a {@link Proxy} */
    public readonly proxiedArray: readonly T[]
    /** The handler associated to the {@link proxiedArray} */
    public readonly proxyHandler: ProxyHandler<readonly T[]>

    public constructor(array: readonly T[],) {
        super(array,)
        const $this = this
        const handler = this.proxyHandler = {
            get(target: readonly T[], property: StringOrSymbol, receiver: unknown,) {
                if (typeof property == "string")
                    if (NUMBER_REGEX.test(property,))
                        $this.amountOfCall++
                return Reflect.get(target, property, receiver,)
            },
        }
        const instance = this.instance = new class CollectionHolder_CountingGetByGenericCollection
            extends GenericCollectionHolder<T> {

            public get originalArray(): readonly T[] { return super._array }
            protected override get _array(): readonly T[] { return $this.proxiedArray }

        }(array,)
        this.proxiedArray = new Proxy(instance.originalArray, handler,)
    }

    //#region -------------------- Size methods --------------------

    public override get size(): number { return this.instance.size }
    public override get isEmpty(): boolean { return this.instance.isEmpty }
    public override get isNotEmpty(): boolean { return this.instance.isNotEmpty }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    public override get(index: number,): T { return this.instance.get(index,) }

    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) { return this.instance.getOrElse(index, defaultValue,) }

    public override getOrNull(index: number,): NullOr<T> { return this.instance.getOrNull(index,) }

    //#endregion -------------------- Get --------------------
    //#region -------------------- First --------------------

    public override first(): NonNullable<T>
    public override first<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NonNullable<S>
    public override first(predicate: Nullable<BooleanCallback<T>>,): NonNullable<T>
    public override first(predicate?: Nullable<BooleanCallback<T>>,) {
        if (arguments.length === 0)
            return this.instance.first()
        return this.instance.first(predicate,)
    }

    public override firstOrNull(): NullOr<T>
    public override firstOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public override firstOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
    public override firstOrNull(predicate?: Nullable<BooleanCallback<T>>,) {
        if (arguments.length === 0)
            return this.instance.firstOrNull()
        return this.instance.firstOrNull(predicate,)
    }

    //#endregion -------------------- First --------------------
    //#region -------------------- Last --------------------

    public override last(): NonNullable<T>
    public override last<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NonNullable<S>
    public override last(predicate: Nullable<BooleanCallback<T>>,): NonNullable<T>
    public override last(predicate?: Nullable<BooleanCallback<T>>,) {
        if (arguments.length === 0)
            return this.instance.last()
        return this.instance.last(predicate,)
    }

    public override lastOrNull(): NullOr<T>
    public override lastOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public override lastOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>
    public override lastOrNull(predicate?: Nullable<BooleanCallback<T>>,) {
        if (arguments.length === 0)
            return this.instance.lastOrNull()
        return this.instance.lastOrNull(predicate,)
    }

    //#endregion -------------------- Last --------------------
    //#region -------------------- Find --------------------

    public override find<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override find(predicate: BooleanCallback<T>,): NullOr<T>
    public override find(predicate: BooleanCallback<T>,) { return this.instance.find(predicate,) }

    public override findIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findIndexed(predicate: ReverseBooleanCallback<T>,) { return this.instance.findIndexed(predicate,) }


    public override findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLast(predicate: BooleanCallback<T>,): NullOr<T>
    public override findLast(predicate: BooleanCallback<T>,) { return this.instance.findLast(predicate,) }

    public override findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,) { return this.instance.findLastIndexed(predicate,) }

    //#endregion -------------------- Find --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    public override indexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber { return this.instance.indexOf(element, fromIndex, toIndex,) }

    public override lastIndexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber { return this.instance.lastIndexOf(element, fromIndex, toIndex,) }

    public override indexOfFirst(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber { return this.instance.indexOfFirst(predicate, fromIndex, toIndex,) }
    public override indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber { return this.instance.indexOfFirstIndexed(predicate, fromIndex, toIndex,) }

    public override indexOfLast(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber { return this.instance.indexOfLast(predicate, fromIndex, toIndex,) }
    public override indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber { return this.instance.indexOfLastIndexed(predicate, fromIndex, toIndex,) }

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    public override all<S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolder<S>
    public override all(predicate: BooleanCallback<T>,): boolean
    public override all(predicate: BooleanCallback<T>,) { return this.instance.all(predicate,) }

    public override any(): this["isNotEmpty"]
    public override any(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override any(predicate?: Nullable<BooleanCallback<T>>,) {
        if (arguments.length === 0)
            return this.instance.any()
        return this.instance.any(predicate,)
    }

    public override none(): this["isEmpty"]
    public override none(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override none(predicate?: Nullable<BooleanCallback<T>>,) {
        if (arguments.length === 0)
            return this.instance.none()
        return this.instance.none(predicate,)
    }

    public override get hasNull(): boolean { return this.instance.hasNull }

    public override get hasDuplicate(): boolean { return this.instance.hasDuplicate }

    public override has(value: T,): boolean { return this.instance.has(value,) }

    public override hasOne(values: readonly T[],): boolean
    public override hasOne(values: ReadonlySet<T>,): boolean
    public override hasOne(values: CollectionHolder<T>,): boolean
    public override hasOne(values: MinimalistCollectionHolder<T>,): boolean
    public override hasOne(values: CollectionIterator<T>,): boolean
    public override hasOne(values: Iterable<T>,): boolean
    public override hasOne(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
    public override hasOne(values: PossibleIterableArraySetOrCollectionHolder<T>,) { return this.instance.hasOne(values,) }

    public override hasAll(values: readonly T[],): boolean
    public override hasAll(values: ReadonlySet<T>,): boolean
    public override hasAll(values: CollectionHolder<T>,): boolean
    public override hasAll(values: MinimalistCollectionHolder<T>,): boolean
    public override hasAll(values: CollectionIterator<T>,): boolean
    public override hasAll(values: Iterable<T>,): boolean
    public override hasAll(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean
    public override hasAll(values: PossibleIterableArraySetOrCollectionHolder<T>,) { return this.instance.hasAll(values,) }

    public override requireNoNulls(): CollectionHolder<NonNullable<T>> {
        if (this.instance.requireNoNulls() !== this.instance)
            throw new Error("The expected return type for the method “requireNoNulls” was supposed to be the same instance",)
        return this as CollectionHolder<NonNullable<T>>
    }

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    public override filter<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filter(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filter(predicate: BooleanCallback<T>,) { return this.instance.filter(predicate,) }

    public override filterIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,) { return this.instance.filterIndexed(predicate,) }

    public override filterNot<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filterNot(predicate: BooleanCallback<T>,) { return this.instance.filterNot(predicate,) }

    public override filterNotIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,) { return this.instance.filterNotIndexed(predicate,) }

    public override filterNotNull(): CollectionHolder<NonNullable<T>> {
        const instance = this.instance.filterNotNull()
        if (instance === this.instance)
            return this as CollectionHolder<NonNullable<T>>
        return instance
    }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Slice --------------------

    public override slice(indices: readonly number[],): CollectionHolder<T>
    public override slice(indices: ReadonlySet<number>,): CollectionHolder<T>
    public override slice(indices: CollectionHolder<number>,): CollectionHolder<T>
    public override slice(indices: MinimalistCollectionHolder<number>,): CollectionHolder<T>
    public override slice(indices: CollectionIterator<number>,): CollectionHolder<T>
    public override slice(indices: Iterable<number>,): CollectionHolder<T>
    public override slice(indices: PossibleIterableArraySetOrCollectionHolder<number>,): CollectionHolder<T>
    public override slice(fromIndex?: NullableNumber, toIndex?: NullableNumber,): CollectionHolder<T>
    public override slice(indicesOrFromIndex?: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number>, toIndex?: NullableNumber,): CollectionHolder<T>
    public override slice(indicesOrFromIndex?: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number>, toIndex?: NullableNumber,): CollectionHolder<T> {
        if (arguments.length === 0)
            return this.instance.slice()
        if (arguments.length === 1)
            return this.instance.slice(indicesOrFromIndex,)
        return this.instance.slice(indicesOrFromIndex, toIndex,)
    }

    //#endregion -------------------- Slice --------------------
    //#region -------------------- Take --------------------

    public override take(n: number,): CollectionHolder<T> {
        return this.instance.take(n,)
    }

    public override takeWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override takeWhile(predicate: BooleanCallback<T>,) {
        return this.instance.takeWhile(predicate,)
    }

    public override takeWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return this.instance.takeWhileIndexed(predicate,)
    }


    public override takeLast(n: number,): CollectionHolder<T> {
        return this.instance.takeLast(n,)
    }

    public override takeLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override takeLastWhile(predicate: BooleanCallback<T>,) {
        return this.instance.takeLastWhile(predicate,)
    }

    public override takeLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return this.instance.takeLastWhileIndexed(predicate,)
    }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Drop --------------------

    public override drop(n: number,): CollectionHolder<T> {
        return this.instance.drop(n,)
    }

    public override dropWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override dropWhile(predicate: BooleanCallback<T>,) {
        return this.instance.dropWhile(predicate,)
    }

    public override dropWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return this.instance.dropWhileIndexed(predicate,)
    }


    public override dropLast(n: number,): CollectionHolder<T> {
        return this.instance.dropLast(n,)
    }

    public override dropLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override dropLastWhile(predicate: BooleanCallback<T>,) {
        return this.instance.dropLastWhile(predicate,)
    }

    public override dropLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return this.instance.dropLastWhileIndexed(predicate,)
    }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Map --------------------

    public override map<const U, >(transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U> { return this.instance.map(transform,) }
    public override mapIndexed<const U, >(transform: IndexValueWithReturnCallback<T, U>,): CollectionHolder<U> { return this.instance.mapIndexed(transform,) }

    public override mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> { return this.instance.mapNotNull(transform,) }
    public override mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> { return this.instance.mapNotNullIndexed(transform,) }

    //#endregion -------------------- Map --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    public override forEach(action: ValueIndexCallback<T>,): void { this.instance.forEach(action,) }
    public override forEachIndexed(action: IndexValueCallback<T>,): void { this.instance.forEachIndexed(action,) }


    public override onEach(action: ValueIndexCallback<T>,): this {
        if (this.instance.onEach(action,) !== this.instance)
            throw new Error("The expected return type for the method “onEach” was supposed to be the same instance",)
        return this
    }

    public override onEachIndexed(action: IndexValueCallback<T>,): this {
        if (this.instance.onEachIndexed(action,) !== this.instance)
            throw new Error("The expected return type for the method “onEach” was supposed to be the same instance",)
        return this
    }

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    public override toReverse(fromIndex?: NullableNumber, toIndex?: NullableNumber,): CollectionHolder<T> { return this.instance.toReverse(fromIndex, toIndex,) }

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- Javascript methods --------------------

    public override [Symbol.iterator](): CollectionIterator<T> { return this.instance[Symbol.iterator]() }

    //#endregion -------------------- Javascript methods --------------------
    //#region -------------------- Conversion methods --------------------

    public override toArray(): readonly T[] { return this.instance.toArray() }
    public override toMutableArray(): T[] { return this.instance.toMutableArray() }
    public override toSet(): ReadonlySet<T> { return this.instance.toSet() }
    public override toMutableSet(): Set<T> { return this.instance.toMutableSet() }
    public override toMap(): ReadonlyMap<number, T> { return this.instance.toMap() }
    public override toMutableMap(): Map<number, T> { return this.instance.toMutableMap() }


    public override toString(): string { return this.instance.toString() }
    public override toLocaleString(locale?: NullableString,): string {
        if (arguments.length === 0)
            return this.instance.toLocaleString()
        return this.instance.toLocaleString(locale,)
    }

    public override toLowerCaseString(): string { return this.instance.toLowerCaseString() }
    public override toLocaleLowerCaseString(locale?: NullableString,): string {
        if (arguments.length === 0)
            return this.instance.toLocaleLowerCaseString()
        return this.instance.toLocaleLowerCaseString(locale,)
    }

    public override toUpperCaseString(): string { return this.instance.toUpperCaseString() }
    public override toLocaleUpperCaseString(locale?: NullableString,): string {
        if (arguments.length === 0)
            return this.instance.toLocaleUpperCaseString()
        return this.instance.toLocaleUpperCaseString(locale,)
    }


    public override joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string { return this.instance.joinToString(separator, prefix, postfix, limit, truncated, transform,) }

    //#endregion -------------------- Conversion methods --------------------

}

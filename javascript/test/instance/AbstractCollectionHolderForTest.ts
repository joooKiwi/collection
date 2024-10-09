/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullableNumber, NullableString, NullOr, NullOrNumber, TemplateOrNumber} from "@joookiwi/type"

import type {CollectionHolder}                                                                                                                                                                                                                                                                                                    from "../../src/CollectionHolder"
import type {BooleanCallback, CollectionHolderName, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, PossibleIterableArraySetOrCollectionHolder, RestrainedBooleanCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, StringCallback, ValueIndexCallback, ValueIndexWithReturnCallback} from "../../src/CollectionHolder.types"
import type {MinimalistCollectionHolder}                                                                                                                                                                                                                                                                                          from "../../src/MinimalistCollectionHolder"
import type {CollectionIterator}                                                                                                                                                                                                                                                                                                  from "../../src/iterator/CollectionIterator"
import type {CollectionHolderForTest}                                                                                                                                                                                                                                                                                             from "./CollectionHolderForTest"

import {CollectionHolderIndexOutOfBoundsException} from "../../src/exception/CollectionHolderIndexOutOfBoundsException"
import {EmptyCollectionHolderException}            from "../../src/exception/EmptyCollectionHolderException"
import {ForbiddenIndexException}                   from "../../src/exception/ForbiddenIndexException"

/**
 * A bare-bone implementation of a {@link CollectionHolderForTest} with nothing implemented,
 * but an {@link ReadonlyArray Array} in the constructor
 */
export abstract class AbstractCollectionHolderForTest<const T, >
    implements CollectionHolderForTest<T> {

    [index: TemplateOrNumber]: undefined
    /** The array received in the constructor */
    public readonly array
    #amountOfCall?: number

    protected constructor(array: readonly T[]) {
        this.array = array
    }

    //#region -------------------- Test utility methods --------------------

    public get amountOfCall(): number {
        return this.#amountOfCall ?? 0
    }

    public set amountOfCall(value: number,) {
        this.#amountOfCall = value
    }

    public execute(action: (instance: this,) => void,): this {
        action(this,)
        return this
    }

    public executeWhileIgnoringIndexOutOfBound(action: (instance: this,) => void,): this {
        try {
            action(this,)
        } catch (exception) {
            if (exception instanceof CollectionHolderIndexOutOfBoundsException)
                return this
            throw exception
        }
        throw new Error("The exception “CollectionHolderIndexOutOfBoundsException” was expected to be thrown.",)
    }

    public executeWhileIgnoringEmptyException(action: (instance: this,) => void,): this {
        try {
            action(this,)
        } catch (exception) {
            if (exception instanceof EmptyCollectionHolderException)
                return this
            throw exception
        }
        throw new Error("The exception “EmptyCollectionHolderException” was expected to be thrown.",)
    }

    public executeWhileIgnoringForbiddenException(action: (instance: this,) => void,): this {
        try {
            action(this,)
        } catch (exception) {
            if (exception instanceof ForbiddenIndexException)
                return this
            throw exception
        }
        throw new Error("The exception “ForbiddenIndexException” was expected to be thrown.",)
    }

    public executeWhileHavingIndexesOnField<const U, >(action: (instance: this,) => CollectionHolder<U>,): this {
        action(this,).forEach(_ => {},)
        return this
    }

    public executeToHaveIndexesOnField<const U, >(action: (instance: this,) => CollectionHolder<U>,): CollectionHolder<U> {
        return action(this,).onEach(_ => {},)
    }

    //#endregion -------------------- Test utility methods --------------------
    //#region -------------------- Size methods --------------------

    public abstract get size(): number

    public get length(): never {
        throw new Error("The getter method “length” was not expected to be called.",)
    }

    public get count(): never {
        throw new Error("The getter method “count” was not expected to be called.",)
    }

    public abstract get isEmpty(): boolean
    public abstract get isNotEmpty(): boolean

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    public abstract get(index: number,): T

    public at(index?: number,): never
    public at() {
        throw new Error("The method “at” was not expected to be called in a test.",)
    }

    public elementAt(index?: number,): never
    public elementAt() {
        throw new Error("The method “elementAt” was not expected to be called in a test.",)
    }


    public abstract getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public abstract getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T

    public atOrElse<const U, >(index?: number, defaultValue?: IndexWithReturnCallback<U>,): never
    public atOrElse(index?: number, defaultValue?: IndexWithReturnCallback<T>,): never
    public atOrElse() {
        throw new Error("The method “atOrElse” was not expected to be called in a test.",)
    }

    public elementAtOrElse<const U, >(index?: number, defaultValue?: IndexWithReturnCallback<U>,): never
    public elementAtOrElse(index?: number, defaultValue?: IndexWithReturnCallback<T>,): never
    public elementAtOrElse() {
        throw new Error("The method “elementAtOrElse” was not expected to be called in a test.",)
    }


    public abstract getOrNull(index: number,): NullOr<T>

    public atOrNull(index?: number,): never
    public atOrNull() {
        throw new Error("The method “atOrNull” was not expected to be called in a test.",)
    }

    public elementAtOrNull(index?: number,): never
    public elementAtOrNull() {
        throw new Error("The method “elementAtOrNull” was not expected to be called in a test.",)
    }

    //#endregion -------------------- Get --------------------
    //#region -------------------- First --------------------

    public abstract first(): NonNullable<T>
    public abstract first<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NonNullable<S>
    public abstract first(predicate: Nullable<BooleanCallback<T>>,): NonNullable<T>

    public abstract firstOrNull(): NullOr<T>
    public abstract firstOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public abstract firstOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>

    //#endregion -------------------- First --------------------
    //#region -------------------- Last --------------------

    public abstract last(): NonNullable<T>
    public abstract last<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NonNullable<S>
    public abstract last(predicate: Nullable<BooleanCallback<T>>,): NonNullable<T>

    public abstract lastOrNull(): NullOr<T>
    public abstract lastOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public abstract lastOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>

    //#endregion -------------------- Last --------------------
    //#region -------------------- Find --------------------

    public abstract find<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public abstract find(predicate: BooleanCallback<T>,): NullOr<T>

    public abstract findIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public abstract findIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>


    public abstract findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public abstract findLast(predicate: BooleanCallback<T>,): NullOr<T>

    public abstract findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public abstract findLastIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>

    //#endregion -------------------- Find --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    public abstract indexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber

    public abstract lastIndexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber

    public abstract indexOfFirst(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber
    public abstract indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber

    public abstract indexOfLast(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber
    public abstract indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    //#region -------------------- All --------------------

    public abstract all<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolder<S>
    public abstract all(predicate: BooleanCallback<T>,): boolean

    public every<const S extends T, >(predicate?: RestrainedBooleanCallback<T, S>,): this is CollectionHolder<S>
    public every(predicate?: BooleanCallback<T>,): never
    public every(): never {
        throw new Error("The method “every” was not expected to be called.",)
    }

    //#endregion -------------------- All --------------------
    //#region -------------------- Any --------------------

    public abstract any(): this["isNotEmpty"]
    public abstract any(predicate: Nullable<BooleanCallback<T>>,): boolean

    public some(): never
    public some(predicate?: Nullable<BooleanCallback<T>>,): never
    public some() {
        throw new Error("The method “some” was not expected to be called.",)
    }

    //#endregion -------------------- Any --------------------
    //#region -------------------- None --------------------

    public abstract none(): this["isEmpty"]
    public abstract none(predicate: Nullable<BooleanCallback<T>>,): boolean

    //#endregion -------------------- None --------------------

    //#region -------------------- Has null --------------------

    public abstract get hasNull(): boolean

    public get includesNull(): never {
        throw new Error("The getter method “includesNull” was not expected to be called.",)
    }

    public get containsNull(): never {
        throw new Error("The getter method “containsNull” was not expected to be called.",)
    }

    //#endregion -------------------- Has null --------------------
    //#region -------------------- Has duplicate --------------------

    public abstract get hasDuplicate(): boolean

    public get includesDuplicate(): never {
        throw new Error("The getter method “includesDuplicate” was not expected to be called.",)
    }

    public get containsDuplicate(): never {
        throw new Error("The getter method “containsDuplicate” was not expected to be called.",)
    }

    //#endregion -------------------- Has duplicate --------------------

    //#region -------------------- Has --------------------

    public abstract has(value: T,): boolean

    public includes(value?: T,): never
    public includes() {
        throw new Error("The method “includes” was not expected to be called.",)
    }

    public contains(value?: T,): never
    public contains() {
        throw new Error("The method “contains” was not expected to be called.",)
    }

    //#endregion -------------------- Has --------------------
    //#region -------------------- Has one --------------------

    public abstract hasOne(values: readonly T[],): boolean
    public abstract hasOne(values: ReadonlySet<T>,): boolean
    public abstract hasOne(values: CollectionHolder<T>,): boolean
    public abstract hasOne(values: MinimalistCollectionHolder<T>,): boolean
    public abstract hasOne(values: CollectionIterator<T>,): boolean
    public abstract hasOne(values: Iterable<T>,): boolean
    public abstract hasOne(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean

    public includesOne(values?: readonly T[],): never
    public includesOne(values?: ReadonlySet<T>,): never
    public includesOne(values?: CollectionHolder<T>,): never
    public includesOne(values?: MinimalistCollectionHolder<T>,): never
    public includesOne(values?: CollectionIterator<T>,): never
    public includesOne(values?: Iterable<T>,): never
    public includesOne(values?: PossibleIterableArraySetOrCollectionHolder<T>,): never
    public includesOne() {
        throw new Error("The method “includesOne” was not expected to be called.",)
    }

    public containsOne(values?: readonly T[],): never
    public containsOne(values?: ReadonlySet<T>,): never
    public containsOne(values?: MinimalistCollectionHolder<T>,): never
    public containsOne(values?: MinimalistCollectionHolder<T>,): never
    public containsOne(values?: MinimalistCollectionHolder<T>,): never
    public containsOne(values?: Iterable<T>,): never
    public containsOne(values?: PossibleIterableArraySetOrCollectionHolder<T>,): never
    public containsOne() {
        throw new Error("The method “containsOne” was not expected to be called.",)
    }

    //#endregion -------------------- Has one --------------------
    //#region -------------------- Has all --------------------

    public abstract hasAll(values: readonly T[],): boolean
    public abstract hasAll(values: ReadonlySet<T>,): boolean
    public abstract hasAll(values: CollectionHolder<T>,): boolean
    public abstract hasAll(values: MinimalistCollectionHolder<T>,): boolean
    public abstract hasAll(values: CollectionIterator<T>,): boolean
    public abstract hasAll(values: Iterable<T>,): boolean
    public abstract hasAll(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean

    public includesAll(values?: readonly T[],): never
    public includesAll(values?: ReadonlySet<T>,): never
    public includesAll(values?: CollectionHolder<T>,): never
    public includesAll(values?: MinimalistCollectionHolder<T>,): never
    public includesAll(values?: CollectionIterator<T>,): never
    public includesAll(values?: Iterable<T>,): never
    public includesAll(values?: PossibleIterableArraySetOrCollectionHolder<T>,): never
    public includesAll() {
        throw new Error("The method “includesAll” was not expected to be called.",)
    }

    public containsAll(values?: readonly T[],): never
    public containsAll(values?: ReadonlySet<T>,): never
    public containsAll(values?: CollectionHolder<T>,): never
    public containsAll(values?: MinimalistCollectionHolder<T>,): never
    public containsAll(values?: CollectionIterator<T>,): never
    public containsAll(values?: Iterable<T>,): never
    public containsAll(values?: PossibleIterableArraySetOrCollectionHolder<T>,): never
    public containsAll() {
        throw new Error("The “containsAll” was not expected to be called.",)
    }

    //#endregion -------------------- Has all --------------------

    //#region -------------------- Require no nulls --------------------

    public abstract requireNoNulls(): CollectionHolder<NonNullable<T>>

    //#endregion -------------------- Require no nulls --------------------

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    public abstract filter<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public abstract filter(predicate: BooleanCallback<T>,): CollectionHolder<T>

    public abstract filterIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public abstract filterIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>

    public abstract filterNot<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public abstract filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T>

    public abstract filterNotIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public abstract filterNotIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>

    public abstract filterNotNull(): CollectionHolder<NonNullable<T>>

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Slice --------------------

    public abstract slice(indices: readonly number[],): CollectionHolder<T>
    public abstract slice(indices: ReadonlySet<number>,): CollectionHolder<T>
    public abstract slice(indices: CollectionHolder<number>,): CollectionHolder<T>
    public abstract slice(indices: MinimalistCollectionHolder<number>,): CollectionHolder<T>
    public abstract slice(indices: CollectionIterator<number>,): CollectionHolder<T>
    public abstract slice(indices: Iterable<number>,): CollectionHolder<T>
    public abstract slice(indices: PossibleIterableArraySetOrCollectionHolder<number>,): CollectionHolder<T>
    public abstract slice(fromIndex?: NullableNumber, toIndex?: NullableNumber,): CollectionHolder<T>
    public abstract slice(indicesOrFromIndex?: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number>, toIndex?: NullableNumber,): CollectionHolder<T>

    //#endregion -------------------- Slice --------------------
    //#region -------------------- Take --------------------

    public abstract take(n: number,): CollectionHolder<T>

    public abstract takeWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public abstract takeWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>

    public abstract takeWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public abstract takeWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>


    public abstract takeLast(n: number,): CollectionHolder<T>

    public abstract takeLastWhile<const S extends T, >(predicate?: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public abstract takeLastWhile(predicate?: BooleanCallback<T>,): CollectionHolder<T>

    public abstract takeLastWhileIndexed<const S extends T, >(predicate?: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public abstract takeLastWhileIndexed(predicate?: ReverseBooleanCallback<T>,): CollectionHolder<T>

    //#endregion -------------------- Take --------------------
    //#region -------------------- Drop --------------------

    public abstract drop(n: number,): CollectionHolder<T>

    public abstract dropWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public abstract dropWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>

    public abstract dropWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public abstract dropWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>


    public abstract dropLast(n: number,): CollectionHolder<T>

    public abstract dropLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public abstract dropLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>

    public abstract dropLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public abstract dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Map --------------------

    public abstract map<const U, >(transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U>

    public abstract mapIndexed<const U, >(transform: IndexValueWithReturnCallback<T, U>,): CollectionHolder<U>


    public abstract mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U>

    public abstract mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U>

    //#endregion -------------------- Map --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- For each --------------------

    public abstract forEach(action: ValueIndexCallback<T>,): void

    public abstract forEachIndexed(action: IndexValueCallback<T>,): void

    //#endregion -------------------- For each --------------------
    //#region -------------------- On each --------------------

    public abstract onEach(action: ValueIndexCallback<T>,): this

    public abstract onEachIndexed(action: IndexValueCallback<T>,): this

    //#endregion -------------------- On each --------------------

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    //#region -------------------- To reverse --------------------

    public abstract toReverse(fromIndex?: NullableNumber, toIndex?: NullableNumber,): CollectionHolder<T>

    public toReversed(fromIndex?: NullableNumber, toIndex?: NullableNumber,): never
    public toReversed() {
        throw new Error("The method “toReversed” was not expected to be called.",)
    }

    public reversed(fromIndex?: NullableNumber, toIndex?: NullableNumber,): never
    public reversed() {
        throw new Error("The method “reversed” was not expected to be called.",)
    }

    //#endregion -------------------- To reverse --------------------

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- Javascript methods --------------------

    public abstract [Symbol.iterator](): CollectionIterator<T>

    public get [Symbol.toStringTag](): CollectionHolderName {
        return "CollectionHolder"
    }

    //#endregion -------------------- Javascript methods --------------------
    //#region -------------------- Conversion methods --------------------

    //#region -------------------- To other structure --------------------

    public toIterator(): CollectionIterator<T> {
        return this[Symbol.iterator]()
    }


    public abstract toArray(): readonly T[]
    public abstract toMutableArray(): T[]

    public abstract toSet(): ReadonlySet<T>
    public abstract toMutableSet(): Set<T>


    public abstract toMap(): ReadonlyMap<number, T>
    public abstract toMutableMap(): Map<number, T>

    //#endregion -------------------- To other structure --------------------
    //#region -------------------- To string --------------------

    public abstract toString(): string

    public abstract toLocaleString(locale?: NullableString,): string

    public abstract toLowerCaseString(): string

    public abstract toLocaleLowerCaseString(locale?: NullableString,): string

    public abstract toUpperCaseString(): string

    public abstract toLocaleUpperCaseString(locale?: NullableString,): string

    //#endregion -------------------- To string --------------------
    //#region -------------------- Join to string --------------------

    public join(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): never
    public join() {
        throw new Error("The method “join” was not expected to be called.",)
    }

    public abstract joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string

    //#endregion -------------------- Join to string --------------------

    //#endregion -------------------- Conversion methods --------------------

}

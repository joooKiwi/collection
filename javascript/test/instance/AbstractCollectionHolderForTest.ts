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

import type {Array, MutableArray, MutableNumberKeyMap, MutableSet, Nullable, NullableNumber, NullableString, NullOr, NullOrNumber, NumberKeyMap, Set, TemplateOrNumber} from "@joookiwi/type"

import type {CollectionHolder}                                                                                                                                                                                                                                                  from "../../src/CollectionHolder"
import type {CollectionIterator}                                                                                                                                                                                                                                                from "../../src/iterator/CollectionIterator"
import type {CollectionHolderForTest}                                                                                                                                                                                                                                           from "./CollectionHolderForTest"
import type {BooleanCallback, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, RestrainedBooleanCallback, ReturnCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, StringCallback, ValueIndexCallback, ValueIndexWithReturnCallback} from "../../src/type/callback"
import type {PossibleIterableIteratorArraySetOrCollectionHolder}                                                                                                                                                                                                                from "../../src/type/possibleInstance"
import type {CollectionHolderName}                                                                                                                                                                                                                                              from "../../src/type/toStringTag"

import {EmptyCollectionException}   from "../../src/exception/EmptyCollectionException"
import {ForbiddenIndexException}    from "../../src/exception/ForbiddenIndexException"
import {IndexOutOfBoundsException}  from "../../src/exception/IndexOutOfBoundsException"
import {InvalidIndexRangeException} from "../../src/exception/InvalidIndexRangeException"

/**
 * A bare-bone implementation of a {@link CollectionHolderForTest} with nothing implemented
 *
 * @typeParam T The type
 */
export abstract class AbstractCollectionHolderForTest<const T, >
    implements CollectionHolderForTest<T> {

    [index: TemplateOrNumber]: undefined

    #amountOfCall?: number

    public constructor() {}

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

    public executeWhileExpectingIndexOutOfBound(action: (instance: this,) => void,): this {
        try {
            action(this,)
        } catch (exception) {
            if (exception instanceof IndexOutOfBoundsException)
                return this
            throw exception
        }
        throw new Error("The exception “IndexOutOfBoundsException” was expected to be thrown.",)
    }

    public executeWhileExpectingInvalidIndexRange(action: (instance: this,) => void,): this {
        try {
            action(this,)
        } catch (exception) {
            if (exception instanceof InvalidIndexRangeException)
                return this
            throw exception
        }
        throw new Error("The exception “InvalidIndexRangeException” was expected to be thrown.",)
    }

    public executeWhileExpectingEmptyException(action: (instance: this,) => void,): this {
        try {
            action(this,)
        } catch (exception) {
            if (exception instanceof EmptyCollectionException)
                return this
            throw exception
        }
        throw new Error("The exception “EmptyCollectionException” was expected to be thrown.",)
    }

    public executeWhileExpectingForbiddenException(action: (instance: this,) => void,): this {
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

    public abstract readonly size: number

    public get length(): never {
        throw new Error("The getter method “length” was not expected to be called.",)
    }

    public get count(): never {
        throw new Error("The getter method “count” was not expected to be called.",)
    }

    public abstract readonly isEmpty: boolean
    public abstract readonly isNotEmpty: boolean

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    public abstract get(index: number,): T

    public abstract getFirst(): T

    public abstract getLast(): T

    public at(..._: Array<unknown>): never
    public at() {
        throw new Error("The method “at” was not expected to be called in a test.",)
    }

    public elementAt(..._: Array<unknown>): never
    public elementAt() {
        throw new Error("The method “elementAt” was not expected to be called in a test.",)
    }


    public abstract getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public abstract getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T

    public abstract getFirstOrElse<const U, >(defaultValue: ReturnCallback<U>,): | T | U
    public abstract getFirstOrElse(defaultValue: ReturnCallback<T>,): T

    public abstract getLastOrElse<const U, >(defaultValue: ReturnCallback<U>,): | T | U
    public abstract getLastOrElse(defaultValue: ReturnCallback<T>,): T

    public atOrElse(..._: Array<unknown>): never
    public atOrElse() {
        throw new Error("The method “atOrElse” was not expected to be called in a test.",)
    }

    public elementAtOrElse(..._: Array<unknown>): never
    public elementAtOrElse() {
        throw new Error("The method “elementAtOrElse” was not expected to be called in a test.",)
    }


    public abstract getOrNull(index: number,): NullOr<T>

    public abstract getFirstOrNull(): NullOr<T>

    public abstract getLastOrNull(): NullOr<T>

    public atOrNull(..._: Array<unknown>): never
    public atOrNull() {
        throw new Error("The method “atOrNull” was not expected to be called in a test.",)
    }

    public elementAtOrNull(..._: Array<unknown>): never
    public elementAtOrNull() {
        throw new Error("The method “elementAtOrNull” was not expected to be called in a test.",)
    }

    //#endregion -------------------- Get --------------------
    //#region -------------------- First --------------------

    public first(..._: Array<unknown>): never
    public first() {
        throw new Error("The method “first” was not expected to be called in a test.",)
    }

    public firstOrNull(..._: Array<unknown>): never
    public firstOrNull() {
        throw new Error("The method “firstOrNull” was not expected to be called in a test.",)
    }

    public firstIndexed(..._: Array<unknown>): never
    public firstIndexed() {
        throw new Error("The method “firstIndexed” was not expected to be called in a test.",)
    }

    public firstIndexedOrNull(..._: Array<unknown>): never
    public firstIndexedOrNull() {
        throw new Error("The method “firstIndexedOrNull” was not expected to be called in a test.",)
    }

    //#endregion -------------------- First --------------------
    //#region -------------------- Last --------------------

    public last(..._: Array<unknown>): never
    public last() {
        throw new Error("The method “last” was not expected to be called in a test.",)
    }

    public lastOrNull(..._: Array<unknown>): never
    public lastOrNull() {
        throw new Error("The method “lastOrNull” was not expected to be called in a test.",)
    }

    public lastIndexed(..._: Array<unknown>): never
    public lastIndexed() {
        throw new Error("The method “lastIndexed” was not expected to be called in a test.",)
    }

    public lastIndexedOrNull(..._: Array<unknown>): never
    public lastIndexedOrNull() {
        throw new Error("The method “lastIndexedOrNull” was not expected to be called in a test.",)
    }

    //#endregion -------------------- Last --------------------
    //#region -------------------- Find first --------------------

    public abstract findFirst<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public abstract findFirst(predicate: BooleanCallback<T>,): T

    public find(..._: Array<unknown>): never
    public find() {
        throw new Error("The method “find” was not expected to be called in a test.",)
    }


    public abstract findFirstOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public abstract findFirstOrNull(predicate: BooleanCallback<T>,): NullOr<T>

    public findOrNull(..._: Array<unknown>): never
    public findOrNull() {
        throw new Error("The method “findOrNull” was not expected to be called in a test.",)
    }


    public abstract findFirstIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public abstract findFirstIndexed(predicate: ReverseBooleanCallback<T>,): T

    public findIndexed(..._: Array<unknown>): never
    public findIndexed() {
        throw new Error("The method “findIndexed” was not expected to be called in a test.",)
    }


    public abstract findFirstIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public abstract findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>

    public findIndexedOrNull<const S extends T, >(predicate?: ReverseRestrainedBooleanCallback<T, S>,): never
    public findIndexedOrNull(predicate?: ReverseBooleanCallback<T>,): never
    public findIndexedOrNull() {
        throw new Error("The method “findIndexedOrNull” was not expected to be called in a test.",)
    }

    //#endregion -------------------- Find first --------------------
    //#region -------------------- Find last --------------------

    public abstract findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public abstract findLast(predicate: BooleanCallback<T>,): T

    public abstract findLastOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public abstract findLastOrNull(predicate: BooleanCallback<T>,): NullOr<T>

    public abstract findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public abstract findLastIndexed(predicate: ReverseBooleanCallback<T>,): T

    public abstract findLastIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public abstract findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>

    //#endregion -------------------- Find last --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    //#region -------------------- First index of --------------------

    public abstract firstIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,): number

    public indexOf(..._: Array<unknown>): never
    public indexOf() {
        throw new Error("The method “indexOf” was not expected to be called.",)
    }


    public abstract firstIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrNumber

    public indexOfOrNull(..._: Array<unknown>): never
    public indexOfOrNull(): never{
        throw new Error("The method “indexOf” was not expected to be called.",)

    }

    //#endregion -------------------- First index of --------------------
    //#region -------------------- Last index of --------------------

    public abstract lastIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,): number


    public abstract lastIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrNumber

    //#endregion -------------------- Last index of --------------------
    //#region -------------------- Index of first --------------------

    public abstract indexOfFirst(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number

    public findFirstIndex(..._: Array<unknown>): never
    public findFirstIndex() {
        throw new Error("The method “findFirstIndex” was not expected to be called.",)
    }

    public findIndex(..._: Array<unknown>): never
    public findIndex() {
        throw new Error("The method “findIndex” was not expected to be called.",)
    }


    public abstract indexOfFirstOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber

    public findFirstIndexOrNull(..._: Array<unknown>): never
    public findFirstIndexOrNull() {
        throw new Error("The method “findFirstIndexOrNull” was not expected to be called.",)
    }

    public findIndexOrNull(..._: Array<unknown>): never
    public findIndexOrNull() {
        throw new Error("The method “findIndexOrNull” was not expected to be called.",)
    }


    public abstract indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number

    public findFirstIndexIndexed(..._: Array<unknown>): never
    public findFirstIndexIndexed() {
        throw new Error("The method “findFirstIndexIndexed” was not expected to be called.",)
    }

    public findIndexIndexed(..._: Array<unknown>): never
    public findIndexIndexed() {
        throw new Error("The method “findIndexIndexed” was not expected to be called.",)
    }


    public abstract indexOfFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber

    public findFirstIndexIndexedOrNull(..._: Array<unknown>): never
    public findFirstIndexIndexedOrNull() {
        throw new Error("The method “findFirstIndexIndexedOrNull” was not expected to be called.",)
    }

    public findIndexIndexedOrNull(..._: Array<unknown>): never
    public findIndexIndexedOrNull() {
        throw new Error("The method “findIndexIndexedOrNull” was not expected to be called.",)
    }

    //#endregion -------------------- Index of first --------------------
    //#region -------------------- Index of last --------------------

    public abstract indexOfLast(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number

    public findLastIndex(..._: Array<unknown>): never
    public findLastIndex() {
        throw new Error("The method “findLastIndex” was not expected to be called.",)
    }


    public abstract indexOfLastOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber

    public findLastIndexOrNull(..._: Array<unknown>): never
    public findLastIndexOrNull() {
        throw new Error("The method “findLastIndexOrNull” was not expected to be called.",)
    }


    public abstract indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number

    public findLastIndexIndexed(..._: Array<unknown>): never
    public findLastIndexIndexed() {
        throw new Error("The method “findLastIndexIndexed” was not expected to be called.",)
    }


    public abstract indexOfLastIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber

    public findLastIndexIndexedOrNull(..._: Array<unknown>): never
    public findLastIndexIndexedOrNull() {
        throw new Error("The method “findLastIndexIndexedOrNull” was not expected to be called.",)
    }

    //#endregion -------------------- Index of last --------------------

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    //#region -------------------- All --------------------

    public abstract all<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolder<S>
    public abstract all(predicate: BooleanCallback<T>,): boolean

    public every<const S extends T, >(..._: Array<unknown>): this is CollectionHolder<S>
    public every(..._: Array<unknown>): never
    public every(): never {
        throw new Error("The method “every” was not expected to be called.",)
    }

    //#endregion -------------------- All --------------------
    //#region -------------------- Any --------------------

    public abstract any(): this["isNotEmpty"]
    public abstract any(predicate: Nullable<BooleanCallback<T>>,): boolean

    public some(..._: Array<unknown>): never
    public some() {
        throw new Error("The method “some” was not expected to be called.",)
    }

    //#endregion -------------------- Any --------------------
    //#region -------------------- None --------------------

    public abstract none(): this["isEmpty"]
    public abstract none(predicate: Nullable<BooleanCallback<T>>,): boolean

    //#endregion -------------------- None --------------------

    //#region -------------------- Has null --------------------

    public abstract readonly hasNull: boolean

    public get includesNull(): never {
        throw new Error("The getter method “includesNull” was not expected to be called.",)
    }

    public get containsNull(): never {
        throw new Error("The getter method “containsNull” was not expected to be called.",)
    }

    //#endregion -------------------- Has null --------------------
    //#region -------------------- Has no nulls --------------------

    public abstract readonly hasNoNulls: boolean

    public get includesNoNulls(): never {
        throw new Error("The getter method “includesNoNulls” was not expected to be called.",)
    }

    public get containsNoNulls(): never {
        throw new Error("The getter method “containsNoNulls” was not expected to be called.",)
    }

    //#endregion -------------------- Has no nulls --------------------
    //#region -------------------- Has duplicate --------------------

    public abstract readonly hasDuplicate: boolean

    public get includesDuplicate(): never {
        throw new Error("The getter method “includesDuplicate” was not expected to be called.",)
    }

    public get containsDuplicate(): never {
        throw new Error("The getter method “containsDuplicate” was not expected to be called.",)
    }

    //#endregion -------------------- Has duplicate --------------------
    //#region -------------------- Has no duplicates --------------------

    public abstract readonly hasNoDuplicates: boolean

    public get includesNoDuplicates(): never {
        throw new Error("The getter method “includesNoDuplicates” was not expected to be called.",)
    }

    public get containsNoDuplicates(): never {
        throw new Error("The getter method “containsNoDuplicates” was not expected to be called.",)
    }

    //#endregion -------------------- Has no duplicates --------------------

    //#region -------------------- Has --------------------

    public abstract has(value: T,): boolean

    public includes(..._: Array<unknown>): never
    public includes() {
        throw new Error("The method “includes” was not expected to be called.",)
    }

    public contains(..._: Array<unknown>): never
    public contains() {
        throw new Error("The method “contains” was not expected to be called.",)
    }

    //#endregion -------------------- Has --------------------
    //#region -------------------- Has not --------------------

    public abstract hasNot(value: T,): boolean

    public includesNot(..._: Array<unknown>): never
    public includesNot() {
        throw new Error("The method “includesNot” was not expected to be called.",)
    }

    public containsNot(..._: Array<unknown>): never
    public containsNot() {
        throw new Error("The method “containsNot” was not expected to be called.",)
    }

    //#endregion -------------------- Has not --------------------
    //#region -------------------- Has one --------------------

    public abstract hasOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean

    public includesOne(..._: Array<unknown>): never
    public includesOne() {
        throw new Error("The method “includesOne” was not expected to be called.",)
    }

    public containsOne(..._: Array<unknown>): never
    public containsOne() {
        throw new Error("The method “containsOne” was not expected to be called.",)
    }

    //#endregion -------------------- Has one --------------------
    //#region -------------------- Has not one --------------------

    public abstract hasNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean

    public includesNotOne(..._: Array<unknown>): never
    public includesNotOne() {
        throw new Error("The method “includesNotOne” was not expected to be called.",)
    }

    public containsNotOne(..._: Array<unknown>): never
    public containsNotOne() {
        throw new Error("The method “containsNotOne” was not expected to be called.",)
    }

    //#endregion -------------------- Has not one --------------------
    //#region -------------------- Has all --------------------

    public abstract hasAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean

    public includesAll(..._: Array<unknown>): never
    public includesAll() {
        throw new Error("The method “includesAll” was not expected to be called.",)
    }

    public containsAll(..._: Array<unknown>): never
    public containsAll() {
        throw new Error("The “containsAll” was not expected to be called.",)
    }

    //#endregion -------------------- Has all --------------------
    //#region -------------------- Has not all --------------------

    public abstract hasNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean

    public includesNotAll(..._: Array<unknown>): never
    public includesNotAll() {
        throw new Error("The method “includesNotAll” was not expected to be called.",)
    }

    public containsNotAll(..._: Array<unknown>): never
    public containsNotAll() {
        throw new Error("The “containsNotAll” was not expected to be called.",)
    }

    //#endregion -------------------- Has not all --------------------

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

    public abstract slice(from?: NullableNumber, to?: NullableNumber,): CollectionHolder<T>
    public abstract slice(indices: PossibleIterableIteratorArraySetOrCollectionHolder<number>,): CollectionHolder<T>

    //#endregion -------------------- Slice --------------------

    //#region -------------------- Take --------------------

    public abstract take(n: number,): CollectionHolder<T>

    public limit(..._: Array<unknown>): never
    public limit() {
        throw new Error("The method “limit” was not expected to be called.",)
    }


    public abstract takeWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public abstract takeWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>

    public limitWhile(..._: Array<unknown>): never
    public limitWhile() {
        throw new Error("The method “limitWhile” was not expected to be called.",)
    }


    public abstract takeWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public abstract takeWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>

    public limitWhileIndexed(..._: Array<unknown>): never
    public limitWhileIndexed() {
        throw new Error("The method “limitWhileIndexed” was not expected to be called.",)
    }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Take last --------------------

    public abstract takeLast(n: number,): CollectionHolder<T>

    public limitLast(..._: Array<unknown>): never
    public limitLast() {
        throw new Error("The method “limitLast” was not expected to be called.",)
    }


    public abstract takeLastWhile<const S extends T, >(predicate?: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public abstract takeLastWhile(predicate?: BooleanCallback<T>,): CollectionHolder<T>

    public limitLastWhile(..._: Array<unknown>): never
    public limitLastWhile() {
        throw new Error("The method “limitLastWhile” was not expected to be called.",)
    }


    public abstract takeLastWhileIndexed<const S extends T, >(predicate?: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public abstract takeLastWhileIndexed(predicate?: ReverseBooleanCallback<T>,): CollectionHolder<T>

    public limitLastWhileIndexed(..._: Array<unknown>): never
    public limitLastWhileIndexed() {
        throw new Error("The method “limitLastWhileIndexed” was not expected to be called.",)
    }

    //#endregion -------------------- Take last --------------------
    //#region -------------------- Drop --------------------

    public abstract drop(n: number,): CollectionHolder<T>

    public skip(..._: Array<unknown>): never
    public skip() {
        throw new Error("The method “skip” was not expected to be called.",)
    }


    public abstract dropWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public abstract dropWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>

    public skipWhile(..._: Array<unknown>): never
    public skipWhile() {
        throw new Error("The method “skipWhile” was not expected to be called.",)
    }


    public abstract dropWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public abstract dropWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>

    public skipWhileIndexed(..._: Array<unknown>): never
    public skipWhileIndexed() {
        throw new Error("The method “skipWhileIndexed” was not expected to be called.",)
    }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Drop last --------------------

    public abstract dropLast(n: number,): CollectionHolder<T>

    public skipLast(..._: Array<unknown>): never
    public skipLast() {
        throw new Error("The method “skipLast” was not expected to be called.",)
    }


    public abstract dropLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public abstract dropLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>

    public skipLastWhile(..._: Array<unknown>): never
    public skipLastWhile() {
        throw new Error("The method “skipLastWhile” was not expected to be called.",)
    }


    public abstract dropLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public abstract dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>

    public skipLastWhileIndexed(..._: Array<unknown>): never
    public skipLastWhileIndexed() {
        throw new Error("The method “skipLastWhileIndexed” was not expected to be called.",)
    }

    //#endregion -------------------- Drop last --------------------

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

    public abstract toReverse(from?: NullableNumber, to?: NullableNumber,): CollectionHolder<T>

    public toReversed(..._: Array<unknown>): never
    public toReversed() {
        throw new Error("The method “toReversed” was not expected to be called.",)
    }

    public reversed(..._: Array<unknown>): never
    public reversed() {
        throw new Error("The method “reversed” was not expected to be called.",)
    }

    //#endregion -------------------- To reverse --------------------

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- JavaScript methods --------------------

    public [Symbol.iterator](): never {
        throw new Error("The method “Symbol.iterator” was not expected to be called.",)
    }

    public get [Symbol.toStringTag](): CollectionHolderName {
        return "CollectionHolder"
    }

    //#endregion -------------------- JavaScript methods --------------------
    //#region -------------------- Conversion methods --------------------

    //#region -------------------- To other structure --------------------

    public abstract toIterator(): CollectionIterator<T>

    public abstract toArray(): Array<T>
    public abstract toMutableArray(): MutableArray<T>

    public abstract toSet(): Set<T>
    public abstract toMutableSet(): MutableSet<T>


    public abstract toMap(): NumberKeyMap<T>
    public abstract toMutableMap(): MutableNumberKeyMap<T>

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

    public abstract joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string

    public join(..._: Array<unknown>): never
    public join() {
        throw new Error("The method “join” was not expected to be called.",)
    }

    //#endregion -------------------- Join to string --------------------

    //#endregion -------------------- Conversion methods --------------------

}

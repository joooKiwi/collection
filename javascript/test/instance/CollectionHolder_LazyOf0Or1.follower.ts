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

import type {Nullable, NullableNumber, NullableString, NullOr, NullOrZeroNumber} from "@joookiwi/type"

import type {CollectionHolder}                                                                                                                              from "../../src/CollectionHolder"
import type {BooleanCallback, IndexWithReturnCallback, RestrainedBooleanCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, StringCallback} from "../../src/type/callback"
import type {CollectionHolderOf0Or1}                                                                                                                        from "../../src/type/collection"
import type {CollectionIteratorOf0Or1}                                                                                                                      from "../../src/type/iterator"
import type {PossibleIterableIteratorArraySetOrCollectionHolder}                                                                                            from "../../src/type/possibleInstance"
import type {CollectionHolderFollower}                                                                                                                      from "./CollectionHolderFollower"

import {LazyCollectionHolderOf0Or1} from "../../src/LazyCollectionHolderOf0Or1"
import {Optional}                   from "../../src/optional/Optional"

/**
 * An inherited instance of {@link LazyCollectionHolderOf0Or1}
 * made to have the followed methods based on the specific non-aliased method
 */
export class CollectionHolder_LazyOf0Or1Follower
    extends LazyCollectionHolderOf0Or1<string>
    implements CollectionHolderFollower<string> {

    //#region -------------------- Fields --------------------

    public size_amountOfCall = 0

    public isEmpty_amountOfCall = 0
    public isNotEmpty_amountOfCall = 0

    public hasExactly1Element_amountOfCall = 0
    public hasAtMost1Element_amountOfCall = 0

    public hasAtLeast2Elements_amountOfCall = 0
    public hasExactly2Elements_amountOfCall = 0
    public hasAtMost2Elements_amountOfCall = 0

    public get_amountOfCall = 0
    public getFirst_amountOfCall = 0
    public get getLast_amountOfCall(): never { throw new Error("The getter method “getLast_amountOfCall” was not expected to be called.") }
    public getOrElse_amountOfCall = 0
    public getOrNull_amountOfCall = 0
    public getFirstOrNull_amountOfCall = 0
    public get getLastOrNull_amountOfCall(): never { throw new Error("The getter method “getLast_amountOfCall” was not expected to be called.") }

    public firstIndexOf_amountOfCall = 0
    public firstIndexOfOrNull_amountOfCall = 0

    public indexOfFirst_amountOfCall = 0
    public indexOfFirstOrNull_amountOfCall = 0
    public indexOfFirstIndexed_amountOfCall = 0
    public indexOfFirstIndexedOrNull_amountOfCall = 0

    public get indexOfLast_amountOfCall(): never { throw new Error("The getter method “getLast_amountOfCall” was not expected to be called.") }
    public get indexOfLastOrNull_amountOfCall(): never { throw new Error("The getter method “getLast_amountOfCall” was not expected to be called.") }
    public get indexOfLastIndexed_amountOfCall(): never { throw new Error("The getter method “getLast_amountOfCall” was not expected to be called.") }
    public get indexOfLastIndexedOrNull_amountOfCall(): never { throw new Error("The getter method “getLast_amountOfCall” was not expected to be called.") }

    public all_amountOfCall = 0
    public any_amountOfCall = 0

    public has_amountOfCall = 0
    public hasNot_amountOfCall = 0
    public hasNull_amountOfCall = 0
    public hasNoNulls_amountOfCall = 0
    public hasDuplicate_amountOfCall = 0
    public hasNoDuplicates_amountOfCall = 0
    public hasOne_amountOfCall = 0
    public hasNotOne_amountOfCall = 0
    public hasAll_amountOfCall = 0
    public hasNotAll_amountOfCall = 0

    public findFirst_amountOfCall = 0
    public findFirstOrNull_amountOfCall = 0
    public findFirstIndexed_amountOfCall = 0
    public findFirstIndexedOrNull_amountOfCall = 0

    public get findLast_amountOfCall(): never { throw new Error("The getter method “getLast_amountOfCall” was not expected to be called.") }
    public get findLastOrNull_amountOfCall(): never { throw new Error("The getter method “getLast_amountOfCall” was not expected to be called.") }
    public get findLastIndexed_amountOfCall(): never { throw new Error("The getter method “getLast_amountOfCall” was not expected to be called.") }
    public get findLastIndexedOrNull_amountOfCall(): never { throw new Error("The getter method “getLast_amountOfCall” was not expected to be called.") }

    public take_amountOfCall = 0
    public takeWhile_amountOfCall = 0
    public takeWhileIndexed_amountOfCall = 0
    public get takeLast_amountOfCall(): never { throw new Error("The getter method “getLast_amountOfCall” was not expected to be called.") }
    public get takeLastWhile_amountOfCall(): never { throw new Error("The getter method “getLast_amountOfCall” was not expected to be called.") }
    public get takeLastWhileIndexed_amountOfCall(): never { throw new Error("The getter method “getLast_amountOfCall” was not expected to be called.") }

    public drop_amountOfCall = 0
    public dropWhile_amountOfCall = 0
    public dropWhileIndexed_amountOfCall = 0
    public get dropLast_amountOfCall(): never { throw new Error("The getter method “getLast_amountOfCall” was not expected to be called.") }
    public get dropLastWhile_amountOfCall(): never { throw new Error("The getter method “getLast_amountOfCall” was not expected to be called.") }
    public get dropLastWhileIndexed_amountOfCall(): never { throw new Error("The getter method “getLast_amountOfCall” was not expected to be called.") }

    public toReverse_amountOfCall = 0

    public toIterator_amountOfCall = 0
    public joinToString_amountOfCall = 0

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor() { super(() => new Optional('a',),) }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    public execute(action: (instance: this,) => void,): this {
        action(this,)
        return this
    }

    //#region -------------------- Size methods --------------------

    public override get size(): | 0 | 1 {
        this.size_amountOfCall++
        return super.size
    }


    public override get isEmpty(): boolean {
        this.isEmpty_amountOfCall++
        return super.isEmpty
    }

    public override get isNotEmpty(): boolean {
        this.isNotEmpty_amountOfCall++
        return super.isNotEmpty
    }


    public override get hasExactly1Element(): boolean {
        this.hasExactly1Element_amountOfCall++
        return super.hasExactly1Element
    }

    public override get hasAtMost1Element(): true {
        this.hasAtMost1Element_amountOfCall++
        return super.hasAtMost1Element
    }


    public override get hasAtLeast2Elements(): false {
        this.hasAtLeast2Elements_amountOfCall++
        return super.hasAtLeast2Elements
    }

    public override get hasExactly2Elements(): false {
        this.hasExactly2Elements_amountOfCall++
        return super.hasExactly2Elements
    }

    public override get hasAtMost2Elements(): true {
        this.hasAtMost2Elements_amountOfCall++
        return super.hasAtMost2Elements
    }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    public override get(index: number,): string {
        this.get_amountOfCall++
        return super.get(index,)
    }

    public override getFirst(): string {
        this.getFirst_amountOfCall++
        return super.getFirst()
    }


    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | string | U
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<string>,): string
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) {
        this.getOrElse_amountOfCall++
        return super.getOrElse(index, defaultValue)
    }


    public override getOrNull(index: number): NullOr<string> {
        this.getOrNull_amountOfCall++
        return super.getOrNull(index)
    }

    public override getFirstOrNull(): NullOr<string> {
        this.getFirstOrNull_amountOfCall++
        return super.getFirstOrNull()
    }

    //#endregion -------------------- Get --------------------
    //#region -------------------- Find --------------------

    public override findFirst<const S extends string, >(predicate: RestrainedBooleanCallback<string, S>,): S
    public override findFirst(predicate: BooleanCallback<string>,): string
    public override findFirst(predicate: BooleanCallback<string>,) {
        this.findFirst_amountOfCall++
        return super.findFirst(predicate,)
    }

    public override findFirstOrNull<const S extends string, >(predicate: RestrainedBooleanCallback<string, S>,): NullOr<S>
    public override findFirstOrNull(predicate: BooleanCallback<string>,): NullOr<string>
    public override findFirstOrNull(predicate: BooleanCallback<string>,) {
        this.findFirstOrNull_amountOfCall++
        return super.findFirstOrNull(predicate,)
    }

    public override findFirstIndexed<const S extends string, >(predicate: ReverseRestrainedBooleanCallback<string, S>,): S
    public override findFirstIndexed(predicate: ReverseBooleanCallback<string>,): string
    public override findFirstIndexed(predicate: ReverseBooleanCallback<string>,) {
        this.findFirstIndexed_amountOfCall++
        return super.findFirstIndexed(predicate,)
    }

    public override findFirstIndexedOrNull<const S extends string, >(predicate: ReverseRestrainedBooleanCallback<string, S>,): NullOr<S>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<string>,): NullOr<string>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<string>,) {
        this.findFirstIndexedOrNull_amountOfCall++
        return super.findFirstIndexedOrNull(predicate,)
    }

    //#endregion -------------------- Find --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    public override firstIndexOf(element: string, from?: NullableNumber, to?: NullableNumber,): 0 {
        this.firstIndexOf_amountOfCall++
        return super.firstIndexOf(element, from, to,)
    }

    public override firstIndexOfOrNull(element: string, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber {
        this.firstIndexOfOrNull_amountOfCall++
        return super.firstIndexOfOrNull(element, from, to,)
    }


    public override indexOfFirst(predicate: BooleanCallback<string>, from?: NullableNumber, to?: NullableNumber,): 0 {
        this.indexOfFirst_amountOfCall++
        return super.indexOfFirst(predicate, from, to,)
    }

    public override indexOfFirstOrNull(predicate: BooleanCallback<string>, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber {
        this.indexOfFirstOrNull_amountOfCall++
        return super.indexOfFirstOrNull(predicate, from, to,)
    }

    public override indexOfFirstIndexed(predicate: ReverseBooleanCallback<string>, from?: NullableNumber, to?: NullableNumber,): 0 {
        this.indexOfFirstIndexed_amountOfCall++
        return super.indexOfFirstIndexed(predicate, from, to,)
    }

    public override indexOfFirstIndexedOrNull(predicate: ReverseBooleanCallback<string>, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber {
        this.indexOfFirstIndexedOrNull_amountOfCall++
        return super.indexOfFirstIndexedOrNull(predicate, from, to,)
    }


    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    public override all<const S extends string, >(predicate: RestrainedBooleanCallback<string, S>,): this is CollectionHolder<S>
    public override all(predicate: BooleanCallback<string>,): boolean
    public override all(predicate: BooleanCallback<string>,) {
        this.all_amountOfCall++
        return super.all(predicate,)
    }

    public override any(): true
    public override any(predicate: Nullable<BooleanCallback<string>>,): boolean
    public override any(predicate?: Nullable<BooleanCallback<string>>,) {
        this.any_amountOfCall++
        return super.any(predicate,)
    }


    public override get hasNull(): boolean {
        this.hasNull_amountOfCall++
        return super.hasNull
    }

    public override get hasNoNulls(): boolean {
        this.hasNoNulls_amountOfCall++
        return super.hasNoNulls
    }

    public override get hasDuplicate(): false {
        this.hasDuplicate_amountOfCall++
        return super.hasDuplicate
    }

    public override get hasNoDuplicates(): true {
        this.hasNoDuplicates_amountOfCall++
        return super.hasNoDuplicates
    }

    public override has(value: string,): boolean {
        this.has_amountOfCall++
        return super.has(value,)
    }

    public override hasNot(value: string,): boolean {
        this.hasNot_amountOfCall++
        return super.hasNot(value,)
    }

    public override hasOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<string>>,): boolean {
        this.hasOne_amountOfCall++
        return super.hasOne(values,)
    }

    public override hasNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<string>>,): boolean {
        this.hasNotOne_amountOfCall++
        return super.hasNotOne(values,)
    }

    public override hasAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<string>>,): boolean {
        this.hasAll_amountOfCall++
        return super.hasAll(values,)
    }

    public override hasNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<string>>,): boolean {
        this.hasNotAll_amountOfCall++
        return super.hasNotAll(values,)
    }

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Take --------------------

    public override take(n: number,): CollectionHolderOf0Or1<string> {
        this.take_amountOfCall++
        return super.take(n,)
    }

    public override takeWhile<const S extends string, >(predicate: RestrainedBooleanCallback<string, S>): CollectionHolder<S>
    public override takeWhile(predicate: BooleanCallback<string>,): CollectionHolder<string>
    public override takeWhile(predicate: BooleanCallback<string>,) {
        this.takeWhile_amountOfCall++
        return super.takeWhile(predicate,)
    }

    public override takeWhileIndexed<const S extends string, >(predicate: ReverseRestrainedBooleanCallback<string, S>): CollectionHolder<S>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<string>,): CollectionHolder<string>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<string>,) {
        this.takeWhileIndexed_amountOfCall++
        return super.takeWhileIndexed(predicate,)
    }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Drop --------------------

    public override drop(n: number,): CollectionHolderOf0Or1<string> {
        this.drop_amountOfCall++
        return super.drop(n,)
    }

    public override dropWhile<const S extends string, >(predicate: RestrainedBooleanCallback<string, S>): CollectionHolder<S>
    public override dropWhile(predicate: BooleanCallback<string>,): CollectionHolder<string>
    public override dropWhile(predicate: BooleanCallback<string>,) {
        this.dropWhile_amountOfCall++
        return super.dropWhile(predicate,)
    }

    public override dropWhileIndexed<const S extends string, >(predicate: ReverseRestrainedBooleanCallback<string, S>): CollectionHolder<S>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<string>,): CollectionHolder<string>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<string>,) {
        this.dropWhileIndexed_amountOfCall++
        return super.dropWhileIndexed(predicate,)
    }

    //#endregion -------------------- Drop --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Reordering methods --------------------

    public override toReverse(from?: NullableNumber, to?: NullableNumber,): CollectionHolderOf0Or1<string> {
        this.toReverse_amountOfCall++
        return super.toReverse(from, to,)
    }

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- Conversion methods --------------------

    public override toIterator(): CollectionIteratorOf0Or1<string> {
        this.toIterator_amountOfCall++
        return super.toIterator()
    }

    public override joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<string>>,): string {
        this.joinToString_amountOfCall++
        return super.joinToString(separator, prefix, postfix, limit, truncated, transform,)
    }

    //#endregion -------------------- Conversion methods --------------------

    //#endregion -------------------- Methods --------------------

}

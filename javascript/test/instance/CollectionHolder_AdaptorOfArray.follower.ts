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

import type {Nullable, NullableNumber, NullableString, NullOr, NullOrNumber} from "@joookiwi/type"

import type {CollectionHolder}                                                                                                                              from "../../src/CollectionHolder"
import type {BooleanCallback, IndexWithReturnCallback, RestrainedBooleanCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, StringCallback} from "../../src/type/callback"
import type {PossibleIterableIteratorArraySetOrCollectionHolder}                                                                                            from "../../src/type/possibleInstance"
import type {CollectionHolderFollower}                                                                                                                      from "./CollectionHolderFollower"

import {ArrayAsCollectionHolder} from "../../src/ArrayAsCollectionHolder"
import {ABCD}                    from "../value/arrays"

/**
 * An inherited instance of {@link ArrayAsCollectionHolder}
 * made to have the followed methods based on the specific non-aliased method
 */
export class CollectionHolder_AdaptorOfArrayFollower
    extends ArrayAsCollectionHolder<string>
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
    public getLast_amountOfCall = 0
    public getOrElse_amountOfCall = 0
    public getOrNull_amountOfCall = 0
    public getFirstOrNull_amountOfCall = 0
    public getLastOrNull_amountOfCall = 0

    public firstIndexOf_amountOfCall = 0
    public firstIndexOfOrNull_amountOfCall = 0

    public indexOfFirst_amountOfCall = 0
    public indexOfFirstOrNull_amountOfCall = 0
    public indexOfFirstIndexed_amountOfCall = 0
    public indexOfFirstIndexedOrNull_amountOfCall = 0

    public indexOfLast_amountOfCall = 0
    public indexOfLastOrNull_amountOfCall = 0
    public indexOfLastIndexed_amountOfCall = 0
    public indexOfLastIndexedOrNull_amountOfCall = 0

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

    public findLast_amountOfCall = 0
    public findLastOrNull_amountOfCall = 0
    public findLastIndexed_amountOfCall = 0
    public findLastIndexedOrNull_amountOfCall = 0

    public take_amountOfCall = 0
    public takeWhile_amountOfCall = 0
    public takeWhileIndexed_amountOfCall = 0
    public takeLast_amountOfCall = 0
    public takeLastWhile_amountOfCall = 0
    public takeLastWhileIndexed_amountOfCall = 0

    public drop_amountOfCall = 0
    public dropWhile_amountOfCall = 0
    public dropWhileIndexed_amountOfCall = 0
    public dropLast_amountOfCall = 0
    public dropLastWhile_amountOfCall = 0
    public dropLastWhileIndexed_amountOfCall = 0

    public toReverse_amountOfCall = 0

    public joinToString_amountOfCall = 0

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor() { super(ABCD,) }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    public execute(action: (instance: this,) => void,): this {
        action(this,)
        return this
    }

    //#region -------------------- Size methods --------------------

    public override get size(): number {
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

    public override get hasAtMost1Element(): boolean {
        this.hasAtMost1Element_amountOfCall++
        return super.hasAtMost1Element
    }


    public override get hasAtLeast2Elements(): boolean {
        this.hasAtLeast2Elements_amountOfCall++
        return super.hasAtLeast2Elements
    }

    public override get hasExactly2Elements(): boolean {
        this.hasExactly2Elements_amountOfCall++
        return super.hasExactly2Elements
    }

    public override get hasAtMost2Elements(): boolean {
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

    public override getLast(): string {
        this.getLast_amountOfCall++
        return super.getLast()
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

    public override getLastOrNull(): NullOr<string> {
        this.getLastOrNull_amountOfCall++
        return super.getLastOrNull()
    }

    //#endregion -------------------- Get --------------------
    //#region -------------------- Find first --------------------

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

    //#endregion -------------------- Find first --------------------
    //#region -------------------- Find last --------------------

    public override findLast<const S extends string, >(predicate: RestrainedBooleanCallback<string, S>,): S
    public override findLast(predicate: BooleanCallback<string>,): string
    public override findLast(predicate: BooleanCallback<string>,) {
        this.findLast_amountOfCall++
        return super.findLast(predicate,)
    }

    public override findLastOrNull<const S extends string, >(predicate: RestrainedBooleanCallback<string, S>,): NullOr<S>
    public override findLastOrNull(predicate: BooleanCallback<string>,): NullOr<string>
    public override findLastOrNull(predicate: BooleanCallback<string>,) {
        this.findLastOrNull_amountOfCall++
        return super.findLastOrNull(predicate,)
    }

    public override findLastIndexed<const S extends string, >(predicate: ReverseRestrainedBooleanCallback<string, S>,): S
    public override findLastIndexed(predicate: ReverseBooleanCallback<string>,): string
    public override findLastIndexed(predicate: ReverseBooleanCallback<string>,) {
        this.findLastIndexed_amountOfCall++
        return super.findLastIndexed(predicate,)
    }

    public override findLastIndexedOrNull<const S extends string, >(predicate: ReverseRestrainedBooleanCallback<string, S>,): NullOr<S>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<string>,): NullOr<string>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<string>,) {
        this.findLastIndexedOrNull_amountOfCall++
        return super.findLastIndexedOrNull(predicate,)
    }

    //#endregion -------------------- Find last --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    public override firstIndexOf(element: string, from?: NullableNumber, to?: NullableNumber,): number {
        this.firstIndexOf_amountOfCall++
        return super.firstIndexOf(element, from, to,)
    }

    public override firstIndexOfOrNull(element: string, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        this.firstIndexOfOrNull_amountOfCall++
        return super.firstIndexOfOrNull(element, from, to,)
    }


    public override indexOfFirst(predicate: BooleanCallback<string>, from?: NullableNumber, to?: NullableNumber,): number {
        this.indexOfFirst_amountOfCall++
        return super.indexOfFirst(predicate, from, to,)
    }

    public override indexOfFirstOrNull(predicate: BooleanCallback<string>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        this.indexOfFirstOrNull_amountOfCall++
        return super.indexOfFirstOrNull(predicate, from, to,)
    }

    public override indexOfFirstIndexed(predicate: ReverseBooleanCallback<string>, from?: NullableNumber, to?: NullableNumber,): number {
        this.indexOfFirstIndexed_amountOfCall++
        return super.indexOfFirstIndexed(predicate, from, to,)
    }

    public override indexOfFirstIndexedOrNull(predicate: ReverseBooleanCallback<string>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        this.indexOfFirstIndexedOrNull_amountOfCall++
        return super.indexOfFirstIndexedOrNull(predicate, from, to,)
    }


    public override indexOfLast(predicate: BooleanCallback<string>, from?: NullableNumber, to?: NullableNumber,): number {
        this.indexOfLast_amountOfCall++
        return super.indexOfLast(predicate, from, to,)
    }

    public override indexOfLastOrNull(predicate: BooleanCallback<string>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        this.indexOfLastOrNull_amountOfCall++
        return super.indexOfLastOrNull(predicate, from, to,)
    }

    public override indexOfLastIndexed(predicate: ReverseBooleanCallback<string>, from?: NullableNumber, to?: NullableNumber,): number {
        this.indexOfLastIndexed_amountOfCall++
        return super.indexOfLastIndexed(predicate, from, to,)
    }

    public override indexOfLastIndexedOrNull(predicate: ReverseBooleanCallback<string>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        this.indexOfLastIndexedOrNull_amountOfCall++
        return super.indexOfLastIndexedOrNull(predicate, from, to,)
    }

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    public override all<S extends string, >(predicate: RestrainedBooleanCallback<string, S>,): this is CollectionHolder<S>
    public override all(predicate: BooleanCallback<string>,): boolean
    public override all(predicate: BooleanCallback<string>,) {
        this.all_amountOfCall++
        return super.all(predicate,)
    }

    public override any(): this["isNotEmpty"]
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

    public override get hasDuplicate(): boolean {
        this.hasDuplicate_amountOfCall++
        return super.hasDuplicate
    }

    public override get hasNoDuplicates(): boolean {
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

    public override take(n: number,): CollectionHolder<string> {
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

    public override takeLast(n: number,): CollectionHolder<string> {
        this.takeLast_amountOfCall++
        return super.takeLast(n,)
    }

    public override takeLastWhile<const S extends string, >(predicate: RestrainedBooleanCallback<string, S>): CollectionHolder<S>
    public override takeLastWhile(predicate: BooleanCallback<string>,): CollectionHolder<string>
    public override takeLastWhile(predicate: BooleanCallback<string>,) {
        this.takeLastWhile_amountOfCall++
        return super.takeLastWhile(predicate,)
    }

    public override takeLastWhileIndexed<const S extends string, >(predicate: ReverseRestrainedBooleanCallback<string, S>): CollectionHolder<S>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<string>,): CollectionHolder<string>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<string>,) {
        this.takeLastWhileIndexed_amountOfCall++
        return super.takeLastWhileIndexed(predicate,)
    }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Drop --------------------

    public override drop(n: number,): CollectionHolder<string> {
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

    public override dropLast(n: number,): CollectionHolder<string> {
        this.dropLast_amountOfCall++
        return super.dropLast(n,)
    }

    public override dropLastWhile<const S extends string, >(predicate: RestrainedBooleanCallback<string, S>): CollectionHolder<S>
    public override dropLastWhile(predicate: BooleanCallback<string>,): CollectionHolder<string>
    public override dropLastWhile(predicate: BooleanCallback<string>,) {
        this.dropLastWhile_amountOfCall++
        return super.dropLastWhile(predicate,)
    }

    public override dropLastWhileIndexed<const S extends string, >(predicate: ReverseRestrainedBooleanCallback<string, S>): CollectionHolder<S>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<string>,): CollectionHolder<string>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<string>,) {
        this.dropLastWhileIndexed_amountOfCall++
        return super.dropLastWhileIndexed(predicate,)
    }

    //#endregion -------------------- Drop --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Reordering methods --------------------

    public override toReverse(from?: NullableNumber, to?: NullableNumber,): CollectionHolder<string> {
        this.toReverse_amountOfCall++
        return super.toReverse(from, to,)
    }

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- Conversion methods --------------------

    public override joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<string>>,): string {
        this.joinToString_amountOfCall++
        return super.joinToString(separator, prefix, postfix, limit, truncated, transform,)
    }

    //#endregion -------------------- Conversion methods --------------------

    //#endregion -------------------- Methods --------------------

}

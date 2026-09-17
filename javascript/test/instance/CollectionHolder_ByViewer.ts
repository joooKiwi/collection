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

import type {MutableNumberKeyMap, MutableStringArray, MutableStringSet, Nullable, NullableNumber, NullableString, NullOr, NullOrNumber, NullOrString, NumberKeyMap, StringArray, StringSet} from "@joookiwi/type"

import type {CollectionHolder}                                                                                                                                                                                                                                                  from "../../src/CollectionHolder"
import type {MinimalistCollectionHolder}                                                                                                                                                                                                                                        from "../../src/MinimalistCollectionHolder"
import type {CollectionIterator}                                                                                                                                                                                                                                                from "../../src/iterator/CollectionIterator"
import type {BooleanCallback, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, RestrainedBooleanCallback, ReturnCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, StringCallback, ValueIndexCallback, ValueIndexWithReturnCallback} from "../../src/type/callback"
import type {PossibleIterableIteratorArraySetOrCollectionHolder}                                                                                                                                                                                                                from "../../src/type/possibleInstance"

import {ArrayAsCollectionHolder}                      from "../../src/ArrayAsCollectionHolder"
import {CollectionViewer}                             from "../../src/CollectionViewer"
import {AbstractUnimplementedCollectionHolderForTest} from "./AbstractUnimplementedCollectionHolderForTest"
import {ABCD}                                         from "../value/arrays"

/**
 * A class to test the functionality of a {@link CollectionViewer}
  */
export class CollectionHolder_ByViewer
    extends AbstractUnimplementedCollectionHolderForTest<string> {

    //#region -------------------- Fields --------------------

    /** The amount of time {@link CollectionViewer.size} has been called */
    public size_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.isEmpty} has been called */
    public isEmpty_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.isNotEmpty} has been called */
    public isNotEmpty_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.hasExactly1Element} has been called */
    public hasExactly1Element_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.hasAtMost1Element} has been called */
    public hasAtMost1Element_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.hasAtLeast2Elements} has been called */
    public hasAtLeast2Elements_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.hasExactly2Elements} has been called */
    public hasExactly2Elements_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.hasAtMost2Elements} has been called */
    public hasAtMost2Elements_amountOfCall = 0

    /** The amount of time {@link CollectionViewer.get} has been called */
    public get_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.getFirst} has been called */
    public getFirst_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.getLast} has been called */
    public getLast_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.getOrElse} has been called */
    public getOrElse_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.getFirstOrElse} has been called */
    public getFirstOrElse_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.getLastOrElse} has been called */
    public getLastOrElse_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.getOrNull} has been called */
    public getOrNull_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.getFirstOrNull} has been called */
    public getFirstOrNull_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.getLastOrNull} has been called */
    public getLastOrNull_amountOfCall = 0

    /** The amount of time {@link CollectionViewer.findFirst} has been called */
    public findFirst_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.findFirstOrNull} has been called */
    public findFirstOrNull_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.findFirstIndexed} has been called */
    public findFirstIndexed_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.findFirstIndexedOrNull} has been called */
    public findFirstIndexedOrNull_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.findLast} has been called */
    public findLast_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.findLastOrNull} has been called */
    public findLastOrNull_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.findLastIndexed} has been called */
    public findLastIndexed_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.findLastIndexedOrNull} has been called */
    public findLastIndexedOrNull_amountOfCall = 0

    /** The amount of time {@link CollectionViewer.firstIndexOf} has been called */
    public firstIndexOf_amountOfCall= 0
    /** The amount of time {@link CollectionViewer.firstIndexOfOrNull} has been called */
    public firstIndexOfOrNull_amountOfCall= 0
    /** The amount of time {@link CollectionViewer.lastIndexOf} has been called */
    public lastIndexOf_amountOfCall= 0
    /** The amount of time {@link CollectionViewer.lastIndexOfOrNull} has been called */
    public lastIndexOfOrNull_amountOfCall= 0
    /** The amount of time {@link CollectionViewer.indexOfFirst} has been called */
    public indexOfFirst_amountOfCall= 0
    /** The amount of time {@link CollectionViewer.indexOfFirstOrNull} has been called */
    public indexOfFirstOrNull_amountOfCall= 0
    /** The amount of time {@link CollectionViewer.indexOfFirstIndexed} has been called */
    public indexOfFirstIndexed_amountOfCall= 0
    /** The amount of time {@link CollectionViewer.indexOfFirstIndexedOrNull} has been called */
    public indexOfFirstIndexedOrNull_amountOfCall= 0
    /** The amount of time {@link CollectionViewer.indexOfLast} has been called */
    public indexOfLast_amountOfCall= 0
    /** The amount of time {@link CollectionViewer.indexOfLastOrNull} has been called */
    public indexOfLastOrNull_amountOfCall= 0
    /** The amount of time {@link CollectionViewer.indexOfLastIndexed} has been called */
    public indexOfLastIndexed_amountOfCall= 0
    /** The amount of time {@link CollectionViewer.indexOfLastIndexedOrNull} has been called */
    public indexOfLastIndexedOrNull_amountOfCall= 0

    /** The amount of time {@link CollectionViewer.all} has been called */
    public all_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.any} has been called */
    public any_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.none} has been called */
    public none_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.has} has been called */
    public has_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.hasNot} has been called */
    public hasNot_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.hasNull} has been called */
    public hasNull_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.hasNoNulls} has been called */
    public hasNoNulls_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.hasDuplicate} has been called */
    public hasDuplicate_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.hasNoDuplicates} has been called */
    public hasNoDuplicates_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.hasOne} has been called */
    public hasOne_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.hasNotOne} has been called */
    public hasNotOne_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.hasAll} has been called */
    public hasAll_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.hasNotAll} has been called */
    public hasNotAll_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.requireNoNulls} has been called */
    public requireNoNulls_amountOfCall = 0

    /** The amount of time {@link CollectionViewer.filter} has been called */
    public filter_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.filterIndexed} has been called */
    public filterIndexed_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.filterNot} has been called */
    public filterNot_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.filterNotIndexed} has been called */
    public filterNotIndexed_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.filterNotNull} has been called */
    public filterNotNull_amountOfCall = 0

    /** The amount of time {@link CollectionViewer.slice} has been called */
    public slice_amountOfCall = 0

    /** The amount of time {@link CollectionViewer.take} has been called */
    public take_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.takeWhile} has been called */
    public takeWhile_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.takeWhileIndexed} has been called */
    public takeWhileIndexed_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.takeLast} has been called */
    public takeLast_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.takeLastWhile} has been called */
    public takeLastWhile_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.takeLastWhileIndexed} has been called */
    public takeLastWhileIndexed_amountOfCall = 0

    /** The amount of time {@link CollectionViewer.drop} has been called */
    public drop_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.dropWhile} has been called */
    public dropWhile_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.dropWhileIndexed} has been called */
    public dropWhileIndexed_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.dropLast} has been called */
    public dropLast_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.dropLastWhile} has been called */
    public dropLastWhile_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.dropLastWhileIndexed} has been called */
    public dropLastWhileIndexed_amountOfCall = 0

    /** The amount of time {@link CollectionViewer.map} has been called */
    public map_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.mapIndexed} has been called */
    public mapIndexed_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.mapNotNull} has been called */
    public mapNotNull_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.mapNotNullIndexed} has been called */
    public mapNotNullIndexed_amountOfCall = 0

    /** The amount of time {@link CollectionViewer.forEach} has been called */
    public forEach_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.forEachIndexed} has been called */
    public forEachIndexed_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.onEach} has been called */
    public onEach_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.onEachIndexed} has been called */
    public onEachIndexed_amountOfCall = 0

    /** The amount of time {@link CollectionViewer.toReversed} has been called */
    public toReversed_amountOfCall = 0

    /** The amount of time {@link CollectionViewer.toIterator} has been called */
    public toIterator_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.toArray} has been called */
    public toArray_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.toMutableArray} has been called */
    public toMutableArray_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.toSet} has been called */
    public toSet_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.toMutableSet} has been called */
    public toMutableSet_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.toMap} has been called */
    public toMap_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.toMutableMap} has been called */
    public toMutableMap_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.toString} has been called */
    public toString_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.toLocaleString} has been called */
    public toLocaleString_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.toLowerCaseString} has been called */
    public toLowerCaseString_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.toLocaleLowerCaseString} has been called */
    public toLocaleLowerCaseString_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.toUpperCaseString} has been called */
    public toUpperCaseString_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.toLocaleUpperCaseString} has been called */
    public toLocaleUpperCaseString_amountOfCall = 0
    /** The amount of time {@link CollectionViewer.joinToString} has been called */
    public joinToString_amountOfCall = 0

    /** The internal instance that is tested */
    public readonly instance: CollectionViewer<string, ArrayAsCollectionHolder<string>>

    public readonly reference: ArrayAsCollectionHolder<string>

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor() {
        super()
        const $this = this
        this.instance = new CollectionViewer(this.reference = new class CollectionHolder_CountingByViewer extends ArrayAsCollectionHolder<string> {

            //#region -------------------- Size methods --------------------

            public override get size(): number {
                $this.size_amountOfCall++
                return super.size
            }


            public override get isEmpty(): boolean {
                $this.isEmpty_amountOfCall++
                return super.isEmpty
            }

            public override get isNotEmpty(): boolean {
                $this.isNotEmpty_amountOfCall++
                return super.isNotEmpty
            }


            public override get hasExactly1Element(): boolean {
                $this.hasExactly1Element_amountOfCall++
                return super.hasExactly1Element
            }

            public override get hasAtMost1Element(): boolean {
                $this.hasAtMost1Element_amountOfCall++
                return super.hasAtMost1Element
            }


            public override get hasAtLeast2Elements(): boolean {
                $this.hasAtLeast2Elements_amountOfCall++
                return super.hasAtLeast2Elements
            }

            public override get hasExactly2Elements(): boolean {
                $this.hasExactly2Elements_amountOfCall++
                return super.hasExactly2Elements
            }

            public override get hasAtMost2Elements(): boolean {
                $this.hasAtMost2Elements_amountOfCall++
                return super.hasAtMost2Elements
            }

            //#endregion -------------------- Size methods --------------------
            //#region -------------------- Research methods --------------------

            //#region -------------------- Get --------------------

            public override get(index: number,): string {
                $this.get_amountOfCall++
                return super.get(index,)
            }

            public override getFirst(): string {
                $this.getFirst_amountOfCall++
                return super.getFirst()
            }

            public override getLast(): string {
                $this.getLast_amountOfCall++
                return super.getLast()
            }


            public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | string | U
            public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<string>,): string
            public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) {
                $this.getOrElse_amountOfCall++
                return super.getOrElse(index, defaultValue,)
            }

            public override getFirstOrElse<const U, >(defaultValue: ReturnCallback<U>,): | string | U
            public override getFirstOrElse(defaultValue: ReturnCallback<string>,): string
            public override getFirstOrElse(defaultValue: ReturnCallback<unknown>,) {
                $this.getFirstOrElse_amountOfCall++
                return super.getFirstOrElse(defaultValue,)
            }

            public override getLastOrElse<const U, >(defaultValue: ReturnCallback<U>,): | string | U
            public override getLastOrElse(defaultValue: ReturnCallback<string>,): string
            public override getLastOrElse(defaultValue: ReturnCallback<unknown>,) {
                $this.getLastOrElse_amountOfCall++
                return super.getLastOrElse(defaultValue,)
            }


            public override getOrNull(index: number,): NullOr<string> {
                $this.getOrNull_amountOfCall++
                return super.getOrNull(index,)
            }

            public override getFirstOrNull(): NullOr<string> {
                $this.getFirstOrNull_amountOfCall++
                return super.getFirstOrNull()
            }

            public override getLastOrNull(): NullOr<string> {
                $this.getLastOrNull_amountOfCall++
                return super.getLastOrNull()
            }

            //#endregion -------------------- Get --------------------
            //#region -------------------- Find --------------------

            public override findFirst<const S extends string, >(predicate: RestrainedBooleanCallback<string, S>,): S
            public override findFirst(predicate: BooleanCallback<string>,): string
            public override findFirst(predicate: BooleanCallback<string>,) {
                $this.findFirst_amountOfCall++
                return super.findFirst(predicate,)
            }

            public override findFirstOrNull<const S extends string, >(predicate: RestrainedBooleanCallback<string, S>,): NullOr<S>
            public override findFirstOrNull(predicate: BooleanCallback<string>,): NullOrString
            public override findFirstOrNull(predicate: BooleanCallback<string>,) {
                $this.findFirstOrNull_amountOfCall++
                return super.findFirstOrNull(predicate,)
            }

            public override findFirstIndexed<const S extends string, >(predicate: ReverseRestrainedBooleanCallback<string, S>,): S
            public override findFirstIndexed(predicate: ReverseBooleanCallback<string>,): string
            public override findFirstIndexed(predicate: ReverseBooleanCallback<string>,) {
                $this.findFirstIndexed_amountOfCall++
                return super.findFirstIndexed(predicate,)
            }

            public override findFirstIndexedOrNull<const S extends string, >(predicate: ReverseRestrainedBooleanCallback<string, S>,): NullOr<S>
            public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<string>,): NullOrString
            public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<string>,) {
                $this.findFirstIndexedOrNull_amountOfCall++
                return super.findFirstIndexedOrNull(predicate,)
            }


            public override findLast<const S extends string, >(predicate: RestrainedBooleanCallback<string, S>,): S
            public override findLast(predicate: BooleanCallback<string>,): string
            public override findLast(predicate: BooleanCallback<string>,) {
                $this.findLast_amountOfCall++
                return super.findLast(predicate,)
            }

            public override findLastOrNull<const S extends string, >(predicate: RestrainedBooleanCallback<string, S>,): NullOr<S>
            public override findLastOrNull(predicate: BooleanCallback<string>,): NullOrString
            public override findLastOrNull(predicate: BooleanCallback<string>,) {
                $this.findLastOrNull_amountOfCall++
                return super.findLastOrNull(predicate,)
            }

            public override findLastIndexed<const S extends string, >(predicate: ReverseRestrainedBooleanCallback<string, S>,): S
            public override findLastIndexed(predicate: ReverseBooleanCallback<string>,): string
            public override findLastIndexed(predicate: ReverseBooleanCallback<string>,) {
                $this.findLastIndexed_amountOfCall++
                return super.findLastIndexed(predicate,)
            }

            public override findLastIndexedOrNull<const S extends string, >(predicate: ReverseRestrainedBooleanCallback<string, S>,): NullOr<S>
            public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<string>,): NullOrString
            public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<string>,) {
                $this.findLastIndexedOrNull_amountOfCall++
                return super.findLastIndexedOrNull(predicate,)
            }

            //#endregion -------------------- Find --------------------

            //#endregion -------------------- Research methods --------------------
            //#region -------------------- Index methods --------------------

            public override firstIndexOf(element: string, from?: NullableNumber, to?: NullableNumber,): number {
                $this.firstIndexOf_amountOfCall++
                return super.firstIndexOf(element, from, to,)
            }

            public override firstIndexOfOrNull(element: string, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
                $this.firstIndexOfOrNull_amountOfCall++
                return super.firstIndexOfOrNull(element, from, to,)
            }


            public override lastIndexOf(element: string, from?: NullableNumber, to?: NullableNumber,): number {
                $this.lastIndexOf_amountOfCall++
                return super.lastIndexOf(element, from, to,)
            }

            public override lastIndexOfOrNull(element: string, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
                $this.lastIndexOfOrNull_amountOfCall++
                return super.lastIndexOfOrNull(element, from, to,)
            }


            public override indexOfFirst(predicate: BooleanCallback<string>, from?: NullableNumber, to?: NullableNumber,): number {
                $this.indexOfFirst_amountOfCall++
                return super.indexOfFirst(predicate, from, to,)
            }

            public override indexOfFirstOrNull(predicate: BooleanCallback<string>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
                $this.indexOfFirstOrNull_amountOfCall++
                return super.indexOfFirstOrNull(predicate, from, to,)
            }

            public override indexOfFirstIndexed(predicate: ReverseBooleanCallback<string>, from?: NullableNumber, to?: NullableNumber,): number {
                $this.indexOfFirstIndexed_amountOfCall++
                return super.indexOfFirstIndexed(predicate, from, to,)
            }

            public override indexOfFirstIndexedOrNull(predicate: ReverseBooleanCallback<string>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
                $this.indexOfFirstIndexedOrNull_amountOfCall++
                return super.indexOfFirstIndexedOrNull(predicate, from, to,)
            }


            public override indexOfLast(predicate: BooleanCallback<string>, from?: NullableNumber, to?: NullableNumber,): number {
                $this.indexOfLast_amountOfCall++
                return super.indexOfLast(predicate, from, to,)
            }

            public override indexOfLastOrNull(predicate: BooleanCallback<string>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
                $this.indexOfLastIndexed_amountOfCall++
                return super.indexOfLastOrNull(predicate, from, to,)
            }

            public override indexOfLastIndexed(predicate: ReverseBooleanCallback<string>, from?: NullableNumber, to?: NullableNumber,): number {
                $this.indexOfLastIndexedOrNull_amountOfCall++
                return super.indexOfLastIndexed(predicate, from, to,)
            }

            public override indexOfLastIndexedOrNull(predicate: ReverseBooleanCallback<string>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
                $this.indexOfLastOrNull_amountOfCall++
                return super.indexOfLastIndexedOrNull(predicate, from, to,)
            }

            //#endregion -------------------- Index methods --------------------
            //#region -------------------- Validation methods --------------------

            public override all<const S extends string, >(predicate: RestrainedBooleanCallback<string, S>,): this is CollectionHolder<S>
            public override all(predicate: BooleanCallback<string>,): boolean
            public override all(predicate: BooleanCallback<string>,) {
                $this.all_amountOfCall++
                return super.all(predicate,)
            }

            public override any(): this["isNotEmpty"]
            public override any(predicate: Nullable<BooleanCallback<string>>,): boolean
            public override any(predicate?: Nullable<BooleanCallback<string>>,) {
                $this.any_amountOfCall++
                return super.any(predicate,)
            }

            public override none(): this["isEmpty"]
            public override none(predicate: Nullable<BooleanCallback<string>>,): boolean
            public override none(predicate?: Nullable<BooleanCallback<string>>,) {
                $this.none_amountOfCall++
                return super.none(predicate,)
            }


            public override get hasNull(): boolean {
                $this.hasNull_amountOfCall++
                return super.hasNull
            }

            public override get hasNoNulls(): boolean {
                $this.hasNoNulls_amountOfCall++
                return super.hasNoNulls
            }


            public override get hasDuplicate(): boolean {
                $this.hasDuplicate_amountOfCall++
                return super.hasDuplicate
            }

            public override get hasNoDuplicates(): boolean {
                $this.hasNoDuplicates_amountOfCall++
                return super.hasNoDuplicates
            }


            public override has(value: string,): boolean {
                $this.has_amountOfCall++
                return super.has(value,)
            }

            public override hasNot(value: string,): boolean {
                $this.hasNot_amountOfCall++
                return super.hasNot(value,)
            }

            public override hasOne(values: Nullable<StringArray>,): boolean
            public override hasOne(values: Nullable<StringSet>,): boolean
            public override hasOne(values: Nullable<CollectionHolder<string>>,): boolean
            public override hasOne(values: Nullable<MinimalistCollectionHolder<string>>,): boolean
            public override hasOne(values: Nullable<CollectionIterator<string>>,): boolean
            public override hasOne(values: Nullable<IteratorObject<string, unknown, unknown>>,): boolean
            public override hasOne(values: Nullable<Iterator<string, unknown, unknown>>,): boolean
            public override hasOne(values: Nullable<Iterable<string, unknown, unknown>>,): boolean
            public override hasOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<string>>,): boolean
            public override hasOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<string>>,) {
                $this.hasOne_amountOfCall++
                return super.hasOne(values,)
            }

            public override hasNotOne(values: Nullable<StringArray>,): boolean
            public override hasNotOne(values: Nullable<StringSet>,): boolean
            public override hasNotOne(values: Nullable<CollectionHolder<string>>,): boolean
            public override hasNotOne(values: Nullable<MinimalistCollectionHolder<string>>,): boolean
            public override hasNotOne(values: Nullable<CollectionIterator<string>>,): boolean
            public override hasNotOne(values: Nullable<IteratorObject<string, unknown, unknown>>,): boolean
            public override hasNotOne(values: Nullable<Iterator<string, unknown, unknown>>,): boolean
            public override hasNotOne(values: Nullable<Iterable<string, unknown, unknown>>,): boolean
            public override hasNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<string>>,): boolean
            public override hasNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<string>>,) {
                $this.hasNotOne_amountOfCall++
                return super.hasNotOne(values,)
            }

            public override hasAll(values: Nullable<StringArray>,): boolean
            public override hasAll(values: Nullable<StringSet>,): boolean
            public override hasAll(values: Nullable<CollectionHolder<string>>,): boolean
            public override hasAll(values: Nullable<MinimalistCollectionHolder<string>>,): boolean
            public override hasAll(values: Nullable<CollectionIterator<string>>,): boolean
            public override hasAll(values: Nullable<IteratorObject<string, unknown, unknown>>,): boolean
            public override hasAll(values: Nullable<Iterator<string, unknown, unknown>>,): boolean
            public override hasAll(values: Nullable<Iterable<string, unknown, unknown>>,): boolean
            public override hasAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<string>>,): boolean
            public override hasAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<string>>,) {
                $this.hasAll_amountOfCall++
                return super.hasAll(values,)
            }

            public override hasNotAll(values: Nullable<StringArray>,): boolean
            public override hasNotAll(values: Nullable<StringSet>,): boolean
            public override hasNotAll(values: Nullable<CollectionHolder<string>>,): boolean
            public override hasNotAll(values: Nullable<MinimalistCollectionHolder<string>>,): boolean
            public override hasNotAll(values: Nullable<CollectionIterator<string>>,): boolean
            public override hasNotAll(values: Nullable<IteratorObject<string, unknown, unknown>>,): boolean
            public override hasNotAll(values: Nullable<Iterator<string, unknown, unknown>>,): boolean
            public override hasNotAll(values: Nullable<Iterable<string, unknown, unknown>>,): boolean
            public override hasNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<string>>,): boolean
            public override hasNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<string>>,) {
                $this.hasNotAll_amountOfCall++
                return super.hasNotAll(values,)
            }


            public override requireNoNulls(): CollectionHolder<NonNullable<string>> {
                $this.requireNoNulls_amountOfCall++
                return super.requireNoNulls()
            }

            //#endregion -------------------- Validation methods --------------------
            //#region -------------------- Transformation methods --------------------

            //#region -------------------- Filter --------------------

            public override filter<const S extends string, >(predicate: RestrainedBooleanCallback<string, S>,): CollectionHolder<S>
            public override filter(predicate: BooleanCallback<string>,): CollectionHolder<string>
            public override filter(predicate: BooleanCallback<string>,) {
                $this.filter_amountOfCall++
                return super.filter(predicate,)
            }

            public override filterIndexed<const S extends string, >(predicate: ReverseRestrainedBooleanCallback<string, S>,): CollectionHolder<S>
            public override filterIndexed(predicate: ReverseBooleanCallback<string>,): CollectionHolder<string>
            public override filterIndexed(predicate: ReverseBooleanCallback<string>,) {
                $this.filterIndexed_amountOfCall++
                return super.filterIndexed(predicate,)
            }

            public override filterNot<const S extends string, >(predicate: RestrainedBooleanCallback<string, S>,): CollectionHolder<Exclude<string, S>>
            public override filterNot(predicate: BooleanCallback<string>,): CollectionHolder<string>
            public override filterNot(predicate: BooleanCallback<string>,) {
                $this.filterNot_amountOfCall++
                return super.filterNot(predicate,)
            }

            public override filterNotIndexed<const S extends string, >(predicate: ReverseRestrainedBooleanCallback<string, S>,): CollectionHolder<Exclude<string, S>>
            public override filterNotIndexed(predicate: ReverseBooleanCallback<string>,): CollectionHolder<string>
            public override filterNotIndexed(predicate: ReverseBooleanCallback<string>,) {
                $this.filterNotIndexed_amountOfCall++
                return super.filterNotIndexed(predicate,)
            }

            public override filterNotNull(): CollectionHolder<NonNullable<string>> {
                $this.filterNotNull_amountOfCall++
                return super.filterNotNull()
            }

            //#endregion -------------------- Filter --------------------
            //#region -------------------- Slice --------------------

            public override slice(from?: NullableNumber, to?: NullableNumber,): CollectionHolder<string>
            public override slice(indices: PossibleIterableIteratorArraySetOrCollectionHolder<number>,): CollectionHolder<string>
            public override slice(indicesOrFrom?: Nullable<| PossibleIterableIteratorArraySetOrCollectionHolder<number> | number>, to?: NullableNumber,) {
                $this.slice_amountOfCall++
                return super.slice(indicesOrFrom, to,)
            }

            //#endregion -------------------- Slice --------------------
            //#region -------------------- Take --------------------

            public override take(n: number,): CollectionHolder<string> {
                $this.take_amountOfCall++
                return super.take(n,)
            }

            public override takeWhile<const S extends string, >(predicate: RestrainedBooleanCallback<string, S>,): CollectionHolder<S>
            public override takeWhile(predicate: BooleanCallback<string>,): CollectionHolder<string>
            public override takeWhile(predicate: BooleanCallback<string>,) {
                $this.takeWhile_amountOfCall++
                return super.takeWhile(predicate,)
            }

            public override takeWhileIndexed<const S extends string, >(predicate: ReverseRestrainedBooleanCallback<string, S>,): CollectionHolder<S>
            public override takeWhileIndexed(predicate: ReverseBooleanCallback<string>,): CollectionHolder<string>
            public override takeWhileIndexed(predicate: ReverseBooleanCallback<string>,) {
                $this.takeWhileIndexed_amountOfCall++
                return super.takeWhileIndexed(predicate,)
            }


            public override takeLast(n: number,): CollectionHolder<string> {
                $this.takeLast_amountOfCall++
                return super.takeLast(n,)
            }

            public override takeLastWhile<const S extends string, >(predicate: RestrainedBooleanCallback<string, S>,): CollectionHolder<S>
            public override takeLastWhile(predicate: BooleanCallback<string>,): CollectionHolder<string>
            public override takeLastWhile(predicate: BooleanCallback<string>,) {
                $this.takeLastWhile_amountOfCall++
                return super.takeLastWhile(predicate,)
            }

            public override takeLastWhileIndexed<const S extends string, >(predicate: ReverseRestrainedBooleanCallback<string, S>,): CollectionHolder<S>
            public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<string>,): CollectionHolder<string>
            public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<string>,) {
                $this.takeLastWhileIndexed_amountOfCall++
                return super.takeLastWhileIndexed(predicate,)
            }

            //#endregion -------------------- Take --------------------
            //#region -------------------- Drop --------------------

            public override drop(n: number,): CollectionHolder<string> {
                $this.drop_amountOfCall++
                return super.drop(n,)
            }

            public override dropWhile<const S extends string, >(predicate: RestrainedBooleanCallback<string, S>,): CollectionHolder<S>
            public override dropWhile(predicate: BooleanCallback<string>,): CollectionHolder<string>
            public override dropWhile(predicate: BooleanCallback<string>,) {
                $this.dropWhile_amountOfCall++
                return super.dropWhile(predicate,)
            }

            public override dropWhileIndexed<const S extends string, >(predicate: ReverseRestrainedBooleanCallback<string, S>,): CollectionHolder<S>
            public override dropWhileIndexed(predicate: ReverseBooleanCallback<string>,): CollectionHolder<string>
            public override dropWhileIndexed(predicate: ReverseBooleanCallback<string>,) {
                $this.dropWhileIndexed_amountOfCall++
                return super.dropWhileIndexed(predicate,)
            }


            public override dropLast(n: number,): CollectionHolder<string> {
                $this.dropLast_amountOfCall++
                return super.dropLast(n,)
            }

            public override dropLastWhile<const S extends string, >(predicate: RestrainedBooleanCallback<string, S>,): CollectionHolder<S>
            public override dropLastWhile(predicate: BooleanCallback<string>,): CollectionHolder<string>
            public override dropLastWhile(predicate: BooleanCallback<string>,) {
                $this.dropLastWhile_amountOfCall++
                return super.dropLastWhile(predicate,)
            }

            public override dropLastWhileIndexed<const S extends string, >(predicate: ReverseRestrainedBooleanCallback<string, S>,): CollectionHolder<S>
            public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<string>,): CollectionHolder<string>
            public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<string>,) {
                $this.dropLastWhileIndexed_amountOfCall++
                return super.dropLastWhileIndexed(predicate,)
            }

            //#endregion -------------------- Drop --------------------
            //#region -------------------- Map --------------------

            public override map<const U, >(transform: ValueIndexWithReturnCallback<string, U>,): CollectionHolder<U> {
                $this.map_amountOfCall++
                return super.map(transform,)
            }

            public override mapIndexed<const U, >(transform: IndexValueWithReturnCallback<string, U>,): CollectionHolder<U> {
                $this.mapIndexed_amountOfCall++
                return super.mapIndexed(transform,)
            }

            public override mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<string, Nullable<U>>,): CollectionHolder<U> {
                $this.mapNotNull_amountOfCall++
                return super.mapNotNull(transform,)
            }

            public override mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<string, Nullable<U>>,): CollectionHolder<U> {
                $this.mapNotNullIndexed_amountOfCall++
                return super.mapNotNullIndexed(transform,)
            }

            //#endregion -------------------- Map --------------------

            //#endregion -------------------- Transformation methods --------------------
            //#region -------------------- Loop methods --------------------

            public override forEach(action: ValueIndexCallback<string>,): void {
                $this.forEach_amountOfCall++
                super.forEach(action,)
            }

            public override forEachIndexed(action: IndexValueCallback<string>,): void {
                $this.forEachIndexed_amountOfCall++
                super.forEachIndexed(action,)
            }


            public override onEach(action: ValueIndexCallback<string>,): this {
                $this.onEach_amountOfCall++
                return super.onEach(action,)
            }

            public override onEachIndexed(action: IndexValueCallback<string>,): this {
                $this.onEachIndexed_amountOfCall++
                return super.onEachIndexed(action,)
            }

            //#endregion -------------------- Loop methods --------------------
            //#region -------------------- Reordering methods --------------------

            public override toReverse(from?: NullableNumber, to?: NullableNumber,): CollectionHolder<string> {
                $this.toReversed_amountOfCall++
                return super.toReverse(from, to,)
            }

            //#endregion -------------------- Reordering methods --------------------
            //#region -------------------- Conversion methods --------------------

            public override toIterator(): CollectionIterator<string> {
                $this.toIterator_amountOfCall++
                return super.toIterator()
            }


            public override toArray(): StringArray {
                $this.toArray_amountOfCall++
                return super.toArray()
            }

            public override toMutableArray(): MutableStringArray {
                $this.toMutableArray_amountOfCall++
                return super.toMutableArray()
            }


            public override toSet(): StringSet {
                $this.toSet_amountOfCall++
                return super.toSet()
            }

            public override toMutableSet(): MutableStringSet {
                $this.toMutableSet_amountOfCall++
                return super.toMutableSet()
            }


            public override toMap(): NumberKeyMap<string> {
                $this.toMap_amountOfCall++
                return super.toMap()
            }

            public override toMutableMap(): MutableNumberKeyMap<string> {
                $this.toMutableMap_amountOfCall++
                return super.toMutableMap()
            }


            public override toString(): string {
                $this.toString_amountOfCall++
                return super.toString()
            }

            public override toLocaleString(locale?: NullableString,): string {
                $this.toLocaleString_amountOfCall++
                return super.toLocaleString(locale,)
            }

            public override toLowerCaseString(): string {
                $this.toLowerCaseString_amountOfCall++
                return super.toLowerCaseString()
            }

            public override toLocaleLowerCaseString(locale?: NullableString,): string {
                $this.toLocaleLowerCaseString_amountOfCall++
                return super.toLocaleLowerCaseString(locale,)
            }

            public override toUpperCaseString(): string {
                $this.toUpperCaseString_amountOfCall++
                return super.toUpperCaseString()
            }

            public override toLocaleUpperCaseString(locale?: NullableString,): string {
                $this.toLocaleUpperCaseString_amountOfCall++
                return super.toLocaleUpperCaseString(locale,)
            }


            public override joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<string>>,): string {
                $this.joinToString_amountOfCall++
                return super.joinToString(separator, prefix, postfix, limit, truncated, transform,)
            }

            //#endregion -------------------- Conversion methods --------------------

        }(ABCD,),)
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Size methods --------------------

    public override get size(): number { return this.instance.size }

    public override get isEmpty(): boolean { return this.instance.isEmpty }
    public override get isNotEmpty(): boolean { return this.instance.isNotEmpty }

    public override get hasExactly1Element(): boolean { return this.instance.hasExactly1Element }
    public override get hasAtMost1Element(): boolean { return this.instance.hasAtMost1Element }

    public override get hasAtLeast2Elements(): boolean { return this.instance.hasAtLeast2Elements }
    public override get hasExactly2Elements(): boolean { return this.instance.hasExactly2Elements }
    public override get hasAtMost2Elements(): boolean { return this.instance.hasAtMost2Elements }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    public override get(index: number,): string { return this.instance.get(index,) }

    public override getFirst(): string { return this.instance.getFirst() }

    public override getLast(): string { return this.instance.getLast() }


    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | string | U
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<string>,): string
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) { return this.instance.getOrElse(index, defaultValue,) }

    public override getFirstOrElse<const U, >(defaultValue: ReturnCallback<U>,): | string | U
    public override getFirstOrElse(defaultValue: ReturnCallback<string>,): string
    public override getFirstOrElse(defaultValue: ReturnCallback<unknown>,) { return this.instance.getFirstOrElse(defaultValue,) }

    public override getLastOrElse<const U, >(defaultValue: ReturnCallback<U>,): | string | U
    public override getLastOrElse(defaultValue: ReturnCallback<string>,): string
    public override getLastOrElse(defaultValue: ReturnCallback<unknown>,) { return this.instance.getLastOrElse(defaultValue,) }


    public override getOrNull(index: number,): NullOrString { return this.instance.getOrNull(index,) }

    public override getFirstOrNull(): NullOrString { return this.instance.getFirstOrNull() }

    public override getLastOrNull(): NullOrString { return this.instance.getLastOrNull() }

    //#endregion -------------------- Get --------------------
    //#region -------------------- Find --------------------

    public override findFirst<const S extends string, >(predicate: RestrainedBooleanCallback<string, S>,): S
    public override findFirst(predicate: BooleanCallback<string>,): string
    public override findFirst(predicate: BooleanCallback<string>,) { return this.instance.findFirst(predicate,) }

    public override findFirstOrNull<const S extends string, >(predicate: RestrainedBooleanCallback<string, S>,): NullOr<S>
    public override findFirstOrNull(predicate: BooleanCallback<string>,): NullOrString
    public override findFirstOrNull(predicate: BooleanCallback<string>,) { return this.instance.findFirstOrNull(predicate,) }

    public override findFirstIndexed<const S extends string, >(predicate: ReverseRestrainedBooleanCallback<string, S>,): S
    public override findFirstIndexed(predicate: ReverseBooleanCallback<string>,): string
    public override findFirstIndexed(predicate: ReverseBooleanCallback<string>,) { return this.instance.findFirstIndexed(predicate,) }

    public override findFirstIndexedOrNull<const S extends string, >(predicate: ReverseRestrainedBooleanCallback<string, S>,): NullOr<S>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<string>,): NullOrString
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<string>,) { return this.instance.findFirstIndexedOrNull(predicate,) }


    public override findLast<const S extends string, >(predicate: RestrainedBooleanCallback<string, S>,): S
    public override findLast(predicate: BooleanCallback<string>,): string
    public override findLast(predicate: BooleanCallback<string>,) { return this.instance.findLast(predicate,) }

    public override findLastOrNull<const S extends string, >(predicate: RestrainedBooleanCallback<string, S>,): NullOr<S>
    public override findLastOrNull(predicate: BooleanCallback<string>,): NullOrString
    public override findLastOrNull(predicate: BooleanCallback<string>,) { return this.instance.findLastOrNull(predicate,) }

    public override findLastIndexed<const S extends string, >(predicate: ReverseRestrainedBooleanCallback<string, S>,): S
    public override findLastIndexed(predicate: ReverseBooleanCallback<string>,): string
    public override findLastIndexed(predicate: ReverseBooleanCallback<string>,) { return this.instance.findLastIndexed(predicate,) }

    public override findLastIndexedOrNull<const S extends string, >(predicate: ReverseRestrainedBooleanCallback<string, S>,): NullOr<S>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<string>,): NullOrString
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<string>,) { return this.instance.findLastIndexedOrNull(predicate,) }

    //#endregion -------------------- Find --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    public override firstIndexOf(element: string, from?: NullableNumber, to?: NullableNumber,): number { return this.instance.firstIndexOf(element, from, to,) }
    public override firstIndexOfOrNull(element: string, from?: NullableNumber, to?: NullableNumber,): NullOrNumber { return this.instance.firstIndexOfOrNull(element, from, to,) }

    public override lastIndexOf(element: string, from?: NullableNumber, to?: NullableNumber,): number { return this.instance.lastIndexOf(element, from, to,) }
    public override lastIndexOfOrNull(element: string, from?: NullableNumber, to?: NullableNumber,): NullOrNumber { return this.instance.lastIndexOfOrNull(element, from, to,) }

    public override indexOfFirst(predicate: BooleanCallback<string>, from?: NullableNumber, to?: NullableNumber,): number { return this.instance.indexOfFirst(predicate, from, to,) }
    public override indexOfFirstOrNull(predicate: BooleanCallback<string>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber { return this.instance.indexOfFirstOrNull(predicate, from, to,) }
    public override indexOfFirstIndexed(predicate: ReverseBooleanCallback<string>, from?: NullableNumber, to?: NullableNumber,): number { return this.instance.indexOfFirstIndexed(predicate, from, to,) }
    public override indexOfFirstIndexedOrNull(predicate: ReverseBooleanCallback<string>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber { return this.instance.indexOfFirstIndexedOrNull(predicate, from, to,) }

    public override indexOfLast(predicate: BooleanCallback<string>, from?: NullableNumber, to?: NullableNumber,): number { return this.instance.indexOfLast(predicate, from, to,) }
    public override indexOfLastOrNull(predicate: BooleanCallback<string>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber { return this.instance.indexOfLastOrNull(predicate, from, to,) }
    public override indexOfLastIndexed(predicate: ReverseBooleanCallback<string>, from?: NullableNumber, to?: NullableNumber,): number { return this.instance.indexOfLastIndexed(predicate, from, to,) }
    public override indexOfLastIndexedOrNull(predicate: ReverseBooleanCallback<string>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber { return this.instance.indexOfLastIndexedOrNull(predicate, from, to,) }

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    public override all<const S extends string, >(predicate: RestrainedBooleanCallback<string, S>,): this is CollectionHolder<S>
    public override all(predicate: BooleanCallback<string>,): boolean
    public override all(predicate: BooleanCallback<string>,) { return this.instance.all(predicate,) }

    public override any(): this["isNotEmpty"]
    public override any(predicate: Nullable<BooleanCallback<string>>,): boolean
    public override any(predicate?: Nullable<BooleanCallback<string>>,) {
        if (arguments.length === 0)
            return this.instance.any()
        return this.instance.any(predicate,)
    }

    public override none(): this["isEmpty"]
    public override none(predicate: Nullable<BooleanCallback<string>>,): boolean
    public override none(predicate?: Nullable<BooleanCallback<string>>,) {
        if (arguments.length === 0)
            return this.instance.none()
        return this.instance.none(predicate,)
    }


    public override get hasNull(): boolean { return this.instance.hasNull }

    public override get hasNoNulls(): boolean { return this.instance.hasNoNulls }


    public override get hasDuplicate(): boolean { return this.instance.hasDuplicate }

    public override get hasNoDuplicates(): boolean { return this.instance.hasNoDuplicates }


    public override has(value: string,): boolean { return this.instance.has(value,) }

    public override hasNot(value: string,): boolean { return this.instance.hasNot(value,) }

    public override hasOne(values: Nullable<StringArray>,): boolean
    public override hasOne(values: Nullable<StringSet>,): boolean
    public override hasOne(values: Nullable<CollectionHolder<string>>,): boolean
    public override hasOne(values: Nullable<MinimalistCollectionHolder<string>>,): boolean
    public override hasOne(values: Nullable<CollectionIterator<string>>,): boolean
    public override hasOne(values: Nullable<IteratorObject<string, unknown, unknown>>,): boolean
    public override hasOne(values: Nullable<Iterator<string, unknown, unknown>>,): boolean
    public override hasOne(values: Nullable<Iterable<string, unknown, unknown>>,): boolean
    public override hasOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<string>>,): boolean
    public override hasOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<string>>,) { return this.instance.hasOne(values,) }

    public override hasNotOne(values: Nullable<StringArray>,): boolean
    public override hasNotOne(values: Nullable<StringSet>,): boolean
    public override hasNotOne(values: Nullable<CollectionHolder<string>>,): boolean
    public override hasNotOne(values: Nullable<MinimalistCollectionHolder<string>>,): boolean
    public override hasNotOne(values: Nullable<CollectionIterator<string>>,): boolean
    public override hasNotOne(values: Nullable<IteratorObject<string, unknown, unknown>>,): boolean
    public override hasNotOne(values: Nullable<Iterator<string, unknown, unknown>>,): boolean
    public override hasNotOne(values: Nullable<Iterable<string, unknown, unknown>>,): boolean
    public override hasNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<string>>,): boolean
    public override hasNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<string>>,) { return this.instance.hasNotOne(values,) }

    public override hasAll(values: Nullable<StringArray>,): boolean
    public override hasAll(values: Nullable<StringSet>,): boolean
    public override hasAll(values: Nullable<CollectionHolder<string>>,): boolean
    public override hasAll(values: Nullable<MinimalistCollectionHolder<string>>,): boolean
    public override hasAll(values: Nullable<CollectionIterator<string>>,): boolean
    public override hasAll(values: Nullable<IteratorObject<string, unknown, unknown>>,): boolean
    public override hasAll(values: Nullable<Iterator<string, unknown, unknown>>,): boolean
    public override hasAll(values: Nullable<Iterable<string, unknown, unknown>>,): boolean
    public override hasAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<string>>,): boolean
    public override hasAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<string>>,) { return this.instance.hasAll(values,) }

    public override hasNotAll(values: Nullable<StringArray>,): boolean
    public override hasNotAll(values: Nullable<StringSet>,): boolean
    public override hasNotAll(values: Nullable<CollectionHolder<string>>,): boolean
    public override hasNotAll(values: Nullable<MinimalistCollectionHolder<string>>,): boolean
    public override hasNotAll(values: Nullable<CollectionIterator<string>>,): boolean
    public override hasNotAll(values: Nullable<IteratorObject<string, unknown, unknown>>,): boolean
    public override hasNotAll(values: Nullable<Iterator<string, unknown, unknown>>,): boolean
    public override hasNotAll(values: Nullable<Iterable<string, unknown, unknown>>,): boolean
    public override hasNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<string>>,): boolean
    public override hasNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<string>>,) { return this.instance.hasNotAll(values,) }


    public override requireNoNulls(): CollectionHolder<NonNullable<string>> {
        if (this.instance.requireNoNulls() !== this.instance)
            throw new Error("stringhe expected return type for the method “requireNoNulls” was supposed to be the same instance",)
        return this as CollectionHolder<NonNullable<string>>
    }

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    public override filter<const S extends string, >(predicate: RestrainedBooleanCallback<string, S>,): CollectionHolder<S>
    public override filter(predicate: BooleanCallback<string>,): CollectionHolder<string>
    public override filter(predicate: BooleanCallback<string>,) { return this.instance.filter(predicate,) }

    public override filterIndexed<const S extends string, >(predicate: ReverseRestrainedBooleanCallback<string, S>,): CollectionHolder<S>
    public override filterIndexed(predicate: ReverseBooleanCallback<string>,): CollectionHolder<string>
    public override filterIndexed(predicate: ReverseBooleanCallback<string>,) { return this.instance.filterIndexed(predicate,) }

    public override filterNot<const S extends string, >(predicate: RestrainedBooleanCallback<string, S>,): CollectionHolder<Exclude<string, S>>
    public override filterNot(predicate: BooleanCallback<string>,): CollectionHolder<string>
    public override filterNot(predicate: BooleanCallback<string>,) { return this.instance.filterNot(predicate,) }

    public override filterNotIndexed<const S extends string, >(predicate: ReverseRestrainedBooleanCallback<string, S>,): CollectionHolder<Exclude<string, S>>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<string>,): CollectionHolder<string>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<string>,) { return this.instance.filterNotIndexed(predicate,) }

    public override filterNotNull(): CollectionHolder<NonNullable<string>> {
        const instance = this.instance
        const newInstance = instance.filterNotNull()
        if (newInstance === instance)
            return this as CollectionHolder<NonNullable<string>>
        return newInstance
    }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Slice --------------------

    public override slice(from?: NullableNumber, to?: NullableNumber,): CollectionHolder<string>
    public override slice(indices: PossibleIterableIteratorArraySetOrCollectionHolder<number>,): CollectionHolder<string>
    public override slice(indicesOrFrom?: Nullable<| PossibleIterableIteratorArraySetOrCollectionHolder<number> | number>, to?: NullableNumber,) {
        if (arguments.length === 0)
            return this.instance.slice()
        if (arguments.length === 1)
            return this.instance.slice(indicesOrFrom,)
        return this.instance.slice(indicesOrFrom, to,)
    }

    //#endregion -------------------- Slice --------------------
    //#region -------------------- Take --------------------

    public override take(n: number,): CollectionHolder<string> {
        return this.instance.take(n,)
    }

    public override takeWhile<const S extends string, >(predicate: RestrainedBooleanCallback<string, S>,): CollectionHolder<S>
    public override takeWhile(predicate: BooleanCallback<string>,): CollectionHolder<string>
    public override takeWhile(predicate: BooleanCallback<string>,) {
        return this.instance.takeWhile(predicate,)
    }

    public override takeWhileIndexed<const S extends string, >(predicate: ReverseRestrainedBooleanCallback<string, S>,): CollectionHolder<S>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<string>,): CollectionHolder<string>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<string>,) {
        return this.instance.takeWhileIndexed(predicate,)
    }


    public override takeLast(n: number,): CollectionHolder<string> {
        return this.instance.takeLast(n,)
    }

    public override takeLastWhile<const S extends string, >(predicate: RestrainedBooleanCallback<string, S>,): CollectionHolder<S>
    public override takeLastWhile(predicate: BooleanCallback<string>,): CollectionHolder<string>
    public override takeLastWhile(predicate: BooleanCallback<string>,) {
        return this.instance.takeLastWhile(predicate,)
    }

    public override takeLastWhileIndexed<const S extends string, >(predicate: ReverseRestrainedBooleanCallback<string, S>,): CollectionHolder<S>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<string>,): CollectionHolder<string>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<string>,) {
        return this.instance.takeLastWhileIndexed(predicate,)
    }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Drop --------------------

    public override drop(n: number,): CollectionHolder<string> {
        return this.instance.drop(n,)
    }

    public override dropWhile<const S extends string, >(predicate: RestrainedBooleanCallback<string, S>,): CollectionHolder<S>
    public override dropWhile(predicate: BooleanCallback<string>,): CollectionHolder<string>
    public override dropWhile(predicate: BooleanCallback<string>,) {
        return this.instance.dropWhile(predicate,)
    }

    public override dropWhileIndexed<const S extends string, >(predicate: ReverseRestrainedBooleanCallback<string, S>,): CollectionHolder<S>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<string>,): CollectionHolder<string>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<string>,) {
        return this.instance.dropWhileIndexed(predicate,)
    }


    public override dropLast(n: number,): CollectionHolder<string> {
        return this.instance.dropLast(n,)
    }

    public override dropLastWhile<const S extends string, >(predicate: RestrainedBooleanCallback<string, S>,): CollectionHolder<S>
    public override dropLastWhile(predicate: BooleanCallback<string>,): CollectionHolder<string>
    public override dropLastWhile(predicate: BooleanCallback<string>,) {
        return this.instance.dropLastWhile(predicate,)
    }

    public override dropLastWhileIndexed<const S extends string, >(predicate: ReverseRestrainedBooleanCallback<string, S>,): CollectionHolder<S>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<string>,): CollectionHolder<string>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<string>,) {
        return this.instance.dropLastWhileIndexed(predicate,)
    }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Map --------------------

    public override map<const U, >(transform: ValueIndexWithReturnCallback<string, U>,): CollectionHolder<U> { return this.instance.map(transform,) }
    public override mapIndexed<const U, >(transform: IndexValueWithReturnCallback<string, U>,): CollectionHolder<U> { return this.instance.mapIndexed(transform,) }

    public override mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<string, Nullable<U>>,): CollectionHolder<U> { return this.instance.mapNotNull(transform,) }
    public override mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<string, Nullable<U>>,): CollectionHolder<U> { return this.instance.mapNotNullIndexed(transform,) }

    //#endregion -------------------- Map --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    public override forEach(action: ValueIndexCallback<string>,): void { this.instance.forEach(action,) }
    public override forEachIndexed(action: IndexValueCallback<string>,): void { this.instance.forEachIndexed(action,) }


    public override onEach(action: ValueIndexCallback<string>,): this {
        const instance = this.instance
        if (instance.onEach(action,) !== instance)
            throw new Error("stringhe expected return type for the method “onEach” was supposed to be the same instance",)
        return this
    }

    public override onEachIndexed(action: IndexValueCallback<string>,): this {
        const instance = this.instance
        if (instance.onEachIndexed(action,) !== instance)
            throw new Error("stringhe expected return type for the method “onEachIndexed” was supposed to be the same instance",)
        return this
    }

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    public override toReverse(from?: NullableNumber, to?: NullableNumber,): CollectionHolder<string> { return this.instance.toReverse(from, to,) }

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- Conversion methods --------------------

    public override toIterator(): CollectionIterator<string> { return this.instance.toIterator() }

    public override toArray(): StringArray { return this.instance.toArray() }
    public override toMutableArray(): MutableStringArray { return this.instance.toMutableArray() }
    public override toSet(): StringSet { return this.instance.toSet() }
    public override toMutableSet(): MutableStringSet { return this.instance.toMutableSet() }
    public override toMap(): NumberKeyMap<string> { return this.instance.toMap() }
    public override toMutableMap(): MutableNumberKeyMap<string> { return this.instance.toMutableMap() }


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


    public override joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<string>>,): string { return this.instance.joinToString(separator, prefix, postfix, limit, truncated, transform,) }

    //#endregion -------------------- Conversion methods --------------------

    //#endregion -------------------- Methods --------------------

}

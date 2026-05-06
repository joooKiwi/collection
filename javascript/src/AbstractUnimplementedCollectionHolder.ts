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

import type {Array, MutableArray, MutableNumberKeyMap, MutableSet, Nullable, NullableNumber, NullableString, NullOr, NullOrNumber, NumberArray, NumberKeyMap, NumberSet, Set, TemplateOrNumber, UndefinedOr} from "@joookiwi/type"

import type {CollectionHolder}                                                                                                                                                                                                                                                  from "./CollectionHolder"
import type {MinimalistCollectionHolder}                                                                                                                                                                                                                                        from "./MinimalistCollectionHolder"
import type {CollectionIterator}                                                                                                                                                                                                                                                from "./iterator/CollectionIterator"
import type {BooleanCallback, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, RestrainedBooleanCallback, ReturnCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, StringCallback, ValueIndexCallback, ValueIndexWithReturnCallback} from "./type/callback"
import type {PossibleIterableIteratorArraySetOrCollectionHolder}                                                                                                                                                                                                                from "./type/possibleInstance"
import type {CollectionHolderName}                                                                                                                                                                                                                                              from "./type/toStringTag"

import {AbstractMinimalistCollectionHolder} from "./AbstractMinimalistCollectionHolder"

/**
 * A definition of a {@link CollectionHolder} to have a common ancestor.
 * Only the aliases methods have implementation.
 * The rest of the methods should be implemented by the inheritor(s).
 *
 * @apiNote This class is used when not specifically requiring an optimization on the methods, just the non-aliased methods calls
 * @note This class should be inherited if new classes are being made to be more usable by the tools
 * @typeParam T The type
 * @see AbstractCollectionHolder
 */
export abstract class AbstractUnimplementedCollectionHolder<const T = unknown, >
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

    public abstract readonly isEmpty: boolean

    public abstract readonly isNotEmpty: boolean

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

    public abstract getFirst(): T

    //#endregion -------------------- Get first --------------------
    //#region -------------------- Get last --------------------

    public abstract getLast(): T

    //#endregion -------------------- Get last --------------------

    //#region -------------------- Get or else --------------------

    public abstract getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public abstract getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T

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
    //#region -------------------- Get first or else --------------------

    public abstract getFirstOrElse<const U, >(defaultValue: ReturnCallback<U>,): | T | U
    public abstract getFirstOrElse(defaultValue: ReturnCallback<T>,): T

    //#endregion -------------------- Get first or else --------------------
    //#region -------------------- Get last or else --------------------

    public abstract getLastOrElse<const U, >(defaultValue: ReturnCallback<U>,): | T | U
    public abstract getLastOrElse(defaultValue: ReturnCallback<T>,): T

    //#endregion -------------------- Get last or else --------------------

    //#region -------------------- Get or null --------------------

    public abstract getOrNull(index: number,): NullOr<T>

    public atOrNull(index: number,): NullOr<T> {
        return this.getOrNull(index,)
    }

    public elementAtOrNull(index: number,): NullOr<T> {
        return this.getOrNull(index,)
    }

    //#endregion -------------------- Get or null --------------------
    //#region -------------------- Get first or null --------------------

    public abstract getFirstOrNull(): NullOr<T>

    //#endregion -------------------- Get first or null --------------------
    //#region -------------------- Get last or null --------------------

    public abstract getLastOrNull(): NullOr<T>

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

    public abstract findFirst<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public abstract findFirst(predicate: BooleanCallback<T>,): T

    public find<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public find(predicate: BooleanCallback<T>,): T
    public find(predicate: BooleanCallback<T>,) {
        return this.findFirst(predicate,)
    }

    //#endregion -------------------- Find first --------------------
    //#region -------------------- Find first or null --------------------

    public abstract findFirstOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public abstract findFirstOrNull(predicate: BooleanCallback<T>,): NullOr<T>

    public findOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public findOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public findOrNull(predicate: BooleanCallback<T>,) {
        return this.findFirstOrNull(predicate,)
    }

    //#endregion -------------------- Find first or null --------------------
    //#region -------------------- Find first indexed --------------------

    public abstract findFirstIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public abstract findFirstIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>

    public findIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public findIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public findIndexed(predicate: ReverseBooleanCallback<T>,) {
        return this.findFirstIndexed(predicate,)
    }

    //#endregion -------------------- Find first indexed --------------------
    //#region -------------------- Find first indexed or null --------------------

    public abstract findFirstIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public abstract findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>

    public findIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public findIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public findIndexedOrNull(predicate: ReverseBooleanCallback<T>,) {
        return this.findFirstIndexedOrNull(predicate,)
    }

    //#endregion -------------------- Find first indexed or null --------------------

    //#region -------------------- Find last --------------------

    public abstract findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public abstract findLast(predicate: BooleanCallback<T>,): T

    //#endregion -------------------- Find last --------------------
    //#region -------------------- Find last or null --------------------

    public abstract findLastOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public abstract findLastOrNull(predicate: BooleanCallback<T>,): NullOr<T>

    //#endregion -------------------- Find last or null --------------------
    //#region -------------------- Find last indexed --------------------

    public abstract findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public abstract findLastIndexed(predicate: ReverseBooleanCallback<T>,): T

    //#endregion -------------------- Find last indexed --------------------
    //#region -------------------- Find last indexed or null --------------------

    public abstract findLastIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public abstract findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>

    //#endregion -------------------- Find last indexed or null --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    //#region -------------------- First index of --------------------

    public abstract firstIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,): number

    public indexOf(element: T, from?: NullableNumber, to?: NullableNumber,): number {
        return this.firstIndexOf(element, from, to,)
    }

    //#endregion -------------------- First index of --------------------
    //#region -------------------- First index of or null --------------------

    public abstract firstIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrNumber

    public indexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return this.firstIndexOfOrNull(element, from, to,)
    }

    //#endregion -------------------- First index of or null --------------------

    //#region -------------------- Last index of --------------------

    public abstract lastIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,): number

    //#endregion -------------------- Last index of --------------------
    //#region -------------------- Last index of or null --------------------

    public abstract lastIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrNumber

    //#endregion -------------------- Last index of or null --------------------

    //#region -------------------- Index of first --------------------

    public abstract indexOfFirst(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number

    public findFirstIndex(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return this.indexOfFirst(predicate, from, to,)
    }

    public findIndex(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return this.indexOfFirst(predicate, from, to,)
    }

    //#endregion -------------------- Index of first --------------------
    //#region -------------------- Index of first or null --------------------

    public abstract indexOfFirstOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber

    public findFirstIndexOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return this.indexOfFirstOrNull(predicate, from, to,)
    }

    public findIndexOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return this.indexOfFirstOrNull(predicate, from, to,)
    }

    //#endregion -------------------- Index of first or null --------------------
    //#region -------------------- Index of first indexed --------------------

    public abstract indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number

    public findFirstIndexIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return this.indexOfFirstIndexed(predicate, from, to,)
    }

    public findIndexIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return this.indexOfFirstIndexed(predicate, from, to,)
    }

    //#endregion -------------------- Index of first indexed --------------------
    //#region -------------------- Index of first indexed or null --------------------

    public abstract indexOfFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber

    public findFirstIndexIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return this.indexOfFirstIndexedOrNull(predicate, from, to,)
    }

    public findIndexIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return this.indexOfFirstIndexedOrNull(predicate, from, to,)
    }

    //#endregion -------------------- Index of first indexed or null --------------------

    //#region -------------------- Index of last --------------------

    public abstract indexOfLast(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number

    public findLastIndex(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return this.indexOfLast(predicate, from, to,)
    }

    //#endregion -------------------- Index of last --------------------
    //#region -------------------- Index of last or null --------------------

    public abstract indexOfLastOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber

    public findLastIndexOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return this.indexOfLastOrNull(predicate, from, to,)
    }

    //#endregion -------------------- Index of last or null --------------------
    //#region -------------------- Index of last indexed --------------------

    public abstract indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number

    public findLastIndexIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number {
        return this.indexOfLastIndexed(predicate, from, to,)
    }

    //#endregion -------------------- Index of last indexed --------------------
    //#region -------------------- Index of last indexed or null --------------------

    public abstract indexOfLastIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber

    public findLastIndexIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber {
        return this.indexOfLastIndexedOrNull(predicate, from, to,)
    }

    //#endregion -------------------- Index of last indexed or null --------------------

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    //#region -------------------- All --------------------

    public abstract all<S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolder<S>
    public abstract all(predicate: BooleanCallback<T>,): boolean

    public every<S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolder<S>
    public every(predicate: BooleanCallback<T>,): boolean
    public every(predicate: BooleanCallback<T>,) {
        return this.all(predicate,)
    }

    //#endregion -------------------- All --------------------
    //#region -------------------- Any --------------------

    public abstract any(): this["isNotEmpty"]
    public abstract any(predicate: Nullable<BooleanCallback<T>>,): boolean

    public some(): this["isNotEmpty"]
    public some(predicate: Nullable<BooleanCallback<T>>,): boolean
    public some(predicate?: Nullable<BooleanCallback<T>>,) {
        if (arguments.length === 0)
            return this.any()
        return this.any(predicate,)
    }

    //#endregion -------------------- Any --------------------
    //#region -------------------- None --------------------

    public abstract none(): this["isEmpty"]
    public abstract none(predicate: Nullable<BooleanCallback<T>>,): boolean

    //#endregion -------------------- None --------------------

    //#region -------------------- Has null --------------------

    public abstract readonly hasNull: boolean
    public get includesNull(): this["hasNull"] { return this.hasNull }
    public get containsNull(): this["hasNull"] { return this.hasNull }

    //#endregion -------------------- Has null --------------------
    //#region -------------------- Has no nulls --------------------

    public abstract readonly hasNoNulls: boolean
    public get includesNoNulls(): this["hasNoNulls"] { return this.hasNoNulls }
    public get containsNoNulls(): this["hasNoNulls"] { return this.hasNoNulls }

    //#endregion -------------------- Has no nulls --------------------
    //#region -------------------- Has duplicate --------------------

    public abstract readonly hasDuplicate: boolean
    public get includesDuplicate(): this["hasDuplicate"] { return this.hasDuplicate }
    public get containsDuplicate(): this["hasDuplicate"] { return this.hasDuplicate }

    //#endregion -------------------- Has duplicate --------------------
    //#region -------------------- Has no duplicates --------------------

    public abstract readonly hasNoDuplicates: boolean
    public get includesNoDuplicates(): this["hasNoDuplicates"] { return this.hasNoDuplicates }
    public get containsNoDuplicates(): this["hasNoDuplicates"] { return this.hasNoDuplicates }

    //#endregion -------------------- Has no duplicates --------------------

    //#region -------------------- Has --------------------

    public abstract has(value: T,): boolean

    public includes(value: T,): boolean {
        return this.has(value,)
    }

    public contains(value: T,): boolean {
        return this.has(value,)
    }

    //#endregion -------------------- Has --------------------
    //#region -------------------- Has not --------------------

    public abstract hasNot(value: T,): boolean

    public includesNot(value: T,): boolean {
        return this.hasNot(value,)
    }

    public containsNot(value: T,): boolean {
        return this.hasNot(value,)
    }

    //#endregion -------------------- Has not --------------------
    //#region -------------------- Has one --------------------

    public abstract hasOne(values: Nullable<Array<T>>,): boolean
    public abstract hasOne(values: Nullable<Set<T>>,): boolean
    public abstract hasOne(values: Nullable<CollectionHolder<T>>,): boolean
    public abstract hasOne(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public abstract hasOne(values: Nullable<CollectionIterator<T>>,): boolean
    public abstract hasOne(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public abstract hasOne(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public abstract hasOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean

    public includesOne(values: Nullable<Array<T>>,): boolean
    public includesOne(values: Nullable<Set<T>>,): boolean
    public includesOne(values: Nullable<CollectionHolder<T>>,): boolean
    public includesOne(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public includesOne(values: Nullable<CollectionIterator<T>>,): boolean
    public includesOne(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public includesOne(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public includesOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
    public includesOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
        return this.hasOne(values,)
    }

    public containsOne(values: Nullable<Array<T>>,): boolean
    public containsOne(values: Nullable<Set<T>>,): boolean
    public containsOne(values: Nullable<CollectionHolder<T>>,): boolean
    public containsOne(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public containsOne(values: Nullable<CollectionIterator<T>>,): boolean
    public containsOne(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public containsOne(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public containsOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
    public containsOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
        return this.hasOne(values,)
    }

    //#endregion -------------------- Has one --------------------
    //#region -------------------- Has not one --------------------

    public abstract hasNotOne(values: Nullable<Array<T>>,): boolean
    public abstract hasNotOne(values: Nullable<Set<T>>,): boolean
    public abstract hasNotOne(values: Nullable<CollectionHolder<T>>,): boolean
    public abstract hasNotOne(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public abstract hasNotOne(values: Nullable<CollectionIterator<T>>,): boolean
    public abstract hasNotOne(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public abstract hasNotOne(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public abstract hasNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean

    public includesNotOne(values: Nullable<Array<T>>,): boolean
    public includesNotOne(values: Nullable<Set<T>>,): boolean
    public includesNotOne(values: Nullable<CollectionHolder<T>>,): boolean
    public includesNotOne(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public includesNotOne(values: Nullable<CollectionIterator<T>>,): boolean
    public includesNotOne(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public includesNotOne(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public includesNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
    public includesNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
        return this.hasNotOne(values,)
    }

    public containsNotOne(values: Nullable<Array<T>>,): boolean
    public containsNotOne(values: Nullable<Set<T>>,): boolean
    public containsNotOne(values: Nullable<CollectionHolder<T>>,): boolean
    public containsNotOne(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public containsNotOne(values: Nullable<CollectionIterator<T>>,): boolean
    public containsNotOne(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public containsNotOne(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public containsNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
    public containsNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
        return this.hasNotOne(values,)
    }

    //#endregion -------------------- Has not one --------------------
    //#region -------------------- Has all --------------------

    public abstract hasAll(values: Nullable<Array<T>>,): boolean
    public abstract hasAll(values: Nullable<Set<T>>,): boolean
    public abstract hasAll(values: Nullable<CollectionHolder<T>>,): boolean
    public abstract hasAll(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public abstract hasAll(values: Nullable<CollectionIterator<T>>,): boolean
    public abstract hasAll(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public abstract hasAll(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public abstract hasAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean

    public includesAll(values: Nullable<Array<T>>,): boolean
    public includesAll(values: Nullable<Set<T>>,): boolean
    public includesAll(values: Nullable<CollectionHolder<T>>,): boolean
    public includesAll(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public includesAll(values: Nullable<CollectionIterator<T>>,): boolean
    public includesAll(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public includesAll(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public includesAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
    public includesAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
        return this.hasAll(values,)
    }

    public containsAll(values: Nullable<Array<T>>,): boolean
    public containsAll(values: Nullable<Set<T>>,): boolean
    public containsAll(values: Nullable<CollectionHolder<T>>,): boolean
    public containsAll(values: Nullable<CollectionHolder<T>>,): boolean
    public containsAll(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public containsAll(values: Nullable<CollectionIterator<T>>,): boolean
    public containsAll(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public containsAll(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public containsAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
    public containsAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
        return this.hasAll(values,)
    }

    //#endregion -------------------- Has all --------------------
    //#region -------------------- Has not all --------------------

    public abstract hasNotAll(values: Nullable<Array<T>>,): boolean
    public abstract hasNotAll(values: Nullable<Set<T>>,): boolean
    public abstract hasNotAll(values: Nullable<CollectionHolder<T>>,): boolean
    public abstract hasNotAll(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public abstract hasNotAll(values: Nullable<CollectionIterator<T>>,): boolean
    public abstract hasNotAll(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public abstract hasNotAll(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public abstract hasNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean

    public includesNotAll(values: Nullable<Array<T>>,): boolean
    public includesNotAll(values: Nullable<Set<T>>,): boolean
    public includesNotAll(values: Nullable<CollectionHolder<T>>,): boolean
    public includesNotAll(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public includesNotAll(values: Nullable<CollectionIterator<T>>,): boolean
    public includesNotAll(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public includesNotAll(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public includesNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
    public includesNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
        return this.hasNotAll(values,)
    }

    public containsNotAll(values: Nullable<Array<T>>,): boolean
    public containsNotAll(values: Nullable<Set<T>>,): boolean
    public containsNotAll(values: Nullable<CollectionHolder<T>>,): boolean
    public containsNotAll(values: Nullable<CollectionHolder<T>>,): boolean
    public containsNotAll(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public containsNotAll(values: Nullable<CollectionIterator<T>>,): boolean
    public containsNotAll(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public containsNotAll(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public containsNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
    public containsNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) {
        return this.hasNotAll(values,)
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

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Filter indexed --------------------

    public abstract filterIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public abstract filterIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>

    //#endregion -------------------- Filter indexed --------------------

    //#region -------------------- Filter not --------------------

    public abstract filterNot<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public abstract filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T>

    //#endregion -------------------- Filter not --------------------
    //#region -------------------- Filter not indexed --------------------

    public abstract filterNotIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public abstract filterNotIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>

    //#endregion -------------------- Filter not indexed --------------------

    //#region -------------------- Filter not null --------------------

    public abstract filterNotNull(): CollectionHolder<NonNullable<T>>

    //#endregion -------------------- Filter not null --------------------

    //#region -------------------- Slice --------------------

    public abstract slice(from?: NullableNumber, to?: NullableNumber,): CollectionHolder<T>
    public abstract slice(indices: NumberArray,): CollectionHolder<T>
    public abstract slice(indices: NumberSet,): CollectionHolder<T>
    public abstract slice(indices: CollectionHolder<number>,): CollectionHolder<T>
    public abstract slice(indices: MinimalistCollectionHolder<number>,): CollectionHolder<T>
    public abstract slice(indices: CollectionIterator<number>,): CollectionHolder<T>
    public abstract slice(indices: Iterator<number, unknown, unknown>,): CollectionHolder<T>
    public abstract slice(indices: Iterable<number, unknown, unknown>,): CollectionHolder<T>
    public abstract slice(indices: PossibleIterableIteratorArraySetOrCollectionHolder<number>,): CollectionHolder<T>
    public abstract slice(indicesOrFrom?: Nullable<| PossibleIterableIteratorArraySetOrCollectionHolder<number> | number>, to?: NullableNumber,): CollectionHolder<T>

    //#endregion -------------------- Slice --------------------

    //#region -------------------- Take --------------------

    public abstract take(n: number,): CollectionHolder<T>

    public limit(n: number,): CollectionHolder<T> {
        return this.take(n,)
    }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Take while --------------------

    public abstract takeWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public abstract takeWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>

    public limitWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public limitWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public limitWhile(predicate: BooleanCallback<T>,) {
        return this.takeWhile(predicate,)
    }

    //#endregion -------------------- Take while --------------------
    //#region -------------------- Take while indexed --------------------

    public abstract takeWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public abstract takeWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>

    public limitWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public limitWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public limitWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return this.takeWhileIndexed(predicate,)
    }

    //#endregion -------------------- Take while indexed --------------------
    //#region -------------------- Take last --------------------

    public abstract takeLast(n: number,): CollectionHolder<T>

    public limitLast(n: number,): CollectionHolder<T> {
        return this.takeLast(n,)
    }

    //#endregion -------------------- Take last --------------------
    //#region -------------------- Take last while --------------------

    public abstract takeLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public abstract takeLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>

    public limitLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public limitLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public limitLastWhile(predicate: BooleanCallback<T>,) {
        return this.takeLastWhile(predicate,)
    }

    //#endregion -------------------- Take last while --------------------
    //#region -------------------- Take last while indexed --------------------

    public abstract takeLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public abstract takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>

    public limitLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public limitLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public limitLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return this.takeLastWhileIndexed(predicate,)
    }

    //#endregion -------------------- Take last while indexed --------------------

    //#region -------------------- Drop --------------------

    public abstract drop(n: number,): CollectionHolder<T>

    public skip(n: number,): CollectionHolder<T> {
        return this.drop(n,)
    }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Drop while --------------------

    public abstract dropWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public abstract dropWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>

    public skipWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public skipWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public skipWhile(predicate: BooleanCallback<T>,) {
        return this.dropWhile(predicate,)
    }

    //#endregion -------------------- Drop while --------------------
    //#region -------------------- Drop while indexed --------------------

    public abstract dropWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public abstract dropWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>

    public skipWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public skipWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public skipWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return this.dropWhileIndexed(predicate,)
    }

    //#endregion -------------------- Drop while indexed --------------------
    //#region -------------------- Drop last --------------------

    public abstract dropLast(n: number,): CollectionHolder<T>

    public skipLast(n: number,): CollectionHolder<T> {
        return this.dropLast(n,)
    }

    //#endregion -------------------- Drop last --------------------
    //#region -------------------- Drop last while --------------------

    public abstract dropLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public abstract dropLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>

    public skipLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public skipLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public skipLastWhile(predicate: BooleanCallback<T>,) {
        return this.dropLastWhile(predicate,)
    }

    //#endregion -------------------- Drop last while --------------------
    //#region -------------------- Drop last while indexed --------------------

    public abstract dropLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public abstract dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>

    public skipLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public skipLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public skipLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) {
        return this.dropLastWhileIndexed(predicate,)
    }

    //#endregion -------------------- Drop last while indexed --------------------

    //#region -------------------- Map --------------------

    public abstract map<const U, >(transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U>

    //#endregion -------------------- Map --------------------
    //#region -------------------- Map indexed --------------------

    public abstract mapIndexed<const U, >(transform: IndexValueWithReturnCallback<T, U>,): CollectionHolder<U>

    //#endregion -------------------- Map indexed --------------------

    //#region -------------------- Map not null --------------------

    public abstract mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U>

    //#endregion -------------------- Map not null --------------------
    //#region -------------------- Map not null indexed --------------------

    public abstract mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U>

    //#endregion -------------------- Map not null indexed --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- For each --------------------

    public abstract forEach(action: ValueIndexCallback<T>,): void

    //#endregion -------------------- For each --------------------
    //#region -------------------- For each indexed --------------------

    public abstract forEachIndexed(action: IndexValueCallback<T>,): void

    //#endregion -------------------- For each indexed --------------------

    //#region -------------------- On each --------------------

    public abstract onEach(action: ValueIndexCallback<T>,): this

    //#endregion -------------------- On each --------------------
    //#region -------------------- On each indexed --------------------

    public abstract onEachIndexed(action: IndexValueCallback<T>,): this

    //#endregion -------------------- On each indexed --------------------

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    //#region -------------------- To reverse --------------------

    public abstract toReverse(from?: NullableNumber, to?: NullableNumber,): CollectionHolder<T>

    public toReversed(from?: NullableNumber, to?: NullableNumber,): CollectionHolder<T> {
        return this.toReverse(from, to,)
    }

    public reversed(from?: NullableNumber, to?: NullableNumber,): CollectionHolder<T> {
        return this.toReverse(from, to,)
    }

    //#endregion -------------------- To reverse --------------------

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- JavaScript methods --------------------

    public [Symbol.iterator](): CollectionIterator<T> {
        return this.toIterator()
    }

    public get [Symbol.toStringTag](): CollectionHolderName {
        return "CollectionHolder"
    }

    //#endregion -------------------- JavaScript methods --------------------
    //#region -------------------- Conversion methods --------------------

    //#region -------------------- To iterator --------------------

    public abstract toIterator(): CollectionIterator<T>

    //#endregion -------------------- To iterator --------------------
    //#region -------------------- To array --------------------

    public abstract toArray(): Array<T>

    public abstract toMutableArray(): MutableArray<T>

    //#endregion -------------------- To array --------------------
    //#region -------------------- To set --------------------

    public abstract toSet(): Set<T>

    public abstract toMutableSet(): MutableSet<T>

    //#endregion -------------------- To set --------------------
    //#region -------------------- To map --------------------

    public abstract toMap(): NumberKeyMap<T>

    public abstract toMutableMap(): MutableNumberKeyMap<T>

    //#endregion -------------------- To map --------------------

    //#region -------------------- To string --------------------

    public abstract override toString(): string

    public abstract override toLocaleString(locale?: NullableString,): string


    public abstract toLowerCaseString(): string

    public abstract toLocaleLowerCaseString(locale?: NullableString,): string


    public abstract toUpperCaseString(): string

    public abstract toLocaleUpperCaseString(locale?: NullableString,): string

    //#endregion -------------------- To string --------------------
    //#region -------------------- Join to string --------------------

    public abstract joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string

    public join(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string {
        return this.joinToString(separator, prefix, postfix, limit, truncated, transform,)
    }

    //#endregion -------------------- Join to string --------------------

    //#endregion -------------------- Conversion methods --------------------

    //#endregion -------------------- Methods --------------------

}

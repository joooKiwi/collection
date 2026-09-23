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

import type {MutableNumberKeyMap, MutableSet, Nullable, NullableNumber, NullOr, NullOrNumber, NullOrOneNumber, NullOrUndefined, NullOrZeroNumber, NumberArray, NumberKeyMap, NumberSet, Set} from "@joookiwi/type"

import type {CollectionHolder}                                                                                                                                                                                          from "./CollectionHolder"
import type {CollectionHolderOf2}                                                                                                                                                                                       from "./CollectionHolderOf2"
import type {MinimalistCollectionHolder}                                                                                                                                                                                from "./MinimalistCollectionHolder"
import type {CollectionIterator}                                                                                                                                                                                        from "./iterator/CollectionIterator"
import type {CollectionIteratorOf2}                                                                                                                                                                                     from "./iterator/CollectionIteratorOf2"
import type {BooleanCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, RestrainedBooleanCallback, ReturnCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, ValueIndexWithReturnCallback} from "./type/callback"
import type {CollectionHolderOf0Or1Or2, CollectionHolderOf1Or2, CollectionHolderOfAny0Or1Or2, CollectionHolderOfAny1Or2, CollectionHolderOfLast0Or1Or2}                                                                 from "./type/collection"
import type {IndexOf2, IndexOf2Of1, IndexOf2Of2}                                                                                                                                                                        from "./type/indexOf"
import type {PossibleIterableIteratorArraySetOrCollectionHolder}                                                                                                                                                        from "./type/possibleInstance"
import type {ToReverse_from, ToReverse_fromTo, ToReverse_to}                                                                                                                                                            from "./type/toReverse"
import type {DoubleValueFromIndex, DoubleValueFromIndexOrElse, DoubleValueFromIndexOrNull}                                                                                                                              from "./type/value"

import {AbstractUnimplementedCollectionHolder} from "./AbstractUnimplementedCollectionHolder"

export abstract class AbstractUnimplementedCollectionHolderOf2<const T1, const T2, >
    extends AbstractUnimplementedCollectionHolder<| T1 | T2>
    implements CollectionHolderOf2<T1, T2> {

    //#region -------------------- Constructor --------------------

    protected constructor() { super() }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Value methods --------------------

    public abstract readonly 0: T1

    public abstract readonly value1: T1


    public abstract readonly 1: T2

    public abstract readonly value2: T2

    //#endregion -------------------- Value methods --------------------
    //#region -------------------- Size methods --------------------

    public abstract override readonly size: 2

    public abstract override readonly isEmpty: false
    public abstract override readonly isNotEmpty: true

    public abstract override readonly hasExactly1Element: false
    public abstract override readonly hasAtMost1Element: false

    public abstract override readonly hasAtLeast2Elements: true
    public abstract override readonly hasExactly2Elements: true
    public abstract override readonly hasAtMost2Elements: true

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    public abstract override get<const I extends number, >(index: I,): DoubleValueFromIndex<I, T1, T2>
    public abstract override get(index: number,): | T1 | T2

    public override getFirst(): T1 { return this.value1 }

    public override getLast(): T2 { return this.value2 }


    public abstract override getOrElse<const U, const I extends number,>(index: I, defaultValue: IndexWithReturnCallback<U>,): DoubleValueFromIndexOrElse<I, T1, T2, U>
    public abstract override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T1 | T2 | U
    public abstract override getOrElse<const I extends number, >(index: I, defaultValue: IndexWithReturnCallback<| T1 | T2>,): DoubleValueFromIndexOrElse<I, T1, T2, | T1 | T2>
    public abstract override getOrElse(index: number, defaultValue: IndexWithReturnCallback<| T1 | T2>,): | T1 | T2


    public override getFirstOrElse<const U, >(defaultValue: ReturnCallback<U>,): T1
    public override getFirstOrElse(defaultValue: ReturnCallback<| T1 | T2>,): T1
    public override getFirstOrElse() { return this.getFirst() }

    public override getLastOrElse<const U, >(defaultValue: ReturnCallback<U>,): T2
    public override getLastOrElse(defaultValue: ReturnCallback<| T1 | T2>,): T2
    public override getLastOrElse() { return this.getLast() }


    public abstract override getOrNull<const I extends number, >(index: I,): DoubleValueFromIndexOrNull<I, T1, T2>
    public abstract override getOrNull(index: number,): NullOr<| T1 | T2>

    public override getFirstOrNull(): T1 { return this.getFirst() }

    public override getLastOrNull(): T2 { return this.getLast() }

    //#endregion -------------------- Get --------------------
    //#region -------------------- First --------------------

    public override first(): T1
    public override first<const S extends | T1 | T2, >(predicate: Nullable<RestrainedBooleanCallback<| T1 | T2, S>>,): S
    public override first(predicate: Nullable<BooleanCallback<| T1 | T2>>,): | T1 | T2
    public override first(predicate?: Nullable<BooleanCallback<| T1 | T2>>,) {
        if (predicate == null)
            return this.getFirst()
        return this.findFirst(predicate,)
    }

    public override firstOrNull(): T1
    public override firstOrNull<const S extends | T1 | T2, >(predicate: Nullable<RestrainedBooleanCallback<| T1 | T2, S>>,): NullOr<S>
    public override firstOrNull(predicate: Nullable<BooleanCallback<| T1 | T2>>,): NullOr<| T1 | T2>
    public override firstOrNull(predicate?: Nullable<BooleanCallback<| T1 | T2>>,) {
        if (predicate == null)
            return this.getFirst()
        return this.findFirstOrNull(predicate,)
    }

    public override firstIndexed(): T1
    public override firstIndexed<const S extends | T1 | T2, >(predicate: Nullable<ReverseRestrainedBooleanCallback<| T1 | T2, S>>,): S
    public override firstIndexed(predicate: Nullable<ReverseBooleanCallback<| T1 | T2>>,): | T1 | T2
    public override firstIndexed(predicate?: Nullable<ReverseBooleanCallback<| T1 | T2>>,) {
        if (predicate == null)
            return this.getFirst()
        return this.findFirstIndexed(predicate,)
    }

    public override firstIndexedOrNull(): T1
    public override firstIndexedOrNull<const S extends | T1 | T2, >(predicate: Nullable<ReverseRestrainedBooleanCallback<| T1 | T2, S>>,): NullOr<S>
    public override firstIndexedOrNull(predicate: Nullable<ReverseBooleanCallback<| T1 | T2>>,): NullOr<| T1 | T2>
    public override firstIndexedOrNull(predicate?: Nullable<ReverseBooleanCallback<| T1 | T2>>,) {
        if (predicate == null)
            return this.getFirst()
        return this.findFirstIndexedOrNull(predicate,)
    }

    //#endregion -------------------- First --------------------
    //#region -------------------- Last --------------------

    public override last(): T2
    public override last<const S extends | T1 | T2, >(predicate: Nullable<RestrainedBooleanCallback<| T1 | T2, S>>,): S
    public override last(predicate: Nullable<BooleanCallback<| T1 | T2>>,): | T1 | T2
    public override last(predicate?: Nullable<BooleanCallback<| T1 | T2>>,) {
        if (predicate == null)
            return this.getLast()
        return this.findLast(predicate,)
    }

    public override lastOrNull(): T2
    public override lastOrNull<const S extends | T1 | T2, >(predicate: Nullable<RestrainedBooleanCallback<| T1 | T2, S>>,): NullOr<S>
    public override lastOrNull(predicate: Nullable<BooleanCallback<| T1 | T2>>,): NullOr<| T1 | T2>
    public override lastOrNull(predicate?: Nullable<BooleanCallback<| T1 | T2>>,) {
        if (predicate == null)
            return this.getLast()
        return this.findLastOrNull(predicate,)
    }

    public override lastIndexed(): T2
    public override lastIndexed<const S extends | T1 | T2, >(predicate: Nullable<ReverseRestrainedBooleanCallback<| T1 | T2, S>>,): S
    public override lastIndexed(predicate: Nullable<ReverseBooleanCallback<| T1 | T2>>,): | T1 | T2
    public override lastIndexed(predicate?: Nullable<ReverseBooleanCallback<| T1 | T2>>,) {
        if (predicate == null)
            return this.getLast()
        return this.findLastIndexed(predicate,)
    }

    public override lastIndexedOrNull(): T2
    public override lastIndexedOrNull<const S extends | T1 | T2, >(predicate: Nullable<ReverseRestrainedBooleanCallback<| T1 | T2, S>>,): NullOr<S>
    public override lastIndexedOrNull(predicate: Nullable<ReverseBooleanCallback<| T1 | T2>>,): NullOr<| T1 | T2>
    public override lastIndexedOrNull(predicate?: Nullable<ReverseBooleanCallback<| T1 | T2>>,) {
        if (predicate == null)
            return this.getLast()
        return this.findLastIndexedOrNull(predicate,)
    }

    //#endregion -------------------- Last --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    //#region -------------------- First index of --------------------

    public abstract override firstIndexOf<const I1 extends NullableNumber, const I2 extends NullableNumber, >(element: T1,        from?: I1,             to?: I2,):             IndexOf2Of1<I1, I2>
    public abstract override firstIndexOf                                                                    (element: T1,        from?: NullableNumber, to?: NullableNumber,): 0
    public abstract override firstIndexOf<const I1 extends NullableNumber, const I2 extends NullableNumber, >(element: T2,        from?: I1,             to?: I2,):             IndexOf2Of2<I1, I2>
    public abstract override firstIndexOf                                                                    (element: T2,        from?: NullableNumber, to?: NullableNumber,): 1
    public abstract override firstIndexOf<const I1 extends NullableNumber, const I2 extends NullableNumber, >(element: | T1 | T2, from?: I1,             to?: I2,):             IndexOf2<I1, I2>
    public abstract override firstIndexOf                                                                    (element: | T1 | T2, from?: NullableNumber, to?: NullableNumber,): | 0 | 1

    public override indexOf<const I1 extends NullableNumber, const I2 extends NullableNumber, >(element: T1,        from?: I1,             to?: I2,):             IndexOf2Of1<I1, I2>
    public override indexOf                                                                    (element: T1,        from?: NullableNumber, to?: NullableNumber,): 0
    public override indexOf<const I1 extends NullableNumber, const I2 extends NullableNumber, >(element: T2,        from?: I1,             to?: I2,):             IndexOf2Of2<I1, I2>
    public override indexOf                                                                    (element: T2,        from?: NullableNumber, to?: NullableNumber,): 1
    public override indexOf<const I1 extends NullableNumber, const I2 extends NullableNumber, >(element: | T1 | T2, from?: I1,             to?: I2,):             IndexOf2<I1, I2>
    public override indexOf                                                                    (element: | T1 | T2, from?: NullableNumber, to?: NullableNumber,): | 0 | 1
    public override indexOf<const I1 extends NullableNumber, const I2 extends NullableNumber, >(element: | T1 | T2, from?: I1,             to?: I2,) {
        return this.firstIndexOf(element, from, to,)
    }


    public abstract override firstIndexOfOrNull(element: T1,        from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber
    public abstract override firstIndexOfOrNull(element: T2,        from?: NullableNumber, to?: NullableNumber,): NullOrOneNumber
    public abstract override firstIndexOfOrNull(element: | T1 | T2, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1>

    public override indexOfOrNull(element: T1,        from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber
    public override indexOfOrNull(element: T2,        from?: NullableNumber, to?: NullableNumber,): NullOrOneNumber
    public override indexOfOrNull(element: | T1 | T2, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1>
    public override indexOfOrNull(element: | T1 | T2, from?: NullableNumber, to?: NullableNumber,) {
        return this.firstIndexOfOrNull(element, from, to,)
    }

    //#endregion -------------------- First index of --------------------
    //#region -------------------- Last index of --------------------

    public abstract override lastIndexOf<const I1 extends NullableNumber, const I2 extends NullableNumber, >(element: T1,        from?: I1,             to?: I2,):             IndexOf2Of1<I1, I2>
    public abstract override lastIndexOf                                                                    (element: T1,        from?: NullableNumber, to?: NullableNumber,): 0
    public abstract override lastIndexOf<const I1 extends NullableNumber, const I2 extends NullableNumber, >(element: T2,        from?: I1,             to?: I2,):             IndexOf2Of2<I1, I2>
    public abstract override lastIndexOf                                                                    (element: T2,        from?: NullableNumber, to?: NullableNumber,): 1
    public abstract override lastIndexOf<const I1 extends NullableNumber, const I2 extends NullableNumber, >(element: | T1 | T2, from?: I1,             to?: I2,):             IndexOf2<I1, I2>
    public abstract override lastIndexOf                                                                    (element: | T1 | T2, from?: NullableNumber, to?: NullableNumber,): | 0 | 1

    public abstract override lastIndexOfOrNull(element: T1,        from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber
    public abstract override lastIndexOfOrNull(element: T2,        from?: NullableNumber, to?: NullableNumber,): NullOrOneNumber
    public abstract override lastIndexOfOrNull(element: | T1 | T2, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1>

    //#endregion -------------------- Last index of --------------------
    //#region -------------------- Index of first --------------------

    public abstract override indexOfFirst<const I1 extends NullableNumber, const I2 extends NullableNumber, >(predicate: BooleanCallback<| T1 | T2>, from?: I1,             to?: I2,):             IndexOf2<I1, I2>
    public abstract override indexOfFirst                                                                    (predicate: BooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): | 0 | 1

    public override findFirstIndex<const I1 extends NullableNumber, const I2 extends NullableNumber, >(predicate: BooleanCallback<| T1 | T2>, from?: I1,             to?: I2,):             IndexOf2<I1, I2>
    public override findFirstIndex                                                                    (predicate: BooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): | 0 | 1
    public override findFirstIndex(predicate: BooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,) {
        return this.indexOfFirst(predicate, from, to,)
    }

    public override findIndex<const I1 extends NullableNumber, const I2 extends NullableNumber, >(predicate: BooleanCallback<| T1 | T2>, from?: I1,             to?: I2,):             IndexOf2<I1, I2>
    public override findIndex                                                                    (predicate: BooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): | 0 | 1
    public override findIndex(predicate: BooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,) {
        return this.indexOfFirst(predicate, from, to,)
    }


    public abstract override indexOfFirstOrNull(predicate: BooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1>

    public override findFirstIndexOrNull(predicate: BooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1>
    public override findFirstIndexOrNull(predicate: BooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,) {
        return this.indexOfFirstOrNull(predicate, from, to,)
    }

    public override findIndexOrNull(predicate: BooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1>
    public override findIndexOrNull(predicate: BooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,) {
        return this.indexOfFirstOrNull(predicate, from, to,)
    }


    public abstract override indexOfFirstIndexed<const I1 extends NullableNumber, const I2 extends NullableNumber, >(predicate: ReverseBooleanCallback<| T1 | T2>, from?: I1,             to?: I2,):             IndexOf2<I1, I2>
    public abstract override indexOfFirstIndexed                                                                    (predicate: ReverseBooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): | 0 | 1

    public override findFirstIndexIndexed<const I1 extends NullableNumber, const I2 extends NullableNumber, >(predicate: ReverseBooleanCallback<| T1 | T2>, from?: I1,             to?: I2,):             IndexOf2<I1, I2>
    public override findFirstIndexIndexed                                                                    (predicate: ReverseBooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): | 0 | 1
    public override findFirstIndexIndexed(predicate: ReverseBooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,) {
        return this.indexOfFirstIndexed(predicate, from, to,)
    }

    public override findIndexIndexed<const I1 extends NullableNumber, const I2 extends NullableNumber, >(predicate: ReverseBooleanCallback<| T1 | T2>, from?: I1,             to?: I2,):             IndexOf2<I1, I2>
    public override findIndexIndexed                                                                    (predicate: ReverseBooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): | 0 | 1
    public override findIndexIndexed(predicate: ReverseBooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,) {
        return this.indexOfFirstIndexed(predicate, from, to,)
    }


    public abstract override indexOfFirstIndexedOrNull(predicate: ReverseBooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1>

    public override findFirstIndexIndexedOrNull(predicate: ReverseBooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1>
    public override findFirstIndexIndexedOrNull(predicate: ReverseBooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,) {
        return this.indexOfFirstIndexedOrNull(predicate, from, to,)
    }

    public override findIndexIndexedOrNull(predicate: ReverseBooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1>
    public override findIndexIndexedOrNull(predicate: ReverseBooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,) {
        return this.indexOfFirstIndexedOrNull(predicate, from, to,)
    }

    //#endregion -------------------- Index of first --------------------
    //#region -------------------- Index of last --------------------

    public abstract override indexOfLast<const I1 extends NullableNumber, const I2 extends NullableNumber, >(predicate: BooleanCallback<| T1 | T2>, from?: I1,             to?: I2,):             IndexOf2<I1, I2>
    public abstract override indexOfLast                                                                    (predicate: BooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): | 0 | 1

    public override findLastIndex<const I1 extends NullableNumber, const I2 extends NullableNumber, >(predicate: BooleanCallback<| T1 | T2>, from?: I1,             to?: I2,):             IndexOf2<I1, I2>
    public override findLastIndex                                                                    (predicate: BooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): | 0 | 1
    public override findLastIndex(predicate: BooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,) {
        return this.indexOfLast(predicate, from, to,)
    }


    public abstract override indexOfLastOrNull(predicate: BooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1>

    public override findLastIndexOrNull(predicate: BooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1>
    public override findLastIndexOrNull(predicate: BooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,) {
        return this.indexOfLastOrNull(predicate, from, to,)
    }


    public abstract override indexOfLastIndexed<const I1 extends NullableNumber, const I2 extends NullableNumber, >(predicate: ReverseBooleanCallback<| T1 | T2>, from?: I1,             to?: I2,):             IndexOf2<I1, I2>
    public abstract override indexOfLastIndexed                                                                    (predicate: ReverseBooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): | 0 | 1

    public override findLastIndexIndexed<const I1 extends NullableNumber, const I2 extends NullableNumber, >(predicate: ReverseBooleanCallback<| T1 | T2>, from?: I1,             to?: I2,):             IndexOf2<I1, I2>
    public override findLastIndexIndexed                                                                    (predicate: ReverseBooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): | 0 | 1
    public override findLastIndexIndexed(predicate: ReverseBooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,) {
        return this.indexOfLastIndexed(predicate, from, to,)
    }


    public abstract override indexOfLastIndexedOrNull(predicate: ReverseBooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1>

    public override findLastIndexIndexedOrNull(predicate: ReverseBooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1>
    public override findLastIndexIndexedOrNull(predicate: ReverseBooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,) {
        return this.indexOfLastIndexedOrNull(predicate, from, to,)
    }

    //#endregion -------------------- Index of last --------------------

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    //#region -------------------- All --------------------

    public abstract override all<const S extends T1, >(predicate: RestrainedBooleanCallback<| T1 | T2, | S | T2>,): this is CollectionHolderOf2<S, T2>
    public abstract override all<const S extends T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, | T1 | S>,): this is CollectionHolderOf2<T1, S>
    public abstract override all<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): this is CollectionHolderOf2<S, S>
    public abstract override all(predicate: BooleanCallback<| T1 | T2>,): boolean

    public override every<const S extends T1, >(predicate: RestrainedBooleanCallback<| T1 | T2, | S | T2>,): this is CollectionHolderOf2<S, T2>
    public override every<const S extends T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, | T1 | S>,): this is CollectionHolderOf2<T1, S>
    public override every<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): this is CollectionHolderOf2<S, S>
    public override every(predicate: BooleanCallback<| T1 | T2>,): boolean
    public override every(predicate: BooleanCallback<| T1 | T2>,) {
        return this.all(predicate,)
    }

    //#endregion -------------------- All --------------------

    //#region -------------------- Require no nulls --------------------

    public abstract override requireNoNulls(): CollectionHolderOf2<NonNullable<T1>, NonNullable<T2>>

    //#endregion -------------------- Require no nulls --------------------

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    public abstract override filterNotNull(): CollectionHolderOfAny0Or1Or2<NonNullable<T1>, NonNullable<T2>>
            
    //#endregion -------------------- Filter --------------------
    //#region -------------------- Slice --------------------

    public abstract override slice(): CollectionHolderOf2<T1, T2>
    public abstract override slice(from?: NullableNumber, to?: NullableNumber,): CollectionHolderOf1Or2<T1, T2>
    public abstract override slice(indices: NumberArray,): CollectionHolder<| T1 | T2>
    public abstract override slice(indices: NumberSet,): CollectionHolder<| T1 | T2>
    public abstract override slice(indices: CollectionHolder<number>,): CollectionHolder<| T1 | T2>
    public abstract override slice(indices: MinimalistCollectionHolder<number>,): CollectionHolder<| T1 | T2>
    public abstract override slice(indices: CollectionIterator<number>,): CollectionHolder<| T1 | T2>
    public abstract override slice(indices: Iterator<number, unknown, unknown>,): CollectionHolder<| T1 | T2>
    public abstract override slice(indices: Iterable<number, unknown, unknown>,): CollectionHolder<| T1 | T2>
    public abstract override slice(indices: PossibleIterableIteratorArraySetOrCollectionHolder<number>,): CollectionHolder<| T1 | T2>
    public abstract override slice(indicesOrFrom?: Nullable<| PossibleIterableIteratorArraySetOrCollectionHolder<number> | number>, to?: NullableNumber,): CollectionHolder<| T1 | T2>

    //#endregion -------------------- Slice --------------------
    //#region -------------------- Take --------------------

    public abstract override take(n: number,): CollectionHolderOf0Or1Or2<T1, T2>

    public override limit(n: number,): CollectionHolderOf0Or1Or2<T1, T2> {
        return this.take(n,)
    }


    public abstract override takeLast(n: number,): CollectionHolderOfLast0Or1Or2<T1, T2>

    public override limitLast(n: number,): CollectionHolderOfLast0Or1Or2<T1, T2> {
        return this.takeLast(n,)
    }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Drop --------------------

    public abstract override drop(n: number,): CollectionHolderOfLast0Or1Or2<T1, T2>

    public override skip(n: number,): CollectionHolderOfLast0Or1Or2<T1, T2> {
        return this.drop(n,)
    }


    public abstract override dropLast(n: number,): CollectionHolderOf0Or1Or2<T1, T2>

    public override skipLast(n: number,): CollectionHolderOf0Or1Or2<T1, T2> {
        return this.dropLast(n,)
    }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Map --------------------

    public abstract override map<const U, >(transform: ValueIndexWithReturnCallback<| T1 | T2, U>,): CollectionHolderOf2<U, U>

    public abstract override mapIndexed<const U, >(transform: IndexValueWithReturnCallback<| T1 | T2, U>,): CollectionHolderOf2<U, U>

    //#endregion -------------------- Map --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Reordering methods --------------------

    //#region -------------------- To reverse --------------------

    public abstract override toReverse                                                                    (                                          ): CollectionHolderOf2<T2, T1>
    public abstract override toReverse<const I1 extends NullableNumber, >                                 (from: I1,                                 ): ToReverse_from<T1, T2, I1>
    public abstract override toReverse                                                                    (from: NullableNumber,                     ): CollectionHolderOf1Or2<T2, T1>
    public abstract override toReverse<                                 const I2 extends NullableNumber, >(from: NullOrUndefined, to: I2,            ): ToReverse_to<T1, T2, I2>
    public abstract override toReverse                                                                    (from: NullOrUndefined, to: NullableNumber,): CollectionHolderOf1Or2<T2, T1>
    public abstract override toReverse<const I1 extends NullableNumber, const I2 extends NullableNumber, >(from: I1,              to: I2,            ): ToReverse_fromTo<T1, T2, I1, I2>
    public abstract override toReverse                                                                    (from: NullableNumber,  to: NullableNumber,): CollectionHolderOfAny1Or2<T2, T1>

    public override toReversed                                                                    (                                          ): CollectionHolderOf2<T2, T1>
    public override toReversed<const I1 extends NullableNumber, >                                 (from: I1,                                 ): ToReverse_from<T1, T2, I1>
    public override toReversed                                                                    (from: NullableNumber,                     ): CollectionHolderOf1Or2<T2, T1>
    public override toReversed<                                 const I2 extends NullableNumber, >(from: NullOrUndefined, to: I2,            ): ToReverse_to<T1, T2, I2>
    public override toReversed                                                                    (from: NullOrUndefined, to: NullableNumber,): CollectionHolderOf1Or2<T2, T1>
    public override toReversed<const I1 extends NullableNumber, const I2 extends NullableNumber, >(from: I1,              to: I2,            ): ToReverse_fromTo<T1, T2, I1, I2>
    public override toReversed                                                                    (from: NullableNumber,  to: NullableNumber,): CollectionHolderOfAny1Or2<T2, T1>
    public override toReversed(from?: NullableNumber, to?: NullableNumber,) {
        return this.toReverse(from, to,)
    }

    public override reversed                                                                    (                                          ): CollectionHolderOf2<T2, T1>
    public override reversed<const I1 extends NullableNumber, >                                 (from: I1,                                 ): ToReverse_from<T1, T2, I1>
    public override reversed                                                                    (from: NullableNumber,                     ): CollectionHolderOf1Or2<T2, T1>
    public override reversed<                                 const I2 extends NullableNumber, >(from: NullOrUndefined, to: I2,            ): ToReverse_to<T1, T2, I2>
    public override reversed                                                                    (from: NullOrUndefined, to: NullableNumber,): CollectionHolderOf1Or2<T2, T1>
    public override reversed<const I1 extends NullableNumber, const I2 extends NullableNumber, >(from: I1,              to: I2,            ): ToReverse_fromTo<T1, T2, I1, I2>
    public override reversed                                                                    (from: NullableNumber,  to: NullableNumber,): CollectionHolderOfAny1Or2<T2, T1>
    public override reversed(from?: NullableNumber, to?: NullableNumber,) {
        return this.toReverse(from, to,)
    }

    //#endregion -------------------- To reverse --------------------

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- JavaScript methods --------------------

    public override [Symbol.iterator](): CollectionIteratorOf2<T1, T2> {
        return this.toIterator()
    }

    //#endregion -------------------- JavaScript methods --------------------
    //#region -------------------- Conversion methods --------------------

    public abstract override toIterator(): CollectionIteratorOf2<T1, T2>

    public abstract override toArray(): readonly [T1, T2,]

    public abstract override toMutableArray(): [T1, T2,]

    public abstract override toSet(): Set<| T1 | T2>

    public abstract override toMutableSet(): MutableSet<| T1 | T2>

    public abstract override toMap(): NumberKeyMap<| T1 | T2, | 0 | 1>

    public abstract override toMutableMap(): MutableNumberKeyMap<| T1 | T2, | 0 | 1>

    //#endregion -------------------- Conversion methods --------------------

    //#endregion -------------------- Methods --------------------

}

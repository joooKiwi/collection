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

import type {Array, MutableNumberKeyMap, MutableSet, Nullable, NullableNumber, NullableString, NullOr, NullOrNumber, NullOrOneNumber, NullOrUndefined, NullOrZeroNumber, NumberKeyMap, Set} from "@joookiwi/type"

import type {CollectionHolder}                                                                                                                                                                        from "../../src/CollectionHolder"
import type {CollectionHolderOf2}                                                                                                                                                                     from "../../src/CollectionHolderOf2"
import type {CollectionIteratorOf2}                                                                                                                                                                   from "../../src/iterator/CollectionIteratorOf2"
import type {BooleanCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, RestrainedBooleanCallback, ReturnCallback, ReverseBooleanCallback, StringCallback, ValueIndexWithReturnCallback} from "../../src/type/callback"
import type {CollectionHolderOf0Or1Or2, CollectionHolderOf1Or2, CollectionHolderOfAny0Or1Or2, CollectionHolderOfAny1Or2, CollectionHolderOfLast0Or1Or2}                                               from "../../src/type/collection"
import type {IndexOf2, IndexOf2Of1, IndexOf2Of2}                                                                                                                                                      from "../../src/type/indexOf"
import type {PossibleIterableIteratorArraySetOrCollectionHolder}                                                                                                                                      from "../../src/type/possibleInstance"
import type {ToReverse_from, ToReverse_fromTo, ToReverse_to}                                                                                                                                          from "../../src/type/toReverse"
import type {DoubleValueFromIndex, DoubleValueFromIndexOrElse, DoubleValueFromIndexOrNull}                                                                                                            from "../../src/type/value"

import {AbstractUnimplementedCollectionHolder} from "./AbstractUnimplementedCollectionHolder"

/**
 * A definition of a {@link CollectionHolderOf2} to have a common ancestor **only for the tests**.
 *
 * @typeParam T1 The 1st type
 * @typeParam T2 The 2nd type
 */
export abstract class AbstractUnimplementedCollectionHolderOf2<const T1,
    const T2, >
    extends AbstractUnimplementedCollectionHolder<| T1 | T2>
    implements CollectionHolderOf2<T1, T2> {

    protected constructor() { super() }

    //#region -------------------- Value methods --------------------

    public abstract readonly value1: T1

    public get 0(): never { throw new Error("The index “0” was not supposed to be called.",) }


    public abstract readonly value2: T2

    public get 1(): never { throw new Error("The index “1” was not supposed to be called.",) }

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

    public abstract override get<const I extends number, >(index: I,): DoubleValueFromIndex<I, T1, T2>
    public abstract override get(index: number,): | T1 | T2

    public abstract override getFirst(): T1

    public abstract override getLast(): T2


    public abstract override getOrElse<const U, const I extends number,>(index: I, defaultValue: IndexWithReturnCallback<U>,): DoubleValueFromIndexOrElse<I, T1, T2, U>
    public abstract override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T1 | T2 | U
    public abstract override getOrElse(index: number, defaultValue: IndexWithReturnCallback<| T1 | T2>,): | T1 | T2

    public abstract override getFirstOrElse<const U, >(defaultValue: ReturnCallback<U>,): T1
    public abstract override getFirstOrElse(defaultValue: ReturnCallback<| T1 | T2>,): T1

    public abstract override getLastOrElse<const U, >(defaultValue: ReturnCallback<U>,): T2
    public abstract override getLastOrElse(defaultValue: ReturnCallback<| T1 | T2>,): T2


    public abstract override getOrNull<const I extends number, >(index: I,): DoubleValueFromIndexOrNull<I, T1, T2>
    public abstract override getOrNull(index: number,): NullOr<| T1 | T2>

    public abstract override getFirstOrNull(): T1

    public abstract override getLastOrNull(): T2

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    public abstract override firstIndexOf<const I1 extends NullableNumber, const I2 extends NullableNumber, >(element: T1,        from?: I1,             to?: I2,):             IndexOf2Of1<I1, I2>
    public abstract override firstIndexOf                                                                    (element: T1,        from?: NullableNumber, to?: NullableNumber,): 0
    public abstract override firstIndexOf<const I1 extends NullableNumber, const I2 extends NullableNumber, >(element: T2,        from?: I1,             to?: I2,):             IndexOf2Of2<I1, I2>
    public abstract override firstIndexOf                                                                    (element: T2,        from?: NullableNumber, to?: NullableNumber,): 1
    public abstract override firstIndexOf<const I1 extends NullableNumber, const I2 extends NullableNumber, >(element: | T1 | T2, from?: I1,             to?: I2,):             IndexOf2<I1, I2>
    public abstract override firstIndexOf                                                                    (element: | T1 | T2, from?: NullableNumber, to?: NullableNumber,): | 0 | 1

    public abstract override firstIndexOfOrNull(element: T1, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber
    public abstract override firstIndexOfOrNull(element: T2, from?: NullableNumber, to?: NullableNumber,): NullOrOneNumber
    public abstract override firstIndexOfOrNull(element: | T1 | T2, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1>


    public abstract override lastIndexOf<const I1 extends NullableNumber, const I2 extends NullableNumber, >(element: T1,        from?: I1,             to?: I2,):             IndexOf2Of1<I1, I2>
    public abstract override lastIndexOf                                                                    (element: T1,        from?: NullableNumber, to?: NullableNumber,): 0
    public abstract override lastIndexOf<const I1 extends NullableNumber, const I2 extends NullableNumber, >(element: T2,        from?: I1,             to?: I2,):             IndexOf2Of2<I1, I2>
    public abstract override lastIndexOf                                                                    (element: T2,        from?: NullableNumber, to?: NullableNumber,): 1
    public abstract override lastIndexOf<const I1 extends NullableNumber, const I2 extends NullableNumber, >(element: | T1 | T2, from?: I1,             to?: I2,):             IndexOf2<I1, I2>
    public abstract override lastIndexOf                                                                    (element: | T1 | T2, from?: NullableNumber, to?: NullableNumber,): | 0 | 1

    public abstract override lastIndexOfOrNull(element: T1, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber
    public abstract override lastIndexOfOrNull(element: T2, from?: NullableNumber, to?: NullableNumber,): NullOrOneNumber
    public abstract override lastIndexOfOrNull(element: | T1 | T2, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1>


    public abstract override indexOfFirst(predicate: BooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): | 0 | 1
    public abstract override indexOfFirstOrNull(predicate: BooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1>
    public abstract override indexOfFirstIndexed(predicate: ReverseBooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): | 0 | 1
    public abstract override indexOfFirstIndexedOrNull(predicate: ReverseBooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1>

    public abstract override indexOfLast(predicate: BooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): | 0 | 1
    public abstract override indexOfLastOrNull(predicate: BooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1>
    public abstract override indexOfLastIndexed(predicate: ReverseBooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): | 0 | 1
    public abstract override indexOfLastIndexedOrNull(predicate: ReverseBooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1>

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    public abstract override all<const S extends T1, >(predicate: RestrainedBooleanCallback<| T1 | T2, | S | T2>,): this is CollectionHolderOf2<S, T2>
    public abstract override all<const S extends T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, | T1 | S>,): this is CollectionHolderOf2<T1, S>
    public abstract override all<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): this is CollectionHolderOf2<S, S>
    public abstract override all(predicate: BooleanCallback<| T1 | T2>,): boolean

    public override every<const S extends | T1 | T2, >(..._: Array<unknown>): this is CollectionHolderOf2<S, S>
    public override every(..._: Array<unknown>): never
    public override every(): never {
        throw new Error("The method “every” was not expected to be called.",)
    }


    public abstract override requireNoNulls(): CollectionHolderOf2<NonNullable<T1>, NonNullable<T2>>

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    public abstract override filterNotNull(): CollectionHolderOfAny0Or1Or2<NonNullable<T1>, NonNullable<T2>>


    public abstract override slice(): CollectionHolderOf2<T1, T2>
    public abstract override slice(from?: NullableNumber, to?: NullableNumber,): CollectionHolderOf1Or2<T1, T2>
    public abstract override slice(indices: PossibleIterableIteratorArraySetOrCollectionHolder<number>,): CollectionHolder<| T1 | T2>


    public abstract override take(n: number,): CollectionHolderOf0Or1Or2<T1, T2>

    public abstract override takeLast(n: number,): CollectionHolderOfLast0Or1Or2<T1, T2>


    public abstract override drop(n: number,): CollectionHolderOfLast0Or1Or2<T1, T2>

    public abstract override dropLast(n: number,): CollectionHolderOf0Or1Or2<T1, T2>


    public abstract override map<const U, >(transform: ValueIndexWithReturnCallback<| T1 | T2, U>,): CollectionHolderOf2<U, U>
    public abstract override mapIndexed<const U, >(transform: IndexValueWithReturnCallback<| T1 | T2, U>,): CollectionHolderOf2<U, U>

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Reordering methods --------------------

    public abstract override toReverse                                                                    (                                          ): CollectionHolderOf2<T2, T1>
    public abstract override toReverse<const I1 extends NullableNumber, >                                 (from: I1,                                 ): ToReverse_from<T1, T2, I1>
    public abstract override toReverse                                                                    (from: NullableNumber,                     ): CollectionHolderOf1Or2<T2, T1>
    public abstract override toReverse<const I2 extends NullableNumber, >                                 (from: NullOrUndefined, to: I2,            ): ToReverse_to<T1, T2, I2>
    public abstract override toReverse                                                                    (from: NullOrUndefined, to: NullableNumber,): CollectionHolderOf1Or2<T2, T1>
    public abstract override toReverse<const I1 extends NullableNumber, const I2 extends NullableNumber, >(from: I1,              to: I2,            ): ToReverse_fromTo<T1, T2, I1, I2>
    public abstract override toReverse                                                                    (from: NullableNumber,  to: NullableNumber,): CollectionHolderOfAny1Or2<T2, T1>

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- Conversion methods --------------------

    public abstract override toIterator(): CollectionIteratorOf2<T1, T2>

    public abstract override toArray(): readonly [T1, T2,]
    public abstract override toMutableArray(): | [T1, T2,]
    public abstract override toSet(): Set<| T1 | T2>
    public abstract override toMutableSet(): MutableSet<| T1 | T2>
    public abstract override toMap(): NumberKeyMap<| T1 | T2, | 0 | 1>
    public abstract override toMutableMap(): MutableNumberKeyMap<| T1 | T2, | 0 | 1>


    public abstract override toString(): string
    public abstract override toLocaleString(locale?: NullableString,): string

    public abstract override toLowerCaseString(): string
    public abstract override toLocaleLowerCaseString(locale?: NullableString,): string

    public abstract override toUpperCaseString(): string
    public abstract override toLocaleUpperCaseString(locale?: NullableString,): string


    public abstract override joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<| T1 | T2>>,): string

    //#endregion -------------------- Conversion methods --------------------

}

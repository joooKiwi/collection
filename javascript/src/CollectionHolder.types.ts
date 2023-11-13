/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionConstants} from "./CollectionConstants"
import type {CollectionHolder}    from "./CollectionHolder"

/** A simple {@link Symbol.toStringTag} of a {@link CollectionHolder} */
export type CollectionHolderName = typeof CollectionConstants["COLLECTION_HOLDER_TO_STRING_TAG"]


export type BooleanCallback<T, > = (value: T, index: number,) => boolean
export type ReverseBooleanCallback<T, > = (index: number, value: T,) => boolean
export type RestrainedBooleanCallback<T, S extends T, > = (value: T, index: number,) => value is S
export type ReverseRestrainedBooleanCallback<T, S extends T, > = (index: number, value: T,) => value is S

export type IndexWithReturnCallback<U, > = (index: number,) => U

export type ValueIndexCallback<T, > = (value: T, index: number,) => void
export type IndexValueCallback<T, > = (index: number, value: T,) => void

export type ValueIndexWithReturnCallback<T, U, > = (value: T, index: number,) => U
export type IndexValueWithReturnCallback<T, U, > = (index: number, value: T,) => U

/**
 * A simple callback that receive both a value and an index and return a {@link String}
 *
 * @note The arguments are optionals
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/BiFunction.html Java BiFunction&lt;T, U, R&gt;
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Function.html Java Function&lt;T, R&gt;
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Supplier.html Java Supplier&lt;T&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-3 C# Func&lt;T1, T2, TResult&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-2 C# Func&lt;T, TResult&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-1 C# Func&lt;TResult&gt;
 */
export type StringCallback<T, > = (value: T, index: number,) => string

/** @deprecated This type has been replaced with {@link StringCallback} */
export type ValueWithStringReturnCallback<T, > = (value: T,) => string

/** A simple object encapsulation of a value */
export type ObjectOf<T, > =
    | (T extends string ? (& String & { valueOf(): T, }) : never)
    | (T extends boolean ? (& Boolean & { valueOf(): T, }) : never)
    | (T extends number ? (& Number & { valueOf(): T, }) : never)
    | (T extends bigint ? (& BigInt & { valueOf(): T, }) : never)
    | (T extends null ? (& {} & { valueOf(): {}, }) : never)
    | (T extends undefined ? (& {} & { valueOf(): {}, }) : never)
    | (T extends symbol ? (& Symbol & { valueOf(): T, }) : never)
    | (& T & object & { valueOf(): T, })

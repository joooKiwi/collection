/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionConstants} from "./CollectionConstants"
import type {CollectionHolder}    from "./CollectionHolder"

/** A simple {@link Symbol.toStringTag} of a {@link CollectionHolder} */
export type CollectionHolderName = typeof CollectionConstants["COLLECTION_HOLDER_TO_STRING_TAG"]


/**
 * A simple callback that receive both a value and an index and return a {@link Boolean}
 *
 * @note The arguments are optionals
 * @see ReverseBooleanCallback
 * @see RestrainedBooleanCallback
 * @see ReverseRestrainedBooleanCallback
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/BiFunction.html Java BiFunction&lt;T, U, R&gt;
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Function.html Java Function&lt;T, R&gt;
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Supplier.html Java Supplier&lt;T&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-3 C# Func&lt;T1, T2, TResult&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-2 C# Func&lt;T, TResult&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-1 C# Func&lt;TResult&gt;
 */
export type BooleanCallback<T, > = (value: T, index: number,) => boolean
/**
 * A simple callback that receive both an index and a value and return a {@link Boolean}
 *
 * @note The arguments are optionals
 * @see BooleanCallback
 * @see RestrainedBooleanCallback
 * @see ReverseRestrainedBooleanCallback
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/BiFunction.html Java BiFunction&lt;T, U, R&gt;
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Function.html Java Function&lt;T, R&gt;
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Supplier.html Java Supplier&lt;T&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-3 C# Func&lt;T1, T2, TResult&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-2 C# Func&lt;T, TResult&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-1 C# Func&lt;TResult&gt;
 */
export type ReverseBooleanCallback<T, > = (index: number, value: T,) => boolean
/**
 * A simple callback that receive both a value and an index and return a restricting {@link Boolean} of <b>T</b>
 *
 * @typescriptExclusive
 * @note The arguments are optionals
 * @see BooleanCallback
 * @see ReverseBooleanCallback
 * @see ReverseRestrainedBooleanCallback
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/BiFunction.html Java BiFunction&lt;T, U, R&gt;
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Function.html Java Function&lt;T, R&gt;
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Supplier.html Java Supplier&lt;T&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-3 C# Func&lt;T1, T2, TResult&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-2 C# Func&lt;T, TResult&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-1 C# Func&lt;TResult&gt;
 */
export type RestrainedBooleanCallback<T, S extends T, > = (value: T, index: number,) => value is S
/**
 * A simple callback that receive both an index and a value and return a restricting {@link Boolean} of <b>T</b>
 *
 * @typescriptExclusive
 * @note The arguments are optionals
 * @see BooleanCallback
 * @see RestrainedBooleanCallback
 * @see ReverseBooleanCallback
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/BiFunction.html Java BiFunction&lt;T, U, R&gt;
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Function.html Java Function&lt;T, R&gt;
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Supplier.html Java Supplier&lt;T&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-3 C# Func&lt;T1, T2, TResult&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-2 C# Func&lt;T, TResult&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-1 C# Func&lt;TResult&gt;
 */
export type ReverseRestrainedBooleanCallback<T, S extends T, > = (index: number, value: T,) => value is S

/**
 * A simple callback that receive only an index and return a value <b>R</b>
 *
 * @typescriptExclusive
 * @note The argument is optional
 * @see ValueIndexCallback
 * @see IndexValueCallback
 * @see ValueIndexWithReturnCallback
 * @see IndexValueWithReturnCallback
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Function.html Java Function&lt;T, R&gt;
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Supplier.html Java Supplier&lt;T&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-2 C# Func&lt;T, TResult&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-1 C# Func&lt;TResult&gt;
 */
export type IndexWithReturnCallback<R, > = (index: number,) => R

/**
 * A simple callback that receive both a value and an index and return nothing
 *
 * @typescriptExclusive
 * @note The arguments are optionals
 * @see IndexWithReturnCallback
 * @see IndexValueCallback
 * @see ValueIndexWithReturnCallback
 * @see IndexValueWithReturnCallback
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/BiConsumer.html Java BiConsumer&lt;T, U&gt;
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Consumer.html Java Consumer&lt;T&gt;
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Runnable.html Java Runnable
 * @see https://learn.microsoft.com/dotnet/api/system.action-2 C# Action&lt;T1, T2&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.action-1 C# Action&lt;T&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.action C# Action
 */
export type ValueIndexCallback<T, > = (value: T, index: number,) => void
/**
 * A simple callback that receive both an index and a value and return nothing
 *
 * @typescriptExclusive
 * @note The arguments are optionals
 * @see IndexWithReturnCallback
 * @see ValueIndexCallback
 * @see ValueIndexWithReturnCallback
 * @see IndexValueWithReturnCallback
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/BiConsumer.html Java BiConsumer&lt;T, U&gt;
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Consumer.html Java Consumer&lt;T&gt;
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Runnable.html Java Runnable
 * @see https://learn.microsoft.com/dotnet/api/system.action-2 C# Action&lt;T1, T2&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.action-1 C# Action&lt;T&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.action C# Action
 */
export type IndexValueCallback<T, > = (index: number, value: T,) => void

/**
 * A simple callback that receive both a value and an index and return a value <b>R</b>
 *
 * @typescriptExclusive
 * @note The arguments are optionals
 * @see IndexWithReturnCallback
 * @see ValueIndexCallback
 * @see IndexValueCallback
 * @see IndexValueWithReturnCallback
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/BiFunction.html Java BiFunction&lt;T, U, R&gt;
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Function.html Java Function&lt;T, R&gt;
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Supplier.html Java Supplier&lt;T&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-3 C# Func&lt;T1, T2, TResult&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-2 C# Func&lt;T, TResult&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-1 C# Func&lt;TResult&gt;
 */
export type ValueIndexWithReturnCallback<T, R, > = (value: T, index: number,) => R
/**
 * A simple callback that receive both an index and a value and return a value <b>R</b>
 *
 * @typescriptExclusive
 * @note The arguments are optionals
 * @see IndexWithReturnCallback
 * @see ValueIndexCallback
 * @see IndexValueCallback
 * @see ValueIndexWithReturnCallback
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/BiFunction.html Java BiFunction&lt;T, U, R&gt;
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Function.html Java Function&lt;T, R&gt;
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Supplier.html Java Supplier&lt;T&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-3 C# Func&lt;T1, T2, TResult&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-2 C# Func&lt;T, TResult&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-1 C# Func&lt;TResult&gt;
 */
export type IndexValueWithReturnCallback<T, R, > = (index: number, value: T,) => R

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

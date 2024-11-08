/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

/**
 * A callback that receive both a value and an index and return a {@link Boolean}
 *
 * @note The arguments are optionals
 * @see ReverseBooleanCallback
 * @see RestrainedBooleanCallback
 * @see ReverseRestrainedBooleanCallback
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/function/BiFunction.html Java BiFunction&lt;T, U, R&gt;
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/function/Predicate.html Java Predicate&lt;T&gt;
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/function/BooleanSupplier.html Java BooleanSupplier
 * @see https://learn.microsoft.com/dotnet/api/system.func-3 C# Func&lt;T1, T2, TResult&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-2 C# Func&lt;T, TResult&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-1 C# Func&lt;TResult&gt;
 */
export type BooleanCallback<in T, > = (value: T, index: number,) => boolean
/**
 * A callback that receive both an index and a value and return a {@link Boolean}
 *
 * @note The arguments are optionals
 * @see BooleanCallback
 * @see RestrainedBooleanCallback
 * @see ReverseRestrainedBooleanCallback
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/function/BiFunction.html Java BiFunction&lt;T, U, R&gt;
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/function/IntPredicate.html Java IntPredicate
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/function/BooleanSupplier.html Java BooleanSupplier
 * @see https://learn.microsoft.com/dotnet/api/system.func-3 C# Func&lt;T1, T2, TResult&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-2 C# Func&lt;T, TResult&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-1 C# Func&lt;TResult&gt;
 */
export type ReverseBooleanCallback<in T, > = (index: number, value: T,) => boolean
/**
 * A callback that receive both a value and an index and return a restricting {@link Boolean} of <b>T</b>
 *
 * @typescriptExclusive
 * @note The arguments are optionals
 * @see BooleanCallback
 * @see ReverseBooleanCallback
 * @see ReverseRestrainedBooleanCallback
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/function/BiFunction.html Java BiFunction&lt;T, U, R&gt;
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/function/Predicate.html Java Predicate&lt;T&gt;
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/function/BooleanSupplier.html Java BooleanSupplier
 * @see https://learn.microsoft.com/dotnet/api/system.func-3 C# Func&lt;T1, T2, TResult&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-2 C# Func&lt;T, TResult&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-1 C# Func&lt;TResult&gt;
 */
export type RestrainedBooleanCallback<in T, out S extends T, > = (value: T, index: number,) => value is S
/**
 * A callback that receive both an index and a value and return a restricting {@link Boolean} of <b>T</b>
 *
 * @typescriptExclusive
 * @note The arguments are optionals
 * @see BooleanCallback
 * @see RestrainedBooleanCallback
 * @see ReverseBooleanCallback
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/function/BiFunction.html Java BiFunction&lt;T, U, R&gt;
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/function/IntPredicate.html Java IntPredicate
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/function/BooleanSupplier.html Java BooleanSupplier
 * @see https://learn.microsoft.com/dotnet/api/system.func-3 C# Func&lt;T1, T2, TResult&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-2 C# Func&lt;T, TResult&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-1 C# Func&lt;TResult&gt;
 */
export type ReverseRestrainedBooleanCallback<in T, out S extends T, > = (index: number, value: T,) => value is S

/**
 * A callback that receive only an index and return a value <b>R</b>
 *
 * @typescriptExclusive
 * @note The argument is optional
 * @see ValueIndexCallback
 * @see IndexValueCallback
 * @see ValueIndexWithReturnCallback
 * @see IndexValueWithReturnCallback
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/function/IntFunction.html Java IntFunction&lt;R&gt;
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/function/Supplier.html Java Supplier&lt;R&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-2 C# Func&lt;T, R&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-1 C# Func&lt;R&gt;
 */
export type IndexWithReturnCallback<out R, > = (index: number,) => R

/**
 * A callback that receive both a value and an index and return nothing
 *
 * @typescriptExclusive
 * @note The arguments are optionals
 * @see IndexWithReturnCallback
 * @see IndexValueCallback
 * @see ValueIndexWithReturnCallback
 * @see IndexValueWithReturnCallback
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/function/ObjIntConsumer.html Java ObjIntConsumer&lt;T&gt;
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/function/Consumer.html Java Consumer&lt;T&gt;
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/lang/Runnable.html Java Runnable
 * @see https://learn.microsoft.com/dotnet/api/system.action-2 C# Action&lt;T, U&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.action-1 C# Action&lt;T&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.action C# Action
 */
export type ValueIndexCallback<in T, > = (value: T, index: number,) => void
/**
 * A callback that receive both an index and a value and return nothing
 *
 * @typescriptExclusive
 * @note The arguments are optionals
 * @see IndexWithReturnCallback
 * @see ValueIndexCallback
 * @see ValueIndexWithReturnCallback
 * @see IndexValueWithReturnCallback
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/function/ObjIntConsumer.html Java ObjIntConsumer&lt;T&gt;
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/function/Consumer.html Java Consumer&lt;T&gt;
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/lang/Runnable.html Java Runnable
 * @see https://learn.microsoft.com/dotnet/api/system.action-2 C# Action&lt;T, U&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.action-1 C# Action&lt;T&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.action C# Action
 */
export type IndexValueCallback<in T, > = (index: number, value: T,) => void

/**
 * A callback that receive both a value and an index and return a value <b>R</b>
 *
 * @typescriptExclusive
 * @note The arguments are optionals
 * @see IndexWithReturnCallback
 * @see ValueIndexCallback
 * @see IndexValueCallback
 * @see IndexValueWithReturnCallback
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/function/BiFunction.html Java BiFunction&lt;T, U, R&gt;
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/function/Function.html Java Function&lt;T, R&gt;
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/function/Supplier.html Java Supplier&lt;T&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-3 C# Func&lt;T, U, R&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-2 C# Func&lt;T, R&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-1 C# Func&lt;TResult&gt;
 */
export type ValueIndexWithReturnCallback<in T, out R, > = (value: T, index: number,) => R
/**
 * A callback that receive both an index and a value and return a value <b>R</b>
 *
 * @typescriptExclusive
 * @note The arguments are optionals
 * @see IndexWithReturnCallback
 * @see ValueIndexCallback
 * @see IndexValueCallback
 * @see ValueIndexWithReturnCallback
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/function/BiFunction.html Java BiFunction&lt;T, U, R&gt;
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/function/Function.html Java Function&lt;T, R&gt;
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/function/Supplier.html Java Supplier&lt;T&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-3 C# Func&lt;T, U, R&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-2 C# Func&lt;T, R&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-1 C# Func&lt;R&gt;
 */
export type IndexValueWithReturnCallback<in T, out R, > = (index: number, value: T,) => R

/**
 * A callback that receive both a value and an index and return a {@link String}
 *
 * @note The arguments are optionals
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/function/BiFunction.html Java BiFunction&lt;T, U, R&gt;
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/function/Function.html Java Function&lt;T, R&gt;
 * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/function/Supplier.html Java Supplier&lt;T&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-3 C# Func&lt;T, U, R&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-2 C# Func&lt;T, R&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-1 C# Func&lt;R&gt;
 */
export type StringCallback<in T, > = (value: T, index: number,) => string

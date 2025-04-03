//··························································
// Copyright (c) 2023-2025. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

/**
 * A callback that receive both a value and an index and return a {@link Boolean}
 *
 * @note The arguments are optionals
 * @see ReverseBooleanCallback
 * @see RestrainedBooleanCallback
 * @see ReverseRestrainedBooleanCallback
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/BiPredicate.html Java BiPredicate&lt;T, Integer&gt;
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html Java Predicate&lt;T&gt;
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/BooleanSupplier.html Java BooleanSupplier
 * @see https://learn.microsoft.com/dotnet/api/system.func-3 C# Func&lt;T, int, bool&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-2 C# Func&lt;T, bool&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-1 C# Func&lt;bool&gt;
 */
export type BooleanCallback<in T, > = (value: T, index: number,) => boolean
/**
 * A callback that receive both an index and a value and return a {@link Boolean}
 *
 * @note The arguments are optionals
 * @see BooleanCallback
 * @see RestrainedBooleanCallback
 * @see ReverseRestrainedBooleanCallback
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/BiPredicate.html Java BiPredicate&lt;Integer, U&gt;
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/IntPredicate.html Java IntPredicate
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/BooleanSupplier.html Java BooleanSupplier
 * @see https://learn.microsoft.com/dotnet/api/system.func-3 C# Func&lt;int, T, bool&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-2 C# Func&lt;int, bool&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-1 C# Func&lt;bool&gt;
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
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/BiFunction.html Java BiFunction&lt;T, U, R&gt;
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Predicate.html Java Predicate&lt;T&gt;
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/BooleanSupplier.html Java BooleanSupplier
 * @see https://learn.microsoft.com/dotnet/api/system.func-3 C# Func&lt;T, int, bool&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-2 C# Func&lt;T, bool&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-1 C# Func&lt;bool&gt;
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
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/BiPredicate.html Java BiPredicate&lt;Integer, U&gt;
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/IntPredicate.html Java IntPredicate
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/BooleanSupplier.html Java BooleanSupplier
 * @see https://learn.microsoft.com/dotnet/api/system.func-3 C# Func&lt;int, T, bool&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-2 C# Func&lt;int, bool&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-1 C# Func&lt;bool&gt;
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
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/IntFunction.html Java IntFunction&lt;R&gt;
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Supplier.html Java Supplier&lt;R&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-2 C# Func&lt;int, R&gt;
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
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/ObjIntConsumer.html Java ObjIntConsumer&lt;T&gt;
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Consumer.html Java Consumer&lt;T&gt;
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html Java Runnable
 * @see https://learn.microsoft.com/dotnet/api/system.action-2 C# Action&lt;T, int&gt;
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
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/BiConsumer.html Java BiConsumer&lt;Integer, T&gt;
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/IntConsumer.html Java IntConsumer
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Runnable.html Java Runnable
 * @see https://learn.microsoft.com/dotnet/api/system.action-2 C# Action&lt;int, U&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.action-1 C# Action&lt;int&gt;
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
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/BiFunction.html Java BiFunction&lt;T, Integer, R&gt;
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Function.html Java Function&lt;T, R&gt;
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Supplier.html Java Supplier&lt;T&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-3 C# Func&lt;T, int, R&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-2 C# Func&lt;T, R&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-1 C# Func&lt;R&gt;
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
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/BiFunction.html Java BiFunction&lt;T, U, R&gt;
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/IntFunction.html Java IntFunction
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Supplier.html Java Supplier&lt;T&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-3 C# Func&lt;int, U, R&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-2 C# Func&lt;T, R&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-1 C# Func&lt;R&gt;
 */
export type IndexValueWithReturnCallback<in T, out R, > = (index: number, value: T,) => R

/**
 * A callback that receive both a value and an index and return a {@link String}
 *
 * @note The arguments are optionals
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/BiFunction.html Java BiFunction&lt;T, Integer, String&gt;
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Function.html Java Function&lt;T, String&gt;
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/function/Supplier.html Java Supplier&lt;String&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-3 C# Func&lt;T, int, string&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-2 C# Func&lt;T, string&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-1 C# Func&lt;string&gt;
 */
export type StringCallback<in T, > = (value: T, index: number,) => string

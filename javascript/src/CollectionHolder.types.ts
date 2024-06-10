/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionConstants}               from "./CollectionConstants"
import type {CollectionHolder}                  from "./CollectionHolder"
import type {GenericCollectionHolder}           from "./GenericCollectionHolder"
import type {GenericMinimalistCollectionHolder} from "./GenericMinimalistCollectionHolder"
import type {LazyGenericCollectionHolder}       from "./LazyGenericCollectionHolder"
import type {MinimalistCollectionHolder}        from "./MinimalistCollectionHolder"
import type {IterableWithPossibleSize}          from "./iterable/IterableWithPossibleSize"
import type {CollectionIterator}                from "./iterator/CollectionIterator"

/** A type-alias of {@link CollectionHolder}[{@link Symbol.toStringTag}] */
export type CollectionHolderName = typeof CollectionConstants["COLLECTION_HOLDER_TO_STRING_TAG"]

/**
 * The possible {@link Object.constructor constructor} types that are inherited
 * from a {@link MinimalistCollectionHolder} or a {@link CollectionHolder}
 */
export type PossibleCollectionHolderConstructor = | typeof GenericMinimalistCollectionHolder
                                                  | typeof GenericCollectionHolder
                                                  | typeof LazyGenericCollectionHolder


/**
 * A type-alias for the possible type of {@link Iterable} with the size field
 * (size, length or count) or the {@link MinimalistCollectionHolder}.
 *
 * Compared to {@link PossibleIterableArraySetOrCollectionHolder}, only the most generic type is used
 *
 * @see PossibleIterableWithPossibleSize
 * @see CollectionHolder
 * @see MinimalistCollectionHolder
 * @see CollectionIterator
 */
export type PossibleIterableOrCollection<T, > = | MinimalistCollectionHolder<T> | IterableWithPossibleSize<T>

/**
 * A type-alias for the possible {@link ReadonlyArray Array}, {@link ReadonlySet Set},
 * {@link MinimalistCollectionHolder} (with inheritor)
 * and {@link Iterable} (with inheritor)
 *
 * Compared to {@link PossibleIterableOrCollection}, it have the most specific types applicable
 *
 * @see ReadonlyArray
 * @see ReadonlySet
 * @see CollectionHolder
 * @see MinimalistCollectionHolder
 * @see CollectionIterator
 * @see Iterable
 * @see IterableWithPossibleSize
 */
export type PossibleIterableArraySetOrCollectionHolder<T, > = | readonly T[] | ReadonlySet<T>
                                                              | MinimalistCollectionHolder<T> | CollectionHolder<T>
                                                              | CollectionIterator<T> | Iterable<T> | IterableWithPossibleSize<T>


/**
 * A callback that receive both a value and an index and return a {@link Boolean}
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
export type BooleanCallback<in T, > = (value: T, index: number,) => boolean
/**
 * A callback that receive both an index and a value and return a {@link Boolean}
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
export type ReverseBooleanCallback<in T, > = (index: number, value: T,) => boolean
/**
 * A callback that receive both a value and an index and return a restricting {@link Boolean} of <b>T</b>
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
export type RestrainedBooleanCallback<in T, out S extends T, > = (value: T, index: number,) => value is S
/**
 * A callback that receive both an index and a value and return a restricting {@link Boolean} of <b>T</b>
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
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Function.html Java Function&lt;T, R&gt;
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Supplier.html Java Supplier&lt;T&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-2 C# Func&lt;T, TResult&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-1 C# Func&lt;TResult&gt;
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
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/BiConsumer.html Java BiConsumer&lt;T, U&gt;
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Consumer.html Java Consumer&lt;T&gt;
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Runnable.html Java Runnable
 * @see https://learn.microsoft.com/dotnet/api/system.action-2 C# Action&lt;T1, T2&gt;
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
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/BiConsumer.html Java BiConsumer&lt;T, U&gt;
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Consumer.html Java Consumer&lt;T&gt;
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Runnable.html Java Runnable
 * @see https://learn.microsoft.com/dotnet/api/system.action-2 C# Action&lt;T1, T2&gt;
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
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/BiFunction.html Java BiFunction&lt;T, U, R&gt;
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Function.html Java Function&lt;T, R&gt;
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Supplier.html Java Supplier&lt;T&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-3 C# Func&lt;T1, T2, TResult&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-2 C# Func&lt;T, TResult&gt;
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
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/BiFunction.html Java BiFunction&lt;T, U, R&gt;
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Function.html Java Function&lt;T, R&gt;
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Supplier.html Java Supplier&lt;T&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-3 C# Func&lt;T1, T2, TResult&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-2 C# Func&lt;T, TResult&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-1 C# Func&lt;TResult&gt;
 */
export type IndexValueWithReturnCallback<in T, out R, > = (index: number, value: T,) => R

/**
 * A callback that receive both a value and an index and return a {@link String}
 *
 * @note The arguments are optionals
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/BiFunction.html Java BiFunction&lt;T, U, R&gt;
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Function.html Java Function&lt;T, R&gt;
 * @see https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/function/Supplier.html Java Supplier&lt;T&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-3 C# Func&lt;T1, T2, TResult&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-2 C# Func&lt;T, TResult&gt;
 * @see https://learn.microsoft.com/dotnet/api/system.func-1 C# Func&lt;TResult&gt;
 */
export type StringCallback<in T, > = (value: T, index: number,) => string

/** An object encapsulation of a value */
export type ObjectOf<T, > = T & object
//TODO fix the typing to properly tell the conversion without error on its part.
    // | (T extends string ? (& String & { valueOf(): T, }) : never)
    // | (T extends boolean ? (& Boolean & { valueOf(): T, }) : never)
    // | (T extends number ? (& Number & { valueOf(): T, }) : never)
    // | (T extends bigint ? (& BigInt & { valueOf(): T, }) : never)
    // | (T extends null ? (& {} & { valueOf(): {}, }) : never)
    // | (T extends undefined ? (& {} & { valueOf(): {}, }) : never)
    // | (T extends symbol ? (& Symbol & { valueOf(): T, }) : never)
    // | (& T & object & { valueOf(): T, })

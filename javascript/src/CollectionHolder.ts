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

import type {Nullable, NullableNumber, NullableString, NullOr, NullOrNumber, TemplateOrNumber, UndefinedOr} from "@joookiwi/type"

import type {MinimalistCollectionHolder}                                                                                                                                                                                                                                        from "./MinimalistCollectionHolder"
import type {CollectionIterator}                                                                                                                                                                                                                                                from "./iterator/CollectionIterator"
import type {BooleanCallback, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, RestrainedBooleanCallback, ReturnCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, StringCallback, ValueIndexCallback, ValueIndexWithReturnCallback} from "./type/callback"
import type {PossibleIterableIteratorArraySetOrCollectionHolder}                                                                                                                                                                                                                from "./type/possibleInstance"
import type {CollectionHolderName}                                                                                                                                                                                                                                              from "./type/toStringTag"

/**
 * A collection to hold data.
 * Its purpose is to do generic stuff if applicable.
 *
 * It has some methods that are applicable on {@link ReadonlyArray}, {@link ReadonlySet}
 * & {@link ReadonlyMap} to give functionalities.
 * Some methods are inspired by other languages to give more cross-language features.
 *
 * @param T The type (by default <em>unknown</em>)
 *
 * @see ReadonlyArray
 * @see ReadonlySet
 * @see ReadonlyMap
 * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array JavaScript Array
 * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set JavaScript Set
 * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Map JavaScript Map
 * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html Java Collection
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/ Kotlin Collection
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable C# Enumerable
 * @see https://docs.oracle.com/en/java/javase/24/core/java-collections-framework.html Java collection framework
 */
export interface CollectionHolder<out T = unknown, >
    extends MinimalistCollectionHolder<T>,
            Iterable<T> {

    /**
     * Get the value at the index (without validating if it exists in the {@link CollectionHolder})
     *
     * @see get
     */
    [index: TemplateOrNumber]: UndefinedOr<T>

    //#region -------------------- Size methods --------------------

    /**
     * Get the size ({@link CollectionHolder.length length} or {@link CollectionHolder.count count}) of the current {@link CollectionHolder collection}
     *
     * @see ReadonlyArray.length
     * @see ReadonlySet.size
     * @see ReadonlyMap.size
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/size.html Kotlin Collection.size()
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/size.html Kotlin Map.size()
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#size() Java Collection.size()
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html#size() Java Map.size()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.count C# Count()
     * @see length
     * @see count
     */
    get size(): number

    /**
     * Get the length ({@link CollectionHolder.size size} or {@link CollectionHolder.count count}) of the current {@link CollectionHolder collection}
     *
     * @alias CollectionHolder.size
     */
    get length(): this["size"]

    /**
     * Get the count ({@link CollectionHolder.size size} or {@link CollectionHolder.length length}) of the current {@link CollectionHolder collection}
     *
     * @alias CollectionHolder.size
     */
    get count(): this["size"]


    /**
     * The {@link CollectionHolder collection} has no values
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-empty.html Kotlin isEmpty()
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/is-empty.html Kotlin Collection.isEmpty()
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/is-empty.html Kotlin Map.isEmpty()
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#isEmpty() Java Collection.isEmpty()
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html#isEmpty Java Map.isEmpty()
     * @see isNotEmpty
     */
    get isEmpty(): boolean

    /**
     * The {@link CollectionHolder collection} has at least one value
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-not-empty.html Kotlin isNotEmpty()
     * @see isEmpty
     */
    get isNotEmpty(): boolean

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    /**
     * Get the element at the specified index in the current {@link CollectionHolder collection}
     *
     * @param index The index to retrieve a value
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} is empty
     * @throws IndexOutOfBoundsException The {@link index} calculated is under zero or over the {@link size} (after calculation)
     * @throws ForbiddenIndexException   The {@link index} is a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.at
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/get.html Kotlin get(index)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html#get(int) Java get(index)
     * @canReceiveNegativeValue
     */
    get(index: number,): T

    /**
     * Get the element at the specified index in the current {@link CollectionHolder collection}
     *
     * @param index The index to retrieve a value
     * @alias CollectionHolder.get
     */
    at(index: number,): T

    /**
     * Get the element at the specified index in the current {@link CollectionHolder collection}
     *
     * @param index The index to retrieve a value
     * @alias CollectionHolder.get
     */
    elementAt(index: number,): T

    //#endregion -------------------- Get --------------------
    //#region -------------------- Get first --------------------

    /**
     * Get the first element in the current {@link CollectionHolder collection}
     *
     * @throws EmptyCollectionException The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first()
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/SequencedCollection.html#getFirst() Java getFirst()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First()
     */
    getFirst(): T

    //#endregion -------------------- Get first --------------------
    //#region -------------------- Get last --------------------

    /**
     * Get the last element in the current {@link CollectionHolder collection}
     *
     * @throws EmptyCollectionException The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last()
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/SequencedCollection.html#getLast() Java getLast()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last()
     */
    getLast(): T

    //#endregion -------------------- Get last --------------------

    //#region -------------------- Get or else --------------------

    /**
     * Get the element at the specified index in the current {@link CollectionHolder collection}
     * or calling the {@link defaultValue} function
     * if it is out of bound of the current {@link CollectionHolder collection}
     *
     * @param index        The index to retrieve a value
     * @param defaultValue The callback to retrieve the default value if it is over the {@link size}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-else.html Kotlin getOrElse(key, defaultValue)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-else.html Kotlin elementAtOrElse(key, defaultValue)
     * @canReceiveNegativeValue
     */
    getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U

    /**
     * Get the element at the specified index in the current {@link CollectionHolder collection}
     * or calling the {@link defaultValue} function
     * if it is out of bound of the current {@link CollectionHolder collection}
     *
     * @param index        The index to retrieve a value
     * @param defaultValue The callback to retrieve the default value if it is over the {@link size} (after calculation)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-else.html Kotlin getOrElse(key, defaultValue)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-else.html Kotlin elementAtOrElse(key, defaultValue)
     * @canReceiveNegativeValue
     */
    getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T


    /**
     * Get the element at the specified index in the current {@link CollectionHolder collection}
     * or calling the {@link defaultValue} function
     * if it is out of bound of the current {@link CollectionHolder collection}
     *
     * @param index        The index to retrieve a value
     * @param defaultValue The callback to retrieve the default value if it is over the {@link size} (after calculation)
     * @alias CollectionHolder.getOrElse
     */
    atOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U

    /**
     * Get the element at the specified index in the current {@link CollectionHolder collection}
     * or calling the {@link defaultValue} function
     * if it is out of bound of the current {@link CollectionHolder collection}
     *
     * @param index        The index to retrieve a value
     * @param defaultValue The callback to retrieve the default value if it is over the {@link size} (after calculation)
     * @alias CollectionHolder.getOrElse
     */
    atOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T


    /**
     * Get the element at the specified index in the current {@link CollectionHolder collection}
     * or calling the {@link defaultValue} function
     * if it is out of bound of the current {@link CollectionHolder collection}
     *
     * @param index        The index to retrieve a value
     * @param defaultValue The callback to retrieve the default value if it is over the {@link size} (after calculation)
     * @alias CollectionHolder.getOrElse
     */
    elementAtOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U

    /**
     * Get the element at the specified index in the current {@link CollectionHolder collection}
     * or calling the {@link defaultValue} function
     * if it is out of bound of the current {@link CollectionHolder collection}
     *
     * @param index        The index to retrieve a value
     * @param defaultValue The callback to retrieve the default value if it is over the {@link size} (after calculation)
     * @alias CollectionHolder.getOrElse
     */
    elementAtOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T

    //#endregion -------------------- Get or else --------------------
    //#region -------------------- Get first or else --------------------

    /**
     * Get the first element in the current {@link CollectionHolder collection}
     * or calling the {@link defaultValue} function
     * if it is out of bound of the current {@link CollectionHolder collection}
     */
    getFirstOrElse<const U, >(defaultValue: ReturnCallback<U>,): NullOr<| T | U>

    /**
     * Get the first element in the current {@link CollectionHolder collection}
     * or calling the {@link defaultValue} function
     * if it is out of bound of the current {@link CollectionHolder collection}
     */
    getFirstOrElse(defaultValue: ReturnCallback<T>,): NullOr<T>

    //#endregion -------------------- Get first or else --------------------
    //#region -------------------- Get last or else --------------------

    /**
     * Get the last element in the current {@link CollectionHolder collection}
     * or calling the {@link defaultValue} function
     * if it is out of bound of the current {@link CollectionHolder collection}
     */
    getLastOrElse<const U, >(defaultValue: ReturnCallback<U>,): NullOr<| T | U>

    /**
     * Get the last element in the current {@link CollectionHolder collection}
     * or calling the {@link defaultValue} function
     * if it is out of bound of the current {@link CollectionHolder collection}
     */
    getLastOrElse(defaultValue: ReturnCallback<T>,): NullOr<T>

    //#endregion -------------------- Get last or else --------------------

    //#region -------------------- Get or null --------------------

    /**
     * Get the element at the specified index in the {@link CollectionHolder collection}
     * or <b>null</b> if it is over the {@link size}
     *
     * @param index The index to retrieve a value
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-null.html Kotlin getOrNull(index)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-null.html Kotlin elementAtOrNull(index)
     * @canReceiveNegativeValue
     */
    getOrNull(index: number,): NullOr<T>

    /**
     * Get the element at the specified index in the {@link CollectionHolder collection}
     * or <b>null</b> if it is over the {@link size}
     *
     * @param index The index to retrieve a value
     * @alias CollectionHolder.getOrNull
     */
    atOrNull(index: number,): NullOr<T>

    /**
     * Get the element at the specified index in the {@link CollectionHolder collection}
     * or <b>null</b> if it is over the {@link size}
     *
     * @param index The index to retrieve a value
     * @alias CollectionHolder.getOrNull
     */
    elementAtOrNull(index: number,): NullOr<T>

    //#endregion -------------------- Get or null --------------------
    //#region -------------------- Get first or null --------------------

    /**
     * Get the first element in the current {@link CollectionHolder collection}
     * or <b>null</b> if it {@link CollectionHolder.isEmpty is empty}
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault()
     */
    getFirstOrNull(): NullOr<T>

    //#endregion -------------------- Get first or null --------------------
    //#region -------------------- Get last or null --------------------

    /**
     * Get the last element in the current {@link CollectionHolder collection}
     * or <b>null</b> if it {@link CollectionHolder.isEmpty is empty}
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault()
     */
    getLastOrNull(): NullOr<T>

    //#endregion -------------------- Get last or null --------------------

    //#region -------------------- First --------------------

    /**
     * Get the first element in the current {@link CollectionHolder collection}
     *
     * @throws EmptyCollectionException The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first()
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/SequencedCollection.html#getFirst() Java getFirst()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First()
     * @alias CollectionHolder.getFirst
     */
    first(): T

    /**
     * Find the first element from the {@link predicate} in the {@link collection}
     *
     * @param predicate The matching predicate
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException No element could be found from the {@link predicate}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
     * @alias CollectionHolder.findFirst
     * @typescriptDefinition
     */
    first<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): S

    /**
     * Find the last element from the {@link predicate} in the {@link collection}
     *
     * @param predicate The matching predicate
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException No element could be found from the {@link predicate}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
     * @alias CollectionHolder.findFirst
     */
    first(predicate: Nullable<BooleanCallback<T>>,): T

    //#endregion -------------------- First --------------------
    //#region -------------------- First or null --------------------

    /**
     * Get the first element in the current {@link CollectionHolder collection}
     * or <b>null</b> if it {@link CollectionHolder.isEmpty is empty}
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault()
     * @alias CollectionHolder.getFirstOrNull
     */
    firstOrNull(): NullOr<T>

    /**
     * Find the first element from the {@link predicate} in the {@link collection}
     * or <b>null</b> otherwise
     *
     * @param predicate The matching predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html Kotlin find(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     * @alias CollectionHolder.findOrNull
     * @typescriptDefinition
     */
    firstOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>

    /**
     * Find the first element from the {@link predicate} in the {@link collection}
     * or <b>null</b> otherwise
     *
     * @param predicate The matching predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html find(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     * @alias CollectionHolder.findOrNull
     */
    firstOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>

    //#endregion -------------------- First or null --------------------
    //#region -------------------- First indexed --------------------

    /**
     * Get the first element in the current {@link CollectionHolder collection}
     *
     * @throws EmptyCollectionException The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first()
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/SequencedCollection.html#getFirst() Java getFirst()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First()
     * @alias CollectionHolder.getFirst
     */
    firstIndexed(): T

    /**
     * Find the first element from the {@link predicate} in the {@link collection}
     *
     * @param predicate The matching predicate
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException No element could be found from the {@link predicate}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
     * @alias CollectionHolder.findFirstIndexed
     * @typescriptDefinition
     */
    firstIndexed<const S extends T, >(predicate: Nullable<ReverseRestrainedBooleanCallback<T, S>>,): S

    /**
     * Find the last element from the {@link predicate} in the {@link collection}
     *
     * @param predicate The matching predicate
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException No element could be found from the {@link predicate}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
     * @alias CollectionHolder.findFirstIndexed
     */
    firstIndexed(predicate: Nullable<ReverseBooleanCallback<T>>,): T

    //#endregion -------------------- First indexed --------------------
    //#region -------------------- First indexed or null --------------------

    /**
     * Get the first element in the current {@link CollectionHolder collection}
     * or <b>null</b> if it {@link CollectionHolder.isEmpty is empty}
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault()
     * @alias CollectionHolder.getFirstOrNull
     */
    firstIndexedOrNull(): NullOr<T>

    /**
     * Find the first element from the {@link predicate} in the {@link collection}
     * or <b>null</b> otherwise
     *
     * @param predicate The matching predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html Kotlin find(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     * @alias CollectionHolder.findFirstIndexedOrNull
     * @typescriptDefinition
     */
    firstIndexedOrNull<const S extends T, >(predicate: Nullable<ReverseRestrainedBooleanCallback<T, S>>,): NullOr<S>

    /**
     * Find the first element from the {@link predicate} in the {@link collection}
     * or <b>null</b> otherwise
     *
     * @param predicate The matching predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html find(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     * @alias CollectionHolder.findFirstIndexedOrNull
     */
    firstIndexedOrNull(predicate: Nullable<ReverseBooleanCallback<T>>,): NullOr<T>

    //#endregion -------------------- First indexed or null --------------------

    //#region -------------------- Last --------------------

    /**
     * Get the last element in the current {@link CollectionHolder collection}
     *
     * @throws EmptyCollectionException The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last()
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/SequencedCollection.html#getLast() Java getLast()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last()
     * @alias CollectionHolder.getLast
     */
    last(): T

    /**
     * Find the last element from the {@link predicate} in the {@link collection}
     *
     * @param predicate The matching predicate
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException No element could be found from the {@link predicate}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
     * @alias CollectionHolder.findLast
     * @typescriptDefinition
     */
    last<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): S

    /**
     * Find the last element from the {@link predicate} in the {@link collection}
     *
     * @param predicate The matching predicate
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException No element could be found from the {@link predicate}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
     * @alias CollectionHolder.findLast
     */
    last(predicate: Nullable<BooleanCallback<T>>,): T

    //#endregion -------------------- Last --------------------
    //#region -------------------- Last or null --------------------

    /**
     * Get the last element in the current {@link CollectionHolder collection}
     * or <b>null</b> if it {@link CollectionHolder.isEmpty is empty}
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault()
     * @alias CollectionHolder.getLastOrNull
     */
    lastOrNull(): NullOr<T>

    /**
     * Find the last element from the {@link predicate} in the current {@link CollectionHolder collection}
     * or <b>null</b> otherwise
     *
     * @param predicate The matching predicate
     * @see ReadonlyArray.findLast
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
     * @alias CollectionHolder.findLastOrNull
     * @typescriptDefinition
     */
    lastOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>

    /**
     * Find the last element from the {@link predicate} in the current {@link CollectionHolder collection}
     * or <b>null</b> otherwise
     *
     * @param predicate The matching predicate
     * @see ReadonlyArray.findLast
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
     * @alias CollectionHolder.findLastOrNull
     */
    lastOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>

    //#endregion -------------------- Last or null --------------------
    //#region -------------------- Last indexed --------------------

    /**
     * Get the last element in the current {@link CollectionHolder collection}
     *
     * @throws EmptyCollectionException The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last()
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/SequencedCollection.html#getLast() Java getLast()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last()
     * @alias CollectionHolder.getLast
     */
    lastIndexed(): T

    /**
     * Find the last element from the {@link predicate} in the {@link collection}
     *
     * @param predicate The matching predicate
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException No element could be found from the {@link predicate}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
     * @alias CollectionHolder.findLastIndexed
     * @typescriptDefinition
     */
    lastIndexed<const S extends T, >(predicate: Nullable<ReverseRestrainedBooleanCallback<T, S>>,): S

    /**
     * Find the last element from the {@link predicate} in the {@link collection}
     *
     * @param predicate The matching predicate
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException No element could be found from the {@link predicate}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
     * @alias CollectionHolder.findLastIndexed
     */
    lastIndexed(predicate: Nullable<ReverseBooleanCallback<T>>,): T

    //#endregion -------------------- Last indexed --------------------
    //#region -------------------- Last indexed or null --------------------

    /**
     * Get the last element in the current {@link CollectionHolder collection}
     * or <b>null</b> if it {@link CollectionHolder.isEmpty is empty}
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault()
     * @alias CollectionHolder.getLastOrNull
     */
    lastIndexedOrNull(): NullOr<T>

    /**
     * Find the last element from the {@link predicate} in the current {@link CollectionHolder collection}
     * or <b>null</b> otherwise
     *
     * @param predicate The matching predicate
     * @see ReadonlyArray.findLast
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
     * @alias CollectionHolder.findLastIndexedOrNull
     * @typescriptDefinition
     */
    lastIndexedOrNull<const S extends T, >(predicate: Nullable<ReverseRestrainedBooleanCallback<T, S>>,): NullOr<S>

    /**
     * Find the last element from the {@link predicate} in the current {@link CollectionHolder collection}
     * or <b>null</b> otherwise
     *
     * @param predicate The matching predicate
     * @see ReadonlyArray.findLast
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
     * @alias CollectionHolder.findLastIndexedOrNull
     */
    lastIndexedOrNull(predicate: Nullable<ReverseBooleanCallback<T>>,): NullOr<T>

    //#endregion -------------------- Last indexed or null --------------------

    //#region -------------------- Find first --------------------

    /**
     * Find the first element from the {@link predicate} in the current {@link CollectionHolder collection}
     *
     * @param predicate The given predicate
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException No element could be found from the {@link predicate}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
     * @typescriptDefinition
     */
    findFirst<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S

    /**
     * Find the first element from the {@link predicate} in the current {@link CollectionHolder collection}
     *
     * @param predicate The given predicate
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException No element could be found from the {@link predicate}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
     */
    findFirst(predicate: BooleanCallback<T>,): T


    /**
     * Find the first element from the {@link predicate} in the current {@link CollectionHolder collection}
     *
     * @param predicate The given predicate
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException No element could be found from the {@link predicate}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
     * @alias CollectionHolder.findFirst
     * @typescriptDefinition
     */
    find<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S

    /**
     * Find the first element from the {@link predicate} in the current {@link CollectionHolder collection}
     *
     * @param predicate The given predicate
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException No element could be found from the {@link predicate}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
     * @alias CollectionHolder.findFirst
     */
    find(predicate: BooleanCallback<T>,): T

    //#endregion -------------------- Find first --------------------
    //#region -------------------- Find first or null --------------------

    /**
     * Find the first element from the {@link predicate} in the current {@link CollectionHolder collection}
     * or <b>null</b> otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html Kotlin find(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     * @typescriptDefinition
     */
    findFirstOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>

    /**
     * Find the first element from the {@link predicate} in the current {@link CollectionHolder collection}
     * or <b>null</b> otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html Kotlin find(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     */
    findFirstOrNull(predicate: BooleanCallback<T>,): NullOr<T>


    /**
     * Find the first element from the {@link predicate} in the current {@link CollectionHolder collection}
     * or <b>null</b> otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html Kotlin find(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     * @alias CollectionHolder.findFirstOrNull
     * @typescriptDefinition
     */
    findOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>

    /**
     * Find the first element from the {@link predicate} in the current {@link CollectionHolder collection}
     * or <b>null</b> otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html Kotlin find(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     * @alias CollectionHolder.findFirstOrNull
     */
    findOrNull(predicate: BooleanCallback<T>,): NullOr<T>

    //#endregion -------------------- Find first or null --------------------
    //#region -------------------- Find first indexed --------------------

    /**
     * Find the first element from the {@link predicate} in the current {@link CollectionHolder collection}
     * or <b>null</b> otherwise
     *
     * @param callback The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
     * @typescriptDefinition
     */
    findFirstIndexed<const S extends T, >(callback: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>

    /**
     * Find the first element from the {@link predicate} in the current {@link CollectionHolder collection}
     * or <b>null</b> otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
     */
    findFirstIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>


    /**
     * Find the first element from the {@link predicate} in the current {@link CollectionHolder collection}
     * or <b>null</b> otherwise
     *
     * @param callback The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
     * @alias CollectionHolder.findFirstIndexed
     * @typescriptDefinition
     */
    findIndexed<const S extends T, >(callback: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>

    /**
     * Find the first element from the {@link predicate} in the current {@link CollectionHolder collection}
     * or <b>null</b> otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
     * @alias CollectionHolder.findFirstIndexed
     */
    findIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>

    //#endregion -------------------- Find first indexed --------------------
    //#region -------------------- Find first indexed or null --------------------

    /**
     * Find the first element from the {@link predicate} in the current {@link CollectionHolder collection}
     * or <b>null</b> otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html Kotlin find(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     * @typescriptDefinition
     */
    findFirstIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>

    /**
     * Find the first element from the {@link predicate} in the current {@link CollectionHolder collection}
     * or <b>null</b> otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html Kotlin find(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     */
    findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>


    /**
     * Find the first element from the {@link predicate} in the current {@link CollectionHolder collection}
     * or <b>null</b> otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html Kotlin find(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     * @alias CollectionHolder.findFirstIndexedOrNull
     * @typescriptDefinition
     */
    findIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>

    /**
     * Find the first element from the {@link predicate} in the current {@link CollectionHolder collection}
     * or <b>null</b> otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html Kotlin find(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     * @alias CollectionHolder.findFirstIndexedOrNull
     */
    findIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>

    //#endregion -------------------- Find first indexed or null --------------------

    //#region -------------------- Find last --------------------

    /**
     * Find the last element from the {@link predicate} in the current {@link CollectionHolder collection}
     *
     * @param predicate The given predicate
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException No element could be found from the {@link predicate}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
     * @typescriptDefinition
     */
    findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S

    /**
     * Find the last element from the {@link predicate} in the current {@link CollectionHolder collection}
     * or <b>null</b> otherwise
     *
     * @param predicate The given predicate
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException No element could be found from the {@link predicate}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
     */
    findLast(predicate: BooleanCallback<T>,): T

    //#endregion -------------------- Find last --------------------
    //#region -------------------- Find last or null --------------------

    /**
     * Find the last element from the {@link predicate} in the current {@link CollectionHolder collection}
     * or <b>null</b> otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.findLast
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
     * @typescriptDefinition
     */
    findLastOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>

    /**
     * Find the last element from the {@link predicate} in the current {@link CollectionHolder collection}
     * or <b>null</b> otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.findLast
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
     */
    findLastOrNull(predicate: BooleanCallback<T>,): NullOr<T>

    //#endregion -------------------- Find last or null --------------------
    //#region -------------------- Find last indexed --------------------

    /**
     * Find the last element from the {@link predicate} in the current {@link CollectionHolder collection}
     *
     * @param predicate The given predicate
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException No element could be found from the {@link predicate}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
     * @typescriptDefinition
     */
    findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S

    /**
     * Find the last element from the {@link predicate} in the current {@link CollectionHolder collection}
     *
     * @param predicate The given predicate
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException No element could be found from the {@link predicate}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
     */
    findLastIndexed(predicate: ReverseBooleanCallback<T>,): T

    //#endregion -------------------- Find last indexed --------------------
    //#region -------------------- Find last indexed or null --------------------

    /**
     * Find the last element from the {@link predicate} in the current {@link CollectionHolder collection}
     * or <b>null</b> otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.findLast
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
     * @typescriptDefinition
     */
    findLastIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>

    /**
     * Find the last element from the {@link predicate} in the current {@link CollectionHolder collection}
     * or <b>null</b> otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.findLast
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
     */
    findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>

    //#endregion -------------------- Find last indexed or null --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    //#region -------------------- First index of --------------------

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     *
     * @param element The element to find
     * @return {number} The first index associated to the {@link element} found
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException No index could be found
     * @see ReadonlyArray.indexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin indexOf(element)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html#indexOf(java.lang.Object) Java indexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item, from?, to?)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    firstIndexOf(element: T,): number

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * between the {@link from starting index} and the end of the current {@link CollectionHolder collection}
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @return {number} The first index associated to the {@link element} found after {@link from}
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException {@link from} is not within a valid range
     * @throws IndexOutOfBoundsException No index could be found
     * @throws ForbiddenIndexException   {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.indexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin indexOf(element)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html#indexOf(java.lang.Object) Java indexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item, from?, to?)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    firstIndexOf(element: T, from: NullableNumber,): number

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * between the {@link from starting} and the {@link to ending} index
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @param to      The inclusive ending index (<code>{@link CollectionHolder.size size} - 1</code> by default)
     * @return {number} The first index associated to the {@link element} found between {@link from} and {@link to}
     * @throws EmptyCollectionException   The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not within a valid range
     * @throws IndexOutOfBoundsException  No index could be found
     * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @throws InvalidIndexRangeException {@link to} is before {@link from} after the calculation
     * @see ReadonlyArray.indexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin indexOf(element)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html#indexOf(java.lang.Object) Java indexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item, from?, to?)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    firstIndexOf(element: T, from: NullableNumber, to: NullableNumber,): number


    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     *
     * @param element The element to find
     * @return {number} The first index associated to the {@link element} found
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException No index could be found
     * @see ReadonlyArray.indexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin indexOf(element)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html#indexOf(java.lang.Object) Java indexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item, from?, to?)
     * @alias CollectionHolder.firstIndexOf
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOf(element: T,): number

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * between the {@link from starting index} and the end of the `collection`
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @return {number} The first index associated to the {@link element} found after {@link from}
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException {@link from} is not within a valid range
     * @throws IndexOutOfBoundsException No index could be found
     * @throws ForbiddenIndexException   {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.indexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin indexOf(element)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html#indexOf(java.lang.Object) Java indexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item, from?, to?)
     * @alias CollectionHolder.firstIndexOf
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOf(element: T, from: NullableNumber,): number

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * between the {@link from starting} and the {@link to ending} index
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @param to      The inclusive ending index (<code>{@link CollectionHolder.size size} - 1</code> by default)
     * @return {number} The first index associated to the {@link element} found between {@link from} and {@link to}
     * @throws EmptyCollectionException   The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not within a valid range
     * @throws IndexOutOfBoundsException  No index could be found
     * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @throws InvalidIndexRangeException {@link to} is before {@link from} after the calculation
     * @see ReadonlyArray.indexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin indexOf(element)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html#indexOf(java.lang.Object) Java indexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item, from?, to?)
     * @alias CollectionHolder.firstIndexOf
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOf(element: T, from: NullableNumber, to: NullableNumber,): number

    //#endregion -------------------- First index of --------------------
    //#region -------------------- First index of or null --------------------

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the current {@link CollectionHolder collection}
     * between the {@link from starting} and the {@link to ending} index
     *
     * @param element   The element to find
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (<code>{@link CollectionHolder.size size} - 1</code> by default)
     * @return {NullOrNumber} The first index associated to the {@link element} found between {@link from} and {@link to} or <b>null</b>
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    firstIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrNumber

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the current {@link CollectionHolder collection}
     * between the {@link from starting} and the {@link to ending} index
     *
     * @param element   The element to find
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (<code>{@link CollectionHolder.size size} - 1</code> by default)
     * @return {NullOrNumber} The first index associated to the {@link element} found between {@link from} and {@link to} or <b>null</b>
     * @alias CollectionHolder.firstIndexOfOrNull
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrNumber

    //#endregion -------------------- First index of or null --------------------

    //#region -------------------- Last index of --------------------

    /**
     * Get the <b>last</b> occurrence equivalent to the value received
     *
     * @param element The element to find
     * @return {number} The last index associated to the {@link element} found
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException No index could be found
     * @see ReadonlyArray.lastIndexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html Kotlin lastIndexOf(element)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object) Java lastIndexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item, from?, to?)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    lastIndexOf(element: T,): number

    /**
     * Get the <b>last</b> occurrence equivalent to the value received
     * between the {@link from starting} and the end of the current {@link CollectionHolder collection}
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @return {number} The last index associated to the {@link element} found after {@link from}
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException {@link from} is not within a valid range
     * @throws IndexOutOfBoundsException No index could be found
     * @throws ForbiddenIndexException   {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.lastIndexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html Kotlin lastIndexOf(element)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object) Java lastIndexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item, from?, to?)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    lastIndexOf(element: T, from: NullableNumber,): number

    /**
     * Get the <b>last</b> occurrence equivalent to the value received
     * between the {@link from starting} and the {@link to ending} index
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @param to      The inclusive ending index (<code>{@link CollectionHolder.size size} - 1</code> by default)
     * @return {number} The last index associated to the {@link element} found between {@link from} and {@link to}
     * @throws EmptyCollectionException   The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not within a valid range
     * @throws IndexOutOfBoundsException  No index could be found
     * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @throws InvalidIndexRangeException {@link to} is before {@link from} after the calculation
     * @see ReadonlyArray.lastIndexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html Kotlin lastIndexOf(element)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object) Java lastIndexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item, from?, to?)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    lastIndexOf(element: T, from: NullableNumber, to: NullableNumber,): number

    //#endregion -------------------- Last index of --------------------
    //#region -------------------- Last index of or null --------------------

    /**
     * Get the <b>last</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the current {@link CollectionHolder collection}
     * between the {@link from starting} and the {@link to ending} index
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @param to      The inclusive ending index (<code>{@link CollectionHolder.size size} - 1</code> by default)
     * @return {NullOrNumber} The last index associated to the {@link element} found between {@link from} and {@link to} or <b>null</b>
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    lastIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrNumber

    //#endregion -------------------- Last index of or null --------------------

    //#region -------------------- Index of first --------------------

    /**
     * Get the first index matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @return {number} The first index found by the {@link predicate}
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException No index could be found
     * @see ReadonlyArray.findIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfFirst(predicate: BooleanCallback<T>,): number

    /**
     * Get the first index matching the {@link predicate}
     * between the {@link from starting index} and the end of the current {@link CollectionHolder collection}
     *
     * @param predicate The given predicate
     * @param from The inclusive starting index (`0` by default)
     * @return {number} The first index found by the {@link predicate} after {@link from}
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException {@link from} is not within a valid range
     * @throws IndexOutOfBoundsException No index could be found
     * @throws ForbiddenIndexException   {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.findIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfFirst(predicate: BooleanCallback<T>, from: NullableNumber,): number

    /**
     * Get the first index matching the {@link predicate}
     * between the {@link from starting} and the {@link to ending} index
     *
     * @param predicate The given predicate
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (<code>{@link CollectionHolder.size size} - 1</code> by default)
     * @return {number} The first index found by the {@link predicate} between {@link from} and {@link to}
     * @throws EmptyCollectionException   The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not within a valid range
     * @throws IndexOutOfBoundsException  No index could be found
     * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @throws InvalidIndexRangeException {@link to} is before {@link from} after the calculation
     * @see ReadonlyArray.findIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfFirst(predicate: BooleanCallback<T>, from: NullableNumber, to: NullableNumber,): number


    /**
     * Get the first index matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @return {number} The first index found by the {@link predicate}
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException No index could be found
     * @see ReadonlyArray.findIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
     * @alias CollectionHolder.indexOfFirst
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    findFirstIndex(predicate: BooleanCallback<T>,): number

    /**
     * Get the first index matching the {@link predicate}
     * between the {@link from starting index} and the end of the current {@link CollectionHolder collection}
     *
     * @param predicate The given predicate
     * @param from The inclusive starting index (`0` by default)
     * @return {number} The first index found by the {@link predicate} after {@link from}
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException {@link from} is not within a valid range
     * @throws IndexOutOfBoundsException No index could be found
     * @throws ForbiddenIndexException   {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.findIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
     * @alias CollectionHolder.indexOfFirst
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    findFirstIndex(predicate: BooleanCallback<T>, from: NullableNumber,): number

    /**
     * Get the first index matching the {@link predicate}
     * between the {@link from starting} and the {@link to ending} index
     *
     * @param predicate The given predicate
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (<code>{@link CollectionHolder.size size} - 1</code> by default)
     * @return {number} The first index found by the {@link predicate} between {@link from} and {@link to}
     * @throws EmptyCollectionException   The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not within a valid range
     * @throws IndexOutOfBoundsException  No index could be found
     * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @throws InvalidIndexRangeException {@link to} is before {@link from} after the calculation
     * @see ReadonlyArray.findIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
     * @alias CollectionHolder.indexOfFirst
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    findFirstIndex(predicate: BooleanCallback<T>, from: NullableNumber, to: NullableNumber,): number


    /**
     * Get the first index matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @return {number} The first index found by the {@link predicate}
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException No index could be found
     * @see ReadonlyArray.findIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
     * @alias CollectionHolder.indexOfFirst
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    findIndex(predicate: BooleanCallback<T>,): number

    /**
     * Get the first index matching the {@link predicate}
     * between the {@link from starting index} and the end of the current {@link CollectionHolder collection}
     *
     * @param predicate The given predicate
     * @param from The inclusive starting index (`0` by default)
     * @return {number} The first index found by the {@link predicate} after {@link from}
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException {@link from} is not within a valid range
     * @throws IndexOutOfBoundsException No index could be found
     * @throws ForbiddenIndexException   {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.findIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
     * @alias CollectionHolder.indexOfFirst
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    findIndex(predicate: BooleanCallback<T>, from: NullableNumber,): number

    /**
     * Get the first index matching the {@link predicate}
     * between the {@link from starting} and the {@link to ending} index
     *
     * @param predicate The given predicate
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (<code>{@link CollectionHolder.size size} - 1</code> by default)
     * @return {number} The first index found by the {@link predicate} between {@link from} and {@link to}
     * @throws EmptyCollectionException   The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not within a valid range
     * @throws IndexOutOfBoundsException  No index could be found
     * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @throws InvalidIndexRangeException {@link to} is before {@link from} after the calculation
     * @see ReadonlyArray.findIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
     * @alias CollectionHolder.indexOfFirst
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    findIndex(predicate: BooleanCallback<T>, from: NullableNumber, to: NullableNumber,): number

    //#endregion -------------------- Index of first --------------------
    //#region -------------------- Index of first or null --------------------

    /**
     * Get the first index matching the {@link predicate}
     * or <b>null</b> if it was not in the current {@link CollectionHolder collection}
     * between the {@link from starting} and the {@link to ending} index
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (<code>{@link CollectionHolder.size size} - 1</code> by default)
     * @return {NullOrNumber} The first index found by the {@link predicate} between {@link from} and {@link to} or <b>null</b>
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfFirstOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber

    /**
     * Get the first index matching the {@link predicate}
     * or <b>null</b> if it was not in the current {@link CollectionHolder collection}
     * between the {@link from starting} and the {@link to ending} index
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (<code>{@link CollectionHolder.size size} - 1</code> by default)
     * @return {NullOrNumber} The first index found by the {@link predicate} between {@link from} and {@link to} or <b>null</b>
     * @alias CollectionHolder.indexOfFirstOrNull
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    findFirstIndexOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber

    /**
     * Get the first index matching the {@link predicate}
     * or <b>null</b> if it was not in the current {@link CollectionHolder collection}
     * between the {@link from starting} and the {@link to ending} index
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (<code>{@link CollectionHolder.size size} - 1</code> by default)
     * @return {NullOrNumber} The first index found by the {@link predicate} between {@link from} and {@link to} or <b>null</b>
     * @alias CollectionHolder.indexOfFirstOrNull
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    findIndexOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber

    //#endregion -------------------- Index of first or null --------------------
    //#region -------------------- Index of first indexed --------------------

    /**
     * Get the first index matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @return {number} The first index found by the {@link predicate}
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException No index could be found
     * @see ReadonlyArray.findIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>,): number

    /**
     * Get the first index matching the {@link predicate}
     * between the {@link from starting index} and the end of the current {@link CollectionHolder collection}
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @return {number} The first index found by the {@link predicate} after {@link from}
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException {@link from} is not within a valid range
     * @throws IndexOutOfBoundsException No index could be found
     * @throws ForbiddenIndexException   {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.findIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, from: NullableNumber,): number

    /**
     * Get the first index matching the {@link predicate}
     * between the {@link from starting} and the {@link to ending} index
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (<code>{@link CollectionHolder.size size} - 1</code> by default)
     * @return {number} The first index found by the {@link predicate} between {@link from} and {@link to}
     * @throws EmptyCollectionException   The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not within a valid range
     * @throws IndexOutOfBoundsException  No index could be found
     * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @throws InvalidIndexRangeException {@link to} is before {@link from} after the calculation
     * @see ReadonlyArray.findIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, from: NullableNumber, to: NullableNumber,): number


    /**
     * Get the first index matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @return {number} The first index found by the {@link predicate}
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException No index could be found
     * @see ReadonlyArray.findIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
     * @alias indexOfFirstIndexed
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    findIndexIndexed(predicate: ReverseBooleanCallback<T>,): number

    /**
     * Get the first index matching the {@link predicate}
     * between the {@link from starting index} and the end of the current {@link CollectionHolder collection}
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @return {number} The first index found by the {@link predicate} after {@link from}
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException {@link from} is not within a valid range
     * @throws IndexOutOfBoundsException No index could be found
     * @throws ForbiddenIndexException   {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.findIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
     * @alias indexOfFirstIndexed
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    findIndexIndexed(predicate: ReverseBooleanCallback<T>, from: NullableNumber,): number

    /**
     * Get the first index matching the {@link predicate}
     * between the {@link from starting} and the {@link to ending} index
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (<code>{@link CollectionHolder.size size} - 1</code> by default)
     * @return {number} The first index found by the {@link predicate} between {@link from} and {@link to}
     * @throws EmptyCollectionException   The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not within a valid range
     * @throws IndexOutOfBoundsException  No index could be found
     * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @throws InvalidIndexRangeException {@link to} is before {@link from} after the calculation
     * @see ReadonlyArray.findIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
     * @alias indexOfFirstIndexed
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    findIndexIndexed(predicate: ReverseBooleanCallback<T>, from: NullableNumber, to: NullableNumber,): number


    /**
     * Get the first index matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @return {number} The first index found by the {@link predicate}
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException No index could be found
     * @see ReadonlyArray.findIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
     * @alias CollectionHolder.indexOfFirstIndexed
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    findFirstIndexIndexed(predicate: ReverseBooleanCallback<T>,): number

    /**
     * Get the first index matching the {@link predicate}
     * between the {@link from starting index} and the end of the current {@link CollectionHolder collection}
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @return {number} The first index found by the {@link predicate} after {@link from}
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException {@link from} is not within a valid range
     * @throws IndexOutOfBoundsException No index could be found
     * @throws ForbiddenIndexException   {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.findIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
     * @alias CollectionHolder.indexOfFirstIndexed
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    findFirstIndexIndexed(predicate: ReverseBooleanCallback<T>, from: NullableNumber,): number

    /**
     * Get the first index matching the {@link predicate}
     * between the {@link from starting} and the {@link to ending} index
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (<code>{@link CollectionHolder.size size} - 1</code> by default)
     * @return {number} The first index found by the {@link predicate} between {@link from} and {@link to}
     * @throws EmptyCollectionException   The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not within a valid range
     * @throws IndexOutOfBoundsException  No index could be found
     * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @throws InvalidIndexRangeException {@link to} is before {@link from} after the calculation
     * @see ReadonlyArray.findIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
     * @alias CollectionHolder.indexOfFirstIndexed
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    findFirstIndexIndexed(predicate: ReverseBooleanCallback<T>, from: NullableNumber, to: NullableNumber,): number

    //#endregion -------------------- Index of first indexed --------------------
    //#region -------------------- Index of first indexed or null --------------------

    /**
     * Get the first index matching the {@link predicate}
     * or <b>null</b> if it was not in the current {@link CollectionHolder collection}
     * between the {@link from starting} and the {@link to ending} index
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (<code>{@link CollectionHolder.size size} - 1</code> by default)
     * @return {NullOrNumber} The first index found by the {@link predicate} between {@link from} and {@link to} or <b>null</b>
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber

    /**
     * Get the first index matching the {@link predicate}
     * or <b>null</b> if it was not in the current {@link CollectionHolder collection}
     * between the {@link from starting} and the {@link to ending} index
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (<code>{@link CollectionHolder.size size} - 1</code> by default)
     * @return {NullOrNumber} The first index found by the {@link predicate} between {@link from} and {@link to} or <b>null</b>
     * @alias CollectionHolder.indexOfFirstIndexed
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    findFirstIndexIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber

    /**
     * Get the first index matching the {@link predicate}
     * or <b>null</b> if it was not in the current {@link CollectionHolder collection}
     * between the {@link from starting} and the {@link to ending} index
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (<code>{@link CollectionHolder.size size} - 1</code> by default)
     * @return {NullOrNumber} The first index found by the {@link predicate} between {@link from} and {@link to} or <b>null</b>
     * @alias CollectionHolder.indexOfFirstIndexed
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    findIndexIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber

    //#endregion -------------------- Index of first indexed or null --------------------

    //#region -------------------- Index of last --------------------

    /**
     * Get the last index matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @return {number} The last index found by the {@link predicate}
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException No index could be found
     * @see ReadonlyArray.findLastIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfLast(predicate: BooleanCallback<T>,): number

    /**
     * Get the last index matching the {@link predicate}
     * between the {@link from starting index} and the end of the current {@link CollectionHolder collection}
     *
     * @param predicate The given predicate
     * @param from The inclusive starting index (`0` by default)
     * @return {number} The last index found by the {@link predicate} after {@link from}
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException {@link from} is not within a valid range
     * @throws IndexOutOfBoundsException No index could be found
     * @throws ForbiddenIndexException   {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.findLastIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfLast(predicate: BooleanCallback<T>, from: NullableNumber,): number

    /**
     * Get the last index matching the {@link predicate}
     * between the {@link from starting} and the {@link to ending} index
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (<code>{@link CollectionHolder.size size} - 1</code> by default)
     * @return {number} The last index found by the {@link predicate} between {@link from} and {@link to}
     * @throws EmptyCollectionException   The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not within a valid range
     * @throws IndexOutOfBoundsException  No index could be found
     * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @throws InvalidIndexRangeException {@link to} is before {@link from} after the calculation
     * @see ReadonlyArray.findLastIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfLast(predicate: BooleanCallback<T>, from: NullableNumber, to: NullableNumber,): number


    /**
     * Get the last index matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @return {number} The last index found by the {@link predicate}
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException No index could be found
     * @see ReadonlyArray.findLastIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
     * @alias CollectionHolder.indexOfLast
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    findLastIndex(predicate: BooleanCallback<T>,): number

    /**
     * Get the last index matching the {@link predicate}
     * between the {@link from starting index} and the end of the current {@link CollectionHolder collection}
     *
     * @param predicate The given predicate
     * @param from The inclusive starting index (`0` by default)
     * @return {number} The last index found by the {@link predicate} after {@link from}
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException {@link from} is not within a valid range
     * @throws IndexOutOfBoundsException No index could be found
     * @throws ForbiddenIndexException   {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.findLastIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
     * @alias CollectionHolder.indexOfLast
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    findLastIndex(predicate: BooleanCallback<T>, from: NullableNumber,): number

    /**
     * Get the last index matching the {@link predicate}
     * between the {@link from starting} and the {@link to ending} index
     *
     * @param predicate The given predicate
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (<code>{@link CollectionHolder.size size} - 1</code> by default)
     * @return {number} The last index found by the {@link predicate} between {@link from} and {@link to}
     * @throws EmptyCollectionException   The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not within a valid range
     * @throws IndexOutOfBoundsException  No index could be found
     * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @throws InvalidIndexRangeException {@link to} is before {@link from} after the calculation
     * @see ReadonlyArray.findLastIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
     * @alias CollectionHolder.indexOfLast
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    findLastIndex(predicate: BooleanCallback<T>, from: NullableNumber, to: NullableNumber,): number

    //#endregion -------------------- Index of last --------------------
    //#region -------------------- Index of last or null --------------------

    /**
     * Get the last index matching the {@link predicate}
     * or <b>null</b> if it was not in the current {@link CollectionHolder collection}
     * between the {@link from starting} and the {@link to ending} index
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (<code>{@link CollectionHolder.size size} - 1</code> by default)
     * @return {NullOrNumber} The last index found by the {@link predicate} between {@link from} and {@link to} or <b>null</b>
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfLastOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber

    /**
     * Get the last index matching the {@link predicate}
     * or <b>null</b> if it was not in the current {@link CollectionHolder collection}
     * between the {@link from starting} and the {@link to ending} index
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (<code>{@link CollectionHolder.size size} - 1</code> by default)
     * @return {NullOrNumber} The last index found by the {@link predicate} between {@link from} and {@link to} or <b>null</b>
     * @alias CollectionHolder.indexOfLastOrNull
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    findLastIndexOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber

    //#endregion -------------------- Index of last or null --------------------
    //#region -------------------- Index of last indexed --------------------

    /**
     * Get the last index matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @return {number} The last index found by the {@link predicate}
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException No index could be found
     * @see ReadonlyArray.findLastIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfLastIndexed(predicate: ReverseBooleanCallback<T>,): number

    /**
     * Get the last index matching the {@link predicate}
     * between the {@link from starting index} and the end of the current {@link CollectionHolder collection}
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @return {number} The last index found by the {@link predicate} after {@link from}
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException {@link from} is not within a valid range
     * @throws IndexOutOfBoundsException No index could be found
     * @throws ForbiddenIndexException   {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.findLastIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, from: NullableNumber,): number

    /**
     * Get the last index matching the {@link predicate}
     * between the {@link from starting} and the {@link to ending} index
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (<code>{@link CollectionHolder.size size} - 1</code> by default)
     * @return {number} The last index found by the {@link predicate} between {@link from} and {@link to}
     * @throws EmptyCollectionException   The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not within a valid range
     * @throws IndexOutOfBoundsException  No index could be found
     * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @throws InvalidIndexRangeException {@link to} is before {@link from} after the calculation
     * @see ReadonlyArray.findLastIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, from: NullableNumber, to: NullableNumber,): number


    /**
     * Get the last index matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @return {number} The last index found by the {@link predicate}
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException No index could be found
     * @see ReadonlyArray.findLastIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
     * @alias CollectionHolder.indexOfLastIndexed
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    findLastIndexIndexed(predicate: ReverseBooleanCallback<T>,): number

    /**
     * Get the last index matching the {@link predicate}
     * between the {@link from starting index} and the end of the current {@link CollectionHolder collection}
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @return {number} The last index found by the {@link predicate} after {@link from}
     * @throws EmptyCollectionException  The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException {@link from} is not within a valid range
     * @throws IndexOutOfBoundsException No index could be found
     * @throws ForbiddenIndexException   {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.findLastIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
     * @alias CollectionHolder.indexOfLastIndexed
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    findLastIndexIndexed(predicate: ReverseBooleanCallback<T>, from: NullableNumber,): number

    /**
     * Get the last index matching the {@link predicate}
     * between the {@link from starting} and the {@link to ending} index
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (<code>{@link CollectionHolder.size size} - 1</code> by default)
     * @return {number} The last index found by the {@link predicate} between {@link from} and {@link to}
     * @throws EmptyCollectionException   The current {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not within a valid range
     * @throws IndexOutOfBoundsException  No index could be found
     * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @throws InvalidIndexRangeException {@link to} is before {@link from} after the calculation
     * @see ReadonlyArray.findLastIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
     * @alias CollectionHolder.indexOfLastIndexed
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    findLastIndexIndexed(predicate: ReverseBooleanCallback<T>, from: NullableNumber, to: NullableNumber,): number

    //#endregion -------------------- Index of last indexed --------------------
    //#region -------------------- Index of last indexed or null --------------------

    /**
     * Get the last index matching the {@link predicate}
     * or <b>null</b> if it was not in the current {@link CollectionHolder collection}
     * between the {@link from starting} and the {@link to ending} index
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (<code>{@link CollectionHolder.size size} - 1</code> by default)
     * @return {NullOrNumber} The last index found by the {@link predicate} between {@link from} and {@link to} or <b>null</b>
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfLastIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber

    /**
     * Get the last index matching the {@link predicate}
     * or <b>null</b> if it was not in the current {@link CollectionHolder collection}
     * between the {@link from starting} and the {@link to ending} index
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (<code>{@link CollectionHolder.size size} - 1</code> by default)
     * @return {NullOrNumber} The last index found by the {@link predicate} between {@link from} and {@link to} or <b>null</b>
     * @alias CollectionHolder.indexOfLastIndexedOrNull
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    findLastIndexIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber

    //#endregion -------------------- Index of last indexed or null --------------------

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    //#region -------------------- All --------------------

    /**
     * Check if <b>every</b> element in the current {@link CollectionHolder collection}
     * match the given {@link predicate}
     *
     * @param predicate The matching predicate
     * @return {boolean} <b>true</b> only if is empty or if every value in the current {@link CollectionHolder collection} is applicable to the {@link predicate}
     * @see ReadonlyArray.every
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/all.html Kotlin all(predicate)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#allMatch(java.util.function.Predicate) Java allMatch(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.all C# All(predicate)
     * @typescriptDefinition
     */
    all<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolder<S>

    /**
     * Check if <b>every</b> element in the current {@link CollectionHolder collection}
     * match the given {@link predicate}
     *
     * @param predicate The matching predicate
     * @return {boolean} <b>true</b> only if is empty or if every value in the current {@link CollectionHolder collection} is applicable to the {@link predicate}
     * @see ReadonlyArray.every
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/all.html Kotlin all(predicate)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#allMatch(java.util.function.Predicate) Java allMatch(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.all C# All(predicate)
     */
    all(predicate: BooleanCallback<T>,): boolean


    /**
     * Check if <b>every</b> element in the current {@link CollectionHolder collection}
     * match the given {@link predicate}
     *
     * @param predicate The matching predicate
     * @return {boolean} <b>true</b> only if is empty or if every value in the current {@link CollectionHolder collection} is applicable to the {@link predicate}
     * @see ReadonlyArray.every
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/all.html Kotlin all(predicate)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#allMatch(java.util.function.Predicate) Java allMatch(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.all C# All(predicate)
     * @alias CollectionHolder.all
     * @typescriptDefinition
     */
    every<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolder<S>

    /**
     * Check if <b>every</b> element in the current {@link CollectionHolder collection}
     * match the given {@link predicate}
     *
     * @param predicate The matching predicate
     * @return {boolean} <b>true</b> only if is empty or if every value in the current {@link CollectionHolder collection} is applicable to the {@link predicate}
     * @see ReadonlyArray.every
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/all.html Kotlin all(predicate)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#allMatch(java.util.function.Predicate) Java allMatch(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.all C# All(predicate)
     * @alias CollectionHolder.all
     */
    every(predicate: BooleanCallback<T>,): boolean

    //#endregion -------------------- All --------------------
    //#region -------------------- Any --------------------

    /**
     * Tell if the current {@link CollectionHolder collection} {@link CollectionHolder.isNotEmpty is not empty}
     *
     * @return {boolean} {@link CollectionHolder.isNotEmpty}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/any.html Kotlin any()
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#findAny() Java findAny()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any C# Any()
     * @alias CollectionHolder.isNotEmpty
     */
    any(): this["isNotEmpty"]

    /**
     * Check if <b>one</b> of the elements in the current {@link CollectionHolder collection}
     * match the given {@link predicate}
     *
     * @param predicate The condition to check on each value
     * @return {boolean} <b>true</b> if at least one {@link predicate} is <b>true</b> on a value of the current {@link CollectionHolder collection}
     * @see ReadonlyArray.some
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/any.html Kotlin any(predicate)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#anyMatch(java.util.function.Predicate) Java anyMatch(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any C# Any(predicate)
     */
    any(predicate: Nullable<BooleanCallback<T>>,): boolean


    /**
     * Tell if the current {@link CollectionHolder collection} {@link CollectionHolder.isNotEmpty is not empty}
     *
     * @return {boolean} {@link CollectionHolder.isNotEmpty}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/any.html Kotlin any()
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#findAny() Java findAny()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any C# Any()
     * @alias CollectionHolder.isNotEmpty
     */
    some(): this["isNotEmpty"]

    /**
     * Check if <b>one</b> of the elements in the current {@link CollectionHolder collection}
     * match the given {@link predicate}
     *
     * @param predicate The condition to check on each value
     * @return {boolean} <b>true</b> if at least one {@link predicate} is <b>true</b> on a value of the current {@link CollectionHolder collection}
     * @see ReadonlyArray.some
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/any.html Kotlin any(predicate)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#anyMatch(java.util.function.Predicate) Java anyMatch(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any C# Any(predicate)
     * @alias CollectionHolder.any
     */
    some(predicate: Nullable<BooleanCallback<T>>,): boolean

    //#endregion -------------------- All --------------------
    //#region -------------------- None --------------------

    /**
     * Tell if the current {@link CollectionHolder collection} {@link isEmpty is empty}
     *
     * @return {boolean} {@link CollectionHolder.isEmpty}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/none.html Kotlin none()
     * @alias CollectionHolder.isEmpty
     */
    none(): this["isEmpty"]

    /**
     * Check if <b>no</b> element in the current {@link CollectionHolder collection}
     * match the given {@link predicate}
     *
     * @param predicate The condition to check on each value
     * @return {boolean} <b>false</b> if at least one {@link predicate} is <b>true</b> on a value of the current {@link CollectionHolder collection}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/none.html Kotlin none(predicate)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#noneMatch(java.util.function.Predicate) Java noneMatch(predicate)
     */
    none(predicate: Nullable<BooleanCallback<T>>,): boolean

    //#endregion -------------------- None --------------------

    //#region -------------------- Has null --------------------

    /**
     * The {@link CollectionHolder} has at least one <b>null</b> or <b>undefined</b>
     *
     * @return {boolean} <b>true</b> only if one element is <b>null</b> or <b>undefined</b>
     */
    get hasNull(): boolean

    /**
     * The {@link CollectionHolder} has at least one <b>null</b> or <b>undefined</b>
     *
     * @alias CollectionHolder.hasNull
     * @return {boolean} <b>true</b> only if one element is <b>null</b> or <b>undefined</b>
     */
    get includesNull(): this["hasNull"]

    /**
     * The {@link CollectionHolder} has at least one <b>null</b> or <b>undefined</b>
     *
     * @alias CollectionHolder.hasNull
     * @return {boolean} <b>true</b> only if one element is <b>null</b> or <b>undefined</b>
     */
    get containsNull(): this["hasNull"]

    //#endregion -------------------- Has null --------------------
    //#region -------------------- Has no nulls --------------------

    /**
     * The {@link CollectionHolder} has no <b>null</b> or <b>undefined</b>
     *
     * @return {boolean} <b>true</b> only if no element is <b>null</b> or <b>undefined</b>
     */
    get hasNoNulls(): boolean

    /**
     * The {@link CollectionHolder} has no <b>null</b> or <b>undefined</b>
     *
     * @alias CollectionHolder.hasNoNulls
     * @return {boolean} <b>true</b> only if no element is <b>null</b> or <b>undefined</b>
     */
    get includesNoNulls(): this["hasNoNulls"]

    /**
     * The {@link CollectionHolder} has no <b>null</b> or <b>undefined</b>
     *
     * @alias CollectionHolder.hasNoNulls
     * @return {boolean} <b>true</b> only if no element is <b>null</b> or <b>undefined</b>
     */
    get containsNoNulls(): this["hasNoNulls"]

    //#endregion -------------------- Has no nulls --------------------
    //#region -------------------- Has duplicate --------------------

    /**
     * The {@link CollectionHolder} has at least one duplicate value
     *
     * @return {boolean} <b>true</b> only if one element is equal (===) to another one
     */
    get hasDuplicate(): boolean

    /**
     * The {@link CollectionHolder} has at least one duplicate value
     *
     * @alias CollectionHolder.hasDuplicate
     * @return {boolean} <b>true</b> only if one element is equal (===) to another one
     */
    get includesDuplicate(): this["hasDuplicate"]

    /**
     * The {@link CollectionHolder} has at least one duplicate value
     *
     * @alias CollectionHolder.hasDuplicate
     * @return {boolean} <b>true</b> only if one element is equal (===) to another one
     */
    get containsDuplicate(): this["hasDuplicate"]

    //#endregion -------------------- Has duplicate --------------------
    //#region -------------------- Has no duplicates --------------------

    /**
     * The {@link CollectionHolder} has no duplicated value
     *
     * @return {boolean} <b>true</b> only if no element is equal (===) to another one
     */
    get hasNoDuplicates(): boolean

    /**
     * The {@link CollectionHolder} has no duplicated value
     *
     * @alias CollectionHolder.hasNoDuplicates
     * @return {boolean} <b>true</b> only if no element is equal (===) to another one
     */
    get includesNoDuplicates(): this["hasNoDuplicates"]

    /**
     * The {@link CollectionHolder} has no duplicated value
     *
     * @alias CollectionHolder.hasNoDuplicates
     * @return {boolean} <b>true</b> only if no element is equal (===) to another one
     */
    get containsNoDuplicates(): this["hasNoDuplicates"]

    //#endregion -------------------- Has no duplicates --------------------

    //#region -------------------- Has --------------------

    /**
     * Tell whenever the {@link value} exist in the current {@link CollectionHolder collection}
     *
     * @param value The value to compare
     * @return {boolean} <b>true</b> if the {@link value} is present in the current {@link CollectionHolder collection}
     * @see ReadonlyArray.includes
     * @see ReadonlySet.has
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains.html Kotlin contains(value)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/containsValue.html Kotlin Map.containsValue(value)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#contains(java.lang.Object) Java Collection.contains(value)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html#containsValue(java.lang.Object) Java Map.containsValue(value)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.contains C# contains(value)
     */
    has(value: T,): boolean

    /**
     * Tell whenever the {@link value} exist in the current {@link CollectionHolder collection}
     *
     * @param value The value to compare
     * @return {boolean} <b>true</b> if the {@link value} is present in the current {@link CollectionHolder collection}
     * @see ReadonlyArray.includes
     * @see ReadonlySet.has
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains.html Kotlin contains(value)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/containsValue.html Kotlin Map.containsValue(value)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#contains(java.lang.Object) Java Collection.contains(value)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html#containsValue(java.lang.Object) Java Map.containsValue(value)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.contains C# contains(value)
     * @alias CollectionHolder.has
     */
    includes(value: T,): boolean

    /**
     * Tell whenever the {@link value} exist in the current {@link CollectionHolder collection}
     *
     * @param value The value to compare
     * @return {boolean} <b>true</b> if the {@link value} is present in the current {@link CollectionHolder collection}
     * @see ReadonlyArray.includes
     * @see ReadonlySet.has
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains.html Kotlin contains(value)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/containsValue.html Kotlin Map.containsValue(value)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#contains(java.lang.Object) Java Collection.contains(value)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html#containsValue(java.lang.Object) Java Map.containsValue(value)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.contains C# contains(value)
     * @alias CollectionHolder.has
     */
    contains(value: T,): boolean

    //#endregion -------------------- Has --------------------
    //#region -------------------- Has not --------------------

    /**
     * Tell whenever the {@link value} <b>does not</b> exist in the current {@link CollectionHolder collection}
     *
     * @param value The value to compare
     * @return {boolean} <b>true</b> if the {@link value} is not present in the current {@link CollectionHolder collection}
     */
    hasNot(value: T,): boolean

    /**
     * Tell whenever the {@link value} <b>does not</b> exist in the current {@link CollectionHolder collection}
     *
     * @param value The value to compare
     * @return {boolean} <b>false</b> if the {@link value} is not present in the current {@link CollectionHolder collection}
     * @alias CollectionHolder.hasNot
     */
    includesNot(value: T,): boolean

    /**
     * Tell whenever the {@link value} <b>does not</b> exist in the current {@link CollectionHolder collection}
     *
     * @param value The value to compare
     * @return {boolean} <b>false</b> if the {@link value} is not present in the current {@link CollectionHolder collection}
     * @alias CollectionHolder.hasNot
     */
    containsNot(value: T,): boolean

    //#endregion -------------------- Has not --------------------
    //#region -------------------- Has one --------------------

    /**
     * Tell that one of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     */
    hasOne(values: readonly T[],): boolean

    /**
     * Tell that one of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     */
    hasOne(values: ReadonlySet<T>,): boolean

    /**
     * Tell that one of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     */
    hasOne(values: CollectionHolder<T>,): boolean

    /**
     * Tell that one of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     */
    hasOne(values: MinimalistCollectionHolder<T>,): boolean

    /**
     * Tell that one of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     */
    hasOne(values: CollectionIterator<T>,): boolean

    /**
     * Tell that one of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     */
    hasOne(values: Iterator<T, unknown, unknown>,): boolean

    /**
     * Tell that one of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     */
    hasOne(values: Iterable<T, unknown, unknown>,): boolean

    /**
     * Tell that one of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @typescriptDefinition
     */
    hasOne(values: PossibleIterableIteratorArraySetOrCollectionHolder<T>,): boolean

    //#region -------------------- Has one methods (aliases) --------------------

    /**
     * Tell whenever at least one exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias CollectionHolder.hasOne
     */
    includesOne(values: readonly T[],): boolean

    /**
     * Tell that one of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias CollectionHolder.hasOne
     */
    includesOne(values: ReadonlySet<T>,): boolean

    /**
     * Tell that one of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias CollectionHolder.hasOne
     */
    includesOne(values: CollectionHolder<T>,): boolean

    /**
     * Tell that one of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias CollectionHolder.hasOne
     */
    includesOne(values: MinimalistCollectionHolder<T>,): boolean

    /**
     * Tell that one of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias CollectionHolder.hasOne
     */
    includesOne(values: CollectionIterator<T>,): boolean

    /**
     * Tell that one of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias CollectionHolder.hasOne
     */
    includesOne(values: Iterator<T, unknown, unknown>,): boolean

    /**
     * Tell that one of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias CollectionHolder.hasOne
     */
    includesOne(values: Iterable<T, unknown, unknown>,): boolean

    /**
     * Tell that one of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias CollectionHolder.hasOne
     * @typescriptDefinition
     */
    includesOne(values: PossibleIterableIteratorArraySetOrCollectionHolder<T>,): boolean


    /**
     * Tell that one of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias CollectionHolder.hasOne
     */
    containsOne(values: readonly T[],): boolean

    /**
     * Tell that one of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias CollectionHolder.hasOne
     */
    containsOne(values: ReadonlySet<T>,): boolean

    /**
     * Tell that one of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias CollectionHolder.hasOne
     */
    containsOne(values: CollectionHolder<T>,): boolean

    /**
     * Tell that one of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias CollectionHolder.hasOne
     */
    containsOne(values: MinimalistCollectionHolder<T>,): boolean

    /**
     * Tell that one of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias CollectionHolder.hasOne
     */
    containsOne(values: CollectionIterator<T>,): boolean

    /**
     * Tell that one of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias CollectionHolder.hasOne
     */
    containsOne(values: Iterator<T, unknown, unknown>,): boolean

    /**
     * Tell that one of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias CollectionHolder.hasOne
     */
    containsOne(values: Iterable<T, unknown, unknown>,): boolean

    /**
     * Tell that one of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias CollectionHolder.hasOne
     * @typescriptDefinition
     */
    containsOne(values: PossibleIterableIteratorArraySetOrCollectionHolder<T>,): boolean

    //#endregion -------------------- Has one methods (aliases) --------------------

    //#endregion -------------------- Has one --------------------
    //#region -------------------- Has all --------------------

    /**
     * Tell that all the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
     */
    hasAll(values: readonly T[],): boolean

    /**
     * Tell that all the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
     */
    hasAll(values: ReadonlySet<T>,): boolean

    /**
     * Tell that all the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
     */
    hasAll(values: CollectionHolder<T>,): boolean

    /**
     * Tell that all the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
     */
    hasAll(values: MinimalistCollectionHolder<T>,): boolean

    /**
     * Tell that all the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
     */
    hasAll(values: CollectionIterator<T>,): boolean

    /**
     * Tell that all the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
     */
    hasAll(values: Iterator<T, unknown, unknown>,): boolean

    /**
     * Tell that all the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
     */
    hasAll(values: Iterable<T, unknown, unknown>,): boolean

    /**
     * Tell that all the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
     * @typescriptDefinition
     */
    hasAll(values: PossibleIterableIteratorArraySetOrCollectionHolder<T>,): boolean

    //#region -------------------- Has all methods (aliases) --------------------

    /**
     * Tell that all the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias CollectionHolder.hasAll
     */
    includesAll(values: readonly T[],): boolean

    /**
     * Tell that all the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias CollectionHolder.hasAll
     */
    includesAll(values: ReadonlySet<T>,): boolean

    /**
     * Tell that all the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias CollectionHolder.hasAll
     */
    includesAll(values: CollectionHolder<T>,): boolean

    /**
     * Tell that all the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias CollectionHolder.hasAll
     */
    includesAll(values: MinimalistCollectionHolder<T>,): boolean

    /**
     * Tell that all the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias CollectionHolder.hasAll
     */
    includesAll(values: CollectionIterator<T>,): boolean

    /**
     * Tell that all the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias CollectionHolder.hasAll
     */
    includesAll(values: Iterator<T, unknown, unknown>,): boolean

    /**
     * Tell that all the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias CollectionHolder.hasAll
     */
    includesAll(values: Iterable<T, unknown, unknown>,): boolean

    /**
     * Tell that all the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias CollectionHolder.hasAll
     * @typescriptDefinition
     */
    includesAll(values: PossibleIterableIteratorArraySetOrCollectionHolder<T>,): boolean


    /**
     * Tell that all the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias CollectionHolder.hasAll
     */
    containsAll(values: readonly T[],): boolean

    /**
     * Tell that all the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias CollectionHolder.hasAll
     */
    containsAll(values: ReadonlySet<T>,): boolean

    /**
     * Tell that all the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias CollectionHolder.hasAll
     */
    containsAll(values: CollectionHolder<T>,): boolean

    /**
     * Tell that all the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias CollectionHolder.hasAll
     */
    containsAll(values: MinimalistCollectionHolder<T>,): boolean

    /**
     * Tell that all the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias CollectionHolder.hasAll
     */
    containsAll(values: CollectionIterator<T>,): boolean

    /**
     * Tell that all the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias CollectionHolder.hasAll
     */
    containsAll(values: Iterator<T, unknown, unknown>,): boolean

    /**
     * Tell that all the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias CollectionHolder.hasAll
     */
    containsAll(values: Iterable<T, unknown, unknown>,): boolean

    /**
     * Tell that all the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias CollectionHolder.hasAll
     * @typescriptDefinition
     */
    containsAll(values: PossibleIterableIteratorArraySetOrCollectionHolder<T>,): boolean

    //#endregion -------------------- Has all methods (aliases) --------------------

    //#endregion -------------------- Has all --------------------

    //#region -------------------- Require no nulls --------------------

    /**
     * Require that no items are <b>null</b> or <b>undefined</b> in the current {@link CollectionHolder collection}
     *
     * @throws TypeError There is <b>null</b> or <b>undefined</b> value in the current collection
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
     * @see CollectionHolder.filterNotNull
     * @return {this} The current {@link SortableCollectionHolder collection}
     */
    requireNoNulls(): CollectionHolder<NonNullable<T>>

    //#endregion -------------------- Require no nulls --------------------

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    /**
     * Get a new {@link CollectionHolder collection}
     * matching only the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.filter
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter.html Kotlin filter(predicate)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java filter(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
     * @see filterNot
     * @typescriptDefinition
     */
    filter<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder collection}
     * matching only the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.filter
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter.html Kotlin filter(predicate)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java filter(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
     * @see filterNot
     */
    filter(predicate: BooleanCallback<T>,): CollectionHolder<T>

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Filter indexed --------------------

    /**
     * Get a new {@link CollectionHolder collection}
     * matching only the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.filter
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-indexed.html Kotlin filterIndexed(predicate)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java filter(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
     * @see filterNotIndexed
     * @typescriptDefinition
     */
    filterIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder collection}
     * matching only the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.filter
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-indexed.html Kotlin filterIndexed(predicate)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java filter(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
     * @see filterNotIndexed
     */
    filterIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>

    //#endregion -------------------- Filter indexed --------------------

    //#region -------------------- Filter not --------------------

    /**
     * Get a new {@link CollectionHolder}
     * not matching the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.filter
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-not.html Kotlin filterNot(predicate)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java filter(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
     * @see filter
     * @typescriptDefinition
     */
    filterNot<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>

    /**
     * Get a new {@link CollectionHolder}
     * not matching the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.filter
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-not.html Kotlin filterNot(predicate)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java filter(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
     * @see filter
     */
    filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T>

    //#endregion -------------------- Filter not --------------------
    //#region -------------------- Filter not indexed --------------------

    /**
     * Get a new {@link CollectionHolder}
     * not matching the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.filter
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-not.html Kotlin filterNot(predicate)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java filter(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
     * @see filterIndexed
     * @typescriptDefinition
     */
    filterNotIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>

    /**
     * Get a new {@link CollectionHolder}
     * not matching the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.filter
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-not.html Kotlin filterNot(predicate)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java filter(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
     * @see filterIndexed
     */
    filterNotIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>

    //#endregion -------------------- Filter not indexed --------------------

    //#region -------------------- Filter not null --------------------

    /**
     * Get a new {@link CollectionHolder} without <b>null</b> or <b>undefined</b>
     *
     * @see ReadonlyArray.filter
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-not-null.html Kotlin filterNotNull()
     * @see requireNoNulls
     */
    filterNotNull(): CollectionHolder<NonNullable<T>>

    //#endregion -------------------- Filter not null --------------------

    //#region -------------------- Slice --------------------

    //#region -------------------- Slice (from, to) --------------------

    /**
     * Create a new {@link CollectionHolder}
     * with all the values from the current {@link CollectionHolder collection}
     *
     * @see ReadonlyArray.slice
     * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
     */
    slice(): CollectionHolder<T>

    /**
     * Create a new {@link CollectionHolder}
     * from the {@link from starting index} to the end of the current {@link CollectionHolder collection}
     *
     * @param from The inclusive starting index (`0` by default)
     * @throws IndexOutOfBoundsException {@link from} is not within the current {@link CollectionHolder collection} {@link size}
     * @throws ForbiddenIndexException   {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.slice
     * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
     */
    slice(from: NullableNumber,): CollectionHolder<T>

    /**
     * Create a new {@link CollectionHolder}
     * from the {@link from starting} to the {@link to ending} index in the current {@link CollectionHolder collection}
     *
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (<code>{@link CollectionHolder.size size} - 1</code> by default)
     * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not within the current {@link CollectionHolder collection} {@link size}
     * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @throws InvalidIndexRangeException {@link to} is before the {@link from} after the calculation
     * @see ReadonlyArray.slice
     * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
     */
    slice(from: NullableNumber, to: NullableNumber,): CollectionHolder<T>

    //#endregion -------------------- Slice (from, to) --------------------
    //#region -------------------- Slice (indice) --------------------

    /**
     * Create a new {@link CollectionHolder} from the {@link indices}
     * in the current {@link CollectionHolder collection}
     *
     * @param indices The given indices
     * @throws IndexOutOfBoundsException An indice is not in the current {@link CollectionHolder collection}
     * @throws ForbiddenIndexException   An indice a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
     */
    slice(indices: readonly number[],): CollectionHolder<T>

    /**
     * Create a new {@link CollectionHolder} from the {@link indices}
     * in the current {@link CollectionHolder collection}
     *
     * @param indices The given indices
     * @throws IndexOutOfBoundsException An indice is not in the current {@link CollectionHolder collection}
     * @throws ForbiddenIndexException   An indice a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     */
    slice(indices: ReadonlySet<number>,): CollectionHolder<T>

    /**
     * Create a new {@link CollectionHolder} from the {@link indices}
     * in the current {@link CollectionHolder collection}
     *
     * @param indices The given indices
     * @throws IndexOutOfBoundsException An indice is not in the current {@link CollectionHolder collection}
     * @throws ForbiddenIndexException   An indice a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     */
    slice(indices: CollectionHolder<number>,): CollectionHolder<T>

    /**
     * Create a new {@link CollectionHolder} from the {@link indices}
     * in the current {@link CollectionHolder collection}
     *
     * @param indices The given indices
     * @throws IndexOutOfBoundsException An indice is not in the current {@link CollectionHolder collection}
     * @throws ForbiddenIndexException   An indice a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     */
    slice(indices: MinimalistCollectionHolder<number>,): CollectionHolder<T>

    /**
     * Create a new {@link CollectionHolder} from the {@link indices}
     * in the current {@link CollectionHolder collection}
     *
     * @param indices The given indices
     * @throws IndexOutOfBoundsException An indice is not in the current {@link CollectionHolder collection}
     * @throws ForbiddenIndexException   An indice a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     */
    slice(indices: CollectionIterator<number>,): CollectionHolder<T>

    /**
     * Create a new {@link CollectionHolder} from the {@link indices}
     * in the current {@link CollectionHolder collection}
     *
     * @param indices The given indices
     * @throws IndexOutOfBoundsException An indice is not in the current {@link CollectionHolder collection}
     * @throws ForbiddenIndexException   An indice a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     */
    slice(indices: Iterator<number, unknown, unknown>,): CollectionHolder<T>

    /**
     * Create a new {@link CollectionHolder} from the {@link indices}
     * in the current {@link CollectionHolder collection}
     *
     * @param indices The given indices
     * @throws IndexOutOfBoundsException An indice is not in the current {@link CollectionHolder collection}
     * @throws ForbiddenIndexException   An indice a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     */
    slice(indices: Iterable<number, unknown, unknown>,): CollectionHolder<T>

    /**
     * Create a new {@link CollectionHolder} from the {@link indices}
     * in the current {@link CollectionHolder collection}
     *
     * @param indices The given indices
     * @throws IndexOutOfBoundsException An indice is not in the current {@link CollectionHolder collection}
     * @throws ForbiddenIndexException   An indice a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     * @typescriptDefinition
     */
    slice(indices: PossibleIterableIteratorArraySetOrCollectionHolder<number>,): CollectionHolder<T>

    //#endregion -------------------- Slice (indice) --------------------

    /**
     * Create a new {@link CollectionHolder} from the {@link indicesOrFrom indices}
     * or from the {@link indicesOrFrom starting} to {@link to ending} index
     * in the current {@link CollectionHolder collection}
     *
     * @param indicesOrFrom The given indices (or inclusive starting index)
     * @param to            The inclusive ending index
     * @throws IndexOutOfBoundsException  {@link indicesOrFrom from} or {@link to} are not within the {@link collection} {@link MinimalistCollectionHolder.size size}
     * @throws IndexOutOfBoundsException  An indice is not in the {@link collection}
     * @throws ForbiddenIndexException    {@link indicesOrFrom from} or {@link to} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @throws InvalidIndexRangeException {@link to} is before {@link indicesOrFrom from} after the calculation
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
     * @typescriptDefinition
     */
    slice(indicesOrFrom?: Nullable<| PossibleIterableIteratorArraySetOrCollectionHolder<number> | number>, to?: NullableNumber,): CollectionHolder<T>

    //#endregion -------------------- Slice --------------------

    //#region -------------------- Take --------------------

    /**
     * Get a new {@link CollectionHolder} from the first {@link n} elements
     *
     * @param n The number of arguments (if negative, then it is plus {@link size})
     * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take.html Kotlin take(n)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#limit(long) Java limit(n)
     * @canReceiveNegativeValue
     */
    take(n: number,): CollectionHolder<T>

    /**
     * Get a new {@link CollectionHolder} from the first {@link n} elements
     *
     * @param n The number of arguments (if negative, then it is plus {@link size})
     * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take.html Kotlin take(n)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#limit(long) Java limit(n)
     * @canReceiveNegativeValue
     * @alias CollectionHolder.take
     */
    limit(n: number,): CollectionHolder<T>

    //#endregion -------------------- Take --------------------
    //#region -------------------- Take while --------------------

    /**
     * Get a new {@link CollectionHolder} having the first elements satisfying the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-while.html Kotlin takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#takeWhile(java.util.function.Predicate) Java takeWhile(predicate)
     * @typescriptDefinition
     */
    takeWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} having the first elements satisfying the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-while.html Kotlin takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#takeWhile(java.util.function.Predicate) Java takeWhile(predicate)
     */
    takeWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>


    /**
     * Get a new {@link CollectionHolder} having the first elements satisfying the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-while.html Kotlin takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#takeWhile(java.util.function.Predicate) Java takeWhile(predicate)
     * @typescriptDefinition
     * @alias CollectionHolder.takeWhile
     */
    limitWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} having the first elements satisfying the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-while.html Kotlin takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#takeWhile(java.util.function.Predicate) Java takeWhile(predicate)
     * @alias CollectionHolder.takeWhile
     */
    limitWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>

    //#endregion -------------------- Take while --------------------
    //#region -------------------- Take while indexed --------------------

    /**
     * Get a new {@link CollectionHolder} having the first elements satisfying the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-while.html Kotlin takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#takeWhile(java.util.function.Predicate) Java takeWhile(predicate)
     * @typescriptDefinition
     */
    takeWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} having the first elements satisfying the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-while.html Kotlin takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#takeWhile(java.util.function.Predicate) Java takeWhile(predicate)
     */
    takeWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>


    /**
     * Get a new {@link CollectionHolder} having the first elements satisfying the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-while.html Kotlin takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#takeWhile(java.util.function.Predicate) Java takeWhile(predicate)
     * @typescriptDefinition
     * @alias CollectionHolder.takeWhileIndexed
     */
    limitWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} having the first elements satisfying the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-while.html Kotlin takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#takeWhile(java.util.function.Predicate) Java takeWhile(predicate)
     * @alias CollectionHolder.takeWhileIndexed
     */
    limitWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>

    //#endregion -------------------- Take while indexed --------------------
    //#region -------------------- Take last --------------------

    /**
     * Get a new {@link CollectionHolder} from the last {@link n} elements
     *
     * @param n The number of arguments (if negative, then it is plus {@link size})
     * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last.html Kotlin takeLast(n)
     * @canReceiveNegativeValue
     */
    takeLast(n: number,): CollectionHolder<T>

    /**
     * Get a new {@link CollectionHolder} from the last {@link n} elements
     *
     * @param n The number of arguments (if negative, then it is plus {@link size})
     * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last.html Kotlin takeLast(n)
     * @canReceiveNegativeValue
     * @alias CollectionHolder.takeLast
     */
    limitLast(n: number,): CollectionHolder<T>

    //#endregion -------------------- Take last --------------------
    //#region -------------------- Take last while --------------------

    /**
     * Get a new {@link CollectionHolder} having the last elements satisfying the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html Kotlin takeLastWhile(predicate)
     * @typescriptDefinition
     */
    takeLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} having the last elements satisfying the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html Kotlin takeLastWhile(predicate)
     */
    takeLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>


    /**
     * Get a new {@link CollectionHolder} having the last elements satisfying the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html Kotlin takeLastWhile(predicate)
     * @typescriptDefinition
     * @alias CollectionHolder.takeLastWhile
     */
    limitLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} having the last elements satisfying the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html Kotlin takeLastWhile(predicate)
     * @alias CollectionHolder.takeLastWhile
     */
    limitLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>

    //#endregion -------------------- Take last while --------------------
    //#region -------------------- Take last while indexed --------------------

    /**
     * Get a new {@link CollectionHolder} having the last elements satisfying the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html Kotlin takeLastWhile(predicate)
     * @typescriptDefinition
     */
    takeLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} having the last elements satisfying the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html Kotlin takeLastWhile(predicate)
     */
    takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>


    /**
     * Get a new {@link CollectionHolder} having the last elements satisfying the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html Kotlin takeLastWhile(predicate)
     * @typescriptDefinition
     * @alias CollectionHolder.takeLastWhileIndexed
     */
    limitLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} having the last elements satisfying the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html Kotlin takeLastWhile(predicate)
     * @alias CollectionHolder.takeLastWhileIndexed
     */
    limitLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>

    //#endregion -------------------- Take last while indexed --------------------

    //#region -------------------- Drop --------------------

    /**
     * Get a new {@link CollectionHolder} without the first {@link n} elements
     *
     * @param n The number of arguments (if negative, then it is plus {@link size})
     * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop.html Kotlin drop(n)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#skip(long) Java skip(n)
     * @canReceiveNegativeValue
     */
    drop(n: number,): CollectionHolder<T>

    /**
     * Get a new {@link CollectionHolder} without the first {@link n} elements
     *
     * @param n The number of arguments (if negative, then it is plus {@link size})
     * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop.html Kotlin drop(n)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#skip(long) Java skip(n)
     * @canReceiveNegativeValue
     * @alias CollectionHolder.drop
     */
    skip(n: number,): CollectionHolder<T>

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Drop while --------------------

    /**
     * Get a new {@link CollectionHolder} <b>not</b> having the first elements satisfying the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html Kotlin dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#dropWhile(java.util.function.Predicate) Java dropWhile(predicate)
     * @typescriptDefinition
     */
    dropWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} <b>not</b> having the first elements satisfying the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html Kotlin dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#dropWhile(java.util.function.Predicate) Java dropWhile(predicate)
     */
    dropWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>


    /**
     * Get a new {@link CollectionHolder} <b>not</b> having the first elements satisfying the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html Kotlin dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#dropWhile(java.util.function.Predicate) Java dropWhile(predicate)
     * @typescriptDefinition
     * @alias CollectionHolder.dropWhile
     */
    skipWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} <b>not</b> having the first elements satisfying the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html Kotlin dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#dropWhile(java.util.function.Predicate) Java dropWhile(predicate)
     * @alias CollectionHolder.dropWhile
     */
    skipWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>

    //#endregion -------------------- Drop while --------------------
    //#region -------------------- Drop while indexed --------------------

    /**
     * Get a new {@link CollectionHolder} <b>not</b> having the first elements satisfying the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html Kotlin dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#dropWhile(java.util.function.Predicate) Java dropWhile(predicate)
     * @typescriptDefinition
     */
    dropWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} <b>not</b> having the first elements satisfying the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html Kotlin dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#dropWhile(java.util.function.Predicate) Java dropWhile(predicate)
     */
    dropWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>


    /**
     * Get a new {@link CollectionHolder} <b>not</b> having the first elements satisfying the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html Kotlin dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#dropWhile(java.util.function.Predicate) Java dropWhile(predicate)
     * @typescriptDefinition
     * @alias CollectionHolder.dropWhileIndexed
     */
    skipWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} <b>not</b> having the first elements satisfying the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html Kotlin dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#dropWhile(java.util.function.Predicate) Java dropWhile(predicate)
     * @alias CollectionHolder.dropWhileIndexed
     */
    skipWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>

    //#endregion -------------------- Drop while indexed --------------------
    //#region -------------------- Drop last --------------------

    /**
     * Get a new {@link CollectionHolder} without the last {@link n} elements
     *
     * @param n The number of arguments (if negative, then it is plus {@link size})
     * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last.html Kotlin dropLast(n)
     * @canReceiveNegativeValue
     */
    dropLast(n: number,): CollectionHolder<T>

    /**
     * Get a new {@link CollectionHolder} without the last {@link n} elements
     *
     * @param n The number of arguments (if negative, then it is plus {@link size})
     * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last.html Kotlin dropLast(n)
     * @canReceiveNegativeValue
     * @alias CollectionHolder.dropLast
     */
    skipLast(n: number,): CollectionHolder<T>

    //#endregion -------------------- Drop last --------------------
    //#region -------------------- Drop last while --------------------

    /**
     * Get a new {@link CollectionHolder} <b>not</b> having the last elements satisfying the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html Kotlin dropLastWhile(predicate)
     * @typescriptDefinition
     */
    dropLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} <b>not</b> having the last elements satisfying the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html Kotlin dropLastWhile(predicate)
     */
    dropLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>


    /**
     * Get a new {@link CollectionHolder} <b>not</b> having the last elements satisfying the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html Kotlin dropLastWhile(predicate)
     * @typescriptDefinition
     * @alias CollectionHolder.dropLastWhile
     */
    skipLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} <b>not</b> having the last elements satisfying the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html Kotlin dropLastWhile(predicate)
     * @alias CollectionHolder.dropLastWhile
     */
    skipLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>

    //#endregion -------------------- Drop last while --------------------
    //#region -------------------- Drop last while indexed --------------------

    /**
     * Get a new {@link CollectionHolder} <b>not</b> having the last elements satisfying the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html Kotlin dropLastWhile(predicate)
     * @typescriptDefinition
     */
    dropLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} <b>not</b> having the last elements satisfying the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html Kotlin dropLastWhile(predicate)
     */
    dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>


    /**
     * Get a new {@link CollectionHolder} <b>not</b> having the last elements satisfying the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html Kotlin dropLastWhile(predicate)
     * @typescriptDefinition
     * @alias CollectionHolder.dropLastWhileIndexed
     */
    skipLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} <b>not</b> having the last elements satisfying the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html Kotlin dropLastWhile(predicate)
     * @alias CollectionHolder.dropLastWhileIndexed
     */
    skipLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>

    //#endregion -------------------- Drop last while indexed --------------------

    //#region -------------------- Map --------------------

    /**
     * Create a new {@link CollectionHolder} applying a {@link transform} function
     * on each element of the current {@link CollectionHolder collection}
     *
     * @param transform The given transform
     * @see ReadonlyArray.map
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/map.html Kotlin map(transform)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#map(java.util.function.Function) Java map(transform)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select C# Select(transform)
     * @see mapNotNull
     */
    map<const U, >(transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U>

    //#endregion -------------------- Map --------------------
    //#region -------------------- Map indexed --------------------

    /**
     * Create a new {@link CollectionHolder} applying a {@link transform} function
     * on each element of the current {@link CollectionHolder collection}
     *
     * @param transform The given transform
     * @see ReadonlyArray.map
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/map-indexed.html Kotlin mapIndexed(transform)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#map(java.util.function.Function) Java map(transform)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select C# Select(transform)
     * @see mapNotNullIndexed
     */
    mapIndexed<const U, >(transform: IndexValueWithReturnCallback<T, U>,): CollectionHolder<U>

    //#endregion -------------------- Map indexed --------------------

    //#region -------------------- Map not null --------------------

    /**
     * Create a new {@link CollectionHolder} applying a {@link transform} function
     * on each non-null element of the current {@link CollectionHolder collection}
     *
     * @param transform The given transform
     * @see ReadonlyArray.map
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/map-not-null.html Kotlin mapNotNull(transform)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#map(java.util.function.Function) Java map(transform)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select C# Select(transform)
     * @see map
     */
    mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U>

    //#endregion -------------------- Map not null --------------------
    //#region -------------------- Map not null indexed --------------------

    /**
     * Create a new {@link CollectionHolder} applying a {@link transform} function
     * on each non-null element of the current {@link CollectionHolder collection}
     *
     * @param transform The given transform
     * @see ReadonlyArray.map
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/map-indexed-not-null.html Kotlin mapIndexedNotNull(transform)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/stream/Stream.html#map(java.util.function.Function) Java map(transform)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select C# Select(transform)
     * @see mapIndexed
     */
    mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U>

    //#endregion -------------------- Map not null indexed --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- For each --------------------

    /**
     * Perform a given {@link action} on each element
     *
     * @param action The given action
     * @see ReadonlyArray.forEach
     * @see ReadonlySet.forEach
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each.html Kotlin forEach(action)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Iterable.html#forEach(java.util.function.Consumer) Java forEach(action)
     */
    forEach(action: ValueIndexCallback<T>,): void

    //#endregion -------------------- For each --------------------
    //#region -------------------- For each indexed --------------------

    /**
     * Perform a given {@link action} on each element
     *
     * @param action The given action
     * @see ReadonlyArray.forEach
     * @see ReadonlySet.forEach
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each-indexed.html Kotlin forEachIndexed(action)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Iterable.html#forEach(java.util.function.Consumer) Java forEach(action)
     */
    forEachIndexed(action: IndexValueCallback<T>,): void

    //#endregion -------------------- For each indexed --------------------

    //#region -------------------- On each --------------------

    /**
     * Perform a given {@link action} on each element
     * and return the current {@link CollectionHolder collection} afterwards
     *
     * @param action The given action
     * @see ReadonlyArray.forEach
     * @see ReadonlySet.forEach
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/on-each.html Kotlin onEach(action)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Iterable.html#forEach(java.util.function.Consumer) Java forEach(action)
     */
    onEach(action: ValueIndexCallback<T>,): this

    //#endregion -------------------- On each --------------------
    //#region -------------------- On each indexed --------------------

    /**
     * Perform a given {@link action} on each element
     * and return the current {@link CollectionHolder collection} afterwards
     *
     * @param action The given action
     * @see ReadonlyArray.forEach
     * @see ReadonlySet.forEach
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/on-each-indexed.html Kotlin onEachIndexed(action)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/lang/Iterable.html#forEach(java.util.function.Consumer) Java forEach(action)
     */
    onEachIndexed(action: IndexValueCallback<T>,): this

    //#endregion -------------------- On each indexed --------------------

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    //#region -------------------- To reverse --------------------

    /**
     * Reverse the current {@link CollectionHolder collection} to a new {@link CollectionHolder}
     *
     * @see Array.reverse
     * @see ReadonlyArray.toReversed
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reversed.html Kotlin reversed()
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
     * @canReceiveNegativeValue
     */
    toReverse(): CollectionHolder<T>

    /**
     * Reverse to a new {@link CollectionHolder}
     * from the start of the current {@link CollectionHolder collection} to the {@link from starting} index
     *
     * @param from The inclusive starting index (`0` by default)
     * @throws IndexOutOfBoundsException {@link from} is not within the current {@link CollectionHolder collection} {@link size}
     * @throws ForbiddenIndexException   {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see Array.reverse
     * @see ReadonlyArray.toReversed
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reversed.html Kotlin reversed()
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
     * @canReceiveNegativeValue
     */
    toReverse(from: NullableNumber,): CollectionHolder<T>

    /**
     * Reverse to a new {@link CollectionHolder}
     * from the {@link to ending} to the {@link from starting} index in the current {@link CollectionHolder collection}
     *
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (<code>{@link CollectionHolder.size size} - 1</code> by default)
     * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not within the current {@link CollectionHolder collection} {@link size}
     * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @throws InvalidIndexRangeException {@link to} is before {@link from} after the calculation
     * @see Array.reverse
     * @see ReadonlyArray.toReversed
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reversed.html Kotlin reversed()
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
     * @canReceiveNegativeValue
     */
    toReverse(from: NullableNumber, to: NullableNumber,): CollectionHolder<T>


    /**
     * Reverse the current {@link CollectionHolder collection} to a new {@link CollectionHolder}
     *
     * @see Array.reverse
     * @see ReadonlyArray.toReversed
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reversed.html Kotlin reversed()
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
     * @alias CollectionHolder.toReverse
     * @canReceiveNegativeValue
     */
    toReversed(): CollectionHolder<T>

    /**
     * Reverse to a new {@link CollectionHolder}
     * from the start of the current {@link CollectionHolder collection} to the {@link from starting} index
     *
     * @param from The inclusive starting index (`0` by default)
     * @throws IndexOutOfBoundsException {@link from} is not within the current {@link CollectionHolder collection} {@link size}
     * @throws ForbiddenIndexException   {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see Array.reverse
     * @see ReadonlyArray.toReversed
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reversed.html Kotlin reversed()
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
     * @alias CollectionHolder.toReverse
     * @canReceiveNegativeValue
     */
    toReversed(from: NullableNumber,): CollectionHolder<T>

    /**
     * Reverse to a new {@link CollectionHolder}
     * from the {@link to ending} to the {@link from starting} index in the current {@link CollectionHolder collection}
     *
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (<code>{@link CollectionHolder.size size} - 1</code> by default)
     * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not within the current {@link CollectionHolder collection} {@link size}
     * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @throws InvalidIndexRangeException {@link to} is before {@link from} after the calculation
     * @see Array.reverse
     * @see ReadonlyArray.toReversed
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reversed.html Kotlin reversed()
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
     * @alias CollectionHolder.toReverse
     * @canReceiveNegativeValue
     */
    toReversed(from: NullableNumber, to: NullableNumber,): CollectionHolder<T>


    /**
     * Reverse the current {@link CollectionHolder collection} to a new {@link CollectionHolder}
     *
     * @see Array.reverse
     * @see ReadonlyArray.toReversed
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reversed.html Kotlin reversed()
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
     * @alias CollectionHolder.toReverse
     * @canReceiveNegativeValue
     */
    reversed(): CollectionHolder<T>

    /**
     * Reverse to a new {@link CollectionHolder}
     * from the start of the current {@link CollectionHolder collection} to the {@link from starting} index
     *
     * @param from The inclusive starting index (`0` by default)
     * @throws IndexOutOfBoundsException {@link from} is not within the current {@link CollectionHolder collection} {@link size}
     * @throws ForbiddenIndexException   {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see Array.reverse
     * @see ReadonlyArray.toReversed
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reversed.html Kotlin reversed()
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
     * @alias CollectionHolder.toReverse
     * @canReceiveNegativeValue
     */
    reversed(from: NullableNumber,): CollectionHolder<T>

    /**
     * Reverse to a new {@link CollectionHolder}
     * from the {@link to ending} to the {@link from starting} index in the current {@link CollectionHolder collection}
     *
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (<code>{@link CollectionHolder.size size} - 1</code> by default)
     * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not within the current {@link CollectionHolder collection} {@link size}
     * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @throws InvalidIndexRangeException {@link to} is before {@link from} after the calculation
     * @see Array.reverse
     * @see ReadonlyArray.toReversed
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reversed.html Kotlin reversed()
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
     * @alias CollectionHolder.toReverse
     * @canReceiveNegativeValue
     */
    reversed(from: NullableNumber, to: NullableNumber,): CollectionHolder<T>

    //#endregion -------------------- To reverse --------------------

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- JavaScript methods --------------------

    /**
     * A JavaScript way to implement a "for‥of" over the {@link CollectionHolder collection
     *
     * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/iterator
     */
    [Symbol.iterator](): CollectionIterator<T>

    /**
     * Give an output for the call from {@link ObjectConstructor.toString.call} [object CollectionHolder] instead of [object Object]
     *
     * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/toStringTag
     * @readonly
     */
    [Symbol.toStringTag]: CollectionHolderName

    //#endregion -------------------- JavaScript methods --------------------
    //#region -------------------- Conversion methods --------------------

    //#region -------------------- To iterator --------------------

    /** Convert the current {@link CollectionHolder collection} to a {@link CollectionIterator} */
    toIterator(): CollectionIterator<T>

    //#endregion -------------------- To iterator --------------------
    //#region -------------------- To array --------------------

    /** Convert the current {@link CollectionHolder collection} to a {@link ReadonlyArray array} */
    toArray(): readonly T[]

    /** Convert the current {@link CollectionHolder collection} to a new {@link Array mutable array} */
    toMutableArray(): T[]

    //#endregion -------------------- To array --------------------
    //#region -------------------- To set --------------------

    /** Convert the current {@link CollectionHolder collection} to a {@link ReadonlySet set} */
    toSet(): ReadonlySet<T>

    /** Convert the current {@link CollectionHolder collection} to a new {@link Set mutable set} */
    toMutableSet(): Set<T>

    //#endregion -------------------- To set --------------------
    //#region -------------------- To map --------------------

    /** Convert the current {@link CollectionHolder collection} to a {@link ReadonlyMap map} */
    toMap(): ReadonlyMap<number, T>

    /** Convert the current {@link CollectionHolder collection} to a new {@link Map mutable map} */
    toMutableMap(): Map<number, T>

    //#endregion -------------------- To map --------------------

    //#region -------------------- To string --------------------

    /**
     * Convert the current {@link CollectionHolder collection} to a {@link String} on every value
     * by calling its "<i>{@link Object.toString toString()}</i>" method
     *
     * @see Array.toString
     * @see Object.toString
     */
    toString(): string

    /**
     * Convert the current {@link CollectionHolder collection} to a {@link String} on every value
     * by calling its "<i>{@link Object.toLocaleString toLocaleString()}</i>" method
     *
     * @param locale The possible locale to apply on each value
     * @see Array.toLocaleString
     * @see Object.toLocaleString
     * @see Date.toLocaleString
     * @see Number.toLocaleString
     * @see BigInt.toLocaleString
     */
    toLocaleString(locale?: NullableString,): string


    /**
     * Convert the current {@link CollectionHolder collection} to a {@link String} on every value
     * by calling its "<i>{@link String.toLowerCase toLowerCase()}</i>" method
     *
     * @see String.toLowerCase
     */
    toLowerCaseString(): string

    /**
     * Convert the current {@link CollectionHolder collection} to a {@link String} on every value
     * by calling its "<i>{@link String.toLocaleLowerCase toLocaleLowerCase()}</i>" method
     *
     * @param locale The possible locale to apply on each value
     * @see String.toLocaleLowerCase
     */
    toLocaleLowerCaseString(locale?: NullableString,): string


    /**
     * Convert the current {@link CollectionHolder collection} to a {@link String} on every value
     * by calling its "<i>{@link String.toUpperCase toUpperCase()}</i>" method
     *
     * @see String.toUpperCase
     */
    toUpperCaseString(): string

    /**
     * Convert the current {@link CollectionHolder collection} to a {@link String} on every value
     * by calling its "<i>{@link String.toLocaleUpperCase toLocaleUpperCase()}</i>" method
     *
     * @param locale The possible locale to apply on each value
     * @see String.toLocaleUpperCase
     */
    toLocaleUpperCaseString(locale?: NullableString,): string

    //#endregion -------------------- To string --------------------
    //#region -------------------- Join to string --------------------

    /**
     * Create a new {@link String} from every element in the current {@link CollectionHolder collection} using a {@link separator}
     * utilizing the given {@link prefix} and {@link postfix} if supplied.
     *
     * Note that if the current {@link CollectionHolder collection} is huge,
     * a {@link limit} can be specified followed by a {@link truncated} value.
     *
     * @param separator The {@link String} to separate the values ({@link CollectionConstants.DEFAULT_JOIN_SEPARATOR ", "} by default)
     * @param prefix    The {@link String} before the join ({@link CollectionConstants.DEFAULT_JOIN_PREFIX '['} by default)
     * @param postfix   The {@link String} after the join ({@link CollectionConstants.DEFAULT_JOIN_POSTFIX  ']'} by default)
     * @param limit     The maximum number of values to loop (<b>null</b> by default)
     * @param truncated The truncated string if there is a limit ({@link CollectionConstants.DEFAULT_JOIN_TRUNCATED '…'} by default)
     * @param transform A callback to transform into a {@link String}
     * @throws ForbiddenIndexException The {@link limit} is a forbidden {@link Number} ({@link Number.NaN NaN})
     * @see ReadonlyArray.join
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/join-to-string.html Kotlin joinToString()
     * @see https://learn.microsoft.com/dotnet/api/system.string.join C# string.Join()
     * @canReceiveNegativeValue
     */
    joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string

    /**
     * Create a new {@link String} from every element in the current {@link CollectionHolder collection} using a {@link separator}
     * utilizing the given {@link prefix} and {@link postfix} if supplied.
     *
     * Note that if the current {@link CollectionHolder collection} is huge,
     * a {@link limit} can be specified followed by a {@link truncated} value.
     *
     * @param separator The {@link String} to separate the values ({@link CollectionConstants.DEFAULT_JOIN_SEPARATOR ", "} by default)
     * @param prefix    The {@link String} before the join ({@link CollectionConstants.DEFAULT_JOIN_PREFIX '['} by default)
     * @param postfix   The {@link String} after the join ({@link CollectionConstants.DEFAULT_JOIN_POSTFIX  ']'} by default)
     * @param limit     The maximum number of values to loop (<b>null</b> by default)
     * @param truncated The truncated string if there is a limit ({@link CollectionConstants.DEFAULT_JOIN_TRUNCATED '…'} by default)
     * @param transform A callback to transform into a {@link String}
     * @throws ForbiddenIndexException The {@link limit} is an undetermined {@link Number} ({@link Number.NaN NaN})
     * @see ReadonlyArray.join
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/join-to-string.html Kotlin joinToString()
     * @see https://learn.microsoft.com/dotnet/api/system.string.join C# string.Join()
     * @canReceiveNegativeValue
     * @alias CollectionHolder.joinToString
     */
    join(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string

    //#endregion -------------------- Join to string --------------------

    //#endregion -------------------- Conversion methods --------------------

}

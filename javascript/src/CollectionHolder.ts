/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullableNumber, NullableString, NullOr, NullOrNumber, TemplateOrNumber, UndefinedOr} from "@joookiwi/type"

import type {BooleanCallback, CollectionHolderName, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, PossibleIterableArraySetOrCollectionHolder, RestrainedBooleanCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, StringCallback, ValueIndexCallback, ValueIndexWithReturnCallback} from "./CollectionHolder.types"
import type {MinimalistCollectionHolder}                                                                                                                                                                                                                                                                                          from "./MinimalistCollectionHolder"
import type {CollectionIterator}                                                                                                                                                                                                                                                                                                  from "./iterator/CollectionIterator"

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
 * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array Javascript Array
 * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set Javascript Set
 * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Map Javascript Map
 * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html Java Collection
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/ Kotlin Collection
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable C# Enumerable
 * @see https://docs.oracle.com/en/java/javase/22/core/java-collections-framework.html Java collection framework
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
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#size() Java Collection.size()
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Map.html#size() Java Map.size()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.count C# Count()
     * @see length
     * @see count
     */
    get size(): number

    /**
     * Get the length ({@link CollectionHolder.size size} or {@link CollectionHolder.count count}) of the current {@link CollectionHolder collection}
     *
     * @alias size
     */
    get length(): this["size"]

    /**
     * Get the count ({@link CollectionHolder.size size} or {@link CollectionHolder.length length}) of the current {@link CollectionHolder collection}
     *
     * @alias size
     */
    get count(): this["size"]


    /**
     * The {@link CollectionHolder collection} has no values
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-empty.html Kotlin isEmpty()
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/is-empty.html Kotlin Collection.isEmpty()
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/is-empty.html Kotlin Map.isEmpty()
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#isEmpty() Java Collection.isEmpty()
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Map.html#isEmpty Java Map.isEmpty()
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
     * @throws CollectionHolderIndexOutOfBoundsException The {@link index} calculated is under zero or over the {@link size} (after calculation)
     * @throws ForbiddenIndexException                   The {@link index} is a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.at
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/get.html Kotlin get(index)
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/List.html#get(int) Java get(index)
     * @see getOrElse
     * @see getOrNull
     * @canReceiveNegativeValue
     */
    get(index: number,): T

    /**
     * Get the element at the specified index in the current {@link CollectionHolder collection}
     *
     * @param index The index to retrieve a value
     * @alias get
     */
    at(index: number,): T

    /**
     * Get the element at the specified index in the current {@link CollectionHolder collection}
     *
     * @param index The index to retrieve a value
     * @alias get
     */
    elementAt(index: number,): T

    //#endregion -------------------- Get --------------------
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
     * @see get
     * @see getOrNull
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
     * @alias getOrElse
     */
    atOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U

    /**
     * Get the element at the specified index in the current {@link CollectionHolder collection}
     * or calling the {@link defaultValue} function
     * if it is out of bound of the current {@link CollectionHolder collection}
     *
     * @param index        The index to retrieve a value
     * @param defaultValue The callback to retrieve the default value if it is over the {@link size} (after calculation)
     * @alias getOrElse
     */
    elementAtOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U

    /**
     * Get the element at the specified index in the current {@link CollectionHolder collection}
     * or calling the {@link defaultValue} function
     * if it is out of bound of the current {@link CollectionHolder collection}
     *
     * @param index        The index to retrieve a value
     * @param defaultValue The callback to retrieve the default value if it is over the {@link size} (after calculation)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-else.html Kotlin getOrElse(key, defaultValue)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-else.html Kotlin elementAtOrElse(key, defaultValue)
     * @see get
     * @see getOrNull
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
     * @alias getOrElse
     */
    atOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T

    /**
     * Get the element at the specified index in the current {@link CollectionHolder collection}
     * or calling the {@link defaultValue} function
     * if it is out of bound of the current {@link CollectionHolder collection}
     *
     * @param index        The index to retrieve a value
     * @param defaultValue The callback to retrieve the default value if it is over the {@link size} (after calculation)
     * @alias getOrElse
     */
    elementAtOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T

    //#endregion -------------------- Get or else --------------------
    //#region -------------------- Get or null --------------------

    /**
     * Get the element at the specified index in the {@link CollectionHolder collection}
     * or <b>null</b> if it is over the {@link size}
     *
     * @param index The index to retrieve a value
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-null.html Kotlin getOrNull(index)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-null.html Kotlin elementAtOrNull(index)
     * @see get
     * @see getOrElse
     * @canReceiveNegativeValue
     */
    getOrNull(index: number,): NullOr<T>

    /**
     * Get the element at the specified index in the {@link CollectionHolder collection}
     * or <b>null</b> if it is over the {@link size}
     *
     * @param index The index to retrieve a value
     * @alias getOrNull
     */
    atOrNull(index: number,): NullOr<T>

    /**
     * Get the element at the specified index in the {@link CollectionHolder collection}
     * or <b>null</b> if it is over the {@link size}
     *
     * @param index The index to retrieve a value
     * @alias getOrNull
     */
    elementAtOrNull(index: number,): NullOr<T>

    //#endregion -------------------- Get or null --------------------

    //#region -------------------- First --------------------

    /**
     * Get the first element in the current {@link CollectionHolder collection}
     *
     * @throws EmptyCollectionHolderException The {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first()
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/SequencedCollection.html#getFirst() Java getFirst()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First()
     */
    first(): T

    /**
     * Get the first element in the current {@link CollectionHolder collection}
     * matching the given {@link predicate}
     *
     * @param predicate The matching predicate
     * @throws EmptyCollectionHolderException            The {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@link predicate}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
     * @typescriptDefinition
     */
    first<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): S

    /**
     * Get the first element in the current {@link CollectionHolder collection}
     * matching the given {@link predicate}
     *
     * @param predicate The matching predicate
     * @throws EmptyCollectionHolderException            The {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@link predicate}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
     */
    first(predicate: Nullable<BooleanCallback<T>>,): T

    //#endregion -------------------- First --------------------
    //#region -------------------- First or null --------------------

    /**
     * Get the first element in the current {@link CollectionHolder collection}
     * or <b>null</b> if the {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault()
     */
    firstOrNull(): NullOr<T>

    /**
     * Get the first element in the current {@link CollectionHolder collection}
     * matching the given {@link predicate} or <b>null</b>
     * if the {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     *
     * @param predicate The matching predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     * @typescriptDefinition
     */
    firstOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>

    /**
     * Get the first element in the current {@link CollectionHolder collection}
     * matching the given {@link predicate} or <b>null</b>
     * if the {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     *
     * @param predicate The matching predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     */
    firstOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>

    //#endregion -------------------- First or null --------------------

    //#region -------------------- Last --------------------

    /**
     * Get the last element in the current {@link CollectionHolder collection}
     *
     * @throws EmptyCollectionHolderException The {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last()
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/SequencedCollection.html#getLast() Java getLast()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last()
     */
    last(): T

    /**
     * Get the last element in the current {@link CollectionHolder collection}
     * matching the given {@link predicate}
     *
     * @param predicate The matching predicate
     * @throws EmptyCollectionHolderException            The {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@link predicate}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
     * @typescriptDefinition
     */
    last<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): S

    /**
     * Get the last element in the current {@link CollectionHolder collection}
     * matching the given {@link predicate}
     *
     * @param predicate The matching predicate
     * @throws EmptyCollectionHolderException            The {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@link predicate}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
     */
    last(predicate: Nullable<BooleanCallback<T>>,): T

    //#endregion -------------------- Last --------------------
    //#region -------------------- Last or null --------------------

    /**
     * Get the last element in the current {@link CollectionHolder collection}
     * or <b>null</b> if the {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault()
     */
    lastOrNull(): NullOr<T>

    /**
     * Get the last element in the current {@link CollectionHolder collection}
     * matching the given {@link predicate}
     * or <b>null</b> if the {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     *
     * @param predicate The matching predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
     * @typescriptDefinition
     */
    lastOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>

    /**
     * Get the last element in the current {@link CollectionHolder collection}
     * matching the given {@link predicate}
     * or <b>null</b> if the {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     *
     * @param predicate The matching predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
     */
    lastOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>

    //#endregion -------------------- Last or null --------------------

    //#region -------------------- Find --------------------

    /**
     * Get the first element found or <b>null</b> if nothing was found
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html Kotlin find(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     * @typescriptDefinition
     */
    find<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>

    /**
     * Get the first element found or <b>null</b> if nothing was found
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html Kotlin find(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     */
    find(predicate: BooleanCallback<T>,): NullOr<T>

    //#endregion -------------------- Find --------------------
    //#region -------------------- Find indexed --------------------

    /**
     * Get the first element found or <b>null</b> if nothing was found
     *
     * @param callback The given predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html Kotlin find(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     * @typescriptDefinition
     */
    findIndexed<const S extends T, >(callback: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>

    /**
     * Get the first element found or <b>null</b> if nothing was found
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html Kotlin find(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     */
    findIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>

    //#endregion -------------------- Find indexed --------------------

    //#region -------------------- Find last --------------------

    /**
     * Get the last element found or <b>null</b> if nothing was found
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.findLast
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
     * @typescriptDefinition
     */
    findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>

    /**
     * Get the last element found or <b>null</b> if nothing was found
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.findLast
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
     */
    findLast(predicate: BooleanCallback<T>,): NullOr<T>

    //#endregion -------------------- Find last --------------------
    //#region -------------------- Find last indexed --------------------

    /**
     * Get the last element found or <b>null</b> if nothing was found
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.findLast
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
     * @typescriptDefinition
     */
    findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>

    /**
     * Get the last element found or <b>null</b> if nothing was found
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.findLast
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
     */
    findLastIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>

    //#endregion -------------------- Find last indexed --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    //#region -------------------- Index of --------------------

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the current {@link CollectionHolder collection}
     * from a range (if provided)
     *
     * @param element   The element to find
     * @param fromIndex The inclusive starting index
     * @param toIndex   The inclusive ending index
     * @return {NullOrNumber} The index associated to the {@link element} within the range or <b>null</b>
     * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within a valid range
     * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.indexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin indexOf(element)
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/List.html#indexOf(java.lang.Object) Java indexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item, fromIndex?, toIndex?)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the current {@link CollectionHolder collection}
     * from a range (if provided)
     *
     * @param element   The element to find
     * @param fromIndex The inclusive starting index
     * @param toIndex   The inclusive ending index
     * @param limit     The never used limit
     * @return {NullOrNumber} The index associated to the {@link element} within the range or <b>null</b>
     * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within a valid range
     * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.indexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin indexOf(element)
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/List.html#indexOf(java.lang.Object) Java indexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item, fromIndex?, toIndex?)
     * @deprecated Remove the {@link limit} or use {@link CollectionHolder.dropLast} or {@link CollectionHolder.take} instead. This will be removed in version 1.11
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the current {@link CollectionHolder collection}
     * from a range (if provided)
     *
     * @param element   The element to find
     * @param fromIndex The inclusive starting index
     * @param toIndex   The inclusive ending index
     * @param limit     The never used limit
     * @return {NullOrNumber} The index associated to the {@link element} within the range or <b>null</b>
     * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within a valid range
     * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.indexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin indexOf(element)
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/List.html#indexOf(java.lang.Object) Java indexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item, fromIndex?, toIndex?)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @deprecated Use a value that is present in the {@link collection} instead. This will be removed in version 1.11
     */
    indexOf(element: unknown, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber

    //#endregion -------------------- Index of --------------------

    //#region -------------------- Last index of --------------------

    /**
     * Get the <b>last</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the current {@link CollectionHolder collection}
     * from a range (if provided)
     *
     * @param element   The element to find
     * @param fromIndex The inclusive starting index
     * @param toIndex   The inclusive ending index
     * @return {NullOrNumber} The index associated to the {@link element} within the range or <b>null</b>
     * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within a valid range
     * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.lastIndexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html Kotlin lastIndexOf(element)
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object) Java lastIndexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item, fromIndex?, toIndex?)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    lastIndexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber

    /**
     * Get the <b>last</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the current {@link CollectionHolder collection}
     * from a range (if provided)
     *
     * @param element   The element to find
     * @param fromIndex The inclusive starting index
     * @param toIndex   The inclusive ending index
     * @param limit     The never used limit
     * @return {NullOrNumber} The index associated to the {@link element} within the range or <b>null</b>
     * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within a valid range
     * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.lastIndexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html Kotlin lastIndexOf(element)
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object) Java lastIndexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item, fromIndex?, toIndex?)
     * @deprecated Remove the {@link limit} or use {@link CollectionHolder.drop} or {@link CollectionHolder.takeLast} instead. This will be removed in version 1.11
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    lastIndexOf(element: T, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber

    /**
     * Get the <b>last</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the current {@link CollectionHolder collection}
     * from a range (if provided)
     *
     * @param element   The element to find
     * @param fromIndex The inclusive starting index
     * @param toIndex   The inclusive ending index
     * @param limit     The never used limit
     * @return {NullOrNumber} The index associated to the {@link element} within the range or <b>null</b>
     * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within a valid range
     * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @throws ForbiddenIndexException                   The {@link limit} is an undetermined {@link Number} ({@link Number.NaN NaN})
     * @see ReadonlyArray.lastIndexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html Kotlin lastIndexOf(element)
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object) Java lastIndexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item, fromIndex?, toIndex?)
     * @deprecated Use a value that is present in the {@link collection} instead. This will be removed in version 1.11
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    lastIndexOf(element: unknown, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber

    //#endregion -------------------- Last index of --------------------

    //#region -------------------- Index of first --------------------

    /**
     * Get the first index matching the {@link predicate}
     * or <b>null</b> if it was not in the current {@link CollectionHolder collection}
     * from a range (if provided)
     *
     * @param predicate The given predicate
     * @param fromIndex The inclusive starting index
     * @param toIndex   The inclusive ending index
     * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within a valid range
     * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @return {NullOrNumber} The index matching the {@link predicate} within the range or <b>null</b>
     * @see ReadonlyArray.findIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfFirst(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber

    /**
     * Get the first index matching the {@link predicate}
     * or <b>null</b> if it was not in the current {@link CollectionHolder collection}
     * from a range (if provided)
     *
     * @param predicate The given predicate
     * @param fromIndex The inclusive starting index
     * @param toIndex   The inclusive ending index
     * @param limit     The never used limit
     * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within a valid range
     * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @return {NullOrNumber} The index matching the {@link predicate} within the range or <b>null</b>
     * @see ReadonlyArray.findIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
     * @deprecated Remove the {@link limit} or use {@link CollectionHolder.dropLast} or {@link CollectionHolder.take} instead. This will be removed in version 1.11
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfFirst(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber

    //#endregion -------------------- Index of first --------------------
    //#region -------------------- Index of first indexed --------------------

    /**
     * Get the first index matching the {@link predicate}
     * or <b>null</b> if it was not in the current {@link CollectionHolder collection}
     * from a range (if provided)
     *
     * @param predicate The given predicate
     * @param fromIndex The inclusive starting index
     * @param toIndex   The inclusive ending index
     * @return {NullOrNumber} The index matching the {@link predicate} within the range or <b>null</b>
     * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within a valid range
     * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.findIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber

    /**
     * Get the first index matching the {@link predicate}
     * or <b>null</b> if it was not in the current {@link CollectionHolder collection}
     * from a range (if provided)
     *
     * @param predicate The given predicate
     * @param fromIndex The inclusive starting index
     * @param toIndex   The inclusive ending index
     * @param limit     The never used limit
     * @return {NullOrNumber} The index matching the {@link predicate} within the range or <b>null</b>
     * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within a valid range
     * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.findIndex
     * @deprecated Remove the {@link limit} or use {@link CollectionHolder.dropLast} or {@link CollectionHolder.take} instead. This will be removed in version 1.11
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber

    //#endregion -------------------- Index of first indexed --------------------

    //#region -------------------- Index of last --------------------

    /**
     * Get the last index matching the {@link predicate}
     * or <b>null</b> if it was not in the current {@link CollectionHolder collection}
     * from a range (if provided)
     *
     * @param predicate The given predicate
     * @param fromIndex The inclusive starting index
     * @param toIndex   The inclusive ending index
     * @return {NullOrNumber} The index matching the {@link predicate} within the range or <b>null</b>
     * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within a valid range
     * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.findLastIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfLast(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber

    /**
     * Get the last index matching the {@link predicate}
     * or <b>null</b> if it was not in the current {@link CollectionHolder collection}
     * from a range (if provided)
     *
     * @param predicate The given predicate
     * @param fromIndex The inclusive starting index
     * @param toIndex   The inclusive ending index
     * @param limit     The never used limit
     * @return {NullOrNumber} The index matching the {@link predicate} within the range or <b>null</b>
     * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within a valid range
     * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.findLastIndex
     * @deprecated Remove the {@link limit} or use {@link CollectionHolder.drop} or {@link CollectionHolder.takeLast} instead. This will be removed in version 1.11
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfLast(predicate: BooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber

    //#endregion -------------------- Index of last --------------------
    //#region -------------------- Index of last indexed --------------------

    /**
     * Get the last index matching the {@link predicate}
     * or <b>null</b> if it was not in the current {@link CollectionHolder collection}
     * from a range (if provided)
     *
     * @param predicate The given predicate
     * @param fromIndex The inclusive starting index
     * @param toIndex   The inclusive ending index
     * @return {NullOrNumber} The index matching the {@link predicate} within the range or <b>null</b>
     * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within a valid range
     * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.findLastIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber,): NullOrNumber

    /**
     * Get the last index matching the {@link predicate}
     * or <b>null</b> if it was not in the current {@link CollectionHolder collection}
     * from a range (if provided)
     *
     * @param predicate The given predicate
     * @param fromIndex The inclusive starting index
     * @param toIndex   The inclusive ending index
     * @param limit     The never used limit
     * @return {NullOrNumber} The index matching the {@link predicate} within the range or <b>null</b>
     * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within a valid range
     * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.findLastIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
     * @deprecated Remove the {@link limit} or use {@link CollectionHolder.drop} or {@link CollectionHolder.takeLast} instead. This will be removed in version 1.11
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): NullOrNumber

    //#endregion -------------------- Index of last indexed --------------------

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
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/stream/Stream.html#allMatch(java.util.function.Predicate) Java allMatch(predicate)
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
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/stream/Stream.html#allMatch(java.util.function.Predicate) Java allMatch(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.all C# All(predicate)
     */
    all(predicate: BooleanCallback<T>,): boolean


    /**
     * Check if <b>every</b> element in the current {@link CollectionHolder collection}
     * match the given {@link predicate}
     *
     * @param predicate The matching predicate
     * @alias CollectionHolder.all
     * @typescriptDefinition
     */
    every<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolder<S>

    /**
     * Check if <b>every</b> element in the current {@link CollectionHolder collection}
     * match the given {@link predicate}
     *
     * @param predicate The matching predicate
     * @alias CollectionHolder.all
     */
    every(predicate: BooleanCallback<T>,): boolean

    //#endregion -------------------- All --------------------
    //#region -------------------- Any --------------------

    /**
     * Tell if the current {@link CollectionHolder collection} {@link CollectionHolder.isNotEmpty is not empty}
     *
     * @return {boolean} {@link isNotEmpty}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/any.html Kotlin any()
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/stream/Stream.html#findAny() Java findAny()
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
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/stream/Stream.html#anyMatch(java.util.function.Predicate) Java anyMatch(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any C# Any(predicate)
     */
    any(predicate: Nullable<BooleanCallback<T>>,): boolean


    /**
     * Tell if the current {@link CollectionHolder collection} {@link CollectionHolder.isNotEmpty is not empty}
     *
     * @return {boolean} {@link isNotEmpty}
     * @alias CollectionHolder.isNotEmpty
     */
    some(): this["isNotEmpty"]

    /**
     * Check if <b>one</b> of the elements in the current {@link CollectionHolder collection}
     * match the given {@link predicate}
     *
     * @param predicate The condition to check on each value
     * @return {boolean} <b>true</b> if at least one {@link predicate} is <b>true</b> on a value of the current {@link CollectionHolder collection}
     * @alias CollectionHolder.any
     */
    some(predicate: Nullable<BooleanCallback<T>>,): boolean

    //#endregion -------------------- All --------------------
    //#region -------------------- None --------------------

    /**
     * Tell if the current {@link CollectionHolder collection} {@link isEmpty is empty}
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/none.html Kotlin none()
     * @alias isEmpty
     */
    none(): this["isEmpty"]

    /**
     * Check if <b>no</b> element in the current {@link CollectionHolder collection}
     * match the given {@link predicate}
     *
     * @param predicate The condition to check on each value
     * @return {boolean} <b>false</b> if at least one {@link predicate} is <b>true</b> on a value of the current {@link CollectionHolder collection}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/none.html Kotlin none(predicate)
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/stream/Stream.html#noneMatch(java.util.function.Predicate) Java noneMatch(predicate)
     */
    none(predicate: Nullable<BooleanCallback<T>>,): boolean

    //#endregion -------------------- None --------------------

    //#region -------------------- Has null methods --------------------

    /**
     * The {@link CollectionHolder} has at least one <b>null</b> or <b>undefined</b>
     *
     * @return {boolean} <b>true</b> only if one element is <b>null</b> or <b>undefined</b>
     * @see includesNull
     * @see containsNull
     */
    get hasNull(): boolean

    /**
     * The {@link CollectionHolder} has at least one <b>null</b> or <b>undefined</b>
     *
     * @alias hasNull
     * @return {boolean} <b>true</b> only if one element is <b>null</b> or <b>undefined</b>
     */
    get includesNull(): this["hasNull"]

    /**
     * The {@link CollectionHolder} has at least one <b>null</b> or <b>undefined</b>
     *
     * @alias hasNull
     * @return {boolean} <b>true</b> only if one element is <b>null</b> or <b>undefined</b>
     */
    get containsNull(): this["hasNull"]

    //#endregion -------------------- Has null methods --------------------
    //#region -------------------- Has duplicate methods --------------------

    /**
     * The {@link CollectionHolder} has at least one duplicate value
     *
     * @return {boolean} <b>true</b> only if one element is equal (===) to another one
     * @see includesDuplicate
     * @see containsDuplicate
     */
    get hasDuplicate(): boolean

    /**
     * The {@link CollectionHolder} has at least one duplicate value
     *
     * @alias hasDuplicate
     * @return {boolean} <b>true</b> only if one element is equal (===) to another one
     */
    get includesDuplicate(): this["hasDuplicate"]

    /**
     * The {@link CollectionHolder} has at least one duplicate value
     *
     * @alias hasDuplicate
     * @return {boolean} <b>true</b> only if one element is equal (===) to another one
     */
    get containsDuplicate(): this["hasDuplicate"]

    //#endregion -------------------- Has duplicate methods --------------------

    //#region -------------------- Has --------------------

    /**
     * Tell whenever the {@link value} exist in the current {@link CollectionHolder collection}
     *
     * @param value The value to compare
     * @return {boolean} <b>true</b> if the {@link value} is equals to one value in the current {@link CollectionHolder collection}
     * @see includes
     * @see contains
     * @see ReadonlyArray.includes
     * @see ReadonlySet.has
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains.html Kotlin contains(value)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/containsValue.html Kotlin Map.containsValue(value)
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#contains(java.lang.Object) Java Collection.contains(value)
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Map.html#containsValue(java.lang.Object) Java Map.containsValue(value)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.contains C# contains(value)
     */
    has(value: T,): boolean

    /**
     * Tell whenever the {@link value} exist in the current {@link CollectionHolder collection}
     *
     * @param value The value to compare
     * @return {boolean} <b>true</b> if the {@link value} is equals to one value in the current {@link CollectionHolder collection}
     * @see includes
     * @see contains
     * @see ReadonlyArray.includes
     * @see ReadonlySet.has
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains.html Kotlin contains(value)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/containsValue.html Kotlin Map.containsValue(value)
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#contains(java.lang.Object) Java Collection.contains(value)
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Map.html#containsValue(java.lang.Object) Java Map.containsValue(value)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.contains C# contains(value)
     * @deprecated Use a value present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    has(value: unknown,): boolean

    //#region -------------------- Has methods (aliases) --------------------

    /**
     * Tell whenever the {@link value} exist in the current {@link CollectionHolder collection}
     *
     * @param value The value to compare
     * @return {boolean} <b>true</b> if the {@link value} is equals to one value in the current {@link CollectionHolder collection}
     * @alias has
     */
    includes(value: T,): boolean

    /**
     * Tell whenever the {@link value} exist in the current {@link CollectionHolder collection}
     *
     * @param value The value to compare
     * @return {boolean} <b>true</b> if the {@link value} is equals to one value in the current {@link CollectionHolder collection}
     * @alias has
     * @deprecated Use a value present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    includes(value: unknown,): boolean


    /**
     * Tell whenever the {@link value} exist in the current {@link CollectionHolder collection}
     *
     * @param value The value to compare
     * @return {boolean} <b>true</b> if the {@link value} is equals to one value in the current {@link CollectionHolder collection}
     * @alias has
     */
    contains(value: T,): boolean

    /**
     * Tell whenever the {@link value} exist in the current {@link CollectionHolder collection}
     *
     * @param value The value to compare
     * @return {boolean} <b>true</b> if the {@link value} is equals to one value in the current {@link CollectionHolder collection}
     * @alias has
     * @deprecated Use a value present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    contains(value: unknown,): boolean

    //#endregion -------------------- Has methods (aliases) --------------------

    //#endregion -------------------- Has --------------------
    //#region -------------------- Has one --------------------

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     */
    hasOne(values: readonly T[],): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     */
    hasOne(values: ReadonlySet<T>,): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     */
    hasOne(values: CollectionHolder<T>,): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     */
    hasOne(values: MinimalistCollectionHolder<T>,): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     */
    hasOne(values: CollectionIterator<T>,): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     */
    hasOne(values: Iterable<T>,): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @typescriptDefinition
     */
    hasOne(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    hasOne(values: readonly unknown[],): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    hasOne(values: ReadonlySet<unknown>,): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    hasOne(values: CollectionHolder,): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    hasOne(values: MinimalistCollectionHolder,): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    hasOne(values: CollectionIterator,): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @typescriptDefinition
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    hasOne(values: Iterable<unknown>,): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    hasOne(values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean

    //#region -------------------- Has one methods (aliases) --------------------

    /**
     * Tell whenever at least one exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasOne
     */
    includesOne(values: readonly T[],): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasOne
     */
    includesOne(values: ReadonlySet<T>,): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasOne
     */
    includesOne(values: CollectionHolder<T>,): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasOne
     */
    includesOne(values: MinimalistCollectionHolder<T>,): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasOne
     */
    includesOne(values: CollectionIterator<T>,): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasOne
     */
    includesOne(values: Iterable<T>,): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasOne
     * @typescriptDefinition
     */
    includesOne(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasOne
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    includesOne(values: readonly unknown[],): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasOne
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    includesOne(values: ReadonlySet<unknown>,): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasOne
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    includesOne(values: CollectionHolder,): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasOne
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    includesOne(values: MinimalistCollectionHolder,): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasOne
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    includesOne(values: CollectionIterator,): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasOne
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    includesOne(values: Iterable<unknown>,): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasOne
     * @typescriptDefinition
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    includesOne(values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean


    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasOne
     */
    containsOne(values: readonly T[],): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasOne
     */
    containsOne(values: ReadonlySet<T>,): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasOne
     */
    containsOne(values: CollectionHolder<T>,): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasOne
     */
    containsOne(values: MinimalistCollectionHolder<T>,): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasOne
     */
    containsOne(values: CollectionIterator<T>,): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasOne
     */
    containsOne(values: Iterable<T>,): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasOne
     * @typescriptDefinition
     */
    containsOne(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasOne
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    containsOne(values: readonly unknown[],): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasOne
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    containsOne(values: ReadonlySet<unknown>,): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasOne
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    containsOne(values: CollectionHolder,): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasOne
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    containsOne(values: MinimalistCollectionHolder,): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasOne
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    containsOne(values: CollectionIterator,): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasOne
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    containsOne(values: Iterable<unknown>,): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasOne
     * @typescriptDefinition
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    containsOne(values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean

    //#endregion -------------------- Has one methods (aliases) --------------------

    //#endregion -------------------- Has one --------------------
    //#region -------------------- Has all --------------------

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
     */
    hasAll(values: readonly T[],): boolean

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
     */
    hasAll(values: ReadonlySet<T>,): boolean

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
     */
    hasAll(values: CollectionHolder<T>,): boolean

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
     */
    hasAll(values: MinimalistCollectionHolder<T>,): boolean

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
     */
    hasAll(values: CollectionIterator<T>,): boolean

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
     */
    hasAll(values: Iterable<T>,): boolean

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
     * @typescriptDefinition
     */
    hasAll(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    hasAll(values: readonly unknown[],): boolean

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    hasAll(values: ReadonlySet<unknown>,): boolean

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    hasAll(values: CollectionHolder,): boolean

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    hasAll(values: MinimalistCollectionHolder,): boolean

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    hasAll(values: CollectionIterator,): boolean

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    hasAll(values: Iterable<unknown>,): boolean

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
     * @typescriptDefinition
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    hasAll(values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean

    //#region -------------------- Has all methods (aliases) --------------------

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasAll
     */
    includesAll(values: readonly T[],): boolean

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasAll
     */
    includesAll(values: ReadonlySet<T>,): boolean

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasAll
     */
    includesAll(values: CollectionHolder<T>,): boolean

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasAll
     */
    includesAll(values: MinimalistCollectionHolder<T>,): boolean

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasAll
     */
    includesAll(values: CollectionIterator<T>,): boolean

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasAll
     */
    includesAll(values: Iterable<T>,): boolean

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasAll
     * @typescriptDefinition
     */
    includesAll(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasAll
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    includesAll(values: readonly unknown[],): boolean

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasAll
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    includesAll(values: ReadonlySet<unknown>,): boolean

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasAll
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    includesAll(values: CollectionHolder,): boolean

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasAll
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    includesAll(values: MinimalistCollectionHolder,): boolean

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasAll
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    includesAll(values: CollectionIterator,): boolean

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasAll
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    includesAll(values: Iterable<unknown>,): boolean

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasAll
     * @typescriptDefinition
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    includesAll(values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean


    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasAll
     */
    containsAll(values: readonly T[],): boolean

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasAll
     */
    containsAll(values: ReadonlySet<T>,): boolean

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasAll
     */
    containsAll(values: CollectionHolder<T>,): boolean

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasAll
     */
    containsAll(values: MinimalistCollectionHolder<T>,): boolean

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasAll
     */
    containsAll(values: CollectionIterator<T>,): boolean

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasAll
     */
    containsAll(values: Iterable<T>,): boolean

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasAll
     * @typescriptDefinition
     */
    containsAll(values: PossibleIterableArraySetOrCollectionHolder<T>,): boolean

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasAll
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    containsAll(values: readonly unknown[],): boolean

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasAll
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    containsAll(values: ReadonlySet<unknown>,): boolean

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasAll
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    containsAll(values: CollectionHolder,): boolean

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasAll
     * @typescriptDefinition
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    containsAll(values: MinimalistCollectionHolder,): boolean

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasAll
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    containsAll(values: CollectionIterator,): boolean

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasAll
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    containsAll(values: Iterable<unknown>,): boolean

    /**
     * Tell that all of the {@link values} exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @alias hasAll
     * @typescriptDefinition
     * @deprecated Use values present in the current {@link CollectionHolder collection} instead. This will be removed in version 1.11
     */
    containsAll(values: PossibleIterableArraySetOrCollectionHolder<unknown>,): boolean

    //#endregion -------------------- Has all methods (aliases) --------------------

    //#endregion -------------------- Has all --------------------

    //#region -------------------- Require not nulls --------------------

    /**
     * Require that no items are <b>null</b> or <b>undefined</b> in the current {@link CollectionHolder collection}
     *
     * @throws {TypeError} There is <b>null</b> or <b>undefined</b> value in the current collection
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
     * @see filterNotNull
     * @return {this} The current {@link SortableCollectionHolder collection}
     */
    requireNoNulls(): CollectionHolder<NonNullable<T>>

    //#endregion -------------------- Require not nulls --------------------

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
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java filter(predicate)
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
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java filter(predicate)
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
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java filter(predicate)
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
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java filter(predicate)
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
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java filter(predicate)
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
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java filter(predicate)
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
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java filter(predicate)
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
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java filter(predicate)
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

    //#region -------------------- Slice (indice) --------------------

    /**
     * Create a new {@link CollectionHolder} from the {@link indices}
     * in the current {@link CollectionHolder collection}
     *
     * @param indices The given indices
     * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the current {@link CollectionHolder collection}
     * @throws ForbiddenIndexException                   An indice a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
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
     * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the current {@link CollectionHolder collection}
     * @throws ForbiddenIndexException                   An indice a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     */
    slice(indices: ReadonlySet<number>,): CollectionHolder<T>

    /**
     * Create a new {@link CollectionHolder} from the {@link indices}
     * in the current {@link CollectionHolder collection}
     *
     * @param indices The given indices
     * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the current {@link CollectionHolder collection}
     * @throws ForbiddenIndexException                   An indice a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     */
    slice(indices: CollectionHolder<number>,): CollectionHolder<T>

    /**
     * Create a new {@link CollectionHolder} from the {@link indices}
     * in the current {@link CollectionHolder collection}
     *
     * @param indices The given indices
     * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the current {@link CollectionHolder collection}
     * @throws ForbiddenIndexException                   An indice a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     */
    slice(indices: MinimalistCollectionHolder<number>,): CollectionHolder<T>

    /**
     * Create a new {@link CollectionHolder} from the {@link indices}
     * in the current {@link CollectionHolder collection}
     *
     * @param indices The given indices
     * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the current {@link CollectionHolder collection}
     * @throws ForbiddenIndexException                   An indice a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     */
    slice(indices: CollectionIterator<number>,): CollectionHolder<T>

    /**
     * Create a new {@link CollectionHolder} from the {@link indices}
     * in the current {@link CollectionHolder collection}
     *
     * @param indices The given indices
     * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the current {@link CollectionHolder collection}
     * @throws ForbiddenIndexException                   An indice a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     */
    slice(indices: Iterable<number>,): CollectionHolder<T>

    /**
     * Create a new {@link CollectionHolder} from the {@link indices}
     * in the current {@link CollectionHolder collection}
     *
     * @param indices The given indices
     * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the current {@link CollectionHolder collection}
     * @throws ForbiddenIndexException                   An indice a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     * @typescriptDefinition
     */
    slice(indices: PossibleIterableArraySetOrCollectionHolder<number>,): CollectionHolder<T>

    //#endregion -------------------- Slice (indice) --------------------
    //#region -------------------- Slice (from, to) --------------------

    /**
     * Create a new {@link CollectionHolder}
     * from the {@link fromIndex starting} to the {@link toIndex ending} index
     * in the current {@link CollectionHolder collection}.
     *
     * If the {@link fromIndex} is 0 and the {@link toIndex}
     * is the <code>{@link CollectionHolder.size size} - 1</code>,
     * then the current {@link CollectionHolder collection} is returned.
     *
     * @param fromIndex The starting index
     * @param toIndex   The ending index
     * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within the current {@link CollectionHolder collection} {@link size}
     * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link fromIndex} after the calculation
     * @see ReadonlyArray.slice
     * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(fromIndex, toIndex)
     */
    slice(fromIndex?: NullableNumber, toIndex?: NullableNumber,): CollectionHolder<T>

    /**
     * Create a new {@link CollectionHolder}
     * from the {@link fromIndex starting} to the {@link toIndex ending} index
     * in the current {@link CollectionHolder collection}.
     *
     * If the {@link fromIndex} is 0 and the {@link toIndex}
     * is the <code>{@link CollectionHolder.size size} - 1</code>,
     * then the current {@link CollectionHolder collection} is returned.
     *
     * @param fromIndex The starting index
     * @param toIndex   The ending index
     * @param limit     The never used limit
     * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within the current {@link CollectionHolder collection} {@link size}
     * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link fromIndex} after the calculation
     * @see ReadonlyArray.slice
     * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(fromIndex, toIndex)
     * @deprecated Remove the {@link limit} or use {@link CollectionHolder.dropLast} or {@link CollectionHolder.take} instead. This will be removed in version 1.11
     */
    slice(fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T>

    //#endregion -------------------- Slice (from, to) --------------------

    /**
     * Create a new {@link CollectionHolder} from the {@link indicesOrFromIndex indices}
     * or from the {@link indicesOrFromIndex starting} to the {@link toIndex ending} index
     * in the current {@link CollectionHolder collection}.
     *
     * If the {@link indicesOrFromIndex} is 0 and the {@link toIndex}
     * is the <code>{@link CollectionHolder.size size} - 1</code>,
     * then the current {@link CollectionHolder collection} is returned.
     *
     * @param indicesOrFromIndex The given indices (or starting index)
     * @param toIndex            The ending index
     * @throws CollectionHolderIndexOutOfBoundsException The {@link indicesOrFromIndex} or {@link toIndex} are not within the current {@link CollectionHolder collection} {@link size}
     * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the current {@link CollectionHolder collection}
     * @throws ForbiddenIndexException                   The {@link indicesOrFromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link indicesOrFromIndex} after the calculation
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(fromIndex, toIndex)
     * @typescriptDefinition
     */
    slice(indicesOrFromIndex?: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number>, toIndex?: NullableNumber,): CollectionHolder<T>

    /**
     * Create a new {@link CollectionHolder} from the {@link indicesOrFromIndex indices}
     * or from the {@link indicesOrFromIndex starting} to the {@link toIndex ending} index
     * in the current {@link CollectionHolder collection}.
     *
     * If the {@link indicesOrFromIndex} is 0 and the {@link toIndex}
     * is the <code>{@link CollectionHolder.size size} - 1</code>,
     * then the current {@link CollectionHolder collection} is returned.
     *
     * @param indicesOrFromIndex The given indices (or starting index)
     * @param toIndex            The ending index
     * @param limit              The never used limit
     * @throws CollectionHolderIndexOutOfBoundsException The {@link indicesOrFromIndex} or {@link toIndex} are not within the current {@link CollectionHolder collection} {@link size}
     * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the current {@link CollectionHolder collection}
     * @throws ForbiddenIndexException                   The {@link indicesOrFromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link indicesOrFromIndex} after the calculation
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(fromIndex, toIndex)
     * @typescriptDefinition
     */
    slice(indicesOrFromIndex?: Nullable<| PossibleIterableArraySetOrCollectionHolder<number> | number>, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T>

    //#endregion -------------------- Slice --------------------

    //#region -------------------- Map --------------------

    /**
     * Create a new {@link CollectionHolder} applying a {@link transform} function
     * on each element of the current {@link CollectionHolder collection}
     *
     * @param transform The given transform
     * @see ReadonlyArray.map
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/map.html Kotlin map(transform)
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/stream/Stream.html#map(java.util.function.Function) Java map(transform)
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
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/stream/Stream.html#map(java.util.function.Function) Java map(transform)
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
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/stream/Stream.html#map(java.util.function.Function) Java map(transform)
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
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/map-not-null.html Kotlin mapNotNull(transform)
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/stream/Stream.html#map(java.util.function.Function) Java map(transform)
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
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/lang/Iterable.html#forEach(java.util.function.Consumer) Java forEach(action)
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
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/lang/Iterable.html#forEach(java.util.function.Consumer) Java forEach(action)
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
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/lang/Iterable.html#forEach(java.util.function.Consumer) Java forEach(action)
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
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/lang/Iterable.html#forEach(java.util.function.Consumer) Java forEach(action)
     */
    onEachIndexed(action: IndexValueCallback<T>,): this

    //#endregion -------------------- On each indexed --------------------

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    //#region -------------------- To reverse --------------------

    /**
     * Reverse to a new {@link CollectionHolder}
     * from the {@link toIndex ending} to the {@link fromIndex starting} index
     * in the current {@link CollectionHolder collection}.
     *
     * If the {@link CollectionHolder.size size} is 1 (<i>with valid indexes</i>),
     * then the current {@link CollectionHolder collect is returned.
     *
     * @param fromIndex The inclusive starting index
     * @param toIndex   The inclusive ending index
     * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within the current {@link CollectionHolder collection} {@link size}
     * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link fromIndex} after the calculation
     * @see Array.reverse
     * @see ReadonlyArray.toReversed
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reversed.html Kotlin reversed()
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
     * @canReceiveNegativeValue
     */
    toReverse(fromIndex?: NullableNumber, toIndex?: NullableNumber,): CollectionHolder<T>

    /**
     * Reverse to a new {@link CollectionHolder}
     * from the {@link toIndex ending} to the {@link fromIndex starting} index
     * in the current {@link CollectionHolder collection}.
     *
     * If the {@link CollectionHolder.size size} is 1 (<i>with valid indexes</i>),
     * then the current {@link CollectionHolder collect is returned.
     *
     * @param fromIndex The inclusive starting index
     * @param toIndex   The inclusive ending index
     * @param limit     The never used limit
     * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within the current {@link CollectionHolder collection} {@link size}
     * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link fromIndex} after the calculation
     * @see Array.reverse
     * @see ReadonlyArray.toReversed
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reversed.html Kotlin reversed()
     * @see https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
     * @deprecated Remove the {@link limit} or use {@link CollectionHolder.drop} or {@link CollectionHolder.takeLast} instead. This will be removed in version 1.11
     * @canReceiveNegativeValue
     */
    toReverse(fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T>


    /**
     * Reverse to a new {@link CollectionHolder}
     * from the {@link toIndex ending} to the {@link fromIndex starting} index
     * in the current {@link CollectionHolder collection}.
     *
     * If the {@link CollectionHolder.size size} is 1 (<i>with valid indexes</i>),
     * then the current {@link CollectionHolder collect is returned.
     *
     * @alias toReverse
     * @param fromIndex The inclusive starting index
     * @param toIndex   The inclusive ending index
     * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within the current {@link CollectionHolder collection} {@link size}
     * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link fromIndex} after the calculation
     * @canReceiveNegativeValue
     */
    toReversed(fromIndex?: NullableNumber, toIndex?: NullableNumber,): CollectionHolder<T>

    /**
     * Reverse to a new {@link CollectionHolder}
     * from the {@link toIndex ending} to the {@link fromIndex starting} index
     * in the current {@link CollectionHolder collection}.
     *
     * If the {@link CollectionHolder.size size} is 1 (<i>with valid indexes</i>),
     * then the current {@link CollectionHolder collect is returned.
     *
     * @alias toReverse
     * @param fromIndex The inclusive starting index
     * @param toIndex   The inclusive ending index
     * @param limit     The never used limit
     * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within the current {@link CollectionHolder collection} {@link size}
     * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link fromIndex} after the calculation
     * @deprecated Remove the {@link limit} or use {@link CollectionHolder.drop} or {@link CollectionHolder.takeLast} instead. This will be removed in version 1.11
     * @canReceiveNegativeValue
     */
    toReversed(fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T>


    /**
     * Reverse to a new {@link CollectionHolder}
     * from the {@link toIndex ending} to the {@link fromIndex starting} index
     * in the current {@link CollectionHolder collection}.
     *
     * If the {@link CollectionHolder.size size} is 1 (<i>with valid indexes</i>),
     * then the current {@link CollectionHolder collect is returned.
     *
     * @alias toReverse
     * @param fromIndex The inclusive starting index
     * @param toIndex   The inclusive ending index
     * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within the current {@link CollectionHolder collection} {@link size}
     * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link fromIndex} after the calculation
     * @canReceiveNegativeValue
     */
    reversed(fromIndex?: NullableNumber, toIndex?: NullableNumber,): CollectionHolder<T>

    /**
     * Reverse to a new {@link CollectionHolder}
     * from the {@link toIndex ending} to the {@link fromIndex starting} index
     * in the current {@link CollectionHolder collection}.
     *
     * If the {@link CollectionHolder.size size} is 1 (<i>with valid indexes</i>),
     * then the current {@link CollectionHolder collect is returned.
     *
     * @alias toReverse
     * @param fromIndex The inclusive starting index
     * @param toIndex   The inclusive ending index
     * @param limit     The never used limit
     * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex} or {@link toIndex} are not within the current {@link CollectionHolder collection} {@link size}
     * @throws ForbiddenIndexException                   The {@link fromIndex} or {@link toIndex} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @throws InvalidIndexRangeException                The {@link toIndex} is before the {@link fromIndex} after the calculation
     * @deprecated Remove the {@link limit} or use {@link CollectionHolder.drop} or {@link CollectionHolder.takeLast} instead. This will be removed in version 1.11
     * @canReceiveNegativeValue
     */
    reversed(fromIndex?: NullableNumber, toIndex?: NullableNumber, limit?: NullableNumber,): CollectionHolder<T>

    //#endregion -------------------- To reverse --------------------

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- Javascript methods --------------------

    /**
     * A Javascript way to implement a "for‥of" over the {@link CollectionHolder collection
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

    //#endregion -------------------- Javascript methods --------------------
    //#region -------------------- Conversion methods --------------------

    //#region -------------------- To iterator --------------------

    /** Convert the current {@link CollectionHolder collection} to a new {@link CollectionIterator} */
    toIterator(): CollectionIterator<T>

    //#endregion -------------------- To iterator --------------------
    //#region -------------------- To array --------------------

    /** Convert the current {@link CollectionHolder collection} to a new {@link ReadonlyArray array} */
    toArray(): readonly T[]

    /** Convert the current {@link CollectionHolder collection} to a new {@link Array mutable array} */
    toMutableArray(): T[]

    //#endregion -------------------- To array --------------------
    //#region -------------------- To set --------------------

    /** Convert the current {@link CollectionHolder collection} to a new {@link ReadonlySet set} */
    toSet(): ReadonlySet<T>

    /** Convert the current {@link CollectionHolder collection} to a new {@link Set mutable set} */
    toMutableSet(): Set<T>

    //#endregion -------------------- To set --------------------
    //#region -------------------- To map --------------------

    /** Convert the current {@link CollectionHolder collection} to a new {@link ReadonlyMap map} */
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
     * @throws ForbiddenIndexException The {@link limit} is an undetermined {@link Number} ({@link Number.NaN NaN})
     * @see ReadonlyArray.join
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/join-to-string.html Kotlin joinToString()
     * @see https://learn.microsoft.com/dotnet/api/system.string.join C# string.Join()
     * @canReceiveNegativeValue
     * @alias joinToString
     */
    join(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string

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

    //#endregion -------------------- Join to string --------------------

    //#endregion -------------------- Conversion methods --------------------

}

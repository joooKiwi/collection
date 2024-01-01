/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullOr, NumberOrNumberInString, UndefinedOr}                                                                                                                                                                                                                             from "./general type"
import type {BooleanCallback, CollectionHolderName, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, ObjectOf, RestrainedBooleanCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, StringCallback, ValueIndexCallback, ValueIndexWithReturnCallback} from "./CollectionHolder.types"
import type {MinimalistCollectionHolder}                                                                                                                                                                                                                                                        from "./MinimalistCollectionHolder"
import type {CollectionIterator}                                                                                                                                                                                                                                                                from "./iterator/CollectionIterator"

/**
 * A collection to hold another collection and do some generic stuff if applicable.
 *
 * It also has some methods that are applicable for both {@link Array} & {@link Set} to give options.
 * Some methods are inspired by other languages to give more cross-language functionality.
 *
 * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array Javascript Array
 * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set Javascript Set
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/ Kotlin Collection
 * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable C# Enumerable
 */
export interface CollectionHolder<out T = unknown, >
    extends MinimalistCollectionHolder<T>,
            Iterable<T> {

    /**
     * Get the value at the index (without validating if it exists in the {@link CollectionHolder})
     *
     * @see get
     */
    [index: NumberOrNumberInString]: UndefinedOr<T>

    //#region -------------------- Size methods --------------------

    /**
     * Get the size ({@link CollectionHolder.length length} or {@link CollectionHolder.count count}) of the current {@link CollectionHolder collection}
     *
     * @see ReadonlyArray.length
     * @see ReadonlySet.size
     * @see ReadonlyMap.size
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/size.html Kotlin size()
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
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/is-empty.html Kotlin isEmpty()
     * @see isNotEmpty
     */
    get isEmpty(): boolean

    /**
     * The {@link CollectionHolder collection} has at least one value
     *
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/is-not-empty.html Kotlin isNotEmpty()
     * @see isEmpty
     */
    get isNotEmpty(): boolean

    //#endregion -------------------- Size methods --------------------
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
    //#region -------------------- Value methods --------------------

    //#region -------------------- Get methods --------------------

    //#region -------------------- Get methods --------------------

    /**
     * Get the element at the specified index in the {@link CollectionHolder collection}
     *
     * @param index The index to retrieve a value
     * @throws CollectionHolderIndexOutOfBoundsException The index calculated is under zero
     *             or over the {@link size} (after calculation)
     * @see ReadonlyArray.at
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/get.html Kotlin get(index)
     * @see getOrElse
     * @see getOrNull
     * @canReceiveNegativeValue
     */
    get(index: number,): T

    /**
     * Get the element at the specified index in the {@link CollectionHolder collection}
     *
     * @param index The index to retrieve a value
     * @alias get
     */
    at(index: number,): T

    /**
     * Get the element at the specified index in the {@link CollectionHolder collection}
     *
     * @param index The index to retrieve a value
     * @alias get
     */
    elementAt(index: number,): T

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Get or else methods --------------------

    /**
     * Get the element at the specified index in the current {@link CollectionHolder collection}
     * or calling the {@link defaultValue} function
     * if it is out of bound of the current {@link CollectionHolder collection}
     *
     * @param index        The index to retrieve a value
     * @param defaultValue The callback to retrieve the default value if it is over the {@link size}
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/get-or-else.html Kotlin getOrElse(key, defaultValue)
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/element-at-or-else.html Kotlin elementAtOrElse(key, defaultValue)
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
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/get-or-else.html Kotlin getOrElse(key, defaultValue)
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/element-at-or-else.html Kotlin elementAtOrElse(key, defaultValue)
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

    //#endregion -------------------- Get or else methods --------------------
    //#region -------------------- Get or null methods --------------------

    /**
     * Get the element at the specified index in the {@link CollectionHolder collection}
     * or <b>null</b> if it is over the {@link size}
     *
     * @param index The index to retrieve a value
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/get-or-null.html Kotlin getOrNull(index)
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/element-at-or-null.html Kotlin elementAtOrNull(index)
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

    //#endregion -------------------- Get or null methods --------------------

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Index of methods --------------------

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the current {@link CollectionHolder collection}
     * from a range (if provided)
     *
     * @param element   The element to find
     * @param fromIndex The inclusive starting index
     * @param toIndex   The inclusive ending index
     * @param limit     The maximum index
     * @return {NullOr<number>} The index associated to the {@link element} within the range or <b>null</b>
     * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex}, {@link toIndex} and {@link limit} are not within a valid range
     * @see ReadonlyArray.indexOf
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index-of.html Kotlin indexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item, fromIndex?, limit?)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOf(element: T, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number>

    /**
     * Get the <b>first</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the current {@link CollectionHolder collection}
     * from a range (if provided)
     *
     * @param element   The element to find
     * @param fromIndex The inclusive starting index
     * @param toIndex   The inclusive ending index
     * @param limit     The maximum index
     * @return {NullOr<number>} The index associated to the {@link element} within the range or <b>null</b>
     * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex}, {@link toIndex} and {@link limit} are not within a valid range
     * @see ReadonlyArray.indexOf
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index-of.html Kotlin indexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item, fromIndex?, limit?)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOf(element: unknown, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number>


    /**
     * Get the <b>last</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the current {@link CollectionHolder collection}
     * from a range (if provided)
     *
     * @param element   The element to find
     * @param fromIndex The inclusive starting index
     * @param toIndex   The inclusive ending index
     * @param limit     The maximum index
     * @return {NullOr<number>} The index associated to the {@link element} within the range or <b>null</b>
     * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex}, {@link toIndex} and {@link limit} are not within a valid range
     * @see ReadonlyArray.lastIndexOf
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/last-index-of.html Kotlin lastIndexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item, fromIndex?, limit?)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    lastIndexOf(element: T, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number>

    /**
     * Get the <b>last</b> occurrence equivalent to the value received
     * or <b>null</b> if it was not in the current {@link CollectionHolder collection}
     * from a range (if provided)
     *
     * @param element   The element to find
     * @param fromIndex The inclusive starting index
     * @param toIndex   The inclusive ending index
     * @param limit     The maximum index
     * @return {NullOr<number>} The index associated to the {@link element} within the range or <b>null</b>
     * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex}, {@link toIndex} and {@link limit} are not within a valid range
     * @see ReadonlyArray.lastIndexOf
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/last-index-of.html Kotlin lastIndexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item, fromIndex?, limit?)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    lastIndexOf(element: unknown, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number>


    /**
     * Get the first index matching the {@link predicate}
     * or <b>null</b> if it was not in the current {@link CollectionHolder collection}
     * from a range (if provided)
     *
     * @param predicate The given predicate
     * @param fromIndex The inclusive starting index
     * @param toIndex   The inclusive ending index
     * @param limit     The maximum index
     * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex}, {@link toIndex} and {@link limit} are not within a valid range
     * @return {NullOr<number>} The index matching the {@link predicate} within the range or <b>null</b>
     * @see ReadonlyArray.findIndex
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfFirst(predicate: BooleanCallback<T>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number>

    /**
     * Get the first index matching the {@link predicate}
     * or <b>null</b> if it was not in the current {@link CollectionHolder collection}
     * from a range (if provided)
     *
     * @param predicate The given predicate
     * @param fromIndex The inclusive starting index
     * @param toIndex   The inclusive ending index
     * @param limit     The maximum index
     * @return {NullOr<number>} The index matching the {@link predicate} within the range or <b>null</b>
     * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex}, {@link toIndex} and {@link limit} are not within a valid range
     * @see ReadonlyArray.findIndex
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number>


    /**
     * Get the last index matching the {@link predicate}
     * or <b>null</b> if it was not in the current {@link CollectionHolder collection}
     * from a range (if provided)
     *
     * @param predicate The given predicate
     * @param fromIndex The inclusive starting index
     * @param toIndex   The inclusive ending index
     * @param limit     The maximum index
     * @return {NullOr<number>} The index matching the {@link predicate} within the range or <b>null</b>
     * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex}, {@link toIndex} and {@link limit} are not within a valid range
     * @see ReadonlyArray.findLastIndex
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfLast(predicate: BooleanCallback<T>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number>

    /**
     * Get the last index matching the {@link predicate}
     * or <b>null</b> if it was not in the current {@link CollectionHolder collection}
     * from a range (if provided)
     *
     * @param predicate The given predicate
     * @param fromIndex The inclusive starting index
     * @param toIndex   The inclusive ending index
     * @param limit     The maximum index
     * @return {NullOr<number>} The index matching the {@link predicate} within the range or <b>null</b>
     * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex}, {@link toIndex} and {@link limit} are not within a valid range
     * @see ReadonlyArray.findLastIndex
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): NullOr<number>

    //#endregion -------------------- Index of methods --------------------
    //#region -------------------- First methods --------------------

    /**
     * Get the first element in the current {@link CollectionHolder collection}
     *
     * @throws EmptyCollectionHolderException The {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first.html Kotlin first()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First()
     */
    first(): NonNullable<T>

    /**
     * Get the first element in the current {@link CollectionHolder collection}
     * matching the given {@link predicate}
     *
     * @param predicate The matching predicate
     * @throws EmptyCollectionHolderException            The {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@link predicate}
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first.html Kotlin first(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
     * @typescriptDefinition
     */
    first<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NonNullable<S>

    /**
     * Get the first element in the current {@link CollectionHolder collection}
     * matching the given {@link predicate}
     *
     * @param predicate The matching predicate
     * @throws EmptyCollectionHolderException            The {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@link predicate}
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first.html Kotlin first(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
     */
    first(predicate: Nullable<BooleanCallback<T>>,): NonNullable<T>


    /**
     * Get the first element in the current {@link CollectionHolder collection}
     * or <b>null</b> if the {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     *
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault()
     */
    firstOrNull(): NullOr<T>

    /**
     * Get the first element in the current {@link CollectionHolder collection}
     * matching the given {@link predicate} or <b>null</b>
     * if the {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     *
     * @param predicate The matching predicate
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
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
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     */
    firstOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>

    //#endregion -------------------- First methods --------------------
    //#region -------------------- Last methods --------------------

    /**
     * Get the last element in the current {@link CollectionHolder collection}
     *
     * @throws EmptyCollectionHolderException The {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/last.html Kotlin last()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last()
     */
    last(): NonNullable<T>

    /**
     * Get the last element in the current {@link CollectionHolder collection}
     * matching the given {@link predicate}
     *
     * @param predicate The matching predicate
     * @throws EmptyCollectionHolderException            The {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@link predicate}
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/last.html Kotlin last(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
     * @typescriptDefinition
     */
    last<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NonNullable<S>

    /**
     * Get the last element in the current {@link CollectionHolder collection}
     * matching the given {@link predicate}
     *
     * @param predicate The matching predicate
     * @throws EmptyCollectionHolderException            The {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     * @throws CollectionHolderIndexOutOfBoundsException No element could be found from the {@link predicate}
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/last.html Kotlin last(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
     */
    last(predicate: Nullable<BooleanCallback<T>>,): NonNullable<T>


    /**
     * Get the last element in the current {@link CollectionHolder collection}
     * or <b>null</b> if the {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     *
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault()
     */
    lastOrNull(): NullOr<T>

    /**
     * Get the last element in the current {@link CollectionHolder collection}
     * matching the given {@link predicate}
     * or <b>null</b> if the {@link CollectionHolder collection} {@link CollectionHolder.isEmpty is empty}
     *
     * @param predicate The matching predicate
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull(predicate)
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
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
     */
    lastOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>

    //#endregion -------------------- Last methods --------------------

    //#endregion -------------------- Value methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- All / any / none methods --------------------

    //#region -------------------- All methods --------------------

    /**
     * Check if <b>every</b> element in the current {@link CollectionHolder collection}
     * match the given {@link predicate}
     *
     * @param predicate The matching predicate
     * @return {boolean} <b>true</b> only if every value in the current {@link CollectionHolder collection} is applicable to the {@link predicate}
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/all.html Kotlin all()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.all C# All()
     */
    all(predicate: BooleanCallback<T>,): boolean

    //#endregion -------------------- All methods --------------------
    //#region -------------------- Any methods --------------------

    /**
     * Tell if the current {@link CollectionHolder collection} {@link CollectionHolder.isNotEmpty is not empty}
     *
     * @return {boolean} {@link isNotEmpty}
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/any.html Kotlin any()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any C# Any()
     * @alias isNotEmpty
     */
    any(): this["isNotEmpty"]

    /**
     * Check if <b>one</b> of the elements in the current {@link CollectionHolder collection}
     * match the given {@link predicate}
     *
     * @param predicate The condition to check on each value
     * @return {boolean} <b>true</b> if at least one {@link predicate} is <b>true</b> on a value of the current {@link CollectionHolder collection}
     * @see ReadonlyArray.some
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/any.html Kotlin any(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any C# Any(predicate)
     */
    any(predicate: Nullable<BooleanCallback<T>>,): boolean

    //#endregion -------------------- All methods --------------------
    //#region -------------------- None methods --------------------

    /**
     * Tell if the current {@link CollectionHolder collection} {@link isEmpty is empty}
     *
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/none.html Kotlin none()
     * @alias isEmpty
     */
    none(): this["isEmpty"]

    /**
     * Check if <b>no</b> element in the current {@link CollectionHolder collection}
     * match the given {@link predicate}
     *
     * @param predicate The condition to check on each value
     * @return {boolean} <b>false</b> if at least one {@link predicate} is <b>true</b> on a value of the current {@link CollectionHolder collection}
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/none.html Kotlin none(predicate)
     */
    none(predicate: Nullable<BooleanCallback<T>>,): boolean

    //#endregion -------------------- None methods --------------------

    //#endregion -------------------- All / any / none methods --------------------
    //#region -------------------- Has methods --------------------

    //#region -------------------- Has one methods --------------------

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @return {boolean} <b>true</b> if at least one value is equals to one value in the current {@link CollectionHolder collection}
     * @see includesOne
     * @see containsOne
     * @see ReadonlyArray.includes
     * @see ReadonlySet.has
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains.html Kotlin contains(element)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.contains C# contains(value)
     */
    hasOne(...values: readonly T[]): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @return {boolean} <b>true</b> if at least one value is equals to one value in the current {@link CollectionHolder collection}
     * @see includesOne
     * @see containsOne
     * @see ReadonlyArray.includes
     * @see ReadonlySet.has
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains.html Kotlin contains(element)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.contains C# contains(value)
     */
    hasOne(...values: readonly unknown[]): boolean

    //#region -------------------- Has one methods (aliases) --------------------

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @return {boolean} <b>true</b> if at least one value is equals to one value in the current {@link CollectionHolder collection}
     * @alias hasOne
     */
    includesOne(...values: readonly T[]): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @return {boolean} <b>true</b> if at least one value is equals to one value in the current {@link CollectionHolder collection}
     * @alias hasOne
     */
    includesOne(...values: readonly unknown[]): boolean


    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @return {boolean} <b>true</b> if at least one value is equals to one value in the current {@link CollectionHolder collection}
     * @alias hasOne
     */
    containsOne(...values: readonly T[]): boolean

    /**
     * Tell whenever at least one value exist in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @return {boolean} <b>true</b> if at least one value is equals to one value in the current {@link CollectionHolder collection}
     * @alias hasOne
     */
    containsOne(...values: readonly unknown[]): boolean

    //#endregion -------------------- Has one methods (aliases) --------------------

    //#endregion -------------------- Has one methods --------------------
    //#region -------------------- Has all methods --------------------

    /**
     * Tell that every value received is in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @return {boolean} Every {@link values} are in the current {@link CollectionHolder collection}
     * @see includesAll
     * @see containsAll
     * @see ReadonlyArray.includes
     * @see ReadonlySet.has
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains-all.html Kotlin containsAll(elements)
     */
    hasAll(...values: readonly T[]): boolean

    /**
     * Tell that every value received are in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @return {boolean} Every {@link values} are in the current {@link CollectionHolder collection}
     * @see includesAll
     * @see containsAll
     * @see ReadonlyArray.includes
     * @see ReadonlySet.has
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/contains-all.html Kotlin containsAll(elements)
     */
    hasAll(...values: readonly unknown[]): boolean

    //#region -------------------- Has all methods (aliases) --------------------

    /**
     * Tell that every value received is in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @return {boolean} Every {@link values} are in the current {@link CollectionHolder collection}
     * @alias hasAll
     */
    includesAll(...values: readonly T[]): boolean

    /**
     * Tell that every value received is in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @return {boolean} Every {@link values} are in the current {@link CollectionHolder collection}
     * @alias hasAll
     */
    includesAll(...values: readonly unknown[]): boolean


    /**
     * Tell that every value received is in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @return {boolean} Every {@link values} are in the current {@link CollectionHolder collection}
     * @alias hasAll
     */
    containsAll(...values: readonly T[]): boolean

    /**
     * Tell that every value received is in the current {@link CollectionHolder collection}
     *
     * @param values The values to compare
     * @return {boolean} Every {@link values} are in the current {@link CollectionHolder collection}
     * @alias hasAll
     */
    containsAll(...values: readonly unknown[]): boolean

    //#endregion -------------------- Has all methods (aliases) --------------------

    //#endregion -------------------- Has all methods --------------------

    //#endregion -------------------- Has methods --------------------
    //#region -------------------- Join methods --------------------

    /**
     * Create a new {@link String} from every element in the current {@link CollectionHolder collection} using a {@link separator}
     * utilizing the given {@link prefix} and {@link postfix} if supplied.
     *
     * Note that if the current {@link CollectionHolder collection} is huge,
     * a {@link limit} can be specified followed by a {@link truncated} value.
     *
     * @param separator The separator for the result ({@link CollectionConstants.DEFAULT_JOIN_SEPARATOR ", "} by default)
     * @param prefix    The character before the join ({@link CollectionConstants.DEFAULT_JOIN_PREFIX "["} by default)
     * @param postfix   The character after the join ({@link CollectionConstants.DEFAULT_JOIN_POSTFIX  "]"} by default)
     * @param limit     The maximum amount of values in the join (null by default)
     * @param truncated The truncated string if there is a limit ({@link CollectionConstants.DEFAULT_JOIN_TRUNCATED "…"} by default)
     * @param transform A callback to transform into a {@link String}
     * @throws CollectionHolderIndexOutOfBoundsException The {@link limit} is not within a valid range
     * @see ReadonlyArray.join
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/join-to-string.html Kotlin joinToString()
     * @see https://learn.microsoft.com/dotnet/api/system.string.join C# string.Join()
     * @canReceiveNegativeValue
     */
    join(separator?: Nullable<string>, prefix?: Nullable<string>, postfix?: Nullable<string>, limit?: Nullable<number>, truncated?: Nullable<string>, transform?: Nullable<StringCallback<T>>,): string

    //#endregion -------------------- Join methods --------------------
    //#region -------------------- Filter methods --------------------

    //#region -------------------- Filter methods --------------------

    /**
     * Get a new {@link CollectionHolder collection}
     * matching only the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.filter
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/filter.html Kotlin filter(predicate)
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
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/filter.html Kotlin filter(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
     * @see filterNot
     */
    filter(predicate: BooleanCallback<T>,): CollectionHolder<T>

    //#endregion -------------------- Filter methods --------------------
    //#region -------------------- Filter indexed methods --------------------

    /**
     * Get a new {@link CollectionHolder collection}
     * matching only the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.filter
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/filter-indexed.html Kotlin filterIndexed(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
     * @see filterIndexedNot
     * @typescriptDefinition
     */
    filterIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<T>

    /**
     * Get a new {@link CollectionHolder collection}
     * matching only the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.filter
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/filter-indexed.html Kotlin filterIndexed(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
     * @see filterIndexedNot
     */
    filterIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>

    //#endregion -------------------- Filter indexed methods --------------------
    //#region -------------------- Filter not methods --------------------

    /**
     * Get a new {@link CollectionHolder}
     * not matching the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.filter
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/filter-not.html Kotlin filterNot(predicate)
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
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/filter-not.html Kotlin filterNot(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
     * @see filter
     */
    filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T>

    //#endregion -------------------- Filter not methods --------------------
    //#region -------------------- Filter indexed not methods --------------------

    /**
     * Get a new {@link CollectionHolder}
     * not matching the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.filter
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/filter-not.html Kotlin filterNot(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
     * @see filterIndexed
     * @typescriptDefinition
     */
    filterIndexedNot<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<T>

    /**
     * Get a new {@link CollectionHolder}
     * not matching the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.filter
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/filter-not.html Kotlin filterNot(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
     * @see filterIndexed
     */
    filterIndexedNot(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>

    //#endregion -------------------- Filter indexed not methods --------------------
    //#region -------------------- Filter not null methods --------------------

    /**
     * Get a new {@link CollectionHolder} without <b>null</b> or <b>undefined</b>
     *
     * @see ReadonlyArray.filter
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/filter-not-null.html Kotlin filterNotNull()
     * @see requireNoNulls
     */
    filterNotNull(): CollectionHolder<NonNullable<T>>

    //#endregion -------------------- Filter not null methods --------------------
    //#region -------------------- Require not nulls methods --------------------

    /**
     * Require that no items are <b>null</b> or <b>undefined</b> in the current {@link CollectionHolder collection}
     *
     * @throws {TypeError} There is <b>null</b> or <b>undefined</b> value in the current collection
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
     * @see filterNotNull
     */
    requireNoNulls(): CollectionHolder<NonNullable<T>>

    //#endregion -------------------- Require not nulls methods --------------------

    //#endregion -------------------- Filter methods --------------------
    //#region -------------------- Find methods --------------------

    //#region -------------------- Find methods --------------------

    /**
     * Get the first element found or <b>null</b> if nothing was found
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/find.html Kotlin find(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     * @typescriptDefinition
     */
    find<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>

    /**
     * Get the first element found or <b>null</b> if nothing was found
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/find.html Kotlin find(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     */
    find(predicate: BooleanCallback<T>,): NullOr<T>

    //#endregion -------------------- Find methods --------------------
    //#region -------------------- Find indexed methods --------------------

    /**
     * Get the first element found or <b>null</b> if nothing was found
     *
     * @param callback The given predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/find.html Kotlin find(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     * @typescriptDefinition
     */
    findIndexed<const S extends T, >(callback: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>

    /**
     * Get the first element found or <b>null</b> if nothing was found
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/find.html Kotlin find(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     */
    findIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>

    //#endregion -------------------- Find indexed methods --------------------
    //#region -------------------- Find last methods --------------------

    /**
     * Get the last element found or <b>null</b> if nothing was found
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.findLast
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
     * @typescriptDefinition
     */
    findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>

    /**
     * Get the last element found or <b>null</b> if nothing was found
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.findLast
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
     */
    findLast(predicate: BooleanCallback<T>,): NullOr<T>

    //#endregion -------------------- Find last methods --------------------
    //#region -------------------- Find last indexed methods --------------------

    /**
     * Get the last element found or <b>null</b> if nothing was found
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.findLast
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
     * @typescriptDefinition
     */
    findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>

    /**
     * Get the last element found or <b>null</b> if nothing was found
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.findLast
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
     */
    findLastIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>

    //#endregion -------------------- Find last indexed methods --------------------

    //#endregion -------------------- Find methods --------------------
    //#region -------------------- Slice methods --------------------

    //#region -------------------- Slice (indice) methods --------------------

    /**
     * Create a new {@link CollectionHolder} from the {@link indices}
     * in the current {@link CollectionHolder collection}
     *
     * @param indices The given indices
     * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the current {@link CollectionHolder collection}
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
     */
    slice(indices: readonly number[],): CollectionHolder<T>

    /**
     * Create a new {@link CollectionHolder} from the {@link indices}
     * in the current {@link CollectionHolder collection}
     *
     * @param indices The given indices
     * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the current {@link CollectionHolder collection}
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
     */
    slice(indices: ReadonlySet<number>,): CollectionHolder<T>

    /**
     * Create a new {@link CollectionHolder} from the {@link indices}
     * in the current {@link CollectionHolder collection}
     *
     * @param indices The given indices
     * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the current {@link CollectionHolder collection}
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
     */
    slice(indices: MinimalistCollectionHolder<number>,): CollectionHolder<T>

    /**
     * Create a new {@link CollectionHolder} from the {@link indices}
     * in the current {@link CollectionHolder collection}
     *
     * @param indices The given indices
     * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the current {@link CollectionHolder collection}
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
     */
    slice(indices: CollectionIterator<number>,): CollectionHolder<T>

    /**
     * Create a new {@link CollectionHolder} from the {@link indices}
     * in the current {@link CollectionHolder collection}
     *
     * @param indices The given indices
     * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the current {@link CollectionHolder collection}
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
     */
    slice(indices: Iterable<number>,): CollectionHolder<T>

    //#endregion -------------------- Slice (indice) methods --------------------
    //#region -------------------- Slice (from, to, limit) methods --------------------

    /**
     * Create a new {@link CollectionHolder} from the {@link indices}
     * in the current {@link CollectionHolder collection}
     *
     * @param fromIndex The starting index
     * @param toIndex  The ending index
     * @param limit    The maximum index
     * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex},
     *             {@link toIndex} and {@link limit} are not within a valid range
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
     */
    slice(fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): CollectionHolder<T>

    //#endregion -------------------- Slice (from, to, limit) methods --------------------

    /**
     * Create a new {@link CollectionHolder} from the {@link indicesOrFromIndex}
     * in the current {@link CollectionHolder collection}
     *
     * @param indicesOrFromIndex The given indices (or starting index)
     * @param toIndex            The ending index
     * @param limit              The maximum index
     * @throws CollectionHolderIndexOutOfBoundsException The {@link indicesOrFromIndex},
     *             {@link toIndex} and {@link limit} are not within a valid range
     * @throws CollectionHolderIndexOutOfBoundsException An indice is not in the current {@link CollectionHolder collection}
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
     * @typescriptDefinition
     */
    slice(indicesOrFromIndex?: Nullable<| readonly number[] | ReadonlySet<number> | MinimalistCollectionHolder<number> | CollectionIterator<number> | Iterable<number> | number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): CollectionHolder<T>

    //#endregion -------------------- Slice methods --------------------
    //#region -------------------- Map methods --------------------

    //#region -------------------- Map methods --------------------

    /**
     * Create a new {@link CollectionHolder} applying a {@link transform} function
     * on each element of the current {@link CollectionHolder collection}
     *
     * @param transform The given transform
     * @see ReadonlyArray.map
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/map.html Kotlin map(transform)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select C# Select(selector)
     * @see mapNotNull
     */
    map<const U, >(transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U>

    //#endregion -------------------- Map methods --------------------
    //#region -------------------- Map indexed methods --------------------

    /**
     * Create a new {@link CollectionHolder} applying a {@link transform} function
     * on each element of the current {@link CollectionHolder collection}
     *
     * @param transform The given transform
     * @see ReadonlyArray.map
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/map-indexed.html Kotlin mapIndexed(transform)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select C# Select(selector)
     * @see mapNotNullIndexed
     */
    mapIndexed<const U, >(transform: IndexValueWithReturnCallback<T, U>,): CollectionHolder<U>

    //#endregion -------------------- Map indexed methods --------------------
    //#region -------------------- Map not null methods --------------------

    /**
     * Create a new {@link CollectionHolder} applying a {@link transform} function
     * on each non-null element of the current {@link CollectionHolder collection}
     *
     * @param transform The given transform
     * @see ReadonlyArray.map
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/map-not-null.html Kotlin mapNotNull(transform)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select C# Select(selector)
     * @see map
     */
    mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U>

    //#endregion -------------------- Map not null methods --------------------
    //#region -------------------- Map not null indexed methods --------------------

    /**
     * Create a new {@link CollectionHolder} applying a {@link transform} function
     * on each non-null element of the current {@link CollectionHolder collection}
     *
     * @param transform The given transform
     * @see ReadonlyArray.map
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/map-not-null.html Kotlin mapNotNull(transform)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select C# Select(selector)
     * @see mapIndexed
     */
    mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U>

    //#endregion -------------------- Map not null indexed methods --------------------

    //#endregion -------------------- Map methods --------------------
    //#region -------------------- For each methods --------------------

    //#region -------------------- For each methods --------------------

    /**
     * Perform a given {@link action} on each element
     * and return the current {@link CollectionHolder collection} afterwards
     *
     * @param action The given action
     * @see ReadonlyArray.forEach
     * @see ReadonlySet.forEach
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/on-each.html Kotlin onEach(action)
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/for-each.html Kotlin forEach(action)
     */
    forEach(action: ValueIndexCallback<T>,): this

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- For each indexed methods --------------------

    /**
     * Perform a given {@link action} on each element
     * and return the current {@link CollectionHolder collection} afterwards
     *
     * @param action The given action
     * @see ReadonlyArray.forEach
     * @see ReadonlySet.forEach
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/on-each-indexed.html Kotlin onEachIndexed(action)
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/for-each-indexed.html Kotlin forEachIndexed(action)
     */
    forEachIndexed(action: IndexValueCallback<T>,): this

    //#endregion -------------------- For each indexed methods --------------------

    //#endregion -------------------- For each methods --------------------

    //#endregion -------------------- Loop methods --------------------
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

    /** Get an every object associated to the typed value */
    get objectValuesMap(): ReadonlyMap<T, ObjectOf<T>>

    //#region -------------------- Conversion methods (toIterator) --------------------

    /** Convert the current {@link CollectionHolder collection} to a new {@link CollectionIterator} */
    toIterator(): CollectionIterator<T>

    //#endregion -------------------- Conversion methods (toIterator) --------------------
    //#region -------------------- Conversion methods (toArray) --------------------

    /** Convert the current {@link CollectionHolder collection} to a new {@link ReadonlyArray array} */
    toArray(): readonly T[]

    /** Convert the current {@link CollectionHolder collection} to a new {@link Array mutable array} */
    toMutableArray(): T[]

    //#endregion -------------------- Conversion methods (toArray) --------------------
    //#region -------------------- Conversion methods (toSet) --------------------

    /** Convert the current {@link CollectionHolder collection} to a new {@link ReadonlySet set} */
    toSet(): ReadonlySet<T>

    /** Convert the current {@link CollectionHolder collection} to a new {@link Set mutable set} */
    toMutableSet(): Set<T>


    /** Convert the current {@link CollectionHolder collection} to a new {@link WeakSet weak set} */
    toWeakSet(): Readonly<WeakSet<ObjectOf<T>>>

    /** Convert the current {@link CollectionHolder collection} to a new {@link WeakSet mutable weak set} */
    toMutableWeakSet(): WeakSet<ObjectOf<T>>

    //#endregion -------------------- Conversion methods (toSet) --------------------
    //#region -------------------- Conversion methods (toMap) --------------------

    /** Convert the current {@link CollectionHolder collection} to a new {@link ReadonlyMap map} */
    toMap(): ReadonlyMap<number, T>

    /** Convert the current {@link CollectionHolder collection} to a new {@link Map mutable map} */
    toMutableMap(): Map<number, T>

    //#endregion -------------------- Conversion methods (toMap) --------------------
    //#region -------------------- Conversion methods (toReverse) --------------------

    /**
     * Reverse the current {@link CollectionHolder collection} from a range (if provided)
     *
     * @param fromIndex The inclusive starting index
     * @param toIndex   The inclusive ending index
     * @param limit     The maximum index
     * @throws CollectionHolderIndexOutOfBoundsException The {@link fromIndex}, {@link toIndex} and {@link limit} are not within a valid range
     * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed Array.toReverse()
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/reversed.html Kotlin reversed()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
     * @canReceiveNegativeValue
     */
    toReversed(fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): CollectionHolder<T>

    //#endregion -------------------- Conversion methods (toReverse) --------------------
    //#region -------------------- Conversion methods (toString) --------------------

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
    toLocaleString(locale?: Nullable<string>,): string


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
    toLocaleLowerCaseString(locale?: Nullable<string>,): string


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
    toLocaleUpperCaseString(locale?: Nullable<string>,): string

    //#endregion -------------------- Conversion methods (toString) --------------------

    //#endregion -------------------- Conversion methods --------------------

}

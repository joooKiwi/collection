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

import type {Array, MutableNumberKeyMap, MutableSet, Nullable, NullableNumber, NullOr, NullOrZeroNumber, NumberArray, NumberKeyMap, NumberSet, Set} from "@joookiwi/type"

import type {CollectionHolder}                                                                                                                                                                                          from "./CollectionHolder"
import type {CollectionIteratorOf1}                                                                                                                                                                                     from "./iterator/CollectionIteratorOf1"
import type {MinimalistCollectionHolder}                                                                                                                                                                                from "./MinimalistCollectionHolder"
import type {CollectionIterator}                                                                                                                                                                                        from "./iterator/CollectionIterator"
import type {BooleanCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, RestrainedBooleanCallback, ReturnCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, ValueIndexWithReturnCallback} from "./type/callback"
import type {CollectionHolderOf0Or1}                                                                                                                                                                                    from "./type/collection"
import type {IndexOf1}                                                                                                                                                                                                  from "./type/indexOf"
import type {PossibleIterableIteratorArraySetOrCollectionHolder}                                                                                                                                                        from "./type/possibleInstance"
import type {SingleValueFromIndex, SingleValueFromIndexOrElse, SingleValueFromIndexOrNull}                                                                                                                              from "./type/value"

/**
 * An instance of {@link CollectionHolder} with only a single value
 *
 * @typeParam T The type (`unknown` by default)
 */
export interface CollectionHolderOf1<out T = unknown, >
    extends CollectionHolder<T> {

    //#region -------------------- Value methods --------------------

    /** The only value of the current {@link CollectionHolderOf1 instance} */
    readonly 0: T

    /** The only value of the current {@link CollectionHolderOf1 instance} */
    readonly value: T

    //#endregion -------------------- Value methods --------------------
    //#region -------------------- Size methods --------------------

    /**
     * Get the size of the current {@link CollectionHolderOf1 instance} as `1`
     *
     * @see ReadonlyArray.length
     * @see ReadonlySet.size
     * @see ReadonlyMap.size
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/size.html Kotlin Collection.size()
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/size.html Kotlin Map.size()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Collection.html#size() Java Collection.size()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Map.html#size() Java Map.size()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.count C# Count()
     */
    readonly size: 1

    /**
     * Get the size of the current {@link CollectionHolderOf1 instance} as `1`
     *
     * @see ReadonlyArray.length
     * @see ReadonlySet.size
     * @see ReadonlyMap.size
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/size.html Kotlin Collection.size()
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/size.html Kotlin Map.size()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Collection.html#size() Java Collection.size()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Map.html#size() Java Map.size()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.count C# Count()
     * @alias CollectionHolderOf1.size
     */
    readonly length: this["size"]

    /**
     * Get the size of the current {@link CollectionHolderOf1 instance} as `1`
     *
     * @see ReadonlyArray.length
     * @see ReadonlySet.size
     * @see ReadonlyMap.size
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/size.html Kotlin Collection.size()
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/size.html Kotlin Map.size()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Collection.html#size() Java Collection.size()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Map.html#size() Java Map.size()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.count C# Count()
     * @alias CollectionHolderOf1.size
     */
    readonly count: this["size"]


    /**
     * The current {@link CollectionHolderOf1 instance} __NEVER__ has no values
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-empty.html Kotlin isEmpty()
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/is-empty.html Kotlin Collection.isEmpty()
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/is-empty.html Kotlin Map.isEmpty()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Collection.html#isEmpty() Java Collection.isEmpty()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Map.html#isEmpty Java Map.isEmpty()
     */
    readonly isEmpty: false

    /**
     * The current {@link CollectionHolderOf1 instance} has a minimum of 1 value (which is `true`)
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-not-empty.html Kotlin isNotEmpty()
     */
    readonly isNotEmpty: true


    /**
     * The current {@link CollectionHolderOf1 instance} has a minimum of 1 value (which is `true`)
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-not-empty.html Kotlin isNotEmpty()
     * @alias CollectionHolderOf1.isNotEmpty
     */
    readonly hasAtLeast1Element: this["isNotEmpty"]

    /**
     * The current {@link CollectionHolderOf1 instance} has a minimum of 1 value (which is `true`)
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-not-empty.html Kotlin isNotEmpty()
     * @alias CollectionHolderOf1.isNotEmpty
     */
    readonly containsAtLeast1Element: this["isNotEmpty"]

    /**
     * The current {@link CollectionHolderOf1 instance} has a minimum of 1 value (which is `true`)
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-not-empty.html Kotlin isNotEmpty()
     * @alias CollectionHolderOf1.isNotEmpty
     */
    readonly includesAtLeast1Element: this["isNotEmpty"]


    /** The current {@link CollectionHolderOf1 instance} has exactly 1 value (which is `true`) */
    readonly hasExactly1Element: true

    /**
     * The current {@link CollectionHolderOf1 instance} has exactly 1 value (which is `true`)
     *
     * @alias CollectionHolderOf1.hasExactly1Element
     */
    readonly containsExactly1Element: this["hasExactly1Element"]

    /**
     * The current {@link CollectionHolderOf1 instance} has exactly 1 value (which is `true`)
     *
     * @alias CollectionHolderOf1.hasExactly1Element
     */
    readonly includesExactly1Element: this["hasExactly1Element"]


    /** The current {@link CollectionHolderOf1 instance} has exactly 0 or 1 value (which is `true`) */
    readonly hasAtMost1Element: true

    /**
     * The current {@link CollectionHolderOf1 instance} has exactly 0 or 1 value (which is `true`)
     *
     * @alias CollectionHolderOf1.hasAtMost1Element
     */
    readonly containsAtMost1Element: this["hasAtMost1Element"]

    /**
     * The current {@link CollectionHolderOf1 instance} has exactly 0 or 1 value (which is `true`)
     *
     * @alias CollectionHolderOf1.hasAtMost1Element
     */
    readonly includesAtMost1Element: this["hasAtMost1Element"]


    /** The current {@link CollectionHolderOf1 instance} has a minimum of 2 values (which is `false`) */
    readonly hasAtLeast2Elements: false

    /**
     * The current {@link CollectionHolderOf1 instance} has a minimum of 2 values (which is `false`)
     *
     * @alias CollectionHolderOf1.hasAtLeast2Elements
     */
    readonly containsAtLeast2Elements: this["hasAtLeast2Elements"]

    /**
     * The current {@link CollectionHolderOf1 instance} has a minimum of 2 values (which is `false`)
     *
     * @alias CollectionHolderOf1.hasAtLeast2Elements
     */
    readonly includesAtLeast2Elements: this["hasAtLeast2Elements"]


    /** The current {@link CollectionHolderOf1 instance} has exactly 2 values (which is `false`) */
    readonly hasExactly2Elements: false

    /**
     * The current {@link CollectionHolderOf1 instance} has exactly 2 values (which is `false`)
     *
     * @alias CollectionHolderOf1.hasExactly2Elements
     */
    readonly containsExactly2Elements: this["hasExactly2Elements"]

    /**
     * The current {@link CollectionHolderOf1 instance} has exactly 2 values (which is `false`)
     *
     * @alias CollectionHolderOf1.hasExactly2Elements
     */
    readonly includesExactly2Elements: this["hasExactly2Elements"]


    /** The current {@link CollectionHolderOf1 instance} has exactly 0, 1 or 2 values (which is `true`) */
    readonly hasAtMost2Elements: true

    /**
     * The current {@link CollectionHolderOf1 instance} has exactly 0, 1 or 2 values (which is `true`)
     *
     * @alias CollectionHolderOf1.hasAtMost2Elements
     */
    readonly containsAtMost2Elements: this["hasAtMost2Elements"]

    /**
     * The current {@link CollectionHolderOf1 instance} has exactly 0, 1 or 2 values (which is `true`)
     *
     * @alias CollectionHolderOf1.hasAtMost2Elements
     */
    readonly includesAtMost2Elements: this["hasAtMost2Elements"]

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    /**
     * Get the {@link value} if the {@link index} is `0`|`-1` in the current {@link collectionHolderOf1 instance}
     *
     * @param index The index to retrieve a value
     * @throws IndexOutOfBoundsException The {@link index} is not `0` or `-1`
     * @throws ForbiddenIndexException   The {@link index} is a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.at
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/get.html Kotlin get(index)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#get(int) Java get(index)
     * @typescriptDefinition
     * @canReceiveNegativeValue
     */
    get<const I extends number, >(index: I,): SingleValueFromIndex<I, T>

    /**
     * Get the {@link value} if the {@link index} is `0`|`-1` in the current {@link collectionHolderOf1 instance}
     *
     * @param index The index to retrieve a value
     * @throws IndexOutOfBoundsException The {@link index} is not `0` or `-1`
     * @throws ForbiddenIndexException   The {@link index} is a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.at
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/get.html Kotlin get(index)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#get(int) Java get(index)
     * @canReceiveNegativeValue
     */
    get(index: number,): T


    /**
     * Get the {@link value} if the {@link index} is `0`|`-1` in the current {@link collectionHolderOf1 instance}
     *
     * @param index The index to retrieve a value
     * @throws IndexOutOfBoundsException The {@link index} is not `0` or `-1`
     * @throws ForbiddenIndexException   The {@link index} is a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.at
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/get.html Kotlin get(index)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#get(int) Java get(index)
     * @typescriptDefinition
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf1.get
     */
    at<const I extends number, >(index: I,): SingleValueFromIndex<I, T>

    /**
     * Get the {@link value} if the {@link index} is `0`|`-1` in the current {@link collectionHolderOf1 instance}
     *
     * @param index The index to retrieve a value
     * @throws IndexOutOfBoundsException The {@link index} is not `0` or `-1`
     * @throws ForbiddenIndexException   The {@link index} is a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.at
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/get.html Kotlin get(index)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#get(int) Java get(index)
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf1.get
     */
    at(index: number,): T


    /**
     * Get the {@link value} if the {@link index} is `0`|`-1` in the current {@link collectionHolderOf1 instance}
     *
     * @param index The index to retrieve a value
     * @throws IndexOutOfBoundsException The {@link index} is not `0` or `-1`
     * @throws ForbiddenIndexException   The {@link index} is a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.at
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/get.html Kotlin get(index)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#get(int) Java get(index)
     * @typescriptDefinition
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf1.get
     */
    elementAt<const I extends number, >(index: I,): SingleValueFromIndex<I, T>

    /**
     * Get the {@link value} if the {@link index} is `0`|`-1` in the current {@link collectionHolderOf1 instance}
     *
     * @param index The index to retrieve a value
     * @throws IndexOutOfBoundsException The {@link index} is not `0` or `-1`
     * @throws ForbiddenIndexException   The {@link index} is a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.at
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/get.html Kotlin get(index)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#get(int) Java get(index)
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf1.get
     */
    elementAt(index: number,): T

    //#endregion -------------------- Get --------------------
    //#region -------------------- Get first --------------------

    /**
     * Get the {@link value} in the current {@link CollectionHolderOf1 instance}
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/SequencedCollection.html#getFirst() Java getFirst()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First()
     */
    getFirst(): T

    //#endregion -------------------- Get first --------------------
    //#region -------------------- Get last --------------------

    /**
     * Get the {@link value} in the current {@link CollectionHolderOf1 instance}
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/SequencedCollection.html#getLast() Java getLast()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last()
     */
    getLast(): T

    //#endregion -------------------- Get last --------------------

    //#region -------------------- Get or else --------------------

    /**
     * Get the {@link value} if the {@link index} is `0`|`-1` in the current {@link CollectionHolderOf1 instance}
     * or calling the {@link defaultValue} function otherwise
     *
     * @param index        The index to retrieve a value
     * @param defaultValue The callback to retrieve the default value if it is not `0` or `-1`
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-else.html Kotlin getOrElse(key, defaultValue)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-else.html Kotlin elementAtOrElse(key, defaultValue)
     * @typescriptDefinition
     * @canReceiveNegativeValue
     */
    getOrElse<const U, const I extends number, >(index: I, defaultValue: IndexWithReturnCallback<U>,): SingleValueFromIndexOrElse<I, T, U>

    /**
     * Get the {@link value} if the {@link index} is `0`|`-1` in the current {@link CollectionHolderOf1 instance}
     * or calling the {@link defaultValue} function otherwise
     *
     * @param index        The index to retrieve a value
     * @param defaultValue The callback to retrieve the default value if it is not `0` or `-1`
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-else.html Kotlin getOrElse(key, defaultValue)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-else.html Kotlin elementAtOrElse(key, defaultValue)
     * @canReceiveNegativeValue
     */
    getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U

    /**
     * Get the {@link value} if the {@link index} is `0`|`-1` in the current {@link CollectionHolderOf1 instance}
     * or calling the {@link defaultValue} function otherwise
     *
     * @param index        The index to retrieve a value
     * @param defaultValue The callback to retrieve the default value if it is not `0` or `-1`
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-else.html Kotlin getOrElse(key, defaultValue)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-else.html Kotlin elementAtOrElse(key, defaultValue)
     * @canReceiveNegativeValue
     */
    getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T


    /**
     * Get the {@link value} if the {@link index} is `0`|`-1` in the current {@link CollectionHolderOf1 instance}
     * or calling the {@link defaultValue} function otherwise
     *
     * @param index        The index to retrieve a value
     * @param defaultValue The callback to retrieve the default value if it is not `0` or `-1`
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-else.html Kotlin getOrElse(key, defaultValue)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-else.html Kotlin elementAtOrElse(key, defaultValue)
     * @typescriptDefinition
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf1.getOrElse
     */
    atOrElse<const U, const I extends number, >(index: I, defaultValue: IndexWithReturnCallback<U>,): SingleValueFromIndexOrElse<I, T, U>

    /**
     * Get the {@link value} if the {@link index} is `0`|`-1` in the current {@link CollectionHolderOf1 instance}
     * or calling the {@link defaultValue} function otherwise
     *
     * @param index        The index to retrieve a value
     * @param defaultValue The callback to retrieve the default value if it is not `0` or `-1`
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-else.html Kotlin getOrElse(key, defaultValue)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-else.html Kotlin elementAtOrElse(key, defaultValue)
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf1.getOrElse
     */
    atOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U

    /**
     * Get the {@link value} if the {@link index} is `0`|`-1` in the current {@link CollectionHolderOf1 instance}
     * or calling the {@link defaultValue} function otherwise
     *
     * @param index        The index to retrieve a value
     * @param defaultValue The callback to retrieve the default value if it is not `0` or `-1`
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-else.html Kotlin getOrElse(key, defaultValue)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-else.html Kotlin elementAtOrElse(key, defaultValue)
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf1.getOrElse
     */
    atOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T


    /**
     * Get the {@link value} if the {@link index} is `0`|`-1` in the current {@link CollectionHolderOf1 instance}
     * or calling the {@link defaultValue} function otherwise
     *
     * @param index        The index to retrieve a value
     * @param defaultValue The callback to retrieve the default value if it is not `0` or `-1`
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-else.html Kotlin getOrElse(key, defaultValue)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-else.html Kotlin elementAtOrElse(key, defaultValue)
     * @typescriptDefinition
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf1.getOrElse
     */
    elementAtOrElse<const U, const I extends number, >(index: I, defaultValue: IndexWithReturnCallback<U>,): SingleValueFromIndexOrElse<I, T, U>

    /**
     * Get the {@link value} if the {@link index} is `0`|`-1` in the current {@link CollectionHolderOf1 instance}
     * or calling the {@link defaultValue} function otherwise
     *
     * @param index        The index to retrieve a value
     * @param defaultValue The callback to retrieve the default value if it is not `0` or `-1`
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-else.html Kotlin getOrElse(key, defaultValue)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-else.html Kotlin elementAtOrElse(key, defaultValue)
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf1.getOrElse
     */
    elementAtOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U

    /**
     * Get the {@link value} if the {@link index} is `0`|`-1` in the current {@link CollectionHolderOf1 instance}
     * or calling the {@link defaultValue} function otherwise
     *
     * @param index        The index to retrieve a value
     * @param defaultValue The callback to retrieve the default value if it is not `0` or `-1`
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-else.html Kotlin getOrElse(key, defaultValue)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-else.html Kotlin elementAtOrElse(key, defaultValue)
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf1.getOrElse
     */
    elementAtOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T

    //#endregion -------------------- Get or else --------------------
    //#region -------------------- Get first or else --------------------

    /**
     * Get the {@link value} in the current {@link CollectionHolderOf1 instance}
     * and __NEVER__ call the {@link defaultValue} function
     *
     * @param defaultValue The (_never called_) callback to retrieve the default value
     */
    getFirstOrElse<const U, >(defaultValue: ReturnCallback<U>,): T

    /**
     * Get the {@link value} in the current {@link CollectionHolderOf1 instance}
     * and __NEVER__ call the {@link defaultValue} function
     *
     * @param defaultValue The (_never called_) callback to retrieve the default value
     */
    getFirstOrElse(defaultValue: ReturnCallback<T>,): T

    //#endregion -------------------- Get first or else --------------------
    //#region -------------------- Get last or else --------------------

    /**
     * Get the {@link value} in the current {@link CollectionHolderOf1 instance}
     * and __NEVER__ call the {@link defaultValue} function
     *
     * @param defaultValue The (_never called_) callback to retrieve the default value
     */
    getLastOrElse<const U, >(defaultValue: ReturnCallback<U>,): T

    /**
     * Get the {@link value} in the current {@link CollectionHolderOf1 instance}
     * and __NEVER__ call the {@link defaultValue} function
     *
     * @param defaultValue The (_never called_) callback to retrieve the default value
     */
    getLastOrElse(defaultValue: ReturnCallback<T>,): T

    //#endregion -------------------- Get last or else --------------------

    //#region -------------------- Get or null --------------------

    /**
     * Get the {@link value} if the {@link index} is `0`|`-1` in the current {@Link CollectionHolderOf1 instance}
     * or `null` otherwise
     *
     * @param index The index to retrieve a value
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-null.html Kotlin getOrNull(index)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-null.html Kotlin elementAtOrNull(index)
     * @typescriptDefinition
     * @canReceiveNegativeValue
     */
    getOrNull<I extends number, >(index: I,): SingleValueFromIndexOrNull<I, T>

    /**
     * Get the {@link value} if the {@link index} is `0`|`-1` in the current {@Link CollectionHolderOf1 instance}
     * or `null` otherwise
     *
     * @param index The index to retrieve a value
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-null.html Kotlin getOrNull(index)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-null.html Kotlin elementAtOrNull(index)
     * @canReceiveNegativeValue
     */
    getOrNull(index: number,): NullOr<T>


    /**
     * Get the {@link value} if the {@link index} is `0`|`-1` in the current {@Link CollectionHolderOf1 instance}
     * or `null` otherwise
     *
     * @param index The index to retrieve a value
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-null.html Kotlin getOrNull(index)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-null.html Kotlin elementAtOrNull(index)
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf1.getOrNull
     */
    atOrNull<I extends number, >(index: I,): SingleValueFromIndexOrNull<I, T>

    /**
     * Get the {@link value} if the {@link index} is `0`|`-1` in the current {@Link CollectionHolderOf1 instance}
     * or `null` otherwise
     *
     * @param index The index to retrieve a value
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-null.html Kotlin getOrNull(index)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-null.html Kotlin elementAtOrNull(index)
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf1.getOrNull
     */
    atOrNull(index: number,): NullOr<T>


    /**
     * Get the {@link value} if the {@link index} is `0`|`-1` in the current {@Link CollectionHolderOf1 instance}
     * or `null` otherwise
     *
     * @param index The index to retrieve a value
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-null.html Kotlin getOrNull(index)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-null.html Kotlin elementAtOrNull(index)
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf1.getOrNull
     */
    elementAtOrNull<I extends number, >(index: I,): SingleValueFromIndexOrNull<I, T>

    /**
     * Get the {@link value} if the {@link index} is `0`|`-1` in the current {@Link CollectionHolderOf1 instance}
     * or `null` otherwise
     *
     * @param index The index to retrieve a value
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-null.html Kotlin getOrNull(index)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-null.html Kotlin elementAtOrNull(index)
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf1.getOrNull
     */
    elementAtOrNull(index: number,): NullOr<T>

    //#endregion -------------------- Get or null --------------------
    //#region -------------------- Get first or null --------------------

    /**
     * Get the {@link value} in the current {@link CollectionHolderOf1 instance}
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault()
     */
    getFirstOrNull(): T

    //#endregion -------------------- Get first or null --------------------
    //#region -------------------- Get last or null --------------------

    /**
     * Get the {@link value} in the current {@link CollectionHolderOf1 instance}
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault()
     */
    getLastOrNull(): T

    //#endregion -------------------- Get last or null --------------------

    //#region -------------------- First --------------------

    /**
     * Get the {@link value} in the current {@link CollectionHolderOf1 instance}
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/SequencedCollection.html#getFirst() Java getFirst()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First()
     * @alias CollectionHolderOf1.getFirst
     */
    first(): T

    /**
     * Give the {@link value} if the {@link predicate} is `true` in the current {@link CollectionHolderOf1 instance}
     *
     * @param predicate The given predicate
     * @throws IndexOutOfBoundsException The {@link predicate} gave `false` when comparing to the {@link value}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
     * @typescriptDefinition
     * @alias CollectionHolderOf1.findFirst
     */
    first<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): S

    /**
     * Give the {@link value} if the {@link predicate} is `true` in the current {@link CollectionHolderOf1 instance}
     *
     * @param predicate The given predicate
     * @throws IndexOutOfBoundsException The {@link predicate} gave `false` when comparing to the {@link value}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
     * @alias CollectionHolderOf1.findFirst
     */
    first(predicate: Nullable<BooleanCallback<T>>,): T

    //#endregion -------------------- First --------------------
    //#region -------------------- First or null --------------------

    /**
     * Get the {@link value} in the current {@link CollectionHolderOf1 instance}
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault()
     * @alias CollectionHolderOf1.getFirstOrNull
     */
    firstOrNull(): T

    /**
     * Give the {@link value} if the {@link predicate} is `true` in the current {@link CollectionHolderOf1 instance}
     * or `null` otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html Kotlin find(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     * @typescriptDefinition
     * @alias CollectionHolderOf1.findOrNull
     */
    firstOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>

    /**
     * Give the {@link value} if the {@link predicate} is `true` in the current {@link CollectionHolderOf1 instance}
     * or `null` otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html find(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     * @alias CollectionHolderOf1.findOrNull
     */
    firstOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>

    //#endregion -------------------- First or null --------------------
    //#region -------------------- First indexed --------------------

    /**
     * Get the {@link value} in the current {@link CollectionHolderOf1 instance}
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/SequencedCollection.html#getFirst() Java getFirst()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First()
     * @alias CollectionHolderOf1.getFirst
     */
    firstIndexed(): T

    /**
     * Give the {@link value} if the {@link predicate} is `true` in the current {@link CollectionHolderOf1 instance}
     *
     * @param predicate The given predicate
     * @throws IndexOutOfBoundsException The {@link predicate} gave `false` when comparing to the {@link value}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
     * @typescriptDefinition
     * @alias CollectionHolderOf1.findFirstIndexed
     */
    firstIndexed<const S extends T, >(predicate: Nullable<ReverseRestrainedBooleanCallback<T, S>>,): S

    /**
     * Give the {@link value} if the {@link predicate} is `true` in the current {@link CollectionHolderOf1 instance}
     *
     * @param predicate The given predicate
     * @throws IndexOutOfBoundsException The {@link predicate} gave `false` when comparing to the {@link value}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
     * @alias CollectionHolderOf1.findFirstIndexed
     */
    firstIndexed(predicate: Nullable<ReverseBooleanCallback<T>>,): T

    //#endregion -------------------- First indexed --------------------
    //#region -------------------- First indexed or null --------------------

    /**
     * Get the {@link value} in the current {@link CollectionHolderOf1 instance}
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault()
     * @alias CollectionHolderOf1.getFirstOrNull
     */
    firstIndexedOrNull(): T

    /**
     * Give the {@link value} if the {@link predicate} is `true` in the current {@link CollectionHolderOf1 instance}
     * or `null` otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html Kotlin find(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     * @typescriptDefinition
     * @alias CollectionHolderOf1.findFirstIndexedOrNull
     */
    firstIndexedOrNull<const S extends T, >(predicate: Nullable<ReverseRestrainedBooleanCallback<T, S>>,): NullOr<S>

    /**
     * Give the {@link value} if the {@link predicate} is `true` in the current {@link CollectionHolderOf1 instance}
     * or `null` otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html find(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     * @alias CollectionHolderOf1.findFirstIndexedOrNull
     */
    firstIndexedOrNull(predicate: Nullable<ReverseBooleanCallback<T>>,): NullOr<T>

    //#endregion -------------------- First indexed or null --------------------

    //#region -------------------- Last --------------------

    /**
     * Get the {@link value} in the current {@link CollectionHolderOf1 instance}
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/SequencedCollection.html#getLast() Java getLast()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last()
     * @alias CollectionHolderOf1.getLast
     */
    last(): T

    /**
     * Give the {@link value} if the {@link predicate} is `true` in the current {@link CollectionHolderOf1 instance}
     *
     * @param predicate The given predicate
     * @throws IndexOutOfBoundsException The {@link predicate} gave `false` when comparing to the {@link value}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
     * @typescriptDefinition
     * @alias CollectionHolderOf1.findLast
     */
    last<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): S

    /**
     * Give the {@link value} if the {@link predicate} is `true` in the current {@link CollectionHolderOf1 instance}
     *
     * @param predicate The given predicate
     * @throws IndexOutOfBoundsException The {@link predicate} gave `false` when comparing to the {@link value}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
     * @alias CollectionHolderOf1.findLast
     */
    last(predicate: Nullable<BooleanCallback<T>>,): T

    //#endregion -------------------- Last --------------------
    //#region -------------------- Last or null --------------------

    /**
     * Get the {@link value} in the current {@link CollectionHolderOf1 instance}
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault()
     * @alias CollectionHolderOf1.getLastOrNull
     */
    lastOrNull(): T

    /**
     * Give the {@link value} if the {@link predicate} is `true` in the current {@link CollectionHolderOf1 instance}
     * or `null` otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.findLast
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
     * @typescriptDefinition
     * @alias CollectionHolderOf1.findLastOrNull
     */
    lastOrNull<const S extends T, >(predicate: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>

    /**
     * Give the {@link value} if the {@link predicate} is `true` in the current {@link CollectionHolderOf1 instance}
     * or `null` otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.findLast
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
     * @alias CollectionHolderOf1.findLastOrNull
     */
    lastOrNull(predicate: Nullable<BooleanCallback<T>>,): NullOr<T>

    //#endregion -------------------- Last or null --------------------
    //#region -------------------- Last indexed --------------------

    /**
     * Get the {@link value} in the current {@link CollectionHolderOf1 instance}
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/SequencedCollection.html#getLast() Java getLast()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last()
     * @alias CollectionHolderOf1.getLast
     */
    lastIndexed(): T

    /**
     * Give the {@link value} if the {@link predicate} is `true` in the current {@link CollectionHolderOf1 instance}
     *
     * @param predicate The given predicate
     * @throws IndexOutOfBoundsException The {@link predicate} gave `false` when comparing to the {@link value}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
     * @typescriptDefinition
     * @alias CollectionHolderOf1.findLastIndexed
     */
    lastIndexed<const S extends T, >(predicate: Nullable<ReverseRestrainedBooleanCallback<T, S>>,): S

    /**
     * Give the {@link value} if the {@link predicate} is `true` in the current {@link CollectionHolderOf1 instance}
     *
     * @param predicate The given predicate
     * @throws IndexOutOfBoundsException The {@link predicate} gave `false` when comparing to the {@link value}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
     * @alias CollectionHolderOf1.findLastIndexed
     */
    lastIndexed(predicate: Nullable<ReverseBooleanCallback<T>>,): T

    //#endregion -------------------- Last indexed --------------------
    //#region -------------------- Last indexed or null --------------------

    /**
     * Get the {@link value} in the current {@link CollectionHolderOf1 instance}
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault()
     * @alias CollectionHolderOf1.getLastOrNull
     */
    lastIndexedOrNull(): T

    /**
     * Give the {@link value} if the {@link predicate} is `true` in the current {@link CollectionHolderOf1 instance}
     * or `null` otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.findLast
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
     * @typescriptDefinition
     * @alias CollectionHolderOf1.findLastIndexedOrNull
     */
    lastIndexedOrNull<const S extends T, >(predicate: Nullable<ReverseRestrainedBooleanCallback<T, S>>,): NullOr<S>

    /**
     * Give the {@link value} if the {@link predicate} is `true` in the current {@link CollectionHolderOf1 instance}
     * or `null` otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.findLast
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
     * @alias CollectionHolderOf1.findLastIndexedOrNull
     */
    lastIndexedOrNull(predicate: Nullable<ReverseBooleanCallback<T>>,): NullOr<T>

    //#endregion -------------------- Last indexed or null --------------------

    //#region -------------------- Find first --------------------

    /**
     * Give the {@link value} if the {@link predicate} is `true` in the current {@link CollectionHolderOf1 instance}
     *
     * @param predicate The given predicate
     * @throws IndexOutOfBoundsException The {@link predicate} gave `false` when comparing to the {@link value}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
     * @typescriptDefinition
     */
    findFirst<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S

    /**
     * Give the {@link value} if the {@link predicate} is `true` in the current {@link CollectionHolderOf1 instance}
     *
     * @param predicate The given predicate
     * @throws IndexOutOfBoundsException The {@link predicate} gave `false` when comparing to the {@link value}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
     */
    findFirst(predicate: BooleanCallback<T>,): T


    /**
     * Give the {@link value} if the {@link predicate} is `true` in the current {@link CollectionHolderOf1 instance}
     *
     * @param predicate The given predicate
     * @throws IndexOutOfBoundsException The {@link predicate} gave `false` when comparing to the {@link value}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
     * @typescriptDefinition
     * @alias CollectionHolderOf1.findFirst
     */
    find<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S

    /**
     * Give the {@link value} if the {@link predicate} is `true` in the current {@link CollectionHolderOf1 instance}
     *
     * @param predicate The given predicate
     * @throws IndexOutOfBoundsException The {@link predicate} gave `false` when comparing to the {@link value}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
     * @alias CollectionHolderOf1.findFirst
     */
    find(predicate: BooleanCallback<T>,): T

    //#endregion -------------------- Find first --------------------
    //#region -------------------- Find first or null --------------------

    /**
     * Give the {@link value} if the {@link predicate} is `true` in the current {@link CollectionHolderOf1 instance}
     * or `null` otherwise
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
     * Give the {@link value} if the {@link predicate} is `true` in the current {@link CollectionHolderOf1 instance}
     * or `null` otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html Kotlin find(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     */
    findFirstOrNull(predicate: BooleanCallback<T>,): NullOr<T>


    /**
     * Give the {@link value} if the {@link predicate} is `true` in the current {@link CollectionHolderOf1 instance}
     * or `null` otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html Kotlin find(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     * @typescriptDefinition
     * @alias CollectionHolderOf1.findFirstOrNull
     */
    findOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>

    /**
     * Give the {@link value} if the {@link predicate} is `true` in the current {@link CollectionHolderOf1 instance}
     * or `null` otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html Kotlin find(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     * @alias CollectionHolderOf1.findFirstOrNull
     */
    findOrNull(predicate: BooleanCallback<T>,): NullOr<T>

    //#endregion -------------------- Find first or null --------------------
    //#region -------------------- Find first indexed --------------------

    /**
     * Give the {@link value} if the {@link predicate} is `true` in the current {@link CollectionHolderOf1 instance}
     *
     * @param predicate The given predicate
     * @throws IndexOutOfBoundsException The {@link predicate} gave `false` when comparing to the {@link value}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
     * @typescriptDefinition
     */
    findFirstIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>

    /**
     * Give the {@link value} if the {@link predicate} is `true` in the current {@link CollectionHolderOf1 instance}
     *
     * @param predicate The given predicate
     * @throws IndexOutOfBoundsException The {@link predicate} gave `false` when comparing to the {@link value}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
     */
    findFirstIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>


    /**
     * Give the {@link value} if the {@link predicate} is `true` in the current {@link CollectionHolderOf1 instance}
     *
     * @param predicate The given predicate
     * @throws IndexOutOfBoundsException The {@link predicate} gave `false` when comparing to the {@link value}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
     * @typescriptDefinition
     * @alias CollectionHolderOf1.findFirstIndexed
     */
    findIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>

    /**     * Give the {@link value} if the {@link predicate} is `true` in the current {@link CollectionHolderOf1 instance}
     *
     * @param predicate The given predicate
     * @throws IndexOutOfBoundsException The {@link predicate} gave `false` when comparing to the {@link value}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
     * @alias CollectionHolderOf1.findFirstIndexed
     */
    findIndexed(predicate: ReverseBooleanCallback<T>,): NullOr<T>

    //#endregion -------------------- Find first indexed --------------------
    //#region -------------------- Find first indexed or null --------------------

    /**
     * Find the first element from the {@link predicate} in the current {@link CollectionHolderOf1 instance}
     * or `null` otherwise
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
     * Find the first element from the {@link predicate} in the current {@link CollectionHolderOf1 instance}
     * or `null` otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html Kotlin find(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     */
    findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>


    /**
     * Find the first element from the {@link predicate} in the current {@link CollectionHolderOf1 instance}
     * or `null` otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html Kotlin find(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     * @typescriptDefinition
     * @alias CollectionHolderOf1.findFirstIndexedOrNull
     */
    findIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>

    /**
     * Find the first element from the {@link predicate} in the current {@link CollectionHolderOf1 instance}
     * or `null` otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html Kotlin find(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     * @alias CollectionHolderOf1.findFirstIndexedOrNull
     */
    findIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>

    //#endregion -------------------- Find first indexed or null --------------------

    //#region -------------------- Find last --------------------

    /**
     * Give the {@link value} if the {@link predicate} is `true` in the current {@link CollectionHolderOf1 instance}
     *
     * @param predicate The given predicate
     * @throws IndexOutOfBoundsException The {@link predicate} gave `false` when comparing to the {@link value}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
     * @typescriptDefinition
     */
    findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S

    /**
     * Give the {@link value} if the {@link predicate} is `true` in the current {@link CollectionHolderOf1 instance}
     *
     * @param predicate The given predicate
     * @throws IndexOutOfBoundsException The {@link predicate} gave `false` when comparing to the {@link value}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
     */
    findLast(predicate: BooleanCallback<T>,): T

    //#endregion -------------------- Find last --------------------
    //#region -------------------- Find last or null --------------------

    /**
     * Give the {@link value} if the {@link predicate} is `true` in the current {@link CollectionHolderOf1 instance}
     * or `null` otherwise
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
     * Give the {@link value} if the {@link predicate} is `true` in the current {@link CollectionHolderOf1 instance}
     * or `null` otherwise
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
     * Give the {@link value} if the {@link predicate} is `true` in the current {@link CollectionHolderOf1 instance}
     *
     * @param predicate The given predicate
     * @throws IndexOutOfBoundsException The {@link predicate} gave `false` when comparing to the {@link value}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
     * @typescriptDefinition
     */
    findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S

    /**
     * Give the {@link value} if the {@link predicate} is `true` in the current {@link CollectionHolderOf1 instance}
     *
     * @param predicate The given predicate
     * @throws IndexOutOfBoundsException The {@link predicate} gave `false` when comparing to the {@link value}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
     */
    findLastIndexed(predicate: ReverseBooleanCallback<T>,): T

    //#endregion -------------------- Find last indexed --------------------
    //#region -------------------- Find last indexed or null --------------------

    /**
     * Give the {@link value} if the {@link predicate} is `true` in the current {@link CollectionHolderOf1 instance}
     * or `null` otherwise
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
     * Give the {@link value} if the {@link predicate} is `true` in the current {@link CollectionHolderOf1 instance}
     * or `null` otherwise
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
     * Get the {@link value} equivalent to the {@link element} received
     *
     * @param element The element to find
     * @return {0} `0` if equivalent to the {@link element}
     * @throws IndexNotFoundException No index could be found
     * @see ReadonlyArray.indexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin indexOf(element)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#indexOf(java.lang.Object) Java indexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item, from?, to?)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    firstIndexOf(element: T,): 0

    /**
     * Get the {@link value} equivalent to the {@link element} received
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @param to      The inclusive ending index (`0` by default)
     * @return {0} `0` if equivalent to the {@link element}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0` or `-1`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.indexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin indexOf(element)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#indexOf(java.lang.Object) Java indexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item, from?, to?)
     * @typescriptDefinition
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    firstIndexOf<const I1 extends NullableNumber, const I2 extends NullableNumber, >(element: T, from: I1, to?: I2,): IndexOf1<I1, I2>

    /**
     * Get the {@link value} equivalent to the {@link element} received
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @param to      The inclusive ending index (`0` by default)
     * @return {0} `0` if equivalent to the {@link element}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0` or `-1`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.indexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin indexOf(element)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#indexOf(java.lang.Object) Java indexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item, from?, to?)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    firstIndexOf(element: T, from: NullableNumber, to?: NullableNumber,): 0


    /**
     * Get the {@link value} equivalent to the {@link element} received
     *
     * @param element The element to find
     * @return {0} `0` if equivalent to the {@link element}
     * @throws IndexNotFoundException No index could be found
     * @see ReadonlyArray.indexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin indexOf(element)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#indexOf(java.lang.Object) Java indexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item, from?, to?)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf1.firstIndexOf
     */
    indexOf(element: T,): 0

    /**
     * Get the {@link value} equivalent to the {@link element} received
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @param to      The inclusive ending index (`0` by default)
     * @return {0} `0` if equivalent to the {@link element}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0` or `-1`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.indexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin indexOf(element)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#indexOf(java.lang.Object) Java indexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item, from?, to?)
     * @typescriptDefinition
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf1.firstIndexOf
     */
    indexOf<const I1 extends NullableNumber, const I2 extends NullableNumber, >(element: T, from: I1, to?: I2,): IndexOf1<I1, I2>

    /**
     * Get the {@link value} equivalent to the {@link element} received
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @param to      The inclusive ending index (`0` by default)
     * @return {0} `0` if equivalent to the {@link element}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0` or `-1`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.indexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin indexOf(element)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#indexOf(java.lang.Object) Java indexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item, from?, to?)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf1.firstIndexOf
     */
    indexOf(element: T, from: NullableNumber, to?: NullableNumber,): 0

    //#endregion -------------------- First index of --------------------
    //#region -------------------- First index of or null --------------------

    /**
     * Get the {@link value} equivalent to the {@link element} received
     * or `null` if it was not in the current {@link CollectionHolderOf1 instance}
     *
     * @param element   The element to find
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (`0` by default)
     * @return {NullOrZeroNumber} `0` if equivalent to the {@link element} or `null` otherwise
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    firstIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber

    /**
     * Get the {@link value} equivalent to the {@link element} received
     * or `null` if it was not in the current {@link CollectionHolderOf1 instance}
     *
     * @param element   The element to find
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (`0` by default)
     * @return {NullOrZeroNumber} `0` if equivalent to the {@link element} or `null` otherwise
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf1.firstIndexOfOrNull
     */
    indexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber

    //#endregion -------------------- First index of or null --------------------

    //#region -------------------- Last index of --------------------

    /**
     * Get the {@link value} equivalent to the {@link element} received
     *
     * @param element The element to find
     * @return {0} `0` if equivalent to the {@link element}
     * @throws IndexNotFoundException No index could be found
     * @see ReadonlyArray.lastIndexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html Kotlin lastIndexOf(element)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object) Java lastIndexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item, from?, to?)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    lastIndexOf(element: T,): 0

    /**
     * Get the {@link value} equivalent to the {@link element} received
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @param to      The inclusive ending index (`0` by default)
     * @return {0} `0` if equivalent to the {@link element}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0` or `-1`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.lastIndexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html Kotlin lastIndexOf(element)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object) Java lastIndexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item, from?, to?)
     * @typescriptDefinition
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    lastIndexOf<const I1 extends NullableNumber, const I2 extends NullableNumber, >(element: T, from: I1, to?: I2,): IndexOf1<I1, I2>

    /**
     * Get the {@link value} equivalent to the {@link element} received
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @param to      The inclusive ending index (`0` by default)
     * @return {0} `0` if equivalent to the {@link element}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0` or `-1`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.lastIndexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/last-index-of.html Kotlin lastIndexOf(element)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object) Java lastIndexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item, from?, to?)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    lastIndexOf(element: T, from: NullableNumber, to?: NullableNumber,): 0

    //#endregion -------------------- Last index of --------------------
    //#region -------------------- Last index of or null --------------------

    /**
     * Get the {@link value} equivalent to the {@link element} received
     * or `null` if it was not in the current {@link CollectionHolderOf1 instance}
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @param to      The inclusive ending index (`0` by default)
     * @return {NullOrZeroNumber} `0` if equivalent to the {@link element} or `null` otherwise
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    lastIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber

    //#endregion -------------------- Last index of or null --------------------

    //#region -------------------- Index of first --------------------

    /**
     * Get the {@link value} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @return {0} `0` if matching the {@link predicate}
     * @throws IndexNotFoundException No index could be found
     * @see ReadonlyArray.findIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfFirst(predicate: BooleanCallback<T>,): 0

    /**
     * Get the {@link value} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`0` by default)
     * @return {0} `0` if matching the {@link predicate}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0` or `-1`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.findIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfFirst(predicate: BooleanCallback<T>, from: NullableNumber, to?: NullableNumber,): 0


    /**
     * Get the {@link value} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @return {0} `0` if matching the {@link predicate}
     * @throws IndexNotFoundException No index could be found
     * @see ReadonlyArray.findIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf1.indexOfFirst
     */
    findFirstIndex(predicate: BooleanCallback<T>,): 0

    /**
     * Get the {@link value} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`0` by default)
     * @return {0} `0` if matching the {@link predicate}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0` or `-1`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.findIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf1.indexOfFirst
     */
    findFirstIndex(predicate: BooleanCallback<T>, from: NullableNumber, to?: NullableNumber,): 0


    /**
     * Get the {@link value} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @return {0} `0` if matching the {@link predicate}
     * @throws IndexNotFoundException No index could be found
     * @see ReadonlyArray.findIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf1.indexOfFirst
     */
    findIndex(predicate: BooleanCallback<T>,): 0

    /**
     * Get the {@link value} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`0` by default)
     * @return {0} `0` if matching the {@link predicate}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0` or `-1`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.findIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf1.indexOfFirst
     */
    findIndex(predicate: BooleanCallback<T>, from: NullableNumber, to?: NullableNumber,): 0

    //#endregion -------------------- Index of first --------------------
    //#region -------------------- Index of first or null --------------------

    /**
     * Get the {@link value} if matching the {@link predicate}
     * or `null` if {@link from}|{@link to} was not `0`|`-1`
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (`0` by default)
     * @return {NullOrZeroNumber} `0` if matching the {@link predicate} or `null` otherwise
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfFirstOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber

    /**
     * Get the {@link value} if matching the {@link predicate}
     * or `null` if {@link from}|{@link to} was not `0`|`-1`
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (`0` by default)
     * @return {NullOrZeroNumber} `0` if matching the {@link predicate} or `null` otherwise
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf1.indexOfFirstOrNull
     */
    findFirstIndexOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber

    /**
     * Get the {@link value} if matching the {@link predicate}
     * or `null` if {@link from}|{@link to} was not `0`|`-1`
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (`0` by default)
     * @return {NullOrZeroNumber} `0` if matching the {@link predicate} or `null` otherwise
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf1.indexOfFirstOrNull
     */
    findIndexOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber

    //#endregion -------------------- Index of first or null --------------------
    //#region -------------------- Index of first indexed --------------------

    /**
     * Get the {@link value} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @return {0} `0` if matching the {@link predicate}
     * @throws IndexNotFoundException No index could be found
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>,): 0

    /**
     * Get the {@link value} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (`0` by default)
     * @return {0} `0` if matching the {@link predicate}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0` or `-1`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, from: NullableNumber, to?: NullableNumber,): 0


    /**
     * Get the {@link value} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @return {0} `0` if matching the {@link predicate}
     * @throws IndexNotFoundException No index could be found
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf1.indexOfFirstIndexed
     */
    findFirstIndexIndexed(predicate: ReverseBooleanCallback<T>,): 0

    /**
     * Get the {@link value} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (`0` by default)
     * @return {0} `0` if matching the {@link predicate}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0` or `-1`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf1.indexOfFirstIndexed
     */
    findFirstIndexIndexed(predicate: ReverseBooleanCallback<T>, from: NullableNumber, to?: NullableNumber,): 0


    /**
     * Get the {@link value} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @return {0} `0` if matching the {@link predicate}
     * @throws IndexNotFoundException No index could be found
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf1.indexOfFirstIndexed
     */
    findIndexIndexed(predicate: ReverseBooleanCallback<T>,): 0

    /**
     * Get the {@link value} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (`0` by default)
     * @return {0} `0` if matching the {@link predicate}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0` or `-1`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf1.indexOfFirstIndexed
     */
    findIndexIndexed(predicate: ReverseBooleanCallback<T>, from: NullableNumber, to?: NullableNumber,): 0

    //#endregion -------------------- Index of first indexed --------------------
    //#region -------------------- Index of first indexed or null --------------------

    /**
     * Get the {@link value} if matching the {@link predicate}
     * or `null` if {@link from}|{@link to} was not `0`|`-1`
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (`0` by default)
     * @return {NullOrZeroNumber} `0` if matching the {@link predicate} or `null` otherwise
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber

    /**
     * Get the {@link value} if matching the {@link predicate}
     * or `null` if {@link from}|{@link to} was not `0`|`-1`
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (`0` by default)
     * @return {NullOrZeroNumber} `0` if matching the {@link predicate} or `null` otherwise
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf1.indexOfFirstIndexed
     */
    findFirstIndexIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber

    /**
     * Get the {@link value} if matching the {@link predicate}
     * or `null` if {@link from}|{@link to} was not `0`|`-1`
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (`0` by default)
     * @return {NullOrZeroNumber} `0` if matching the {@link predicate} or `null` otherwise
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf1.indexOfFirstIndexed
     */
    findIndexIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber

    //#endregion -------------------- Index of first indexed or null --------------------

    //#region -------------------- Index of last --------------------

    /**
     * Get the {@link value} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @return {0} `0` if matching the {@link predicate}
     * @throws IndexNotFoundException No index could be found
     * @see ReadonlyArray.findLastIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfLast(predicate: BooleanCallback<T>,): 0

    /**
     * Get the {@link value} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (`0` by default)
     * @return {0} `0` if matching the {@link predicate}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0` or `-1`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.findLastIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfLast(predicate: BooleanCallback<T>, from: NullableNumber, to?: NullableNumber,): 0


    /**
     * Get the {@link value} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @return {0} `0` if matching the {@link predicate}
     * @throws IndexNotFoundException No index could be found
     * @see ReadonlyArray.findLastIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf1.indexOfLast
     */
    findLastIndex(predicate: BooleanCallback<T>,): 0

    /**
     * Get the {@link value} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`0` by default)
     * @return {0} `0` if matching the {@link predicate}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0` or `-1`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.findLastIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf1.indexOfLast
     */
    findLastIndex(predicate: BooleanCallback<T>, from: NullableNumber, to?: NullableNumber,): 0

    //#endregion -------------------- Index of last --------------------
    //#region -------------------- Index of last or null --------------------

    /**
     * Get the {@link value} if matching the {@link predicate}
     * or `null` if {@link from}|{@link to} was not `0`|`-1`
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (`0` by default)
     * @return {NullOrZeroNumber} `0` if matching the {@link predicate} or `null` otherwise
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfLastOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber

    /**
     * Get the {@link value} if matching the {@link predicate}
     * or `null` if {@link from}|{@link to} was not `0`|`-1`
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (`0` by default)
     * @return {NullOrZeroNumber} `0` if matching the {@link predicate} or `null` otherwise
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf1.indexOfLastOrNull
     */
    findLastIndexOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber

    //#endregion -------------------- Index of last or null --------------------
    //#region -------------------- Index of last indexed --------------------

    /**
     * Get the {@link value} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @return {0} `0` if matching the {@link predicate}
     * @throws IndexNotFoundException No index could be found
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfLastIndexed(predicate: ReverseBooleanCallback<T>,): 0

    /**
     * Get the {@link value} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (`0` by default)
     * @return {0} `0` if matching the {@link predicate}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0` or `-1`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, from: NullableNumber, to?: NullableNumber,): 0


    /**
     * Get the {@link value} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @return {0} `0` if matching the {@link predicate}
     * @throws IndexNotFoundException No index could be found
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf1.indexOfLastIndexed
     */
    findLastIndexIndexed(predicate: ReverseBooleanCallback<T>,): 0

    /**
     * Get the {@link value} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (`0` by default)
     * @return {0} `0` if matching the {@link predicate}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0` or `-1`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf1.indexOfLastIndexed
     */
    findLastIndexIndexed(predicate: ReverseBooleanCallback<T>, from: NullableNumber, to?: NullableNumber,): 0

    //#endregion -------------------- Index of last indexed --------------------
    //#region -------------------- Index of last indexed or null --------------------

    /**
     * Get the {@link value} if matching the {@link predicate}
     * or `null` if {@link from}|{@link to} was not `0`|`-1`
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (`0` by default)
     * @return {NullOrZeroNumber} `0` if matching the {@link predicate} or `null` otherwise
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfLastIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber

    /**
     * Get the {@link value} if matching the {@link predicate}
     * or `null` if {@link from}|{@link to} was not `0`|`-1`
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (`0` by default)
     * @return {NullOrZeroNumber} `0` if matching the {@link predicate} or `null` otherwise
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf1.indexOfLastIndexedOrNull
     */
    findLastIndexIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber

    //#endregion -------------------- Index of last indexed or null --------------------

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    //#region -------------------- All --------------------

    /**
     * Check if the {@link value} in the current {@link CollectionHolderOf1 instance}
     * match the given {@link predicate}
     *
     * @param predicate The matching predicate
     * @return {boolean} `true` if the {@link value} is applicable to the {@link predicate}
     * @see ReadonlyArray.every
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/all.html Kotlin all(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#allMatch(java.util.function.Predicate) Java Stream.allMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#allMatch(java.util.function.IntPredicate) Java IntStream.allMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#allMatch(java.util.function.LongPredicate) Java LongStream.allMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#allMatch(java.util.function.DoublePredicate) Java DoubleStream.allMatch(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.all C# All(predicate)
     * @typescriptDefinition
     */
    all<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolderOf1<S>

    /**
     * Check if the {@link value} in the current {@link CollectionHolderOf1 instance}
     * match the given {@link predicate}
     *
     * @param predicate The matching predicate
     * @return {boolean} `true` if the {@link value} is applicable to the {@link predicate}
     * @see ReadonlyArray.every
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/all.html Kotlin all(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#allMatch(java.util.function.Predicate) Java Stream.allMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#allMatch(java.util.function.IntPredicate) Java IntStream.allMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#allMatch(java.util.function.LongPredicate) Java LongStream.allMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#allMatch(java.util.function.DoublePredicate) Java DoubleStream.allMatch(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.all C# All(predicate)
     */
    all(predicate: BooleanCallback<T>,): boolean


    /**
     * Check if the {@link value} in the current {@link CollectionHolderOf1 instance}
     * match the given {@link predicate}
     *
     * @param predicate The matching predicate
     * @return {boolean} `true` if the {@link value} is applicable to the {@link predicate}
     * @see ReadonlyArray.every
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/all.html Kotlin all(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#allMatch(java.util.function.Predicate) Java Stream.allMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#allMatch(java.util.function.IntPredicate) Java IntStream.allMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#allMatch(java.util.function.LongPredicate) Java LongStream.allMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#allMatch(java.util.function.DoublePredicate) Java DoubleStream.allMatch(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.all C# All(predicate)
     * @typescriptDefinition
     * @alias CollectionHolderOf1.all
     */
    every<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolderOf1<S>

    /**
     * Check if the {@link value} in the current {@link CollectionHolderOf1 instance}
     * match the given {@link predicate}
     *
     * @param predicate The matching predicate
     * @return {boolean} `true` if the {@link value} is applicable to the {@link predicate}
     * @see ReadonlyArray.every
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/all.html Kotlin all(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#allMatch(java.util.function.Predicate) Java Stream.allMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#allMatch(java.util.function.IntPredicate) Java IntStream.allMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#allMatch(java.util.function.LongPredicate) Java LongStream.allMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#allMatch(java.util.function.DoublePredicate) Java DoubleStream.allMatch(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.all C# All(predicate)
     * @alias CollectionHolderOf1.all
     */
    every(predicate: BooleanCallback<T>,): boolean

    //#endregion -------------------- All --------------------
    //#region -------------------- Any --------------------

    /**
     * The current {@link CollectionHolderOf1 instance} has a minimum of 1 value (which is `true`)
     *
     * @return {true} {@link CollectionHolderOf1.isNotEmpty}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/any.html Kotlin any()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#findAny() Java Stream.findAny()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#allMatch() Java IntStream.findAny()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#allMatch() Java LongStream.findAny()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#allMatch() Java DoubleStream.findAny()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any C# Any()
     * @alias CollectionHolderOf1.isNotEmpty
     */
    any(): this["isNotEmpty"]

    /**
     * Check if the {@link value} in the current {@link CollectionHolderOf1 instance}
     * match the given {@link predicate}
     *
     * @param predicate The condition to check on each value
     * @return {boolean} `true` if the {@link predicate} is `true` on the {@link value}
     * @see ReadonlyArray.some
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/any.html Kotlin any(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#anyMatch(java.util.function.Predicate) Java Stream.anyMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#anyMatch(java.util.function.IntPredicate) Java IntStream.anyMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#anyMatch(java.util.function.LongPredicate) Java LongStream.anyMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#anyMatch(java.util.function.DoublePredicate) Java DoubleStream.anyMatch(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any C# Any(predicate)
     * @typescriptDefinition
     */
    any<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolderOf1<S>

    /**
     * Check if the {@link value} in the current {@link CollectionHolderOf1 instance}
     * match the given {@link predicate}
     *
     * @param predicate The condition to check on each value
     * @return {boolean} `true` if the {@link predicate} is `true` on the {@link value}
     * @see ReadonlyArray.some
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/any.html Kotlin any(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#anyMatch(java.util.function.Predicate) Java Stream.anyMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#anyMatch(java.util.function.IntPredicate) Java IntStream.anyMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#anyMatch(java.util.function.LongPredicate) Java LongStream.anyMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#anyMatch(java.util.function.DoublePredicate) Java DoubleStream.anyMatch(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any C# Any(predicate)
     */
    any(predicate: Nullable<BooleanCallback<T>>,): boolean


    /**
     * The current {@link CollectionHolderOf1 instance} has a minimum of 1 value (which is `true`)
     *
     * @return {true} {@link CollectionHolderOf1.isNotEmpty}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/any.html Kotlin any()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#findAny() Java Stream.findAny()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#allMatch() Java IntStream.findAny()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#allMatch() Java LongStream.findAny()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#allMatch() Java DoubleStream.findAny()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any C# Any()
     * @alias CollectionHolderOf1.isNotEmpty
     */
    some(): this["isNotEmpty"]

    /**
     * Check if the {@link value} in the current {@link CollectionHolderOf1 instance}
     * match the given {@link predicate}
     *
     * @param predicate The condition to check on each value
     * @return {boolean} `true` if the {@link predicate} is `true` on the {@link value}
     * @see ReadonlyArray.some
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/any.html Kotlin any(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#anyMatch(java.util.function.Predicate) Java Stream.anyMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#anyMatch(java.util.function.IntPredicate) Java IntStream.anyMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#anyMatch(java.util.function.LongPredicate) Java LongStream.anyMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#anyMatch(java.util.function.DoublePredicate) Java DoubleStream.anyMatch(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any C# Any(predicate)
     * @typescriptDefinition
     * @alias CollectionHolderOf1.any
     */
    some<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolderOf1<S>

    /**
     * Check if the {@link value} in the current {@link CollectionHolderOf1 instance}
     * match the given {@link predicate}
     *
     * @param predicate The condition to check on each value
     * @return {boolean} `true` if the {@link predicate} is `true` on the {@link value}
     * @see ReadonlyArray.some
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/any.html Kotlin any(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#anyMatch(java.util.function.Predicate) Java Stream.anyMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#anyMatch(java.util.function.IntPredicate) Java IntStream.anyMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#anyMatch(java.util.function.LongPredicate) Java LongStream.anyMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#anyMatch(java.util.function.DoublePredicate) Java DoubleStream.anyMatch(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any C# Any(predicate)
     * @alias CollectionHolderOf1.any
     */
    some(predicate: Nullable<BooleanCallback<T>>,): boolean

    //#endregion -------------------- Any --------------------
    //#region -------------------- None --------------------

    /**
     * The current {@link CollectionHolderOf1 instance} __NEVER__ has no values
     *
     * @return {false} {@link CollectionHolderOf1.isEmpty}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/none.html Kotlin none()
     * @alias CollectionHolderOf1.isEmpty
     */
    none(): this["isEmpty"]

    /**
     * Check if the {@link value} in the current {@link CollectionHolderOf1 instance}
     * does not match the given {@link predicate}
     *
     * @param predicate The condition to check on each value
     * @return {boolean} `false` if the {@link predicate} is `true` on the {@link value}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/none.html Kotlin none(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#noneMatch(java.util.function.Predicate) Java Stream.noneMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#noneMatch(java.util.function.IntPredicate) Java IntStream.noneMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#noneMatch(java.util.function.LongPredicate) Java LongStream.noneMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#noneMatch(java.util.function.DoublePredicate) Java DoubleStream.noneMatch(predicate)
     * @typescriptDefinition
     */
    none<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolderOf1<Exclude<T, S>>

    /**
     * Check if the {@link value} in the current {@link CollectionHolderOf1 instance}
     * does not match the given {@link predicate}
     *
     * @param predicate The condition to check on each value
     * @return {boolean} `false` if the {@link predicate} is `true` on the {@link value}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/none.html Kotlin none(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#noneMatch(java.util.function.Predicate) Java Stream.noneMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#noneMatch(java.util.function.IntPredicate) Java IntStream.noneMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#noneMatch(java.util.function.LongPredicate) Java LongStream.noneMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#noneMatch(java.util.function.DoublePredicate) Java DoubleStream.noneMatch(predicate)
     */
    none(predicate: Nullable<BooleanCallback<T>>,): boolean

    //#endregion -------------------- None --------------------

    //#region -------------------- Has null --------------------

    /**
     * The {@link value} in the current {@link CollectionHolderOf1 instance} is `null` or `undefined`
     *
     * @return {boolean} `true` only if the {@link value} is `null` or `undefined`
     */
    readonly hasNull: boolean

    /**
     * The {@link value} in the current {@link CollectionHolderOf1 instance} is `null` or `undefined`
     *
     * @return {boolean} `true` only if the {@link value} is `null` or `undefined`
     * @alias CollectionHolderOf1.hasNull
     */
    readonly includesNull: this["hasNull"]

    /**
     * The {@link value} in the current {@link CollectionHolderOf1 instance} is `null` or `undefined`
     *
     * @return {boolean} `true` only if the {@link value} is `null` or `undefined`
     * @alias CollectionHolderOf1.hasNull
     */
    readonly containsNull: this["hasNull"]

    //#endregion -------------------- Has null --------------------
    //#region -------------------- Has no nulls --------------------

    /**
     * The {@link value} in the current {@link CollectionHolderOf1 instance} is not `null` or `undefined`
     *
     * @return {boolean} `true` only if the {@link value} is not `null` or `undefined`
     */
    readonly hasNoNulls: boolean

    /**
     * The {@link value} in the current {@link CollectionHolderOf1 instance} is not `null` or `undefined`
     *
     * @return {boolean} `true` only if the {@link value} is not `null` or `undefined`
     * @alias CollectionHolderOf1.hasNoNulls
     */
    readonly includesNoNulls: this["hasNoNulls"]

    /**
     * The {@link value} in the current {@link CollectionHolderOf1 instance} is not `null` or `undefined`
     *
     * @return {boolean} `true` only if the {@link value} is not `null` or `undefined`
     * @alias CollectionHolderOf1.hasNoNulls
     */
    readonly containsNoNulls: this["hasNoNulls"]

    //#endregion -------------------- Has no nulls --------------------
    //#region -------------------- Has duplicate --------------------

    /**
     * The current {@link CollectionHolderOf1 instance} never has any duplicate value
     *
     * @return {false} No element can be compared to the lone {@link value}
     */
    readonly hasDuplicate: false

    /**
     * The current {@link CollectionHolderOf1 instance} never has any duplicate value
     *
     * @return {false} No element can be compared to the lone {@link value}
     * @alias CollectionHolderOf1.hasDuplicate
     */
    readonly includesDuplicate: this["hasDuplicate"]

    /**
     * The current {@link CollectionHolderOf1 instance} never has any duplicate value
     *
     * @return {false} No element can be compared to the lone {@link value}
     * @alias CollectionHolderOf1.hasDuplicate
     */
    readonly containsDuplicate: this["hasDuplicate"]

    //#endregion -------------------- Has duplicate --------------------
    //#region -------------------- Has no duplicates --------------------

    /**
     * The current {@link CollectionHolderOf1 instance} always have no duplicate value
     *
     * @return {true} No element can be compared to the lone {@link value}
     */
    readonly hasNoDuplicates: true

    /**
     * The current {@link CollectionHolderOf1 instance} always have no duplicate value
     *
     * @return {true} No element can be compared to the lone {@link value}
     * @alias CollectionHolderOf1.hasNoDuplicates
     */
    readonly includesNoDuplicates: this["hasNoDuplicates"]

    /**
     * The current {@link CollectionHolderOf1 instance} always have no duplicate value
     *
     * @return {true} No element can be compared to the lone {@link value}
     * @alias CollectionHolderOf1.hasNoDuplicates
     */
    readonly containsNoDuplicates: this["hasNoDuplicates"]

    //#endregion -------------------- Has no duplicates --------------------

    //#region -------------------- Has --------------------

    /**
     * Tell whenever the {@link value} is the current {@link CollectionHolderOf1 instance} {@link CollectionHolderOf1.value value}
     *
     * @param value The value to compare
     * @return {boolean} `true` if the {@link value} is the current {@link CollectionHolderOf1 instance} {@link CollectionHolderOf1.value value}
     * @see ReadonlyArray.includes
     * @see ReadonlySet.has
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains.html Kotlin contains(value)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/containsValue.html Kotlin Map.containsValue(value)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Collection.html#contains(java.lang.Object) Java Collection.contains(value)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Map.html#containsValue(java.lang.Object) Java Map.containsValue(value)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.contains C# contains(value)
     */
    has(value: T,): boolean

    /**
     * Tell whenever the {@link value} is the current {@link CollectionHolderOf1 instance} {@link CollectionHolderOf1.value value}
     *
     * @param value The value to compare
     * @return {boolean} `true` if the {@link value} is the current {@link CollectionHolderOf1 instance} {@link CollectionHolderOf1.value value}
     * @see ReadonlyArray.includes
     * @see ReadonlySet.has
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains.html Kotlin contains(value)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/containsValue.html Kotlin Map.containsValue(value)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Collection.html#contains(java.lang.Object) Java Collection.contains(value)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Map.html#containsValue(java.lang.Object) Java Map.containsValue(value)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.contains C# contains(value)
     * @alias CollectionHolderOf1.has
     */
    includes(value: T,): boolean

    /**
     * Tell whenever the {@link value} is the current {@link CollectionHolderOf1 instance} {@link CollectionHolderOf1.value value}
     *
     * @param value The value to compare
     * @return {boolean} `true` if the {@link value} is the current {@link CollectionHolderOf1 instance} {@link CollectionHolderOf1.value value}
     * @see ReadonlyArray.includes
     * @see ReadonlySet.has
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains.html Kotlin contains(value)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/containsValue.html Kotlin Map.containsValue(value)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Collection.html#contains(java.lang.Object) Java Collection.contains(value)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Map.html#containsValue(java.lang.Object) Java Map.containsValue(value)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.contains C# contains(value)
     * @alias CollectionHolderOf1.has
     */
    contains(value: T,): boolean

    //#endregion -------------------- Has --------------------
    //#region -------------------- Has not --------------------

    /**
     * Tell whenever the {@link value} is __NOT__ the current {@link CollectionHolderOf1 instance} {@link CollectionHolderOf1.value value}
     *
     * @param value The value to compare
     * @return {boolean} `true` if the {@link value} is __NOT__ the current {@link CollectionHolderOf1 instance} {@link CollectionHolderOf1.value value}
     */
    hasNot(value: T,): boolean

    /**
     * Tell whenever the {@link value} is __NOT__ the current {@link CollectionHolderOf1 instance} {@link CollectionHolderOf1.value value}
     *
     * @param value The value to compare
     * @return {boolean} `true` if the {@link value} is __NOT__ the current {@link CollectionHolderOf1 instance} {@link CollectionHolderOf1.value value}
     * @alias CollectionHolderOf1.hasNot
     */
    includesNot(value: T,): boolean

    /**
     * Tell whenever the {@link value} is __NOT__ the current {@link CollectionHolderOf1 instance} {@link CollectionHolderOf1.value value}
     *
     * @param value The value to compare
     * @return {boolean} `true` if the {@link value} is __NOT__ the current {@link CollectionHolderOf1 instance} {@link CollectionHolderOf1.value value}
     * @alias CollectionHolderOf1.hasNot
     */
    containsNot(value: T,): boolean

    //#endregion -------------------- Has not --------------------
    //#region -------------------- Has one --------------------

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     */
    hasOne(values: Nullable<Array<T>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     */
    hasOne(values: Nullable<Set<T>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     */
    hasOne(values: Nullable<CollectionHolder<T>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     */
    hasOne(values: Nullable<MinimalistCollectionHolder<T>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     */
    hasOne(values: Nullable<CollectionIterator<T>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @typescriptDefinition
     */
    hasOne(values: Nullable<IteratorObject<T, unknown, unknown>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     */
    hasOne(values: Nullable<Iterator<T, unknown, unknown>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     */
    hasOne(values: Nullable<Iterable<T, unknown, unknown>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @typescriptDefinition
     */
    hasOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean

    //#region -------------------- Has one methods (aliases) --------------------

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasOne
     */
    includesOne(values: Nullable<Array<T>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasOne
     */
    includesOne(values: Nullable<Set<T>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasOne
     */
    includesOne(values: Nullable<CollectionHolder<T>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasOne
     */
    includesOne(values: Nullable<MinimalistCollectionHolder<T>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasOne
     */
    includesOne(values: Nullable<CollectionIterator<T>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @typescriptDefinition
     * @alias CollectionHolderOf1.hasOne
     */
    includesOne(values: Nullable<IteratorObject<T, unknown, unknown>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasOne
     */
    includesOne(values: Nullable<Iterator<T, unknown, unknown>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasOne
     */
    includesOne(values: Nullable<Iterable<T, unknown, unknown>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @typescriptDefinition
     * @alias CollectionHolderOf1.hasOne
     */
    includesOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean


    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasOne
     */
    containsOne(values: Nullable<Array<T>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasOne
     */
    containsOne(values: Nullable<Set<T>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasOne
     */
    containsOne(values: Nullable<CollectionHolder<T>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasOne
     */
    containsOne(values: Nullable<MinimalistCollectionHolder<T>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasOne
     */
    containsOne(values: Nullable<CollectionIterator<T>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @typescriptDefinition
     * @alias CollectionHolderOf1.hasOne
     */
    containsOne(values: Nullable<IteratorObject<T, unknown, unknown>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasOne
     */
    containsOne(values: Nullable<Iterator<T, unknown, unknown>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasOne
     */
    containsOne(values: Nullable<Iterable<T, unknown, unknown>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @typescriptDefinition
     * @alias CollectionHolderOf1.hasOne
     */
    containsOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean

    //#endregion -------------------- Has one methods (aliases) --------------------

    //#endregion -------------------- Has one --------------------
    //#region -------------------- Has not one --------------------

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     */
    hasNotOne(values: Nullable<Array<T>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     */
    hasNotOne(values: Nullable<Set<T>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     */
    hasNotOne(values: Nullable<CollectionHolder<T>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     */
    hasNotOne(values: Nullable<MinimalistCollectionHolder<T>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     */
    hasNotOne(values: Nullable<CollectionIterator<T>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @typescriptDefinition
     */
    hasNotOne(values: Nullable<IteratorObject<T, unknown, unknown>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     */
    hasNotOne(values: Nullable<Iterator<T, unknown, unknown>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     */
    hasNotOne(values: Nullable<Iterable<T, unknown, unknown>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @typescriptDefinition
     */
    hasNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean

    //#region -------------------- Has not one methods (aliases) --------------------

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasNotOne
     */
    includesNotOne(values: Nullable<Array<T>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasNotOne
     */
    includesNotOne(values: Nullable<Set<T>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasNotOne
     */
    includesNotOne(values: Nullable<CollectionHolder<T>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasNotOne
     */
    includesNotOne(values: Nullable<MinimalistCollectionHolder<T>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasNotOne
     */
    includesNotOne(values: Nullable<CollectionIterator<T>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @typescriptDefinition
     * @alias CollectionHolderOf1.hasNotOne
     */
    includesNotOne(values: Nullable<IteratorObject<T, unknown, unknown>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasNotOne
     */
    includesNotOne(values: Nullable<Iterator<T, unknown, unknown>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasNotOne
     */
    includesNotOne(values: Nullable<Iterable<T, unknown, unknown>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @typescriptDefinition
     * @alias CollectionHolderOf1.hasNotOne
     */
    includesNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean


    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasNotOne
     */
    containsNotOne(values: Nullable<Array<T>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasNotOne
     */
    containsNotOne(values: Nullable<Set<T>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasNotOne
     */
    containsNotOne(values: Nullable<CollectionHolder<T>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasNotOne
     */
    containsNotOne(values: Nullable<MinimalistCollectionHolder<T>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasNotOne
     */
    containsNotOne(values: Nullable<CollectionIterator<T>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @typescriptDefinition
     * @alias CollectionHolderOf1.hasNotOne
     */
    containsNotOne(values: Nullable<IteratorObject<T, unknown, unknown>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasNotOne
     */
    containsNotOne(values: Nullable<Iterator<T, unknown, unknown>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasNotOne
     */
    containsNotOne(values: Nullable<Iterable<T, unknown, unknown>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @typescriptDefinition
     * @alias CollectionHolderOf1.hasNotOne
     */
    containsNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean

    //#endregion -------------------- Has not one methods (aliases) --------------------

    //#endregion -------------------- Has not one --------------------
    //#region -------------------- Has all --------------------

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
     */
    hasAll(values: Nullable<Array<T>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
     */
    hasAll(values: Nullable<Set<T>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
     */
    hasAll(values: Nullable<CollectionHolder<T>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
     */
    hasAll(values: Nullable<MinimalistCollectionHolder<T>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
     */
    hasAll(values: Nullable<CollectionIterator<T>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
     * @typescriptDefinition
     */
    hasAll(values: Nullable<IteratorObject<T, unknown, unknown>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
     */
    hasAll(values: Nullable<Iterator<T, unknown, unknown>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
     */
    hasAll(values: Nullable<Iterable<T, unknown, unknown>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
     * @typescriptDefinition
     */
    hasAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean

    //#region -------------------- Has all methods (aliases) --------------------

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasAll
     */
    includesAll(values: Nullable<Array<T>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasAll
     */
    includesAll(values: Nullable<Set<T>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasAll
     */
    includesAll(values: Nullable<CollectionHolder<T>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasAll
     */
    includesAll(values: Nullable<MinimalistCollectionHolder<T>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasAll
     */
    includesAll(values: Nullable<CollectionIterator<T>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @typescriptDefinition
     * @alias CollectionHolderOf1.hasAll
     */
    includesAll(values: Nullable<IteratorObject<T, unknown, unknown>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasAll
     */
    includesAll(values: Nullable<Iterator<T, unknown, unknown>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasAll
     */
    includesAll(values: Nullable<Iterable<T, unknown, unknown>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @typescriptDefinition
     * @alias CollectionHolderOf1.hasAll
     */
    includesAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean


    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasAll
     */
    containsAll(values: Nullable<Array<T>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasAll
     */
    containsAll(values: Nullable<Set<T>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasAll
     */
    containsAll(values: Nullable<CollectionHolder<T>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasAll
     */
    containsAll(values: Nullable<MinimalistCollectionHolder<T>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasAll
     */
    containsAll(values: Nullable<CollectionIterator<T>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @typescriptDefinition
     * @alias CollectionHolderOf1.hasAll
     */
    containsAll(values: Nullable<IteratorObject<T, unknown, unknown>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasAll
     */
    containsAll(values: Nullable<Iterator<T, unknown, unknown>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasAll
     */
    containsAll(values: Nullable<Iterable<T, unknown, unknown>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @typescriptDefinition
     * @alias CollectionHolderOf1.hasAll
     */
    containsAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean

    //#endregion -------------------- Has all methods (aliases) --------------------

    //#endregion -------------------- Has all --------------------
    //#region -------------------- Has not all --------------------

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     */
    hasNotAll(values: Nullable<Array<T>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     */
    hasNotAll(values: Nullable<Set<T>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     */
    hasNotAll(values: Nullable<CollectionHolder<T>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     */
    hasNotAll(values: Nullable<MinimalistCollectionHolder<T>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     */
    hasNotAll(values: Nullable<CollectionIterator<T>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @typescriptDefinition
     */
    hasNotAll(values: Nullable<IteratorObject<T, unknown, unknown>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     */
    hasNotAll(values: Nullable<Iterator<T, unknown, unknown>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     */
    hasNotAll(values: Nullable<Iterable<T, unknown, unknown>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @typescriptDefinition
     */
    hasNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean

    //#region -------------------- Has not all methods (aliases) --------------------

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasNotAll
     */
    includesNotAll(values: Nullable<Array<T>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasNotAll
     */
    includesNotAll(values: Nullable<Set<T>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasNotAll
     */
    includesNotAll(values: Nullable<CollectionHolder<T>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasNotAll
     */
    includesNotAll(values: Nullable<MinimalistCollectionHolder<T>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasNotAll
     */
    includesNotAll(values: Nullable<CollectionIterator<T>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @typescriptDefinition
     * @alias CollectionHolderOf1.hasNotAll
     */
    includesNotAll(values: Nullable<IteratorObject<T, unknown, unknown>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasNotAll
     */
    includesNotAll(values: Nullable<Iterator<T, unknown, unknown>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasNotAll
     */
    includesNotAll(values: Nullable<Iterable<T, unknown, unknown>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @typescriptDefinition
     * @alias CollectionHolderOf1.hasNotAll
     */
    includesNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean


    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasNotAll
     */
    containsNotAll(values: Nullable<Array<T>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasNotAll
     */
    containsNotAll(values: Nullable<Set<T>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasNotAll
     */
    containsNotAll(values: Nullable<CollectionHolder<T>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasNotAll
     */
    containsNotAll(values: Nullable<MinimalistCollectionHolder<T>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasNotAll
     */
    containsNotAll(values: Nullable<CollectionIterator<T>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @typescriptDefinition
     * @alias CollectionHolderOf1.hasNotAll
     */
    containsNotAll(values: Nullable<IteratorObject<T, unknown, unknown>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasNotAll
     */
    containsNotAll(values: Nullable<Iterator<T, unknown, unknown>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf1.hasNotAll
     */
    containsNotAll(values: Nullable<Iterable<T, unknown, unknown>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf1 instance} {@link value}
     *
     * @param values The values to compare
     * @typescriptDefinition
     * @alias CollectionHolderOf1.hasNotAll
     */
    containsNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean

    //#endregion -------------------- Has not all methods (aliases) --------------------

    //#endregion -------------------- Has not all --------------------

    //#region -------------------- Require no nulls --------------------

    /**
     * Require that the {@link value} is not `null` or `undefined` in the current {@link CollectionHolderOf1 instance}
     *
     * @throws TypeError The {@link value} is `null` or `undefined`
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
     * @see CollectionHolderOf1.filterNotNull
     * @return {this} The current {@link CollectionHolderOf1 instance}
     */
    requireNoNulls(): CollectionHolderOf1<NonNullable<T>>

    //#endregion -------------------- Require no nulls --------------------

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    /**
     * Get a new {@link CollectionHolder} (of 0|1)
     * matching only the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.filter
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter.html Kotlin filter(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java Stream.filter(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#filter(java.util.function.IntPredicate) Java IntStream.filter(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#filter(java.util.function.LongPredicate) Java LongStream.filter(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#filter(java.util.function.DoublePredicate) Java DoubleStream.filter(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
     * @typescriptDefinition
     */
    filter<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} (of 0|1)
     * matching only the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.filter
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter.html Kotlin filter(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java Stream.filter(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#filter(java.util.function.IntPredicate) Java IntStream.filter(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#filter(java.util.function.LongPredicate) Java LongStream.filter(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#filter(java.util.function.DoublePredicate) Java DoubleStream.filter(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
     */
    filter(predicate: BooleanCallback<T>,): CollectionHolder<T>

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Filter indexed --------------------

    /**
     * Get a new {@link CollectionHolder} (of 0|1)
     * matching only the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.filter
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-indexed.html Kotlin filterIndexed(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java Stream.filter(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#filter(java.util.function.IntPredicate) Java IntStream.filter(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#filter(java.util.function.LongPredicate) Java LongStream.filter(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#filter(java.util.function.DoublePredicate) Java DoubleStream.filter(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
     * @typescriptDefinition
     */
    filterIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} (of 0|1)
     * matching only the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.filter
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-indexed.html Kotlin filterIndexed(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java Stream.filter(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#filter(java.util.function.IntPredicate) Java IntStream.filter(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#filter(java.util.function.LongPredicate) Java LongStream.filter(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#filter(java.util.function.DoublePredicate) Java DoubleStream.filter(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
     */
    filterIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>

    //#endregion -------------------- Filter indexed --------------------

    //#region -------------------- Filter not --------------------

    /**
     * Get a new {@link CollectionHolder} (of 0|1)
     * __NOT__ matching the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.filter
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-not.html Kotlin filterNot(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java Stream.filter(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#filter(java.util.function.IntPredicate) Java IntStream.filter(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#filter(java.util.function.LongPredicate) Java LongStream.filter(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#filter(java.util.function.DoublePredicate) Java DoubleStream.filter(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
     * @typescriptDefinition
     */
    filterNot<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>

    /**
     * Get a new {@link CollectionHolder} (of 0|1)
     * __NOT__ matching the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.filter
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-not.html Kotlin filterNot(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java Stream.filter(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#filter(java.util.function.IntPredicate) Java IntStream.filter(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#filter(java.util.function.LongPredicate) Java LongStream.filter(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#filter(java.util.function.DoublePredicate) Java DoubleStream.filter(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
     */
    filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T>

    //#endregion -------------------- Filter not --------------------
    //#region -------------------- Filter not indexed --------------------

    /**
     * Get a new {@link CollectionHolder} (of 0|1)
     * __NOT__ matching the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.filter
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-not.html Kotlin filterNot(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java Stream.filter(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#filter(java.util.function.IntPredicate) Java IntStream.filter(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#filter(java.util.function.LongPredicate) Java LongStream.filter(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#filter(java.util.function.DoublePredicate) Java DoubleStream.filter(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
     * @typescriptDefinition
     */
    filterNotIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>

    /**
     * Get a new {@link CollectionHolder} (of 0|1)
     * __NOT__ matching the given {@link predicate}
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.filter
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-not.html Kotlin filterNot(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate) Java Stream.filter(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#filter(java.util.function.IntPredicate) Java IntStream.filter(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#filter(java.util.function.LongPredicate) Java LongStream.filter(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#filter(java.util.function.DoublePredicate) Java DoubleStream.filter(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.where C# Where(predicate)
     */
    filterNotIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>

    //#endregion -------------------- Filter not indexed --------------------

    //#region -------------------- Filter not null --------------------

    /**
     * Get either a {@link EmptyCollectionHolder} or the current {@link CollectionHolderOf1 instance} that is without `null` and `undefined`
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-not-null.html Kotlin filterNotNull()
     */
    filterNotNull(): CollectionHolderOf0Or1<NonNullable<T>>

    //#endregion -------------------- Filter not null --------------------

    //#region -------------------- Slice --------------------

    //#region -------------------- Slice (from, to) --------------------

    /**
     * Get the current {@link CollectionHolderOf1 instance}
     *
     * @see ReadonlyArray.slice
     * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
     */
    slice(): CollectionHolderOf1<T>

    /**
     * Get the current {@link CollectionHolderOf1 instance}
     *
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`0` by default)
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0` or `-1`
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.slice
     * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
     */
    slice(from: NullableNumber, to?: NullableNumber,): CollectionHolderOf1<T>

    //#endregion -------------------- Slice (from, to) --------------------
    //#region -------------------- Slice (indice) --------------------

    /**
     * Create a new {@link CollectionHolder} from the {@link indices} of the {@link value}
     *
     * @param indices The given indices
     * @throws IndexOutOfBoundsException An indice is not `0` or `-1`
     * @throws ForbiddenIndexException   An indice a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
     */
    slice(indices: NumberArray,): CollectionHolder<T>

    /**
     * Create a new {@link CollectionHolder} from the {@link indices} of the {@link value}
     *
     * @param indices The given indices
     * @throws IndexOutOfBoundsException An indice is not `0` or `-1`
     * @throws ForbiddenIndexException   An indice a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     */
    slice(indices: NumberSet,): CollectionHolder<T>

    /**
     * Create a new {@link CollectionHolder} from the {@link indices} of the {@link value}
     *
     * @param indices The given indices
     * @throws IndexOutOfBoundsException An indice is not `0` or `-1`
     * @throws ForbiddenIndexException   An indice a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     */
    slice(indices: CollectionHolder<number>,): CollectionHolder<T>

    /**
     * Create a new {@link CollectionHolder} from the {@link indices} of the {@link value}
     *
     * @param indices The given indices
     * @throws IndexOutOfBoundsException An indice is not `0` or `-1`
     * @throws ForbiddenIndexException   An indice a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     */
    slice(indices: MinimalistCollectionHolder<number>,): CollectionHolder<T>

    /**
     * Create a new {@link CollectionHolder} from the {@link indices} of the {@link value}
     *
     * @param indices The given indices
     * @throws IndexOutOfBoundsException An indice is not `0` or `-1`
     * @throws ForbiddenIndexException   An indice a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     */
    slice(indices: CollectionIterator<number>,): CollectionHolder<T>

    /**
     * Create a new {@link CollectionHolder} from the {@link indices} of the {@link value}
     *
     * @param indices The given indices
     * @throws IndexOutOfBoundsException An indice is not `0` or `-1`
     * @throws ForbiddenIndexException   An indice a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     * @typescriptDefinition
     */
    slice(indices: IteratorObject<number, unknown, unknown>,): CollectionHolder<T>

    /**
     * Create a new {@link CollectionHolder} from the {@link indices} of the {@link value}
     *
     * @param indices The given indices
     * @throws IndexOutOfBoundsException An indice is not `0` or `-1`
     * @throws ForbiddenIndexException   An indice a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     */
    slice(indices: Iterator<number, unknown, unknown>,): CollectionHolder<T>

    /**
     * Create a new {@link CollectionHolder} from the {@link indices} of the {@link value}
     *
     * @param indices The given indices
     * @throws IndexOutOfBoundsException An indice is not `0` or `-1`
     * @throws ForbiddenIndexException   An indice a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     */
    slice(indices: Iterable<number, unknown, unknown>,): CollectionHolder<T>

    /**
     * Create a new {@link CollectionHolder} from the {@link indices} of the {@link value}
     *
     * @param indices The given indices
     * @throws IndexOutOfBoundsException An indice is not `0` or `-1`
     * @throws ForbiddenIndexException   An indice a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     * @typescriptDefinition
     */
    slice(indices: PossibleIterableIteratorArraySetOrCollectionHolder<number>,): CollectionHolder<T>

    //#endregion -------------------- Slice (indice) --------------------

    /**
     * Create a new {@link CollectionHolder} from the {@link indicesOrFrom indices} of the {@link value}
     * or the current {@link CollectionHolderOf1 instance}
     *
     * @param indicesOrFrom The given indices (or inclusive starting index)
     * @param to            The inclusive ending index
     * @throws IndexOutOfBoundsException {@link indicesOrFrom from} or {@link to} are not `0` or `-1`
     * @throws IndexOutOfBoundsException An indice is not `0` or `-1`
     * @throws ForbiddenIndexException   {@link indicesOrFrom from} or {@link to} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
     * @typescriptDefinition
     */
    slice(indicesOrFrom?: Nullable<| PossibleIterableIteratorArraySetOrCollectionHolder<number> | number>, to?: NullableNumber,): CollectionHolder<T>

    //#endregion -------------------- Slice --------------------

    //#region -------------------- Take --------------------

    /**
     * Get the current {@link CollectionHolderOf1 instance} if positive
     * or an {@link EmptyCollectionHolder} otherwise
     *
     * @param n The number of arguments (if negative, then it is plus `1`)
     * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take.html Kotlin take(n)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#limit(long) Java Stream.limit(n)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#limit(long) Java IntStream.limit(n)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#limit(long) Java LongStream.limit(n)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#limit(long) Java DoubleStream.limit(n)
     * @canReceiveNegativeValue
     */
    take(n: number,): CollectionHolderOf0Or1<T>

    /**
     * Get the current {@link CollectionHolderOf1 instance} if positive
     * or an {@link EmptyCollectionHolder} otherwise
     *
     * @param n The number of arguments (if negative, then it is plus `1`)
     * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take.html Kotlin take(n)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#limit(long) Java Stream.limit(n)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#limit(long) Java IntStream.limit(n)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#limit(long) Java LongStream.limit(n)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#limit(long) Java DoubleStream.limit(n)
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf1.take
     */
    limit(n: number,): CollectionHolderOf0Or1<T>

    //#endregion -------------------- Take --------------------
    //#region -------------------- Take while --------------------

    /**
     * Get a new {@link CollectionHolder} (of `1`) if satisfying the given {@link predicate}
     * and a new {@link CollectionHolder} (of `0`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-while.html Kotlin takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#takeWhile(java.util.function.Predicate) Java Stream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#takeWhile(java.util.function.IntPredicate) Java IntStream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#takeWhile(java.util.function.LongPredicate) Java LongStream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#takeWhile(java.util.function.DoublePredicate) Java DoubleStream.takeWhile(predicate)
     * @typescriptDefinition
     */
    takeWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} (of `1`) if satisfying the given {@link predicate}
     * and a new {@link CollectionHolder} (of `0`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-while.html Kotlin takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#takeWhile(java.util.function.Predicate) Java Stream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#takeWhile(java.util.function.IntPredicate) Java IntStream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#takeWhile(java.util.function.LongPredicate) Java LongStream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#takeWhile(java.util.function.DoublePredicate) Java DoubleStream.takeWhile(predicate)
     */
    takeWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>


    /**
     * Get a new {@link CollectionHolder} (of `1`) if satisfying the given {@link predicate}
     * and a new {@link CollectionHolder} (of `0`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-while.html Kotlin takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#takeWhile(java.util.function.Predicate) Java Stream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#takeWhile(java.util.function.IntPredicate) Java IntStream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#takeWhile(java.util.function.LongPredicate) Java LongStream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#takeWhile(java.util.function.DoublePredicate) Java DoubleStream.takeWhile(predicate)
     * @typescriptDefinition
     * @alias CollectionHolderOf1.takeWhile
     */
    limitWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} (of `1`) if satisfying the given {@link predicate}
     * and a new {@link CollectionHolder} (of `0`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-while.html Kotlin takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#takeWhile(java.util.function.Predicate) Java Stream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#takeWhile(java.util.function.IntPredicate) Java IntStream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#takeWhile(java.util.function.LongPredicate) Java LongStream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#takeWhile(java.util.function.DoublePredicate) Java DoubleStream.takeWhile(predicate)
     * @alias CollectionHolderOf1.takeWhile
     */
    limitWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>

    //#endregion -------------------- Take while --------------------
    //#region -------------------- Take while indexed --------------------

    /**
     * Get a new {@link CollectionHolder} (of `1`) if satisfying the given {@link predicate}
     * and a new {@link CollectionHolder} (of `0`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-while.html Kotlin takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#takeWhile(java.util.function.Predicate) Java Stream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#takeWhile(java.util.function.IntPredicate) Java IntStream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#takeWhile(java.util.function.LongPredicate) Java LongStream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#takeWhile(java.util.function.DoublePredicate) Java DoubleStream.takeWhile(predicate)
     * @typescriptDefinition
     */
    takeWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} (of `1`) if satisfying the given {@link predicate}
     * and a new {@link CollectionHolder} (of `0`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-while.html Kotlin takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#takeWhile(java.util.function.Predicate) Java Stream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#takeWhile(java.util.function.IntPredicate) Java IntStream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#takeWhile(java.util.function.LongPredicate) Java LongStream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#takeWhile(java.util.function.DoublePredicate) Java DoubleStream.takeWhile(predicate)
     */
    takeWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>


    /**
     * Get a new {@link CollectionHolder} (of `1`) if satisfying the given {@link predicate}
     * and a new {@link CollectionHolder} (of `0`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-while.html Kotlin takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#takeWhile(java.util.function.Predicate) Java Stream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#takeWhile(java.util.function.IntPredicate) Java IntStream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#takeWhile(java.util.function.LongPredicate) Java LongStream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#takeWhile(java.util.function.DoublePredicate) Java DoubleStream.takeWhile(predicate)
     * @typescriptDefinition
     * @alias CollectionHolderOf1.takeWhileIndexed
     */
    limitWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} (of `1`) if satisfying the given {@link predicate}
     * and a new {@link CollectionHolder} (of `0`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-while.html Kotlin takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#takeWhile(java.util.function.Predicate) Java Stream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#takeWhile(java.util.function.IntPredicate) Java IntStream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#takeWhile(java.util.function.LongPredicate) Java LongStream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#takeWhile(java.util.function.DoublePredicate) Java DoubleStream.takeWhile(predicate)
     * @alias CollectionHolderOf1.takeWhileIndexed
     */
    limitWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>

    //#endregion -------------------- Take while indexed --------------------

    //#region -------------------- Take last --------------------

    /**
     * Get the current {@link CollectionHolderOf1 instance} if positive
     * or an {@link EmptyCollectionHolder} otherwise
     *
     * @param n The number of arguments (if negative, then it is plus `1`)
     * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last.html Kotlin takeLast(n)
     * @canReceiveNegativeValue
     */
    takeLast(n: number,): CollectionHolderOf0Or1<T>

    /**
     * Get the current {@link CollectionHolderOf1 instance} if positive
     * or an {@link EmptyCollectionHolder} otherwise
     *
     * @param n The number of arguments (if negative, then it is plus `1`)
     * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last.html Kotlin takeLast(n)
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf1.takeLast
     */
    limitLast(n: number,): CollectionHolderOf0Or1<T>

    //#endregion -------------------- Take last --------------------
    //#region -------------------- Take last while --------------------

    /**
     * Get a new {@link CollectionHolder} (of `1`) if satisfying the given {@link predicate}
     * and a new {@link CollectionHolder} (of `0`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html Kotlin takeLastWhile(predicate)
     * @typescriptDefinition
     */
    takeLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} (of `1`) if satisfying the given {@link predicate}
     * and a new {@link CollectionHolder} (of `0`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html Kotlin takeLastWhile(predicate)
     */
    takeLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>


    /**
     * Get a new {@link CollectionHolder} (of `1`) if satisfying the given {@link predicate}
     * and a new {@link CollectionHolder} (of `0`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html Kotlin takeLastWhile(predicate)
     * @typescriptDefinition
     * @alias CollectionHolderOf1.takeLastWhile
     */
    limitLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} (of `1`) if satisfying the given {@link predicate}
     * and a new {@link CollectionHolder} (of `0`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html Kotlin takeLastWhile(predicate)
     * @alias CollectionHolderOf1.takeLastWhile
     */
    limitLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>

    //#endregion -------------------- Take last while --------------------
    //#region -------------------- Take last while indexed --------------------

    /**
     * Get a new {@link CollectionHolder} (of `1`) if satisfying the given {@link predicate}
     * and a new {@link CollectionHolder} (of `0`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html Kotlin takeLastWhile(predicate)
     * @typescriptDefinition
     */
    takeLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} (of `1`) if satisfying the given {@link predicate}
     * and a new {@link CollectionHolder} (of `0`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html Kotlin takeLastWhile(predicate)
     */
    takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>


    /**
     * Get a new {@link CollectionHolder} (of `1`) if satisfying the given {@link predicate}
     * and a new {@link CollectionHolder} (of `0`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html Kotlin takeLastWhile(predicate)
     * @typescriptDefinition
     * @alias CollectionHolderOf1.takeLastWhileIndexed
     */
    limitLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} (of `1`) if satisfying the given {@link predicate}
     * and a new {@link CollectionHolder} (of `0`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html Kotlin takeLastWhile(predicate)
     * @alias CollectionHolderOf1.takeLastWhileIndexed
     */
    limitLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>

    //#endregion -------------------- Take last while indexed --------------------

    //#region -------------------- Drop --------------------

    /**
     * Get an {@link EmptyCollectionHolder} if positive
     * or the current {@link CollectionHolderOf1 instance} otherwise
     *
     * @param n The number of arguments (if negative, then it is plus `1`)
     * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop.html Kotlin drop(n)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#skip(long) Java Stream.skip(n)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#skip(long) Java IntStream.skip(n)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#skip(long) Java LongStream.skip(n)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#skip(long) Java DoubleStream.skip(n)
     * @canReceiveNegativeValue
     */
    drop(n: number,): CollectionHolderOf0Or1<T>

    /**
     * Get an {@link EmptyCollectionHolder} if positive
     * or the current {@link CollectionHolderOf1 instance} otherwise
     *
     * @param n The number of arguments (if negative, then it is plus `1`)
     * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop.html Kotlin drop(n)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#skip(long) Java Stream.skip(n)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#skip(long) Java IntStream.skip(n)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#skip(long) Java LongStream.skip(n)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#skip(long) Java DoubleStream.skip(n)
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf1.drop
     */
    skip(n: number,): CollectionHolderOf0Or1<T>

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Drop while --------------------

    /**
     * Get a new {@link CollectionHolder} (of `0`) if satisfying the given {@link predicate}
     * and a new {@link CollectionHolder} (of `1`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html Kotlin dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#dropWhile(java.util.function.Predicate) Java Stream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#dropWhile(java.util.function.IntPredicate) Java IntStream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#dropWhile(java.util.function.LongPredicate) Java LongStream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#dropWhile(java.util.function.DoublePredicate) Java DoubleStream.dropWhile(predicate)
     * @typescriptDefinition
     */
    dropWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} (of `0`) if satisfying the given {@link predicate}
     * and a new {@link CollectionHolder} (of `1`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html Kotlin dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#dropWhile(java.util.function.Predicate) Java Stream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#dropWhile(java.util.function.IntPredicate) Java IntStream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#dropWhile(java.util.function.LongPredicate) Java LongStream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#dropWhile(java.util.function.DoublePredicate) Java DoubleStream.dropWhile(predicate)
     */
    dropWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>


    /**
     * Get a new {@link CollectionHolder} (of `0`) if satisfying the given {@link predicate}
     * and a new {@link CollectionHolder} (of `1`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html Kotlin dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#dropWhile(java.util.function.Predicate) Java Stream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#dropWhile(java.util.function.IntPredicate) Java IntStream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#dropWhile(java.util.function.LongPredicate) Java LongStream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#dropWhile(java.util.function.DoublePredicate) Java DoubleStream.dropWhile(predicate)
     * @typescriptDefinition
     * @alias CollectionHolderOf1.dropWhile
     */
    skipWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} (of `0`) if satisfying the given {@link predicate}
     * and a new {@link CollectionHolder} (of `1`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html Kotlin dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#dropWhile(java.util.function.Predicate) Java Stream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#dropWhile(java.util.function.IntPredicate) Java IntStream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#dropWhile(java.util.function.LongPredicate) Java LongStream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#dropWhile(java.util.function.DoublePredicate) Java DoubleStream.dropWhile(predicate)
     * @alias CollectionHolderOf1.dropWhile
     */
    skipWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>

    //#endregion -------------------- Drop while --------------------
    //#region -------------------- Drop while indexed --------------------

    /**
     * Get a new {@link CollectionHolder} (of `0`) if satisfying the given {@link predicate}
     * and a new {@link CollectionHolder} (of `1`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html Kotlin dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#dropWhile(java.util.function.Predicate) Java Stream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#dropWhile(java.util.function.IntPredicate) Java IntStream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#dropWhile(java.util.function.LongPredicate) Java LongStream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#dropWhile(java.util.function.DoublePredicate) Java DoubleStream.dropWhile(predicate)
     * @typescriptDefinition
     */
    dropWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} (of `0`) if satisfying the given {@link predicate}
     * and a new {@link CollectionHolder} (of `1`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html Kotlin dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#dropWhile(java.util.function.Predicate) Java Stream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#dropWhile(java.util.function.IntPredicate) Java IntStream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#dropWhile(java.util.function.LongPredicate) Java LongStream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#dropWhile(java.util.function.DoublePredicate) Java DoubleStream.dropWhile(predicate)
     */
    dropWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>


    /**
     * Get a new {@link CollectionHolder} (of `0`) if satisfying the given {@link predicate}
     * and a new {@link CollectionHolder} (of `1`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html Kotlin dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#dropWhile(java.util.function.Predicate) Java Stream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#dropWhile(java.util.function.IntPredicate) Java IntStream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#dropWhile(java.util.function.LongPredicate) Java LongStream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#dropWhile(java.util.function.DoublePredicate) Java DoubleStream.dropWhile(predicate)
     * @typescriptDefinition
     * @alias CollectionHolderOf1.dropWhileIndexed
     */
    skipWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} (of `0`) if satisfying the given {@link predicate}
     * and a new {@link CollectionHolder} (of `1`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html Kotlin dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#dropWhile(java.util.function.Predicate) Java Stream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#dropWhile(java.util.function.IntPredicate) Java IntStream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#dropWhile(java.util.function.LongPredicate) Java LongStream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#dropWhile(java.util.function.DoublePredicate) Java DoubleStream.dropWhile(predicate)
     * @alias CollectionHolderOf1.dropWhileIndexed
     */
    skipWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>

    //#endregion -------------------- Drop while indexed --------------------

    //#region -------------------- Drop last --------------------

    /**
     * Get an {@link EmptyCollectionHolder} if positive
     * or the current {@link CollectionHolderOf1 instance} otherwise
     *
     * @param n The number of arguments (if negative, then it is plus `1`)
     * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last.html Kotlin dropLast(n)
     * @canReceiveNegativeValue
     */
    dropLast(n: number,): CollectionHolderOf0Or1<T>

    /**
     * Get an {@link EmptyCollectionHolder} if positive
     * or the current {@link CollectionHolderOf1 instance} otherwise
     *
     * @param n The number of arguments (if negative, then it is plus `1`)
     * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last.html Kotlin dropLast(n)
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf1.dropLast
     */
    skipLast(n: number,): CollectionHolderOf0Or1<T>

    //#endregion -------------------- Drop last --------------------
    //#region -------------------- Drop last while --------------------

    /**
     * Get a new {@link CollectionHolder} (of `0`) if satisfying the given {@link predicate}
     * and a new {@link CollectionHolder} (of `1`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html Kotlin dropLastWhile(predicate)
     * @typescriptDefinition
     */
    dropLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} (of `0`) if satisfying the given {@link predicate}
     * and a new {@link CollectionHolder} (of `1`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html Kotlin dropLastWhile(predicate)
     */
    dropLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>


    /**
     * Get a new {@link CollectionHolder} (of `0`) if satisfying the given {@link predicate}
     * and a new {@link CollectionHolder} (of `1`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html Kotlin dropLastWhile(predicate)
     * @typescriptDefinition
     * @alias CollectionHolderOf1.dropLastWhile
     */
    skipLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} (of `0`) if satisfying the given {@link predicate}
     * and a new {@link CollectionHolder} (of `1`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html Kotlin dropLastWhile(predicate)
     * @alias CollectionHolderOf1.dropLastWhile
     */
    skipLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>

    //#endregion -------------------- Drop last while --------------------
    //#region -------------------- Drop last while indexed --------------------

    /**
     * Get a new {@link CollectionHolder} (of `0`) if satisfying the given {@link predicate}
     * and a new {@link CollectionHolder} (of `1`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html Kotlin dropLastWhile(predicate)
     * @typescriptDefinition
     */
    dropLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} (of `0`) if satisfying the given {@link predicate}
     * and a new {@link CollectionHolder} (of `1`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html Kotlin dropLastWhile(predicate)
     */
    dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>


    /**
     * Get a new {@link CollectionHolder} (of `0`) if satisfying the given {@link predicate}
     * and a new {@link CollectionHolder} (of `1`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html Kotlin dropLastWhile(predicate)
     * @typescriptDefinition
     * @alias CollectionHolderOf1.dropLastWhileIndexed
     */
    skipLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} (of `0`) if satisfying the given {@link predicate}
     * and a new {@link CollectionHolder} (of `1`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html Kotlin dropLastWhile(predicate)
     * @alias CollectionHolderOf1.dropLastWhileIndexed
     */
    skipLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>

    //#endregion -------------------- Drop last while indexed --------------------

    //#region -------------------- Map --------------------

    /**
     * Create a new {@link CollectionHolderOf1} containing the result
     * applying the given {@link transform} function to the {@link value}
     *
     * @param transform The given transform
     * @see ReadonlyArray.map
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/map.html Kotlin map(transform)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#map(java.util.function.Function) Java Stream.map(transform)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#map(java.util.function.IntUnaryOperator) Java IntStream.map(transform)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#map(java.util.function.LongUnaryOperator) Java LongStream.map(transform)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#map(java.util.function.DoubleUnaryOperator) Java DoubleStream.map(transform)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select C# Select(transform)
     * @see mapNotNull
     */
    map<const U, >(transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolderOf1<U>

    //#endregion -------------------- Map --------------------
    //#region -------------------- Map indexed --------------------

    /**
     * Create a new {@link CollectionHolderOf1} containing the result
     * applying the given {@link transform} function to the {@link value}
     *
     * @param transform The given transform
     * @see ReadonlyArray.map
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/map-indexed.html Kotlin mapIndexed(transform)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#map(java.util.function.Function) Java Stream.map(transform)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#map(java.util.function.IntUnaryOperator) Java IntStream.map(transform)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#map(java.util.function.LongUnaryOperator) Java LongStream.map(transform)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#map(java.util.function.DoubleUnaryOperator) Java DoubleStream.map(transform)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select C# Select(transform)
     * @see mapNotNullIndexed
     */
    mapIndexed<const U, >(transform: IndexValueWithReturnCallback<T, U>,): CollectionHolderOf1<U>

    //#endregion -------------------- Map indexed --------------------

    //#region -------------------- Map not null --------------------

    /**
     * Create a new {@link CollectionHolder} (of `0`) if the result of the given {@link transform}
     * on the {@link value} is `null`|`undefined`
     * and a {@link CollectionHolder} (of `1`) otherwise
     *
     *
     * @param transform The given transform
     * @see ReadonlyArray.map
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/map-not-null.html Kotlin mapNotNull(transform)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#map(java.util.function.Function) Java Stream.map(transform)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#map(java.util.function.IntUnaryOperator) Java IntStream.map(transform)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#map(java.util.function.LongUnaryOperator) Java LongStream.map(transform)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#map(java.util.function.DoubleUnaryOperator) Java DoubleStream.map(transform)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select C# Select(transform)
     * @see map
     */
    mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U>

    //#endregion -------------------- Map not null --------------------
    //#region -------------------- Map not null indexed --------------------

    /**
     * Create a new {@link CollectionHolder} (of `0`) if the result of the given {@link transform}
     * on the {@link value} is `null`|`undefined`
     * and a {@link CollectionHolder} (of `1`) otherwise
     *
     * @param transform The given transform
     * @see ReadonlyArray.map
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/map-indexed-not-null.html Kotlin mapIndexedNotNull(transform)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#map(java.util.function.Function) Java Stream.map(transform)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#map(java.util.function.IntUnaryOperator) Java IntStream.map(transform)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#map(java.util.function.LongUnaryOperator) Java LongStream.map(transform)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#map(java.util.function.DoubleUnaryOperator) Java DoubleStream.map(transform)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.select C# Select(transform)
     * @see mapIndexed
     */
    mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U>

    //#endregion -------------------- Map not null indexed --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Reordering methods --------------------

    //#region -------------------- To reverse --------------------

    /**
     * Reverse the current {@link CollectionHolderOf1 instance} to a maybe new {@link CollectionHolderOf1}
     *
     * @see Array.reverse
     * @see ReadonlyArray.toReversed
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reversed.html Kotlin reversed()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
     * @canReceiveNegativeValue
     */
    toReverse(): CollectionHolderOf1<T>

    /**
     * Reverse the current {@link CollectionHolderOf1 instance} to a maybe new {@link CollectionHolderOf1}
     *
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`0` by default)
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0` or `-1`
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see Array.reverse
     * @see ReadonlyArray.toReversed
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reversed.html Kotlin reversed()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
     * @canReceiveNegativeValue
     */
    toReverse(from: NullableNumber, to?: NullableNumber,): CollectionHolderOf1<T>


    /**
     * Reverse the current {@link CollectionHolderOf1 instance} to a maybe new {@link CollectionHolderOf1}
     *
     * @see Array.reverse
     * @see ReadonlyArray.toReversed
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reversed.html Kotlin reversed()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf1.toReverse
     */
    toReversed(): CollectionHolderOf1<T>

    /**
     * Reverse the current {@link CollectionHolderOf1 instance} to a maybe new {@link CollectionHolderOf1}
     *
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`0` by default)
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0` or `-1`
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see Array.reverse
     * @see ReadonlyArray.toReversed
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reversed.html Kotlin reversed()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf1.toReverse
     */
    toReversed(from: NullableNumber, to?: NullableNumber,): CollectionHolderOf1<T>


    /**
     * Reverse the current {@link CollectionHolderOf1 instance} to a maybe new {@link CollectionHolderOf1}
     *
     * @see Array.reverse
     * @see ReadonlyArray.toReversed
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reversed.html Kotlin reversed()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf1.toReverse
     */
    reversed(): CollectionHolderOf1<T>

    /**
     * Reverse the current {@link CollectionHolderOf1 instance} to a maybe new {@link CollectionHolderOf1}
     *
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`0` by default)
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0` or `-1`
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see Array.reverse
     * @see ReadonlyArray.toReversed
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reversed.html Kotlin reversed()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf1.toReverse
     */
    reversed(from: NullableNumber, to?: NullableNumber,): CollectionHolderOf1<T>

    //#endregion -------------------- To reverse --------------------

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- JavaScript methods --------------------

    /**
     * A JavaScript way to implement a "for‥of" over the current {@link CollectionHolderOf1 instance}
     *
     * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/iterator
     * @alias CollectionHolderOf1.toIterator
     */
    [Symbol.iterator](): CollectionIteratorOf1<T>

    //#endregion -------------------- JavaScript methods --------------------
    //#region -------------------- Conversion methods --------------------

    /** Convert the current {@link CollectionHolderOf1 instance} to a {@link CollectionIteratorOf1} */
    toIterator(): CollectionIteratorOf1<T>

    /** Convert the current {@link CollectionHolderOf1 instance} to a {@link ReadonlyArray array} of 1 */
    toArray(): readonly [T,]

    /** Convert the current {@link CollectionHolderOf1 instance} to a new {@link Array mutable array} of 1 */
    toMutableArray(): [T,]

    /** Convert the current {@link CollectionHolderOf1 instance} to a {@link ReadonlySet set} of 1 */
    toSet(): Set<T>

    /** Convert the current {@link CollectionHolderOf1 instance} to a new {@link Set mutable set} of 1 */
    toMutableSet(): MutableSet<T>

    /** Convert the current {@link CollectionHolderOf1 instance} to a {@link ReadonlyMap map} of 1 */
    toMap(): NumberKeyMap<T, 0>

    /** Convert the current {@link CollectionHolderOf1 instance} to a new {@link Map mutable map} of 1 */
    toMutableMap(): MutableNumberKeyMap<T, 0>

    //#endregion -------------------- To map --------------------

    //#endregion -------------------- Conversion methods --------------------

}

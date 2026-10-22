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

import type {Array, MutableNumberKeyMap, MutableSet, Nullable, NullableNumber, NullOr, NullOrNumber, NullOrOneNumber, NullOrUndefined, NullOrZeroNumber, NumberArray, NumberKeyMap, NumberSet, Set} from "@joookiwi/type"

import type {CollectionHolder}                                                                                                                                                                                          from "./CollectionHolder"
import type {CollectionHolderOf1}                                                                                                                                                                                       from "./CollectionHolderOf1"
import type {MinimalistCollectionHolder}                                                                                                                                                                                from "./MinimalistCollectionHolder"
import type {CollectionIterator}                                                                                                                                                                                        from "./iterator/CollectionIterator"
import type {CollectionIteratorOf2}                                                                                                                                                                                     from "./iterator/CollectionIteratorOf2"
import type {BooleanCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, RestrainedBooleanCallback, ReturnCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, ValueIndexWithReturnCallback} from "./type/callback"
import type {CollectionHolderOf0Or1Or2, CollectionHolderOf1Or2, CollectionHolderOfAny0Or1Or2, CollectionHolderOfAny1Or2, CollectionHolderOfLast0Or1Or2}                                                                 from "./type/collection"
import type {IndexOf2, IndexOf2Of1, IndexOf2Of2}                                                                                                                                                                        from "./type/indexOf"
import type {PossibleIterableIteratorArraySetOrCollectionHolder}                                                                                                                                                        from "./type/possibleInstance"
import type {ToReverse_from, ToReverse_fromTo, ToReverse_to}                                                                                                                                                            from "./type/toReverse"
import type {DoubleValueFromIndex, DoubleValueFromIndexOrElse, DoubleValueFromIndexOrNull}                                                                                                                              from "./type/value"

/**
 * An instance of [CollectionHolder] with only 2 values from its `constructor`
 *
 * @typeParam T1 The 1st type (`unknown` by default)
 * @typeParam T2 The 2nd type (`unknown` by default)
 * @see DualValueCollectionHolder
 * @see ArrayOf2AsCollectionHolder
 * @see SetOf2AsCollectionHolder
 * @see IteratorOf2AsCollectionHolder
 * @see LazyCollectionHolderOf2
 */
export interface CollectionHolderOf2<out T1 = unknown,
    out T2 = unknown, >
    extends CollectionHolder<| T1 | T2> {

    //#region -------------------- Value methods --------------------

    /** The 1st value (out of 2) of the current {@link CollectionHolderOf2 instance} */
    readonly 0: T1

    /** The 2nd value (out of 2) of the current {@link CollectionHolderOf2 instance} */
    readonly 1: T2

    /** The 1st value (out of 2) of the current {@link CollectionHolderOf2 instance} */
    readonly value1: T1

    /** The 2nd value (out of 2) of the current {@link CollectionHolderOf2 instance} */
    readonly value2: T2

    //#endregion -------------------- Value methods --------------------
    //#region -------------------- Size methods --------------------

    /**
     * Get the size of the current {@link CollectionHolderOf2 instance} as `2`
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
    readonly size: 2

    /**
     * Get the size of the current {@link CollectionHolderOf2 instance} as `2`
     *
     * @see ReadonlyArray.length
     * @see ReadonlySet.size
     * @see ReadonlyMap.size
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/size.html Kotlin Collection.size()
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/size.html Kotlin Map.size()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Collection.html#size() Java Collection.size()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Map.html#size() Java Map.size()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.count C# Count()
     * @alias CollectionHolderOf2.size
     */
    readonly length: this["size"]

    /**
     * Get the size of the current {@link CollectionHolderOf2 instance} as `2`
     *
     * @see ReadonlyArray.length
     * @see ReadonlySet.size
     * @see ReadonlyMap.size
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/size.html Kotlin Collection.size()
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/size.html Kotlin Map.size()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Collection.html#size() Java Collection.size()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Map.html#size() Java Map.size()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.count C# Count()
     * @alias CollectionHolderOf2.size
     */
    readonly count: this["size"]


    /**
     * The current {@link CollectionHolderOf2 instance} __NEVER__ has no values
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-empty.html Kotlin isEmpty()
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/is-empty.html Kotlin Collection.isEmpty()
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/is-empty.html Kotlin Map.isEmpty()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Collection.html#isEmpty() Java Collection.isEmpty()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Map.html#isEmpty Java Map.isEmpty()
     */
    readonly isEmpty: false

    /**
     * The current {@link CollectionHolderOf2 instance} has a minimum of 1 value (which is `true`)
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-not-empty.html Kotlin isNotEmpty()
     */
    readonly isNotEmpty: true


    /**
     * The current {@link CollectionHolderOf2 instance} has a minimum of 1 value (which is `true`)
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-not-empty.html Kotlin isNotEmpty()
     * @alias CollectionHolderOf2.isNotEmpty
     */
    readonly hasAtLeast1Element: this["isNotEmpty"]

    /**
     * The current {@link CollectionHolderOf2 instance} has a minimum of 1 value (which is `true`)
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-not-empty.html Kotlin isNotEmpty()
     * @alias CollectionHolderOf2.isNotEmpty
     */
    readonly containsAtLeast1Element: this["isNotEmpty"]

    /**
     * The current {@link CollectionHolderOf2 instance} has a minimum of 1 value (which is `true`)
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-not-empty.html Kotlin isNotEmpty()
     * @alias CollectionHolderOf2.isNotEmpty
     */
    readonly includesAtLeast1Element: this["isNotEmpty"]


    /** The current {@link CollectionHolderOf2 instance} has exactly 1 value (which is `false`) */
    readonly hasExactly1Element: false

    /**
     * The current {@link CollectionHolderOf2 instance} has exactly 1 value (which is `false`)
     *
     * @alias CollectionHolderOf2.hasExactly1Element
     */
    readonly containsExactly1Element: this["hasExactly1Element"]

    /**
     * The current {@link CollectionHolderOf2 instance} has exactly 1 value (which is `false`)
     *
     * @alias CollectionHolderOf2.hasExactly1Element
     */
    readonly includesExactly1Element: this["hasExactly1Element"]


    /** The current {@link CollectionHolderOf2 instance} has exactly 0 or 1 value (which is `false`) */
    readonly hasAtMost1Element: false

    /**
     * The current {@link CollectionHolderOf2 instance} has exactly 0 or 1 value (which is `false`)
     *
     * @alias CollectionHolderOf2.hasAtMost1Element
     */
    readonly containsAtMost1Element: this["hasAtMost1Element"]

    /**
     * The current {@link CollectionHolderOf2 instance} has exactly 0 or 1 value (which is `false`)
     *
     * @alias CollectionHolderOf2.hasAtMost1Element
     */
    readonly includesAtMost1Element: this["hasAtMost1Element"]


    /** The current {@link CollectionHolderOf2 instance} has a minimum of 2 values (which is `true`) */
    readonly hasAtLeast2Elements: true

    /**
     * The current {@link CollectionHolderOf2 instance} has a minimum of 2 values (which is `true`)
     *
     * @alias CollectionHolderOf2.hasAtLeast2Elements
     */
    readonly containsAtLeast2Elements: this["hasAtLeast2Elements"]

    /**
     * The current {@link CollectionHolderOf2 instance} has a minimum of 2 values (which is `true`)
     *
     * @alias CollectionHolderOf2.hasAtLeast2Elements
     */
    readonly includesAtLeast2Elements: this["hasAtLeast2Elements"]


    /** The current {@link CollectionHolderOf2 instance} has exactly 2 values (which is `true`) */
    readonly hasExactly2Elements: true

    /**
     * The current {@link CollectionHolderOf2 instance} has exactly 2 values (which is `true`)
     *
     * @alias CollectionHolderOf2.hasExactly2Elements
     */
    readonly containsExactly2Elements: this["hasExactly2Elements"]

    /**
     * The current {@link CollectionHolderOf2 instance} has exactly 2 values (which is `true`)
     *
     * @alias CollectionHolderOf2.hasExactly2Elements
     */
    readonly includesExactly2Elements: this["hasExactly2Elements"]


    /** The current {@link CollectionHolderOf2 instance} has exactly 0, 1 or 2 values (which is `true`) */
    readonly hasAtMost2Elements: true

    /**
     * The current {@link CollectionHolderOf2 instance} has exactly 0, 1 or 2 values (which is `true`)
     *
     * @alias CollectionHolderOf2.hasAtMost2Elements
     */
    readonly containsAtMost2Elements: this["hasAtMost2Elements"]

    /**
     * The current {@link CollectionHolderOf2 instance} has exactly 0, 1 or 2 values (which is `true`)
     *
     * @alias CollectionHolderOf2.hasAtMost2Elements
     */
    readonly includesAtMost2Elements: this["hasAtMost2Elements"]

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    /**
     * Get the {@link value1} if the {@link index} is `0`|`-2`
     * or the {@link value2} if the {@link index} is `1`|`-1` in the current {@link collectionHolderOf2 instance}
     *
     * @param index The index to retrieve a value
     * @throws IndexOutOfBoundsException The {@link index} is not `0`, `1`, `-1` or `-2`
     * @throws ForbiddenIndexException   The {@link index} is a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.at
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/get.html Kotlin get(index)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#get(int) Java get(index)
     * @typescriptDefinition
     * @canReceiveNegativeValue
     */
    get<const I extends number, >(index: I,): DoubleValueFromIndex<I, T1, T2>

    /**
     * Get the {@link value1} if the {@link index} is `0`|`-2`
     * or the {@link value2} if the {@link index} is `1`|`-1` in the current {@link collectionHolderOf2 instance}
     *
     * @param index The index to retrieve a value
     * @throws IndexOutOfBoundsException The {@link index} is not `0`, `1`, `-1` or `-2`
     * @throws ForbiddenIndexException   The {@link index} is a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.at
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/get.html Kotlin get(index)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#get(int) Java get(index)
     * @canReceiveNegativeValue
     */
    get(index: number,): | T1 | T2


    /**
     * Get the {@link value1} if the {@link index} is `0`|`-2`
     * or the {@link value2} if the {@link index} is `1`|`-1` in the current {@link collectionHolderOf2 instance}
     *
     * @param index The index to retrieve a value
     * @throws IndexOutOfBoundsException The {@link index} is not `0`, `1`, `-1` or `-2`
     * @throws ForbiddenIndexException   The {@link index} is a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.at
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/get.html Kotlin get(index)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#get(int) Java get(index)
     * @typescriptDefinition
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf2.get
     */
    at<const I extends number, >(index: I,): DoubleValueFromIndex<I, T1, T2>

    /**
     * Get the {@link value1} if the {@link index} is `0`|`-2`
     * or the {@link value2} if the {@link index} is `1`|`-1` in the current {@link collectionHolderOf2 instance}
     *
     * @param index The index to retrieve a value
     * @throws IndexOutOfBoundsException The {@link index} is not `0`, `1`, `-1` or `-2`
     * @throws ForbiddenIndexException   The {@link index} is a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.at
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/get.html Kotlin get(index)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#get(int) Java get(index)
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf2.get
     */
    at(index: number,): | T1 | T2


    /**
     * Get the {@link value1} if the {@link index} is `0`|`-2`
     * or the {@link value2} if the {@link index} is `1`|`-1` in the current {@link collectionHolderOf2 instance}
     *
     * @param index The index to retrieve a value
     * @throws IndexOutOfBoundsException The {@link index} is not `0`, `1`, `-1` or `-2`
     * @throws ForbiddenIndexException   The {@link index} is a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.at
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/get.html Kotlin get(index)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#get(int) Java get(index)
     * @typescriptDefinition
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf2.get
     */
    elementAt<const I extends number, >(index: I,): DoubleValueFromIndex<I, T1, T2>

    /**
     * Get the {@link value1} if the {@link index} is `0`|`-2`
     * or the {@link value2} if the {@link index} is `1`|`-1` in the current {@link collectionHolderOf2 instance}
     *
     * @param index The index to retrieve a value
     * @throws IndexOutOfBoundsException The {@link index} is not `0`, `1`, `-1` or `-2`
     * @throws ForbiddenIndexException   The {@link index} is a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.at
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/get.html Kotlin get(index)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#get(int) Java get(index)
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf2.get
     */
    elementAt(index: number,): | T1 | T2

    //#endregion -------------------- Get --------------------
    //#region -------------------- Get first --------------------

    /**
     * Get the {@link value1} in the current {@link CollectionHolderOf2 instance}
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/SequencedCollection.html#getFirst() Java getFirst()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First()
     */
    getFirst(): T1

    //#endregion -------------------- Get first --------------------
    //#region -------------------- Get last --------------------

    /**
     * Get the {@link value2} in the current {@link CollectionHolderOf2 instance}
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/SequencedCollection.html#getLast() Java getLast()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last()
     */
    getLast(): T2

    //#endregion -------------------- Get last --------------------

    //#region -------------------- Get or else --------------------

    /**
     * Get the {@link value1} if the {@link index} is `0`|`-2`
     * or the {@link value2} if the {@link index} is `1`|`-1` in the current {@link collectionHolderOf2 instance}
     * or calling the {@link defaultValue} function otherwise
     *
     * @param index        The index to retrieve a value
     * @param defaultValue The callback to retrieve the default value if it is not `0`, `1`, `-1` or `-2`
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-else.html Kotlin getOrElse(key, defaultValue)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-else.html Kotlin elementAtOrElse(key, defaultValue)
     * @typescriptDefinition
     * @canReceiveNegativeValue
     */
    getOrElse<const U, const I extends number, >(index: I, defaultValue: IndexWithReturnCallback<U>,): DoubleValueFromIndexOrElse<I, T1, T2, U>

    /**
     * Get the {@link value1} if the {@link index} is `0`|`-2`
     * or the {@link value2} if the {@link index} is `1`|`-1` in the current {@link collectionHolderOf2 instance}
     * or calling the {@link defaultValue} function otherwise
     *
     * @param index        The index to retrieve a value
     * @param defaultValue The callback to retrieve the default value if it is not `0`, `1`, `-1` or `-2`
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-else.html Kotlin getOrElse(key, defaultValue)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-else.html Kotlin elementAtOrElse(key, defaultValue)
     * @canReceiveNegativeValue
     */
    getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T1 | T2 | U

    /**
     * Get the {@link value1} if the {@link index} is `0`|`-2`
     * or the {@link value2} if the {@link index} is `1`|`-1` in the current {@link collectionHolderOf2 instance}
     * or calling the {@link defaultValue} function otherwise
     *
     * @param index        The index to retrieve a value
     * @param defaultValue The callback to retrieve the default value if it is not `0`, `1`, `-1` or `-2`
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-else.html Kotlin getOrElse(key, defaultValue)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-else.html Kotlin elementAtOrElse(key, defaultValue)
     * @canReceiveNegativeValue
     */
    getOrElse(index: number, defaultValue: IndexWithReturnCallback<| T1 | T2>,): | T1 | T2


    /**
     * Get the {@link value1} if the {@link index} is `0`|`-2`
     * or the {@link value2} if the {@link index} is `1`|`-1` in the current {@link collectionHolderOf2 instance}
     * or calling the {@link defaultValue} function otherwise
     *
     * @param index        The index to retrieve a value
     * @param defaultValue The callback to retrieve the default value if it is not `0`, `1`, `-1` or `-2`
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-else.html Kotlin getOrElse(key, defaultValue)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-else.html Kotlin elementAtOrElse(key, defaultValue)
     * @typescriptDefinition
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf2.getOrElse
     */
    atOrElse<const U, const I extends number, >(index: I, defaultValue: IndexWithReturnCallback<U>,): DoubleValueFromIndexOrElse<I, T1, T2, U>

    /**
     * Get the {@link value1} if the {@link index} is `0`|`-2`
     * or the {@link value2} if the {@link index} is `1`|`-1` in the current {@link collectionHolderOf2 instance}
     * or calling the {@link defaultValue} function otherwise
     *
     * @param index        The index to retrieve a value
     * @param defaultValue The callback to retrieve the default value if it is not `0`, `1`, `-1` or `-2`
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-else.html Kotlin getOrElse(key, defaultValue)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-else.html Kotlin elementAtOrElse(key, defaultValue)
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf2.getOrElse
     */
    atOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T1 | T2 | U

    /**
     * Get the {@link value1} if the {@link index} is `0`|`-2`
     * or the {@link value2} if the {@link index} is `1`|`-1` in the current {@link collectionHolderOf2 instance}
     * or calling the {@link defaultValue} function otherwise
     *
     * @param index        The index to retrieve a value
     * @param defaultValue The callback to retrieve the default value if it is not `0`, `1`, `-1` or `-2`
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-else.html Kotlin getOrElse(key, defaultValue)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-else.html Kotlin elementAtOrElse(key, defaultValue)
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf2.getOrElse
     */
    atOrElse(index: number, defaultValue: IndexWithReturnCallback<| T1 | T2>,): | T1 | T2


    /**
     * Get the {@link value1} if the {@link index} is `0`|`-2`
     * or the {@link value2} if the {@link index} is `1`|`-1` in the current {@link collectionHolderOf2 instance}
     * or calling the {@link defaultValue} function otherwise
     *
     * @param index        The index to retrieve a value
     * @param defaultValue The callback to retrieve the default value if it is not `0`, `1`, `-1` or `-2`
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-else.html Kotlin getOrElse(key, defaultValue)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-else.html Kotlin elementAtOrElse(key, defaultValue)
     * @typescriptDefinition
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf2.getOrElse
     */
    elementAtOrElse<const U, const I extends number, >(index: I, defaultValue: IndexWithReturnCallback<U>,): DoubleValueFromIndexOrElse<I, T1, T2, U>

    /**
     * Get the {@link value1} if the {@link index} is `0`|`-2`
     * or the {@link value2} if the {@link index} is `1`|`-1` in the current {@link collectionHolderOf2 instance}
     * or calling the {@link defaultValue} function otherwise
     *
     * @param index        The index to retrieve a value
     * @param defaultValue The callback to retrieve the default value if it is not `0`, `1`, `-1` or `-2`
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-else.html Kotlin getOrElse(key, defaultValue)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-else.html Kotlin elementAtOrElse(key, defaultValue)
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf2.getOrElse
     */
    elementAtOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T1 | T2 | U

    /**
     * Get the {@link value1} if the {@link index} is `0`|`-2`
     * or the {@link value2} if the {@link index} is `1`|`-1` in the current {@link collectionHolderOf2 instance}
     * or calling the {@link defaultValue} function otherwise
     *
     * @param index        The index to retrieve a value
     * @param defaultValue The callback to retrieve the default value if it is not `0`, `1`, `-1` or `-2`
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-else.html Kotlin getOrElse(key, defaultValue)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-else.html Kotlin elementAtOrElse(key, defaultValue)
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf2.getOrElse
     */
    elementAtOrElse(index: number, defaultValue: IndexWithReturnCallback<| T1 | T2>,): | T1 | T2

    //#endregion -------------------- Get or else --------------------
    //#region -------------------- Get first or else --------------------

    /**
     * Get the {@link value1} in the current {@link CollectionHolderOf2 instance}
     * and __NEVER__ call the {@link defaultValue} function
     *
     * @param defaultValue The (_never called_) callback to retrieve the default value
     */
    getFirstOrElse<const U, >(defaultValue: ReturnCallback<U>,): T1

    /**
     * Get the {@link value1} in the current {@link CollectionHolderOf2 instance}
     * and __NEVER__ call the {@link defaultValue} function
     *
     * @param defaultValue The (_never called_) callback to retrieve the default value
     */
    getFirstOrElse(defaultValue: ReturnCallback<| T1 | T2>,): T1

    //#endregion -------------------- Get first or else --------------------
    //#region -------------------- Get last or else --------------------

    /**
     * Get the {@link value2} in the current {@link CollectionHolderOf2 instance}
     * and __NEVER__ call the {@link defaultValue} function
     *
     * @param defaultValue The (_never called_) callback to retrieve the default value
     */
    getLastOrElse<const U, >(defaultValue: ReturnCallback<U>,): T2

    /**
     * Get the {@link value2} in the current {@link CollectionHolderOf2 instance}
     * and __NEVER__ call the {@link defaultValue} function
     *
     * @param defaultValue The (_never called_) callback to retrieve the default value
     */
    getLastOrElse(defaultValue: ReturnCallback<| T1 | T2>,): T2

    //#endregion -------------------- Get last or else --------------------

    //#region -------------------- Get or null --------------------

    /**
     * Get the {@link value1} if the {@link index} is `0`|`-2`
     * or the {@link value2} if the {@link index} is `1`|`-1` in the current {@link collectionHolderOf2 instance}
     * or `null` otherwise
     *
     * @param index The index to retrieve a value
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-null.html Kotlin getOrNull(index)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-null.html Kotlin elementAtOrNull(index)
     * @typescriptDefinition
     * @canReceiveNegativeValue
     */
    getOrNull<I extends number, >(index: I,): DoubleValueFromIndexOrNull<I, T1, T2>

    /**
     * Get the {@link value1} if the {@link index} is `0`|`-2`
     * or the {@link value2} if the {@link index} is `1`|`-1` in the current {@link collectionHolderOf2 instance}
     * or `null` otherwise
     *
     * @param index The index to retrieve a value
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-null.html Kotlin getOrNull(index)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-null.html Kotlin elementAtOrNull(index)
     * @canReceiveNegativeValue
     */
    getOrNull(index: number,): NullOr<| T1 | T2>


    /**
     * Get the {@link value1} if the {@link index} is `0`|`-2`
     * or the {@link value2} if the {@link index} is `1`|`-1` in the current {@link collectionHolderOf2 instance}
     * or `null` otherwise
     *
     * @param index The index to retrieve a value
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-null.html Kotlin getOrNull(index)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-null.html Kotlin elementAtOrNull(index)
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf2.getOrNull
     */
    atOrNull<I extends number, >(index: I,): DoubleValueFromIndexOrNull<I, T1, T2>

    /**
     * Get the {@link value1} if the {@link index} is `0`|`-2`
     * or the {@link value2} if the {@link index} is `1`|`-1` in the current {@link collectionHolderOf2 instance}
     * or `null` otherwise
     *
     * @param index The index to retrieve a value
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-null.html Kotlin getOrNull(index)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-null.html Kotlin elementAtOrNull(index)
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf2.getOrNull
     */
    atOrNull(index: number,): NullOr<| T1 | T2>


    /**
     * Get the {@link value1} if the {@link index} is `0`|`-2`
     * or the {@link value2} if the {@link index} is `1`|`-1` in the current {@link collectionHolderOf2 instance}
     * or `null` otherwise
     *
     * @param index The index to retrieve a value
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-null.html Kotlin getOrNull(index)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-null.html Kotlin elementAtOrNull(index)
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf2.getOrNull
     */
    elementAtOrNull<I extends number, >(index: I,): DoubleValueFromIndexOrNull<I, T1, T2>

    /**
     * Get the {@link value1} if the {@link index} is `0`|`-2`
     * or the {@link value2} if the {@link index} is `1`|`-1` in the current {@link collectionHolderOf2 instance}
     * or `null` otherwise
     *
     * @param index The index to retrieve a value
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/get-or-null.html Kotlin getOrNull(index)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/element-at-or-null.html Kotlin elementAtOrNull(index)
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf2.getOrNull
     */
    elementAtOrNull(index: number,): NullOr<| T1 | T2>

    //#endregion -------------------- Get or null --------------------
    //#region -------------------- Get first or null --------------------

    /**
     * Get the {@link value1} in the current {@link CollectionHolderOf2 instance}
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault()
     */
    getFirstOrNull(): T1

    //#endregion -------------------- Get first or null --------------------
    //#region -------------------- Get last or null --------------------

    /**
     * Get the {@link value2} in the current {@link CollectionHolderOf2 instance}
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault()
     */
    getLastOrNull(): T2

    //#endregion -------------------- Get last or null --------------------

    //#region -------------------- First --------------------

    /**
     * Get the {@link value1} in the current {@link CollectionHolderOf2 instance}
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/SequencedCollection.html#getFirst() Java getFirst()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First()
     * @alias CollectionHolderOf2.getFirst
     */
    first(): T1

    /**
     * Give the {@link value1}|{@link value2} if the {@link predicate} is `true` in the current {@link CollectionHolderOf2 instance}
     *
     * @param predicate The given predicate
     * @throws IndexOutOfBoundsException The {@link predicate} gave `false` when comparing to the {@link value1} and {@link value2}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
     * @alias CollectionHolderOf2.findFirst
     * @typescriptDefinition
     */
    first<const S extends | T1 | T2, >(predicate: Nullable<RestrainedBooleanCallback<| T1 | T2, S>>,): S

    /**
     * Give the {@link value1}|{@link value2} if the {@link predicate} is `true` in the current {@link CollectionHolderOf2 instance}
     *
     * @param predicate The given predicate
     * @throws IndexOutOfBoundsException The {@link predicate} gave `false` when comparing to the {@link value1} and {@link value2}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
     * @alias CollectionHolderOf2.findFirst
     */
    first(predicate: Nullable<BooleanCallback<| T1 | T2>>,): | T1 | T2

    //#endregion -------------------- First --------------------
    //#region -------------------- First or null --------------------

    /**
     * Get the {@link value1} in the current {@link CollectionHolderOf2 instance}
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault()
     * @alias CollectionHolderOf2.getFirstOrNull
     */
    firstOrNull(): T1

    /**
     * Give the {@link value1}|{@link value2} if the {@link predicate} is `true` in the current {@link CollectionHolderOf2 instance}
     * or `null` otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html Kotlin find(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     * @alias CollectionHolderOf2.findOrNull
     * @typescriptDefinition
     */
    firstOrNull<const S extends | T1 | T2, >(predicate: Nullable<RestrainedBooleanCallback<| T1 | T2, S>>,): NullOr<S>

    /**
     * Give the {@link value1}|{@link value2} if the {@link predicate} is `true` in the current {@link CollectionHolderOf2 instance}
     * or `null` otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html find(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     * @alias CollectionHolderOf2.findOrNull
     */
    firstOrNull(predicate: Nullable<BooleanCallback<| T1 | T2>>,): NullOr<| T1 | T2>

    //#endregion -------------------- First or null --------------------
    //#region -------------------- First indexed --------------------

    /**
     * Get the {@link value1} in the current {@link CollectionHolderOf2 instance}
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/SequencedCollection.html#getFirst() Java getFirst()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First()
     * @alias CollectionHolderOf2.getFirst
     */
    firstIndexed(): T1

    /**
     * Give the {@link value1}|{@link value2} if the {@link predicate} is `true` in the current {@link CollectionHolderOf2 instance}
     *
     * @param predicate The given predicate
     * @throws IndexOutOfBoundsException The {@link predicate} gave `false` when comparing to the {@link value1} and {@link value2}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
     * @alias CollectionHolderOf2.findFirstIndexed
     * @typescriptDefinition
     */
    firstIndexed<const S extends | T1 | T2, >(predicate: Nullable<ReverseRestrainedBooleanCallback<| T1 | T2, S>>,): S

    /**
     * Give the {@link value1}|{@link value2} if the {@link predicate} is `true` in the current {@link CollectionHolderOf2 instance}
     *
     * @param predicate The given predicate
     * @throws IndexOutOfBoundsException The {@link predicate} gave `false` when comparing to the {@link value1} and {@link value2}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
     * @alias CollectionHolderOf2.findFirstIndexed
     */
    firstIndexed(predicate: Nullable<ReverseBooleanCallback<| T1 | T2>>,): | T1 | T2

    //#endregion -------------------- First indexed --------------------
    //#region -------------------- First indexed or null --------------------

    /**
     * Get the {@link value1} in the current {@link CollectionHolderOf2 instance}
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault()
     * @alias CollectionHolderOf2.getFirstOrNull
     */
    firstIndexedOrNull(): T1

    /**
     * Give the {@link value1}|{@link value2} if the {@link predicate} is `true` in the current {@link CollectionHolderOf2 instance}
     * or `null` otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html Kotlin find(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     * @alias CollectionHolderOf2.findFirstIndexedOrNull
     * @typescriptDefinition
     */
    firstIndexedOrNull<const S extends | T1 | T2, >(predicate: Nullable<ReverseRestrainedBooleanCallback<| T1 | T2, S>>,): NullOr<S>

    /**
     * Give the {@link value1}|{@link value2} if the {@link predicate} is `true` in the current {@link CollectionHolderOf2 instance}
     * or `null` otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html find(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     * @alias CollectionHolderOf2.findFirstIndexedOrNull
     */
    firstIndexedOrNull(predicate: Nullable<ReverseBooleanCallback<| T1 | T2>>,): NullOr<| T1 | T2>

    //#endregion -------------------- First indexed or null --------------------

    //#region -------------------- Last --------------------

    /**
     * Get the {@link value1}|{@link value2} in the current {@link CollectionHolderOf2 instance}
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/SequencedCollection.html#getLast() Java getLast()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last()
     * @alias CollectionHolderOf2.getLast
     */
    last(): T2

    /**
     * Give the {@link value1}|{@link value2} if the {@link predicate} is `true` in the current {@link CollectionHolderOf2 instance}
     *
     * @param predicate The given predicate
     * @throws IndexOutOfBoundsException The {@link predicate} gave `false` when comparing to the {@link value1} and {@link value2}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
     * @alias CollectionHolderOf2.findLast
     * @typescriptDefinition
     */
    last<const S extends | T1 | T2, >(predicate: Nullable<RestrainedBooleanCallback<| T1 | T2, S>>,): S

    /**
     * Give the {@link value1}|{@link value2} if the {@link predicate} is `true` in the current {@link CollectionHolderOf2 instance}
     *
     * @param predicate The given predicate
     * @throws IndexOutOfBoundsException The {@link predicate} gave `false` when comparing to the {@link value1} and {@link value2}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
     * @alias CollectionHolderOf2.findLast
     */
    last(predicate: Nullable<BooleanCallback<| T1 | T2>>,): | T1 | T2

    //#endregion -------------------- Last --------------------
    //#region -------------------- Last or null --------------------

    /**
     * Get the {@link value1}|{@link value2} in the current {@link CollectionHolderOf2 instance}
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault()
     * @alias CollectionHolderOf2.getLastOrNull
     */
    lastOrNull(): T2

    /**
     * Give the {@link value1}|{@link value2} if the {@link predicate} is `true` in the current {@link CollectionHolderOf2 instance}
     * or `null` otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.findLast
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
     * @alias CollectionHolderOf2.findLastOrNull
     * @typescriptDefinition
     */
    lastOrNull<const S extends | T1 | T2, >(predicate: Nullable<RestrainedBooleanCallback<| T1 | T2, S>>,): NullOr<S>

    /**
     * Give the {@link value1}|{@link value2} if the {@link predicate} is `true` in the current {@link CollectionHolderOf2 instance}
     * or `null` otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.findLast
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
     * @alias CollectionHolderOf2.findLastOrNull
     */
    lastOrNull(predicate: Nullable<BooleanCallback<| T1 | T2>>,): NullOr<| T1 | T2>

    //#endregion -------------------- Last or null --------------------
    //#region -------------------- Last indexed --------------------

    /**
     * Get the {@link value1}|{@link value2} in the current {@link CollectionHolderOf2 instance}
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/SequencedCollection.html#getLast() Java getLast()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last()
     * @alias CollectionHolderOf2.getLast
     */
    lastIndexed(): T2

    /**
     * Give the {@link value1}|{@link value2} if the {@link predicate} is `true` in the current {@link CollectionHolderOf2 instance}
     *
     * @param predicate The given predicate
     * @throws IndexOutOfBoundsException The {@link predicate} gave `false` when comparing to the {@link value1} and {@link value2}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
     * @alias CollectionHolderOf2.findLastIndexed
     * @typescriptDefinition
     */
    lastIndexed<const S extends | T1 | T2, >(predicate: Nullable<ReverseRestrainedBooleanCallback<| T1 | T2, S>>,): S

    /**
     * Give the {@link value1}|{@link value2} if the {@link predicate} is `true` in the current {@link CollectionHolderOf2 instance}
     *
     * @param predicate The given predicate
     * @throws IndexOutOfBoundsException The {@link predicate} gave `false` when comparing to the {@link value1} and {@link value2}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
     * @alias CollectionHolderOf2.findLastIndexed
     */
    lastIndexed(predicate: Nullable<ReverseBooleanCallback<| T1 | T2>>,): | T1 | T2

    //#endregion -------------------- Last indexed --------------------
    //#region -------------------- Last indexed or null --------------------

    /**
     * Get the {@link value1}|{@link value2} in the current {@link CollectionHolderOf2 instance}
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault()
     * @alias CollectionHolderOf2.getLastOrNull
     */
    lastIndexedOrNull(): T2

    /**
     * Give the {@link value1}|{@link value2} if the {@link predicate} is `true` in the current {@link CollectionHolderOf2 instance}
     * or `null` otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.findLast
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
     * @alias CollectionHolderOf2.findLastIndexedOrNull
     * @typescriptDefinition
     */
    lastIndexedOrNull<const S extends | T1 | T2, >(predicate: Nullable<ReverseRestrainedBooleanCallback<| T1 | T2, S>>,): NullOr<S>

    /**
     * Give the {@link value1}|{@link value2} if the {@link predicate} is `true` in the current {@link CollectionHolderOf2 instance}
     * or `null` otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.findLast
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
     * @alias CollectionHolderOf2.findLastIndexedOrNull
     */
    lastIndexedOrNull(predicate: Nullable<ReverseBooleanCallback<| T1 | T2>>,): NullOr<| T1 | T2>

    //#endregion -------------------- Last indexed or null --------------------

    //#region -------------------- Find first --------------------

    /**
     * Give the {@link value1}|{@link value2} if the {@link predicate} is `true` in the current {@link CollectionHolderOf2 instance}
     *
     * @param predicate The given predicate
     * @throws IndexOutOfBoundsException The {@link predicate} gave `false` when comparing to the {@link value1} and {@link value2}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
     * @typescriptDefinition
     */
    findFirst<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): S

    /**
     * Give the {@link value1}|{@link value2} if the {@link predicate} is `true` in the current {@link CollectionHolderOf2 instance}
     *
     * @param predicate The given predicate
     * @throws IndexOutOfBoundsException The {@link predicate} gave `false` when comparing to the {@link value1} and {@link value2}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
     */
    findFirst(predicate: BooleanCallback<| T1 | T2>,): | T1 | T2


    /**
     * Give the {@link value1}|{@link value2} if the {@link predicate} is `true` in the current {@link CollectionHolderOf2 instance}
     *
     * @param predicate The given predicate
     * @throws IndexOutOfBoundsException The {@link predicate} gave `false` when comparing to the {@link value1} and {@link value2}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
     * @alias CollectionHolderOf2.findFirst
     * @typescriptDefinition
     */
    find<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): S

    /**
     * Give the {@link value1}|{@link value2} if the {@link predicate} is `true` in the current {@link CollectionHolderOf2 instance}
     *
     * @param predicate The given predicate
     * @throws IndexOutOfBoundsException The {@link predicate} gave `false` when comparing to the {@link value1} and {@link value2}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
     * @alias CollectionHolderOf2.findFirst
     */
    find(predicate: BooleanCallback<| T1 | T2>,): | T1 | T2

    //#endregion -------------------- Find first --------------------
    //#region -------------------- Find first or null --------------------

    /**
     * Give the {@link value1}|{@link value2} if the {@link predicate} is `true` in the current {@link CollectionHolderOf2 instance}
     * or `null` otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html Kotlin find(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     * @typescriptDefinition
     */
    findFirstOrNull<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): NullOr<S>

    /**
     * Give the {@link value1}|{@link value2} if the {@link predicate} is `true` in the current {@link CollectionHolderOf2 instance}
     * or `null` otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html Kotlin find(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     */
    findFirstOrNull(predicate: BooleanCallback<| T1 | T2>,): NullOr<| T1 | T2>


    /**
     * Give the {@link value1}|{@link value2} if the {@link predicate} is `true` in the current {@link CollectionHolderOf2 instance}
     * or `null` otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html Kotlin find(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     * @alias CollectionHolderOf2.findFirstOrNull
     * @typescriptDefinition
     */
    findOrNull<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): NullOr<S>

    /**
     * Give the {@link value1}|{@link value2} if the {@link predicate} is `true` in the current {@link CollectionHolderOf2 instance}
     * or `null` otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html Kotlin find(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     * @alias CollectionHolderOf2.findFirstOrNull
     */
    findOrNull(predicate: BooleanCallback<| T1 | T2>,): NullOr<| T1 | T2>

    //#endregion -------------------- Find first or null --------------------
    //#region -------------------- Find first indexed --------------------

    /**
     * Give the {@link value1}|{@link value2} if the {@link predicate} is `true` in the current {@link CollectionHolderOf2 instance}
     *
     * @param predicate The given predicate
     * @throws IndexOutOfBoundsException The {@link predicate} gave `false` when comparing to the {@link value1} and {@link value2}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
     * @typescriptDefinition
     */
    findFirstIndexed<const S extends | T1 | T2, >(predicate: ReverseRestrainedBooleanCallback<| T1 | T2, S>,): NullOr<S>

    /**
     * Give the {@link value1}|{@link value2} if the {@link predicate} is `true` in the current {@link CollectionHolderOf2 instance}
     *
     * @param predicate The given predicate
     * @throws IndexOutOfBoundsException The {@link predicate} gave `false` when comparing to the {@link value1} and {@link value2}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
     */
    findFirstIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,): NullOr<| T1 | T2>


    /**
     * Give the {@link value1}|{@link value2} if the {@link predicate} is `true` in the current {@link CollectionHolderOf2 instance}
     *
     * @param predicate The given predicate
     * @throws IndexOutOfBoundsException The {@link predicate} gave `false` when comparing to the {@link value1} and {@link value2}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
     * @alias CollectionHolderOf2.findFirstIndexed
     * @typescriptDefinition
     */
    findIndexed<const S extends | T1 | T2, >(predicate: ReverseRestrainedBooleanCallback<| T1 | T2, S>,): NullOr<S>

    /**     * Give the {@link value1}|{@link value2} if the {@link predicate} is `true` in the current {@link CollectionHolderOf2 instance}
     *
     * @param predicate The given predicate
     * @throws IndexOutOfBoundsException The {@link predicate} gave `false` when comparing to the {@link value1} and {@link value2}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html Kotlin first(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first C# First(predicate)
     * @alias CollectionHolderOf2.findFirstIndexed
     */
    findIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,): NullOr<| T1 | T2>

    //#endregion -------------------- Find first indexed --------------------
    //#region -------------------- Find first indexed or null --------------------

    /**
     * Find the first element from the {@link predicate} in the current {@link CollectionHolderOf2 instance}
     * or `null` otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html Kotlin find(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     * @typescriptDefinition
     */
    findFirstIndexedOrNull<const S extends | T1 | T2, >(predicate: ReverseRestrainedBooleanCallback<| T1 | T2, S>,): NullOr<S>

    /**
     * Find the first element from the {@link predicate} in the current {@link CollectionHolderOf2 instance}
     * or `null` otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html Kotlin find(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     */
    findFirstIndexedOrNull(predicate: ReverseBooleanCallback<| T1 | T2>,): NullOr<| T1 | T2>


    /**
     * Find the first element from the {@link predicate} in the current {@link CollectionHolderOf2 instance}
     * or `null` otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html Kotlin find(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     * @alias CollectionHolderOf2.findFirstIndexedOrNull
     * @typescriptDefinition
     */
    findIndexedOrNull<const S extends | T1 | T2, >(predicate: ReverseRestrainedBooleanCallback<| T1 | T2, S>,): NullOr<S>

    /**
     * Find the first element from the {@link predicate} in the current {@link CollectionHolderOf2 instance}
     * or `null` otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.find
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find.html Kotlin find(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first-or-null.html Kotlin firstOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.firstordefault C# FirstOrDefault(predicate)
     * @alias CollectionHolderOf2.findFirstIndexedOrNull
     */
    findIndexedOrNull(predicate: ReverseBooleanCallback<| T1 | T2>,): NullOr<| T1 | T2>

    //#endregion -------------------- Find first indexed or null --------------------

    //#region -------------------- Find last --------------------

    /**
     * Give the {@link value1}|{@link value2} if the {@link predicate} is `true` in the current {@link CollectionHolderOf2 instance}
     *
     * @param predicate The given predicate
     * @throws IndexOutOfBoundsException The {@link predicate} gave `false` when comparing to the {@link value1} and {@link value2}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
     * @typescriptDefinition
     */
    findLast<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): S

    /**
     * Give the {@link value1}|{@link value2} if the {@link predicate} is `true` in the current {@link CollectionHolderOf2 instance}
     *
     * @param predicate The given predicate
     * @throws IndexOutOfBoundsException The {@link predicate} gave `false` when comparing to the {@link value1} and {@link value2}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
     */
    findLast(predicate: BooleanCallback<| T1 | T2>,): | T1 | T2

    //#endregion -------------------- Find last --------------------
    //#region -------------------- Find last or null --------------------

    /**
     * Give the {@link value1}|{@link value2} if the {@link predicate} is `true` in the current {@link CollectionHolderOf2 instance}
     * or `null` otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.findLast
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
     * @typescriptDefinition
     */
    findLastOrNull<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): NullOr<S>

    /**
     * Give the {@link value1}|{@link value2} if the {@link predicate} is `true` in the current {@link CollectionHolderOf2 instance}
     * or `null` otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.findLast
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
     */
    findLastOrNull(predicate: BooleanCallback<| T1 | T2>,): NullOr<| T1 | T2>

    //#endregion -------------------- Find last or null --------------------
    //#region -------------------- Find last indexed --------------------

    /**
     * Give the {@link value1}|{@link value2} if the {@link predicate} is `true` in the current {@link CollectionHolderOf2 instance}
     *
     * @param predicate The given predicate
     * @throws IndexOutOfBoundsException The {@link predicate} gave `false` when comparing to the {@link value1} and {@link value2}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
     * @typescriptDefinition
     */
    findLastIndexed<const S extends | T1 | T2, >(predicate: ReverseRestrainedBooleanCallback<| T1 | T2, S>,): S

    /**
     * Give the {@link value1}|{@link value2} if the {@link predicate} is `true` in the current {@link CollectionHolderOf2 instance}
     *
     * @param predicate The given predicate
     * @throws IndexOutOfBoundsException The {@link predicate} gave `false` when comparing to the {@link value1} and {@link value2}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html Kotlin last(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last C# Last(predicate)
     */
    findLastIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,): | T1 | T2

    //#endregion -------------------- Find last indexed --------------------
    //#region -------------------- Find last indexed or null --------------------

    /**
     * Give the {@link value1}|{@link value2} if the {@link predicate} is `true` in the current {@link CollectionHolderOf2 instance}
     * or `null` otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.findLast
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
     * @typescriptDefinition
     */
    findLastIndexedOrNull<const S extends | T1 | T2, >(predicate: ReverseRestrainedBooleanCallback<| T1 | T2, S>,): NullOr<S>

    /**
     * Give the {@link value1}|{@link value2} if the {@link predicate} is `true` in the current {@link CollectionHolderOf2 instance}
     * or `null` otherwise
     *
     * @param predicate The given predicate
     * @see ReadonlyArray.findLast
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/find-last.html Kotlin findLast(predicate)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last-or-null.html Kotlin lastOrNull(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.lastordefault C# LastOrDefault(predicate)
     */
    findLastIndexedOrNull(predicate: ReverseBooleanCallback<| T1 | T2>,): NullOr<| T1 | T2>

    //#endregion -------------------- Find last indexed or null --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    //#region -------------------- First index of --------------------

    /**
     * Get the {@link value1} equivalent to the {@link element} received
     *
     * @param element The element to find
     * @return {0} `0` if equivalent to the {@link element}
     * @throws IndexNotFoundException No index could be found
     * @see ReadonlyArray.indexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin indexOf(element)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#indexOf(java.lang.Object) Java indexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item, from?, to?)
     * @typescriptDefinition
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    firstIndexOf(element: T1,): 0

    /**
     * Get the {@link value2} equivalent to the {@link element} received
     *
     * @param element The element to find
     * @return {1} `1` if equivalent to the {@link element}
     * @throws IndexNotFoundException No index could be found
     * @see ReadonlyArray.indexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin indexOf(element)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#indexOf(java.lang.Object) Java indexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item, from?, to?)
     * @typescriptDefinition
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    firstIndexOf(element: T2,): 1

    /**
     * Get the {@link value1}|{@link value2} equivalent to the {@link element} received
     *
     * @param element The element to find
     * @return {0|1} `0` or `1` if equivalent to the {@link element}
     * @throws IndexNotFoundException No index could be found
     * @see ReadonlyArray.indexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin indexOf(element)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#indexOf(java.lang.Object) Java indexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item, from?, to?)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    firstIndexOf(element: | T1 | T2,): | 0 | 1

    /**
     * Get the {@link value1} equivalent to the {@link element} received
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @param to      The inclusive ending index (`1` by default)
     * @return {0} `0` if equivalent to the {@link element}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0`, `-1`, `-1` or `-2`
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
    firstIndexOf<const I1 extends NullableNumber, const I2 extends NullableNumber, >(element: T1, from: I1, to?: I2,): IndexOf2Of1<I1, I2>

    /**
     * Get the {@link value1} equivalent to the {@link element} received
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @param to      The inclusive ending index (`1` by default)
     * @return {0} `0` if equivalent to the {@link element}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0`, `-1`, `-1` or `-2`
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
    firstIndexOf(element: T1, from: NullableNumber, to?: NullableNumber,): 0

    /**
     * Get the {@link value2} equivalent to the {@link element} received
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @param to      The inclusive ending index (`1` by default)
     * @return {1} `1` if equivalent to the {@link element}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0`, `-1`, `-1` or `-2`
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
    firstIndexOf<const I1 extends NullableNumber, const I2 extends NullableNumber, >(element: T2, from: I1, to?: I2,): IndexOf2Of2<I1, I2>

    /**
     * Get the {@link value2} equivalent to the {@link element} received
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @param to      The inclusive ending index (`1` by default)
     * @return {0|1} `1` if equivalent to the {@link element}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0`, `-1`, `-1` or `-2`
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
    firstIndexOf(element: T2, from: NullableNumber, to?: NullableNumber,): 1

    /**
     * Get the {@link value1}|{@link value2} equivalent to the {@link element} received
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @param to      The inclusive ending index (`1` by default)
     * @return {0|1} `0`|`1` if equivalent to the {@link element}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0`, `-1`, `-1` or `-2`
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
    firstIndexOf<const I1 extends NullableNumber, const I2 extends NullableNumber, >(element: | T1 | T2, from: I1, to?: I2,): IndexOf2<I1, I2>

    /**
     * Get the {@link value1}|{@link value2} equivalent to the {@link element} received
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @param to      The inclusive ending index (`1` by default)
     * @return {0|1} `0`|`1` if equivalent to the {@link element}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0`, `-1`, `-1` or `-2`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.indexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin indexOf(element)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#indexOf(java.lang.Object) Java indexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item, from?, to?)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    firstIndexOf(element: | T1 | T2, from: NullableNumber, to?: NullableNumber,): | 0 | 1


    /**
     * Get the {@link value1} equivalent to the {@link element} received
     *
     * @param element The element to find
     * @return {0} `0` if equivalent to the {@link element}
     * @throws IndexNotFoundException No index could be found
     * @see ReadonlyArray.indexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin indexOf(element)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#indexOf(java.lang.Object) Java indexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item, from?, to?)
     * @typescriptDefinition
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf2.firstIndexOf
     */
    indexOf(element: T1,): 0

    /**
     * Get the {@link value2} equivalent to the {@link element} received
     *
     * @param element The element to find
     * @return {1} `1` if equivalent to the {@link element}
     * @throws IndexNotFoundException No index could be found
     * @see ReadonlyArray.indexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin indexOf(element)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#indexOf(java.lang.Object) Java indexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item, from?, to?)
     * @typescriptDefinition
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf2.firstIndexOf
     */
    indexOf(element: T2,): 1

    /**
     * Get the {@link value1}|{@link value2} equivalent to the {@link element} received
     *
     * @param element The element to find
     * @return {0|1} `0` or `1` if equivalent to the {@link element}
     * @throws IndexNotFoundException No index could be found
     * @see ReadonlyArray.indexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin indexOf(element)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#indexOf(java.lang.Object) Java indexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item, from?, to?)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf2.firstIndexOf
     */
    indexOf(element: | T1 | T2,): | 0 | 1

    /**
     * Get the {@link value1} equivalent to the {@link element} received
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @param to      The inclusive ending index (`1` by default)
     * @return {0} `0` if equivalent to the {@link element}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0`, `-1`, `-1` or `-2`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.indexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin indexOf(element)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#indexOf(java.lang.Object) Java indexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item, from?, to?)
     * @typescriptDefinition
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf2.firstIndexOf
     */
    indexOf<const I1 extends NullableNumber, const I2 extends NullableNumber, >(element: T1, from: I1, to?: I2,): IndexOf2Of1<I1, I2>

    /**
     * Get the {@link value1} equivalent to the {@link element} received
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @param to      The inclusive ending index (`1` by default)
     * @return {0} `0` if equivalent to the {@link element}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0`, `-1`, `-1` or `-2`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.indexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin indexOf(element)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#indexOf(java.lang.Object) Java indexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item, from?, to?)
     * @typescriptDefinition
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf2.firstIndexOf
     */
    indexOf(element: T1, from: NullableNumber, to?: NullableNumber,): 0

    /**
     * Get the {@link value2} equivalent to the {@link element} received
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @param to      The inclusive ending index (`1` by default)
     * @return {1} `1` if equivalent to the {@link element}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0`, `-1`, `-1` or `-2`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.indexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin indexOf(element)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#indexOf(java.lang.Object) Java indexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item, from?, to?)
     * @typescriptDefinition
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf2.firstIndexOf
     */
    indexOf<const I1 extends NullableNumber, const I2 extends NullableNumber, >(element: T2, from: I1, to?: I2,): IndexOf2Of2<I1, I2>

    /**
     * Get the {@link value2} equivalent to the {@link element} received
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @param to      The inclusive ending index (`1` by default)
     * @return {0|1} `1` if equivalent to the {@link element}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0`, `-1`, `-1` or `-2`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.indexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin indexOf(element)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#indexOf(java.lang.Object) Java indexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item, from?, to?)
     * @typescriptDefinition
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf2.firstIndexOf
     */
    indexOf(element: T2, from: NullableNumber, to?: NullableNumber,): 1

    /**
     * Get the {@link value1}|{@link value2} equivalent to the {@link element} received
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @param to      The inclusive ending index (`1` by default)
     * @return {0|1} `0`|`1` if equivalent to the {@link element}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0`, `-1`, `-1` or `-2`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.indexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin indexOf(element)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#indexOf(java.lang.Object) Java indexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item, from?, to?)
     * @typescriptDefinition
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf2.firstIndexOf
     */
    indexOf<const I1 extends NullableNumber, const I2 extends NullableNumber, >(element: | T1 | T2, from: I1, to?: I2,): IndexOf2<I1, I2>

    /**
     * Get the {@link value1}|{@link value2} equivalent to the {@link element} received
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @param to      The inclusive ending index (`1` by default)
     * @return {0|1} `0`|`1` if equivalent to the {@link element}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0`, `-1`, `-1` or `-2`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.indexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin indexOf(element)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#indexOf(java.lang.Object) Java indexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.indexof C# IndexOf(item, from?, to?)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf2.firstIndexOf
     */
    indexOf(element: | T1 | T2, from: NullableNumber, to?: NullableNumber,): | 0 | 1

    //#endregion -------------------- First index of --------------------
    //#region -------------------- First index of or null --------------------

    /**
     * Get the {@link value1} equivalent to the {@link element} received
     * or `null` if it was not in the current {@link CollectionHolderOf2 instance}
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @param to      The inclusive ending index (`1` by default)
     * @return {NullOrZeroNumber} `0` if equivalent to the {@link element} or `null` otherwise
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    firstIndexOfOrNull(element: T1, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber

    /**
     * Get the {@link value2} equivalent to the {@link element} received
     * or `null` if it was not in the current {@link CollectionHolderOf2 instance}
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @param to      The inclusive ending index (`1` by default)
     * @return {NullOrOneNumber} `1` if equivalent to the {@link element} or `null` otherwise
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    firstIndexOfOrNull(element: T2, from?: NullableNumber, to?: NullableNumber,): NullOrOneNumber

    /**
     * Get the {@link value1}|{@link value2} equivalent to the {@link element} received
     * or `null` if it was not in the current {@link CollectionHolderOf2 instance}
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @param to      The inclusive ending index (`1` by default)
     * @return {0|1|null} `0` or `1` if equivalent to the {@link element} or `null` otherwise
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    firstIndexOfOrNull(element: | T1 | T2, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1>


    /**
     * Get the {@link value1} equivalent to the {@link element} received
     * or `null` if it was not in the current {@link CollectionHolderOf2 instance}
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @param to      The inclusive ending index (`1` by default)
     * @return {NullOrZeroNumber} `0` if equivalent to the {@link element} or `null` otherwise
     * @alias CollectionHolderOf2.firstIndexOfOrNull
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfOrNull(element: T1, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber

    /**
     * Get the {@link value2} equivalent to the {@link element} received
     * or `null` if it was not in the current {@link CollectionHolderOf2 instance}
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @param to      The inclusive ending index (`1` by default)
     * @return {NullOrOneNumber} `1` if equivalent to the {@link element} or `null` otherwise
     * @alias CollectionHolderOf2.firstIndexOfOrNull
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfOrNull(element: T2, from?: NullableNumber, to?: NullableNumber,): NullOrOneNumber

    /**
     * Get the {@link value1}|{@link value2} equivalent to the {@link element} received
     * or `null` if it was not in the current {@link CollectionHolderOf2 instance}
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @param to      The inclusive ending index (`1` by default)
     * @return {0|1|null} `0` or `1` if equivalent to the {@link element} or `null` otherwise
     * @alias CollectionHolderOf2.firstIndexOfOrNull
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfOrNull(element: | T1 | T2, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1>

    //#endregion -------------------- First index of or null --------------------

    //#region -------------------- last index of --------------------

    /**
     * Get the {@link value1} equivalent to the {@link element} received
     *
     * @param element The element to find
     * @return {0} `0` if equivalent to the {@link element}
     * @throws IndexNotFoundException No index could be found
     * @see ReadonlyArray.lastIndexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin lastIndexOf(element)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object) Java lastIndexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item, from?, to?)
     * @typescriptDefinition
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    lastIndexOf(element: T1,): 0

    /**
     * Get the {@link value2} equivalent to the {@link element} received
     *
     * @param element The element to find
     * @return {1} `1` if equivalent to the {@link element}
     * @throws IndexNotFoundException No index could be found
     * @see ReadonlyArray.lastIndexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin lastIndexOf(element)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object) Java lastIndexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item, from?, to?)
     * @typescriptDefinition
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    lastIndexOf(element: T2,): 1

    /**
     * Get the {@link value1}|{@link value2} equivalent to the {@link element} received
     *
     * @param element The element to find
     * @return {0|1} `0` or `1` if equivalent to the {@link element}
     * @throws IndexNotFoundException No index could be found
     * @see ReadonlyArray.lastIndexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin lastIndexOf(element)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object) Java lastIndexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item, from?, to?)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    lastIndexOf(element: | T1 | T2,): | 0 | 1

    /**
     * Get the {@link value1} equivalent to the {@link element} received
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @param to      The inclusive ending index (`1` by default)
     * @return {0} `0` if equivalent to the {@link element}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0`, `-1`, `-1` or `-2`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.lastIndexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin lastIndexOf(element)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object) Java lastIndexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item, from?, to?)
     * @typescriptDefinition
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    lastIndexOf<const I1 extends NullableNumber, const I2 extends NullableNumber, >(element: T1, from: I1, to?: I2,): IndexOf2Of1<I1, I2>

    /**
     * Get the {@link value1} equivalent to the {@link element} received
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @param to      The inclusive ending index (`1` by default)
     * @return {0} `0` if equivalent to the {@link element}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0`, `-1`, `-1` or `-2`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.lastIndexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin lastIndexOf(element)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object) Java lastIndexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item, from?, to?)
     * @typescriptDefinition
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    lastIndexOf(element: T1, from: NullableNumber, to?: NullableNumber,): 0

    /**
     * Get the {@link value2} equivalent to the {@link element} received
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @param to      The inclusive ending index (`1` by default)
     * @return {1} `1` if equivalent to the {@link element}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0`, `-1`, `-1` or `-2`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.lastIndexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin lastIndexOf(element)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object) Java lastIndexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item, from?, to?)
     * @typescriptDefinition
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    lastIndexOf<const I1 extends NullableNumber, const I2 extends NullableNumber, >(element: T2, from: I1, to?: I2,): IndexOf2Of2<I1, I2>

    /**
     * Get the {@link value2} equivalent to the {@link element} received
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @param to      The inclusive ending index (`1` by default)
     * @return {0|1} `1` if equivalent to the {@link element}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0`, `-1`, `-1` or `-2`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.lastIndexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin lastIndexOf(element)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object) Java lastIndexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item, from?, to?)
     * @typescriptDefinition
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    lastIndexOf(element: T2, from: NullableNumber, to?: NullableNumber,): 1

    /**
     * Get the {@link value1}|{@link value2} equivalent to the {@link element} received
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @param to      The inclusive ending index (`1` by default)
     * @return {0|1} `0`|`1` if equivalent to the {@link element}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0`, `-1`, `-1` or `-2`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.lastIndexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin lastIndexOf(element)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object) Java lastIndexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item, from?, to?)
     * @typescriptDefinition
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    lastIndexOf<const I1 extends NullableNumber, const I2 extends NullableNumber, >(element: | T1 | T2, from: I1, to?: I2,): IndexOf2<I1, I2>

    /**
     * Get the {@link value1}|{@link value2} equivalent to the {@link element} received
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @param to      The inclusive ending index (`1` by default)
     * @return {0|1} `0`|`1` if equivalent to the {@link element}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0`, `-1`, `-1` or `-2`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.lastIndexOf
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of.html Kotlin lastIndexOf(element)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/List.html#lastIndexOf(java.lang.Object) Java lastIndexOf(element)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.generic.list-1.lastindexof C# LastIndexOf(item, from?, to?)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    lastIndexOf(element: | T1 | T2, from: NullableNumber, to?: NullableNumber,): | 0 | 1

    //#endregion -------------------- last index of --------------------
    //#region -------------------- Last index of or null --------------------

    /**
     * Get the {@link value1} equivalent to the {@link element} received
     * or `null` if it was not in the current {@link CollectionHolderOf2 instance}
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @param to      The inclusive ending index (`1` by default)
     * @return {NullOrZeroNumber} `0` if equivalent to the {@link element} or `null` otherwise
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    lastIndexOfOrNull(element: T1, from?: NullableNumber, to?: NullableNumber,): NullOrZeroNumber

    /**
     * Get the {@link value2} equivalent to the {@link element} received
     * or `null` if it was not in the current {@link CollectionHolderOf2 instance}
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @param to      The inclusive ending index (`1` by default)
     * @return {NullOrOneNumber} `1` if equivalent to the {@link element} or `null` otherwise
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    lastIndexOfOrNull(element: T2, from?: NullableNumber, to?: NullableNumber,): NullOrOneNumber

    /**
     * Get the {@link value1}|{@link value2} equivalent to the {@link element} received
     * or `null` if it was not in the current {@link CollectionHolderOf2 instance}
     *
     * @param element The element to find
     * @param from    The inclusive starting index (`0` by default)
     * @param to      The inclusive ending index (`1` by default)
     * @return {0|1|null} `0` or `1` if equivalent to the {@link element} or `null` otherwise
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    lastIndexOfOrNull(element: | T1 | T2, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1>

    //#endregion -------------------- Last index of or null --------------------

    //#region -------------------- Index of first --------------------

    /**
     * Get the {@link value1}|{@link value2} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @return {0|1} `0` or `1` if matching the {@link predicate}
     * @throws IndexNotFoundException No index could be found
     * @see ReadonlyArray.findIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfFirst(predicate: BooleanCallback<| T1 | T2>,): | 0 | 1

    /**
     * Get the {@link value1}|{@link value2} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`1` by default)
     * @return {0|1} `0` or `1` if matching the {@link predicate}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0`, `1`, `-1` or `-2`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.findIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
     * @typescriptDefinition
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfFirst<const I1 extends NullableNumber, const I2 extends NullableNumber, >(predicate: BooleanCallback<| T1 | T2>, from: I1, to?: I2,): IndexOf2<I1, I2>

    /**
     * Get the {@link value1}|{@link value2} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`1` by default)
     * @return {0|1} `0` or `1` if matching the {@link predicate}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0`, `1`, `-1` or `-2`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.findIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfFirst(predicate: BooleanCallback<| T1 | T2>, from: NullableNumber, to?: NullableNumber,): | 0 | 1


    /**
     * Get the {@link value1}|{@link value2} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @return {0|1} `0` or `1` if matching the {@link predicate}
     * @throws IndexNotFoundException No index could be found
     * @see ReadonlyArray.findIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf2.indexOfFirst
     */
    findFirstIndex(predicate: BooleanCallback<| T1 | T2>,): | 0 | 1

    /**
     * Get the {@link value1}|{@link value2} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`1` by default)
     * @return {0|1} `0` or `1` if matching the {@link predicate}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0`, `1`, `-1` or `-2`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.findIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
     * @typescriptDefinition
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf2.indexOfFirst
     */
    findFirstIndex<const I1 extends NullableNumber, const I2 extends NullableNumber, >(predicate: BooleanCallback<| T1 | T2>, from: I1, to?: I2,): IndexOf2<I1, I2>

    /**
     * Get the {@link value1}|{@link value2} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`1` by default)
     * @return {0|1} `0` or `1` if matching the {@link predicate}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0`, `1`, `-1` or `-2`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.findIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf2.indexOfFirst
     */
    findFirstIndex(predicate: BooleanCallback<| T1 | T2>, from: NullableNumber, to?: NullableNumber,): | 0 | 1


    /**
     * Get the {@link value1}|{@link value2} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @return {0|1} `0` or `1` if matching the {@link predicate}
     * @throws IndexNotFoundException No index could be found
     * @see ReadonlyArray.findIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf2.indexOfFirst
     */
    findIndex(predicate: BooleanCallback<| T1 | T2>,): | 0 | 1

    /**
     * Get the {@link value1}|{@link value2} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`1` by default)
     * @return {0|1} `0` or `1` if matching the {@link predicate}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0`, `1`, `-1` or `-2`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.findIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
     * @typescriptDefinition
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf2.indexOfFirst
     */
    findIndex<const I1 extends NullableNumber, const I2 extends NullableNumber, >(predicate: BooleanCallback<| T1 | T2>, from: I1, to?: I2,): IndexOf2<I1, I2>

    /**
     * Get the {@link value1}|{@link value2} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`1` by default)
     * @return {0|1} `0` or `1` if matching the {@link predicate}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0`, `1`, `-1` or `-2`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.findIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-first.html Kotlin indexOfFirst(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf2.indexOfFirst
     */
    findIndex(predicate: BooleanCallback<| T1 | T2>, from: NullableNumber, to?: NullableNumber,): | 0 | 1

    //#endregion -------------------- Index of first --------------------
    //#region -------------------- Index of first or null --------------------

    /**
     * Get the {@link value1}|{@link value2} if matching the {@link predicate}
     * or `null` if {@link from}|{@link to} was not `0`|`1`|`-1`|`-2`
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (`1` by default)
     * @return {0|1|null} `0` or `1` if matching the {@link predicate} or `null` otherwise
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfFirstOrNull(predicate: BooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1>


    /**
     * Get the {@link value1}|{@link value2} if matching the {@link predicate}
     * or `null` if {@link from}|{@link to} was not `0`|`1`|`-1`|`-2`
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (`1` by default)
     * @return {0|1|null} `0` or `1` if matching the {@link predicate} or `null` otherwise
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf2.indexOfFirstOrNull
     */
    findFirstIndexOrNull(predicate: BooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1>


    /**
     * Get the {@link value1}|{@link value2} if matching the {@link predicate}
     * or `null` if {@link from}|{@link to} was not `0`|`1`|`-1`|`-2`
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (`1` by default)
     * @return {0|1|null} `0` or `1` if matching the {@link predicate} or `null` otherwise
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf2.indexOfFirstOrNull
     */
    findIndexOrNull(predicate: BooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1>

    //#endregion -------------------- Index of first or null --------------------
    //#region -------------------- Index of first indexed --------------------

    /**
     * Get the {@link value1}|{@link value2} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @return {0|1} `0` or `1` if matching the {@link predicate}
     * @throws IndexNotFoundException No index could be found
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfFirstIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,): | 0 | 1

    /**
     * Get the {@link value1}|{@link value2} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`1` by default)
     * @return {0|1} `0` or `1` if matching the {@link predicate}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0`, `1`, `-1` or `-2`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @typescriptDefinition
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfFirstIndexed<const I1 extends NullableNumber, const I2 extends NullableNumber, >(predicate: ReverseBooleanCallback<| T1 | T2>, from: I1, to?: I2,): IndexOf2<I1, I2>

    /**
     * Get the {@link value1}|{@link value2} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`1` by default)
     * @return {0|1} `0` or `1` if matching the {@link predicate}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0`, `1`, `-1` or `-2`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfFirstIndexed(predicate: ReverseBooleanCallback<| T1 | T2>, from: NullableNumber, to?: NullableNumber,): | 0 | 1


    /**
     * Get the {@link value1}|{@link value2} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @return {0|1} `0` or `1` if matching the {@link predicate}
     * @throws IndexNotFoundException No index could be found
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf2.indexOfFirstIndexed
     */
    findFirstIndexIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,): | 0 | 1

    /**
     * Get the {@link value1}|{@link value2} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`1` by default)
     * @return {0|1} `0` or `1` if matching the {@link predicate}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0`, `1`, `-1` or `-2`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @typescriptDefinition
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf2.indexOfFirstIndexed
     */
    findFirstIndexIndexed<const I1 extends NullableNumber, const I2 extends NullableNumber, >(predicate: ReverseBooleanCallback<| T1 | T2>, from: I1, to?: I2,): IndexOf2<I1, I2>

    /**
     * Get the {@link value1}|{@link value2} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`1` by default)
     * @return {0|1} `0` or `1` if matching the {@link predicate}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0`, `1`, `-1` or `-2`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf2.indexOfFirstIndexed
     */
    findFirstIndexIndexed(predicate: ReverseBooleanCallback<| T1 | T2>, from: NullableNumber, to?: NullableNumber,): | 0 | 1


    /**
     * Get the {@link value1}|{@link value2} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @return {0|1} `0` or `1` if matching the {@link predicate}
     * @throws IndexNotFoundException No index could be found
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf2.indexOfFirstIndexed
     */
    findIndexIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,): | 0 | 1

    /**
     * Get the {@link value1}|{@link value2} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`1` by default)
     * @return {0|1} `0` or `1` if matching the {@link predicate}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0`, `1`, `-1` or `-2`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @typescriptDefinition
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf2.indexOfFirstIndexed
     */
    findIndexIndexed<const I1 extends NullableNumber, const I2 extends NullableNumber, >(predicate: ReverseBooleanCallback<| T1 | T2>, from: I1, to?: I2,): IndexOf2<I1, I2>

    /**
     * Get the {@link value1}|{@link value2} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`1` by default)
     * @return {0|1} `0` or `1` if matching the {@link predicate}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0`, `1`, `-1` or `-2`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf2.indexOfFirstIndexed
     */
    findIndexIndexed(predicate: ReverseBooleanCallback<| T1 | T2>, from: NullableNumber, to?: NullableNumber,): | 0 | 1

    //#endregion -------------------- Index of first indexed --------------------
    //#region -------------------- Index of first indexed or null --------------------

    /**
     * Get the {@link value1}|{@link value2} if matching the {@link predicate}
     * or `null` if {@link from}|{@link to} was not `0`|`1`|`-1`|`-2`
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (`1` by default)
     * @return {0|1|null} `0` or `1` if matching the {@link predicate} or `null` otherwise
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfFirstIndexedOrNull(predicate: ReverseBooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1>


    /**
     * Get the {@link value1}|{@link value2} if matching the {@link predicate}
     * or `null` if {@link from}|{@link to} was not `0`|`1`|`-1`|`-2`
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (`1` by default)
     * @return {0|1|null} `0` or `1` if matching the {@link predicate} or `null` otherwise
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf2.indexOfFirstIndexedOrNull
     */
    findFirstIndexIndexedOrNull(predicate: ReverseBooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1>


    /**
     * Get the {@link value1}|{@link value2} if matching the {@link predicate}
     * or `null` if {@link from}|{@link to} was not `0`|`1`|`-1`|`-2`
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (`1` by default)
     * @return {0|1|null} `0` or `1` if matching the {@link predicate} or `null` otherwise
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf2.indexOfFirstIndexedOrNull
     */
    findIndexIndexedOrNull(predicate: ReverseBooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1>

    //#endregion -------------------- Index of first indexed or null --------------------

    //#region -------------------- Index of last --------------------

    /**
     * Get the {@link value1}|{@link value2} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @return {0|1} `0` or `1` if matching the {@link predicate}
     * @throws IndexNotFoundException No index could be found
     * @see ReadonlyArray.findLastIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfLast(predicate: BooleanCallback<| T1 | T2>,): | 0 | 1

    /**
     * Get the {@link value1}|{@link value2} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`1` by default)
     * @return {0|1} `0` or `1` if matching the {@link predicate}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0`, `1`, `-1` or `-2`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.findLastIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
     * @typescriptDefinition
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfLast<const I1 extends NullableNumber, const I2 extends NullableNumber, >(predicate: BooleanCallback<| T1 | T2>, from: I1, to?: I2,): IndexOf2<I1, I2>

    /**
     * Get the {@link value1}|{@link value2} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`1` by default)
     * @return {0|1} `0` or `1` if matching the {@link predicate}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0`, `1`, `-1` or `-2`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.findLastIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfLast(predicate: BooleanCallback<| T1 | T2>, from: NullableNumber, to?: NullableNumber,): | 0 | 1


    /**
     * Get the {@link value1}|{@link value2} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @return {0|1} `0` or `1` if matching the {@link predicate}
     * @throws IndexNotFoundException No index could be found
     * @see ReadonlyArray.findLastIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf2.indexOfLast
     */
    findLastIndex(predicate: BooleanCallback<| T1 | T2>,): | 0 | 1

    /**
     * Get the {@link value1}|{@link value2} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`1` by default)
     * @return {0|1} `0` or `1` if matching the {@link predicate}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0`, `1`, `-1` or `-2`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.findLastIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
     * @typescriptDefinition
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf2.indexOfLast
     */
    findLastIndex<const I1 extends NullableNumber, const I2 extends NullableNumber, >(predicate: BooleanCallback<| T1 | T2>, from: I1, to?: I2,): IndexOf2<I1, I2>

    /**
     * Get the {@link value1}|{@link value2} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`1` by default)
     * @return {0|1} `0` or `1` if matching the {@link predicate}
     * @throws IndexOutOfBoundsException {@link from} or {@link to} are not `0`, `1`, `-1` or `-2`
     * @throws IndexNotFoundException    No index could be found
     * @throws ForbiddenIndexException   {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.findLastIndex
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/index-of-last.html Kotlin indexOfLast(predicate)
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf2.indexOfLast
     */
    findLastIndex(predicate: BooleanCallback<| T1 | T2>, from: NullableNumber, to?: NullableNumber,): | 0 | 1

    //#endregion -------------------- Index of last --------------------
    //#region -------------------- Index of last or null --------------------

    /**
     * Get the {@link value1}|{@link value2} if matching the {@link predicate}
     * or `null` if {@link from}|{@link to} was not `0`|`1`|`-1`|`-2`
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (`1` by default)
     * @return {0|1|null} `0` or `1` if matching the {@link predicate} or `null` otherwise
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfLastOrNull(predicate: BooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1>


    /**
     * Get the {@link value1}|{@link value2} if matching the {@link predicate}
     * or `null` if {@link from}|{@link to} was not `0`|`1`|`-1`|`-2`
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (`1` by default)
     * @return {0|1|null} `0` or `1` if matching the {@link predicate} or `null` otherwise
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf2.indexOfLastOrNull
     */
    findLastIndexOrNull(predicate: BooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1>

    //#endregion -------------------- Index of last or null --------------------
    //#region -------------------- Index of last indexed --------------------

    /**
     * Get the {@link value1}|{@link value2} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @return {0|1} `0` or `1` if matching the {@link predicate}
     * @throws IndexNotFoundException No index could be found
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfLastIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,): | 0 | 1

    /**
     * Get the {@link value1}|{@link value2} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`1` by default)
     * @return {0|1} `0` or `1` if matching the {@link predicate}
     * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not `0`, `1`, `-1` or `-2`
     * @throws IndexNotFoundException     No index could be found
     * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @throws InvalidIndexRangeException {@link to} is before the {@link from} after the calculation
     * @typescriptDefinition
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfLastIndexed<const I1 extends NullableNumber, const I2 extends NullableNumber, >(predicate: ReverseBooleanCallback<| T1 | T2>, from: I1, to?: I2,): IndexOf2<I1, I2>

    /**
     * Get the {@link value1}|{@link value2} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`1` by default)
     * @return {0|1} `0` or `1` if matching the {@link predicate}
     * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not `0`, `1`, `-1` or `-2`
     * @throws IndexNotFoundException     No index could be found
     * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @throws InvalidIndexRangeException {@link to} is before the {@link from} after the calculation
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfLastIndexed(predicate: ReverseBooleanCallback<| T1 | T2>, from: NullableNumber, to?: NullableNumber,): | 0 | 1


    /**
     * Get the {@link value1}|{@link value2} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @return {0|1} `0` or `1` if matching the {@link predicate}
     * @throws IndexNotFoundException No index could be found
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf2.indexOfLastIndexed
     */
    findLastIndexIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,): | 0 | 1

    /**
     * Get the {@link value1}|{@link value2} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`1` by default)
     * @return {0|1} `0` or `1` if matching the {@link predicate}
     * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not `0`, `1`, `-1` or `-2`
     * @throws IndexNotFoundException     No index could be found
     * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @throws InvalidIndexRangeException {@link to} is before the {@link from} after the calculation
     * @typescriptDefinition
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf2.indexOfLastIndexed
     */
    findLastIndexIndexed<const I1 extends NullableNumber, const I2 extends NullableNumber, >(predicate: ReverseBooleanCallback<| T1 | T2>, from: I1, to?: I2,): IndexOf2<I1, I2>

    /**
     * Get the {@link value1}|{@link value2} if matching the {@link predicate}
     *
     * @param predicate The given predicate
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`1` by default)
     * @return {0|1} `0` or `1` if matching the {@link predicate}
     * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not `0`, `1`, `-1` or `-2`
     * @throws IndexNotFoundException     No index could be found
     * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @throws InvalidIndexRangeException {@link to} is before the {@link from} after the calculation
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf2.indexOfLastIndexed
     */
    findLastIndexIndexed(predicate: ReverseBooleanCallback<| T1 | T2>, from: NullableNumber, to?: NullableNumber,): | 0 | 1

    //#endregion -------------------- Index of last indexed --------------------
    //#region -------------------- Index of last indexed or null --------------------

    /**
     * Get the {@link value1}|{@link value2} if matching the {@link predicate}
     * or `null` if {@link from}|{@link to} was not `0`|`1`|`-1`|`-2`
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (`1` by default)
     * @return {0|1|null} `0` or `1` if matching the {@link predicate} or `null` otherwise
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     */
    indexOfLastIndexedOrNull(predicate: ReverseBooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1>


    /**
     * Get the {@link value1}|{@link value2} if matching the {@link predicate}
     * or `null` if {@link from}|{@link to} was not `0`|`1`|`-1`|`-2`
     *
     * @param predicate The given predicate
     * @param from      The inclusive starting index (`0` by default)
     * @param to        The inclusive ending index (`1` by default)
     * @return {0|1|null} `0` or `1` if matching the {@link predicate} or `null` otherwise
     * @canReceiveNegativeValue
     * @onlyGivePositiveValue
     * @alias CollectionHolderOf2.indexOfLastIndexedOrNull
     */
    findLastIndexIndexedOrNull(predicate: ReverseBooleanCallback<| T1 | T2>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber<| 0 | 1>

    //#endregion -------------------- Index of last indexed or null --------------------

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    //#region -------------------- All --------------------

    /**
     * Check if the {@link value1}|{@link value2} in the current {@link CollectionHolderOf2 instance}
     * match the given {@link predicate}
     *
     * @param predicate The matching predicate
     * @return {boolean} `true` if the {@link value1} or {@link value2} is applicable to the {@link predicate}
     * @see ReadonlyArray.every
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/all.html Kotlin all(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#allMatch(java.util.function.Predicate) Java Stream.allMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#allMatch(java.util.function.IntPredicate) Java IntStream.allMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#allMatch(java.util.function.LongPredicate) Java LongStream.allMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#allMatch(java.util.function.DoublePredicate) Java DoubleStream.allMatch(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.all C# All(predicate)
     * @typescriptDefinition
     */
    all<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): this is CollectionHolderOf2<S, S>

    /**
     * Check if the {@link value1} in the current {@link CollectionHolderOf2 instance}
     * match the given {@link predicate}
     *
     * @param predicate The matching predicate
     * @return {boolean} `true` if the {@link value1} is applicable to the {@link predicate}
     * @see ReadonlyArray.every
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/all.html Kotlin all(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#allMatch(java.util.function.Predicate) Java Stream.allMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#allMatch(java.util.function.IntPredicate) Java IntStream.allMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#allMatch(java.util.function.LongPredicate) Java LongStream.allMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#allMatch(java.util.function.DoublePredicate) Java DoubleStream.allMatch(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.all C# All(predicate)
     * @typescriptDefinition
     */
    all<const S extends T1, >(predicate: RestrainedBooleanCallback<T1, S>,): this is CollectionHolderOf2<S, T2>

    /**
     * Check if the {@link value2} in the current {@link CollectionHolderOf2 instance}
     * match the given {@link predicate}
     *
     * @param predicate The matching predicate
     * @return {boolean} `true` if the {@link value2} is applicable to the {@link predicate}
     * @see ReadonlyArray.every
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/all.html Kotlin all(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#allMatch(java.util.function.Predicate) Java Stream.allMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#allMatch(java.util.function.IntPredicate) Java IntStream.allMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#allMatch(java.util.function.LongPredicate) Java LongStream.allMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#allMatch(java.util.function.DoublePredicate) Java DoubleStream.allMatch(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.all C# All(predicate)
     * @typescriptDefinition
     */
    all<const S extends T2, >(predicate: RestrainedBooleanCallback<T2, S>,): this is CollectionHolderOf2<T1, S>

    /**
     * Check if the {@link value1}|{@link value2} in the current {@link CollectionHolderOf2 instance}
     * match the given {@link predicate}
     *
     * @param predicate The matching predicate
     * @return {boolean} `true` if the {@link value1} or {@link value2} is applicable to the {@link predicate}
     * @see ReadonlyArray.every
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/all.html Kotlin all(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#allMatch(java.util.function.Predicate) Java Stream.allMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#allMatch(java.util.function.IntPredicate) Java IntStream.allMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#allMatch(java.util.function.LongPredicate) Java LongStream.allMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#allMatch(java.util.function.DoublePredicate) Java DoubleStream.allMatch(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.all C# All(predicate)
     */
    all(predicate: BooleanCallback<| T1 | T2>,): boolean


    /**
     * Check if the {@link value1}|{@link value2} in the current {@link CollectionHolderOf2 instance}
     * match the given {@link predicate}
     *
     * @param predicate The matching predicate
     * @return {boolean} `true` if the {@link value1} or {@link value2} is applicable to the {@link predicate}
     * @see ReadonlyArray.every
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/all.html Kotlin all(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#allMatch(java.util.function.Predicate) Java Stream.allMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#allMatch(java.util.function.IntPredicate) Java IntStream.allMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#allMatch(java.util.function.LongPredicate) Java LongStream.allMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#allMatch(java.util.function.DoublePredicate) Java DoubleStream.allMatch(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.all C# All(predicate)
     * @typescriptDefinition
     * @alias CollectionHolderOf2.all
     */
    every<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): this is CollectionHolderOf2<S, S>

    /**
     * Check if the {@link value1} in the current {@link CollectionHolderOf2 instance}
     * match the given {@link predicate}
     *
     * @param predicate The matching predicate
     * @return {boolean} `true` if the {@link value1} is applicable to the {@link predicate}
     * @see ReadonlyArray.every
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/all.html Kotlin all(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#allMatch(java.util.function.Predicate) Java Stream.allMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#allMatch(java.util.function.IntPredicate) Java IntStream.allMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#allMatch(java.util.function.LongPredicate) Java LongStream.allMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#allMatch(java.util.function.DoublePredicate) Java DoubleStream.allMatch(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.all C# All(predicate)
     * @typescriptDefinition
     * @alias CollectionHolderOf2.all
     */
    every<const S extends T1, >(predicate: RestrainedBooleanCallback<T1, S>,): this is CollectionHolderOf2<S, T2>

    /**
     * Check if the {@link value2} in the current {@link CollectionHolderOf2 instance}
     * match the given {@link predicate}
     *
     * @param predicate The matching predicate
     * @return {boolean} `true` if the {@link value2} is applicable to the {@link predicate}
     * @see ReadonlyArray.every
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/all.html Kotlin all(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#allMatch(java.util.function.Predicate) Java Stream.allMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#allMatch(java.util.function.IntPredicate) Java IntStream.allMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#allMatch(java.util.function.LongPredicate) Java LongStream.allMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#allMatch(java.util.function.DoublePredicate) Java DoubleStream.allMatch(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.all C# All(predicate)
     * @typescriptDefinition
     * @alias CollectionHolderOf2.all
     */
    every<const S extends T2, >(predicate: RestrainedBooleanCallback<T2, S>,): this is CollectionHolderOf2<T1, S>

    /**
     * Check if the {@link value1}|{@link value2} in the current {@link CollectionHolderOf2 instance}
     * match the given {@link predicate}
     *
     * @param predicate The matching predicate
     * @return {boolean} `true` if the {@link value1}|{@link value2} is applicable to the {@link predicate}
     * @see ReadonlyArray.every
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/all.html Kotlin all(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#allMatch(java.util.function.Predicate) Java Stream.allMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#allMatch(java.util.function.IntPredicate) Java IntStream.allMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#allMatch(java.util.function.LongPredicate) Java LongStream.allMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#allMatch(java.util.function.DoublePredicate) Java DoubleStream.allMatch(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.all C# All(predicate)
     * @alias CollectionHolderOf2.all
     */
    every(predicate: BooleanCallback<| T1 | T2>,): boolean

    //#endregion -------------------- All --------------------
    //#region -------------------- Any --------------------

    /**
     * The current {@link CollectionHolderOf2 instance} has a minimum of 1 value (which is `true`)
     *
     * @return {true} {@link CollectionHolderOf2.isNotEmpty}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/any.html Kotlin any()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#findAny() Java Stream.findAny()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#allMatch() Java IntStream.findAny()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#allMatch() Java LongStream.findAny()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#allMatch() Java DoubleStream.findAny()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any C# Any()
     * @alias CollectionHolderOf2.isNotEmpty
     */
    any(): this["isNotEmpty"]

    /**
     * Check if the {@link value1}|{@link value2} in the current {@link CollectionHolderOf2 instance}
     * match the given {@link predicate}
     *
     * @param predicate The condition to check on each value
     * @return {boolean} `true` if the {@link predicate} is `true` on the {@link value1} or {@link value2}
     * @see ReadonlyArray.some
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/any.html Kotlin any(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#anyMatch(java.util.function.Predicate) Java Stream.anyMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#anyMatch(java.util.function.IntPredicate) Java IntStream.anyMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#anyMatch(java.util.function.LongPredicate) Java LongStream.anyMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#anyMatch(java.util.function.DoublePredicate) Java DoubleStream.anyMatch(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any C# Any(predicate)
     */
    any(predicate: Nullable<BooleanCallback<| T1 | T2>>,): boolean


    /**
     * The current {@link CollectionHolderOf2 instance} has a minimum of 1 value (which is `true`)
     *
     * @return {true} {@link CollectionHolderOf2.isNotEmpty}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/any.html Kotlin any()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#findAny() Java Stream.findAny()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#allMatch() Java IntStream.findAny()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#allMatch() Java LongStream.findAny()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#allMatch() Java DoubleStream.findAny()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any C# Any()
     * @alias CollectionHolderOf2.isNotEmpty
     */
    some(): this["isNotEmpty"]

    /**
     * Check if the {@link value1}|{@link value2} in the current {@link CollectionHolderOf2 instance}
     * match the given {@link predicate}
     *
     * @param predicate The condition to check on each value
     * @return {boolean} `true` if the {@link predicate} is `true` on the {@link value1} or {@link value2}
     * @see ReadonlyArray.some
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/any.html Kotlin any(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#anyMatch(java.util.function.Predicate) Java Stream.anyMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#anyMatch(java.util.function.IntPredicate) Java IntStream.anyMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#anyMatch(java.util.function.LongPredicate) Java LongStream.anyMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#anyMatch(java.util.function.DoublePredicate) Java DoubleStream.anyMatch(predicate)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.any C# Any(predicate)
     * @alias CollectionHolderOf2.any
     */
    some(predicate: Nullable<BooleanCallback<| T1 | T2>>,): boolean

    //#endregion -------------------- Any --------------------
    //#region -------------------- None --------------------

    /**
     * The current {@link CollectionHolderOf2 instance} __NEVER__ has no values
     *
     * @return {false} {@link CollectionHolderOf2.isEmpty}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/none.html Kotlin none()
     * @alias CollectionHolderOf2.isEmpty
     */
    none(): this["isEmpty"]

    /**
     * Check if the {@link value1}|{@link value2} in the current {@link CollectionHolderOf2 instance}
     * does not match the given {@link predicate}
     *
     * @param predicate The condition to check on each value
     * @return {boolean} `false` if the {@link predicate} is `true` on the {@link value1} or {@link value2}
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/none.html Kotlin none(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#noneMatch(java.util.function.Predicate) Java Stream.noneMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#noneMatch(java.util.function.IntPredicate) Java IntStream.noneMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#noneMatch(java.util.function.LongPredicate) Java LongStream.noneMatch(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#noneMatch(java.util.function.DoublePredicate) Java DoubleStream.noneMatch(predicate)
     */
    none(predicate: Nullable<BooleanCallback<| T1 | T2>>,): boolean

    //#endregion -------------------- None --------------------

    //#region -------------------- Has null --------------------

    /**
     * The {@link value1}|{@link value2} in the current {@link CollectionHolderOf2 instance} is `null` or `undefined`
     *
     * @return {boolean} `true` only if the {@link value1} or {@link value2} is `null` or `undefined`
     */
    readonly hasNull: boolean

    /**
     * The {@link value1}{@link value2} in the current {@link CollectionHolderOf2 instance} is `null` or `undefined`
     *
     * @return {boolean} `true` only if the {@link value1} or {@link value2} is `null` or `undefined`
     * @alias CollectionHolderOf2.hasNull
     */
    readonly includesNull: this["hasNull"]

    /**
     * The {@link value1}{@link value2} in the current {@link CollectionHolderOf2 instance} is `null` or `undefined`
     *
     * @return {boolean} `true` only if the {@link value1} or {@link value2} is `null` or `undefined`
     * @alias CollectionHolderOf2.hasNull
     */
    readonly containsNull: this["hasNull"]

    //#endregion -------------------- Has null --------------------
    //#region -------------------- Has no nulls --------------------

    /**
     * The {@link value1}|{@link value2} in the current {@link CollectionHolderOf2 instance} is not `null` or `undefined`
     *
     * @return {boolean} `true` only if the {@link value1} or {@link value2} is not `null` or `undefined`
     */
    readonly hasNoNulls: boolean

    /**
     * The {@link value1}|{@link value2} in the current {@link CollectionHolderOf2 instance} is not `null` or `undefined`
     *
     * @return {boolean} `true` only if the {@link value1} or {@link value2} is not `null` or `undefined`
     * @alias CollectionHolderOf2.hasNoNulls
     */
    readonly includesNoNulls: this["hasNoNulls"]

    /**
     * The {@link value1}|{@link value2} in the current {@link CollectionHolderOf2 instance} is not `null` or `undefined`
     *
     * @return {boolean} `true` only if the {@link value1} or {@link value2} is not `null` or `undefined`
     * @alias CollectionHolderOf2.hasNoNulls
     */
    readonly containsNoNulls: this["hasNoNulls"]

    //#endregion -------------------- Has no nulls --------------------
    //#region -------------------- Has duplicate --------------------

    /**
     * The current {@link CollectionHolderOf2 instance} has both {@link value1} and {@link value2} equals
     *
     * @return {boolean} `true` only if {@link value1} is equal (===) to the {@link value2}
     */
    readonly hasDuplicate: boolean

    /**
     * The current {@link CollectionHolderOf2 instance} has both {@link value1} and {@link value2} equals
     *
     * @return {boolean} `true` only if {@link value1} is equal (===) to the {@link value2}
     * @alias CollectionHolderOf2.hasDuplicate
     */
    readonly includesDuplicate: this["hasDuplicate"]

    /**
     * The current {@link CollectionHolderOf2 instance} has both {@link value1} and {@link value2} equals
     *
     * @return {boolean} `true` only if {@link value1} is equal (===) to the {@link value2}
     * @alias CollectionHolderOf2.hasDuplicate
     */
    readonly containsDuplicate: this["hasDuplicate"]

    //#endregion -------------------- Has duplicate --------------------
    //#region -------------------- Has no duplicates --------------------

    /**
     * The current {@link CollectionHolderOf2 instance} has both {@link value1} and {@link value2} __NOT__ equals
     *
     * @return {boolean} `true` only if {@link value1} is not equal (!==) to the {@link value2}
     */
    readonly hasNoDuplicates: boolean

    /**
     * The current {@link CollectionHolderOf2 instance} has both {@link value1} and {@link value2} __NOT__ equals
     *
     * @return {boolean} `true` only if {@link value1} is not equal (!==) to the {@link value2}
     * @alias CollectionHolderOf2.hasNoDuplicates
     */
    readonly includesNoDuplicates: this["hasNoDuplicates"]

    /**
     * The current {@link CollectionHolderOf2 instance} has both {@link value1} and {@link value2} __NOT__ equals
     *
     * @return {boolean} `true` only if {@link value1} is not equal (!==) to the {@link value2}
     * @alias CollectionHolderOf2.hasNoDuplicates
     */
    readonly containsNoDuplicates: this["hasNoDuplicates"]

    //#endregion -------------------- Has no duplicates --------------------

    //#region -------------------- Has --------------------

    /**
     * Tell whenever the {@link value} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param value The value to compare
     * @return {boolean} `true` if the {@link value} is the current {@link CollectionHolderOf2 instance} {@link value1} or {@link value2}
     * @see ReadonlyArray.includes
     * @see ReadonlySet.has
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains.html Kotlin contains(value)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/containsValue.html Kotlin Map.containsValue(value)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Collection.html#contains(java.lang.Object) Java Collection.contains(value)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Map.html#containsValue(java.lang.Object) Java Map.containsValue(value)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.contains C# contains(value)
     */
    has(value: | T1 | T2,): boolean

    /**
     * Tell whenever the {@link value} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param value The value to compare
     * @return {boolean} `true` if the {@link value} is the current {@link CollectionHolderOf2 instance} {@link value1} or {@link value2}
     * @see ReadonlyArray.includes
     * @see ReadonlySet.has
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains.html Kotlin contains(value)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/containsValue.html Kotlin Map.containsValue(value)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Collection.html#contains(java.lang.Object) Java Collection.contains(value)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Map.html#containsValue(java.lang.Object) Java Map.containsValue(value)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.contains C# contains(value)
     * @alias CollectionHolderOf2.has
     */
    includes(value: | T1 | T2,): boolean

    /**
     * Tell whenever the {@link value} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param value The value to compare
     * @return {boolean} `true` if the {@link value} is the current {@link CollectionHolderOf2 instance} {@link value1} or {@link value2}
     * @see ReadonlyArray.includes
     * @see ReadonlySet.has
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains.html Kotlin contains(value)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/containsValue.html Kotlin Map.containsValue(value)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Collection.html#contains(java.lang.Object) Java Collection.contains(value)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Map.html#containsValue(java.lang.Object) Java Map.containsValue(value)
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.contains C# contains(value)
     * @alias CollectionHolderOf2.has
     */
    contains(value: | T1 | T2,): boolean

    //#endregion -------------------- Has --------------------
    //#region -------------------- Has not --------------------

    /**
     * Tell whenever the {@link value} is __NOT__ the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param value The value to compare
     * @return {boolean} `true` if the {@link value} is __NOT__ the current {@link CollectionHolderOf2 instance} {@link value1} or {@link value2}
     */
    hasNot(value: | T1 | T2,): boolean

    /**
     * Tell whenever the {@link value} is __NOT__ the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param value The value to compare
     * @return {boolean} `true` if the {@link value} is __NOT__ the current {@link CollectionHolderOf2 instance} {@link value1} or {@link value2}
     * @alias CollectionHolderOf2.hasNot
     */
    includesNot(value: | T1 | T2,): boolean

    /**
     * Tell whenever the {@link value} is __NOT__ the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param value The value to compare
     * @return {boolean} `true` if the {@link value} is __NOT__ the current {@link CollectionHolderOf2 instance} {@link value1} or {@link value2}
     * @alias CollectionHolderOf2.hasNot
     */
    containsNot(value: | T1 | T2,): boolean

    //#endregion -------------------- Has not --------------------
    //#region -------------------- Has one --------------------

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     */
    hasOne(values: Nullable<Array<| T1 | T2>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     */
    hasOne(values: Nullable<Set<| T1 | T2>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     */
    hasOne(values: Nullable<CollectionHolder<| T1 | T2>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     */
    hasOne(values: Nullable<MinimalistCollectionHolder<| T1 | T2>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     */
    hasOne(values: Nullable<CollectionIterator<| T1 | T2>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @typescriptDefinition
     */
    hasOne(values: Nullable<IteratorObject<| T1 | T2, unknown, unknown>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     */
    hasOne(values: Nullable<Iterator<| T1 | T2, unknown, unknown>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     */
    hasOne(values: Nullable<Iterable<| T1 | T2, unknown, unknown>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @typescriptDefinition
     */
    hasOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<| T1 | T2>>,): boolean

    //#region -------------------- Has one methods (aliases) --------------------

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasOne
     */
    includesOne(values: Nullable<Array<| T1 | T2>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasOne
     */
    includesOne(values: Nullable<Set<| T1 | T2>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasOne
     */
    includesOne(values: Nullable<CollectionHolder<| T1 | T2>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasOne
     */
    includesOne(values: Nullable<MinimalistCollectionHolder<| T1 | T2>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasOne
     */
    includesOne(values: Nullable<CollectionIterator<| T1 | T2>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @typescriptDefinition
     * @alias CollectionHolderOf2.hasOne
     */
    includesOne(values: Nullable<IteratorObject<| T1 | T2, unknown, unknown>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasOne
     */
    includesOne(values: Nullable<Iterator<| T1 | T2, unknown, unknown>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasOne
     */
    includesOne(values: Nullable<Iterable<| T1 | T2, unknown, unknown>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @typescriptDefinition
     * @alias CollectionHolderOf2.hasOne
     */
    includesOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<| T1 | T2>>,): boolean


    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasOne
     */
    containsOne(values: Nullable<Array<| T1 | T2>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasOne
     */
    containsOne(values: Nullable<Set<| T1 | T2>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasOne
     */
    containsOne(values: Nullable<CollectionHolder<| T1 | T2>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasOne
     */
    containsOne(values: Nullable<MinimalistCollectionHolder<| T1 | T2>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasOne
     */
    containsOne(values: Nullable<CollectionIterator<| T1 | T2>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @typescriptDefinition
     * @alias CollectionHolderOf2.hasOne
     */
    containsOne(values: Nullable<IteratorObject<| T1 | T2, unknown, unknown>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasOne
     */
    containsOne(values: Nullable<Iterator<| T1 | T2, unknown, unknown>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasOne
     */
    containsOne(values: Nullable<Iterable<| T1 | T2, unknown, unknown>>,): boolean

    /**
     * Tell that one of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @typescriptDefinition
     * @alias CollectionHolderOf2.hasOne
     */
    containsOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<| T1 | T2>>,): boolean

    //#endregion -------------------- Has one methods (aliases) --------------------

    //#endregion -------------------- Has one --------------------
    //#region -------------------- Has not one --------------------

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     */
    hasNotOne(values: Nullable<Array<| T1 | T2>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     */
    hasNotOne(values: Nullable<Set<| T1 | T2>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     */
    hasNotOne(values: Nullable<CollectionHolder<| T1 | T2>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     */
    hasNotOne(values: Nullable<MinimalistCollectionHolder<| T1 | T2>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     */
    hasNotOne(values: Nullable<CollectionIterator<| T1 | T2>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @typescriptDefinition
     */
    hasNotOne(values: Nullable<IteratorObject<| T1 | T2, unknown, unknown>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     */
    hasNotOne(values: Nullable<Iterator<| T1 | T2, unknown, unknown>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     */
    hasNotOne(values: Nullable<Iterable<| T1 | T2, unknown, unknown>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @typescriptDefinition
     */
    hasNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<| T1 | T2>>,): boolean

    //#region -------------------- Has not one methods (aliases) --------------------

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasNotOne
     */
    includesNotOne(values: Nullable<Array<| T1 | T2>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasNotOne
     */
    includesNotOne(values: Nullable<Set<| T1 | T2>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasNotOne
     */
    includesNotOne(values: Nullable<CollectionHolder<| T1 | T2>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasNotOne
     */
    includesNotOne(values: Nullable<MinimalistCollectionHolder<| T1 | T2>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasNotOne
     */
    includesNotOne(values: Nullable<CollectionIterator<| T1 | T2>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @typescriptDefinition
     * @alias CollectionHolderOf2.hasNotOne
     */
    includesNotOne(values: Nullable<IteratorObject<| T1 | T2, unknown, unknown>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasNotOne
     */
    includesNotOne(values: Nullable<Iterator<| T1 | T2, unknown, unknown>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasNotOne
     */
    includesNotOne(values: Nullable<Iterable<| T1 | T2, unknown, unknown>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @typescriptDefinition
     * @alias CollectionHolderOf2.hasNotOne
     */
    includesNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<| T1 | T2>>,): boolean


    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasNotOne
     */
    containsNotOne(values: Nullable<Array<| T1 | T2>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasNotOne
     */
    containsNotOne(values: Nullable<Set<| T1 | T2>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasNotOne
     */
    containsNotOne(values: Nullable<CollectionHolder<| T1 | T2>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasNotOne
     */
    containsNotOne(values: Nullable<MinimalistCollectionHolder<| T1 | T2>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasNotOne
     */
    containsNotOne(values: Nullable<CollectionIterator<| T1 | T2>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @typescriptDefinition
     * @alias CollectionHolderOf2.hasNotOne
     */
    containsNotOne(values: Nullable<IteratorObject<| T1 | T2, unknown, unknown>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasNotOne
     */
    containsNotOne(values: Nullable<Iterator<| T1 | T2, unknown, unknown>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasNotOne
     */
    containsNotOne(values: Nullable<Iterable<| T1 | T2, unknown, unknown>>,): boolean

    /**
     * Tell that none of the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @typescriptDefinition
     * @alias CollectionHolderOf2.hasNotOne
     */
    containsNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<| T1 | T2>>,): boolean

    //#endregion -------------------- Has not one methods (aliases) --------------------

    //#endregion -------------------- Has not one --------------------
    //#region -------------------- Has all --------------------

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
     */
    hasAll(values: Nullable<Array<| T1 | T2>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
     */
    hasAll(values: Nullable<Set<| T1 | T2>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
     */
    hasAll(values: Nullable<CollectionHolder<| T1 | T2>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
     */
    hasAll(values: Nullable<MinimalistCollectionHolder<| T1 | T2>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
     */
    hasAll(values: Nullable<CollectionIterator<| T1 | T2>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
     * @typescriptDefinition
     */
    hasAll(values: Nullable<IteratorObject<| T1 | T2, unknown, unknown>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
     */
    hasAll(values: Nullable<Iterator<| T1 | T2, unknown, unknown>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
     */
    hasAll(values: Nullable<Iterable<| T1 | T2, unknown, unknown>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/contains-all.html Kotlin containsAll(values)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Collection.html#containsAll(java.util.Collection) Java containsAll(values)
     * @typescriptDefinition
     */
    hasAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<| T1 | T2>>,): boolean

    //#region -------------------- Has all methods (aliases) --------------------

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasAll
     */
    includesAll(values: Nullable<Array<| T1 | T2>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasAll
     */
    includesAll(values: Nullable<Set<| T1 | T2>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasAll
     */
    includesAll(values: Nullable<CollectionHolder<| T1 | T2>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasAll
     */
    includesAll(values: Nullable<MinimalistCollectionHolder<| T1 | T2>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasAll
     */
    includesAll(values: Nullable<CollectionIterator<| T1 | T2>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @typescriptDefinition
     * @alias CollectionHolderOf2.hasAll
     */
    includesAll(values: Nullable<IteratorObject<| T1 | T2, unknown, unknown>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasAll
     */
    includesAll(values: Nullable<Iterator<| T1 | T2, unknown, unknown>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasAll
     */
    includesAll(values: Nullable<Iterable<| T1 | T2, unknown, unknown>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @typescriptDefinition
     * @alias CollectionHolderOf2.hasAll
     */
    includesAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<| T1 | T2>>,): boolean


    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasAll
     */
    containsAll(values: Nullable<Array<| T1 | T2>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasAll
     */
    containsAll(values: Nullable<Set<| T1 | T2>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasAll
     */
    containsAll(values: Nullable<CollectionHolder<| T1 | T2>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasAll
     */
    containsAll(values: Nullable<MinimalistCollectionHolder<| T1 | T2>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasAll
     */
    containsAll(values: Nullable<CollectionIterator<| T1 | T2>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @typescriptDefinition
     * @alias CollectionHolderOf2.hasAll
     */
    containsAll(values: Nullable<IteratorObject<| T1 | T2, unknown, unknown>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasAll
     */
    containsAll(values: Nullable<Iterator<| T1 | T2, unknown, unknown>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasAll
     */
    containsAll(values: Nullable<Iterable<| T1 | T2, unknown, unknown>>,): boolean

    /**
     * Tell that all the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @typescriptDefinition
     * @alias CollectionHolderOf2.hasAll
     */
    containsAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<| T1 | T2>>,): boolean

    //#endregion -------------------- Has all methods (aliases) --------------------

    //#endregion -------------------- Has all --------------------
    //#region -------------------- Has not all --------------------

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     */
    hasNotAll(values: Nullable<Array<| T1 | T2>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     */
    hasNotAll(values: Nullable<Set<| T1 | T2>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     */
    hasNotAll(values: Nullable<CollectionHolder<| T1 | T2>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     */
    hasNotAll(values: Nullable<MinimalistCollectionHolder<| T1 | T2>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     */
    hasNotAll(values: Nullable<CollectionIterator<| T1 | T2>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @typescriptDefinition
     */
    hasNotAll(values: Nullable<IteratorObject<| T1 | T2, unknown, unknown>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     */
    hasNotAll(values: Nullable<Iterator<| T1 | T2, unknown, unknown>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     */
    hasNotAll(values: Nullable<Iterable<| T1 | T2, unknown, unknown>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @typescriptDefinition
     */
    hasNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<| T1 | T2>>,): boolean

    //#region -------------------- Has not all methods (aliases) --------------------

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasNotAll
     */
    includesNotAll(values: Nullable<Array<| T1 | T2>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasNotAll
     */
    includesNotAll(values: Nullable<Set<| T1 | T2>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasNotAll
     */
    includesNotAll(values: Nullable<CollectionHolder<| T1 | T2>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasNotAll
     */
    includesNotAll(values: Nullable<MinimalistCollectionHolder<| T1 | T2>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasNotAll
     */
    includesNotAll(values: Nullable<CollectionIterator<| T1 | T2>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @typescriptDefinition
     * @alias CollectionHolderOf2.hasNotAll
     */
    includesNotAll(values: Nullable<IteratorObject<| T1 | T2, unknown, unknown>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasNotAll
     */
    includesNotAll(values: Nullable<Iterator<| T1 | T2, unknown, unknown>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasNotAll
     */
    includesNotAll(values: Nullable<Iterable<| T1 | T2, unknown, unknown>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @typescriptDefinition
     * @alias CollectionHolderOf2.hasNotAll
     */
    includesNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<| T1 | T2>>,): boolean


    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasNotAll
     */
    containsNotAll(values: Nullable<Array<| T1 | T2>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasNotAll
     */
    containsNotAll(values: Nullable<Set<| T1 | T2>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasNotAll
     */
    containsNotAll(values: Nullable<CollectionHolder<| T1 | T2>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasNotAll
     */
    containsNotAll(values: Nullable<MinimalistCollectionHolder<| T1 | T2>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasNotAll
     */
    containsNotAll(values: Nullable<CollectionIterator<| T1 | T2>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @typescriptDefinition
     * @alias CollectionHolderOf2.hasNotAll
     */
    containsNotAll(values: Nullable<IteratorObject<| T1 | T2, unknown, unknown>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasNotAll
     */
    containsNotAll(values: Nullable<Iterator<| T1 | T2, unknown, unknown>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @alias CollectionHolderOf2.hasNotAll
     */
    containsNotAll(values: Nullable<Iterable<| T1 | T2, unknown, unknown>>,): boolean

    /**
     * Tell that nothing in the {@link values} is the current {@link CollectionHolderOf2 instance} {@link value1}|{@link value2}
     *
     * @param values The values to compare
     * @typescriptDefinition
     * @alias CollectionHolderOf2.hasNotAll
     */
    containsNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<| T1 | T2>>,): boolean

    //#endregion -------------------- Has not all methods (aliases) --------------------

    //#endregion -------------------- Has not all --------------------

    //#region -------------------- Require no nulls --------------------

    /**
     * Require that the {@link value1}&{@link value2} is not `null` or `undefined` in the current {@link CollectionHolderOf2 instance}
     *
     * @throws TypeError The {@link value1} or {@link value2} is `null` or `undefined`
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/require-no-nulls.html Kotlin requireNoNulls()
     * @see CollectionHolderOf2.filterNotNull
     * @return {this} The current {@link CollectionHolderOf2 instance}
     */
    requireNoNulls(): CollectionHolderOf2<NonNullable<T1>, NonNullable<T2>>

    //#endregion -------------------- Require no nulls --------------------

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    /**
     * Get a new {@link CollectionHolder} (of 0|1|2)
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
    filter<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} (of 0|1|2)
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
    filter(predicate: BooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Filter indexed --------------------

    /**
     * Get a new {@link CollectionHolder} (of 0|1|2)
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
    filterIndexed<const S extends | T1 | T2, >(predicate: ReverseRestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} (of 0|1|2)
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
    filterIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>

    //#endregion -------------------- Filter indexed --------------------

    //#region -------------------- Filter not --------------------

    /**
     * Get a new {@link CollectionHolder} (of 0|1|2)
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
    filterNot<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<Exclude<| T1 | T2, S>>

    /**
     * Get a new {@link CollectionHolder} (of 0|1|2)
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
    filterNot(predicate: BooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>

    //#endregion -------------------- Filter not --------------------
    //#region -------------------- Filter not indexed --------------------

    /**
     * Get a new {@link CollectionHolder} (of 0|1|2)
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
    filterNotIndexed<const S extends | T1 | T2, >(predicate: ReverseRestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<Exclude<| T1 | T2, S>>

    /**
     * Get a new {@link CollectionHolder} (of 0|1|2)
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
    filterNotIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>

    //#endregion -------------------- Filter not indexed --------------------

    //#region -------------------- Filter not null --------------------

    /**
     * Get either a {@link EmptyCollectionHolder}, a {@link CollectionHolderOf1} with {@link value1}|{@link value2} or the current {@link CollectionHolderOf2 instance} that is without `null` and `undefined`
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/filter-not-null.html Kotlin filterNotNull()
     */
    filterNotNull(): CollectionHolderOfAny0Or1Or2<NonNullable<T1>, NonNullable<T2>>

    //#endregion -------------------- Filter not null --------------------

    //#region -------------------- Slice --------------------

    //#region -------------------- Slice (from, to) --------------------

    /**
     * Get the current {@link CollectionHolderOf2 instance}
     *
     * @see ReadonlyArray.slice
     * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
     */
    slice(): CollectionHolderOf2<T1, T2>

    /**
     * Get the current {@link CollectionHolderOf2 instance}
     *
     * @param from The inclusive starting index (`0` by default)
     * @throws IndexOutOfBoundsException {@link from} is not `0`, `1`, `-1` or `-2`
     * @throws ForbiddenIndexException   {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.slice
     * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
     */
    slice(from: NullableNumber,): CollectionHolderOf1Or2<T1, T2>

    /**
     * Get the current {@link CollectionHolderOf2 instance}
     *
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`1` by default)
     * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not `0`, `1`, `-1` or `-2`
     * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @throws InvalidIndexRangeException {@link to} is before the {@link from} after the calculation
     * @see ReadonlyArray.slice
     * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
     */
    slice(from: NullableNumber, to: NullableNumber,): CollectionHolderOf1Or2<T1, T2>

    //#endregion -------------------- Slice (from, to) --------------------
    //#region -------------------- Slice (indice) --------------------

    /**
     * Create a new {@link CollectionHolder} from the {@link indices} of the {@link value}
     *
     * @param indices The given indices
     * @throws IndexOutOfBoundsException An indice is not `0`, `1`, `-1` or `-2`
     * @throws ForbiddenIndexException   An indice a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
     */
    slice(indices: NumberArray,): CollectionHolder<| T1 | T2>

    /**
     * Create a new {@link CollectionHolder} from the {@link indices} of the {@link value}
     *
     * @param indices The given indices
     * @throws IndexOutOfBoundsException An indice is not `0`, `1`, `-1` or `-2`
     * @throws ForbiddenIndexException   An indice a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     */
    slice(indices: NumberSet,): CollectionHolder<| T1 | T2>

    /**
     * Create a new {@link CollectionHolder} from the {@link indices} of the {@link value}
     *
     * @param indices The given indices
     * @throws IndexOutOfBoundsException An indice is not `0`, `1`, `-1` or `-2`
     * @throws ForbiddenIndexException   An indice a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     */
    slice(indices: CollectionHolder<number>,): CollectionHolder<| T1 | T2>

    /**
     * Create a new {@link CollectionHolder} from the {@link indices} of the {@link value}
     *
     * @param indices The given indices
     * @throws IndexOutOfBoundsException An indice is not `0`, `1`, `-1` or `-2`
     * @throws ForbiddenIndexException   An indice a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     */
    slice(indices: MinimalistCollectionHolder<number>,): CollectionHolder<| T1 | T2>

    /**
     * Create a new {@link CollectionHolder} from the {@link indices} of the {@link value}
     *
     * @param indices The given indices
     * @throws IndexOutOfBoundsException An indice is not `0`, `1`, `-1` or `-2`
     * @throws ForbiddenIndexException   An indice a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     */
    slice(indices: CollectionIterator<number>,): CollectionHolder<| T1 | T2>

    /**
     * Create a new {@link CollectionHolder} from the {@link indices} of the {@link value}
     *
     * @param indices The given indices
     * @throws IndexOutOfBoundsException An indice is not `0`, `1`, `-1` or `-2`
     * @throws ForbiddenIndexException   An indice a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     * @typescriptDefinition
     */
    slice(indices: IteratorObject<number, unknown, unknown>,): CollectionHolder<| T1 | T2>

    /**
     * Create a new {@link CollectionHolder} from the {@link indices} of the {@link value}
     *
     * @param indices The given indices
     * @throws IndexOutOfBoundsException An indice is not `0`, `1`, `-1` or `-2`
     * @throws ForbiddenIndexException   An indice a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     */
    slice(indices: Iterator<number, unknown, unknown>,): CollectionHolder<| T1 | T2>

    /**
     * Create a new {@link CollectionHolder} from the {@link indices} of the {@link value}
     *
     * @param indices The given indices
     * @throws IndexOutOfBoundsException An indice is not `0`, `1`, `-1` or `-2`
     * @throws ForbiddenIndexException   An indice a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     */
    slice(indices: Iterable<number, unknown, unknown>,): CollectionHolder<| T1 | T2>

    /**
     * Create a new {@link CollectionHolder} from the {@link indices} of the {@link value}
     *
     * @param indices The given indices
     * @throws IndexOutOfBoundsException An indice is not `0`, `1`, `-1` or `-2`
     * @throws ForbiddenIndexException   An indice a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     * @typescriptDefinition
     */
    slice(indices: PossibleIterableIteratorArraySetOrCollectionHolder<number>,): CollectionHolder<| T1 | T2>

    //#endregion -------------------- Slice (indice) --------------------

    /**
     * Create a new {@link CollectionHolder} from the {@link indicesOrFrom indices} of the {@link value}
     * or the current {@link CollectionHolderOf2 instance}
     *
     * @param indicesOrFrom The given indices (or inclusive starting index)
     * @param to            The inclusive ending index
     * @throws IndexOutOfBoundsException {@link indicesOrFrom from} or {@link to} are not `0`, `1`, `-1` or `-2`
     * @throws IndexOutOfBoundsException An indice is not `0`, `1`, `-1` or `-2`
     * @throws ForbiddenIndexException   {@link indicesOrFrom from} or {@link to} are a forbidden {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see ReadonlyArray.slice
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/slice.html Kotlin slice(indices)
     * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(from, to)
     * @typescriptDefinition
     */
    slice(indicesOrFrom?: Nullable<| PossibleIterableIteratorArraySetOrCollectionHolder<number> | number>, to?: NullableNumber,): CollectionHolder<| T1 | T2>

    //#endregion -------------------- Slice --------------------

    //#region -------------------- Take --------------------

    /**
     * Get the current {@link CollectionHolderOf2 instance} if `2` or over,
     * get a new {@link CollectionHolderOf1} with the {@link value1} if `1`|`-1`,
     * or an {@link EmptyCollectionHolder} otherwise
     *
     * @param n The number of arguments (if negative, then it is plus `2`)
     * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take.html Kotlin take(n)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#limit(long) Java Stream.limit(n)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#limit(long) Java IntStream.limit(n)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#limit(long) Java LongStream.limit(n)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#limit(long) Java DoubleStream.limit(n)
     * @canReceiveNegativeValue
     */
    take(n: number,): CollectionHolderOf0Or1Or2<T1, T2>

    /**
     * Get the current {@link CollectionHolderOf2 instance} if `2` or over,
     * get a new {@link CollectionHolderOf1} with the {@link value1} if `1`|`-1`,
     * or an {@link EmptyCollectionHolder} otherwise
     *
     * @param n The number of arguments (if negative, then it is plus `2`)
     * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take.html Kotlin take(n)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#limit(long) Java Stream.limit(n)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#limit(long) Java IntStream.limit(n)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#limit(long) Java LongStream.limit(n)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#limit(long) Java DoubleStream.limit(n)
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf2.take
     */
    limit(n: number,): CollectionHolderOf0Or1Or2<T1, T2>

    //#endregion -------------------- Take --------------------
    //#region -------------------- Take while --------------------

    /**
     * Get a new {@link CollectionHolder} (of `2`) if satisfying the given {@link predicate} twice,
     * get a new {@link CollectionHolder} (of `1`) with the {@link value1} if satisfying the given {@link predicate} once,
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
    takeWhile<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} (of `2`) if satisfying the given {@link predicate} twice,
     * get a new {@link CollectionHolder} (of `1`) with the {@link value1} if satisfying the given {@link predicate} once,
     * and a new {@link CollectionHolder} (of `0`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-while.html Kotlin takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#takeWhile(java.util.function.Predicate) Java Stream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#takeWhile(java.util.function.IntPredicate) Java IntStream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#takeWhile(java.util.function.LongPredicate) Java LongStream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#takeWhile(java.util.function.DoublePredicate) Java DoubleStream.takeWhile(predicate)
     */
    takeWhile(predicate: BooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>


    /**
     * Get a new {@link CollectionHolder} (of `2`) if satisfying the given {@link predicate} twice,
     * get a new {@link CollectionHolder} (of `1`) with the {@link value1} if satisfying the given {@link predicate} once,
     * and a new {@link CollectionHolder} (of `0`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-while.html Kotlin takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#takeWhile(java.util.function.Predicate) Java Stream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#takeWhile(java.util.function.IntPredicate) Java IntStream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#takeWhile(java.util.function.LongPredicate) Java LongStream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#takeWhile(java.util.function.DoublePredicate) Java DoubleStream.takeWhile(predicate)
     * @typescriptDefinition
     * @alias CollectionHolderOf2.takeWhile
     */
    limitWhile<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} (of `2`) if satisfying the given {@link predicate} twice,
     * get a new {@link CollectionHolder} (of `1`) with the {@link value1} if satisfying the given {@link predicate} once,
     * and a new {@link CollectionHolder} (of `0`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-while.html Kotlin takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#takeWhile(java.util.function.Predicate) Java Stream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#takeWhile(java.util.function.IntPredicate) Java IntStream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#takeWhile(java.util.function.LongPredicate) Java LongStream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#takeWhile(java.util.function.DoublePredicate) Java DoubleStream.takeWhile(predicate)
     * @alias CollectionHolderOf2.takeWhile
     */
    limitWhile(predicate: BooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>

    //#endregion -------------------- Take while --------------------
    //#region -------------------- Take while indexed --------------------

    /**
     * Get a new {@link CollectionHolder} (of `2`) if satisfying the given {@link predicate} twice,
     * get a new {@link CollectionHolder} (of `1`) with the {@link value1} if satisfying the given {@link predicate} once,
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
    takeWhileIndexed<const S extends | T1 | T2, >(predicate: ReverseRestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} (of `2`) if satisfying the given {@link predicate} twice,
     * get a new {@link CollectionHolder} (of `1`) with the {@link value1} if satisfying the given {@link predicate} once,
     * and a new {@link CollectionHolder} (of `0`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-while.html Kotlin takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#takeWhile(java.util.function.Predicate) Java Stream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#takeWhile(java.util.function.IntPredicate) Java IntStream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#takeWhile(java.util.function.LongPredicate) Java LongStream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#takeWhile(java.util.function.DoublePredicate) Java DoubleStream.takeWhile(predicate)
     */
    takeWhileIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>


    /**
     * Get a new {@link CollectionHolder} (of `2`) if satisfying the given {@link predicate} twice,
     * get a new {@link CollectionHolder} (of `1`) with the {@link value1} if satisfying the given {@link predicate} once,
     * and a new {@link CollectionHolder} (of `0`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-while.html Kotlin takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#takeWhile(java.util.function.Predicate) Java Stream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#takeWhile(java.util.function.IntPredicate) Java IntStream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#takeWhile(java.util.function.LongPredicate) Java LongStream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#takeWhile(java.util.function.DoublePredicate) Java DoubleStream.takeWhile(predicate)
     * @typescriptDefinition
     * @alias CollectionHolderOf2.takeWhileIndexed
     */
    limitWhileIndexed<const S extends | T1 | T2, >(predicate: ReverseRestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} (of `2`) if satisfying the given {@link predicate} twice,
     * get a new {@link CollectionHolder} (of `1`) with the {@link value1} if satisfying the given {@link predicate} once,
     * and a new {@link CollectionHolder} (of `0`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-while.html Kotlin takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#takeWhile(java.util.function.Predicate) Java Stream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#takeWhile(java.util.function.IntPredicate) Java IntStream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#takeWhile(java.util.function.LongPredicate) Java LongStream.takeWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#takeWhile(java.util.function.DoublePredicate) Java DoubleStream.takeWhile(predicate)
     * @alias CollectionHolderOf2.takeWhileIndexed
     */
    limitWhileIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>

    //#endregion -------------------- Take while indexed --------------------

    //#region -------------------- Take last --------------------

    /**
     * Get the current {@link CollectionHolderOf2 instance} if `2` or over,
     * get a new {@link CollectionHolderOf1} with the {@link value2} if `1`|`-1`
     * or an {@link EmptyCollectionHolder} otherwise
     *
     * @param n The number of arguments (if negative, then it is plus `2`)
     * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last.html Kotlin takeLast(n)
     * @canReceiveNegativeValue
     */
    takeLast(n: number,): CollectionHolderOfLast0Or1Or2<T1, T2>

    /**
     * Get the current {@link CollectionHolderOf2 instance} if `2` or over,
     * get a new {@link CollectionHolderOf1} with the {@link value2} if `1`|`-1`,
     * or an {@link EmptyCollectionHolder} otherwise
     *
     * @param n The number of arguments (if negative, then it is plus `2`)
     * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last.html Kotlin takeLast(n)
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf2.takeLast
     */
    limitLast(n: number,): CollectionHolderOfLast0Or1Or2<T1, T2>

    //#endregion -------------------- Take last --------------------
    //#region -------------------- Take last while --------------------

    /**
     * Get a new {@link CollectionHolder} (of `2`) if satisfying the given {@link predicate} twice,
     * Get a new {@link CollectionHolder} (of `1`) with the {@link value2} if satisfying the given {@link predicate} once,
     * and a new {@link CollectionHolder} (of `0`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html Kotlin takeLastWhile(predicate)
     * @typescriptDefinition
     */
    takeLastWhile<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} (of `2`) if satisfying the given {@link predicate} twice,
     * Get a new {@link CollectionHolder} (of `1`) with the {@link value2} if satisfying the given {@link predicate} once,
     * and a new {@link CollectionHolder} (of `0`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html Kotlin takeLastWhile(predicate)
     */
    takeLastWhile(predicate: BooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>


    /**
     * Get a new {@link CollectionHolder} (of `2`) if satisfying the given {@link predicate} twice,
     * Get a new {@link CollectionHolder} (of `1`) with the {@link value2} if satisfying the given {@link predicate} once,
     * and a new {@link CollectionHolder} (of `0`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html Kotlin takeLastWhile(predicate)
     * @typescriptDefinition
     * @alias CollectionHolderOf2.takeLastWhile
     */
    limitLastWhile<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} (of `2`) if satisfying the given {@link predicate} twice,
     * Get a new {@link CollectionHolder} (of `1`) with the {@link value2} if satisfying the given {@link predicate} once,
     * and a new {@link CollectionHolder} (of `0`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html Kotlin takeLastWhile(predicate)
     * @alias CollectionHolderOf2.takeLastWhile
     */
    limitLastWhile(predicate: BooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>

    //#endregion -------------------- Take last while --------------------
    //#region -------------------- Take last while indexed --------------------

    /**
     * Get a new {@link CollectionHolder} (of `2`) if satisfying the given {@link predicate} twice,
     * Get a new {@link CollectionHolder} (of `1`) with the {@link value2} if satisfying the given {@link predicate} once,
     * and a new {@link CollectionHolder} (of `0`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html Kotlin takeLastWhile(predicate)
     * @typescriptDefinition
     */
    takeLastWhileIndexed<const S extends | T1 | T2, >(predicate: ReverseRestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} (of `2`) if satisfying the given {@link predicate} twice,
     * Get a new {@link CollectionHolder} (of `1`) with the {@link value2} if satisfying the given {@link predicate} once,
     * and a new {@link CollectionHolder} (of `0`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html Kotlin takeLastWhile(predicate)
     */
    takeLastWhileIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>


    /**
     * Get a new {@link CollectionHolder} (of `2`) if satisfying the given {@link predicate} twice,
     * Get a new {@link CollectionHolder} (of `1`) with the {@link value2} if satisfying the given {@link predicate} once,
     * and a new {@link CollectionHolder} (of `0`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html Kotlin takeLastWhile(predicate)
     * @typescriptDefinition
     * @alias CollectionHolderOf2.takeLastWhileIndexed
     */
    limitLastWhileIndexed<const S extends | T1 | T2, >(predicate: ReverseRestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} (of `2`) if satisfying the given {@link predicate} twice,
     * Get a new {@link CollectionHolder} (of `1`) with the {@link value2} if satisfying the given {@link predicate} once,
     * and a new {@link CollectionHolder} (of `0`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/take-last-while.html Kotlin takeLastWhile(predicate)
     * @alias CollectionHolderOf2.takeLastWhileIndexed
     */
    limitLastWhileIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>

    //#endregion -------------------- Take last while indexed --------------------

    //#region -------------------- Drop --------------------

    /**
     * Get an {@link EmptyCollectionHolder} if `2` or over,
     * get a new {@link CollectionHolderOf1} with the {@link value2} if `1`|`-1`,
     * or the current {@link CollectionHolderOf2 instance} otherwise
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
    drop(n: number,): CollectionHolderOfLast0Or1Or2<T1, T2>

    /**
     * Get an {@link EmptyCollectionHolder} if `2` or over,
     * get a new {@link CollectionHolderOf1} with the {@link value2} if `1`|`-1`,
     * or the current {@link CollectionHolderOf2 instance} otherwise
     *
     * @param n The number of arguments (if negative, then it is plus `1`)
     * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop.html Kotlin drop(n)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#skip(long) Java Stream.skip(n)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#skip(long) Java IntStream.skip(n)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#skip(long) Java LongStream.skip(n)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#skip(long) Java DoubleStream.skip(n)
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf2.drop
     */
    skip(n: number,): CollectionHolderOfLast0Or1Or2<T1, T2>

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Drop while --------------------

    /**
     * Get a new {@link CollectionHolder} (of `0`) if satisfying the given {@link predicate} twice,
     * get a new {@link CollectionHolder} (of `1`) with the {@link value2} if satisfying the given {@link predicate} once,
     * and a new {@link CollectionHolder} (of `2`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html Kotlin dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#dropWhile(java.util.function.Predicate) Java Stream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#dropWhile(java.util.function.IntPredicate) Java IntStream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#dropWhile(java.util.function.LongPredicate) Java LongStream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#dropWhile(java.util.function.DoublePredicate) Java DoubleStream.dropWhile(predicate)
     * @typescriptDefinition
     */
    dropWhile<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} (of `0`) if satisfying the given {@link predicate} twice,
     * get a new {@link CollectionHolder} (of `1`) with the {@link value2} if satisfying the given {@link predicate} once,
     * and a new {@link CollectionHolder} (of `2`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html Kotlin dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#dropWhile(java.util.function.Predicate) Java Stream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#dropWhile(java.util.function.IntPredicate) Java IntStream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#dropWhile(java.util.function.LongPredicate) Java LongStream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#dropWhile(java.util.function.DoublePredicate) Java DoubleStream.dropWhile(predicate)
     */
    dropWhile(predicate: BooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>


    /**
     * Get a new {@link CollectionHolder} (of `0`) if satisfying the given {@link predicate} twice,
     * get a new {@link CollectionHolder} (of `1`) with the {@link value2} if satisfying the given {@link predicate} once,
     * and a new {@link CollectionHolder} (of `2`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html Kotlin dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#dropWhile(java.util.function.Predicate) Java Stream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#dropWhile(java.util.function.IntPredicate) Java IntStream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#dropWhile(java.util.function.LongPredicate) Java LongStream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#dropWhile(java.util.function.DoublePredicate) Java DoubleStream.dropWhile(predicate)
     * @typescriptDefinition
     * @alias CollectionHolderOf2.dropWhile
     */
    skipWhile<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} (of `0`) if satisfying the given {@link predicate} twice,
     * get a new {@link CollectionHolder} (of `1`) with the {@link value2} if satisfying the given {@link predicate} once,
     * and a new {@link CollectionHolder} (of `2`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html Kotlin dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#dropWhile(java.util.function.Predicate) Java Stream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#dropWhile(java.util.function.IntPredicate) Java IntStream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#dropWhile(java.util.function.LongPredicate) Java LongStream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#dropWhile(java.util.function.DoublePredicate) Java DoubleStream.dropWhile(predicate)
     * @alias CollectionHolderOf2.dropWhile
     */
    skipWhile(predicate: BooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>

    //#endregion -------------------- Drop while --------------------
    //#region -------------------- Drop while indexed --------------------

    /**
     * Get a new {@link CollectionHolder} (of `0`) if satisfying the given {@link predicate} twice,
     * get a new {@link CollectionHolder} (of `1`) with the {@link value2} if satisfying the given {@link predicate} once,
     * and a new {@link CollectionHolder} (of `2`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html Kotlin dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#dropWhile(java.util.function.Predicate) Java Stream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#dropWhile(java.util.function.IntPredicate) Java IntStream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#dropWhile(java.util.function.LongPredicate) Java LongStream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#dropWhile(java.util.function.DoublePredicate) Java DoubleStream.dropWhile(predicate)
     * @typescriptDefinition
     */
    dropWhileIndexed<const S extends | T1 | T2, >(predicate: ReverseRestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} (of `0`) if satisfying the given {@link predicate} twice,
     * get a new {@link CollectionHolder} (of `1`) with the {@link value2} if satisfying the given {@link predicate} once,
     * and a new {@link CollectionHolder} (of `2`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html Kotlin dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#dropWhile(java.util.function.Predicate) Java Stream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#dropWhile(java.util.function.IntPredicate) Java IntStream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#dropWhile(java.util.function.LongPredicate) Java LongStream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#dropWhile(java.util.function.DoublePredicate) Java DoubleStream.dropWhile(predicate)
     */
    dropWhileIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>


    /**
     * Get a new {@link CollectionHolder} (of `0`) if satisfying the given {@link predicate} twice,
     * get a new {@link CollectionHolder} (of `1`) with the {@link value2} if satisfying the given {@link predicate} once,
     * and a new {@link CollectionHolder} (of `2`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html Kotlin dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#dropWhile(java.util.function.Predicate) Java Stream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#dropWhile(java.util.function.IntPredicate) Java IntStream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#dropWhile(java.util.function.LongPredicate) Java LongStream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#dropWhile(java.util.function.DoublePredicate) Java DoubleStream.dropWhile(predicate)
     * @typescriptDefinition
     * @alias CollectionHolderOf2.dropWhileIndexed
     */
    skipWhileIndexed<const S extends | T1 | T2, >(predicate: ReverseRestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} (of `0`) if satisfying the given {@link predicate} twice,
     * get a new {@link CollectionHolder} (of `1`) with the {@link value2} if satisfying the given {@link predicate} once,
     * and a new {@link CollectionHolder} (of `2`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-while.html Kotlin dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/Stream.html#dropWhile(java.util.function.Predicate) Java Stream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/IntStream.html#dropWhile(java.util.function.IntPredicate) Java IntStream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/LongStream.html#dropWhile(java.util.function.LongPredicate) Java LongStream.dropWhile(predicate)
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/stream/DoubleStream.html#dropWhile(java.util.function.DoublePredicate) Java DoubleStream.dropWhile(predicate)
     * @alias CollectionHolderOf2.dropWhileIndexed
     */
    skipWhileIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>

    //#endregion -------------------- Drop while indexed --------------------

    //#region -------------------- Drop last --------------------

    /**
     * Get an {@link EmptyCollectionHolder} if `2` or over,
     * get a new {@link CollectionHolderOf1} with the {@link value1} if `1`|`-1`
     * or the current {@link CollectionHolderOf2 instance} otherwise
     *
     * @param n The number of arguments (if negative, then it is plus `2`)
     * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last.html Kotlin dropLast(n)
     * @canReceiveNegativeValue
     */
    dropLast(n: number,): CollectionHolderOf0Or1Or2<T1, T2>

    /**
     * Get an {@link EmptyCollectionHolder} if `2` or over,
     * get a new {@link CollectionHolderOf1} with the {@link value1} if `1`|`-1`
     * or the current {@link CollectionHolderOf2 instance} otherwise
     *
     * @param n The number of arguments (if negative, then it is plus `2`)
     * @throws ForbiddenIndexException {@link n} is an undetermined {@link Number} ({@link Number.NaN NaN})
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last.html Kotlin dropLast(n)
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf2.dropLast
     */
    skipLast(n: number,): CollectionHolderOf0Or1Or2<T1, T2>

    //#endregion -------------------- Drop last --------------------
    //#region -------------------- Drop last while --------------------

    /**
     * Get a new {@link CollectionHolder} (of `0`) if satisfying the given {@link predicate} twice,
     * Get a new {@link CollectionHolder} (of `1`) with the {@link value1} if satisfying the given {@link predicate} once,
     * and a new {@link CollectionHolder} (of `2`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html Kotlin dropLastWhile(predicate)
     * @typescriptDefinition
     */
    dropLastWhile<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} (of `0`) if satisfying the given {@link predicate} twice,
     * Get a new {@link CollectionHolder} (of `1`) with the {@link value1} if satisfying the given {@link predicate} once,
     * and a new {@link CollectionHolder} (of `2`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html Kotlin dropLastWhile(predicate)
     */
    dropLastWhile(predicate: BooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>


    /**
     * Get a new {@link CollectionHolder} (of `0`) if satisfying the given {@link predicate} twice,
     * Get a new {@link CollectionHolder} (of `1`) with the {@link value1} if satisfying the given {@link predicate} once,
     * and a new {@link CollectionHolder} (of `2`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html Kotlin dropLastWhile(predicate)
     * @typescriptDefinition
     * @alias CollectionHolderOf2.dropLastWhile
     */
    skipLastWhile<const S extends | T1 | T2, >(predicate: RestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} (of `0`) if satisfying the given {@link predicate} twice,
     * Get a new {@link CollectionHolder} (of `1`) with the {@link value1} if satisfying the given {@link predicate} once,
     * and a new {@link CollectionHolder} (of `2`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html Kotlin dropLastWhile(predicate)
     * @alias CollectionHolderOf2.dropLastWhile
     */
    skipLastWhile(predicate: BooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>

    //#endregion -------------------- Drop last while --------------------
    //#region -------------------- Drop last while indexed --------------------

    /**
     * Get a new {@link CollectionHolder} (of `0`) if satisfying the given {@link predicate} twice,
     * Get a new {@link CollectionHolder} (of `1`) with the {@link value1} if satisfying the given {@link predicate} once,
     * and a new {@link CollectionHolder} (of `2`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html Kotlin dropLastWhile(predicate)
     * @typescriptDefinition
     */
    dropLastWhileIndexed<const S extends | T1 | T2, >(predicate: ReverseRestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} (of `0`) if satisfying the given {@link predicate} twice,
     * Get a new {@link CollectionHolder} (of `1`) with the {@link value1} if satisfying the given {@link predicate} once,
     * and a new {@link CollectionHolder} (of `2`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html Kotlin dropLastWhile(predicate)
     */
    dropLastWhileIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>


    /**
     * Get a new {@link CollectionHolder} (of `0`) if satisfying the given {@link predicate} twice,
     * Get a new {@link CollectionHolder} (of `1`) with the {@link value1} if satisfying the given {@link predicate} once,
     * and a new {@link CollectionHolder} (of `2`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html Kotlin dropLastWhile(predicate)
     * @typescriptDefinition
     * @alias CollectionHolderOf2.dropLastWhileIndexed
     */
    skipLastWhileIndexed<const S extends | T1 | T2, >(predicate: ReverseRestrainedBooleanCallback<| T1 | T2, S>,): CollectionHolder<S>

    /**
     * Get a new {@link CollectionHolder} (of `0`) if satisfying the given {@link predicate} twice,
     * Get a new {@link CollectionHolder} (of `1`) with the {@link value1} if satisfying the given {@link predicate} once,
     * and a new {@link CollectionHolder} (of `2`) otherwise
     *
     * @param predicate The given predicate
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/drop-last-while.html Kotlin dropLastWhile(predicate)
     * @alias CollectionHolderOf2.dropLastWhileIndexed
     */
    skipLastWhileIndexed(predicate: ReverseBooleanCallback<| T1 | T2>,): CollectionHolder<| T1 | T2>

    //#endregion -------------------- Drop last while indexed --------------------

    //#region -------------------- Map --------------------

    /**
     * Create a new {@link CollectionHolderOf2} containing the result
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
    map<const U, >(transform: ValueIndexWithReturnCallback<| T1 | T2, U>,): CollectionHolderOf2<U, U>

    //#endregion -------------------- Map --------------------
    //#region -------------------- Map indexed --------------------

    /**
     * Create a new {@link CollectionHolderOf2} containing the result
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
    mapIndexed<const U, >(transform: IndexValueWithReturnCallback<| T1 | T2, U>,): CollectionHolderOf2<U, U>

    //#endregion -------------------- Map indexed --------------------

    //#region -------------------- Map not null --------------------

    /**
     * Create a new {@link CollectionHolder} (of `0`) if the 2 results of the given {@link transform}
     * on the {@link value1}|{@link value2} are `null`|`undefined`,
     * create a new {@link CollectionHolder} (of `1`) if 1 result of the given {@link transform}
     * on the {@link value1}|{@link value2} is `null`|`undefined`,
     * and a {@link CollectionHolder} (of `2`) otherwise
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
    mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<| T1 | T2, Nullable<U>>,): CollectionHolder<U>

    //#endregion -------------------- Map not null --------------------
    //#region -------------------- Map not null indexed --------------------

    /**
     * Create a new {@link CollectionHolder} (of `0`) if the 2 results of the given {@link transform}
     * on the {@link value1}|{@link value2} are `null`|`undefined`,
     * create a new {@link CollectionHolder} (of `1`) if 1 result of the given {@link transform}
     * on the {@link value1}|{@link value2} is `null`|`undefined`,
     * and a {@link CollectionHolder} (of `2`) otherwise
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
    mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<| T1 | T2, Nullable<U>>,): CollectionHolder<U>

    //#endregion -------------------- Map not null indexed --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Reordering methods --------------------

    //#region -------------------- To reverse --------------------

    /**
     * Reverse the current {@link CollectionHolderOf2 instance} to a new {@link CollectionHolderOf2}
     *
     * @see Array.reverse
     * @see ReadonlyArray.toReversed
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reversed.html Kotlin reversed()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
     * @canReceiveNegativeValue
     */
    toReverse(): CollectionHolderOf2<T2, T1>

    /**
     * Reverse the current {@link CollectionHolderOf2 instance}
     *
     * to a new {@link CollectionHolderOf1} with {@link value2} if {@link from} `1`|`-1`,
     *
     * and a new {@link CollectionHolderOf2} with {@link value2}+{@link value1} otherwise
     *
     * @param from The inclusive starting index (`0` by default)
     * @throws IndexOutOfBoundsException {@link from} is not `0`, `1`, `-1` or `-2`
     * @throws ForbiddenIndexException   {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see Array.reverse
     * @see ReadonlyArray.toReversed
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reversed.html Kotlin reversed()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
     * @canReceiveNegativeValue
     */
    toReverse<const I1 extends NullableNumber, >(from: I1,): ToReverse_from<T1, T2, I1>

    /**
     * Reverse the current {@link CollectionHolderOf2 instance}
     *
     * to a new {@link CollectionHolderOf1} with {@link value2} if {@link from} `1`|`-1`,
     *
     * and a new {@link CollectionHolderOf2} with {@link value2}+{@link value1} otherwise
     *
     * @param from The inclusive starting index (`0` by default)
     * @throws IndexOutOfBoundsException {@link from} is not `0`, `1`, `-1` or `-2`
     * @throws ForbiddenIndexException   {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see Array.reverse
     * @see ReadonlyArray.toReversed
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reversed.html Kotlin reversed()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
     * @canReceiveNegativeValue
     */
    toReverse(from: NullableNumber,): CollectionHolderOf1Or2<T2, T1>

    /**
     * Reverse the current {@link CollectionHolderOf2 instance}
     *
     * to a new {@link CollectionHolderOf1} with {@link value2} if {@link to} `0`|`-2`,
     *
     * and a new {@link CollectionHolderOf2} with {@link value2}+{@link value1} otherwise
     *
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`1` by default)
     * @throws IndexOutOfBoundsException {@link to} is not `0`, `1`, `-1` or `-2`
     * @throws ForbiddenIndexException   {@link to} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see Array.reverse
     * @see ReadonlyArray.toReversed
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reversed.html Kotlin reversed()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
     * @canReceiveNegativeValue
     * @typescriptDefinition
     */
    toReverse<const I2 extends NullableNumber, >(from: NullOrUndefined, to: I2,): ToReverse_to<T1, T2, I2>

    /**
     * Reverse the current {@link CollectionHolderOf2 instance}
     *
     * to a new {@link CollectionHolderOf1} with {@link value2} if {@link to} `0`|`-2`,
     *
     * and a new {@link CollectionHolderOf2} with {@link value2}+{@link value1} otherwise
     *
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`1` by default)
     * @throws IndexOutOfBoundsException {@link to} is not `0`, `1`, `-1` or `-2`
     * @throws ForbiddenIndexException   {@link to} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see Array.reverse
     * @see ReadonlyArray.toReversed
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reversed.html Kotlin reversed()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
     * @canReceiveNegativeValue
     * @typescriptDefinition
     */
    toReverse(from: NullOrUndefined, to: NullableNumber,): CollectionHolderOf1Or2<T2, T1>

    /**
     * Reverse the current {@link CollectionHolderOf2 instance}
     *
     * to a new {@link CollectionHolderOf1} with {@link value2} if {@link from} is `1`|`-1`, and {@link to} is `null`|`undefined`|`1`|`-1`,
     *
     * to a new {@link CollectionHolderOf1} with {@link value1} if {@link from} is `null`|`undefined`|`0`|`-2`, and {@link to} is `0`|`-2`,
     *
     * to a new {@link CollectionHolderOf2} with {@link value2}+{@link value1} if {@link from} is `null`|`undefined`|`0`|`-2` and {@link to} is `null`|`undefined`|`1`|`-1`,
     *
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`1` by default)
     * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not `0`, `1`, `-1` or `-2`
     * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @throws InvalidIndexRangeException {@link to} is before the {@link from} after the calculation
     * @see Array.reverse
     * @see ReadonlyArray.toReversed
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reversed.html Kotlin reversed()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
     * @canReceiveNegativeValue
     * @typescriptDefinition
     */
    toReverse<const I1 extends NullableNumber, const I2 extends NullableNumber, >(from: I1, to: I2,): ToReverse_fromTo<T1, T2, I1, I2>

    /**
     * Reverse the current {@link CollectionHolderOf2 instance}
     *
     * to a new {@link CollectionHolderOf1} with {@link value2} if {@link from} is `1`|`-1`, and {@link to} is `null`|`undefined`|`1`|`-1`,
     *
     * to a new {@link CollectionHolderOf1} with {@link value1} if {@link from} is `null`|`undefined`|`0`|`-2`, and {@link to} is `0`|`-2`,
     *
     * to a new {@link CollectionHolderOf2} with {@link value2}+{@link value1} if {@link from} is `null`|`undefined`|`0`|`-2` and {@link to} is `null`|`undefined`|`1`|`-1`,
     *
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`1` by default)
     * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not `0`, `1`, `-1` or `-2`
     * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @throws InvalidIndexRangeException {@link to} is before the {@link from} after the calculation
     * @see Array.reverse
     * @see ReadonlyArray.toReversed
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reversed.html Kotlin reversed()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
     * @canReceiveNegativeValue
     */
    toReverse(from: NullableNumber, to: NullableNumber,): CollectionHolderOfAny1Or2<T2, T1>


    /**
     * Reverse the current {@link CollectionHolderOf2 instance} to a new {@link CollectionHolderOf2}
     *
     * @see Array.reverse
     * @see ReadonlyArray.toReversed
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reversed.html Kotlin reversed()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf2.toReverse
     */
    toReversed(): CollectionHolderOf2<T2, T1>

    /**
     * Reverse the current {@link CollectionHolderOf2 instance}
     *
     * to a new {@link CollectionHolderOf1} with {@link value2} if {@link from} `1`|`-1`,
     *
     * and a new {@link CollectionHolderOf2} with {@link value2}+{@link value1} otherwise
     *
     * @param from The inclusive starting index (`0` by default)
     * @throws IndexOutOfBoundsException {@link from} is not `0`, `1`, `-1` or `-2`
     * @throws ForbiddenIndexException   {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see Array.reverse
     * @see ReadonlyArray.toReversed
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reversed.html Kotlin reversed()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
     * @canReceiveNegativeValue
     * @typescriptDefinition
     * @alias CollectionHolderOf2.toReverse
     */
    toReversed<const I1 extends NullableNumber, >(from: I1,): ToReverse_from<T1, T2, I1>

    /**
     * Reverse the current {@link CollectionHolderOf2 instance}
     *
     * to a new {@link CollectionHolderOf1} with {@link value2} if {@link from} `1`|`-1`,
     *
     * and a new {@link CollectionHolderOf2} with {@link value2}+{@link value1} otherwise
     *
     * @param from The inclusive starting index (`0` by default)
     * @throws IndexOutOfBoundsException {@link from} is not `0`, `1`, `-1` or `-2`
     * @throws ForbiddenIndexException   {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see Array.reverse
     * @see ReadonlyArray.toReversed
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reversed.html Kotlin reversed()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf2.toReverse
     */
    toReversed(from: NullableNumber,): CollectionHolderOf1Or2<T2, T1>

    /**
     * Reverse the current {@link CollectionHolderOf2 instance}
     *
     * to a new {@link CollectionHolderOf1} with {@link value2} if {@link to} `0`|`-2`,
     *
     * and a new {@link CollectionHolderOf2} with {@link value2}+{@link value1} otherwise
     *
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`1` by default)
     * @throws IndexOutOfBoundsException {@link to} is not `0`, `1`, `-1` or `-2`
     * @throws ForbiddenIndexException   {@link to} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see Array.reverse
     * @see ReadonlyArray.toReversed
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reversed.html Kotlin reversed()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
     * @canReceiveNegativeValue
     * @typescriptDefinition
     * @alias CollectionHolderOf2.toReverse
     */
    toReversed<const I2 extends NullableNumber, >(from: NullOrUndefined, to: I2,): ToReverse_to<T1, T2, I2>

    /**
     * Reverse the current {@link CollectionHolderOf2 instance}
     *
     * to a new {@link CollectionHolderOf1} with {@link value2} if {@link to} `0`|`-2`,
     *
     * and a new {@link CollectionHolderOf2} with {@link value2}+{@link value1} otherwise
     *
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`1` by default)
     * @throws IndexOutOfBoundsException {@link to} is not `0`, `1`, `-1` or `-2`
     * @throws ForbiddenIndexException   {@link to} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see Array.reverse
     * @see ReadonlyArray.toReversed
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reversed.html Kotlin reversed()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
     * @canReceiveNegativeValue
     * @typescriptDefinition
     * @alias CollectionHolderOf2.toReverse
     */
    toReversed(from: NullOrUndefined, to: NullableNumber,): CollectionHolderOf1Or2<T2, T1>

    /**
     * Reverse the current {@link CollectionHolderOf2 instance}
     *
     * to a new {@link CollectionHolderOf1} with {@link value2} if {@link from} is `1`|`-1`, and {@link to} is `null`|`undefined`|`1`|`-1`,
     *
     * to a new {@link CollectionHolderOf1} with {@link value1} if {@link from} is `null`|`undefined`|`0`|`-2`, and {@link to} is `0`|`-2`,
     *
     * to a new {@link CollectionHolderOf2} with {@link value2}+{@link value1} if {@link from} is `null`|`undefined`|`0`|`-2` and {@link to} is `null`|`undefined`|`1`|`-1`,
     *
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`1` by default)
     * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not `0`, `1`, `-1` or `-2`
     * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @throws InvalidIndexRangeException {@link to} is before the {@link from} after the calculation
     * @see Array.reverse
     * @see ReadonlyArray.toReversed
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reversed.html Kotlin reversed()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
     * @canReceiveNegativeValue
     * @typescriptDefinition
     * @alias CollectionHolderOf2.toReverse
     */
    toReversed<const I1 extends NullableNumber, const I2 extends NullableNumber, >(from: I1, to: I2,): ToReverse_fromTo<T1, T2, I1, I2>

    /**
     * Reverse the current {@link CollectionHolderOf2 instance}
     *
     * to a new {@link CollectionHolderOf1} with {@link value2} if {@link from} is `1`|`-1`, and {@link to} is `null`|`undefined`|`1`|`-1`,
     *
     * to a new {@link CollectionHolderOf1} with {@link value1} if {@link from} is `null`|`undefined`|`0`|`-2`, and {@link to} is `0`|`-2`,
     *
     * to a new {@link CollectionHolderOf2} with {@link value2}+{@link value1} if {@link from} is `null`|`undefined`|`0`|`-2` and {@link to} is `null`|`undefined`|`1`|`-1`,
     *
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`1` by default)
     * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not `0`, `1`, `-1` or `-2`
     * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @throws InvalidIndexRangeException {@link to} is before the {@link from} after the calculation
     * @see Array.reverse
     * @see ReadonlyArray.toReversed
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reversed.html Kotlin reversed()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf2.toReverse
     */
    toReversed(from: NullableNumber, to: NullableNumber,): CollectionHolderOfAny1Or2<T2, T1>


    /**
     * Reverse the current {@link CollectionHolderOf2 instance} to a new {@link CollectionHolderOf2}
     *
     * @see Array.reverse
     * @see ReadonlyArray.toReversed
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reversed.html Kotlin reversed()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf2.toReverse
     */
    reversed(): CollectionHolderOf2<T2, T1>

    /**
     * Reverse the current {@link CollectionHolderOf2 instance}
     *
     * to a new {@link CollectionHolderOf1} with {@link value2} if {@link from} `1`|`-1`,
     *
     * and a new {@link CollectionHolderOf2} with {@link value2}+{@link value1} otherwise
     *
     * @param from The inclusive starting index (`0` by default)
     * @throws IndexOutOfBoundsException {@link from} is not `0`, `1`, `-1` or `-2`
     * @throws ForbiddenIndexException   {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see Array.reverse
     * @see ReadonlyArray.toReversed
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reversed.html Kotlin reversed()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
     * @canReceiveNegativeValue
     * @typescriptDefinition
     * @alias CollectionHolderOf2.toReverse
     */
    reversed<const I1 extends NullableNumber, >(from: I1,): ToReverse_from<T1, T2, I1>

    /**
     * Reverse the current {@link CollectionHolderOf2 instance}
     *
     * to a new {@link CollectionHolderOf1} with {@link value2} if {@link from} `1`|`-1`,
     *
     * and a new {@link CollectionHolderOf2} with {@link value2}+{@link value1} otherwise
     *
     * @param from The inclusive starting index (`0` by default)
     * @throws IndexOutOfBoundsException {@link from} is not `0`, `1`, `-1` or `-2`
     * @throws ForbiddenIndexException   {@link from} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see Array.reverse
     * @see ReadonlyArray.toReversed
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reversed.html Kotlin reversed()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf2.toReverse
     */
    reversed(from: NullableNumber,): CollectionHolderOf1Or2<T2, T1>

    /**
     * Reverse the current {@link CollectionHolderOf2 instance}
     *
     * to a new {@link CollectionHolderOf1} with {@link value2} if {@link to} `0`|`-2`,
     *
     * and a new {@link CollectionHolderOf2} with {@link value2}+{@link value1} otherwise
     *
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`1` by default)
     * @throws IndexOutOfBoundsException {@link to} is not `0`, `1`, `-1` or `-2`
     * @throws ForbiddenIndexException   {@link to} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see Array.reverse
     * @see ReadonlyArray.toReversed
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reversed.html Kotlin reversed()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
     * @canReceiveNegativeValue
     * @typescriptDefinition
     * @alias CollectionHolderOf2.toReverse
     */
    reversed<const I2 extends NullableNumber, >(from: NullOrUndefined, to: I2,): ToReverse_to<T1, T2, I2>

    /**
     * Reverse the current {@link CollectionHolderOf2 instance}
     *
     * to a new {@link CollectionHolderOf1} with {@link value2} if {@link to} `0`|`-2`,
     *
     * and a new {@link CollectionHolderOf2} with {@link value2}+{@link value1} otherwise
     *
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`1` by default)
     * @throws IndexOutOfBoundsException {@link to} is not `0`, `1`, `-1` or `-2`
     * @throws ForbiddenIndexException   {@link to} is an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @see Array.reverse
     * @see ReadonlyArray.toReversed
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reversed.html Kotlin reversed()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
     * @canReceiveNegativeValue
     * @typescriptDefinition
     * @alias CollectionHolderOf2.toReverse
     */
    reversed(from: NullOrUndefined, to: NullableNumber,): CollectionHolderOf1Or2<T2, T1>

    /**
     * Reverse the current {@link CollectionHolderOf2 instance}
     *
     * to a new {@link CollectionHolderOf1} with {@link value2} if {@link from} is `1`|`-1`, and {@link to} is `null`|`undefined`|`1`|`-1`,
     *
     * to a new {@link CollectionHolderOf1} with {@link value1} if {@link from} is `null`|`undefined`|`0`|`-2`, and {@link to} is `0`|`-2`,
     *
     * to a new {@link CollectionHolderOf2} with {@link value2}+{@link value1} if {@link from} is `null`|`undefined`|`0`|`-2` and {@link to} is `null`|`undefined`|`1`|`-1`,
     *
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`1` by default)
     * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not `0`, `1`, `-1` or `-2`
     * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @throws InvalidIndexRangeException {@link to} is before the {@link from} after the calculation
     * @see Array.reverse
     * @see ReadonlyArray.toReversed
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reversed.html Kotlin reversed()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
     * @canReceiveNegativeValue
     * @typescriptDefinition
     * @alias CollectionHolderOf2.toReverse
     */
    reversed<const I1 extends NullableNumber, const I2 extends NullableNumber, >(from: I1, to: I2,): ToReverse_fromTo<T1, T2, I1, I2>

    /**
     * Reverse the current {@link CollectionHolderOf2 instance}
     *
     * to a new {@link CollectionHolderOf1} with {@link value2} if {@link from} is `1`|`-1`, and {@link to} is `null`|`undefined`|`1`|`-1`,
     *
     * to a new {@link CollectionHolderOf1} with {@link value1} if {@link from} is `null`|`undefined`|`0`|`-2`, and {@link to} is `0`|`-2`,
     *
     * to a new {@link CollectionHolderOf2} with {@link value2}+{@link value1} if {@link from} is `null`|`undefined`|`0`|`-2` and {@link to} is `null`|`undefined`|`1`|`-1`,
     *
     * @param from The inclusive starting index (`0` by default)
     * @param to   The inclusive ending index (`1` by default)
     * @throws IndexOutOfBoundsException  {@link from} or {@link to} are not `0`, `1`, `-1` or `-2`
     * @throws ForbiddenIndexException    {@link from} or {@link to} are an undetermined {@link Number} (±∞ / {@link Number.NaN NaN})
     * @throws InvalidIndexRangeException {@link to} is before the {@link from} after the calculation
     * @see Array.reverse
     * @see ReadonlyArray.toReversed
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reversed.html Kotlin reversed()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/SequencedCollection.html#reversed() Java reversed()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse C# Reverse()
     * @canReceiveNegativeValue
     * @alias CollectionHolderOf2.toReverse
     */
    reversed(from: NullableNumber, to: NullableNumber,): CollectionHolderOfAny1Or2<T2, T1>

    //#endregion -------------------- To reverse --------------------

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- JavaScript methods --------------------

    /**
     * A JavaScript way to implement a "for‥of" over the current {@link CollectionHolderOf2 instance}
     *
     * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/iterator
     * @alias CollectionHolderOf2.toIterator
     */
    [Symbol.iterator](): CollectionIteratorOf2<T1, T2>

    //#endregion -------------------- JavaScript methods --------------------
    //#region -------------------- Conversion methods --------------------

    /** Convert the current {@link CollectionHolderOf2 instance} to a {@link CollectionIteratorOf2} */
    toIterator(): CollectionIteratorOf2<T1, T2>

    /** Convert the current {@link CollectionHolderOf2 instance} to a {@link ReadonlyArray array} of 2 */
    toArray(): readonly [T1, T2,]

    /** Convert the current {@link CollectionHolderOf2 instance} to a new {@link Array mutable array} of 2 */
    toMutableArray(): [T1, T2,]

    /** Convert the current {@link CollectionHolderOf2 instance} to a {@link ReadonlySet set} of 2 */
    toSet(): Set<| T1 | T2>

    /** Convert the current {@link CollectionHolderOf2 instance} to a new {@link Set mutable set} of 2 */
    toMutableSet(): MutableSet<| T1 | T2>

    /** Convert the current {@link CollectionHolderOf2 instance} to a {@link ReadonlyMap map} of 2 */
    toMap(): NumberKeyMap<| T1 | T2, | 0 | 1>

    /** Convert the current {@link CollectionHolderOf2 instance} to a new {@link Map mutable map} of 2 */
    toMutableMap(): MutableNumberKeyMap<| T1 | T2, | 0 | 1>

    //#endregion -------------------- Conversion methods --------------------

}

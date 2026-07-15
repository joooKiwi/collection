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

import type {Array, Set} from "@joookiwi/type"

import type {CollectionHolder} from "../CollectionHolder"
import type {TupleName}        from "../type/toStringTag"

/**
 * A definition of a class with specific amount of values depending on the name being used.
 * Note that the fields are only defined in the instance directly.
 *
 * @see Empty
 * @see Monuple
 * @see Couple
 */
export interface Tuple<out T, > {

    //#region -------------------- Size methods --------------------

    /**
     * Get the size of the current {@link Tuple instance}
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
    readonly size: number

    /**
     * Get the size of the current {@link Tuple instance}
     *
     * @see ReadonlyArray.length
     * @see ReadonlySet.size
     * @see ReadonlyMap.size
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/size.html Kotlin Collection.size()
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/size.html Kotlin Map.size()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Collection.html#size() Java Collection.size()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Map.html#size() Java Map.size()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.count C# Count()
     * @alias CollectionHolder.size
     */
    readonly length: this["size"]

    /**
     * Get the size of the current {@link Tuple instance}
     *
     * @see ReadonlyArray.length
     * @see ReadonlySet.size
     * @see ReadonlyMap.size
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/size.html Kotlin Collection.size()
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/size.html Kotlin Map.size()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Collection.html#size() Java Collection.size()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Map.html#size() Java Map.size()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.count C# Count()
     * @alias CollectionHolder.size
     */
    readonly count: this["size"]


    /**
     * The current {@link Tuple instance} has no values
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-empty.html Kotlin isEmpty()
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/is-empty.html Kotlin Collection.isEmpty()
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/is-empty.html Kotlin Map.isEmpty()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Collection.html#isEmpty() Java Collection.isEmpty()
     * @see https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Map.html#isEmpty Java Map.isEmpty()
     */
    readonly isEmpty: boolean

    /**
     * The current {@link Tuple instance} has a minimum of 1 value
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-not-empty.html Kotlin isNotEmpty()
     */
    readonly isNotEmpty: boolean


    /**
     * The current {@link Tuple instance} has a minimum of 1 value
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-not-empty.html Kotlin isNotEmpty()
     * @alias CollectionHolder.isNotEmpty
     */
    readonly hasAtLeast1Element: this["isNotEmpty"]

    /**
     * The current {@link Tuple instance} has a minimum of 1 value
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-not-empty.html Kotlin isNotEmpty()
     * @alias CollectionHolder.isNotEmpty
     */
    readonly containsAtLeast1Element: this["isNotEmpty"]

    /**
     * The current {@link Tuple instance} has a minimum of 1 value
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/is-not-empty.html Kotlin isNotEmpty()
     * @alias CollectionHolder.isNotEmpty
     */
    readonly includesAtLeast1Element: this["isNotEmpty"]


    /** The current {@link Tuple instance} has exactly 1 value */
    readonly hasExactly1Element: boolean

    /**
     * The current {@link Tuple instance} has exactly 1 value
     *
     * @alias CollectionHolder.hasExactly1Element
     */
    readonly containsExactly1Element: this["hasExactly1Element"]

    /**
     * The current {@link Tuple instance} has exactly 1 value
     *
     * @alias CollectionHolder.hasExactly1Element
     */
    readonly includesExactly1Element: this["hasExactly1Element"]


    /** The current {@link Tuple instance} has exactly 0 or 1 value */
    readonly hasAtMost1Element: boolean

    /**
     * The current {@link Tuple instance} has exactly 0 or 1 value
     *
     * @alias CollectionHolder.hasAtMost1Element
     */
    readonly containsAtMost1Element: this["hasAtMost1Element"]

    /**
     * The current {@link Tuple instance} has exactly 0 or 1 value
     *
     * @alias CollectionHolder.hasAtMost1Element
     */
    readonly includesAtMost1Element: this["hasAtMost1Element"]


    /** The current {@link Tuple instance} has a minimum of 2 values */
    readonly hasAtLeast2Elements: boolean

    /**
     * The current {@link Tuple instance} has a minimum of 2 values
     *
     * @alias CollectionHolder.hasAtLeast2Elements
     */
    readonly containsAtLeast2Elements: this["hasAtLeast2Elements"]

    /**
     * The current {@link Tuple instance} has a minimum of 2 values
     *
     * @alias CollectionHolder.hasAtLeast2Elements
     */
    readonly includesAtLeast2Elements: this["hasAtLeast2Elements"]


    /** The current {@link Tuple instance} has exactly 2 values */
    readonly hasExactly2Elements: boolean

    /**
     * The current {@link Tuple instance} has exactly 2 values
     *
     * @alias CollectionHolder.hasExactly2Elements
     */
    readonly containsExactly2Elements: this["hasExactly2Elements"]

    /**
     * The current {@link Tuple instance} has exactly 2 values
     *
     * @alias CollectionHolder.hasExactly2Elements
     */
    readonly includesExactly2Elements: this["hasExactly2Elements"]


    /** The current {@link Tuple instance} has exactly 0, 1 or 2 values */
    readonly hasAtMost2Elements: boolean

    /**
     * The current {@link Tuple instance} has exactly 0, 1 or 2 values
     *
     * @alias CollectionHolder.hasAtMost2Elements
     */
    readonly containsAtMost2Elements: this["hasAtMost2Elements"]

    /**
     * The current {@link Tuple instance} has exactly 0, 1 or 2 values
     *
     * @alias CollectionHolder.hasAtMost2Elements
     */
    readonly includesAtMost2Elements: this["hasAtMost2Elements"]

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Has ‥ --------------------

    //#region -------------------- Has null --------------------

    /**
     * The {@link Tuple} has at least one <b>null</b> or <b>undefined</b>
     *
     * @return {boolean} <b>true</b> only if one element is <b>null</b> or <b>undefined</b>
     */
    readonly hasNull: boolean

    /**
     * The {@link Tuple} has at least one <b>null</b> or <b>undefined</b>
     *
     * @alias Tuple.hasNull
     * @return {boolean} <b>true</b> only if one element is <b>null</b> or <b>undefined</b>
     */
    readonly includesNull: this["hasNull"]

    /**
     * The {@link Tuple} has at least one <b>null</b> or <b>undefined</b>
     *
     * @alias Tuple.hasNull
     * @return {boolean} <b>true</b> only if one element is <b>null</b> or <b>undefined</b>
     */
    readonly containsNull: this["hasNull"]

    //#endregion -------------------- Has null --------------------
    //#region -------------------- Has no nulls --------------------

    /**
     * The {@link Tuple} has no <b>null</b> or <b>undefined</b>
     *
     * @return {boolean} <b>true</b> only if no element is <b>null</b> or <b>undefined</b>
     */
    readonly hasNoNulls: boolean

    /**
     * The {@link Tuple} has no <b>null</b> or <b>undefined</b>
     *
     * @alias Tuple.hasNoNulls
     * @return {boolean} <b>true</b> only if no element is <b>null</b> or <b>undefined</b>
     */
    readonly includesNoNulls: this["hasNoNulls"]

    /**
     * The {@link Tuple} has no <b>null</b> or <b>undefined</b>
     *
     * @alias Tuple.hasNoNulls
     * @return {boolean} <b>true</b> only if no element is <b>null</b> or <b>undefined</b>
     */
    readonly containsNoNulls: this["hasNoNulls"]

    //#endregion -------------------- Has no nulls --------------------
    //#region -------------------- Has duplicate --------------------

    /**
     * The {@link Tuple} has at least one duplicate value
     *
     * @return {boolean} <b>true</b> only if one element is equal (===) to another one
     */
    readonly hasDuplicate: boolean

    /**
     * The {@link Tuple} has at least one duplicate value
     *
     * @alias Tuple.hasDuplicate
     * @return {boolean} <b>true</b> only if one element is equal (===) to another one
     */
    readonly includesDuplicate: this["hasDuplicate"]

    /**
     * The {@link Tuple} has at least one duplicate value
     *
     * @alias Tuple.hasDuplicate
     * @return {boolean} <b>true</b> only if one element is equal (===) to another one
     */
    readonly containsDuplicate: this["hasDuplicate"]

    //#endregion -------------------- Has duplicate --------------------
    //#region -------------------- Has no duplicates --------------------

    /**
     * The {@link Tuple} has no duplicated value
     *
     * @return {boolean} <b>true</b> only if no element is equal (===) to another one
     */
    readonly hasNoDuplicates: boolean

    /**
     * The {@link Tuple} has no duplicated value
     *
     * @alias Tuple.hasNoDuplicates
     * @return {boolean} <b>true</b> only if no element is equal (===) to another one
     */
    readonly includesNoDuplicates: this["hasNoDuplicates"]

    /**
     * The {@link Tuple} has no duplicated value
     *
     * @alias Tuple.hasNoDuplicates
     * @return {boolean} <b>true</b> only if no element is equal (===) to another one
     */
    readonly containsNoDuplicates: this["hasNoDuplicates"]

    //#endregion -------------------- Has no duplicates --------------------

    //#endregion -------------------- Has ‥ --------------------
    //#region -------------------- JavaScript methods --------------------

    /**
     * Give an output for the call from {@link ObjectConstructor.toString.call} [object Tuple] instead of [object Object]
     *
     * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/toStringTag
     */
    readonly [Symbol.toStringTag]: TupleName

    //#endregion -------------------- JavaScript methods --------------------
    //#region -------------------- Conversion methods --------------------

    /** Convert the current {@link Tuple instance} to a {@link ReadonlyArray array} */
    toArray(): Array<T>

    /** Convert the current {@link Tuple instance} to a {@link ReadonlySet set} */
    toSet(): Set<T>

    /** Convert the current {@link Tuple instance} to a {@link CollectionHolder} */
    toCollection(): CollectionHolder<T>

    /** Give a representation of the current {@link Tuple instance} */
    toString(): string

    //#endregion -------------------- Conversion methods --------------------

}

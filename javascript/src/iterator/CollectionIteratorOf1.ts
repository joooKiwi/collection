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

import type {NullOrZeroNumber} from "@joookiwi/type"

import type {CollectionIterator}                                                                   from "./CollectionIterator"
import type {IndexValueCallback, ValueIndexCallback}                                               from "../type/callback"
import type {PossibleIteratorValue}                                                                from "../type/iteratorValue"
import type {AfterLastValueInCollectionIteratorSymbol, BeforeFirstValueInCollectionIteratorSymbol} from "../type/symbol"

/**
 * An {@link Iterator} that goes to the {@link value} in normal or reverse order
 * depending on the first call.
 * It is although not really useful, it complies to the {@link CollectionIterator} behaviour.
 *
 * When the first call it {@link CollectionIteratorOf1.next next()} or {@link CollectionIteratorOf1.nextValue nextValue},
 * it is in the order from start to end.
 * ```typescript
 * function normalOrderIteration<T>(iterator: CollectionIteratorOf1<T>) {
 *     iterator.next()     // lone element
 *     // no methods after this point other than reset will give valid result
 *     iterator.next()     // no element
 *     iterator.previous() // no element
 *     iterator.next()     // no element
 *     iterator.next()     // no element
 * }
 * ```
 *
 * When the first call it {@link CollectionIteratorOf1.previous previous()} or {@link CollectionIteratorOf1.previousValue previousValue},
 * it is in the order from end to start.
 * ```typescript
 * function reverseOrderIteration<T>(iterator: CollectionIteratorOf1<T>) {
 *     iterator.previous() // lone element
 *     // no methods after this point other than reset will give valid result
 *     iterator.previous() // no element
 *     iterator.next()     // no element
 *     iterator.previous() // no element
 *     iterator.previous() // no element
 * }
 * ```
 * And when there is a {@link CollectionIteratorOf1.reset reset()} being called,
 * everything (excluding {@link CollectionIteratorOf1.firstIndex firstIndex} and {@link CollectionIteratorOf1.lastIndex lastIndex})
 * is being changed to its initial value
 * ```typescript
 * function varyingOrderIteration<T>(iterator: CollectionIteratorOf1<T>) {
 *     iterator.next()     // lone element
 *     iterator.next()     // no element
 *     iterator.reset()
 *     iterator.previous() // lone element
 *     iterator.previous() // no element
 * }
 * ```
 * @typeParam T The type (`unknown` by default)
 * @see IteratorObject
 * @see ArrayIterator
 * @see SetIterator
 * @see MapIterator
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-iterator Kotlin Iterator
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list-iterator Kotlin ListIterator
 */
export interface CollectionIteratorOf1<T = unknown, >
    extends CollectionIterator<T> {

    //#region -------------------- Value methods --------------------

    /** The only value of the current {@link CollectionIteratorOf1 instance} */
    readonly 0: T

    /** The only value of the current {@link CollectionIteratorOf1 instance} */
    readonly value: T

    //#endregion -------------------- Value methods --------------------
    //#region -------------------- Size methods --------------------

    /** Get the size of the current {@link CollectionIteratorOf1 instance} as `1` */
    readonly size: 1

    /**
     * Get the size of the current {@link CollectionIteratorOf1 instance} as `1`
     *
     * @alias CollectionIteratorOf1.size
     */
    readonly length: this["size"]

    /**
     * Get the size of the current {@link CollectionIteratorOf1 instance} as `1`
     *
     * @alias CollectionIteratorOf1.size
     */
    readonly count: this["size"]


    /** The current {@link CollectionIteratorOf1 instance} __NEVER__ has no values */
    readonly isEmpty: false

    /** The current {@link CollectionIteratorOf1 instance} has a minimum of 1 value (which is `true`) */
    readonly isNotEmpty: true


    /** The current {@link CollectionIteratorOf1 instance} has a minimum of 1 value (which is `true`) */
    readonly hasAtLeast1Element: this["isNotEmpty"]

    /**
     * The current {@link CollectionIteratorOf1 instance} has a minimum of 1 value (which is `true`)
     *
     * @alias CollectionIteratorOf1.isNotEmpty
     */
    readonly containsAtLeast1Element: this["isNotEmpty"]

    /**
     * The current {@link CollectionIteratorOf1 instance} has a minimum of 1 value (which is `true`)
     *
     * @alias CollectionIteratorOf1.isNotEmpty
     */
    readonly includesAtLeast1Element: this["isNotEmpty"]


    /** The current {@link CollectionIteratorOf1 instance} has exactly 1 value (which is `true`) */
    readonly hasExactly1Element: true

    /**
     * The current {@link CollectionIteratorOf1 instance} has exactly 1 value (which is `true`)
     *
     * @alias CollectionIteratorOf1.hasExactly1Element
     */
    readonly containsExactly1Element: this["hasExactly1Element"]

    /**
     * The current {@link CollectionIteratorOf1 instance} has exactly 1 value (which is `true`)
     *
     * @alias CollectionIteratorOf1.hasExactly1Element
     */
    readonly includesExactly1Element: this["hasExactly1Element"]


    /** The current {@link CollectionIteratorOf1 instance} has exactly 0 or 1 value (which is `true`) */
    readonly hasAtMost1Element: true

    /**
     * The current {@link CollectionIteratorOf1 instance} has exactly 0 or 1 value (which is `true`)
     *
     * @alias CollectionIteratorOf1.hasAtMost1Element
     */
    readonly containsAtMost1Element: this["hasAtMost1Element"]

    /**
     * The current {@link CollectionIteratorOf1 instance} has exactly 0 or 1 value (which is `true`)
     *
     * @alias CollectionIteratorOf1.hasAtMost1Element
     */
    readonly includesAtMost1Element: this["hasAtMost1Element"]


    /** The current {@link CollectionIteratorOf1 instance} has a minimum of 2 values (which is `false`) */
    readonly hasAtLeast2Elements: false

    /**
     * The current {@link CollectionIteratorOf1 instance} has a minimum of 2 values (which is `false`)
     *
     * @alias CollectionIteratorOf1.hasAtLeast2Elements
     */
    readonly containsAtLeast2Elements: this["hasAtLeast2Elements"]

    /**
     * The current {@link CollectionIteratorOf1 instance} has a minimum of 2 values (which is `false`)
     *
     * @alias CollectionIteratorOf1.hasAtLeast2Elements
     */
    readonly includesAtLeast2Elements: this["hasAtLeast2Elements"]


    /** The current {@link CollectionIteratorOf1 instance} has exactly 2 values (which is `false`) */
    readonly hasExactly2Elements: false

    /**
     * The current {@link CollectionIteratorOf1 instance} has exactly 2 values (which is `false`)
     *
     * @alias CollectionIteratorOf1.hasExactly2Elements
     */
    readonly containsExactly2Elements: this["hasExactly2Elements"]

    /**
     * The current {@link CollectionIteratorOf1 instance} has exactly 2 values (which is `false`)
     *
     * @alias CollectionIteratorOf1.hasExactly2Elements
     */
    readonly includesExactly2Elements: this["hasExactly2Elements"]


    /** The current {@link CollectionIteratorOf1 instance} has exactly 0, 1 or 2 values (which is `true`) */
    readonly hasAtMost2Elements: true

    /**
     * The current {@link CollectionIteratorOf1 instance} has exactly 0, 1 or 2 values (which is `true`)
     *
     * @alias CollectionIteratorOf1.hasAtMost2Elements
     */
    readonly containsAtMost2Elements: this["hasAtMost2Elements"]

    /**
     * The current {@link CollectionIteratorOf1 instance} has exactly 0, 1 or 2 values (which is `true`)
     *
     * @alias CollectionIteratorOf1.hasAtMost2Elements
     */
    readonly includesAtMost2Elements: this["hasAtMost2Elements"]

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- End-point index methods --------------------

    /** Get the lone index of the {@link CollectionIteratorOf1 iterator} */
    readonly firstIndex: 0

    /** Get the lone index of the {@link CollectionIteratorOf1 iterator} */
    readonly lastIndex: 0

    //#endregion -------------------- End-point index methods --------------------
    //#region -------------------- Current methods --------------------

    /** Get the index that the {@link CollectionIteratorOf1 iterator} is at */
    readonly currentIndex: NullOrZeroNumber

    /**
     * Get the index that the {@link CollectionIteratorOf1 iterator} is at
     *
     * @alias CollectionIteratorOf1.currentIndex
     */
    readonly index: this["currentIndex"]

    //#endregion -------------------- Current methods --------------------
    //#region -------------------- Next methods --------------------

    /** Tell if the {@link CollectionIteratorOf1 iterator} is at the {@link value} */
    readonly hasNext: boolean

    /** Get the `null` if at the {@link value} or `null` otherwise */
    readonly nextIndex: NullOrZeroNumber

    /**
     * Retrieve the {@link value} if not at it
     *
     * @note This is the equivalent to the Java <b>ListIterator.next()</b> method
     * @throws NoElementFoundInCollectionException Is at the end of the line or after it
     */
    readonly nextValue: T

    /**
     * Get the {@link GenericAfterLastIteratorValue} if at the {@link value}
     * or an {@link IteratorValueOf1} otherwise
     */
    next(): PossibleIteratorValue<T, AfterLastValueInCollectionIteratorSymbol>

    //#endregion -------------------- Next methods --------------------
    //#region -------------------- Previous methods --------------------

    /** Tell if the {@link CollectionIteratorOf1 iterator} is at the {@link value} */
    readonly hasPrevious: boolean

    /** Get the `null` if at the {@link value} or `null` otherwise */
    readonly previousIndex: NullOrZeroNumber

    /**
     * Retrieve the {@link value} if not at it
     *
     * @note This is the equivalent to the Java <b>ListIterator.previous()</b> method
     * @throws NoElementFoundInCollectionException Is at the end of the line or after it
     */
    readonly previousValue: T

    /**
     * Get the {@link GenericBeforeFirstIteratorValue} if at the {@link value}
     * or an {@link IteratorValueOf1} otherwise
     */
    previous(): PossibleIteratorValue<T, BeforeFirstValueInCollectionIteratorSymbol>

    //#endregion -------------------- Previous methods --------------------

    //#region -------------------- Loop methods --------------------

    /**
     * Do a certain operation on the {@link value} if not at it in the {@link CollectionIteratorOf1 iterator}
     *
     * @see IteratorObject.forEach
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/on-each.html Kotlin onEach(action)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each.html Kotlin forEach(operation)
     */
    forEach(operation: ValueIndexCallback<T>,): this

    /**
     * Do a certain operation on the {@link value} if not at it in the {@link CollectionIteratorOf1 iterator}
     *
     * @see IteratorObject.forEach
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/on-each.html Kotlin onEach(action)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each.html Kotlin forEach(operation)
     */
    forEachIndexed(operation: IndexValueCallback<T>,): this

    //#region -------------------- Loop methods --------------------
    //#region -------------------- JavaScript methods --------------------

    /** Create a new iterator instance with the same values */
    [Symbol.iterator](): CollectionIteratorOf1<T>

    //#endregion -------------------- JavaScript methods --------------------

}

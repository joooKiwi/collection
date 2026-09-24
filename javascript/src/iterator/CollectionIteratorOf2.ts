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

import type {NullOrNumber} from "@joookiwi/type"

import type {CollectionIterator}                                                                   from "./CollectionIterator"
import type {IndexValueCallback, ValueIndexCallback}                                               from "../type/callback"
import type {PossibleIteratorValue}                                                                from "../type/iteratorValue"
import type {AfterLastValueInCollectionIteratorSymbol, BeforeFirstValueInCollectionIteratorSymbol} from "../type/symbol"

/**
 * An {@link Iterator} that goes through the {@link value1} and {@link value2} in normal or reverse order
 * depending on the first call.
 *
 * When the first call it {@link CollectionIteratorOf2.next next()} or {@link CollectionIteratorOf2.nextValue nextValue},
 * it is in the order from start to end.
 * ```typescript
 * function normalOrderIteration<T1, T2>(iterator: CollectionIteratorOf2<T1, T2>) {
 *     iterator.next()     // 1st element
 *     iterator.next()     // 2nd element
 *     iterator.previous() // 1st element
 *     iterator.next()     // 2nd element
 *     iterator.next()     // no element
 * }
 * ```
 *
 * When the first call it {@link CollectionIteratorOf2.previous previous()} or {@link CollectionIteratorOf2.previousValue previousValue},
 * it is in the order from end to start.
 * ```typescript
 * function reverseOrderIteration<T1, T2>(iterator: CollectionIteratorOf2<T1, T2>) {
 *     iterator.previous() // 2nd element
 *     iterator.previous() // 1st element
 *     iterator.next()     // 2nd element
 *     iterator.previous() // 1st element
 *     iterator.previous() // no element
 * }
 * ```
 *
 * And when there is a {@link CollectionIteratorOf2.reset reset()} being called,
 * everything (excluding {@link CollectionIteratorOf2.firstIndex firstIndex} and {@link CollectionIteratorOf2.lastIndex lastIndex})
 * is being changed to its initial value
 * ```typescript
 * function varyingOrderIteration<T1, T2>(iterator: CollectionIteratorOf2<T1, T2>) {
 *     iterator.next()     // 1st element
 *     iterator.next()     // 2nd element
 *     iterator.reset()
 *     iterator.previous() // 2nd element
 *     iterator.previous() // 1st element
 * }
 * ```
 *
 * @typeParam T1 The 1st type (`unknown` by default)
 * @typeParam T2 The 2nd type (`unknown` by default)
 * @see IteratorObject
 * @see ArrayIterator
 * @see SetIterator
 * @see MapIterator
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-iterator Kotlin Iterator
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list-iterator Kotlin ListIterator
 */
export interface CollectionIteratorOf2<T1 = unknown,
    T2 = unknown, >
    extends CollectionIterator<| T1 | T2> {

    //#region -------------------- Value methods --------------------

    /** The 1st value (out of 2) of the current {@link CollectionIteratorOf2 instance} */
    readonly 0: T1

    /** The 2nd value (out of 2) of the current {@link CollectionIteratorOf2 instance} */
    readonly 1: T2

    /** The 1st value (out of 2) of the current {@link CollectionIteratorOf2 instance} */
    readonly value1: T1

    /** The 2nd value (out of 2) of the current {@link CollectionIteratorOf2 instance} */
    readonly value2: T2

    //#endregion -------------------- Value methods --------------------
    //#region -------------------- Size methods --------------------

    /**
     * Get the size of the current {@link CollectionIteratorOf2 instance} as `2`
     */
    readonly size: 2

    /**
     * Get the size of the current {@link CollectionIteratorOf2 instance} as `2`
     *
     * @alias CollectionIteratorOf2.size
     */
    readonly length: this["size"]

    /**
     * Get the size of the current {@link CollectionIteratorOf2 instance} as `2`
     *
     * @alias CollectionIteratorOf2.size
     */
    readonly count: this["size"]


    /** The current {@link CollectionIteratorOf2 instance} __NEVER__ has no values */
    readonly isEmpty: false

    /** The current {@link CollectionIteratorOf2 instance} has a minimum of 1 value (which is `true`) */
    readonly isNotEmpty: true


    /**
     * The current {@link CollectionIteratorOf2 instance} has a minimum of 1 value (which is `true`)
     *
     * @alias CollectionIteratorOf2.isNotEmpty
     */
    readonly hasAtLeast1Element: this["isNotEmpty"]

    /**
     * The current {@link CollectionIteratorOf2 instance} has a minimum of 1 value (which is `true`)
     *
     * @alias CollectionIteratorOf2.isNotEmpty
     */
    readonly containsAtLeast1Element: this["isNotEmpty"]

    /**
     * The current {@link CollectionIteratorOf2 instance} has a minimum of 1 value (which is `true`)
     *
     * @alias CollectionIteratorOf2.isNotEmpty
     */
    readonly includesAtLeast1Element: this["isNotEmpty"]


    /** The current {@link CollectionIteratorOf2 instance} has exactly 1 value (which is `false`) */
    readonly hasExactly1Element: false

    /**
     * The current {@link CollectionIteratorOf2 instance} has exactly 1 value (which is `false`)
     *
     * @alias CollectionIteratorOf2.hasExactly1Element
     */
    readonly containsExactly1Element: this["hasExactly1Element"]

    /**
     * The current {@link CollectionIteratorOf2 instance} has exactly 1 value (which is `false`)
     *
     * @alias CollectionIteratorOf2.hasExactly1Element
     */
    readonly includesExactly1Element: this["hasExactly1Element"]


    /** The current {@link CollectionIteratorOf2 instance} has exactly 0 or 1 value (which is `false`) */
    readonly hasAtMost1Element: false

    /**
     * The current {@link CollectionIteratorOf2 instance} has exactly 0 or 1 value (which is `false`)
     *
     * @alias CollectionIteratorOf2.hasAtMost1Element
     */
    readonly containsAtMost1Element: this["hasAtMost1Element"]

    /**
     * The current {@link CollectionIteratorOf2 instance} has exactly 0 or 1 value (which is `false`)
     *
     * @alias CollectionIteratorOf2.hasAtMost1Element
     */
    readonly includesAtMost1Element: this["hasAtMost1Element"]


    /** The current {@link CollectionIteratorOf2 instance} has a minimum of 2 values (which is `true`) */
    readonly hasAtLeast2Elements: true

    /**
     * The current {@link CollectionIteratorOf2 instance} has a minimum of 2 values (which is `true`)
     *
     * @alias CollectionIteratorOf2.hasAtLeast2Elements
     */
    readonly containsAtLeast2Elements: this["hasAtLeast2Elements"]

    /**
     * The current {@link CollectionIteratorOf2 instance} has a minimum of 2 values (which is `true`)
     *
     * @alias CollectionIteratorOf2.hasAtLeast2Elements
     */
    readonly includesAtLeast2Elements: this["hasAtLeast2Elements"]


    /** The current {@link CollectionIteratorOf2 instance} has exactly 2 values (which is `true`) */
    readonly hasExactly2Elements: true

    /**
     * The current {@link CollectionIteratorOf2 instance} has exactly 2 values (which is `true`)
     *
     * @alias CollectionIteratorOf2.hasExactly2Elements
     */
    readonly containsExactly2Elements: this["hasExactly2Elements"]

    /**
     * The current {@link CollectionIteratorOf2 instance} has exactly 2 values (which is `true`)
     *
     * @alias CollectionIteratorOf2.hasExactly2Elements
     */
    readonly includesExactly2Elements: this["hasExactly2Elements"]


    /** The current {@link CollectionIteratorOf2 instance} has exactly 0, 1 or 2 values (which is `true`) */
    readonly hasAtMost2Elements: true

    /**
     * The current {@link CollectionIteratorOf2 instance} has exactly 0, 1 or 2 values (which is `true`)
     *
     * @alias CollectionIteratorOf2.hasAtMost2Elements
     */
    readonly containsAtMost2Elements: this["hasAtMost2Elements"]

    /**
     * The current {@link CollectionIteratorOf2 instance} has exactly 0, 1 or 2 values (which is `true`)
     *
     * @alias CollectionIteratorOf2.hasAtMost2Elements
     */
    readonly includesAtMost2Elements: this["hasAtMost2Elements"]

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- End-point index methods --------------------

    /** Get the 1st index of the {@link CollectionIteratorOf2 iterator} */
    readonly firstIndex: 0

    /** Get the 2nd index of the {@link CollectionIteratorOf2 iterator} */
    readonly lastIndex: 1

    //#endregion -------------------- End-point index methods --------------------
    //#region -------------------- Current methods --------------------

    /** Get the index that the {@link CollectionIteratorOf2 iterator} is at */
    readonly currentIndex: NullOrNumber<| 0 | 1>

    /**
     * Get the index that the {@link CollectionIteratorOf2 iterator} is at
     *
     * @alias CollectionIteratorOf2.currentIndex
     */
    readonly index: this["currentIndex"]

    //#endregion -------------------- Current methods --------------------
    //#region -------------------- Next methods --------------------

    /** Tell if the {@link CollectionIteratorOf2 iterator} is at the {@link value1}|{@link value2} */
    readonly hasNext: boolean

    /** Get the index that will be used at a later {@link nextValue} or {@link next} call */
    readonly nextIndex: NullOrNumber<| 0 | 1>

    /**
     * Retrieve the {@link value1}|{@link value2} if not at it
     *
     * @note This is the equivalent to the Java <b>ListIterator.next()</b> method
     * @throws NoElementFoundInCollectionException Is at the end of the line or after it
     */
    readonly nextValue: | T1 | T2

    /**
     * Retrieve an {@link IteratorValueOf2On2} if at the {@link value1},
     * retrieve the {@link GenericAfterLastIteratorValue} if at the {@link value2}
     * or an {@link IteratorValueOf1On2} otherwise
     */
    next(): PossibleIteratorValue<| T1 | T2, AfterLastValueInCollectionIteratorSymbol>

    //#endregion -------------------- Next methods --------------------
    //#region -------------------- Previous methods --------------------

    /** Tell if the {@link CollectionIteratorOf2 iterator} is at the {@link value1}|{@link value2} */
    readonly hasPrevious: boolean

    /** Get the index that will be used at a later {@link previousValue} or {@link previous} call */
    readonly previousIndex: NullOrNumber<| 0 | 1>

    /**
     * Retrieve the {@link value1}|{@link value2} if not at it
     *
     * @note This is the equivalent to the Java <b>ListIterator.previous()</b> method
     * @throws NoElementFoundInCollectionException Is at the end of the line or after it
     */
    readonly previousValue: | T1 | T2

    /**
     * Get the {@link GenericBeforeFirstIteratorValue} if at the {@link value1},
     * get a {@link IteratorValueOf1On2} if at the {@link value2}
     * or an {@link IteratorValueOf2On2} otherwise
     */
    previous(): PossibleIteratorValue<| T1 | T2, BeforeFirstValueInCollectionIteratorSymbol>

    //#endregion -------------------- Previous methods --------------------

    //#region -------------------- Loop methods --------------------

    /**
     * Do a certain operation on the {@link value1}&{@link value2} if not at it in the {@link CollectionIteratorOf2 iterator}
     *
     * @see IteratorObject.forEach
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/on-each.html Kotlin onEach(action)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each.html Kotlin forEach(operation)
     */
    forEach(operation: ValueIndexCallback<| T1 | T2>,): this

    /**
     * Do a certain operation on the {@link value1}&{@link value2} if not at it in the {@link CollectionIteratorOf2 iterator}
     *
     * @see IteratorObject.forEach
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/on-each.html Kotlin onEach(action)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each.html Kotlin forEach(operation)
     */
    forEachIndexed(operation: IndexValueCallback<| T1 | T2>,): this

    //#region -------------------- Loop methods --------------------

    //#region -------------------- JavaScript methods --------------------

    /** Create a new iterator instance with the same values */
    [Symbol.iterator](): CollectionIteratorOf2<T1, T2>

    //#endregion -------------------- JavaScript methods --------------------

}

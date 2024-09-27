/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {NullOrNumber, NullOrZeroNumber} from "@joookiwi/type"

import type {IndexValueCallback, ValueIndexCallback}                                                                       from "../CollectionHolder.types"
import type {MinimalistCollectionHolder}                                                                                   from "../MinimalistCollectionHolder"
import type {AfterLastValueInCollectionIteratorSymbol, BeforeFirstValueInCollectionIteratorSymbol, CollectionIteratorName} from "./CollectionIterator.types"

/**
 * An {@link Iterator} with a known {@link MinimalistCollectionHolder} {@link MinimalistCollectionHolder.size size}
 *
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-iterator Kotlin Iterator
 * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list-iterator Kotlin ListIterator
 */
export interface CollectionIterator<out T = unknown, >
    extends IterableIterator<T> {

    //#region -------------------- Reference methods --------------------

    /** The {@link MinimalistCollectionHolder collection} to loop over */
    get collection(): MinimalistCollectionHolder<T>

    //#endregion -------------------- Reference methods --------------------
    //#region -------------------- Size methods --------------------

    /** The {@link collection} {@link CollectionHolder.size size} */
    get size(): this["collection"]["size"]

    /**
     * The {@link collection} {@link CollectionHolder.size size}
     *
     * @alias size
     */
    get length(): this["size"]

    /**
     * The {@link collection} {@link CollectionHolder.size size}
     *
     * @alias size
     */
    get count(): this["size"]


    /** The {@link collection} {@link CollectionHolder.isEmpty is empty} */
    get isEmpty(): boolean

    /** The {@link collection} {@link CollectionHolder.isNotEmpty is not empty} */
    get isNotEmpty(): boolean

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- End-point index methods --------------------

    /**
     * Get the first index of the {@link collection}.
     * If it is <b>null</b>, then it is empty, otherwise, it should be <b>0</b>.
     */
    get firstIndex(): NullOrZeroNumber

    /**
     * Get the last index of the {@link collection}.
     * If it is <b>null</b>, then it is empty, otherwise, it should be <code>size - 1</code>.
     */
    get lastIndex(): NullOrNumber

    //#endregion -------------------- End-point index methods --------------------

    //#region -------------------- Current methods --------------------

    /** Get the index that the {@link CollectionIterator} is at */
    get currentIndex(): NullOrNumber

    /**
     * Get the index that the {@link CollectionIterator} is at
     *
     * @alias currentIndex
     */
    get index(): NullOrNumber

    //#endregion -------------------- Current methods --------------------
    //#region -------------------- Next methods --------------------

    /** Tell if the iteration has more elements <b>after</b> the current element */
    get hasNext(): boolean

    /** Get the index that will be used at a later {@link nextValue} or {@link next} call */
    get nextIndex(): NullOrNumber

    /**
     * Retrieve the next value in the line
     *
     * @note This is the equivalent to the Java <b>ListIterator.next()</b> method
     * @throws NoElementFoundInCollectionHolderException Is at the end of the line or after it
     */
    get nextValue(): T

    /** Retrieve the next value in the line */
    next(): IteratorResult<T, AfterLastValueInCollectionIteratorSymbol>

    //#endregion -------------------- Next methods --------------------
    //#region -------------------- Previous methods --------------------

    /** Tell if the iteration has more elements <b>before</b> the current element */
    get hasPrevious(): boolean

    /**
     * Retrieve the previous value in the line
     *
     * @note This is the equivalent to the Java <b>ListIterator.previous()</b> method
     * @throws NoElementFoundInCollectionHolderException Is at the start of the line or before it
     */
    get previousValue(): T

    /** Get the index that will be used at a later {@link previousValue} or {@link previous} call */
    get previousIndex(): NullOrNumber

    /** Retrieve the previous value in the line */
    previous(): IteratorResult<T, BeforeFirstValueInCollectionIteratorSymbol>

    //#endregion -------------------- Previous methods --------------------
    //#region -------------------- Reset methods --------------------

    /** Reset the index to the initial state (current {@link currentIndex index} / {@link currentValue value} at <b>null</b>) */
    reset(): this

    //#endregion -------------------- Reset methods --------------------

    //#region -------------------- Loop methods --------------------

    /**
     * Do a certain operation for the rest of the elements in the current {@link CollectionIterator iterator}
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/on-each.html Kotlin onEach(action)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each.html Kotlin forEach(operation)
     */
    forEach(operation: ValueIndexCallback<T>,): this

    /**
     * Do a certain operation for the rest of the elements in the current {@link CollectionIterator iterator}
     *
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/on-each-indexed.html Kotlin onEachIndexed(action)
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each-indexed.html Kotlin forEachIndexed(action)
     */
    forEachIndexed(operation: IndexValueCallback<T>,): this

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Javascript methods --------------------

    /** Create a new iterator instance with the same values */
    [Symbol.iterator](): CollectionIterator<T>

    /**
     * Give an output for the call from {@link ObjectConstructor.toString.call} [object CollectionIterator] instead of [object Object]
     *
     * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/toStringTag
     * @readonly
     */
    [Symbol.toStringTag]: CollectionIteratorName

    //#endregion -------------------- Javascript methods --------------------

}

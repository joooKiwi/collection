/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {NullOrNumber} from "@joookiwi/type"

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

    //#region -------------------- Getter methods --------------------

    /** The {@link MinimalistCollectionHolder collection} to loop over */
    get collection(): MinimalistCollectionHolder<T>

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

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Current index methods --------------------

    /** Get the index that the {@link CollectionIterator} is at */
    get currentIndex(): NullOrNumber

    /**
     * Get the index that the {@link CollectionIterator} is at
     *
     * @alias currentIndex
     */
    get index(): NullOrNumber

    //#endregion -------------------- Current index methods --------------------
    //#region -------------------- Sibling index methods --------------------

    /** Get the index that will be used at a later {@link nextValue} or {@link next} call */
    get nextIndex(): NullOrNumber

    /** Get the index that will be used at a later {@link previousValue} or {@link previous} call */
    get previousIndex(): NullOrNumber

    //#endregion -------------------- Sibling index methods --------------------
    //#region -------------------- Preview methods --------------------

    /** Tell if the iteration has more elements <b>after</b> the current element */
    get hasNext(): boolean

    /** Tell if the iteration has more elements <b>before</b> the current element */
    get hasPrevious(): boolean

    //#endregion -------------------- Preview methods --------------------

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Next methods --------------------

    /** Retrieve the next value in the line */
    next(): IteratorResult<T, AfterLastValueInCollectionIteratorSymbol>

    /**
     * Retrieve the next value in the line
     *
     * @note This is the equivalent to the Java <b>ListIterator.next()</b> method
     * @throws NoElementFoundInCollectionHolderException Is at the end of the line or after it
     */
    get nextValue(): T

    //#endregion -------------------- Next methods --------------------
    //#region -------------------- Previous methods --------------------

    /** Retrieve the previous value in the line */
    previous(): IteratorResult<T, BeforeFirstValueInCollectionIteratorSymbol>

    /**
     * Retrieve the previous value in the line
     *
     * @note This is the equivalent to the Java <b>ListIterator.previous()</b> method
     * @throws NoElementFoundInCollectionHolderException Is at the start of the line or before it
     */
    get previousValue(): T

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

    //#endregion -------------------- Methods --------------------

}

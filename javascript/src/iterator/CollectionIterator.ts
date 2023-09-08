/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}                                                                                             from "../CollectionHolder"
import type {IndexValueCallback, ValueIndexCallback}                                                                       from "../CollectionHolder.types"
import type {AfterLastValueInCollectionIteratorSymbol, BeforeFirstValueInCollectionIteratorSymbol, CollectionIteratorName} from "./CollectionIterator.types"

/**
 * A simple {@link Iterator} with a known {@link CollectionHolder} {@link CollectionHolder.size size}
 *
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator Kotlin Iterator
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list-iterator Kotlin ListIterator
 */
export interface CollectionIterator<out T = unknown, >
    extends IterableIterator<T> {

    //#region -------------------- Getter methods --------------------

    /** The {@link CollectionHolder} to loop over */
    get collection(): CollectionHolder<T>

    /** The {@link collection} {@link CollectionHolder.size size} */
    get size(): this["collection"]["size"]

    /**
     * The {@link collection} {@link CollectionHolder.size size}
     *
     * @alias size
     */
    get length(): this["collection"]["size"]

    /**
     * The {@link collection} {@link CollectionHolder.size size}
     *
     * @alias size
     */
    get count(): this["collection"]["size"]


    /** Get the index that the {@link CollectionIterator} is at */
    get index(): number

    /** Get the index that will be called to a subsequent {@link next} call */
    get nextIndex(): number

    /** Get the index that will be called to a subsequent {@link previous} call */
    get previousIndex(): number


    /** Tell if the iteration has more elements */
    get hasNext(): boolean

    /** Tell if the iteration has more elements before the current element */
    get hasPrevious(): boolean

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    /** Retrieve the next value in the line */
    next(): IteratorResult<T, AfterLastValueInCollectionIteratorSymbol>

    /**
     * Retrieve the next value in the line
     *
     * @note This is the equivalent to the Java <b>ListIterator.next()</b> method
     * @throws {ReferenceError} Is at the end of the line or after it
     */
    get nextValue(): T


    /** Retrieve the previous value in the line */
    previous(): IteratorResult<T, BeforeFirstValueInCollectionIteratorSymbol>

    /**
     * Retrieve the previous value in the line
     *
     * @note This is the equivalent to the Java <b>ListIterator.previous()</b> method
     * @throws {ReferenceError} Is at the start of the line or before it
     */
    get previousValue(): T

    //#region -------------------- Loop methods --------------------

    /**
     * Do a certain operation for the rest of the elements in the current {@link CollectionIterator iterator}
     *
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/on-each.html Kotlin onEach(action)
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/for-each.html Kotlin forEach(operation)
     */
    forEach(operation: ValueIndexCallback<T>,): this

    /**
     * Do a certain operation for the rest of the elements in the current {@link CollectionIterator iterator}
     *
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/on-each-indexed.html Kotlin onEachIndexed(action)
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/for-each-indexed.html Kotlin forEachIndexed(action)
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

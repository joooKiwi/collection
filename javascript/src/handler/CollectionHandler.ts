/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {ValueHolder} from "./value/ValueHolder"

/**
 * A definition of a handler for the {@link LazyGenericCollectionHolder}
 *
 * @beta
 */
export interface CollectionHandler<out T = unknown, > {

    /**
     * Get the size of the {@link CollectionHandler handler}
     *
     * @note it can take a long time if the reference is huge
     */
    get size(): number

    /** Tell if the {@link CollectionHandler handler} is empty */
    get isEmpty(): boolean

    /** Tell if the {@link CollectionHandler handler} has at least one <b>null</b> / <b>undefined</b> value */
    get hasNull(): boolean

    /** Tell if the {@link CollectionHandler handler} has at least one duplicate value */
    get hasDuplicate(): boolean

    /** Tell if the {@link CollectionHandler handler} has finished processing the values */
    get hasFinished(): boolean


    /**
     * Get the value associated to the {@link CollectionHandler handler}
     *
     * @param index The index to retrieve
     */
    get(index: number,): ValueHolder<T>

}

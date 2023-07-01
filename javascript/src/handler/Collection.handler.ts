/******************************************************************************
 * Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi                             *
 *                                                                            *
 * This project is free to use.                                               *
 * All the right is reserved to the author of this project.                   *
 ******************************************************************************/

import type {ValueHolder} from "./ValueHolder"

/** A simple definition of a handler for the {@link LazyGenericCollectionHolder} */
export interface CollectionHandler<out T = unknown, REFERENCE extends Iterable<T> = Iterable<T>, > {

    /** The reference to iterate over or to retrieve a value */
    get reference(): REFERENCE


    /**
     * Get the size of the {@link reference}.
     *
     * Note that it can take a while if the collection is huge.
     */
    get size(): number

    /** Tell if the {@link reference} is empty */
    get isEmpty(): boolean

    /** Tell if the {@link CollectionHandler handler} has finished processing the values */
    get hasFinished(): boolean


    /**
     * Get the value associated to the {@link reference}
     *
     * @param index The index to retrieve
     */
    get(index: number,): ValueHolder<T>

}

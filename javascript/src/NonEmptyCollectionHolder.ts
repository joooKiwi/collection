/******************************************************************************
 * Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi                             *
 *                                                                            *
 * This project is free to use.                                               *
 * All the right is reserved to the author of this project.                   *
 ******************************************************************************/

import type {CollectionHolder} from "./CollectionHolder"

/** A simple complete declaration of a non-empty {@link CollectionHolder} */
export interface NonEmptyCollectionHolder<out T = unknown, >
    extends CollectionHolder<T> {

    get isEmpty(): true

    get isNotEmpty(): false

}

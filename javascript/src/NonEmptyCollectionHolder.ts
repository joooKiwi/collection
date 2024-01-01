/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}                   from "./CollectionHolder"
import type {NonEmptyMinimalistCollectionHolder} from "./NonEmptyMinimalistCollectionHolder"

/** A declaration of a non-empty {@link CollectionHolder} */
export interface NonEmptyCollectionHolder<out T = unknown, >
    extends NonEmptyMinimalistCollectionHolder<T>,
            CollectionHolder<T> {

    get isEmpty(): false

    get isNotEmpty(): true

}

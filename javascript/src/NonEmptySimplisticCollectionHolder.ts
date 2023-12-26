/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {SimplisticCollectionHolder} from "./SimplisticCollectionHolder"

/** A declaration of a non-empty {@link SimplisticCollectionHolder} */
export interface NonEmptySimplisticCollectionHolder<out T = unknown, >
    extends SimplisticCollectionHolder<T> {

    get isEmpty(): false

}

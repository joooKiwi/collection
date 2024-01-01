/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {MinimalistCollectionHolder} from "./MinimalistCollectionHolder"

/** A declaration of a non-empty {@link MinimalistCollectionHolder} */
export interface NonEmptyMinimalistCollectionHolder<out T = unknown, >
    extends MinimalistCollectionHolder<T> {

    get isEmpty(): false

}

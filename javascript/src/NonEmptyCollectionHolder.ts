/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder} from "./CollectionHolder"

/**
 * A declaration of a non-empty {@link CollectionHolder}
 *
 * @deprecated This declaration is now unused and has no effect on the CollectionHolder. It will be removed in version 1.10
 */
export interface NonEmptyCollectionHolder<out T = unknown, >
    extends CollectionHolder<T> {

    get isEmpty(): false

    get isNotEmpty(): true

}

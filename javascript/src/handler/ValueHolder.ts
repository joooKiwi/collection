/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {NullOr}                                    from "../general type"
import type {CollectionHolderIndexOutOfBoundsException} from "../exception/CollectionHolderIndexOutOfBoundsException"

export interface ValueHolder<out T = unknown, > {

    readonly value: NullOr<T>

    get cause(): NullOr<CollectionHolderIndexOutOfBoundsException>

}

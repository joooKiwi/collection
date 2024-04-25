/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {NullOr} from "@joookiwi/type"

import type {CollectionHolderIndexOutOfBoundsException} from "../../exception/CollectionHolderIndexOutOfBoundsException"
import type {ForbiddenIndexException}                   from "../../exception/ForbiddenIndexException"

export interface ValueHolder<out T = unknown, > {

    /** The value held */
    get value(): NullOr<T>

    /** Tell that the {@link value} is forbidden. Normally with a {@link ForbiddenIndexException} */
    get isForbidden(): boolean

    /** The cause to be thrown in a case of an invalid {@link value} */
    get cause(): NullOr<| CollectionHolderIndexOutOfBoundsException | ForbiddenIndexException>

}

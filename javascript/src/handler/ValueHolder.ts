/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {NullOr} from "@joookiwi/type"

import type {CollectionHolderIndexOutOfBoundsException} from "../exception/CollectionHolderIndexOutOfBoundsException"
import type {ForbiddenIndexException}                   from "../exception/ForbiddenIndexException"

export interface ValueHolder<out T = unknown, > {

    readonly value: NullOr<T>

    readonly isForbidden: boolean

    get cause(): NullOr<| CollectionHolderIndexOutOfBoundsException | ForbiddenIndexException>

}

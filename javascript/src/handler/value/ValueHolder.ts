//··························································
// Copyright (c) 2023-2026. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import type {NullOr} from "@joookiwi/type"

import type {ForbiddenIndexException}   from "../../exception/ForbiddenIndexException"
import type {IndexOutOfBoundsException} from "../../exception/IndexOutOfBoundsException"

/**
 * A holder to have a singular {@link value}
 * and tell if it is valid via its {@link isForbidden} or {@link cause} getter methods
 *
 * @beta
 */
export interface ValueHolder<out T = unknown, > {

    /** The value held */
    get value(): NullOr<T>

    /** Tell that the {@link value} is forbidden. Normally with a {@link ForbiddenIndexException} */
    get isForbidden(): boolean

    /** The cause to be thrown in a case of an invalid {@link value} */
    get cause(): NullOr<| IndexOutOfBoundsException | ForbiddenIndexException>

}

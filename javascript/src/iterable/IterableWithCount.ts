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

//TODO move in a separate project

/** An {@link Iterable} with a count field */
export interface IterableWithCount<out T, >
    extends Iterable<T, unknown, unknown> {

    /** The value equivalent to the amount of iteration to do */
    readonly count: number

}

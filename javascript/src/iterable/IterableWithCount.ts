/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

//TODO move in a separate project

/** An {@link Iterable} with a count field */
export interface IterableWithCount<out T, >
    extends Iterable<T> {

    /** The value equivalent to the amount of iteration to do */
    readonly count: number

}

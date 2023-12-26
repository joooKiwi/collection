/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

//TODO move in a separate project

/** An {@link Iterable} with a length field */
export interface IterableWithLength<out T, >
    extends Iterable<T> {

    /** The value equivalent to the amount of iteration to do */
    readonly length: number

}

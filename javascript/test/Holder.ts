/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

/** A class made to hold the necessary values for the tests */
export class Holder<const T, const MESSAGE extends string, > {

    readonly toString

    public constructor(
        /** The value to send to any {@link CollectionHolder} implementation */
        public readonly value: T,
        message: MESSAGE,
    ) {
        this.toString = () => message
    }

}

/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

/** A class made to hold the necessary values for the tests */
export class Holder<const T, const MESSAGE extends string, > {

    public constructor(
        /** The value to send to any {@link CollectionHolder} implementation */
        public readonly value: T,
        /** The message that will be sent to the {@link toString} method */
        public readonly message: MESSAGE,
    ) {}

    public toString(): MESSAGE {
        return this.message
    }

}

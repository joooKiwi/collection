/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullOr, PossibleNumeric} from "../general type"

import {CollectionHolderIndexOutOfBoundsException} from "./CollectionHolderIndexOutOfBoundsException"

/**
 * An exception made to tell that the {@link CollectionHolder collection}
 * was empty while not being expected to be empty
 */
export class EmptyCollectionHolderException<const T extends NullOr<PossibleNumeric> = null,
    const out CAUSE extends Error = never, >
    extends CollectionHolderIndexOutOfBoundsException<T, CAUSE> {

    public constructor(message: string, invalidIndex: T = null as T, cause?: Nullable<CAUSE>,) {
        super(message, invalidIndex, cause,)
    }

}

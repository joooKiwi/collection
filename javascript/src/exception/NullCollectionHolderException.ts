/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullableString, NullOr, NumericOrObject} from "@joookiwi/type"

import {EmptyCollectionHolderException} from "./EmptyCollectionHolderException"

export class NullCollectionHolderException<const T extends NullOr<NumericOrObject> = null,
    const CAUSE extends Error = never, >
    extends EmptyCollectionHolderException<T, CAUSE> {

    public constructor(message?: NullableString, invalidIndex?: T, cause?: Nullable<CAUSE>,) {
        super(message ?? "Null collection. No element at any index could be found since it is null.", invalidIndex, cause,)
    }
}

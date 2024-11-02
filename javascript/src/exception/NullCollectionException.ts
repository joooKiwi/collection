/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullableString, NullOr, NumericOrObject} from "@joookiwi/type"

import {EmptyCollectionException} from "./EmptyCollectionException"

/**
 * An {@link Error exception} made to tell that the {@code collection}
 * was <b>null</b> or <b>undefined</b> while not being expected to be
 */
export class NullCollectionException<const T extends NullOr<NumericOrObject> = null,
    const CAUSE extends Error = never, >
    extends EmptyCollectionException<T, CAUSE> {

    public constructor(message?: NullableString, invalidIndex?: T, cause?: Nullable<CAUSE>,) {
        super(message ?? "Null collection. No element at any index could be found since it is null.", invalidIndex, cause,)
    }

}

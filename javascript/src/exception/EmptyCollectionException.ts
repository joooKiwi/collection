//··························································
// Copyright (c) 2023-2025. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import type {Nullable, NullableString, NullOr, NumericOrObject} from "@joookiwi/type"

import {IndexOutOfBoundsException} from "./IndexOutOfBoundsException"

/**
 * An {@link Error exception} made to tell that the {@link CollectionHolder collection}
 * was empty while not being expected to be empty
 */
export class EmptyCollectionException<const T extends NullOr<NumericOrObject> = null,
    const CAUSE extends Error = never, >
    extends IndexOutOfBoundsException<T, CAUSE> {

    public constructor(message?: NullableString, invalidIndex: T = null as T, cause?: Nullable<CAUSE>,) {
        super(message ?? "Empty collection. No element at any index could be found since it it empty.", invalidIndex, cause,)
    }

}

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

import type {Nullable, NullableString, NullOr, NumericOrObject} from "@joookiwi/type"

import {EmptyCollectionException} from "./EmptyCollectionException"

/**
 * An {@link Error exception} made to tell that the <code>collection</code>
 * was <b>null</b> or <b>undefined</b> while not being expected to be
 */
export class NullCollectionException<const T extends NullOr<NumericOrObject> = null,
    const CAUSE extends Error = never, >
    extends EmptyCollectionException<T, CAUSE> {

    /**
     * The default message that is used in the {@link constructor} when the message is <code>null</code>
     *
     * @see CollectionConstants.NULL_COLLECTION_MESSAGE
     */
    public static override readonly DEFAULT_MESSAGE: string = "Null collection. No element at any index could be found since it is null."

    public constructor(message?: NullableString, invalidIndex?: T, cause?: Nullable<CAUSE>,) {
        super(message ?? "Null collection. No element at any index could be found since it is null.", invalidIndex, cause,)
    }

}

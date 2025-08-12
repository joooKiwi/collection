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

import type {MinimalistCollectionHolder} from "../../MinimalistCollectionHolder"

import {GenericCollectionIteratorValue} from "./GenericCollectionIteratorValue"

/** @deprecated Change with {@link GenericCollectionIteratorValue}. This will be removed in v1.14 */
export class GenericIteratorValue<const T = unknown,
    const COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>,
    const INDEX extends number = number, >
    extends GenericCollectionIteratorValue<T, never, COLLECTION, INDEX> {


    public constructor(collection: COLLECTION, index: INDEX) {
        super(null as unknown as never, collection, index)
    }

}

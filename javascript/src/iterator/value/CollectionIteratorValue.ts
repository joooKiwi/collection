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

import type {CollectionHolder}    from "../../CollectionHolder"
import type {InsideIteratorValue} from "./InsideIteratorValue"

/**
 * An {@link IteratorValue iterator value} made to retrieve a {@link value}
 * from a {@link collection} using its {@link index}
 *
 * @typeParam T The element type (`unknown` by default)
 * @see GenericCollectionIteratorValue
 */
export interface CollectionIteratorValue<out T = unknown, >
    extends InsideIteratorValue<T> {

    /** The {@link MinimalistCollectionHolder collection} to use in the {@link CollectionIteratorValue.value get value} */
    readonly collection: CollectionHolder<T>


    /** The index to retrieve in the {@link collection} by the {@link CollectionIteratorValue.value get value} */
    readonly index: number

}

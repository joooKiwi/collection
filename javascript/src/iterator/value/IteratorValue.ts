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

/**
 * An {@link IteratorYieldResult iterator value} made to retrieve a {@link value}
 * from a {@link collection} using its {@link index}
 *
 * @see GenericIteratorValue
 */
export interface IteratorValue<out T = unknown, >
    extends IteratorYieldResult<T> {

    /** The {@link MinimalistCollectionHolder collection} to use in the {@link value get value} */
    get collection(): MinimalistCollectionHolder<T>

    /** The index to retrieve in the {@link collection} by the {@link value get value} */
    get index(): number


    /** Tell that the iterator container is not done yet */
    get done(): false

    /** The value to retrieve by the iterator */
    get value(): T

}

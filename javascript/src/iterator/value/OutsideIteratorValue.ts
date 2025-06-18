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

import {IteratorValue} from "./IteratorValue"

/**
 * An {@link IteratorValue iterator value} made to retrieve a consistent value
 * when it is outside a {@link CollectionIterator} range
 *
 * @see GenericBeforeFirstIteratorValue
 * @see GenericAfterLastIteratorValue
 */
export interface OutsideIteratorValue<out T extends symbol = symbol, >
    extends IteratorValue<T>,
            IteratorReturnResult<T> {

    /** Tell that the {@link OutsideIteratorValue iterator value} has nothing to do anymore */
    isDone(): true

    /**
     * Tell that the {@link OutsideIteratorValue iterator value} has nothing to do anymore
     *
     * @alias OutsideIteratorValue.isDone
     */
    get done(): true


    /** The consistent value retrieved */
    get value(): T

}

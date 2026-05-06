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

import type {IteratorValue} from "./IteratorValue"

/**
 * An {@link IteratorValue} made to retrieve a consistent value
 * when it is inside a {@link CollectionIterator} range
 *
 * @typeParam T The element type
 * @see GenericCollectionIteratorValue
 * @see IteratorValueOf1
 * @see IteratorValueOf1On2
 * @see IteratorValueOf2On2
 */
export interface InsideIteratorValue<out T, >
    extends IteratorValue<T>,
            IteratorYieldResult<T> {

    /** The index associated to the value */
    readonly index: number


    /** Tell that the {@link InsideIteratorValue iterator value} is able to progress (<i>at the moment of its creation</i>) */
    isDone(): false

    /**
     * Tell that the {@link InsideIteratorValue iterator value} is able to progress (<i>at the moment of its creation</i>)
     *
     * @alias InsideIteratorValue.isDone
     */
    readonly done: false

    /** Tell that the {@link InsideIteratorValue iterator value} is <b>not</b> able to progress (<i>at the moment of its creation</i>) */
    isNotDone(): true


    /** The value to retrieve by the iterator */
    readonly value: T

}

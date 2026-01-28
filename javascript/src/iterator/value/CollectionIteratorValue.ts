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

import type {MinimalistCollectionHolder} from "../../MinimalistCollectionHolder"
import type {IteratorValue}              from "./IteratorValue"

/**
 * An {@link IteratorValue iterator value} made to retrieve a {@link value}
 * from a {@link collection} using its {@link index}
 *
 * @see GenericCollectionIteratorValue
 */
export interface CollectionIteratorValue<out T = unknown, >
    extends IteratorValue<T>,
            IteratorYieldResult<T> {

    /** The {@link MinimalistCollectionHolder collection} to use in the {@link CollectionIteratorValue.value get value} */
    get collection(): MinimalistCollectionHolder<T>


    /** The index to retrieve in the {@link collection} by the {@link CollectionIteratorValue.value get value} */
    get index(): number


    /** Tell that the {@link CollectionIteratorValue iterator value} is able to progress (<i>at the moment of its creation</i>) */
    isDone(): false

    /**
     * Tell that the {@link CollectionIteratorValue iterator value} is able to progress (<i>at the moment of its creation</i>)
     *
     * @alias CollectionIteratorValue.isDone
     */
    get done(): false

    /** Tell that the {@link CollectionIteratorValue iterator value} is <b>not</b> able to progress (<i>at the moment of its creation</i>) */
    isNotDone(): true


    /** The value to retrieve by the iterator */
    get value(): T

}

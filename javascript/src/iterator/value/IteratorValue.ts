/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {SimplisticCollectionHolder} from "../../SimplisticCollectionHolder"

/**
 * An {@link IteratorYieldResult iterator value} made to retrieve a {@link value}
 * from a {@link collection} using its {@link index}
 *
 * @see GenericIteratorValue
 */
export interface IteratorValue<out T = unknown, >
    extends IteratorYieldResult<T> {

    /** The {@link SimplisticCollectionHolder collection} to use in the {@link value get value} */
    get collection(): SimplisticCollectionHolder<T>

    /** The index to retrieve in the {@link collection} by the {@link value get value} */
    get index(): number


    /** Tell that the iterator container is not done yet */
    get done(): false

    /** The value to retrieve by the iterator */
    get value(): T

}

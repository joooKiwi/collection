/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}            from "../src/CollectionHolder"
import type {GenericCollectionHolder}     from "../src/GenericCollectionHolder"
import type {LazyGenericCollectionHolder} from "../src/LazyGenericCollectionHolder"
import type {PossibleIterable}            from "../src/iterable/types"
import type {CollectionIterator}          from "../src/iterator/CollectionIterator"

/** A simple type to create the possible {@link Iterable} for the {@link newCollectionInstanceFromCallback} method */
type IterableCreation = (array: readonly any[],) => | Array<any> | Set<any> | PossibleIterable<any> | CollectionIterator<any> | CollectionHolder<any>

/**
 * Create a new {@link CollectionHolder} based on the {@link instance},
 * {@link iterableCreationCallback iterable creation callback} and an {@link array}
 *
 * @param instance The instance to create to receive the {@link iterableCreationCallback}
 * @param iterableCreationCallback The iterable creation callback to receive the {@link array}
 * @param array The array to send to the {@link iterableCreationCallback}
 */
export function newCollectionInstanceFromCallback<const T = unknown, >(instance: | typeof GenericCollectionHolder | typeof LazyGenericCollectionHolder,
                                                                       iterableCreationCallback: IterableCreation,
                                                                       array: readonly T[],): CollectionHolder<T> {
    // @ts-ignore
    return new instance(iterableCreationCallback(array,),)
}
/**
 * Create a new {@link CollectionHolder} based on the {@link instance} and an {@link array}
 *
 * @param instance The instance to create to receive the {@link array}
 * @param array The array to sent to the {@link instance}
 */
export function newCollectionInstance<const T = unknown, >(instance: | typeof GenericCollectionHolder | typeof LazyGenericCollectionHolder,
                                                           array: readonly T[],): CollectionHolder<T> {
    // @ts-ignore
    return new instance(array,)
}

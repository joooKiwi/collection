/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}                    from "../src/CollectionHolder"
import type {PossibleCollectionHolderConstructor} from "../src/CollectionHolder.types"
import {GenericMinimalistCollectionHolder}        from "../src/GenericMinimalistCollectionHolder"
import type {MinimalistCollectionHolder}          from "../src/MinimalistCollectionHolder"
import type {PossibleIterable}                    from "../src/iterable/types"
import type {CollectionIterator}                  from "../src/iterator/CollectionIterator"

/** A type to create the possible {@link Iterable} for the {@link newCollectionInstanceFromCallback} method */
type IterableCreation = (array: readonly any[],) => | Array<any> | Set<any> | PossibleIterable<any> | CollectionIterator<any> | CollectionHolder<any>

/**
 * Create a new {@link CollectionHolder} based on the {@link instance},
 * {@link iterableCreationCallback iterable creation callback} and an {@link array}
 *
 * @param instance The instance to create to receive the {@link iterableCreationCallback}
 * @param iterableCreationCallback The iterable creation callback to receive the {@link array}
 * @param array The array to send to the {@link iterableCreationCallback}
 * @note Even though the {@link GenericMinimalistCollectionHolder} is invalid, it does not validate the type, it is only there to satisfy typescript
 */
export function newCollectionInstanceFromCallback<const T = unknown, >(instance: PossibleCollectionHolderConstructor,
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
 * @note Even though the {@link GenericMinimalistCollectionHolder} is invalid, it does not validate the type, it is only there to satisfy typescript
 */
export function newCollectionInstance<const T = unknown, >(instance: PossibleCollectionHolderConstructor,
                                                           array: readonly T[],): CollectionHolder<T> {
    // @ts-ignore
    return new instance(array,)
}

/**
 * Create a new {@link MinimalistCollectionHolder} based on the {@link instance} and an {@link array}
 *
 * @param instance The instance to create to receive the {@link array}
 * @param array The array to send to the {@link instance}
 */
export function newMinimalistCollectionInstance<const T = unknown, >(instance: PossibleCollectionHolderConstructor,
                                                                     array: readonly T[],): MinimalistCollectionHolder<T> {
    // @ts-ignore
    return new instance(array,)
}

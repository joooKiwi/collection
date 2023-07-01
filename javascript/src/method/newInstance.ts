/*
 * Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi
 *
 * This project is free to use.
 * All the right is reserved to the author of this project.
 */

import type {CollectionHolder}            from "../CollectionHolder"
import type {CollectionHolderConstructor} from "../CollectionHolderConstructor"

/**
 * Create a new {@link CollectionHolder} from a constructor and an {@link ReadonlyArray array}
 *
 * @param constructorInstance The constructor instance
 * @param iterable The {@link ReadonlyArray array} to send
 */
export function newInstance<const T, >(constructorInstance: CollectionHolderConstructor<T>, iterable: readonly T[],): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from a constructor and an {@link ReadonlySet set}
 *
 * @param constructorInstance The constructor instance
 * @param iterable The {@link ReadonlySet set} to send
 */
export function newInstance<const T, >(constructorInstance: CollectionHolderConstructor<T>, iterable: ReadonlySet<T>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from a constructor and an {@link Iterable}
 *
 * @param constructorInstance The constructor instance
 * @param iterable The {@link Iterable} to send
 */
export function newInstance<const T, >(constructorInstance: CollectionHolderConstructor<T>, iterable: Iterable<T>,): CollectionHolder<T>
export function newInstance<const T, >(constructorInstance: CollectionHolderConstructor<T>, iterable: Iterable<T>,): CollectionHolder<T> {
    return new constructorInstance(iterable,)
}

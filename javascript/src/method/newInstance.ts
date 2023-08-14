/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}            from "../CollectionHolder"
import type {CollectionHolderConstructor} from "../CollectionHolderConstructor"

/**
 * Create a new {@link CollectionHolder} from a constructor and an {@link ReadonlyArray array}
 *
 * @param constructorInstance The constructor instance
 * @param array The {@link ReadonlyArray array} to send
 */
export function newInstance<const T, >(constructorInstance: CollectionHolderConstructor<T>, array: readonly T[],): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from a constructor and a callback returning an {@link ReadonlyArray array}
 *
 * @param constructorInstance The constructor instance
 * @param lateArray The callback returning an {@link ReadonlyArray array} to send
 */
export function newInstance<const T, >(constructorInstance: CollectionHolderConstructor<T>, lateArray: () => readonly T[],): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from a constructor and a {@link ReadonlySet set}
 *
 * @param constructorInstance The constructor instance
 * @param set The {@link ReadonlySet set} to send
 */
export function newInstance<const T, >(constructorInstance: CollectionHolderConstructor<T>, set: ReadonlySet<T>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from a constructor and a callback returning a {@link ReadonlySet set}
 *
 * @param constructorInstance The constructor instance
 * @param lateSet The callback returning a {@link ReadonlySet set} to send
 */
export function newInstance<const T, >(constructorInstance: CollectionHolderConstructor<T>, lateSet: () => ReadonlySet<T>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from a constructor and an {@link Iterable}
 *
 * @param constructorInstance The constructor instance
 * @param iterable The {@link Iterable} to send
 */
export function newInstance<const T, >(constructorInstance: CollectionHolderConstructor<T>, iterable: Iterable<T>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from a constructor and a callback returning an {@link Iterable}
 *
 * @param constructorInstance The constructor instance
 * @param lateIterable The callback returning an {@link Iterable} to send
 */
export function newInstance<const T, >(constructorInstance: CollectionHolderConstructor<T>, lateIterable: () => Iterable<T>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from a constructor and a callback
 * returning an {@link Iterable} or a {@link Iterable directly}
 *
 * @param constructorInstance The constructor instance
 * @param iterable The callback returning an {@link Iterable} or the {@link Iterable} directly to send
 */
export function newInstance<const T, >(constructorInstance: CollectionHolderConstructor<T>, iterable: | Iterable<T> | (() => Iterable<T>),): CollectionHolder<T>
export function newInstance<const T, >(constructorInstance: CollectionHolderConstructor<T>, iterable: | Iterable<T> | (() => Iterable<T>),): CollectionHolder<T> {
    return new constructorInstance(iterable,)
}

/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}            from "../CollectionHolder"
import type {CollectionHolderConstructor} from "../CollectionHolderConstructor"
import type {IterableWithSize}            from "../iterable/IterableWithSize"
import type {IterableWithCount}           from "../iterable/IterableWithCount"
import type {IterableWithLength}          from "../iterable/IterableWithLength"
import type {IterableWithPossibleSize}    from "../iterable/IterableWithPossibleSize"
import type {CollectionIterator}          from "../iterator/CollectionIterator"

/**
 * Create a new {@link CollectionHolder} from a constructor and an {@link ReadonlyArray array}
 *
 * @param constructorInstance The constructor instance
 * @param array The {@link ReadonlyArray array} to send
 * @deprecated Use the direct construction instead
 */
export function newInstance<const T, >(constructorInstance: CollectionHolderConstructor<T>, array: readonly T[],): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from a constructor and a callback returning an {@link ReadonlyArray array}
 *
 * @param constructorInstance The constructor instance
 * @param lateArray The callback returning an {@link ReadonlyArray array} to send
 * @deprecated Use the direct construction instead
 */
export function newInstance<const T, >(constructorInstance: CollectionHolderConstructor<T>, lateArray: () => readonly T[],): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from a constructor and a {@link ReadonlySet set}
 *
 * @param constructorInstance The constructor instance
 * @param set The {@link ReadonlySet set} to send
 * @deprecated Use the direct construction instead
 */
export function newInstance<const T, >(constructorInstance: CollectionHolderConstructor<T>, set: ReadonlySet<T>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from a constructor and a callback returning a {@link ReadonlySet set}
 *
 * @param constructorInstance The constructor instance
 * @param lateSet The callback returning a {@link ReadonlySet set} to send
 * @deprecated Use the direct construction instead
 */
export function newInstance<const T, >(constructorInstance: CollectionHolderConstructor<T>, lateSet: () => ReadonlySet<T>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from a constructor and a {@link CollectionIterator iterator}
 *
 * @param constructorInstance The constructor instance
 * @param collectionIterator The {@link CollectionIterator iterator} to send
 * @deprecated Use the direct construction instead
 */
export function newInstance<const T, >(constructorInstance: CollectionHolderConstructor<T>, collectionIterator: CollectionIterator<T>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from a constructor and a callback returning a {@link CollectionIterator iterator}
 *
 * @param constructorInstance The constructor instance
 * @param lateCollectionIterator The callback returning {@link CollectionIterator iterator} to send
 * @deprecated Use the direct construction instead
 */
export function newInstance<const T, >(constructorInstance: CollectionHolderConstructor<T>, lateCollectionIterator: () => CollectionIterator<T>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from a constructor and an {@link IterableWithSize iterable}
 *
 * @param constructorInstance The constructor instance
 * @param iterable The {@link IterableWithSize iterable} to send
 * @deprecated Use the direct construction instead
 */
export function newInstance<const T, >(constructorInstance: CollectionHolderConstructor<T>, iterable: IterableWithSize<T>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from a constructor and an {@link IterableWithLength iterable}
 *
 * @param constructorInstance The constructor instance
 * @param iterable The {@link IterableWithLength iterable} to send
 * @deprecated Use the direct construction instead
 */
export function newInstance<const T, >(constructorInstance: CollectionHolderConstructor<T>, iterable: IterableWithLength<T>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from a constructor and an {@link IterableWithCount iterable}
 *
 * @param constructorInstance The constructor instance
 * @param iterable The {@link IterableWithCount iterable} to send
 * @deprecated Use the direct construction instead
 */
export function newInstance<const T, >(constructorInstance: CollectionHolderConstructor<T>, iterable: IterableWithCount<T>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from a constructor and an {@link IterableWithPossibleSize iterable}
 *
 * @param constructorInstance The constructor instance
 * @param iterable The {@link IterableWithPossibleSize iterable} to send
 * @deprecated Use the direct construction instead
 */
export function newInstance<const T, >(constructorInstance: CollectionHolderConstructor<T>, iterable: IterableWithPossibleSize<T>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from a constructor and an {@link Iterable iterable}
 *
 * @param constructorInstance The constructor instance
 * @param iterable The {@link Iterable iterable} to send
 * @deprecated Use the direct construction instead
 */
export function newInstance<const T, >(constructorInstance: CollectionHolderConstructor<T>, iterable: Iterable<T>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from a constructor and a callback returning an {@link IterableWithSize iterable}
 *
 * @param constructorInstance The constructor instance
 * @param lateIterable The callback returning an {@link IterableWithSize iterable} to send
 * @deprecated Use the direct construction instead
 */
export function newInstance<const T, >(constructorInstance: CollectionHolderConstructor<T>, lateIterable: () => IterableWithSize<T>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from a constructor and a callback returning an {@link IterableWithLength iterable}
 *
 * @param constructorInstance The constructor instance
 * @param lateIterable The callback returning an {@link IterableWithLength iterable} to send
 * @deprecated Use the direct construction instead
 */
export function newInstance<const T, >(constructorInstance: CollectionHolderConstructor<T>, lateIterable: () => IterableWithLength<T>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from a constructor and a callback returning an {@link IterableWithCount iterable}
 *
 * @param constructorInstance The constructor instance
 * @param lateIterable The callback returning an {@link IterableWithCount iterable} to send
 * @deprecated Use the direct construction instead
 */
export function newInstance<const T, >(constructorInstance: CollectionHolderConstructor<T>, lateIterable: () => IterableWithCount<T>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from a constructor and a callback returning an {@link IterableWithPossibleSize iterable}
 *
 * @param constructorInstance The constructor instance
 * @param lateIterable The callback returning an {@link IterableWithPossibleSize iterable} to send
 * @deprecated Use the direct construction instead
 */
export function newInstance<const T, >(constructorInstance: CollectionHolderConstructor<T>, lateIterable: () => IterableWithPossibleSize<T>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from a constructor and a callback returning an {@link Iterable}
 *
 * @param constructorInstance The constructor instance
 * @param lateIterable The callback returning an {@link Iterable} to send
 * @deprecated Use the direct construction instead
 */
export function newInstance<const T, >(constructorInstance: CollectionHolderConstructor<T>, lateIterable: () => Iterable<T>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from a constructor and a callback
 * returning an {@link Iterable} or a {@link Iterable directly}
 *
 * @param constructorInstance The constructor instance
 * @param iterable The callback returning an {@link Iterable} or the {@link Iterable} directly to send
 * @typescriptDefinition
 * @deprecated Use the direct construction instead
 */
export function newInstance<const T, >(constructorInstance: CollectionHolderConstructor<T>, iterable: | Iterable<T> | (() => Iterable<T>),): CollectionHolder<T>
export function newInstance<const T, >(constructorInstance: CollectionHolderConstructor<T>, iterable: | Iterable<T> | (() => Iterable<T>),): CollectionHolder<T> {
    return new constructorInstance(iterable,)
}

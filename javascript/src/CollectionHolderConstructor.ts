/******************************************************************************
 * Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi                             *
 *                                                                            *
 * This project is free to use.                                               *
 * All the right is reserved to the author of this project.                   *
 ******************************************************************************/

import type {CollectionHolder}         from "./CollectionHolder"
import type {IterableWithCount}        from "./iterable/IterableWithCount"
import type {IterableWithLength}       from "./iterable/IterableWithLength"
import type {IterableWithPossibleSize} from "./iterable/IterableWithPossibleSize"
import type {IterableWithSize}         from "./iterable/IterableWithSize"
import type {CollectionIterator}       from "./iterator/CollectionIterator"

/** The general description of a simple {@link CollectionHolder} constructor */
export interface CollectionHolderConstructor<T = unknown, > {

    //#region -------------------- new(array) --------------------

    /**
     * Create a new {@link CollectionHolder} from an {@link ReadonlyArray array}
     *
     * @param array The array to retrieve its values
     */
    new(array: readonly T[],): CollectionHolder<T>

    /**
     * Create a new {@link CollectionHolder} from an {@link ReadonlyArray array} callback
     *
     * @param lateArray The callback returning an {@link ReadonlyArray array} to retrieve its values
     */
    new(lateArray: () => readonly T[],): CollectionHolder<T>

    //#endregion -------------------- new(array) --------------------
    //#region -------------------- new(set) --------------------

    /**
     * Create a new {@link CollectionHolder} from a {@link ReadonlySet set}
     *
     * @param set The set to retrieve its values
     */
    new(set: ReadonlySet<T>,): CollectionHolder<T>

    /**
     * Create a new {@link CollectionHolder} from a {@link ReadonlySet set} callback
     *
     * @param lateSet The callback returning a {@link ReadonlySet set} to retrieve its values
     */
    new(lateSet: () => ReadonlySet<T>,): CollectionHolder<T>

    //#endregion -------------------- new(set) --------------------
    //#region -------------------- new(collection) --------------------

    /**
     * Create a new {@link CollectionHolder} from an {@link CollectionHolder}
     *
     * @param collectionHolder The collection holder to retrieve its values
     */
    new(collectionHolder: CollectionHolder<T>,): CollectionHolder<T>

    /**
     * Create a new {@link CollectionHolder} from an {@link CollectionHolder} callback
     *
     * @param lateCollectionHolder The callback returning a {@link CollectionHolder collection} to retrieve its values
     */
    new(lateCollectionHolder: () => CollectionHolder<T>,): CollectionHolder<T>

    //#endregion -------------------- new(collection) --------------------
    //#region -------------------- new(iterable) --------------------

    //#region -------------------- new(collection iterable) --------------------

    /**
     * Create a new {@link CollectionHolder} from an {@link CollectionIterator iterable}
     * made for a {@link CollectionHolder collection}
     *
     * @param collectionIterable The iterable to loop over its values
     */
    new(collectionIterable: CollectionIterator<T>,): CollectionHolder<T>

    /**
     * Create a new {@link CollectionHolder} from an {@link CollectionIterator iterable} callback
     *
     * @param lateCollectionIterable The callback returning an {@link CollectionIterator iterable} to loop over its values
     */
    new(lateCollectionIterable: () => CollectionIterator<T>,): CollectionHolder<T>

    //#endregion -------------------- new(collection iterable) --------------------
    //#region -------------------- new(iterable with size) --------------------

    /**
     * Create a new {@link CollectionHolder} from an {@link IterableWithSize iterable}
     * with a {@link IterableWithSize.size known size}
     *
     * @param iterableWithSize The iterable to loop over its values
     */
    new(iterableWithSize: IterableWithSize<T>,): CollectionHolder<T>

    /**
     * Create a new {@link CollectionHolder} from an {@link IterableWithSize iterable} callback
     *
     * @param lateIterableWithSize The callback returning an {@link IterableWithSize iterable} to loop over its values
     */
    new(lateIterableWithSize: () => IterableWithSize<T>,): CollectionHolder<T>

    //#endregion -------------------- new(iterable with size) --------------------
    //#region -------------------- new(iterable with length) --------------------

    /**
     * Create a new {@link CollectionHolder} from an {@link IterableWithLength iterable}
     * with a {@link IterableWithLength.length known length (size)}
     *
     * @param iterableWithLength The iterable to loop over its values
     */
    new(iterableWithLength: IterableWithLength<T>,): CollectionHolder<T>

    /**
     * Create a new {@link CollectionHolder} from an {@link IterableWithLength iterable} callback
     *
     * @param lateIterableWithLength The callback returning an {@link IterableWithLength iterable} to loop over its values
     */
    new(lateIterableWithLength: () => IterableWithLength<T>,): CollectionHolder<T>

    //#endregion -------------------- new(iterable with length) --------------------
    //#region -------------------- new(iterable with count) --------------------

    /**
     * Create a new {@link CollectionHolder} from an {@link IterableWithCount iterable}
     * with a {@link IterableWithCount.count known count (size)}
     *
     * @param iterableWithCount The iterable to loop over its values
     */
    new(iterableWithCount: IterableWithCount<T>,): CollectionHolder<T>

    /**
     * Create a new {@link CollectionHolder} from an {@link IterableWithCount iterable} callback
     *
     * @param lateIterableWithCount The callback returning an {@link IterableWithCount iterable} to loop over its values
     */
    new(lateIterableWithCount: () => IterableWithCount<T>,): CollectionHolder<T>

    //#endregion -------------------- new(iterable with length) --------------------
    //#region -------------------- new(iterable with possible size) --------------------

    /**
     * Create a new {@link CollectionHolder} from an {@link IterableWithPossibleSize iterable}
     * with a possible size ({@link IterableWithPossibleSize.size size}, {@link IterableWithPossibleSize.length length}
     * or {@link IterableWithPossibleSize.count count})
     *
     * @param iterableWithPossibleSize The iterable to loop over its values
     */
    new(iterableWithPossibleSize: IterableWithPossibleSize<T>,): CollectionHolder<T>

    /**
     * Create a new {@link CollectionHolder} from an {@link IterableWithPossibleSize iterable} callback
     *
     * @param lateIterableWithPossibleSize The callback returning an {@link IterableWithPossibleSize iterable} to loop over its values
     */
    new(lateIterableWithPossibleSize: () => IterableWithPossibleSize<T>,): CollectionHolder<T>

    //#endregion -------------------- new(iterable with possible size) --------------------

    /**
     * Create a new {@link CollectionHolder} from an {@link Iterable iterable}
     *
     * @param iterable The iterable to loop over its values
     */
    new(iterable: Iterable<T>,): CollectionHolder<T>

    /**
     * Create a new {@link CollectionHolder} from an {@link Iterable iterable} callback
     *
     * @param lateIterable The callback returning an {@link Iterable iterable} to loop over its values
     */
    new(lateIterable: () => Iterable<T>,): CollectionHolder<T>

    /**
     * Create a new {@link CollectionHolder} from an {@link Iterable iterable} callback
     *
     * @param iterable The callback returning an {@link Iterable iterable} or the {@link Iterable iterable} itself to loop over its values
     */
    new(iterable: | Iterable<T> | (() => Iterable<T>),): CollectionHolder<T>

    //#endregion -------------------- new(iterable) --------------------

}

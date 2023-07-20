/******************************************************************************
 * Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi                             *
 *                                                                            *
 * This project is free to use.                                               *
 * All the right is reserved to the author of this project.                   *
 ******************************************************************************/

import type {CollectionHolder} from "./CollectionHolder"

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

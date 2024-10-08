/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}                from "../../src/CollectionHolder"
import type {StraightCollectionHolderForTest} from "./StraightCollectionHolderForTest"

/**
 * A {@link StraightCollectionHolderForTest} that has more utility methods
 * and is watching the amount of time {@link get} is being called for the tests
 */
export interface CollectionHolderForTest<out T, >
    extends StraightCollectionHolderForTest<T> {

    /**
     * Do an action on the curent {@link CollectionHolderForTest instance}
     * while ignoring any {@link CollectionHolderIndexOutOfBoundsException} being thrown
     * and return itself afterward
     *
     * @param action The action to do
     */
    executeWhileIgnoringIndexOutOfBound(action: (instance: this,) => void,): this

    /**
     * Do an action on the curent {@link CollectionHolderForTest instance}
     * while ignoring any {@link EmptyCollectionHolderException} being thrown
     * and return itself afterward
     *
     * @param action The action to do
     */
    executeWhileIgnoringEmptyException(action: (instance: this,) => void,): this

    /**
     * Do an action on the curent {@link CollectionHolderForTest instance}
     * while ignoring any {@link ForbiddenIndexException} being thrown
     * and return itself afterward
     *
     * @param action The action to do
     */
    executeWhileIgnoringForbiddenException(action: (instance: this,) => void,): this

    /**
     * Do an action on the current {@link CollectionHolderForTest instance}
     * and have the index being present on the returned {@link CollectionHolder collection} on the action
     * and return itself afterward
     *
     * @param action The action to do
     */
    executeWhileHavingIndexesOnField<const U, >(action: (instance: this,) => CollectionHolder<U>,): this

    /**
     * Do an action on the current {@link CollectionHolderForTest instance}
     * and have the index being present on the returned {@link CollectionHolder collection}
     * after the action
     *
     * @param action The action to do
     */
    executeToHaveIndexesOnField<const U, >(action: (instance: this,) => CollectionHolder<U>,): CollectionHolder<U>

}

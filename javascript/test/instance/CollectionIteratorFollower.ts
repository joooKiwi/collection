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

import type {CollectionIterator} from "../../src/iterator/CollectionIterator"

/**
 * A {@link CollectionIterator} having the utility to follow every non-aliased methods that have an alias
 */
export interface CollectionIteratorFollower<out T, >
    extends CollectionIterator<T> {

    /**
     * Do an action on the curent {@link CollectionIteratorFollower instance}
     * and return itself afterward
     *
     * @param action The action to do
     */
    execute(action: (instance: this,) => void,): this


    /** The amount of time {@link CollectionIterator.size} has been called */
    readonly size_amountOfCall: number

    /** The amount of time {@link CollectionIterator.isEmpty} has been called */
    readonly isEmpty_amountOfCall: number
    /** The amount of time {@link CollectionIterator.isNotEmpty} has been called */
    readonly isNotEmpty_amountOfCall: number

    /** The amount of time {@link CollectionIterator.hasExactly1Element} has been called */
    readonly hasExactly1Element_amountOfCall: number
    /** The amount of time {@link CollectionIterator.hasAtMost1Element} has been called */
    readonly hasAtMost1Element_amountOfCall: number

    /** The amount of time {@link CollectionIterator.hasAtLeast2Elements} has been called */
    readonly hasAtLeast2Elements_amountOfCall: number
    /** The amount of time {@link CollectionIterator.hasExactly2Elements} has been called */
    readonly hasExactly2Elements_amountOfCall: number
    /** The amount of time {@link CollectionIterator.hasAtMost2Elements} has been called */
    readonly hasAtMost2Elements_amountOfCall: number

    /** The amount of time {@link CollectionIterator.currentIndex} has been called */
    readonly currentIndex_amountOfCall: number

}

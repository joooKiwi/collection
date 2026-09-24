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

import type {CollectionHolderOf1} from "../../src/CollectionHolderOf1"

/**
 * A {@link CollectionHolderOf1} having the utility to follow every non-aliased methods that have an alias
 *
 * @typeParam T The type (**mandatory**)
 */
export interface CollectionHolderOf1Follower<out T, >
    extends CollectionHolderOf1<T> {

    /**
     * Do an action on the curent {@link CollectionHolderFollower instance}
     * and return itself afterward
     *
     * @param action The action to do
     */
    execute(action: (instance: this,) => void,): this


    /** The amount of time {@link CollectionHolderOf1.size} has been called */
    readonly size_amountOfCall: number

    /** The amount of time {@link CollectionHolderOf1.isEmpty} has been called */
    readonly isEmpty_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf1.isNotEmpty} has been called */
    readonly isNotEmpty_amountOfCall: number

    /** The amount of time {@link CollectionHolderOf1.hasExactly1Element} has been called */
    readonly hasExactly1Element_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf1.hasAtMost1Element} has been called */
    readonly hasAtMost1Element_amountOfCall: number

    /** The amount of time {@link CollectionHolderOf1.hasAtLeast2Elements} has been called */
    readonly hasAtLeast2Elements_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf1.hasExactly2Elements} has been called */
    readonly hasExactly2Elements_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf1.hasAtMost2Elements} has been called */
    readonly hasAtMost2Elements_amountOfCall: number

    /** The amount of time {@link CollectionHolderOf1.get} has been called */
    readonly get_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf1.getFirst} has been called */
    readonly getFirst_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf1.getOrElse} has been called */
    readonly getOrElse_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf1.getOrNull} has been called */
    readonly getOrNull_amountOfCall: number

    /** The amount of time {@link CollectionHolderOf1.firstIndexOf} has been called */
    readonly firstIndexOf_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf1.firstIndexOfOrNull} has been called */
    readonly firstIndexOfOrNull_amountOfCall: number

    /** The amount of time {@link CollectionHolderOf1.indexOfFirst} has been called */
    readonly indexOfFirst_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf1.indexOfFirstOrNull} has been called */
    readonly indexOfFirstOrNull_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf1.indexOfFirstIndexed} has been called */
    readonly indexOfFirstIndexed_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf1.indexOfFirstIndexedOrNull} has been called */
    readonly indexOfFirstIndexedOrNull_amountOfCall: number

    /** The amount of time {@link CollectionHolderOf1.all} has been called */
    readonly all_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf1.any} has been called */
    readonly any_amountOfCall: number

    /** The amount of time {@link CollectionHolderOf1.has} has been called */
    readonly has_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf1.hasNot} has been called */
    readonly hasNot_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf1.hasNull} has been called */
    readonly hasNull_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf1.hasNoNulls} has been called */
    readonly hasNoNulls_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf1.hasDuplicate} has been called */
    readonly hasDuplicate_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf1.hasNoDuplicates} has been called */
    readonly hasNoDuplicates_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf1.hasOne} has been called */
    readonly hasOne_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf1.hasNotOne} has been called */
    readonly hasNotOne_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf1.hasAll} has been called */
    readonly hasAll_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf1.hasNotAll} has been called */
    readonly hasNotAll_amountOfCall: number

    /** The amount of time {@link CollectionHolderOf1.findFirst} has been called */
    readonly findFirst_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf1.findFirstOrNull} has been called */
    readonly findFirstOrNull_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf1.findFirstIndexed} has been called */
    readonly findFirstIndexed_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf1.findFirstIndexedOrNull} has been called */
    readonly findFirstIndexedOrNull_amountOfCall: number

    /** The amount of time {@link CollectionHolderOf1.take} has been called */
    readonly take_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf1.takeWhile} has been called */
    readonly takeWhile_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf1.takeWhileIndexed} has been called */
    readonly takeWhileIndexed_amountOfCall: number

    /** The amount of time {@link CollectionHolderOf1.drop} has been called */
    readonly drop_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf1.dropWhile} has been called */
    readonly dropWhile_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf1.dropWhileIndexed} has been called */
    readonly dropWhileIndexed_amountOfCall: number

    /** The amount of time {@link CollectionHolderOf1.toReverse} has been called */
    readonly toReverse_amountOfCall: number

    /** The amount of time {@link CollectionHolderOf1.toIterator} has been called */
    readonly toIterator_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf1.joinToString} has been called */
    readonly joinToString_amountOfCall: number
    
}

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

import type {CollectionHolderOf2} from "../../src/CollectionHolderOf2"

/**
 * A {@link CollectionHolderOf2} having the utility to follow every non-aliased methods that have an alias
 *
 * @typeParam T The type (**mandatory**)
 */
export interface CollectionHolderOf2Follower<out T, >
    extends CollectionHolderOf2<T, T> {

    /**
     * Do an action on the curent {@link CollectionHolderFollower instance}
     * and return itself afterward
     *
     * @param action The action to do
     */
    execute(action: (instance: this,) => void,): this


    /** The amount of time {@link CollectionHolderOf2.size} has been called */
    readonly size_amountOfCall: number

    /** The amount of time {@link CollectionHolderOf2.isEmpty} has been called */
    readonly isEmpty_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.isNotEmpty} has been called */
    readonly isNotEmpty_amountOfCall: number

    /** The amount of time {@link CollectionHolderOf2.hasExactly1Element} has been called */
    readonly hasExactly1Element_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.hasAtMost1Element} has been called */
    readonly hasAtMost1Element_amountOfCall: number

    /** The amount of time {@link CollectionHolderOf2.hasAtLeast2Elements} has been called */
    readonly hasAtLeast2Elements_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.hasExactly2Elements} has been called */
    readonly hasExactly2Elements_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.hasAtMost2Elements} has been called */
    readonly hasAtMost2Elements_amountOfCall: number

    /** The amount of time {@link CollectionHolderOf2.get} has been called */
    readonly get_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.getFirst} has been called */
    readonly getFirst_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.getLast} has been called */
    readonly getLast_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.getOrElse} has been called */
    readonly getOrElse_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.getOrNull} has been called */
    readonly getOrNull_amountOfCall: number

    /** The amount of time {@link CollectionHolderOf2.firstIndexOf} has been called */
    readonly firstIndexOf_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.firstIndexOfOrNull} has been called */
    readonly firstIndexOfOrNull_amountOfCall: number

    /** The amount of time {@link CollectionHolderOf2.indexOfFirst} has been called */
    readonly indexOfFirst_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.indexOfFirstOrNull} has been called */
    readonly indexOfFirstOrNull_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.indexOfFirstIndexed} has been called */
    readonly indexOfFirstIndexed_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.indexOfFirstIndexedOrNull} has been called */
    readonly indexOfFirstIndexedOrNull_amountOfCall: number

    /** The amount of time {@link CollectionHolderOf2.indexOfLast} has been called */
    readonly indexOfLast_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.indexOfLastOrNull} has been called */
    readonly indexOfLastOrNull_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.indexOfLastIndexed} has been called */
    readonly indexOfLastIndexed_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.indexOfLastIndexedOrNull} has been called */
    readonly indexOfLastIndexedOrNull_amountOfCall: number

    /** The amount of time {@link CollectionHolderOf2.all} has been called */
    readonly all_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.any} has been called */
    readonly any_amountOfCall: number

    /** The amount of time {@link CollectionHolderOf2.has} has been called */
    readonly has_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.hasNot} has been called */
    readonly hasNot_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.hasNull} has been called */
    readonly hasNull_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.hasNoNulls} has been called */
    readonly hasNoNulls_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.hasDuplicate} has been called */
    readonly hasDuplicate_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.hasNoDuplicates} has been called */
    readonly hasNoDuplicates_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.hasOne} has been called */
    readonly hasOne_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.hasNotOne} has been called */
    readonly hasNotOne_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.hasAll} has been called */
    readonly hasAll_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.hasNotAll} has been called */
    readonly hasNotAll_amountOfCall: number

    /** The amount of time {@link CollectionHolderOf2.findFirst} has been called */
    readonly findFirst_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.findFirstOrNull} has been called */
    readonly findFirstOrNull_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.findFirstIndexed} has been called */
    readonly findFirstIndexed_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.findFirstIndexedOrNull} has been called */
    readonly findFirstIndexedOrNull_amountOfCall: number

    /** The amount of time {@link CollectionHolderOf2.findLast} has been called */
    readonly findLast_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.findLastOrNull} has been called */
    readonly findLastOrNull_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.findLastIndexed} has been called */
    readonly findLastIndexed_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.findLastIndexedOrNull} has been called */
    readonly findLastIndexedOrNull_amountOfCall: number

    /** The amount of time {@link CollectionHolderOf2.take} has been called */
    readonly take_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.takeWhile} has been called */
    readonly takeWhile_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.takeWhileIndexed} has been called */
    readonly takeWhileIndexed_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.takeLast} has been called */
    readonly takeLast_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.takeLastWhile} has been called */
    readonly takeLastWhile_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.takeLastWhileIndexed} has been called */
    readonly takeLastWhileIndexed_amountOfCall: number

    /** The amount of time {@link CollectionHolderOf2.drop} has been called */
    readonly drop_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.dropWhile} has been called */
    readonly dropWhile_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.dropWhileIndexed} has been called */
    readonly dropWhileIndexed_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.dropLast} has been called */
    readonly dropLast_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.dropLastWhile} has been called */
    readonly dropLastWhile_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.dropLastWhileIndexed} has been called */
    readonly dropLastWhileIndexed_amountOfCall: number

    /** The amount of time {@link CollectionHolderOf2.toReverse} has been called */
    readonly toReverse_amountOfCall: number

    /** The amount of time {@link CollectionHolderOf2.toIterator} has been called */
    readonly toIterator_amountOfCall: number
    /** The amount of time {@link CollectionHolderOf2.joinToString} has been called */
    readonly joinToString_amountOfCall: number

}

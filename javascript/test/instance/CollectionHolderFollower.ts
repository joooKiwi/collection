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

import type {CollectionHolder} from "../../src/CollectionHolder"

/**
 * A {@link CollectionHolder} having the utility to follow every non-aliased methods that have an alias
 */
export interface CollectionHolderFollower<out T,>
    extends CollectionHolder<T> {

    /**
     * Do an action on the curent {@link CollectionHolderFollower instance}
     * and return itself afterward
     *
     * @param action The action to do
     */
    execute(action: (instance: this,) => void,): this


    /** The amount of time {@link CollectionHolder.size} has been called */
    readonly size_amountOfCall: number

    /** The amount of time {@link CollectionHolder.isEmpty} has been called */
    readonly isEmpty_amountOfCall: number
    /** The amount of time {@link CollectionHolder.isNotEmpty} has been called */
    readonly isNotEmpty_amountOfCall: number

    /** The amount of time {@link CollectionHolder.hasExactly1Element} has been called */
    readonly hasExactly1Element_amountOfCall: number
    /** The amount of time {@link CollectionHolder.hasAtMost1Element} has been called */
    readonly hasAtMost1Element_amountOfCall: number

    /** The amount of time {@link CollectionHolder.hasAtLeast2Elements} has been called */
    readonly hasAtLeast2Elements_amountOfCall: number
    /** The amount of time {@link CollectionHolder.hasExactly2Elements} has been called */
    readonly hasExactly2Elements_amountOfCall: number
    /** The amount of time {@link CollectionHolder.hasAtMost2Elements} has been called */
    readonly hasAtMost2Elements_amountOfCall: number

    /** The amount of time {@link CollectionHolder.get} has been called */
    readonly get_amountOfCall: number
    /** The amount of time {@link CollectionHolder.getFirst} has been called */
    readonly getFirst_amountOfCall: number
    /** The amount of time {@link CollectionHolder.getLast} has been called */
    readonly getLast_amountOfCall: number
    /** The amount of time {@link CollectionHolder.getOrElse} has been called */
    readonly getOrElse_amountOfCall: number
    /** The amount of time {@link CollectionHolder.getOrNull} has been called */
    readonly getOrNull_amountOfCall: number
    /** The amount of time {@link CollectionHolder.getFirstOrNull} has been called */
    readonly getFirstOrNull_amountOfCall: number
    /** The amount of time {@link CollectionHolder.getLastOrNull} has been called */
    readonly getLastOrNull_amountOfCall: number

    /** The amount of time {@link CollectionHolder.firstIndexOf} has been called */
    readonly firstIndexOf_amountOfCall: number
    /** The amount of time {@link CollectionHolder.firstIndexOfOrNull} has been called */
    readonly firstIndexOfOrNull_amountOfCall: number

    /** The amount of time {@link CollectionHolder.indexOfFirst} has been called */
    readonly indexOfFirst_amountOfCall: number
    /** The amount of time {@link CollectionHolder.indexOfFirstOrNull} has been called */
    readonly indexOfFirstOrNull_amountOfCall: number
    /** The amount of time {@link CollectionHolder.indexOfFirstIndexed} has been called */
    readonly indexOfFirstIndexed_amountOfCall: number
    /** The amount of time {@link CollectionHolder.indexOfFirstIndexedOrNull} has been called */
    readonly indexOfFirstIndexedOrNull_amountOfCall: number

    /** The amount of time {@link CollectionHolder.indexOfLast} has been called */
    readonly indexOfLast_amountOfCall: number
    /** The amount of time {@link CollectionHolder.indexOfLastOrNull} has been called */
    readonly indexOfLastOrNull_amountOfCall: number
    /** The amount of time {@link CollectionHolder.indexOfLastIndexed} has been called */
    readonly indexOfLastIndexed_amountOfCall: number
    /** The amount of time {@link CollectionHolder.indexOfLastIndexedOrNull} has been called */
    readonly indexOfLastIndexedOrNull_amountOfCall: number

    /** The amount of time {@link CollectionHolder.all} has been called */
    readonly all_amountOfCall: number
    /** The amount of time {@link CollectionHolder.any} has been called */
    readonly any_amountOfCall: number

    /** The amount of time {@link CollectionHolder.has} has been called */
    readonly has_amountOfCall: number
    /** The amount of time {@link CollectionHolder.hasNot} has been called */
    readonly hasNot_amountOfCall: number
    /** The amount of time {@link CollectionHolder.hasNull} has been called */
    readonly hasNull_amountOfCall: number
    /** The amount of time {@link CollectionHolder.hasNoNulls} has been called */
    readonly hasNoNulls_amountOfCall: number
    /** The amount of time {@link CollectionHolder.hasDuplicate} has been called */
    readonly hasDuplicate_amountOfCall: number
    /** The amount of time {@link CollectionHolder.hasNoDuplicates} has been called */
    readonly hasNoDuplicates_amountOfCall: number
    /** The amount of time {@link CollectionHolder.hasOne} has been called */
    readonly hasOne_amountOfCall: number
    /** The amount of time {@link CollectionHolder.hasNotOne} has been called */
    readonly hasNotOne_amountOfCall: number
    /** The amount of time {@link CollectionHolder.hasAll} has been called */
    readonly hasAll_amountOfCall: number
    /** The amount of time {@link CollectionHolder.hasNotAll} has been called */
    readonly hasNotAll_amountOfCall: number

    /** The amount of time {@link CollectionHolder.findFirst} has been called */
    readonly findFirst_amountOfCall: number
    /** The amount of time {@link CollectionHolder.findFirstOrNull} has been called */
    readonly findFirstOrNull_amountOfCall: number
    /** The amount of time {@link CollectionHolder.findFirstIndexed} has been called */
    readonly findFirstIndexed_amountOfCall: number
    /** The amount of time {@link CollectionHolder.findFirstIndexedOrNull} has been called */
    readonly findFirstIndexedOrNull_amountOfCall: number

    /** The amount of time {@link CollectionHolder.findLast} has been called */
    readonly findLast_amountOfCall: number
    /** The amount of time {@link CollectionHolder.findLastOrNull} has been called */
    readonly findLastOrNull_amountOfCall: number
    /** The amount of time {@link CollectionHolder.findLastIndexed} has been called */
    readonly findLastIndexed_amountOfCall: number
    /** The amount of time {@link CollectionHolder.findLastIndexedOrNull} has been called */
    readonly findLastIndexedOrNull_amountOfCall: number

    /** The amount of time {@link CollectionHolder.take} has been called */
    readonly take_amountOfCall: number
    /** The amount of time {@link CollectionHolder.takeWhile} has been called */
    readonly takeWhile_amountOfCall: number
    /** The amount of time {@link CollectionHolder.takeWhileIndexed} has been called */
    readonly takeWhileIndexed_amountOfCall: number
    /** The amount of time {@link CollectionHolder.takeLast} has been called */
    readonly takeLast_amountOfCall: number
    /** The amount of time {@link CollectionHolder.takeLastWhile} has been called */
    readonly takeLastWhile_amountOfCall: number
    /** The amount of time {@link CollectionHolder.takeLastWhileIndexed} has been called */
    readonly takeLastWhileIndexed_amountOfCall: number

    /** The amount of time {@link CollectionHolder.drop} has been called */
    readonly drop_amountOfCall: number
    /** The amount of time {@link CollectionHolder.dropWhile} has been called */
    readonly dropWhile_amountOfCall: number
    /** The amount of time {@link CollectionHolder.dropWhileIndexed} has been called */
    readonly dropWhileIndexed_amountOfCall: number
    /** The amount of time {@link CollectionHolder.dropLast} has been called */
    readonly dropLast_amountOfCall: number
    /** The amount of time {@link CollectionHolder.dropLastWhile} has been called */
    readonly dropLastWhile_amountOfCall: number
    /** The amount of time {@link CollectionHolder.dropLastWhileIndexed} has been called */
    readonly dropLastWhileIndexed_amountOfCall: number

    /** The amount of time {@link CollectionHolder.toReverse} has been called */
    readonly toReverse_amountOfCall: number

    /** The amount of time {@link CollectionHolder.joinToString} has been called */
    readonly joinToString_amountOfCall: number
    
}

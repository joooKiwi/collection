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

import type {Array} from "@joookiwi/type"

import type {CollectionHolder} from "../../src/CollectionHolder"

import {GenericMinimalistCollectionHolder}            from "../../src/GenericMinimalistCollectionHolder"
import {AbstractUnimplementedCollectionHolderForTest} from "./AbstractUnimplementedCollectionHolderForTest"

/**
 * A class to test the functionality of a {@link GenericMinimalistCollectionHolder}.
 *
 * Note that only {@link size} and {@link get} are valid since it is a {@link MinimalistCollectionHolder}.
 *
 * @typeParam T The type (**mandatory**)
 */
export class CollectionHolder_ByMinimalistCollection<const T, >
    extends AbstractUnimplementedCollectionHolderForTest<T> {

    /** The internal instance that is tested */
    public readonly instance: GenericMinimalistCollectionHolder<T>

    public constructor(/** The array received in the constructor */ public readonly array: Array<T>,) {
        super()
        this.instance = new GenericMinimalistCollectionHolder(array,)
    }

    //#region -------------------- Size methods --------------------

    public override get size(): number { return this.instance.size }

    public override get isEmpty(): never { throw new Error("The getter method “isEmpty” was not expected to be called.") }
    public override get isNotEmpty(): never { throw new Error("The getter method “isNotEmpty” was not expected to be called.") }
    public override get hasExactly1Element(): never { throw new Error("The getter method “hasExactly1Element” was not expected to be called.") }
    public override get hasAtMost1Element(): never { throw new Error("The getter method “hasAtMost1Element” was not expected to be called.") }
    public override get hasAtLeast2Elements(): never { throw new Error("The getter method “hasAtLeast2Elements” was not expected to be called.") }
    public override get hasExactly2Elements(): never { throw new Error("The getter method “hasExactly2Elements” was not expected to be called.") }
    public override get hasAtMost2Elements(): never { throw new Error("The getter method “hasAtMost2Elements” was not expected to be called.") }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    public override get(index: number,): T { return this.instance.get(index,) }

    public override getFirst(): never { throw new Error("The method “getFirst” was not expected to be called.") }
    public override getLast(): never { throw new Error("The method “getLast” was not expected to be called.") }
    public override getOrElse(): never { throw new Error("The method “getOrElse” was not expected to be called.") }
    public override getFirstOrElse(): never { throw new Error("The method “getFirstOrElse” was not expected to be called.") }
    public override getLastOrElse(): never { throw new Error("The method “getLastOrElse” was not expected to be called.") }
    public override getOrNull(): never { throw new Error("The method “getOrNull” was not expected to be called.") }
    public override getFirstOrNull(): never { throw new Error("The method “getFirstOrNull” was not expected to be called.") }
    public override getLastOrNull(): never { throw new Error("The method “getLastOrNull” was not expected to be called.") }

    public override findFirst(): never { throw new Error("The method “findFirst” was not expected to be called.") }
    public override findFirstOrNull(): never { throw new Error("The method “findFirstOrNull” was not expected to be called.") }
    public override findFirstIndexed(): never { throw new Error("The method “findFirstIndexed” was not expected to be called.") }
    public override findFirstIndexedOrNull(): never { throw new Error("The method “findFirstIndexedOrNull” was not expected to be called.") }

    public override findLast(): never { throw new Error("The method “findLast” was not expected to be called.") }
    public override findLastOrNull(): never { throw new Error("The method “findLastOrNull” was not expected to be called.") }
    public override findLastIndexed(): never { throw new Error("The method “findLastIndexed” was not expected to be called.") }
    public override findLastIndexedOrNull(): never { throw new Error("The method “findLastIndexedOrNull” was not expected to be called.") }

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    public override firstIndexOf(): never { throw new Error("The method “firstIndexOf” was not expected to be called.") }
    public override firstIndexOfOrNull(): never { throw new Error("The method “firstIndexOfOrNull” was not expected to be called.") }

    public override lastIndexOf(): never { throw new Error("The method “lastIndexOf” was not expected to be called.") }
    public override lastIndexOfOrNull(): never { throw new Error("The method “lastIndexOfOrNull” was not expected to be called.") }

    public override indexOfFirst(): never { throw new Error("The method “indexOfFirst” was not expected to be called.") }
    public override indexOfFirstOrNull(): never { throw new Error("The method “indexOfFirstOrNull” was not expected to be called.") }
    public override indexOfFirstIndexed(): never { throw new Error("The method “indexOfFirstIndexed” was not expected to be called.") }
    public override indexOfFirstIndexedOrNull(): never { throw new Error("The method “indexOfFirstIndexedOrNull” was not expected to be called.") }

    public override indexOfLast(): never { throw new Error("The method “indexOfLast” was not expected to be called.") }
    public override indexOfLastOrNull(): never { throw new Error("The method “indexOfLastOrNull” was not expected to be called.") }
    public override indexOfLastIndexed(): never { throw new Error("The method “indexOfLastIndexed” was not expected to be called.") }
    public override indexOfLastIndexedOrNull(): never { throw new Error("The method “indexOfLastIndexedOrNull” was not expected to be called.") }

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    public override all<const S extends string, >(): this is CollectionHolder<S>
    public override all(): never { throw new Error("The method “all” was not expected to be called.") }
    public override any(): never { throw new Error("The method “any” was not expected to be called.") }
    public override none(): never { throw new Error("The method “none” was not expected to be called.") }

    public override get hasNull(): never { throw new Error("The getter method “hasNull” was not expected to be called.") }
    public override get hasNoNulls(): never { throw new Error("The getter method “hasNoNulls” was not expected to be called.") }
    public override get hasDuplicate(): never { throw new Error("The getter method “hasDuplicate” was not expected to be called.") }
    public override get hasNoDuplicates(): never { throw new Error("The getter method “hasNoDuplicates” was not expected to be called.") }

    public override has(): never { throw new Error("The method “has” was not expected to be called.") }
    public override hasNot(): never { throw new Error("The method “hasNot” was not expected to be called.") }
    public override hasOne(): never { throw new Error("The method “hasOne” was not expected to be called.") }
    public override hasNotOne(): never { throw new Error("The method “hasNotOne” was not expected to be called.") }
    public override hasAll(): never { throw new Error("The method “hasAll” was not expected to be called.") }
    public override hasNotAll(): never { throw new Error("The method “hasNotAll” was not expected to be called.") }

    public override requireNoNulls(): never { throw new Error("The method “requireNoNulls” was not expected to be called.") }

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    public override filter(): never { throw new Error("The method “filter” was not expected to be called.") }
    public override filterIndexed(): never { throw new Error("The method “filterIndexed” was not expected to be called.") }
    public override filterNot(): never { throw new Error("The method “filterNot” was not expected to be called.") }
    public override filterNotIndexed(): never { throw new Error("The method “filterNotIndexed” was not expected to be called.") }
    public override filterNotNull(): never { throw new Error("The method “filterNotNull” was not expected to be called.") }

    public override slice(): never { throw new Error("The method “slice” was not expected to be called.") }

    public override take(): never { throw new Error("The method “take” was not expected to be called.") }
    public override takeWhile(): never { throw new Error("The method “takeWhile” was not expected to be called.") }
    public override takeWhileIndexed(): never { throw new Error("The method “takeWhileIndexed” was not expected to be called.") }
    public override takeLast(): never { throw new Error("The method “takeLast” was not expected to be called.") }
    public override takeLastWhile(): never { throw new Error("The method “takeLastWhile” was not expected to be called.") }
    public override takeLastWhileIndexed(): never { throw new Error("The method “takeLastWhileIndexed” was not expected to be called.") }

    public override drop(): never { throw new Error("The method “drop” was not expected to be called.") }
    public override dropWhile(): never { throw new Error("The method “dropWhile” was not expected to be called.") }
    public override dropWhileIndexed(): never { throw new Error("The method “dropWhileIndexed” was not expected to be called.") }
    public override dropLast(): never { throw new Error("The method “dropLast” was not expected to be called.") }
    public override dropLastWhile(): never { throw new Error("The method “dropLastWhile” was not expected to be called.") }
    public override dropLastWhileIndexed(): never { throw new Error("The method “dropLastWhileIndexed” was not expected to be called.") }

    public override map(): never { throw new Error("The method “map” was not expected to be called.") }
    public override mapIndexed(): never { throw new Error("The method “mapIndexed” was not expected to be called.") }
    public override mapNotNull(): never { throw new Error("The method “mapNotNull” was not expected to be called.") }
    public override mapNotNullIndexed(): never { throw new Error("The method “mapNotNullIndexed” was not expected to be called.") }

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    public override forEach(): never { throw new Error("The method “forEach” was not expected to be called.") }
    public override forEachIndexed(): never { throw new Error("The method “forEachIndexed” was not expected to be called.") }

    public override onEach(): never { throw new Error("The method “onEach” was not expected to be called.") }
    public override onEachIndexed(): never { throw new Error("The method “onEachIndexed” was not expected to be called.") }

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    public override toReverse(): never { throw new Error("The method “toReverse” was not expected to be called.") }

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- Conversion methods --------------------

    public override toIterator(): never { throw new Error("The method “toIterator” was not expected to be called.") }

    public override toArray(): never { throw new Error("The method “toArray” was not expected to be called.") }
    public override toMutableArray(): never { throw new Error("The method “toMutableArray” was not expected to be called.") }

    public override toSet(): never { throw new Error("The method “toSet” was not expected to be called.") }
    public override toMutableSet(): never { throw new Error("The method “toMutableSet” was not expected to be called.") }

    public override toMap(): never { throw new Error("The method “toMap” was not expected to be called.") }
    public override toMutableMap(): never { throw new Error("The method “toMutableMap” was not expected to be called.") }

    public override toString(): never { throw new Error("The method “toString” was not expected to be called.") }
    public override toLocaleString(): never { throw new Error("The method “toLocaleString” was not expected to be called.") }
    public override toLowerCaseString(): never { throw new Error("The method “toLowerCaseString” was not expected to be called.") }
    public override toLocaleLowerCaseString(): never { throw new Error("The method “toLocaleLowerCaseString” was not expected to be called.") }
    public override toUpperCaseString(): never { throw new Error("The method “toUpperCaseString” was not expected to be called.") }
    public override toLocaleUpperCaseString(): never { throw new Error("The method “toLocaleUpperCaseString” was not expected to be called.") }

    public override joinToString(): never { throw new Error("The method “joinToString” was not expected to be called.") }

    //#endregion -------------------- Conversion methods --------------------

}

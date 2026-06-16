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

import type {CollectionIteratorFollower} from "./CollectionIteratorFollower"

import {GenericCollectionIterator} from "../../src/iterator/GenericCollectionIterator"
import {CollectionHolderFromArray} from "./CollectionHolderFromArray"
import {ABCD}                      from "../value/arrays"
import type {NullOrNumber}         from "@joookiwi/type"

/**
 * An inherited instance of {@link GenericCollectionIterator}
 * made to have the followed methods based on the specific non-aliased method
 */
export class CollectionIterator_ByGenericIteratorFollower
    extends GenericCollectionIterator<string, CollectionHolderFromArray<string>>
    implements CollectionIteratorFollower<string> {

    //#region -------------------- Fields --------------------

    public size_amountOfCall = 0

    public isEmpty_amountOfCall = 0
    public isNotEmpty_amountOfCall = 0

    public hasExactly1Element_amountOfCall = 0
    public hasAtMost1Element_amountOfCall = 0

    public hasAtLeast2Elements_amountOfCall = 0
    public hasExactly2Elements_amountOfCall = 0
    public hasAtMost2Elements_amountOfCall = 0

    public currentIndex_amountOfCall = 0

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor() { super(new CollectionHolderFromArray(ABCD,),) }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    public execute(action: (instance: this,) => void,): this {
        action(this,)
        return this
    }

    //#region -------------------- Size methods --------------------

    public override get size(): number {
        this.size_amountOfCall++
        return super.size
    }


    public override get isEmpty(): boolean {
        this.isEmpty_amountOfCall++
        return super.isEmpty
    }

    public override get isNotEmpty(): boolean {
        this.isNotEmpty_amountOfCall++
        return super.isNotEmpty
    }


    public override get hasExactly1Element(): boolean {
        this.hasExactly1Element_amountOfCall++
        return super.hasExactly1Element
    }

    public override get hasAtMost1Element(): boolean {
        this.hasAtMost1Element_amountOfCall++
        return super.hasAtMost1Element
    }


    public override get hasAtLeast2Elements(): boolean {
        this.hasAtLeast2Elements_amountOfCall++
        return super.hasAtLeast2Elements
    }

    public override get hasExactly2Elements(): boolean {
        this.hasExactly2Elements_amountOfCall++
        return super.hasExactly2Elements
    }

    public override get hasAtMost2Elements(): boolean {
        this.hasAtMost2Elements_amountOfCall++
        return super.hasAtMost2Elements
    }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Current methods --------------------

    public override get currentIndex(): NullOrNumber {
        this.currentIndex_amountOfCall++
        return super.currentIndex
    }

    //#endregion -------------------- Current methods --------------------

    //#endregion -------------------- Methods --------------------

}

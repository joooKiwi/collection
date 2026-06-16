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

import {CollectionIteratorOf1} from "../../src/iterator/CollectionIteratorOf1"

/**
 * An inherited instance of {@link CollectionIteratorOf1}
 * made to have the followed methods based on the specific non-aliased method
 */
export class CollectionIterator_1Follower
    extends CollectionIteratorOf1<string>
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

    public constructor() { super('a',) }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    public execute(action: (instance: this,) => void,): this {
        action(this,)
        return this
    }

    //#region -------------------- Size methods --------------------

    public override get size(): 1 {
        this.size_amountOfCall++
        return super.size
    }


    public override get isEmpty(): false {
        this.isEmpty_amountOfCall++
        return super.isEmpty
    }

    public override get isNotEmpty(): true {
        this.isNotEmpty_amountOfCall++
        return super.isNotEmpty
    }


    public override get hasExactly1Element(): true {
        this.hasExactly1Element_amountOfCall++
        return super.hasExactly1Element
    }

    public override get hasAtMost1Element(): true {
        this.hasAtMost1Element_amountOfCall++
        return super.hasAtMost1Element
    }


    public override get hasAtLeast2Elements(): false {
        this.hasAtLeast2Elements_amountOfCall++
        return super.hasAtLeast2Elements
    }

    public override get hasExactly2Elements(): false {
        this.hasExactly2Elements_amountOfCall++
        return super.hasExactly2Elements
    }

    public override get hasAtMost2Elements(): true {
        this.hasAtMost2Elements_amountOfCall++
        return super.hasAtMost2Elements
    }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Current methods --------------------

    public override get currentIndex(): 0 {
        this.currentIndex_amountOfCall++
        return super.currentIndex
    }

    //#endregion -------------------- Current methods --------------------

    //#endregion -------------------- Methods --------------------

}

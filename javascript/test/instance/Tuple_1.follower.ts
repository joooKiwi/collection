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

import type {TupleFollower} from "./TupleFollower"

import {Monuple} from "../../src/tuple/Monuple"

/**
 * An inherited instance of {@link Monuple}
 * made to have the followed methods based on the specific non-aliased method
 */
export class Tuple_1Follower
    extends Monuple<string>
    implements TupleFollower<string> {

    //#region -------------------- Fields --------------------

    public size_amountOfCall = 0

    public isEmpty_amountOfCall = 0
    public isNotEmpty_amountOfCall = 0

    public hasExactly1Element_amountOfCall = 0
    public hasAtMost1Element_amountOfCall = 0

    public hasAtLeast2Elements_amountOfCall = 0
    public hasExactly2Elements_amountOfCall = 0
    public hasAtMost2Elements_amountOfCall = 0

    public hasNull_amountOfCall = 0
    public hasNoNulls_amountOfCall = 0

    public hasDuplicate_amountOfCall = 0
    public hasNoDuplicates_amountOfCall = 0

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
    //#region -------------------- Has ‥ --------------------

    public override get hasNull(): boolean {
        this.hasNull_amountOfCall++
        return super.hasNull
    }

    public override get hasNoNulls(): boolean {
        this.hasNoNulls_amountOfCall++
        return super.hasNoNulls
    }

    public override get hasDuplicate(): false {
        this.hasDuplicate_amountOfCall++
        return super.hasDuplicate
    }

    public override get hasNoDuplicates(): true {
        this.hasNoDuplicates_amountOfCall++
        return super.hasNoDuplicates
    }

    //#endregion -------------------- Has ‥ --------------------

    //#endregion -------------------- Methods --------------------

}

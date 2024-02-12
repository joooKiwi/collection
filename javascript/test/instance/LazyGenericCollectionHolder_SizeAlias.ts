/*******************************************************************************
 Copyright (c) 2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {LazyGenericCollectionHolder} from "../../src/LazyGenericCollectionHolder"

export class LazyGenericCollectionHolder_SizeAlias
    extends LazyGenericCollectionHolder {

    public amountOfCall = 0

    public constructor() { super([],) }

    public override get size(): number {
        this.amountOfCall++
        return super.size
    }

}

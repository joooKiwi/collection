/*******************************************************************************
 Copyright (c) 2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {GenericCollectionHolder} from "../../src/GenericCollectionHolder"

export class GenericCollectionHolder_HasOneAlias
    extends GenericCollectionHolder {

    public amountOfCall = 0

    public constructor() { super([],) }

    public override hasOne(...values: unknown[]): boolean {
        this.amountOfCall++
        return super.hasOne(...values,)
    }

}

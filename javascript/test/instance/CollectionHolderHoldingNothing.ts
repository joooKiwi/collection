/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {AbstractCollectionHolder} from "../../src/AbstractCollectionHolder"

export class CollectionHolderHoldingNothing<const out T = unknown, >
    extends AbstractCollectionHolder<T> {

    public constructor() { super() }

    public override get size(): never { throw new Error("The getter method size was not expected to be called",) }

    public override get(index?: unknown,): never
    public override get() { throw new Error("The method get was not expected to be called",) }

}

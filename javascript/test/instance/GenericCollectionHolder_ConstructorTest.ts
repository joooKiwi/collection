/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {GenericCollectionHolder}     from "../../src/GenericCollectionHolder"

export class GenericCollectionHolder_ConstructorTest<const T, >
    extends GenericCollectionHolder<T> {

    public override get _array(): readonly T[] {
        return super._array
    }

}

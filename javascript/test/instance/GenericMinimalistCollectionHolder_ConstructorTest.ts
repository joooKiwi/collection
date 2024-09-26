/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import {GenericMinimalistCollectionHolder} from "../../src/GenericMinimalistCollectionHolder"

export class GenericMinimalistCollectionHolder_ConstructorTest<const T, >
    extends GenericMinimalistCollectionHolder<T> {

    public override get _array(): readonly T[] {
        return super._array
    }

}

/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolderForTest} from "./CollectionHolderForTest"

import {EmptyCollectionHolder} from "../../src/EmptyCollectionHolder"

export class EmptyCollectionHolderForTest
    extends EmptyCollectionHolder
    implements CollectionHolderForTest<never> {

    public constructor() { super() }

    public get amountOfCall(): never {
        throw new Error("The amountOfCall will never change on an EmptyCollectionHolder.",)
    }

    public execute(action?: (instance: this,) => void,): never
    public execute() {
        throw new Error("An EmptyCollectionHolder does not need to execute anything since all of the methods are self contained.",)
    }

}

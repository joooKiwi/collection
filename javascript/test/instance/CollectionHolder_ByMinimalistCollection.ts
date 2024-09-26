/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}                          from "../../src/CollectionHolder"
import type {CollectionHolderForTestHavingAnInstance} from "./CollectionHolderForTestHavingAnInstance"

import {GenericMinimalistCollectionHolder}                from "../../src/GenericMinimalistCollectionHolder"
import {CollectionHolderIndexOutOfBoundsException}        from "../../src/exception/CollectionHolderIndexOutOfBoundsException"
import {EmptyCollectionHolderException}                   from "../../src/exception/EmptyCollectionHolderException"
import {CollectionHolder_FromMinimalistExtensionFunction} from "./CollectionHolder_FromMinimalistExtensionFunction"

export class CollectionHolder_ByMinimalistCollection<const T, >
    extends CollectionHolder_FromMinimalistExtensionFunction<T>
    implements CollectionHolderForTestHavingAnInstance<T> {

    public readonly instance: GenericMinimalistCollectionHolder<T>

    public constructor(array: readonly T[],) {
        super(array,)
        const $this = this
        this.instance = new class CollectionHolder_CountingGetByMinimalistCollection
            extends GenericMinimalistCollectionHolder<T> {
            public override get(index: number,): T {
                $this.amountOfCall++
                return super.get(index,)
            }
        }(array,)
    }

    public executeWhileIgnoringIndexOutOfBound(action: (instance: this,) => void,): this {
        try {
            action(this,)
            return this
        } catch (exception) {
            if (exception instanceof CollectionHolderIndexOutOfBoundsException)
                return this
            throw exception
        }
    }

    public executeWhileIgnoringEmptyException(action: (instance: this,) => void,): this {
        try {
            action(this,)
            return this
        } catch (exception) {
            if (exception instanceof EmptyCollectionHolderException)
                return this
            throw exception
        }
    }

    public executeWhileHavingIndexesOnField<const U, >(action: (instance: this,) => CollectionHolder<U>,): this {
        action(this,).onEach(_ => {},)
        return this
    }

    public executeToHaveIndexesOnField<const U, >(action: (instance: this,) => CollectionHolder<U>,): CollectionHolder<U> {
        return action(this,).onEach(_ => {},)
    }

    public override get size(): number {
        return this.instance.size
    }

    public override get(index: number,): T {
        return this.instance.get(index,)
    }

}

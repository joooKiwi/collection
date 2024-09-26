/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {NullOr} from "@joookiwi/type"

import type {CollectionHolder}                        from "../../src/CollectionHolder"
import type {IndexWithReturnCallback}                 from "../../src/CollectionHolder.types"
import type {CollectionHandler}                       from "../../src/handler/CollectionHandler"
import type {CollectionHolderForTestHavingAnInstance} from "./CollectionHolderForTestHavingAnInstance"

import {LazyGenericCollectionHolder}               from "../../src/LazyGenericCollectionHolder"
import {CollectionHolderIndexOutOfBoundsException} from "../../src/exception/CollectionHolderIndexOutOfBoundsException"
import {EmptyCollectionHolderException}            from "../../src/exception/EmptyCollectionHolderException"
import {CollectionHolder_FromExtensionFunction}    from "./CollectionHolder_FromExtensionFunction"

export class CollectionHolder_ByLazyCollection<const T, >
    extends CollectionHolder_FromExtensionFunction<T>
    implements CollectionHolderForTestHavingAnInstance<T> {

    public readonly instance

    public constructor(array: readonly T[],) {
        super(array,)
        const $this = this
        this.instance = new class CollectionHolder_CountingGetByLazyCollection
            extends LazyGenericCollectionHolder<T> {

            public override get(index: number,): T {
                $this.amountOfCall++
                return super.get(index,)
            }

            public get handler(): CollectionHandler<T> { return this._handler }

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

    public get handler(): CollectionHandler<T> { return this.instance.handler }

    /** Retrieve the internal value of the {@link LazyGenericCollectionHolder._handler} and return the current instance afterward */
    public retrieveHandler(): this {
        this.handler
        return this
    }

    public override get size(): number { return this.instance.size }
    public override get isEmpty(): boolean { return this.instance.isEmpty }
    public override get isNotEmpty(): boolean { return this.instance.isNotEmpty }
    public override get hasNull(): boolean { return this.instance.hasNull }
    public override get hasDuplicate(): boolean { return this.instance.hasDuplicate }

    public override get(index: number,): T { return this.instance.get(index,) }

    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) { return this.instance.getOrElse(index, defaultValue,) }

    public override getOrNull(index: number,): NullOr<T> { return this.instance.getOrNull(index,) }

    public override toArray(): readonly T[] { return this.instance.toArray() }
    public override toSet(): ReadonlySet<T> { return this.instance.toSet() }
    public override toMap(): ReadonlyMap<number, T> { return this.instance.toMap() }

}

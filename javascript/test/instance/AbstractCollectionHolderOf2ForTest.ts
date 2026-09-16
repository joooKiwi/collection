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

import type {CollectionHolder}        from "../../src/CollectionHolder"
import type {CollectionHolderForTest} from "./CollectionHolderForTest"

import {EmptyCollectionException}                 from "../../src/exception/EmptyCollectionException"
import {ForbiddenIndexException}                  from "../../src/exception/ForbiddenIndexException"
import {IndexNotFoundException}                   from "../../src/exception/IndexNotFoundException"
import {IndexOutOfBoundsException}                from "../../src/exception/IndexOutOfBoundsException"
import {InvalidIndexRangeException}               from "../../src/exception/InvalidIndexRangeException"
import {AbstractUnimplementedCollectionHolderOf2} from "./AbstractUnimplementedCollectionHolderOf2"

/**
 * A bare-bone implementation of a {@link CollectionHolderForTest}+{@link CollectionHolderOf2} with nothing implemented
 *
 * @typeParam T1 The 1st type
 * @typeParam T2 The 2nd type
 */
export abstract class AbstractCollectionHolderOf2ForTest<const T1, const T2, >
    extends AbstractUnimplementedCollectionHolderOf2<T1, T2>
    implements CollectionHolderForTest<| T1 | T2> {

    #amountOfCall?: number

    protected constructor() { super() }

    //#region -------------------- Test utility methods --------------------

    public get amountOfCall(): number {
        return this.#amountOfCall ?? 0
    }

    public set amountOfCall(value: number,) {
        this.#amountOfCall = value
    }

    public execute(action: (instance: this,) => void,): this {
        action(this,)
        return this
    }

    public executeWhileExpectingIndexNotFound(action: (instance: this,) => void,): this {
        try {
            action(this,)
        } catch (exception) {
            if (exception instanceof IndexNotFoundException)
                return this
            throw exception
        }
        throw new Error("The exception “IndexNotFoundException” was expected to be thrown.",)
    }

    public executeWhileExpectingIndexOutOfBound(action: (instance: this,) => void,): this {
        try {
            action(this,)
        } catch (exception) {
            if (exception instanceof IndexOutOfBoundsException)
                return this
            throw exception
        }
        throw new Error("The exception “IndexOutOfBoundsException” was expected to be thrown.",)
    }

    public executeWhileExpectingInvalidIndexRange(action: (instance: this,) => void,): this {
        try {
            action(this,)
        } catch (exception) {
            if (exception instanceof InvalidIndexRangeException)
                return this
            throw exception
        }
        throw new Error("The exception “InvalidIndexRangeException” was expected to be thrown.",)
    }

    public executeWhileExpectingEmptyException(action: (instance: this,) => void,): this {
        try {
            action(this,)
        } catch (exception) {
            if (exception instanceof EmptyCollectionException)
                return this
            throw exception
        }
        throw new Error("The exception “EmptyCollectionException” was expected to be thrown.",)
    }

    public executeWhileExpectingForbiddenException(action: (instance: this,) => void,): this {
        try {
            action(this,)
        } catch (exception) {
            if (exception instanceof ForbiddenIndexException)
                return this
            throw exception
        }
        throw new Error("The exception “ForbiddenIndexException” was expected to be thrown.",)
    }

    public executeWhileHavingIndexesOnField<const U, >(action: (instance: this,) => CollectionHolder<U>,): this {
        action(this,).forEach(_ => {},)
        return this
    }

    public executeToHaveIndexesOnField<const U, >(action: (instance: this,) => CollectionHolder<U>,): CollectionHolder<U> {
        return action(this,).onEach(_ => {},)
    }

    //#endregion -------------------- Test utility methods --------------------

}

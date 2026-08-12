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

import type {Array} from "@joookiwi/type"

import type {ReturnCallback} from "../type/callback"

import {Optional} from "./Optional"

export class EmptyOptional
    extends Optional<never> {

    //#region -------------------- Singleton usage --------------------

    static #instance?: EmptyOptional

    protected constructor() { super() }

    public static get get(): EmptyOptional {
        return EmptyOptional.#instance ??= new EmptyOptional()
    }

    //#endregion -------------------- Singleton usage --------------------

    //#region -------------------- Methods --------------------

    //#region -------------------- Get methods --------------------

    public override get get(): never { throw new ReferenceError("Value not found exception. No value exist in an “EmptyOptional”.",) }


    public override ifPresent(..._: Array<unknown>): void
    public override ifPresent() {}

    public override ifPresentOrElse(_1: unknown, emptyAction: () => void, ..._2: Array<unknown>): void
    public override ifPresentOrElse(_: unknown, emptyAction: () => void,): void { emptyAction() }

    public override or(supplier: ReturnCallback<never>, ..._: Array<unknown>): never
    public override or<const OPTIONAL extends Optional<never>, >(supplier: ReturnCallback<OPTIONAL>, ..._: Array<unknown>): OPTIONAL
    public override or(supplier: ReturnCallback<Optional<never>>,) {
        return supplier()
    }


    public override orElse(other: never, ..._: Array<unknown>): never
    public override orElse<const U, >(other: U, ..._: Array<unknown>): U
    public override orElse(other: unknown,) { return other }

    public override orElseGet(supplier: ReturnCallback<never>, ..._: Array<unknown>): never
    public override orElseGet<const U, >(supplier: ReturnCallback<U>, ..._: Array<unknown>): U
    public override orElseGet(supplier: ReturnCallback<unknown>,) { return supplier() }

    public override orElseThrow( ..._: Array<unknown>): never
    public override orElseThrow() { throw new ReferenceError("Value not found exception. No value exist in an “EmptyOptional”.",) }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Present methods --------------------

    public override get isPresent(): false { return false }

    public override get isEmpty(): true { return true }

    //#endregion -------------------- Present methods --------------------

    public override toString(): string { return "EmptyOptional" }

    //#endregion -------------------- Methods --------------------

}

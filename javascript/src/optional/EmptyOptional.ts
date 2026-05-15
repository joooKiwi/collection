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


    public override orElse(other: never,): never
    public override orElse<const U, >(other: U,): U
    public override orElse(other: unknown,) { return other }

    public override orElseGet(supplier: () => never,): never
    public override orElseGet<const U, >(supplier: () => U,): U
    public override orElseGet(supplier: () => unknown,) { return supplier() }

    public override orElseThrow(): never { throw new ReferenceError("Value not found exception. No value exist in an “EmptyOptional”.",) }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Present methods --------------------

    public override get isPresent(): false { return false }

    public override get isEmpty(): true { return true }

    //#endregion -------------------- Present methods --------------------

    public override toString(): string { return "EmptyOptional" }

    //#endregion -------------------- Methods --------------------

}

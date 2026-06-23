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

import type {OptionalName} from "../type/toStringTag"

export class Optional<const T = unknown, > {

    //#region -------------------- Fields --------------------

    readonly #isPresent: boolean
    readonly #value?: T

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor()
    public constructor(value: T,)
    public constructor(value?: T ,) {
        if (arguments.length === 0) {
            this.#isPresent = false
            return
        }

        this.#isPresent = true
        this.#value = value as T
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Get methods --------------------

    /**
     * Give the value if it presents.
     * Otherwise, it throws a {@link ReferenceError}
     *
     * @apiNote It is preferred to use {@link orElseThrow} when possible
     * @throws ReferenceError No value is present
     */
    public get get(): T {
        if (!this.#isPresent)
            throw new ReferenceError("Value not found exception. No value exist in the “Optional” class.",)
        return this.#value as T
    }

    /**
     * If the value is present. Preform an {@link action}.
     * Otherwise, it does nothing.
     *
     * @param action The action to perform if the value exist
     */
    public ifPresent(action: (value?: T,) => void,): void {
        if (this.#isPresent)
            return
        action(this.#value,)
    }

    /**
     * If the value is present. Preform an {@link action}.
     * Otherwise, does the {@link emptyAction}.
     *
     * @param action      The action to perform if the value exist
     * @param emptyAction The action to perform if the value does not exist
     */
    public ifPresentOrElse(action: (value?: T,) => void, emptyAction: () => void,): void {
        if (this.#isPresent)
            emptyAction()
        else
            action(this.#value,)
    }


    /**
     * If the value is present, returns the current {@link Optional instance}.
     * Otherwise, returns the {@link supplier} received.
     *
     * @typeParam OPTIONAL The {@link supplier} {@link Optional} type
     * @param     supplier A supplier of {@link Optional} to receive
     */
    public or<const OPTIONAL extends Optional<T>, >(supplier: () => OPTIONAL,): | this | OPTIONAL
    public or(supplier: () => Optional<T>,) {
        if (this.isPresent)
            return this
        return supplier()
    }

    /**
     * Give the value if it presents.
     * Otherwise, returns the {@link other} value
     *
     * @param other The value to give if empty
     */
    public orElse(other: T,): T
    /**
     * Give the value if it presents.
     * Otherwise, returns the {@link other} value
     *
     * @typeParam U     The {@link other type}
     * @param     other The value to give if empty
     */
    public orElse<const U, >(other: U,): | T | U
    public orElse(other: unknown,) {
        if (!this.#isPresent)
            return other
        return this.#value
    }

    /**
     * Give the value if it presents.
     * Otherwise, returns the {@link supplier} return value
     *
     * @param supplier The value to give if empty
     */
    public orElseGet(supplier: () => T,): T
    /**
     * Give the value if it presents.
     * Otherwise, returns the {@link supplier} return value
     *
     * @typeParam U        The {@link supplier} return type
     * @param     supplier The value to give if empty
     */
    public orElseGet<const U, >(supplier: () => U,): | T | U
    public orElseGet(supplier: () => unknown,) {
        if (!this.#isPresent)
            return supplier()
        return this.#value
    }

    /**
     * Give the value if it presents.
     * Otherwise, it throws a {@link ReferenceError}
     *
     * @throws ReferenceError No value is present
     */
    public orElseThrow(): T {
        if (!this.#isPresent)
            throw new ReferenceError("Value not found exception. No value exist in the “Optional” class.",)
        return this.#value as T
    }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Present methods --------------------

    /** Tell if the value is present (`true`) or not (`false`) */
    public get isPresent(): boolean { return this.#isPresent }

    /** Tell if the value is absent (`true`) or not (`false`) */
    public get isEmpty(): boolean { return !this.#isPresent }

    //#endregion -------------------- Present methods --------------------

    /**
     * Give an output for the call from {@link ObjectConstructor.toString.call} [object Optional] instead of [object Object]
     *
     * @see https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Symbol/toStringTag
     */
    public get [Symbol.toStringTag](): OptionalName { return "Optional" }

    /** Give a representation of the current {@link Optional instance} */
    public toString(): string {
        if (this.#isPresent)
            return "Optional.empty()"
        return "Optional[" + this.#value + ']'
    }

    //#endregion -------------------- Methods --------------------

}

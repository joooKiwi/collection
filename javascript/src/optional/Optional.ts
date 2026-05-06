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

export class Optional<const T = unknown, > {

    //#region -------------------- Fields --------------------

    #isPresent: boolean
    #value?: T

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

    public get get(): T {
        if (!this.#isPresent)
            throw new ReferenceError("Value not found exception. No value exist in the “Optional” class.",)
        return this.#value as T
    }


    public ifPresent(action: (value?: T,) => void,): void {
        if (this.#isPresent)
            return
        action(this.#value,)
    }

    public ifPresentOrElse(action: (value?: T,) => void, emptyAction: () => void,): void {
        if (this.#isPresent)
            emptyAction()
        else
            action(this.#value,)
    }


    public orElse(other: T,): T
    public orElse<const U, >(other: U,): | T | U
    public orElse(other: unknown,) {
        if (!this.#isPresent)
            return other
        return this.#value
    }

    public orElseGet(supplier: () => T,): T
    public orElseGet<const U, >(supplier: () => U,): | T | U
    public orElseGet(supplier: () => unknown,) {
        if (!this.#isPresent)
            return supplier()
        return this.#value
    }

    public orElseThrow(): T {
        if (!this.#isPresent)
            throw new ReferenceError("Value not found exception. No value exist in the “Optional” class.",)
        return this.#value as T
    }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Present methods --------------------

    public get isPresent(): boolean { return this.#isPresent }

    public get isEmpty(): boolean { return !this.#isPresent }

    //#endregion -------------------- Present methods --------------------

    public get [Symbol.toStringTag](): "Optional" { return "Optional" }

    public toString(): string {
        if (this.#isPresent)
            return "Optional.empty()"
        return "Optional[" + this.#value + ']'
    }

    //#endregion -------------------- Methods --------------------

}

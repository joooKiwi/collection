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

import type {Nullable, NullOr, NumericOrObject} from "@joookiwi/type"

/** An {@link Error exception} that tell that an index could not be found */
export class IndexNotFoundException<const T extends NullOr<NumericOrObject> = NullOr<NumericOrObject>,
    const CAUSE extends Error = never, >
    extends ReferenceError {

    public override readonly name = this.constructor.name
    readonly #invalidIndex: T
    readonly #cause: NullOr<CAUSE>

    public constructor(message: string, invalidIndex: T, cause?: Nullable<CAUSE>,) {
        super(message,)
        this.#invalidIndex = invalidIndex
        this.#cause = cause ?? null
    }

    /** The invalid index */
    public get invalidIndex(): T {
        return this.#invalidIndex
    }

    /** The cause of the {@link Error exception} */
    public override get cause(): NullOr<CAUSE> {
        return this.#cause
    }

}

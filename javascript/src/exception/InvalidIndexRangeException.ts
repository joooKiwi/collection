/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullOr, NumericOrObject} from "@joookiwi/type"

/** An {@link Error exception} that tell that the ending and starting indexes are not valid compare to each other */
export class InvalidIndexRangeException<const STARTING_INDEX extends NullOr<NumericOrObject> = NullOr<NumericOrObject>,
    const ENDING_INDEX extends NullOr<NumericOrObject> = NullOr<NumericOrObject>,
    const CAUSE extends Error = never, >
    extends RangeError {

    public override readonly name = this.constructor.name
    readonly #invalidStartingIndex: STARTING_INDEX
    readonly #invalidEndingIndex: ENDING_INDEX
    readonly #cause

    public constructor(message: string, invalidStartingIndex: STARTING_INDEX, invalidEndingIndex: ENDING_INDEX, cause?: Nullable<CAUSE>,) {
        super(message,)
        this.#invalidStartingIndex = invalidStartingIndex
        this.#invalidEndingIndex = invalidEndingIndex
        this.#cause = cause ?? null
    }

    /** The invalid starting index */
    public get invalidStartingIndex(): STARTING_INDEX {
        return this.#invalidStartingIndex
    }

    /** The invalid ending index */
    public get invalidEndingIndex(): ENDING_INDEX {
        return this.#invalidEndingIndex
    }

    /** The cause of the {@link Error exception} */
    public override get cause(): NullOr<CAUSE> {
        return this.#cause
    }

}

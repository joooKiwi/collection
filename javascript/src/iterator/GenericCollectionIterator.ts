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

import type {CollectionHolder}        from "../CollectionHolder"
import type {CollectionIteratorValue} from "./value/CollectionIteratorValue"

import {GenericCollectionIteratorValue} from "./value/GenericCollectionIteratorValue"
import {AbstractCollectionIterator}     from "./AbstractCollectionIterator"

export class GenericCollectionIterator<const T = unknown,
    const REFERENCE extends CollectionHolder<T> = CollectionHolder<T>, >
    extends AbstractCollectionIterator<T> {

    //#region -------------------- Fields --------------------

    readonly #reference: REFERENCE
    #size?: REFERENCE["size"]
    #sizeMinus1?: number
    #sizeMinus2?: number
    #isEmpty?: REFERENCE["isEmpty"]
    #isNotEmpty?: REFERENCE["isNotEmpty"]
    #hasExactly1Element?: REFERENCE["hasExactly1Element"]
    #hasAtMost1Element?: REFERENCE["hasAtMost1Element"]
    #hasAtLeast2Elements?: REFERENCE["hasAtLeast2Elements"]
    #hasExactly2Elements?: REFERENCE["hasExactly2Elements"]
    #hasAtMost2Elements?: REFERENCE["hasAtMost2Elements"]

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor(reference: REFERENCE,) {
        super()
        this.#reference = reference
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Reference methods --------------------

    /** The reference received via its constructor */
    protected get _reference(): REFERENCE { return this.#reference }

    //#endregion -------------------- Reference methods --------------------
    //#region -------------------- Size methods --------------------

    /** @initializedOnFirstCall */
    public override get size(): REFERENCE["size"] { return this.#size ??= this._reference.size }
    /** @initializedOnFirstCall */
    protected override get _sizeMinus1(): number { return this.#sizeMinus1 ??= super._sizeMinus1 }
    /** @initializedOnFirstCall */
    protected override get _sizeMinus2(): number { return this.#sizeMinus2 ??= super._sizeMinus2 }

    /** @initializedOnFirstCall */
    public override get isEmpty(): REFERENCE["isEmpty"] { return this.#isEmpty ??= this._reference.isEmpty }
    /** @initializedOnFirstCall */
    public override get isNotEmpty(): REFERENCE["isNotEmpty"] { return this.#isNotEmpty ??= this._reference.isNotEmpty }

    /** @initializedOnFirstCall */
    public override get hasExactly1Element(): REFERENCE["hasExactly1Element"] { return this.#hasExactly1Element ??= this._reference.hasExactly1Element }
    /** @initializedOnFirstCall */
    public override get hasAtMost1Element(): REFERENCE["hasAtMost1Element"] { return this.#hasAtMost1Element ??= this._reference.hasAtMost1Element }
    /** @initializedOnFirstCall */
    public override get hasAtLeast2Elements(): REFERENCE["hasAtLeast2Elements"] { return this.#hasAtLeast2Elements ??= this._reference.hasAtLeast2Elements }
    /** @initializedOnFirstCall */
    public override get hasExactly2Elements(): REFERENCE["hasExactly2Elements"] { return this.#hasExactly2Elements ??= this._reference.hasExactly2Elements }
    /** @initializedOnFirstCall */
    public override get hasAtMost2Elements(): REFERENCE["hasAtMost2Elements"] { return this.#hasAtMost2Elements ??= this._reference.hasAtMost2Elements }

    //#endregion -------------------- Size methods --------------------

    //#region -------------------- Value methods --------------------

    protected override _getIteratorValue(index: number,): CollectionIteratorValue<T> { return new GenericCollectionIteratorValue(this, this._reference, index,) }

    protected override _getValue(index: number,): T { return this._reference.get(index,) }

    //#endregion -------------------- Value methods --------------------
    //#region -------------------- JavaScript methods --------------------

    public override [Symbol.iterator](): GenericCollectionIterator<T, REFERENCE> { return new GenericCollectionIterator(this._reference,) }

    //#endregion -------------------- JavaScript methods --------------------

    //#endregion -------------------- Methods --------------------

}

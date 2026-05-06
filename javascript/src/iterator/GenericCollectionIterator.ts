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
    #hasOnly1Element?: boolean
    #hasOnly2Elements?: boolean

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
    protected override get _hasOnly1Element(): boolean { return this.#hasOnly1Element ??= super._hasOnly1Element }
    /** @initializedOnFirstCall */
    protected override get _hasOnly2Elements(): boolean { return this.#hasOnly2Elements ??= super._hasOnly2Elements }

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

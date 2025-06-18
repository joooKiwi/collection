//··························································
// Copyright (c) 2023-2025. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

import type {MinimalistCollectionHolder} from "../MinimalistCollectionHolder"
import type {CollectionIterator}         from "./CollectionIterator"
import type {CollectionIteratorValue}    from "./value/CollectionIteratorValue"

import {GenericCollectionIteratorValue} from "./value/GenericCollectionIteratorValue"
import {AbstractCollectionIterator}     from "./AbstractCollectionIterator"

export class GenericCollectionIterator<const T = unknown,
    const COLLECTION extends MinimalistCollectionHolder<T> = MinimalistCollectionHolder<T>, >
    extends AbstractCollectionIterator<T, COLLECTION> {

    //#region -------------------- Fields --------------------

    readonly #collection: COLLECTION
    #size?: COLLECTION["size"]
    #sizeMinus1?: number
    #sizeMinus2?: number
    #isEmpty?: boolean
    #isNotEmpty?: boolean
    #hasOnly1Element?: boolean
    #hasOnly2Elements?: boolean

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor(collection: COLLECTION,) {
        super()
        this.#collection = collection
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Reference methods --------------------

    public override get collection(): COLLECTION { return this.#collection }

    //#endregion -------------------- Reference methods --------------------
    //#region -------------------- Size methods --------------------

    /** @initializedOnFirstCall */
    public override get size(): COLLECTION["size"] { return this.#size ??= super.size }
    /** @initializedOnFirstCall */
    protected override get _sizeMinus1(): number { return this.#sizeMinus1 ??= super._sizeMinus1 }
    /** @initializedOnFirstCall */
    protected override get _sizeMinus2(): number { return this.#sizeMinus2 ??= super._sizeMinus2 }

    /** @initializedOnFirstCall */
    public override get isEmpty(): boolean { return this.#isEmpty ??= super.isEmpty }
    /** @initializedOnFirstCall */
    public override get isNotEmpty(): boolean { return this.#isNotEmpty ??= super.isNotEmpty }

    /** @initializedOnFirstCall */
    protected override get _hasOnly1Element(): boolean { return this.#hasOnly1Element ??= super._hasOnly1Element }
    /** @initializedOnFirstCall */
    protected override get _hasOnly2Elements(): boolean { return this.#hasOnly2Elements ??= super._hasOnly2Elements }

    //#endregion -------------------- Size methods --------------------

    //#region -------------------- Value methods --------------------

    protected override _getIteratorValue(index: number,): CollectionIteratorValue<T> { return new GenericCollectionIteratorValue(this, this.collection, index,) }

    protected override _getValue(index: number,): T { return this.collection.get(index,) }

    //#endregion -------------------- Value methods --------------------
    //#region -------------------- JavaScript methods --------------------

    public override [Symbol.iterator](): CollectionIterator<T> { return new GenericCollectionIterator(this.collection,) }

    //#endregion -------------------- JavaScript methods --------------------

    //#endregion -------------------- Methods --------------------

}

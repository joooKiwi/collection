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

import type {MutableArray, NullOr, NullOrNumber} from "@joookiwi/type"

import type {IterableWithPossibleSize}                from "./iterable/IterableWithPossibleSize"
import type {IndexWithReturnCallback, ReturnCallback} from "./type/callback"

import {AbstractCollectionHolder}  from "./AbstractCollectionHolder"
import {EmptyCollectionException}  from "./exception/EmptyCollectionException"
import {ForbiddenIndexException}   from "./exception/ForbiddenIndexException"
import {IndexOutOfBoundsException} from "./exception/IndexOutOfBoundsException"

/**
 * A {@link Iterable Javascript Iterable} adaptor class that provide all the feature of a {@link CollectionHolder}
 *
 * Note that nothing excepting the {@link Iterable}
 * are kept in the instance.
 *
 * @note This class is still under construction, but the features (
 *       {@link #get}, {@link #getFirst},
 *       {@link #getOrElse}, {@link #getFirstOrElse},
 *       {@link #getOrNull}, {@link #getFirstOrNull},
 *       {@link #size}, {@link #isEmpty} and {@link #isNotEmpty}) are stable.
 *       And the features ({@link #hasExactly1Element}, {@link #hasAtMost1Element},
 *       {@link #hasAtLeast2Elements}, {@link #hasExactly2Elements}, {@link #hasAtMost2Elements},
 *       {@link #hasNull}, {@link #hasNoNulls},
 *       {@link #hasDuplicate} and {@link #hasNoDuplicates}) are mostly stable.
 * @typeParam T         The element type
 * @typeParam REFERENCE The reference passed in the constructor
 * @adaptor
 * @beta
 */
export class JsIterableAsCollectionHolder<const T = unknown,
    const REFERENCE extends IterableWithPossibleSize<T> = IterableWithPossibleSize<T>, >
    extends AbstractCollectionHolder<T> {

    //#region -------------------- Fields --------------------

    #size?: number
    #isEmpty?: boolean
    #isNotEmpty?: boolean
    #hasExactly1Element?: boolean
    #hasAtMost1Element?: boolean
    #hasAtLeast2Elements?: boolean
    #hasExactly2Elements?: boolean
    #hasAtMost2Elements?: boolean
    #hasNull?: boolean
    #hasNoNulls?: boolean
    #hasDuplicate?: boolean
    #hasNoDuplicates?: boolean
    readonly #reference: REFERENCE
    #iterator?: NullOr<Iterator<T, unknown, unknown>>
    #lastIndexRetrieved?: NullOrNumber

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor(reference: REFERENCE, size?: number,) {
        super()
        this.#reference = reference
        if (size == null)
            return
        this.#size = size
        this.#isEmpty = size === 0
        this.#isNotEmpty = size !== 0
        this.#hasExactly1Element = size === 1
        this.#hasAtMost1Element = size <= 1
        this.#hasAtLeast2Elements = size >= 2
        this.#hasExactly2Elements = size === 2
        this.#hasAtMost2Elements = size <= 2
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Reference methods --------------------

    /** The internal referenced passed through the {@link constructor} */
    protected get _reference(): REFERENCE {
        return this.#reference
    }

    /** The iterator retrieved from the {@link _reference} */
    protected get _iterator(): Iterator<T, unknown> { return this.#iterator ??= this._reference[Symbol.iterator]() }

    //#endregion -------------------- Reference methods --------------------

    //#region -------------------- Size methods --------------------

    public override get size(): number {
        const value = this.#size
        if (value != null)
            return value

        const lastIndexRetrieved = this.#lastIndexRetrieved
        if (lastIndexRetrieved == null) {
            // We retrieve every element of the iterator in one loop
            const iterator = this._iterator
            let iteratorValue = iterator.next()
            if (iteratorValue.done) { // We have no element in the iterator
                this.#lastIndexRetrieved = null
                this.#iterator = null
                this.#size = 0
                this.#isEmpty = true
                this.#isNotEmpty = false
                this.#hasExactly1Element = false
                this.#hasAtMost1Element = true
                this.#hasAtLeast2Elements = false
                this.#hasExactly2Elements = false
                this.#hasAtMost2Elements = true
                this.#hasNull = false
                this.#hasNoNulls = true
                this.#hasDuplicate = false
                this.#hasNoDuplicates = true
                return 0
            }


            this.#isEmpty = false
            this.#isNotEmpty = true
            this[0] = iteratorValue.value
            let indexToSet = 0
            while (!(iteratorValue = iterator.next()).done)
                this[++indexToSet] = iteratorValue.value
            this.#lastIndexRetrieved = null
            this.#iterator = null
            const size = this.#size = indexToSet + 1
            this.#hasExactly1Element = size === 1
            this.#hasAtMost1Element = size <= 1
            this.#hasAtLeast2Elements = size >= 2
            this.#hasExactly2Elements = size === 2
            this.#hasAtMost2Elements = size <= 2
            return size
        }

        const iterator = this._iterator
        let indexToSet = lastIndexRetrieved
        let iteratorValue: IteratorResult<T, unknown>
        while (!(iteratorValue = iterator.next()).done)
            this[++indexToSet] = iteratorValue.value

        this.#lastIndexRetrieved = null
        this.#iterator = null
        const size = this.#size = indexToSet + 1
        this.#hasExactly1Element = size === 1
        this.#hasAtMost1Element = size <= 1
        this.#hasAtLeast2Elements = size >= 2
        this.#hasExactly2Elements = size === 2
        this.#hasAtMost2Elements = size <= 2
        return size
    }


    public override get isEmpty(): boolean {
        const value = this.#isEmpty
        if (value != null)
            return value

        const iteratorValue = this._iterator.next()
        const lastIndexRetrieved = this.#lastIndexRetrieved
        if (lastIndexRetrieved == null) {
            if (iteratorValue.done) { // We have no element in the iterator
                this.#lastIndexRetrieved = null
                this.#iterator = null
                this.#size = 0
                this.#isEmpty = true
                this.#isNotEmpty = false
                this.#hasExactly1Element = false
                this.#hasAtMost1Element = true
                this.#hasAtLeast2Elements = false
                this.#hasExactly2Elements = false
                this.#hasAtMost2Elements = true
                this.#hasNull = false
                this.#hasNoNulls = true
                this.#hasDuplicate = false
                this.#hasNoDuplicates = true
                return true
            }

            this[this.#lastIndexRetrieved = 0] = iteratorValue.value
            this.#isEmpty = false
            this.#isNotEmpty = true
            return false
        }

        if (iteratorValue.done) { // We have every iterator values retrieved so, the size is known
            this.#lastIndexRetrieved = null
            this.#iterator = null
            const size = this.#size = lastIndexRetrieved + 1
            const isEmpty = this.#isEmpty = size === 0
            this.#isNotEmpty = size !== 0
            this.#hasExactly1Element = size === 1
            this.#hasAtMost1Element = size <= 1
            this.#hasAtLeast2Elements = size >= 2
            this.#hasExactly2Elements = size === 2
            this.#hasAtMost2Elements = size <= 2
            return isEmpty
        }

        this[this.#lastIndexRetrieved = lastIndexRetrieved + 1] = iteratorValue.value
        this.#isEmpty = false
        this.#isNotEmpty = true
        return false
    }

    public override get isNotEmpty(): boolean {
        const value = this.#isNotEmpty
        if (value != null)
            return value

        const iteratorValue = this._iterator.next()
        const lastIndexRetrieved = this.#lastIndexRetrieved
        if (lastIndexRetrieved == null) {
            if (iteratorValue.done) { // We have no element in the iterator
                this.#lastIndexRetrieved = null
                this.#iterator = null
                this.#size = 0
                this.#isEmpty = true
                this.#isNotEmpty = false
                this.#hasExactly1Element = false
                this.#hasAtMost1Element = true
                this.#hasAtLeast2Elements = false
                this.#hasExactly2Elements = false
                this.#hasAtMost2Elements = true
                this.#hasNull = false
                this.#hasNoNulls = true
                this.#hasDuplicate = false
                this.#hasNoDuplicates = true
                return false
            }

            this[this.#lastIndexRetrieved = 0] = iteratorValue.value
            this.#isEmpty = false
            this.#isNotEmpty = true
            return true
        }

        if (iteratorValue.done) { // We have every iterator values retrieved so, the size is known
            this.#lastIndexRetrieved = null
            this.#iterator = null
            const size = this.#size = lastIndexRetrieved + 1
            this.#isEmpty = size === 0
            const isNotEmpty = this.#isNotEmpty = size !== 0
            this.#hasExactly1Element = size === 1
            this.#hasAtMost1Element = size <= 1
            this.#hasAtLeast2Elements = size >= 2
            this.#hasExactly2Elements = size === 2
            this.#hasAtMost2Elements = size <= 2
            return isNotEmpty
        }

        this[this.#lastIndexRetrieved = lastIndexRetrieved + 1] = iteratorValue.value
        this.#isEmpty = false
        this.#isNotEmpty = true
        return true
    }


    public override get hasExactly1Element(): boolean {
        const value = this.#hasExactly1Element
        if (value != null)
            return value

        const lastIndexRetrieved = this.#lastIndexRetrieved
        if (lastIndexRetrieved == null) {
            // We retrieve at least the 1st element of the iterator (if it exists)
            const iterator = this._iterator
            const firstIteratorValue = iterator.next()
            if (firstIteratorValue.done) { // We have no element in the iterator
                this.#lastIndexRetrieved = null
                this.#iterator = null
                this.#size = 0
                this.#isEmpty = true
                this.#isNotEmpty = false
                this.#hasExactly1Element = false
                this.#hasAtMost1Element = true
                this.#hasAtLeast2Elements = false
                this.#hasExactly2Elements = false
                this.#hasAtMost2Elements = true
                this.#hasNull = false
                this.#hasNoNulls = true
                this.#hasDuplicate = false
                this.#hasNoDuplicates = true
                return false
            }

            const firstValue = this[0] = firstIteratorValue.value
            const secondIteratorValue = iterator.next()
            if (secondIteratorValue.done) { // We have exactly 1 element in the iterator
                this.#lastIndexRetrieved = null
                this.#iterator = null
                this.#size = 1
                this.#isEmpty = false
                this.#isNotEmpty = true
                this.#hasExactly1Element = true
                this.#hasAtMost1Element = true
                this.#hasAtLeast2Elements = false
                this.#hasExactly2Elements = false
                this.#hasAtMost2Elements = true
                this.#hasNoNulls = !(this.#hasNull = firstValue == null)
                this.#hasDuplicate = false
                this.#hasNoDuplicates = true
                return true
            }

            this[this.#lastIndexRetrieved = 1] = secondIteratorValue.value
            this.#isEmpty = false
            this.#isNotEmpty = true
            return this.#hasExactly1Element = false
        }

        if (lastIndexRetrieved === 0) { // We only have the 1st value retrieved
            const firstValue = this[0] as T
            const secondIteratorValue = this._iterator.next()
            if (secondIteratorValue.done) { // We have exactly 1 element in the iterator
                this.#lastIndexRetrieved = null
                this.#iterator = null
                this.#size = 1
                this.#isEmpty = false
                this.#isNotEmpty = true
                this.#hasExactly1Element = true
                this.#hasAtMost1Element = true
                this.#hasAtLeast2Elements = false
                this.#hasExactly2Elements = false
                this.#hasAtMost2Elements = true
                this.#hasNoNulls = !(this.#hasNull = firstValue == null)
                this.#hasDuplicate = false
                this.#hasNoDuplicates = true
                return true
            }

            this[this.#lastIndexRetrieved = 1] = secondIteratorValue.value
            this.#isEmpty = false
            this.#isNotEmpty = true
            return this.#hasExactly1Element = false
        }

        // We have more than 1 element in the iterator
        this.#isEmpty = false
        this.#isNotEmpty = true
        this.#hasExactly1Element = false
        return false
    }

    public override get hasAtMost1Element(): boolean {
        const value = this.#hasAtMost1Element
        if (value != null)
            return value

        const lastIndexRetrieved = this.#lastIndexRetrieved
        if (lastIndexRetrieved == null) {
            // We retrieve at least the 1st element of the iterator (if it exists)
            const iterator = this._iterator
            const firstIteratorValue = iterator.next()
            if (firstIteratorValue.done) { // We have no element in the iterator
                this.#lastIndexRetrieved = null
                this.#iterator = null
                this.#size = 0
                this.#isEmpty = true
                this.#isNotEmpty = false
                this.#hasExactly1Element = false
                this.#hasAtMost1Element = true
                this.#hasAtLeast2Elements = false
                this.#hasExactly2Elements = false
                this.#hasAtMost2Elements = true
                this.#hasNull = false
                this.#hasNoNulls = true
                this.#hasDuplicate = false
                this.#hasNoDuplicates = true
                return true
            }

            const firstValue = this[0] = firstIteratorValue.value
            const secondIteratorValue = iterator.next()
            if (secondIteratorValue.done) { // We have exactly 1 element in the iterator
                this.#lastIndexRetrieved = null
                this.#iterator = null
                this.#size = 1
                this.#isEmpty = false
                this.#isNotEmpty = true
                this.#isEmpty = false
                this.#isNotEmpty = true
                this.#hasExactly1Element = true
                this.#hasAtMost1Element = true
                this.#hasAtLeast2Elements = false
                this.#hasExactly2Elements = false
                this.#hasAtMost2Elements = true
                this.#hasNoNulls = !(this.#hasNull = firstValue == null)
                this.#hasDuplicate = false
                this.#hasNoDuplicates = true
                return true
            }

            const secondValue = this[1] = secondIteratorValue.value
            const thirdIteratorValue = iterator.next()
            if (thirdIteratorValue.done) { // We have exactly 2 elements in the iterator
                this.#lastIndexRetrieved = null
                this.#iterator = null
                this.#size = 2
                this.#isEmpty = false
                this.#isNotEmpty = true
                this.#hasExactly1Element = false
                this.#hasAtMost1Element = false
                this.#hasAtLeast2Elements = true
                this.#hasExactly2Elements = true
                this.#hasAtMost2Elements = true
                this.#hasNoNulls = !(this.#hasNull = firstValue == null || secondValue == null)
                this.#hasNoDuplicates = !(this.#hasDuplicate = firstValue === secondValue)
                return false
            }

            // We have more than 2 elements in the iterator
            this[this.#lastIndexRetrieved = 2] = thirdIteratorValue.value
            this.#isEmpty = false
            this.#isNotEmpty = true
            this.#hasExactly1Element = false
            this.#hasAtMost1Element = false
            this.#hasAtLeast2Elements = true
            this.#hasExactly2Elements = false
            this.#hasAtMost2Elements = false
            return false
        }

        if (lastIndexRetrieved === 0) { // We only have the 1st value retrieved
            const firstValue = this[0] as T
            const iterator = this._iterator
            const secondIteratorValue = iterator.next()
            if (secondIteratorValue.done) { // We have exactly 1 element in the iterator
                this.#lastIndexRetrieved = null
                this.#iterator = null
                this.#size = 1
                this.#isEmpty = false
                this.#isNotEmpty = true
                this.#hasExactly1Element = true
                this.#hasAtMost1Element = true
                this.#hasAtLeast2Elements = false
                this.#hasExactly2Elements = false
                this.#hasAtMost2Elements = true
                this.#hasNoNulls = !(this.#hasNull = firstValue == null)
                this.#hasDuplicate = false
                this.#hasNoDuplicates = true
                return true
            }

            const secondValue = this[1] = secondIteratorValue.value
            const thirdIteratorValue = iterator.next()
            if (thirdIteratorValue.done) { // We have exactly 2 elements in the iterator
                this.#lastIndexRetrieved = null
                this.#iterator = null
                this.#size = 2
                this.#isEmpty = false
                this.#isNotEmpty = true
                this.#hasExactly1Element = false
                this.#hasAtMost1Element = false
                this.#hasAtLeast2Elements = true
                this.#hasExactly2Elements = true
                this.#hasAtMost2Elements = true
                this.#hasNoNulls = !(this.#hasNull = firstValue == null || secondValue == null)
                this.#hasNoDuplicates = !(this.#hasDuplicate = firstValue === secondValue)
                return false
            }

            // We have more than 2 elements in the iterator
            this[this.#lastIndexRetrieved = 2] = thirdIteratorValue.value
            this.#isEmpty = false
            this.#isNotEmpty = true
            this.#hasExactly1Element = false
            this.#hasAtMost1Element = false
            this.#hasAtLeast2Elements = true
            this.#hasExactly2Elements = false
            this.#hasAtMost2Elements = false
            return false
        }

        if (lastIndexRetrieved === 1) { // We only have the 1st and 2nd value retrieved
            const firstValue = this[0] as T
            const secondValue = this[1] as T
            const thirdIteratorValue = this._iterator.next()
            if (thirdIteratorValue.done) { // We have exactly 2 elements in the iterator
                this.#lastIndexRetrieved = null
                this.#size = 2
                this.#isEmpty = false
                this.#isNotEmpty = true
                this.#hasExactly1Element = false
                this.#hasAtMost1Element = false
                this.#hasAtLeast2Elements = true
                this.#hasExactly2Elements = true
                this.#hasAtMost2Elements = true
                this.#hasNoNulls = !(this.#hasNull = firstValue == null || secondValue == null)
                this.#hasNoDuplicates = !(this.#hasDuplicate = firstValue === secondValue)
                return false
            }

            // We have more than 2 elements in the iterator
            this[this.#lastIndexRetrieved = 2] = thirdIteratorValue.value
            this.#isEmpty = false
            this.#isNotEmpty = true
            this.#hasExactly1Element = false
            this.#hasAtMost1Element = false
            this.#hasAtLeast2Elements = true
            this.#hasExactly2Elements = false
            this.#hasAtMost2Elements = false
            return false
        }

        // We have more than 2 elements in the iterator
        this.#isEmpty = false
        this.#isNotEmpty = true
        this.#hasExactly1Element = false
        this.#hasAtMost1Element = false
        this.#hasAtLeast2Elements = true
        this.#hasExactly2Elements = false
        this.#hasAtMost2Elements = false
        return false
    }


    public override get hasAtLeast2Elements(): boolean {
        const value = this.#hasAtLeast2Elements
        if (value != null)
            return value

        const lastIndexRetrieved = this.#lastIndexRetrieved
        if (lastIndexRetrieved == null) {
            // We retrieve at least the 1st element of the iterator (if it exists)
            const iterator = this._iterator
            const firstIteratorValue = iterator.next()
            if (firstIteratorValue.done) { // We have no element in the iterator
                this.#lastIndexRetrieved = null
                this.#iterator = null
                this.#size = 0
                this.#isEmpty = true
                this.#isNotEmpty = false
                this.#hasExactly1Element = false
                this.#hasAtMost1Element = true
                this.#hasAtLeast2Elements = false
                this.#hasExactly2Elements = false
                this.#hasAtMost2Elements = true
                this.#hasNull = false
                this.#hasNoNulls = true
                this.#hasDuplicate = false
                this.#hasNoDuplicates = true
                return false
            }

            const firstValue = this[0] = firstIteratorValue.value
            const nextIteratorValue1 = iterator.next()
            if (nextIteratorValue1.done) { // We have exactly 1 element in the iterator
                this.#lastIndexRetrieved = null
                this.#iterator = null
                this.#size = 1
                this.#isEmpty = false
                this.#isNotEmpty = true
                this.#hasExactly1Element = true
                this.#hasAtMost1Element = true
                this.#hasAtLeast2Elements = false
                this.#hasExactly2Elements = false
                this.#hasAtMost2Elements = true
                this.#hasNoNulls = !(this.#hasNull = firstValue == null)
                this.#hasDuplicate = false
                this.#hasNoDuplicates = true
                return false
            }

            const secondValue = this[1] = nextIteratorValue1.value
            const secondNextIteratorValue1 = iterator.next()
            if (secondNextIteratorValue1.done) { // We have exactly 2 elements in the iterator
                this.#lastIndexRetrieved = null
                this.#iterator = null
                this.#size = 2
                this.#isEmpty = false
                this.#isNotEmpty = true
                this.#hasExactly1Element = false
                this.#hasAtMost1Element = false
                this.#hasAtLeast2Elements = true
                this.#hasExactly2Elements = true
                this.#hasAtMost2Elements = true
                this.#hasNoNulls = !(this.#hasNull = firstValue == null || secondValue == null)
                this.#hasNoDuplicates = !(this.#hasDuplicate = firstValue === secondValue)
                return true
            }

            // We have more than 2 elements in the iterator
            this[this.#lastIndexRetrieved = 2] = secondNextIteratorValue1.value
            this.#isEmpty = false
            this.#isNotEmpty = true
            this.#hasExactly1Element = false
            this.#hasAtMost1Element = false
            this.#hasAtLeast2Elements = true
            this.#hasExactly2Elements = false
            this.#hasAtMost2Elements = false
            return true
        }

        if (lastIndexRetrieved === 0) { // We only have the 1st value retrieved
            const firstValue = this[0] as T
            const iterator = this._iterator
            const secondIteratorValue = iterator.next()
            if (secondIteratorValue.done) { // We have exactly 1 element in the iterator
                this.#lastIndexRetrieved = null
                this.#iterator = null
                this.#size = 1
                this.#isEmpty = false
                this.#isNotEmpty = true
                this.#hasExactly1Element = true
                this.#hasAtMost1Element = true
                this.#hasAtLeast2Elements = false
                this.#hasExactly2Elements = false
                this.#hasAtMost2Elements = true
                this.#hasNoNulls = !(this.#hasNull = firstValue == null)
                this.#hasDuplicate = false
                this.#hasNoDuplicates = true
                return false
            }

            const secondValue = this[1] = secondIteratorValue.value
            const thirdIteratorValue = iterator.next()
            if (thirdIteratorValue.done) { // We have exactly 2 elements in the iterator
                this.#lastIndexRetrieved = null
                this.#iterator = null
                this.#size = 2
                this.#isEmpty = false
                this.#isNotEmpty = true
                this.#hasExactly1Element = false
                this.#hasAtMost1Element = false
                this.#hasAtLeast2Elements = true
                this.#hasExactly2Elements = true
                this.#hasAtMost2Elements = true
                this.#hasNoNulls = !(this.#hasNull = firstValue == null || secondValue == null)
                this.#hasNoDuplicates = !(this.#hasDuplicate = firstValue === secondValue)
                return true
            }

            // We have more than 2 elements in the iterator
            this[this.#lastIndexRetrieved = 2] = thirdIteratorValue.value
            this.#isEmpty = false
            this.#isNotEmpty = true
            this.#hasExactly1Element = false
            this.#hasAtMost1Element = false
            this.#hasAtLeast2Elements = true
            this.#hasExactly2Elements = false
            this.#hasAtMost2Elements = false
            return true
        }

        if (lastIndexRetrieved === 1) { // We only have the 1st and 2nd value retrieved
            const firstValue = this[0] as T
            const secondValue = this[1] as T
            const thirdIteratorValue = this._iterator.next()
            if (thirdIteratorValue.done) { // We have exactly 2 elements in the iterator
                this.#lastIndexRetrieved = null
                this.#iterator = null
                this.#size = 2
                this.#isEmpty = false
                this.#isNotEmpty = true
                this.#hasExactly1Element = false
                this.#hasAtMost1Element = false
                this.#hasAtLeast2Elements = true
                this.#hasExactly2Elements = true
                this.#hasAtMost2Elements = true
                this.#hasNoNulls = !(this.#hasNull = firstValue == null || secondValue == null)
                this.#hasNoDuplicates = !(this.#hasDuplicate = firstValue === secondValue)
                return true
            }

            // We have more than 2 elements in the iterator
            this[this.#lastIndexRetrieved = 2] = thirdIteratorValue.value
            this.#isEmpty = false
            this.#isNotEmpty = true
            this.#hasExactly1Element = false
            this.#hasAtMost1Element = false
            this.#hasAtLeast2Elements = true
            this.#hasExactly2Elements = false
            this.#hasAtMost2Elements = false
            return true
        }

        // We have more than 2 elements in the iterator
        this.#isEmpty = false
        this.#isNotEmpty = true
        this.#hasExactly1Element = false
        this.#hasAtMost1Element = false
        this.#hasAtLeast2Elements = true
        this.#hasExactly2Elements = false
        this.#hasAtMost2Elements = false
        return true
    }

    public override get hasExactly2Elements(): boolean {
        const value = this.#hasExactly2Elements
        if (value != null)
            return value

        const lastIndexRetrieved = this.#lastIndexRetrieved
        if (lastIndexRetrieved == null) {
            // We retrieve at least the 1st element of the iterator (if it exists)
            const iterator = this._iterator
            const firstIteratorValue = iterator.next()
            if (firstIteratorValue.done) { // We have no element in the iterator
                this.#lastIndexRetrieved = null
                this.#iterator = null
                this.#size = 0
                this.#isEmpty = true
                this.#isNotEmpty = false
                this.#hasExactly1Element = false
                this.#hasAtMost1Element = true
                this.#hasAtLeast2Elements = false
                this.#hasExactly2Elements = false
                this.#hasAtMost2Elements = true
                this.#hasNull = false
                this.#hasNoNulls = true
                this.#hasDuplicate = false
                this.#hasNoDuplicates = true
                return false
            }

            const firstValue = this[0] = firstIteratorValue.value
            const secondIteratorValue = iterator.next()
            if (secondIteratorValue.done) { // We have exactly 1 element in the iterator
                this.#lastIndexRetrieved = null
                this.#iterator = null
                this.#size = 1
                this.#isEmpty = false
                this.#isNotEmpty = true
                this.#hasExactly1Element = true
                this.#hasAtMost1Element = true
                this.#hasAtLeast2Elements = false
                this.#hasExactly2Elements = false
                this.#hasAtMost2Elements = true
                this.#hasNoNulls = !(this.#hasNull = firstValue == null)
                this.#hasDuplicate = false
                this.#hasNoDuplicates = true
                return false
            }

            const secondValue = this[1] = secondIteratorValue.value
            const thirdIteratorValue = iterator.next()
            if (thirdIteratorValue.done) { // We have exactly 2 elements in the iterator
                this.#lastIndexRetrieved = null
                this.#iterator = null
                this.#size = 2
                this.#isEmpty = false
                this.#isNotEmpty = true
                this.#hasExactly1Element = false
                this.#hasAtMost1Element = false
                this.#hasAtLeast2Elements = true
                this.#hasExactly2Elements = true
                this.#hasAtMost2Elements = true
                this.#hasNoNulls = !(this.#hasNull = firstValue == null || secondValue == null)
                this.#hasNoDuplicates = !(this.#hasDuplicate = firstValue === secondValue)
                return true
            }

            // We have more than 2 elements in the iterator
            this[this.#lastIndexRetrieved = 2] = thirdIteratorValue.value
            this.#isEmpty = false
            this.#isNotEmpty = true
            this.#hasExactly1Element = false
            this.#hasAtMost1Element = false
            this.#hasAtLeast2Elements = true
            this.#hasExactly2Elements = false
            this.#hasAtMost2Elements = false
            return false
        }

        if (lastIndexRetrieved === 0) { // We only have the 1st value retrieved
            const firstValue = this[0] as T
            const iterator = this._iterator
            const secondIteratorValue = iterator.next()
            if (secondIteratorValue.done) { // We have exactly 1 element in the iterator
                this.#lastIndexRetrieved = null
                this.#iterator = null
                this.#size = 1
                this.#isEmpty = false
                this.#isNotEmpty = true
                this.#hasExactly1Element = true
                this.#hasAtMost1Element = true
                this.#hasAtLeast2Elements = false
                this.#hasExactly2Elements = false
                this.#hasAtMost2Elements = true
                this.#hasNoNulls = !(this.#hasNull = firstValue == null)
                this.#hasDuplicate = false
                this.#hasNoDuplicates = true
                return false
            }

            const secondValue = this[1] = secondIteratorValue.value
            const thirdIteratorValue = iterator.next()
            if (thirdIteratorValue.done) { // We have exactly 2 elements in the iterator
                this.#lastIndexRetrieved = null
                this.#iterator = null
                this.#size = 2
                this.#isEmpty = false
                this.#isNotEmpty = true
                this.#hasExactly1Element = false
                this.#hasAtMost1Element = false
                this.#hasAtLeast2Elements = true
                this.#hasExactly2Elements = true
                this.#hasAtMost2Elements = true
                this.#hasNoNulls = !(this.#hasNull = firstValue == null || secondValue == null)
                this.#hasNoDuplicates = !(this.#hasDuplicate = firstValue === secondValue)
                return true
            }

            // We have more than 2 elements in the iterator
            this[this.#lastIndexRetrieved = 2] = thirdIteratorValue.value
            this.#isEmpty = false
            this.#isNotEmpty = true
            this.#hasExactly1Element = false
            this.#hasAtMost1Element = false
            this.#hasAtLeast2Elements = true
            this.#hasExactly2Elements = false
            this.#hasAtMost2Elements = false
            return false
        }

        if (lastIndexRetrieved === 1) { // We only have the 1st and 2nd value retrieved
            const firstValue = this[0] as T
            const secondValue = this[1] as T
            const thirdIteratorValue = this._iterator.next()
            if (thirdIteratorValue.done) { // We have exactly 2 elements in the iterator
                this.#lastIndexRetrieved = null
                this.#iterator = null
                this.#size = 2
                this.#isEmpty = false
                this.#isNotEmpty = true
                this.#hasExactly1Element = false
                this.#hasAtMost1Element = false
                this.#hasAtLeast2Elements = true
                this.#hasExactly2Elements = true
                this.#hasAtMost2Elements = true
                this.#hasNoNulls = !(this.#hasNull = firstValue == null || secondValue == null)
                this.#hasNoDuplicates = !(this.#hasDuplicate = firstValue === secondValue)
                return true
            }

            // We have more than 2 elements in the iterator
            this[this.#lastIndexRetrieved = 2] = thirdIteratorValue.value
            this.#isEmpty = false
            this.#isNotEmpty = true
            this.#hasExactly1Element = false
            this.#hasAtMost1Element = false
            this.#hasAtLeast2Elements = true
            this.#hasExactly2Elements = false
            this.#hasAtMost2Elements = false
            return false
        }

        // We have more than 2 elements in the iterator
        this.#isEmpty = false
        this.#isNotEmpty = true
        this.#hasExactly1Element = false
        this.#hasAtMost1Element = false
        this.#hasAtLeast2Elements = true
        this.#hasExactly2Elements = false
        this.#hasAtMost2Elements = false
        return false
    }

    public override get hasAtMost2Elements(): boolean {
        const value = this.#hasAtMost2Elements
        if (value != null)
            return value

        const lastIndexRetrieved = this.#lastIndexRetrieved
        if (lastIndexRetrieved == null) {
            // We retrieve at least the 1st element of the iterator (if it exists)
            const iterator = this._iterator
            const firstIteratorValue = iterator.next()
            if (firstIteratorValue.done) { // We have no element in the iterator
                this.#lastIndexRetrieved = null
                this.#iterator = null
                this.#size = 0
                this.#isEmpty = true
                this.#isNotEmpty = false
                this.#hasExactly1Element = false
                this.#hasAtMost1Element = true
                this.#hasAtLeast2Elements = false
                this.#hasExactly2Elements = false
                this.#hasAtMost2Elements = true
                this.#hasNull = false
                this.#hasNoNulls = true
                this.#hasDuplicate = false
                this.#hasNoDuplicates = true
                return true
            }

            const firstValue = this[0] = firstIteratorValue.value
            const secondIteratorValue = iterator.next()
            if (secondIteratorValue.done) { // We have exactly 1 element in the iterator
                this.#lastIndexRetrieved = null
                this.#iterator = null
                this.#size = 1
                this.#isEmpty = false
                this.#isNotEmpty = true
                this.#hasExactly1Element = true
                this.#hasAtMost1Element = true
                this.#hasAtLeast2Elements = false
                this.#hasExactly2Elements = false
                this.#hasAtMost2Elements = true
                this.#hasNoNulls = !(this.#hasNull = firstValue == null)
                this.#hasDuplicate = false
                this.#hasNoDuplicates = true
                return true
            }

            const secondValue = this[1] = secondIteratorValue.value
            const thirdIteratorValue = iterator.next()
            if (thirdIteratorValue.done) { // We have exactly 2 elements in the iterator
                this.#lastIndexRetrieved = null
                this.#iterator = null
                this.#size = 2
                this.#isEmpty = false
                this.#isNotEmpty = true
                this.#hasExactly1Element = false
                this.#hasAtMost1Element = false
                this.#hasAtLeast2Elements = true
                this.#hasExactly2Elements = true
                this.#hasAtMost2Elements = true
                this.#hasNoNulls = !(this.#hasNull = firstValue == null || secondValue == null)
                this.#hasNoDuplicates = !(this.#hasDuplicate = firstValue === secondValue)
                return true
            }

            // We have more than 2 elements in the iterator
            this[this.#lastIndexRetrieved = 2] = thirdIteratorValue.value
            this.#isEmpty = false
            this.#isNotEmpty = true
            this.#hasExactly1Element = false
            this.#hasAtMost1Element = false
            this.#hasAtLeast2Elements = true
            this.#hasExactly2Elements = false
            this.#hasAtMost2Elements = false
            return false
        }

        if (lastIndexRetrieved === 0) { // We only have the 1st value retrieved
            const firstValue = this[0] as T
            const iterator = this._iterator
            const secondIteratorValue = iterator.next()
            if (secondIteratorValue.done) { // We have exactly 1 element in the iterator
                this.#lastIndexRetrieved = null
                this.#iterator = null
                this.#size = 1
                this.#isEmpty = false
                this.#isNotEmpty = true
                this.#hasExactly1Element = true
                this.#hasAtMost1Element = true
                this.#hasAtLeast2Elements = false
                this.#hasExactly2Elements = false
                this.#hasAtMost2Elements = true
                this.#hasNoNulls = !(this.#hasNull = firstValue == null)
                this.#hasDuplicate = false
                this.#hasNoDuplicates = true
                return true
            }

            const secondValue = this[1] = secondIteratorValue.value
            const thirdIteratorValue = iterator.next()
            if (thirdIteratorValue.done) { // We have exactly 2 elements in the iterator
                this.#lastIndexRetrieved = null
                this.#iterator = null
                this.#size = 2
                this.#isEmpty = false
                this.#isNotEmpty = true
                this.#hasExactly1Element = false
                this.#hasAtMost1Element = false
                this.#hasAtLeast2Elements = true
                this.#hasExactly2Elements = true
                this.#hasAtMost2Elements = true
                this.#hasNoNulls = !(this.#hasNull = firstValue == null || secondValue == null)
                this.#hasNoDuplicates = !(this.#hasDuplicate = firstValue === secondValue)
                return true
            }

            // We have more than 2 elements in the iterator
            this[this.#lastIndexRetrieved = 2] = thirdIteratorValue.value
            this.#isEmpty = false
            this.#isNotEmpty = true
            this.#hasExactly1Element = false
            this.#hasAtMost1Element = false
            this.#hasAtLeast2Elements = true
            this.#hasExactly2Elements = false
            this.#hasAtMost2Elements = false
            return false
        }

        if (lastIndexRetrieved === 1) { // We only have the 1st and 2nd value retrieved
            const firstValue = this[0] as T
            const secondValue = this[1] as T
            const thirdIteratorValue = this._iterator.next()
            if (thirdIteratorValue.done) { // We have exactly 2 elements in the iterator
                this.#lastIndexRetrieved = null
                this.#iterator = null
                this.#size = 2
                this.#isEmpty = false
                this.#isNotEmpty = true
                this.#hasExactly1Element = false
                this.#hasAtMost1Element = false
                this.#hasAtLeast2Elements = true
                this.#hasExactly2Elements = true
                this.#hasAtMost2Elements = true
                this.#hasNoNulls = !(this.#hasNull = firstValue == null || secondValue == null)
                this.#hasNoDuplicates = !(this.#hasDuplicate = firstValue === secondValue)
                return true
            }

            // We have more than 2 elements in the iterator
            this[this.#lastIndexRetrieved = 2] = thirdIteratorValue.value
            this.#isEmpty = false
            this.#isNotEmpty = true
            this.#hasExactly1Element = false
            this.#hasAtMost1Element = false
            this.#hasAtLeast2Elements = true
            this.#hasExactly2Elements = false
            this.#hasAtMost2Elements = false
            return false
        }

        // We have more than 2 elements in the iterator
        this.#isEmpty = false
        this.#isNotEmpty = true
        this.#hasExactly1Element = false
        this.#hasAtMost1Element = false
        this.#hasAtLeast2Elements = true
        this.#hasExactly2Elements = false
        this.#hasAtMost2Elements = false
        return false
    }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    public override get(index: number,): T {
        if (this.isEmpty)
            throw new EmptyCollectionException(null, index,)

        if (Number.isNaN(index,))
            throw new ForbiddenIndexException("Forbidden index. The index cannot be NaN.", index,)
        if (index === Number.NEGATIVE_INFINITY)
            throw new ForbiddenIndexException("Forbidden index. The index cannot be -∞.", index,)
        if (index === Number.POSITIVE_INFINITY)
            throw new ForbiddenIndexException("Forbidden index. The index cannot be +∞.", index,)

        if (index in this)
            return this[index] as T

        if (index < 0) {
            // We retrieve all the items and get calculate to get a positive index
            const indexToRetrieve = this.size + index
            if (indexToRetrieve in this)
                return this[indexToRetrieve] as T
            throw new IndexOutOfBoundsException(`Index out of bound. The index “${index}” (${indexToRetrieve} after calculation) is under 0.`, index,)
        }

        // We will only search until the index on the Iterator has been reached.
        // It is still possible to have the index not being possible from an iterator
        // After that, it will return the value found by its iterator (if it is valid)
        const iterator = this._iterator
        const indexPlus1 = index + 1
        let iteratorValue: IteratorResult<T, unknown>
        // It is impossible to get a null lastIndexRetrieved if we have validated from isEmpty
        let indexToFind = this.#lastIndexRetrieved!
        while (++indexToFind < indexPlus1) {
            iteratorValue = iterator.next()
            if (iteratorValue.done) {
                // We are at the end of the iterator and thus,
                // nothing can be returned from the iterator that should be found
                this.#iterator = null
                this.#lastIndexRetrieved = null
                if (indexToFind === index)
                    throw new IndexOutOfBoundsException(`Index out of bound. The index “${indexToFind}” is the size of the collection (${index}).`, indexToFind,)
                throw new IndexOutOfBoundsException(`Index out of bound. The index “${indexToFind}” is over the size of the collection (${index}).`, indexToFind,)
            }
            this[indexToFind] = iteratorValue.value
        }
        return this[this.#lastIndexRetrieved = indexToFind - 1] as T
    }

    //#endregion -------------------- Get --------------------
    //#region -------------------- Get first --------------------

    public override getFirst(): T {
        if (this.isEmpty)
            throw new EmptyCollectionException()
        // It is impossible to get nothing since isEmpty has already been validated
        return this[0] as T
    }

    //#endregion -------------------- Get first --------------------

    //#region -------------------- Get or else --------------------

    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) {
        if (this.isEmpty)
            return defaultValue(index,)

        if (Number.isNaN(index,))
            return defaultValue(index,)
        if (index === Number.NEGATIVE_INFINITY)
            return defaultValue(index,)
        if (index === Number.POSITIVE_INFINITY)
            return defaultValue(index,)

        if (index in this)
            return this[index] as T

        if (index < 0) {
            const indexToRetrieve = this.size + index
            if (indexToRetrieve in this)
                return this[indexToRetrieve] as T
            return defaultValue(index,)
        }

        // We will only search until the index on the Iterator has been reached.
        // It is still possible to have the index not being possible from an iterator
        // After that, it will return the value found by its iterator (if it is valid)
        const iterator = this._iterator
        const indexPlus1 = index + 1
        let iteratorValue: IteratorResult<T, unknown>
        // It is impossible to get a null lastIndexRetrieved if we have validated from isEmpty
        let indexToFind = this.#lastIndexRetrieved!
        while (++indexToFind < indexPlus1) {
            iteratorValue = iterator.next()
            if (iteratorValue.done) {
                // We are at the end of the iterator and thus,
                // nothing can be returned from the iterator that should be found
                this.#iterator = null
                this.#lastIndexRetrieved = null
                return defaultValue(index,)
            }
            this[indexToFind] = iteratorValue.value
        }
        return this[this.#lastIndexRetrieved = indexToFind - 1] as T
    }

    //#endregion -------------------- Get or else --------------------
    //#region -------------------- Get first or else --------------------

    public override getFirstOrElse<const U, >(defaultValue: ReturnCallback<U>,): | T | U
    public override getFirstOrElse(defaultValue: ReturnCallback<T>,): T
    public override getFirstOrElse(defaultValue: ReturnCallback<unknown>,) {
        if (this.isEmpty)
            return defaultValue()
        // It is impossible to get nothing since isEmpty has already been validated
        return this[0] as T
    }

    //#endregion -------------------- Get first or else --------------------

    //#region -------------------- Get or null --------------------

    public override getOrNull(index: number,): NullOr<T> {
        if (this.isEmpty)
            return null

        if (Number.isNaN(index,))
            return null
        if (index === Number.NEGATIVE_INFINITY)
            return null
        if (index === Number.POSITIVE_INFINITY)
            return null

        if (index in this)
            return this[index] as T

        if (index < 0) {
            const indexToRetrieve = this.size + index
            if (indexToRetrieve in this)
                return this[indexToRetrieve] as T
            return null
        }

        // We will only search until the index on the Iterator has been reached.
        // It is still possible to have the index not being possible from an iterator
        // After that, it will return the value found by its iterator (if it is valid)
        const iterator = this._iterator
        const indexPlus1 = index + 1
        let iteratorValue: IteratorResult<T, unknown>
        // It is impossible to get a null lastIndexRetrieved if we have validated from isEmpty
        let indexToFind = this.#lastIndexRetrieved!
        while (++indexToFind < indexPlus1) {
            iteratorValue = iterator.next()
            if (iteratorValue.done) {
                // We are at the end of the iterator and thus,
                // nothing can be returned from the iterator that should be found
                this.#iterator = null
                this.#lastIndexRetrieved = null
                return null
            }
            this[indexToFind] = iteratorValue.value
        }
        return this[this.#lastIndexRetrieved = indexToFind - 1] as T
    }

    //#endregion -------------------- Get or null --------------------
    //#region -------------------- Get first or null --------------------

    public override getFirstOrNull(): NullOr<T> {
        if (this.isEmpty)
            return null
        // It is impossible to get nothing since isEmpty has already been validated
        return this[0] as T
    }

    //#endregion -------------------- Get first or null --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Validation methods --------------------

    //#region -------------------- Has ‥ --------------------

    public override get hasNull(): boolean {
        const value = this.#hasNull
        if (value != null)
            return value

        const lastIndexRetrieved = this.#lastIndexRetrieved
        if (lastIndexRetrieved == null) {
            const iterator = this._iterator
            let iteratorResult: IteratorResult<T, unknown>
            let index = -1
            while (!(iteratorResult = iterator.next()).done)
                if ((this[++index] = iteratorResult.value) == null) {
                    this.#lastIndexRetrieved = index
                    this.#hasNull = true
                    this.#hasNoNulls = false
                    return true
                }

            this.#lastIndexRetrieved = index
            this.#hasNull = false
            this.#hasNoNulls = true
            return false
        }

        let index = -1
        // We compare the elements from the lastIndexRetrieved, and afterward, we loop through the iterator
        while (++index <= lastIndexRetrieved)
            if (this[index] == null) {
                this.#lastIndexRetrieved = index
                this.#hasNull = true
                this.#hasNoNulls = false
                return true
            }

        index--
        const iterator = this._iterator
        let iteratorResult: IteratorResult<T, unknown>
        while (!(iteratorResult = iterator.next()).done)
            if ((this[++index] = iteratorResult.value) == null) {
                this.#lastIndexRetrieved = index
                this.#hasNull = true
                this.#hasNoNulls = false
                return true
            }

        this.#lastIndexRetrieved = index
        this.#hasNull = false
        this.#hasNoNulls = true
        return false
    }

    public override get hasNoNulls(): boolean {
        const value = this.#hasNoNulls
        if (value != null)
            return value

        const lastIndexRetrieved = this.#lastIndexRetrieved
        if (lastIndexRetrieved == null) {
            const iterator = this._iterator
            let iteratorResult: IteratorResult<T, unknown>
            let index = -1
            while (!(iteratorResult = iterator.next()).done)
                if ((this[++index] = iteratorResult.value) == null) {
                    this.#lastIndexRetrieved = index
                    this.#hasNull = true
                    this.#hasNoNulls = false
                    return false
                }

            this.#lastIndexRetrieved = index
            this.#hasNull = false
            this.#hasNoNulls = true
            return true
        }

        // We compare the elements from the lastIndexRetrieved, and afterward, we loop through the iterator
        let index = -1
        while (++index <= lastIndexRetrieved)
            if (this[index] == null) {
                this.#lastIndexRetrieved = index
                this.#hasNull = true
                this.#hasNoNulls = false
                return false
            }

        index--
        const iterator = this._iterator
        let iteratorResult: IteratorResult<T, unknown>
        while (!(iteratorResult = iterator.next()).done)
            if ((this[++index] = iteratorResult.value) == null) {
                this.#lastIndexRetrieved = index
                this.#hasNull = true
                this.#hasNoNulls = false
                return false
            }

        this.#lastIndexRetrieved = index
        this.#hasNull = false
        this.#hasNoNulls = true
        return true
    }


    public override get hasDuplicate(): boolean {
        const value = this.#hasDuplicate
        if (value != null)
            return value

        const lastIndexRetrieved = this.#lastIndexRetrieved
        if (lastIndexRetrieved == null) {
            const iterator = this._iterator
            let iteratorResult = iterator.next()
            if (iteratorResult.done) { // We have no element in the iterator
                this.#lastIndexRetrieved = null
                this.#iterator = null
                this.#size = 0
                this.#isEmpty = true
                this.#isNotEmpty = false
                this.#hasExactly1Element = false
                this.#hasAtMost1Element = true
                this.#hasAtLeast2Elements = false
                this.#hasExactly2Elements = false
                this.#hasAtMost2Elements = true
                this.#hasNull = false
                this.#hasNoNulls = true
                this.#hasDuplicate = false
                this.#hasNoDuplicates = true
                return false
            }

            const temporaryArray: MutableArray<T> = [iteratorResult.value,]
            let amountOfItemAdded = 1
            let index1 = -1
            // We do straight validation with temporary array to not re-call the iterator
            while (!(iteratorResult = iterator.next()).done) {
                const iteratorValue1 = this[++index1] = iteratorResult.value
                let index2 = -1
                while (++index2 < amountOfItemAdded)
                    if (temporaryArray[index2] === iteratorValue1) {
                        this.#lastIndexRetrieved = index1
                        this.#hasDuplicate = true
                        this.#hasNoDuplicates = false
                        return true
                    }
                temporaryArray[amountOfItemAdded++] = iteratorValue1
            }

            this.#lastIndexRetrieved = index1
            this.#hasDuplicate = false
            this.#hasNoDuplicates = true
            return false

        }

        // We compare the elements from the lastIndexRetrieved, and afterward, we loop through the iterator
        const temporaryArray: MutableArray<T> = []
        let amountOfItemAdded = 0
        let index1 = -1
        while (++index1 <= lastIndexRetrieved) {
            const instanceValue = this[index1] as T
            let index2 = -1
            while (++index2 < amountOfItemAdded)
                if (temporaryArray[index2] === instanceValue) {
                    this.#lastIndexRetrieved = index1
                    this.#hasDuplicate = true
                    this.#hasNoDuplicates = false
                    return true
                }
            temporaryArray[amountOfItemAdded++] = instanceValue
        }

        index1--
        const iterator = this._iterator
        let iteratorResult: IteratorResult<T, unknown>
        while (!(iteratorResult = iterator.next()).done) {
            const iteratorValue = this[++index1] = iteratorResult.value
            let index2 = -1
            while (++index2 < amountOfItemAdded)
                if (temporaryArray[index2] === iteratorValue) {
                    this.#lastIndexRetrieved = index1
                    this.#hasDuplicate = true
                    this.#hasNoDuplicates = false
                    return true
                }
            temporaryArray[amountOfItemAdded++] = iteratorValue
        }

        this.#lastIndexRetrieved = index1
        this.#hasDuplicate = false
        this.#hasNoDuplicates = true
        return false
    }

    public override get hasNoDuplicates(): boolean {
        const value = this.#hasNoDuplicates
        if (value != null)
            return value

        const lastIndexRetrieved = this.#lastIndexRetrieved
        if (lastIndexRetrieved == null) {
            const iterator = this._iterator
            let iteratorResult = iterator.next()
            if (iteratorResult.done) { // We have no element in the iterator
                this.#lastIndexRetrieved = null
                this.#iterator = null
                this.#size = 0
                this.#isEmpty = true
                this.#isNotEmpty = false
                this.#hasExactly1Element = false
                this.#hasAtMost1Element = true
                this.#hasAtLeast2Elements = false
                this.#hasExactly2Elements = false
                this.#hasAtMost2Elements = true
                this.#hasNull = false
                this.#hasNoNulls = true
                this.#hasDuplicate = false
                this.#hasNoDuplicates = true
                return true
            }

            const temporaryArray: MutableArray<T> = [iteratorResult.value,]
            let amountOfItemAdded =  1
            let index1 = -1
            // We do straight validation with temporary array to not re-call the iterator
            while (!(iteratorResult = iterator.next()).done) {
                const iteratorValue = this[++index1] = iteratorResult.value
                let index2 = -1
                while (++index2 < amountOfItemAdded)
                    if (temporaryArray[index2] === iteratorValue) {
                        this.#lastIndexRetrieved = index1
                        this.#hasDuplicate = true
                        this.#hasNoDuplicates = false
                        return false
                    }
                temporaryArray[amountOfItemAdded++] = iteratorValue
            }
            this.#lastIndexRetrieved = index1
            this.#hasDuplicate = false
            this.#hasNoDuplicates = true
            return true

        }

        // We compare the elements from the lastIndexRetrieved, and afterward, we loop through the iterator
        const temporaryArray: MutableArray<T> = []
        let amountOfItemAdded = 0
        let index1 = -1
        while (++index1 <= lastIndexRetrieved) {
            const instanceValue = this[index1] as T
            let index2 = -1
            while (++index2 < amountOfItemAdded)
                if (temporaryArray[index2] === instanceValue) {
                    this.#lastIndexRetrieved = index1
                    this.#hasDuplicate = true
                    this.#hasNoDuplicates = false
                    return false
                }
            temporaryArray[amountOfItemAdded++] = instanceValue
        }

        index1--
        const iterator = this._iterator
        let iteratorResult: IteratorResult<T, unknown>
        while (!(iteratorResult = iterator.next()).done) {
            const iteratorValue = this[++index1] = iteratorResult.value
            let index2 = -1
            while (++index2 < amountOfItemAdded)
                if (temporaryArray[index2] === iteratorValue) {
                    this.#lastIndexRetrieved = index1
                    this.#hasDuplicate = true
                    this.#hasNoDuplicates = false
                    return false
                }
            temporaryArray[amountOfItemAdded++] = iteratorValue
        }

        this.#lastIndexRetrieved = index1
        this.#hasDuplicate = false
        this.#hasNoDuplicates = true
        return true
    }

    //#endregion -------------------- Has ‥ --------------------

    //#endregion -------------------- Validation methods --------------------

    //#endregion -------------------- Methods --------------------

}

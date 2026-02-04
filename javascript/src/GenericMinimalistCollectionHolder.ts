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

import type {CollectionHolder}                                   from "./CollectionHolder"
import type {IterableWithCount}                                  from "./iterable/IterableWithCount"
import type {IterableWithLength}                                 from "./iterable/IterableWithLength"
import type {IterableWithPossibleSize}                           from "./iterable/IterableWithPossibleSize"
import type {IterableWithSize}                                   from "./iterable/IterableWithSize"
import type {CollectionIterator}                                 from "./iterator/CollectionIterator"
import type {PossibleIterableIteratorArraySetOrCollectionHolder} from "./type/possibleInstance"

import {AbstractMinimalistCollectionHolder}      from "./AbstractMinimalistCollectionHolder"
import {CollectionConstants}                     from "./CollectionConstants"
import {MinimalistCollectionHolder}              from "./MinimalistCollectionHolder"
import {EmptyCollectionException}                from "./exception/EmptyCollectionException"
import {ForbiddenIndexException}                 from "./exception/ForbiddenIndexException"
import {IndexOutOfBoundsException}               from "./exception/IndexOutOfBoundsException"
import {isArray}                                 from "./method/isArray"
import {isArrayByStructure}                      from "./method/isArrayByStructure"
import {isCollectionHolder}                      from "./method/isCollectionHolder"
import {isCollectionHolderByStructure}           from "./method/isCollectionHolderByStructure"
import {isCollectionIterator}                    from "./method/isCollectionIterator"
import {isCollectionIteratorByStructure}         from "./method/isCollectionIteratorByStructure"
import {isIterator}                              from "./method/isIterator"
import {isIteratorByStructure}                   from "./method/isIteratorByStructure"
import {isMinimalistCollectionHolder}            from "./method/isMinimalistCollectionHolder"
import {isMinimalistCollectionHolderByStructure} from "./method/isMinimalistCollectionHolderByStructure"
import {isSet}                                   from "./method/isSet"
import {isSetByStructure}                        from "./method/isSetByStructure"

/**
 * A {@link MinimalistCollectionHolder} having the values eagerly retrieved.
 *
 * Meaning that every value is retrieved during the construction,
 * and it will never change after the initialization.
 *
 * But it is not {@link Object.isFrozen frozen} to ensure
 * the children can do their initialization.
 *
 * @typeParam T         The element type
 * @typeParam REFERENCE (deprecated, it will be removed in version 1.14) The reference passed in the constructor
 * @see GenericCollectionHolder
 * @see LazyGenericCollectionHolder
 * @see EmptyCollectionHolder
 */
export class GenericMinimalistCollectionHolder<const T = unknown, >
    extends AbstractMinimalistCollectionHolder<T> {

    //#region -------------------- Fields --------------------

    readonly #size: number

    readonly #reference: PossibleIterableIteratorArraySetOrCollectionHolder<T>
    readonly #array: readonly T[]

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor(array:                                readonly T[],)
    public constructor(lateArray:                      () => readonly T[],)
    public constructor(set:                                  ReadonlySet<T>,)
    public constructor(lateSet:                        () => ReadonlySet<T>,)
    public constructor(collectionHolder:                     CollectionHolder<T>,)
    public constructor(lateCollectionHolder:           () => CollectionHolder<T>,)
    public constructor(minimalistCollectionHolder:           MinimalistCollectionHolder<T>,)
    public constructor(lateMinimalistCollectionHolder: () => MinimalistCollectionHolder<T>,)
    public constructor(collectionIterator:                   CollectionIterator<T>,)
    public constructor(lateCollectionIterator:         () => CollectionIterator<T>,)
    public constructor(iterator:                             Iterator<T, unknown, unknown>,)
    public constructor(lateIterator:                   () => Iterator<T, unknown, unknown>,)
    public constructor(iterableWithSize:                     IterableWithSize<T>,)
    public constructor(lateIterableWithSize:           () => IterableWithSize<T>,)
    public constructor(iterableWithLength:                   IterableWithLength<T>,)
    public constructor(lateIterableWithLength:         () => IterableWithLength<T>,)
    public constructor(iterableWithCount:                    IterableWithCount<T>,)
    public constructor(lateIterableWithCount:          () => IterableWithCount<T>,)
    public constructor(iterableWithPossibleSize:             IterableWithPossibleSize<T>,)
    public constructor(lateIterableWithPossibleSize:   () => IterableWithPossibleSize<T>,)
    public constructor(iterable:                             Iterable<T, unknown, unknown>,)
    public constructor(lateIterable:                   () => Iterable<T, unknown, unknown>,)
    public constructor(reference:                            PossibleIterableIteratorArraySetOrCollectionHolder<T>,)
    public constructor(lateReference:                  () => PossibleIterableIteratorArraySetOrCollectionHolder<T>,)
    public constructor(reference: | PossibleIterableIteratorArraySetOrCollectionHolder<T> | (() => PossibleIterableIteratorArraySetOrCollectionHolder<T>),)
    public constructor(reference: | PossibleIterableIteratorArraySetOrCollectionHolder<T> | (() => PossibleIterableIteratorArraySetOrCollectionHolder<T>),) {
        super()
        // README: The code is based on the GenericCollectionHolder constructor, but with fewer things handled
        //         Also, the eager instantiation has some weird shenanigan to keep its nature pure.
        //         And, to be efficient, there is some duplicate code in the constructor.

        if (reference instanceof Function)
            reference = reference()
        this.#reference = reference

        //#region -------------------- Initialization from Array --------------------

        if (isArray(reference,)) {
            const size = this.#size = reference.length

            //#region -------------------- Initialization (size = 0) --------------------

            if (size == 0) {
                this.#array = CollectionConstants.EMPTY_ARRAY
                return
            }

            //#endregion -------------------- Initialization (size = 0) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                this.#array = Object.freeze([reference[0] as T,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                this.#array = Object.freeze([reference[0] as T, reference[1] as T,],)
                return
            }

            //#endregion -------------------- Initialization (size = 2) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array = new Array<T>(size,)
            let index = size
            while (index-- > 0)
                array[index] = reference[index] as T
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 2) --------------------
        }

        //#endregion -------------------- Initialization from Array --------------------
        //#region -------------------- Initialization from Set --------------------

        if (isSet(reference,)) {
            const size = this.#size = reference.size

            //#region -------------------- Initialization (size = 0) --------------------

            if (size == 0) {
                this.#array = CollectionConstants.EMPTY_ARRAY
                return
            }

            //#endregion -------------------- Initialization (size = 0) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                this.#array = Object.freeze([reference[Symbol.iterator]().next().value as T,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                const iterator = reference[Symbol.iterator]()
                this.#array = Object.freeze([iterator.next().value as T, iterator.next().value as T,],)
                return
            }

            //#endregion -------------------- Initialization (size = 2) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array = new Array<T>(size,)
            const iterator = reference[Symbol.iterator]()
            let index = -1
            while (++index < size)
                array[index] = iterator.next().value as T
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 2) --------------------
        }

        //#endregion -------------------- Initialization from Set --------------------
        //#region -------------------- Initialization from CollectionHolder --------------------

        if (isCollectionHolder(reference,)) {
            //#region -------------------- Initialization (size = 0) --------------------

            if (reference.isEmpty) {
                this.#size = 0
                this.#array = CollectionConstants.EMPTY_ARRAY
                return
            }

            //#endregion -------------------- Initialization (size = 0) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            const size = this.#size = reference.size
            if (size == 1) {
                this.#array = Object.freeze([reference.getFirst(),],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                this.#array = Object.freeze([reference.getFirst(), reference.getLast(),],)
                return
            }

            //#endregion -------------------- Initialization (size = 2) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array = new Array<T>(size,)
            let index = size
            while (index-- > 0)
                array[index] = reference.get(index,)
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 2) --------------------
        }

        //#endregion -------------------- Initialization from CollectionHolder --------------------
        //#region -------------------- Initialization from MinimalistCollectionHolder --------------------

        if (isMinimalistCollectionHolder(reference,)) {
            const size = this.#size = reference.size

            //#region -------------------- Initialization (size = 0) --------------------

            if (size == 0) {
                this.#array = CollectionConstants.EMPTY_ARRAY
                return
            }

            //#endregion -------------------- Initialization (size = 0) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                this.#array = Object.freeze([reference.get(0,),],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                this.#array = Object.freeze([reference.get(0,), reference.get(1,),],)
                return
            }

            //#endregion -------------------- Initialization (size = 2) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array = new Array<T>(size,)
            let index = size
            while (index-- > 0)
                array[index] = reference.get(index,)
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 2) --------------------
        }

        //#endregion -------------------- Initialization from MinimalistCollectionHolder --------------------
        //#region -------------------- Initialization from CollectionIterator --------------------

        if (isCollectionIterator(reference,)) {
            //#region -------------------- Initialization (size = 0) --------------------

            if (reference.isEmpty) {
                this.#size = 0
                this.#array = CollectionConstants.EMPTY_ARRAY
                return
            }

            //#endregion -------------------- Initialization (size = 0) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            const size = this.#size = reference.size
            if (size == 1) {
                this.#array = Object.freeze([reference.nextValue,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                this.#array = Object.freeze([reference.nextValue, reference.nextValue,],)
                return
            }

            //#endregion -------------------- Initialization (size = 2) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array = new Array<T>(size,)
            let index = size
            while (index-- > 0)
                array[index] = reference.previousValue
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 2) --------------------
        }

        //#endregion -------------------- Initialization from CollectionIterator --------------------
        //#region -------------------- Initialization from Iterator --------------------

        if (isIterator(reference,)) {
            let iteratorResult = reference.next()

            //#region -------------------- Initialization (size = 0) --------------------

            if (iteratorResult.done === true) {
                this.#size = 0
                this.#array = CollectionConstants.EMPTY_ARRAY
                return
            }

            //#endregion -------------------- Initialization (size = 0) --------------------
            //#region -------------------- Initialization (size = over 0) --------------------

            const array: T[] = []
            array[0] = iteratorResult.value
            let size = 0
            while (++size, !(iteratorResult = reference.next()).done)
                array[size] = iteratorResult.value
            this.#size = size
            this.#array = Object.freeze(array,)

            //#endregion -------------------- Initialization (size = over 0) --------------------

            return
        }

        //#endregion -------------------- Initialization from Iterator --------------------

        //#region -------------------- Initialization from Array by structure --------------------

        if (isArrayByStructure<T>(reference,)) {
            const size = this.#size = reference.length

            //#region -------------------- Initialization (size = 0) --------------------

            if (size == 0) {
                this.#array = CollectionConstants.EMPTY_ARRAY
                return
            }

            //#endregion -------------------- Initialization (size = 0) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                this.#array = Object.freeze([reference[0] as T,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                this.#array = Object.freeze([reference[0] as T, reference[1] as T,],)
                return
            }

            //#endregion -------------------- Initialization (size = 2) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array = new Array<T>(size,)
            let index = size
            while (index-- > 0)
                array[index] = reference[index] as T
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 2) --------------------
        }

        //#endregion -------------------- Initialization from Array by structure --------------------
        //#region -------------------- Initialization from Set by structure --------------------

        if (isSetByStructure<T>(reference,)) {
            const size = this.#size = reference.size

            //#region -------------------- Initialization (size = 0) --------------------

            if (size == 0) {
                this.#array = CollectionConstants.EMPTY_ARRAY
                return
            }

            //#endregion -------------------- Initialization (size = 0) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                this.#array = Object.freeze([reference[Symbol.iterator]().next().value as T,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                const iterator = reference[Symbol.iterator]()
                this.#array = Object.freeze([iterator.next().value as T, iterator.next().value as T,],)
                return
            }

            //#endregion -------------------- Initialization (size = 2) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array = new Array<T>(size,)
            const iterator = reference[Symbol.iterator]()
            let index = -1
            while (++index < size)
                array[index] = iterator.next().value as T
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 2) --------------------
        }

        //#endregion -------------------- Initialization from Set by structure --------------------
        //#region -------------------- Initialization from CollectionHolder by structure --------------------

        if (isCollectionHolderByStructure<T>(reference,)) {
            //#region -------------------- Initialization (size = 0) --------------------

            if (reference.isEmpty) {
                this.#size = 0
                this.#array = CollectionConstants.EMPTY_ARRAY
                return
            }

            //#endregion -------------------- Initialization (size = 0) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            const size = this.#size = reference.size
            if (size == 1) {
                this.#array = Object.freeze([reference.getFirst(),],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                this.#array = Object.freeze([reference.getFirst(), reference.getLast(),],)
                return
            }

            //#endregion -------------------- Initialization (size = 2) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array = new Array<T>(size,)
            let index = size
            while (index-- > 0)
                array[index] = reference.get(index,)
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 2) --------------------
        }

        //#endregion -------------------- Initialization from CollectionHolder by structure --------------------
        //#region -------------------- Initialization from MinimalistCollectionHolder by structure --------------------

        if (isMinimalistCollectionHolderByStructure<T>(reference,)) {
            const size = this.#size = reference.size

            //#region -------------------- Initialization (size = 0) --------------------

            if (size == 0) {
                this.#array = CollectionConstants.EMPTY_ARRAY
                return
            }

            //#endregion -------------------- Initialization (size = 0) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                this.#array = Object.freeze([reference.get(0,),],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                this.#array = Object.freeze([reference.get(0,), reference.get(1,),],)
                return
            }

            //#endregion -------------------- Initialization (size = 2) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array = new Array<T>(size,)
            let index = size
            while (index-- > 0)
                array[index] = reference.get(index,)
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 2) --------------------
        }

        //#endregion -------------------- Initialization from MinimalistCollectionHolder by structure --------------------
        //#region -------------------- Initialization from CollectionIterator by structure --------------------

        if (isCollectionIteratorByStructure<T>(reference,)) {
            //#region -------------------- Initialization (size = 0) --------------------

            if (reference.isEmpty) {
                this.#size = 0
                this.#array = CollectionConstants.EMPTY_ARRAY
                return
            }

            //#endregion -------------------- Initialization (size = 0) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            const size = this.#size = reference.size
            if (size == 1) {
                this.#array = Object.freeze([reference.nextValue,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                this.#array = Object.freeze([reference.nextValue, reference.nextValue,],)
                return
            }

            //#endregion -------------------- Initialization (size = 2) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array = new Array<T>(size,)
            let index = size
            while (index-- > 0)
                array[index] = reference.previousValue
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 2) --------------------
        }

        //#endregion -------------------- Initialization from CollectionIterator by structure --------------------
        //#region -------------------- Initialization from Iterator by structure --------------------

        if (isIteratorByStructure<T>(reference,)) {
            let iteratorResult = reference.next()

            //#region -------------------- Initialization (size = 0) --------------------

            if (iteratorResult.done === true) {
                this.#size = 0
                this.#array = CollectionConstants.EMPTY_ARRAY
                return
            }

            //#endregion -------------------- Initialization (size = 0) --------------------
            //#region -------------------- Initialization (size = over 0) --------------------

            const array: T[] = []
            array[0] = iteratorResult.value
            let size = 0
            while (++size, !(iteratorResult = reference.next()).done)
                array[size] = iteratorResult.value
            this.#size = size
            this.#array = Object.freeze(array,)

            //#endregion -------------------- Initialization (size = over 0) --------------------

            return
        }

        //#endregion -------------------- Initialization from Iterator by structure --------------------

        //#region -------------------- Initialization from Iterable with size --------------------

        sizeIf: if ("size" in reference) {
            const size = reference.size
            if (size == null) // No size is present, we continue as a normal iterable
                break sizeIf
            this.#size = size

            //#region -------------------- Initialization (size = 0) --------------------

            if (size == 0) {
                this.#array = CollectionConstants.EMPTY_ARRAY
                return
            }

            //#endregion -------------------- Initialization (size = 0) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                this.#array = Object.freeze([reference[Symbol.iterator]().next().value as T,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                const iterator: Iterator<T, unknown, unknown> = reference[Symbol.iterator]()
                this.#array = Object.freeze([iterator.next().value as T, iterator.next().value as T,],)
            }

            //#endregion -------------------- Initialization (size = 2) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array = new Array<T>(size,)
            const iterator: Iterator<T, unknown, unknown> = reference[Symbol.iterator]()
            let index = -1
            while (++index < size)
                array[index] = iterator.next().value as T
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 2) --------------------
        }

        //#endregion -------------------- Initialization from Iterable with size --------------------
        //#region -------------------- Initialization from Iterable with length --------------------

        lengthIf: if ("length" in reference) {
            const size = reference.length
            if (size == null) // No size is present, we continue as a normal iterable
                break lengthIf
            this.#size = size

            //#region -------------------- Initialization (size = 0) --------------------

            if (size == 0) {
                this.#array = CollectionConstants.EMPTY_ARRAY
                return
            }

            //#endregion -------------------- Initialization (size = 0) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                this.#array = Object.freeze([reference[Symbol.iterator]().next().value as T,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                const iterator: Iterator<T, unknown, unknown> = reference[Symbol.iterator]()
                this.#array = Object.freeze([iterator.next().value as T, iterator.next().value as T,],)
            }

            //#endregion -------------------- Initialization (size = 2) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array = new Array<T>(size,)
            const iterator: Iterator<T, unknown, unknown> = reference[Symbol.iterator]()
            let index = -1
            while (++index < size)
                array[index] = iterator.next().value as T
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 2) --------------------
        }

        //#endregion -------------------- Initialization from Iterable with length --------------------
        //#region -------------------- Initialization from Iterable with count --------------------

        countIf: if ("count" in reference) {
            const size = reference.count
            if (size == null) // No size is present, we continue as a normal iterable
                break countIf
            this.#size = size

            //#region -------------------- Initialization (size = 0) --------------------

            if (size == 0) {
                this.#array = CollectionConstants.EMPTY_ARRAY
                return
            }

            //#endregion -------------------- Initialization (size = 0) --------------------
            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                this.#array = Object.freeze([reference[Symbol.iterator]().next().value as T,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = 2) --------------------

            if (size == 2) {
                const iterator: Iterator<T, unknown, unknown> = reference[Symbol.iterator]()
                this.#array = Object.freeze([iterator.next().value as T, iterator.next().value as T,],)
                return
            }

            //#endregion -------------------- Initialization (size = 2) --------------------
            //#region -------------------- Initialization (size = over 2) --------------------

            const array = new Array<T>(size,)
            const iterator: Iterator<T, unknown, unknown> = reference[Symbol.iterator]()
            let index = -1
            while (++index < size)
                array[index] = iterator.next().value as T
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 2) --------------------
        }

        //#endregion -------------------- Initialization from Iterable with count --------------------
        //#region -------------------- Initialization from Iterable --------------------

        const iterator = reference[Symbol.iterator]()
        let iteratorResult = iterator.next()

        //#region -------------------- Initialization (size = 0) --------------------

        if (iteratorResult.done) {
            this.#size = 0
            this.#array = CollectionConstants.EMPTY_ARRAY
            return
        }

        //#endregion -------------------- Initialization (size = 0) --------------------
        //#region -------------------- Initialization (size = over 0) --------------------

        const array: T[] = []
        array[0] = iteratorResult.value
        let size = 0
        while (++size, !(iteratorResult = iterator.next()).done)
            array[size] = iteratorResult.value
        this.#size = size
        this.#array = Object.freeze(array,)

        //#endregion -------------------- Initialization (size = over 0) --------------------

        //#endregion -------------------- Initialization from Iterable --------------------
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    /** The raw value received in the constructor */
    protected get _reference(): PossibleIterableIteratorArraySetOrCollectionHolder<T> {
        return this.#reference
    }

    /** The {@link Array} stored (from the construction) for the current {@link GenericMinimalistCollectionHolder instance} */
    protected get _array(): readonly T[] {
        return this.#array
    }

    public override get size(): number {
        return this.#size
    }

    public override get(index: number,): T {
        const size = this.size
        if (size == 0)
            throw new EmptyCollectionException(null, index,)

        if (Number.isNaN(index,))
            throw new ForbiddenIndexException("Forbidden index. The index cannot be NaN.", index,)
        if (index == Number.NEGATIVE_INFINITY)
            throw new ForbiddenIndexException("Forbidden index. The index cannot be -∞.", index,)
        if (index == Number.POSITIVE_INFINITY)
            throw new ForbiddenIndexException("Forbidden index. The index cannot be +∞.", index,)

        const array = this._array
        if (index in array)
            return array[index] as T

        if (index > size)
            throw new IndexOutOfBoundsException(`Index out of bound. The index “${index}” is over the size of the collection (${size}).`, index,)
        if (index == size)
            throw new IndexOutOfBoundsException(`Index out of bound. The index “${index}” is the size of the collection (${size}).`, index,)
        if (index >= 0)
            return array[index] as T

        const indexToRetrieve = size + index
        if (indexToRetrieve < 0)
            throw new IndexOutOfBoundsException(`Index out of bound. The index “${index}” (${indexToRetrieve} after calculation) is under 0.`, index,)
        return array[indexToRetrieve] as T
    }

    //#endregion -------------------- Methods --------------------

}

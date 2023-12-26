/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullOr}                  from "./general type"
import type {PossibleIterable}                  from "./iterable/types"
import type {IndexWithReturnCallback, ObjectOf} from "./CollectionHolder.types"
import type {SimplisticCollectionHolder}        from "./SimplisticCollectionHolder"
import type {IterableWithCount}                 from "./iterable/IterableWithCount"
import type {IterableWithLength}                from "./iterable/IterableWithLength"
import type {IterableWithPossibleSize}          from "./iterable/IterableWithPossibleSize"
import type {IterableWithSize}                  from "./iterable/IterableWithSize"
import type {CollectionIterator}                from "./iterator/CollectionIterator"

import {AbstractCollectionHolder}                  from "./AbstractCollectionHolder"
import {CollectionConstants}                       from "./CollectionConstants"
import {CollectionHolderIndexOutOfBoundsException} from "./exception/CollectionHolderIndexOutOfBoundsException"
import {EmptyCollectionHolderException}            from "./exception/EmptyCollectionHolderException"
import {hasNull}                                   from "./method/hasNull"
import {isCollectionIterator}                      from "./method/isCollectionIterator"
import {isSimplisticCollectionHolder}              from "./method/isSimplisticCollectionHolder"
import {objectValuesMap}                           from "./method/objectValuesMap"
import {toMap}                                     from "./method/toMap"
import {toSet}                                     from "./method/toSet"
import {toWeakSet}                                 from "./method/toWeakSet"

/**
 * A {@link CollectionHolder} having the values eagerly retrieved.
 *
 * Meaning that every value is retrieved during the construction,
 * and it will never change after the initialization.
 *
 * But it does not make it {@link Object.isFrozen frozen}
 *
 * @see LazyGenericCollectionHolder
 * @see EmptyCollectionHolder
 */
export class GenericCollectionHolder<const T = unknown, const REFERENCE extends | PossibleIterable<T> | SimplisticCollectionHolder<T> = | PossibleIterable<T> | SimplisticCollectionHolder<T>, >
    extends AbstractCollectionHolder<T> {

    //#region -------------------- Fields --------------------

    readonly #size: number
    readonly #isEmpty: boolean

    readonly #reference: REFERENCE
    #objectValuesMap?: ReadonlyMap<T, ObjectOf<T>>
    readonly #array: readonly T[]
    #set?: ReadonlySet<T>
    #weakSet?: Readonly<WeakSet<ObjectOf<T>>>
    #map?: ReadonlyMap<number, T>

    #hasNull?: boolean

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor(array: readonly T[],)
    public constructor(lateArray: () => readonly T[],)
    public constructor(set: ReadonlySet<T>,)
    public constructor(lateSet: () => ReadonlySet<T>,)
    public constructor(collectionHolder: SimplisticCollectionHolder<T>,)
    public constructor(lateCollectionHolder: () => SimplisticCollectionHolder<T>,)
    public constructor(collectionIterable: CollectionIterator<T>,)
    public constructor(lateCollectionIterable: () => CollectionIterator<T>,)
    public constructor(iterableWithSize: IterableWithSize<T>,)
    public constructor(lateIterableWithSize: () => IterableWithSize<T>,)
    public constructor(iterableWithLength: IterableWithLength<T>,)
    public constructor(lateIterableWithLength: () => IterableWithLength<T>,)
    public constructor(iterableWithCount: IterableWithCount<T>,)
    public constructor(lateIterableWithCount: () => IterableWithCount<T>,)
    public constructor(iterableWithPossibleSize: IterableWithPossibleSize<T>,)
    public constructor(lateIterableWithPossibleSize: () => IterableWithPossibleSize<T>,)
    public constructor(iterable: Iterable<T>,)
    public constructor(lateIterable: () => Iterable<T>,)
    public constructor(reference: REFERENCE,)
    public constructor(lateReference: () => REFERENCE,)
    public constructor(reference: | REFERENCE | (() => REFERENCE),)
    public constructor(reference: | REFERENCE | (() => REFERENCE),) {
        super()
        // README: The eager instantiation has some weird shenanigan to keep its nature pure.
        //         Also, to be efficient, there is some duplicate code in the constructor.

        reference = this.#reference = reference instanceof Function ? reference() : reference

        if (reference instanceof Array) {
            const size = this.#size = reference.length
            //#region -------------------- Initialization (empty) --------------------

            if (size == 0) {
                this.#isEmpty = true
                this.#hasNull = false
                this.#array = CollectionConstants.EMPTY_ARRAY
                this.#set = CollectionConstants.EMPTY_SET
                this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                return
            }

            //#endregion -------------------- Initialization (empty) --------------------
            //#region -------------------- Initialization (non-empty) --------------------

            this.#isEmpty = false

            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                const value = this[0] = reference[0]
                this.#hasNull = value == null
                this.#array = Object.freeze([value,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = over 1) --------------------

            const array = new Array<T>(size,)
            let index = size
            while (index-- > 0)
                this[index] = array[index] = reference[index]
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 1) --------------------

            //#endregion -------------------- Initialization (non-empty) --------------------
        }

        if (reference instanceof Set) {
            const size = this.#size = reference.size
            //#region -------------------- Initialization (empty) --------------------

            if (size == 0) {
                this.#isEmpty = true
                this.#hasNull = false
                this.#array = CollectionConstants.EMPTY_ARRAY
                this.#set = CollectionConstants.EMPTY_SET
                this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                return
            }

            //#endregion -------------------- Initialization (empty) --------------------
            //#region -------------------- Initialization (non-empty) --------------------

            this.#isEmpty = false

            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                const value = this[0] = reference[Symbol.iterator]().next().value
                this.#hasNull = value == null
                this.#array = Object.freeze([value,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = over 1) --------------------

            const array = new Array<T>(size,)
            const iterator = reference[Symbol.iterator]() as IterableIterator<T>
            let index = -1
            while (++index < size)
                this[index] = array[index] = iterator.next().value
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 1) --------------------

            //#endregion -------------------- Initialization (non-empty) --------------------
        }

        if (isSimplisticCollectionHolder<T>(reference)) {
            const size = this.#size = reference.size
            //#region -------------------- Initialization (empty) --------------------

            if (this.#isEmpty = reference.isEmpty) {
                this.#hasNull = false
                this.#array = CollectionConstants.EMPTY_ARRAY
                this.#set = CollectionConstants.EMPTY_SET
                this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                return
            }

            //#endregion -------------------- Initialization (empty) --------------------
            //#region -------------------- Initialization (non-empty) --------------------

            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                const value = this[0] = reference.get(0,)
                this.#hasNull = value == null
                this.#array = Object.freeze([value,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = over 1) --------------------

            const array = [] as T[]
            let index = size
            while (index-- > 0)
                this[index] = array[index] = reference.get(index,)
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 1) --------------------

            //#endregion -------------------- Initialization (non-empty) --------------------
        }

        if (isCollectionIterator<T>(reference,)) {
            const size = this.#size = reference.size
            //#region -------------------- Initialization (empty) --------------------

            if (this.#isEmpty = size == 0) {
                this.#hasNull = false
                this.#array = CollectionConstants.EMPTY_ARRAY
                this.#set = CollectionConstants.EMPTY_SET
                this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                return
            }

            //#endregion -------------------- Initialization (empty) --------------------
            //#region -------------------- Initialization (non-empty) --------------------

            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                const value = this[0] = reference.nextValue
                this.#hasNull = value == null
                this.#array = Object.freeze([value,],)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = over 1) --------------------

            const array = [] as T[]
            let index = -1
            while (++index < size)
                this[index] = array[index] = reference.nextValue
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 1) --------------------

            //#endregion -------------------- Initialization (non-empty) --------------------
        }

        sizeIf:if ("size" in reference || "length" in reference || "count" in reference) {
            // @ts-ignore: We only retrieve the nullable number
            const size = (reference?.size ?? reference?.length ?? reference?.count) as Nullable<number>
            if (size == null) // No size is present, we continue as a normal iterable
                break sizeIf
            this.#size = size

            //#region -------------------- Initialization (empty) --------------------

            if (this.#isEmpty = size == 0) {
                this.#hasNull = false
                this.#array = CollectionConstants.EMPTY_ARRAY
                this.#set = CollectionConstants.EMPTY_SET
                this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                return
            }

            //#endregion -------------------- Initialization (empty) --------------------
            //#region -------------------- Initialization (non-empty) --------------------

            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                const value = this[0] = reference[Symbol.iterator]().next().value
                this.#hasNull = value == null
                this.#array = Object.freeze([value,],)
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = over 1) --------------------

            const array = [] as T[],
                iterator = reference[Symbol.iterator]() as IterableIterator<T>
            let index = -1,
                iteratorResult: IteratorResult<T, T>
            while (++index, !(iteratorResult = iterator.next()).done)
                this[index] = array[index] = iteratorResult.value
            this.#array = Object.freeze(array,)
            return

            //#endregion -------------------- Initialization (size = over 1) --------------------

            //#endregion -------------------- Initialization (non-empty) --------------------
        }

        const iterator = reference[Symbol.iterator]() as IterableIterator<T>
        let iteratorResult = iterator.next() as IteratorResult<T, T>
        //#region -------------------- Initialization (empty) --------------------

        if (iteratorResult.done) {
            this.#size = 0
            this.#isEmpty = true
            this.#hasNull = false
            this.#array = CollectionConstants.EMPTY_ARRAY
            this.#set = CollectionConstants.EMPTY_SET
            this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
            this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
            return
        }

        //#endregion -------------------- Initialization (empty) --------------------
        //#region -------------------- Initialization (non-empty) --------------------

        const array = [] as T[]
        this.#isEmpty = false
        this[0] = array[0] = iteratorResult.value
        let size = 0
        while (++size, !(iteratorResult = iterator.next()).done)
            this[size] = array[size] = iteratorResult.value
        this.#size = size
        this.#array = Object.freeze(array,)

        //#endregion -------------------- Initialization (non-empty) --------------------
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    //#region -------------------- Size methods --------------------

    public override get size(): number {
        return this.#size
    }


    public override get isEmpty(): boolean {
        return this.#isEmpty
    }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Has X methods --------------------

    public override get hasNull(): boolean {
        return this.#hasNull ??= hasNull(this,)
    }

    //#endregion -------------------- Has X methods --------------------

    /** The iterable received in the constructor */
    protected get _reference(): REFERENCE {
        return this.#reference
    }

    /** The {@link Array} stored (from the construction) for the current {@link GenericCollectionHolder collection} */
    protected get _array(): readonly T[] {
        return this.#array
    }

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Value methods --------------------

    //#region -------------------- Get / at methods --------------------

    public override get(index: number,): T {
        if (this.isEmpty)
            throw new EmptyCollectionHolderException("No element at any index could be found since it it empty.", index,)
        if (index in this)
            return this[index] as T

        const size = this.size
        if (index > size)
            throw new CollectionHolderIndexOutOfBoundsException(`The index "${index}" is over the size of the collection (${size}).`, index,)
        if (index >= 0)
            return this[index] as T

        const indexToRetrieve = size + index
        if (indexToRetrieve < 0)
            throw new CollectionHolderIndexOutOfBoundsException(`The index "${index}" (${indexToRetrieve} after calculation) is under 0.`, index,)
        if (indexToRetrieve > size)
            throw new CollectionHolderIndexOutOfBoundsException(`The index "${index}" (${indexToRetrieve} after calculation) is over the size of the collection (${size}).`, index,)
        return this[indexToRetrieve] as T
    }


    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<| T | U>,) {
        if (this.isEmpty)
            return defaultValue(index < 0 ? this.size + index : index,)

        const size = this.size,
            indexToRetrieve = index < 0 ? size + index : index
        if (indexToRetrieve < 0)
            return defaultValue(indexToRetrieve,)
        if (indexToRetrieve > size)
            return defaultValue(indexToRetrieve,)
        return this.get(indexToRetrieve,)
    }


    public override getOrNull(index: number,): NullOr<T> {
        if (this.isEmpty)
            return null
        const size = this.size,
            indexToRetrieve = index < 0 ? size + index : index
        if (indexToRetrieve < 0)
            return null
        if (indexToRetrieve > size)
            return null
        return this[indexToRetrieve] as T
    }

    //#endregion -------------------- Get / at methods --------------------

    //#endregion -------------------- Value methods --------------------
    //#region -------------------- Conversion methods --------------------

    public override get objectValuesMap(): ReadonlyMap<T, ObjectOf<T>> {
        return this.#objectValuesMap ??= objectValuesMap(this,)
    }

    public override toArray(): readonly T[] {
        return this.#array
    }

    public override toSet(): ReadonlySet<T> {
        return this.#set ??= toSet(this,)
    }

    public override toWeakSet(): Readonly<WeakSet<ObjectOf<T>>> {
        return this.#weakSet ??= toWeakSet(this,)
    }

    public override toMap(): ReadonlyMap<number, T> {
        return this.#map ??= toMap(this,)
    }

    //#endregion -------------------- Conversion methods --------------------

    //#endregion -------------------- Methods --------------------

}

/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Nullable, NullOr}                  from "./general type"
import type {PossibleIterable}                  from "./iterable/types"
import type {CollectionHolder}                  from "./CollectionHolder"
import type {IndexWithReturnCallback, ObjectOf} from "./CollectionHolder.types"
import type {IterableWithCount}                 from "./iterable/IterableWithCount"
import type {IterableWithLength}                from "./iterable/IterableWithLength"
import type {IterableWithPossibleSize}          from "./iterable/IterableWithPossibleSize"
import type {IterableWithSize}                  from "./iterable/IterableWithSize"
import type {CollectionIterator}                from "./iterator/CollectionIterator"

import {AbstractCollectionHolder} from "./AbstractCollectionHolder"
import {CollectionConstants}      from "./CollectionConstants"
import {hasNull}                  from "./method/hasNull"
import {isCollectionHolder}       from "./method/isCollectionHolder"
import {isCollectionIterator}     from "./method/isCollectionIterator"
import {objectValuesMap}          from "./method/objectValuesMap"
import {toMap}                    from "./method/toMap"
import {toSet}                    from "./method/toSet"
import {toWeakSet}                from "./method/toWeakSet"

/**
 * A simple {@link CollectionHolder} having the values eagerly retrieved.
 *
 * Meaning that every value is retrieved during the construction,
 * and it will never change after the initialization.
 *
 * But it does not make it {@link Object.isFrozen frozen}
 *
 * @see LazyGenericCollectionHolder
 * @see EmptyCollectionHolder
 */
export class GenericCollectionHolder<const T = unknown, const REFERENCE extends PossibleIterable<T> = PossibleIterable<T>, >
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
    public constructor(collectionHolder: CollectionHolder<T>,)
    public constructor(lateCollectionHolder: () => CollectionHolder<T>,)
    public constructor(reference: REFERENCE,)
    public constructor(lateReference: () => REFERENCE,)
    public constructor(reference: | REFERENCE | (() => REFERENCE),)
    public constructor(reference: | REFERENCE | (() => REFERENCE),) {
        super()
        // README: The eager instantiation has some weird shenanigan in order to keep its nature pure.
        //         Also, in order to be efficient, there is some duplicate code in the constructor.

        reference = this.#reference = reference instanceof Function ? reference() : reference

        if (reference instanceof Array) {
            const size = this.#size = reference.length
            if (size == 0) {
                this.#isEmpty = true
                this.#hasNull = false
                this.#array = CollectionConstants.EMPTY_ARRAY
                this.#set = CollectionConstants.EMPTY_SET
                this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                return
            }

            this.#isEmpty = false
            if (size == 1) {
                const value = this[0] = reference[0]
                this.#hasNull = value == null
                this.#array = Object.freeze([value,],)
                return
            }

            const array = new Array(size,)
            let index = size
            while (index-- > 0)
                this[index] = array[index] = reference[index]
            this.#array = Object.freeze(array,)
            return
        }

        if (reference instanceof Set) {
            const size = this.#size = reference.size
            if (size == 0) {
                this.#isEmpty = true
                this.#hasNull = false
                this.#array = CollectionConstants.EMPTY_ARRAY
                this.#set = CollectionConstants.EMPTY_SET
                this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                return
            }

            this.#isEmpty = false
            if (size == 1) {
                const value = this[0] = reference[Symbol.iterator]().next().value
                this.#hasNull = value == null
                this.#array = Object.freeze([value,],)
                return
            }

            const array = new Array(size,)
            const iterator = reference[Symbol.iterator]() as IterableIterator<T>
            let index = -1
            while (++index < size)
                this[index] = array[index] = iterator.next().value
            this.#array = Object.freeze(array,)
            return
        }

        if (isCollectionHolder<T>(reference)) {
            const size = this.#size = reference.size
            this.#isEmpty = reference.isEmpty
            this.#array = reference.toArray()
            let index = size
            while (index-- > 0)
                this[index] = reference[index]
            return
        }

        if (isCollectionIterator<T>(reference,)) {
            const size = this.#size = reference.size
            if (this.#isEmpty = size == 0) {
                this.#hasNull = false
                this.#array = CollectionConstants.EMPTY_ARRAY
                this.#set = CollectionConstants.EMPTY_SET
                this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                return
            }

            const iterator = reference[Symbol.iterator](),
                array = [] as T[]
            let index = 0
            while (iterator.hasNext) {
                this[index] = array[index] = iterator.next().value as T
                index++
            }
            this.#array = Object.freeze(array,)
            return
        }

        sizeIf:if ("size" in reference || "length" in reference || "count" in reference) {
            // @ts-ignore: We only retrieve the nullable number
            const size = (reference?.size ?? reference?.length ?? reference?.count) as Nullable<number>
            if (size == null) // No size is present, we continue as a normal iterable
                break sizeIf
            this.#size = size

            if (this.#isEmpty = size == 0) {
                this.#hasNull = false
                this.#array = CollectionConstants.EMPTY_ARRAY
                this.#set = CollectionConstants.EMPTY_SET
                this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                return
            }

            const array = [],
                iterator = reference[Symbol.iterator]() as IterableIterator<T>
            let index = 0,
                value = iterator.next()
            while (!value.done) {
                this[index] = array[index] = value.value
                value = iterator.next()
                index++
            }
            this.#array = Object.freeze(array,)
            return
        }

        const iterator = reference[Symbol.iterator]() as IterableIterator<T>
        let value = iterator.next()
        if (value.done) {
            this.#size = 0
            this.#isEmpty = true
            this.#hasNull = false
            this.#array = CollectionConstants.EMPTY_ARRAY
            this.#set = CollectionConstants.EMPTY_SET
            this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
            this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
            return
        }

        const array = []
        this.#isEmpty = false
        let size = 0
        while (!value.done) {
            this[size] = array[size] = value.value
            value = iterator.next()
            size++
        }
        this.#size = size
        this.#array = Object.freeze(array,)
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
            throw new ReferenceError("No element at any index could be found since it it empty.",)
        const size = this.size,
            indexToRetrieve = index < 0 ? size + index : index
        if (indexToRetrieve < 0)
            throw new ReferenceError(`The index ${index}${index === indexToRetrieve ? '' : ` (${indexToRetrieve} after calculation)`} is under 0.`,)
        if (indexToRetrieve > size)
            throw new ReferenceError(`The index ${index}${index === indexToRetrieve ? '' : ` (${indexToRetrieve} after calculation)`} is over the size of the collection (${size}).`,)
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

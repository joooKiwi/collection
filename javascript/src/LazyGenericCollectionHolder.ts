/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Lazy}    from "@joookiwi/lazy"
import {lazy, lazyOf} from "@joookiwi/lazy"

import type {Nullable, NullOr}                  from "./general type"
import type {PossibleIterable}                  from "./iterable/types"
import type {CollectionHolder}                  from "./CollectionHolder"
import type {IndexWithReturnCallback, ObjectOf} from "./CollectionHolder.types"
import type {CollectionHandler}                 from "./handler/Collection.handler"
import type {IterableWithCount}                 from "./iterable/IterableWithCount"
import type {IterableWithLength}                from "./iterable/IterableWithLength"
import type {IterableWithPossibleSize}          from "./iterable/IterableWithPossibleSize"
import type {IterableWithSize}                  from "./iterable/IterableWithSize"
import type {CollectionIterator}                from "./iterator/CollectionIterator"

import {AbstractCollectionHolder}          from "./AbstractCollectionHolder"
import {CollectionConstants}               from "./CollectionConstants"
import {EmptyCollectionHandler}            from "./handler/EmptyCollection.handler"
import {ArrayCollectionOf1Handler}         from "./handler/ArrayCollectionOf1.handler"
import {ArrayCollectionHandler}            from "./handler/ArrayCollection.handler"
import {CollectionCollectionHandler}       from "./handler/CollectionCollection.handler"
import {IterableCollectionHandler}         from "./handler/IterableCollection.handler"
import {IterableWithSizeCollectionHandler} from "./handler/IterableWithSizeCollection.handler"
import {SetCollectionHandler}              from "./handler/SetCollection.handler"
import {SetCollectionOf1Handler}           from "./handler/SetCollectionOf1.handler"
import {hasNull}                           from "./method/hasNull"
import {isCollectionHolder}                from "./method/isCollectionHolder"
import {isCollectionIterator}              from "./method/isCollectionIterator"
import {objectValuesMap}                   from "./method/objectValuesMap"
import {toArray}                           from "./method/toArray"
import {toMap}                             from "./method/toMap"
import {toSet}                             from "./method/toSet"
import {toWeakSet}                         from "./method/toWeakSet"

/**
 * A simple {@link CollectionHolder} having the values associated to it, but lazily retrieved.
 *
 * @see GenericCollectionHolder
 * @see EmptyCollectionHolder
 * @beta
 */
export class LazyGenericCollectionHolder<const out T = unknown, const REFERENCE extends PossibleIterable<T> = PossibleIterable<T>, >
    extends AbstractCollectionHolder<T> {

    //#region -------------------- Fields --------------------

    readonly #handler: Lazy<CollectionHandler<T>>
    readonly #size: Lazy<number>
    readonly #isEmpty: Lazy<boolean>

    readonly #reference: Lazy<REFERENCE>
    #objectValuesMap?: ReadonlyMap<T, ObjectOf<T>>
    #array?: readonly T[]
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
        // README: The lazy instantiation has some weird shenanigan in order to keep its laziness nature pure.
        //         Also, in order to be efficient, there is some duplicate code in the constructor.

        if (reference instanceof Array) {
            this.#reference = lazyOf(reference as REFERENCE,)
            const size = reference.length
            this.#size = lazyOf(size,)
            if (size == 0) {
                this.#isEmpty = lazyOf(true,)
                this.#hasNull = false
                this.#array = CollectionConstants.EMPTY_ARRAY
                this.#set = CollectionConstants.EMPTY_SET
                this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                this.#handler = lazyOf(EmptyCollectionHandler.get,)
                return
            }

            this.#isEmpty = lazyOf(false,)
            if (Object.isFrozen(reference))
                this.#array = reference
            if (size == 1) {
                this.#handler = lazyOf(new ArrayCollectionOf1Handler(this, reference as unknown as (& REFERENCE & readonly [T,]),),)
                return
            }

            this.#handler = lazyOf(new ArrayCollectionHandler(this, reference as (& REFERENCE & readonly T[]),),)
            return
        }

        if (reference instanceof Set) {
            this.#reference = lazyOf(reference as REFERENCE,)
            const size = reference.size
            this.#size = lazyOf(size,)
            if (size == 0) {
                this.#isEmpty = lazyOf(true,)
                this.#hasNull = false
                this.#array = CollectionConstants.EMPTY_ARRAY
                this.#set = CollectionConstants.EMPTY_SET
                this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                this.#handler = lazyOf(EmptyCollectionHandler.get,)
                return
            }

            this.#isEmpty = lazyOf(false,)
            if (Object.isFrozen(reference,))
                this.#set = reference
            if (size == 1) {
                this.#handler = lazyOf(new SetCollectionOf1Handler(this, reference as (& REFERENCE & ReadonlySet<T>),),)
                return
            }

            this.#handler = lazyOf(new SetCollectionHandler(this, reference as (& REFERENCE & ReadonlySet<T>),),)
            return
        }

        if (isCollectionHolder<T>(reference)) {
            this.#reference = lazyOf(reference,)
            this.#handler = lazy(() => new CollectionCollectionHandler(this, reference,),)
            this.#isEmpty = lazy(() => {
                if (reference.isEmpty) {
                    this.#hasNull = false
                    this.#array = CollectionConstants.EMPTY_ARRAY
                    this.#set = CollectionConstants.EMPTY_SET
                    this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                    this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                    return true
                }
                return false
            },)
            this.#size = lazy(() => {
                const size = reference.size
                if (size == 0) {
                    this.#hasNull = false
                    this.#array = CollectionConstants.EMPTY_ARRAY
                    this.#set = CollectionConstants.EMPTY_SET
                    this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                    this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                }
                return size
            },)
            return
        }

        if (isCollectionIterator<T>(reference)) {
            this.#reference = lazyOf(reference,)
            this.#handler = lazy(() => new CollectionCollectionHandler(this, reference.collection,),)
            this.#isEmpty = lazy(() => {
                if (reference.collection.isEmpty) {
                    this.#hasNull = false
                    this.#array = CollectionConstants.EMPTY_ARRAY
                    this.#set = CollectionConstants.EMPTY_SET
                    this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                    this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                    return true
                }
                return false
            },)
            this.#size = lazy(() => {
                const size = reference.size
                if (size == 0) {
                    this.#hasNull = false
                    this.#array = CollectionConstants.EMPTY_ARRAY
                    this.#set = CollectionConstants.EMPTY_SET
                    this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                    this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                }
                return size
            },)
            return
        }

        if (reference instanceof Function) {
            this.#reference = lazy(reference,)
            this.#handler = lazy(() => {
                const referenceFound = reference()
                if (referenceFound instanceof Array) {
                    const size = referenceFound.length
                    if (size == 0) {
                        this.#hasNull ??= false
                        this.#array ??= CollectionConstants.EMPTY_ARRAY
                        this.#set ??= CollectionConstants.EMPTY_SET
                        this.#weakSet ??= CollectionConstants.EMPTY_WEAK_SET
                        this.#map ??= CollectionConstants.EMPTY_MAP
                        this.#objectValuesMap ??= CollectionConstants.EMPTY_MAP
                        return EmptyCollectionHandler.get
                    }

                    if (Object.isFrozen(referenceFound,))
                        this.#array ??= referenceFound
                    if (size === 1)
                        return new ArrayCollectionOf1Handler(this, referenceFound as unknown as (& REFERENCE & readonly [T,]),)
                    return new ArrayCollectionHandler(this, referenceFound,)
                }
                if (referenceFound instanceof Set) {
                    const size = referenceFound.size
                    if (size == 0) {
                        this.#hasNull ??= false
                        this.#array ??= CollectionConstants.EMPTY_ARRAY
                        this.#set ??= CollectionConstants.EMPTY_SET
                        this.#weakSet ??= CollectionConstants.EMPTY_WEAK_SET
                        this.#map ??= CollectionConstants.EMPTY_MAP
                        this.#objectValuesMap ??= CollectionConstants.EMPTY_MAP
                        return EmptyCollectionHandler.get
                    }

                    if (Object.isFrozen(referenceFound,))
                        this.#set ??= referenceFound
                    if (size === 1)
                        return new SetCollectionOf1Handler(this, referenceFound,)
                    return new SetCollectionHandler(this, referenceFound,)
                }
                if (isCollectionHolder<T>(referenceFound,))
                    return new CollectionCollectionHandler(this, referenceFound,)
                if (isCollectionIterator<T>(referenceFound,))
                    return new CollectionCollectionHandler(this, referenceFound.collection,)
                if ("size" in referenceFound || "length" in referenceFound || "count" in referenceFound) {
                    // @ts-ignore: We only retrieve the nullable number
                    const size = (referenceFound?.size ?? referenceFound?.length ?? referenceFound?.count) as Nullable<number>
                    if (size == null)
                        return new IterableCollectionHandler(this, referenceFound,)
                    if (size == 0) {
                        this.#hasNull ??= false
                        this.#array ??= CollectionConstants.EMPTY_ARRAY
                        this.#set ??= CollectionConstants.EMPTY_SET
                        this.#weakSet ??= CollectionConstants.EMPTY_WEAK_SET
                        this.#map ??= CollectionConstants.EMPTY_MAP
                        this.#objectValuesMap ??= CollectionConstants.EMPTY_MAP
                        return EmptyCollectionHandler.get
                    }

                    return new IterableWithSizeCollectionHandler(this, referenceFound,)
                }
                return new IterableCollectionHandler(this, referenceFound,)
            },)
            this.#isEmpty = lazy(() => {
                if (this._handler.isEmpty) {
                    this.#hasNull = false
                    this.#array = CollectionConstants.EMPTY_ARRAY
                    this.#set = CollectionConstants.EMPTY_SET
                    this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                    this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                    return true
                }
                return false
            },)
            this.#size = lazy(() => {
                const size = this._handler.size
                if (size == 0) {
                    this.#hasNull = false
                    this.#array = CollectionConstants.EMPTY_ARRAY
                    this.#set = CollectionConstants.EMPTY_SET
                    this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                    this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                }
                return size
            },)
            return
        }

        sizeIf:if ("size" in reference || "length" in reference || "count" in reference) {
            this.#reference = lazyOf(reference,)
            // @ts-ignore: We only retrieve the nullable number
            const size = (reference?.size ?? reference?.length ?? reference?.count) as Nullable<number>
            if (size == null) // No size is present even though there is a value in the reference
                break sizeIf
            this.#size = lazyOf(size,)

            if (size == 0) {
                this.#isEmpty = lazyOf(true,)
                this.#hasNull = false
                this.#array = CollectionConstants.EMPTY_ARRAY
                this.#set = CollectionConstants.EMPTY_SET
                this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                this.#handler = lazyOf(EmptyCollectionHandler.get,)
                return
            }

            this.#isEmpty = lazyOf(false,)
            this.#handler = lazyOf(new IterableWithSizeCollectionHandler(this, reference,),)
            return
        }


        this.#reference = lazyOf(reference,)
        this.#handler = lazyOf(new IterableCollectionHandler(this, reference,),)
        this.#isEmpty = lazy(() => {
            if (this._handler.isEmpty) {
                this.#hasNull = false
                this.#array = CollectionConstants.EMPTY_ARRAY
                this.#set = CollectionConstants.EMPTY_SET
                this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                return true
            }
            return false
        },)
        this.#size = lazy(() => {
            const size = this._handler.size
            if (size == 0) {
                this.#hasNull = false
                this.#array = CollectionConstants.EMPTY_ARRAY
                this.#set = CollectionConstants.EMPTY_SET
                this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
            }
            return size
        },)
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    //#region -------------------- Size methods --------------------

    public override get size(): number {
        return this.#size.value
    }

    public override get isEmpty(): boolean {
        return this.#isEmpty.value
    }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Has X methods --------------------

    public override get hasNull(): boolean {
        return this.#hasNull ??= hasNull(this,)
    }

    //#endregion -------------------- Has X methods --------------------

    /** The {@link PossibleIterable iterable} received in the {@link LazyGenericCollectionHolder.constructor constructor} */
    protected get _reference(): REFERENCE {
        return this.#reference.value
    }

    /** The {@link CollectionHandler handler} created from the {@link LazyGenericCollectionHolder} {@link LazyGenericCollectionHolder.constructor constructor} */
    protected get _handler(): CollectionHandler<T> {
        return this.#handler.value
    }

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Value methods --------------------

    //#region -------------------- Get / at methods --------------------

    public override get(index: number,): T {
        if (this.isEmpty)
            throw new ReferenceError("No element at any index could be found since it it empty.",)
        const indexToRetrieve = index < 0 ? this.size + index : index
        if (indexToRetrieve < 0)
            throw new ReferenceError(`The index ${index}${index === indexToRetrieve ? "" : ` (${indexToRetrieve} after calculation)`} is under 0.`,)

        const valueFound = this._handler.get(indexToRetrieve,)
        if (valueFound.cause != null)
            throw valueFound.cause
        return valueFound.value as T
    }


    public override getOrElse<U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,) {
        if (this.isEmpty)
            return defaultValue(index < 0 ? this.size + index : index,)

        const indexToRetrieve = index < 0 ? this.size + index : index
        if (indexToRetrieve < 0)
            return defaultValue(indexToRetrieve,)

        return this._handler.get(indexToRetrieve,).value ?? defaultValue(indexToRetrieve,)
    }


    public override getOrNull(index: number,): NullOr<T> {
        if (this.isEmpty)
            return null
        const indexToRetrieve = index < 0 ? this.size + index : index
        if (indexToRetrieve < 0)
            return null

        return this._handler.get(indexToRetrieve,).value
    }

    //#endregion -------------------- Get / at methods --------------------

    //#endregion -------------------- Value methods --------------------
    //#region -------------------- Conversion methods --------------------

    public override get objectValuesMap(): ReadonlyMap<T, ObjectOf<T>> {
        return this.#objectValuesMap ??= objectValuesMap(this,)
    }

    public override toArray(): readonly T[] {
        return this.#array ??= toArray(this,)
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

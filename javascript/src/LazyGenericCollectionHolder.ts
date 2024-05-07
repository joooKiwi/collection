/*******************************************************************************
 Copyright (c) 2023-2024. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {Lazy}                   from "@joookiwi/lazy"
import type {NullableNumber, NullOr} from "@joookiwi/type"
import {CommonLazy, lazy, lazyOf}    from "@joookiwi/lazy"

import type {CollectionHolder}                                                from "./CollectionHolder"
import type {IndexWithReturnCallback, ObjectOf, PossibleIterableOrCollection} from "./CollectionHolder.types"
import type {MinimalistCollectionHolder}                                      from "./MinimalistCollectionHolder"
import type {CollectionHandler}                                               from "./handler/CollectionHandler"
import type {IterableWithCount}                                               from "./iterable/IterableWithCount"
import type {IterableWithLength}                                              from "./iterable/IterableWithLength"
import type {IterableWithPossibleSize}                                        from "./iterable/IterableWithPossibleSize"
import type {IterableWithSize}                                                from "./iterable/IterableWithSize"
import type {CollectionIterator}                                              from "./iterator/CollectionIterator"

import {AbstractCollectionHolder}                      from "./AbstractCollectionHolder"
import {CollectionConstants}                           from "./CollectionConstants"
import {CollectionHandlerByArrayOf1}                   from "./handler/CollectionHandlerByArrayOf1"
import {CollectionHandlerByArray}                      from "./handler/CollectionHandlerByArray"
import {CollectionHandlerByCollectionHolder}           from "./handler/CollectionHandlerByCollectionHolder"
import {CollectionHandlerByIterable}                   from "./handler/CollectionHandlerByIterable"
import {CollectionHandlerByIterableWithSize}           from "./handler/CollectionHandlerByIterableWithSize"
import {CollectionHandlerByMinimalistCollectionHolder} from "./handler/CollectionHandlerByMinimalistCollectionHolder"
import {CollectionHandlerBySet}                        from "./handler/CollectionHandlerBySet"
import {CollectionHandlerBySetOf1}                     from "./handler/CollectionHandlerBySetOf1"
import {hasNullByCollectionHolder}                     from "./method/hasNull"
import {isCollectionHolder}                            from "./method/isCollectionHolder"
import {isCollectionIterator}                          from "./method/isCollectionIterator"
import {isMinimalistCollectionHolder}                  from "./method/isMinimalistCollectionHolder"
import {objectValuesMapByCollectionHolder}             from "./method/objectValuesMap"
import {toArrayByCollectionHolder}                     from "./method/toArray"
import {toMapByCollectionHolder}                       from "./method/toMap"
import {toSetByCollectionHolder}                       from "./method/toSet"
import {toWeakSet}                                     from "./method/toWeakSet"

/**
 * A {@link CollectionHolder} having the values associated to it, but lazily retrieved.
 *
 * @see GenericCollectionHolder
 * @see EmptyCollectionHolder
 * @beta
 */
export class LazyGenericCollectionHolder<const out T = unknown, const out REFERENCE extends PossibleIterableOrCollection<T> = PossibleIterableOrCollection<T>, >
    extends AbstractCollectionHolder<T> {

    //#region -------------------- Fields --------------------

    #handler: Lazy<CollectionHandler<T>>
    #size: Lazy<number>
    #isEmpty: Lazy<boolean>

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
    public constructor(collectionHolder: CollectionHolder<T>,)
    public constructor(lateCollectionHolder: () => CollectionHolder<T>,)
    public constructor(minimalistCollectionHolder: MinimalistCollectionHolder<T>,)
    public constructor(lateMinimalistCollectionHolder: () => MinimalistCollectionHolder<T>,)
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
        // README: The lazy instantiation has some weird shenanigan to keep its laziness nature pure.
        //         Also, to be efficient, there is some duplicate code in the constructor.

        if (reference instanceof Array) {
            this.#reference = lazyOf(reference as REFERENCE,)
            const size = reference.length

            //#region -------------------- Initialization (empty) --------------------

            if (size == 0) {
                this.#size = CommonLazy.ZERO_NUMBER
                this.#isEmpty = CommonLazy.TRUE
                this.#hasNull = false
                this.#array = CollectionConstants.EMPTY_ARRAY
                this.#set = CollectionConstants.EMPTY_SET
                this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                this.#handler = CollectionConstants.LAZY_EMPTY_COLLECTION_HANDLER
                return
            }

            //#endregion -------------------- Initialization (empty) --------------------
            //#region -------------------- Initialization (non-empty) --------------------

            this.#isEmpty = CommonLazy.FALSE
            if (Object.isFrozen(reference,))
                this.#array = reference

            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                this.#size = CommonLazy.ONE_NUMBER
                this.#handler = lazyOf(new CollectionHandlerByArrayOf1(this, reference as unknown as (& REFERENCE & readonly [T,]),),)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = over 1) --------------------

            this.#size = lazyOf(size,)
            this.#handler = lazyOf(new CollectionHandlerByArray(this, reference as (& REFERENCE & readonly T[]),),)
            return

            //#endregion -------------------- Initialization (size = over 1) --------------------

            //#endregion -------------------- Initialization (non-empty) --------------------
        }

        if (reference instanceof Set) {
            this.#reference = lazyOf(reference as REFERENCE,)
            const size = reference.size

            //#region -------------------- Initialization (empty) --------------------

            if (size == 0) {
                this.#size = CommonLazy.ZERO_NUMBER
                this.#isEmpty = CommonLazy.TRUE
                this.#hasNull = false
                this.#array = CollectionConstants.EMPTY_ARRAY
                this.#set = CollectionConstants.EMPTY_SET
                this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                this.#handler = CollectionConstants.LAZY_EMPTY_COLLECTION_HANDLER
                return
            }

            //#endregion -------------------- Initialization (empty) --------------------
            //#region -------------------- Initialization (non-empty) --------------------

            this.#isEmpty = CommonLazy.FALSE
            if (Object.isFrozen(reference,))
                this.#set = reference

            //#region -------------------- Initialization (size = 1) --------------------

            if (size == 1) {
                this.#size = CommonLazy.ONE_NUMBER
                this.#handler = lazyOf(new CollectionHandlerBySetOf1(this, reference as (& REFERENCE & ReadonlySet<T>),),)
                return
            }

            //#endregion -------------------- Initialization (size = 1) --------------------
            //#region -------------------- Initialization (size = over 1) --------------------

            this.#size = lazyOf(size,)
            this.#handler = lazyOf(new CollectionHandlerBySet(this, reference as (& REFERENCE & ReadonlySet<T>),),)
            return

            //#endregion -------------------- Initialization (size = over 1) --------------------

            //#endregion -------------------- Initialization (non-empty) --------------------
        }

        if (isCollectionHolder<T>(reference,)) {
            this.#reference = lazyOf(reference,)
            this.#handler = lazy(() => new CollectionHandlerByCollectionHolder(this, reference,),)
            this.#isEmpty = lazy(() => {
                //#region -------------------- Late-initialization (empty) --------------------

                if (reference.isEmpty) {
                    this.#size = CommonLazy.ZERO_NUMBER
                    this.#isEmpty = CommonLazy.TRUE
                    this.#hasNull = false
                    this.#array = CollectionConstants.EMPTY_ARRAY
                    this.#set = CollectionConstants.EMPTY_SET
                    this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                    this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                    this.#handler = CollectionConstants.LAZY_EMPTY_COLLECTION_HANDLER
                    return true
                }

                //#endregion -------------------- Late-initialization (empty) --------------------
                //#region -------------------- Late-initialization (non-empty) --------------------

                this.#isEmpty = CommonLazy.FALSE
                return false

                //#endregion -------------------- Late-initialization (non-empty) --------------------
            },)
            this.#size = lazy(() => {
                const size = reference.size
                //#region -------------------- Late-initialization (empty) --------------------

                if (size == 0) {
                    this.#size = CommonLazy.ZERO_NUMBER
                    this.#isEmpty = CommonLazy.TRUE
                    this.#hasNull = false
                    this.#array = CollectionConstants.EMPTY_ARRAY
                    this.#set = CollectionConstants.EMPTY_SET
                    this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                    this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                    this.#handler = CollectionConstants.LAZY_EMPTY_COLLECTION_HANDLER
                    return 0
                }

                //#endregion -------------------- Late-initialization (empty) --------------------
                //#region -------------------- Late-initialization (non-empty) --------------------

                this.#isEmpty = CommonLazy.FALSE
                if (size == 1)
                    this.#size = CommonLazy.ONE_NUMBER
                return size

                //#endregion -------------------- Late-initialization (non-empty) --------------------
            },)
            return
        }

        if (isMinimalistCollectionHolder<T>(reference,)) {
            this.#reference = lazyOf(reference,)
            this.#handler = lazy(() => new CollectionHandlerByMinimalistCollectionHolder(this, reference,),)
            this.#isEmpty = lazy(() => {
                const size = reference.size
                //#region -------------------- Late-initialization (empty) --------------------

                if (size == 0) {
                    this.#size = CommonLazy.ZERO_NUMBER
                    this.#isEmpty = CommonLazy.TRUE
                    this.#hasNull = false
                    this.#array = CollectionConstants.EMPTY_ARRAY
                    this.#set = CollectionConstants.EMPTY_SET
                    this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                    this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                    this.#handler = CollectionConstants.LAZY_EMPTY_COLLECTION_HANDLER
                    return true
                }

                //#endregion -------------------- Late-initialization (empty) --------------------
                //#region -------------------- Late-initialization (non-empty) --------------------

                this.#isEmpty = CommonLazy.FALSE
                return false

                //#endregion -------------------- Late-initialization (non-empty) --------------------
            },)
            this.#size = lazy(() => {
                const size = reference.size
                //#region -------------------- Late-initialization (empty) --------------------

                if (size == 0) {
                    this.#size = CommonLazy.ZERO_NUMBER
                    this.#isEmpty = CommonLazy.TRUE
                    this.#hasNull = false
                    this.#array = CollectionConstants.EMPTY_ARRAY
                    this.#set = CollectionConstants.EMPTY_SET
                    this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                    this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                    this.#handler = CollectionConstants.LAZY_EMPTY_COLLECTION_HANDLER
                    return 0
                }

                //#endregion -------------------- Late-initialization (empty) --------------------
                //#region -------------------- Late-initialization (non-empty) --------------------

                this.#isEmpty = CommonLazy.FALSE
                if (size == 1)
                    this.#size = CommonLazy.ONE_NUMBER
                return size

                //#endregion -------------------- Late-initialization (non-empty) --------------------
            },)
            return
        }

        if (isCollectionIterator<T>(reference,)) {
            this.#reference = lazyOf(reference,)
            this.#handler = lazy(() => {
                const collection = reference.collection
                if (isCollectionHolder<T>(collection,))
                    return new CollectionHandlerByCollectionHolder(this, collection,)
                return new CollectionHandlerByMinimalistCollectionHolder(this, collection,)
            },)
            this.#isEmpty = lazy(() => {
                const collection = reference.collection
                if (isCollectionHolder(collection,)) {
                    //#region -------------------- Late-initialization (empty) --------------------

                    if (collection.isEmpty) {
                        this.#size = CommonLazy.ZERO_NUMBER
                        this.#isEmpty = CommonLazy.TRUE
                        this.#hasNull = false
                        this.#array = CollectionConstants.EMPTY_ARRAY
                        this.#set = CollectionConstants.EMPTY_SET
                        this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                        this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                        this.#handler = CollectionConstants.LAZY_EMPTY_COLLECTION_HANDLER
                        return true
                    }

                    //#endregion -------------------- Late-initialization (empty) --------------------
                    //#region -------------------- Late-initialization (non-empty) --------------------

                    this.#isEmpty = CommonLazy.FALSE
                    return false

                    //#endregion -------------------- Late-initialization (non-empty) --------------------
                }

                const size = collection.size
                //#region -------------------- Late-initialization (empty) --------------------

                if (size == 0) {
                    this.#size = CommonLazy.ZERO_NUMBER
                    this.#isEmpty = CommonLazy.TRUE
                    this.#hasNull = false
                    this.#array = CollectionConstants.EMPTY_ARRAY
                    this.#set = CollectionConstants.EMPTY_SET
                    this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                    this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                    this.#handler = CollectionConstants.LAZY_EMPTY_COLLECTION_HANDLER
                    return true
                }

                //#endregion -------------------- Late-initialization (empty) --------------------
                //#region -------------------- Late-initialization (non-empty) --------------------

                this.#isEmpty = CommonLazy.FALSE
                return false

                //#endregion -------------------- Late-initialization (non-empty) --------------------
            },)
            this.#size = lazy(() => {
                const size = reference.size
                //#region -------------------- Late-initialization (empty) --------------------

                if (size == 0) {
                    this.#size = CommonLazy.ZERO_NUMBER
                    this.#isEmpty = CommonLazy.TRUE
                    this.#hasNull = false
                    this.#array = CollectionConstants.EMPTY_ARRAY
                    this.#set = CollectionConstants.EMPTY_SET
                    this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                    this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                    this.#handler = CollectionConstants.LAZY_EMPTY_COLLECTION_HANDLER
                    return 0
                }

                //#endregion -------------------- Late-initialization (empty) --------------------
                //#region -------------------- Late-initialization (non-empty) --------------------

                this.#isEmpty = CommonLazy.FALSE
                if (size == 1)
                    this.#size = CommonLazy.ONE_NUMBER
                return size

                //#endregion -------------------- Late-initialization (non-empty) --------------------
            },)
            return
        }

        if (reference instanceof Function) {
            this.#reference = lazy(reference,)
            this.#handler = lazy(() => {
                const referenceFound = reference()
                if (referenceFound instanceof Array) {
                    const size = referenceFound.length
                    //#region -------------------- Late-initialization (empty) --------------------

                    if (size == 0) {
                        this.#size = CommonLazy.ZERO_NUMBER
                        this.#isEmpty = CommonLazy.TRUE
                        this.#hasNull = false
                        this.#array = CollectionConstants.EMPTY_ARRAY
                        this.#set = CollectionConstants.EMPTY_SET
                        this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                        this.#map = this.#objectValuesMap = CollectionConstants.EMPTY_MAP
                        this.#handler = CollectionConstants.LAZY_EMPTY_COLLECTION_HANDLER
                        return CollectionConstants.EMPTY_COLLECTION_HANDLER
                    }

                    //#endregion -------------------- Late-initialization (empty) --------------------
                    //#region -------------------- Late-initialization (non-empty) --------------------

                    this.#isEmpty = CommonLazy.FALSE
                    if (Object.isFrozen(referenceFound,))
                        this.#array = referenceFound

                    //#region -------------------- Late-initialization (size = 1) --------------------

                    if (size == 1) {
                        this.#size = CommonLazy.ONE_NUMBER
                        return new CollectionHandlerByArrayOf1(this, referenceFound as unknown as (& REFERENCE & readonly [T,]),)
                    }

                    //#endregion -------------------- Late-initialization (size = 1) --------------------
                    //#region -------------------- Late-initialization (size = over 1) --------------------

                    return new CollectionHandlerByArray(this, referenceFound,)

                    //#endregion -------------------- Late-initialization (size = over 1) --------------------

                    //#endregion -------------------- Late-initialization (non-empty) --------------------
                }
                if (referenceFound instanceof Set) {
                    const size = referenceFound.size
                    //#region -------------------- Late-initialization (empty) --------------------

                    if (size == 0) {
                        this.#size = CommonLazy.ZERO_NUMBER
                        this.#isEmpty = CommonLazy.TRUE
                        this.#hasNull = false
                        this.#array = CollectionConstants.EMPTY_ARRAY
                        this.#set = CollectionConstants.EMPTY_SET
                        this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                        this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                        this.#handler = CollectionConstants.LAZY_EMPTY_COLLECTION_HANDLER
                        return CollectionConstants.EMPTY_COLLECTION_HANDLER
                    }

                    //#endregion -------------------- Late-initialization (empty) --------------------
                    //#region -------------------- Late-initialization (non-empty) --------------------

                    this.#isEmpty = CommonLazy.FALSE
                    if (Object.isFrozen(referenceFound,))
                        this.#set = referenceFound

                    //#region -------------------- Late-initialization (size = 1) --------------------

                    if (size == 1) {
                        this.#size = CommonLazy.ONE_NUMBER
                        return new CollectionHandlerBySetOf1(this, referenceFound,)
                    }

                    //#endregion -------------------- Late-initialization (size = 1) --------------------
                    //#region -------------------- Late-initialization (size = over 1) --------------------

                    return new CollectionHandlerBySet(this, referenceFound,)

                    //#endregion -------------------- Late-initialization (size = over 1) --------------------

                    //#endregion -------------------- Late-initialization (non-empty) --------------------
                }
                if (isCollectionHolder<T>(referenceFound,))
                    return new CollectionHandlerByCollectionHolder(this, referenceFound,)
                if (isMinimalistCollectionHolder<T>(referenceFound,))
                    return new CollectionHandlerByMinimalistCollectionHolder(this, referenceFound,)
                if (isCollectionIterator<T>(referenceFound,)) {
                    const collection = referenceFound.collection
                    if (isCollectionHolder<T>(collection,))
                        return new CollectionHandlerByCollectionHolder(this, collection,)
                    return new CollectionHandlerByMinimalistCollectionHolder(this, collection,)
                }
                if ("size" in referenceFound || "length" in referenceFound || "count" in referenceFound) {
                    // @ts-ignore: We only retrieve the nullable number
                    const size = (referenceFound?.size ?? referenceFound?.length ?? referenceFound?.count) as NullableNumber
                    if (size == null)
                        return new CollectionHandlerByIterable(this, referenceFound,)

                    //#region -------------------- Late-initialization (empty) --------------------

                    if (size == 0) {
                        this.#size = CommonLazy.ZERO_NUMBER
                        this.#isEmpty = CommonLazy.TRUE
                        this.#hasNull = false
                        this.#array = CollectionConstants.EMPTY_ARRAY
                        this.#set = CollectionConstants.EMPTY_SET
                        this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                        this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                        this.#handler = CollectionConstants.LAZY_EMPTY_COLLECTION_HANDLER
                        return CollectionConstants.EMPTY_COLLECTION_HANDLER
                    }

                    //#endregion -------------------- Late-initialization (empty) --------------------
                    //#region -------------------- Late-initialization (non-empty) --------------------

                    this.#isEmpty = CommonLazy.FALSE

                    //#region -------------------- Late-initialization (size = 1) --------------------

                    if (size == 1) {
                        this.#size = CommonLazy.ONE_NUMBER
                        return new CollectionHandlerByIterableWithSize(this, referenceFound,)
                    }

                    //#endregion -------------------- Late-initialization (size = 1) --------------------
                    //#region -------------------- Late-initialization (size = over 1) --------------------

                    this.#size = lazyOf(size,)
                    return new CollectionHandlerByIterableWithSize(this, referenceFound,)

                    //#endregion -------------------- Late-initialization (size = over 1) --------------------

                    //#endregion -------------------- Late-initialization (non-empty) --------------------
                }
                return new CollectionHandlerByIterable(this, referenceFound,)
            },)
            this.#isEmpty = lazy(() => {
                //#region -------------------- Late-initialization (empty) --------------------

                if (this._handler.isEmpty) {
                    this.#size = CommonLazy.ZERO_NUMBER
                    this.#isEmpty = CommonLazy.TRUE
                    this.#hasNull = false
                    this.#array = CollectionConstants.EMPTY_ARRAY
                    this.#set = CollectionConstants.EMPTY_SET
                    this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                    this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                    this.#handler = CollectionConstants.LAZY_EMPTY_COLLECTION_HANDLER
                    return true
                }

                //#endregion -------------------- Late-initialization (empty) --------------------
                //#region -------------------- Late-initialization (non-empty) --------------------

                this.#isEmpty = CommonLazy.FALSE
                return false

                //#endregion -------------------- Late-initialization (non-empty) --------------------
            },)
            this.#size = lazy(() => {
                const size = this._handler.size
                //#region -------------------- Late-initialization (empty) --------------------

                if (size == 0) {
                    this.#size = CommonLazy.ZERO_NUMBER
                    this.#isEmpty = CommonLazy.TRUE
                    this.#hasNull = false
                    this.#array = CollectionConstants.EMPTY_ARRAY
                    this.#set = CollectionConstants.EMPTY_SET
                    this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                    this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                    this.#handler = CollectionConstants.LAZY_EMPTY_COLLECTION_HANDLER
                    return 0
                }

                //#endregion -------------------- Late-initialization (empty) --------------------
                //#region -------------------- Late-initialization (non-empty) --------------------

                this.#isEmpty = CommonLazy.FALSE
                if (size == 1)
                    this.#size = CommonLazy.ONE_NUMBER
                return size

                //#endregion -------------------- Late-initialization (non-empty) --------------------
            },)
            return
        }

        sizeIf:if ("size" in reference || "length" in reference || "count" in reference) {
            this.#reference = lazyOf(reference,)
            // @ts-ignore: We only retrieve the nullable number
            const size = (reference?.size ?? reference?.length ?? reference?.count) as NullableNumber
            if (size == null) // No size is present even though there is a value in the reference
                break sizeIf

            //#region -------------------- Initialization (empty) --------------------

            if (size == 0) {
                this.#size = CommonLazy.ZERO_NUMBER
                this.#isEmpty = CommonLazy.TRUE
                this.#hasNull = false
                this.#array = CollectionConstants.EMPTY_ARRAY
                this.#set = CollectionConstants.EMPTY_SET
                this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                this.#handler = CollectionConstants.LAZY_EMPTY_COLLECTION_HANDLER
                return
            }

            //#endregion -------------------- Initialization (empty) --------------------
            //#region -------------------- Initialization (non-empty) --------------------

            this.#isEmpty = CommonLazy.FALSE
            this.#handler = lazyOf(new CollectionHandlerByIterableWithSize(this, reference,),)

            if (size == 1) {
                this.#size = CommonLazy.ONE_NUMBER
                return
            }

            this.#size = lazyOf(size,)
            return

            //#endregion -------------------- Initialization (non-empty) --------------------
        }


        this.#reference = lazyOf(reference,)
        this.#handler = lazyOf(new CollectionHandlerByIterable(this, reference,),)
        this.#isEmpty = lazy(() => {
            //#region -------------------- Late-initialization (empty) --------------------

            if (this._handler.isEmpty) {
                this.#size = CommonLazy.ZERO_NUMBER
                this.#isEmpty = CommonLazy.TRUE
                this.#hasNull = false
                this.#array = CollectionConstants.EMPTY_ARRAY
                this.#set = CollectionConstants.EMPTY_SET
                this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                this.#handler = CollectionConstants.LAZY_EMPTY_COLLECTION_HANDLER
                return true
            }

            //#endregion -------------------- Late-initialization (empty) --------------------
            //#region -------------------- Late-initialization (non-empty) --------------------

            this.#isEmpty = CommonLazy.FALSE
            return false

            //#endregion -------------------- Late-initialization (non-empty) --------------------
        },)
        this.#size = lazy(() => {
            const size = this._handler.size
            //#region -------------------- Late-initialization (empty) --------------------

            if (size == 0) {
                this.#size = CommonLazy.ZERO_NUMBER
                this.#isEmpty = CommonLazy.TRUE
                this.#hasNull = false
                this.#array = CollectionConstants.EMPTY_ARRAY
                this.#set = CollectionConstants.EMPTY_SET
                this.#weakSet = CollectionConstants.EMPTY_WEAK_SET
                this.#objectValuesMap = this.#map = CollectionConstants.EMPTY_MAP
                this.#handler = CollectionConstants.LAZY_EMPTY_COLLECTION_HANDLER
                return 0
            }

            //#endregion -------------------- Late-initialization (empty) --------------------
            //#region -------------------- Late-initialization (non-empty) --------------------

            this.#isEmpty = CommonLazy.FALSE
            if (size == 1)
                this.#size = CommonLazy.ONE_NUMBER
            return size

            //#endregion -------------------- Late-initialization (non-empty) --------------------
        },)
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    public override get size(): number {
        return this.#size.value
    }

    public override get isEmpty(): boolean {
        return this.#isEmpty.value
    }


    public override get hasNull(): boolean {
        return this.#hasNull ??= hasNullByCollectionHolder(this,)
    }


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

    public override get(index: number,): T {
        const valueFound = this._handler.get(index,)
        if (valueFound.cause != null)
            throw valueFound.cause
        return valueFound.value as T
    }

    public override getOrElse<U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,) {
        const valueHolder = this._handler.get(index,)
        const valueFound = valueHolder.value
        if (valueFound != null)
            return valueFound

        if (valueHolder.isForbidden)
            return defaultValue(index,)
        if (index < 0)
            return defaultValue(this.size + index,)
        return defaultValue(index,)
    }

    public override getOrNull(index: number,): NullOr<T> {
        return this._handler.get(index,).value
    }

    public override get objectValuesMap(): ReadonlyMap<T, ObjectOf<T>> {
        return this.#objectValuesMap ??= objectValuesMapByCollectionHolder(this,)
    }

    public override toArray(): readonly T[] {
        return this.#array ??= toArrayByCollectionHolder(this,)
    }

    public override toSet(): ReadonlySet<T> {
        return this.#set ??= toSetByCollectionHolder(this,)
    }

    public override toWeakSet(): Readonly<WeakSet<ObjectOf<T>>> {
        return this.#weakSet ??= toWeakSet(this,)
    }

    public override toMap(): ReadonlyMap<number, T> {
        return this.#map ??= toMapByCollectionHolder(this,)
    }

    //#endregion -------------------- Methods --------------------

}

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

import type {Lazy}    from "@joookiwi/lazy"
import type {NullOr}  from "@joookiwi/type"
import {lazy, lazyOf} from "@joookiwi/lazy"

import type {CollectionHolder}                                                                                                             from "./CollectionHolder"
import type {MinimalistCollectionHolder}                                                                                                   from "./MinimalistCollectionHolder"
import type {CollectionHandler}                                                                                                            from "./handler/CollectionHandler"
import type {IterableWithCount}                                                                                                            from "./iterable/IterableWithCount"
import type {IterableWithLength}                                                                                                           from "./iterable/IterableWithLength"
import type {IterableWithPossibleSize}                                                                                                     from "./iterable/IterableWithPossibleSize"
import type {IterableWithSize}                                                                                                             from "./iterable/IterableWithSize"
import type {CollectionIterator}                                                                                                           from "./iterator/CollectionIterator"
import type {IndexWithReturnCallback}                                                                                                      from "./type/callback"
import type {PossibleIterableArraySetOrCollectionHolder, PossibleIterableIteratorArraySetOrCollectionHolder, PossibleIterableOrCollection} from "./type/possibleInstance"

import {AbstractCollectionHolder}                         from "./AbstractCollectionHolder"
import {CollectionConstants}                              from "./CollectionConstants"
import {CollectionHandlerByArray}                         from "./handler/CollectionHandlerByArray"
import {CollectionHandlerByArrayOf1}                      from "./handler/CollectionHandlerByArrayOf1"
import {CollectionHandlerByArrayOf2}                      from "./handler/CollectionHandlerByArrayOf2"
import {CollectionHandlerByCollectionHolder}              from "./handler/CollectionHandlerByCollectionHolder"
import {CollectionHandlerByCollectionHolderOf1}           from "./handler/CollectionHandlerByCollectionHolderOf1"
import {CollectionHandlerByCollectionHolderOf2}           from "./handler/CollectionHandlerByCollectionHolderOf2"
import {CollectionHandlerByCollectionIterator}            from "./handler/CollectionHandlerByCollectionIterator"
import {CollectionHandlerByCollectionIteratorOf1}         from "./handler/CollectionHandlerByCollectionIteratorOf1"
import {CollectionHandlerByCollectionIteratorOf2}         from "./handler/CollectionHandlerByCollectionIteratorOf2"
import {CollectionHandlerByIterable}                      from "./handler/CollectionHandlerByIterable"
import {CollectionHandlerByIterator}                      from "./handler/CollectionHandlerByIterator"
import {CollectionHandlerByIterableWithSize}              from "./handler/CollectionHandlerByIterableWithSize"
import {CollectionHandlerByIterableWithSizeOf1}           from "./handler/CollectionHandlerByIterableWithSizeOf1"
import {CollectionHandlerByIterableWithSizeOf2}           from "./handler/CollectionHandlerByIterableWithSizeOf2"
import {CollectionHandlerByMinimalistCollectionHolder}    from "./handler/CollectionHandlerByMinimalistCollectionHolder"
import {CollectionHandlerByMinimalistCollectionHolderOf1} from "./handler/CollectionHandlerByMinimalistCollectionHolderOf1"
import {CollectionHandlerByMinimalistCollectionHolderOf2} from "./handler/CollectionHandlerByMinimalistCollectionHolderOf2"
import {CollectionHandlerBySet}                           from "./handler/CollectionHandlerBySet"
import {CollectionHandlerBySetOf1}                        from "./handler/CollectionHandlerBySetOf1"
import {CollectionHandlerBySetOf2}                        from "./handler/CollectionHandlerBySetOf2"
import {isArray}                                          from "./method/isArray"
import {isArrayByStructure}                               from "./method/isArrayByStructure"
import {isCollectionIterator}                             from "./method/isCollectionIterator"
import {isCollectionIteratorByStructure}                  from "./method/isCollectionIteratorByStructure"
import {isCollectionHolder}                               from "./method/isCollectionHolder"
import {isCollectionHolderByStructure}                    from "./method/isCollectionHolderByStructure"
import {isIterator}                                       from "./method/isIterator"
import {isIteratorByStructure}                            from "./method/isIteratorByStructure"
import {isMinimalistCollectionHolder}                     from "./method/isMinimalistCollectionHolder"
import {isMinimalistCollectionHolderByStructure}          from "./method/isMinimalistCollectionHolderByStructure"
import {isSet}                                            from "./method/isSet"
import {isSetByStructure}                                 from "./method/isSetByStructure"

/**
 * A {@link CollectionHolder} having the values associated to it, but lazily retrieved.
 *
 * Meaning that the value in the instance are not retrieved until it is necessary.
 *
 * @typeParam T         The element type
 * @typeParam REFERENCE (deprecated, it will be removed in version 1.14) The reference passed in the constructor
 * @note The index in the instance may not be initialized if retrieved directly
 * @see GenericMinimalistCollectionHolder
 * @see GenericCollectionHolder
 * @see EmptyCollectionHolder
 * @beta
 */
export class LazyGenericCollectionHolder<const T = unknown,
    const _REFERENCE extends PossibleIterableOrCollection<T> = PossibleIterableArraySetOrCollectionHolder<T>, >
    extends AbstractCollectionHolder<T> {

    //#region -------------------- Fields --------------------

    #size?: number
    #isEmpty?: boolean
    #hasNull?: boolean
    #hasDuplicate?: boolean

    #lazySize?: Lazy<number>
    #lazyIsEmpty?: Lazy<boolean>
    #lazyHasNull?: Lazy<boolean>
    #lazyHasDuplicate?: Lazy<boolean>

    readonly #reference: Lazy<PossibleIterableIteratorArraySetOrCollectionHolder<T>>
    #array?: readonly T[]
    #set?: ReadonlySet<T>
    #map?: ReadonlyMap<number, T>

    #handler?: CollectionHandler<T>
    #lazyHandler?: Lazy<CollectionHandler<T>>

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
    public constructor(iterator: Iterator<T, unknown, unknown>,)
    public constructor(lateIterator: () => Iterator<T, unknown, unknown>,)
    public constructor(iterableWithSize: IterableWithSize<T>,)
    public constructor(lateIterableWithSize: () => IterableWithSize<T>,)
    public constructor(iterableWithLength: IterableWithLength<T>,)
    public constructor(lateIterableWithLength: () => IterableWithLength<T>,)
    public constructor(iterableWithCount: IterableWithCount<T>,)
    public constructor(lateIterableWithCount: () => IterableWithCount<T>,)
    public constructor(iterableWithPossibleSize: IterableWithPossibleSize<T>,)
    public constructor(lateIterableWithPossibleSize: () => IterableWithPossibleSize<T>,)
    public constructor(iterable: Iterable<T, unknown, unknown>,)
    public constructor(lateIterable: () => Iterable<T, unknown, unknown>,)
    public constructor(reference: PossibleIterableIteratorArraySetOrCollectionHolder<T>,)
    public constructor(lateReference: () => PossibleIterableIteratorArraySetOrCollectionHolder<T>,)
    public constructor(reference: PossibleIterableIteratorArraySetOrCollectionHolder<T> | (() => PossibleIterableIteratorArraySetOrCollectionHolder<T>),)
    public constructor(reference: | PossibleIterableIteratorArraySetOrCollectionHolder<T> | (() => PossibleIterableIteratorArraySetOrCollectionHolder<T>),) {
        super()
        // README: The lazy instantiation has some weird shenanigan to keep its laziness nature pure.
        //         Also, to be efficient, there is some duplicate code in the constructor.
        //         Note that some paths are not fully optimized yet

        //#region -------------------- Initialization by a known instance --------------------

        if (isArray(reference,)) {
            this.#reference = lazyOf(reference,)
            const handler = this.#lazyHandler = lazy(() => this.#handlerByArray(reference,),)
            this.#lazySize = lazy(() => handler.value.size,)
            this.#lazyIsEmpty = lazy(() => handler.value.isEmpty,)
            this.#lazyHasNull = lazy(() => handler.value.hasNull,)
            this.#lazyHasDuplicate = lazy(() => handler.value.hasDuplicate,)
        }

        if (isSet(reference,)) {
            this.#reference = lazyOf(reference,)
            const handler = this.#lazyHandler = lazy(() => this.#handlerBySet(reference,),)
            this.#lazySize = lazy(() => handler.value.size,)
            this.#lazyIsEmpty = lazy(() => handler.value.isEmpty,)
            this.#lazyHasNull = lazy(() => handler.value.hasNull,)
            this.#hasDuplicate = false
        }

        if (isCollectionHolder(reference,)) {
            this.#reference = lazyOf(reference,)
            const handler = this.#lazyHandler = lazy(() => this.#handlerByCollectionHolder(reference,),)
            this.#lazySize = lazy(() => handler.value.size,)
            this.#lazyIsEmpty = lazy(() => handler.value.isEmpty,)
            this.#lazyHasNull = lazy(() => handler.value.hasNull,)
            this.#lazyHasDuplicate = lazy(() => handler.value.hasDuplicate,)
            return
        }

        if (isMinimalistCollectionHolder(reference,)) {
            this.#reference = lazyOf(reference,)
            const handler = this.#lazyHandler = lazy(() => this.#handlerByMinimalistCollectionHolder(reference,),)
            this.#lazySize = lazy(() => handler.value.size,)
            this.#lazyIsEmpty = lazy(() => handler.value.isEmpty,)
            this.#lazyHasNull = lazy(() => handler.value.hasNull,)
            this.#lazyHasDuplicate = lazy(() => handler.value.hasDuplicate,)
            return
        }

        if (isCollectionIterator(reference,)) {
            this.#reference = lazyOf(reference,)
            const handler = this.#lazyHandler = lazy(() => this.#handlerByCollectionIterator(reference,),)
            this.#lazySize = lazy(() => handler.value.size,)
            this.#lazyIsEmpty = lazy(() => handler.value.isEmpty,)
            this.#lazyHasNull = lazy(() => handler.value.hasNull,)
            this.#lazyHasDuplicate = lazy(() => handler.value.hasDuplicate,)
            return
        }

        if (isIterator(reference,)) {
            this.#reference = lazyOf(reference,)
            const handler = this.#lazyHandler = lazy(() => new CollectionHandlerByIterator(this, reference,),)
            this.#lazySize = lazy(() => handler.value.size,)
            this.#lazyIsEmpty = lazy(() => handler.value.isEmpty,)
            this.#lazyHasNull = lazy(() => handler.value.hasNull,)
            this.#lazyHasDuplicate = lazy(() => handler.value.hasDuplicate,)
            return
        }

        //#endregion -------------------- Initialization by a known instance --------------------
        //#region -------------------- Initialization by a structure --------------------

        if (isArrayByStructure<T>(reference,)) {
            this.#reference = lazyOf(reference,)
            const handler = this.#lazyHandler = lazy(() => this.#handlerByArray(reference,),)
            this.#lazySize = lazy(() => handler.value.size,)
            this.#lazyIsEmpty = lazy(() => handler.value.isEmpty,)
            this.#lazyHasNull = lazy(() => handler.value.hasNull,)
        }

        if (isSetByStructure<T>(reference,)) {
            this.#reference = lazyOf(reference ,)
            const handler = this.#lazyHandler = lazy(() => this.#handlerBySet(reference,),)
            this.#lazySize = lazy(() => handler.value.size,)
            this.#lazyIsEmpty = lazy(() => handler.value.isEmpty,)
            this.#lazyHasNull = lazy(() => handler.value.hasNull,)
            this.#hasDuplicate = false
        }

        if (isCollectionHolderByStructure<T>(reference,)) {
            this.#reference = lazyOf(reference,)
            const handler = this.#lazyHandler = lazy(() => this.#handlerByCollectionHolder(reference,),)
            this.#lazySize = lazy(() => handler.value.size,)
            this.#lazyIsEmpty = lazy(() => handler.value.isEmpty,)
            this.#lazyHasNull = lazy(() => handler.value.hasNull,)
            this.#lazyHasDuplicate = lazy(() => handler.value.hasDuplicate,)
            return
        }

        if (isMinimalistCollectionHolderByStructure<T>(reference,)) {
            this.#reference = lazyOf(reference,)
            const handler = this.#lazyHandler = lazy(() => this.#handlerByMinimalistCollectionHolder(reference,),)
            this.#lazySize = lazy(() => handler.value.size,)
            this.#lazyIsEmpty = lazy(() => handler.value.isEmpty,)
            this.#lazyHasNull = lazy(() => handler.value.hasNull,)
            this.#lazyHasDuplicate = lazy(() => handler.value.hasDuplicate,)
            return
        }

        if (isCollectionIteratorByStructure<T>(reference,)) {
            this.#reference = lazyOf(reference,)
            const handler = this.#lazyHandler = lazy(() => this.#handlerByCollectionIterator(reference,),)
            this.#lazySize = lazy(() => handler.value.size,)
            this.#lazyIsEmpty = lazy(() => handler.value.isEmpty,)
            this.#lazyHasNull = lazy(() => handler.value.hasNull,)
            this.#lazyHasDuplicate = lazy(() => handler.value.hasDuplicate,)
            return
        }

        if (isIteratorByStructure<T>(reference,)) {
            this.#reference = lazyOf(reference,)
            const handler = this.#lazyHandler = lazy(() => new CollectionHandlerByIterator(this, reference,),)
            this.#lazySize = lazy(() => handler.value.size,)
            this.#lazyIsEmpty = lazy(() => handler.value.isEmpty,)
            this.#lazyHasNull = lazy(() => handler.value.hasNull,)
            this.#lazyHasDuplicate = lazy(() => handler.value.hasDuplicate,)
            return
        }

        //#endregion -------------------- Initialization by a structure --------------------

        if (reference instanceof Function) {
            const lazyReference = this.#reference = lazy(reference,)
            const handler = this.#lazyHandler = lazy<CollectionHandler<T>>(() => {
                const referenceFound = lazyReference.value

                //#region -------------------- Late-initialization by a known instance --------------------

                if (isArray(referenceFound,)) {
                    const handler = this.#handler = this.#handlerByArray(referenceFound,)
                    if (this.#size == null)
                        this.#lazySize = lazy(() => handler.size,)
                    if (this.#hasNull == null)
                        this.#lazyHasNull = lazy(() => handler.hasNull,)
                    if (this.#hasDuplicate == null)
                        this.#lazyHasDuplicate = lazy(() => handler.hasDuplicate,)
                    return handler
                }

                if (isSet(referenceFound,)) {
                    const handler = this.#handler = this.#handlerBySet(referenceFound,)
                    if (this.#size == null)
                        this.#lazySize = lazy(() => handler.size,)
                    if (this.#hasNull == null)
                        this.#lazyHasNull = lazy(() => handler.hasNull,)
                    this.#hasDuplicate = false
                }

                if (isCollectionHolder(referenceFound,)) {
                    const handler = this.#handler = this.#handlerByCollectionHolder(referenceFound,)
                    if (this.#size == null)
                        this.#lazySize = lazy(() => handler.size,)
                    if (this.#hasNull == null)
                        this.#lazyHasNull = lazy(() => handler.hasNull,)
                    if (this.#hasDuplicate == null)
                        this.#lazyHasDuplicate = lazy(() => handler.hasDuplicate,)
                    return handler
                }

                if (isMinimalistCollectionHolder(referenceFound,)) {
                    const handler = this.#handler = this.#handlerByMinimalistCollectionHolder(referenceFound,)
                    if (this.#size == null)
                        this.#lazySize = lazy(() => handler.size,)
                    if (this.#hasNull == null)
                        this.#lazyHasNull = lazy(() => handler.hasNull,)
                    if (this.#hasDuplicate == null)
                        this.#lazyHasDuplicate = lazy(() => handler.hasDuplicate,)
                    return handler
                }

                if (isCollectionIterator(referenceFound,)) {
                    const handler = this.#handler = this.#handlerByCollectionIterator(referenceFound,)
                    if (this.#size != null)
                        this.#lazySize = lazy(() => handler.size,)
                    if (this.#hasNull != null)
                        this.#lazyHasNull = lazy(() => handler.hasNull,)
                    if (this.#hasDuplicate != null)
                        this.#lazyHasDuplicate = lazy(() => handler.hasDuplicate,)
                    return handler
                }

                if (isIterator(referenceFound,)) {
                    const handler = this.#handler = new CollectionHandlerByIterator(this, referenceFound,)
                    if (this.#size != null)
                        this.#lazySize = lazy(() => handler.size,)
                    if (this.#hasNull != null)
                        this.#lazyHasNull = lazy(() => handler.hasNull,)
                    if (this.#hasDuplicate != null)
                        this.#lazyHasDuplicate = lazy(() => handler.hasDuplicate,)
                    return handler
                }

                //#endregion -------------------- Late-initialization by a known instance --------------------
                //#region -------------------- Late-initialization by a structure --------------------

                if (isArrayByStructure<T>(referenceFound,)) {
                    const handler = this.#handler = this.#handlerByArray(referenceFound,)
                    if (this.#size == null)
                        this.#lazySize = lazy(() => handler.size,)
                    if (this.#hasNull == null)
                        this.#lazyHasNull = lazy(() => handler.hasNull,)
                    if (this.#hasDuplicate == null)
                        this.#lazyHasDuplicate = lazy(() => handler.hasDuplicate,)
                    return handler
                }

                if (isSetByStructure<T>(referenceFound,)) {
                    const handler = this.#handler = this.#handlerBySet(referenceFound,)
                    if (this.#size == null)
                        this.#lazySize = lazy(() => handler.size,)
                    if (this.#hasNull == null)
                        this.#lazyHasNull = lazy(() => handler.hasNull,)
                    this.#hasDuplicate = false
                }

                if (isCollectionHolderByStructure<T>(referenceFound,)) {
                    const handler = this.#handler = this.#handlerByMinimalistCollectionHolder(referenceFound,)
                    if (this.#size == null)
                        this.#lazySize = lazy(() => handler.size,)
                    if (this.#hasNull == null)
                        this.#lazyHasNull = lazy(() => handler.hasNull,)
                    if (this.#hasDuplicate == null)
                        this.#lazyHasDuplicate = lazy(() => handler.hasDuplicate,)
                    return handler
                }

                if (isMinimalistCollectionHolderByStructure<T>(referenceFound,)) {
                    const handler = this.#handler = this.#handlerByMinimalistCollectionHolder(referenceFound,)
                    if (this.#size == null)
                        this.#lazySize = lazy(() => handler.size,)
                    if (this.#hasNull == null)
                        this.#lazyHasNull = lazy(() => handler.hasNull,)
                    if (this.#hasDuplicate == null)
                        this.#lazyHasDuplicate = lazy(() => handler.hasDuplicate,)
                    return handler
                }

                if (isCollectionIteratorByStructure<T>(referenceFound,)) {
                    const handler = this.#handler = this.#handlerByCollectionIterator(referenceFound,)
                    if (this.#size != null)
                        this.#lazySize = lazy(() => handler.size,)
                    if (this.#hasNull != null)
                        this.#lazyHasNull = lazy(() => handler.hasNull,)
                    if (this.#hasDuplicate != null)
                        this.#lazyHasDuplicate = lazy(() => handler.hasDuplicate,)
                    return handler
                }

                if (isIteratorByStructure<T>(referenceFound,)) {
                    const handler = this.#handler = new CollectionHandlerByIterator(this, referenceFound,)
                    if (this.#size != null)
                        this.#lazySize = lazy(() => handler.size,)
                    if (this.#hasNull != null)
                        this.#lazyHasNull = lazy(() => handler.hasNull,)
                    if (this.#hasDuplicate != null)
                        this.#lazyHasDuplicate = lazy(() => handler.hasDuplicate,)
                    return handler
                }

                //#endregion -------------------- Late-initialization by a structure --------------------
                //#region -------------------- Late-initialization by an iterator --------------------

                sizeIf: if ("size" in referenceFound) {
                    const size = referenceFound.size
                    if (size == null) // No size is present even though there is a value in the reference
                        break sizeIf

                    this.#size = size
                    const handler = this.#handler = this.#handlerByIterableWithSize(referenceFound, size,)
                    if (this.#hasNull != null)
                        this.#lazyHasNull = lazy(() => handler.hasNull,)
                    if (this.#hasDuplicate != null)
                        this.#lazyHasDuplicate = lazy(() => handler.hasDuplicate,)
                    return handler
                }

                lengthIf: if ("length" in referenceFound) {
                    const size = referenceFound.length
                    if (size == null) // No size is present even though there is a value in the reference
                        break lengthIf

                    this.#size = size
                    const handler = this.#handler = this.#handlerByIterableWithSize(referenceFound, size,)
                    if (this.#hasNull != null)
                        this.#lazyHasNull = lazy(() => handler.hasNull,)
                    if (this.#hasDuplicate != null)
                        this.#lazyHasDuplicate = lazy(() => handler.hasDuplicate,)
                    return handler
                }

                countIf: if ("count" in referenceFound) {
                    const size = referenceFound.count
                    if (size == null) // No size is present even though there is a value in the reference
                        break countIf

                    this.#size = size
                    const handler = this.#handler = this.#handlerByIterableWithSize(referenceFound, size,)
                    if (this.#hasNull != null)
                        this.#lazyHasNull = lazy(() => handler.hasNull,)
                    if (this.#hasDuplicate != null)
                        this.#lazyHasDuplicate = lazy(() => handler.hasDuplicate,)
                    return handler
                }

                const handler = this.#handler = new CollectionHandlerByIterable(this, referenceFound,)
                if (this.#size != null)
                    this.#lazySize = lazy(() => handler.size,)
                if (this.#hasNull != null)
                    this.#lazyHasNull = lazy(() => handler.hasNull,)
                if (this.#hasDuplicate != null)
                    this.#lazyHasDuplicate = lazy(() => handler.hasDuplicate,)
                return handler

                //#endregion -------------------- Late-initialization by an iterator --------------------
            },)
            this.#lazySize = lazy(() => handler.value.size,)
            this.#lazyIsEmpty = lazy(() => handler.value.isEmpty,)
            this.#lazyHasNull = lazy(() => handler.value.hasNull,)
            this.#lazyHasDuplicate = lazy(() => handler.value.hasDuplicate,)
            return
        }

        //#region -------------------- Initialization by an iterator --------------------

        this.#reference = lazyOf(reference,)

        sizeIf: if ("size" in reference) {
            const size = reference.size
            if (size == null) // No size is present even though there is a value in the reference
                break sizeIf

            this.#size = size
            const handler = this.#lazyHandler = lazy(() => this.#handlerByIterableWithSize(reference, size,),)
            this.#lazyIsEmpty = lazy(() => handler.value.isEmpty,)
            this.#lazyHasNull = lazy(() => handler.value.hasNull,)
            this.#lazyHasDuplicate = lazy(() => handler.value.hasDuplicate,)
            return
        }

        lengthIf: if ("length" in reference) {
            const size = reference.length
            if (size == null) // No size is present even though there is a value in the reference
                break lengthIf

            this.#size = size
            const handler = this.#lazyHandler = lazy(() => this.#handlerByIterableWithSize(reference, size,),)
            this.#lazyIsEmpty = lazy(() => handler.value.isEmpty,)
            this.#lazyHasNull = lazy(() => handler.value.hasNull,)
            this.#lazyHasDuplicate = lazy(() => handler.value.hasDuplicate,)
            return
        }

        countIf: if ("count" in reference) {
            const size = reference.count
            if (size == null) // No size is present even though there is a value in the reference
                break countIf

            this.#size = size
            const handler = this.#lazyHandler = lazy(() => this.#handlerByIterableWithSize(reference, size,),)
            this.#lazyIsEmpty = lazy(() => handler.value.isEmpty,)
            this.#lazyHasNull = lazy(() => handler.value.hasNull,)
            this.#lazyHasDuplicate = lazy(() => handler.value.hasDuplicate,)
            return
        }

        const handler = this.#lazyHandler = lazyOf(new CollectionHandlerByIterable(this, reference,),)
        this.#lazySize = lazy(() => handler.value.size,)
        this.#lazyIsEmpty = lazy(() => handler.value.isEmpty,)
        this.#lazyHasNull = lazy(() => handler.value.hasNull,)
        this.#lazyHasDuplicate = lazy(() => handler.value.hasDuplicate,)

        //#endregion -------------------- Initialization by an iterator --------------------
    }

    //#region -------------------- Constructor helper methods --------------------

    //README: Those methods are only called during the construction and are integral part of the constructor.
    //        The methods should not call other methods.
    //        They are here to help avoid too much duplication toward the internal fields.
    //        Also, they don't re-initialize the lazy value if the value is already set.

    #handlerByArray(reference: ReadonlyArray<T>,): CollectionHandler<T> {
        const size = this.#size = reference.length

        //#region -------------------- Initialization (size = 0) --------------------

        if (this.#isEmpty = size == 0) {
            this.#size = 0
            this.#hasNull = this.#hasDuplicate = false
            this.#array = CollectionConstants.EMPTY_ARRAY
            this.#set = CollectionConstants.EMPTY_SET
            return this.#handler = CollectionConstants.EMPTY_COLLECTION_HANDLER
        }

        //#endregion -------------------- Initialization (size = 0) --------------------
        //#region -------------------- Initialization (size = 1) --------------------

        if (Object.isFrozen(reference,))
            this.#array = reference

        if (size == 1) {
            const handler = new CollectionHandlerByArrayOf1(this, reference, size,)
            if (this.#hasNull != null)
                this.#lazyHasNull = lazy(() => handler.hasNull,)
            this.#hasDuplicate = false
            return handler
        }

        //#endregion -------------------- Initialization (size = 1) --------------------
        //#region -------------------- Initialization (size = 2) --------------------

        if (size == 2) {
            const handler = new CollectionHandlerByArrayOf2(this, reference, size,)
            if (this.#hasNull != null)
                this.#lazyHasNull = lazy(() => handler.hasNull,)
            if (this.#hasDuplicate != null)
                this.#lazyHasDuplicate = lazy(() => handler.hasDuplicate,)
            return handler
        }

        //#endregion -------------------- Initialization (size = 2) --------------------
        //#region -------------------- Initialization (size = over 2) --------------------

        const handler = new CollectionHandlerByArray<T>(this, reference,)
        if (this.#hasNull != null)
            this.#lazyHasNull = lazy(() => handler.hasNull,)
        if (this.#hasDuplicate != null)
            this.#lazyHasDuplicate = lazy(() => handler.hasDuplicate,)
        return handler

        //#endregion -------------------- Initialization (size = over 2) --------------------
    }

    #handlerBySet(reference: ReadonlySet<T>,): CollectionHandler<T> {
        this.#hasDuplicate = false
        const size = this.#size = reference.size

        //#region -------------------- Initialization (empty) --------------------

        if (this.#isEmpty = size == 0) {
            this.#hasNull = false
            this.#array = CollectionConstants.EMPTY_ARRAY
            this.#set = CollectionConstants.EMPTY_SET
            return this.#handler = CollectionConstants.EMPTY_COLLECTION_HANDLER
        }

        //#endregion -------------------- Initialization (empty) --------------------
        //#region -------------------- Initialization (size = 1) --------------------

        if (Object.isFrozen(reference,))
            this.#set = reference

        if (size == 1) {
            const handler = new CollectionHandlerBySetOf1<T>(this, reference, size,)
            if (this.#hasNull != null)
                this.#lazyHasNull = lazy(() => handler.hasNull,)
            return handler
        }

        //#endregion -------------------- Initialization (size = 1) --------------------
        //#region -------------------- Initialization (size = 2) --------------------

        if (size == 2) {
            const handler = new CollectionHandlerBySetOf2<T>(this, reference, size,)
            if (this.#hasNull != null)
                this.#lazyHasNull = lazy(() => handler.hasNull,)
            return handler
        }

        //#endregion -------------------- Initialization (size = 2) --------------------
        //#region -------------------- Initialization (size = over 2) --------------------

        const handler = new CollectionHandlerBySet<T>(this, reference,)
        if (this.#hasNull != null)
            this.#lazyHasNull = lazy(() => handler.hasNull,)
        return handler

        //#endregion -------------------- Initialization (size = over 2) --------------------
    }

    #handlerByCollectionHolder(reference: CollectionHolder<T>,): CollectionHandler<T> {
        //#region -------------------- Initialization (size = 0) --------------------

        if (this.#isEmpty = reference.isEmpty) {
            this.#size = 0
            this.#hasNull = this.#hasDuplicate = false
            this.#array = CollectionConstants.EMPTY_ARRAY
            this.#set = CollectionConstants.EMPTY_SET
            return this.#handler = CollectionConstants.EMPTY_COLLECTION_HANDLER
        }

        //#endregion -------------------- Initialization (size = 0) --------------------
        //#region -------------------- Initialization (size = 1) --------------------

        const size = this.#size = reference.size
        if (size == 1) {
            const handler = new CollectionHandlerByCollectionHolderOf1<T>(this, reference, size,)
            this.#hasDuplicate = false
            return handler
        }

        //#endregion -------------------- Initialization (size = 1) --------------------
        //#region -------------------- Initialization (size = 2) --------------------

        if (size == 2) {
            const handler = new CollectionHandlerByCollectionHolderOf2<T>(this, reference, size,)
            if (this.#hasNull != null)
                this.#lazyHasNull = lazy(() => handler.hasNull,)
            if (this.#hasDuplicate != null)
                this.#lazyHasDuplicate = lazy(() => handler.hasDuplicate,)
            return handler
        }

        //#endregion -------------------- Initialization (size = 2) --------------------
        //#region -------------------- Initialization (size = over 2) --------------------

        if (this.#hasNull != null)
            this.#lazyHasNull = lazy(() => reference.hasNull,)
        const handler = new CollectionHandlerByCollectionHolder<T>(this, reference,)
        if (this.#hasDuplicate != null)
            this.#lazyHasDuplicate = lazy(() => handler.hasDuplicate,)
        return handler

        //#endregion -------------------- Initialization (size = over 2) --------------------
    }

    #handlerByMinimalistCollectionHolder(reference: MinimalistCollectionHolder<T>,): CollectionHandler<T> {
        const size = this.#size = reference.size

        //#region -------------------- Initialization (size = 0) --------------------

        if (this.#isEmpty = size == 0) {
            this.#hasNull = this.#hasDuplicate = false
            this.#array = CollectionConstants.EMPTY_ARRAY
            this.#set = CollectionConstants.EMPTY_SET
            return CollectionConstants.EMPTY_COLLECTION_HANDLER
        }

        //#endregion -------------------- Initialization (size = 0) --------------------
        //#region -------------------- Initialization (size = 1) --------------------

        if (size == 1) {
            const handler = new CollectionHandlerByMinimalistCollectionHolderOf1<T>(this, reference, size,)
            if (this.#hasNull != null)
                this.#lazyHasNull = lazy(() => handler.hasNull,)
            this.#hasDuplicate = false
            return handler
        }

        //#endregion -------------------- Initialization (size = 1) --------------------
        //#region -------------------- Initialization (size = 2) --------------------

        if (size == 2) {
            const handler = new CollectionHandlerByMinimalistCollectionHolderOf2<T>(this, reference, size,)
            if (this.#hasNull != null)
                this.#lazyHasNull = lazy(() => handler.hasNull,)
            if (this.#hasDuplicate != null)
                this.#lazyHasDuplicate = lazy(() => handler.hasDuplicate,)
            return handler
        }

        //#endregion -------------------- Initialization (size = 2) --------------------
        //#region -------------------- Initialization (size = over 2) --------------------

        const handler = new CollectionHandlerByMinimalistCollectionHolder<T>(this, reference,)
        if (this.#hasNull != null)
            this.#lazyHasNull = lazy(() => handler.hasNull,)
        if (this.#hasDuplicate != null)
            this.#lazyHasDuplicate = lazy(() => handler.hasDuplicate,)
        return handler

        //#endregion -------------------- Initialization (size = over 2) --------------------
    }

    #handlerByCollectionIterator(reference: CollectionIterator<T>,): CollectionHandler<T> {
        const size = this.#size = reference.size

        //#region -------------------- Initialization (size = 0) --------------------

        if (this.#isEmpty = size == 0) {
            this.#hasNull = this.#hasDuplicate = false
            this.#array = CollectionConstants.EMPTY_ARRAY
            this.#set = CollectionConstants.EMPTY_SET
            return CollectionConstants.EMPTY_COLLECTION_HANDLER
        }

        //#endregion -------------------- Initialization (size = 0) --------------------
        //#region -------------------- Initialization (size = 1) --------------------

        if (size == 1) {
            const handler = new CollectionHandlerByCollectionIteratorOf1<T>(this, reference, size,)
            if (this.#hasNull != null)
                this.#lazyHasNull = lazy(() => handler.hasNull,)
            this.#hasDuplicate = false
            return handler
        }

        //#endregion -------------------- Initialization (size = 1) --------------------
        //#region -------------------- Initialization (size = 2) --------------------

        if (size == 2) {
            const handler = new CollectionHandlerByCollectionIteratorOf2<T>(this, reference, size,)
            if (this.#hasNull != null)
                this.#lazyHasNull = lazy(() => handler.hasNull,)
            if (this.#hasDuplicate != null)
                this.#lazyHasDuplicate = lazy(() => handler.hasDuplicate,)
            return handler
        }

        //#endregion -------------------- Initialization (size = 2) --------------------
        //#region -------------------- Initialization (size = over 2) --------------------

        const handler = new CollectionHandlerByCollectionIterator<T>(this, reference,)
        if (this.#hasNull != null)
            this.#lazyHasNull = lazy(() => handler.hasNull,)
        if (this.#hasDuplicate != null)
            this.#lazyHasDuplicate = lazy(() => handler.hasDuplicate,)
        return handler

        //#endregion -------------------- Initialization (size = over 2) --------------------
    }

    #handlerByIterableWithSize(reference: Iterable<T>, size: number,): CollectionHandler<T> {
        //#region -------------------- Initialization (size = 0) --------------------

        if (this.#isEmpty = size == 0) {
            this.#hasNull = this.#hasDuplicate = false
            this.#array = CollectionConstants.EMPTY_ARRAY
            this.#set = CollectionConstants.EMPTY_SET
            return CollectionConstants.EMPTY_COLLECTION_HANDLER
        }

        //#endregion -------------------- Initialization (size = 0) --------------------
        //#region -------------------- Initialization (size = 1) --------------------

        if (size == 1) {
            const handler = new CollectionHandlerByIterableWithSizeOf1<T>(this, reference, size,)
            if (this.#hasNull != null)
                this.#lazyHasNull = lazy(() => handler.hasNull,)
            this.#hasDuplicate = false
            return handler
        }

        //#endregion -------------------- Initialization (size = 1) --------------------
        //#region -------------------- Initialization (size = 2) --------------------

        if (size == 2) {
            const handler = new CollectionHandlerByIterableWithSizeOf2<T>(this, reference, size,)
            if (this.#hasNull != null)
                this.#lazyHasNull = lazy(() => handler.hasNull,)
            if (this.#hasDuplicate != null)
                this.#lazyHasDuplicate = lazy(() => handler.hasDuplicate,)
            return handler
        }

        //#endregion -------------------- Initialization (size = 2) --------------------
        //#region -------------------- Initialization (size = over 2) --------------------

        const handler = new CollectionHandlerByIterableWithSize<T>(this, reference, size,)
        if (this.#hasNull != null)
            this.#lazyHasNull = lazy(() => handler.hasNull,)
        if (this.#hasDuplicate != null)
            this.#lazyHasDuplicate = lazy(() => handler.hasDuplicate,)
        return handler

        //#endregion -------------------- Initialization (size = over 2) --------------------
    }

    //#endregion -------------------- Constructor helper methods --------------------

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    /** The {@link PossibleIterableOrCollection iterable or collection} received in the {@link LazyGenericCollectionHolder.constructor constructor} */
    protected get _reference(): PossibleIterableIteratorArraySetOrCollectionHolder<T> { return this.#reference.value }

    /** The {@link CollectionHandler handler} created from the {@link LazyGenericCollectionHolder} {@link LazyGenericCollectionHolder.constructor constructor} */
    protected get _handler(): CollectionHandler<T> {
        const value = this.#handler
        if (value != null)
            return value

        const valueFromLazy = this.#lazyHandler!.value
        const value2 = this.#handler
        if (value2 != null) // It might be possible to have the value being set on the lazy value evaluation
            return this.#handler = value2
        return this.#handler = valueFromLazy
    }

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Size methods --------------------

    public override get size(): number {
        const value = this.#size
        if (value != null)
            return value

        const valueFromLazy = this.#lazySize!.value
        const value2 = this.#size
        if (value2 != null) // It might be possible to have the value being set on the lazy value evaluation
            return this.#size = value2
        return this.#size = valueFromLazy
    }

    public override get isEmpty(): boolean {
        const value = this.#isEmpty
        if (value != null)
            return value

        const valueFromLazy = this.#lazyIsEmpty!.value
        const value2 = this.#isEmpty
        if (value2 != null) // It might be possible to have the value being set on the lazy value evaluation
            return this.#isEmpty = value2
        return this.#isEmpty = valueFromLazy
    }

    public override get isNotEmpty(): boolean { return !this.isEmpty }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    public override get(index: number,): T {
        const valueFound = this._handler.get(index,)
        if (valueFound.cause != null)
            throw valueFound.cause
        return valueFound.value as T
    }

    public override getOrElse<U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) {
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

    public override getOrNull(index: number,): NullOr<T> { return this._handler.get(index,).value }

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Validation methods --------------------

    public override get hasNull(): boolean {
        const value = this.#hasNull
        if (value != null)
            return value

        const valueFromLazy = this.#lazyHasNull!.value
        const value2 = this.#hasNull
        if (value2 != null) // It might be possible to have the value being set on the lazy value evaluation
            return this.#hasNull = value2
        return this.#hasNull = valueFromLazy
    }

    public override get hasNoNulls(): boolean {
        return !this.hasNull
    }


    public override get hasDuplicate(): boolean {
        const value = this.#hasDuplicate
        if (value != null)
            return value

        const valueFromLazy = this.#lazyHasDuplicate!.value
        const value2 = this.#hasDuplicate
        if (value2 != null) // It might be possible to have the value being set on the lazy value evaluation
            return this.#hasDuplicate = value2
        return this.#hasDuplicate = valueFromLazy
    }

    public override get hasNoDuplicates(): boolean {
        return !this.hasDuplicate
    }

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Conversion methods --------------------

    public override toArray(): readonly T[] { return this.#array ??= super.toArray() }
    public override toSet(): ReadonlySet<T> { return this.#set ??= super.toSet() }
    public override toMap(): ReadonlyMap<number, T> { return this.#map ??= super.toMap() }

    //#endregion -------------------- Conversion methods --------------------

    //#endregion -------------------- Methods --------------------

}

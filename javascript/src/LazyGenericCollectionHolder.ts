/******************************************************************************
 * Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi                             *
 *                                                                            *
 * This project is free to use.                                               *
 * All the right is reserved to the author of this project.                   *
 ******************************************************************************/

import type {Lazy}    from "@joookiwi/lazy"
import {lazy, lazyOf} from "@joookiwi/lazy"

import type {Nullable, NullOr, NumberOrNumberInString, UndefinedOr}                                                                                                                                                                                                                                            from "./general type"
import type {PossibleIterable}                                                                                                                                                                                                                                                                                 from "./iterable/types"
import type {CollectionHolder}                                                                                                                                                                                                                                                                                 from "./CollectionHolder"
import type {BooleanCallback, CollectionHolderName, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, ObjectOf, RestrainedBooleanCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, ValueIndexCallback, ValueIndexWithReturnCallback, ValueWithStringReturnCallback} from "./CollectionHolder.types"
import type {CollectionHandler}                                                                                                                                                                                                                                                                                from "./handler/Collection.handler"
import type {IterableWithCount}                                                                                                                                                                                                                                                                                from "./iterable/IterableWithCount"
import type {IterableWithLength}                                                                                                                                                                                                                                                                               from "./iterable/IterableWithLength"
import type {IterableWithPossibleSize}                                                                                                                                                                                                                                                                         from "./iterable/IterableWithPossibleSize"
import type {IterableWithSize}                                                                                                                                                                                                                                                                                 from "./iterable/IterableWithSize"
import type {CollectionIterator}                                                                                                                                                                                                                                                                               from "./iterator/CollectionIterator"

import {CollectionConstants}               from "./CollectionConstants"
import {EmptyCollectionHandler}            from "./handler/EmptyCollection.handler"
import {ArrayCollectionOf1Handler}         from "./handler/ArrayCollectionOf1.handler"
import {ArrayCollectionHandler}            from "./handler/ArrayCollection.handler"
import {CollectionCollectionHandler}       from "./handler/CollectionCollection.handler"
import {IterableCollectionHandler}         from "./handler/IterableCollection.handler"
import {IterableWithSizeCollectionHandler} from "./handler/IterableWithSizeCollection.handler"
import {SetCollectionHandler}              from "./handler/SetCollection.handler"
import {SetCollectionOf1Handler}           from "./handler/SetCollectionOf1.handler"
import {all}                               from "./method/all"
import {any}                               from "./method/any"
import {filter}                            from "./method/filter"
import {filterIndexed}                     from "./method/filterIndexed"
import {filterIndexedNot}                  from "./method/filterIndexedNot"
import {filterNot}                         from "./method/filterNot"
import {filterNotNull}                     from "./method/filterNotNull"
import {find}                              from "./method/find"
import {indexOfFirst}                      from "./method/indexOfFirst"
import {findIndexed}                       from "./method/findIndexed"
import {indexOfFirstIndexed}               from "./method/indexOfFirstIndexed"
import {findLast}                          from "./method/findLast"
import {indexOfLast}                       from "./method/indexOfLast"
import {findLastIndexed}                   from "./method/findLastIndexed"
import {indexOfLastIndexed}                from "./method/indexOfLastIndexed"
import {first}                             from "./method/first"
import {firstOrNull}                       from "./method/firstOrNull"
import {forEach}                           from "./method/forEach"
import {forEachIndexed}                    from "./method/forEachIndexed"
import {hasAll}                            from "./method/hasAll"
import {hasNull}                           from "./method/hasNull"
import {hasOne}                            from "./method/hasOne"
import {indexOf}                           from "./method/indexOf"
import {isCollectionHolder}                from "./method/isCollectionHolder"
import {isCollectionIterator}              from "./method/isCollectionIterator"
import {join}                              from "./method/join"
import {last}                              from "./method/last"
import {lastIndexOf}                       from "./method/lastIndexOf"
import {lastOrNull}                        from "./method/lastOrNull"
import {map}                               from "./method/map"
import {mapIndexed}                        from "./method/mapIndexed"
import {none}                              from "./method/none"
import {objectValuesMap}                   from "./method/objectValuesMap"
import {requireNoNulls}                    from "./method/requireNoNulls"
import {toArray}                           from "./method/toArray"
import {toIterator}                        from "./method/toIterator"
import {toMutableArray}                    from "./method/toMutableArray"
import {toMutableSet}                      from "./method/toMutableSet"
import {toMutableMap}                      from "./method/toMutableMap"
import {toMutableWeakSet}                  from "./method/toMutableWeakSet"
import {toSet}                             from "./method/toSet"
import {toMap}                             from "./method/toMap"
import {toReverse}                         from "./method/toReverse"
import {toWeakSet}                         from "./method/toWeakSet"

/**
 * A simple {@link CollectionHolder} having the values associated to it, but lazily retrieved.
 *
 * @see GenericCollectionHolder
 * @see EmptyCollectionHolder
 * @beta
 */
export class LazyGenericCollectionHolder<const out T = unknown, const REFERENCE extends PossibleIterable<T> = PossibleIterable<T>, >
    implements CollectionHolder<T> {

    //#region -------------------- Fields --------------------

    [index: NumberOrNumberInString]: UndefinedOr<T>

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
            if (size == 1) {
                this.#handler = lazyOf(new ArrayCollectionOf1Handler(this, reference as unknown as (& REFERENCE & readonly [T,]),),)
                return
            }
            if (Object.isFrozen(reference))
                this.#array = reference

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
            if (Object.isFrozen(reference,))
                this.#set = reference

            this.#isEmpty = lazyOf(false,)
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
                    if (Object.isFrozen(referenceFound,))
                        this.#array ??= referenceFound

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
                    if (size === 1)
                        return new ArrayCollectionOf1Handler(this, referenceFound as unknown as (& REFERENCE & readonly [T,]),)
                    return new ArrayCollectionHandler(this, referenceFound,)
                }
                if (referenceFound instanceof Set) {
                    if (Object.isFrozen(referenceFound,))
                        this.#set ??= referenceFound

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
                    if (size === 1)
                        return new SetCollectionOf1Handler(this, referenceFound,)
                    return new SetCollectionHandler(this, referenceFound,)
                }
                if (isCollectionHolder<T>(referenceFound))
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

    public get size(): number {
        return this.#size.value
    }

    public get length(): this["size"] {
        return this.size
    }

    public get count(): this["size"] {
        return this.size
    }


    public get isEmpty(): boolean {
        return this.#isEmpty.value
    }

    public get isNotEmpty(): boolean {
        return !this.isEmpty
    }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Has X methods --------------------

    public get hasNull(): boolean {
        return this.#hasNull ??= hasNull(this,)
    }

    public get includesNull(): this["hasNull"] {
        return this.hasNull
    }

    public get containsNull(): this["hasNull"] {
        return this.hasNull
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

    public get(index: number,): T {
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

    public at(index: number,): T {
        return this.get(index,)
    }


    public getOrElse<U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,) {
        if (this.isEmpty)
            return defaultValue(index < 0 ? this.size + index : index,)

        const indexToRetrieve = index < 0 ? this.size + index : index
        if (indexToRetrieve < 0)
            return defaultValue(indexToRetrieve,)

        return this._handler.get(indexToRetrieve,).value ?? defaultValue(indexToRetrieve,)
    }

    public atOrElse<U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public atOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public atOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,) {
        return this.getOrElse(index, defaultValue,)
    }


    public getOrNull(index: number,): NullOr<T> {
        if (this.isEmpty)
            return null
        const indexToRetrieve = index < 0 ? this.size + index : index
        if (indexToRetrieve < 0)
            return null

        return this._handler.get(indexToRetrieve,).value
    }

    public atOrNull(index: number,): NullOr<T> {
        return this.getOrNull(index,)
    }

    //#endregion -------------------- Get / at methods --------------------
    //#region -------------------- Index of methods --------------------

    public indexOf(element: T, fromIndex?: Nullable<number>, toIndex?: Nullable<number>,): NullOr<number>
    public indexOf(element: unknown, fromIndex?: Nullable<number>, toIndex?: Nullable<number>,): NullOr<number>
    public indexOf(element: unknown, fromIndex?: Nullable<number>, toIndex?: Nullable<number>,): NullOr<number> {
        return indexOf(this, element, fromIndex, toIndex,)
    }


    public lastIndexOf(element: T, fromIndex?: Nullable<number>, toIndex?: Nullable<number>,): NullOr<number>
    public lastIndexOf(element: unknown, fromIndex?: Nullable<number>, toIndex?: Nullable<number>,): NullOr<number>
    public lastIndexOf(element: unknown, fromIndex?: Nullable<number>, toIndex?: Nullable<number>,): NullOr<number> {
        return lastIndexOf(this, element, fromIndex, toIndex,)
    }


    public indexOfFirst(callback: BooleanCallback<T>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>,): NullOr<number> {
        return indexOfFirst(this, callback, fromIndex, toIndex,)
    }

    public indexOfFirstIndexed(callback: ReverseBooleanCallback<T>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>,): NullOr<number> {
        return indexOfFirstIndexed(this, callback, fromIndex, toIndex,)
    }


    public indexOfLast(callback: BooleanCallback<T>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>,): NullOr<number> {
        return indexOfLast(this, callback, fromIndex, toIndex,)
    }

    public indexOfLastIndexed(callback: ReverseBooleanCallback<T>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>,): NullOr<number> {
        return indexOfLastIndexed(this, callback, fromIndex, toIndex,)
    }

    //#endregion -------------------- Index of methods --------------------
    //#region -------------------- First methods --------------------

    public first(): NonNullable<T>
    public first<const S extends T, >(callback: Nullable<RestrainedBooleanCallback<T, S>>,): NonNullable<S>
    public first(callback: Nullable<BooleanCallback<T>>,): NonNullable<T>
    public first<const S extends T, >(callback?: Nullable<| BooleanCallback<T> | RestrainedBooleanCallback<T, S>>,) {
        return first(this, callback,)
    }

    public firstOrNull(): NullOr<T>
    public firstOrNull<const S extends T, >(callback: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public firstOrNull(callback: Nullable<BooleanCallback<T>>,): NullOr<T>
    public firstOrNull<const S extends T, >(callback?: Nullable<| BooleanCallback<T> | RestrainedBooleanCallback<T, S>>,) {
        return firstOrNull(this, callback,)
    }

    //#endregion -------------------- First methods --------------------
    //#region -------------------- Last methods --------------------

    public last(): NonNullable<T>
    public last<const S extends T, >(callback: Nullable<RestrainedBooleanCallback<T, S>>,): NonNullable<S>
    public last(callback: Nullable<BooleanCallback<T>>,): NonNullable<T>
    public last<const S extends T, >(callback?: Nullable<| BooleanCallback<T> | RestrainedBooleanCallback<T, S>>,) {
        return last(this, callback,)
    }

    public lastOrNull(): NullOr<T>
    public lastOrNull<const S extends T, >(callback: Nullable<RestrainedBooleanCallback<T, S>>,): NullOr<S>
    public lastOrNull(callback: Nullable<BooleanCallback<T>>,): NullOr<T>
    public lastOrNull<const S extends T, >(callback?: Nullable<| BooleanCallback<T> | RestrainedBooleanCallback<T, S>>,) {
        return lastOrNull(this, callback,)
    }

    //#endregion -------------------- Last methods --------------------

    //#endregion -------------------- Value methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- All / any / none methods --------------------

    public all(callback: BooleanCallback<T>,): boolean {
        return all(this, callback,)
    }

    public any(): this["isNotEmpty"]
    public any(callback: Nullable<BooleanCallback<T>>,): boolean
    public any(callback?: Nullable<BooleanCallback<T>>,): boolean {
        return any(this, callback,)
    }

    public none(): this["isEmpty"]
    public none(callback: Nullable<BooleanCallback<T>>,): boolean
    public none(callback?: Nullable<BooleanCallback<T>>,): boolean {
        return none(this, callback,)
    }

    //#endregion -------------------- All / any / none methods --------------------
    //#region -------------------- Has / includes / contains methods --------------------

    public hasOne(...values: readonly T[]): boolean
    public hasOne(...values: readonly unknown[]): boolean
    public hasOne(...values: readonly unknown[]): boolean {
        return hasOne(this, ...values,)
    }

    public includesOne(...values: readonly T[]): boolean
    public includesOne(...values: readonly unknown[]): boolean
    public includesOne(...values: readonly unknown[]): boolean {
        return this.hasOne(...values,)
    }

    public containsOne(...values: readonly T[]): boolean
    public containsOne(...values: readonly unknown[]): boolean
    public containsOne(...values: readonly unknown[]): boolean {
        return this.hasOne(...values,)
    }


    public hasAll(...values: readonly T[]): boolean
    public hasAll(...values: readonly unknown[]): boolean
    public hasAll(...values: readonly unknown[]): boolean {
        return hasAll(this, ...values,)
    }

    public includesAll(...values: readonly T[]): boolean
    public includesAll(...values: readonly unknown[]): boolean
    public includesAll(...values: readonly unknown[]): boolean {
        return this.hasAll(...values,)
    }

    public containsAll(...values: readonly T[]): boolean
    public containsAll(...values: readonly unknown[]): boolean
    public containsAll(...values: readonly unknown[]): boolean {
        return this.hasAll(...values,)
    }

    //#endregion -------------------- Has / includes / contains methods --------------------
    //#region -------------------- Join methods --------------------

    public join(separator?: Nullable<string>, prefix?: Nullable<string>, postfix?: Nullable<string>, limit?: Nullable<number>, truncated?: Nullable<string>, transform?: Nullable<ValueWithStringReturnCallback<T>>,): string {
        return join(this, separator, prefix, postfix, limit, truncated, transform,)
    }


    //#endregion -------------------- Join methods --------------------
    //#region -------------------- Filter methods --------------------

    public filter<const S extends T, >(callback: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public filter(callback: BooleanCallback<T>,): CollectionHolder<T>
    public filter<const S extends T, >(callback: | RestrainedBooleanCallback<T, S> | BooleanCallback<T>,) {
        return filter(this, callback,)
    }

    public filterIndexed<const S extends T, >(callback: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public filterIndexed(callback: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public filterIndexed<const S extends T, >(callback: | ReverseRestrainedBooleanCallback<T, S> | ReverseBooleanCallback<T>,) {
        return filterIndexed(this, callback,)
    }


    public filterNot<const S extends T, >(callback: RestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public filterNot(callback: BooleanCallback<T>,): CollectionHolder<T>
    public filterNot<const S extends T, >(callback: | RestrainedBooleanCallback<T, S> | BooleanCallback<T>,) {
        return filterNot(this, callback,)
    }

    public filterIndexedNot<const S extends T, >(callback: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public filterIndexedNot(callback: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public filterIndexedNot<const S extends T, >(callback: | ReverseRestrainedBooleanCallback<T, S> | ReverseBooleanCallback<T>,) {
        return filterIndexedNot(this, callback,)
    }


    public filterNotNull(): CollectionHolder<NonNullable<T>> {
        return filterNotNull(this,)
    }

    public requireNoNulls(): CollectionHolder<NonNullable<T>> {
        return requireNoNulls(this,)
    }

    //#endregion -------------------- Filter methods --------------------
    //#region -------------------- Find methods --------------------

    public find<const S extends T, >(callback: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public find(callback: BooleanCallback<T>,): NullOr<T>
    public find<const S extends T, >(callback: | RestrainedBooleanCallback<T, S> | BooleanCallback<T>,) {
        return find(this, callback,)
    }

    public findIndexed<const S extends T, >(callback: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public findIndexed(callback: ReverseBooleanCallback<T>,): NullOr<T>
    public findIndexed<const S extends T, >(callback: | ReverseRestrainedBooleanCallback<T, S> | ReverseBooleanCallback<T>,) {
        return findIndexed(this, callback,)
    }


    public findLast<const S extends T, >(callback: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public findLast(callback: BooleanCallback<T>,): NullOr<T>
    public findLast<const S extends T, >(callback: | RestrainedBooleanCallback<T, S> | BooleanCallback<T>,) {
        return findLast(this, callback,)
    }

    public findLastIndexed(callback: ReverseBooleanCallback<T>,): NullOr<T> {
        return findLastIndexed(this, callback,)
    }

    //#endregion -------------------- Find methods --------------------
    //#region -------------------- Map methods --------------------

    public map<const U, >(callback: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U> {
        return map(this, callback,)
    }

    public mapIndexed<const U, >(callback: IndexValueWithReturnCallback<T, U>,): CollectionHolder<U> {
        return mapIndexed(this, callback,)
    }

    //#endregion -------------------- Map methods --------------------
    //#region -------------------- ForEach methods --------------------

    public forEach(callback: ValueIndexCallback<T>,): this {
        return forEach(this, callback,)
    }

    public forEachIndexed(callback: IndexValueCallback<T>,): this {
        return forEachIndexed(this, callback,)
    }

    //#endregion -------------------- ForEach methods --------------------

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Javascript methods --------------------

    public [Symbol.iterator](): CollectionIterator<T> {
        return toIterator(this,)
    }

    public get [Symbol.toStringTag](): CollectionHolderName {
        return CollectionConstants.COLLECTION_HOLDER_TO_STRING_TAG
    }

    //#endregion -------------------- Javascript methods --------------------
    //#region -------------------- Conversion methods --------------------

    public get objectValuesMap(): ReadonlyMap<T, ObjectOf<T>> {
        return this.#objectValuesMap ??= objectValuesMap(this,)
    }


    public toIterator(): CollectionIterator<T> {
        return this[Symbol.iterator]()
    }


    public toArray(): readonly T[] {
        return this.#array ??= toArray(this,)
    }

    public toMutableArray(): T[] {
        return toMutableArray(this,)
    }


    public toSet(): ReadonlySet<T> {
        return this.#set ??= toSet(this,)
    }

    public toMutableSet(): Set<T> {
        return toMutableSet(this,)
    }


    public toWeakSet(): Readonly<WeakSet<ObjectOf<T>>> {
        return this.#weakSet ??= toWeakSet(this,)
    }

    public toMutableWeakSet(): WeakSet<ObjectOf<T>> {
        return toMutableWeakSet(this,)
    }


    public toMap(): ReadonlyMap<number, T> {
        return this.#map ??= toMap(this,)
    }

    public toMutableMap(): Map<number, T> {
        return toMutableMap(this,)
    }


    public toReversed(fromIndex?: Nullable<number>, toIndex?: Nullable<number>,): CollectionHolder<T> {
        return toReverse(this, fromIndex, toIndex,)
    }


    public toString(): string {
        return this.join()
    }

    public toLocaleString(): string {
        return this.join(null, null, null, null, null, it => it?.toLocaleString() ?? `${it}`,)
    }

    //#endregion -------------------- Conversion methods --------------------

    //#endregion -------------------- Methods --------------------

}

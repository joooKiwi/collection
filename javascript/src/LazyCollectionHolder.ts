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

import type {Lazy}                from "@joookiwi/lazy"
import {lazy, lazyOf}                                                                                                        from "@joookiwi/lazy"
import type {MutableNumberKeyMap, Nullable, NullableNumber, NullableString, NullOr, NullOrNumber, NumberKeyMap, UndefinedOr} from "@joookiwi/type"

import type {CollectionHolder}                                   from "./CollectionHolder"
import type {MinimalistCollectionHolder}                         from "./MinimalistCollectionHolder"
import type {IterableWithCount}                                  from "./iterable/IterableWithCount"
import type {IterableWithLength}                                 from "./iterable/IterableWithLength"
import type {IterableWithPossibleSize}                           from "./iterable/IterableWithPossibleSize"
import type {IterableWithSize}                                   from "./iterable/IterableWithSize"
import type {CollectionIterator}                                                                                                                                                                                                                                                from "./iterator/CollectionIterator"
import type {BooleanCallback, IndexValueCallback, IndexValueWithReturnCallback, IndexWithReturnCallback, RestrainedBooleanCallback, ReturnCallback, ReverseBooleanCallback, ReverseRestrainedBooleanCallback, StringCallback, ValueIndexCallback, ValueIndexWithReturnCallback} from "./type/callback"
import type {PossibleIterableIteratorArraySetOrCollectionHolder}                                                                                                                                                                                                                from "./type/possibleInstance"

import {AbstractCollectionHolder}                from "./AbstractCollectionHolder"
import {ArrayAsCollectionHolder}                 from "./ArrayAsCollectionHolder"
import {EmptyCollectionHolder}                   from "./EmptyCollectionHolder"
import {IteratorAsCollectionHolder}              from "./IteratorAsCollectionHolder"
import {JsIterableAsCollectionHolder}            from "./JsIterableAsCollectionHolder"
import {JsIteratorAsCollectionHolder}            from "./JsIteratorAsCollectionHolder"
import {LazyCollectionHolderOf1}                 from "./LazyCollectionHolderOf1"
import {LazyCollectionHolderOf2}                 from "./LazyCollectionHolderOf2"
import {MinimalistAsCollectionHolder}            from "./MinimalistAsCollectionHolder"
import {SetAsCollectionHolder}                   from "./SetAsCollectionHolder"
import {isArray}                                 from "./method/isArray"
import {isArrayByStructure}                      from "./method/isArrayByStructure"
import {isCollectionIterator}                    from "./method/isCollectionIterator"
import {isCollectionIteratorByStructure}         from "./method/isCollectionIteratorByStructure"
import {isCollectionHolder}                      from "./method/isCollectionHolder"
import {isCollectionHolderByStructure}           from "./method/isCollectionHolderByStructure"
import {isIterator}                              from "./method/isIterator"
import {isIteratorByStructure}                   from "./method/isIteratorByStructure"
import {isMinimalistCollectionHolder}            from "./method/isMinimalistCollectionHolder"
import {isMinimalistCollectionHolderByStructure} from "./method/isMinimalistCollectionHolderByStructure"
import {isSet}                                   from "./method/isSet"
import {isSetByStructure}                        from "./method/isSetByStructure"
import {Couple}                                  from "./tuple/Couple.next"

/**
 * A {@link CollectionHolder} having the values associated to it, but lazily retrieved.
 *
 * Meaning that the value in the instance are not retrieved until it is necessary.
 *
 * @typeParam T The element type
 * @note The index in the instance may not be initialized if retrieved directly
 * @see GenericMinimalistCollectionHolder
 * @see GenericCollectionHolder
 * @see EmptyCollectionHolder
 * @beta
 */
export class LazyCollectionHolder<const T = unknown, >
    extends AbstractCollectionHolder<T> {

    //#region -------------------- Fields --------------------

    readonly #reference: Lazy<WeakRef<PossibleIterableIteratorArraySetOrCollectionHolder<T>>>
    readonly #innerCollection: Lazy<CollectionHolder<T>>

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
    public constructor(iterable:                             Iterable<T, unknown, unknown>,)
    public constructor(lateIterable:                   () => Iterable<T, unknown, unknown>,)
    public constructor(iterableWithPossibleSize:             IterableWithPossibleSize<T>,)
    public constructor(lateIterableWithPossibleSize:   () => IterableWithPossibleSize<T>,)
    public constructor(reference:                            PossibleIterableIteratorArraySetOrCollectionHolder<T>,)
    public constructor(lateReference:                  () => PossibleIterableIteratorArraySetOrCollectionHolder<T>,)
    public constructor(reference: PossibleIterableIteratorArraySetOrCollectionHolder<T> | (() => PossibleIterableIteratorArraySetOrCollectionHolder<T>),)
    public constructor(reference: | PossibleIterableIteratorArraySetOrCollectionHolder<T> | (() => PossibleIterableIteratorArraySetOrCollectionHolder<T>),) {
        super()
        // README: The lazy instantiation has calls to private methods
        //         in order to keep the constructor shorter and more readable

        //#region -------------------- Initialization from Array --------------------

        if (isArray(reference,)) {
            this.#reference = lazyOf(new WeakRef(reference,),)
            this.#innerCollection = lazy(() => instanceByArray(reference,),)
            return
        }

        //#endregion -------------------- Initialization from Array --------------------
        //#region -------------------- Initialization from Set --------------------

        if (isSet(reference,)) {
            this.#reference = lazyOf(new WeakRef(reference,),)
            this.#innerCollection = lazy(() => instanceBySet(reference,),)
            return
        }

        //#endregion -------------------- Initialization from Set --------------------
        //#region -------------------- Initialization from CollectionHolder --------------------

        if (isCollectionHolder(reference,)) {
            this.#reference = lazyOf(new WeakRef(reference,),)
            this.#innerCollection = lazy(() => instanceByCollectionHolder(reference,),)
            return
        }

        //#endregion -------------------- Initialization from CollectionHolder --------------------
        //#region -------------------- Initialization from MinimalistCollectionHolder --------------------

        if (isMinimalistCollectionHolder(reference,)) {
            this.#reference = lazyOf(new WeakRef(reference,),)
            this.#innerCollection = lazy(() => instanceByMinimalistCollectionHolder(reference,),)
            return
        }

        //#endregion -------------------- Initialization from MinimalistCollectionHolder --------------------
        //#region -------------------- Initialization from CollectionIterator --------------------

        if (isCollectionIterator(reference,)) {
            this.#reference = lazyOf(new WeakRef(reference,),)
            this.#innerCollection = lazy(() => instanceByCollectionIterator(reference,),)
            return
        }

        //#endregion -------------------- Initialization from CollectionIterator --------------------
        //#region -------------------- Initialization from Iterator --------------------

        if (isIterator(reference,)) {
            this.#reference = lazyOf(new WeakRef(reference,),)
            this.#innerCollection = lazy(() => new JsIteratorAsCollectionHolder(reference,),)
            return
        }

        //#endregion -------------------- Initialization from Iterator --------------------

        //#region -------------------- Initialization from Array by structure --------------------

        if (isArrayByStructure<T>(reference,)) {
            this.#reference = lazyOf(new WeakRef(reference,),)
            this.#innerCollection = lazy(() => instanceByArray(reference,),)
            return
        }

        //#endregion -------------------- Initialization from Array by structure --------------------
        //#region -------------------- Initialization from Set by structure --------------------

        if (isSetByStructure<T>(reference,)) {
            this.#reference = lazyOf(new WeakRef(reference,),)
            this.#innerCollection = lazy(() => instanceBySet(reference,),)
            return
        }

        //#endregion -------------------- Initialization from Set by structure --------------------
        //#region -------------------- Initialization from CollectionHolder by structure --------------------

        if (isCollectionHolderByStructure<T>(reference,)) {
            this.#reference = lazyOf(new WeakRef(reference,),)
            this.#innerCollection = lazy(() => instanceByCollectionHolder(reference,),)
            return
        }

        //#endregion -------------------- Initialization from CollectionHolder by structure --------------------
        //#region -------------------- Initialization from MinimalistCollectionHolder by structure --------------------

        if (isMinimalistCollectionHolderByStructure<T>(reference,)) {
            this.#reference = lazyOf(new WeakRef(reference,),)
            this.#innerCollection = lazy(() => instanceByMinimalistCollectionHolder(reference,),)
            return
        }

        //#endregion -------------------- Initialization from MinimalistCollectionHolder by structure --------------------
        //#region -------------------- Initialization from CollectionIterator by structure --------------------

        if (isCollectionIteratorByStructure<T>(reference,)) {
            this.#reference = lazyOf(new WeakRef(reference,),)
            this.#innerCollection = lazy(() => instanceByCollectionIterator(reference,),)
            return
        }

        //#endregion -------------------- Initialization from CollectionIterator by structure --------------------
        //#region -------------------- Initialization from Iterator by structure --------------------

        if (isIteratorByStructure<T>(reference,)) {
            this.#reference = lazyOf(new WeakRef(reference,),)
            this.#innerCollection = lazy(() => new JsIteratorAsCollectionHolder(this, reference,),)
            return
        }

        //#endregion -------------------- Initialization from Iterator by structure --------------------

        if (reference instanceof Function) {
            const lazyReference = lazy(reference,)
            this.#reference = lazy(() => new WeakRef(lazyReference.value,),)
            this.#innerCollection = lazy(() => {
                const referenceFound = lazyReference.value

                if (isArray(referenceFound,))
                    return instanceByArray(referenceFound,)
                if (isSet(referenceFound,))
                    return instanceBySet(referenceFound,)
                if (isCollectionHolder(referenceFound,))
                    return instanceByCollectionHolder(referenceFound,)
                if (isMinimalistCollectionHolder(referenceFound,))
                    return instanceByMinimalistCollectionHolder(referenceFound,)
                if (isCollectionIterator(referenceFound,))
                    return instanceByCollectionIterator(referenceFound,)
                if (isIterator(referenceFound,))
                    return new JsIteratorAsCollectionHolder(this, referenceFound,)

                if (isArrayByStructure<T>(referenceFound,))
                    return instanceByArray(referenceFound,)
                if (isSetByStructure<T>(referenceFound,))
                    return instanceBySet(referenceFound,)
                if (isCollectionHolderByStructure<T>(referenceFound,))
                    return instanceByMinimalistCollectionHolder(referenceFound,)
                if (isMinimalistCollectionHolderByStructure<T>(referenceFound,))
                    return instanceByMinimalistCollectionHolder(referenceFound,)
                if (isCollectionIteratorByStructure<T>(referenceFound,))
                    return instanceByCollectionIterator(referenceFound,)
                if (isIteratorByStructure<T>(referenceFound,))
                    return new JsIteratorAsCollectionHolder(referenceFound,)
                if ("size" in referenceFound) {
                    const size = referenceFound.size
                    if (size != null) // No size is present even though there is a value in the reference
                        return instanceByIterableWithSize(referenceFound, size,)
                }
                if ("length" in referenceFound) {
                    const size = referenceFound.length
                    if (size != null) // No size is present even though there is a value in the reference
                        return instanceByIterableWithSize(referenceFound, size,)
                }
                if ("count" in referenceFound) {
                    const size = referenceFound.count
                    if (size != null) // No size is present even though there is a value in the reference
                        return instanceByIterableWithSize(referenceFound, size,)
                }
                return new JsIterableAsCollectionHolder(referenceFound,)
            },)
            return
        }

        this.#reference = lazyOf(new WeakRef(reference,),)

        //#region -------------------- Initialization from Iterable with size --------------------

        if ("size" in reference) {
            const size = reference.size
            if (size != null) { // No size is present even though there is a value in the reference
                this.#innerCollection = lazy(() => instanceByIterableWithSize(reference, size,),)
                return
            }
        }

        //#endregion -------------------- Initialization from Iterable with size --------------------
        //#region -------------------- Initialization from Iterable with length --------------------

        if ("length" in reference) {
            const size = reference.length
            if (size != null) { // No size is present even though there is a value in the reference
                this.#innerCollection = lazy(() => instanceByIterableWithSize(reference, size,),)
                return
            }
        }

        //#endregion -------------------- Initialization from Iterable with length --------------------
        //#region -------------------- Initialization from Iterable with count --------------------

        if ("count" in reference) {
            const size = reference.count
            if (size != null) { // No size is present even though there is a value in the reference
                this.#innerCollection = lazy(() => instanceByIterableWithSize(reference, size,),)
                return
            }
        }

        //#endregion -------------------- Initialization from Iterable with count --------------------
        //#region -------------------- Initialization from Iterable --------------------

        this.#innerCollection = lazyOf(new JsIterableAsCollectionHolder(reference,),)

        //#endregion -------------------- Initialization from Iterable --------------------
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Reference methods --------------------

    /**
     * The {@link PossibleIterableIteratorArraySetOrCollectionHolder collection, array, set, iterable or iterator} received in the {@link constructor}.
     *
     * It returns `undefined` if the reference has been garbed-collected.
     */
    protected get _reference(): UndefinedOr<PossibleIterableIteratorArraySetOrCollectionHolder<T>> { return this.#reference.value.deref() }

    /** The internal collection made to have the core concept of the {@link LazyCollectionHolder current instance} */
    protected get _innerCollection(): CollectionHolder<T> { return this.#innerCollection.value }

    //#endregion -------------------- Reference methods --------------------
    //#region -------------------- Size methods --------------------

    public override get size(): number { return this._innerCollection.size }

    public override get isEmpty(): boolean { return this._innerCollection.isEmpty }

    public override get isNotEmpty(): boolean { return this._innerCollection.isNotEmpty }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Research methods --------------------

    //#region -------------------- Get --------------------

    public override get(index: number,): T { return this._innerCollection.get(index,) }

    public override getFirst(): T { return this._innerCollection.getFirst() }

    public override getLast(): T { return this._innerCollection.getLast() }


    public override getOrElse<const U, >(index: number, defaultValue: IndexWithReturnCallback<U>,): | T | U
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<T>,): T
    public override getOrElse(index: number, defaultValue: IndexWithReturnCallback<unknown>,) { return this._innerCollection.getOrElse(index, defaultValue,) }


    public override getFirstOrElse<const U, >(defaultValue: ReturnCallback<U>,): | T | U
    public override getFirstOrElse(defaultValue: ReturnCallback<T>,): T
    public override getFirstOrElse(defaultValue: ReturnCallback<unknown>,) { return this._innerCollection.getFirstOrElse(defaultValue,) }


    public override getLastOrElse<const U, >(defaultValue: ReturnCallback<U>,): | T | U
    public override getLastOrElse(defaultValue: ReturnCallback<T>,): T
    public override getLastOrElse(defaultValue: ReturnCallback<unknown>,) { return this._innerCollection.getLastOrElse(defaultValue,) }


    public override getOrNull(index: number,): NullOr<T> { return this._innerCollection.getOrNull(index,) }

    public override getFirstOrNull(): NullOr<T> {return this._innerCollection.getFirstOrNull() }

    public override getLastOrNull(): NullOr<T> {return this._innerCollection.getLastOrNull() }

    //#endregion -------------------- Get --------------------
    //#region -------------------- Find first --------------------

    public override findFirst<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public override findFirst(predicate: BooleanCallback<T>,): T
    public override findFirst(predicate: BooleanCallback<T>,) { return this._innerCollection.findFirst(predicate,) }

    public override findFirstOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findFirstOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public override findFirstOrNull(predicate: BooleanCallback<T>,) { return this._innerCollection.findFirstOrNull(predicate,) }

    public override findFirstIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public override findFirstIndexed(predicate: ReverseBooleanCallback<T>,): T
    public override findFirstIndexed(predicate: ReverseBooleanCallback<T>,) { return this._innerCollection.findFirstIndexed(predicate,) }

    public override findFirstIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>,) { return this._innerCollection.findFirstIndexedOrNull(predicate,) }

    //#endregion -------------------- Find first --------------------
    //#region -------------------- Find last --------------------

    public override findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): S
    public override findLast(predicate: BooleanCallback<T>,): T
    public override findLast(predicate: BooleanCallback<T>,) { return this._innerCollection.findLast(predicate,) }

    public override findLastOrNull<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastOrNull(predicate: BooleanCallback<T>,): NullOr<T>
    public override findLastOrNull(predicate: BooleanCallback<T>,) { return this._innerCollection.findLastOrNull(predicate,) }

    public override findLastIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): S
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,): T
    public override findLastIndexed(predicate: ReverseBooleanCallback<T>,) { return this._innerCollection.findLastIndexed(predicate,) }

    public override findLastIndexedOrNull<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): NullOr<S>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,): NullOr<T>
    public override findLastIndexedOrNull(predicate: ReverseBooleanCallback<T>,) { return this._innerCollection.findLastIndexedOrNull(predicate,) }

    //#endregion -------------------- Find last --------------------

    //#endregion -------------------- Research methods --------------------
    //#region -------------------- Index methods --------------------

    public override firstIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,): number { return this._innerCollection.firstIndexOf(element, from, to,) }

    public override firstIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrNumber { return this._innerCollection.firstIndexOfOrNull(element, from, to,) }


    public override lastIndexOf(element: T, from?: NullableNumber, to?: NullableNumber,): number { return this._innerCollection.lastIndexOf(element, from, to,) }

    public override lastIndexOfOrNull(element: T, from?: NullableNumber, to?: NullableNumber,): NullOrNumber { return this._innerCollection.lastIndexOfOrNull(element, from, to,) }


    public override indexOfFirst(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number { return this._innerCollection.indexOfFirst(predicate, from, to,) }

    public override indexOfFirstOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber { return this._innerCollection.indexOfFirstOrNull(predicate, from, to,) }

    public override indexOfFirstIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number { return this._innerCollection.indexOfFirstIndexed(predicate, from, to,) }

    public override indexOfFirstIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber { return this._innerCollection.indexOfFirstIndexedOrNull(predicate, from, to,) }


    public override indexOfLast(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number { return this._innerCollection.indexOfLast(predicate, from, to,) }

    public override indexOfLastOrNull(predicate: BooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber { return this._innerCollection.indexOfLastOrNull(predicate, from, to,) }

    public override indexOfLastIndexed(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): number { return this._innerCollection.indexOfLastIndexed(predicate, from, to,) }

    public override indexOfLastIndexedOrNull(predicate: ReverseBooleanCallback<T>, from?: NullableNumber, to?: NullableNumber,): NullOrNumber { return this._innerCollection.indexOfLastIndexedOrNull(predicate, from, to,) }

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- Validation methods --------------------

    //#region -------------------- All --------------------

    public override all<S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is CollectionHolder<S>
    public override all(predicate: BooleanCallback<T>,): boolean
    public override all(predicate: BooleanCallback<T>,) { return this._innerCollection.all(predicate,) }

    //#endregion -------------------- All --------------------
    //#region -------------------- Any --------------------

    public override any(): this["isNotEmpty"]
    public override any(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override any(predicate?: Nullable<BooleanCallback<T>>,) { return this._innerCollection.any(predicate,) }

    protected override _any(..._: readonly unknown[]): never
    protected override _any() { throw new EvalError("The protected method “LazyCollectionHolder._any()” was not expected to be called.",) }

    //#endregion -------------------- Any --------------------
    //#region -------------------- None --------------------

    public override none(): this["isEmpty"]
    public override none(predicate: Nullable<BooleanCallback<T>>,): boolean
    public override none(predicate?: Nullable<BooleanCallback<T>>,) { return this._innerCollection.none(predicate,) }

    protected override _none(..._: readonly unknown[]): never
    protected override _none() { throw new EvalError("The protected method “LazyCollectionHolder._none()” was not expected to be called.",) }

    //#endregion -------------------- None --------------------

    //#region -------------------- Has null --------------------

    public override get hasNull(): boolean { return this._innerCollection.hasNull }

    public override get hasNoNulls(): boolean { return this._innerCollection.hasNoNulls }

    //#endregion -------------------- Has null --------------------
    //#region -------------------- Has duplicate --------------------

    public override get hasDuplicate(): boolean { return this._innerCollection.hasDuplicate }

    public override get hasNoDuplicates(): boolean { return this._innerCollection.hasNoDuplicates }

    //#endregion -------------------- Has duplicate --------------------

    //#region -------------------- Has --------------------

    public override has(value: T,): boolean { return this._innerCollection.has(value,) }

    public override hasNot(value: T,): boolean { return this._innerCollection.hasNot(value,) }

    //#endregion -------------------- Has --------------------
    //#region -------------------- Has one --------------------

    public override hasOne(values: Nullable<readonly T[]>,): boolean
    public override hasOne(values: Nullable<ReadonlySet<T>>,): boolean
    public override hasOne(values: Nullable<CollectionHolder<T>>,): boolean
    public override hasOne(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public override hasOne(values: Nullable<CollectionIterator<T>>,): boolean
    public override hasOne(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public override hasOne(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public override hasOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
    public override hasOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) { return this._innerCollection.hasOne(values,) }


    protected override _hasOneByNull(..._: readonly unknown[]): never
    protected override _hasOneByNull() { throw new EvalError("The protected method “LazyCollectionHolder._hasOneByNull()” was not expected to be called.",) }

    protected override _hasOneByArray(..._: readonly unknown[]): never
    protected override _hasOneByArray() { throw new EvalError("The protected method “LazyCollectionHolder._hasOneByArray()” was not expected to be called.",) }

    protected override _hasOneBySet(..._: readonly unknown[]): never
    protected override _hasOneBySet() { throw new EvalError("The protected method “LazyCollectionHolder._hasOneBySet()” was not expected to be called.",) }

    protected override _hasOneByMinimalistCollectionHolder(..._: readonly unknown[]): never
    protected override _hasOneByMinimalistCollectionHolder() { throw new EvalError("The protected method “LazyCollectionHolder._hasOneByMinimalistCollectionHolder()” was not expected to be called.",) }

    protected override _hasOneByCollectionHolder(..._: readonly unknown[]): never
    protected override _hasOneByCollectionHolder() { throw new EvalError("The protected method “LazyCollectionHolder._hasOneByCollectionHolder()” was not expected to be called.",) }

    protected override _hasOneByCollectionIterator(..._: readonly unknown[]): never
    protected override _hasOneByCollectionIterator() { throw new EvalError("The protected method “LazyCollectionHolder._hasOneByCollectionIterator()” was not expected to be called.",) }

    protected override _hasOneByIterator(..._: readonly unknown[]): never
    protected override _hasOneByIterator() { throw new EvalError("The protected method “LazyCollectionHolder._hasOneByIterator()” was not expected to be called.",) }

    protected override _hasOneByIterable(..._: readonly unknown[]): never
    protected override _hasOneByIterable() { throw new EvalError("The protected method “LazyCollectionHolder._hasOneByIterable()” was not expected to be called.",) }

    //#endregion -------------------- Has one --------------------
    //#region -------------------- Has not one --------------------

    public override hasNotOne(values: Nullable<readonly T[]>,): boolean
    public override hasNotOne(values: Nullable<ReadonlySet<T>>,): boolean
    public override hasNotOne(values: Nullable<CollectionHolder<T>>,): boolean
    public override hasNotOne(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public override hasNotOne(values: Nullable<CollectionIterator<T>>,): boolean
    public override hasNotOne(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public override hasNotOne(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public override hasNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
    public override hasNotOne(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) { return this._innerCollection.hasNotOne(values,) }


    protected override _hasNotOneByNull(..._: readonly unknown[]): never
    protected override _hasNotOneByNull() { throw new EvalError("The protected method “LazyCollectionHolder._hasNotOneByNull()” was not expected to be called.",) }

    protected override _hasNotOneByArray(..._: readonly unknown[]): never
    protected override _hasNotOneByArray() { throw new EvalError("The protected method “LazyCollectionHolder._hasNotOneByArray()” was not expected to be called.",) }

    protected override _hasNotOneBySet(..._: readonly unknown[]): never
    protected override _hasNotOneBySet() { throw new EvalError("The protected method “LazyCollectionHolder._hasNotOneBySet()” was not expected to be called.",) }

    protected override _hasNotOneByMinimalistCollectionHolder(..._: readonly unknown[]): never
    protected override _hasNotOneByMinimalistCollectionHolder() { throw new EvalError("The protected method “LazyCollectionHolder._hasNotOneByMinimalistCollectionHolder()” was not expected to be called.",) }

    protected override _hasNotOneByCollectionHolder(..._: readonly unknown[]): never
    protected override _hasNotOneByCollectionHolder() { throw new EvalError("The protected method “LazyCollectionHolder._hasNotOneByCollectionHolder()” was not expected to be called.",) }

    protected override _hasNotOneByCollectionIterator(..._: readonly unknown[]): never
    protected override _hasNotOneByCollectionIterator() { throw new EvalError("The protected method “LazyCollectionHolder._hasNotOneByCollectionIterator()” was not expected to be called.",) }

    protected override _hasNotOneByIterator(..._: readonly unknown[]): never
    protected override _hasNotOneByIterator() { throw new EvalError("The protected method “LazyCollectionHolder._hasNotOneByIterator()” was not expected to be called.",) }

    protected override _hasNotOneByIterable(..._: readonly unknown[]): never
    protected override _hasNotOneByIterable() { throw new EvalError("The protected method “LazyCollectionHolder._hasNotOneByIterable()” was not expected to be called.",) }

    //#endregion -------------------- Has not one --------------------
    //#region -------------------- Has all --------------------

    public override hasAll(values: Nullable<readonly T[]>,): boolean
    public override hasAll(values: Nullable<ReadonlySet<T>>,): boolean
    public override hasAll(values: Nullable<CollectionHolder<T>>,): boolean
    public override hasAll(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public override hasAll(values: Nullable<CollectionIterator<T>>,): boolean
    public override hasAll(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public override hasAll(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public override hasAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
    public override hasAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) { return this._innerCollection.hasAll(values,) }


    protected override _hasAllByNull(..._: readonly unknown[]): never
    protected override _hasAllByNull() { throw new EvalError("The protected method “LazyCollectionHolder._hasAllByNull()” was not expected to be called.",) }

    protected override _hasAllByArray(..._: readonly unknown[]): never
    protected override _hasAllByArray() { throw new EvalError("The protected method “LazyCollectionHolder._hasAllByArray()” was not expected to be called.",) }

    protected override _hasAllBySet(..._: readonly unknown[]): never
    protected override _hasAllBySet() { throw new EvalError("The protected method “LazyCollectionHolder._hasAllBySet()” was not expected to be called.",) }

    protected override _hasAllByMinimalistCollectionHolder(..._: readonly unknown[]): never
    protected override _hasAllByMinimalistCollectionHolder() { throw new EvalError("The protected method “LazyCollectionHolder._hasAllByMinimalistCollectionHolder()” was not expected to be called.",) }

    protected override _hasAllByCollectionHolder(..._: readonly unknown[]): never
    protected override _hasAllByCollectionHolder() { throw new EvalError("The protected method “LazyCollectionHolder._hasAllByCollectionHolder()” was not expected to be called.",) }

    protected override _hasAllByCollectionIterator(..._: readonly unknown[]): never
    protected override _hasAllByCollectionIterator() { throw new EvalError("The protected method “LazyCollectionHolder._hasAllByCollectionIterator()” was not expected to be called.",) }

    protected override _hasAllByIterator(..._: readonly unknown[]): never
    protected override _hasAllByIterator() { throw new EvalError("The protected method “LazyCollectionHolder._hasAllByIterator()” was not expected to be called.",) }

    protected override _hasAllByIterable(..._: readonly unknown[]): never
    protected override _hasAllByIterable() { throw new EvalError("The protected method “LazyCollectionHolder._hasAllByIterable()” was not expected to be called.",) }

    //#endregion -------------------- Has all --------------------
    //#region -------------------- Has not all --------------------

    public override hasNotAll(values: Nullable<readonly T[]>,): boolean
    public override hasNotAll(values: Nullable<ReadonlySet<T>>,): boolean
    public override hasNotAll(values: Nullable<CollectionHolder<T>>,): boolean
    public override hasNotAll(values: Nullable<MinimalistCollectionHolder<T>>,): boolean
    public override hasNotAll(values: Nullable<CollectionIterator<T>>,): boolean
    public override hasNotAll(values: Nullable<Iterator<T, unknown, unknown>>,): boolean
    public override hasNotAll(values: Nullable<Iterable<T, unknown, unknown>>,): boolean
    public override hasNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,): boolean
    public override hasNotAll(values: Nullable<PossibleIterableIteratorArraySetOrCollectionHolder<T>>,) { return this._innerCollection.hasNotAll(values,) }


    protected override _hasNotAllByNull(..._: readonly unknown[]): never
    protected override _hasNotAllByNull() { throw new EvalError("The protected method “LazyCollectionHolder._hasNotAllByNull()” was not expected to be called.",) }

    protected override _hasNotAllByArray(..._: readonly unknown[]): never
    protected override _hasNotAllByArray() { throw new EvalError("The protected method “LazyCollectionHolder._hasNotAllByArray()” was not expected to be called.",) }

    protected override _hasNotAllBySet(..._: readonly unknown[]): never
    protected override _hasNotAllBySet() { throw new EvalError("The protected method “LazyCollectionHolder._hasNotAllBySet()” was not expected to be called.",) }

    protected override _hasNotAllByMinimalistCollectionHolder(..._: readonly unknown[]): never
    protected override _hasNotAllByMinimalistCollectionHolder() { throw new EvalError("The protected method “LazyCollectionHolder._hasNotAllByMinimalistCollectionHolder()” was not expected to be called.",) }

    protected override _hasNotAllByCollectionHolder(..._: readonly unknown[]): never
    protected override _hasNotAllByCollectionHolder() { throw new EvalError("The protected method “LazyCollectionHolder._hasNotAllByCollectionHolder()” was not expected to be called.",) }

    protected override _hasNotAllByCollectionIterator(..._: readonly unknown[]): never
    protected override _hasNotAllByCollectionIterator() { throw new EvalError("The protected method “LazyCollectionHolder._hasNotAllByCollectionIterator()” was not expected to be called.",) }

    protected override _hasNotAllByIterator(..._: readonly unknown[]): never
    protected override _hasNotAllByIterator() { throw new EvalError("The protected method “LazyCollectionHolder._hasNotAllByIterator()” was not expected to be called.",) }

    protected override _hasNotAllByIterable(..._: readonly unknown[]): never
    protected override _hasNotAllByIterable() { throw new EvalError("The protected method “LazyCollectionHolder._hasNotAllByIterable()” was not expected to be called.",) }

    //#endregion -------------------- Has not all --------------------

    //#region -------------------- Require no nulls --------------------

    public override requireNoNulls(): CollectionHolder<NonNullable<T>> {
        if (this._innerCollection.hasNull)
            throw new TypeError("Forbidden null value. The current collection contains null values.",)
        return this as CollectionHolder<NonNullable<T>>
    }

    //#endregion -------------------- Require no nulls --------------------

    //#endregion -------------------- Validation methods --------------------
    //#region -------------------- Transformation methods --------------------

    //#region -------------------- Filter --------------------

    public override filter<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filter(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filter(predicate: BooleanCallback<T>,) { return this._innerCollection.filter(predicate,) }

    public override filterIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterIndexed(predicate: ReverseBooleanCallback<T>,) { return this._innerCollection.filterIndexed(predicate,) }


    public override filterNot<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override filterNot(predicate: BooleanCallback<T>,): CollectionHolder<T> { return this._innerCollection.filterNot(predicate,) }

    public override filterNotIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<Exclude<T, S>>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override filterNotIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T> { return this._innerCollection.filterNotIndexed(predicate,) }


    public override filterNotNull(): CollectionHolder<NonNullable<T>> { return this._innerCollection.filterNotNull() }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Slice --------------------

    public override slice(from?: NullableNumber, to?: NullableNumber,): CollectionHolder<T>
    public override slice(indices: readonly number[],): CollectionHolder<T>
    public override slice(indices: ReadonlySet<number>,): CollectionHolder<T>
    public override slice(indices: CollectionHolder<number>,): CollectionHolder<T>
    public override slice(indices: MinimalistCollectionHolder<number>,): CollectionHolder<T>
    public override slice(indices: CollectionIterator<number>,): CollectionHolder<T>
    public override slice(indices: Iterator<number, unknown, unknown>,): CollectionHolder<T>
    public override slice(indices: Iterable<number, unknown, unknown>,): CollectionHolder<T>
    public override slice(indices: PossibleIterableIteratorArraySetOrCollectionHolder<number>,): CollectionHolder<T>
    public override slice(indicesOrFrom?: Nullable<| PossibleIterableIteratorArraySetOrCollectionHolder<number> | number>, to?: NullableNumber,): CollectionHolder<T>
    public override slice(indicesOrFrom?: Nullable<| PossibleIterableIteratorArraySetOrCollectionHolder<number> | number>, to?: NullableNumber,) { return this._innerCollection.slice(indicesOrFrom, to,) }


    protected override _sliceWith0Argument(..._: readonly unknown[]): never
    protected override _sliceWith0Argument() { throw new EvalError("The protected method “LazyCollectionHolder._sliceWith0Argument()” was not expected to be called.",) }

    protected override _sliceWith1Argument(..._: readonly unknown[]): never
    protected override _sliceWith1Argument() { throw new EvalError("The protected method “LazyCollectionHolder._sliceWith1Argument()” was not expected to be called.",) }

    protected override _sliceWith2Argument(..._: readonly unknown[]): never
    protected override _sliceWith2Argument() { throw new EvalError("The protected method “LazyCollectionHolder._sliceWith2Argument()” was not expected to be called.",) }

    protected override _sliceWith2ArgumentWhere1stIsNull(..._: readonly unknown[]): never
    protected override _sliceWith2ArgumentWhere1stIsNull() { throw new EvalError("The protected method “LazyCollectionHolder._sliceWith2ArgumentWhere1stIsNull()” was not expected to be called.",) }

    protected override _sliceByArray(..._: readonly unknown[]): never
    protected override _sliceByArray() { throw new EvalError("The protected method “LazyCollectionHolder._sliceByArray()” was not expected to be called.",) }

    protected override _sliceBySet(..._: readonly unknown[]): never
    protected override _sliceBySet() { throw new EvalError("The protected method “LazyCollectionHolder._sliceBySet()” was not expected to be called.",) }

    protected override _sliceByMinimalistCollectionHolder(..._: readonly unknown[]): never
    protected override _sliceByMinimalistCollectionHolder() { throw new EvalError("The protected method “LazyCollectionHolder._sliceByMinimalistCollectionHolder()” was not expected to be called.",) }

    protected override _sliceByCollectionHolder(..._: readonly unknown[]): never
    protected override _sliceByCollectionHolder() { throw new EvalError("The protected method “LazyCollectionHolder._sliceByCollectionHolder()” was not expected to be called.",) }

    protected override _sliceByCollectionIterator(..._: readonly unknown[]): never
    protected override _sliceByCollectionIterator() { throw new EvalError("The protected method “LazyCollectionHolder._sliceByCollectionIterator()” was not expected to be called.",) }

    protected override _sliceByIterator(..._: readonly unknown[]): never
    protected override _sliceByIterator() { throw new EvalError("The protected method “LazyCollectionHolder._sliceByIterator()” was not expected to be called.",) }

    protected override _sliceByIterable(..._: readonly unknown[]): never
    protected override _sliceByIterable() { throw new EvalError("The protected method “LazyCollectionHolder._sliceByIterable()” was not expected to be called.",) }

    //#endregion -------------------- Slice --------------------
    //#region -------------------- Take --------------------

    public override take(n: number,): CollectionHolder<T> { return this._innerCollection.take(n,) }

    public override takeWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override takeWhile(predicate: BooleanCallback<T>,) { return this._innerCollection.takeWhile(predicate,) }

    public override takeWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override takeWhileIndexed(predicate: ReverseBooleanCallback<T>,) { return this._innerCollection.takeWhileIndexed(predicate,) }


    public override takeLast(n: number,): CollectionHolder<T> { return this._innerCollection.take(n,) }

    public override takeLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override takeLastWhile(predicate: BooleanCallback<T>,) { return this._innerCollection.takeLastWhile(predicate,) }

    public override takeLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override takeLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) { return this._innerCollection.takeLastWhileIndexed(predicate,) }

    //#endregion -------------------- Take --------------------
    //#region -------------------- Drop --------------------

    public override drop(n: number,): CollectionHolder<T> { return this._innerCollection.drop(n,) }

    public override dropWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override dropWhile(predicate: BooleanCallback<T>,) { return this._innerCollection.dropWhile(predicate,) }

    public override dropWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override dropWhileIndexed(predicate: ReverseBooleanCallback<T>,) { return this._innerCollection.dropWhileIndexed(predicate,) }


    public override dropLast(n: number,): CollectionHolder<T> { return this._innerCollection.drop(n,) }

    public override dropLastWhile<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropLastWhile(predicate: BooleanCallback<T>,): CollectionHolder<T>
    public override dropLastWhile(predicate: BooleanCallback<T>,) { return this._innerCollection.dropLastWhile(predicate,) }

    public override dropLastWhileIndexed<const S extends T, >(predicate: ReverseRestrainedBooleanCallback<T, S>,): CollectionHolder<S>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,): CollectionHolder<T>
    public override dropLastWhileIndexed(predicate: ReverseBooleanCallback<T>,) { return this._innerCollection.dropLastWhileIndexed(predicate,) }

    //#endregion -------------------- Drop --------------------
    //#region -------------------- Map --------------------

    public override map<const U, >(transform: ValueIndexWithReturnCallback<T, U>,): CollectionHolder<U> { return this._innerCollection.map(transform,) }

    public override mapIndexed<const U, >(transform: IndexValueWithReturnCallback<T, U>,): CollectionHolder<U> { return this._innerCollection.mapIndexed(transform,) }


    public override mapNotNull<const U extends NonNullable<unknown>, >(transform: ValueIndexWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> { return this._innerCollection.mapNotNull(transform,) }

    public override mapNotNullIndexed<const U extends NonNullable<unknown>, >(transform: IndexValueWithReturnCallback<T, Nullable<U>>,): CollectionHolder<U> { return this._innerCollection.mapNotNullIndexed(transform,) }

    //#endregion -------------------- Map --------------------

    //#endregion -------------------- Transformation methods --------------------
    //#region -------------------- Loop methods --------------------

    //#region -------------------- For each --------------------

    public override forEach(action: ValueIndexCallback<T>,): void { this._innerCollection.forEach(action,) }

    public override forEachIndexed(action: IndexValueCallback<T>,): void { this._innerCollection.forEachIndexed(action,) }

    //#endregion -------------------- For each --------------------
    //#region -------------------- On each --------------------

    public override onEach(action: ValueIndexCallback<T>,): this {
        this._innerCollection.forEach(action,)
        return this
    }

    public override onEachIndexed(action: IndexValueCallback<T>,): this {
        this._innerCollection.forEachIndexed(action,)
        return this
    }

    //#endregion -------------------- On each --------------------

    //#endregion -------------------- Loop methods --------------------
    //#region -------------------- Reordering methods --------------------

    //#region -------------------- To reverse --------------------

    public override toReverse(from?: NullableNumber, to?: NullableNumber,): | CollectionHolder<T> { return this._innerCollection.toReverse(from, to,) }

    //#endregion -------------------- To reverse --------------------

    //#endregion -------------------- Reordering methods --------------------
    //#region -------------------- Conversion methods --------------------

    //#region -------------------- To other structure --------------------

    public override toIterator(): CollectionIterator<T> { return this._innerCollection.toIterator() }

    public override toArray(): readonly T[] { return this._innerCollection.toArray() }

    public override toMutableArray(): T[] { return this._innerCollection.toMutableArray() }

    public override toSet(): ReadonlySet<T> { return this._innerCollection.toSet() }

    public override toMutableSet(): Set<T> { return this._innerCollection.toMutableSet() }

    public override toMap(): NumberKeyMap<T> { return this._innerCollection.toMap() }

    public override toMutableMap(): MutableNumberKeyMap<T> { return this._innerCollection.toMutableMap() }

    //#endregion -------------------- To other structure --------------------
    //#region -------------------- To string --------------------

    public override toString(): string { return this._innerCollection.toString() }

    public override toLocaleString(locale?: NullableString,): string { return this._innerCollection.toLocaleString(locale,) }


    public override toLowerCaseString(): string { return this._innerCollection.toLowerCaseString() }

    public override toLocaleLowerCaseString(locale?: NullableString,): string { return this._innerCollection.toLocaleLowerCaseString(locale,) }


    public override toUpperCaseString(): string { return this._innerCollection.toUpperCaseString() }

    public override toLocaleUpperCaseString(locale?: NullableString,): string { return this._innerCollection.toLocaleUpperCaseString(locale,) }

    //#endregion -------------------- To string --------------------
    //#region -------------------- Join to string --------------------

    public override joinToString(separator?: NullableString, prefix?: NullableString, postfix?: NullableString, limit?: NullableNumber, truncated?: NullableString, transform?: Nullable<StringCallback<T>>,): string { return this._innerCollection.joinToString(separator, prefix, postfix, limit, truncated, transform,) }

    //#endregion -------------------- Join to string --------------------

    //#endregion -------------------- Conversion methods --------------------

    //#endregion -------------------- Methods --------------------

}

function instanceByArray<const T, >(reference: ReadonlyArray<T>,): | EmptyCollectionHolder | LazyCollectionHolderOf1<T> | LazyCollectionHolderOf2<T> | ArrayAsCollectionHolder<T> {
    const size = reference.length
    if (size === 0)
        return EmptyCollectionHolder.get
    if (size === 1)
        return new LazyCollectionHolderOf1(() => reference[0] as T,)
    if (size === 2)
        return new LazyCollectionHolderOf2(() => new Couple(reference[0] as T, reference[1] as T,),)
    return new ArrayAsCollectionHolder(reference,)
}

function instanceBySet<const T, >(reference: ReadonlySet<T>,): | EmptyCollectionHolder | LazyCollectionHolderOf1<T> | LazyCollectionHolderOf2<T> | SetAsCollectionHolder<T> {
    const size = reference.size
    if (size === 0)
        return EmptyCollectionHolder.get
    if (size === 1)
        return new LazyCollectionHolderOf1(() => reference[Symbol.iterator]().next().value as T,)
    if (size === 2)
        return new LazyCollectionHolderOf2(() => {
            const iterator = reference[Symbol.iterator]()
            return new Couple(iterator.next().value as T, iterator.next().value as T,)
        },)
    return new SetAsCollectionHolder(reference,)

    //#endregion -------------------- Initialization (size = over 2) --------------------
}

function instanceByCollectionHolder<const T, >(reference: CollectionHolder<T>,): | EmptyCollectionHolder | LazyCollectionHolderOf1<T> | LazyCollectionHolderOf2<T> | CollectionHolder<T> {
    if (reference.isEmpty)
        return EmptyCollectionHolder.get

    const size = reference.size
    if (size === 1)
        return new LazyCollectionHolderOf1(() => reference.getFirst(),)
    if (size === 2)
        return new LazyCollectionHolderOf2<T>(() => new Couple(reference.getFirst(), reference.getLast(),),)
    return reference
}

function instanceByMinimalistCollectionHolder<const T, >(reference: MinimalistCollectionHolder<T>,): | EmptyCollectionHolder | LazyCollectionHolderOf1<T> | LazyCollectionHolderOf2<T> | MinimalistAsCollectionHolder<T> {
    const size = reference.size
    if (size === 0)
        return EmptyCollectionHolder.get
    if (size === 1)
        return new LazyCollectionHolderOf1(() => reference.get(0,),)
    if (size === 2)
        return new LazyCollectionHolderOf2(() => new Couple(reference.get(0), reference.get(1,),),)
    return new MinimalistAsCollectionHolder(reference,)
}

function instanceByCollectionIterator<const T, >(reference: CollectionIterator<T>,): | EmptyCollectionHolder | LazyCollectionHolderOf1<T> | LazyCollectionHolderOf2<T> | IteratorAsCollectionHolder<T> {
    const size = reference.size
    if (size === 0)
        return EmptyCollectionHolder.get
    if (size === 1)
        return new LazyCollectionHolderOf1(() => reference.nextValue,)
    if (size === 2)
        return new LazyCollectionHolderOf2(() => new Couple(reference.nextValue, reference.nextValue,),)
    return new IteratorAsCollectionHolder(reference,)
}

function instanceByIterableWithSize<const T, >(reference: Iterable<T, unknown, unknown>, size: number,): | EmptyCollectionHolder | LazyCollectionHolderOf1<T> | LazyCollectionHolderOf2<T> | JsIterableAsCollectionHolder<T> {
    if (size == 0)
        return EmptyCollectionHolder.get
    if (size === 1)
        return new LazyCollectionHolderOf1(() => reference[Symbol.iterator]().next().value as T,)
    if (size === 2)
        return new LazyCollectionHolderOf2(() => {
            const iterator = reference[Symbol.iterator]()
            return new Couple(iterator.next().value as T, iterator.next().value as T,)
        },)
    return new JsIterableAsCollectionHolder(reference, size,)
}

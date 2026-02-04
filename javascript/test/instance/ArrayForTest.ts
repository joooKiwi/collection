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

import type {Array, MutableArray, UndefinedOr} from "@joookiwi/type"

import type {BooleanCallback, RestrainedBooleanCallback}                                                                                                              from "../../src/type/callback"
import type {FlatMapCallback, MutableReduceCallback, MutableRestrainedReduceCallback, MutableValueIndexCallback, MutableValueIndexWithReturnCallback, SortedCallback} from "../array.types"

/**
 * A {@link globalThis.Array MutableArray} made for the tests
 * with only the immutable methods of an instance.
 *
 * @see ArrayByStructureForTest
 */
export class ArrayForTest<const T, >
    extends Array<T> {

    //#region -------------------- Fields --------------------

    [index: number]: T
    public readonly size: number
    public readonly array: MutableArray<T>

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor(array: Array<T>,)
    public constructor(array: MutableArray<T>,) {
        super()
        const size = this.size = (this.array = array).length
        let index = -1
        while (++index < size)
            this[index] = array[index] as T
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Unsupported methods --------------------

    public override push(..._: Array<unknown>): never { throw new Error("The method “push” was not expected to be called in a test.") }
    public override pop(..._: Array<unknown>): never { throw new Error("The method “pop” was not expected to be called in a test.") }

    public override shift(..._: Array<unknown>): never { throw new Error("The method “shift” was not expected to be called in a test.") }
    public override unshift(..._: Array<unknown>): never { throw new Error("The method “unshift” was not expected to be called in a test.") }

    public override fill(..._: Array<unknown>): never { throw new Error("The method “fill” was not expected to be called in a test.") }

    public override copyWithin(..._: Array<unknown>): never { throw new Error("The method “copyWithin” was not expected to be called in a test.") }

    public override reverse(..._: Array<unknown>): never { throw new Error("The method “reverse” was not expected to be called in a test.") }

    public override sort(..._: Array<unknown>): never { throw new Error("The method “sort” was not expected to be called in a test.") }

    public override splice(..._: Array<unknown>): never { throw new Error("The method “splice” was not expected to be called in a test.") }

    //#endregion -------------------- Unsupported methods --------------------
    //#region -------------------- Supported methods --------------------

    public override get length() { return this.size }

    public override at(index: number,): UndefinedOr<T> { return this.array.at(index,) }

    public override indexOf(value: T, from?: number,): number { return this.array.indexOf(value, from,) }

    public override lastIndexOf(value: T, from?: number,): number { return this.array.lastIndexOf(value, from,) }

    public override includes(value: T, from?: number,): boolean { return this.array.includes(value, from,) }

    public override every<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is MutableArray<S>
    public override every(predicate: BooleanCallback<T>,): boolean
    public override every(predicate: BooleanCallback<T>,) { return this.array.every(predicate,) }

    public override some(predicate: BooleanCallback<T>,): boolean
    public override some(predicate: (value: T, index: number, array: MutableArray<T>,) => unknown,): boolean
    public override some(predicate: (value: T, index: number, array: MutableArray<T>,) => unknown,) { return this.array.some(predicate,) }

    public override with(index: number, value: T,): MutableArray<T> { return this.array.with(index, value,) }

    public override join(separator?: string,): string { return this.array.join(separator,) }

    public override filter<S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): MutableArray<S>
    public override filter(predicate: BooleanCallback<T>,): MutableArray<T>
    public override filter(predicate: BooleanCallback<T>,) { return this.array.filter(predicate,) }

    public override find<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): UndefinedOr<S>
    public override find(predicate: BooleanCallback<T>,): UndefinedOr<T>
    public override find(predicate: BooleanCallback<T>,) { return this.array.find(predicate,) }

    public override findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): UndefinedOr<S>
    public override findLast(predicate: BooleanCallback<T>,): UndefinedOr<T>
    public override findLast(predicate: BooleanCallback<T>,) { return this.array.findLast(predicate,) }

    public override findIndex<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): number
    public override findIndex(predicate: BooleanCallback<T>,): number
    public override findIndex(predicate: BooleanCallback<T>,) { return this.array.findIndex(predicate,) }

    public override findLastIndex<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): number
    public override findLastIndex(predicate: BooleanCallback<T>,): number
    public override findLastIndex(predicate: BooleanCallback<T>,) { return this.array.findLastIndex(predicate,) }

    public override concat(...items: Array<| T | ConcatArray<T>>): MutableArray<T> { return this.array.concat(...items,) }

    public override reduce(callback: MutableReduceCallback<T>,): T
    public override reduce(callback: MutableReduceCallback<T>, initialValue: T,): T
    public override reduce<const U, >(callback: MutableRestrainedReduceCallback<T, U>, initialValue: U,): U
    public override reduce(callback: MutableReduceCallback<T>, initialValue?: unknown,) {
        if (initialValue == null)
            return this.array.reduce(callback,)
        //@ts-ignore: We know it is valid from the signature of a ReadonlyArray
        return this.array.reduce(callback, initialValue,)
    }

    public override reduceRight(callback: MutableReduceCallback<T>,): T
    public override reduceRight(callback: MutableReduceCallback<T>, initialValue: T,): T
    public override reduceRight<const U, >(callback: MutableRestrainedReduceCallback<T, U>, initialValue: U,): U
    public override reduceRight(callback: MutableReduceCallback<T>, initialValue?: unknown,) {
        if (initialValue == null)
            return this.array.reduceRight(callback,)
        //@ts-ignore: We know it is valid from the signature of a ReadonlyArray
        return this.array.reduceRight(callback, initialValue,)
    }

    public override flat<const A, const D extends number = 1, >(depth?: D,): MutableArray<FlatArray<A, D>>
    public override flat<const D extends number, >(depth?: D,) { return this.array.flat(depth,) }

    public override flatMap<const U, >(callback: FlatMapCallback<T, U>,): MutableArray<U> { return this.array.flatMap(callback,) }

    public override map<const U, >(callback: MutableValueIndexWithReturnCallback<T, U>,): MutableArray<U> { return this.array.map(callback,) }

    public override forEach(callback: MutableValueIndexCallback<T>,) { return this.array.forEach(callback,) }

    public override keys(): ArrayIterator<number> { return this.array.keys() }

    public override values(): ArrayIterator<T> { return this.array.values() }

    public override entries(): ArrayIterator<[number, T]> { return this.array.entries() }

    public override [Symbol.iterator](): ArrayIterator<T> { return this.array[Symbol.iterator]() }

    public override get [Symbol.unscopables](): { [K in keyof Array<T>]?: boolean } { return this.array[Symbol.unscopables] }

    public override toReversed(): MutableArray<T> { return this.array.toReversed() }

    public override toSorted(comparable?: SortedCallback<T>,): MutableArray<T> { return this.array.toSorted(comparable,) }

    public override toSpliced(start: number, deleteCount?: number): MutableArray<T>
    public override toSpliced(start: number, deleteCount: number, ...items: Array<T>): MutableArray<T>
    public override toSpliced(start: number, deleteCount?: number, ...items: Array<T>) {
        if (deleteCount == null)
            return this.array.toSpliced(start,)
        return this.array.toSpliced(start, deleteCount, ...items,)
    }

    public override slice(start?: number, end?: number,): MutableArray<T> { return this.array.slice(start, end,) }

    public override toString(): string { return this.array.toString() }

    public override toLocaleString(): string { return this.array.toLocaleString() }

    //#endregion -------------------- Supported methods --------------------

    //#endregion -------------------- Methods --------------------

}

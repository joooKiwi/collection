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

import type {BooleanCallback, RestrainedBooleanCallback}                                                                                  from "../../src/type/callback"
import type {FlatMapCallback, ReduceCallback, RestrainedReduceCallback, SortedCallback, ValueIndexCallback, ValueIndexWithReturnCallback} from "../array.types"

/**
 * An {@link globalThis.ReadonlyArray Array} made for the tests
 * with all the methods that makes it not modifiable.
 *
 * @see ArrayForTest
 */
export class ArrayByStructureForTest<const T, >
    implements ReadonlyArray<T> {

    //#region -------------------- Fields --------------------

    [index: number]: T
    public readonly length: number
    public readonly array: Array<T>

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public constructor(array: Array<T>,) {
        const size = this.length = (this.array = array).length
        let index = -1
        while (++index < size)
            this[index] = array[index] as T
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    public at(index: number,): UndefinedOr<T> { return this.array.at(index,) }

    public indexOf(value: T, from?: number,): number { return this.array.indexOf(value, from,) }

    public lastIndexOf(value: T, from?: number,): number { return this.array.lastIndexOf(value, from,) }

    public includes(value: T, from?: number,): boolean { return this.array.includes(value, from,) }

    public every<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): this is MutableArray<S>
    public every(predicate: BooleanCallback<T>,): boolean
    public every(predicate: BooleanCallback<T>,) { return this.array.every(predicate,) }

    public some(predicate: BooleanCallback<T>,): boolean
    public some(predicate: (value: T, index: number, array: Array<T>,) => unknown,): boolean
    public some(predicate: (value: T, index: number, array: Array<T>,) => unknown,) { return this.array.some(predicate,) }

    public with(index: number, value: T,): MutableArray<T> { return this.array.with(index, value,) }

    public join(separator?: string,): string { return this.array.join(separator,) }

    public filter<S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): MutableArray<S>
    public filter(predicate: BooleanCallback<T>,): MutableArray<T>
    public filter(predicate: BooleanCallback<T>,) { return this.array.filter(predicate,) }

    public find<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): UndefinedOr<S>
    public find(predicate: BooleanCallback<T>,): UndefinedOr<T>
    public find(predicate: BooleanCallback<T>,) { return this.array.find(predicate,) }

    public findLast<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): UndefinedOr<S>
    public findLast(predicate: BooleanCallback<T>,): UndefinedOr<T>
    public findLast(predicate: BooleanCallback<T>,) { return this.array.findLast(predicate,) }

    public findIndex<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): number
    public findIndex(predicate: BooleanCallback<T>,): number
    public findIndex(predicate: BooleanCallback<T>,) { return this.array.findIndex(predicate,) }

    public findLastIndex<const S extends T, >(predicate: RestrainedBooleanCallback<T, S>,): number
    public findLastIndex(predicate: BooleanCallback<T>,): number
    public findLastIndex(predicate: BooleanCallback<T>,) { return this.array.findLastIndex(predicate,) }

    public concat(...items: Array<| T | ConcatArray<T>>): MutableArray<T> { return this.array.concat(...items,) }

    public reduce(callback: ReduceCallback<T>,): T
    public reduce(callback: ReduceCallback<T>, initialValue: T,): T
    public reduce<const U, >(callback: RestrainedReduceCallback<T, U>, initialValue: U,): U
    public reduce(callback: ReduceCallback<T>, initialValue?: unknown,) {
        if (initialValue == null)
            return this.array.reduce(callback,)
        //@ts-ignore: We know it is valid from the signature of a ReadonlyArray
        return this.array.reduce(callback, initialValue,)
    }

    public reduceRight(callback: ReduceCallback<T>,): T
    public reduceRight(callback: ReduceCallback<T>, initialValue: T,): T
    public reduceRight<const U, >(callback: RestrainedReduceCallback<T, U>, initialValue: U,): U
    public reduceRight(callback: ReduceCallback<T>, initialValue?: unknown,) {
        if (initialValue == null)
            return this.array.reduceRight(callback,)
        //@ts-ignore: We know it is valid from the signature of a ReadonlyArray
        return this.array.reduceRight(callback, initialValue,)
    }

    public flat<const A, const D extends number = 1, >(depth?: D,): MutableArray<FlatArray<A, D>>
    public flat<const D extends number, >(depth?: D,) { return this.array.flat(depth,) }

    public flatMap<const U, >(callback: FlatMapCallback<T, U>,): MutableArray<U> { return this.array.flatMap(callback,) }

    public map<const U, >(callback: ValueIndexWithReturnCallback<T, U>,): MutableArray<U> { return this.array.map(callback,) }

    public forEach(callback: ValueIndexCallback<T>,) { return this.array.forEach(callback,) }

    public keys(): ArrayIterator<number> { return this.array.keys() }

    public values(): ArrayIterator<T> { return this.array.values() }

    public entries(): ArrayIterator<[number, T]> { return this.array.entries() }

    public [Symbol.iterator](): ArrayIterator<T> { return this.array[Symbol.iterator]() }

    public get [Symbol.unscopables](): { [K in keyof Array<T>]?: boolean } { return this.array[Symbol.unscopables] }

    public toReversed(): MutableArray<T> { return this.array.toReversed() }

    public toSorted(comparable?: SortedCallback<T>,): MutableArray<T> { return this.array.toSorted(comparable,) }

    public toSpliced(start: number, deleteCount?: number): MutableArray<T>
    public toSpliced(start: number, deleteCount: number, ...items: Array<T>): MutableArray<T>
    public toSpliced(start: number, deleteCount?: number, ...items: Array<T>) {
        if (deleteCount == null)
            return this.array.toSpliced(start,)
        return this.array.toSpliced(start, deleteCount, ...items,)
    }

    public slice(start?: number, end?: number,): MutableArray<T> { return this.array.slice(start, end,) }

    public toString(): string { return this.array.toString() }

    public toLocaleString(): string { return this.array.toLocaleString() }

    //#endregion -------------------- Methods --------------------

}

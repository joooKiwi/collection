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

import type {BooleanCallback, RestrainedBooleanCallback, ValueIndexCallback, ValueIndexWithReturnCallback} from "../../src/type/callback"

/**
 * An {@link Iterator} that is made for the tests with an {@link ReadonlyArray Array} under the hood
 *
 * @see IteratorByStructureForTest
 */
export class IteratorForTest<const T, >
    extends Iterator<T, void, unknown> {

    public readonly array
    public iterator?: ArrayIterator<T>

    public constructor(array: Array<T>,) {
        super()
        this.array = array
    }

    public get initializedIterator(): ArrayIterator<T> {
        return this.iterator ??= this.array[Symbol.iterator]()
    }

    public override next(): IteratorResult<T, undefined> {
        return this.initializedIterator.next()
    }

    public override every(predicate: BooleanCallback<T>,): boolean {
        return this.initializedIterator.every(predicate,)
    }

    public override some(predicate: BooleanCallback<T>,): boolean {
        return this.initializedIterator.some(predicate,)
    }

    public override find<const U extends T, >(predicate: RestrainedBooleanCallback<T, U>,): UndefinedOr<U>
    public override find(predicate: BooleanCallback<T>,): UndefinedOr<T>
    public override find(predicate: BooleanCallback<T>,) {
        return this.initializedIterator.find(predicate,)
    }

    public override filter<const U extends T, >(predicate: RestrainedBooleanCallback<T, U>,): IteratorObject<U, undefined, unknown>
    public override filter(predicate: BooleanCallback<T>,): IteratorObject<T, undefined, unknown>
    public override filter(predicate: BooleanCallback<T>,) {
        return this.initializedIterator.filter(predicate,)
    }

    public override reduce<const U, >(comparator: (previousValue: U, currentValue: T, currentIndex: number,) => U, initialValue: U,): U
    public override reduce(comparator: (previousValue: T, currentValue: T, currentIndex: number,) => T, initialValue: T,): T
    public override reduce(comparator: (previousValue: T, currentValue: T, currentIndex: number,) => T,): T
    public override reduce(comparator: (previousValue: T, currentValue: T, currentIndex: number,) => T, initialValue?: T,) {
        if (arguments.length === 1)
            return this.initializedIterator.reduce(comparator,)
        return this.initializedIterator.reduce(comparator, initialValue as T,)
    }

    public override take(n: number,): IteratorObject<T, undefined, unknown> {
        return this.initializedIterator.take(n,)
    }

    public override drop(n: number,): IteratorObject<T, undefined, unknown> {
        return this.initializedIterator.drop(n,)
    }

    public override map<const U, >(transform: ValueIndexWithReturnCallback<T, U>,): IteratorObject<U, undefined, unknown> {
        return this.initializedIterator.map(transform,)
    }

    public override flatMap<const U, >(transform: ValueIndexWithReturnCallback<T, Iterator<U, unknown, undefined>>): IteratorObject<U, undefined, unknown>
    public override flatMap<const U, >(transform: ValueIndexWithReturnCallback<T, Iterable<U, unknown, undefined>>,): IteratorObject<U, undefined, unknown>
    public override flatMap<const U, >(transform: ValueIndexWithReturnCallback<T, | Iterator<U, unknown, undefined> | Iterable<U, unknown, undefined>>,): IteratorObject<U, undefined, unknown>
    public override flatMap<const U, >(transform: ValueIndexWithReturnCallback<T, | Iterator<U, unknown, undefined> | Iterable<U, unknown, undefined>>,) {
        return this.initializedIterator.flatMap(transform,)
    }

    public override forEach(action: ValueIndexCallback<T>,): void {
        this.initializedIterator.forEach(action,)
    }

    public override toArray(): MutableArray<T> {
        return this.initializedIterator.toArray()
    }

    public override [Symbol.iterator](): IteratorObject<T, void, unknown> {
        return this.initializedIterator[Symbol.iterator]()
    }

    public override get [Symbol.toStringTag](): string {
        return this.initializedIterator[Symbol.toStringTag]
    }

    public override [Symbol.dispose](): void {
        this.initializedIterator[Symbol.dispose]()
    }

}

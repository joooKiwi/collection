/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

import type {CollectionHolder}            from "../CollectionHolder"
import type {CollectionHolderConstructor} from "../CollectionHolderConstructor"
import type {NonEmptyCollectionHolder}    from "../NonEmptyCollectionHolder"
import type {Nullable}                    from "../general type"
import type {CollectionIterator}          from "../iterator/CollectionIterator"

import {CollectionConstants}                    from "../CollectionConstants"
import {endingIndex as endingIndexFunction}     from "./endingIndex"
import {isCollectionHolder}                     from "./isCollectionHolder"
import {isCollectionIterator}                   from "./isCollectionIterator"
import {newInstance}                            from "./newInstance"
import {startingIndex as startingIndexFunction} from "./startingIndex"

/**
 * Create a new {@link CollectionHolder} from the {@link indices}
 * in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param indices The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws ReferenceError An index is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function slice<const T, >(collection: Nullable<CollectionHolder<T>>, indices: readonly number[],): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices}
 * in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param indices The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws ReferenceError An index is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function slice<const T, >(collection: Nullable<CollectionHolder<T>>, indices: ReadonlySet<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices}
 * in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param indices The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws ReferenceError An index is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function slice<const T, >(collection: Nullable<CollectionHolder<T>>, indices: CollectionHolder<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices}
 * in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param indices The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws ReferenceError An index is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function slice<const T, >(collection: Nullable<CollectionHolder<T>>, indices: CollectionIterator<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indices}
 * in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param indices The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws ReferenceError An index is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function slice<const T, >(collection: Nullable<CollectionHolder<T>>, indices: Iterable<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link fromIndex starting}
 * to the {@link toIndex ending} index with a {@link limit} applied
 * in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param fromIndex The starting index
 * @param toIndex The ending index
 * @param limit The maximum amount of elements
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws {RangeError} The {@link fromIndex}, {@link toIndex} and {@link limit} are not within a valid range
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function slice<const T, >(collection: Nullable<CollectionHolder<T>>, fromIndex?: Nullable<number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): CollectionHolder<T>
/**
 * Create a new {@link CollectionHolder} from the {@link indicesOrFromIndex}
 * in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param indicesOrFromIndex The given indices (or starting index)
 * @param toIndex The ending index
 * @param limit The maximum amount of elements
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws {RangeError} The {@link indicesOrFromIndex}, {@link toIndex} and {@link limit} are not within a valid range
 * @throws ReferenceError An index is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 * @typescriptDefinition
 */
export function slice<const T, >(collection: Nullable<CollectionHolder<T>>, indicesOrFromIndex?: Nullable<| Iterable<number> | number>, toIndex?: Nullable<number>, limit?: Nullable<number>,): CollectionHolder<T>
export function slice<const T, >(collection: Nullable<CollectionHolder<T>>, indicesOrFromIndex: Nullable<| Iterable<number> | number> = null, toIndex: Nullable<number> = null, limit: Nullable<number> = null,): CollectionHolder<T> {
    if (indicesOrFromIndex instanceof Array)
        return sliceByArray(collection, indicesOrFromIndex,)
    if (indicesOrFromIndex instanceof Set)
        return sliceBySet(collection, indicesOrFromIndex,)
    if (isCollectionHolder<number>(indicesOrFromIndex,))
        return sliceByCollectionHolder(collection, indicesOrFromIndex,)
    if (isCollectionIterator<number>(indicesOrFromIndex,))
        return sliceByCollectionIterator(collection, indicesOrFromIndex,)
    if (indicesOrFromIndex == null)
        return sliceByRange(collection, indicesOrFromIndex, toIndex, limit,)
    if (typeof indicesOrFromIndex == "number")
        return sliceByRange(collection, indicesOrFromIndex, toIndex, limit,)
    return sliceByIterable(collection, indicesOrFromIndex,)
}


/**
 * Create a new {@link CollectionHolder} from the {@link indices} (as an {@link ReadonlyArray array})
 * in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param indices The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws ReferenceError An index is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceByArray<const T, >(collection: Nullable<CollectionHolder<T>>, indices: readonly number[],): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const size = indices.length
    if (size === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    return newInstance(collection.constructor as CollectionHolderConstructor<T>, () => {
        const newArray = new Array<T>(size,)
        let index = size
        while (index-- > 0)
            newArray[index] = collection.get(indices[index]!,)
        return newArray
    },)
}

/**
 * Create a new {@link CollectionHolder} from the {@link indices} (as a {@link ReadonlySet set})
 * in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param indices The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws ReferenceError An index is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceBySet<const T, >(collection: Nullable<CollectionHolder<T>>, indices: ReadonlySet<number>,): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const size = indices.size
    if (size === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    return newInstance(collection.constructor as CollectionHolderConstructor<T>, () => {
        const newArray = new Array<T>(size,),
            iterator = indices[Symbol.iterator]() as IterableIterator<number>
        let index = 0,
            iteratorResult: IteratorResult<number, number>
        while (!(iteratorResult = iterator.next()).done)
            newArray[index++] = collection.get(iteratorResult.value,)
        return newArray
    },)
}

/**
 * Create a new {@link CollectionHolder} from the {@link indices} (as a {@link CollectionHolder})
 * in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param indices The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws ReferenceError An index is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceByCollectionHolder<const T, >(collection: Nullable<CollectionHolder<T>>, indices: CollectionHolder<number>,): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    if (indices.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    return newInstance(collection.constructor as CollectionHolderConstructor<T>, () => {
        const size = indices.size,
            newArray = new Array<T>(size,)
        let index = size
        while (index-- > 0)
            newArray[index] = collection.get(indices.get(index,),)
        return newArray
    },)
}

/**
 * Create a new {@link CollectionHolder} from the {@link indices} (as a {@link CollectionIterator})
 * in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param indices The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws ReferenceError An index is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceByCollectionIterator<const T, >(collection: Nullable<CollectionHolder<T>>, indices: CollectionIterator<number>,): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const size = indices.size
    if (size === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    return newInstance(collection.constructor as CollectionHolderConstructor<T>, () => {
        const newArray = new Array<T>(size,)
        let index = size
        while (index-- > 0)
            newArray[index] = collection.get(indices.nextValue,)
        return newArray
    },)
}

/**
 * Create a new {@link CollectionHolder} from the {@link indices} (as an {@link Iterable})
 * in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param indices The given indices
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws ReferenceError An index is not in the {@link collection}
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceByIterable<const T, >(collection: Nullable<CollectionHolder<T>>, indices: Iterable<number>,): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    const iterator = indices[Symbol.iterator]() as Iterator<number, number>
    let iteratorResult: IteratorResult<number, number> = iterator.next()
    if (iteratorResult.done)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    return newInstance(collection.constructor as CollectionHolderConstructor<T>, () => {
        const newArray = [collection.get(iteratorResult.value,),]
        while (!(iteratorResult = iterator.next()).done)
            newArray.push(collection.get(iteratorResult.value,),)
        return newArray
    },)
}


/**
 * Create a new {@link CollectionHolder} from the {@link fromIndex starting}
 * to the {@link toIndex ending} index with a {@link limit} applied
 * in the {@link collection}
 *
 * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
 * @param fromIndex The starting index
 * @param toIndex The ending index
 * @param limit The maximum amount of elements
 * @see ReadonlyArray.slice
 * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/slice.html Kotlin slice(indices)
 * @see https://learn.microsoft.com/dotnet/api/system.collections.immutable.immutablearray-1.slice C# Slice(start, length)
 * @throws {RangeError} The {@link fromIndex}, {@link toIndex} and {@link limit} are not within a valid range
 * @canReceiveNegativeValue
 * @extensionFunction
 */
export function sliceByRange<const T, >(collection: Nullable<CollectionHolder<T>>, fromIndex: Nullable<number> = null, toIndex: Nullable<number> = null, limit: Nullable<number> = null,): CollectionHolder<T> {
    if (collection == null)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (collection.isEmpty)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    if (fromIndex === 0 && toIndex === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER
    if (limit === 0)
        return CollectionConstants.EMPTY_COLLECTION_HOLDER

    if (limit == null)
        return newInstance(collection.constructor as CollectionHolderConstructor<T>, () => {
            const size = collection.size,
                startingIndex = startingIndexFunction(collection as NonEmptyCollectionHolder<T>, fromIndex, size,),
                endingIndex = toIndex == null ? size - 1 : endingIndexFunction(collection as NonEmptyCollectionHolder<T>, toIndex, size,)

            if (endingIndex < startingIndex)
                throw new RangeError(`The ending index "${toIndex}"${toIndex == startingIndex ? '' : ` ("${startingIndex}" after calculation)`} is over the starting index "${fromIndex}"${fromIndex == endingIndex ? '' : `("${endingIndex}" after calculation)`}.`,)

            const newArray = [] as T[]
            let index = startingIndex - 1
            while (++index <= endingIndex)
                newArray.push(collection.get(index,),)
            return newArray
        },)


    return newInstance(collection.constructor as CollectionHolderConstructor<T>, () => {
        const size = collection.size,
            startingIndex = startingIndexFunction(collection as NonEmptyCollectionHolder<T>, fromIndex, size,),
            endingIndex = toIndex == null ? size - 1 : endingIndexFunction(collection as NonEmptyCollectionHolder<T>, toIndex, size,)

        if (endingIndex < startingIndex)
            throw new RangeError(`The ending index "${toIndex ?? ''}"${toIndex == startingIndex ? '' : ` ("${startingIndex}" after calculation)`} is over the starting index "${fromIndex ?? ''}"${fromIndex == endingIndex ? '' : `("${endingIndex}" after calculation)`}.`,)

        const amountOfItem = limit < 0 ? size + limit : limit
        if (amountOfItem > size)
            throw new RangeError(`The limit "${limit}"${limit == amountOfItem ? '' : `("${amountOfItem}" after calculation)`} cannot over the size "${size}".`,)
        if (amountOfItem < 0)
            throw new RangeError(`The limit "${limit}"${limit == amountOfItem ? '' : `("${amountOfItem}" after calculation)`} cannot under 0.`,)

        if (endingIndex - startingIndex < amountOfItem - 1)
            throw new RangeError(`The limit "${limit}"${limit == amountOfItem ? '' : `("${amountOfItem}" after calculation)`} cannot be applied within the range "${fromIndex ?? ''}"${fromIndex == startingIndex ? '' : `("${startingIndex}" after calculation)`} to "${toIndex ?? ''}"${toIndex == endingIndex ? '' : `("${endingIndex}" after calculation)`}`,)

        const newArray = [] as T[]
        let index = startingIndex - 1
        while (++index <= endingIndex) {
            if (newArray.length >= amountOfItem)
                return newArray
            newArray.push(collection.get(index,),)
        }
        return newArray
    },)
}

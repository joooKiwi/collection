//··························································
// Copyright (c) 2023-2025. Jonathan Bédard ~ JóôòKiwi
//
// This project is free to use.
// All the right is reserved to the author of this project.
// My projects:
//  - https://github.com/joooKiwi/type
//  - https://github.com/joooKiwi/lazy
//  - https://github.com/joooKiwi/collection
//  - https://github.com/joooKiwi/enumeration
//··························································

/**
 * A minimalistic declaration of the {@link CollectionHolder}
 *
 * @param T The type (by default <em>unknown</em>)
 */
export interface MinimalistCollectionHolder<out T = unknown, > {

    /**
     * Get the size of the current {@link MinimalistCollectionHolder collection}
     *
     * @see ReadonlyArray.length
     * @see ReadonlySet.size
     * @see ReadonlyMap.size
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-collection/size.html Kotlin Collection.size()
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-map/size.html Kotlin Map.size()
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Collection.html#size() Java Collection.size()
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/Map.html#size() Java Map.size()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.count C# Count()
     */
    get size(): number

    /**
     * Get the element at the specified index in the {@link MinimalistCollectionHolder collection}
     *
     * @param index The index to retrieve a value
     * @throws IndexOutOfBoundsException The index calculated is under zero or over the {@link size} (after calculation)
     * @see ReadonlyArray.at
     * @see https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/get.html Kotlin get(index)
     * @see https://docs.oracle.com/en/java/javase/24/docs/api/java.base/java/util/List.html#get(int) Java get(index)
     * @canReceiveNegativeValue
     */
    get(index: number,): T

}

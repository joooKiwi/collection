/*******************************************************************************
 Copyright (c) 2023. Jonathan Bédard ~ JóôòKiwi

 This project is free to use.
 All the right is reserved to the author of this project.
 ******************************************************************************/

/** A minimalistic declaration of the {@link CollectionHolder} */
export interface MinimalistCollectionHolder<out T = unknown, > {

    /**
     * Get the size of the current {@link MinimalistCollectionHolder collection}
     *
     * @see ReadonlyArray.length
     * @see ReadonlySet.size
     * @see ReadonlyMap.size
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/size.html Kotlin size()
     * @see https://learn.microsoft.com/dotnet/api/system.linq.enumerable.count C# Count()
     */
    get size(): number

    /**
     * The {@link MinimalistCollectionHolder collection} has no values
     *
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/is-empty.html Kotlin isEmpty()
     */
    get isEmpty(): boolean

    /**
     * Get the element at the specified index in the {@link MinimalistCollectionHolder collection}
     *
     * @param index The index to retrieve a value
     * @throws CollectionHolderIndexOutOfBoundsException The index calculated is under zero
     *             or over the {@link size} (after calculation)
     * @see ReadonlyArray.at
     * @see https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/get.html Kotlin get(index)
     * @canReceiveNegativeValue
     */
    get(index: number,): T

}

package joookiwi.collection.java.method;

import java.util.List;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.CommonContracts;
import joookiwi.collection.java.GenericCollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.CanReceiveNegativeValue;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.emptyCollectionHolder;

public final class ToReverse
        extends UtilityWithIndex {

    @Contract(CommonContracts.ALWAYS_FAIL_0)
    private ToReverse() { throw new ImpossibleConstructionException("The utility class “ToReverse” cannot be constructed.", ToReverse.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- minimalist - ∅ --------------------

    /**
     * Reverse the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @see java.util.SequencedCollection#reversed()
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    public static <T> @NotNull CollectionHolder<T> toReverse(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return emptyCollectionHolder();
        return __core(collection);
    }

    //#endregion -------------------- minimalist - ∅ --------------------
    //#region -------------------- ∅ --------------------

    /**
     * Reverse the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @see java.util.SequencedCollection#reversed()
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    public static <T> @NotNull CollectionHolder<T> toReverse(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return emptyCollectionHolder();
        return __core(collection);
    }

    //#endregion -------------------- ∅ --------------------

    //#region -------------------- minimalist - from --------------------

    /**
     * Reverse the {@code collection}
     * from a start <em>(if provided)</em>
     * to the end of the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param fromIndex  The inclusive starting index
     * @throws CollectionHolderIndexOutOfBoundsException The {@code fromIndex} is not within a valid range
     * @see java.util.SequencedCollection#reversed()
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> @NotNull CollectionHolder<T> toReverse(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                             final @Nullable Integer fromIndex) {
        if (collection == null)
            return emptyCollectionHolder();
        if (fromIndex == null)
            return __core(collection);
        return __core(collection, fromIndex);
    }

    /**
     * Reverse the {@code collection}
     * from a start
     * to the end of the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param fromIndex  The inclusive starting index
     * @throws CollectionHolderIndexOutOfBoundsException The {@code fromIndex} is not within a valid range
     * @see java.util.SequencedCollection#reversed()
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> @NotNull CollectionHolder<T> toReverse(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                             final int fromIndex) {
        if (collection == null)
            return emptyCollectionHolder();
        return __core(collection, fromIndex);
    }

    //#endregion -------------------- minimalist - from --------------------
    //#region -------------------- from --------------------

    /**
     * Reverse the {@code collection}
     * from a start <em>(if provided)</em>
     * to the end of the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param fromIndex  The inclusive starting index
     * @throws CollectionHolderIndexOutOfBoundsException The {@code fromIndex} is not within a valid range
     * @see java.util.SequencedCollection#reversed()
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> @NotNull CollectionHolder<T> toReverse(final @Nullable CollectionHolder<? extends T> collection,
                                                             final @Nullable Integer fromIndex) {
        if (collection == null)
            return emptyCollectionHolder();
        if (fromIndex == null)
            return __core(collection);
        return __core(collection, fromIndex);
    }

    /**
     * Reverse the {@code collection}
     * from a start
     * to the end of the {@code collection}
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param fromIndex  The inclusive starting index
     * @throws CollectionHolderIndexOutOfBoundsException The {@code fromIndex} is not within a valid range
     * @see java.util.SequencedCollection#reversed()
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> @NotNull CollectionHolder<T> toReverse(final @Nullable CollectionHolder<? extends T> collection,
                                                             final int fromIndex) {
        if (collection == null)
            return emptyCollectionHolder();
        return __core(collection, fromIndex);
    }

    //#endregion -------------------- from --------------------

    //#region -------------------- minimalist - from, to --------------------

    /**
     * Reverse the {@code collection}
     * from a start
     * to an end
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @throws CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see java.util.SequencedCollection#reversed()
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> @NotNull CollectionHolder<T> toReverse(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                             final int fromIndex,
                                                             final int toIndex) {
        if (collection == null)
            return emptyCollectionHolder();
        return __core(collection, fromIndex, toIndex);
    }

    /**
     * Reverse the {@code collection}
     * from a start
     * to an end <em>(if provided)</em>
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @throws CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see java.util.SequencedCollection#reversed()
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> @NotNull CollectionHolder<T> toReverse(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                             final int fromIndex,
                                                             final @Nullable Integer toIndex) {
        if (collection == null)
            return emptyCollectionHolder();
        if (toIndex == null)
            return __core(collection, fromIndex);
        return __core(collection, fromIndex, toIndex);
    }

    /**
     * Reverse the {@code collection}
     * from a start <em>(if provided)</em>
     * to an end
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @throws CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see java.util.SequencedCollection#reversed()
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> @NotNull CollectionHolder<T> toReverse(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                             final @Nullable Integer fromIndex,
                                                             final int toIndex) {
        if (collection == null)
            return emptyCollectionHolder();
        if (fromIndex == null)
            return __coreWithNoFrom(collection, toIndex);
        return __core(collection, fromIndex, toIndex);
    }

    /**
     * Reverse the {@code collection}
     * from a start <em>(if provided)</em>
     * to an end <em>(if provided)</em>
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @throws CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see java.util.SequencedCollection#reversed()
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> @NotNull CollectionHolder<T> toReverse(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                             final @Nullable Integer fromIndex,
                                                             final @Nullable Integer toIndex) {
        if (collection == null)
            return emptyCollectionHolder();
        if (toIndex == null)
            if (fromIndex == null)
                return __core(collection);
            else
                return __core(collection, fromIndex);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, toIndex);
        return __core(collection, fromIndex, toIndex);
    }

    //#endregion -------------------- minimalist - from, to --------------------
    //#region -------------------- from, to --------------------

    /**
     * Reverse the {@code collection}
     * from a start
     * to an end
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @throws CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see java.util.SequencedCollection#reversed()
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> @NotNull CollectionHolder<T> toReverse(final @Nullable CollectionHolder<? extends T> collection,
                                                             final int fromIndex,
                                                             final int toIndex) {
        if (collection == null)
            return emptyCollectionHolder();
        return __core(collection, fromIndex, toIndex);
    }

    /**
     * Reverse the {@code collection}
     * from a start
     * to an end <em>(if provided)</em>
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @throws CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see java.util.SequencedCollection#reversed()
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> @NotNull CollectionHolder<T> toReverse(final @Nullable CollectionHolder<? extends T> collection,
                                                             final int fromIndex,
                                                             final @Nullable Integer toIndex) {
        if (collection == null)
            return emptyCollectionHolder();
        if (toIndex == null)
            return __core(collection, fromIndex);
        return __core(collection, fromIndex, toIndex);
    }

    /**
     * Reverse the {@code collection}
     * from a start <em>(if provided)</em>
     * to an end
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @throws CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see java.util.SequencedCollection#reversed()
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> @NotNull CollectionHolder<T> toReverse(final @Nullable CollectionHolder<? extends T> collection,
                                                             final @Nullable Integer fromIndex,
                                                             final int toIndex) {
        if (collection == null)
            return emptyCollectionHolder();
        if (fromIndex == null)
            return __coreWithNoFrom(collection, toIndex);
        return __core(collection, fromIndex, toIndex);
    }

    /**
     * Reverse the {@code collection}
     * from a start <em>(if provided)</em>
     * to an end <em>(if provided)</em>
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @throws CollectionHolderIndexOutOfBoundsException The {@code fromIndex} or {@code toIndex} are not within a valid range
     * @see java.util.SequencedCollection#reversed()
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> @NotNull CollectionHolder<T> toReverse(final @Nullable CollectionHolder<? extends T> collection,
                                                             final @Nullable Integer fromIndex,
                                                             final @Nullable Integer toIndex) {
        if (collection == null)
            return emptyCollectionHolder();
        if (toIndex == null)
            if (fromIndex == null)
                return __core(collection);
            else
                return __core(collection, fromIndex);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, toIndex);
        return __core(collection, fromIndex, toIndex);
    }

    //#endregion -------------------- from, to --------------------

    //#region -------------------- minimalist - from, to, limit --------------------

    /**
     * Reverse the {@code collection}
     * from a start
     * to an end
     * applying it a limit
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see java.util.SequencedCollection#reversed()
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> @NotNull CollectionHolder<T> toReverse(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                             final int fromIndex,
                                                             final int toIndex,
                                                             final int limit) {
        if (collection == null)
            return emptyCollectionHolder();
        return __core(collection, fromIndex, toIndex, limit);
    }

    /**
     * Reverse the {@code collection}
     * from a start
     * to an end
     * applying it a limit <em>(if provided)</em>
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see java.util.SequencedCollection#reversed()
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> @NotNull CollectionHolder<T> toReverse(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                             final int fromIndex,
                                                             final int toIndex,
                                                             final @Nullable Integer limit) {
        if (collection == null)
            return emptyCollectionHolder();
        if (limit == null)
            return __core(collection, fromIndex, toIndex);
        return __core(collection, fromIndex, toIndex, limit);
    }

    /**
     * Reverse the {@code collection}
     * from a start
     * to an end <em>(if provided)</em>
     * applying it a limit
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see java.util.SequencedCollection#reversed()
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> @NotNull CollectionHolder<T> toReverse(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                             final int fromIndex,
                                                             final @Nullable Integer toIndex,
                                                             final int limit) {
        if (collection == null)
            return emptyCollectionHolder();
        if (toIndex == null)
            return __coreWithNoTo(collection, fromIndex, limit);
        return __core(collection, fromIndex, toIndex, limit);
    }

    /**
     * Reverse the {@code collection}
     * from a start
     * to an end <em>(if provided)</em>
     * applying it a limit <em>(if provided)</em>
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see java.util.SequencedCollection#reversed()
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> @NotNull CollectionHolder<T> toReverse(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                             final int fromIndex,
                                                             final @Nullable Integer toIndex,
                                                             final @Nullable Integer limit) {
        if (collection == null)
            return emptyCollectionHolder();
        if (limit == null)
            if (toIndex == null)
                return __core(collection, fromIndex);
            else
                return __core(collection, fromIndex, toIndex);
        if (toIndex == null)
            return __coreWithNoTo(collection, fromIndex, limit);
        return __core(collection, fromIndex, toIndex, limit);
    }

    /**
     * Reverse the {@code collection}
     * from a start <em>(if provided)</em>
     * to an end
     * applying it a limit
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see java.util.SequencedCollection#reversed()
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> @NotNull CollectionHolder<T> toReverse(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                             final @Nullable Integer fromIndex,
                                                             final int toIndex,
                                                             final int limit) {
        if (collection == null)
            return emptyCollectionHolder();
        if (fromIndex == null)
            return __coreWithNoFrom(collection, toIndex, limit);
        return __core(collection, fromIndex, toIndex, limit);
    }

    /**
     * Reverse the {@code collection}
     * from a start <em>(if provided)</em>
     * to an end
     * applying it a limit <em>(if provided)</em>
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see java.util.SequencedCollection#reversed()
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> @NotNull CollectionHolder<T> toReverse(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                             final @Nullable Integer fromIndex,
                                                             final int toIndex,
                                                             final @Nullable Integer limit) {
        if (collection == null)
            return emptyCollectionHolder();
        if (limit == null)
            if (fromIndex == null)
                return __coreWithNoFrom(collection, toIndex);
            else
                return __core(collection, fromIndex, toIndex);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, toIndex, limit);
        return __core(collection, fromIndex, toIndex, limit);
    }

    /**
     * Reverse the {@code collection}
     * from a start <em>(if provided)</em>
     * to an end <em>(if provided)</em>
     * applying it a limit
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see java.util.SequencedCollection#reversed()
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> @NotNull CollectionHolder<T> toReverse(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                             final @Nullable Integer fromIndex,
                                                             final @Nullable Integer toIndex,
                                                             final int limit) {
        if (collection == null)
            return emptyCollectionHolder();
        if (toIndex == null)
            if (fromIndex == null)
                return __coreWithNoFromAndTo(collection, limit);
            else
                return __coreWithNoFromAndTo(collection, limit);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, toIndex, limit);
        return __core(collection, fromIndex, toIndex, limit);
    }

    /**
     * Reverse the {@code collection}
     * from a start <em>(if provided)</em>
     * to an end <em>(if provided)</em>
     * applying it a limit <em>(if provided)</em>
     *
     * @param collection The {@link Nullable nullable} {@link MinimalistCollectionHolder collection}
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see java.util.SequencedCollection#reversed()
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> @NotNull CollectionHolder<T> toReverse(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                             final @Nullable Integer fromIndex,
                                                             final @Nullable Integer toIndex,
                                                             final @Nullable Integer limit) {
        if (collection == null)
            return emptyCollectionHolder();
        if (limit == null)
            if (toIndex == null)
                if (fromIndex == null)
                    return __core(collection);
                else
                    return __core(collection, fromIndex);
            else if (fromIndex == null)
                return __coreWithNoFrom(collection, toIndex);
            else
                return __core(collection, fromIndex, toIndex);
        if (toIndex == null)
            if (fromIndex == null)
                return __coreWithNoFromAndTo(collection, limit);
            else
                return __coreWithNoFromAndTo(collection, limit);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, toIndex, limit);
        return __core(collection, fromIndex, toIndex, limit);
    }

    //#endregion -------------------- minimalist - from, to, limit --------------------
    //#region -------------------- from, to, limit --------------------

    /**
     * Reverse the {@code collection}
     * from a start
     * to an end
     * applying it a limit
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see java.util.SequencedCollection#reversed()
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> @NotNull CollectionHolder<T> toReverse(final @Nullable CollectionHolder<? extends T> collection,
                                                             final int fromIndex,
                                                             final int toIndex,
                                                             final int limit) {
        if (collection == null)
            return emptyCollectionHolder();
        return __core(collection, fromIndex, toIndex, limit);
    }

    /**
     * Reverse the {@code collection}
     * from a start
     * to an end
     * applying it a limit <em>(if provided)</em>
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see java.util.SequencedCollection#reversed()
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> @NotNull CollectionHolder<T> toReverse(final @Nullable CollectionHolder<? extends T> collection,
                                                             final int fromIndex,
                                                             final int toIndex,
                                                             final @Nullable Integer limit) {
        if (collection == null)
            return emptyCollectionHolder();
        if (limit == null)
            return __core(collection, fromIndex, toIndex);
        return __core(collection, fromIndex, toIndex, limit);
    }

    /**
     * Reverse the {@code collection}
     * from a start
     * to an end <em>(if provided)</em>
     * applying it a limit
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see java.util.SequencedCollection#reversed()
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> @NotNull CollectionHolder<T> toReverse(final @Nullable CollectionHolder<? extends T> collection,
                                                             final int fromIndex,
                                                             final @Nullable Integer toIndex,
                                                             final int limit) {
        if (collection == null)
            return emptyCollectionHolder();
        if (toIndex == null)
                return __coreWithNoTo(collection, fromIndex, limit);
        return __core(collection, fromIndex, toIndex, limit);
    }

    /**
     * Reverse the {@code collection}
     * from a start
     * to an end <em>(if provided)</em>
     * applying it a limit <em>(if provided)</em>
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see java.util.SequencedCollection#reversed()
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> @NotNull CollectionHolder<T> toReverse(final @Nullable CollectionHolder<? extends T> collection,
                                                             final int fromIndex,
                                                             final @Nullable Integer toIndex,
                                                             final @Nullable Integer limit) {
        if (collection == null)
            return emptyCollectionHolder();
        if (limit == null)
            if (toIndex == null)
                return __core(collection, fromIndex);
            else
                return __core(collection, fromIndex, toIndex);
        if (toIndex == null)
            return __coreWithNoTo(collection, fromIndex, limit);
        return __core(collection, fromIndex, toIndex, limit);
    }

    /**
     * Reverse the {@code collection}
     * from a start <em>(if provided)</em>
     * to an end
     * applying it a limit
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see java.util.SequencedCollection#reversed()
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> @NotNull CollectionHolder<T> toReverse(final @Nullable CollectionHolder<? extends T> collection,
                                                             final @Nullable Integer fromIndex,
                                                             final int toIndex,
                                                             final int limit) {
        if (collection == null)
            return emptyCollectionHolder();
        if (fromIndex == null)
            return __coreWithNoFrom(collection, toIndex, limit);
        return __core(collection, fromIndex, toIndex, limit);
    }
    /**
     * Reverse the {@code collection}
     * from a start <em>(if provided)</em>
     * to an end
     * applying it a limit <em>(if provided)</em>
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see java.util.SequencedCollection#reversed()
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> @NotNull CollectionHolder<T> toReverse(final @Nullable CollectionHolder<? extends T> collection,
                                                             final @Nullable Integer fromIndex,
                                                             final int toIndex,
                                                             final @Nullable Integer limit) {
        if (collection == null)
            return emptyCollectionHolder();
        if (limit == null)
            if (fromIndex == null)
                return __coreWithNoFrom(collection, toIndex);
            else
                return __core(collection, fromIndex, toIndex);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, toIndex, limit);
        return __core(collection, fromIndex, toIndex, limit);
    }

    /**
     * Reverse the {@code collection}
     * from a start <em>(if provided)</em>
     * to an end <em>(if provided)</em>
     * applying it a limit
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see java.util.SequencedCollection#reversed()
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> @NotNull CollectionHolder<T> toReverse(final @Nullable CollectionHolder<? extends T> collection,
                                                             final @Nullable Integer fromIndex,
                                                             final @Nullable Integer toIndex,
                                                             final int limit) {
        if (collection == null)
            return emptyCollectionHolder();
        if (toIndex == null)
            if (fromIndex == null)
                return __coreWithNoFromAndTo(collection, limit);
            else
                return __coreWithNoTo(collection, fromIndex, limit);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, toIndex, limit);
        return __core(collection, fromIndex, toIndex, limit);
    }

    /**
     * Reverse the {@code collection}
     * from a start <em>(if provided)</em>
     * to an end <em>(if provided)</em>
     * applying it a limit <em>(if provided)</em>
     *
     * @param collection The {@link Nullable nullable} {@link CollectionHolder collection}
     * @param fromIndex  The inclusive starting index
     * @param toIndex    The inclusive ending index
     * @param limit      The maximum index
     * @throws CollectionHolderIndexOutOfBoundsException The {@code fromIndex}, {@code toIndex} or {@code limit} are not within a valid range
     * @see java.util.SequencedCollection#reversed()
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
     * @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
     * @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
     * @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
     */
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T> @NotNull CollectionHolder<T> toReverse(final @Nullable CollectionHolder<? extends T> collection,
                                                             final @Nullable Integer fromIndex,
                                                             final @Nullable Integer toIndex,
                                                             final @Nullable Integer limit) {
        if (collection == null)
            return emptyCollectionHolder();
        if (limit == null)
            if (toIndex == null)
                if (fromIndex == null)
                    return __core(collection);
                else
                    return __core(collection, fromIndex);
            else if (fromIndex == null)
                return __coreWithNoFrom(collection, toIndex);
            else
                return __core(collection, fromIndex, toIndex);
        if (toIndex == null)
            if (fromIndex == null)
                return __coreWithNoFromAndTo(collection, limit);
            else
                return __coreWithNoTo(collection, fromIndex, limit);
        if (fromIndex == null)
            return __coreWithNoFrom(collection, toIndex, limit);
        return __core(collection, fromIndex, toIndex, limit);
    }

    //#endregion -------------------- from, to, limit --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Core methods --------------------

    //#region -------------------- minimalist - ∅ --------------------

    private static <T> @NotNull CollectionHolder<T> __core(final @NotNull MinimalistCollectionHolder<? extends T> collection) {
        final var size = collection.size();
        if (size == 0)
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(() -> __all(collection, size));
    }

    //#endregion -------------------- minimalist - ∅ --------------------
    //#region -------------------- ∅ --------------------

    private static <T> @NotNull CollectionHolder<T> __core(final @NotNull CollectionHolder<? extends T> collection) {
        if (collection.isEmpty())
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(() -> __all(collection, collection.size()));
    }

    //#endregion -------------------- ∅ --------------------

    //#region -------------------- minimalist - from --------------------

    private static <T> @NotNull CollectionHolder<T> __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                           final int fromIndex) {
        final var size = collection.size();
        if (size == 0)
            return emptyCollectionHolder();

        final var startingIndex = _startingIndex(fromIndex, size);
        return new GenericCollectionHolder<>(() -> __withStartingIndex(collection, startingIndex, size));
    }

    //#endregion -------------------- minimalist - from --------------------
    //#region -------------------- from --------------------

    private static <T> @NotNull CollectionHolder<T> __core(final @NotNull CollectionHolder<? extends T> collection,
                                                           final int fromIndex) {
        if (collection.isEmpty())
            return emptyCollectionHolder();

        final var size = collection.size();
        final var startingIndex = _startingIndex(fromIndex, size);
        return new GenericCollectionHolder<>(() -> __withStartingIndex(collection, startingIndex, size));
    }

    //#endregion -------------------- from --------------------

    //#region -------------------- minimalist - from, to --------------------

    private static <T> @NotNull CollectionHolder<T> __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                           final int fromIndex,
                                                           final int toIndex) {
        //#region -------------------- Early returns --------------------

        final var size = collection.size();
        if (size == 0)
            return emptyCollectionHolder();
        if (fromIndex == 0 && toIndex == 0)
            return emptyCollectionHolder();

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/ending index) --------------------

        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            throw new CollectionHolderIndexOutOfBoundsException("The ending index “" + toIndex + '"' + (toIndex == startingIndex ? "" : " (“" + startingIndex + "” after calculation)") + " is over the starting index “" + fromIndex + '"' + (fromIndex == endingIndex ? "" : " (“" + endingIndex + "” after calculation") + '.', toIndex);

        //#endregion -------------------- Initialization (starting/ending index) --------------------

        return new GenericCollectionHolder<>(() -> __withStaringAndEndingIndex(collection, startingIndex, endingIndex));
    }


    private static <T> @NotNull CollectionHolder<T> __coreWithNoFrom(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                     final int toIndex) {
        //#region -------------------- Early returns --------------------

        final var size = collection.size();
        if (size == 0)
            return emptyCollectionHolder();
        if (toIndex == 0)
            return emptyCollectionHolder();

        //#endregion -------------------- Early returns --------------------

        final var endingIndex = _endingIndex(toIndex, size);
        return new GenericCollectionHolder<>(() -> __withStaringAndEndingIndex(collection, 0, endingIndex));
    }

    //#endregion -------------------- minimalist - from, to --------------------
    //#region -------------------- from, to --------------------

    private static <T> @NotNull CollectionHolder<T> __core(final @NotNull CollectionHolder<? extends T> collection,
                                                           final int fromIndex,
                                                           final int toIndex) {
        //#region -------------------- Early returns --------------------

        if (collection.isEmpty())
            return emptyCollectionHolder();
        if (fromIndex == 0 && toIndex == 0)
            return emptyCollectionHolder();

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/ending index) --------------------

        final var size = collection.size();
        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            throw new CollectionHolderIndexOutOfBoundsException("The ending index “" + toIndex + '"' + (toIndex == startingIndex ? "" : " (“" + startingIndex + "” after calculation)") + " is over the starting index “" + fromIndex + '"' + (fromIndex == endingIndex ? "" : " (“" + endingIndex + "” after calculation") + '.', toIndex);

        //#endregion -------------------- Initialization (starting/ending index) --------------------

        return new GenericCollectionHolder<>(() -> __withStaringAndEndingIndex(collection, startingIndex, endingIndex));
    }

    private static <T> @NotNull CollectionHolder<T> __coreWithNoFrom(final @NotNull CollectionHolder<? extends T> collection,
                                                                     final int toIndex) {
        //#region -------------------- Early returns --------------------

        if (collection.isEmpty())
            return emptyCollectionHolder();
        if (toIndex == 0)
            return emptyCollectionHolder();

        //#endregion -------------------- Early returns --------------------

        final var endingIndex = _endingIndex(toIndex, collection.size());
        return new GenericCollectionHolder<>(() -> __withStaringAndEndingIndex(collection, 0, endingIndex));
    }

    //#endregion -------------------- from, to --------------------

    //#region -------------------- minimalist - from, to, limit --------------------

    private static <T> @NotNull CollectionHolder<T> __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                           final int fromIndex,
                                                           final int toIndex,
                                                           final int limit) {
        //#region -------------------- Early returns --------------------

        final var size = collection.size();
        if (size == 0)
            return emptyCollectionHolder();
        if (fromIndex == 0 && toIndex == 0)
            return emptyCollectionHolder();
        if (limit == 0)
            return emptyCollectionHolder();

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/ending/maximum index) --------------------

        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            throw new CollectionHolderIndexOutOfBoundsException("The ending index “" + fromIndex + '”' + (fromIndex == startingIndex ? "" : " (“" + startingIndex + "” after calculation)") + " is over the starting index “" + toIndex + '”' + (toIndex == endingIndex ? "" : " (“" + endingIndex + "” after calculation") + '.', toIndex);

        final var maximumIndex = _maximumIndex(limit, size);
        if (endingIndex - startingIndex < maximumIndex - 1)
            throw new CollectionHolderIndexOutOfBoundsException("The limit “" + limit + '”' + (limit == maximumIndex ? "" : "(“" + maximumIndex + "” after calculation") + " cannot be applied within the range “" + fromIndex + '”' + (fromIndex == startingIndex ? "" : " (“" + startingIndex + "” after calculation)") + " to “" + toIndex + '”' + (toIndex == endingIndex ? "" : " (“" + endingIndex + "” after calculation)") + '.', limit);

        //#endregion -------------------- Initialization (starting/ending/maximum index) --------------------

        return new GenericCollectionHolder<>(() -> __withALimit(collection, startingIndex, endingIndex, maximumIndex));
    }

    private static <T> @NotNull CollectionHolder<T> __coreWithNoFrom(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                     final int toIndex,
                                                                     final int limit) {
        //#region -------------------- Early returns --------------------

        final var size = collection.size();
        if (size == 0)
            return emptyCollectionHolder();
        if (toIndex == 0)
            return emptyCollectionHolder();
        if (limit == 0)
            return emptyCollectionHolder();

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (ending/maximum index) --------------------

        final var endingIndex = _endingIndex(toIndex, size);
        final var maximumIndex = _maximumIndex(limit, size);
        if (maximumIndex > endingIndex)
            throw new CollectionHolderIndexOutOfBoundsException("The limit “" + limit + '”' + (limit == maximumIndex ? "" : "(“" + maximumIndex + "” after calculation") + " cannot be applied within the range “0” to “" + toIndex + '”' + (toIndex == endingIndex ? "" : " (“" + endingIndex + "” after calculation)") + '.', limit);

        //#endregion -------------------- Initialization (ending/maximum index) --------------------

        return new GenericCollectionHolder<>(() -> __withALimit(collection, 0, endingIndex, maximumIndex));
    }

    private static <T> @NotNull CollectionHolder<T> __coreWithNoTo(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                   final int fromIndex,
                                                                   final int limit) {
        //#region -------------------- Early returns --------------------

        final var size = collection.size();
        if (size == 0)
            return emptyCollectionHolder();
        if (limit == 0)
            return emptyCollectionHolder();

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/maximum index) --------------------

        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = size - 1;
        final var maximumIndex = _maximumIndex(limit, size);
        if (endingIndex - startingIndex < maximumIndex - 1)
            throw new CollectionHolderIndexOutOfBoundsException("The limit “" + limit + '”' + (limit == maximumIndex ? "" : "(“" + maximumIndex + "” after calculation") + " cannot be applied within the range “" + fromIndex + '”' + (fromIndex == startingIndex ? "" : " (“" + startingIndex + "” after calculation)") + " to “" + endingIndex + "”.", limit);

        //#endregion -------------------- Initialization (starting/maximum index) --------------------

        return new GenericCollectionHolder<>(() -> __withALimit(collection, startingIndex, endingIndex, maximumIndex));
    }

    private static <T> @NotNull CollectionHolder<T> __coreWithNoFromAndTo(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                          final int limit) {
        //#region -------------------- Early returns --------------------

        final var size = collection.size();
        if (size == 0)
            return emptyCollectionHolder();
        if (limit == 0)
            return emptyCollectionHolder();

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (maximum index) --------------------

        final var endingIndex = size - 1;
        final var maximumIndex = _maximumIndex(limit, size);
        if (maximumIndex > size)
            throw new CollectionHolderIndexOutOfBoundsException("The limit “" + limit + '"' + (limit == maximumIndex ? "" : "(“" + maximumIndex + "” after calculation") + " cannot be applied within the range “0” to “" + endingIndex + "”.", limit);

        //#endregion -------------------- Initialization (maximum index) --------------------

        return new GenericCollectionHolder<>(() -> __withALimit(collection, 0, endingIndex, maximumIndex));
    }

    //#endregion -------------------- minimalist - from, to, limit --------------------
    //#region -------------------- from, to, limit --------------------

    private static <T> @NotNull CollectionHolder<T> __core(final @NotNull CollectionHolder<? extends T> collection,
                                                           final int fromIndex,
                                                           final int toIndex,
                                                           final int limit) {
        //#region -------------------- Early returns --------------------

        if (collection.isEmpty())
            return emptyCollectionHolder();
        if (fromIndex == 0 && toIndex == 0)
            return emptyCollectionHolder();
        if (limit == 0)
            return emptyCollectionHolder();

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/ending/maximum index) --------------------

        final var size = collection.size();
        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            throw new CollectionHolderIndexOutOfBoundsException("The ending index “" + fromIndex + '”' + (fromIndex == startingIndex ? "" : " (“" + startingIndex + "” after calculation)") + " is over the starting index “" + toIndex + '”' + (toIndex == endingIndex ? "" : " (“" + endingIndex + "” after calculation") + '.', toIndex);

        final var maximumIndex = _maximumIndex(limit, size);
        if (endingIndex - startingIndex < maximumIndex - 1)
            throw new CollectionHolderIndexOutOfBoundsException("The limit “" + limit + '”' + (limit == maximumIndex ? "" : "(“" + maximumIndex + "” after calculation") + " cannot be applied within the range “" + fromIndex + '”' + (fromIndex == startingIndex ? "" : " (“" + startingIndex + "” after calculation)") + " to “" + toIndex + '”' + (toIndex == endingIndex ? "" : " (“" + endingIndex + "” after calculation)") + '.', limit);

        //#endregion -------------------- Initialization (starting/ending/maximum index) --------------------

        return new GenericCollectionHolder<>(() -> __withALimit(collection, startingIndex, endingIndex, maximumIndex));
    }

    private static <T> @NotNull CollectionHolder<T> __coreWithNoFrom(final @NotNull CollectionHolder<? extends T> collection,
                                                                     final int toIndex,
                                                                     final int limit) {
        //#region -------------------- Early returns --------------------

        if (collection.isEmpty())
            return emptyCollectionHolder();
        if (toIndex == 0)
            return emptyCollectionHolder();
        if (limit == 0)
            return emptyCollectionHolder();

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (ending/maximum index) --------------------

        final var size = collection.size();
        final var endingIndex = _endingIndex(toIndex, size);
        final var maximumIndex = _maximumIndex(limit, size);
        if (maximumIndex > endingIndex)
            throw new CollectionHolderIndexOutOfBoundsException("The limit “" + limit + '”' + (limit == maximumIndex ? "" : "(“" + maximumIndex + "” after calculation") + " cannot be applied within the range “0” to “" + toIndex + '”' + (toIndex == endingIndex ? "" : " (“" + endingIndex + "” after calculation)") + '.', limit);

        //#endregion -------------------- Initialization (ending/maximum index) --------------------

        return new GenericCollectionHolder<>(() -> __withALimit(collection, 0, endingIndex, maximumIndex));
    }

    private static <T> @NotNull CollectionHolder<T> __coreWithNoTo(final @NotNull CollectionHolder<? extends T> collection,
                                                                   final int fromIndex,
                                                                   final int limit) {
        //#region -------------------- Early returns --------------------

        if (collection.isEmpty())
            return emptyCollectionHolder();
        if (limit == 0)
            return emptyCollectionHolder();

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (starting/maximum index) --------------------

        final var size = collection.size();
        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = size - 1;
        final var maximumIndex = _maximumIndex(limit, size);
        if (endingIndex - startingIndex < maximumIndex - 1)
            throw new CollectionHolderIndexOutOfBoundsException("The limit “" + limit + '”' + (limit == maximumIndex ? "" : "(“" + maximumIndex + "” after calculation") + " cannot be applied within the range “" + fromIndex + '”' + (fromIndex == startingIndex ? "" : " (“" + startingIndex + "” after calculation)") + " to “" + endingIndex + "”.", limit);

        //#endregion -------------------- Initialization (starting/maximum index) --------------------

        return new GenericCollectionHolder<>(() -> __withALimit(collection, startingIndex, endingIndex, maximumIndex));
    }

    private static <T> @NotNull CollectionHolder<T> __coreWithNoFromAndTo(final @NotNull CollectionHolder<? extends T> collection,
                                                                          final int limit) {
        //#region -------------------- Early returns --------------------

        if (collection.isEmpty())
            return emptyCollectionHolder();
        if (limit == 0)
            return emptyCollectionHolder();

        //#endregion -------------------- Early returns --------------------
        //#region -------------------- Initialization (maximum index) --------------------

        final var size = collection.size();
        final var endingIndex = size - 1;

        final var maximumIndex = _maximumIndex(limit, size);
        if (maximumIndex > size)
            throw new CollectionHolderIndexOutOfBoundsException("The limit “" + limit + '”' + (limit == maximumIndex ? "" : "(“" + maximumIndex + "” after calculation") + " cannot be applied within the range “0” to “" + endingIndex + "”.", limit);

        //#endregion -------------------- Initialization (maximum index) --------------------

        return new GenericCollectionHolder<>(() -> __withALimit(collection, 0, endingIndex, maximumIndex));
    }

    //#endregion -------------------- from, to, limit --------------------

    //#endregion -------------------- Core methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T> @NotNull @Unmodifiable List<T> __all(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                            final int size) {
        @SuppressWarnings("unchecked cast") final var reversedArray = (T[]) new Object[size];
        var index = size;
        while (--index >= 0)
            reversedArray[index] = collection.get(index);
        return List.of(reversedArray);
    }

    private static <T> @NotNull @Unmodifiable List<T> __withStartingIndex(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                          final int startingIndex,
                                                                          final int size) {
        @SuppressWarnings("unchecked cast") final var reversedArray = (T[]) new Object[size - startingIndex];
        var index = size - 1;
        while (--index >= startingIndex)
            reversedArray[index] = collection.get(index);
        return List.of(reversedArray);
    }

    private static <T> @NotNull @Unmodifiable List<T> __withStaringAndEndingIndex(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                                  final int startingIndex,
                                                                                  final int endingIndex) {
        @SuppressWarnings("unchecked cast") final var reversedArray = (T[]) new Object[endingIndex - startingIndex];
        var indexAdded = -1;
        var index = endingIndex + 1;
        while (--index >= startingIndex)
            reversedArray[++indexAdded] = collection.get(index);
        return List.of(reversedArray);
    }


    private static <T> @NotNull @Unmodifiable List<T> __withALimit(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                   final int startingIndex,
                                                                   final int endingIndex,
                                                                   final int maximumIndex) {
        @SuppressWarnings("unchecked cast") final var reversedArray = (T[]) new Object[maximumIndex];
        var index = endingIndex + 1;
        while (--index >= startingIndex) {
            if (index >= maximumIndex)
                return List.of(reversedArray);
            reversedArray[index] = collection.get(index);
        }

        //We create a new array from 0 to the ending index since it hasn't reached the maximum index
        @SuppressWarnings("unchecked cast") final var reversedArray2 = (T[]) new Object[endingIndex];
        var index2 = endingIndex + 1;
        while (--index2 > 0)
            reversedArray2[index2] = reversedArray[index2];
        return List.of(reversedArray2);
    }

    //#endregion -------------------- Loop methods --------------------

}

package joookiwi.collection.java.method;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.CommonContracts;
import joookiwi.collection.java.GenericCollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.CanReceiveNegativeValue;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.IndexOutOfBoundsException;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.exception.InvalidIndexRangeException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.emptyCollectionHolder;

@NotNullByDefault
public final class ToReverse
        extends UtilityWithIndex {

    @Contract(CommonContracts.ALWAYS_FAIL_0)
    private ToReverse() { throw new ImpossibleConstructionException("The utility class “ToReverse” cannot be constructed.", ToReverse.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// Reverse the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>        The `collection` type
    /// @see java.util.SequencedCollection#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> @NotNull CollectionHolder<T> toReverse(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return emptyCollectionHolder();
        return __core(collection);
    }

    /// Reverse the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param <T>        The `collection` type
    /// @see java.util.SequencedCollection#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> @NotNull CollectionHolder<T> toReverse(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return emptyCollectionHolder();
        return __core(collection);
    }

    /// Reverse the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param <T>        The `collection` type
    /// @see java.util.SequencedCollection#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> @NotNull CollectionHolder<T> toReverse(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return emptyCollectionHolder();
        return __core(collection);
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- from --------------------

    /// Reverse the `collection`
    /// from a start _(if provided)_
    /// to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see java.util.SequencedCollection#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> @NotNull CollectionHolder<T> toReverse(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                      final @Nullable Integer fromIndex) {
        if (collection == null)
            return emptyCollectionHolder();
        if (fromIndex == null)
            return __core(collection);
        return __core(collection, fromIndex);
    }

    /// Reverse the `collection`
    /// from a start _(if provided)_
    /// to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see java.util.SequencedCollection#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> @NotNull CollectionHolder<T> toReverse(final @Nullable CollectionHolder<? extends T> collection,
                                                                                      final @Nullable Integer fromIndex) {
        if (collection == null)
            return emptyCollectionHolder();
        if (fromIndex == null)
            return __core(collection);
        return __core(collection, fromIndex);
    }

    /// Reverse the `collection`
    /// from a start _(if provided)_
    /// to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see java.util.SequencedCollection#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> @NotNull CollectionHolder<T> toReverse(final T @Nullable @Unmodifiable [] collection,
                                                                                      final @Nullable Integer fromIndex) {
        if (collection == null)
            return emptyCollectionHolder();
        if (fromIndex == null)
            return __core(collection);
        return __core(collection, fromIndex);
    }


    /// Reverse the `collection`
    /// from a start
    /// to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see java.util.SequencedCollection#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> @NotNull CollectionHolder<T> toReverse(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                      final int fromIndex) {
        if (collection == null)
            return emptyCollectionHolder();
        return __core(collection, fromIndex);
    }

    /// Reverse the `collection`
    /// from a start
    /// to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see java.util.SequencedCollection#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> @NotNull CollectionHolder<T> toReverse(final @Nullable CollectionHolder<? extends T> collection,
                                                                                      final int fromIndex) {
        if (collection == null)
            return emptyCollectionHolder();
        return __core(collection, fromIndex);
    }

    /// Reverse the `collection`
    /// from a start
    /// to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param fromIndex  The inclusive starting index
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` is not within a valid range
    /// @see java.util.SequencedCollection#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> @NotNull CollectionHolder<T> toReverse(final T @Nullable @Unmodifiable [] collection,
                                                                                      final int fromIndex) {
        if (collection == null)
            return emptyCollectionHolder();
        return __core(collection, fromIndex);
    }

    //#endregion -------------------- from --------------------
    //#region -------------------- from, to --------------------

    /// Reverse the `collection`
    /// from a start
    /// to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see java.util.SequencedCollection#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> @NotNull CollectionHolder<T> toReverse(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                      final int fromIndex,
                                                                                      final int toIndex) {
        if (collection == null)
            return emptyCollectionHolder();
        return __core(collection, fromIndex, toIndex);
    }

    /// Reverse the `collection`
    /// from a start
    /// to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see java.util.SequencedCollection#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> @NotNull CollectionHolder<T> toReverse(final @Nullable CollectionHolder<? extends T> collection,
                                                                                      final int fromIndex,
                                                                                      final int toIndex) {
        if (collection == null)
            return emptyCollectionHolder();
        return __core(collection, fromIndex, toIndex);
    }

    /// Reverse the `collection`
    /// from a start
    /// to an end
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see java.util.SequencedCollection#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> @NotNull CollectionHolder<T> toReverse(final T @Nullable @Unmodifiable [] collection,
                                                                                      final int fromIndex,
                                                                                      final int toIndex) {
        if (collection == null)
            return emptyCollectionHolder();
        return __core(collection, fromIndex, toIndex);
    }


    /// Reverse the `collection`
    /// from a start
    /// to an end _(if provided)_
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see java.util.SequencedCollection#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> @NotNull CollectionHolder<T> toReverse(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                      final int fromIndex,
                                                                                      final @Nullable Integer toIndex) {
        if (collection == null)
            return emptyCollectionHolder();
        if (toIndex == null)
            return __core(collection, fromIndex);
        return __core(collection, fromIndex, toIndex);
    }

    /// Reverse the `collection`
    /// from a start
    /// to an end _(if provided)_
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see java.util.SequencedCollection#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> @NotNull CollectionHolder<T> toReverse(final @Nullable CollectionHolder<? extends T> collection,
                                                                                      final int fromIndex,
                                                                                      final @Nullable Integer toIndex) {
        if (collection == null)
            return emptyCollectionHolder();
        if (toIndex == null)
            return __core(collection, fromIndex);
        return __core(collection, fromIndex, toIndex);
    }

    /// Reverse the `collection`
    /// from a start
    /// to an end _(if provided)_
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see java.util.SequencedCollection#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> @NotNull CollectionHolder<T> toReverse(final T @Nullable @Unmodifiable [] collection,
                                                                                      final int fromIndex,
                                                                                      final @Nullable Integer toIndex) {
        if (collection == null)
            return emptyCollectionHolder();
        if (toIndex == null)
            return __core(collection, fromIndex);
        return __core(collection, fromIndex, toIndex);
    }


    /// Reverse the `collection`
    /// from a start _(if provided)_
    /// to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see java.util.SequencedCollection#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> @NotNull CollectionHolder<T> toReverse(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                      final @Nullable Integer fromIndex,
                                                                                      final int toIndex) {
        if (collection == null)
            return emptyCollectionHolder();
        if (fromIndex == null)
            return __coreWithNoFrom(collection, toIndex);
        return __core(collection, fromIndex, toIndex);
    }

    /// Reverse the `collection`
    /// from a start _(if provided)_
    /// to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see java.util.SequencedCollection#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> @NotNull CollectionHolder<T> toReverse(final @Nullable CollectionHolder<? extends T> collection,
                                                                                      final @Nullable Integer fromIndex,
                                                                                      final int toIndex) {
        if (collection == null)
            return emptyCollectionHolder();
        if (fromIndex == null)
            return __coreWithNoFrom(collection, toIndex);
        return __core(collection, fromIndex, toIndex);
    }

    /// Reverse the `collection`
    /// from a start _(if provided)_
    /// to an end
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see java.util.SequencedCollection#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> @NotNull CollectionHolder<T> toReverse(final T @Nullable @Unmodifiable [] collection,
                                                                                      final @Nullable Integer fromIndex,
                                                                                      final int toIndex) {
        if (collection == null)
            return emptyCollectionHolder();
        if (fromIndex == null)
            return __coreWithNoFrom(collection, toIndex);
        return __core(collection, fromIndex, toIndex);
    }


    /// Reverse the `collection`
    /// from a start _(if provided)_
    /// to an end _(if provided)_
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see java.util.SequencedCollection#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> @NotNull CollectionHolder<T> toReverse(final @Nullable MinimalistCollectionHolder<? extends T> collection,
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

    /// Reverse the `collection`
    /// from a start _(if provided)_
    /// to an end _(if provided)_
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see java.util.SequencedCollection#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> @NotNull CollectionHolder<T> toReverse(final @Nullable CollectionHolder<? extends T> collection,
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

    /// Reverse the `collection`
    /// from a start _(if provided)_
    /// to an end _(if provided)_
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param fromIndex  The inclusive starting index
    /// @param toIndex    The inclusive ending index
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `fromIndex` or `toIndex` are not within a valid range
    /// @see java.util.SequencedCollection#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> @NotNull CollectionHolder<T> toReverse(final T @Nullable @Unmodifiable [] collection,
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

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Core methods --------------------

    //#region -------------------- ∅ --------------------

    private static <T extends @Nullable Object> @NotNull CollectionHolder<T> __core(final @NotNull MinimalistCollectionHolder<? extends T> collection) {
        final var size = collection.size();
        if (size == 0)
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(() -> __all(collection, size));
    }

    private static <T extends @Nullable Object> @NotNull CollectionHolder<T> __core(final @NotNull CollectionHolder<? extends T> collection) {
        if (collection.isEmpty())
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(() -> __all(collection, collection.size()));
    }

    private static <T extends @Nullable Object> @NotNull CollectionHolder<T> __core(final T @NotNull @Unmodifiable [] collection) {
        final var size = collection.length;
        if (size == 0)
            return emptyCollectionHolder();
        return new GenericCollectionHolder<>(() -> __all(collection, size));
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- from --------------------

    private static <T extends @Nullable Object> @NotNull CollectionHolder<T> __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                                    final int fromIndex) {
        final var size = collection.size();
        if (size == 0)
            return emptyCollectionHolder();

        final var startingIndex = _startingIndex(fromIndex, size);
        return new GenericCollectionHolder<>(() -> __withAStartingIndex(collection, startingIndex, size));
    }

    private static <T extends @Nullable Object> @NotNull CollectionHolder<T> __core(final @NotNull CollectionHolder<? extends T> collection,
                                                                                    final int fromIndex) {
        if (collection.isEmpty())
            return emptyCollectionHolder();

        final var size = collection.size();
        final var startingIndex = _startingIndex(fromIndex, size);
        return new GenericCollectionHolder<>(() -> __withAStartingIndex(collection, startingIndex, size));
    }

    private static <T extends @Nullable Object> @NotNull CollectionHolder<T> __core(final T @NotNull @Unmodifiable [] collection,
                                                                                    final int fromIndex) {
        final var size = collection.length;
        if (size == 0)
            return emptyCollectionHolder();

        final var startingIndex = _startingIndex(fromIndex, size);
        return new GenericCollectionHolder<>(() -> __withAStartingIndex(collection, startingIndex, size));
    }

    //#endregion -------------------- from --------------------
    //#region -------------------- from, to --------------------

    private static <T extends @Nullable Object> @NotNull CollectionHolder<T> __core(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                                    final int fromIndex,
                                                                                    final int toIndex) {
        final var size = collection.size();
        if (size == 0)
            return emptyCollectionHolder();

        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            throw new InvalidIndexRangeException("Invalid index range. The ending index “" + toIndex + '”' + (toIndex == startingIndex ? "" : " (“" + startingIndex + "” after calculation)") + " is over the starting index “" + fromIndex + '”' + (fromIndex == endingIndex ? "" : " (“" + endingIndex + "” after calculation") + '.', fromIndex, toIndex);
        return new GenericCollectionHolder<>(() -> __withAStartingAndEndingIndex(collection, startingIndex, endingIndex));
    }

    private static <T extends @Nullable Object> @NotNull CollectionHolder<T> __core(final @NotNull CollectionHolder<? extends T> collection,
                                                                                    final int fromIndex,
                                                                                    final int toIndex) {
        if (collection.isEmpty())
            return emptyCollectionHolder();

        final var size = collection.size();
        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            throw new InvalidIndexRangeException("Invalid index range. The ending index “" + toIndex + '”' + (toIndex == startingIndex ? "" : " (“" + startingIndex + "” after calculation)") + " is over the starting index “" + fromIndex + '”' + (fromIndex == endingIndex ? "" : " (“" + endingIndex + "” after calculation") + '.', fromIndex, toIndex);
        return new GenericCollectionHolder<>(() -> __withAStartingAndEndingIndex(collection, startingIndex, endingIndex));
    }

    private static <T extends @Nullable Object> @NotNull CollectionHolder<T> __core(final T @NotNull @Unmodifiable [] collection,
                                                                                    final int fromIndex,
                                                                                    final int toIndex) {
        final var size = collection.length;
        if (size == 0)
            return emptyCollectionHolder();

        final var startingIndex = _startingIndex(fromIndex, size);
        final var endingIndex = _endingIndex(toIndex, size);
        if (endingIndex < startingIndex)
            throw new InvalidIndexRangeException("Invalid index range. The ending index “" + toIndex + '”' + (toIndex == startingIndex ? "" : " (“" + startingIndex + "” after calculation)") + " is over the starting index “" + fromIndex + '”' + (fromIndex == endingIndex ? "" : " (“" + endingIndex + "” after calculation") + '.', fromIndex, toIndex);
        return new GenericCollectionHolder<>(() -> __withAStartingAndEndingIndex(collection, startingIndex, endingIndex));
    }

    //#endregion -------------------- from, to --------------------
    //#region -------------------- to --------------------

    private static <T extends @Nullable Object> @NotNull CollectionHolder<T> __coreWithNoFrom(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                                              final int toIndex) {
        final var size = collection.size();
        if (size == 0)
            return emptyCollectionHolder();
        final var endingIndex = _endingIndex(toIndex, size);
        return new GenericCollectionHolder<>(() -> __withAStartingAndEndingIndex(collection, 0, endingIndex));
    }

    private static <T extends @Nullable Object> @NotNull CollectionHolder<T> __coreWithNoFrom(final @NotNull CollectionHolder<? extends T> collection,
                                                                                              final int toIndex) {
        if (collection.isEmpty())
            return emptyCollectionHolder();
        final var endingIndex = _endingIndex(toIndex, collection.size());
        return new GenericCollectionHolder<>(() -> __withAStartingAndEndingIndex(collection, 0, endingIndex));
    }

    private static <T extends @Nullable Object> @NotNull CollectionHolder<T> __coreWithNoFrom(final T @NotNull @Unmodifiable [] collection,
                                                                                              final int toIndex) {
        final var size = collection.length;
        if (size == 0)
            return emptyCollectionHolder();
        final var endingIndex = _endingIndex(toIndex, size);
        return new GenericCollectionHolder<>(() -> __withAStartingAndEndingIndex(collection, 0, endingIndex));
    }

    //#endregion -------------------- to --------------------

    //#endregion -------------------- Core methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T extends @Nullable Object> T @NotNull @Unmodifiable [] __all(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                                  final int size) {
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[size];
        var index = size;
        while (--index >= 0)
            newArray[index] = collection.get(index);
        return newArray;
    }

    private static <T extends @Nullable Object> T @NotNull @Unmodifiable [] __all(final T @NotNull @Unmodifiable [] collection,
                                                                                  final int size) {
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[size];
        var index = size;
        while (--index >= 0)
            newArray[index] = collection[index];
        return newArray;
    }


    private static <T extends @Nullable Object> T @NotNull @Unmodifiable [] __withAStartingIndex(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                                                 final int startingIndex,
                                                                                                 final int size) {
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[size - startingIndex];
        var indexAdded = -1;
        var index = size - 1;
        while (--index >= startingIndex)
            newArray[++indexAdded] = collection.get(index);
        return newArray;
    }

    private static <T extends @Nullable Object> T @NotNull @Unmodifiable [] __withAStartingIndex(final T @NotNull @Unmodifiable [] collection,
                                                                                                 final int startingIndex,
                                                                                                 final int size) {
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[size - startingIndex];
        var indexAdded = -1;
        var index = size - 1;
        while (--index >= startingIndex)
            newArray[++indexAdded] = collection[index];
        return newArray;
    }


    private static <T extends @Nullable Object> T @NotNull @Unmodifiable [] __withAStartingAndEndingIndex(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                                                                                          final int startingIndex,
                                                                                                          final int endingIndex) {
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[endingIndex - startingIndex];
        var indexAdded = -1;
        var index = endingIndex + 1;
        while (--index >= startingIndex)
            newArray[++indexAdded] = collection.get(index);
        return newArray;
    }

    private static <T extends @Nullable Object> T @NotNull @Unmodifiable [] __withAStartingAndEndingIndex(final T @NotNull @Unmodifiable [] collection,
                                                                                                          final int startingIndex,
                                                                                                          final int endingIndex) {
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[endingIndex - startingIndex];
        var indexAdded = -1;
        var index = endingIndex + 1;
        while (--index >= startingIndex)
            newArray[++indexAdded] = collection[index];
        return newArray;
    }

    //#endregion -------------------- Loop methods --------------------

}

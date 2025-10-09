package joookiwi.collection.java.method;

import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.EmptyCollectionHolder;
import joookiwi.collection.java.GenericCollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.CanReceiveNegativeValue;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.IndexOutOfBoundsException;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.exception.InvalidIndexRangeException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class ToReverse
        extends UtilityWithIndex {

    @Contract(ALWAYS_FAIL_0)
    private ToReverse() { throw new ImpossibleConstructionException("The utility class “ToReverse” cannot be constructed.", ToReverse.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// Reverse the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>        The `collection` type
    /// @see java.util.SequencedCollection#reversed()
    /// @see java.util.List#reversed()
    /// @see java.util.SequencedSet#reversed()
    /// @see java.util.Deque#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> CollectionHolder<T> toReverse(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();
        return __core(collection);
    }

    /// Reverse the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param <T>        The `collection` type
    /// @see java.util.SequencedCollection#reversed()
    /// @see java.util.List#reversed()
    /// @see java.util.SequencedSet#reversed()
    /// @see java.util.Deque#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> CollectionHolder<T> toReverse(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();
        return __core(collection);
    }

    /// Reverse the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param <T>        The `collection` type
    /// @see java.util.SequencedCollection#reversed()
    /// @see java.util.List#reversed()
    /// @see java.util.SequencedSet#reversed()
    /// @see java.util.Deque#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> CollectionHolder<T> toReverse(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();
        return __core(collection);
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- from --------------------

    /// Reverse the `collection`
    /// from a start _(if provided)_
    /// to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` is not within a valid range
    /// @see java.util.SequencedCollection#reversed()
    /// @see java.util.List#reversed()
    /// @see java.util.SequencedSet#reversed()
    /// @see java.util.Deque#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> CollectionHolder<T> toReverse(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                             final @Nullable Integer from) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();
        if (from == null)
            return __core(collection);
        return __core(collection, from);
    }

    /// Reverse the `collection`
    /// from a start _(if provided)_
    /// to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` is not within a valid range
    /// @see java.util.SequencedCollection#reversed()
    /// @see java.util.List#reversed()
    /// @see java.util.SequencedSet#reversed()
    /// @see java.util.Deque#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> CollectionHolder<T> toReverse(final @Nullable CollectionHolder<? extends T> collection,
                                                                             final @Nullable Integer from) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();
        if (from == null)
            return __core(collection);
        return __core(collection, from);
    }

    /// Reverse the `collection`
    /// from a start _(if provided)_
    /// to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` is not within a valid range
    /// @see java.util.SequencedCollection#reversed()
    /// @see java.util.List#reversed()
    /// @see java.util.SequencedSet#reversed()
    /// @see java.util.Deque#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> CollectionHolder<T> toReverse(final T @Nullable @Unmodifiable [] collection,
                                                                             final @Nullable Integer from) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();
        if (from == null)
            return __core(collection);
        return __core(collection, from);
    }


    /// Reverse the `collection`
    /// from a start
    /// to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` is not within a valid range
    /// @see java.util.SequencedCollection#reversed()
    /// @see java.util.List#reversed()
    /// @see java.util.SequencedSet#reversed()
    /// @see java.util.Deque#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> CollectionHolder<T> toReverse(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                             final int from) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();
        return __core(collection, from);
    }

    /// Reverse the `collection`
    /// from a start
    /// to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` is not within a valid range
    /// @see java.util.SequencedCollection#reversed()
    /// @see java.util.List#reversed()
    /// @see java.util.SequencedSet#reversed()
    /// @see java.util.Deque#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> CollectionHolder<T> toReverse(final @Nullable CollectionHolder<? extends T> collection,
                                                                             final int from) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();
        return __core(collection, from);
    }

    /// Reverse the `collection`
    /// from a start
    /// to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` is not within a valid range
    /// @see java.util.SequencedCollection#reversed()
    /// @see java.util.List#reversed()
    /// @see java.util.SequencedSet#reversed()
    /// @see java.util.Deque#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> CollectionHolder<T> toReverse(final T @Nullable @Unmodifiable [] collection,
                                                                             final int from) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();
        return __core(collection, from);
    }

    //#endregion -------------------- from --------------------
    //#region -------------------- from, to --------------------

    /// Reverse the `collection`
    /// from a start
    /// to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>{@link MinimalistCollectionHolder#size size} - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    /// @see java.util.SequencedCollection#reversed()
    /// @see java.util.List#reversed()
    /// @see java.util.SequencedSet#reversed()
    /// @see java.util.Deque#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> CollectionHolder<T> toReverse(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                             final int from,
                                                                             final int to) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();
        return __core(collection, from, to);
    }

    /// Reverse the `collection`
    /// from a start
    /// to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>{@link CollectionHolder#size size} - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    /// @see java.util.SequencedCollection#reversed()
    /// @see java.util.List#reversed()
    /// @see java.util.SequencedSet#reversed()
    /// @see java.util.Deque#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> CollectionHolder<T> toReverse(final @Nullable CollectionHolder<? extends T> collection,
                                                                             final int from,
                                                                             final int to) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();
        return __core(collection, from, to);
    }

    /// Reverse the `collection`
    /// from a start
    /// to an end
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    /// @see java.util.SequencedCollection#reversed()
    /// @see java.util.List#reversed()
    /// @see java.util.SequencedSet#reversed()
    /// @see java.util.Deque#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> CollectionHolder<T> toReverse(final T @Nullable @Unmodifiable [] collection,
                                                                             final int from,
                                                                             final int to) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();
        return __core(collection, from, to);
    }


    /// Reverse the `collection`
    /// from a start
    /// to an end _(if provided)_
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>{@link MinimalistCollectionHolder#size size} - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    /// @see java.util.SequencedCollection#reversed()
    /// @see java.util.List#reversed()
    /// @see java.util.SequencedSet#reversed()
    /// @see java.util.Deque#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> CollectionHolder<T> toReverse(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                             final int from,
                                                                             final @Nullable Integer to) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();
        if (to == null)
            return __core(collection, from);
        return __core(collection, from, to);
    }

    /// Reverse the `collection`
    /// from a start
    /// to an end _(if provided)_
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>{@link CollectionHolder#size size} - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    /// @see java.util.SequencedCollection#reversed()
    /// @see java.util.List#reversed()
    /// @see java.util.SequencedSet#reversed()
    /// @see java.util.Deque#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> CollectionHolder<T> toReverse(final @Nullable CollectionHolder<? extends T> collection,
                                                                             final int from,
                                                                             final @Nullable Integer to) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();
        if (to == null)
            return __core(collection, from);
        return __core(collection, from, to);
    }

    /// Reverse the `collection`
    /// from a start
    /// to an end _(if provided)_
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    /// @see java.util.SequencedCollection#reversed()
    /// @see java.util.List#reversed()
    /// @see java.util.SequencedSet#reversed()
    /// @see java.util.Deque#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> CollectionHolder<T> toReverse(final T @Nullable @Unmodifiable [] collection,
                                                                             final int from,
                                                                             final @Nullable Integer to) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();
        if (to == null)
            return __core(collection, from);
        return __core(collection, from, to);
    }


    /// Reverse the `collection`
    /// from a start _(if provided)_
    /// to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>{@link MinimalistCollectionHolder#size size} - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    /// @see java.util.SequencedCollection#reversed()
    /// @see java.util.List#reversed()
    /// @see java.util.SequencedSet#reversed()
    /// @see java.util.Deque#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> CollectionHolder<T> toReverse(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                             final @Nullable Integer from,
                                                                             final int to) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();
        if (from == null)
            return __coreWithNoFrom(collection, to);
        return __core(collection, from, to);
    }

    /// Reverse the `collection`
    /// from a start _(if provided)_
    /// to an end
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>{@link CollectionHolder#size size} - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    /// @see java.util.SequencedCollection#reversed()
    /// @see java.util.List#reversed()
    /// @see java.util.SequencedSet#reversed()
    /// @see java.util.Deque#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> CollectionHolder<T> toReverse(final @Nullable CollectionHolder<? extends T> collection,
                                                                             final @Nullable Integer from,
                                                                             final int to) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();
        if (from == null)
            return __coreWithNoFrom(collection, to);
        return __core(collection, from, to);
    }

    /// Reverse the `collection`
    /// from a start _(if provided)_
    /// to an end
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    /// @see java.util.SequencedCollection#reversed()
    /// @see java.util.List#reversed()
    /// @see java.util.SequencedSet#reversed()
    /// @see java.util.Deque#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> CollectionHolder<T> toReverse(final T @Nullable @Unmodifiable [] collection,
                                                                             final @Nullable Integer from,
                                                                             final int to) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();
        if (from == null)
            return __coreWithNoFrom(collection, to);
        return __core(collection, from, to);
    }


    /// Reverse the `collection`
    /// from a start _(if provided)_
    /// to an end _(if provided)_
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>{@link MinimalistCollectionHolder#size size} - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    /// @see java.util.SequencedCollection#reversed()
    /// @see java.util.List#reversed()
    /// @see java.util.SequencedSet#reversed()
    /// @see java.util.Deque#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> CollectionHolder<T> toReverse(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                             final @Nullable Integer from,
                                                                             final @Nullable Integer to) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();
        if (to == null)
            if (from == null)
                return __core(collection);
            else
                return __core(collection, from);
        if (from == null)
            return __coreWithNoFrom(collection, to);
        return __core(collection, from, to);
    }

    /// Reverse the `collection`
    /// from a start _(if provided)_
    /// to an end _(if provided)_
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>{@link CollectionHolder#size size} - 1</code> by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    /// @see java.util.SequencedCollection#reversed()
    /// @see java.util.List#reversed()
    /// @see java.util.SequencedSet#reversed()
    /// @see java.util.Deque#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> CollectionHolder<T> toReverse(final @Nullable CollectionHolder<? extends T> collection,
                                                                             final @Nullable Integer from,
                                                                             final @Nullable Integer to) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();
        if (to == null)
            if (from == null)
                return __core(collection);
            else
                return __core(collection, from);
        if (from == null)
            return __coreWithNoFrom(collection, to);
        return __core(collection, from, to);
    }

    /// Reverse the `collection`
    /// from a start _(if provided)_
    /// to an end _(if provided)_
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` type
    /// @throws IndexOutOfBoundsException The `from` or `to` are not within a valid range
    /// @see java.util.SequencedCollection#reversed()
    /// @see java.util.List#reversed()
    /// @see java.util.SequencedSet#reversed()
    /// @see java.util.Deque#reversed()
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/reverse">Javascript MutableArray.reverse()</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/toReversed">Javascript Array.toReversed()</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/reverse.html">Kotlin reverse()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.reverse">C# Reverse()</a>
    @ExtensionFunction
    @CanReceiveNegativeValue
    public static <T extends @Nullable Object> CollectionHolder<T> toReverse(final T @Nullable @Unmodifiable [] collection,
                                                                             final @Nullable Integer from,
                                                                             final @Nullable Integer to) {
        if (collection == null)
            return EmptyCollectionHolder.getInstance();
        if (to == null)
            if (from == null)
                return __core(collection);
            else
                return __core(collection, from);
        if (from == null)
            return __coreWithNoFrom(collection, to);
        return __core(collection, from, to);
    }

    //#endregion -------------------- from, to --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Core methods --------------------

    //#region -------------------- ∅ --------------------

    private static <T extends @Nullable Object> CollectionHolder<T> __core(final MinimalistCollectionHolder<? extends T> collection) {
        final var size = collection.size();
        if (size == 0)
            return EmptyCollectionHolder.getInstance();
        return new GenericCollectionHolder<>(__all(collection, size));
    }

    private static <T extends @Nullable Object> CollectionHolder<T> __core(final CollectionHolder<? extends T> collection) {
        if (collection.isEmpty())
            return EmptyCollectionHolder.getInstance();
        return new GenericCollectionHolder<>(__all(collection, collection.size()));
    }

    private static <T extends @Nullable Object> CollectionHolder<T> __core(final T @Unmodifiable [] collection) {
        final var size = collection.length;
        if (size == 0)
            return EmptyCollectionHolder.getInstance();
        return new GenericCollectionHolder<>(__all(collection, size));
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- from --------------------

    private static <T extends @Nullable Object> CollectionHolder<T> __core(final MinimalistCollectionHolder<? extends T> collection,
                                                                           final int from) {
        final var size = collection.size();
        if (size == 0)
            return EmptyCollectionHolder.getInstance();

        final var startingIndex = _startingIndex(from, size);
        return new GenericCollectionHolder<>(__withAStartingIndex(collection, startingIndex, size));
    }

    private static <T extends @Nullable Object> CollectionHolder<T> __core(final CollectionHolder<? extends T> collection,
                                                                           final int from) {
        if (collection.isEmpty())
            return EmptyCollectionHolder.getInstance();

        final var size = collection.size();
        final var startingIndex = _startingIndex(from, size);
        return new GenericCollectionHolder<>(__withAStartingIndex(collection, startingIndex, size));
    }

    private static <T extends @Nullable Object> CollectionHolder<T> __core(final T @Unmodifiable [] collection,
                                                                           final int from) {
        final var size = collection.length;
        if (size == 0)
            return EmptyCollectionHolder.getInstance();

        final var startingIndex = _startingIndex(from, size);
        return new GenericCollectionHolder<>(__withAStartingIndex(collection, startingIndex, size));
    }

    //#endregion -------------------- from --------------------
    //#region -------------------- from, to --------------------

    private static <T extends @Nullable Object> CollectionHolder<T> __core(final MinimalistCollectionHolder<? extends T> collection,
                                                                           final int from,
                                                                           final int to) {
        final var size = collection.size();
        if (size == 0)
            return EmptyCollectionHolder.getInstance();

        final var startingIndex = _startingIndex(from, size);
        final var endingIndex = _endingIndex(to, size);
        if (endingIndex < startingIndex)
            throw new InvalidIndexRangeException("Invalid index range. The ending index “" + to + '”' + (to == startingIndex ? "" : " (“" + startingIndex + "” after calculation)") + " is over the starting index “" + from + '”' + (from == endingIndex ? "" : " (“" + endingIndex + "” after calculation") + '.', from, to);
        return new GenericCollectionHolder<>(__withAStartingAndEndingIndex(collection, startingIndex, endingIndex));
    }

    private static <T extends @Nullable Object> CollectionHolder<T> __core(final CollectionHolder<? extends T> collection,
                                                                           final int from,
                                                                           final int to) {
        if (collection.isEmpty())
            return EmptyCollectionHolder.getInstance();

        final var size = collection.size();
        final var startingIndex = _startingIndex(from, size);
        final var endingIndex = _endingIndex(to, size);
        if (endingIndex < startingIndex)
            throw new InvalidIndexRangeException("Invalid index range. The ending index “" + to + '”' + (to == startingIndex ? "" : " (“" + startingIndex + "” after calculation)") + " is over the starting index “" + from + '”' + (from == endingIndex ? "" : " (“" + endingIndex + "” after calculation") + '.', from, to);
        return new GenericCollectionHolder<>(__withAStartingAndEndingIndex(collection, startingIndex, endingIndex));
    }

    private static <T extends @Nullable Object> CollectionHolder<T> __core(final T @Unmodifiable [] collection,
                                                                           final int from,
                                                                           final int to) {
        final var size = collection.length;
        if (size == 0)
            return EmptyCollectionHolder.getInstance();

        final var startingIndex = _startingIndex(from, size);
        final var endingIndex = _endingIndex(to, size);
        if (endingIndex < startingIndex)
            throw new InvalidIndexRangeException("Invalid index range. The ending index “" + to + '”' + (to == startingIndex ? "" : " (“" + startingIndex + "” after calculation)") + " is over the starting index “" + from + '”' + (from == endingIndex ? "" : " (“" + endingIndex + "” after calculation") + '.', from, to);
        return new GenericCollectionHolder<>(__withAStartingAndEndingIndex(collection, startingIndex, endingIndex));
    }

    //#endregion -------------------- from, to --------------------
    //#region -------------------- to --------------------

    private static <T extends @Nullable Object> CollectionHolder<T> __coreWithNoFrom(final MinimalistCollectionHolder<? extends T> collection,
                                                                                     final int to) {
        final var size = collection.size();
        if (size == 0)
            return EmptyCollectionHolder.getInstance();
        final var endingIndex = _endingIndex(to, size);
        return new GenericCollectionHolder<>(__withAStartingAndEndingIndex(collection, 0, endingIndex));
    }

    private static <T extends @Nullable Object> CollectionHolder<T> __coreWithNoFrom(final CollectionHolder<? extends T> collection,
                                                                                     final int to) {
        if (collection.isEmpty())
            return EmptyCollectionHolder.getInstance();
        final var endingIndex = _endingIndex(to, collection.size());
        return new GenericCollectionHolder<>(__withAStartingAndEndingIndex(collection, 0, endingIndex));
    }

    private static <T extends @Nullable Object> CollectionHolder<T> __coreWithNoFrom(final T @Unmodifiable [] collection,
                                                                                     final int to) {
        final var size = collection.length;
        if (size == 0)
            return EmptyCollectionHolder.getInstance();
        final var endingIndex = _endingIndex(to, size);
        return new GenericCollectionHolder<>(__withAStartingAndEndingIndex(collection, 0, endingIndex));
    }

    //#endregion -------------------- to --------------------

    //#endregion -------------------- Core methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T extends @Nullable Object> T @Unmodifiable [] __all(final MinimalistCollectionHolder<? extends T> collection,
                                                                         final int size) {
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[size];
        var index = size;
        while (--index >= 0)
            newArray[index] = collection.get(index);
        return newArray;
    }

    private static <T extends @Nullable Object> T @Unmodifiable [] __all(final T @Unmodifiable [] collection,
                                                                         final int size) {
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[size];
        var index = size;
        while (--index >= 0)
            newArray[index] = collection[index];
        return newArray;
    }


    private static <T extends @Nullable Object> T @Unmodifiable [] __withAStartingIndex(final MinimalistCollectionHolder<? extends T> collection,
                                                                                        final int startingIndex,
                                                                                        final int size) {
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[size - startingIndex];
        var indexAdded = -1;
        var index = size - 1;
        while (--index >= startingIndex)
            newArray[++indexAdded] = collection.get(index);
        return newArray;
    }

    private static <T extends @Nullable Object> T @Unmodifiable [] __withAStartingIndex(final T @Unmodifiable [] collection,
                                                                                        final int startingIndex,
                                                                                        final int size) {
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[size - startingIndex];
        var indexAdded = -1;
        var index = size - 1;
        while (--index >= startingIndex)
            newArray[++indexAdded] = collection[index];
        return newArray;
    }


    private static <T extends @Nullable Object> T @Unmodifiable [] __withAStartingAndEndingIndex(final MinimalistCollectionHolder<? extends T> collection,
                                                                                                 final int startingIndex,
                                                                                                 final int endingIndex) {
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[endingIndex - startingIndex];
        var indexAdded = -1;
        var index = endingIndex + 1;
        while (--index >= startingIndex)
            newArray[++indexAdded] = collection.get(index);
        return newArray;
    }

    private static <T extends @Nullable Object> T @Unmodifiable [] __withAStartingAndEndingIndex(final T @Unmodifiable [] collection,
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

package joookiwi.collection.java.method;

import java.util.function.BooleanSupplier;
import java.util.function.Predicate;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntPredicate;
import joookiwi.collection.java.exception.EmptyCollectionException;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.exception.IndexOutOfBoundsException;
import joookiwi.collection.java.exception.NullCollectionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FAIL_1;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FAIL_2;

@NotNullByDefault
public final class Last
        extends AliasUtility {

    @Contract(ALWAYS_FAIL_0)
    private Last() { throw new ImpossibleConstructionException("The utility class “Last” cannot be constructed.", Last.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// Get the last element in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException  The `collection` was `null`
    /// @throws EmptyCollectionException The `collection` **is empty**
    /// @see java.util.SequencedCollection#getLast()
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_1)
    public static <T> T last(final @Nullable MinimalistCollectionHolder<? extends T> collection) { return GetLast.getLast(collection); }

    /// Get the last element in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException  The `collection` was `null`
    /// @throws EmptyCollectionException The `collection` [is empty][CollectionHolder#isEmpty]
    /// @see java.util.SequencedCollection#getLast()
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_1)
    public static <T> T last(final @Nullable CollectionHolder<? extends T> collection) { return GetLast.getLast(collection); }

    /// Get the last element in the current `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException  The `collection` was `null`
    /// @throws EmptyCollectionException The `collection` **is empty**
    /// @see java.util.SequencedCollection#getLast()
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_1)
    public static <T> T last(final T @Nullable @Unmodifiable [] collection) { return GetLast.getLast(collection); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- predicate (T, int) → boolean --------------------

    /// Get the last element in the current `collection`
    /// matching the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T last(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                             final @Nullable ObjIntPredicate<? super T> predicate) {
        if (predicate == null)
            return GetLast.getLast(collection);
        return FindLast.findLast(collection, predicate);
    }

    /// Get the last element in the current `collection`
    /// matching the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` [is empty][#isEmpty]
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T last(final @Nullable CollectionHolder<? extends T> collection,
                             final @Nullable ObjIntPredicate<? super T> predicate) {
        if (predicate == null)
            return GetLast.getLast(collection);
        return FindLast.findLast(collection, predicate);
    }

    /// Get the last element in the current `collection`
    /// matching the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T last(final T @Nullable @Unmodifiable [] collection,
                             final @Nullable ObjIntPredicate<? super T> predicate) {
        if (predicate == null)
            return GetLast.getLast(collection);
        return FindLast.findLast(collection, predicate);
    }

    //#endregion -------------------- predicate (T, int) → boolean --------------------
    //#region -------------------- predicate (T) → boolean --------------------

    /// Get the last element in the current `collection`
    /// matching the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T last(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                             final @Nullable Predicate<? super T> predicate) {
        if (predicate == null)
            return GetLast.getLast(collection);
        return FindLast.findLast(collection, predicate);
    }

    /// Get the last element in the current `collection`
    /// matching the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` [is empty][#isEmpty]
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T last(final @Nullable CollectionHolder<? extends T> collection,
                             final @Nullable Predicate<? super T> predicate) {
        if (predicate == null)
            return GetLast.getLast(collection);
        return FindLast.findLast(collection, predicate);
    }

    /// Get the last element in the current `collection`
    /// matching the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T last(final T @Nullable @Unmodifiable [] collection,
                             final @Nullable Predicate<? super T> predicate) {
        if (predicate == null)
            return GetLast.getLast(collection);
        return FindLast.findLast(collection, predicate);
    }

    //#endregion -------------------- predicate (T) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /// Get the last element in the current `collection`
    /// matching the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T last(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                             final @Nullable BooleanSupplier predicate) {
        if (predicate == null)
            return GetLast.getLast(collection);
        return FindLast.findLast(collection, predicate);
    }

    /// Get the last element in the current `collection`
    /// matching the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` [is empty][#isEmpty]
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T last(final @Nullable CollectionHolder<? extends T> collection,
                             final @Nullable BooleanSupplier predicate) {
        if (predicate == null)
            return GetLast.getLast(collection);
        return FindLast.findLast(collection, predicate);
    }

    /// Get the last element in the current `collection`
    /// matching the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/last.html">Kotlin last()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.last">C# Last()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T last(final T @Nullable @Unmodifiable [] collection,
                             final @Nullable BooleanSupplier predicate) {
        if (predicate == null)
            return GetLast.getLast(collection);
        return FindLast.findLast(collection, predicate);
    }

    //#endregion -------------------- predicate () → boolean --------------------

    //#endregion -------------------- Facade methods --------------------

}

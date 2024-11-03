package joookiwi.collection.java.method;

import java.util.function.BooleanSupplier;
import java.util.function.IntPredicate;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.IntObjPredicate;
import joookiwi.collection.java.exception.EmptyCollectionException;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.exception.IndexOutOfBoundsException;
import joookiwi.collection.java.exception.NullCollectionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FAIL_1;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FAIL_2;

@NotNullByDefault
public final class FirstIndexed
        extends AliasUtility {

    @Contract(ALWAYS_FAIL_0)
    private FirstIndexed() { throw new ImpossibleConstructionException("The utility class “FirstIndexed” cannot be constructed.", FirstIndexed.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ ---------------------

    /// Get the first element in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException  The `collection` was `null`
    /// @throws EmptyCollectionException The `collection` **is empty**
    /// @see java.util.SequencedCollection#getFirst()
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_1)
    public static <T> @NotNull T firstIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection) { return GetFirst.getFirst(collection); }

    /// Get the first element in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException  The `collection` was `null`
    /// @throws EmptyCollectionException The `collection` [is empty][CollectionHolder#isEmpty]
    /// @see java.util.SequencedCollection#getFirst()
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_1)
    public static <T> @NotNull T firstIndexed(final @Nullable CollectionHolder<? extends T> collection) { return GetFirst.getFirst(collection); }

    /// Get the first element in the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException  The `collection` was `null`
    /// @throws EmptyCollectionException The `collection` **is empty**
    /// @see java.util.SequencedCollection#getFirst()
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first()</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First()</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_1)
    public static <T> @NotNull T firstIndexed(final T @Nullable @Unmodifiable [] collection) { return GetFirst.getFirst(collection); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- predicate (int, T) → boolean --------------------

    /// Get the first element found in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T firstIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable IntObjPredicate<? super T> predicate) {
        if (predicate == null)
            return GetFirst.getFirst(collection);
        return FindFirstIndexed.findFirstIndexed(collection, predicate);
    }

    /// Get the first element found in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T firstIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable IntObjPredicate<? super T> predicate) {
        if (predicate == null)
            return GetFirst.getFirst(collection);
        return FindFirstIndexed.findFirstIndexed(collection, predicate);
    }

    /// Get the first element found in the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T firstIndexed(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable IntObjPredicate<? super T> predicate) {
        if (predicate == null)
            return GetFirst.getFirst(collection);
        return FindFirstIndexed.findFirstIndexed(collection, predicate);
    }

    //#endregion -------------------- predicate (int, T) → boolean --------------------
    //#region -------------------- predicate (int) → boolean --------------------

    /// Get the first element found in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T firstIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable IntPredicate predicate) {
        if (predicate == null)
            return GetFirst.getFirst(collection);
        return FindFirstIndexed.findFirstIndexed(collection, predicate);
    }

    /// Get the first element found in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T firstIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable IntPredicate predicate) {
        if (predicate == null)
            return GetFirst.getFirst(collection);
        return FindFirstIndexed.findFirstIndexed(collection, predicate);
    }

    /// Get the first element found in the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T firstIndexed(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable IntPredicate predicate) {
        if (predicate == null)
            return GetFirst.getFirst(collection);
        return FindFirstIndexed.findFirstIndexed(collection, predicate);
    }

    //#endregion -------------------- predicate (int) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /// Get the first element found in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T firstIndexed(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                     final @Nullable BooleanSupplier predicate) {
        if (predicate == null)
            return GetFirst.getFirst(collection);
        return FindFirstIndexed.findFirstIndexed(collection, predicate);
    }

    /// Get the first element found in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T firstIndexed(final @Nullable CollectionHolder<? extends T> collection,
                                     final @Nullable BooleanSupplier predicate) {
        if (predicate == null)
            return GetFirst.getFirst(collection);
        return FindFirstIndexed.findFirstIndexed(collection, predicate);
    }

    /// Get the first element found in the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T firstIndexed(final T @Nullable @Unmodifiable [] collection,
                                     final @Nullable BooleanSupplier predicate) {
        if (predicate == null)
            return GetFirst.getFirst(collection);
        return FindFirstIndexed.findFirstIndexed(collection, predicate);
    }

    //#endregion -------------------- predicate () → boolean --------------------

    //#endregion -------------------- Facade methods --------------------

}

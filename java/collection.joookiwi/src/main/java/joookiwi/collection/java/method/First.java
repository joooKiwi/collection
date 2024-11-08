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
public final class First
        extends AliasUtility {

    @Contract(ALWAYS_FAIL_0)
    private First() { throw new ImpossibleConstructionException("The utility class “First” cannot be constructed.", First.class); }

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
    public static <T> T first(final @Nullable MinimalistCollectionHolder<? extends T> collection) { return GetFirst.getFirst(collection); }

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
    public static <T> T first(final @Nullable CollectionHolder<? extends T> collection) { return GetFirst.getFirst(collection); }

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
    public static <T> T first(final T @Nullable @Unmodifiable [] collection) { return GetFirst.getFirst(collection); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- predicate (T, int) → boolean --------------------

    /// Find the first element from the `predicate` in the `collection`
    /// matching the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T first(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                              final @Nullable ObjIntPredicate<? super T> predicate) {
        if (predicate == null)
            return GetFirst.getFirst(collection);
        return FindFirst.findFirst(collection, predicate);
    }

    /// Get the first element in the `collection`
    /// matching the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T first(final @Nullable CollectionHolder<? extends T> collection,
                              final @Nullable ObjIntPredicate<? super T> predicate) {
        if (predicate == null)
            return GetFirst.getFirst(collection);
        return FindFirst.findFirst(collection, predicate);
    }

    /// Get the first element in the `collection`
    /// matching the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T first(final T @Nullable @Unmodifiable [] collection,
                              final @Nullable ObjIntPredicate<? super T> predicate) {
        if (predicate == null)
            return GetFirst.getFirst(collection);
        return FindFirst.findFirst(collection, predicate);
    }

    //#endregion -------------------- predicate (T, int) → boolean --------------------
    //#region -------------------- predicate (T) → boolean --------------------

    /// Get the first element in the `collection`
    /// matching the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T first(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                              final @Nullable Predicate<? super T> predicate) {
        if (predicate == null)
            return GetFirst.getFirst(collection);
        return FindFirst.findFirst(collection, predicate);
    }

    /// Get the first element in the `collection`
    /// matching the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T first(final @Nullable CollectionHolder<? extends T> collection,
                              final @Nullable Predicate<? super T> predicate) {
        if (predicate == null)
            return GetFirst.getFirst(collection);
        return FindFirst.findFirst(collection, predicate);
    }

    /// Get the first element in the `collection`
    /// matching the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T first(final T @Nullable @Unmodifiable [] collection,
                              final @Nullable Predicate<? super T> predicate) {
        if (predicate == null)
            return GetFirst.getFirst(collection);
        return FindFirst.findFirst(collection, predicate);
    }

    //#endregion -------------------- predicate (T) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /// Get the first element in the `collection`
    /// matching the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T first(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                              final @Nullable BooleanSupplier predicate) {
        if (predicate == null)
            return GetFirst.getFirst(collection);
        return FindFirst.findFirst(collection, predicate);
    }

    /// Get the first element in the `collection`
    /// matching the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T first(final @Nullable CollectionHolder<? extends T> collection,
                              final @Nullable BooleanSupplier predicate) {
        if (predicate == null)
            return GetFirst.getFirst(collection);
        return FindFirst.findFirst(collection, predicate);
    }

    /// Get the first element in the `collection`
    /// matching the given `predicate`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The given predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionException   The `collection` was `null`
    /// @throws EmptyCollectionException  The `collection` **is empty**
    /// @throws IndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T first(final T @Nullable @Unmodifiable [] collection,
                              final @Nullable BooleanSupplier predicate) {
        if (predicate == null)
            return GetFirst.getFirst(collection);
        return FindFirst.findFirst(collection, predicate);
    }

    //#endregion -------------------- predicate () → boolean --------------------

    //#endregion -------------------- Facade methods --------------------

}

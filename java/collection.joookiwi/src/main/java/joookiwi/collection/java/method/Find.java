package joookiwi.collection.java.method;

import java.util.function.BooleanSupplier;
import java.util.function.Predicate;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntPredicate;
import joookiwi.collection.java.exception.CollectionHolderIndexOutOfBoundsException;
import joookiwi.collection.java.exception.EmptyCollectionHolderException;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import joookiwi.collection.java.exception.NullCollectionHolderException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FAIL_2;

public final class Find
    extends AliasUtility {

    @Contract(ALWAYS_FAIL_0)
    private Find() { throw new ImpossibleConstructionException("The utility class “Find” cannot be constructed.", Find.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- predicate (T, int) → boolean --------------------

    /// Get the first element found in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionHolderException             The `collection` was `null`
    /// @throws EmptyCollectionHolderException            The `collection` **is empty**
    /// @throws CollectionHolderIndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T find(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                             final @NotNull ObjIntPredicate<? super T> predicate) { return FindFirst.findFirst(collection, predicate); }

    /// Get the first element found in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionHolderException             The `collection` was `null`
    /// @throws EmptyCollectionHolderException            The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws CollectionHolderIndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T find(final @Nullable CollectionHolder<? extends T> collection,
                             final @NotNull ObjIntPredicate<? super T> predicate) { return FindFirst.findFirst(collection, predicate); }

    /// Get the first element found in the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionHolderException             The `collection` was `null`
    /// @throws EmptyCollectionHolderException            The `collection` **is empty**
    /// @throws CollectionHolderIndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T find(final T @Nullable @Unmodifiable [] collection,
                             final @NotNull ObjIntPredicate<? super T> predicate) { return FindFirst.findFirst(collection, predicate); }

    //#endregion -------------------- predicate (T, int) → boolean --------------------
    //#region -------------------- predicate (T) → boolean --------------------

    /// Get the first element found in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionHolderException             The `collection` was `null`
    /// @throws EmptyCollectionHolderException            The `collection` **is empty**
    /// @throws CollectionHolderIndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T find(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                             final @NotNull Predicate<? super T> predicate) { return FindFirst.findFirst(collection, predicate); }

    /// Get the first element found in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionHolderException             The `collection` was `null`
    /// @throws EmptyCollectionHolderException            The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws CollectionHolderIndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T find(final @Nullable CollectionHolder<? extends T> collection,
                             final @NotNull Predicate<? super T> predicate) { return FindFirst.findFirst(collection, predicate); }

    /// Get the first element found in the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionHolderException             The `collection` was `null`
    /// @throws EmptyCollectionHolderException            The `collection` **is empty**
    /// @throws CollectionHolderIndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T find(final T @Nullable @Unmodifiable [] collection,
                             final @NotNull Predicate<? super T> predicate) { return FindFirst.findFirst(collection, predicate); }

    //#endregion -------------------- predicate (T) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /// Get the first element found in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionHolderException             The `collection` was `null`
    /// @throws EmptyCollectionHolderException            The `collection` **is empty**
    /// @throws CollectionHolderIndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T find(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                             final @NotNull BooleanSupplier predicate) { return FindFirst.findFirst(collection, predicate); }

    /// Get the first element found in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionHolderException             The `collection` was `null`
    /// @throws EmptyCollectionHolderException            The `collection` [is empty][CollectionHolder#isEmpty]
    /// @throws CollectionHolderIndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T find(final @Nullable CollectionHolder<? extends T> collection,
                             final @NotNull BooleanSupplier predicate) { return FindFirst.findFirst(collection, predicate); }

    /// Get the first element found in the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param predicate  The matching predicate
    /// @param <T>        The `collection` type
    /// @throws NullCollectionHolderException             The `collection` was `null`
    /// @throws EmptyCollectionHolderException            The `collection` **is empty**
    /// @throws CollectionHolderIndexOutOfBoundsException No element could be found from the `predicate`
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/first.html">Kotlin first(predicate)</a>
    /// @see <a href="https://learn.microsoft.com/dotnet/api/system.linq.enumerable.first">C# First(predicate)</a>
    @ExtensionFunction
    @Contract(IF_1ST_NULL_THEN_FAIL_2)
    public static <T> T find(final T @Nullable @Unmodifiable [] collection,
                             final @NotNull BooleanSupplier predicate) { return FindFirst.findFirst(collection, predicate); }

    //#endregion -------------------- predicate () → boolean --------------------

    //#endregion -------------------- Facade methods --------------------


}

package joookiwi.collection.java.method;

import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_1ST_2;

@NotNullByDefault
public final class OnEach
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private OnEach() { throw new ImpossibleConstructionException("The utility class “OnEach” cannot be constructed.", OnEach.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- predicate (T, int) → boolean --------------------

    /// Perform a given `action` on each element
    /// and return the `collection` afterwards
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param action     The given action
    /// @see Iterable#forEach(Consumer)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">Javascript ReadonlyArray.forEach</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">Javascript ReadonlySet.forEach</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/on-each.html">Kotlin onEach(action)</a>
    @ExtensionFunction
    @Contract(ALWAYS_1ST_2)
    public static <T extends @Nullable Object, COLLECTION extends @Nullable MinimalistCollectionHolder<? extends T>> COLLECTION onEach(final COLLECTION collection,
                                                                                                                                       final @NotNull ObjIntConsumer<? super T> action) {
        if (collection == null)
            return null;

        final var size = collection.size();
        if (size == 0)
            return collection;
        return __with2Argument(collection, action, size);
    }

    /// Perform a given `action` on each element
    /// and return the `collection` afterwards
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param action     The given action
    /// @see Iterable#forEach(Consumer)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">Javascript ReadonlyArray.forEach</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">Javascript ReadonlySet.forEach</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/on-each.html">Kotlin onEach(action)</a>
    @ExtensionFunction
    @Contract(ALWAYS_1ST_2)
    public static <T extends @Nullable Object, COLLECTION extends @Nullable CollectionHolder<? extends T>> COLLECTION onEach(final COLLECTION collection,
                                                                                                                             final @NotNull ObjIntConsumer<? super T> action) {
        if (collection == null)
            return null;
        if (collection.isEmpty())
            return collection;
        return __with2Argument(collection, action, collection.size());
    }

    /// Perform a given `action` on each element
    /// and return the `collection` afterwards
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param action     The given action
    /// @see Iterable#forEach(Consumer)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">Javascript ReadonlyArray.forEach</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">Javascript ReadonlySet.forEach</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/on-each.html">Kotlin onEach(action)</a>
    @ExtensionFunction
    @Contract(ALWAYS_1ST_2)
    public static <T extends @Nullable Object> T @Nullable @Unmodifiable [] __with0Argument(final T @Nullable @Unmodifiable [] collection,
                                                                                            final @NotNull ObjIntConsumer<? super T> action) {
        if (collection == null)
            return null;

        final var size = collection.length;
        if (size == 0)
            return collection;
        return __with2Argument(collection, action, size);
    }

    //#endregion -------------------- predicate (T, int) → boolean --------------------
    //#region -------------------- predicate (T) → boolean --------------------

    /// Perform a given `action` on each element
    /// and return the `collection` afterwards
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param action     The given action
    /// @see Iterable#forEach(Consumer)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">Javascript ReadonlyArray.forEach</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">Javascript ReadonlySet.forEach</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/on-each.html">Kotlin onEach(action)</a>
    @ExtensionFunction
    @Contract(ALWAYS_1ST_2)
    public static <T extends @Nullable Object, COLLECTION extends @Nullable MinimalistCollectionHolder<? extends T>> COLLECTION onEach(final COLLECTION collection,
                                                                                                                                       final @NotNull Consumer<? super T> action) {
        if (collection == null)
            return null;

        final var size = collection.size();
        if (size == 0)
            return collection;
        return __with1Argument(collection, action, size);
    }

    /// Perform a given `action` on each element
    /// and return the `collection` afterwards
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param action     The given action
    /// @see Iterable#forEach(Consumer)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">Javascript ReadonlyArray.forEach</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">Javascript ReadonlySet.forEach</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/on-each.html">Kotlin onEach(action)</a>
    @ExtensionFunction
    @Contract(ALWAYS_1ST_2)
    public static <T extends @Nullable Object, COLLECTION extends @Nullable CollectionHolder<? extends T>> COLLECTION onEach(final COLLECTION collection,
                                                                                                                             final @NotNull Consumer<? super T> action) {
        if (collection == null)
            return null;
        if (collection.isEmpty())
            return collection;
        return __with1Argument(collection, action, collection.size());
    }

    /// Perform a given `action` on each element
    /// and return the `collection` afterwards
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param action     The given action
    /// @see Iterable#forEach(Consumer)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">Javascript ReadonlyArray.forEach</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">Javascript ReadonlySet.forEach</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/on-each.html">Kotlin onEach(action)</a>
    @ExtensionFunction
    @Contract(ALWAYS_1ST_2)
    public static <T extends @Nullable Object> T @Nullable @Unmodifiable [] __with0Argument(final T @Nullable @Unmodifiable [] collection,
                                                                                            final @NotNull Consumer<? super T> action) {
        if (collection == null)
            return null;

        final var size = collection.length;
        if (size == 0)
            return collection;
        return __with1Argument(collection, action, size);
    }
    //#endregion -------------------- predicate (T) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /// Perform a given `action` on each element
    /// and return the `collection` afterwards
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param action     The given action
    /// @see Iterable#forEach(Consumer)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">Javascript ReadonlyArray.forEach</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">Javascript ReadonlySet.forEach</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/on-each.html">Kotlin onEach(action)</a>
    @Contract(ALWAYS_1ST_2)
    public static <T extends @Nullable Object, COLLECTION extends @Nullable MinimalistCollectionHolder<? extends T>> COLLECTION onEach(final COLLECTION collection,
                                                                                                                                       final @NotNull Runnable action) {
        if (collection == null)
            return null;

        final var size = collection.size();
        if (size == 0)
            return collection;
        return __with0Argument(collection, action, size);
    }

    /// Perform a given `action` on each element
    /// and return the `collection` afterwards
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param action     The given action
    /// @see Iterable#forEach(Consumer)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">Javascript ReadonlyArray.forEach</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">Javascript ReadonlySet.forEach</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/on-each.html">Kotlin onEach(action)</a>
    @ExtensionFunction
    @Contract(ALWAYS_1ST_2)
    public static <T extends @Nullable Object, COLLECTION extends @Nullable CollectionHolder<? extends T>> COLLECTION onEach(final COLLECTION collection,
                                                                                                                             final @NotNull Runnable action) {
        if (collection == null)
            return collection;
        if (collection.isEmpty())
            return collection;
        return __with0Argument(collection, action, collection.size());
    }

    /// Perform a given `action` on each element
    /// and return the `collection` afterwards
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param action     The given action
    /// @see Iterable#forEach(Consumer)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">Javascript ReadonlyArray.forEach</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">Javascript ReadonlySet.forEach</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/on-each.html">Kotlin onEach(action)</a>
    @Contract(ALWAYS_1ST_2)
    public static <T extends @Nullable Object> T @Nullable @Unmodifiable [] __with0Argument(final T @Nullable @Unmodifiable [] collection,
                                                                                            final @NotNull Runnable action) {
        if (collection == null)
            return null;

        final var size = collection.length;
        if (size == 0)
            return collection;
        return __with0Argument(collection, action, size);
    }
    //#endregion -------------------- predicate () → boolean --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T extends @Nullable Object, COLLECTION extends MinimalistCollectionHolder<? extends T>> @NotNull COLLECTION __with0Argument(final @NotNull COLLECTION collection,
                                                                                                                                                final @NotNull Runnable action,
                                                                                                                                                final int size) {
        var index = size;
        while (index-- > 0)
            action.run();
        return collection;
    }

    private static <T extends @Nullable Object> T @NotNull @Unmodifiable [] __with0Argument(final T @NotNull @Unmodifiable [] collection,
                                                                                            final @NotNull Runnable action,
                                                                                            final int size) {
        var index = size;
        while (index-- > 0)
            action.run();
        return collection;
    }


    private static <T extends @Nullable Object, COLLECTION extends MinimalistCollectionHolder<? extends T>> @NotNull COLLECTION __with1Argument(final @NotNull COLLECTION collection,
                                                                                                                                                final @NotNull Consumer<? super T> action,
                                                                                                                                                final int size) {
        var index = -1;
        while (++index < size)
            action.accept(collection.get(index));
        return collection;
    }

    private static <T extends @Nullable Object> T @NotNull @Unmodifiable [] __with1Argument(final T @NotNull @Unmodifiable [] collection,
                                                                                            final @NotNull Consumer<? super T> action,
                                                                                            final int size) {
        var index = -1;
        while (++index < size)
            action.accept(collection[index]);
        return collection;
    }


    private static <T extends @Nullable Object, COLLECTION extends MinimalistCollectionHolder<? extends T>> @NotNull COLLECTION __with2Argument(final @NotNull COLLECTION collection,
                                                                                                                                                final @NotNull ObjIntConsumer<? super T> action,
                                                                                                                                                final int size) {
        var index = -1;
        while (++index < size)
            action.accept(collection.get(index), index);
        return collection;
    }

    private static <T extends @Nullable Object> T @NotNull @Unmodifiable [] __with2Argument(final T @NotNull @Unmodifiable [] collection,
                                                                                            final @NotNull ObjIntConsumer<? super T> action,
                                                                                            final int size) {
        var index = -1;
        while (++index < size)
            action.accept(collection[index], index);
        return collection;
    }

    //#endregion -------------------- Loop methods --------------------

}

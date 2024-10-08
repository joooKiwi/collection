package joookiwi.collection.java.method;

import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

public final class ForEach
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private ForEach() { throw new ImpossibleConstructionException("The utility class “ForEach” cannot be constructed.", ForEach.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- predicate (T, int) → boolean --------------------

    /// Perform a given `action` on each element
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param action The given action
    /// @see Iterable#forEach(Consumer)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">Javascript ReadonlyArray.forEach</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">Javascript ReadonlySet.forEach</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each.html">Kotlin forEach(action)</a>
    @ExtensionFunction
    public static <T> void forEach(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                   final @NotNull ObjIntConsumer<? super T> action) {
        if (collection == null)
            return;

        final var size = collection.size();
        if (size == 0)
            return;
        __with2Argument(collection, action, size);
    }

    /// Perform a given `action` on each element
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param action The given action
    /// @see Iterable#forEach(Consumer)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">Javascript ReadonlyArray.forEach</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">Javascript ReadonlySet.forEach</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each.html">Kotlin forEach(action)</a>
    @ExtensionFunction
    public static <T> void forEach(final @Nullable CollectionHolder<? extends T> collection,
                                   final @NotNull ObjIntConsumer<? super T> action) {
        if (collection == null)
            return;
        if (collection.isEmpty())
            return;
        __with2Argument(collection, action, collection.size());
    }

    //#endregion -------------------- predicate (T, int) → boolean --------------------
    //#region -------------------- predicate (T) → boolean --------------------

    /// Perform a given `action` on each element
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param action The given action
    /// @see Iterable#forEach(Consumer)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">Javascript ReadonlyArray.forEach</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">Javascript ReadonlySet.forEach</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each.html">Kotlin forEach(action)</a>
    @ExtensionFunction
    public static <T> void forEach(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                   final @NotNull Consumer<? super T> action) {
        if (collection == null)
            return;

        final var size = collection.size();
        if (size == 0)
            return;
        __with1Argument(collection, action, size);
    }

    /// Perform a given `action` on each element
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param action The given action
    /// @see Iterable#forEach(Consumer)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">Javascript ReadonlyArray.forEach</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">Javascript ReadonlySet.forEach</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each.html">Kotlin forEach(action)</a>
    @ExtensionFunction
    public static <T> void forEach(final @Nullable CollectionHolder<? extends T> collection,
                                   final @NotNull Consumer<? super T> action) {
        if (collection == null)
            return;
        if (collection.isEmpty())
            return;
        __with1Argument(collection, action, collection.size());
    }

    //#endregion -------------------- predicate (T) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /// Perform a given `action` on each element
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param action The given action
    /// @see Iterable#forEach(Consumer)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">Javascript ReadonlyArray.forEach</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">Javascript ReadonlySet.forEach</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each.html">Kotlin forEach(action)</a>
    @ExtensionFunction
    public static <T> void forEach(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                   final @NotNull Runnable action) {
        if (collection == null)
            return;

        final var size = collection.size();
        if (size == 0)
            return;
        __with0Argument(action, size);
    }

    /// Perform a given `action` on each element
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param action The given action
    /// @see Iterable#forEach(Consumer)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">Javascript ReadonlyArray.forEach</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">Javascript ReadonlySet.forEach</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each.html">Kotlin forEach(action)</a>
    @ExtensionFunction
    public static <T> void forEach(final @Nullable CollectionHolder<? extends T> collection,
                                   final @NotNull Runnable action) {
        if (collection == null)
            return;
        if (collection.isEmpty())
            return;
        __with0Argument(action, collection.size());
    }

    //#endregion -------------------- predicate () → boolean --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static void __with0Argument(final @NotNull Runnable action,
                                        final int size) {
        var index = size;
        while (index-- > 0)
            action.run();
    }

    private static <T> void __with1Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                            final @NotNull Consumer<? super T> action,
                                            final int size) {
        var index = -1;
        while (++index < size)
            action.accept(collection.get(index));
    }

    private static <T> void __with2Argument(final @NotNull MinimalistCollectionHolder<? extends T> collection,
                                            final @NotNull ObjIntConsumer<? super T> action,
                                            final int size) {
        var index = -1;
        while (++index < size)
            action.accept(collection.get(index), index);
    }

    //#endregion -------------------- Loop methods --------------------

}

package joookiwi.collection.java.method;

import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class ForEach
        extends Utility {

    @Contract(ALWAYS_FAIL_0)
    private ForEach() { throw new ImpossibleConstructionException("The utility class “ForEach” cannot be constructed.", ForEach.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- predicate (T, int) → boolean --------------------

    /// Perform a given `action` on each element
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param action     The given action
    /// @see Iterable#forEach(Consumer)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">JavaScript ReadonlyArray.forEach</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">JavaScript ReadonlySet.forEach</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each.html">Kotlin forEach(action)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> void forEach(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                            final ObjIntConsumer<? super T> action) {
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
    /// @param action     The given action
    /// @see Iterable#forEach(Consumer)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">JavaScript ReadonlyArray.forEach</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">JavaScript ReadonlySet.forEach</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each.html">Kotlin forEach(action)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> void forEach(final @Nullable CollectionHolder<? extends T> collection,
                                                            final ObjIntConsumer<? super T> action) {
        if (collection == null)
            return;
        if (collection.isEmpty())
            return;
        __with2Argument(collection, action, collection.size());
    }

    /// Perform a given `action` on each element
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param action     The given action
    /// @see Iterable#forEach(Consumer)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">JavaScript ReadonlyArray.forEach</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">JavaScript ReadonlySet.forEach</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each.html">Kotlin forEach(action)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> void forEach(final T @Nullable @Unmodifiable [] collection,
                                                            final ObjIntConsumer<? super T> action) {
        if (collection == null)
            return;

        final var size = collection.length;
        if (size == 0)
            return;
        __with2Argument(collection, action, size);
    }

    //#endregion -------------------- predicate (T, int) → boolean --------------------
    //#region -------------------- predicate (T) → boolean --------------------

    /// Perform a given `action` on each element
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param action     The given action
    /// @see Iterable#forEach(Consumer)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">JavaScript ReadonlyArray.forEach</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">JavaScript ReadonlySet.forEach</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each.html">Kotlin forEach(action)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> void forEach(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                            final Consumer<? super T> action) {
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
    /// @param action     The given action
    /// @see Iterable#forEach(Consumer)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">JavaScript ReadonlyArray.forEach</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">JavaScript ReadonlySet.forEach</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each.html">Kotlin forEach(action)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> void forEach(final @Nullable CollectionHolder<? extends T> collection,
                                                            final Consumer<? super T> action) {
        if (collection == null)
            return;
        if (collection.isEmpty())
            return;
        __with1Argument(collection, action, collection.size());
    }

    /// Perform a given `action` on each element
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param action     The given action
    /// @see Iterable#forEach(Consumer)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">JavaScript ReadonlyArray.forEach</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">JavaScript ReadonlySet.forEach</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each.html">Kotlin forEach(action)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> void forEach(final T @Nullable @Unmodifiable [] collection,
                                                            final Consumer<? super T> action) {
        if (collection == null)
            return;

        final var size = collection.length;
        if (size == 0)
            return;
        __with1Argument(collection, action, size);
    }

    //#endregion -------------------- predicate (T) → boolean --------------------
    //#region -------------------- predicate () → boolean --------------------

    /// Perform a given `action` on each element
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param action     The given action
    /// @see Iterable#forEach(Consumer)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">JavaScript ReadonlyArray.forEach</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">Javascript ReadonlySet.forEach</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each.html">Kotlin forEach(action)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> void forEach(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                            final Runnable action) {
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
    /// @param action     The given action
    /// @see Iterable#forEach(Consumer)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">Javascript ReadonlyArray.forEach</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">Javascript ReadonlySet.forEach</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each.html">Kotlin forEach(action)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> void forEach(final @Nullable CollectionHolder<? extends T> collection,
                                                            final Runnable action) {
        if (collection == null)
            return;
        if (collection.isEmpty())
            return;
        __with0Argument(action, collection.size());
    }

    /// Perform a given `action` on each element
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param action     The given action
    /// @see Iterable#forEach(Consumer)
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Array/forEach">Javascript ReadonlyArray.forEach</a>
    /// @see <a href="https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Set/forEach">Javascript ReadonlySet.forEach</a>
    /// @see <a href="https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/for-each.html">Kotlin forEach(action)</a>
    @ExtensionFunction
    public static <T extends @Nullable Object> void forEach(final T @Nullable @Unmodifiable [] collection,
                                                            final Runnable action) {
        if (collection == null)
            return;

        final var size = collection.length;
        if (size == 0)
            return;
        __with0Argument(action, size);
    }

    //#endregion -------------------- predicate () → boolean --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static void __with0Argument(final Runnable action,
                                        final int size) {
        var index = size;
        while (index-- > 0)
            action.run();
    }


    private static <T extends @Nullable Object> void __with1Argument(final MinimalistCollectionHolder<? extends T> collection,
                                                                     final Consumer<? super T> action,
                                                                     final int size) {
        var index = -1;
        while (++index < size)
            action.accept(collection.get(index));
    }

    private static <T extends @Nullable Object> void __with1Argument(final T [] collection,
                                                                     final Consumer<? super T> action,
                                                                     final int size) {
        var index = -1;
        while (++index < size)
            action.accept(collection[index]);
    }


    private static <T extends @Nullable Object> void __with2Argument(final MinimalistCollectionHolder<? extends T> collection,
                                                                     final ObjIntConsumer<? super T> action,
                                                                     final int size) {
        var index = -1;
        while (++index < size)
            action.accept(collection.get(index), index);
    }

    private static <T extends @Nullable Object> void __with2Argument(final T [] collection,
                                                                     final ObjIntConsumer<? super T> action,
                                                                     final int size) {
        var index = -1;
        while (++index < size)
            action.accept(collection[index], index);
    }

    //#endregion -------------------- Loop methods --------------------

}

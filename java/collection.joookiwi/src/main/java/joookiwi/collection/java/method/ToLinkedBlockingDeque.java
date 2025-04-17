package joookiwi.collection.java.method;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.emptyLinkedBlockingDeque;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;

@NotNullByDefault
public final class ToLinkedBlockingDeque
        extends UtilityWithTable {

    @Contract(ALWAYS_FAIL_0)
    private ToLinkedBlockingDeque() { throw new ImpossibleConstructionException("The utility class “ToLinkedBlockingDeque” cannot be constructed.", ToLinkedBlockingDeque.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- ∅ --------------------

    /// Convert the `collection` to an [immutable][Unmodifiable] [LinkedBlockingDeque]
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> @Unmodifiable LinkedBlockingDeque<T> toLinkedBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection) {
        if (collection == null)
            return emptyLinkedBlockingDeque();

        var size = collection.size();
        if (size == 0)
            return emptyLinkedBlockingDeque();
        return __withNoTransform(collection, size);
    }

    /// Convert the `collection` to an [immutable][Unmodifiable] [LinkedBlockingDeque]
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> @Unmodifiable LinkedBlockingDeque<T> toLinkedBlockingQueue(final @Nullable CollectionHolder<? extends T> collection) {
        if (collection == null)
            return emptyLinkedBlockingDeque();
        if (collection.isEmpty())
            return emptyLinkedBlockingDeque();
        return __withNoTransform(collection, collection.size());
    }

    /// Convert the `collection` to an [immutable][Unmodifiable] [LinkedBlockingDeque]
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param <T>        The `collection` type
    @ExtensionFunction
    public static <T extends @Nullable Object> @Unmodifiable LinkedBlockingDeque<T> toLinkedBlockingQueue(final T @Nullable @Unmodifiable [] collection) {
        if (collection == null)
            return emptyLinkedBlockingDeque();

        var size = collection.length;
        if (size == 0)
            return emptyLinkedBlockingDeque();
        return __withNoTransform(collection, size);
    }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- (T, int) → U --------------------

    /// Convert the `collection` to an [immutable][Unmodifiable] [LinkedBlockingDeque]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> @Unmodifiable LinkedBlockingDeque<U> toLinkedBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                      final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyLinkedBlockingDeque();

        var size = collection.size();
        if (size == 0)
            return emptyLinkedBlockingDeque();
        return __with2Argument(collection, size, transform);
    }

    /// Convert the `collection` to an [immutable][Unmodifiable] [LinkedBlockingDeque]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> @Unmodifiable LinkedBlockingDeque<U> toLinkedBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                      final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyLinkedBlockingDeque();
        if (collection.isEmpty())
            return emptyLinkedBlockingDeque();
        return __with2Argument(collection, collection.size(), transform);
    }

    /// Convert the `collection` to an [immutable][Unmodifiable] [LinkedBlockingDeque]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> @Unmodifiable LinkedBlockingDeque<U> toLinkedBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                      final ObjIntFunction<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyLinkedBlockingDeque();

        var size = collection.length;
        if (size == 0)
            return emptyLinkedBlockingDeque();
        return __with2Argument(collection, size, transform);
    }

    //#endregion -------------------- (T, int) → U --------------------
    //#region -------------------- (T) → U --------------------

    /// Convert the `collection` to an [immutable][Unmodifiable] [LinkedBlockingDeque]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> @Unmodifiable LinkedBlockingDeque<U> toLinkedBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                      final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyLinkedBlockingDeque();

        var size = collection.size();
        if (size == 0)
            return emptyLinkedBlockingDeque();
        return __with1Argument(collection, size, transform);
    }

    /// Convert the `collection` to an [immutable][Unmodifiable] [LinkedBlockingDeque]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> @Unmodifiable LinkedBlockingDeque<U> toLinkedBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                                      final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyLinkedBlockingDeque();
        if (collection.isEmpty())
            return emptyLinkedBlockingDeque();
        return __with1Argument(collection, collection.size(), transform);
    }

    /// Convert the `collection` to an [immutable][Unmodifiable] [LinkedBlockingDeque]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T extends @Nullable Object, U extends @Nullable Object> @Unmodifiable LinkedBlockingDeque<U> toLinkedBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                                                                      final Function<? super T, ? extends U> transform) {
        if (collection == null)
            return emptyLinkedBlockingDeque();

        var size = collection.length;
        if (size == 0)
            return emptyLinkedBlockingDeque();
        return __with1Argument(collection, size, transform);
    }

    //#endregion -------------------- (T) → U --------------------
    //#region -------------------- () → U --------------------

    /// Convert the `collection` to an [immutable][Unmodifiable] [LinkedBlockingDeque]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T, U> @Unmodifiable LinkedBlockingDeque<U> toLinkedBlockingQueue(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                    final Supplier<? extends U> transform) {
        if (collection == null)
            return emptyLinkedBlockingDeque();

        var size = collection.size();
        if (size == 0)
            return emptyLinkedBlockingDeque();
        return __with0Argument(size, transform);
    }

    /// Convert the `collection` to an [immutable][Unmodifiable] [LinkedBlockingDeque]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T, U> @Unmodifiable LinkedBlockingDeque<U> toLinkedBlockingQueue(final @Nullable CollectionHolder<? extends T> collection,
                                                                                    final Supplier<? extends U> transform) {
        if (collection == null)
            return emptyLinkedBlockingDeque();
        if (collection.isEmpty())
            return emptyLinkedBlockingDeque();
        return __with0Argument(collection.size(), transform);
    }

    /// Convert the `collection` to an [immutable][Unmodifiable] [LinkedBlockingDeque]
    /// applying a transformation
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param transform  The given transform
    /// @param <T>        The `collection` type
    /// @param <U>        The new type
    @ExtensionFunction
    public static <T, U> @Unmodifiable LinkedBlockingDeque<U> toLinkedBlockingQueue(final T @Nullable @Unmodifiable [] collection,
                                                                                    final Supplier<? extends U> transform) {
        if (collection == null)
            return emptyLinkedBlockingDeque();

        var size = collection.length;
        if (size == 0)
            return emptyLinkedBlockingDeque();
        return __with0Argument(size, transform);
    }

    //#endregion -------------------- () → U --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T extends @Nullable Object> @Unmodifiable LinkedBlockingDeque<T> __withNoTransform(final MinimalistCollectionHolder<? extends T> collection,
                                                                                                       final int size) {
        throw new RuntimeException(); // TODO add ImmutableLinkedBlockingDeque initialization
//        return new ImmutableLinkedBlockingDeque<>(_values(collection, size));
    }

    private static <T extends @Nullable Object> @Unmodifiable LinkedBlockingDeque<T> __withNoTransform(final T @Unmodifiable [] collection,
                                                                                                       final int size) {
        throw new RuntimeException(); // TODO add ImmutableLinkedBlockingDeque initialization
//        return new ImmutableLinkedBlockingDeque<>(_values(collection, size));
    }


    private static <U extends @Nullable Object> @Unmodifiable LinkedBlockingDeque<U> __with0Argument(final int size,
                                                                                                     final Supplier<? extends U> transform) {
        throw new RuntimeException(); // TODO add ImmutableLinkedBlockingDeque initialization
//        return new ImmutableLinkedBlockingDeque<>(_values(size, transform));
    }


    private static <T extends @Nullable Object, U> @Unmodifiable LinkedBlockingDeque<U> __with1Argument(final MinimalistCollectionHolder<? extends T> collection,
                                                                                                        final int size,
                                                                                                        final Function<? super T, ? extends U> transform) {
        throw new RuntimeException(); // TODO add ImmutableLinkedBlockingDeque initialization
//        return new ImmutableLinkedBlockingDeque<>(_values(collection, size, transform));
    }

    private static <T extends @Nullable Object, U extends @Nullable Object> @Unmodifiable LinkedBlockingDeque<U> __with1Argument(final T @Unmodifiable [] collection,
                                                                                                                                 final int size,
                                                                                                                                 final Function<? super T, ? extends U> transform) {
        throw new RuntimeException(); // TODO add ImmutableLinkedBlockingDeque initialization
//        return new ImmutableLinkedBlockingDeque<>(_values(collection, size, transform));
    }


    private static <T extends @Nullable Object, U extends @Nullable Object> @Unmodifiable LinkedBlockingDeque<U> __with2Argument(final MinimalistCollectionHolder<? extends T> collection,
                                                                                                                                 final int size,
                                                                                                                                 final ObjIntFunction<? super T, ? extends U> transform) {
        throw new RuntimeException(); // TODO add ImmutableLinkedBlockingDeque initialization
//        return new ImmutableLinkedBlockingDeque<>(_values(collection, size, transform));
    }

    private static <T extends @Nullable Object, U extends @Nullable Object> @Unmodifiable LinkedBlockingDeque<U> __with2Argument(final T @Unmodifiable [] collection,
                                                                                                                                 final int size,
                                                                                                                                 final ObjIntFunction<? super T, ? extends U> transform) {
        throw new RuntimeException(); // TODO add ImmutableLinkedBlockingDeque initialization
//        return new ImmutableLinkedBlockingDeque<>(_values(collection, size, transform));
    }

    //#endregion -------------------- Loop methods --------------------

}

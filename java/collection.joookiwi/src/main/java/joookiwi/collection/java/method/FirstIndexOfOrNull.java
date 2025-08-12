package joookiwi.collection.java.method;

import java.util.Objects;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import joookiwi.collection.java.annotation.CanReceiveNegativeValue;
import joookiwi.collection.java.annotation.ExtensionFunction;
import joookiwi.collection.java.annotation.OnlyGivePositiveValue;
import joookiwi.collection.java.exception.ImpossibleConstructionException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_NULL_2;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_NULL_3;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_NULL_4;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

@NotNullByDefault
public final class FirstIndexOfOrNull
        extends UtilityWithIndex {

    @Contract(ALWAYS_FAIL_0)
    private FirstIndexOfOrNull() { throw new ImpossibleConstructionException("The utility class “FirstIndexOfOrNull” cannot be constructed.", FirstIndexOfOrNull.class); }

    //#region -------------------- Facade methods --------------------

    //#region -------------------- element --------------------

    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param element    The element to find
    /// @param <T>        The `collection` and `element` type
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                         final T element) {
        if (collection == null)
            return null;
        return __core0(collection, element);
    }

    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param element    The element to find
    /// @param <T>        The `collection` and `element` type
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                         final T element) {
        if (collection == null)
            return null;
        return __core0(collection, element);
    }

    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param element    The element to find
    /// @param <T>        The `collection` and `element` type
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                         final T element) {
        if (collection == null)
            return null;
        return __core0(collection, element);
    }

    //#endregion -------------------- element --------------------
    //#region -------------------- element, from --------------------

    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param element    The element to find
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` and `element` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                         final T element,
                                                                                                                         final int from) {
        if (collection == null)
            return null;
        return __core1(collection, element, from);
    }

    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param element    The element to find
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` and `element` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                         final T element,
                                                                                                                         final int from) {
        if (collection == null)
            return null;
        return __core1(collection, element, from);
    }

    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    /// between the `starting index` and the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param element    The element to find
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` and `element` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                         final T element,
                                                                                                                         final int from) {
        if (collection == null)
            return null;
        return __core1(collection, element, from);
    }


    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param element    The element to find
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` and `element` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                         final T element,
                                                                                                                         final @Nullable Integer from) {
        if (collection == null)
            return null;
        if (from == null)
            return __core0(collection, element);
        return __core1(collection, element, from);
    }

    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param element    The element to find
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` and `element` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                         final T element,
                                                                                                                         final @Nullable Integer from) {
        if (collection == null)
            return null;
        if (from == null)
            return __core0(collection, element);
        return __core1(collection, element, from);
    }

    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    /// from a start to the end of the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param element    The element to find
    /// @param from       The inclusive starting index (`0` by default)
    /// @param <T>        The `collection` and `element` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_3)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                         final T element,
                                                                                                                         final @Nullable Integer from) {
        if (collection == null)
            return null;
        if (from == null)
            return __core0(collection, element);
        return __core1(collection, element, from);
    }

    //#endregion -------------------- element, from --------------------
    //#region -------------------- element, from, to --------------------

    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param element    The element to find
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` and `element` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                         final T element,
                                                                                                                         final int from,
                                                                                                                         final int to) {
        if (collection == null)
            return null;
        return __core2(collection, element, from, to);
    }

    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param element    The element to find
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` and `element` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                         final T element,
                                                                                                                         final int from,
                                                                                                                         final int to) {
        if (collection == null)
            return null;
        return __core2(collection, element, from, to);
    }

    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param element    The element to find
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` and `element` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                         final T element,
                                                                                                                         final int from,
                                                                                                                         final int to) {
        if (collection == null)
            return null;
        return __core2(collection, element, from, to);
    }


    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param element    The element to find
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` and `element` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                         final T element,
                                                                                                                         final int from,
                                                                                                                         final @Nullable Integer to) {
        if (collection == null)
            return null;
        if (to == null)
            return __core1(collection, element, from);
        return __core2(collection, element, from, to);
    }

    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param element    The element to find
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` and `element` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                         final T element,
                                                                                                                         final int from,
                                                                                                                         final @Nullable Integer to) {
        if (collection == null)
            return null;
        if (to == null)
            return __core1(collection, element, from);
        return __core2(collection, element, from, to);
    }

    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param element    The element to find
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` and `element` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                         final T element,
                                                                                                                         final int from,
                                                                                                                         final @Nullable Integer to) {
        if (collection == null)
            return null;
        if (to == null)
            return __core1(collection, element, from);
        return __core2(collection, element, from, to);
    }


    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param element    The element to find
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` and `element` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                         final T element,
                                                                                                                         final @Nullable Integer from,
                                                                                                                         final int to) {
        if (collection == null)
            return null;
        if (from == null)
            return __coreWithNoFrom(collection, element, to);
        return __core2(collection, element, from, to);
    }

    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param element    The element to find
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` and `element` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                         final T element,
                                                                                                                         final @Nullable Integer from,
                                                                                                                         final int to) {
        if (collection == null)
            return null;
        if (from == null)
            return __coreWithNoFrom(collection, element, to);
        return __core2(collection, element, from, to);
    }

    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param element    The element to find
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`<code>size - 1` by default)
    /// @param <T>        The `collection` and `element` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                         final T element,
                                                                                                                         final @Nullable Integer from,
                                                                                                                         final int to) {
        if (collection == null)
            return null;
        if (from == null)
            return __coreWithNoFrom(collection, element, to);
        return __core2(collection, element, from, to);
    }


    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][MinimalistCollectionHolder]
    /// @param element    The element to find
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][MinimalistCollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` and `element` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                         final T element,
                                                                                                                         final @Nullable Integer from,
                                                                                                                         final @Nullable Integer to) {
        if (collection == null)
            return null;
        if (to == null)
            if (from == null)
                return __core0(collection, element);
            else
                return __core1(collection, element, from);
        if (from == null)
            return __coreWithNoFrom(collection, element, to);
        return __core2(collection, element, from, to);
    }

    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param element    The element to find
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (<code>[size][CollectionHolder#size] - 1</code> by default)
    /// @param <T>        The `collection` and `element` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                         final T element,
                                                                                                                         final @Nullable Integer from,
                                                                                                                         final @Nullable Integer to) {
        if (collection == null)
            return null;
        if (to == null)
            if (from == null)
                return __core0(collection, element);
            else
                return __core1(collection, element, from);
        if (from == null)
            return __coreWithNoFrom(collection, element, to);
        return __core2(collection, element, from, to);
    }

    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    /// between the `starting` and the `ending` index
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param element    The element to find
    /// @param from       The inclusive starting index (`0` by default)
    /// @param to         The inclusive ending index (`size - 1` by default)
    /// @param <T>        The `collection` and `element` type
    @ExtensionFunction
    @CanReceiveNegativeValue
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_4)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                         final T element,
                                                                                                                         final @Nullable Integer from,
                                                                                                                         final @Nullable Integer to) {
        if (collection == null)
            return null;
        if (to == null)
            if (from == null)
                return __core0(collection, element);
            else
                return __core1(collection, element, from);
        if (from == null)
            return __coreWithNoFrom(collection, element, to);
        return __core2(collection, element, from, to);
    }

    //#endregion -------------------- element, from, to --------------------

    //#endregion -------------------- Facade methods --------------------
    //#region -------------------- Core methods --------------------

    //#region -------------------- element --------------------

    private static <T extends @Nullable Object> @Nullable Integer __core0(final MinimalistCollectionHolder<? extends T> collection,
                                                                          final T element) {
        final var size = collection.size();
        if (size == 0)
            return null;
        return __findInRange(collection, element, 0, size - 1);
    }

    private static <T extends @Nullable Object> @Nullable Integer __core0(final CollectionHolder<? extends T> collection,
                                                                          final T element) {
        if (collection.isEmpty())
            return null;
        return __findInRange(collection, element, 0, collection.size() - 1);
    }

    private static <T extends @Nullable Object> @Nullable Integer __core0(final T @Unmodifiable [] collection,
                                                                          final T element) {
        final var size = collection.length;
        if (size == 0)
            return null;
        return __findInRange(collection, element, 0, size - 1);
    }

    //#endregion -------------------- element --------------------
    //#region -------------------- element, from --------------------

    private static <T extends @Nullable Object> @Nullable Integer __core1(final MinimalistCollectionHolder<? extends T> collection,
                                                                          final T element,
                                                                          final int from) {
        final var size = collection.size();
        if (size == 0)
            return null;

        final var startingIndex = _startingIndexOrNull(from, size);
        if (startingIndex == null)
            return null;
        return __findInRange(collection, element, startingIndex, size - 1);
    }

    private static <T extends @Nullable Object> @Nullable Integer __core1(final CollectionHolder<? extends T> collection,
                                                                          final T element,
                                                                          final int from) {
        if (collection.isEmpty())
            return null;

        final var size = collection.size();
        final var startingIndex = _startingIndexOrNull(from, size);
        if (startingIndex == null)
            return null;
        return __findInRange(collection, element, startingIndex, size - 1);
    }

    private static <T extends @Nullable Object> @Nullable Integer __core1(final T @Unmodifiable [] collection,
                                                                          final T element,
                                                                          final int from) {
        final var size = collection.length;
        if (size == 0)
            return null;

        final var startingIndex = _startingIndexOrNull(from, size);
        if (startingIndex == null)
            return null;
        return __findInRange(collection, element, startingIndex, size - 1);
    }

    //#endregion -------------------- element, from --------------------
    //#region -------------------- element, from, to --------------------

    private static <T extends @Nullable Object> @Nullable Integer __core2(final MinimalistCollectionHolder<? extends T> collection,
                                                                          final T element,
                                                                          final int from,
                                                                          final int to) {
        final var size = collection.size();
        if (size == 0)
            return null;

        final var startingIndex = _startingIndexOrNull(from, size);
        if (startingIndex == null)
            return null;
        final var endingIndex = _endingIndexOrNull(to, size);
        if (endingIndex == null)
            return null;
        if (endingIndex < startingIndex)
            return null;
        return __findInRange(collection, element, startingIndex, endingIndex);
    }

    private static <T extends @Nullable Object> @Nullable Integer __core2(final CollectionHolder<? extends T> collection,
                                                                          final T element,
                                                                          final int from,
                                                                          final int to) {
        if (collection.isEmpty())
            return null;

        final var size = collection.size();
        final var startingIndex = _startingIndexOrNull(from, size);
        if (startingIndex == null)
            return null;

        final var endingIndex = _endingIndexOrNull(to, size);
        if (endingIndex == null)
            return null;
        if (endingIndex < startingIndex)
            return null;
        return __findInRange(collection, element, startingIndex, endingIndex);
    }

    private static <T extends @Nullable Object> @Nullable Integer __core2(final T @Unmodifiable [] collection,
                                                                          final T element,
                                                                          final int from,
                                                                          final int to) {
        final var size = collection.length;
        if (size == 0)
            return null;

        final var startingIndex = _startingIndexOrNull(from, size);
        if (startingIndex == null)
            return null;

        final var endingIndex = _endingIndexOrNull(to, size);
        if (endingIndex == null)
            return null;
        if (endingIndex < startingIndex)
            return null;
        return __findInRange(collection, element, startingIndex, endingIndex);
    }

    //#endregion -------------------- element, from, to --------------------
    //#region -------------------- element, to --------------------

    private static <T extends @Nullable Object> @Nullable Integer __coreWithNoFrom(final MinimalistCollectionHolder<? extends T> collection,
                                                                                   final T element,
                                                                                   final int to) {
        final var size = collection.size();
        if (size == 0)
            return null;

        final var endingIndex = _endingIndexOrNull(to, size);
        if (endingIndex == null)
            return null;
        return __findInRange(collection, element, 0, endingIndex);
    }

    private static <T extends @Nullable Object> @Nullable Integer __coreWithNoFrom(final CollectionHolder<? extends T> collection,
                                                                                   final T element,
                                                                                   final int to) {
        if (collection.isEmpty())
            return null;
        final var endingIndex = _endingIndexOrNull(to, collection.size());
        if (endingIndex == null)
            return null;
        return __findInRange(collection, element, 0, endingIndex);
    }

    private static <T extends @Nullable Object> @Nullable Integer __coreWithNoFrom(final T @Unmodifiable [] collection,
                                                                                   final T element,
                                                                                   final int to) {
        final var size = collection.length;
        if (size == 0)
            return null;
        final var endingIndex = _endingIndexOrNull(to, size);
        if (endingIndex == null)
            return null;
        return __findInRange(collection, element, 0, endingIndex);
    }

    //#endregion -------------------- element, to --------------------

    //#endregion -------------------- Core methods --------------------
    //#region -------------------- Loop methods --------------------

    private static <T extends @Nullable Object> @Nullable Integer __findInRange(final MinimalistCollectionHolder<? extends T> collection,
                                                                                final T element,
                                                                                final int startingIndex,
                                                                                final int endingIndex) {
        var index = startingIndex - 1;
        if (element == null) {
            while (++index <= endingIndex)
                if (collection.get(index) == null)
                    return index;
            return null;
        }
        while (++index <= endingIndex)
            if (Objects.equals(collection.get(index), element))
                return index;
        return null;
    }

    private static <T extends @Nullable Object> @Nullable Integer __findInRange(final T @Unmodifiable [] collection,
                                                                                final T element,
                                                                                final int startingIndex,
                                                                                final int endingIndex) {
        var index = startingIndex - 1;
        if (element == null) {
            while (++index <= endingIndex)
                if (collection[index] == null)
                    return index;
            return null;
        }
        while (++index <= endingIndex)
            if (Objects.equals(collection[index], element))
                return index;
        return null;
    }

    //#endregion -------------------- Loop methods --------------------

}

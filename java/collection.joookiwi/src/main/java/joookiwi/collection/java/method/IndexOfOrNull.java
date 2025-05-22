package joookiwi.collection.java.method;

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
public final class IndexOfOrNull
        extends AliasUtility {

    @Contract(ALWAYS_FAIL_0)
    private IndexOfOrNull() { throw new ImpossibleConstructionException("The utility class “IndexOfOrNull” cannot be constructed.", IndexOfOrNull.class); }

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                    final T element) { return FirstIndexOfOrNull.firstIndexOfOrNull(collection, element); }

    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    ///
    /// @param collection The [nullable][Nullable] [collection][CollectionHolder]
    /// @param element    The element to find
    /// @param <T>        The `collection` and `element` type
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                    final T element) { return FirstIndexOfOrNull.firstIndexOfOrNull(collection, element); }

    /// Get the **first** occurrence equivalent to the value received
    /// or `null` if it was not in the `collection`
    ///
    /// @param collection The [nullable][Nullable] collection
    /// @param element    The element to find
    /// @param <T>        The `collection` and `element` type
    @ExtensionFunction
    @OnlyGivePositiveValue
    @Contract(IF_1ST_NULL_THEN_NULL_2)
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                    final T element) { return FirstIndexOfOrNull.firstIndexOfOrNull(collection, element); }

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                    final T element,
                                                                                                                    final int from) { return FirstIndexOfOrNull.firstIndexOfOrNull(collection, element, from); }

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                    final T element,
                                                                                                                    final int from) { return FirstIndexOfOrNull.firstIndexOfOrNull(collection, element, from); }

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                    final T element,
                                                                                                                    final int from) { return FirstIndexOfOrNull.firstIndexOfOrNull(collection, element, from); }


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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                    final T element,
                                                                                                                    final @Nullable Integer from) { return FirstIndexOfOrNull.firstIndexOfOrNull(collection, element, from); }

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                    final T element,
                                                                                                                    final @Nullable Integer from) { return FirstIndexOfOrNull.firstIndexOfOrNull(collection, element, from); }

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                    final T element,
                                                                                                                    final @Nullable Integer from) { return FirstIndexOfOrNull.firstIndexOfOrNull(collection, element, from); }

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                    final T element,
                                                                                                                    final int from,
                                                                                                                    final int to) { return FirstIndexOfOrNull.firstIndexOfOrNull(collection, element, from, to); }

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                    final T element,
                                                                                                                    final int from,
                                                                                                                    final int to) { return FirstIndexOfOrNull.firstIndexOfOrNull(collection, element, from, to); }

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                    final T element,
                                                                                                                    final int from,
                                                                                                                    final int to) { return FirstIndexOfOrNull.firstIndexOfOrNull(collection, element, from, to); }


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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                    final T element,
                                                                                                                    final int from,
                                                                                                                    final @Nullable Integer to) { return FirstIndexOfOrNull.firstIndexOfOrNull(collection, element, from, to); }

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                    final T element,
                                                                                                                    final int from,
                                                                                                                    final @Nullable Integer to) { return FirstIndexOfOrNull.firstIndexOfOrNull(collection, element, from, to); }

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                    final T element,
                                                                                                                    final int from,
                                                                                                                    final @Nullable Integer to) { return FirstIndexOfOrNull.firstIndexOfOrNull(collection, element, from, to); }


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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                    final T element,
                                                                                                                    final @Nullable Integer from,
                                                                                                                    final int to) { return FirstIndexOfOrNull.firstIndexOfOrNull(collection, element, from, to); }

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                    final T element,
                                                                                                                    final @Nullable Integer from,
                                                                                                                    final int to) { return FirstIndexOfOrNull.firstIndexOfOrNull(collection, element, from, to); }

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                    final T element,
                                                                                                                    final @Nullable Integer from,
                                                                                                                    final int to) { return FirstIndexOfOrNull.firstIndexOfOrNull(collection, element, from, to); }


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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfOrNull(final @Nullable MinimalistCollectionHolder<? extends T> collection,
                                                                                                                    final T element,
                                                                                                                    final @Nullable Integer from,
                                                                                                                    final @Nullable Integer to) { return FirstIndexOfOrNull.firstIndexOfOrNull(collection, element, from, to); }

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfOrNull(final @Nullable CollectionHolder<? extends T> collection,
                                                                                                                    final T element,
                                                                                                                    final @Nullable Integer from,
                                                                                                                    final @Nullable Integer to) { return FirstIndexOfOrNull.firstIndexOfOrNull(collection, element, from, to); }

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
    public static <T extends @Nullable Object> @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer indexOfOrNull(final T @Nullable @Unmodifiable [] collection,
                                                                                                                    final T element,
                                                                                                                    final @Nullable Integer from,
                                                                                                                    final @Nullable Integer to) { return FirstIndexOfOrNull.firstIndexOfOrNull(collection, element, from, to); }

    //#endregion -------------------- element, from, to --------------------

    //#endregion -------------------- Facade methods --------------------

}

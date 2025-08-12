package joookiwi.collection.java.extended;

import java.util.Collection;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import joookiwi.collection.java.exception.EmptyCollectionException;
import joookiwi.collection.java.exception.IndexOutOfBoundsException;
import joookiwi.collection.java.exception.InvalidIndexRangeException;
import joookiwi.collection.java.helper.ArrayCreator;
import joookiwi.collection.java.helper.ComparatorHelper;
import org.jetbrains.annotations.ApiStatus.Experimental;
import org.jetbrains.annotations.ApiStatus.Internal;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.emptyArray;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_3;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_4;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_6;
import static joookiwi.collection.java.CommonContracts.IF_ONLY_2ND_NULL_THEN_1ST_2;
import static joookiwi.collection.java.exception.EmptyCollectionException.DEFAULT_MESSAGE;
import static joookiwi.collection.java.method.FirstIndexOfOrNull.firstIndexOfOrNull;
import static joookiwi.collection.java.method.Has.has;

/// An internal utility on the mutability nature of an [Array][java.lang.reflect.Array]
/// about its mutability nature.
///
/// Most, if not all, methods can give a new value based on the [Array][java.lang.reflect.Array] received.
@Internal
@NotNullByDefault
public final class UtilityForMutableArray
        extends UtilityForArray {

    @Contract(ALWAYS_FAIL_0)
    private UtilityForMutableArray() { throw new AssertionError("The utility class “UtilityForMutableArray” cannot be constructed."); }

    //#region -------------------- Set methods --------------------

    /// Set the `value` at the specified `index` in the `collection`
    ///
    /// @param collection The collection
    /// @param index      The index to set the `value`
    /// @param value      The value to set
    /// @param <T> The `collection` and `value` type
    @Contract(mutates = "param1")
    public static <T extends @Nullable Object> T set(final T[] collection,
                                                     final int index,
                                                     final T value) {
        if (index < 0)
            throw new IndexOutOfBoundsException("Index out of bound. The index is under 0.", index);

        final var size = collection.length;
        if (index > size)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is under the size of the collection (" + size + ").", index);

        final var originalValue = collection[index];
        collection[index] = value;
        return originalValue;
    }

    /// Set the `value` at the specified `index` in the `collection`
    ///
    /// @param collection The collection
    /// @param index      The index to set the `value`
    /// @param value      The value to set
    @Contract(mutates = "param1")
    public static boolean set(final boolean[] collection,
                              final int index,
                              final boolean value) {
        if (index < 0)
            throw new IndexOutOfBoundsException("Index out of bound. The index is under 0.", index);

        final var size = collection.length;
        if (index > size)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is under the size of the collection (" + size + ").", index);

        final var originalValue = collection[index];
        collection[index] = value;
        return originalValue;
    }

    /// Set the `value` at the specified `index` in the `collection`
    ///
    /// @param collection The collection
    /// @param index      The index to set the `value`
    /// @param value      The value to set
    @Contract(mutates = "param1")
    public static char set(final char[] collection,
                           final int index,
                           final char value) {
        if (index < 0)
            throw new IndexOutOfBoundsException("Index out of bound. The index is under 0.", index);

        final var size = collection.length;
        if (index > size)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is under the size of the collection (" + size + ").", index);

        final var originalValue = collection[index];
        collection[index] = value;
        return originalValue;
    }

    /// Set the `value` at the specified `index` in the `collection`
    ///
    /// @param collection The collection
    /// @param index      The index to set the `value`
    /// @param value      The value to set
    @Contract(mutates = "param1")
    public static byte set(final byte[] collection,
                           final int index,
                           final byte value) {
        if (index < 0)
            throw new IndexOutOfBoundsException("Index out of bound. The index is under 0.", index);

        final var size = collection.length;
        if (index > size)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is under the size of the collection (" + size + ").", index);

        final var originalValue = collection[index];
        collection[index] = value;
        return originalValue;
    }

    /// Set the `value` at the specified `index` in the `collection`
    ///
    /// @param collection The collection
    /// @param index      The index to set the `value`
    /// @param value      The value to set
    @Contract(mutates = "param1")
    public static short set(final short[] collection,
                            final int index,
                            final short value) {
        if (index < 0)
            throw new IndexOutOfBoundsException("Index out of bound. The index is under 0.", index);

        final var size = collection.length;
        if (index > size)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is under the size of the collection (" + size + ").", index);

        final var originalValue = collection[index];
        collection[index] = value;
        return originalValue;
    }

    /// Set the `value` at the specified `index` in the `collection`
    ///
    /// @param collection The collection
    /// @param index      The index to set the `value`
    /// @param value      The value to set
    @Contract(mutates = "param1")
    public static int set(final int[] collection,
                          final int index,
                          final int value) {
        if (index < 0)
            throw new IndexOutOfBoundsException("Index out of bound. The index is under 0.", index);

        final var size = collection.length;
        if (index > size)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is under the size of the collection (" + size + ").", index);

        final var originalValue = collection[index];
        collection[index] = value;
        return originalValue;
    }

    /// Set the `value` at the specified `index` in the `collection`
    ///
    /// @param collection The collection
    /// @param index      The index to set the `value`
    /// @param value      The value to set
    @Contract(mutates = "param1")
    public static long set(final long[] collection,
                           final int index,
                           final long value) {
        if (index < 0)
            throw new IndexOutOfBoundsException("Index out of bound. The index is under 0.", index);

        final var size = collection.length;
        if (index > size)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is under the size of the collection (" + size + ").", index);

        final var originalValue = collection[index];
        collection[index] = value;
        return originalValue;
    }

    /// Set the `value` at the specified `index` in the `collection`
    ///
    /// @param collection The collection
    /// @param index      The index to set the `value`
    /// @param value      The value to set
    @Contract(mutates = "param1")
    public static float set(final float[] collection,
                            final int index,
                            final float value) {
        if (index < 0)
            throw new IndexOutOfBoundsException("Index out of bound. The index is under 0.", index);

        final var size = collection.length;
        if (index > size)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is under the size of the collection (" + size + ").", index);

        final var originalValue = collection[index];
        collection[index] = value;
        return originalValue;
    }

    /// Set the `value` at the specified `index` in the `collection`
    ///
    /// @param collection The collection
    /// @param index      The index to set the `value`
    /// @param value      The value to set
    @Contract(mutates = "param1")
    public static double set(final double[] collection,
                             final int index,
                             final double value) {
        if (index < 0)
            throw new IndexOutOfBoundsException("Index out of bound. The index is under 0.", index);

        final var size = collection.length;
        if (index > size)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is under the size of the collection (" + size + ").", index);

        final var originalValue = collection[index];
        collection[index] = value;
        return originalValue;
    }

    //#endregion -------------------- Set methods --------------------

    //#region -------------------- Add methods --------------------

    /// Add the `value` at the specific `index` the `collection` in a new [Array][java.lang.reflect.Array].
    ///
    /// In other words,
    /// the `value` added is at the specified `index` while the `collection` is separated on the `index` received.
    /// The sum result in a new [Array][java.lang.reflect.Array].
    ///
    /// @param collection The collection to add the `value`
    /// @param index      The index to add the `value`
    /// @param value      The value to add
    /// @param <T>        The `collection` and `value` type
    /// @throws IndexOutOfBoundsException The index if before `0` or over the `collection.length`
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> T[] add(final T @Unmodifiable [] collection,
                                                       final int index,
                                                       final T value) {
        if (index < 0)
            throw new IndexOutOfBoundsException("Index out of bound. The index is under 0.", index);

        final var size = collection.length;
        if (index > size)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is under the size of the collection (" + size + ").", index);

        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[size + 1];
        var index2 = -1;
        while (++index2 < index)
            newArray[index2] = collection[index2];
        newArray[index] = value;
        index2++;
        while (++index2 < size)
            newArray[index2] = collection[index2];
        return newArray;
    }

    /// Add the `value` after the `collection` in a new [Array][java.lang.reflect.Array]
    ///
    /// @param collection The collection to add the `value`
    /// @param value      The value to add
    /// @param <T>        The `collection` and `value` type
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> T[] addToFirst(final T @Unmodifiable [] collection,
                                                              final T value) {
        final var size = collection.length;
        if (size == 0)
            return ArrayCreator.getInstance().newArray(value);
        final var sizePlus1 = size + 1;
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[sizePlus1];
        newArray[0] = value;
        var index = 0;
        while (++index < sizePlus1)
            newArray[index] = collection[index];
        return newArray;
    }

    /// Add the `value` before the `collection` in a new [Array][java.lang.reflect.Array]
    ///
    /// @param collection The collection to add the `value`
    /// @param value      The value to add
    /// @param <T>        The `collection` and `value` type
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> T[] addToLast(final T @Unmodifiable [] collection,
                                                             final T value) { return __addToLast(collection, value); }

    public static <T extends @Nullable Object> T[] addToLastIfNotPresent(final T @Unmodifiable [] collection,
                                                                         final T value) {
        if (has(collection, value))
            return collection;
        return __addToLast(collection, value);
    }


    private static <T extends @Nullable Object> T[] __addToLast(final T @Unmodifiable [] collection,
                                                                final T value) {
        final var size = collection.length;
        if (size == 0)
            return ArrayCreator.getInstance().newArray(value);
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[size + 1];
        var index = 0;
        while (++index < size)
            newArray[index] = collection[index];
        newArray[index] = value;
        return newArray;
    }

    public static <T extends @Nullable Object> T[] addAllIfNotPresent(final T @Unmodifiable [] collection,
                                                                      final @Unmodifiable Collection<? extends T> values) {

        if (values.isEmpty())
            return collection;

        final var size = collection.length;
        if (size == 0)
            return ArrayCreator.getInstance().newArray(values);

        final var valuesAsArray = ArrayCreator.getInstance().newArray(values);
        final var valuesSize = values.size();
        final var valuesToAdd = new boolean[valuesSize];
        var valuesIndex1 = -1;
        while (++valuesIndex1 < valuesSize)
            valuesToAdd[valuesIndex1] = has(collection, valuesAsArray[valuesIndex1]);

        var amountOfValuesToAdd = 0;
        var valuesIndex2 = -1;
        while (++valuesIndex2 < valuesSize)
            if (valuesToAdd[valuesIndex2])
                amountOfValuesToAdd++;

        final var newSize = size + amountOfValuesToAdd;
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[newSize];
        var index2 = -1;
        while (++index2 < size)
            newArray[index2] = collection[index2];
        var valuesIndex3 = -1;
        while (++valuesIndex3 < valuesSize)
            if (valuesToAdd[valuesIndex3])
                newArray[index2++] = valuesAsArray[valuesIndex3];
        return newArray;
    }

    public static <T extends @Nullable Object> T[] addAll(final T @Unmodifiable [] collection,
                                                          final int index,
                                                          final @Unmodifiable Collection<? extends T> values) {

        if (values.isEmpty())
            return collection;
        if (index < 0)
            throw new IndexOutOfBoundsException("Index out of bound. The index is under 0.", index);

        final var size = collection.length;
        if (index > size)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is under the size of the collection (" + size + ").", index);
        if (size == 0)
            return ArrayCreator.getInstance().newArray(values);

        final var newSize = size + values.size();
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[newSize];
        var index2 = -1;
        while (++index2 < index)
            newArray[index] = collection[index2];
        for (final var value : values)
            newArray[index2++] = value;
        while (++index2 < newSize)
            newArray[index2] = collection[index2];
        return newArray;
    }

    public static <T extends @Nullable Object> T[] addAll(final T @Unmodifiable [] collection,
                                                          final int index,
                                                          final T @Unmodifiable [] values) {

        final var valuesSize = values.length;
        if (valuesSize == 0)
            return collection;
        if (index < 0)
            throw new IndexOutOfBoundsException("Index out of bound. The index is under 0.", index);

        final var size = collection.length;
        if (index > size)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is under the size of the collection (" + size + ").", index);
        if (size == 0)
            return values;

        final var newSize = size + valuesSize;
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[newSize];
        var index2 = -1;
        while (++index2 < index)
            newArray[index] = collection[index2];

        var index3 = -1;
        while (++index3 < valuesSize)
            newArray[index2++] = values[index3];
        while (++index2 < newSize)
            newArray[index2] = collection[index2];
        return newArray;
    }

    //#endregion -------------------- Add methods --------------------
    //#region -------------------- Join methods --------------------

    public static <T extends @Nullable Object> T[] join(final T @Unmodifiable [] collection,
                                                        final @Unmodifiable Collection<? extends T> values) {

        if (values.isEmpty())
            if (collection.length == 0)
                return emptyArray();
            else
                return collection;

        final var size = collection.length;
        if (size == 0)
            return ArrayCreator.getInstance().newArray(values);
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[size + values.size()];
        var index = -1;
        while (++index < size)
            newArray[index] = collection[index];
        for (final var value : values)
            newArray[index++] = value;
        return newArray;
    }

    public static <T extends @Nullable Object> T[] join(final @Unmodifiable Collection<? extends T> collection,
                                                        final T @Unmodifiable [] values) {

        final var valuesSize = values.length;
        if (valuesSize == 0)
            if (collection.isEmpty())
                return emptyArray();
            else
                return ArrayCreator.getInstance().newArray(collection);

        final var size = collection.size();
        if (size == 0)
            return values;
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[size + valuesSize];
        var index = -1;
        for (final var value : collection)
            newArray[++index] = value;

        var index2 = -1;
        while (++index2 < valuesSize)
            newArray[index++] = values[index2];
        return newArray;
    }

    //#endregion -------------------- Join methods --------------------
    //#region -------------------- Remove methods --------------------

    public static <T extends @Nullable Object> T[] remove(final T @Unmodifiable [] collection,
                                                          final @Nullable Object value) {
        final var size = collection.length;
        if (size == 0)
            return collection;

        final var indexFound = firstIndexOfOrNull(collection, value);
        if (indexFound == null)
            return collection;
        return __removeAt(collection, indexFound, size);
    }


    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object> T[] removeAt(final T @Unmodifiable [] collection,
                                                            final int index) {
        if (index < 0)
            throw new IndexOutOfBoundsException("Index out of bound. The index is under 0.", index);

        final var size = collection.length;
        if (index > size)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is under the size of the collection (" + size + ").", index);
        return __removeAt(collection, index, size);
    }

    private static <T extends @Nullable Object> T[] __removeAt(final T @Unmodifiable [] collection,
                                                               final int index,
                                                               final int size) {
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[size - 1];
        var index2 = -1;
        while (++index2 < index)
            newArray[index2] = collection[index2];
        while (++index2 < size)
            newArray[index2] = collection[index2 + 1];
        return newArray;
    }


    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> T[] removeFirst(final T @Unmodifiable [] collection) {
        final var size = collection.length;
        if (size == 0)
            throw new NoSuchElementException(new EmptyCollectionException());

        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[size - 1];
        var index = 0;
        while (++index < size)
            newArray[index - 1] = collection[index];
        return newArray;
    }

    @Contract(ALWAYS_NEW_1)
    public static <T extends @Nullable Object> T[] removeLast(final T @Unmodifiable [] collection) {
        final var size = collection.length;
        if (size == 0)
            throw new NoSuchElementException(new EmptyCollectionException());

        final var sizeMinus1 = size - 1;
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[size - 1];
        var index = -1;
        while (++index < sizeMinus1)
            newArray[index] = collection[index];
        return newArray;
    }


    public static <T extends @Nullable Object> T[] removeAll(final T @Unmodifiable [] collection,
                                                             final Collection<? extends @Nullable Object> values) {
        if (values.isEmpty())
            return collection;

        final var size = collection.length;
        if (size == 0)
            return collection;

        final var indexesToKeep = new boolean[size];
        var index1 = -1;
        while (++index1 < size)
            indexesToKeep[index1] = !values.contains(collection[index1]);

        var amountOfElementKept = 0;
        var index2 = -1;
        while (++index2 < size)
            if (indexesToKeep[index2])
                amountOfElementKept++;
        if (amountOfElementKept == 0)
            return collection;

        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[amountOfElementKept];
        var index3 = -1;
        var indexAdded = -1;
        while (++index3 < size)
            if (indexesToKeep[index3])
                newArray[++indexAdded] = collection[index3];
        return newArray;
    }


    /// Removes all the elements that satisfies the given `filter` predicate
    ///
    /// @param collection The collection to possibly remove values
    /// @param filter     A predicate which returns `true` for elements to be removed
    /// @param <T>        The `collection` type
    @Contract(IF_ONLY_2ND_NULL_THEN_1ST_2)
    public static <T extends @Nullable Object> T[] removeIf(final T @Unmodifiable [] collection,
                                                            final @Nullable Predicate<? super T> filter) {
        if (filter == null)
            return collection;

        final var size = collection.length;
        if (size == 0)
            return collection;

        final var indexToRemove = new boolean[size];
        var index1 = -1;
        while (++index1 < size)
            indexToRemove[index1] = filter.test(collection[index1]);

        var amountOfElementToRemove = 0;
        var index2 = -1;
        while (++index2 < size)
            if (indexToRemove[index2])
                amountOfElementToRemove++;
        if (amountOfElementToRemove == 0)
            return collection;

        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[size - amountOfElementToRemove];
        var index3 = -1;
        var indexAdded = -1;
        while (++index3 < size)
            if (!indexToRemove[index3])
                newArray[++indexAdded] = collection[index3];
        return newArray;
    }

    //#endregion -------------------- Remove methods --------------------
    //#region -------------------- Replace methods --------------------

    @Contract(mutates = "param1")
    public static <T extends @Nullable Object> void replaceAll(final T[] collection,
                                                               final UnaryOperator<T> operator) {
        final var size = collection.length;
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            collection[index] = operator.apply(collection[index]);
    }

    //#endregion -------------------- Replace methods --------------------
    //#region -------------------- Retain methods --------------------

    /// Keep all the similar [objects][Object] in the `collection`
    /// that are present in the `values` received
    ///
    /// @param collection The collection to possibly remove values
    /// @param values     The values to keep
    /// @param <T>        The `collection` type
    public static <T extends @Nullable Object> T[] retainAll(final T @Unmodifiable [] collection,
                                                             final Collection<? extends @Nullable Object> values) {
        if (values.isEmpty())
            return collection;

        final var size = collection.length;
        if (size == 0)
            return collection;

        final var indexesToKeep = new boolean[size];
        var index1 = -1;
        while (++index1 < size)
            indexesToKeep[index1] = values.contains(collection[index1]);

        var amountOfElementKept = 0;
        var index2 = -1;
        while (++index2 < size)
            if (indexesToKeep[index2])
                amountOfElementKept++;
        if (amountOfElementKept == 0)
            return collection;

        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[amountOfElementKept];
        var index3 = -1;
        var indexAdded = -1;
        while (++index3 < size)
            if (indexesToKeep[index3])
                newArray[++indexAdded] = collection[index3];
        return newArray;
    }

    //#endregion -------------------- Retain methods --------------------
    //#region -------------------- As subdivided --------------------

    @Experimental
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object> MutableList<T> asSubdivided(final MutableList<? super T> source,
                                                                           final T @Unmodifiable [] reference,
                                                                           final int from,
                                                                           final int to) {
        if (from < 0)
            throw new IndexOutOfBoundsException("Index out of bound. The starting index “" + from + "” cannot be under 0.", from);

        final var size = reference.length;
        if (to > size)
            throw new IndexOutOfBoundsException("Index out of bound. The ending index “" + to + "” cannot be over the size of the collection (" + size + ").", to);
        if (from > to) {
            final var message = "Invalid index range. The ending index “" + to + "” is over the starting index “" + from + "”.";
            throw new IndexOutOfBoundsException(message, (Number) null, new InvalidIndexRangeException(message, from, to));
        }

        return new SubdividedArrayAsMutableList<>(source, new SubdividedMutableArray<>(reference, from, to));
    }


    @Experimental
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object> MutableSortedSet<T> asSubdivided(final MutableSortedSet<? super T> source,
                                                                                final T @Unmodifiable [] reference,
                                                                                final T from,
                                                                                final T to) {
        final var size = reference.length;
        if (size == 0)
            throw new IllegalArgumentException(DEFAULT_MESSAGE);
        if (!has(reference, from))
            if (!has(reference, to))
                throw new IllegalArgumentException("Both starting and ending values (“from” and “to”) do not exist in the SortedSet.");
            else
                throw new IllegalArgumentException("The starting value (“from”) does not exist in the SortedSet.");
        if (!has(reference, to))
            throw new IllegalArgumentException("The ending value (“to”) does not exist in the SortedSet.");

        final var comparator = source.comparator();
        final var comparatorHelper = ComparatorHelper.getInstance();
        return new SubdividedArrayAsMutableSortedSet<>(source, new SubdividedMutableArray<>(reference, _indexFromHashCodeHigherOrEqual(from, reference, size, comparator, comparatorHelper), _indexFromHashCodeHigher(to, reference, size, comparator, comparatorHelper)));
    }

    @Experimental
    @Contract(ALWAYS_NEW_6)
    public static <T extends @Nullable Object> MutableNavigableSet<T> asSubdivided(final MutableNavigableSet<? super T> source,
                                                                                   final T @Unmodifiable [] reference,
                                                                                   final T from,
                                                                                   final boolean fromIsInclusive,
                                                                                   final T to,
                                                                                   final boolean toIsInclusive) {
        final var size = reference.length;
        if (size == 0)
            throw new IllegalArgumentException(DEFAULT_MESSAGE);
        if (!has(reference, from))
            if (!has(reference, to))
                throw new IllegalArgumentException("Both starting and ending values (“from” and “to”) do not exist in the NavigableSet.");
            else
                throw new IllegalArgumentException("The starting value (“from”) does not exist in the NavigableSet.");
        if (!has(reference, to))
            throw new IllegalArgumentException("The ending value (“to”) does not exist in the NavigableSet.");

        final var comparator = source.comparator();
        final var comparatorHelper = ComparatorHelper.getInstance();
        if (fromIsInclusive)
            if (toIsInclusive)
                return new SubdividedArrayAsMutableNavigableSet<>(source, new SubdividedMutableArray<>(reference, _indexFromHashCodeHigherOrEqual(from, reference, size, comparator, comparatorHelper), _indexFromHashCodeHigherOrEqual(to, reference, size, comparator, comparatorHelper)));
            else
                return new SubdividedArrayAsMutableNavigableSet<>(source, new SubdividedMutableArray<>(reference, _indexFromHashCodeHigherOrEqual(from, reference, size, comparator, comparatorHelper), _indexFromHashCodeHigher(to, reference, size, comparator, comparatorHelper)));
        if (toIsInclusive)
            return new SubdividedArrayAsMutableNavigableSet<>(source, new SubdividedMutableArray<>(reference, _indexFromHashCodeHigher(from, reference, size, comparator, comparatorHelper), _indexFromHashCodeHigherOrEqual(to, reference, size, comparator, comparatorHelper)));
        return new SubdividedArrayAsMutableNavigableSet<>(source, new SubdividedMutableArray<>(reference, _indexFromHashCodeHigher(from, reference, size, comparator, comparatorHelper), _indexFromHashCodeHigher(to, reference, size, comparator, comparatorHelper)));

    }


    @Experimental
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableSortedSet<T> asHeadSubdivided(final MutableSortedSet<? super T> source,
                                                                                    final T @Unmodifiable [] reference,
                                                                                    final T to) {
        final var size = reference.length;
        if (size == 0)
            throw new IllegalArgumentException(DEFAULT_MESSAGE);
        if (!has(reference, to))
            throw new IllegalArgumentException("The ending value (“to”) does not exist in the SortedSet.");
        return new SubdividedArrayAsMutableSortedSet<>(source, new SubdividedMutableArray<>(reference, 0, _indexFromHashCodeHigher(to, reference, size, source.comparator(), ComparatorHelper.getInstance())));
    }

    @Experimental
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object> MutableNavigableSet<T> asHeadSubdivided(final MutableNavigableSet<? super T> source,
                                                                                       final T @Unmodifiable [] reference,
                                                                                       final T to,
                                                                                       final boolean isInclusive) {
        final var size = reference.length;
        if (size == 0)
            throw new IllegalArgumentException(DEFAULT_MESSAGE);
        if (!has(reference, to))
            throw new IllegalArgumentException("The ending value (“to”) does not exist in the NavigableSet.");
        if (isInclusive)
            return new SubdividedArrayAsMutableNavigableSet<>(source, new SubdividedMutableArray<>(reference, 0, _indexFromHashCodeHigherOrEqual(to, reference, size, source.comparator(), ComparatorHelper.getInstance())));
        return new SubdividedArrayAsMutableNavigableSet<>(source, new SubdividedMutableArray<>(reference, 0, _indexFromHashCodeHigher(to, reference, size, source.comparator(), ComparatorHelper.getInstance())));
    }

    @Experimental
    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> MutableSortedSet<T> asTailSubdivided(final MutableSortedSet<? super T> source,
                                                                                    final T @Unmodifiable [] reference,
                                                                                    final T from) {
        final var size = reference.length;
        if (size == 0)
            throw new IllegalArgumentException(DEFAULT_MESSAGE);
        if (!has(reference, from))
            throw new IllegalArgumentException("The starting value (“from”) does not exist in the SortedSet.");
        return new SubdividedArrayAsMutableSortedSet<>(source, new SubdividedMutableArray<>(reference, _indexFromHashCodeHigherOrEqual(from, reference, size, source.comparator(), ComparatorHelper.getInstance()), size - 1));
    }

    @Experimental
    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object> MutableNavigableSet<T> asTailSubdivided(final MutableNavigableSet<? super T> source,
                                                                                       final T @Unmodifiable [] reference,
                                                                                       final T from,
                                                                                       final boolean isInclusive) {
        final var size = reference.length;
        if (size == 0)
            throw new IllegalArgumentException(DEFAULT_MESSAGE);
        if (!has(reference, from))
            throw new IllegalArgumentException("The starting value (“from”) does not exist in the NavigableSet.");
        if (isInclusive)
            return new SubdividedArrayAsMutableNavigableSet<>(source, new SubdividedMutableArray<>(reference, _indexFromHashCodeHigherOrEqual(from, reference, size, source.comparator(), ComparatorHelper.getInstance()), size - 1));
        return new SubdividedArrayAsMutableNavigableSet<>(source, new SubdividedMutableArray<>(reference, _indexFromHashCodeHigher(from, reference, size, source.comparator(), ComparatorHelper.getInstance()), size - 1));
    }

    //#endregion -------------------- As subdivided --------------------
    //#region -------------------- Sort methods --------------------

    @Contract(mutates = "param1")
    public static <T extends @Nullable Object> void sort(final T[] collection,
                                                         final @Nullable Comparator<? super T> comparator) {
        final var size = collection.length;
        if (size == 0)
            return;

        //This is the selection sort algorithm
        final var comparatorHelper = ComparatorHelper.getInstance();
        final var sizeMinus1 = size - 1;
        var index1 = -1;
        while (++index1 < sizeMinus1) {
            var minimumIndex = index1;
            var index2 = index1 - 1;
            while (++index2 < size)
                if (comparatorHelper.compare(collection[index2], collection[minimumIndex], comparator) < 0)
                    minimumIndex = index2;

            var temporaryValue = collection[index1];
            collection[index1] = collection[minimumIndex];
            collection[minimumIndex] = temporaryValue;
        }
    }

    //#endregion -------------------- Sort methods --------------------

}

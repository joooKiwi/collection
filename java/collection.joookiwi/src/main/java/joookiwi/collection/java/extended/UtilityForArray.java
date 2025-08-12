package joookiwi.collection.java.extended;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.NavigableSet;
import java.util.SortedSet;
import joookiwi.collection.java.exception.EmptyCollectionException;
import joookiwi.collection.java.exception.IndexOutOfBoundsException;
import joookiwi.collection.java.exception.InvalidIndexRangeException;
import joookiwi.collection.java.exception.NoElementFoundInCollectionException;
import joookiwi.collection.java.helper.ComparatorHelper;
import joookiwi.collection.java.helper.EqualsHelper;
import org.jetbrains.annotations.ApiStatus.Internal;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CollectionConstants.emptyDeque;
import static joookiwi.collection.java.CollectionConstants.emptyList;
import static joookiwi.collection.java.CollectionConstants.emptyNavigableSet;
import static joookiwi.collection.java.CollectionConstants.emptySequencedCollection;
import static joookiwi.collection.java.CollectionConstants.emptySequencedSet;
import static joookiwi.collection.java.CollectionConstants.emptySortedSet;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_3;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_4;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_6;
import static joookiwi.collection.java.exception.EmptyCollectionException.DEFAULT_MESSAGE;
import static joookiwi.collection.java.method.FirstIndexOfOrNull.firstIndexOfOrNull;
import static joookiwi.collection.java.method.Has.has;
import static joookiwi.collection.java.method.LastIndexOfOrNull.lastIndexOfOrNull;

@Internal
@NotNullByDefault
sealed class UtilityForArray
        permits UtilityForMutableArray {

    //#region -------------------- Validation --------------------

    public static <T extends @Nullable Object> void validateValuesForSet(final T @Unmodifiable [] reference) {
        final var size = reference.length;
        if (size == 0)
            return; // Useless to validate since it is empty
        if (size == 1)
            return; // Useless to validate if it has only 1 element

        final var equalHelper = EqualsHelper.getInstance();
        final var tempArray = new Object[size];
        tempArray[0] = reference[0];
        var index1 = 0;
        while (++index1 < size) {
            final var value = reference[index1];
            var index2 = -1; //The index2 should always be under the element that has been validated

            while (++index2 < index1)
                if (equalHelper.equals(tempArray[index2], value))
                    throw new RuntimeException("A duplicate value exist during the creation of a Set.");
            tempArray[index2] = value;
        }
    }

    public static <T extends @Nullable Object> void validateValuesForSortedSet(final T @Unmodifiable [] reference) {
        final var size = reference.length;
        if (size == 0)
            return; // Useless to validate since it is empty
        if (size == 1)
            return; // Useless to validate if it has only 1 element

        final var equalHelper = EqualsHelper.getInstance();
        final var tempArray = new Object[size];
        tempArray[0] = reference[0];
        var index1 = 0;
        while (++index1 < size) {
            final var value = reference[index1];
            var index2 = -1; //The index2 should always be under the element that has been validated

            while (++index2 < index1)
                if (equalHelper.equals(tempArray[index2], value))
                    throw new RuntimeException("A duplicate value exist during the creation of a Set.");
            tempArray[index2] = value;
        }

        final var comparatorHelper = ComparatorHelper.getInstance();
        var index3 = -1;
        while (++index3 < size)
            if (comparatorHelper.compare(reference[index3], reference[index3 + 1]) > 0)
                throw new RuntimeException("A value was not ordered during the creation of a SortedSet.");
    }

    public static <T extends @Nullable Object> void validateValuesForSortedSet(final T @Unmodifiable [] reference,
                                                                               final @Nullable Comparator<? super T> comparator) {
        if (comparator == null) {
            validateValuesForSortedSet(reference);
            return;
        }

        final var size = reference.length;
        if (size == 0)
            return; // Useless to validate since it is empty
        if (size == 1)
            return; // Useless to validate if it has only 1 element

        final var equalHelper = EqualsHelper.getInstance();
        final var tempArray = new Object[size];
        tempArray[0] = reference[0];
        var index1 = 0;
        while (++index1 < size) {
            final var value = reference[index1];
            var index2 = -1; //The index2 should always be under the element that has been validated

            while (++index2 < index1)
                if (equalHelper.equals(tempArray[index2], value))
                    throw new RuntimeException("A duplicate value exist during the creation of a Set.");
            tempArray[index2] = value;
        }

        final var comparatorHelper = ComparatorHelper.getInstance();
        var index3 = -1;
        while (++index3 < size)
            if (comparatorHelper.compare(reference[index3], reference[index3 + 1], comparator) > 0)
                throw new RuntimeException("A value was not ordered during the creation of a SortedSet.");
    }

    //#endregion -------------------- Validation --------------------

    //#region -------------------- Research --------------------

    //#region -------------------- Get --------------------

    /// Get the element at the specified `index` in the `collection`
    ///
    /// @param collection The array to find an index and retrieve a value
    /// @param index The index to retrieve a value
    /// @param <T> The `collection` type
    /// @throws EmptyCollectionException  The `collection` is empty
    /// @throws IndexOutOfBoundsException The index is over the `collection.length`
    public static <T extends @Nullable Object> T get(final T @Unmodifiable [] collection,
                                                     final int index) {
        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionException(DEFAULT_MESSAGE, index);
        if (index > size)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is over the size of the collection (" + size + ").", index);
        return collection[index];
    }

    /// Get the element at the specified `index` in the `collection`
    ///
    /// @param collection The array to find an index and retrieve a value
    /// @param index The index to retrieve a value
    /// @throws EmptyCollectionException  The `collection` is empty
    /// @throws IndexOutOfBoundsException The index is over the `collection.length`
    public static boolean get(final boolean @Unmodifiable [] collection,
                              final int index) {
        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionException(DEFAULT_MESSAGE, index);
        if (index > size)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is over the size of the collection (" + size + ").", index);
        return collection[index];
    }

    /// Get the element at the specified `index` in the `collection`
    ///
    /// @param collection The array to find an index and retrieve a value
    /// @param index The index to retrieve a value
    /// @throws EmptyCollectionException  The `collection` is empty
    /// @throws IndexOutOfBoundsException The index is over the `collection.length`
    public static char get(final char @Unmodifiable [] collection,
                           final int index) {
        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionException(DEFAULT_MESSAGE, index);
        if (index > size)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is over the size of the collection (" + size + ").", index);
        return collection[index];
    }

    /// Get the element at the specified `index` in the `collection`
    ///
    /// @param collection The array to find an index and retrieve a value
    /// @param index The index to retrieve a value
    /// @throws EmptyCollectionException  The `collection` is empty
    /// @throws IndexOutOfBoundsException The index is over the `collection.length`
    public static byte get(final byte @Unmodifiable [] collection,
                           final int index) {
        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionException(DEFAULT_MESSAGE, index);
        if (index > size)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is over the size of the collection (" + size + ").", index);
        return collection[index];
    }

    /// Get the element at the specified `index` in the `collection`
    ///
    /// @param collection The array to find an index and retrieve a value
    /// @param index The index to retrieve a value
    /// @throws EmptyCollectionException  The `collection` is empty
    /// @throws IndexOutOfBoundsException The index is over the `collection.length`
    public static short get(final short @Unmodifiable [] collection,
                            final int index) {
        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionException(DEFAULT_MESSAGE, index);
        if (index > size)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is over the size of the collection (" + size + ").", index);
        return collection[index];
    }

    /// Get the element at the specified `index` in the `collection`
    ///
    /// @param collection The array to find an index and retrieve a value
    /// @param index The index to retrieve a value
    /// @throws EmptyCollectionException  The `collection` is empty
    /// @throws IndexOutOfBoundsException The index is over the `collection.length`
    public static int get(final int @Unmodifiable [] collection,
                          final int index) {
        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionException(DEFAULT_MESSAGE, index);
        if (index > size)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is over the size of the collection (" + size + ").", index);
        return collection[index];
    }

    /// Get the element at the specified `index` in the `collection`
    ///
    /// @param collection The array to find an index and retrieve a value
    /// @param index The index to retrieve a value
    /// @throws EmptyCollectionException  The `collection` is empty
    /// @throws IndexOutOfBoundsException The index is over the `collection.length`
    public static long get(final long @Unmodifiable [] collection,
                           final int index) {
        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionException(DEFAULT_MESSAGE, index);
        if (index > size)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is over the size of the collection (" + size + ").", index);
        return collection[index];
    }

    /// Get the element at the specified `index` in the `collection`
    ///
    /// @param collection The array to find an index and retrieve a value
    /// @param index The index to retrieve a value
    /// @throws EmptyCollectionException  The `collection` is empty
    /// @throws IndexOutOfBoundsException The index is over the `collection.length`
    public static float get(final float @Unmodifiable [] collection,
                            final int index) {
        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionException(DEFAULT_MESSAGE, index);
        if (index > size)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is over the size of the collection (" + size + ").", index);
        return collection[index];
    }

    /// Get the element at the specified `index` in the `collection`
    ///
    /// @param collection The array to find an index and retrieve a value
    /// @param index The index to retrieve a value
    /// @throws EmptyCollectionException  The `collection` is empty
    /// @throws IndexOutOfBoundsException The index is over the `collection.length`
    public static double get(final double @Unmodifiable [] collection,
                             final int index) {
        final var size = collection.length;
        if (size == 0)
            throw new EmptyCollectionException(DEFAULT_MESSAGE, index);
        if (index > size)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is over the size of the collection (" + size + ").", index);
        return collection[index];
    }

    //#endregion -------------------- Get --------------------
    //#region -------------------- Get first --------------------

    /// Get the first element in the `collection`
    ///
    /// @param collection The collection
    /// @param <T> The `collection` type
    /// @throws NoElementFoundInCollectionException The collection `is empty`
    public static <T extends @Nullable Object> T getFirst(final T @Unmodifiable [] collection) {
        if (collection.length == 0)
            throw new NoElementFoundInCollectionException(DEFAULT_MESSAGE);
        return collection[0];
    }

    //#endregion -------------------- Get first --------------------
    //#region -------------------- Get last --------------------

    /// Get the last element in the `collection`
    ///
    /// @param collection The collection
    /// @param <T> The `collection` type
    /// @throws NoElementFoundInCollectionException The collection `is empty`
    public static <T extends @Nullable Object> T getLast(final T @Unmodifiable [] collection) {
        final var size = collection.length;
        if (size == 0)
            throw new NoElementFoundInCollectionException("No element could be found in an empty SortedSet.");
        return collection[size - 1];
    }

    //#endregion -------------------- Get last --------------------


    public static <T extends @Nullable Object> @Nullable T getFirstOrNullUnderOrEqual(final NavigableSet<? super T> source,
                                                                                      final T @Unmodifiable [] reference,
                                                                                      final T value) {
        final var size = reference.length;
        if (size == 0)
            return null;
        if (!has(reference, value))
            return null;

        final var indexFound = _indexFromHashCodeLowerOrEqual(value, reference, size, source.comparator(), ComparatorHelper.getInstance());
        if (indexFound == size - 1)
            return null;
        return reference[indexFound + 1];
    }

    public static <T extends @Nullable Object> @Nullable T getFirstOrNullUnder(final NavigableSet<? super T> source,
                                                                               final T @Unmodifiable [] reference,
                                                                               final T value) {
        final var size = reference.length;
        if (size == 0)
            return null;
        if (!has(reference, value))
            return null;

        final var indexFound = _indexFromHashCodeLower(value, reference, size, source.comparator(), ComparatorHelper.getInstance());
        if (indexFound == size - 1)
            return null;
        return reference[indexFound + 1];
    }

    public static <T extends @Nullable Object> @Nullable T getFirstOrNullOverOrEqual(final NavigableSet<? super T> source,
                                                                                     final T @Unmodifiable [] reference,
                                                                                     final T value) {
        final var size = reference.length;
        if (size == 0)
            return null;
        if (!has(reference, value))
            return null;

        final var indexFound = _indexFromHashCodeHigherOrEqual(value, reference, size, source.comparator(), ComparatorHelper.getInstance());
        if (indexFound == size - 1)
            return null;
        return reference[indexFound + 1];
    }

    public static <T extends @Nullable Object> @Nullable T getFirstOrNullOver(final NavigableSet<? super T> source,
                                                                              final T @Unmodifiable [] reference,
                                                                              final T value) {
        final var size = reference.length;
        if (size == 0)
            return null;
        if (!has(reference, value))
            return null;

        final var indexFound = _indexFromHashCodeHigher(value, reference, size, source.comparator(), ComparatorHelper.getInstance());
        if (indexFound == size - 1)
            return null;
        return reference[indexFound + 1];
    }

    //#endregion -------------------- Research --------------------
    //#region -------------------- Index --------------------

    public static <T extends @Nullable Object> int firstIndexOf(final T @Unmodifiable [] reference,
                                                                final @Nullable Object element) {
        final var index = firstIndexOfOrNull(reference, element);
        if (index == null)
            return -1;
        return index;
    }

    public static <T extends @Nullable Object> int lastIndexOf(final T @Unmodifiable [] reference,
                                                               final @Nullable Object element) {
        final var index = lastIndexOfOrNull(reference, element);
        if (index == null)
            return -1;
        return index;
    }

    //#endregion -------------------- Index --------------------
    //#region -------------------- As subdivided --------------------

    public static <T extends @Nullable Object> ImmutableList<T> asSubdivided(final List<? super T> source,
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

        if (size == 0)
            return emptyList();
        if (from == to)
            return emptyList();
        return new SubdividedArrayAsImmutableList<>(source, new SubdividedArray<>(reference, from, to));
    }


    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object> ImmutableSortedSet<T> asSubdivided(final SortedSet<? super T> source,
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
        return new SubdividedArrayAsImmutableSortedSet<>(source, new SubdividedArray<>(reference, _indexFromHashCodeHigherOrEqual(from, reference, size, comparator, comparatorHelper), _indexFromHashCodeHigher(to, reference, size, comparator, comparatorHelper)));
    }

    @Contract(ALWAYS_NEW_6)
    public static <T extends @Nullable Object> ImmutableNavigableSet<T> asSubdivided(final NavigableSet<? super T> source,
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
                return new SubdividedArrayAsImmutableNavigableSet<>(source, new SubdividedArray<>(reference, _indexFromHashCodeHigherOrEqual(from, reference, size, comparator, comparatorHelper), _indexFromHashCodeHigherOrEqual(to, reference, size, comparator, comparatorHelper)));
            else
                return new SubdividedArrayAsImmutableNavigableSet<>(source, new SubdividedArray<>(reference, _indexFromHashCodeHigherOrEqual(from, reference, size, comparator, comparatorHelper), _indexFromHashCodeHigher(to, reference, size, comparator, comparatorHelper)));
        if (toIsInclusive)
            return new SubdividedArrayAsImmutableNavigableSet<>(source, new SubdividedArray<>(reference, _indexFromHashCodeHigher(from, reference, size, comparator, comparatorHelper), _indexFromHashCodeHigherOrEqual(to, reference, size, comparator, comparatorHelper)));
        return new SubdividedArrayAsImmutableNavigableSet<>(source, new SubdividedArray<>(reference, _indexFromHashCodeHigher(from, reference, size, comparator, comparatorHelper), _indexFromHashCodeHigher(to, reference, size, comparator, comparatorHelper)));

    }


    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> ImmutableSortedSet<T> asHeadSubdivided(final SortedSet<? super T> source,
                                                                                      final T @Unmodifiable [] reference,
                                                                                      final T to) {
        final var size = reference.length;
        if (size == 0)
            throw new IllegalArgumentException(DEFAULT_MESSAGE);
        if (!has(reference, to))
            throw new IllegalArgumentException("The ending value (“to”) does not exist in the SortedSet.");
        return new SubdividedArrayAsImmutableSortedSet<>(source, new SubdividedArray<>(reference, 0, _indexFromHashCodeHigher(to, reference, size, source.comparator(), ComparatorHelper.getInstance())));
    }

    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object> ImmutableNavigableSet<T> asHeadSubdivided(final NavigableSet<? super T> source,
                                                                                         final T @Unmodifiable [] reference,
                                                                                         final T to,
                                                                                         final boolean isInclusive) {
        final var size = reference.length;
        if (size == 0)
            throw new IllegalArgumentException(DEFAULT_MESSAGE);
        if (!has(reference, to))
            throw new IllegalArgumentException("The ending value (“to”) does not exist in the NavigableSet.");
        if (isInclusive)
            return new SubdividedArrayAsImmutableNavigableSet<>(source, new SubdividedArray<>(reference, 0, _indexFromHashCodeHigherOrEqual(to, reference, size, source.comparator(), ComparatorHelper.getInstance())));
        return new SubdividedArrayAsImmutableNavigableSet<>(source, new SubdividedArray<>(reference, 0, _indexFromHashCodeHigher(to, reference, size, source.comparator(), ComparatorHelper.getInstance())));
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> ImmutableSortedSet<T> asTailSubdivided(final SortedSet<? super T> source,
                                                                                      final T @Unmodifiable [] reference,
                                                                                      final T from) {
        final var size = reference.length;
        if (size == 0)
            throw new IllegalArgumentException(DEFAULT_MESSAGE);
        if (!has(reference, from))
            throw new IllegalArgumentException("The starting value (“from”) does not exist in the SortedSet.");
        return new SubdividedArrayAsImmutableSortedSet<>(source, new SubdividedArray<>(reference, _indexFromHashCodeHigherOrEqual(from, reference, size, source.comparator(), ComparatorHelper.getInstance()), size - 1));
    }

    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object> ImmutableNavigableSet<T> asTailSubdivided(final NavigableSet<? super T> source,
                                                                                         final T @Unmodifiable [] reference,
                                                                                         final T from,
                                                                                         final boolean isInclusive) {
        final var size = reference.length;
        if (size == 0)
            throw new IllegalArgumentException(DEFAULT_MESSAGE);
        if (!has(reference, from))
            throw new IllegalArgumentException("The starting value (“from”) does not exist in the NavigableSet.");
        if (isInclusive)
            return new SubdividedArrayAsImmutableNavigableSet<>(source, new SubdividedArray<>(reference, _indexFromHashCodeHigherOrEqual(from, reference, size, source.comparator(), ComparatorHelper.getInstance()), size - 1));
        return new SubdividedArrayAsImmutableNavigableSet<>(source, new SubdividedArray<>(reference, _indexFromHashCodeHigher(from, reference, size, source.comparator(), ComparatorHelper.getInstance()), size - 1));
    }

    //#endregion -------------------- As subdivided --------------------
    //#region -------------------- As reversed --------------------

    public static <T extends @Nullable Object> ImmutableSequencedCollection<T> asReversed(final ImmutableSequencedCollection<T> source,
                                                                                          final T @Unmodifiable [] reference) {
        final var size = reference.length;
        if (size == 0)
            return emptySequencedCollection();
        return new ReversedArrayAsImmutableSequencedCollection<>(source, new ReversedArray<>(reference));
    }

    public static <T extends @Nullable Object> ImmutableList<T> asReversed(final ImmutableList<T> source,
                                                                           final T @Unmodifiable [] reference) {
        final var size = reference.length;
        if (size == 0)
            return emptyList();
        return new ReversedArrayAsImmutableList<>(source, new ReversedArray<>(reference));
    }

    public static <T extends @Nullable Object> ImmutableSequencedSet<T> asReversed(final ImmutableSequencedSet<T> source,
                                                                                   final T @Unmodifiable [] reference) {
        final var size = reference.length;
        if (size == 0)
            return emptySequencedSet();
        return new ReversedArrayAsImmutableSequencedSet<>(source, new ReversedArray<>(reference));
    }

    public static <T extends @Nullable Object> ImmutableSortedSet<T> asReversed(final ImmutableSortedSet<T> source,
                                                                                final T @Unmodifiable [] reference) {
        final var size = reference.length;
        if (size == 0)
            return emptySortedSet();
        return new ReversedArrayAsImmutableSortedSet<>(source, new ReversedArray<>(reference));
    }

    public static <T extends @Nullable Object> ImmutableNavigableSet<T> asReversed(final ImmutableNavigableSet<T> source,
                                                                                   final T @Unmodifiable [] reference) {
        final var size = reference.length;
        if (size == 0)
            return emptyNavigableSet();
        return new ReversedArrayAsImmutableNavigableSet<>(source, new ReversedArray<>(reference));
    }

    public static <T extends @Nullable Object> ImmutableDeque<T> asReversed(final ImmutableDeque<T> source,
                                                                            final T @Unmodifiable [] reference) {
        final var size = reference.length;
        if (size == 0)
            return emptyDeque();
        return new ReversedArrayAsImmutableDeque<>(source, new ReversedArray<>(reference));
    }

    //#endregion -------------------- As reversed --------------------
    //#region -------------------- To subdivided --------------------

    public static <T extends @Nullable Object> T[] toSubdivided(final T @Unmodifiable [] source,
                                                                final int startingIndex,
                                                                final int endingIndex) {
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[endingIndex - startingIndex];
        var indexToAdd = -1;
        var index = startingIndex - 1;
        while (++index <= endingIndex)
            newArray[++indexToAdd] = source[index];
        return newArray;
    }

    //#endregion -------------------- To subdivided --------------------
    //#region -------------------- To reversed --------------------

    public static <T extends @Nullable Object> T[] toReversed(final @Unmodifiable Collection<? extends T> source) {
        final var size = source.size();
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[size];
        var index = size;
        for (final var value : source)
            newArray[--index] = value;
        return newArray;
    }

    public static <T extends @Nullable Object> T[] toReversed(final T @Unmodifiable [] source) {
        final var size = source.length;
        @SuppressWarnings("unchecked cast") final var newArray = (T[]) new Object[size];
        var index = size;
        while (--index >= 0)
            newArray[index] = source[index];
        return newArray;
    }

    //#endregion -------------------- To reversed --------------------

    //#region -------------------- Utility search --------------------

    protected static <T extends @Nullable Object> int _indexFromHashCodeHigherOrEqual(final T value,
                                                                                      final T @Unmodifiable [] reference,
                                                                                      final int size,
                                                                                      final @Nullable Comparator<? super T> comparator,
                                                                                      final ComparatorHelper comparatorHelper) {
        var index = -1;
        while (++index < size)
            if (comparatorHelper.compare(value, reference[index], comparator) >= 0)
                return index - 1;
        return index - 1;
    }

    protected static <T extends @Nullable Object> int _indexFromHashCodeHigher(final T value,
                                                                               final T @Unmodifiable [] reference,
                                                                               final int size,
                                                                               final @Nullable Comparator<? super T> comparator,
                                                                               final ComparatorHelper comparatorHelper) {
        var index = -1;
        while (++index < size)
            if (comparatorHelper.compare(value, reference[index], comparator) > 0)
                return index - 1;
        return index - 1;
    }


    protected static <T extends @Nullable Object> int _indexFromHashCodeLowerOrEqual(final T value,
                                                                                     final T @Unmodifiable [] reference,
                                                                                     final int size,
                                                                                     final @Nullable Comparator<? super T> comparator,
                                                                                     final ComparatorHelper comparatorHelper) {
        var index = size;
        while (--index >= 0)
            if (comparatorHelper.compare(value, reference[index], comparator) <= 0)
                return index + 1;
        return index + 1;
    }

    protected static <T extends @Nullable Object> int _indexFromHashCodeLower(final T value,
                                                                              final T @Unmodifiable [] reference,
                                                                              final int size,
                                                                              final @Nullable Comparator<? super T> comparator,
                                                                              final ComparatorHelper comparatorHelper) {
        var index = size;
        while (--index >= 0)
            if (comparatorHelper.compare(value, reference[index], comparator) < 0)
                return index + 1;
        return index + 1;
    }

    //#endregion -------------------- Utility search --------------------

}

package joookiwi.collection.java.extended;

import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.NavigableSet;
import java.util.SequencedCollection;
import java.util.SequencedSet;
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
import org.jetbrains.annotations.UnmodifiableView;

import static joookiwi.collection.java.CollectionConstants.emptyDeque;
import static joookiwi.collection.java.CollectionConstants.emptyList;
import static joookiwi.collection.java.CollectionConstants.emptyNavigableSet;
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
final class UtilityForArray {

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

    ///
    ///
    /// @param reference
    /// @param index
    /// @return
    /// @param <T>
    /// @throws EmptyCollectionException  The reference is empty
    /// @throws IndexOutOfBoundsException The index is over the `reference.length`
    public static <T extends @Nullable Object> T get(final T @Unmodifiable [] reference,
                                                     final int index) {
        final var size = reference.length;
        if (size == 0)
            throw new EmptyCollectionException(DEFAULT_MESSAGE, index);
        if (index > size)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is over the size of the collection (" + size + ").", index);
        return reference[index];
    }

    ///
    ///
    /// @param reference
    /// @return
    /// @param <T>
    /// @throws NoElementFoundInCollectionException The reference `is empty`
    public static <T extends @Nullable Object> T getFirst(final T @Unmodifiable [] reference) {
        if (reference.length == 0)
            throw new NoElementFoundInCollectionException(DEFAULT_MESSAGE);
        return reference[0];
    }

    ///
    ///
    /// @param reference
    /// @return
    /// @param <T>
    /// @throws NoElementFoundInCollectionException The reference `is empty`
    public static <T extends @Nullable Object> T getLast(final T @Unmodifiable [] reference) {
        final var size = reference.length;
        if (size == 0)
            throw new NoElementFoundInCollectionException("No element could be found in an empty SortedSet.");
        return reference[size - 1];
    }


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

    public static <T extends @Nullable Object> @UnmodifiableView List<T> asSubdivided(final List<? super T> source,
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
        return new SubArrayAsList<>(source, new SubArray<>(reference, from, to));
    }


    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object> @UnmodifiableView SortedSet<T> asSubdivided(final SortedSet<? super T> source,
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
        return new SubArrayAsSortedSet<>(source, new SubArray<>(reference, _indexFromHashCodeHigherOrEqual(from, reference, size, comparator, comparatorHelper), _indexFromHashCodeHigher(to, reference, size, comparator, comparatorHelper)));
    }

    @Contract(ALWAYS_NEW_6)
    public static <T extends @Nullable Object> @UnmodifiableView NavigableSet<T> asSubdivided(final NavigableSet<? super T> source,
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
                return new SubArrayAsNavigableSet<>(source, new SubArray<>(reference, _indexFromHashCodeHigherOrEqual(from, reference, size, comparator, comparatorHelper), _indexFromHashCodeHigherOrEqual(to, reference, size, comparator, comparatorHelper)));
            else
                return new SubArrayAsNavigableSet<>(source, new SubArray<>(reference, _indexFromHashCodeHigherOrEqual(from, reference, size, comparator, comparatorHelper), _indexFromHashCodeHigher(to, reference, size, comparator, comparatorHelper)));
        if (toIsInclusive)
            return new SubArrayAsNavigableSet<>(source, new SubArray<>(reference, _indexFromHashCodeHigher(from, reference, size, comparator, comparatorHelper), _indexFromHashCodeHigherOrEqual(to, reference, size, comparator, comparatorHelper)));
        return new SubArrayAsNavigableSet<>(source, new SubArray<>(reference, _indexFromHashCodeHigher(from, reference, size, comparator, comparatorHelper), _indexFromHashCodeHigher(to, reference, size, comparator, comparatorHelper)));

    }


    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> @UnmodifiableView SortedSet<T> asHeadSubdivided(final SortedSet<? super T> source,
                                                                                               final T @Unmodifiable [] reference,
                                                                                               final T to) {
        final var size = reference.length;
        if (size == 0)
            throw new IllegalArgumentException(DEFAULT_MESSAGE);
        if (!has(reference, to))
            throw new IllegalArgumentException("The ending value (“to”) does not exist in the SortedSet.");
        return new SubArrayAsSortedSet<>(source, new SubArray<>(reference, 0, _indexFromHashCodeHigher(to, reference, size, source.comparator(), ComparatorHelper.getInstance())));
    }

    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object> @UnmodifiableView NavigableSet<T> asHeadSubdivided(final NavigableSet<? super T> source,
                                                                                                  final T @Unmodifiable [] reference,
                                                                                                  final T to,
                                                                                                  final boolean isInclusive) {
        final var size = reference.length;
        if (size == 0)
            throw new IllegalArgumentException(DEFAULT_MESSAGE);
        if (!has(reference, to))
            throw new IllegalArgumentException("The ending value (“to”) does not exist in the NavigableSet.");
        if (isInclusive)
            return new SubArrayAsNavigableSet<>(source, new SubArray<>(reference, 0, _indexFromHashCodeHigherOrEqual(to, reference, size, source.comparator(), ComparatorHelper.getInstance())));
        return new SubArrayAsNavigableSet<>(source, new SubArray<>(reference, 0, _indexFromHashCodeHigher(to, reference, size, source.comparator(), ComparatorHelper.getInstance())));
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> @UnmodifiableView SortedSet<T> asTailSubdivided(final SortedSet<? super T> source,
                                                                                               final T @Unmodifiable [] reference,
                                                                                               final T from) {
        final var size = reference.length;
        if (size == 0)
            throw new IllegalArgumentException(DEFAULT_MESSAGE);
        if (!has(reference, from))
            throw new IllegalArgumentException("The starting value (“from”) does not exist in the SortedSet.");
        return new SubArrayAsSortedSet<>(source, new SubArray<>(reference, _indexFromHashCodeHigherOrEqual(from, reference, size, source.comparator(), ComparatorHelper.getInstance()), size - 1));
    }

    @Contract(ALWAYS_NEW_4)
    public static <T extends @Nullable Object> @UnmodifiableView NavigableSet<T> asTailSubdivided(final NavigableSet<? super T> source,
                                                                                                  final T @Unmodifiable [] reference,
                                                                                                  final T from,
                                                                                                  final boolean isInclusive) {
        final var size = reference.length;
        if (size == 0)
            throw new IllegalArgumentException(DEFAULT_MESSAGE);
        if (!has(reference, from))
            throw new IllegalArgumentException("The starting value (“from”) does not exist in the NavigableSet.");
        if (isInclusive)
            return new SubArrayAsNavigableSet<>(source, new SubArray<>(reference, _indexFromHashCodeHigherOrEqual(from, reference, size, source.comparator(), ComparatorHelper.getInstance()), size - 1));
        return new SubArrayAsNavigableSet<>(source, new SubArray<>(reference, _indexFromHashCodeHigher(from, reference, size, source.comparator(), ComparatorHelper.getInstance()), size - 1));
    }

    //#endregion -------------------- As subdivided --------------------
    //#region -------------------- As reversed --------------------

    public static <T> @UnmodifiableView SequencedCollection<T> asReversed(final SequencedCollection<? super T> source,
                                                                          final T @Unmodifiable [] reference) {
        final var size = reference.length;
        if (size == 0)
            return emptyList();
        return new ReversedArrayAsSequencedCollection<>(source, new ReversedArray<>(reference));
    }

    public static <T> @UnmodifiableView List<T> asReversed(final List<? super T> source,
                                                           final T @Unmodifiable [] reference) {
        final var size = reference.length;
        if (size == 0)
            return emptyList();
        return new ReversedArrayAsList<>(source, new ReversedArray<>(reference));
    }

    public static <T> @UnmodifiableView SequencedSet<T> asReversed(final SequencedSet<? super T> source,
                                                                   final T @Unmodifiable [] reference) {
        final var size = reference.length;
        if (size == 0)
            return emptySortedSet();
        return new ReversedArrayAsSequencedSet<>(source, new ReversedArray<>(reference));
    }

    public static <T> @UnmodifiableView SortedSet<T> asReversed(final SortedSet<? super T> source,
                                                                final T @Unmodifiable [] reference) {
        final var size = reference.length;
        if (size == 0)
            return emptySortedSet();
        return new ReversedArrayAsSortedSet<>(source, new ReversedArray<>(reference));
    }

    public static <T> @UnmodifiableView NavigableSet<T> asReversed(final NavigableSet<? super T> source,
                                                                   final T @Unmodifiable [] reference) {
        final var size = reference.length;
        if (size == 0)
            return emptyNavigableSet();
        return new ReversedArrayAsNavigableSet<>(source, new ReversedArray<>(reference));
    }

    public static <T> @UnmodifiableView Deque<T> asReversed(final Deque<? super T> source,
                                                            final T @Unmodifiable [] reference) {
        final var size = reference.length;
        if (size == 0)
            return emptyDeque();
        return new ReversedArrayAsDeque<>(source, new ReversedArray<>(reference));
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

    private static <T extends @Nullable Object> int _indexFromHashCodeHigherOrEqual(final T value,
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

    private static <T extends @Nullable Object> int _indexFromHashCodeHigher(final T value,
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


    private static <T extends @Nullable Object> int _indexFromHashCodeLowerOrEqual(final T value,
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

    private static <T extends @Nullable Object> int _indexFromHashCodeLower(final T value,
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

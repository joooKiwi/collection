package joookiwi.collection.java.extended;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import java.util.function.IntFunction;
import joookiwi.collection.java.ClassWith1Value;
import joookiwi.collection.java.exception.IndexOutOfBoundsException;
import joookiwi.collection.java.exception.InvalidIndexRangeException;
import joookiwi.collection.java.helper.ComparatorHelper;
import joookiwi.collection.java.iterator.CollectionIteratorOf1;
import org.intellij.lang.annotations.MagicConstant;
import org.jetbrains.annotations.ApiStatus.Internal;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_1ST_3;
import static joookiwi.collection.java.CommonContracts.ALWAYS_1ST_4;
import static joookiwi.collection.java.CommonContracts.ALWAYS_1ST_6;
import static joookiwi.collection.java.CommonContracts.ALWAYS_2ND_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_3;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;
import static joookiwi.collection.java.method.AsString.asString;

@Internal
@NotNullByDefault
public final class UtilityFor1 {

    @Contract(pure = true)
    public static <T extends @Nullable Object> T get(final ClassWith1Value<? extends T> source,
                                                     final int index,
                                                     final @MagicConstant(stringValues = {"List", "ArrayList", "CopyOnWriteArrayList", "LinkedList", "Vector", "Stack",}) String instanceName) {
        if (index < 0)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is under 0.", index);
        if (index > 1)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is over the size of the " + instanceName + " (1).", index);
        if (index == 1)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is the size of the " + instanceName + " (1).", index);
        return source.value();
    }


    public static <T extends @Nullable Object, SOURCE extends ClassWith1Value<? extends T> & OrderableCollection<T>> @Nullable T getFirstOrNullUnderOrEqual(final SOURCE source,
                                                                                                                                                                    final T value) {
        final var instanceValue = source.value();
        if (instanceValue == null)
            return null; // It is always equals to null with the "value" is null or not
        if (_indexFromHashCodeLowerOrEqual(value, instanceValue, source.comparator()) == -1)
            return null;
        return instanceValue;
    }

    public static <T extends @Nullable Object, SOURCE extends ClassWith1Value<? extends T> & OrderableCollection<T>> @Nullable T getFirstOrNullUnder(final SOURCE source,
                                                                                                                                                     final T value) {
        final var instanceValue = source.value();
        if (instanceValue == null)
            return null; // It is always equals to null with the "value" is null or not
        if (_indexFromHashCodeLower(value, instanceValue, source.comparator()) == -1)
            return null;
        return instanceValue;
    }

    public static <T extends @Nullable Object, SOURCE extends ClassWith1Value<? extends T> & OrderableCollection<T>> @Nullable T getFirstOrNullOverOrEqual(final SOURCE source,
                                                                                                                                                           final T value) {
        final var instanceValue = source.value();
        if (instanceValue == null)
            return null; // It is always equals to null with the "value" is null or not
        if (_indexFromHashCodeHigherOrEqual(value, instanceValue, source.comparator()) == -1)
            return null;
        return instanceValue;
    }

    public static <T extends @Nullable Object, SOURCE extends ClassWith1Value<? extends T> & OrderableCollection<T>> @Nullable T getFirstOrNullOver(final SOURCE source,
                                                                                                                                                    final T value) {
        final var instanceValue = source.value();
        if (instanceValue == null)
            return null; // It is always equals to null with the "value" is null or not
        if (_indexFromHashCodeHigher(value, instanceValue, source.comparator()) == -1)
            return null;
        return instanceValue;
    }

    public static <T extends @Nullable Object> @MagicConstant(intValues = {-1, 1,}) int indexOf1Based(final ClassWith1Value<? extends T> source,
                                                                                                      final @Nullable Object element) {
        if (element == null)
            if (source.value() == null)
                return 1;
            else
                return -1;
        if (element.equals(source.value()))
            return 1;
        return -1;
    }

    public static <T extends @Nullable Object> @Range(from = -1, to = 0) int indexOf(final ClassWith1Value<? extends T> source,
                                                                                     final @Nullable Object element) {
        if (element == null)
            if (source.value() == null)
                return 0;
            else
                return -1;
        if (element.equals(source.value()))
            return 0;
        return -1;
    }

    public static <T extends @Nullable Object> @Range(from = -1, to = 0) int indexOf(final ClassWith1Value<? extends T> source,
                                                                                     final @Nullable Object element,
                                                                                     final @Range(from = 0, to = MAX_INT_VALUE) int index) {
        if (element == null)
            if (index == 0)
                if (source.value() == null)
                    return 0;
                else
                    return -1;
            else
                return -1;
        if (index == 0)
            if (element.equals(source.value()))
                return 0;
        return -1;
    }

    @Contract(ALWAYS_1ST_3) public static <T extends @Nullable Object, SOURCE extends ClassWith1Value<? extends T>> SOURCE asSubdivided(final SOURCE source,
                                                                                                                                        final int from,
                                                                                                                                        final int to) {
        if (from < 0)
            throw new IndexOutOfBoundsException("Index out of bound. The starting index “" + from + "” is under 0.", from);
        if (to > 1)
            throw new IndexOutOfBoundsException("Index out of bound. The ending index “" + to + "” is over the ArrayList size “1”.", to);
        if (from > to) {
            final var message = "Invalid index range. The starting index “" + from + "” is over the ending index “" + to + "”.";
            throw new IndexOutOfBoundsException(message, (Number) null, new InvalidIndexRangeException(message, from, to));
        }
        return source;
    }

    @Contract(ALWAYS_1ST_4) public static <T extends @Nullable Object, SOURCE extends ClassWith1Value<? extends T>> SOURCE asSubdivided(final SOURCE source,
                                                                                                                                        final T from,
                                                                                                                                        final T to,
                                                                                                                                        final @MagicConstant(stringValues = {"SortedSet", "NavigableSet", "ConcurrentSkipListSet", "TreeSet",}) String instanceName) {
        final var value = source.value();
        if (value == null)
            if (from == null)
                if (to == null)
                    return source;
                else
                    throw new IllegalArgumentException("The ending value (“to”) is does not exist in the " + instanceName + ".");
            else if (to == null)
                throw new IllegalArgumentException("The starting value (“from”) is does not exist in the " + instanceName + ".");
            else
                throw new IllegalArgumentException("Both starting and ending values (“from” and “to”) is does not exist in the " + instanceName + ".");
        if (value.equals(from))
            if (value.equals(to))
                return source;
            else
                throw new IllegalArgumentException("The ending value (“to”) is does not exist in the " + instanceName + ".");
        if (value.equals(to))
            throw new IllegalArgumentException("The starting value (“from”) is does not exist in the " + instanceName + ".");
        throw new IllegalArgumentException("Both starting and ending values (“from” and “to”) is does not exist in the " + instanceName + ".");
    }

    @Contract(ALWAYS_1ST_6)
    public static <T extends @Nullable Object, SOURCE extends ClassWith1Value<? extends T> & OrderableCollection<T>> SOURCE asSubdivided(final SOURCE source,
                                                                                                                final T from,
                                                                                                                final boolean fromIsInclusive,
                                                                                                                final T to,
                                                                                                                final boolean toIsInclusive,
                                                                                                                final @MagicConstant(stringValues = {"NavigableSet", "ConcurrentSkipListSet", "TreeSet",}) String instanceName) {
        final var value = source.value();
        if (value == null)
            if (from == null)
                if (to == null)
                    return source;
                else
                    throw new IllegalArgumentException("The ending value (“to”) is does not exist in the " + instanceName + ".");
            else if (to == null)
                throw new IllegalArgumentException("The starting value (“from”) is does not exist in the " + instanceName + ".");
            else
                throw new IllegalArgumentException("Both starting and ending values (“from” and “to”) is does not exist in the " + instanceName + ".");
        if (value.equals(from))
            if (value.equals(to))
                return source;
            else
                throw new IllegalArgumentException("The ending value (“to”) is does not exist in the " + instanceName + ".");
        if (value.equals(to))
            throw new IllegalArgumentException("The starting value (“from”) is does not exist in the " + instanceName + ".");
        throw new IllegalArgumentException("Both starting and ending values (“from” and “to”) is does not exist in the " + instanceName + ".");
    }


    @Contract(ALWAYS_1ST_3) public static <T extends @Nullable Object, SOURCE extends ClassWith1Value<? extends T>> SOURCE asHeadSubdivided(final SOURCE source,
                                                                                                                                            final T to,
                                                                                                                                            final @MagicConstant(stringValues = {"SortedSet", "NavigableSet", "ConcurrentSkipListSet", "TreeSet",}) String instanceName) {
        final var value = source.value();
        if (value == null)
            if (to == null)
                return source;
            else
                throw new IllegalArgumentException("The ending value (“to”) is does not exist in the " + instanceName + ".");
        if (value.equals(to))
            return source;
        throw new IllegalArgumentException("The ending value (“to”) is does not exist in the " + instanceName + ".");
    }

    @Contract(ALWAYS_1ST_4)
    public static <T extends @Nullable Object, SOURCE extends ClassWith1Value<? extends T> & OrderableCollection<T>> SOURCE asHeadSubdivided(final SOURCE source,
                                                                                                                    final T to,
                                                                                                                    final boolean isInclusive,
                                                                                                                    final @MagicConstant(stringValues = {"NavigableSet", "ConcurrentSkipListSet", "TreeSet",}) String instanceName) {
        final var value = source.value();
        if (value == null)
            if (to == null)
                return source;
            else
                throw new IllegalArgumentException("The ending value (“to”) is does not exist in the " + instanceName + ".");
        if (value.equals(to))
            return source;
        throw new IllegalArgumentException("The ending value (“to”) is does not exist in the " + instanceName + ".");
    }

    @Contract(ALWAYS_1ST_3) public static <T extends @Nullable Object, SOURCE extends ClassWith1Value<? extends T>> SOURCE asTailSubdivided(final SOURCE source,
                                                                                                                                            final T from,
                                                                                                                                            final @MagicConstant(stringValues = {"SortedSet", "NavigableSet", "ConcurrentSkipListSet", "TreeSet",}) String instanceName) {
        final var value = source.value();
        if (value == null)
            if (from == null)
                return source;
            else
                throw new IllegalArgumentException("The starting value (“from”) is does not exist in the " + instanceName + ".");
        if (value.equals(from))
            return source;
        throw new IllegalArgumentException("The starting value (“from”) is does not exist in the " + instanceName + ".");
    }

    @Contract(ALWAYS_1ST_4)
    public static <T extends @Nullable Object, SOURCE extends ClassWith1Value<? extends T> & OrderableCollection<T>> SOURCE asTailSubdivided(final SOURCE source,
                                                                                                                    final T from,
                                                                                                                    final boolean isInclusive,
                                                                                                                    final @MagicConstant(stringValues = {"NavigableSet", "ConcurrentSkipListSet", "TreeSet",}) String instanceName) {
        final var value = source.value();
        if (value == null)
            if (from == null)
                return source;
            else
                throw new IllegalArgumentException("The starting value (“from”) is does not exist in the " + instanceName + ".");
        if (value.equals(from))
            return source;
        throw new IllegalArgumentException("The starting value (“from”) is does not exist in the " + instanceName + ".");
    }

    @Contract(pure = true)
    public static <T extends @Nullable Object> boolean has(final ClassWith1Value<? extends T> source,
                                                           final @Nullable Object value) {
        if (value == null)
            return source.value() == null;
        return value.equals(source.value());
    }

    public static <T extends @Nullable Object> boolean hasAll(final ClassWith1Value<? extends T> source,
                                                              final @Unmodifiable Collection<?> values) {
        if (values.isEmpty())
            return true;

        final var value = source.value();
        if (value == null) {
            if (values instanceof List<?> valuesAsList1)
                if (values instanceof RandomAccess) {
                    final var valuesSize1 = values.size();
                    var valuesIndex1 = -1;
                    while (++valuesIndex1 < valuesSize1)
                        if (valuesAsList1.get(valuesIndex1) != null)
                            return false;
                    return true;
                }
            final var iterator1 = values.iterator();
            while (iterator1.hasNext()) {
                if (iterator1.next() == null)
                    continue;
                return false;
            }
            return true;
        }
        if (values instanceof List<?> valuesAsList2)
            if (values instanceof RandomAccess) {
                final var valuesSize2 = values.size();
                var valuesIndex2 = -1;
                while (++valuesIndex2 < valuesSize2)
                    if (!value.equals((valuesAsList2.get(valuesIndex2))))
                        return false;
                return true;
            }
        final var iterator2 = values.iterator();
        while (iterator2.hasNext()) {
            if (value.equals(iterator2.next()))
                continue;
            return false;
        }
        return true;
    }

    @SuppressWarnings("unchecked cast")
    @Contract(value = ALWAYS_2ND_2, mutates = "param2")
    public static <T extends @Nullable Object, U extends @Nullable Object> U[] toArray(final ClassWith1Value<? extends T> source,
                                                                                       final U[] newArray) {
        newArray[0] = (U) source.value();
        return newArray;
    }

    @SuppressWarnings("unchecked cast")
    @Contract(ALWAYS_NEW_2)
    public static <T extends @Nullable Object, U extends @Nullable Object> U[] toArray(final ClassWith1Value<? extends T> source,
                                                                                       final IntFunction<U[]> generator) {
        final var newArray = generator.apply(0);
        newArray[0] = (U) source.value();
        return newArray;
    }

    @Contract(ALWAYS_NEW_3)
    public static <T extends @Nullable Object> CollectionIteratorOf1<T> toIterator(final ClassWith1Value<? extends T> source,
                                                                                   final int index,
                                                                                   final @MagicConstant(stringValues = {"List", "ArrayList", "CopyOnWriteArrayList", "LinkedList", "Vector", "Stack",}) String instanceName) {
        if (index < 0)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is under 0.", index);
        if (index > 1)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is over the size of the " + instanceName + " (1).", index);
        if (index == 1)
            throw new IndexOutOfBoundsException("Index out of bound. The index “" + index + "” is the size of the " + instanceName + " (1).", index);
        return new CollectionIteratorOf1<>(source.value());
    }

    public static <T extends @Nullable Object> String toString(final ClassWith1Value<? extends T> source) {
        final var value = source.value();
        if (value == source)
            return "[(this Collection)]";
        return "[" + asString(value) + "]";
    }

    //#region -------------------- Utility search --------------------

    protected static <T extends @Nullable Object> @MagicConstant(intValues = {-1, 0,}) int _indexFromHashCodeHigherOrEqual(final T value,
                                                                                                                           final T instanceValue,
                                                                                                                           final @Nullable Comparator<? super T> comparator) {
        if (ComparatorHelper.getInstance().compare(value, instanceValue, comparator) >= 0)
            return 0;
        return -1;
    }

    protected static <T extends @Nullable Object> @MagicConstant(intValues = {-1, 0,}) int _indexFromHashCodeHigher(final T value,
                                                                                                                    final T instanceValue,
                                                                                                                    final @Nullable Comparator<? super T> comparator) {
        if (ComparatorHelper.getInstance().compare(value, instanceValue, comparator) > 0)
            return 0;
        return -1;
    }


    protected static <T extends @Nullable Object> @MagicConstant(intValues = {-1, 0,}) int _indexFromHashCodeLowerOrEqual(final T value,
                                                                                                                          final T instanceValue,
                                                                                                                          final @Nullable Comparator<? super T> comparator) {
        if (ComparatorHelper.getInstance().compare(value, instanceValue, comparator) <= 0)
            return 0;
        return -1;
    }

    protected static <T extends @Nullable Object> @MagicConstant(intValues = {-1, 0,}) int _indexFromHashCodeLower(final T value,
                                                                                                                   final T instanceValue,
                                                                                                                   final @Nullable Comparator<? super T> comparator) {
        if (ComparatorHelper.getInstance().compare(value, instanceValue, comparator) < 0)
            return 0;
        return -1;
    }

    //#endregion -------------------- Utility search --------------------

}

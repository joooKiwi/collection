package joookiwi.collection.java.extended;

import java.util.Collection;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import java.util.function.Predicate;
import joookiwi.collection.java.exception.UnsupportedMethodException;
import joookiwi.collection.java.helper.ComparatorHelper;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;
import org.jetbrains.annotations.UnmodifiableView;

import static joookiwi.collection.java.CollectionConstants.emptySortedSet;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;

/// A definition of an immutable [SortedSet] to have a common ancestor
///
/// @param <T> The type
/// @see ArrayAsSortedSet
/// @see SubArrayAsSortedSet
/// @see ReversedArrayAsSortedSet
@NotNullByDefault
public abstract class AbstractArrayAsSortedSet<T extends @Nullable Object>
        extends AbstractArrayAsSequencedSet<T>
        implements SortedSet<T>,
                   OrderableCollection<T> {

    //#region -------------------- Fields --------------------

    //#region -------------------- Helper fields --------------------

    private @Nullable ComparatorHelper __comparatorHelper;

    //#endregion -------------------- Helper fields --------------------

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsSortedSet() { super(); }

    /// Validate that no duplicate exists in the `reference` received
    /// and that is ordered (according to its natural ordering)
    ///
    /// @apiNote This method should only be called during the construction
    /// @param reference The reference to validate no duplicate exists
    /// @throws RuntimeException   A duplicate value exists
    /// @throws RuntimeException   One value was not ordered
    /// @throws ClassCastException At least one value was not [Comparable]
    @Override protected void _validateValues(final T[] reference) { UtilityForArray.validateValuesForSortedSet(reference); }

    /// Validate that no duplicate exists in the `reference` received
    /// and that is ordered (using the `comparator`)
    ///
    /// @apiNote This method should only be called during the construction
    /// @param reference  The reference to validate no duplicate exists
    /// @param comparator The [Comparator] to use on its comparisons
    /// @throws RuntimeException   A duplicate value exists
    /// @throws RuntimeException   One value was not ordered
    /// @throws ClassCastException If the `comparator` was `null`, at least one value was not [Comparable]
    protected void _validateValues(final T[] reference, final @Nullable Comparator<? super T> comparator) { UtilityForArray.validateValuesForSortedSet(reference, comparator); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    protected ComparatorHelper _comparatorHelper() {
        final var value = __comparatorHelper;
        if (value != null)
            return value;
        return __comparatorHelper = ComparatorHelper.getInstance();
    }

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    protected int _compare(final T value1, final T value2) throws ClassCastException { return _comparatorHelper().compare(value1, value2, comparator()); }

    protected int _indexFromHashCodeHigherOrEqual(final T value) { return _indexFromHashCodeHigherOrEqual(value, _reference(), size()); }
    protected int _indexFromHashCodeHigherOrEqual(final T value, final T @Unmodifiable [] reference) { return _indexFromHashCodeHigherOrEqual(value, reference, size()); }
    protected int _indexFromHashCodeHigherOrEqual(final T value, final T @Unmodifiable [] reference, final int size) {
        var index = -1;
        while (++index < size)
            if (_compare(value, reference[index]) >= 0)
                return index - 1;
        return index - 1;
    }

    protected int _indexFromHashCodeHigher(final T value) { return _indexFromHashCodeHigher(value, _reference(), size()); }
    protected int _indexFromHashCodeHigher(final T value, final T @Unmodifiable [] reference) { return _indexFromHashCodeHigher(value, reference, size()); }
    protected int _indexFromHashCodeHigher(final T value, final T @Unmodifiable [] reference, final int size) {
        var index = -1;
        while (++index < size)
            if (_compare(value, reference[index]) > 0)
                return index - 1;
        return index - 1;
    }

    //#region -------------------- Supported methods --------------------

    //#region -------------------- Get methods --------------------

    @Contract(pure = true) @Override public T first() { return getFirst(); }

    @Override public T getFirst() {
        if (isEmpty())
            throw new NoSuchElementException("No element could be found in an empty SortedSet.");
        return _reference()[0];
    }


    @Contract(pure = true) @Override public T last() { return getLast(); }

    @Override public T getLast() {
        if (isEmpty())
            throw new NoSuchElementException("No element could be found in an empty SortedSet.");
        return _reference()[size() - 1];
    }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Subset methods --------------------

    // README: By default, “from” is inclusive and “to” is exclusive

    @Override public @UnmodifiableView SortedSet<T> subSet(final T from, final T to) {
        if (!contains(from))
            if (!contains(to))
                throw new IllegalArgumentException("Both starting and ending values (“from” and “to”) do not exist in the SortedSet.");
            else
                throw new IllegalArgumentException("The starting value (“from”) does not exist in the SortedSet.");
        if (!contains(to))
            throw new IllegalArgumentException("The ending value (“to”) does not exist in the SortedSet.");

        final var size = size();
        final var reference = _reference();
        return new SubArrayAsSortedSet<>(this, new SubArray<>(reference, _indexFromHashCodeHigherOrEqual(from, reference, size), _indexFromHashCodeHigher(to, reference, size)));
    }

    @Override public @UnmodifiableView SortedSet<T> headSet(final T to) {
        if (!contains(to))
            throw new IllegalArgumentException("The ending value (“to”) does not exist in the SortedSet.");

        final var reference = _reference();
        return new SubArrayAsSortedSet<>(this, new SubArray<>(reference, 0, _indexFromHashCodeHigher(to, reference)));
    }

    @Override public @UnmodifiableView SortedSet<T> tailSet(final T from) {
        if (!contains(from))
            throw new IllegalArgumentException("The starting value (“from”) does not exist in the SortedSet.");

        final var size = size();
        final var reference = _reference();
        return new SubArrayAsSortedSet<>(this, new SubArray<>(reference, _indexFromHashCodeHigherOrEqual(from, reference, size), size - 1));
    }

    //#endregion -------------------- Subset methods --------------------
    //#region -------------------- As reverse methods --------------------

    @Override public @UnmodifiableView SortedSet<T> reversed() {
        if (isEmpty())
            return emptySortedSet();
        return new ReversedArrayAsSortedSet<>(this, new ReversedArray<>(_reference()));
    }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Comparator methods --------------------

    @Override public abstract @Nullable Comparator<? super T> comparator();

    //#endregion -------------------- Comparator methods --------------------

    @Override public abstract AbstractArrayAsSortedSet<T> clone();

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to add a `value` to the current [instance][SortedSet]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean add(final T value) { throw new UnsupportedMethodException("The method “add” is not supported in an immutable SortedSet."); }

    /// Fail to add a `value` to the current [instance][SortedSet]
    ///
    /// @param value The (_never used_) element to add at the start
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addFirst(T value) { throw new UnsupportedMethodException("The method “addFirst” is not supported in an immutable SortedSet."); }

    /// Fail to add a `value` to the current [instance][SortedSet]
    ///
    /// @param value The (_never used_) element to add at the end
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addLast(T value) { throw new UnsupportedMethodException("The method “addLast” is not supported in an immutable SortedSet."); }

    /// Fail to add the `values` in the current [instance][SortedSet]
    ///
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean addAll(final @Nullable @Unmodifiable Collection<? extends T> values) { throw new UnsupportedMethodException("The method “addAll” is not supported in an immutable SortedSet."); }


    /// Fail to clear the current [instance][SortedSet]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public void clear() { throw new UnsupportedMethodException("The method “clear” is not supported in an immutable SortedSet."); }


    /// Fail to remove a `value` in the current [instance][SortedSet]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean remove(final @Nullable Object value) { throw new UnsupportedMethodException("The method “remove” is not supported in an immutable SortedSet."); }

    /// Fail to remove the first value in the current [instance][SortedSet]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeFirst() { throw new UnsupportedMethodException("The method “removeFirst” is not supported in an immutable SortedSet."); }

    /// Fail to remove the last value in the current [instance][SortedSet]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeLast() { throw new UnsupportedMethodException("The method “removeLast” is not supported in an immutable SortedSet."); }

    /// Fail to remove the `values` in the current [instance][SortedSet]
    ///
    /// @param values The (_never used_) elements to remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedMethodException("The method “removeAll” is not supported in an immutable SortedSet."); }

    /// Fail to remove anything to the current [instance][SortedSet]
    ///
    /// @param filter The (_never used_) predicate
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeIf(final @Nullable Predicate<? super T> filter) { throw new UnsupportedMethodException("The method “removeIf” is not supported in an immutable SortedSet."); }

    /// Fail to keep the `values` in the current [instance][SortedSet]
    ///
    /// @param values The (_never used_) values to keep
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean retainAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedMethodException("The method “retainAll” is not supported in an immutable SortedSet."); }

    //#endregion -------------------- Unsupported methods --------------------

    //#endregion -------------------- Methods --------------------

}

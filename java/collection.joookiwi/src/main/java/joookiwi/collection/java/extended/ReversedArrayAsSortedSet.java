package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Comparator;
import java.util.SortedSet;
import joookiwi.collection.java.helper.ComparatorHelper;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;
import org.jetbrains.annotations.UnmodifiableView;

import static joookiwi.collection.java.CollectionConstants.emptySortedSet;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;

/// An implementation of a reversed-order [SortedSet] similar to the [ArrayAsSortedSet] in its behaviour.
/// During its creation, it <u>implies</u> that the [REVERSED_ARRAY] received has no duplicate.
///
/// Note that `null` is permitted in this instance.
/// It is up to the implementor to specify it.
///
/// The instance uses the [methods][joookiwi.collection.java.method]
/// to give similar implementation to the [joookiwi.collection.java.CollectionHolder]
/// when possible.
///
/// @param <T>               The type
/// @param <SOURCE>          The original source of the instance
///                          (generally a [ArrayAsSortedSet], [SubArrayAsSortedSet] or [ReversedArrayAsSortedSet])
/// @param <REVERSED_ARRAY>> The array that should contain the new reference
/// @see ArrayAsSortedSet
/// @see SubArrayAsSortedSet
@NotNullByDefault
public class ReversedArrayAsSortedSet<T extends @Nullable Object,
        SOURCE extends SortedSet<? super T>,
        REVERSED_ARRAY extends ReversedArray<? extends T>>
        extends ReversedArrayAsSequencedSet<T, SOURCE, REVERSED_ARRAY>
        implements SortedSet<T> {

    //#region -------------------- Fields --------------------

    @Serial private static final long serialVersionUID = -7946450679975875189L;

    //#region -------------------- Helper fields --------------------

    private @Nullable ComparatorHelper __comparatorHelper;

    //#endregion -------------------- Helper fields --------------------

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public ReversedArrayAsSortedSet(SOURCE source, REVERSED_ARRAY reversedArray) { super(source, reversedArray); }

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

    //#region -------------------- Supported methods --------------------

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

    //#region -------------------- Get methods --------------------

    @Contract(pure = true) @Override public T first() { return getFirst(); }

    @Contract(pure = true) @Override public T last() { return getLast(); }

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
    //#region -------------------- To reverse methods --------------------

    @Override public @UnmodifiableView SortedSet<T> reversed() {
        if (isEmpty())
            return emptySortedSet();
        return new ReversedArrayAsSortedSet<>(this, new ReversedArray<>(_reference()));
    }

    //#endregion -------------------- To reverse methods --------------------
    //#region -------------------- Comparator methods --------------------

    @Override public @Nullable Comparator<? super T> comparator() { return _source().comparator(); }

    //#endregion -------------------- Comparator methods --------------------

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to add a `value` as the start of the current [ArrayAsSortedSet]
    ///
    /// @param value the (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addFirst(final @Nullable T value) { throw new UnsupportedOperationException("The method “addFirst” is not supported in an immutable SortedSet."); }

    /// Fail to add a `value` as the end of the current [ArrayAsSortedSet]
    ///
    /// @param value the (_never used_) element to add
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addLast(final @Nullable T value) { throw new UnsupportedOperationException("The method “addLast” is not supported in an immutable SortedSet."); }


    /// Fail to remove the first value of the current [ArrayAsSortedSet]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeFirst() { throw new UnsupportedOperationException("The method “removeFirst” is not supported in an immutable SortedSet."); }

    /// Fail to remove the last value of the current [ArrayAsSortedSet]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T removeLast() { throw new UnsupportedOperationException("The method “removeLast” is not supported in an immutable SortedSet."); }

    //#endregion -------------------- Unsupported methods --------------------

    //#endregion -------------------- Methods --------------------

}

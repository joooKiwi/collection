package joookiwi.collection.java.extended;

import java.io.Serial;
import java.io.Serializable;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import joookiwi.collection.java.helper.ComparatorHelper;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;
import org.jetbrains.annotations.UnmodifiableView;

import static joookiwi.collection.java.CollectionConstants.emptyNavigableSet;
import static joookiwi.collection.java.CommonContracts.*;

/// An implementation of a sub-[NavigableSet] similar to the [ArrayAsNavigableSet] in its behaviour.
/// During its creation, it <u>implies</u> that the [SUB_ARRAY] received has no duplicate.
///
/// Note that `null` is permitted in this instance.
/// It is up to the implementor to specify it.
///
/// The instance uses the [methods][joookiwi.collection.java.method] and [ComparatorHelper]
/// to give similar implementation to the [joookiwi.collection.java.CollectionHolder]
/// when possible.
///
/// @param <T>         The type
/// @param <SOURCE>    The original source of the instance
///                    (generally a [ArrayAsNavigableSet], [SubArrayAsNavigableSet] or [ReversedArrayAsNavigableSet])
/// @param <SUB_ARRAY> The array that should contain the new reference
/// @see ArrayAsNavigableSet
/// @see ReversedArrayAsNavigableSet
@NotNullByDefault
public class SubArrayAsNavigableSet<T extends @Nullable Object,
        SOURCE extends NavigableSet<? super T>,
        SUB_ARRAY extends SubArray<? extends T>>
        extends SubArrayAsSortedSet<T, SOURCE, SUB_ARRAY>
        implements NavigableSet<T> {

    //#region -------------------- Fields --------------------

    @Serial private static final long serialVersionUID = -6249171871739512329L;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public SubArrayAsNavigableSet(final SOURCE source, final SUB_ARRAY subArray) { super(source, subArray); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    protected int _indexFromHashCodeLowerOrEqual(final T value) { return _indexFromHashCodeLowerOrEqual(value, _reference(), size()); }
    protected int _indexFromHashCodeLowerOrEqual(final T value, final T @Unmodifiable [] reference) { return _indexFromHashCodeLowerOrEqual(value, reference, size()); }
    protected int _indexFromHashCodeLowerOrEqual(final T value, final T @Unmodifiable [] reference, final int size) {
        var index = size;
        while (--index >= 0)
            if (_compare(value, reference[index]) <= 0)
                return index + 1;
        return index + 1;
    }

    protected int _indexFromHashCodeLower(final T value) { return _indexFromHashCodeLower(value, _reference(), size()); }
    protected int _indexFromHashCodeLower(final T value, final T @Unmodifiable [] reference) { return _indexFromHashCodeLower(value, reference, size()); }
    protected int _indexFromHashCodeLower(final T value, final T @Unmodifiable [] reference, final int size) {
        var index = size;
        while (--index >= 0)
            if (_compare(value, reference[index]) < 0)
                return index + 1;
        return index + 1;
    }

    //#region -------------------- Supported methods --------------------

    //#region -------------------- Get methods --------------------

    @Override public @Nullable T floor(final T value) { // ≼ than the value
        if (isEmpty())
            return null;
        if (!contains(value))
            return null;

        final var reference = _reference();
        final var size = size();
        final var indexFound = _indexFromHashCodeLowerOrEqual(value, reference, size);
        if (indexFound == size - 1)
            return null;
        return reference[indexFound + 1];
    }

    @Override public @Nullable T lower(final T value) { // < than the value
        if (isEmpty())
            return null;
        if (!contains(value))
            return null;

        final var reference = _reference();
        final var size = size();
        final var indexFound = _indexFromHashCodeLower(value, reference, size);
        if (indexFound == size - 1)
            return null;
        return reference[indexFound + 1];
    }

    @Override public @Nullable T ceiling(final T value) { // ≽ than the value
        if (isEmpty())
            return null;
        if (!contains(value))
            return null;

        final var reference = _reference();
        final var indexFound = _indexFromHashCodeHigherOrEqual(value, reference);
        if (indexFound == 0)
            return null;
        return reference[indexFound - 1];
    }

    @Override public @Nullable T higher(final T value) { // > than the value
        if (isEmpty())
            return null;
        if (!contains(value))
            return null;

        final var reference = _reference();
        final var indexFound = _indexFromHashCodeHigher(value, reference);
        if (indexFound == 0)
            return null;
        return reference[indexFound - 1];
    }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Subset methods --------------------

    @Override public @UnmodifiableView NavigableSet<T> subSet(final T from, final boolean fromIsInclusive, final T to, final boolean toIsInclusive) {
        if (!contains(from))
            if (!contains(to))
                throw new IllegalArgumentException("Both starting and ending values (“from” and “to”) do not exist in the NavigableSet.");
            else
                throw new IllegalArgumentException("The starting value (“from”) does not exist in the NavigableSet.");
        if (!contains(to))
            throw new IllegalArgumentException("The ending value (“to”) does not exist in the NavigableSet.");

        final var size = size();
        final var reference = _reference();
        if (fromIsInclusive)
            if (toIsInclusive)
                return new SubArrayAsNavigableSet<>(this, new SubArray<>(reference, _indexFromHashCodeHigherOrEqual(from, reference, size), _indexFromHashCodeHigherOrEqual(to, reference, size)));
            else
                return new SubArrayAsNavigableSet<>(this, new SubArray<>(reference, _indexFromHashCodeHigherOrEqual(from, reference, size), _indexFromHashCodeHigher(to, reference, size)));
        if (toIsInclusive)
            return new SubArrayAsNavigableSet<>(this, new SubArray<>(reference, _indexFromHashCodeHigher(from, reference, size), _indexFromHashCodeHigherOrEqual(to, reference, size)));
        return new SubArrayAsNavigableSet<>(this, new SubArray<>(reference, _indexFromHashCodeHigher(from, reference, size), _indexFromHashCodeHigher(to, reference, size)));
    }

    @Override public @UnmodifiableView NavigableSet<T> headSet(final T to, final boolean isInclusive) {
        if (!contains(to))
            throw new IllegalArgumentException("The ending value (“to”) does not exist in the NavigableSet.");

        final var reference = _reference();
        if (isInclusive)
            return new SubArrayAsNavigableSet<>(this, new SubArray<>(reference, 0, _indexFromHashCodeHigherOrEqual(to, reference)));
        return new SubArrayAsNavigableSet<>(this, new SubArray<>(reference, 0, _indexFromHashCodeHigher(to, reference)));
    }

    @Override public @UnmodifiableView NavigableSet<T> tailSet(final T from, final boolean isInclusive) {
        if (!contains(from))
            throw new IllegalArgumentException("The starting value (“from”) does not exist in the NavigableSet.");

        final var size = size();
        final var reference = _reference();
        if (isInclusive)
            return new SubArrayAsNavigableSet<>(this, new SubArray<>(reference, _indexFromHashCodeHigherOrEqual(from, reference, size), size - 1));
        return new SubArrayAsNavigableSet<>(this, new SubArray<>(reference, _indexFromHashCodeHigher(from, reference, size), size - 1));
    }

    //#endregion -------------------- Subset methods --------------------
    //#region -------------------- To reverse methods --------------------

    @Override public @UnmodifiableView NavigableSet<T> reversed() {
        if (isEmpty())
            return emptyNavigableSet();
        return new ReversedArrayAsNavigableSet<>(this, new ReversedArray<>(_reference()));
    }

    @Override public @UnmodifiableView NavigableSet<T> descendingSet() { return reversed(); }

    //#endregion -------------------- To reverse methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Override public Iterator<T> descendingIterator() { return new ReversedArrayAsIterator<>(new ReversedArray<>(_reference())); }

    //#endregion -------------------- Iterator methods --------------------

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to retrieve and remove the first value in the current [SubArrayAsNavigableSet]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T pollFirst() { throw new UnsupportedOperationException("The method “pollFirst” is not supported in an immutable NavigableSet."); }

    /// Fail to retrieve and remove the last value in the current [SubArrayAsNavigableSet]
    ///
    /// @throws UnsupportedOperationException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public T pollLast() { throw new UnsupportedOperationException("The method “pollLast” is not supported in an immutable NavigableSet."); }

    //#endregion -------------------- Unsupported methods --------------------

    //#endregion -------------------- Methods --------------------

}

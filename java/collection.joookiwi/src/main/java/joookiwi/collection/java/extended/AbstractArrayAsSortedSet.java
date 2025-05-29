package joookiwi.collection.java.extended;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.function.Predicate;
import joookiwi.collection.java.exception.UnsupportedMethodException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;
import org.jetbrains.annotations.UnmodifiableView;

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
    //#region -------------------- Methods --------------------

    //#region -------------------- Supported methods --------------------

    //#region -------------------- Get methods --------------------

    @Contract(pure = true) @Override public T first() { return getFirst(); }

    @Override public T getFirst() { return UtilityForArray.getFirst(_reference()); }


    @Contract(pure = true) @Override public T last() { return getLast(); }

    @Override public T getLast() { return UtilityForArray.getLast(_reference()); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- As subdivided methods --------------------

    // README: By default, “from” is inclusive and “to” is exclusive

    @Override public @UnmodifiableView SortedSet<T> subSet(final T from, final T to) { return UtilityForArray.asSubdivided(this, _reference(), from, to); }

    @Override public @UnmodifiableView SortedSet<T> headSet(final T to) { return UtilityForArray.asHeadSubdivided(this, _reference(), to); }

    @Override public @UnmodifiableView SortedSet<T> tailSet(final T from) { return UtilityForArray.asTailSubdivided(this, _reference(), from); }

    //#endregion -------------------- As subdivided methods --------------------
    //#region -------------------- As reverse methods --------------------

    @Override public @UnmodifiableView SortedSet<T> reversed() { return UtilityForArray.asReversed(this, _reference()); }

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
    @Override public boolean add(final @Nullable T value) { throw new UnsupportedMethodException("The method “add” is not supported in an immutable SortedSet."); }

    /// Fail to add a `value` to the current [instance][SortedSet]
    ///
    /// @param value The (_never used_) element to add at the start
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addFirst(final @Nullable T value) { throw new UnsupportedMethodException("The method “addFirst” is not supported in an immutable SortedSet."); }

    /// Fail to add a `value` to the current [instance][SortedSet]
    ///
    /// @param value The (_never used_) element to add at the end
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public void addLast(final @Nullable T value) { throw new UnsupportedMethodException("The method “addLast” is not supported in an immutable SortedSet."); }

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

package joookiwi.collection.java.extended;

import java.util.Comparator;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

/// A definition of an [ImmutableSortedSet] to have a common ancestor
///
/// @param <T> The type
/// @see ArrayAsImmutableSortedSet
/// @see SubdividedArrayAsImmutableSortedSet
/// @see ReversedArrayAsImmutableSortedSet
@NotNullByDefault
public abstract class AbstractArrayAsImmutableSortedSet<T extends @Nullable Object>
        extends AbstractArrayAsImmutableSequencedSet<T>
        implements ImmutableSortedSet<T> {

    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsImmutableSortedSet() { super(); }

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

    //#region -------------------- Get methods --------------------

    @Contract(pure = true) @Override public T first() { return getFirst(); }

    @Override public T getFirst() { return UtilityForArray.getFirst(_reference()); }


    @Contract(pure = true) @Override public T last() { return getLast(); }

    @Override public T getLast() { return UtilityForArray.getLast(_reference()); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- As subdivided methods --------------------

    // README: By default, “from” is inclusive and “to” is exclusive

    @Override public ImmutableSortedSet<T> subSet(final T from, final T to) { return UtilityForArray.asSubdivided(this, _reference(), from, to); }

    @Override public ImmutableSortedSet<T> headSet(final T to) { return UtilityForArray.asHeadSubdivided(this, _reference(), to); }

    @Override public ImmutableSortedSet<T> tailSet(final T from) { return UtilityForArray.asTailSubdivided(this, _reference(), from); }

    //#endregion -------------------- As subdivided methods --------------------
    //#region -------------------- As reverse methods --------------------

    @Override public ImmutableSortedSet<T> reversed() { return UtilityForArray.asReversed(this, _reference()); }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Comparator methods --------------------

    @Override public abstract @Nullable Comparator<? super T> comparator();

    //#endregion -------------------- Comparator methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public AbstractArrayAsImmutableSortedSet<T> clone() { return (AbstractArrayAsImmutableSortedSet<T>) super.clone(); }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}

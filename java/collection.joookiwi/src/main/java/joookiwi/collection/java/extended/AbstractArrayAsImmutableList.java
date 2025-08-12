package joookiwi.collection.java.extended;

import java.util.List;
import joookiwi.collection.java.extended.iterator.ArrayAsImmutableListIterator;
import joookiwi.collection.java.extended.iterator.ImmutableListIterator;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;

/// A definition of an [ImmutableList] to have a common ancestor.
/// This class is similar to [java.util.AbstractList] or [java.util.AbstractSequentialList] but for array specifically.
///
/// @param <T> The type
/// @see ArrayAsImmutableList
/// @see SubdividedArrayAsImmutableList
/// @see ReversedArrayAsImmutableList
@NotNullByDefault
public abstract class AbstractArrayAsImmutableList<T extends @Nullable Object>
        extends AbstractArrayAsImmutableSequencedCollection<T>
        implements ImmutableList<T> {

    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsImmutableList() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Get methods --------------------

    @Contract(pure = true)
    @Override public T get(int index) { return UtilityForArray.get(_reference(), index); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Index methods --------------------

    @Override public @Range(from = -1, to = MAX_INT_VALUE) int indexOf(final @Nullable Object element) { return UtilityForArray.firstIndexOf(_reference(), element); }

    @Override public @Range(from = -1, to = MAX_INT_VALUE) int lastIndexOf(final @Nullable Object element) { return UtilityForArray.lastIndexOf(_reference(), element); }

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- As subdivided methods --------------------

    @Override public ImmutableList<T> subList(final int from, final int to) { return UtilityForArray.asSubdivided(this, _reference(), from, to); }

    //#endregion -------------------- As subdivided methods --------------------
    //#region -------------------- As reverse methods --------------------

    @Override public ImmutableList<T> reversed() { return UtilityForArray.asReversed(this, _reference()); }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Override public ImmutableListIterator<T> listIterator() { return new ArrayAsImmutableListIterator<>(_reference()); }

    @Override public ImmutableListIterator<T> listIterator(final int index) { return new ArrayAsImmutableListIterator<>(_reference(), index); }

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- Comparison methods --------------------

    @Contract(value = IF_1ST_NULL_THEN_FALSE_1, pure = true)
    @Override public boolean equals(final @Nullable Object other) {
        if (other == null)
            return false;
        if (other == this)
            return true;
        if (!(other instanceof List<?> otherConverted))
            return false;
        if (size() != otherConverted.size())
            return false;
        return containsAll(otherConverted);
    }

    //#endregion -------------------- Comparison methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public AbstractArrayAsImmutableList<T> clone() { return (AbstractArrayAsImmutableList<T>) super.clone(); }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}

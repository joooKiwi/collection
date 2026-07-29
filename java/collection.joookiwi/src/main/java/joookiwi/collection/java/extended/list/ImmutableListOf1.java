package joookiwi.collection.java.extended.list;

import java.util.List;
import java.util.Objects;
import joookiwi.collection.java.exception.IndexOutOfBoundsException;
import joookiwi.collection.java.exception.InvalidIndexRangeException;
import joookiwi.collection.java.extended.ImmutableSequencedCollectionOf1;
import joookiwi.collection.java.extended.UtilityFor1;
import joookiwi.collection.java.iterator.CollectionIteratorOf1;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_2;
import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;

@NotNullByDefault
public class ImmutableListOf1<T extends @Nullable Object>
        extends ImmutableSequencedCollectionOf1<T>
        implements ImmutableList<T> {

    public ImmutableListOf1(final T value) { super(value); }

    //#region -------------------- Get methods --------------------

    /// @throws IndexOutOfBoundsException The `index` is not **0**
    @Override public T get(final int index) { return UtilityFor1.get(this, index, "List"); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Index methods --------------------

    /// Get the only occurrence equivalent to the value received
    ///
    /// @param element The element to find
    /// @return 0 if equals to [#value] or -1 if not
    @Override public @Range(from = -1, to = 0) int indexOf(final @Nullable Object element) { return UtilityFor1.indexOf(this, element); }

    /// Get the only occurrence equivalent to the value received
    ///
    /// @param element The element to find
    /// @return 0 if equals to [#value] or -1 if not
    @Override public @Range(from = -1, to = 0) int lastIndexOf(final @Nullable Object element) { return indexOf(element); }

    //#endregion -------------------- Index methods --------------------
    //#region -------------------- As subdivided methods --------------------

    /// Give the current instance between both indexes (`from` and `to`)
    ///
    /// @param from The starting index (inclusive)
    /// @param to   The ending index (exclusive)
    /// @throws IndexOutOfBoundsException `from` is under 0
    /// @throws IndexOutOfBoundsException `to` is over 1
    /// @throws IndexOutOfBoundsException `to` is before `from` with a [InvalidIndexRangeException] as the cause
    @Contract(ALWAYS_THIS_2) @Override public ImmutableListOf1<T> subList(final int from, final int to) { return UtilityFor1.asSubdivided(this, from, to); }

    //#endregion -------------------- As subdivided methods --------------------
    //#region -------------------- As reverse methods --------------------

    /// Give the current [instance][ImmutableList] since it would give the same result as a reversed-view
    @Contract(ALWAYS_THIS_0) @Override public ImmutableListOf1<T> reversed() { return this; }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Override public CollectionIteratorOf1<T> listIterator() { return new CollectionIteratorOf1<>(value()); }

    @Override public CollectionIteratorOf1<T> listIterator(final int index) { return UtilityFor1.toIterator(this, index, "List"); }

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
        if (otherConverted.size() != 1)
            return false;
        return Objects.deepEquals(value(), otherConverted.getFirst());
    }

    //#endregion -------------------- Comparison methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public ImmutableListOf1<T> clone() {
        return (ImmutableListOf1<T>) super.clone();
    }

    //#endregion -------------------- Clone methods --------------------

}

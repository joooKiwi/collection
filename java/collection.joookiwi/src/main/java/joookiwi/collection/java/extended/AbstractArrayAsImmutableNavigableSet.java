package joookiwi.collection.java.extended;

import joookiwi.collection.java.extended.iterator.ImmutableIterator;
import joookiwi.collection.java.extended.iterator.ReversedArrayAsImmutableIterator;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

/// A definition of an [ImmutableNavigableSet] to have a common ancestor
///
/// @param <T> The type
/// @see ArrayAsImmutableNavigableSet
/// @see SubdividedArrayAsImmutableNavigableSet
/// @see ReversedArrayAsImmutableNavigableSet
@NotNullByDefault
public abstract class AbstractArrayAsImmutableNavigableSet<T extends @Nullable Object>
        extends AbstractArrayAsImmutableSortedSet<T>
        implements ImmutableNavigableSet<T> {

    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsImmutableNavigableSet() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Get methods --------------------

    @Override public @Nullable T floor(final T value) { return UtilityForArray.getFirstOrNullUnderOrEqual(this, _reference(), value); }

    @Override public @Nullable T lower(final T value) { return UtilityForArray.getFirstOrNullUnder(this, _reference(), value); }

    @Override public @Nullable T ceiling(final T value) { return UtilityForArray.getFirstOrNullOverOrEqual(this, _reference(), value); }

    @Override public @Nullable T higher(final T value) { return UtilityForArray.getFirstOrNullOver(this, _reference(), value); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- As subdivided methods --------------------

    @Override public ImmutableNavigableSet<T> subSet(final T from, final boolean fromIsInclusive, final T to, final boolean toIsInclusive) { return UtilityForArray.asSubdivided(this, _reference(), from, fromIsInclusive, to, toIsInclusive); }

    @Override public ImmutableNavigableSet<T> headSet(final T to, final boolean isInclusive) { return UtilityForArray.asHeadSubdivided(this, _reference(), to, isInclusive); }

    @Override public ImmutableNavigableSet<T> tailSet(final T from, final boolean isInclusive) { return UtilityForArray.asTailSubdivided(this, _reference(), from, isInclusive); }

    //#endregion -------------------- As subdivided methods --------------------
    //#region -------------------- As reversed methods --------------------

    @Override public ImmutableNavigableSet<T> reversed() { return UtilityForArray.asReversed(this, _reference()); }

    @Contract(pure = true)
    @Override public ImmutableNavigableSet<T> descendingSet() { return reversed(); }

    //#endregion -------------------- As reversed methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Override public ImmutableIterator<T> descendingIterator() { return new ReversedArrayAsImmutableIterator<>(new ReversedArray<>(_reference())); }

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- Clone methods --------------------

    @Override public abstract AbstractArrayAsImmutableNavigableSet<T> clone();

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}

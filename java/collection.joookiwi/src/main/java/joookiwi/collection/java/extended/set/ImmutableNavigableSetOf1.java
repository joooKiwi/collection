package joookiwi.collection.java.extended.set;

import java.util.Comparator;
import joookiwi.collection.java.extended.UtilityFor1;
import joookiwi.collection.java.iterator.CollectionIteratorOf1;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;

@NotNullByDefault
public class ImmutableNavigableSetOf1<T extends @Nullable Object>
        extends ImmutableSortedSetOf1<T>
        implements ImmutableNavigableSet<T> {

    //#region -------------------- Constructors --------------------

    public ImmutableNavigableSetOf1(final T value) { super(value); }

    public ImmutableNavigableSetOf1(final T value, final @Nullable Comparator<? super T> comparator) { super(value, comparator); }

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Get methods --------------------

    @Override public @Nullable T floor(final T value) { return UtilityFor1.getFirstOrNullUnderOrEqual(this, value); }

    @Override public @Nullable T lower(final T value) { return UtilityFor1.getFirstOrNullUnder(this, value); }

    @Override public @Nullable T ceiling(final T value) { return UtilityFor1.getFirstOrNullOverOrEqual(this, value); }

    @Override public @Nullable T higher(final T value) { return UtilityFor1.getFirstOrNullOver(this, value); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- As subdivided methods --------------------

    @Override public ImmutableNavigableSetOf1<T> subSet(final T from, final T to) { return UtilityFor1.asSubdivided(this, from, to, "NavigableSet"); }

    @Override public ImmutableNavigableSetOf1<T> subSet(final T from, final boolean fromIsInclusive, final T to, final boolean toIsInclusive) { return UtilityFor1.asSubdivided(this, from, fromIsInclusive, to, toIsInclusive, "NavigableSet"); }


    @Override public ImmutableNavigableSetOf1<T> headSet(final T to) { return UtilityFor1.asHeadSubdivided(this, to, "NavigableSet"); }

    @Override public ImmutableNavigableSetOf1<T> headSet(final T to, final boolean isInclusive) { return UtilityFor1.asHeadSubdivided(this, to, isInclusive, "NavigableSet"); }


    @Override public ImmutableNavigableSetOf1<T> tailSet(final T from) { return UtilityFor1.asTailSubdivided(this, from, "NavigableSet"); }

    @Override public ImmutableNavigableSetOf1<T> tailSet(final T from, final boolean isInclusive) { return UtilityFor1.asTailSubdivided(this, from, isInclusive, "NavigableSet"); }

    //#endregion -------------------- As subdivided methods --------------------
    //#region -------------------- As reversed methods --------------------

    /// Give the current [instance][ImmutableNavigableSetOf1] since it would give the same result as a reversed-view
    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public ImmutableNavigableSetOf1<T> reversed() { return this; }

    /// Give the current [instance][ImmutableNavigableSetOf1] since it would give the same result as a reversed-view
    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public ImmutableNavigableSetOf1<T> descendingSet() { return reversed(); }

    //#endregion -------------------- As reversed methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Override public CollectionIteratorOf1<T> descendingIterator() { return new CollectionIteratorOf1<>(value()); }

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public ImmutableNavigableSetOf1<T> clone() {
        return (ImmutableNavigableSetOf1<T>) super.clone();
    }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}

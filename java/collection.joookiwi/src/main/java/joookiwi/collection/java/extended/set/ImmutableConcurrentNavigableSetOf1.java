package joookiwi.collection.java.extended.set;

import java.util.Comparator;
import joookiwi.collection.java.extended.UtilityFor1;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;

@NotNullByDefault
public class ImmutableConcurrentNavigableSetOf1<T extends @Nullable Object>
        extends ImmutableNavigableSetOf1<T>
        implements ImmutableConcurrentNavigableSet<T> {

    //#region -------------------- Constructors --------------------

    public ImmutableConcurrentNavigableSetOf1(final T value) { super(value); }

    public ImmutableConcurrentNavigableSetOf1(final T value, final @Nullable Comparator<? super T> comparator) { super(value, comparator); }

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- As subdivided methods --------------------

    @Override public ImmutableConcurrentNavigableSetOf1<T> subSet(final T from, final T to) { return UtilityFor1.asSubdivided(this, from, to, "ConcurrentNavigableSet"); }

    @Override public ImmutableConcurrentNavigableSetOf1<T> subSet(final T from, final boolean fromIsInclusive, final T to, final boolean toIsInclusive) { return UtilityFor1.asSubdivided(this, from, fromIsInclusive, to, toIsInclusive, "ConcurrentNavigableSet"); }


    @Override public ImmutableConcurrentNavigableSetOf1<T> headSet(final T to) { return UtilityFor1.asHeadSubdivided(this, to, "ConcurrentNavigableSet"); }

    @Override public ImmutableConcurrentNavigableSetOf1<T> headSet(final T to, final boolean isInclusive) { return UtilityFor1.asHeadSubdivided(this, to, isInclusive, "ConcurrentNavigableSet"); }


    @Override public ImmutableConcurrentNavigableSetOf1<T> tailSet(final T from) { return UtilityFor1.asTailSubdivided(this, from, "ConcurrentNavigableSet"); }

    @Override public ImmutableConcurrentNavigableSetOf1<T> tailSet(final T from, final boolean isInclusive) { return UtilityFor1.asTailSubdivided(this, from, isInclusive, "ConcurrentNavigableSet"); }

    //#endregion -------------------- As subdivided methods --------------------
    //#region -------------------- As reversed methods --------------------

    /// Give the current [instance][ImmutableConcurrentNavigableSetOf1] since it would give the same result as a reversed-view
    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public ImmutableConcurrentNavigableSetOf1<T> reversed() { return this; }

    /// Give the current [instance][ImmutableConcurrentNavigableSetOf1] since it would give the same result as a reversed-view
    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public ImmutableConcurrentNavigableSetOf1<T> descendingSet() { return reversed(); }

    //#endregion -------------------- As reversed methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public ImmutableConcurrentNavigableSetOf1<T> clone() {
        return (ImmutableConcurrentNavigableSetOf1<T>) super.clone();
    }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}

package joookiwi.collection.java.extended;

import java.util.Comparator;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;

@NotNullByDefault
public class ImmutableSortedSetOf1<T extends @Nullable Object>
        extends ImmutableSequencedSetOf1<T>
        implements ImmutableSortedSet<T> {

    //#region -------------------- Fields --------------------

    private final @Nullable Comparator<? super T> __comparator;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructors --------------------

    public ImmutableSortedSetOf1(final T value) {
        super(value);
        __comparator = null;
    }

    public ImmutableSortedSetOf1(final T value, final @Nullable Comparator<? super T> comparator) {
        super(value);
        __comparator = comparator;
    }

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Get methods --------------------

    @Override public T first() { return value(); }

    @Override public T last() { return value(); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- As subdivided methods --------------------

    @Override public ImmutableSortedSetOf1<T> tailSet(final T from) { return UtilityFor1.asTailSubdivided(this, from, "SortedSet"); }

    @Override public ImmutableSortedSetOf1<T> headSet(final T to) { return UtilityFor1.asHeadSubdivided(this, to, "SortedSet"); }

    @Override public ImmutableSortedSetOf1<T> subSet(final T from, final T to) { return UtilityFor1.asSubdivided(this, from, to, "SortedSet"); }

    //#endregion -------------------- As subdivided methods --------------------
    //#region -------------------- As reverse methods --------------------

    /// Give the current [instance][ImmutableSortedSetOf1] since it would give the same result as a reversed-view
    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public ImmutableSortedSetOf1<T> reversed() { return this; }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Comparator methods --------------------

    @Override public @Nullable Comparator<? super T> comparator() { return __comparator; }

    //#endregion -------------------- Comparator methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public ImmutableSortedSetOf1<T> clone() {
        return (ImmutableSortedSetOf1<T>) super.clone();
    }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}

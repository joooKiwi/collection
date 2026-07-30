package joookiwi.collection.java.extended;

import java.util.Comparator;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;

@NotNullByDefault
public class ImmutableSortedCollectionOf1<T>
        extends ImmutableSequencedCollectionOf1<T>
        implements ImmutableSortedCollection<T> {

    //#region -------------------- Fields --------------------

    private final @Nullable Comparator<? super T> __comparator;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructors --------------------

    public ImmutableSortedCollectionOf1(final T value) {
        super(value);
        __comparator = null;
    }

    public ImmutableSortedCollectionOf1(final T value, final @Nullable Comparator<? super T> comparator) {
        super(value);
        __comparator = comparator;
    }

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Comparator methods --------------------

    @Override public @Nullable Comparator<? super T> comparator() { return __comparator; }

    //#endregion -------------------- Comparator methods --------------------
    //#region -------------------- As reverse methods --------------------

    /// Give the current [instance][ImmutableSortedCollectionOf1] since it would give the same result as a reversed-view
    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public ImmutableSortedCollectionOf1<T> reversed() { return this; }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public ImmutableSortedCollectionOf1<T> clone() {
        return (ImmutableSortedCollectionOf1<T>) super.clone();
    }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}

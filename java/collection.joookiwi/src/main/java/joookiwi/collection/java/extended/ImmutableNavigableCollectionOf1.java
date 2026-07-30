package joookiwi.collection.java.extended;

import joookiwi.collection.java.iterator.CollectionIteratorOf1;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import java.util.Comparator;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;

@NotNullByDefault
public class ImmutableNavigableCollectionOf1<T>
        extends ImmutableSortedCollectionOf1<T>
        implements ImmutableNavigableCollection<T> {

    //#region -------------------- Constructors --------------------

    public ImmutableNavigableCollectionOf1(final T value) { super(value); }

    public ImmutableNavigableCollectionOf1(final T value, final @Nullable Comparator<? super T> comparator) { super(value, comparator); }

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Get methods --------------------

    @Override public @Nullable T floor(final T value) { return UtilityFor1.getFirstOrNullUnderOrEqual(this, value); }

    @Override public @Nullable T lower(final T value) { return UtilityFor1.getFirstOrNullUnder(this, value); }

    @Override public @Nullable T ceiling(final T value) { return UtilityFor1.getFirstOrNullOverOrEqual(this, value); }

    @Override public @Nullable T higher(final T value) { return UtilityFor1.getFirstOrNullOver(this, value); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- As reverse methods --------------------

    /// Give the current [instance][ImmutableNavigableCollectionOf1] since it would give the same result as a reversed-view
    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public ImmutableNavigableCollectionOf1<T> reversed() { return this; }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Override public CollectionIteratorOf1<T> descendingIterator() { return new CollectionIteratorOf1<>(value()); }

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public ImmutableNavigableCollectionOf1<T> clone() {
        return (ImmutableNavigableCollectionOf1<T>) super.clone();
    }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}

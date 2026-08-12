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
public class ImmutableConcurrentNavigableCollectionOf1<T>
        extends ImmutableNavigableCollectionOf1<T>
        implements ImmutableConcurrentNavigableCollection<T> {

    //#region -------------------- Constructors --------------------

    public ImmutableConcurrentNavigableCollectionOf1(final T value) { super(value); }

    public ImmutableConcurrentNavigableCollectionOf1(final T value, final @Nullable Comparator<? super T> comparator) { super(value, comparator); }

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- As reverse methods --------------------

    /// Give the current [instance][ImmutableConcurrentNavigableCollectionOf1] since it would give the same result as a reversed-view
    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public ImmutableConcurrentNavigableCollectionOf1<T> reversed() { return this; }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public ImmutableConcurrentNavigableCollectionOf1<T> clone() {
        return (ImmutableConcurrentNavigableCollectionOf1<T>) super.clone();
    }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}

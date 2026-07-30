package joookiwi.collection.java.extended;

import org.jetbrains.annotations.ApiStatus.Experimental;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

@NotNullByDefault
public abstract class AbstractArrayAsMutableSortedCollection<T extends @Nullable Object>
        extends AbstractArrayAsMutableSequencedCollection<T>
        implements MutableSortedCollection<T> {

    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsMutableSortedCollection() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- As reverse methods --------------------

    @Experimental @Override public MutableSortedCollection<T> reversed() { return new ReversedArrayAsMutableSortedCollection<>(this, _addMutator(new ReversedMutableArrayAdaptor<>(this, _reference()))); }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public AbstractArrayAsMutableSortedCollection<T> clone() { return (AbstractArrayAsMutableSortedCollection<T>) super.clone(); }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}

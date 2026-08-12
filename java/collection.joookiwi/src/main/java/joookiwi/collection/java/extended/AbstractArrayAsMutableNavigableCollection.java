package joookiwi.collection.java.extended;

import joookiwi.collection.java.extended.iterator.MutableIterator;
import joookiwi.collection.java.extended.iterator.ReversedArrayAsMutableIterator;
import org.jetbrains.annotations.ApiStatus.Experimental;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

@NotNullByDefault
public abstract class AbstractArrayAsMutableNavigableCollection<T extends @Nullable Object>
        extends AbstractArrayAsMutableSortedCollection<T>
        implements MutableNavigableCollection<T> {

    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsMutableNavigableCollection() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Get methods --------------------

    @Contract(mutates = "this")
    @Override public @Nullable T pollFirst() { return UtilityForMutableArray.getFirstAndRemove(_reference(), this::_reference); }

    @Contract(mutates = "this")
    @Override public @Nullable T pollLast() { return UtilityForMutableArray.getLastAndRemove(_reference(), this::_reference); }


    @Override public @Nullable T floor(final T value) { return UtilityForMutableArray.getFirstOrNullUnderOrEqual(this, _reference(), value); }

    @Override public @Nullable T lower(final T value) { return UtilityForMutableArray.getFirstOrNullUnder(this, _reference(), value); }

    @Override public @Nullable T ceiling(final T value) { return UtilityForMutableArray.getFirstOrNullOverOrEqual(this, _reference(), value); }

    @Override public @Nullable T higher(final T value) { return UtilityForMutableArray.getFirstOrNullOver(this, _reference(), value); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- As reverse methods --------------------

    @Experimental @Override public MutableNavigableCollection<T> reversed() { return new ReversedArrayAsMutableNavigableCollection<>(this, _addMutator(new ReversedMutableArrayAdaptor<>(this, _reference()))); }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Override public MutableIterator<T> descendingIterator() { return new ReversedArrayAsMutableIterator<>(_reference()); }

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public AbstractArrayAsMutableNavigableCollection<T> clone() { return (AbstractArrayAsMutableNavigableCollection<T>) super.clone(); }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}

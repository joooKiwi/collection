package joookiwi.collection.java.extended;

import joookiwi.collection.java.extended.iterator.ImmutableIterator;
import joookiwi.collection.java.extended.iterator.ReversedArrayAsImmutableIterator;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

@NotNullByDefault
public abstract class AbstractArrayAsImmutableNavigableCollection<T extends @Nullable Object>
        extends AbstractArrayAsImmutableSortedCollection<T>
        implements ImmutableNavigableCollection<T> {

    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsImmutableNavigableCollection() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Get methods --------------------

    @Override public @Nullable T floor(final T value) { return UtilityForArray.getFirstOrNullUnderOrEqual(this, _reference(), value); }

    @Override public @Nullable T lower(final T value) { return UtilityForArray.getFirstOrNullUnder(this, _reference(), value); }

    @Override public @Nullable T ceiling(final T value) { return UtilityForArray.getFirstOrNullOverOrEqual(this, _reference(), value); }

    @Override public @Nullable T higher(final T value) { return UtilityForArray.getFirstOrNullOver(this, _reference(), value); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- As reverse methods --------------------

    @Override public ImmutableNavigableCollection<T> reversed() { return UtilityForArray.asReversed(this, _reference()); }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Override public ImmutableIterator<T> descendingIterator() { return new ReversedArrayAsImmutableIterator<>(new ReversedArray<>(_reference())); }

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public AbstractArrayAsImmutableNavigableCollection<T> clone() { return (AbstractArrayAsImmutableNavigableCollection<T>) super.clone(); }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}

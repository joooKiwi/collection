package joookiwi.collection.java.extended;

import joookiwi.collection.java.extended.iterator.ImmutableIterator;
import joookiwi.collection.java.extended.iterator.ReversedArrayAsImmutableIterator;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

@NotNullByDefault
public abstract class AbstractArrayAsImmutableConcurrentNavigableCollection<T extends @Nullable Object>
        extends AbstractArrayAsImmutableNavigableCollection<T>
        implements ImmutableConcurrentNavigableCollection<T> {

    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsImmutableConcurrentNavigableCollection() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- As reverse methods --------------------

    @Override public ImmutableConcurrentNavigableCollection<T> reversed() { return UtilityForArray.asReversed(this, _reference()); }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Override public ImmutableIterator<T> descendingIterator() { return new ReversedArrayAsImmutableIterator<>(new ReversedArray<>(_reference())); }

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public AbstractArrayAsImmutableConcurrentNavigableCollection<T> clone() { return (AbstractArrayAsImmutableConcurrentNavigableCollection<T>) super.clone(); }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}

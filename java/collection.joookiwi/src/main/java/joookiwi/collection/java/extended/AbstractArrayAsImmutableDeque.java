package joookiwi.collection.java.extended;

import joookiwi.collection.java.extended.iterator.ImmutableIterator;
import joookiwi.collection.java.extended.iterator.ReversedArrayAsImmutableIterator;
import joookiwi.collection.java.method.GetFirstOrNull;
import joookiwi.collection.java.method.GetLastOrNull;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

/// A definition of an [ImmutableDeque] to have a common ancestor
///
/// @param <T> The type
/// @see ArrayAsImmutableDeque
/// @see ReversedArrayAsImmutableDeque
@NotNullByDefault
public abstract class AbstractArrayAsImmutableDeque<T extends @Nullable Object>
        extends AbstractArrayAsImmutableSequencedCollection<T>
        implements ImmutableDeque<T> {

    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsImmutableDeque() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Get methods --------------------

    @Contract(pure = true)
    @Override public T element() { return UtilityForArray.getFirst(_reference()); }

    @Contract(pure = true)
    @Override public @Nullable T peek() { return peekFirst(); }

    @Contract(pure = true)
    @Override public @Nullable T peekFirst() { return GetFirstOrNull.getFirstOrNull(_reference()); }

    @Contract(pure = true)
    @Override public @Nullable T peekLast() { return GetLastOrNull.getLastOrNull(_reference()); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- As reverse methods --------------------

    @Override public ImmutableDeque<T> reversed() { return UtilityForArray.asReversed(this, _reference()); }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Override public ImmutableIterator<T> descendingIterator() { return new ReversedArrayAsImmutableIterator<>(new ReversedArray<>(_reference())); }

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public AbstractArrayAsImmutableDeque<T> clone() { return (AbstractArrayAsImmutableDeque<T>) super.clone(); }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}

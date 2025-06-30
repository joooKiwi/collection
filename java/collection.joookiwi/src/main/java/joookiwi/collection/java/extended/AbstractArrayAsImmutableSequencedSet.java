package joookiwi.collection.java.extended;

import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

/// A definition of an [ImmutableSequencedSet] to have a common ancestor
///
/// @param <T> The type
/// @see ArrayAsImmutableSequencedSet
/// @see ReversedArrayAsImmutableSequencedSet
@NotNullByDefault
public abstract class AbstractArrayAsImmutableSequencedSet<T extends @Nullable Object>
        extends AbstractArrayAsImmutableSet<T>
        implements ImmutableSequencedSet<T> {

    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsImmutableSequencedSet() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Get methods --------------------

    @Override public T getFirst() { return UtilityForArray.getFirst(_reference()); }

    @Override public T getLast() { return UtilityForArray.getLast(_reference()); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- As reverse methods --------------------

    @Override public ImmutableSequencedSet<T> reversed() { return UtilityForArray.asReversed(this, _reference()); }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Override public AbstractArrayAsImmutableSequencedSet<T> clone() { return (AbstractArrayAsImmutableSequencedSet<T>) super.clone(); }

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}

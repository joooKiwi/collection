package joookiwi.collection.java.extended;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

/// A definition of an [ImmutableSequencedCollection] to have a common ancestor
///
/// @param <T> The type
/// @see ArrayAsImmutableSequencedCollection
/// @see ReversedArrayAsImmutableSequencedCollection
@NotNullByDefault
public abstract class AbstractArrayAsImmutableSequencedCollection<T extends @Nullable Object>
        extends AbstractArrayAsImmutableCollection<T>
        implements ImmutableSequencedCollection<T> {

    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsImmutableSequencedCollection() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Get methods --------------------

    @Override public T getFirst() { return UtilityForArray.getFirst(_reference()); }

    @Override public T getLast() { return UtilityForArray.getLast(_reference()); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- As reverse methods --------------------

    @Override public ImmutableSequencedCollection<T> reversed() { return UtilityForArray.asReversed(this, _reference()); }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Clone methods --------------------

    @Contract(ALWAYS_NEW_0)
    @Override public abstract AbstractArrayAsImmutableSequencedCollection<T> clone();

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}

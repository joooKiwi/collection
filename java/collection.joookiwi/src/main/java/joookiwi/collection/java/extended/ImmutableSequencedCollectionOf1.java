package joookiwi.collection.java.extended;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;

@NotNullByDefault
public class ImmutableSequencedCollectionOf1<T extends @Nullable Object>
        extends ImmutableCollectionOf1<T>
        implements ImmutableSequencedCollection<T> {

    public ImmutableSequencedCollectionOf1(final T value) { super(value); }

    //#region -------------------- Get methods --------------------

    /// Get the only element in the current [instance][ImmutableSequencedCollectionOf1]
    @Override public T getFirst() { return value(); }

    /// Get the only element in the current [instance][ImmutableSequencedCollectionOf1]
    @Override public T getLast() { return value(); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- As reverse methods --------------------

    /// Give the current [instance][ImmutableSequencedCollectionOf1] since it would give the same result as a reversed-view
    @Contract(ALWAYS_THIS_0) @Override public ImmutableSequencedCollectionOf1<T> reversed() { return this; }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public ImmutableSequencedCollectionOf1<T> clone() {
        return (ImmutableSequencedCollectionOf1<T>) super.clone();
    }

    //#endregion -------------------- Clone methods --------------------

}

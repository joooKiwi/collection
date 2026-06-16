package joookiwi.collection.java.extended;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;

@NotNullByDefault
public class ImmutableSequencedSetOf1<T extends @Nullable Object>
        extends ImmutableSetOf1<T>
        implements ImmutableSequencedSet<T> {

    public ImmutableSequencedSetOf1(final T value) { super(value); }

    //#region -------------------- Get methods --------------------

    /// Get the only element in the current [instance][ImmutableSequencedSetOf1]
    @Override public T getFirst() { return value(); }

    /// Get the only element in the current [instance][ImmutableSequencedSetOf1]
    @Override public T getLast() { return value(); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- As reverse methods --------------------

    /// Give the current [instance][ImmutableSequencedSetOf1] since it would give the same result as a reversed-view
    @Contract(value = ALWAYS_THIS_0, pure = true) @Override public ImmutableSequencedSetOf1<T> reversed() { return this; }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public ImmutableSequencedSetOf1<T> clone() {
        return (ImmutableSequencedSetOf1<T>) super.clone();
    }

    //#endregion -------------------- Clone methods --------------------

}

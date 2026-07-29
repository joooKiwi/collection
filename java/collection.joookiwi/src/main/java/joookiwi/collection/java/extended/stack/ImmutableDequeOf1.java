package joookiwi.collection.java.extended.stack;

import joookiwi.collection.java.extended.ImmutableSequencedCollectionOf1;
import joookiwi.collection.java.iterator.CollectionIteratorOf1;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;

@NotNullByDefault
public class ImmutableDequeOf1<T extends @Nullable Object>
        extends ImmutableSequencedCollectionOf1<T>
        implements ImmutableDeque<T> {

    public ImmutableDequeOf1(final T value) { super(value); }

    //#region -------------------- Get methods --------------------

    @Contract(pure = true)
    @Override public T element() { return value(); }

    @Contract(pure = true)
    @Override public T peek() { return value(); }

    @Contract(pure = true)
    @Override public T peekFirst() { return value(); }

    @Contract(pure = true)
    @Override public T peekLast() { return value(); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- As reverse methods --------------------

    /// Give the current [instance][ImmutableDequeOf1] since it would give the same result as a reversed-view
    @Contract(ALWAYS_THIS_0) @Override public ImmutableDequeOf1<T> reversed() { return this; }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Override public CollectionIteratorOf1<T> descendingIterator() { return new CollectionIteratorOf1<>(value()); }

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public ImmutableDequeOf1<T> clone() {
        return (ImmutableDequeOf1<T>) super.clone();
    }

    //#endregion -------------------- Clone methods --------------------

}

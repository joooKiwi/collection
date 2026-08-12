package joookiwi.collection.java.extended.queue;

import joookiwi.collection.java.extended.ImmutableCollectionOf1;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

@NotNullByDefault
public class ImmutableQueueOf1<T extends @Nullable Object>
        extends ImmutableCollectionOf1<T>
        implements ImmutableQueue<T> {

    public ImmutableQueueOf1(final T value) { super(value); }

    //#region -------------------- Get methods --------------------

    @Override public T element() { return value(); }

    @Override public T peek() { return value(); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public ImmutableQueueOf1<T> clone() {
        return (ImmutableQueueOf1<T>) super.clone();
    }

    //#endregion -------------------- Clone methods --------------------

}

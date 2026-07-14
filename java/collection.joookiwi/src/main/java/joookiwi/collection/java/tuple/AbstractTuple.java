package joookiwi.collection.java.tuple;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

@NotNullByDefault
public abstract class AbstractTuple<T extends @Nullable Object>
        implements Tuple<T> {

    protected AbstractTuple() { super(); }

    @Override public abstract String toString();

    @SuppressWarnings("unchecked cast")
    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public AbstractTuple<T> clone() {
        try {
            return (AbstractTuple<T>) super.clone();
        } catch (final CloneNotSupportedException exception) {
            throw new InternalError("The “clone” method was not expected to be thrown in “" + getClass().getSimpleName() + "”.", exception);
        }
    }

}

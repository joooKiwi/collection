package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.Stack;
import joookiwi.collection.java.exception.UnexpectedCloneableExceptionThrownError;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

/// An mutable behaviour of a [Stack]
///
/// @param <T> The type of the element
@NotNullByDefault
public class MutableStack<T extends @Nullable Object>
        extends Stack<T>
        implements BasicStack<T> {

    @Serial private static final long serialVersionUID = -4904306971730425078L;

    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create a mutable instance of [Stack]
    public MutableStack() { super(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    /// Create a mutable instance of [Stack]
    /// that starts with the `values` received
    public MutableStack(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values) {
        super();
        final var size = elementCount = values.length;
        if (size == 0)
            return;

        final var array = elementData;
        var index = -1;
        while (++index < size)
            array[index] = values[index];
    }

    /// Create a mutable instance of [Stack]
    /// that starts with the `values` received
    public MutableStack(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) {
        super();
        final var size = elementCount = values.size();
        if (size == 0)
            return;
        addAll(values);
    }

    //#endregion -------------------- values --------------------

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    @Override public T getFirst() { return super.getFirst(); }

    @Override public T getLast() { return super.getLast(); }


    @Override public void addFirst(final T value) { super.addFirst(value); }

    @Override public void addLast(final T value) { super.addLast(value); }


    @Override public synchronized T pop() { return super.pop(); }

    @Override public T removeFirst() { return super.removeFirst(); }

    @Override public T removeLast() { return super.removeLast(); }


    @SuppressWarnings("unchecked cast")
    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public MutableStack<T> clone() {
        try {
            return (MutableStack<T>) super.clone();
        } catch (InternalError error) {
            if (error.getCause() instanceof CloneNotSupportedException) // We only want a CloneNotSupportedException that have been thrown, not a similar exception
                throw new UnexpectedCloneableExceptionThrownError(getClass(), error);
            throw error;
        }
    }

    //#endregion -------------------- Methods --------------------

}

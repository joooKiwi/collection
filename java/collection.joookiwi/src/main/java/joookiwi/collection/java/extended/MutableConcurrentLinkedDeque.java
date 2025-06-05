package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedDeque;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

/// A mutable behaviour of a [ConcurrentLinkedDeque]
///
/// @param <T> The type of the element
@NotNullByDefault
public class MutableConcurrentLinkedDeque<T>
        extends ConcurrentLinkedDeque<T>
        implements BasicStack<T>,
                   Cloneable {

    @Serial private static final long serialVersionUID = 1612193267985161344L;

    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create an empty mutable instance of [ConcurrentLinkedDeque]
    public MutableConcurrentLinkedDeque() { super(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    /// Create a mutable instance of [ConcurrentLinkedDeque]
    public MutableConcurrentLinkedDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values) {
        super();
        final var size = values.length;
        if (size == 0)
            return;

        var index = -1;
        while (++index < size)
            offerLast(values[index]);
    }

    /// Create an mutable instance of [ConcurrentLinkedDeque]
    public MutableConcurrentLinkedDeque(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) { super(values); }

    //#endregion -------------------- values --------------------

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    @Contract(pure = true)
    @Override public T getFirst() { return super.getFirst(); }

    @Contract(pure = true)
    @Override public T getLast() { return super.getLast(); }


    @Override public void addFirst(final T value) { super.addFirst(value); }

    @Override public void addLast(final T value) { super.addLast(value); }


    @Override public T pop() { return super.pop(); }

    @Override public T removeFirst() { return super.removeFirst(); }

    @Override public T removeLast() { return super.removeLast(); }


    @Contract(value = ALWAYS_NEW_0, pure = true)
    @Override public MutableConcurrentLinkedDeque<T> clone() { return new MutableConcurrentLinkedDeque<>(this); }

    //#endregion -------------------- Methods --------------------

}

package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.LinkedList;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

/// A mutable behaviour of a [LinkedList]
///
/// @param <T> The type of the element
@NotNullByDefault
public class MutableLinkedList<T extends @Nullable Object>
        extends LinkedList<T> {

    @Serial private static final long serialVersionUID = 6735854745219200945L;

    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create a mutable instance of [LinkedList] that starts empty
    public MutableLinkedList() { super(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    /// Create a mutable instance of [LinkedList]
    public MutableLinkedList(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values) {
        super();

        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            add(values[index]);
    }

    /// Create a mutable instance of [LinkedList]
    public MutableLinkedList(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) {
        super();
        if (values.isEmpty())
            return;
        addAll(values);
    }

    //#endregion -------------------- values --------------------

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    @Contract(ALWAYS_NEW_0)
    @SuppressWarnings("unchecked cast")
    @Override public MutableLinkedList<T> clone() { return new MutableLinkedList<>((LinkedList<T>) super.clone()); }

    //#endregion -------------------- Methods --------------------

}

package joookiwi.collection.java.extended;

import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Unmodifiable;

import java.io.Serial;
import java.util.Collection;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;

/// A mutable behaviour of a [LinkedList]
///
/// @param <T> The type of the element
@NotNullByDefault
public class MutableLinkedList<T>
        extends LinkedList<T> {

    @Serial private static final long serialVersionUID = 7547886904697591729L;

    //#region -------------------- ∅ --------------------

    /// Create a mutable instance of [LinkedList] that start empty
    public MutableLinkedList() { super(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    /// Create a mutable instance of [LinkedList]
    public MutableLinkedList(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @NotNull @Unmodifiable [] values) {
        super();

        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            add(values[index]);
    }

    /// Create a mutable instance of [LinkedList]
    public MutableLinkedList(final @Flow(sourceIsContainer = true, targetIsContainer = true) @NotNull @Unmodifiable Collection<? extends T> values) {
        super();
        if (values.isEmpty())
            return;
        addAll(values);
    }

    //#endregion -------------------- values --------------------

}

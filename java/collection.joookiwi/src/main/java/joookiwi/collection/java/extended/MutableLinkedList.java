package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.LinkedList;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/// A mutable behaviour of a [LinkedList]
///
/// @param <T> The type of the element
@NotNullByDefault
public class MutableLinkedList<T extends @Nullable Object>
        extends LinkedList<T> {

    @Serial private static final long serialVersionUID = 7547886904697591729L;

    //#region -------------------- ∅ --------------------

    /// Create a mutable instance of [LinkedList] that start empty
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

}

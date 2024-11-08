package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArraySet;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Unmodifiable;

/// A mutable behaviour of a [CopyOnWriteArraySet]
///
/// @param <T> The type of the element
@NotNullByDefault
public class MutableCopyOnWriteArraySet<T>
        extends CopyOnWriteArraySet<T> {

    @Serial private static final long serialVersionUID = -6307287942052097954L;

    //#region -------------------- ∅ --------------------

    /// Create a mutable instance of [CopyOnWriteArraySet] that start empty
    /// with an initial capacity of [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY]
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    public MutableCopyOnWriteArraySet() { super(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    /// Create a mutable instance of [CopyOnWriteArraySet]
    /// with the capacity of the `values.length`
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    public MutableCopyOnWriteArraySet(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @NotNull @Unmodifiable [] values) {
        super();
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            super.add(values[index]);
    }

    /// Create a mutable instance of [CopyOnWriteArraySet]
    /// with the capacity of <code>values.[size][Collection#size()]</code>
    /// and a load factor of [0.75][joookiwi.collection.java.CollectionConstants#DEFAULT_EMPTY_LOAD_FACTOR]
    public MutableCopyOnWriteArraySet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @NotNull @Unmodifiable Collection<? extends T> values) {
        super();
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    //#endregion -------------------- values --------------------

}

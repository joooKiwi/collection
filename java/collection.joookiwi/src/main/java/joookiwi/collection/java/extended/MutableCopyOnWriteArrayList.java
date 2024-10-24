package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Unmodifiable;

/// A mutable behaviour of a [CopyOnWriteArrayList]
///
/// @param <T> The type of the element
@NotNullByDefault
public class MutableCopyOnWriteArrayList<T>
        extends CopyOnWriteArrayList<T> {

    @Serial private static final long serialVersionUID = 6253245103859034347L;

    //#region -------------------- ∅ --------------------

    /// Create a mutable instance of [CopyOnWriteArrayList] that start empty
    public MutableCopyOnWriteArrayList() { super(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    /// Create a mutable instance of [CopyOnWriteArrayList]
    public MutableCopyOnWriteArrayList(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @NotNull @Unmodifiable [] values) { super(values); }

    /// Create a mutable instance of [CopyOnWriteArrayList]
    public MutableCopyOnWriteArrayList(final @Flow(sourceIsContainer = true, targetIsContainer = true) @NotNull @Unmodifiable Collection<? extends T> values) { super(values); }

    //#endregion -------------------- values --------------------

}

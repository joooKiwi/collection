package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

/// A mutable behaviour of a [CopyOnWriteArrayList]
///
/// @param <T> The type of the element
@NotNullByDefault
public class MutableCopyOnWriteArrayList<T extends @Nullable Object>
        extends CopyOnWriteArrayList<T> {

    @Serial private static final long serialVersionUID = -4131727169165089232L;

    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create a mutable instance of [CopyOnWriteArrayList] that starts empty
    public MutableCopyOnWriteArrayList() { super(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    /// Create a mutable instance of [CopyOnWriteArrayList]
    public MutableCopyOnWriteArrayList(final @Flow(sourceIsContainer = true, targetIsContainer = true) T @Unmodifiable [] values) { super(values); }

    /// Create a mutable instance of [CopyOnWriteArrayList]
    public MutableCopyOnWriteArrayList(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) { super(values); }

    //#endregion -------------------- values --------------------

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    @Contract(value = ALWAYS_NEW_0, pure = true)
    @Override public MutableCopyOnWriteArrayList<T> clone() { return new MutableCopyOnWriteArrayList<>(this); }

    //#endregion -------------------- Methods --------------------

}

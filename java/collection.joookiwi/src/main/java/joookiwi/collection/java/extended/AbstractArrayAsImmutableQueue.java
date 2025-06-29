package joookiwi.collection.java.extended;

import joookiwi.collection.java.method.GetFirstOrNull;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

/// A definition of an [ImmutableQueue] to have a common ancestor.
/// This class is similar to [java.util.AbstractQueue] but for array specifically.
///
/// @param <T> The type
/// @see ArrayAsImmutableQueue
@NotNullByDefault
public abstract class AbstractArrayAsImmutableQueue<T extends @Nullable Object>
        extends AbstractArrayAsImmutableCollection<T>
        implements ImmutableQueue<T> {

    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsImmutableQueue() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Get methods --------------------

    @Contract(pure = true)
    @Override public T element() { return UtilityForArray.getFirst(_reference()); }

    @Contract(pure = true)
    @Override public @Nullable T peek() { return GetFirstOrNull.getFirstOrNull(_reference()); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Clone methods --------------------

    @Override public abstract AbstractArrayAsImmutableQueue<T> clone();

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}

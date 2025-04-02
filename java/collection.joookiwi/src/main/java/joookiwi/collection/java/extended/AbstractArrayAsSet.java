package joookiwi.collection.java.extended;

import java.util.Set;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;

/// A definition of an immutable [Set] to have a common ancestor.
/// This class is similar to [java.util.AbstractSet] but for array specifically.
///
/// @param <T> The type
/// @see ArrayAsSet
@NotNullByDefault
public abstract class AbstractArrayAsSet<T extends @Nullable Object>
        extends AbstractArrayAsCollection<T>
        implements Set<T> {

    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsSet() { super(); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Method --------------------

    @Contract(value = IF_1ST_NULL_THEN_FALSE_1, pure = true)
    @Override public boolean equals(final @Nullable Object other) {
        if (other == null)
            return false;
        if (other == this)
            return true;
        if (!(other instanceof Set<?> otherConverted))
            return false;
        if (size() != otherConverted.size())
            return false;
        return containsAll(otherConverted);
    }

    //#endregion -------------------- Method --------------------

}

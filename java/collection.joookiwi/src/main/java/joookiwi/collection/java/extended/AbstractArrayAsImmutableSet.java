package joookiwi.collection.java.extended;

import java.util.Set;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.IF_1ST_NULL_THEN_FALSE_1;

/// A definition of an [ImmutableSet] to have a common ancestor.
/// This class is similar to [java.util.AbstractSet] but for array specifically.
///
/// @param <T> The type
/// @see ArrayAsImmutableSet
@NotNullByDefault
public abstract class AbstractArrayAsImmutableSet<T extends @Nullable Object>
        extends AbstractArrayAsImmutableCollection<T>
        implements ImmutableSet<T> {

    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsImmutableSet() { super(); }

    /// Validate that no duplicate exists in the `reference` received
    ///
    /// @apiNote This method should only be called during the construction
    /// @param reference The reference to validate no duplicate exists
    /// @throws RuntimeException A duplicate value exists
    protected void _validateValues(final T[] reference) { UtilityForArray.validateValuesForSet(reference); }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Comparison methods --------------------

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

    //#endregion -------------------- Comparison methods --------------------
    //#region -------------------- Clone methods --------------------

    @Override public abstract AbstractArrayAsImmutableSet<T> clone();

    //#endregion -------------------- Clone methods --------------------

    //#endregion -------------------- Methods --------------------

}

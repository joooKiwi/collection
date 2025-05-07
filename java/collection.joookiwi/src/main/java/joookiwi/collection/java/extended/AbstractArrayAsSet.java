package joookiwi.collection.java.extended;

import java.util.Collection;
import java.util.Set;
import java.util.function.Predicate;
import joookiwi.collection.java.exception.UnsupportedMethodException;
import joookiwi.collection.java.helper.EqualsHelper;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;
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

    //#region -------------------- Fields --------------------

    //#region -------------------- Helper fields --------------------

    private @Nullable EqualsHelper __equalsHelper;

    //#endregion -------------------- Helper fields --------------------

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    protected AbstractArrayAsSet() { super(); }

    /// Validate that no duplicate exists in the `reference` received
    ///
    /// @apiNote This method should only be called during the construction
    /// @param reference The reference to validate no duplicate exists
    /// @throws RuntimeException A duplicate value exists
    protected void _validateValues(final T[] reference) {
        final var size = reference.length;
        if (size == 0)
            return; // Useless to validate since it is empty
        if (size == 1)
            return; // Useless to validate if it has only 1 element

        final var equalHelper = _equalsHelper();
        final var tempArray = new Object[size];
        tempArray[0] = reference[0];
        var index1 = 0;
        while (++index1 < size) {
            final var value = reference[index1];
            var index2 = -1; //The index2 should always be under the element that has been validated

            while (++index2 < index1)
                if (equalHelper.equals(tempArray[index2], value))
                    throw new RuntimeException("A duplicate value exist during the creation of a Set.");
            tempArray[index2] = value;
        }
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Getter methods --------------------

    protected EqualsHelper _equalsHelper() {
        final var value = __equalsHelper;
        if (value != null)
            return value;
        return __equalsHelper = EqualsHelper.getInstance();
    }

    //#endregion -------------------- Getter methods --------------------
    //#region -------------------- Methods --------------------

    //#region -------------------- Supported methods --------------------

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

    @Override public abstract AbstractArrayAsSet<T> clone();

    //#endregion -------------------- Supported methods --------------------
    //#region -------------------- Unsupported methods --------------------

    /// Fail to add a `value` to the current [instance][Set]
    ///
    /// @param value The (_never used_) element to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean add(final @Nullable T value) { throw new UnsupportedMethodException("The method “add” is not supported in an immutable Set."); }

    /// Fail to add the `values` in the current [instance][Set]
    ///
    /// @param values The (_never used_) elements to add
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean addAll(final @Nullable @Unmodifiable Collection<? extends T> values) { throw new UnsupportedMethodException("The method “addAll” is not supported in an immutable Set."); }


    /// Fail to clear the current [instance][Set]
    ///
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_0)
    @Override public void clear() { throw new UnsupportedMethodException("The method “clear” is not supported in an immutable Set."); }


    /// Fail to remove a `value` in the current [instance][Set]
    ///
    /// @param value The (_never used_) element to remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean remove(final @Nullable Object value) { throw new UnsupportedMethodException("The method “remove” is not supported in an immutable Set."); }

    /// Fail to remove the `values` in the current [instance][Set]
    ///
    /// @param values The (_never used_) elements to remove
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedMethodException("The method “removeAll” is not supported in an immutable Set."); }

    /// Fail to remove anything to the current [instance][Set]
    ///
    /// @param filter The (_never used_) predicate
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean removeIf(final @Nullable Predicate<? super T> filter) { throw new UnsupportedMethodException("The method “removeIf” is not supported in an immutable Set."); }

    /// Fail to keep the `values` in the current [instance][Set]
    ///
    /// @param values The (_never used_) values to keep
    /// @throws UnsupportedMethodException The method is not supported
    @Contract(ALWAYS_FAIL_1)
    @Override public boolean retainAll(final @Nullable @Unmodifiable Collection<?> values) { throw new UnsupportedMethodException("The method “retainAll” is not supported in an immutable Set."); }

    //#endregion -------------------- Unsupported methods --------------------

    //#endregion -------------------- Methods --------------------

}

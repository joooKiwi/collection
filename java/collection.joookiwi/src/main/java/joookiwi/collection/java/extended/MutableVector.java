package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.Vector;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static java.lang.Integer.MAX_VALUE;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_EMPTY_CAPACITY_INCREMENT;
import static joookiwi.collection.java.CollectionConstants.DEFAULT_INITIAL_CAPACITY;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;

/// A mutable behaviour of a [Vector]
///
/// @param <T> The type of the element
@NotNullByDefault
public class MutableVector<T extends @Nullable Object>
        extends Vector<T> {

    @Serial private static final long serialVersionUID = -5379583952948526076L;

    //#region -------------------- Constructors --------------------

    //#region -------------------- ∅ --------------------

    /// Create a mutable instance of [Vector] that starts empty
    /// with an initial capacity of [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY]
    /// and the capacity increment of `0`
    public MutableVector() { super(DEFAULT_INITIAL_CAPACITY, DEFAULT_EMPTY_CAPACITY_INCREMENT); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- initialCapacity --------------------

    /// Create a mutable instance of [Vector]
    /// with the `initialCapacity` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableVector(final @Range(from = 0, to = MAX_VALUE) byte initialCapacity) { super(initialCapacity, DEFAULT_EMPTY_CAPACITY_INCREMENT); }

    /// Create a mutable instance of [Vector]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableVector(final @Range(from = 0, to = MAX_VALUE) @Nullable Byte initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, DEFAULT_EMPTY_CAPACITY_INCREMENT); }

    /// Create a mutable instance of [Vector]
    /// with the `initialCapacity` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableVector(final @Range(from = 0, to = MAX_VALUE) short initialCapacity) { super(initialCapacity, DEFAULT_EMPTY_CAPACITY_INCREMENT); }

    /// Create a mutable instance of [Vector]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableVector(final @Range(from = 0, to = MAX_VALUE) @Nullable Short initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, DEFAULT_EMPTY_CAPACITY_INCREMENT); }

    /// Create a mutable instance of [Vector]
    /// with the `initialCapacity` received
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableVector(final @Range(from = 0, to = MAX_VALUE) int initialCapacity) { super(initialCapacity, DEFAULT_EMPTY_CAPACITY_INCREMENT); }

    /// Create a mutable instance of [Vector]
    /// with the `initialCapacity` received (_or [16][joookiwi.collection.java.CollectionConstants#DEFAULT_INITIAL_CAPACITY] if it was `null`_)
    ///
    /// @throws IllegalArgumentException The `initialCapacity` was negative
    public MutableVector(final @Range(from = 0, to = MAX_VALUE) @Nullable Integer initialCapacity) { super(initialCapacity == null ? DEFAULT_INITIAL_CAPACITY : initialCapacity, DEFAULT_EMPTY_CAPACITY_INCREMENT); }

    //#endregion -------------------- initialCapacity --------------------
    //#region -------------------- values --------------------

    /// Create a mutable instance of [Vector]
    /// with the initial capacity as the `values.length`
    /// and the capacity increment of `0`
    public MutableVector(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values) {
        super(values.length, DEFAULT_EMPTY_CAPACITY_INCREMENT);
        final var size = elementCount = values.length;
        if (size == 0)
            return;

        final var array = elementData;
        var index = -1;
        while (++index < size)
            array[index] = values[index];
    }

    /// Create a mutable instance of [Vector]
    /// with the initial capacity as <code>values.[size][Collection#size()]</code>
    /// and the capacity increment of `0`
    public MutableVector(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) {
        super(values.size(), DEFAULT_EMPTY_CAPACITY_INCREMENT);
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    //#endregion -------------------- values --------------------

    //#endregion -------------------- Constructors --------------------
    //#region -------------------- Methods --------------------

    @Contract(ALWAYS_NEW_0)
    @SuppressWarnings("unchecked cast")
    @Override public MutableVector<T> clone() { return new MutableVector<>((Vector<T>) super.clone()); }

    //#endregion -------------------- Methods --------------------

}

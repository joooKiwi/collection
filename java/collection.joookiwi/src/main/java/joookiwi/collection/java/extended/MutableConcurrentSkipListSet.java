package joookiwi.collection.java.extended;

import java.io.Serial;
import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListSet;
import org.intellij.lang.annotations.Flow;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

/// A mutable behaviour of a [ConcurrentSkipListSet]
///
/// @param <T> The type of the element
@NotNullByDefault
public class MutableConcurrentSkipListSet<T>
        extends ConcurrentSkipListSet<T> {

    @Serial private static final long serialVersionUID = 4781415824411035935L;

    //#region -------------------- ∅ --------------------

    /// Create a mutable instance of [ConcurrentSkipListSet] that start empty
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutableConcurrentSkipListSet() { super(); }

    //#endregion -------------------- ∅ --------------------
    //#region -------------------- values --------------------

    /// Create a mutable instance of [ConcurrentSkipListSet]
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutableConcurrentSkipListSet(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values) {
        super();
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            super.add(values[index]);
    }

    /// Create a mutable instance of [ConcurrentSkipListSet]
    /// with its [natural ordering][Comparator#naturalOrder]
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutableConcurrentSkipListSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values) {
        super();
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    /// Create a mutable instance of [ConcurrentSkipListSet]
    /// ordered according to the <code>values.[comparator][SortedSet#comparator]</code>
    ///
    /// @implNote Use a [Comparable] type on [T] to avoid [ClassCastException]
    public MutableConcurrentSkipListSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable SortedSet<T> values) {
        super(values.comparator());
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    //#endregion -------------------- values --------------------
    //#region -------------------- values, comparator --------------------

    /// Create a mutable instance of [ConcurrentSkipListSet]
    /// ordered according to the `comparator` received
    public MutableConcurrentSkipListSet(final T @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable [] values,
                                        final @Nullable Comparator<? super T> comparator) {
        super(comparator);
        final var size = values.length;
        if (size == 0)
            return;
        var index = -1;
        while (++index < size)
            super.add(values[index]);
    }

    /// Create a mutable instance of [ConcurrentSkipListSet]
    /// ordered according to the `comparator` received
    public MutableConcurrentSkipListSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable Collection<? extends T> values,
                                        final @Nullable Comparator<? super T> comparator) {
        super(comparator);
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    /// Create a mutable instance of [ConcurrentSkipListSet]
    /// ordered according to the `comparator` received
    public MutableConcurrentSkipListSet(final @Flow(sourceIsContainer = true, targetIsContainer = true) @Unmodifiable SortedSet<? extends T> values,
                                        final @Nullable Comparator<? super T> comparator) {
        super(comparator);
        if (values.isEmpty())
            return;
        super.addAll(values);
    }

    //#endregion -------------------- values, comparator --------------------

}

package joookiwi.collection.java.extended;

import java.util.Collection;
import java.util.Comparator;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

/// A [Collection] that can order its elements via a [Comparator].
/// In the <a href="https://docs.oracle.com/en/java/javase/24/core/java-collections-framework.html">Java collection framework</a>,
/// it could have been used on the [SortedSet][java.util.SortedSet],
/// [PriorityBlockingQueue][java.util.concurrent.PriorityBlockingQueue] and [PriorityQueue][java.util.PriorityQueue].
///
/// @apiNote This is not part of the <a href="https://docs.oracle.com/en/java/javase/24/core/java-collections-framework.html">Java collection framework</a>,
///          but it is an extension of it
@NotNullByDefault
public interface OrderableCollection<T extends @Nullable Object>
        extends Collection<T> {

    /// The comparator to order the elements of this collection
    /// or `null` if it uses the natural ordering
    @Nullable Comparator<? super T> comparator();

}

package joookiwi.collection.java.iterator.value;

import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

///A generalization of a [IteratorValue] to have a common ancestor.
///
/// @param <T> The element type
@NotNullByDefault
public abstract class AbstractIteratorValue<T extends @Nullable Object>
        implements IteratorValue<T> {

    protected AbstractIteratorValue() { super(); }


    @Override public final boolean done() { return isDone(); }

    @Override public boolean isNotDone() { return !isDone(); }

}

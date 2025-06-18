package joookiwi.collection.java.iterator.value;

import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

@NotNullByDefault
public abstract class AbstractIteratorValue<T extends @Nullable Object>
        implements IteratorValue<T> {

    protected AbstractIteratorValue() { super(); }


    @Override public final boolean done() { return isDone(); }

    @Override public boolean isNotDone() { return !isDone(); }

}

package joookiwi.collection.java.extended.iterator;

import java.util.Enumeration;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

@NotNullByDefault
public interface ImmutableEnumeration<T extends @Nullable Object>
        extends Enumeration<T> {

    @Override boolean hasMoreElements();

    @Override T nextElement();

    @Override ImmutableIterator<T> asIterator();

}

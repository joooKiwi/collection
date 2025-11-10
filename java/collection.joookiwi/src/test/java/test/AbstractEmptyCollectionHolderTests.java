package test;

import joookiwi.collection.java.EmptyCollectionHolder;
import org.jetbrains.annotations.NotNullByDefault;

/// An instance that describe the tests meaningful to an [EmptyCollectionHolder][joookiwi.collection.java.EmptyCollectionHolder]
@NotNullByDefault
public class AbstractEmptyCollectionHolderTests {

    public static final EmptyCollectionHolder<String> instance = EmptyCollectionHolder.getInstance();

    public static <T> EmptyCollectionHolder<T> getInstance() { return EmptyCollectionHolder.getInstance(); }

}

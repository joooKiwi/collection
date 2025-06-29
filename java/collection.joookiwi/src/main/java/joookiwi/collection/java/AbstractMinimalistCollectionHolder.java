package joookiwi.collection.java;

import org.jetbrains.annotations.Nullable;

/// A definition of a [MinimalistCollectionHolder] to have a common ancestor
///
/// @param <T> The type
/// @see EmptyCollectionHolder
/// @see GenericMinimalistCollectionHolder
/// @see MinimalistCollectionViewer
public abstract class AbstractMinimalistCollectionHolder<T extends @Nullable Object>
        implements MinimalistCollectionHolder<T> {

    protected AbstractMinimalistCollectionHolder() { super(); }

}

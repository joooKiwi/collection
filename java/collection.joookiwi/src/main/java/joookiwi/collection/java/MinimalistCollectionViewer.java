package joookiwi.collection.java;

import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static java.lang.Integer.MAX_VALUE;

/// A [MinimalistCollectionHolder] that hold another [MinimalistCollectionHolder]
/// (which could be [mutable][MutableMinimalistCollectionHolder])
/// to only view it
///
/// @implNote It does not change any behaviour from its [reference][#getReference]
/// @see CollectionViewer
@NotNullByDefault
public class MinimalistCollectionViewer<T extends @Nullable Object,
        REFERENCE extends MinimalistCollectionHolder<T>>
        extends AbstractMinimalistCollectionHolder<T> {

    private final REFERENCE __reference;

    public MinimalistCollectionViewer(final REFERENCE reference) {
        super();
        this.__reference = reference;
    }

    public REFERENCE getReference() { return __reference; }

    @Override public @Range(from = 0, to = MAX_VALUE) int size() { return getReference().size(); }

    @Override public T get(final int index) { return getReference().get(index); }

}

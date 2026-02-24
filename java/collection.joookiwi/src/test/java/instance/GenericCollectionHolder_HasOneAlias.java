package instance;

import java.util.Collection;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.SequencedCollection;
import java.util.SequencedSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.function.Consumer;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.GenericCollectionHolder;
import joookiwi.collection.java.MinimalistCollectionHolder;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;
import static value.Arrays.ABCD;

@NotNullByDefault
public final class GenericCollectionHolder_HasOneAlias
        extends GenericCollectionHolder<String>
        implements StraightCollectionHolderForTest<String, GenericCollectionHolder_HasOneAlias> {

    /// The field that tell the amount of time the method `hasOne` has been called
    public @Range(from = 0, to = MAX_INT_VALUE) int amountOfCall = 0;

    public GenericCollectionHolder_HasOneAlias() { super(ABCD); }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int getAmountOfCall() { return amountOfCall; }

    @Contract(ALWAYS_THIS_1)
    @Override public GenericCollectionHolder_HasOneAlias execute(final Consumer<GenericCollectionHolder_HasOneAlias> action) {
        action.accept(this);
        return this;
    }


    @Override public boolean hasOne(final @Nullable Iterator<? extends String> values) {
        amountOfCall++;
        return super.hasOne(values);
    }

    @Override public boolean hasOne(final @Nullable ListIterator<? extends String> values) {
        amountOfCall++;
        return super.hasOne(values);
    }

    @Override public boolean hasOne(final @Nullable Spliterator<? extends String> values) {
        amountOfCall++;
        return super.hasOne(values);
    }

    @Override public boolean hasOne(final @Nullable Enumeration<? extends String> values) {
        amountOfCall++;
        return super.hasOne(values);
    }

    @Override public boolean hasOne(final @Nullable Iterable<? extends String> values) {
        amountOfCall++;
        return super.hasOne(values);
    }

    @Override public boolean hasOne(final @Nullable MinimalistCollectionHolder<? extends String> values) {
        amountOfCall++;
        return super.hasOne(values);
    }

    @Override public boolean hasOne(final @Nullable CollectionHolder<? extends String> values) {
        amountOfCall++;
        return super.hasOne(values);
    }

    @Override public boolean hasOne(final @Nullable @Unmodifiable Collection<? extends String> values) {
        amountOfCall++;
        return super.hasOne(values);
    }

    @Override public boolean hasOne(final @Nullable @Unmodifiable SequencedCollection<? extends String> values) {
        amountOfCall++;
        return super.hasOne(values);
    }

    @Override public boolean hasOne(final @Nullable @Unmodifiable List<? extends String> values) {
        amountOfCall++;
        return super.hasOne(values);
    }

    @Override public boolean hasOne(final @Nullable @Unmodifiable Set<? extends String> values) {
        amountOfCall++;
        return super.hasOne(values);
    }

    @Override public boolean hasOne(final @Nullable @Unmodifiable SequencedSet<? extends String> values) {
        amountOfCall++;
        return super.hasOne(values);
    }

    @Override public boolean hasOne(final @Nullable @Unmodifiable SortedSet<? extends String> values) {
        amountOfCall++;
        return super.hasOne(values);
    }

    @Override public boolean hasOne(final @Nullable @Unmodifiable NavigableSet<? extends String> values) {
        amountOfCall++;
        return super.hasOne(values);
    }

    @Override public boolean hasOne(final @Nullable @Unmodifiable Queue<? extends String> values) {
        amountOfCall++;
        return super.hasOne(values);
    }

    @Override public boolean hasOne(final @Nullable @Unmodifiable Deque<? extends String> values) {
        amountOfCall++;
        return super.hasOne(values);
    }

    @Override public boolean hasOne(final String @Nullable @Unmodifiable [] values) {
        amountOfCall++;
        return super.hasOne(values);
    }

}

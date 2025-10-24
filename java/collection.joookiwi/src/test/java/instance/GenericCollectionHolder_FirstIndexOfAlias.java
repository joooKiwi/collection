package instance;

import java.util.function.Consumer;
import joookiwi.collection.java.GenericCollectionHolder;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;
import static value.Arrays.ABCD;

@NotNullByDefault
public final class GenericCollectionHolder_FirstIndexOfAlias
        extends GenericCollectionHolder<String>
        implements StraightCollectionHolderForTest<String, GenericCollectionHolder_FirstIndexOfAlias> {

    /// The field that tell the amount of time the methods `firstIndexOf` have been called
    public @Range(from = 0, to = MAX_INT_VALUE) int amountOfCall = 0;

    public GenericCollectionHolder_FirstIndexOfAlias() { super(ABCD); }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int getAmountOfCall() { return amountOfCall; }

    @Contract(ALWAYS_THIS_1)
    @Override public GenericCollectionHolder_FirstIndexOfAlias execute(final Consumer<GenericCollectionHolder_FirstIndexOfAlias> action) {
        action.accept(this);
        return this;
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int firstIndexOf(final String element, final @Nullable Integer from, final int to) {
        amountOfCall++;
        return super.firstIndexOf(element, from, to);
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int firstIndexOf(final String element, final int from, final int to) {
        amountOfCall++;
        return super.firstIndexOf(element, from, to);
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int firstIndexOf(final String element, final int from) {
        amountOfCall++;
        return super.firstIndexOf(element, from);
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int firstIndexOf(final String element) {
        amountOfCall++;
        return super.firstIndexOf(element);
    }

}

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
public final class GenericCollectionHolder_FirstIndexOfOrNullAlias
        extends GenericCollectionHolder<String>
        implements StraightCollectionHolderForTest<String, GenericCollectionHolder_FirstIndexOfOrNullAlias> {

    /// The field that tell the amount of time the methods `firstIndexOfOrNull` have been called
    public @Range(from = 0, to = MAX_INT_VALUE) int amountOfCall = 0;

    public GenericCollectionHolder_FirstIndexOfOrNullAlias() { super(ABCD); }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int getAmountOfCall() { return amountOfCall; }

    @Contract(ALWAYS_THIS_1)
    @Override public GenericCollectionHolder_FirstIndexOfOrNullAlias execute(final Consumer<GenericCollectionHolder_FirstIndexOfOrNullAlias> action) {
        action.accept(this);
        return this;
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final String element, final @Nullable Integer from, final int to) {
        amountOfCall++;
        return super.firstIndexOfOrNull(element, from, to);
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final String element, final int from, final int to) {
        amountOfCall++;
        return super.firstIndexOfOrNull(element, from, to);
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final String element, final int from) {
        amountOfCall++;
        return super.firstIndexOfOrNull(element, from);
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) @Nullable Integer firstIndexOfOrNull(final String element) {
        amountOfCall++;
        return super.firstIndexOfOrNull(element);
    }

}

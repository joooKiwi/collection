package instance;

import java.util.function.Consumer;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.GenericCollectionHolder;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;
import static org.junit.jupiter.api.Assertions.fail;
import static value.Arrays.ABCD;

@NotNullByDefault
public final class GenericCollectionHolder_ToReverseAlias
        extends GenericCollectionHolder<String>
        implements StraightCollectionHolderForTest<String, GenericCollectionHolder_ToReverseAlias> {

    /// The field that tell the amount of time the method `toReverse` has been called
    public @Range(from = 0, to = MAX_INT_VALUE) int amountOfCall = 0;

    public GenericCollectionHolder_ToReverseAlias() { super(ABCD); }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int getAmountOfCall() { return amountOfCall; }

    @Contract(ALWAYS_THIS_1)
    @Override public GenericCollectionHolder_ToReverseAlias execute(final Consumer<GenericCollectionHolder_ToReverseAlias> action) {
        action.accept(this);
        return this;
    }


    @Override public CollectionHolder<String> toReverse() {
        amountOfCall++;
        return super.toReverse();
    }

    @Override public CollectionHolder<String> toReverse(final int from) {
        amountOfCall++;
        return super.toReverse(from);
    }

    @Override public CollectionHolder<String> toReverse(final int from, final int to) {
        amountOfCall++;
        return super.toReverse(from, to);
    }

    @Override public CollectionHolder<String> toReverse(final @Nullable Integer from, final int to) {
        amountOfCall++;
        return super.toReverse(from, to);
    }


}

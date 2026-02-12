package instance;

import java.util.function.Consumer;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.GenericCollectionHolder;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;
import static value.Arrays.ABCD;

@NotNullByDefault
public final class GenericCollectionHolder_TakeAlias
        extends GenericCollectionHolder<String>
        implements StraightCollectionHolderForTest<String, GenericCollectionHolder_TakeAlias> {

    /// The field that tell the amount of time the method `take` has been called
    public @Range(from = 0, to = MAX_INT_VALUE) int amountOfCall = 0;

    public GenericCollectionHolder_TakeAlias() { super(ABCD); }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int getAmountOfCall() { return amountOfCall; }

    @Contract(ALWAYS_THIS_1)
    @Override public GenericCollectionHolder_TakeAlias execute(final Consumer<GenericCollectionHolder_TakeAlias> action) {
        action.accept(this);
        return this;
    }

    @Override public CollectionHolder<String> take(final int n) {
        amountOfCall++;
        return super.take(n);
    }

}

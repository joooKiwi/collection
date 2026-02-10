package instance;

import joookiwi.collection.java.GenericCollectionHolder;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Range;

import java.util.function.Consumer;

import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;
import static value.Arrays.ABCD;

@NotNullByDefault
public final class GenericCollectionHolder_IsNotEmptyAlias
        extends GenericCollectionHolder<String>
        implements StraightCollectionHolderForTest<String, GenericCollectionHolder_IsNotEmptyAlias> {

    /// The field that tell the amount of time the method `isNotEmpty` has been called
    public @Range(from = 0, to = MAX_INT_VALUE) int amountOfCall = 0;

    public GenericCollectionHolder_IsNotEmptyAlias() { super(ABCD); }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int getAmountOfCall() { return amountOfCall; }

    @Contract(ALWAYS_THIS_1)
    @Override public GenericCollectionHolder_IsNotEmptyAlias execute(final Consumer<GenericCollectionHolder_IsNotEmptyAlias> action) {
        action.accept(this);
        return this;
    }

    @Override public boolean isNotEmpty() {
        amountOfCall++;
        return super.isNotEmpty();
    }
}

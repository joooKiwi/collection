package instance;

import java.util.function.Consumer;
import joookiwi.collection.java.GenericCollectionHolder;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;
import static value.Arrays.ABCD;

@NotNullByDefault
public final class GenericCollectionHolder_HasDuplicateAlias
        extends GenericCollectionHolder<String>
        implements StraightCollectionHolderForTest<String, GenericCollectionHolder_HasDuplicateAlias> {

    /// The field that tell the amount of time the method `hasDuplicate` has been called
    public @Range(from = 0, to = MAX_INT_VALUE) int amountOfCall = 0;

    public GenericCollectionHolder_HasDuplicateAlias() { super(ABCD); }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int getAmountOfCall() { return amountOfCall; }

    @Contract(ALWAYS_THIS_1)
    @Override public GenericCollectionHolder_HasDuplicateAlias execute(final Consumer<GenericCollectionHolder_HasDuplicateAlias> action) {
        action.accept(this);
        return this;
    }

    @Override public boolean hasDuplicate() {
        amountOfCall++;
        return super.hasDuplicate();
    }
}

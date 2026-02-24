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
public final class GenericCollectionHolder_SizeAlias
        extends GenericCollectionHolder<String>
        implements StraightCollectionHolderForTest<String, GenericCollectionHolder_SizeAlias> {

    public int amountOfCall = 0;

    public GenericCollectionHolder_SizeAlias() { super(ABCD); }

    @Override public int getAmountOfCall() { return amountOfCall; }

    @Contract(ALWAYS_THIS_1)
    @Override public GenericCollectionHolder_SizeAlias execute(final Consumer<GenericCollectionHolder_SizeAlias> action) {
        action.accept(this);
        return this;
    }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int size() {
        amountOfCall++;
        return super.size();
    }

}

package instance;

import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import joookiwi.collection.java.GenericCollectionHolder;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;
import static value.Arrays.ABCD;

@NotNullByDefault
public final class GenericCollectionHolder_GetOrElseAlias
        extends GenericCollectionHolder<@Nullable String>
        implements StraightCollectionHolderForTest<String, GenericCollectionHolder_GetOrElseAlias> {

    /// The field that tell the amount of time the methods `getOrElse` have been called
    public @Range(from = 0, to = MAX_INT_VALUE) int amountOfCall = 0;

    public GenericCollectionHolder_GetOrElseAlias() { super(ABCD); }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int getAmountOfCall() { return amountOfCall; }

    @Contract(ALWAYS_THIS_1)
    @Override public GenericCollectionHolder_GetOrElseAlias execute(final Consumer<GenericCollectionHolder_GetOrElseAlias> action) {
        action.accept(this);
        return this;
    }

    @Override public @Nullable String getOrElse(final int index, final IntFunction<? extends String> defaultValue) {
        amountOfCall++;
        return super.getOrElse(index, defaultValue);
    }

    @Override public @Nullable String getOrElse(final int index, final Supplier<? extends String> defaultValue) {
        amountOfCall++;
        return super.getOrElse(index, defaultValue);
    }

}

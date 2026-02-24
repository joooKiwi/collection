package instance;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import joookiwi.collection.java.GenericCollectionHolder;
import joookiwi.collection.java.callback.ObjIntFunction;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;
import static value.Arrays.ABCD;

@NotNullByDefault
public final class GenericCollectionHolder_JoinToStringAlias
        extends GenericCollectionHolder<String>
        implements StraightCollectionHolderForTest<String, GenericCollectionHolder_JoinToStringAlias> {

    /// The field that tell the amount of time the method `joinToString` has been called
    public @Range(from = 0, to = MAX_INT_VALUE) int amountOfCall = 0;

    public GenericCollectionHolder_JoinToStringAlias() { super(ABCD); }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int getAmountOfCall() { return amountOfCall; }

    @Contract(ALWAYS_THIS_1)
    @Override public GenericCollectionHolder_JoinToStringAlias execute(final Consumer<GenericCollectionHolder_JoinToStringAlias> action) {
        action.accept(this);
        return this;
    }


    @Override public String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix) {
        amountOfCall++;
        return super.joinToString(separator, prefix, postfix);
    }

    @Override public String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated) {
        amountOfCall++;
        return super.joinToString(separator, prefix, postfix, limit, truncated);
    }

    @Override public String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super String, String> transform) {
        amountOfCall++;
        return super.joinToString(separator, prefix, postfix, limit, truncated, transform);
    }

    @Override public String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable ObjIntFunction<? super String, String> transform) {
        amountOfCall++;
        return super.joinToString(separator, prefix, postfix, limit, truncated, transform);
    }

    @Override public String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated, final @Nullable Function<? super String, String> transform) {
        amountOfCall++;
        return super.joinToString(separator, prefix, postfix, limit, truncated, transform);
    }

    @Override public String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Function<? super String, String> transform) {
        amountOfCall++;
        return super.joinToString(separator, prefix, postfix, limit, truncated, transform);
    }

    @Override public String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final int limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        amountOfCall++;
        return super.joinToString(separator, prefix, postfix, limit, truncated, transform);
    }

    @Override public String joinToString(final @Nullable String separator, final @Nullable String prefix, final @Nullable String postfix, final @Nullable Integer limit, final @Nullable String truncated, final @Nullable Supplier<String> transform) {
        amountOfCall++;
        return super.joinToString(separator, prefix, postfix, limit, truncated, transform);
    }

}

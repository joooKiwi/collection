package instance;

import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.GenericCollectionHolder;
import joookiwi.collection.java.callback.IntObjPredicate;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_1;
import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;
import static value.Arrays.ABCD;

@NotNullByDefault
public final class GenericCollectionHolder_DropLastWhileIndexedAlias
        extends GenericCollectionHolder<String>
        implements StraightCollectionHolderForTest<String, GenericCollectionHolder_DropLastWhileIndexedAlias> {

    /// The field that tell the amount of time the method `dropLastWhileIndexed` has been called
    public @Range(from = 0, to = MAX_INT_VALUE) int amountOfCall = 0;

    public GenericCollectionHolder_DropLastWhileIndexedAlias() { super(ABCD); }

    @Override public @Range(from = 0, to = MAX_INT_VALUE) int getAmountOfCall() { return amountOfCall; }

    @Contract(ALWAYS_THIS_1)
    @Override public GenericCollectionHolder_DropLastWhileIndexedAlias execute(final Consumer<GenericCollectionHolder_DropLastWhileIndexedAlias> action) {
        action.accept(this);
        return this;
    }


    @Override public CollectionHolder<String> dropLastWhileIndexed(final IntObjPredicate<? super String> predicate) {
        amountOfCall++;
        return super.dropLastWhileIndexed(predicate);
    }

    @Override public CollectionHolder<String> dropLastWhileIndexed(final IntPredicate predicate) {
        amountOfCall++;
        return super.dropLastWhileIndexed(predicate);
    }

    @Override public CollectionHolder<String> dropLastWhileIndexed(final BooleanSupplier predicate) {
        amountOfCall++;
        return super.dropLastWhileIndexed(predicate);
    }

}

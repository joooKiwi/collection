package instance;

import java.util.function.Consumer;
import joookiwi.collection.java.EmptyCollectionHolder;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FAIL_1;

@NotNullByDefault
public final class EmptyCollectionHolderForTest<T extends @Nullable Object>
        extends EmptyCollectionHolder<T>
        implements StraightCollectionHolderForTest<T, EmptyCollectionHolderForTest<T>> {

    public EmptyCollectionHolderForTest() { super(); }

    @Contract(ALWAYS_FAIL_0)
    @Override public int getAmountOfCall() { throw new RuntimeException("The amountOfCall will never change on an EmptyCollectionHolder"); }

    @Contract(ALWAYS_FAIL_1)
    @Override public EmptyCollectionHolderForTest<T> execute(final @Nullable Consumer<EmptyCollectionHolderForTest<T>> action) { throw new RuntimeException("An EmptyCollectionHolder does not need to execute anything since all of the methods are self contained."); }

}

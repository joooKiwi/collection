package joookiwi.collection.java.extended.stack;

import java.io.Serial;
import java.util.Collection;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.stream.Stream;
import joookiwi.collection.java.ClassWith1Value;
import joookiwi.collection.java.extended.UtilityFor1;
import joookiwi.collection.java.iterator.CollectionIteratorOf1;
import joookiwi.collection.java.method.ArrayCreator;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;
import org.jetbrains.annotations.Unmodifiable;

import static joookiwi.collection.java.CommonContracts.ALWAYS_1ST_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FALSE_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NEW_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;

@NotNullByDefault
public class ImmutableLinkedBlockingDequeOf1<T>
        extends ImmutableLinkedBlockingDeque<T>
        implements ClassWith1Value<T> {

    //#region -------------------- Fields --------------------

    @Serial private static final long serialVersionUID = 1449396026076019825L;

    private final T __value;

    //#endregion -------------------- Fields --------------------
    //#region -------------------- Constructor --------------------

    public ImmutableLinkedBlockingDequeOf1(final T value) {
        super();
        __value = value;
    }

    //#endregion -------------------- Constructor --------------------
    //#region -------------------- Methods --------------------

    @Override public T value() { return __value; }

    //#region -------------------- Size methods --------------------

    @Contract(pure = true)
    @Override public @Range(from = 1, to = 1) int size() { return 1; }

    @Contract(value = ALWAYS_FALSE_0, pure = true)
    @Override public boolean isEmpty() { return false; }

    //#endregion -------------------- Size methods --------------------
    //#region -------------------- Get methods --------------------

    @Contract(pure = true)
    @Override public T getFirst() { return value(); }

    @Contract(pure = true)
    @Override public T getLast() { return value(); }


    @Contract(pure = true)
    @Override public T element() { return value(); }


    @Contract(pure = true)
    @Override public T peek() { return value(); }

    @Contract(pure = true)
    @Override public T peekFirst() { return value(); }

    @Contract(pure = true)
    @Override public T peekLast() { return value(); }

    //#endregion -------------------- Get methods --------------------
    //#region -------------------- Has methods --------------------

    @Contract(pure = true)
    @Override public boolean contains(final @Nullable Object value) { return UtilityFor1.has(this, value); }

    @Override public boolean containsAll(final @Unmodifiable Collection<?> values) { return UtilityFor1.hasAll(this, values); }

    //#endregion -------------------- Has methods --------------------
    //#region -------------------- For each methods --------------------

    @Override public void forEach(Consumer<? super T> action) {
        action.accept(value());
    }

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- As reverse methods --------------------

    @Contract(ALWAYS_THIS_0)
    @Override public ImmutableLinkedBlockingDequeOf1<T> reversed() { return this; }

    //#endregion -------------------- As reverse methods --------------------
    //#region -------------------- Iterator methods --------------------

    @Override public CollectionIteratorOf1<T> iterator() { return new CollectionIteratorOf1<>(value()); }

    @Override public CollectionIteratorOf1<T> descendingIterator() { return new CollectionIteratorOf1<>(value()); }

    @Contract(ALWAYS_NEW_0) @Override public Spliterator<T> spliterator() { throw new RuntimeException(); /*TODO create a new SpliteratorOf1 instance*/ }

    //#endregion -------------------- Iterator methods --------------------
    //#region -------------------- To array methods --------------------

    @Contract(pure = true)
    public @Override T[] toArray() { return ArrayCreator.Array(value()); }

    @Contract(value = ALWAYS_1ST_1, mutates = "param1")
    public @Override <U extends @Nullable Object> U[] toArray(final U[] newArray) { return UtilityFor1.toArray(this, newArray); }

    @Contract(ALWAYS_NEW_1)
    public @Override <U extends @Nullable Object> U[] toArray(final IntFunction<U[]> generator) { return UtilityFor1.toArray(this, generator); }

    //#endregion -------------------- To array methods --------------------
    //#region -------------------- Stream methods --------------------

    @Contract(ALWAYS_NEW_0)
    @Override public Stream<T> stream() { throw new RuntimeException(); /*TODO create a new SequentialStreamOf1 instance*/ }

    @Contract(ALWAYS_NEW_0)
    @Override public Stream<T> parallelStream() { throw new RuntimeException(); /*TODO create a new ParallelStreamOf1 instance*/ }

    //#endregion -------------------- Stream methods --------------------
    //#region -------------------- Clone methods --------------------

    @MustBeInvokedByOverriders
    @Contract(ALWAYS_NEW_0)
    @Override public ImmutableLinkedBlockingDequeOf1<T> clone() {
        return (ImmutableLinkedBlockingDequeOf1<T>) super.clone();
    }

    //#endregion -------------------- Clone methods --------------------
    //#region -------------------- To string methods --------------------

    @Override public String toString() { return UtilityFor1.toString(this); }

    //#endregion -------------------- To string methods --------------------

    //#endregion -------------------- Methods --------------------

}

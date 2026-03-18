package joookiwi.collection.java.stream;

import java.util.Comparator;
import java.util.Optional;
import java.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntSupplier;
import java.util.function.LongConsumer;
import java.util.function.LongSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.Collector;
import java.util.stream.DoubleStream;
import java.util.stream.Gatherer;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import joookiwi.collection.java.CollectionCreator;
import joookiwi.collection.java.annotation.Singleton;
import joookiwi.collection.java.extended.EmptyList;
import joookiwi.collection.java.extended.iterator.EmptyIterator;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CommonContracts.ALWAYS_1ST_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_1ST_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_1ST_3;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FALSE_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_FALSE_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NULL_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NULL_2;
import static joookiwi.collection.java.CommonContracts.ALWAYS_NULL_3;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_THIS_1;
import static joookiwi.collection.java.CommonContracts.ALWAYS_TRUE_0;
import static joookiwi.collection.java.CommonContracts.ALWAYS_TRUE_1;
import static joookiwi.collection.java.method.ArrayCreator.Array;

/// A sequential [Stream] with nothing (as a [singleton][Singleton] instance)
///
/// @param <T> The type
/// @see EmptyParallelStream
/// @see EmptySequentialBooleanStream
/// @see EmptySequentialCharStream
/// @see EmptySequentialByteStream
/// @see EmptySequentialShortStream
/// @see EmptySequentialIntStream
/// @see EmptySequentialLongStream
/// @see EmptySequentialFloatStream
/// @see EmptySequentialDoubleStream
@Singleton
@NotNullByDefault
public class EmptySequentialStream<T extends @Nullable Object>
        implements Stream<T> {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptySequentialStream<?> instance;

    protected EmptySequentialStream() { super(); }

    @SuppressWarnings("unchecked cast")
    public static <T> EmptySequentialStream<T> getInstance() {
        final var instance = EmptySequentialStream.instance;
        if (instance != null)
            return (EmptySequentialStream<T>) instance;
        synchronized (EmptySequentialStream.class) {
            final var instance2 = EmptySequentialStream.instance;
            if (instance2 != null)
                return (EmptySequentialStream<T>) instance2;
            return (EmptySequentialStream<T>) (EmptySequentialStream.instance = new EmptySequentialStream<>());
        }
    }

    //#endregion -------------------- Singleton usage --------------------

    //#region -------------------- Methods --------------------

    //#region -------------------- Is parallel --------------------

    @Contract(ALWAYS_FALSE_0) @Override public boolean isParallel(                                            ) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean isParallel(final @Nullable Object @Nullable ... ignored) { return false; }

    //#endregion -------------------- Is parallel --------------------
    //#region -------------------- Sequential --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptySequentialStream<T> sequential(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialStream<T> sequential(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Sequential --------------------
    //#region -------------------- Parallel --------------------

    @Override public EmptyParallelStream<T> parallel(                                            ) { return EmptyParallelStream.getInstance(); }
              public EmptyParallelStream<T> parallel(final @Nullable Object @Nullable ... ignored) { return EmptyParallelStream.getInstance(); }

    //#endregion -------------------- Parallel --------------------
    //#region -------------------- Unordered --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptySequentialStream<T> unordered(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialStream<T> unordered(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Unordered --------------------
    //#region -------------------- Filter --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialStream<T> filter(final @Nullable Predicate<? super T> predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialStream<T> filter(final @Nullable BooleanSupplier      predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialStream<T> filter(final @Nullable Object @Nullable ...   ignored) { return this; }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Map --------------------

    @SuppressWarnings("unchecked cast") @Contract(ALWAYS_THIS_1) @Override public <U extends @Nullable Object> EmptySequentialStream<U> map(final @Nullable Function<? super T, ? extends U> mapper) { return (EmptySequentialStream<U>) this; }
    @SuppressWarnings("unchecked cast") @Contract(ALWAYS_THIS_1)           public <U extends @Nullable Object> EmptySequentialStream<U> map(final @Nullable Supplier<? extends U>            mapper) { return (EmptySequentialStream<U>) this; }
    @SuppressWarnings("unchecked cast") @Contract(ALWAYS_THIS_1)           public <U extends @Nullable Object> EmptySequentialStream<U> map(final @Nullable Object @Nullable ...            ignored) { return (EmptySequentialStream<U>) this; }

    @Override public EmptySequentialIntStream mapToInt(final @Nullable ToIntFunction<? super T> mapper) { return EmptySequentialIntStream.getInstance(); }
              public EmptySequentialIntStream mapToInt(final @Nullable IntSupplier              mapper) { return EmptySequentialIntStream.getInstance(); }
              public EmptySequentialIntStream mapToInt(final @Nullable Object @Nullable ...    ignored) { return EmptySequentialIntStream.getInstance(); }

    @Override public EmptySequentialLongStream mapToLong(final @Nullable ToLongFunction<? super T> mapper) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream mapToLong(final @Nullable LongSupplier              mapper) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream mapToLong(final @Nullable Object @Nullable ...     ignored) { return EmptySequentialLongStream.getInstance(); }

    @Override public EmptySequentialDoubleStream mapToDouble(final @Nullable ToDoubleFunction<? super T> mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream mapToDouble(final @Nullable DoubleSupplier              mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream mapToDouble(final @Nullable Object @Nullable ...       ignored) { return EmptySequentialDoubleStream.getInstance(); }

    //#endregion -------------------- Map --------------------
    //#region -------------------- Flat map --------------------

    @SuppressWarnings("unchecked cast") @Contract(ALWAYS_THIS_1) @Override public <U extends @Nullable Object> EmptySequentialStream<U> flatMap(final @Nullable Function<? super T, ? extends @Nullable Stream<? extends U>> mapper) { return (EmptySequentialStream<U>) this; }
    @SuppressWarnings("unchecked cast") @Contract(ALWAYS_THIS_1)           public <U extends @Nullable Object> EmptySequentialStream<U> flatMap(final @Nullable Supplier<? extends @Nullable Stream<? extends U>>            mapper) { return (EmptySequentialStream<U>) this; }
    @SuppressWarnings("unchecked cast") @Contract(ALWAYS_THIS_1)           public <U extends @Nullable Object> EmptySequentialStream<U> flatMap(final @Nullable Object @Nullable ...                                        ignored) { return (EmptySequentialStream<U>) this; }

    @Override public EmptySequentialIntStream flatMapToInt(final @Nullable Function<? super T, ? extends @Nullable IntStream> mapper) { return EmptySequentialIntStream.getInstance(); }
              public EmptySequentialIntStream flatMapToInt(final @Nullable Supplier<? extends @Nullable IntStream>            mapper) { return EmptySequentialIntStream.getInstance(); }
              public EmptySequentialIntStream flatMapToInt(final @Nullable Object @Nullable ...                              ignored) { return EmptySequentialIntStream.getInstance(); }

    @Override public EmptySequentialLongStream flatMapToLong(final @Nullable Function<? super T, ? extends @Nullable LongStream> mapper) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream flatMapToLong(final @Nullable Supplier<? extends @Nullable LongStream>            mapper) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream flatMapToLong(final @Nullable Object @Nullable ...                               ignored) { return EmptySequentialLongStream.getInstance(); }

    @Override public EmptySequentialDoubleStream flatMapToDouble(final @Nullable Function<? super T, ? extends @Nullable DoubleStream> mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream flatMapToDouble(final @Nullable Supplier<? extends @Nullable DoubleStream>            mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream flatMapToDouble(final @Nullable Object @Nullable ...                                 ignored) { return EmptySequentialDoubleStream.getInstance(); }

    //#endregion -------------------- Flat map --------------------
    //#region -------------------- Map multi --------------------

    @SuppressWarnings("unchecked cast") @Override public <U extends @Nullable Object> EmptySequentialStream<U> mapMulti(final @Nullable BiConsumer<? super T, ? super @Nullable Consumer<U>> mapper) { return (EmptySequentialStream<U>) this; }
    @SuppressWarnings("unchecked cast")           public <U extends @Nullable Object> EmptySequentialStream<U> mapMulti(final @Nullable Consumer<? super T>                                  mapper) { return (EmptySequentialStream<U>) this; }
    @SuppressWarnings("unchecked cast")           public <U extends @Nullable Object> EmptySequentialStream<U> mapMulti(final @Nullable Runnable                                             mapper) { return (EmptySequentialStream<U>) this; }
    @SuppressWarnings("unchecked cast")           public <U extends @Nullable Object> EmptySequentialStream<U> mapMulti(final @Nullable Object @Nullable ...                                ignored) { return (EmptySequentialStream<U>) this; }

    @Override public EmptySequentialIntStream mapMultiToInt(final @Nullable BiConsumer<? super T, ? super @Nullable IntConsumer> mapper) { return EmptySequentialIntStream.getInstance(); }
              public EmptySequentialIntStream mapMultiToInt(final @Nullable Consumer<? super T>                                  mapper) { return EmptySequentialIntStream.getInstance(); }
              public EmptySequentialIntStream mapMultiToInt(final @Nullable Runnable                                             mapper) { return EmptySequentialIntStream.getInstance(); }
              public EmptySequentialIntStream mapMultiToInt(final @Nullable Object @Nullable ...                                ignored) { return EmptySequentialIntStream.getInstance(); }

    @Override public EmptySequentialLongStream mapMultiToLong(final @Nullable BiConsumer<? super T, ? super @Nullable LongConsumer> mapper) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream mapMultiToLong(final @Nullable Consumer<? super T>                                   mapper) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream mapMultiToLong(final @Nullable Runnable                                              mapper) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream mapMultiToLong(final @Nullable Object @Nullable ...                                 ignored) { return EmptySequentialLongStream.getInstance(); }

    @Override public EmptySequentialDoubleStream mapMultiToDouble(final @Nullable BiConsumer<? super T, ? super @Nullable DoubleConsumer> mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream mapMultiToDouble(final @Nullable Consumer<? super T>                                     mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream mapMultiToDouble(final @Nullable Runnable                                                mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream mapMultiToDouble(final @Nullable Object @Nullable ...                                   ignored) { return EmptySequentialDoubleStream.getInstance(); }

    //#endregion -------------------- Map multi --------------------
    //#region -------------------- Distinct --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptySequentialStream<T> distinct(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialStream<T> distinct(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Distinct --------------------
    //#region -------------------- Sorted --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptySequentialStream<T> sorted(                                                ) { return this; }
    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialStream<T> sorted(final @Nullable Comparator<? super T> comparator) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialStream<T> sorted(final @Nullable Object @Nullable ...     ignored) { return this; }

    //#endregion -------------------- Sorted --------------------
    //#region -------------------- Peek --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialStream<T> peek(final @Nullable Consumer<? super T>   action) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialStream<T> peek(final @Nullable Runnable              action) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialStream<T> peek(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Peek --------------------
    //#region -------------------- Limit --------------------

    @Contract(ALWAYS_THIS_1)           public EmptySequentialStream<T> limit(final byte                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialStream<T> limit(final short                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialStream<T> limit(final int                                                   maximum) { return this; }
    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialStream<T> limit(final long                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialStream<T> limit(final float                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialStream<T> limit(final double                                                maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialStream<T> limit(final @Nullable Number                                      maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialStream<T> limit(final @Nullable AtomicReference<? extends @Nullable Number> maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialStream<T> limit(final @Nullable Object @Nullable ...                        ignored) { return this; }

    //#endregion -------------------- Limit --------------------
    //#region -------------------- Skip --------------------

    @Contract(ALWAYS_THIS_1)           public EmptySequentialStream<T> skip(final byte                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialStream<T> skip(final short                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialStream<T> skip(final int                                                   maximum) { return this; }
    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialStream<T> skip(final long                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialStream<T> skip(final float                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialStream<T> skip(final double                                                maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialStream<T> skip(final @Nullable Number                                      maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialStream<T> skip(final @Nullable AtomicReference<? extends @Nullable Number> maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialStream<T> skip(final @Nullable Object @Nullable ...                        ignored) { return this; }

    //#endregion -------------------- Skip --------------------
    //#region -------------------- Take while --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialStream<T> takeWhile(final @Nullable Predicate<? super T> predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialStream<T> takeWhile(final @Nullable BooleanSupplier      predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialStream<T> takeWhile(final @Nullable Object @Nullable ...   ignored) { return this; }

    //#endregion -------------------- Take while --------------------
    //#region -------------------- Drop while --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialStream<T> dropWhile(final @Nullable Predicate<? super T> predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialStream<T> dropWhile(final @Nullable BooleanSupplier      predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialStream<T> dropWhile(final @Nullable Object @Nullable ...   ignored) { return this; }

    //#endregion -------------------- Drop while --------------------
    //#region -------------------- For each --------------------

    @Override public void forEach(final @Nullable Consumer<? super T>       action) {}
              public void forEach(final @Nullable Runnable                  action) {}
              public void forEach(final @Nullable Object @Nullable ...     ignored) {}

    //#endregion -------------------- For each --------------------
    //#region -------------------- For each ordered --------------------

    @Override public void forEachOrdered(final @Nullable Consumer<? super T>       action) {}
              public void forEachOrdered(final @Nullable Runnable                  action) {}
              public void forEachOrdered(final @Nullable Object @Nullable ...     ignored) {}

    //#endregion -------------------- For each ordered --------------------
    //#region -------------------- To array --------------------

                           @Override public                              T[] toArray(                                            ) { return Array(); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> U[] toArray(final IntFunction<U[]>             generator) { return generator.apply(0); }
                                     public                              T[] toArray(final @Nullable Object @Nullable ... ignored) { return Array(); }

    //#endregion -------------------- To array --------------------
    //#region -------------------- Reduce --------------------

    @Contract(ALWAYS_1ST_1)           public final T reduce(final T initial                                               ) { return initial; }
    @Contract(ALWAYS_1ST_2) @Override public final T reduce(final T initial, final @Nullable BinaryOperator<T> accumulator) { return initial; }
    @Contract(ALWAYS_1ST_2)           public final T reduce(final T initial, final @Nullable Supplier<T>       accumulator) { return initial; }
    @Contract(ALWAYS_1ST_2)           public final T reduce(final T initial, final @Nullable Object @Nullable ...  ignored) { return initial; }

    @Override public Optional<@NotNull T> reduce(final @Nullable BinaryOperator<T> accumulator) { return Optional.empty(); }
              public Optional<@NotNull T> reduce(final @Nullable Supplier<T>       accumulator) { return Optional.empty(); }
              public Optional<@NotNull T> reduce(final @Nullable Object @Nullable ...  ignored) { return Optional.empty(); }

    @Contract(ALWAYS_1ST_3) @Override public <U extends @Nullable Object> U reduce(final U initial, final @Nullable BiFunction<U, ? super T, U> accumulator, final @Nullable BinaryOperator<U>   combiner) { return initial; }
    @Contract(ALWAYS_1ST_3)           public <U extends @Nullable Object> U reduce(final U initial, final @Nullable BiFunction<U, ? super T, U> accumulator, final @Nullable Supplier<U>         combiner) { return initial; }
    @Contract(ALWAYS_1ST_3)           public <U extends @Nullable Object> U reduce(final U initial, final @Nullable BiFunction<U, ? super T, U> accumulator, final @Nullable Object @Nullable ... ignored) { return initial; }
    @Contract(ALWAYS_1ST_3)           public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Function<U, U>              accumulator, final @Nullable BinaryOperator<U>   combiner) { return initial; }
    @Contract(ALWAYS_1ST_3)           public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Function<U, U>              accumulator, final @Nullable Supplier<U>         combiner) { return initial; }
    @Contract(ALWAYS_1ST_3)           public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Function<U, U>              accumulator, final @Nullable Object @Nullable ... ignored) { return initial; }
    @Contract(ALWAYS_1ST_3)           public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Supplier<U>                 accumulator, final @Nullable BinaryOperator<U>   combiner) { return initial; }
    @Contract(ALWAYS_1ST_3)           public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Supplier<U>                 accumulator, final @Nullable Supplier<U>         combiner) { return initial; }
    @Contract(ALWAYS_1ST_3)           public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Supplier<U>                 accumulator, final @Nullable Object @Nullable ... ignored) { return initial; }

    //#endregion -------------------- Reduce --------------------
    //#region -------------------- Gather --------------------

    @SuppressWarnings("unchecked cast") @Override public <U extends @Nullable Object> EmptySequentialStream<U> gather(final @Nullable Gatherer<? super T, ?, U> gatherer) { return (EmptySequentialStream<U>) this; }
    @SuppressWarnings("unchecked cast")           public <U extends @Nullable Object> EmptySequentialStream<U> gather(final @Nullable Object @Nullable ...       ignored) { return (EmptySequentialStream<U>) this; }

    //#endregion -------------------- Gather --------------------
    //#region -------------------- Collect --------------------

    @Contract(ALWAYS_NULL_1) @Override public <R extends @Nullable Object, U extends @Nullable Object> R collect(final @Nullable Collector<? super T, U, R> collector) { return null; }
    @Contract(ALWAYS_NULL_1)           public <R extends @Nullable Object>                             R collect(final @Nullable Object @Nullable ...         ignored) { return null; }

    @Contract(ALWAYS_NULL_3) @Override public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable BiConsumer<R, ? super T> accumulator, final @Nullable BiConsumer<R, R>    combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable BiConsumer<R, ? super T> accumulator, final @Nullable Consumer<R>         combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable BiConsumer<R, ? super T> accumulator, final @Nullable Runnable            combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable BiConsumer<R, ? super T> accumulator, final @Nullable Object @Nullable ... ignored) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Consumer<R>              accumulator, final @Nullable BiConsumer<R, R>    combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Consumer<R>              accumulator, final @Nullable Consumer<R>         combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Consumer<R>              accumulator, final @Nullable Runnable            combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Consumer<R>              accumulator, final @Nullable Object @Nullable ... ignored) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Runnable                 accumulator, final @Nullable BiConsumer<R, R>    combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Runnable                 accumulator, final @Nullable Consumer<R>         combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Runnable                 accumulator, final @Nullable Runnable            combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Runnable                 accumulator, final @Nullable Object @Nullable ... ignored) { return null; }

    @Contract(ALWAYS_NULL_2) public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Object @Nullable ... ignored) { return null; }

    //#endregion -------------------- Collect --------------------
    //#region -------------------- To list --------------------

    @Override public EmptyList<T> toList(                                            ) { return EmptyList.getInstance(); }
              public EmptyList<T> toList(final @Nullable Object @Nullable ... ignored) { return EmptyList.getInstance(); }

    //#endregion -------------------- To list --------------------
    //#region -------------------- Min --------------------

              public Optional<@NotNull T> min(                                                ) { return Optional.empty(); }
    @Override public Optional<@NotNull T> min(final @Nullable Comparator<? super T> comparator) { return Optional.empty(); }
              public Optional<@NotNull T> min(final @Nullable Object @Nullable ...     ignored) { return Optional.empty(); }

    //#endregion -------------------- Min --------------------
    //#region -------------------- Max --------------------

              public Optional<@NotNull T> max(                                                ) { return Optional.empty(); }
    @Override public Optional<@NotNull T> max(final @Nullable Comparator<? super T> comparator) { return Optional.empty(); }
              public Optional<@NotNull T> max(final @Nullable Object @Nullable ...     ignored) { return Optional.empty(); }

    //#endregion -------------------- Max --------------------
    //#region -------------------- Count --------------------

    @Contract(pure = true) @Override public @Range(from = 0, to = 0) long count(                                            ) { return 0; }
    @Contract(pure = true)           public @Range(from = 0, to = 0) long count(final @Nullable Object @Nullable ... ignored) { return 0; }

    //#endregion -------------------- Count --------------------
    //#region -------------------- All match --------------------

    @Contract(ALWAYS_TRUE_1) @Override public boolean allMatch(final @Nullable Predicate<? super T>       predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean allMatch(final @Nullable BooleanSupplier            predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean allMatch(final @Nullable Object @Nullable ...         ignored) { return true; }

    //#endregion -------------------- All match --------------------
    //#region -------------------- Any match --------------------

    @Contract(ALWAYS_FALSE_0)           public boolean anyMatch(                                                    ) { return false; }
    @Contract(ALWAYS_FALSE_1) @Override public boolean anyMatch(final @Nullable Predicate<? super T>       predicate) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean anyMatch(final @Nullable BooleanSupplier            predicate) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean anyMatch(final @Nullable Object @Nullable ...         ignored) { return false; }

    //#endregion -------------------- Any match --------------------
    //#region -------------------- None match --------------------

    @Contract(ALWAYS_TRUE_0)           public boolean noneMatch(                                                    ) { return true; }
    @Contract(ALWAYS_TRUE_1) @Override public boolean noneMatch(final @Nullable Predicate<? super T>       predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean noneMatch(final @Nullable BooleanSupplier            predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean noneMatch(final @Nullable Object @Nullable ...         ignored) { return true; }

    //#endregion -------------------- None match --------------------
    //#region -------------------- Find first --------------------

    @Override public Optional<@NotNull T> findFirst(                                            ) { return Optional.empty(); }
              public Optional<@NotNull T> findFirst(final @Nullable Object @Nullable ... ignored) { return Optional.empty(); }

    //#endregion -------------------- Find first --------------------
    //#region -------------------- Find any --------------------

    @Override public Optional<@NotNull T> findAny(                                            ) { return Optional.empty(); }
              public Optional<@NotNull T> findAny(final @Nullable Object @Nullable ... ignored) { return Optional.empty(); }

    //#endregion -------------------- Find any --------------------
    //#region -------------------- As stream --------------------

    @SuppressWarnings("unchecked cast") @Contract(ALWAYS_THIS_0) public <U extends @Nullable Object> EmptySequentialStream<U> asStream(                                            ) { return (EmptySequentialStream<U>) this; }
    @SuppressWarnings("unchecked cast") @Contract(ALWAYS_THIS_1) public <U extends @Nullable Object> EmptySequentialStream<U> asStream(final @Nullable Object @Nullable ... ignored) { return (EmptySequentialStream<U>) this; }

    public EmptySequentialBooleanStream asBooleanStream(                                            ) { return EmptySequentialBooleanStream.getInstance(); }
    public EmptySequentialBooleanStream asBooleanStream(final @Nullable Object @Nullable ... ignored) { return EmptySequentialBooleanStream.getInstance(); }

    public EmptySequentialCharStream asCharStream(                                            ) { return EmptySequentialCharStream.getInstance(); }
    public EmptySequentialCharStream asCharStream(final @Nullable Object @Nullable ... ignored) { return EmptySequentialCharStream.getInstance(); }

    public EmptySequentialByteStream asByteStream(                                            ) { return EmptySequentialByteStream.getInstance(); }
    public EmptySequentialByteStream asByteStream(final @Nullable Object @Nullable ... ignored) { return EmptySequentialByteStream.getInstance(); }

    public EmptySequentialShortStream asShortStream(                                            ) { return EmptySequentialShortStream.getInstance(); }
    public EmptySequentialShortStream asShortStream(final @Nullable Object @Nullable ... ignored) { return EmptySequentialShortStream.getInstance(); }

    public EmptySequentialIntStream asIntStream(                                            ) { return EmptySequentialIntStream.getInstance(); }
    public EmptySequentialIntStream asIntStream(final @Nullable Object @Nullable ... ignored) { return EmptySequentialIntStream.getInstance(); }

    public EmptySequentialLongStream asLongStream(                                            ) { return EmptySequentialLongStream.getInstance(); }
    public EmptySequentialLongStream asLongStream(final @Nullable Object @Nullable ... ignored) { return EmptySequentialLongStream.getInstance(); }

    public EmptySequentialFloatStream asFloatStream(                                            ) { return EmptySequentialFloatStream.getInstance(); }
    public EmptySequentialFloatStream asFloatStream(final @Nullable Object @Nullable ... ignored) { return EmptySequentialFloatStream.getInstance(); }

    public EmptySequentialDoubleStream asDoubleStream(                                            ) { return EmptySequentialDoubleStream.getInstance(); }
    public EmptySequentialDoubleStream asDoubleStream(final @Nullable Object @Nullable ... ignored) { return EmptySequentialDoubleStream.getInstance(); }

    //#endregion -------------------- As stream --------------------
    //#region -------------------- Java methods --------------------

    @Override public EmptyIterator<T> iterator() { return EmptyIterator.getInstance(); }
    @Override public Spliterator<T> spliterator() { return CollectionCreator.getInstance().Spliterator(); }

    //#endregion -------------------- Java methods --------------------
    //#region -------------------- Close methods --------------------

    @Override public void close() {}
    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialStream<T> onClose(final @Nullable Runnable handler) { return this; }

    //#endregion -------------------- Close methods --------------------

    //#endregion -------------------- Methods --------------------

}

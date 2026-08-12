package joookiwi.collection.java.stream;

import java.util.Comparator;
import java.util.Optional;
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
import joookiwi.collection.java.annotation.Singleton;
import joookiwi.collection.java.callback.additional.BooleanConsumer;
import joookiwi.collection.java.callback.additional.ByteConsumer;
import joookiwi.collection.java.callback.additional.ByteSupplier;
import joookiwi.collection.java.callback.additional.CharConsumer;
import joookiwi.collection.java.callback.additional.CharSupplier;
import joookiwi.collection.java.callback.additional.FloatConsumer;
import joookiwi.collection.java.callback.additional.FloatSupplier;
import joookiwi.collection.java.callback.additional.ShortConsumer;
import joookiwi.collection.java.callback.additional.ShortSupplier;
import joookiwi.collection.java.callback.additional.ToByteFunction;
import joookiwi.collection.java.callback.additional.ToCharFunction;
import joookiwi.collection.java.callback.additional.ToFloatFunction;
import joookiwi.collection.java.callback.additional.ToShortFunction;
import joookiwi.collection.java.extended.iterator.EmptySpliterator;
import joookiwi.collection.java.extended.list.EmptyList;
import joookiwi.collection.java.extended.iterator.EmptyIterator;
import org.jetbrains.annotations.Contract;
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

/// A parallel [Stream] with nothing (as a [singleton][Singleton] instance)
///
/// @param <T> The type
/// @see EmptySequentialStream
/// @see EmptyParallelBooleanStream
/// @see EmptyParallelCharStream
/// @see EmptyParallelByteStream
/// @see EmptyParallelShortStream
/// @see EmptyParallelIntStream
/// @see EmptyParallelLongStream
/// @see EmptyParallelFloatStream
/// @see EmptyParallelDoubleStream
@Singleton
@NotNullByDefault
public class EmptyParallelStream<T>
        implements Stream<T> {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyParallelStream<?> instance;

    protected EmptyParallelStream() { super(); }

    @SuppressWarnings("unchecked cast")
    public static <T> EmptyParallelStream<T> getInstance() {
        final var instance = EmptyParallelStream.instance;
        if (instance != null)
            return (EmptyParallelStream<T>) instance;
        synchronized (EmptyParallelStream.class) {
            final var instance2 = EmptyParallelStream.instance;
            if (instance2 != null)
                return (EmptyParallelStream<T>) instance2;
            return (EmptyParallelStream<T>) (EmptyParallelStream.instance = new EmptyParallelStream<>());
        }
    }

    //#endregion -------------------- Singleton usage --------------------

    //#region -------------------- Methods --------------------

    //#region -------------------- Is parallel --------------------

    @Contract(ALWAYS_TRUE_0) @Override public boolean isParallel(                                            ) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean isParallel(final @Nullable Object @Nullable ... ignored) { return true; }

    //#endregion -------------------- Is parallel --------------------
    //#region -------------------- Sequential --------------------

    @Override public EmptySequentialStream<T> sequential(                                            ) { return EmptySequentialStream.getInstance(); }
              public EmptySequentialStream<T> sequential(final @Nullable Object @Nullable ... ignored) { return EmptySequentialStream.getInstance(); }

    //#endregion -------------------- Sequential --------------------
    //#region -------------------- Parallel --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptyParallelStream<T> parallel(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelStream<T> parallel(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Parallel --------------------
    //#region -------------------- Unordered --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptyParallelStream<T> unordered(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelStream<T> unordered(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Unordered --------------------
    //#region -------------------- Filter --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelStream<T> filter(final @Nullable Predicate<? super T> predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelStream<T> filter(final @Nullable BooleanSupplier      predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelStream<T> filter(final @Nullable Object @Nullable ...   ignored) { return this; }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Map --------------------

    @SuppressWarnings("unchecked cast") @Contract(ALWAYS_THIS_1) @Override public <U> EmptyParallelStream<U> map(final @Nullable Function<? super T, ? extends U> mapper) { return (EmptyParallelStream<U>) this; }
    @SuppressWarnings("unchecked cast") @Contract(ALWAYS_THIS_1)           public <U> EmptyParallelStream<U> map(final @Nullable Supplier<? extends U>            mapper) { return (EmptyParallelStream<U>) this; }
    @SuppressWarnings("unchecked cast") @Contract(ALWAYS_THIS_1)           public <U> EmptyParallelStream<U> map(final @Nullable Object @Nullable ...            ignored) { return (EmptyParallelStream<U>) this; }

    @Override public EmptyParallelBooleanStream mapToBoolean(final @Nullable Predicate<? super T>  mapper) { return EmptyParallelBooleanStream.getInstance(); }
              public EmptyParallelBooleanStream mapToBoolean(final @Nullable BooleanSupplier       mapper) { return EmptyParallelBooleanStream.getInstance(); }
              public EmptyParallelBooleanStream mapToBoolean(final @Nullable Object @Nullable ... ignored) { return EmptyParallelBooleanStream.getInstance(); }

    @Override public EmptyParallelCharStream mapToChar(final @Nullable ToCharFunction<? super T> mapper) { return EmptyParallelCharStream.getInstance(); }
              public EmptyParallelCharStream mapToChar(final @Nullable CharSupplier              mapper) { return EmptyParallelCharStream.getInstance(); }
              public EmptyParallelCharStream mapToChar(final @Nullable Object @Nullable ...    ignored) { return EmptyParallelCharStream.getInstance(); }

    @Override public EmptyParallelByteStream mapToByte(final @Nullable ToByteFunction<? super T> mapper) { return EmptyParallelByteStream.getInstance(); }
              public EmptyParallelByteStream mapToByte(final @Nullable ByteSupplier              mapper) { return EmptyParallelByteStream.getInstance(); }
              public EmptyParallelByteStream mapToByte(final @Nullable Object @Nullable ...    ignored) { return EmptyParallelByteStream.getInstance(); }

    @Override public EmptyParallelShortStream mapToShort(final @Nullable ToShortFunction<? super T> mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream mapToShort(final @Nullable ShortSupplier              mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream mapToShort(final @Nullable Object @Nullable ...      ignored) { return EmptyParallelShortStream.getInstance(); }

    @Override public EmptyParallelIntStream mapToInt(final @Nullable ToIntFunction<? super T> mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream mapToInt(final @Nullable IntSupplier              mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream mapToInt(final @Nullable Object @Nullable ...    ignored) { return EmptyParallelIntStream.getInstance(); }

    @Override public EmptyParallelLongStream mapToLong(final @Nullable ToLongFunction<? super T> mapper) { return EmptyParallelLongStream.getInstance(); }
              public EmptyParallelLongStream mapToLong(final @Nullable LongSupplier              mapper) { return EmptyParallelLongStream.getInstance(); }
              public EmptyParallelLongStream mapToLong(final @Nullable Object @Nullable ...     ignored) { return EmptyParallelLongStream.getInstance(); }

    @Override public EmptyParallelFloatStream mapToFloat(final @Nullable ToFloatFunction<? super T> mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream mapToFloat(final @Nullable FloatSupplier              mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream mapToFloat(final @Nullable Object @Nullable ...      ignored) { return EmptyParallelFloatStream.getInstance(); }

    @Override public EmptyParallelDoubleStream mapToDouble(final @Nullable ToDoubleFunction<? super T> mapper) { return EmptyParallelDoubleStream.getInstance(); }
              public EmptyParallelDoubleStream mapToDouble(final @Nullable DoubleSupplier              mapper) { return EmptyParallelDoubleStream.getInstance(); }
              public EmptyParallelDoubleStream mapToDouble(final @Nullable Object @Nullable ...       ignored) { return EmptyParallelDoubleStream.getInstance(); }

    //#endregion -------------------- Map --------------------
    //#region -------------------- Flat map --------------------

    @SuppressWarnings("unchecked cast") @Contract(ALWAYS_THIS_1) @Override public <U> EmptyParallelStream<U> flatMap(final @Nullable Function<? super T, ? extends java.util.stream.@Nullable Stream<? extends U>> mapper) { return (EmptyParallelStream<U>) this; }
    @SuppressWarnings("unchecked cast") @Contract(ALWAYS_THIS_1)           public <U> EmptyParallelStream<U> flatMap(final @Nullable Supplier<? extends @Nullable Stream<? extends U>>                             mapper) { return (EmptyParallelStream<U>) this; }
    @SuppressWarnings("unchecked cast") @Contract(ALWAYS_THIS_1)           public <U> EmptyParallelStream<U> flatMap(final @Nullable Object @Nullable ...                                                         ignored) { return (EmptyParallelStream<U>) this; }

    @Override public EmptyParallelBooleanStream flatMapToBoolean(final @Nullable Function<? super T, ? extends @Nullable BooleanStream> mapper) { return EmptyParallelBooleanStream.getInstance(); }
              public EmptyParallelBooleanStream flatMapToBoolean(final @Nullable Supplier<? extends @Nullable BooleanStream>            mapper) { return EmptyParallelBooleanStream.getInstance(); }
              public EmptyParallelBooleanStream flatMapToBoolean(final @Nullable Object @Nullable ...                                  ignored) { return EmptyParallelBooleanStream.getInstance(); }

    @Override public EmptyParallelCharStream flatMapToChar(final @Nullable Function<? super T, ? extends @Nullable CharStream> mapper) { return EmptyParallelCharStream.getInstance(); }
              public EmptyParallelCharStream flatMapToChar(final @Nullable Supplier<? extends @Nullable CharStream>            mapper) { return EmptyParallelCharStream.getInstance(); }
              public EmptyParallelCharStream flatMapToChar(final @Nullable Object @Nullable ...                               ignored) { return EmptyParallelCharStream.getInstance(); }

    @Override public EmptyParallelByteStream flatMapToByte(final @Nullable Function<? super T, ? extends @Nullable ByteStream> mapper) { return EmptyParallelByteStream.getInstance(); }
              public EmptyParallelByteStream flatMapToByte(final @Nullable Supplier<? extends @Nullable ByteStream>            mapper) { return EmptyParallelByteStream.getInstance(); }
              public EmptyParallelByteStream flatMapToByte(final @Nullable Object @Nullable ...                               ignored) { return EmptyParallelByteStream.getInstance(); }

    @Override public EmptyParallelShortStream flatMapToShort(final @Nullable Function<? super T, ? extends @Nullable ShortStream> mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream flatMapToShort(final @Nullable Supplier<? extends @Nullable ShortStream>            mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream flatMapToShort(final @Nullable Object @Nullable ...                                ignored) { return EmptyParallelShortStream.getInstance(); }

    @Override public EmptyParallelIntStream flatMapToInt(final @Nullable Function<? super T, ? extends @Nullable IntStream> mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream flatMapToInt(final @Nullable Supplier<? extends @Nullable IntStream>            mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream flatMapToInt(final @Nullable Object @Nullable ...                              ignored) { return EmptyParallelIntStream.getInstance(); }

    @Override public EmptyParallelLongStream flatMapToLong(final @Nullable Function<? super T, ? extends @Nullable LongStream> mapper) { return EmptyParallelLongStream.getInstance(); }
              public EmptyParallelLongStream flatMapToLong(final @Nullable Supplier<? extends @Nullable LongStream>            mapper) { return EmptyParallelLongStream.getInstance(); }
              public EmptyParallelLongStream flatMapToLong(final @Nullable Object @Nullable ...                               ignored) { return EmptyParallelLongStream.getInstance(); }

    @Override public EmptyParallelFloatStream flatMapToFloat(final @Nullable Function<? super T, ? extends @Nullable FloatStream> mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream flatMapToFloat(final @Nullable Supplier<? extends @Nullable FloatStream>            mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream flatMapToFloat(final @Nullable Object @Nullable ...                                ignored) { return EmptyParallelFloatStream.getInstance(); }

    @Override public EmptyParallelDoubleStream flatMapToDouble(final @Nullable Function<? super T, ? extends @Nullable DoubleStream> mapper) { return EmptyParallelDoubleStream.getInstance(); }
              public EmptyParallelDoubleStream flatMapToDouble(final @Nullable Supplier<? extends @Nullable DoubleStream>            mapper) { return EmptyParallelDoubleStream.getInstance(); }
              public EmptyParallelDoubleStream flatMapToDouble(final @Nullable Object @Nullable ...                                 ignored) { return EmptyParallelDoubleStream.getInstance(); }

    //#endregion -------------------- Flat map --------------------
    //#region -------------------- Map multi --------------------

    @SuppressWarnings("unchecked cast") @Override public <U> EmptyParallelStream<U> mapMulti(final @Nullable BiConsumer<? super T, ? super @Nullable Consumer<U>> mapper) { return (EmptyParallelStream<U>) this; }
    @SuppressWarnings("unchecked cast")           public <U> EmptyParallelStream<U> mapMulti(final @Nullable Consumer<? super T>                                  mapper) { return (EmptyParallelStream<U>) this; }
    @SuppressWarnings("unchecked cast")           public <U> EmptyParallelStream<U> mapMulti(final @Nullable Runnable                                             mapper) { return (EmptyParallelStream<U>) this; }
    @SuppressWarnings("unchecked cast")           public <U> EmptyParallelStream<U> mapMulti(final @Nullable Object @Nullable ...                                ignored) { return (EmptyParallelStream<U>) this; }

    @Override public EmptyParallelBooleanStream mapMultiToBoolean(final @Nullable BiConsumer<? super T, ? super @Nullable BooleanConsumer> mapper) { return EmptyParallelBooleanStream.getInstance(); }
              public EmptyParallelBooleanStream mapMultiToBoolean(final @Nullable Consumer<? super T>                                      mapper) { return EmptyParallelBooleanStream.getInstance(); }
              public EmptyParallelBooleanStream mapMultiToBoolean(final @Nullable Runnable                                                 mapper) { return EmptyParallelBooleanStream.getInstance(); }
              public EmptyParallelBooleanStream mapMultiToBoolean(final @Nullable Object @Nullable ...                                    ignored) { return EmptyParallelBooleanStream.getInstance(); }

    @Override public EmptyParallelCharStream mapMultiToChar(final @Nullable BiConsumer<? super T, ? super @Nullable CharConsumer> mapper) { return EmptyParallelCharStream.getInstance(); }
              public EmptyParallelCharStream mapMultiToChar(final @Nullable Consumer<? super T>                                   mapper) { return EmptyParallelCharStream.getInstance(); }
              public EmptyParallelCharStream mapMultiToChar(final @Nullable Runnable                                              mapper) { return EmptyParallelCharStream.getInstance(); }
              public EmptyParallelCharStream mapMultiToChar(final @Nullable Object @Nullable ...                                 ignored) { return EmptyParallelCharStream.getInstance(); }

    @Override public EmptyParallelByteStream mapMultiToByte(final @Nullable BiConsumer<? super T, ? super @Nullable ByteConsumer> mapper) { return EmptyParallelByteStream.getInstance(); }
              public EmptyParallelByteStream mapMultiToByte(final @Nullable Consumer<? super T>                                   mapper) { return EmptyParallelByteStream.getInstance(); }
              public EmptyParallelByteStream mapMultiToByte(final @Nullable Runnable                                              mapper) { return EmptyParallelByteStream.getInstance(); }
              public EmptyParallelByteStream mapMultiToByte(final @Nullable Object @Nullable ...                                 ignored) { return EmptyParallelByteStream.getInstance(); }

    @Override public EmptyParallelShortStream mapMultiToShort(final @Nullable BiConsumer<? super T, ? super @Nullable ShortConsumer> mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream mapMultiToShort(final @Nullable Consumer<? super T>                                    mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream mapMultiToShort(final @Nullable Runnable                                               mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream mapMultiToShort(final @Nullable Object @Nullable ...                                  ignored) { return EmptyParallelShortStream.getInstance(); }

    @Override public EmptyParallelIntStream mapMultiToInt(final @Nullable BiConsumer<? super T, ? super @Nullable IntConsumer> mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream mapMultiToInt(final @Nullable Consumer<? super T>                                  mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream mapMultiToInt(final @Nullable Runnable                                             mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream mapMultiToInt(final @Nullable Object @Nullable ...                                ignored) { return EmptyParallelIntStream.getInstance(); }

    @Override public EmptyParallelLongStream mapMultiToLong(final @Nullable BiConsumer<? super T, ? super @Nullable LongConsumer> mapper) { return EmptyParallelLongStream.getInstance(); }
              public EmptyParallelLongStream mapMultiToLong(final @Nullable Consumer<? super T>                                   mapper) { return EmptyParallelLongStream.getInstance(); }
              public EmptyParallelLongStream mapMultiToLong(final @Nullable Runnable                                              mapper) { return EmptyParallelLongStream.getInstance(); }
              public EmptyParallelLongStream mapMultiToLong(final @Nullable Object @Nullable ...                                 ignored) { return EmptyParallelLongStream.getInstance(); }

    @Override public EmptyParallelFloatStream mapMultiToFloat(final @Nullable BiConsumer<? super T, ? super @Nullable FloatConsumer> mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream mapMultiToFloat(final @Nullable Consumer<? super T>                                    mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream mapMultiToFloat(final @Nullable Runnable                                               mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream mapMultiToFloat(final @Nullable Object @Nullable ...                                  ignored) { return EmptyParallelFloatStream.getInstance(); }

    @Override public EmptyParallelDoubleStream mapMultiToDouble(final @Nullable BiConsumer<? super T, ? super @Nullable DoubleConsumer> mapper) { return EmptyParallelDoubleStream.getInstance(); }
              public EmptyParallelDoubleStream mapMultiToDouble(final @Nullable Consumer<? super T>                                     mapper) { return EmptyParallelDoubleStream.getInstance(); }
              public EmptyParallelDoubleStream mapMultiToDouble(final @Nullable Runnable                                                mapper) { return EmptyParallelDoubleStream.getInstance(); }
              public EmptyParallelDoubleStream mapMultiToDouble(final @Nullable Object @Nullable ...                                   ignored) { return EmptyParallelDoubleStream.getInstance(); }

    //#endregion -------------------- Map multi --------------------
    //#region -------------------- Distinct --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptyParallelStream<T> distinct(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelStream<T> distinct(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Distinct --------------------
    //#region -------------------- Sorted --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptyParallelStream<T> sorted(                                                ) { return this; }
    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelStream<T> sorted(final @Nullable Comparator<? super T> comparator) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelStream<T> sorted(final @Nullable Object @Nullable ...     ignored) { return this; }

    //#endregion -------------------- Sorted --------------------
    //#region -------------------- Peek --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelStream<T> peek(final @Nullable Consumer<? super T>   action) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelStream<T> peek(final @Nullable Runnable              action) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelStream<T> peek(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Peek --------------------
    //#region -------------------- Limit --------------------

    @Contract(ALWAYS_THIS_1)           public EmptyParallelStream<T> limit(final byte                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelStream<T> limit(final short                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelStream<T> limit(final int                                                   maximum) { return this; }
    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelStream<T> limit(final long                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelStream<T> limit(final float                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelStream<T> limit(final double                                                maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelStream<T> limit(final @Nullable Number                                      maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelStream<T> limit(final @Nullable AtomicReference<? extends @Nullable Number> maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelStream<T> limit(final @Nullable Object @Nullable ...                        ignored) { return this; }

    //#endregion -------------------- Limit --------------------
    //#region -------------------- Skip --------------------

    @Contract(ALWAYS_THIS_1)           public EmptyParallelStream<T> skip(final byte                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelStream<T> skip(final short                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelStream<T> skip(final int                                                   maximum) { return this; }
    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelStream<T> skip(final long                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelStream<T> skip(final float                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelStream<T> skip(final double                                                maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelStream<T> skip(final @Nullable Number                                      maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelStream<T> skip(final @Nullable AtomicReference<? extends @Nullable Number> maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelStream<T> skip(final @Nullable Object @Nullable ...                        ignored) { return this; }

    //#endregion -------------------- Skip --------------------
    //#region -------------------- Take while --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelStream<T> takeWhile(final @Nullable Predicate<? super T> predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelStream<T> takeWhile(final @Nullable BooleanSupplier      predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelStream<T> takeWhile(final @Nullable Object @Nullable ...   ignored) { return this; }

    //#endregion -------------------- Take while --------------------
    //#region -------------------- Drop while --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelStream<T> dropWhile(final @Nullable Predicate<? super T> predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelStream<T> dropWhile(final @Nullable BooleanSupplier      predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelStream<T> dropWhile(final @Nullable Object @Nullable ...   ignored) { return this; }

    //#endregion -------------------- Drop while --------------------
    //#region -------------------- For each --------------------

    @Override public void forEach(final @Nullable Consumer<? super T>   action) {}
              public void forEach(final @Nullable Runnable              action) {}
              public void forEach(final @Nullable Object @Nullable ... ignored) {}

    //#endregion -------------------- For each --------------------
    //#region -------------------- For each ordered --------------------

    @Override public void forEachOrdered(final @Nullable Consumer<? super T>   action) {}
              public void forEachOrdered(final @Nullable Runnable              action) {}
              public void forEachOrdered(final @Nullable Object @Nullable ... ignored) {}

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

    @Override public Optional<T> reduce(final @Nullable BinaryOperator<T> accumulator) { return Optional.empty(); }
              public Optional<T> reduce(final @Nullable Supplier<T>       accumulator) { return Optional.empty(); }
              public Optional<T> reduce(final @Nullable Object @Nullable ...  ignored) { return Optional.empty(); }

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

    @SuppressWarnings("unchecked cast") @Override public <U> EmptyParallelStream<U> gather(final @Nullable Gatherer<? super T, ?, U> gatherer) { return (EmptyParallelStream<U>) this; }
    @SuppressWarnings("unchecked cast")           public <U> EmptyParallelStream<U> gather(final @Nullable Object @Nullable ...       ignored) { return (EmptyParallelStream<U>) this; }

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

              public Optional<T> min(                                                ) { return Optional.empty(); }
    @Override public Optional<T> min(final @Nullable Comparator<? super T> comparator) { return Optional.empty(); }
              public Optional<T> min(final @Nullable Object @Nullable ...     ignored) { return Optional.empty(); }

    //#endregion -------------------- Min --------------------
    //#region -------------------- Max --------------------

              public Optional<T> max(                                                ) { return Optional.empty(); }
    @Override public Optional<T> max(final @Nullable Comparator<? super T> comparator) { return Optional.empty(); }
              public Optional<T> max(final @Nullable Object @Nullable ...     ignored) { return Optional.empty(); }

    //#endregion -------------------- Max --------------------
    //#region -------------------- Count --------------------

    @Contract(pure = true) @Override public @Range(from = 0, to = 0) long count(                                            ) { return 0; }
    @Contract(pure = true)           public @Range(from = 0, to = 0) long count(final @Nullable Object @Nullable ... ignored) { return 0; }

    //#endregion -------------------- Count --------------------
    //#region -------------------- All match --------------------

    @Contract(ALWAYS_TRUE_1) @Override public boolean allMatch(final @Nullable Predicate<? super T> predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean allMatch(final @Nullable BooleanSupplier      predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean allMatch(final @Nullable Object @Nullable ...   ignored) { return true; }

    //#endregion -------------------- All match --------------------
    //#region -------------------- Any match --------------------

    @Contract(ALWAYS_FALSE_0)           public boolean anyMatch(                                              ) { return false; }
    @Contract(ALWAYS_FALSE_1) @Override public boolean anyMatch(final @Nullable Predicate<? super T> predicate) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean anyMatch(final @Nullable BooleanSupplier      predicate) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean anyMatch(final @Nullable Object @Nullable ...   ignored) { return false; }

    //#endregion -------------------- Any match --------------------
    //#region -------------------- None match --------------------

    @Contract(ALWAYS_TRUE_0)           public boolean noneMatch(                                              ) { return true; }
    @Contract(ALWAYS_TRUE_1) @Override public boolean noneMatch(final @Nullable Predicate<? super T> predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean noneMatch(final @Nullable BooleanSupplier      predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean noneMatch(final @Nullable Object @Nullable ...   ignored) { return true; }

    //#endregion -------------------- None match --------------------
    //#region -------------------- Find first --------------------

    @Override public Optional<T> findFirst(                                            ) { return Optional.empty(); }
              public Optional<T> findFirst(final @Nullable Object @Nullable ... ignored) { return Optional.empty(); }

    //#endregion -------------------- Find first --------------------
    //#region -------------------- Find any --------------------

    @Override public Optional<T> findAny(                                            ) { return Optional.empty(); }
              public Optional<T> findAny(final @Nullable Object @Nullable ... ignored) { return Optional.empty(); }

    //#endregion -------------------- Find any --------------------
    //#region -------------------- As stream --------------------

    @SuppressWarnings("unchecked cast") @Contract(ALWAYS_THIS_0) public <U> EmptyParallelStream<U> asStream(                                            ) { return (EmptyParallelStream<U>) this; }
    @SuppressWarnings("unchecked cast") @Contract(ALWAYS_THIS_1) public <U> EmptyParallelStream<U> asStream(final @Nullable Object @Nullable ... ignored) { return (EmptyParallelStream<U>) this; }

    public EmptyParallelBooleanStream asBooleanStream(                                            ) { return EmptyParallelBooleanStream.getInstance(); }
    public EmptyParallelBooleanStream asBooleanStream(final @Nullable Object @Nullable ... ignored) { return EmptyParallelBooleanStream.getInstance(); }

    public EmptyParallelCharStream asCharStream(                                            ) { return EmptyParallelCharStream.getInstance(); }
    public EmptyParallelCharStream asCharStream(final @Nullable Object @Nullable ... ignored) { return EmptyParallelCharStream.getInstance(); }

    public EmptyParallelByteStream asByteStream(                                            ) { return EmptyParallelByteStream.getInstance(); }
    public EmptyParallelByteStream asByteStream(final @Nullable Object @Nullable ... ignored) { return EmptyParallelByteStream.getInstance(); }

    public EmptyParallelShortStream asShortStream(                                            ) { return EmptyParallelShortStream.getInstance(); }
    public EmptyParallelShortStream asShortStream(final @Nullable Object @Nullable ... ignored) { return EmptyParallelShortStream.getInstance(); }

    public EmptyParallelIntStream asIntStream(                                            ) { return EmptyParallelIntStream.getInstance(); }
    public EmptyParallelIntStream asIntStream(final @Nullable Object @Nullable ... ignored) { return EmptyParallelIntStream.getInstance(); }

    public EmptyParallelLongStream asLongStream(                                            ) { return EmptyParallelLongStream.getInstance(); }
    public EmptyParallelLongStream asLongStream(final @Nullable Object @Nullable ... ignored) { return EmptyParallelLongStream.getInstance(); }

    public EmptyParallelFloatStream asFloatStream(                                            ) { return EmptyParallelFloatStream.getInstance(); }
    public EmptyParallelFloatStream asFloatStream(final @Nullable Object @Nullable ... ignored) { return EmptyParallelFloatStream.getInstance(); }

    public EmptyParallelDoubleStream asDoubleStream(                                            ) { return EmptyParallelDoubleStream.getInstance(); }
    public EmptyParallelDoubleStream asDoubleStream(final @Nullable Object @Nullable ... ignored) { return EmptyParallelDoubleStream.getInstance(); }

    //#endregion -------------------- As stream --------------------
    //#region -------------------- Java methods --------------------

    @Override public EmptyIterator<T>    iterator(   ) { return EmptyIterator.getInstance(); }
    @Override public EmptySpliterator<T> spliterator() { return EmptySpliterator.getInstance(); }

    //#endregion -------------------- Java methods --------------------
    //#region -------------------- Close methods --------------------

    @Override public void close() {}
    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelStream<T> onClose(final @Nullable Runnable handler) { return this; }

    //#endregion -------------------- Close methods --------------------

    //#endregion -------------------- Methods --------------------

}

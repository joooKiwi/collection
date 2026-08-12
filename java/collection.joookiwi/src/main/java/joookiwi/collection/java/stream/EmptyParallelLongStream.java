package joookiwi.collection.java.stream;

import java.util.LongSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongSupplier;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import joookiwi.collection.java.annotation.Singleton;
import joookiwi.collection.java.callback.additional.BooleanConsumer;
import joookiwi.collection.java.callback.additional.ByteConsumer;
import joookiwi.collection.java.callback.additional.CharConsumer;
import joookiwi.collection.java.callback.additional.FloatConsumer;
import joookiwi.collection.java.callback.additional.LongObjConsumer;
import joookiwi.collection.java.callback.additional.LongToBooleanFunction;
import joookiwi.collection.java.callback.additional.LongToByteFunction;
import joookiwi.collection.java.callback.additional.LongToCharFunction;
import joookiwi.collection.java.callback.additional.LongToFloatFunction;
import joookiwi.collection.java.callback.additional.LongToShortFunction;
import joookiwi.collection.java.callback.additional.ObjLongFunction;
import joookiwi.collection.java.callback.additional.ShortConsumer;
import joookiwi.collection.java.extended.iterator.EmptyLongIterator;
import joookiwi.collection.java.extended.iterator.EmptyLongSpliterator;
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
import static joookiwi.collection.java.method.ArrayCreator.LongArray;

/// A parallel [LongStream] with nothing (as a [singleton][Singleton] instance)
///
/// @see EmptyParallelStream
/// @see EmptyParallelBooleanStream
/// @see EmptyParallelCharStream
/// @see EmptyParallelByteStream
/// @see EmptyParallelShortStream
/// @see EmptyParallelIntStream
/// @see EmptySequentialLongStream
/// @see EmptyParallelFloatStream
/// @see EmptyParallelDoubleStream
@Singleton
@NotNullByDefault
public class EmptyParallelLongStream
        implements LongStream {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptyParallelLongStream instance;

    protected EmptyParallelLongStream() { super(); }

    public static EmptyParallelLongStream getInstance() {
        final var instance = EmptyParallelLongStream.instance;
        if (instance != null)
            return instance;
        synchronized (EmptyParallelLongStream.class) {
            final var instance2 = EmptyParallelLongStream.instance;
            if (instance2 != null)
                return instance2;
            return (EmptyParallelLongStream.instance = new EmptyParallelLongStream());
        }
    }

    //#endregion -------------------- Singleton usage --------------------

    //#region -------------------- Methods --------------------

    //#region -------------------- Is parallel --------------------

    @Contract(ALWAYS_TRUE_0) @Override public boolean isParallel(                                            ) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean isParallel(final @Nullable Object @Nullable ... ignored) { return true; }

    //#endregion -------------------- Is parallel --------------------
    //#region -------------------- Sequential --------------------

    @Override public EmptySequentialLongStream sequential(                                            ) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream sequential(final @Nullable Object @Nullable ... ignored) { return EmptySequentialLongStream.getInstance(); }

    //#endregion -------------------- Sequential --------------------
    //#region -------------------- Parallel --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptyParallelLongStream parallel(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelLongStream parallel(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Parallel --------------------
    //#region -------------------- Unordered --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptyParallelLongStream unordered(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelLongStream unordered(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Unordered --------------------
    //#region -------------------- Filter --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelLongStream filter(final @Nullable LongPredicate        predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelLongStream filter(final @Nullable BooleanSupplier      predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelLongStream filter(final @Nullable Object @Nullable ...   ignored) { return this; }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Map --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelLongStream map(final @Nullable LongUnaryOperator     mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelLongStream map(final @Nullable LongSupplier          mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelLongStream map(final @Nullable Object @Nullable ... ignored) { return this; }

    @Override public <U> EmptyParallelStream<U> mapToObj(final @Nullable LongFunction<? extends U> mapper) { return EmptyParallelStream.getInstance(); }
              public <U> EmptyParallelStream<U> mapToObj(final @Nullable Supplier<? extends U>     mapper) { return EmptyParallelStream.getInstance(); }
              public <U> EmptyParallelStream<U> mapToObj(final @Nullable Object @Nullable ...     ignored) { return EmptyParallelStream.getInstance(); }

    @Override public EmptyParallelBooleanStream mapToBoolean(final @Nullable LongToBooleanFunction mapper) { return EmptyParallelBooleanStream.getInstance(); }
              public EmptyParallelBooleanStream mapToBoolean(final @Nullable LongSupplier          mapper) { return EmptyParallelBooleanStream.getInstance(); }
              public EmptyParallelBooleanStream mapToBoolean(final @Nullable Object @Nullable ... ignored) { return EmptyParallelBooleanStream.getInstance(); }

    @Override public EmptyParallelCharStream mapToChar(final @Nullable LongToCharFunction    mapper) { return EmptyParallelCharStream.getInstance(); }
              public EmptyParallelCharStream mapToChar(final @Nullable LongSupplier          mapper) { return EmptyParallelCharStream.getInstance(); }
              public EmptyParallelCharStream mapToChar(final @Nullable Object @Nullable ... ignored) { return EmptyParallelCharStream.getInstance(); }

    @Override public EmptyParallelByteStream mapToByte(final @Nullable LongToByteFunction    mapper) { return EmptyParallelByteStream.getInstance(); }
              public EmptyParallelByteStream mapToByte(final @Nullable LongSupplier          mapper) { return EmptyParallelByteStream.getInstance(); }
              public EmptyParallelByteStream mapToByte(final @Nullable Object @Nullable ... ignored) { return EmptyParallelByteStream.getInstance(); }

    @Override public EmptyParallelShortStream mapToShort(final @Nullable LongToShortFunction   mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream mapToShort(final @Nullable LongSupplier          mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream mapToShort(final @Nullable Object @Nullable ... ignored) { return EmptyParallelShortStream.getInstance(); }

    @Override public EmptyParallelIntStream mapToInt(final @Nullable LongToIntFunction     mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream mapToInt(final @Nullable LongSupplier          mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream mapToInt(final @Nullable Object @Nullable ... ignored) { return EmptyParallelIntStream.getInstance(); }

    @Contract(ALWAYS_THIS_1) public EmptyParallelLongStream mapToLong(final @Nullable LongUnaryOperator     mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptyParallelLongStream mapToLong(final @Nullable LongSupplier          mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptyParallelLongStream mapToLong(final @Nullable Object @Nullable ... ignored) { return this; }

    @Override public EmptyParallelFloatStream mapToFloat(final @Nullable LongToFloatFunction   mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream mapToFloat(final @Nullable LongSupplier          mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream mapToFloat(final @Nullable Object @Nullable ... ignored) { return EmptyParallelFloatStream.getInstance(); }

    @Override public EmptyParallelDoubleStream mapToDouble(final @Nullable LongToDoubleFunction  mapper) { return EmptyParallelDoubleStream.getInstance(); }
              public EmptyParallelDoubleStream mapToDouble(final @Nullable DoubleSupplier        mapper) { return EmptyParallelDoubleStream.getInstance(); }
              public EmptyParallelDoubleStream mapToDouble(final @Nullable Object @Nullable ... ignored) { return EmptyParallelDoubleStream.getInstance(); }

    //#endregion -------------------- Map --------------------
    //#region -------------------- Flat map --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelLongStream flatMap(final @Nullable LongFunction<? extends java.util.stream.@Nullable LongStream> mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelLongStream flatMap(final @Nullable Supplier<? extends @Nullable LongStream>                      mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelLongStream flatMap(final @Nullable Object @Nullable ...                                         ignored) { return this; }

    @Override public <U> EmptyParallelStream<U> flatMapToObj(final @Nullable LongFunction<? extends @Nullable Stream<? extends U>> mapper) { return EmptyParallelStream.getInstance(); }
              public <U> EmptyParallelStream<U> flatMapToObj(final @Nullable Supplier<? extends @Nullable Stream<? extends U>>     mapper) { return EmptyParallelStream.getInstance(); }
              public <U> EmptyParallelStream<U> flatMapToObj(final @Nullable Object @Nullable ...                                 ignored) { return EmptyParallelStream.getInstance(); }

    @Override public EmptyParallelBooleanStream flatMapToBoolean(final @Nullable LongFunction<? extends @Nullable BooleanStream> mapper) { return EmptyParallelBooleanStream.getInstance(); }
              public EmptyParallelBooleanStream flatMapToBoolean(final @Nullable Supplier<? extends @Nullable BooleanStream>     mapper) { return EmptyParallelBooleanStream.getInstance(); }
              public EmptyParallelBooleanStream flatMapToBoolean(final @Nullable Object @Nullable ...                           ignored) { return EmptyParallelBooleanStream.getInstance(); }

    @Override public EmptyParallelCharStream flatMapToChar(final @Nullable LongFunction<? extends @Nullable CharStream> mapper) { return EmptyParallelCharStream.getInstance(); }
              public EmptyParallelCharStream flatMapToChar(final @Nullable Supplier<? extends @Nullable CharStream>     mapper) { return EmptyParallelCharStream.getInstance(); }
              public EmptyParallelCharStream flatMapToChar(final @Nullable Object @Nullable ...                        ignored) { return EmptyParallelCharStream.getInstance(); }

    @Override public EmptyParallelByteStream flatMapToByte(final @Nullable LongFunction<? extends @Nullable ByteStream> mapper) { return EmptyParallelByteStream.getInstance(); }
              public EmptyParallelByteStream flatMapToByte(final @Nullable Supplier<? extends @Nullable ByteStream>     mapper) { return EmptyParallelByteStream.getInstance(); }
              public EmptyParallelByteStream flatMapToByte(final @Nullable Object @Nullable ...                        ignored) { return EmptyParallelByteStream.getInstance(); }

    @Override public EmptyParallelShortStream flatMapToShort(final @Nullable LongFunction<? extends @Nullable ShortStream> mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream flatMapToShort(final @Nullable Supplier<? extends @Nullable ShortStream>     mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream flatMapToShort(final @Nullable Object @Nullable ...                         ignored) { return EmptyParallelShortStream.getInstance(); }

    @Override public EmptyParallelIntStream flatMapToInt(final @Nullable LongFunction<? extends @Nullable IntStream> mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream flatMapToInt(final @Nullable Supplier<? extends @Nullable IntStream>     mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream flatMapToInt(final @Nullable Object @Nullable ...                       ignored) { return EmptyParallelIntStream.getInstance(); }

    @Contract(ALWAYS_THIS_1) public EmptyParallelLongStream flatMapToLong(final @Nullable LongFunction<? extends @Nullable LongStream> mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptyParallelLongStream flatMapToLong(final @Nullable Supplier<? extends @Nullable LongStream>     mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptyParallelLongStream flatMapToLong(final @Nullable Object @Nullable ...                        ignored) { return this; }

    @Override public EmptyParallelFloatStream flatMapToFloat(final @Nullable LongFunction<? extends @Nullable FloatStream> mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream flatMapToFloat(final @Nullable Supplier<? extends @Nullable FloatStream>     mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream flatMapToFloat(final @Nullable Object @Nullable ...                         ignored) { return EmptyParallelFloatStream.getInstance(); }

    @Override public EmptyParallelDoubleStream flatMapToDouble(final @Nullable LongFunction<? extends @Nullable DoubleStream> mapper) { return EmptyParallelDoubleStream.getInstance(); }
              public EmptyParallelDoubleStream flatMapToDouble(final @Nullable Supplier<? extends @Nullable DoubleStream>     mapper) { return EmptyParallelDoubleStream.getInstance(); }
              public EmptyParallelDoubleStream flatMapToDouble(final @Nullable Object @Nullable ...                          ignored) { return EmptyParallelDoubleStream.getInstance(); }

    //#endregion -------------------- Flat map --------------------
    //#region -------------------- Map multi --------------------

    @Override public EmptyParallelLongStream mapMulti(final @Nullable LongMapMultiConsumer  mapper) { return this; }
              public EmptyParallelLongStream mapMulti(final @Nullable LongConsumer          mapper) { return this; }
              public EmptyParallelLongStream mapMulti(final @Nullable Runnable              mapper) { return this; }
              public EmptyParallelLongStream mapMulti(final @Nullable Object @Nullable ... ignored) { return this; }

    @Override public <U> EmptyParallelStream<U> mapMultiToObj(final @Nullable LongObjConsumer<? super @Nullable Consumer<U>> mapper) { return EmptyParallelStream.getInstance(); }
              public <U> EmptyParallelStream<U> mapMultiToObj(final @Nullable LongConsumer                                   mapper) { return EmptyParallelStream.getInstance(); }
              public <U> EmptyParallelStream<U> mapMultiToObj(final @Nullable Runnable                                       mapper) { return EmptyParallelStream.getInstance(); }
              public <U> EmptyParallelStream<U> mapMultiToObj(final @Nullable Object @Nullable ...                          ignored) { return EmptyParallelStream.getInstance(); }

    @Override public EmptyParallelBooleanStream mapMultiToBoolean(final @Nullable LongObjConsumer<? super @Nullable BooleanConsumer> mapper) { return EmptyParallelBooleanStream.getInstance(); }
              public EmptyParallelBooleanStream mapMultiToBoolean(final @Nullable LongConsumer                                       mapper) { return EmptyParallelBooleanStream.getInstance(); }
              public EmptyParallelBooleanStream mapMultiToBoolean(final @Nullable Runnable                                           mapper) { return EmptyParallelBooleanStream.getInstance(); }
              public EmptyParallelBooleanStream mapMultiToBoolean(final @Nullable Object @Nullable ...                              ignored) { return EmptyParallelBooleanStream.getInstance(); }

    @Override public EmptyParallelCharStream mapMultiToChar(final @Nullable LongObjConsumer<? super @Nullable CharConsumer> mapper) { return EmptyParallelCharStream.getInstance(); }
              public EmptyParallelCharStream mapMultiToChar(final @Nullable LongConsumer                                    mapper) { return EmptyParallelCharStream.getInstance(); }
              public EmptyParallelCharStream mapMultiToChar(final @Nullable Runnable                                        mapper) { return EmptyParallelCharStream.getInstance(); }
              public EmptyParallelCharStream mapMultiToChar(final @Nullable Object @Nullable ...                           ignored) { return EmptyParallelCharStream.getInstance(); }

    @Override public EmptyParallelByteStream mapMultiToByte(final @Nullable LongObjConsumer<? super @Nullable ByteConsumer> mapper) { return EmptyParallelByteStream.getInstance(); }
              public EmptyParallelByteStream mapMultiToByte(final @Nullable LongConsumer                                    mapper) { return EmptyParallelByteStream.getInstance(); }
              public EmptyParallelByteStream mapMultiToByte(final @Nullable Runnable                                        mapper) { return EmptyParallelByteStream.getInstance(); }
              public EmptyParallelByteStream mapMultiToByte(final @Nullable Object @Nullable ...                           ignored) { return EmptyParallelByteStream.getInstance(); }

    @Override public EmptyParallelShortStream mapMultiToShort(final @Nullable LongObjConsumer<? super @Nullable ShortConsumer> mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream mapMultiToShort(final @Nullable LongConsumer                                     mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream mapMultiToShort(final @Nullable Runnable                                         mapper) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream mapMultiToShort(final @Nullable Object @Nullable ...                            ignored) { return EmptyParallelShortStream.getInstance(); }

    @Override public EmptyParallelIntStream mapMultiToInt(final @Nullable LongObjConsumer<? super @Nullable IntConsumer> mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream mapMultiToInt(final @Nullable LongConsumer                                   mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream mapMultiToInt(final @Nullable Runnable                                       mapper) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream mapMultiToInt(final @Nullable Object @Nullable ...                          ignored) { return EmptyParallelIntStream.getInstance(); }

    @Contract(ALWAYS_THIS_1) public EmptyParallelLongStream mapMultiToLong(final @Nullable LongObjConsumer<? super @Nullable LongConsumer> mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptyParallelLongStream mapMultiToLong(final @Nullable LongConsumer                                    mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptyParallelLongStream mapMultiToLong(final @Nullable Runnable                                        mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptyParallelLongStream mapMultiToLong(final @Nullable Object @Nullable ...                           ignored) { return this; }

    @Override public EmptyParallelFloatStream mapMultiToFloat(final @Nullable LongObjConsumer<? super @Nullable FloatConsumer> mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream mapMultiToFloat(final @Nullable LongConsumer                                   mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream mapMultiToFloat(final @Nullable Runnable                                       mapper) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream mapMultiToFloat(final @Nullable Object @Nullable ...                          ignored) { return EmptyParallelFloatStream.getInstance(); }

    @Override public EmptyParallelDoubleStream mapMultiToDouble(final @Nullable LongObjConsumer<? super @Nullable DoubleConsumer> mapper) { return EmptyParallelDoubleStream.getInstance(); }
              public EmptyParallelDoubleStream mapMultiToDouble(final @Nullable LongConsumer                                      mapper) { return EmptyParallelDoubleStream.getInstance(); }
              public EmptyParallelDoubleStream mapMultiToDouble(final @Nullable Runnable                                          mapper) { return EmptyParallelDoubleStream.getInstance(); }
              public EmptyParallelDoubleStream mapMultiToDouble(final @Nullable Object @Nullable ...                             ignored) { return EmptyParallelDoubleStream.getInstance(); }

    //#endregion -------------------- Map multi --------------------
    //#region -------------------- Distinct --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptyParallelLongStream distinct(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelLongStream distinct(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Distinct --------------------
    //#region -------------------- Sorted --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptyParallelLongStream sorted(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelLongStream sorted(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Sorted --------------------
    //#region -------------------- Peek --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelLongStream peek(final @Nullable LongConsumer          action) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelLongStream peek(final @Nullable Runnable              action) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelLongStream peek(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Peek --------------------
    //#region -------------------- Limit --------------------

    @Contract(ALWAYS_THIS_1)           public EmptyParallelLongStream limit(final byte                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelLongStream limit(final short                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelLongStream limit(final int                                                   maximum) { return this; }
    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelLongStream limit(final long                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelLongStream limit(final float                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelLongStream limit(final double                                                maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelLongStream limit(final @Nullable Number                                      maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelLongStream limit(final @Nullable AtomicReference<? extends @Nullable Number> maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelLongStream limit(final @Nullable Object @Nullable ...                        ignored) { return this; }

    //#endregion -------------------- Limit --------------------
    //#region -------------------- Skip --------------------

    @Contract(ALWAYS_THIS_1)           public EmptyParallelLongStream skip(final byte                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelLongStream skip(final short                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelLongStream skip(final int                                                   maximum) { return this; }
    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelLongStream skip(final long                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelLongStream skip(final float                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelLongStream skip(final double                                                maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelLongStream skip(final @Nullable Number                                      maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelLongStream skip(final @Nullable AtomicReference<? extends @Nullable Number> maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelLongStream skip(final @Nullable Object @Nullable ...                        ignored) { return this; }

    //#endregion -------------------- Skip --------------------
    //#region -------------------- Take while --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelLongStream takeWhile(final @Nullable LongPredicate      predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelLongStream takeWhile(final @Nullable BooleanSupplier    predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelLongStream takeWhile(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Take while --------------------
    //#region -------------------- Drop while --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelLongStream dropWhile(final @Nullable LongPredicate      predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelLongStream dropWhile(final @Nullable BooleanSupplier    predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptyParallelLongStream dropWhile(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Drop while --------------------
    //#region -------------------- For each --------------------

    @Override public void forEach(final @Nullable LongConsumer          action) {}
              public void forEach(final @Nullable Runnable              action) {}
              public void forEach(final @Nullable Object @Nullable ... ignored) {}

    //#endregion -------------------- For each --------------------
    //#region -------------------- For each ordered --------------------

    @Override public void forEachOrdered(final @Nullable LongConsumer          action) {}
              public void forEachOrdered(final @Nullable Runnable              action) {}
              public void forEachOrdered(final @Nullable Object @Nullable ... ignored) {}

    //#endregion -------------------- For each ordered --------------------
    //#region -------------------- To array --------------------

                           @Override public                              long[] toArray(                                ) { return LongArray(); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> U[]    toArray(final IntFunction<U[]> generator) { return generator.apply(0); }

    //#endregion -------------------- To array --------------------
    //#region -------------------- Reduce --------------------

    @Contract(ALWAYS_1ST_1)           public final long reduce(final long initial                                               ) { return initial; }
    @Contract(ALWAYS_1ST_2) @Override public final long reduce(final long initial, final @Nullable LongBinaryOperator accumulator) { return initial; }
    @Contract(ALWAYS_1ST_2)           public final long reduce(final long initial, final @Nullable LongSupplier       accumulator) { return initial; }
    @Contract(ALWAYS_1ST_2)           public final long reduce(final long initial, final @Nullable Object @Nullable ...  ignored) { return initial; }

    @Override public OptionalLong reduce(final @Nullable LongBinaryOperator accumulator) { return OptionalLong.empty(); }
              public OptionalLong reduce(final @Nullable LongSupplier       accumulator) { return OptionalLong.empty(); }
              public OptionalLong reduce(final @Nullable Object @Nullable ...  ignored) { return OptionalLong.empty(); }

    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable ObjLongFunction<U, U> accumulator, final @Nullable BinaryOperator<U>   combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable ObjLongFunction<U, U> accumulator, final @Nullable Supplier<U>         combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable ObjLongFunction<U, U> accumulator, final @Nullable Object @Nullable ... ignored) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Function<U, U>        accumulator, final @Nullable BinaryOperator<U>   combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Function<U, U>        accumulator, final @Nullable Supplier<U>         combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Function<U, U>        accumulator, final @Nullable Object @Nullable ... ignored) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Supplier<U>           accumulator, final @Nullable BinaryOperator<U>   combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Supplier<U>           accumulator, final @Nullable Supplier<U>         combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Supplier<U>           accumulator, final @Nullable Object @Nullable ... ignored) { return initial; }

    //#endregion -------------------- Reduce --------------------
    //#region -------------------- Collect --------------------

    @Contract(ALWAYS_NULL_3) @Override public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjLongConsumer<R> accumulator, final @Nullable BiConsumer<R, R>    combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjLongConsumer<R> accumulator, final @Nullable Consumer<R>         combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjLongConsumer<R> accumulator, final @Nullable Runnable            combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjLongConsumer<R> accumulator, final @Nullable Object @Nullable ... ignored) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Consumer<R>        accumulator, final @Nullable BiConsumer<R, R>    combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Consumer<R>        accumulator, final @Nullable Consumer<R>         combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Consumer<R>        accumulator, final @Nullable Runnable            combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Consumer<R>        accumulator, final @Nullable Object @Nullable ... ignored) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Runnable           accumulator, final @Nullable BiConsumer<R, R>    combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Runnable           accumulator, final @Nullable Consumer<R>         combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Runnable           accumulator, final @Nullable Runnable            combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Runnable           accumulator, final @Nullable Object @Nullable ... ignored) { return null; }

    @Contract(ALWAYS_NULL_2) public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Object @Nullable ... ignored) { return null; }

    @Contract(ALWAYS_NULL_1) public <R extends @Nullable Object> R collect(final @Nullable Object @Nullable ... ignored) { return null; }

    //#endregion -------------------- Collect --------------------
    //#region -------------------- Sum --------------------

    @Override public @Range(from = 0, to = 0) long sum(                                            ) { return 0; }
              public @Range(from = 0, to = 0) long sum(final @Nullable Object @Nullable ... ignored) { return 0; }

    //#endregion -------------------- Sum --------------------
    //#region -------------------- Min --------------------

    @Override public OptionalLong min(                                            ) { return OptionalLong.empty(); }
              public OptionalLong min(final @Nullable Object @Nullable ... ignored) { return OptionalLong.empty(); }

    //#endregion -------------------- Min --------------------
    //#region -------------------- Max --------------------

    @Override public OptionalLong max(                                            ) { return OptionalLong.empty(); }
              public OptionalLong max(final @Nullable Object @Nullable ... ignored) { return OptionalLong.empty(); }

    //#endregion -------------------- Max --------------------
    //#region -------------------- Count --------------------

    @Contract(pure = true) @Override public @Range(from = 0, to = 0) long count(                                            ) { return 0; }
    @Contract(pure = true)           public @Range(from = 0, to = 0) long count(final @Nullable Object @Nullable ... ignored) { return 0; }

    //#endregion -------------------- Count --------------------
    //#region -------------------- Average --------------------

    @Override public OptionalDouble average(                                            ) { return OptionalDouble.empty(); }
              public OptionalDouble average(final @Nullable Object @Nullable ... ignored) { return OptionalDouble.empty(); }

    //#endregion -------------------- Average --------------------
    //#region -------------------- Summary statistics --------------------

    @Override public LongSummaryStatistics summaryStatistics(                                            ) { return new LongSummaryStatistics(); }
              public LongSummaryStatistics summaryStatistics(final @Nullable Object @Nullable ... ignored) { return new LongSummaryStatistics(); }

    //#endregion -------------------- Summary statistics --------------------
    //#region -------------------- All match --------------------

    @Contract(ALWAYS_TRUE_1) @Override public boolean allMatch(final @Nullable LongPredicate      predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean allMatch(final @Nullable BooleanSupplier    predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean allMatch(final @Nullable Object @Nullable ... ignored) { return true; }

    //#endregion -------------------- All match --------------------
    //#region -------------------- Any match --------------------

    @Contract(ALWAYS_FALSE_0)           public boolean anyMatch(                                            ) { return false; }
    @Contract(ALWAYS_FALSE_1) @Override public boolean anyMatch(final @Nullable LongPredicate      predicate) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean anyMatch(final @Nullable BooleanSupplier    predicate) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean anyMatch(final @Nullable Object @Nullable ... ignored) { return false; }

    //#endregion -------------------- Any match --------------------
    //#region -------------------- None match --------------------

    @Contract(ALWAYS_TRUE_0)           public boolean noneMatch(                                            ) { return true; }
    @Contract(ALWAYS_TRUE_1) @Override public boolean noneMatch(final @Nullable LongPredicate      predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean noneMatch(final @Nullable BooleanSupplier    predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean noneMatch(final @Nullable Object @Nullable ... ignored) { return true; }

    //#endregion -------------------- None match --------------------
    //#region -------------------- Find first --------------------

    @Override public OptionalLong findFirst(                                            ) { return OptionalLong.empty(); }
              public OptionalLong findFirst(final @Nullable Object @Nullable ... ignored) { return OptionalLong.empty(); }

    //#endregion -------------------- Find first --------------------
    //#region -------------------- Find any --------------------

    @Override public OptionalLong findAny(                                            ) { return OptionalLong.empty(); }
              public OptionalLong findAny(final @Nullable Object @Nullable ... ignored) { return OptionalLong.empty(); }

    //#endregion -------------------- Find any --------------------
    //#region -------------------- As stream --------------------

    public <U> EmptyParallelStream<U> asStream(                                            ) { return EmptyParallelStream.getInstance(); }
    public <U> EmptyParallelStream<U> asStream(final @Nullable Object @Nullable ... ignored) { return EmptyParallelStream.getInstance(); }

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

    @Contract(ALWAYS_THIS_0) public EmptyParallelLongStream asLongStream(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptyParallelLongStream asLongStream(final @Nullable Object @Nullable ... ignored) { return this; }

    @Override public EmptyParallelFloatStream asFloatStream(                                            ) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream asFloatStream(final @Nullable Object @Nullable ... ignored) { return EmptyParallelFloatStream.getInstance(); }

    @Override public EmptyParallelDoubleStream asDoubleStream(                                            ) { return EmptyParallelDoubleStream.getInstance(); }
              public EmptyParallelDoubleStream asDoubleStream(final @Nullable Object @Nullable ... ignored) { return EmptyParallelDoubleStream.getInstance(); }

    //#endregion -------------------- As stream --------------------
    //#region -------------------- Boxed --------------------

    @Override public EmptyParallelStream<Long> boxed(                                            ) { return EmptyParallelStream.getInstance(); }
              public EmptyParallelStream<Long> boxed(final @Nullable Object @Nullable ... ignored) { return EmptyParallelStream.getInstance(); }

    //#endregion -------------------- Boxed --------------------
    //#region -------------------- Java methods --------------------

    @Override public EmptyLongIterator    iterator(   ) { return EmptyLongIterator.getInstance(); }
    @Override public EmptyLongSpliterator spliterator() { return EmptyLongSpliterator.getInstance(); }

    //#endregion -------------------- Java methods --------------------
    //#region -------------------- Close methods --------------------

    @Override public void close() {}
    @Contract(ALWAYS_THIS_1) @Override public EmptyParallelLongStream onClose(final @Nullable Runnable handler) { return this; }

    //#endregion -------------------- Close methods --------------------

    //#endregion -------------------- Methods --------------------

}

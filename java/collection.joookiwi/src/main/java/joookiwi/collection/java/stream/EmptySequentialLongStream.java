package joookiwi.collection.java.stream;

import java.util.LongSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.IntConsumer;
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
import java.util.stream.Stream;
import joookiwi.collection.java.CollectionCreator;
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

/// A sequential [LongStream] with nothing (as a [singleton][Singleton] instance)
///
/// @see EmptySequentialStream
/// @see EmptySequentialBooleanStream
/// @see EmptySequentialCharStream
/// @see EmptySequentialByteStream
/// @see EmptySequentialShortStream
/// @see EmptySequentialIntStream
/// @see EmptyParallelLongStream
/// @see EmptySequentialFloatStream
/// @see EmptySequentialDoubleStream
@Singleton
@NotNullByDefault
public class EmptySequentialLongStream
        implements LongStream {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptySequentialLongStream instance;

    protected EmptySequentialLongStream() { super(); }

    public static EmptySequentialLongStream getInstance() {
        final var instance = EmptySequentialLongStream.instance;
        if (instance != null)
            return instance;
        synchronized (EmptySequentialLongStream.class) {
            final var instance2 = EmptySequentialLongStream.instance;
            if (instance2 != null)
                return instance2;
            return (EmptySequentialLongStream.instance = new EmptySequentialLongStream());
        }
    }

    //#endregion -------------------- Singleton usage --------------------

    //#region -------------------- Methods --------------------

    //#region -------------------- Is parallel --------------------

    @Contract(ALWAYS_FALSE_0) @Override public boolean isParallel(                                            ) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean isParallel(final @Nullable Object @Nullable ... ignored) { return false; }

    //#endregion -------------------- Is parallel --------------------
    //#region -------------------- Sequential --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptySequentialLongStream sequential(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialLongStream sequential(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Sequential --------------------
    //#region -------------------- Parallel --------------------

    @Override public EmptyParallelLongStream parallel(                                            ) { return EmptyParallelLongStream.getInstance(); }
              public EmptyParallelLongStream parallel(final @Nullable Object @Nullable ... ignored) { return EmptyParallelLongStream.getInstance(); }

    //#endregion -------------------- Parallel --------------------
    //#region -------------------- Unordered --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptySequentialLongStream unordered(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialLongStream unordered(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Unordered --------------------
    //#region -------------------- Filter --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialLongStream filter(final @Nullable LongPredicate        predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialLongStream filter(final @Nullable BooleanSupplier      predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialLongStream filter(final @Nullable Object @Nullable ...   ignored) { return this; }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Map --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialLongStream map(final @Nullable LongUnaryOperator     mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialLongStream map(final @Nullable LongSupplier          mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialLongStream map(final @Nullable Object @Nullable ... ignored) { return this; }

    @Override public <U extends @Nullable Object> EmptySequentialStream<U> mapToObj(final @Nullable LongFunction<? extends U> mapper) { return EmptySequentialStream.getInstance(); }
              public <U extends @Nullable Object> EmptySequentialStream<U> mapToObj(final @Nullable Supplier<? extends U>     mapper) { return EmptySequentialStream.getInstance(); }
              public <U extends @Nullable Object> EmptySequentialStream<U> mapToObj(final @Nullable Object @Nullable ...     ignored) { return EmptySequentialStream.getInstance(); }

    @Override public EmptySequentialBooleanStream mapToBoolean(final @Nullable LongToBooleanFunction mapper) { return EmptySequentialBooleanStream.getInstance(); }
              public EmptySequentialBooleanStream mapToBoolean(final @Nullable LongSupplier          mapper) { return EmptySequentialBooleanStream.getInstance(); }
              public EmptySequentialBooleanStream mapToBoolean(final @Nullable Object @Nullable ... ignored) { return EmptySequentialBooleanStream.getInstance(); }

    @Override public EmptySequentialCharStream mapToChar(final @Nullable LongToCharFunction    mapper) { return EmptySequentialCharStream.getInstance(); }
              public EmptySequentialCharStream mapToChar(final @Nullable LongSupplier          mapper) { return EmptySequentialCharStream.getInstance(); }
              public EmptySequentialCharStream mapToChar(final @Nullable Object @Nullable ... ignored) { return EmptySequentialCharStream.getInstance(); }

    @Override public EmptySequentialByteStream mapToByte(final @Nullable LongToByteFunction    mapper) { return EmptySequentialByteStream.getInstance(); }
              public EmptySequentialByteStream mapToByte(final @Nullable LongSupplier          mapper) { return EmptySequentialByteStream.getInstance(); }
              public EmptySequentialByteStream mapToByte(final @Nullable Object @Nullable ... ignored) { return EmptySequentialByteStream.getInstance(); }

    @Override public EmptySequentialShortStream mapToShort(final @Nullable LongToShortFunction   mapper) { return EmptySequentialShortStream.getInstance(); }
              public EmptySequentialShortStream mapToShort(final @Nullable LongSupplier          mapper) { return EmptySequentialShortStream.getInstance(); }
              public EmptySequentialShortStream mapToShort(final @Nullable Object @Nullable ... ignored) { return EmptySequentialShortStream.getInstance(); }

    @Override public EmptySequentialIntStream mapToInt(final @Nullable LongToIntFunction     mapper) { return EmptySequentialIntStream.getInstance(); }
              public EmptySequentialIntStream mapToInt(final @Nullable LongSupplier          mapper) { return EmptySequentialIntStream.getInstance(); }
              public EmptySequentialIntStream mapToInt(final @Nullable Object @Nullable ... ignored) { return EmptySequentialIntStream.getInstance(); }

    @Contract(ALWAYS_THIS_1) public EmptySequentialLongStream mapToLong(final @Nullable LongUnaryOperator     mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialLongStream mapToLong(final @Nullable LongSupplier          mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialLongStream mapToLong(final @Nullable Object @Nullable ... ignored) { return this; }

    @Override public EmptySequentialFloatStream mapToFloat(final @Nullable LongToFloatFunction   mapper) { return EmptySequentialFloatStream.getInstance(); }
              public EmptySequentialFloatStream mapToFloat(final @Nullable LongSupplier          mapper) { return EmptySequentialFloatStream.getInstance(); }
              public EmptySequentialFloatStream mapToFloat(final @Nullable Object @Nullable ... ignored) { return EmptySequentialFloatStream.getInstance(); }

    @Override public EmptySequentialDoubleStream mapToDouble(final @Nullable LongToDoubleFunction  mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream mapToDouble(final @Nullable DoubleSupplier        mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream mapToDouble(final @Nullable Object @Nullable ... ignored) { return EmptySequentialDoubleStream.getInstance(); }

    //#endregion -------------------- Map --------------------
    //#region -------------------- Flat map --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialLongStream flatMap(final @Nullable LongFunction<? extends java.util.stream.@Nullable LongStream> mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialLongStream flatMap(final @Nullable Supplier<? extends @Nullable LongStream>                      mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialLongStream flatMap(final @Nullable Object @Nullable ...                                         ignored) { return this; }

    @Override public <U extends @Nullable Object> EmptySequentialStream<U> flatMapToObj(final @Nullable LongFunction<? extends @Nullable Stream<? extends U>> mapper) { return EmptySequentialStream.getInstance(); }
              public <U extends @Nullable Object> EmptySequentialStream<U> flatMapToObj(final @Nullable Supplier<? extends @Nullable Stream<? extends U>>     mapper) { return EmptySequentialStream.getInstance(); }
              public <U extends @Nullable Object> EmptySequentialStream<U> flatMapToObj(final @Nullable Object @Nullable ...                                 ignored) { return EmptySequentialStream.getInstance(); }

    @Override public EmptySequentialBooleanStream flatMapToBoolean(final @Nullable LongFunction<? extends @Nullable BooleanStream> mapper) { return EmptySequentialBooleanStream.getInstance(); }
              public EmptySequentialBooleanStream flatMapToBoolean(final @Nullable Supplier<? extends @Nullable BooleanStream>     mapper) { return EmptySequentialBooleanStream.getInstance(); }
              public EmptySequentialBooleanStream flatMapToBoolean(final @Nullable Object @Nullable ...                           ignored) { return EmptySequentialBooleanStream.getInstance(); }

    @Override public EmptySequentialCharStream flatMapToChar(final @Nullable LongFunction<? extends @Nullable CharStream> mapper) { return EmptySequentialCharStream.getInstance(); }
              public EmptySequentialCharStream flatMapToChar(final @Nullable Supplier<? extends @Nullable CharStream>     mapper) { return EmptySequentialCharStream.getInstance(); }
              public EmptySequentialCharStream flatMapToChar(final @Nullable Object @Nullable ...                        ignored) { return EmptySequentialCharStream.getInstance(); }

    @Override public EmptySequentialByteStream flatMapToByte(final @Nullable LongFunction<? extends @Nullable ByteStream> mapper) { return EmptySequentialByteStream.getInstance(); }
              public EmptySequentialByteStream flatMapToByte(final @Nullable Supplier<? extends @Nullable ByteStream>     mapper) { return EmptySequentialByteStream.getInstance(); }
              public EmptySequentialByteStream flatMapToByte(final @Nullable Object @Nullable ...                        ignored) { return EmptySequentialByteStream.getInstance(); }

    @Override public EmptySequentialShortStream flatMapToShort(final @Nullable LongFunction<? extends @Nullable ShortStream> mapper) { return EmptySequentialShortStream.getInstance(); }
              public EmptySequentialShortStream flatMapToShort(final @Nullable Supplier<? extends @Nullable ShortStream>     mapper) { return EmptySequentialShortStream.getInstance(); }
              public EmptySequentialShortStream flatMapToShort(final @Nullable Object @Nullable ...                         ignored) { return EmptySequentialShortStream.getInstance(); }

    @Override public EmptySequentialIntStream flatMapToInt(final @Nullable LongFunction<? extends @Nullable IntStream> mapper) { return EmptySequentialIntStream.getInstance(); }
              public EmptySequentialIntStream flatMapToInt(final @Nullable Supplier<? extends @Nullable IntStream>     mapper) { return EmptySequentialIntStream.getInstance(); }
              public EmptySequentialIntStream flatMapToInt(final @Nullable Object @Nullable ...                       ignored) { return EmptySequentialIntStream.getInstance(); }

    @Contract(ALWAYS_THIS_1) public EmptySequentialLongStream flatMapToLong(final @Nullable LongFunction<? extends @Nullable LongStream> mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialLongStream flatMapToLong(final @Nullable Supplier<? extends @Nullable LongStream>     mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialLongStream flatMapToLong(final @Nullable Object @Nullable ...                        ignored) { return this; }

    @Override public EmptySequentialFloatStream flatMapToFloat(final @Nullable LongFunction<? extends @Nullable FloatStream> mapper) { return EmptySequentialFloatStream.getInstance(); }
              public EmptySequentialFloatStream flatMapToFloat(final @Nullable Supplier<? extends @Nullable FloatStream>     mapper) { return EmptySequentialFloatStream.getInstance(); }
              public EmptySequentialFloatStream flatMapToFloat(final @Nullable Object @Nullable ...                         ignored) { return EmptySequentialFloatStream.getInstance(); }

    @Override public EmptySequentialDoubleStream flatMapToDouble(final @Nullable LongFunction<? extends @Nullable DoubleStream> mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream flatMapToDouble(final @Nullable Supplier<? extends @Nullable DoubleStream>     mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream flatMapToDouble(final @Nullable Object @Nullable ...                          ignored) { return EmptySequentialDoubleStream.getInstance(); }

    //#endregion -------------------- Flat map --------------------
    //#region -------------------- Map multi --------------------

    @Override public  EmptySequentialLongStream mapMulti(final @Nullable LongMapMultiConsumer  mapper) { return this; }
              public  EmptySequentialLongStream mapMulti(final @Nullable LongConsumer          mapper) { return this; }
              public  EmptySequentialLongStream mapMulti(final @Nullable Runnable              mapper) { return this; }
              public  EmptySequentialLongStream mapMulti(final @Nullable Object @Nullable ... ignored) { return this; }

    @Override public <U extends @Nullable Object> EmptySequentialStream<U> mapMultiToObj(final @Nullable LongObjConsumer<? super @Nullable Consumer<U>> mapper) { return EmptySequentialStream.getInstance(); }
              public <U extends @Nullable Object> EmptySequentialStream<U> mapMultiToObj(final @Nullable LongConsumer                                   mapper) { return EmptySequentialStream.getInstance(); }
              public <U extends @Nullable Object> EmptySequentialStream<U> mapMultiToObj(final @Nullable Runnable                                       mapper) { return EmptySequentialStream.getInstance(); }
              public <U extends @Nullable Object> EmptySequentialStream<U> mapMultiToObj(final @Nullable Object @Nullable ...                          ignored) { return EmptySequentialStream.getInstance(); }

    @Override public EmptySequentialBooleanStream mapMultiToBoolean(final @Nullable LongObjConsumer<? super @Nullable BooleanConsumer> mapper) { return EmptySequentialBooleanStream.getInstance(); }
              public EmptySequentialBooleanStream mapMultiToBoolean(final @Nullable LongConsumer                                       mapper) { return EmptySequentialBooleanStream.getInstance(); }
              public EmptySequentialBooleanStream mapMultiToBoolean(final @Nullable Runnable                                           mapper) { return EmptySequentialBooleanStream.getInstance(); }
              public EmptySequentialBooleanStream mapMultiToBoolean(final @Nullable Object @Nullable ...                              ignored) { return EmptySequentialBooleanStream.getInstance(); }

    @Override public EmptySequentialCharStream mapMultiToChar(final @Nullable LongObjConsumer<? super @Nullable CharConsumer> mapper) { return EmptySequentialCharStream.getInstance(); }
              public EmptySequentialCharStream mapMultiToChar(final @Nullable LongConsumer                                    mapper) { return EmptySequentialCharStream.getInstance(); }
              public EmptySequentialCharStream mapMultiToChar(final @Nullable Runnable                                        mapper) { return EmptySequentialCharStream.getInstance(); }
              public EmptySequentialCharStream mapMultiToChar(final @Nullable Object @Nullable ...                           ignored) { return EmptySequentialCharStream.getInstance(); }

    @Override public EmptySequentialByteStream mapMultiToByte(final @Nullable LongObjConsumer<? super @Nullable ByteConsumer> mapper) { return EmptySequentialByteStream.getInstance(); }
              public EmptySequentialByteStream mapMultiToByte(final @Nullable LongConsumer                                    mapper) { return EmptySequentialByteStream.getInstance(); }
              public EmptySequentialByteStream mapMultiToByte(final @Nullable Runnable                                        mapper) { return EmptySequentialByteStream.getInstance(); }
              public EmptySequentialByteStream mapMultiToByte(final @Nullable Object @Nullable ...                           ignored) { return EmptySequentialByteStream.getInstance(); }

    @Override public EmptySequentialShortStream mapMultiToShort(final @Nullable LongObjConsumer<? super @Nullable ShortConsumer> mapper) { return EmptySequentialShortStream.getInstance(); }
              public EmptySequentialShortStream mapMultiToShort(final @Nullable LongConsumer                                     mapper) { return EmptySequentialShortStream.getInstance(); }
              public EmptySequentialShortStream mapMultiToShort(final @Nullable Runnable                                         mapper) { return EmptySequentialShortStream.getInstance(); }
              public EmptySequentialShortStream mapMultiToShort(final @Nullable Object @Nullable ...                            ignored) { return EmptySequentialShortStream.getInstance(); }

    @Override public EmptySequentialIntStream mapMultiToInt(final @Nullable LongObjConsumer<? super @Nullable IntConsumer> mapper) { return EmptySequentialIntStream.getInstance(); }
              public EmptySequentialIntStream mapMultiToInt(final @Nullable LongConsumer                                   mapper) { return EmptySequentialIntStream.getInstance(); }
              public EmptySequentialIntStream mapMultiToInt(final @Nullable Runnable                                       mapper) { return EmptySequentialIntStream.getInstance(); }
              public EmptySequentialIntStream mapMultiToInt(final @Nullable Object @Nullable ...                          ignored) { return EmptySequentialIntStream.getInstance(); }

    @Contract(ALWAYS_THIS_1) public EmptySequentialLongStream mapMultiToLong(final @Nullable LongObjConsumer<? super @Nullable LongConsumer> mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialLongStream mapMultiToLong(final @Nullable LongConsumer                                    mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialLongStream mapMultiToLong(final @Nullable Runnable                                        mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialLongStream mapMultiToLong(final @Nullable Object @Nullable ...                           ignored) { return this; }

    @Override public EmptySequentialFloatStream mapMultiToFloat(final @Nullable LongObjConsumer<? super @Nullable FloatConsumer> mapper) { return EmptySequentialFloatStream.getInstance(); }
              public EmptySequentialFloatStream mapMultiToFloat(final @Nullable LongConsumer                                   mapper) { return EmptySequentialFloatStream.getInstance(); }
              public EmptySequentialFloatStream mapMultiToFloat(final @Nullable Runnable                                       mapper) { return EmptySequentialFloatStream.getInstance(); }
              public EmptySequentialFloatStream mapMultiToFloat(final @Nullable Object @Nullable ...                          ignored) { return EmptySequentialFloatStream.getInstance(); }

    @Override public EmptySequentialDoubleStream mapMultiToDouble(final @Nullable LongObjConsumer<? super @Nullable DoubleConsumer> mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream mapMultiToDouble(final @Nullable LongConsumer                                      mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream mapMultiToDouble(final @Nullable Runnable                                          mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream mapMultiToDouble(final @Nullable Object @Nullable ...                             ignored) { return EmptySequentialDoubleStream.getInstance(); }

    //#endregion -------------------- Map multi --------------------
    //#region -------------------- Distinct --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptySequentialLongStream distinct(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialLongStream distinct(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Distinct --------------------
    //#region -------------------- Sorted --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptySequentialLongStream sorted(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialLongStream sorted(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Sorted --------------------
    //#region -------------------- Peek --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialLongStream peek(final @Nullable LongConsumer          action) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialLongStream peek(final @Nullable Runnable              action) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialLongStream peek(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Peek --------------------
    //#region -------------------- Limit --------------------

    @Contract(ALWAYS_THIS_1)           public EmptySequentialLongStream limit(final byte                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialLongStream limit(final short                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialLongStream limit(final int                                                   maximum) { return this; }
    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialLongStream limit(final long                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialLongStream limit(final float                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialLongStream limit(final double                                                maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialLongStream limit(final @Nullable Number                                      maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialLongStream limit(final @Nullable AtomicReference<? extends @Nullable Number> maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialLongStream limit(final @Nullable Object @Nullable ...                        ignored) { return this; }

    //#endregion -------------------- Limit --------------------
    //#region -------------------- Skip --------------------

    @Contract(ALWAYS_THIS_1)           public EmptySequentialLongStream skip(final byte                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialLongStream skip(final short                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialLongStream skip(final int                                                   maximum) { return this; }
    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialLongStream skip(final long                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialLongStream skip(final float                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialLongStream skip(final double                                                maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialLongStream skip(final @Nullable Number                                      maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialLongStream skip(final @Nullable AtomicReference<? extends @Nullable Number> maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialLongStream skip(final @Nullable Object @Nullable ...                        ignored) { return this; }

    //#endregion -------------------- Skip --------------------
    //#region -------------------- Take while --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialLongStream takeWhile(final @Nullable LongPredicate      predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialLongStream takeWhile(final @Nullable BooleanSupplier    predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialLongStream takeWhile(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Take while --------------------
    //#region -------------------- Drop while --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialLongStream dropWhile(final @Nullable LongPredicate      predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialLongStream dropWhile(final @Nullable BooleanSupplier    predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialLongStream dropWhile(final @Nullable Object @Nullable ... ignored) { return this; }

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

                           @Override public                              long[] toArray(                                 ) { return LongArray(); }
    @Contract(pure = true)           public <U extends @Nullable Object> U[]    toArray(final LongFunction<U[]> generator) { return generator.apply(0); }

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

    public <U extends @Nullable Object> EmptySequentialStream<U> asStream(                                            ) { return EmptySequentialStream.getInstance(); }
    public <U extends @Nullable Object> EmptySequentialStream<U> asStream(final @Nullable Object @Nullable ... ignored) { return EmptySequentialStream.getInstance(); }

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

    @Contract(ALWAYS_THIS_0) public EmptySequentialLongStream asLongStream(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialLongStream asLongStream(final @Nullable Object @Nullable ... ignored) { return this; }

    @Override public EmptySequentialFloatStream asFloatStream(                                            ) { return EmptySequentialFloatStream.getInstance(); }
              public EmptySequentialFloatStream asFloatStream(final @Nullable Object @Nullable ... ignored) { return EmptySequentialFloatStream.getInstance(); }

    @Override public EmptySequentialDoubleStream asDoubleStream(                                            ) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream asDoubleStream(final @Nullable Object @Nullable ... ignored) { return EmptySequentialDoubleStream.getInstance(); }

    //#endregion -------------------- As stream --------------------
    //#region -------------------- Boxed --------------------

    @Override public EmptySequentialStream<Long> boxed(                                            ) { return EmptySequentialStream.getInstance(); }
              public EmptySequentialStream<Long> boxed(final @Nullable Object @Nullable ... ignored) { return EmptySequentialStream.getInstance(); }

    //#endregion -------------------- Boxed --------------------
    //#region -------------------- Java methods --------------------

    @Override public EmptyLongIterator iterator() { return EmptyLongIterator.getInstance(); }
    @Override public Spliterator.OfLong spliterator() { return CollectionCreator.getInstance().LongSpliterator(); }

    //#endregion -------------------- Java methods --------------------
    //#region -------------------- Close methods --------------------

    @Override public void close() {}
    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialLongStream onClose(final @Nullable Runnable handler) { return this; }

    //#endregion -------------------- Close methods --------------------

    //#endregion -------------------- Methods --------------------

}

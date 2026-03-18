package joookiwi.collection.java.stream;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongSupplier;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import joookiwi.collection.java.CollectionCreator;
import joookiwi.collection.java.annotation.Singleton;
import joookiwi.collection.java.callback.IntObjConsumer;
import joookiwi.collection.java.callback.ObjIntFunction;
import joookiwi.collection.java.callback.additional.BooleanConsumer;
import joookiwi.collection.java.callback.additional.ByteConsumer;
import joookiwi.collection.java.callback.additional.ByteSupplier;
import joookiwi.collection.java.callback.additional.CharConsumer;
import joookiwi.collection.java.callback.additional.CharSupplier;
import joookiwi.collection.java.callback.additional.FloatConsumer;
import joookiwi.collection.java.callback.additional.FloatSupplier;
import joookiwi.collection.java.callback.additional.IntToBooleanFunction;
import joookiwi.collection.java.callback.additional.IntToByteFunction;
import joookiwi.collection.java.callback.additional.IntToCharFunction;
import joookiwi.collection.java.callback.additional.IntToFloatFunction;
import joookiwi.collection.java.callback.additional.IntToShortFunction;
import joookiwi.collection.java.callback.additional.ShortConsumer;
import joookiwi.collection.java.callback.additional.ShortSupplier;
import joookiwi.collection.java.extended.iterator.EmptyIntIterator;
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
import static joookiwi.collection.java.method.ArrayCreator.IntArray;

/// A sequential [IntStream] with nothing (as a [singleton][Singleton] instance)
///
/// @see EmptySequentialStream
/// @see EmptySequentialBooleanStream
/// @see EmptySequentialCharStream
/// @see EmptySequentialByteStream
/// @see EmptySequentialShortStream
/// @see EmptyParallelIntStream
/// @see EmptySequentialLongStream
/// @see EmptySequentialFloatStream
/// @see EmptySequentialDoubleStream
@Singleton
@NotNullByDefault
public class EmptySequentialIntStream
        implements IntStream {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptySequentialIntStream instance;

    protected EmptySequentialIntStream() { super(); }

    public static EmptySequentialIntStream getInstance() {
        final var instance = EmptySequentialIntStream.instance;
        if (instance != null)
            return instance;
        synchronized (EmptySequentialIntStream.class) {
            final var instance2 = EmptySequentialIntStream.instance;
            if (instance2 != null)
                return instance2;
            return (EmptySequentialIntStream.instance = new EmptySequentialIntStream());
        }
    }

    //#endregion -------------------- Singleton usage --------------------

    //#region -------------------- Methods --------------------

    //#region -------------------- Is parallel --------------------

    @Contract(ALWAYS_FALSE_0) @Override public boolean isParallel(                                            ) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean isParallel(final @Nullable Object @Nullable ... ignored) { return false; }

    //#endregion -------------------- Is parallel --------------------
    //#region -------------------- Sequential --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptySequentialIntStream sequential(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialIntStream sequential(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Sequential --------------------
    //#region -------------------- Parallel --------------------

    @Override public EmptyParallelIntStream parallel(                                            ) { return EmptyParallelIntStream.getInstance(); }
              public EmptyParallelIntStream parallel(final @Nullable Object @Nullable ... ignored) { return EmptyParallelIntStream.getInstance(); }

    //#endregion -------------------- Parallel --------------------
    //#region -------------------- Unordered --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptySequentialIntStream unordered(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialIntStream unordered(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Unordered --------------------
    //#region -------------------- Filter --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialIntStream filter(final @Nullable IntPredicate         predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialIntStream filter(final @Nullable BooleanSupplier      predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialIntStream filter(final @Nullable Object @Nullable ...   ignored) { return this; }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Map --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialIntStream map(final @Nullable IntUnaryOperator      mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialIntStream map(final @Nullable IntSupplier           mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialIntStream map(final @Nullable Object @Nullable ... ignored) { return this; }

    @Override public <U> EmptySequentialStream<U> mapToObj(final @Nullable IntFunction<? extends U> mapper) { return EmptySequentialStream.getInstance(); }
              public <U> EmptySequentialStream<U> mapToObj(final @Nullable Supplier<? extends U>    mapper) { return EmptySequentialStream.getInstance(); }
              public <U> EmptySequentialStream<U> mapToObj(final @Nullable Object @Nullable ...    ignored) { return EmptySequentialStream.getInstance(); }

    @Override public EmptySequentialBooleanStream mapToBoolean(final @Nullable IntToBooleanFunction  mapper) { return EmptySequentialBooleanStream.getInstance(); }
              public EmptySequentialBooleanStream mapToBoolean(final @Nullable BooleanSupplier       mapper) { return EmptySequentialBooleanStream.getInstance(); }
              public EmptySequentialBooleanStream mapToBoolean(final @Nullable Object @Nullable ... ignored) { return EmptySequentialBooleanStream.getInstance(); }

    @Override public EmptySequentialCharStream mapToChar(final @Nullable IntToCharFunction     mapper) { return EmptySequentialCharStream.getInstance(); }
              public EmptySequentialCharStream mapToChar(final @Nullable CharSupplier          mapper) { return EmptySequentialCharStream.getInstance(); }
              public EmptySequentialCharStream mapToChar(final @Nullable Object @Nullable ... ignored) { return EmptySequentialCharStream.getInstance(); }

    @Override public EmptySequentialByteStream mapToByte(final @Nullable IntToByteFunction     mapper) { return EmptySequentialByteStream.getInstance(); }
              public EmptySequentialByteStream mapToByte(final @Nullable ByteSupplier          mapper) { return EmptySequentialByteStream.getInstance(); }
              public EmptySequentialByteStream mapToByte(final @Nullable Object @Nullable ... ignored) { return EmptySequentialByteStream.getInstance(); }

    @Override public EmptySequentialShortStream mapToShort(final @Nullable IntToShortFunction    mapper) { return EmptySequentialShortStream.getInstance(); }
              public EmptySequentialShortStream mapToShort(final @Nullable ShortSupplier         mapper) { return EmptySequentialShortStream.getInstance(); }
              public EmptySequentialShortStream mapToShort(final @Nullable Object @Nullable ... ignored) { return EmptySequentialShortStream.getInstance(); }

    @Contract(ALWAYS_THIS_1) public EmptySequentialIntStream mapToInt(final @Nullable IntUnaryOperator      mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialIntStream mapToInt(final @Nullable IntSupplier           mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialIntStream mapToInt(final @Nullable Object @Nullable ... ignored) { return this; }

    @Override public EmptySequentialLongStream mapToLong(final @Nullable IntToLongFunction     mapper) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream mapToLong(final @Nullable LongSupplier          mapper) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream mapToLong(final @Nullable Object @Nullable ... ignored) { return EmptySequentialLongStream.getInstance(); }

    @Override public EmptySequentialFloatStream mapToFloat(final @Nullable IntToFloatFunction    mapper) { return EmptySequentialFloatStream.getInstance(); }
              public EmptySequentialFloatStream mapToFloat(final @Nullable FloatSupplier         mapper) { return EmptySequentialFloatStream.getInstance(); }
              public EmptySequentialFloatStream mapToFloat(final @Nullable Object @Nullable ... ignored) { return EmptySequentialFloatStream.getInstance(); }

    @Override public EmptySequentialDoubleStream mapToDouble(final @Nullable IntToDoubleFunction   mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream mapToDouble(final @Nullable DoubleSupplier        mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream mapToDouble(final @Nullable Object @Nullable ... ignored) { return EmptySequentialDoubleStream.getInstance(); }

    //#endregion -------------------- Map --------------------
    //#region -------------------- Flat map --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialIntStream flatMap(final @Nullable IntFunction<? extends java.util.stream.@Nullable IntStream> mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialIntStream flatMap(final @Nullable Supplier<? extends @Nullable IntStream>                     mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialIntStream flatMap(final @Nullable Object @Nullable ...                                       ignored) { return this; }

    @Override public <U> EmptySequentialStream<U> flatMapToObj(final @Nullable IntFunction<? extends @Nullable Stream<? extends U>> mapper) { return EmptySequentialStream.getInstance(); }
              public <U> EmptySequentialStream<U> flatMapToObj(final @Nullable Supplier<? extends @Nullable Stream<? extends U>>    mapper) { return EmptySequentialStream.getInstance(); }
              public <U> EmptySequentialStream<U> flatMapToObj(final @Nullable Object @Nullable ...                                ignored) { return EmptySequentialStream.getInstance(); }

    @Override public EmptySequentialBooleanStream flatMapToBoolean(final @Nullable IntFunction<? extends @Nullable BooleanStream> mapper) { return EmptySequentialBooleanStream.getInstance(); }
              public EmptySequentialBooleanStream flatMapToBoolean(final @Nullable Supplier<? extends @Nullable BooleanStream>    mapper) { return EmptySequentialBooleanStream.getInstance(); }
              public EmptySequentialBooleanStream flatMapToBoolean(final @Nullable Object @Nullable ...                          ignored) { return EmptySequentialBooleanStream.getInstance(); }

    @Override public EmptySequentialCharStream flatMapToChar(final @Nullable IntFunction<? extends @Nullable CharStream> mapper) { return EmptySequentialCharStream.getInstance(); }
              public EmptySequentialCharStream flatMapToChar(final @Nullable Supplier<? extends @Nullable CharStream>    mapper) { return EmptySequentialCharStream.getInstance(); }
              public EmptySequentialCharStream flatMapToChar(final @Nullable Object @Nullable ...                       ignored) { return EmptySequentialCharStream.getInstance(); }

    @Override public EmptySequentialByteStream flatMapToByte(final @Nullable IntFunction<? extends @Nullable ByteStream> mapper) { return EmptySequentialByteStream.getInstance(); }
              public EmptySequentialByteStream flatMapToByte(final @Nullable Supplier<? extends @Nullable ByteStream>    mapper) { return EmptySequentialByteStream.getInstance(); }
              public EmptySequentialByteStream flatMapToByte(final @Nullable Object @Nullable ...                       ignored) { return EmptySequentialByteStream.getInstance(); }

    @Override public EmptySequentialShortStream flatMapToShort(final @Nullable IntFunction<? extends @Nullable ShortStream> mapper) { return EmptySequentialShortStream.getInstance(); }
              public EmptySequentialShortStream flatMapToShort(final @Nullable Supplier<? extends @Nullable ShortStream>    mapper) { return EmptySequentialShortStream.getInstance(); }
              public EmptySequentialShortStream flatMapToShort(final @Nullable Object @Nullable ...                        ignored) { return EmptySequentialShortStream.getInstance(); }

    @Contract(ALWAYS_THIS_1) public EmptySequentialIntStream flatMapToInt(final @Nullable IntFunction<? extends java.util.stream.@Nullable IntStream> mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialIntStream flatMapToInt(final @Nullable Supplier<? extends @Nullable IntStream>                     mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialIntStream flatMapToInt(final @Nullable Object @Nullable ...                                       ignored) { return this; }

    @Override public EmptySequentialLongStream flatMapToLong(final @Nullable IntFunction<? extends @Nullable LongStream> mapper) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream flatMapToLong(final @Nullable Supplier<? extends @Nullable LongStream>    mapper) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream flatMapToLong(final @Nullable Object @Nullable ...                       ignored) { return EmptySequentialLongStream.getInstance(); }

    @Override public EmptySequentialFloatStream flatMapToFloat(final @Nullable IntFunction<? extends @Nullable FloatStream> mapper) { return EmptySequentialFloatStream.getInstance(); }
              public EmptySequentialFloatStream flatMapToFloat(final @Nullable Supplier<? extends @Nullable FloatStream>    mapper) { return EmptySequentialFloatStream.getInstance(); }
              public EmptySequentialFloatStream flatMapToFloat(final @Nullable Object @Nullable ...                        ignored) { return EmptySequentialFloatStream.getInstance(); }

    @Override public EmptySequentialDoubleStream flatMapToDouble(final @Nullable IntFunction<? extends @Nullable DoubleStream> mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream flatMapToDouble(final @Nullable Supplier<? extends @Nullable DoubleStream>    mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream flatMapToDouble(final @Nullable Object @Nullable ...                         ignored) { return EmptySequentialDoubleStream.getInstance(); }

    //#endregion -------------------- Flat map --------------------
    //#region -------------------- Map multi --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialIntStream mapMulti(final @Nullable IntMapMultiConsumer   mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialIntStream mapMulti(final @Nullable IntConsumer           mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialIntStream mapMulti(final @Nullable Runnable              mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialIntStream mapMulti(final @Nullable Object @Nullable ... ignored) { return this; }

    @Override public <U> EmptySequentialStream<U> mapMultiToObj(final @Nullable IntObjConsumer<? super @Nullable Consumer<U>> mapper) { return EmptySequentialStream.getInstance(); }
              public <U> EmptySequentialStream<U> mapMultiToObj(final @Nullable IntConsumer                                   mapper) { return EmptySequentialStream.getInstance(); }
              public <U> EmptySequentialStream<U> mapMultiToObj(final @Nullable Runnable                                      mapper) { return EmptySequentialStream.getInstance(); }
              public <U> EmptySequentialStream<U> mapMultiToObj(final @Nullable Object @Nullable ...                         ignored) { return EmptySequentialStream.getInstance(); }

    @Override public EmptySequentialBooleanStream mapMultiToBoolean(final @Nullable IntObjConsumer<? super @Nullable BooleanConsumer> mapper) { return EmptySequentialBooleanStream.getInstance(); }
              public EmptySequentialBooleanStream mapMultiToBoolean(final @Nullable IntConsumer                                       mapper) { return EmptySequentialBooleanStream.getInstance(); }
              public EmptySequentialBooleanStream mapMultiToBoolean(final @Nullable Runnable                                          mapper) { return EmptySequentialBooleanStream.getInstance(); }
              public EmptySequentialBooleanStream mapMultiToBoolean(final @Nullable Object @Nullable ...                             ignored) { return EmptySequentialBooleanStream.getInstance(); }

    @Override public EmptySequentialCharStream mapMultiToChar(final @Nullable IntObjConsumer<? super @Nullable CharConsumer> mapper) { return EmptySequentialCharStream.getInstance(); }
              public EmptySequentialCharStream mapMultiToChar(final @Nullable IntConsumer                                    mapper) { return EmptySequentialCharStream.getInstance(); }
              public EmptySequentialCharStream mapMultiToChar(final @Nullable Runnable                                       mapper) { return EmptySequentialCharStream.getInstance(); }
              public EmptySequentialCharStream mapMultiToChar(final @Nullable Object @Nullable ...                          ignored) { return EmptySequentialCharStream.getInstance(); }

    @Override public EmptySequentialByteStream mapMultiToByte(final @Nullable IntObjConsumer<? super @Nullable ByteConsumer> mapper) { return EmptySequentialByteStream.getInstance(); }
              public EmptySequentialByteStream mapMultiToByte(final @Nullable IntConsumer                                    mapper) { return EmptySequentialByteStream.getInstance(); }
              public EmptySequentialByteStream mapMultiToByte(final @Nullable Runnable                                       mapper) { return EmptySequentialByteStream.getInstance(); }
              public EmptySequentialByteStream mapMultiToByte(final @Nullable Object @Nullable ...                          ignored) { return EmptySequentialByteStream.getInstance(); }

    @Override public EmptySequentialShortStream mapMultiToShort(final @Nullable IntObjConsumer<? super @Nullable ShortConsumer> mapper) { return EmptySequentialShortStream.getInstance(); }
              public EmptySequentialShortStream mapMultiToShort(final @Nullable IntConsumer                                     mapper) { return EmptySequentialShortStream.getInstance(); }
              public EmptySequentialShortStream mapMultiToShort(final @Nullable Runnable                                        mapper) { return EmptySequentialShortStream.getInstance(); }
              public EmptySequentialShortStream mapMultiToShort(final @Nullable Object @Nullable ...                           ignored) { return EmptySequentialShortStream.getInstance(); }

    @Contract(ALWAYS_THIS_1) public EmptySequentialIntStream mapMultiToInt(final @Nullable IntMapMultiConsumer   mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialIntStream mapMultiToInt(final @Nullable IntConsumer           mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialIntStream mapMultiToInt(final @Nullable Runnable              mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialIntStream mapMultiToInt(final @Nullable Object @Nullable ... ignored) { return this; }

    @Override public EmptySequentialLongStream mapMultiToLong(final @Nullable IntObjConsumer<? super @Nullable LongConsumer> mapper) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream mapMultiToLong(final @Nullable IntConsumer                                    mapper) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream mapMultiToLong(final @Nullable Runnable                                       mapper) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream mapMultiToLong(final @Nullable Object @Nullable ...                          ignored) { return EmptySequentialLongStream.getInstance(); }

    @Override public EmptySequentialFloatStream mapMultiToFloat(final @Nullable IntObjConsumer<? super @Nullable FloatConsumer> mapper) { return EmptySequentialFloatStream.getInstance(); }
              public EmptySequentialFloatStream mapMultiToFloat(final @Nullable IntConsumer                                     mapper) { return EmptySequentialFloatStream.getInstance(); }
              public EmptySequentialFloatStream mapMultiToFloat(final @Nullable Runnable                                        mapper) { return EmptySequentialFloatStream.getInstance(); }
              public EmptySequentialFloatStream mapMultiToFloat(final @Nullable Object @Nullable ...                           ignored) { return EmptySequentialFloatStream.getInstance(); }

    @Override public EmptySequentialDoubleStream mapMultiToDouble(final @Nullable IntObjConsumer<? super @Nullable DoubleConsumer> mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream mapMultiToDouble(final @Nullable IntConsumer                                     mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream mapMultiToDouble(final @Nullable Runnable                                         mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream mapMultiToDouble(final @Nullable Object @Nullable ...                            ignored) { return EmptySequentialDoubleStream.getInstance(); }

    //#endregion -------------------- Map multi --------------------
    //#region -------------------- Distinct --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptySequentialIntStream distinct(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialIntStream distinct(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Distinct --------------------
    //#region -------------------- Sorted --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptySequentialIntStream sorted(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialIntStream sorted(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Sorted --------------------
    //#region -------------------- Peek --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialIntStream peek(final @Nullable IntConsumer           action) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialIntStream peek(final @Nullable Runnable              action) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialIntStream peek(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Peek --------------------
    //#region -------------------- Limit --------------------

    @Contract(ALWAYS_THIS_1)           public EmptySequentialIntStream limit(final byte                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialIntStream limit(final short                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialIntStream limit(final int                                                   maximum) { return this; }
    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialIntStream limit(final long                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialIntStream limit(final float                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialIntStream limit(final double                                                maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialIntStream limit(final @Nullable Number                                      maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialIntStream limit(final @Nullable AtomicReference<? extends @Nullable Number> maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialIntStream limit(final @Nullable Object @Nullable ...                        ignored) { return this; }

    //#endregion -------------------- Limit --------------------
    //#region -------------------- Skip --------------------

    @Contract(ALWAYS_THIS_1)           public EmptySequentialIntStream skip(final byte                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialIntStream skip(final short                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialIntStream skip(final int                                                   maximum) { return this; }
    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialIntStream skip(final long                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialIntStream skip(final float                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialIntStream skip(final double                                                maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialIntStream skip(final @Nullable Number                                      maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialIntStream skip(final @Nullable AtomicReference<? extends @Nullable Number> maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialIntStream skip(final @Nullable Object @Nullable ...                        ignored) { return this; }

    //#endregion -------------------- Skip --------------------
    //#region -------------------- Take while --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialIntStream takeWhile(final @Nullable IntPredicate       predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialIntStream takeWhile(final @Nullable BooleanSupplier    predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialIntStream takeWhile(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Take while --------------------
    //#region -------------------- Drop while --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialIntStream dropWhile(final @Nullable IntPredicate       predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialIntStream dropWhile(final @Nullable BooleanSupplier    predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialIntStream dropWhile(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Drop while --------------------
    //#region -------------------- For each --------------------

    @Override public void forEach(final @Nullable IntConsumer           action) {}
              public void forEach(final @Nullable Runnable              action) {}
              public void forEach(final @Nullable Object @Nullable ... ignored) {}

    //#endregion -------------------- For each --------------------
    //#region -------------------- For each ordered --------------------

    @Override public void forEachOrdered(final @Nullable IntConsumer           action) {}
              public void forEachOrdered(final @Nullable Runnable              action) {}
              public void forEachOrdered(final @Nullable Object @Nullable ... ignored) {}

    //#endregion -------------------- For each ordered --------------------
    //#region -------------------- To array --------------------

                           @Override public                              int[] toArray(                                ) { return IntArray(); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> U[]   toArray(final IntFunction<U[]> generator) { return generator.apply(0); }

    //#endregion -------------------- To array --------------------
    //#region -------------------- Reduce --------------------

    @Contract(ALWAYS_1ST_1)           public final int reduce(final int initial                                               ) { return initial; }
    @Contract(ALWAYS_1ST_2) @Override public final int reduce(final int initial, final @Nullable IntBinaryOperator accumulator) { return initial; }
    @Contract(ALWAYS_1ST_2)           public final int reduce(final int initial, final @Nullable IntSupplier       accumulator) { return initial; }
    @Contract(ALWAYS_1ST_2)           public final int reduce(final int initial, final @Nullable Object @Nullable ...  ignored) { return initial; }

    @Override public OptionalInt reduce(final @Nullable IntBinaryOperator accumulator) { return OptionalInt.empty(); }
              public OptionalInt reduce(final @Nullable IntSupplier       accumulator) { return OptionalInt.empty(); }
              public OptionalInt reduce(final @Nullable Object @Nullable ...  ignored) { return OptionalInt.empty(); }

    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable ObjIntFunction<U, U> accumulator, final @Nullable BinaryOperator<U>   combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable ObjIntFunction<U, U> accumulator, final @Nullable Supplier<U>         combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable ObjIntFunction<U, U> accumulator, final @Nullable Object @Nullable ... ignored) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Function<U, U>       accumulator, final @Nullable BinaryOperator<U>   combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Function<U, U>       accumulator, final @Nullable Supplier<U>         combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Function<U, U>       accumulator, final @Nullable Object @Nullable ... ignored) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Supplier<U>          accumulator, final @Nullable BinaryOperator<U>   combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Supplier<U>          accumulator, final @Nullable Supplier<U>         combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Supplier<U>          accumulator, final @Nullable Object @Nullable ... ignored) { return initial; }

    //#endregion -------------------- Reduce --------------------
    //#region -------------------- Collect --------------------

    @Contract(ALWAYS_NULL_3) @Override public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjIntConsumer<R> accumulator, final @Nullable BiConsumer<R, R>    combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjIntConsumer<R> accumulator, final @Nullable Consumer<R>         combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjIntConsumer<R> accumulator, final @Nullable Runnable            combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjIntConsumer<R> accumulator, final @Nullable Object @Nullable ... ignored) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Consumer<R>       accumulator, final @Nullable BiConsumer<R, R>    combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Consumer<R>       accumulator, final @Nullable Consumer<R>         combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Consumer<R>       accumulator, final @Nullable Runnable            combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Consumer<R>       accumulator, final @Nullable Object @Nullable ... ignored) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Runnable          accumulator, final @Nullable BiConsumer<R, R>    combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Runnable          accumulator, final @Nullable Consumer<R>         combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Runnable          accumulator, final @Nullable Runnable            combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Runnable          accumulator, final @Nullable Object @Nullable ... ignored) { return null; }

    @Contract(ALWAYS_NULL_2) public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Object @Nullable ... ignored) { return null; }

    @Contract(ALWAYS_NULL_1) public <R extends @Nullable Object> R collect(final @Nullable Object @Nullable ... ignored) { return null; }

    //#endregion -------------------- Collect --------------------
    //#region -------------------- Sum --------------------

    @Override public @Range(from = 0, to = 0) int sum(                                            ) { return 0; }
              public @Range(from = 0, to = 0) int sum(final @Nullable Object @Nullable ... ignored) { return 0; }

    //#endregion -------------------- Sum --------------------
    //#region -------------------- Min --------------------

    @Override public OptionalInt min(                                            ) { return OptionalInt.empty(); }
              public OptionalInt min(final @Nullable Object @Nullable ... ignored) { return OptionalInt.empty(); }

    //#endregion -------------------- Min --------------------
    //#region -------------------- Max --------------------

    @Override public OptionalInt max(                                            ) { return OptionalInt.empty(); }
              public OptionalInt max(final @Nullable Object @Nullable ... ignored) { return OptionalInt.empty(); }

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

    @Override public IntSummaryStatistics summaryStatistics(                                            ) { return new IntSummaryStatistics(); }
              public IntSummaryStatistics summaryStatistics(final @Nullable Object @Nullable ... ignored) { return new IntSummaryStatistics(); }

    //#endregion -------------------- Summary statistics --------------------
    //#region -------------------- All match --------------------

    @Contract(ALWAYS_TRUE_1) @Override public boolean allMatch(final @Nullable IntPredicate       predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean allMatch(final @Nullable BooleanSupplier    predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean allMatch(final @Nullable Object @Nullable ... ignored) { return true; }

    //#endregion -------------------- All match --------------------
    //#region -------------------- Any match --------------------

    @Contract(ALWAYS_FALSE_0)           public boolean anyMatch(                                            ) { return false; }
    @Contract(ALWAYS_FALSE_1) @Override public boolean anyMatch(final @Nullable IntPredicate       predicate) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean anyMatch(final @Nullable BooleanSupplier    predicate) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean anyMatch(final @Nullable Object @Nullable ... ignored) { return false; }

    //#endregion -------------------- Any match --------------------
    //#region -------------------- None match --------------------

    @Contract(ALWAYS_TRUE_0)           public boolean noneMatch(                                            ) { return true; }
    @Contract(ALWAYS_TRUE_1) @Override public boolean noneMatch(final @Nullable IntPredicate       predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean noneMatch(final @Nullable BooleanSupplier    predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean noneMatch(final @Nullable Object @Nullable ... ignored) { return true; }

    //#endregion -------------------- None match --------------------
    //#region -------------------- Find first --------------------

    @Override public OptionalInt findFirst(                                            ) { return OptionalInt.empty(); }
              public OptionalInt findFirst(final @Nullable Object @Nullable ... ignored) { return OptionalInt.empty(); }

    //#endregion -------------------- Find first --------------------
    //#region -------------------- Find any --------------------

    @Override public OptionalInt findAny(                                            ) { return OptionalInt.empty(); }
              public OptionalInt findAny(final @Nullable Object @Nullable ... ignored) { return OptionalInt.empty(); }

    //#endregion -------------------- Find any --------------------
    //#region -------------------- As stream --------------------

    public <U> EmptySequentialStream<U> asStream(                                            ) { return EmptySequentialStream.getInstance(); }
    public <U> EmptySequentialStream<U> asStream(final @Nullable Object @Nullable ... ignored) { return EmptySequentialStream.getInstance(); }

    public EmptySequentialBooleanStream asBooleanStream(                                            ) { return EmptySequentialBooleanStream.getInstance(); }
    public EmptySequentialBooleanStream asBooleanStream(final @Nullable Object @Nullable ... ignored) { return EmptySequentialBooleanStream.getInstance(); }

    public EmptySequentialCharStream asCharStream(                                            ) { return EmptySequentialCharStream.getInstance(); }
    public EmptySequentialCharStream asCharStream(final @Nullable Object @Nullable ... ignored) { return EmptySequentialCharStream.getInstance(); }

    public EmptySequentialByteStream asByteStream(                                            ) { return EmptySequentialByteStream.getInstance(); }
    public EmptySequentialByteStream asByteStream(final @Nullable Object @Nullable ... ignored) { return EmptySequentialByteStream.getInstance(); }

    public EmptySequentialShortStream asShortStream(                                            ) { return EmptySequentialShortStream.getInstance(); }
    public EmptySequentialShortStream asShortStream(final @Nullable Object @Nullable ... ignored) { return EmptySequentialShortStream.getInstance(); }

    @Contract(ALWAYS_THIS_0) public EmptySequentialIntStream asIntStream(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialIntStream asIntStream(final @Nullable Object @Nullable ... ignored) { return this; }

    @Override public EmptySequentialLongStream asLongStream(                                            ) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream asLongStream(final @Nullable Object @Nullable ... ignored) { return EmptySequentialLongStream.getInstance(); }

    @Override public EmptySequentialFloatStream asFloatStream(                                            ) { return EmptySequentialFloatStream.getInstance(); }
              public EmptySequentialFloatStream asFloatStream(final @Nullable Object @Nullable ... ignored) { return EmptySequentialFloatStream.getInstance(); }

    @Override public EmptySequentialDoubleStream asDoubleStream(                                            ) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream asDoubleStream(final @Nullable Object @Nullable ... ignored) { return EmptySequentialDoubleStream.getInstance(); }

    //#endregion -------------------- As stream --------------------
    //#region -------------------- Boxed --------------------

    @Override public EmptySequentialStream<Integer> boxed(                                            ) { return EmptySequentialStream.getInstance(); }
              public EmptySequentialStream<Integer> boxed(final @Nullable Object @Nullable ... ignored) { return EmptySequentialStream.getInstance(); }

    //#endregion -------------------- Boxed --------------------
    //#region -------------------- Java methods --------------------

    @Override public EmptyIntIterator iterator() { return EmptyIntIterator.getInstance(); }
    @Override public Spliterator.OfInt spliterator() { return CollectionCreator.getInstance().IntSpliterator(); }

    //#endregion -------------------- Java methods --------------------
    //#region -------------------- Close methods --------------------

    @Override public void close() {}
    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialIntStream onClose(final @Nullable Runnable handler) { return this; }

    //#endregion -------------------- Close methods --------------------

    //#endregion -------------------- Methods --------------------

}

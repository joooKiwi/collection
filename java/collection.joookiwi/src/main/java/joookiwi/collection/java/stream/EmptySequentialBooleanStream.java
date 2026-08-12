package joookiwi.collection.java.stream;

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
import java.util.function.IntSupplier;
import java.util.function.LongConsumer;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import joookiwi.collection.java.annotation.Singleton;
import joookiwi.collection.java.callback.additional.BooleanBinaryOperator;
import joookiwi.collection.java.callback.additional.BooleanConsumer;
import joookiwi.collection.java.callback.additional.BooleanFunction;
import joookiwi.collection.java.callback.additional.BooleanObjConsumer;
import joookiwi.collection.java.callback.additional.BooleanToByteFunction;
import joookiwi.collection.java.callback.additional.BooleanToCharFunction;
import joookiwi.collection.java.callback.additional.BooleanToDoubleFunction;
import joookiwi.collection.java.callback.additional.BooleanToFloatFunction;
import joookiwi.collection.java.callback.additional.BooleanToIntFunction;
import joookiwi.collection.java.callback.additional.BooleanToLongFunction;
import joookiwi.collection.java.callback.additional.BooleanToShortFunction;
import joookiwi.collection.java.callback.additional.BooleanUnaryOperator;
import joookiwi.collection.java.callback.additional.ByteConsumer;
import joookiwi.collection.java.callback.additional.CharConsumer;
import joookiwi.collection.java.callback.additional.CharSupplier;
import joookiwi.collection.java.callback.additional.FloatConsumer;
import joookiwi.collection.java.callback.additional.FloatSupplier;
import joookiwi.collection.java.callback.additional.ObjBooleanConsumer;
import joookiwi.collection.java.callback.additional.ObjBooleanFunction;
import joookiwi.collection.java.callback.additional.ShortConsumer;
import joookiwi.collection.java.callback.additional.ShortSupplier;
import joookiwi.collection.java.extended.iterator.EmptyBooleanIterator;
import joookiwi.collection.java.extended.iterator.EmptyBooleanSpliterator;
import joookiwi.collection.java.optional.EmptyOptionalBoolean;
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
import static joookiwi.collection.java.method.ArrayCreator.BooleanArray;

/// A sequential [BooleanStream] with nothing (as a [singleton][Singleton] instance)
///
/// @see EmptySequentialStream
/// @see EmptyParallelBooleanStream
/// @see EmptySequentialCharStream
/// @see EmptySequentialByteStream
/// @see EmptySequentialShortStream
/// @see EmptySequentialIntStream
/// @see EmptySequentialLongStream
/// @see EmptySequentialFloatStream
/// @see EmptySequentialDoubleStream
@Singleton
@NotNullByDefault
public class EmptySequentialBooleanStream
        implements BooleanStream {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptySequentialBooleanStream instance;

    protected EmptySequentialBooleanStream() { super(); }

    public static EmptySequentialBooleanStream getInstance() {
        final var instance = EmptySequentialBooleanStream.instance;
        if (instance != null)
            return instance;
        synchronized (EmptySequentialBooleanStream.class) {
            final var instance2 = EmptySequentialBooleanStream.instance;
            if (instance2 != null)
                return instance2;
            return (EmptySequentialBooleanStream.instance = new EmptySequentialBooleanStream());
        }
    }

    //#endregion -------------------- Singleton usage --------------------

    //#region -------------------- Methods --------------------

    //#region -------------------- Is parallel --------------------

    @Contract(ALWAYS_FALSE_0) @Override public boolean isParallel(                                            ) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean isParallel(final @Nullable Object @Nullable ... ignored) { return false; }

    //#endregion -------------------- Is parallel --------------------
    //#region -------------------- Sequential --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptySequentialBooleanStream sequential(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialBooleanStream sequential(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Sequential --------------------
    //#region -------------------- Parallel --------------------

    @Override public EmptyParallelBooleanStream parallel(                                            ) { return EmptyParallelBooleanStream.getInstance(); }
              public EmptyParallelBooleanStream parallel(final @Nullable Object @Nullable ... ignored) { return EmptyParallelBooleanStream.getInstance(); }

    //#endregion -------------------- Parallel --------------------
    //#region -------------------- Unordered --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptySequentialBooleanStream unordered(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialBooleanStream unordered(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Unordered --------------------
    //#region -------------------- Filter --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialBooleanStream filter(final @Nullable BooleanUnaryOperator predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialBooleanStream filter(final @Nullable BooleanSupplier      predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialBooleanStream filter(final @Nullable Object @Nullable ...   ignored) { return this; }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Map --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialBooleanStream map(final @Nullable BooleanUnaryOperator  mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialBooleanStream map(final @Nullable BooleanSupplier       mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialBooleanStream map(final @Nullable Object @Nullable ... ignored) { return this; }

    @Override public <U> EmptySequentialStream<U> mapToObj(final @Nullable BooleanFunction<? extends U> mapper) { return EmptySequentialStream.getInstance(); }
              public <U> EmptySequentialStream<U> mapToObj(final @Nullable Supplier<? extends U>        mapper) { return EmptySequentialStream.getInstance(); }
              public <U> EmptySequentialStream<U> mapToObj(final @Nullable Object @Nullable ...        ignored) { return EmptySequentialStream.getInstance(); }

    @Contract(ALWAYS_THIS_1) public EmptySequentialBooleanStream mapToBoolean(final @Nullable BooleanUnaryOperator  mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialBooleanStream mapToBoolean(final @Nullable BooleanSupplier       mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialBooleanStream mapToBoolean(final @Nullable Object @Nullable ... ignored) { return this; }

    @Override public EmptySequentialCharStream mapToChar(final @Nullable BooleanToCharFunction mapper) { return EmptySequentialCharStream.getInstance(); }
              public EmptySequentialCharStream mapToChar(final @Nullable CharSupplier          mapper) { return EmptySequentialCharStream.getInstance(); }
              public EmptySequentialCharStream mapToChar(final @Nullable Object @Nullable ... ignored) { return EmptySequentialCharStream.getInstance(); }

    @Override public EmptySequentialByteStream mapToByte(final @Nullable BooleanToByteFunction  mapper) { return EmptySequentialByteStream.getInstance(); }
              public EmptySequentialByteStream mapToByte(final @Nullable BooleanSupplier        mapper) { return EmptySequentialByteStream.getInstance(); }
              public EmptySequentialByteStream mapToByte(final @Nullable Object @Nullable ...  ignored) { return EmptySequentialByteStream.getInstance(); }

    @Override public EmptySequentialShortStream mapToShort(final @Nullable BooleanToShortFunction mapper) { return EmptySequentialShortStream.getInstance(); }
              public EmptySequentialShortStream mapToShort(final @Nullable ShortSupplier          mapper) { return EmptySequentialShortStream.getInstance(); }
              public EmptySequentialShortStream mapToShort(final @Nullable Object @Nullable ...  ignored) { return EmptySequentialShortStream.getInstance(); }

    @Override public EmptySequentialIntStream mapToInt(final @Nullable BooleanToIntFunction  mapper) { return EmptySequentialIntStream.getInstance(); }
              public EmptySequentialIntStream mapToInt(final @Nullable IntSupplier           mapper) { return EmptySequentialIntStream.getInstance(); }
              public EmptySequentialIntStream mapToInt(final @Nullable Object @Nullable ... ignored) { return EmptySequentialIntStream.getInstance(); }

    @Override public EmptySequentialLongStream mapToLong(final @Nullable BooleanToLongFunction mapper) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream mapToLong(final @Nullable LongSupplier          mapper) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream mapToLong(final @Nullable Object @Nullable ... ignored) { return EmptySequentialLongStream.getInstance(); }

    @Override public EmptySequentialFloatStream mapToFloat(final @Nullable BooleanToFloatFunction mapper) { return EmptySequentialFloatStream.getInstance(); }
              public EmptySequentialFloatStream mapToFloat(final @Nullable FloatSupplier          mapper) { return EmptySequentialFloatStream.getInstance(); }
              public EmptySequentialFloatStream mapToFloat(final @Nullable Object @Nullable ...  ignored) { return EmptySequentialFloatStream.getInstance(); }

    @Override public EmptySequentialDoubleStream mapToDouble(final @Nullable BooleanToDoubleFunction mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream mapToDouble(final @Nullable DoubleSupplier          mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream mapToDouble(final @Nullable Object @Nullable ...   ignored) { return EmptySequentialDoubleStream.getInstance(); }

    //#endregion -------------------- Map --------------------
    //#region -------------------- Flat map --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialBooleanStream flatMap(final @Nullable BooleanFunction<? extends @Nullable BooleanStream> mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialBooleanStream flatMap(final @Nullable Supplier<? extends @Nullable BooleanStream>        mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialBooleanStream flatMap(final @Nullable Object @Nullable ...                              ignored) { return this; }

    @Override public <U> EmptySequentialStream<U> flatMapToObj(final @Nullable BooleanFunction<? extends @Nullable Stream<? extends U>> mapper) { return EmptySequentialStream.getInstance(); }
              public <U> EmptySequentialStream<U> flatMapToObj(final @Nullable Supplier<? extends @Nullable Stream<? extends U>>        mapper) { return EmptySequentialStream.getInstance(); }
              public <U> EmptySequentialStream<U> flatMapToObj(final @Nullable Object @Nullable ...                                    ignored) { return EmptySequentialStream.getInstance(); }

    @Contract(ALWAYS_THIS_1) public EmptySequentialBooleanStream flatMapToBoolean(final @Nullable BooleanFunction<? extends @Nullable BooleanStream> mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialBooleanStream flatMapToBoolean(final @Nullable Supplier<? extends @Nullable BooleanStream>        mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialBooleanStream flatMapToBoolean(final @Nullable Object @Nullable ...                              ignored) { return this; }

    @Override public EmptySequentialCharStream flatMapToChar(final @Nullable BooleanFunction<? extends @Nullable CharStream> mapper) { return EmptySequentialCharStream.getInstance(); }
              public EmptySequentialCharStream flatMapToChar(final @Nullable Supplier<? extends @Nullable CharStream>        mapper) { return EmptySequentialCharStream.getInstance(); }
              public EmptySequentialCharStream flatMapToChar(final @Nullable Object @Nullable ...                           ignored) { return EmptySequentialCharStream.getInstance(); }

    @Override public EmptySequentialByteStream flatMapToByte(final @Nullable BooleanFunction<? extends @Nullable ByteStream> mapper) { return EmptySequentialByteStream.getInstance(); }
              public EmptySequentialByteStream flatMapToByte(final @Nullable Supplier<? extends @Nullable ByteStream>        mapper) { return EmptySequentialByteStream.getInstance(); }
              public EmptySequentialByteStream flatMapToByte(final @Nullable Object @Nullable ...                           ignored) { return EmptySequentialByteStream.getInstance(); }

    @Override public EmptySequentialShortStream flatMapToShort(final @Nullable BooleanFunction<? extends @Nullable ShortStream> mapper) { return EmptySequentialShortStream.getInstance(); }
              public EmptySequentialShortStream flatMapToShort(final @Nullable Supplier<? extends @Nullable ShortStream>        mapper) { return EmptySequentialShortStream.getInstance(); }
              public EmptySequentialShortStream flatMapToShort(final @Nullable Object @Nullable ...                            ignored) { return EmptySequentialShortStream.getInstance(); }

    @Override public EmptySequentialIntStream flatMapToInt(final @Nullable BooleanFunction<? extends @Nullable IntStream> mapper) { return EmptySequentialIntStream.getInstance(); }
              public EmptySequentialIntStream flatMapToInt(final @Nullable Supplier<? extends @Nullable IntStream>        mapper) { return EmptySequentialIntStream.getInstance(); }
              public EmptySequentialIntStream flatMapToInt(final @Nullable Object @Nullable ...                          ignored) { return EmptySequentialIntStream.getInstance(); }

    @Override public EmptySequentialLongStream flatMapToLong(final @Nullable BooleanFunction<? extends @Nullable LongStream> mapper) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream flatMapToLong(final @Nullable Supplier<? extends @Nullable LongStream>        mapper) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream flatMapToLong(final @Nullable Object @Nullable ...                           ignored) { return EmptySequentialLongStream.getInstance(); }

    @Override public EmptySequentialFloatStream flatMapToFloat(final @Nullable BooleanFunction<? extends @Nullable FloatStream> mapper) { return EmptySequentialFloatStream.getInstance(); }
              public EmptySequentialFloatStream flatMapToFloat(final @Nullable Supplier<? extends @Nullable FloatStream>        mapper) { return EmptySequentialFloatStream.getInstance(); }
              public EmptySequentialFloatStream flatMapToFloat(final @Nullable Object @Nullable ...                            ignored) { return EmptySequentialFloatStream.getInstance(); }

    @Override public EmptySequentialDoubleStream flatMapToDouble(final @Nullable BooleanFunction<? extends @Nullable DoubleStream> mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream flatMapToDouble(final @Nullable Supplier<? extends @Nullable DoubleStream>        mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream flatMapToDouble(final @Nullable Object @Nullable ...                             ignored) { return EmptySequentialDoubleStream.getInstance(); }

    //#endregion -------------------- Flat map --------------------
    //#region -------------------- Map multi --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialBooleanStream mapMulti(final @Nullable BooleanObjConsumer<? super BooleanConsumer> mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialBooleanStream mapMulti(final @Nullable BooleanConsumer                             mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialBooleanStream mapMulti(final @Nullable Runnable                                    mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialBooleanStream mapMulti(final @Nullable Object @Nullable ...                       ignored) { return this; }

    @Override public <U> EmptySequentialStream<U> mapMultiToObj(final @Nullable BooleanObjConsumer<? super @Nullable Consumer<U>> mapper) { return EmptySequentialStream.getInstance(); }
              public <U> EmptySequentialStream<U> mapMultiToObj(final @Nullable BooleanConsumer                                   mapper) { return EmptySequentialStream.getInstance(); }
              public <U> EmptySequentialStream<U> mapMultiToObj(final @Nullable Runnable                                          mapper) { return EmptySequentialStream.getInstance(); }
              public <U> EmptySequentialStream<U> mapMultiToObj(final @Nullable Object @Nullable ...                             ignored) { return EmptySequentialStream.getInstance(); }

    @Contract(ALWAYS_THIS_1) public EmptySequentialBooleanStream mapMultiToBoolean(final @Nullable BooleanObjConsumer<? super BooleanConsumer> mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialBooleanStream mapMultiToBoolean(final @Nullable BooleanConsumer                             mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialBooleanStream mapMultiToBoolean(final @Nullable Runnable                                    mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialBooleanStream mapMultiToBoolean(final @Nullable Object @Nullable ...                       ignored) { return this; }

    @Override public EmptySequentialCharStream mapMultiToChar(final @Nullable BooleanObjConsumer<? super @Nullable CharConsumer> mapper) { return EmptySequentialCharStream.getInstance(); }
              public EmptySequentialCharStream mapMultiToChar(final @Nullable BooleanConsumer                                    mapper) { return EmptySequentialCharStream.getInstance(); }
              public EmptySequentialCharStream mapMultiToChar(final @Nullable Runnable                                           mapper) { return EmptySequentialCharStream.getInstance(); }
              public EmptySequentialCharStream mapMultiToChar(final @Nullable Object @Nullable ...                              ignored) { return EmptySequentialCharStream.getInstance(); }

    @Override public EmptySequentialByteStream mapMultiToByte(final @Nullable BooleanObjConsumer<? super @Nullable ByteConsumer> mapper) { return EmptySequentialByteStream.getInstance(); }
              public EmptySequentialByteStream mapMultiToByte(final @Nullable BooleanConsumer                                    mapper) { return EmptySequentialByteStream.getInstance(); }
              public EmptySequentialByteStream mapMultiToByte(final @Nullable Runnable                                           mapper) { return EmptySequentialByteStream.getInstance(); }
              public EmptySequentialByteStream mapMultiToByte(final @Nullable Object @Nullable ...                              ignored) { return EmptySequentialByteStream.getInstance(); }

    @Override public EmptySequentialShortStream mapMultiToShort(final @Nullable BooleanObjConsumer<? super @Nullable ShortConsumer> mapper) { return EmptySequentialShortStream.getInstance(); }
              public EmptySequentialShortStream mapMultiToShort(final @Nullable BooleanConsumer                                     mapper) { return EmptySequentialShortStream.getInstance(); }
              public EmptySequentialShortStream mapMultiToShort(final @Nullable Runnable                                            mapper) { return EmptySequentialShortStream.getInstance(); }
              public EmptySequentialShortStream mapMultiToShort(final @Nullable Object @Nullable ...                               ignored) { return EmptySequentialShortStream.getInstance(); }

    @Override public EmptySequentialIntStream mapMultiToInt(final @Nullable BooleanObjConsumer<? super @Nullable IntConsumer> mapper) { return EmptySequentialIntStream.getInstance(); }
              public EmptySequentialIntStream mapMultiToInt(final @Nullable BooleanConsumer                                   mapper) { return EmptySequentialIntStream.getInstance(); }
              public EmptySequentialIntStream mapMultiToInt(final @Nullable Runnable                                          mapper) { return EmptySequentialIntStream.getInstance(); }
              public EmptySequentialIntStream mapMultiToInt(final @Nullable Object @Nullable ...                             ignored) { return EmptySequentialIntStream.getInstance(); }

    @Override public EmptySequentialLongStream mapMultiToLong(final @Nullable BooleanObjConsumer<? super @Nullable LongConsumer> mapper) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream mapMultiToLong(final @Nullable BooleanConsumer                                    mapper) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream mapMultiToLong(final @Nullable Runnable                                           mapper) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream mapMultiToLong(final @Nullable Object @Nullable ...                              ignored) { return EmptySequentialLongStream.getInstance(); }

    @Override public EmptySequentialFloatStream mapMultiToFloat(final @Nullable BooleanObjConsumer<? super @Nullable FloatConsumer> mapper) { return EmptySequentialFloatStream.getInstance(); }
              public EmptySequentialFloatStream mapMultiToFloat(final @Nullable BooleanConsumer                                     mapper) { return EmptySequentialFloatStream.getInstance(); }
              public EmptySequentialFloatStream mapMultiToFloat(final @Nullable Runnable                                            mapper) { return EmptySequentialFloatStream.getInstance(); }
              public EmptySequentialFloatStream mapMultiToFloat(final @Nullable Object @Nullable ...                               ignored) { return EmptySequentialFloatStream.getInstance(); }

    @Override public EmptySequentialDoubleStream mapMultiToDouble(final @Nullable BooleanObjConsumer<? super @Nullable DoubleConsumer> mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream mapMultiToDouble(final @Nullable BooleanConsumer                                      mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream mapMultiToDouble(final @Nullable Runnable                                             mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream mapMultiToDouble(final @Nullable Object @Nullable ...                                ignored) { return EmptySequentialDoubleStream.getInstance(); }

    //#endregion -------------------- Map multi --------------------
    //#region -------------------- Distinct --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptySequentialBooleanStream distinct(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialBooleanStream distinct(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Distinct --------------------
    //#region -------------------- Sorted --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptySequentialBooleanStream sorted(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialBooleanStream sorted(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Sorted --------------------
    //#region -------------------- Peek --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialBooleanStream peek(final @Nullable BooleanConsumer       action) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialBooleanStream peek(final @Nullable Runnable              action) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialBooleanStream peek(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Peek --------------------
    //#region -------------------- Limit --------------------

    @Contract(ALWAYS_THIS_1)           public EmptySequentialBooleanStream limit(final byte                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialBooleanStream limit(final short                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialBooleanStream limit(final int                                                   maximum) { return this; }
    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialBooleanStream limit(final long                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialBooleanStream limit(final float                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialBooleanStream limit(final double                                                maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialBooleanStream limit(final @Nullable Number                                      maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialBooleanStream limit(final @Nullable AtomicReference<? extends @Nullable Number> maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialBooleanStream limit(final @Nullable Object @Nullable ...                        ignored) { return this; }

    //#endregion -------------------- Limit --------------------
    //#region -------------------- Skip --------------------

    @Contract(ALWAYS_THIS_1)           public EmptySequentialBooleanStream skip(final byte                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialBooleanStream skip(final short                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialBooleanStream skip(final int                                                   maximum) { return this; }
    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialBooleanStream skip(final long                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialBooleanStream skip(final float                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialBooleanStream skip(final double                                                maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialBooleanStream skip(final @Nullable Number                                      maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialBooleanStream skip(final @Nullable AtomicReference<? extends @Nullable Number> maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialBooleanStream skip(final @Nullable Object @Nullable ...                        ignored) { return this; }

    //#endregion -------------------- Skip --------------------
    //#region -------------------- Take while --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialBooleanStream takeWhile(final @Nullable BooleanUnaryOperator predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialBooleanStream takeWhile(final @Nullable BooleanSupplier      predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialBooleanStream takeWhile(final @Nullable Object @Nullable ...   ignored) { return this; }

    //#endregion -------------------- Take while --------------------
    //#region -------------------- Drop while --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialBooleanStream dropWhile(final @Nullable BooleanUnaryOperator predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialBooleanStream dropWhile(final @Nullable BooleanSupplier      predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialBooleanStream dropWhile(final @Nullable Object @Nullable ...   ignored) { return this; }

    //#endregion -------------------- Drop while --------------------
    //#region -------------------- For each --------------------

    @Override public void forEach(final @Nullable BooleanConsumer       action) {}
              public void forEach(final @Nullable Runnable              action) {}
              public void forEach(final @Nullable Object @Nullable ... ignored) {}

    //#endregion -------------------- For each --------------------
    //#region -------------------- For each ordered --------------------

    @Override public void forEachOrdered(final @Nullable BooleanConsumer       action) {}
              public void forEachOrdered(final @Nullable Runnable              action) {}
              public void forEachOrdered(final @Nullable Object @Nullable ... ignored) {}

    //#endregion -------------------- For each ordered --------------------
    //#region -------------------- To array --------------------

                           @Override public                              boolean[] toArray(                                 ) { return BooleanArray(); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> U[]       toArray(final IntFunction<U[]> generator) { return generator.apply(0); }

    //#endregion -------------------- To array --------------------
    //#region -------------------- Reduce --------------------

    @Contract(ALWAYS_1ST_1)           public final boolean reduce(final boolean initial                                                   ) { return initial; }
    @Contract(ALWAYS_1ST_2) @Override public final boolean reduce(final boolean initial, final @Nullable BooleanBinaryOperator accumulator) { return initial; }
    @Contract(ALWAYS_1ST_2)           public final boolean reduce(final boolean initial, final @Nullable BooleanSupplier       accumulator) { return initial; }
    @Contract(ALWAYS_1ST_2)           public final boolean reduce(final boolean initial, final @Nullable Object @Nullable ...      ignored) { return initial; }

    @Override public EmptyOptionalBoolean reduce(final @Nullable BooleanBinaryOperator accumulator) { return EmptyOptionalBoolean.getInstance(); }
              public EmptyOptionalBoolean reduce(final @Nullable BooleanSupplier       accumulator) { return EmptyOptionalBoolean.getInstance(); }
              public EmptyOptionalBoolean reduce(final @Nullable Object @Nullable ...      ignored) { return EmptyOptionalBoolean.getInstance(); }

    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable ObjBooleanFunction<U, U> accumulator, final @Nullable BinaryOperator<U>   combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable ObjBooleanFunction<U, U> accumulator, final @Nullable Supplier<U>         combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable ObjBooleanFunction<U, U> accumulator, final @Nullable Object @Nullable ... ignored) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Function<U, U>           accumulator, final @Nullable BinaryOperator<U>   combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Function<U, U>           accumulator, final @Nullable Supplier<U>         combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Function<U, U>           accumulator, final @Nullable Object @Nullable ... ignored) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Supplier<U>              accumulator, final @Nullable BinaryOperator<U>   combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Supplier<U>              accumulator, final @Nullable Supplier<U>         combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Supplier<U>              accumulator, final @Nullable Object @Nullable ... ignored) { return initial; }

    //#endregion -------------------- Reduce --------------------
    //#region -------------------- Collect --------------------

    @Contract(ALWAYS_NULL_3) @Override public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjBooleanConsumer<R> accumulator, final @Nullable BiConsumer<R, R>    combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjBooleanConsumer<R> accumulator, final @Nullable Consumer<R>         combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjBooleanConsumer<R> accumulator, final @Nullable Runnable            combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjBooleanConsumer<R> accumulator, final @Nullable Object @Nullable ... ignored) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Consumer<R>           accumulator, final @Nullable BiConsumer<R, R>    combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Consumer<R>           accumulator, final @Nullable Consumer<R>         combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Consumer<R>           accumulator, final @Nullable Runnable            combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Consumer<R>           accumulator, final @Nullable Object @Nullable ... ignored) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Runnable              accumulator, final @Nullable BiConsumer<R, R>    combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Runnable              accumulator, final @Nullable Consumer<R>         combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Runnable              accumulator, final @Nullable Runnable            combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Runnable              accumulator, final @Nullable Object @Nullable ... ignored) { return null; }

    @Contract(ALWAYS_NULL_2) public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Object @Nullable ... ignored) { return null; }

    @Contract(ALWAYS_NULL_1) public <R extends @Nullable Object> R collect(final @Nullable Object @Nullable ... ignored) { return null; }

    //#endregion -------------------- Collect --------------------
    //#region -------------------- Count --------------------

    @Contract(pure = true) @Override public @Range(from = 0, to = 0) long count(                                            ) { return 0; }
    @Contract(pure = true)           public @Range(from = 0, to = 0) long count(final @Nullable Object @Nullable ... ignored) { return 0; }

    //#endregion -------------------- Count --------------------
    //#region -------------------- Summary statistics --------------------

    @Override public BooleanSummaryStatistics summaryStatistics(                                            ) { return new BooleanSummaryStatistics(); }
              public BooleanSummaryStatistics summaryStatistics(final @Nullable Object @Nullable ... ignored) { return new BooleanSummaryStatistics(); }

    //#endregion -------------------- Summary statistics --------------------
    //#region -------------------- All match --------------------

    @Contract(ALWAYS_TRUE_1) @Override public boolean allMatch(final @Nullable BooleanUnaryOperator predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean allMatch(final @Nullable BooleanSupplier      predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean allMatch(final @Nullable Object @Nullable ...   ignored) { return true; }

    //#endregion -------------------- All match --------------------
    //#region -------------------- Any match --------------------

    @Contract(ALWAYS_FALSE_0)           public boolean anyMatch(                                              ) { return false; }
    @Contract(ALWAYS_FALSE_1) @Override public boolean anyMatch(final @Nullable BooleanUnaryOperator predicate) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean anyMatch(final @Nullable BooleanSupplier      predicate) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean anyMatch(final @Nullable Object @Nullable ...   ignored) { return false; }

    //#endregion -------------------- Any match --------------------
    //#region -------------------- None match --------------------

    @Contract(ALWAYS_TRUE_0)           public boolean noneMatch(                                              ) { return true; }
    @Contract(ALWAYS_TRUE_1) @Override public boolean noneMatch(final @Nullable BooleanUnaryOperator predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean noneMatch(final @Nullable BooleanSupplier      predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean noneMatch(final @Nullable Object @Nullable ...   ignored) { return true; }

    //#endregion -------------------- None match --------------------
    //#region -------------------- Find first --------------------

    @Override public EmptyOptionalBoolean findFirst(                                            ) { return EmptyOptionalBoolean.getInstance(); }
              public EmptyOptionalBoolean findFirst(final @Nullable Object @Nullable ... ignored) { return EmptyOptionalBoolean.getInstance(); }

    //#endregion -------------------- Find first --------------------
    //#region -------------------- Find any --------------------

    @Override public EmptyOptionalBoolean findAny(                                            ) { return EmptyOptionalBoolean.getInstance(); }
              public EmptyOptionalBoolean findAny(final @Nullable Object @Nullable ... ignored) { return EmptyOptionalBoolean.getInstance(); }

    //#endregion -------------------- Find any --------------------
    //#region -------------------- As stream --------------------

    public <U> EmptySequentialStream<U> asStream(                                            ) { return EmptySequentialStream.getInstance(); }
    public <U> EmptySequentialStream<U> asStream(final @Nullable Object @Nullable ... ignored) { return EmptySequentialStream.getInstance(); }

    @Contract(ALWAYS_THIS_0) public EmptySequentialBooleanStream asBooleanStream(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialBooleanStream asBooleanStream(final @Nullable Object @Nullable ... ignored) { return this; }

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
    //#region -------------------- Boxed --------------------

    @Override public EmptySequentialStream<Boolean> boxed(                                            ) { return EmptySequentialStream.getInstance(); }
              public EmptySequentialStream<Boolean> boxed(final @Nullable Object @Nullable ... ignored) { return EmptySequentialStream.getInstance(); }

    //#endregion -------------------- Boxed --------------------
    //#region -------------------- Java methods --------------------

    @Override public EmptyBooleanIterator    iterator(   ) { return EmptyBooleanIterator.getInstance(); }
    @Override public EmptyBooleanSpliterator spliterator() { return EmptyBooleanSpliterator.getInstance(); }

    //#endregion -------------------- Java methods --------------------
    //#region -------------------- Close methods --------------------

    @Override public void close() {}
    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialBooleanStream onClose(final @Nullable Runnable handler) { return this; }

    //#endregion -------------------- Close methods --------------------

    //#endregion -------------------- Methods --------------------

}

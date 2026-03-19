package joookiwi.collection.java.stream;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Supplier;
import joookiwi.collection.java.annotation.Singleton;
import joookiwi.collection.java.callback.additional.BooleanConsumer;
import joookiwi.collection.java.callback.additional.ByteConsumer;
import joookiwi.collection.java.callback.additional.CharConsumer;
import joookiwi.collection.java.callback.additional.FloatBinaryOperator;
import joookiwi.collection.java.callback.additional.FloatConsumer;
import joookiwi.collection.java.callback.additional.FloatFunction;
import joookiwi.collection.java.callback.additional.FloatObjConsumer;
import joookiwi.collection.java.callback.additional.FloatPredicate;
import joookiwi.collection.java.callback.additional.FloatSupplier;
import joookiwi.collection.java.callback.additional.FloatToBooleanFunction;
import joookiwi.collection.java.callback.additional.FloatToByteFunction;
import joookiwi.collection.java.callback.additional.FloatToCharFunction;
import joookiwi.collection.java.callback.additional.FloatToDoubleFunction;
import joookiwi.collection.java.callback.additional.FloatToIntFunction;
import joookiwi.collection.java.callback.additional.FloatToLongFunction;
import joookiwi.collection.java.callback.additional.FloatToShortFunction;
import joookiwi.collection.java.callback.additional.FloatUnaryOperator;
import joookiwi.collection.java.callback.additional.ObjFloatConsumer;
import joookiwi.collection.java.callback.additional.ObjFloatFunction;
import joookiwi.collection.java.callback.additional.ShortConsumer;
import joookiwi.collection.java.extended.iterator.EmptyFloatIterator;
import joookiwi.collection.java.extended.iterator.EmptyFloatSpliterator;
import joookiwi.collection.java.optional.OptionalFloat;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CollectionCreator.emptyOptionalFloat;
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
import static joookiwi.collection.java.method.ArrayCreator.FloatArray;

/// A sequential [FloatStream] with nothing (as a [singleton][Singleton] instance)
///
/// @see EmptySequentialStream
/// @see EmptySequentialBooleanStream
/// @see EmptySequentialCharStream
/// @see EmptySequentialByteStream
/// @see EmptySequentialShortStream
/// @see EmptySequentialIntStream
/// @see EmptySequentialLongStream
/// @see EmptyParallelFloatStream
/// @see EmptySequentialDoubleStream
@Singleton
@NotNullByDefault
public class EmptySequentialFloatStream
        implements FloatStream {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptySequentialFloatStream instance;

    protected EmptySequentialFloatStream() { super(); }

    public static EmptySequentialFloatStream getInstance() {
        final var instance = EmptySequentialFloatStream.instance;
        if (instance != null)
            return instance;
        synchronized (EmptySequentialFloatStream.class) {
            final var instance2 = EmptySequentialFloatStream.instance;
            if (instance2 != null)
                return instance2;
            return (EmptySequentialFloatStream.instance = new EmptySequentialFloatStream());
        }
    }

    //#endregion -------------------- Singleton usage --------------------

    //#region -------------------- Methods --------------------

    //#region -------------------- Is parallel --------------------

    @Contract(ALWAYS_FALSE_0) @Override public boolean isParallel(                                            ) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean isParallel(final @Nullable Object @Nullable ... ignored) { return false; }

    //#endregion -------------------- Is parallel --------------------
    //#region -------------------- Sequential --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptySequentialFloatStream sequential(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialFloatStream sequential(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Sequential --------------------
    //#region -------------------- Parallel --------------------

    @Override public EmptyParallelFloatStream parallel(                                            ) { return EmptyParallelFloatStream.getInstance(); }
              public EmptyParallelFloatStream parallel(final @Nullable Object @Nullable ... ignored) { return EmptyParallelFloatStream.getInstance(); }

    //#endregion -------------------- Parallel --------------------
    //#region -------------------- Unordered --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptySequentialFloatStream unordered(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialFloatStream unordered(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Unordered --------------------
    //#region -------------------- Filter --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialFloatStream filter(final @Nullable FloatPredicate       predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialFloatStream filter(final @Nullable BooleanSupplier      predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialFloatStream filter(final @Nullable Object @Nullable ...   ignored) { return this; }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Map --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialFloatStream map(final @Nullable FloatUnaryOperator    mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialFloatStream map(final @Nullable FloatSupplier         mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialFloatStream map(final @Nullable Object @Nullable ... ignored) { return this; }

    @Override public <U> EmptySequentialStream<U> mapToObj(final @Nullable FloatFunction<? extends U> mapper) { return EmptySequentialStream.getInstance(); }
              public <U> EmptySequentialStream<U> mapToObj(final @Nullable Supplier<? extends U>      mapper) { return EmptySequentialStream.getInstance(); }
              public <U> EmptySequentialStream<U> mapToObj(final @Nullable Object @Nullable ...      ignored) { return EmptySequentialStream.getInstance(); }

    @Override public EmptySequentialBooleanStream mapToBoolean(final @Nullable FloatToBooleanFunction mapper) { return EmptySequentialBooleanStream.getInstance(); }
              public EmptySequentialBooleanStream mapToBoolean(final @Nullable FloatSupplier          mapper) { return EmptySequentialBooleanStream.getInstance(); }
              public EmptySequentialBooleanStream mapToBoolean(final @Nullable Object @Nullable ...  ignored) { return EmptySequentialBooleanStream.getInstance(); }

    @Override public EmptySequentialCharStream mapToChar(final @Nullable FloatToCharFunction   mapper) { return EmptySequentialCharStream.getInstance(); }
              public EmptySequentialCharStream mapToChar(final @Nullable FloatSupplier         mapper) { return EmptySequentialCharStream.getInstance(); }
              public EmptySequentialCharStream mapToChar(final @Nullable Object @Nullable ... ignored) { return EmptySequentialCharStream.getInstance(); }

    @Override public EmptySequentialByteStream mapToByte(final @Nullable FloatToByteFunction   mapper) { return EmptySequentialByteStream.getInstance(); }
              public EmptySequentialByteStream mapToByte(final @Nullable FloatSupplier         mapper) { return EmptySequentialByteStream.getInstance(); }
              public EmptySequentialByteStream mapToByte(final @Nullable Object @Nullable ... ignored) { return EmptySequentialByteStream.getInstance(); }

    @Override public EmptySequentialShortStream mapToShort(final @Nullable FloatToShortFunction  mapper) { return EmptySequentialShortStream.getInstance(); }
              public EmptySequentialShortStream mapToShort(final @Nullable FloatSupplier         mapper) { return EmptySequentialShortStream.getInstance(); }
              public EmptySequentialShortStream mapToShort(final @Nullable Object @Nullable ... ignored) { return EmptySequentialShortStream.getInstance(); }

    @Override public EmptySequentialIntStream mapToInt(final @Nullable FloatToIntFunction    mapper) { return EmptySequentialIntStream.getInstance(); }
              public EmptySequentialIntStream mapToInt(final @Nullable FloatSupplier         mapper) { return EmptySequentialIntStream.getInstance(); }
              public EmptySequentialIntStream mapToInt(final @Nullable Object @Nullable ... ignored) { return EmptySequentialIntStream.getInstance(); }

    @Override public EmptySequentialLongStream mapToLong(final @Nullable FloatToLongFunction   mapper) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream mapToLong(final @Nullable FloatSupplier         mapper) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream mapToLong(final @Nullable Object @Nullable ... ignored) { return EmptySequentialLongStream.getInstance(); }

    @Contract(ALWAYS_THIS_1) public EmptySequentialFloatStream mapToFloat(final @Nullable FloatUnaryOperator    mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialFloatStream mapToFloat(final @Nullable FloatSupplier         mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialFloatStream mapToFloat(final @Nullable Object @Nullable ... ignored) { return this; }

    @Override public EmptySequentialDoubleStream mapToDouble(final @Nullable FloatToDoubleFunction mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream mapToDouble(final @Nullable FloatSupplier         mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream mapToDouble(final @Nullable Object @Nullable ... ignored) { return EmptySequentialDoubleStream.getInstance(); }

    //#endregion -------------------- Map --------------------
    //#region -------------------- Flat map --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialFloatStream flatMap(final @Nullable FloatFunction<? extends @Nullable FloatStream> mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialFloatStream flatMap(final @Nullable Supplier<? extends @Nullable FloatStream>      mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialFloatStream flatMap(final @Nullable Object @Nullable ...                          ignored) { return this; }

    public <U> EmptySequentialStream<U> flatMapToObj(final @Nullable FloatFunction<? extends @Nullable Stream<? extends U>> mapper) { return EmptySequentialStream.getInstance(); }
    public <U> EmptySequentialStream<U> flatMapToObj(final @Nullable Supplier<? extends @Nullable Stream<? extends U>>      mapper) { return EmptySequentialStream.getInstance(); }
    public <U> EmptySequentialStream<U> flatMapToObj(final @Nullable Object @Nullable ...                                  ignored) { return EmptySequentialStream.getInstance(); }

    public EmptySequentialBooleanStream flatMapToBoolean(final @Nullable FloatFunction<? extends @Nullable BooleanStream> mapper) { return EmptySequentialBooleanStream.getInstance(); }
    public EmptySequentialBooleanStream flatMapToBoolean(final @Nullable Supplier<? extends @Nullable BooleanStream>      mapper) { return EmptySequentialBooleanStream.getInstance(); }
    public EmptySequentialBooleanStream flatMapToBoolean(final @Nullable Object @Nullable ...                            ignored) { return EmptySequentialBooleanStream.getInstance(); }

    public EmptySequentialCharStream flatMapToChar(final @Nullable FloatFunction<? extends @Nullable CharStream> mapper) { return EmptySequentialCharStream.getInstance(); }
    public EmptySequentialCharStream flatMapToChar(final @Nullable Supplier<? extends @Nullable CharStream>      mapper) { return EmptySequentialCharStream.getInstance(); }
    public EmptySequentialCharStream flatMapToChar(final @Nullable Object @Nullable ...                         ignored) { return EmptySequentialCharStream.getInstance(); }

    public EmptySequentialShortStream flatMapToShort(final @Nullable FloatFunction<? extends @Nullable ShortStream> mapper) { return EmptySequentialShortStream.getInstance(); }
    public EmptySequentialShortStream flatMapToShort(final @Nullable Supplier<? extends @Nullable ShortStream>      mapper) { return EmptySequentialShortStream.getInstance(); }
    public EmptySequentialShortStream flatMapToShort(final @Nullable Object @Nullable ...                          ignored) { return EmptySequentialShortStream.getInstance(); }

    public EmptySequentialByteStream flatMapToByte(final @Nullable FloatFunction<? extends @Nullable ByteStream> mapper) { return EmptySequentialByteStream.getInstance(); }
    public EmptySequentialByteStream flatMapToByte(final @Nullable Supplier<? extends @Nullable ByteStream>      mapper) { return EmptySequentialByteStream.getInstance(); }
    public EmptySequentialByteStream flatMapToByte(final @Nullable Object @Nullable ...                         ignored) { return EmptySequentialByteStream.getInstance(); }

    public EmptySequentialIntStream flatMapToInt(final @Nullable FloatFunction<? extends @Nullable IntStream> mapper) { return EmptySequentialIntStream.getInstance(); }
    public EmptySequentialIntStream flatMapToInt(final @Nullable Supplier<? extends @Nullable IntStream>      mapper) { return EmptySequentialIntStream.getInstance(); }
    public EmptySequentialIntStream flatMapToInt(final @Nullable Object @Nullable ...                        ignored) { return EmptySequentialIntStream.getInstance(); }

    public EmptySequentialLongStream flatMapToLong(final @Nullable FloatFunction<? extends @Nullable LongStream> mapper) { return EmptySequentialLongStream.getInstance(); }
    public EmptySequentialLongStream flatMapToLong(final @Nullable Supplier<? extends @Nullable LongStream>      mapper) { return EmptySequentialLongStream.getInstance(); }
    public EmptySequentialLongStream flatMapToLong(final @Nullable Object @Nullable ...                         ignored) { return EmptySequentialLongStream.getInstance(); }

    @Contract(ALWAYS_THIS_1) public EmptySequentialFloatStream flatMapToFloat(final @Nullable FloatFunction<? extends @Nullable FloatStream> mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialFloatStream flatMapToFloat(final @Nullable Supplier<? extends @Nullable FloatStream>      mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialFloatStream flatMapToFloat(final @Nullable Object @Nullable ...                          ignored) { return this; }

    public EmptySequentialDoubleStream flatMapToDouble(final @Nullable FloatFunction<? extends @Nullable DoubleStream> mapper) { return EmptySequentialDoubleStream.getInstance(); }
    public EmptySequentialDoubleStream flatMapToDouble(final @Nullable Supplier<? extends @Nullable DoubleStream>      mapper) { return EmptySequentialDoubleStream.getInstance(); }
    public EmptySequentialDoubleStream flatMapToDouble(final @Nullable Object @Nullable ...                           ignored) { return EmptySequentialDoubleStream.getInstance(); }

    //#endregion -------------------- Flat map --------------------
    //#region -------------------- Map multi --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialFloatStream mapMulti(final @Nullable FloatObjConsumer<? super FloatConsumer> mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialFloatStream mapMulti(final @Nullable FloatConsumer                           mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialFloatStream mapMulti(final @Nullable Runnable                                mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialFloatStream mapMulti(final @Nullable Object @Nullable ...                   ignored) { return this; }

    public <U> EmptySequentialStream<U> mapMultiToObj(final @Nullable FloatObjConsumer<? super @Nullable Consumer<U>> mapper) { return EmptySequentialStream.getInstance(); }
    public <U> EmptySequentialStream<U> mapMultiToObj(final @Nullable FloatConsumer                                   mapper) { return EmptySequentialStream.getInstance(); }
    public <U> EmptySequentialStream<U> mapMultiToObj(final @Nullable Runnable                                        mapper) { return EmptySequentialStream.getInstance(); }
    public <U> EmptySequentialStream<U> mapMultiToObj(final @Nullable Object @Nullable ...                           ignored) { return EmptySequentialStream.getInstance(); }

    public EmptySequentialBooleanStream mapMultiToBoolean(final @Nullable FloatObjConsumer<? super @Nullable BooleanConsumer> mapper) { return EmptySequentialBooleanStream.getInstance(); }
    public EmptySequentialBooleanStream mapMultiToBoolean(final @Nullable FloatConsumer                                       mapper) { return EmptySequentialBooleanStream.getInstance(); }
    public EmptySequentialBooleanStream mapMultiToBoolean(final @Nullable Runnable                                            mapper) { return EmptySequentialBooleanStream.getInstance(); }
    public EmptySequentialBooleanStream mapMultiToBoolean(final @Nullable Object @Nullable ...                               ignored) { return EmptySequentialBooleanStream.getInstance(); }

    public EmptySequentialCharStream mapMultiToChar(final @Nullable FloatObjConsumer<? super @Nullable CharConsumer> mapper) { return EmptySequentialCharStream.getInstance(); }
    public EmptySequentialCharStream mapMultiToChar(final @Nullable FloatConsumer                                    mapper) { return EmptySequentialCharStream.getInstance(); }
    public EmptySequentialCharStream mapMultiToChar(final @Nullable Runnable                                         mapper) { return EmptySequentialCharStream.getInstance(); }
    public EmptySequentialCharStream mapMultiToChar(final @Nullable Object @Nullable ...                            ignored) { return EmptySequentialCharStream.getInstance(); }

    public EmptySequentialByteStream mapMultiToByte(final @Nullable FloatObjConsumer<? super @Nullable ByteConsumer> mapper) { return EmptySequentialByteStream.getInstance(); }
    public EmptySequentialByteStream mapMultiToByte(final @Nullable FloatConsumer                                    mapper) { return EmptySequentialByteStream.getInstance(); }
    public EmptySequentialByteStream mapMultiToByte(final @Nullable Runnable                                         mapper) { return EmptySequentialByteStream.getInstance(); }
    public EmptySequentialByteStream mapMultiToByte(final @Nullable Object @Nullable ...                            ignored) { return EmptySequentialByteStream.getInstance(); }

    public EmptySequentialShortStream mapMultiToShort(final @Nullable FloatObjConsumer<? super @Nullable ShortConsumer> mapper) { return EmptySequentialShortStream.getInstance(); }
    public EmptySequentialShortStream mapMultiToShort(final @Nullable FloatConsumer                                     mapper) { return EmptySequentialShortStream.getInstance(); }
    public EmptySequentialShortStream mapMultiToShort(final @Nullable Runnable                                          mapper) { return EmptySequentialShortStream.getInstance(); }
    public EmptySequentialShortStream mapMultiToShort(final @Nullable Object @Nullable ...                             ignored) { return EmptySequentialShortStream.getInstance(); }

    public EmptySequentialIntStream mapMultiToInt(final @Nullable FloatObjConsumer<? super @Nullable IntConsumer> mapper) { return EmptySequentialIntStream.getInstance(); }
    public EmptySequentialIntStream mapMultiToInt(final @Nullable FloatConsumer                                   mapper) { return EmptySequentialIntStream.getInstance(); }
    public EmptySequentialIntStream mapMultiToInt(final @Nullable Runnable                                        mapper) { return EmptySequentialIntStream.getInstance(); }
    public EmptySequentialIntStream mapMultiToInt(final @Nullable Object @Nullable ...                           ignored) { return EmptySequentialIntStream.getInstance(); }

    public EmptySequentialLongStream mapMultiToLong(final @Nullable FloatObjConsumer<? super @Nullable LongConsumer> mapper) { return EmptySequentialLongStream.getInstance(); }
    public EmptySequentialLongStream mapMultiToLong(final @Nullable FloatConsumer                                    mapper) { return EmptySequentialLongStream.getInstance(); }
    public EmptySequentialLongStream mapMultiToLong(final @Nullable Runnable                                         mapper) { return EmptySequentialLongStream.getInstance(); }
    public EmptySequentialLongStream mapMultiToLong(final @Nullable Object @Nullable ...                            ignored) { return EmptySequentialLongStream.getInstance(); }

    @Contract(ALWAYS_THIS_1) public EmptySequentialFloatStream mapMultiToFloat(final @Nullable FloatObjConsumer<? super FloatConsumer> mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialFloatStream mapMultiToFloat(final @Nullable FloatConsumer                           mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialFloatStream mapMultiToFloat(final @Nullable Runnable                                mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialFloatStream mapMultiToFloat(final @Nullable Object @Nullable ...                   ignored) { return this; }

    public EmptySequentialDoubleStream mapMultiToDouble(final @Nullable FloatObjConsumer<? super @Nullable DoubleConsumer> mapper) { return EmptySequentialDoubleStream.getInstance(); }
    public EmptySequentialDoubleStream mapMultiToDouble(final @Nullable FloatConsumer                                      mapper) { return EmptySequentialDoubleStream.getInstance(); }
    public EmptySequentialDoubleStream mapMultiToDouble(final @Nullable Runnable                                           mapper) { return EmptySequentialDoubleStream.getInstance(); }
    public EmptySequentialDoubleStream mapMultiToDouble(final @Nullable Object @Nullable ...                              ignored) { return EmptySequentialDoubleStream.getInstance(); }

    //#endregion -------------------- Map multi --------------------
    //#region -------------------- Distinct --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptySequentialFloatStream distinct(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialFloatStream distinct(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Distinct --------------------
    //#region -------------------- Sorted --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptySequentialFloatStream sorted(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialFloatStream sorted(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Sorted --------------------
    //#region -------------------- Peek --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialFloatStream peek(final @Nullable FloatConsumer         action) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialFloatStream peek(final @Nullable Runnable              action) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialFloatStream peek(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Peek --------------------
    //#region -------------------- Limit --------------------

    @Contract(ALWAYS_THIS_1)           public EmptySequentialFloatStream limit(final byte                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialFloatStream limit(final short                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialFloatStream limit(final int                                                   maximum) { return this; }
    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialFloatStream limit(final long                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialFloatStream limit(final float                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialFloatStream limit(final double                                                maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialFloatStream limit(final @Nullable Number                                      maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialFloatStream limit(final @Nullable AtomicReference<? extends @Nullable Number> maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialFloatStream limit(final @Nullable Object @Nullable ...                        ignored) { return this; }

    //#endregion -------------------- Limit --------------------
    //#region -------------------- Skip --------------------

    @Contract(ALWAYS_THIS_1)           public EmptySequentialFloatStream skip(final byte                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialFloatStream skip(final short                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialFloatStream skip(final int                                                   maximum) { return this; }
    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialFloatStream skip(final long                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialFloatStream skip(final float                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialFloatStream skip(final double                                                maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialFloatStream skip(final @Nullable Number                                      maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialFloatStream skip(final @Nullable AtomicReference<? extends @Nullable Number> maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialFloatStream skip(final @Nullable Object @Nullable ...                        ignored) { return this; }

    //#endregion -------------------- Skip --------------------
    //#region -------------------- Take while --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialFloatStream takeWhile(final @Nullable FloatPredicate     predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialFloatStream takeWhile(final @Nullable BooleanSupplier    predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialFloatStream takeWhile(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Take while --------------------
    //#region -------------------- Drop while --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialFloatStream dropWhile(final @Nullable FloatPredicate     predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialFloatStream dropWhile(final @Nullable BooleanSupplier    predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialFloatStream dropWhile(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Drop while --------------------
    //#region -------------------- For each --------------------

    @Override public void forEach(final @Nullable FloatConsumer         action) {}
              public void forEach(final @Nullable Runnable              action) {}
              public void forEach(final @Nullable Object @Nullable ... ignored) {}

    //#endregion -------------------- For each --------------------
    //#region -------------------- For each ordered --------------------

    @Override public void forEachOrdered(final @Nullable FloatConsumer         action) {}
              public void forEachOrdered(final @Nullable Runnable              action) {}
              public void forEachOrdered(final @Nullable Object @Nullable ... ignored) {}

    //#endregion -------------------- For each ordered --------------------
    //#region -------------------- To array --------------------

                           @Override public                              float[] toArray(                                ) { return FloatArray(); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> U[]     toArray(final IntFunction<U[]> generator) { return generator.apply(0); }

    //#endregion -------------------- To array --------------------
    //#region -------------------- Reduce --------------------

    @Contract(ALWAYS_1ST_1)           public final float reduce(final float initial                                                 ) { return initial; }
    @Contract(ALWAYS_1ST_2) @Override public final float reduce(final float initial, final @Nullable FloatBinaryOperator accumulator) { return initial; }
    @Contract(ALWAYS_1ST_2)           public final float reduce(final float initial, final @Nullable FloatSupplier       accumulator) { return initial; }
    @Contract(ALWAYS_1ST_2)           public final float reduce(final float initial, final @Nullable Object @Nullable ...    ignored) { return initial; }

    @Override public OptionalFloat reduce(final @Nullable FloatBinaryOperator accumulator) { return emptyOptionalFloat(); }
              public OptionalFloat reduce(final @Nullable FloatSupplier       accumulator) { return emptyOptionalFloat(); }
              public OptionalFloat reduce(final @Nullable Object @Nullable ...    ignored) { return emptyOptionalFloat(); }

    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable ObjFloatFunction<U, U> accumulator, final @Nullable BinaryOperator<U>   combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable ObjFloatFunction<U, U> accumulator, final @Nullable Supplier<U>         combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable ObjFloatFunction<U, U> accumulator, final @Nullable Object @Nullable ... ignored) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Function<U, U>         accumulator, final @Nullable BinaryOperator<U>   combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Function<U, U>         accumulator, final @Nullable Supplier<U>         combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Function<U, U>         accumulator, final @Nullable Object @Nullable ... ignored) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Supplier<U>            accumulator, final @Nullable BinaryOperator<U>   combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Supplier<U>            accumulator, final @Nullable Supplier<U>         combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Supplier<U>            accumulator, final @Nullable Object @Nullable ... ignored) { return initial; }

    //#endregion -------------------- Reduce --------------------
    //#region -------------------- Collect --------------------

    @Contract(ALWAYS_NULL_3) @Override public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjFloatConsumer<R> accumulator, final @Nullable BiConsumer<R, R>    combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjFloatConsumer<R> accumulator, final @Nullable Consumer<R>         combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjFloatConsumer<R> accumulator, final @Nullable Runnable            combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjFloatConsumer<R> accumulator, final @Nullable Object @Nullable ... ignored) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Consumer<R>         accumulator, final @Nullable BiConsumer<R, R>    combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Consumer<R>         accumulator, final @Nullable Consumer<R>         combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Consumer<R>         accumulator, final @Nullable Runnable            combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Consumer<R>         accumulator, final @Nullable Object @Nullable ... ignored) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Runnable            accumulator, final @Nullable BiConsumer<R, R>    combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Runnable            accumulator, final @Nullable Consumer<R>         combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Runnable            accumulator, final @Nullable Runnable            combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Runnable            accumulator, final @Nullable Object @Nullable ... ignored) { return null; }

    @Contract(ALWAYS_NULL_2) public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable Object @Nullable ... ignored) { return null; }

    @Contract(ALWAYS_NULL_1) public <R extends @Nullable Object> R collect(final @Nullable Object @Nullable ... ignored) { return null; }

    //#endregion -------------------- Collect --------------------
    //#region -------------------- Sum --------------------

    @Override public @Range(from = 0, to = 0) float sum(                                            ) { return 0; }
              public @Range(from = 0, to = 0) float sum(final @Nullable Object @Nullable ... ignored) { return 0; }

    //#endregion -------------------- Sum --------------------
    //#region -------------------- Min --------------------

    @Override public OptionalFloat min(                                            ) { return emptyOptionalFloat(); }
              public OptionalFloat min(final @Nullable Object @Nullable ... ignored) { return emptyOptionalFloat(); }

    //#endregion -------------------- Min --------------------
    //#region -------------------- Max --------------------

    @Override public OptionalFloat max(                                            ) { return emptyOptionalFloat(); }
              public OptionalFloat max(final @Nullable Object @Nullable ... ignored) { return emptyOptionalFloat(); }

    //#endregion -------------------- Max --------------------
    //#region -------------------- Count --------------------

    @Contract(pure = true) @Override public @Range(from = 0, to = 0) long count(                                            ) { return 0; }
    @Contract(pure = true)           public @Range(from = 0, to = 0) long count(final @Nullable Object @Nullable ... ignored) { return 0; }

    //#endregion -------------------- Count --------------------
    //#region -------------------- Average --------------------

    @Override public OptionalFloat average(                                            ) { return emptyOptionalFloat(); }
              public OptionalFloat average(final @Nullable Object @Nullable ... ignored) { return emptyOptionalFloat(); }

    //#endregion -------------------- Average --------------------
    //#region -------------------- Summary statistics --------------------

    @Override public FloatSummaryStatistics summaryStatistics(                                            ) { return new FloatSummaryStatistics(); }
              public FloatSummaryStatistics summaryStatistics(final @Nullable Object @Nullable ... ignored) { return new FloatSummaryStatistics(); }

    //#endregion -------------------- Summary statistics --------------------
    //#region -------------------- All match --------------------

    @Contract(ALWAYS_TRUE_1) @Override public boolean allMatch(final @Nullable FloatPredicate     predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean allMatch(final @Nullable BooleanSupplier    predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean allMatch(final @Nullable Object @Nullable ... ignored) { return true; }

    //#endregion -------------------- All match --------------------
    //#region -------------------- Any match --------------------

    @Contract(ALWAYS_FALSE_0)           public boolean anyMatch(                                            ) { return false; }
    @Contract(ALWAYS_FALSE_1) @Override public boolean anyMatch(final @Nullable FloatPredicate     predicate) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean anyMatch(final @Nullable BooleanSupplier    predicate) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean anyMatch(final @Nullable Object @Nullable ... ignored) { return false; }

    //#endregion -------------------- Any match --------------------
    //#region -------------------- None match --------------------

    @Contract(ALWAYS_TRUE_0)           public boolean noneMatch(                                            ) { return true; }
    @Contract(ALWAYS_TRUE_1) @Override public boolean noneMatch(final @Nullable FloatPredicate     predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean noneMatch(final @Nullable BooleanSupplier    predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean noneMatch(final @Nullable Object @Nullable ... ignored) { return true; }

    //#endregion -------------------- None match --------------------
    //#region -------------------- Find first --------------------

    @Override public OptionalFloat findFirst(                                            ) { return emptyOptionalFloat(); }
              public OptionalFloat findFirst(final @Nullable Object @Nullable ... ignored) { return emptyOptionalFloat(); }

    //#endregion -------------------- Find first --------------------
    //#region -------------------- Find any --------------------

    @Override public OptionalFloat findAny(                                            ) { return emptyOptionalFloat(); }
              public OptionalFloat findAny(final @Nullable Object @Nullable ... ignored) { return emptyOptionalFloat(); }

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

    public EmptySequentialIntStream asIntStream(                                            ) { return EmptySequentialIntStream.getInstance(); }
    public EmptySequentialIntStream asIntStream(final @Nullable Object @Nullable ... ignored) { return EmptySequentialIntStream.getInstance(); }

    public EmptySequentialLongStream asLongStream(                                            ) { return EmptySequentialLongStream.getInstance(); }
    public EmptySequentialLongStream asLongStream(final @Nullable Object @Nullable ... ignored) { return EmptySequentialLongStream.getInstance(); }

    @Contract(ALWAYS_THIS_0) public EmptySequentialFloatStream asFloatStream(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialFloatStream asFloatStream(final @Nullable Object @Nullable ... ignored) { return this; }

    public EmptySequentialDoubleStream asDoubleStream(                                            ) { return EmptySequentialDoubleStream.getInstance(); }
    public EmptySequentialDoubleStream asDoubleStream(final @Nullable Object @Nullable ... ignored) { return EmptySequentialDoubleStream.getInstance(); }

    //#endregion -------------------- As stream --------------------
    //#region -------------------- Boxed --------------------

    @Override public EmptySequentialStream<Float> boxed(                                            ) { return EmptySequentialStream.getInstance(); }
              public EmptySequentialStream<Float> boxed(final @Nullable Object @Nullable ... ignored) { return EmptySequentialStream.getInstance(); }

    //#endregion -------------------- Boxed --------------------
    //#region -------------------- Java methods --------------------

    @Override public EmptyFloatIterator iterator() { return EmptyFloatIterator.getInstance(); }
    @Override public EmptyFloatSpliterator spliterator() { return EmptyFloatSpliterator.getInstance(); }

    //#endregion -------------------- Java methods --------------------
    //#region -------------------- Close methods --------------------

    @Override public void close() {}
    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialFloatStream onClose(final @Nullable Runnable handler) { return this; }

    //#endregion -------------------- Close methods --------------------

    //#endregion -------------------- Methods --------------------

}

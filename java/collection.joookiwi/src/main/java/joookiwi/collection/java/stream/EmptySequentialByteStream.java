package joookiwi.collection.java.stream;

import java.util.OptionalDouble;
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
import joookiwi.collection.java.callback.additional.BooleanConsumer;
import joookiwi.collection.java.callback.additional.ByteBinaryOperator;
import joookiwi.collection.java.callback.additional.ByteConsumer;
import joookiwi.collection.java.callback.additional.ByteFunction;
import joookiwi.collection.java.callback.additional.ByteObjConsumer;
import joookiwi.collection.java.callback.additional.BytePredicate;
import joookiwi.collection.java.callback.additional.ByteSupplier;
import joookiwi.collection.java.callback.additional.ByteToBooleanFunction;
import joookiwi.collection.java.callback.additional.ByteToCharFunction;
import joookiwi.collection.java.callback.additional.ByteToDoubleFunction;
import joookiwi.collection.java.callback.additional.ByteToFloatFunction;
import joookiwi.collection.java.callback.additional.ByteToIntFunction;
import joookiwi.collection.java.callback.additional.ByteToLongFunction;
import joookiwi.collection.java.callback.additional.ByteToShortFunction;
import joookiwi.collection.java.callback.additional.ByteUnaryOperator;
import joookiwi.collection.java.callback.additional.CharConsumer;
import joookiwi.collection.java.callback.additional.CharSupplier;
import joookiwi.collection.java.callback.additional.FloatConsumer;
import joookiwi.collection.java.callback.additional.FloatSupplier;
import joookiwi.collection.java.callback.additional.ObjByteConsumer;
import joookiwi.collection.java.callback.additional.ObjByteFunction;
import joookiwi.collection.java.callback.additional.ShortConsumer;
import joookiwi.collection.java.callback.additional.ShortSupplier;
import joookiwi.collection.java.extended.iterator.ByteSpliterator;
import joookiwi.collection.java.extended.iterator.EmptyByteIterator;
import joookiwi.collection.java.optional.OptionalByte;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CollectionConstants.emptyByteSpliterator;
import static joookiwi.collection.java.CollectionCreator.emptyOptionalByte;
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
import static joookiwi.collection.java.method.ArrayCreator.ByteArray;

/// A sequential [ByteStream] with nothing (as a [singleton][Singleton] instance)
///
/// @see EmptySequentialStream
/// @see EmptySequentialBooleanStream
/// @see EmptySequentialCharStream
/// @see EmptyParallelByteStream
/// @see EmptySequentialShortStream
/// @see EmptySequentialIntStream
/// @see EmptySequentialLongStream
/// @see EmptySequentialFloatStream
/// @see EmptySequentialDoubleStream
@Singleton
@NotNullByDefault
public class EmptySequentialByteStream
        implements ByteStream {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptySequentialByteStream instance;

    protected EmptySequentialByteStream() { super(); }

    public static EmptySequentialByteStream getInstance() {
        final var instance = EmptySequentialByteStream.instance;
        if (instance != null)
            return instance;
        synchronized (EmptySequentialByteStream.class) {
            final var instance2 = EmptySequentialByteStream.instance;
            if (instance2 != null)
                return instance2;
            return (EmptySequentialByteStream.instance = new EmptySequentialByteStream());
        }
    }

    //#endregion -------------------- Singleton usage --------------------

    //#region -------------------- Methods --------------------

    //#region -------------------- Is parallel --------------------

    @Contract(ALWAYS_FALSE_0) @Override public boolean isParallel(                                            ) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean isParallel(final @Nullable Object @Nullable ... ignored) { return false; }

    //#endregion -------------------- Is parallel --------------------
    //#region -------------------- Sequential --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptySequentialByteStream sequential(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialByteStream sequential(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Sequential --------------------
    //#region -------------------- Parallel --------------------

    @Override public EmptyParallelByteStream parallel(                                            ) { return EmptyParallelByteStream.getInstance(); }
              public EmptyParallelByteStream parallel(final @Nullable Object @Nullable ... ignored) { return EmptyParallelByteStream.getInstance(); }

    //#endregion -------------------- Parallel --------------------
    //#region -------------------- Unordered --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptySequentialByteStream unordered(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialByteStream unordered(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Unordered --------------------
    //#region -------------------- Filter --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialByteStream filter(final @Nullable BytePredicate       predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialByteStream filter(final @Nullable BooleanSupplier     predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialByteStream filter(final @Nullable Object @Nullable ...  ignored) { return this; }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Map --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialByteStream map(final @Nullable ByteUnaryOperator     mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialByteStream map(final @Nullable ByteSupplier          mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialByteStream map(final @Nullable Object @Nullable ... ignored) { return this; }

    @Override public <U> EmptySequentialStream<U> mapToObj(final @Nullable ByteFunction<? extends U> mapper) { return EmptySequentialStream.getInstance(); }
              public <U> EmptySequentialStream<U> mapToObj(final @Nullable Supplier<? extends U>     mapper) { return EmptySequentialStream.getInstance(); }
              public <U> EmptySequentialStream<U> mapToObj(final @Nullable Object @Nullable ...     ignored) { return EmptySequentialStream.getInstance(); }

    @Override public EmptySequentialBooleanStream mapToBoolean(final @Nullable ByteToBooleanFunction  mapper) { return EmptySequentialBooleanStream.getInstance(); }
              public EmptySequentialBooleanStream mapToBoolean(final @Nullable BooleanSupplier        mapper) { return EmptySequentialBooleanStream.getInstance(); }
              public EmptySequentialBooleanStream mapToBoolean(final @Nullable Object @Nullable ...  ignored) { return EmptySequentialBooleanStream.getInstance(); }

    @Override public EmptySequentialCharStream mapToChar(final @Nullable ByteToCharFunction    mapper) { return EmptySequentialCharStream.getInstance(); }
              public EmptySequentialCharStream mapToChar(final @Nullable CharSupplier          mapper) { return EmptySequentialCharStream.getInstance(); }
              public EmptySequentialCharStream mapToChar(final @Nullable Object @Nullable ... ignored) { return EmptySequentialCharStream.getInstance(); }

    @Contract(ALWAYS_THIS_1) public EmptySequentialByteStream mapToByte(final @Nullable ByteUnaryOperator     mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialByteStream mapToByte(final @Nullable ByteSupplier          mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialByteStream mapToByte(final @Nullable Object @Nullable ... ignored) { return this; }

    @Override public EmptySequentialShortStream mapToShort(final @Nullable ByteToShortFunction   mapper) { return EmptySequentialShortStream.getInstance(); }
              public EmptySequentialShortStream mapToShort(final @Nullable ShortSupplier         mapper) { return EmptySequentialShortStream.getInstance(); }
              public EmptySequentialShortStream mapToShort(final @Nullable Object @Nullable ... ignored) { return EmptySequentialShortStream.getInstance(); }

    @Override public EmptySequentialIntStream mapToInt(final @Nullable ByteToIntFunction     mapper) { return EmptySequentialIntStream.getInstance(); }
              public EmptySequentialIntStream mapToInt(final @Nullable IntSupplier           mapper) { return EmptySequentialIntStream.getInstance(); }
              public EmptySequentialIntStream mapToInt(final @Nullable Object @Nullable ... ignored) { return EmptySequentialIntStream.getInstance(); }

    @Override public EmptySequentialLongStream mapToLong(final @Nullable ByteToLongFunction   mapper) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream mapToLong(final @Nullable LongSupplier          mapper) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream mapToLong(final @Nullable Object @Nullable ... ignored) { return EmptySequentialLongStream.getInstance(); }

    @Override public EmptySequentialFloatStream mapToFloat(final @Nullable ByteToFloatFunction   mapper) { return EmptySequentialFloatStream.getInstance(); }
              public EmptySequentialFloatStream mapToFloat(final @Nullable FloatSupplier         mapper) { return EmptySequentialFloatStream.getInstance(); }
              public EmptySequentialFloatStream mapToFloat(final @Nullable Object @Nullable ... ignored) { return EmptySequentialFloatStream.getInstance(); }

    @Override public EmptySequentialDoubleStream mapToDouble(final @Nullable ByteToDoubleFunction  mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream mapToDouble(final @Nullable DoubleSupplier        mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream mapToDouble(final @Nullable Object @Nullable ... ignored) { return EmptySequentialDoubleStream.getInstance(); }

    //#endregion -------------------- Map --------------------
    //#region -------------------- Flat map --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialByteStream flatMap(final @Nullable ByteFunction<? extends @Nullable ByteStream> mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialByteStream flatMap(final @Nullable Supplier<? extends @Nullable ByteStream>     mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialByteStream flatMap(final @Nullable Object @Nullable ...                        ignored) { return this; }

    public <U> EmptySequentialStream<U> flatMapToObj(final @Nullable ByteFunction<? extends @Nullable Stream<? extends U>> mapper) { return EmptySequentialStream.getInstance(); }
    public <U> EmptySequentialStream<U> flatMapToObj(final @Nullable Supplier<? extends @Nullable Stream<? extends U>>     mapper) { return EmptySequentialStream.getInstance(); }
    public <U> EmptySequentialStream<U> flatMapToObj(final @Nullable Object @Nullable ...                                 ignored) { return EmptySequentialStream.getInstance(); }

    public EmptySequentialBooleanStream flatMapToBoolean(final @Nullable ByteFunction<? extends @Nullable BooleanStream> mapper) { return EmptySequentialBooleanStream.getInstance(); }
    public EmptySequentialBooleanStream flatMapToBoolean(final @Nullable Supplier<? extends @Nullable BooleanStream>     mapper) { return EmptySequentialBooleanStream.getInstance(); }
    public EmptySequentialBooleanStream flatMapToBoolean(final @Nullable Object @Nullable ...                           ignored) { return EmptySequentialBooleanStream.getInstance(); }

    public EmptySequentialCharStream flatMapToChar(final @Nullable ByteFunction<? extends @Nullable CharStream> mapper) { return EmptySequentialCharStream.getInstance(); }
    public EmptySequentialCharStream flatMapToChar(final @Nullable Supplier<? extends @Nullable CharStream>     mapper) { return EmptySequentialCharStream.getInstance(); }
    public EmptySequentialCharStream flatMapToChar(final @Nullable Object @Nullable ...                        ignored) { return EmptySequentialCharStream.getInstance(); }

    @Contract(ALWAYS_THIS_1) public EmptySequentialByteStream flatMapToByte(final @Nullable ByteFunction<? extends @Nullable ByteStream> mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialByteStream flatMapToByte(final @Nullable Supplier<? extends @Nullable ByteStream>     mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialByteStream flatMapToByte(final @Nullable Object @Nullable ...                        ignored) { return this; }

    public EmptySequentialShortStream flatMapToShort(final @Nullable ByteFunction<? extends @Nullable ShortStream> mapper) { return EmptySequentialShortStream.getInstance(); }
    public EmptySequentialShortStream flatMapToShort(final @Nullable Supplier<? extends @Nullable ShortStream>     mapper) { return EmptySequentialShortStream.getInstance(); }
    public EmptySequentialShortStream flatMapToShort(final @Nullable Object @Nullable ...                         ignored) { return EmptySequentialShortStream.getInstance(); }

    public EmptySequentialIntStream flatMapToInt(final @Nullable ByteFunction<? extends @Nullable IntStream> mapper) { return EmptySequentialIntStream.getInstance(); }
    public EmptySequentialIntStream flatMapToInt(final @Nullable Supplier<? extends @Nullable IntStream>     mapper) { return EmptySequentialIntStream.getInstance(); }
    public EmptySequentialIntStream flatMapToInt(final @Nullable Object @Nullable ...                       ignored) { return EmptySequentialIntStream.getInstance(); }

    public EmptySequentialLongStream flatMapToLong(final @Nullable ByteFunction<? extends @Nullable LongStream> mapper) { return EmptySequentialLongStream.getInstance(); }
    public EmptySequentialLongStream flatMapToLong(final @Nullable Supplier<? extends @Nullable LongStream>     mapper) { return EmptySequentialLongStream.getInstance(); }
    public EmptySequentialLongStream flatMapToLong(final @Nullable Object @Nullable ...                        ignored) { return EmptySequentialLongStream.getInstance(); }

    public EmptySequentialFloatStream flatMapToFloat(final @Nullable ByteFunction<? extends @Nullable FloatStream> mapper) { return EmptySequentialFloatStream.getInstance(); }
    public EmptySequentialFloatStream flatMapToFloat(final @Nullable Supplier<? extends @Nullable FloatStream>     mapper) { return EmptySequentialFloatStream.getInstance(); }
    public EmptySequentialFloatStream flatMapToFloat(final @Nullable Object @Nullable ...                         ignored) { return EmptySequentialFloatStream.getInstance(); }

    public EmptySequentialDoubleStream flatMapToDouble(final @Nullable ByteFunction<? extends @Nullable DoubleStream> mapper) { return EmptySequentialDoubleStream.getInstance(); }
    public EmptySequentialDoubleStream flatMapToDouble(final @Nullable Supplier<? extends @Nullable DoubleStream>     mapper) { return EmptySequentialDoubleStream.getInstance(); }
    public EmptySequentialDoubleStream flatMapToDouble(final @Nullable Object @Nullable ...                          ignored) { return EmptySequentialDoubleStream.getInstance(); }

    //#endregion -------------------- Flat map --------------------
    //#region -------------------- Map multi --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialByteStream mapMulti(final @Nullable ByteObjConsumer<? super ByteConsumer> mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialByteStream mapMulti(final @Nullable ByteConsumer                          mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialByteStream mapMulti(final @Nullable Runnable                              mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialByteStream mapMulti(final @Nullable Object @Nullable ...                 ignored) { return this; }

    public <U> EmptySequentialStream<U> mapMultiToObj(final @Nullable ByteObjConsumer<? super @Nullable Consumer<U>> mapper) { return EmptySequentialStream.getInstance(); }
    public <U> EmptySequentialStream<U> mapMultiToObj(final @Nullable ByteConsumer                                   mapper) { return EmptySequentialStream.getInstance(); }
    public <U> EmptySequentialStream<U> mapMultiToObj(final @Nullable Runnable                                       mapper) { return EmptySequentialStream.getInstance(); }
    public <U> EmptySequentialStream<U> mapMultiToObj(final @Nullable Object @Nullable ...                          ignored) { return EmptySequentialStream.getInstance(); }

    public EmptySequentialBooleanStream mapMultiToBoolean(final @Nullable ByteObjConsumer<? super @Nullable BooleanConsumer> mapper) { return EmptySequentialBooleanStream.getInstance(); }
    public EmptySequentialBooleanStream mapMultiToBoolean(final @Nullable ByteConsumer                                      mapper) { return EmptySequentialBooleanStream.getInstance(); }
    public EmptySequentialBooleanStream mapMultiToBoolean(final @Nullable Runnable                                           mapper) { return EmptySequentialBooleanStream.getInstance(); }
    public EmptySequentialBooleanStream mapMultiToBoolean(final @Nullable Object @Nullable ...                              ignored) { return EmptySequentialBooleanStream.getInstance(); }

    public EmptySequentialCharStream mapMultiToChar(final @Nullable ByteObjConsumer<? super @Nullable CharConsumer> mapper) { return EmptySequentialCharStream.getInstance(); }
    public EmptySequentialCharStream mapMultiToChar(final @Nullable ByteConsumer                                    mapper) { return EmptySequentialCharStream.getInstance(); }
    public EmptySequentialCharStream mapMultiToChar(final @Nullable Runnable                                        mapper) { return EmptySequentialCharStream.getInstance(); }
    public EmptySequentialCharStream mapMultiToChar(final @Nullable Object @Nullable ...                           ignored) { return EmptySequentialCharStream.getInstance(); }

    @Contract(ALWAYS_THIS_1) public EmptySequentialByteStream mapMultiToByte(final @Nullable ByteObjConsumer<? super ByteConsumer> mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialByteStream mapMultiToByte(final @Nullable ByteConsumer                          mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialByteStream mapMultiToByte(final @Nullable Runnable                              mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialByteStream mapMultiToByte(final @Nullable Object @Nullable ...                 ignored) { return this; }

    public EmptySequentialShortStream mapMultiToShort(final @Nullable ByteObjConsumer<? super @Nullable ShortConsumer> mapper) { return EmptySequentialShortStream.getInstance(); }
    public EmptySequentialShortStream mapMultiToShort(final @Nullable ByteConsumer                                     mapper) { return EmptySequentialShortStream.getInstance(); }
    public EmptySequentialShortStream mapMultiToShort(final @Nullable Runnable                                         mapper) { return EmptySequentialShortStream.getInstance(); }
    public EmptySequentialShortStream mapMultiToShort(final @Nullable Object @Nullable ...                            ignored) { return EmptySequentialShortStream.getInstance(); }

    public EmptySequentialIntStream mapMultiToInt(final @Nullable ByteObjConsumer<? super @Nullable IntConsumer> mapper) { return EmptySequentialIntStream.getInstance(); }
    public EmptySequentialIntStream mapMultiToInt(final @Nullable ByteConsumer                                   mapper) { return EmptySequentialIntStream.getInstance(); }
    public EmptySequentialIntStream mapMultiToInt(final @Nullable Runnable                                       mapper) { return EmptySequentialIntStream.getInstance(); }
    public EmptySequentialIntStream mapMultiToInt(final @Nullable Object @Nullable ...                          ignored) { return EmptySequentialIntStream.getInstance(); }

    public EmptySequentialLongStream mapMultiToLong(final @Nullable ByteObjConsumer<? super @Nullable LongConsumer> mapper) { return EmptySequentialLongStream.getInstance(); }
    public EmptySequentialLongStream mapMultiToLong(final @Nullable ByteConsumer                                    mapper) { return EmptySequentialLongStream.getInstance(); }
    public EmptySequentialLongStream mapMultiToLong(final @Nullable Runnable                                        mapper) { return EmptySequentialLongStream.getInstance(); }
    public EmptySequentialLongStream mapMultiToLong(final @Nullable Object @Nullable ...                           ignored) { return EmptySequentialLongStream.getInstance(); }

    public EmptySequentialFloatStream mapMultiToFloat(final @Nullable ByteObjConsumer<? super @Nullable FloatConsumer> mapper) { return EmptySequentialFloatStream.getInstance(); }
    public EmptySequentialFloatStream mapMultiToFloat(final @Nullable ByteConsumer                                     mapper) { return EmptySequentialFloatStream.getInstance(); }
    public EmptySequentialFloatStream mapMultiToFloat(final @Nullable Runnable                                         mapper) { return EmptySequentialFloatStream.getInstance(); }
    public EmptySequentialFloatStream mapMultiToFloat(final @Nullable Object @Nullable ...                            ignored) { return EmptySequentialFloatStream.getInstance(); }

    public EmptySequentialDoubleStream mapMultiToDouble(final @Nullable ByteObjConsumer<? super @Nullable DoubleConsumer> mapper) { return EmptySequentialDoubleStream.getInstance(); }
    public EmptySequentialDoubleStream mapMultiToDouble(final @Nullable ByteConsumer                                      mapper) { return EmptySequentialDoubleStream.getInstance(); }
    public EmptySequentialDoubleStream mapMultiToDouble(final @Nullable Runnable                                          mapper) { return EmptySequentialDoubleStream.getInstance(); }
    public EmptySequentialDoubleStream mapMultiToDouble(final @Nullable Object @Nullable ...                             ignored) { return EmptySequentialDoubleStream.getInstance(); }

    //#endregion -------------------- Map multi --------------------
    //#region -------------------- Distinct --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptySequentialByteStream distinct(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialByteStream distinct(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Distinct --------------------
    //#region -------------------- Sorted --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptySequentialByteStream sorted(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialByteStream sorted(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Sorted --------------------
    //#region -------------------- Peek --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialByteStream peek(final @Nullable ByteConsumer          action) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialByteStream peek(final @Nullable Runnable              action) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialByteStream peek(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Peek --------------------
    //#region -------------------- Limit --------------------

    @Contract(ALWAYS_THIS_1)           public EmptySequentialByteStream limit(final byte                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialByteStream limit(final short                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialByteStream limit(final int                                                   maximum) { return this; }
    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialByteStream limit(final long                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialByteStream limit(final float                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialByteStream limit(final double                                                maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialByteStream limit(final @Nullable Number                                      maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialByteStream limit(final @Nullable AtomicReference<? extends @Nullable Number> maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialByteStream limit(final @Nullable Object @Nullable ...                        ignored) { return this; }

    //#endregion -------------------- Limit --------------------
    //#region -------------------- Skip --------------------

    @Contract(ALWAYS_THIS_1)           public EmptySequentialByteStream skip(final byte                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialByteStream skip(final short                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialByteStream skip(final int                                                   maximum) { return this; }
    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialByteStream skip(final long                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialByteStream skip(final float                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialByteStream skip(final double                                                maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialByteStream skip(final @Nullable Number                                      maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialByteStream skip(final @Nullable AtomicReference<? extends @Nullable Number> maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialByteStream skip(final @Nullable Object @Nullable ...                        ignored) { return this; }

    //#endregion -------------------- Skip --------------------
    //#region -------------------- Take while --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialByteStream takeWhile(final @Nullable BytePredicate      predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialByteStream takeWhile(final @Nullable BooleanSupplier    predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialByteStream takeWhile(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Take while --------------------
    //#region -------------------- Drop while --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialByteStream dropWhile(final @Nullable BytePredicate      predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialByteStream dropWhile(final @Nullable BooleanSupplier    predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialByteStream dropWhile(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Drop while --------------------
    //#region -------------------- For each --------------------

    @Override public void forEach(final @Nullable ByteConsumer          action) {}
              public void forEach(final @Nullable Runnable              action) {}
              public void forEach(final @Nullable Object @Nullable ... ignored) {}

    //#endregion -------------------- For each --------------------
    //#region -------------------- For each ordered --------------------

    @Override public void forEachOrdered(final @Nullable ByteConsumer          action) {}
              public void forEachOrdered(final @Nullable Runnable              action) {}
              public void forEachOrdered(final @Nullable Object @Nullable ... ignored) {}

    //#endregion -------------------- For each ordered --------------------
    //#region -------------------- To array --------------------

                           @Override public                              byte[] toArray(                                ) { return ByteArray(); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> U[]    toArray(final IntFunction<U[]> generator) { return generator.apply(0); }

    //#endregion -------------------- To array --------------------
    //#region -------------------- Reduce --------------------

    @Contract(ALWAYS_1ST_1)           public final byte reduce(final byte initial                                                ) { return initial; }
    @Contract(ALWAYS_1ST_2) @Override public final byte reduce(final byte initial, final @Nullable ByteBinaryOperator accumulator) { return initial; }
    @Contract(ALWAYS_1ST_2)           public final byte reduce(final byte initial, final @Nullable ByteSupplier       accumulator) { return initial; }
    @Contract(ALWAYS_1ST_2)           public final byte reduce(final byte initial, final @Nullable Object @Nullable ...   ignored) { return initial; }

    @Override public OptionalByte reduce(final @Nullable ByteBinaryOperator accumulator) { return emptyOptionalByte(); }
              public OptionalByte reduce(final @Nullable ByteSupplier       accumulator) { return emptyOptionalByte(); }
              public OptionalByte reduce(final @Nullable Object @Nullable ...   ignored) { return emptyOptionalByte(); }

    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable ObjByteFunction<U, U> accumulator, final @Nullable BinaryOperator<U>   combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable ObjByteFunction<U, U> accumulator, final @Nullable Supplier<U>         combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable ObjByteFunction<U, U> accumulator, final @Nullable Object @Nullable ... ignored) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Function<U, U>        accumulator, final @Nullable BinaryOperator<U>   combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Function<U, U>        accumulator, final @Nullable Supplier<U>         combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Function<U, U>        accumulator, final @Nullable Object @Nullable ... ignored) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Supplier<U>           accumulator, final @Nullable BinaryOperator<U>   combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Supplier<U>           accumulator, final @Nullable Supplier<U>         combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Supplier<U>           accumulator, final @Nullable Object @Nullable ... ignored) { return initial; }

    //#endregion -------------------- Reduce --------------------
    //#region -------------------- Collect --------------------

    @Contract(ALWAYS_NULL_3) @Override public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjByteConsumer<R> accumulator, final @Nullable BiConsumer<R, R>    combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjByteConsumer<R> accumulator, final @Nullable Consumer<R>         combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjByteConsumer<R> accumulator, final @Nullable Runnable            combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjByteConsumer<R> accumulator, final @Nullable Object @Nullable ... ignored) { return null; }
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

    @Override public @Range(from = 0, to = 0) byte sum(                                            ) { return 0; }
              public @Range(from = 0, to = 0) byte sum(final @Nullable Object @Nullable ... ignored) { return 0; }

    //#endregion -------------------- Sum --------------------
    //#region -------------------- Min --------------------

    @Override public OptionalByte min(                                            ) { return emptyOptionalByte(); }
              public OptionalByte min(final @Nullable Object @Nullable ... ignored) { return emptyOptionalByte(); }

    //#endregion -------------------- Min --------------------
    //#region -------------------- Max --------------------

    @Override public OptionalByte max(                                            ) { return emptyOptionalByte(); }
              public OptionalByte max(final @Nullable Object @Nullable ... ignored) { return emptyOptionalByte(); }

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

    @Override public ByteSummaryStatistics summaryStatistics(                                            ) { return new ByteSummaryStatistics(); }
              public ByteSummaryStatistics summaryStatistics(final @Nullable Object @Nullable ... ignored) { return new ByteSummaryStatistics(); }

    //#endregion -------------------- Summary statistics --------------------
    //#region -------------------- All match --------------------

    @Contract(ALWAYS_TRUE_1) @Override public boolean allMatch(final @Nullable BytePredicate      predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean allMatch(final @Nullable BooleanSupplier    predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean allMatch(final @Nullable Object @Nullable ... ignored) { return true; }

    //#endregion -------------------- All match --------------------
    //#region -------------------- Any match --------------------

    @Contract(ALWAYS_FALSE_0)           public boolean anyMatch(                                            ) { return false; }
    @Contract(ALWAYS_FALSE_1) @Override public boolean anyMatch(final @Nullable BytePredicate      predicate) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean anyMatch(final @Nullable BooleanSupplier    predicate) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean anyMatch(final @Nullable Object @Nullable ... ignored) { return false; }

    //#endregion -------------------- Any match --------------------
    //#region -------------------- None match --------------------

    @Contract(ALWAYS_TRUE_0)           public boolean noneMatch(                                            ) { return true; }
    @Contract(ALWAYS_TRUE_1) @Override public boolean noneMatch(final @Nullable BytePredicate      predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean noneMatch(final @Nullable BooleanSupplier    predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean noneMatch(final @Nullable Object @Nullable ... ignored) { return true; }

    //#endregion -------------------- None match --------------------
    //#region -------------------- Find first --------------------

    @Override public OptionalByte findFirst(                                            ) { return emptyOptionalByte(); }
              public OptionalByte findFirst(final @Nullable Object @Nullable ... ignored) { return emptyOptionalByte(); }

    //#endregion -------------------- Find first --------------------
    //#region -------------------- Find any --------------------

    @Override public OptionalByte findAny(                                            ) { return emptyOptionalByte(); }
              public OptionalByte findAny(final @Nullable Object @Nullable ... ignored) { return emptyOptionalByte(); }

    //#endregion -------------------- Find any --------------------
    //#region -------------------- As stream --------------------

    public <U> EmptySequentialStream<U> asStream(                                            ) { return EmptySequentialStream.getInstance(); }
    public <U> EmptySequentialStream<U> asStream(final @Nullable Object @Nullable ... ignored) { return EmptySequentialStream.getInstance(); }

    public EmptySequentialBooleanStream asBooleanStream(                                            ) { return EmptySequentialBooleanStream.getInstance(); }
    public EmptySequentialBooleanStream asBooleanStream(final @Nullable Object @Nullable ... ignored) { return EmptySequentialBooleanStream.getInstance(); }

    public EmptySequentialCharStream asCharStream(                                            ) { return EmptySequentialCharStream.getInstance(); }
    public EmptySequentialCharStream asCharStream(final @Nullable Object @Nullable ... ignored) { return EmptySequentialCharStream.getInstance(); }

    @Contract(ALWAYS_THIS_0) public EmptySequentialByteStream asByteStream(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialByteStream asByteStream(final @Nullable Object @Nullable ... ignored) { return this; }

    @Override public EmptySequentialShortStream asShortStream(                                            ) { return EmptySequentialShortStream.getInstance(); }
              public EmptySequentialShortStream asShortStream(final @Nullable Object @Nullable ... ignored) { return EmptySequentialShortStream.getInstance(); }

    @Override public EmptySequentialIntStream asIntStream(                                            ) { return EmptySequentialIntStream.getInstance(); }
              public EmptySequentialIntStream asIntStream(final @Nullable Object @Nullable ... ignored) { return EmptySequentialIntStream.getInstance(); }

    @Override public EmptySequentialLongStream asLongStream(                                            ) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream asLongStream(final @Nullable Object @Nullable ... ignored) { return EmptySequentialLongStream.getInstance(); }

    @Override public EmptySequentialFloatStream asFloatStream(                                            ) { return EmptySequentialFloatStream.getInstance(); }
              public EmptySequentialFloatStream asFloatStream(final @Nullable Object @Nullable ... ignored) { return EmptySequentialFloatStream.getInstance(); }

    @Override public EmptySequentialDoubleStream asDoubleStream(                                            ) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream asDoubleStream(final @Nullable Object @Nullable ... ignored) { return EmptySequentialDoubleStream.getInstance(); }

    //#endregion -------------------- As stream --------------------
    //#region -------------------- Boxed --------------------

    @Override public EmptySequentialStream<Byte> boxed(                                            ) { return EmptySequentialStream.getInstance(); }
              public EmptySequentialStream<Byte> boxed(final @Nullable Object @Nullable ... ignored) { return EmptySequentialStream.getInstance(); }

    //#endregion -------------------- Boxed --------------------
    //#region -------------------- Java methods --------------------

    @Override public EmptyByteIterator iterator() { return EmptyByteIterator.getInstance(); }
    @Override public ByteSpliterator spliterator() { return emptyByteSpliterator(); }

    //#endregion -------------------- Java methods --------------------
    //#region -------------------- Close methods --------------------

    @Override public void close() {}
    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialByteStream onClose(final @Nullable Runnable handler) { return this; }

    //#endregion -------------------- Close methods --------------------

    //#endregion -------------------- Methods --------------------

}

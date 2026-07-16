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
import joookiwi.collection.java.callback.additional.ByteConsumer;
import joookiwi.collection.java.callback.additional.ByteSupplier;
import joookiwi.collection.java.callback.additional.CharConsumer;
import joookiwi.collection.java.callback.additional.CharSupplier;
import joookiwi.collection.java.callback.additional.FloatConsumer;
import joookiwi.collection.java.callback.additional.FloatSupplier;
import joookiwi.collection.java.callback.additional.ObjShortConsumer;
import joookiwi.collection.java.callback.additional.ObjShortFunction;
import joookiwi.collection.java.callback.additional.ShortBinaryOperator;
import joookiwi.collection.java.callback.additional.ShortConsumer;
import joookiwi.collection.java.callback.additional.ShortFunction;
import joookiwi.collection.java.callback.additional.ShortObjConsumer;
import joookiwi.collection.java.callback.additional.ShortPredicate;
import joookiwi.collection.java.callback.additional.ShortSupplier;
import joookiwi.collection.java.callback.additional.ShortToBooleanFunction;
import joookiwi.collection.java.callback.additional.ShortToByteFunction;
import joookiwi.collection.java.callback.additional.ShortToCharFunction;
import joookiwi.collection.java.callback.additional.ShortToDoubleFunction;
import joookiwi.collection.java.callback.additional.ShortToFloatFunction;
import joookiwi.collection.java.callback.additional.ShortToIntFunction;
import joookiwi.collection.java.callback.additional.ShortToLongFunction;
import joookiwi.collection.java.callback.additional.ShortUnaryOperator;
import joookiwi.collection.java.extended.iterator.EmptyShortIterator;
import joookiwi.collection.java.extended.iterator.ShortSpliterator;
import joookiwi.collection.java.optional.EmptyOptionalShort;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CollectionConstants.emptyShortSpliterator;
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
import static joookiwi.collection.java.method.ArrayCreator.ShortArray;

/// A sequential [ShortStream] with nothing (as a [singleton][Singleton] instance)
///
/// @see EmptySequentialStream
/// @see EmptySequentialBooleanStream
/// @see EmptySequentialCharStream
/// @see EmptySequentialByteStream
/// @see EmptyParallelShortStream
/// @see EmptySequentialIntStream
/// @see EmptySequentialLongStream
/// @see EmptySequentialFloatStream
/// @see EmptySequentialDoubleStream
@Singleton
@NotNullByDefault
public class EmptySequentialShortStream
        implements ShortStream {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptySequentialShortStream instance;

    protected EmptySequentialShortStream() { super(); }

    public static EmptySequentialShortStream getInstance() {
        final var instance = EmptySequentialShortStream.instance;
        if (instance != null)
            return instance;
        synchronized (EmptySequentialShortStream.class) {
            final var instance2 = EmptySequentialShortStream.instance;
            if (instance2 != null)
                return instance2;
            return (EmptySequentialShortStream.instance = new EmptySequentialShortStream());
        }
    }

    //#endregion -------------------- Singleton usage --------------------

    //#region -------------------- Methods --------------------

    //#region -------------------- Is parallel --------------------

    @Contract(ALWAYS_FALSE_0) @Override public boolean isParallel(                                            ) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean isParallel(final @Nullable Object @Nullable ... ignored) { return false; }

    //#endregion -------------------- Is parallel --------------------
    //#region -------------------- Sequential --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptySequentialShortStream sequential(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialShortStream sequential(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Sequential --------------------
    //#region -------------------- Parallel --------------------

    @Override public EmptyParallelShortStream parallel(                                            ) { return EmptyParallelShortStream.getInstance(); }
              public EmptyParallelShortStream parallel(final @Nullable Object @Nullable ... ignored) { return EmptyParallelShortStream.getInstance(); }

    //#endregion -------------------- Parallel --------------------
    //#region -------------------- Unordered --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptySequentialShortStream unordered(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialShortStream unordered(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Unordered --------------------
    //#region -------------------- Filter --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialShortStream filter(final @Nullable ShortPredicate       predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialShortStream filter(final @Nullable BooleanSupplier      predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialShortStream filter(final @Nullable Object @Nullable ...   ignored) { return this; }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Map --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialShortStream map(final @Nullable ShortUnaryOperator    mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialShortStream map(final @Nullable ShortSupplier         mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialShortStream map(final @Nullable Object @Nullable ... ignored) { return this; }

    @Override public <U> EmptySequentialStream<U> mapToObj(final @Nullable ShortFunction<? extends U> mapper) { return EmptySequentialStream.getInstance(); }
              public <U> EmptySequentialStream<U> mapToObj(final @Nullable Supplier<? extends U>      mapper) { return EmptySequentialStream.getInstance(); }
              public <U> EmptySequentialStream<U> mapToObj(final @Nullable Object @Nullable ...      ignored) { return EmptySequentialStream.getInstance(); }

    @Override public EmptySequentialBooleanStream mapToBoolean(final @Nullable ShortToBooleanFunction mapper) { return EmptySequentialBooleanStream.getInstance(); }
              public EmptySequentialBooleanStream mapToBoolean(final @Nullable BooleanSupplier        mapper) { return EmptySequentialBooleanStream.getInstance(); }
              public EmptySequentialBooleanStream mapToBoolean(final @Nullable Object @Nullable ...  ignored) { return EmptySequentialBooleanStream.getInstance(); }

    @Override public EmptySequentialCharStream mapToChar(final @Nullable ShortToCharFunction   mapper) { return EmptySequentialCharStream.getInstance(); }
              public EmptySequentialCharStream mapToChar(final @Nullable CharSupplier          mapper) { return EmptySequentialCharStream.getInstance(); }
              public EmptySequentialCharStream mapToChar(final @Nullable Object @Nullable ... ignored) { return EmptySequentialCharStream.getInstance(); }

    @Override public EmptySequentialByteStream mapToByte(final @Nullable ShortToByteFunction   mapper) { return EmptySequentialByteStream.getInstance(); }
              public EmptySequentialByteStream mapToByte(final @Nullable ByteSupplier          mapper) { return EmptySequentialByteStream.getInstance(); }
              public EmptySequentialByteStream mapToByte(final @Nullable Object @Nullable ... ignored) { return EmptySequentialByteStream.getInstance(); }

    @Contract(ALWAYS_THIS_1) public EmptySequentialShortStream mapToShort(final @Nullable ShortUnaryOperator    mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialShortStream mapToShort(final @Nullable ShortSupplier         mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialShortStream mapToShort(final @Nullable Object @Nullable ... ignored) { return this; }

    @Override public EmptySequentialIntStream mapToInt(final @Nullable ShortToIntFunction    mapper) { return EmptySequentialIntStream.getInstance(); }
              public EmptySequentialIntStream mapToInt(final @Nullable IntSupplier           mapper) { return EmptySequentialIntStream.getInstance(); }
              public EmptySequentialIntStream mapToInt(final @Nullable Object @Nullable ... ignored) { return EmptySequentialIntStream.getInstance(); }

    @Override public EmptySequentialLongStream mapToLong(final @Nullable ShortToLongFunction   mapper) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream mapToLong(final @Nullable LongSupplier          mapper) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream mapToLong(final @Nullable Object @Nullable ... ignored) { return EmptySequentialLongStream.getInstance(); }

    @Override public EmptySequentialFloatStream mapToFloat(final @Nullable ShortToFloatFunction  mapper) { return EmptySequentialFloatStream.getInstance(); }
              public EmptySequentialFloatStream mapToFloat(final @Nullable FloatSupplier         mapper) { return EmptySequentialFloatStream.getInstance(); }
              public EmptySequentialFloatStream mapToFloat(final @Nullable Object @Nullable ... ignored) { return EmptySequentialFloatStream.getInstance(); }

    @Override public EmptySequentialDoubleStream mapToDouble(final @Nullable ShortToDoubleFunction mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream mapToDouble(final @Nullable DoubleSupplier        mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream mapToDouble(final @Nullable Object @Nullable ... ignored) { return EmptySequentialDoubleStream.getInstance(); }

    //#endregion -------------------- Map --------------------
    //#region -------------------- Flat map --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialShortStream flatMap(final @Nullable ShortFunction<? extends @Nullable ShortStream> mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialShortStream flatMap(final @Nullable Supplier<? extends @Nullable ShortStream>      mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialShortStream flatMap(final @Nullable Object @Nullable ...                          ignored) { return this; }

    @Override public <U> EmptySequentialStream<U> flatMapToObj(final @Nullable ShortFunction<? extends @Nullable Stream<? extends U>> mapper) { return EmptySequentialStream.getInstance(); }
              public <U> EmptySequentialStream<U> flatMapToObj(final @Nullable Supplier<? extends @Nullable Stream<? extends U>>      mapper) { return EmptySequentialStream.getInstance(); }
              public <U> EmptySequentialStream<U> flatMapToObj(final @Nullable Object @Nullable ...                                  ignored) { return EmptySequentialStream.getInstance(); }

    @Override public EmptySequentialBooleanStream flatMapToBoolean(final @Nullable ShortFunction<? extends @Nullable BooleanStream> mapper) { return EmptySequentialBooleanStream.getInstance(); }
              public EmptySequentialBooleanStream flatMapToBoolean(final @Nullable Supplier<? extends @Nullable BooleanStream>      mapper) { return EmptySequentialBooleanStream.getInstance(); }
              public EmptySequentialBooleanStream flatMapToBoolean(final @Nullable Object @Nullable ...                            ignored) { return EmptySequentialBooleanStream.getInstance(); }

    @Override public EmptySequentialCharStream flatMapToChar(final @Nullable ShortFunction<? extends @Nullable CharStream> mapper) { return EmptySequentialCharStream.getInstance(); }
              public EmptySequentialCharStream flatMapToChar(final @Nullable Supplier<? extends @Nullable CharStream>      mapper) { return EmptySequentialCharStream.getInstance(); }
              public EmptySequentialCharStream flatMapToChar(final @Nullable Object @Nullable ...                         ignored) { return EmptySequentialCharStream.getInstance(); }

    @Override public EmptySequentialByteStream flatMapToByte(final @Nullable ShortFunction<? extends @Nullable ByteStream> mapper) { return EmptySequentialByteStream.getInstance(); }
              public EmptySequentialByteStream flatMapToByte(final @Nullable Supplier<? extends @Nullable ByteStream>      mapper) { return EmptySequentialByteStream.getInstance(); }
              public EmptySequentialByteStream flatMapToByte(final @Nullable Object @Nullable ...                         ignored) { return EmptySequentialByteStream.getInstance(); }

    @Contract(ALWAYS_THIS_1) public EmptySequentialShortStream flatMapToShort(final @Nullable ShortFunction<? extends @Nullable ShortStream> mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialShortStream flatMapToShort(final @Nullable Supplier<? extends @Nullable ShortStream>      mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialShortStream flatMapToShort(final @Nullable Object @Nullable ...                          ignored) { return this; }

    @Override public EmptySequentialIntStream flatMapToInt(final @Nullable ShortFunction<? extends @Nullable IntStream> mapper) { return EmptySequentialIntStream.getInstance(); }
              public EmptySequentialIntStream flatMapToInt(final @Nullable Supplier<? extends @Nullable IntStream>      mapper) { return EmptySequentialIntStream.getInstance(); }
              public EmptySequentialIntStream flatMapToInt(final @Nullable Object @Nullable ...                         ignored) { return EmptySequentialIntStream.getInstance(); }

    @Override public EmptySequentialLongStream flatMapToLong(final @Nullable ShortFunction<? extends @Nullable LongStream> mapper) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream flatMapToLong(final @Nullable Supplier<? extends @Nullable LongStream>      mapper) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream flatMapToLong(final @Nullable Object @Nullable ...                         ignored) { return EmptySequentialLongStream.getInstance(); }

    @Override public EmptySequentialFloatStream flatMapToFloat(final @Nullable ShortFunction<? extends @Nullable FloatStream> mapper) { return EmptySequentialFloatStream.getInstance(); }
              public EmptySequentialFloatStream flatMapToFloat(final @Nullable Supplier<? extends @Nullable FloatStream>      mapper) { return EmptySequentialFloatStream.getInstance(); }
              public EmptySequentialFloatStream flatMapToFloat(final @Nullable Object @Nullable ...                          ignored) { return EmptySequentialFloatStream.getInstance(); }

    @Override public EmptySequentialDoubleStream flatMapToDouble(final @Nullable ShortFunction<? extends @Nullable DoubleStream> mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream flatMapToDouble(final @Nullable Supplier<? extends @Nullable DoubleStream>     mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream flatMapToDouble(final @Nullable Object @Nullable ...                          ignored) { return EmptySequentialDoubleStream.getInstance(); }

    //#endregion -------------------- Flat map --------------------
    //#region -------------------- Map multi --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialShortStream mapMulti(final @Nullable ShortObjConsumer<? super ShortConsumer> mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialShortStream mapMulti(final @Nullable ShortConsumer                           mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialShortStream mapMulti(final @Nullable Runnable                                mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialShortStream mapMulti(final @Nullable Object @Nullable ...                   ignored) { return this; }

    @Override public <U> EmptySequentialStream<U> mapMultiToObj(final @Nullable ShortObjConsumer<? super @Nullable Consumer<U>> mapper) { return EmptySequentialStream.getInstance(); }
              public <U> EmptySequentialStream<U> mapMultiToObj(final @Nullable ShortConsumer                                    mapper) { return EmptySequentialStream.getInstance(); }
              public <U> EmptySequentialStream<U> mapMultiToObj(final @Nullable Runnable                                        mapper) { return EmptySequentialStream.getInstance(); }
              public <U> EmptySequentialStream<U> mapMultiToObj(final @Nullable Object @Nullable ...                           ignored) { return EmptySequentialStream.getInstance(); }

    @Override public EmptySequentialBooleanStream mapMultiToBoolean(final @Nullable ShortObjConsumer<? super @Nullable BooleanConsumer> mapper) { return EmptySequentialBooleanStream.getInstance(); }
              public EmptySequentialBooleanStream mapMultiToBoolean(final @Nullable ShortConsumer                                       mapper) { return EmptySequentialBooleanStream.getInstance(); }
              public EmptySequentialBooleanStream mapMultiToBoolean(final @Nullable Runnable                                            mapper) { return EmptySequentialBooleanStream.getInstance(); }
              public EmptySequentialBooleanStream mapMultiToBoolean(final @Nullable Object @Nullable ...                               ignored) { return EmptySequentialBooleanStream.getInstance(); }

    @Override public EmptySequentialCharStream mapMultiToChar(final @Nullable ShortObjConsumer<? super @Nullable CharConsumer> mapper) { return EmptySequentialCharStream.getInstance(); }
              public EmptySequentialCharStream mapMultiToChar(final @Nullable ShortConsumer                                    mapper) { return EmptySequentialCharStream.getInstance(); }
              public EmptySequentialCharStream mapMultiToChar(final @Nullable Runnable                                         mapper) { return EmptySequentialCharStream.getInstance(); }
              public EmptySequentialCharStream mapMultiToChar(final @Nullable Object @Nullable ...                            ignored) { return EmptySequentialCharStream.getInstance(); }

    @Override public EmptySequentialByteStream mapMultiToByte(final @Nullable ShortObjConsumer<? super @Nullable ByteConsumer> mapper) { return EmptySequentialByteStream.getInstance(); }
              public EmptySequentialByteStream mapMultiToByte(final @Nullable ShortConsumer                                    mapper) { return EmptySequentialByteStream.getInstance(); }
              public EmptySequentialByteStream mapMultiToByte(final @Nullable Runnable                                         mapper) { return EmptySequentialByteStream.getInstance(); }
              public EmptySequentialByteStream mapMultiToByte(final @Nullable Object @Nullable ...                            ignored) { return EmptySequentialByteStream.getInstance(); }

    @Contract(ALWAYS_THIS_1) public EmptySequentialShortStream mapMultiToShort(final @Nullable ShortObjConsumer<? super ShortConsumer> mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialShortStream mapMultiToShort(final @Nullable ShortConsumer                           mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialShortStream mapMultiToShort(final @Nullable Runnable                                mapper) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialShortStream mapMultiToShort(final @Nullable Object @Nullable ...                   ignored) { return this; }

    @Override public EmptySequentialIntStream mapMultiToInt(final @Nullable ShortObjConsumer<? super @Nullable IntConsumer> mapper) { return EmptySequentialIntStream.getInstance(); }
              public EmptySequentialIntStream mapMultiToInt(final @Nullable ShortConsumer                                   mapper) { return EmptySequentialIntStream.getInstance(); }
              public EmptySequentialIntStream mapMultiToInt(final @Nullable Runnable                                        mapper) { return EmptySequentialIntStream.getInstance(); }
              public EmptySequentialIntStream mapMultiToInt(final @Nullable Object @Nullable ...                           ignored) { return EmptySequentialIntStream.getInstance(); }

    @Override public EmptySequentialLongStream mapMultiToLong(final @Nullable ShortObjConsumer<? super @Nullable LongConsumer> mapper) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream mapMultiToLong(final @Nullable ShortConsumer                                    mapper) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream mapMultiToLong(final @Nullable Runnable                                         mapper) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream mapMultiToLong(final @Nullable Object @Nullable ...                            ignored) { return EmptySequentialLongStream.getInstance(); }

    @Override public EmptySequentialFloatStream mapMultiToFloat(final @Nullable ShortObjConsumer<? super @Nullable FloatConsumer> mapper) { return EmptySequentialFloatStream.getInstance(); }
              public EmptySequentialFloatStream mapMultiToFloat(final @Nullable ShortConsumer                                     mapper) { return EmptySequentialFloatStream.getInstance(); }
              public EmptySequentialFloatStream mapMultiToFloat(final @Nullable Runnable                                          mapper) { return EmptySequentialFloatStream.getInstance(); }
              public EmptySequentialFloatStream mapMultiToFloat(final @Nullable Object @Nullable ...                             ignored) { return EmptySequentialFloatStream.getInstance(); }

    @Override public EmptySequentialDoubleStream mapMultiToDouble(final @Nullable ShortObjConsumer<? super @Nullable DoubleConsumer> mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream mapMultiToDouble(final @Nullable ShortConsumer                                      mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream mapMultiToDouble(final @Nullable Runnable                                           mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream mapMultiToDouble(final @Nullable Object @Nullable ...                              ignored) { return EmptySequentialDoubleStream.getInstance(); }

    //#endregion -------------------- Map multi --------------------
    //#region -------------------- Distinct --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptySequentialShortStream distinct(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialShortStream distinct(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Distinct --------------------
    //#region -------------------- Sorted --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptySequentialShortStream sorted(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialShortStream sorted(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Sorted --------------------
    //#region -------------------- Peek --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialShortStream peek(final @Nullable ShortConsumer         action) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialShortStream peek(final @Nullable Runnable              action) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialShortStream peek(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Peek --------------------
    //#region -------------------- Limit --------------------

    @Contract(ALWAYS_THIS_1)           public EmptySequentialShortStream limit(final byte                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialShortStream limit(final short                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialShortStream limit(final int                                                   maximum) { return this; }
    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialShortStream limit(final long                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialShortStream limit(final float                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialShortStream limit(final double                                                maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialShortStream limit(final @Nullable Number                                      maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialShortStream limit(final @Nullable AtomicReference<? extends @Nullable Number> maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialShortStream limit(final @Nullable Object @Nullable ...                        ignored) { return this; }

    //#endregion -------------------- Limit --------------------
    //#region -------------------- Skip --------------------

    @Contract(ALWAYS_THIS_1)           public EmptySequentialShortStream skip(final byte                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialShortStream skip(final short                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialShortStream skip(final int                                                   maximum) { return this; }
    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialShortStream skip(final long                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialShortStream skip(final float                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialShortStream skip(final double                                                maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialShortStream skip(final @Nullable Number                                      maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialShortStream skip(final @Nullable AtomicReference<? extends @Nullable Number> maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialShortStream skip(final @Nullable Object @Nullable ...                        ignored) { return this; }

    //#endregion -------------------- Skip --------------------
    //#region -------------------- Take while --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialShortStream takeWhile(final @Nullable ShortPredicate     predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialShortStream takeWhile(final @Nullable BooleanSupplier    predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialShortStream takeWhile(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Take while --------------------
    //#region -------------------- Drop while --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialShortStream dropWhile(final @Nullable ShortPredicate     predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialShortStream dropWhile(final @Nullable BooleanSupplier    predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialShortStream dropWhile(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Drop while --------------------
    //#region -------------------- For each --------------------

    @Override public void forEach(final @Nullable ShortConsumer         action) {}
              public void forEach(final @Nullable Runnable              action) {}
              public void forEach(final @Nullable Object @Nullable ... ignored) {}

    //#endregion -------------------- For each --------------------
    //#region -------------------- For each ordered --------------------

    @Override public void forEachOrdered(final @Nullable ShortConsumer         action) {}
              public void forEachOrdered(final @Nullable Runnable              action) {}
              public void forEachOrdered(final @Nullable Object @Nullable ... ignored) {}

    //#endregion -------------------- For each ordered --------------------
    //#region -------------------- To array --------------------

                           @Override public                              short[] toArray(                                ) { return ShortArray(); }
    @Contract(pure = true) @Override public <U extends @Nullable Object> U[]     toArray(final IntFunction<U[]> generator) { return generator.apply(0); }

    //#endregion -------------------- To array --------------------
    //#region -------------------- Reduce --------------------

    @Contract(ALWAYS_1ST_1)           public final short reduce(final short initial                                                 ) { return initial; }
    @Contract(ALWAYS_1ST_2) @Override public final short reduce(final short initial, final @Nullable ShortBinaryOperator accumulator) { return initial; }
    @Contract(ALWAYS_1ST_2)           public final short reduce(final short initial, final @Nullable ShortSupplier       accumulator) { return initial; }
    @Contract(ALWAYS_1ST_2)           public final short reduce(final short initial, final @Nullable Object @Nullable ...    ignored) { return initial; }

    @Override public EmptyOptionalShort reduce(final @Nullable ShortBinaryOperator accumulator) { return EmptyOptionalShort.getInstance(); }
              public EmptyOptionalShort reduce(final @Nullable ShortSupplier       accumulator) { return EmptyOptionalShort.getInstance(); }
              public EmptyOptionalShort reduce(final @Nullable Object @Nullable ...    ignored) { return EmptyOptionalShort.getInstance(); }

    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable ObjShortFunction<U, U> accumulator, final @Nullable BinaryOperator<U>   combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable ObjShortFunction<U, U> accumulator, final @Nullable Supplier<U>         combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable ObjShortFunction<U, U> accumulator, final @Nullable Object @Nullable ... ignored) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Function<U, U>         accumulator, final @Nullable BinaryOperator<U>   combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Function<U, U>         accumulator, final @Nullable Supplier<U>         combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Function<U, U>         accumulator, final @Nullable Object @Nullable ... ignored) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Supplier<U>            accumulator, final @Nullable BinaryOperator<U>   combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Supplier<U>            accumulator, final @Nullable Supplier<U>         combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Supplier<U>            accumulator, final @Nullable Object @Nullable ... ignored) { return initial; }

    //#endregion -------------------- Reduce --------------------
    //#region -------------------- Collect --------------------

    @Contract(ALWAYS_NULL_3) @Override public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjShortConsumer<R> accumulator, final @Nullable BiConsumer<R, R>    combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjShortConsumer<R> accumulator, final @Nullable Consumer<R>         combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjShortConsumer<R> accumulator, final @Nullable Runnable            combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjShortConsumer<R> accumulator, final @Nullable Object @Nullable ... ignored) { return null; }
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

    @Override public @Range(from = 0, to = 0) short sum(                                            ) { return 0; }
              public @Range(from = 0, to = 0) short sum(final @Nullable Object @Nullable ... ignored) { return 0; }

    //#endregion -------------------- Sum --------------------
    //#region -------------------- Min --------------------

    @Override public EmptyOptionalShort min(                                            ) { return EmptyOptionalShort.getInstance(); }
              public EmptyOptionalShort min(final @Nullable Object @Nullable ... ignored) { return EmptyOptionalShort.getInstance(); }

    //#endregion -------------------- Min --------------------
    //#region -------------------- Max --------------------

    @Override public EmptyOptionalShort max(                                            ) { return EmptyOptionalShort.getInstance(); }
              public EmptyOptionalShort max(final @Nullable Object @Nullable ... ignored) { return EmptyOptionalShort.getInstance(); }

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

    @Override public ShortSummaryStatistics summaryStatistics(                                            ) { return new ShortSummaryStatistics(); }
              public ShortSummaryStatistics summaryStatistics(final @Nullable Object @Nullable ... ignored) { return new ShortSummaryStatistics(); }

    //#endregion -------------------- Summary statistics --------------------
    //#region -------------------- All match --------------------

    @Contract(ALWAYS_TRUE_1) @Override public boolean allMatch(final @Nullable ShortPredicate     predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean allMatch(final @Nullable BooleanSupplier    predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean allMatch(final @Nullable Object @Nullable ... ignored) { return true; }

    //#endregion -------------------- All match --------------------
    //#region -------------------- Any match --------------------

    @Contract(ALWAYS_FALSE_0)           public boolean anyMatch(                                            ) { return false; }
    @Contract(ALWAYS_FALSE_1) @Override public boolean anyMatch(final @Nullable ShortPredicate     predicate) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean anyMatch(final @Nullable BooleanSupplier    predicate) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean anyMatch(final @Nullable Object @Nullable ... ignored) { return false; }

    //#endregion -------------------- Any match --------------------
    //#region -------------------- None match --------------------

    @Contract(ALWAYS_TRUE_0)           public boolean noneMatch(                                            ) { return true; }
    @Contract(ALWAYS_TRUE_1) @Override public boolean noneMatch(final @Nullable ShortPredicate     predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean noneMatch(final @Nullable BooleanSupplier    predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean noneMatch(final @Nullable Object @Nullable ... ignored) { return true; }

    //#endregion -------------------- None match --------------------
    //#region -------------------- Find first --------------------

    @Override public EmptyOptionalShort findFirst(                                            ) { return EmptyOptionalShort.getInstance(); }
              public EmptyOptionalShort findFirst(final @Nullable Object @Nullable ... ignored) { return EmptyOptionalShort.getInstance(); }

    //#endregion -------------------- Find first --------------------
    //#region -------------------- Find any --------------------

    @Override public EmptyOptionalShort findAny(                                            ) { return EmptyOptionalShort.getInstance(); }
              public EmptyOptionalShort findAny(final @Nullable Object @Nullable ... ignored) { return EmptyOptionalShort.getInstance(); }

    //#endregion -------------------- Find any --------------------
    //#region -------------------- As stream --------------------

    public <U> EmptySequentialStream<U> asStream(                                            ) { return EmptySequentialStream.getInstance(); }
    public <U> EmptySequentialStream<U> asStream(final @Nullable Object @Nullable ... ignored) { return EmptySequentialStream.getInstance(); }

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

    @Override public EmptySequentialStream<Short> boxed(                                            ) { return EmptySequentialStream.getInstance(); }
              public EmptySequentialStream<Short> boxed(final @Nullable Object @Nullable ... ignored) { return EmptySequentialStream.getInstance(); }

    //#endregion -------------------- Boxed --------------------
    //#region -------------------- Java methods --------------------

    @Override public EmptyShortIterator iterator() { return EmptyShortIterator.getInstance(); }
    @Override public ShortSpliterator spliterator() { return emptyShortSpliterator(); }

    //#endregion -------------------- Java methods --------------------
    //#region -------------------- Close methods --------------------

    @Override public void close() {}
    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialShortStream onClose(final @Nullable Runnable handler) { return this; }

    //#endregion -------------------- Close methods --------------------

    //#endregion -------------------- Methods --------------------

}

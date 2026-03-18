package joookiwi.collection.java.stream;

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
import java.util.function.IntSupplier;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import java.util.stream.Stream;
import joookiwi.collection.java.CollectionCreator;
import joookiwi.collection.java.annotation.Singleton;
import joookiwi.collection.java.callback.additional.BooleanConsumer;
import joookiwi.collection.java.callback.additional.ByteConsumer;
import joookiwi.collection.java.callback.additional.CharBinaryOperator;
import joookiwi.collection.java.callback.additional.CharConsumer;
import joookiwi.collection.java.callback.additional.CharFunction;
import joookiwi.collection.java.callback.additional.CharObjConsumer;
import joookiwi.collection.java.callback.additional.CharPredicate;
import joookiwi.collection.java.callback.additional.CharSupplier;
import joookiwi.collection.java.callback.additional.CharToBooleanFunction;
import joookiwi.collection.java.callback.additional.CharToByteFunction;
import joookiwi.collection.java.callback.additional.CharToDoubleFunction;
import joookiwi.collection.java.callback.additional.CharToFloatFunction;
import joookiwi.collection.java.callback.additional.CharToIntFunction;
import joookiwi.collection.java.callback.additional.CharToLongFunction;
import joookiwi.collection.java.callback.additional.CharToShortFunction;
import joookiwi.collection.java.callback.additional.CharUnaryOperator;
import joookiwi.collection.java.callback.additional.FloatConsumer;
import joookiwi.collection.java.callback.additional.FloatSupplier;
import joookiwi.collection.java.callback.additional.ObjCharConsumer;
import joookiwi.collection.java.callback.additional.ObjCharFunction;
import joookiwi.collection.java.callback.additional.ShortConsumer;
import joookiwi.collection.java.callback.additional.ShortSupplier;
import joookiwi.collection.java.extended.iterator.EmptyCharIterator;
import joookiwi.collection.java.optional.OptionalChar;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import static joookiwi.collection.java.CollectionCreator.emptyOptionalChar;
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
import static joookiwi.collection.java.method.ArrayCreator.CharArray;

/// A sequential [CharStream] with nothing (as a [singleton][Singleton] instance)
///
/// @see EmptySequentialStream
/// @see EmptySequentialBooleanStream
/// @see EmptyParallelCharStream
/// @see EmptySequentialByteStream
/// @see EmptySequentialShortStream
/// @see EmptySequentialIntStream
/// @see EmptySequentialLongStream
/// @see EmptySequentialFloatStream
/// @see EmptySequentialDoubleStream
@Singleton
@NotNullByDefault
public class EmptySequentialCharStream
        implements CharStream {

    //#region -------------------- Singleton usage --------------------

    private static volatile @Nullable EmptySequentialCharStream instance;

    protected EmptySequentialCharStream() { super(); }

    public static EmptySequentialCharStream getInstance() {
        final var instance = EmptySequentialCharStream.instance;
        if (instance != null)
            return instance;
        synchronized (EmptySequentialCharStream.class) {
            final var instance2 = EmptySequentialCharStream.instance;
            if (instance2 != null)
                return instance2;
            return (EmptySequentialCharStream.instance = new EmptySequentialCharStream());
        }
    }

    //#endregion -------------------- Singleton usage --------------------

    //#region -------------------- Methods --------------------

    //#region -------------------- Is parallel --------------------

    @Contract(ALWAYS_FALSE_0) @Override public boolean isParallel(                                            ) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean isParallel(final @Nullable Object @Nullable ... ignored) { return false; }

    //#endregion -------------------- Is parallel --------------------
    //#region -------------------- Sequential --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptySequentialCharStream sequential(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialCharStream sequential(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Sequential --------------------
    //#region -------------------- Parallel --------------------

    @Override public EmptyParallelCharStream parallel(                                            ) { return EmptyParallelCharStream.getInstance(); }
              public EmptyParallelCharStream parallel(final @Nullable Object @Nullable ... ignored) { return EmptyParallelCharStream.getInstance(); }

    //#endregion -------------------- Parallel --------------------
    //#region -------------------- Unordered --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptySequentialCharStream unordered(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialCharStream unordered(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Unordered --------------------
    //#region -------------------- Filter --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialCharStream filter(final @Nullable CharPredicate        predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialCharStream filter(final @Nullable BooleanSupplier      predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialCharStream filter(final @Nullable Object @Nullable ...   ignored) { return this; }

    //#endregion -------------------- Filter --------------------
    //#region -------------------- Map --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialCharStream map(final @Nullable CharUnaryOperator  mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialCharStream map(final @Nullable CharSupplier       mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialCharStream map(final @Nullable Object @Nullable ... ignored) { return this; }

    @Override public <U extends @Nullable Object> EmptySequentialStream<U> mapToObj(final @Nullable CharFunction<? extends U> mapper) { return EmptySequentialStream.getInstance(); }
              public <U extends @Nullable Object> EmptySequentialStream<U> mapToObj(final @Nullable Supplier<? extends U>        mapper) { return EmptySequentialStream.getInstance(); }
              public <U extends @Nullable Object> EmptySequentialStream<U> mapToObj(final @Nullable Object @Nullable ...        ignored) { return EmptySequentialStream.getInstance(); }

    @Override public EmptySequentialBooleanStream mapToBoolean(final @Nullable CharToBooleanFunction mapper) { return EmptySequentialBooleanStream.getInstance(); }
              public EmptySequentialBooleanStream mapToBoolean(final @Nullable BooleanSupplier       mapper) { return EmptySequentialBooleanStream.getInstance(); }
              public EmptySequentialBooleanStream mapToBoolean(final @Nullable Object @Nullable ... ignored) { return EmptySequentialBooleanStream.getInstance(); }

    @Override public EmptySequentialByteStream mapToByte(final @Nullable CharToByteFunction mapper) { return EmptySequentialByteStream.getInstance(); }
              public EmptySequentialByteStream mapToByte(final @Nullable CharSupplier        mapper) { return EmptySequentialByteStream.getInstance(); }
              public EmptySequentialByteStream mapToByte(final @Nullable Object @Nullable ...  ignored) { return EmptySequentialByteStream.getInstance(); }

    @Override public EmptySequentialShortStream mapToShort(final @Nullable CharToShortFunction mapper) { return EmptySequentialShortStream.getInstance(); }
              public EmptySequentialShortStream mapToShort(final @Nullable ShortSupplier          mapper) { return EmptySequentialShortStream.getInstance(); }
              public EmptySequentialShortStream mapToShort(final @Nullable Object @Nullable ...  ignored) { return EmptySequentialShortStream.getInstance(); }

    @Override public EmptySequentialIntStream mapToInt(final @Nullable CharToIntFunction mapper) { return EmptySequentialIntStream.getInstance(); }
              public EmptySequentialIntStream mapToInt(final @Nullable IntSupplier           mapper) { return EmptySequentialIntStream.getInstance(); }
              public EmptySequentialIntStream mapToInt(final @Nullable Object @Nullable ... ignored) { return EmptySequentialIntStream.getInstance(); }

    @Override public EmptySequentialLongStream mapToLong(final @Nullable CharToLongFunction mapper) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream mapToLong(final @Nullable LongSupplier          mapper) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream mapToLong(final @Nullable Object @Nullable ... ignored) { return EmptySequentialLongStream.getInstance(); }

    @Override public EmptySequentialFloatStream mapToFloat(final @Nullable CharToFloatFunction mapper) { return EmptySequentialFloatStream.getInstance(); }
              public EmptySequentialFloatStream mapToFloat(final @Nullable FloatSupplier          mapper) { return EmptySequentialFloatStream.getInstance(); }
              public EmptySequentialFloatStream mapToFloat(final @Nullable Object @Nullable ...  ignored) { return EmptySequentialFloatStream.getInstance(); }

    @Override public EmptySequentialDoubleStream mapToDouble(final @Nullable CharToDoubleFunction mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream mapToDouble(final @Nullable DoubleSupplier          mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream mapToDouble(final @Nullable Object @Nullable ...   ignored) { return EmptySequentialDoubleStream.getInstance(); }

    //#endregion -------------------- Map --------------------
    //#region -------------------- Flat map --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialCharStream flatMap(final @Nullable CharFunction<? extends @Nullable CharStream> mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialCharStream flatMap(final @Nullable Supplier<? extends @Nullable CharStream>     mapper) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialCharStream flatMap(final @Nullable Object @Nullable ...                           ignored) { return this; }

    @Override public <U extends @Nullable Object> EmptySequentialStream<U> flatMapToObj(final @Nullable CharFunction<? extends @Nullable Stream<? extends U>> mapper) { return EmptySequentialStream.getInstance(); }
              public <U extends @Nullable Object> EmptySequentialStream<U> flatMapToObj(final @Nullable Supplier<? extends @Nullable Stream<? extends U>>     mapper) { return EmptySequentialStream.getInstance(); }
              public <U extends @Nullable Object> EmptySequentialStream<U> flatMapToObj(final @Nullable Object @Nullable ...                                 ignored) { return EmptySequentialStream.getInstance(); }

    @Override public EmptySequentialBooleanStream flatMapToBoolean(final @Nullable CharFunction<? extends @Nullable BooleanStream> mapper) { return EmptySequentialBooleanStream.getInstance(); }
              public EmptySequentialBooleanStream flatMapToBoolean(final @Nullable Supplier<? extends @Nullable BooleanStream>     mapper) { return EmptySequentialBooleanStream.getInstance(); }
              public EmptySequentialBooleanStream flatMapToBoolean(final @Nullable Object @Nullable ...                           ignored) { return EmptySequentialBooleanStream.getInstance(); }

    @Override public EmptySequentialByteStream flatMapToByte(final @Nullable CharFunction<? extends @Nullable ByteStream> mapper) { return EmptySequentialByteStream.getInstance(); }
              public EmptySequentialByteStream flatMapToByte(final @Nullable Supplier<? extends @Nullable ByteStream>     mapper) { return EmptySequentialByteStream.getInstance(); }
              public EmptySequentialByteStream flatMapToByte(final @Nullable Object @Nullable ...                        ignored) { return EmptySequentialByteStream.getInstance(); }

    @Override public EmptySequentialShortStream flatMapToShort(final @Nullable CharFunction<? extends @Nullable ShortStream> mapper) { return EmptySequentialShortStream.getInstance(); }
              public EmptySequentialShortStream flatMapToShort(final @Nullable Supplier<? extends @Nullable ShortStream>     mapper) { return EmptySequentialShortStream.getInstance(); }
              public EmptySequentialShortStream flatMapToShort(final @Nullable Object @Nullable ...                         ignored) { return EmptySequentialShortStream.getInstance(); }

    @Override public EmptySequentialIntStream flatMapToInt(final @Nullable CharFunction<? extends @Nullable IntStream> mapper) { return EmptySequentialIntStream.getInstance(); }
              public EmptySequentialIntStream flatMapToInt(final @Nullable Supplier<? extends @Nullable IntStream>     mapper) { return EmptySequentialIntStream.getInstance(); }
              public EmptySequentialIntStream flatMapToInt(final @Nullable Object @Nullable ...                       ignored) { return EmptySequentialIntStream.getInstance(); }

    @Override public EmptySequentialLongStream flatMapToLong(final @Nullable CharFunction<? extends @Nullable LongStream> mapper) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream flatMapToLong(final @Nullable Supplier<? extends @Nullable LongStream>     mapper) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream flatMapToLong(final @Nullable Object @Nullable ...                        ignored) { return EmptySequentialLongStream.getInstance(); }

    @Override public EmptySequentialFloatStream flatMapToFloat(final @Nullable CharFunction<? extends @Nullable FloatStream> mapper) { return EmptySequentialFloatStream.getInstance(); }
              public EmptySequentialFloatStream flatMapToFloat(final @Nullable Supplier<? extends @Nullable FloatStream>     mapper) { return EmptySequentialFloatStream.getInstance(); }
              public EmptySequentialFloatStream flatMapToFloat(final @Nullable Object @Nullable ...                         ignored) { return EmptySequentialFloatStream.getInstance(); }

    @Override public EmptySequentialDoubleStream flatMapToDouble(final @Nullable CharFunction<? extends @Nullable DoubleStream> mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream flatMapToDouble(final @Nullable Supplier<? extends @Nullable DoubleStream>     mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream flatMapToDouble(final @Nullable Object @Nullable ...                          ignored) { return EmptySequentialDoubleStream.getInstance(); }

    //#endregion -------------------- Flat map --------------------
    //#region -------------------- Map multi --------------------

    @Override public EmptySequentialCharStream mapMulti(final @Nullable CharObjConsumer<? super CharConsumer> mapper) { return this; }
              public EmptySequentialCharStream mapMulti(final @Nullable CharConsumer                          mapper) { return this; }
              public EmptySequentialCharStream mapMulti(final @Nullable Runnable                              mapper) { return this; }
              public EmptySequentialCharStream mapMulti(final @Nullable Object @Nullable ...                 ignored) { return this; }

    @Override public <U extends @Nullable Object> EmptySequentialStream<U> mapMultiToObj(final @Nullable CharObjConsumer<? super @Nullable Consumer<U>> mapper) { return EmptySequentialStream.getInstance(); }
              public <U extends @Nullable Object> EmptySequentialStream<U> mapMultiToObj(final @Nullable CharConsumer                                   mapper) { return EmptySequentialStream.getInstance(); }
              public <U extends @Nullable Object> EmptySequentialStream<U> mapMultiToObj(final @Nullable Runnable                                       mapper) { return EmptySequentialStream.getInstance(); }
              public <U extends @Nullable Object> EmptySequentialStream<U> mapMultiToObj(final @Nullable Object @Nullable ...                          ignored) { return EmptySequentialStream.getInstance(); }

    @Override public EmptySequentialBooleanStream mapMultiToBoolean(final @Nullable CharObjConsumer<? super @Nullable BooleanConsumer> mapper) { return EmptySequentialBooleanStream.getInstance(); }
              public EmptySequentialBooleanStream mapMultiToBoolean(final @Nullable CharConsumer                                       mapper) { return EmptySequentialBooleanStream.getInstance(); }
              public EmptySequentialBooleanStream mapMultiToBoolean(final @Nullable Runnable                                           mapper) { return EmptySequentialBooleanStream.getInstance(); }
              public EmptySequentialBooleanStream mapMultiToBoolean(final @Nullable Object @Nullable ...                              ignored) { return EmptySequentialBooleanStream.getInstance(); }

    @Override public EmptySequentialByteStream mapMultiToByte(final @Nullable CharObjConsumer<? super @Nullable ByteConsumer> mapper) { return EmptySequentialByteStream.getInstance(); }
              public EmptySequentialByteStream mapMultiToByte(final @Nullable CharConsumer                                    mapper) { return EmptySequentialByteStream.getInstance(); }
              public EmptySequentialByteStream mapMultiToByte(final @Nullable Runnable                                        mapper) { return EmptySequentialByteStream.getInstance(); }
              public EmptySequentialByteStream mapMultiToByte(final @Nullable Object @Nullable ...                           ignored) { return EmptySequentialByteStream.getInstance(); }

    @Override public EmptySequentialShortStream mapMultiToShort(final @Nullable CharObjConsumer<? super @Nullable ShortConsumer> mapper) { return EmptySequentialShortStream.getInstance(); }
              public EmptySequentialShortStream mapMultiToShort(final @Nullable CharConsumer                                     mapper) { return EmptySequentialShortStream.getInstance(); }
              public EmptySequentialShortStream mapMultiToShort(final @Nullable Runnable                                         mapper) { return EmptySequentialShortStream.getInstance(); }
              public EmptySequentialShortStream mapMultiToShort(final @Nullable Object @Nullable ...                            ignored) { return EmptySequentialShortStream.getInstance(); }

    @Override public EmptySequentialIntStream mapMultiToInt(final @Nullable CharObjConsumer<? super @Nullable IntConsumer> mapper) { return EmptySequentialIntStream.getInstance(); }
              public EmptySequentialIntStream mapMultiToInt(final @Nullable CharConsumer                                   mapper) { return EmptySequentialIntStream.getInstance(); }
              public EmptySequentialIntStream mapMultiToInt(final @Nullable Runnable                                       mapper) { return EmptySequentialIntStream.getInstance(); }
              public EmptySequentialIntStream mapMultiToInt(final @Nullable Object @Nullable ...                          ignored) { return EmptySequentialIntStream.getInstance(); }

    @Override public EmptySequentialLongStream mapMultiToLong(final @Nullable CharObjConsumer<? super @Nullable LongConsumer> mapper) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream mapMultiToLong(final @Nullable CharConsumer                                    mapper) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream mapMultiToLong(final @Nullable Runnable                                        mapper) { return EmptySequentialLongStream.getInstance(); }
              public EmptySequentialLongStream mapMultiToLong(final @Nullable Object @Nullable ...                           ignored) { return EmptySequentialLongStream.getInstance(); }

    @Override public EmptySequentialFloatStream mapMultiToFloat(final @Nullable CharObjConsumer<? super @Nullable FloatConsumer> mapper) { return EmptySequentialFloatStream.getInstance(); }
              public EmptySequentialFloatStream mapMultiToFloat(final @Nullable CharConsumer                                     mapper) { return EmptySequentialFloatStream.getInstance(); }
              public EmptySequentialFloatStream mapMultiToFloat(final @Nullable Runnable                                         mapper) { return EmptySequentialFloatStream.getInstance(); }
              public EmptySequentialFloatStream mapMultiToFloat(final @Nullable Object @Nullable ...                            ignored) { return EmptySequentialFloatStream.getInstance(); }

    @Override public EmptySequentialDoubleStream mapMultiToDouble(final @Nullable CharObjConsumer<? super @Nullable DoubleConsumer> mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream mapMultiToDouble(final @Nullable CharConsumer                                      mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream mapMultiToDouble(final @Nullable Runnable                                          mapper) { return EmptySequentialDoubleStream.getInstance(); }
              public EmptySequentialDoubleStream mapMultiToDouble(final @Nullable Object @Nullable ...                             ignored) { return EmptySequentialDoubleStream.getInstance(); }

    //#endregion -------------------- Map multi --------------------
    //#region -------------------- Distinct --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptySequentialCharStream distinct(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialCharStream distinct(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Distinct --------------------
    //#region -------------------- Sorted --------------------

    @Contract(ALWAYS_THIS_0) @Override public EmptySequentialCharStream sorted(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialCharStream sorted(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Sorted --------------------
    //#region -------------------- Peek --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialCharStream peek(final @Nullable CharConsumer          action) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialCharStream peek(final @Nullable Runnable              action) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialCharStream peek(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Peek --------------------
    //#region -------------------- Limit --------------------

    @Contract(ALWAYS_THIS_1)           public EmptySequentialCharStream limit(final byte                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialCharStream limit(final short                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialCharStream limit(final int                                                   maximum) { return this; }
    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialCharStream limit(final long                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialCharStream limit(final float                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialCharStream limit(final double                                                maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialCharStream limit(final @Nullable Number                                      maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialCharStream limit(final @Nullable AtomicReference<? extends @Nullable Number> maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialCharStream limit(final @Nullable Object @Nullable ...                        ignored) { return this; }

    //#endregion -------------------- Limit --------------------
    //#region -------------------- Skip --------------------

    @Contract(ALWAYS_THIS_1)           public EmptySequentialCharStream skip(final byte                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialCharStream skip(final short                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialCharStream skip(final int                                                   maximum) { return this; }
    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialCharStream skip(final long                                                  maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialCharStream skip(final float                                                 maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialCharStream skip(final double                                                maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialCharStream skip(final @Nullable Number                                      maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialCharStream skip(final @Nullable AtomicReference<? extends @Nullable Number> maximum) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialCharStream skip(final @Nullable Object @Nullable ...                        ignored) { return this; }

    //#endregion -------------------- Skip --------------------
    //#region -------------------- Take while --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialCharStream takeWhile(final @Nullable CharPredicate      predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialCharStream takeWhile(final @Nullable BooleanSupplier    predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialCharStream takeWhile(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Take while --------------------
    //#region -------------------- Drop while --------------------

    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialCharStream dropWhile(final @Nullable CharPredicate      predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialCharStream dropWhile(final @Nullable BooleanSupplier    predicate) { return this; }
    @Contract(ALWAYS_THIS_1)           public EmptySequentialCharStream dropWhile(final @Nullable Object @Nullable ... ignored) { return this; }

    //#endregion -------------------- Drop while --------------------
    //#region -------------------- For each --------------------

    @Override public void forEach(final @Nullable CharConsumer          action) {}
              public void forEach(final @Nullable Runnable              action) {}
              public void forEach(final @Nullable Object @Nullable ... ignored) {}

    //#endregion -------------------- For each --------------------
    //#region -------------------- For each ordered --------------------

    @Override public void forEachOrdered(final @Nullable CharConsumer          action) {}
              public void forEachOrdered(final @Nullable Runnable              action) {}
              public void forEachOrdered(final @Nullable Object @Nullable ... ignored) {}

    //#endregion -------------------- For each ordered --------------------
    //#region -------------------- To array --------------------

                           @Override public                              char[] toArray(                                 ) { return CharArray(); }
    @Contract(pure = true)           public <U extends @Nullable Object> U[]    toArray(final LongFunction<U[]> generator) { return generator.apply(0); }

    //#endregion -------------------- To array --------------------
    //#region -------------------- Reduce --------------------

    @Contract(ALWAYS_1ST_1)           public final char reduce(final char initial                                                ) { return initial; }
    @Contract(ALWAYS_1ST_2) @Override public final char reduce(final char initial, final @Nullable CharBinaryOperator accumulator) { return initial; }
    @Contract(ALWAYS_1ST_2)           public final char reduce(final char initial, final @Nullable CharSupplier       accumulator) { return initial; }
    @Contract(ALWAYS_1ST_2)           public final char reduce(final char initial, final @Nullable Object @Nullable ...   ignored) { return initial; }

    @Override public OptionalChar reduce(final @Nullable CharBinaryOperator accumulator) { return emptyOptionalChar(); }
              public OptionalChar reduce(final @Nullable CharSupplier       accumulator) { return emptyOptionalChar(); }
              public OptionalChar reduce(final @Nullable Object @Nullable ...   ignored) { return emptyOptionalChar(); }

    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable ObjCharFunction<U, U> accumulator, final @Nullable BinaryOperator<U>   combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable ObjCharFunction<U, U> accumulator, final @Nullable Supplier<U>         combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable ObjCharFunction<U, U> accumulator, final @Nullable Object @Nullable ... ignored) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Function<U, U>        accumulator, final @Nullable BinaryOperator<U>   combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Function<U, U>        accumulator, final @Nullable Supplier<U>         combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Function<U, U>        accumulator, final @Nullable Object @Nullable ... ignored) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Supplier<U>           accumulator, final @Nullable BinaryOperator<U>   combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Supplier<U>           accumulator, final @Nullable Supplier<U>         combiner) { return initial; }
    @Contract(ALWAYS_1ST_3) public <U extends @Nullable Object> U reduce(final U initial, final @Nullable Supplier<U>           accumulator, final @Nullable Object @Nullable ... ignored) { return initial; }

    //#endregion -------------------- Reduce --------------------
    //#region -------------------- Collect --------------------

    @Contract(ALWAYS_NULL_3) @Override public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjCharConsumer<R> accumulator, final @Nullable BiConsumer<R, R>    combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjCharConsumer<R> accumulator, final @Nullable Consumer<R>         combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjCharConsumer<R> accumulator, final @Nullable Runnable            combiner) { return null; }
    @Contract(ALWAYS_NULL_3)           public <R extends @Nullable Object> R collect(final @Nullable Supplier<R> supplier, final @Nullable ObjCharConsumer<R> accumulator, final @Nullable Object @Nullable ... ignored) { return null; }
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
    //#region -------------------- Count --------------------

    @Contract(pure = true) @Override public @Range(from = 0, to = 0) long count(                                            ) { return 0; }
    @Contract(pure = true)           public @Range(from = 0, to = 0) long count(final @Nullable Object @Nullable ... ignored) { return 0; }

    //#endregion -------------------- Count --------------------
    //#region -------------------- Summary statistics --------------------

    @Override public CharSummaryStatistics summaryStatistics(                                            ) { return new CharSummaryStatistics(); }
              public CharSummaryStatistics summaryStatistics(final @Nullable Object @Nullable ... ignored) { return new CharSummaryStatistics(); }

    //#endregion -------------------- Summary statistics --------------------
    //#region -------------------- All match --------------------

    @Contract(ALWAYS_TRUE_1) @Override public boolean allMatch(final @Nullable CharPredicate      predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean allMatch(final @Nullable BooleanSupplier    predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean allMatch(final @Nullable Object @Nullable ... ignored) { return true; }

    //#endregion -------------------- All match --------------------
    //#region -------------------- Any match --------------------

    @Contract(ALWAYS_FALSE_0)           public boolean anyMatch(                                              ) { return false; }
    @Contract(ALWAYS_FALSE_1) @Override public boolean anyMatch(final @Nullable CharPredicate        predicate) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean anyMatch(final @Nullable BooleanSupplier      predicate) { return false; }
    @Contract(ALWAYS_FALSE_1)           public boolean anyMatch(final @Nullable Object @Nullable ...   ignored) { return false; }

    //#endregion -------------------- Any match --------------------
    //#region -------------------- None match --------------------

    @Contract(ALWAYS_TRUE_0)           public boolean noneMatch(                                            ) { return true; }
    @Contract(ALWAYS_TRUE_1) @Override public boolean noneMatch(final @Nullable CharPredicate      predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean noneMatch(final @Nullable BooleanSupplier    predicate) { return true; }
    @Contract(ALWAYS_TRUE_1)           public boolean noneMatch(final @Nullable Object @Nullable ... ignored) { return true; }

    //#endregion -------------------- None match --------------------
    //#region -------------------- Find first --------------------

    @Override public OptionalChar findFirst(                                            ) { return emptyOptionalChar(); }
              public OptionalChar findFirst(final @Nullable Object @Nullable ... ignored) { return emptyOptionalChar(); }

    //#endregion -------------------- Find first --------------------
    //#region -------------------- Find any --------------------

    @Override public OptionalChar findAny(                                            ) { return emptyOptionalChar(); }
              public OptionalChar findAny(final @Nullable Object @Nullable ... ignored) { return emptyOptionalChar(); }

    //#endregion -------------------- Find any --------------------
    //#region -------------------- As stream --------------------

    public <U extends @Nullable Object> EmptySequentialStream<U> asStream(                                            ) { return EmptySequentialStream.getInstance(); }
    public <U extends @Nullable Object> EmptySequentialStream<U> asStream(final @Nullable Object @Nullable ... ignored) { return EmptySequentialStream.getInstance(); }

    public EmptySequentialBooleanStream asBooleanStream(                                            ) { return EmptySequentialBooleanStream.getInstance(); }
    public EmptySequentialBooleanStream asBooleanStream(final @Nullable Object @Nullable ... ignored) { return EmptySequentialBooleanStream.getInstance(); }

    @Contract(ALWAYS_THIS_0) public EmptySequentialCharStream asCharStream(                                            ) { return this; }
    @Contract(ALWAYS_THIS_1) public EmptySequentialCharStream asCharStream(final @Nullable Object @Nullable ... ignored) { return this; }

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

    @Override public EmptySequentialStream<Character> boxed(                                            ) { return EmptySequentialStream.getInstance(); }
              public EmptySequentialStream<Character> boxed(final @Nullable Object @Nullable ... ignored) { return EmptySequentialStream.getInstance(); }

    //#endregion -------------------- Boxed --------------------
    //#region -------------------- Java methods --------------------

    @Override public EmptyCharIterator iterator() { return EmptyCharIterator.getInstance(); }
    @Override public Spliterator.OfPrimitive<Character, CharConsumer, ?> spliterator() { return CollectionCreator.getInstance().CharSpliterator(); }

    //#endregion -------------------- Java methods --------------------
    //#region -------------------- Close methods --------------------

    @Override public void close() {}
    @Contract(ALWAYS_THIS_1) @Override public EmptySequentialCharStream onClose(final @Nullable Runnable handler) { return this; }

    //#endregion -------------------- Close methods --------------------

    //#endregion -------------------- Methods --------------------

}

package joookiwi.collection.java.stream;

import java.util.OptionalDouble;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.function.Supplier;
import java.util.stream.BaseStream;
import java.util.stream.Stream;
import joookiwi.collection.java.callback.additional.BooleanConsumer;
import joookiwi.collection.java.callback.additional.ByteConsumer;
import joookiwi.collection.java.callback.additional.CharConsumer;
import joookiwi.collection.java.callback.additional.FloatConsumer;
import joookiwi.collection.java.callback.additional.ObjShortConsumer;
import joookiwi.collection.java.callback.additional.ShortBinaryOperator;
import joookiwi.collection.java.callback.additional.ShortConsumer;
import joookiwi.collection.java.callback.additional.ShortFunction;
import joookiwi.collection.java.callback.additional.ShortObjConsumer;
import joookiwi.collection.java.callback.additional.ShortPredicate;
import joookiwi.collection.java.callback.additional.ShortToBooleanFunction;
import joookiwi.collection.java.callback.additional.ShortToByteFunction;
import joookiwi.collection.java.callback.additional.ShortToCharFunction;
import joookiwi.collection.java.callback.additional.ShortToDoubleFunction;
import joookiwi.collection.java.callback.additional.ShortToFloatFunction;
import joookiwi.collection.java.callback.additional.ShortToIntFunction;
import joookiwi.collection.java.callback.additional.ShortToLongFunction;
import joookiwi.collection.java.callback.additional.ShortUnaryOperator;
import joookiwi.collection.java.extended.iterator.ShortIterator;
import joookiwi.collection.java.optional.OptionalShort;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

@NotNullByDefault
public interface ShortStream
        extends BaseStream<Short, ShortStream> {
    //TODO: add documentation on ShortStream

    @Override boolean isParallel();

    ShortStream filter(ShortPredicate predicate);

    //#region -------------------- Map methods --------------------

    ShortStream map(ShortUnaryOperator mapper);
    <U extends @Nullable Object> Stream<U> mapToObj(ShortFunction<? extends U> mapper);
    BooleanStream mapToBoolean(ShortToBooleanFunction mapper);
    CharStream mapToChar(ShortToCharFunction mapper);
    ByteStream mapToByte(ShortToByteFunction mapper);
    IntStream mapToInt(ShortToIntFunction mapper);
    LongStream mapToLong(ShortToLongFunction mapper);
    FloatStream mapToFloat(ShortToFloatFunction mapper);
    DoubleStream mapToDouble(ShortToDoubleFunction mapper);

    ShortStream flatMap(ShortFunction<? extends ShortStream> mapper);
    <U extends @Nullable Object> Stream<U> flatMapToObj(ShortFunction<? extends Stream<? extends U>> mapper);
    BooleanStream flatMapToBoolean(ShortFunction<? extends BooleanStream> mapper);
    CharStream flatMapToChar(ShortFunction<? extends CharStream> mapper);
    ByteStream flatMapToByte(ShortFunction<? extends ByteStream> mapper);
    IntStream flatMapToInt(ShortFunction<? extends IntStream> mapper);
    LongStream flatMapToLong(ShortFunction<? extends LongStream> mapper);
    FloatStream flatMapToFloat(ShortFunction<? extends FloatStream> mapper);
    DoubleStream flatMapToDouble(ShortFunction<? extends DoubleStream> mapper);

    ShortStream mapMulti(ShortObjConsumer<? super ShortConsumer> mapper);
    <U extends @Nullable Object> Stream<U> mapMultiToObj(ShortObjConsumer<? super Consumer<U>> mapper);
    BooleanStream mapMultiToBoolean(ShortObjConsumer<? super BooleanConsumer> mapper);
    CharStream mapMultiToChar(ShortObjConsumer<? super CharConsumer> mapper);
    ByteStream mapMultiToByte(ShortObjConsumer<? super ByteConsumer> mapper);
    IntStream mapMultiToInt(ShortObjConsumer<? super IntConsumer> mapper);
    LongStream mapMultiToLong(ShortObjConsumer<? super LongConsumer> mapper);
    FloatStream mapMultiToFloat(ShortObjConsumer<? super FloatConsumer> mapper);
    DoubleStream mapMultiToDouble(ShortObjConsumer<? super DoubleConsumer> mapper);

    //#endregion -------------------- Map methods --------------------

    ShortStream distinct();

    ShortStream sorted();

    ShortStream peek(ShortConsumer action);

    ShortStream limit(long maximum);

    ShortStream skip(long maximum);

    ShortStream takeWhile(ShortPredicate predicate);

    ShortStream dropWhile(ShortPredicate predicate);

    //#region -------------------- For each methods --------------------

    void forEach(ShortConsumer action);

    void forEachOrdered(ShortConsumer action);

    //#endregion -------------------- For each methods --------------------

    short reduce(short initial, ShortBinaryOperator accumulator);
    OptionalShort reduce(ShortBinaryOperator accumulator);

    <R extends @Nullable Object> R collect(Supplier<R> supplier, ObjShortConsumer<R> accumulator, BiConsumer<R, R> combiner);

    short sum();

    OptionalShort min();

    OptionalShort max();

    long count();

    OptionalDouble average();

    Object summaryStatistics();//TODO create interface ShortSummaryStatistics

    boolean allMatch(ShortPredicate predicate);

    boolean anyMatch(ShortPredicate predicate);

    boolean noneMatch(ShortPredicate predicate);

    OptionalShort findFirst();

    OptionalShort findAny();

    @Override ShortStream sequential();

    @Override ShortStream parallel();

    @Override ShortStream unordered();

    //#region -------------------- As stream methods --------------------

    IntStream asIntStream();

    LongStream asLongStream();

    FloatStream asFloatStream();

    DoubleStream asDoubleStream();

    //#endregion -------------------- As stream methods --------------------

    Stream<Short> boxed();

    @Override ShortIterator iterator();//TODO create interface ShortIterator
    @Override Spliterator.OfPrimitive<Short, ShortConsumer, ?> spliterator();//TODO create interface ShortSpliterator

    short[] toArray();

    @Override void close();
    @Override ShortStream onClose(Runnable closeHandler);

}

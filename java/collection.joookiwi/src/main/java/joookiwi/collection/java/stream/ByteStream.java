package joookiwi.collection.java.stream;

import java.util.OptionalDouble;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Supplier;
import java.util.stream.BaseStream;
import joookiwi.collection.java.callback.additional.BooleanConsumer;
import joookiwi.collection.java.callback.additional.ByteBinaryOperator;
import joookiwi.collection.java.callback.additional.ByteConsumer;
import joookiwi.collection.java.callback.additional.ByteFunction;
import joookiwi.collection.java.callback.additional.ByteObjConsumer;
import joookiwi.collection.java.callback.additional.BytePredicate;
import joookiwi.collection.java.callback.additional.ByteToBooleanFunction;
import joookiwi.collection.java.callback.additional.ByteToCharFunction;
import joookiwi.collection.java.callback.additional.ByteToDoubleFunction;
import joookiwi.collection.java.callback.additional.ByteToFloatFunction;
import joookiwi.collection.java.callback.additional.ByteToIntFunction;
import joookiwi.collection.java.callback.additional.ByteToLongFunction;
import joookiwi.collection.java.callback.additional.ByteToShortFunction;
import joookiwi.collection.java.callback.additional.ByteUnaryOperator;
import joookiwi.collection.java.callback.additional.CharConsumer;
import joookiwi.collection.java.callback.additional.FloatConsumer;
import joookiwi.collection.java.callback.additional.ObjByteConsumer;
import joookiwi.collection.java.callback.additional.ShortConsumer;
import joookiwi.collection.java.extended.iterator.ByteIterator;
import joookiwi.collection.java.extended.iterator.ByteSpliterator;
import joookiwi.collection.java.optional.OptionalByte;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

@NotNullByDefault
public interface ByteStream
        extends BaseStream<Byte, ByteStream> {
    //TODO: add documentation on ByteStream

    @Override boolean isParallel();

    ByteStream filter(BytePredicate predicate);

    //#region -------------------- Map methods --------------------

    ByteStream map(ByteUnaryOperator mapper);
    <U> Stream<U> mapToObj(ByteFunction<? extends U> mapper);
    BooleanStream mapToBoolean(ByteToBooleanFunction mapper);
    CharStream mapToChar(ByteToCharFunction mapper);
    ShortStream mapToShort(ByteToShortFunction mapper);
    IntStream mapToInt(ByteToIntFunction mapper);
    LongStream mapToLong(ByteToLongFunction mapper);
    FloatStream mapToFloat(ByteToFloatFunction mapper);
    DoubleStream mapToDouble(ByteToDoubleFunction mapper);

    ByteStream flatMap(ByteFunction<? extends ByteStream> mapper);
    <U> Stream<U> flatMapToObj(ByteFunction<? extends Stream<? extends U>> mapper);
    BooleanStream flatMapToBoolean(ByteFunction<? extends BooleanStream> mapper);
    CharStream flatMapToChar(ByteFunction<? extends CharStream> mapper);
    ShortStream flatMapToShort(ByteFunction<? extends ShortStream> mapper);
    IntStream flatMapToInt(ByteFunction<? extends IntStream> mapper);
    LongStream flatMapToLong(ByteFunction<? extends LongStream> mapper);
    FloatStream flatMapToFloat(ByteFunction<? extends FloatStream> mapper);
    DoubleStream flatMapToDouble(ByteFunction<? extends DoubleStream> mapper);

    ByteStream mapMulti(ByteObjConsumer<? super ByteConsumer> mapper);
    <U> Stream<U> mapMultiToObj(ByteObjConsumer<? super Consumer<U>> mapper);
    BooleanStream mapMultiToBoolean(ByteObjConsumer<? super BooleanConsumer> mapper);
    CharStream mapMultiToChar(ByteObjConsumer<? super CharConsumer> mapper);
    ShortStream mapMultiToShort(ByteObjConsumer<? super ShortConsumer> mapper);
    IntStream mapMultiToInt(ByteObjConsumer<? super IntConsumer> mapper);
    LongStream mapMultiToLong(ByteObjConsumer<? super LongConsumer> mapper);
    FloatStream mapMultiToFloat(ByteObjConsumer<? super FloatConsumer> mapper);
    DoubleStream mapMultiToDouble(ByteObjConsumer<? super DoubleConsumer> mapper);

    //#endregion -------------------- Map methods --------------------

    ByteStream distinct();

    ByteStream sorted();

    ByteStream peek(ByteConsumer action);

    ByteStream limit(long maximum);

    ByteStream skip(long maximum);

    ByteStream takeWhile(BytePredicate predicate);

    ByteStream dropWhile(BytePredicate predicate);

    //#region -------------------- For each methods --------------------

    void forEach(ByteConsumer action);

    void forEachOrdered(ByteConsumer action);

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- Reduce methods --------------------

    byte reduce(byte initial, ByteBinaryOperator accumulator);

    OptionalByte reduce(ByteBinaryOperator accumulator);

    //#endregion -------------------- Reduce methods --------------------

    <R extends @Nullable Object> R collect(Supplier<R> supplier, ObjByteConsumer<R> accumulator, BiConsumer<R, R> combiner);

    byte sum();

    OptionalByte min();

    OptionalByte max();

    long count();

    OptionalDouble average();

    Object summaryStatistics();//TODO create interface ByteSummaryStatistics

    boolean allMatch(BytePredicate predicate);

    boolean anyMatch(BytePredicate predicate);

    boolean noneMatch(BytePredicate predicate);

    OptionalByte findFirst();

    OptionalByte findAny();

    @Override ByteStream sequential();

    @Override ByteStream parallel();

    @Override ByteStream unordered();

    //#region -------------------- Conversion methods --------------------

    ShortStream asShortStream();

    IntStream asIntStream();

    LongStream asLongStream();

    FloatStream asFloatStream();

    DoubleStream asDoubleStream();

    Stream<Byte> boxed();

    @Override ByteIterator iterator();

    @Override ByteSpliterator spliterator();

    byte[] toArray();
    <U extends @Nullable Object> U[] toArray(IntFunction<U[]> generator);

    //#endregion -------------------- Conversion methods --------------------
    //#region -------------------- Close methods --------------------

    @Override void close();

    @Override ByteStream onClose(Runnable closeHandler);

    //#endregion -------------------- Close methods --------------------

}

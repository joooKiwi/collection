package joookiwi.collection.java.stream;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Supplier;
import java.util.stream.BaseStream;
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
import joookiwi.collection.java.callback.additional.FloatConsumer;
import joookiwi.collection.java.callback.additional.ObjBooleanConsumer;
import joookiwi.collection.java.callback.additional.ShortConsumer;
import joookiwi.collection.java.extended.iterator.BooleanIterator;
import joookiwi.collection.java.extended.iterator.BooleanSpliterator;
import joookiwi.collection.java.optional.OptionalBoolean;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

@NotNullByDefault
public interface BooleanStream
        extends BaseStream<Boolean, BooleanStream> {
    //TODO: add documentation on BooleanStream

    @Override boolean isParallel();

    BooleanStream filter(BooleanUnaryOperator predicate);

    //#region -------------------- Map methods --------------------

    BooleanStream map(BooleanUnaryOperator mapper);
    <U> Stream<U> mapToObj(BooleanFunction<? extends U> mapper);
    CharStream mapToChar(BooleanToCharFunction mapper);
    ByteStream mapToByte(BooleanToByteFunction mapper);
    ShortStream mapToShort(BooleanToShortFunction mapper);
    IntStream mapToInt(BooleanToIntFunction mapper);
    LongStream mapToLong(BooleanToLongFunction mapper);
    FloatStream mapToFloat(BooleanToFloatFunction mapper);
    DoubleStream mapToDouble(BooleanToDoubleFunction mapper);

    BooleanStream flatMap(BooleanFunction<? extends BooleanStream> mapper);
    <U> Stream<U> flatMapToObj(BooleanFunction<? extends Stream<? extends U>> mapper);
    CharStream flatMapToChar(BooleanFunction<? extends CharStream> mapper);
    ByteStream flatMapToByte(BooleanFunction<? extends ByteStream> mapper);
    ShortStream flatMapToShort(BooleanFunction<? extends ShortStream> mapper);
    IntStream flatMapToInt(BooleanFunction<? extends IntStream> mapper);
    LongStream flatMapToLong(BooleanFunction<? extends LongStream> mapper);
    FloatStream flatMapToFloat(BooleanFunction<? extends FloatStream> mapper);
    DoubleStream flatMapToDouble(BooleanFunction<? extends DoubleStream> mapper);

    BooleanStream mapMulti(BooleanObjConsumer<? super BooleanConsumer> mapper);
    <U> Stream<U> mapMultiToObj(BooleanObjConsumer<? super Consumer<U>> mapper);
    CharStream mapMultiToChar(BooleanObjConsumer<? super CharConsumer> mapper);
    ByteStream mapMultiToByte(BooleanObjConsumer<? super ByteConsumer> mapper);
    ShortStream mapMultiToShort(BooleanObjConsumer<? super ShortConsumer> mapper);
    IntStream mapMultiToInt(BooleanObjConsumer<? super IntConsumer> mapper);
    LongStream mapMultiToLong(BooleanObjConsumer<? super LongConsumer> mapper);
    FloatStream mapMultiToFloat(BooleanObjConsumer<? super FloatConsumer> mapper);
    DoubleStream mapMultiToDouble(BooleanObjConsumer<? super DoubleConsumer> mapper);

    //#endregion -------------------- Map methods --------------------

    BooleanStream distinct();

    BooleanStream sorted();

    BooleanStream peek(BooleanConsumer action);

    BooleanStream limit(long maximum);

    BooleanStream skip(long maximum);

    BooleanStream takeWhile(BooleanUnaryOperator predicate);

    BooleanStream dropWhile(BooleanUnaryOperator predicate);

    //#region -------------------- For each methods --------------------

    void forEach(BooleanConsumer action);

    void forEachOrdered(BooleanConsumer action);

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- Reduce methods --------------------

    boolean reduce(boolean initial, BooleanBinaryOperator accumulator);

    OptionalBoolean reduce(BooleanBinaryOperator accumulator);

    //#endregion -------------------- Reduce methods --------------------

    <R extends @Nullable Object> R collect(Supplier<R> supplier, ObjBooleanConsumer<R> accumulator, BiConsumer<R, R> combiner);

    long count();

    Object summaryStatistics();//TODO create interface BooleanSummaryStatistics

    boolean allMatch(BooleanUnaryOperator predicate);

    boolean anyMatch(BooleanUnaryOperator predicate);

    boolean noneMatch(BooleanUnaryOperator predicate);

    OptionalBoolean findFirst();

    OptionalBoolean findAny();

    @Override BooleanStream sequential();

    @Override BooleanStream parallel();

    @Override BooleanStream unordered();

    //#region -------------------- Conversion methods --------------------

    Stream<Boolean> boxed();

    @Override BooleanIterator iterator();

    @Override BooleanSpliterator spliterator();

    boolean[] toArray();
    <U extends @Nullable Object> U[] toArray(IntFunction<U[]> generator);

    //#endregion -------------------- Conversion methods --------------------
    //#region -------------------- Close methods --------------------

    @Override void close();

    @Override BooleanStream onClose(Runnable closeHandler);

    //#endregion -------------------- Close methods --------------------

}

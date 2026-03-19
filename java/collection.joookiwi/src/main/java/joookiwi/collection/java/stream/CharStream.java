package joookiwi.collection.java.stream;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Supplier;
import java.util.stream.BaseStream;
import joookiwi.collection.java.callback.additional.BooleanConsumer;
import joookiwi.collection.java.callback.additional.ByteConsumer;
import joookiwi.collection.java.callback.additional.CharBinaryOperator;
import joookiwi.collection.java.callback.additional.CharConsumer;
import joookiwi.collection.java.callback.additional.CharFunction;
import joookiwi.collection.java.callback.additional.CharObjConsumer;
import joookiwi.collection.java.callback.additional.CharPredicate;
import joookiwi.collection.java.callback.additional.CharToBooleanFunction;
import joookiwi.collection.java.callback.additional.CharToByteFunction;
import joookiwi.collection.java.callback.additional.CharToDoubleFunction;
import joookiwi.collection.java.callback.additional.CharToFloatFunction;
import joookiwi.collection.java.callback.additional.CharToIntFunction;
import joookiwi.collection.java.callback.additional.CharToLongFunction;
import joookiwi.collection.java.callback.additional.CharToShortFunction;
import joookiwi.collection.java.callback.additional.CharUnaryOperator;
import joookiwi.collection.java.callback.additional.FloatConsumer;
import joookiwi.collection.java.callback.additional.ObjCharConsumer;
import joookiwi.collection.java.callback.additional.ShortConsumer;
import joookiwi.collection.java.extended.iterator.CharIterator;
import joookiwi.collection.java.extended.iterator.CharSpliterator;
import joookiwi.collection.java.optional.OptionalChar;
import org.jetbrains.annotations.NotNullByDefault;
import org.jetbrains.annotations.Nullable;

@NotNullByDefault
public interface CharStream
        extends BaseStream<Character, CharStream> {
    //TODO: add documentation on CharStream

    @Override boolean isParallel();

    CharStream filter(CharPredicate predicate);

    //#region -------------------- Map methods --------------------

    CharStream map(CharUnaryOperator mapper);
    <U> Stream<U> mapToObj(CharFunction<? extends U> mapper);
    BooleanStream mapToBoolean(CharToBooleanFunction mapper);
    ByteStream mapToByte(CharToByteFunction mapper);
    ShortStream mapToShort(CharToShortFunction mapper);
    IntStream mapToInt(CharToIntFunction mapper);
    LongStream mapToLong(CharToLongFunction mapper);
    FloatStream mapToFloat(CharToFloatFunction mapper);
    DoubleStream mapToDouble(CharToDoubleFunction mapper);

    CharStream flatMap(CharFunction<? extends CharStream> mapper);
    <U> Stream<U> flatMapToObj(CharFunction<? extends Stream<? extends U>> mapper);
    BooleanStream flatMapToBoolean(CharFunction<? extends BooleanStream> mapper);
    ByteStream flatMapToByte(CharFunction<? extends ByteStream> mapper);
    ShortStream flatMapToShort(CharFunction<? extends ShortStream> mapper);
    IntStream flatMapToInt(CharFunction<? extends IntStream> mapper);
    LongStream flatMapToLong(CharFunction<? extends LongStream> mapper);
    FloatStream flatMapToFloat(CharFunction<? extends FloatStream> mapper);
    DoubleStream flatMapToDouble(CharFunction<? extends DoubleStream> mapper);

    CharStream mapMulti(CharObjConsumer<? super CharConsumer> mapper);
    <U> Stream<U> mapMultiToObj(CharObjConsumer<? super Consumer<U>> mapper);
    BooleanStream mapMultiToBoolean(CharObjConsumer<? super BooleanConsumer> mapper);
    ByteStream mapMultiToByte(CharObjConsumer<? super ByteConsumer> mapper);
    ShortStream mapMultiToShort(CharObjConsumer<? super ShortConsumer> mapper);
    IntStream mapMultiToInt(CharObjConsumer<? super IntConsumer> mapper);
    LongStream mapMultiToLong(CharObjConsumer<? super LongConsumer> mapper);
    FloatStream mapMultiToFloat(CharObjConsumer<? super FloatConsumer> mapper);
    DoubleStream mapMultiToDouble(CharObjConsumer<? super DoubleConsumer> mapper);

    //#endregion -------------------- Map methods --------------------

    CharStream distinct();

    CharStream sorted();

    CharStream peek(CharConsumer action);

    CharStream limit(long maximum);

    CharStream skip(long maximum);

    CharStream takeWhile(CharPredicate predicate);

    CharStream dropWhile(CharPredicate predicate);

    //#region -------------------- For each methods --------------------

    void forEach(CharConsumer action);

    void forEachOrdered(CharConsumer action);

    //#endregion -------------------- For each methods --------------------
    //#region -------------------- Reduce methods --------------------

    char reduce(char initial, CharBinaryOperator accumulator);

    OptionalChar reduce(CharBinaryOperator accumulator);

    //#endregion -------------------- Reduce methods --------------------

    <R extends @Nullable Object> R collect(Supplier<R> supplier, ObjCharConsumer<R> accumulator, BiConsumer<R, R> combiner);

    long count();

    Object summaryStatistics();//TODO create interface CharSummaryStatistics

    boolean allMatch(CharPredicate predicate);

    boolean anyMatch(CharPredicate predicate);

    boolean noneMatch(CharPredicate predicate);

    OptionalChar findFirst();

    OptionalChar findAny();

    @Override CharStream sequential();

    @Override CharStream parallel();

    @Override CharStream unordered();

    //#region -------------------- Conversion methods --------------------

    Stream<Character> boxed();

    @Override CharIterator iterator();

    @Override CharSpliterator spliterator();

    char[] toArray();
    <U extends @Nullable Object> U[] toArray(IntFunction<U[]> generator);

    //#endregion -------------------- Conversion methods --------------------
    //#region -------------------- Close methods --------------------

    @Override void close();

    @Override CharStream onClose(Runnable closeHandler);

    //#endregion -------------------- Close methods --------------------

}

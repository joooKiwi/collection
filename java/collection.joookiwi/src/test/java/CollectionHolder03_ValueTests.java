import condition.DisableIfNormalCondition;
import condition.DisableIfViewerCondition;
import instance.CollectionHolderForTest;
import instance.ArrayAsCollection;
import instance.GenericCollectionHolder_GetAlias;
import instance.GenericCollectionHolder_GetFirstAlias;
import instance.GenericCollectionHolder_GetFirstOrNullAlias;
import instance.GenericCollectionHolder_GetLastAlias;
import instance.GenericCollectionHolder_GetLastOrNullAlias;
import instance.GenericCollectionHolder_GetOrElseAlias;
import instance.GenericCollectionHolder_GetOrNullAlias;
import instance.ArrayAsMinimalistCollection;
import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.exception.EmptyCollectionException;
import joookiwi.collection.java.exception.IndexOutOfBoundsException;
import org.jetbrains.annotations.NotNullByDefault;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator.Simple;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedClass;
import org.junit.jupiter.params.provider.FieldSource;
import test.AbstractEmptyCollectionHolderTests;
import test.AbstractInstancesTests;
import test.AbstractMethodsTests;

import static joookiwi.collection.java.NumericConstants.MAX_INT_VALUE;
import static joookiwi.collection.java.NumericConstants.MIN_INT_VALUE;
import static joookiwi.collection.java.NumericConstants.NULL_BIG_DECIMAL;
import static joookiwi.collection.java.NumericConstants.NULL_BIG_INTEGER;
import static joookiwi.collection.java.NumericConstants.NULL_BYTE;
import static joookiwi.collection.java.NumericConstants.NULL_DOUBLE;
import static joookiwi.collection.java.NumericConstants.NULL_FLOAT;
import static joookiwi.collection.java.NumericConstants.NULL_INT;
import static joookiwi.collection.java.NumericConstants.NULL_LONG;
import static joookiwi.collection.java.NumericConstants.NULL_SHORT;
import static joookiwi.collection.java.NumericConstants.ZERO_BIG_DECIMAL;
import static joookiwi.collection.java.NumericConstants.ZERO_BIG_INTEGER;
import static joookiwi.collection.java.NumericConstants.ZERO_BYTE;
import static joookiwi.collection.java.NumericConstants.ZERO_DOUBLE;
import static joookiwi.collection.java.NumericConstants.ZERO_FLOAT;
import static joookiwi.collection.java.NumericConstants.ZERO_INT;
import static joookiwi.collection.java.NumericConstants.ZERO_LONG;
import static joookiwi.collection.java.NumericConstants.ZERO_SHORT;
//import static joookiwi.collection.java.method.AtOrElse.atOrElse;
//import static joookiwi.collection.java.method.AtOrNull.atOrNull;
//import static joookiwi.collection.java.method.ElementAtOrElse.ElementAtOrElse;
//import static joookiwi.collection.java.method.ElementAtOrNull.elementAtOrNull;
import static joookiwi.collection.java.method.First.first;
import static joookiwi.collection.java.method.FirstIndexed.firstIndexed;
import static joookiwi.collection.java.method.FirstIndexedOrNull.firstIndexedOrNull;
import static joookiwi.collection.java.method.FirstOrNull.firstOrNull;
import static joookiwi.collection.java.method.GetFirst.getFirst;
import static joookiwi.collection.java.method.GetFirstOrElse.getFirstOrElse;
import static joookiwi.collection.java.method.GetFirstOrNull.getFirstOrNull;
import static joookiwi.collection.java.method.GetLast.getLast;
import static joookiwi.collection.java.method.GetLastOrElse.getLastOrElse;
import static joookiwi.collection.java.method.GetLastOrNull.getLastOrNull;
import static joookiwi.collection.java.method.GetOrElse.getOrElse;
import static joookiwi.collection.java.method.GetOrNull.getOrNull;
import static joookiwi.collection.java.method.Last.last;
import static joookiwi.collection.java.method.LastIndexed.lastIndexed;
import static joookiwi.collection.java.method.LastIndexedOrNull.lastIndexedOrNull;
import static joookiwi.collection.java.method.LastOrNull.lastOrNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;
import static value.Arrays.A;
import static value.Arrays.AB;
import static value.Arrays.ABCD;
import static value.Arrays.EMPTY;
import static value.Callbacks.callback0AsFail;
import static value.Callbacks.callback1AltAsFail;
import static value.ReusableFields.callback0;
import static value.ReusableFields.callback1Alt;
import static value.ReusableFields.EMPTY_ARRAY;
import static value.ReusableFields.EXISTANT_INDEX;
import static value.ReusableFields.INVALID_INDEX;
import static value.ReusableFields.VALUE;
import static value.ReusableFields.ZERO_ATOMIC_INTEGER;
import static value.ReusableFields.ZERO_ATOMIC_LONG;
import static value.ReusableFields.ZERO_DOUBLE_ACCUMULATOR;
import static value.ReusableFields.ZERO_DOUBLE_ADDER;
import static value.ReusableFields.ZERO_LONG_ACCUMULATOR;
import static value.ReusableFields.ZERO_LONG_ADDER;
import static value.ReusableFields.ZERO_NUMBER;
import static value.ReusableFields_Null.NULL_ATOMIC_INTEGER;
import static value.ReusableFields_Null.NULL_ATOMIC_LONG;
import static value.ReusableFields_Null.NULL_DOUBLE_ACCUMULATOR;
import static value.ReusableFields_Null.NULL_DOUBLE_ADDER;
import static value.ReusableFields_Null.NULL_LONG_ACCUMULATOR;
import static value.ReusableFields_Null.NULL_LONG_ADDER;
import static value.ReusableFields_Null.NULL_NUMBER;
import static value.ReusableFields_Null.NULL_OBJECT;
import static value.ReusableFields_Null.NULL_PREDICATE0;
import static value.ReusableFields_Null.NULL_PREDICATE1;
import static value.ReusableFields_Null.NULL_PREDICATE1_ALT;
import static value.ReusableFields_Null.NULL_PREDICATE2;
import static value.ReusableFields_Null.NULL_PREDICATE2_ALT;
import static value.ReusableFields_Null.NULL_STRING;
import static value.ReusableFields_Null.NULL_VARARGS;

@NotNullByDefault
@DisplayNameGeneration(Simple.class)
@DisplayName("CollectionHolder tests (value)") @TestInstance(PER_CLASS) class CollectionHolder03_ValueTests {

    @TestInstance(PER_CLASS) @Nested class EmptyCollectionHolder extends AbstractEmptyCollectionHolderTests {

        @Nested class get {
            @DisplayName("∅")           @Test void testEmpty()         { assertThrowsExactly(EmptyCollectionException.class,      instance::get); }
            @DisplayName("null object") @Test void testNullObject()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.get(NULL_OBJECT)); }
            @DisplayName("null string") @Test void testNullString()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.get(NULL_STRING)); }
            @DisplayName("null []")     @Test void testNullArray()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.get(NULL_VARARGS)); }
            @DisplayName("byte")        @Test void testByte()          { assertThrowsExactly(EmptyCollectionException.class, () -> instance.get((byte) 0)); }
            @DisplayName("short")       @Test void testShort()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.get((short) 0)); }
            @DisplayName("int")         @Test void testInt()           { assertThrowsExactly(EmptyCollectionException.class, () -> instance.get(0)); }
            @DisplayName("long")        @Test void testLong()          { assertThrowsExactly(EmptyCollectionException.class, () -> instance.get(0L)); }
            @DisplayName("float")       @Test void testFloat()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.get(0.0F)); }
            @DisplayName("double")      @Test void testDouble()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.get(0.0D)); }
                                        @Test void Byte()              { assertThrowsExactly(EmptyCollectionException.class, () -> instance.get(NULL_BYTE)); }
                                        @Test void Short()             { assertThrowsExactly(EmptyCollectionException.class, () -> instance.get(NULL_SHORT)); }
                                        @Test void Integer()           { assertThrowsExactly(EmptyCollectionException.class, () -> instance.get(NULL_INT)); }
                                        @Test void Long()              { assertThrowsExactly(EmptyCollectionException.class, () -> instance.get(NULL_LONG)); }
                                        @Test void Float()             { assertThrowsExactly(EmptyCollectionException.class, () -> instance.get(NULL_FLOAT)); }
                                        @Test void Double()            { assertThrowsExactly(EmptyCollectionException.class, () -> instance.get(NULL_DOUBLE)); }
                                        @Test void BigInteger()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.get(NULL_BIG_INTEGER)); }
                                        @Test void BigDecimal()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.get(NULL_BIG_DECIMAL)); }
                                        @Test void AtomicInteger()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.get(NULL_ATOMIC_INTEGER)); }
                                        @Test void AtomicLong()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.get(NULL_ATOMIC_LONG)); }
                                        @Test void LongAdder()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.get(NULL_LONG_ADDER)); }
                                        @Test void LongAccumulator()   { assertThrowsExactly(EmptyCollectionException.class, () -> instance.get(NULL_LONG_ACCUMULATOR)); }
                                        @Test void DoubleAdder()       { assertThrowsExactly(EmptyCollectionException.class, () -> instance.get(NULL_DOUBLE_ADDER)); }
                                        @Test void DoubleAccumulator() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.get(NULL_DOUBLE_ACCUMULATOR)); }
                                        @Test void Number()            { assertThrowsExactly(EmptyCollectionException.class, () -> instance.get(NULL_NUMBER)); }
            @DisplayName("[]")          @Test void testArray()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.get(EMPTY_ARRAY)); }
        }
        @Nested class getFirst {
            @DisplayName("∅")           @Test void testEmpty()      { assertThrowsExactly(EmptyCollectionException.class,      instance::getFirst); }
            @DisplayName("null object") @Test void testNullObject() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.getFirst(NULL_OBJECT)); }
            @DisplayName("null string") @Test void testNullString() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.getFirst(NULL_STRING)); }
            @DisplayName("null array")  @Test void testNullArray()  { assertThrowsExactly(EmptyCollectionException.class, () -> instance.getFirst(NULL_VARARGS)); }
            @DisplayName("[]")          @Test void testArray()      { assertThrowsExactly(EmptyCollectionException.class, () -> instance.getFirst(EMPTY_ARRAY)); }
        }
        @Nested class getLast {
            @DisplayName("∅")           @Test void testEmpty()      { assertThrowsExactly(EmptyCollectionException.class,      instance::getLast); }
            @DisplayName("null object") @Test void testNullObject() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.getLast(NULL_OBJECT)); }
            @DisplayName("null string") @Test void testNullString() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.getLast(NULL_STRING)); }
            @DisplayName("null array")  @Test void testNullArray()  { assertThrowsExactly(EmptyCollectionException.class, () -> instance.getLast(NULL_VARARGS)); }
            @DisplayName("[]")          @Test void testArray()      { assertThrowsExactly(EmptyCollectionException.class, () -> instance.getLast(EMPTY_ARRAY)); }
        }

        @Nested class getOrElse {
            @DisplayName("0 byte, it → it")                    @Test void testByteWith1ArgCallback()              { assertEquals("0",                   getInstance().getOrElse((byte) 0, (IntFunction<?>) String::valueOf)); }
            @DisplayName("0 short, it → it")                   @Test void testShortWith1ArgCallback()             { assertEquals("0",                   getInstance().getOrElse((short) 0, (IntFunction<?>) String::valueOf)); }
            @DisplayName("0 int, it → it")                     @Test void testIntWith1ArgCallback()               { assertEquals("0",                   getInstance().getOrElse(0, (IntFunction<?>) String::valueOf)); }
            @DisplayName("0 long, it → it")                    @Test void testLongWith1ArgCallback()              { assertEquals("0",                   getInstance().getOrElse(0L, (LongFunction<?>) String::valueOf)); }
            @DisplayName("0 float, it → it")                   @Test void testFloatWith1ArgCallback()             { assertEquals("0.0",                 getInstance().getOrElse(0.0F, (DoubleFunction<?>) String::valueOf)); }
            @DisplayName("0 double, it → it")                  @Test void testDoubleWith1ArgCallback()            { assertEquals("0.0",                 getInstance().getOrElse(0.0D, (DoubleFunction<?>) String::valueOf)); }
            @DisplayName("0 Byte, it → it")                    @Test void ByteWith1ArgCallback()                  { assertSame(ZERO_BYTE,               getInstance().getOrElse(ZERO_BYTE, it -> it)); }
            @DisplayName("0 Short, it → it")                   @Test void ShortWith1ArgCallback()                 { assertSame(ZERO_SHORT,              getInstance().getOrElse(ZERO_SHORT, it -> it)); }
            @DisplayName("0 Integer, it → it")                 @Test void IntegerWith1ArgCallback()               { assertSame(ZERO_INT,                getInstance().getOrElse(ZERO_INT, it -> it)); }
            @DisplayName("0 Long, it → it")                    @Test void LongWith1ArgCallback()                  { assertSame(ZERO_LONG,               getInstance().getOrElse(ZERO_LONG, it -> it)); }
            @DisplayName("0 Float, it → it")                   @Test void FloatWith1ArgCallback()                 { assertSame(ZERO_FLOAT,              getInstance().getOrElse(ZERO_FLOAT, it -> it)); }
            @DisplayName("0 Double, it → it")                  @Test void DoubleWith1ArgCallback()                { assertSame(ZERO_DOUBLE,             getInstance().getOrElse(ZERO_DOUBLE, it -> it)); }
            @DisplayName("0 BigInteger, it → it")              @Test void BigIntegerWith1ArgCallback()            { assertSame(ZERO_BIG_INTEGER,        getInstance().getOrElse(ZERO_BIG_INTEGER, it -> it)); }
            @DisplayName("0 BigDecimal, it → it")              @Test void BigDecimalWith1ArgCallback()            { assertSame(ZERO_BIG_DECIMAL,        getInstance().getOrElse(ZERO_BIG_DECIMAL, it -> it)); }
            @DisplayName("0 AtomicInteger, it → it")           @Test void AtomicIntegerWith1ArgCallback()         { assertSame(ZERO_ATOMIC_INTEGER,     getInstance().getOrElse(ZERO_ATOMIC_INTEGER, it -> it)); }
            @DisplayName("0 AtomicLong, it → it")              @Test void AtomicLongWith1ArgCallback()            { assertSame(ZERO_ATOMIC_LONG,        getInstance().getOrElse(ZERO_ATOMIC_LONG, it -> it)); }
            @DisplayName("0 LongAdder, it → it")               @Test void LongAdderWith1ArgCallback()             { assertSame(ZERO_LONG_ADDER,         getInstance().getOrElse(ZERO_LONG_ADDER, it -> it)); }
            @DisplayName("0 LongAccumulator, it → it")         @Test void LongAccumulatorWith1ArgCallback()       { assertSame(ZERO_LONG_ACCUMULATOR,   getInstance().getOrElse(ZERO_LONG_ACCUMULATOR, it -> it)); }
            @DisplayName("0 DoubleAdder, it → it")             @Test void DoubleAdderWith1ArgCallback()           { assertSame(ZERO_DOUBLE_ADDER,       getInstance().getOrElse(ZERO_DOUBLE_ADDER, it -> it)); }
            @DisplayName("0 DoubleAccumulator, it → it")       @Test void DoubleAccumulatorWith1ArgCallback()     { assertSame(ZERO_DOUBLE_ACCUMULATOR, getInstance().getOrElse(ZERO_DOUBLE_ACCUMULATOR, it -> it)); }
            @DisplayName("0 Number, it → it")                  @Test void NumberWith1ArgCallback()                { assertSame(ZERO_NUMBER,             getInstance().getOrElse(ZERO_NUMBER, it -> it)); }
            @DisplayName("null Byte, it → it")                 @Test void nullByteWith1ArgCallback()              { assertNull(                         getInstance().getOrElse(NULL_BYTE, it -> it)); }
            @DisplayName("null Short, it → it")                @Test void nullShortWith1ArgCallback()             { assertNull(                         getInstance().getOrElse(NULL_SHORT, it -> it)); }
            @DisplayName("null Integer, it → it")              @Test void nullIntegerWith1ArgCallback()           { assertNull(                         getInstance().getOrElse(NULL_INT, it -> it)); }
            @DisplayName("null Long, it → it")                 @Test void nullLongWith1ArgCallback()              { assertNull(                         getInstance().getOrElse(NULL_LONG, it -> it)); }
            @DisplayName("null Float, it → it")                @Test void nullFloatWith1ArgCallback()             { assertNull(                         getInstance().getOrElse(NULL_FLOAT, it -> it)); }
            @DisplayName("null Double, it → it")               @Test void nullDoubleWith1ArgCallback()            { assertNull(                         getInstance().getOrElse(NULL_DOUBLE, it -> it)); }
            @DisplayName("null BigInteger, it → it")           @Test void nullBigIntegerWith1ArgCallback()        { assertNull(                         getInstance().getOrElse(NULL_BIG_INTEGER, it -> it)); }
            @DisplayName("null BigDecimal, it → it")           @Test void nullBigDecimalWith1ArgCallback()        { assertNull(                         getInstance().getOrElse(NULL_BIG_DECIMAL, it -> it)); }
            @DisplayName("null AtomicInteger, it → it")        @Test void nullAtomicIntegerWith1ArgCallback()     { assertNull(                         getInstance().getOrElse(NULL_ATOMIC_INTEGER, it -> it)); }
            @DisplayName("null AtomicLong, it → it")           @Test void nullAtomicLongWith1ArgCallback()        { assertNull(                         getInstance().getOrElse(NULL_ATOMIC_LONG, it -> it)); }
            @DisplayName("null LongAdder, it → it")            @Test void nullLongAdderWith1ArgCallback()         { assertNull(                         getInstance().getOrElse(NULL_LONG_ADDER, it -> it)); }
            @DisplayName("null LongAccumulator, it → it")      @Test void nullLongAccumulatorWith1ArgCallback()   { assertNull(                         getInstance().getOrElse(NULL_LONG_ACCUMULATOR, it -> it)); }
            @DisplayName("null DoubleAdder, it → it")          @Test void nullDoubleAdderWith1ArgCallback()       { assertNull(                         getInstance().getOrElse(NULL_DOUBLE_ADDER, it -> it)); }
            @DisplayName("null DoubleAccumulator, it → it")    @Test void nullDoubleAccumulatorWith1ArgCallback() { assertNull(                         getInstance().getOrElse(NULL_DOUBLE_ACCUMULATOR, it -> it)); }
            @DisplayName("null Number, it → it")               @Test void nullNumberWith1ArgCallback()            { assertNull(                         getInstance().getOrElse(NULL_NUMBER, it -> it)); }

            @DisplayName("0 byte, () → null")                  @Test void testByteWith0ArgCallback()              { assertNull(                         instance     .getOrElse((byte) 0, () -> null)); }
            @DisplayName("0 short, () → null")                 @Test void testShortWith0ArgCallback()             { assertNull(                         instance     .getOrElse((short) 0, () -> null)); }
            @DisplayName("0 int, () → null")                   @Test void testIntWith0ArgCallback()               { assertNull(                         instance     .getOrElse(0, () -> null)); }
            @DisplayName("0 long, () → null")                  @Test void testLongWith0ArgCallback()              { assertNull(                         instance     .getOrElse(0L, () -> null)); }
            @DisplayName("0 float, () → null")                 @Test void testFloatWith0ArgCallback()             { assertNull(                         instance     .getOrElse(0.0F, () -> null)); }
            @DisplayName("0 double, () → null")                @Test void testDoubleWith0ArgCallback()            { assertNull(                         instance     .getOrElse(0.0D, () -> null)); }
            @DisplayName("null Byte, () → 0")                  @Test void ByteWith0ArgCallback()                  { assertSame(ZERO_BYTE,               getInstance().getOrElse(NULL_BYTE, () -> ZERO_BYTE)); }
            @DisplayName("null Short, () → 0")                 @Test void ShortWith0ArgCallback()                 { assertSame(ZERO_SHORT,              getInstance().getOrElse(NULL_SHORT, () -> ZERO_SHORT)); }
            @DisplayName("null Integer, () → 0")               @Test void IntegerWith0ArgCallback()               { assertSame(ZERO_INT,                getInstance().getOrElse(NULL_INT, () -> ZERO_INT)); }
            @DisplayName("null Long, () → 0")                  @Test void LongWith0ArgCallback()                  { assertSame(ZERO_LONG,               getInstance().getOrElse(NULL_LONG, () -> ZERO_LONG)); }
            @DisplayName("null Float, () → 0")                 @Test void FloatWith0ArgCallback()                 { assertSame(ZERO_FLOAT,              getInstance().getOrElse(NULL_FLOAT, () -> ZERO_FLOAT)); }
            @DisplayName("null Double, () → 0")                @Test void DoubleWith0ArgCallback()                { assertSame(ZERO_DOUBLE,             getInstance().getOrElse(NULL_DOUBLE, () -> ZERO_DOUBLE)); }
            @DisplayName("null BigInteger, () → 0")            @Test void BigIntegerWith0ArgCallback()            { assertSame(ZERO_BIG_INTEGER,        getInstance().getOrElse(NULL_BIG_INTEGER, () -> ZERO_BIG_INTEGER)); }
            @DisplayName("null BigDecimal, () → 0")            @Test void BigDecimalWith0ArgCallback()            { assertSame(ZERO_BIG_DECIMAL,        getInstance().getOrElse(NULL_BIG_DECIMAL, () -> ZERO_BIG_DECIMAL)); }
            @DisplayName("null AtomicInteger, () → empty")     @Test void AtomicIntegerWith0ArgCallback()         { assertSame(ZERO_ATOMIC_INTEGER,     getInstance().getOrElse(NULL_ATOMIC_INTEGER, () -> ZERO_ATOMIC_INTEGER)); }
            @DisplayName("null AtomicLong, () → empty")        @Test void AtomicLongWith0ArgCallback()            { assertSame(ZERO_ATOMIC_LONG,        getInstance().getOrElse(NULL_ATOMIC_LONG, () -> ZERO_ATOMIC_LONG)); }
            @DisplayName("null LongAdder, () → empty")         @Test void LongAdderWith0ArgCallback()             { assertSame(ZERO_LONG_ADDER,         getInstance().getOrElse(NULL_LONG_ADDER, () -> ZERO_LONG_ADDER)); }
            @DisplayName("null LongAccumulator, () → empty")   @Test void LongAccumulatorWith0ArgCallback()       { assertSame(ZERO_LONG_ACCUMULATOR,   getInstance().getOrElse(NULL_LONG_ACCUMULATOR, () -> ZERO_LONG_ACCUMULATOR)); }
            @DisplayName("null DoubleAdder, () → empty")       @Test void DoubleAdderWith0ArgCallback()           { assertSame(ZERO_DOUBLE_ADDER,       getInstance().getOrElse(NULL_DOUBLE_ADDER, () -> ZERO_DOUBLE_ADDER)); }
            @DisplayName("null DoubleAccumulator, () → empty") @Test void DoubleAccumulatorWith0ArgCallback()     { assertSame(ZERO_DOUBLE_ACCUMULATOR, getInstance().getOrElse(NULL_DOUBLE_ACCUMULATOR, () -> ZERO_DOUBLE_ACCUMULATOR)); }
            @DisplayName("null Number, () → 0")                @Test void NumberWith0ArgCallback()                { assertSame(ZERO_NUMBER,             getInstance().getOrElse(NULL_NUMBER, () -> ZERO_NUMBER)); }
        }
        @Nested class getFirstOrElse {
            @DisplayName("null")  @Test void testNull() { assertNull(instance.getFirstOrElse(() -> null));}
            @DisplayName("0")     @Test void test0()    { assertSame(ZERO_INT, getInstance().getFirstOrElse(() -> ZERO_INT));}
        }
        @Nested class getLastOrElse {
            @DisplayName("null")  @Test void testNull() { assertNull(instance.getLastOrElse(() -> null));}
            @DisplayName("0")     @Test void test0()    { assertSame(ZERO_INT, getInstance().getLastOrElse(() -> ZERO_INT));}
        }

        @Nested class getOrNull {
            @DisplayName("∅")           @Test void testEmpty()         { assertNull(instance.getOrNull()); }
            @DisplayName("null object") @Test void testNullObject()    { assertNull(instance.getOrNull(NULL_OBJECT)); }
            @DisplayName("null string") @Test void testNullString()    { assertNull(instance.getOrNull(NULL_STRING)); }
            @DisplayName("null []")     @Test void testNullArray()     { assertNull(instance.getOrNull(NULL_VARARGS)); }
            @DisplayName("byte")        @Test void testByte()          { assertNull(instance.getOrNull((byte) 0)); }
            @DisplayName("short")       @Test void testShort()         { assertNull(instance.getOrNull((short) 0)); }
            @DisplayName("int")         @Test void testInt()           { assertNull(instance.getOrNull(0)); }
            @DisplayName("long")        @Test void testLong()          { assertNull(instance.getOrNull(0L)); }
            @DisplayName("float")       @Test void testFloat()         { assertNull(instance.getOrNull(0.0F)); }
            @DisplayName("double")      @Test void testDouble()        { assertNull(instance.getOrNull(0.0D)); }
                                        @Test void Byte()              { assertNull(instance.getOrNull(NULL_BYTE)); }
                                        @Test void Short()             { assertNull(instance.getOrNull(NULL_SHORT)); }
                                        @Test void Integer()           { assertNull(instance.getOrNull(NULL_INT)); }
                                        @Test void Long()              { assertNull(instance.getOrNull(NULL_LONG)); }
                                        @Test void Float()             { assertNull(instance.getOrNull(NULL_FLOAT)); }
                                        @Test void Double()            { assertNull(instance.getOrNull(NULL_DOUBLE)); }
                                        @Test void BigInteger()        { assertNull(instance.getOrNull(NULL_BIG_INTEGER)); }
                                        @Test void BigDecimal()        { assertNull(instance.getOrNull(NULL_BIG_DECIMAL)); }
                                        @Test void AtomicInteger()     { assertNull(instance.getOrNull(NULL_ATOMIC_INTEGER)); }
                                        @Test void AtomicLong()        { assertNull(instance.getOrNull(NULL_ATOMIC_LONG)); }
                                        @Test void LongAdder()         { assertNull(instance.getOrNull(NULL_LONG_ADDER)); }
                                        @Test void LongAccumulator()   { assertNull(instance.getOrNull(NULL_LONG_ACCUMULATOR)); }
                                        @Test void DoubleAdder()       { assertNull(instance.getOrNull(NULL_DOUBLE_ADDER)); }
                                        @Test void DoubleAccumulator() { assertNull(instance.getOrNull(NULL_DOUBLE_ACCUMULATOR)); }
                                        @Test void Number()            { assertNull(instance.getOrNull(NULL_NUMBER)); }
            @DisplayName("[]")          @Test void testArray()         { assertNull(instance.getOrNull(EMPTY_ARRAY)); }
        }
        @Nested class getFirstOrNull {
            @DisplayName("∅")           @Test void testEmpty()      { assertNull(instance.getFirstOrNull()); }
            @DisplayName("null object") @Test void testNullObject() { assertNull(instance.getFirstOrNull(NULL_OBJECT)); }
            @DisplayName("null string") @Test void testNullString() { assertNull(instance.getFirstOrNull(NULL_STRING)); }
            @DisplayName("null array")  @Test void testNullArray()  { assertNull(instance.getFirstOrNull(NULL_VARARGS)); }
            @DisplayName("[]")          @Test void testArray()      { assertNull(instance.getFirstOrNull(EMPTY_ARRAY)); }
        }
        @Nested class getLastOrNull {
            @DisplayName("∅")           @Test void testEmpty()      { assertNull(instance.getLastOrNull()); }
            @DisplayName("null object") @Test void testNullObject() { assertNull(instance.getLastOrNull(NULL_OBJECT)); }
            @DisplayName("null string") @Test void testNullString() { assertNull(instance.getLastOrNull(NULL_STRING)); }
            @DisplayName("null array")  @Test void testNullArray()  { assertNull(instance.getLastOrNull(NULL_VARARGS)); }
            @DisplayName("[]")          @Test void testArray()      { assertNull(instance.getLastOrNull(EMPTY_ARRAY)); }
        }

        @Nested class first {
            @DisplayName("∅")                       @Test void testEmpty()        { assertThrowsExactly(EmptyCollectionException.class,      instance::first); }
            @DisplayName("null object")             @Test void testNullObject()   { assertThrowsExactly(EmptyCollectionException.class, () -> instance.first(NULL_OBJECT)); }
            @DisplayName("null string")             @Test void testNullString()   { assertThrowsExactly(EmptyCollectionException.class, () -> instance.first(NULL_STRING)); }
            @DisplayName("null (T, int) → boolean") @Test void test2ArgCallback() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.first(NULL_PREDICATE2)); }
            @DisplayName("null (T) → boolean")      @Test void test1ArgCallback() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.first(NULL_PREDICATE1)); }
            @DisplayName("null () → boolean")       @Test void test0ArgCallback() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.first(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.first(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.first(EMPTY_ARRAY)); }
        }
        @Nested class firstOrNull {
            @DisplayName("∅")                       @Test void testEmpty()        { assertNull(instance.firstOrNull()); }
            @DisplayName("null object")             @Test void testNullObject()   { assertNull(instance.firstOrNull(NULL_OBJECT)); }
            @DisplayName("null string")             @Test void testNullString()   { assertNull(instance.firstOrNull(NULL_STRING)); }
            @DisplayName("null (T, int) → boolean") @Test void test2ArgCallback() { assertNull(instance.firstOrNull(NULL_PREDICATE2)); }
            @DisplayName("null (T) → boolean")      @Test void test1ArgCallback() { assertNull(instance.firstOrNull(NULL_PREDICATE1)); }
            @DisplayName("null () → boolean")       @Test void test0ArgCallback() { assertNull(instance.firstOrNull(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray()    { assertNull(instance.firstOrNull(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()        { assertNull(instance.firstOrNull(EMPTY_ARRAY)); }
        }
        @Nested class firstIndexed {
            @DisplayName("∅")                       @Test void testEmpty()        { assertThrowsExactly(EmptyCollectionException.class,       instance::firstIndexed); }
            @DisplayName("null object")             @Test void testNullObject()   { assertThrowsExactly(EmptyCollectionException.class, () -> instance.firstIndexed(NULL_OBJECT)); }
            @DisplayName("null string")             @Test void testNullString()   { assertThrowsExactly(EmptyCollectionException.class, () -> instance.firstIndexed(NULL_STRING)); }
            @DisplayName("null (int, T) → boolean") @Test void test2ArgCallback() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.firstIndexed(NULL_PREDICATE2_ALT)); }
            @DisplayName("null (int) → boolean")    @Test void test1ArgCallback() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.firstIndexed(NULL_PREDICATE1_ALT)); }
            @DisplayName("null () → boolean")       @Test void test0ArgCallback() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.firstIndexed(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.firstIndexed(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.firstIndexed(EMPTY_ARRAY)); }
        }
        @Nested class firstIndexedOrNull {
            @DisplayName("∅")                       @Test void testEmpty()        { assertNull(instance.firstIndexedOrNull()); }
            @DisplayName("null object")             @Test void testNullObject()   { assertNull(instance.firstIndexedOrNull(NULL_OBJECT)); }
            @DisplayName("null string")             @Test void testNullString()   { assertNull(instance.firstIndexedOrNull(NULL_STRING)); }
            @DisplayName("null (int, T) → boolean") @Test void test2ArgCallback() { assertNull(instance.firstIndexedOrNull(NULL_PREDICATE2_ALT)); }
            @DisplayName("null (int) → boolean")    @Test void test1ArgCallback() { assertNull(instance.firstIndexedOrNull(NULL_PREDICATE1_ALT)); }
            @DisplayName("null () → boolean")       @Test void test0ArgCallback() { assertNull(instance.firstIndexedOrNull(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray()    { assertNull(instance.firstIndexedOrNull(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()        { assertNull(instance.firstIndexedOrNull(EMPTY_ARRAY)); }
        }

        @Nested class last {
            @DisplayName("∅")                       @Test void testEmpty()        { assertThrowsExactly(EmptyCollectionException.class,      instance::last); }
            @DisplayName("null object")             @Test void testNullObject()   { assertThrowsExactly(EmptyCollectionException.class, () -> instance.last(NULL_OBJECT)); }
            @DisplayName("null string")             @Test void testNullString()   { assertThrowsExactly(EmptyCollectionException.class, () -> instance.last(NULL_STRING)); }
            @DisplayName("null (T, int) → boolean") @Test void test2ArgCallback() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.last(NULL_PREDICATE2)); }
            @DisplayName("null (T) → boolean")      @Test void test1ArgCallback() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.last(NULL_PREDICATE1)); }
            @DisplayName("null () → boolean")       @Test void test0ArgCallback() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.last(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.last(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.last(EMPTY_ARRAY)); }
        }
        @Nested class lastOrNull {
            @DisplayName("∅")                       @Test void testEmpty()        { assertNull(instance.lastOrNull()); }
            @DisplayName("null object")             @Test void testNullObject()   { assertNull(instance.lastOrNull(NULL_OBJECT)); }
            @DisplayName("null string")             @Test void testNullString()   { assertNull(instance.lastOrNull(NULL_STRING)); }
            @DisplayName("null (T, int) → boolean") @Test void test2ArgCallback() { assertNull(instance.lastOrNull(NULL_PREDICATE2)); }
            @DisplayName("null (T) → boolean")      @Test void test1ArgCallback() { assertNull(instance.lastOrNull(NULL_PREDICATE1)); }
            @DisplayName("null () → boolean")       @Test void test0ArgCallback() { assertNull(instance.lastOrNull(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray()    { assertNull(instance.lastOrNull(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()        { assertNull(instance.lastOrNull(EMPTY_ARRAY)); }
        }
        @Nested class lastIndexed {
            @DisplayName("∅")                       @Test void testEmpty()        { assertThrowsExactly(EmptyCollectionException.class,      instance::lastIndexed); }
            @DisplayName("null object")             @Test void testNullObject()   { assertThrowsExactly(EmptyCollectionException.class, () -> instance.lastIndexed(NULL_OBJECT)); }
            @DisplayName("null string")             @Test void testNullString()   { assertThrowsExactly(EmptyCollectionException.class, () -> instance.lastIndexed(NULL_STRING)); }
            @DisplayName("null (int, T) → boolean") @Test void test2ArgCallback() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.lastIndexed(NULL_PREDICATE2_ALT)); }
            @DisplayName("null (int) → boolean")    @Test void test1ArgCallback() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.lastIndexed(NULL_PREDICATE1_ALT)); }
            @DisplayName("null () → boolean")       @Test void test0ArgCallback() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.lastIndexed(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.lastIndexed(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.lastIndexed(EMPTY_ARRAY)); }
        }
        @Nested class lastIndexedOrNull {
            @DisplayName("∅")                       @Test void testEmpty()        { assertNull(instance.lastIndexedOrNull()); }
            @DisplayName("null object")             @Test void testNullObject()   { assertNull(instance.lastIndexedOrNull(NULL_OBJECT)); }
            @DisplayName("null string")             @Test void testNullString()   { assertNull(instance.lastIndexedOrNull(NULL_STRING)); }
            @DisplayName("null (int, T) → boolean") @Test void test2ArgCallback() { assertNull(instance.lastIndexedOrNull(NULL_PREDICATE2_ALT)); }
            @DisplayName("null (int) → boolean")    @Test void test1ArgCallback() { assertNull(instance.lastIndexedOrNull(NULL_PREDICATE1_ALT)); }
            @DisplayName("null () → boolean")       @Test void test0ArgCallback() { assertNull(instance.lastIndexedOrNull(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray()    { assertNull(instance.lastIndexedOrNull(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()        { assertNull(instance.lastIndexedOrNull(EMPTY_ARRAY)); }
        }


        @Nested class at {
            @DisplayName("∅")           @Test void testEmpty()         { assertThrowsExactly(EmptyCollectionException.class,      instance::at); }
            @DisplayName("null object") @Test void testNullObject()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.at(NULL_OBJECT)); }
            @DisplayName("null string") @Test void testNullString()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.at(NULL_STRING)); }
            @DisplayName("null []")     @Test void testNullArray()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.at(NULL_VARARGS)); }
            @DisplayName("byte")        @Test void testByte()          { assertThrowsExactly(EmptyCollectionException.class, () -> instance.at((byte) 0)); }
            @DisplayName("short")       @Test void testShort()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.at((short) 0)); }
            @DisplayName("int")         @Test void testInt()           { assertThrowsExactly(EmptyCollectionException.class, () -> instance.at(0)); }
            @DisplayName("long")        @Test void testLong()          { assertThrowsExactly(EmptyCollectionException.class, () -> instance.at(0L)); }
            @DisplayName("float")       @Test void testFloat()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.at(0.0F)); }
            @DisplayName("double")      @Test void testDouble()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.at(0.0D)); }
                                        @Test void Byte()              { assertThrowsExactly(EmptyCollectionException.class, () -> instance.at(ZERO_BYTE)); }
                                        @Test void Short()             { assertThrowsExactly(EmptyCollectionException.class, () -> instance.at(ZERO_SHORT)); }
                                        @Test void Integer()           { assertThrowsExactly(EmptyCollectionException.class, () -> instance.at(ZERO_INT)); }
                                        @Test void Long()              { assertThrowsExactly(EmptyCollectionException.class, () -> instance.at(ZERO_LONG)); }
                                        @Test void Float()             { assertThrowsExactly(EmptyCollectionException.class, () -> instance.at(ZERO_FLOAT)); }
                                        @Test void Double()            { assertThrowsExactly(EmptyCollectionException.class, () -> instance.at(ZERO_DOUBLE)); }
                                        @Test void BigInteger()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.at(ZERO_BIG_INTEGER)); }
                                        @Test void BigDecimal()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.at(ZERO_BIG_DECIMAL)); }
                                        @Test void AtomicInteger()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.at(ZERO_ATOMIC_INTEGER)); }
                                        @Test void AtomicLong()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.at(ZERO_ATOMIC_LONG)); }
                                        @Test void LongAdder()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.at(ZERO_LONG_ADDER)); }
                                        @Test void LongAccumulator()   { assertThrowsExactly(EmptyCollectionException.class, () -> instance.at(ZERO_LONG_ACCUMULATOR)); }
                                        @Test void DoubleAdder()       { assertThrowsExactly(EmptyCollectionException.class, () -> instance.at(ZERO_DOUBLE_ADDER)); }
                                        @Test void DoubleAccumulator() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.at(ZERO_DOUBLE_ACCUMULATOR)); }
                                        @Test void Number()            { assertThrowsExactly(EmptyCollectionException.class, () -> instance.at(ZERO_NUMBER)); }
            @DisplayName("[]")          @Test void testArray()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.at(EMPTY_ARRAY)); }
        }
        @Nested class elementAt {
            @DisplayName("∅")           @Test void testEmpty()         { assertThrowsExactly(EmptyCollectionException.class,      instance::elementAt); }
            @DisplayName("null object") @Test void testNullObject()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.elementAt(NULL_OBJECT)); }
            @DisplayName("null string") @Test void testNullString()    { assertThrowsExactly(EmptyCollectionException.class, () -> instance.elementAt(NULL_STRING)); }
            @DisplayName("null []")     @Test void testNullArray()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.elementAt(NULL_VARARGS)); }
            @DisplayName("byte")        @Test void testByte()          { assertThrowsExactly(EmptyCollectionException.class, () -> instance.elementAt((byte) 0)); }
            @DisplayName("short")       @Test void testShort()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.elementAt((short) 0)); }
            @DisplayName("int")         @Test void testInt()           { assertThrowsExactly(EmptyCollectionException.class, () -> instance.elementAt(0)); }
            @DisplayName("long")        @Test void testLong()          { assertThrowsExactly(EmptyCollectionException.class, () -> instance.elementAt(0L)); }
            @DisplayName("float")       @Test void testFloat()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.elementAt(0.0F)); }
            @DisplayName("double")      @Test void testDouble()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.elementAt(0.0D)); }
                                        @Test void Byte()              { assertThrowsExactly(EmptyCollectionException.class, () -> instance.elementAt(ZERO_BYTE)); }
                                        @Test void Short()             { assertThrowsExactly(EmptyCollectionException.class, () -> instance.elementAt(ZERO_SHORT)); }
                                        @Test void Integer()           { assertThrowsExactly(EmptyCollectionException.class, () -> instance.elementAt(ZERO_INT)); }
                                        @Test void Long()              { assertThrowsExactly(EmptyCollectionException.class, () -> instance.elementAt(ZERO_LONG)); }
                                        @Test void Float()             { assertThrowsExactly(EmptyCollectionException.class, () -> instance.elementAt(ZERO_FLOAT)); }
                                        @Test void Double()            { assertThrowsExactly(EmptyCollectionException.class, () -> instance.elementAt(ZERO_DOUBLE)); }
                                        @Test void BigInteger()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.elementAt(ZERO_BIG_INTEGER)); }
                                        @Test void BigDecimal()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.elementAt(ZERO_BIG_DECIMAL)); }
                                        @Test void AtomicInteger()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.elementAt(ZERO_ATOMIC_INTEGER)); }
                                        @Test void AtomicLong()        { assertThrowsExactly(EmptyCollectionException.class, () -> instance.elementAt(ZERO_ATOMIC_LONG)); }
                                        @Test void LongAdder()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.elementAt(ZERO_LONG_ADDER)); }
                                        @Test void LongAccumulator()   { assertThrowsExactly(EmptyCollectionException.class, () -> instance.elementAt(ZERO_LONG_ACCUMULATOR)); }
                                        @Test void DoubleAdder()       { assertThrowsExactly(EmptyCollectionException.class, () -> instance.elementAt(ZERO_DOUBLE_ADDER)); }
                                        @Test void DoubleAccumulator() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.elementAt(ZERO_DOUBLE_ACCUMULATOR)); }
                                        @Test void Number()            { assertThrowsExactly(EmptyCollectionException.class, () -> instance.elementAt(ZERO_NUMBER)); }
            @DisplayName("[]")          @Test void testArray()         { assertThrowsExactly(EmptyCollectionException.class, () -> instance.elementAt(EMPTY_ARRAY)); }
        }

        @Nested class atOrElse {
            @DisplayName("0 byte, it → it")                    @Test void testByteWith1ArgCallback()              { assertEquals("0",                   getInstance().atOrElse((byte) 0, (IntFunction<?>) String::valueOf)); }
            @DisplayName("0 short, it → it")                   @Test void testShortWith1ArgCallback()             { assertEquals("0",                   getInstance().atOrElse((short) 0, (IntFunction<?>) String::valueOf)); }
            @DisplayName("0 int, it → it")                     @Test void testIntWith1ArgCallback()               { assertEquals("0",                   getInstance().atOrElse(0, (IntFunction<?>) String::valueOf)); }
            @DisplayName("0 long, it → it")                    @Test void testLongWith1ArgCallback()              { assertEquals("0",                   getInstance().atOrElse(0L, (LongFunction<?>) String::valueOf)); }
            @DisplayName("0 float, it → it")                   @Test void testFloatWith1ArgCallback()             { assertEquals("0.0",                 getInstance().atOrElse(0.0F, (DoubleFunction<?>) String::valueOf)); }
            @DisplayName("0 double, it → it")                  @Test void testDoubleWith1ArgCallback()            { assertEquals("0.0",                 getInstance().atOrElse(0.0D, (DoubleFunction<?>) String::valueOf)); }
            @DisplayName("0 Byte, it → it")                    @Test void ByteWith1ArgCallback()                  { assertSame(ZERO_BYTE,               getInstance().atOrElse(ZERO_BYTE, it -> it)); }
            @DisplayName("0 Short, it → it")                   @Test void ShortWith1ArgCallback()                 { assertSame(ZERO_SHORT,              getInstance().atOrElse(ZERO_SHORT, it -> it)); }
            @DisplayName("0 Integer, it → it")                 @Test void IntegerWith1ArgCallback()               { assertSame(ZERO_INT,                getInstance().atOrElse(ZERO_INT, it -> it)); }
            @DisplayName("0 Long, it → it")                    @Test void LongWith1ArgCallback()                  { assertSame(ZERO_LONG,               getInstance().atOrElse(ZERO_LONG, it -> it)); }
            @DisplayName("0 Float, it → it")                   @Test void FloatWith1ArgCallback()                 { assertSame(ZERO_FLOAT,              getInstance().atOrElse(ZERO_FLOAT, it -> it)); }
            @DisplayName("0 Double, it → it")                  @Test void DoubleWith1ArgCallback()                { assertSame(ZERO_DOUBLE,             getInstance().atOrElse(ZERO_DOUBLE, it -> it)); }
            @DisplayName("0 BigInteger, it → it")              @Test void BigIntegerWith1ArgCallback()            { assertSame(ZERO_BIG_INTEGER,        getInstance().atOrElse(ZERO_BIG_INTEGER, it -> it)); }
            @DisplayName("0 BigDecimal, it → it")              @Test void BigDecimalWith1ArgCallback()            { assertSame(ZERO_BIG_DECIMAL,        getInstance().atOrElse(ZERO_BIG_DECIMAL, it -> it)); }
            @DisplayName("0 AtomicInteger, it → it")           @Test void AtomicIntegerWith1ArgCallback()         { assertSame(ZERO_ATOMIC_INTEGER,     getInstance().atOrElse(ZERO_ATOMIC_INTEGER, it -> it)); }
            @DisplayName("0 AtomicLong, it → it")              @Test void AtomicLongWith1ArgCallback()            { assertSame(ZERO_ATOMIC_LONG,        getInstance().atOrElse(ZERO_ATOMIC_LONG, it -> it)); }
            @DisplayName("0 LongAdder, it → it")               @Test void LongAdderWith1ArgCallback()             { assertSame(ZERO_LONG_ADDER,         getInstance().atOrElse(ZERO_LONG_ADDER, it -> it)); }
            @DisplayName("0 LongAccumulator, it → it")         @Test void LongAccumulatorWith1ArgCallback()       { assertSame(ZERO_LONG_ACCUMULATOR,   getInstance().atOrElse(ZERO_LONG_ACCUMULATOR, it -> it)); }
            @DisplayName("0 DoubleAdder, it → it")             @Test void DoubleAdderWith1ArgCallback()           { assertSame(ZERO_DOUBLE_ADDER,       getInstance().atOrElse(ZERO_DOUBLE_ADDER, it -> it)); }
            @DisplayName("0 DoubleAccumulator, it → it")       @Test void DoubleAccumulatorWith1ArgCallback()     { assertSame(ZERO_DOUBLE_ACCUMULATOR, getInstance().atOrElse(ZERO_DOUBLE_ACCUMULATOR, it -> it)); }
            @DisplayName("0 Number, it → it")                  @Test void NumberWith1ArgCallback()                { assertSame(ZERO_NUMBER,             getInstance().atOrElse(ZERO_NUMBER, it -> it)); }
            @DisplayName("null Byte, it → it")                 @Test void nullByteWith1ArgCallback()              { assertNull(                         getInstance().atOrElse(NULL_BYTE, it -> it)); }
            @DisplayName("null Short, it → it")                @Test void nullShortWith1ArgCallback()             { assertNull(                         getInstance().atOrElse(NULL_SHORT, it -> it)); }
            @DisplayName("null Integer, it → it")              @Test void nullIntegerWith1ArgCallback()           { assertNull(                         getInstance().atOrElse(NULL_INT, it -> it)); }
            @DisplayName("null Long, it → it")                 @Test void nullLongWith1ArgCallback()              { assertNull(                         getInstance().atOrElse(NULL_LONG, it -> it)); }
            @DisplayName("null Float, it → it")                @Test void nullFloatWith1ArgCallback()             { assertNull(                         getInstance().atOrElse(NULL_FLOAT, it -> it)); }
            @DisplayName("null Double, it → it")               @Test void nullDoubleWith1ArgCallback()            { assertNull(                         getInstance().atOrElse(NULL_DOUBLE, it -> it)); }
            @DisplayName("null BigInteger, it → it")           @Test void nullBigIntegerWith1ArgCallback()        { assertNull(                         getInstance().atOrElse(NULL_BIG_INTEGER, it -> it)); }
            @DisplayName("null BigDecimal, it → it")           @Test void nullBigDecimalWith1ArgCallback()        { assertNull(                         getInstance().atOrElse(NULL_BIG_DECIMAL, it -> it)); }
            @DisplayName("null AtomicInteger, it → it")        @Test void nullAtomicIntegerWith1ArgCallback()     { assertNull(                         getInstance().atOrElse(NULL_ATOMIC_INTEGER, it -> it)); }
            @DisplayName("null AtomicLong, it → it")           @Test void nullAtomicLongWith1ArgCallback()        { assertNull(                         getInstance().atOrElse(NULL_ATOMIC_LONG, it -> it)); }
            @DisplayName("null LongAdder, it → it")            @Test void nullLongAdderWith1ArgCallback()         { assertNull(                         getInstance().atOrElse(NULL_LONG_ADDER, it -> it)); }
            @DisplayName("null LongAccumulator, it → it")      @Test void nullLongAccumulatorWith1ArgCallback()   { assertNull(                         getInstance().atOrElse(NULL_LONG_ACCUMULATOR, it -> it)); }
            @DisplayName("null DoubleAdder, it → it")          @Test void nullDoubleAdderWith1ArgCallback()       { assertNull(                         getInstance().atOrElse(NULL_DOUBLE_ADDER, it -> it)); }
            @DisplayName("null DoubleAccumulator, it → it")    @Test void nullDoubleAccumulatorWith1ArgCallback() { assertNull(                         getInstance().atOrElse(NULL_DOUBLE_ACCUMULATOR, it -> it)); }
            @DisplayName("null Number, it → it")               @Test void nullNumberWith1ArgCallback()            { assertNull(                         getInstance().atOrElse(NULL_NUMBER, it -> it)); }

            @DisplayName("0 byte, () → null")                  @Test void testByteWith0ArgCallback()              { assertNull(                         instance     .atOrElse((byte) 0, () -> null)); }
            @DisplayName("0 short, () → null")                 @Test void testShortWith0ArgCallback()             { assertNull(                         instance     .atOrElse((short) 0, () -> null)); }
            @DisplayName("0 int, () → null")                   @Test void testIntWith0ArgCallback()               { assertNull(                         instance     .atOrElse(0, () -> null)); }
            @DisplayName("0 long, () → null")                  @Test void testLongWith0ArgCallback()              { assertNull(                         instance     .atOrElse(0L, () -> null)); }
            @DisplayName("0 float, () → null")                 @Test void testFloatWith0ArgCallback()             { assertNull(                         instance     .atOrElse(0.0F, () -> null)); }
            @DisplayName("0 double, () → null")                @Test void testDoubleWith0ArgCallback()            { assertNull(                         instance     .atOrElse(0.0D, () -> null)); }
            @DisplayName("null Byte, () → 0")                  @Test void ByteWith0ArgCallback()                  { assertSame(ZERO_BYTE,               getInstance().atOrElse(NULL_BYTE, () -> ZERO_BYTE)); }
            @DisplayName("null Short, () → 0")                 @Test void ShortWith0ArgCallback()                 { assertSame(ZERO_SHORT,              getInstance().atOrElse(NULL_SHORT, () -> ZERO_SHORT)); }
            @DisplayName("null Integer, () → 0")               @Test void IntegerWith0ArgCallback()               { assertSame(ZERO_INT,                getInstance().atOrElse(NULL_INT, () -> ZERO_INT)); }
            @DisplayName("null Long, () → 0")                  @Test void LongWith0ArgCallback()                  { assertSame(ZERO_LONG,               getInstance().atOrElse(NULL_LONG, () -> ZERO_LONG)); }
            @DisplayName("null Float, () → 0")                 @Test void FloatWith0ArgCallback()                 { assertSame(ZERO_FLOAT,              getInstance().atOrElse(NULL_FLOAT, () -> ZERO_FLOAT)); }
            @DisplayName("null Double, () → 0")                @Test void DoubleWith0ArgCallback()                { assertSame(ZERO_DOUBLE,             getInstance().atOrElse(NULL_DOUBLE, () -> ZERO_DOUBLE)); }
            @DisplayName("null BigInteger, () → 0")            @Test void BigIntegerWith0ArgCallback()            { assertSame(ZERO_BIG_INTEGER,        getInstance().atOrElse(NULL_BIG_INTEGER, () -> ZERO_BIG_INTEGER)); }
            @DisplayName("null BigDecimal, () → 0")            @Test void BigDecimalWith0ArgCallback()            { assertSame(ZERO_BIG_DECIMAL,        getInstance().atOrElse(NULL_BIG_DECIMAL, () -> ZERO_BIG_DECIMAL)); }
            @DisplayName("null AtomicInteger, () → empty")     @Test void AtomicIntegerWith0ArgCallback()         { assertSame(ZERO_ATOMIC_INTEGER,     getInstance().atOrElse(NULL_ATOMIC_INTEGER, () -> ZERO_ATOMIC_INTEGER)); }
            @DisplayName("null AtomicLong, () → empty")        @Test void AtomicLongWith0ArgCallback()            { assertSame(ZERO_ATOMIC_LONG,        getInstance().atOrElse(NULL_ATOMIC_LONG, () -> ZERO_ATOMIC_LONG)); }
            @DisplayName("null LongAdder, () → empty")         @Test void LongAdderWith0ArgCallback()             { assertSame(ZERO_LONG_ADDER,         getInstance().atOrElse(NULL_LONG_ADDER, () -> ZERO_LONG_ADDER)); }
            @DisplayName("null LongAccumulator, () → empty")   @Test void LongAccumulatorWith0ArgCallback()       { assertSame(ZERO_LONG_ACCUMULATOR,   getInstance().atOrElse(NULL_LONG_ACCUMULATOR, () -> ZERO_LONG_ACCUMULATOR)); }
            @DisplayName("null DoubleAdder, () → empty")       @Test void DoubleAdderWith0ArgCallback()           { assertSame(ZERO_DOUBLE_ADDER,       getInstance().atOrElse(NULL_DOUBLE_ADDER, () -> ZERO_DOUBLE_ADDER)); }
            @DisplayName("null DoubleAccumulator, () → empty") @Test void DoubleAccumulatorWith0ArgCallback()     { assertSame(ZERO_DOUBLE_ACCUMULATOR, getInstance().atOrElse(NULL_DOUBLE_ACCUMULATOR, () -> ZERO_DOUBLE_ACCUMULATOR)); }
            @DisplayName("null Number, () → 0")                @Test void NumberWith0ArgCallback()                { assertSame(ZERO_NUMBER,             getInstance().atOrElse(NULL_NUMBER, () -> ZERO_NUMBER)); }
        }
        @Nested class elementAtOrElse {
            @DisplayName("0 byte, it → it")                    @Test void testByteWith1ArgCallback()              { assertEquals("0",                   getInstance().elementAtOrElse((byte) 0, (IntFunction<?>) String::valueOf)); }
            @DisplayName("0 short, it → it")                   @Test void testShortWith1ArgCallback()             { assertEquals("0",                   getInstance().elementAtOrElse((short) 0, (IntFunction<?>) String::valueOf)); }
            @DisplayName("0 int, it → it")                     @Test void testIntWith1ArgCallback()               { assertEquals("0",                   getInstance().elementAtOrElse(0, (IntFunction<?>) String::valueOf)); }
            @DisplayName("0 long, it → it")                    @Test void testLongWith1ArgCallback()              { assertEquals("0",                   getInstance().elementAtOrElse(0L, (LongFunction<?>) String::valueOf)); }
            @DisplayName("0 float, it → it")                   @Test void testFloatWith1ArgCallback()             { assertEquals("0.0",                 getInstance().elementAtOrElse(0.0F, (DoubleFunction<?>) String::valueOf)); }
            @DisplayName("0 double, it → it")                  @Test void testDoubleWith1ArgCallback()            { assertEquals("0.0",                 getInstance().elementAtOrElse(0.0D, (DoubleFunction<?>) String::valueOf)); }
            @DisplayName("0 Byte, it → it")                    @Test void ByteWith1ArgCallback()                  { assertSame(ZERO_BYTE,               getInstance().elementAtOrElse(ZERO_BYTE, it -> it)); }
            @DisplayName("0 Short, it → it")                   @Test void ShortWith1ArgCallback()                 { assertSame(ZERO_SHORT,              getInstance().elementAtOrElse(ZERO_SHORT, it -> it)); }
            @DisplayName("0 Integer, it → it")                 @Test void IntegerWith1ArgCallback()               { assertSame(ZERO_INT,                getInstance().elementAtOrElse(ZERO_INT, it -> it)); }
            @DisplayName("0 Long, it → it")                    @Test void LongWith1ArgCallback()                  { assertSame(ZERO_LONG,               getInstance().elementAtOrElse(ZERO_LONG, it -> it)); }
            @DisplayName("0 Float, it → it")                   @Test void FloatWith1ArgCallback()                 { assertSame(ZERO_FLOAT,              getInstance().elementAtOrElse(ZERO_FLOAT, it -> it)); }
            @DisplayName("0 Double, it → it")                  @Test void DoubleWith1ArgCallback()                { assertSame(ZERO_DOUBLE,             getInstance().elementAtOrElse(ZERO_DOUBLE, it -> it)); }
            @DisplayName("0 BigInteger, it → it")              @Test void BigIntegerWith1ArgCallback()            { assertSame(ZERO_BIG_INTEGER,        getInstance().elementAtOrElse(ZERO_BIG_INTEGER, it -> it)); }
            @DisplayName("0 BigDecimal, it → it")              @Test void BigDecimalWith1ArgCallback()            { assertSame(ZERO_BIG_DECIMAL,        getInstance().elementAtOrElse(ZERO_BIG_DECIMAL, it -> it)); }
            @DisplayName("0 AtomicInteger, it → it")           @Test void AtomicIntegerWith1ArgCallback()         { assertSame(ZERO_ATOMIC_INTEGER,     getInstance().elementAtOrElse(ZERO_ATOMIC_INTEGER, it -> it)); }
            @DisplayName("0 AtomicLong, it → it")              @Test void AtomicLongWith1ArgCallback()            { assertSame(ZERO_ATOMIC_LONG,        getInstance().elementAtOrElse(ZERO_ATOMIC_LONG, it -> it)); }
            @DisplayName("0 LongAdder, it → it")               @Test void LongAdderWith1ArgCallback()             { assertSame(ZERO_LONG_ADDER,         getInstance().elementAtOrElse(ZERO_LONG_ADDER, it -> it)); }
            @DisplayName("0 LongAccumulator, it → it")         @Test void LongAccumulatorWith1ArgCallback()       { assertSame(ZERO_LONG_ACCUMULATOR,   getInstance().elementAtOrElse(ZERO_LONG_ACCUMULATOR, it -> it)); }
            @DisplayName("0 DoubleAdder, it → it")             @Test void DoubleAdderWith1ArgCallback()           { assertSame(ZERO_DOUBLE_ADDER,       getInstance().elementAtOrElse(ZERO_DOUBLE_ADDER, it -> it)); }
            @DisplayName("0 DoubleAccumulator, it → it")       @Test void DoubleAccumulatorWith1ArgCallback()     { assertSame(ZERO_DOUBLE_ACCUMULATOR, getInstance().elementAtOrElse(ZERO_DOUBLE_ACCUMULATOR, it -> it)); }
            @DisplayName("0 Number, it → it")                  @Test void NumberWith1ArgCallback()                { assertSame(ZERO_NUMBER,             getInstance().elementAtOrElse(ZERO_NUMBER, it -> it)); }
            @DisplayName("null Byte, it → it")                 @Test void nullByteWith1ArgCallback()              { assertNull(                         getInstance().elementAtOrElse(NULL_BYTE, it -> it)); }
            @DisplayName("null Short, it → it")                @Test void nullShortWith1ArgCallback()             { assertNull(                         getInstance().elementAtOrElse(NULL_SHORT, it -> it)); }
            @DisplayName("null Integer, it → it")              @Test void nullIntegerWith1ArgCallback()           { assertNull(                         getInstance().elementAtOrElse(NULL_INT, it -> it)); }
            @DisplayName("null Long, it → it")                 @Test void nullLongWith1ArgCallback()              { assertNull(                         getInstance().elementAtOrElse(NULL_LONG, it -> it)); }
            @DisplayName("null Float, it → it")                @Test void nullFloatWith1ArgCallback()             { assertNull(                         getInstance().elementAtOrElse(NULL_FLOAT, it -> it)); }
            @DisplayName("null Double, it → it")               @Test void nullDoubleWith1ArgCallback()            { assertNull(                         getInstance().elementAtOrElse(NULL_DOUBLE, it -> it)); }
            @DisplayName("null BigInteger, it → it")           @Test void nullBigIntegerWith1ArgCallback()        { assertNull(                         getInstance().elementAtOrElse(NULL_BIG_INTEGER, it -> it)); }
            @DisplayName("null BigDecimal, it → it")           @Test void nullBigDecimalWith1ArgCallback()        { assertNull(                         getInstance().elementAtOrElse(NULL_BIG_DECIMAL, it -> it)); }
            @DisplayName("null AtomicInteger, it → it")        @Test void nullAtomicIntegerWith1ArgCallback()     { assertNull(                         getInstance().elementAtOrElse(NULL_ATOMIC_INTEGER, it -> it)); }
            @DisplayName("null AtomicLong, it → it")           @Test void nullAtomicLongWith1ArgCallback()        { assertNull(                         getInstance().elementAtOrElse(NULL_ATOMIC_LONG, it -> it)); }
            @DisplayName("null LongAdder, it → it")            @Test void nullLongAdderWith1ArgCallback()         { assertNull(                         getInstance().elementAtOrElse(NULL_LONG_ADDER, it -> it)); }
            @DisplayName("null LongAccumulator, it → it")      @Test void nullLongAccumulatorWith1ArgCallback()   { assertNull(                         getInstance().elementAtOrElse(NULL_LONG_ACCUMULATOR, it -> it)); }
            @DisplayName("null DoubleAdder, it → it")          @Test void nullDoubleAdderWith1ArgCallback()       { assertNull(                         getInstance().elementAtOrElse(NULL_DOUBLE_ADDER, it -> it)); }
            @DisplayName("null DoubleAccumulator, it → it")    @Test void nullDoubleAccumulatorWith1ArgCallback() { assertNull(                         getInstance().elementAtOrElse(NULL_DOUBLE_ACCUMULATOR, it -> it)); }
            @DisplayName("null Number, it → it")               @Test void nullNumberWith1ArgCallback()            { assertNull(                         getInstance().elementAtOrElse(NULL_NUMBER, it -> it)); }

            @DisplayName("0 byte, () → null")                  @Test void testByteWith0ArgCallback()              { assertNull(                         instance     .elementAtOrElse((byte) 0, () -> null)); }
            @DisplayName("0 short, () → null")                 @Test void testShortWith0ArgCallback()             { assertNull(                         instance     .elementAtOrElse((short) 0, () -> null)); }
            @DisplayName("0 int, () → null")                   @Test void testIntWith0ArgCallback()               { assertNull(                         instance     .elementAtOrElse(0, () -> null)); }
            @DisplayName("0 long, () → null")                  @Test void testLongWith0ArgCallback()              { assertNull(                         instance     .elementAtOrElse(0L, () -> null)); }
            @DisplayName("0 float, () → null")                 @Test void testFloatWith0ArgCallback()             { assertNull(                         instance     .elementAtOrElse(0.0F, () -> null)); }
            @DisplayName("0 double, () → null")                @Test void testDoubleWith0ArgCallback()            { assertNull(                         instance     .elementAtOrElse(0.0D, () -> null)); }
            @DisplayName("null Byte, () → 0")                  @Test void ByteWith0ArgCallback()                  { assertSame(ZERO_BYTE,               getInstance().elementAtOrElse(NULL_BYTE, () -> ZERO_BYTE)); }
            @DisplayName("null Short, () → 0")                 @Test void ShortWith0ArgCallback()                 { assertSame(ZERO_SHORT,              getInstance().elementAtOrElse(NULL_SHORT, () -> ZERO_SHORT)); }
            @DisplayName("null Integer, () → 0")               @Test void IntegerWith0ArgCallback()               { assertSame(ZERO_INT,                getInstance().elementAtOrElse(NULL_INT, () -> ZERO_INT)); }
            @DisplayName("null Long, () → 0")                  @Test void LongWith0ArgCallback()                  { assertSame(ZERO_LONG,               getInstance().elementAtOrElse(NULL_LONG, () -> ZERO_LONG)); }
            @DisplayName("null Float, () → 0")                 @Test void FloatWith0ArgCallback()                 { assertSame(ZERO_FLOAT,              getInstance().elementAtOrElse(NULL_FLOAT, () -> ZERO_FLOAT)); }
            @DisplayName("null Double, () → 0")                @Test void DoubleWith0ArgCallback()                { assertSame(ZERO_DOUBLE,             getInstance().elementAtOrElse(NULL_DOUBLE, () -> ZERO_DOUBLE)); }
            @DisplayName("null BigInteger, () → 0")            @Test void BigIntegerWith0ArgCallback()            { assertSame(ZERO_BIG_INTEGER,        getInstance().elementAtOrElse(NULL_BIG_INTEGER, () -> ZERO_BIG_INTEGER)); }
            @DisplayName("null BigDecimal, () → 0")            @Test void BigDecimalWith0ArgCallback()            { assertSame(ZERO_BIG_DECIMAL,        getInstance().elementAtOrElse(NULL_BIG_DECIMAL, () -> ZERO_BIG_DECIMAL)); }
            @DisplayName("null AtomicInteger, () → empty")     @Test void AtomicIntegerWith0ArgCallback()         { assertSame(ZERO_ATOMIC_INTEGER,     getInstance().elementAtOrElse(NULL_ATOMIC_INTEGER, () -> ZERO_ATOMIC_INTEGER)); }
            @DisplayName("null AtomicLong, () → empty")        @Test void AtomicLongWith0ArgCallback()            { assertSame(ZERO_ATOMIC_LONG,        getInstance().elementAtOrElse(NULL_ATOMIC_LONG, () -> ZERO_ATOMIC_LONG)); }
            @DisplayName("null LongAdder, () → empty")         @Test void LongAdderWith0ArgCallback()             { assertSame(ZERO_LONG_ADDER,         getInstance().elementAtOrElse(NULL_LONG_ADDER, () -> ZERO_LONG_ADDER)); }
            @DisplayName("null LongAccumulator, () → empty")   @Test void LongAccumulatorWith0ArgCallback()       { assertSame(ZERO_LONG_ACCUMULATOR,   getInstance().elementAtOrElse(NULL_LONG_ACCUMULATOR, () -> ZERO_LONG_ACCUMULATOR)); }
            @DisplayName("null DoubleAdder, () → empty")       @Test void DoubleAdderWith0ArgCallback()           { assertSame(ZERO_DOUBLE_ADDER,       getInstance().elementAtOrElse(NULL_DOUBLE_ADDER, () -> ZERO_DOUBLE_ADDER)); }
            @DisplayName("null DoubleAccumulator, () → empty") @Test void DoubleAccumulatorWith0ArgCallback()     { assertSame(ZERO_DOUBLE_ACCUMULATOR, getInstance().elementAtOrElse(NULL_DOUBLE_ACCUMULATOR, () -> ZERO_DOUBLE_ACCUMULATOR)); }
            @DisplayName("null Number, () → 0")                @Test void NumberWith0ArgCallback()                { assertSame(ZERO_NUMBER,             getInstance().elementAtOrElse(NULL_NUMBER, () -> ZERO_NUMBER)); }
        }

        @Nested class atOrNull {
            @DisplayName("∅")           @Test void testEmpty()         { assertNull(instance.atOrNull()); }
            @DisplayName("null object") @Test void testNullObject()    { assertNull(instance.atOrNull(NULL_OBJECT)); }
            @DisplayName("null string") @Test void testNullString()    { assertNull(instance.atOrNull(NULL_STRING)); }
            @DisplayName("null []")     @Test void testNullArray()     { assertNull(instance.atOrNull(NULL_VARARGS)); }
            @DisplayName("byte")        @Test void testByte()          { assertNull(instance.atOrNull((byte) 0)); }
            @DisplayName("short")       @Test void testShort()         { assertNull(instance.atOrNull((short) 0)); }
            @DisplayName("int")         @Test void testInt()           { assertNull(instance.atOrNull(0)); }
            @DisplayName("long")        @Test void testLong()          { assertNull(instance.atOrNull(0L)); }
            @DisplayName("float")       @Test void testFloat()         { assertNull(instance.atOrNull(0.0F)); }
            @DisplayName("double")      @Test void testDouble()        { assertNull(instance.atOrNull(0.0D)); }
                                        @Test void Byte()              { assertNull(instance.atOrNull(NULL_BYTE)); }
                                        @Test void Short()             { assertNull(instance.atOrNull(NULL_SHORT)); }
                                        @Test void Integer()           { assertNull(instance.atOrNull(NULL_INT)); }
                                        @Test void Long()              { assertNull(instance.atOrNull(NULL_LONG)); }
                                        @Test void Float()             { assertNull(instance.atOrNull(NULL_FLOAT)); }
                                        @Test void Double()            { assertNull(instance.atOrNull(NULL_DOUBLE)); }
                                        @Test void BigInteger()        { assertNull(instance.atOrNull(NULL_BIG_INTEGER)); }
                                        @Test void BigDecimal()        { assertNull(instance.atOrNull(NULL_BIG_DECIMAL)); }
                                        @Test void AtomicInteger()     { assertNull(instance.atOrNull(NULL_ATOMIC_INTEGER)); }
                                        @Test void AtomicLong()        { assertNull(instance.atOrNull(NULL_ATOMIC_LONG)); }
                                        @Test void LongAdder()         { assertNull(instance.atOrNull(NULL_LONG_ADDER)); }
                                        @Test void LongAccumulator()   { assertNull(instance.atOrNull(NULL_LONG_ACCUMULATOR)); }
                                        @Test void DoubleAdder()       { assertNull(instance.atOrNull(NULL_DOUBLE_ADDER)); }
                                        @Test void DoubleAccumulator() { assertNull(instance.atOrNull(NULL_DOUBLE_ACCUMULATOR)); }
                                        @Test void Number()            { assertNull(instance.atOrNull(NULL_NUMBER)); }
            @DisplayName("[]")          @Test void testArray()         { assertNull(instance.atOrNull(EMPTY_ARRAY)); }
        }
        @Nested class elementAtOrNull {
            @DisplayName("∅")           @Test void testEmpty()         { assertNull(instance.elementAtOrNull()); }
            @DisplayName("null object") @Test void testNullObject()    { assertNull(instance.elementAtOrNull(NULL_OBJECT)); }
            @DisplayName("null string") @Test void testNullString()    { assertNull(instance.elementAtOrNull(NULL_STRING)); }
            @DisplayName("null []")     @Test void testNullArray()     { assertNull(instance.elementAtOrNull(NULL_VARARGS)); }
            @DisplayName("byte")        @Test void testByte()          { assertNull(instance.elementAtOrNull((byte) 0)); }
            @DisplayName("short")       @Test void testShort()         { assertNull(instance.elementAtOrNull((short) 0)); }
            @DisplayName("int")         @Test void testInt()           { assertNull(instance.elementAtOrNull(0)); }
            @DisplayName("long")        @Test void testLong()          { assertNull(instance.elementAtOrNull(0L)); }
            @DisplayName("float")       @Test void testFloat()         { assertNull(instance.elementAtOrNull(0.0F)); }
            @DisplayName("double")      @Test void testDouble()        { assertNull(instance.elementAtOrNull(0.0D)); }
                                        @Test void Byte()              { assertNull(instance.elementAtOrNull(NULL_BYTE)); }
                                        @Test void Short()             { assertNull(instance.elementAtOrNull(NULL_SHORT)); }
                                        @Test void Integer()           { assertNull(instance.elementAtOrNull(NULL_INT)); }
                                        @Test void Long()              { assertNull(instance.elementAtOrNull(NULL_LONG)); }
                                        @Test void Float()             { assertNull(instance.elementAtOrNull(NULL_FLOAT)); }
                                        @Test void Double()            { assertNull(instance.elementAtOrNull(NULL_DOUBLE)); }
                                        @Test void BigInteger()        { assertNull(instance.elementAtOrNull(NULL_BIG_INTEGER)); }
                                        @Test void BigDecimal()        { assertNull(instance.elementAtOrNull(NULL_BIG_DECIMAL)); }
                                        @Test void AtomicInteger()     { assertNull(instance.elementAtOrNull(NULL_ATOMIC_INTEGER)); }
                                        @Test void AtomicLong()        { assertNull(instance.elementAtOrNull(NULL_ATOMIC_LONG)); }
                                        @Test void LongAdder()         { assertNull(instance.elementAtOrNull(NULL_LONG_ADDER)); }
                                        @Test void LongAccumulator()   { assertNull(instance.elementAtOrNull(NULL_LONG_ACCUMULATOR)); }
                                        @Test void DoubleAdder()       { assertNull(instance.elementAtOrNull(NULL_DOUBLE_ADDER)); }
                                        @Test void DoubleAccumulator() { assertNull(instance.elementAtOrNull(NULL_DOUBLE_ACCUMULATOR)); }
                                        @Test void Number()            { assertNull(instance.elementAtOrNull(NULL_NUMBER)); }
            @DisplayName("[]")          @Test void testArray()         { assertNull(instance.elementAtOrNull(EMPTY_ARRAY)); }
        }
    }

    @TestInstance(PER_CLASS) @Nested class aliases {
        @Nested class GenericCollectionHolder {
                                         @Test void first()              { assertEquals(1, new GenericCollectionHolder_GetFirstAlias().execute(CollectionHolder::first).amountOfCall); }
                                         @Test void firstOrNull()        { assertEquals(1, new GenericCollectionHolder_GetFirstOrNullAlias().execute(CollectionHolder::firstOrNull).amountOfCall); }
                                         @Test void firstIndexed()       { assertEquals(1, new GenericCollectionHolder_GetFirstAlias().execute(CollectionHolder::firstIndexed).amountOfCall); }
                                         @Test void firstIndexedOrNull() { assertEquals(1, new GenericCollectionHolder_GetFirstOrNullAlias().execute(CollectionHolder::firstIndexedOrNull).amountOfCall); }
                                         @Test void last()               { assertEquals(1, new GenericCollectionHolder_GetLastAlias().execute(CollectionHolder::last).amountOfCall); }
                                         @Test void lastOrNull()         { assertEquals(1, new GenericCollectionHolder_GetLastOrNullAlias().execute(CollectionHolder::lastOrNull).amountOfCall); }
                                         @Test void lastIndexed()        { assertEquals(1, new GenericCollectionHolder_GetLastAlias().execute(CollectionHolder::lastIndexed).amountOfCall); }
                                         @Test void lastIndexedOrNull()  { assertEquals(1, new GenericCollectionHolder_GetLastOrNullAlias().execute(CollectionHolder::lastIndexedOrNull).amountOfCall); }
                                         @Test void at()                 { assertEquals(1, new GenericCollectionHolder_GetAlias().execute(it -> it.at(EXISTANT_INDEX)).amountOfCall); }
        @Nested class AtOrElse {
            @DisplayName("(int) → null") @Test void test1Arg()           { assertEquals(1, new GenericCollectionHolder_GetOrElseAlias().execute(it -> it.atOrElse(INVALID_INDEX, _ -> null)).amountOfCall); }
            @DisplayName("() → null")    @Test void test0Arg()           { assertEquals(1, new GenericCollectionHolder_GetOrElseAlias().execute(it -> it.atOrElse(INVALID_INDEX, () -> null)).amountOfCall); }
        }
                                         @Test void atOrNull()           { assertEquals(1, new GenericCollectionHolder_GetOrNullAlias().execute(it -> it.atOrNull(INVALID_INDEX)).amountOfCall); }
                                         @Test void elementAt()          { assertEquals(1, new GenericCollectionHolder_GetAlias().execute(it -> it.elementAt(EXISTANT_INDEX)).amountOfCall); }
        @Nested class ElementAtOrElse {
            @DisplayName("(int) → null") @Test void test1Arg()           { assertEquals(1, new GenericCollectionHolder_GetOrElseAlias().execute(it -> it.elementAtOrElse(INVALID_INDEX, _ -> null)).amountOfCall); }
            @DisplayName("() → null")    @Test void test0Arg()           { assertEquals(1, new GenericCollectionHolder_GetOrElseAlias().execute(it -> it.elementAtOrElse(INVALID_INDEX, () -> null)).amountOfCall); }
        }
                                         @Test void elementAtOrNull()    { assertEquals(1, new GenericCollectionHolder_GetOrNullAlias().execute(it -> it.elementAtOrNull(INVALID_INDEX)).amountOfCall); }

        }

        @Nested class first {
            @DisplayName("MinimalistCollectionHolder<T>") @Test void minimalist() { assertSame(A[0], first(new ArrayAsMinimalistCollection<>(A))); }
            @DisplayName("CollectionHolder<T>")           @Test void normal()     { assertSame(A[0], first(new ArrayAsCollection<>(A))); }
            @DisplayName("T[]")                           @Test void array()      { assertSame(A[0], first(A)); }
        }
        @Nested class firstOrNull {
            @DisplayName("MinimalistCollectionHolder<T>") @Test void minimalist() { assertSame(A[0], firstOrNull(new ArrayAsMinimalistCollection<>(A))); }
            @DisplayName("CollectionHolder<T>")           @Test void normal()     { assertSame(A[0], firstOrNull(new ArrayAsCollection<>(A))); }
            @DisplayName("T[]")                           @Test void array()      { assertSame(A[0], firstOrNull(A)); }
        }
        @Nested class firstIndexed {
            @DisplayName("MinimalistCollectionHolder<T>") @Test void minimalist() { assertSame(A[0], firstIndexed(new ArrayAsMinimalistCollection<>(A))); }
            @DisplayName("CollectionHolder<T>")           @Test void normal()     { assertSame(A[0], firstIndexed(new ArrayAsCollection<>(A))); }
            @DisplayName("T[]")                           @Test void array()      { assertSame(A[0], firstIndexed(A)); }
        }
        @Nested class firstIndexedOrNull {
            @DisplayName("MinimalistCollectionHolder<T>") @Test void minimalist() { assertSame(A[0], firstIndexedOrNull(new ArrayAsMinimalistCollection<>(A))); }
            @DisplayName("CollectionHolder<T>")           @Test void normal()     { assertSame(A[0], firstIndexedOrNull(new ArrayAsCollection<>(A))); }
            @DisplayName("T[]")                           @Test void array()      { assertSame(A[0], firstIndexedOrNull(A)); }
        }

        @Nested class last {
            @DisplayName("MinimalistCollectionHolder<T>") @Test void minimalist() { assertSame(A[0], last(new ArrayAsMinimalistCollection<>(A))); }
            @DisplayName("CollectionHolder<T>")           @Test void normal()     { assertSame(A[0], last(new ArrayAsCollection<>(A))); }
            @DisplayName("T[]")                           @Test void array()      { assertSame(A[0], last(A)); }
        }
        @Nested class lastOrNull {
            @DisplayName("MinimalistCollectionHolder<T>") @Test void minimalist() { assertSame(A[0], lastOrNull(new ArrayAsMinimalistCollection<>(A))); }
            @DisplayName("CollectionHolder<T>")           @Test void normal()     { assertSame(A[0], lastOrNull(new ArrayAsCollection<>(A))); }
            @DisplayName("T[]")                           @Test void array()      { assertSame(A[0], lastOrNull(A)); }
        }
        @Nested class lastIndexed {
            @DisplayName("MinimalistCollectionHolder<T>") @Test void minimalist() { assertSame(A[0], lastIndexed(new ArrayAsMinimalistCollection<>(A))); }
            @DisplayName("CollectionHolder<T>")           @Test void normal()     { assertSame(A[0], lastIndexed(new ArrayAsCollection<>(A))); }
            @DisplayName("T[]")                           @Test void array()      { assertSame(A[0], lastIndexed(A)); }
        }
        @Nested class lastIndexedOrNull {
            @DisplayName("MinimalistCollectionHolder<T>") @Test void minimalist() { assertSame(A[0], lastIndexedOrNull(new ArrayAsMinimalistCollection<>(A))); }
            @DisplayName("CollectionHolder<T>")           @Test void normal()     { assertSame(A[0], lastIndexedOrNull(new ArrayAsCollection<>(A))); }
            @DisplayName("T[]")                           @Test void array()      { assertSame(A[0], lastIndexedOrNull(A)); }
        }

//        @Nested class atOrElse {
//            @DisplayName("MinimalistCollectionHolder<T>, () → T")  @Test void minimalist0Arg() { assertSame(A[0], atOrElse(new ArrayAsMinimalistCollection<>(A), 0, CALLBACK0_AS_FAIL)); }
//            @DisplayName("MinimalistCollectionHolder<T>, int → T") @Test void minimalist1Arg() { assertSame(A[0], atOrElse(new ArrayAsMinimalistCollection<>(A), 0, CALLBACK1_ALT_AS_FAIL)); }
//            @DisplayName("CollectionHolder<T>, () → T")            @Test void normal0Arg()     { assertSame(A[0], atOrElse(new ArrayAsCollection<>(A), 0, CALLBACK1_ALT_AS_FAIL)); }
//            @DisplayName("CollectionHolder<T>, int → T")           @Test void normal1Arg()     { assertSame(A[0], atOrElse(new ArrayAsCollection<>(A), 0, CALLBACK1_ALT_AS_FAIL)); }
//            @DisplayName("T[], () → T")                            @Test void array0Arg()      { assertSame(A[0], atOrElse(A, 0, CALLBACK1_ALT_AS_FAIL)); }
//            @DisplayName("T[], int → T")                           @Test void array0Arg()      { assertSame(A[0], atOrElse(A, 0, CALLBACK1_ALT_AS_FAIL)); }
//        }
//        @Nested class atOrNull {
//            @DisplayName("MinimalistCollectionHolder<T>")  @Test void minimalist() { assertSame(A[0], atOrNull(new ArrayAsMinimalistCollection<>(A), 0)); }
//            @DisplayName("CollectionHolder<T>")            @Test void normal()     { assertSame(A[0], atOrNull(new ArrayAsCollection<>(A), 0)); }
//            @DisplayName("T[]")                            @Test void array()      { assertSame(A[0], atOrNull(A, 0)); }
//        }
//        @Nested class elementAtOrElse {
//            @DisplayName("MinimalistCollectionHolder<T>, () → T")  @Test void minimalist0Arg() { assertSame(A[0], elementAtOrElse(new ArrayAsMinimalistCollection<>(A), 0, CALLBACK0_AS_FAIL)); }
//            @DisplayName("MinimalistCollectionHolder<T>, int → T") @Test void minimalist1Arg() { assertSame(A[0], elementAtOrElse(new ArrayAsMinimalistCollection<>(A), 0, CALLBACK1_ALT_AS_FAIL)); }
//            @DisplayName("CollectionHolder<T>, () → T")            @Test void normal0Arg()     { assertSame(A[0], elementAtOrElse(new ArrayAsCollection<>(A), 0, CALLBACK1_ALT_AS_FAIL)); }
//            @DisplayName("CollectionHolder<T>, int → T")           @Test void normal1Arg()     { assertSame(A[0], elementAtOrElse(new ArrayAsCollection<>(A), 0, CALLBACK1_ALT_AS_FAIL)); }
//            @DisplayName("T[], () → T")                            @Test void array0Arg()      { assertSame(A[0], elementAtOrElse(A, 0, CALLBACK1_ALT_AS_FAIL)); }
//            @DisplayName("T[], int → T")                           @Test void array0Arg()      { assertSame(A[0], elementAtOrElse(A, 0, CALLBACK1_ALT_AS_FAIL)); }
//        }
//        @Nested class elementAtOrNull {
//            @DisplayName("MinimalistCollectionHolder<T>")  @Test void minimalist() { assertSame(A[0], elementAtOrNull(new ArrayAsMinimalistCollection<>(A), 0)); }
//            @DisplayName("CollectionHolder<T>")            @Test void normal()     { assertSame(A[0], elementAtOrNull(new ArrayAsCollection<>(A), 0)); }
//            @DisplayName("T[]")                            @Test void array()      { assertSame(A[0], elementAtOrNull(A, 0)); }
//        }

        //TODO add utility static method (value) call to have been called
    }

    @FieldSource("value.Instances#everyExtensionMethodInstancesAsArguments")
    @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class methods extends AbstractMethodsTests {

        //#region -------------------- Required test configuration --------------------

        public methods(final CollectionHolderForTest<?, ?> instance) { super(instance); }

        //#endregion -------------------- Required test configuration --------------------

        @Test void getFirst() { assertThrowsExactly(emptyExceptionClass(), instance::getFirst); }
        @Test void getLast()  { assertThrowsExactly(emptyExceptionClass(), instance::getLast); }

        @Nested class getOrElse {
            @DisplayName("int → T") @Test void test1Arg() { assertSame(VALUE, getInstance().getOrElse(INVALID_INDEX, callback1Alt)); }
            @DisplayName("() → T")  @Test void test0Arg() { assertSame(VALUE, getInstance().getOrElse(INVALID_INDEX, callback0)); }
        }
        @Test void getFirstOrElse() { assertSame(VALUE, getInstance().getFirstOrElse(callback0)); }
        @Test void getLastOrElse()  { assertSame(VALUE, getInstance().getLastOrElse(callback0)); }

        @Test void getOrNull()      { assertNull(getInstance().getOrNull(INVALID_INDEX)); }
        @Test void getFirstOrNull() { assertNull(getInstance().getFirstOrNull()); }
        @Test void getLastOrNull()  { assertNull(getInstance().getLastOrNull()); }
    }

    @FieldSource("value.Instances#everyInstancesAsArguments")
    @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class instances extends AbstractInstancesTests {

        //#region -------------------- Required test configuration --------------------

        public instances(final Class<CollectionHolderForTest<?, ?>> instanceClass) { super(instanceClass); }

        //#endregion -------------------- Required test configuration --------------------

        @ExtendWith({DisableIfNormalCondition.class, DisableIfViewerCondition.class,})
        @DisplayName("get() being called") @TestInstance(PER_CLASS) @Nested class GetBeingCalled {
            public final instances rootInstance = instances.this;

            @Nested class get {
                                         @Test void empty()  { assertEquals(1, newInstance(EMPTY).executeWhileExpectingEmptyException(it -> it.get(0)).getAmountOfCall()); }
                @DisplayName("1 field")  @Test void test1()  { assertEquals(1, newInstance(A)    .execute(it -> it                            .get(0)).getAmountOfCall()); }
                @DisplayName("2 fields") @Test void test2()  { assertEquals(1, newInstance(AB)   .execute(it -> it                            .get(0)).getAmountOfCall()); }
                @DisplayName("4 fields") @Test void test4 () { assertEquals(1, newInstance(ABCD) .execute(it -> it                            .get(0)).getAmountOfCall()); }
            }
            @Nested class getFirst {
                                         @Test void empty() { assertEquals(0, newInstance(EMPTY).executeWhileExpectingEmptyException(CollectionHolder::getFirst).getAmountOfCall()); }
                @DisplayName("1 field")  @Test void test1() { assertEquals(1, newInstance(A)    .execute(                            CollectionHolder::getFirst).getAmountOfCall()); }
                @DisplayName("2 fields") @Test void test2() { assertEquals(1, newInstance(AB)   .execute(                            CollectionHolder::getFirst).getAmountOfCall()); }
                @DisplayName("4 fields") @Test void test4() { assertEquals(1, newInstance(ABCD) .execute(                            CollectionHolder::getFirst).getAmountOfCall()); }
            }
            @Nested class getLast {
                                         @Test void empty() { assertEquals(0, newInstance(EMPTY).executeWhileExpectingEmptyException(CollectionHolder::getLast).getAmountOfCall()); }
                @DisplayName("1 field")  @Test void test1() { assertEquals(1, newInstance(A)    .execute(                            CollectionHolder::getLast).getAmountOfCall()); }
                @DisplayName("2 fields") @Test void test2() { assertEquals(1, newInstance(AB)   .execute(                            CollectionHolder::getLast).getAmountOfCall()); }
                @DisplayName("4 fields") @Test void test4() { assertEquals(1, newInstance(ABCD) .execute(                            CollectionHolder::getLast).getAmountOfCall()); }
            }

            @Nested class getOrElse {
                @DisplayName("empty, int → T")       @Test void empty_1Arg() { assertEquals(0, newInstance(EMPTY).execute(it -> it.getOrElse(0, callback0)).getAmountOfCall()); }
                @DisplayName("empty, () → T")        @Test void empty_0Arg() { assertEquals(0, newInstance(EMPTY).execute(it -> it.getOrElse(0, callback1Alt)).getAmountOfCall()); }
                @DisplayName("1 field, int → fail")  @Test void test1_1Arg() { assertEquals(1, newInstance(A)    .execute(it -> it.getOrElse(0, callback1AltAsFail)).getAmountOfCall()); }
                @DisplayName("1 field, () → fail")   @Test void test1_0Arg() { assertEquals(1, newInstance(A)    .execute(it -> it.getOrElse(0, callback0AsFail)).getAmountOfCall()); }
                @DisplayName("2 fields, int → fail") @Test void test2_1Arg() { assertEquals(1, newInstance(AB)   .execute(it -> it.getOrElse(0, callback1AltAsFail)).getAmountOfCall()); }
                @DisplayName("2 fields, () → fail")  @Test void test2_0Arg() { assertEquals(1, newInstance(AB)   .execute(it -> it.getOrElse(0, callback0AsFail)).getAmountOfCall()); }
                @DisplayName("4 fields, int → fail") @Test void test4_1Arg() { assertEquals(1, newInstance(ABCD) .execute(it -> it.getOrElse(0, callback1AltAsFail)).getAmountOfCall()); }
                @DisplayName("4 fields, () → fail")  @Test void test4_0Arg() { assertEquals(1, newInstance(ABCD) .execute(it -> it.getOrElse(0, callback0AsFail)).getAmountOfCall()); }
            }
            @Nested class getFirstOrElse {
                                         @Test void empty() { assertEquals(0, newInstance(EMPTY).execute(it -> it.getFirstOrElse(callback0)).getAmountOfCall()); }
                @DisplayName("1 field")  @Test void test1() { assertEquals(1, newInstance(A)    .execute(it -> it.getFirstOrElse(callback0AsFail)).getAmountOfCall()); }
                @DisplayName("2 fields") @Test void test2() { assertEquals(1, newInstance(AB)   .execute(it -> it.getFirstOrElse(callback0AsFail)).getAmountOfCall()); }
                @DisplayName("4 fields") @Test void test4() { assertEquals(1, newInstance(ABCD) .execute(it -> it.getFirstOrElse(callback0AsFail)).getAmountOfCall()); }
            }
            @Nested class getLastOrElse {
                                         @Test void empty() { assertEquals(0, newInstance(EMPTY).execute(it -> it.getLastOrElse(callback0)).getAmountOfCall()); }
                @DisplayName("1 field")  @Test void test1() { assertEquals(1, newInstance(A)    .execute(it -> it.getLastOrElse(callback0AsFail)).getAmountOfCall()); }
                @DisplayName("2 fields") @Test void test2() { assertEquals(1, newInstance(AB)   .execute(it -> it.getLastOrElse(callback0AsFail)).getAmountOfCall()); }
                @DisplayName("4 fields") @Test void test4() { assertEquals(1, newInstance(ABCD ).execute(it -> it.getLastOrElse(callback0AsFail)).getAmountOfCall()); }
            }

            @Nested class getOrNull {
                                         @Test void empty() { assertEquals(0, newInstance(EMPTY).execute(it -> it.getOrNull(0)).getAmountOfCall()); }
                @DisplayName("1 field")  @Test void test1() { assertEquals(1, newInstance(A)    .execute(it -> it.getOrNull(0)).getAmountOfCall()); }
                @DisplayName("2 fields") @Test void test2() { assertEquals(1, newInstance(AB)   .execute(it -> it.getOrNull(0)).getAmountOfCall()); }
                @DisplayName("4 fields") @Test void test4() { assertEquals(1, newInstance(ABCD) .execute(it -> it.getOrNull(0)).getAmountOfCall()); }
            }
            @Nested class getFirstOrNull {
                                         @Test void empty() { assertEquals(0, newInstance(EMPTY).execute(CollectionHolder::getFirstOrNull).getAmountOfCall()); }
                @DisplayName("1 field")  @Test void test1() { assertEquals(1, newInstance(A)    .execute(CollectionHolder::getFirstOrNull).getAmountOfCall()); }
                @DisplayName("2 fields") @Test void test2() { assertEquals(1, newInstance(AB)   .execute(CollectionHolder::getFirstOrNull).getAmountOfCall()); }
                @DisplayName("4 fields") @Test void test4() { assertEquals(1, newInstance(ABCD) .execute(CollectionHolder::getFirstOrNull).getAmountOfCall()); }
            }
            @Nested class getLastOrNull {
                                         @Test void empty() { assertEquals(0, newInstance(EMPTY).execute(CollectionHolder::getLastOrNull).getAmountOfCall()); }
                @DisplayName("1 field")  @Test void test1() { assertEquals(1, newInstance(A)    .execute(CollectionHolder::getLastOrNull).getAmountOfCall()); }
                @DisplayName("2 fields") @Test void test2() { assertEquals(1, newInstance(AB)   .execute(CollectionHolder::getLastOrNull).getAmountOfCall()); }
                @DisplayName("4 fields") @Test void test4() { assertEquals(1, newInstance(ABCD) .execute(CollectionHolder::getLastOrNull).getAmountOfCall()); }
            }
        }

        @ExtendWith(DisableIfViewerCondition.class)
        @TestInstance(PER_CLASS) @Nested class get {
            public final instances rootInstance = instances.this;

            @Nested class empty {
                                   @Test void min()    { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).get(MIN_INT_VALUE)); }
                @DisplayName("-2") @Test void minus2() { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).get(-2)); }
                @DisplayName("-1") @Test void minus1() { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).get(-1)); }
                @DisplayName("0")  @Test void test0()  { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).get(0)); }
                @DisplayName("1")  @Test void test1()  { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).get(1)); }
                                   @Test void max()    { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).get(MAX_INT_VALUE)); }
            }
            @DisplayName("1 field") @Nested class Test1 {
                                   @Test void min()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).get(MIN_INT_VALUE)); }
                @DisplayName("-3") @Test void minus3() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).get(-3)); }
                @DisplayName("-2") @Test void minus2() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).get(-2)); }
                @DisplayName("-1") @Test void minus1() { assertSame(A[0],                                           newInstance(A).get(-1)); }
                @DisplayName("0")  @Test void test0()  { assertSame(A[0],                                           newInstance(A).get(0)); }
                @DisplayName("1")  @Test void test1()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).get(1)); }
                @DisplayName("2")  @Test void test2()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).get(2)); }
                                   @Test void max()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).get(MAX_INT_VALUE)); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                                   @Test void min()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB).get(MIN_INT_VALUE)); }
                @DisplayName("-4") @Test void minus4() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB).get(-4)); }
                @DisplayName("-3") @Test void minus3() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB).get(-3)); }
                @DisplayName("-2") @Test void minus2() { assertSame(AB[0],                                          newInstance(AB).get(-2)); }
                @DisplayName("-1") @Test void minus1() { assertSame(AB[1],                                          newInstance(AB).get(-1)); }
                @DisplayName("0")  @Test void test0()  { assertSame(AB[0],                                          newInstance(AB).get(0)); }
                @DisplayName("1")  @Test void test1()  { assertSame(AB[1],                                          newInstance(AB).get(1)); }
                @DisplayName("2")  @Test void test2()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB).get(2)); }
                @DisplayName("3")  @Test void test3()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB).get(3)); }
                                   @Test void max()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB).get(MAX_INT_VALUE)); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                                   @Test void min()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).get(MIN_INT_VALUE)); }
                @DisplayName("-6") @Test void minus6() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).get(-6)); }
                @DisplayName("-5") @Test void minus5() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).get(-5)); }
                @DisplayName("-4") @Test void minus4() { assertSame(ABCD[0],                                        newInstance(ABCD).get(-4)); }
                @DisplayName("-3") @Test void minus3() { assertSame(ABCD[1],                                        newInstance(ABCD).get(-3)); }
                @DisplayName("-2") @Test void minus2() { assertSame(ABCD[2],                                        newInstance(ABCD).get(-2)); }
                @DisplayName("-1") @Test void minus1() { assertSame(ABCD[3],                                        newInstance(ABCD).get(-1)); }
                @DisplayName("0")  @Test void test0()  { assertSame(ABCD[0],                                        newInstance(ABCD).get(0)); }
                @DisplayName("1")  @Test void test1()  { assertSame(ABCD[1],                                        newInstance(ABCD).get(1)); }
                @DisplayName("2")  @Test void test2()  { assertSame(ABCD[2],                                        newInstance(ABCD).get(2)); }
                @DisplayName("3")  @Test void test3()  { assertSame(ABCD[3],                                        newInstance(ABCD).get(3)); }
                @DisplayName("4")  @Test void test4()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).get(4)); }
                @DisplayName("5")  @Test void test5()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).get(5)); }
                                   @Test void max()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).get(MAX_INT_VALUE)); }
            }
        }
        @Nested class getFirst {
                                    @Test void empty() { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).getFirst()); }
           @DisplayName("1 field")  @Test void test1() { assertSame(A[0],                                          newInstance(A)    .getFirst()); }
           @DisplayName("2 fields") @Test void test2() { assertSame(AB[0],                                         newInstance(AB)   .getFirst()); }
           @DisplayName("4 fields") @Test void test4() { assertSame(ABCD[0],                                       newInstance(ABCD) .getFirst()); }
        }
        @Nested class getLast {
                                    @Test void empty() { assertThrowsExactly(EmptyCollectionException.class, () -> newInstance(EMPTY).getLast()); }
           @DisplayName("1 field")  @Test void test1() { assertSame(A[0],                                           newInstance(A)   .getLast()); }
           @DisplayName("2 fields") @Test void test2() { assertSame(AB[1],                                          newInstance(AB)  .getLast()); }
           @DisplayName("4 fields") @Test void test4() { assertSame(ABCD[3],                                        newInstance(ABCD).getLast()); }
        }

        @TestInstance(PER_CLASS) @Nested class getOrElse {
            @Nested class empty {
                @DisplayName("min, int → T") @Test void min_1Arg()    { assertSame(VALUE, newInstance(EMPTY).getOrElse(MIN_INT_VALUE, callback1Alt)); }
                @DisplayName("min, () → T")  @Test void min_0Arg()    { assertSame(VALUE, newInstance(EMPTY).getOrElse(MIN_INT_VALUE, callback0)); }
                @DisplayName("-2, int → T")  @Test void minus2_1Arg() { assertSame(VALUE, newInstance(EMPTY).getOrElse(-2, callback1Alt)); }
                @DisplayName("-2, () → T")   @Test void minus2_0Arg() { assertSame(VALUE, newInstance(EMPTY).getOrElse(-2, callback0)); }
                @DisplayName("-1, int → T")  @Test void minus1_1Arg() { assertSame(VALUE, newInstance(EMPTY).getOrElse(-1, callback1Alt)); }
                @DisplayName("-1, () → T")   @Test void minus1_0Arg() { assertSame(VALUE, newInstance(EMPTY).getOrElse(-1, callback0)); }
                @DisplayName("0, int → T")   @Test void test0_1Arg()  { assertSame(VALUE, newInstance(EMPTY).getOrElse(0, callback1Alt)); }
                @DisplayName("0, () → T")    @Test void test0_0Arg()  { assertSame(VALUE, newInstance(EMPTY).getOrElse(0, callback0)); }
                @DisplayName("1, int → T")   @Test void test1_1Arg()  { assertSame(VALUE, newInstance(EMPTY).getOrElse(1, callback1Alt)); }
                @DisplayName("1, () → T")    @Test void test1_0Arg()  { assertSame(VALUE, newInstance(EMPTY).getOrElse(1, callback0)); }
                @DisplayName("max, int → T") @Test void max_1Arg()    { assertSame(VALUE, newInstance(EMPTY).getOrElse(MAX_INT_VALUE, callback1Alt)); }
                @DisplayName("max, () → T")  @Test void max_0Arg()    { assertSame(VALUE, newInstance(EMPTY).getOrElse(MAX_INT_VALUE, callback0)); }
            }
            @DisplayName("1 field") @Nested class Test1 {
                @DisplayName("min, int → T") @Test void min_1Arg()    { assertSame(VALUE, newInstance(A).getOrElse(MIN_INT_VALUE, callback1Alt)); }
                @DisplayName("min, () → T")  @Test void min_0Arg()    { assertSame(VALUE, newInstance(A).getOrElse(MIN_INT_VALUE, callback0)); }
                @DisplayName("-3, int → T")  @Test void minus3_1Arg() { assertSame(VALUE, newInstance(A).getOrElse(-3, callback1Alt)); }
                @DisplayName("-3, () → T")   @Test void minus3_0Arg() { assertSame(VALUE, newInstance(A).getOrElse(-3, callback0)); }
                @DisplayName("-2, int → T")  @Test void minus2_1Arg() { assertSame(VALUE, newInstance(A).getOrElse(-2, callback1Alt)); }
                @DisplayName("-2, () → T")   @Test void minus2_0Arg() { assertSame(VALUE, newInstance(A).getOrElse(-2, callback0)); }
                @DisplayName("-1, int → T")  @Test void minus1_1Arg() { assertSame(A[0],  newInstance(A).getOrElse(-1, callback1AltAsFail)); }
                @DisplayName("-1, () → T")   @Test void minus1_0Arg() { assertSame(A[0],  newInstance(A).getOrElse(-1, callback0AsFail)); }
                @DisplayName("0, int → T")   @Test void test0_1Arg()  { assertSame(A[0],  newInstance(A).getOrElse(0, callback1AltAsFail)); }
                @DisplayName("0, () → T")    @Test void test0_0Arg()  { assertSame(A[0],  newInstance(A).getOrElse(0, callback0AsFail)); }
                @DisplayName("1, int → T")   @Test void test1_1Arg()  { assertSame(VALUE, newInstance(A).getOrElse(1, callback1Alt)); }
                @DisplayName("1, () → T")    @Test void test1_0Arg()  { assertSame(VALUE, newInstance(A).getOrElse(1, callback0)); }
                @DisplayName("2, int → T")   @Test void test2_1Arg()  { assertSame(VALUE, newInstance(A).getOrElse(2, callback1Alt)); }
                @DisplayName("2, () → T")    @Test void test2_0Arg()  { assertSame(VALUE, newInstance(A).getOrElse(2, callback0)); }
                @DisplayName("max, int → T") @Test void max_1Arg()    { assertSame(VALUE, newInstance(A).getOrElse(MAX_INT_VALUE, callback1Alt)); }
                @DisplayName("max, () → T")  @Test void max_0Arg()    { assertSame(VALUE, newInstance(A).getOrElse(MAX_INT_VALUE, callback0)); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                @DisplayName("min, int → T") @Test void min_1Arg()    { assertSame(VALUE, newInstance(AB).getOrElse(MIN_INT_VALUE, callback1Alt)); }
                @DisplayName("min, () → T")  @Test void min_0Arg()    { assertSame(VALUE, newInstance(AB).getOrElse(MIN_INT_VALUE, callback0)); }
                @DisplayName("-4, int → T")  @Test void minus4_1Arg() { assertSame(VALUE, newInstance(AB).getOrElse(-4, callback1Alt)); }
                @DisplayName("-4, () → T")   @Test void minus4_0Arg() { assertSame(VALUE, newInstance(AB).getOrElse(-4, callback0)); }
                @DisplayName("-3, int → T")  @Test void minus3_1Arg() { assertSame(VALUE, newInstance(AB).getOrElse(-3, callback1Alt)); }
                @DisplayName("-3, () → T")   @Test void minus3_0Arg() { assertSame(VALUE, newInstance(AB).getOrElse(-3, callback0)); }
                @DisplayName("-2, int → T")  @Test void minus2_1Arg() { assertSame(AB[0], newInstance(AB).getOrElse(-2, callback1AltAsFail)); }
                @DisplayName("-2, () → T")   @Test void minus2_0Arg() { assertSame(AB[0], newInstance(AB).getOrElse(-2, callback0AsFail)); }
                @DisplayName("-1, int → T")  @Test void minus1_1Arg() { assertSame(AB[1], newInstance(AB).getOrElse(-1, callback1AltAsFail)); }
                @DisplayName("-1, () → T")   @Test void minus1_0Arg() { assertSame(AB[1], newInstance(AB).getOrElse(-1, callback0AsFail)); }
                @DisplayName("0, int → T")   @Test void test0_1Arg()  { assertSame(AB[0], newInstance(AB).getOrElse(0, callback1AltAsFail)); }
                @DisplayName("0, () → T")    @Test void test0_0Arg()  { assertSame(AB[0], newInstance(AB).getOrElse(0, callback0AsFail)); }
                @DisplayName("1, int → T")   @Test void test1_1Arg()  { assertSame(AB[1], newInstance(AB).getOrElse(1, callback1AltAsFail)); }
                @DisplayName("1, () → T")    @Test void test1_0Arg()  { assertSame(AB[1], newInstance(AB).getOrElse(1, callback0AsFail)); }
                @DisplayName("2, int → T")   @Test void test2_1Arg()  { assertSame(VALUE, newInstance(AB).getOrElse(2, callback1Alt)); }
                @DisplayName("2, () → T")    @Test void test2_0Arg()  { assertSame(VALUE, newInstance(AB).getOrElse(2, callback0)); }
                @DisplayName("3, int → T")   @Test void test3_1Arg()  { assertSame(VALUE, newInstance(AB).getOrElse(3, callback1Alt)); }
                @DisplayName("3, () → T")    @Test void test3_0Arg()  { assertSame(VALUE, newInstance(AB).getOrElse(3, callback0)); }
                @DisplayName("max, int → T") @Test void max_1Arg()    { assertSame(VALUE, newInstance(AB).getOrElse(MAX_INT_VALUE, callback1Alt)); }
                @DisplayName("max, () → T")  @Test void max_0Arg()    { assertSame(VALUE, newInstance(AB).getOrElse(MAX_INT_VALUE, callback0)); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                @DisplayName("min, int → T") @Test void min_1Arg()    { assertSame(VALUE,   newInstance(ABCD).getOrElse(MIN_INT_VALUE, callback1Alt)); }
                @DisplayName("min, () → T")  @Test void min_0Arg()    { assertSame(VALUE,   newInstance(ABCD).getOrElse(MIN_INT_VALUE, callback0)); }
                @DisplayName("-6, int → T")  @Test void minus6_1Arg() { assertSame(VALUE,   newInstance(ABCD).getOrElse(-6, callback1Alt)); }
                @DisplayName("-6, () → T")   @Test void minus6_0Arg() { assertSame(VALUE,   newInstance(ABCD).getOrElse(-6, callback0)); }
                @DisplayName("-5, int → T")  @Test void minus5_1Arg() { assertSame(VALUE,   newInstance(ABCD).getOrElse(-5, callback1Alt)); }
                @DisplayName("-5, () → T")   @Test void minus5_0Arg() { assertSame(VALUE,   newInstance(ABCD).getOrElse(-5, callback0)); }
                @DisplayName("-4, int → T")  @Test void minus4_1Arg() { assertSame(ABCD[0], newInstance(ABCD).getOrElse(-4, callback1AltAsFail)); }
                @DisplayName("-4, () → T")   @Test void minus4_0Arg() { assertSame(ABCD[0], newInstance(ABCD).getOrElse(-4, callback0AsFail)); }
                @DisplayName("-3, int → T")  @Test void minus3_1Arg() { assertSame(ABCD[1], newInstance(ABCD).getOrElse(-3, callback1AltAsFail)); }
                @DisplayName("-3, () → T")   @Test void minus3_0Arg() { assertSame(ABCD[1], newInstance(ABCD).getOrElse(-3, callback0AsFail)); }
                @DisplayName("-2, int → T")  @Test void minus2_1Arg() { assertSame(ABCD[2], newInstance(ABCD).getOrElse(-2, callback1AltAsFail)); }
                @DisplayName("-2, () → T")   @Test void minus2_0Arg() { assertSame(ABCD[2], newInstance(ABCD).getOrElse(-2, callback0AsFail)); }
                @DisplayName("-1, int → T")  @Test void minus1_1Arg() { assertSame(ABCD[3], newInstance(ABCD).getOrElse(-1, callback1AltAsFail)); }
                @DisplayName("-1, () → T")   @Test void minus1_0Arg() { assertSame(ABCD[3], newInstance(ABCD).getOrElse(-1, callback0AsFail)); }
                @DisplayName("0, int → T")   @Test void test0_1Arg()  { assertSame(ABCD[0], newInstance(ABCD).getOrElse(0, callback1AltAsFail)); }
                @DisplayName("0, () → T")    @Test void test0_0Arg()  { assertSame(ABCD[0], newInstance(ABCD).getOrElse(0, callback0AsFail)); }
                @DisplayName("1, int → T")   @Test void test1_1Arg()  { assertSame(ABCD[1], newInstance(ABCD).getOrElse(1, callback1AltAsFail)); }
                @DisplayName("1, () → T")    @Test void test1_0Arg()  { assertSame(ABCD[1], newInstance(ABCD).getOrElse(1, callback0AsFail)); }
                @DisplayName("2, int → T")   @Test void test2_1Arg()  { assertSame(ABCD[2], newInstance(ABCD).getOrElse(2, callback1AltAsFail)); }
                @DisplayName("2, () → T")    @Test void test2_0Arg()  { assertSame(ABCD[2], newInstance(ABCD).getOrElse(2, callback0AsFail)); }
                @DisplayName("3, int → T")   @Test void test3_1Arg()  { assertSame(ABCD[3], newInstance(ABCD).getOrElse(3, callback1AltAsFail)); }
                @DisplayName("3, () → T")    @Test void test3_0Arg()  { assertSame(ABCD[3], newInstance(ABCD).getOrElse(3, callback0AsFail)); }
                @DisplayName("4, int → T")   @Test void test4_1Arg()  { assertSame(VALUE,   newInstance(ABCD).getOrElse(4, callback1Alt)); }
                @DisplayName("4, () → T")    @Test void test4_0Arg()  { assertSame(VALUE,   newInstance(ABCD).getOrElse(4, callback0)); }
                @DisplayName("5, int → T")   @Test void test5_1Arg()  { assertSame(VALUE,   newInstance(ABCD).getOrElse(5, callback1Alt)); }
                @DisplayName("5, () → T")    @Test void test5_0Arg()  { assertSame(VALUE,   newInstance(ABCD).getOrElse(5, callback0)); }
                @DisplayName("max, int → T") @Test void max_1Arg()    { assertSame(VALUE,   newInstance(ABCD).getOrElse(MAX_INT_VALUE, callback1Alt)); }
                @DisplayName("max, () → T")  @Test void max_0Arg()    { assertSame(VALUE,   newInstance(ABCD).getOrElse(MAX_INT_VALUE, callback0)); }
            }
        }
        @Nested class getFirstOrElse {
                                     @Test void empty() { assertSame(VALUE,   newInstance(EMPTY).getFirstOrElse(callback0)); }
            @DisplayName("1 field")  @Test void test1() { assertSame(A[0],    newInstance(A)    .getFirstOrElse(callback0AsFail)); }
            @DisplayName("2 fields") @Test void test2() { assertSame(AB[0],   newInstance(AB)   .getFirstOrElse(callback0AsFail)); }
            @DisplayName("4 fields") @Test void test4() { assertSame(ABCD[0], newInstance(ABCD) .getFirstOrElse(callback0AsFail)); }
        }
        @Nested class getLastOrElse {
                                     @Test void empty() { assertSame(VALUE,   newInstance(EMPTY).getLastOrElse(callback0)); }
            @DisplayName("1 field")  @Test void test1() { assertSame(A[0],    newInstance(A)    .getLastOrElse(callback0AsFail)); }
            @DisplayName("2 fields") @Test void test2() { assertSame(AB[1],   newInstance(AB)   .getLastOrElse(callback0AsFail)); }
            @DisplayName("4 fields") @Test void test4() { assertSame(ABCD[3], newInstance(ABCD) .getLastOrElse(callback0AsFail)); }
        }

        @TestInstance(PER_CLASS) @Nested class getOrNull {
            @Nested class empty {
                                   @Test void min()    { assertNull(newInstance(EMPTY).getOrNull(MIN_INT_VALUE)); }
                @DisplayName("-2") @Test void minus2() { assertNull(newInstance(EMPTY).getOrNull(-2)); }
                @DisplayName("-1") @Test void minus1() { assertNull(newInstance(EMPTY).getOrNull(-1)); }
                @DisplayName("0")  @Test void test0()  { assertNull(newInstance(EMPTY).getOrNull(0)); }
                @DisplayName("1")  @Test void test1()  { assertNull(newInstance(EMPTY).getOrNull(1)); }
                                   @Test void max()    { assertNull(newInstance(EMPTY).getOrNull(MAX_INT_VALUE)); }
            }
            @DisplayName("1 field") @Nested class Test1 {
                                     @Test void min()    { assertNull(       newInstance(A).getOrNull(MIN_INT_VALUE)); }
                @DisplayName("-3")   @Test void minus3() { assertNull(       newInstance(A).getOrNull(-3)); }
                @DisplayName("-2")   @Test void minus2() { assertNull(       newInstance(A).getOrNull(-2)); }
                @DisplayName("-1")   @Test void minus1() { assertSame(A[0],  newInstance(A).getOrNull(-1)); }
                @DisplayName("0")    @Test void test0()  { assertSame(A[0],  newInstance(A).getOrNull(0)); }
                @DisplayName("1")    @Test void test1()  { assertNull(       newInstance(A).getOrNull(1)); }
                @DisplayName("2")    @Test void test2()  { assertNull(       newInstance(A).getOrNull(2)); }
                                     @Test void max()    { assertNull(       newInstance(A).getOrNull(MAX_INT_VALUE)); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                                     @Test void min()    { assertNull(       newInstance(AB).getOrNull(MIN_INT_VALUE)); }
                @DisplayName("-4")   @Test void minus4() { assertNull(       newInstance(AB).getOrNull(-4)); }
                @DisplayName("-3")   @Test void minus3() { assertNull(       newInstance(AB).getOrNull(-3)); }
                @DisplayName("-2")   @Test void minus2() { assertSame(AB[0], newInstance(AB).getOrNull(-2)); }
                @DisplayName("-1")   @Test void minus1() { assertSame(AB[1], newInstance(AB).getOrNull(-1)); }
                @DisplayName("0")    @Test void test0()  { assertSame(AB[0], newInstance(AB).getOrNull(0)); }
                @DisplayName("1")    @Test void test1()  { assertSame(AB[1], newInstance(AB).getOrNull(1)); }
                @DisplayName("2")    @Test void test2()  { assertNull(       newInstance(AB).getOrNull(2)); }
                @DisplayName("3")    @Test void test3()  { assertNull(       newInstance(AB).getOrNull(3)); }
                                     @Test void max()    { assertNull(       newInstance(AB).getOrNull(MAX_INT_VALUE)); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                                     @Test void min()    { assertNull(         newInstance(ABCD).getOrNull(MIN_INT_VALUE)); }
                @DisplayName("-6")   @Test void minus6() { assertNull(         newInstance(ABCD).getOrNull(-6)); }
                @DisplayName("-5")   @Test void minus5() { assertNull(         newInstance(ABCD).getOrNull(-5)); }
                @DisplayName("-4")   @Test void minus4() { assertSame(ABCD[0], newInstance(ABCD).getOrNull(-4)); }
                @DisplayName("-3")   @Test void minus3() { assertSame(ABCD[1], newInstance(ABCD).getOrNull(-3)); }
                @DisplayName("-2")   @Test void minus2() { assertSame(ABCD[2], newInstance(ABCD).getOrNull(-2)); }
                @DisplayName("-1")   @Test void minus1() { assertSame(ABCD[3], newInstance(ABCD).getOrNull(-1)); }
                @DisplayName("0")    @Test void test0()  { assertSame(ABCD[0], newInstance(ABCD).getOrNull(0)); }
                @DisplayName("1")    @Test void test1()  { assertSame(ABCD[1], newInstance(ABCD).getOrNull(1)); }
                @DisplayName("2")    @Test void test2()  { assertSame(ABCD[2], newInstance(ABCD).getOrNull(2)); }
                @DisplayName("3")    @Test void test3()  { assertSame(ABCD[3], newInstance(ABCD).getOrNull(3)); }
                @DisplayName("4")    @Test void test4()  { assertNull(         newInstance(ABCD).getOrNull(4)); }
                @DisplayName("5")    @Test void test5()  { assertNull(         newInstance(ABCD).getOrNull(5)); }
                                     @Test void max()    { assertNull(         newInstance(ABCD).getOrNull(MAX_INT_VALUE)); }
            }
        }
        @Nested class getFirstOrNull {
                                     @Test void empty() { assertNull(         newInstance(EMPTY).getFirstOrNull()); }
            @DisplayName("1 field")  @Test void test1() { assertSame(A[0],    newInstance(A)    .getFirstOrNull()); }
            @DisplayName("2 fields") @Test void test2() { assertSame(AB[0],   newInstance(AB)   .getFirstOrNull()); }
            @DisplayName("4 fields") @Test void test4() { assertSame(ABCD[0], newInstance(ABCD) .getFirstOrNull()); }
        }
        @Nested class getLastOrNull {
                                     @Test void empty() { assertNull(         newInstance(EMPTY).getLastOrNull()); }
            @DisplayName("1 field")  @Test void test1() { assertSame(A[0],    newInstance(A)    .getLastOrNull()); }
            @DisplayName("2 fields") @Test void test2() { assertSame(AB[1],   newInstance(AB)   .getLastOrNull()); }
            @DisplayName("4 fields") @Test void test4() { assertSame(ABCD[3], newInstance(ABCD) .getLastOrNull()); }
        }
    }

}

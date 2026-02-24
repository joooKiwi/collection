import condition.DisableIfNormalCondition;
import condition.DisableIfNormalViewerCondition;
import instance.CollectionHolderForTest;
import instance.GenericCollectionHolder_TakeAlias;
import instance.GenericCollectionHolder_TakeLastAlias;
import instance.GenericCollectionHolder_TakeLastWhileAlias;
import instance.GenericCollectionHolder_TakeLastWhileIndexedAlias;
import instance.GenericCollectionHolder_TakeWhileAlias;
import instance.GenericCollectionHolder_TakeWhileIndexedAlias;
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

import static joookiwi.collection.java.CollectionConstants.emptyCollectionHolder;
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
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;
import static value.Arrays.A;
import static value.Arrays.AB;
import static value.Arrays.ABC;
import static value.Arrays.ABCD;
import static value.Arrays.B;
import static value.Arrays.BCD;
import static value.Arrays.CD;
import static value.Arrays.D;
import static value.Arrays.EMPTY;
import static value.Callbacks.predicate0AsFail;
import static value.Callbacks.predicate1AltAsFail;
import static value.Callbacks.predicate1AsFail;
import static value.Callbacks.predicate2AltAsFail;
import static value.Callbacks.predicate2AsFail;
import static value.Callbacks_Boolean.callback0AsFalse;
import static value.Callbacks_Boolean.callback0AsTrue;
import static value.Callbacks_Boolean.callback1AltAsFalse;
import static value.Callbacks_Boolean.callback1AltAsTrue;
import static value.Callbacks_Boolean.callback1AsFalse;
import static value.Callbacks_Boolean.callback1AsTrue;
import static value.Callbacks_Boolean.callback2AltAsFalse;
import static value.Callbacks_Boolean.callback2AltAsTrue;
import static value.Callbacks_Boolean.callback2AsFalse;
import static value.Callbacks_Boolean.callback2AsTrue;
import static value.Callbacks_Numeric.callbackIsOver0;
import static value.Callbacks_Numeric.callbackIsOver0Alt;
import static value.Callbacks_Numeric.callbackIsOver1;
import static value.Callbacks_Numeric.callbackIsOver1Alt;
import static value.Callbacks_Numeric.callbackIsOver2;
import static value.Callbacks_Numeric.callbackIsOver2Alt;
import static value.Callbacks_Numeric.callbackIsOver3;
import static value.Callbacks_Numeric.callbackIsOver3Alt;
import static value.Callbacks_Numeric.callbackIsOver4;
import static value.Callbacks_Numeric.callbackIsOver4Alt;
import static value.Callbacks_Numeric.callbackIsUnder0;
import static value.Callbacks_Numeric.callbackIsUnder0Alt;
import static value.Callbacks_Numeric.callbackIsUnder1;
import static value.Callbacks_Numeric.callbackIsUnder1Alt;
import static value.Callbacks_Numeric.callbackIsUnder2;
import static value.Callbacks_Numeric.callbackIsUnder2Alt;
import static value.Callbacks_Numeric.callbackIsUnder3;
import static value.Callbacks_Numeric.callbackIsUnder3Alt;
import static value.Callbacks_Numeric.callbackIsUnder4;
import static value.Callbacks_Numeric.callbackIsUnder4Alt;
import static value.Callbacks_String.callbackIsOverA;
import static value.Callbacks_String.callbackIsOverAAlt;
import static value.Callbacks_String.callbackIsOverB;
import static value.Callbacks_String.callbackIsOverBAlt;
import static value.Callbacks_String.callbackIsOverC;
import static value.Callbacks_String.callbackIsOverCAlt;
import static value.Callbacks_String.callbackIsOverD;
import static value.Callbacks_String.callbackIsOverDAlt;
import static value.Callbacks_String.callbackIsOverE;
import static value.Callbacks_String.callbackIsOverEAlt;
import static value.Callbacks_String.callbackIsUnderA;
import static value.Callbacks_String.callbackIsUnderAAlt;
import static value.Callbacks_String.callbackIsUnderB;
import static value.Callbacks_String.callbackIsUnderBAlt;
import static value.Callbacks_String.callbackIsUnderC;
import static value.Callbacks_String.callbackIsUnderCAlt;
import static value.Callbacks_String.callbackIsUnderD;
import static value.Callbacks_String.callbackIsUnderDAlt;
import static value.Callbacks_String.callbackIsUnderE;
import static value.Callbacks_String.callbackIsUnderEAlt;
import static value.ReusableFields.EMPTY_ARRAY;
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
@DisplayName("CollectionHolder tests (take)") @TestInstance(PER_CLASS) class CollectionHolder11_TakeTests {

    @TestInstance(PER_CLASS) @Nested class EmptyCollectionHolder extends AbstractEmptyCollectionHolderTests {
        @Nested class take {
            @DisplayName("∅")           @Test void testEmpty()         { assertSame(instance, instance.take()); }
            @DisplayName("null object") @Test void testNullObject()    { assertSame(instance, instance.take(NULL_OBJECT)); }
            @DisplayName("null string") @Test void testNullString()    { assertSame(instance, instance.take(NULL_STRING)); }
            @DisplayName("null []")     @Test void testNullArray()     { assertSame(instance, instance.take(NULL_VARARGS)); }
            @DisplayName("byte")        @Test void testByte()          { assertSame(instance, instance.take((byte) 0)); }
            @DisplayName("short")       @Test void testShort()         { assertSame(instance, instance.take((short) 0)); }
            @DisplayName("int")         @Test void testInt()           { assertSame(instance, instance.take(0)); }
            @DisplayName("long")        @Test void testLong()          { assertSame(instance, instance.take(0L)); }
            @DisplayName("float")       @Test void testFloat()         { assertSame(instance, instance.take(0.0F)); }
            @DisplayName("double")      @Test void testDouble()        { assertSame(instance, instance.take(0.0D)); }
                                        @Test void Byte()              { assertSame(instance, instance.take(NULL_BYTE)); }
                                        @Test void Short()             { assertSame(instance, instance.take(NULL_SHORT)); }
                                        @Test void Integer()           { assertSame(instance, instance.take(NULL_INT)); }
                                        @Test void Long()              { assertSame(instance, instance.take(NULL_LONG)); }
                                        @Test void Float()             { assertSame(instance, instance.take(NULL_FLOAT)); }
                                        @Test void Double()            { assertSame(instance, instance.take(NULL_DOUBLE)); }
                                        @Test void BigInteger()        { assertSame(instance, instance.take(NULL_BIG_INTEGER)); }
                                        @Test void BigDecimal()        { assertSame(instance, instance.take(NULL_BIG_DECIMAL)); }
                                        @Test void AtomicInteger()     { assertSame(instance, instance.take(NULL_ATOMIC_INTEGER)); }
                                        @Test void AtomicLong()        { assertSame(instance, instance.take(NULL_ATOMIC_LONG)); }
                                        @Test void LongAdder()         { assertSame(instance, instance.take(NULL_LONG_ADDER)); }
                                        @Test void LongAccumulator()   { assertSame(instance, instance.take(NULL_LONG_ACCUMULATOR)); }
                                        @Test void DoubleAdder()       { assertSame(instance, instance.take(NULL_DOUBLE_ADDER)); }
                                        @Test void DoubleAccumulator() { assertSame(instance, instance.take(NULL_DOUBLE_ACCUMULATOR)); }
                                        @Test void Number()            { assertSame(instance, instance.take(NULL_NUMBER)); }
            @DisplayName("[]")          @Test void testArray()         { assertSame(instance, instance.take(EMPTY_ARRAY)); }
        }
        @Nested class limit {
            @DisplayName("∅")           @Test void testEmpty()         { assertSame(instance, instance.limit()); }
            @DisplayName("null object") @Test void testNullObject()    { assertSame(instance, instance.limit(NULL_OBJECT)); }
            @DisplayName("null string") @Test void testNullString()    { assertSame(instance, instance.limit(NULL_STRING)); }
            @DisplayName("null []")     @Test void testNullArray()     { assertSame(instance, instance.limit(NULL_VARARGS)); }
            @DisplayName("byte")        @Test void testByte()          { assertSame(instance, instance.limit((byte) 0)); }
            @DisplayName("short")       @Test void testShort()         { assertSame(instance, instance.limit((short) 0)); }
            @DisplayName("int")         @Test void testInt()           { assertSame(instance, instance.limit(0)); }
            @DisplayName("long")        @Test void testLong()          { assertSame(instance, instance.limit(0L)); }
            @DisplayName("float")       @Test void testFloat()         { assertSame(instance, instance.limit(0.0F)); }
            @DisplayName("double")      @Test void testDouble()        { assertSame(instance, instance.limit(0.0D)); }
                                        @Test void Byte()              { assertSame(instance, instance.limit(NULL_BYTE)); }
                                        @Test void Short()             { assertSame(instance, instance.limit(NULL_SHORT)); }
                                        @Test void Integer()           { assertSame(instance, instance.limit(NULL_INT)); }
                                        @Test void Long()              { assertSame(instance, instance.limit(NULL_LONG)); }
                                        @Test void Float()             { assertSame(instance, instance.limit(NULL_FLOAT)); }
                                        @Test void Double()            { assertSame(instance, instance.limit(NULL_DOUBLE)); }
                                        @Test void BigInteger()        { assertSame(instance, instance.limit(NULL_BIG_INTEGER)); }
                                        @Test void BigDecimal()        { assertSame(instance, instance.limit(NULL_BIG_DECIMAL)); }
                                        @Test void AtomicInteger()     { assertSame(instance, instance.limit(NULL_ATOMIC_INTEGER)); }
                                        @Test void AtomicLong()        { assertSame(instance, instance.limit(NULL_ATOMIC_LONG)); }
                                        @Test void LongAdder()         { assertSame(instance, instance.limit(NULL_LONG_ADDER)); }
                                        @Test void LongAccumulator()   { assertSame(instance, instance.limit(NULL_LONG_ACCUMULATOR)); }
                                        @Test void DoubleAdder()       { assertSame(instance, instance.limit(NULL_DOUBLE_ADDER)); }
                                        @Test void DoubleAccumulator() { assertSame(instance, instance.limit(NULL_DOUBLE_ACCUMULATOR)); }
                                        @Test void Number()            { assertSame(instance, instance.limit(NULL_NUMBER)); }
            @DisplayName("[]")          @Test void testArray()         { assertSame(instance, instance.limit(EMPTY_ARRAY)); }
        }
        @Nested class takeWhile {
            @DisplayName("∅")                       @Test void testEmpty()     { assertSame(instance, instance.takeWhile()); }
            @DisplayName("null (T, int) → boolean") @Test void test2Arg()      { assertSame(instance, instance.takeWhile(NULL_PREDICATE2)); }
            @DisplayName("null (T) → boolean")      @Test void test1Arg()      { assertSame(instance, instance.takeWhile(NULL_PREDICATE1)); }
            @DisplayName("null () → boolean")       @Test void test0Arg()      { assertSame(instance, instance.takeWhile(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray() { assertSame(instance, instance.takeWhile(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()     { assertSame(instance, instance.takeWhile(EMPTY_ARRAY)); }
        }
        @Nested class limitWhile {
            @DisplayName("∅")                       @Test void testEmpty()     { assertSame(instance, instance.limitWhile()); }
            @DisplayName("null (T, int) → boolean") @Test void test2Arg()      { assertSame(instance, instance.limitWhile(NULL_PREDICATE2)); }
            @DisplayName("null (T) → boolean")      @Test void test1Arg()      { assertSame(instance, instance.limitWhile(NULL_PREDICATE1)); }
            @DisplayName("null () → boolean")       @Test void test0Arg()      { assertSame(instance, instance.limitWhile(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray() { assertSame(instance, instance.limitWhile(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()     { assertSame(instance, instance.limitWhile(EMPTY_ARRAY)); }
        }
        @Nested class takeWhileIndexed {
            @DisplayName("∅")                       @Test void testEmpty()     { assertSame(instance, instance.takeWhileIndexed()); }
            @DisplayName("null (T, int) → boolean") @Test void test2Arg()      { assertSame(instance, instance.takeWhileIndexed(NULL_PREDICATE2_ALT)); }
            @DisplayName("null (T) → boolean")      @Test void test1Arg()      { assertSame(instance, instance.takeWhileIndexed(NULL_PREDICATE1_ALT)); }
            @DisplayName("null () → boolean")       @Test void test0Arg()      { assertSame(instance, instance.takeWhileIndexed(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray() { assertSame(instance, instance.takeWhileIndexed(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()     { assertSame(instance, instance.takeWhileIndexed(EMPTY_ARRAY)); }
        }
        @Nested class limitWhileIndexed {
            @DisplayName("∅")                       @Test void testEmpty()     { assertSame(instance, instance.limitWhileIndexed()); }
            @DisplayName("null (T, int) → boolean") @Test void test2Arg()      { assertSame(instance, instance.limitWhileIndexed(NULL_PREDICATE2_ALT)); }
            @DisplayName("null (T) → boolean")      @Test void test1Arg()      { assertSame(instance, instance.limitWhileIndexed(NULL_PREDICATE1_ALT)); }
            @DisplayName("null () → boolean")       @Test void test0Arg()      { assertSame(instance, instance.limitWhileIndexed(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray() { assertSame(instance, instance.limitWhileIndexed(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()     { assertSame(instance, instance.limitWhileIndexed(EMPTY_ARRAY)); }
        }
        @Nested class takeLast {
            @DisplayName("∅")           @Test void testEmpty()         { assertSame(instance, instance.takeLast()); }
            @DisplayName("null object") @Test void testNullObject()    { assertSame(instance, instance.takeLast(NULL_OBJECT)); }
            @DisplayName("null string") @Test void testNullString()    { assertSame(instance, instance.takeLast(NULL_STRING)); }
            @DisplayName("null []")     @Test void testNullArray()     { assertSame(instance, instance.takeLast(NULL_VARARGS)); }
            @DisplayName("byte")        @Test void testByte()          { assertSame(instance, instance.takeLast((byte) 0)); }
            @DisplayName("short")       @Test void testShort()         { assertSame(instance, instance.takeLast((short) 0)); }
            @DisplayName("int")         @Test void testInt()           { assertSame(instance, instance.takeLast(0)); }
            @DisplayName("long")        @Test void testLong()          { assertSame(instance, instance.takeLast(0L)); }
            @DisplayName("float")       @Test void testFloat()         { assertSame(instance, instance.takeLast(0.0F)); }
            @DisplayName("double")      @Test void testDouble()        { assertSame(instance, instance.takeLast(0.0D)); }
                                        @Test void Byte()              { assertSame(instance, instance.takeLast(NULL_BYTE)); }
                                        @Test void Short()             { assertSame(instance, instance.takeLast(NULL_SHORT)); }
                                        @Test void Integer()           { assertSame(instance, instance.takeLast(NULL_INT)); }
                                        @Test void Long()              { assertSame(instance, instance.takeLast(NULL_LONG)); }
                                        @Test void Float()             { assertSame(instance, instance.takeLast(NULL_FLOAT)); }
                                        @Test void Double()            { assertSame(instance, instance.takeLast(NULL_DOUBLE)); }
                                        @Test void BigInteger()        { assertSame(instance, instance.takeLast(NULL_BIG_INTEGER)); }
                                        @Test void BigDecimal()        { assertSame(instance, instance.takeLast(NULL_BIG_DECIMAL)); }
                                        @Test void AtomicInteger()     { assertSame(instance, instance.takeLast(NULL_ATOMIC_INTEGER)); }
                                        @Test void AtomicLong()        { assertSame(instance, instance.takeLast(NULL_ATOMIC_LONG)); }
                                        @Test void LongAdder()         { assertSame(instance, instance.takeLast(NULL_LONG_ADDER)); }
                                        @Test void LongAccumulator()   { assertSame(instance, instance.takeLast(NULL_LONG_ACCUMULATOR)); }
                                        @Test void DoubleAdder()       { assertSame(instance, instance.takeLast(NULL_DOUBLE_ADDER)); }
                                        @Test void DoubleAccumulator() { assertSame(instance, instance.takeLast(NULL_DOUBLE_ACCUMULATOR)); }
                                        @Test void Number()            { assertSame(instance, instance.takeLast(NULL_NUMBER)); }
            @DisplayName("[]")          @Test void testArray()         { assertSame(instance, instance.takeLast(EMPTY_ARRAY)); }
        }
        @Nested class limitLast {
            @DisplayName("∅")           @Test void testEmpty()         { assertSame(instance, instance.limitLast()); }
            @DisplayName("null object") @Test void testNullObject()    { assertSame(instance, instance.limitLast(NULL_OBJECT)); }
            @DisplayName("null string") @Test void testNullString()    { assertSame(instance, instance.limitLast(NULL_STRING)); }
            @DisplayName("null []")     @Test void testNullArray()     { assertSame(instance, instance.limitLast(NULL_VARARGS)); }
            @DisplayName("byte")        @Test void testByte()          { assertSame(instance, instance.limitLast((byte) 0)); }
            @DisplayName("short")       @Test void testShort()         { assertSame(instance, instance.limitLast((short) 0)); }
            @DisplayName("int")         @Test void testInt()           { assertSame(instance, instance.limitLast(0)); }
            @DisplayName("long")        @Test void testLong()          { assertSame(instance, instance.limitLast(0L)); }
            @DisplayName("float")       @Test void testFloat()         { assertSame(instance, instance.limitLast(0.0F)); }
            @DisplayName("double")      @Test void testDouble()        { assertSame(instance, instance.limitLast(0.0D)); }
                                        @Test void Byte()              { assertSame(instance, instance.limitLast(NULL_BYTE)); }
                                        @Test void Short()             { assertSame(instance, instance.limitLast(NULL_SHORT)); }
                                        @Test void Integer()           { assertSame(instance, instance.limitLast(NULL_INT)); }
                                        @Test void Long()              { assertSame(instance, instance.limitLast(NULL_LONG)); }
                                        @Test void Float()             { assertSame(instance, instance.limitLast(NULL_FLOAT)); }
                                        @Test void Double()            { assertSame(instance, instance.limitLast(NULL_DOUBLE)); }
                                        @Test void BigInteger()        { assertSame(instance, instance.limitLast(NULL_BIG_INTEGER)); }
                                        @Test void BigDecimal()        { assertSame(instance, instance.limitLast(NULL_BIG_DECIMAL)); }
                                        @Test void AtomicInteger()     { assertSame(instance, instance.limitLast(NULL_ATOMIC_INTEGER)); }
                                        @Test void AtomicLong()        { assertSame(instance, instance.limitLast(NULL_ATOMIC_LONG)); }
                                        @Test void LongAdder()         { assertSame(instance, instance.limitLast(NULL_LONG_ADDER)); }
                                        @Test void LongAccumulator()   { assertSame(instance, instance.limitLast(NULL_LONG_ACCUMULATOR)); }
                                        @Test void DoubleAdder()       { assertSame(instance, instance.limitLast(NULL_DOUBLE_ADDER)); }
                                        @Test void DoubleAccumulator() { assertSame(instance, instance.limitLast(NULL_DOUBLE_ACCUMULATOR)); }
                                        @Test void Number()            { assertSame(instance, instance.limitLast(NULL_NUMBER)); }
            @DisplayName("[]")          @Test void testArray()         { assertSame(instance, instance.limitLast(EMPTY_ARRAY)); }
        }
        @Nested class takeLastWhile {
            @DisplayName("∅")                       @Test void testEmpty()     { assertSame(instance, instance.takeLastWhile()); }
            @DisplayName("null (T, int) → boolean") @Test void test2Arg()      { assertSame(instance, instance.takeLastWhile(NULL_PREDICATE2)); }
            @DisplayName("null (T) → boolean")      @Test void test1Arg()      { assertSame(instance, instance.takeLastWhile(NULL_PREDICATE1)); }
            @DisplayName("null () → boolean")       @Test void test0Arg()      { assertSame(instance, instance.takeLastWhile(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray() { assertSame(instance, instance.takeLastWhile(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()     { assertSame(instance, instance.takeLastWhile(EMPTY_ARRAY)); }
        }
        @Nested class limitLastWhile {
            @DisplayName("∅")                       @Test void testEmpty()     { assertSame(instance, instance.limitLastWhile()); }
            @DisplayName("null (T, int) → boolean") @Test void test2Arg()      { assertSame(instance, instance.limitLastWhile(NULL_PREDICATE2)); }
            @DisplayName("null (T) → boolean")      @Test void test1Arg()      { assertSame(instance, instance.limitLastWhile(NULL_PREDICATE1)); }
            @DisplayName("null () → boolean")       @Test void test0Arg()      { assertSame(instance, instance.limitLastWhile(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray() { assertSame(instance, instance.limitLastWhile(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()     { assertSame(instance, instance.limitLastWhile(EMPTY_ARRAY)); }
        }
        @Nested class takeLastWhileIndexed {
            @DisplayName("∅")                       @Test void testEmpty()     { assertSame(instance, instance.takeLastWhileIndexed()); }
            @DisplayName("null (T, int) → boolean") @Test void test2Arg()      { assertSame(instance, instance.takeLastWhileIndexed(NULL_PREDICATE2_ALT)); }
            @DisplayName("null (T) → boolean")      @Test void test1Arg()      { assertSame(instance, instance.takeLastWhileIndexed(NULL_PREDICATE1_ALT)); }
            @DisplayName("null () → boolean")       @Test void test0Arg()      { assertSame(instance, instance.takeLastWhileIndexed(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray() { assertSame(instance, instance.takeLastWhileIndexed(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()     { assertSame(instance, instance.takeLastWhileIndexed(EMPTY_ARRAY)); }
        }
        @Nested class limitLastWhileIndexed {
            @DisplayName("∅")                       @Test void testEmpty()     { assertSame(instance, instance.limitLastWhileIndexed()); }
            @DisplayName("null (T, int) → boolean") @Test void test2Arg()      { assertSame(instance, instance.limitLastWhileIndexed(NULL_PREDICATE2_ALT)); }
            @DisplayName("null (T) → boolean")      @Test void test1Arg()      { assertSame(instance, instance.limitLastWhileIndexed(NULL_PREDICATE1_ALT)); }
            @DisplayName("null () → boolean")       @Test void test0Arg()      { assertSame(instance, instance.limitLastWhileIndexed(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray() { assertSame(instance, instance.limitLastWhileIndexed(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()     { assertSame(instance, instance.limitLastWhileIndexed(EMPTY_ARRAY)); }
        }
    }

    @TestInstance(PER_CLASS) @Nested class aliases {
        @TestInstance(PER_CLASS) @Nested class GenericCollectionHolder {
            @Test void limit() { assertEquals(1, new GenericCollectionHolder_TakeAlias().execute(it -> it.limit(0)).getAmountOfCall()); }
            @Nested class limitWhile {
                @DisplayName("(T, int) → boolean") @Test void test2Arg() { assertEquals(1, new GenericCollectionHolder_TakeWhileAlias().execute(it -> it.limitWhile(callback2AsTrue)).getAmountOfCall()); }
                @DisplayName("(T) → boolean")      @Test void test1Arg() { assertEquals(1, new GenericCollectionHolder_TakeWhileAlias().execute(it -> it.limitWhile(callback1AsTrue)).getAmountOfCall()); }
                @DisplayName("() → boolean")       @Test void test0Arg() { assertEquals(1, new GenericCollectionHolder_TakeWhileAlias().execute(it -> it.limitWhile(callback0AsTrue)).getAmountOfCall()); }
            }
            @Nested class limitWhileIndexed {
                @DisplayName("(int, T) → boolean") @Test void test2Arg() { assertEquals(1, new GenericCollectionHolder_TakeWhileIndexedAlias().execute(it -> it.limitWhileIndexed(callback2AltAsTrue)).getAmountOfCall()); }
                @DisplayName("(int) → boolean")    @Test void test1Arg() { assertEquals(1, new GenericCollectionHolder_TakeWhileIndexedAlias().execute(it -> it.limitWhileIndexed(callback1AltAsTrue)).getAmountOfCall()); }
                @DisplayName("() → boolean")       @Test void test0Arg() { assertEquals(1, new GenericCollectionHolder_TakeWhileIndexedAlias().execute(it -> it.limitWhileIndexed(callback0AsTrue)).getAmountOfCall()); }
            }

            @Test void limitLast() { assertEquals(1, new GenericCollectionHolder_TakeLastAlias().execute(it -> it.limitLast(0)).getAmountOfCall()); }
            @Nested class limitLastWhile {
                @DisplayName("(T, int) → boolean") @Test void test2Arg() { assertEquals(1, new GenericCollectionHolder_TakeLastWhileAlias().execute(it -> it.limitLastWhile(callback2AsTrue)).getAmountOfCall()); }
                @DisplayName("(T) → boolean")      @Test void test1Arg() { assertEquals(1, new GenericCollectionHolder_TakeLastWhileAlias().execute(it -> it.limitLastWhile(callback1AsTrue)).getAmountOfCall()); }
                @DisplayName("() → boolean")       @Test void test0Arg() { assertEquals(1, new GenericCollectionHolder_TakeLastWhileAlias().execute(it -> it.limitLastWhile(callback0AsTrue)).getAmountOfCall()); }
            }
            @Nested class limitLastWhileIndexed {
                @DisplayName("(int, T) → boolean") @Test void test2Arg() { assertEquals(1, new GenericCollectionHolder_TakeLastWhileIndexedAlias().execute(it -> it.limitLastWhileIndexed(callback2AltAsTrue)).getAmountOfCall()); }
                @DisplayName("(int) → boolean")    @Test void test1Arg() { assertEquals(1, new GenericCollectionHolder_TakeLastWhileIndexedAlias().execute(it -> it.limitLastWhileIndexed(callback1AltAsTrue)).getAmountOfCall()); }
                @DisplayName("() → boolean")       @Test void test0Arg() { assertEquals(1, new GenericCollectionHolder_TakeLastWhileIndexedAlias().execute(it -> it.limitLastWhileIndexed(callback0AsTrue)).getAmountOfCall()); }
            }
        }

        //TODO add utility static method (take) call to have been called

    }

    @FieldSource("value.Instances#everyExtensionMethodInstancesAsArguments")
    @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class methods extends AbstractMethodsTests {
        //#region -------------------- Required test configuration --------------------

        public methods(final CollectionHolderForTest<?, ?> instance) { super(instance); }

        //#endregion -------------------- Required test configuration --------------------

        @Nested class take {
                               @Test void min()    { assertSame(emptyCollectionHolder(), instance.take(MIN_INT_VALUE)); }
            @DisplayName("-2") @Test void minus2() { assertSame(emptyCollectionHolder(), instance.take(-2)); }
            @DisplayName("-1") @Test void minus1() { assertSame(emptyCollectionHolder(), instance.take(-1)); }
            @DisplayName("0")  @Test void test0()  { assertSame(emptyCollectionHolder(), instance.take(0)); }
            @DisplayName("1")  @Test void test1()  { assertSame(emptyCollectionHolder(), instance.take(1)); }
                               @Test void max()    { assertSame(emptyCollectionHolder(), instance.take(MAX_INT_VALUE)); }
        }
        @Nested class takeWhile {
            @DisplayName("(T, int) → boolean") @Test void test2Arg() { assertSame(emptyCollectionHolder(), stringInstance.takeWhile(predicate2AsFail)); }
            @DisplayName("(T) → boolean")      @Test void test1Arg() { assertSame(emptyCollectionHolder(), stringInstance.takeWhile(predicate1AsFail)); }
            @DisplayName("() → boolean")       @Test void test0Arg() { assertSame(emptyCollectionHolder(),       instance.takeWhile(predicate0AsFail)); }
        }
        @Nested class takeWhileIndexed {
            @DisplayName("(T, int) → boolean") @Test void test2Arg() { assertSame(emptyCollectionHolder(), stringInstance.takeWhileIndexed(predicate2AltAsFail)); }
            @DisplayName("(T) → boolean")      @Test void test1Arg() { assertSame(emptyCollectionHolder(),       instance.takeWhileIndexed(predicate1AltAsFail)); }
            @DisplayName("() → boolean")       @Test void test0Arg() { assertSame(emptyCollectionHolder(),       instance.takeWhileIndexed(predicate0AsFail)); }
        }

        @Nested class takeLast {
                               @Test void min()    { assertSame(emptyCollectionHolder(), instance.takeLast(MIN_INT_VALUE)); }
            @DisplayName("-2") @Test void minus2() { assertSame(emptyCollectionHolder(), instance.takeLast(-2)); }
            @DisplayName("-1") @Test void minus1() { assertSame(emptyCollectionHolder(), instance.takeLast(-1)); }
            @DisplayName("0")  @Test void test0()  { assertSame(emptyCollectionHolder(), instance.takeLast(0)); }
            @DisplayName("1")  @Test void test1()  { assertSame(emptyCollectionHolder(), instance.takeLast(1)); }
                               @Test void max()    { assertSame(emptyCollectionHolder(), instance.takeLast(MAX_INT_VALUE)); }
        }
        @Nested class takeLastWhile {
            @DisplayName("(T, int) → boolean") @Test void test2Arg() { assertSame(emptyCollectionHolder(), stringInstance.takeLastWhile(predicate2AsFail)); }
            @DisplayName("(T) → boolean")      @Test void test1Arg() { assertSame(emptyCollectionHolder(), stringInstance.takeLastWhile(predicate1AsFail)); }
            @DisplayName("() → boolean")       @Test void test0Arg() { assertSame(emptyCollectionHolder(),       instance.takeLastWhile(predicate0AsFail)); }
        }
        @Nested class takeLastWhileIndexed {
            @DisplayName("(T, int) → boolean") @Test void test2Arg() { assertSame(emptyCollectionHolder(), stringInstance.takeLastWhileIndexed(predicate2AltAsFail)); }
            @DisplayName("(T) → boolean")      @Test void test1Arg() { assertSame(emptyCollectionHolder(),       instance.takeLastWhileIndexed(predicate1AltAsFail)); }
            @DisplayName("() → boolean")       @Test void test0Arg() { assertSame(emptyCollectionHolder(),       instance.takeLastWhileIndexed(predicate0AsFail)); }
        }

    }

    @FieldSource("value.Instances#everyInstancesAsArguments")
    @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class instances extends AbstractInstancesTests {
        //#region -------------------- Required test configuration --------------------

        public instances(final Class<CollectionHolderForTest<?, ?>> instanceClass) { super(instanceClass); }

        //#endregion -------------------- Required test configuration --------------------

        @ExtendWith({DisableIfNormalCondition.class, DisableIfNormalViewerCondition.class,})
        @DisplayName("get() being called") @TestInstance(PER_CLASS) @Nested class GetBeingCalled {
            public final instances rootInstance = instances.this;

            @Nested class take {
                @DisplayName("empty (0)")    @Test void empty_0() { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.take(0)).getAmountOfCall()); }
                @DisplayName("empty (1)")    @Test void empty_1() { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.take(1)).getAmountOfCall()); }
                @DisplayName("1 field (0)")  @Test void test1_0() { assertEquals(0, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.take(0)).getAmountOfCall()); }
                @DisplayName("1 field (1)")  @Test void test1_1() { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.take(1)).getAmountOfCall()); }
                @DisplayName("1 field (2)")  @Test void test1_2() { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.take(2)).getAmountOfCall()); }
                @DisplayName("2 fields (0)") @Test void test2_0() { assertEquals(0, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.take(0)).getAmountOfCall()); }
                @DisplayName("2 fields (1)") @Test void test2_1() { assertEquals(1, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.take(1)).getAmountOfCall()); }
                @DisplayName("2 fields (2)") @Test void test2_2() { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.take(2)).getAmountOfCall()); }
                @DisplayName("2 fields (3)") @Test void test2_3() { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.take(3)).getAmountOfCall()); }
                @DisplayName("4 fields (0)") @Test void test4_0() { assertEquals(0, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.take(0)).getAmountOfCall()); }
                @DisplayName("4 fields (1)") @Test void test4_1() { assertEquals(1, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.take(1)).getAmountOfCall()); }
                @DisplayName("4 fields (2)") @Test void test4_2() { assertEquals(2, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.take(2)).getAmountOfCall()); }
                @DisplayName("4 fields (3)") @Test void test4_3() { assertEquals(3, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.take(3)).getAmountOfCall()); }
                @DisplayName("4 fields (4)") @Test void test4_4() { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.take(4)).getAmountOfCall()); }
                @DisplayName("4 fields (5)") @Test void test4_5() { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.take(5)).getAmountOfCall()); }
            }
            @Nested class takeWhile {
                @DisplayName("empty: (T, int) → boolean")  @Test void empty_2Arg()   { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.takeWhile(predicate2AsFail)).getAmountOfCall()); }
                @DisplayName("empty: (T) → boolean")       @Test void empty_1Arg()   { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.takeWhile(predicate1AsFail)).getAmountOfCall()); }
                @DisplayName("empty: () → boolean")        @Test void empty_0Arg()   { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.takeWhile(predicate0AsFail)).getAmountOfCall()); }
                @DisplayName("1 field: (T, int) → true")   @Test void test1_2True()  { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.takeWhile(callback2AsTrue)) .getAmountOfCall()); }
                @DisplayName("1 field: (T) → true")        @Test void test1_1True()  { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.takeWhile(callback1AsTrue)) .getAmountOfCall()); }
                @DisplayName("1 field: () → true")         @Test void test1_0True()  { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.takeWhile(callback0AsTrue)) .getAmountOfCall()); }
                @DisplayName("1 field: (T, int) → false")  @Test void test1_2False() { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.takeWhile(callback2AsFalse)).getAmountOfCall()); }
                @DisplayName("1 field: (T) → false")       @Test void test1_1False() { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.takeWhile(callback1AsFalse)).getAmountOfCall()); }
                @DisplayName("1 field: () → false")        @Test void test1_0False() { assertEquals(0, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.takeWhile(callback0AsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields: (T, int) → true")  @Test void test2_2True()  { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.takeWhile(callback2AsTrue)) .getAmountOfCall()); }
                @DisplayName("2 fields: (T) → true")       @Test void test2_1True()  { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.takeWhile(callback1AsTrue)) .getAmountOfCall()); }
                @DisplayName("2 fields: () → true")        @Test void test2_0True()  { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.takeWhile(callback0AsTrue)) .getAmountOfCall()); }
                @DisplayName("2 fields: (T, int) → false") @Test void test2_2False() { assertEquals(1, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.takeWhile(callback2AsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields: (T) → false")      @Test void test2_1False() { assertEquals(1, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.takeWhile(callback1AsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields: () → false")       @Test void test2_0False() { assertEquals(0, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.takeWhile(callback0AsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields: (T, int) → true")  @Test void test4_2True()  { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.takeWhile(callback2AsTrue)) .getAmountOfCall()); }
                @DisplayName("4 fields: (T) → true")       @Test void test4_1True()  { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.takeWhile(callback1AsTrue)) .getAmountOfCall()); }
                @DisplayName("4 fields: () → true")        @Test void test4_0True()  { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.takeWhile(callback0AsTrue)) .getAmountOfCall()); }
                @DisplayName("4 fields: (T, int) → false") @Test void test4_2False() { assertEquals(1, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.takeWhile(callback2AsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields: (T) → false")      @Test void test4_1False() { assertEquals(1, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.takeWhile(callback1AsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields: () → false")       @Test void test4_0False() { assertEquals(0, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.takeWhile(callback0AsFalse)).getAmountOfCall()); }
            }
            @Nested class takeWhileIndexed {
                @DisplayName("empty: (int, T) → boolean")  @Test void empty_2Arg()   { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.takeWhileIndexed(predicate2AltAsFail)).getAmountOfCall()); }
                @DisplayName("empty: (int) → boolean")     @Test void empty_1Arg()   { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.takeWhileIndexed(predicate1AltAsFail)).getAmountOfCall()); }
                @DisplayName("empty: () → boolean")        @Test void empty_0Arg()   { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.takeWhileIndexed(predicate0AsFail))   .getAmountOfCall()); }
                @DisplayName("1 field: (int, T) → true")   @Test void test1_2True()  { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.takeWhileIndexed(callback2AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("1 field: (int) → true")      @Test void test1_1True()  { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.takeWhileIndexed(callback1AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("1 field: () → true")         @Test void test1_0True()  { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.takeWhileIndexed(callback0AsTrue))    .getAmountOfCall()); }
                @DisplayName("1 field: (int, T) → false")  @Test void test1_2False() { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.takeWhileIndexed(callback2AltAsFalse)).getAmountOfCall()); }
                @DisplayName("1 field: (int) → false")     @Test void test1_1False() { assertEquals(0, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.takeWhileIndexed(callback1AltAsFalse)).getAmountOfCall()); }
                @DisplayName("1 field: () → false")        @Test void test1_0False() { assertEquals(0, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.takeWhileIndexed(callback0AsFalse))   .getAmountOfCall()); }
                @DisplayName("2 fields: (int, T) → true")  @Test void test2_2True()  { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.takeWhileIndexed(callback2AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("2 fields: (int) → true")     @Test void test2_1True()  { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.takeWhileIndexed(callback1AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("2 fields: () → true")        @Test void test2_0True()  { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.takeWhileIndexed(callback0AsTrue))    .getAmountOfCall()); }
                @DisplayName("2 fields: (int, T) → false") @Test void test2_2False() { assertEquals(1, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.takeWhileIndexed(callback2AltAsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields: (int) → false")    @Test void test2_1False() { assertEquals(0, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.takeWhileIndexed(callback1AltAsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields: () → false")       @Test void test2_0False() { assertEquals(0, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.takeWhileIndexed(callback0AsFalse))   .getAmountOfCall()); }
                @DisplayName("4 fields: (int, T) → true")  @Test void test4_2True()  { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.takeWhileIndexed(callback2AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("4 fields: (int) → true")     @Test void test4_1True()  { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.takeWhileIndexed(callback1AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("4 fields: () → true")        @Test void test4_0True()  { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.takeWhileIndexed(callback0AsTrue))    .getAmountOfCall()); }
                @DisplayName("4 fields: (int, T) → false") @Test void test4_2False() { assertEquals(1, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.takeWhileIndexed(callback2AltAsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields: (int) → false")    @Test void test4_1False() { assertEquals(0, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.takeWhileIndexed(callback1AltAsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields: () → false")       @Test void test4_0False() { assertEquals(0, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.takeWhileIndexed(callback0AsFalse))   .getAmountOfCall()); }
            }

            @Nested class takeLast {
                @DisplayName("empty (0)")    @Test void empty_0() { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.takeLast(0)).getAmountOfCall()); }
                @DisplayName("empty (1)")    @Test void empty_1() { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.takeLast(1)).getAmountOfCall()); }
                @DisplayName("1 field (0)")  @Test void test1_0() { assertEquals(0, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.takeLast(0)).getAmountOfCall()); }
                @DisplayName("1 field (1)")  @Test void test1_1() { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.takeLast(1)).getAmountOfCall()); }
                @DisplayName("1 field (2)")  @Test void test1_2() { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.takeLast(2)).getAmountOfCall()); }
                @DisplayName("2 fields (0)") @Test void test2_0() { assertEquals(0, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.takeLast(0)).getAmountOfCall()); }
                @DisplayName("2 fields (1)") @Test void test2_1() { assertEquals(1, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.takeLast(1)).getAmountOfCall()); }
                @DisplayName("2 fields (2)") @Test void test2_2() { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.takeLast(2)).getAmountOfCall()); }
                @DisplayName("2 fields (3)") @Test void test2_3() { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.takeLast(3)).getAmountOfCall()); }
                @DisplayName("4 fields (0)") @Test void test4_0() { assertEquals(0, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.takeLast(0)).getAmountOfCall()); }
                @DisplayName("4 fields (1)") @Test void test4_1() { assertEquals(1, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.takeLast(1)).getAmountOfCall()); }
                @DisplayName("4 fields (2)") @Test void test4_2() { assertEquals(2, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.takeLast(2)).getAmountOfCall()); }
                @DisplayName("4 fields (3)") @Test void test4_3() { assertEquals(3, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.takeLast(3)).getAmountOfCall()); }
                @DisplayName("4 fields (4)") @Test void test4_4() { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.takeLast(4)).getAmountOfCall()); }
                @DisplayName("4 fields (5)") @Test void test4_5() { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.takeLast(5)).getAmountOfCall()); }
            }
            @Nested class takeLastWhile {
                @DisplayName("empty: (T, int) → boolean")  @Test void empty_2Arg()   { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.takeLastWhile(predicate2AsFail)).getAmountOfCall()); }
                @DisplayName("empty: (T) → boolean")       @Test void empty_1Arg()   { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.takeLastWhile(predicate1AsFail)).getAmountOfCall()); }
                @DisplayName("empty: () → boolean")        @Test void empty_0Arg()   { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.takeLastWhile(predicate0AsFail)).getAmountOfCall()); }
                @DisplayName("1 field: (T, int) → true")   @Test void test1_2True()  { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.takeLastWhile(callback2AsTrue)) .getAmountOfCall()); }
                @DisplayName("1 field: (T) → true")        @Test void test1_1True()  { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.takeLastWhile(callback1AsTrue)) .getAmountOfCall()); }
                @DisplayName("1 field: () → true")         @Test void test1_0True()  { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.takeLastWhile(callback0AsTrue)) .getAmountOfCall()); }
                @DisplayName("1 field: (T, int) → false")  @Test void test1_2False() { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.takeLastWhile(callback2AsFalse)).getAmountOfCall()); }
                @DisplayName("1 field: (T) → false")       @Test void test1_1False() { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.takeLastWhile(callback1AsFalse)).getAmountOfCall()); }
                @DisplayName("1 field: () → false")        @Test void test1_0False() { assertEquals(0, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.takeLastWhile(callback0AsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields: (T, int) → true")  @Test void test2_2True()  { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.takeLastWhile(callback2AsTrue)) .getAmountOfCall()); }
                @DisplayName("2 fields: (T) → true")       @Test void test2_1True()  { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.takeLastWhile(callback1AsTrue)) .getAmountOfCall()); }
                @DisplayName("2 fields: () → true")        @Test void test2_0True()  { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.takeLastWhile(callback0AsTrue)) .getAmountOfCall()); }
                @DisplayName("2 fields: (T, int) → false") @Test void test2_2False() { assertEquals(1, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.takeLastWhile(callback2AsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields: (T) → false")      @Test void test2_1False() { assertEquals(1, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.takeLastWhile(callback1AsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields: () → false")       @Test void test2_0False() { assertEquals(0, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.takeLastWhile(callback0AsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields: (T, int) → true")  @Test void test4_2True()  { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.takeLastWhile(callback2AsTrue)) .getAmountOfCall()); }
                @DisplayName("4 fields: (T) → true")       @Test void test4_1True()  { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.takeLastWhile(callback1AsTrue)) .getAmountOfCall()); }
                @DisplayName("4 fields: () → true")        @Test void test4_0True()  { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.takeLastWhile(callback0AsTrue)) .getAmountOfCall()); }
                @DisplayName("4 fields: (T, int) → false") @Test void test4_2False() { assertEquals(1, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.takeLastWhile(callback2AsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields: (T) → false")      @Test void test4_1False() { assertEquals(1, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.takeLastWhile(callback1AsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields: () → false")       @Test void test4_0False() { assertEquals(0, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.takeLastWhile(callback0AsFalse)).getAmountOfCall()); }
            }
            @Nested class takeLastWhileIndexed {
                @DisplayName("empty: (int, T) → boolean")  @Test void empty_2Arg()   { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.takeLastWhileIndexed(predicate2AltAsFail)).getAmountOfCall()); }
                @DisplayName("empty: (int) → boolean")     @Test void empty_1Arg()   { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.takeLastWhileIndexed(predicate1AltAsFail)).getAmountOfCall()); }
                @DisplayName("empty: () → boolean")        @Test void empty_0Arg()   { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.takeLastWhileIndexed(predicate0AsFail))   .getAmountOfCall()); }
                @DisplayName("1 field: (int, T) → true")   @Test void test1_2True()  { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.takeLastWhileIndexed(callback2AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("1 field: (int) → true")      @Test void test1_1True()  { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.takeLastWhileIndexed(callback1AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("1 field: () → true")         @Test void test1_0True()  { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.takeLastWhileIndexed(callback0AsTrue))    .getAmountOfCall()); }
                @DisplayName("1 field: (int, T) → false")  @Test void test1_2False() { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.takeLastWhileIndexed(callback2AltAsFalse)).getAmountOfCall()); }
                @DisplayName("1 field: (int) → false")     @Test void test1_1False() { assertEquals(0, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.takeLastWhileIndexed(callback1AltAsFalse)).getAmountOfCall()); }
                @DisplayName("1 field: () → false")        @Test void test1_0False() { assertEquals(0, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.takeLastWhileIndexed(callback0AsFalse))   .getAmountOfCall()); }
                @DisplayName("2 fields: (int, T) → true")  @Test void test2_2True()  { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.takeLastWhileIndexed(callback2AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("2 fields: (int) → true")     @Test void test2_1True()  { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.takeLastWhileIndexed(callback1AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("2 fields: () → true")        @Test void test2_0True()  { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.takeLastWhileIndexed(callback0AsTrue))    .getAmountOfCall()); }
                @DisplayName("2 fields: (int, T) → false") @Test void test2_2False() { assertEquals(1, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.takeLastWhileIndexed(callback2AltAsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields: (int) → false")    @Test void test2_1False() { assertEquals(0, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.takeLastWhileIndexed(callback1AltAsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields: () → false")       @Test void test2_0False() { assertEquals(0, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.takeLastWhileIndexed(callback0AsFalse))   .getAmountOfCall()); }
                @DisplayName("4 fields: (int, T) → true")  @Test void test4_2True()  { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.takeLastWhileIndexed(callback2AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("4 fields: (int) → true")     @Test void test4_1True()  { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.takeLastWhileIndexed(callback1AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("4 fields: () → true")        @Test void test4_0True()  { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.takeLastWhileIndexed(callback0AsTrue))    .getAmountOfCall()); }
                @DisplayName("4 fields: (int, T) → false") @Test void test4_2False() { assertEquals(1, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.takeLastWhileIndexed(callback2AltAsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields: (int) → false")    @Test void test4_1False() { assertEquals(0, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.takeLastWhileIndexed(callback1AltAsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields: () → false")       @Test void test4_0False() { assertEquals(0, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.takeLastWhileIndexed(callback0AsFalse))   .getAmountOfCall()); }
            }

        }

        @TestInstance(PER_CLASS) @Nested class take {
            @Nested class empty {
                                   @Test void min()    { assertSame(emptyCollectionHolder(), newInstance(A).take(MIN_INT_VALUE)); }
                @DisplayName("-2") @Test void minus2() { assertSame(emptyCollectionHolder(), newInstance(A).take(-2)); }
                @DisplayName("-1") @Test void minus1() { assertSame(emptyCollectionHolder(), newInstance(A).take(-1)); }
                @DisplayName("0")  @Test void test0()  { assertSame(emptyCollectionHolder(), newInstance(A).take(0)); }
                @DisplayName("1")  @Test void test1()  { assertArrayEquals(A,                newInstance(A).take(1).toArray()); }
                                   @Test void max()    { assertArrayEquals(A,                newInstance(A).take(MAX_INT_VALUE).toArray()); }
            }
            @DisplayName("1 field") @Nested class Test1 {
                                   @Test void min()    { assertSame(emptyCollectionHolder(), newInstance(A).take(MIN_INT_VALUE)); }
                @DisplayName("-3") @Test void minus3() { assertSame(emptyCollectionHolder(), newInstance(A).take(-3)); }
                @DisplayName("-2") @Test void minus2() { assertSame(emptyCollectionHolder(), newInstance(A).take(-2)); }
                @DisplayName("-1") @Test void minus1() { assertSame(emptyCollectionHolder(), newInstance(A).take(-1)); }
                @DisplayName("0")  @Test void test0()  { assertSame(emptyCollectionHolder(), newInstance(A).take(0)); }
                @DisplayName("1")  @Test void test1()  { assertArrayEquals(A,                newInstance(A).take(1).toArray()); }
                @DisplayName("2")  @Test void test2()  { assertArrayEquals(A,                newInstance(A).take(2).toArray()); }
                                   @Test void max()    { assertArrayEquals(A,                newInstance(A).take(MAX_INT_VALUE).toArray()); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                                   @Test void min()    { assertSame(emptyCollectionHolder(), newInstance(AB).take(MIN_INT_VALUE)); }
                @DisplayName("-4") @Test void minus4() { assertSame(emptyCollectionHolder(), newInstance(AB).take(-4)); }
                @DisplayName("-3") @Test void minus3() { assertSame(emptyCollectionHolder(), newInstance(AB).take(-3)); }
                @DisplayName("-2") @Test void minus2() { assertSame(emptyCollectionHolder(), newInstance(AB).take(-2)); }
                @DisplayName("-1") @Test void minus1() { assertArrayEquals(A,                newInstance(AB).take(-1).toArray()); }
                @DisplayName("0")  @Test void test0()  { assertSame(emptyCollectionHolder(), newInstance(AB).take(0)); }
                @DisplayName("1")  @Test void test1()  { assertArrayEquals(A,                newInstance(AB).take(1).toArray()); }
                @DisplayName("2")  @Test void test2()  { assertArrayEquals(AB,               newInstance(AB).take(2).toArray()); }
                @DisplayName("3")  @Test void test3()  { assertArrayEquals(AB,               newInstance(AB).take(3).toArray()); }
                                   @Test void max()    { assertArrayEquals(AB,               newInstance(AB).take(MAX_INT_VALUE).toArray()); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                                   @Test void min()    { assertSame(emptyCollectionHolder(), newInstance(ABCD).take(MIN_INT_VALUE)); }
                @DisplayName("-6") @Test void minus6() { assertSame(emptyCollectionHolder(), newInstance(ABCD).take(-6)); }
                @DisplayName("-5") @Test void minus5() { assertSame(emptyCollectionHolder(), newInstance(ABCD).take(-5)); }
                @DisplayName("-4") @Test void minus4() { assertSame(emptyCollectionHolder(), newInstance(ABCD).take(-4)); }
                @DisplayName("-3") @Test void minus3() { assertArrayEquals(A,                newInstance(ABCD).take(-3).toArray()); }
                @DisplayName("-2") @Test void minus2() { assertArrayEquals(AB,               newInstance(ABCD).take(-2).toArray()); }
                @DisplayName("-1") @Test void minus1() { assertArrayEquals(ABC,              newInstance(ABCD).take(-1).toArray()); }
                @DisplayName("0")  @Test void test0()  { assertSame(emptyCollectionHolder(), newInstance(ABCD).take(0)); }
                @DisplayName("1")  @Test void test1()  { assertArrayEquals(A,                newInstance(ABCD).take(1).toArray()); }
                @DisplayName("2")  @Test void test2()  { assertArrayEquals(AB,               newInstance(ABCD).take(2).toArray()); }
                @DisplayName("3")  @Test void test3()  { assertArrayEquals(ABC,              newInstance(ABCD).take(3).toArray()); }
                @DisplayName("4")  @Test void test4()  { assertArrayEquals(ABCD,             newInstance(ABCD).take(4).toArray()); }
                @DisplayName("5")  @Test void test5()  { assertArrayEquals(ABCD,             newInstance(ABCD).take(5).toArray()); }
                                   @Test void max()    { assertArrayEquals(ABCD,             newInstance(ABCD).take(MAX_INT_VALUE).toArray()); }
            }
        }
        @TestInstance(PER_CLASS) @Nested class takeWhile {
            @Nested class empty {
                @DisplayName("(T, int) → boolean")  @Test void test2Arg() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).takeWhile(predicate2AsFail)); }
                @DisplayName("(T) → boolean")       @Test void test1Arg() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).takeWhile(predicate1AsFail)); }
                @DisplayName("() → boolean")        @Test void test0Arg() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).takeWhile(predicate0AsFail)); }
            }
            @DisplayName("boolean callbacks") @TestInstance(PER_CLASS) @Nested class BooleanCallbacks {
                @DisplayName("1 field: (T, int) → true")   @Test void test1_2True()  { assertArrayEquals(A,    newInstance(A)   .takeWhile(callback2AsTrue).toArray()); }
                @DisplayName("1 field: (T) → true")        @Test void test1_1True()  { assertArrayEquals(A,    newInstance(A)   .takeWhile(callback1AsTrue).toArray()); }
                @DisplayName("1 field: () → true")         @Test void test1_0True()  { assertArrayEquals(A,    newInstance(A)   .takeWhile(callback0AsTrue).toArray()); }
                @DisplayName("1 field: (T, int) → false")  @Test void test1_2False() { assertTrue(             newInstance(A)   .takeWhile(callback2AsFalse).isEmpty()); }
                @DisplayName("1 field: (T) → false")       @Test void test1_1False() { assertTrue(             newInstance(A)   .takeWhile(callback1AsFalse).isEmpty()); }
                @DisplayName("1 field: () → false")        @Test void test1_0False() { assertTrue(             newInstance(A)   .takeWhile(callback0AsFalse).isEmpty()); }
                @DisplayName("2 fields: (T, int) → true")  @Test void test2_2True()  { assertArrayEquals(AB,   newInstance(AB)  .takeWhile(callback2AsTrue).toArray()); }
                @DisplayName("2 fields: (T) → true")       @Test void test2_1True()  { assertArrayEquals(AB,   newInstance(AB)  .takeWhile(callback1AsTrue).toArray()); }
                @DisplayName("2 fields: () → true")        @Test void test2_0True()  { assertArrayEquals(AB,   newInstance(AB)  .takeWhile(callback0AsTrue).toArray()); }
                @DisplayName("2 fields: (T, int) → false") @Test void test2_2False() { assertTrue(             newInstance(AB)  .takeWhile(callback2AsFalse).isEmpty()); }
                @DisplayName("2 fields: (T) → false")      @Test void test2_1False() { assertTrue(             newInstance(AB)  .takeWhile(callback1AsFalse).isEmpty()); }
                @DisplayName("2 fields: () → false")       @Test void test2_0False() { assertTrue(             newInstance(AB)  .takeWhile(callback0AsFalse).isEmpty()); }
                @DisplayName("4 fields: (T, int) → true")  @Test void test4_2True()  { assertArrayEquals(ABCD, newInstance(ABCD).takeWhile(callback2AsTrue).toArray()); }
                @DisplayName("4 fields: (T) → true")       @Test void test4_1True()  { assertArrayEquals(ABCD, newInstance(ABCD).takeWhile(callback1AsTrue).toArray()); }
                @DisplayName("4 fields: () → true")        @Test void test4_0True()  { assertArrayEquals(ABCD, newInstance(ABCD).takeWhile(callback0AsTrue).toArray()); }
                @DisplayName("4 fields: (T, int) → false") @Test void test4_2False() { assertTrue(             newInstance(ABCD).takeWhile(callback2AsFalse).isEmpty()); }
                @DisplayName("4 fields: (T) → false")      @Test void test4_1False() { assertTrue(             newInstance(ABCD).takeWhile(callback1AsFalse).isEmpty()); }
                @DisplayName("4 fields: () → false")       @Test void test4_0False() { assertTrue(             newInstance(ABCD).takeWhile(callback0AsFalse).isEmpty()); }
            }
            @DisplayName("1 field") @Nested class Test1 {
                @DisplayName("under a") @Test void under_a() { assertTrue(          newInstance(A).takeWhile(callbackIsUnderA).isEmpty()); }
                @DisplayName("under b") @Test void under_e() { assertArrayEquals(A, newInstance(A).takeWhile(callbackIsUnderE).toArray()); }
                @DisplayName("under 0") @Test void under_0() { assertTrue(          newInstance(A).takeWhile(callbackIsUnder0Alt).isEmpty()); }
                @DisplayName("under 4") @Test void under_4() { assertArrayEquals(A, newInstance(A).takeWhile(callbackIsUnder4Alt).toArray()); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                @DisplayName("under a") @Test void under_a() { assertTrue(           newInstance(AB).takeWhile(callbackIsUnderA).isEmpty()); }
                @DisplayName("under b") @Test void under_b() { assertArrayEquals(A,  newInstance(AB).takeWhile(callbackIsUnderB).toArray()); }
                @DisplayName("under c") @Test void under_e() { assertArrayEquals(AB, newInstance(AB).takeWhile(callbackIsUnderE).toArray()); }
                @DisplayName("under 0") @Test void under_0() { assertTrue(           newInstance(AB).takeWhile(callbackIsUnder0Alt).isEmpty()); }
                @DisplayName("under 1") @Test void under_1() { assertArrayEquals(A,  newInstance(AB).takeWhile(callbackIsUnder1Alt).toArray()); }
                @DisplayName("under 2") @Test void under_4() { assertArrayEquals(AB, newInstance(AB).takeWhile(callbackIsUnder4Alt).toArray()); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                @DisplayName("under a") @Test void under_a() { assertTrue(             newInstance(ABCD).takeWhile(callbackIsUnderA).isEmpty()); }
                @DisplayName("under b") @Test void under_b() { assertArrayEquals(A,    newInstance(ABCD).takeWhile(callbackIsUnderB).toArray()); }
                @DisplayName("under c") @Test void under_c() { assertArrayEquals(AB,   newInstance(ABCD).takeWhile(callbackIsUnderC).toArray()); }
                @DisplayName("under d") @Test void under_d() { assertArrayEquals(ABC,  newInstance(ABCD).takeWhile(callbackIsUnderD).toArray()); }
                @DisplayName("under e") @Test void under_e() { assertArrayEquals(ABCD, newInstance(ABCD).takeWhile(callbackIsUnderE).toArray()); }
                @DisplayName("under 0") @Test void under_0() { assertTrue(             newInstance(ABCD).takeWhile(callbackIsUnder0Alt).isEmpty()); }
                @DisplayName("under 1") @Test void under_1() { assertArrayEquals(A,    newInstance(ABCD).takeWhile(callbackIsUnder1Alt).toArray()); }
                @DisplayName("under 2") @Test void under_2() { assertArrayEquals(AB,   newInstance(ABCD).takeWhile(callbackIsUnder2Alt).toArray()); }
                @DisplayName("under 3") @Test void under_3() { assertArrayEquals(ABC,  newInstance(ABCD).takeWhile(callbackIsUnder3Alt).toArray()); }
                @DisplayName("under 4") @Test void under_4() { assertArrayEquals(ABCD, newInstance(ABCD).takeWhile(callbackIsUnder4Alt).toArray()); }
            }
        }
        @TestInstance(PER_CLASS) @Nested class takeWhileIndexed {
            @Nested class empty {
                @DisplayName("(T, int) → boolean")  @Test void test2Arg() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).takeWhileIndexed(predicate2AltAsFail)); }
                @DisplayName("(T) → boolean")       @Test void test1Arg() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).takeWhileIndexed(predicate1AltAsFail)); }
                @DisplayName("() → boolean")        @Test void test0Arg() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).takeWhileIndexed(predicate0AsFail)); }
            }
            @DisplayName("boolean callbacks") @TestInstance(PER_CLASS) @Nested class BooleanCallbacks {
                @DisplayName("1 field: (T, int) → true")   @Test void test1_2True()  { assertArrayEquals(A,    newInstance(A)   .takeWhileIndexed(callback2AltAsTrue).toArray()); }
                @DisplayName("1 field: (T) → true")        @Test void test1_1True()  { assertArrayEquals(A,    newInstance(A)   .takeWhileIndexed(callback1AltAsTrue).toArray()); }
                @DisplayName("1 field: () → true")         @Test void test1_0True()  { assertArrayEquals(A,    newInstance(A)   .takeWhileIndexed(callback0AsTrue).toArray()); }
                @DisplayName("1 field: (T, int) → false")  @Test void test1_2False() { assertTrue(             newInstance(A)   .takeWhileIndexed(callback2AltAsFalse).isEmpty()); }
                @DisplayName("1 field: (T) → false")       @Test void test1_1False() { assertTrue(             newInstance(A)   .takeWhileIndexed(callback1AltAsFalse).isEmpty()); }
                @DisplayName("1 field: () → false")        @Test void test1_0False() { assertTrue(             newInstance(A)   .takeWhileIndexed(callback0AsFalse).isEmpty()); }
                @DisplayName("2 fields: (T, int) → true")  @Test void test2_2True()  { assertArrayEquals(AB,   newInstance(AB)  .takeWhileIndexed(callback2AltAsTrue).toArray()); }
                @DisplayName("2 fields: (T) → true")       @Test void test2_1True()  { assertArrayEquals(AB,   newInstance(AB)  .takeWhileIndexed(callback1AltAsTrue).toArray()); }
                @DisplayName("2 fields: () → true")        @Test void test2_0True()  { assertArrayEquals(AB,   newInstance(AB)  .takeWhileIndexed(callback0AsTrue).toArray()); }
                @DisplayName("2 fields: (T, int) → false") @Test void test2_2False() { assertTrue(             newInstance(AB)  .takeWhileIndexed(callback2AltAsFalse).isEmpty()); }
                @DisplayName("2 fields: (T) → false")      @Test void test2_1False() { assertTrue(             newInstance(AB)  .takeWhileIndexed(callback1AltAsFalse).isEmpty()); }
                @DisplayName("2 fields: () → false")       @Test void test2_0False() { assertTrue(             newInstance(AB)  .takeWhileIndexed(callback0AsFalse).isEmpty()); }
                @DisplayName("4 fields: (T, int) → true")  @Test void test4_2True()  { assertArrayEquals(ABCD, newInstance(ABCD).takeWhileIndexed(callback2AltAsTrue).toArray()); }
                @DisplayName("4 fields: (T) → true")       @Test void test4_1True()  { assertArrayEquals(ABCD, newInstance(ABCD).takeWhileIndexed(callback1AltAsTrue).toArray()); }
                @DisplayName("4 fields: () → true")        @Test void test4_0True()  { assertArrayEquals(ABCD, newInstance(ABCD).takeWhileIndexed(callback0AsTrue).toArray()); }
                @DisplayName("4 fields: (T, int) → false") @Test void test4_2False() { assertTrue(             newInstance(ABCD).takeWhileIndexed(callback2AltAsFalse).isEmpty()); }
                @DisplayName("4 fields: (T) → false")      @Test void test4_1False() { assertTrue(             newInstance(ABCD).takeWhileIndexed(callback1AltAsFalse).isEmpty()); }
                @DisplayName("4 fields: () → false")       @Test void test4_0False() { assertTrue(             newInstance(ABCD).takeWhileIndexed(callback0AsFalse).isEmpty()); }
            }
            @DisplayName("1 field") @Nested class Test1 {
                @DisplayName("under a") @Test void under_a() { assertTrue(          newInstance(A).takeWhileIndexed(callbackIsUnderAAlt).isEmpty()); }
                @DisplayName("under b") @Test void under_e() { assertArrayEquals(A, newInstance(A).takeWhileIndexed(callbackIsUnderEAlt).toArray()); }
                @DisplayName("under 0") @Test void under_0() { assertTrue(          newInstance(A).takeWhileIndexed(callbackIsUnder0).isEmpty()); }
                @DisplayName("under 4") @Test void under_4() { assertArrayEquals(A, newInstance(A).takeWhileIndexed(callbackIsUnder4).toArray()); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                @DisplayName("under a") @Test void under_a() { assertTrue(           newInstance(AB).takeWhileIndexed(callbackIsUnderAAlt).isEmpty()); }
                @DisplayName("under b") @Test void under_b() { assertArrayEquals(A,  newInstance(AB).takeWhileIndexed(callbackIsUnderBAlt).toArray()); }
                @DisplayName("under c") @Test void under_e() { assertArrayEquals(AB, newInstance(AB).takeWhileIndexed(callbackIsUnderEAlt).toArray()); }
                @DisplayName("under 0") @Test void under_0() { assertTrue(           newInstance(AB).takeWhileIndexed(callbackIsUnder0).isEmpty()); }
                @DisplayName("under 1") @Test void under_1() { assertArrayEquals(A,  newInstance(AB).takeWhileIndexed(callbackIsUnder1).toArray()); }
                @DisplayName("under 2") @Test void under_4() { assertArrayEquals(AB, newInstance(AB).takeWhileIndexed(callbackIsUnder4).toArray()); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                @DisplayName("under a") @Test void under_a() { assertTrue(             newInstance(ABCD).takeWhileIndexed(callbackIsUnderAAlt).isEmpty()); }
                @DisplayName("under b") @Test void under_b() { assertArrayEquals(A,    newInstance(ABCD).takeWhileIndexed(callbackIsUnderBAlt).toArray()); }
                @DisplayName("under c") @Test void under_c() { assertArrayEquals(AB,   newInstance(ABCD).takeWhileIndexed(callbackIsUnderCAlt).toArray()); }
                @DisplayName("under d") @Test void under_d() { assertArrayEquals(ABC,  newInstance(ABCD).takeWhileIndexed(callbackIsUnderDAlt).toArray()); }
                @DisplayName("under e") @Test void under_e() { assertArrayEquals(ABCD, newInstance(ABCD).takeWhileIndexed(callbackIsUnderEAlt).toArray()); }
                @DisplayName("under 0") @Test void under_0() { assertTrue(             newInstance(ABCD).takeWhileIndexed(callbackIsUnder0).isEmpty()); }
                @DisplayName("under 1") @Test void under_1() { assertArrayEquals(A,    newInstance(ABCD).takeWhileIndexed(callbackIsUnder1).toArray()); }
                @DisplayName("under 2") @Test void under_2() { assertArrayEquals(AB,   newInstance(ABCD).takeWhileIndexed(callbackIsUnder2).toArray()); }
                @DisplayName("under 3") @Test void under_3() { assertArrayEquals(ABC,  newInstance(ABCD).takeWhileIndexed(callbackIsUnder3).toArray()); }
                @DisplayName("under 4") @Test void under_4() { assertArrayEquals(ABCD, newInstance(ABCD).takeWhileIndexed(callbackIsUnder4).toArray()); }
            }
        }

        @TestInstance(PER_CLASS) @Nested class takeLast {
            @Nested class empty {
                                   @Test void min()    { assertSame(emptyCollectionHolder(), newInstance(A).takeLast(MIN_INT_VALUE)); }
                @DisplayName("-2") @Test void minus2() { assertSame(emptyCollectionHolder(), newInstance(A).takeLast(-2)); }
                @DisplayName("-1") @Test void minus1() { assertSame(emptyCollectionHolder(), newInstance(A).takeLast(-1)); }
                @DisplayName("0")  @Test void test0()  { assertSame(emptyCollectionHolder(), newInstance(A).takeLast(0)); }
                @DisplayName("1")  @Test void test1()  { assertArrayEquals(A,                newInstance(A).takeLast(1).toArray()); }
                                   @Test void max()    { assertArrayEquals(A,                newInstance(A).takeLast(MAX_INT_VALUE).toArray()); }
            }
            @DisplayName("1 field") @Nested class Test1 {
                                   @Test void min()    { assertSame(emptyCollectionHolder(), newInstance(A).takeLast(MIN_INT_VALUE)); }
                @DisplayName("-3") @Test void minus3() { assertSame(emptyCollectionHolder(), newInstance(A).takeLast(-3)); }
                @DisplayName("-2") @Test void minus2() { assertSame(emptyCollectionHolder(), newInstance(A).takeLast(-2)); }
                @DisplayName("-1") @Test void minus1() { assertSame(emptyCollectionHolder(), newInstance(A).takeLast(-1)); }
                @DisplayName("0")  @Test void test0()  { assertSame(emptyCollectionHolder(), newInstance(A).takeLast(0)); }
                @DisplayName("1")  @Test void test1()  { assertArrayEquals(A,                newInstance(A).takeLast(1).toArray()); }
                @DisplayName("2")  @Test void test2()  { assertArrayEquals(A,                newInstance(A).takeLast(2).toArray()); }
                                   @Test void max()    { assertArrayEquals(A,                newInstance(A).takeLast(MAX_INT_VALUE).toArray()); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                                   @Test void min()    { assertSame(emptyCollectionHolder(), newInstance(AB).takeLast(MIN_INT_VALUE)); }
                @DisplayName("-4") @Test void minus4() { assertSame(emptyCollectionHolder(), newInstance(AB).takeLast(-4)); }
                @DisplayName("-3") @Test void minus3() { assertSame(emptyCollectionHolder(), newInstance(AB).takeLast(-3)); }
                @DisplayName("-2") @Test void minus2() { assertSame(emptyCollectionHolder(), newInstance(AB).takeLast(-2)); }
                @DisplayName("-1") @Test void minus1() { assertArrayEquals(B,                newInstance(AB).takeLast(-1).toArray()); }
                @DisplayName("0")  @Test void test0()  { assertSame(emptyCollectionHolder(), newInstance(AB).takeLast(0)); }
                @DisplayName("1")  @Test void test1()  { assertArrayEquals(B,                newInstance(AB).takeLast(1).toArray()); }
                @DisplayName("2")  @Test void test2()  { assertArrayEquals(AB,               newInstance(AB).takeLast(2).toArray()); }
                @DisplayName("3")  @Test void test3()  { assertArrayEquals(AB,               newInstance(AB).takeLast(3).toArray()); }
                                   @Test void max()    { assertArrayEquals(AB,               newInstance(AB).takeLast(MAX_INT_VALUE).toArray()); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                                   @Test void min()    { assertSame(emptyCollectionHolder(), newInstance(ABCD).takeLast(MIN_INT_VALUE)); }
                @DisplayName("-6") @Test void minus6() { assertSame(emptyCollectionHolder(), newInstance(ABCD).takeLast(-6)); }
                @DisplayName("-5") @Test void minus5() { assertSame(emptyCollectionHolder(), newInstance(ABCD).takeLast(-5)); }
                @DisplayName("-4") @Test void minus4() { assertSame(emptyCollectionHolder(), newInstance(ABCD).takeLast(-4)); }
                @DisplayName("-3") @Test void minus3() { assertArrayEquals(D,                newInstance(ABCD).takeLast(-3).toArray()); }
                @DisplayName("-2") @Test void minus2() { assertArrayEquals(CD,               newInstance(ABCD).takeLast(-2).toArray()); }
                @DisplayName("-1") @Test void minus1() { assertArrayEquals(BCD,              newInstance(ABCD).takeLast(-1).toArray()); }
                @DisplayName("0")  @Test void test0()  { assertSame(emptyCollectionHolder(), newInstance(ABCD).takeLast(0)); }
                @DisplayName("1")  @Test void test1()  { assertArrayEquals(D,                newInstance(ABCD).takeLast(1).toArray()); }
                @DisplayName("2")  @Test void test2()  { assertArrayEquals(CD,               newInstance(ABCD).takeLast(2).toArray()); }
                @DisplayName("3")  @Test void test3()  { assertArrayEquals(BCD,              newInstance(ABCD).takeLast(3).toArray()); }
                @DisplayName("4")  @Test void test4()  { assertArrayEquals(ABCD,             newInstance(ABCD).takeLast(4).toArray()); }
                @DisplayName("5")  @Test void test5()  { assertArrayEquals(ABCD,             newInstance(ABCD).takeLast(5).toArray()); }
                                   @Test void max()    { assertArrayEquals(ABCD,             newInstance(ABCD).takeLast(MAX_INT_VALUE).toArray()); }
            }
        }
        @TestInstance(PER_CLASS) @Nested class takeLastWhile {
            @Nested class empty {
                @DisplayName("(T, int) → boolean")  @Test void test2Arg() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).takeLastWhile(predicate2AsFail)); }
                @DisplayName("(T) → boolean")       @Test void test1Arg() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).takeLastWhile(predicate1AsFail)); }
                @DisplayName("() → boolean")        @Test void test0Arg() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).takeLastWhile(predicate0AsFail)); }
            }
            @DisplayName("boolean callbacks") @TestInstance(PER_CLASS) @Nested class BooleanCallbacks {
                @DisplayName("1 field: (T, int) → true")   @Test void test1_2True()  { assertArrayEquals(A,    newInstance(A)   .takeLastWhile(callback2AsTrue).toArray()); }
                @DisplayName("1 field: (T) → true")        @Test void test1_1True()  { assertArrayEquals(A,    newInstance(A)   .takeLastWhile(callback1AsTrue).toArray()); }
                @DisplayName("1 field: () → true")         @Test void test1_0True()  { assertArrayEquals(A,    newInstance(A)   .takeLastWhile(callback0AsTrue).toArray()); }
                @DisplayName("1 field: (T, int) → false")  @Test void test1_2False() { assertTrue(             newInstance(A)   .takeLastWhile(callback2AsFalse).isEmpty()); }
                @DisplayName("1 field: (T) → false")       @Test void test1_1False() { assertTrue(             newInstance(A)   .takeLastWhile(callback1AsFalse).isEmpty()); }
                @DisplayName("1 field: () → false")        @Test void test1_0False() { assertTrue(             newInstance(A)   .takeLastWhile(callback0AsFalse).isEmpty()); }
                @DisplayName("2 fields: (T, int) → true")  @Test void test2_2True()  { assertArrayEquals(AB,   newInstance(AB)  .takeLastWhile(callback2AsTrue).toArray()); }
                @DisplayName("2 fields: (T) → true")       @Test void test2_1True()  { assertArrayEquals(AB,   newInstance(AB)  .takeLastWhile(callback1AsTrue).toArray()); }
                @DisplayName("2 fields: () → true")        @Test void test2_0True()  { assertArrayEquals(AB,   newInstance(AB)  .takeLastWhile(callback0AsTrue).toArray()); }
                @DisplayName("2 fields: (T, int) → false") @Test void test2_2False() { assertTrue(             newInstance(AB)  .takeLastWhile(callback2AsFalse).isEmpty()); }
                @DisplayName("2 fields: (T) → false")      @Test void test2_1False() { assertTrue(             newInstance(AB)  .takeLastWhile(callback1AsFalse).isEmpty()); }
                @DisplayName("2 fields: () → false")       @Test void test2_0False() { assertTrue(             newInstance(AB)  .takeLastWhile(callback0AsFalse).isEmpty()); }
                @DisplayName("4 fields: (T, int) → true")  @Test void test4_2True()  { assertArrayEquals(ABCD, newInstance(ABCD).takeLastWhile(callback2AsTrue).toArray()); }
                @DisplayName("4 fields: (T) → true")       @Test void test4_1True()  { assertArrayEquals(ABCD, newInstance(ABCD).takeLastWhile(callback1AsTrue).toArray()); }
                @DisplayName("4 fields: () → true")        @Test void test4_0True()  { assertArrayEquals(ABCD, newInstance(ABCD).takeLastWhile(callback0AsTrue).toArray()); }
                @DisplayName("4 fields: (T, int) → false") @Test void test4_2False() { assertTrue(             newInstance(ABCD).takeLastWhile(callback2AsFalse).isEmpty()); }
                @DisplayName("4 fields: (T) → false")      @Test void test4_1False() { assertTrue(             newInstance(ABCD).takeLastWhile(callback1AsFalse).isEmpty()); }
                @DisplayName("4 fields: () → false")       @Test void test4_0False() { assertTrue(             newInstance(ABCD).takeLastWhile(callback0AsFalse).isEmpty()); }
            }
            @DisplayName("1 field") @Nested class Test1 {
                @DisplayName("over a") @Test void over_a() { assertTrue(newInstance(A).takeLastWhile(callbackIsOverA).isEmpty()); }
                @DisplayName("over b") @Test void over_e() { assertTrue(newInstance(A).takeLastWhile(callbackIsOverE).isEmpty()); }
                @DisplayName("over 0") @Test void over_0() { assertTrue(newInstance(A).takeLastWhile(callbackIsOver0Alt).isEmpty()); }
                @DisplayName("over 4") @Test void over_4() { assertTrue(newInstance(A).takeLastWhile(callbackIsOver4Alt).isEmpty()); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                @DisplayName("over a") @Test void over_a() { assertArrayEquals(B, newInstance(AB).takeLastWhile(callbackIsOverA).toArray()); }
                @DisplayName("over b") @Test void over_b() { assertTrue(          newInstance(AB).takeLastWhile(callbackIsOverB).isEmpty()); }
                @DisplayName("over c") @Test void over_e() { assertTrue(          newInstance(AB).takeLastWhile(callbackIsOverE).isEmpty()); }
                @DisplayName("over 0") @Test void over_0() { assertArrayEquals(B, newInstance(AB).takeLastWhile(callbackIsOver0Alt).toArray()); }
                @DisplayName("over 1") @Test void over_1() { assertTrue(          newInstance(AB).takeLastWhile(callbackIsOver1Alt).isEmpty()); }
                @DisplayName("over 2") @Test void over_4() { assertTrue(          newInstance(AB).takeLastWhile(callbackIsOver4Alt).isEmpty()); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                @DisplayName("over a") @Test void over_a() { assertArrayEquals(BCD, newInstance(ABCD).takeLastWhile(callbackIsOverA).toArray()); }
                @DisplayName("over b") @Test void over_b() { assertArrayEquals(CD,  newInstance(ABCD).takeLastWhile(callbackIsOverB).toArray()); }
                @DisplayName("over c") @Test void over_c() { assertArrayEquals(D,   newInstance(ABCD).takeLastWhile(callbackIsOverC).toArray()); }
                @DisplayName("over d") @Test void over_d() { assertTrue(            newInstance(ABCD).takeLastWhile(callbackIsOverD).isEmpty()); }
                @DisplayName("over e") @Test void over_e() { assertTrue(            newInstance(ABCD).takeLastWhile(callbackIsOverE).isEmpty()); }
                @DisplayName("over 0") @Test void over_0() { assertArrayEquals(BCD, newInstance(ABCD).takeLastWhile(callbackIsOver0Alt).toArray()); }
                @DisplayName("over 1") @Test void over_1() { assertArrayEquals(CD,  newInstance(ABCD).takeLastWhile(callbackIsOver1Alt).toArray()); }
                @DisplayName("over 2") @Test void over_2() { assertArrayEquals(D,   newInstance(ABCD).takeLastWhile(callbackIsOver2Alt).toArray()); }
                @DisplayName("over 3") @Test void over_3() { assertTrue(            newInstance(ABCD).takeLastWhile(callbackIsOver3Alt).isEmpty()); }
                @DisplayName("over 4") @Test void over_4() { assertTrue(            newInstance(ABCD).takeLastWhile(callbackIsOver4Alt).isEmpty()); }
            }
        }
        @TestInstance(PER_CLASS) @Nested class takeLastWhileIndexed {
            @Nested class empty {
                @DisplayName("(T, int) → boolean")  @Test void test2Arg() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).takeLastWhileIndexed(predicate2AltAsFail)); }
                @DisplayName("(T) → boolean")       @Test void test1Arg() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).takeLastWhileIndexed(predicate1AltAsFail)); }
                @DisplayName("() → boolean")        @Test void test0Arg() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).takeLastWhileIndexed(predicate0AsFail)); }
            }
            @DisplayName("boolean callbacks") @TestInstance(PER_CLASS) @Nested class BooleanCallbacks {
                @DisplayName("1 field: (T, int) → true")   @Test void test1_2True()  { assertArrayEquals(A,    newInstance(A)   .takeLastWhileIndexed(callback2AltAsTrue).toArray()); }
                @DisplayName("1 field: (T) → true")        @Test void test1_1True()  { assertArrayEquals(A,    newInstance(A)   .takeLastWhileIndexed(callback1AltAsTrue).toArray()); }
                @DisplayName("1 field: () → true")         @Test void test1_0True()  { assertArrayEquals(A,    newInstance(A)   .takeLastWhileIndexed(callback0AsTrue).toArray()); }
                @DisplayName("1 field: (T, int) → false")  @Test void test1_2False() { assertTrue(             newInstance(A)   .takeLastWhileIndexed(callback2AltAsFalse).isEmpty()); }
                @DisplayName("1 field: (T) → false")       @Test void test1_1False() { assertTrue(             newInstance(A)   .takeLastWhileIndexed(callback1AltAsFalse).isEmpty()); }
                @DisplayName("1 field: () → false")        @Test void test1_0False() { assertTrue(             newInstance(A)   .takeLastWhileIndexed(callback0AsFalse).isEmpty()); }
                @DisplayName("2 fields: (T, int) → true")  @Test void test2_2True()  { assertArrayEquals(AB,   newInstance(AB)  .takeLastWhileIndexed(callback2AltAsTrue).toArray()); }
                @DisplayName("2 fields: (T) → true")       @Test void test2_1True()  { assertArrayEquals(AB,   newInstance(AB)  .takeLastWhileIndexed(callback1AltAsTrue).toArray()); }
                @DisplayName("2 fields: () → true")        @Test void test2_0True()  { assertArrayEquals(AB,   newInstance(AB)  .takeLastWhileIndexed(callback0AsTrue).toArray()); }
                @DisplayName("2 fields: (T, int) → false") @Test void test2_2False() { assertTrue(             newInstance(AB)  .takeLastWhileIndexed(callback2AltAsFalse).isEmpty()); }
                @DisplayName("2 fields: (T) → false")      @Test void test2_1False() { assertTrue(             newInstance(AB)  .takeLastWhileIndexed(callback1AltAsFalse).isEmpty()); }
                @DisplayName("2 fields: () → false")       @Test void test2_0False() { assertTrue(             newInstance(AB)  .takeLastWhileIndexed(callback0AsFalse).isEmpty()); }
                @DisplayName("4 fields: (T, int) → true")  @Test void test4_2True()  { assertArrayEquals(ABCD, newInstance(ABCD).takeLastWhileIndexed(callback2AltAsTrue).toArray()); }
                @DisplayName("4 fields: (T) → true")       @Test void test4_1True()  { assertArrayEquals(ABCD, newInstance(ABCD).takeLastWhileIndexed(callback1AltAsTrue).toArray()); }
                @DisplayName("4 fields: () → true")        @Test void test4_0True()  { assertArrayEquals(ABCD, newInstance(ABCD).takeLastWhileIndexed(callback0AsTrue).toArray()); }
                @DisplayName("4 fields: (T, int) → false") @Test void test4_2False() { assertTrue(             newInstance(ABCD).takeLastWhileIndexed(callback2AltAsFalse).isEmpty()); }
                @DisplayName("4 fields: (T) → false")      @Test void test4_1False() { assertTrue(             newInstance(ABCD).takeLastWhileIndexed(callback1AltAsFalse).isEmpty()); }
                @DisplayName("4 fields: () → false")       @Test void test4_0False() { assertTrue(             newInstance(ABCD).takeLastWhileIndexed(callback0AsFalse).isEmpty()); }
            }
            @DisplayName("1 field") @Nested class Test1 {
                @DisplayName("over a") @Test void over_a() { assertTrue(newInstance(A).takeLastWhileIndexed(callbackIsOverAAlt).isEmpty()); }
                @DisplayName("over b") @Test void over_e() { assertTrue(newInstance(A).takeLastWhileIndexed(callbackIsOverEAlt).isEmpty()); }
                @DisplayName("over 0") @Test void over_0() { assertTrue(newInstance(A).takeLastWhileIndexed(callbackIsOver0).isEmpty()); }
                @DisplayName("over 4") @Test void over_4() { assertTrue(newInstance(A).takeLastWhileIndexed(callbackIsOver4).isEmpty()); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                @DisplayName("over a") @Test void over_a() { assertArrayEquals(B, newInstance(AB).takeLastWhileIndexed(callbackIsOverAAlt).toArray()); }
                @DisplayName("over b") @Test void over_b() { assertTrue(          newInstance(AB).takeLastWhileIndexed(callbackIsOverBAlt).isEmpty()); }
                @DisplayName("over c") @Test void over_e() { assertTrue(          newInstance(AB).takeLastWhileIndexed(callbackIsOverEAlt).isEmpty()); }
                @DisplayName("over 0") @Test void over_0() { assertArrayEquals(B, newInstance(AB).takeLastWhileIndexed(callbackIsOver0).toArray()); }
                @DisplayName("over 1") @Test void over_1() { assertTrue(          newInstance(AB).takeLastWhileIndexed(callbackIsOver1).isEmpty()); }
                @DisplayName("over 2") @Test void over_4() { assertTrue(          newInstance(AB).takeLastWhileIndexed(callbackIsOver4).isEmpty()); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                @DisplayName("over a") @Test void over_a() { assertArrayEquals(BCD, newInstance(ABCD).takeLastWhileIndexed(callbackIsOverAAlt).toArray()); }
                @DisplayName("over b") @Test void over_b() { assertArrayEquals(CD,  newInstance(ABCD).takeLastWhileIndexed(callbackIsOverBAlt).toArray()); }
                @DisplayName("over c") @Test void over_c() { assertArrayEquals(D,   newInstance(ABCD).takeLastWhileIndexed(callbackIsOverCAlt).toArray()); }
                @DisplayName("over d") @Test void over_d() { assertTrue(            newInstance(ABCD).takeLastWhileIndexed(callbackIsOverDAlt).isEmpty()); }
                @DisplayName("over e") @Test void over_e() { assertTrue(            newInstance(ABCD).takeLastWhileIndexed(callbackIsOverEAlt).isEmpty()); }
                @DisplayName("over 0") @Test void over_0() { assertArrayEquals(BCD, newInstance(ABCD).takeLastWhileIndexed(callbackIsOver0).toArray()); }
                @DisplayName("over 1") @Test void over_1() { assertArrayEquals(CD,  newInstance(ABCD).takeLastWhileIndexed(callbackIsOver1).toArray()); }
                @DisplayName("over 2") @Test void over_2() { assertArrayEquals(D,   newInstance(ABCD).takeLastWhileIndexed(callbackIsOver2).toArray()); }
                @DisplayName("over 3") @Test void over_3() { assertTrue(            newInstance(ABCD).takeLastWhileIndexed(callbackIsOver3).isEmpty()); }
                @DisplayName("over 4") @Test void over_4() { assertTrue(            newInstance(ABCD).takeLastWhileIndexed(callbackIsOver4).isEmpty()); }
            }
        }

    }

}

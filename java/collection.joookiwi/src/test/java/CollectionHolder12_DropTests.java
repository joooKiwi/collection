import condition.DisableIfNormalCondition;
import condition.DisableIfNormalViewerCondition;
import instance.CollectionHolderForTest;
import instance.GenericCollectionHolder_DropAlias;
import instance.GenericCollectionHolder_DropLastAlias;
import instance.GenericCollectionHolder_DropLastWhileAlias;
import instance.GenericCollectionHolder_DropLastWhileIndexedAlias;
import instance.GenericCollectionHolder_DropWhileAlias;
import instance.GenericCollectionHolder_DropWhileIndexedAlias;
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
import static value.Arrays.*;
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
import static value.Callbacks_Numeric.*;
import static value.Callbacks_String.*;
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
@DisplayName("CollectionHolder tests (drop)") @TestInstance(PER_CLASS) class CollectionHolder12_DropTests {

    @TestInstance(PER_CLASS) @Nested class EmptyCollectionHolder extends AbstractEmptyCollectionHolderTests {
        @Nested class drop {
            @DisplayName("∅")           @Test void testEmpty()         { assertSame(instance, instance.drop()); }
            @DisplayName("null object") @Test void testNullObject()    { assertSame(instance, instance.drop(NULL_OBJECT)); }
            @DisplayName("null string") @Test void testNullString()    { assertSame(instance, instance.drop(NULL_STRING)); }
            @DisplayName("null []")     @Test void testNullArray()     { assertSame(instance, instance.drop(NULL_VARARGS)); }
            @DisplayName("byte")        @Test void testByte()          { assertSame(instance, instance.drop((byte) 0)); }
            @DisplayName("short")       @Test void testShort()         { assertSame(instance, instance.drop((short) 0)); }
            @DisplayName("int")         @Test void testInt()           { assertSame(instance, instance.drop(0)); }
            @DisplayName("long")        @Test void testLong()          { assertSame(instance, instance.drop(0L)); }
            @DisplayName("float")       @Test void testFloat()         { assertSame(instance, instance.drop(0.0F)); }
            @DisplayName("double")      @Test void testDouble()        { assertSame(instance, instance.drop(0.0D)); }
                                        @Test void Byte()              { assertSame(instance, instance.drop(NULL_BYTE)); }
                                        @Test void Short()             { assertSame(instance, instance.drop(NULL_SHORT)); }
                                        @Test void Integer()           { assertSame(instance, instance.drop(NULL_INT)); }
                                        @Test void Long()              { assertSame(instance, instance.drop(NULL_LONG)); }
                                        @Test void Float()             { assertSame(instance, instance.drop(NULL_FLOAT)); }
                                        @Test void Double()            { assertSame(instance, instance.drop(NULL_DOUBLE)); }
                                        @Test void BigInteger()        { assertSame(instance, instance.drop(NULL_BIG_INTEGER)); }
                                        @Test void BigDecimal()        { assertSame(instance, instance.drop(NULL_BIG_DECIMAL)); }
                                        @Test void AtomicInteger()     { assertSame(instance, instance.drop(NULL_ATOMIC_INTEGER)); }
                                        @Test void AtomicLong()        { assertSame(instance, instance.drop(NULL_ATOMIC_LONG)); }
                                        @Test void LongAdder()         { assertSame(instance, instance.drop(NULL_LONG_ADDER)); }
                                        @Test void LongAccumulator()   { assertSame(instance, instance.drop(NULL_LONG_ACCUMULATOR)); }
                                        @Test void DoubleAdder()       { assertSame(instance, instance.drop(NULL_DOUBLE_ADDER)); }
                                        @Test void DoubleAccumulator() { assertSame(instance, instance.drop(NULL_DOUBLE_ACCUMULATOR)); }
                                        @Test void Number()            { assertSame(instance, instance.drop(NULL_NUMBER)); }
            @DisplayName("[]")          @Test void testArray()         { assertSame(instance, instance.drop(EMPTY_ARRAY)); }
        }
        @Nested class skip {
            @DisplayName("∅")           @Test void testEmpty()         { assertSame(instance, instance.skip()); }
            @DisplayName("null object") @Test void testNullObject()    { assertSame(instance, instance.skip(NULL_OBJECT)); }
            @DisplayName("null string") @Test void testNullString()    { assertSame(instance, instance.skip(NULL_STRING)); }
            @DisplayName("null []")     @Test void testNullArray()     { assertSame(instance, instance.skip(NULL_VARARGS)); }
            @DisplayName("byte")        @Test void testByte()          { assertSame(instance, instance.skip((byte) 0)); }
            @DisplayName("short")       @Test void testShort()         { assertSame(instance, instance.skip((short) 0)); }
            @DisplayName("int")         @Test void testInt()           { assertSame(instance, instance.skip(0)); }
            @DisplayName("long")        @Test void testLong()          { assertSame(instance, instance.skip(0L)); }
            @DisplayName("float")       @Test void testFloat()         { assertSame(instance, instance.skip(0.0F)); }
            @DisplayName("double")      @Test void testDouble()        { assertSame(instance, instance.skip(0.0D)); }
                                        @Test void Byte()              { assertSame(instance, instance.skip(NULL_BYTE)); }
                                        @Test void Short()             { assertSame(instance, instance.skip(NULL_SHORT)); }
                                        @Test void Integer()           { assertSame(instance, instance.skip(NULL_INT)); }
                                        @Test void Long()              { assertSame(instance, instance.skip(NULL_LONG)); }
                                        @Test void Float()             { assertSame(instance, instance.skip(NULL_FLOAT)); }
                                        @Test void Double()            { assertSame(instance, instance.skip(NULL_DOUBLE)); }
                                        @Test void BigInteger()        { assertSame(instance, instance.skip(NULL_BIG_INTEGER)); }
                                        @Test void BigDecimal()        { assertSame(instance, instance.skip(NULL_BIG_DECIMAL)); }
                                        @Test void AtomicInteger()     { assertSame(instance, instance.skip(NULL_ATOMIC_INTEGER)); }
                                        @Test void AtomicLong()        { assertSame(instance, instance.skip(NULL_ATOMIC_LONG)); }
                                        @Test void LongAdder()         { assertSame(instance, instance.skip(NULL_LONG_ADDER)); }
                                        @Test void LongAccumulator()   { assertSame(instance, instance.skip(NULL_LONG_ACCUMULATOR)); }
                                        @Test void DoubleAdder()       { assertSame(instance, instance.skip(NULL_DOUBLE_ADDER)); }
                                        @Test void DoubleAccumulator() { assertSame(instance, instance.skip(NULL_DOUBLE_ACCUMULATOR)); }
                                        @Test void Number()            { assertSame(instance, instance.skip(NULL_NUMBER)); }
            @DisplayName("[]")          @Test void testArray()         { assertSame(instance, instance.skip(EMPTY_ARRAY)); }
        }
        @Nested class dropWhile {
            @DisplayName("∅")                       @Test void testEmpty()     { assertSame(instance, instance.dropWhile()); }
            @DisplayName("null (T, int) → boolean") @Test void test2Arg()      { assertSame(instance, instance.dropWhile(NULL_PREDICATE2)); }
            @DisplayName("null (T) → boolean")      @Test void test1Arg()      { assertSame(instance, instance.dropWhile(NULL_PREDICATE1)); }
            @DisplayName("null () → boolean")       @Test void test0Arg()      { assertSame(instance, instance.dropWhile(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray() { assertSame(instance, instance.dropWhile(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()     { assertSame(instance, instance.dropWhile(EMPTY_ARRAY)); }
        }
        @Nested class skipWhile {
            @DisplayName("∅")                       @Test void testEmpty()     { assertSame(instance, instance.skipWhile()); }
            @DisplayName("null (T, int) → boolean") @Test void test2Arg()      { assertSame(instance, instance.skipWhile(NULL_PREDICATE2)); }
            @DisplayName("null (T) → boolean")      @Test void test1Arg()      { assertSame(instance, instance.skipWhile(NULL_PREDICATE1)); }
            @DisplayName("null () → boolean")       @Test void test0Arg()      { assertSame(instance, instance.skipWhile(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray() { assertSame(instance, instance.skipWhile(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()     { assertSame(instance, instance.skipWhile(EMPTY_ARRAY)); }
        }
        @Nested class dropWhileIndexed {
            @DisplayName("∅")                       @Test void testEmpty()     { assertSame(instance, instance.dropWhileIndexed()); }
            @DisplayName("null (T, int) → boolean") @Test void test2Arg()      { assertSame(instance, instance.dropWhileIndexed(NULL_PREDICATE2_ALT)); }
            @DisplayName("null (T) → boolean")      @Test void test1Arg()      { assertSame(instance, instance.dropWhileIndexed(NULL_PREDICATE1_ALT)); }
            @DisplayName("null () → boolean")       @Test void test0Arg()      { assertSame(instance, instance.dropWhileIndexed(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray() { assertSame(instance, instance.dropWhileIndexed(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()     { assertSame(instance, instance.dropWhileIndexed(EMPTY_ARRAY)); }
        }
        @Nested class skipWhileIndexed {
            @DisplayName("∅")                       @Test void testEmpty()     { assertSame(instance, instance.skipWhileIndexed()); }
            @DisplayName("null (T, int) → boolean") @Test void test2Arg()      { assertSame(instance, instance.skipWhileIndexed(NULL_PREDICATE2_ALT)); }
            @DisplayName("null (T) → boolean")      @Test void test1Arg()      { assertSame(instance, instance.skipWhileIndexed(NULL_PREDICATE1_ALT)); }
            @DisplayName("null () → boolean")       @Test void test0Arg()      { assertSame(instance, instance.skipWhileIndexed(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray() { assertSame(instance, instance.skipWhileIndexed(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()     { assertSame(instance, instance.skipWhileIndexed(EMPTY_ARRAY)); }
        }
        @Nested class dropLast {
            @DisplayName("∅")           @Test void testEmpty()         { assertSame(instance, instance.dropLast()); }
            @DisplayName("null object") @Test void testNullObject()    { assertSame(instance, instance.dropLast(NULL_OBJECT)); }
            @DisplayName("null string") @Test void testNullString()    { assertSame(instance, instance.dropLast(NULL_STRING)); }
            @DisplayName("null []")     @Test void testNullArray()     { assertSame(instance, instance.dropLast(NULL_VARARGS)); }
            @DisplayName("byte")        @Test void testByte()          { assertSame(instance, instance.dropLast((byte) 0)); }
            @DisplayName("short")       @Test void testShort()         { assertSame(instance, instance.dropLast((short) 0)); }
            @DisplayName("int")         @Test void testInt()           { assertSame(instance, instance.dropLast(0)); }
            @DisplayName("long")        @Test void testLong()          { assertSame(instance, instance.dropLast(0L)); }
            @DisplayName("float")       @Test void testFloat()         { assertSame(instance, instance.dropLast(0.0F)); }
            @DisplayName("double")      @Test void testDouble()        { assertSame(instance, instance.dropLast(0.0D)); }
                                        @Test void Byte()              { assertSame(instance, instance.dropLast(NULL_BYTE)); }
                                        @Test void Short()             { assertSame(instance, instance.dropLast(NULL_SHORT)); }
                                        @Test void Integer()           { assertSame(instance, instance.dropLast(NULL_INT)); }
                                        @Test void Long()              { assertSame(instance, instance.dropLast(NULL_LONG)); }
                                        @Test void Float()             { assertSame(instance, instance.dropLast(NULL_FLOAT)); }
                                        @Test void Double()            { assertSame(instance, instance.dropLast(NULL_DOUBLE)); }
                                        @Test void BigInteger()        { assertSame(instance, instance.dropLast(NULL_BIG_INTEGER)); }
                                        @Test void BigDecimal()        { assertSame(instance, instance.dropLast(NULL_BIG_DECIMAL)); }
                                        @Test void AtomicInteger()     { assertSame(instance, instance.dropLast(NULL_ATOMIC_INTEGER)); }
                                        @Test void AtomicLong()        { assertSame(instance, instance.dropLast(NULL_ATOMIC_LONG)); }
                                        @Test void LongAdder()         { assertSame(instance, instance.dropLast(NULL_LONG_ADDER)); }
                                        @Test void LongAccumulator()   { assertSame(instance, instance.dropLast(NULL_LONG_ACCUMULATOR)); }
                                        @Test void DoubleAdder()       { assertSame(instance, instance.dropLast(NULL_DOUBLE_ADDER)); }
                                        @Test void DoubleAccumulator() { assertSame(instance, instance.dropLast(NULL_DOUBLE_ACCUMULATOR)); }
                                        @Test void Number()            { assertSame(instance, instance.dropLast(NULL_NUMBER)); }
            @DisplayName("[]")          @Test void testArray()         { assertSame(instance, instance.dropLast(EMPTY_ARRAY)); }
        }
        @Nested class skipLast {
            @DisplayName("∅")           @Test void testEmpty()         { assertSame(instance, instance.skipLast()); }
            @DisplayName("null object") @Test void testNullObject()    { assertSame(instance, instance.skipLast(NULL_OBJECT)); }
            @DisplayName("null string") @Test void testNullString()    { assertSame(instance, instance.skipLast(NULL_STRING)); }
            @DisplayName("null []")     @Test void testNullArray()     { assertSame(instance, instance.skipLast(NULL_VARARGS)); }
            @DisplayName("byte")        @Test void testByte()          { assertSame(instance, instance.skipLast((byte) 0)); }
            @DisplayName("short")       @Test void testShort()         { assertSame(instance, instance.skipLast((short) 0)); }
            @DisplayName("int")         @Test void testInt()           { assertSame(instance, instance.skipLast(0)); }
            @DisplayName("long")        @Test void testLong()          { assertSame(instance, instance.skipLast(0L)); }
            @DisplayName("float")       @Test void testFloat()         { assertSame(instance, instance.skipLast(0.0F)); }
            @DisplayName("double")      @Test void testDouble()        { assertSame(instance, instance.skipLast(0.0D)); }
                                        @Test void Byte()              { assertSame(instance, instance.skipLast(NULL_BYTE)); }
                                        @Test void Short()             { assertSame(instance, instance.skipLast(NULL_SHORT)); }
                                        @Test void Integer()           { assertSame(instance, instance.skipLast(NULL_INT)); }
                                        @Test void Long()              { assertSame(instance, instance.skipLast(NULL_LONG)); }
                                        @Test void Float()             { assertSame(instance, instance.skipLast(NULL_FLOAT)); }
                                        @Test void Double()            { assertSame(instance, instance.skipLast(NULL_DOUBLE)); }
                                        @Test void BigInteger()        { assertSame(instance, instance.skipLast(NULL_BIG_INTEGER)); }
                                        @Test void BigDecimal()        { assertSame(instance, instance.skipLast(NULL_BIG_DECIMAL)); }
                                        @Test void AtomicInteger()     { assertSame(instance, instance.skipLast(NULL_ATOMIC_INTEGER)); }
                                        @Test void AtomicLong()        { assertSame(instance, instance.skipLast(NULL_ATOMIC_LONG)); }
                                        @Test void LongAdder()         { assertSame(instance, instance.skipLast(NULL_LONG_ADDER)); }
                                        @Test void LongAccumulator()   { assertSame(instance, instance.skipLast(NULL_LONG_ACCUMULATOR)); }
                                        @Test void DoubleAdder()       { assertSame(instance, instance.skipLast(NULL_DOUBLE_ADDER)); }
                                        @Test void DoubleAccumulator() { assertSame(instance, instance.skipLast(NULL_DOUBLE_ACCUMULATOR)); }
                                        @Test void Number()            { assertSame(instance, instance.skipLast(NULL_NUMBER)); }
            @DisplayName("[]")          @Test void testArray()         { assertSame(instance, instance.skipLast(EMPTY_ARRAY)); }
        }
        @Nested class dropLastWhile {
            @DisplayName("∅")                       @Test void testEmpty()     { assertSame(instance, instance.dropLastWhile()); }
            @DisplayName("null (T, int) → boolean") @Test void test2Arg()      { assertSame(instance, instance.dropLastWhile(NULL_PREDICATE2)); }
            @DisplayName("null (T) → boolean")      @Test void test1Arg()      { assertSame(instance, instance.dropLastWhile(NULL_PREDICATE1)); }
            @DisplayName("null () → boolean")       @Test void test0Arg()      { assertSame(instance, instance.dropLastWhile(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray() { assertSame(instance, instance.dropLastWhile(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()     { assertSame(instance, instance.dropLastWhile(EMPTY_ARRAY)); }
        }
        @Nested class skipLastWhile {
            @DisplayName("∅")                       @Test void testEmpty()     { assertSame(instance, instance.skipLastWhile()); }
            @DisplayName("null (T, int) → boolean") @Test void test2Arg()      { assertSame(instance, instance.skipLastWhile(NULL_PREDICATE2)); }
            @DisplayName("null (T) → boolean")      @Test void test1Arg()      { assertSame(instance, instance.skipLastWhile(NULL_PREDICATE1)); }
            @DisplayName("null () → boolean")       @Test void test0Arg()      { assertSame(instance, instance.skipLastWhile(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray() { assertSame(instance, instance.skipLastWhile(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()     { assertSame(instance, instance.skipLastWhile(EMPTY_ARRAY)); }
        }
        @Nested class dropLastWhileIndexed {
            @DisplayName("∅")                       @Test void testEmpty()     { assertSame(instance, instance.dropLastWhileIndexed()); }
            @DisplayName("null (T, int) → boolean") @Test void test2Arg()      { assertSame(instance, instance.dropLastWhileIndexed(NULL_PREDICATE2_ALT)); }
            @DisplayName("null (T) → boolean")      @Test void test1Arg()      { assertSame(instance, instance.dropLastWhileIndexed(NULL_PREDICATE1_ALT)); }
            @DisplayName("null () → boolean")       @Test void test0Arg()      { assertSame(instance, instance.dropLastWhileIndexed(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray() { assertSame(instance, instance.dropLastWhileIndexed(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()     { assertSame(instance, instance.dropLastWhileIndexed(EMPTY_ARRAY)); }
        }
        @Nested class skipLastWhileIndexed {
            @DisplayName("∅")                       @Test void testEmpty()     { assertSame(instance, instance.skipLastWhileIndexed()); }
            @DisplayName("null (T, int) → boolean") @Test void test2Arg()      { assertSame(instance, instance.skipLastWhileIndexed(NULL_PREDICATE2_ALT)); }
            @DisplayName("null (T) → boolean")      @Test void test1Arg()      { assertSame(instance, instance.skipLastWhileIndexed(NULL_PREDICATE1_ALT)); }
            @DisplayName("null () → boolean")       @Test void test0Arg()      { assertSame(instance, instance.skipLastWhileIndexed(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray() { assertSame(instance, instance.skipLastWhileIndexed(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()     { assertSame(instance, instance.skipLastWhileIndexed(EMPTY_ARRAY)); }
        }
    }

    @TestInstance(PER_CLASS) @Nested class aliases {
        @TestInstance(PER_CLASS) @Nested class GenericCollectionHolder {
            @Test void skip() { assertEquals(1, new GenericCollectionHolder_DropAlias().execute(it -> it.skip(0)).getAmountOfCall()); }
            @Nested class skipWhile {
                @DisplayName("(T, int) → boolean") @Test void test2Arg() { assertEquals(1, new GenericCollectionHolder_DropWhileAlias().execute(it -> it.skipWhile(callback2AsTrue)).getAmountOfCall()); }
                @DisplayName("(T) → boolean")      @Test void test1Arg() { assertEquals(1, new GenericCollectionHolder_DropWhileAlias().execute(it -> it.skipWhile(callback1AsTrue)).getAmountOfCall()); }
                @DisplayName("() → boolean")       @Test void test0Arg() { assertEquals(1, new GenericCollectionHolder_DropWhileAlias().execute(it -> it.skipWhile(callback0AsTrue)).getAmountOfCall()); }
            }
            @Nested class skipWhileIndexed {
                @DisplayName("(int, T) → boolean") @Test void test2Arg() { assertEquals(1, new GenericCollectionHolder_DropWhileIndexedAlias().execute(it -> it.skipWhileIndexed(callback2AltAsTrue)).getAmountOfCall()); }
                @DisplayName("(int) → boolean")    @Test void test1Arg() { assertEquals(1, new GenericCollectionHolder_DropWhileIndexedAlias().execute(it -> it.skipWhileIndexed(callback1AltAsTrue)).getAmountOfCall()); }
                @DisplayName("() → boolean")       @Test void test0Arg() { assertEquals(1, new GenericCollectionHolder_DropWhileIndexedAlias().execute(it -> it.skipWhileIndexed(callback0AsTrue)).getAmountOfCall()); }
            }

            @Test void skipLast() { assertEquals(1, new GenericCollectionHolder_DropLastAlias().execute(it -> it.skipLast(0)).getAmountOfCall()); }
            @Nested class skipLastWhile {
                @DisplayName("(T, int) → boolean") @Test void test2Arg() { assertEquals(1, new GenericCollectionHolder_DropLastWhileAlias().execute(it -> it.skipLastWhile(callback2AsTrue)).getAmountOfCall()); }
                @DisplayName("(T) → boolean")      @Test void test1Arg() { assertEquals(1, new GenericCollectionHolder_DropLastWhileAlias().execute(it -> it.skipLastWhile(callback1AsTrue)).getAmountOfCall()); }
                @DisplayName("() → boolean")       @Test void test0Arg() { assertEquals(1, new GenericCollectionHolder_DropLastWhileAlias().execute(it -> it.skipLastWhile(callback0AsTrue)).getAmountOfCall()); }
            }
            @Nested class skipLastWhileIndexed {
                @DisplayName("(int, T) → boolean") @Test void test2Arg() { assertEquals(1, new GenericCollectionHolder_DropLastWhileIndexedAlias().execute(it -> it.skipLastWhileIndexed(callback2AltAsTrue)).getAmountOfCall()); }
                @DisplayName("(int) → boolean")    @Test void test1Arg() { assertEquals(1, new GenericCollectionHolder_DropLastWhileIndexedAlias().execute(it -> it.skipLastWhileIndexed(callback1AltAsTrue)).getAmountOfCall()); }
                @DisplayName("() → boolean")       @Test void test0Arg() { assertEquals(1, new GenericCollectionHolder_DropLastWhileIndexedAlias().execute(it -> it.skipLastWhileIndexed(callback0AsTrue)).getAmountOfCall()); }
            }
        }

        //TODO add utility static method (drop) call to have been called

    }

    @FieldSource("value.Instances#everyExtensionMethodInstancesAsArguments")
    @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class methods extends AbstractMethodsTests {
        //#region -------------------- Required test configuration --------------------

        public methods(final CollectionHolderForTest<?, ?> instance) { super(instance); }

        //#endregion -------------------- Required test configuration --------------------

        @Nested class drop {
                               @Test void min()    { assertSame(emptyCollectionHolder(), instance.drop(MIN_INT_VALUE)); }
            @DisplayName("-2") @Test void minus2() { assertSame(emptyCollectionHolder(), instance.drop(-2)); }
            @DisplayName("-1") @Test void minus1() { assertSame(emptyCollectionHolder(), instance.drop(-1)); }
            @DisplayName("0")  @Test void test0()  { assertSame(emptyCollectionHolder(), instance.drop(0)); }
            @DisplayName("1")  @Test void test1()  { assertSame(emptyCollectionHolder(), instance.drop(1)); }
                               @Test void max()    { assertSame(emptyCollectionHolder(), instance.drop(MAX_INT_VALUE)); }
        }
        @Nested class dropWhile {
            @DisplayName("(T, int) → boolean") @Test void test2Arg() { assertSame(emptyCollectionHolder(), stringInstance.dropWhile(predicate2AsFail)); }
            @DisplayName("(T) → boolean")      @Test void test1Arg() { assertSame(emptyCollectionHolder(), stringInstance.dropWhile(predicate1AsFail)); }
            @DisplayName("() → boolean")       @Test void test0Arg() { assertSame(emptyCollectionHolder(),       instance.dropWhile(predicate0AsFail)); }
        }
        @Nested class dropWhileIndexed {
            @DisplayName("(T, int) → boolean") @Test void test2Arg() { assertSame(emptyCollectionHolder(), stringInstance.dropWhileIndexed(predicate2AltAsFail)); }
            @DisplayName("(T) → boolean")      @Test void test1Arg() { assertSame(emptyCollectionHolder(),       instance.dropWhileIndexed(predicate1AltAsFail)); }
            @DisplayName("() → boolean")       @Test void test0Arg() { assertSame(emptyCollectionHolder(),       instance.dropWhileIndexed(predicate0AsFail)); }
        }

        @Nested class dropLast {
                               @Test void min()    { assertSame(emptyCollectionHolder(), instance.dropLast(MIN_INT_VALUE)); }
            @DisplayName("-2") @Test void minus2() { assertSame(emptyCollectionHolder(), instance.dropLast(-2)); }
            @DisplayName("-1") @Test void minus1() { assertSame(emptyCollectionHolder(), instance.dropLast(-1)); }
            @DisplayName("0")  @Test void test0()  { assertSame(emptyCollectionHolder(), instance.dropLast(0)); }
            @DisplayName("1")  @Test void test1()  { assertSame(emptyCollectionHolder(), instance.dropLast(1)); }
                               @Test void max()    { assertSame(emptyCollectionHolder(), instance.dropLast(MAX_INT_VALUE)); }
        }
        @Nested class dropLastWhile {
            @DisplayName("(T, int) → boolean") @Test void test2Arg() { assertSame(emptyCollectionHolder(), stringInstance.dropLastWhile(predicate2AsFail)); }
            @DisplayName("(T) → boolean")      @Test void test1Arg() { assertSame(emptyCollectionHolder(), stringInstance.dropLastWhile(predicate1AsFail)); }
            @DisplayName("() → boolean")       @Test void test0Arg() { assertSame(emptyCollectionHolder(),       instance.dropLastWhile(predicate0AsFail)); }
        }
        @Nested class dropLastWhileIndexed {
            @DisplayName("(T, int) → boolean") @Test void test2Arg() { assertSame(emptyCollectionHolder(), stringInstance.dropLastWhileIndexed(predicate2AltAsFail)); }
            @DisplayName("(T) → boolean")      @Test void test1Arg() { assertSame(emptyCollectionHolder(),       instance.dropLastWhileIndexed(predicate1AltAsFail)); }
            @DisplayName("() → boolean")       @Test void test0Arg() { assertSame(emptyCollectionHolder(),       instance.dropLastWhileIndexed(predicate0AsFail)); }
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

            @Nested class drop {
                @DisplayName("empty (0)")    @Test void empty_0() { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.drop(0)).getAmountOfCall()); }
                @DisplayName("empty (1)")    @Test void empty_1() { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.drop(1)).getAmountOfCall()); }
                @DisplayName("1 field (0)")  @Test void test1_0() { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.drop(0)).getAmountOfCall()); }
                @DisplayName("1 field (1)")  @Test void test1_1() { assertEquals(0, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.drop(1)).getAmountOfCall()); }
                @DisplayName("1 field (2)")  @Test void test1_2() { assertEquals(0, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.drop(2)).getAmountOfCall()); }
                @DisplayName("2 fields (0)") @Test void test2_0() { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.drop(0)).getAmountOfCall()); }
                @DisplayName("2 fields (1)") @Test void test2_1() { assertEquals(1, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.drop(1)).getAmountOfCall()); }
                @DisplayName("2 fields (2)") @Test void test2_2() { assertEquals(0, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.drop(2)).getAmountOfCall()); }
                @DisplayName("2 fields (3)") @Test void test2_3() { assertEquals(0, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.drop(3)).getAmountOfCall()); }
                @DisplayName("4 fields (0)") @Test void test4_0() { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.drop(0)).getAmountOfCall()); }
                @DisplayName("4 fields (1)") @Test void test4_1() { assertEquals(3, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.drop(1)).getAmountOfCall()); }
                @DisplayName("4 fields (2)") @Test void test4_2() { assertEquals(2, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.drop(2)).getAmountOfCall()); }
                @DisplayName("4 fields (3)") @Test void test4_3() { assertEquals(1, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.drop(3)).getAmountOfCall()); }
                @DisplayName("4 fields (4)") @Test void test4_4() { assertEquals(0, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.drop(4)).getAmountOfCall()); }
                @DisplayName("4 fields (5)") @Test void test4_5() { assertEquals(0, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.drop(5)).getAmountOfCall()); }
            }
            @Nested class dropWhile {
                @DisplayName("empty: (T, int) → boolean")  @Test void empty_2Arg()   { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.dropWhile(predicate2AsFail)).getAmountOfCall()); }
                @DisplayName("empty: (T) → boolean")       @Test void empty_1Arg()   { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.dropWhile(predicate1AsFail)).getAmountOfCall()); }
                @DisplayName("empty: () → boolean")        @Test void empty_0Arg()   { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.dropWhile(predicate0AsFail)).getAmountOfCall()); }
                @DisplayName("1 field: (T, int) → true")   @Test void test1_2True()  { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.dropWhile(callback2AsTrue)) .getAmountOfCall()); }
                @DisplayName("1 field: (T) → true")        @Test void test1_1True()  { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.dropWhile(callback1AsTrue)) .getAmountOfCall()); }
                @DisplayName("1 field: () → true")         @Test void test1_0True()  { assertEquals(0, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.dropWhile(callback0AsTrue)) .getAmountOfCall()); }
                @DisplayName("1 field: (T, int) → false")  @Test void test1_2False() { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.dropWhile(callback2AsFalse)).getAmountOfCall()); }
                @DisplayName("1 field: (T) → false")       @Test void test1_1False() { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.dropWhile(callback1AsFalse)).getAmountOfCall()); }
                @DisplayName("1 field: () → false")        @Test void test1_0False() { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.dropWhile(callback0AsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields: (T, int) → true")  @Test void test2_2True()  { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.dropWhile(callback2AsTrue)) .getAmountOfCall()); }
                @DisplayName("2 fields: (T) → true")       @Test void test2_1True()  { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.dropWhile(callback1AsTrue)) .getAmountOfCall()); }
                @DisplayName("2 fields: () → true")        @Test void test2_0True()  { assertEquals(0, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.dropWhile(callback0AsTrue)) .getAmountOfCall()); }
                @DisplayName("2 fields: (T, int) → false") @Test void test2_2False() { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.dropWhile(callback2AsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields: (T) → false")      @Test void test2_1False() { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.dropWhile(callback1AsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields: () → false")       @Test void test2_0False() { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.dropWhile(callback0AsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields: (T, int) → true")  @Test void test4_2True()  { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.dropWhile(callback2AsTrue)) .getAmountOfCall()); }
                @DisplayName("4 fields: (T) → true")       @Test void test4_1True()  { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.dropWhile(callback1AsTrue)) .getAmountOfCall()); }
                @DisplayName("4 fields: () → true")        @Test void test4_0True()  { assertEquals(0, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.dropWhile(callback0AsTrue)) .getAmountOfCall()); }
                @DisplayName("4 fields: (T, int) → false") @Test void test4_2False() { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.dropWhile(callback2AsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields: (T) → false")      @Test void test4_1False() { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.dropWhile(callback1AsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields: () → false")       @Test void test4_0False() { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.dropWhile(callback0AsFalse)).getAmountOfCall()); }
            }
            @Nested class dropWhileIndexed {
                @DisplayName("empty: (int, T) → boolean")  @Test void empty_2Arg()   { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.dropWhileIndexed(predicate2AltAsFail)).getAmountOfCall()); }
                @DisplayName("empty: (int) → boolean")     @Test void empty_1Arg()   { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.dropWhileIndexed(predicate1AltAsFail)).getAmountOfCall()); }
                @DisplayName("empty: () → boolean")        @Test void empty_0Arg()   { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.dropWhileIndexed(predicate0AsFail))   .getAmountOfCall()); }
                @DisplayName("1 field: (int, T) → true")   @Test void test1_2True()  { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.dropWhileIndexed(callback2AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("1 field: (int) → true")      @Test void test1_1True()  { assertEquals(0, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.dropWhileIndexed(callback1AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("1 field: () → true")         @Test void test1_0True()  { assertEquals(0, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.dropWhileIndexed(callback0AsTrue))    .getAmountOfCall()); }
                @DisplayName("1 field: (int, T) → false")  @Test void test1_2False() { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.dropWhileIndexed(callback2AltAsFalse)).getAmountOfCall()); }
                @DisplayName("1 field: (int) → false")     @Test void test1_1False() { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.dropWhileIndexed(callback1AltAsFalse)).getAmountOfCall()); }
                @DisplayName("1 field: () → false")        @Test void test1_0False() { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.dropWhileIndexed(callback0AsFalse))   .getAmountOfCall()); }
                @DisplayName("2 fields: (int, T) → true")  @Test void test2_2True()  { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.dropWhileIndexed(callback2AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("2 fields: (int) → true")     @Test void test2_1True()  { assertEquals(0, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.dropWhileIndexed(callback1AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("2 fields: () → true")        @Test void test2_0True()  { assertEquals(0, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.dropWhileIndexed(callback0AsTrue))    .getAmountOfCall()); }
                @DisplayName("2 fields: (int, T) → false") @Test void test2_2False() { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.dropWhileIndexed(callback2AltAsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields: (int) → false")    @Test void test2_1False() { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.dropWhileIndexed(callback1AltAsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields: () → false")       @Test void test2_0False() { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.dropWhileIndexed(callback0AsFalse))   .getAmountOfCall()); }
                @DisplayName("4 fields: (int, T) → true")  @Test void test4_2True()  { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.dropWhileIndexed(callback2AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("4 fields: (int) → true")     @Test void test4_1True()  { assertEquals(0, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.dropWhileIndexed(callback1AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("4 fields: () → true")        @Test void test4_0True()  { assertEquals(0, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.dropWhileIndexed(callback0AsTrue))    .getAmountOfCall()); }
                @DisplayName("4 fields: (int, T) → false") @Test void test4_2False() { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.dropWhileIndexed(callback2AltAsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields: (int) → false")    @Test void test4_1False() { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.dropWhileIndexed(callback1AltAsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields: () → false")       @Test void test4_0False() { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.dropWhileIndexed(callback0AsFalse))   .getAmountOfCall()); }
            }

            @Nested class dropLast {
                @DisplayName("empty (0)")    @Test void empty_0() { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.dropLast(0)).getAmountOfCall()); }
                @DisplayName("empty (1)")    @Test void empty_1() { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.dropLast(1)).getAmountOfCall()); }
                @DisplayName("1 field (0)")  @Test void test1_0() { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.dropLast(0)).getAmountOfCall()); }
                @DisplayName("1 field (1)")  @Test void test1_1() { assertEquals(0, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.dropLast(1)).getAmountOfCall()); }
                @DisplayName("1 field (2)")  @Test void test1_2() { assertEquals(0, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.dropLast(2)).getAmountOfCall()); }
                @DisplayName("2 fields (0)") @Test void test2_0() { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.dropLast(0)).getAmountOfCall()); }
                @DisplayName("2 fields (1)") @Test void test2_1() { assertEquals(1, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.dropLast(1)).getAmountOfCall()); }
                @DisplayName("2 fields (2)") @Test void test2_2() { assertEquals(0, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.dropLast(2)).getAmountOfCall()); }
                @DisplayName("2 fields (3)") @Test void test2_3() { assertEquals(0, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.dropLast(3)).getAmountOfCall()); }
                @DisplayName("4 fields (0)") @Test void test4_0() { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.dropLast(0)).getAmountOfCall()); }
                @DisplayName("4 fields (1)") @Test void test4_1() { assertEquals(3, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.dropLast(1)).getAmountOfCall()); }
                @DisplayName("4 fields (2)") @Test void test4_2() { assertEquals(2, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.dropLast(2)).getAmountOfCall()); }
                @DisplayName("4 fields (3)") @Test void test4_3() { assertEquals(1, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.dropLast(3)).getAmountOfCall()); }
                @DisplayName("4 fields (4)") @Test void test4_4() { assertEquals(0, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.dropLast(4)).getAmountOfCall()); }
                @DisplayName("4 fields (5)") @Test void test4_5() { assertEquals(0, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.dropLast(5)).getAmountOfCall()); }
            }
            @Nested class dropLastWhile {
                @DisplayName("empty: (T, int) → boolean")  @Test void empty_2Arg()   { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.dropLastWhile(predicate2AsFail)).getAmountOfCall()); }
                @DisplayName("empty: (T) → boolean")       @Test void empty_1Arg()   { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.dropLastWhile(predicate1AsFail)).getAmountOfCall()); }
                @DisplayName("empty: () → boolean")        @Test void empty_0Arg()   { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.dropLastWhile(predicate0AsFail)).getAmountOfCall()); }
                @DisplayName("1 field: (T, int) → true")   @Test void test1_2True()  { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.dropLastWhile(callback2AsTrue)) .getAmountOfCall()); }
                @DisplayName("1 field: (T) → true")        @Test void test1_1True()  { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.dropLastWhile(callback1AsTrue)) .getAmountOfCall()); }
                @DisplayName("1 field: () → true")         @Test void test1_0True()  { assertEquals(0, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.dropLastWhile(callback0AsTrue)) .getAmountOfCall()); }
                @DisplayName("1 field: (T, int) → false")  @Test void test1_2False() { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.dropLastWhile(callback2AsFalse)).getAmountOfCall()); }
                @DisplayName("1 field: (T) → false")       @Test void test1_1False() { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.dropLastWhile(callback1AsFalse)).getAmountOfCall()); }
                @DisplayName("1 field: () → false")        @Test void test1_0False() { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.dropLastWhile(callback0AsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields: (T, int) → true")  @Test void test2_2True()  { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.dropLastWhile(callback2AsTrue)) .getAmountOfCall()); }
                @DisplayName("2 fields: (T) → true")       @Test void test2_1True()  { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.dropLastWhile(callback1AsTrue)) .getAmountOfCall()); }
                @DisplayName("2 fields: () → true")        @Test void test2_0True()  { assertEquals(0, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.dropLastWhile(callback0AsTrue)) .getAmountOfCall()); }
                @DisplayName("2 fields: (T, int) → false") @Test void test2_2False() { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.dropLastWhile(callback2AsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields: (T) → false")      @Test void test2_1False() { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.dropLastWhile(callback1AsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields: () → false")       @Test void test2_0False() { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.dropLastWhile(callback0AsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields: (T, int) → true")  @Test void test4_2True()  { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.dropLastWhile(callback2AsTrue)) .getAmountOfCall()); }
                @DisplayName("4 fields: (T) → true")       @Test void test4_1True()  { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.dropLastWhile(callback1AsTrue)) .getAmountOfCall()); }
                @DisplayName("4 fields: () → true")        @Test void test4_0True()  { assertEquals(0, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.dropLastWhile(callback0AsTrue)) .getAmountOfCall()); }
                @DisplayName("4 fields: (T, int) → false") @Test void test4_2False() { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.dropLastWhile(callback2AsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields: (T) → false")      @Test void test4_1False() { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.dropLastWhile(callback1AsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields: () → false")       @Test void test4_0False() { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.dropLastWhile(callback0AsFalse)).getAmountOfCall()); }
            }
            @Nested class dropLastWhileIndexed {
                @DisplayName("empty: (int, T) → boolean")  @Test void empty_2Arg()   { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.dropLastWhileIndexed(predicate2AltAsFail)).getAmountOfCall()); }
                @DisplayName("empty: (int) → boolean")     @Test void empty_1Arg()   { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.dropLastWhileIndexed(predicate1AltAsFail)).getAmountOfCall()); }
                @DisplayName("empty: () → boolean")        @Test void empty_0Arg()   { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.dropLastWhileIndexed(predicate0AsFail))   .getAmountOfCall()); }
                @DisplayName("1 field: (int, T) → true")   @Test void test1_2True()  { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.dropLastWhileIndexed(callback2AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("1 field: (int) → true")      @Test void test1_1True()  { assertEquals(0, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.dropLastWhileIndexed(callback1AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("1 field: () → true")         @Test void test1_0True()  { assertEquals(0, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.dropLastWhileIndexed(callback0AsTrue))    .getAmountOfCall()); }
                @DisplayName("1 field: (int, T) → false")  @Test void test1_2False() { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.dropLastWhileIndexed(callback2AltAsFalse)).getAmountOfCall()); }
                @DisplayName("1 field: (int) → false")     @Test void test1_1False() { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.dropLastWhileIndexed(callback1AltAsFalse)).getAmountOfCall()); }
                @DisplayName("1 field: () → false")        @Test void test1_0False() { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.dropLastWhileIndexed(callback0AsFalse))   .getAmountOfCall()); }
                @DisplayName("2 fields: (int, T) → true")  @Test void test2_2True()  { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.dropLastWhileIndexed(callback2AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("2 fields: (int) → true")     @Test void test2_1True()  { assertEquals(0, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.dropLastWhileIndexed(callback1AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("2 fields: () → true")        @Test void test2_0True()  { assertEquals(0, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.dropLastWhileIndexed(callback0AsTrue))    .getAmountOfCall()); }
                @DisplayName("2 fields: (int, T) → false") @Test void test2_2False() { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.dropLastWhileIndexed(callback2AltAsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields: (int) → false")    @Test void test2_1False() { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.dropLastWhileIndexed(callback1AltAsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields: () → false")       @Test void test2_0False() { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.dropLastWhileIndexed(callback0AsFalse))   .getAmountOfCall()); }
                @DisplayName("4 fields: (int, T) → true")  @Test void test4_2True()  { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.dropLastWhileIndexed(callback2AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("4 fields: (int) → true")     @Test void test4_1True()  { assertEquals(0, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.dropLastWhileIndexed(callback1AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("4 fields: () → true")        @Test void test4_0True()  { assertEquals(0, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.dropLastWhileIndexed(callback0AsTrue))    .getAmountOfCall()); }
                @DisplayName("4 fields: (int, T) → false") @Test void test4_2False() { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.dropLastWhileIndexed(callback2AltAsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields: (int) → false")    @Test void test4_1False() { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.dropLastWhileIndexed(callback1AltAsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields: () → false")       @Test void test4_0False() { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.dropLastWhileIndexed(callback0AsFalse))   .getAmountOfCall()); }
            }

        }

        @TestInstance(PER_CLASS) @Nested class drop {
            @Nested class empty {
                                   @Test void min()    { assertSame(emptyCollectionHolder(), newInstance(EMPTY).drop(MIN_INT_VALUE)); }
                @DisplayName("-2") @Test void minus2() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).drop(-2)); }
                @DisplayName("-1") @Test void minus1() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).drop(-1)); }
                @DisplayName("0")  @Test void test0()  { assertSame(emptyCollectionHolder(), newInstance(EMPTY).drop(0)); }
                @DisplayName("1")  @Test void test1()  { assertSame(emptyCollectionHolder(), newInstance(EMPTY).drop(1)); }
                                   @Test void max()    { assertSame(emptyCollectionHolder(), newInstance(EMPTY).drop(MAX_INT_VALUE)); }
            }
            @DisplayName("1 field") @Nested class Test1 {
                                   @Test void min()    { assertArrayEquals(A,                newInstance(A).drop(MIN_INT_VALUE).toArray()); }
                @DisplayName("-3") @Test void minus3() { assertArrayEquals(A,                newInstance(A).drop(-3).toArray()); }
                @DisplayName("-2") @Test void minus2() { assertArrayEquals(A,                newInstance(A).drop(-2).toArray()); }
                @DisplayName("-1") @Test void minus1() { assertArrayEquals(A,                newInstance(A).drop(-1).toArray()); }
                @DisplayName("0")  @Test void test0()  { assertArrayEquals(A,                newInstance(A).drop(0).toArray()); }
                @DisplayName("1")  @Test void test1()  { assertSame(emptyCollectionHolder(), newInstance(A).drop(1)); }
                @DisplayName("2")  @Test void test2()  { assertSame(emptyCollectionHolder(), newInstance(A).drop(2)); }
                                   @Test void max()    { assertSame(emptyCollectionHolder(), newInstance(A).drop(MAX_INT_VALUE)); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                                   @Test void min()    { assertArrayEquals(AB,               newInstance(AB).drop(MIN_INT_VALUE).toArray()); }
                @DisplayName("-4") @Test void minus4() { assertArrayEquals(AB,               newInstance(AB).drop(-4).toArray()); }
                @DisplayName("-3") @Test void minus3() { assertArrayEquals(AB,               newInstance(AB).drop(-3).toArray()); }
                @DisplayName("-2") @Test void minus2() { assertArrayEquals(AB,               newInstance(AB).drop(-2).toArray()); }
                @DisplayName("-1") @Test void minus1() { assertArrayEquals(B,                newInstance(AB).drop(-1).toArray()); }
                @DisplayName("0")  @Test void test0()  { assertArrayEquals(AB,               newInstance(AB).drop(0).toArray()); }
                @DisplayName("1")  @Test void test1()  { assertArrayEquals(B,                newInstance(AB).drop(1).toArray()); }
                @DisplayName("2")  @Test void test2()  { assertSame(emptyCollectionHolder(), newInstance(AB).drop(2)); }
                @DisplayName("3")  @Test void test3()  { assertSame(emptyCollectionHolder(), newInstance(AB).drop(3)); }
                                   @Test void max()    { assertSame(emptyCollectionHolder(), newInstance(AB).drop(MAX_INT_VALUE)); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                                   @Test void min()    { assertArrayEquals(ABCD,             newInstance(ABCD).drop(MIN_INT_VALUE).toArray()); }
                @DisplayName("-6") @Test void minus6() { assertArrayEquals(ABCD,             newInstance(ABCD).drop(-6).toArray()); }
                @DisplayName("-5") @Test void minus5() { assertArrayEquals(ABCD,             newInstance(ABCD).drop(-5).toArray()); }
                @DisplayName("-4") @Test void minus4() { assertArrayEquals(ABCD,             newInstance(ABCD).drop(-4).toArray()); }
                @DisplayName("-3") @Test void minus3() { assertArrayEquals(BCD,              newInstance(ABCD).drop(-3).toArray()); }
                @DisplayName("-2") @Test void minus2() { assertArrayEquals(CD,               newInstance(ABCD).drop(-2).toArray()); }
                @DisplayName("-1") @Test void minus1() { assertArrayEquals(D,                newInstance(ABCD).drop(-1).toArray()); }
                @DisplayName("0")  @Test void test0()  { assertArrayEquals(ABCD,             newInstance(ABCD).drop(0).toArray()); }
                @DisplayName("1")  @Test void test1()  { assertArrayEquals(BCD,              newInstance(ABCD).drop(1).toArray()); }
                @DisplayName("2")  @Test void test2()  { assertArrayEquals(CD,               newInstance(ABCD).drop(2).toArray()); }
                @DisplayName("3")  @Test void test3()  { assertArrayEquals(D,                newInstance(ABCD).drop(3).toArray()); }
                @DisplayName("4")  @Test void test4()  { assertSame(emptyCollectionHolder(), newInstance(ABCD).drop(4)); }
                @DisplayName("5")  @Test void test5()  { assertSame(emptyCollectionHolder(), newInstance(ABCD).drop(5)); }
                                   @Test void max()    { assertSame(emptyCollectionHolder(), newInstance(ABCD).drop(MAX_INT_VALUE)); }
            }
        }
        @TestInstance(PER_CLASS) @Nested class dropWhile {
            @Nested class empty {
                @DisplayName("(T, int) → boolean")  @Test void test2Arg() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).dropWhile(predicate2AsFail)); }
                @DisplayName("(T) → boolean")       @Test void test1Arg() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).dropWhile(predicate1AsFail)); }
                @DisplayName("() → boolean")        @Test void test0Arg() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).dropWhile(predicate0AsFail)); }
            }
            @DisplayName("boolean callbacks") @TestInstance(PER_CLASS) @Nested class BooleanCallbacks {
                @DisplayName("1 field: (T, int) → true")   @Test void test1_2True()  { assertTrue(             newInstance(A)   .dropWhile(callback2AsTrue).isEmpty()); }
                @DisplayName("1 field: (T) → true")        @Test void test1_1True()  { assertTrue(             newInstance(A)   .dropWhile(callback1AsTrue).isEmpty()); }
                @DisplayName("1 field: () → true")         @Test void test1_0True()  { assertTrue(             newInstance(A)   .dropWhile(callback0AsTrue).isEmpty()); }
                @DisplayName("1 field: (T, int) → false")  @Test void test1_2False() { assertArrayEquals(A,    newInstance(A)   .dropWhile(callback2AsFalse).toArray()); }
                @DisplayName("1 field: (T) → false")       @Test void test1_1False() { assertArrayEquals(A,    newInstance(A)   .dropWhile(callback1AsFalse).toArray()); }
                @DisplayName("1 field: () → false")        @Test void test1_0False() { assertArrayEquals(A,    newInstance(A)   .dropWhile(callback0AsFalse).toArray()); }
                @DisplayName("2 fields: (T, int) → true")  @Test void test2_2True()  { assertTrue(             newInstance(AB)  .dropWhile(callback2AsTrue).isEmpty()); }
                @DisplayName("2 fields: (T) → true")       @Test void test2_1True()  { assertTrue(             newInstance(AB)  .dropWhile(callback1AsTrue).isEmpty()); }
                @DisplayName("2 fields: () → true")        @Test void test2_0True()  { assertTrue(             newInstance(AB)  .dropWhile(callback0AsTrue).isEmpty()); }
                @DisplayName("2 fields: (T, int) → false") @Test void test2_2False() { assertArrayEquals(AB,   newInstance(AB)  .dropWhile(callback2AsFalse).toArray()); }
                @DisplayName("2 fields: (T) → false")      @Test void test2_1False() { assertArrayEquals(AB,   newInstance(AB)  .dropWhile(callback1AsFalse).toArray()); }
                @DisplayName("2 fields: () → false")       @Test void test2_0False() { assertArrayEquals(AB,   newInstance(AB)  .dropWhile(callback0AsFalse).toArray()); }
                @DisplayName("4 fields: (T, int) → true")  @Test void test4_2True()  { assertTrue(             newInstance(ABCD).dropWhile(callback2AsTrue).isEmpty()); }
                @DisplayName("4 fields: (T) → true")       @Test void test4_1True()  { assertTrue(             newInstance(ABCD).dropWhile(callback1AsTrue).isEmpty()); }
                @DisplayName("4 fields: () → true")        @Test void test4_0True()  { assertTrue(             newInstance(ABCD).dropWhile(callback0AsTrue).isEmpty()); }
                @DisplayName("4 fields: (T, int) → false") @Test void test4_2False() { assertArrayEquals(ABCD, newInstance(ABCD).dropWhile(callback2AsFalse).toArray()); }
                @DisplayName("4 fields: (T) → false")      @Test void test4_1False() { assertArrayEquals(ABCD, newInstance(ABCD).dropWhile(callback1AsFalse).toArray()); }
                @DisplayName("4 fields: () → false")       @Test void test4_0False() { assertArrayEquals(ABCD, newInstance(ABCD).dropWhile(callback0AsFalse).toArray()); }
            }
            @DisplayName("1 field") @Nested class Test1 {
                @DisplayName("under a") @Test void under_a() { assertArrayEquals(A, newInstance(A).dropWhile(callbackIsUnderA).toArray()); }
                @DisplayName("under b") @Test void under_e() { assertTrue(          newInstance(A).dropWhile(callbackIsUnderE).isEmpty()); }
                @DisplayName("under 0") @Test void under_0() { assertArrayEquals(A, newInstance(A).dropWhile(callbackIsUnder0Alt).toArray()); }
                @DisplayName("under 4") @Test void under_4() { assertTrue(          newInstance(A).dropWhile(callbackIsUnder4Alt).isEmpty()); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                @DisplayName("under a") @Test void under_a() { assertArrayEquals(AB, newInstance(AB).dropWhile(callbackIsUnderA).toArray()); }
                @DisplayName("under b") @Test void under_b() { assertArrayEquals(B,  newInstance(AB).dropWhile(callbackIsUnderB).toArray()); }
                @DisplayName("under c") @Test void under_e() { assertTrue(           newInstance(AB).dropWhile(callbackIsUnderE).isEmpty()); }
                @DisplayName("under 0") @Test void under_0() { assertArrayEquals(AB, newInstance(AB).dropWhile(callbackIsUnder0Alt).toArray()); }
                @DisplayName("under 1") @Test void under_1() { assertArrayEquals(B,  newInstance(AB).dropWhile(callbackIsUnder1Alt).toArray()); }
                @DisplayName("under 2") @Test void under_4() { assertTrue(           newInstance(AB).dropWhile(callbackIsUnder4Alt).isEmpty()); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                @DisplayName("under a") @Test void under_a() { assertArrayEquals(ABCD, newInstance(ABCD).dropWhile(callbackIsUnderA).toArray()); }
                @DisplayName("under b") @Test void under_b() { assertArrayEquals(BCD,  newInstance(ABCD).dropWhile(callbackIsUnderB).toArray()); }
                @DisplayName("under c") @Test void under_c() { assertArrayEquals(CD,   newInstance(ABCD).dropWhile(callbackIsUnderC).toArray()); }
                @DisplayName("under d") @Test void under_d() { assertArrayEquals(D,    newInstance(ABCD).dropWhile(callbackIsUnderD).toArray()); }
                @DisplayName("under e") @Test void under_e() { assertTrue(             newInstance(ABCD).dropWhile(callbackIsUnderE).isEmpty()); }
                @DisplayName("under 0") @Test void under_0() { assertArrayEquals(ABCD, newInstance(ABCD).dropWhile(callbackIsUnder0Alt).toArray()); }
                @DisplayName("under 1") @Test void under_1() { assertArrayEquals(BCD,  newInstance(ABCD).dropWhile(callbackIsUnder1Alt).toArray()); }
                @DisplayName("under 2") @Test void under_2() { assertArrayEquals(CD,   newInstance(ABCD).dropWhile(callbackIsUnder2Alt).toArray()); }
                @DisplayName("under 3") @Test void under_3() { assertArrayEquals(D,    newInstance(ABCD).dropWhile(callbackIsUnder3Alt).toArray()); }
                @DisplayName("under 4") @Test void under_4() { assertTrue(             newInstance(ABCD).dropWhile(callbackIsUnder4Alt).isEmpty()); }
            }
        }
        @TestInstance(PER_CLASS) @Nested class dropWhileIndexed {
            @Nested class empty {
                @DisplayName("(T, int) → boolean")  @Test void test2Arg() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).dropWhileIndexed(predicate2AltAsFail)); }
                @DisplayName("(T) → boolean")       @Test void test1Arg() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).dropWhileIndexed(predicate1AltAsFail)); }
                @DisplayName("() → boolean")        @Test void test0Arg() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).dropWhileIndexed(predicate0AsFail)); }
            }
            @DisplayName("boolean callbacks") @TestInstance(PER_CLASS) @Nested class BooleanCallbacks {
                @DisplayName("1 field: (T, int) → true")   @Test void test1_2True()  { assertTrue(             newInstance(A)   .dropWhileIndexed(callback2AltAsTrue).isEmpty()); }
                @DisplayName("1 field: (T) → true")        @Test void test1_1True()  { assertTrue(             newInstance(A)   .dropWhileIndexed(callback1AltAsTrue).isEmpty()); }
                @DisplayName("1 field: () → true")         @Test void test1_0True()  { assertTrue(             newInstance(A)   .dropWhileIndexed(callback0AsTrue).isEmpty()); }
                @DisplayName("1 field: (T, int) → false")  @Test void test1_2False() { assertArrayEquals(A,    newInstance(A)   .dropWhileIndexed(callback2AltAsFalse).toArray()); }
                @DisplayName("1 field: (T) → false")       @Test void test1_1False() { assertArrayEquals(A,    newInstance(A)   .dropWhileIndexed(callback1AltAsFalse).toArray()); }
                @DisplayName("1 field: () → false")        @Test void test1_0False() { assertArrayEquals(A,    newInstance(A)   .dropWhileIndexed(callback0AsFalse).toArray()); }
                @DisplayName("2 fields: (T, int) → true")  @Test void test2_2True()  { assertTrue(             newInstance(AB)  .dropWhileIndexed(callback2AltAsTrue).isEmpty()); }
                @DisplayName("2 fields: (T) → true")       @Test void test2_1True()  { assertTrue(             newInstance(AB)  .dropWhileIndexed(callback1AltAsTrue).isEmpty()); }
                @DisplayName("2 fields: () → true")        @Test void test2_0True()  { assertTrue(             newInstance(AB)  .dropWhileIndexed(callback0AsTrue).isEmpty()); }
                @DisplayName("2 fields: (T, int) → false") @Test void test2_2False() { assertArrayEquals(AB,   newInstance(AB)  .dropWhileIndexed(callback2AltAsFalse).toArray()); }
                @DisplayName("2 fields: (T) → false")      @Test void test2_1False() { assertArrayEquals(AB,   newInstance(AB)  .dropWhileIndexed(callback1AltAsFalse).toArray()); }
                @DisplayName("2 fields: () → false")       @Test void test2_0False() { assertArrayEquals(AB,   newInstance(AB)  .dropWhileIndexed(callback0AsFalse).toArray()); }
                @DisplayName("4 fields: (T, int) → true")  @Test void test4_2True()  { assertTrue(             newInstance(ABCD).dropWhileIndexed(callback2AltAsTrue).isEmpty()); }
                @DisplayName("4 fields: (T) → true")       @Test void test4_1True()  { assertTrue(             newInstance(ABCD).dropWhileIndexed(callback1AltAsTrue).isEmpty()); }
                @DisplayName("4 fields: () → true")        @Test void test4_0True()  { assertTrue(             newInstance(ABCD).dropWhileIndexed(callback0AsTrue).isEmpty()); }
                @DisplayName("4 fields: (T, int) → false") @Test void test4_2False() { assertArrayEquals(ABCD, newInstance(ABCD).dropWhileIndexed(callback2AltAsFalse).toArray()); }
                @DisplayName("4 fields: (T) → false")      @Test void test4_1False() { assertArrayEquals(ABCD, newInstance(ABCD).dropWhileIndexed(callback1AltAsFalse).toArray()); }
                @DisplayName("4 fields: () → false")       @Test void test4_0False() { assertArrayEquals(ABCD, newInstance(ABCD).dropWhileIndexed(callback0AsFalse).toArray()); }
            }
            @DisplayName("1 field") @Nested class Test1 {
                @DisplayName("under a") @Test void under_a() { assertArrayEquals(A, newInstance(A).dropWhileIndexed(callbackIsUnderAAlt).toArray()); }
                @DisplayName("under b") @Test void under_e() { assertTrue(          newInstance(A).dropWhileIndexed(callbackIsUnderEAlt).isEmpty()); }
                @DisplayName("under 0") @Test void under_0() { assertArrayEquals(A, newInstance(A).dropWhileIndexed(callbackIsUnder0).toArray()); }
                @DisplayName("under 4") @Test void under_4() { assertTrue(          newInstance(A).dropWhileIndexed(callbackIsUnder4).isEmpty()); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                @DisplayName("under a") @Test void under_a() { assertArrayEquals(AB, newInstance(AB).dropWhileIndexed(callbackIsUnderAAlt).toArray()); }
                @DisplayName("under b") @Test void under_b() { assertArrayEquals(B,  newInstance(AB).dropWhileIndexed(callbackIsUnderBAlt).toArray()); }
                @DisplayName("under c") @Test void under_e() { assertTrue(           newInstance(AB).dropWhileIndexed(callbackIsUnderEAlt).isEmpty()); }
                @DisplayName("under 0") @Test void under_0() { assertArrayEquals(AB, newInstance(AB).dropWhileIndexed(callbackIsUnder0).toArray()); }
                @DisplayName("under 1") @Test void under_1() { assertArrayEquals(B,  newInstance(AB).dropWhileIndexed(callbackIsUnder1).toArray()); }
                @DisplayName("under 2") @Test void under_4() { assertTrue(           newInstance(AB).dropWhileIndexed(callbackIsUnder4).isEmpty()); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                @DisplayName("under a") @Test void under_a() { assertArrayEquals(ABCD, newInstance(ABCD).dropWhileIndexed(callbackIsUnderAAlt).toArray()); }
                @DisplayName("under b") @Test void under_b() { assertArrayEquals(BCD,  newInstance(ABCD).dropWhileIndexed(callbackIsUnderBAlt).toArray()); }
                @DisplayName("under c") @Test void under_c() { assertArrayEquals(CD,   newInstance(ABCD).dropWhileIndexed(callbackIsUnderCAlt).toArray()); }
                @DisplayName("under d") @Test void under_d() { assertArrayEquals(D,    newInstance(ABCD).dropWhileIndexed(callbackIsUnderDAlt).toArray()); }
                @DisplayName("under e") @Test void under_e() { assertTrue(             newInstance(ABCD).dropWhileIndexed(callbackIsUnderEAlt).isEmpty()); }
                @DisplayName("under 0") @Test void under_0() { assertArrayEquals(ABCD, newInstance(ABCD).dropWhileIndexed(callbackIsUnder0).toArray()); }
                @DisplayName("under 1") @Test void under_1() { assertArrayEquals(BCD,  newInstance(ABCD).dropWhileIndexed(callbackIsUnder1).toArray()); }
                @DisplayName("under 2") @Test void under_2() { assertArrayEquals(CD,   newInstance(ABCD).dropWhileIndexed(callbackIsUnder2).toArray()); }
                @DisplayName("under 3") @Test void under_3() { assertArrayEquals(D,    newInstance(ABCD).dropWhileIndexed(callbackIsUnder3).toArray()); }
                @DisplayName("under 4") @Test void under_4() { assertTrue(             newInstance(ABCD).dropWhileIndexed(callbackIsUnder4).isEmpty()); }
            }
        }

        @TestInstance(PER_CLASS) @Nested class dropLast {
            @Nested class empty {
                                   @Test void min()    { assertSame(emptyCollectionHolder(), newInstance(EMPTY).dropLast(MIN_INT_VALUE)); }
                @DisplayName("-2") @Test void minus2() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).dropLast(-2)); }
                @DisplayName("-1") @Test void minus1() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).dropLast(-1)); }
                @DisplayName("0")  @Test void test0()  { assertSame(emptyCollectionHolder(), newInstance(EMPTY).dropLast(0)); }
                @DisplayName("1")  @Test void test1()  { assertSame(emptyCollectionHolder(), newInstance(EMPTY).dropLast(1)); }
                                   @Test void max()    { assertSame(emptyCollectionHolder(), newInstance(EMPTY).dropLast(MAX_INT_VALUE)); }
            }
            @DisplayName("1 field") @Nested class Test1 {
                                   @Test void min()    { assertArrayEquals(A, newInstance(A).dropLast(MIN_INT_VALUE).toArray()); }
                @DisplayName("-3") @Test void minus3() { assertArrayEquals(A, newInstance(A).dropLast(-3).toArray()); }
                @DisplayName("-2") @Test void minus2() { assertArrayEquals(A, newInstance(A).dropLast(-2).toArray()); }
                @DisplayName("-1") @Test void minus1() { assertArrayEquals(A, newInstance(A).dropLast(-1).toArray()); }
                @DisplayName("0")  @Test void test0()  { assertArrayEquals(A, newInstance(A).dropLast(0).toArray()); }
                @DisplayName("1")  @Test void test1()  { assertSame(emptyCollectionHolder(), newInstance(A).dropLast(1)); }
                @DisplayName("2")  @Test void test2()  { assertSame(emptyCollectionHolder(), newInstance(A).dropLast(2)); }
                                   @Test void max()    { assertSame(emptyCollectionHolder(), newInstance(A).dropLast(MAX_INT_VALUE)); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                                   @Test void min()    { assertArrayEquals(AB,               newInstance(AB).dropLast(MIN_INT_VALUE).toArray()); }
                @DisplayName("-4") @Test void minus4() { assertArrayEquals(AB,               newInstance(AB).dropLast(-4).toArray()); }
                @DisplayName("-3") @Test void minus3() { assertArrayEquals(AB,               newInstance(AB).dropLast(-3).toArray()); }
                @DisplayName("-2") @Test void minus2() { assertArrayEquals(AB,               newInstance(AB).dropLast(-2).toArray()); }
                @DisplayName("-1") @Test void minus1() { assertArrayEquals(A,                newInstance(AB).dropLast(-1).toArray()); }
                @DisplayName("0")  @Test void test0()  { assertArrayEquals(AB,               newInstance(AB).dropLast(0).toArray()); }
                @DisplayName("1")  @Test void test1()  { assertArrayEquals(A,                newInstance(AB).dropLast(1).toArray()); }
                @DisplayName("2")  @Test void test2()  { assertSame(emptyCollectionHolder(), newInstance(AB).dropLast(2)); }
                @DisplayName("3")  @Test void test3()  { assertSame(emptyCollectionHolder(), newInstance(AB).dropLast(3)); }
                                   @Test void max()    { assertSame(emptyCollectionHolder(), newInstance(AB).dropLast(MAX_INT_VALUE)); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                                   @Test void min()    { assertArrayEquals(ABCD,             newInstance(ABCD).dropLast(MIN_INT_VALUE).toArray()); }
                @DisplayName("-6") @Test void minus6() { assertArrayEquals(ABCD,             newInstance(ABCD).dropLast(-6).toArray()); }
                @DisplayName("-5") @Test void minus5() { assertArrayEquals(ABCD,             newInstance(ABCD).dropLast(-5).toArray()); }
                @DisplayName("-4") @Test void minus4() { assertArrayEquals(ABCD,             newInstance(ABCD).dropLast(-4).toArray()); }
                @DisplayName("-3") @Test void minus3() { assertArrayEquals(ABC,              newInstance(ABCD).dropLast(-3).toArray()); }
                @DisplayName("-2") @Test void minus2() { assertArrayEquals(AB,               newInstance(ABCD).dropLast(-2).toArray()); }
                @DisplayName("-1") @Test void minus1() { assertArrayEquals(A,                newInstance(ABCD).dropLast(-1).toArray()); }
                @DisplayName("0")  @Test void test0()  { assertArrayEquals(ABCD,             newInstance(ABCD).dropLast(0).toArray()); }
                @DisplayName("1")  @Test void test1()  { assertArrayEquals(ABC,              newInstance(ABCD).dropLast(1).toArray()); }
                @DisplayName("2")  @Test void test2()  { assertArrayEquals(AB,               newInstance(ABCD).dropLast(2).toArray()); }
                @DisplayName("3")  @Test void test3()  { assertArrayEquals(A,                newInstance(ABCD).dropLast(3).toArray()); }
                @DisplayName("4")  @Test void test4()  { assertSame(emptyCollectionHolder(), newInstance(ABCD).dropLast(4)); }
                @DisplayName("5")  @Test void test5()  { assertSame(emptyCollectionHolder(), newInstance(ABCD).dropLast(5)); }
                                   @Test void max()    { assertSame(emptyCollectionHolder(), newInstance(ABCD).dropLast(MAX_INT_VALUE)); }
            }
        }
        @TestInstance(PER_CLASS) @Nested class dropLastWhile {
            @Nested class empty {
                @DisplayName("(T, int) → boolean")  @Test void test2Arg() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).dropLastWhile(predicate2AsFail)); }
                @DisplayName("(T) → boolean")       @Test void test1Arg() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).dropLastWhile(predicate1AsFail)); }
                @DisplayName("() → boolean")        @Test void test0Arg() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).dropLastWhile(predicate0AsFail)); }
            }
            @DisplayName("boolean callbacks") @TestInstance(PER_CLASS) @Nested class BooleanCallbacks {
                @DisplayName("1 field: (T, int) → true")   @Test void test1_2True()  { assertTrue(             newInstance(A)   .dropLastWhile(callback2AsTrue).isEmpty()); }
                @DisplayName("1 field: (T) → true")        @Test void test1_1True()  { assertTrue(             newInstance(A)   .dropLastWhile(callback1AsTrue).isEmpty()); }
                @DisplayName("1 field: () → true")         @Test void test1_0True()  { assertTrue(             newInstance(A)   .dropLastWhile(callback0AsTrue).isEmpty()); }
                @DisplayName("1 field: (T, int) → false")  @Test void test1_2False() { assertArrayEquals(A,    newInstance(A)   .dropLastWhile(callback2AsFalse).toArray()); }
                @DisplayName("1 field: (T) → false")       @Test void test1_1False() { assertArrayEquals(A,    newInstance(A)   .dropLastWhile(callback1AsFalse).toArray()); }
                @DisplayName("1 field: () → false")        @Test void test1_0False() { assertArrayEquals(A,    newInstance(A)   .dropLastWhile(callback0AsFalse).toArray()); }
                @DisplayName("2 fields: (T, int) → true")  @Test void test2_2True()  { assertTrue(             newInstance(AB)  .dropLastWhile(callback2AsTrue).isEmpty()); }
                @DisplayName("2 fields: (T) → true")       @Test void test2_1True()  { assertTrue(             newInstance(AB)  .dropLastWhile(callback1AsTrue).isEmpty()); }
                @DisplayName("2 fields: () → true")        @Test void test2_0True()  { assertTrue(             newInstance(AB)  .dropLastWhile(callback0AsTrue).isEmpty()); }
                @DisplayName("2 fields: (T, int) → false") @Test void test2_2False() { assertArrayEquals(AB,   newInstance(AB)  .dropLastWhile(callback2AsFalse).toArray()); }
                @DisplayName("2 fields: (T) → false")      @Test void test2_1False() { assertArrayEquals(AB,   newInstance(AB)  .dropLastWhile(callback1AsFalse).toArray()); }
                @DisplayName("2 fields: () → false")       @Test void test2_0False() { assertArrayEquals(AB,   newInstance(AB)  .dropLastWhile(callback0AsFalse).toArray()); }
                @DisplayName("4 fields: (T, int) → true")  @Test void test4_2True()  { assertTrue(             newInstance(ABCD).dropLastWhile(callback2AsTrue).isEmpty()); }
                @DisplayName("4 fields: (T) → true")       @Test void test4_1True()  { assertTrue(             newInstance(ABCD).dropLastWhile(callback1AsTrue).isEmpty()); }
                @DisplayName("4 fields: () → true")        @Test void test4_0True()  { assertTrue(             newInstance(ABCD).dropLastWhile(callback0AsTrue).isEmpty()); }
                @DisplayName("4 fields: (T, int) → false") @Test void test4_2False() { assertArrayEquals(ABCD, newInstance(ABCD).dropLastWhile(callback2AsFalse).toArray()); }
                @DisplayName("4 fields: (T) → false")      @Test void test4_1False() { assertArrayEquals(ABCD, newInstance(ABCD).dropLastWhile(callback1AsFalse).toArray()); }
                @DisplayName("4 fields: () → false")       @Test void test4_0False() { assertArrayEquals(ABCD, newInstance(ABCD).dropLastWhile(callback0AsFalse).toArray()); }
            }
            @DisplayName("1 field") @Nested class Test1 {
                @DisplayName("over a") @Test void over_a() { assertArrayEquals(A, newInstance(A).dropLastWhile(callbackIsOverA).toArray()); }
                @DisplayName("over b") @Test void over_e() { assertArrayEquals(A, newInstance(A).dropLastWhile(callbackIsOverE).toArray()); }
                @DisplayName("over 0") @Test void over_0() { assertArrayEquals(A, newInstance(A).dropLastWhile(callbackIsOver0Alt).toArray()); }
                @DisplayName("over 4") @Test void over_4() { assertArrayEquals(A, newInstance(A).dropLastWhile(callbackIsOver4Alt).toArray()); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                @DisplayName("over a") @Test void over_a() { assertArrayEquals(A,  newInstance(AB).dropLastWhile(callbackIsOverA).toArray()); }
                @DisplayName("over b") @Test void over_b() { assertArrayEquals(AB, newInstance(AB).dropLastWhile(callbackIsOverB).toArray()); }
                @DisplayName("over c") @Test void over_e() { assertArrayEquals(AB, newInstance(AB).dropLastWhile(callbackIsOverE).toArray()); }
                @DisplayName("over 0") @Test void over_0() { assertArrayEquals(A,  newInstance(AB).dropLastWhile(callbackIsOver0Alt).toArray()); }
                @DisplayName("over 1") @Test void over_1() { assertArrayEquals(AB, newInstance(AB).dropLastWhile(callbackIsOver1Alt).toArray()); }
                @DisplayName("over 2") @Test void over_4() { assertArrayEquals(AB, newInstance(AB).dropLastWhile(callbackIsOver4Alt).toArray()); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                @DisplayName("over a") @Test void over_a() { assertArrayEquals(A,    newInstance(ABCD).dropLastWhile(callbackIsOverA).toArray()); }
                @DisplayName("over b") @Test void over_b() { assertArrayEquals(AB,   newInstance(ABCD).dropLastWhile(callbackIsOverB).toArray()); }
                @DisplayName("over c") @Test void over_c() { assertArrayEquals(ABC,  newInstance(ABCD).dropLastWhile(callbackIsOverC).toArray()); }
                @DisplayName("over d") @Test void over_d() { assertArrayEquals(ABCD, newInstance(ABCD).dropLastWhile(callbackIsOverD).toArray()); }
                @DisplayName("over e") @Test void over_e() { assertArrayEquals(ABCD, newInstance(ABCD).dropLastWhile(callbackIsOverE).toArray()); }
                @DisplayName("over 0") @Test void over_0() { assertArrayEquals(A,    newInstance(ABCD).dropLastWhile(callbackIsOver0Alt).toArray()); }
                @DisplayName("over 1") @Test void over_1() { assertArrayEquals(AB,   newInstance(ABCD).dropLastWhile(callbackIsOver1Alt).toArray()); }
                @DisplayName("over 2") @Test void over_2() { assertArrayEquals(ABC,  newInstance(ABCD).dropLastWhile(callbackIsOver2Alt).toArray()); }
                @DisplayName("over 3") @Test void over_3() { assertArrayEquals(ABCD, newInstance(ABCD).dropLastWhile(callbackIsOver3Alt).toArray()); }
                @DisplayName("over 4") @Test void over_4() { assertArrayEquals(ABCD, newInstance(ABCD).dropLastWhile(callbackIsOver4Alt).toArray()); }
            }
        }
        @TestInstance(PER_CLASS) @Nested class dropLastWhileIndexed {
            @Nested class empty {
                @DisplayName("(T, int) → boolean")  @Test void test2Arg() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).dropLastWhileIndexed(predicate2AltAsFail)); }
                @DisplayName("(T) → boolean")       @Test void test1Arg() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).dropLastWhileIndexed(predicate1AltAsFail)); }
                @DisplayName("() → boolean")        @Test void test0Arg() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).dropLastWhileIndexed(predicate0AsFail)); }
            }
            @DisplayName("boolean callbacks") @TestInstance(PER_CLASS) @Nested class BooleanCallbacks {
                @DisplayName("1 field: (T, int) → true")   @Test void test1_2True()  { assertTrue(             newInstance(A)   .dropLastWhileIndexed(callback2AltAsTrue).isEmpty()); }
                @DisplayName("1 field: (T) → true")        @Test void test1_1True()  { assertTrue(             newInstance(A)   .dropLastWhileIndexed(callback1AltAsTrue).isEmpty()); }
                @DisplayName("1 field: () → true")         @Test void test1_0True()  { assertTrue(             newInstance(A)   .dropLastWhileIndexed(callback0AsTrue).isEmpty()); }
                @DisplayName("1 field: (T, int) → false")  @Test void test1_2False() { assertArrayEquals(A,    newInstance(A)   .dropLastWhileIndexed(callback2AltAsFalse).toArray()); }
                @DisplayName("1 field: (T) → false")       @Test void test1_1False() { assertArrayEquals(A,    newInstance(A)   .dropLastWhileIndexed(callback1AltAsFalse).toArray()); }
                @DisplayName("1 field: () → false")        @Test void test1_0False() { assertArrayEquals(A,    newInstance(A)   .dropLastWhileIndexed(callback0AsFalse).toArray()); }
                @DisplayName("2 fields: (T, int) → true")  @Test void test2_2True()  { assertTrue(             newInstance(AB)  .dropLastWhileIndexed(callback2AltAsTrue).isEmpty()); }
                @DisplayName("2 fields: (T) → true")       @Test void test2_1True()  { assertTrue(             newInstance(AB)  .dropLastWhileIndexed(callback1AltAsTrue).isEmpty()); }
                @DisplayName("2 fields: () → true")        @Test void test2_0True()  { assertTrue(             newInstance(AB)  .dropLastWhileIndexed(callback0AsTrue).isEmpty()); }
                @DisplayName("2 fields: (T, int) → false") @Test void test2_2False() { assertArrayEquals(AB,   newInstance(AB)  .dropLastWhileIndexed(callback2AltAsFalse).toArray()); }
                @DisplayName("2 fields: (T) → false")      @Test void test2_1False() { assertArrayEquals(AB,   newInstance(AB)  .dropLastWhileIndexed(callback1AltAsFalse).toArray()); }
                @DisplayName("2 fields: () → false")       @Test void test2_0False() { assertArrayEquals(AB,   newInstance(AB)  .dropLastWhileIndexed(callback0AsFalse).toArray()); }
                @DisplayName("4 fields: (T, int) → true")  @Test void test4_2True()  { assertTrue(             newInstance(ABCD).dropLastWhileIndexed(callback2AltAsTrue).isEmpty()); }
                @DisplayName("4 fields: (T) → true")       @Test void test4_1True()  { assertTrue(             newInstance(ABCD).dropLastWhileIndexed(callback1AltAsTrue).isEmpty()); }
                @DisplayName("4 fields: () → true")        @Test void test4_0True()  { assertTrue(             newInstance(ABCD).dropLastWhileIndexed(callback0AsTrue).isEmpty()); }
                @DisplayName("4 fields: (T, int) → false") @Test void test4_2False() { assertArrayEquals(ABCD, newInstance(ABCD).dropLastWhileIndexed(callback2AltAsFalse).toArray()); }
                @DisplayName("4 fields: (T) → false")      @Test void test4_1False() { assertArrayEquals(ABCD, newInstance(ABCD).dropLastWhileIndexed(callback1AltAsFalse).toArray()); }
                @DisplayName("4 fields: () → false")       @Test void test4_0False() { assertArrayEquals(ABCD, newInstance(ABCD).dropLastWhileIndexed(callback0AsFalse).toArray()); }
            }
            @DisplayName("1 field") @Nested class Test1 {
                @DisplayName("over a") @Test void over_a() { assertArrayEquals(A, newInstance(A).dropLastWhileIndexed(callbackIsOverAAlt).toArray()); }
                @DisplayName("over b") @Test void over_e() { assertArrayEquals(A, newInstance(A).dropLastWhileIndexed(callbackIsOverEAlt).toArray()); }
                @DisplayName("over 0") @Test void over_0() { assertArrayEquals(A, newInstance(A).dropLastWhileIndexed(callbackIsOver0).toArray()); }
                @DisplayName("over 4") @Test void over_4() { assertArrayEquals(A, newInstance(A).dropLastWhileIndexed(callbackIsOver4).toArray()); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                @DisplayName("over a") @Test void over_a() { assertArrayEquals(A,  newInstance(AB).dropLastWhileIndexed(callbackIsOverAAlt).toArray()); }
                @DisplayName("over b") @Test void over_b() { assertArrayEquals(AB, newInstance(AB).dropLastWhileIndexed(callbackIsOverBAlt).toArray()); }
                @DisplayName("over c") @Test void over_e() { assertArrayEquals(AB, newInstance(AB).dropLastWhileIndexed(callbackIsOverEAlt).toArray()); }
                @DisplayName("over 0") @Test void over_0() { assertArrayEquals(A,  newInstance(AB).dropLastWhileIndexed(callbackIsOver0).toArray()); }
                @DisplayName("over 1") @Test void over_1() { assertArrayEquals(AB, newInstance(AB).dropLastWhileIndexed(callbackIsOver1).toArray()); }
                @DisplayName("over 2") @Test void over_4() { assertArrayEquals(AB, newInstance(AB).dropLastWhileIndexed(callbackIsOver4).toArray()); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                @DisplayName("over a") @Test void over_a() { assertArrayEquals(A,    newInstance(ABCD).dropLastWhileIndexed(callbackIsOverAAlt).toArray()); }
                @DisplayName("over b") @Test void over_b() { assertArrayEquals(AB,   newInstance(ABCD).dropLastWhileIndexed(callbackIsOverBAlt).toArray()); }
                @DisplayName("over c") @Test void over_c() { assertArrayEquals(ABC,  newInstance(ABCD).dropLastWhileIndexed(callbackIsOverCAlt).toArray()); }
                @DisplayName("over d") @Test void over_d() { assertArrayEquals(ABCD, newInstance(ABCD).dropLastWhileIndexed(callbackIsOverDAlt).toArray()); }
                @DisplayName("over e") @Test void over_e() { assertArrayEquals(ABCD, newInstance(ABCD).dropLastWhileIndexed(callbackIsOverEAlt).toArray()); }
                @DisplayName("over 0") @Test void over_0() { assertArrayEquals(A,    newInstance(ABCD).dropLastWhileIndexed(callbackIsOver0).toArray()); }
                @DisplayName("over 1") @Test void over_1() { assertArrayEquals(AB,   newInstance(ABCD).dropLastWhileIndexed(callbackIsOver1).toArray()); }
                @DisplayName("over 2") @Test void over_2() { assertArrayEquals(ABC,  newInstance(ABCD).dropLastWhileIndexed(callbackIsOver2).toArray()); }
                @DisplayName("over 3") @Test void over_3() { assertArrayEquals(ABCD, newInstance(ABCD).dropLastWhileIndexed(callbackIsOver3).toArray()); }
                @DisplayName("over 4") @Test void over_4() { assertArrayEquals(ABCD, newInstance(ABCD).dropLastWhileIndexed(callbackIsOver4).toArray()); }
            }
        }

    }

}

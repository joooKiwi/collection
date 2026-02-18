import condition.DisableIfNormalCondition;
import condition.DisableIfNormalViewerCondition;
import instance.CollectionHolderForTest;
import instance.GenericCollectionHolder_ToReverseAlias;
import joookiwi.collection.java.CollectionHolder;
import joookiwi.collection.java.exception.IndexOutOfBoundsException;
import joookiwi.collection.java.exception.InvalidIndexRangeException;
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
import static joookiwi.collection.java.NumericConstants.NULL_INT;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;
import static value.Arrays.A;
import static value.Arrays.AB;
import static value.Arrays.ABCD;
import static value.Arrays.B;
import static value.Arrays.BA;
import static value.Arrays.C;
import static value.Arrays.CB;
import static value.Arrays.CBA;
import static value.Arrays.CD;
import static value.Arrays.D;
import static value.Arrays.DC;
import static value.Arrays.DCB;
import static value.Arrays.DCBA;
import static value.Arrays.EMPTY;
import static value.ReusableFields.EMPTY_ARRAY;
import static value.ReusableFields_Null.NULL_OBJECT;
import static value.ReusableFields_Null.NULL_STRING;
import static value.ReusableFields_Null.NULL_VARARGS;

@NotNullByDefault
@DisplayNameGeneration(Simple.class)
@DisplayName("CollectionHolder tests (reverse)") @TestInstance(PER_CLASS) class CollectionHolder15_ReverseTests {

    @TestInstance(PER_CLASS) @Nested class EmptyCollectionHolder extends AbstractEmptyCollectionHolderTests {
        @Nested class toReverse {
            @DisplayName("∅")           @Test void testEmpty()        { assertSame(instance, instance.toReverse()); }
            @DisplayName("int")         @Test void test0()            { assertSame(instance, instance.toReverse(0)); }
            @DisplayName("int?")        @Test void testNull()         { assertSame(instance, instance.toReverse(NULL_INT)); }
            @DisplayName("null object") @Test void testNullObject()   { assertSame(instance, instance.toReverse(NULL_OBJECT)); }
            @DisplayName("null string") @Test void testNullString()   { assertSame(instance, instance.toReverse(NULL_STRING)); }
            @DisplayName("null []")     @Test void testNullArray()    { assertSame(instance, instance.toReverse(NULL_VARARGS)); }
            @DisplayName("[]")          @Test void testArray()        { assertSame(instance, instance.toReverse(EMPTY_ARRAY)); }
            @DisplayName("null, int")   @Test void testNull0()        { assertSame(instance, instance.toReverse(null, 0)); }
            @DisplayName("null, int?")  @Test void testNullNull()     { assertSame(instance, instance.toReverse(null, null)); }
        }
        @Nested class toReversed {
            @DisplayName("∅")           @Test void testEmpty()        { assertSame(instance, instance.toReversed()); }
            @DisplayName("int")         @Test void test0()            { assertSame(instance, instance.toReversed(0)); }
            @DisplayName("int?")        @Test void testNull()         { assertSame(instance, instance.toReversed(NULL_INT)); }
            @DisplayName("null object") @Test void testNullObject()   { assertSame(instance, instance.toReversed(NULL_OBJECT)); }
            @DisplayName("null string") @Test void testNullString()   { assertSame(instance, instance.toReversed(NULL_STRING)); }
            @DisplayName("null []")     @Test void testNullArray()    { assertSame(instance, instance.toReversed(NULL_VARARGS)); }
            @DisplayName("[]")          @Test void testArray()        { assertSame(instance, instance.toReversed(EMPTY_ARRAY)); }
            @DisplayName("null, int")   @Test void testNull0()        { assertSame(instance, instance.toReversed(null, 0)); }
            @DisplayName("null, int?")  @Test void testNullNull()     { assertSame(instance, instance.toReversed(null, null)); }
        }
        @Nested class reversed {
            @DisplayName("∅")           @Test void testEmpty()        { assertSame(instance, instance.reversed()); }
            @DisplayName("int")         @Test void test0()            { assertSame(instance, instance.reversed(0)); }
            @DisplayName("int?")        @Test void testNull()         { assertSame(instance, instance.reversed(NULL_INT)); }
            @DisplayName("null object") @Test void testNullObject()   { assertSame(instance, instance.reversed(NULL_OBJECT)); }
            @DisplayName("null string") @Test void testNullString()   { assertSame(instance, instance.reversed(NULL_STRING)); }
            @DisplayName("null []")     @Test void testNullArray()    { assertSame(instance, instance.reversed(NULL_VARARGS)); }
            @DisplayName("[]")          @Test void testArray()        { assertSame(instance, instance.reversed(EMPTY_ARRAY)); }
            @DisplayName("null, int")   @Test void testNull0()        { assertSame(instance, instance.reversed(null, 0)); }
            @DisplayName("null, int?")  @Test void testNullNull()     { assertSame(instance, instance.reversed(null, null)); }
        }
    }

    @TestInstance(PER_CLASS) @Nested class aliases {
        @TestInstance(PER_CLASS) @Nested class GenericCollectionHolder {
            @Nested class toReversed {
                @DisplayName("∅")          @Test void testEmpty()    { assertEquals(1, new GenericCollectionHolder_ToReverseAlias().execute(CollectionHolder::toReversed).getAmountOfCall()); }
                @DisplayName("int")        @Test void test0()        { assertEquals(1, new GenericCollectionHolder_ToReverseAlias().execute(it ->          it.toReversed(0)).getAmountOfCall()); }
                @DisplayName("int?")       @Test void testNull()     { assertEquals(1, new GenericCollectionHolder_ToReverseAlias().execute(it ->          it.toReversed(null)).getAmountOfCall()); }
                @DisplayName("int?, int")  @Test void testNull0()    { assertEquals(1, new GenericCollectionHolder_ToReverseAlias().execute(it ->          it.toReversed(null, 0)).getAmountOfCall()); }
                @DisplayName("int?, int?") @Test void testNullNull() { assertEquals(1, new GenericCollectionHolder_ToReverseAlias().execute(it ->          it.toReversed(null, null)).getAmountOfCall()); }
            }
            @Nested class reversed {
                @DisplayName("∅")          @Test void testEmpty()    { assertEquals(1, new GenericCollectionHolder_ToReverseAlias().execute(CollectionHolder::reversed).getAmountOfCall()); }
                @DisplayName("int")        @Test void test0()        { assertEquals(1, new GenericCollectionHolder_ToReverseAlias().execute(it ->          it.reversed(0)).getAmountOfCall()); }
                @DisplayName("int?")       @Test void testNull()     { assertEquals(1, new GenericCollectionHolder_ToReverseAlias().execute(it ->          it.reversed(null)).getAmountOfCall()); }
                @DisplayName("int?, int")  @Test void testNull0()    { assertEquals(1, new GenericCollectionHolder_ToReverseAlias().execute(it ->          it.reversed(null, 0)).getAmountOfCall()); }
                @DisplayName("int?, int?") @Test void testNullNull() { assertEquals(1, new GenericCollectionHolder_ToReverseAlias().execute(it ->          it.reversed(null, null)).getAmountOfCall()); }
            }
        }
    }

    @FieldSource("value.Instances#everyExtensionMethodInstancesAsArguments")
    @ParameterizedClass(name = "{0}") @Nested class methods extends AbstractMethodsTests {
        //#region -------------------- Required test configuration --------------------

        public methods(final CollectionHolderForTest<?, ?> instance) { super(instance); }

        //#endregion -------------------- Required test configuration --------------------

            @DisplayName("∅")          @Test void testEmpty()       { assertSame(emptyCollectionHolder(), instance.toReverse()); }

                                       @Test void min()             { assertSame(emptyCollectionHolder(), instance.toReverse(MIN_INT_VALUE)); }
            @DisplayName("-1")         @Test void minus1()          { assertSame(emptyCollectionHolder(), instance.toReverse(-1)); }
            @DisplayName("0")          @Test void test0()           { assertSame(emptyCollectionHolder(), instance.toReverse(0)); }
            @DisplayName("1")          @Test void test1()           { assertSame(emptyCollectionHolder(), instance.toReverse(1)); }
                                       @Test void max()             { assertSame(emptyCollectionHolder(), instance.toReverse(MAX_INT_VALUE)); }
            @DisplayName("null")       @Test void testNull()        { assertSame(emptyCollectionHolder(), instance.toReverse(null)); }

            @DisplayName("min, min")   @Test void min_min()         { assertSame(emptyCollectionHolder(), instance.toReverse(MIN_INT_VALUE, MIN_INT_VALUE)); }
            @DisplayName("min, -1")    @Test void min_minus1()      { assertSame(emptyCollectionHolder(), instance.toReverse(MIN_INT_VALUE, -1)); }
            @DisplayName("min, 0")     @Test void min_0()           { assertSame(emptyCollectionHolder(), instance.toReverse(MIN_INT_VALUE, 0)); }
            @DisplayName("min, 1")     @Test void min_1()           { assertSame(emptyCollectionHolder(), instance.toReverse(MIN_INT_VALUE, 1)); }
            @DisplayName("min, max")   @Test void min_Max()         { assertSame(emptyCollectionHolder(), instance.toReverse(MIN_INT_VALUE, MAX_INT_VALUE)); }
            @DisplayName("min, null")  @Test void min_Null()        { assertSame(emptyCollectionHolder(), instance.toReverse(MIN_INT_VALUE, null)); }

            @DisplayName("-1, min")    @Test void minus1_min()      { assertSame(emptyCollectionHolder(), instance.toReverse(-1,            MIN_INT_VALUE)); }
            @DisplayName("-1, -1")     @Test void minus1_minus1()   { assertSame(emptyCollectionHolder(), instance.toReverse(-1,            -1)); }
            @DisplayName("-1, 0")      @Test void minus1_0()        { assertSame(emptyCollectionHolder(), instance.toReverse(-1,            0)); }
            @DisplayName("-1, 1")      @Test void minus1_1()        { assertSame(emptyCollectionHolder(), instance.toReverse(-1,            1)); }
            @DisplayName("-1, max")    @Test void minus1_max()      { assertSame(emptyCollectionHolder(), instance.toReverse(-1,            MAX_INT_VALUE)); }
            @DisplayName("-1, null")   @Test void minus1_null()     { assertSame(emptyCollectionHolder(), instance.toReverse(-1,            null)); }

            @DisplayName("0, min")     @Test void test0_min()       { assertSame(emptyCollectionHolder(), instance.toReverse(0,             MIN_INT_VALUE)); }
            @DisplayName("0, -1")      @Test void test0_minus1()    { assertSame(emptyCollectionHolder(), instance.toReverse(0,             -1)); }
            @DisplayName("0, 0")       @Test void test0_0()         { assertSame(emptyCollectionHolder(), instance.toReverse(0,             0)); }
            @DisplayName("0, 1")       @Test void test0_1()         { assertSame(emptyCollectionHolder(), instance.toReverse(0,             1)); }
            @DisplayName("0, max")     @Test void test0_max()       { assertSame(emptyCollectionHolder(), instance.toReverse(0,             MAX_INT_VALUE)); }
            @DisplayName("0, null")    @Test void test0_null()      { assertSame(emptyCollectionHolder(), instance.toReverse(0,             null)); }

            @DisplayName("1, min")     @Test void test1_min()       { assertSame(emptyCollectionHolder(), instance.toReverse(1,             MIN_INT_VALUE)); }
            @DisplayName("1, -1")      @Test void test1_minus1()    { assertSame(emptyCollectionHolder(), instance.toReverse(1,             -1)); }
            @DisplayName("1, 0")       @Test void test1_0()         { assertSame(emptyCollectionHolder(), instance.toReverse(1,             0)); }
            @DisplayName("1, 1")       @Test void test1_1()         { assertSame(emptyCollectionHolder(), instance.toReverse(1,             1)); }
            @DisplayName("1, max")     @Test void test1_max()       { assertSame(emptyCollectionHolder(), instance.toReverse(1,             MAX_INT_VALUE)); }
            @DisplayName("1, null")    @Test void test1_null()      { assertSame(emptyCollectionHolder(), instance.toReverse(1,             null)); }

            @DisplayName("max, min")   @Test void max_min()         { assertSame(emptyCollectionHolder(), instance.toReverse(MAX_INT_VALUE, MIN_INT_VALUE)); }
            @DisplayName("max, -1")    @Test void max_minus1()      { assertSame(emptyCollectionHolder(), instance.toReverse(MAX_INT_VALUE, -1)); }
            @DisplayName("max, 0")     @Test void max_0()           { assertSame(emptyCollectionHolder(), instance.toReverse(MAX_INT_VALUE, 0)); }
            @DisplayName("max, 1")     @Test void max_1()           { assertSame(emptyCollectionHolder(), instance.toReverse(MAX_INT_VALUE, 1)); }
            @DisplayName("max, max")   @Test void max_max()         { assertSame(emptyCollectionHolder(), instance.toReverse(MAX_INT_VALUE, MAX_INT_VALUE)); }
            @DisplayName("max, null")  @Test void max_null()        { assertSame(emptyCollectionHolder(), instance.toReverse(MAX_INT_VALUE, null)); }

            @DisplayName("null, min")  @Test void null_min()        { assertSame(emptyCollectionHolder(), instance.toReverse(null,          MIN_INT_VALUE)); }
            @DisplayName("null, -1")   @Test void null_minus1()     { assertSame(emptyCollectionHolder(), instance.toReverse(null,          -1)); }
            @DisplayName("null, 0")    @Test void null_0()          { assertSame(emptyCollectionHolder(), instance.toReverse(null,          0)); }
            @DisplayName("null, 1")    @Test void null_1()          { assertSame(emptyCollectionHolder(), instance.toReverse(null,          1)); }
            @DisplayName("null, max")  @Test void null_max()        { assertSame(emptyCollectionHolder(), instance.toReverse(null,          MAX_INT_VALUE)); }
            @DisplayName("null, null") @Test void null_null()       { assertSame(emptyCollectionHolder(), instance.toReverse(null,          null)); }

    }

    @FieldSource("value.Instances#everyInstancesAsArguments")
    @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class instances extends AbstractInstancesTests {
        //#region -------------------- Required test configuration --------------------

        public instances(final Class<CollectionHolderForTest<?, ?>> instanceClass) { super(instanceClass); }

        //#endregion -------------------- Required test configuration --------------------

        @ExtendWith({DisableIfNormalCondition.class, DisableIfNormalViewerCondition.class,})
        @DisplayName("get() being called") @TestInstance(PER_CLASS) @Nested class GetBeingCalled {
            public final instances rootInstance = instances.this;

            @Nested class empty {
                @DisplayName("∅")          @Test void testEmpty()  { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(CollectionHolder::toReverse)                              .getAmountOfCall()); }
                @DisplayName("0")          @Test void test0()      { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it ->          it.toReverse(0))                           .getAmountOfCall()); }
                @DisplayName("1")          @Test void test1()      { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it ->          it.toReverse(1))                           .getAmountOfCall()); }
                @DisplayName("null")       @Test void testNull()   { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it ->          it.toReverse(null))                        .getAmountOfCall()); }
                @DisplayName("0, 0")       @Test void test0_0()    { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it ->          it.toReverse(0,             0))            .getAmountOfCall()); }
                @DisplayName("0, 1")       @Test void test0_1()    { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it ->          it.toReverse(0,             1))            .getAmountOfCall()); }
                @DisplayName("0, null")    @Test void test0_null() { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it ->          it.toReverse(0,             null))         .getAmountOfCall()); }
                @DisplayName("1, 0")       @Test void test1_0()    { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it ->          it.toReverse(1,             0))            .getAmountOfCall()); }
                @DisplayName("1, 1")       @Test void test1_1()    { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it ->          it.toReverse(1,             1))            .getAmountOfCall()); }
                @DisplayName("1, null")    @Test void test1_null() { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it ->          it.toReverse(1,             null))         .getAmountOfCall()); }
                @DisplayName("null, 0")    @Test void null_0()     { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it ->          it.toReverse(null,          0))            .getAmountOfCall()); }
                @DisplayName("null, 1")    @Test void null_1()     { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it ->          it.toReverse(null,          1))            .getAmountOfCall()); }
                @DisplayName("null, null") @Test void null_null()  { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it ->          it.toReverse(null,          null))         .getAmountOfCall()); }
            }
            @DisplayName("1 field") @Nested class Test1 {
                @DisplayName("∅")          @Test void testEmpty()   { assertEquals(1, newInstance(A).executeWhileHavingIndexesOnField(CollectionHolder::toReverse)                                  .getAmountOfCall()); }
                @DisplayName("0")          @Test void test0()       { assertEquals(1, newInstance(A).executeWhileHavingIndexesOnField(it ->              it.toReverse(0))                           .getAmountOfCall()); }
                @DisplayName("1")          @Test void test1()       { assertEquals(0, newInstance(A).executeWhileExpectingIndexOutOfBound(it ->          it.toReverse(1))                           .getAmountOfCall()); }
                @DisplayName("2")          @Test void test2()       { assertEquals(0, newInstance(A).executeWhileExpectingIndexOutOfBound(it ->          it.toReverse(2))                           .getAmountOfCall()); }
                @DisplayName("null")       @Test void testNull()    { assertEquals(1, newInstance(A).executeWhileHavingIndexesOnField(it ->              it.toReverse(null))                        .getAmountOfCall()); }
                @DisplayName("min, 0")     @Test void min_0()       { assertEquals(0, newInstance(A).executeWhileExpectingIndexOutOfBound(it ->          it.toReverse(MIN_INT_VALUE, 0))            .getAmountOfCall()); }
                @DisplayName("min, 1")     @Test void min_1()       { assertEquals(0, newInstance(A).executeWhileExpectingIndexOutOfBound(it ->          it.toReverse(MIN_INT_VALUE, 1))            .getAmountOfCall()); }
                @DisplayName("min, 2")     @Test void min_2()       { assertEquals(0, newInstance(A).executeWhileExpectingIndexOutOfBound(it ->          it.toReverse(MIN_INT_VALUE, 2))            .getAmountOfCall()); }
                @DisplayName("min, null")  @Test void min_Null()    { assertEquals(0, newInstance(A).executeWhileExpectingIndexOutOfBound(it ->          it.toReverse(MIN_INT_VALUE, null))         .getAmountOfCall()); }
                @DisplayName("-2, 0")      @Test void minus2_0()    { assertEquals(0, newInstance(A).executeWhileExpectingIndexOutOfBound(it ->          it.toReverse(-2,            0))            .getAmountOfCall()); }
                @DisplayName("-2, 1")      @Test void minus2_1()    { assertEquals(0, newInstance(A).executeWhileExpectingIndexOutOfBound(it ->          it.toReverse(-2,            1))            .getAmountOfCall()); }
                @DisplayName("-2, 2")      @Test void minus2_2()    { assertEquals(0, newInstance(A).executeWhileExpectingIndexOutOfBound(it ->          it.toReverse(-2,            2))            .getAmountOfCall()); }
                @DisplayName("-2, null")   @Test void minus2_null() { assertEquals(0, newInstance(A).executeWhileExpectingIndexOutOfBound(it ->          it.toReverse(-2,            null))         .getAmountOfCall()); }
                @DisplayName("-1, 0")      @Test void minus1_0()    { assertEquals(1, newInstance(A).executeWhileHavingIndexesOnField(it ->              it.toReverse(-1,            0))            .getAmountOfCall()); }
                @DisplayName("-1, 1")      @Test void minus1_1()    { assertEquals(0, newInstance(A).executeWhileExpectingIndexOutOfBound(it ->          it.toReverse(-1,            1))            .getAmountOfCall()); }
                @DisplayName("-1, 2")      @Test void minus1_2()    { assertEquals(0, newInstance(A).executeWhileExpectingIndexOutOfBound(it ->          it.toReverse(-1,            2))            .getAmountOfCall()); }
                @DisplayName("-1, null")   @Test void minus1_null() { assertEquals(1, newInstance(A).executeWhileHavingIndexesOnField(it ->              it.toReverse(-1,            null))         .getAmountOfCall()); }
                @DisplayName("0, 0")       @Test void test0_0()     { assertEquals(1, newInstance(A).executeWhileHavingIndexesOnField(it ->              it.toReverse(0,             0))            .getAmountOfCall()); }
                @DisplayName("0, 1")       @Test void test0_1()     { assertEquals(0, newInstance(A).executeWhileExpectingIndexOutOfBound(it ->          it.toReverse(0,             1))            .getAmountOfCall()); }
                @DisplayName("0, 2")       @Test void test0_2()     { assertEquals(0, newInstance(A).executeWhileExpectingIndexOutOfBound(it ->          it.toReverse(0,             2))            .getAmountOfCall()); }
                @DisplayName("0, null")    @Test void test0_null()  { assertEquals(1, newInstance(A).executeWhileHavingIndexesOnField(it ->              it.toReverse(0,             null))         .getAmountOfCall()); }
                @DisplayName("1, 0")       @Test void test1_0()     { assertEquals(0, newInstance(A).executeWhileExpectingIndexOutOfBound(it ->          it.toReverse(1,             0))            .getAmountOfCall()); }
                @DisplayName("1, 1")       @Test void test1_1()     { assertEquals(0, newInstance(A).executeWhileExpectingIndexOutOfBound(it ->          it.toReverse(1,             1))            .getAmountOfCall()); }
                @DisplayName("1, 2")       @Test void test1_2()     { assertEquals(0, newInstance(A).executeWhileExpectingIndexOutOfBound(it ->          it.toReverse(1,             2))            .getAmountOfCall()); }
                @DisplayName("1, null")    @Test void test1_null()  { assertEquals(0, newInstance(A).executeWhileExpectingIndexOutOfBound(it ->          it.toReverse(1,             null))         .getAmountOfCall()); }
                @DisplayName("2, 0")       @Test void test2_0()     { assertEquals(0, newInstance(A).executeWhileExpectingIndexOutOfBound(it ->          it.toReverse(2,             0))            .getAmountOfCall()); }
                @DisplayName("2, 1")       @Test void test2_1()     { assertEquals(0, newInstance(A).executeWhileExpectingIndexOutOfBound(it ->          it.toReverse(2,             1))            .getAmountOfCall()); }
                @DisplayName("2, 2")       @Test void test2_2()     { assertEquals(0, newInstance(A).executeWhileExpectingIndexOutOfBound(it ->          it.toReverse(2,             2))            .getAmountOfCall()); }
                @DisplayName("2, null")    @Test void test2_null()  { assertEquals(0, newInstance(A).executeWhileExpectingIndexOutOfBound(it ->          it.toReverse(2,             null))         .getAmountOfCall()); }
                @DisplayName("null, 0")    @Test void null_0()      { assertEquals(1, newInstance(A).executeWhileHavingIndexesOnField(it ->              it.toReverse(null,          0))            .getAmountOfCall()); }
                @DisplayName("null, 1")    @Test void null_1()      { assertEquals(0, newInstance(A).executeWhileExpectingIndexOutOfBound(it ->          it.toReverse(null,          1))            .getAmountOfCall()); }
                @DisplayName("null, 2")    @Test void null_2()      { assertEquals(0, newInstance(A).executeWhileExpectingIndexOutOfBound(it ->          it.toReverse(null,          2))            .getAmountOfCall()); }
                @DisplayName("null, null") @Test void null_null()   { assertEquals(1, newInstance(A).executeWhileHavingIndexesOnField(it ->              it.toReverse(null,          null))         .getAmountOfCall()); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                @DisplayName("∅")          @Test void testEmpty()  { assertEquals(2, newInstance(AB).executeWhileHavingIndexesOnField(CollectionHolder::toReverse)                                  .getAmountOfCall()); }
                @DisplayName("0")          @Test void test0()      { assertEquals(2, newInstance(AB).executeWhileHavingIndexesOnField(it ->          it.toReverse(0))                           .getAmountOfCall()); }
                @DisplayName("1")          @Test void test1()      { assertEquals(1, newInstance(AB).executeWhileHavingIndexesOnField(it ->          it.toReverse(1))                           .getAmountOfCall()); }
                @DisplayName("2")          @Test void test2()      { assertEquals(0, newInstance(AB).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(2))                           .getAmountOfCall()); }
                @DisplayName("3")          @Test void test3()      { assertEquals(0, newInstance(AB).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(3))                           .getAmountOfCall()); }
                @DisplayName("null")       @Test void testNull()   { assertEquals(2, newInstance(AB).executeWhileHavingIndexesOnField(it ->          it.toReverse(null))                        .getAmountOfCall()); }
                @DisplayName("0, 0")       @Test void test0_0()    { assertEquals(1, newInstance(AB).executeWhileHavingIndexesOnField(it ->          it.toReverse(0,             0))            .getAmountOfCall()); }
                @DisplayName("0, 1")       @Test void test0_1()    { assertEquals(2, newInstance(AB).executeWhileHavingIndexesOnField(it ->          it.toReverse(0,             1))            .getAmountOfCall()); }
                @DisplayName("0, 2")       @Test void test0_2()    { assertEquals(0, newInstance(AB).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(0,             2))            .getAmountOfCall()); }
                @DisplayName("0, 3")       @Test void test0_3()    { assertEquals(0, newInstance(AB).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(0,             3))            .getAmountOfCall()); }
                @DisplayName("0, null")    @Test void test0_null() { assertEquals(2, newInstance(AB).executeWhileHavingIndexesOnField(it ->          it.toReverse(0,             null))         .getAmountOfCall()); }
                @DisplayName("1, 0")       @Test void test1_0()    { assertEquals(0, newInstance(AB).executeWhileExpectingInvalidIndexRange(it ->    it.toReverse(1,             0))            .getAmountOfCall()); }
                @DisplayName("1, 1")       @Test void test1_1()    { assertEquals(1, newInstance(AB).executeWhileHavingIndexesOnField(it ->          it.toReverse(1,             1))            .getAmountOfCall()); }
                @DisplayName("1, 2")       @Test void test1_2()    { assertEquals(0, newInstance(AB).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(1,             2))            .getAmountOfCall()); }
                @DisplayName("1, 3")       @Test void test1_3()    { assertEquals(0, newInstance(AB).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(1,             3))            .getAmountOfCall()); }
                @DisplayName("1, null")    @Test void test1_null() { assertEquals(1, newInstance(AB).executeWhileHavingIndexesOnField(it ->          it.toReverse(1,             null))         .getAmountOfCall()); }
                @DisplayName("2, 0")       @Test void test2_0()    { assertEquals(0, newInstance(AB).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(2,             0))            .getAmountOfCall()); }
                @DisplayName("2, 1")       @Test void test2_1()    { assertEquals(0, newInstance(AB).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(2,             1))            .getAmountOfCall()); }
                @DisplayName("2, 2")       @Test void test2_2()    { assertEquals(0, newInstance(AB).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(2,             2))            .getAmountOfCall()); }
                @DisplayName("2, 3")       @Test void test2_3()    { assertEquals(0, newInstance(AB).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(2,             3))            .getAmountOfCall()); }
                @DisplayName("2, null")    @Test void test2_null() { assertEquals(0, newInstance(AB).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(2,             null))         .getAmountOfCall()); }
                @DisplayName("3, 0")       @Test void test3_0()    { assertEquals(0, newInstance(AB).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(3,             0))            .getAmountOfCall()); }
                @DisplayName("3, 1")       @Test void test3_1()    { assertEquals(0, newInstance(AB).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(3,             1))            .getAmountOfCall()); }
                @DisplayName("3, 2")       @Test void test3_2()    { assertEquals(0, newInstance(AB).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(3,             2))            .getAmountOfCall()); }
                @DisplayName("3, 3")       @Test void test3_3()    { assertEquals(0, newInstance(AB).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(3,             3))            .getAmountOfCall()); }
                @DisplayName("3, null")    @Test void test3_null() { assertEquals(0, newInstance(AB).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(3,             null))         .getAmountOfCall()); }
                @DisplayName("max, 0")     @Test void max_0()      { assertEquals(0, newInstance(AB).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(MAX_INT_VALUE, 0))            .getAmountOfCall()); }
                @DisplayName("max, 1")     @Test void max_1()      { assertEquals(0, newInstance(AB).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(MAX_INT_VALUE, 1))            .getAmountOfCall()); }
                @DisplayName("max, 2")     @Test void max_2()      { assertEquals(0, newInstance(AB).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(MAX_INT_VALUE, 2))            .getAmountOfCall()); }
                @DisplayName("max, 3")     @Test void max_3()      { assertEquals(0, newInstance(AB).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(MAX_INT_VALUE, 3))            .getAmountOfCall()); }
                @DisplayName("max, null")  @Test void max_null()   { assertEquals(0, newInstance(AB).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(MAX_INT_VALUE, null))         .getAmountOfCall()); }
                @DisplayName("null, 0")    @Test void null_0()     { assertEquals(1, newInstance(AB).executeWhileHavingIndexesOnField(it ->          it.toReverse(null,          0))            .getAmountOfCall()); }
                @DisplayName("null, 1")    @Test void null_1()     { assertEquals(2, newInstance(AB).executeWhileHavingIndexesOnField(it ->          it.toReverse(null,          1))            .getAmountOfCall()); }
                @DisplayName("null, 2")    @Test void null_2()     { assertEquals(0, newInstance(AB).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(null,          2))            .getAmountOfCall()); }
                @DisplayName("null, 3")    @Test void null_3()     { assertEquals(0, newInstance(AB).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(null,          3))            .getAmountOfCall()); }
                @DisplayName("null, null") @Test void null_null()  { assertEquals(2, newInstance(AB).executeWhileHavingIndexesOnField(it ->          it.toReverse(null,          null))         .getAmountOfCall()); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                @DisplayName("∅")          @Test void testEmpty()  { assertEquals(4, newInstance(ABCD).executeWhileHavingIndexesOnField(CollectionHolder::toReverse)                                  .getAmountOfCall()); }
                @DisplayName("0")          @Test void test0()      { assertEquals(4, newInstance(ABCD).executeWhileHavingIndexesOnField(it ->          it.toReverse(0))                           .getAmountOfCall()); }
                @DisplayName("1")          @Test void test1()      { assertEquals(3, newInstance(ABCD).executeWhileHavingIndexesOnField(it ->          it.toReverse(1))                           .getAmountOfCall()); }
                @DisplayName("2")          @Test void test2()      { assertEquals(2, newInstance(ABCD).executeWhileHavingIndexesOnField(it ->          it.toReverse(2))                           .getAmountOfCall()); }
                @DisplayName("3")          @Test void test3()      { assertEquals(1, newInstance(ABCD).executeWhileHavingIndexesOnField(it ->          it.toReverse(3))                           .getAmountOfCall()); }
                @DisplayName("4")          @Test void test4()      { assertEquals(0, newInstance(ABCD).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(4))                           .getAmountOfCall()); }
                @DisplayName("5")          @Test void test5()      { assertEquals(0, newInstance(ABCD).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(5))                           .getAmountOfCall()); }
                @DisplayName("null")       @Test void testNull()   { assertEquals(4, newInstance(ABCD).executeWhileHavingIndexesOnField(it ->          it.toReverse(null))                        .getAmountOfCall()); }
                @DisplayName("0, 0")       @Test void test0_0()    { assertEquals(1, newInstance(ABCD).executeWhileHavingIndexesOnField(it ->          it.toReverse(0,             0))            .getAmountOfCall()); }
                @DisplayName("0, 1")       @Test void test0_1()    { assertEquals(2, newInstance(ABCD).executeWhileHavingIndexesOnField(it ->          it.toReverse(0,             1))            .getAmountOfCall()); }
                @DisplayName("0, 2")       @Test void test0_2()    { assertEquals(3, newInstance(ABCD).executeWhileHavingIndexesOnField(it ->          it.toReverse(0,             2))            .getAmountOfCall()); }
                @DisplayName("0, 3")       @Test void test0_3()    { assertEquals(4, newInstance(ABCD).executeWhileHavingIndexesOnField(it ->          it.toReverse(0,             3))            .getAmountOfCall()); }
                @DisplayName("0, 4")       @Test void test0_4()    { assertEquals(0, newInstance(ABCD).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(0,             4))            .getAmountOfCall()); }
                @DisplayName("0, 5")       @Test void test0_5()    { assertEquals(0, newInstance(ABCD).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(0,             5))            .getAmountOfCall()); }
                @DisplayName("0, null")    @Test void test0_null() { assertEquals(4, newInstance(ABCD).executeWhileHavingIndexesOnField(it ->          it.toReverse(0,             null))         .getAmountOfCall()); }
                @DisplayName("1, 0")       @Test void test1_0()    { assertEquals(0, newInstance(ABCD).executeWhileExpectingInvalidIndexRange(it ->    it.toReverse(1,             0))            .getAmountOfCall()); }
                @DisplayName("1, 1")       @Test void test1_1()    { assertEquals(1, newInstance(ABCD).executeWhileHavingIndexesOnField(it ->          it.toReverse(1,             1))            .getAmountOfCall()); }
                @DisplayName("1, 2")       @Test void test1_2()    { assertEquals(2, newInstance(ABCD).executeWhileHavingIndexesOnField(it ->          it.toReverse(1,             2))            .getAmountOfCall()); }
                @DisplayName("1, 3")       @Test void test1_3()    { assertEquals(3, newInstance(ABCD).executeWhileHavingIndexesOnField(it ->          it.toReverse(1,             3))            .getAmountOfCall()); }
                @DisplayName("1, 4")       @Test void test1_4()    { assertEquals(0, newInstance(ABCD).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(1,             4))            .getAmountOfCall()); }
                @DisplayName("1, 5")       @Test void test1_5()    { assertEquals(0, newInstance(ABCD).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(1,             5))            .getAmountOfCall()); }
                @DisplayName("1, null")    @Test void test1_null() { assertEquals(3, newInstance(ABCD).executeWhileHavingIndexesOnField(it ->          it.toReverse(1,             null))         .getAmountOfCall()); }
                @DisplayName("2, 0")       @Test void test2_0()    { assertEquals(0, newInstance(ABCD).executeWhileExpectingInvalidIndexRange(it ->    it.toReverse(2,             0))            .getAmountOfCall()); }
                @DisplayName("2, 1")       @Test void test2_1()    { assertEquals(0, newInstance(ABCD).executeWhileExpectingInvalidIndexRange(it ->    it.toReverse(2,             1))            .getAmountOfCall()); }
                @DisplayName("2, 2")       @Test void test2_2()    { assertEquals(1, newInstance(ABCD).executeWhileHavingIndexesOnField(it ->          it.toReverse(2,             2))            .getAmountOfCall()); }
                @DisplayName("2, 3")       @Test void test2_3()    { assertEquals(2, newInstance(ABCD).executeWhileHavingIndexesOnField(it ->          it.toReverse(2,             3))            .getAmountOfCall()); }
                @DisplayName("2, 4")       @Test void test2_4()    { assertEquals(0, newInstance(ABCD).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(2,             4))            .getAmountOfCall()); }
                @DisplayName("2, 5")       @Test void test2_5()    { assertEquals(0, newInstance(ABCD).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(2,             5))            .getAmountOfCall()); }
                @DisplayName("2, null")    @Test void test2_null() { assertEquals(2, newInstance(ABCD).executeWhileHavingIndexesOnField(it ->          it.toReverse(2,             null))         .getAmountOfCall()); }
                @DisplayName("3, 0")       @Test void test3_0()    { assertEquals(0, newInstance(ABCD).executeWhileExpectingInvalidIndexRange(it ->    it.toReverse(3,             0))            .getAmountOfCall()); }
                @DisplayName("3, 1")       @Test void test3_1()    { assertEquals(0, newInstance(ABCD).executeWhileExpectingInvalidIndexRange(it ->    it.toReverse(3,             1))            .getAmountOfCall()); }
                @DisplayName("3, 2")       @Test void test3_2()    { assertEquals(0, newInstance(ABCD).executeWhileExpectingInvalidIndexRange(it ->    it.toReverse(3,             2))            .getAmountOfCall()); }
                @DisplayName("3, 3")       @Test void test3_3()    { assertEquals(1, newInstance(ABCD).executeWhileHavingIndexesOnField(it ->          it.toReverse(3,             3))            .getAmountOfCall()); }
                @DisplayName("3, 4")       @Test void test3_4()    { assertEquals(0, newInstance(ABCD).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(3,             4))            .getAmountOfCall()); }
                @DisplayName("3, 5")       @Test void test3_5()    { assertEquals(0, newInstance(ABCD).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(3,             5))            .getAmountOfCall()); }
                @DisplayName("3, null")    @Test void test3_null() { assertEquals(1, newInstance(ABCD).executeWhileHavingIndexesOnField(it ->          it.toReverse(3,             null))         .getAmountOfCall()); }
                @DisplayName("4, 0")       @Test void test4_0()    { assertEquals(0, newInstance(ABCD).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(4,             0))            .getAmountOfCall()); }
                @DisplayName("4, 1")       @Test void test4_1()    { assertEquals(0, newInstance(ABCD).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(4,             1))            .getAmountOfCall()); }
                @DisplayName("4, 2")       @Test void test4_2()    { assertEquals(0, newInstance(ABCD).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(4,             2))            .getAmountOfCall()); }
                @DisplayName("4, 3")       @Test void test4_3()    { assertEquals(0, newInstance(ABCD).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(4,             3))            .getAmountOfCall()); }
                @DisplayName("4, 4")       @Test void test4_4()    { assertEquals(0, newInstance(ABCD).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(4,             4))            .getAmountOfCall()); }
                @DisplayName("4, 5")       @Test void test4_5()    { assertEquals(0, newInstance(ABCD).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(4,             5))            .getAmountOfCall()); }
                @DisplayName("4, null")    @Test void test4_null() { assertEquals(0, newInstance(ABCD).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(4,             null))         .getAmountOfCall()); }
                @DisplayName("5, 0")       @Test void test5_0()    { assertEquals(0, newInstance(ABCD).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(5,             0))            .getAmountOfCall()); }
                @DisplayName("5, 1")       @Test void test5_1()    { assertEquals(0, newInstance(ABCD).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(5,             1))            .getAmountOfCall()); }
                @DisplayName("5, 2")       @Test void test5_2()    { assertEquals(0, newInstance(ABCD).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(5,             2))            .getAmountOfCall()); }
                @DisplayName("5, 3")       @Test void test5_3()    { assertEquals(0, newInstance(ABCD).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(5,             3))            .getAmountOfCall()); }
                @DisplayName("5, 4")       @Test void test5_4()    { assertEquals(0, newInstance(ABCD).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(5,             4))            .getAmountOfCall()); }
                @DisplayName("5, 5")       @Test void test5_5()    { assertEquals(0, newInstance(ABCD).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(5,             5))            .getAmountOfCall()); }
                @DisplayName("5, null")    @Test void test5_null() { assertEquals(0, newInstance(ABCD).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(5,             null))         .getAmountOfCall()); }
                @DisplayName("null, 0")    @Test void null_0()     { assertEquals(1, newInstance(ABCD).executeWhileHavingIndexesOnField(it ->          it.toReverse(null,          0))            .getAmountOfCall()); }
                @DisplayName("null, 1")    @Test void null_1()     { assertEquals(2, newInstance(ABCD).executeWhileHavingIndexesOnField(it ->          it.toReverse(null,          1))            .getAmountOfCall()); }
                @DisplayName("null, 2")    @Test void null_2()     { assertEquals(3, newInstance(ABCD).executeWhileHavingIndexesOnField(it ->          it.toReverse(null,          2))            .getAmountOfCall()); }
                @DisplayName("null, 3")    @Test void null_3()     { assertEquals(4, newInstance(ABCD).executeWhileHavingIndexesOnField(it ->          it.toReverse(null,          3))            .getAmountOfCall()); }
                @DisplayName("null, 4")    @Test void null_4()     { assertEquals(0, newInstance(ABCD).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(null,          5))            .getAmountOfCall()); }
                @DisplayName("null, 5")    @Test void null_5()     { assertEquals(0, newInstance(ABCD).executeWhileExpectingIndexOutOfBound(it ->      it.toReverse(null,          4))            .getAmountOfCall()); }
                @DisplayName("null, null") @Test void null_null()  { assertEquals(4, newInstance(ABCD).executeWhileHavingIndexesOnField(it ->          it.toReverse(null,          null))         .getAmountOfCall()); }
            }

        }

        @Nested class empty {
            @DisplayName("∅")          @Test void testEmpty()     { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse()); }

                                       @Test void min()           { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(MIN_INT_VALUE)); }
            @DisplayName("-1")         @Test void minus1()        { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(-1)); }
            @DisplayName("0")          @Test void test0()         { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(0)); }
            @DisplayName("1")          @Test void test1()         { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(1)); }
                                       @Test void max()           { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(MAX_INT_VALUE)); }
            @DisplayName("null")       @Test void testNull()      { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(null)); }

            @DisplayName("min, min")   @Test void min_min()       { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(MIN_INT_VALUE, MIN_INT_VALUE)); }
            @DisplayName("min, -1")    @Test void min_minus1()    { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(MIN_INT_VALUE, -1)); }
            @DisplayName("min, 0")     @Test void min_0()         { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(MIN_INT_VALUE, 0)); }
            @DisplayName("min, 1")     @Test void min_1()         { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(MIN_INT_VALUE, 1)); }
            @DisplayName("min, max")   @Test void min_max()       { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(MIN_INT_VALUE, MAX_INT_VALUE)); }
            @DisplayName("min, null")  @Test void min_null()      { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(MIN_INT_VALUE, null)); }

            @DisplayName("-1, min")    @Test void minus1_min()    { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(-1,            MIN_INT_VALUE)); }
            @DisplayName("-1, -1")     @Test void minus1_minus1() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(-1,            -1)); }
            @DisplayName("-1, 0")      @Test void minus1_0()      { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(-1,            0)); }
            @DisplayName("-1, 1")      @Test void minus1_1()      { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(-1,            1)); }
            @DisplayName("-1, max")    @Test void minus1_max()    { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(-1,            MAX_INT_VALUE)); }
            @DisplayName("-1, null")   @Test void minus1_null()   { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(-1,            null)); }

            @DisplayName("0, min")     @Test void test0_min()     { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(0,             MIN_INT_VALUE)); }
            @DisplayName("0, -1")      @Test void test0_minus1()  { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(0,             -1)); }
            @DisplayName("0, 0")       @Test void test0_0()       { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(0,             0)); }
            @DisplayName("0, 1")       @Test void test0_1()       { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(0,             1)); }
            @DisplayName("0, max")     @Test void test0_max()     { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(0,             MAX_INT_VALUE)); }
            @DisplayName("0, null")    @Test void test0_null()    { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(0,             null)); }

            @DisplayName("1, min")     @Test void test1_min()     { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(1,             MIN_INT_VALUE)); }
            @DisplayName("1, -1")      @Test void test1_minus1()  { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(1,             -1)); }
            @DisplayName("1, 0")       @Test void test1_0()       { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(1,             0)); }
            @DisplayName("1, 1")       @Test void test1_1()       { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(1,             1)); }
            @DisplayName("1, max")     @Test void test1_max()     { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(1,             MAX_INT_VALUE)); }
            @DisplayName("1, null")    @Test void test1_null()    { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(1,             null)); }

            @DisplayName("max, min")   @Test void max_min()       { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(MAX_INT_VALUE, MIN_INT_VALUE)); }
            @DisplayName("max, -1")    @Test void max_minus1()    { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(MAX_INT_VALUE, -1)); }
            @DisplayName("max, 0")     @Test void max_0()         { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(MAX_INT_VALUE, 0)); }
            @DisplayName("max, 1")     @Test void max_1()         { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(MAX_INT_VALUE, 1)); }
            @DisplayName("max, max")   @Test void max_max()       { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(MAX_INT_VALUE, MAX_INT_VALUE)); }
            @DisplayName("max, null")  @Test void max_null()      { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(MAX_INT_VALUE, null)); }

            @DisplayName("null, min")  @Test void null_min()      { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(null,          MIN_INT_VALUE)); }
            @DisplayName("null, -1")   @Test void null_minus1()   { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(null,          -1)); }
            @DisplayName("null, 0")    @Test void null_0()        { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(null,          0)); }
            @DisplayName("null, 1")    @Test void null_1()        { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(null,          1)); }
            @DisplayName("null, max")  @Test void null_max()      { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(null,          MAX_INT_VALUE)); }
            @DisplayName("null, null") @Test void null_null()     { assertSame(emptyCollectionHolder(), newInstance(EMPTY).toReverse(null,          null)); }
        }
        @DisplayName("1 field") @Nested class Test1 {
            @DisplayName("∅")          @Test void testEmpty()     { assertArrayEquals(A,                                       newInstance(A).toReverse().toArray()); }

                                       @Test void min()           { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(MIN_INT_VALUE)); }
            @DisplayName("-2")         @Test void minus2()        { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(-2)); }
            @DisplayName("-1")         @Test void minus1()        { assertArrayEquals(A,                                       newInstance(A).toReverse(-1).toArray()); }
            @DisplayName("0")          @Test void test0()         { assertArrayEquals(A,                                       newInstance(A).toReverse(0).toArray()); }
            @DisplayName("1")          @Test void test1()         { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(1)); }
            @DisplayName("2")          @Test void test2()         { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(2)); }
                                       @Test void max()           { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(MAX_INT_VALUE)); }
            @DisplayName("null")       @Test void testNull()      { assertArrayEquals(A,                                       newInstance(A).toReverse(null).toArray()); }

            @DisplayName("min, min")   @Test void min_min()       { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(MIN_INT_VALUE, MIN_INT_VALUE)); }
            @DisplayName("min, -2")    @Test void min_minus2()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(MIN_INT_VALUE, -2)); }
            @DisplayName("min, -1")    @Test void min_minus1()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(MIN_INT_VALUE, -1)); }
            @DisplayName("min, 0")     @Test void min_0()         { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(MIN_INT_VALUE, 0)); }
            @DisplayName("min, 1")     @Test void min_1()         { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(MIN_INT_VALUE, 1)); }
            @DisplayName("min, 2")     @Test void min_2()         { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(MIN_INT_VALUE, 2)); }
            @DisplayName("min, max")   @Test void min_max()       { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(MIN_INT_VALUE, MAX_INT_VALUE)); }
            @DisplayName("min, null")  @Test void min_null()      { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(MIN_INT_VALUE, null)); }

            @DisplayName("-2, min")    @Test void minus2_min()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(-2,            MIN_INT_VALUE)); }
            @DisplayName("-2, -2")     @Test void minus2_minus2() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(-2,            -2)); }
            @DisplayName("-2, -1")     @Test void minus2_minus1() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(-2,            -1)); }
            @DisplayName("-2, 0")      @Test void minus2_0()      { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(-2,            0)); }
            @DisplayName("-2, 1")      @Test void minus2_1()      { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(-2,            1)); }
            @DisplayName("-2, 2")      @Test void minus2_2()      { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(-2,            2)); }
            @DisplayName("-2, max")    @Test void minus2_max()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(-2,            MAX_INT_VALUE)); }
            @DisplayName("-2, null")   @Test void minus2_null()   { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(-2,            null)); }

            @DisplayName("-1, min")    @Test void minus1_min()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(-1,            MIN_INT_VALUE)); }
            @DisplayName("-1, -2")     @Test void minus1_minus2() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(-1,            -2)); }
            @DisplayName("-1, -1")     @Test void minus1_minus1() { assertArrayEquals(A,                                       newInstance(A).toReverse(-1,            -1).toArray()); }
            @DisplayName("-1, 0")      @Test void minus1_0()      { assertArrayEquals(A,                                       newInstance(A).toReverse(-1,            0).toArray()); }
            @DisplayName("-1, 1")      @Test void minus1_1()      { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(-1,            1)); }
            @DisplayName("-1, 2")      @Test void minus1_2()      { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(-1,            2)); }
            @DisplayName("-1, max")    @Test void minus1_max()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(-1,            MAX_INT_VALUE)); }
            @DisplayName("-1, null")   @Test void minus1_null()   { assertArrayEquals(A,                                       newInstance(A).toReverse(-1,            null).toArray()); }

            @DisplayName("0, min")     @Test void test0_min()     { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(0,             MIN_INT_VALUE)); }
            @DisplayName("0, -2")      @Test void test0_minus2()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(0,             -2)); }
            @DisplayName("0, -1")      @Test void test0_minus1()  { assertArrayEquals(A,                                       newInstance(A).toReverse(0,             -1).toArray()); }
            @DisplayName("0, 0")       @Test void test0_0()       { assertArrayEquals(A,                                       newInstance(A).toReverse(0,             0).toArray()); }
            @DisplayName("0, 1")       @Test void test0_1()       { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(0,             1)); }
            @DisplayName("0, 2")       @Test void test0_2()       { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(0,             2)); }
            @DisplayName("0, max")     @Test void test0_max()     { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(0,             MAX_INT_VALUE)); }
            @DisplayName("0, null")    @Test void test0_null()    { assertArrayEquals(A,                                       newInstance(A).toReverse(0,             null).toArray()); }

            @DisplayName("1, min")     @Test void test1_min()     { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(1,             MIN_INT_VALUE)); }
            @DisplayName("1, -2")      @Test void test1_minus2()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(1,             -2)); }
            @DisplayName("1, -1")      @Test void test1_minus1()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(1,             -1)); }
            @DisplayName("1, 0")       @Test void test1_0()       { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(1,             0)); }
            @DisplayName("1, 1")       @Test void test1_1()       { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(1,             1)); }
            @DisplayName("1, 2")       @Test void test1_2()       { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(1,             2)); }
            @DisplayName("1, max")     @Test void test1_max()     { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(1,             MAX_INT_VALUE)); }
            @DisplayName("1, null")    @Test void test1_null()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(1,             null)); }

            @DisplayName("2, min")     @Test void test2_min()     { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(2,             MIN_INT_VALUE)); }
            @DisplayName("2, -2")      @Test void test2_minus2()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(2,             -2)); }
            @DisplayName("2, -1")      @Test void test2_minus1()  { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(2,             -1)); }
            @DisplayName("2, 0")       @Test void test2_0()       { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(2,             0)); }
            @DisplayName("2, 1")       @Test void test2_1()       { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(2,             1)); }
            @DisplayName("2, 2")       @Test void test2_2()       { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(2,             2)); }
            @DisplayName("2, max")     @Test void test2_max()     { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(2,             MAX_INT_VALUE)); }
            @DisplayName("2, null")    @Test void test2_null()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(2,             null)); }

            @DisplayName("max, min")   @Test void max_min()       { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(MAX_INT_VALUE, MIN_INT_VALUE)); }
            @DisplayName("max, -2")    @Test void max_minus2()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(MAX_INT_VALUE, -2)); }
            @DisplayName("max, -1")    @Test void max_minus1()    { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(MAX_INT_VALUE, -1)); }
            @DisplayName("max, 0")     @Test void max_0()         { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(MAX_INT_VALUE, 0)); }
            @DisplayName("max, 1")     @Test void max_1()         { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(MAX_INT_VALUE, 1)); }
            @DisplayName("max, 2")     @Test void max_2()         { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(MAX_INT_VALUE, 2)); }
            @DisplayName("max, max")   @Test void max_max()       { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(MAX_INT_VALUE, MAX_INT_VALUE)); }
            @DisplayName("max, null")  @Test void max_null()      { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(MAX_INT_VALUE, null)); }

            @DisplayName("null, min")  @Test void null_min()      { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(null,          MIN_INT_VALUE)); }
            @DisplayName("null, -2")   @Test void null_minus2()   { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(null,          -2)); }
            @DisplayName("null, -1")   @Test void null_minus1()   { assertArrayEquals(A,                                       newInstance(A).toReverse(null,          -1).toArray()); }
            @DisplayName("null, 0")    @Test void null_0()        { assertArrayEquals(A,                                       newInstance(A).toReverse(null,          0).toArray()); }
            @DisplayName("null, 1")    @Test void null_1()        { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(null,          1)); }
            @DisplayName("null, 2")    @Test void null_2()        { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(null,          2)); }
            @DisplayName("null, max")  @Test void null_max()      { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).toReverse(null,          MAX_INT_VALUE)); }
            @DisplayName("null, null") @Test void null_null()     { assertArrayEquals(A,                                       newInstance(A).toReverse(null,          null).toArray()); }
        }
        @DisplayName("2 fields") @Nested class Test2 {
            @DisplayName("∅")          @Test void testEmpty()     { assertArrayEquals(BA,                                       newInstance(AB).toReverse().toArray()); }

                                       @Test void min()           { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(MIN_INT_VALUE)); }
            @DisplayName("-3")         @Test void minus3()        { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(-3)); }
            @DisplayName("-2")         @Test void minus2()        { assertArrayEquals(BA,                                       newInstance(AB).toReverse(-2).toArray()); }
            @DisplayName("-1")         @Test void minus1()        { assertArrayEquals(B,                                        newInstance(AB).toReverse(-1).toArray()); }
            @DisplayName("0")          @Test void test0()         { assertArrayEquals(BA,                                       newInstance(AB).toReverse(0).toArray()); }
            @DisplayName("1")          @Test void test1()         { assertArrayEquals(B,                                        newInstance(AB).toReverse(1).toArray()); }
            @DisplayName("2")          @Test void test2()         { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(2)); }
            @DisplayName("3")          @Test void test3()         { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(3)); }
                                       @Test void max()           { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(MAX_INT_VALUE)); }
            @DisplayName("null")       @Test void testNull()      { assertArrayEquals(BA,                                       newInstance(AB).toReverse(null).toArray()); }

            @DisplayName("min, min")   @Test void min_min()       { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(MIN_INT_VALUE, MIN_INT_VALUE)); }
            @DisplayName("min, -3")    @Test void min_minus3()    { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(MIN_INT_VALUE, -3)); }
            @DisplayName("min, -2")    @Test void min_minus2()    { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(MIN_INT_VALUE, -2)); }
            @DisplayName("min, -1")    @Test void min_minus1()    { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(MIN_INT_VALUE, -1)); }
            @DisplayName("min, 0")     @Test void min_0()         { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(MIN_INT_VALUE, 0)); }
            @DisplayName("min, 1")     @Test void min_1()         { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(MIN_INT_VALUE, 1)); }
            @DisplayName("min, 2")     @Test void min_2()         { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(MIN_INT_VALUE, 2)); }
            @DisplayName("min, 3")     @Test void min_3()         { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(MIN_INT_VALUE, 3)); }
            @DisplayName("min, max")   @Test void min_max()       { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(MIN_INT_VALUE, MAX_INT_VALUE)); }
            @DisplayName("min, null")  @Test void min_null()      { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(MIN_INT_VALUE, null)); }

            @DisplayName("-3, min")    @Test void minus3_min()    { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(-3,            MIN_INT_VALUE)); }
            @DisplayName("-3, -3")     @Test void minus3_minus3() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(-3,            -3)); }
            @DisplayName("-3, -2")     @Test void minus3_minus2() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(-3,            -2)); }
            @DisplayName("-3, -1")     @Test void minus3_minus1() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(-3,            -1)); }
            @DisplayName("-3, 0")      @Test void minus3_0()      { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(-3,            0)); }
            @DisplayName("-3, 1")      @Test void minus3_1()      { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(-3,            1)); }
            @DisplayName("-3, 2")      @Test void minus3_2()      { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(-3,            2)); }
            @DisplayName("-3, 3")      @Test void minus3_3()      { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(-3,            3)); }
            @DisplayName("-3, max")    @Test void minus3_max()    { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(-3,            MAX_INT_VALUE)); }
            @DisplayName("-3, null")   @Test void minus3_null()   { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(-3,            null)); }

            @DisplayName("-2, min")    @Test void minus2_min()    { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(-2,            MIN_INT_VALUE)); }
            @DisplayName("-2, -3")     @Test void minus2_minus3() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(-2,            -3)); }
            @DisplayName("-2, -2")     @Test void minus2_minus2() { assertArrayEquals(A,                                        newInstance(AB).toReverse(-2,            -2).toArray()); }
            @DisplayName("-2, -1")     @Test void minus2_minus1() { assertArrayEquals(BA,                                       newInstance(AB).toReverse(-2,            -1).toArray()); }
            @DisplayName("-2, 0")      @Test void minus2_0()      { assertArrayEquals(A,                                        newInstance(AB).toReverse(-2,            0).toArray()); }
            @DisplayName("-2, 1")      @Test void minus2_1()      { assertArrayEquals(BA,                                       newInstance(AB).toReverse(-2,            1).toArray()); }
            @DisplayName("-2, 2")      @Test void minus2_2()      { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(-2,            2)); }
            @DisplayName("-2, 3")      @Test void minus2_3()      { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(-2,            3)); }
            @DisplayName("-2, max")    @Test void minus2_max()    { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(-2,            MAX_INT_VALUE)); }
            @DisplayName("-2, null")   @Test void minus2_null()   { assertArrayEquals(BA,                                       newInstance(AB).toReverse(-2,            null).toArray()); }

            @DisplayName("-1, min")    @Test void minus1_min()    { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(-1,            MIN_INT_VALUE)); }
            @DisplayName("-1, -3")     @Test void minus1_minus3() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(-1,            -3)); }
            @DisplayName("-1, -2")     @Test void minus1_minus2() { assertThrowsExactly(InvalidIndexRangeException.class, () -> newInstance(AB).toReverse(-1,            -2)); }
            @DisplayName("-1, -1")     @Test void minus1_minus1() { assertArrayEquals(B,                                        newInstance(AB).toReverse(-1,            -1).toArray()); }
            @DisplayName("-1, 0")      @Test void minus1_0()      { assertThrowsExactly(InvalidIndexRangeException.class, () -> newInstance(AB).toReverse(-1,            0)); }
            @DisplayName("-1, 1")      @Test void minus1_1()      { assertArrayEquals(B,                                        newInstance(AB).toReverse(-1,            1).toArray()); }
            @DisplayName("-1, 2")      @Test void minus1_2()      { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(-1,            2)); }
            @DisplayName("-1, 3")      @Test void minus1_3()      { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(-1,            3)); }
            @DisplayName("-1, max")    @Test void minus1_max()    { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(-1,            MAX_INT_VALUE)); }
            @DisplayName("-1, null")   @Test void minus1_null()   { assertArrayEquals(B,                                        newInstance(AB).toReverse(-1,            null).toArray()); }

            @DisplayName("0, min")     @Test void test0_min()     { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(0,             MIN_INT_VALUE)); }
            @DisplayName("0, -3")      @Test void test0_minus3()  { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(0,             -3)); }
            @DisplayName("0, -2")      @Test void test0_minus2()  { assertArrayEquals(A,                                        newInstance(AB).toReverse(0,             -2).toArray()); }
            @DisplayName("0, -1")      @Test void test0_minus1()  { assertArrayEquals(BA,                                       newInstance(AB).toReverse(0,             -1).toArray()); }
            @DisplayName("0, 0")       @Test void test0_0()       { assertArrayEquals(A,                                        newInstance(AB).toReverse(0,             0).toArray()); }
            @DisplayName("0, 1")       @Test void test0_1()       { assertArrayEquals(BA,                                       newInstance(AB).toReverse(0,             1).toArray()); }
            @DisplayName("0, 2")       @Test void test0_2()       { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(0,             2)); }
            @DisplayName("0, 3")       @Test void test0_3()       { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(0,             3)); }
            @DisplayName("0, max")     @Test void test0_max()     { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(0,             MAX_INT_VALUE)); }
            @DisplayName("0, null")    @Test void test0_null()    { assertArrayEquals(BA,                                       newInstance(AB).toReverse(0,             null).toArray()); }

            @DisplayName("1, min")     @Test void test1_min()     { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(1,             MIN_INT_VALUE)); }
            @DisplayName("1, -3")      @Test void test1_minus3()  { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(1,             -3)); }
            @DisplayName("1, -2")      @Test void test1_minus2()  { assertThrowsExactly(InvalidIndexRangeException.class, () -> newInstance(AB).toReverse(1,             -2)); }
            @DisplayName("1, -1")      @Test void test1_minus1()  { assertArrayEquals(B,                                        newInstance(AB).toReverse(1,             -1).toArray()); }
            @DisplayName("1, 0")       @Test void test1_0()       { assertThrowsExactly(InvalidIndexRangeException.class, () -> newInstance(AB).toReverse(1,             0)); }
            @DisplayName("1, 1")       @Test void test1_1()       { assertArrayEquals(B,                                        newInstance(AB).toReverse(1,             1).toArray()); }
            @DisplayName("1, 2")       @Test void test1_2()       { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(1,             2)); }
            @DisplayName("1, 3")       @Test void test1_3()       { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(1,             3)); }
            @DisplayName("1, max")     @Test void test1_max()     { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(1,             MAX_INT_VALUE)); }
            @DisplayName("1, null")    @Test void test1_null()    { assertArrayEquals(B,                                        newInstance(AB).toReverse(1,             null).toArray()); }

            @DisplayName("2, min")     @Test void test2_min()     { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(2,             MIN_INT_VALUE)); }
            @DisplayName("2, -3")      @Test void test2_minus3()  { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(2,             -3)); }
            @DisplayName("2, -2")      @Test void test2_minus2()  { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(2,             -2)); }
            @DisplayName("2, -1")      @Test void test2_minus1()  { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(2,             -1)); }
            @DisplayName("2, 0")       @Test void test2_0()       { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(2,             0)); }
            @DisplayName("2, 1")       @Test void test2_1()       { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(2,             1)); }
            @DisplayName("2, 2")       @Test void test2_2()       { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(2,             2)); }
            @DisplayName("2, 3")       @Test void test2_3()       { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(2,             3)); }
            @DisplayName("2, max")     @Test void test2_max()     { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(2,             MAX_INT_VALUE)); }
            @DisplayName("2, null")    @Test void test2_null()    { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(2,             null)); }

            @DisplayName("3, min")     @Test void test3_min()     { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(3,             MIN_INT_VALUE)); }
            @DisplayName("3, -3")      @Test void test3_minus3()  { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(3,             -3)); }
            @DisplayName("3, -2")      @Test void test3_minus2()  { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(3,             -2)); }
            @DisplayName("3, -1")      @Test void test3_minus1()  { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(3,             -1)); }
            @DisplayName("3, 0")       @Test void test3_0()       { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(3,             0)); }
            @DisplayName("3, 1")       @Test void test3_1()       { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(3,             1)); }
            @DisplayName("3, 2")       @Test void test3_2()       { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(3,             2)); }
            @DisplayName("3, 3")       @Test void test3_3()       { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(3,             3)); }
            @DisplayName("3, max")     @Test void test3_max()     { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(3,             MAX_INT_VALUE)); }
            @DisplayName("3, null")    @Test void test3_null()    { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(3,             null)); }

            @DisplayName("max, min")   @Test void max_min()       { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(MAX_INT_VALUE, MIN_INT_VALUE)); }
            @DisplayName("max, -3")    @Test void max_minus3()    { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(MAX_INT_VALUE, -3)); }
            @DisplayName("max, -2")    @Test void max_minus2()    { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(MAX_INT_VALUE, -2)); }
            @DisplayName("max, -1")    @Test void max_minus1()    { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(MAX_INT_VALUE, -1)); }
            @DisplayName("max, 0")     @Test void max_0()         { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(MAX_INT_VALUE, 0)); }
            @DisplayName("max, 1")     @Test void max_1()         { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(MAX_INT_VALUE, 1)); }
            @DisplayName("max, 2")     @Test void max_2()         { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(MAX_INT_VALUE, 2)); }
            @DisplayName("max, 3")     @Test void max_3()         { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(MAX_INT_VALUE, 3)); }
            @DisplayName("max, max")   @Test void max_max()       { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(MAX_INT_VALUE, MAX_INT_VALUE)); }
            @DisplayName("max, null")  @Test void max_null()      { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(MAX_INT_VALUE, null)); }

            @DisplayName("null, min")  @Test void null_min()      { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(null,          MIN_INT_VALUE)); }
            @DisplayName("null, -3")   @Test void null_minus3()   { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(null,          -3)); }
            @DisplayName("null, -2")   @Test void null_minus2()   { assertArrayEquals(A,                                        newInstance(AB).toReverse(null,          -2).toArray()); }
            @DisplayName("null, -1")   @Test void null_minus1()   { assertArrayEquals(BA,                                       newInstance(AB).toReverse(null,          -1).toArray()); }
            @DisplayName("null, 0")    @Test void null_0()        { assertArrayEquals(A,                                        newInstance(AB).toReverse(null,          0).toArray()); }
            @DisplayName("null, 1")    @Test void null_1()        { assertArrayEquals(BA,                                       newInstance(AB).toReverse(null,          1).toArray()); }
            @DisplayName("null, 2")    @Test void null_2()        { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(null,          2)); }
            @DisplayName("null, 3")    @Test void null_3()        { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(null,          3)); }
            @DisplayName("null, max")  @Test void null_max()      { assertThrowsExactly(IndexOutOfBoundsException.class, () ->  newInstance(AB).toReverse(null,          MAX_INT_VALUE)); }
            @DisplayName("null, null") @Test void null_null()     { assertArrayEquals(BA,                                       newInstance(AB).toReverse(null,          null).toArray()); }
        }
        @DisplayName("4 fields") @Nested class Test4 {
            @DisplayName("∅")          @Test void testEmpty()     { assertArrayEquals(DCBA,                                      newInstance(ABCD).toReverse().toArray()); }

                                       @Test void min()           { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(MIN_INT_VALUE)); }
            @DisplayName("-5")         @Test void minus5()        { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(-5)); }
            @DisplayName("-4")         @Test void minus4()        { assertArrayEquals(DCBA,                                      newInstance(ABCD).toReverse(-4).toArray()); }
            @DisplayName("-3")         @Test void minus3()        { assertArrayEquals(DCB,                                       newInstance(ABCD).toReverse(-3).toArray()); }
            @DisplayName("-2")         @Test void minus2()        { assertArrayEquals(DC,                                        newInstance(ABCD).toReverse(-2).toArray()); }
            @DisplayName("-1")         @Test void minus1()        { assertArrayEquals(D,                                         newInstance(ABCD).toReverse(-1).toArray()); }
            @DisplayName("0")          @Test void test0()         { assertArrayEquals(DCBA,                                      newInstance(ABCD).toReverse(0).toArray()); }
            @DisplayName("1")          @Test void test1()         { assertArrayEquals(DCB,                                       newInstance(ABCD).toReverse(1).toArray()); }
            @DisplayName("2")          @Test void test2()         { assertArrayEquals(DC,                                        newInstance(ABCD).toReverse(2).toArray()); }
            @DisplayName("3")          @Test void test3()         { assertArrayEquals(D,                                         newInstance(ABCD).toReverse(3).toArray()); }
            @DisplayName("4")          @Test void test4()         { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(4)); }
            @DisplayName("5")          @Test void test5()         { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(5)); }
                                       @Test void max()           { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(MAX_INT_VALUE)); }
            @DisplayName("null")       @Test void testNull()      { assertArrayEquals(DCBA,                                      newInstance(ABCD).toReverse(null).toArray()); }

            @DisplayName("min, min")   @Test void min_min()       { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(MIN_INT_VALUE, MIN_INT_VALUE)); }
            @DisplayName("min, -5")    @Test void min_minus5()    { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(MIN_INT_VALUE, -5)); }
            @DisplayName("min, -4")    @Test void min_minus4()    { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(MIN_INT_VALUE, -4)); }
            @DisplayName("min, -3")    @Test void min_minus3()    { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(MIN_INT_VALUE, -3)); }
            @DisplayName("min, -2")    @Test void min_minus2()    { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(MIN_INT_VALUE, -2)); }
            @DisplayName("min, -1")    @Test void min_minus1()    { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(MIN_INT_VALUE, -1)); }
            @DisplayName("min, 0")     @Test void min_0()         { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(MIN_INT_VALUE, 0)); }
            @DisplayName("min, 1")     @Test void min_1()         { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(MIN_INT_VALUE, 1)); }
            @DisplayName("min, 2")     @Test void min_2()         { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(MIN_INT_VALUE, 2)); }
            @DisplayName("min, 3")     @Test void min_3()         { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(MIN_INT_VALUE, 3)); }
            @DisplayName("min, 4")     @Test void min_4()         { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(MIN_INT_VALUE, 4)); }
            @DisplayName("min, 5")     @Test void min_5()         { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(MIN_INT_VALUE, 5)); }
            @DisplayName("min, max")   @Test void min_max()       { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(MIN_INT_VALUE, MAX_INT_VALUE)); }
            @DisplayName("min, null")  @Test void min_null()      { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(MIN_INT_VALUE, null)); }

            @DisplayName("-5, min")    @Test void minus5_min()    { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(-5,            MIN_INT_VALUE)); }
            @DisplayName("-5, -5")     @Test void minus5_minus5() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(-5,            -5)); }
            @DisplayName("-5, -4")     @Test void minus5_minus4() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(-5,            -4)); }
            @DisplayName("-5, -3")     @Test void minus5_minus3() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(-5,            -3)); }
            @DisplayName("-5, -2")     @Test void minus5_minus2() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(-5,            -2)); }
            @DisplayName("-5, -1")     @Test void minus5_minus1() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(-5,            -1)); }
            @DisplayName("-5, 0")      @Test void minus5_0()      { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(-5,            0)); }
            @DisplayName("-5, 1")      @Test void minus5_1()      { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(-5,            1)); }
            @DisplayName("-5, 2")      @Test void minus5_2()      { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(-5,            2)); }
            @DisplayName("-5, 3")      @Test void minus5_3()      { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(-5,            3)); }
            @DisplayName("-5, 4")      @Test void minus5_4()      { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(-5,            4)); }
            @DisplayName("-5, 5")      @Test void minus5_5()      { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(-5,            5)); }
            @DisplayName("-5, max")    @Test void minus5_max()    { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(-5,            MAX_INT_VALUE)); }
            @DisplayName("-5, null")   @Test void minus5_null()   { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(-5,            null)); }

            @DisplayName("-4, min")    @Test void minus4_min()    { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(-4,            MIN_INT_VALUE)); }
            @DisplayName("-4, -5")     @Test void minus4_minus5() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(-4,            -5)); }
            @DisplayName("-4, -4")     @Test void minus4_minus4() { assertArrayEquals(A,                                         newInstance(ABCD).toReverse(-4,            -4).toArray()); }
            @DisplayName("-4, -3")     @Test void minus4_minus3() { assertArrayEquals(BA,                                        newInstance(ABCD).toReverse(-4,            -3).toArray()); }
            @DisplayName("-4, -2")     @Test void minus4_minus2() { assertArrayEquals(CBA,                                       newInstance(ABCD).toReverse(-4,            -2).toArray()); }
            @DisplayName("-4, -1")     @Test void minus4_minus1() { assertArrayEquals(DCBA,                                      newInstance(ABCD).toReverse(-4,            -1).toArray()); }
            @DisplayName("-4, 0")      @Test void minus4_0()      { assertArrayEquals(A,                                         newInstance(ABCD).toReverse(-4,            0).toArray()); }
            @DisplayName("-4, 1")      @Test void minus4_1()      { assertArrayEquals(BA,                                        newInstance(ABCD).toReverse(-4,            1).toArray()); }
            @DisplayName("-4, 2")      @Test void minus4_2()      { assertArrayEquals(CBA,                                       newInstance(ABCD).toReverse(-4,            2).toArray()); }
            @DisplayName("-4, 3")      @Test void minus4_3()      { assertArrayEquals(DCBA,                                      newInstance(ABCD).toReverse(-4,            3).toArray()); }
            @DisplayName("-4, 4")      @Test void minus4_4()      { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(-4,            4)); }
            @DisplayName("-4, 5")      @Test void minus4_5()      { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(-4,            5)); }
            @DisplayName("-4, max")    @Test void minus4_max()    { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(-4,            MAX_INT_VALUE)); }
            @DisplayName("-4, null")   @Test void minus4_null()   { assertArrayEquals(DCBA,                                      newInstance(ABCD).toReverse(-4,            null).toArray()); }

            @DisplayName("-3, min")    @Test void minus3_min()    { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(-3,            MIN_INT_VALUE)); }
            @DisplayName("-3, -5")     @Test void minus3_minus5() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(-3,            -5)); }
            @DisplayName("-3, -4")     @Test void minus3_minus4() { assertThrowsExactly(InvalidIndexRangeException.class, () ->  newInstance(ABCD).toReverse(-3,            -4)); }
            @DisplayName("-3, -3")     @Test void minus3_minus3() { assertArrayEquals(B,                                         newInstance(ABCD).toReverse(-3,            -3).toArray()); }
            @DisplayName("-3, -2")     @Test void minus3_minus2() { assertArrayEquals(CB,                                        newInstance(ABCD).toReverse(-3,            -2).toArray()); }
            @DisplayName("-3, -1")     @Test void minus3_minus1() { assertArrayEquals(DCB,                                       newInstance(ABCD).toReverse(-3,            -1).toArray()); }
            @DisplayName("-3, 0")      @Test void minus3_0()      { assertThrowsExactly(InvalidIndexRangeException.class, () ->  newInstance(ABCD).toReverse(-3,            0)); }
            @DisplayName("-3, 1")      @Test void minus3_1()      { assertArrayEquals(B,                                         newInstance(ABCD).toReverse(-3,            1).toArray()); }
            @DisplayName("-3, 2")      @Test void minus3_2()      { assertArrayEquals(CB,                                        newInstance(ABCD).toReverse(-3,            2).toArray()); }
            @DisplayName("-3, 3")      @Test void minus3_3()      { assertArrayEquals(DCB,                                       newInstance(ABCD).toReverse(-3,            3).toArray()); }
            @DisplayName("-3, 4")      @Test void minus3_4()      { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(-3,            4)); }
            @DisplayName("-3, 5")      @Test void minus3_5()      { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(-3,            5)); }
            @DisplayName("-3, max")    @Test void minus3_max()    { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(-3,            MAX_INT_VALUE)); }
            @DisplayName("-3, null")   @Test void minus3_null()   { assertArrayEquals(DCB,                                       newInstance(ABCD).toReverse(-3,            null).toArray()); }

            @DisplayName("-2, min")    @Test void minus2_min()    { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(-2,            MIN_INT_VALUE)); }
            @DisplayName("-2, -5")     @Test void minus2_minus5() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(-2,            -5)); }
            @DisplayName("-2, -4")     @Test void minus2_minus4() { assertThrowsExactly(InvalidIndexRangeException.class, () ->  newInstance(ABCD).toReverse(-2,            -4)); }
            @DisplayName("-2, -3")     @Test void minus2_minus3() { assertThrowsExactly(InvalidIndexRangeException.class, () ->  newInstance(ABCD).toReverse(-2,            -3)); }
            @DisplayName("-2, -2")     @Test void minus2_minus2() { assertArrayEquals(C,                                         newInstance(ABCD).toReverse(-2,            -2).toArray()); }
            @DisplayName("-2, -1")     @Test void minus2_minus1() { assertArrayEquals(DC,                                        newInstance(ABCD).toReverse(-2,            -1).toArray()); }
            @DisplayName("-2, 0")      @Test void minus2_0()      { assertThrowsExactly(InvalidIndexRangeException.class, () ->  newInstance(ABCD).toReverse(-2,            0)); }
            @DisplayName("-2, 1")      @Test void minus2_1()      { assertThrowsExactly(InvalidIndexRangeException.class, () ->  newInstance(ABCD).toReverse(-2,            1)); }
            @DisplayName("-2, 2")      @Test void minus2_2()      { assertArrayEquals(C,                                         newInstance(ABCD).toReverse(-2,            2).toArray()); }
            @DisplayName("-2, 3")      @Test void minus2_3()      { assertArrayEquals(DC,                                        newInstance(ABCD).toReverse(-2,            3).toArray()); }
            @DisplayName("-2, 4")      @Test void minus2_4()      { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(-2,            4)); }
            @DisplayName("-2, 5")      @Test void minus2_5()      { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(-2,            5)); }
            @DisplayName("-2, max")    @Test void minus2_max()    { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(-2,            MAX_INT_VALUE)); }
            @DisplayName("-2, null")   @Test void minus2_null()   { assertArrayEquals(DC,                                        newInstance(ABCD).toReverse(-2,            null).toArray()); }

            @DisplayName("-1, min")    @Test void minus1_min()    { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(-1,            MIN_INT_VALUE)); }
            @DisplayName("-1, -5")     @Test void minus1_minus5() { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(-1,            -5)); }
            @DisplayName("-1, -4")     @Test void minus1_minus4() { assertThrowsExactly(InvalidIndexRangeException.class, () ->  newInstance(ABCD).toReverse(-1,            -4)); }
            @DisplayName("-1, -3")     @Test void minus1_minus3() { assertThrowsExactly(InvalidIndexRangeException.class, () ->  newInstance(ABCD).toReverse(-1,            -3)); }
            @DisplayName("-1, -2")     @Test void minus1_minus2() { assertThrowsExactly(InvalidIndexRangeException.class, () ->  newInstance(ABCD).toReverse(-1,            -2)); }
            @DisplayName("-1, -1")     @Test void minus1_minus1() { assertArrayEquals(D,                                         newInstance(ABCD).toReverse(-1,            -1).toArray()); }
            @DisplayName("-1, 0")      @Test void minus1_0()      { assertThrowsExactly(InvalidIndexRangeException.class, () ->  newInstance(ABCD).toReverse(-1,            0)); }
            @DisplayName("-1, 1")      @Test void minus1_1()      { assertThrowsExactly(InvalidIndexRangeException.class, () ->  newInstance(ABCD).toReverse(-1,            1)); }
            @DisplayName("-1, 2")      @Test void minus1_2()      { assertThrowsExactly(InvalidIndexRangeException.class, () ->  newInstance(ABCD).toReverse(-1,            2)); }
            @DisplayName("-1, 3")      @Test void minus1_3()      { assertArrayEquals(D,                                         newInstance(ABCD).toReverse(-1,            3).toArray()); }
            @DisplayName("-1, 4")      @Test void minus1_4()      { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(-1,            4)); }
            @DisplayName("-1, 5")      @Test void minus1_5()      { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(-1,            5)); }
            @DisplayName("-1, max")    @Test void minus1_max()    { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(-1,            MAX_INT_VALUE)); }
            @DisplayName("-1, null")   @Test void minus1_null()   { assertArrayEquals(D,                                         newInstance(ABCD).toReverse(-1,            null).toArray()); }

            @DisplayName("0, min")     @Test void test0_min()     { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(0,             MIN_INT_VALUE)); }
            @DisplayName("0, -5")      @Test void test0_minus5()  { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(0,             -5)); }
            @DisplayName("0, -4")      @Test void test0_minus4()  { assertArrayEquals(A,                                         newInstance(ABCD).toReverse(0,             -4).toArray()); }
            @DisplayName("0, -3")      @Test void test0_minus3()  { assertArrayEquals(BA,                                        newInstance(ABCD).toReverse(0,             -3).toArray()); }
            @DisplayName("0, -2")      @Test void test0_minus2()  { assertArrayEquals(CBA,                                       newInstance(ABCD).toReverse(0,             -2).toArray()); }
            @DisplayName("0, -1")      @Test void test0_minus1()  { assertArrayEquals(DCBA,                                      newInstance(ABCD).toReverse(0,             -1).toArray()); }
            @DisplayName("0, 0")       @Test void test0_0()       { assertArrayEquals(A,                                         newInstance(ABCD).toReverse(0,             0).toArray()); }
            @DisplayName("0, 1")       @Test void test0_1()       { assertArrayEquals(BA,                                        newInstance(ABCD).toReverse(0,             1).toArray()); }
            @DisplayName("0, 2")       @Test void test0_2()       { assertArrayEquals(CBA,                                       newInstance(ABCD).toReverse(0,             2).toArray()); }
            @DisplayName("0, 3")       @Test void test0_3()       { assertArrayEquals(DCBA,                                      newInstance(ABCD).toReverse(0,             3).toArray()); }
            @DisplayName("0, 4")       @Test void test0_4()       { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(0,             4)); }
            @DisplayName("0, 5")       @Test void test0_5()       { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(0,             5)); }
            @DisplayName("0, max")     @Test void test0_max()     { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(0,             MAX_INT_VALUE)); }
            @DisplayName("0, null")    @Test void test0_null()    { assertArrayEquals(DCBA,                                      newInstance(ABCD).toReverse(0,             null).toArray()); }

            @DisplayName("1, min")     @Test void test1_min()     { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(1,             MIN_INT_VALUE)); }
            @DisplayName("1, -5")      @Test void test1_minus5()  { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(1,             -5)); }
            @DisplayName("1, -4")      @Test void test1_minus4()  { assertThrowsExactly(InvalidIndexRangeException.class, () ->  newInstance(ABCD).toReverse(1,             -4)); }
            @DisplayName("1, -3")      @Test void test1_minus3()  { assertArrayEquals(B,                                         newInstance(ABCD).toReverse(1,             -3).toArray()); }
            @DisplayName("1, -2")      @Test void test1_minus2()  { assertArrayEquals(CB,                                        newInstance(ABCD).toReverse(1,             -2).toArray()); }
            @DisplayName("1, -1")      @Test void test1_minus1()  { assertArrayEquals(DCB,                                       newInstance(ABCD).toReverse(1,             -1).toArray()); }
            @DisplayName("1, 0")       @Test void test1_0()       { assertThrowsExactly(InvalidIndexRangeException.class, () ->  newInstance(ABCD).toReverse(1,             0)); }
            @DisplayName("1, 1")       @Test void test1_1()       { assertArrayEquals(B,                                         newInstance(ABCD).toReverse(1,             1).toArray()); }
            @DisplayName("1, 2")       @Test void test1_2()       { assertArrayEquals(CB,                                        newInstance(ABCD).toReverse(1,             2).toArray()); }
            @DisplayName("1, 3")       @Test void test1_3()       { assertArrayEquals(DCB,                                       newInstance(ABCD).toReverse(1,             3).toArray()); }
            @DisplayName("1, 4")       @Test void test1_4()       { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(1,             4)); }
            @DisplayName("1, 5")       @Test void test1_5()       { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(1,             5)); }
            @DisplayName("1, max")     @Test void test1_max()     { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(1,             MAX_INT_VALUE)); }
            @DisplayName("1, null")    @Test void test1_null()    { assertArrayEquals(DCB,                                       newInstance(ABCD).toReverse(1,             null).toArray()); }

            @DisplayName("2, min")     @Test void test2_min()     { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(2,             MIN_INT_VALUE)); }
            @DisplayName("2, -5")      @Test void test2_minus5()  { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(2,             -5)); }
            @DisplayName("2, -4")      @Test void test2_minus4()  { assertThrowsExactly(InvalidIndexRangeException.class, () ->  newInstance(ABCD).toReverse(2,             -4)); }
            @DisplayName("2, -3")      @Test void test2_minus3()  { assertThrowsExactly(InvalidIndexRangeException.class, () ->  newInstance(ABCD).toReverse(2,             -3)); }
            @DisplayName("2, -2")      @Test void test2_minus2()  { assertArrayEquals(C,                                         newInstance(ABCD).toReverse(2,             -2).toArray()); }
            @DisplayName("2, -1")      @Test void test2_minus1()  { assertArrayEquals(DC,                                        newInstance(ABCD).toReverse(2,             -1).toArray()); }
            @DisplayName("2, 0")       @Test void test2_0()       { assertThrowsExactly(InvalidIndexRangeException.class, () ->  newInstance(ABCD).toReverse(2,             0)); }
            @DisplayName("2, 1")       @Test void test2_1()       { assertThrowsExactly(InvalidIndexRangeException.class, () ->  newInstance(ABCD).toReverse(2,             1)); }
            @DisplayName("2, 2")       @Test void test2_2()       { assertArrayEquals(C,                                         newInstance(ABCD).toReverse(2,             2).toArray()); }
            @DisplayName("2, 3")       @Test void test2_3()       { assertArrayEquals(DC,                                        newInstance(ABCD).toReverse(2,             3).toArray()); }
            @DisplayName("2, 4")       @Test void test2_4()       { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(2,             4)); }
            @DisplayName("2, 5")       @Test void test2_5()       { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(2,             5)); }
            @DisplayName("2, max")     @Test void test2_max()     { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(2,             MAX_INT_VALUE)); }
            @DisplayName("2, null")    @Test void test2_null()    { assertArrayEquals(DC,                                        newInstance(ABCD).toReverse(2,             null).toArray()); }

            @DisplayName("3, min")     @Test void test3_min()     { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(3,             MIN_INT_VALUE)); }
            @DisplayName("3, -5")      @Test void test3_minus5()  { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(3,             -5)); }
            @DisplayName("3, -4")      @Test void test3_minus4()  { assertThrowsExactly(InvalidIndexRangeException.class, () ->  newInstance(ABCD).toReverse(3,             -4)); }
            @DisplayName("3, -3")      @Test void test3_minus3()  { assertThrowsExactly(InvalidIndexRangeException.class, () ->  newInstance(ABCD).toReverse(3,             -3)); }
            @DisplayName("3, -2")      @Test void test3_minus2()  { assertThrowsExactly(InvalidIndexRangeException.class, () ->  newInstance(ABCD).toReverse(3,             -2)); }
            @DisplayName("3, -1")      @Test void test3_minus1()  { assertArrayEquals(D,                                         newInstance(ABCD).toReverse(3,             -1).toArray()); }
            @DisplayName("3, 0")       @Test void test3_0()       { assertThrowsExactly(InvalidIndexRangeException.class, () ->  newInstance(ABCD).toReverse(3,             0)); }
            @DisplayName("3, 1")       @Test void test3_1()       { assertThrowsExactly(InvalidIndexRangeException.class, () ->  newInstance(ABCD).toReverse(3,             1)); }
            @DisplayName("3, 2")       @Test void test3_2()       { assertThrowsExactly(InvalidIndexRangeException.class, () ->  newInstance(ABCD).toReverse(3,             2)); }
            @DisplayName("3, 3")       @Test void test3_3()       { assertArrayEquals(D,                                         newInstance(ABCD).toReverse(3,             3).toArray()); }
            @DisplayName("3, 4")       @Test void test3_4()       { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(3,             4)); }
            @DisplayName("3, 5")       @Test void test3_5()       { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(3,             5)); }
            @DisplayName("3, max")     @Test void test3_max()     { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(3,             MAX_INT_VALUE)); }
            @DisplayName("3, null")    @Test void test3_null()    { assertArrayEquals(D,                                         newInstance(ABCD).toReverse(3,             null).toArray()); }

            @DisplayName("4, min")     @Test void test4_min()     { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(4,             MIN_INT_VALUE)); }
            @DisplayName("4, -5")      @Test void test4_minus5()  { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(4,             -5)); }
            @DisplayName("4, -4")      @Test void test4_minus4()  { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(4,             -4)); }
            @DisplayName("4, -3")      @Test void test4_minus3()  { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(4,             -3)); }
            @DisplayName("4, -2")      @Test void test4_minus2()  { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(4,             -2)); }
            @DisplayName("4, -1")      @Test void test4_minus1()  { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(4,             -1)); }
            @DisplayName("4, 0")       @Test void test4_0()       { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(4,             0)); }
            @DisplayName("4, 1")       @Test void test4_1()       { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(4,             1)); }
            @DisplayName("4, 2")       @Test void test4_2()       { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(4,             2)); }
            @DisplayName("4, 3")       @Test void test4_3()       { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(4,             3)); }
            @DisplayName("4, 4")       @Test void test4_4()       { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(4,             4)); }
            @DisplayName("4, 5")       @Test void test4_5()       { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(4,             5)); }
            @DisplayName("4, max")     @Test void test4_max()     { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(4,             MAX_INT_VALUE)); }
            @DisplayName("4, null")    @Test void test4_null()    { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(4,             null)); }

            @DisplayName("5, min")     @Test void test5_min()     { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(5,             MIN_INT_VALUE)); }
            @DisplayName("5, -5")      @Test void test5_minus5()  { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(5,             -5)); }
            @DisplayName("5, -4")      @Test void test5_minus4()  { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(5,             -4)); }
            @DisplayName("5, -3")      @Test void test5_minus3()  { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(5,             -3)); }
            @DisplayName("5, -2")      @Test void test5_minus2()  { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(5,             -2)); }
            @DisplayName("5, -1")      @Test void test5_minus1()  { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(5,             -1)); }
            @DisplayName("5, 0")       @Test void test5_0()       { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(5,             0)); }
            @DisplayName("5, 1")       @Test void test5_1()       { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(5,             1)); }
            @DisplayName("5, 2")       @Test void test5_2()       { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(5,             2)); }
            @DisplayName("5, 3")       @Test void test5_3()       { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(5,             3)); }
            @DisplayName("5, 4")       @Test void test5_4()       { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(5,             4)); }
            @DisplayName("5, 5")       @Test void test5_5()       { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(5,             5)); }
            @DisplayName("5, max")     @Test void test5_max()     { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(5,             MAX_INT_VALUE)); }
            @DisplayName("5, null")    @Test void test5_null()    { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(5,             null)); }

            @DisplayName("max, min")   @Test void max_min()       { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(MAX_INT_VALUE, MIN_INT_VALUE)); }
            @DisplayName("max, -5")    @Test void max_minus5()    { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(MAX_INT_VALUE, -5)); }
            @DisplayName("max, -4")    @Test void max_minus4()    { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(MAX_INT_VALUE, -4)); }
            @DisplayName("max, -3")    @Test void max_minus3()    { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(MAX_INT_VALUE, -3)); }
            @DisplayName("max, -2")    @Test void max_minus2()    { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(MAX_INT_VALUE, -2)); }
            @DisplayName("max, -1")    @Test void max_minus1()    { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(MAX_INT_VALUE, -1)); }
            @DisplayName("max, 0")     @Test void max_0()         { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(MAX_INT_VALUE, 0)); }
            @DisplayName("max, 1")     @Test void max_1()         { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(MAX_INT_VALUE, 1)); }
            @DisplayName("max, 2")     @Test void max_2()         { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(MAX_INT_VALUE, 2)); }
            @DisplayName("max, 3")     @Test void max_3()         { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(MAX_INT_VALUE, 3)); }
            @DisplayName("max, 4")     @Test void max_4()         { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(MAX_INT_VALUE, 4)); }
            @DisplayName("max, 5")     @Test void max_5()         { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(MAX_INT_VALUE, 5)); }
            @DisplayName("max, max")   @Test void max_max()       { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(MAX_INT_VALUE, MAX_INT_VALUE)); }
            @DisplayName("max, null")  @Test void max_null()      { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(MAX_INT_VALUE, null)); }

            @DisplayName("null, min")  @Test void null_min()      { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(null,          MIN_INT_VALUE)); }
            @DisplayName("null, -5")   @Test void null_minus5()   { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(null,          -5)); }
            @DisplayName("null, -4")   @Test void null_minus4()   { assertArrayEquals(A,                                         newInstance(ABCD).toReverse(null,          -4).toArray()); }
            @DisplayName("null, -3")   @Test void null_minus3()   { assertArrayEquals(BA,                                        newInstance(ABCD).toReverse(null,          -3).toArray()); }
            @DisplayName("null, -2")   @Test void null_minus2()   { assertArrayEquals(CBA,                                       newInstance(ABCD).toReverse(null,          -2).toArray()); }
            @DisplayName("null, -1")   @Test void null_minus1()   { assertArrayEquals(DCBA,                                      newInstance(ABCD).toReverse(null,          -1).toArray()); }
            @DisplayName("null, 0")    @Test void null_0()        { assertArrayEquals(A,                                         newInstance(ABCD).toReverse(null,          0).toArray()); }
            @DisplayName("null, 1")    @Test void null_1()        { assertArrayEquals(BA,                                        newInstance(ABCD).toReverse(null,          1).toArray()); }
            @DisplayName("null, 2")    @Test void null_2()        { assertArrayEquals(CBA,                                       newInstance(ABCD).toReverse(null,          2).toArray()); }
            @DisplayName("null, 3")    @Test void null_3()        { assertArrayEquals(DCBA,                                      newInstance(ABCD).toReverse(null,          3).toArray()); }
            @DisplayName("null, 4")    @Test void null_4()        { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(null,          5)); }
            @DisplayName("null, 5")    @Test void null_5()        { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(null,          4)); }
            @DisplayName("null, max")  @Test void null_max()      { assertThrowsExactly(IndexOutOfBoundsException.class, () ->   newInstance(ABCD).toReverse(null,          MAX_INT_VALUE)); }
            @DisplayName("null, null") @Test void null_null()     { assertArrayEquals(DCBA,                                      newInstance(ABCD).toReverse(null,          null).toArray()); }
        }

    }

}

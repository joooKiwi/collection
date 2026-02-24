import condition.DisableIfNormalCondition;
import condition.DisableIfNormalViewerCondition;
import instance.CollectionHolderForTest;
import joookiwi.collection.java.exception.EmptyCollectionException;
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

import static joookiwi.collection.java.CollectionConstants.emptyCollection;
import static joookiwi.collection.java.CollectionConstants.emptyCollectionHolder;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;
import static value.Arrays.A;
import static value.Arrays.AB;
import static value.Arrays.ABCD;
import static value.Arrays.AC;
import static value.Arrays.A_NULL;
import static value.Arrays.A_NULL_C_NULL;
import static value.Arrays.B;
import static value.Arrays.BD;
import static value.Arrays.EMPTY;
import static value.Arrays.NULL;
import static value.Arrays.NULL_A;
import static value.Arrays.NULL_B;
import static value.Arrays.NULL_B_NULL_D;
import static value.Arrays.NULL_x2;
import static value.Arrays.NULL_x4;
import static value.Arrays.UPPER_E;
import static value.Arrays.UPPER_EE;
import static value.Arrays.UPPER_EEEE;
import static value.Callbacks.supplier0AsFail;
import static value.Callbacks.supplier1AltAsFail;
import static value.Callbacks.supplier1AsFail;
import static value.Callbacks.supplier2AltAsFail;
import static value.Callbacks.supplier2AsFail;
import static value.Callbacks_Null.callbackAsNull0;
import static value.Callbacks_Null.callbackOnlyIfEven;
import static value.Callbacks_Null.callbackOnlyIfEvenAlt;
import static value.Callbacks_Null.callbackOnlyIfOdd;
import static value.Callbacks_Null.callbackOnlyIfOddAlt;
import static value.Callbacks_String.callbackAsString0;
import static value.Callbacks_String.callbackAsString1;
import static value.Callbacks_String.callbackAsString1Alt;
import static value.Callbacks_String.callbackAsString2;
import static value.Callbacks_String.callbackAsString2Alt;
import static value.Callbacks_String.callbackToString0;
import static value.ReusableFields.EMPTY_ARRAY;
import static value.ReusableFields_Null.NULL_PREDICATE0;
import static value.ReusableFields_Null.NULL_PREDICATE1;
import static value.ReusableFields_Null.NULL_PREDICATE2;
import static value.ReusableFields_Null.NULL_SUPPLIER0;
import static value.ReusableFields_Null.NULL_SUPPLIER1;
import static value.ReusableFields_Null.NULL_SUPPLIER1_ALT;
import static value.ReusableFields_Null.NULL_SUPPLIER2;
import static value.ReusableFields_Null.NULL_SUPPLIER2_ALT;
import static value.ReusableFields_Null.NULL_VARARGS;

@NotNullByDefault
@DisplayNameGeneration(Simple.class) @DisplayName("CollectionHolder tests (map)") class CollectionHolder13_MapTests {

    @Nested class EmptyCollectionHolder extends AbstractEmptyCollectionHolderTests {
        @Nested class map {
             @DisplayName("∅")                 @Test void testEmpty()     { assertSame(instance, instance.map()); }
            @DisplayName("null (T, int) → U") @Test void test2Arg()      { assertSame(instance, instance.map(NULL_SUPPLIER2)); }
            @DisplayName("null (T) → U")      @Test void test1Arg()      { assertSame(instance, instance.map(NULL_SUPPLIER1)); }
            @DisplayName("null () → U")       @Test void test0Arg()      { assertSame(instance, instance.map(NULL_SUPPLIER0)); }
            @DisplayName("null array")        @Test void testNullArray() { assertSame(instance, instance.map(NULL_VARARGS)); }
            @DisplayName("[]")                @Test void testArray()     { assertSame(instance, instance.map(EMPTY_ARRAY)); }
        }
        @Nested class mapIndexed {
            @DisplayName("∅")                 @Test void testEmpty()     { assertSame(instance, instance.mapIndexed()); }
            @DisplayName("null (T, int) → U") @Test void test2Arg()      { assertSame(instance, instance.mapIndexed(NULL_SUPPLIER2_ALT)); }
            @DisplayName("null (T) → U")      @Test void test1Arg()      { assertSame(instance, instance.mapIndexed(NULL_SUPPLIER1_ALT)); }
            @DisplayName("null () → U")       @Test void test0Arg()      { assertSame(instance, instance.mapIndexed(NULL_SUPPLIER0)); }
            @DisplayName("null array")        @Test void testNullArray() { assertSame(instance, instance.mapIndexed(NULL_VARARGS)); }
            @DisplayName("[]")                @Test void testArray()     { assertSame(instance, instance.mapIndexed(EMPTY_ARRAY)); }
        }
        @Nested class mapNotNull {
            @DisplayName("∅")                  @Test void testEmpty()     { assertSame(instance, instance.mapNotNull()); }
            @DisplayName("null (T, int) → U?") @Test void test2Arg()      { assertSame(instance, instance.mapNotNull(NULL_SUPPLIER2)); }
            @DisplayName("null (T) → U?")      @Test void test1Arg()      { assertSame(instance, instance.mapNotNull(NULL_SUPPLIER1)); }
            @DisplayName("null () → U?")       @Test void test0Arg()      { assertSame(instance, instance.mapNotNull(NULL_SUPPLIER0)); }
            @DisplayName("null array")         @Test void testNullArray() { assertSame(instance, instance.mapNotNull(NULL_VARARGS)); }
            @DisplayName("[]")                 @Test void testArray()     { assertSame(instance, instance.mapNotNull(EMPTY_ARRAY)); }
        }
        @Nested class mapNotNullIndexed {
            @DisplayName("∅")                  @Test void testEmpty()     { assertSame(instance, instance.mapNotNullIndexed()); }
            @DisplayName("null (T, int) → U?") @Test void test2Arg()      { assertSame(instance, instance.mapNotNullIndexed(NULL_SUPPLIER2_ALT)); }
            @DisplayName("null (T) → U?")      @Test void test1Arg()      { assertSame(instance, instance.mapNotNullIndexed(NULL_SUPPLIER1_ALT)); }
            @DisplayName("null () → U?")       @Test void test0Arg()      { assertSame(instance, instance.mapNotNullIndexed(NULL_SUPPLIER0)); }
            @DisplayName("null array")         @Test void testNullArray() { assertSame(instance, instance.mapNotNullIndexed(NULL_VARARGS)); }
            @DisplayName("[]")                 @Test void testArray()     { assertSame(instance, instance.mapNotNullIndexed(EMPTY_ARRAY)); }
        }
    }

    @FieldSource("value.Instances#everyExtensionMethodInstancesAsArguments")
    @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class methods extends AbstractMethodsTests {
        //#region -------------------- Required test configuration --------------------

        public methods(final CollectionHolderForTest<?, ?> instance) { super(instance); }

        //#endregion -------------------- Required test configuration --------------------

        @Nested class map {
            @DisplayName("(T, int) → U") @Test void test2Arg()      { assertSame(emptyCollectionHolder(), stringInstance.map(supplier2AsFail)); }
            @DisplayName("(T) → U")      @Test void test1Arg()      { assertSame(emptyCollectionHolder(), stringInstance.map(supplier1AsFail)); }
            @DisplayName("() → U")       @Test void test0Arg()      { assertSame(emptyCollectionHolder(),       instance.map(supplier0AsFail)); }
        }
        @Nested class mapIndexed {
            @DisplayName("(T, int) → U") @Test void test2Arg()      { assertSame(emptyCollectionHolder(), stringInstance.mapIndexed(supplier2AltAsFail)); }
            @DisplayName("(T) → U")      @Test void test1Arg()      { assertSame(emptyCollectionHolder(),       instance.mapIndexed(supplier1AltAsFail)); }
            @DisplayName("() → U")       @Test void test0Arg()      { assertSame(emptyCollectionHolder(),       instance.mapIndexed(supplier0AsFail)); }
        }

        @Nested class mapNotNull {
            @DisplayName("(T, int) → U?") @Test void test2Arg()      { assertSame(emptyCollectionHolder(), stringInstance.mapNotNull(supplier2AsFail)); }
            @DisplayName("(T) → U?")      @Test void test1Arg()      { assertSame(emptyCollectionHolder(), stringInstance.mapNotNull(supplier1AsFail)); }
            @DisplayName("() → U?")       @Test void test0Arg()      { assertSame(emptyCollectionHolder(),       instance.mapNotNull(supplier0AsFail)); }
        }
        @Nested class mapNotNullIndexed {
            @DisplayName("(T, int) → U?") @Test void test2Arg()      { assertSame(emptyCollectionHolder(), stringInstance.mapNotNullIndexed(supplier2AltAsFail)); }
            @DisplayName("(T) → U?")      @Test void test1Arg()      { assertSame(emptyCollectionHolder(),       instance.mapNotNullIndexed(supplier1AltAsFail)); }
            @DisplayName("() → U?")       @Test void test0Arg()      { assertSame(emptyCollectionHolder(),       instance.mapNotNullIndexed(supplier0AsFail)); }
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

            @Nested class map {
                @DisplayName("empty: (T, int) → U")    @Test void empty_2Arg() { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.map(supplier2AsFail))  .getAmountOfCall()); }
                @DisplayName("empty: (T) → U")         @Test void empty_1Arg() { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.map(supplier1AsFail))  .getAmountOfCall()); }
                @DisplayName("empty: () → U")          @Test void empty_0Arg() { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.map(supplier0AsFail))  .getAmountOfCall()); }
                @DisplayName("1 field: (T, int) → U")  @Test void test1_2Arg() { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.map(callbackAsString2)).getAmountOfCall()); }
                @DisplayName("1 field: (T) → U")       @Test void test1_1Arg() { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.map(callbackAsString1)).getAmountOfCall()); }
                @DisplayName("1 field: () → U")        @Test void test1_0Arg() { assertEquals(0, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.map(callbackAsString0)).getAmountOfCall()); }
                @DisplayName("2 fields: (T, int) → U") @Test void test2_2Arg() { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.map(callbackAsString2)).getAmountOfCall()); }
                @DisplayName("2 fields: (T) → U")      @Test void test2_1Arg() { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.map(callbackAsString1)).getAmountOfCall()); }
                @DisplayName("2 fields: () → U")       @Test void test2_0Arg() { assertEquals(0, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.map(callbackAsString0)).getAmountOfCall()); }
                @DisplayName("4 fields: (T, int) → U") @Test void test4_2Arg() { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.map(callbackAsString2)).getAmountOfCall()); }
                @DisplayName("4 fields: (T) → U")      @Test void test4_1Arg() { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.map(callbackAsString1)).getAmountOfCall()); }
                @DisplayName("4 fields: () → U")       @Test void test4_0Arg() { assertEquals(0, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.map(callbackAsString0)).getAmountOfCall()); }
            }
            @Nested class mapIndexed {
                @DisplayName("empty: (int, T) → U")    @Test void empty_2Arg() { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.mapIndexed(supplier2AltAsFail)).getAmountOfCall()); }
                @DisplayName("empty: (int) → U")       @Test void empty_1Arg() { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.mapIndexed(supplier1AltAsFail)).getAmountOfCall()); }
                @DisplayName("empty: () → U")          @Test void empty_0Arg() { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.mapIndexed(supplier0AsFail))   .getAmountOfCall()); }
                @DisplayName("1 field: (int, T) → U")  @Test void test1_2Arg() { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.mapIndexed(callbackAsString2Alt)).getAmountOfCall()); }
                @DisplayName("1 field: (int) → U")     @Test void test1_1Arg() { assertEquals(0, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.mapIndexed(callbackAsString1Alt)).getAmountOfCall()); }
                @DisplayName("1 field: () → U")        @Test void test1_0Arg() { assertEquals(0, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.mapIndexed(callbackAsString0))   .getAmountOfCall()); }
                @DisplayName("2 fields: (int, T) → U") @Test void test2_2Arg() { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.mapIndexed(callbackAsString2Alt)).getAmountOfCall()); }
                @DisplayName("2 fields: (int) → U")    @Test void test2_1Arg() { assertEquals(0, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.mapIndexed(callbackAsString1Alt)).getAmountOfCall()); }
                @DisplayName("2 fields: () → U")       @Test void test2_0Arg() { assertEquals(0, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.mapIndexed(callbackAsString0))   .getAmountOfCall()); }
                @DisplayName("4 fields: (int, T) → U") @Test void test4_2Arg() { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.mapIndexed(callbackAsString2Alt)).getAmountOfCall()); }
                @DisplayName("4 fields: (int) → U")    @Test void test4_1Arg() { assertEquals(0, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.mapIndexed(callbackAsString1Alt)).getAmountOfCall()); }
                @DisplayName("4 fields: () → U")       @Test void test4_0Arg() { assertEquals(0, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.mapIndexed(callbackAsString0))   .getAmountOfCall()); }
            }

            @Nested class mapNotNull {
                @DisplayName("empty: (T, int) → U?")    @Test void empty_2Arg() { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.mapNotNull(supplier2AsFail))  .getAmountOfCall()); }
                @DisplayName("empty: (T) → U?")         @Test void empty_1Arg() { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.mapNotNull(supplier1AsFail))  .getAmountOfCall()); }
                @DisplayName("empty: () → U?")          @Test void empty_0Arg() { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.mapNotNull(supplier0AsFail))  .getAmountOfCall()); }
                @DisplayName("1 field: (T, int) → U?")  @Test void test1_2Arg() { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.mapNotNull(callbackAsString2)).getAmountOfCall()); }
                @DisplayName("1 field: (T) → U?")       @Test void test1_1Arg() { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.mapNotNull(callbackAsString1)).getAmountOfCall()); }
                @DisplayName("1 field: () → U?")        @Test void test1_0Arg() { assertEquals(0, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.mapNotNull(callbackAsString0)).getAmountOfCall()); }
                @DisplayName("2 fields: (T, int) → U?") @Test void test2_2Arg() { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.mapNotNull(callbackAsString2)).getAmountOfCall()); }
                @DisplayName("2 fields: (T) → U?")      @Test void test2_1Arg() { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.mapNotNull(callbackAsString1)).getAmountOfCall()); }
                @DisplayName("2 fields: () → U?")       @Test void test2_0Arg() { assertEquals(0, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.mapNotNull(callbackAsString0)).getAmountOfCall()); }
                @DisplayName("4 fields: (T, int) → U?") @Test void test4_2Arg() { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.mapNotNull(callbackAsString2)).getAmountOfCall()); }
                @DisplayName("4 fields: (T) → U?")      @Test void test4_1Arg() { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.mapNotNull(callbackAsString1)).getAmountOfCall()); }
                @DisplayName("4 fields: () → U?")       @Test void test4_0Arg() { assertEquals(0, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.mapNotNull(callbackAsString0)).getAmountOfCall()); }
            }
            @Nested class mapNotNullIndexed {
                @DisplayName("empty: (int, T) → U?")    @Test void empty_2Arg() { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.mapNotNullIndexed(supplier2AltAsFail))  .getAmountOfCall()); }
                @DisplayName("empty: (int) → U?")       @Test void empty_1Arg() { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.mapNotNullIndexed(supplier1AltAsFail))  .getAmountOfCall()); }
                @DisplayName("empty: () → U?")          @Test void empty_0Arg() { assertEquals(0, newInstance(EMPTY).executeWhileHavingIndexesOnField(it -> it.mapNotNullIndexed(supplier0AsFail))     .getAmountOfCall()); }
                @DisplayName("1 field: (int, T) → U?")  @Test void test1_2Arg() { assertEquals(1, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.mapNotNullIndexed(callbackAsString2Alt)).getAmountOfCall()); }
                @DisplayName("1 field: (int) → U?")     @Test void test1_1Arg() { assertEquals(0, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.mapNotNullIndexed(callbackAsString1Alt)).getAmountOfCall()); }
                @DisplayName("1 field: () → U?")        @Test void test1_0Arg() { assertEquals(0, newInstance(A)    .executeWhileHavingIndexesOnField(it -> it.mapNotNullIndexed(callbackAsString0))   .getAmountOfCall()); }
                @DisplayName("2 fields: (int, T) → U?") @Test void test2_2Arg() { assertEquals(2, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.mapNotNullIndexed(callbackAsString2Alt)).getAmountOfCall()); }
                @DisplayName("2 fields: (int) → U?")    @Test void test2_1Arg() { assertEquals(0, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.mapNotNullIndexed(callbackAsString1Alt)).getAmountOfCall()); }
                @DisplayName("2 fields: () → U?")       @Test void test2_0Arg() { assertEquals(0, newInstance(AB)   .executeWhileHavingIndexesOnField(it -> it.mapNotNullIndexed(callbackAsString0))   .getAmountOfCall()); }
                @DisplayName("4 fields: (int, T) → U?") @Test void test4_2Arg() { assertEquals(4, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.mapNotNullIndexed(callbackAsString2Alt)).getAmountOfCall()); }
                @DisplayName("4 fields: (int) → U?")    @Test void test4_1Arg() { assertEquals(0, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.mapNotNullIndexed(callbackAsString1Alt)).getAmountOfCall()); }
                @DisplayName("4 fields: () → U?")       @Test void test4_0Arg() { assertEquals(0, newInstance(ABCD) .executeWhileHavingIndexesOnField(it -> it.mapNotNullIndexed(callbackAsString0))   .getAmountOfCall()); }
            }

        }

        @Nested class map {
                                            @Test void empty()       { assertSame(emptyCollectionHolder(), newInstance(EMPTY).map(supplier0AsFail)); }
            @DisplayName("1 field: value")  @Test void test1_value() { assertArrayEquals(UPPER_E,          newInstance(A)    .map(callbackToString0).toArray()); }
            @DisplayName("1 field: null")   @Test void test1_null()  { assertArrayEquals(NULL,             newInstance(A)    .map(callbackAsNull0).toArray()); }
            @DisplayName("1 field: even")   @Test void test1_even()  { assertArrayEquals(A,                newInstance(A)    .map(callbackOnlyIfEven).toArray()); }
            @DisplayName("1 field: odd")    @Test void test1_odd()   { assertArrayEquals(NULL,             newInstance(A)    .map(callbackOnlyIfOdd).toArray()); }
            @DisplayName("2 fields: value") @Test void test2_value() { assertArrayEquals(UPPER_EE,         newInstance(AB)   .map(callbackToString0).toArray()); }
            @DisplayName("2 fields: null")  @Test void test2_null()  { assertArrayEquals(NULL_x2,          newInstance(AB)   .map(callbackAsNull0).toArray()); }
            @DisplayName("2 fields: even")  @Test void test2_even()  { assertArrayEquals(A_NULL,           newInstance(AB)   .map(callbackOnlyIfEven).toArray()); }
            @DisplayName("2 fields: odd")   @Test void test2_odd()   { assertArrayEquals(NULL_B,           newInstance(AB)   .map(callbackOnlyIfOdd).toArray()); }
            @DisplayName("4 fields: value") @Test void test4_value() { assertArrayEquals(UPPER_EEEE,       newInstance(ABCD) .map(callbackToString0).toArray()); }
            @DisplayName("4 fields: null")  @Test void test4_null()  { assertArrayEquals(NULL_x4,          newInstance(ABCD) .map(callbackAsNull0).toArray()); }
            @DisplayName("4 fields: even")  @Test void test4_even()  { assertArrayEquals(A_NULL_C_NULL,    newInstance(ABCD) .map(callbackOnlyIfEven).toArray()); }
            @DisplayName("4 fields: odd")   @Test void test4_odd()   { assertArrayEquals(NULL_B_NULL_D,    newInstance(ABCD) .map(callbackOnlyIfOdd).toArray()); }
        }
        @Nested class mapIndexed {
                                            @Test void empty()       { assertSame(emptyCollectionHolder(), newInstance(EMPTY).mapIndexed(supplier0AsFail)); }
            @DisplayName("1 field: value")  @Test void test1_value() { assertArrayEquals(UPPER_E,          newInstance(A)    .mapIndexed(callbackToString0).toArray()); }
            @DisplayName("1 field: null")   @Test void test1_null()  { assertArrayEquals(NULL,             newInstance(A)    .mapIndexed(callbackAsNull0).toArray()); }
            @DisplayName("1 field: even")   @Test void test1_even()  { assertArrayEquals(A,                newInstance(A)    .mapIndexed(callbackOnlyIfEvenAlt).toArray()); }
            @DisplayName("1 field: odd")    @Test void test1_odd()   { assertArrayEquals(NULL,             newInstance(A)    .mapIndexed(callbackOnlyIfOddAlt).toArray()); }
            @DisplayName("2 fields: value") @Test void test2_value() { assertArrayEquals(UPPER_EE,         newInstance(AB)   .mapIndexed(callbackToString0).toArray()); }
            @DisplayName("2 fields: null")  @Test void test2_null()  { assertArrayEquals(NULL_x2,          newInstance(AB)   .mapIndexed(callbackAsNull0).toArray()); }
            @DisplayName("2 fields: even")  @Test void test2_even()  { assertArrayEquals(A_NULL,           newInstance(AB)   .mapIndexed(callbackOnlyIfEvenAlt).toArray()); }
            @DisplayName("2 fields: odd")   @Test void test2_odd()   { assertArrayEquals(NULL_B,           newInstance(AB)   .mapIndexed(callbackOnlyIfOddAlt).toArray()); }
            @DisplayName("4 fields: value") @Test void test4_value() { assertArrayEquals(UPPER_EEEE,       newInstance(ABCD) .mapIndexed(callbackToString0).toArray()); }
            @DisplayName("4 fields: null")  @Test void test4_null()  { assertArrayEquals(NULL_x4,          newInstance(ABCD) .mapIndexed(callbackAsNull0).toArray()); }
            @DisplayName("4 fields: even")  @Test void test4_even()  { assertArrayEquals(A_NULL_C_NULL,    newInstance(ABCD) .mapIndexed(callbackOnlyIfEvenAlt).toArray()); }
            @DisplayName("4 fields: odd")   @Test void test4_odd()   { assertArrayEquals(NULL_B_NULL_D,    newInstance(ABCD) .mapIndexed(callbackOnlyIfOddAlt).toArray()); }
        }

        @Nested class mapNotNull {
                                            @Test void empty()       { assertSame(emptyCollectionHolder(), newInstance(EMPTY).mapNotNull(supplier0AsFail)); }
            @DisplayName("1 field: value")  @Test void test1_value() { assertArrayEquals(UPPER_E,          newInstance(A)    .mapNotNull(callbackToString0).toArray()); }
            @DisplayName("1 field: null")   @Test void test1_null()  { assertTrue(                         newInstance(A)    .mapNotNull(callbackAsNull0).isEmpty()); }
            @DisplayName("1 field: even")   @Test void test1_even()  { assertArrayEquals(A,                newInstance(A)    .mapNotNull(callbackOnlyIfEven).toArray()); }
            @DisplayName("1 field: odd")    @Test void test1_odd()   { assertTrue(                         newInstance(A)    .mapNotNull(callbackOnlyIfOdd).isEmpty()); }
            @DisplayName("2 fields: value") @Test void test2_value() { assertArrayEquals(UPPER_EE,         newInstance(AB)   .mapNotNull(callbackToString0).toArray()); }
            @DisplayName("2 fields: null")  @Test void test2_null()  { assertTrue(                         newInstance(AB)   .mapNotNull(callbackAsNull0).isEmpty()); }
            @DisplayName("2 fields: even")  @Test void test2_even()  { assertArrayEquals(A,                newInstance(AB)   .mapNotNull(callbackOnlyIfEven).toArray()); }
            @DisplayName("2 fields: odd")   @Test void test2_odd()   { assertArrayEquals(B,                newInstance(AB)   .mapNotNull(callbackOnlyIfOdd).toArray()); }
            @DisplayName("4 fields: value") @Test void test4_value() { assertArrayEquals(UPPER_EEEE,       newInstance(ABCD) .mapNotNull(callbackToString0).toArray()); }
            @DisplayName("4 fields: null")  @Test void test4_null()  { assertTrue(                         newInstance(ABCD) .mapNotNull(callbackAsNull0).isEmpty()); }
            @DisplayName("4 fields: even")  @Test void test4_even()  { assertArrayEquals(AC,               newInstance(ABCD) .mapNotNull(callbackOnlyIfEven).toArray()); }
            @DisplayName("4 fields: odd")   @Test void test4_odd()   { assertArrayEquals(BD,               newInstance(ABCD) .mapNotNull(callbackOnlyIfOdd).toArray()); }
        }
        @Nested class mapNotNullIndexed {
                                            @Test void empty()       { assertSame(emptyCollectionHolder(), newInstance(EMPTY).mapNotNullIndexed(supplier0AsFail)); }
            @DisplayName("1 field: value")  @Test void test1_value() { assertArrayEquals(UPPER_E,          newInstance(A)    .mapNotNullIndexed(callbackToString0).toArray()); }
            @DisplayName("1 field: null")   @Test void test1_null()  { assertTrue(                         newInstance(A)    .mapNotNullIndexed(callbackAsNull0).isEmpty()); }
            @DisplayName("1 field: even")   @Test void test1_even()  { assertArrayEquals(A,                newInstance(A)    .mapNotNullIndexed(callbackOnlyIfEvenAlt).toArray()); }
            @DisplayName("1 field: odd")    @Test void test1_odd()   { assertTrue(                         newInstance(A)    .mapNotNullIndexed(callbackOnlyIfOddAlt).isEmpty()); }
            @DisplayName("2 fields: value") @Test void test2_value() { assertArrayEquals(UPPER_EE,         newInstance(AB)   .mapNotNullIndexed(callbackToString0).toArray()); }
            @DisplayName("2 fields: null")  @Test void test2_null()  { assertTrue(                         newInstance(AB)   .mapNotNullIndexed(callbackAsNull0).isEmpty()); }
            @DisplayName("2 fields: even")  @Test void test2_even()  { assertArrayEquals(A,                newInstance(AB)   .mapNotNullIndexed(callbackOnlyIfEvenAlt).toArray()); }
            @DisplayName("2 fields: odd")   @Test void test2_odd()   { assertArrayEquals(B,                newInstance(AB)   .mapNotNullIndexed(callbackOnlyIfOddAlt).toArray()); }
            @DisplayName("4 fields: value") @Test void test4_value() { assertArrayEquals(UPPER_EEEE,       newInstance(ABCD) .mapNotNullIndexed(callbackToString0).toArray()); }
            @DisplayName("4 fields: null")  @Test void test4_null()  { assertTrue(                         newInstance(ABCD) .mapNotNullIndexed(callbackAsNull0).isEmpty()); }
            @DisplayName("4 fields: even")  @Test void test4_even()  { assertArrayEquals(AC,               newInstance(ABCD) .mapNotNullIndexed(callbackOnlyIfEvenAlt).toArray()); }
            @DisplayName("4 fields: odd")   @Test void test4_odd()   { assertArrayEquals(BD,               newInstance(ABCD) .mapNotNullIndexed(callbackOnlyIfOddAlt).toArray()); }
        }

    }

}

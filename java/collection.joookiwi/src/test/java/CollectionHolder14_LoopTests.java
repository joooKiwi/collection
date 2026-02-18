import condition.DisableIfNormalCondition;
import condition.DisableIfNormalViewerCondition;
import instance.CollectionHolderForTest;
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

import static assertion.AssertToBeInstance.assertToBeInstance;
import static joookiwi.collection.java.CollectionConstants.emptyCollectionHolder;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;
import static value.Arrays.A;
import static value.Arrays.AB;
import static value.Arrays.ABCD;
import static value.Arrays.EMPTY;
import static value.Callbacks.callback0;
import static value.Callbacks.callback1;
import static value.Callbacks.callback1Alt;
import static value.Callbacks.callback2;
import static value.Callbacks.callback2Alt;
import static value.Callbacks.consumer0AsFail;
import static value.Callbacks.consumer1AltAsFail;
import static value.Callbacks.consumer1AsFail;
import static value.Callbacks.consumer2AltAsFail;
import static value.Callbacks.consumer2AsFail;
import static value.ReusableFields.EMPTY_ARRAY;
import static value.ReusableFields_Null.NULL_CONSUMER0;
import static value.ReusableFields_Null.NULL_CONSUMER1;
import static value.ReusableFields_Null.NULL_CONSUMER1_ALT;
import static value.ReusableFields_Null.NULL_CONSUMER2;
import static value.ReusableFields_Null.NULL_CONSUMER2_ALT;
import static value.ReusableFields_Null.NULL_VARARGS;

@NotNullByDefault
@DisplayNameGeneration(Simple.class)
@DisplayName("CollectionHolder tests (loop)") @TestInstance(PER_CLASS) class CollectionHolder14_LoopTests {

    @TestInstance(PER_CLASS) @Nested class EmptyCollectionHolder extends AbstractEmptyCollectionHolderTests {
        @Nested class forEach {
            @DisplayName("∅")                    @Test void testEmpty()     { assertDoesNotThrow(() -> instance.forEach()); }
            @DisplayName("null (T, int) → void") @Test void test2Arg()      { assertDoesNotThrow(() -> instance.forEach(NULL_CONSUMER2)); }
            @DisplayName("null (T) → void")      @Test void test1Arg()      { assertDoesNotThrow(() -> instance.forEach(NULL_CONSUMER1)); }
            @DisplayName("null () → void")       @Test void test0Arg()      { assertDoesNotThrow(() -> instance.forEach(NULL_CONSUMER0)); }
            @DisplayName("null array")           @Test void testNullArray() { assertDoesNotThrow(() -> instance.forEach(NULL_VARARGS)); }
            @DisplayName("[]")                   @Test void testArray()     { assertDoesNotThrow(() -> instance.forEach(EMPTY_ARRAY)); }
        }
        @Nested class forEachIndexed {
            @DisplayName("∅")                    @Test void testEmpty()     { assertDoesNotThrow(() -> instance.mapIndexed()); }
            @DisplayName("null (T, int) → void") @Test void test2Arg()      { assertDoesNotThrow(() -> instance.mapIndexed(NULL_CONSUMER2_ALT)); }
            @DisplayName("null (T) → void")      @Test void test1Arg()      { assertDoesNotThrow(() -> instance.mapIndexed(NULL_CONSUMER1_ALT)); }
            @DisplayName("null () → void")       @Test void test0Arg()      { assertDoesNotThrow(() -> instance.mapIndexed(NULL_CONSUMER0)); }
            @DisplayName("null array")           @Test void testNullArray() { assertDoesNotThrow(() -> instance.mapIndexed(NULL_VARARGS)); }
            @DisplayName("[]")                   @Test void testArray()     { assertDoesNotThrow(() -> instance.mapIndexed(EMPTY_ARRAY)); }
        }
        @Nested class onEach {
            @DisplayName("∅")                    @Test void testEmpty()     { assertSame(instance, instance.onEach()); }
            @DisplayName("null (T, int) → void") @Test void test2Arg()      { assertSame(instance, instance.onEach(NULL_CONSUMER2)); }
            @DisplayName("null (T) → void")      @Test void test1Arg()      { assertSame(instance, instance.onEach(NULL_CONSUMER1)); }
            @DisplayName("null () → void")       @Test void test0Arg()      { assertSame(instance, instance.onEach(NULL_CONSUMER0)); }
            @DisplayName("null array")           @Test void testNullArray() { assertSame(instance, instance.onEach(NULL_VARARGS)); }
            @DisplayName("[]")                   @Test void testArray()     { assertSame(instance, instance.onEach(EMPTY_ARRAY)); }
        }
        @Nested class onEachIndexed {
            @DisplayName("∅")                    @Test void testEmpty()     { assertSame(instance, instance.onEachIndexed()); }
            @DisplayName("null (T, int) → void") @Test void test2Arg()      { assertSame(instance, instance.onEachIndexed(NULL_CONSUMER2_ALT)); }
            @DisplayName("null (T) → void")      @Test void test1Arg()      { assertSame(instance, instance.onEachIndexed(NULL_CONSUMER1_ALT)); }
            @DisplayName("null () → void")       @Test void test0Arg()      { assertSame(instance, instance.onEachIndexed(NULL_CONSUMER0)); }
            @DisplayName("null array")           @Test void testNullArray() { assertSame(instance, instance.onEachIndexed(NULL_VARARGS)); }
            @DisplayName("[]")                   @Test void testArray()     { assertSame(instance, instance.onEachIndexed(EMPTY_ARRAY)); }
        }
    }

    @FieldSource("value.Instances#everyExtensionMethodInstancesAsArguments")
    @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class methods extends AbstractMethodsTests {
        //#region -------------------- Required test configuration --------------------

        public methods(final CollectionHolderForTest<?, ?> instance) { super(instance); }

        //#endregion -------------------- Required test configuration --------------------

        @Nested class forEach {
            @DisplayName("(T, int) → void") @Test void test2Arg()      { assertDoesNotThrow(() -> stringInstance.forEach(consumer2AsFail)); }
            @DisplayName("(T) → void")      @Test void test1Arg()      { assertDoesNotThrow(() -> stringInstance.forEach(consumer1AsFail)); }
            @DisplayName("() → void")       @Test void test0Arg()      { assertDoesNotThrow(() ->       instance.forEach(consumer0AsFail)); }
        }
        @Nested class forEachIndexed {
            @DisplayName("(T, int) → void") @Test void test2Arg()      { assertDoesNotThrow(() -> stringInstance.forEachIndexed(consumer2AltAsFail)); }
            @DisplayName("(T) → void")      @Test void test1Arg()      { assertDoesNotThrow(() ->       instance.forEachIndexed(consumer1AltAsFail)); }
            @DisplayName("() → void")       @Test void test0Arg()      { assertDoesNotThrow(() ->       instance.forEachIndexed(consumer0AsFail)); }
        }

        @Nested class onEach {
            @DisplayName("(T, int) → void") @Test void test2Arg()      { assertSame(instance, stringInstance.onEach(consumer2AsFail)); }
            @DisplayName("(T) → void")      @Test void test1Arg()      { assertSame(instance, stringInstance.onEach(consumer1AsFail)); }
            @DisplayName("() → void")       @Test void test0Arg()      { assertSame(instance,       instance.onEach(consumer0AsFail)); }
        }
        @Nested class onEachIndexed {
            @DisplayName("(T, int) → void") @Test void test2Arg()      { assertSame(instance, stringInstance.onEachIndexed(consumer2AltAsFail)); }
            @DisplayName("(T) → void")      @Test void test1Arg()      { assertSame(instance,       instance.onEachIndexed(consumer1AltAsFail)); }
            @DisplayName("() → void")       @Test void test0Arg()      { assertSame(instance,       instance.onEachIndexed(consumer0AsFail)); }
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

            @Nested class forEach {
                @DisplayName("empty: (T, int) → void")    @Test void empty_2Arg() { assertEquals(0, newInstance(EMPTY).execute(it -> it.forEach(consumer2AsFail)).getAmountOfCall()); }
                @DisplayName("empty: (T) → void")         @Test void empty_1Arg() { assertEquals(0, newInstance(EMPTY).execute(it -> it.forEach(consumer1AsFail)).getAmountOfCall()); }
                @DisplayName("empty: () → void")          @Test void empty_0Arg() { assertEquals(0, newInstance(EMPTY).execute(it -> it.forEach(consumer0AsFail)).getAmountOfCall()); }
                @DisplayName("1 field: (T, int) → void")  @Test void test1_2Arg() { assertEquals(1, newInstance(A)    .execute(it -> it.forEach(callback2))      .getAmountOfCall()); }
                @DisplayName("1 field: (T) → void")       @Test void test1_1Arg() { assertEquals(1, newInstance(A)    .execute(it -> it.forEach(callback1))      .getAmountOfCall()); }
                @DisplayName("1 field: () → void")        @Test void test1_0Arg() { assertEquals(0, newInstance(A)    .execute(it -> it.forEach(callback0))      .getAmountOfCall()); }
                @DisplayName("2 fields: (T, int) → void") @Test void test2_2Arg() { assertEquals(2, newInstance(AB)   .execute(it -> it.forEach(callback2))      .getAmountOfCall()); }
                @DisplayName("2 fields: (T) → void")      @Test void test2_1Arg() { assertEquals(2, newInstance(AB)   .execute(it -> it.forEach(callback1))      .getAmountOfCall()); }
                @DisplayName("2 fields: () → void")       @Test void test2_0Arg() { assertEquals(0, newInstance(AB)   .execute(it -> it.forEach(callback0))      .getAmountOfCall()); }
                @DisplayName("4 fields: (T, int) → void") @Test void test4_2Arg() { assertEquals(4, newInstance(ABCD) .execute(it -> it.forEach(callback2))      .getAmountOfCall()); }
                @DisplayName("4 fields: (T) → void")      @Test void test4_1Arg() { assertEquals(4, newInstance(ABCD) .execute(it -> it.forEach(callback1))      .getAmountOfCall()); }
                @DisplayName("4 fields: () → void")       @Test void test4_0Arg() { assertEquals(0, newInstance(ABCD) .execute(it -> it.forEach(callback0))      .getAmountOfCall()); }
            }
            @Nested class forEachIndexed {
                @DisplayName("empty: (int, T) → void")    @Test void empty_2Arg() { assertEquals(0, newInstance(EMPTY).execute(it -> it.forEachIndexed(consumer2AltAsFail)).getAmountOfCall()); }
                @DisplayName("empty: (int) → void")       @Test void empty_1Arg() { assertEquals(0, newInstance(EMPTY).execute(it -> it.forEachIndexed(consumer1AltAsFail)).getAmountOfCall()); }
                @DisplayName("empty: () → void")          @Test void empty_0Arg() { assertEquals(0, newInstance(EMPTY).execute(it -> it.forEachIndexed(consumer0AsFail))   .getAmountOfCall()); }
                @DisplayName("1 field: (int, T) → void")  @Test void test1_2Arg() { assertEquals(1, newInstance(A)    .execute(it -> it.forEachIndexed(callback2Alt))      .getAmountOfCall()); }
                @DisplayName("1 field: (int) → void")     @Test void test1_1Arg() { assertEquals(0, newInstance(A)    .execute(it -> it.forEachIndexed(callback1Alt))      .getAmountOfCall()); }
                @DisplayName("1 field: () → void")        @Test void test1_0Arg() { assertEquals(0, newInstance(A)    .execute(it -> it.forEachIndexed(callback0))         .getAmountOfCall()); }
                @DisplayName("2 fields: (int, T) → void") @Test void test2_2Arg() { assertEquals(2, newInstance(AB)   .execute(it -> it.forEachIndexed(callback2Alt))      .getAmountOfCall()); }
                @DisplayName("2 fields: (int) → void")    @Test void test2_1Arg() { assertEquals(0, newInstance(AB)   .execute(it -> it.forEachIndexed(callback1Alt))      .getAmountOfCall()); }
                @DisplayName("2 fields: () → void")       @Test void test2_0Arg() { assertEquals(0, newInstance(AB)   .execute(it -> it.forEachIndexed(callback0))         .getAmountOfCall()); }
                @DisplayName("4 fields: (int, T) → void") @Test void test4_2Arg() { assertEquals(4, newInstance(ABCD) .execute(it -> it.forEachIndexed(callback2Alt))      .getAmountOfCall()); }
                @DisplayName("4 fields: (int) → void")    @Test void test4_1Arg() { assertEquals(0, newInstance(ABCD) .execute(it -> it.forEachIndexed(callback1Alt))      .getAmountOfCall()); }
                @DisplayName("4 fields: () → void")       @Test void test4_0Arg() { assertEquals(0, newInstance(ABCD) .execute(it -> it.forEachIndexed(callback0))         .getAmountOfCall()); }
            }

            @Nested class onEach {
                @DisplayName("empty: (T, int) → void")    @Test void empty_2Arg() { assertEquals(0, newInstance(EMPTY).execute(it -> it.onEach(consumer2AsFail)).getAmountOfCall()); }
                @DisplayName("empty: (T) → void")         @Test void empty_1Arg() { assertEquals(0, newInstance(EMPTY).execute(it -> it.onEach(consumer1AsFail)).getAmountOfCall()); }
                @DisplayName("empty: () → void")          @Test void empty_0Arg() { assertEquals(0, newInstance(EMPTY).execute(it -> it.onEach(consumer0AsFail)).getAmountOfCall()); }
                @DisplayName("1 field: (T, int) → void")  @Test void test1_2Arg() { assertEquals(1, newInstance(A)    .execute(it -> it.onEach(callback2))      .getAmountOfCall()); }
                @DisplayName("1 field: (T) → void")       @Test void test1_1Arg() { assertEquals(1, newInstance(A)    .execute(it -> it.onEach(callback1))      .getAmountOfCall()); }
                @DisplayName("1 field: () → void")        @Test void test1_0Arg() { assertEquals(0, newInstance(A)    .execute(it -> it.onEach(callback0))      .getAmountOfCall()); }
                @DisplayName("2 fields: (T, int) → void") @Test void test2_2Arg() { assertEquals(2, newInstance(AB)   .execute(it -> it.onEach(callback2))      .getAmountOfCall()); }
                @DisplayName("2 fields: (T) → void")      @Test void test2_1Arg() { assertEquals(2, newInstance(AB)   .execute(it -> it.onEach(callback1))      .getAmountOfCall()); }
                @DisplayName("2 fields: () → void")       @Test void test2_0Arg() { assertEquals(0, newInstance(AB)   .execute(it -> it.onEach(callback0))      .getAmountOfCall()); }
                @DisplayName("4 fields: (T, int) → void") @Test void test4_2Arg() { assertEquals(4, newInstance(ABCD) .execute(it -> it.onEach(callback2))      .getAmountOfCall()); }
                @DisplayName("4 fields: (T) → void")      @Test void test4_1Arg() { assertEquals(4, newInstance(ABCD) .execute(it -> it.onEach(callback1))      .getAmountOfCall()); }
                @DisplayName("4 fields: () → void")       @Test void test4_0Arg() { assertEquals(0, newInstance(ABCD) .execute(it -> it.onEach(callback0))      .getAmountOfCall()); }
            }
            @Nested class onEachIndexed {
                @DisplayName("empty: (int, T) → void")    @Test void empty_2Arg() { assertEquals(0, newInstance(EMPTY).execute(it -> it.onEachIndexed(consumer2AltAsFail)).getAmountOfCall()); }
                @DisplayName("empty: (int) → void")       @Test void empty_1Arg() { assertEquals(0, newInstance(EMPTY).execute(it -> it.onEachIndexed(consumer1AltAsFail)).getAmountOfCall()); }
                @DisplayName("empty: () → void")          @Test void empty_0Arg() { assertEquals(0, newInstance(EMPTY).execute(it -> it.onEachIndexed(consumer0AsFail))   .getAmountOfCall()); }
                @DisplayName("1 field: (int, T) → void")  @Test void test1_2Arg() { assertEquals(1, newInstance(A)    .execute(it -> it.onEachIndexed(callback2Alt))      .getAmountOfCall()); }
                @DisplayName("1 field: (int) → void")     @Test void test1_1Arg() { assertEquals(0, newInstance(A)    .execute(it -> it.onEachIndexed(callback1Alt))      .getAmountOfCall()); }
                @DisplayName("1 field: () → void")        @Test void test1_0Arg() { assertEquals(0, newInstance(A)    .execute(it -> it.onEachIndexed(callback0))         .getAmountOfCall()); }
                @DisplayName("2 fields: (int, T) → void") @Test void test2_2Arg() { assertEquals(2, newInstance(AB)   .execute(it -> it.onEachIndexed(callback2Alt))      .getAmountOfCall()); }
                @DisplayName("2 fields: (int) → void")    @Test void test2_1Arg() { assertEquals(0, newInstance(AB)   .execute(it -> it.onEachIndexed(callback1Alt))      .getAmountOfCall()); }
                @DisplayName("2 fields: () → void")       @Test void test2_0Arg() { assertEquals(0, newInstance(AB)   .execute(it -> it.onEachIndexed(callback0))         .getAmountOfCall()); }
                @DisplayName("4 fields: (int, T) → void") @Test void test4_2Arg() { assertEquals(4, newInstance(ABCD) .execute(it -> it.onEachIndexed(callback2Alt))      .getAmountOfCall()); }
                @DisplayName("4 fields: (int) → void")    @Test void test4_1Arg() { assertEquals(0, newInstance(ABCD) .execute(it -> it.onEachIndexed(callback1Alt))      .getAmountOfCall()); }
                @DisplayName("4 fields: () → void")       @Test void test4_0Arg() { assertEquals(0, newInstance(ABCD) .execute(it -> it.onEachIndexed(callback0))         .getAmountOfCall()); }
            }

        }

        @Nested class onEach {
            @DisplayName("empty: (T, int) → void")    @Test void empty_2Arg() { assertToBeInstance(newInstance(EMPTY), it -> it.onEach(consumer2AsFail)); }
            @DisplayName("empty: (T) → void")         @Test void empty_1Arg() { assertToBeInstance(newInstance(EMPTY), it -> it.onEach(consumer1AsFail)); }
            @DisplayName("empty: () → void")          @Test void empty_0Arg() { assertToBeInstance(newInstance(EMPTY), it -> it.onEach(consumer0AsFail)); }
            @DisplayName("1 field: (T, int) → void")  @Test void test1_2Arg() { assertToBeInstance(newInstance(A)    , it -> it.onEach(callback2)); }
            @DisplayName("1 field: (T) → void")       @Test void test1_1Arg() { assertToBeInstance(newInstance(A)    , it -> it.onEach(callback1)); }
            @DisplayName("1 field: () → void")        @Test void test1_0Arg() { assertToBeInstance(newInstance(A)    , it -> it.onEach(callback0)); }
            @DisplayName("2 fields: (T, int) → void") @Test void test2_2Arg() { assertToBeInstance(newInstance(AB)   , it -> it.onEach(callback2)); }
            @DisplayName("2 fields: (T) → void")      @Test void test2_1Arg() { assertToBeInstance(newInstance(AB)   , it -> it.onEach(callback1)); }
            @DisplayName("2 fields: () → void")       @Test void test2_0Arg() { assertToBeInstance(newInstance(AB)   , it -> it.onEach(callback0)); }
            @DisplayName("4 fields: (T, int) → void") @Test void test4_2Arg() { assertToBeInstance(newInstance(ABCD) , it -> it.onEach(callback2)); }
            @DisplayName("4 fields: (T) → void")      @Test void test4_1Arg() { assertToBeInstance(newInstance(ABCD) , it -> it.onEach(callback1)); }
            @DisplayName("4 fields: () → void")       @Test void test4_0Arg() { assertToBeInstance(newInstance(ABCD) , it -> it.onEach(callback0)); }
        }
        @Nested class onEachIndexed {
            @DisplayName("empty: (int, T) → void")    @Test void empty_2Arg() { assertToBeInstance(newInstance(EMPTY), it -> it.onEachIndexed(consumer2AltAsFail)); }
            @DisplayName("empty: (int) → void")       @Test void empty_1Arg() { assertToBeInstance(newInstance(EMPTY), it -> it.onEachIndexed(consumer1AltAsFail)); }
            @DisplayName("empty: () → void")          @Test void empty_0Arg() { assertToBeInstance(newInstance(EMPTY), it -> it.onEachIndexed(consumer0AsFail)); }
            @DisplayName("1 field: (int, T) → void")  @Test void test1_2Arg() { assertToBeInstance(newInstance(A)    , it -> it.onEachIndexed(callback2Alt)); }
            @DisplayName("1 field: (int) → void")     @Test void test1_1Arg() { assertToBeInstance(newInstance(A)    , it -> it.onEachIndexed(callback1Alt)); }
            @DisplayName("1 field: () → void")        @Test void test1_0Arg() { assertToBeInstance(newInstance(A)    , it -> it.onEachIndexed(callback0)); }
            @DisplayName("2 fields: (int, T) → void") @Test void test2_2Arg() { assertToBeInstance(newInstance(AB)   , it -> it.onEachIndexed(callback2Alt)); }
            @DisplayName("2 fields: (int) → void")    @Test void test2_1Arg() { assertToBeInstance(newInstance(AB)   , it -> it.onEachIndexed(callback1Alt)); }
            @DisplayName("2 fields: () → void")       @Test void test2_0Arg() { assertToBeInstance(newInstance(AB)   , it -> it.onEachIndexed(callback0)); }
            @DisplayName("4 fields: (int, T) → void") @Test void test4_2Arg() { assertToBeInstance(newInstance(ABCD) , it -> it.onEachIndexed(callback2Alt)); }
            @DisplayName("4 fields: (int) → void")    @Test void test4_1Arg() { assertToBeInstance(newInstance(ABCD) , it -> it.onEachIndexed(callback1Alt)); }
            @DisplayName("4 fields: () → void")       @Test void test4_0Arg() { assertToBeInstance(newInstance(ABCD) , it -> it.onEachIndexed(callback0)); }
        }

    }

}

import condition.DisableIfMinimalistCondition;
import condition.DisableIfNormalCondition;
import condition.DisableIfNormalViewerCondition;
import condition.DisableIfViewerCondition;
import instance.CollectionHolderForTest;
import joookiwi.collection.java.CollectionHolder;
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
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;
import static value.Arrays.A;
import static value.Arrays.AB;
import static value.Arrays.ABC;
import static value.Arrays.ABCD;
import static value.Arrays.ABD;
import static value.Arrays.AB_NULL;
import static value.Arrays.AC;
import static value.Arrays.ACD;
import static value.Arrays.A_NULL;
import static value.Arrays.A_NULL_B;
import static value.Arrays.B;
import static value.Arrays.BCD;
import static value.Arrays.BD;
import static value.Arrays.C;
import static value.Arrays.D;
import static value.Arrays.EMPTY;
import static value.Arrays.NULL;
import static value.Arrays.NULL_A;
import static value.Arrays.NULL_AB;
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
import static value.Callbacks_Numeric.callbackIs0;
import static value.Callbacks_Numeric.callbackIs0Alt;
import static value.Callbacks_Numeric.callbackIs1;
import static value.Callbacks_Numeric.callbackIs1Alt;
import static value.Callbacks_Numeric.callbackIs2;
import static value.Callbacks_Numeric.callbackIs2Alt;
import static value.Callbacks_Numeric.callbackIs3;
import static value.Callbacks_Numeric.callbackIs3Alt;
import static value.Callbacks_Numeric.callbackIs4;
import static value.Callbacks_Numeric.callbackIs4Alt;
import static value.Callbacks_Numeric.callbackIsEven;
import static value.Callbacks_Numeric.callbackIsEvenAlt;
import static value.Callbacks_Numeric.callbackIsOdd;
import static value.Callbacks_Numeric.callbackIsOddAlt;
import static value.Callbacks_String.callbackIsA;
import static value.Callbacks_String.callbackIsAAlt;
import static value.Callbacks_String.callbackIsB;
import static value.Callbacks_String.callbackIsBAlt;
import static value.Callbacks_String.callbackIsC;
import static value.Callbacks_String.callbackIsCAlt;
import static value.Callbacks_String.callbackIsD;
import static value.Callbacks_String.callbackIsDAlt;
import static value.Callbacks_String.callbackIsE;
import static value.Callbacks_String.callbackIsEAlt;
import static value.ReusableFields.EMPTY_ARRAY;
import static value.ReusableFields_Null.NULL_PREDICATE0;
import static value.ReusableFields_Null.NULL_PREDICATE1;
import static value.ReusableFields_Null.NULL_PREDICATE2;
import static value.ReusableFields_Null.NULL_VARARGS;

@NotNullByDefault
@DisplayNameGeneration(Simple.class)
@DisplayName("CollectionHolder tests (filter)") @TestInstance(PER_CLASS) class CollectionHolder08_FilterTests {

    @TestInstance(PER_CLASS) @Nested class EmptyCollectionHolder extends AbstractEmptyCollectionHolderTests {
        @Nested class filter {
            @DisplayName("∅")                       @Test void testEmpty()     { assertSame(instance, instance.filter()); }
            @DisplayName("null (T, int) → boolean") @Test void test2Arg()      { assertSame(instance, instance.filter(NULL_PREDICATE2)); }
            @DisplayName("null (T) → boolean")      @Test void test1Arg()      { assertSame(instance, instance.filter(NULL_PREDICATE1)); }
            @DisplayName("null () → boolean")       @Test void test0Arg()      { assertSame(instance, instance.filter(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray() { assertSame(instance, instance.filter(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()     { assertSame(instance, instance.filter(EMPTY_ARRAY)); }
        }
        @Nested class filterIndexed {
            @DisplayName("∅")                       @Test void testEmpty()     { assertSame(instance, instance.filterIndexed()); }
            @DisplayName("null (T, int) → boolean") @Test void test2Arg()      { assertSame(instance, instance.filterIndexed(NULL_PREDICATE2)); }
            @DisplayName("null (T) → boolean")      @Test void test1Arg()      { assertSame(instance, instance.filterIndexed(NULL_PREDICATE1)); }
            @DisplayName("null () → boolean")       @Test void test0Arg()      { assertSame(instance, instance.filterIndexed(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray() { assertSame(instance, instance.filterIndexed(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()     { assertSame(instance, instance.filterIndexed(EMPTY_ARRAY)); }
        }
        @Nested class filterNot {
            @DisplayName("∅")                       @Test void testEmpty()     { assertSame(instance, instance.filterNot()); }
            @DisplayName("null (T, int) → boolean") @Test void test2Arg()      { assertSame(instance, instance.filterNot(NULL_PREDICATE2)); }
            @DisplayName("null (T) → boolean")      @Test void test1Arg()      { assertSame(instance, instance.filterNot(NULL_PREDICATE1)); }
            @DisplayName("null () → boolean")       @Test void test0Arg()      { assertSame(instance, instance.filterNot(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray() { assertSame(instance, instance.filterNot(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()     { assertSame(instance, instance.filterNot(EMPTY_ARRAY)); }
        }
        @Nested class filterNotIndexed {
            @DisplayName("∅")                       @Test void testEmpty()     { assertSame(instance, instance.filterNotIndexed()); }
            @DisplayName("null (T, int) → boolean") @Test void test2Arg()      { assertSame(instance, instance.filterNotIndexed(NULL_PREDICATE2)); }
            @DisplayName("null (T) → boolean")      @Test void test1Arg()      { assertSame(instance, instance.filterNotIndexed(NULL_PREDICATE1)); }
            @DisplayName("null () → boolean")       @Test void test0Arg()      { assertSame(instance, instance.filterNotIndexed(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray() { assertSame(instance, instance.filterNotIndexed(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()     { assertSame(instance, instance.filterNotIndexed(EMPTY_ARRAY)); }
        }
        @Nested class filterNotNull {
            @DisplayName("∅")          @Test void testEmpty()     { assertSame(instance, instance.filterNotNull()); }
            @DisplayName("null array") @Test void testNullArray() { assertSame(instance, instance.filterNotNull(NULL_VARARGS)); }
            @DisplayName("[]")         @Test void testArray()     { assertSame(instance, instance.filterNotNull(EMPTY_ARRAY)); }
        }
    }

    @FieldSource("value.Instances#everyExtensionMethodInstancesAsArguments")
    @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class methods extends AbstractMethodsTests {
        //#region -------------------- Required test configuration --------------------

        public methods(final CollectionHolderForTest<?, ?> instance) { super(instance); }

        //#endregion -------------------- Required test configuration --------------------

        @Nested class filter {
            @DisplayName("(T, int) → boolean") @Test void test2Arg() { assertSame(emptyCollectionHolder(), stringInstance.filter(predicate2AsFail)); }
            @DisplayName("(T) → boolean")      @Test void test1Arg() { assertSame(emptyCollectionHolder(), stringInstance.filter(predicate1AsFail)); }
            @DisplayName("() → boolean")       @Test void test0Arg() { assertSame(emptyCollectionHolder(),       instance.filter(predicate0AsFail)); }
        }
        @Nested class filterIndexed {
            @DisplayName("(T, int) → boolean") @Test void test2Arg() { assertSame(emptyCollectionHolder(), stringInstance.filterIndexed(predicate2AltAsFail)); }
            @DisplayName("(T) → boolean")      @Test void test1Arg() { assertSame(emptyCollectionHolder(),       instance.filterIndexed(predicate1AltAsFail)); }
            @DisplayName("() → boolean")       @Test void test0Arg() { assertSame(emptyCollectionHolder(),       instance.filterIndexed(predicate0AsFail)); }
        }
        @Nested class filterNot {
            @DisplayName("(T, int) → boolean") @Test void test2Arg() { assertSame(emptyCollectionHolder(), stringInstance.filterNot(predicate2AsFail)); }
            @DisplayName("(T) → boolean")      @Test void test1Arg() { assertSame(emptyCollectionHolder(), stringInstance.filterNot(predicate1AsFail)); }
            @DisplayName("() → boolean")       @Test void test0Arg() { assertSame(emptyCollectionHolder(),       instance.filterNot(predicate0AsFail)); }
        }
        @Nested class filterNotIndexed {
            @DisplayName("(T, int) → boolean") @Test void test2Arg() { assertSame(emptyCollectionHolder(), stringInstance.filterNotIndexed(predicate2AltAsFail)); }
            @DisplayName("(T) → boolean")      @Test void test1Arg() { assertSame(emptyCollectionHolder(),       instance.filterNotIndexed(predicate1AltAsFail)); }
            @DisplayName("() → boolean")       @Test void test0Arg() { assertSame(emptyCollectionHolder(),       instance.filterNotIndexed(predicate0AsFail)); }
        }
        @Test void filterNotNull() { assertSame(emptyCollectionHolder(), instance.filterNotNull()); }

    }

    @FieldSource("value.Instances#everyInstancesAsArguments")
    @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class instances extends AbstractInstancesTests {
        //#region -------------------- Required test configuration --------------------

        public instances(final Class<CollectionHolderForTest<?, ?>> instanceClass) { super(instanceClass); }

        //#endregion -------------------- Required test configuration --------------------

        @ExtendWith({DisableIfNormalCondition.class, DisableIfNormalViewerCondition.class,})
        @DisplayName("get() being called") @TestInstance(PER_CLASS) @Nested class GetBeingCalled {
            public final instances rootInstance = instances.this;

            @Nested class filter {
                @DisplayName("empty, (T, int) → boolean")  @Test void empty_2Arg()   { assertEquals(0, newInstance(EMPTY).execute(it -> it.filter(predicate2AsFail)).getAmountOfCall()); }
                @DisplayName("empty, (T) → boolean")       @Test void empty_1Arg()   { assertEquals(0, newInstance(EMPTY).execute(it -> it.filter(predicate1AsFail)).getAmountOfCall()); }
                @DisplayName("empty, () → boolean")        @Test void empty_0Arg()   { assertEquals(0, newInstance(EMPTY).execute(it -> it.filter(predicate0AsFail)).getAmountOfCall()); }
                @DisplayName("1 field, (T, int) → true")   @Test void test1_2True()  { assertEquals(1, newInstance(A)    .execute(it -> it.filter(callback2AsTrue)).getAmountOfCall()); }
                @DisplayName("1 field, (T) → true")        @Test void test1_1True()  { assertEquals(1, newInstance(A)    .execute(it -> it.filter(callback1AsTrue)).getAmountOfCall()); }
                @DisplayName("1 field, () → true")         @Test void test1_0True()  { assertEquals(1, newInstance(A)    .execute(it -> it.filter(callback0AsTrue)).getAmountOfCall()); }
                @DisplayName("1 field, (T, int) → false")  @Test void test1_2False() { assertEquals(1, newInstance(A)    .execute(it -> it.filter(callback2AsFalse)).getAmountOfCall()); }
                @DisplayName("1 field, (T) → false")       @Test void test1_1False() { assertEquals(1, newInstance(A)    .execute(it -> it.filter(callback1AsFalse)).getAmountOfCall()); }
                @DisplayName("1 field, () → false")        @Test void test1_0False() { assertEquals(0, newInstance(A)    .execute(it -> it.filter(callback0AsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields, (T, int) → true")  @Test void test2_2True()  { assertEquals(2, newInstance(AB)   .execute(it -> it.filter(callback2AsTrue)).getAmountOfCall()); }
                @DisplayName("2 fields, (T) → true")       @Test void test2_1True()  { assertEquals(2, newInstance(AB)   .execute(it -> it.filter(callback1AsTrue)).getAmountOfCall()); }
                @DisplayName("2 fields, () → true")        @Test void test2_0True()  { assertEquals(2, newInstance(AB)   .execute(it -> it.filter(callback0AsTrue)).getAmountOfCall()); }
                @DisplayName("2 fields, (T, int) → false") @Test void test2_2False() { assertEquals(2, newInstance(AB)   .execute(it -> it.filter(callback2AsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields, (T) → false")      @Test void test2_1False() { assertEquals(2, newInstance(AB)   .execute(it -> it.filter(callback1AsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields, () → false")       @Test void test2_0False() { assertEquals(0, newInstance(AB)   .execute(it -> it.filter(callback0AsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields, (T, int) → true")  @Test void test4_2True()  { assertEquals(4, newInstance(ABCD) .execute(it -> it.filter(callback2AsTrue)).getAmountOfCall()); }
                @DisplayName("4 fields, (T) → true")       @Test void test4_1True()  { assertEquals(4, newInstance(ABCD) .execute(it -> it.filter(callback1AsTrue)).getAmountOfCall()); }
                @DisplayName("4 fields, () → true")        @Test void test4_0True()  { assertEquals(4, newInstance(ABCD) .execute(it -> it.filter(callback0AsTrue)).getAmountOfCall()); }
                @DisplayName("4 fields, (T, int) → false") @Test void test4_2False() { assertEquals(4, newInstance(ABCD) .execute(it -> it.filter(callback2AsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields, (T) → false")      @Test void test4_1False() { assertEquals(4, newInstance(ABCD) .execute(it -> it.filter(callback1AsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields, () → false")       @Test void test4_0False() { assertEquals(0, newInstance(ABCD) .execute(it -> it.filter(callback0AsFalse)).getAmountOfCall()); }
            }
            @Nested class filterIndexed {
                @DisplayName("empty, (int, T) → boolean")  @Test void empty_2Arg()   { assertEquals(0, newInstance(EMPTY).execute(it -> it.filterIndexed(predicate2AltAsFail)).getAmountOfCall()); }
                @DisplayName("empty, (int) → boolean")     @Test void empty_1Arg()   { assertEquals(0, newInstance(EMPTY).execute(it -> it.filterIndexed(predicate1AltAsFail)).getAmountOfCall()); }
                @DisplayName("empty, () → boolean")        @Test void empty_0Arg()   { assertEquals(0, newInstance(EMPTY).execute(it -> it.filterIndexed(predicate0AsFail)).getAmountOfCall()); }
                @DisplayName("1 field, (int, T) → true")   @Test void test1_2True()  { assertEquals(1, newInstance(A)    .execute(it -> it.filterIndexed(callback2AltAsTrue)).getAmountOfCall()); }
                @DisplayName("1 field, (int) → true")      @Test void test1_1True()  { assertEquals(1, newInstance(A)    .execute(it -> it.filterIndexed(callback1AltAsTrue)).getAmountOfCall()); }
                @DisplayName("1 field, () → true")         @Test void test1_0True()  { assertEquals(1, newInstance(A)    .execute(it -> it.filterIndexed(callback0AsTrue)).getAmountOfCall()); }
                @DisplayName("1 field, (int, T) → false")  @Test void test1_2False() { assertEquals(1, newInstance(A)    .execute(it -> it.filterIndexed(callback2AltAsFalse)).getAmountOfCall()); }
                @DisplayName("1 field, (int) → false")     @Test void test1_1False() { assertEquals(0, newInstance(A)    .execute(it -> it.filterIndexed(callback1AltAsFalse)).getAmountOfCall()); }
                @DisplayName("1 field, () → false")        @Test void test1_0False() { assertEquals(0, newInstance(A)    .execute(it -> it.filterIndexed(callback0AsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields, (int, T) → true")  @Test void test2_2True()  { assertEquals(2, newInstance(AB)   .execute(it -> it.filterIndexed(callback2AltAsTrue)).getAmountOfCall()); }
                @DisplayName("2 fields, (int) → true")     @Test void test2_1True()  { assertEquals(2, newInstance(AB)   .execute(it -> it.filterIndexed(callback1AltAsTrue)).getAmountOfCall()); }
                @DisplayName("2 fields, () → true")        @Test void test2_0True()  { assertEquals(2, newInstance(AB)   .execute(it -> it.filterIndexed(callback0AsTrue)).getAmountOfCall()); }
                @DisplayName("2 fields, (int, T) → false") @Test void test2_2False() { assertEquals(2, newInstance(AB)   .execute(it -> it.filterIndexed(callback2AltAsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields, (int) → false")    @Test void test2_1False() { assertEquals(0, newInstance(AB)   .execute(it -> it.filterIndexed(callback1AltAsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields, () → false")       @Test void test2_0False() { assertEquals(0, newInstance(AB)   .execute(it -> it.filterIndexed(callback0AsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields, (int, T) → true")  @Test void test4_2True()  { assertEquals(4, newInstance(ABCD) .execute(it -> it.filterIndexed(callback2AltAsTrue)).getAmountOfCall()); }
                @DisplayName("4 fields, (int) → true")     @Test void test4_1True()  { assertEquals(4, newInstance(ABCD) .execute(it -> it.filterIndexed(callback1AltAsTrue)).getAmountOfCall()); }
                @DisplayName("4 fields, () → true")        @Test void test4_0True()  { assertEquals(4, newInstance(ABCD) .execute(it -> it.filterIndexed(callback0AsTrue)).getAmountOfCall()); }
                @DisplayName("4 fields, (int, T) → false") @Test void test4_2False() { assertEquals(4, newInstance(ABCD) .execute(it -> it.filterIndexed(callback2AltAsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields, (int) → false")    @Test void test4_1False() { assertEquals(0, newInstance(ABCD) .execute(it -> it.filterIndexed(callback1AltAsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields, () → false")       @Test void test4_0False() { assertEquals(0, newInstance(ABCD) .execute(it -> it.filterIndexed(callback0AsFalse)).getAmountOfCall()); }
            }

            @Nested class filterNot {
                @DisplayName("empty, (T, int) → boolean")  @Test void empty_2Arg()   { assertEquals(0, newInstance(EMPTY).execute(it -> it.filterNot(predicate2AsFail)).getAmountOfCall()); }
                @DisplayName("empty, (T) → boolean")       @Test void empty_1Arg()   { assertEquals(0, newInstance(EMPTY).execute(it -> it.filterNot(predicate1AsFail)).getAmountOfCall()); }
                @DisplayName("empty, () → boolean")        @Test void empty_0Arg()   { assertEquals(0, newInstance(EMPTY).execute(it -> it.filterNot(predicate0AsFail)).getAmountOfCall()); }
                @DisplayName("1 field, (T, int) → true")   @Test void test1_2True()  { assertEquals(1, newInstance(A)    .execute(it -> it.filterNot(callback2AsTrue)).getAmountOfCall()); }
                @DisplayName("1 field, (T) → true")        @Test void test1_1True()  { assertEquals(1, newInstance(A)    .execute(it -> it.filterNot(callback1AsTrue)).getAmountOfCall()); }
                @DisplayName("1 field, () → true")         @Test void test1_0True()  { assertEquals(0, newInstance(A)    .execute(it -> it.filterNot(callback0AsTrue)).getAmountOfCall()); }
                @DisplayName("1 field, (T, int) → false")  @Test void test1_2False() { assertEquals(1, newInstance(A)    .execute(it -> it.filterNot(callback2AsFalse)).getAmountOfCall()); }
                @DisplayName("1 field, (T) → false")       @Test void test1_1False() { assertEquals(1, newInstance(A)    .execute(it -> it.filterNot(callback1AsFalse)).getAmountOfCall()); }
                @DisplayName("1 field, () → false")        @Test void test1_0False() { assertEquals(1, newInstance(A)    .execute(it -> it.filterNot(callback0AsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields, (T, int) → true")  @Test void test2_2True()  { assertEquals(2, newInstance(AB)   .execute(it -> it.filterNot(callback2AsTrue)).getAmountOfCall()); }
                @DisplayName("2 fields, (T) → true")       @Test void test2_1True()  { assertEquals(2, newInstance(AB)   .execute(it -> it.filterNot(callback1AsTrue)).getAmountOfCall()); }
                @DisplayName("2 fields, () → true")        @Test void test2_0True()  { assertEquals(0, newInstance(AB)   .execute(it -> it.filterNot(callback0AsTrue)).getAmountOfCall()); }
                @DisplayName("2 fields, (T, int) → false") @Test void test2_2False() { assertEquals(2, newInstance(AB)   .execute(it -> it.filterNot(callback2AsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields, (T) → false")      @Test void test2_1False() { assertEquals(2, newInstance(AB)   .execute(it -> it.filterNot(callback1AsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields, () → false")       @Test void test2_0False() { assertEquals(2, newInstance(AB)   .execute(it -> it.filterNot(callback0AsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields, (T, int) → true")  @Test void test4_2True()  { assertEquals(4, newInstance(ABCD) .execute(it -> it.filterNot(callback2AsTrue)).getAmountOfCall()); }
                @DisplayName("4 fields, (T) → true")       @Test void test4_1True()  { assertEquals(4, newInstance(ABCD) .execute(it -> it.filterNot(callback1AsTrue)).getAmountOfCall()); }
                @DisplayName("4 fields, () → true")        @Test void test4_0True()  { assertEquals(0, newInstance(ABCD) .execute(it -> it.filterNot(callback0AsTrue)).getAmountOfCall()); }
                @DisplayName("4 fields, (T, int) → false") @Test void test4_2False() { assertEquals(4, newInstance(ABCD) .execute(it -> it.filterNot(callback2AsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields, (T) → false")      @Test void test4_1False() { assertEquals(4, newInstance(ABCD) .execute(it -> it.filterNot(callback1AsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields, () → false")       @Test void test4_0False() { assertEquals(4, newInstance(ABCD) .execute(it -> it.filterNot(callback0AsFalse)).getAmountOfCall()); }
            }
            @Nested class filterNotIndexed {
                @DisplayName("empty, (int, T) → boolean")  @Test void empty_2Arg()   { assertEquals(0, newInstance(EMPTY).execute(it -> it.filterNotIndexed(predicate2AltAsFail)).getAmountOfCall()); }
                @DisplayName("empty, (int) → boolean")     @Test void empty_1Arg()   { assertEquals(0, newInstance(EMPTY).execute(it -> it.filterNotIndexed(predicate1AltAsFail)).getAmountOfCall()); }
                @DisplayName("empty, () → boolean")        @Test void empty_0Arg()   { assertEquals(0, newInstance(EMPTY).execute(it -> it.filterNotIndexed(predicate0AsFail)).getAmountOfCall()); }
                @DisplayName("1 field, (int, T) → true")   @Test void test1_2True()  { assertEquals(1, newInstance(A)    .execute(it -> it.filterNotIndexed(callback2AltAsTrue)).getAmountOfCall()); }
                @DisplayName("1 field, (int) → true")      @Test void test1_1True()  { assertEquals(0, newInstance(A)    .execute(it -> it.filterNotIndexed(callback1AltAsTrue)).getAmountOfCall()); }
                @DisplayName("1 field, () → true")         @Test void test1_0True()  { assertEquals(0, newInstance(A)    .execute(it -> it.filterNotIndexed(callback0AsTrue)).getAmountOfCall()); }
                @DisplayName("1 field, (int, T) → false")  @Test void test1_2False() { assertEquals(1, newInstance(A)    .execute(it -> it.filterNotIndexed(callback2AltAsFalse)).getAmountOfCall()); }
                @DisplayName("1 field, (int) → false")     @Test void test1_1False() { assertEquals(1, newInstance(A)    .execute(it -> it.filterNotIndexed(callback1AltAsFalse)).getAmountOfCall()); }
                @DisplayName("1 field, () → false")        @Test void test1_0False() { assertEquals(1, newInstance(A)    .execute(it -> it.filterNotIndexed(callback0AsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields, (int, T) → true")  @Test void test2_2True()  { assertEquals(2, newInstance(AB)   .execute(it -> it.filterNotIndexed(callback2AltAsTrue)).getAmountOfCall()); }
                @DisplayName("2 fields, (int) → true")     @Test void test2_1True()  { assertEquals(0, newInstance(AB)   .execute(it -> it.filterNotIndexed(callback1AltAsTrue)).getAmountOfCall()); }
                @DisplayName("2 fields, () → true")        @Test void test2_0True()  { assertEquals(0, newInstance(AB)   .execute(it -> it.filterNotIndexed(callback0AsTrue)).getAmountOfCall()); }
                @DisplayName("2 fields, (int, T) → false") @Test void test2_2False() { assertEquals(2, newInstance(AB)   .execute(it -> it.filterNotIndexed(callback2AltAsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields, (int) → false")    @Test void test2_1False() { assertEquals(2, newInstance(AB)   .execute(it -> it.filterNotIndexed(callback1AltAsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields, () → false")       @Test void test2_0False() { assertEquals(2, newInstance(AB)   .execute(it -> it.filterNotIndexed(callback0AsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields, (int, T) → true")  @Test void test4_2True()  { assertEquals(4, newInstance(ABCD) .execute(it -> it.filterNotIndexed(callback2AltAsTrue)).getAmountOfCall()); }
                @DisplayName("4 fields, (int) → true")     @Test void test4_1True()  { assertEquals(0, newInstance(ABCD) .execute(it -> it.filterNotIndexed(callback1AltAsTrue)).getAmountOfCall()); }
                @DisplayName("4 fields, () → true")        @Test void test4_0True()  { assertEquals(0, newInstance(ABCD) .execute(it -> it.filterNotIndexed(callback0AsTrue)).getAmountOfCall()); }
                @DisplayName("4 fields, (int, T) → false") @Test void test4_2False() { assertEquals(4, newInstance(ABCD) .execute(it -> it.filterNotIndexed(callback2AltAsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields, (int) → false")    @Test void test4_1False() { assertEquals(4, newInstance(ABCD) .execute(it -> it.filterNotIndexed(callback1AltAsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields, () → false")       @Test void test4_0False() { assertEquals(4, newInstance(ABCD) .execute(it -> it.filterNotIndexed(callback0AsFalse)).getAmountOfCall()); }
            }

            @Nested class filterNotNull {
                                         @Test void empty() { assertEquals(0,                      newInstance(EMPTY).execute(CollectionHolder::filterNotNull).getAmountOfCall()); }
                @DisplayName("1 field")  @Test void test1() { assertEquals(isMinimalist() ? 2 : 1, newInstance(A)    .execute(CollectionHolder::filterNotNull).getAmountOfCall()); }
                @DisplayName("2 fields") @Test void test2() { assertEquals(isMinimalist() ? 4 : 2, newInstance(AB)   .execute(CollectionHolder::filterNotNull).getAmountOfCall()); }
                @DisplayName("4 fields") @Test void test4() { assertEquals(isMinimalist() ? 8 : 4, newInstance(ABCD) .execute(CollectionHolder::filterNotNull).getAmountOfCall()); }
            }

        }

        @TestInstance(PER_CLASS) @Nested class filter {
            @Nested class empty {
                @DisplayName("(T, int) → boolean")  @Test void test2Arg() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).filter(predicate2AsFail)); }
                @DisplayName("(T) → boolean")       @Test void test1Arg() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).filter(predicate1AsFail)); }
                @DisplayName("() → boolean")        @Test void test0Arg() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).filter(predicate0AsFail)); }
            }
            @DisplayName("boolean callbacks") @TestInstance(PER_CLASS) @Nested class BooleanCallbacks {
                @DisplayName("1 field: (T, int) → true")   @Test void test1_2True()  { assertArrayEquals(A,    newInstance(A)   .filter(callback2AsTrue).toArray()); }
                @DisplayName("1 field: (T) → true")        @Test void test1_1True()  { assertArrayEquals(A,    newInstance(A)   .filter(callback1AsTrue).toArray()); }
                @DisplayName("1 field: () → true")         @Test void test1_0True()  { assertArrayEquals(A,    newInstance(A)   .filter(callback0AsTrue).toArray()); }
                @DisplayName("1 field: (T, int) → false")  @Test void test1_2False() { assertTrue(             newInstance(A)   .filter(callback2AsFalse).isEmpty()); }
                @DisplayName("1 field: (T) → false")       @Test void test1_1False() { assertTrue(             newInstance(A)   .filter(callback1AsFalse).isEmpty()); }
                @DisplayName("1 field: () → false")        @Test void test1_0False() { assertTrue(             newInstance(A)   .filter(callback0AsFalse).isEmpty()); }
                @DisplayName("2 fields: (T, int) → true")  @Test void test2_2True()  { assertArrayEquals(AB,   newInstance(AB)  .filter(callback2AsTrue).toArray()); }
                @DisplayName("2 fields: (T) → true")       @Test void test2_1True()  { assertArrayEquals(AB,   newInstance(AB)  .filter(callback1AsTrue).toArray()); }
                @DisplayName("2 fields: () → true")        @Test void test2_0True()  { assertArrayEquals(AB,   newInstance(AB)  .filter(callback0AsTrue).toArray()); }
                @DisplayName("2 fields: (T, int) → false") @Test void test2_2False() { assertTrue(             newInstance(AB)  .filter(callback2AsFalse).isEmpty()); }
                @DisplayName("2 fields: (T) → false")      @Test void test2_1False() { assertTrue(             newInstance(AB)  .filter(callback1AsFalse).isEmpty()); }
                @DisplayName("2 fields: () → false")       @Test void test2_0False() { assertTrue(             newInstance(AB)  .filter(callback0AsFalse).isEmpty()); }
                @DisplayName("4 fields: (T, int) → true")  @Test void test4_2True()  { assertArrayEquals(ABCD, newInstance(ABCD).filter(callback2AsTrue).toArray()); }
                @DisplayName("4 fields: (T) → true")       @Test void test4_1True()  { assertArrayEquals(ABCD, newInstance(ABCD).filter(callback1AsTrue).toArray()); }
                @DisplayName("4 fields: () → true")        @Test void test4_0True()  { assertArrayEquals(ABCD, newInstance(ABCD).filter(callback0AsTrue).toArray()); }
                @DisplayName("4 fields: (T, int) → false") @Test void test4_2False() { assertTrue(             newInstance(ABCD).filter(callback2AsFalse).isEmpty()); }
                @DisplayName("4 fields: (T) → false")      @Test void test4_1False() { assertTrue(             newInstance(ABCD).filter(callback1AsFalse).isEmpty()); }
                @DisplayName("4 fields: () → false")       @Test void test4_0False() { assertTrue(             newInstance(ABCD).filter(callback0AsFalse).isEmpty()); }
            }
            @DisplayName("1 field") @Nested class Test1 {
                                  @Test void a()     { assertArrayEquals(A, newInstance(A).filter(callbackIsA).toArray()); }
                                  @Test void e()     { assertTrue(          newInstance(A).filter(callbackIsE).isEmpty()); }
                                  @Test void even()  { assertArrayEquals(A, newInstance(A).filter(callbackIsEvenAlt).toArray()); }
                                  @Test void odd()   { assertTrue(          newInstance(A).filter(callbackIsOddAlt).isEmpty()); }
                @DisplayName("0") @Test void test0() { assertArrayEquals(A, newInstance(A).filter(callbackIs0Alt).toArray()); }
                @DisplayName("4") @Test void test4() { assertTrue(          newInstance(A).filter(callbackIs4Alt).isEmpty()); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                                  @Test void a()     { assertArrayEquals(A, newInstance(AB).filter(callbackIsA).toArray()); }
                                  @Test void b()     { assertArrayEquals(B, newInstance(AB).filter(callbackIsB).toArray()); }
                                  @Test void e()     { assertTrue(          newInstance(AB).filter(callbackIsE).isEmpty()); }
                                  @Test void even()  { assertArrayEquals(A, newInstance(AB).filter(callbackIsEvenAlt).toArray()); }
                                  @Test void odd()   { assertArrayEquals(B, newInstance(AB).filter(callbackIsOddAlt).toArray()); }
                @DisplayName("0") @Test void test0() { assertArrayEquals(A, newInstance(AB).filter(callbackIs0Alt).toArray()); }
                @DisplayName("1") @Test void test1() { assertArrayEquals(B, newInstance(AB).filter(callbackIs1Alt).toArray()); }
                @DisplayName("4") @Test void test4() { assertTrue(          newInstance(AB).filter(callbackIs4Alt).isEmpty()); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                                  @Test void a()     { assertArrayEquals(A,  newInstance(ABCD).filter(callbackIsA).toArray()); }
                                  @Test void b()     { assertArrayEquals(B,  newInstance(ABCD).filter(callbackIsB).toArray()); }
                                  @Test void c()     { assertArrayEquals(C,  newInstance(ABCD).filter(callbackIsC).toArray()); }
                                  @Test void d()     { assertArrayEquals(D,  newInstance(ABCD).filter(callbackIsD).toArray()); }
                                  @Test void e()     { assertTrue(           newInstance(ABCD).filter(callbackIsE).isEmpty()); }
                                  @Test void even()  { assertArrayEquals(AC, newInstance(ABCD).filter(callbackIsEvenAlt).toArray()); }
                                  @Test void odd()   { assertArrayEquals(BD, newInstance(ABCD).filter(callbackIsOddAlt).toArray()); }
                @DisplayName("0") @Test void test0() { assertArrayEquals(A,  newInstance(ABCD).filter(callbackIs0Alt).toArray()); }
                @DisplayName("1") @Test void test1() { assertArrayEquals(B,  newInstance(ABCD).filter(callbackIs1Alt).toArray()); }
                @DisplayName("2") @Test void test2() { assertArrayEquals(C,  newInstance(ABCD).filter(callbackIs2Alt).toArray()); }
                @DisplayName("3") @Test void test3() { assertArrayEquals(D,  newInstance(ABCD).filter(callbackIs3Alt).toArray()); }
                @DisplayName("4") @Test void test4() { assertTrue(           newInstance(ABCD).filter(callbackIs4Alt).isEmpty()); }
            }
        }
        @TestInstance(PER_CLASS) @Nested class filterIndexed {
            @Nested class empty {
                @DisplayName("(T, int) → boolean")  @Test void test2Arg() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).filterIndexed(predicate2AltAsFail)); }
                @DisplayName("(T) → boolean")       @Test void test1Arg() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).filterIndexed(predicate1AltAsFail)); }
                @DisplayName("() → boolean")        @Test void test0Arg() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).filterIndexed(predicate0AsFail)); }
            }
            @DisplayName("boolean callbacks") @TestInstance(PER_CLASS) @Nested class BooleanCallbacks {
                @DisplayName("1 field: (T, int) → true")   @Test void test1_2True()  { assertArrayEquals(A,    newInstance(A)   .filterIndexed(callback2AltAsTrue).toArray()); }
                @DisplayName("1 field: (T) → true")        @Test void test1_1True()  { assertArrayEquals(A,    newInstance(A)   .filterIndexed(callback1AltAsTrue).toArray()); }
                @DisplayName("1 field: () → true")         @Test void test1_0True()  { assertArrayEquals(A,    newInstance(A)   .filterIndexed(callback0AsTrue).toArray()); }
                @DisplayName("1 field: (T, int) → false")  @Test void test1_2False() { assertTrue(             newInstance(A)   .filterIndexed(callback2AltAsFalse).isEmpty()); }
                @DisplayName("1 field: (T) → false")       @Test void test1_1False() { assertTrue(             newInstance(A)   .filterIndexed(callback1AltAsFalse).isEmpty()); }
                @DisplayName("1 field: () → false")        @Test void test1_0False() { assertTrue(             newInstance(A)   .filterIndexed(callback0AsFalse).isEmpty()); }
                @DisplayName("2 fields: (T, int) → true")  @Test void test2_2True()  { assertArrayEquals(AB,   newInstance(AB)  .filterIndexed(callback2AltAsTrue).toArray()); }
                @DisplayName("2 fields: (T) → true")       @Test void test2_1True()  { assertArrayEquals(AB,   newInstance(AB)  .filterIndexed(callback1AltAsTrue).toArray()); }
                @DisplayName("2 fields: () → true")        @Test void test2_0True()  { assertArrayEquals(AB,   newInstance(AB)  .filterIndexed(callback0AsTrue).toArray()); }
                @DisplayName("2 fields: (T, int) → false") @Test void test2_2False() { assertTrue(             newInstance(AB)  .filterIndexed(callback2AltAsFalse).isEmpty()); }
                @DisplayName("2 fields: (T) → false")      @Test void test2_1False() { assertTrue(             newInstance(AB)  .filterIndexed(callback1AltAsFalse).isEmpty()); }
                @DisplayName("2 fields: () → false")       @Test void test2_0False() { assertTrue(             newInstance(AB)  .filterIndexed(callback0AsFalse).isEmpty()); }
                @DisplayName("4 fields: (T, int) → true")  @Test void test4_2True()  { assertArrayEquals(ABCD, newInstance(ABCD).filterIndexed(callback2AltAsTrue).toArray()); }
                @DisplayName("4 fields: (T) → true")       @Test void test4_1True()  { assertArrayEquals(ABCD, newInstance(ABCD).filterIndexed(callback1AltAsTrue).toArray()); }
                @DisplayName("4 fields: () → true")        @Test void test4_0True()  { assertArrayEquals(ABCD, newInstance(ABCD).filterIndexed(callback0AsTrue).toArray()); }
                @DisplayName("4 fields: (T, int) → false") @Test void test4_2False() { assertTrue(             newInstance(ABCD).filterIndexed(callback2AltAsFalse).isEmpty()); }
                @DisplayName("4 fields: (T) → false")      @Test void test4_1False() { assertTrue(             newInstance(ABCD).filterIndexed(callback1AltAsFalse).isEmpty()); }
                @DisplayName("4 fields: () → false")       @Test void test4_0False() { assertTrue(             newInstance(ABCD).filterIndexed(callback0AsFalse).isEmpty()); }
            }
            @DisplayName("1 field") @Nested class Test1 {
                                  @Test void a()     { assertArrayEquals(A, newInstance(A).filterIndexed(callbackIsAAlt).toArray()); }
                                  @Test void e()     { assertTrue(          newInstance(A).filterIndexed(callbackIsEAlt).isEmpty()); }
                                  @Test void even()  { assertArrayEquals(A, newInstance(A).filterIndexed(callbackIsEven).toArray()); }
                                  @Test void odd()   { assertTrue(          newInstance(A).filterIndexed(callbackIsOdd).isEmpty()); }
                @DisplayName("0") @Test void test0() { assertArrayEquals(A, newInstance(A).filterIndexed(callbackIs0).toArray()); }
                @DisplayName("4") @Test void test4() { assertTrue(          newInstance(A).filterIndexed(callbackIs4).isEmpty()); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                                  @Test void a()     { assertArrayEquals(A, newInstance(AB).filterIndexed(callbackIsAAlt).toArray()); }
                                  @Test void b()     { assertArrayEquals(B, newInstance(AB).filterIndexed(callbackIsBAlt).toArray()); }
                                  @Test void e()     { assertTrue(          newInstance(AB).filterIndexed(callbackIsEAlt).isEmpty()); }
                                  @Test void even()  { assertArrayEquals(A, newInstance(AB).filterIndexed(callbackIsEven).toArray()); }
                                  @Test void odd()   { assertArrayEquals(B, newInstance(AB).filterIndexed(callbackIsOdd).toArray()); }
                @DisplayName("0") @Test void test0() { assertArrayEquals(A, newInstance(AB).filterIndexed(callbackIs0).toArray()); }
                @DisplayName("1") @Test void test1() { assertArrayEquals(B, newInstance(AB).filterIndexed(callbackIs1).toArray()); }
                @DisplayName("4") @Test void test4() { assertTrue(          newInstance(AB).filterIndexed(callbackIs4).isEmpty()); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                                  @Test void a()     { assertArrayEquals(A,  newInstance(ABCD).filterIndexed(callbackIsAAlt).toArray()); }
                                  @Test void b()     { assertArrayEquals(B,  newInstance(ABCD).filterIndexed(callbackIsBAlt).toArray()); }
                                  @Test void c()     { assertArrayEquals(C,  newInstance(ABCD).filterIndexed(callbackIsCAlt).toArray()); }
                                  @Test void d()     { assertArrayEquals(D,  newInstance(ABCD).filterIndexed(callbackIsDAlt).toArray()); }
                                  @Test void e()     { assertTrue(           newInstance(ABCD).filterIndexed(callbackIsEAlt).isEmpty()); }
                                  @Test void even()  { assertArrayEquals(AC, newInstance(ABCD).filterIndexed(callbackIsEven).toArray()); }
                                  @Test void odd()   { assertArrayEquals(BD, newInstance(ABCD).filterIndexed(callbackIsOdd).toArray()); }
                @DisplayName("0") @Test void test0() { assertArrayEquals(A,  newInstance(ABCD).filterIndexed(callbackIs0).toArray()); }
                @DisplayName("1") @Test void test1() { assertArrayEquals(B,  newInstance(ABCD).filterIndexed(callbackIs1).toArray()); }
                @DisplayName("2") @Test void test2() { assertArrayEquals(C,  newInstance(ABCD).filterIndexed(callbackIs2).toArray()); }
                @DisplayName("3") @Test void test3() { assertArrayEquals(D,  newInstance(ABCD).filterIndexed(callbackIs3).toArray()); }
                @DisplayName("4") @Test void test4() { assertTrue(           newInstance(ABCD).filterIndexed(callbackIs4).isEmpty()); }
            }
        }

        @TestInstance(PER_CLASS) @Nested class filterNot {
            @Nested class empty {
                @DisplayName("(T, int) → boolean")  @Test void test2Arg() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).filterNot(predicate2AsFail)); }
                @DisplayName("(T) → boolean")       @Test void test1Arg() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).filterNot(predicate1AsFail)); }
                @DisplayName("() → boolean")        @Test void test0Arg() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).filterNot(predicate0AsFail)); }
            }
            @DisplayName("boolean callbacks") @TestInstance(PER_CLASS) @Nested class BooleanCallbacks {
                @DisplayName("1 field: (T, int) → true")   @Test void test1_2True()  { assertTrue(             newInstance(A)   .filterNot(callback2AsTrue).isEmpty()); }
                @DisplayName("1 field: (T) → true")        @Test void test1_1True()  { assertTrue(             newInstance(A)   .filterNot(callback1AsTrue).isEmpty()); }
                @DisplayName("1 field: () → true")         @Test void test1_0True()  { assertTrue(             newInstance(A)   .filterNot(callback0AsTrue).isEmpty()); }
                @DisplayName("1 field: (T, int) → false")  @Test void test1_2False() { assertArrayEquals(A,    newInstance(A)   .filterNot(callback2AsFalse).toArray()); }
                @DisplayName("1 field: (T) → false")       @Test void test1_1False() { assertArrayEquals(A,    newInstance(A)   .filterNot(callback1AsFalse).toArray()); }
                @DisplayName("1 field: () → false")        @Test void test1_0False() { assertArrayEquals(A,    newInstance(A)   .filterNot(callback0AsFalse).toArray()); }
                @DisplayName("2 fields: (T, int) → true")  @Test void test2_2True()  { assertTrue(             newInstance(AB)  .filterNot(callback2AsTrue).isEmpty()); }
                @DisplayName("2 fields: (T) → true")       @Test void test2_1True()  { assertTrue(             newInstance(AB)  .filterNot(callback1AsTrue).isEmpty()); }
                @DisplayName("2 fields: () → true")        @Test void test2_0True()  { assertTrue(             newInstance(AB)  .filterNot(callback0AsTrue).isEmpty()); }
                @DisplayName("2 fields: (T, int) → false") @Test void test2_2False() { assertArrayEquals(AB,   newInstance(AB)  .filterNot(callback2AsFalse).toArray()); }
                @DisplayName("2 fields: (T) → false")      @Test void test2_1False() { assertArrayEquals(AB,   newInstance(AB)  .filterNot(callback1AsFalse).toArray()); }
                @DisplayName("2 fields: () → false")       @Test void test2_0False() { assertArrayEquals(AB,   newInstance(AB)  .filterNot(callback0AsFalse).toArray()); }
                @DisplayName("4 fields: (T, int) → true")  @Test void test4_2True()  { assertTrue(             newInstance(ABCD).filterNot(callback2AsTrue).isEmpty()); }
                @DisplayName("4 fields: (T) → true")       @Test void test4_1True()  { assertTrue(             newInstance(ABCD).filterNot(callback1AsTrue).isEmpty()); }
                @DisplayName("4 fields: () → true")        @Test void test4_0True()  { assertTrue(             newInstance(ABCD).filterNot(callback0AsTrue).isEmpty()); }
                @DisplayName("4 fields: (T, int) → false") @Test void test4_2False() { assertArrayEquals(ABCD, newInstance(ABCD).filterNot(callback2AsFalse).toArray()); }
                @DisplayName("4 fields: (T) → false")      @Test void test4_1False() { assertArrayEquals(ABCD, newInstance(ABCD).filterNot(callback1AsFalse).toArray()); }
                @DisplayName("4 fields: () → false")       @Test void test4_0False() { assertArrayEquals(ABCD, newInstance(ABCD).filterNot(callback0AsFalse).toArray()); }
            }
            @DisplayName("1 field") @Nested class Test1 {
                                  @Test void a()     { assertTrue(          newInstance(A).filterNot(callbackIsA).isEmpty()); }
                                  @Test void e()     { assertArrayEquals(A, newInstance(A).filterNot(callbackIsE).toArray()); }
                                  @Test void even()  { assertTrue(          newInstance(A).filterNot(callbackIsEvenAlt).isEmpty()); }
                                  @Test void odd()   { assertArrayEquals(A, newInstance(A).filterNot(callbackIsOddAlt).toArray()); }
                @DisplayName("0") @Test void test0() { assertTrue(          newInstance(A).filterNot(callbackIs0Alt).isEmpty()); }
                @DisplayName("4") @Test void test4() { assertArrayEquals(A, newInstance(A).filterNot(callbackIs4Alt).toArray()); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                                  @Test void a()     { assertArrayEquals(B,  newInstance(AB).filterNot(callbackIsA).toArray()); }
                                  @Test void b()     { assertArrayEquals(A,  newInstance(AB).filterNot(callbackIsB).toArray()); }
                                  @Test void e()     { assertArrayEquals(AB, newInstance(AB).filterNot(callbackIsE).toArray()); }
                                  @Test void even()  { assertArrayEquals(B,  newInstance(AB).filterNot(callbackIsEvenAlt).toArray()); }
                                  @Test void odd()   { assertArrayEquals(A,  newInstance(AB).filterNot(callbackIsOddAlt).toArray()); }
                @DisplayName("0") @Test void test0() { assertArrayEquals(B,  newInstance(AB).filterNot(callbackIs0Alt).toArray()); }
                @DisplayName("1") @Test void test1() { assertArrayEquals(A,  newInstance(AB).filterNot(callbackIs1Alt).toArray()); }
                @DisplayName("4") @Test void test4() { assertArrayEquals(AB, newInstance(AB).filterNot(callbackIs4Alt).toArray()); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                                  @Test void a()     { assertArrayEquals(BCD,  newInstance(ABCD).filterNot(callbackIsA).toArray()); }
                                  @Test void b()     { assertArrayEquals(ACD,  newInstance(ABCD).filterNot(callbackIsB).toArray()); }
                                  @Test void c()     { assertArrayEquals(ABD,  newInstance(ABCD).filterNot(callbackIsC).toArray()); }
                                  @Test void d()     { assertArrayEquals(ABC,  newInstance(ABCD).filterNot(callbackIsD).toArray()); }
                                  @Test void e()     { assertArrayEquals(ABCD, newInstance(ABCD).filterNot(callbackIsE).toArray()); }
                                  @Test void even()  { assertArrayEquals(BD,   newInstance(ABCD).filterNot(callbackIsEvenAlt).toArray()); }
                                  @Test void odd()   { assertArrayEquals(AC,   newInstance(ABCD).filterNot(callbackIsOddAlt).toArray()); }
                @DisplayName("0") @Test void test0() { assertArrayEquals(BCD,  newInstance(ABCD).filterNot(callbackIs0Alt).toArray()); }
                @DisplayName("1") @Test void test1() { assertArrayEquals(ACD,  newInstance(ABCD).filterNot(callbackIs1Alt).toArray()); }
                @DisplayName("2") @Test void test2() { assertArrayEquals(ABD,  newInstance(ABCD).filterNot(callbackIs2Alt).toArray()); }
                @DisplayName("3") @Test void test3() { assertArrayEquals(ABC,  newInstance(ABCD).filterNot(callbackIs3Alt).toArray()); }
                @DisplayName("4") @Test void test4() { assertArrayEquals(ABCD, newInstance(ABCD).filterNot(callbackIs4Alt).toArray()); }
            }
        }
        @TestInstance(PER_CLASS) @Nested class filterNotIndexed {
            @Nested class empty {
                @DisplayName("(T, int) → boolean")  @Test void test2Arg() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).filterNotIndexed(predicate2AltAsFail)); }
                @DisplayName("(T) → boolean")       @Test void test1Arg() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).filterNotIndexed(predicate1AltAsFail)); }
                @DisplayName("() → boolean")        @Test void test0Arg() { assertSame(emptyCollectionHolder(), newInstance(EMPTY).filterNotIndexed(predicate0AsFail)); }
            }
            @DisplayName("boolean callbacks") @TestInstance(PER_CLASS) @Nested class BooleanCallbacks {
                @DisplayName("1 field: (T, int) → true")   @Test void test1_2True()  { assertTrue(             newInstance(A)   .filterNotIndexed(callback2AltAsTrue).isEmpty()); }
                @DisplayName("1 field: (T) → true")        @Test void test1_1True()  { assertTrue(             newInstance(A)   .filterNotIndexed(callback1AltAsTrue).isEmpty()); }
                @DisplayName("1 field: () → true")         @Test void test1_0True()  { assertTrue(             newInstance(A)   .filterNotIndexed(callback0AsTrue).isEmpty()); }
                @DisplayName("1 field: (T, int) → false")  @Test void test1_2False() { assertArrayEquals(A,    newInstance(A)   .filterNotIndexed(callback2AltAsFalse).toArray()); }
                @DisplayName("1 field: (T) → false")       @Test void test1_1False() { assertArrayEquals(A,    newInstance(A)   .filterNotIndexed(callback1AltAsFalse).toArray()); }
                @DisplayName("1 field: () → false")        @Test void test1_0False() { assertArrayEquals(A,    newInstance(A)   .filterNotIndexed(callback0AsFalse).toArray()); }
                @DisplayName("2 fields: (T, int) → true")  @Test void test2_2True()  { assertTrue(             newInstance(AB)  .filterNotIndexed(callback2AltAsTrue).isEmpty()); }
                @DisplayName("2 fields: (T) → true")       @Test void test2_1True()  { assertTrue(             newInstance(AB)  .filterNotIndexed(callback1AltAsTrue).isEmpty()); }
                @DisplayName("2 fields: () → true")        @Test void test2_0True()  { assertTrue(             newInstance(AB)  .filterNotIndexed(callback0AsTrue).isEmpty()); }
                @DisplayName("2 fields: (T, int) → false") @Test void test2_2False() { assertArrayEquals(AB,   newInstance(AB)  .filterNotIndexed(callback2AltAsFalse).toArray()); }
                @DisplayName("2 fields: (T) → false")      @Test void test2_1False() { assertArrayEquals(AB,   newInstance(AB)  .filterNotIndexed(callback1AltAsFalse).toArray()); }
                @DisplayName("2 fields: () → false")       @Test void test2_0False() { assertArrayEquals(AB,   newInstance(AB)  .filterNotIndexed(callback0AsFalse).toArray()); }
                @DisplayName("4 fields: (T, int) → true")  @Test void test4_2True()  { assertTrue(             newInstance(ABCD).filterNotIndexed(callback2AltAsTrue).isEmpty()); }
                @DisplayName("4 fields: (T) → true")       @Test void test4_1True()  { assertTrue(             newInstance(ABCD).filterNotIndexed(callback1AltAsTrue).isEmpty()); }
                @DisplayName("4 fields: () → true")        @Test void test4_0True()  { assertTrue(             newInstance(ABCD).filterNotIndexed(callback0AsTrue).isEmpty()); }
                @DisplayName("4 fields: (T, int) → false") @Test void test4_2False() { assertArrayEquals(ABCD, newInstance(ABCD).filterNotIndexed(callback2AltAsFalse).toArray()); }
                @DisplayName("4 fields: (T) → false")      @Test void test4_1False() { assertArrayEquals(ABCD, newInstance(ABCD).filterNotIndexed(callback1AltAsFalse).toArray()); }
                @DisplayName("4 fields: () → false")       @Test void test4_0False() { assertArrayEquals(ABCD, newInstance(ABCD).filterNotIndexed(callback0AsFalse).toArray()); }
            }
            @DisplayName("1 field") @Nested class Test1 {
                                  @Test void a()     { assertTrue(          newInstance(A).filterNotIndexed(callbackIsAAlt).isEmpty()); }
                                  @Test void e()     { assertArrayEquals(A, newInstance(A).filterNotIndexed(callbackIsEAlt).toArray()); }
                                  @Test void even()  { assertTrue(          newInstance(A).filterNotIndexed(callbackIsEven).isEmpty()); }
                                  @Test void odd()   { assertArrayEquals(A, newInstance(A).filterNotIndexed(callbackIsOdd).toArray()); }
                @DisplayName("0") @Test void test0() { assertTrue(          newInstance(A).filterNotIndexed(callbackIs0).isEmpty()); }
                @DisplayName("4") @Test void test4() { assertArrayEquals(A, newInstance(A).filterNotIndexed(callbackIs4).toArray()); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                                  @Test void a()     { assertArrayEquals(B,  newInstance(AB).filterNotIndexed(callbackIsAAlt).toArray()); }
                                  @Test void b()     { assertArrayEquals(A,  newInstance(AB).filterNotIndexed(callbackIsBAlt).toArray()); }
                                  @Test void e()     { assertArrayEquals(AB, newInstance(AB).filterNotIndexed(callbackIsEAlt).toArray()); }
                                  @Test void even()  { assertArrayEquals(B,  newInstance(AB).filterNotIndexed(callbackIsEven).toArray()); }
                                  @Test void odd()   { assertArrayEquals(A,  newInstance(AB).filterNotIndexed(callbackIsOdd).toArray()); }
                @DisplayName("0") @Test void test0() { assertArrayEquals(B,  newInstance(AB).filterNotIndexed(callbackIs0).toArray()); }
                @DisplayName("1") @Test void test1() { assertArrayEquals(A,  newInstance(AB).filterNotIndexed(callbackIs1).toArray()); }
                @DisplayName("4") @Test void test4() { assertArrayEquals(AB, newInstance(AB).filterNotIndexed(callbackIs4).toArray()); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                                  @Test void a()     { assertArrayEquals(BCD,  newInstance(ABCD).filterNotIndexed(callbackIsAAlt).toArray()); }
                                  @Test void b()     { assertArrayEquals(ACD,  newInstance(ABCD).filterNotIndexed(callbackIsBAlt).toArray()); }
                                  @Test void c()     { assertArrayEquals(ABD,  newInstance(ABCD).filterNotIndexed(callbackIsCAlt).toArray()); }
                                  @Test void d()     { assertArrayEquals(ABC,  newInstance(ABCD).filterNotIndexed(callbackIsDAlt).toArray()); }
                                  @Test void e()     { assertArrayEquals(ABCD, newInstance(ABCD).filterNotIndexed(callbackIsEAlt).toArray()); }
                                  @Test void even()  { assertArrayEquals(BD,   newInstance(ABCD).filterNotIndexed(callbackIsEven).toArray()); }
                                  @Test void odd()   { assertArrayEquals(AC,   newInstance(ABCD).filterNotIndexed(callbackIsOdd).toArray()); }
                @DisplayName("0") @Test void test0() { assertArrayEquals(BCD,  newInstance(ABCD).filterNotIndexed(callbackIs0).toArray()); }
                @DisplayName("1") @Test void test1() { assertArrayEquals(ACD,  newInstance(ABCD).filterNotIndexed(callbackIs1).toArray()); }
                @DisplayName("2") @Test void test2() { assertArrayEquals(ABD,  newInstance(ABCD).filterNotIndexed(callbackIs2).toArray()); }
                @DisplayName("3") @Test void test3() { assertArrayEquals(ABC,  newInstance(ABCD).filterNotIndexed(callbackIs3).toArray()); }
                @DisplayName("4") @Test void test4() { assertArrayEquals(ABCD, newInstance(ABCD).filterNotIndexed(callbackIs4).toArray()); }
            }
        }

        @TestInstance(PER_CLASS) @Nested class filterNotNull {
                                                      @Test void empty()            { assertSame(emptyCollectionHolder(), newInstance(EMPTY)   .filterNotNull()); }
            @DisplayName("1 field (non-null)")        @Test void test1_nonNull()    { assertArrayEquals(A,                newInstance(A)       .filterNotNull().toArray()); }
            @DisplayName("1 field (null)")            @Test void test1_null()       { assertTrue(                         newInstance(NULL)    .filterNotNull().isEmpty()); }
            @DisplayName("2 fiels (non-null)")        @Test void test2_nonNull()    { assertArrayEquals(AB,               newInstance(AB)      .filterNotNull().toArray()); }
            @DisplayName("2 fiels (null at start)")   @Test void test2_nullStart()  { assertArrayEquals(A,                newInstance(NULL_A)  .filterNotNull().toArray()); }
            @DisplayName("2 fiels (null at end)")     @Test void test2_nullEnd()    { assertArrayEquals(A,                newInstance(A_NULL)  .filterNotNull().toArray()); }
            @DisplayName("4 fields (non-null)")       @Test void test4_nonNull()    { assertArrayEquals(ABCD,             newInstance(ABCD)    .filterNotNull().toArray()); }
            @DisplayName("3 fields (null at start)")  @Test void test3_nullStart()  { assertArrayEquals(AB,               newInstance(NULL_AB) .filterNotNull().toArray()); }
            @DisplayName("3 fields (null at center)") @Test void test3_nullCenter() { assertArrayEquals(AB,               newInstance(A_NULL_B).filterNotNull().toArray()); }
            @DisplayName("3 fields (null at end)")    @Test void test3_nullEnd()    { assertArrayEquals(AB,               newInstance(AB_NULL) .filterNotNull().toArray()); }

            @ExtendWith({DisableIfMinimalistCondition.class, DisableIfViewerCondition.class,})
            @DisplayName("Same instance") @TestInstance(PER_CLASS) @Nested class SameInstance {
                public final instances rootInstance = instances.this;

                @DisplayName("1 field")  @Test void test1() { assertToBeInstance(newInstance(A),    CollectionHolder::filterNotNull); }
                @DisplayName("2 fields") @Test void test2() { assertToBeInstance(newInstance(AB),   CollectionHolder::filterNotNull); }
                @DisplayName("4 fields") @Test void test4() { assertToBeInstance(newInstance(ABCD), CollectionHolder::filterNotNull); }
            }
        }

    }

}

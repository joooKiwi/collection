import condition.DisableIfNormalCondition;
import condition.DisableIfNormalViewerCondition;
import instance.CollectionHolderForTest;
import instance.GenericCollectionHolder_FindFirstAlias;
import instance.GenericCollectionHolder_FindFirstIndexedAlias;
import instance.GenericCollectionHolder_FindFirstIndexedOrNullAlias;
import instance.GenericCollectionHolder_FindFirstOrNullAlias;
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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;
import static value.Arrays.A;
import static value.Arrays.AB;
import static value.Arrays.ABCD;
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
import static value.ReusableFields_Null.NULL_PREDICATE1_ALT;
import static value.ReusableFields_Null.NULL_PREDICATE2;
import static value.ReusableFields_Null.NULL_PREDICATE2_ALT;
import static value.ReusableFields_Null.NULL_VARARGS;

@NotNullByDefault
@DisplayNameGeneration(Simple.class)
@DisplayName("CollectionHolder tests (find)") @TestInstance(PER_CLASS) class CollectionHolder09_FindTests {

    @TestInstance(PER_CLASS) @Nested class EmptyCollectionHolder extends AbstractEmptyCollectionHolderTests {
        @Nested class find {
            @DisplayName("∅")                       @Test void testEmpty()     { assertThrowsExactly(EmptyCollectionException.class,      instance::find); }
            @DisplayName("null (T, int) → boolean") @Test void test2Arg()      { assertThrowsExactly(EmptyCollectionException.class, () -> instance.find(NULL_PREDICATE2)); }
            @DisplayName("null (T) → boolean")      @Test void test1Arg()      { assertThrowsExactly(EmptyCollectionException.class, () -> instance.find(NULL_PREDICATE1)); }
            @DisplayName("null () → boolean")       @Test void test0Arg()      { assertThrowsExactly(EmptyCollectionException.class, () -> instance.find(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.find(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.find(EMPTY_ARRAY)); }
        }
        @Nested class findOrNull {
            @DisplayName("∅")                       @Test void testEmpty()     { assertNull(instance.findOrNull()); }
            @DisplayName("null (T, int) → boolean") @Test void test2Arg()      { assertNull(instance.findOrNull(NULL_PREDICATE2)); }
            @DisplayName("null (T) → boolean")      @Test void test1Arg()      { assertNull(instance.findOrNull(NULL_PREDICATE1)); }
            @DisplayName("null () → boolean")       @Test void test0Arg()      { assertNull(instance.findOrNull(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray() { assertNull(instance.findOrNull(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()     { assertNull(instance.findOrNull(EMPTY_ARRAY)); }
        }
        @Nested class findIndexed {
            @DisplayName("∅")                       @Test void testEmpty()     { assertThrowsExactly(EmptyCollectionException.class,      instance::findIndexed); }
            @DisplayName("null (int, T) → boolean") @Test void test2Arg()      { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndexed(NULL_PREDICATE2_ALT)); }
            @DisplayName("null (int) → boolean")    @Test void test1Arg()      { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndexed(NULL_PREDICATE1_ALT)); }
            @DisplayName("null () → boolean")       @Test void test0Arg()      { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndexed(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndexed(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findIndexed(EMPTY_ARRAY)); }
        }
        @Nested class findIndexedOrNull {
            @DisplayName("∅")                       @Test void testEmpty()     { assertNull(instance.findIndexedOrNull()); }
            @DisplayName("null (int, T) → boolean") @Test void test2Arg()      { assertNull(instance.findIndexedOrNull(NULL_PREDICATE2_ALT)); }
            @DisplayName("null (int) → boolean")    @Test void test1Arg()      { assertNull(instance.findIndexedOrNull(NULL_PREDICATE1_ALT)); }
            @DisplayName("null () → boolean")       @Test void test0Arg()      { assertNull(instance.findIndexedOrNull(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray() { assertNull(instance.findIndexedOrNull(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()     { assertNull(instance.findIndexedOrNull(EMPTY_ARRAY)); }
        }
        @Nested class findFirst {
            @DisplayName("∅")                       @Test void testEmpty()     { assertThrowsExactly(EmptyCollectionException.class,      instance::findFirst); }
            @DisplayName("null (T, int) → boolean") @Test void test2Arg()      { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirst(NULL_PREDICATE2)); }
            @DisplayName("null (T) → boolean")      @Test void test1Arg()      { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirst(NULL_PREDICATE1)); }
            @DisplayName("null () → boolean")       @Test void test0Arg()      { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirst(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirst(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirst(EMPTY_ARRAY)); }
        }
        @Nested class findFirstOrNull {
            @DisplayName("∅")                       @Test void testEmpty()     { assertNull(instance.findFirstOrNull()); }
            @DisplayName("null (T, int) → boolean") @Test void test2Arg()      { assertNull(instance.findFirstOrNull(NULL_PREDICATE2)); }
            @DisplayName("null (T) → boolean")      @Test void test1Arg()      { assertNull(instance.findFirstOrNull(NULL_PREDICATE1)); }
            @DisplayName("null () → boolean")       @Test void test0Arg()      { assertNull(instance.findFirstOrNull(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray() { assertNull(instance.findFirstOrNull(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()     { assertNull(instance.findFirstOrNull(EMPTY_ARRAY)); }
        }
        @Nested class findFirstIndexed {
            @DisplayName("∅")                       @Test void testEmpty()     { assertThrowsExactly(EmptyCollectionException.class,      instance::findFirstIndexed); }
            @DisplayName("null (int, T) → boolean") @Test void test2Arg()      { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndexed(NULL_PREDICATE2_ALT)); }
            @DisplayName("null (int) → boolean")    @Test void test1Arg()      { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndexed(NULL_PREDICATE1_ALT)); }
            @DisplayName("null () → boolean")       @Test void test0Arg()      { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndexed(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndexed(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findFirstIndexed(EMPTY_ARRAY)); }
        }
        @Nested class findFirstIndexedOrNull {
            @DisplayName("∅")                       @Test void testEmpty()     { assertNull(instance.findFirstIndexedOrNull()); }
            @DisplayName("null (int, T) → boolean") @Test void test2Arg()      { assertNull(instance.findFirstIndexedOrNull(NULL_PREDICATE2_ALT)); }
            @DisplayName("null (int) → boolean")    @Test void test1Arg()      { assertNull(instance.findFirstIndexedOrNull(NULL_PREDICATE1_ALT)); }
            @DisplayName("null () → boolean")       @Test void test0Arg()      { assertNull(instance.findFirstIndexedOrNull(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray() { assertNull(instance.findFirstIndexedOrNull(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()     { assertNull(instance.findFirstIndexedOrNull(EMPTY_ARRAY)); }
        }
        @Nested class findLast {
            @DisplayName("∅")                       @Test void testEmpty()     { assertThrowsExactly(EmptyCollectionException.class,      instance::findLast); }
            @DisplayName("null (T, int) → boolean") @Test void test2Arg()      { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLast(NULL_PREDICATE2)); }
            @DisplayName("null (T) → boolean")      @Test void test1Arg()      { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLast(NULL_PREDICATE1)); }
            @DisplayName("null () → boolean")       @Test void test0Arg()      { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLast(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLast(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLast(EMPTY_ARRAY)); }
        }
        @Nested class findLastOrNull {
            @DisplayName("∅")                       @Test void testEmpty()     { assertNull(instance.findLastOrNull()); }
            @DisplayName("null (T, int) → boolean") @Test void test2Arg()      { assertNull(instance.findLastOrNull(NULL_PREDICATE2)); }
            @DisplayName("null (T) → boolean")      @Test void test1Arg()      { assertNull(instance.findLastOrNull(NULL_PREDICATE1)); }
            @DisplayName("null () → boolean")       @Test void test0Arg()      { assertNull(instance.findLastOrNull(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray() { assertNull(instance.findLastOrNull(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()     { assertNull(instance.findLastOrNull(EMPTY_ARRAY)); }
        }
        @Nested class findLastIndexed {
            @DisplayName("∅")                       @Test void testEmpty()     { assertThrowsExactly(EmptyCollectionException.class,      instance::findLastIndexed); }
            @DisplayName("null (int, T) → boolean") @Test void test2Arg()      { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndexed(NULL_PREDICATE2_ALT)); }
            @DisplayName("null (int) → boolean")    @Test void test1Arg()      { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndexed(NULL_PREDICATE1_ALT)); }
            @DisplayName("null () → boolean")       @Test void test0Arg()      { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndexed(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray() { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndexed(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()     { assertThrowsExactly(EmptyCollectionException.class, () -> instance.findLastIndexed(EMPTY_ARRAY)); }
        }
        @Nested class findLastIndexedOrNull {
            @DisplayName("∅")                       @Test void testEmpty()     { assertNull(instance.findLastIndexedOrNull()); }
            @DisplayName("null (int, T) → boolean") @Test void test2Arg()      { assertNull(instance.findLastIndexedOrNull(NULL_PREDICATE2_ALT)); }
            @DisplayName("null (int) → boolean")    @Test void test1Arg()      { assertNull(instance.findLastIndexedOrNull(NULL_PREDICATE1_ALT)); }
            @DisplayName("null () → boolean")       @Test void test0Arg()      { assertNull(instance.findLastIndexedOrNull(NULL_PREDICATE0)); }
            @DisplayName("null array")              @Test void testNullArray() { assertNull(instance.findLastIndexedOrNull(NULL_VARARGS)); }
            @DisplayName("[]")                      @Test void testArray()     { assertNull(instance.findLastIndexedOrNull(EMPTY_ARRAY)); }
        }
    }

    @TestInstance(PER_CLASS) @Nested class aliases {
        @TestInstance(PER_CLASS) @Nested class GenericCollectionHolder {
            @Nested class find {
                @DisplayName("(T, int) → boolean") @Test void test2Arg() { assertEquals(1, new GenericCollectionHolder_FindFirstAlias().execute(it -> it.find(callback2AsTrue)).amountOfCall); }
                @DisplayName("(T) → boolean")      @Test void test1Arg() { assertEquals(1, new GenericCollectionHolder_FindFirstAlias().execute(it -> it.find(callback1AsTrue)).amountOfCall); }
                @DisplayName("() → boolean")       @Test void test0Arg() { assertEquals(1, new GenericCollectionHolder_FindFirstAlias().execute(it -> it.find(callback0AsTrue)).amountOfCall); }
            }
            @Nested class findOrNull {
                @DisplayName("(T, int) → boolean") @Test void test2Arg() { assertEquals(1, new GenericCollectionHolder_FindFirstOrNullAlias().execute(it -> it.findOrNull(callback2AsTrue)).amountOfCall); }
                @DisplayName("(T) → boolean")      @Test void test1Arg() { assertEquals(1, new GenericCollectionHolder_FindFirstOrNullAlias().execute(it -> it.findOrNull(callback1AsTrue)).amountOfCall); }
                @DisplayName("() → boolean")       @Test void test0Arg() { assertEquals(1, new GenericCollectionHolder_FindFirstOrNullAlias().execute(it -> it.findOrNull(callback0AsTrue)).amountOfCall); }
            }
            @Nested class findIndexed {
                @DisplayName("(int, T) → boolean") @Test void test2Arg() { assertEquals(1, new GenericCollectionHolder_FindFirstIndexedAlias().execute(it -> it.findIndexed(callback2AltAsTrue)).amountOfCall); }
                @DisplayName("(int) → boolean")    @Test void test1Arg() { assertEquals(1, new GenericCollectionHolder_FindFirstIndexedAlias().execute(it -> it.findIndexed(callback1AltAsTrue)).amountOfCall); }
                @DisplayName("() → boolean")       @Test void test0Arg() { assertEquals(1, new GenericCollectionHolder_FindFirstIndexedAlias().execute(it -> it.findIndexed(callback0AsTrue))   .amountOfCall); }
            }
            @Nested class findIndexedOrNull {
                @DisplayName("(int, T) → boolean") @Test void test2Arg() { assertEquals(1, new GenericCollectionHolder_FindFirstIndexedOrNullAlias().execute(it -> it.findIndexedOrNull(callback2AltAsTrue)).amountOfCall); }
                @DisplayName("(int) → boolean")    @Test void test1Arg() { assertEquals(1, new GenericCollectionHolder_FindFirstIndexedOrNullAlias().execute(it -> it.findIndexedOrNull(callback1AltAsTrue)).amountOfCall); }
                @DisplayName("() → boolean")       @Test void test0Arg() { assertEquals(1, new GenericCollectionHolder_FindFirstIndexedOrNullAlias().execute(it -> it.findIndexedOrNull(callback0AsTrue))   .amountOfCall); }
            }
        }

        //TODO add utility static method (filter) call to have been called

    }

    @FieldSource("value.Instances#everyExtensionMethodInstancesAsArguments")
    @ParameterizedClass(name = "{0}")/* @TestInstance(PER_CLASS)*/ @Nested class methods extends AbstractMethodsTests {
        //#region -------------------- Required test configuration --------------------

        public methods(final CollectionHolderForTest<?, ?> instance) { super(instance); }

        //#endregion -------------------- Required test configuration --------------------

        @Nested class findFirst {
            @DisplayName("(T, int) → boolean") @Test void test2Arg() { assertThrowsExactly(emptyExceptionClass(), () -> stringInstance.findFirst(predicate2AsFail)); }
            @DisplayName("(T) → boolean")      @Test void test1Arg() { assertThrowsExactly(emptyExceptionClass(), () -> stringInstance.findFirst(predicate1AsFail)); }
            @DisplayName("() → boolean")       @Test void test0Arg() { assertThrowsExactly(emptyExceptionClass(), () ->       instance.findFirst(predicate0AsFail)); }
        }
        @Nested class findFirstOrNull {
            @DisplayName("(T, int) → boolean") @Test void test2Arg() { assertNull(stringInstance.findFirstOrNull(predicate2AsFail)); }
            @DisplayName("(T) → boolean")      @Test void test1Arg() { assertNull(stringInstance.findFirstOrNull(predicate1AsFail)); }
            @DisplayName("() → boolean")       @Test void test0Arg() { assertNull(      instance.findFirstOrNull(predicate0AsFail)); }
        }
        @Nested class findFirstIndexed {
            @DisplayName("(int, T) → boolean") @Test void test2Arg() { assertThrowsExactly(emptyExceptionClass(), () -> stringInstance.findFirstIndexed(predicate2AltAsFail)); }
            @DisplayName("(int) → boolean")    @Test void test1Arg() { assertThrowsExactly(emptyExceptionClass(), () ->       instance.findFirstIndexed(predicate1AltAsFail)); }
            @DisplayName("() → boolean")       @Test void test0Arg() { assertThrowsExactly(emptyExceptionClass(), () ->       instance.findFirstIndexed(predicate0AsFail)); }
        }
        @Nested class findFirstIndexedOrNull {
            @DisplayName("(int, T) → boolean") @Test void test2Arg() { assertNull(stringInstance.findFirstIndexedOrNull(predicate2AltAsFail)); }
            @DisplayName("(int) → boolean")    @Test void test1Arg() { assertNull(      instance.findFirstIndexedOrNull(predicate1AltAsFail)); }
            @DisplayName("() → boolean")       @Test void test0Arg() { assertNull(      instance.findFirstIndexedOrNull(predicate0AsFail)); }
        }

        @Nested class findLast {
            @DisplayName("(T, int) → boolean") @Test void test2Arg() { assertThrowsExactly(emptyExceptionClass(), () -> stringInstance.findLast(predicate2AsFail)); }
            @DisplayName("(T) → boolean")      @Test void test1Arg() { assertThrowsExactly(emptyExceptionClass(), () -> stringInstance.findLast(predicate1AsFail)); }
            @DisplayName("() → boolean")       @Test void test0Arg() { assertThrowsExactly(emptyExceptionClass(), () ->       instance.findLast(predicate0AsFail)); }
        }
        @Nested class findLastOrNull {
            @DisplayName("(T, int) → boolean") @Test void test2Arg() { assertNull(stringInstance.findLastOrNull(predicate2AsFail)); }
            @DisplayName("(T) → boolean")      @Test void test1Arg() { assertNull(stringInstance.findLastOrNull(predicate1AsFail)); }
            @DisplayName("() → boolean")       @Test void test0Arg() { assertNull(      instance.findLastOrNull(predicate0AsFail)); }
        }
        @Nested class findLastIndexed {
            @DisplayName("(int, T) → boolean") @Test void test2Arg() { assertThrowsExactly(emptyExceptionClass(), () -> stringInstance.findLastIndexed(predicate2AltAsFail)); }
            @DisplayName("(int) → boolean")    @Test void test1Arg() { assertThrowsExactly(emptyExceptionClass(), () ->       instance.findLastIndexed(predicate1AltAsFail)); }
            @DisplayName("() → boolean")       @Test void test0Arg() { assertThrowsExactly(emptyExceptionClass(), () ->       instance.findLastIndexed(predicate0AsFail)); }
        }
        @Nested class findLastIndexedOrNull {
            @DisplayName("(int, T) → boolean") @Test void test2Arg() { assertNull(stringInstance.findLastIndexedOrNull(predicate2AltAsFail)); }
            @DisplayName("(int) → boolean")    @Test void test1Arg() { assertNull(      instance.findLastIndexedOrNull(predicate1AltAsFail)); }
            @DisplayName("() → boolean")       @Test void test0Arg() { assertNull(      instance.findLastIndexedOrNull(predicate0AsFail)); }
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

            @Nested class findFirst {
                @DisplayName("empty: (T, int) → boolean")  @Test void empty_2Arg()   { assertEquals(0, newInstance(EMPTY).executeWhileExpectingEmptyException(it ->  it.findFirst(predicate2AsFail)).getAmountOfCall()); }
                @DisplayName("empty: (T) → boolean")       @Test void empty_1Arg()   { assertEquals(0, newInstance(EMPTY).executeWhileExpectingEmptyException(it ->  it.findFirst(predicate1AsFail)).getAmountOfCall()); }
                @DisplayName("empty: () → boolean")        @Test void empty_0Arg()   { assertEquals(0, newInstance(EMPTY).executeWhileExpectingEmptyException(it ->  it.findFirst(predicate0AsFail)).getAmountOfCall()); }
                @DisplayName("1 field: (T, int) → true")   @Test void test1_2True()  { assertEquals(1, newInstance(A)    .execute(it ->                              it.findFirst(callback2AsTrue)) .getAmountOfCall()); }
                @DisplayName("1 field: (T) → true")        @Test void test1_1True()  { assertEquals(1, newInstance(A)    .execute(it ->                              it.findFirst(callback1AsTrue)) .getAmountOfCall()); }
                @DisplayName("1 field: () → true")         @Test void test1_0True()  { assertEquals(1, newInstance(A)    .execute(it ->                              it.findFirst(callback0AsTrue)) .getAmountOfCall()); }
                @DisplayName("1 field: (T, int) → false")  @Test void test1_2False() { assertEquals(1, newInstance(A)    .executeWhileExpectingIndexOutOfBound(it -> it.findFirst(callback2AsFalse)).getAmountOfCall()); }
                @DisplayName("1 field: (T) → false")       @Test void test1_1False() { assertEquals(1, newInstance(A)    .executeWhileExpectingIndexOutOfBound(it -> it.findFirst(callback1AsFalse)).getAmountOfCall()); }
                @DisplayName("1 field: () → false")        @Test void test1_0False() { assertEquals(0, newInstance(A)    .executeWhileExpectingIndexOutOfBound(it -> it.findFirst(callback0AsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields: (T, int) → true")  @Test void test2_2True()  { assertEquals(1, newInstance(AB)   .execute(it ->                              it.findFirst(callback2AsTrue)) .getAmountOfCall()); }
                @DisplayName("2 fields: (T) → true")       @Test void test2_1True()  { assertEquals(1, newInstance(AB)   .execute(it ->                              it.findFirst(callback1AsTrue)) .getAmountOfCall()); }
                @DisplayName("2 fields: () → true")        @Test void test2_0True()  { assertEquals(1, newInstance(AB)   .execute(it ->                              it.findFirst(callback0AsTrue)) .getAmountOfCall()); }
                @DisplayName("2 fields: (T, int) → false") @Test void test2_2False() { assertEquals(2, newInstance(AB)   .executeWhileExpectingIndexOutOfBound(it -> it.findFirst(callback2AsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields: (T) → false")      @Test void test2_1False() { assertEquals(2, newInstance(AB)   .executeWhileExpectingIndexOutOfBound(it -> it.findFirst(callback1AsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields: () → false")       @Test void test2_0False() { assertEquals(0, newInstance(AB)   .executeWhileExpectingIndexOutOfBound(it -> it.findFirst(callback0AsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields: (T, int) → true")  @Test void test4_2True()  { assertEquals(1, newInstance(ABCD) .execute(it ->                              it.findFirst(callback2AsTrue)) .getAmountOfCall()); }
                @DisplayName("4 fields: (T) → true")       @Test void test4_1True()  { assertEquals(1, newInstance(ABCD) .execute(it ->                              it.findFirst(callback1AsTrue)) .getAmountOfCall()); }
                @DisplayName("4 fields: () → true")        @Test void test4_0True()  { assertEquals(1, newInstance(ABCD) .execute(it ->                              it.findFirst(callback0AsTrue)) .getAmountOfCall()); }
                @DisplayName("4 fields: (T, int) → false") @Test void test4_2False() { assertEquals(4, newInstance(ABCD) .executeWhileExpectingIndexOutOfBound(it -> it.findFirst(callback2AsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields: (T) → false")      @Test void test4_1False() { assertEquals(4, newInstance(ABCD) .executeWhileExpectingIndexOutOfBound(it -> it.findFirst(callback1AsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields: () → false")       @Test void test4_0False() { assertEquals(0, newInstance(ABCD) .executeWhileExpectingIndexOutOfBound(it -> it.findFirst(callback0AsFalse)).getAmountOfCall()); }
            }
            @Nested class findFirstOrNull {
                @DisplayName("empty: (T, int) → boolean")  @Test void empty_2Arg()   { assertEquals(0, newInstance(EMPTY).execute(it -> it.findFirstOrNull(predicate2AsFail)).getAmountOfCall()); }
                @DisplayName("empty: (T) → boolean")       @Test void empty_1Arg()   { assertEquals(0, newInstance(EMPTY).execute(it -> it.findFirstOrNull(predicate1AsFail)).getAmountOfCall()); }
                @DisplayName("empty: () → boolean")        @Test void empty_0Arg()   { assertEquals(0, newInstance(EMPTY).execute(it -> it.findFirstOrNull(predicate0AsFail)).getAmountOfCall()); }
                @DisplayName("1 field: (T, int) → true")   @Test void test1_2True()  { assertEquals(1, newInstance(A)    .execute(it -> it.findFirstOrNull(callback2AsTrue)) .getAmountOfCall()); }
                @DisplayName("1 field: (T) → true")        @Test void test1_1True()  { assertEquals(1, newInstance(A)    .execute(it -> it.findFirstOrNull(callback1AsTrue)) .getAmountOfCall()); }
                @DisplayName("1 field: () → true")         @Test void test1_0True()  { assertEquals(1, newInstance(A)    .execute(it -> it.findFirstOrNull(callback0AsTrue)) .getAmountOfCall()); }
                @DisplayName("1 field: (T, int) → false")  @Test void test1_2False() { assertEquals(1, newInstance(A)    .execute(it -> it.findFirstOrNull(callback2AsFalse)).getAmountOfCall()); }
                @DisplayName("1 field: (T) → false")       @Test void test1_1False() { assertEquals(1, newInstance(A)    .execute(it -> it.findFirstOrNull(callback1AsFalse)).getAmountOfCall()); }
                @DisplayName("1 field: () → false")        @Test void test1_0False() { assertEquals(0, newInstance(A)    .execute(it -> it.findFirstOrNull(callback0AsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields: (T, int) → true")  @Test void test2_2True()  { assertEquals(1, newInstance(AB)   .execute(it -> it.findFirstOrNull(callback2AsTrue)) .getAmountOfCall()); }
                @DisplayName("2 fields: (T) → true")       @Test void test2_1True()  { assertEquals(1, newInstance(AB)   .execute(it -> it.findFirstOrNull(callback1AsTrue)) .getAmountOfCall()); }
                @DisplayName("2 fields: () → true")        @Test void test2_0True()  { assertEquals(1, newInstance(AB)   .execute(it -> it.findFirstOrNull(callback0AsTrue)) .getAmountOfCall()); }
                @DisplayName("2 fields: (T, int) → false") @Test void test2_2False() { assertEquals(2, newInstance(AB)   .execute(it -> it.findFirstOrNull(callback2AsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields: (T) → false")      @Test void test2_1False() { assertEquals(2, newInstance(AB)   .execute(it -> it.findFirstOrNull(callback1AsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields: () → false")       @Test void test2_0False() { assertEquals(0, newInstance(AB)   .execute(it -> it.findFirstOrNull(callback0AsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields: (T, int) → true")  @Test void test4_2True()  { assertEquals(1, newInstance(ABCD) .execute(it -> it.findFirstOrNull(callback2AsTrue)) .getAmountOfCall()); }
                @DisplayName("4 fields: (T) → true")       @Test void test4_1True()  { assertEquals(1, newInstance(ABCD) .execute(it -> it.findFirstOrNull(callback1AsTrue)) .getAmountOfCall()); }
                @DisplayName("4 fields: () → true")        @Test void test4_0True()  { assertEquals(1, newInstance(ABCD) .execute(it -> it.findFirstOrNull(callback0AsTrue)) .getAmountOfCall()); }
                @DisplayName("4 fields: (T, int) → false") @Test void test4_2False() { assertEquals(4, newInstance(ABCD) .execute(it -> it.findFirstOrNull(callback2AsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields: (T) → false")      @Test void test4_1False() { assertEquals(4, newInstance(ABCD) .execute(it -> it.findFirstOrNull(callback1AsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields: () → false")       @Test void test4_0False() { assertEquals(0, newInstance(ABCD) .execute(it -> it.findFirstOrNull(callback0AsFalse)).getAmountOfCall()); }
            }
            @Nested class findFirstIndexed {
                @DisplayName("empty: (int, T) → boolean")  @Test void empty_2Arg()   { assertEquals(0, newInstance(EMPTY).executeWhileExpectingEmptyException(it -> it.findFirstIndexed(predicate2AltAsFail)) .getAmountOfCall()); }
                @DisplayName("empty: (int) → boolean")     @Test void empty_1Arg()   { assertEquals(0, newInstance(EMPTY).executeWhileExpectingEmptyException(it -> it.findFirstIndexed(predicate1AltAsFail)) .getAmountOfCall()); }
                @DisplayName("empty: () → boolean")        @Test void empty_0Arg()   { assertEquals(0, newInstance(EMPTY).executeWhileExpectingEmptyException(it -> it.findFirstIndexed(predicate0AsFail))    .getAmountOfCall()); }
                @DisplayName("1 field: (int, T) → true")   @Test void test1_2True()  { assertEquals(1, newInstance(A)    .execute(it ->                              it.findFirstIndexed(callback2AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("1 field: (int) → true")      @Test void test1_1True()  { assertEquals(1, newInstance(A)    .execute(it ->                              it.findFirstIndexed(callback1AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("1 field: () → true")         @Test void test1_0True()  { assertEquals(1, newInstance(A)    .execute(it ->                              it.findFirstIndexed(callback0AsTrue))    .getAmountOfCall()); }
                @DisplayName("1 field: (int, T) → false")  @Test void test1_2False() { assertEquals(1, newInstance(A)    .executeWhileExpectingIndexOutOfBound(it -> it.findFirstIndexed(callback2AltAsFalse)).getAmountOfCall()); }
                @DisplayName("1 field: (int) → false")     @Test void test1_1False() { assertEquals(0, newInstance(A)    .executeWhileExpectingIndexOutOfBound(it -> it.findFirstIndexed(callback1AltAsFalse)).getAmountOfCall()); }
                @DisplayName("1 field: () → false")        @Test void test1_0False() { assertEquals(0, newInstance(A)    .executeWhileExpectingIndexOutOfBound(it -> it.findFirstIndexed(callback0AsFalse))   .getAmountOfCall()); }
                @DisplayName("2 fields: (int, T) → true")  @Test void test2_2True()  { assertEquals(1, newInstance(AB)   .execute(it ->                              it.findFirstIndexed(callback2AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("2 fields: (int) → true")     @Test void test2_1True()  { assertEquals(1, newInstance(AB)   .execute(it ->                              it.findFirstIndexed(callback1AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("2 fields: () → true")        @Test void test2_0True()  { assertEquals(1, newInstance(AB)   .execute(it ->                              it.findFirstIndexed(callback0AsTrue))    .getAmountOfCall()); }
                @DisplayName("2 fields: (int, T) → false") @Test void test2_2False() { assertEquals(2, newInstance(AB)   .executeWhileExpectingIndexOutOfBound(it -> it.findFirstIndexed(callback2AltAsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields: (int) → false")    @Test void test2_1False() { assertEquals(0, newInstance(AB)   .executeWhileExpectingIndexOutOfBound(it -> it.findFirstIndexed(callback1AltAsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields: () → false")       @Test void test2_0False() { assertEquals(0, newInstance(AB)   .executeWhileExpectingIndexOutOfBound(it -> it.findFirstIndexed(callback0AsFalse))   .getAmountOfCall()); }
                @DisplayName("4 fields: (int, T) → true")  @Test void test4_2True()  { assertEquals(1, newInstance(ABCD) .execute(it ->                              it.findFirstIndexed(callback2AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("4 fields: (int) → true")     @Test void test4_1True()  { assertEquals(1, newInstance(ABCD) .execute(it ->                              it.findFirstIndexed(callback1AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("4 fields: () → true")        @Test void test4_0True()  { assertEquals(1, newInstance(ABCD) .execute(it ->                              it.findFirstIndexed(callback0AsTrue))    .getAmountOfCall()); }
                @DisplayName("4 fields: (int, T) → false") @Test void test4_2False() { assertEquals(4, newInstance(ABCD) .executeWhileExpectingIndexOutOfBound(it -> it.findFirstIndexed(callback2AltAsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields: (int) → false")    @Test void test4_1False() { assertEquals(0, newInstance(ABCD) .executeWhileExpectingIndexOutOfBound(it -> it.findFirstIndexed(callback1AltAsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields: () → false")       @Test void test4_0False() { assertEquals(0, newInstance(ABCD) .executeWhileExpectingIndexOutOfBound(it -> it.findFirstIndexed(callback0AsFalse))   .getAmountOfCall()); }
            }
            @Nested class findFirstIndexedOrNull {
                @DisplayName("empty: (int, T) → boolean")  @Test void empty_2Arg()   { assertEquals(0, newInstance(EMPTY).execute(it -> it.findFirstIndexedOrNull(predicate2AltAsFail)).getAmountOfCall()); }
                @DisplayName("empty: (int) → boolean")     @Test void empty_1Arg()   { assertEquals(0, newInstance(EMPTY).execute(it -> it.findFirstIndexedOrNull(predicate1AltAsFail)).getAmountOfCall()); }
                @DisplayName("empty: () → boolean")        @Test void empty_0Arg()   { assertEquals(0, newInstance(EMPTY).execute(it -> it.findFirstIndexedOrNull(predicate0AsFail))   .getAmountOfCall()); }
                @DisplayName("1 field: (int, T) → true")   @Test void test1_2True()  { assertEquals(1, newInstance(A)    .execute(it -> it.findFirstIndexedOrNull(callback2AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("1 field: (int) → true")      @Test void test1_1True()  { assertEquals(1, newInstance(A)    .execute(it -> it.findFirstIndexedOrNull(callback1AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("1 field: () → true")         @Test void test1_0True()  { assertEquals(1, newInstance(A)    .execute(it -> it.findFirstIndexedOrNull(callback0AsTrue))    .getAmountOfCall()); }
                @DisplayName("1 field: (int, T) → false")  @Test void test1_2False() { assertEquals(1, newInstance(A)    .execute(it -> it.findFirstIndexedOrNull(callback2AltAsFalse)).getAmountOfCall()); }
                @DisplayName("1 field: (int) → false")     @Test void test1_1False() { assertEquals(0, newInstance(A)    .execute(it -> it.findFirstIndexedOrNull(callback1AltAsFalse)).getAmountOfCall()); }
                @DisplayName("1 field: () → false")        @Test void test1_0False() { assertEquals(0, newInstance(A)    .execute(it -> it.findFirstIndexedOrNull(callback0AsFalse))   .getAmountOfCall()); }
                @DisplayName("2 fields: (int, T) → true")  @Test void test2_2True()  { assertEquals(1, newInstance(AB)   .execute(it -> it.findFirstIndexedOrNull(callback2AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("2 fields: (int) → true")     @Test void test2_1True()  { assertEquals(1, newInstance(AB)   .execute(it -> it.findFirstIndexedOrNull(callback1AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("2 fields: () → true")        @Test void test2_0True()  { assertEquals(1, newInstance(AB)   .execute(it -> it.findFirstIndexedOrNull(callback0AsTrue))    .getAmountOfCall()); }
                @DisplayName("2 fields: (int, T) → false") @Test void test2_2False() { assertEquals(2, newInstance(AB)   .execute(it -> it.findFirstIndexedOrNull(callback2AltAsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields: (int) → false")    @Test void test2_1False() { assertEquals(0, newInstance(AB)   .execute(it -> it.findFirstIndexedOrNull(callback1AltAsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields: () → false")       @Test void test2_0False() { assertEquals(0, newInstance(AB)   .execute(it -> it.findFirstIndexedOrNull(callback0AsFalse))   .getAmountOfCall()); }
                @DisplayName("4 fields: (int, T) → true")  @Test void test4_2True()  { assertEquals(1, newInstance(ABCD) .execute(it -> it.findFirstIndexedOrNull(callback2AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("4 fields: (int) → true")     @Test void test4_1True()  { assertEquals(1, newInstance(ABCD) .execute(it -> it.findFirstIndexedOrNull(callback1AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("4 fields: () → true")        @Test void test4_0True()  { assertEquals(1, newInstance(ABCD) .execute(it -> it.findFirstIndexedOrNull(callback0AsTrue))    .getAmountOfCall()); }
                @DisplayName("4 fields: (int, T) → false") @Test void test4_2False() { assertEquals(4, newInstance(ABCD) .execute(it -> it.findFirstIndexedOrNull(callback2AltAsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields: (int) → false")    @Test void test4_1False() { assertEquals(0, newInstance(ABCD) .execute(it -> it.findFirstIndexedOrNull(callback1AltAsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields: () → false")       @Test void test4_0False() { assertEquals(0, newInstance(ABCD) .execute(it -> it.findFirstIndexedOrNull(callback0AsFalse))   .getAmountOfCall()); }
            }

            @Nested class findLast {
                @DisplayName("empty: (T, int) → boolean")  @Test void empty_2Arg()   { assertEquals(0, newInstance(EMPTY).executeWhileExpectingEmptyException(it ->  it.findLast(predicate2AsFail)).getAmountOfCall()); }
                @DisplayName("empty: (T) → boolean")       @Test void empty_1Arg()   { assertEquals(0, newInstance(EMPTY).executeWhileExpectingEmptyException(it ->  it.findLast(predicate1AsFail)).getAmountOfCall()); }
                @DisplayName("empty: () → boolean")        @Test void empty_0Arg()   { assertEquals(0, newInstance(EMPTY).executeWhileExpectingEmptyException(it ->  it.findLast(predicate0AsFail)).getAmountOfCall()); }
                @DisplayName("1 field: (T, int) → true")   @Test void test1_2True()  { assertEquals(1, newInstance(A)    .execute(it ->                              it.findLast(callback2AsTrue)) .getAmountOfCall()); }
                @DisplayName("1 field: (T) → true")        @Test void test1_1True()  { assertEquals(1, newInstance(A)    .execute(it ->                              it.findLast(callback1AsTrue)) .getAmountOfCall()); }
                @DisplayName("1 field: () → true")         @Test void test1_0True()  { assertEquals(1, newInstance(A)    .execute(it ->                              it.findLast(callback0AsTrue)) .getAmountOfCall()); }
                @DisplayName("1 field: (T, int) → false")  @Test void test1_2False() { assertEquals(1, newInstance(A)    .executeWhileExpectingIndexOutOfBound(it -> it.findLast(callback2AsFalse)).getAmountOfCall()); }
                @DisplayName("1 field: (T) → false")       @Test void test1_1False() { assertEquals(1, newInstance(A)    .executeWhileExpectingIndexOutOfBound(it -> it.findLast(callback1AsFalse)).getAmountOfCall()); }
                @DisplayName("1 field: () → false")        @Test void test1_0False() { assertEquals(0, newInstance(A)    .executeWhileExpectingIndexOutOfBound(it -> it.findLast(callback0AsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields: (T, int) → true")  @Test void test2_2True()  { assertEquals(1, newInstance(AB)   .execute(it ->                              it.findLast(callback2AsTrue)) .getAmountOfCall()); }
                @DisplayName("2 fields: (T) → true")       @Test void test2_1True()  { assertEquals(1, newInstance(AB)   .execute(it ->                              it.findLast(callback1AsTrue)) .getAmountOfCall()); }
                @DisplayName("2 fields: () → true")        @Test void test2_0True()  { assertEquals(1, newInstance(AB)   .execute(it ->                              it.findLast(callback0AsTrue)) .getAmountOfCall()); }
                @DisplayName("2 fields: (T, int) → false") @Test void test2_2False() { assertEquals(2, newInstance(AB)   .executeWhileExpectingIndexOutOfBound(it -> it.findLast(callback2AsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields: (T) → false")      @Test void test2_1False() { assertEquals(2, newInstance(AB)   .executeWhileExpectingIndexOutOfBound(it -> it.findLast(callback1AsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields: () → false")       @Test void test2_0False() { assertEquals(0, newInstance(AB)   .executeWhileExpectingIndexOutOfBound(it -> it.findLast(callback0AsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields: (T, int) → true")  @Test void test4_2True()  { assertEquals(1, newInstance(ABCD) .execute(it ->                              it.findLast(callback2AsTrue)) .getAmountOfCall()); }
                @DisplayName("4 fields: (T) → true")       @Test void test4_1True()  { assertEquals(1, newInstance(ABCD) .execute(it ->                              it.findLast(callback1AsTrue)) .getAmountOfCall()); }
                @DisplayName("4 fields: () → true")        @Test void test4_0True()  { assertEquals(1, newInstance(ABCD) .execute(it ->                              it.findLast(callback0AsTrue)) .getAmountOfCall()); }
                @DisplayName("4 fields: (T, int) → false") @Test void test4_2False() { assertEquals(4, newInstance(ABCD) .executeWhileExpectingIndexOutOfBound(it -> it.findLast(callback2AsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields: (T) → false")      @Test void test4_1False() { assertEquals(4, newInstance(ABCD) .executeWhileExpectingIndexOutOfBound(it -> it.findLast(callback1AsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields: () → false")       @Test void test4_0False() { assertEquals(0, newInstance(ABCD) .executeWhileExpectingIndexOutOfBound(it -> it.findLast(callback0AsFalse)).getAmountOfCall()); }
            }
            @Nested class findLastOrNull {
                @DisplayName("empty: (T, int) → boolean")  @Test void empty_2Arg()   { assertEquals(0, newInstance(EMPTY).execute(it -> it.findLastOrNull(predicate2AsFail)).getAmountOfCall()); }
                @DisplayName("empty: (T) → boolean")       @Test void empty_1Arg()   { assertEquals(0, newInstance(EMPTY).execute(it -> it.findLastOrNull(predicate1AsFail)).getAmountOfCall()); }
                @DisplayName("empty: () → boolean")        @Test void empty_0Arg()   { assertEquals(0, newInstance(EMPTY).execute(it -> it.findLastOrNull(predicate0AsFail)).getAmountOfCall()); }
                @DisplayName("1 field: (T, int) → true")   @Test void test1_2True()  { assertEquals(1, newInstance(A)    .execute(it -> it.findLastOrNull(callback2AsTrue)) .getAmountOfCall()); }
                @DisplayName("1 field: (T) → true")        @Test void test1_1True()  { assertEquals(1, newInstance(A)    .execute(it -> it.findLastOrNull(callback1AsTrue)) .getAmountOfCall()); }
                @DisplayName("1 field: () → true")         @Test void test1_0True()  { assertEquals(1, newInstance(A)    .execute(it -> it.findLastOrNull(callback0AsTrue)) .getAmountOfCall()); }
                @DisplayName("1 field: (T, int) → false")  @Test void test1_2False() { assertEquals(1, newInstance(A)    .execute(it -> it.findLastOrNull(callback2AsFalse)).getAmountOfCall()); }
                @DisplayName("1 field: (T) → false")       @Test void test1_1False() { assertEquals(1, newInstance(A)    .execute(it -> it.findLastOrNull(callback1AsFalse)).getAmountOfCall()); }
                @DisplayName("1 field: () → false")        @Test void test1_0False() { assertEquals(0, newInstance(A)    .execute(it -> it.findLastOrNull(callback0AsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields: (T, int) → true")  @Test void test2_2True()  { assertEquals(1, newInstance(AB)   .execute(it -> it.findLastOrNull(callback2AsTrue)) .getAmountOfCall()); }
                @DisplayName("2 fields: (T) → true")       @Test void test2_1True()  { assertEquals(1, newInstance(AB)   .execute(it -> it.findLastOrNull(callback1AsTrue)) .getAmountOfCall()); }
                @DisplayName("2 fields: () → true")        @Test void test2_0True()  { assertEquals(1, newInstance(AB)   .execute(it -> it.findLastOrNull(callback0AsTrue)) .getAmountOfCall()); }
                @DisplayName("2 fields: (T, int) → false") @Test void test2_2False() { assertEquals(2, newInstance(AB)   .execute(it -> it.findLastOrNull(callback2AsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields: (T) → false")      @Test void test2_1False() { assertEquals(2, newInstance(AB)   .execute(it -> it.findLastOrNull(callback1AsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields: () → false")       @Test void test2_0False() { assertEquals(0, newInstance(AB)   .execute(it -> it.findLastOrNull(callback0AsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields: (T, int) → true")  @Test void test4_2True()  { assertEquals(1, newInstance(ABCD) .execute(it -> it.findLastOrNull(callback2AsTrue)) .getAmountOfCall()); }
                @DisplayName("4 fields: (T) → true")       @Test void test4_1True()  { assertEquals(1, newInstance(ABCD) .execute(it -> it.findLastOrNull(callback1AsTrue)) .getAmountOfCall()); }
                @DisplayName("4 fields: () → true")        @Test void test4_0True()  { assertEquals(1, newInstance(ABCD) .execute(it -> it.findLastOrNull(callback0AsTrue)) .getAmountOfCall()); }
                @DisplayName("4 fields: (T, int) → false") @Test void test4_2False() { assertEquals(4, newInstance(ABCD) .execute(it -> it.findLastOrNull(callback2AsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields: (T) → false")      @Test void test4_1False() { assertEquals(4, newInstance(ABCD) .execute(it -> it.findLastOrNull(callback1AsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields: () → false")       @Test void test4_0False() { assertEquals(0, newInstance(ABCD) .execute(it -> it.findLastOrNull(callback0AsFalse)).getAmountOfCall()); }
            }
            @Nested class findLastIndexed {
                @DisplayName("empty: (int, T) → boolean")  @Test void empty_2Arg()   { assertEquals(0, newInstance(EMPTY).executeWhileExpectingEmptyException(it -> it.findLastIndexed(predicate2AltAsFail)) .getAmountOfCall()); }
                @DisplayName("empty: (int) → boolean")     @Test void empty_1Arg()   { assertEquals(0, newInstance(EMPTY).executeWhileExpectingEmptyException(it -> it.findLastIndexed(predicate1AltAsFail)) .getAmountOfCall()); }
                @DisplayName("empty: () → boolean")        @Test void empty_0Arg()   { assertEquals(0, newInstance(EMPTY).executeWhileExpectingEmptyException(it -> it.findLastIndexed(predicate0AsFail))    .getAmountOfCall()); }
                @DisplayName("1 field: (int, T) → true")   @Test void test1_2True()  { assertEquals(1, newInstance(A)    .execute(it ->                              it.findLastIndexed(callback2AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("1 field: (int) → true")      @Test void test1_1True()  { assertEquals(1, newInstance(A)    .execute(it ->                              it.findLastIndexed(callback1AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("1 field: () → true")         @Test void test1_0True()  { assertEquals(1, newInstance(A)    .execute(it ->                              it.findLastIndexed(callback0AsTrue))    .getAmountOfCall()); }
                @DisplayName("1 field: (int, T) → false")  @Test void test1_2False() { assertEquals(1, newInstance(A)    .executeWhileExpectingIndexOutOfBound(it -> it.findLastIndexed(callback2AltAsFalse)).getAmountOfCall()); }
                @DisplayName("1 field: (int) → false")     @Test void test1_1False() { assertEquals(0, newInstance(A)    .executeWhileExpectingIndexOutOfBound(it -> it.findLastIndexed(callback1AltAsFalse)).getAmountOfCall()); }
                @DisplayName("1 field: () → false")        @Test void test1_0False() { assertEquals(0, newInstance(A)    .executeWhileExpectingIndexOutOfBound(it -> it.findLastIndexed(callback0AsFalse))   .getAmountOfCall()); }
                @DisplayName("2 fields: (int, T) → true")  @Test void test2_2True()  { assertEquals(1, newInstance(AB)   .execute(it ->                              it.findLastIndexed(callback2AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("2 fields: (int) → true")     @Test void test2_1True()  { assertEquals(1, newInstance(AB)   .execute(it ->                              it.findLastIndexed(callback1AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("2 fields: () → true")        @Test void test2_0True()  { assertEquals(1, newInstance(AB)   .execute(it ->                              it.findLastIndexed(callback0AsTrue))    .getAmountOfCall()); }
                @DisplayName("2 fields: (int, T) → false") @Test void test2_2False() { assertEquals(2, newInstance(AB)   .executeWhileExpectingIndexOutOfBound(it -> it.findLastIndexed(callback2AltAsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields: (int) → false")    @Test void test2_1False() { assertEquals(0, newInstance(AB)   .executeWhileExpectingIndexOutOfBound(it -> it.findLastIndexed(callback1AltAsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields: () → false")       @Test void test2_0False() { assertEquals(0, newInstance(AB)   .executeWhileExpectingIndexOutOfBound(it -> it.findLastIndexed(callback0AsFalse))   .getAmountOfCall()); }
                @DisplayName("4 fields: (int, T) → true")  @Test void test4_2True()  { assertEquals(1, newInstance(ABCD) .execute(it ->                              it.findLastIndexed(callback2AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("4 fields: (int) → true")     @Test void test4_1True()  { assertEquals(1, newInstance(ABCD) .execute(it ->                              it.findLastIndexed(callback1AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("4 fields: () → true")        @Test void test4_0True()  { assertEquals(1, newInstance(ABCD) .execute(it ->                              it.findLastIndexed(callback0AsTrue))    .getAmountOfCall()); }
                @DisplayName("4 fields: (int, T) → false") @Test void test4_2False() { assertEquals(4, newInstance(ABCD) .executeWhileExpectingIndexOutOfBound(it -> it.findLastIndexed(callback2AltAsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields: (int) → false")    @Test void test4_1False() { assertEquals(0, newInstance(ABCD) .executeWhileExpectingIndexOutOfBound(it -> it.findLastIndexed(callback1AltAsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields: () → false")       @Test void test4_0False() { assertEquals(0, newInstance(ABCD) .executeWhileExpectingIndexOutOfBound(it -> it.findLastIndexed(callback0AsFalse))   .getAmountOfCall()); }
            }
            @Nested class findLastIndexedOrNull {
                @DisplayName("empty: (int, T) → boolean")  @Test void empty_2Arg()   { assertEquals(0, newInstance(EMPTY).execute(it -> it.findLastIndexedOrNull(predicate2AltAsFail)).getAmountOfCall()); }
                @DisplayName("empty: (int) → boolean")     @Test void empty_1Arg()   { assertEquals(0, newInstance(EMPTY).execute(it -> it.findLastIndexedOrNull(predicate1AltAsFail)).getAmountOfCall()); }
                @DisplayName("empty: () → boolean")        @Test void empty_0Arg()   { assertEquals(0, newInstance(EMPTY).execute(it -> it.findLastIndexedOrNull(predicate0AsFail))   .getAmountOfCall()); }
                @DisplayName("1 field: (int, T) → true")   @Test void test1_2True()  { assertEquals(1, newInstance(A)    .execute(it -> it.findLastIndexedOrNull(callback2AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("1 field: (int) → true")      @Test void test1_1True()  { assertEquals(1, newInstance(A)    .execute(it -> it.findLastIndexedOrNull(callback1AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("1 field: () → true")         @Test void test1_0True()  { assertEquals(1, newInstance(A)    .execute(it -> it.findLastIndexedOrNull(callback0AsTrue))    .getAmountOfCall()); }
                @DisplayName("1 field: (int, T) → false")  @Test void test1_2False() { assertEquals(1, newInstance(A)    .execute(it -> it.findLastIndexedOrNull(callback2AltAsFalse)).getAmountOfCall()); }
                @DisplayName("1 field: (int) → false")     @Test void test1_1False() { assertEquals(0, newInstance(A)    .execute(it -> it.findLastIndexedOrNull(callback1AltAsFalse)).getAmountOfCall()); }
                @DisplayName("1 field: () → false")        @Test void test1_0False() { assertEquals(0, newInstance(A)    .execute(it -> it.findLastIndexedOrNull(callback0AsFalse))   .getAmountOfCall()); }
                @DisplayName("2 fields: (int, T) → true")  @Test void test2_2True()  { assertEquals(1, newInstance(AB)   .execute(it -> it.findLastIndexedOrNull(callback2AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("2 fields: (int) → true")     @Test void test2_1True()  { assertEquals(1, newInstance(AB)   .execute(it -> it.findLastIndexedOrNull(callback1AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("2 fields: () → true")        @Test void test2_0True()  { assertEquals(1, newInstance(AB)   .execute(it -> it.findLastIndexedOrNull(callback0AsTrue))    .getAmountOfCall()); }
                @DisplayName("2 fields: (int, T) → false") @Test void test2_2False() { assertEquals(2, newInstance(AB)   .execute(it -> it.findLastIndexedOrNull(callback2AltAsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields: (int) → false")    @Test void test2_1False() { assertEquals(0, newInstance(AB)   .execute(it -> it.findLastIndexedOrNull(callback1AltAsFalse)).getAmountOfCall()); }
                @DisplayName("2 fields: () → false")       @Test void test2_0False() { assertEquals(0, newInstance(AB)   .execute(it -> it.findLastIndexedOrNull(callback0AsFalse))   .getAmountOfCall()); }
                @DisplayName("4 fields: (int, T) → true")  @Test void test4_2True()  { assertEquals(1, newInstance(ABCD) .execute(it -> it.findLastIndexedOrNull(callback2AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("4 fields: (int) → true")     @Test void test4_1True()  { assertEquals(1, newInstance(ABCD) .execute(it -> it.findLastIndexedOrNull(callback1AltAsTrue)) .getAmountOfCall()); }
                @DisplayName("4 fields: () → true")        @Test void test4_0True()  { assertEquals(1, newInstance(ABCD) .execute(it -> it.findLastIndexedOrNull(callback0AsTrue))    .getAmountOfCall()); }
                @DisplayName("4 fields: (int, T) → false") @Test void test4_2False() { assertEquals(4, newInstance(ABCD) .execute(it -> it.findLastIndexedOrNull(callback2AltAsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields: (int) → false")    @Test void test4_1False() { assertEquals(0, newInstance(ABCD) .execute(it -> it.findLastIndexedOrNull(callback1AltAsFalse)).getAmountOfCall()); }
                @DisplayName("4 fields: () → false")       @Test void test4_0False() { assertEquals(0, newInstance(ABCD) .execute(it -> it.findLastIndexedOrNull(callback0AsFalse))   .getAmountOfCall()); }
            }

        }

        @TestInstance(PER_CLASS) @Nested class findFirst {
            @Nested class empty {
                @DisplayName("(T, int) → boolean")  @Test void test2Arg() { assertThrowsExactly(emptyExceptionClass(), () -> newInstance(EMPTY).findFirst(predicate2AsFail)); }
                @DisplayName("(T) → boolean")       @Test void test1Arg() { assertThrowsExactly(emptyExceptionClass(), () -> newInstance(EMPTY).findFirst(predicate1AsFail)); }
                @DisplayName("() → boolean")        @Test void test0Arg() { assertThrowsExactly(emptyExceptionClass(), () -> newInstance(EMPTY).findFirst(predicate0AsFail)); }
            }
            @DisplayName("boolean callbacks") @TestInstance(PER_CLASS) @Nested class BooleanCallbacks {
                @DisplayName("1 field: (T, int) → true")   @Test void test1_2True()  { assertSame(A[0],                                           newInstance(A)   .findFirst(callback2AsTrue)); }
                @DisplayName("1 field: (T) → true")        @Test void test1_1True()  { assertSame(A[0],                                           newInstance(A)   .findFirst(callback1AsTrue)); }
                @DisplayName("1 field: () → true")         @Test void test1_0True()  { assertSame(A[0],                                           newInstance(A)   .findFirst(callback0AsTrue)); }
                @DisplayName("1 field: (T, int) → false")  @Test void test1_2False() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A)   .findFirst(callback2AsFalse)); }
                @DisplayName("1 field: (T) → false")       @Test void test1_1False() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A)   .findFirst(callback1AsFalse)); }
                @DisplayName("1 field: () → false")        @Test void test1_0False() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A)   .findFirst(callback0AsFalse)); }
                @DisplayName("2 fields: (T, int) → true")  @Test void test2_2True()  { assertSame(AB[0],                                          newInstance(AB)  .findFirst(callback2AsTrue)); }
                @DisplayName("2 fields: (T) → true")       @Test void test2_1True()  { assertSame(AB[0],                                          newInstance(AB)  .findFirst(callback1AsTrue)); }
                @DisplayName("2 fields: () → true")        @Test void test2_0True()  { assertSame(AB[0],                                          newInstance(AB)  .findFirst(callback0AsTrue)); }
                @DisplayName("2 fields: (T, int) → false") @Test void test2_2False() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB)  .findFirst(callback2AsFalse)); }
                @DisplayName("2 fields: (T) → false")      @Test void test2_1False() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB)  .findFirst(callback1AsFalse)); }
                @DisplayName("2 fields: () → false")       @Test void test2_0False() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB)  .findFirst(callback0AsFalse)); }
                @DisplayName("4 fields: (T, int) → true")  @Test void test4_2True()  { assertSame(ABCD[0],                                        newInstance(ABCD).findFirst(callback2AsTrue)); }
                @DisplayName("4 fields: (T) → true")       @Test void test4_1True()  { assertSame(ABCD[0],                                        newInstance(ABCD).findFirst(callback1AsTrue)); }
                @DisplayName("4 fields: () → true")        @Test void test4_0True()  { assertSame(ABCD[0],                                        newInstance(ABCD).findFirst(callback0AsTrue)); }
                @DisplayName("4 fields: (T, int) → false") @Test void test4_2False() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).findFirst(callback2AsFalse)); }
                @DisplayName("4 fields: (T) → false")      @Test void test4_1False() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).findFirst(callback1AsFalse)); }
                @DisplayName("4 fields: () → false")       @Test void test4_0False() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).findFirst(callback0AsFalse)); }
            }
            @DisplayName("1 field") @Nested class Test1 {
                                  @Test void a()     { assertSame(A[0],                                           newInstance(A).findFirst(callbackIsA)); }
                                  @Test void e()     { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).findFirst(callbackIsE)); }
                                  @Test void even()  { assertSame(A[0],                                           newInstance(A).findFirst(callbackIsEvenAlt)); }
                                  @Test void odd()   { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).findFirst(callbackIsOddAlt)); }
                @DisplayName("0") @Test void test0() { assertSame(A[0],                                           newInstance(A).findFirst(callbackIs0Alt)); }
                @DisplayName("4") @Test void test4() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).findFirst(callbackIs4Alt)); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                                  @Test void a()     { assertSame(AB[0],                                          newInstance(AB).findFirst(callbackIsA)); }
                                  @Test void b()     { assertSame(AB[1],                                          newInstance(AB).findFirst(callbackIsB)); }
                                  @Test void e()     { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB).findFirst(callbackIsE)); }
                                  @Test void even()  { assertSame(AB[0],                                          newInstance(AB).findFirst(callbackIsEvenAlt)); }
                                  @Test void odd()   { assertSame(AB[1],                                          newInstance(AB).findFirst(callbackIsOddAlt)); }
                @DisplayName("0") @Test void test0() { assertSame(AB[0],                                          newInstance(AB).findFirst(callbackIs0Alt)); }
                @DisplayName("1") @Test void test1() { assertSame(AB[1],                                          newInstance(AB).findFirst(callbackIs1Alt)); }
                @DisplayName("4") @Test void test4() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB).findFirst(callbackIs4Alt)); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                                  @Test void a()     { assertSame(ABCD[0],                                        newInstance(ABCD).findFirst(callbackIsA)); }
                                  @Test void b()     { assertSame(ABCD[1],                                        newInstance(ABCD).findFirst(callbackIsB)); }
                                  @Test void c()     { assertSame(ABCD[2],                                        newInstance(ABCD).findFirst(callbackIsC)); }
                                  @Test void d()     { assertSame(ABCD[3],                                        newInstance(ABCD).findFirst(callbackIsD)); }
                                  @Test void e()     { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).findFirst(callbackIsE)); }
                                  @Test void even()  { assertSame(ABCD[0],                                        newInstance(ABCD).findFirst(callbackIsEvenAlt)); }
                                  @Test void odd()   { assertSame(ABCD[1],                                        newInstance(ABCD).findFirst(callbackIsOddAlt)); }
                @DisplayName("0") @Test void test0() { assertSame(ABCD[0],                                        newInstance(ABCD).findFirst(callbackIs0Alt)); }
                @DisplayName("1") @Test void test1() { assertSame(ABCD[1],                                        newInstance(ABCD).findFirst(callbackIs1Alt)); }
                @DisplayName("2") @Test void test2() { assertSame(ABCD[2],                                        newInstance(ABCD).findFirst(callbackIs2Alt)); }
                @DisplayName("3") @Test void test3() { assertSame(ABCD[3],                                        newInstance(ABCD).findFirst(callbackIs3Alt)); }
                @DisplayName("4") @Test void test4() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).findFirst(callbackIs4Alt)); }
            }
        }
        @TestInstance(PER_CLASS) @Nested class findFirstOrNull {
            @Nested class empty {
                @DisplayName("(T, int) → boolean")  @Test void test2Arg() { assertNull(newInstance(EMPTY).findFirstOrNull(predicate2AsFail)); }
                @DisplayName("(T) → boolean")       @Test void test1Arg() { assertNull(newInstance(EMPTY).findFirstOrNull(predicate1AsFail)); }
                @DisplayName("() → boolean")        @Test void test0Arg() { assertNull(newInstance(EMPTY).findFirstOrNull(predicate0AsFail)); }
            }
            @DisplayName("boolean callbacks") @TestInstance(PER_CLASS) @Nested class BooleanCallbacks {
                @DisplayName("1 field: (T, int) → true")   @Test void test1_2True()  { assertSame(A[0],    newInstance(A)   .findFirstOrNull(callback2AsTrue)); }
                @DisplayName("1 field: (T) → true")        @Test void test1_1True()  { assertSame(A[0],    newInstance(A)   .findFirstOrNull(callback1AsTrue)); }
                @DisplayName("1 field: () → true")         @Test void test1_0True()  { assertSame(A[0],    newInstance(A)   .findFirstOrNull(callback0AsTrue)); }
                @DisplayName("1 field: (T, int) → false")  @Test void test1_2False() { assertNull(         newInstance(A)   .findFirstOrNull(callback2AsFalse)); }
                @DisplayName("1 field: (T) → false")       @Test void test1_1False() { assertNull(         newInstance(A)   .findFirstOrNull(callback1AsFalse)); }
                @DisplayName("1 field: () → false")        @Test void test1_0False() { assertNull(         newInstance(A)   .findFirstOrNull(callback0AsFalse)); }
                @DisplayName("2 fields: (T, int) → true")  @Test void test2_2True()  { assertSame(AB[0],   newInstance(AB)  .findFirstOrNull(callback2AsTrue)); }
                @DisplayName("2 fields: (T) → true")       @Test void test2_1True()  { assertSame(AB[0],   newInstance(AB)  .findFirstOrNull(callback1AsTrue)); }
                @DisplayName("2 fields: () → true")        @Test void test2_0True()  { assertSame(AB[0],   newInstance(AB)  .findFirstOrNull(callback0AsTrue)); }
                @DisplayName("2 fields: (T, int) → false") @Test void test2_2False() { assertNull(         newInstance(AB)  .findFirstOrNull(callback2AsFalse)); }
                @DisplayName("2 fields: (T) → false")      @Test void test2_1False() { assertNull(         newInstance(AB)  .findFirstOrNull(callback1AsFalse)); }
                @DisplayName("2 fields: () → false")       @Test void test2_0False() { assertNull(         newInstance(AB)  .findFirstOrNull(callback0AsFalse)); }
                @DisplayName("4 fields: (T, int) → true")  @Test void test4_2True()  { assertSame(ABCD[0], newInstance(ABCD).findFirstOrNull(callback2AsTrue)); }
                @DisplayName("4 fields: (T) → true")       @Test void test4_1True()  { assertSame(ABCD[0], newInstance(ABCD).findFirstOrNull(callback1AsTrue)); }
                @DisplayName("4 fields: () → true")        @Test void test4_0True()  { assertSame(ABCD[0], newInstance(ABCD).findFirstOrNull(callback0AsTrue)); }
                @DisplayName("4 fields: (T, int) → false") @Test void test4_2False() { assertNull(         newInstance(ABCD).findFirstOrNull(callback2AsFalse)); }
                @DisplayName("4 fields: (T) → false")      @Test void test4_1False() { assertNull(         newInstance(ABCD).findFirstOrNull(callback1AsFalse)); }
                @DisplayName("4 fields: () → false")       @Test void test4_0False() { assertNull(         newInstance(ABCD).findFirstOrNull(callback0AsFalse)); }
            }
            @DisplayName("1 field") @Nested class Test1 {
                                  @Test void a()     { assertSame(A[0], newInstance(A).findFirstOrNull(callbackIsA)); }
                                  @Test void e()     { assertNull(      newInstance(A).findFirstOrNull(callbackIsE)); }
                                  @Test void even()  { assertSame(A[0], newInstance(A).findFirstOrNull(callbackIsEvenAlt)); }
                                  @Test void odd()   { assertNull(      newInstance(A).findFirstOrNull(callbackIsOddAlt)); }
                @DisplayName("0") @Test void test0() { assertSame(A[0], newInstance(A).findFirstOrNull(callbackIs0Alt)); }
                @DisplayName("4") @Test void test4() { assertNull(      newInstance(A).findFirstOrNull(callbackIs4Alt)); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                                  @Test void a()     { assertSame(AB[0], newInstance(AB).findFirstOrNull(callbackIsA)); }
                                  @Test void b()     { assertSame(AB[1], newInstance(AB).findFirstOrNull(callbackIsB)); }
                                  @Test void e()     { assertNull(       newInstance(AB).findFirstOrNull(callbackIsE)); }
                                  @Test void even()  { assertSame(AB[0], newInstance(AB).findFirstOrNull(callbackIsEvenAlt)); }
                                  @Test void odd()   { assertSame(AB[1], newInstance(AB).findFirstOrNull(callbackIsOddAlt)); }
                @DisplayName("0") @Test void test0() { assertSame(AB[0], newInstance(AB).findFirstOrNull(callbackIs0Alt)); }
                @DisplayName("1") @Test void test1() { assertSame(AB[1], newInstance(AB).findFirstOrNull(callbackIs1Alt)); }
                @DisplayName("4") @Test void test4() { assertNull(       newInstance(AB).findFirstOrNull(callbackIs4Alt)); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                                  @Test void a()     { assertSame(ABCD[0], newInstance(ABCD).findFirstOrNull(callbackIsA)); }
                                  @Test void b()     { assertSame(ABCD[1], newInstance(ABCD).findFirstOrNull(callbackIsB)); }
                                  @Test void c()     { assertSame(ABCD[2], newInstance(ABCD).findFirstOrNull(callbackIsC)); }
                                  @Test void d()     { assertSame(ABCD[3], newInstance(ABCD).findFirstOrNull(callbackIsD)); }
                                  @Test void e()     { assertNull(         newInstance(ABCD).findFirstOrNull(callbackIsE)); }
                                  @Test void even()  { assertSame(ABCD[0], newInstance(ABCD).findFirstOrNull(callbackIsEvenAlt)); }
                                  @Test void odd()   { assertSame(ABCD[1], newInstance(ABCD).findFirstOrNull(callbackIsOddAlt)); }
                @DisplayName("0") @Test void test0() { assertSame(ABCD[0], newInstance(ABCD).findFirstOrNull(callbackIs0Alt)); }
                @DisplayName("1") @Test void test1() { assertSame(ABCD[1], newInstance(ABCD).findFirstOrNull(callbackIs1Alt)); }
                @DisplayName("2") @Test void test2() { assertSame(ABCD[2], newInstance(ABCD).findFirstOrNull(callbackIs2Alt)); }
                @DisplayName("3") @Test void test3() { assertSame(ABCD[3], newInstance(ABCD).findFirstOrNull(callbackIs3Alt)); }
                @DisplayName("4") @Test void test4() { assertNull(         newInstance(ABCD).findFirstOrNull(callbackIs4Alt)); }
            }
        }
        @TestInstance(PER_CLASS) @Nested class findFirstIndexed {
            @Nested class empty {
                @DisplayName("(T, int) → boolean")  @Test void test2Arg() { assertThrowsExactly(emptyExceptionClass(), () -> newInstance(EMPTY).findFirstIndexed(predicate2AltAsFail)); }
                @DisplayName("(T) → boolean")       @Test void test1Arg() { assertThrowsExactly(emptyExceptionClass(), () -> newInstance(EMPTY).findFirstIndexed(predicate1AltAsFail)); }
                @DisplayName("() → boolean")        @Test void test0Arg() { assertThrowsExactly(emptyExceptionClass(), () -> newInstance(EMPTY).findFirstIndexed(predicate0AsFail)); }
            }
            @DisplayName("boolean callbacks") @TestInstance(PER_CLASS) @Nested class BooleanCallbacks {
                @DisplayName("1 field: (T, int) → true")   @Test void test1_2True()  { assertSame(A[0],                                           newInstance(A)   .findFirstIndexed(callback2AltAsTrue)); }
                @DisplayName("1 field: (T) → true")        @Test void test1_1True()  { assertSame(A[0],                                           newInstance(A)   .findFirstIndexed(callback1AltAsTrue)); }
                @DisplayName("1 field: () → true")         @Test void test1_0True()  { assertSame(A[0],                                           newInstance(A)   .findFirstIndexed(callback0AsTrue)); }
                @DisplayName("1 field: (T, int) → false")  @Test void test1_2False() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A)   .findFirstIndexed(callback2AltAsFalse)); }
                @DisplayName("1 field: (T) → false")       @Test void test1_1False() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A)   .findFirstIndexed(callback1AltAsFalse)); }
                @DisplayName("1 field: () → false")        @Test void test1_0False() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A)   .findFirstIndexed(callback0AsFalse)); }
                @DisplayName("2 fields: (T, int) → true")  @Test void test2_2True()  { assertSame(AB[0],                                          newInstance(AB)  .findFirstIndexed(callback2AltAsTrue)); }
                @DisplayName("2 fields: (T) → true")       @Test void test2_1True()  { assertSame(AB[0],                                          newInstance(AB)  .findFirstIndexed(callback1AltAsTrue)); }
                @DisplayName("2 fields: () → true")        @Test void test2_0True()  { assertSame(AB[0],                                          newInstance(AB)  .findFirstIndexed(callback0AsTrue)); }
                @DisplayName("2 fields: (T, int) → false") @Test void test2_2False() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB)  .findFirstIndexed(callback2AltAsFalse)); }
                @DisplayName("2 fields: (T) → false")      @Test void test2_1False() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB)  .findFirstIndexed(callback1AltAsFalse)); }
                @DisplayName("2 fields: () → false")       @Test void test2_0False() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB)  .findFirstIndexed(callback0AsFalse)); }
                @DisplayName("4 fields: (T, int) → true")  @Test void test4_2True()  { assertSame(ABCD[0],                                        newInstance(ABCD).findFirstIndexed(callback2AltAsTrue)); }
                @DisplayName("4 fields: (T) → true")       @Test void test4_1True()  { assertSame(ABCD[0],                                        newInstance(ABCD).findFirstIndexed(callback1AltAsTrue)); }
                @DisplayName("4 fields: () → true")        @Test void test4_0True()  { assertSame(ABCD[0],                                        newInstance(ABCD).findFirstIndexed(callback0AsTrue)); }
                @DisplayName("4 fields: (T, int) → false") @Test void test4_2False() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).findFirstIndexed(callback2AltAsFalse)); }
                @DisplayName("4 fields: (T) → false")      @Test void test4_1False() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).findFirstIndexed(callback1AltAsFalse)); }
                @DisplayName("4 fields: () → false")       @Test void test4_0False() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).findFirstIndexed(callback0AsFalse)); }
            }
            @DisplayName("1 field") @Nested class Test1 {
                                  @Test void a()     { assertSame(A[0],                                           newInstance(A).findFirstIndexed(callbackIsAAlt)); }
                                  @Test void e()     { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).findFirstIndexed(callbackIsEAlt)); }
                                  @Test void even()  { assertSame(A[0],                                           newInstance(A).findFirstIndexed(callbackIsEven)); }
                                  @Test void odd()   { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).findFirstIndexed(callbackIsOdd)); }
                @DisplayName("0") @Test void test0() { assertSame(A[0],                                           newInstance(A).findFirstIndexed(callbackIs0)); }
                @DisplayName("4") @Test void test4() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).findFirstIndexed(callbackIs4)); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                                  @Test void a()     { assertSame(AB[0],                                          newInstance(AB).findFirstIndexed(callbackIsAAlt)); }
                                  @Test void b()     { assertSame(AB[1],                                          newInstance(AB).findFirstIndexed(callbackIsBAlt)); }
                                  @Test void e()     { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB).findFirstIndexed(callbackIsEAlt)); }
                                  @Test void even()  { assertSame(AB[0],                                          newInstance(AB).findFirstIndexed(callbackIsEven)); }
                                  @Test void odd()   { assertSame(AB[1],                                          newInstance(AB).findFirstIndexed(callbackIsOdd)); }
                @DisplayName("0") @Test void test0() { assertSame(AB[0],                                          newInstance(AB).findFirstIndexed(callbackIs0)); }
                @DisplayName("1") @Test void test1() { assertSame(AB[1],                                          newInstance(AB).findFirstIndexed(callbackIs1)); }
                @DisplayName("4") @Test void test4() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB).findFirstIndexed(callbackIs4)); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                                  @Test void a()     { assertSame(ABCD[0],                                        newInstance(ABCD).findFirstIndexed(callbackIsAAlt)); }
                                  @Test void b()     { assertSame(ABCD[1],                                        newInstance(ABCD).findFirstIndexed(callbackIsBAlt)); }
                                  @Test void c()     { assertSame(ABCD[2],                                        newInstance(ABCD).findFirstIndexed(callbackIsCAlt)); }
                                  @Test void d()     { assertSame(ABCD[3],                                        newInstance(ABCD).findFirstIndexed(callbackIsDAlt)); }
                                  @Test void e()     { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).findFirstIndexed(callbackIsEAlt)); }
                                  @Test void even()  { assertSame(ABCD[0],                                        newInstance(ABCD).findFirstIndexed(callbackIsEven)); }
                                  @Test void odd()   { assertSame(ABCD[1],                                        newInstance(ABCD).findFirstIndexed(callbackIsOdd)); }
                @DisplayName("0") @Test void test0() { assertSame(ABCD[0],                                        newInstance(ABCD).findFirstIndexed(callbackIs0)); }
                @DisplayName("1") @Test void test1() { assertSame(ABCD[1],                                        newInstance(ABCD).findFirstIndexed(callbackIs1)); }
                @DisplayName("2") @Test void test2() { assertSame(ABCD[2],                                        newInstance(ABCD).findFirstIndexed(callbackIs2)); }
                @DisplayName("3") @Test void test3() { assertSame(ABCD[3],                                        newInstance(ABCD).findFirstIndexed(callbackIs3)); }
                @DisplayName("4") @Test void test4() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).findFirstIndexed(callbackIs4)); }
            }
        }
        @TestInstance(PER_CLASS) @Nested class findFirstIndexedOrNull {
            @Nested class empty {
                @DisplayName("(T, int) → boolean")  @Test void test2Arg() { assertNull(newInstance(EMPTY).findFirstIndexedOrNull(predicate2AltAsFail)); }
                @DisplayName("(T) → boolean")       @Test void test1Arg() { assertNull(newInstance(EMPTY).findFirstIndexedOrNull(predicate1AltAsFail)); }
                @DisplayName("() → boolean")        @Test void test0Arg() { assertNull(newInstance(EMPTY).findFirstIndexedOrNull(predicate0AsFail)); }
            }
            @DisplayName("boolean callbacks") @TestInstance(PER_CLASS) @Nested class BooleanCallbacks {
                @DisplayName("1 field: (T, int) → true")   @Test void test1_2True()  { assertSame(A[0],    newInstance(A)   .findFirstIndexedOrNull(callback2AltAsTrue)); }
                @DisplayName("1 field: (T) → true")        @Test void test1_1True()  { assertSame(A[0],    newInstance(A)   .findFirstIndexedOrNull(callback1AltAsTrue)); }
                @DisplayName("1 field: () → true")         @Test void test1_0True()  { assertSame(A[0],    newInstance(A)   .findFirstIndexedOrNull(callback0AsTrue)); }
                @DisplayName("1 field: (T, int) → false")  @Test void test1_2False() { assertNull(         newInstance(A)   .findFirstIndexedOrNull(callback2AltAsFalse)); }
                @DisplayName("1 field: (T) → false")       @Test void test1_1False() { assertNull(         newInstance(A)   .findFirstIndexedOrNull(callback1AltAsFalse)); }
                @DisplayName("1 field: () → false")        @Test void test1_0False() { assertNull(         newInstance(A)   .findFirstIndexedOrNull(callback0AsFalse)); }
                @DisplayName("2 fields: (T, int) → true")  @Test void test2_2True()  { assertSame(AB[0],   newInstance(AB)  .findFirstIndexedOrNull(callback2AltAsTrue)); }
                @DisplayName("2 fields: (T) → true")       @Test void test2_1True()  { assertSame(AB[0],   newInstance(AB)  .findFirstIndexedOrNull(callback1AltAsTrue)); }
                @DisplayName("2 fields: () → true")        @Test void test2_0True()  { assertSame(AB[0],   newInstance(AB)  .findFirstIndexedOrNull(callback0AsTrue)); }
                @DisplayName("2 fields: (T, int) → false") @Test void test2_2False() { assertNull(         newInstance(AB)  .findFirstIndexedOrNull(callback2AltAsFalse)); }
                @DisplayName("2 fields: (T) → false")      @Test void test2_1False() { assertNull(         newInstance(AB)  .findFirstIndexedOrNull(callback1AltAsFalse)); }
                @DisplayName("2 fields: () → false")       @Test void test2_0False() { assertNull(         newInstance(AB)  .findFirstIndexedOrNull(callback0AsFalse)); }
                @DisplayName("4 fields: (T, int) → true")  @Test void test4_2True()  { assertSame(ABCD[0], newInstance(ABCD).findFirstIndexedOrNull(callback2AltAsTrue)); }
                @DisplayName("4 fields: (T) → true")       @Test void test4_1True()  { assertSame(ABCD[0], newInstance(ABCD).findFirstIndexedOrNull(callback1AltAsTrue)); }
                @DisplayName("4 fields: () → true")        @Test void test4_0True()  { assertSame(ABCD[0], newInstance(ABCD).findFirstIndexedOrNull(callback0AsTrue)); }
                @DisplayName("4 fields: (T, int) → false") @Test void test4_2False() { assertNull(         newInstance(ABCD).findFirstIndexedOrNull(callback2AltAsFalse)); }
                @DisplayName("4 fields: (T) → false")      @Test void test4_1False() { assertNull(         newInstance(ABCD).findFirstIndexedOrNull(callback1AltAsFalse)); }
                @DisplayName("4 fields: () → false")       @Test void test4_0False() { assertNull(         newInstance(ABCD).findFirstIndexedOrNull(callback0AsFalse)); }
            }
            @DisplayName("1 field") @Nested class Test1 {
                                  @Test void a()     { assertSame(A[0], newInstance(A).findFirstIndexedOrNull(callbackIsAAlt)); }
                                  @Test void e()     { assertNull(      newInstance(A).findFirstIndexedOrNull(callbackIsEAlt)); }
                                  @Test void even()  { assertSame(A[0], newInstance(A).findFirstIndexedOrNull(callbackIsEven)); }
                                  @Test void odd()   { assertNull(      newInstance(A).findFirstIndexedOrNull(callbackIsOdd)); }
                @DisplayName("0") @Test void test0() { assertSame(A[0], newInstance(A).findFirstIndexedOrNull(callbackIs0)); }
                @DisplayName("4") @Test void test4() { assertNull(      newInstance(A).findFirstIndexedOrNull(callbackIs4)); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                                  @Test void a()     { assertSame(AB[0], newInstance(AB).findFirstIndexedOrNull(callbackIsAAlt)); }
                                  @Test void b()     { assertSame(AB[1], newInstance(AB).findFirstIndexedOrNull(callbackIsBAlt)); }
                                  @Test void e()     { assertNull(       newInstance(AB).findFirstIndexedOrNull(callbackIsEAlt)); }
                                  @Test void even()  { assertSame(AB[0], newInstance(AB).findFirstIndexedOrNull(callbackIsEven)); }
                                  @Test void odd()   { assertSame(AB[1], newInstance(AB).findFirstIndexedOrNull(callbackIsOdd)); }
                @DisplayName("0") @Test void test0() { assertSame(AB[0], newInstance(AB).findFirstIndexedOrNull(callbackIs0)); }
                @DisplayName("1") @Test void test1() { assertSame(AB[1], newInstance(AB).findFirstIndexedOrNull(callbackIs1)); }
                @DisplayName("4") @Test void test4() { assertNull(       newInstance(AB).findFirstIndexedOrNull(callbackIs4)); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                                  @Test void a()     { assertSame(ABCD[0], newInstance(ABCD).findFirstIndexedOrNull(callbackIsAAlt)); }
                                  @Test void b()     { assertSame(ABCD[1], newInstance(ABCD).findFirstIndexedOrNull(callbackIsBAlt)); }
                                  @Test void c()     { assertSame(ABCD[2], newInstance(ABCD).findFirstIndexedOrNull(callbackIsCAlt)); }
                                  @Test void d()     { assertSame(ABCD[3], newInstance(ABCD).findFirstIndexedOrNull(callbackIsDAlt)); }
                                  @Test void e()     { assertNull(         newInstance(ABCD).findFirstIndexedOrNull(callbackIsEAlt)); }
                                  @Test void even()  { assertSame(ABCD[0], newInstance(ABCD).findFirstIndexedOrNull(callbackIsEven)); }
                                  @Test void odd()   { assertSame(ABCD[1], newInstance(ABCD).findFirstIndexedOrNull(callbackIsOdd)); }
                @DisplayName("0") @Test void test0() { assertSame(ABCD[0], newInstance(ABCD).findFirstIndexedOrNull(callbackIs0)); }
                @DisplayName("1") @Test void test1() { assertSame(ABCD[1], newInstance(ABCD).findFirstIndexedOrNull(callbackIs1)); }
                @DisplayName("2") @Test void test2() { assertSame(ABCD[2], newInstance(ABCD).findFirstIndexedOrNull(callbackIs2)); }
                @DisplayName("3") @Test void test3() { assertSame(ABCD[3], newInstance(ABCD).findFirstIndexedOrNull(callbackIs3)); }
                @DisplayName("4") @Test void test4() { assertNull(         newInstance(ABCD).findFirstIndexedOrNull(callbackIs4)); }
            }
        }

        @TestInstance(PER_CLASS) @Nested class findLast {
            @Nested class empty {
                @DisplayName("(T, int) → boolean")  @Test void test2Arg() { assertThrowsExactly(emptyExceptionClass(), () -> newInstance(EMPTY).findLast(predicate2AsFail)); }
                @DisplayName("(T) → boolean")       @Test void test1Arg() { assertThrowsExactly(emptyExceptionClass(), () -> newInstance(EMPTY).findLast(predicate1AsFail)); }
                @DisplayName("() → boolean")        @Test void test0Arg() { assertThrowsExactly(emptyExceptionClass(), () -> newInstance(EMPTY).findLast(predicate0AsFail)); }
            }
            @DisplayName("boolean callbacks") @TestInstance(PER_CLASS) @Nested class BooleanCallbacks {
                @DisplayName("1 field: (T, int) → true")   @Test void test1_2True()  { assertSame(A[0],                                           newInstance(A)   .findLast(callback2AsTrue)); }
                @DisplayName("1 field: (T) → true")        @Test void test1_1True()  { assertSame(A[0],                                           newInstance(A)   .findLast(callback1AsTrue)); }
                @DisplayName("1 field: () → true")         @Test void test1_0True()  { assertSame(A[0],                                           newInstance(A)   .findLast(callback0AsTrue)); }
                @DisplayName("1 field: (T, int) → false")  @Test void test1_2False() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A)   .findLast(callback2AsFalse)); }
                @DisplayName("1 field: (T) → false")       @Test void test1_1False() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A)   .findLast(callback1AsFalse)); }
                @DisplayName("1 field: () → false")        @Test void test1_0False() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A)   .findLast(callback0AsFalse)); }
                @DisplayName("2 fields: (T, int) → true")  @Test void test2_2True()  { assertSame(AB[1],                                          newInstance(AB)  .findLast(callback2AsTrue)); }
                @DisplayName("2 fields: (T) → true")       @Test void test2_1True()  { assertSame(AB[1],                                          newInstance(AB)  .findLast(callback1AsTrue)); }
                @DisplayName("2 fields: () → true")        @Test void test2_0True()  { assertSame(AB[1],                                          newInstance(AB)  .findLast(callback0AsTrue)); }
                @DisplayName("2 fields: (T, int) → false") @Test void test2_2False() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB)  .findLast(callback2AsFalse)); }
                @DisplayName("2 fields: (T) → false")      @Test void test2_1False() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB)  .findLast(callback1AsFalse)); }
                @DisplayName("2 fields: () → false")       @Test void test2_0False() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB)  .findLast(callback0AsFalse)); }
                @DisplayName("4 fields: (T, int) → true")  @Test void test4_2True()  { assertSame(ABCD[3],                                        newInstance(ABCD).findLast(callback2AsTrue)); }
                @DisplayName("4 fields: (T) → true")       @Test void test4_1True()  { assertSame(ABCD[3],                                        newInstance(ABCD).findLast(callback1AsTrue)); }
                @DisplayName("4 fields: () → true")        @Test void test4_0True()  { assertSame(ABCD[3],                                        newInstance(ABCD).findLast(callback0AsTrue)); }
                @DisplayName("4 fields: (T, int) → false") @Test void test4_2False() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).findLast(callback2AsFalse)); }
                @DisplayName("4 fields: (T) → false")      @Test void test4_1False() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).findLast(callback1AsFalse)); }
                @DisplayName("4 fields: () → false")       @Test void test4_0False() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).findLast(callback0AsFalse)); }
            }
            @DisplayName("1 field") @Nested class Test1 {
                                  @Test void a()     { assertSame(A[0],                                           newInstance(A).findLast(callbackIsA)); }
                                  @Test void e()     { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).findLast(callbackIsE)); }
                                  @Test void even()  { assertSame(A[0],                                           newInstance(A).findLast(callbackIsEvenAlt)); }
                                  @Test void odd()   { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).findLast(callbackIsOddAlt)); }
                @DisplayName("0") @Test void test0() { assertSame(A[0],                                           newInstance(A).findLast(callbackIs0Alt)); }
                @DisplayName("4") @Test void test4() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).findLast(callbackIs4Alt)); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                                  @Test void a()     { assertSame(AB[0],                                          newInstance(AB).findLast(callbackIsA)); }
                                  @Test void b()     { assertSame(AB[1],                                          newInstance(AB).findLast(callbackIsB)); }
                                  @Test void e()     { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB).findLast(callbackIsE)); }
                                  @Test void even()  { assertSame(AB[0],                                          newInstance(AB).findLast(callbackIsEvenAlt)); }
                                  @Test void odd()   { assertSame(AB[1],                                          newInstance(AB).findLast(callbackIsOddAlt)); }
                @DisplayName("0") @Test void test0() { assertSame(AB[0],                                          newInstance(AB).findLast(callbackIs0Alt)); }
                @DisplayName("1") @Test void test1() { assertSame(AB[1],                                          newInstance(AB).findLast(callbackIs1Alt)); }
                @DisplayName("4") @Test void test4() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB).findLast(callbackIs4Alt)); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                                  @Test void a()     { assertSame(ABCD[0],                                        newInstance(ABCD).findLast(callbackIsA)); }
                                  @Test void b()     { assertSame(ABCD[1],                                        newInstance(ABCD).findLast(callbackIsB)); }
                                  @Test void c()     { assertSame(ABCD[2],                                        newInstance(ABCD).findLast(callbackIsC)); }
                                  @Test void d()     { assertSame(ABCD[3],                                        newInstance(ABCD).findLast(callbackIsD)); }
                                  @Test void e()     { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).findLast(callbackIsE)); }
                                  @Test void even()  { assertSame(ABCD[2],                                        newInstance(ABCD).findLast(callbackIsEvenAlt)); }
                                  @Test void odd()   { assertSame(ABCD[3],                                        newInstance(ABCD).findLast(callbackIsOddAlt)); }
                @DisplayName("0") @Test void test0() { assertSame(ABCD[0],                                        newInstance(ABCD).findLast(callbackIs0Alt)); }
                @DisplayName("1") @Test void test1() { assertSame(ABCD[1],                                        newInstance(ABCD).findLast(callbackIs1Alt)); }
                @DisplayName("2") @Test void test2() { assertSame(ABCD[2],                                        newInstance(ABCD).findLast(callbackIs2Alt)); }
                @DisplayName("3") @Test void test3() { assertSame(ABCD[3],                                        newInstance(ABCD).findLast(callbackIs3Alt)); }
                @DisplayName("4") @Test void test4() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).findLast(callbackIs4Alt)); }
            }
        }
        @TestInstance(PER_CLASS) @Nested class findLastOrNull {
            @Nested class empty {
                @DisplayName("(T, int) → boolean")  @Test void test2Arg() { assertNull(newInstance(EMPTY).findLastOrNull(predicate2AsFail)); }
                @DisplayName("(T) → boolean")       @Test void test1Arg() { assertNull(newInstance(EMPTY).findLastOrNull(predicate1AsFail)); }
                @DisplayName("() → boolean")        @Test void test0Arg() { assertNull(newInstance(EMPTY).findLastOrNull(predicate0AsFail)); }
            }
            @DisplayName("boolean callbacks") @TestInstance(PER_CLASS) @Nested class BooleanCallbacks {
                @DisplayName("1 field: (T, int) → true")   @Test void test1_2True()  { assertSame(A[0],    newInstance(A)   .findLastOrNull(callback2AsTrue)); }
                @DisplayName("1 field: (T) → true")        @Test void test1_1True()  { assertSame(A[0],    newInstance(A)   .findLastOrNull(callback1AsTrue)); }
                @DisplayName("1 field: () → true")         @Test void test1_0True()  { assertSame(A[0],    newInstance(A)   .findLastOrNull(callback0AsTrue)); }
                @DisplayName("1 field: (T, int) → false")  @Test void test1_2False() { assertNull(         newInstance(A)   .findLastOrNull(callback2AsFalse)); }
                @DisplayName("1 field: (T) → false")       @Test void test1_1False() { assertNull(         newInstance(A)   .findLastOrNull(callback1AsFalse)); }
                @DisplayName("1 field: () → false")        @Test void test1_0False() { assertNull(         newInstance(A)   .findLastOrNull(callback0AsFalse)); }
                @DisplayName("2 fields: (T, int) → true")  @Test void test2_2True()  { assertSame(AB[1],   newInstance(AB)  .findLastOrNull(callback2AsTrue)); }
                @DisplayName("2 fields: (T) → true")       @Test void test2_1True()  { assertSame(AB[1],   newInstance(AB)  .findLastOrNull(callback1AsTrue)); }
                @DisplayName("2 fields: () → true")        @Test void test2_0True()  { assertSame(AB[1],   newInstance(AB)  .findLastOrNull(callback0AsTrue)); }
                @DisplayName("2 fields: (T, int) → false") @Test void test2_2False() { assertNull(         newInstance(AB)  .findLastOrNull(callback2AsFalse)); }
                @DisplayName("2 fields: (T) → false")      @Test void test2_1False() { assertNull(         newInstance(AB)  .findLastOrNull(callback1AsFalse)); }
                @DisplayName("2 fields: () → false")       @Test void test2_0False() { assertNull(         newInstance(AB)  .findLastOrNull(callback0AsFalse)); }
                @DisplayName("4 fields: (T, int) → true")  @Test void test4_2True()  { assertSame(ABCD[3], newInstance(ABCD).findLastOrNull(callback2AsTrue)); }
                @DisplayName("4 fields: (T) → true")       @Test void test4_1True()  { assertSame(ABCD[3], newInstance(ABCD).findLastOrNull(callback1AsTrue)); }
                @DisplayName("4 fields: () → true")        @Test void test4_0True()  { assertSame(ABCD[3], newInstance(ABCD).findLastOrNull(callback0AsTrue)); }
                @DisplayName("4 fields: (T, int) → false") @Test void test4_2False() { assertNull(         newInstance(ABCD).findLastOrNull(callback2AsFalse)); }
                @DisplayName("4 fields: (T) → false")      @Test void test4_1False() { assertNull(         newInstance(ABCD).findLastOrNull(callback1AsFalse)); }
                @DisplayName("4 fields: () → false")       @Test void test4_0False() { assertNull(         newInstance(ABCD).findLastOrNull(callback0AsFalse)); }
            }
            @DisplayName("1 field") @Nested class Test1 {
                                  @Test void a()     { assertSame(A[0], newInstance(A).findLastOrNull(callbackIsA)); }
                                  @Test void e()     { assertNull(      newInstance(A).findLastOrNull(callbackIsE)); }
                                  @Test void even()  { assertSame(A[0], newInstance(A).findLastOrNull(callbackIsEvenAlt)); }
                                  @Test void odd()   { assertNull(      newInstance(A).findLastOrNull(callbackIsOddAlt)); }
                @DisplayName("0") @Test void test0() { assertSame(A[0], newInstance(A).findLastOrNull(callbackIs0Alt)); }
                @DisplayName("4") @Test void test4() { assertNull(      newInstance(A).findLastOrNull(callbackIs4Alt)); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                                  @Test void a()     { assertSame(AB[0], newInstance(AB).findLastOrNull(callbackIsA)); }
                                  @Test void b()     { assertSame(AB[1], newInstance(AB).findLastOrNull(callbackIsB)); }
                                  @Test void e()     { assertNull(       newInstance(AB).findLastOrNull(callbackIsE)); }
                                  @Test void even()  { assertSame(AB[0], newInstance(AB).findLastOrNull(callbackIsEvenAlt)); }
                                  @Test void odd()   { assertSame(AB[1], newInstance(AB).findLastOrNull(callbackIsOddAlt)); }
                @DisplayName("0") @Test void test0() { assertSame(AB[0], newInstance(AB).findLastOrNull(callbackIs0Alt)); }
                @DisplayName("1") @Test void test1() { assertSame(AB[1], newInstance(AB).findLastOrNull(callbackIs1Alt)); }
                @DisplayName("4") @Test void test4() { assertNull(       newInstance(AB).findLastOrNull(callbackIs4Alt)); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                                  @Test void a()     { assertSame(ABCD[0], newInstance(ABCD).findLastOrNull(callbackIsA)); }
                                  @Test void b()     { assertSame(ABCD[1], newInstance(ABCD).findLastOrNull(callbackIsB)); }
                                  @Test void c()     { assertSame(ABCD[2], newInstance(ABCD).findLastOrNull(callbackIsC)); }
                                  @Test void d()     { assertSame(ABCD[3], newInstance(ABCD).findLastOrNull(callbackIsD)); }
                                  @Test void e()     { assertNull(         newInstance(ABCD).findLastOrNull(callbackIsE)); }
                                  @Test void even()  { assertSame(ABCD[2], newInstance(ABCD).findLastOrNull(callbackIsEvenAlt)); }
                                  @Test void odd()   { assertSame(ABCD[3], newInstance(ABCD).findLastOrNull(callbackIsOddAlt)); }
                @DisplayName("0") @Test void test0() { assertSame(ABCD[0], newInstance(ABCD).findLastOrNull(callbackIs0Alt)); }
                @DisplayName("1") @Test void test1() { assertSame(ABCD[1], newInstance(ABCD).findLastOrNull(callbackIs1Alt)); }
                @DisplayName("2") @Test void test2() { assertSame(ABCD[2], newInstance(ABCD).findLastOrNull(callbackIs2Alt)); }
                @DisplayName("3") @Test void test3() { assertSame(ABCD[3], newInstance(ABCD).findLastOrNull(callbackIs3Alt)); }
                @DisplayName("4") @Test void test4() { assertNull(         newInstance(ABCD).findLastOrNull(callbackIs4Alt)); }
            }
        }
        @TestInstance(PER_CLASS) @Nested class findLastIndexed {
            @Nested class empty {
                @DisplayName("(T, int) → boolean")  @Test void test2Arg() { assertThrowsExactly(emptyExceptionClass(), () -> newInstance(EMPTY).findLastIndexed(predicate2AltAsFail)); }
                @DisplayName("(T) → boolean")       @Test void test1Arg() { assertThrowsExactly(emptyExceptionClass(), () -> newInstance(EMPTY).findLastIndexed(predicate1AltAsFail)); }
                @DisplayName("() → boolean")        @Test void test0Arg() { assertThrowsExactly(emptyExceptionClass(), () -> newInstance(EMPTY).findLastIndexed(predicate0AsFail)); }
            }
            @DisplayName("boolean callbacks") @TestInstance(PER_CLASS) @Nested class BooleanCallbacks {
                @DisplayName("1 field: (T, int) → true")   @Test void test1_2True()  { assertSame(A[0],                                           newInstance(A)   .findLastIndexed(callback2AltAsTrue)); }
                @DisplayName("1 field: (T) → true")        @Test void test1_1True()  { assertSame(A[0],                                           newInstance(A)   .findLastIndexed(callback1AltAsTrue)); }
                @DisplayName("1 field: () → true")         @Test void test1_0True()  { assertSame(A[0],                                           newInstance(A)   .findLastIndexed(callback0AsTrue)); }
                @DisplayName("1 field: (T, int) → false")  @Test void test1_2False() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A)   .findLastIndexed(callback2AltAsFalse)); }
                @DisplayName("1 field: (T) → false")       @Test void test1_1False() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A)   .findLastIndexed(callback1AltAsFalse)); }
                @DisplayName("1 field: () → false")        @Test void test1_0False() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A)   .findLastIndexed(callback0AsFalse)); }
                @DisplayName("2 fields: (T, int) → true")  @Test void test2_2True()  { assertSame(AB[1],                                          newInstance(AB)  .findLastIndexed(callback2AltAsTrue)); }
                @DisplayName("2 fields: (T) → true")       @Test void test2_1True()  { assertSame(AB[1],                                          newInstance(AB)  .findLastIndexed(callback1AltAsTrue)); }
                @DisplayName("2 fields: () → true")        @Test void test2_0True()  { assertSame(AB[1],                                          newInstance(AB)  .findLastIndexed(callback0AsTrue)); }
                @DisplayName("2 fields: (T, int) → false") @Test void test2_2False() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB)  .findLastIndexed(callback2AltAsFalse)); }
                @DisplayName("2 fields: (T) → false")      @Test void test2_1False() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB)  .findLastIndexed(callback1AltAsFalse)); }
                @DisplayName("2 fields: () → false")       @Test void test2_0False() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB)  .findLastIndexed(callback0AsFalse)); }
                @DisplayName("4 fields: (T, int) → true")  @Test void test4_2True()  { assertSame(ABCD[3],                                        newInstance(ABCD).findLastIndexed(callback2AltAsTrue)); }
                @DisplayName("4 fields: (T) → true")       @Test void test4_1True()  { assertSame(ABCD[3],                                        newInstance(ABCD).findLastIndexed(callback1AltAsTrue)); }
                @DisplayName("4 fields: () → true")        @Test void test4_0True()  { assertSame(ABCD[3],                                        newInstance(ABCD).findLastIndexed(callback0AsTrue)); }
                @DisplayName("4 fields: (T, int) → false") @Test void test4_2False() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).findLastIndexed(callback2AltAsFalse)); }
                @DisplayName("4 fields: (T) → false")      @Test void test4_1False() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).findLastIndexed(callback1AltAsFalse)); }
                @DisplayName("4 fields: () → false")       @Test void test4_0False() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).findLastIndexed(callback0AsFalse)); }
            }
            @DisplayName("1 field") @Nested class Test1 {
                                  @Test void a()     { assertSame(A[0],                                           newInstance(A).findLastIndexed(callbackIsAAlt)); }
                                  @Test void e()     { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).findLastIndexed(callbackIsEAlt)); }
                                  @Test void even()  { assertSame(A[0],                                           newInstance(A).findLastIndexed(callbackIsEven)); }
                                  @Test void odd()   { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).findLastIndexed(callbackIsOdd)); }
                @DisplayName("0") @Test void test0() { assertSame(A[0],                                           newInstance(A).findLastIndexed(callbackIs0)); }
                @DisplayName("4") @Test void test4() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(A).findLastIndexed(callbackIs4)); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                                  @Test void a()     { assertSame(AB[0],                                          newInstance(AB).findLastIndexed(callbackIsAAlt)); }
                                  @Test void b()     { assertSame(AB[1],                                          newInstance(AB).findLastIndexed(callbackIsBAlt)); }
                                  @Test void e()     { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB).findLastIndexed(callbackIsEAlt)); }
                                  @Test void even()  { assertSame(AB[0],                                          newInstance(AB).findLastIndexed(callbackIsEven)); }
                                  @Test void odd()   { assertSame(AB[1],                                          newInstance(AB).findLastIndexed(callbackIsOdd)); }
                @DisplayName("0") @Test void test0() { assertSame(AB[0],                                          newInstance(AB).findLastIndexed(callbackIs0)); }
                @DisplayName("1") @Test void test1() { assertSame(AB[1],                                          newInstance(AB).findLastIndexed(callbackIs1)); }
                @DisplayName("4") @Test void test4() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(AB).findLastIndexed(callbackIs4)); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                                  @Test void a()     { assertSame(ABCD[0],                                        newInstance(ABCD).findLastIndexed(callbackIsAAlt)); }
                                  @Test void b()     { assertSame(ABCD[1],                                        newInstance(ABCD).findLastIndexed(callbackIsBAlt)); }
                                  @Test void c()     { assertSame(ABCD[2],                                        newInstance(ABCD).findLastIndexed(callbackIsCAlt)); }
                                  @Test void d()     { assertSame(ABCD[3],                                        newInstance(ABCD).findLastIndexed(callbackIsDAlt)); }
                                  @Test void e()     { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).findLastIndexed(callbackIsEAlt)); }
                                  @Test void even()  { assertSame(ABCD[2],                                        newInstance(ABCD).findLastIndexed(callbackIsEven)); }
                                  @Test void odd()   { assertSame(ABCD[3],                                        newInstance(ABCD).findLastIndexed(callbackIsOdd)); }
                @DisplayName("0") @Test void test0() { assertSame(ABCD[0],                                        newInstance(ABCD).findLastIndexed(callbackIs0)); }
                @DisplayName("1") @Test void test1() { assertSame(ABCD[1],                                        newInstance(ABCD).findLastIndexed(callbackIs1)); }
                @DisplayName("2") @Test void test2() { assertSame(ABCD[2],                                        newInstance(ABCD).findLastIndexed(callbackIs2)); }
                @DisplayName("3") @Test void test3() { assertSame(ABCD[3],                                        newInstance(ABCD).findLastIndexed(callbackIs3)); }
                @DisplayName("4") @Test void test4() { assertThrowsExactly(IndexOutOfBoundsException.class, () -> newInstance(ABCD).findLastIndexed(callbackIs4)); }
            }
        }
        @TestInstance(PER_CLASS) @Nested class findLastIndexedOrNull {
            @Nested class empty {
                @DisplayName("(T, int) → boolean")  @Test void test2Arg() { assertNull(newInstance(EMPTY).findLastIndexedOrNull(predicate2AltAsFail)); }
                @DisplayName("(T) → boolean")       @Test void test1Arg() { assertNull(newInstance(EMPTY).findLastIndexedOrNull(predicate1AltAsFail)); }
                @DisplayName("() → boolean")        @Test void test0Arg() { assertNull(newInstance(EMPTY).findLastIndexedOrNull(predicate0AsFail)); }
            }
            @DisplayName("boolean callbacks") @TestInstance(PER_CLASS) @Nested class BooleanCallbacks {
                @DisplayName("1 field: (T, int) → true")   @Test void test1_2True()  { assertSame(A[0],    newInstance(A)   .findLastIndexedOrNull(callback2AltAsTrue)); }
                @DisplayName("1 field: (T) → true")        @Test void test1_1True()  { assertSame(A[0],    newInstance(A)   .findLastIndexedOrNull(callback1AltAsTrue)); }
                @DisplayName("1 field: () → true")         @Test void test1_0True()  { assertSame(A[0],    newInstance(A)   .findLastIndexedOrNull(callback0AsTrue)); }
                @DisplayName("1 field: (T, int) → false")  @Test void test1_2False() { assertNull(         newInstance(A)   .findLastIndexedOrNull(callback2AltAsFalse)); }
                @DisplayName("1 field: (T) → false")       @Test void test1_1False() { assertNull(         newInstance(A)   .findLastIndexedOrNull(callback1AltAsFalse)); }
                @DisplayName("1 field: () → false")        @Test void test1_0False() { assertNull(         newInstance(A)   .findLastIndexedOrNull(callback0AsFalse)); }
                @DisplayName("2 fields: (T, int) → true")  @Test void test2_2True()  { assertSame(AB[1],   newInstance(AB)  .findLastIndexedOrNull(callback2AltAsTrue)); }
                @DisplayName("2 fields: (T) → true")       @Test void test2_1True()  { assertSame(AB[1],   newInstance(AB)  .findLastIndexedOrNull(callback1AltAsTrue)); }
                @DisplayName("2 fields: () → true")        @Test void test2_0True()  { assertSame(AB[1],   newInstance(AB)  .findLastIndexedOrNull(callback0AsTrue)); }
                @DisplayName("2 fields: (T, int) → false") @Test void test2_2False() { assertNull(         newInstance(AB)  .findLastIndexedOrNull(callback2AltAsFalse)); }
                @DisplayName("2 fields: (T) → false")      @Test void test2_1False() { assertNull(         newInstance(AB)  .findLastIndexedOrNull(callback1AltAsFalse)); }
                @DisplayName("2 fields: () → false")       @Test void test2_0False() { assertNull(         newInstance(AB)  .findLastIndexedOrNull(callback0AsFalse)); }
                @DisplayName("4 fields: (T, int) → true")  @Test void test4_2True()  { assertSame(ABCD[3], newInstance(ABCD).findLastIndexedOrNull(callback2AltAsTrue)); }
                @DisplayName("4 fields: (T) → true")       @Test void test4_1True()  { assertSame(ABCD[3], newInstance(ABCD).findLastIndexedOrNull(callback1AltAsTrue)); }
                @DisplayName("4 fields: () → true")        @Test void test4_0True()  { assertSame(ABCD[3], newInstance(ABCD).findLastIndexedOrNull(callback0AsTrue)); }
                @DisplayName("4 fields: (T, int) → false") @Test void test4_2False() { assertNull(         newInstance(ABCD).findLastIndexedOrNull(callback2AltAsFalse)); }
                @DisplayName("4 fields: (T) → false")      @Test void test4_1False() { assertNull(         newInstance(ABCD).findLastIndexedOrNull(callback1AltAsFalse)); }
                @DisplayName("4 fields: () → false")       @Test void test4_0False() { assertNull(         newInstance(ABCD).findLastIndexedOrNull(callback0AsFalse)); }
            }
            @DisplayName("1 field") @Nested class Test1 {
                                  @Test void a()     { assertSame(A[0], newInstance(A).findLastIndexedOrNull(callbackIsAAlt)); }
                                  @Test void e()     { assertNull(      newInstance(A).findLastIndexedOrNull(callbackIsEAlt)); }
                                  @Test void even()  { assertSame(A[0], newInstance(A).findLastIndexedOrNull(callbackIsEven)); }
                                  @Test void odd()   { assertNull(      newInstance(A).findLastIndexedOrNull(callbackIsOdd)); }
                @DisplayName("0") @Test void test0() { assertSame(A[0], newInstance(A).findLastIndexedOrNull(callbackIs0)); }
                @DisplayName("4") @Test void test4() { assertNull(      newInstance(A).findLastIndexedOrNull(callbackIs4)); }
            }
            @DisplayName("2 fields") @Nested class Test2 {
                                  @Test void a()     { assertSame(AB[0], newInstance(AB).findLastIndexedOrNull(callbackIsAAlt)); }
                                  @Test void b()     { assertSame(AB[1], newInstance(AB).findLastIndexedOrNull(callbackIsBAlt)); }
                                  @Test void e()     { assertNull(       newInstance(AB).findLastIndexedOrNull(callbackIsEAlt)); }
                                  @Test void even()  { assertSame(AB[0], newInstance(AB).findLastIndexedOrNull(callbackIsEven)); }
                                  @Test void odd()   { assertSame(AB[1], newInstance(AB).findLastIndexedOrNull(callbackIsOdd)); }
                @DisplayName("0") @Test void test0() { assertSame(AB[0], newInstance(AB).findLastIndexedOrNull(callbackIs0)); }
                @DisplayName("1") @Test void test1() { assertSame(AB[1], newInstance(AB).findLastIndexedOrNull(callbackIs1)); }
                @DisplayName("4") @Test void test4() { assertNull(       newInstance(AB).findLastIndexedOrNull(callbackIs4)); }
            }
            @DisplayName("4 fields") @Nested class Test4 {
                                  @Test void a()     { assertSame(ABCD[0], newInstance(ABCD).findLastIndexedOrNull(callbackIsAAlt)); }
                                  @Test void b()     { assertSame(ABCD[1], newInstance(ABCD).findLastIndexedOrNull(callbackIsBAlt)); }
                                  @Test void c()     { assertSame(ABCD[2], newInstance(ABCD).findLastIndexedOrNull(callbackIsCAlt)); }
                                  @Test void d()     { assertSame(ABCD[3], newInstance(ABCD).findLastIndexedOrNull(callbackIsDAlt)); }
                                  @Test void e()     { assertNull(         newInstance(ABCD).findLastIndexedOrNull(callbackIsEAlt)); }
                                  @Test void even()  { assertSame(ABCD[2], newInstance(ABCD).findLastIndexedOrNull(callbackIsEven)); }
                                  @Test void odd()   { assertSame(ABCD[3], newInstance(ABCD).findLastIndexedOrNull(callbackIsOdd)); }
                @DisplayName("0") @Test void test0() { assertSame(ABCD[0], newInstance(ABCD).findLastIndexedOrNull(callbackIs0)); }
                @DisplayName("1") @Test void test1() { assertSame(ABCD[1], newInstance(ABCD).findLastIndexedOrNull(callbackIs1)); }
                @DisplayName("2") @Test void test2() { assertSame(ABCD[2], newInstance(ABCD).findLastIndexedOrNull(callbackIs2)); }
                @DisplayName("3") @Test void test3() { assertSame(ABCD[3], newInstance(ABCD).findLastIndexedOrNull(callbackIs3)); }
                @DisplayName("4") @Test void test4() { assertNull(         newInstance(ABCD).findLastIndexedOrNull(callbackIs4)); }
            }
        }

    }

}
